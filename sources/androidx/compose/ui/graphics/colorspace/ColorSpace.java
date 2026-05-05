package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
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
/* JADX INFO: compiled from: ColorSpace.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\u0015\"4\u0012}\u0007njG6LeN2ZS8\u0018s{:,c$\u007fUC٥\"}0\u000eWNmnvJh\u0012K\u000f\f\u001f\u0001jBI]xc\u0016\u0015VXģ]h}ok8\u0019skE586H}\u0013\u00012*v\u0011\u0007~QM$\u0012^C¤>R\u001bQE7\u0018ßN$\u000f\u001etg|7Xpk<G#1lRR5dH|{\u0013ТX'\u001b}*/9UO5C2\u0004\t\u0015hsA\u0019> <Kة'oIW\u000bo6\u0007\u0018D\u00199h%]!@\r\t_{$'Yi\u0014O^*@w)\u0016SAL\u001e\u0014>`.[2\u0017\u000e\u00142\u0003\u0010k@~\u001a%gH\u000boT/%.M[?!e_\u0001S\u0019|=B)U.1!\u0007!\nn>f\u001b\u001ab\u0017i1\u007fF\u0004l\u0017\u0010g^\u0006\u0004\u001fhH>L6U\"G{?/]9\u007f~GF9k0ltk\u0005*xh\u0002\u0004\u0003LNH\u0007\u0016eD9\u0010hk|\u0005\u001aj\u001bf¯\u0015M\"|O\u001c\u0016<8\\&TQ)\u001exgh\u0018\u0005}a\u0018PGfes\u001fo\u001c\u0004Q^aO\u0018hXq` ,?jz5^lAa)r\\V:xm33\u0006)\\N:-bC\u007fAL,_3\r\u0019V)6Bo\u00179ch\u0010(~\u0003Mj\u0011Ȑ(t\u000f/\u0019\u0018~\u001f\u007fxw\\-d0FYQc3VY0\u0004L|Q!/w\u000ec\u007fLuf\u001d\u001a\u0004\u0007\u0014 D4iU=o+\u000f-ǻx\u0010ЈDKɢdʸ̊\u0016)\u00010\bC\fw<o j\u001f2\u00170ߝSX/$|g\u0001-Xv\u000e~yF)M:һ\rИBOzÅq>TC\u000b\u000fo03\r\b\"+Bc\u0018}ދ\u0018߳\u00183-ccu}<Jr\u001d5\re29:݅q͈UaJ=>Xg\r\u000f92n\u001bBvmΤ\u0007ȷ߿3\fάLIlpdJe\r5\u000et\u0018|\u001c~Vs:Apϻ84g͈\fE\u0004'lWќ\u0011V[jsߐg\u000b\nR\u000f\u0010*ֳ5%"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuOD\u0003a,$", "", "<`\\2", "", ";nS2_", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuIC\u0006c3$", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}`'\u0007!&Ns\u0017\u0006{6=#\u0002)Fm#7IJ\u0005J4\u001f\u0011xhHdm5\\\u00064WJ]6i:nJ\u001a\u0012gc\u0012\u001c", "7c", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}`$g\u001d!Vv\u0012E@*FaG$@|\u0016;V?B5\u0013\u001e\u0016dq@\u0016A6W\u00056T\\L;f_Z9!\u0018Z\u001b$n}", "1n\\=b5>\\(\\\u0005n5\f", "5dc\u0010b4I]\"~\u0004m\n\u0007\u00198t", "u(8", "5dc\u0016WjNW\u0013\u0001\bZ7\u007f\r-sy5{G\u0001\u0013%G", "7rB?Z)", "", "u(I", "7rF6W, O!\u000f\n", "5dc\u001ab+>Z`\u0012yh\u001eqyA", "u(9", "\u0018", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "3pd._:", "=sW2e", "4q^:K@S", "", "F", "", "G", "H", "D", "5dc\u001aT?/O \u000fz", "1n\\=b5>\\(", "5dc\u001a\\5/O \u000fz", "6`b566=S", "BnBAe0GU", "BnGF", "", "D/", "D0", "D1", "BnGF\u0017<BM\u001b\fvi/\u0001\u0007=_\r(\u0003@|%\u0017", "BnGFm", "@", "5", AdkSettings.PLATFORM_TYPE_MOBILE, "BnI", "BnIph08U&z\u0006a0z\u0017)r\u007f/{<\u000f\u0017", "Fxi.G6\u001c] \t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", RemoteSettings.FORWARD_SLASH_STRING, "1n[<e\u001aIO\u0017~", "Fxi.G6\u001c] \t\b&\u0011\u0004q3L\u000e*:P\u0005\u0011\u0019Tk\u0019?z#CS\u000b >m\u0012<M", "uE5\u00139\u0013:\\\u0018\f\u0005b+\u0010R-o\b3\u0006N\u0001`'K9\u0010Ir08]{.\u0001k 5WPIv0\u001c\u00152?C\u000em9<\u0002#EL$oA", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class ColorSpace {
    public static final Companion Companion = new Companion(null);
    public static final int MaxId = 63;
    public static final int MinId = -1;
    private final int id;
    private final long model;
    private final String name;

    public /* synthetic */ ColorSpace(String str, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2, i2);
    }

    public /* synthetic */ ColorSpace(String str, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2);
    }

    public abstract float[] fromXyz(float[] fArr);

    public abstract float getMaxValue(int i2);

    public abstract float getMinValue(int i2);

    public boolean isSrgb() {
        return false;
    }

    public abstract boolean isWideGamut();

    public abstract float[] toXyz(float[] fArr);

    private ColorSpace(String str, long j2, int i2) {
        this.name = str;
        this.model = j2;
        this.id = i2;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i2 < -1 || i2 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getModel-xdoWZVw, reason: not valid java name */
    public final long m4594getModelxdoWZVw() {
        return this.model;
    }

    public final int getId$ui_graphics_release() {
        return this.id;
    }

    private ColorSpace(String str, long j2) {
        this(str, j2, -1, null);
    }

    public final int getComponentCount() {
        return ColorModel.m4586getComponentCountimpl(this.model);
    }

    public final float[] toXyz(float f2, float f3, float f4) {
        return toXyz(new float[]{f2, f3, f4});
    }

    public long toXy$ui_graphics_release(float f2, float f3, float f4) {
        float[] xyz = toXyz(f2, f3, f4);
        float f5 = xyz[0];
        float f6 = xyz[1];
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f5)) << 32;
        long jFloatToRawIntBits2 = (-1) - (((-1) - ((long) Float.floatToRawIntBits(f6))) | ((-1) - 4294967295L));
        return (jFloatToRawIntBits + jFloatToRawIntBits2) - (jFloatToRawIntBits & jFloatToRawIntBits2);
    }

    public float toZ$ui_graphics_release(float f2, float f3, float f4) {
        return toXyz(f2, f3, f4)[2];
    }

    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release, reason: not valid java name */
    public long mo4595xyzaToColorJlNiLsg$ui_graphics_release(float f2, float f3, float f4, float f5, ColorSpace colorSpace) {
        float[] fArrFromXyz = fromXyz(f2, f3, f4);
        return ColorKt.Color(fArrFromXyz[0], fArrFromXyz[1], fArrFromXyz[2], f5, colorSpace);
    }

    public final float[] fromXyz(float f2, float f3, float f4) {
        float[] fArr = new float[ColorModel.m4586getComponentCountimpl(this.model)];
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        return fromXyz(fArr);
    }

    public String toString() {
        return this.name + " (id=" + this.id + ", model=" + ((Object) ColorModel.m4588toStringimpl(this.model)) + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) obj;
        if (this.id == colorSpace.id && Intrinsics.areEqual(this.name, colorSpace.name)) {
            return ColorModel.m4585equalsimpl0(this.model, colorSpace.model);
        }
        return false;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + ColorModel.m4587hashCodeimpl(this.model)) * 31) + this.id;
    }

    /* JADX INFO: compiled from: ColorSpace.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005\"2ߛx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԃt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̔~֒Yxe܈ƪ6F"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n3c\u0005*D{!*KC\u0005I>%\u001fuOD\u0003a,\rT1OWJ5`\\{\u0013", "", "u(E", "\u001b`g\u0016W", "", "\u001bh]\u0016W", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
