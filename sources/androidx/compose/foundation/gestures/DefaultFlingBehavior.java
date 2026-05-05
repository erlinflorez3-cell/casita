package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.MotionDurationScale;
import java.util.concurrent.CancellationException;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
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
/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b<G\u0007Ӭ4\u0012\u000e\u0007nj?4LeV4ZS0\u0012s{J$c$wDA٥0ԂR\t}M(\u0003~Th\u000b[\u0015\u0016\u0018\tjZK\u0004ym\u0018\u00152PrW3{sެ=`\u0003;M8@2Py3\u0003B*v!'~Q]$\u0012^B7Ą\u0011ҫQ\u0005(%V\\.\u00016bwPFH\u001b_h0yɌuŌR3gܞ\u0015O\u0013Lb.-xg&9I\bM#/k\u00035]2α\u000fӭuI\rؒ?)1U\u0002dVZ\u0006\"#: \u0019ku>\\3U7ϲ)˦ScSִ˔,\f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,C<gD%$Ih=\u0010e\tNy#XPX92", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w.J?t6z\u0015k]J\u000bm9$", "4kX;Z\u000b>Q\u0015\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~7k\u0012B)L?s0-\u0019rj'\u0012c*$", "", ";nc6b5\u001dc&z\nb6\u0006v-a\u0007(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!&Ky\u0017\u001b\u000721h\u0002*@[\u0014*TC\u0011", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0016m\u0014*a\u001fDo<\u001a$lkBtn,LL\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#Q(8,A.\f6R`Ku|\u001b\u001a\u0018>Xn>]\u0010\u001d=\u0006", "5dc\u0013_0GUw~xZ@", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001L\u0016,IW\u0017t8&\u0011weC\u0010Q7Nt|", "Adc\u0013_0GUw~xZ@", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0016m\u0014*a\u001fDo<\u001a$lkBtn,LLj8", ":`bA45B[\u0015\u000e~h5Z\u001d-l\u007f\u0006\u0006P\n&", "", "5dc\u0019T:M/\"\u0003\u0003Z;\u0001\u00138C\u0014&\u0003@^!'P~", "u(8", "Adc\u0019T:M/\"\u0003\u0003Z;\u0001\u00138C\u0014&\u0003@^!'P~", "uH\u0018#", ">da3b9F4 \u0003\u0004`", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w;AHu;%\u0003fkD\u00079", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u001719x>%\u001cV_C\u0012c\u0002/]-Q[U0e\u001cpG!\u001cj\u001dR4\r\u0013#\u001f.wS;(\u0018(X\u0006EqVO|\u00131{l\f]\fP{^_>.hDh5", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DefaultFlingBehavior implements FlingBehavior {
    public static final int $stable = 0;
    private DecayAnimationSpec<Float> flingDecay;
    private int lastAnimationCycleCount;
    private final MotionDurationScale motionDurationScale;

    public DefaultFlingBehavior(DecayAnimationSpec<Float> decayAnimationSpec, MotionDurationScale motionDurationScale) {
        this.flingDecay = decayAnimationSpec;
        this.motionDurationScale = motionDurationScale;
    }

    public final DecayAnimationSpec<Float> getFlingDecay() {
        return this.flingDecay;
    }

    public final void setFlingDecay(DecayAnimationSpec<Float> decayAnimationSpec) {
        this.flingDecay = decayAnimationSpec;
    }

    public /* synthetic */ DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec, MotionDurationScale motionDurationScale, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(decayAnimationSpec, (i2 & 2) != 0 ? ScrollableKt.getDefaultScrollMotionDurationScale() : motionDurationScale);
    }

    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    public final void setLastAnimationCycleCount(int i2) {
        this.lastAnimationCycleCount = i2;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    public Object performFling(ScrollScope scrollScope, float f2, Continuation<? super Float> continuation) {
        this.lastAnimationCycleCount = 0;
        return BuildersKt.withContext(this.motionDurationScale, new AnonymousClass2(f2, this, scrollScope, null), continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2 */
    /* JADX INFO: compiled from: Scrollable.kt */
    /* JADX INFO: loaded from: classes.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,n\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUl\u000f\u0011\r\"\u001a#u\u001d\u001b!\u001bv\u001b\u001f\u0019/#*.`.$2'151\u000b2060m|", f = " /=954((1)p-5", i = {0, 0}, l = {893}, m = "8>GA>9(KJH>H?", n = {"e[nUU_V`\"?L>", "PdkSSjKVD-Z+K?"}, s = {"xQ^", "xQ_"})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Float>, Object> {
        final /* synthetic */ float $initialVelocity;
        final /* synthetic */ ScrollScope $this_performFling;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ DefaultFlingBehavior this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(float f2, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$initialVelocity = f2;
            this.this$0 = defaultFlingBehavior;
            this.$this_performFling = scrollScope;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$initialVelocity, this.this$0, this.$this_performFling, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Float> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float f2;
            Ref.FloatRef floatRef;
            AnimationState animationStateAnimationState$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            try {
            } catch (CancellationException unused) {
                floatRef.element = ((Number) animationStateAnimationState$default.getVelocity()).floatValue();
            }
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (Math.abs(this.$initialVelocity) > 1.0f) {
                    floatRef = new Ref.FloatRef();
                    floatRef.element = this.$initialVelocity;
                    Ref.FloatRef floatRef2 = new Ref.FloatRef();
                    animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, this.$initialVelocity, 0L, 0L, false, 28, null);
                    this.L$0 = floatRef;
                    this.L$1 = animationStateAnimationState$default;
                    this.label = 1;
                    if (SuspendAnimationKt.animateDecay$default(animationStateAnimationState$default, this.this$0.getFlingDecay(), false, new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior.performFling.2.1
                        final /* synthetic */ ScrollScope $this_performFling;
                        final /* synthetic */ Ref.FloatRef $velocityLeft;
                        final /* synthetic */ DefaultFlingBehavior this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(ScrollScope scrollScope, Ref.FloatRef floatRef3, DefaultFlingBehavior defaultFlingBehavior) {
                            super(1);
                            scrollScope = scrollScope;
                            floatRef = floatRef3;
                            defaultFlingBehavior = defaultFlingBehavior;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                            invoke2(animationScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke */
                        public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                            float fFloatValue = animationScope.getValue().floatValue() - floatRef.element;
                            float fScrollBy = scrollScope.scrollBy(fFloatValue);
                            floatRef.element = animationScope.getValue().floatValue();
                            floatRef.element = animationScope.getVelocity().floatValue();
                            if (Math.abs(fFloatValue - fScrollBy) > 0.5f) {
                                animationScope.cancelAnimation();
                            }
                            DefaultFlingBehavior defaultFlingBehavior = defaultFlingBehavior;
                            defaultFlingBehavior.setLastAnimationCycleCount(defaultFlingBehavior.getLastAnimationCycleCount() + 1);
                        }
                    }, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    f2 = this.$initialVelocity;
                    return Boxing.boxFloat(f2);
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                animationStateAnimationState$default = (AnimationState) this.L$1;
                floatRef3 = (Ref.FloatRef) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            f2 = floatRef3.element;
            return Boxing.boxFloat(f2);
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2$1 */
        /* JADX INFO: compiled from: Scrollable.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bDZc|\u0004O\u000b8\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015ia<TgX.\u0001T:\u0011{{b&\n$8KтY\u001a\u0004%"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"\u001c\u001fsa\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {
            final /* synthetic */ ScrollScope $this_performFling;
            final /* synthetic */ Ref.FloatRef $velocityLeft;
            final /* synthetic */ DefaultFlingBehavior this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ScrollScope scrollScope, Ref.FloatRef floatRef3, DefaultFlingBehavior defaultFlingBehavior) {
                super(1);
                scrollScope = scrollScope;
                floatRef = floatRef3;
                defaultFlingBehavior = defaultFlingBehavior;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                invoke2(animationScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2(AnimationScope<Float, AnimationVector1D> animationScope) {
                float fFloatValue = animationScope.getValue().floatValue() - floatRef.element;
                float fScrollBy = scrollScope.scrollBy(fFloatValue);
                floatRef.element = animationScope.getValue().floatValue();
                floatRef.element = animationScope.getVelocity().floatValue();
                if (Math.abs(fFloatValue - fScrollBy) > 0.5f) {
                    animationScope.cancelAnimation();
                }
                DefaultFlingBehavior defaultFlingBehavior = defaultFlingBehavior;
                defaultFlingBehavior.setLastAnimationCycleCount(defaultFlingBehavior.getLastAnimationCycleCount() + 1);
            }
        }
    }
}
