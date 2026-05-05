package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: AnimationVectors.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d̉=!4i\bӵLc\u0003\tI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN/ZS@\u000fs{:$c$\u007fCCU \u007f:\u0015]Ȟ\u007fg\u001dI\u000b\u000fQ\u000f\u001e\u0016'kD]cތu\u0012=4rsM3eok:\u0011xD\b82P9\u0012!\u000fɝBH>z+GY\f*0nqjV\u001bP\u001d\u001a@\u0007n$\u000f#tg|7`\u0011kŽG#1orR5_H|{\u000evX5\u0010\u000faL,p;C\u001a=S1\b\u0003_M\nWqk\u0006\u0001@53as\u001e?x\u0006\u001aƃ9X5]!0\u0005\u0005\u0018iRʬ˦ScY[&I\u0006\u0007\u0014\rj\u0011.\f-Ξ<6Bf6\u0018[t9\\pT\u0010lZ\u007fAj|ЍӾ\u000439H3\u007f_qS\u0019\u0015@\u001c\u000b\u0013̔1\n\u0017!\n^6`[$\u001bȭΦ5QNH˙R\u001b"}, d2 = {"\u000fmX:T;B]\"oz\\;\u0007\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "D0", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFSB\u0002", "D1", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFTB\u0002", "D2", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFUB\u0002", "D3", "1n_F", "\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\u000f\u0015fpC\u00149o5r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0001bE,jS;)\u0011uG\fHhJg\u001f\u0012=f\u007fF`\u00198y\u0013\u0005K6>", "1n_F99H[", "", "And?V,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\u000f\u0015fpC\u00149\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\t\u000e]I }HA(Q*S\u000f;2\\\u0015\u001a\u00161ytL_\u0001Gw$\u007fN~,7", "<df\u0016a:MO\"|z", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnimationVectorsKt {
    public static final AnimationVector1D AnimationVector(float f2) {
        return new AnimationVector1D(f2);
    }

    public static final AnimationVector2D AnimationVector(float f2, float f3) {
        return new AnimationVector2D(f2, f3);
    }

    public static final AnimationVector3D AnimationVector(float f2, float f3, float f4) {
        return new AnimationVector3D(f2, f3, f4);
    }

    public static final AnimationVector4D AnimationVector(float f2, float f3, float f4, float f5) {
        return new AnimationVector4D(f2, f3, f4, f5);
    }

    public static final <T extends AnimationVector> T newInstance(T t2) {
        T t3 = (T) t2.newVector$animation_core_release();
        Intrinsics.checkNotNull(t3, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t3;
    }

    public static final <T extends AnimationVector> T copy(T t2) {
        T t3 = (T) newInstance(t2);
        int size$animation_core_release = t3.getSize$animation_core_release();
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            t3.set$animation_core_release(i2, t2.get$animation_core_release(i2));
        }
        return t3;
    }

    public static final <T extends AnimationVector> void copyFrom(T t2, T t3) {
        int size$animation_core_release = t2.getSize$animation_core_release();
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            t2.set$animation_core_release(i2, t3.get$animation_core_release(i2));
        }
    }
}
