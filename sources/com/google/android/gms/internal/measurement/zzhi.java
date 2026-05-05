package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.drew.metadata.exif.makernotes.OlympusImageProcessingMakernoteDirectory;
import com.google.common.base.Optional;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public final class zzhi {
    private static volatile Optional<Boolean> zza = Optional.absent();
    private static final Object zzb = new Object();

    private static boolean zza(Context context) throws Throwable {
        Object obj;
        int iIntValue;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.ud("q}r\u007f{tn7kvtyiqv/Cnlqasn", (short) (ZN.Xd() ^ OlympusImageProcessingMakernoteDirectory.TagWbGLevel))).getMethod(C1561oA.yd("\u0003\u0002\u000ejx{\u0001w\u000b\nn\u0004\u000e\u0002\u0005\u0004}", (short) (FB.Xd() ^ 32069)), new Class[0]);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            String strYd = C1561oA.Yd("O\\[\u001dW`aZ`Z$Xf]ljea,fmt", (short) (C1580rY.Xd() ^ (-9026)));
            short sXd = (short) (ZN.Xd() ^ 27265);
            short sXd2 = (short) (ZN.Xd() ^ 18285);
            int[] iArr = new int["jxo~|ws>t\u0002\u0002\tz\u0005\fF\n\bIl~\u0002\u000b\u0002\t\bp\u0006\u0014\b\u000f\u000e\u001c".length()];
            QB qb = new QB("jxo~|ws>t\u0002\u0002\tz\u0005\fF\n\bIl~\u0002\u000b\u0002\t\bp\u0006\u0014\b\u000f\u000e\u001c");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            try {
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(Jg.Wd("SS1%*q/E\u0019(V@7v\u0005H", (short) (C1633zX.Xd() ^ (-25693)), (short) (C1633zX.Xd() ^ (-24359))));
                clsArr[1] = Integer.TYPE;
                Object[] objArr2 = {strYd, 0};
                Method method2 = cls.getMethod(ZO.xd("OH\u0012/)>\u000b'0g`\u0005# X~ib", (short) (C1580rY.Xd() ^ (-20013)), (short) (C1580rY.Xd() ^ (-20333))), clsArr);
                try {
                    method2.setAccessible(true);
                    ApplicationInfo applicationInfo = (ApplicationInfo) method2.invoke(packageManager, objArr2);
                    String strUd = C1626yg.Ud(" \tg7058^-b;bW<\u0019GxoIv/\u0012>nbR\u0012rW\f6$:>", (short) (FB.Xd() ^ 17332), (short) (FB.Xd() ^ 20967));
                    String strWd = Ig.wd("\u0002@e\u0006\u0018", (short) (Od.Xd() ^ (-11963)));
                    try {
                        Class<?> cls2 = Class.forName(strUd);
                        Field field = 1 != 0 ? cls2.getField(strWd) : cls2.getDeclaredField(strWd);
                        field.setAccessible(true);
                        obj = field.get(applicationInfo);
                    } catch (Throwable th) {
                        obj = null;
                    }
                    iIntValue = ((Integer) obj).intValue();
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return (iIntValue + 129) - (iIntValue | 129) != 0;
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zza(android.content.Context r11, android.net.Uri r12) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhi.zza(android.content.Context, android.net.Uri):boolean");
    }
}
