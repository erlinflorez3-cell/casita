package kotlin.jvm.internal;

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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00106B\u0005*4\u0012\u0006\rnj?7JΝHDɟ\u0004*=j<9*[ҸuCIUb\u00020\u001agN\u0016i7Nh\u001d[\u000f4\u0018An:\\mx\f\u0014W6P\u0004W3{q\u0006=n\nN\u0005N4rL\b\u0006\u0019\u001aXJFzQŗ\u001eë\u00166H\u0081JT\u0013P\u0013\u001ab\u001aL$\u0019\u001e\u000bi\u0005:\u001fǕ0Ơ3)\u000b݃RP-d>|\u001e!TZ?\r%cT/\u0017˂\bչ)Y\u000bޗb]E\nMq\u000e\u0019v/?+wu\u000e:/äfƦ/U\u0015ƞ\u0003(b\u000e_`\\;9Y{K~\u0010^{QԐ_ʀ\b\u0014\u000eΩX03%t\b^G\u0003~k@~\u000f\u0015FVе4ي\u001b+\bđ;;!t_a\f-\\F\u0014\u0005;+Y\u0005Eė.ڍ\u0012f\u001dÑdyWA_@שLd"}, d2 = {"\u001aj^A_0G\u001d\u001e\u0010\u0003(0\u0006\u0018/r\t$\u0003\na\u001e!C~kF~01b\u0002*@W\u00133MAJA", "", "u(E", "\u001b@G,I\b%Cx", "", "5dc\u001a4\u001f8Dtej>jx\u00128o\u000f$\u000bD\u000b %", "\u001bH=,I\b%Cx", "5dc\u001a<\u00158Dtej>jx\u00128o\u000f$\u000bD\u000b %", "\u001cD6\u000eG\u0010/3\u0013bc?\u0010el\u001eY", "5dc\u001b8\u000e\u001aB|oZX\u0010ei\u0013Nc\u0017o~|  Q~\nKz/>g", "\u001c`=", "5dc\u001bT\u0015|O\"\b\u0005m(\f\r9n\u000e", "\u001eNB\u0016G\u0010/3\u0013bc?\u0010el\u001eY", "5dc\u001dB\u001a\"B|oZX\u0010ei\u0013Nc\u0017o~|  Q~\nKz/>g", "!HI\u0012R\t\"B\u0007", "", "5dc <!\u001eMubiLjx\u00128o\u000f$\u000bD\u000b %", "!HI\u0012R\t2Bxl", "5dc <!\u001eMuri>\u001a;\u00058n\n7wO\u0005! U", "5dc\u001a4\u001f8Dtej>", "5dc\u001a<\u00158Dtej>", "5dc\u001b8\u000e\u001aB|oZX\u0010ei\u0013Nc\u0017o", "5dc\u001bT\u0015", "5dc\u001dB\u001a\"B|oZX\u0010ei\u0013Nc\u0017o", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class FloatCompanionObject {
    public static final FloatCompanionObject INSTANCE = new FloatCompanionObject();
    public static final float MAX_VALUE = Float.MAX_VALUE;
    public static final float MIN_VALUE = Float.MIN_VALUE;
    public static final float NEGATIVE_INFINITY = Float.NEGATIVE_INFINITY;
    public static final float NaN = Float.NaN;
    public static final float POSITIVE_INFINITY = Float.POSITIVE_INFINITY;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;

    private FloatCompanionObject() {
    }

    public static /* synthetic */ void getMAX_VALUE$annotations() {
    }

    public static /* synthetic */ void getMIN_VALUE$annotations() {
    }

    public static /* synthetic */ void getNEGATIVE_INFINITY$annotations() {
    }

    public static /* synthetic */ void getNaN$annotations() {
    }

    public static /* synthetic */ void getPOSITIVE_INFINITY$annotations() {
    }

    public static /* synthetic */ void getSIZE_BITS$annotations() {
    }

    public static /* synthetic */ void getSIZE_BYTES$annotations() {
    }

    public final float getMAX_VALUE() {
        return Float.MAX_VALUE;
    }

    public final float getMIN_VALUE() {
        return Float.MIN_VALUE;
    }

    public final float getNEGATIVE_INFINITY() {
        return Float.NEGATIVE_INFINITY;
    }

    public final float getNaN() {
        return Float.NaN;
    }

    public final float getPOSITIVE_INFINITY() {
        return Float.POSITIVE_INFINITY;
    }
}
