package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яx\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0012\u007fјnjO0LeN.ZS@\u000fs{J$c$\bCCU ~*\t]lo˧vJh\u0014K\u000f\f\u0016\u0001j:l]xk\u001e\u00172HoG3coEʠhtD$(2(8\u0002\u0005\u000f<2H\u0016v\u0003Ca\f\u001a0FrBR#M\r܅\u001a\u0006L<\t\u001ebiTȤ^Ǎ\u000e:]\";jjwQ ;\rQ\u001bFl';wҐ\"+N9}#3V\u001b\u0007\u0001_o\u0007MvU\u0005\u0017-m+\u0012\u001ae=p\u007fB\u0019[c\u001be\u000b6l\u0007a`:1YXLQ`\u00108w)\u0006kG4\u0012\u00143`.[$-\bVO\u0003\u007fk@~\u0006\u000fL\u000e\ty<''\u00103Y?Iu\u0002eI)f7*\u0016S2k#|3sT<dE+b\u000bi=aBMH|\u001fi?}\u0004\u001fl0>44U\fG{?8]%\u007f\u001aG99k0Ltq\u0005\u001cxnckbHn:\u001d%g4\u0017%rJt\u0007{P\u0003^Z+} b\"\u0016\bA1\r\bJ==\u001c^Qxi\u0019Sm\f5/\u0015H\b\f2\u000e \u0004lQM]s\u0012qR%\u001aO>r\u0005\u0007wpp<djG:8Xl w*d|\u001bC<M\u000b4:<3)\\CN18rE\u000b\u0019wZ\u0017!/ZAE\u001bk:s7\u0007\u0001b~\u0012\u007fz_++fh-\neC<>UPld\u00071\u0015\u0017y\u0010IwLuR\u001b%<UDD$>QQ]A;\u001b\u000f+B\u0002[Z\\tuQ{\u001cU -\u0004\u001da\u00014w\nzpZu\u0019q\u0016TЈ&\""}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`uGp\nL}4#d}\u001e;i\u001d\u000eND;iC,rrjH\u0014m3Uv4\u001d", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chn\u000f", "1n]AT0GS&", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:]M\u000b'\"\u001d3~", "/o_9l\nH\\(z~g,\nf2a\t*{N", "", "=oT?T;B]\"", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chnwpn,[r6KVW\u0002", "1`_Ah9>B&z\u0004l0\f\r9n\u00041}1\u0005\u0017)U", "BqP;f0MW#\b~g.m\r/w\u000e", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "DhTD", "3wT0h;>=$~\bZ;\u0001\u00138s", "=oT?T;B]\"\r", "", "7r?<c", "", "4h]1A(FS\u0018o~^>\u000b", "<`\\2W\u001dBS+\r", "", "", "AsP?g\bGW!z\nb6\u0006\u0017", "/mX:T;B]\"b\u0004_6\u000b", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`uGp\nL}4#d}\u001e;i\u001d\u000eND;iC,rrjH\u0014m3Uv4\u0006(W0dN\u0002A\u001e\u001b>\u0017O5b", "/vP6g0GUv\t\u0004m(\u0001\u0012/r]+wI\u0003\u0017%", "", "AsP?g,=/\"\u0013ik(\u0006\u00173t\u00042\u0005", "AsP?g,=B&z\u0004l0\f\r9n\u000e", "", "AsP?g\u001bKO\"\r~m0\u0007\u0012=", "BqP;f0MW#\b^g-\u0007\u0017", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`uGp\nL}4#d}\u001e;i\u001d\u000eND;iC,rrjH\u0014m3Uv4\u0006;[(e`vL\u0018\u001ccqW,\u0017Z", "4ha@g\u0016Nb", ":`bA<5", "Ax]045B[\u0015\u000e~h5\u000b", "@dc.\\5&O(|}b5~y3e\u00126", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\n\\$$C\u0004u8\u0002z", "<`\\2f", "", "\u000fmX:T;B]\"b\u0004_6", "!oT0\\(E3\u001a\u007fz\\;\u000bl8f\n", "\"qP;f0MW#\b^g-\u0007", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DefaultSpecialEffectsController extends SpecialEffectsController {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultSpecialEffectsController(ViewGroup container) {
        super(container);
        Intrinsics.checkNotNullParameter(container, "container");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f1  */
    @Override // androidx.fragment.app.SpecialEffectsController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void executeOperations(java.util.List<? extends androidx.fragment.app.SpecialEffectsController.Operation> r17, boolean r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController.executeOperations(java.util.List, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void executeOperations$lambda$2(List awaitingContainerChanges, SpecialEffectsController.Operation operation, DefaultSpecialEffectsController this$0) {
        Intrinsics.checkNotNullParameter(awaitingContainerChanges, "$awaitingContainerChanges");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (awaitingContainerChanges.contains(operation)) {
            awaitingContainerChanges.remove(operation);
            this$0.applyContainerChanges(operation);
        }
    }

    private final void syncAnimations(List<? extends SpecialEffectsController.Operation> list) {
        Fragment fragment = ((SpecialEffectsController.Operation) CollectionsKt.last((List) list)).getFragment();
        for (SpecialEffectsController.Operation operation : list) {
            operation.getFragment().mAnimationInfo.mEnterAnim = fragment.mAnimationInfo.mEnterAnim;
            operation.getFragment().mAnimationInfo.mExitAnim = fragment.mAnimationInfo.mExitAnim;
            operation.getFragment().mAnimationInfo.mPopEnterAnim = fragment.mAnimationInfo.mPopEnterAnim;
            operation.getFragment().mAnimationInfo.mPopExitAnim = fragment.mAnimationInfo.mPopExitAnim;
        }
    }

    private final void startAnimations(List<AnimationInfo> list, List<SpecialEffectsController.Operation> list2, boolean z2, Map<SpecialEffectsController.Operation, Boolean> map) throws Throwable {
        Context context = getContainer().getContext();
        ArrayList<AnimationInfo> arrayList = new ArrayList();
        boolean z3 = false;
        for (final AnimationInfo animationInfo : list) {
            if (animationInfo.isVisibilityUnchanged()) {
                animationInfo.completeSpecialEffect();
            } else {
                Intrinsics.checkNotNullExpressionValue(context, "context");
                FragmentAnim.AnimationOrAnimator animation = animationInfo.getAnimation(context);
                if (animation == null) {
                    animationInfo.completeSpecialEffect();
                } else {
                    final Animator animator = animation.animator;
                    if (animator == null) {
                        arrayList.add(animationInfo);
                    } else {
                        final SpecialEffectsController.Operation operation = animationInfo.getOperation();
                        Fragment fragment = operation.getFragment();
                        if (Intrinsics.areEqual((Object) map.get(operation), (Object) true)) {
                            if (FragmentManager.isLoggingEnabled(2)) {
                                String str = "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.";
                            }
                            animationInfo.completeSpecialEffect();
                        } else {
                            final boolean z4 = operation.getFinalState() == SpecialEffectsController.Operation.State.GONE;
                            if (z4) {
                                list2.remove(operation);
                            }
                            final View view = fragment.mView;
                            getContainer().startViewTransition(view);
                            animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.startAnimations.1
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public void onAnimationEnd(Animator anim) {
                                    Intrinsics.checkNotNullParameter(anim, "anim");
                                    DefaultSpecialEffectsController.this.getContainer().endViewTransition(view);
                                    if (z4) {
                                        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
                                        View viewToAnimate = view;
                                        Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
                                        finalState.applyState(viewToAnimate);
                                    }
                                    animationInfo.completeSpecialEffect();
                                    if (FragmentManager.isLoggingEnabled(2)) {
                                        String str2 = "Animator from operation " + operation + " has ended.";
                                    }
                                }
                            });
                            animator.setTarget(view);
                            animator.start();
                            if (FragmentManager.isLoggingEnabled(2)) {
                                String str2 = "Animator from operation " + operation + " has started.";
                            }
                            animationInfo.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda0
                                @Override // androidx.core.os.CancellationSignal.OnCancelListener
                                public final void onCancel() {
                                    DefaultSpecialEffectsController.startAnimations$lambda$3(animator, operation);
                                }
                            });
                            z3 = true;
                        }
                    }
                }
            }
        }
        for (final AnimationInfo animationInfo2 : arrayList) {
            final SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (z2) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    String str3 = "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.";
                }
                animationInfo2.completeSpecialEffect();
            } else if (z3) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    String str4 = "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.";
                }
                animationInfo2.completeSpecialEffect();
            } else {
                final View view2 = fragment2.mView;
                Intrinsics.checkNotNullExpressionValue(context, "context");
                FragmentAnim.AnimationOrAnimator animation2 = animationInfo2.getAnimation(context);
                if (animation2 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                Animation animation3 = animation2.animation;
                if (animation3 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (operation2.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                    view2.startAnimation(animation3);
                    animationInfo2.completeSpecialEffect();
                } else {
                    getContainer().startViewTransition(view2);
                    FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation3, getContainer(), view2);
                    endViewTransitionAnimation.setAnimationListener(new AnonymousClass3(operation2, this, view2, animationInfo2));
                    view2.startAnimation(endViewTransitionAnimation);
                    if (FragmentManager.isLoggingEnabled(2)) {
                        String str5 = "Animation from operation " + operation2 + " has started.";
                    }
                }
                animationInfo2.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda1
                    @Override // androidx.core.os.CancellationSignal.OnCancelListener
                    public final void onCancel() {
                        DefaultSpecialEffectsController.startAnimations$lambda$4(view2, this, animationInfo2, operation2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimations$lambda$3(Animator animator, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(operation, "$operation");
        animator.end();
        if (FragmentManager.isLoggingEnabled(2)) {
            String str = "Animator from operation " + operation + " has been canceled.";
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.DefaultSpecialEffectsController$startAnimations$3, reason: invalid class name */
    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001b\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007\"2\u0013 \u0006߿pAFǏ\u0016H\\Q\u001c8\u001dk\u00144R\\TuQ=m\u001a,%Oc\u0017uurbZ9D?\n$z\u0003,wX?qZ\u001d@G\b?aN AGb\r63#x6ة}\u000b"}, d2 = {"/mS?b0=fb\u007f\bZ.\u0005\t8tI$\u0007KJu\u0017Hk\u001eC\u0006\u0013@Y{$3tu/NC9zB{\u001fqpF\u0011j3N\u0004eU[J9k.{A\u001c\u000ei\u0012X4\u001bC'", "\u001a`]1e6BRb\u0010~^>F\u00058i\b$\u000bD\u000b `#x\u0012Dr49c\u0007^\u0013v\u001a6IR?u=\u0005\u0019vp9\u0010c9$", "=m0;\\4:b\u001d\t\u0004>5{", "", "/mX:T;B]\"", "\u001a`]1e6BRb\u0010~^>F\u00058i\b$\u000bD\u000b `#x\u0012Dr49c\u0007u", "=m0;\\4:b\u001d\t\u0004K,\b\t+t", "=m0;\\4:b\u001d\t\u0004L;x\u0016>", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass3 implements Animation.AnimationListener {
        final /* synthetic */ AnimationInfo $animationInfo;
        final /* synthetic */ SpecialEffectsController.Operation $operation;
        final /* synthetic */ View $viewToAnimate;
        final /* synthetic */ DefaultSpecialEffectsController this$0;

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        AnonymousClass3(SpecialEffectsController.Operation operation, DefaultSpecialEffectsController defaultSpecialEffectsController, View view, AnimationInfo animationInfo) {
            this.$operation = operation;
            this.this$0 = defaultSpecialEffectsController;
            this.$viewToAnimate = view;
            this.$animationInfo = animationInfo;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (FragmentManager.isLoggingEnabled(2)) {
                String str = "Animation from operation " + this.$operation + " has reached onAnimationStart.";
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            ViewGroup container = this.this$0.getContainer();
            final DefaultSpecialEffectsController defaultSpecialEffectsController = this.this$0;
            final View view = this.$viewToAnimate;
            final AnimationInfo animationInfo = this.$animationInfo;
            container.post(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$startAnimations$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultSpecialEffectsController.AnonymousClass3.onAnimationEnd$lambda$0(defaultSpecialEffectsController, view, animationInfo);
                }
            });
            if (FragmentManager.isLoggingEnabled(2)) {
                String str = "Animation from operation " + this.$operation + " has ended.";
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onAnimationEnd$lambda$0(DefaultSpecialEffectsController this$0, View view, AnimationInfo animationInfo) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
            this$0.getContainer().endViewTransition(view);
            animationInfo.completeSpecialEffect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAnimations$lambda$4(View view, DefaultSpecialEffectsController this$0, AnimationInfo animationInfo, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        view.clearAnimation();
        this$0.getContainer().endViewTransition(view);
        animationInfo.completeSpecialEffect();
        if (FragmentManager.isLoggingEnabled(2)) {
            String str = "Animation from operation " + operation + " has been cancelled.";
        }
    }

    private final Map<SpecialEffectsController.Operation, Boolean> startTransitions(List<TransitionInfo> list, List<SpecialEffectsController.Operation> list2, final boolean z2, final SpecialEffectsController.Operation operation, final SpecialEffectsController.Operation operation2) {
        Object objWrapTransitionInSet;
        final View view;
        DefaultSpecialEffectsController defaultSpecialEffectsController = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<TransitionInfo> list3 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            if (!((TransitionInfo) obj).isVisibilityUnchanged()) {
                arrayList.add(obj);
            }
        }
        ArrayList<TransitionInfo> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((TransitionInfo) obj2).getHandlingImpl() != null) {
                arrayList2.add(obj2);
            }
        }
        final FragmentTransitionImpl fragmentTransitionImpl = null;
        for (TransitionInfo transitionInfo : arrayList2) {
            FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
            if (fragmentTransitionImpl != null && handlingImpl != fragmentTransitionImpl) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + transitionInfo.getOperation().getFragment() + " returned Transition " + transitionInfo.getTransition() + " which uses a different Transition type than other Fragments.").toString());
            }
            fragmentTransitionImpl = handlingImpl;
        }
        boolean z3 = false;
        if (fragmentTransitionImpl == null) {
            for (TransitionInfo transitionInfo2 : list) {
                linkedHashMap.put(transitionInfo2.getOperation(), false);
                transitionInfo2.completeSpecialEffect();
            }
            return linkedHashMap;
        }
        View view2 = new View(getContainer().getContext());
        final Rect rect = new Rect();
        ArrayList<View> arrayList3 = new ArrayList<>();
        ArrayList<View> arrayList4 = new ArrayList<>();
        ArrayMap arrayMap = new ArrayMap();
        View view3 = null;
        loop4: while (true) {
            objWrapTransitionInSet = null;
            for (TransitionInfo transitionInfo3 : list) {
                if (transitionInfo3.hasSharedElementTransition() && operation != null && operation2 != null) {
                    objWrapTransitionInSet = fragmentTransitionImpl.wrapTransitionInSet(fragmentTransitionImpl.cloneTransition(transitionInfo3.getSharedElementTransition()));
                    ArrayList<String> sharedElementSourceNames = operation2.getFragment().getSharedElementSourceNames();
                    Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementSourceNames2 = operation.getFragment().getSharedElementSourceNames();
                    Intrinsics.checkNotNullExpressionValue(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList<String> sharedElementTargetNames = operation.getFragment().getSharedElementTargetNames();
                    Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                    int size = sharedElementTargetNames.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i2));
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i2));
                        }
                    }
                    ArrayList<String> sharedElementTargetNames2 = operation2.getFragment().getSharedElementTargetNames();
                    Intrinsics.checkNotNullExpressionValue(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                    Pair pair = !z2 ? TuplesKt.to(operation.getFragment().getExitTransitionCallback(), operation2.getFragment().getEnterTransitionCallback()) : TuplesKt.to(operation.getFragment().getEnterTransitionCallback(), operation2.getFragment().getExitTransitionCallback());
                    SharedElementCallback sharedElementCallback = (SharedElementCallback) pair.component1();
                    SharedElementCallback sharedElementCallback2 = (SharedElementCallback) pair.component2();
                    int size2 = sharedElementSourceNames.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        arrayMap.put(sharedElementSourceNames.get(i3), sharedElementTargetNames2.get(i3));
                    }
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Iterator<String> it = sharedElementTargetNames2.iterator();
                        while (it.hasNext()) {
                            String str = "Name: " + it.next();
                        }
                        Iterator<String> it2 = sharedElementSourceNames.iterator();
                        while (it2.hasNext()) {
                            String str2 = "Name: " + it2.next();
                        }
                    }
                    ArrayMap<String, View> arrayMap2 = new ArrayMap<>();
                    ArrayMap<String, View> arrayMap3 = arrayMap2;
                    View view4 = operation.getFragment().mView;
                    Intrinsics.checkNotNullExpressionValue(view4, "firstOut.fragment.mView");
                    defaultSpecialEffectsController.findNamedViews(arrayMap3, view4);
                    ArrayList<String> arrayList5 = sharedElementSourceNames;
                    arrayMap2.retainAll(arrayList5);
                    if (sharedElementCallback != null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            String str3 = "Executing exit callback for operation " + operation;
                        }
                        sharedElementCallback.onMapSharedElements(sharedElementSourceNames, arrayMap3);
                        int size3 = sharedElementSourceNames.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i4 = size3 - 1;
                                String str4 = sharedElementSourceNames.get(size3);
                                View view5 = arrayMap2.get(str4);
                                if (view5 == null) {
                                    arrayMap.remove(str4);
                                } else if (!Intrinsics.areEqual(str4, ViewCompat.getTransitionName(view5))) {
                                    arrayMap.put(ViewCompat.getTransitionName(view5), (String) arrayMap.remove(str4));
                                }
                                if (i4 < 0) {
                                    break;
                                }
                                size3 = i4;
                            }
                        }
                    } else {
                        arrayMap.retainAll(arrayMap2.keySet());
                    }
                    final ArrayMap<String, View> arrayMap4 = new ArrayMap<>();
                    ArrayMap<String, View> arrayMap5 = arrayMap4;
                    View view6 = operation2.getFragment().mView;
                    Intrinsics.checkNotNullExpressionValue(view6, "lastIn.fragment.mView");
                    defaultSpecialEffectsController.findNamedViews(arrayMap5, view6);
                    ArrayList<String> arrayList6 = sharedElementTargetNames2;
                    arrayMap4.retainAll(arrayList6);
                    arrayMap4.retainAll(arrayMap.values());
                    if (sharedElementCallback2 != null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            String str5 = "Executing enter callback for operation " + operation2;
                        }
                        sharedElementCallback2.onMapSharedElements(sharedElementTargetNames2, arrayMap5);
                        int size4 = sharedElementTargetNames2.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i5 = size4 - 1;
                                String name = sharedElementTargetNames2.get(size4);
                                View view7 = arrayMap4.get(name);
                                if (view7 == null) {
                                    Intrinsics.checkNotNullExpressionValue(name, "name");
                                    String strFindKeyForValue = FragmentTransition.findKeyForValue(arrayMap, name);
                                    if (strFindKeyForValue != null) {
                                        arrayMap.remove(strFindKeyForValue);
                                    }
                                } else if (!Intrinsics.areEqual(name, ViewCompat.getTransitionName(view7))) {
                                    Intrinsics.checkNotNullExpressionValue(name, "name");
                                    String strFindKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap, name);
                                    if (strFindKeyForValue2 != null) {
                                        arrayMap.put(strFindKeyForValue2, ViewCompat.getTransitionName(view7));
                                    }
                                }
                                if (i5 < 0) {
                                    break;
                                }
                                size4 = i5;
                            }
                        }
                    } else {
                        FragmentTransition.retainValues(arrayMap, arrayMap4);
                    }
                    Set setKeySet = arrayMap.keySet();
                    Intrinsics.checkNotNullExpressionValue(setKeySet, "sharedElementNameMapping.keys");
                    defaultSpecialEffectsController.retainMatchingViews(arrayMap2, setKeySet);
                    Collection<String> collectionValues = arrayMap.values();
                    Intrinsics.checkNotNullExpressionValue(collectionValues, "sharedElementNameMapping.values");
                    defaultSpecialEffectsController.retainMatchingViews(arrayMap4, collectionValues);
                    if (arrayMap.isEmpty()) {
                        break;
                    }
                    FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z2, arrayMap2, true);
                    OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.startTransitions$lambda$9(operation2, operation, z2, arrayMap4);
                        }
                    });
                    arrayList3.addAll(arrayMap2.values());
                    if (!arrayList5.isEmpty()) {
                        view3 = arrayMap2.get(sharedElementSourceNames.get(0));
                        fragmentTransitionImpl.setEpicenter(objWrapTransitionInSet, view3);
                    }
                    arrayList4.addAll(arrayMap4.values());
                    if (!arrayList6.isEmpty() && (view = arrayMap4.get(sharedElementTargetNames2.get(0))) != null) {
                        OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda4
                            @Override // java.lang.Runnable
                            public final void run() {
                                DefaultSpecialEffectsController.startTransitions$lambda$10(fragmentTransitionImpl, view, rect);
                            }
                        });
                        z3 = true;
                    }
                    fragmentTransitionImpl.setSharedElementTargets(objWrapTransitionInSet, view2, arrayList3);
                    fragmentTransitionImpl.scheduleRemoveTargets(objWrapTransitionInSet, null, null, null, null, objWrapTransitionInSet, arrayList4);
                    linkedHashMap.put(operation, true);
                    linkedHashMap.put(operation2, true);
                }
            }
            arrayList3.clear();
            arrayList4.clear();
        }
        ArrayList arrayList7 = new ArrayList();
        Object objMergeTransitionsTogether = null;
        Object objMergeTransitionsTogether2 = null;
        for (TransitionInfo transitionInfo4 : list) {
            if (transitionInfo4.isVisibilityUnchanged()) {
                linkedHashMap.put(transitionInfo4.getOperation(), false);
                transitionInfo4.completeSpecialEffect();
            } else {
                Object objCloneTransition = fragmentTransitionImpl.cloneTransition(transitionInfo4.getTransition());
                SpecialEffectsController.Operation operation3 = transitionInfo4.getOperation();
                boolean z4 = objWrapTransitionInSet != null && (operation3 == operation || operation3 == operation2);
                if (objCloneTransition != null) {
                    final ArrayList<View> arrayList8 = new ArrayList<>();
                    View view8 = operation3.getFragment().mView;
                    Intrinsics.checkNotNullExpressionValue(view8, "operation.fragment.mView");
                    defaultSpecialEffectsController.captureTransitioningViews(arrayList8, view8);
                    if (z4) {
                        if (operation3 == operation) {
                            arrayList8.removeAll(CollectionsKt.toSet(arrayList3));
                        } else {
                            arrayList8.removeAll(CollectionsKt.toSet(arrayList4));
                        }
                    }
                    if (arrayList8.isEmpty()) {
                        fragmentTransitionImpl.addTarget(objCloneTransition, view2);
                    } else {
                        fragmentTransitionImpl.addTargets(objCloneTransition, arrayList8);
                        fragmentTransitionImpl.scheduleRemoveTargets(objCloneTransition, objCloneTransition, arrayList8, null, null, null, null);
                        if (operation3.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            list2.remove(operation3);
                            ArrayList<View> arrayList9 = new ArrayList<>(arrayList8);
                            arrayList9.remove(operation3.getFragment().mView);
                            objCloneTransition = objCloneTransition;
                            fragmentTransitionImpl.scheduleHideFragmentView(objCloneTransition, operation3.getFragment().mView, arrayList9);
                            OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda5
                                @Override // java.lang.Runnable
                                public final void run() {
                                    DefaultSpecialEffectsController.startTransitions$lambda$11(arrayList8);
                                }
                            });
                        } else {
                            objCloneTransition = objCloneTransition;
                        }
                    }
                    if (operation3.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList7.addAll(arrayList8);
                        if (z3) {
                            fragmentTransitionImpl.setEpicenter(objCloneTransition, rect);
                        }
                    } else {
                        fragmentTransitionImpl.setEpicenter(objCloneTransition, view3);
                    }
                    linkedHashMap.put(operation3, true);
                    if (transitionInfo4.isOverlapAllowed()) {
                        objMergeTransitionsTogether2 = fragmentTransitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether2, objCloneTransition, null);
                    } else {
                        objMergeTransitionsTogether = fragmentTransitionImpl.mergeTransitionsTogether(objMergeTransitionsTogether, objCloneTransition, null);
                    }
                    defaultSpecialEffectsController = this;
                } else if (!z4) {
                    linkedHashMap.put(operation3, false);
                    transitionInfo4.completeSpecialEffect();
                }
            }
        }
        Object objMergeTransitionsInSequence = fragmentTransitionImpl.mergeTransitionsInSequence(objMergeTransitionsTogether2, objMergeTransitionsTogether, objWrapTransitionInSet);
        if (objMergeTransitionsInSequence == null) {
            return linkedHashMap;
        }
        ArrayList<TransitionInfo> arrayList10 = new ArrayList();
        for (Object obj3 : list3) {
            if (!((TransitionInfo) obj3).isVisibilityUnchanged()) {
                arrayList10.add(obj3);
            }
        }
        for (final TransitionInfo transitionInfo5 : arrayList10) {
            Object transition = transitionInfo5.getTransition();
            final SpecialEffectsController.Operation operation4 = transitionInfo5.getOperation();
            boolean z5 = objWrapTransitionInSet != null && (operation4 == operation || operation4 == operation2);
            if (transition != null || z5) {
                if (ViewCompat.isLaidOut(getContainer())) {
                    fragmentTransitionImpl.setListenerForTransitionEnd(transitionInfo5.getOperation().getFragment(), objMergeTransitionsInSequence, transitionInfo5.getSignal(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda6
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultSpecialEffectsController.startTransitions$lambda$14$lambda$13(transitionInfo5, operation4);
                        }
                    });
                } else {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        String str6 = "SpecialEffectsController: Container " + getContainer() + " has not been laid out. Completing operation " + operation4;
                    }
                    transitionInfo5.completeSpecialEffect();
                }
            }
        }
        if (!ViewCompat.isLaidOut(getContainer())) {
            return linkedHashMap;
        }
        ArrayList arrayList11 = arrayList7;
        FragmentTransition.setViewVisibility(arrayList11, 4);
        ArrayList<String> arrayListPrepareSetNameOverridesReordered = fragmentTransitionImpl.prepareSetNameOverridesReordered(arrayList4);
        if (FragmentManager.isLoggingEnabled(2)) {
            for (View sharedElementFirstOutViews : arrayList3) {
                Intrinsics.checkNotNullExpressionValue(sharedElementFirstOutViews, "sharedElementFirstOutViews");
                View view9 = sharedElementFirstOutViews;
                String str7 = "View: " + view9 + " Name: " + ViewCompat.getTransitionName(view9);
            }
            for (View sharedElementLastInViews : arrayList4) {
                Intrinsics.checkNotNullExpressionValue(sharedElementLastInViews, "sharedElementLastInViews");
                View view10 = sharedElementLastInViews;
                String str8 = "View: " + view10 + " Name: " + ViewCompat.getTransitionName(view10);
            }
        }
        fragmentTransitionImpl.beginDelayedTransition(getContainer(), objMergeTransitionsInSequence);
        fragmentTransitionImpl.setNameOverridesReordered(getContainer(), arrayList3, arrayList4, arrayListPrepareSetNameOverridesReordered, arrayMap);
        FragmentTransition.setViewVisibility(arrayList11, 0);
        fragmentTransitionImpl.swapSharedElementTargets(objWrapTransitionInSet, arrayList3, arrayList4);
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$9(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z2, ArrayMap lastInViews) {
        Intrinsics.checkNotNullParameter(lastInViews, "$lastInViews");
        FragmentTransition.callSharedElementStartEnd(operation.getFragment(), operation2.getFragment(), z2, lastInViews, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$10(FragmentTransitionImpl impl, View view, Rect lastInEpicenterRect) {
        Intrinsics.checkNotNullParameter(impl, "$impl");
        Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
        impl.getBoundsOnScreen(view, lastInEpicenterRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$11(ArrayList transitioningViews) {
        Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
        FragmentTransition.setViewVisibility(transitioningViews, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTransitions$lambda$14$lambda$13(TransitionInfo transitionInfo, SpecialEffectsController.Operation operation) {
        Intrinsics.checkNotNullParameter(transitionInfo, "$transitionInfo");
        Intrinsics.checkNotNullParameter(operation, "$operation");
        transitionInfo.completeSpecialEffect();
        if (FragmentManager.isLoggingEnabled(2)) {
            String str = "Transition for operation " + operation + " has completed";
        }
    }

    private final void retainMatchingViews(ArrayMap<String, View> arrayMap, final Collection<String> collection) {
        Set<Map.Entry<String, View>> entries = arrayMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(entries, "entries");
        CollectionsKt.retainAll(entries, new Function1<Map.Entry<String, View>, Boolean>() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.retainMatchingViews.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Map.Entry<String, View> entry) {
                Intrinsics.checkNotNullParameter(entry, "entry");
                return Boolean.valueOf(CollectionsKt.contains(collection, ViewCompat.getTransitionName(entry.getValue())));
            }
        });
    }

    private final void captureTransitioningViews(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(view);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View child = viewGroup.getChildAt(i2);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    captureTransitioningViews(arrayList, child);
                }
            }
            return;
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    private final void findNamedViews(Map<String, View> map, View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View child = viewGroup.getChildAt(i2);
                if (child.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    findNamedViews(map, child);
                }
            }
        }
    }

    private final void applyContainerChanges(SpecialEffectsController.Operation operation) {
        View view = operation.getFragment().mView;
        SpecialEffectsController.Operation.State finalState = operation.getFinalState();
        Intrinsics.checkNotNullExpressionValue(view, "view");
        finalState.applyState(view);
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG9LeN2ZS8\u000fsڔ:4qҕ\"CiTZ\u00112\r]N\u007fg\u001dKj\u000fQ\u0011\u001e\u0016'm߽MU\u0007aZ\u0013@N\b?aZ@LGe\r63&hfأ}\t\u0019\u001c0M\u001e}KRY\f*0nqĐV\u0013UĨ2\u0014\fF.\nnkuPNH\u001b`Ơ3)\u000b݃ZP-i>\b֚\u0011T"}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`uGp\nL}4#d}\u001e;i\u001d\u000eND;iC,rrjH\u0014m3Uv4\u0006:Y,ZVnDs\u0013[\u000eL:\u001bhbB.D", "", "=oT?T;B]\"", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chnwpn,[r6KVW\u0002", "AhV;T3", "\u001a`]1e6BR,Hxh9|R9sI\u0006wI~\u0017\u001eNk\u001d@\u0001.#]\u007f)3tk", "uKP;W9HW\u0018\u0012D_9x\u000b7e\t7E<\f\"`5z\u000e:z!<9~!7k%<+MDzA(\u001coaFEM7N\u0004#VPX529nF\u0013\u001fd\u0012M>V\u0003cN$8NEhe(R\u007f;o\b\b%\u0012?s^FX\u0019C\u0001j92", "7rE6f0;W \u0003\nr\u001c\u0006\u00072a\t*{?", "", "u(I", "5dc\u001cc,KO(\u0003\u0005g", "u(;.a+K]\u001d}\u000e(-\n\u00051m\u007f1\u000b\n|\"\"\u0011]\u0019<t)1`]!8m\u0014=[!EtC+\u001foh9\u0014\"\u0016Yv4C[R6e(", "5dc \\.GO ", "u(;.a+K]\u001d}\u000e(*\u0007\u0016//\n6E\u001e| \u0015Gv\u00158\u0006)?bk$9v\u00125#", "1n\\=_,MS\u0007\nz\\0x\u0010\u000ff\u0001(yO", "", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static class SpecialEffectsInfo {
        private final SpecialEffectsController.Operation operation;
        private final CancellationSignal signal;

        public SpecialEffectsInfo(SpecialEffectsController.Operation operation, CancellationSignal signal) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.operation = operation;
            this.signal = signal;
        }

        public final SpecialEffectsController.Operation getOperation() {
            return this.operation;
        }

        public final CancellationSignal getSignal() {
            return this.signal;
        }

        public final boolean isVisibilityUnchanged() {
            SpecialEffectsController.Operation.State.Companion companion = SpecialEffectsController.Operation.State.Companion;
            View view = this.operation.getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view, "operation.fragment.mView");
            SpecialEffectsController.Operation.State stateAsOperationState = companion.asOperationState(view);
            SpecialEffectsController.Operation.State finalState = this.operation.getFinalState();
            return stateAsOperationState == finalState || !(stateAsOperationState == SpecialEffectsController.Operation.State.VISIBLE || finalState == SpecialEffectsController.Operation.State.VISIBLE);
        }

        public final void completeSpecialEffect() {
            this.operation.completeSpecialEffect(this.signal);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tsA0JeP.hS2\u000fq|<$q$yّAU0ԂR\t}M(\u0003~Nh\u000b[\u000f4\u0017\tn:Kmx\f\u0015\u001f6PsW3{tެ=`\u0003<M.@,P{\u001b\u007fH2x\u0014\u0005\u0006[K:\u001e\u0001N~Aj\u000fc\u0004H\u001a\\̇,Ә\"\\oޮ\u0007TzfR/Q\b@ĬZϮc0\u0005ձ]Rb+%v\u0010#\u0002«9߱\u0019%[Έ߀Vh"}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`uGp\nL}4#d}\u001e;i\u001d\u000eND;iC,rrjH\u0014m3Uv4\u0006(W0dN\u0002A\u001e\u001b>\u0017O5b", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`uGp\nL}4#d}\u001e;i\u001d\u000eND;iC,rrjH\u0014m3Uv4\u0006:Y,ZVnDs\u0013[\u000eL:\u001bhbB.D", "=oT?T;B]\"", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chnwpn,[r6KVW\u0002", "AhV;T3", "\u001a`]1e6BR,Hxh9|R9sI\u0006wI~\u0017\u001eNk\u001d@\u0001.#]\u007f)3tk", "7r?<c", "", "uKP;W9HW\u0018\u0012D_9x\u000b7e\t7E<\f\"`5z\u000e:z!<9~!7k%<+MDzA(\u001coaFEM7N\u0004#VPX529nF\u0013\u001fd\u0012M>V\u0003cN$8NEhe(R\u007f;o\b\b%\u0012?s^FX\u0019C\u0001jj\u0005\u001a", "/mX:T;B]\"", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.D5\u0007$?,q7QK7z8(\u001eRn\u0015\u0010g4J\u00061T\"", "7r0;\\4%]\u0015}z]", "5dc\u000ea0FO(\u0003\u0005g", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnimationInfo extends SpecialEffectsInfo {
        private FragmentAnim.AnimationOrAnimator animation;
        private boolean isAnimLoaded;
        private final boolean isPop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationInfo(SpecialEffectsController.Operation operation, CancellationSignal signal, boolean z2) {
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            this.isPop = z2;
        }

        public final FragmentAnim.AnimationOrAnimator getAnimation(Context context) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.isAnimLoaded) {
                return this.animation;
            }
            FragmentAnim.AnimationOrAnimator animationOrAnimatorLoadAnimation = FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.isPop);
            this.animation = animationOrAnimatorLoadAnimation;
            this.isAnimLoaded = true;
            return animationOrAnimatorLoadAnimation;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tsA0JfP.hS2\u000fq~<$iҕyCAY }8ޛ\u007fN\u0016f/mj\u000fQ\u000f\u001e\u0016'k<Mczu\u0012=5RsM7eok>pxD\u000b82P=ѩ\t\u0001(1\u0011\"\u0005\u0005[M\"\u0011^I!@`\u001fe\u00070\u00114Mf\u0001f`ubNH\u001bb\u000b@1\u000b\u0002Dd&\u000e93\u0012ϘJX?\u000f|k,6\u0011FC!=S1\fқ_E\u000bӊ\n?\u000bt54{Z\u0002eNZ\u0016\u0013C:̠\u0011cz̦t\u0007Wp\u001a8{`q]h\u0010>v)\u000bɁ@\n\u0016ͺ?J4@(wۅ\u0012H"}, d2 = {"\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`uGp\nL}4#d}\u001e;i\u001d\u000eND;iC,rrjH\u0014m3Uv4\u0006;[(e`vL\u0018\u001ccqW,\u0017Z", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`uGp\nL}4#d}\u001e;i\u001d\u000eND;iC,rrjH\u0014m3Uv4\u0006:Y,ZVnDs\u0013[\u000eL:\u001bhbB.D", "=oT?T;B]\"", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`\u0005Ro\f@r,\u0015Z~ 5|$\fWLJx>%\u001chnwpn,[r6KVW\u0002", "AhV;T3", "\u001a`]1e6BR,Hxh9|R9sI\u0006wI~\u0017\u001eNk\u001d@\u0001.#]\u007f)3tk", "7r?<c", "", ">q^C\\+>a\u0007\u0002vk,{h6e\b(\u0005Oo$\u0013P}\u0012Kz/>", "uKP;W9HW\u0018\u0012D_9x\u000b7e\t7E<\f\"`5z\u000e:z!<9~!7k%<+MDzA(\u001coaFEM7N\u0004#VPX529nF\u0013\u001fd\u0012M>V\u0003cN$8NEhe(R\u007f;o\b\b%\u0012?s^FX\u0019C\u0001jj6lY", "6`]1_0GU|\u0007\u0006e", "\u001a`]1e6BR,H{k(~\u0011/n\u000fqwK\f`wTk\u0010Dv.DH\u000b\u001c@{\u001a=QMDO<)\u001c>", "5dc\u0015T5=Z\u001d\b|B4\b\u0010", "u(;.a+K]\u001d}\u000e(-\n\u00051m\u007f1\u000b\n|\"\"\u0011P\u001b8x-5b\r\u000fDi\u001f<QR?u=\u0002\u001dsh\u000f", "7r>CX9EO$Z\u0002e6\u000f\t.", "u(I", "AgP?X+\u001eZ\u0019\u0007zg;k\u0016+n\u000e,\u000bD\u000b ", "", "5dc [(KS\u0018^\u0002^4|\u0012>T\r$\u0005N\u0005&\u001bQx", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "BqP;f0MW#\b", "5dc!e(Ga\u001d\u000e~h5", "6`b [(KS\u0018^\u0002^4|\u0012>T\r$\u0005N\u0005&\u001bQx", "4qP4`,Gb\u0013\fze,x\u0017/"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class TransitionInfo extends SpecialEffectsInfo {
        private final boolean isOverlapAllowed;
        private final Object sharedElementTransition;
        private final Object transition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransitionInfo(SpecialEffectsController.Operation operation, CancellationSignal signal, boolean z2, boolean z3) {
            Object returnTransition;
            boolean allowEnterTransitionOverlap;
            Object sharedElementEnterTransition;
            super(operation, signal);
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(signal, "signal");
            if (operation.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                Fragment fragment = operation.getFragment();
                returnTransition = z2 ? fragment.getReenterTransition() : fragment.getEnterTransition();
            } else {
                Fragment fragment2 = operation.getFragment();
                returnTransition = z2 ? fragment2.getReturnTransition() : fragment2.getExitTransition();
            }
            this.transition = returnTransition;
            if (operation.getFinalState() != SpecialEffectsController.Operation.State.VISIBLE) {
                allowEnterTransitionOverlap = true;
            } else if (z2) {
                allowEnterTransitionOverlap = operation.getFragment().getAllowReturnTransitionOverlap();
            } else {
                allowEnterTransitionOverlap = operation.getFragment().getAllowEnterTransitionOverlap();
            }
            this.isOverlapAllowed = allowEnterTransitionOverlap;
            if (!z3) {
                sharedElementEnterTransition = null;
            } else if (z2) {
                sharedElementEnterTransition = operation.getFragment().getSharedElementReturnTransition();
            } else {
                sharedElementEnterTransition = operation.getFragment().getSharedElementEnterTransition();
            }
            this.sharedElementTransition = sharedElementEnterTransition;
        }

        public final Object getTransition() {
            return this.transition;
        }

        public final boolean isOverlapAllowed() {
            return this.isOverlapAllowed;
        }

        public final Object getSharedElementTransition() {
            return this.sharedElementTransition;
        }

        public final boolean hasSharedElementTransition() {
            return this.sharedElementTransition != null;
        }

        public final FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.transition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.sharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl == null ? handlingImpl2 : handlingImpl;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + getOperation().getFragment() + " returned Transition " + this.transition + " which uses a different Transition  type than its shared element transition " + this.sharedElementTransition).toString());
        }

        private final FragmentTransitionImpl getHandlingImpl(Object obj) {
            if (obj == null) {
                return null;
            }
            if (FragmentTransition.PLATFORM_IMPL != null && FragmentTransition.PLATFORM_IMPL.canHandle(obj)) {
                return FragmentTransition.PLATFORM_IMPL;
            }
            if (FragmentTransition.SUPPORT_IMPL != null && FragmentTransition.SUPPORT_IMPL.canHandle(obj)) {
                return FragmentTransition.SUPPORT_IMPL;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }
    }
}
