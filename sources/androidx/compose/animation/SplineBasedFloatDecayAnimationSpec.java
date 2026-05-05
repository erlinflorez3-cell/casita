package androidx.compose.animation;

import androidx.compose.animation.core.AnimationKt;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
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
/* JADX INFO: compiled from: SplineBasedFloatDecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0017\u007f\u0007lkA0ZeP.XT2\u000fy\u0003<$a)wHQ٥J}P\b\u0010Ywk|Jr\u000bq\u0010و\u001axx.\u0012c\u0007f*\u000f`F CAW\b=gd;6M6@-Py3\rJ.V\u001d\u000fzqO<\u0016>N\t:\u0001\u0011\u0014\u0019b(\u0014M8\u0001L`\u0018RDU\u0005]h3S\u0007wPf'\u000e4CaUdb7%v\u0010\"[DEF-%\u0002\u000f7ViL\u001b? A5l55CI\"[|lH2#=g\r\fvV`\u0013bx\fU7\u007fgY]&(&~,\u0011J\u0012&\u0006ULtAjx\u0016\u0011Kt!Wv%XޠDȸ~eN\u0019+\u0005A1\n'tXy;GV\u000eީ\u0007ڟ\"#\t͙ĸ_g"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006d0<]\u0007 \u0014i$.L$Bu0-sh_5\u001b?5R~#VPX5J]r;i", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001>w\u0012=,C9gHy\u001eli5\u0016g6Wd2GJ$", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\r1\u0007", "/ab#X3HQ\u001d\u000e\u000fM/\n\t=h\n/z", "", "5dc\u000eU:/S \txb;\u0011w2r\u007f6~J\b\u0016", "u(5", "4kX;Z\n:Z\u0017\u000f\u0002Z;\u0007\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006W,9b\u007f}3t\u0014>T?JuAs", "4kX;Z\u000bBa(z\u0004\\,", "AsP?g\u001d>Z#|~m@", "5dc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=", "", "7mXA\\(ED\u0015\u0006\u000b^", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "5dc!T9@S(ove<|", "5dc#T3NSy\f\u0005f\u0015x\u00129s", ">kPFG0FS\u0002z\u0004h:", "5dc#X3HQ\u001d\u000e\u000f?9\u0007\u0011\u0018a\t2\n", "/mX:T;B]\"x\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SplineBasedFloatDecayAnimationSpec implements FloatDecayAnimationSpec {
    public static final int $stable = 0;
    private final FlingCalculator flingCalculator;

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    public SplineBasedFloatDecayAnimationSpec(Density density) {
        this.flingCalculator = new FlingCalculator(SplineBasedFloatDecayAnimationSpec_androidKt.getPlatformFlingScrollFriction(), density);
    }

    private final float flingDistance(float f2) {
        return this.flingCalculator.flingDistance(f2) * Math.signum(f2);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f2, float f3) {
        return f2 + flingDistance(f3);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j2, float f2, float f3) {
        return f2 + this.flingCalculator.flingInfo(f3).position(j2 / AnimationKt.MillisToNanos);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f2, float f3) {
        return this.flingCalculator.flingDuration(f3) * AnimationKt.MillisToNanos;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j2, float f2, float f3) {
        return this.flingCalculator.flingInfo(f3).velocity(j2 / AnimationKt.MillisToNanos);
    }
}
