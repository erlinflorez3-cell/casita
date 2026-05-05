package org.spongycastle.cms;

/* JADX INFO: loaded from: classes2.dex */
public class CMSRuntimeException extends RuntimeException {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Exception f27862e;

    public CMSRuntimeException(String str) {
        super(str);
    }

    public CMSRuntimeException(String str, Exception exc) {
        super(str);
        this.f27862e = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f27862e;
    }

    public Exception getUnderlyingException() {
        return this.f27862e;
    }
}
