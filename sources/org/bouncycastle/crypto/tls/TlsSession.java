package org.bouncycastle.crypto.tls;

/* JADX INFO: loaded from: classes2.dex */
public interface TlsSession {
    SessionParameters exportSessionParameters();

    byte[] getSessionID();

    void invalidate();

    boolean isResumable();
}
