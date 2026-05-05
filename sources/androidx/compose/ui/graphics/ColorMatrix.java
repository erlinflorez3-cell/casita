package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: ColorMatrix.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<K!&i\u000eӵLш|\u0004O\u00188\u000b4E\u0007\":\u0012\u007f\u0007lmA0RjP.XS2\u000fy\u0002<$a'yCI^\"}(\u0015WN}gvJp\u000bK\u000f\f5\u0001j:U]xc\u0013\u0015˸\u0001\u0006ЀcM\u001e<yo\u0005<\u000b @\"Py3\u0002ʀ.J\u0016x\tF\u0014\u0017 6XphYҫQ\u0007 \u001a\u0014Gh\f,f\u007fNdOǰa<5.\u0011r\u000b~5kH|{\u001avX5\u001b\u000faLѨp;C$=S1\u0017\u0003_M\u0014Wqkݛ\u0019+5=as\u0006F\u001f\u007fѥ\u0014ۀ̠\u0011_x9j\u0019\u001ax\u001a<CO\u0012a\u0001\u00146\u000f\u0013}#;2\rLЀIͶ1\u001cl \u001cL=\u0011aZh\u0002\rO0~oE/%.C[=)xiai)\u0015Ѡ\u0004˿\u0011 )\u001c|=$b\u001c}-\u001b\u0003\b\u0018ƏP͘AJT(g\\6\u000f~\u0003\u001a*27Ͻ\u00041\u00022< m\u0006i[;!\u001a\txHu\u001a\u001d`\u0017`\u001a\u0007Vd:\u001f&H:\u0018:gֈh\u000fqvd^28]\u001eZ\r$0#1l\u0007j.ٚ\u0014XU\u000fypS\u0005\u001a'5l]\u0003~m\u001eWgeaZ\u0018Ҳ\u0016уVx\u001aiJ\u000eMntnk\f\tcX&@u\u0003\u0010&ӻϢMۼƱ6AwJB[y?jA`\u0003LIq\u0001\u0017nrh>\u000f\u000572\u0015\u0002$#\u00191Tj!\bg'VrʐhĘ1CWf'X\u001e5vg\u0015#5\u0006$\u0004U\u000bdGzyטyW\u0002T$O\u0002d=s+\u000f-0b\u0006;hdr\u0014^̊\u0016)\u00014\bD\u0004{<  j\u001f3\u0011nXrl\u0017P\u0004݈v%\u000e\u001e\u000e/*Y\t\u0002{T9bnM\u0001>q<|E٫\t!$a\u000f%j(Cj['K\u001d(\u0018=Sy]\u0018|^}pN>t\u0014\u0011\\g$0zQ\f?k<W\u001b\u0017>P1к\u0007DN-\u0006K\u000b\"BQKHok!ZF\u0013#/,օMԴ\rÖUܪǈ\u0017q\u0004z<\u000fr\u0002QE,^qmW\u0093RܭqoQ&\u0019\u0015_\u0019\u0019{In@\u001dݞ$\\_ł!2\fw&;ז:bŠ<\u000e,72Ѧ$9BҶmQ"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DU\u0012=ZGNA", "", "D`[BX:", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uZ5uN\r", "5dc#T3NS'", "u(J\u0013", "1n]CX9M@\u001b{ih \r\u001a", "", "1n]CX9M@\u001b{ih \r\u001avi\b3\u0003", "uZ5uI", "1n]CX9MG)\u0010ih\u0019~\u0006", "1n]CX9MG)\u0010ih\u0019~\u0006vi\b3\u0003", "2nc", "", ";0", "@nf", "", ";1", "1n[B`5", "2ncy@,\r=#r^", "uZ5(9\u001044|B[", "3pd._:", "", "=sW2e", "3pd._:\u0006W!\n\u0002", "uZ5\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016D\f", "5dc", "5dcy\\4IZ", "uZ5\u0016<o\u001f", "6`b566=S", "6`b566=S`\u0003\u0003i3", "uZ5u<", "@db2g", "@db2gsB[$\u0006", "@nc.g,\"\\(~\bg(\u0004", "2dV?X,L", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1nb6a,", "Ah]2", "@nc.g,\"\\(~\bg(\u0004P3m\u000b/", "uZ5\u0013?2Hb \u0003\u0004(1\u000e\u0011xf\u00101yO\u0005! U9nL\u007f#D]\b)\u0004CY\u001f", "Adc", "AqR", "Adcy]\u000f \u001b\u0003\nx", "uZ5(9o/", "D", "Adcy\\4IZ", "uZ5\u0016<\r\u0002D", "Adc!b\u0019Hb\u0015\u000ez;3\r\t", "Adc!b\u0019Hb\u0015\u000ez;3\r\tvi\b3\u0003", "uZ5\u0013\u001c\u001d", "Adc!b\u0019Hb\u0015\u000ez@9|\t8", "Adc!b\u0019Hb\u0015\u000ez@9|\t8-\u00040\u0007G", "Adc!b\u0019Hb\u0015\u000ezK,{", "Adc!b\u0019Hb\u0015\u000ezK,{P3m\u000b/", "Adc!b\u001a:b)\fvm0\u0007\u0012", "A`c", "Adc!b\u001a:b)\fvm0\u0007\u0012vi\b3\u0003", "Adc!b\u001a<O ~", "@dS V(ES", "5qT2a\u001a<O ~", "0kd2F*:Z\u0019", "/k_5T\u001a<O ~", "Adc!b\u001a<O ~Bb4\b\u0010", "uZ5\u00139\r\u001f\u0017\n", "Bh\\2f\bLa\u001d\u0001\u0004", "1n[<e\u0014:b&\u0003\u000e", "Bh\\2f\bLa\u001d\u0001\u0004&1_jvO\u000b&", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uZ5u?1:d\u0015H\u0002Z5~R\u001dt\r,\u0005BV", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class ColorMatrix {
    private final float[] values;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ColorMatrix m4233boximpl(float[] fArr) {
        return new ColorMatrix(fArr);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float[] m4234constructorimpl(float[] fArr) {
        return fArr;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4239equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof ColorMatrix) && Intrinsics.areEqual(fArr, ((ColorMatrix) obj).m4254unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4240equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4242hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4253toStringimpl(float[] fArr) {
        return "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
    }

    public boolean equals(Object obj) {
        return m4239equalsimpl(this.values, obj);
    }

    public int hashCode() {
        return m4242hashCodeimpl(this.values);
    }

    public String toString() {
        return m4253toStringimpl(this.values);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m4254unboximpl() {
        return this.values;
    }

    private /* synthetic */ ColorMatrix(float[] fArr) {
        this.values = fArr;
    }

    public final float[] getValues() {
        return this.values;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m4235constructorimpl$default(float[] fArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return m4234constructorimpl(fArr);
    }

    /* JADX INFO: renamed from: get-impl, reason: not valid java name */
    public static final float m4241getimpl(float[] fArr, int i2, int i3) {
        return fArr[(i2 * 5) + i3];
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m4245setimpl(float[] fArr, int i2, int i3, float f2) {
        fArr[(i2 * 5) + i3] = f2;
    }

    /* JADX INFO: renamed from: reset-impl, reason: not valid java name */
    public static final void m4243resetimpl(float[] fArr) {
        ArraysKt.fill$default(fArr, 0.0f, 0, 0, 6, (Object) null);
        fArr[0] = 1.0f;
        fArr[12] = 1.0f;
        fArr[6] = 1.0f;
        fArr[18] = 1.0f;
    }

    /* JADX INFO: renamed from: set-jHG-Opc, reason: not valid java name */
    public static final void m4246setjHGOpc(float[] fArr, float[] fArr2) {
        ArraysKt.copyInto$default(fArr2, fArr, 0, 0, 0, 14, (Object) null);
    }

    /* JADX INFO: renamed from: rotateInternal-impl, reason: not valid java name */
    private static final void m4244rotateInternalimpl(float[] fArr, float f2, Function2<? super Float, ? super Float, Unit> function2) {
        m4243resetimpl(fArr);
        double d2 = (((double) f2) * 3.141592653589793d) / 180.0d;
        function2.invoke(Float.valueOf((float) Math.cos(d2)), Float.valueOf((float) Math.sin(d2)));
    }

    /* JADX INFO: renamed from: timesAssign-jHG-Opc, reason: not valid java name */
    public static final void m4252timesAssignjHGOpc(float[] fArr, float[] fArr2) {
        float fM4238dotMe4OoYI = m4238dotMe4OoYI(fArr, fArr, 0, fArr2, 0);
        float fM4238dotMe4OoYI2 = m4238dotMe4OoYI(fArr, fArr, 0, fArr2, 1);
        float fM4238dotMe4OoYI3 = m4238dotMe4OoYI(fArr, fArr, 0, fArr2, 2);
        float fM4238dotMe4OoYI4 = m4238dotMe4OoYI(fArr, fArr, 0, fArr2, 3);
        float f2 = (fArr[0] * fArr2[4]) + (fArr[1] * fArr2[9]) + (fArr[2] * fArr2[14]) + (fArr[3] * fArr2[19]) + fArr[4];
        float fM4238dotMe4OoYI5 = m4238dotMe4OoYI(fArr, fArr, 1, fArr2, 0);
        float fM4238dotMe4OoYI6 = m4238dotMe4OoYI(fArr, fArr, 1, fArr2, 1);
        float fM4238dotMe4OoYI7 = m4238dotMe4OoYI(fArr, fArr, 1, fArr2, 2);
        float fM4238dotMe4OoYI8 = m4238dotMe4OoYI(fArr, fArr, 1, fArr2, 3);
        float f3 = (fArr[5] * fArr2[4]) + (fArr[6] * fArr2[9]) + (fArr[7] * fArr2[14]) + (fArr[8] * fArr2[19]) + fArr[9];
        float fM4238dotMe4OoYI9 = m4238dotMe4OoYI(fArr, fArr, 2, fArr2, 0);
        float fM4238dotMe4OoYI10 = m4238dotMe4OoYI(fArr, fArr, 2, fArr2, 1);
        float fM4238dotMe4OoYI11 = m4238dotMe4OoYI(fArr, fArr, 2, fArr2, 2);
        float fM4238dotMe4OoYI12 = m4238dotMe4OoYI(fArr, fArr, 2, fArr2, 3);
        float f4 = (fArr[10] * fArr2[4]) + (fArr[11] * fArr2[9]) + (fArr[12] * fArr2[14]) + (fArr[13] * fArr2[19]) + fArr[14];
        float fM4238dotMe4OoYI13 = m4238dotMe4OoYI(fArr, fArr, 3, fArr2, 0);
        float fM4238dotMe4OoYI14 = m4238dotMe4OoYI(fArr, fArr, 3, fArr2, 1);
        float fM4238dotMe4OoYI15 = m4238dotMe4OoYI(fArr, fArr, 3, fArr2, 2);
        float fM4238dotMe4OoYI16 = m4238dotMe4OoYI(fArr, fArr, 3, fArr2, 3);
        float f5 = (fArr[15] * fArr2[4]) + (fArr[16] * fArr2[9]) + (fArr[17] * fArr2[14]) + (fArr[18] * fArr2[19]) + fArr[19];
        fArr[0] = fM4238dotMe4OoYI;
        fArr[1] = fM4238dotMe4OoYI2;
        fArr[2] = fM4238dotMe4OoYI3;
        fArr[3] = fM4238dotMe4OoYI4;
        fArr[4] = f2;
        fArr[5] = fM4238dotMe4OoYI5;
        fArr[6] = fM4238dotMe4OoYI6;
        fArr[7] = fM4238dotMe4OoYI7;
        fArr[8] = fM4238dotMe4OoYI8;
        fArr[9] = f3;
        fArr[10] = fM4238dotMe4OoYI9;
        fArr[11] = fM4238dotMe4OoYI10;
        fArr[12] = fM4238dotMe4OoYI11;
        fArr[13] = fM4238dotMe4OoYI12;
        fArr[14] = f4;
        fArr[15] = fM4238dotMe4OoYI13;
        fArr[16] = fM4238dotMe4OoYI14;
        fArr[17] = fM4238dotMe4OoYI15;
        fArr[18] = fM4238dotMe4OoYI16;
        fArr[19] = f5;
    }

    /* JADX INFO: renamed from: setToSaturation-impl, reason: not valid java name */
    public static final void m4250setToSaturationimpl(float[] fArr, float f2) {
        m4243resetimpl(fArr);
        float f3 = 1 - f2;
        float f4 = 0.213f * f3;
        float f5 = 0.715f * f3;
        float f6 = f3 * 0.072f;
        fArr[0] = f4 + f2;
        fArr[1] = f5;
        fArr[2] = f6;
        fArr[5] = f4;
        fArr[6] = f5 + f2;
        fArr[7] = f6;
        fArr[10] = f4;
        fArr[11] = f5;
        fArr[12] = f6 + f2;
    }

    /* JADX INFO: renamed from: setToScale-impl, reason: not valid java name */
    public static final void m4251setToScaleimpl(float[] fArr, float f2, float f3, float f4, float f5) {
        m4243resetimpl(fArr);
        fArr[0] = f2;
        fArr[6] = f3;
        fArr[12] = f4;
        fArr[18] = f5;
    }

    /* JADX INFO: renamed from: convertRgbToYuv-impl, reason: not valid java name */
    public static final void m4236convertRgbToYuvimpl(float[] fArr) {
        m4243resetimpl(fArr);
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    /* JADX INFO: renamed from: convertYuvToRgb-impl, reason: not valid java name */
    public static final void m4237convertYuvToRgbimpl(float[] fArr) {
        m4243resetimpl(fArr);
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    /* JADX INFO: renamed from: dot-Me4OoYI, reason: not valid java name */
    private static final float m4238dotMe4OoYI(float[] fArr, float[] fArr2, int i2, float[] fArr3, int i3) {
        int i4 = i2 * 5;
        return (fArr2[i4] * fArr3[i3]) + (fArr2[i4 + 1] * fArr3[5 + i3]) + (fArr2[i4 + 2] * fArr3[10 + i3]) + (fArr2[i4 + 3] * fArr3[15 + i3]);
    }

    /* JADX INFO: renamed from: setToRotateRed-impl, reason: not valid java name */
    public static final void m4249setToRotateRedimpl(float[] fArr, float f2) {
        m4243resetimpl(fArr);
        double d2 = (((double) f2) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        fArr[12] = fCos;
        fArr[6] = fCos;
        fArr[7] = fSin;
        fArr[11] = -fSin;
    }

    /* JADX INFO: renamed from: setToRotateGreen-impl, reason: not valid java name */
    public static final void m4248setToRotateGreenimpl(float[] fArr, float f2) {
        m4243resetimpl(fArr);
        double d2 = (((double) f2) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        fArr[12] = fCos;
        fArr[0] = fCos;
        fArr[2] = -fSin;
        fArr[10] = fSin;
    }

    /* JADX INFO: renamed from: setToRotateBlue-impl, reason: not valid java name */
    public static final void m4247setToRotateBlueimpl(float[] fArr, float f2) {
        m4243resetimpl(fArr);
        double d2 = (((double) f2) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        fArr[6] = fCos;
        fArr[0] = fCos;
        fArr[1] = fSin;
        fArr[5] = -fSin;
    }
}
