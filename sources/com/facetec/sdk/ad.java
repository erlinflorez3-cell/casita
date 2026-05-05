package com.facetec.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
final class ad {
    static volatile String B = "";
    static volatile String V = "";
    private static ad Z = null;
    private final ArrayList<WeakReference<Code>> C;
    private final ArrayList<WeakReference<Z>> Code;
    private ah D;
    private final ExecutorService F;
    private final ArrayList<WeakReference<B>> I;
    private final WeakReference<Activity> L;
    private ac S;

    /* JADX INFO: renamed from: a */
    private ag f2881a;

    /* JADX INFO: renamed from: b */
    private ae f2882b;

    /* JADX INFO: renamed from: c */
    private aj f2883c;

    /* JADX INFO: renamed from: d */
    private ak f2884d;

    /* JADX INFO: renamed from: e */
    private al f2885e;

    /* JADX INFO: renamed from: g */
    private I f2887g;

    /* JADX INFO: renamed from: i */
    private an f2889i;

    /* JADX INFO: renamed from: j */
    private int f2890j;

    /* JADX INFO: renamed from: f */
    private V f2886f = V.NOT_STARTED;

    /* JADX INFO: renamed from: h */
    private final Object f2888h = new Object();

    /* JADX INFO: renamed from: o */
    private final Timer f2895o = new Timer();

    /* JADX INFO: renamed from: n */
    private TimerTask f2894n = null;

    /* JADX INFO: renamed from: k */
    private Date f2891k = null;

    /* JADX INFO: renamed from: m */
    private final Semaphore f2893m = new Semaphore(1);

    /* JADX INFO: renamed from: l */
    private boolean f2892l = false;

    /* JADX INFO: renamed from: com.facetec.sdk.ad$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] B;

        static {
            int[] iArr = new int[V.values().length];
            B = iArr;
            try {
                iArr[V.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                B[V.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                B[V.WAITING_TO_FINISH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                B[V.PRE_SESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                B[V.PROCESSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.ad$10 */
    final class AnonymousClass10 implements Runnable {
        AnonymousClass10() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ad.this.t();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.ad$2 */
    final class AnonymousClass2 extends TimerTask {
        AnonymousClass2() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            ad.B(ad.this);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.ad$3 */
    final class AnonymousClass3 implements Runnable {
        AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ad.this.p();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.ad$4 */
    final class AnonymousClass4 implements Runnable {
        private /* synthetic */ int B;
        private /* synthetic */ int Code;
        private /* synthetic */ Boolean I;
        private /* synthetic */ int V;
        private /* synthetic */ byte[] Z;

