package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.StringUtils;
import io.cobrowse.CobrowseIO;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class jr implements p00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f1030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f1031b;

    public jr(Context context, String str) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 232);
        short sXd2 = (short) (C1607wl.Xd() ^ 1503);
        int[] iArr = new int["<*Ed\f%f".length()];
        QB qb = new QB("<*Ed\f%f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        short sXd3 = (short) (C1633zX.Xd() ^ (-11667));
        short sXd4 = (short) (C1633zX.Xd() ^ (-24851));
        int[] iArr2 = new int["l\u0010'HQd".length()];
        QB qb2 = new QB("l\u0010'HQd");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
            i3++;
        }
        Intrinsics.checkNotNullParameter(str, new String(iArr2, 0, i3));
        this.f1030a = LazyKt.lazy(new ir(context));
        short sXd5 = (short) (C1499aX.Xd() ^ (-24163));
        int[] iArr3 = new int["H\u0010y\u0014>\u0012/U\u0002\u001cR7\u001a\u0001\r\u0018H\\\u007f".length()];
        QB qb3 = new QB("H\u0010y\u0014>\u0012/U\u0002\u001cR7\u001a\u0001\r\u0018H\\\u007f");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd5 + i4)));
            i4++;
        }
        Object[] objArr = {new String(iArr3, 0, i4) + StringUtils.getCacheFileSuffix(context, null, str), 0};
        Method method = Class.forName(EO.Od("\"v>4i\u0011\u00189:if\u000bKNL#\u000e4z8dS]", (short) (ZN.Xd() ^ 30269))).getMethod(C1593ug.zd("ts\u0004cys\u0006yyf\n}\u007f\u007f\u000e\u0002\f\u0002\u0005\u0014", (short) (Od.Xd() ^ (-10527)), (short) (Od.Xd() ^ (-20014))), Class.forName(C1561oA.Qd("\n\u007f\u0014}I\u0007z\u0007~Dh\t\u0006{\u007fw", (short) (C1499aX.Xd() ^ (-5418)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            short sXd6 = (short) (C1607wl.Xd() ^ 8537);
            int[] iArr4 = new int["\u0012\u001d\u001b \u0010\"\u001dU\u000e\u000b\u0019v\u000b\u0003\u0013\u0005\u0003m\u000f\u0001\u0001~\u000b|댈\u000e\tA_`TTm]^T`J\\L\u0010%$#\"! \u001f\u001e&".length()];
            QB qb4 = new QB("\u0012\u001d\u001b \u0010\"\u001dU\u000e\u000b\u0019v\u000b\u0003\u0013\u0005\u0003m\u000f\u0001\u0001~\u000b|댈\u000e\tA_`TTm]^T`J\\L\u0010%$#\"! \u001f\u001e&");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK(sXd6 + sXd6 + i5 + xuXd4.CK(iKK4));
                i5++;
            }
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, new String(iArr4, 0, i5));
            this.f1031b = sharedPreferences;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final String a() {
        String string = this.f1031b.getString(CobrowseIO.DEVICE_ID_KEY, null);
        if (string == null) {
            Object value = this.f1030a.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-nonPartitionedDeviceIdPrefs>(...)");
            string = ((SharedPreferences) value).getString(CobrowseIO.DEVICE_ID_KEY, null);
            Object value2 = this.f1030a.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "<get-nonPartitionedDeviceIdPrefs>(...)");
            ((SharedPreferences) value2).edit().clear().apply();
        }
        if ((this.f1031b.contains("persistent_device_id") && !Intrinsics.areEqual(this.f1031b.getString("persistent_device_id", null), String.valueOf(722989291))) || string == null) {
            string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        }
        this.f1031b.edit().putString("persistent_device_id", String.valueOf(722989291)).putString(CobrowseIO.DEVICE_ID_KEY, string).apply();
        return string;
    }
}
