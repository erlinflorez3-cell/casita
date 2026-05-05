package org.bouncycastle.crypto.tls;

/* JADX INFO: loaded from: classes2.dex */
public class HeartbeatMode {
    public static final short peer_allowed_to_send = 1;
    public static final short peer_not_allowed_to_send = 2;

    public static boolean isValid(short s2) {
        return s2 >= 1 && s2 <= 2;
    }
}
