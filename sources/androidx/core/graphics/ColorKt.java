package androidx.core.graphics;

import android.graphics.Color;
import android.graphics.ColorSpace;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я@\u001d̉=!,o\bDJc|\u0004O\u000b8\u000b<I\u0007\"2\u0014\u007f\u0007|jA0JhP.`\\2\u000fq\u0002<$q$yCAW\"}8\tWNmivJh\u0017K\u000f\f\u0016\u0011u:_mx\f\u001472p\u0007\u0006ݔU\bHGv\r63\u001fZ\"fxKЖ\"BS\u001e\r\u0013Cy\u000e:0ns\u0001ĭ\u0015e\u0010(*\u001e>N\u0003F\\\u0016e|ԧtuE=;\u001bipMO_^{\u0014μNl2\u001b\u000fy\u001eYB_5C(\u001aΐ\u000fjfM\u001cWqk\u0007\u0011'UB\u0010֝_Nc\u000e--+}\f\u0006rT[Kİh$29h{K~\u0010Pw)~Sɥ\f&\u00115bF-Hh0\u000ea\f9ԧHh\rl\\\u0018z\u00105?%.2qݔ#~\\oU1Ne}-\rL&G͡)sg\u001c{-\u001b\u0003\u000fy1\u007fWmL\\\u0011q=\u001c\f7ï\fB\u0017>b\u0018/*(V\u0017SN\f=1(\u0004\u0002v`.Ѐ\u000fx{a\u0005jHn%\u0017\u0016e)9\u0010hK|\u0005\u001aX\u001bИ6)`*o\u001f}6\u0016H\\&;Q)\u001eUgh\u0018\u0007\u0014β\u0014=BtRqn\u001a\u0011\u007f9\r6eUq\u0017yR%\u001c\u0006ׂl\u001dkt]k\f\t_P\"`K\u001b\u0014\u0006\u0003\\N:/xŵ{4G:N1\\C_+\u001epX-\rmx\u0001\u0010-kyɼ\u0003\u0002/\u0003(\u0019P\u000b\b\u0018g'Hrʑf:8OpM\u0019TlJhb\u007fiȜ\u0005\f\u000bU\bdGzk>u\u0004~fڎ Q\\=]+\u000f-(Z\u0002[f\u0013ǱkiX I\u0013|(\u0012ch\\fNφvLtx\u07bagTE!\u001f^!\">ܴ\u007f\u05fbeJ\u0013IiT\u0019\\^]\u0001Åq<|:%\u0005M![̢oݕ\u00019EE-\u001d${4C#fui\u001e-\"b=%+ш\u0004Нg\u001a\bdWc@<X]g\u0004V\"Rn+Bvm.ڬBީ8\u0011KJGj~ZXa\u00196\u0016f545p\u0005^pݬoϻ82w,yL\f\u001e~W3\u001ceS\u0016l\u0016K\u000b\n\u0001ف\nν\u007f5\u0007\u0014\"I.Wwv\u0017;\u001esF8i;\u0011\brˇ$Ҭ0@ \rI`w\n0\u000f\u000eSw\u000fE@jsiYDגxחZL\u001dbKm/9!\u0013\u001dC6xc?-mtWeҺ2ݏW!!\u001dp_\ruE?ReQ\u001bVZ)\u000bs\\yͺ\u0002\u0530\bKAoq\u0002\u001aK8\u0011+S0\u001bgS9_%3\u0015ϟU͇Rh\u000f\u0014ld\\&I\u0013\t\u0011&<8\u000e3\u0019}q&ܵ-ٮR{OE \u0016%EI\u001b\u001a\u0011{FI/.5[@\u007fޥ\u0014ր\u007f[k=\u0004\u001d.$ڝ\b\u0018"}, d2 = {"/k_5T", "", "5dc\u000e_7AO", "uH\u0018\u0016", "", "", "uI\u0018\u0013", "0kd2", "5dc\u000f_<>", "1n[<e\u001aIO\u0017~", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006\u0006G\u000b$\u0005Rk\f<L", "5dc\u0010b3H`\u0007\nv\\,", "uI\u0018\u0019T5=`#\u0003y(.\n\u0005:h\u0004&\n\n^!\u001eQ|{Gr#5/", "5qT2a", "5dc\u0014e,>\\", "7rB?Z)", "", "uI\u0018'", "7rF6W, O!\u000f\n", ":t\\6a(GQ\u0019", "5dc\u0019h4B\\\u0015\bx^", "uH\u0018\u0013", "@dS", "5dc\u001fX+", "1n\\=b5>\\(J", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006\u0006G\u000b$l", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n]CX9MB#", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006\u0006G\u000b$\u0005Rk\f<5\u000e1a}\u001f\r", ">kd@", "1", "Bn2<_6K", "Bn2<_6K7\"\u000e", "", "Bn2<_6K:#\b|", "1na2 2Mf\u0013\fze,x\u0017/"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ColorKt {
    public static final int component1(int i2) {
        return (i2 >> 24) & 255;
    }

    public static final int component2(int i2) {
        return (-1) - (((-1) - (i2 >> 16)) | ((-1) - 255));
    }

    public static final int component3(int i2) {
        return (-1) - (((-1) - (i2 >> 8)) | ((-1) - 255));
    }

    public static final int component4(int i2) {
        return (-1) - (((-1) - i2) | ((-1) - 255));
    }

    public static final int getAlpha(int i2) {
        int i3 = i2 >> 24;
        return (i3 + 255) - (i3 | 255);
    }

    public static final int getBlue(int i2) {
        return i2 & 255;
    }

    public static final int getGreen(int i2) {
        return (-1) - (((-1) - (i2 >> 8)) | ((-1) - 255));
    }

    public static final int getRed(int i2) {
        return (i2 >> 16) & 255;
    }

    public static final float component1(Color color) {
        return color.getComponent(0);
    }

    public static final float component2(Color color) {
        return color.getComponent(1);
    }

    public static final float component3(Color color) {
        return color.getComponent(2);
    }

    public static final float component4(Color color) {
        return color.getComponent(3);
    }

    public static final Color plus(Color color, Color color2) {
        return ColorUtils.compositeColors(color2, color);
    }

    public static final float getLuminance(int i2) {
        return Color.luminance(i2);
    }

    public static final Color toColor(int i2) {
        return Color.valueOf(i2);
    }

    public static final long toColorLong(int i2) {
        return Color.pack(i2);
    }

    public static final float component1(long j2) {
        return Color.red(j2);
    }

    public static final float component2(long j2) {
        return Color.green(j2);
    }

    public static final float component3(long j2) {
        return Color.blue(j2);
    }

    public static final float component4(long j2) {
        return Color.alpha(j2);
    }

    public static final float getAlpha(long j2) {
        return Color.alpha(j2);
    }

    public static final float getRed(long j2) {
        return Color.red(j2);
    }

    public static final float getGreen(long j2) {
        return Color.green(j2);
    }

    public static final float getBlue(long j2) {
        return Color.blue(j2);
    }

    public static final float getLuminance(long j2) {
        return Color.luminance(j2);
    }

    public static final Color toColor(long j2) {
        return Color.valueOf(j2);
    }

    public static final int toColorInt(long j2) {
        return Color.toArgb(j2);
    }

    public static final boolean isSrgb(long j2) {
        return Color.isSrgb(j2);
    }

    public static final boolean isWideGamut(long j2) {
        return Color.isWideGamut(j2);
    }

    public static final ColorSpace getColorSpace(long j2) {
        return Color.colorSpace(j2);
    }

    public static final long convertTo(int i2, ColorSpace.Named named) {
        return Color.convert(i2, ColorSpace.get(named));
    }

    public static final long convertTo(int i2, ColorSpace colorSpace) {
        return Color.convert(i2, colorSpace);
    }

    public static final long convertTo(long j2, ColorSpace.Named named) {
        return Color.convert(j2, ColorSpace.get(named));
    }

    public static final long convertTo(long j2, ColorSpace colorSpace) {
        return Color.convert(j2, colorSpace);
    }

    public static final Color convertTo(Color color, ColorSpace.Named named) {
        return color.convert(ColorSpace.get(named));
    }

    public static final Color convertTo(Color color, ColorSpace colorSpace) {
        return color.convert(colorSpace);
    }

    public static final int toColorInt(String str) {
        return Color.parseColor(str);
    }
}
