package org.bouncycastle.cms;

/* JADX INFO: loaded from: classes6.dex */
public class CMSException extends Exception {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Exception f27496e;

    public CMSException(String str) {
        super(str);
    }

    public CMSException(String str, Exception exc) {
        super(str);
        this.f27496e = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f27496e;
    }

    public Exception getUnderlyingException() {
        return this.f27496e;
    }
}
