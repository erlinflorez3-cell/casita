package org.spongycastle.openpgp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.spongycastle.bcpg.BCPGInputStream;
import org.spongycastle.bcpg.InputStreamPacket;
import org.spongycastle.bcpg.PublicKeyEncSessionPacket;
import org.spongycastle.bcpg.SymmetricKeyEncSessionPacket;
import org.spongycastle.util.Iterable;

/* JADX INFO: loaded from: classes2.dex */
public class PGPEncryptedDataList implements Iterable {
    InputStreamPacket data;
    List list = new ArrayList();

    public PGPEncryptedDataList(BCPGInputStream bCPGInputStream) throws IOException {
        while (true) {
            if (bCPGInputStream.nextPacketTag() != 1 && bCPGInputStream.nextPacketTag() != 3) {
                break;
            } else {
                this.list.add(bCPGInputStream.readPacket());
            }
        }
        this.data = (InputStreamPacket) bCPGInputStream.readPacket();
        for (int i2 = 0; i2 != this.list.size(); i2++) {
            if (this.list.get(i2) instanceof SymmetricKeyEncSessionPacket) {
                this.list.set(i2, new PGPPBEEncryptedData((SymmetricKeyEncSessionPacket) this.list.get(i2), this.data));
            } else {
                this.list.set(i2, new PGPPublicKeyEncryptedData((PublicKeyEncSessionPacket) this.list.get(i2), this.data));
            }
        }
    }

    public Object get(int i2) {
        return this.list.get(i2);
    }

    public Iterator getEncryptedDataObjects() {
        return this.list.iterator();
    }

    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override // org.spongycastle.util.Iterable, java.lang.Iterable
    public Iterator iterator() {
        return getEncryptedDataObjects();
    }

    public int size() {
        return this.list.size();
    }
}
