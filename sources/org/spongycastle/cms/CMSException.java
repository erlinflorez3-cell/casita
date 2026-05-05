package org.spongycastle.cms;

/* JADX INFO: loaded from: classes2.dex */
public class CMSException extends Exception {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Exception f27861e;

    public CMSException(String str) {
        super(str);
    }

    public CMSException(String str, Exception exc) {
        super(str);
        this.f27861e = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f27861e;
    }

    public Exception getUnderlyingException() {
        return this.f27861e;
    }
}
