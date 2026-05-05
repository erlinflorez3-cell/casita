package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.StringUtils;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public final class e50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f543a;

    public e50(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, ZO.xd("[E\u000ex\u0017_R", (short) (C1499aX.Xd() ^ (-10699)), (short) (C1499aX.Xd() ^ (-18746))));
        short sXd = (short) (Od.Xd() ^ (-26125));
        short sXd2 = (short) (Od.Xd() ^ (-10332));
        int[] iArr = new int["`K_F\be\u0017r\u001b\u000f\u000bOz\u0006\b\u0016pd?\u0014e;z.sj(\u0006(".length()];
        QB qb = new QB("`K_F\be\u0017r\u001b\u000f\u000bOz\u0006\b\u0016pd?\u0014e;z.sj(\u0006(");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {new String(iArr, 0, i2), 0};
        Method method = Class.forName(Ig.wd("\u001e\u0006I0t!8\"(tu]\u001f.4X4J\"o!|N", (short) (FB.Xd() ^ 26266))).getMethod(C1561oA.Qd("EBP.B:J<:%F886B4<01>", (short) (OY.Xd() ^ 26996)), Class.forName(EO.Od("-KR%*67{ j\u000e\r:+(~", (short) (C1607wl.Xd() ^ 7967))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, C1593ug.zd("#007)=:t/.>\u001e4.@44!D8::H<篅&\u001f\u0007{ MMTFZW\u001225+-H:=5C/C5\u001a", (short) (OY.Xd() ^ 22814), (short) (OY.Xd() ^ 377)));
            this.f543a = sharedPreferences;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final String a() {
        String string = this.f543a.getString("last_user", "");
        String str = string != null ? string : "";
        if (StringUtils.getByteSize(str) <= 997) {
            return str;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b50(str), 6, (Object) null);
        String strTruncateToByteLength = StringUtils.truncateToByteLength(str, IDStepResponseCodes.START_PERMISSION_REQUEST);
        a(strTruncateToByteLength);
        return strTruncateToByteLength;
    }

    public final void a(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        if (userId.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) c50.f317a, 6, (Object) null);
        } else {
            if (StringUtils.getByteSize(userId) > 997) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new d50(userId), 6, (Object) null);
                return;
            }
            SharedPreferences.Editor editorEdit = this.f543a.edit();
            editorEdit.putString("last_user", userId);
            editorEdit.apply();
        }
    }
}
