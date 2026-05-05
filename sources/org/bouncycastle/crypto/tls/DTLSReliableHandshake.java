package org.bouncycastle.crypto.tls;

import com.biocatch.android.commonsdk.core.Utils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes2.dex */
class DTLSReliableHandshake {
    private static final int MAX_RECEIVE_AHEAD = 10;
    private TlsHandshakeHash handshakeHash;
    private DTLSRecordLayer recordLayer;
    private Hashtable currentInboundFlight = new Hashtable();
    private Hashtable previousInboundFlight = null;
    private Vector outboundFlight = new Vector();
    private boolean sending = true;
    private int message_seq = 0;
    private int next_receive_seq = 0;

    static class Message {
        private final byte[] body;
        private final int message_seq;
        private final short msg_type;

        private Message(int i2, short s2, byte[] bArr) {
            this.message_seq = i2;
            this.msg_type = s2;
            this.body = bArr;
        }

        public byte[] getBody() {
            return this.body;
        }

        public int getSeq() {
            return this.message_seq;
        }

        public short getType() {
            return this.msg_type;
        }
    }

    static class RecordLayerBuffer extends ByteArrayOutputStream {
        RecordLayerBuffer(int i2) {
            super(i2);
        }

        void sendToRecordLayer(DTLSRecordLayer dTLSRecordLayer) throws IOException {
            dTLSRecordLayer.send(this.buf, 0, this.count);
            this.buf = null;
        }
    }

