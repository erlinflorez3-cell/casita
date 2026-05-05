package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.core.math.MathUtils;
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
/* JADX INFO: compiled from: DynamicTonalPalette.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!,o\bӵLc\u0003\tIي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?0Le^.ZS0\u0015s{J$c$wESc(Ԃ:\t}M\u0018k|Jr\u000bq\u0010L\u0016\u0011x:Kmx\f\u0015?6PsW3{t\u0004>x\u0003D\u000b82P;*\t\u000f!BH>~ABc\u001a 9XphU=Q\u0013\u001e*\u0006l%G\u001dtu\\@`l\f=_'\u0011mZNUdv\u0002e\u001bT_?\r%dN/N>M\u0015S[I\u0006jiM\u000fWqk\b\u0019+5/as\u0006;\u001f~,#9\\%]!.\r\t_d$'YT*Jh\u001c6\u0006\u0013{;=4\u0012\u00146`.[\u001b-\b&Q\u0003\u0003k@~\u0013\u0007B.\f\u0012<\u001d$\u000eEC9Ig\u0018ĥߛ\u0018\u05cbѼ\u007f\u0007\u001311\u0015͜!`\\\u0011fڟ7\u0003vά5f"}, d2 = {"2d[6a,:`\u001d\u0014z]", "", "@fQ\u0010b4I]\"~\u0004m", "", "2x].`0<2\u0015\f\u0001<6\u0004\u0013<S}+{H\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T/<c\u000b\u000e5p\u00166M\u0019", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "2x].`0<2\u0015\f\u0001<6\u0004\u0013<S}+{H\u0001db", "Bn]._\u0017:Z\u0019\u000e\n^", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006e/>U\u0005\u000b3t\u0016=\\C\u0011", "2x].`0<2\u0015\f\u0001<6\u0004\u0013<S}+{H\u0001de", "2x].`0<:\u001d\u0001}m\n\u0007\u00109rm&~@\t\u0017", "2x].`0<:\u001d\u0001}m\n\u0007\u00109rm&~@\t\u0017d\u0013", "2x].`0<:\u001d\u0001}m\n\u0007\u00109rm&~@\t\u0017d\u0016", "2x].`0<B#\bve\u0017x\u0010/t\u000f(", ":`Q\u0016a=?", "4s", "Adc\u0019h4B\\\u0015\bx^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "<df\u0019h4B\\\u0015\bx^", "Adc\u0019h4B\\\u0015\bx^s[\u001c\u0017t\b\u001dy", "uI5u=", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DynamicTonalPaletteKt {
    private static final float labInvf(float f2) {
        float f3 = f2 * f2 * f2;
        return f3 > 0.008856452f ? f3 : ((116 * f2) - 16) / 903.2963f;
    }

    public static final TonalPalette dynamicTonalPalette(Context context) {
        return new TonalPalette(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_0), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_10), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_600), 98.0f), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_600), 96.0f), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_50), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_600), 94.0f), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_600), 92.0f), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_100), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_600), 87.0f), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_200), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_300), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_400), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_500), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_600), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_700), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_600), 24.0f), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_600), 22.0f), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_800), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_600), 17.0f), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_600), 12.0f), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_900), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_600), 6.0f), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_600), 4.0f), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral1_1000), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_0), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_10), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_600), 98.0f), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_600), 96.0f), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_50), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_600), 94.0f), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_600), 92.0f), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_100), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_600), 87.0f), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_200), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_300), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_400), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_500), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_600), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_700), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_600), 24.0f), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_600), 22.0f), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_800), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_600), 17.0f), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_600), 12.0f), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_900), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_600), 6.0f), m2096setLuminanceDxMtmZc(ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_600), 4.0f), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_neutral2_1000), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent1_0), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent1_10), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent1_50), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent1_100), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent1_200), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent1_300), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent1_400), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent1_500), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent1_600), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent1_700), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent1_800), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent1_900), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent1_1000), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent2_0), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent2_10), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent2_50), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent2_100), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent2_200), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent2_300), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent2_400), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent2_500), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent2_600), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent2_700), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent2_800), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent2_900), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent2_1000), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent3_0), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent3_10), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent3_50), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent3_100), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent3_200), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent3_300), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent3_400), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent3_500), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent3_600), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent3_700), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent3_800), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent3_900), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_accent3_1000), null);
    }

    public static final ColorScheme dynamicLightColorScheme(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            return dynamicLightColorScheme34(context);
        }
        return dynamicLightColorScheme31(dynamicTonalPalette(context));
    }

    public static final ColorScheme dynamicDarkColorScheme(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            return dynamicDarkColorScheme34(context);
        }
        return dynamicDarkColorScheme31(dynamicTonalPalette(context));
    }

    /* JADX INFO: renamed from: setLuminance-DxMtmZc, reason: not valid java name */
    public static final long m2096setLuminanceDxMtmZc(long j2, float f2) {
        double d2 = f2;
        if ((d2 < 1.0E-4d) | (d2 > 99.9999d)) {
            int iDelinearized = delinearized(100 * labInvf((f2 + 16) / 116));
            return ColorKt.Color$default(iDelinearized, iDelinearized, iDelinearized, 0, 8, null);
        }
        long jM4175convertvNxB06k = Color.m4175convertvNxB06k(j2, ColorSpaces.INSTANCE.getCieLab());
        return Color.m4175convertvNxB06k(ColorKt.Color$default(f2, Color.m4183getGreenimpl(jM4175convertvNxB06k), Color.m4181getBlueimpl(jM4175convertvNxB06k), 0.0f, ColorSpaces.INSTANCE.getCieLab(), 8, null), ColorSpaces.INSTANCE.getSrgb());
    }

    private static final int delinearized(float f2) {
        double d2 = f2 / 100;
        return MathUtils.clamp(MathKt.roundToInt((d2 <= 0.0031308d ? d2 * 12.92d : (Math.pow(d2, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d), 0, 255);
    }

    public static final ColorScheme dynamicLightColorScheme31(TonalPalette tonalPalette) {
        long jM2824getPrimary400d7_KjU = tonalPalette.m2824getPrimary400d7_KjU();
        long jM2821getPrimary1000d7_KjU = tonalPalette.m2821getPrimary1000d7_KjU();
        long jM2829getPrimary900d7_KjU = tonalPalette.m2829getPrimary900d7_KjU();
        long jM2820getPrimary100d7_KjU = tonalPalette.m2820getPrimary100d7_KjU();
        long jM2828getPrimary800d7_KjU = tonalPalette.m2828getPrimary800d7_KjU();
        long jM2837getSecondary400d7_KjU = tonalPalette.m2837getSecondary400d7_KjU();
        long jM2834getSecondary1000d7_KjU = tonalPalette.m2834getSecondary1000d7_KjU();
        long jM2842getSecondary900d7_KjU = tonalPalette.m2842getSecondary900d7_KjU();
        long jM2833getSecondary100d7_KjU = tonalPalette.m2833getSecondary100d7_KjU();
        long jM2850getTertiary400d7_KjU = tonalPalette.m2850getTertiary400d7_KjU();
        long jM2847getTertiary1000d7_KjU = tonalPalette.m2847getTertiary1000d7_KjU();
        long jM2855getTertiary900d7_KjU = tonalPalette.m2855getTertiary900d7_KjU();
        long jM2846getTertiary100d7_KjU = tonalPalette.m2846getTertiary100d7_KjU();
        long jM2817getNeutralVariant980d7_KjU = tonalPalette.m2817getNeutralVariant980d7_KjU();
        long jM2796getNeutralVariant100d7_KjU = tonalPalette.m2796getNeutralVariant100d7_KjU();
        long jM2817getNeutralVariant980d7_KjU2 = tonalPalette.m2817getNeutralVariant980d7_KjU();
        long jM2796getNeutralVariant100d7_KjU2 = tonalPalette.m2796getNeutralVariant100d7_KjU();
        long jM2812getNeutralVariant900d7_KjU = tonalPalette.m2812getNeutralVariant900d7_KjU();
        long jM2803getNeutralVariant300d7_KjU = tonalPalette.m2803getNeutralVariant300d7_KjU();
        long jM2800getNeutralVariant200d7_KjU = tonalPalette.m2800getNeutralVariant200d7_KjU();
        long jM2815getNeutralVariant950d7_KjU = tonalPalette.m2815getNeutralVariant950d7_KjU();
        long jM2806getNeutralVariant500d7_KjU = tonalPalette.m2806getNeutralVariant500d7_KjU();
        long jM2810getNeutralVariant800d7_KjU = tonalPalette.m2810getNeutralVariant800d7_KjU();
        long jM2795getNeutralVariant00d7_KjU = tonalPalette.m2795getNeutralVariant00d7_KjU();
        long jM2817getNeutralVariant980d7_KjU3 = tonalPalette.m2817getNeutralVariant980d7_KjU();
        long jM2811getNeutralVariant870d7_KjU = tonalPalette.m2811getNeutralVariant870d7_KjU();
        return ColorSchemeKt.m1953lightColorSchemeCXl9yA$default(jM2824getPrimary400d7_KjU, jM2821getPrimary1000d7_KjU, jM2829getPrimary900d7_KjU, jM2820getPrimary100d7_KjU, jM2828getPrimary800d7_KjU, jM2837getSecondary400d7_KjU, jM2834getSecondary1000d7_KjU, jM2842getSecondary900d7_KjU, jM2833getSecondary100d7_KjU, jM2850getTertiary400d7_KjU, jM2847getTertiary1000d7_KjU, jM2855getTertiary900d7_KjU, jM2846getTertiary100d7_KjU, jM2817getNeutralVariant980d7_KjU, jM2796getNeutralVariant100d7_KjU, jM2817getNeutralVariant980d7_KjU2, jM2796getNeutralVariant100d7_KjU2, jM2812getNeutralVariant900d7_KjU, jM2803getNeutralVariant300d7_KjU, tonalPalette.m2824getPrimary400d7_KjU(), jM2800getNeutralVariant200d7_KjU, jM2815getNeutralVariant950d7_KjU, 0L, 0L, 0L, 0L, jM2806getNeutralVariant500d7_KjU, jM2810getNeutralVariant800d7_KjU, jM2795getNeutralVariant00d7_KjU, jM2817getNeutralVariant980d7_KjU3, tonalPalette.m2814getNeutralVariant940d7_KjU(), tonalPalette.m2813getNeutralVariant920d7_KjU(), tonalPalette.m2812getNeutralVariant900d7_KjU(), tonalPalette.m2816getNeutralVariant960d7_KjU(), tonalPalette.m2797getNeutralVariant1000d7_KjU(), jM2811getNeutralVariant870d7_KjU, 62914560, 0, null);
    }

    public static final ColorScheme dynamicLightColorScheme34(Context context) throws Throwable {
        long jM1904getColorWaAFU9c = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_primary_light);
        long jM1904getColorWaAFU9c2 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_primary_light);
        long jM1904getColorWaAFU9c3 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_primary_container_light);
        long jM1904getColorWaAFU9c4 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_primary_container_light);
        long jM1904getColorWaAFU9c5 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_primary_dark);
        long jM1904getColorWaAFU9c6 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_secondary_light);
        long jM1904getColorWaAFU9c7 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_secondary_light);
        long jM1904getColorWaAFU9c8 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_secondary_container_light);
        long jM1904getColorWaAFU9c9 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_secondary_container_light);
        long jM1904getColorWaAFU9c10 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_tertiary_light);
        long jM1904getColorWaAFU9c11 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_tertiary_light);
        long jM1904getColorWaAFU9c12 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_tertiary_container_light);
        long jM1904getColorWaAFU9c13 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_tertiary_container_light);
        long jM1904getColorWaAFU9c14 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_background_light);
        long jM1904getColorWaAFU9c15 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_background_light);
        long jM1904getColorWaAFU9c16 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_light);
        long jM1904getColorWaAFU9c17 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_surface_light);
        long jM1904getColorWaAFU9c18 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_variant_light);
        long jM1904getColorWaAFU9c19 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_surface_variant_light);
        long jM1904getColorWaAFU9c20 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_dark);
        long jM1904getColorWaAFU9c21 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_surface_dark);
        long jM1904getColorWaAFU9c22 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_outline_light);
        long jM1904getColorWaAFU9c23 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_outline_variant_light);
        long jM1904getColorWaAFU9c24 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_bright_light);
        long jM1904getColorWaAFU9c25 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_dim_light);
        return ColorSchemeKt.m1953lightColorSchemeCXl9yA$default(jM1904getColorWaAFU9c, jM1904getColorWaAFU9c2, jM1904getColorWaAFU9c3, jM1904getColorWaAFU9c4, jM1904getColorWaAFU9c5, jM1904getColorWaAFU9c6, jM1904getColorWaAFU9c7, jM1904getColorWaAFU9c8, jM1904getColorWaAFU9c9, jM1904getColorWaAFU9c10, jM1904getColorWaAFU9c11, jM1904getColorWaAFU9c12, jM1904getColorWaAFU9c13, jM1904getColorWaAFU9c14, jM1904getColorWaAFU9c15, jM1904getColorWaAFU9c16, jM1904getColorWaAFU9c17, jM1904getColorWaAFU9c18, jM1904getColorWaAFU9c19, ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_primary_light), jM1904getColorWaAFU9c20, jM1904getColorWaAFU9c21, 0L, 0L, 0L, 0L, jM1904getColorWaAFU9c22, jM1904getColorWaAFU9c23, 0L, jM1904getColorWaAFU9c24, ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_container_light), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_container_high_light), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_container_highest_light), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_container_low_light), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_container_lowest_light), jM1904getColorWaAFU9c25, 331350016, 0, null);
    }

    public static final ColorScheme dynamicDarkColorScheme31(TonalPalette tonalPalette) {
        long jM2828getPrimary800d7_KjU = tonalPalette.m2828getPrimary800d7_KjU();
        long jM2822getPrimary200d7_KjU = tonalPalette.m2822getPrimary200d7_KjU();
        long jM2823getPrimary300d7_KjU = tonalPalette.m2823getPrimary300d7_KjU();
        long jM2829getPrimary900d7_KjU = tonalPalette.m2829getPrimary900d7_KjU();
        long jM2824getPrimary400d7_KjU = tonalPalette.m2824getPrimary400d7_KjU();
        long jM2841getSecondary800d7_KjU = tonalPalette.m2841getSecondary800d7_KjU();
        long jM2835getSecondary200d7_KjU = tonalPalette.m2835getSecondary200d7_KjU();
        long jM2836getSecondary300d7_KjU = tonalPalette.m2836getSecondary300d7_KjU();
        long jM2842getSecondary900d7_KjU = tonalPalette.m2842getSecondary900d7_KjU();
        long jM2854getTertiary800d7_KjU = tonalPalette.m2854getTertiary800d7_KjU();
        long jM2848getTertiary200d7_KjU = tonalPalette.m2848getTertiary200d7_KjU();
        long jM2849getTertiary300d7_KjU = tonalPalette.m2849getTertiary300d7_KjU();
        long jM2855getTertiary900d7_KjU = tonalPalette.m2855getTertiary900d7_KjU();
        long jM2807getNeutralVariant60d7_KjU = tonalPalette.m2807getNeutralVariant60d7_KjU();
        long jM2812getNeutralVariant900d7_KjU = tonalPalette.m2812getNeutralVariant900d7_KjU();
        long jM2807getNeutralVariant60d7_KjU2 = tonalPalette.m2807getNeutralVariant60d7_KjU();
        long jM2812getNeutralVariant900d7_KjU2 = tonalPalette.m2812getNeutralVariant900d7_KjU();
        long jM2803getNeutralVariant300d7_KjU = tonalPalette.m2803getNeutralVariant300d7_KjU();
        long jM2810getNeutralVariant800d7_KjU = tonalPalette.m2810getNeutralVariant800d7_KjU();
        long jM2812getNeutralVariant900d7_KjU3 = tonalPalette.m2812getNeutralVariant900d7_KjU();
        long jM2800getNeutralVariant200d7_KjU = tonalPalette.m2800getNeutralVariant200d7_KjU();
        long jM2808getNeutralVariant600d7_KjU = tonalPalette.m2808getNeutralVariant600d7_KjU();
        long jM2803getNeutralVariant300d7_KjU2 = tonalPalette.m2803getNeutralVariant300d7_KjU();
        long jM2795getNeutralVariant00d7_KjU = tonalPalette.m2795getNeutralVariant00d7_KjU();
        long jM2802getNeutralVariant240d7_KjU = tonalPalette.m2802getNeutralVariant240d7_KjU();
        long jM2807getNeutralVariant60d7_KjU3 = tonalPalette.m2807getNeutralVariant60d7_KjU();
        return ColorSchemeKt.m1949darkColorSchemeCXl9yA$default(jM2828getPrimary800d7_KjU, jM2822getPrimary200d7_KjU, jM2823getPrimary300d7_KjU, jM2829getPrimary900d7_KjU, jM2824getPrimary400d7_KjU, jM2841getSecondary800d7_KjU, jM2835getSecondary200d7_KjU, jM2836getSecondary300d7_KjU, jM2842getSecondary900d7_KjU, jM2854getTertiary800d7_KjU, jM2848getTertiary200d7_KjU, jM2849getTertiary300d7_KjU, jM2855getTertiary900d7_KjU, jM2807getNeutralVariant60d7_KjU, jM2812getNeutralVariant900d7_KjU, jM2807getNeutralVariant60d7_KjU2, jM2812getNeutralVariant900d7_KjU2, jM2803getNeutralVariant300d7_KjU, jM2810getNeutralVariant800d7_KjU, tonalPalette.m2828getPrimary800d7_KjU(), jM2812getNeutralVariant900d7_KjU3, jM2800getNeutralVariant200d7_KjU, 0L, 0L, 0L, 0L, jM2808getNeutralVariant600d7_KjU, jM2803getNeutralVariant300d7_KjU2, jM2795getNeutralVariant00d7_KjU, jM2802getNeutralVariant240d7_KjU, tonalPalette.m2798getNeutralVariant120d7_KjU(), tonalPalette.m2799getNeutralVariant170d7_KjU(), tonalPalette.m2801getNeutralVariant220d7_KjU(), tonalPalette.m2796getNeutralVariant100d7_KjU(), tonalPalette.m2804getNeutralVariant40d7_KjU(), jM2807getNeutralVariant60d7_KjU3, 62914560, 0, null);
    }

    public static final ColorScheme dynamicDarkColorScheme34(Context context) throws Throwable {
        long jM1904getColorWaAFU9c = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_primary_dark);
        long jM1904getColorWaAFU9c2 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_primary_dark);
        long jM1904getColorWaAFU9c3 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_primary_container_dark);
        long jM1904getColorWaAFU9c4 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_primary_container_dark);
        long jM1904getColorWaAFU9c5 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_primary_light);
        long jM1904getColorWaAFU9c6 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_secondary_dark);
        long jM1904getColorWaAFU9c7 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_secondary_dark);
        long jM1904getColorWaAFU9c8 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_secondary_container_dark);
        long jM1904getColorWaAFU9c9 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_secondary_container_dark);
        long jM1904getColorWaAFU9c10 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_tertiary_dark);
        long jM1904getColorWaAFU9c11 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_tertiary_dark);
        long jM1904getColorWaAFU9c12 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_tertiary_container_dark);
        long jM1904getColorWaAFU9c13 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_tertiary_container_dark);
        long jM1904getColorWaAFU9c14 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_background_dark);
        long jM1904getColorWaAFU9c15 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_background_dark);
        long jM1904getColorWaAFU9c16 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_dark);
        long jM1904getColorWaAFU9c17 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_surface_dark);
        long jM1904getColorWaAFU9c18 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_variant_dark);
        long jM1904getColorWaAFU9c19 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_surface_variant_dark);
        long jM1904getColorWaAFU9c20 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_light);
        long jM1904getColorWaAFU9c21 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_on_surface_light);
        long jM1904getColorWaAFU9c22 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_outline_dark);
        long jM1904getColorWaAFU9c23 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_outline_variant_dark);
        long jM1904getColorWaAFU9c24 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_bright_dark);
        long jM1904getColorWaAFU9c25 = ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_dim_dark);
        return ColorSchemeKt.m1949darkColorSchemeCXl9yA$default(jM1904getColorWaAFU9c, jM1904getColorWaAFU9c2, jM1904getColorWaAFU9c3, jM1904getColorWaAFU9c4, jM1904getColorWaAFU9c5, jM1904getColorWaAFU9c6, jM1904getColorWaAFU9c7, jM1904getColorWaAFU9c8, jM1904getColorWaAFU9c9, jM1904getColorWaAFU9c10, jM1904getColorWaAFU9c11, jM1904getColorWaAFU9c12, jM1904getColorWaAFU9c13, jM1904getColorWaAFU9c14, jM1904getColorWaAFU9c15, jM1904getColorWaAFU9c16, jM1904getColorWaAFU9c17, jM1904getColorWaAFU9c18, jM1904getColorWaAFU9c19, ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_primary_dark), jM1904getColorWaAFU9c20, jM1904getColorWaAFU9c21, 0L, 0L, 0L, 0L, jM1904getColorWaAFU9c22, jM1904getColorWaAFU9c23, 0L, jM1904getColorWaAFU9c24, ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_container_dark), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_container_high_dark), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_container_highest_dark), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_container_low_dark), ColorResourceHelper.INSTANCE.m1904getColorWaAFU9c(context, android.R.color.system_surface_container_lowest_dark), jM1904getColorWaAFU9c25, 331350016, 0, null);
    }
}
