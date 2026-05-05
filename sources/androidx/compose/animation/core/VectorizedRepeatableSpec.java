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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&˛\bDZc|\u0004W\u00068é6B\r(4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{J$c$wCCU(\u0005*\tU^ml\u0005Ϻ\u0003\u0011IƤ\u0014\u0015!jZI\u0006~m\u0014\u001f2\tnm4\u000e\u0015CNpxD\u000782P;\n\u000f\u000f\u001eBN x\u000bC\u0002È@5Pv@R\u001bS\u001d\u001a@\ŗ$\u0001,d({FLz_R/Q\u0006yL\\+w6\rO\u001dF\u000b܋;{q$1@E;-%\u0002\n\u0017Xa?\u0011H\n=3rҊ++W~ Yf\u0011,\u0015Y\\=a\u00018t\u0005\bӠ<+9b{K\u0007ʫX{\t\u0010%<:\u05faL;ρ2-({P9A\u000b\u000bSvА2bP\u0017\u0013ad$U\u0004A=Q\u001b\u001dϟ\u0012?'aO{;ټN'\u000f\u00039[\u000bו')ôXw_I\u001akKaf\n\u0010Ɲ\u001e\b~y\u001a*2=w\u0004=\u000e).M¦g_G69k8҆tk\u0005\u0019xh\n֟\u0019\\غ&n$Or\u0017\u001at\\d3x\u0001XfC)MJaM}P>.w\u0010<Wط@R]\u007f\u0002j{j:)=\u0003OY%\u0088>[G{K5\bү@e`\u0015,?rϵKXڋFS\u001ar-:06`p y\fD\u0005ۼA7\u0016ڧ\u001eٜ01!¢eZ\u0011*ZA+\u00166ʴjʐ\u0003Z;ɴ\u001bk*\u0003\u0017\u0010!h~\u007f\u007fxw9Sʣ$έEQ=ӧva0jL|Q\nU͡\u0002ěkLOƂ=\"\u0004[\u0014 D!\u0010֚1ˮ\u0017\u000f\u0007ǻɮ\u0006L"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3\u000b\u0015sa5\u0016_)Uv\u0015RLL\u0002", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3~\u0019qeH\u0007?5R~#VPX5J]r;i", "7sT?T;B]\"\r", "", "/mX:T;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3|%u]H\u000bm5+r5GK*5`ZnL\u0018\u001cc{Y+\u000bZ", "@d_2T;&]\u0018~", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\r7x\u0016*\\+Ej4s", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001^\u0016,\\MHoI\u001e\u0014GqF\u0003r0X\u007f\u0004CZN+8[vE\u0010!^\u0018W\u0019\u0018\u0005W\u0017\u000bjM6,\u00120H\u0015\u0005f\u000b\u0014!\u0018Cj:>_\u0014Ou$yK22Dcly\u0011.Em*`\u001bG'[:\u0010g\u0005", "7mXA\\(EA(z\bm\u0016}\n=e\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000eFi#=7D<y4-j", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001^\u0016,\\MHoI\u001e\u0014GqF\u0003r0X\u007f\u0004CZN+8[vE\u0010!^\u0018W\u0019\u0018\u0005W\u0017\u000bjM6,\u00120H\u0015\u0005f\u000b\u0014!\u0018Cj:>_\u0014Ou$yK22Dcly\u0011.Em*`\u001bG'[:\u0010\tzw#*oT7S\u0001d\u0019<V\u0003vgT\"v?m\u001dm\\BUvd\u001a~0-Z\t\b\u0010Ab\u0002\u0013p:\n47\f(u", "2ta.g0H\\\u0002z\u0004h:", "", "5dc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=${1\u007fH|&\u001bQx\b:\u000125S\u000b >m\u0012<M", "u(9", "7mXA\\(E=\u001a\u007f\t^;e\u00058o\u000e", "5dc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=", "7mXA\\(ED\u0015\u0006\u000b^", "B`a4X;/O \u000fz", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\u000f\u0015fpC\u00149\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\t\u000e]I }HA(Q*S\u000f;2\\\u0015\u001a\u00161ytL_\u0001Gw$\u007fN~OBb^\u0007QEDusb\u0016g(fH:m\u0010z\u001d#d_2\u0014\u0005\u001d\u000f|_y1CP\u001d\u000343Bwd7EmdF\u0002|b0", "5dc#T3NSy\f\u0005f\u0015x\u00129s", ">kPFG0FS\u0002z\u0004h:", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0006h_H\u0011p\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0001bE,jS;)\u0011uG\fHhJg\u001f\u0012=f\u007fF`\u00198y\u0013\u0005K6>-UhxTKIa=.\ni%gDH$]m\"\u001fpL=\u000e\u0006\\Zp\\\u0007g1#\"~@ MqeO6oSK~4t\u000fbs\u001b1e~/s@M24>o\u000fYga:g|\u001d(kE1/\u007f:\u001dLK-QuB\u0016d.e\u0012\u0017S5/(or9", "5dc#X3HQ\u001d\u000e\u000f?9\u0007\u0011\u0018a\t2\n", "@d_2g0MW#\bee(\u0011w3m\u007f\u0011wI\u000b%", "@d_2g0MW#\bhm(\n\u0018 e\u00072yD\u0010+", "AsP?g", "AsP?g\u001d>Z#|~m@", "3mS", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class VectorizedRepeatableSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    private final VectorizedDurationBasedAnimationSpec<V> animation;
    private final long durationNanos;
    private final long initialOffsetNanos;
    private final int iterations;
    private final RepeatMode repeatMode;

    public /* synthetic */ VectorizedRepeatableSpec(int i2, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, vectorizedDurationBasedAnimationSpec, repeatMode, j2);
    }

    private VectorizedRepeatableSpec(int i2, VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        this.iterations = i2;
        this.animation = vectorizedDurationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        if (i2 < 1) {
            throw new IllegalArgumentException("Iterations count can't be less than 1");
        }
        this.durationNanos = ((long) (vectorizedDurationBasedAnimationSpec.getDelayMillis() + vectorizedDurationBasedAnimationSpec.getDurationMillis())) * AnimationKt.MillisToNanos;
        this.initialOffsetNanos = j2 * AnimationKt.MillisToNanos;
    }

    public /* synthetic */ VectorizedRepeatableSpec(int i2, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, vectorizedDurationBasedAnimationSpec, (4 & i3) != 0 ? RepeatMode.Restart : repeatMode, (-1) - (((-1) - i3) | ((-1) - 8)) != 0 ? StartOffset.m511constructorimpl$default(0, 0, 2, null) : j2, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ VectorizedRepeatableSpec(int i2, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, vectorizedDurationBasedAnimationSpec, (i3 + 4) - (i3 | 4) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "\u0017N\u0005H1\u0002\u001ak`V,:X\u0016?\u000e^Q\u000e5Dl\u0011b\tKqkby(&qZ$HNrwK\u0006-9y&^Q9%gVNyPI\u0015 V&\u0004/~5\u00162\rr:![\u0012\u000f\u001d5\u001c|Z$~\nG4;6g=")
    @InterfaceC1492Gx
    public /* synthetic */ VectorizedRepeatableSpec(int i2, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode) {
        this(i2, vectorizedDurationBasedAnimationSpec, repeatMode, StartOffset.m511constructorimpl$default(0, 0, 2, null), (DefaultConstructorMarker) null);
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
        long jMin = Math.min(j4 / this.durationNanos, ((long) this.iterations) - 1);
        if (this.repeatMode == RepeatMode.Restart || jMin % ((long) 2) == 0) {
            return j4 - (jMin * this.durationNanos);
        }
        return ((jMin + 1) * this.durationNanos) - j4;
    }

    private final V repetitionStartVelocity(long j2, V v2, V v3, V v4) {
        long j3 = this.initialOffsetNanos;
        long j4 = j2 + j3;
        long j5 = this.durationNanos;
        return j4 > j5 ? (V) getVelocityFromNanos(j5 - j3, v2, v3, v4) : v3;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long j2, V v2, V v3, V v4) {
        return this.animation.getValueFromNanos(repetitionPlayTimeNanos(j2), v2, v3, repetitionStartVelocity(j2, v2, v4, v3));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long j2, V v2, V v3, V v4) {
        return this.animation.getVelocityFromNanos(repetitionPlayTimeNanos(j2), v2, v3, repetitionStartVelocity(j2, v2, v4, v3));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V v2, V v3, V v4) {
        return (((long) this.iterations) * this.durationNanos) - this.initialOffsetNanos;
    }
}
