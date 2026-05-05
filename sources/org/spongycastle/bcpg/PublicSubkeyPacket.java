package org.spongycastle.bcpg;

import java.io.IOException;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class PublicSubkeyPacket extends PublicKeyPacket {
    public PublicSubkeyPacket(int i2, Date date, BCPGKey bCPGKey) {
        super(i2, date, bCPGKey);
    }

    PublicSubkeyPacket(BCPGInputStream bCPGInputStream) throws IOException {
        super(bCPGInputStream);
    }

    @Override // org.spongycastle.bcpg.PublicKeyPacket, org.spongycastle.bcpg.ContainedPacket
    public void encode(BCPGOutputStream bCPGOutputStream) throws IOException {
        bCPGOutputStream.writePacket(14, getEncodedContents(), true);
    }
}
