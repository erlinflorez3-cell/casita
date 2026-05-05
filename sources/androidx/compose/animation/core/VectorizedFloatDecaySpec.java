package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
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
/* JADX INFO: compiled from: DecayAnimationSpec.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&˛\bDZc|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG5LeN5ZS8\u0016s{:,a$\bّc[ Ԃ0\bwN\u0016g\u001fPj\rS\u000fL\u0015'klTe|k\u0014'2prУ7M}A\u0002{\u0003E\u001d `2h}\u0013\u00122*~Ƶ'~Q]$\u0012fϋ7Nň\u0011M\u0013-Z!L4\u0019\u001e\u0013ɡ~:V}u:e݊3mP`?_fŧ\u0014!ТX'\u001b\f*A9VO5KǬ\u0004\u0007\u0015is?1O\"A\u0013y?'aɞ$[Dj\u0018\u0014Kۀ\u0016!ǁv&j\u001d\u001a\u0004\u001a@CO\u001a֟\u0001\u00126\u000f\u0013{;L4\u0012\u00148`.cԿ\u0017\f\u001cE\rr\nó\u0017\u0016ެF\u007f\ty\u0007)3\u0005K+g!=϶cޅ\u001dT?ަ\u001d\u000f$*\u000fvqjb\u0010x\u0015IWɐU7Y̵UJT\u0013gG>\u0012~m\u001a*:\u0382\u001eČ[ɨ\u00150\u001f%Eg\n1/x\u001aHzϙMݖ\rĈWkZHN.?$E8!\f\u0011ե;ʐ\u0018ÏXZ4\u0011[(Ϊ\u000b\u0018"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3~\u001cr]Hec*J\u000b\u0015RLL\u0002", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u00117k%8ZGPk3|\u0015f]Mbl0Vr6KVW\u001agRp\u0013", "4k^.g\u000b>Q\u0015\u0013hi,z", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001>w\u0012=,C9gHy\u001eli5\u0016g6Wd2GJ$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0018t *\\\";i02pqeA\u0003r0X\u007f\u0015RLL\u0002 C", "/ab#X3HQ\u001d\u000e\u000fM/\n\t=h\n/z", "", "5dc\u000eU:/S \txb;\u0011w2r\u007f6~J\b\u0016", "u(5", "5dc\u0013_6:bw~xZ@j\u0014/c", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001N\u001d8IR\u001ak2\u001a)Dj=\u000f_;R\u000105WN*2", "B`a4X;/S\u0017\u000e\u0005k", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "D`[BX\u001d>Q(\t\b", "Dd[<V0Mg\n~xm6\n", "5dc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=", "", "7mXA\\(ED\u0015\u0006\u000b^", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\u000f\u0015fpC\u00149\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\t\u000e]I }HA(Q*S\u000f;2\\\u0015\u001a\u00161ytL_\u0001Gw$\u007fN~,+", "5dc!T9@S(ove<|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0013v\u001a6IR?u=\u000f\u0015fpC\u00149\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\t\u000e]I }HA(Q*S\u000f;2\\\u0015\u001a\u00161ytL_\u0001Gw$\u007fN~,-UhxTKIa=.\ni%gDH$]m\"\u001fpL=\u000e\u0006\\Zp\\\u0007g1#\"~@ MqeO6oSK~4t", "5dc#T3NSy\f\u0005f\u0015x\u00129s", ">kPFG0FS\u0002z\u0004h:", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0006h_H\u0011p\u00025r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0001bE,jS;)\u0011uG\fHhJg\u001f\u0012=f\u007fF`\u00198y\u0013\u0005K6>\n@[\u0003FNOf)wU]'dED2\u0014;\u0015$lX*\u0019\u007f]\u001a<P\u0004tg\u0011t\u0004<,:|_PN`U:\u00041,!", "5dc#X3HQ\u001d\u000e\u000f?9\u0007\u0011\u0018a\t2\n", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class VectorizedFloatDecaySpec<V extends AnimationVector> implements VectorizedDecayAnimationSpec<V> {
    private final float absVelocityThreshold;
    private final FloatDecayAnimationSpec floatDecaySpec;
    private V targetVector;
    private V valueVector;
    private V velocityVector;

    public VectorizedFloatDecaySpec(FloatDecayAnimationSpec floatDecayAnimationSpec) {
        this.floatDecaySpec = floatDecayAnimationSpec;
        this.absVelocityThreshold = floatDecayAnimationSpec.getAbsVelocityThreshold();
    }

    public final FloatDecayAnimationSpec getFloatDecaySpec() {
        return this.floatDecaySpec;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public float getAbsVelocityThreshold() {
        return this.absVelocityThreshold;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public V getValueFromNanos(long j2, V v2, V v3) {
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(v2);
        }
        V v4 = this.valueVector;
        if (v4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v4 = null;
        }
        int size$animation_core_release = v4.getSize$animation_core_release();
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            V v5 = this.valueVector;
            if (v5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                v5 = null;
            }
            v5.set$animation_core_release(i2, this.floatDecaySpec.getValueFromNanos(j2, v2.get$animation_core_release(i2), v3.get$animation_core_release(i2)));
        }
        V v6 = this.valueVector;
        if (v6 != null) {
            return v6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public long getDurationNanos(V v2, V v3) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v2);
        }
        V v4 = this.velocityVector;
        if (v4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v4 = null;
        }
        int size$animation_core_release = v4.getSize$animation_core_release();
        long jMax = 0;
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            jMax = Math.max(jMax, this.floatDecaySpec.getDurationNanos(v2.get$animation_core_release(i2), v3.get$animation_core_release(i2)));
        }
        return jMax;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public V getVelocityFromNanos(long j2, V v2, V v3) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) AnimationVectorsKt.newInstance(v2);
        }
        V v4 = this.velocityVector;
        if (v4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v4 = null;
        }
        int size$animation_core_release = v4.getSize$animation_core_release();
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            V v5 = this.velocityVector;
            if (v5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                v5 = null;
            }
            v5.set$animation_core_release(i2, this.floatDecaySpec.getVelocityFromNanos(j2, v2.get$animation_core_release(i2), v3.get$animation_core_release(i2)));
        }
        V v6 = this.velocityVector;
        if (v6 != null) {
            return v6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedDecayAnimationSpec
    public V getTargetValue(V v2, V v3) {
        if (this.targetVector == null) {
            this.targetVector = (V) AnimationVectorsKt.newInstance(v2);
        }
        V v4 = this.targetVector;
        if (v4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetVector");
            v4 = null;
        }
        int size$animation_core_release = v4.getSize$animation_core_release();
        for (int i2 = 0; i2 < size$animation_core_release; i2++) {
            V v5 = this.targetVector;
            if (v5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("targetVector");
                v5 = null;
            }
            v5.set$animation_core_release(i2, this.floatDecaySpec.getTargetValue(v2.get$animation_core_release(i2), v3.get$animation_core_release(i2)));
        }
        V v6 = this.targetVector;
        if (v6 != null) {
            return v6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetVector");
        return null;
    }
}
