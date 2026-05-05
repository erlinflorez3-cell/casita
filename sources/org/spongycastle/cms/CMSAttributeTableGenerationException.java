package org.spongycastle.cms;

/* JADX INFO: loaded from: classes2.dex */
public class CMSAttributeTableGenerationException extends CMSRuntimeException {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Exception f27860e;

    public CMSAttributeTableGenerationException(String str) {
        super(str);
    }

    public CMSAttributeTableGenerationException(String str, Exception exc) {
        super(str);
        this.f27860e = exc;
    }

    @Override // org.spongycastle.cms.CMSRuntimeException, java.lang.Throwable
    public Throwable getCause() {
        return this.f27860e;
    }

    @Override // org.spongycastle.cms.CMSRuntimeException
    public Exception getUnderlyingException() {
        return this.f27860e;
    }
}
