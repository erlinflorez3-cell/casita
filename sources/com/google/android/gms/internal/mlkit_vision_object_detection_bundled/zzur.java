package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Wg;
import yg.Xg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class zzur {
    public static final zzuj zza;

    static {
        Object[] objArr = {Xg.qd("\u0011[\u0006_lk\u0017te\u000bou|Z\u001dwx[\"\u001d#p\u0001cw$\u0015k{\u0010\b)+\u0005\t5\u007fm\u0018", (short) (ZN.Xd() ^ 6592), (short) (ZN.Xd() ^ 9281)), 3};
        Method declaredMethod = Class.forName(Jg.Wd("GZO#$!m?FHE\b^vYl&v\b", (short) (ZN.Xd() ^ 32174), (short) (ZN.Xd() ^ 1628))).getDeclaredMethod(C1626yg.Ud("'\u001a\u0003\u0012FV", (short) (ZN.Xd() ^ 25688), (short) (ZN.Xd() ^ 25424)), Class.forName(ZO.xd("\u000e\u0017Jj-qQ\"%\bM\u0001s\u001c[W", (short) (C1499aX.Xd() ^ (-15481)), (short) (C1499aX.Xd() ^ (-1042)))), Integer.TYPE);
        try {
            declaredMethod.setAccessible(true);
            byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
            Object[] objArr2 = {Ig.wd("Jd\u0005*TRmEHEI0T\u0014^!gm \u0006E0&JZVR\u000f;\u0013A4<\u0003\n\u000585X", (short) (C1633zX.Xd() ^ (-8952))), 3};
            Method declaredMethod2 = Class.forName(EO.Od("tGQ\u0005\u001dT)\\_\u007ft\u0014\u0005%YL\u0003;\u0014", (short) (C1580rY.Xd() ^ (-6792)))).getDeclaredMethod(C1593ug.zd("GIHUKM", (short) (OY.Xd() ^ 767), (short) (OY.Xd() ^ 7907)), Class.forName(C1561oA.Qd("<2F0{9-91v\u001b;8.2*", (short) (C1580rY.Xd() ^ (-5826)))), Integer.TYPE);
            try {
                declaredMethod2.setAccessible(true);
                byte[] bArr2 = (byte[]) declaredMethod2.invoke(null, objArr2);
                byte[] bArr3 = new byte[bArr.length];
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
                }
                Object[] objArr3 = {bArr3, 3};
                Method declaredMethod3 = Class.forName(C1561oA.od("\u001f+ -)\"\u001cd+)\u001d\u001f_r\u0011\"\u0013b_", (short) (C1607wl.Xd() ^ 13577))).getDeclaredMethod(C1561oA.Kd("v\u0001v\u0004y{k\bl\u000f\u000e\u0006\f\u0006", (short) (OY.Xd() ^ 857)), byte[].class, Integer.TYPE);
                try {
                    declaredMethod3.setAccessible(true);
                    zza = new zzuj(C1561oA.Xd("\u0007\u0003\u0004\b\t\u0005\u000b\u000b\r\u000e\f\u0014", (short) (ZN.Xd() ^ 31668)), (String) declaredMethod3.invoke(null, objArr3), Wg.Zd("\u0003e{~Y>tV\u0007x\u0013\u0005l\u000b{{kXrgsr", (short) (OY.Xd() ^ 17906), (short) (OY.Xd() ^ 22627)));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
