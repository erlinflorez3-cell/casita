package androidx.compose.animation.core;

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
/* JADX INFO: compiled from: FloatAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4F\u0007\"B\u0012\u007f\u0007ljA0RlP.XY0\u0014\u0002ڔd$\n#2dK[ }0\tgN\u0016h~P`\u000bQ\u0011\u001e\u0016'k<O[xk\u0015'2ppУ7M}A\u0002~\u0003@\u001d `-h}\u0013\r2*v\u0011'~QX$\u0012^A!>`\u001be\u0005H\u0013LRh\u001f,k\u007fNdI\u001daH;;\u0003\u0018C~+m=\u0015M;G\u0005+\u001b\u0005y\u001eYA}I]Ka\u0013\u001fR\n@3C\u007fN\u001dhU2[M\u0002cNX.\u0015E/]\u001aurT]5Un\u001a?+}d\u0012dVN\u0006\r\u0014\rj\u0005>\n5YF-Hq8\u0012A\u0001\u000bSnQ2bP\r\u0013ad\u0018U\u0004A9Q\u001b\u0015R(Oi]E{\u001d\rL$ъr'c٪&b\u001b b}\"=_GUH|\u00120Ơoձtb\nÏT?U\u0002G{?/ϲ)=cݽ;#q\u000bVJ8\u0003\u0013c\u0001S\u0018S\u001fؚ$å\u001a72\u009eɚ^W"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001>w\u0012=;NHo= \u0003sa7\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001>w\u0012=)L?s0-\u0019rj'\u0012c*$", "2`\\=\\5@@\u0015\u000e~h", "", "AsX3Y5>a'", "Dhb6U0EW(\u0013ia9|\u00172o\u0007'", "uE5\u0013\u001c\u001d", "5dc\u0011T4IW\"\u0001gZ;\u0001\u0013", "u(5", "Aoa6a.", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000eBz\u001a7O1?sD%\u0011weC\u00109", "5dc g0?T\"~\tl", "5dc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=", "", "7mXA\\(ED\u0015\u0006\u000b^", "B`a4X;/O \u000fz", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "5dc\u0012a+/S \txb;\u0011", "5dc#T3NSy\f\u0005f\u0015x\u00129s", ">kPFG0FS\u0002z\u0004h:", "5dc#X3HQ\u001d\u000e\u000f?9\u0007\u0011\u0018a\t2\n", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FloatSpringSpec implements FloatAnimationSpec {
    public static final int $stable = 8;
    private final float dampingRatio;
    private final SpringSimulation spring;
    private final float stiffness;
    private final float visibilityThreshold;

    public FloatSpringSpec() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getEndVelocity(float f2, float f3, float f4) {
        return 0.0f;
    }

    public FloatSpringSpec(float f2, float f3, float f4) {
        this.dampingRatio = f2;
        this.stiffness = f3;
        this.visibilityThreshold = f4;
        SpringSimulation springSimulation = new SpringSimulation(1.0f);
        springSimulation.setDampingRatio(f2);
        springSimulation.setStiffness(f3);
        this.spring = springSimulation;
    }

    public /* synthetic */ FloatSpringSpec(float f2, float f3, float f4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (1 | i2) != 0 ? 1.0f : f2, (i2 + 2) - (2 | i2) != 0 ? 1500.0f : f3, (i2 & 4) != 0 ? 0.01f : f4);
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long j2, float f2, float f3, float f4) {
        long j3 = j2 / AnimationKt.MillisToNanos;
        this.spring.setFinalPosition(f3);
        return Motion.m501getValueimpl(this.spring.m507updateValuesIJZedt4$animation_core_release(f2, f4, j3));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long j2, float f2, float f3, float f4) {
        long j3 = j2 / AnimationKt.MillisToNanos;
        this.spring.setFinalPosition(f3);
        return Motion.m502getVelocityimpl(this.spring.m507updateValuesIJZedt4$animation_core_release(f2, f4, j3));
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f2, float f3, float f4) {
        float stiffness = this.spring.getStiffness();
        float dampingRatio = this.spring.getDampingRatio();
        float f5 = this.visibilityThreshold;
        return SpringEstimationKt.estimateAnimationDurationMillis(stiffness, dampingRatio, f4 / f5, (f2 - f3) / f5, 1.0f) * AnimationKt.MillisToNanos;
    }
}
