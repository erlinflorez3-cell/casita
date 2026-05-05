package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.ReportFragment;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.hg;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 5 more
    */
/* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000fq|<$i-yّCU0}*ޛWNumvJ`\fK\u000f\u0014\u0016\u0001j2P]xs\u0012\u00172HuU\u074ck\u0015m9\u000fsn\u0005DWb=\u007f\u0005в\u001e*V\u0010?\u0006Q^$\u0012^T7íň\u0011M\u000b/Z\u0011L6\u0019\u001e\u000b{\u0015ȤՂp]@Fk\u000ewZf'\u000eDCձϘJT-&?l,EX7c)kمΫ\u000bRaZKR\u007fY\u001dhU;[M\u0002tNX.2[ۀ̠\u0011]xE%\u0010_\u0001$'Yc*֟ח\u0012(}\u001cD\u0018J&&\u0006U\\tƦբj\b\u0014VE~aAh\u0002\rDVаcي\u001b%\bđ{G)iicQ\u0018|;R˟\u0019̷'\u0001vď,`\u001ce-\u001b\u0003}(ĻS͘AHVˣ*O{\u000b\tb02:\u0005\u001eĠ1ɨ\u00152/'=dG-qw\u0010S\\g%\u00117è_ׂVHH̎?\"E7!\f\tR;ʐmÏXX4Ҋ\u001e(b\u0016\u0016\bA03ɿHƼ)\u0010Vи9ux^u\nS?=ƀeˇo\u000e_ު/?Cc{\u0010\u0010^MܠKםf\u0005`٨ͤW2"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E+\u000e!\u0015G}\u001c#z&5W\u0012\u001e>m\u007f@VCHA", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "u(E", "2d[.l,=>\u0015\u000f\t^\u0019\r\u00128a|/{", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "6`]1_,K", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "7mXA\\(EW.z\nb6\u0006o3s\u000f(\u0005@\u000e", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E-\u0001\"!T~nIr'=Y\u0007/uI\u0014=QT?zH\u0002\u001elp=\u0003j0cr6KVW\u0013``\u0002=\u001d\u0012gc", ":hU2V@<Z\u0019", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvz", "5dc\u0019\\->Q-|\u0002^", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J}\u001bHo\fPt,5/", ">`d@X\u001a>\\(", "", "@dV6f;Kg", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u00125[\u0002.Fz*\u0004", "@dbB`,=1#\u000f\u0004m,\n", "", "AsP?g,=1#\u000f\u0004m,\n", "As^=F,Gb", "/bc6i0Mg\u0004z\u000bl,{", "", "/bc6i0Mg\u0004z\u000bl,{G6i\u0001(yT~\u001e\u0017Az\u001bFt%Cgw-7t\u0016*[C", "/bc6i0Mg\u0006~\tn4|\b", "/bc6i0Mg\u0006~\tn4|\bml\u0004){>\u0015\u0015\u001eGi\u0019I\u0001#5g\f\u001aDm\u001d.IQ;", "/bc6i0Mg\u0007\u000evk;|\b", "/bc6i0Mg\u0007\u000evk;|\bml\u0004){>\u0015\u0015\u001eGi\u0019I\u0001#5g\f\u001aDm\u001d.IQ;", "/bc6i0Mg\u0007\u000e\u0005i7|\b", "/bc6i0Mg\u0007\u000e\u0005i7|\bml\u0004){>\u0015\u0015\u001eGi\u0019I\u0001#5g\f\u001aDm\u001d.IQ;", "/sc.V/", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/sc.V/|Z\u001d\u007fz\\@z\u0010/_\u000b5\u0006>\u0001%%A|\u000eCv!CY", "2hb=T;<V\u0004z\u000bl,`\n\u0018e\u007f'{?", "2hb=T;<V\u0004z\u000bl,`\n\u0018e\u007f'{??\u001e\u001bHo\fPt,5S\t-Ak\u0016<[=Hk;\u001e\u0011va", "2hb=T;<V\u0007\u000e\u0005i\u0010}q/e~(z", "2hb=T;<V\u0007\u000e\u0005i\u0010}q/e~(z~\b\u001b\u0018Gm\":}%/d\u000b*5m$<GP;r4\u001a#h", "\u000foX~,\u0010F^ ", "\u0011n\\=T5B]\"", ":hU2V@<Z\u0019F\u0006k6z\t=sy5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ProcessLifecycleOwner implements LifecycleOwner {
    public static final long TIMEOUT_MS = 700;
    private Handler handler;
    private int resumedCounter;
    private int startedCounter;
    public static final Companion Companion = new Companion(null);
    private static final ProcessLifecycleOwner newInstance = new ProcessLifecycleOwner();
    private boolean pauseSent = true;
    private boolean stopSent = true;
    private final LifecycleRegistry registry = new LifecycleRegistry(this);
    private final Runnable delayedPauseRunnable = new Runnable() { // from class: androidx.lifecycle.ProcessLifecycleOwner$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            ProcessLifecycleOwner.delayedPauseRunnable$lambda$0(this.f$0);
        }
    };
    private final ReportFragment.ActivityInitializationListener initializationListener = new ReportFragment.ActivityInitializationListener() { // from class: androidx.lifecycle.ProcessLifecycleOwner$initializationListener$1
        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onCreate() {
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onStart() {
            this.this$0.activityStarted$lifecycle_process_release();
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        public void onResume() {
            this.this$0.activityResumed$lifecycle_process_release();
        }
    };

    @JvmStatic
    public static final LifecycleOwner get() {
        return Companion.get();
    }

    private ProcessLifecycleOwner() {
    }

    public static final void delayedPauseRunnable$lambda$0(ProcessLifecycleOwner this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dispatchPauseIfNeeded$lifecycle_process_release();
        this$0.dispatchStopIfNeeded$lifecycle_process_release();
    }

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126B\u0005\"4\u0012\u000e\u0007nʑA0ZeP\u008cZS8\u000fsڔ<$q$yCAU ԉ#\u001fѧ~g\u0016m\u000b_\u0011CǇ\n\u0016\u0007jtOc~u\u0012=9\tt\bF[wU9\u000f}f\t.<:8(\u0010G\u0019ݵL\u0010|\u0007\u0014_\u001a\u0013H@\u001f<\t҈$ĪlŪ\nD(ҵ.^mQDH=iH3;\u0003\u0018G%ώa݁\u0001M\u0015Ͽÿ+\u001a"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E+\u000e!\u0015G}\u001c#z&5W\u0012\u001e>m\u007f@VCH*\u0012(\u001ds]B\u000bm5$", "", "u(E", "\"H<\u0012B\u001c-M\u0001l", "", "5dc!<\u0014\u001e=\tmtF\u001a;\u00103f\u007f&\u0010>\b\u0017\u0011R|\u0018:v3CS\u000b >m\u0012<M\u00027t=($dp=\u0011l:", "<df\u0016a:MO\"|z", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E+\u000e!\u0015G}\u001c#z&5W\u0012\u001e>m\u007f@VCHA", "5dc", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "7mXA", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7mXA\u00173BT\u0019|\u000f\\3|\u0003:r\n&{N\u000f\u0011$Gv\u000e8\u0005%", ":hU2V@<Z\u0019F\u0006k6z\t=sy5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getTIMEOUT_MS$lifecycle_process_release$annotations() {
        }

        private Companion() {
        }

        @JvmStatic
        public final LifecycleOwner get() {
            return ProcessLifecycleOwner.newInstance;
        }

        @JvmStatic
        public final void init$lifecycle_process_release(Context context) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "context");
            ProcessLifecycleOwner.newInstance.attach$lifecycle_process_release(context);
        }
    }

    public final void activityStarted$lifecycle_process_release() {
        int i2 = this.startedCounter + 1;
        this.startedCounter = i2;
        if (i2 == 1 && this.stopSent) {
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            this.stopSent = false;
        }
    }

    public final void activityResumed$lifecycle_process_release() {
        int i2 = this.resumedCounter + 1;
        this.resumedCounter = i2;
        if (i2 == 1) {
            if (this.pauseSent) {
                this.registry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                this.pauseSent = false;
            } else {
                Handler handler = this.handler;
                Intrinsics.checkNotNull(handler);
                handler.removeCallbacks(this.delayedPauseRunnable);
            }
        }
    }

    public final void activityPaused$lifecycle_process_release() throws Throwable {
        int i2 = this.resumedCounter - 1;
        this.resumedCounter = i2;
        if (i2 == 0) {
            Handler handler = this.handler;
            Intrinsics.checkNotNull(handler);
            Runnable runnable = this.delayedPauseRunnable;
            Class<?> cls = Class.forName(hg.Vd("{\b|\n\u0006~xA\u0002\u0005>Wo{pwo{", (short) (C1607wl.Xd() ^ 10917), (short) (C1607wl.Xd() ^ 21689)));
            Class<?>[] clsArr = {Class.forName(C1561oA.ud("0&:$o-!-%j\u000e0('\u0019\u0019\"\u001a", (short) (Od.Xd() ^ (-13650)))), Long.TYPE};
            Object[] objArr = {runnable, 700L};
            short sXd = (short) (C1580rY.Xd() ^ (-12104));
            int[] iArr = new int["A?FF\u00199C7B-/".length()];
            QB qb = new QB("A?FF\u00199C7B-/");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i3));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public final void activityStopped$lifecycle_process_release() {
        this.startedCounter--;
        dispatchStopIfNeeded$lifecycle_process_release();
    }

    public final void dispatchPauseIfNeeded$lifecycle_process_release() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }

    public final void dispatchStopIfNeeded$lifecycle_process_release() {
        if (this.startedCounter == 0 && this.pauseSent) {
            this.registry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            this.stopSent = true;
        }
    }

    public final void attach$lifecycle_process_release(Context context) throws Throwable {
        short sXd = (short) (C1607wl.Xd() ^ 24684);
        int[] iArr = new int["ANNUG[X".length()];
        QB qb = new QB("ANNUG[X");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        this.handler = new Handler();
        this.registry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("<JAPNIE\u0010FSSZLV]\u0018.[[bThe", (short) (FB.Xd() ^ 19712), (short) (FB.Xd() ^ 20335))).getMethod(Jg.Wd("?\u0011\u001449\r|O\\.7\u007fY&nN\u0003\\AHy", (short) (C1499aX.Xd() ^ (-4475)), (short) (C1499aX.Xd() ^ (-25916))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            short sXd2 = (short) (OY.Xd() ^ 2009);
            short sXd3 = (short) (OY.Xd() ^ 10924);
            int[] iArr2 = new int[">~nOkT*2gl\u00015\u0012\u001duo62\u0005?t+)r\u0019&\u001b%:\rk\nH9H\u0006I0\t\u000e1A\rLX\u0012a8POK!K0K~\t~\\W".length()];
            QB qb2 = new QB(">~nOkT*2gl\u00015\u0012\u001duo62\u0005?t+)r\u0019&\u001b%:\rk\nH9H\u0006I0\t\u000e1A\rLX\u0012a8POK!K0K~\t~\\W");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd3) + sXd2)));
                i3++;
            }
            Intrinsics.checkNotNull(context2, new String(iArr2, 0, i3));
            Application application = (Application) context2;
            EmptyActivityLifecycleCallbacks emptyActivityLifecycleCallbacks = new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPreCreated(Activity activity, Bundle bundle) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    final ProcessLifecycleOwner processLifecycleOwner = this.this$0;
                    ProcessLifecycleOwner.Api29Impl.registerActivityLifecycleCallbacks(activity, new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1
                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityPostStarted(Activity activity2) {
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            processLifecycleOwner.activityStarted$lifecycle_process_release();
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public void onActivityPostResumed(Activity activity2) {
                            Intrinsics.checkNotNullParameter(activity2, "activity");
                            processLifecycleOwner.activityResumed$lifecycle_process_release();
                        }
                    });
                }

                @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    if (Build.VERSION.SDK_INT < 29) {
                        ReportFragment.Companion.get(activity).setProcessListener(this.this$0.initializationListener);
                    }
                }

                @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) throws Throwable {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    this.this$0.activityPaused$lifecycle_process_release();
                }

                @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    this.this$0.activityStopped$lifecycle_process_release();
                }
            };
            short sXd4 = (short) (FB.Xd() ^ 7099);
            short sXd5 = (short) (FB.Xd() ^ 19413);
            int[] iArr3 = new int["{'B|P;-\fV\u0016\u0007VC2\\r\u0018n2\u001e7jg".length()];
            QB qb3 = new QB("{'B|P;-\fV\u0016\u0007VC2\\r\u0018n2\u001e7jg");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((C1561oA.Xd[i4 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + (i4 * sXd5))) + xuXd3.CK(iKK3));
                i4++;
            }
            Class<?> cls = Class.forName(new String(iArr3, 0, i4));
            Class<?>[] clsArr = {Class.forName(Ig.wd("^6ww*_pwTUMV;vpL!~B/])\b;6>/\u0014CHg\r\fK\u0011Rd\u001f\u007f\u001b\u0018\u001ehu`F\r7q\u001a", (short) (C1607wl.Xd() ^ 22719)))};
            Object[] objArr2 = {emptyActivityLifecycleCallbacks};
            short sXd6 = (short) (FB.Xd() ^ 27663);
            int[] iArr4 = new int["m.@\\9f=5aS^9\u0012\u0003\u001a\u0001!(lw5\u000ffkD\u0012\u000eN8{bH0\u0012".length()];
            QB qb4 = new QB("m.@\\9f=5aS^9\u0012\u0003\u001a\u0001!(lw5\u000ffkD\u0012\u000eN8{bH0\u0012");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd6 + sXd6) + i5)) + xuXd4.CK(iKK4));
                i5++;
            }
            Method method2 = cls.getMethod(new String(iArr4, 0, i5), clsArr);
            try {
                method2.setAccessible(true);
                method2.invoke(application, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.registry;
    }

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜NÎRiճ?k*3d`*qٴ?U(}j\u001f]O\u007fg\u001dL\u000b\u000fQ\u0012\u001e\u0016'n\\Mc}u\u0012=8\ttЩ7T"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E+\u000e!\u0015G}\u001c#z&5W\u0012\u001e>m\u007f@VCH*\u0010)\u001955\u001d\u000fn3$", "", "u(E", "@dV6f;>`t|\nb=\u0001\u0018CL\u0004){>\u0015\u0015\u001eGM\nC}\"1W\u0004.", "", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "1`[9U(<Y", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u0006K\fKz69h\u0012\u0007;n\u0016,aABk\u0012\u001a\u001co^5\u0005i:$", ":hU2V@<Z\u0019F\u0006k6z\t=sy5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @JvmStatic
        public static final void registerActivityLifecycleCallbacks(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }
}
