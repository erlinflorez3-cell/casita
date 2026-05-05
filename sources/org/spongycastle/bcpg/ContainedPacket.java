package org.spongycastle.bcpg;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.spongycastle.util.Encodable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ContainedPacket extends Packet implements Encodable {
    public abstract void encode(BCPGOutputStream bCPGOutputStream) throws IOException;

    @Override // org.spongycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BCPGOutputStream bCPGOutputStream = new BCPGOutputStream(byteArrayOutputStream);
        bCPGOutputStream.writePacket(this);
        bCPGOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
}
