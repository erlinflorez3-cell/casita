package androidx.compose.ui.graphics;

import androidx.collection.FloatFloatPair;
import androidx.compose.ui.graphics.PathSegment;
import androidx.compose.ui.util.MathHelpersKt;
import com.dynatrace.android.agent.AdkSettings;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
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
/* JADX INFO: compiled from: Bezier.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d̉=!,m\bӵLc\u0003\tI\u00066\u000b6B\u0015\"4\u0012}\u0010njO0LeN1ZS8!sڔ<$i*yCAy\"}0\u0012WNmvvJh\u000bK\u000f\f\u001d\u0011y:Vmx\f\u0013?6P}W3{p\u0004ʣf\rs\u0013/J\"f\n5\u0005(;`\u0010%{sO\u001a$H@\u001f;\u0003\u0011[\u00182\u00124?P\u0005,p\u007fNdI\u001daHD;\u0003\u0018X~-e0\u000bd%F\u0003?S{Ґ\"+NPM:3m\u001b\u0007\u0001ko\u0007M\rU\u0005\u0017+W/W\to6\u0007\u0016D\u001b1O\u001bt\u000b&\u000b\u001d\u0018eВ++]\u007fcu\u001cE\u0010z*\u001dl\b\u001c!?H\\1Jj\u0016#Kt!ipV\b^P\u0017\u0013ad/kĮĴ/9)\u0003i(I7f7*\u0006=\"1 \u0007!\nU>d#;lw\u007f2\u0002DKif\n\b>\u001e\b~\u0005\u001a*21w\u0004=\u001f).E&g_GG9k0Itk\u0005*xh\u0002j\u0003LNH\u0007\u0016e+Oȱrbr,\u0004P\u0003p\\\u0015[Dl\u0007,\u001eC$j!T!S&~Sv\u0014\u0003M\f k/~eg\u001a\u0004\u000e\u0006Q\u000f7C}{\u0010\u0010h'\u0018Miz\u0005\u0007grW\u001a\tt(P3xn\u001e'\u0014D|\"C6M\"44ZG_¢-f\u0011OZA+\n\u0010^vB\u0017Ta%3m2(!\u0001~]!su-a,+ah2Y\u007fCJ>UPid\u00011<\u0017s.H\u0018PU~\u0005\u0016$V,$$MQQ]>C\u0013\r_J\u0002[F|vs\u0006e\u0012U{Cy'Yve\u007f\b\u0019q\\dx[gTE#'b\u00015 d.z\u0012J\t{{T9\\\u0005I\u000b)gtf8+\u0006O\"36\b\"+6]G5O.wB0Eek\u001d\b.(c?*\u0003\u001a\u001c,\u0012\u00176bis@tPI\b\u007fn&2\b\u001bBvn(\fP=L\raI\bd\tlF\b#/,g70\u001b\fn[h\u0017 \u0002Bbw*\"DD\u0019vY3LeS\u0016\u0006\u001eOj3b\u000f8!,5|N4=Nl\u001eb!V\u0014106oS\u0013\tJ$<4Z@8\u000fQ\u0013\u0002\u0006>:0Jm$/2p\nkZ\u001ck\u0011\\\u0005`K`]\u0007/j\u0019~=4N|Cf\u001dmtU_g@3k\u001d7\u001c\u001bS\r\u001a=+rUi\u001f6\u000f\u0019\u000bs^\nN\u001aM\u0012\tAm\u001ap<<&25BF\u001ciU\u001f\u0012\u000f0\r\f\u001çT|\u0015 )jNP*/~\u000bCT\n=\fIS\u0001\"z-zO(;QM\u0019\u0017r*M\f\u0015yT^E\u0006c.mMx/?{\u0006Wk\u0002\u0016d8'2ugao7tOu\u001bh.\"\u001ap7!\u0013~!42X'\u000b\n\\\tfS\u0010H\u001a\u0013\ro\u001c}'@5B\u0005\u0006pc/ǐ\u0010{\u001dq5m\u000b1~aZ\b$EPK\nWQ<EpZh\u0012\u0004$fD\u0018\u0014C'O:\u0016wA\u0010}y\u0019vqOi$C/\u001aB(1Hp,E7y$CZX65SV{?\u0015\rj\u000fZW<_\u001b,r\u0019$)B}EHv/!|^rL|_;'Ks\ruv7\bSv>!_So\u001fE`#oVwWܛR\t\u0003IBB7\u000b0k:Y^Tk0W]28|\u0003Tcu<P5D\u0011<\u0012_^FNV\\H\u001d\u0002QKo'\\\u0019\u0015f\u001e \u000b'a\u0003Q\u0002;Z\u0005\u000bK%?(I\u001c>\u0002d\u000b#]\u0010 \u001fe\u0015S%cf|+\u001a2}J-c*V'w:\u0016MEL\u0012\u0006D\u000eW7$R\u001c&'\u000enIHXu#@n\"eR>*d\u0007t'U\u0019\u0011s8B\u001a\u001c\u0002\u0012sabB+\u0018'rV*[m7I[8\u0012\u000br#u\u0018E?\u001e)a-CӘg N{ar{\u0001\raJe\f\u0004hH\u0012:\b\u001bXYX\u001e]\u0016b\r\u0003j\u001cg\u0010\u0014Ff%\r2\u0010aVn4x\u001dF(\u0012v^TjNeA\u0011\\p\u001321FB:!6\u001a<q/\u0002,`\u0011\u0019!g_soHXV\u00147+gs%4&\u0018nUlmq\u0007>i7\u0019\u001cbXcf#\u0005m?Y<C\u0015.\u0003[2UdV\u001aXY6\u0012Sy`\u0010r\u000ft,{GH0~\u0017!Cu\u0014*wUUC%'2\u00116\fh\u001f\u0005OW\u001dQ\u001cƫ3\u0011\u0015\u0011hY\u0019AJFSg3Sw\u001b\u000bV{6]\u0010ʑ\u0003\u000eU\u001eµyJO.\\ܝ\u0002ϸOl^̮_%e?\u0017\fN(zʪeۄfg\u001bث..m\u0005d6\u0005(\u001fÄ,̗jBrؽ\u001b\u000b\u001a1$8\u0004\u0007e\u0006?fRu\u0012ܭBڝ2t!IUo\n0\u0006\u0006t{qMs,\u001e\u0019l5(Q:ٗa֟rUtZD\u001fe,`*\u0010#5&\u0010|p)^\u001b\f܃mAԗVǞ\u0015]Lm6n\bx\u0007{LnV<vmAf}\u0002QѭD9ľb\u0382LE(dr85<ƛns"}, d2 = {"\u0013ob6_6G", "", "\u0014k^.g\fIa\u001d\u0006\u0005g", "", "\"`d", "3mS%", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#%m\u00186MLJA", "5dc\u0012a+1", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:[\u00160UCDz\nau", "3mS&", "5dc\u0012a+2", "AsP?g\u001f", "5dc g(Kb\f", "AsP?g ", "5dc g(Kb\r", "1kP:c\u001d:Z\u001d}gh6\fl8U\t,\u000b-| \u0019G", "@", "1n\\=h;>1){~\\\u001d|\u0016>i}$\u0003\u001d\u000b' F}", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\na\u001e!C~nC\u0001!DDy$DC", ">/h", ">0h", ">1h", ">2h", "@n^Af", "", "7mS2k", "", "uE5\u00139\"\u001f7\\c", "1n\\=h;>6#\f~s6\u0006\u0018+l\\2\fI\u007f%", "AdV:X5M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:[\u00160UCDz\n\u0014uL%\u001e", "1n\\=h;>D\u0019\f\nb*x\u0010\fo\u00101zN", "1tQ6V\bKS\u0015", "F/", "G/", "F0", "G0", "F1", "G1", "F2", "G2", "1tQ6V\u001bH;#\b\u0005m6\u0006\r-C\u0010%\u007f>\u000f", "1tQ6V", "2rc", "Bl_\u001fb6M", "1tQ6V\u001eB\\\u0018\u0003\u0004`", ">nX;g:", "F", "G", "Bl_\u0010h)BQ'", "Bl_\u001fb6Ma", "3uP9h(MSv\u000fwb*", ">0", ">1", "B", ">/", ">2", "3uP9h(MS\u007f\u0003\u0004^", "3uP9h(MS\u0005\u000fv]9x\u00183c", "3uP9h(MS\f", "3uP9h(MS\r", "4h]16<;W\u0017^\u000em9|\u0011+Y", "2rc\u001fb6Ma", "4h]17,KW*z\nb=|u9o\u000f6", "6na6m6Gb\u0015\u0006", "", "4h]190Ka(\\\u000b[0zu9o\u000f", "4h]190Ka(e~g,i\u00139t", "4h]190Ka(j\u000bZ+\n\u0005>i}\u0015\u0006J\u0010", "4h]190Ka(k\u0005h;", "4qP0g0H\\", "4h]1?0GS\u0006\t\u0005m", "4h]1D<:R&z\nb*i\u00139t\u000e", "7r@BT+KO(\u0003xF6\u0006\u0013>o\t,y", ":h]2J0GR\u001d\b|", ";n]<g6GW\u0017\\\u000b[0zz3n~,\u0005B", "=eU@X;", ";n]<g6GW\u0017j\u000bZ+\n\u0005>i}\u001a\u007fI\u007f\u001b I", "?tP1e(MW\u0017m\u0005F6\u0006\u0013>o\t,y,\u0011\u0013\u0016Tk\u001d@t3", "?tP1e(MW\u0017", "?tP1e(MW\u0017p~g+\u0001\u00121", "Bl_\u001eh(=`\u0015\u000e~\\:", "Ao[6g\nNP\u001d|Vm", "", "AqR", "AqR\u001cY-LS(", "2rc\u001cY-LS(", "Ao[6g\u0018NO\u0018\fvm0zd>", "CmXA70OW\u0018~", "EqXAX\u001d:Z\u001d}gh6\fl8U\t,\u000b-| \u0019G", "1k^@X\u001bH", AdkSettings.PLATFORM_TYPE_MOBILE, "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BezierKt {
    private static final double Epsilon = 1.0E-7d;
    private static final float FloatEpsilon = 8.34465E-7f;
    private static final double Tau = 6.283185307179586d;

    /* JADX INFO: compiled from: Bezier.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Move.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Conic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PathSegment.Type.Close.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PathSegment.Type.Done.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x000b, code lost:
    
        if (r3 >= (-8.34465E-7f)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x000e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x001a, code lost:
    
        if (r3 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final float clampValidRootInUnitRange(float r3) {
        /*
            r2 = 0
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 >= 0) goto Lf
            r0 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L1d
        Ld:
            r3 = r2
        Le:
            return r3
        Lf:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto Le
            r0 = 1065353223(0x3f800007, float:1.0000008)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L1d
            goto Ld
        L1d:
            r3 = r1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.BezierKt.clampValidRootInUnitRange(float):float");
    }

    public static final float cubicArea(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        return ((((((((f9 - f3) * (f4 + f6)) - ((f8 - f2) * (f5 + f7))) + (f5 * (f2 - f6))) - (f4 * (f3 - f7))) + (f9 * (f6 + (f2 / 3.0f)))) - (f8 * (f7 + (f3 / 3.0f)))) * 3.0f) / 20.0f;
    }

    public static final float evaluateCubic(float f2, float f3, float f4) {
        return ((((((f2 - f3) + 0.33333334f) * f4) + (f3 - (2.0f * f2))) * f4) + f2) * 3.0f * f4;
    }

    private static final float evaluateCubic(float f2, float f3, float f4, float f5, float f6) {
        float f7 = (f5 + ((f3 - f4) * 3.0f)) - f2;
        return (((((f7 * f6) + (((f4 - (2.0f * f3)) + f2) * 3.0f)) * f6) + ((f3 - f2) * 3.0f)) * f6) + f2;
    }

    private static final float evaluateLine(float f2, float f3, float f4) {
        return ((f3 - f2) * f4) + f2;
    }

    private static final float evaluateQuadratic(float f2, float f3, float f4, float f5) {
        return (((((f4 - (f3 * 2.0f)) + f2) * f5) + ((f3 - f2) * 2.0f)) * f5) + f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x000e, code lost:
    
        if (r3 >= (-8.34465E-7f)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0011, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x001d, code lost:
    
        if (r3 <= 1.0000008f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final float findFirstLineRoot(float r4, float r5) {
        /*
            float r3 = -r4
            float r5 = r5 - r4
            float r3 = r3 / r5
            r2 = 0
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 >= 0) goto L12
            r0 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L20
        L10:
            r3 = r2
        L11:
            return r3
        L12:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto L11
            r0 = 1065353223(0x3f800007, float:1.0000008)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L20
            goto L10
        L20:
            r3 = r1
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.BezierKt.findFirstLineRoot(float, float):float");
    }

    private static final float unitDivide(float f2, float f3) {
        if (f2 < 0.0f) {
            f2 = -f2;
            f3 = -f3;
        }
        if (f3 == 0.0f || f2 == 0.0f || f2 >= f3) {
            return Float.NaN;
        }
        float f4 = f2 / f3;
        if (f4 == 0.0f) {
            return Float.NaN;
        }
        return f4;
    }

    private static final float evaluateX(PathSegment pathSegment, float f2) {
        float[] points = pathSegment.getPoints();
        switch (WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()]) {
            case 1:
                return points[0];
            case 2:
                return evaluateLine(points[0], points[2], f2);
            case 3:
                return evaluateQuadratic(points[0], points[2], points[4], f2);
            case 4:
            case 6:
            case 7:
                return Float.NaN;
            case 5:
                return evaluateCubic(points[0], points[2], points[4], points[6], f2);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final float evaluateY(PathSegment pathSegment, float f2) {
        float[] points = pathSegment.getPoints();
        switch (WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()]) {
            case 1:
                return points[1];
            case 2:
                return evaluateLine(points[1], points[3], f2);
            case 3:
                return evaluateQuadratic(points[1], points[3], points[5], f2);
            case 4:
            case 6:
            case 7:
                return Float.NaN;
            case 5:
                return evaluateCubic(points[1], points[3], points[5], points[7], f2);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final float findFirstRoot(PathSegment pathSegment, float f2) {
        float[] points = pathSegment.getPoints();
        switch (WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()]) {
            case 1:
            case 4:
            case 6:
            case 7:
                return Float.NaN;
            case 2:
                float f3 = points[0] - f2;
                float f4 = (-f3) / ((points[2] - f2) - f3);
                float f5 = 0.0f;
                if (f4 >= 0.0f) {
                    f5 = 1.0f;
                    if (f4 <= 1.0f) {
                        return f4;
                    }
                    if (f4 > 1.0000008f) {
                        return Float.NaN;
                    }
                } else if (f4 < -8.34465E-7f) {
                    return Float.NaN;
                }
                return f5;
            case 3:
                return findFirstQuadraticRoot(points[0] - f2, points[2] - f2, points[4] - f2);
            case 5:
                return findFirstCubicRoot(points[0] - f2, points[2] - f2, points[4] - f2, points[6] - f2);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final float findFirstQuadraticRoot(float r18, float r19, float r20) {
        /*
            r0 = r18
            double r8 = (double) r0
            r0 = r19
            double r6 = (double) r0
            r0 = r20
            double r4 = (double) r0
            r19 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r17 = r6 * r19
            double r15 = r8 - r17
            double r15 = r15 + r4
            r1 = 0
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            r14 = 1065353223(0x3f800007, float:1.0000008)
            r13 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            r12 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r10 = 2143289344(0x7fc00000, float:NaN)
            if (r0 != 0) goto L45
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L25
            return r10
        L25:
            double r2 = r17 - r4
            double r4 = r4 * r19
            double r17 = r17 - r4
            double r2 = r2 / r17
            float r1 = (float) r2
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L38
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 < 0) goto L41
            r12 = r11
        L37:
            return r12
        L38:
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L43
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 > 0) goto L41
            goto L37
        L41:
            r12 = r10
            goto L37
        L43:
            r12 = r1
            goto L37
        L45:
            double r0 = r6 * r6
            double r4 = r4 * r8
            double r0 = r0 - r4
            double r0 = java.lang.Math.sqrt(r0)
            double r2 = -r0
            double r4 = -r8
            double r4 = r4 + r6
            double r0 = r2 + r4
            double r6 = -r0
            double r6 = r6 / r15
            float r1 = (float) r6
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L65
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 < 0) goto L6f
            r1 = r11
        L5e:
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L71
            return r1
        L65:
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L5e
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 > 0) goto L6f
            r1 = r12
            goto L5e
        L6f:
            r1 = r10
            goto L5e
        L71:
            double r2 = r2 - r4
            double r2 = r2 / r15
            float r1 = (float) r2
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L7e
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 < 0) goto L87
            r12 = r11
        L7d:
            return r12
        L7e:
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L89
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 > 0) goto L87
            goto L7d
        L87:
            r12 = r10
            goto L7d
        L89:
            r12 = r1
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.BezierKt.findFirstQuadraticRoot(float, float, float):float");
    }

    private static final int findLineRoot(float f2, float f3, float[] fArr, int i2) {
        return writeValidRootInUnitRange((-f2) / (f3 - f2), fArr, i2);
    }

    static /* synthetic */ int findLineRoot$default(float f2, float f3, float[] fArr, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return writeValidRootInUnitRange((-f2) / (f3 - f2), fArr, i2);
    }

    static /* synthetic */ int findQuadraticRoots$default(float f2, float f3, float f4, float[] fArr, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 16)) != 0) {
            i2 = 0;
        }
        return findQuadraticRoots(f2, f3, f4, fArr, i2);
    }

    private static final int findQuadraticRoots(float f2, float f3, float f4, float[] fArr, int i2) {
        double d2 = f2;
        double d3 = f3;
        double d4 = f4;
        double d5 = d3 * 2.0d;
        double d6 = (d2 - d5) + d4;
        if (d6 == 0.0d) {
            if (d3 == d4) {
                return 0;
            }
            return writeValidRootInUnitRange((float) ((d5 - d4) / (d5 - (d4 * 2.0d))), fArr, i2);
        }
        double d7 = -Math.sqrt((d3 * d3) - (d4 * d2));
        double d8 = (-d2) + d3;
        int iWriteValidRootInUnitRange = writeValidRootInUnitRange((float) ((-(d7 + d8)) / d6), fArr, i2);
        int iWriteValidRootInUnitRange2 = iWriteValidRootInUnitRange + writeValidRootInUnitRange((float) ((d7 - d8) / d6), fArr, i2 + iWriteValidRootInUnitRange);
        if (iWriteValidRootInUnitRange2 > 1) {
            float f5 = fArr[i2];
            int i3 = i2 + 1;
            float f6 = fArr[i3];
            if (f5 <= f6) {
                return f5 == f6 ? iWriteValidRootInUnitRange2 - 1 : iWriteValidRootInUnitRange2;
            }
            fArr[i2] = f6;
            fArr[i3] = f5;
            return iWriteValidRootInUnitRange2;
        }
        return iWriteValidRootInUnitRange2;
    }

    private static final int findDerivativeRoots(PathSegment pathSegment, boolean z2, float[] fArr, int i2) {
        int i3 = !z2 ? 1 : 0;
        float[] points = pathSegment.getPoints();
        switch (WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 6:
            case 7:
                return 0;
            case 3:
                float f2 = 2;
                float f3 = points[i3 + 2];
                float f4 = (f3 - points[i3]) * f2;
                return writeValidRootInUnitRange((-f4) / ((f2 * (points[i3 + 4] - f3)) - f4), fArr, i2);
            case 5:
                float f5 = points[i3 + 2];
                float f6 = (f5 - points[i3]) * 3.0f;
                float f7 = points[i3 + 4];
                float f8 = (f7 - f5) * 3.0f;
                float f9 = (points[i3 + 6] - f7) * 3.0f;
                int iFindQuadraticRoots = findQuadraticRoots(f6, f8, f9, fArr, i2);
                float f10 = (f8 - f6) * 2.0f;
                return iFindQuadraticRoots + writeValidRootInUnitRange((-f10) / (((f9 - f8) * 2.0f) - f10), fArr, i2 + iFindQuadraticRoots);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ long computeHorizontalBounds$default(PathSegment pathSegment, float[] fArr, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return computeHorizontalBounds(pathSegment, fArr, i2);
    }

    public static final long computeHorizontalBounds(PathSegment pathSegment, float[] fArr, int i2) {
        int iFindDerivativeRoots = findDerivativeRoots(pathSegment, true, fArr, i2);
        float fMin = Math.min(pathSegment.getPoints()[0], getEndX(pathSegment));
        float fMax = Math.max(pathSegment.getPoints()[0], getEndX(pathSegment));
        for (int i3 = 0; i3 < iFindDerivativeRoots; i3++) {
            float fEvaluateX = evaluateX(pathSegment, fArr[i3]);
            fMin = Math.min(fMin, fEvaluateX);
            fMax = Math.max(fMax, fEvaluateX);
        }
        return FloatFloatPair.m349constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeVerticalBounds$default(PathSegment pathSegment, float[] fArr, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
            i2 = 0;
        }
        return computeVerticalBounds(pathSegment, fArr, i2);
    }

    public static final long computeVerticalBounds(PathSegment pathSegment, float[] fArr, int i2) {
        int iFindDerivativeRoots = findDerivativeRoots(pathSegment, false, fArr, i2);
        float fMin = Math.min(pathSegment.getPoints()[1], getEndY(pathSegment));
        float fMax = Math.max(pathSegment.getPoints()[1], getEndY(pathSegment));
        for (int i3 = 0; i3 < iFindDerivativeRoots; i3++) {
            float fEvaluateY = evaluateY(pathSegment, fArr[i3]);
            fMin = Math.min(fMin, fEvaluateY);
            fMax = Math.max(fMax, fEvaluateY);
        }
        return FloatFloatPair.m349constructorimpl(fMin, fMax);
    }

    public static /* synthetic */ long computeCubicVerticalBounds$default(float f2, float f3, float f4, float f5, float[] fArr, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 32)) != 0) {
            i2 = 0;
        }
        return computeCubicVerticalBounds(f2, f3, f4, f5, fArr, i2);
    }

    public static final long computeCubicVerticalBounds(float f2, float f3, float f4, float f5, float[] fArr, int i2) {
        float f6 = (f3 - f2) * 3.0f;
        float f7 = (f4 - f3) * 3.0f;
        float f8 = (f5 - f4) * 3.0f;
        int iFindQuadraticRoots = findQuadraticRoots(f6, f7, f8, fArr, i2);
        float f9 = (f7 - f6) * 2.0f;
        int iWriteValidRootInUnitRange = iFindQuadraticRoots + writeValidRootInUnitRange((-f9) / (((f8 - f7) * 2.0f) - f9), fArr, i2 + iFindQuadraticRoots);
        float fMin = Math.min(f2, f5);
        float fMax = Math.max(f2, f5);
        for (int i3 = 0; i3 < iWriteValidRootInUnitRange; i3++) {
            float fEvaluateCubic = evaluateCubic(f2, f3, f4, f5, fArr[i3]);
            fMin = Math.min(fMin, fEvaluateCubic);
            fMax = Math.max(fMax, fEvaluateCubic);
        }
        return FloatFloatPair.m349constructorimpl(fMin, fMax);
    }

    public static final boolean closeTo(double d2, double d3) {
        return Math.abs(d2 - d3) < Epsilon;
    }

    public static final boolean closeTo(float f2, float f3) {
        return Math.abs(f2 - f3) < FloatEpsilon;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x000d A[PHI: r2
  0x000d: PHI (r2v2 float) = (r2v1 float), (r2v0 float) binds: [B:27:0x0022, B:20:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int writeValidRootInUnitRange(float r3, float[] r4, int r5) {
        /*
            r2 = 0
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 >= 0) goto L17
            r0 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L25
        Ld:
            r3 = r2
        Le:
            r4[r5] = r3
            boolean r0 = java.lang.Float.isNaN(r3)
            r0 = r0 ^ 1
            return r0
        L17:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto Le
            r0 = 1065353223(0x3f800007, float:1.0000008)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L25
            goto Ld
        L25:
            r3 = r1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.BezierKt.writeValidRootInUnitRange(float, float[], int):int");
    }

    public static final int lineWinding(float[] fArr, float f2, float f3) {
        float f4;
        float f5 = fArr[0];
        int i2 = 1;
        float f6 = fArr[1];
        float f7 = fArr[2];
        float f8 = fArr[3];
        float f9 = f8 - f6;
        if (f6 > f8) {
            i2 = -1;
            f4 = f6;
        } else {
            f4 = f8;
            f8 = f6;
        }
        if (f3 < f8 || f3 >= f4) {
            return 0;
        }
        float f10 = ((f7 - f5) * (f3 - f6)) - (f9 * (f2 - f5));
        if (f10 == 0.0f || ((int) Math.signum(f10)) == i2) {
            return 0;
        }
        return i2;
    }

    private static final boolean isQuadraticMonotonic(float f2, float f3, float f4) {
        return !(Math.signum(f2 - f3) + Math.signum(f3 - f4) == 0.0f);
    }

    public static final int quadraticWinding(float[] fArr, float f2, float f3, float[] fArr2, float[] fArr3) {
        if (isQuadraticMonotonic(fArr[1], fArr[3], fArr[5])) {
            return monotonicQuadraticWinding(fArr, 0, f2, f3, fArr3);
        }
        int iQuadraticToMonotonicQuadratics = quadraticToMonotonicQuadratics(fArr, fArr2);
        int iMonotonicQuadraticWinding = monotonicQuadraticWinding(fArr2, 0, f2, f3, fArr3);
        return iQuadraticToMonotonicQuadratics > 0 ? iMonotonicQuadraticWinding + monotonicQuadraticWinding(fArr2, 4, f2, f3, fArr3) : iMonotonicQuadraticWinding;
    }

    private static final int monotonicQuadraticWinding(float[] fArr, int i2, float f2, float f3, float[] fArr2) {
        int i3;
        float f4;
        float f5;
        float fEvaluateQuadratic;
        float f6 = fArr[i2 + 1];
        float f7 = fArr[i2 + 5];
        if (f6 > f7) {
            i3 = -1;
            f5 = f6;
            f4 = f7;
        } else {
            i3 = 1;
            f4 = f6;
            f5 = f7;
        }
        if (f3 < f4 || f3 >= f5) {
            return 0;
        }
        float f8 = fArr[i2 + 3];
        if (findQuadraticRoots$default((f6 - (f8 * 2.0f)) + f7, (f8 - f6) * 2.0f, f6 - f3, fArr2, 0, 16, null) != 0) {
            fEvaluateQuadratic = evaluateQuadratic(fArr[0], fArr[2], fArr[4], fArr2[0]);
        } else {
            fEvaluateQuadratic = fArr[(1 - i3) * 2];
        }
        if ((Math.abs(fEvaluateQuadratic - f2) >= FloatEpsilon || (f2 == fArr[4] && f3 == f7)) && fEvaluateQuadratic < f2) {
            return i3;
        }
        return 0;
    }

    private static final int quadraticToMonotonicQuadratics(float[] fArr, float[] fArr2) {
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[5];
        if (!isQuadraticMonotonic(f2, f3, f4)) {
            float f5 = f2 - f3;
            float fUnitDivide = unitDivide(f5, (f5 - f3) + f4);
            if (!Float.isNaN(fUnitDivide)) {
                splitQuadraticAt(fArr, fArr2, fUnitDivide);
                return 1;
            }
            if (Math.abs(f5) >= Math.abs(f3 - f4)) {
                f2 = f4;
            }
            f3 = f2;
        }
        ArraysKt.copyInto(fArr, fArr2, 0, 0, 6);
        fArr2[3] = f3;
        return 0;
    }

    private static final void splitQuadraticAt(float[] fArr, float[] fArr2, float f2) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = fArr[4];
        float f8 = fArr[5];
        float fLerp = MathHelpersKt.lerp(f3, f5, f2);
        float fLerp2 = MathHelpersKt.lerp(f4, f6, f2);
        fArr2[0] = f3;
        fArr2[1] = f4;
        fArr2[2] = fLerp;
        fArr2[3] = fLerp2;
        float fLerp3 = MathHelpersKt.lerp(f5, f7, f2);
        float fLerp4 = MathHelpersKt.lerp(f6, f8, f2);
        float fLerp5 = MathHelpersKt.lerp(fLerp, fLerp3, f2);
        float fLerp6 = MathHelpersKt.lerp(fLerp2, fLerp4, f2);
        fArr2[4] = fLerp5;
        fArr2[5] = fLerp6;
        fArr2[6] = fLerp3;
        fArr2[7] = fLerp4;
        fArr2[8] = f7;
        fArr2[9] = f8;
    }

    public static final int cubicWinding(float[] fArr, float f2, float f3, float[] fArr2, float[] fArr3) {
        int iCubicToMonotonicCubics = cubicToMonotonicCubics(fArr, fArr2, fArr3);
        int iMonotonicCubicWinding = 0;
        if (iCubicToMonotonicCubics >= 0) {
            int i2 = 0;
            while (true) {
                iMonotonicCubicWinding += monotonicCubicWinding(fArr2, i2 * 6, f2, f3);
                if (i2 == iCubicToMonotonicCubics) {
                    break;
                }
                i2++;
            }
        }
        return iMonotonicCubicWinding;
    }

    private static final int monotonicCubicWinding(float[] fArr, int i2, float f2, float f3) {
        int i3;
        int i4 = i2 + 1;
        float f4 = fArr[i4];
        int i5 = i2 + 7;
        float f5 = fArr[i5];
        if (f4 > f5) {
            i3 = -1;
            f5 = f4;
            f4 = f5;
        } else {
            i3 = 1;
        }
        if (f3 < f4 || f3 >= f5) {
            return 0;
        }
        float f6 = fArr[i2];
        float f7 = fArr[i2 + 2];
        float f8 = fArr[i2 + 4];
        float f9 = fArr[i2 + 6];
        if (f2 < Math.min(f6, Math.min(f7, Math.min(f8, f9)))) {
            return 0;
        }
        if (f2 > Math.max(f6, Math.max(f7, Math.max(f8, f9)))) {
            return i3;
        }
        float f10 = fArr[i4];
        float f11 = fArr[i2 + 3];
        float f12 = fArr[i2 + 5];
        float f13 = fArr[i5];
        float fFindFirstCubicRoot = findFirstCubicRoot(f10 - f3, f11 - f3, f12 - f3, f13 - f3);
        if (Float.isNaN(fFindFirstCubicRoot)) {
            return 0;
        }
        float fEvaluateCubic = evaluateCubic(f6, f7, f8, f9, fFindFirstCubicRoot);
        if ((Math.abs(fEvaluateCubic - f2) >= FloatEpsilon || (f2 == f9 && f3 == f13)) && fEvaluateCubic < f2) {
            return i3;
        }
        return 0;
    }

    private static final int cubicToMonotonicCubics(float[] fArr, float[] fArr2, float[] fArr3) {
        int iFindCubicExtremaY = findCubicExtremaY(fArr, fArr3);
        int i2 = 0;
        if (iFindCubicExtremaY == 0) {
            ArraysKt.copyInto(fArr, fArr2, 0, 0, 8);
        } else {
            int i3 = 0;
            float f2 = 0.0f;
            while (i2 < iFindCubicExtremaY) {
                float f3 = (fArr3[i2] - f2) / (1.0f - f2);
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                f2 = f3 > 1.0f ? 1.0f : f3;
                splitCubicAt(fArr, i3, fArr2, i3, f2);
                i3 += 6;
                i2++;
                fArr = fArr2;
            }
        }
        return iFindCubicExtremaY;
    }

    private static final int findCubicExtremaY(float[] fArr, float[] fArr2) {
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[5];
        return findQuadraticRoots((fArr[7] - f2) + ((f3 - f4) * 3.0f), (((f2 - f3) - f3) - f4) * 2.0f, f3 - f2, fArr2, 0);
    }

    private static final void splitCubicAt(float[] fArr, int i2, float[] fArr2, int i3, float f2) {
        if (f2 >= 1.0f) {
            ArraysKt.copyInto(fArr, fArr2, i3, i2, 8);
            float f3 = fArr[i2 + 6];
            float f4 = fArr[i2 + 7];
            fArr2[i3 + 8] = f3;
            fArr2[i3 + 9] = f4;
            fArr2[i3 + 10] = f3;
            fArr2[i3 + 11] = f4;
            fArr2[i3 + 12] = f3;
            fArr2[i3 + 13] = f4;
            return;
        }
        float f5 = fArr[i2];
        float f6 = fArr[i2 + 1];
        fArr2[i3] = f5;
        fArr2[i3 + 1] = f6;
        float f7 = fArr[i2 + 2];
        float f8 = fArr[i2 + 3];
        float fLerp = MathHelpersKt.lerp(f5, f7, f2);
        float fLerp2 = MathHelpersKt.lerp(f6, f8, f2);
        fArr2[i3 + 2] = fLerp;
        fArr2[i3 + 3] = fLerp2;
        float f9 = fArr[i2 + 4];
        float f10 = fArr[i2 + 5];
        float fLerp3 = MathHelpersKt.lerp(f7, f9, f2);
        float fLerp4 = MathHelpersKt.lerp(f8, f10, f2);
        float fLerp5 = MathHelpersKt.lerp(fLerp, fLerp3, f2);
        float fLerp6 = MathHelpersKt.lerp(fLerp2, fLerp4, f2);
        fArr2[i3 + 4] = fLerp5;
        fArr2[i3 + 5] = fLerp6;
        float f11 = fArr[i2 + 6];
        float f12 = fArr[i2 + 7];
        float fLerp7 = MathHelpersKt.lerp(f9, f11, f2);
        float fLerp8 = MathHelpersKt.lerp(f10, f12, f2);
        float fLerp9 = MathHelpersKt.lerp(fLerp3, fLerp7, f2);
        float fLerp10 = MathHelpersKt.lerp(fLerp4, fLerp8, f2);
        float fLerp11 = MathHelpersKt.lerp(fLerp5, fLerp9, f2);
        float fLerp12 = MathHelpersKt.lerp(fLerp6, fLerp10, f2);
        fArr2[i3 + 6] = fLerp11;
        fArr2[i3 + 7] = fLerp12;
        fArr2[i3 + 8] = fLerp9;
        fArr2[i3 + 9] = fLerp10;
        fArr2[i3 + 10] = fLerp7;
        fArr2[i3 + 11] = fLerp8;
        fArr2[i3 + 12] = f11;
        fArr2[i3 + 13] = f12;
    }

    private static final float getStartX(PathSegment pathSegment) {
        return pathSegment.getPoints()[0];
    }

    private static final float getEndX(PathSegment pathSegment) {
        float[] points = pathSegment.getPoints();
        char c2 = 4;
        switch (WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()]) {
            case 1:
            case 6:
            case 7:
                c2 = 0;
                break;
            case 2:
                c2 = 2;
                break;
            case 3:
            case 4:
                break;
            case 5:
                c2 = 6;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return points[c2];
    }

    private static final float getStartY(PathSegment pathSegment) {
        return pathSegment.getPoints()[1];
    }

    private static final float getEndY(PathSegment pathSegment) {
        float[] points = pathSegment.getPoints();
        char c2 = 5;
        switch (WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()]) {
            case 1:
            case 6:
            case 7:
                c2 = 0;
                break;
            case 2:
                c2 = 3;
                break;
            case 3:
            case 4:
                break;
            case 5:
                c2 = 7;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return points[c2];
    }

    /* JADX WARN: Removed duplicated region for block: B:189:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final float findFirstCubicRoot(float r20, float r21, float r22, float r23) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.BezierKt.findFirstCubicRoot(float, float, float, float):float");
    }
}
