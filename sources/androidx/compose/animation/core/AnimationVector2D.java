package androidx.compose.animation.core;

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
/* JADX INFO: compiled from: AnimationVectors.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4C\u0007\":\u0018\u007f\u0007lrA0RnP\u008cZS8şs{:)c$\u007fCCU \u0001*\t]Zo˧tOpŏs\u000f4\u00159}<Mcxu\u0012=3RsM5eok:žx6\u0013#z3F\t\u001d\u0001H:x\u0016\u0005\f[M\"\u0011^R7ĄRUa\u0013-*\u0006l!1\"j{f6vq$Ǝ/ݭ\u0007iHcoe>\u0013e\rtYm!?l,BX7cՖkaΫ\u000bRaWKJ\u007fV\u001dhUAqWָ[6^\u001b\\19k%]!@\r\t_t$'YT\u0014O^+@w)|Sɮ\u0004؝\n'NLu t'&3#\u0013\u001aT!\u0014lF\u0018z\u0010;mӬBĴ/?#ƘicA\u001f\\>L'\u001b\u001e;\u0001\u001d\"\fX\u001ch-\u001b\u0003x\u0010o(̼I˓R\u0016aƝ\u0006\u0006vk\u00104$2M\u000b=\baP%'O[g$Qo\u0010P\\g%\u0006\u001f'*֦^͕D.vݫO,\u000f\u0019hN\u0005\u0007q^bdµ\u0015n"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFSB\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "D0", "", "D1", "uE5uI", "Ahi2", "", "5dc \\A>\u0012\u0015\b~f(\f\r9ny&\u0006M\u0001\u0011$Gv\u000e8\u0005%", "u(8", "\nrTA \u0006\u0017", "5dc#$", "u(5", "Adc#$j:\\\u001d\u0007vm0\u0007\u0012)c\n5{:\u000e\u0017\u001eGk\u001c<", "uE\u0018#", "5dc#%", "Adc#%j:\\\u001d\u0007vm0\u0007\u0012)c\n5{:\u000e\u0017\u001eGk\u001c<", "3pd._:", "", "=sW2e", "", "5dc", "7mS2k", "5dcpT5B[\u0015\u000e~h5v\u00079r\u007f\"\t@\b\u0017\u0013Uo", "6`b566=S", "<df#X*M]&", "<df#X*M]&=vg0\u0005\u0005>i\n1u>\u000b$\u0017A|\u000eCv!CY", "@db2g", "", "@db2gj:\\\u001d\u0007vm0\u0007\u0012)c\n5{:\u000e\u0017\u001eGk\u001c<", "Adc", "D`[BX", "AdcpT5B[\u0015\u000e~h5v\u00079r\u007f\"\t@\b\u0017\u0013Uo", "BnBAe0GU", "", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnimationVector2D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;
    private float v1;
    private float v2;

    public AnimationVector2D(float f2, float f3) {
        super(null);
        this.v1 = f2;
        this.v2 = f3;
        this.size = 2;
    }

    public final float getV1() {
        return this.v1;
    }

    public final void setV1$animation_core_release(float f2) {
        this.v1 = f2;
    }

    public final float getV2() {
        return this.v2;
    }

    public final void setV2$animation_core_release(float f2) {
        this.v2 = f2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.v1 = 0.0f;
        this.v2 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public AnimationVector2D newVector$animation_core_release() {
        return new AnimationVector2D(0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i2) {
        if (i2 == 0) {
            return this.v1;
        }
        if (i2 != 1) {
            return 0.0f;
        }
        return this.v2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i2, float f2) {
        if (i2 == 0) {
            this.v1 = f2;
        } else {
            if (i2 != 1) {
                return;
            }
            this.v2 = f2;
        }
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.v1 + ", v2 = " + this.v2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnimationVector2D) {
            AnimationVector2D animationVector2D = (AnimationVector2D) obj;
            if (animationVector2D.v1 == this.v1 && animationVector2D.v2 == this.v2) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.v1) * 31) + Float.hashCode(this.v2);
    }
}