        AnonymousClass4(byte[] bArr, int i2, int i3, int i4, Boolean bool) {
            bArr = bArr;
            i = i2;
            i = i3;
            i = i4;
            bool = bool;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (ad.this.f2886f == V.PRE_SESSION) {
                    ad.B(ad.this, bArr, i, i, i, bool);
                } else if (ad.this.f2886f == V.ID_SCAN) {
                    ad.I(ad.this, bArr, i, i, i, bool);
                } else {
                    ad.Z(ad.this, bArr, i, i, i, bool);
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.ad$5 */
    final class AnonymousClass5 extends TimerTask {
        AnonymousClass5() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            ad.B(ad.this);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.ad$6 */
    final class AnonymousClass6 implements Runnable {
        AnonymousClass6() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ad.this.k();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.ad$7 */
    final class AnonymousClass7 implements Runnable {
        AnonymousClass7() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ad.this.o();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.ad$8 */
    final class AnonymousClass8 implements Runnable {
        AnonymousClass8() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ad.this.m();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.ad$9 */
    final class AnonymousClass9 implements Runnable {
        AnonymousClass9() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ad.this.n();
        }
    }

    interface B {
        void Code(ah ahVar, ac acVar);

        void I();

        void V();

        void Z();
    }

    interface Code {
        void I(ag agVar, ae aeVar);
    }

    static class I {
        final int B;
        final int V;
        final byte[] Z;

        I(byte[] bArr, int i2, int i3) {
            this.Z = bArr;
            this.V = i2;
            this.B = i3;
        }
    }

    enum V {
        NOT_STARTED,
        PRE_SESSION,
        PROCESSING,
        ID_SCAN,
        WAITING_TO_FINISH,
        FINISHED
    }

    interface Z {
        void Code(al alVar, aj ajVar, ak akVar, an anVar);
    }

    private ad(Activity activity) throws Throwable {
        this.L = new WeakReference<>(activity);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.od("UK_I\u0015[YMO\u0010DOMARNM?GL\u0005\u001bM96GE?AA", (short) (Od.Xd() ^ (-22395)))).getDeclaredMethod(C1561oA.Kd("XPc@W]W]WG\\g[X\\>r`_rrnr", (short) (ZN.Xd() ^ 4453)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.F = (ExecutorService) declaredMethod.invoke(null, objArr);
            this.Code = new ArrayList<>(2);
            this.I = new ArrayList<>(2);
            this.C = new ArrayList<>(2);
            V = null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void B() {
        B = UUID.randomUUID().toString();
    }

    private static void B(Context context) throws Throwable {
        ai.z(V);
        ai.D(UUID.nameUUIDFromBytes(n.D(context).getBytes()).toString());
        ai.C(ai.Code);
        ai.A(Build.MODEL);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.Zd("c7\u0004^\u0016d&,,\u001dR%p.z\u0011pQ7\n5\u001d_", (short) (C1607wl.Xd() ^ 20527), (short) (C1607wl.Xd() ^ 19537))).getMethod(C1561oA.Xd("\t\b\u0018t\u0007\n\u0013\n\u0011\u0010y\u000e\u001b\u0014", (short) (C1499aX.Xd() ^ (-11673))), new Class[0]);
        try {
            method.setAccessible(true);
            ai.G((String) method.invoke(context, objArr));
            ai.H(Wg.vd("UIRKL", (short) (FB.Xd() ^ 11113)));
            ai.F(bt.Code());
            ai.E(bt.I(context));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static /* synthetic */ void B(ad adVar) {
        synchronized (adVar.f2888h) {
            if (adVar.f2886f != V.FINISHED && adVar.f2886f != V.WAITING_TO_FINISH) {
                if (adVar.f2891k == null || new Date().getTime() - adVar.f2891k.getTime() <= 615000) {
                    return;
                }
                L.V(new Throwable("Phoenix hang was detected"));
                adVar.V(false);
                adVar.D = ah.PROCESSING_COMPLETE_TIMED_OUT;
                adVar.j();
            }
        }
    }

    static /* synthetic */ void B(ad adVar, byte[] bArr, int i2, int i3, int i4, Boolean bool) throws Throwable {
        synchronized (adVar.f2888h) {
            if (adVar.f2886f != V.PRE_SESSION) {
                return;
            }
            int i5 = adVar.f2890j + 1;
            adVar.f2890j = i5;
            if (i5 >= 4) {
                if (j.V) {
                    Class<?> cls = Class.forName(Qg.kd("{\b|\n\u0006~xA\b\u0006y{<Om~o?<", (short) (Od.Xd() ^ (-14530)), (short) (Od.Xd() ^ (-11659))));
                    Class<?>[] clsArr = {byte[].class, Integer.TYPE};
                    Object[] objArr = {bArr, 2};
                    short sXd = (short) (C1580rY.Xd() ^ (-24909));
                    short sXd2 = (short) (C1580rY.Xd() ^ (-19981));
                    int[] iArr = new int["_g[fZZHbEebX\\T".length()];
                    QB qb = new QB("_g[fZZHbEebX\\T");
                    int i6 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i6] = xuXd.fK(sXd + i6 + xuXd.CK(iKK) + sXd2);
                        i6++;
                    }
                    Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i6), clsArr);
                    try {
                        declaredMethod.setAccessible(true);
                        ai.i((String) declaredMethod.invoke(null, objArr), bArr, bool.booleanValue(), i2, i3, i4, true);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } else {
                    ai.i("", bArr, bool.booleanValue(), i2, i3, i4, true);
                }
                adVar.f2885e = ai.D();
                adVar.f2883c = ai.C();
                adVar.f2884d = ai.F();
                adVar.f2889i = ai.S();
                adVar.h();
            }
        }
    }

    static synchronized ad Code(Activity activity) throws Throwable {
        if (Z == null) {
            Z = new ad(activity);
            ai.B(activity);
        }
        return Z;
    }

    static synchronized void Code() {
        if (Z == null) {
            ai.V();
        }
    }

    static synchronized void I() {
        ad adVar = Z;
        if (adVar != null) {
            adVar.D();
            adVar.V(true);
            try {
                adVar.F.awaitTermination(2L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
            }
            Z = null;
        }
    }

    static /* synthetic */ void I(ad adVar, byte[] bArr, int i2, int i3, int i4, Boolean bool) {
        synchronized (adVar.f2888h) {
            if (adVar.f2886f != V.ID_SCAN) {
                return;
            }
            int i5 = adVar.f2890j + 1;
            adVar.f2890j = i5;
            if (i5 >= 4) {
                ai.j(bArr, bool.booleanValue(), i2, i3, i4);
                adVar.f2881a = ai.e();
                adVar.f2882b = ai.h();
                adVar.g();
            }
        }
    }

    static boolean S() {
        return ai.N();
    }

    private static void V(Context context) {
        if (bz.B(context)) {
            ai.w();
        }
        if (com.facetec.sdk.Z.V(context)) {
            ai.s();
        }
    }

    static /* synthetic */ void Z(ad adVar, byte[] bArr, int i2, int i3, int i4, Boolean bool) throws Throwable {
        synchronized (adVar.f2888h) {
            if (adVar.f2886f != V.FINISHED && adVar.f2886f != V.WAITING_TO_FINISH) {
                int i5 = adVar.f2890j + 1;
                adVar.f2890j = i5;
                if (i5 >= 4) {
                    short sXd = (short) (C1633zX.Xd() ^ (-8601));
                    int[] iArr = new int[")5*73,&n53')i|\u001b,\u001dli".length()];
                    QB qb = new QB(")5*73,&n53')i|\u001b,\u001dli");
                    int i6 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i6] = xuXd.fK(sXd + i6 + xuXd.CK(iKK));
                        i6++;
                    }
                    Object[] objArr = {bArr, 2};
                    Method declaredMethod = Class.forName(new String(iArr, 0, i6)).getDeclaredMethod(C1561oA.yd("4>4A79)E\u001a<;393", (short) (OY.Xd() ^ 11232)), byte[].class, Integer.TYPE);
                    try {
                        declaredMethod.setAccessible(true);
                        ai.i((String) declaredMethod.invoke(null, objArr), bArr, bool.booleanValue(), i2, i3, i4, false);
                        adVar.D = ai.L();
                        adVar.S = ai.a();
                        if (adVar.D.B()) {
                            adVar.f2886f = V.WAITING_TO_FINISH;
                        }
                        if (adVar.D == ah.PROCESSING_COMPLETE_TIMED_OUT || adVar.D == ah.PROCESSING_COMPLETE_RETRY || adVar.D == ah.PROCESSING_COMPLETE_SUCCESS) {
                            adVar.f2886f = V.WAITING_TO_FINISH;
                        }
                        adVar.j();
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }
            }
        }
    }

    public void b() {
        this.f2892l = false;
        this.f2893m.release();
    }

    private static void d() {
        if (V == null) {
            V = UUID.randomUUID().toString();
        } else {
            if (V.equals("")) {
                return;
            }
            V = UUID.randomUUID().toString();
        }
    }

    private void e() {
        synchronized (this.f2895o) {
            this.f2891k = null;
            TimerTask timerTask = this.f2894n;
            if (timerTask != null) {
                timerTask.cancel();
                this.f2894n = null;
            }
        }
    }

    private synchronized List<Z> f() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.Code.size());
        Iterator<WeakReference<Z>> it = this.Code.iterator();
        while (it.hasNext()) {
            Z z2 = it.next().get();
            if (z2 != null) {
                arrayList.add(z2);
            }
        }
        return arrayList;
    }

    private synchronized void g() {
        Activity activity = this.L.get();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.facetec.sdk.ad.3
            AnonymousClass3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ad.this.p();
            }
        });
    }

