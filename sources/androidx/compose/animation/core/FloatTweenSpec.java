package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4B\u0007\"B\u0012\u007f\u0007llA0RlP.XW2\u000fy\u0001<$a'wHQ٥J}P\b\u0010owmtJh\u000b[\u000f4\u0017\tp2Iczu\u0012=3RuE3[rU9\u000fxȥ\t @'\u0001\b\u0013\r2*v\u0019'~QX$\u0012^I7:\u001b+[\u00132\u00124GP\u0005,k\u007fNdX\u001daH@;\u0003\u0018R~+mB\u0015M;V\u001b;U\u001do1C@eEE)a\u0010\u001fR\nH3C\u007fL\u001dhU7[M\u0002hNX.$E/]\u001furTlKe)25?gcy`>,\u0006\b\u0014\rj\r>\n5WF-Hv8\u0012A\u0006\u000bSn`2bP\u0012\u0013ad'k\u0014\u0004:G\u001d~Q\u0010<ϭR=\u0004˜% )\u0007|(,`\u001ch-\u001b\u0003\u0001(ĻS͘AHVˣ*L{\u0004\tb0+˙4M\b\u07fc\u0014\u00134!3>,E1,\u0004\u0002vM>ϻ\u0007¾lSqɭ\u0019L0q.7X\rbɱF\u0081\tkXӹй0&"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001>w\u0012=<U;k=\f h_\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001>w\u0012=)L?s0-\u0019rj'\u0012c*$", "2ta.g0H\\", "", "2d[.l", "3`b6a.", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u007f3{\u001a7O\u0019", "uH8\u0019T5=`#\u0003yquz\u00137p\n6{\n| \u001bOk\u001d@\u0001.~W\b-77u*[GDm\na\u0006", "5dc\u0011X3:g", "u(8", "2d[.l\u0015:\\#\r", "", "5dc\u0011h9:b\u001d\t\u0004", "2ta.g0H\\\u0002z\u0004h:", "1kP:c\u0017EO-m~f,e\u00058o\u000e", ">kPFG0FS\u0002z\u0004h:", "5dc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=", "7mXA\\(ED\u0015\u0006\u000b^", "", "B`a4X;/O \u000fz", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "5dc#T3NSy\f\u0005f\u0015x\u00129s", "5dc#X3HQ\u001d\u000e\u000f?9\u0007\u0011\u0018a\t2\n", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FloatTweenSpec implements FloatAnimationSpec {
    public static final int $stable = 0;
    private final int delay;
    private final long delayNanos;
    private final int duration;
    private final long durationNanos;
    private final Easing easing;

    public FloatTweenSpec() {
        this(0, 0, null, 7, null);
    }

    public FloatTweenSpec(int i2, int i3, Easing easing) {
        this.duration = i2;
        this.delay = i3;
        this.easing = easing;
        this.durationNanos = ((long) i2) * AnimationKt.MillisToNanos;
        this.delayNanos = ((long) i3) * AnimationKt.MillisToNanos;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getDelay() {
        return this.delay;
    }

    public /* synthetic */ FloatTweenSpec(int i2, int i3, Easing easing, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 + 1) - (1 | i4) != 0 ? 300 : i2, (-1) - (((-1) - i4) | ((-1) - 2)) != 0 ? 0 : i3, (i4 + 4) - (i4 | 4) != 0 ? EasingKt.getFastOutSlowInEasing() : easing);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getValueFromNanos(long j2, float f2, float f3, float f4) {
        float fClampPlayTimeNanos = this.duration == 0 ? 1.0f : clampPlayTimeNanos(j2) / this.durationNanos;
        Easing easing = this.easing;
        if (fClampPlayTimeNanos < 0.0f) {
            fClampPlayTimeNanos = 0.0f;
        }
        return VectorConvertersKt.lerp(f2, f3, easing.transform(fClampPlayTimeNanos <= 1.0f ? fClampPlayTimeNanos : 1.0f));
    }

    private final long clampPlayTimeNanos(long j2) {
        return RangesKt.coerceIn(j2 - this.delayNanos, 0L, this.durationNanos);
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public long getDurationNanos(float f2, float f3, float f4) {
        return ((long) (this.delay + this.duration)) * AnimationKt.MillisToNanos;
    }

    @Override // androidx.compose.animation.core.FloatAnimationSpec
    public float getVelocityFromNanos(long j2, float f2, float f3, float f4) {
        long jClampPlayTimeNanos = clampPlayTimeNanos(j2);
        if (jClampPlayTimeNanos < 0) {
            return 0.0f;
        }
        if (jClampPlayTimeNanos == 0) {
            return f4;
        }
        return (getValueFromNanos(jClampPlayTimeNanos, f2, f3, f4) - getValueFromNanos(jClampPlayTimeNanos - AnimationKt.MillisToNanos, f2, f3, f4)) * 1000.0f;
    }
}
