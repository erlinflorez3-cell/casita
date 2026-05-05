package org.spongycastle.crypto.tls;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class TlsFatalAlert extends IOException {
    private static final long serialVersionUID = 3584313123679111168L;
    protected Throwable alertCause;
    protected short alertDescription;

    public TlsFatalAlert(short s2) {
        this(s2, null);
    }

    public TlsFatalAlert(short s2, Throwable th) {
        super(AlertDescription.getText(s2));
        this.alertDescription = s2;
        this.alertCause = th;
    }

    public short getAlertDescription() {
        return this.alertDescription;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.alertCause;
    }
}
