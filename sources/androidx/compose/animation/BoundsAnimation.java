package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: BoundsAnimation.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012\u0006\u0010nʑA0ZeP.hS2\u000f\u0002{<řc$\bCCU \u0005*\teNogtLb\u000bY\u000f\u000e\u0016~\u007f4Icxe\u0012\u00154HnU\u074c}ok8!4F\t.2:8(\u0006\u0011$8J(|\u000bE[\f@4nsJl\u001bR\u001d0\"\bN /%li^6vt\f@\u007f)\u0013kRNUc^\u007f]\u0011T]?\r%kӿ/@E@]9a3\u001fR\np3C\u007fo\u001dhU.[M\u0002\u000bNX.\u001b]U]AurT\u000e5kn\u0011?A_e[P</\b|\f\rj\f<\fwN>/*f6\u0012aw#WNY\u001a^p\nK7D\u001c=\u0016C-I\u001b\u0015Xq=)Ne\u00043\u0013n)\u0011p1[\u0003\u0012\u000f\u0018Kn\u0006]IgP?XN8`Mo\u0014p\u0011\nX\n\u0001M\u00101\f\u0011\\\u001bS:\u0012}aaBȼҕDϼz\u0015hjYz`ZX$t#E8)\u000e`Sr\u0015<nbkD\u0017]\u001ed\u0007,\u000fA43ʃHƼ)\u001cVи\u0001kpbk E1lNg\u0007<GeSv;ESs\u0010\u0010Y\r\u0013mU\u0013\u0011frZ[\u001c\\l(P9^i>\u00112\t\rPiԼżqʬ8<9\u001bb4V\u00156DG\u0018\u0017{zj\u0016\u001cbQt,w-\r\t/Z\rt}s\u0011IZ\u0007\u0017bk\u0002(ڄӶ&Ɓ&x<~)+\r\u0006\u0018ImlUm\r\u0018{w\nCf)GvG=A\u00135mɨ\u00061]Nx\u000b_sb6\t$\u0012\u000fild,ŰntDbpr]zg7\u0005`\u000b)\u0018f\u0010y\u0010J)JϭX\u0011cŬat\t\u0003Jx\t\f\u0013\u001f6%/pݕ\u0001;5ξ?\u001f\u001c#\"[erk\u0017\b0\u0010a=-+*נ0g.qh\u007fka֗<~"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006S/Eb|.\u0013v\u001a6IR?u=s", "", "BqP;f0MW#\bh\\6\b\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d(1f}\u001f&z\u00127[GJo>'\u0003fkD\u00079", "BqP;f0MW#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "", "/mX:T;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\shb9\u0014p,MR0KTJ;`\\{\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFUB\u0002", "0nd;W:-`\u0015\b\t_6\n\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006S/Eb|.&z\u00127[DEx<s", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u00138U\u000b 6\\#*VQ?z8(\u001eV_C\u0012c\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0001bE,jS;)\u0011uG\fHhJz#\n>xtQZ\u001aPO{qJ(uP]^\r\u0011?Oj5n\u001a_fXC>,\u0010\u0001\u001d%q\u001a,\u0014\tSZa_upuK(~B-|L[GE|b<s\u0003(O\u0004s!6b}\u0001[)\r37@h\u0004^1\u0016Hf\u0004\u001f:\\\u000b#/:D\u000fNOm~6\u001b\u0018x(`\u0016|o1:'fopPdJN", "\nrTA \u0006\u0017", "5dc\u000ea0FO(\u0003\u0005g", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\#*VQ?z8(\u001e'@9\bc9[v&#UR4XavG\u001dg", "Adc\u000ea0FO(\u0003\u0005g", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'SGa:\u0007p9Nu\u0003PPV(kV|FiUK", "/mX:T;B]\"=y^3|\u000b+t\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "5dc\u000ea0FO(\u0003\u0005g\u001a\b\t-", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001N\u001a7QR;G=\"\u001ddp=\u0011l\u001aYv%\u001d", "Adc\u000ea0FO(\u0003\u0005g\u001a\b\t-", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0018q\u001f2\\C\u0017t8&\u0011weC\u0010Q7Nt|\u000b=", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "/mX:T;B]\"l\nZ;|", "5dc\u000ea0FO(\u0003\u0005g\u001a\f\u0005>e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d41h}u", "Adc\u000ea0FO(\u0003\u0005g\u001a\f\u0005>e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW*\u0006!DYSc(", "/mX:T;B]\"l\nZ;|G.e\u0007(}<\u0010\u0017", "5dc\u000fb<GR'm\bZ5\u000b\n9r\b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn\u0012c\u000e)6{\u0005;ILIl>+\u001d>", "Adc\u000fb<GR'm\bZ5\u000b\n9r\b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@\u0002?i\u0007\u001fE\\#*VQ<uA&j,R", "0nd;W:-`\u0015\b\t_6\n\u0011md\u007f/{B|&\u0017", "7rABa5B\\\u001b", "u(I", "B`a4X;", "5dc!T9@S(", "5dc!e(Ga\u001d\u000e~h5", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\#*VQ?z8(\u001e>", "5dc!e(Ga\u001d\u000e~h5j\u00079p\u007f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn#\\y-7l\u0005;ILIoC\"\u001fqO7\u0011n,$", "D`[BX", "5dc#T3NS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#j 5|k", "/mX:T;>", "", "1ta?X5M0#\u000f\u0004]:", "B`a4X;\u001b])\byl", "CoS.g,\u001a\\\u001d\u0007vm0\u0007\u0012", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BoundsAnimation {
    public static final int $stable = 8;
    private final MutableState animation$delegate;
    private FiniteAnimationSpec<Rect> animationSpec = BoundsAnimationKt.DefaultBoundsAnimation;
    private final MutableState animationState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState boundsTransform$delegate;
    private final Transition<Boolean> transition;
    private final SharedTransitionScope transitionScope;

    public BoundsAnimation(SharedTransitionScope sharedTransitionScope, Transition<Boolean> transition, Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimation, BoundsTransform boundsTransform) {
        this.transitionScope = sharedTransitionScope;
        this.transition = transition;
        this.animation$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(deferredAnimation, null, 2, null);
        this.boundsTransform$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundsTransform, null, 2, null);
    }

    public final SharedTransitionScope getTransitionScope() {
        return this.transitionScope;
    }

    public final Transition<Boolean> getTransition() {
        return this.transition;
    }

    private final void setAnimation(Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimation) {
        this.animation$delegate.setValue(deferredAnimation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> getAnimation() {
        return (Transition.DeferredAnimation) this.animation$delegate.getValue();
    }

    public final void updateAnimation(Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimation, BoundsTransform boundsTransform) {
        if (!Intrinsics.areEqual(getAnimation(), deferredAnimation)) {
            setAnimation(deferredAnimation);
            setAnimationState(null);
            this.animationSpec = BoundsAnimationKt.DefaultBoundsAnimation;
        }
        setBoundsTransform(boundsTransform);
    }

    private final BoundsTransform getBoundsTransform() {
        return (BoundsTransform) this.boundsTransform$delegate.getValue();
    }

    private final void setBoundsTransform(BoundsTransform boundsTransform) {
        this.boundsTransform$delegate.setValue(boundsTransform);
    }

    public final boolean isRunning() {
        Transition parentTransition = this.transition;
        while (parentTransition.getParentTransition() != null) {
            parentTransition = parentTransition.getParentTransition();
            Intrinsics.checkNotNull(parentTransition);
        }
        return !Intrinsics.areEqual(parentTransition.getCurrentState(), parentTransition.getTargetState());
    }

    public final FiniteAnimationSpec<Rect> getAnimationSpec() {
        return this.animationSpec;
    }

    public final void setAnimationSpec(FiniteAnimationSpec<Rect> finiteAnimationSpec) {
        this.animationSpec = finiteAnimationSpec;
    }

    public final State<Rect> getAnimationState() {
        return (State) this.animationState$delegate.getValue();
    }

    public final void setAnimationState(State<Rect> state) {
        this.animationState$delegate.setValue(state);
    }

    public final Rect getValue() {
        State<Rect> animationState;
        if (!this.transitionScope.isTransitionActive() || (animationState = getAnimationState()) == null) {
            return null;
        }
        return animationState.getValue();
    }

    public final void animate(Rect rect, Rect rect2) {
        if (this.transitionScope.isTransitionActive()) {
            if (getAnimationState() == null) {
                this.animationSpec = getBoundsTransform().transform(rect, rect2);
            }
            setAnimationState(getAnimation().animate(new Function1<Transition.Segment<Boolean>, FiniteAnimationSpec<Rect>>() { // from class: androidx.compose.animation.BoundsAnimation.animate.1
                AnonymousClass1() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final FiniteAnimationSpec<Rect> invoke(Transition.Segment<Boolean> segment) {
                    return BoundsAnimation.this.getAnimationSpec();
                }
            }, new Function1<Boolean, Rect>() { // from class: androidx.compose.animation.BoundsAnimation.animate.2
                final /* synthetic */ Rect $currentBounds;
                final /* synthetic */ Rect $targetBounds;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(Rect rect22, Rect rect3) {
                    super(1);
                    rect = rect22;
                    rect = rect3;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Rect invoke(Boolean bool) {
                    return invoke(bool.booleanValue());
                }

                public final Rect invoke(boolean z2) {
                    return z2 == BoundsAnimation.this.getTransition().getTargetState().booleanValue() ? rect : rect;
                }
            }));
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.BoundsAnimation$animate$1 */
    /* JADX INFO: compiled from: BoundsAnimation.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!4i\bDZc|\u0004W\u00068\u000b<K\u0007Ӭ:ߚ\u0010\rvlI0rev-zY:\u0011{{b&\n%8KтY\u001a\u0004%"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\\u0003hcA\u0007l;$", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<Transition.Segment<Boolean>, FiniteAnimationSpec<Rect>> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final FiniteAnimationSpec<Rect> invoke(Transition.Segment<Boolean> segment) {
            return BoundsAnimation.this.getAnimationSpec();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.BoundsAnimation$animate$2 */
    /* JADX INFO: compiled from: BoundsAnimation.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!4i\bӵLc\u0003\rIي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "7s", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function1<Boolean, Rect> {
        final /* synthetic */ Rect $currentBounds;
        final /* synthetic */ Rect $targetBounds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Rect rect22, Rect rect3) {
            super(1);
            rect = rect22;
            rect = rect3;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Rect invoke(Boolean bool) {
            return invoke(bool.booleanValue());
        }

        public final Rect invoke(boolean z2) {
            return z2 == BoundsAnimation.this.getTransition().getTargetState().booleanValue() ? rect : rect;
        }
    }

    public final boolean getTarget() {
        return this.transition.getTargetState().booleanValue();
    }
}
