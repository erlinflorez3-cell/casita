package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1607wl;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

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
/* JADX INFO: compiled from: FragmentStrictMode.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007f\u0007lnA0ZeP\u008cZS8\u000fs{:$c$\bCCU \u0001*\teNogtQb\u000bQ\u0015\u000e\u0016~j4Ic\u0002e\u0012\u00156JoU3UoC9htL\u0005(2(;\u007fە\u00010ݒx\u0010%y{L;Ba\u0001u@RҫQ\u0005(\u0012NN.\n6\\\u0016RfNzgR19\u0002\u0018M\u0015'(F\u000bY%F\u00034=zo,C@e9E)a\u0012\u001fR\nOI?:K\u0013y?'YV$[Dg\u0018\u0014C;\u0016\r&\t4n\u001dQ\u000f\u0019W/]mcP<3(~\n T\u0004<\bmMvE(z \u000ea\u0002#WNZ\u001a^p\u000b+gD,=\u0002I*g1-V*I'eO{3\u001aN'\u000fx9[\u0003\u0019'\u001acb\u0006iIQnJxR\u0018cUm2{)\u0007r\u0012>`\u0018/*\u001e^\u001b3As9Q,2\u0007\u0011Ru\u0011\u001d`\u0017`\u001aVVO:nDGp\u000eThR\u007f\u001dk~a\t0\u001fW4T5\tN\u0018hz\u0006X9%>[\u007flw\be]80_jEw\u0007k<bibATic>\u0002\u0019{\\UJ\u0004\u001dX\u0015O\u0004\u0010hf@\"`S\u001b\u0014\u0006\u001e\\N:6xD:2BPI\u0019\u000b\"x\u0007,LY|7j\u000bl\u001e\u0014l3R\u00190)='\u000futp\u001et)M:\u0007x\"[L\u00029'Lm\"\u0017?-'\u0015&\f\u007fu\b\u0013L\u0015\u0003$\u001em{N#J=_9U\u0013=\nY6\u0010V]L!\u0010\u0018MZU\t(\u0012\u000fi\f^k\u0016x\t,\u000fnz[bC:~nv)\u0007t\u007f(lt(wob9sFYv\tXLNf\r3Ld%Q{0}M-q)sȹJӄ3\u0015iӠ:\b<|z\u000fTx<ׄ8І\u001a{jГu4A=W_\u001f@(+z\u000bݒL\u001d"}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`%V|\u0012:\u0006-?X}i\u0018z\u00120UCDz\"-\"l_Hnm+NL", "", "u(E", "\"@6", "", "2dU.h3M>#\u0006~\\@", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`%V|\u0012:\u0006-?X}i\u0018z\u00120UCDz\"-\"l_Hnm+N5\u0012QSR*p(", "5dc\u0011X-:c \u000eeh3\u0001\u0007C", "u(;.a+K]\u001d}\u000e(-\n\u00051m\u007f1\u000b\n|\"\"\u0011}\u001dIz#Da\b\u001f77v;IECk=-\u0003wn=\u0005r\u0014Xu'\u00067X3`P\u0007\u0013", "Adc\u0011X-:c \u000eeh3\u0001\u0007C", "uKP;W9HW\u0018\u0012D_9x\u000b7e\t7E<\f\"`U~\u001b@t4=c| \u0001N#*OK;tC\f$ue7\u0016K6Mve2VU0ZfH\u0001\u0005", "5dc\u001bX(KS'\u000eeh3\u0001\u0007C", "4qP4`,Gb", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "6`]1_,)] \u0003xr\u001d\u0001\u00136a\u000f,\u0006I", "", ">n[6V@", "Dh^9T;B]\"", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`%V|\u0012:\u0006-?X}i(q 5IR?u=s", ":nV\u0016Y\u000b>P)\u0001|b5~h8a|/{?", "=m5?T.FS\"\u000eg^<\u000b\t", ">qTC\\6Nay\fv`4|\u0012>I~", "=m5?T.FS\"\u000eiZ.l\u0017+g\u007f", "1n]AT0GS&", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "=m62g\u0019>b\u0015\u0003\u0004B5\u000b\u0018+n}(kN|\u0019\u0017", "=m62g\u001b:`\u001b~\n?9x\u000b7e\t7h@\r'\u0017U~kFu%%gy\"7", "=m62g\u001b:`\u001b~\n?9x\u000b7e\t7kN|\u0019\u0017", "=m?<_0<g\n\u0003\u0005e(\f\r9n", "=mB2g\u0019>b\u0015\u0003\u0004B5\u000b\u0018+n}(kN|\u0019\u0017", "=mB2g\u001b:`\u001b~\n?9x\u000b7e\t7kN|\u0019\u0017", "Dh^9T;B\\\u001b_\bZ.\u0005\t8t", "B`a4X;\u001f`\u0015\u0001\u0003^5\f", "@d`BX:M1#}z", "", "=mB2g\u001cLS&o~l0y\u0010/H\u00041\u000b", "7rE6f0;Z\u0019m\u0005N:|\u0016", "", "=mF?b5@4&z|f,\u0006\u0018\ro\t7wD\n\u0017$", "=mF?b5@<\u0019\r\n^+_\r/r{5yC\u0015", "3w_2V;>R\u0004z\b^5\fi<a\u00020{I\u0010", "1n]AT0GS&by", "@t]\u001ca\u000fHa(m}k,x\b", "@t];T)ES", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "Ag^B_+!O\"}\u0002^\u0017\u0007\u00103c\u0014\u0019\u007fJ\b\u0013&Ky\u0017", "4qP4`,Gbv\u0006vl:", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "Dh^9T;B]\"\\\u0002Z:\u000b", "\u0014kP4", "\u001dmE6b3:b\u001d\t\u0004E0\u000b\u0018/n\u007f5", "\u001en[6V@", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FragmentStrictMode {
    private static final String TAG = "FragmentStrictMode";
    public static final FragmentStrictMode INSTANCE = new FragmentStrictMode();
    private static Policy defaultPolicy = Policy.LAX;

    /* JADX INFO: compiled from: FragmentStrictMode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\rGً/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001\u000b\tURPgtOC\u000bI\u0015n\u0016~q\u0015I[\u0001F\u0012\u0015;ԸsI"}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`%V|\u0012:\u0006-?X}i\u0018z\u00120UCDz\"-\"l_Hnm+N5\bNHP\u0002", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u001eD=\u000e?\u001b2M\u007fh\\", "\u001eD=\u000e?\u001b2Mw^VM\u000f", "\u0012DC\u00126\u001b84\u0006Z\\F\few)R_\u0018i ", "\u0012DC\u00126\u001b84\u0006Z\\F\few)T[\nu0nrx'", "\u0012DC\u00126\u001b8E\u0006hc@&eh\u001dT_\u0007u#dv\u0004#\\k\u001fj", "\u0012DC\u00126\u001b8@xmVB\u0015vl\u0018Sn\u0004d\u001e`\u0011\u00075Ko\u001c", "\u0012DC\u00126\u001b8AxmtN\u001a\\u)Vc\u0016_\u001dgv\u0011*Sv+", "\u0012DC\u00126\u001b8Btk\\>\u001bvi\u001cAa\u0010[)o\u0011\u00075Ko\u001c", "\u0012DC\u00126\u001b8E\u0006hc@&]u\u000bGg\bd/zt\u00010^i _\u0005\"", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* JADX INFO: compiled from: FragmentStrictMode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4ߚ}ҿ\u0000iOӄtev-\u001ba8\u000f\u0004{b%\f(\u007fESUH\u0001h-ӠMʴ˪nNb\rI.4\u0015ѷn0ְYw"}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`%V|\u0012:\u0006-?X}i\u0018z\u00120UCDz\"-\"l_Hnm+N5\u0011P=R6cN\u0002A\u001e\u001bA\u0012\\:\r\u000eYNy", "", "=mE6b3:b\u001d\t\u0004", "", "Dh^9T;B]\"", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`%V|\u0012:\u0006-?X}i(q 5IR?u=s", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface OnViolationListener {
        void onViolation(Violation violation);
    }

    private FragmentStrictMode() {
    }

    public final Policy getDefaultPolicy() {
        return defaultPolicy;
    }

    public final void setDefaultPolicy(Policy policy) {
        Intrinsics.checkNotNullParameter(policy, "<set-?>");
        defaultPolicy = policy;
    }

    private final Policy getNearestPolicy(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.getStrictModePolicy() != null) {
                    Policy strictModePolicy = parentFragmentManager.getStrictModePolicy();
                    Intrinsics.checkNotNull(strictModePolicy);
                    return strictModePolicy;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return defaultPolicy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onFragmentReuse(Fragment fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(fragmentReuseViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_FRAGMENT_REUSE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), fragmentReuseViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, fragmentReuseViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onFragmentTagUsage(Fragment fragment, ViewGroup viewGroup) throws Throwable {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(fragmentTagUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_FRAGMENT_TAG_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, fragmentTagUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onWrongNestedHierarchy(Fragment fragment, Fragment expectedParentFragment, int i2) throws Throwable {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment, expectedParentFragment, i2);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(wrongNestedHierarchyViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_WRONG_NESTED_HIERARCHY) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), wrongNestedHierarchyViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, wrongNestedHierarchyViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onSetRetainInstanceUsage(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(setRetainInstanceUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), setRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, setRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onGetRetainInstanceUsage(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(getRetainInstanceUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), getRetainInstanceUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, getRetainInstanceUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onSetUserVisibleHint(Fragment fragment, boolean z2) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, z2);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(setUserVisibleHintViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_SET_USER_VISIBLE_HINT) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), setUserVisibleHintViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, setUserVisibleHintViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onSetTargetFragmentUsage(Fragment violatingFragment, Fragment targetFragment, int i2) {
        Intrinsics.checkNotNullParameter(violatingFragment, "violatingFragment");
        Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(violatingFragment, targetFragment, i2);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(setTargetFragmentUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(violatingFragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, violatingFragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, setTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onGetTargetFragmentUsage(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(getTargetFragmentUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, getTargetFragmentUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onGetTargetFragmentRequestCodeUsage(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(getTargetFragmentRequestCodeUsageViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), getTargetFragmentRequestCodeUsageViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    public static final void onWrongFragmentContainer(Fragment fragment, ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, container);
        FragmentStrictMode fragmentStrictMode = INSTANCE;
        fragmentStrictMode.logIfDebuggingEnabled(wrongFragmentContainerViolation);
        Policy nearestPolicy = fragmentStrictMode.getNearestPolicy(fragment);
        if (nearestPolicy.getFlags$fragment_release().contains(Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && fragmentStrictMode.shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            fragmentStrictMode.handlePolicyViolation(nearestPolicy, wrongFragmentContainerViolation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPolicyViolation(Violation violation) throws Throwable {
        Intrinsics.checkNotNullParameter(violation, "violation");
        logIfDebuggingEnabled(violation);
        Fragment fragment = violation.getFragment();
        Policy nearestPolicy = getNearestPolicy(fragment);
        if (shouldHandlePolicyViolation(nearestPolicy, fragment.getClass(), violation.getClass())) {
            handlePolicyViolation(nearestPolicy, violation);
        }
    }

    private final void logIfDebuggingEnabled(Violation violation) {
        if (FragmentManager.isLoggingEnabled(3)) {
            String str = "StrictMode violation in " + violation.getFragment().getClass().getName();
        }
    }

    private final boolean shouldHandlePolicyViolation(Policy policy, Class<? extends Fragment> cls, Class<? extends Violation> cls2) {
        Set<Class<? extends Violation>> set = policy.getMAllowedViolations$fragment_release().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.areEqual(cls2.getSuperclass(), Violation.class) || !CollectionsKt.contains(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }

    private final void handlePolicyViolation(final Policy policy, final Violation violation) throws Throwable {
        Fragment fragment = violation.getFragment();
        final String name = fragment.getClass().getName();
        if (policy.getFlags$fragment_release().contains(Flag.PENALTY_LOG)) {
            String str = "Policy violation in " + name;
        }
        if (policy.getListener$fragment_release() != null) {
            runOnHostThread(fragment, new Runnable() { // from class: androidx.fragment.app.strictmode.FragmentStrictMode$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentStrictMode.handlePolicyViolation$lambda$0(policy, violation);
                }
            });
        }
        if (policy.getFlags$fragment_release().contains(Flag.PENALTY_DEATH)) {
            runOnHostThread(fragment, new Runnable() { // from class: androidx.fragment.app.strictmode.FragmentStrictMode$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentStrictMode.handlePolicyViolation$lambda$1(name, violation);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handlePolicyViolation$lambda$0(Policy policy, Violation violation) {
        Intrinsics.checkNotNullParameter(policy, "$policy");
        Intrinsics.checkNotNullParameter(violation, "$violation");
        policy.getListener$fragment_release().onViolation(violation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handlePolicyViolation$lambda$1(String str, Violation violation) {
        Intrinsics.checkNotNullParameter(violation, "$violation");
        String str2 = "Policy violation with PENALTY_DEATH in " + str;
        throw violation;
    }

    private final void runOnHostThread(Fragment fragment, Runnable runnable) throws Throwable {
        if (fragment.isAdded()) {
            Handler handler = fragment.getParentFragmentManager().getHost().getHandler();
            Intrinsics.checkNotNullExpressionValue(handler, Wg.vd("\t\u0016\u0006\r\u0014\r\u0017\u001eX\u001c\u000e \u0014\u001e%w\u0005t{\u0003{\u0006\rf{\n}\u0005\u0004\u0012N\nqvx3nhvmvp~", (short) (C1607wl.Xd() ^ 5269)));
            if (Intrinsics.areEqual(handler.getLooper(), Looper.myLooper())) {
                runnable.run();
                return;
            }
            Class<?> cls = Class.forName(Qg.kd("\u001b'\u001c)%\u001e\u0018`!$]v\u000f\u001b\u0010\u0017\u000f\u001b", (short) (ZN.Xd() ^ 27794), (short) (ZN.Xd() ^ 18466)));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (OY.Xd() ^ 23331);
            short sXd2 = (short) (OY.Xd() ^ 24107);
            int[] iArr = new int["\u0005z\u000fxD\u0002u\u0002y?b\u0005|{mmvn".length()];
            QB qb = new QB("\u0005z\u000fxD\u0002u\u0002y?b\u0005|{mmvn");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {runnable};
            Method method = cls.getMethod(C1561oA.ud("xvyy", (short) (ZN.Xd() ^ 11298)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
                return;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        runnable.run();
    }

    /* JADX INFO: compiled from: FragmentStrictMode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O&8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0R\bP.`_2\u000fy\u001d<$q$yCQU\"}(\u0012eȞ\u0006{\u001fJ\t\n{\u000f\u0019*9*2կe\u0003k\u0012'8RqO3{qk:pzD\b8487(\t\u001188M(\u0011\u000bE[\f@7P\u0001J`\u001dW\u0015\"\"\nD\u001f\u0011\u001e\u000bq|?vt\f@ǥ'\u0003wM\u001f?m0\u0015S\u001dHd';x\u0010\u001f\u0002©9߱\u0019+[Έ\u001fTaK\u0011LBQ\u0013k?)AH\"[\rݚ\u0002Џ\u00191WՕut,j\u0013`185;g}[R\u001e(&\u0002\f\u001dL\u0012\u001e\u00107P>1 e\u0018\u000ea~!\\nQ0d\u0019Ȗ|ˋ:\u001d-ĮK-?,tcŎ?."}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`%V|\u0012:\u0006-?X}i\u0018z\u00120UCDz\"-\"l_Hnm+N5\u0012QSR*p(", "", "4kP4f", "", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`%V|\u0012:\u0006-?X}i\u0018z\u00120UCDz\"-\"l_Hnm+N5\bNHP\u0002", ":hbAX5>`", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`%V|\u0012:\u0006-?X}i\u0018z\u00120UCDz\"-\"l_Hnm+N5\u0011P=R6cN\u0002A\u001e\u001bA\u0012\\:\r\u000eYNy", "/k[<j,=D\u001d\t\u0002Z;\u0001\u00138s", "", "", "", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`%V|\u0012:\u0006-?X}i(q 5IR?u=s", "uKY.i(\bc(\u0003\u0002(\u001a|\u0018\u0005L{1zM\u000b\u001b\u0016Z9\u000fIr'=Y\u0007/\u0001i!9\u0017QJx8\u001c$pk8\u0007-\r[r)OLW;Ja\u007fA\u0012!B\u0018M+Knb2(xK3.\f6Rh?v\u0010\f\u001f\u000eB@WGR!CC%\u0005E02.UjO\u000b2", "5dc\u0013_(@aW\u007f\bZ.\u0005\t8ty5{G\u0001\u0013%G", "u(;7T=:\u001d)\u000e~euj\t>;", "5dc\u0019\\:MS\"~\b\u001d-\n\u00051m\u007f1\u000b:\u000e\u0017\u001eGk\u001c<", "u(;.a+K]\u001d}\u000e(-\n\u00051m\u007f1\u000b\n|\"\"\u0011}\u001dIz#Da\b\u001f77v;IECk=-\u0003wn=\u0005r\u0014Xu'\u00066W\u001d`\\y9#\u0016d\u00175/\u001b\u0014YJ${\u001a", ";@[9b>>R\n\u0003\u0005e(\f\r9n\u000e", "5dc\u001a43E]+~yO0\u0007\u0010+t\u00042\u0005N?\u0018$Cq\u0016<\u007f4/f}'7i$.", "u(;7T=:\u001d)\u000e~eud\u0005:;", "\u0010tX9W,K", "\u0011n\\=T5B]\"", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Policy {
        public static final Companion Companion = new Companion(null);
        public static final Policy LAX = new Policy(SetsKt.emptySet(), null, MapsKt.emptyMap());
        private final Set<Flag> flags;
        private final OnViolationListener listener;
        private final Map<String, Set<Class<? extends Violation>>> mAllowedViolations;

        /* JADX WARN: Multi-variable type inference failed */
        public Policy(Set<? extends Flag> flags, OnViolationListener onViolationListener, Map<String, ? extends Set<Class<? extends Violation>>> allowedViolations) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
            this.flags = flags;
            this.listener = onViolationListener;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends Violation>>> entry : allowedViolations.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.mAllowedViolations = linkedHashMap;
        }

        public final Set<Flag> getFlags$fragment_release() {
            return this.flags;
        }

        public final OnViolationListener getListener$fragment_release() {
            return this.listener;
        }

        public final Map<String, Set<Class<? extends Violation>>> getMAllowedViolations$fragment_release() {
            return this.mAllowedViolations;
        }

        /* JADX INFO: compiled from: FragmentStrictMode.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000eӵLcz\u0004I\u0006>,6B\u0015\"4ߚ\u007f\u0007|jAӄLeVQZS8\u001bs{J$c$\bCCU }*\teNogtJb\u000bY\u000f\u000e\u0016~sBկ\u0006x\f\u0011O5Բs?AM8cGk\r63ړb.F\u0006\u001d\t*.N\u000f\u0007zqX:\u001b`L~Hj\u0015]\t \u0011\u0016>N\u000bLe.S~fzhR/QɅ\u001aF\\3w0+U=Rb5%~q\"1?G5C/\u0002\fMW$C\u0011N\n=3xo-9Z\fWdݙF\u0019]1]\u001furTؘKV)\u00125>gcyִT-@\u0001\n!T\u0004<ͺmMv3({ \u000eaο9X\tV\u0010tZ\u007f)ʨ|\u001cm\u0006ABQ\u001b\u0015ϟ(@aTE\u0014\u001d\rLŀGsiib'x\u0015IƘ(U?UX=vSP^\u0006s\u0012\u000bz\u0002XʶvLPA\n\u0012F\u001d59k9Q$\u001a\u0004\u001fֶiЛ\t`pׅ:`VD:p,6X\u000ebɱP\u0081\tkXӹ)R\u001fS4n\u0017\u007f\u0018\u0013Nd\bL13 X_pynS\\\u001a%]peb\u001dm<^\u0010ӗ5̳Uc\u0018Рؕz/"}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`%V|\u0012:\u0006-?X}i\u0018z\u00120UCDz\"-\"l_Hnm+N5\u0012QSR*p\u0011OM\u0018\u0019Y\u000e[\u0001", "", "u(E", "4kP4f", "", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`%V|\u0012:\u0006-?X}i\u0018z\u00120UCDz\"-\"l_Hnm+N5\bNHP\u0002", ":hbAX5>`", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`%V|\u0012:\u0006-?X}i\u0018z\u00120UCDz\"-\"l_Hnm+N5\u0011P=R6cN\u0002A\u001e\u001bA\u0012\\:\r\u000eYNy", ";@[9b>>R\n\u0003\u0005e(\f\r9n\u000e", "", "", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`%V|\u0012:\u0006-?X}i(q 5IR?u=s", "/k[<j\u001dB] z\nb6\u0006", "4qP4`,Gbv\u0006vl:", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D/", "Dh^9T;B]\"\\\u0002Z:\u000b", "0tX9W", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`%V|\u0012:\u0006-?X}i\u0018z\u00120UCDz\"-\"l_Hnm+N5\u0012QSR*p(", "2dc2V;\u001f`\u0015\u0001\u0003^5\fu/u\u000e(", "2dc2V;\u001f`\u0015\u0001\u0003^5\fw+go6wB\u0001", "2dc2V;+S(z~g\u0010\u0006\u0017>a\t&{0\u000f\u0013\u0019G", "2dc2V;,S(n\t^9m\r=i|/{#\u0005 &", "2dc2V;-O&\u0001zm\r\n\u00051m\u007f1\u000b0\u000f\u0013\u0019G", "2dc2V;0`#\b|?9x\u000b7e\t7YJ\n&\u0013Kx\u000eI", "2dc2V;0`#\b|G,\u000b\u0018/db,{M|$\u0015J\u0004", ">d]._;R2\u0019z\na", ">d]._;R:\u001d\r\n^5|\u0016", ">d]._;R:#\u0001", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Builder {
            private OnViolationListener listener;
            private final Set<Flag> flags = new LinkedHashSet();
            private final Map<String, Set<Class<? extends Violation>>> mAllowedViolations = new LinkedHashMap();

            public final Builder penaltyLog() {
                this.flags.add(Flag.PENALTY_LOG);
                return this;
            }

            public final Builder penaltyDeath() {
                this.flags.add(Flag.PENALTY_DEATH);
                return this;
            }

            public final Builder penaltyListener(OnViolationListener listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                this.listener = listener;
                return this;
            }

            public final Builder detectFragmentReuse() {
                this.flags.add(Flag.DETECT_FRAGMENT_REUSE);
                return this;
            }

            public final Builder detectFragmentTagUsage() {
                this.flags.add(Flag.DETECT_FRAGMENT_TAG_USAGE);
                return this;
            }

            public final Builder detectWrongNestedHierarchy() {
                this.flags.add(Flag.DETECT_WRONG_NESTED_HIERARCHY);
                return this;
            }

            public final Builder detectRetainInstanceUsage() {
                this.flags.add(Flag.DETECT_RETAIN_INSTANCE_USAGE);
                return this;
            }

            public final Builder detectSetUserVisibleHint() {
                this.flags.add(Flag.DETECT_SET_USER_VISIBLE_HINT);
                return this;
            }

            public final Builder detectTargetFragmentUsage() {
                this.flags.add(Flag.DETECT_TARGET_FRAGMENT_USAGE);
                return this;
            }

            public final Builder detectWrongFragmentContainer() {
                this.flags.add(Flag.DETECT_WRONG_FRAGMENT_CONTAINER);
                return this;
            }

            public final Builder allowViolation(Class<? extends Fragment> fragmentClass, Class<? extends Violation> violationClass) {
                Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
                Intrinsics.checkNotNullParameter(violationClass, "violationClass");
                String fragmentClassString = fragmentClass.getName();
                Intrinsics.checkNotNullExpressionValue(fragmentClassString, "fragmentClassString");
                return allowViolation(fragmentClassString, violationClass);
            }

            public final Builder allowViolation(String fragmentClass, Class<? extends Violation> violationClass) {
                Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
                Intrinsics.checkNotNullParameter(violationClass, "violationClass");
                LinkedHashSet linkedHashSet = this.mAllowedViolations.get(fragmentClass);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(violationClass);
                this.mAllowedViolations.put(fragmentClass, linkedHashSet);
                return this;
            }

            public final Policy build() {
                if (this.listener == null && !this.flags.contains(Flag.PENALTY_DEATH)) {
                    penaltyLog();
                }
                return new Policy(this.flags, this.listener, this.mAllowedViolations);
            }
        }

        /* JADX INFO: compiled from: FragmentStrictMode.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0005ӭ-(Մ7f\u00198pIkH¯VS8\u000f<\nB%s$ EqYpԊ$\u07beSNo˧ĚN]"}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`%V|\u0012:\u0006-?X}i\u0018z\u00120UCDz\"-\"l_Hnm+N5\u0012QSR*p\u0011PG\u001c\u001dV\u0017R5\u0016Z", "", "u(E", "\u001a@G", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`%V|\u0012:\u0006-?X}i\u0018z\u00120UCDz\"-\"l_Hnm+N5\u0012QSR*p(", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }
}
