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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4E\u0007\":\u0018\u007f\u0007lvA0RnP\u008cZS8şs{:)c$\u007fCCU \u0001*\t]Zo˧tOpŏs\u000f4\u00159\u000e<Mcxu\u0012=3RsM5eok:pxD\b82P9\n\t\u000f\u001eBH>wټGK\u001a\u0017xQ~Oj\r{\u001bJ\u0018\u0014U8\u00034[\u0016f|Զl&N=<\u001bipOWc>\u0017e\rt[m˪vҐ\"+FR}\u001b3o\u001b\u0007\u0001b\u0006\u0017\b|K\"\u0001'UǢ\u0010\u0002ɱ:X\u00062]6],urT|K_ԃ\u0010'1p,g^0@w)\u001c=@\u0012(\u001e'v5]\u001et+&3#s\u001aĄPؿbB\u0006\u001f*<%J\u00183Y_az\"sI\u001ff7*\fc̥eъr'c٪&b\u001b#b\u0001\"S_@UH|\u000b\nA{\u000e\tb0+Bn\u001eĐ;ɨ\u0015:\u001f¦O]?./w\"JJt\u0005\u00131\u000bakjHn#\u001f\u001aE4!\f\tE#CB³`г0\u001dUȼl\t\u0004\u0017!,|yB13\u001e\u001fqvl\u0003M\f\u000bU3tAqn\u001a\u000f\u0016w5گAɄg\u001ci\u05ec\u000f\u0016EMp\u0011xhHe\u001ah-J06`j>x,H\\\u0016+2mrZr\u0003ւ%Å\u0019T\u000bٜZC\u0003\u001cmf\t\u0012\u0005hA2ҙmK"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFUB\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "D0", "", "D1", "D2", "D3", "uE5\u00139o/", "Ahi2", "", "5dc \\A>\u0012\u0015\b~f(\f\r9ny&\u0006M\u0001\u0011$Gv\u000e8\u0005%", "u(8", "\nrTA \u0006\u0017", "5dc#$", "u(5", "Adc#$j:\\\u001d\u0007vm0\u0007\u0012)c\n5{:\u000e\u0017\u001eGk\u001c<", "uE\u0018#", "5dc#%", "Adc#%j:\\\u001d\u0007vm0\u0007\u0012)c\n5{:\u000e\u0017\u001eGk\u001c<", "5dc#&", "Adc#&j:\\\u001d\u0007vm0\u0007\u0012)c\n5{:\u000e\u0017\u001eGk\u001c<", "5dc#'", "Adc#'j:\\\u001d\u0007vm0\u0007\u0012)c\n5{:\u000e\u0017\u001eGk\u001c<", "3pd._:", "", "=sW2e", "", "5dc", "7mS2k", "5dcpT5B[\u0015\u000e~h5v\u00079r\u007f\"\t@\b\u0017\u0013Uo", "6`b566=S", "<df#X*M]&", "<df#X*M]&=vg0\u0005\u0005>i\n1u>\u000b$\u0017A|\u000eCv!CY", "@db2g", "", "@db2gj:\\\u001d\u0007vm0\u0007\u0012)c\n5{:\u000e\u0017\u001eGk\u001c<", "Adc", "D`[BX", "AdcpT5B[\u0015\u000e~h5v\u00079r\u007f\"\t@\b\u0017\u0013Uo", "BnBAe0GU", "", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnimationVector4D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;
    private float v1;
    private float v2;
    private float v3;
    private float v4;

    public AnimationVector4D(float f2, float f3, float f4, float f5) {
        super(null);
        this.v1 = f2;
        this.v2 = f3;
        this.v3 = f4;
        this.v4 = f5;
        this.size = 4;
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

    public final float getV3() {
        return this.v3;
    }

    public final void setV3$animation_core_release(float f2) {
        this.v3 = f2;
    }

    public final float getV4() {
        return this.v4;
    }

    public final void setV4$animation_core_release(float f2) {
        this.v4 = f2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.v1 = 0.0f;
        this.v2 = 0.0f;
        this.v3 = 0.0f;
        this.v4 = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public AnimationVector4D newVector$animation_core_release() {
        return new AnimationVector4D(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i2) {
        if (i2 == 0) {
            return this.v1;
        }
        if (i2 == 1) {
            return this.v2;
        }
        if (i2 == 2) {
            return this.v3;
        }
        if (i2 != 3) {
            return 0.0f;
        }
        return this.v4;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i2, float f2) {
        if (i2 == 0) {
            this.v1 = f2;
            return;
        }
        if (i2 == 1) {
            this.v2 = f2;
        } else if (i2 == 2) {
            this.v3 = f2;
        } else {
            if (i2 != 3) {
                return;
            }
            this.v4 = f2;
        }
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.v1 + ", v2 = " + this.v2 + ", v3 = " + this.v3 + ", v4 = " + this.v4;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnimationVector4D) {
            AnimationVector4D animationVector4D = (AnimationVector4D) obj;
            if (animationVector4D.v1 == this.v1 && animationVector4D.v2 == this.v2 && animationVector4D.v3 == this.v3 && animationVector4D.v4 == this.v4) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.v1) * 31) + Float.hashCode(this.v2)) * 31) + Float.hashCode(this.v3)) * 31) + Float.hashCode(this.v4);
    }
}
