package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
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
/* JADX INFO: compiled from: UpdatableAnimationState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b<G\u0007\"2\u0012\u007f\u0007tsAӄLeV5Zݷ2\u000f\u0002{<$a(yCQU\"Ԃ*\t]No˧vJp\u000bK\u000f\u001c\u0016\u0001j2J]xs\u0012\u00172HpE\u074ccڎ[T\u0011td\u0004X1=x\u000b\u0015\u000b(*`\u0016\u0007|SK:\u0014^A¤>R\u001bPMb \u0017V /0\r\u0007\\I`\bmK?21kŌR1eE\rS\u0013\\d)\u0013|\b5;BG5C7\u0002\u00177\\iW\u001bE\u0002?\u0015hU9Yb:ɕtݜ\u007f\u001a\u001d/U\fmr4[ԇU`\u001aA{[qOh\u000eV|Qԋ\u0019ʀ\b\u000e\u000eΩ\u0019:; ~\b<:KɄ_ĖT\u0002fۍP\u0007o>/%.<\u0002ݐ'ƻUaCϊ\u001fO\n\u000f%\u001eQ\u0003EĖgڍ\u0012l\u001dÑlyW<_L]JT\u0017gK>\u0016~q\u001a0\u00142W\u007f]\u0005?>m©9٦=#)ǽɞL`"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w=N:gC\u001a\u0012oa\u0015\u0010g4J\u0006+QU<;Xar\u0013", "", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\f h_\u000fJT", "7rABa5B\\\u001b", "", ":`bA99:[\u0019m~f,", "", ":`bAI,E]\u0017\u0003\nr", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "D`[BX", "5dc#T3NS", "u(5", "Adc#T3NS", "uE\u0018#", "DdRAb9Bh\u0019}hi,z", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3y\u001eli5\u0016g6Wd2GJ$", "/mX:T;>B#szk6", "", "0dU<e,\u001f`\u0015\u0007z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "D`[BX\u000b>Z(z", "/ec2e\rKO!~", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d\\0tT5\u001c\f]JmlND)\u0018;M\u000b;vJi \u0017DnyRR\u001fK\u0004\u001eK\u0005\u0010mBj[CN=NdsN\td\u001dZI\u0010", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class UpdatableAnimationState {

    @Deprecated
    public static final float VisibilityThreshold = 0.01f;
    private boolean isRunning;
    private long lastFrameTime = Long.MIN_VALUE;
    private AnimationVector1D lastVelocity = ZeroVector;
    private float value;
    private final VectorizedAnimationSpec<AnimationVector1D> vectorizedSpec;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final AnimationVector1D ZeroVector = new AnimationVector1D(0.0f);

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1, reason: invalid class name */
    /* JADX INFO: compiled from: UpdatableAnimationState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aU}\u001a\u000f\r!\u000f\u0011\u001c\u0016r!\u001d\"\u0017+!((\u000e0\u001e2$", f = "\"</+=))2*\u00051+.!3',*\u000e.\u001a,\u001cc (", i = {0, 0, 0, 0, 1, 1}, l = {101, 147}, m = "0>:?4H:*F2>LJ", n = {"c^kY", "Q[hUd[(Y7GK", "P\\vKd<THC?", "SktGf_QU)=G6<", "c^kY", "P\\vKd<THC?"}, s = {"xQ^", "xQ_", "xQ`", "rQ^", "xQ^", "xQ_"})
    static final class AnonymousClass1 extends ContinuationImpl {
        float F$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return UpdatableAnimationState.this.animateToZero(null, null, this);
        }
    }

    public UpdatableAnimationState(AnimationSpec<Float> animationSpec) {
        this.vectorizedSpec = animationSpec.vectorize(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE));
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue(float f2) {
        this.value = f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[Catch: all -> 0x00d7, PHI: r3 r4 r13 r14
  0x0079: PHI (r3v8 float) = (r3v4 float), (r3v9 float) binds: [B:24:0x0072, B:32:0x00a0] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r4v4 androidx.compose.foundation.gestures.UpdatableAnimationState) = 
  (r4v2 androidx.compose.foundation.gestures.UpdatableAnimationState)
  (r4v5 androidx.compose.foundation.gestures.UpdatableAnimationState)
 binds: [B:24:0x0072, B:32:0x00a0] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r13v2 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>) = 
  (r13v0 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
  (r13v3 kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>)
 binds: [B:24:0x0072, B:32:0x00a0] A[DONT_GENERATE, DONT_INLINE]
  0x0079: PHI (r14v2 kotlin.jvm.functions.Function0<kotlin.Unit>) = (r14v0 kotlin.jvm.functions.Function0<kotlin.Unit>), (r14v3 kotlin.jvm.functions.Function0<kotlin.Unit>) binds: [B:24:0x0072, B:32:0x00a0] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {all -> 0x00d7, blocks: (B:31:0x009b, B:26:0x0079, B:28:0x0083), top: B:54:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[Catch: all -> 0x00d7, TryCatch #1 {all -> 0x00d7, blocks: (B:31:0x009b, B:26:0x0079, B:28:0x0083), top: B:54:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[Catch: all -> 0x00d9, TryCatch #2 {all -> 0x00d9, blocks: (B:41:0x00c6, B:42:0x00c9, B:35:0x00a4, B:38:0x00af), top: B:56:0x0024 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0098 -> B:54:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object animateToZero(final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r13, kotlin.jvm.functions.Function0<kotlin.Unit> r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.UpdatableAnimationState.animateToZero(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: compiled from: UpdatableAnimationState.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00106Ȑ\u0007\"B\u0012\u007f\u0007lkA0RnP\u008cXݺ+%ӆ,4RZdvI;ڈ\u001e}0\t\u0018Vun\u0007J\t\u0013k\u000f4\u0018Iv:Jmx\f\u0014e˷\u0015ņC3Uڎ\u000eHnwN\u0005N6ŕ<\u007f\rЏ2,N\u0015\u0005\u0001ŸO\u0015"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w=N:gC\u001a\u0012oa\u0015\u0010g4J\u0006+QU<;Xar{q\u001cb\u0019J4\u0011\u000fb\u0017", "", "u(E", "$hb6U0EW(\u0013ia9|\u00172o\u0007'", "", "(da<I,<b#\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "5dc'X9HD\u0019|\nh9", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0006h_H\u0011pw-L", "7rI2e6Ba\u001c", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AnimationVector1D getZeroVector() {
            return UpdatableAnimationState.ZeroVector;
        }

        public final boolean isZeroish(float f2) {
            return Math.abs(f2) < 0.01f;
        }
    }
}
