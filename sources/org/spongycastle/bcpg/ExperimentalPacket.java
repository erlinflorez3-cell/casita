package org.spongycastle.bcpg;

import java.io.IOException;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class ExperimentalPacket extends ContainedPacket implements PublicKeyAlgorithmTags {
    private byte[] contents;
    private int tag;

    ExperimentalPacket(int i2, BCPGInputStream bCPGInputStream) throws IOException {
        this.tag = i2;
        this.contents = bCPGInputStream.readAll();
    }

    @Override // org.spongycastle.bcpg.ContainedPacket
    public void encode(BCPGOutputStream bCPGOutputStream) throws IOException {
        bCPGOutputStream.writePacket(this.tag, this.contents, true);
    }

    public byte[] getContents() {
        return Arrays.clone(this.contents);
    }

    public int getTag() {
        return this.tag;
    }
}
