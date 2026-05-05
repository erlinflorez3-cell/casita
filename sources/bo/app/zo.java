package bo.app;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
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
public final class zo {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f2409m = BrazeLogger.getBrazeLogTag((Class<?>) zo.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v00 f2411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ao f2412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jo f2413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fo f2414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f2416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f2417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConnectivityManager f2418i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z40 f2419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Job f2420k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2421l;

    public zo(Context context, vw vwVar, ao aoVar) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.Yd("$118*>;", (short) (Od.Xd() ^ (-12958))));
        Intrinsics.checkNotNullParameter(vwVar, Xg.qd("17>0>;/;\u0015G7AH%K9DBMCAO", (short) (ZN.Xd() ^ 16278), (short) (ZN.Xd() ^ 2885)));
        Intrinsics.checkNotNullParameter(aoVar, Jg.Wd("\\m\u00056lf_Y=}\u0003~F\u0019jk_\u0007\u007f\u0004\u000f=kdwv~{V", (short) (ZN.Xd() ^ 12459), (short) (ZN.Xd() ^ 11262)));
        this.f2410a = context;
        this.f2411b = vwVar;
        this.f2412c = aoVar;
        this.f2415f = 2;
        this.f2416g = -1L;
        Object[] objArr = {ZO.xd("\u0017,e<*6s}4A^X", (short) (C1499aX.Xd() ^ (-5209)), (short) (C1499aX.Xd() ^ (-20211)))};
        Method method = Class.forName(C1626yg.Ud("wY\u0012|\u0018pAnqJ<KhQ\u0005rEc)<<\u0002d", (short) (C1580rY.Xd() ^ (-23372)), (short) (C1580rY.Xd() ^ (-4054)))).getMethod(EO.Od("P!>@V%FO\u001eThS\"\u001bxU", (short) (FB.Xd() ^ 22893)), Class.forName(Ig.wd("&F\f\u00183\u00150j\u0019Qr{'\u001eA\u001e", (short) (C1633zX.Xd() ^ (-2928)))));
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            Intrinsics.checkNotNull(objInvoke, C1561oA.Qd("z\u0001vu(jgsrrv!bd\u001e`]nn\u0019lf\u0016cca\u001f_e[Z\r`dZN\bHTIVRKE\u000eMCQ\n\u001eIGF<9I=I;EI\u001c/;-2/;", (short) (C1607wl.Xd() ^ 5803)));
            this.f2418i = (ConnectivityManager) objInvoke;
            this.f2419j = z40.GOOD;
            if (Build.VERSION.SDK_INT >= 30) {
                this.f2414e = new fo(this);
            } else {
                this.f2413d = new jo(this);
            }
            a(vwVar);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final void a(zo this$0, ec0 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f2415f = 1;
        this$0.a();
    }

    public static final void a(zo this$0, hc0 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f2415f = 2;
        this$0.a();
    }

