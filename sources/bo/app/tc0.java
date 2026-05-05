package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import com.dynatrace.agent.events.enrichment.EventKeys;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1626yg;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public final class tc0 implements e10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f1832a;

    public tc0(Context context, String str, String str2) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 14694);
        short sXd2 = (short) (C1607wl.Xd() ^ 27415);
        int[] iArr = new int["5BBI;OL".length()];
        QB qb = new QB("5BBI;OL");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        String str3 = Jg.Wd("y\u000e\u001cd(?OI>P\u0015bsv\n\u0001?E\u001ekm\u0004\u0014\u0012\u007f\u0007\b$58KB\u0001\u0007", (short) (C1499aX.Xd() ^ (-25858)), (short) (C1499aX.Xd() ^ (-850))) + StringUtils.getCacheFileSuffix(context, str, str2);
        Class<?> cls = Class.forName(ZO.xd("V|}\u0011A\r%Kfu.\u001e~\u0007;hrqV\u001aj!:", (short) (FB.Xd() ^ 18453), (short) (FB.Xd() ^ 22855)));
        Class<?>[] clsArr = {Class.forName(C1626yg.Ud("k\u0015U\u0010V\u0001b[\u001741@279(", (short) (OY.Xd() ^ 1231), (short) (OY.Xd() ^ 25133))), Integer.TYPE};
        Object[] objArr = {str3, 0};
        short sXd3 = (short) (Od.Xd() ^ (-8715));
        int[] iArr2 = new int["\u001cpQ\tu\u0011Na\u0011i\u0012b\u0018\tJ\u001cgF\u0011f".length()];
        QB qb2 = new QB("\u001cpQ\tu\u0011Na\u0011i\u0012b\u0018\tJ\u001cgF\u0011f");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            this.f1832a = (SharedPreferences) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // bo.app.e10
    public final zb0 a() {
        if (!this.f1832a.contains("current_open_session")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) rc0.f1674a, 7, (Object) null);
            return null;
        }
        try {
            String string = this.f1832a.getString(this.f1832a.getString("current_open_session", ""), "");
            return new zb0(new JSONObject(string != null ? string : ""));
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) sc0.f1759a, 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.e10
    public final void a(w40 session) {
        Intrinsics.checkNotNullParameter(session, "session");
        String str = session.f2375a.f335b;
        JSONObject jSONObjectForJsonPut = session.forJsonPut();
        SharedPreferences.Editor editorEdit = this.f1832a.edit();
        if (!jSONObjectForJsonPut.has(EventKeys.END_TIME)) {
            try {
                jSONObjectForJsonPut.put(EventKeys.END_TIME, DateTimeUtils.nowInSecondsPrecise());
            } catch (JSONException e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) qc0.f1595a, 4, (Object) null);
            }
        }
        editorEdit.putString(str, jSONObjectForJsonPut.toString());
        if (!session.f2378d) {
            editorEdit.putString("current_open_session", str);
        } else if (Intrinsics.areEqual(this.f1832a.getString("current_open_session", ""), str)) {
            editorEdit.remove("current_open_session");
        }
        editorEdit.apply();
    }

    @Override // bo.app.e10
    public final void a(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        SharedPreferences.Editor editorEdit = this.f1832a.edit();
        editorEdit.remove(sessionId);
        if (Intrinsics.areEqual(sessionId, this.f1832a.getString("current_open_session", null))) {
            editorEdit.remove("current_open_session");
        }
        editorEdit.apply();
    }
}
