package com.facebook.react.uimanager;

import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.facebook.infer.annotation.Assertions;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000f6Ȑ\u0007\":\u0012\u007fјnjGALeN@ZS@\u000fs{:(c$\u007fLCU \u0013(ߢOdʴ\u0018nxYCBGF\u001b~j߽MU\u0007]Z%@E\b?aQ AGe\r63&b&F\u0001\u001d\u0001H,\u000f\u0015?\u0011QS$\u0012^D!>`\u0012e\u0005H\u00186B.\n6\\\u0016P|M5sH9;\u0003\u0018F~+m5\u0015M;L\u0005+\u001b\u007fy\u001eYB}:];a\u000e\u001fR\nC3C\u007fB\u001dhU-[M\u0002`NX.\u0016[0\u0018#k~>\\3U\u0011\u001050gcyV>,\u0006\b\u0014\rj\u0006T\u000bo^<;2f6\u0012cx\u0001XXP0dr\u0004\tnN\u0017S\u0002y0\u0002/t`y;GRg\u007f\u0013\u00126#/tQ_b\u001bx\u0015IV@g?aX=vR:]Kr\u001cp\u0011\bZ\b>P\u0018/*\u0013t\u001cmMiJ;!\u001a\u0006xHu{\u001d`\u0017Y\u001aVVI:nD9p\u000eTxRv\u001dk~X\t0\u001fR4T5\u00048\u0017.o\u0010<O'@R]|\u0002j{_P*w\rEn\u0007k<[ibA:ic>g\u0003z\"RTb3Z\u0017Fa r\\V$bLx&\u0010{rPR\u0018zE\u007f3L,_\u001f#\u001a\u0011\u0019,ZY|7c\u000bl\u001e\u0018l3R\t\u001a(\u0003#\u0019P\u000b\f6lAW:\u0019x\"[C\u00029'Cm\"\u00176C(O\r\u0002\u001e_gzI|p$\u0015m{N\u001c`>\u001a=K3'~W821Sk\u000be\u007fSX,C\u000b\b0Sh\\\n8n~OxjxQ\u001b\u0017j\u0015l\u0017;\b\u0013\u0004*eT _c\u0003\u0011\fBW\u0019\u001bYjTh\u0001\u0013F6%/uh\u0002}KQO5\u0016&\u0018_\u0019o\u0007\u0002o\\\u007f\u0013\u00134y}\u0004ZiFsp{u2i>\u0010^GL0O\u0005\u0003pL\u001b{\u0016a!4;9\u000fF-~dde\u000b]\u007f\u0017\u000b::\tV\n<YtFB<\u000eBsq\u0004DbQ*)M\u0002m4r\u0014\u0003\u0019y'\n9\u0002ar BU \u0005]\u0013\r>-\f\u0018dGkf\u0013l!$b.l\f\u0019tli4\u0012A\u0005\u000fu\u001dIJB\"A\u0007\u0012b\u001ftVv\u000b\u0011InHB\u0001-\u0015y#AK?8\u0006F\u00031\u00146\u000fy5\tIp\u007f\u0003tLCD\u0003?a-!\u000f\u0019yuCw\u0004f\bUO\u0006k\u001e\u0012~\u001dE3PM39\u007f\u0017\u0010z>\u0015#U\u0013T\u0015z \u001ejNP+E\u007fM\u001aJ\u000b'\u000bGQIź5υPN\u007f˿ƺ\u001e:"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001dU\r-;\u0001}*\\F\u001ek;)\u0015u7", "", "u(E", "\u0013OB\u0016?\u0016'", "", "/o_9l\u0017>`'\nz\\;\u0001\u001a/", "", Global.SEMICOLON, "", ">da@c,<b\u001d\u0010z", "/o_9l\u0019Hb\u0015\u000ezQ", "@`S6T5L", "/o_9l\u0019Hb\u0015\u000ezR", "/o_9l\u0019Hb\u0015\u000ezS", "/o_9l\u001a<O ~m", "4`RAb9", "/o_9l\u001a<O ~n", "/o_9l\u001a<O ~o", "/o_9l\u001aDS+q", "/o_9l\u001aDS+r", "/o_9l\u001bKO\"\r\u0002Z;|U\u000e", "F", "G", "/o_9l\u001bKO\"\r\u0002Z;|V\u000e", "H", "1qT.g,\"R\u0019\b\nb;\u0011p+t\r,\u000f", "2dR<`7Ha\u0019fvm9\u0001\u001c", "BqP;f-H`!fvm9\u0001\u001c", "1sg", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001dU\r-;\u0001}*\\F\u001ek;)\u0015u !\u0003r9R\n\u0006GJX4g\\\u0001A#\u0016d\u0017,5\u0016\u0014YT3D", "2dV?X,LB#kv]0x\u0012=", "2dV?X,L", "2dc2e4B\\\u0015\b\n", ";`c?\\?", "7me2e:>", "7rI2e6", "", ExifInterface.GPS_MEASUREMENT_2D, ";t[A\\7Eg|\b\nh", "=tc", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, ";t[A\\7Eg\n~xm6\neCM{7\tD\u0014", "D", "@dbB_;", "@db2g\u0010=S\"\u000e~m@d\u0005>r\u0004;", "@nd;W\u001bH!\u0004\u0006v\\,\u000b", "<", "BqP;f7Ha\u0019", "D22<`)B\\\u0019", "/RR._,", "0RR._,", "D22?b:L", "D23<g", "D2;2a.MV", "D2=<e4:Z\u001d\u0014z", "DdRAb9", "<na:", "\u001b`c?\\?\u001dS\u0017\t\u0003i6\u000b\r>i\n1YJ\n&\u0017Z~", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class MatrixMathHelper {
    private static final double EPSILON = 1.0E-5d;
    public static final MatrixMathHelper INSTANCE = new MatrixMathHelper();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001c6B\u0005%4\u0012\u0006\u0007nj?0Jy^\u008cp\\Z\u000f\u001azl#ddtٴ?U(}j\r]U\u007fg\u001dR+\u001bQ\u0010\u001e\u0016'lbM\u0014|4ܐ\u001b̓FoG\u074c\u001e\u007fK<xtd\u0007V6`<Pږ\rʀ.H\u0018͌KSY\u0010*0nrpVKQ[܍\u001eĂB \tȦ-w\\;`l\f<e'Am\u0019ÿ3ۢ4|Uε\u0017d5\u0013\u000faL-v;s\u0019{ٍ\u000f\u07baV[GšӳuG"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001dU\r-;\u0001}*\\F\u001ek;)\u0015u !\u0003r9R\n\u0006GJX4g\\\u0001A#\u0016d\u0017,5\u0016\u0014YT3D", "", "u(E", ">da@c,<b\u001d\u0010z", "", "@nc.g0H\\w~|k,|\u0017", "AbP9X", "AjTD", "BqP;f3:b\u001d\t\u0004", "@db2g", "", "\u0011n\\=T5B]\"", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static class MatrixDecompositionContext {
        private static final Companion Companion = new Companion(null);
        public double[] perspective = new double[4];
        public double[] scale = new double[3];
        public double[] skew = new double[3];
        public double[] translation = new double[3];
        public double[] rotationDegrees = new double[3];

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\":#\u007fјlʔ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:QIV2}P\u000b\u007fRuj\u0007J\t\u000f\n\u000fَ\u001a}"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001dU\r-;\u0001}*\\F\u001ek;)\u0015u !\u0003r9R\n\u0006GJX4g\\\u0001A#\u0016d\u0017,5\u0016\u0014YT3-\"A'\u0013(R\u0006EqV", "", "u(E", "@db2g\bK`\u0015\u0013", "", "/qa", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void resetArray(double[] dArr) {
                int length = dArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    dArr[i2] = 0.0d;
                }
            }
        }

        public final void reset() {
            Companion companion = Companion;
            companion.resetArray(this.perspective);
            companion.resetArray(this.scale);
            companion.resetArray(this.skew);
            companion.resetArray(this.translation);
            companion.resetArray(this.rotationDegrees);
        }
    }

    private MatrixMathHelper() {
    }

    @JvmStatic
    public static final void applyPerspective(double[] m2, double d2) {
        Intrinsics.checkNotNullParameter(m2, "m");
        m2[11] = ((double) (-1)) / d2;
    }

    @JvmStatic
    public static final void applyRotateX(double[] m2, double d2) {
        Intrinsics.checkNotNullParameter(m2, "m");
        m2[5] = Math.cos(d2);
        m2[6] = Math.sin(d2);
        m2[9] = -Math.sin(d2);
        m2[10] = Math.cos(d2);
    }

    @JvmStatic
    public static final void applyRotateY(double[] m2, double d2) {
        Intrinsics.checkNotNullParameter(m2, "m");
        m2[0] = Math.cos(d2);
        m2[2] = -Math.sin(d2);
        m2[8] = Math.sin(d2);
        m2[10] = Math.cos(d2);
    }

    @JvmStatic
    public static final void applyRotateZ(double[] m2, double d2) {
        Intrinsics.checkNotNullParameter(m2, "m");
        m2[0] = Math.cos(d2);
        m2[1] = Math.sin(d2);
        m2[4] = -Math.sin(d2);
        m2[5] = Math.cos(d2);
    }

    @JvmStatic
    public static final void applyScaleX(double[] m2, double d2) {
        Intrinsics.checkNotNullParameter(m2, "m");
        m2[0] = d2;
    }

    @JvmStatic
    public static final void applyScaleY(double[] m2, double d2) {
        Intrinsics.checkNotNullParameter(m2, "m");
        m2[5] = d2;
    }

    @JvmStatic
    public static final void applySkewX(double[] m2, double d2) {
        Intrinsics.checkNotNullParameter(m2, "m");
        m2[4] = Math.tan(d2);
    }

    @JvmStatic
    public static final void applySkewY(double[] m2, double d2) {
        Intrinsics.checkNotNullParameter(m2, "m");
        m2[1] = Math.tan(d2);
    }

    @JvmStatic
    public static final void applyTranslate2D(double[] m2, double d2, double d3) {
        Intrinsics.checkNotNullParameter(m2, "m");
        m2[12] = d2;
        m2[13] = d3;
    }

    @JvmStatic
    public static final void applyTranslate3D(double[] m2, double d2, double d3, double d4) {
        Intrinsics.checkNotNullParameter(m2, "m");
        m2[12] = d2;
        m2[13] = d3;
        m2[14] = d4;
    }

    @JvmStatic
    public static final double[] createIdentityMatrix() {
        double[] dArr = new double[16];
        resetIdentityMatrix(dArr);
        return dArr;
    }

    @JvmStatic
    public static final void decomposeMatrix(double[] transformMatrix, MatrixDecompositionContext ctx) {
        Intrinsics.checkNotNullParameter(transformMatrix, "transformMatrix");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Assertions.assertCondition(transformMatrix.length == 16);
        double[] dArr = ctx.perspective;
        double[] dArr2 = ctx.scale;
        double[] dArr3 = ctx.skew;
        double[] dArr4 = ctx.translation;
        double[] dArr5 = ctx.rotationDegrees;
        if (INSTANCE.isZero(transformMatrix[15])) {
            return;
        }
        double[][] dArr6 = new double[4][];
        for (int i2 = 0; i2 < 4; i2++) {
            dArr6[i2] = new double[4];
        }
        double[] dArr7 = new double[16];
        for (int i3 = 0; i3 < 4; i3++) {
            for (int i4 = 0; i4 < 4; i4++) {
                int i5 = (i3 * 4) + i4;
                double d2 = transformMatrix[i5] / transformMatrix[15];
                dArr6[i3][i4] = d2;
                if (i4 == 3) {
                    d2 = 0.0d;
                }
                dArr7[i5] = d2;
            }
        }
        dArr7[15] = 1.0d;
        MatrixMathHelper matrixMathHelper = INSTANCE;
        if (matrixMathHelper.isZero(determinant(dArr7))) {
            return;
        }
        if (matrixMathHelper.isZero(dArr6[0][3]) && matrixMathHelper.isZero(dArr6[1][3]) && matrixMathHelper.isZero(dArr6[2][3])) {
            dArr[2] = 0.0d;
            dArr[1] = 0.0d;
            dArr[0] = 0.0d;
            dArr[3] = 1.0d;
        } else {
            multiplyVectorByMatrix(new double[]{dArr6[0][3], dArr6[1][3], dArr6[2][3], dArr6[3][3]}, transpose(inverse(dArr7)), dArr);
        }
        for (int i6 = 0; i6 < 3; i6++) {
            dArr4[i6] = dArr6[3][i6];
        }
        double[][] dArr8 = new double[3][];
        for (int i7 = 0; i7 < 3; i7++) {
            dArr8[i7] = new double[3];
        }
        for (int i8 = 0; i8 < 3; i8++) {
            double[] dArr9 = dArr8[i8];
            double[] dArr10 = dArr6[i8];
            dArr9[0] = dArr10[0];
            dArr9[1] = dArr10[1];
            dArr9[2] = dArr10[2];
        }
        double dV3Length = v3Length(dArr8[0]);
        dArr2[0] = dV3Length;
        double[] dArrV3Normalize = v3Normalize(dArr8[0], dV3Length);
        dArr8[0] = dArrV3Normalize;
        double dV3Dot = v3Dot(dArrV3Normalize, dArr8[1]);
        dArr3[0] = dV3Dot;
        double[] dArrV3Combine = v3Combine(dArr8[1], dArr8[0], 1.0d, -dV3Dot);
        dArr8[1] = dArrV3Combine;
        double dV3Length2 = v3Length(dArrV3Combine);
        dArr2[1] = dV3Length2;
        dArr8[1] = v3Normalize(dArr8[1], dV3Length2);
        dArr3[0] = dArr3[0] / dArr2[1];
        double dV3Dot2 = v3Dot(dArr8[0], dArr8[2]);
        dArr3[1] = dV3Dot2;
        double[] dArrV3Combine2 = v3Combine(dArr8[2], dArr8[0], 1.0d, -dV3Dot2);
        dArr8[2] = dArrV3Combine2;
        double dV3Dot3 = v3Dot(dArr8[1], dArrV3Combine2);
        dArr3[2] = dV3Dot3;
        double[] dArrV3Combine3 = v3Combine(dArr8[2], dArr8[1], 1.0d, -dV3Dot3);
        dArr8[2] = dArrV3Combine3;
        double dV3Length3 = v3Length(dArrV3Combine3);
        dArr2[2] = dV3Length3;
        double[] dArrV3Normalize2 = v3Normalize(dArr8[2], dV3Length3);
        dArr8[2] = dArrV3Normalize2;
        double d3 = dArr3[1];
        double d4 = dArr2[2];
        dArr3[1] = d3 / d4;
        dArr3[2] = dArr3[2] / d4;
        if (v3Dot(dArr8[0], v3Cross(dArr8[1], dArrV3Normalize2)) < 0.0d) {
            for (int i9 = 0; i9 < 3; i9++) {
                dArr2[i9] = dArr2[i9] * (-1.0d);
                double[] dArr11 = dArr8[i9];
                dArr11[0] = dArr11[0] * (-1.0d);
                dArr11[1] = dArr11[1] * (-1.0d);
                dArr11[2] = dArr11[2] * (-1.0d);
            }
        }
        double[] dArr12 = dArr8[2];
        dArr5[0] = roundTo3Places((-Math.atan2(dArr12[1], dArr12[2])) * 57.29577951308232d);
        double[] dArr13 = dArr8[2];
        double d5 = -dArr13[0];
        double d6 = dArr13[1];
        double d7 = dArr13[2];
        dArr5[1] = roundTo3Places((-Math.atan2(d5, Math.sqrt((d6 * d6) + (d7 * d7)))) * 57.29577951308232d);
        dArr5[2] = roundTo3Places((-Math.atan2(dArr8[1][0], dArr8[0][0])) * 57.29577951308232d);
    }

    @JvmStatic
    public static final double degreesToRadians(double d2) {
        return (d2 * 3.141592653589793d) / ((double) 180);
    }

    @JvmStatic
    public static final double determinant(double[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        double d2 = matrix[0];
        double d3 = matrix[1];
        double d4 = matrix[2];
        double d5 = matrix[3];
        double d6 = matrix[4];
        double d7 = matrix[5];
        double d8 = matrix[6];
        double d9 = matrix[7];
        double d10 = matrix[8];
        double d11 = matrix[9];
        double d12 = matrix[10];
        double d13 = matrix[11];
        double d14 = matrix[12];
        double d15 = matrix[13];
        double d16 = matrix[14];
        double d17 = matrix[15];
        double d18 = d5 * d8;
        double d19 = d4 * d9;
        double d20 = d5 * d7;
        double d21 = d3 * d9;
        double d22 = d4 * d7;
        double d23 = d3 * d8;
        double d24 = d5 * d6;
        double d25 = d9 * d2;
        double d26 = d4 * d6;
        double d27 = d8 * d2;
        double d28 = d3 * d6;
        double d29 = d2 * d7;
        return ((((((((((((((((((((((((d18 * d11) * d14) - ((d19 * d11) * d14)) - ((d20 * d12) * d14)) + ((d21 * d12) * d14)) + ((d22 * d13) * d14)) - ((d23 * d13) * d14)) - ((d18 * d10) * d15)) + ((d19 * d10) * d15)) + ((d24 * d12) * d15)) - ((d25 * d12) * d15)) - ((d26 * d13) * d15)) + ((d27 * d13) * d15)) + ((d20 * d10) * d16)) - ((d21 * d10) * d16)) - ((d24 * d11) * d16)) + ((d25 * d11) * d16)) + ((d28 * d13) * d16)) - ((d13 * d29) * d16)) - ((d22 * d10) * d17)) + ((d23 * d10) * d17)) + ((d26 * d11) * d17)) - ((d27 * d11) * d17)) - ((d28 * d12) * d17)) + (d29 * d12 * d17);
    }

    @JvmStatic
    public static final double[] inverse(double[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        MatrixMathHelper matrixMathHelper = INSTANCE;
        double dDeterminant = determinant(matrix);
        if (matrixMathHelper.isZero(dDeterminant)) {
            return matrix;
        }
        double d2 = matrix[0];
        double d3 = matrix[1];
        double d4 = matrix[2];
        double d5 = matrix[3];
        double d6 = matrix[4];
        double d7 = matrix[5];
        double d8 = matrix[6];
        double d9 = matrix[7];
        double d10 = matrix[8];
        double d11 = matrix[9];
        double d12 = matrix[10];
        double d13 = matrix[11];
        double d14 = matrix[12];
        double d15 = matrix[13];
        double d16 = matrix[14];
        double d17 = matrix[15];
        double d18 = d8 * d13;
        double d19 = d9 * d12;
        double d20 = d9 * d11;
        double d21 = d7 * d13;
        double d22 = d8 * d11;
        double d23 = d7 * d12;
        double d24 = d5 * d12;
        double d25 = d4 * d13;
        double d26 = d5 * d11;
        double d27 = d3 * d13;
        double d28 = d4 * d11;
        double d29 = d3 * d12;
        double d30 = d4 * d9;
        double d31 = d5 * d8;
        double d32 = d5 * d7;
        double d33 = d3 * d9;
        double d34 = d4 * d7;
        double d35 = d3 * d8;
        double d36 = d9 * d10;
        double d37 = d6 * d13;
        double d38 = d8 * d10;
        double d39 = d6 * d12;
        double d40 = ((((((d19 * d14) - (d18 * d14)) - (d36 * d16)) + (d37 * d16)) + (d38 * d17)) - (d39 * d17)) / dDeterminant;
        double d41 = d5 * d10;
        double d42 = ((d25 * d14) - (d24 * d14)) + (d41 * d16);
        double d43 = d2 * d13;
        double d44 = d4 * d10;
        double d45 = d2 * d12;
        double d46 = d5 * d6;
        double d47 = d9 * d2;
        double d48 = d4 * d6;
        double d49 = d8 * d2;
        double d50 = ((((((d31 * d14) - (d30 * d14)) - (d46 * d16)) + (d47 * d16)) + (d48 * d17)) - (d49 * d17)) / dDeterminant;
        double d51 = ((((((d30 * d10) - (d31 * d10)) + (d46 * d12)) - (d47 * d12)) - (d48 * d13)) + (d49 * d13)) / dDeterminant;
        double d52 = d7 * d10;
        double d53 = ((((d21 * d14) - (d20 * d14)) + (d36 * d15)) - (d37 * d15)) - (d52 * d17);
        double d54 = d6 * d11;
        double d55 = d3 * d10;
        double d56 = (((d26 * d14) - (d27 * d14)) - (d41 * d15)) + (d43 * d15) + (d55 * d17);
        double d57 = d2 * d11;
        double d58 = d3 * d6;
        double d59 = d2 * d7;
        return new double[]{((((((d18 * d15) - (d19 * d15)) + (d20 * d16)) - (d21 * d16)) - (d22 * d17)) + (d23 * d17)) / dDeterminant, ((((((d24 * d15) - (d25 * d15)) - (d26 * d16)) + (d27 * d16)) + (d28 * d17)) - (d29 * d17)) / dDeterminant, ((((((d30 * d15) - (d31 * d15)) + (d32 * d16)) - (d33 * d16)) - (d34 * d17)) + (d35 * d17)) / dDeterminant, ((((((d31 * d11) - (d30 * d11)) - (d32 * d12)) + (d33 * d12)) + (d34 * d13)) - (d35 * d13)) / dDeterminant, d40, (((d42 - (d43 * d16)) - (d44 * d17)) + (d45 * d17)) / dDeterminant, d50, d51, (d53 + (d54 * d17)) / dDeterminant, (d56 - (d57 * d17)) / dDeterminant, ((((((d33 * d14) - (d32 * d14)) + (d46 * d15)) - (d47 * d15)) - (d58 * d17)) + (d17 * d59)) / dDeterminant, ((((((d32 * d10) - (d33 * d10)) - (d46 * d11)) + (d47 * d11)) + (d58 * d13)) - (d13 * d59)) / dDeterminant, ((((((d22 * d14) - (d23 * d14)) - (d38 * d15)) + (d39 * d15)) + (d52 * d16)) - (d54 * d16)) / dDeterminant, ((((((d29 * d14) - (d28 * d14)) + (d44 * d15)) - (d45 * d15)) - (d55 * d16)) + (d57 * d16)) / dDeterminant, ((((((d34 * d14) - (d14 * d35)) - (d48 * d15)) + (d15 * d49)) + (d58 * d16)) - (d16 * d59)) / dDeterminant, ((((((d35 * d10) - (d34 * d10)) + (d48 * d11)) - (d49 * d11)) - (d58 * d12)) + (d59 * d12)) / dDeterminant};
    }

    private final boolean isZero(double d2) {
        return !Double.isNaN(d2) && Math.abs(d2) < 1.0E-5d;
    }

    @JvmStatic
    public static final void multiplyInto(double[] out, double[] a2, double[] b2) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        double d2 = a2[0];
        double d3 = a2[1];
        double d4 = a2[2];
        double d5 = a2[3];
        double d6 = a2[4];
        double d7 = a2[5];
        double d8 = a2[6];
        double d9 = a2[7];
        double d10 = a2[8];
        double d11 = a2[9];
        double d12 = a2[10];
        double d13 = a2[11];
        double d14 = a2[12];
        double d15 = a2[13];
        double d16 = a2[14];
        double d17 = a2[15];
        double d18 = b2[0];
        double d19 = b2[1];
        double d20 = b2[2];
        double d21 = b2[3];
        out[0] = (d18 * d2) + (d19 * d6) + (d20 * d10) + (d21 * d14);
        out[1] = (d18 * d3) + (d19 * d7) + (d20 * d11) + (d21 * d15);
        out[2] = (d18 * d4) + (d19 * d8) + (d20 * d12) + (d21 * d16);
        out[3] = (d18 * d5) + (d19 * d9) + (d20 * d13) + (d21 * d17);
        double d22 = b2[4];
        double d23 = b2[5];
        double d24 = b2[6];
        double d25 = b2[7];
        out[4] = (d22 * d2) + (d23 * d6) + (d24 * d10) + (d25 * d14);
        out[5] = (d22 * d3) + (d23 * d7) + (d24 * d11) + (d25 * d15);
        out[6] = (d22 * d4) + (d23 * d8) + (d24 * d12) + (d25 * d16);
        out[7] = (d22 * d5) + (d23 * d9) + (d24 * d13) + (d25 * d17);
        double d26 = b2[8];
        double d27 = b2[9];
        double d28 = b2[10];
        double d29 = b2[11];
        out[8] = (d26 * d2) + (d27 * d6) + (d28 * d10) + (d29 * d14);
        out[9] = (d26 * d3) + (d27 * d7) + (d28 * d11) + (d29 * d15);
        out[10] = (d26 * d4) + (d27 * d8) + (d28 * d12) + (d29 * d16);
        out[11] = (d26 * d5) + (d27 * d9) + (d28 * d13) + (d29 * d17);
        double d30 = b2[12];
        double d31 = b2[13];
        double d32 = b2[14];
        double d33 = b2[15];
        out[12] = (d2 * d30) + (d6 * d31) + (d10 * d32) + (d14 * d33);
        out[13] = (d3 * d30) + (d7 * d31) + (d11 * d32) + (d15 * d33);
        out[14] = (d4 * d30) + (d8 * d31) + (d12 * d32) + (d16 * d33);
        out[15] = (d30 * d5) + (d31 * d9) + (d32 * d13) + (d33 * d17);
    }

    @JvmStatic
    public static final void multiplyVectorByMatrix(double[] v2, double[] m2, double[] result) {
        Intrinsics.checkNotNullParameter(v2, "v");
        Intrinsics.checkNotNullParameter(m2, "m");
        Intrinsics.checkNotNullParameter(result, "result");
        double d2 = v2[0];
        double d3 = v2[1];
        double d4 = v2[2];
        double d5 = v2[3];
        result[0] = (m2[0] * d2) + (m2[4] * d3) + (m2[8] * d4) + (m2[12] * d5);
        result[1] = (m2[1] * d2) + (m2[5] * d3) + (m2[9] * d4) + (m2[13] * d5);
        result[2] = (m2[2] * d2) + (m2[6] * d3) + (m2[10] * d4) + (m2[14] * d5);
        result[3] = (d2 * m2[3]) + (d3 * m2[7]) + (d4 * m2[11]) + (d5 * m2[15]);
    }

    @JvmStatic
    public static final void resetIdentityMatrix(double[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        matrix[14] = 0.0d;
        matrix[13] = 0.0d;
        matrix[12] = 0.0d;
        matrix[11] = 0.0d;
        matrix[9] = 0.0d;
        matrix[8] = 0.0d;
        matrix[7] = 0.0d;
        matrix[6] = 0.0d;
        matrix[4] = 0.0d;
        matrix[3] = 0.0d;
        matrix[2] = 0.0d;
        matrix[1] = 0.0d;
        matrix[15] = 1.0d;
        matrix[10] = 1.0d;
        matrix[5] = 1.0d;
        matrix[0] = 1.0d;
    }

    @JvmStatic
    public static final double roundTo3Places(double d2) {
        return Math.round(d2 * 1000.0d) * 0.001d;
    }

    @JvmStatic
    public static final double[] transpose(double[] m2) {
        Intrinsics.checkNotNullParameter(m2, "m");
        return new double[]{m2[0], m2[4], m2[8], m2[12], m2[1], m2[5], m2[9], m2[13], m2[2], m2[6], m2[10], m2[14], m2[3], m2[7], m2[11], m2[15]};
    }

    @JvmStatic
    public static final double[] v3Combine(double[] a2, double[] b2, double d2, double d3) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        return new double[]{(a2[0] * d2) + (b2[0] * d3), (a2[1] * d2) + (b2[1] * d3), (d2 * a2[2]) + (d3 * b2[2])};
    }

    @JvmStatic
    public static final double[] v3Cross(double[] a2, double[] b2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        double d2 = a2[1];
        double d3 = b2[2];
        double d4 = a2[2];
        double d5 = b2[1];
        double d6 = b2[0];
        double d7 = a2[0];
        return new double[]{(d2 * d3) - (d4 * d5), (d4 * d6) - (d3 * d7), (d7 * d5) - (d2 * d6)};
    }

    @JvmStatic
    public static final double v3Dot(double[] a2, double[] b2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        return (a2[0] * b2[0]) + (a2[1] * b2[1]) + (a2[2] * b2[2]);
    }

    @JvmStatic
    public static final double v3Length(double[] a2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        double d2 = a2[0];
        double d3 = a2[1];
        double d4 = (d2 * d2) + (d3 * d3);
        double d5 = a2[2];
        return Math.sqrt(d4 + (d5 * d5));
    }

    @JvmStatic
    public static final double[] v3Normalize(double[] vector, double d2) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        double d3 = 1;
        if (INSTANCE.isZero(d2)) {
            d2 = v3Length(vector);
        }
        double d4 = d3 / d2;
        return new double[]{vector[0] * d4, vector[1] * d4, vector[2] * d4};
    }

    public final void applyScaleZ(double[] m2, double d2) {
        Intrinsics.checkNotNullParameter(m2, "m");
        m2[10] = d2;
    }
}
