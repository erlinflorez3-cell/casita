package org.spongycastle.cms;

import org.spongycastle.util.Selector;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RecipientId implements Selector {
    public static final int kek = 1;
    public static final int keyAgree = 2;
    public static final int keyTrans = 0;
    public static final int password = 3;
    private final int type;

    protected RecipientId(int i2) {
        this.type = i2;
    }

    @Override // org.spongycastle.util.Selector
    public abstract Object clone();

    public int getType() {
        return this.type;
    }
}
