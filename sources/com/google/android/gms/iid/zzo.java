package com.google.android.gms.iid;

import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.KeyPair;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.Jg;
import yg.Xg;
import yg.ZN;

/* JADX INFO: loaded from: classes8.dex */
final class zzo {
    private final KeyPair zzcb;
    private final long zzcc;

    zzo(KeyPair keyPair, long j2) {
        this.zzcb = keyPair;
        this.zzcc = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzq() throws Throwable {
        Object[] objArr = {this.zzcb.getPublic().getEncoded(), 11};
        Method declaredMethod = Class.forName(C1561oA.yd("#1$3-( j//!%cx\u0015(7\t\u0004", (short) (C1580rY.Xd() ^ (-15729)))).getDeclaredMethod(C1561oA.Yd("}\b}\u000b\u0001\u0003r\u000fs\u0016\u0015\r\u0013\r", (short) (C1633zX.Xd() ^ (-10720))), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzr() throws Throwable {
        Object[] objArr = {this.zzcb.getPrivate().getEncoded(), 11};
        Method declaredMethod = Class.forName(Xg.qd("DRIXVQM\u0018``VZ\u001d2ReX*)", (short) (ZN.Xd() ^ 22363), (short) (ZN.Xd() ^ 31460))).getDeclaredMethod(Jg.Wd("\u001evC!U0lQ\u0006v>\rY\u001a", (short) (C1633zX.Xd() ^ (-22921)), (short) (C1633zX.Xd() ^ (-4478))), byte[].class, Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzo)) {
            return false;
        }
        zzo zzoVar = (zzo) obj;
        return this.zzcc == zzoVar.zzcc && this.zzcb.getPublic().equals(zzoVar.zzcb.getPublic()) && this.zzcb.getPrivate().equals(zzoVar.zzcb.getPrivate());
    }

    final long getCreationTime() {
        return this.zzcc;
    }

    final KeyPair getKeyPair() {
        return this.zzcb;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzcb.getPublic(), this.zzcb.getPrivate(), Long.valueOf(this.zzcc));
    }
}
