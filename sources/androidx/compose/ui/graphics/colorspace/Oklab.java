package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: Oklab.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r(4\u0012}\u0007njG9LeN.ZS8!s{:$c$\u007fHCU ~*\t]UogtPb\u000bY\u000f\u000e\u0016~q2կkތ{3?2pnw2n0PId\u00036\u001d `#H}\u0013\u00032*v\u0013ͯ~CY\u0010Z>NxRR;V5\u001e \u0010V /'#{\u0017DVwu:]/3mP[?_^\u007f\u0014!\u000fb5\u001b\u000faL7p;C\"=S1\n\u0019o\b&M\u0001U\u0005\u00177W/W\u0005o6\u0007\fD\u00199a%]!2\r\t_s$'Y[*Yח\u0012(}\u000fD\u001bJ\u0019&\u0006UQ^1(p \u000ea}9g\ts\u0010tZ\u007f)mf\u001b3\u0011K+g'\u0017UoM1Ne\b5\u0011,6\u0019nOg\u001b\u001c\u05ce\u0019\u001bZ\u000f\u001al_XUH|#\nA{\u001e\tb0644U\u001bG{?:G)EwQ#Ow2LR\u0005\u000f\u0005\u000ft\u0004m`fX\"\u001d\u0015}8ė\u000bɮמc\u0004\u07fbTV^K\u001fmlf\u0015\u0003 \u0013Nb.\u0011wَ\u0012ʽSl\u0002lSb\u0018,Çf@anq-_<dۊQ\u007fb߭et"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005U:%\u0011e7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuOD\u0003a,$", "<`\\2", "", "7c", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "7rF6W, O!\u000f\n", "", "u(I", "4q^:K@S", "", "D", "5dc\u001aT?/O \u000fz", "", "1n\\=b5>\\(", "5dc\u001a\\5/O \u000fz", "BnGF", "", "D/", "D0", "D1", "BnGF\u0017<BM\u001b\fvi/\u0001\u0007=_\r(\u0003@|%\u0017", "BnGFm", "BnI", "BnIph08U&z\u0006a0z\u0017)r\u007f/{<\u000f\u0017", "Fxi.G6\u001c] \t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "F", "G", "H", RemoteSettings.FORWARD_SLASH_STRING, "1n[<e\u001aIO\u0017~", "Fxi.G6\u001c] \t\b&\u0011\u0004q3L\u000e*:P\u0005\u0011\u0019Tk\u0019?z#CS\u000b >m\u0012<M", "uE5\u00139\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001k 5WPIv0\u001c\u00152?C\u000em9<\u0002#EL$oA", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Oklab extends ColorSpace {
    public static final Companion Companion = new Companion(null);
    private static final float[] InverseM1;
    private static final float[] InverseM2;
    private static final float[] M1;
    private static final float[] M2;

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i2) {
        return i2 == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i2) {
        return i2 == 0 ? 0.0f : -0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    public Oklab(String str, int i2) {
        super(str, ColorModel.Companion.m4591getLabxdoWZVw(), i2, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        float f2 = fArr[0];
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        fArr[0] = f2;
        float f3 = fArr[1];
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        fArr[1] = f3;
        float f4 = fArr[2];
        float f5 = f4 >= -0.5f ? f4 : -0.5f;
        fArr[2] = f5 <= 0.5f ? f5 : 0.5f;
        ColorSpaceKt.mul3x3Float3(InverseM2, fArr);
        float f6 = fArr[0];
        fArr[0] = f6 * f6 * f6;
        float f7 = fArr[1];
        fArr[1] = f7 * f7 * f7;
        float f8 = fArr[2];
        fArr[2] = f8 * f8 * f8;
        ColorSpaceKt.mul3x3Float3(InverseM1, fArr);
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        float f5 = f4 <= 0.5f ? f4 : 0.5f;
        float[] fArr = InverseM2;
        float f6 = (fArr[0] * f2) + (fArr[3] * f3) + (fArr[6] * f5);
        float f7 = (fArr[1] * f2) + (fArr[4] * f3) + (fArr[7] * f5);
        float f8 = (fArr[2] * f2) + (fArr[5] * f3) + (fArr[8] * f5);
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float f11 = f8 * f8 * f8;
        float[] fArr2 = InverseM1;
        return (-1) - (((-1) - (((long) Float.floatToRawIntBits(((fArr2[0] * f9) + (fArr2[3] * f10)) + (fArr2[6] * f11))) << 32)) & ((-1) - (((long) Float.floatToRawIntBits(((fArr2[1] * f9) + (fArr2[4] * f10)) + (fArr2[7] * f11))) & 4294967295L)));
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        if (f4 < -0.5f) {
            f4 = -0.5f;
        }
        float f5 = f4 <= 0.5f ? f4 : 0.5f;
        float[] fArr = InverseM2;
        float f6 = (fArr[0] * f2) + (fArr[3] * f3) + (fArr[6] * f5);
        float f7 = (fArr[1] * f2) + (fArr[4] * f3) + (fArr[7] * f5);
        float f8 = (fArr[2] * f2) + (fArr[5] * f3) + (fArr[8] * f5);
        float f9 = f6 * f6 * f6;
        float f10 = f7 * f7 * f7;
        float f11 = f8 * f8 * f8;
        float[] fArr2 = InverseM1;
        return (fArr2[2] * f9) + (fArr2[5] * f10) + (fArr2[8] * f11);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo4595xyzaToColorJlNiLsg$ui_graphics_release(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        float[] fArr = M1;
        float f6 = (fArr[0] * f2) + (fArr[3] * f3) + (fArr[6] * f4);
        float f7 = (fArr[1] * f2) + (fArr[4] * f3) + (fArr[7] * f4);
        float f8 = (fArr[2] * f2) + (fArr[5] * f3) + (fArr[8] * f4);
        float fFastCbrt = MathHelpersKt.fastCbrt(f6);
        float fFastCbrt2 = MathHelpersKt.fastCbrt(f7);
        float fFastCbrt3 = MathHelpersKt.fastCbrt(f8);
        float[] fArr2 = M2;
        return ColorKt.Color((fArr2[0] * fFastCbrt) + (fArr2[3] * fFastCbrt2) + (fArr2[6] * fFastCbrt3), (fArr2[1] * fFastCbrt) + (fArr2[4] * fFastCbrt2) + (fArr2[7] * fFastCbrt3), (fArr2[2] * fFastCbrt) + (fArr2[5] * fFastCbrt2) + (fArr2[8] * fFastCbrt3), f5, colorSpace);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        ColorSpaceKt.mul3x3Float3(M1, fArr);
        fArr[0] = MathHelpersKt.fastCbrt(fArr[0]);
        fArr[1] = MathHelpersKt.fastCbrt(fArr[1]);
        fArr[2] = MathHelpersKt.fastCbrt(fArr[2]);
        ColorSpaceKt.mul3x3Float3(M2, fArr);
        return fArr;
    }

    /* JADX INFO: compiled from: Oklab.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001d6B\u0005$2ߛx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅ$\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖.֒Yxe܈_>PsW3{q\u0014ʣbҽ:\u0005(݅rD\b\n\u0019\u001aXJf͏|ŲO\f\u001aؓϴt@"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005U:%\u0011e \u0017\u0011k7J\u007f+QU$", "", "u(E", "\u0017me2e:>;d", "", "\u0017me2e:>;e", "\u001b0", "\u001b1", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        float[] fArrMul3x3 = ColorSpaceKt.mul3x3(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics_release(), Illuminant.INSTANCE.getD50().toXyz$ui_graphics_release(), Illuminant.INSTANCE.getD65().toXyz$ui_graphics_release()));
        M1 = fArrMul3x3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        M2 = fArr;
        InverseM1 = ColorSpaceKt.inverse3x3(fArrMul3x3);
        InverseM2 = ColorSpaceKt.inverse3x3(fArr);
    }
}
