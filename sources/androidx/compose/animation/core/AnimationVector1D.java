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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u0016DLш|\u0004O\u000b8\u000b4B\u0007\":\u0018\u007f\u0007lpA0RnP\u008cZS8şs{:)c$\u007fCCU \u007f*\t]Zo˧tOpŏs\u000f4\u00159u<Mcxu\u0012=3Բs?AO8NGl\r63-b(F\b\u001d\u00030)v\u001f=ٰC\u0014  @XphS=Q\u0013+*\u0006l$Gȷ\\ʄR6N~&@=6\u001bipRmsx\b[!^TU˙=oӿ/@=J]0a\u0019\u001fR\nVIMџA\u0005n?oGW\ro6\u0007\u0017D\u00199`%]!*\r\t_h$'YP*ְPˎ,w\u0001\u0016UB\u0012)\u001e'vJs.7\u001a\u001c6\rr\u0002D'ح!۰\u0004\u0001iا/'\u000689?k\t_iS\u0019|8,\t\u001b%;\u0001\u001d\"\u001a\u0013dֲ!ôX\u0004YĸiBCQ\\\u0014y?s\u000f~d͌.!"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkFRB\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "7mXAI(E", "", "uE\u0018#", "Ahi2", "", "5dc \\A>\u0012\u0015\b~f(\f\r9ny&\u0006M\u0001\u0011$Gv\u000e8\u0005%", "u(8", "\nrTA \u0006\u0017", "D`[BX", "5dc#T3NS", "u(5", "Adc#T3NSWz\u0004b4x\u00183o\t\"yJ\u000e\u0017\u0011To\u0015<r35", "3pd._:", "", "=sW2e", "", "5dc", "7mS2k", "5dcpT5B[\u0015\u000e~h5v\u00079r\u007f\"\t@\b\u0017\u0013Uo", "6`b566=S", "<df#X*M]&", "<df#X*M]&=vg0\u0005\u0005>i\n1u>\u000b$\u0017A|\u000eCv!CY", "@db2g", "", "@db2gj:\\\u001d\u0007vm0\u0007\u0012)c\n5{:\u000e\u0017\u001eGk\u001c<", "Adc", "AdcpT5B[\u0015\u000e~h5v\u00079r\u007f\"\t@\b\u0017\u0013Uo", "BnBAe0GU", "", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnimationVector1D extends AnimationVector {
    public static final int $stable = 8;
    private final int size;
    private float value;

    public AnimationVector1D(float f2) {
        super(null);
        this.value = f2;
        this.size = 1;
    }

    public final float getValue() {
        return this.value;
    }

    public final void setValue$animation_core_release(float f2) {
        this.value = f2;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void reset$animation_core_release() {
        this.value = 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public AnimationVector1D newVector$animation_core_release() {
        return new AnimationVector1D(0.0f);
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public float get$animation_core_release(int i2) {
        if (i2 == 0) {
            return this.value;
        }
        return 0.0f;
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public void set$animation_core_release(int i2, float f2) {
        if (i2 == 0) {
            this.value = f2;
        }
    }

    @Override // androidx.compose.animation.core.AnimationVector
    public int getSize$animation_core_release() {
        return this.size;
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.value;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AnimationVector1D) && ((AnimationVector1D) obj).value == this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }
}