    public final void a() {
        long j2;
        int intValue;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new po(this), 6, (Object) null);
        long j3 = this.f2416g;
        if (this.f2415f == 2 || this.f2421l) {
            this.f2416g = -1L;
        } else {
            int iOrdinal = this.f2419j.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    intValue = this.f2412c.getIntValue("com_braze_data_flush_interval_bad_network", 60);
                } else if (iOrdinal == 2) {
                    intValue = this.f2412c.getIntValue("com_braze_data_flush_interval_good_network", 30);
                } else {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    intValue = this.f2412c.getIntValue("com_braze_data_flush_interval_great_network", 10);
                }
                j2 = ((long) intValue) * 1000;
            } else {
                j2 = -1;
            }
            this.f2416g = j2;
            if (j2 != -1 && j2 < 1000) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new qo(this), 6, (Object) null);
                this.f2416g = 1000L;
            }
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (Function0) new ro(this), 6, (Object) null);
        if (j3 != this.f2416g) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new so(j3, this), 7, (Object) null);
            a(this.f2416g);
        }
    }

    public final void a(long j2) {
        Job job = this.f2420k;
        Job jobLaunch$default = null;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f2420k = null;
        if (this.f2416g >= 1000) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new to(j2), 7, (Object) null);
            if (this.f2416g >= 1000) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new ko(j2, this), 6, (Object) null);
                jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new mo(this, j2, null), 3, null);
            } else {
                Braze.Companion.getInstance(this.f2410a).requestImmediateDataFlush();
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new no(this), 7, (Object) null);
            }
            this.f2420k = jobLaunch$default;
        }
    }

    public final void a(NetworkCapabilities networkCapabilities) {
        z40 z40Var = this.f2419j;
        z40 z40VarA = com.braze.support.c.a(networkCapabilities);
        this.f2419j = z40VarA;
        if (z40Var != z40VarA) {
            ((vw) this.f2411b).b(a50.class, new a50(z40Var, z40VarA));
        }
        a();
    }

    public final void a(vw eventManager) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        eventManager.c(new IEventSubscriber() { // from class: bo.app.zo$$ExternalSyntheticLambda0
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                zo.a(this.f$0, (ec0) obj);
            }
        }, ec0.class);
        eventManager.c(new IEventSubscriber() { // from class: bo.app.zo$$ExternalSyntheticLambda1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                zo.a(this.f$0, (hc0) obj);
            }
        }, hc0.class);
    }

    public final synchronized void a(boolean z2) {
        this.f2421l = z2;
        a();
        if (z2) {
            c();
        } else {
            b();
        }
    }

    public final synchronized void b() {
        if (this.f2417h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) uo.f1958a, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) vo.f2058a, 7, (Object) null);
        if (Build.VERSION.SDK_INT >= 30) {
            ConnectivityManager connectivityManager = this.f2418i;
            fo foVar = this.f2414e;
            if (foVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException(C1593ug.zd(",99:21C9G;GM#;KOHLF\u001f>JKBBEN", (short) (C1580rY.Xd() ^ (-27895)), (short) (C1580rY.Xd() ^ (-32393))));
                foVar = null;
            }
            connectivityManager.registerDefaultNetworkCallback(foVar);
            a(this.f2418i.getNetworkCapabilities(this.f2418i.getActiveNetwork()));
        } else {
            IntentFilter intentFilter = new IntentFilter(C1561oA.od("1=2?;4.v6,:r'20/m\u0002\r\u000b\n\u007f|\r\u0001\r~\t\r\u0012txp|tq", (short) (C1580rY.Xd() ^ (-24625))));
            Context context = this.f2410a;
            jo joVar = this.f2413d;
            Class<?> cls = Class.forName(C1561oA.Kd("s\u0002x\b\u0006\u0001|G}\u000b\u000b\u0012\u0004\u000e\u0015Oe\u0013\u0013\u001a\f \u001d", (short) (C1499aX.Xd() ^ (-31193))));
            Class<?>[] clsArr = new Class[2];
            short sXd = (short) (C1607wl.Xd() ^ 3180);
            short sXd2 = (short) (C1607wl.Xd() ^ 31410);
            int[] iArr = new int["k!`\u0019^\u0002E76l5b\u001dO\u001f\u0002_8}\u001af\u000eT\u0010Ya>d/\\4K\"".length()];
            QB qb = new QB("k!`\u0019^\u0002E76l5b\u001dO\u001f\u0002_8}\u001af\u000eT\u0010Ya>d/\\4K\"");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            clsArr[1] = Class.forName(C1561oA.Xd(">LCRPKG\u0012HUU\\NX_\u001a6\\cU_f9]aj\\j", (short) (C1499aX.Xd() ^ (-7671))));
            Object[] objArr = {joVar, intentFilter};
            Method method = cls.getMethod(Wg.vd("PDCFMO=K8LGJKYES", (short) (C1499aX.Xd() ^ (-29547))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        a(this.f2416g);
        this.f2417h = true;
    }

    public final synchronized void c() {
        if (!this.f2417h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) wo.f2160a, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) xo.f2233a, 7, (Object) null);
        Job job = this.f2420k;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f2420k = null;
        d();
        this.f2417h = false;
    }

    public final void d() throws Throwable {
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                ConnectivityManager connectivityManager = this.f2418i;
                fo foVar = this.f2414e;
                if (foVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(Qg.kd("\u0011\u001c\u001a\u0019\u000f\f\u001c\u0010\u001c\u000e\u0018\u001co\u0006\u0014\u0016\r\u000f\u0007]z\u0005\u0004xvw~", (short) (FB.Xd() ^ 30961), (short) (FB.Xd() ^ 9275)));
                    foVar = null;
                }
                connectivityManager.unregisterNetworkCallback(foVar);
                return;
            }
            Context context = this.f2410a;
            jo joVar = this.f2413d;
            Class<?> cls = Class.forName(yg.hg.Vd("y\u0006z\b\u0004|v?s~|\u0002qy~7Kvtyi{v", (short) (FB.Xd() ^ 28315), (short) (FB.Xd() ^ 18264)));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(C1561oA.ud("!-\"/+$\u001ef\u001b&$)\u0019!&^q!\u001d\u000e\u0010\u000e\u000b\u001c\u001cx\u000b\b\t\f\u0018\u0006\u0012", (short) (C1499aX.Xd() ^ (-3712))));
            Object[] objArr = {joVar};
            Method method = cls.getMethod(C1561oA.yd("LDG9BCLL4@\u001f167:FLX", (short) (C1580rY.Xd() ^ (-12694))), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) yo.f2323a, 4, (Object) null);
        }
    }
}
