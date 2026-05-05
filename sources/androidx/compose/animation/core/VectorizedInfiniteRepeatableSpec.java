package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	... 4 more
    */
/* JADX INFO: compiled from: VectorizedAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&˛\bDZc|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.hS2\u000fq{<$i+yCAW\"}0\u0012WNmutOpŏk\u0015\fǝ\u0007iTI\u0004x\u000e\u0018\u001f4Ro\u00062{p}Vf\nF\u000f.4:>\n\u0007\u0011\u001a`Ϻ>y\u000bIQ\f 4XphWҫQ\u0005(\u0018Fc0\u000b,^\u007fTFJ|]pǂQ\u0006yHT'm4\u0015M;Kd-\u0013vo%C@e=չ)S\u0011\u0010\u001b~M\u0015Wqk\u0010\u0019+5>as\u000e̬\t\u0004\")COCƞ#*j\u001ai`BʬqcӍOP\u001c>@&\n$T\u0004DͺWL<E2f6\u0019cx\u0001fXP8މr\u0004\tuN\u0017[Įc/G0~Q\u0018ݢ_bѼ\u007f\u0005\u001b7k,|;sTD֫E\u001fb\u0010i1\u007fKmL\\\u001dq=$Վ!f\u0010>\u001c0}ĉ_\u007f\u001fC/%mك\u007f7\u074co\u0002V]0\u0005\u0013{\u0001S\u0018]xD0\u0007.7X\u0014RZ\r\u0010\u0013\bhT\u000f\u008cAQ*l\u001f}6\u001eP`\u0006Y9%Fʚ\u007flw\te]@ɘ_jEx\u0007kDã\u007f^ۋ9Qq)2d\u0005\u0016WBr\u0007hfxͭ:]3̨$ĘLj\u0018ǮLV\\\u0016+2m|rغ.֞\u001db\u001dǽ\u001b HM\u000b\u00160fv\u001e\u0017Ta/Yǰ&ڲ\r\u0001XʔA\u0002u\ba,+pX\u0002\u0018ٲ7Ԋ*Y:j:\f1\u0018O\u007f\u000eK\u007fLuQCָwʀ\u007f \u001e֝\u0081UO"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3\u0002\u001eieB\u000br,;v2GH](YYr+\u001f\u0012Xc", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3y\u001eli5\u0016g6Wd2GJ$", "/mX:T;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3|%u]H\u000bm5+r5GK*5`ZnL\u0018\u001cc{Y+\u000bZ", "@d_2T;&]\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\r7x\u0016*\\+Ej4s", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i(m\u0014=WP?\u00014\u001dsxn5\u0016g6WS#ULM\beVz9#\u0016d\u0017<6\r\u0003/( wCD)\f+\\K9r\t\u0017 \u001c54lKZ\u0018C\t\u0019\u007fJrfPf_C4APb&ssi\u001c\\\u0010}\u0015", "7mXA\\(EA(z\bm\u0016}\n=e\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000eFi#=7D<y4-j", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i(m\u0014=WP?\u00014\u001dsxn5\u0016g6WS#ULM\beVz9#\u0016d\u0017<6\r\u0003/( wCD)\f+\\K9r\t\u0017 \u001c54lKZ\u0018C\t\u0019\u007fJrfPf_C4APb&ssi\u001c\\\u0010\u001f\u000b\u001a{(\"lYw\u000f\r[Zv[\tgtP\u0015\u0002\u0002\u0003>nWVL~3F}5.X\fu!<e\\'\u00023\u0004A\u007fyU", "2ta.g0H\\\u0002z\u0004h:", "", "5dc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=${1\u007fH|&\u001bQx\b:\u000125S\u000b >m\u0012<M", "u(9", "7mXA\\(E=\u001a\u007f\t^;e\u00058o\u000e", "7r8;Y0GW(~", "", "u(I", "5dc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=", "7mXA\\(ED\u0015\u0006\u000b^", "B`a4X;/O \u000fz", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\u000f\u0015fpC\u00149\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\t\u000e]I }HA(Q*S\u000f;2\\\u0015\u001a\u00161ytL_\u0001Gw$\u007fN~OBb^\u0007QEDusb\u0016g(fH:m\u0010z\u001d#d_2\u0014\u0005\u001d\u000f|_y1CP\u001d\u000343Bwd7EmdF\u0002|b0", "5dc#T3NSy\f\u0005f\u0015x\u00129s", ">kPFG0FS\u0002z\u0004h:", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0006h_H\u0011p\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0001bE,jS;)\u0011uG\fHhJg\u001f\u0012=f\u007fF`\u00198y\u0013\u0005K6>-UhxTKIa=.\ni%gDH$]m\"\u001fpL=\u000e\u0006\\Zp\\\u0007g1#\"~@ MqeO6oSK~4t\u000fbs\u001b1e~/s@M24>o\u000fYga:g|\u001d(kE1/\u007f:\u001dLK-QuB\u0016d.e\u0012\u0017S5/(or9", "5dc#X3HQ\u001d\u000e\u000f?9\u0007\u0011\u0018a\t2\n", "@d_2g0MW#\bee(\u0011w3m\u007f\u0011wI\u000b%", "@d_2g0MW#\bhm(\n\u0018 e\u00072yD\u0010+", "AsP?g", "AsP?g\u001d>Z#|~m@", "3mS", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class VectorizedInfiniteRepeatableSpec<V extends AnimationVector> implements VectorizedAnimationSpec<V> {
    public static final int $stable = 8;
    private final VectorizedDurationBasedAnimationSpec<V> animation;
    private final long durationNanos;
    private final long initialOffsetNanos;
    private final RepeatMode repeatMode;

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(vectorizedDurationBasedAnimationSpec, repeatMode, j2);
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V v2, V v3, V v4) {
        return Long.MAX_VALUE;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public boolean isInfinite() {
        return true;
    }

    private VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        this.animation = vectorizedDurationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        this.durationNanos = ((long) (vectorizedDurationBasedAnimationSpec.getDelayMillis() + vectorizedDurationBasedAnimationSpec.getDurationMillis())) * AnimationKt.MillisToNanos;
        this.initialOffsetNanos = j2 * AnimationKt.MillisToNanos;
    }

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(vectorizedDurationBasedAnimationSpec, (i2 + 2) - (2 | i2) != 0 ? RepeatMode.Restart : repeatMode, (i2 & 4) != 0 ? StartOffset.m511constructorimpl$default(0, 0, 2, null) : j2, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(vectorizedDurationBasedAnimationSpec, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0017N\u0005H1\u0002\u001ak`V,:X\u0016?\u000e^Q\u000e5Dl\u0011b\tKqkby(&qZ$HNrwK\u0006-9y&^Q9%gVNyPI\u0015 V&\u0004/~5\u00162\rr:![\u0012\u000f\u001d5\u001c|Z$~\nG4;6g=")
    @InterfaceC1492Gx
    public /* synthetic */ VectorizedInfiniteRepeatableSpec(VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode) {
        this(vectorizedDurationBasedAnimationSpec, repeatMode, StartOffset.m511constructorimpl$default(0, 0, 2, null), (DefaultConstructorMarker) null);
    }

    public final long getDurationNanos$animation_core_release() {
        return this.durationNanos;
    }

    private final long repetitionPlayTimeNanos(long j2) {
        long j3 = this.initialOffsetNanos;
        if (j2 + j3 <= 0) {
            return 0L;
        }
        long j4 = j2 + j3;
        long j5 = j4 / this.durationNanos;
        if (this.repeatMode == RepeatMode.Restart || j5 % ((long) 2) == 0) {
            return j4 - (j5 * this.durationNanos);
        }
        return ((j5 + 1) * this.durationNanos) - j4;
    }

    private final V repetitionStartVelocity(long j2, V v2, V v3, V v4) {
        long j3 = this.initialOffsetNanos;
        long j4 = j2 + j3;
        long j5 = this.durationNanos;
        return j4 > j5 ? this.animation.getVelocityFromNanos(j5 - j3, v2, v4, v3) : v3;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j2, V v2, V v3, V v4) {
        return this.animation.getValueFromNanos(repetitionPlayTimeNanos(j2), v2, v3, repetitionStartVelocity(j2, v2, v4, v3));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j2, V v2, V v3, V v4) {
        return this.animation.getVelocityFromNanos(repetitionPlayTimeNanos(j2), v2, v3, repetitionStartVelocity(j2, v2, v4, v3));
    }
}
