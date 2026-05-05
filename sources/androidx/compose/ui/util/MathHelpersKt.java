package androidx.compose.ui.util;

import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.math.MathKt;
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
/* JADX INFO: compiled from: MathHelpers.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001e\u001d̉=!,n\bDJl|\u0004O\f8\u000b<I\u0007Ӭ4\u0012\u0006\u000bnj?3\\qV\u008cjSX\u000e\u001c\u007fB$s$ BS|(~:\t}M\u0018k|Lr\u000bq\u000e6\u001a\u0007mDI\u0004w\u000e\u0016\u001d6Zom2}sK>xtd\u0004f\u074c(P!\u0013\u00072*v\u000f'~QM$\u0012^?!>`\u0010e\u0005H\u00116B.\u00056\\\u0016MfLzbR/Q\u00020İT?{>\u0004e\rtSW\u0011\u0005i6+n6e\u00193\\\u001b\u0007\u0001Zo\u0007M{U\u0005\u0017&?GWzo6\u0007\u000bD\u00199W%]!1\r\t_i$'YZ\u0014O^\u0018@w)z%X\u0012\u0015\u001e'v:]\u001et\u0010&3#~\u0004D^\u000bvB.\u0007\u0012:%/\u00183Y83y_nS\u0019|E$\u0005;,S\u0005|0sT<n[ØZ\u0010d?^X=vM2Ykl4tp\u0011B\u0004^FF\u0082\u0002)A%5O[g1Ik0Vtk\u0005\u0016xh\u0002w\u0019̹F:\u0002$GB\t:Yld3j\u0001Xf=)MJSMé\u000e+;j\nT!S\u001evO\u0017w\u001bQk\u0019=/\u0015E\nry\u001fo9\rA{Ȩi(|`\t,?ja-X\u0015A\u0004\u0010hk@\"`G\u001b\u0014\u0006\r\\N:\u0012xŴwʲ8?"}, d2 = {"4`bA6)Kb", "", "F", "4`bA@(Q=\u001a", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "1", ExifInterface.GPS_MEASUREMENT_2D, "4`bA@0G=\u001a", ":da=", "AsP?g", "As^=", "4qP0g0H\\", "", "", "4`bA66>`\u0017~Vm\u0013|\u0005=t", "", ";h]6`<FD\u0015\u0006\u000b^", "4`bA66>`\u0017~Vm\u0014\u0007\u0017>", ";`g6`<FD\u0015\u0006\u000b^", "4`bA66>`\u0017~^g", "Ch\u001cBg0EM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class MathHelpersKt {
    public static final double fastCoerceAtLeast(double d2, double d3) {
        return d2 < d3 ? d3 : d2;
    }

    public static final float fastCoerceAtLeast(float f2, float f3) {
        return f2 < f3 ? f3 : f2;
    }

    public static final double fastCoerceAtMost(double d2, double d3) {
        return d2 > d3 ? d3 : d2;
    }

    public static final float fastCoerceAtMost(float f2, float f3) {
        return f2 > f3 ? f3 : f2;
    }

    public static final double fastCoerceIn(double d2, double d3, double d4) {
        if (d2 < d3) {
            d2 = d3;
        }
        return d2 > d4 ? d4 : d2;
    }

    public static final float fastCoerceIn(float f2, float f3, float f4) {
        if (f2 < f3) {
            f2 = f3;
        }
        return f2 > f4 ? f4 : f2;
    }

    public static final float lerp(float f2, float f3, float f4) {
        return ((1 - f4) * f2) + (f4 * f3);
    }

    public static final long lerp(long j2, long j3, float f2) {
        return j2 + MathKt.roundToLong((j3 - j2) * ((double) f2));
    }

    public static final float fastMinOf(float f2, float f3, float f4, float f5) {
        return Math.min(f2, Math.min(f3, Math.min(f4, f5)));
    }

    public static final float fastMaxOf(float f2, float f3, float f4, float f5) {
        return Math.max(f2, Math.max(f3, Math.max(f4, f5)));
    }

    public static final float fastCbrt(float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) (((-1) - (((-1) - ((long) Float.floatToRawIntBits(f2))) | ((-1) - 8589934591L))) / ((long) 3))) + 709952852);
        float f3 = fIntBitsToFloat - ((fIntBitsToFloat - (f2 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static final int lerp(int i2, int i3, float f2) {
        return i2 + ((int) Math.round(((double) (i3 - i2)) * ((double) f2)));
    }
}
