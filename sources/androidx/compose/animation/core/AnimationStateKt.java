package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: AnimationState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d̉=!,r\bDZc|\u0004G\b8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?1LeV5ZS0\u0010s{B)c$\bCCU \u0004:p]P\u007fs~Lj\u000b\n\u0012\u0016\u0018\tjrM\u0004x}\u0014\u0015˰Pr_9SnK=\ttd\nPB0>\u0012\u0011\u0011\u001c:HVy\u000bE[\fX4nwjV\u001bU\u001d\u001aX\tn$\u000f'tg\u00159xrc:=-\u001bipYWe6|[\u0019^TU\u0018'g$+NDM\u0015SRΫ\u000bRiM\u001b\u007f\u007f?\u001dt7);I\"fFZ\u0010\u0014C;}\r\u000ev4d\u001dQ\u000f\u001bW1UcYY&(&\n,\u0013B\u0004\u001c\u0010?H\\8Jl\u000e\u000eA\u0001\u000bSn[2dH\u007f\tnN\u0017S~K\u0015G,~]q=)N}~\u0015\u000f.#GrO[t\u0010fٽ)W\u0018W7PNApN8^ey\u0014rr\u0002p\u0007@I\u0010/B\u0015\\\u0017U=a913\u0004\u0002\u000fG\u0018~\u000b`vf\u0002T^?hrF=0\t\u001ad\\d3v\u0001Z^,\u001fY4T5\t8\u0019&\\\u0006I9%>Mћlixau\\3@~Cip{\u000e\u0006Hn5EQ\u0012 \u0010R\u001f O>r\u0005\u0007uRU\u001cZ\u000b8P2xp\u0016w\nVf\fAAow\"4:F1\\CW3$HA\u000b\u0013wZ\u0017\u001b/Z9$\u0011u<t7\f\u0001bvou\u0006a,+_:^OgM\u0019lYBj:ê1\n\u001fy\u0006FuPoL\u001b\u001b\u001ea\f\"&\u001a\u007fT??#\u000fE-`\t]IZ\u0005}Q\u0014\u0015ؠ~|\b&[\u0004<Ԗ j\u001f+\trZOZ\u00182vdsQ\b\u001bD\u05fbeJ\u0013IiҺ\u0019\\ƕM\u000b"}, d2 = {"7r56a0LV\u0019}", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\"-\u0011wa\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\f$dp9\\'!", "\u000fmX:T;B]\"l\nZ;|", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "Bx_266Gd\u0019\f\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", "7mXA\\(ED\u0015\u0006\u000b^", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", ":`bA99:[\u0019m~f,e\u00058o\u000e", "", "4h]6f/>R\b\u0003\u0003^\u0015x\u00129s", "7rABa5B\\\u001b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&\u007f  IW\u0019u=/\u0015up9\u00149\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001s\nUR 8K3(\nu3~@h~\u001bkr\u001a_4)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,&m\u0010g\u0019k>D-]o#(h\u001a\n\u0013\u007f[\r\u0002V\u0004pUV\u0015\n8y", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "1n_F", "D`[BX", "Dd[<V0Mg\n~xm6\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\f$dp9\\J1J\b#\u0011SJ5^\u001c\\:\u0019\u0012X\u001d$\u0012\t\u000eXN.rCJh\u00066Q\rEv\u0001U\u0012\u00179rlQZ\u001aPC\u0013\u007fN)2\"bc\u0002CPIl3U\f],fG\u0010\txf\\\u0002dY-\u0017\u0006W\u0010\u0006\u001cwqoR#\t8m:v_NA~YF}p\u001dU\tw[\u000eax3p<\b>3$s\u0001Zgm", "Dd[<V0Mg", "1qT.g,3S&\tk^*\f\u0013<F\r2\u0004", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&\u007f  IW\u0019u=/\u0015up9\u00149\u0013Sr8C\u0016U(eT<'\u0011\u0017Z\f]\u0001PkUJ#{N;\u001e\u001buG\fCs\u000b\u001a\u0016W1stJR\u001fK\u0004\u001e??3uF#;\u0003KIAq.n\u0015P\u001dZID1i", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnimationStateKt {
    public static final boolean isFinished(AnimationState<?, ?> animationState) {
        return animationState.getFinishedTimeNanos() != Long.MIN_VALUE;
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, Object obj, AnimationVector animationVector, long j2, long j3, boolean z2, int i2, Object obj2) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            obj = animationState.getValue();
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            animationVector = AnimationVectorsKt.copy(animationState.getVelocityVector());
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            j2 = animationState.getLastFrameTimeNanos();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            j3 = animationState.getFinishedTimeNanos();
        }
        if ((i2 & 16) != 0) {
            z2 = animationState.isRunning();
        }
        return copy((AnimationState<Object, AnimationVector>) animationState, obj, animationVector, j2, j3, z2);
    }

    public static final <T, V extends AnimationVector> AnimationState<T, V> copy(AnimationState<T, V> animationState, T t2, V v2, long j2, long j3, boolean z2) {
        return new AnimationState<>(animationState.getTypeConverter(), t2, v2, j2, j3, z2);
    }

    public static /* synthetic */ AnimationState copy$default(AnimationState animationState, float f2, float f3, long j2, long j3, boolean z2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = ((Number) animationState.getValue()).floatValue();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = ((AnimationVector1D) animationState.getVelocityVector()).getValue();
        }
        if ((i2 + 4) - (4 | i2) != 0) {
            j2 = animationState.getLastFrameTimeNanos();
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            j3 = animationState.getFinishedTimeNanos();
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            z2 = animationState.isRunning();
        }
        return copy((AnimationState<Float, AnimationVector1D>) animationState, f2, f3, j2, j3, z2);
    }

    public static final AnimationState<Float, AnimationVector1D> copy(AnimationState<Float, AnimationVector1D> animationState, float f2, float f3, long j2, long j3, boolean z2) {
        return new AnimationState<>(animationState.getTypeConverter(), Float.valueOf(f2), AnimationVectorsKt.AnimationVector(f3), j2, j3, z2);
    }

    public static /* synthetic */ AnimationState AnimationState$default(float f2, float f3, long j2, long j3, boolean z2, int i2, Object obj) {
        boolean z3 = z2;
        long j4 = j2;
        float f4 = f3;
        if ((i2 + 2) - (2 | i2) != 0) {
            f4 = 0.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            j4 = Long.MIN_VALUE;
        }
        long j5 = (8 & i2) == 0 ? j3 : Long.MIN_VALUE;
        if ((i2 & 16) != 0) {
            z3 = false;
        }
        return AnimationState(f2, f4, j4, j5, z3);
    }

    public static final AnimationState<Float, AnimationVector1D> AnimationState(float f2, float f3, long j2, long j3, boolean z2) {
        return new AnimationState<>(VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), Float.valueOf(f2), AnimationVectorsKt.AnimationVector(f3), j2, j3, z2);
    }

    public static /* synthetic */ AnimationState AnimationState$default(TwoWayConverter twoWayConverter, Object obj, Object obj2, long j2, long j3, boolean z2, int i2, Object obj3) {
        boolean z3 = z2;
        long j4 = j2;
        if ((i2 & 8) != 0) {
            j4 = Long.MIN_VALUE;
        }
        long j5 = (i2 & 16) == 0 ? j3 : Long.MIN_VALUE;
        if ((i2 + 32) - (i2 | 32) != 0) {
            z3 = false;
        }
        return AnimationState(twoWayConverter, obj, obj2, j4, j5, z3);
    }

    public static final <T, V extends AnimationVector> AnimationState<T, V> AnimationState(TwoWayConverter<T, V> twoWayConverter, T t2, T t3, long j2, long j3, boolean z2) {
        return new AnimationState<>(twoWayConverter, t2, twoWayConverter.getConvertToVector().invoke(t3), j2, j3, z2);
    }

    public static final <T, V extends AnimationVector> V createZeroVectorFrom(TwoWayConverter<T, V> twoWayConverter, T t2) {
        V vInvoke = twoWayConverter.getConvertToVector().invoke(t2);
        vInvoke.reset$animation_core_release();
        return vInvoke;
    }
}
