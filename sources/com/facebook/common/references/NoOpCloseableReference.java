package com.facebook.common.references;

/* JADX INFO: loaded from: classes3.dex */
public class NoOpCloseableReference<T> extends CloseableReference<T> {
    NoOpCloseableReference(T t2) {
        super(t2, null, null, null, false);
    }

    @Override // com.facebook.common.references.CloseableReference
    /* JADX INFO: renamed from: clone */
    public CloseableReference<T> mo7166clone() {
        return this;
    }

    @Override // com.facebook.common.references.CloseableReference
    public CloseableReference<T> cloneOrNull() {
        return this;
    }

    @Override // com.facebook.common.references.CloseableReference, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.facebook.common.references.CloseableReference
    public boolean isValid() {
        return true;
    }
}
