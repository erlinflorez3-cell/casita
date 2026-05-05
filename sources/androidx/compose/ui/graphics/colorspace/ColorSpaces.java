package androidx.compose.ui.graphics.colorspace;

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
/* JADX INFO: compiled from: ColorSpaces.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005+4\u0012\u000e\u0007nj?3LeV=ZS0\u001bs{J$c$wDCU(\u0010*\tU_og|Pb\u000bI\u0012\fȤx\u0001ߚyU'\\R\u00148BņC3[o\u0006Mn.N\u0005N@R<\b?\u0019\u001aX\u0004V͍\u0001ŲO\f\u0018l\t\tH\u0010%O\u001b\u0019@\u0014n&\u0007\u001dj&f6v\u0014\u000e>=b\u001bipqwn>}e\rtVܮ\u0011|iӜCB=8#)$\u0012\u0015Ws?1AџA\u000bpѧ?-Oye:)\u000f\"\u001cCO;_ę*b\rĩx\u000e-3]g\u001c_\u001c1\u0010z*\u000fʀ\b\u0014\u000eΩ`03$t\f^B\u0003}k@~\u0004ެF\u0006\u0003ʨN\u0019+\fA/\n*t^y;G\\Ѽ\u007f\u000b\u0015̔;\u0003t0id^o#,lw\u007f?ҨDCPݐ\"[C\u007f\u0012\u00013\u001c8\u0017HM\u00101\f\u0011\\%SK2ݾ%\u074co\nPDu\u000e\u001dbnhwh\u0019O0\u0007.7X\u000bɔ^Jlʍ\u0004RZq:\u0015\u001e+b!\u0016\bA\"Ϣ{B)ط(PU\u0004wn\u001el\u0018AGfe[ˇo\u0014_ުv5;nq\u00142a\u00052W<\u0011\u0007ֽjH[ێr^.A@L;\u001f\u0006\u001c\\N:\u0015\u0558Cw$عD3\u001f}#LS*Pc\u0015\t\u000e}?ɰ\u0001Ձ7$\u000bǭt\u0004\u0017%h\\\u001fqς|O4ʉx$3f_9i8cH\u00014+J]ѩuõKmT܁dn\u001c\u001ec%p%(ci/k!ä\u0003/:ĈEGR\u001esa\u001e!5'\u0015y==ÿ2m\u0010ξ\t.f\u0018XS%&0%vrQ\nܐ\u0004\u007fi¿\u0013Ii\u0004\u0019_\u000fX\u00013q<|:٫\t%&ݒ\u0019q(.C1\u00149+H\u0010\u0014]<8ӡkܓ2\u007fjχ>vk7:\rf\u0002p\u0006u2i[ ʳ\u0001й&*t×ZJp-\u0016xYF\u001bj`A\u0013r-ЖOߵ3\u0004n߿D\u000fv\u000fi>ݍs>"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuOD\u0003a,\\L", "", "u(E", "\u000fbT@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005X6\u001bj", "5dc\u000eV,L", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#{*>w#<X?9k}\u000b\u0017e7", "\u000fbT@V.", "5dc\u000eV,LQ\u001b", "\u000fc^/X\u0019@P", "5dc\u000eW6;S\u0006\u0001w", "\u0010s!|%v", "5dc\u000fgx\t c", "\u0010s&|,", "5dc\u000fg}\t'", "\u0011hT\u0019T)", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuOD\u0003a,$", "5dc\u0010\\,%O\u0016", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#{*>w#<X?9k}{\u001fokFtn(Lv|", "\u0011hT%lA", "5dc\u0010\\,1g.", "\u0011n[<e\u001aIO\u0017~\t:9\n\u0005C", "", "5dc\u0010b3H`\u0007\nv\\,\u000bd<r{<:P\u0005\u0011\u0019Tk\u0019?z#CS\u000b >m\u0012<M", "u(J\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`I|\nGy)3gG\u001eAt ;[N7i4grrhC\u0014Q7Jt'\u001d", ")KP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~W\b'Az$9IA;5\u0012(\u001crn'\u0012_*NL", "\u0012bX\u001d&", "5dc\u0011V0)!", "\u0012hb=_(R>f", "5dc\u0011\\:IZ\u0015\u0013e,", "\u0013wc2a+>R\u0007\f|[", "5dc\u0012k;>\\\u0018~yL9~\u0006", "\u001ah]2T9\u001ef(~\u0004],{v<g|", "5dc\u0019\\5>O&^\u000em,\u0006\b/dm5}=", "\u001ah]2T9,`\u001b{", "5dc\u0019\\5>O&l\b`)", "\u001cn]2G9:\\'\u007fzk\u0017x\u0016+m\u007f7{M\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005ZA\u001a\u001evb9\u0014N([r/G[N9j(", "\u001csb0$\u007f\u000e!", "5dc\u001bg:<\u001flNH", "\u001csb0$\u007f\u000e!\u0004\f~f(\n\r/s", "", "5dc\u001bg:<\u001flNHI9\u0001\u0011+r\u0004(\n~\u0011\u001b\u0011I|\nGy)3gw-7t\u0016*[C", "u(J\u0013", "\u001dj[.U", "5dc\u001c^3:P", "\u001eq^\u001d[6M]\u0006\u0001w", "5dc\u001de6)V#\u000e\u0005K.y", "!l_AX\n", "5dc `7MSv", "!qV/", "5dc e.;", "!qV/C9B[\u0015\f~^:", "5dc e.;>&\u0003\u0003Z9\u0001\t=$\u0010,uB\u000e\u0013\"Js\fJp25`}\u001cEm", "!qV/G9:\\'\u007fzk\u0017x\u0016+m\u007f7{M\u000f", "5dc e.;B&z\u0004l-|\u0016\u001aa\r$\u0004@\u0010\u0017$U.\u001e@p'BU\t#;k$(ZCBk0,\u0015", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#{*>w#<X?9k}\r\"djG\bc99r4CTN;\\_\u0001\u0013", "#mb=X*BT\u001d~y", "5dc\"a:IS\u0017\u0003{b,{G?iy*\t<\f\u001a\u001bE}\bIv,5U\f ", "5dc\u0010b3H`\u0007\nv\\,", "7c", "", "5dc\u0010b3H`\u0007\nv\\,;\u00193_\u00025wK\u0004\u001b\u0015Ui\u001b<}%1g}", ";`c0[", "BnG&M\u000b\u000e\u001e", "4t]0g0H\\", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ColorSpaces {
    private static final Rgb Aces;
    private static final Rgb Acescg;
    private static final Rgb AdobeRgb;
    private static final Rgb Bt2020;
    private static final Rgb Bt709;
    private static final ColorSpace CieLab;
    private static final ColorSpace CieXyz;
    private static final ColorSpace[] ColorSpacesArray;
    private static final Rgb DciP3;
    private static final Rgb DisplayP3;
    private static final Rgb ExtendedSrgb;
    public static final ColorSpaces INSTANCE = new ColorSpaces();
    private static final Rgb LinearExtendedSrgb;
    private static final Rgb LinearSrgb;
    private static final TransferParameters NoneTransferParameters;
    private static final Rgb Ntsc1953;
    private static final float[] Ntsc1953Primaries;
    private static final ColorSpace Oklab;
    private static final Rgb ProPhotoRgb;
    private static final Rgb SmpteC;
    private static final Rgb Srgb;
    private static final float[] SrgbPrimaries;
    private static final TransferParameters SrgbTransferParameters;
    private static final Rgb Unspecified;

    private ColorSpaces() {
    }

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        SrgbPrimaries = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        Ntsc1953Primaries = fArr2;
        TransferParameters transferParameters = new TransferParameters(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        SrgbTransferParameters = transferParameters;
        TransferParameters transferParameters2 = new TransferParameters(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d, 96, null);
        NoneTransferParameters = transferParameters2;
        Rgb rgb = new Rgb("sRGB IEC61966-2.1", fArr, Illuminant.INSTANCE.getD65(), transferParameters, 0);
        Srgb = rgb;
        Rgb rgb2 = new Rgb("sRGB IEC61966-2.1 (Linear)", fArr, Illuminant.INSTANCE.getD65(), 1.0d, 0.0f, 1.0f, 1);
        LinearSrgb = rgb2;
        Rgb rgb3 = new Rgb("scRGB-nl IEC 61966-2-2:2003", fArr, Illuminant.INSTANCE.getD65(), null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.ColorSpaces$$ExternalSyntheticLambda0
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return ColorSpaces.ExtendedSrgb$lambda$0(d2);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.ColorSpaces$$ExternalSyntheticLambda1
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d2) {
                return ColorSpaces.ExtendedSrgb$lambda$1(d2);
            }
        }, -0.799f, 2.399f, transferParameters, 2);
        ExtendedSrgb = rgb3;
        Rgb rgb4 = new Rgb("scRGB IEC 61966-2-2:2003", fArr, Illuminant.INSTANCE.getD65(), 1.0d, -0.5f, 7.499f, 3);
        LinearExtendedSrgb = rgb4;
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, Illuminant.INSTANCE.getD65(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 4);
        Bt709 = rgb5;
        Rgb rgb6 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, Illuminant.INSTANCE.getD65(), new TransferParameters(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d, 96, null), 5);
        Bt2020 = rgb6;
        Rgb rgb7 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new WhitePoint(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        DciP3 = rgb7;
        Rgb rgb8 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, Illuminant.INSTANCE.getD65(), transferParameters, 7);
        DisplayP3 = rgb8;
        Rgb rgb9 = new Rgb("NTSC (1953)", fArr2, Illuminant.INSTANCE.getC(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 8);
        Ntsc1953 = rgb9;
        Rgb rgb10 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, Illuminant.INSTANCE.getD65(), new TransferParameters(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d, 96, null), 9);
        SmpteC = rgb10;
        Rgb rgb11 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, Illuminant.INSTANCE.getD65(), 2.2d, 0.0f, 1.0f, 10);
        AdobeRgb = rgb11;
        Rgb rgb12 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, Illuminant.INSTANCE.getD50(), new TransferParameters(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d, 96, null), 11);
        ProPhotoRgb = rgb12;
        Rgb rgb13 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, Illuminant.INSTANCE.getD60(), 1.0d, -65504.0f, 65504.0f, 12);
        Aces = rgb13;
        Rgb rgb14 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, Illuminant.INSTANCE.getD60(), 1.0d, -65504.0f, 65504.0f, 13);
        Acescg = rgb14;
        Xyz xyz = new Xyz("Generic XYZ", 14);
        CieXyz = xyz;
        Lab lab = new Lab("Generic L*a*b*", 15);
        CieLab = lab;
        Rgb rgb15 = new Rgb("None", fArr, Illuminant.INSTANCE.getD65(), transferParameters2, 16);
        Unspecified = rgb15;
        Oklab oklab = new Oklab("Oklab", 17);
        Oklab = oklab;
        ColorSpacesArray = new ColorSpace[]{rgb, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, rgb14, xyz, lab, rgb15, oklab};
    }

    public final float[] getSrgbPrimaries$ui_graphics_release() {
        return SrgbPrimaries;
    }

    public final float[] getNtsc1953Primaries$ui_graphics_release() {
        return Ntsc1953Primaries;
    }

    public final TransferParameters getSrgbTransferParameters$ui_graphics_release() {
        return SrgbTransferParameters;
    }

    public final Rgb getSrgb() {
        return Srgb;
    }

    public final Rgb getLinearSrgb() {
        return LinearSrgb;
    }

    public final Rgb getExtendedSrgb() {
        return ExtendedSrgb;
    }

    public static final double ExtendedSrgb$lambda$0(double d2) {
        return ColorSpaceKt.absRcpResponse(d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public static final double ExtendedSrgb$lambda$1(double d2) {
        return ColorSpaceKt.absResponse(d2, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d);
    }

    public final Rgb getLinearExtendedSrgb() {
        return LinearExtendedSrgb;
    }

    public final Rgb getBt709() {
        return Bt709;
    }

    public final Rgb getBt2020() {
        return Bt2020;
    }

    public final Rgb getDciP3() {
        return DciP3;
    }

    public final Rgb getDisplayP3() {
        return DisplayP3;
    }

    public final Rgb getNtsc1953() {
        return Ntsc1953;
    }

    public final Rgb getSmpteC() {
        return SmpteC;
    }

    public final Rgb getAdobeRgb() {
        return AdobeRgb;
    }

    public final Rgb getProPhotoRgb() {
        return ProPhotoRgb;
    }

    public final Rgb getAces() {
        return Aces;
    }

    public final Rgb getAcescg() {
        return Acescg;
    }

    public final ColorSpace getCieXyz() {
        return CieXyz;
    }

    public final ColorSpace getCieLab() {
        return CieLab;
    }

    public final Rgb getUnspecified$ui_graphics_release() {
        return Unspecified;
    }

    public final ColorSpace getOklab() {
        return Oklab;
    }

    public final ColorSpace match(float[] fArr, TransferParameters transferParameters) {
        for (ColorSpace colorSpace : ColorSpacesArray) {
            if (ColorModel.m4585equalsimpl0(colorSpace.m4594getModelxdoWZVw(), ColorModel.Companion.m4592getRgbxdoWZVw())) {
                ColorSpace colorSpaceAdapt$default = ColorSpaceKt.adapt$default(colorSpace, Illuminant.INSTANCE.getD50(), null, 2, null);
                Intrinsics.checkNotNull(colorSpaceAdapt$default, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
                Rgb rgb = (Rgb) colorSpaceAdapt$default;
                if (ColorSpaceKt.compare(fArr, rgb.getTransform$ui_graphics_release()) && ColorSpaceKt.compare(transferParameters, rgb.getTransferParameters())) {
                    return colorSpace;
                }
            }
        }
        return null;
    }

    public final ColorSpace getColorSpace$ui_graphics_release(int i2) {
        return getColorSpacesArray$ui_graphics_release()[i2];
    }

    public final ColorSpace[] getColorSpacesArray$ui_graphics_release() {
        return ColorSpacesArray;
    }
}
