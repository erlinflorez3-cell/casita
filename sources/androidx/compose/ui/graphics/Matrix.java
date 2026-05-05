package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import com.dynatrace.android.agent.Global;
import cz.msebera.android.httpclient.message.TokenParser;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
/* JADX INFO: compiled from: Matrix.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u000eӵLш|\u0004O\u00188\u000b4E\u0007\":\u001b\u007f\u0007llA0RjP\u008cZS8\u0015s{:)c$\u007fCCU \u007f*\teNogtJb\u000bY\u000f\u000e\u0016~k4Ikxe\u0012\u0015MJoM?UoC=fҢt\u001bړPghy3\u007fR)\u000eP\u0006\u000bIQ\f 0XphSҫQ\u0007 \u0014\u0014Ah\u0019,b\u007fNdO\u001dcH7;\u0005\u007fA|&&ݵ}֔\u0011HZ0\u001b\u0001*<9KO5C1\u0004\u0007\u0015_s?1M\"A\u0013w?'YW:ɕ>ݼ\u0004\u0016\u001b;]\u001e&\u00014n\u001dQ\u000f\u001am̚NӍOR\u0014;\u0006\u000fD\u0018J\u0019&\u0006U^Ͷ1\u001cl\u001f\u001cK=\u0006aYh\u0002\rX0~oP/%.Nڢ=\u001dlmoXadE\u0015\u001d\rLA1r/zl\u000e\u000f3ŊSȭΦ5SF]VoRlK\u0007\u001cp\u0011$Z\b>a\u0018/*3ѧ\u001b'=wGFiv\u0010l\\g%\u001b¾lUowVXj\u0002$]B\t:pth\u0013\u0013hT\u00078ҭQ\u001eZ/\f1[3j\"T!S&~Sv\u0011\u0003M\f\u0016ɻ3h=\u0005|\u0015VjG\u000bK5\u007fy@e`\u001e,?jnۖ\\hH\u0001\u001a\u0004%Q0``j>\u000e,JT\f!aWqJ@\\7\u001f\\#x\u001b\u001epM-\u000feZvA\u0017Ta0ғm&z;\u000f\u0004%\u0017}\u001c\u0011IZ\u0013\u0011&;Ni5G4\u0006&vC\u0015#5\r$\u0004U\u001ddGzx\\߶]ދ$\u0018 o_f\u0006)\u001d7A20CuP\u0001\u001fiM@\u05fdю{Ȫӛ?j4\"\u0016&9En'bO\u0003-Rzl0;\b\u0013р@ӚFܢFϊӝ\u000f]D\b\u0001>\"I\\w\u0015\u0005M^k\u0015Ȟ&~;nQie?\u0006WG\u0015\u0010s\u001au4yp>>t\u0014\u0010\\i\u001cop\u0002u2iDy_\u0005>0U\u0005\u0003pTܖ{\nHMB@\u0004WOd\tVfNߵ3\u0004n߿D\u000fvZi?ܭn}ұ.d2vI\u03810\rB҂\u0015\u0014"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", "", "D`[BX:", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uZ5uN\r", "5dc#T3NS'", "u(J\u0013", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uZ5\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016D\f", "5dc", "", "@nf", "", "1n[B`5", "5dcy\\4IZ", "uZ5\u0016<o\u001f", "6`b566=S", "6`b566=S`\u0003\u0003i3", "uZ5u<", "7me2e;", "", "7me2e;\u0006W!\n\u0002", "uZ5uI", ";`_", "@dRA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001di\r\u001c4t\u0016\u001bMAJA", ";`_y\\4IZ", "uZ5\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Io\u0018Dv4BmG\bG|\u0012+TC(k2-j,R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ">nX;g", ";`_y@\u0012\u00066.Rj", "uZ5\u0017\u001c\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "uZ5\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Io\u0018Dv4BmG\r7k%\u0004\u0011*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001ct=\u001e\u001aZ\u001d[?VqY?3D", "@db2g", "@db2gsB[$\u0006", "@nc.g,1", "2dV?X,L", "@nc.g,1\u001b\u001d\u0007\u0006e", "uZ5\u0013\u001c\u001d", "@nc.g,2", "@nc.g,2\u001b\u001d\u0007\u0006e", "@nc.g,3", "@nc.g,3\u001b\u001d\u0007\u0006e", "AbP9X", "F", "G", "H", "AbP9XsB[$\u0006", "uZ5\u00139\r\u0002D", "Adc", "D", "Adcy\\4IZ", "uZ5\u0016<\r\u0002D", "Adc\u0013e6F", ";`c?\\?", "Adc\u0013e6F\u001bhQwD)n\u0007", "uZ5(9o/", "Bh\\2f\bLa\u001d\u0001\u0004", Global.SEMICOLON, "Bh\\2f\bLa\u001d\u0001\u0004&{O\u0006\u0015bq&", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uZ5u?1:d\u0015H\u0002Z5~R\u001dt\r,\u0005BV", "BqP;f3:b\u0019", "BqP;f3:b\u0019F~f7\u0004", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class Matrix {
    public static final Companion Companion = new Companion(null);
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;
    private final float[] values;

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ Matrix m4407boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static float[] m4408constructorimpl(float[] fArr) {
        return fArr;
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m4410equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && Intrinsics.areEqual(fArr, ((Matrix) obj).m4430unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m4411equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m4413hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public boolean equals(Object obj) {
        return m4410equalsimpl(this.values, obj);
    }

    public int hashCode() {
        return m4413hashCodeimpl(this.values);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ float[] m4430unboximpl() {
        return this.values;
    }

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    public final float[] getValues() {
        return this.values;
    }

    /* JADX INFO: renamed from: constructor-impl$default */
    public static /* synthetic */ float[] m4409constructorimpl$default(float[] fArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m4408constructorimpl(fArr);
    }

    /* JADX INFO: renamed from: get-impl */
    public static final float m4412getimpl(float[] fArr, int i2, int i3) {
        return fArr[(i2 * 4) + i3];
    }

    /* JADX INFO: renamed from: set-impl */
    public static final void m4424setimpl(float[] fArr, int i2, int i3, float f2) {
        fArr[(i2 * 4) + i3] = f2;
    }

    /* JADX INFO: renamed from: map-MK-Hz9U */
    public static final long m4415mapMKHz9U(float[] fArr, long j2) {
        float fM3937getXimpl = Offset.m3937getXimpl(j2);
        float fM3938getYimpl = Offset.m3938getYimpl(j2);
        float f2 = 1 / (((fArr[3] * fM3937getXimpl) + (fArr[7] * fM3938getYimpl)) + fArr[15]);
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            f2 = 0.0f;
        }
        return OffsetKt.Offset(((fArr[0] * fM3937getXimpl) + (fArr[4] * fM3938getYimpl) + fArr[12]) * f2, f2 * ((fArr[1] * fM3937getXimpl) + (fArr[5] * fM3938getYimpl) + fArr[13]));
    }

    /* JADX INFO: renamed from: map-impl */
    public static final Rect m4416mapimpl(float[] fArr, Rect rect) {
        long jM4415mapMKHz9U = m4415mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long jM4415mapMKHz9U2 = m4415mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long jM4415mapMKHz9U3 = m4415mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long jM4415mapMKHz9U4 = m4415mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        return new Rect(Math.min(Math.min(Offset.m3937getXimpl(jM4415mapMKHz9U), Offset.m3937getXimpl(jM4415mapMKHz9U2)), Math.min(Offset.m3937getXimpl(jM4415mapMKHz9U3), Offset.m3937getXimpl(jM4415mapMKHz9U4))), Math.min(Math.min(Offset.m3938getYimpl(jM4415mapMKHz9U), Offset.m3938getYimpl(jM4415mapMKHz9U2)), Math.min(Offset.m3938getYimpl(jM4415mapMKHz9U3), Offset.m3938getYimpl(jM4415mapMKHz9U4))), Math.max(Math.max(Offset.m3937getXimpl(jM4415mapMKHz9U), Offset.m3937getXimpl(jM4415mapMKHz9U2)), Math.max(Offset.m3937getXimpl(jM4415mapMKHz9U3), Offset.m3937getXimpl(jM4415mapMKHz9U4))), Math.max(Math.max(Offset.m3938getYimpl(jM4415mapMKHz9U), Offset.m3938getYimpl(jM4415mapMKHz9U2)), Math.max(Offset.m3938getYimpl(jM4415mapMKHz9U3), Offset.m3938getYimpl(jM4415mapMKHz9U4))));
    }

    /* JADX INFO: renamed from: map-impl */
    public static final void m4417mapimpl(float[] fArr, MutableRect mutableRect) {
        long jM4415mapMKHz9U = m4415mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getLeft(), mutableRect.getTop()));
        long jM4415mapMKHz9U2 = m4415mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getLeft(), mutableRect.getBottom()));
        long jM4415mapMKHz9U3 = m4415mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getRight(), mutableRect.getTop()));
        long jM4415mapMKHz9U4 = m4415mapMKHz9U(fArr, OffsetKt.Offset(mutableRect.getRight(), mutableRect.getBottom()));
        mutableRect.setLeft(Math.min(Math.min(Offset.m3937getXimpl(jM4415mapMKHz9U), Offset.m3937getXimpl(jM4415mapMKHz9U2)), Math.min(Offset.m3937getXimpl(jM4415mapMKHz9U3), Offset.m3937getXimpl(jM4415mapMKHz9U4))));
        mutableRect.setTop(Math.min(Math.min(Offset.m3938getYimpl(jM4415mapMKHz9U), Offset.m3938getYimpl(jM4415mapMKHz9U2)), Math.min(Offset.m3938getYimpl(jM4415mapMKHz9U3), Offset.m3938getYimpl(jM4415mapMKHz9U4))));
        mutableRect.setRight(Math.max(Math.max(Offset.m3937getXimpl(jM4415mapMKHz9U), Offset.m3937getXimpl(jM4415mapMKHz9U2)), Math.max(Offset.m3937getXimpl(jM4415mapMKHz9U3), Offset.m3937getXimpl(jM4415mapMKHz9U4))));
        mutableRect.setBottom(Math.max(Math.max(Offset.m3938getYimpl(jM4415mapMKHz9U), Offset.m3938getYimpl(jM4415mapMKHz9U2)), Math.max(Offset.m3938getYimpl(jM4415mapMKHz9U3), Offset.m3938getYimpl(jM4415mapMKHz9U4))));
    }

    /* JADX INFO: renamed from: timesAssign-58bKbWc */
    public static final void m4426timesAssign58bKbWc(float[] fArr, float[] fArr2) {
        float fM4432dotp89u6pk = MatrixKt.m4432dotp89u6pk(fArr, 0, fArr2, 0);
        float fM4432dotp89u6pk2 = MatrixKt.m4432dotp89u6pk(fArr, 0, fArr2, 1);
        float fM4432dotp89u6pk3 = MatrixKt.m4432dotp89u6pk(fArr, 0, fArr2, 2);
        float fM4432dotp89u6pk4 = MatrixKt.m4432dotp89u6pk(fArr, 0, fArr2, 3);
        float fM4432dotp89u6pk5 = MatrixKt.m4432dotp89u6pk(fArr, 1, fArr2, 0);
        float fM4432dotp89u6pk6 = MatrixKt.m4432dotp89u6pk(fArr, 1, fArr2, 1);
        float fM4432dotp89u6pk7 = MatrixKt.m4432dotp89u6pk(fArr, 1, fArr2, 2);
        float fM4432dotp89u6pk8 = MatrixKt.m4432dotp89u6pk(fArr, 1, fArr2, 3);
        float fM4432dotp89u6pk9 = MatrixKt.m4432dotp89u6pk(fArr, 2, fArr2, 0);
        float fM4432dotp89u6pk10 = MatrixKt.m4432dotp89u6pk(fArr, 2, fArr2, 1);
        float fM4432dotp89u6pk11 = MatrixKt.m4432dotp89u6pk(fArr, 2, fArr2, 2);
        float fM4432dotp89u6pk12 = MatrixKt.m4432dotp89u6pk(fArr, 2, fArr2, 3);
        float fM4432dotp89u6pk13 = MatrixKt.m4432dotp89u6pk(fArr, 3, fArr2, 0);
        float fM4432dotp89u6pk14 = MatrixKt.m4432dotp89u6pk(fArr, 3, fArr2, 1);
        float fM4432dotp89u6pk15 = MatrixKt.m4432dotp89u6pk(fArr, 3, fArr2, 2);
        float fM4432dotp89u6pk16 = MatrixKt.m4432dotp89u6pk(fArr, 3, fArr2, 3);
        fArr[0] = fM4432dotp89u6pk;
        fArr[1] = fM4432dotp89u6pk2;
        fArr[2] = fM4432dotp89u6pk3;
        fArr[3] = fM4432dotp89u6pk4;
        fArr[4] = fM4432dotp89u6pk5;
        fArr[5] = fM4432dotp89u6pk6;
        fArr[6] = fM4432dotp89u6pk7;
        fArr[7] = fM4432dotp89u6pk8;
        fArr[8] = fM4432dotp89u6pk9;
        fArr[9] = fM4432dotp89u6pk10;
        fArr[10] = fM4432dotp89u6pk11;
        fArr[11] = fM4432dotp89u6pk12;
        fArr[12] = fM4432dotp89u6pk13;
        fArr[13] = fM4432dotp89u6pk14;
        fArr[14] = fM4432dotp89u6pk15;
        fArr[15] = fM4432dotp89u6pk16;
    }

    public String toString() {
        return m4427toStringimpl(this.values);
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m4427toStringimpl(float[] fArr) {
        StringBuilder sb = new StringBuilder("\n            |");
        sb.append(fArr[0]).append(TokenParser.SP).append(fArr[1]).append(TokenParser.SP).append(fArr[2]).append(TokenParser.SP).append(fArr[3]).append("|\n            |").append(fArr[4]).append(TokenParser.SP).append(fArr[5]).append(TokenParser.SP).append(fArr[6]).append(TokenParser.SP).append(fArr[7]).append("|\n            |").append(fArr[8]).append(TokenParser.SP).append(fArr[9]).append(TokenParser.SP).append(fArr[10]).append(TokenParser.SP);
        sb.append(fArr[11]).append("|\n            |").append(fArr[12]).append(TokenParser.SP).append(fArr[13]).append(TokenParser.SP).append(fArr[14]).append(TokenParser.SP).append(fArr[15]).append("|\n        ");
        return StringsKt.trimIndent(sb.toString());
    }

    /* JADX INFO: renamed from: setFrom-58bKbWc */
    public static final void m4425setFrom58bKbWc(float[] fArr, float[] fArr2) {
        for (int i2 = 0; i2 < 16; i2++) {
            fArr[i2] = fArr2[i2];
        }
    }

    /* JADX INFO: renamed from: rotateX-impl */
    public static final void m4419rotateXimpl(float[] fArr, float f2) {
        double d2 = (((double) f2) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = (f3 * fCos) - (f4 * fSin);
        float f6 = (f3 * fSin) + (f4 * fCos);
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = (f7 * fCos) - (f8 * fSin);
        float f10 = (f7 * fSin) + (f8 * fCos);
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = (f11 * fCos) - (f12 * fSin);
        float f14 = (f11 * fSin) + (f12 * fCos);
        float f15 = fArr[13];
        float f16 = fArr[14];
        fArr[1] = f5;
        fArr[2] = f6;
        fArr[5] = f9;
        fArr[6] = f10;
        fArr[9] = f13;
        fArr[10] = f14;
        fArr[13] = (f15 * fCos) - (f16 * fSin);
        fArr[14] = (f15 * fSin) + (f16 * fCos);
    }

    /* JADX INFO: renamed from: rotateY-impl */
    public static final void m4420rotateYimpl(float[] fArr, float f2) {
        double d2 = (((double) f2) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        float f3 = fArr[0];
        float f4 = fArr[2];
        float f5 = (f3 * fCos) + (f4 * fSin);
        float f6 = ((-f3) * fSin) + (f4 * fCos);
        float f7 = fArr[4];
        float f8 = fArr[6];
        float f9 = (f7 * fCos) + (f8 * fSin);
        float f10 = ((-f7) * fSin) + (f8 * fCos);
        float f11 = fArr[8];
        float f12 = fArr[10];
        float f13 = (f11 * fCos) + (f12 * fSin);
        float f14 = ((-f11) * fSin) + (f12 * fCos);
        float f15 = fArr[12];
        float f16 = fArr[14];
        fArr[0] = f5;
        fArr[2] = f6;
        fArr[4] = f9;
        fArr[6] = f10;
        fArr[8] = f13;
        fArr[10] = f14;
        fArr[12] = (f15 * fCos) + (f16 * fSin);
        fArr[14] = ((-f15) * fSin) + (f16 * fCos);
    }

    /* JADX INFO: renamed from: rotateZ-impl */
    public static final void m4421rotateZimpl(float[] fArr, float f2) {
        double d2 = (((double) f2) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        float f3 = fArr[0];
        float f4 = fArr[4];
        float f5 = (fCos * f3) + (fSin * f4);
        float f6 = -fSin;
        float f7 = (f3 * f6) + (f4 * fCos);
        float f8 = fArr[1];
        float f9 = fArr[5];
        float f10 = (fCos * f8) + (fSin * f9);
        float f11 = (f8 * f6) + (f9 * fCos);
        float f12 = fArr[2];
        float f13 = fArr[6];
        float f14 = (fCos * f12) + (fSin * f13);
        float f15 = (f12 * f6) + (f13 * fCos);
        float f16 = fArr[3];
        float f17 = fArr[7];
        fArr[0] = f5;
        fArr[1] = f10;
        fArr[2] = f14;
        fArr[3] = (fCos * f16) + (fSin * f17);
        fArr[4] = f7;
        fArr[5] = f11;
        fArr[6] = f15;
        fArr[7] = (f6 * f16) + (fCos * f17);
    }

    /* JADX INFO: renamed from: scale-impl$default */
    public static /* synthetic */ void m4423scaleimpl$default(float[] fArr, float f2, float f3, float f4, int i2, Object obj) {
        if ((1 & i2) != 0) {
            f2 = 1.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            f3 = 1.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 1.0f;
        }
        m4422scaleimpl(fArr, f2, f3, f4);
    }

    /* JADX INFO: renamed from: translate-impl$default */
    public static /* synthetic */ void m4429translateimpl$default(float[] fArr, float f2, float f3, float f4, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            f2 = 0.0f;
        }
        if ((2 & i2) != 0) {
            f3 = 0.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            f4 = 0.0f;
        }
        m4428translateimpl(fArr, f2, f3, f4);
    }

    /* JADX INFO: compiled from: Matrix.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005+2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͓MŲO\f\u001aؓ\u0011|HX%M3\u001chæ\u0011ŋ\u0005\u001edɡ\u001fBVsu:]%Y݊\u0015Ě+_8ŧ\u001e\u0019T\\?\r%ctѯ\u0013˝9\u0015-مS\u0013`dW\u0003ms\u0014ݢ;Ҋ++Q֕(Bf\n,\u0015YQcƥE͉`\u0005YӠ\\39Z{K~\u0010~ÂMԫ\u0011<\f\u05faV3V:E\u001a\u0015\ndޞGɤW@X\u061c\u07b2F\r"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001T\fWKFg=\"\u001fq7", "", "u(E", "\u001eda@c,<b\u001d\u0010z)", "", "\u001eda@c,<b\u001d\u0010z*", "\u001eda@c,<b\u001d\u0010z+", "!bP9X\u001f", "!bP9X ", "!bP9X!", "!jTDK", "!jTDL", "\"qP;f3:b\u0019q", "\"qP;f3:b\u0019r", "\"qP;f3:b\u0019s", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: invert-impl */
    public static final void m4414invertimpl(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (((((f18 * f29) - (f19 * f28)) + (f20 * f27)) + (f21 * f26)) - (f22 * f25)) + (f23 * f24);
        if (f30 == 0.0f) {
            return;
        }
        float f31 = 1.0f / f30;
        fArr[0] = (((f7 * f29) - (f8 * f28)) + (f9 * f27)) * f31;
        fArr[1] = ((((-f3) * f29) + (f4 * f28)) - (f5 * f27)) * f31;
        fArr[2] = (((f15 * f23) - (f16 * f22)) + (f17 * f21)) * f31;
        fArr[3] = ((((-f11) * f23) + (f12 * f22)) - (f13 * f21)) * f31;
        float f32 = -f6;
        fArr[4] = (((f32 * f29) + (f8 * f26)) - (f9 * f25)) * f31;
        fArr[5] = (((f29 * f2) - (f4 * f26)) + (f5 * f25)) * f31;
        float f33 = -f14;
        fArr[6] = (((f33 * f23) + (f16 * f20)) - (f17 * f19)) * f31;
        fArr[7] = (((f23 * f10) - (f12 * f20)) + (f13 * f19)) * f31;
        fArr[8] = (((f6 * f28) - (f7 * f26)) + (f9 * f24)) * f31;
        fArr[9] = ((((-f2) * f28) + (f26 * f3)) - (f5 * f24)) * f31;
        fArr[10] = (((f14 * f22) - (f15 * f20)) + (f17 * f18)) * f31;
        fArr[11] = ((((-f10) * f22) + (f20 * f11)) - (f13 * f18)) * f31;
        fArr[12] = (((f32 * f27) + (f7 * f25)) - (f8 * f24)) * f31;
        fArr[13] = (((f2 * f27) - (f3 * f25)) + (f4 * f24)) * f31;
        fArr[14] = (((f33 * f21) + (f15 * f19)) - (f16 * f18)) * f31;
        fArr[15] = (((f10 * f21) - (f11 * f19)) + (f12 * f18)) * f31;
    }

    /* JADX INFO: renamed from: reset-impl */
    public static final void m4418resetimpl(float[] fArr) {
        int i2 = 0;
        while (i2 < 4) {
            int i3 = 0;
            while (i3 < 4) {
                fArr[(i3 * 4) + i2] = i2 == i3 ? 1.0f : 0.0f;
                i3++;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: scale-impl */
    public static final void m4422scaleimpl(float[] fArr, float f2, float f3, float f4) {
        fArr[0] = fArr[0] * f2;
        fArr[1] = fArr[1] * f2;
        fArr[2] = fArr[2] * f2;
        fArr[3] = fArr[3] * f2;
        fArr[4] = fArr[4] * f3;
        fArr[5] = fArr[5] * f3;
        fArr[6] = fArr[6] * f3;
        fArr[7] = fArr[7] * f3;
        fArr[8] = fArr[8] * f4;
        fArr[9] = fArr[9] * f4;
        fArr[10] = fArr[10] * f4;
        fArr[11] = fArr[11] * f4;
    }

    /* JADX INFO: renamed from: translate-impl */
    public static final void m4428translateimpl(float[] fArr, float f2, float f3, float f4) {
        float f5 = (fArr[0] * f2) + (fArr[4] * f3) + (fArr[8] * f4) + fArr[12];
        float f6 = (fArr[1] * f2) + (fArr[5] * f3) + (fArr[9] * f4) + fArr[13];
        float f7 = (fArr[2] * f2) + (fArr[6] * f3) + (fArr[10] * f4) + fArr[14];
        float f8 = (fArr[3] * f2) + (fArr[7] * f3) + (fArr[11] * f4) + fArr[15];
        fArr[12] = f5;
        fArr[13] = f6;
        fArr[14] = f7;
        fArr[15] = f8;
    }
}
