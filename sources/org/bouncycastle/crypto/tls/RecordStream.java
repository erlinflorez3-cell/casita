package org.bouncycastle.crypto.tls;

import androidx.core.view.InputDeviceCompat;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
class RecordStream {
    private static int DEFAULT_PLAINTEXT_LIMIT = 16384;
    static final int TLS_HEADER_LENGTH_OFFSET = 3;
    static final int TLS_HEADER_SIZE = 5;
    static final int TLS_HEADER_TYPE_OFFSET = 0;
    static final int TLS_HEADER_VERSION_OFFSET = 1;
    private int ciphertextLimit;
    private int compressedLimit;
    private TlsProtocol handler;
    private InputStream input;
    private OutputStream output;
    private int plaintextLimit;
    private TlsCompression readCompression;
    private TlsCompression writeCompression;
    private TlsCompression pendingCompression = null;
    private TlsCipher pendingCipher = null;
    private TlsCipher readCipher = null;
    private TlsCipher writeCipher = null;
    private long readSeqNo = 0;
    private long writeSeqNo = 0;
    private ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private TlsHandshakeHash handshakeHash = null;
    private ProtocolVersion readVersion = null;
    private ProtocolVersion writeVersion = null;
    private boolean restrictReadVersion = true;

    RecordStream(TlsProtocol tlsProtocol, InputStream inputStream, OutputStream outputStream) {
        this.readCompression = null;
        this.writeCompression = null;
        this.handler = tlsProtocol;
        this.input = inputStream;
        this.output = outputStream;
        TlsNullCompression tlsNullCompression = new TlsNullCompression();
        this.readCompression = tlsNullCompression;
        this.writeCompression = tlsNullCompression;
    }

    private static void checkLength(int i2, int i3, short s2) throws IOException {
        if (i2 > i3) {
            throw new TlsFatalAlert(s2);
        }
    }