    private synchronized void h() {
        Activity activity = this.L.get();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.facetec.sdk.ad.10
            AnonymousClass10() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ad.this.t();
            }
        });
    }

    private synchronized List<B> i() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.I.size());
        Iterator<WeakReference<B>> it = this.I.iterator();
        while (it.hasNext()) {
            B b2 = it.next().get();
            if (b2 != null) {
                arrayList.add(b2);
            }
        }
        return arrayList;
    }

    private synchronized void j() {
        Activity activity = this.L.get();
        if (activity == null) {
            return;
        }
        if (this.D == ah.PROCESSING_COMPLETE_STILL_COMPUTING) {
            return;
        }
        if (this.D == ah.PROCESSING_COMPLETE_TIMED_OUT) {
            activity.runOnUiThread(new Runnable() { // from class: com.facetec.sdk.ad.6
                AnonymousClass6() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ad.this.k();
                }
            });
            return;
        }
        if (this.D == ah.PROCESSING_COMPLETE_RETRY) {
            activity.runOnUiThread(new Runnable() { // from class: com.facetec.sdk.ad.9
                AnonymousClass9() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ad.this.n();
                }
            });
        } else if (this.D == ah.PROCESSING_COMPLETE_SUCCESS) {
            activity.runOnUiThread(new Runnable() { // from class: com.facetec.sdk.ad.7
                AnonymousClass7() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ad.this.o();
                }
            });
        } else {
            activity.runOnUiThread(new Runnable() { // from class: com.facetec.sdk.ad.8
                AnonymousClass8() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ad.this.m();
                }
            });
        }
    }

    public synchronized void k() {
        Iterator<B> it = i().iterator();
        while (it.hasNext()) {
            it.next().V();
        }
    }

    private synchronized List<Code> l() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.C.size());
        Iterator<WeakReference<Code>> it = this.C.iterator();
        while (it.hasNext()) {
            Code code = it.next().get();
            if (code != null) {
                arrayList.add(code);
            }
        }
        return arrayList;
    }

    public synchronized void m() {
        Iterator<B> it = i().iterator();
        while (it.hasNext()) {
            it.next().Code(this.D, this.S);
        }
    }

    public synchronized void n() {
        Iterator<B> it = i().iterator();
        while (it.hasNext()) {
            it.next().I();
        }
    }

    public synchronized void o() {
        Iterator<B> it = i().iterator();
        while (it.hasNext()) {
            it.next().Z();
        }
    }

    public synchronized void p() {
        Iterator<Code> it = l().iterator();
        while (it.hasNext()) {
            it.next().I(this.f2881a, this.f2882b);
        }
    }

    public synchronized void t() {
        Iterator<Z> it = f().iterator();
        while (it.hasNext()) {
            it.next().Code(this.f2885e, this.f2883c, this.f2884d, this.f2889i);
        }
    }

    final synchronized void B(B b2) {
        this.I.add(new WeakReference<>(b2));
    }

    final synchronized void C() {
        boolean z2;
        synchronized (this.f2888h) {
            if (this.f2886f == V.ID_SCAN || this.f2886f == V.PRE_SESSION || this.f2886f == V.PROCESSING || this.f2886f == V.WAITING_TO_FINISH) {
                this.f2886f = V.FINISHED;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (z2) {
            ai.h(false);
        }
    }

    final synchronized void Code(Z z2) {
        Iterator<WeakReference<Z>> it = this.Code.iterator();
        while (it.hasNext()) {
            if (it.next().get() == z2) {
                it.remove();
            }
        }
    }

    final synchronized boolean Code(Context context) {
        this.f2890j = 0;
        this.f2885e = al.DETECTING_LIGHT_MODE;
        int i2 = AnonymousClass1.B[this.f2886f.ordinal()];
        if (i2 == 1 || i2 == 2) {
            if (!ai.c()) {
                return false;
            }
            this.f2886f = V.PRE_SESSION;
            V(context);
            d();
            B(context);
        } else if (i2 == 3 || i2 == 4) {
            return false;
        }
        return true;
    }

    final void D() {
        synchronized (this.f2888h) {
            if (this.f2886f == V.PRE_SESSION || this.f2886f == V.PROCESSING || this.f2886f == V.ID_SCAN) {
                this.f2886f = V.WAITING_TO_FINISH;
            }
        }
        e();
        this.Code.clear();
        this.I.clear();
        this.C.clear();
        this.F.shutdown();
    }

    final synchronized void F() {
        boolean z2;
        synchronized (this.f2888h) {
            if (this.f2886f == V.PRE_SESSION || this.f2886f == V.PROCESSING || this.f2886f == V.WAITING_TO_FINISH) {
                this.f2886f = V.FINISHED;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (z2) {
            ai.f(true);
        }
    }

    final synchronized void I(B b2) {
        Iterator<WeakReference<B>> it = this.I.iterator();
        while (it.hasNext()) {
            if (it.next().get() == b2) {
                it.remove();
            }
        }
    }

    final synchronized void L() {
        synchronized (this.f2888h) {
            if (this.f2886f == V.PROCESSING || this.f2886f == V.WAITING_TO_FINISH) {
                this.f2886f = V.FINISHED;
            }
        }
        e();
        this.Code.clear();
        this.I.clear();
    }

    final I V() {
        return this.f2887g;
    }

    final synchronized void V(Z z2) {
        this.Code.add(new WeakReference<>(z2));
    }

    final synchronized void V(boolean z2) {
        boolean z3;
        synchronized (this.f2888h) {
            if (this.f2886f == V.PROCESSING || this.f2886f == V.WAITING_TO_FINISH) {
                this.f2886f = V.FINISHED;
                z3 = true;
            } else {
                z3 = false;
            }
        }
        e();
        if (z3) {
            ai.e(z2);
        }
    }

    final synchronized void Z(Code code) {
        this.C.add(new WeakReference<>(code));
    }

    final void Z(byte[] bArr, int i2, int i3, int i4, Boolean bool) {
        this.f2887g = new I(bArr, i2, i3);
        if (this.f2891k == null) {
            this.f2891k = new Date();
        }
        if (Z() && this.f2893m.tryAcquire()) {
            this.f2892l = true;
            try {
                this.F.execute(new Runnable() { // from class: com.facetec.sdk.ad.4
                    private /* synthetic */ int B;
                    private /* synthetic */ int Code;
                    private /* synthetic */ Boolean I;
                    private /* synthetic */ int V;
                    private /* synthetic */ byte[] Z;

                    AnonymousClass4(byte[] bArr2, int i22, int i32, int i42, Boolean bool2) {
                        bArr = bArr2;
                        i = i22;
                        i = i32;
                        i = i42;
                        bool = bool2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (ad.this.f2886f == V.PRE_SESSION) {
                                ad.B(ad.this, bArr, i, i, i, bool);
                            } else if (ad.this.f2886f == V.ID_SCAN) {
                                ad.I(ad.this, bArr, i, i, i, bool);
                            } else {
                                ad.Z(ad.this, bArr, i, i, i, bool);
                            }
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                });
            } catch (RejectedExecutionException unused) {
                b();
            }
        }
    }

    final boolean Z() {
        boolean z2;
        synchronized (this.f2888h) {
            z2 = (this.f2886f == V.PRE_SESSION || this.f2886f == V.PROCESSING || this.f2886f == V.ID_SCAN) && !this.f2892l;
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x001b A[Catch: all -> 0x0061, TryCatch #0 {, blocks: (B:42:0x0002, B:60:0x0042, B:61:0x0044, B:64:0x0059, B:68:0x005f, B:69:0x0060, B:56:0x002e, B:58:0x0032, B:59:0x0038, B:51:0x001b, B:55:0x0023, B:62:0x0045, B:63:0x0058), top: B:73:0x0002, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final synchronized boolean Z(android.content.Context r10, java.lang.String r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            r3 = 0
            r9.f2890j = r3     // Catch: java.lang.Throwable -> L61
            int[] r1 = com.facetec.sdk.ad.AnonymousClass1.B     // Catch: java.lang.Throwable -> L61
            com.facetec.sdk.ad$V r0 = r9.f2886f     // Catch: java.lang.Throwable -> L61
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L61
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L61
            r2 = 1
            if (r1 == r2) goto L1b
            r0 = 2
            if (r1 == r0) goto L1b
            r0 = 3
            if (r1 == r0) goto L2e
            r0 = 4
            if (r1 == r0) goto L1b
            goto L42
        L1b:
            boolean r0 = com.facetec.sdk.ai.b(r11)     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L23
            monitor-exit(r9)
            return r3
        L23:
            com.facetec.sdk.ad$V r0 = com.facetec.sdk.ad.V.PROCESSING     // Catch: java.lang.Throwable -> L61
            r9.f2886f = r0     // Catch: java.lang.Throwable -> L61
            V(r10)     // Catch: java.lang.Throwable -> L61
            d()     // Catch: java.lang.Throwable -> L61
            goto L42
        L2e:
            boolean r0 = com.facetec.sdk.be.Code     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L38
            com.facetec.sdk.ai.e(r2)     // Catch: java.lang.Throwable -> L61
            com.facetec.sdk.ai.b(r11)     // Catch: java.lang.Throwable -> L61
        L38:
            com.facetec.sdk.ai.Z()     // Catch: java.lang.Throwable -> L61
            com.facetec.sdk.ad$V r0 = com.facetec.sdk.ad.V.PROCESSING     // Catch: java.lang.Throwable -> L61
            r9.f2886f = r0     // Catch: java.lang.Throwable -> L61
            d()     // Catch: java.lang.Throwable -> L61
        L42:
            java.util.Timer r1 = r9.f2895o     // Catch: java.lang.Throwable -> L61
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L61
            r9.e()     // Catch: java.lang.Throwable -> L5e
            com.facetec.sdk.ad$2 r4 = new com.facetec.sdk.ad$2     // Catch: java.lang.Throwable -> L5e
            r4.<init>()     // Catch: java.lang.Throwable -> L5e
            r9.f2894n = r4     // Catch: java.lang.Throwable -> L5e
            java.util.Timer r3 = r9.f2895o     // Catch: java.lang.Throwable -> L5e
            r5 = 60
            r7 = 10000(0x2710, double:4.9407E-320)
            r3.scheduleAtFixedRate(r4, r5, r7)     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5e
            B(r10)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r9)
            return r2
        L5e:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L61
            throw r0     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L61
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ad.Z(android.content.Context, java.lang.String):boolean");
    }

    final synchronized boolean Z(boolean z2) {
        this.f2890j = 0;
        int i2 = AnonymousClass1.B[this.f2886f.ordinal()];
        if (i2 == 1 || i2 == 2) {
            if (!ai.g(z2)) {
                return false;
            }
            this.f2886f = V.ID_SCAN;
        } else {
            if (i2 == 3 || i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                return false;
            }
        }
        synchronized (this.f2895o) {
            e();
            AnonymousClass5 anonymousClass5 = new TimerTask() { // from class: com.facetec.sdk.ad.5
                AnonymousClass5() {
                }

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    ad.B(ad.this);
                }
            };
            this.f2894n = anonymousClass5;
            this.f2895o.scheduleAtFixedRate(anonymousClass5, 60L, 10000L);
        }
        return true;
    }

    final al a() {
        al alVarD = ai.D();
        this.f2885e = alVarD;
        return alVarD;
    }

    final ak c() {
        ak akVarF = ai.F();
        this.f2884d = akVarF;
        return akVarF;
    }
}
