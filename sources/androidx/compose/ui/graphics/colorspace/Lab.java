package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
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
/* JADX INFO: compiled from: Lab.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r(4\u0012}\u0007njG9LeN.ZS8!s{:$c$\u007fHCU ~*\t]UogtPb\u000bY\u000f\u000e\u0016~q2կkތ{3?2pnw2n0PId\u00036\u001d `#H}\u0013\u00032*v\u0013ͯ~CY\u0010Z>NxRR;V5\u001e \u0010V /'#{\u0017DVwu:]/3mP[?_^\u007f\u0014!\u000fb5\u001b\u000faL7p;C\"=S1\n\u0019o\b&M\u0001U\u0005\u00177W/W\u0005o6\u0007\fD\u00199a%]!2\r\t_s$'Y[*Yח\u0012(}\u000fD\u001bJ\u0019&\u0006UQ^1(p \u000ea}9g\ts\u0010tZ\u007f)mf\u001b3\u0011K+g'\u0017UoM1Ne\b5\u0011,6\u0019nOg\u001b\u001c\u05ce\u0019\u001bZ\u000f\u001al_XUH|#\nA{\u001e\tb0644U\u001bG{?:G)EwQ#Ow2LR\u0005\u000f\u0005\u000ft\u0004m`fX\"\u001d\u0015}8ė\u000bɮמc\u0004\u07fbTV^K\u001fmlf\u0015\u0003 \u0013Nb.\u0011wَ\u0012ʽSl\u0002lSb\u0018,Çf@anq-_<dۊQ\u007fb߭et"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005R0\u001bj", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuOD\u0003a,$", "<`\\2", "", "7c", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "7rF6W, O!\u000f\n", "", "u(I", "4q^:K@S", "", "D", "5dc\u001aT?/O \u000fz", "", "1n\\=b5>\\(", "5dc\u001a\\5/O \u000fz", "BnGF", "", "D/", "D0", "D1", "BnGF\u0017<BM\u001b\fvi/\u0001\u0007=_\r(\u0003@|%\u0017", "BnGFm", "BnI", "BnIph08U&z\u0006a0z\u0017)r\u007f/{<\u000f\u0017", "Fxi.G6\u001c] \t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "F", "G", "H", RemoteSettings.FORWARD_SLASH_STRING, "1n[<e\u001aIO\u0017~", "Fxi.G6\u001c] \t\b&\u0011\u0004q3L\u000e*:P\u0005\u0011\u0019Tk\u0019?z#CS\u000b >m\u0012<M", "uE5\u00139\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001k 5WPIv0\u001c\u00152?C\u000em9<\u0002#EL$oA", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Lab extends ColorSpace {
    private static final float A = 0.008856452f;
    private static final float B = 7.787037f;
    private static final float C = 0.13793103f;
    public static final Companion Companion = new Companion(null);
    private static final float D = 0.20689656f;

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i2) {
        return i2 == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i2) {
        return i2 == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    public Lab(String str, int i2) {
        super(str, ColorModel.Companion.m4591getLabxdoWZVw(), i2, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        float f2 = fArr[0];
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 100.0f) {
            f2 = 100.0f;
        }
        fArr[0] = f2;
        float f3 = fArr[1];
        if (f3 < -128.0f) {
            f3 = -128.0f;
        }
        if (f3 > 128.0f) {
            f3 = 128.0f;
        }
        fArr[1] = f3;
        float f4 = fArr[2];
        float f5 = f4 >= -128.0f ? f4 : -128.0f;
        float f6 = f5 <= 128.0f ? f5 : 128.0f;
        fArr[2] = f6;
        float f7 = (f2 + 16.0f) / 116.0f;
        float f8 = (f3 * 0.002f) + f7;
        float f9 = f7 - (f6 * 0.005f);
        float f10 = f8 > D ? f8 * f8 * f8 : (f8 - C) * 0.12841855f;
        float f11 = f7 > D ? f7 * f7 * f7 : (f7 - C) * 0.12841855f;
        float f12 = f9 > D ? f9 * f9 * f9 : 0.12841855f * (f9 - C);
        fArr[0] = f10 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        fArr[1] = f11 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1];
        fArr[2] = f12 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
        return fArr;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 100.0f) {
            f2 = 100.0f;
        }
        if (f3 < -128.0f) {
            f3 = -128.0f;
        }
        if (f3 > 128.0f) {
            f3 = 128.0f;
        }
        float f5 = (f2 + 16.0f) / 116.0f;
        float f6 = (f3 * 0.002f) + f5;
        float f7 = f6 > D ? f6 * f6 * f6 : (f6 - C) * 0.12841855f;
        return (((long) Float.floatToRawIntBits((f5 > D ? f5 * f5 * f5 : (f5 - C) * 0.12841855f) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f7 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0])) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f2, float f3, float f4) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 100.0f) {
            f2 = 100.0f;
        }
        if (f4 < -128.0f) {
            f4 = -128.0f;
        }
        if (f4 > 128.0f) {
            f4 = 128.0f;
        }
        float f5 = ((f2 + 16.0f) / 116.0f) - (f4 * 0.005f);
        return (f5 > D ? f5 * f5 * f5 : 0.12841855f * (f5 - C)) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo4595xyzaToColorJlNiLsg$ui_graphics_release(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        float f6 = f2 / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        float f7 = f3 / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1];
        float f8 = f4 / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
        float fCbrt = f6 > A ? (float) Math.cbrt(f6) : (f6 * B) + C;
        float fCbrt2 = f7 > A ? (float) Math.cbrt(f7) : (f7 * B) + C;
        float f9 = (116.0f * fCbrt2) - 16.0f;
        float f10 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f8 > A ? (float) Math.cbrt(f8) : (f8 * B) + C)) * 200.0f;
        if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        if (f9 > 100.0f) {
            f9 = 100.0f;
        }
        if (f10 < -128.0f) {
            f10 = -128.0f;
        }
        if (f10 > 128.0f) {
            f10 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return ColorKt.Color(f9, f10, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f5, colorSpace);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        float f2 = fArr[0] / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        float f3 = fArr[1] / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1];
        float f4 = fArr[2] / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
        float fCbrt = f2 > A ? (float) Math.cbrt(f2) : (f2 * B) + C;
        float fCbrt2 = f3 > A ? (float) Math.cbrt(f3) : (f3 * B) + C;
        float f5 = (116.0f * fCbrt2) - 16.0f;
        float f6 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f4 > A ? (float) Math.cbrt(f4) : (f4 * B) + C)) * 200.0f;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 100.0f) {
            f5 = 100.0f;
        }
        fArr[0] = f5;
        if (f6 < -128.0f) {
            f6 = -128.0f;
        }
        if (f6 > 128.0f) {
            f6 = 128.0f;
        }
        fArr[1] = f6;
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        fArr[2] = fCbrt3 <= 128.0f ? fCbrt3 : 128.0f;
        return fArr;
    }

    /* JADX INFO: compiled from: Lab.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00106B\u0005$2ߛx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈_>PsW3{q\u0014ʣ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͏MŲO\f\u001aؓϴt@"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005R0\u001bSFkA\u0012_5R\u00010\u001d", "", "u(E", "\u000f", "", "\u0010", "\u0011", "\u0012", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
