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
/* JADX INFO: compiled from: FloatDecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4F\u0007\":\u0019\u007f\u0007lo?5Z͜x.\u0001Rj&{\u0002:%i$\nCiV*\u0004(\n]P\u007fg\u001dKҼ\u000fC\u001d\t^\u000fx3aU'eB\u0013@K\b?aN AGj\r63!x6\u0001\u0010\u0013\f2*v\u0011'~QT$\u0012^A!>`\u0017e\u0005H\u0013LRh\u001f,h\u007fNdI\u001daH<;\u0003\u0018J~+m9\u0015M;G\u0005+\u001b\u0001y\u001eYA}I]Ca\u0011\u001fR\n@3C\u007fJ\u001dhU/[M\u0002`NX.\u0015E/]\u0017urT]Ke1\u001e5-gcyQdߡyߡ\u007f\u0013Dǉ&\b-L<2jr\u0016\u0014Kt!T\u0017Г\u0004ެF\u007f\u0003ʨِ\u001b4"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001>w\u0012=-VFu=\u001e\u001ewe5\u000eB,Lr;5WN*2", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001>w\u0012=,C9gHy\u001eli5\u0016g6Wd2GJ$", "4qX0g0H\\\u0001\u000f\u0002m0\b\u00103e\r", "", "/ab#X3HQ\u001d\u000e\u000fM/\n\t=h\n/z", "uE5uI", "5dc\u000eU:/S \txb;\u0011w2r\u007f6~J\b\u0016", "u(5", "4qX0g0H\\", "5dc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=", "", "7mXA\\(ED\u0015\u0006\u000b^", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "5dc!T9@S(ove<|", "5dc#T3NSy\f\u0005f\u0015x\u00129s", ">kPFG0FS\u0002z\u0004h:", "5dc#X3HQ\u001d\u000e\u000f?9\u0007\u0011\u0018a\t2\n", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FloatExponentialDecaySpec implements FloatDecayAnimationSpec {
    public static final int $stable = 0;
    private final float absVelocityThreshold;
    private final float friction;

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatExponentialDecaySpec() {
        float f2 = 0.0f;
        this(f2, f2, 3, null);
    }

    public FloatExponentialDecaySpec(float f2, float f3) {
        this.absVelocityThreshold = Math.max(1.0E-7f, Math.abs(f3));
        this.friction = Math.max(1.0E-4f, f2) * (-4.2f);
    }

    public /* synthetic */ FloatExponentialDecaySpec(float f2, float f3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((1 & i2) != 0 ? 1.0f : f2, (i2 & 2) != 0 ? 0.1f : f3);
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getValueFromNanos(long j2, float f2, float f3) {
        long j3 = j2 / AnimationKt.MillisToNanos;
        float f4 = this.friction;
        return (f2 - (f3 / f4)) + ((f3 / f4) * ((float) Math.exp((f4 * j3) / 1000.0f)));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getVelocityFromNanos(long j2, float f2, float f3) {
        return f3 * ((float) Math.exp(((j2 / AnimationKt.MillisToNanos) / 1000.0f) * this.friction));
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public long getDurationNanos(float f2, float f3) {
        return ((long) ((((float) Math.log(getAbsVelocityThreshold() / Math.abs(f3))) * 1000.0f) / this.friction)) * AnimationKt.MillisToNanos;
    }

    @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
    public float getTargetValue(float f2, float f3) {
        if (Math.abs(f3) <= getAbsVelocityThreshold()) {
            return f2;
        }
        double dLog = Math.log(Math.abs(getAbsVelocityThreshold() / f3));
        float f4 = this.friction;
        return (f2 - (f3 / f4)) + ((f3 / f4) * ((float) Math.exp((((double) f4) * ((dLog / ((double) f4)) * ((double) 1000))) / ((double) 1000.0f))));
    }
}
