package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class pd0 {
    public static SharedPreferences a(cs csVar) throws Throwable {
        Intrinsics.checkNotNullParameter(csVar, Ig.wd("`\u001eVn'\u000eT\u0019&'<\u0007'OL=W`\u0019j", (short) (C1499aX.Xd() ^ (-14283))));
        short sXd = (short) (ZN.Xd() ^ 19253);
        int[] iArr = new int["~=-M\u0001^Y\"8\u0005G\u0018SQ9%[o#J\u0012EeYwtXd\u0002/Em\n>\u001db\u007f3".length()];
        QB qb = new QB("~=-M\u0001^Y\"8\u0005G\u0018SQ9%[o#J\u0012EeYwtXd\u0002/Em\n>\u001db\u007f3");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(new String(iArr, 0, i2), C1561oA.Qd("lnphRseegu", (short) (OY.Xd() ^ 11864)));
        short sXd2 = (short) (ZN.Xd() ^ 8119);
        short sXd3 = (short) (ZN.Xd() ^ 6665);
        int[] iArr2 = new int["A?54;9=8$8E>".length()];
        QB qb2 = new QB("A?54;9=8$8E>");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
            i3++;
        }
        Intrinsics.checkNotNullParameter("", new String(iArr2, 0, i3));
        ci0 ci0Var = (ci0) csVar.f430a;
        Context context = ci0Var.f382a;
        String str = C1561oA.od("{\u0007\u0004Cv\u0006s\fu=\u0001r}\u0001o||mxfqhyprj,qkf_gZlY`Yg ", (short) (FB.Xd() ^ 12097)) + StringUtils.getCacheFileSuffix(context, ci0Var.f387f, ci0Var.f388g);
        short sXd4 = (short) (C1607wl.Xd() ^ 659);
        int[] iArr3 = new int["9G>MKFB\rCPPWISZ\u0015+XX_Qeb".length()];
        QB qb3 = new QB("9G>MKFB\rCPPWISZ\u0015+XX_Qeb");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd4 + sXd4) + i4));
            i4++;
        }
        Object[] objArr = {str, 0};
        Method method = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.Xd("\u0001\u007f\u0010o\u0006\u007f\u0012\u0006\u0006r\u0016\n\f\f\u001a\u000e\u0018\u000e\u0011 ", (short) (Od.Xd() ^ (-30453))), Class.forName(Wg.Zd(" {V\u0007\u0019\u001d_:x|g^\"^!c", (short) (Od.Xd() ^ (-5736)), (short) (Od.Xd() ^ (-12054)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, Wg.vd("Xeel^ro*TScCYSeYiVymoo}q鼗MCE`RUM+\u0017+\u001dbyz{lmnopqrs\u0005\u000f", (short) (C1580rY.Xd() ^ (-27914))));
            return sharedPreferences;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
