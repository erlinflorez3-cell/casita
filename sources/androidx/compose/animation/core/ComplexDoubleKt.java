package androidx.compose.animation.core;

import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
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
/* JADX INFO: compiled from: ComplexDouble.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!4i\bDZc|İI\u0006>\u000f6B\u0005)D<\u0006ј~vI2Tev.bU:\u000f\u001a{b#\f(\u007fDSUH\u007fR\r]Q\u007fg\u001dL\u000b\u000fQ\u0013\u001e\u0016'lrկm\u0007k\u0017'2poo7[uU9\u000fv|ӌ8E0?\u0012\u0005/\u001aRH>x+GY\u0014*0np\u0001Ħ\u0015e\u0018(\u001b\u001e>N\u0001F\\\u0016PfLzeR/Q\u00030ĪV?r>\u0007e\rtTO\r%cN/N?M\u0015SSIޘZâC\u000e"}, d2 = {"1n\\=_,Q?)zyk(\f\r-F\n5\u0004P\b\u0013", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG}Au!5MV\u001auD\u001b\u001ch7", RemoteSettings.FORWARD_SLASH_STRING, "", AdkSettings.PLATFORM_TYPE_MOBILE, "1", "1n\\=_,QA%\f\n", "<t\\", ";h]Bf", "=sW2e", ">kd@", "Bh\\2f", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ComplexDoubleKt {
    public static final Pair<ComplexDouble, ComplexDouble> complexQuadraticFormula(double d2, double d3, double d4) {
        double d5 = (d3 * d3) - ((4.0d * d2) * d4);
        double d6 = 1.0d / (d2 * 2.0d);
        double d7 = -d3;
        ComplexDouble complexDoubleComplexSqrt = complexSqrt(d5);
        complexDoubleComplexSqrt._real += d7;
        complexDoubleComplexSqrt._real *= d6;
        complexDoubleComplexSqrt._imaginary *= d6;
        ComplexDouble complexDoubleComplexSqrt2 = complexSqrt(d5);
        double d8 = -1;
        complexDoubleComplexSqrt2._real *= d8;
        complexDoubleComplexSqrt2._imaginary *= d8;
        complexDoubleComplexSqrt2._real += d7;
        complexDoubleComplexSqrt2._real *= d6;
        complexDoubleComplexSqrt2._imaginary *= d6;
        return TuplesKt.to(complexDoubleComplexSqrt, complexDoubleComplexSqrt2);
    }

    public static final ComplexDouble complexSqrt(double d2) {
        return d2 < 0.0d ? new ComplexDouble(0.0d, Math.sqrt(Math.abs(d2))) : new ComplexDouble(Math.sqrt(d2), 0.0d);
    }

    public static final ComplexDouble plus(double d2, ComplexDouble complexDouble) {
        complexDouble._real += d2;
        return complexDouble;
    }

    public static final ComplexDouble minus(double d2, ComplexDouble complexDouble) {
        double d3 = -1;
        complexDouble._real *= d3;
        complexDouble._imaginary *= d3;
        complexDouble._real += d2;
        return complexDouble;
    }

    public static final ComplexDouble times(double d2, ComplexDouble complexDouble) {
        complexDouble._real *= d2;
        complexDouble._imaginary *= d2;
        return complexDouble;
    }
}
