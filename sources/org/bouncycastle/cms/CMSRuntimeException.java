package org.bouncycastle.cms;

/* JADX INFO: loaded from: classes6.dex */
public class CMSRuntimeException extends RuntimeException {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Exception f27497e;

    public CMSRuntimeException(String str) {
        super(str);
    }

    public CMSRuntimeException(String str, Exception exc) {
        super(str);
        this.f27497e = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f27497e;
    }

    public Exception getUnderlyingException() {
        return this.f27497e;
    }
}
