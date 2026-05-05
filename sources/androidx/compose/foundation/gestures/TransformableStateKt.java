package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
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
/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d̉=!4i\bӵLc\u000b\u0004I\u0006>\u00106B\u0015\"4\u0012}\u0007njO0LeN.ZS8\u000fs{:'c$\bCCU \n*\teNogtKr\\QƤ\u001e\u0016'i\\\u0013cxuW\u001fCR~m5ޜsG?c\u0005<\u000b$B$>\u007f+\u0006*;X\u001f%\u0001ŲO\u0016\u00183Pv@V\u001dO\u000b 8\rN1\u0011-\u000biߑ:Rr`J5)\u0007yDT-\u00068\rO\u001dF\u00030;wyv9JO5C$\u0004L\u0015Rs\u0005\u0013P\u0002L3jҊ+5Ovg<^\u0004$\u00171U3b\u00037l\u0014\u007ffВ+5Uf[V\u0014,\b|\u0002\u0013b\u000b\u001e\u00177W\\/բj\u0012\u00146\u0005xYD`\u0004dH&\u0003q8'%.<Y:akЂe;'YO)\u0013\u00196#/wI[\u0003\r\u0011\u0019)a\u0010Q_WpINN\u0018gUs\u0014rr\u0002X\n^VF\u0082:ö-ϏÉ;]?3/|\u001apRy\u000f\u0005\u000fq{i\u0001Gp&|)O*7\u000e\u000bPj\u0005y^l^<\u0013]\u001c\u0003\t,\u0017Y\u0605\u001bʟ@!3$fwv~\u0003M\f\u0013M/\u00156\nry$o9\r5e]i\u0010o`\u000f\u001aO>r\u0005\u0007hpbRȞ\u001b͈&2V~(\u0015\n[f\fA;gqJ3\\5'i-H1$\tˍ;ɺ^ʳӳ\u0014\u0001ZK2\u001c\u0002<\u0003#\u0019P\u000by\u0018g'H\\\u0001n5EA\u007f7_Ħ\u0014ɋl4\u000b>\u001f\u0019\u0002\u001c_gzPtlDt\u0006\u0002&\u0016(Vi/k1Uȶgɨ\u0006-Sk\u000b}_m*')\u0006\"\u000fig^k\u0016\u0001\t,\u000fl\u0011֩\u0013Ђ&vl\u000eֿ\bi\b|gá\u0017ubӣ\u000f|"}, d2 = {"\"qP;f-H`!zwe,j\u0018+t\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w<P7tB\u001f\u001fui5\u0004j,<\u0006#VL$", "=mC?T5LT#\f\u0003Z;\u0001\u00138", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "Hn^:6/:\\\u001b~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ">`]\u0010[(GU\u0019", "@nc.g0H\\v\u0002vg.|", "", "@d\\2`)>`\b\fvg:}\u0013<m{%\u0003@n&\u0013Vo", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>'S\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu[\u00070VPV,&0|E\u001f\u001ch\u000e[\u0001pH@=-mQA#\u0007?\u0013\u007fEp\f\u0016$\u000e~kzR_\u000fC\t\u0019\u007fJrjFgn\nTAS,\u0019q\bh+]DG,\u0010n \u001bV_*\u0019{)", "/mX:T;>>\u0015\bWr", "=eU@X;", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "/mX:T;>>\u0015\bWrs\r\u0006\u0018V\u0012\u0018g", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u00172Hg=,\u0016rnA\u0003`3Nd6C[N\u0002A9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u00045M\n7w\u0005\u0016\u001fW3t}B kP}\u001dqP-rOGjyE\u0017,h4s\u0013c&&8D1\u001e\u0002(\u001fqP<SY]\u001a\u0002V\u0003wcV\u001d\u0005Ay\u0002T`BVk\u001fCp0!\u0015et\u00172V\u0004\u0001", "/mX:T;>@#\u000evm,Y\u001d", "2dV?X,L", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u00172Hg=,\u0016rnA\u0003`3Nd6C[N\u0002=9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u00045M\n7w\u0005\u0016\u001fW3t}B kP}\u001dqP-rOGjyE\u0017,h4s\u0013c&&8D1\u001e\u0002(\u001fqP<SY]\u001a\u0002V\u0003wcV\u001d\u0005Ay\u0002T`BVk\u001fCp0!\u0015et\u00172V\u0004\u0001", "/mX:T;>H#\t\u0003;@", "Hn^:9(<b#\f", ">`]\u000fl", ">`]\u000fls=\u001bg~x0\u0010", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u00172Hg=,\u0016rnA\u0003`3Nd6C[N\u0002A9xG#\u0019^\u0017\u0018)\u0017\u0012cQ3rM7-Q\nS\u000bJl\n\u001c\u0012\u001d9ty\u0018\u001avLu&q\u000b0dO[)cDFE`9:", "@nc.g,\u001bg", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u00172Hg=,\u0016rnA\u0003`3Nd6C[N\u0002=9xG#\u0019^\u0017\u0018)\u0017\u0012cQ3rM7-Q\nS\u000bJl\n\u001c\u0012\u001d9ty\u0018\u001avLu&q\u000b0dO[)cDFE`9:", "As^=G9:\\'\u007f\u0005k4x\u00183o\t", "Bda:\\5:b\u001d\t\u0004I9\u0001\u0013<i\u000f<", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\rEhy/7X#2WP?zHs", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u00172Hg=,\u0016rnA\u0003`3Nd6C[N\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001 \u0012<R\u00017w\u0005\u0016\u001fW\u001dz\u007f>e\u00102\u0007\u0019\u007fN-wZ/F\u007fQPLf3.\ni*fJI(\u001dq'dFZ7\u0019\u007f\\!na}qp\u001d\\a= Oi%MAxW\u0006^$$Ky\u0007g", "Hn^:5@", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TransformableStateKt {
    public static final TransformableState TransformableState(Function3<? super Float, ? super Offset, ? super Float, Unit> function3) {
        return new DefaultTransformableState(function3);
    }

    public static final TransformableState rememberTransformableState(Function3<? super Float, ? super Offset, ? super Float, Unit> function3, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1681419281, "C(rememberTransformableState)117@5191L38,118@5241L80:TransformableState.kt#8bwon0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1681419281, i2, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:116)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function3, composer, (i2 + 14) - (i2 | 14));
        ComposerKt.sourceInformationMarkerStart(composer, -586916430, "CC(remember):TransformableState.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = TransformableState(new Function3<Float, Offset, Float, Unit>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$rememberTransformableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Float f2, Offset offset, Float f3) {
                    m853invoked4ec7I(f2.floatValue(), offset.m3947unboximpl(), f3.floatValue());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
                public final void m853invoked4ec7I(float f2, long j2, float f3) {
                    stateRememberUpdatedState.getValue().invoke(Float.valueOf(f2), Offset.m3926boximpl(j2), Float.valueOf(f3));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        TransformableState transformableState = (TransformableState) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return transformableState;
    }

    public static /* synthetic */ Object animateZoomBy$default(TransformableState transformableState, float f2, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj) {
        SpringSpec springSpec = animationSpec;
        if ((i2 + 2) - (i2 | 2) != 0) {
            springSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateZoomBy(transformableState, f2, springSpec, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3, reason: invalid class name */
    /* JADX INFO: compiled from: TransformableState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w<P7tB\u001f\u001fui'\u0005m7NL"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU|\u001c\f\u001a \u0014\u001e\"\u001e\u0013\u0015 \u001a\t+\u0019-\u001f\u00060`\u001f-).#7)\u001f565\u000bCn~", f = "!>,8<.682%%.&\u00133\u001f1!h%-", i = {}, l = {138}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass3 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ Ref.FloatRef $previous;
        final /* synthetic */ float $zoomFactor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(Ref.FloatRef floatRef, float f2, AnimationSpec<Float> animationSpec, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$previous = floatRef;
            this.$zoomFactor = f2;
            this.$animationSpec = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$previous, this.$zoomFactor, this.$animationSpec, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final TransformScope transformScope = (TransformScope) this.L$0;
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.element, 0.0f, 0L, 0L, false, 30, null);
                Float fBoxFloat = Boxing.boxFloat(this.$zoomFactor);
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final Ref.FloatRef floatRef = this.$previous;
                this.label = 1;
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, fBoxFloat, animationSpec, false, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt.animateZoomBy.3.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        invoke2(animationScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                        TransformScope.m846transformByd4ec7I$default(transformScope, floatRef.element == 0.0f ? 1.0f : animationScope.getValue().floatValue() / floatRef.element, 0L, 0.0f, 6, null);
                        floatRef.element = animationScope.getValue().floatValue();
                    }
                }, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Object animateZoomBy(TransformableState transformableState, float f2, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("zoom value should be greater than 0".toString());
        }
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = 1.0f;
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new AnonymousClass3(floatRef, f2, animationSpec, null), continuation, 1, null);
        return objTransform$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTransform$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object animateRotateBy$default(TransformableState transformableState, float f2, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj) {
        SpringSpec springSpec = animationSpec;
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            springSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return animateRotateBy(transformableState, f2, springSpec, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2, reason: invalid class name */
    /* JADX INFO: compiled from: TransformableState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w<P7tB\u001f\u001fui'\u0005m7NL"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU|\u001c\f\u001a \u0014\u001e\"\u001e\u0013\u0015 \u001a\t+\u0019-\u001f\u00060`\u001f-).#7)\u00175;)=/\rEp\u007f", f = "!>,8<.682%%.&\u00133\u001f1!h%-", i = {}, l = {158}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ float $degrees;
        final /* synthetic */ Ref.FloatRef $previous;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Ref.FloatRef floatRef, float f2, AnimationSpec<Float> animationSpec, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$previous = floatRef;
            this.$degrees = f2;
            this.$animationSpec = animationSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$previous, this.$degrees, this.$animationSpec, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final TransformScope transformScope = (TransformScope) this.L$0;
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(this.$previous.element, 0.0f, 0L, 0L, false, 30, null);
                Float fBoxFloat = Boxing.boxFloat(this.$degrees);
                AnimationSpec<Float> animationSpec = this.$animationSpec;
                final Ref.FloatRef floatRef = this.$previous;
                this.label = 1;
                if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, fBoxFloat, animationSpec, false, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt.animateRotateBy.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        invoke2(animationScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                        TransformScope.m846transformByd4ec7I$default(transformScope, 0.0f, 0L, animationScope.getValue().floatValue() - floatRef.element, 3, null);
                        floatRef.element = animationScope.getValue().floatValue();
                    }
                }, this, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Object animateRotateBy(TransformableState transformableState, float f2, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new AnonymousClass2(new Ref.FloatRef(), f2, animationSpec, null), continuation, 1, null);
        return objTransform$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTransform$default : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: animatePanBy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ Object m851animatePanByubNVwUQ$default(TransformableState transformableState, long j2, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj) {
        SpringSpec springSpec = animationSpec;
        if ((i2 + 2) - (i2 | 2) != 0) {
            springSpec = new SpringSpec(0.0f, 200.0f, null, 5, null);
        }
        return m850animatePanByubNVwUQ(transformableState, j2, springSpec, continuation);
    }

    /* JADX INFO: renamed from: animatePanBy-ubNVwUQ, reason: not valid java name */
    public static final Object m850animatePanByubNVwUQ(TransformableState transformableState, long j2, AnimationSpec<Offset> animationSpec, Continuation<? super Unit> continuation) {
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = Offset.Companion.m3953getZeroF1C5BW0();
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$animatePanBy$2(longRef, j2, animationSpec, null), continuation, 1, null);
        return objTransform$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTransform$default : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$zoomBy$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TransformableState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w<P7tB\u001f\u001fui'\u0005m7NL"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU|\u001c\f\u001a \u0014\u001e\"\u001e\u0013\u0015 \u001a\t+\u0019-\u001f\u00060`8./.\u0004<gv", f = "!>,8<.682%%.&\u00133\u001f1!h%-", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C04732 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $zoomFactor;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04732(float f2, Continuation<? super C04732> continuation) {
            super(2, continuation);
            this.$zoomFactor = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C04732 c04732 = new C04732(this.$zoomFactor, continuation);
            c04732.L$0 = obj;
            return c04732;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
            return ((C04732) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((TransformScope) this.L$0).mo741transformByd4ec7I(this.$zoomFactor, Offset.Companion.m3953getZeroF1C5BW0(), 0.0f);
            return Unit.INSTANCE;
        }
    }

    public static final Object zoomBy(TransformableState transformableState, float f2, Continuation<? super Unit> continuation) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new C04732(f2, null), continuation, 1, null);
        return objTransform$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTransform$default : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$rotateBy$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TransformableState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w<P7tB\u001f\u001fui'\u0005m7NL"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU|\u001c\f\u001a \u0014\u001e\"\u001e\u0013\u0015 \u001a\t+\u0019-\u001f\u00060`0.4\"6(\u0006>ix", f = "!>,8<.682%%.&\u00133\u001f1!h%-", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C04712 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ float $degrees;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04712(float f2, Continuation<? super C04712> continuation) {
            super(2, continuation);
            this.$degrees = f2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C04712 c04712 = new C04712(this.$degrees, continuation);
            c04712.L$0 = obj;
            return c04712;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
            return ((C04712) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((TransformScope) this.L$0).mo741transformByd4ec7I(1.0f, Offset.Companion.m3953getZeroF1C5BW0(), this.$degrees);
            return Unit.INSTANCE;
        }
    }

    public static final Object rotateBy(TransformableState transformableState, float f2, Continuation<? super Unit> continuation) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new C04712(f2, null), continuation, 1, null);
        return objTransform$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTransform$default : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: panBy-d-4ec7I, reason: not valid java name */
    public static final Object m852panByd4ec7I(TransformableState transformableState, long j2, Continuation<? super Unit> continuation) {
        Object objTransform$default = TransformableState.transform$default(transformableState, null, new TransformableStateKt$panBy$2(j2, null), continuation, 1, null);
        return objTransform$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTransform$default : Unit.INSTANCE;
    }

    public static /* synthetic */ Object stopTransformation$default(TransformableState transformableState, MutatePriority mutatePriority, Continuation continuation, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return stopTransformation(transformableState, mutatePriority, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TransformableStateKt$stopTransformation$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: TransformableState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w<P7tB\u001f\u001fui'\u0005m7NL"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU|\u001c\f\u001a \u0014\u001e\"\u001e\u0013\u0015 \u001a\t+\u0019-\u001f\u00060`13/1\u00165%39-7;7,@6==s\u0003", f = "!>,8<.682%%.&\u00133\u001f1!h%-", i = {}, l = {}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C04722 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
        int label;

        C04722(Continuation<? super C04722> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C04722(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
            return ((C04722) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public static final Object stopTransformation(TransformableState transformableState, MutatePriority mutatePriority, Continuation<? super Unit> continuation) {
        Object objTransform = transformableState.transform(mutatePriority, new C04722(null), continuation);
        return objTransform == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTransform : Unit.INSTANCE;
    }
}
