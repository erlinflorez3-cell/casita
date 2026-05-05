package bo.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.braze.events.SessionStateChangedEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public final class ci {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f367m = BrazeLogger.getBrazeLogTag((Class<?>) ci.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f368n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f369o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e10 f371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v00 f372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v00 f373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AlarmManager f374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantLock f377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nh f379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Job f380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public w40 f381l;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f368n = timeUnit.toMillis(10L);
        f369o = timeUnit.toMillis(10L);
    }

    public ci(Context context, cv cvVar, vw vwVar, v00 v00Var, AlarmManager alarmManager, int i2, boolean z2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.Yd("/?@=;65I?FF\u001cIIPBVS", (short) (C1633zX.Xd() ^ (-8208))));
        Intrinsics.checkNotNullParameter(cvVar, Xg.qd("J=LMDKK1SOSCJI2GUIPO]", (short) (C1633zX.Xd() ^ (-1186)), (short) (C1633zX.Xd() ^ (-20644))));
        Intrinsics.checkNotNullParameter(vwVar, Jg.Wd("\u001a\\\u001eL\u001dV\u0005MiX\u0003I\u0013,\r7d!d\u0019W$", (short) (Od.Xd() ^ (-21785)), (short) (Od.Xd() ^ (-2476))));
        Intrinsics.checkNotNullParameter(v00Var, ZO.xd("s!@XpJ\u001e\u000bH\f+a^HI\b@7*l\u0019#", (short) (ZN.Xd() ^ 2543), (short) (ZN.Xd() ^ 28381)));
        Intrinsics.checkNotNullParameter(alarmManager, C1626yg.Ud("=$,q\u00196\u001fl\u000e3\u00144", (short) (C1633zX.Xd() ^ (-26298)), (short) (C1633zX.Xd() ^ (-23608))));
        this.f370a = context;
        this.f371b = cvVar;
        this.f372c = vwVar;
        this.f373d = v00Var;
        this.f374e = alarmManager;
        this.f375f = i2;
        this.f376g = z2;
        this.f377h = new ReentrantLock();
        this.f380k = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        nh nhVar = new nh(this);
        this.f379j = nhVar;
        StringBuilder sb = new StringBuilder();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Ig.wd("(h\u000bFa\u0007$\u0013\u0002\u0004zh\u000b\u0010\u0010)e2f\u0013=*\u0012", (short) (C1607wl.Xd() ^ 10119))).getMethod(EO.Od("R#\u0004?0_s9\u000b,\u0013D \u0012", (short) (Od.Xd() ^ (-5736))), new Class[0]);
        try {
            method.setAccessible(true);
            String string = sb.append((String) method.invoke(context, objArr)).append(C1561oA.Qd("W\u0012\u0016\u001b\u000b\u0013\u0018Pcr`xb{n_lk`ecsfZ`e[Rl_PKU", (short) (C1607wl.Xd() ^ 21279))).toString();
            this.f378i = string;
            try {
                if (Build.VERSION.SDK_INT < 33) {
                    IntentFilter intentFilter = new IntentFilter(string);
                    Class<?> cls = Class.forName(C1561oA.Xd("\r\u001b\u0012!\u001f\u001a\u0016`\u0017$$+\u001d'.h~,,3%96", (short) (FB.Xd() ^ 5898)));
                    Class<?>[] clsArr = new Class[2];
                    short sXd = (short) (C1499aX.Xd() ^ (-5349));
                    int[] iArr = new int["\u0001\u000f\u0006\u0015\u0013\u000e\nTz\b\b\u000f\u0001\u000b\u0012Lq#!\u0014\u0018\u0018\u0017*\u001cz\u000f\u000e\u0011\u0016$\u00142".length()];
                    QB qb = new QB("\u0001\u000f\u0006\u0015\u0013\u000e\nTz\b\b\u000f\u0001\u000b\u0012Lq#!\u0014\u0018\u0018\u0017*\u001cz\u000f\u000e\u0011\u0016$\u00142");
                    int i3 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i3] = xuXd.fK((sXd ^ i3) + xuXd.CK(iKK));
                        i3++;
                    }
                    clsArr[0] = Class.forName(new String(iArr, 0, i3));
                    clsArr[1] = Class.forName(Qg.kd("JVKXTMG\u0010DOMRBJO\b\"FK;CH\u0019;=D4@", (short) (Od.Xd() ^ (-13311)), (short) (Od.Xd() ^ (-11381))));
                    Object[] objArr2 = {nhVar, intentFilter};
                    Method method2 = cls.getMethod(yg.hg.Vd("cUVW``P\\;MJKNZHT", (short) (C1607wl.Xd() ^ 7008), (short) (C1607wl.Xd() ^ 29095)), clsArr);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(context, objArr2);
                        return;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
                IntentFilter intentFilter2 = new IntentFilter(string);
                Class<?> cls2 = Class.forName(C1593ug.zd("<JAPNIE\u0010FSSZLV]\u0018.[[bThe", (short) (C1499aX.Xd() ^ (-24906)), (short) (C1499aX.Xd() ^ (-7273))));
                Class<?>[] clsArr2 = new Class[3];
                short sXd2 = (short) (ZN.Xd() ^ 22611);
                int[] iArr2 = new int["}\n~\f\b\u0001zCw\u0003\u0001\u0006u}\u0003;N}yjljgxxUgdehtbn".length()];
                QB qb2 = new QB("}\n~\f\b\u0001zCw\u0003\u0001\u0006u}\u0003;N}yjljgxxUgdehtbn");
                int i4 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i4] = xuXd2.fK(sXd2 + sXd2 + i4 + xuXd2.CK(iKK2));
                    i4++;
                }
                clsArr2[0] = Class.forName(new String(iArr2, 0, i4));
                short sXd3 = (short) (C1499aX.Xd() ^ (-32510));
                int[] iArr3 = new int["&4+:83/y0==D6@G\u0002\u001eDK=GN!EIRDR".length()];
                QB qb3 = new QB("&4+:83/y0==D6@G\u0002\u001eDK=GN!EIRDR");
                int i5 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd3 + sXd3) + i5));
                    i5++;
                }
                clsArr2[1] = Class.forName(new String(iArr3, 0, i5));
                clsArr2[2] = Integer.TYPE;
                Object[] objArr3 = {nhVar, intentFilter2, 2};
                Method method3 = cls2.getMethod(Wg.Zd("gk\u0005x\u001a,\u00184\u000e1G<Ww]z", (short) (C1499aX.Xd() ^ (-30816)), (short) (C1499aX.Xd() ^ (-8054))), clsArr2);
                try {
                    method3.setAccessible(true);
                    method3.invoke(context, objArr3);
                    return;
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (Exception e4) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new oh(this), 4, (Object) null);
                this.f379j = null;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e4, false, (Function0) new oh(this), 4, (Object) null);
            this.f379j = null;
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) ph.f1516a, 7, (Object) null);
        try {
            Intent intent = new Intent(this.f378i);
            intent.putExtra("session_id", String.valueOf(this.f381l));
            this.f374e.cancel(PendingIntent.getBroadcast(this.f370a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) qh.f1604a, 4, (Object) null);
        }
    }

    public final void b() {
        w40 mutableSession = this.f381l;
        if (mutableSession != null) {
            int i2 = this.f375f;
            boolean z2 = this.f376g;
            Intrinsics.checkNotNullParameter(mutableSession, "mutableSession");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(i2);
            if (z2) {
                millis = Math.max(f369o, (timeUnit.toMillis((long) mutableSession.f2376b) + millis) - DateTimeUtils.nowInMilliseconds());
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new rh(millis), 7, (Object) null);
            try {
                Intent intent = new Intent(this.f378i);
                intent.putExtra("session_id", mutableSession.toString());
                int immutablePendingIntentFlags = IntentUtils.getImmutablePendingIntentFlags();
                this.f374e.set(1, DateTimeUtils.nowInMilliseconds() + millis, PendingIntent.getBroadcast(this.f370a, 0, intent, (immutablePendingIntentFlags + 1073741824) - (immutablePendingIntentFlags & 1073741824)));
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) sh.f1770a, 4, (Object) null);
            }
        }
    }

    public final boolean c() {
        ReentrantLock reentrantLock = this.f377h;
        reentrantLock.lock();
        try {
            f();
            w40 w40Var = this.f381l;
            boolean z2 = true;
            if (w40Var == null || w40Var.f2378d) {
                e();
                if (w40Var != null && w40Var.f2378d) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new th(w40Var), 7, (Object) null);
                    this.f371b.a(w40Var.f2375a.f335b);
                }
            } else if (w40Var.f2377c != null) {
                w40Var.f2377c = null;
            } else {
                z2 = false;
            }
            return z2;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final cc0 d() {
        ReentrantLock reentrantLock = this.f377h;
        reentrantLock.lock();
        try {
            f();
            w40 w40Var = this.f381l;
            return w40Var != null ? w40Var.f2375a : null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID()");
        cc0 cc0Var = new cc0(uuidRandomUUID);
        w40 w40Var = new w40(cc0Var, DateTimeUtils.nowInSecondsPrecise(), null, false);
        this.f381l = w40Var;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new uh(w40Var), 6, (Object) null);
        ((vw) this.f372c).b(ac0.class, new ac0(w40Var));
        ((vw) this.f373d).b(SessionStateChangedEvent.class, new SessionStateChangedEvent(cc0Var.f335b, SessionStateChangedEvent.ChangeType.SESSION_STARTED));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009b A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:3:0x0007, B:5:0x000c, B:7:0x0023, B:8:0x0032, B:9:0x0034, B:11:0x0038, B:13:0x0054, B:15:0x0058, B:17:0x006f, B:19:0x007c, B:21:0x009b, B:22:0x009d, B:25:0x00ab, B:23:0x00a6), top: B:34:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r24 = this;
            r0 = r24
            java.util.concurrent.locks.ReentrantLock r9 = r0.f377h
            r9.lock()
            bo.app.w40 r1 = r0.f381l     // Catch: java.lang.Throwable -> Lbd
            r8 = 0
            if (r1 != 0) goto L34
            com.braze.support.BrazeLogger r10 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Throwable -> Lbd
            bo.app.vh r15 = bo.app.vh.f2046a     // Catch: java.lang.Throwable -> Lbd
            r16 = 7
            r17 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r11 = r0
            com.braze.support.BrazeLogger.brazelog$default(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Lbd
            bo.app.e10 r1 = r0.f371b     // Catch: java.lang.Throwable -> Lbd
            bo.app.zb0 r1 = r1.a()     // Catch: java.lang.Throwable -> Lbd
            if (r1 == 0) goto Lb6
            bo.app.w40 r2 = new bo.app.w40     // Catch: java.lang.Throwable -> Lbd
            bo.app.cc0 r3 = r1.f2375a     // Catch: java.lang.Throwable -> Lbd
            double r4 = r1.f2376b     // Catch: java.lang.Throwable -> Lbd
            java.lang.Double r6 = r1.c()     // Catch: java.lang.Throwable -> Lbd
            boolean r7 = r1.f2378d     // Catch: java.lang.Throwable -> Lbd
            r2.<init>(r3, r4, r6, r7)     // Catch: java.lang.Throwable -> Lbd
        L32:
            r0.f381l = r2     // Catch: java.lang.Throwable -> Lbd
        L34:
            bo.app.w40 r5 = r0.f381l     // Catch: java.lang.Throwable -> Lbd
            if (r5 == 0) goto Lb9
            com.braze.support.BrazeLogger r16 = com.braze.support.BrazeLogger.INSTANCE     // Catch: java.lang.Throwable -> Lbd
            bo.app.wh r1 = new bo.app.wh     // Catch: java.lang.Throwable -> Lbd
            r1.<init>(r5)     // Catch: java.lang.Throwable -> Lbd
            r22 = 7
            r23 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r0
            r21 = r1
            com.braze.support.BrazeLogger.brazelog$default(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> Lbd
            java.lang.Double r2 = r5.f2377c     // Catch: java.lang.Throwable -> Lbd
            if (r2 == 0) goto La6
            boolean r1 = r5.f2378d     // Catch: java.lang.Throwable -> Lbd
            if (r1 != 0) goto La6
            double r6 = r5.f2376b     // Catch: java.lang.Throwable -> Lbd
            double r3 = r2.doubleValue()     // Catch: java.lang.Throwable -> Lbd
            int r1 = r0.f375f     // Catch: java.lang.Throwable -> Lbd
            boolean r13 = r0.f376g     // Catch: java.lang.Throwable -> Lbd
            long r14 = com.braze.support.DateTimeUtils.nowInMilliseconds()     // Catch: java.lang.Throwable -> Lbd
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> Lbd
            long r1 = (long) r1     // Catch: java.lang.Throwable -> Lbd
            long r11 = r10.toMillis(r1)     // Catch: java.lang.Throwable -> Lbd
            if (r13 == 0) goto Lab
            long r1 = (long) r6     // Catch: java.lang.Throwable -> Lbd
            long r3 = r10.toMillis(r1)     // Catch: java.lang.Throwable -> Lbd
            long r3 = r3 + r11
            long r1 = bo.app.ci.f369o     // Catch: java.lang.Throwable -> Lbd
            long r3 = r3 + r1
            int r1 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r1 > 0) goto La6
        L7c:
            com.braze.support.BrazeLogger$Priority r18 = com.braze.support.BrazeLogger.Priority.I     // Catch: java.lang.Throwable -> Lbd
            bo.app.xh r1 = new bo.app.xh     // Catch: java.lang.Throwable -> Lbd
            r1.<init>(r5)     // Catch: java.lang.Throwable -> Lbd
            r22 = 6
            r23 = 0
            r19 = 0
            r20 = 0
            r17 = r0
            r21 = r1
            com.braze.support.BrazeLogger.brazelog$default(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> Lbd
            r0.g()     // Catch: java.lang.Throwable -> Lbd
            bo.app.e10 r2 = r0.f371b     // Catch: java.lang.Throwable -> Lbd
            bo.app.w40 r1 = r0.f381l     // Catch: java.lang.Throwable -> Lbd
            if (r1 == 0) goto La9
            bo.app.cc0 r1 = r1.f2375a     // Catch: java.lang.Throwable -> Lbd
        L9d:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lbd
            r2.a(r1)     // Catch: java.lang.Throwable -> Lbd
            r0.f381l = r8     // Catch: java.lang.Throwable -> Lbd
        La6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lbd
            goto Lb9
        La9:
            r1 = r8
            goto L9d
        Lab:
            long r1 = (long) r3     // Catch: java.lang.Throwable -> Lbd
            long r2 = r10.toMillis(r1)     // Catch: java.lang.Throwable -> Lbd
            long r2 = r2 + r11
            int r1 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r1 > 0) goto La6
            goto L7c
        Lb6:
            r2 = r8
            goto L32
        Lb9:
            r9.unlock()
            return
        Lbd:
            r0 = move-exception
            r9.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.ci.f():void");
    }

    public final void g() {
        w40 w40Var = this.f381l;
        if (w40Var != null) {
            ReentrantLock reentrantLock = this.f377h;
            reentrantLock.lock();
            try {
                w40Var.f2378d = true;
                w40Var.f2377c = Double.valueOf(DateTimeUtils.nowInSecondsPrecise());
                this.f371b.a(w40Var);
                ((vw) this.f372c).b(dc0.class, new dc0(w40Var));
                ((vw) this.f373d).b(SessionStateChangedEvent.class, new SessionStateChangedEvent(w40Var.f2375a.f335b, SessionStateChangedEvent.ChangeType.SESSION_ENDED));
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
