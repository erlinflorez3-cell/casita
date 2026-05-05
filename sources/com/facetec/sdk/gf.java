package com.facetec.sdk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gf implements Runnable {
    private String B;

    public gf(String str, Object... objArr) {
        this.B = gg.Code(str, objArr);
    }

    protected abstract void Z();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.B);
        try {
            Z();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
