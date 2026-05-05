package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.dynatrace.android.agent.AdkSettings;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: Connector.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lmA0RwP.XY2\u000fy\u0001<$a&yCQU\"}(\rUb}˧\rf\u000b\u000bq\u000e>\u0016\u0015\blf[\u0007m\u0016\u001d2Zom4]sK;xtd\u0006060;\u0012\u0005/\u001eݵL\u0010\u0005\u007f\u0004\u0003\u0012۵@D~:j\r{\u0006*\u0016\u0014@8\u0001L]wRDN\u0005]h03\u0007wIf'\u000e1\rQ\u001bNl';zq$9IO7+$\u0002\r\u07baV[M\u000e\b\u0010K\u000e\u0001'U5yweHp\u007fB([S\u001bq\u000b&\u000b\u0018\u0002d\u001a<CO\u0012^\u0017\u0013p\b\t\u0005%<2\u00186-N-;0~\b<=;\b\u001cX^\u0019vB.\u0013\u0012:%>\u00183YQatј`ݢϭR9\u0002\u001f\u001b9s\u0010|#sT<aڠ\u001fZ\u007f\u0383ISFIV[ZpKu\u001cp\u0011\u0006ň\u0003\u0382ѓ~.ɨ\u00156\u001f%EkQ%'y\u0010W\u0015v\u0005\u0005xh\u0002jʐLF*Â.90\u001a\u001ag\u0015r\u0013thVn+?Wr΄\tą\f\u0013(οHH/,(N}i@җOύ\u000e%7ω\be|q&Wg_\n̓SӒ\u0014aZΘܠ?Ej\b^ڊ^\u0002\u000bb\\.AĞL\t"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>'\u001eh_H\u0011p\u0002", "", "And?V,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuOD\u0003a,$", "2dbA\\5:b\u001d\t\u0004", "7mc2a;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005X4'\u0014hn\u001d\u0010r,W\u0006|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~W\b'Az$9IA;5\u0012(\u001crn'\u0012_*NL\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#Q(8FD\u001b\u0013/M\u007fI2~\u0016\u001d\u0018Bx{>T\u0010\u0011W\u001f|K6VQU]y\u001d%,h4s\u0013c&&?K,]u\"*h]7\u0006\u0003\u001dorSuwnVv\u0005A2MzkDTyb$p4%K\tMU#", "BqP;f-H`!l\u0005n9z\t", "BqP;f-H`!]zl;\u0001\u0012+t\u00042\u0005", "@d]1X9\"\\(~\u0004m", "BqP;f-H`!", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~W\b'Az$9IA;5\u0012(\u001crn'\u0012_*NL\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#Q(8FD\u001b\u0013/M\u007fI2~\u0016\u001d\u0018Bx{>T\u0010\u0011W\u001f|K6VQU]y\u001d(Ak)q\u0016c\u001co\u00048.\u001c|#)h\u001a>\u000eEU\u001en]|keUbxB+HziQAmU\u0006R1&U\te\u001d.Vt\u0001[)\r37@h\u0004^1\u0016Hf\u0004\u001f:\\\u000b7*\u007f> ;VfyjLWf)h\u0012\u001bp@-\u0017e/AR\u0016\u0011j\u0005f1__V\u001bHf%Oy$.J\b\f`\u000b\u001dR\u000b-|eVL\u0017[JxpE\u001eo\u0018\u0012`p!*=#MW\u001er7G3Z\u0019\tu\u000eOl", "5dc\u0011X:MW\"z\nb6\u0006", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#{*>w#<X?9k}{\u001fokFtn(Lv|", "5dc\u001fX5=S&b\u0004m,\u0006\u0018vu\u00066oTfr", "u(8", "\u0017", "5dc b<KQ\u0019", "@", "", "5", AdkSettings.PLATFORM_TYPE_MOBILE, "D", "BqP;f-H`!m\u0005<6\u0004\u0013<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n[<e", "BqP;f-H`!m\u0005<6\u0004\u0013<-\u0007t\tSb\u0006\u0015\u0006\u007f\u00126x21d\u0001$5{\u0010;MJ;gB\u001e", "uI\u0018\u0017", "\u0011n\\=T5B]\"", " fQ\u0010b5GS\u0017\u000e\u0005k", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class Connector {
    public static final Companion Companion = new Companion(null);
    private final ColorSpace destination;
    private final int renderIntent;
    private final ColorSpace source;
    private final float[] transform;
    private final ColorSpace transformDestination;
    private final ColorSpace transformSource;

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, i2);
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i2, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, colorSpace3, colorSpace4, i2, fArr);
    }

    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i2, float[] fArr) {
        this.source = colorSpace;
        this.destination = colorSpace2;
        this.transformSource = colorSpace3;
        this.transformDestination = colorSpace4;
        this.renderIntent = i2;
        this.transform = fArr;
    }

    public final ColorSpace getSource() {
        return this.source;
    }

    public final ColorSpace getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: getRenderIntent-uksYyKA, reason: not valid java name */
    public final int m4599getRenderIntentuksYyKA() {
        return this.renderIntent;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i2) {
        ColorSpace colorSpaceAdapt$default;
        ColorSpace colorSpaceAdapt$default2 = ColorModel.m4585equalsimpl0(colorSpace.m4594getModelxdoWZVw(), ColorModel.Companion.m4592getRgbxdoWZVw()) ? ColorSpaceKt.adapt$default(colorSpace, Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace;
        if (ColorModel.m4585equalsimpl0(colorSpace2.m4594getModelxdoWZVw(), ColorModel.Companion.m4592getRgbxdoWZVw())) {
            colorSpaceAdapt$default = ColorSpaceKt.adapt$default(colorSpace2, Illuminant.INSTANCE.getD50(), null, 2, null);
        } else {
            colorSpaceAdapt$default = colorSpace2;
        }
        this(colorSpace, colorSpace2, colorSpaceAdapt$default2, colorSpaceAdapt$default, i2, Companion.m4602computeTransformYBCOT_4(colorSpace, colorSpace2, i2), null);
    }

    public final float[] transform(float f2, float f3, float f4) {
        return transform(new float[]{f2, f3, f4});
    }

    public float[] transform(float[] fArr) {
        float[] xyz = this.transformSource.toXyz(fArr);
        float[] fArr2 = this.transform;
        if (fArr2 != null) {
            xyz[0] = xyz[0] * fArr2[0];
            xyz[1] = xyz[1] * fArr2[1];
            xyz[2] = xyz[2] * fArr2[2];
        }
        return this.transformDestination.fromXyz(xyz);
    }

    /* JADX INFO: compiled from: Connector.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007ljA0RwP.XY2\u000f\u0002{<$a&wّQ٥J}P\b\u0010km˧~Nh\u000b[\u000f4\u0017\tn:Kmx\f\u0013\u001f6PrW3{sެ=`\u0003;MH@*Py3\bJ.V\u0019\u000fzqL<\u0016>J\t:\u0001\u000e}\t(\u0015\u001e>N\u0005d\\˚MȤՂp_@:1\u000f2P\\4w0+T=Jb5%v\u0010%qT\u007fM#4k\u00035b\fC\u0011P\n=3xm5ɛH֕ɱ:Z\u0006&#> \u0019kt>\\3R7ϲ)˦ScSִ^4\u0006z\u0014\rj\u0005dͽ)ρ2-\"ǑX\u001aAz\u000bSnWXތDȸ~a>ЍӞ\u007f83<!ƺm\u0010:ϳRK"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>'\u001eh_H\u0011pj;x$%VW5\\P\u0002G!g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>'\u001eh_H\u0011p\u0002", ";R^Be*>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005X6\u001bj", ";CT@g0GO(\u0003\u0005g", "7mc2a;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005X4'\u0014hn\u001d\u0010r,W\u0006|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~W\b'Az$9IA;5! \u0012>H5\u0010b9Xz&Z\u0016L6d]|K\u0014[j\u0012\u0018-\u001a\u0001dD(lR\u0001\u001d\u00123S\u000fIs|\n\u0016W\"lm\u0018:vM\u0004$|E22KjgCKJTb7m\bff;:; $x(xrY<\u0019\tc\u000f\u0002\\\u0007OcT\u001fzEy\u0002^", ";Sa.a:?]&\u0007", "", "1n\\=h;>B&z\u0004l-\u0007\u00167", "And?V,", "2dbA\\5:b\u001d\t\u0004", "1n\\=h;>B&z\u0004l-\u0007\u00167-s\u0005Y*o\u0011e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~W\b'Az$9IA;5! \u0012>H5\u0010b9Xz&Z\u0016L6d]|K\u0014[j\u0012\u0018-\u001a\u0001dD(lR\u0001\u001d\u00123S\u000fIs|\n\u0016W\"lm\u0018:S=Z", "BqP;f-H`!", "D", "BqP;f-H`!m\u0005<6\u0004\u0013<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n[<e", "BqP;f-H`!m\u0005<6\u0004\u0013<-\u0007t\tSb\u0006\u0015\u0006\u007f\u00126x21d\u0001$5{\u0010;MJ;gB\u001e", "uI\u0018\u0017", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class RgbConnector extends Connector {
        private final Rgb mDestination;
        private final Rgb mSource;
        private final float[] mTransform;

        public /* synthetic */ RgbConnector(Rgb rgb, Rgb rgb2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(rgb, rgb2, i2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private RgbConnector(Rgb rgb, Rgb rgb2, int i2) {
            Rgb rgb3 = rgb;
            Rgb rgb4 = rgb2;
            super(rgb3, rgb4, rgb3, rgb4, i2, null, null);
            this.mSource = rgb;
            this.mDestination = rgb2;
            this.mTransform = m4603computeTransformYBCOT_4(rgb, rgb2, i2);
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        public float[] transform(float[] fArr) {
            fArr[0] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fArr[0]);
            fArr[1] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fArr[1]);
            fArr[2] = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fArr[2]);
            ColorSpaceKt.mul3x3Float3(this.mTransform, fArr);
            fArr[0] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(fArr[0]);
            fArr[1] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(fArr[1]);
            fArr[2] = (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke(fArr[2]);
            return fArr;
        }

        /* JADX INFO: renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        private final float[] m4603computeTransformYBCOT_4(Rgb rgb, Rgb rgb2, int i2) {
            if (ColorSpaceKt.compare(rgb.getWhitePoint(), rgb2.getWhitePoint())) {
                return ColorSpaceKt.mul3x3(rgb2.getInverseTransform$ui_graphics_release(), rgb.getTransform$ui_graphics_release());
            }
            float[] transform$ui_graphics_release = rgb.getTransform$ui_graphics_release();
            float[] inverseTransform$ui_graphics_release = rgb2.getInverseTransform$ui_graphics_release();
            float[] xyz$ui_graphics_release = rgb.getWhitePoint().toXyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = rgb2.getWhitePoint().toXyz$ui_graphics_release();
            if (!ColorSpaceKt.compare(rgb.getWhitePoint(), Illuminant.INSTANCE.getD50())) {
                float[] transform$ui_graphics_release2 = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
                float[] d50Xyz$ui_graphics_release = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
                float[] fArrCopyOf = Arrays.copyOf(d50Xyz$ui_graphics_release, d50Xyz$ui_graphics_release.length);
                Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, size)");
                transform$ui_graphics_release = ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release2, xyz$ui_graphics_release, fArrCopyOf), rgb.getTransform$ui_graphics_release());
            }
            if (!ColorSpaceKt.compare(rgb2.getWhitePoint(), Illuminant.INSTANCE.getD50())) {
                float[] transform$ui_graphics_release3 = Adaptation.Companion.getBradford().getTransform$ui_graphics_release();
                float[] d50Xyz$ui_graphics_release2 = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
                float[] fArrCopyOf2 = Arrays.copyOf(d50Xyz$ui_graphics_release2, d50Xyz$ui_graphics_release2.length);
                Intrinsics.checkNotNullExpressionValue(fArrCopyOf2, "copyOf(this, size)");
                inverseTransform$ui_graphics_release = ColorSpaceKt.inverse3x3(ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(transform$ui_graphics_release3, xyz$ui_graphics_release2, fArrCopyOf2), rgb2.getTransform$ui_graphics_release()));
            }
            if (RenderIntent.m4608equalsimpl0(i2, RenderIntent.Companion.m4612getAbsoluteuksYyKA())) {
                transform$ui_graphics_release = ColorSpaceKt.mul3x3Diag(new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]}, transform$ui_graphics_release);
            }
            return ColorSpaceKt.mul3x3(inverseTransform$ui_graphics_release, transform$ui_graphics_release);
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        /* JADX INFO: renamed from: transformToColor-l2rxGTc$ui_graphics_release */
        public long mo4600transformToColorl2rxGTc$ui_graphics_release(long j2) {
            float fM4184getRedimpl = Color.m4184getRedimpl(j2);
            float fM4183getGreenimpl = Color.m4183getGreenimpl(j2);
            float fM4181getBlueimpl = Color.m4181getBlueimpl(j2);
            float fM4180getAlphaimpl = Color.m4180getAlphaimpl(j2);
            float fInvoke = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fM4184getRedimpl);
            float fInvoke2 = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fM4183getGreenimpl);
            float fInvoke3 = (float) this.mSource.getEotfFunc$ui_graphics_release().invoke(fM4181getBlueimpl);
            float[] fArr = this.mTransform;
            return ColorKt.Color((float) this.mDestination.getOetfFunc$ui_graphics_release().invoke((fArr[0] * fInvoke) + (fArr[3] * fInvoke2) + (fArr[6] * fInvoke3)), (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke((fArr[1] * fInvoke) + (fArr[4] * fInvoke2) + (fArr[7] * fInvoke3)), (float) this.mDestination.getOetfFunc$ui_graphics_release().invoke((fArr[2] * fInvoke) + (fArr[5] * fInvoke2) + (fArr[8] * fInvoke3)), fM4180getAlphaimpl, this.mDestination);
        }
    }

    /* JADX INFO: compiled from: Connector.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001d6Ȑ\u0007\"B\u0012\u007f\u0007ljA0ZeP.XT2\u000f\u0002{<$a$wْ<kڼ.\"7N\u000flmnН^\u000bQ\u000fN@\u0007kDKkw\f\u0014?6PrW3{sm=nyN\u0005N6R<\b\u000b\u0019\u001aXOVvےBŷë\u00162FxH[U`\u0013$*\u0006l+1\"jjf6vp$Žǥ'\u0003oNú'd8\u007fSϗb\u0003&̂zn"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>'\u001eh_H\u0011pj,\u0001/RHW0f[H", "", "u(E", "1n\\=h;>B&z\u0004l-\u0007\u00167", "", "And?V,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuOD\u0003a,$", "2dbA\\5:b\u001d\t\u0004", "7mc2a;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005X4'\u0014hn\u001d\u0010r,W\u0006|", "1n\\=h;>B&z\u0004l-\u0007\u00167-s\u0005Y*o\u0011e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~W\b'Az$9IA;5\u0012(\u001crn'\u0012_*NL\u000eCUM9fVqP]\u0010d\u0016Y5\u001b\u0005#Q(8FD\u001b\u0013/M\u007fI2~\u0016\u001d\u0018Bx{>T\u0010\u0011W\u001f|K6VQU]y\u001d%\tX\u000b", "7cT;g0Mg", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>'\u001eh_H\u0011p\u0002", "7cT;g0MgW\u000f~X.\n\u0005:h\u0004&\n:\u000e\u0017\u001eGk\u001c<", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        public final float[] m4602computeTransformYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i2) {
            if (!RenderIntent.m4608equalsimpl0(i2, RenderIntent.Companion.m4612getAbsoluteuksYyKA())) {
                return null;
            }
            boolean zM4585equalsimpl0 = ColorModel.m4585equalsimpl0(colorSpace.m4594getModelxdoWZVw(), ColorModel.Companion.m4592getRgbxdoWZVw());
            boolean zM4585equalsimpl02 = ColorModel.m4585equalsimpl0(colorSpace2.m4594getModelxdoWZVw(), ColorModel.Companion.m4592getRgbxdoWZVw());
            if (zM4585equalsimpl0 && zM4585equalsimpl02) {
                return null;
            }
            if (!zM4585equalsimpl0 && !zM4585equalsimpl02) {
                return null;
            }
            if (!zM4585equalsimpl0) {
                colorSpace = colorSpace2;
            }
            Intrinsics.checkNotNull(colorSpace, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            Rgb rgb = (Rgb) colorSpace;
            float[] xyz$ui_graphics_release = zM4585equalsimpl0 ? rgb.getWhitePoint().toXyz$ui_graphics_release() : Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = zM4585equalsimpl02 ? rgb.getWhitePoint().toXyz$ui_graphics_release() : Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            return new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]};
        }

        public final Connector identity$ui_graphics_release(final ColorSpace colorSpace) {
            final int iM4614getRelativeuksYyKA = RenderIntent.Companion.m4614getRelativeuksYyKA();
            return new Connector(colorSpace, iM4614getRelativeuksYyKA) { // from class: androidx.compose.ui.graphics.colorspace.Connector$Companion$identity$1
                @Override // androidx.compose.ui.graphics.colorspace.Connector
                public float[] transform(float[] fArr) {
                    return fArr;
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                /* JADX INFO: renamed from: transformToColor-l2rxGTc$ui_graphics_release */
                public long mo4600transformToColorl2rxGTc$ui_graphics_release(long j2) {
                    return j2;
                }

                {
                    super(colorSpace, colorSpace, iM4614getRelativeuksYyKA, null);
                }
            };
        }
    }

    /* JADX INFO: renamed from: transformToColor-l2rxGTc$ui_graphics_release, reason: not valid java name */
    public long mo4600transformToColorl2rxGTc$ui_graphics_release(long j2) {
        float fM4184getRedimpl = Color.m4184getRedimpl(j2);
        float fM4183getGreenimpl = Color.m4183getGreenimpl(j2);
        float fM4181getBlueimpl = Color.m4181getBlueimpl(j2);
        float fM4180getAlphaimpl = Color.m4180getAlphaimpl(j2);
        long xy$ui_graphics_release = this.transformSource.toXy$ui_graphics_release(fM4184getRedimpl, fM4183getGreenimpl, fM4181getBlueimpl);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (xy$ui_graphics_release >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) ((xy$ui_graphics_release + 4294967295L) - (xy$ui_graphics_release | 4294967295L)));
        float z$ui_graphics_release = this.transformSource.toZ$ui_graphics_release(fM4184getRedimpl, fM4183getGreenimpl, fM4181getBlueimpl);
        float[] fArr = this.transform;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            z$ui_graphics_release *= fArr[2];
        }
        return this.transformDestination.mo4595xyzaToColorJlNiLsg$ui_graphics_release(fIntBitsToFloat, fIntBitsToFloat2, z$ui_graphics_release, fM4180getAlphaimpl, this.destination);
    }
}
