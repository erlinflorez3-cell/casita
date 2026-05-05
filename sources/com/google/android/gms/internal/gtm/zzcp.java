package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.dynatrace.android.agent.AdkSettings;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class zzcp extends zzbu {
    private volatile String zza;
    private Future zzb;

    protected zzcp(zzbx zzbxVar) {
        super(zzbxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzf() {
        short sXd = (short) (C1633zX.Xd() ^ (-17818));
        int[] iArr = new int["!".length()];
        QB qb = new QB("!");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        short sXd2 = (short) (Od.Xd() ^ (-7154));
        int[] iArr2 = new int["\t%.2$$`6:k0:6;.i6@>;=D\u001a6zSOGKAGAB\u0017\u0019\u0018\u0004\u0001\u000e".length()];
        QB qb2 = new QB("\t%.2$$`6:k0:6;.i6@>;=D\u001a6zSOGKAGAB\u0017\u0019\u0018\u0004\u0001\u000e");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        String str2 = new String(iArr2, 0, i3);
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        try {
            Context contextZza = zzq().zza();
            Preconditions.checkNotEmpty(lowerCase);
            Preconditions.checkNotMainThread(Qg.kd("\r51,49\r'a4(.3) Z\u001c\u001eW*\u0017+\u0019\u0017Q\u0017\"\u001e\u001bL#\u001a\u001c\u0014\r\u0019E\u0019\f\u0015\u0007\u0002\u0004", (short) (Od.Xd() ^ (-32251)), (short) (Od.Xd() ^ (-1475))));
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    zzO(hg.Vd("\\|vxnrj\"dlhckpD^", (short) (Od.Xd() ^ (-11488)), (short) (Od.Xd() ^ (-16238))), lowerCase);
                    String strUd = C1561oA.ud("\u0007\u007f`\t\u0005\u007f\b\r`z", (short) (OY.Xd() ^ 15120));
                    Class<?> cls = Class.forName(C1561oA.yd("z\t\u007f\u000f\r\b\u0004Nt\u0002\u0002\tz\u0005\fFLyy\u0001r\u0007\u0004", (short) (C1499aX.Xd() ^ (-30572))));
                    Class<?>[] clsArr = new Class[2];
                    clsArr[0] = Class.forName(C1561oA.Yd("vn\u0005p>}s\u0002{Ci\f\u000b\u0003\t\u0003", (short) (FB.Xd() ^ 4667)));
                    clsArr[1] = Integer.TYPE;
                    Object[] objArr = {strUd, 0};
                    Method method = cls.getMethod(Xg.qd("y{q{Tx|va\t\t\u0006\f\f", (short) (OY.Xd() ^ 16615), (short) (OY.Xd() ^ 12618)), clsArr);
                    try {
                        method.setAccessible(true);
                        FileOutputStream fileOutputStream2 = (FileOutputStream) method.invoke(contextZza, objArr);
                        fileOutputStream2.write(lowerCase.getBytes());
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e2) {
                                zzJ(str2, e2);
                            }
                        }
                        return lowerCase;
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                } catch (FileNotFoundException e4) {
                    zzJ(ZO.xd("@\u001c\u0003\rUoFL.ETLAa$8\u0011#\u001eSA/i\u0014\u000f=E7", (short) (C1499aX.Xd() ^ (-6512)), (short) (C1499aX.Xd() ^ (-7416))), e4);
                    if (0 != 0) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            e = e5;
                            zzJ(str2, e);
                            return str;
                        }
                    }
                    return str;
                } catch (IOException e6) {
                    zzJ(Jg.Wd("sA?%,CX3'4\rS:s$)\u000f:@'+Q]\u0012*gSV?A", (short) (C1607wl.Xd() ^ 25232), (short) (C1607wl.Xd() ^ 32515)), e6);
                    if (0 != 0) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e7) {
                            e = e7;
                            zzJ(str2, e);
                            return str;
                        }
                    }
                    return str;
                }
            } finally {
            }
        } catch (Exception e8) {
            zzJ(C1626yg.Ud("9Hsvp\u001d5/Sy\u0015{S5\u001d_\u0012M\u000731q\u0013)_-", (short) (ZN.Xd() ^ 22982), (short) (ZN.Xd() ^ 29381)), e8);
            return str;
        }
    }

    public final String zzb() {
        String str;
        zzV();
        synchronized (this) {
            if (this.zza == null) {
                this.zzb = zzq().zzg(new zzcn(this));
            }
            Future future = this.zzb;
            if (future != null) {
                try {
                    this.zza = (String) future.get();
                } catch (InterruptedException e2) {
                    zzR("ClientId loading or generation was interrupted", e2);
                    this.zza = AdkSettings.PLATFORM_TYPE_MOBILE;
                } catch (ExecutionException e3) {
                    zzJ("Failed to load or generate client id", e3);
                    this.zza = AdkSettings.PLATFORM_TYPE_MOBILE;
                }
                if (this.zza == null) {
                    this.zza = AdkSettings.PLATFORM_TYPE_MOBILE;
                }
                zzO("Loaded clientId", this.zza);
                this.zzb = null;
                str = this.zza;
            } else {
                str = this.zza;
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x031e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.FileInputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.String zzc() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcp.zzc():java.lang.String");
    }

    @Override // com.google.android.gms.internal.gtm.zzbu
    protected final void zzd() {
    }

    final String zze() {
        synchronized (this) {
            this.zza = null;
            this.zzb = zzq().zzg(new zzco(this));
        }
        return zzb();
    }
}
