package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public final class zg0 implements j10 {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f2395a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f2396b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f2397c;

    public zg0(Context context, String str, String str2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, Wg.Zd("e/o3e6s", (short) (C1580rY.Xd() ^ (-1219)), (short) (C1580rY.Xd() ^ (-29853))));
        short sXd = (short) (ZN.Xd() ^ 21010);
        int[] iArr = new int["\u001f/)\f'<".length()];
        QB qb = new QB("\u001f/)\f'<");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str2, new String(iArr, 0, i2));
        short sXd2 = (short) (C1580rY.Xd() ^ (-1182));
        int[] iArr2 = new int["?LK\r9IJ=CN\u0004JD@D432{C:212)79t2&!((&%(\u001a\"&$(.".length()];
        QB qb2 = new QB("?LK\r9IJ=CN\u0004JD@D432{C:212)79t2&!((&%(\u001a\"&$(.");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr = {new String(iArr2, 0, i3) + StringUtils.getCacheFileSuffix(context, str, str2), 0};
        Method method = Class.forName(Qg.kd("BNCPLE?\b<GEJ:BG\u007f\u0014?=B2D?", (short) (C1607wl.Xd() ^ 5000), (short) (C1607wl.Xd() ^ 14470))).getMethod(C1561oA.ud("\\YgEYQaSQ<]OOMYKSGHU", (short) (FB.Xd() ^ 7829)), Class.forName(yg.hg.Vd("TJ^H\u0014QEQI\u000f3SPFJB", (short) (C1499aX.Xd() ^ (-18899)), (short) (C1499aX.Xd() ^ (-9700)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            short sXd3 = (short) (C1580rY.Xd() ^ (-2310));
            int[] iArr3 = new int["9DBG?QL\u000552@\u001e:2B4*\u00156(0.:,㴩,*/'94lCD88YIJ@D.@0{\u0011\u0010\u000f\u0006\u000e".length()];
            QB qb3 = new QB("9DBG?QL\u000552@\u001e:2B4*\u00156(0.:,㴩,*/'94lCD88YIJ@D.@0{\u0011\u0010\u000f\u0006\u000e");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 ^ i4));
                i4++;
            }
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, new String(iArr3, 0, i4));
            this.f2395a = sharedPreferences;
            this.f2396b = a();
            this.f2397c = new LinkedHashMap();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final ConcurrentHashMap a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        try {
            for (String actionId : this.f2395a.getAll().keySet()) {
                long j2 = this.f2395a.getLong(actionId, 0L);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xg0(actionId), 7, (Object) null);
                Long lValueOf = Long.valueOf(j2);
                Intrinsics.checkNotNullExpressionValue(actionId, "actionId");
                concurrentHashMap.put(actionId, lValueOf);
            }
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) yg0.f2312a, 4, (Object) null);
        }
        return concurrentHashMap;
    }

    public final void a(k10 triggeredAction, long j2) {
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new tg0(triggeredAction, j2), 7, (Object) null);
        LinkedHashMap linkedHashMap = this.f2397c;
        bh0 bh0Var = (bh0) triggeredAction;
        String str = bh0Var.f280a;
        Long l2 = (Long) this.f2396b.get(str);
        linkedHashMap.put(str, Long.valueOf(l2 != null ? l2.longValue() : 0L));
        this.f2396b.put(bh0Var.f280a, Long.valueOf(j2));
        this.f2395a.edit().putLong(bh0Var.f280a, j2).apply();
    }

    public final boolean a(k10 triggeredAction) {
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        bh0 bh0Var = (bh0) triggeredAction;
        k70 k70Var = bh0Var.f281b.f734f;
        if (k70Var.f1082a == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new og0(triggeredAction), 7, (Object) null);
            return true;
        }
        if (!this.f2396b.containsKey(bh0Var.f280a)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new pg0(triggeredAction), 7, (Object) null);
            return true;
        }
        if (k70Var.f1082a == -1) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new qg0(triggeredAction), 7, (Object) null);
            return false;
        }
        Long l2 = (Long) this.f2396b.get(bh0Var.f280a);
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        long jNowInSeconds = DateTimeUtils.nowInSeconds() + ((long) bh0Var.f281b.f732d);
        int i2 = k70Var.f1082a;
        Integer numValueOf = i2 > 0 ? Integer.valueOf(i2) : null;
        if (jNowInSeconds >= ((long) (numValueOf != null ? numValueOf.intValue() : 0)) + jLongValue) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new rg0(jLongValue, k70Var), 7, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new sg0(jLongValue, k70Var), 7, (Object) null);
        return false;
    }

    public final void b(k10 triggeredAction) {
        Intrinsics.checkNotNullParameter(triggeredAction, "triggeredAction");
        bh0 bh0Var = (bh0) triggeredAction;
        if (bh0Var.f281b.f734f.f1082a == -1) {
            this.f2396b.remove(bh0Var.f280a);
            this.f2395a.edit().remove(bh0Var.f280a).apply();
            return;
        }
        Long l2 = (Long) this.f2397c.get(bh0Var.f280a);
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new wg0(triggeredAction, jLongValue), 7, (Object) null);
        this.f2396b.put(bh0Var.f280a, Long.valueOf(jLongValue));
        this.f2395a.edit().putLong(bh0Var.f280a, jLongValue).apply();
    }
}