    DTLSReliableHandshake(TlsContext tlsContext, DTLSRecordLayer dTLSRecordLayer) {
        this.recordLayer = dTLSRecordLayer;
        DeferredHash deferredHash = new DeferredHash();
        this.handshakeHash = deferredHash;
        deferredHash.init(tlsContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean checkAll(Hashtable hashtable) {
        Enumeration enumerationElements = hashtable.elements();
        while (enumerationElements.hasMoreElements()) {
            if (((DTLSReassembler) enumerationElements.nextElement()).getBodyIfComplete() == null) {
                return false;
            }
        }
        return true;
    }

    private void checkInboundFlight() {
        Enumeration enumerationKeys = this.currentInboundFlight.keys();
        while (enumerationKeys.hasMoreElements()) {
            ((Integer) enumerationKeys.nextElement()).intValue();
        }
    }

    private void prepareInboundFlight() {
        resetAll(this.currentInboundFlight);
        this.previousInboundFlight = this.currentInboundFlight;
        this.currentInboundFlight = new Hashtable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resendOutboundFlight() throws IOException {
        this.recordLayer.resetWriteEpoch();
        for (int i2 = 0; i2 < this.outboundFlight.size(); i2++) {
            writeMessage((Message) this.outboundFlight.elementAt(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void resetAll(Hashtable hashtable) {
        Enumeration enumerationElements = hashtable.elements();
        while (enumerationElements.hasMoreElements()) {
            ((DTLSReassembler) enumerationElements.nextElement()).reset();
        }
    }

    private Message updateHandshakeMessagesDigest(Message message) throws IOException {
        if (message.getType() != 0) {
            byte[] body = message.getBody();
            byte[] bArr = new byte[12];
            TlsUtils.writeUint8(message.getType(), bArr, 0);
            TlsUtils.writeUint24(body.length, bArr, 1);
            TlsUtils.writeUint16(message.getSeq(), bArr, 4);
            TlsUtils.writeUint24(0, bArr, 6);
            TlsUtils.writeUint24(body.length, bArr, 9);
            this.handshakeHash.update(bArr, 0, 12);
            this.handshakeHash.update(body, 0, body.length);
        }
        return message;
    }

    private void writeHandshakeFragment(Message message, int i2, int i3) throws IOException {
        RecordLayerBuffer recordLayerBuffer = new RecordLayerBuffer(i3 + 12);
        TlsUtils.writeUint8(message.getType(), (OutputStream) recordLayerBuffer);
        TlsUtils.writeUint24(message.getBody().length, recordLayerBuffer);
        TlsUtils.writeUint16(message.getSeq(), recordLayerBuffer);
        TlsUtils.writeUint24(i2, recordLayerBuffer);
        TlsUtils.writeUint24(i3, recordLayerBuffer);
        recordLayerBuffer.write(message.getBody(), i2, i3);
        recordLayerBuffer.sendToRecordLayer(this.recordLayer);
    }

    private void writeMessage(Message message) throws IOException {
        int sendLimit = this.recordLayer.getSendLimit() - 12;
        if (sendLimit < 1) {
            throw new TlsFatalAlert((short) 80);
        }
        int length = message.getBody().length;
        int i2 = 0;
        do {
            int iMin = Math.min(length - i2, sendLimit);
            writeHandshakeFragment(message, i2, iMin);
            i2 += iMin;
        } while (i2 < length);
    }

    void finish() {
        if (this.sending) {
            DTLSHandshakeRetransmit dTLSHandshakeRetransmit = this.currentInboundFlight != null ? new DTLSHandshakeRetransmit() { // from class: org.bouncycastle.crypto.tls.DTLSReliableHandshake.1
                @Override // org.bouncycastle.crypto.tls.DTLSHandshakeRetransmit
                public void receivedHandshakeRecord(int i2, byte[] bArr, int i3, int i4) throws IOException {
                    int uint16;
                    DTLSReassembler dTLSReassembler;
                    if (i4 < 12) {
                        return;
                    }
                    int uint24 = TlsUtils.readUint24(bArr, i3 + 9);
                    if (i4 == uint24 + 12 && (uint16 = TlsUtils.readUint16(bArr, i3 + 4)) < DTLSReliableHandshake.this.next_receive_seq) {
                        short uint8 = TlsUtils.readUint8(bArr, i3);
                        if (i2 != (uint8 == 20 ? 1 : 0)) {
                            return;
                        }
                        int uint242 = TlsUtils.readUint24(bArr, i3 + 1);
                        int uint243 = TlsUtils.readUint24(bArr, i3 + 6);
                        if (uint243 + uint24 <= uint242 && (dTLSReassembler = (DTLSReassembler) DTLSReliableHandshake.this.currentInboundFlight.get(Integers.valueOf(uint16))) != null) {
                            dTLSReassembler.contributeFragment(uint8, uint242, bArr, i3 + 12, uint243, uint24);
                            if (DTLSReliableHandshake.checkAll(DTLSReliableHandshake.this.currentInboundFlight)) {
                                DTLSReliableHandshake.this.resendOutboundFlight();
                                DTLSReliableHandshake.resetAll(DTLSReliableHandshake.this.currentInboundFlight);
                            }
                        }
                    }
                }
            } : null;
            this.recordLayer.handshakeSuccessful(dTLSHandshakeRetransmit);
        }
        checkInboundFlight();
        this.recordLayer.handshakeSuccessful(dTLSHandshakeRetransmit);
    }

    TlsHandshakeHash getHandshakeHash() {
        return this.handshakeHash;
    }

    void notifyHelloComplete() {
        this.handshakeHash = this.handshakeHash.notifyPRFDetermined();
    }

    TlsHandshakeHash prepareToFinish() {
        TlsHandshakeHash tlsHandshakeHash = this.handshakeHash;
        this.handshakeHash = tlsHandshakeHash.stopTracking();
        return tlsHandshakeHash;
    }

    Message receiveMessage() throws IOException {
        int uint16;
        DTLSReassembler dTLSReassembler;
        byte[] bodyIfComplete;
        byte[] bodyIfComplete2;
        if (this.sending) {
            this.sending = false;
            prepareInboundFlight();
        }
        DTLSReassembler dTLSReassembler2 = (DTLSReassembler) this.currentInboundFlight.get(Integers.valueOf(this.next_receive_seq));
        if (dTLSReassembler2 != null && (bodyIfComplete2 = dTLSReassembler2.getBodyIfComplete()) != null) {
            this.previousInboundFlight = null;
            int i2 = this.next_receive_seq;
            this.next_receive_seq = i2 + 1;
            return updateHandshakeMessagesDigest(new Message(i2, dTLSReassembler2.getMsgType(), bodyIfComplete2));
        }
        int iMin = 1000;
        byte[] bArr = null;
        while (true) {
            int receiveLimit = this.recordLayer.getReceiveLimit();
            if (bArr == null || bArr.length < receiveLimit) {
                bArr = new byte[receiveLimit];
            }
            while (true) {
                try {
                    int iReceive = this.recordLayer.receive(bArr, 0, receiveLimit, iMin);
                    if (iReceive < 0) {
                        break;
                    }
                    if (iReceive >= 12) {
                        int uint24 = TlsUtils.readUint24(bArr, 9);
                        if (iReceive == uint24 + 12 && (uint16 = TlsUtils.readUint16(bArr, 4)) <= this.next_receive_seq + 10) {
                            short uint8 = TlsUtils.readUint8(bArr, 0);
                            int uint242 = TlsUtils.readUint24(bArr, 1);
                            int uint243 = TlsUtils.readUint24(bArr, 6);
                            if (uint243 + uint24 <= uint242) {
                                if (uint16 < this.next_receive_seq) {
                                    Hashtable hashtable = this.previousInboundFlight;
                                    if (hashtable != null && (dTLSReassembler = (DTLSReassembler) hashtable.get(Integers.valueOf(uint16))) != null) {
                                        dTLSReassembler.contributeFragment(uint8, uint242, bArr, 12, uint243, uint24);
                                        if (checkAll(this.previousInboundFlight)) {
                                            resendOutboundFlight();
                                            iMin = Math.min(iMin * 2, Utils.miliSecondsInMinute);
                                            resetAll(this.previousInboundFlight);
                                        }
                                    }
                                } else {
                                    DTLSReassembler dTLSReassembler3 = (DTLSReassembler) this.currentInboundFlight.get(Integers.valueOf(uint16));
                                    if (dTLSReassembler3 == null) {
                                        dTLSReassembler3 = new DTLSReassembler(uint8, uint242);
                                        this.currentInboundFlight.put(Integers.valueOf(uint16), dTLSReassembler3);
                                    }
                                    dTLSReassembler3.contributeFragment(uint8, uint242, bArr, 12, uint243, uint24);
                                    if (uint16 == this.next_receive_seq && (bodyIfComplete = dTLSReassembler3.getBodyIfComplete()) != null) {
                                        this.previousInboundFlight = null;
                                        int i3 = this.next_receive_seq;
                                        this.next_receive_seq = i3 + 1;
                                        return updateHandshakeMessagesDigest(new Message(i3, dTLSReassembler3.getMsgType(), bodyIfComplete));
                                    }
                                }
                            }
                        }
                    }
                } catch (IOException unused) {
                }
            }
            resendOutboundFlight();
            iMin = Math.min(iMin * 2, Utils.miliSecondsInMinute);
        }
    }

    byte[] receiveMessageBody(short s2) throws IOException {
        Message messageReceiveMessage = receiveMessage();
        if (messageReceiveMessage.getType() == s2) {
            return messageReceiveMessage.getBody();
        }
        throw new TlsFatalAlert((short) 10);
    }

    void resetHandshakeMessagesDigest() {
        this.handshakeHash.reset();
    }

    void sendMessage(short s2, byte[] bArr) throws IOException {
        TlsUtils.checkUint24(bArr.length);
        if (!this.sending) {
            checkInboundFlight();
            this.sending = true;
            this.outboundFlight.removeAllElements();
        }
        int i2 = this.message_seq;
        this.message_seq = i2 + 1;
        Message message = new Message(i2, s2, bArr);
        this.outboundFlight.addElement(message);
        writeMessage(message);
        updateHandshakeMessagesDigest(message);
    }
}
