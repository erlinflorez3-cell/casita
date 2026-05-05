package androidx.compose.foundation.layout;

import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.foundation.layout.AndroidFlingSpline;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0017\u007f\u0007lnA0RlP.XT2\u000fy\u007f<$a'wCQ٥J}P\b\u0010Ywk|Jr\u000bq\u0010و\u001axx.\u0012a\u0007e*\u000f`F CAV\b=gd=L\u0013*J\"f\u00055\u0005(6`\u0010%~sO\u001a\u001fH@\u001f>\u0019!\u0016\u0013( \u001e>N\u0010N`uWNH\u001ba\u0001/k\u0019wRf'\u000e4-Q\u001bRl';z\u0012\"9MO5C)\u001a\u0017OpiP\u001b? A5l59CI\"bf\\\u000e -+}\u0011\u000ev4i\u001dQ\u000f\u0010m?\u0018\u0002Yc&(&~,\u0011J\u0016&\u0006US^1(r \u000eax#WN]\u001a^p\u0004Au\u0007)3\u0003K+g\u001f\u001d&8ݹ\u001b\u05ee;\u007f\u001d\u000f$(\u000ftqgb\u0015x\u0015IXNΆ3ҨD=Pݐ̌]Q"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00049TGDk\u0011\u001a#h`\u001a\u000em(]U'EHb\beVz9#\u0016d\u0017<6\r\u0003/", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001>w\u0012=,C9gHy\u001eli5\u0016g6Wd2GJ$", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\r1\u0007", "/ab#X3HQ\u001d\u000e\u000fM/\n\t=h\n/z", "", "5dc\u000eU:/S \txb;\u0011w2r\u007f6~J\b\u0016", "u(5", ";`V6V\u0017Ag'\u0003xZ3Z\u0013/f\u0001,yD\u0001 &", "4kX;Z\u000bBa(z\u0004\\,", "Dd[<V0Mg", "5dc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=", "", "7mXA\\(ED\u0015\u0006\u000b^", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "5dc c3B\\\u0019]z\\,\u0004\t<a\u000f,\u0006I", "", "5dc!T9@S(ove<|", "5dc#T3NSy\f\u0005f\u0015x\u00129s", ">kPFG0FS\u0002z\u0004h:", "5dc#X3HQ\u001d\u000e\u000f?9\u0007\u0011\u0018a\t2\n", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    private final float magicPhysicalCoefficient;

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        this.magicPhysicalCoefficient = density.getDensity() * 386.0878f * 160.0f * 0.84f;
    }

    private final double getSplineDeceleration(float f2) {
        return AndroidFlingSpline.INSTANCE.deceleration(f2, WindowInsetsConnection_androidKt.PlatformFlingScrollFriction * this.magicPhysicalCoefficient);
    }

    public final float flingDistance(float f2) {
        return ((float) (((double) (WindowInsetsConnection_androidKt.PlatformFlingScrollFriction * this.magicPhysicalCoefficient)) * Math.exp((WindowInsetsConnection_androidKt.DecelerationRate / WindowInsetsConnection_androidKt.DecelMinusOne) * getSplineDeceleration(f2)))) * Math.signum(f2);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f2, float f3) {
        return f2 + flingDistance(f3);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j2, float f2, float f3) {
        long durationNanos = getDurationNanos(0.0f, f3);
        return f2 + (flingDistance(f3) * AndroidFlingSpline.FlingResult.m893getDistanceCoefficientimpl(AndroidFlingSpline.INSTANCE.m888flingPositionLfoxSSI(durationNanos > 0 ? j2 / durationNanos : 1.0f)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f2, float f3) {
        return (long) (Math.exp(getSplineDeceleration(f3) / WindowInsetsConnection_androidKt.DecelMinusOne) * 1.0E9d);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j2, float f2, float f3) {
        long durationNanos = getDurationNanos(0.0f, f3);
        return ((AndroidFlingSpline.FlingResult.m894getVelocityCoefficientimpl(AndroidFlingSpline.INSTANCE.m888flingPositionLfoxSSI(durationNanos > 0 ? j2 / durationNanos : 1.0f)) * flingDistance(f3)) / durationNanos) * 1.0E9f;
    }
}
