package org.spongycastle.openpgp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.bcpg.BCPGInputStream;
import org.spongycastle.bcpg.PublicKeyPacket;
import org.spongycastle.bcpg.TrustPacket;
import org.spongycastle.openpgp.operator.KeyFingerPrintCalculator;
import org.spongycastle.util.Iterable;

/* JADX INFO: loaded from: classes2.dex */
public class PGPPublicKeyRing extends PGPKeyRing implements Iterable<PGPPublicKey> {
    List keys;

    public PGPPublicKeyRing(InputStream inputStream, KeyFingerPrintCalculator keyFingerPrintCalculator) throws IOException {
        this.keys = new ArrayList();
        BCPGInputStream bCPGInputStreamWrap = wrap(inputStream);
        int iNextPacketTag = bCPGInputStreamWrap.nextPacketTag();
        if (iNextPacketTag != 6 && iNextPacketTag != 14) {
            throw new IOException("public key ring doesn't start with public key tag: tag 0x" + Integer.toHexString(iNextPacketTag));
        }
        PublicKeyPacket publicKeyPacket = (PublicKeyPacket) bCPGInputStreamWrap.readPacket();
        TrustPacket optionalTrustPacket = readOptionalTrustPacket(bCPGInputStreamWrap);
        List signaturesAndTrust = readSignaturesAndTrust(bCPGInputStreamWrap);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        readUserIDs(bCPGInputStreamWrap, arrayList, arrayList2, arrayList3);
        try {
            this.keys.add(new PGPPublicKey(publicKeyPacket, optionalTrustPacket, signaturesAndTrust, arrayList, arrayList2, arrayList3, keyFingerPrintCalculator));
            while (bCPGInputStreamWrap.nextPacketTag() == 14) {
                this.keys.add(readSubkey(bCPGInputStreamWrap, keyFingerPrintCalculator));
            }
        } catch (PGPException e2) {
            throw new IOException("processing exception: " + e2.toString());
        }
    }

    PGPPublicKeyRing(List list) {
        this.keys = list;
    }

    public PGPPublicKeyRing(byte[] bArr, KeyFingerPrintCalculator keyFingerPrintCalculator) throws IOException {
        this(new ByteArrayInputStream(bArr), keyFingerPrintCalculator);
    }

    public static PGPPublicKeyRing insertPublicKey(PGPPublicKeyRing pGPPublicKeyRing, PGPPublicKey pGPPublicKey) {
        ArrayList arrayList = new ArrayList(pGPPublicKeyRing.keys);
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 = 0; i2 != arrayList.size(); i2++) {
            PGPPublicKey pGPPublicKey2 = (PGPPublicKey) arrayList.get(i2);
            if (pGPPublicKey2.getKeyID() == pGPPublicKey.getKeyID()) {
                arrayList.set(i2, pGPPublicKey);
                z2 = true;
            }
            if (pGPPublicKey2.isMasterKey()) {
                z3 = true;
            }
        }
        if (!z2) {
            if (!pGPPublicKey.isMasterKey()) {
                arrayList.add(pGPPublicKey);
            } else {
                if (z3) {
                    throw new IllegalArgumentException("cannot add a master key to a ring that already has one");
                }
                arrayList.add(0, pGPPublicKey);
            }
        }
        return new PGPPublicKeyRing(arrayList);
    }

    static PGPPublicKey readSubkey(BCPGInputStream bCPGInputStream, KeyFingerPrintCalculator keyFingerPrintCalculator) throws PGPException, IOException {
        return new PGPPublicKey((PublicKeyPacket) bCPGInputStream.readPacket(), readOptionalTrustPacket(bCPGInputStream), readSignaturesAndTrust(bCPGInputStream), keyFingerPrintCalculator);
    }

    public static PGPPublicKeyRing removePublicKey(PGPPublicKeyRing pGPPublicKeyRing, PGPPublicKey pGPPublicKey) {
        ArrayList arrayList = new ArrayList(pGPPublicKeyRing.keys);
        boolean z2 = false;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((PGPPublicKey) arrayList.get(i2)).getKeyID() == pGPPublicKey.getKeyID()) {
                arrayList.remove(i2);
                z2 = true;
            }
        }
        if (z2) {
            return new PGPPublicKeyRing(arrayList);
        }
        return null;
    }

    @Override // org.spongycastle.openpgp.PGPKeyRing
    public void encode(OutputStream outputStream) throws IOException {
        for (int i2 = 0; i2 != this.keys.size(); i2++) {
            ((PGPPublicKey) this.keys.get(i2)).encode(outputStream);
        }
    }

    @Override // org.spongycastle.openpgp.PGPKeyRing
    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encode(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    @Override // org.spongycastle.openpgp.PGPKeyRing
    public PGPPublicKey getPublicKey() {
        return (PGPPublicKey) this.keys.get(0);
    }

    @Override // org.spongycastle.openpgp.PGPKeyRing
    public PGPPublicKey getPublicKey(long j2) {
        for (int i2 = 0; i2 != this.keys.size(); i2++) {
            PGPPublicKey pGPPublicKey = (PGPPublicKey) this.keys.get(i2);
            if (j2 == pGPPublicKey.getKeyID()) {
                return pGPPublicKey;
            }
        }
        return null;
    }

    @Override // org.spongycastle.openpgp.PGPKeyRing
    public Iterator<PGPPublicKey> getPublicKeys() {
        return Collections.unmodifiableList(this.keys).iterator();
    }

    @Override // org.spongycastle.util.Iterable, java.lang.Iterable
    public Iterator<PGPPublicKey> iterator() {
        return getPublicKeys();
    }
}
