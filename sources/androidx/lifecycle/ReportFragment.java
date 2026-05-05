package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

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
/* JADX INFO: compiled from: ReportFragment.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u0012\u007fјnjO0LeN2ZS@\u000fs{:,a9\bّYjJ}P\b\bO{|\u0005\u000b]ŲG\u000f\u0014\u0016Ax:Lmx\f\u0016?6PtW3{u\u00049)\u0005D\f82P<*\u000b\u000f\"BJ&u)E\u0012\fZ@NyRR;Q5  \u000eV\"\u0017\u001d\u000bi\u00156\u0011|kDG#1mrT5gH~c\ftVm\r?q,6X7c\u0019UY\u0011\u0013j]U\u0002m~\u0004\u00191-59as\u0006:\u001f\u0014\\\u001b9^%]!*#\u0019\u001af\u001a7CO\u0012O\u0017\"p}\t\r%<2\u0012L;\u00114;,~\b<7;\u0007\u001cN^\u0015vB.~\u0012<%&\u00185A8Ih\"oI\u001af9\u0012\u0004; yЪzĲ_T\u0016֫ڦ\u001fk"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E-\u0001\"!T~nIr'=Y\u0007/\r", "\u001a`]1e6BRbz\u0006iu]\u0016+g\b(\u0005OV", "u(E", ">q^0X:L:\u001d\r\n^5|\u0016", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E-\u0001\"!T~nIr'=Y\u0007/uI\u0014=QT?zH\u0002\u001elp=\u0003j0cr6KVW\u0013``\u0002=\u001d\u0012gc", "2hb=T;<V", "", "3uT;g", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc\u0015j})FC", "2hb=T;<Vv\fzZ;|", ":hbAX5>`", "2hb=T;<V\u0006~\tn4|", "2hb=T;<V\u0007\u000evk;", "=m00g0OW(\u0013Xk,x\u0018/d", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=m32f;K]-", "=m?.h:>", "=mA2f<FS", "=mBAT9M", "=mBAb7", "Adc\u001de6<S'\rab:\f\t8e\r", "\u000fbc6i0Mg|\b~m0x\u00103z{7\u007fJ\n}\u001bU~\u000eEv2", "\u0011n\\=T5B]\"", "\u001ahU2V@<Z\u0019\\ve3y\u0005-k\u000e", ":hU2V@<Z\u0019F\bn5\f\r7ey5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class ReportFragment extends Fragment {
    public static final Companion Companion = new Companion(null);
    private static final String REPORT_FRAGMENT_TAG = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
    private ActivityInitializationListener processListener;

    /* JADX INFO: compiled from: ReportFragment.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004O\u00068\u000b4C\u0005\u0007Bߚ(\u0007\u0015i\u00026Re`.\u0001Tp34\u0002B&s$ D\u0002yb\u00040\fgN\u0016h5nԒ\n¼Ƨ\u0006\u001a\u0001l2h\u0004wٛ\u0016\u0013̱Fn"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E-\u0001\"!T~nIr'=Y\u0007/uI\u0014=QT?zH\u0002\u001elp=\u0003j0cr6KVW\u0013``\u0002=\u001d\u0012gc", "", "=m2?X(MS", "", "=mA2f<FS", "=mBAT9M", ":hU2V@<Z\u0019F\bn5\f\r7ey5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface ActivityInitializationListener {
        void onCreate();

        void onResume();

        void onStart();
    }

    public static final ReportFragment get(Activity activity) {
        return Companion.get(activity);
    }

    @JvmStatic
    public static final void injectIfNeededIn(Activity activity) {
        Companion.injectIfNeededIn(activity);
    }

    private final void dispatchCreate(ActivityInitializationListener activityInitializationListener) {
        if (activityInitializationListener != null) {
            activityInitializationListener.onCreate();
        }
    }

    private final void dispatchStart(ActivityInitializationListener activityInitializationListener) {
        if (activityInitializationListener != null) {
            activityInitializationListener.onStart();
        }
    }

    private final void dispatchResume(ActivityInitializationListener activityInitializationListener) {
        if (activityInitializationListener != null) {
            activityInitializationListener.onResume();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        dispatchCreate(this.processListener);
        dispatch(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        dispatchStart(this.processListener);
        dispatch(Lifecycle.Event.ON_START);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        dispatchResume(this.processListener);
        dispatch(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        dispatch(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        dispatch(Lifecycle.Event.ON_STOP);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        dispatch(Lifecycle.Event.ON_DESTROY);
        this.processListener = null;
    }

    private final void dispatch(Lifecycle.Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            Companion companion = Companion;
            Activity activity = getActivity();
            Intrinsics.checkNotNullExpressionValue(activity, "activity");
            companion.dispatch$lifecycle_runtime_release(activity, event);
        }
    }

    public final void setProcessListener(ActivityInitializationListener activityInitializationListener) {
        this.processListener = activityInitializationListener;
    }

    /* JADX INFO: compiled from: ReportFragment.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN;XR@ş\n\u0010d$\n#*BO\u0016\u001dԥ&\t]N0\u007f|Kr\u000bq\u00116\u001a\u0007mDI\u0004|\u000e\u0018\u001d7ZqU2{u\u0004M)\u0003D\f82P:*\t\u000f\u001dBH>zAW\u0014\u001a 8XphT=Q\u0013\u001d*\u0006l$G2%\u007f\\?`l\f<_'\u0011lZNUc`\u0003[\u0017^V=\f%gd?\tEC =S1\t\u0003_M\u0006Wqk\t/;o9W\u007fo6\u0007\u0002D\u00199R%]!*#\u0019\u001an\u001a4CO\u0012M\u0001\u00126z\u0013{;@J\"N5V<E\u001a\u0015\n>7\u0003uk@~\u0006%VH\toE/%.5[=)iiai\u001d\u0015KD\u0013\u001b.;\u0001\u001d#\fX\u001cc-\u001b\u0003{\u0018E\u001aVKYf\n\b?\u001e\b~e\u001a*24w\u0004=\u0001).E+}o\u00021/}\u001aHri'\tnkki\u0001L\u000767$E=!\f\tF\u0015\tySlXZ\u0015\u00140Ϊ\u000b\u0013"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E-\u0001\"!T~nIr'=Y\u0007/uT\u001a/MAOi;\u001erdh@\u0004_*T\u0005|", "\u001a`]1e6BRbz\u0006iuX\u0014:l\u0004&wO\u0005! \u0006K\fKz69h\u0012\u0007;n\u0016,aABk\u0012\u001a\u001co^5\u0005i:$", "u(E", "=m00g0OW(\u0013Xk,x\u0018/d", "", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "0t]1_,", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=m00g0OW(\u0013Y^:\f\u00169y\u007f'", "=m00g0OW(\u0013eZ<\u000b\t.", "=m00g0OW(\u0013eh:\ff<e{7{?", "A`e2W\u0010Ga(z\u0004\\,j\u0018+t\u007f", "=m00g0OW(\u0013eh:\fu/s\u00100{?", "=m00g0OW(\u0013eh:\fv>a\r7{?", "=m00g0OW(\u0013ek,[\t=t\r2\u0010@\u007f", "=m00g0OW(\u0013ek,g\u0005?s\u007f'", "=m00g0OW(\u0013ek,j\u00189p\u000b(z", "=m00g0OW(\u0013g^:\r\u0011/d", "=m00g0OW(\u0013hZ=|l8s\u000f$\u0005>\u0001\u0005&C~\u000e", "=m00g0OW(\u0013hm(\n\u0018/d", "=m00g0OW(\u0013hm6\b\u0014/d", "\u0011n\\=T5B]\"", ":hU2V@<Z\u0019F\bn5\f\r7ey5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        public static final Companion Companion = new Companion(null);

        @JvmStatic
        public static final void registerIn(Activity activity) {
            Companion.registerIn(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_DESTROY);
        }

        /* JADX INFO: compiled from: ReportFragment.android.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:QIV2}P\u000b\u007fRuj\u0007J\t\u000f\n\u0014َ\u001a}"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E-\u0001\"!T~nIr'=Y\u0007/uT\u001a/MAOi;\u001erdh@\u0004_*T\u0005e%VV7X[vG\u001dg", "", "u(E", "@dV6f;>`|\b", "", "/bc6i0Mg", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", ":hU2V@<Z\u0019F\bn5\f\r7ey5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final void registerIn(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new LifecycleCallbacks());
            }
        }
    }

    /* JADX INFO: compiled from: ReportFragment.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007f\u0007|jA0JhP.`S2\u000fq{<$q$yCAV ԉ#\u001fѧ~g\u0016m\u000b_\u0011CǇ\n\u0016\u0007jtdc\u0003u\u0012==rsM?eok>\u0011xD\u001282PF@\u0004в\u001e*N\u001f?\tQ[$\u0012^K!>`\u0019e\u0005H\u0017LCp\r,]\u007fNdJCҚ\rǥ'\u0003qĩ\u001fCm3\u0015M;J|';{\u0018c\u0002°9߱\u0019/c\u0005\rXiF\u001bAwE\u0013qҐ+<"}, d2 = {"\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E-\u0001\"!T~nIr'=Y\u0007/uK 6X?Do>'j", "", "u(E", " D?\u001cE\u001b84\u0006Z\\F\few)T[\n", "", "@d_<e;\u001f`\u0015\u0001\u0003^5\f", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E-\u0001\"!T~nIr'=Y\u0007/\r", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "5dcpT5G](z\nb6\u0006\u0017", "uKP;W9HW\u0018Hvi7Fd-t\u00049\u007fO\u0015lZ8", "5dc", "uKP;W9HW\u0018Hvi7Fd-t\u00049\u007fO\u0015lZ.k\u0017;\u0004/9X\u0011i>q\u0017.KW9r4g\u0002hlC\u0014r\r[r)OLW;2", "2hb=T;<V", "", "/bc6i0Mg", "3uT;g", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCvc\u0015j})FC", "2hb=T;<VW\u0006~_,z\u001d-l\u007f\"\tP\n&\u001bOo\bIv,5U\f ", "7mY2V;\"T\u0002~z],{l8", ":hU2V@<Z\u0019F\bn5\f\r7ey5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void get$annotations(Activity activity) {
        }

        private Companion() {
        }

        @JvmStatic
        public final void injectIfNeededIn(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                LifecycleCallbacks.Companion.registerIn(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag(ReportFragment.REPORT_FRAGMENT_TAG) == null) {
                fragmentManager.beginTransaction().add(new ReportFragment(), ReportFragment.REPORT_FRAGMENT_TAG).commit();
                fragmentManager.executePendingTransactions();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public final void dispatch$lifecycle_runtime_release(Activity activity, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(event, "event");
            if (activity instanceof LifecycleRegistryOwner) {
                ((LifecycleRegistryOwner) activity).getLifecycle().handleLifecycleEvent(event);
            } else if (activity instanceof LifecycleOwner) {
                Lifecycle lifecycle = ((LifecycleOwner) activity).getLifecycle();
                if (lifecycle instanceof LifecycleRegistry) {
                    ((LifecycleRegistry) lifecycle).handleLifecycleEvent(event);
                }
            }
        }

        public final ReportFragment get(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "<this>");
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag(ReportFragment.REPORT_FRAGMENT_TAG);
            Intrinsics.checkNotNull(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (ReportFragment) fragmentFindFragmentByTag;
        }
    }
}