    private static void checkType(short s2, short s3) throws IOException {
        switch (s2) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                return;
            default:
                throw new TlsFatalAlert(s3);
        }
    }

    private byte[] getBufferContents() {
        byte[] byteArray = this.buffer.toByteArray();
        this.buffer.reset();
        return byteArray;
    }

    byte[] decodeAndVerify(short s2, InputStream inputStream, int i2) throws IOException {
        checkLength(i2, this.ciphertextLimit, (short) 22);
        byte[] fully = TlsUtils.readFully(i2, inputStream);
        TlsCipher tlsCipher = this.readCipher;
        long j2 = this.readSeqNo;
        this.readSeqNo = 1 + j2;
        byte[] bArrDecodeCiphertext = tlsCipher.decodeCiphertext(j2, s2, fully, 0, fully.length);
        checkLength(bArrDecodeCiphertext.length, this.compressedLimit, (short) 22);
        OutputStream outputStreamDecompress = this.readCompression.decompress(this.buffer);
        if (outputStreamDecompress != this.buffer) {
            outputStreamDecompress.write(bArrDecodeCiphertext, 0, bArrDecodeCiphertext.length);
            outputStreamDecompress.flush();
            bArrDecodeCiphertext = getBufferContents();
        }
        checkLength(bArrDecodeCiphertext.length, this.plaintextLimit, (short) 30);
        if (bArrDecodeCiphertext.length >= 1 || s2 == 23) {
            return bArrDecodeCiphertext;
        }
        throw new TlsFatalAlert((short) 47);
    }

    void finaliseHandshake() throws IOException {
        TlsCompression tlsCompression = this.readCompression;
        TlsCompression tlsCompression2 = this.pendingCompression;
        if (tlsCompression == tlsCompression2 && this.writeCompression == tlsCompression2) {
            TlsCipher tlsCipher = this.readCipher;
            TlsCipher tlsCipher2 = this.pendingCipher;
            if (tlsCipher == tlsCipher2 && this.writeCipher == tlsCipher2) {
                this.pendingCompression = null;
                this.pendingCipher = null;
                return;
            }
        }
        throw new TlsFatalAlert((short) 40);
    }

    void flush() throws IOException {
        this.output.flush();
    }

    TlsHandshakeHash getHandshakeHash() {
        return this.handshakeHash;
    }

    int getPlaintextLimit() {
        return this.plaintextLimit;
    }

    ProtocolVersion getReadVersion() {
        return this.readVersion;
    }

    void init(TlsContext tlsContext) {
        TlsNullCipher tlsNullCipher = new TlsNullCipher(tlsContext);
        this.readCipher = tlsNullCipher;
        this.writeCipher = tlsNullCipher;
        DeferredHash deferredHash = new DeferredHash();
        this.handshakeHash = deferredHash;
        deferredHash.init(tlsContext);
        setPlaintextLimit(DEFAULT_PLAINTEXT_LIMIT);
    }

    void notifyHelloComplete() {
        this.handshakeHash = this.handshakeHash.notifyPRFDetermined();
    }

    TlsHandshakeHash prepareToFinish() {
        TlsHandshakeHash tlsHandshakeHash = this.handshakeHash;
        this.handshakeHash = tlsHandshakeHash.stopTracking();
        return tlsHandshakeHash;
    }

    boolean readRecord() throws IOException {
        byte[] allOrNothing = TlsUtils.readAllOrNothing(5, this.input);
        if (allOrNothing == null) {
            return false;
        }
        short uint8 = TlsUtils.readUint8(allOrNothing, 0);
        checkType(uint8, (short) 10);
        if (this.restrictReadVersion) {
            ProtocolVersion version = TlsUtils.readVersion(allOrNothing, 1);
            ProtocolVersion protocolVersion = this.readVersion;
            if (protocolVersion == null) {
                this.readVersion = version;
            } else if (!version.equals(protocolVersion)) {
                throw new TlsFatalAlert((short) 47);
            }
        } else if ((-1) - (((-1) - TlsUtils.readVersionRaw(allOrNothing, 1)) | ((-1) - InputDeviceCompat.SOURCE_ANY)) != 768) {
            throw new TlsFatalAlert((short) 47);
        }
        byte[] bArrDecodeAndVerify = decodeAndVerify(uint8, this.input, TlsUtils.readUint16(allOrNothing, 3));
        this.handler.processRecord(uint8, bArrDecodeAndVerify, 0, bArrDecodeAndVerify.length);
        return true;
    }

    void receivedReadCipherSpec() throws IOException {
        TlsCipher tlsCipher;
        TlsCompression tlsCompression = this.pendingCompression;
        if (tlsCompression == null || (tlsCipher = this.pendingCipher) == null) {
            throw new TlsFatalAlert((short) 40);
        }
        this.readCompression = tlsCompression;
        this.readCipher = tlsCipher;
        this.readSeqNo = 0L;
    }

    void safeClose() {
        try {
            this.input.close();
        } catch (IOException unused) {
        }
        try {
            this.output.close();
        } catch (IOException unused2) {
        }
    }

    void sentWriteCipherSpec() throws IOException {
        TlsCipher tlsCipher;
        TlsCompression tlsCompression = this.pendingCompression;
        if (tlsCompression == null || (tlsCipher = this.pendingCipher) == null) {
            throw new TlsFatalAlert((short) 40);
        }
        this.writeCompression = tlsCompression;
        this.writeCipher = tlsCipher;
        this.writeSeqNo = 0L;
    }

    void setPendingConnectionState(TlsCompression tlsCompression, TlsCipher tlsCipher) {
        this.pendingCompression = tlsCompression;
        this.pendingCipher = tlsCipher;
    }

    void setPlaintextLimit(int i2) {
        this.plaintextLimit = i2;
        this.compressedLimit = i2 + 1024;
        this.ciphertextLimit = i2 + 2048;
    }

    void setReadVersion(ProtocolVersion protocolVersion) {
        this.readVersion = protocolVersion;
    }

    void setRestrictReadVersion(boolean z2) {
        this.restrictReadVersion = z2;
    }

    void setWriteVersion(ProtocolVersion protocolVersion) {
        this.writeVersion = protocolVersion;
    }

    void updateHandshakeData(byte[] bArr, int i2, int i3) {
        this.handshakeHash.update(bArr, i2, i3);
    }

    void writeRecord(short s2, byte[] bArr, int i2, int i3) throws IOException {
        byte[] bArrEncodePlaintext;
        if (this.writeVersion == null) {
            return;
        }
        checkType(s2, (short) 80);
        checkLength(i3, this.plaintextLimit, (short) 80);
        if (i3 < 1 && s2 != 23) {
            throw new TlsFatalAlert((short) 80);
        }
        if (s2 == 22) {
            updateHandshakeData(bArr, i2, i3);
        }
        OutputStream outputStreamCompress = this.writeCompression.compress(this.buffer);
        if (outputStreamCompress == this.buffer) {
            TlsCipher tlsCipher = this.writeCipher;
            long j2 = this.writeSeqNo;
            this.writeSeqNo = 1 + j2;
            bArrEncodePlaintext = tlsCipher.encodePlaintext(j2, s2, bArr, i2, i3);
        } else {
            outputStreamCompress.write(bArr, i2, i3);
            outputStreamCompress.flush();
            byte[] bufferContents = getBufferContents();
            checkLength(bufferContents.length, i3 + 1024, (short) 80);
            TlsCipher tlsCipher2 = this.writeCipher;
            long j3 = this.writeSeqNo;
            this.writeSeqNo = 1 + j3;
            bArrEncodePlaintext = tlsCipher2.encodePlaintext(j3, s2, bufferContents, 0, bufferContents.length);
        }
        checkLength(bArrEncodePlaintext.length, this.ciphertextLimit, (short) 80);
        byte[] bArr2 = new byte[bArrEncodePlaintext.length + 5];
        TlsUtils.writeUint8(s2, bArr2, 0);
        TlsUtils.writeVersion(this.writeVersion, bArr2, 1);
        TlsUtils.writeUint16(bArrEncodePlaintext.length, bArr2, 3);
        System.arraycopy(bArrEncodePlaintext, 0, bArr2, 5, bArrEncodePlaintext.length);
        this.output.write(bArr2);
        this.output.flush();
    }
}
