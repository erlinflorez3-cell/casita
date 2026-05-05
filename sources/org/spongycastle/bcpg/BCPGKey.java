package org.spongycastle.bcpg;

import org.spongycastle.util.Encodable;

/* JADX INFO: loaded from: classes2.dex */
public interface BCPGKey extends Encodable {
    @Override // org.spongycastle.util.Encodable
    byte[] getEncoded();

    String getFormat();
}
