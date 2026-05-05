package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d̉=!4i\bDJe|\u0004O\u000f8\u000bDB\u0007\"2\u0019\u007f\u0007toA0JgP.hS2\u000fq{<$i*yCAU\"}0\u0010WNmxvJh\u001dK\u000f\f\u001b\u0001jBI]xc\u0016'iP|W3{tm=n\u0003N\u0005NAR<\b\u0015\u0019\u001aXW@z\tTc\f@?pv@R\u001b_\u001d\u001a@\u0015n&\u0007\u001ejzf6v\u0001$?ǥ'\u0003wWf<m=\u0015M;K\u0005-\u0013uo4C@eL[*٨\u0007\u0007`sW6M~U\u0005\u0017,W1OreDp\u007fB,[U\u0013\\\u00016t\u0005\u007fw<-1Nq\\h\u000eV\u000f+\u0002\u0013=\u0012 \u001e'vEs\u001fǴ\f\u000eA\u000e\u000bfN]\u001a^p\u0005+eD-=\u007faE\u007f ƻUaI4fn\n!%\u001eQ\u0006\u001f%ib&`C*\u0005{_Ai@kW~\u000egN\u0006\u0004\u001fq20\n0U\u0012G{?=G+=[G69k0\\\u000bfЛ\t`vh\u0002\u0002V]:nDFZ\r\u001ax\\d3z\u0001XfK)MJc7\u0002\u001638\\&KQ)\u001eogh\u0018y}a\u0018GGfeh5\u008b\u0014oclVMQ\u0012\u0015\u0012V\u00058W<\u0011\n\tjPx$Z\u000b-R8Ni\u001e\u001e\u0014D|\u001bY7Ǧpʉٜ03\u001f\u0004#p\u001b:Pj\u0015\t\u000e_\u0011\u0010-Yc(\u0011\u0014<t7\u0006\u0017a̒nΟ֑M.\u0003\f0YYeCF>UP\u0017\\|Q\fEtŋFх֙KNrE\u0004\u0006\u00144$KQQ]L;\u000f-.x\u0007ЈDɣȌiSSD5.\u0015\u001d\u001do\u0001.\u0016\r\u0013pZe\u001bT]\n/(\u0007`\u0003#6i.0(Æ\u0001ūbҺߏ_@O*\u0011\u0012TbF6\u001d\u001fL<)oP\u0002{2з&ݴə{\u00165Oo\u0019\n\u0006<Ӡz\u000fTs\u001cֽ\u0003ϥh̔fYe2I:Y[\u0005>0%\r PK\u0003w6F14;8~ѯdGޑ:Ԫ\u000f9\u000eh\r2\u001bwn]@\u001b}\u0007TKm4\fC,\u0018\u0007CS\u0016\u0004АgD\u07b6Mů\u000fT\u001f\f\u0011\u0007?u*\u001eC,d`Ņ\t5\u000ev\u001eݟ]iaƆ@E"}, d2 = {"#mb=X*BT\u001d~y<6\u0004\u0013<", "\u001aj^A_0G\u001d\te\u0005g.R", "5dc\"a:IS\u0017\u0003{b,{f9l\n5:<\n !Vk\u001d@\u0001.C", "u(E", "\u0018", "7rB=X*BT\u001d~y", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "7rB=X*BT\u001d~y&~v[zl\u0007\u0004:<\n !Vk\u001d@\u0001.C", "uI\u0018#", "7rB=X*BT\u001d~y&~v[zl\u0007\u0004", "uI\u0018'", "7rD;f7>Q\u001d\u007f~^+", "7rD;f7>Q\u001d\u007f~^+D[)8K/\u0003\u001c?\u0013 Py\u001d8\u0006)?b\f", "7rD;f7>Q\u001d\u007f~^+D[)8K/\u0003\u001c", "\u0011n[<e", "@dS", "", "5qT2a", "0kd2", "/k_5T", "1n[<e\u001aIO\u0017~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuOD\u0003a,$", "uE5\u00139\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001k 5WPIv0\u001c\u00152?C\u000em9<\u0002#EL$oA", "1n[<e", "", "uH\u0018\u0017", "uH8\u0016<o#", "", "uI\u0018\u0017", "#mR5X*DS\u0018\\\u0005e6\n", "1n\\=b:Bb\u0019\\\u0005f7\u0007\u0012/n\u000f", "4f2", "0f2", "4f0", "0f0", RemoteSettings.FORWARD_SLASH_STRING, ":da=", "AsP?g", "As^=", "4qP0g0H\\", ":da= 1Qa\fp]F", "uI9\u0013\u001c\u0011", "1n\\=b:Bb\u0019h\f^9", "0`R8Z9Hc\"}", "1n\\=b:Bb\u0019h\f^9DP\u0019W\u0005\u000f\u0001$", "uI9u=", "5dc\u0010b4I]\"~\u0004m:", "", "5dc\u0010b4I]\"~\u0004m:D[)8K/\u0003\u001c", "uI\u0018(9", ":t\\6a(GQ\u0019", ":t\\6a(GQ\u0019FMX~H\u00106A", "uI\u0018\u0013", "B`Z2B9\u001eZ'~", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "B`Z2B9\u001eZ'~B=?d\u00187Z}", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHuzR", "Bn0?Z)", "Bn0?Z)\u0006&\u0013QFe3X", "uI\u0018\u0016", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ColorKt {
    public static final long UnspecifiedColor = 16;

    private static final float compositeComponent(float f2, float f3, float f4, float f5, float f6) {
        if (f6 == 0.0f) {
            return 0.0f;
        }
        return ((f2 * f4) + ((f3 * f5) * (1.0f - f4))) / f6;
    }

    public static /* synthetic */ void getUnspecifiedColor$annotations() {
    }

    /* JADX INFO: renamed from: isSpecified-8_81llA */
    public static final boolean m4225isSpecified8_81llA(long j2) {
        return j2 != 16;
    }

    /* JADX INFO: renamed from: isSpecified-8_81llA$annotations */
    public static /* synthetic */ void m4226isSpecified8_81llA$annotations(long j2) {
    }

    /* JADX INFO: renamed from: isUnspecified-8_81llA */
    public static final boolean m4227isUnspecified8_81llA(long j2) {
        return j2 == 16;
    }

    /* JADX INFO: renamed from: isUnspecified-8_81llA$annotations */
    public static /* synthetic */ void m4228isUnspecified8_81llA$annotations(long j2) {
    }

    public static /* synthetic */ long Color$default(float f2, float f3, float f4, float f5, ColorSpace colorSpace, int i2, Object obj) {
        if ((8 & i2) != 0) {
            f5 = 1.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f2, f3, f4, f5, colorSpace);
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long Color(float r21, float r22, float r23, float r24, androidx.compose.ui.graphics.colorspace.ColorSpace r25) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.Color(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static /* synthetic */ long UncheckedColor$default(float f2, float f3, float f4, float f5, ColorSpace colorSpace, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            f5 = 1.0f;
        }
        if ((i2 + 16) - (i2 | 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return UncheckedColor(f2, f3, f4, f5, colorSpace);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long UncheckedColor(float r16, float r17, float r18, float r19, androidx.compose.ui.graphics.colorspace.ColorSpace r20) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.ColorKt.UncheckedColor(float, float, float, float, androidx.compose.ui.graphics.colorspace.ColorSpace):long");
    }

    public static final long Color(int i2) {
        return Color.m4174constructorimpl(ULong.m9154constructorimpl(ULong.m9154constructorimpl(i2) << 32));
    }

    public static final long Color(long j2) {
        return Color.m4174constructorimpl(ULong.m9154constructorimpl(j2 << 32));
    }

    public static /* synthetic */ long Color$default(int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((-1) - (((-1) - i6) | ((-1) - 8)) != 0) {
            i5 = 255;
        }
        return Color(i2, i3, i4, i5);
    }

    public static final long Color(int i2, int i3, int i4, int i5) {
        int i6 = ((i5 + 255) - (i5 | 255)) << 24;
        int i7 = ((-1) - (((-1) - i2) | ((-1) - 255))) << 16;
        int i8 = ((i7 + i6) - (i7 & i6)) | ((i3 & 255) << 8);
        int i9 = i4 & 255;
        return Color((i8 + i9) - (i8 & i9));
    }

    /* JADX INFO: renamed from: lerp-jxsXWHM */
    public static final long m4229lerpjxsXWHM(long j2, long j3, float f2) {
        ColorSpace oklab = ColorSpaces.INSTANCE.getOklab();
        long jM4175convertvNxB06k = Color.m4175convertvNxB06k(j2, oklab);
        long jM4175convertvNxB06k2 = Color.m4175convertvNxB06k(j3, oklab);
        float fM4180getAlphaimpl = Color.m4180getAlphaimpl(jM4175convertvNxB06k);
        float fM4184getRedimpl = Color.m4184getRedimpl(jM4175convertvNxB06k);
        float fM4183getGreenimpl = Color.m4183getGreenimpl(jM4175convertvNxB06k);
        float fM4181getBlueimpl = Color.m4181getBlueimpl(jM4175convertvNxB06k);
        float fM4180getAlphaimpl2 = Color.m4180getAlphaimpl(jM4175convertvNxB06k2);
        float fM4184getRedimpl2 = Color.m4184getRedimpl(jM4175convertvNxB06k2);
        float fM4183getGreenimpl2 = Color.m4183getGreenimpl(jM4175convertvNxB06k2);
        float fM4181getBlueimpl2 = Color.m4181getBlueimpl(jM4175convertvNxB06k2);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return Color.m4175convertvNxB06k(UncheckedColor(MathHelpersKt.lerp(fM4184getRedimpl, fM4184getRedimpl2, f2), MathHelpersKt.lerp(fM4183getGreenimpl, fM4183getGreenimpl2, f2), MathHelpersKt.lerp(fM4181getBlueimpl, fM4181getBlueimpl2, f2), MathHelpersKt.lerp(fM4180getAlphaimpl, fM4180getAlphaimpl2, f2), oklab), Color.m4182getColorSpaceimpl(j3));
    }

    /* JADX INFO: renamed from: compositeOver--OWjLjI */
    public static final long m4223compositeOverOWjLjI(long j2, long j3) {
        long jM4175convertvNxB06k = Color.m4175convertvNxB06k(j2, Color.m4182getColorSpaceimpl(j3));
        float fM4180getAlphaimpl = Color.m4180getAlphaimpl(j3);
        float fM4180getAlphaimpl2 = Color.m4180getAlphaimpl(jM4175convertvNxB06k);
        float f2 = 1.0f - fM4180getAlphaimpl2;
        float f3 = (fM4180getAlphaimpl * f2) + fM4180getAlphaimpl2;
        return UncheckedColor(f3 == 0.0f ? 0.0f : ((Color.m4184getRedimpl(jM4175convertvNxB06k) * fM4180getAlphaimpl2) + ((Color.m4184getRedimpl(j3) * fM4180getAlphaimpl) * f2)) / f3, f3 == 0.0f ? 0.0f : ((Color.m4183getGreenimpl(jM4175convertvNxB06k) * fM4180getAlphaimpl2) + ((Color.m4183getGreenimpl(j3) * fM4180getAlphaimpl) * f2)) / f3, f3 != 0.0f ? ((Color.m4181getBlueimpl(jM4175convertvNxB06k) * fM4180getAlphaimpl2) + ((Color.m4181getBlueimpl(j3) * fM4180getAlphaimpl) * f2)) / f3 : 0.0f, f3, Color.m4182getColorSpaceimpl(j3));
    }

    /* JADX INFO: renamed from: getComponents-8_81llA */
    private static final float[] m4224getComponents8_81llA(long j2) {
        return new float[]{Color.m4184getRedimpl(j2), Color.m4183getGreenimpl(j2), Color.m4181getBlueimpl(j2), Color.m4180getAlphaimpl(j2)};
    }

    /* JADX INFO: renamed from: luminance-8_81llA */
    public static final float m4230luminance8_81llA(long j2) {
        ColorSpace colorSpaceM4182getColorSpaceimpl = Color.m4182getColorSpaceimpl(j2);
        if (!ColorModel.m4585equalsimpl0(colorSpaceM4182getColorSpaceimpl.m4594getModelxdoWZVw(), ColorModel.Companion.m4592getRgbxdoWZVw())) {
            InlineClassHelperKt.throwIllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) ColorModel.m4588toStringimpl(colorSpaceM4182getColorSpaceimpl.m4594getModelxdoWZVw())));
        }
        Intrinsics.checkNotNull(colorSpaceM4182getColorSpaceimpl, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        DoubleFunction eotfFunc$ui_graphics_release = ((Rgb) colorSpaceM4182getColorSpaceimpl).getEotfFunc$ui_graphics_release();
        float fInvoke = (float) ((eotfFunc$ui_graphics_release.invoke(Color.m4184getRedimpl(j2)) * 0.2126d) + (eotfFunc$ui_graphics_release.invoke(Color.m4183getGreenimpl(j2)) * 0.7152d) + (eotfFunc$ui_graphics_release.invoke(Color.m4181getBlueimpl(j2)) * 0.0722d));
        if (fInvoke < 0.0f) {
            fInvoke = 0.0f;
        }
        if (fInvoke > 1.0f) {
            return 1.0f;
        }
        return fInvoke;
    }

    /* JADX INFO: renamed from: toArgb-8_81llA */
    public static final int m4232toArgb8_81llA(long j2) {
        return (int) ULong.m9154constructorimpl(Color.m4175convertvNxB06k(j2, ColorSpaces.INSTANCE.getSrgb()) >>> 32);
    }

    /* JADX INFO: renamed from: takeOrElse-DxMtmZc */
    public static final long m4231takeOrElseDxMtmZc(long j2, Function0<Color> function0) {
        return j2 != 16 ? j2 : function0.invoke().m4188unboximpl();
    }
}
