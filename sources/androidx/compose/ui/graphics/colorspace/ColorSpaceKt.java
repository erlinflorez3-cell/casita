package androidx.compose.ui.graphics.colorspace;

import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.graphics.colorspace.Connector;
import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.google.firebase.sessions.settings.RemoteSettings;
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
/* JADX INFO: compiled from: ColorSpace.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d̉=!,m\bDJi|\u0004O\u00188\u000b4D\u0007\":\u001b\u007f\u0007|jA0ZeP\u008cZS@\u000fsڔ<$q$yCAU\"}8\tWNmovJh\u0010K\u000f\f \u0001jBI]xc\u0013'hPģW3{nm=ntN\u0005N1R<\b\u0006\u0019\u001aXG@z\tEc\f@/ptHU%M3\u0019B\nL$\u0019\u001e\u000bf~:Vqu:]\"I݃Z\u00055eH|{\fvX5\r\u000faL*p;C\u0016=S1\u0006\u0003_M\u0005Wqk\u0004\u0019+5.as\u00065\t\u0004\"\u0019CO;\\#*j\ni`:&qՒ{i^\u0015@w)\u0004=@\u0012\u0017\u001e'v6]\u001et\u0012&3#z\u0004D^\rvB.\u0003(ا/=\u000e?C9Is\u0002eI\u001af7*\u0013=$1\u0003\u0007#qS<n[Ñl\u000e_=i@kU~\u000eg>\u0006\u0004\u001fq2.\u00122_\u007f]\u000bWф/;EgQ#Ox2LRh\u000f\u0005\u000fp\u0004m`JX\"\u001d\u001e}ѧ!4hT|\u0005\u001aa\u0005\\:#e\u001c\u0003\u001a.\f!4twj4U\u0014\\d\u0001i\u0019c$\nˑ.ωƠ]pq%eQvACj{\u0010\u0010Z'\u0018MVz\u0005\u0007n\tͭ$pjC:2vr@{\n`f\fA:ou*QD1Gd[ǽ\u001b4P_\u0015\t\u000eb\u0019\u0014\rpK$1qTx\u0017\u001eh\\\u001fw.ծaB\u000b\u007f:-oYe\u001d4q:hb\u0005S\u000b\r\u0011\u0018G\u0016T\u000eƂ\u0005=\u0004u\u0014 D;iU=Y+\u000f-1b\u0006;gdr\u0014r}\u00165\u001e\u0015y=\\\u00192u,\u0003pZ\u00021\u07bbUl>0\u001cvrQ)\u0015\u0004\b}^zuk\u0005\u000fi`ar1zlRF \u001d\u001fLF1s0!M-qHcȷ},V#\bui\u001eO*f\u001dB\re24\u0014\u001a}\u0005i]`\\hMg\"V\"R\u000e3FV\u000f\u0010\bp*zـ9`wr\u0018n8{\n_\u0002t\u0007D\r\u001fU\f>!p\u00164\\^ZwQ\u007f,^q$AQaj\u0006my[;N\u001d\u000e#{_mB K%nW\u0011\bvү\f^DhSb3;9(B,T\b9B\u0005m\u0014\u0011\u0013\u007ft^?\u001b@D\f;\u0005\r\u0005|jY`\u0005\u000fD\u0011%8\u0005\u0017\u000fa\u001d)9?-\u0006F\u0003.\u00146\u000f|5\tIi\u007f\u0003t*CD\u00038aιp7\u0019ouCw\u0001f\bU)\u0006k\u001e\u000bh\u001c\u000b\u001eZ\u0018I8\u0002\u0015mxH^9T\u0015Rry*f\u0001MR-\r~\u0015\u000ej\t?\u000f'T\u000bo\u0011,\u0013ϕ\u0010}QD\u0019\u0017r(7\u0010\u000bc^\u001b[\u0005e1KJ\u0003\u0014Uz\bWI\u007f  N&4x/_o\u000e\u0015\t\u000e\u001fH\u001a\n\u0016\u0011\u00019\u0017^H\u001c.xs#\u000e<1NO022\u0017l^\u0004wO?mߜ\u0005\"Pv\u0001x8v\u0015c\u001dh;\u0007t]ny\u001d<\u0001#\u000f'[[+X\thWX8~\u001f/,\u0015T0^\b\u0011<@Uih~\u007fg[;>_q0a?Ej\u001e,5ߐtâցX*\u001bkdéd\u000edoHł*\riܓh&"}, d2 = {"/ab\u001fV7+S'\n\u0005g:|", "", "F", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "1", ExifInterface.GPS_MEASUREMENT_2D, "5", "/ab\u001fX:I]\"\rz", "1ga<`(MW\u0017ZyZ7\f\u0005>i\n1", "", ";`c?\\?", "AqR$[0MS\u0004\t~g;", "2rc$[0MS\u0004\t~g;", "1n\\=T9>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005ZA\u001a\u001evb9\u0014N([r/G[N9j(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005]7\"$hLC\u000bl;$", "1qT.g,\u001c]\"\bz\\;\u0007\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>'\u001eh_H\u0011p\u0002", "And?V,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuOD\u0003a,$", "2dbA\\5:b\u001d\t\u0004", "7mc2a;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005X4'\u0014hn\u001d\u0010r,W\u0006|", "1qT.g,\u001c]\"\bz\\;\u0007\u0016vY\\\u0006e/ze", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~W\b'Az$9IA;5\u0012(\u001crn'\u0012_*NL\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#Q(8FD\u001b\u0013/M\u007fI2~\u0016\u001d\u0018Bx{>T\u0010\u0011W\u001f|K6VQU]y\u001d%\tI&m\u000bl'`9Mm\u0012{!&r^.S\fWZt_urjK\u0017\t\u0002\"HteSSzQ:tp|U\u0005\u0001\u00120g~8J", "7me2e:>!,L", Global.SEMICOLON, ";t[\u007fky", ":gb", "@gb", ";t[\u007fky\u001dW\u0015\u0001", ";t[\u007fky\u001fZ#z\n,", ";t[\u007fky\u001fZ#z\n,&G", "", "@/", "@0", "@1", ";t[\u007fky\u001fZ#z\n,&H", ";t[\u007fky\u001fZ#z\n,&I", "@b_\u001fX:I]\"\rz", ExifInterface.GPS_MEASUREMENT_3D, "4", "@db=b5LS", "/cP=g", "EgXAX\u0017HW\"\u000e", "/cP=g(MW#\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005G3\u001a w]H\u000bm5$", "1n];X*M", "1n];X*M\u001b\r[XH\u001bvW", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ColorSpaceKt {
    public static final ColorSpace adapt(ColorSpace colorSpace, WhitePoint whitePoint) {
        return adapt$default(colorSpace, whitePoint, null, 2, null);
    }

    /* JADX INFO: renamed from: createConnector-YBCOT_4 */
    private static final Connector m4598createConnectorYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i2) {
        if (colorSpace == colorSpace2) {
            return Connector.Companion.identity$ui_graphics_release(colorSpace);
        }
        if (ColorModel.m4585equalsimpl0(colorSpace.m4594getModelxdoWZVw(), ColorModel.Companion.m4592getRgbxdoWZVw()) && ColorModel.m4585equalsimpl0(colorSpace2.m4594getModelxdoWZVw(), ColorModel.Companion.m4592getRgbxdoWZVw())) {
            Intrinsics.checkNotNull(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Intrinsics.checkNotNull(colorSpace2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            return new Connector.RgbConnector((Rgb) colorSpace, (Rgb) colorSpace2, i2, null);
        }
        return new Connector(colorSpace, colorSpace2, i2, null);
    }

    /* JADX INFO: renamed from: connect-YBCOT_4$default */
    public static /* synthetic */ Connector m4597connectYBCOT_4$default(ColorSpace colorSpace, ColorSpace colorSpace2, int i2, int i3, Object obj) {
        if ((1 & i3) != 0) {
            colorSpace2 = ColorSpaces.INSTANCE.getSrgb();
        }
        if ((i3 & 2) != 0) {
            i2 = RenderIntent.Companion.m4613getPerceptualuksYyKA();
        }
        return m4596connectYBCOT_4(colorSpace, colorSpace2, i2);
    }

    /* JADX INFO: renamed from: connect-YBCOT_4 */
    public static final Connector m4596connectYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i2) {
        int id$ui_graphics_release = colorSpace.getId$ui_graphics_release();
        int id$ui_graphics_release2 = colorSpace2.getId$ui_graphics_release();
        if ((id$ui_graphics_release + id$ui_graphics_release2) - (id$ui_graphics_release & id$ui_graphics_release2) < 0) {
            return m4598createConnectorYBCOT_4(colorSpace, colorSpace2, i2);
        }
        MutableIntObjectMap<Connector> connectors = ConnectorKt.getConnectors();
        int i3 = id$ui_graphics_release | (id$ui_graphics_release2 << 6);
        int i4 = i2 << 12;
        int i5 = (i3 + i4) - (i3 & i4);
        Connector connectorM4598createConnectorYBCOT_4 = connectors.get(i5);
        if (connectorM4598createConnectorYBCOT_4 == null) {
            connectorM4598createConnectorYBCOT_4 = m4598createConnectorYBCOT_4(colorSpace, colorSpace2, i2);
            connectors.set(i5, connectorM4598createConnectorYBCOT_4);
        }
        return connectorM4598createConnectorYBCOT_4;
    }

    public static /* synthetic */ ColorSpace adapt$default(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            adaptation = Adaptation.Companion.getBradford();
        }
        return adapt(colorSpace, whitePoint, adaptation);
    }

    public static final ColorSpace adapt(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation) {
        if (!ColorModel.m4585equalsimpl0(colorSpace.m4594getModelxdoWZVw(), ColorModel.Companion.m4592getRgbxdoWZVw())) {
            return colorSpace;
        }
        Intrinsics.checkNotNull(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        Rgb rgb = (Rgb) colorSpace;
        if (compare(rgb.getWhitePoint(), whitePoint)) {
            return colorSpace;
        }
        return new Rgb(rgb, mul3x3(chromaticAdaptation(adaptation.getTransform$ui_graphics_release(), rgb.getWhitePoint().toXyz$ui_graphics_release(), whitePoint.toXyz$ui_graphics_release()), rgb.getTransform$ui_graphics_release()), whitePoint);
    }

    public static final double rcpResponse(double d2, double d3, double d4, double d5, double d6, double d7) {
        return d2 >= d6 * d5 ? (Math.pow(d2, 1.0d / d7) - d4) / d3 : d2 / d5;
    }

    public static final double response(double d2, double d3, double d4, double d5, double d6, double d7) {
        return d2 >= d6 ? Math.pow((d3 * d2) + d4, d7) : d2 * d5;
    }

    public static final double rcpResponse(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        return d2 >= d6 * d5 ? (Math.pow(d2 - d7, 1.0d / d9) - d4) / d3 : (d2 - d8) / d5;
    }

    public static final double response(double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        return d2 >= d6 ? Math.pow((d3 * d2) + d4, d9) + d7 : (d5 * d2) + d8;
    }

    public static final double absRcpResponse(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Math.copySign(rcpResponse(d2 < 0.0d ? -d2 : d2, d3, d4, d5, d6, d7), d2);
    }

    public static final double absResponse(double d2, double d3, double d4, double d5, double d6, double d7) {
        return Math.copySign(response(d2 < 0.0d ? -d2 : d2, d3, d4, d5, d6, d7), d2);
    }

    public static final boolean compare(TransferParameters transferParameters, TransferParameters transferParameters2) {
        return transferParameters2 != null && Math.abs(transferParameters.getA() - transferParameters2.getA()) < 0.001d && Math.abs(transferParameters.getB() - transferParameters2.getB()) < 0.001d && Math.abs(transferParameters.getC() - transferParameters2.getC()) < 0.001d && Math.abs(transferParameters.getD() - transferParameters2.getD()) < 0.002d && Math.abs(transferParameters.getE() - transferParameters2.getE()) < 0.001d && Math.abs(transferParameters.getF() - transferParameters2.getF()) < 0.001d && Math.abs(transferParameters.getGamma() - transferParameters2.getGamma()) < 0.001d;
    }

    public static final boolean compare(WhitePoint whitePoint, WhitePoint whitePoint2) {
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.getX() - whitePoint2.getX()) < 0.001f && Math.abs(whitePoint.getY() - whitePoint2.getY()) < 0.001f;
    }

    public static final boolean compare(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (Float.compare(fArr[i2], fArr2[i2]) != 0 && Math.abs(fArr[i2] - fArr2[i2]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final float[] inverse3x3(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f2 * f11) + (f3 * f12) + (f4 * f13);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static final float[] mul3x3(float[] fArr, float[] fArr2) {
        float f2 = fArr[0];
        float f3 = fArr2[0];
        float f4 = fArr[3];
        float f5 = fArr2[1];
        float f6 = fArr[6];
        float f7 = fArr2[2];
        float f8 = (f2 * f3) + (f4 * f5) + (f6 * f7);
        float f9 = fArr[1];
        float f10 = fArr[4];
        float f11 = fArr[7];
        float f12 = (f9 * f3) + (f10 * f5) + (f11 * f7);
        float f13 = fArr[2];
        float f14 = fArr[5];
        float f15 = fArr[8];
        float f16 = (f3 * f13) + (f5 * f14) + (f7 * f15);
        float f17 = fArr2[3];
        float f18 = fArr2[4];
        float f19 = fArr2[5];
        float f20 = (f2 * f17) + (f4 * f18) + (f6 * f19);
        float f21 = (f9 * f17) + (f10 * f18) + (f11 * f19);
        float f22 = (f17 * f13) + (f18 * f14) + (f19 * f15);
        float f23 = fArr2[6];
        float f24 = fArr2[7];
        float f25 = fArr2[8];
        return new float[]{f8, f12, f16, f20, f21, f22, (f2 * f23) + (f4 * f24) + (f6 * f25), (f9 * f23) + (f10 * f24) + (f11 * f25), (f13 * f23) + (f14 * f24) + (f15 * f25)};
    }

    public static final float[] mul3x3Float3(float[] fArr, float[] fArr2) {
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[0] * f2) + (fArr[3] * f3) + (fArr[6] * f4);
        fArr2[1] = (fArr[1] * f2) + (fArr[4] * f3) + (fArr[7] * f4);
        fArr2[2] = (fArr[2] * f2) + (fArr[5] * f3) + (fArr[8] * f4);
        return fArr2;
    }

    public static final float mul3x3Float3_0(float[] fArr, float f2, float f3, float f4) {
        return (fArr[0] * f2) + (fArr[3] * f3) + (fArr[6] * f4);
    }

    public static final float mul3x3Float3_1(float[] fArr, float f2, float f3, float f4) {
        return (fArr[1] * f2) + (fArr[4] * f3) + (fArr[7] * f4);
    }

    public static final float mul3x3Float3_2(float[] fArr, float f2, float f3, float f4) {
        return (fArr[2] * f2) + (fArr[5] * f3) + (fArr[8] * f4);
    }

    public static final float[] mul3x3Diag(float[] fArr, float[] fArr2) {
        float f2 = fArr[0];
        float f3 = fArr2[0] * f2;
        float f4 = fArr[1];
        float f5 = fArr2[1] * f4;
        float f6 = fArr[2];
        return new float[]{f3, f5, fArr2[2] * f6, fArr2[3] * f2, fArr2[4] * f4, fArr2[5] * f6, f2 * fArr2[6], f4 * fArr2[7], f6 * fArr2[8]};
    }

    public static final float[] chromaticAdaptation(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrMul3x3Float3 = mul3x3Float3(fArr, fArr2);
        float[] fArrMul3x3Float32 = mul3x3Float3(fArr, fArr3);
        return mul3x3(inverse3x3(fArr), mul3x3Diag(new float[]{fArrMul3x3Float32[0] / fArrMul3x3Float3[0], fArrMul3x3Float32[1] / fArrMul3x3Float3[1], fArrMul3x3Float32[2] / fArrMul3x3Float3[2]}, fArr));
    }
}
