package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: Dp.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯD\u001d̉=!4i\bDZc|\u0004G\t8\u000bDB\u0007\":\u0016\u007f\u0007llA0RjP.XS2\u000fy\u0002<$a%yCQU\"}(\fWNupvJ`CK\u000f\u001c\u0016\u0001j2Um\u0019kE'2pno7[$U9\u000fzf\t.g:8(\u000bG\u001fߋGƵͯ~EQB gX\u0011H\u000b%M3\u001aB\nLP\u0019\u001e\u000bm~:V~u:])InƢMϋۢ4~SFT\f?5\u0005\u001c6+n=e\u00193\u000f\u001b\u0007\u0001ao\u0007M.U\u0005\u0017-W/W1o6\u0007\fZ\u001aܹNՕǁv(bC_ $O9\n{K~\rX{\t7%<2\r6+VjE\u001a\u0015\u0007>7\u00030k@~\u000e%Gʎyʨي\u001b'\u0006s9z3\u000f_\u001cS\u0019|7,\t\u001bY;\u0001\u001d!\fX\u001c\u001d-\u001b\u0003w\u00025_}UH|\u0016 BҠ\u0003͏Ċ\u0006,\nrUAG\u001d\u001fq/%eai'/0\u001aHrm'\tn.ki\u0001N\u0007̖tߤ6ѧÁ\u0010\\J+\u00133huft)MJZ7\u0002\u0016W8\\&BQ)\u001e\u0014gh\u0018p\u0014β\u0010ˑ.ωƠ]pqWe\u0001vPC\u001c{\u0010\u0010X\u001f\u0014mB\u0013\tf2ZS:`#̭(ŮGКݻ{}J\u001b\u001aZJ\\\u007fiL,_\u001f\u0005\u0015v\tNFOK!_\tnVпZו#ѰȐ(v\u000fP^$\t\u0015uIa,+fJ-oWe\u001d4!:hb\u0003S\u000b\rB\u0018G\u0016R\u000eƊrخtɝދ$\u0018 \u000b_nU6\u001dQA203mL!k\u0002W z\u0013\u0003\n\u0011Kh\\m6?7ݡf˽I֢ݚ\u001b$|4\u0001y \b\u000eLyF)F\fT9ZnS\u0001VqB^:\r\u0005M\u001dSU6ܹ\u0003߿,ξے!\u0018}k=my\u0001wBFy\u0011\u000fNt\u0014\u0004\\m$CzWm4K8wY-\u0013hفrŐAוܖ{\nHbBeKeO?\tVfS3/,m70\u001bLn[h\u00196Ϡ<̖^͈ϵG\u007f\u001a;Q\u0003)jaB\u0006myb3J=\u0016;\u007f?J*\u001ck&\u001d̸jط/ү֯\u001c8G\u0018pLT&2\u000fD<6\u000bkT\u0018\u0012@~\u000erw\u000fE2\tǅCے\r֊ܢ`XNcn%x>8[\u0017\u000fa$!5_\u0014\u001eJb\u000b{2/Yc͇#̻Nƫݝ)-J1G{@u\u000fe]]qI*62VYqy\u001c$8F|cµ ŀ8ܱμcx6=\u00197\u0005jrɺ*f\u0001MJ)-z3R\u0013\u0084\u0011Ո\u001dY\u0003qh.ZP\u00109I\u001d\u000f\u001bdF\u0015\u0011\u0015ct!U\u0006c4sǝjjե}\u009cWE\u000e\n&(5\r\r#ba\u001cq*z)?.qDh*\tA\\Vʓ.!ƛt˹2\u0012FQ\b;\u0010 v[q\u0002/NGHz\u000bZK\u0017~2c\u001br%ϰ\u000bYϧ3ٟ}x=R#\u00115]F\u0015^dH\"s=f#\u0018\u0014C,G66u_\u05c8O:ִrքSe\u001d-5\u007f8vI2X4\f6\u001a\u0013\u0012Bl(CT~Mlj?Хl\u0019Ĩ\u0010߿n2tv\u0012C\"\n\u0017Jd,!Pf\u0010,\u0002G7G8\u0004\ruf=˞E \u0096#ܳVI+98)}5\u000f\u0013\tYp\u0011 GP&\u000b\u007f\u0016EUF\u0003<PƢYzݮf݁*UU:H(:\u0013&\u00135{FB^y(9SQaZA\u0011/\u0015nܔo]ؚ7֚U]5,\u0007 \u000f\u000fW{7\u0010H\u0016W\u00101T'oIp\u000f;S;\u001cΞ'b֓gڧ\u0003WsX\u0015\b:VMG$!c\\ '-I<\u0006$<(E_G`٪\\\u0017Ѻuӵ\b0:8tl1I\u0005zy3:\f8\u0011r\u0001y4o\u0014<\u0019r>`̼l]ŽO˫}\u0015T\u000fK>E\u0011\u001e+9B\u000b2o\u000fNWar{/\u0005]j&*ͣ:\t\u074b8̹KJi,\fZ i{lp\u001c_\u000f0U =%\u0004&7z`.sSɈ'\"ļHր`\u0003]Ch<N$<`4t\u001a\"ʒ\u00163P\u001a\bҌf\u000f\u0014Ξ7*"}, d2 = {"1d]AX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lG`&6g}/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "5dc\u0010X5MS&FZZ\u001ac\u0007!c>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "uI\u0018#", "5dc\u0010X5MS&FZZ\u001ac\u0007!c", "uI\u0018\u0017", "2o", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "", "5dc\u0011cj:\\\"\t\nZ;\u0001\u00138s", "uC\u0018#", "5dc\u0011c", "uC\u0018\u0013", "", "uE\u0018#", "uE\u0018\u0013", "", "uH\u0018#", "uH\u0018\u0013", "6dX4[;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGc%3hS", "5dc\u0015X0@V(=vg5\u0007\u0018+t\u00042\u0005N", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001b\u0002\u00125W\ruz^", "5dc\u0015X0@V(", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001b\u0002\u00125W\ruzN", "7r56a0MS", "", "7r56a0MS`IK1v\u0002\u0003}${1\u0005J\u0010\u0013&Ky\u0017J", "7r56a0MS`IK1v\u0002\u0003}", "uE\u0018'", "7rB=X*BT\u001d~y", "7rB=X*BT\u001d~y&vM[yjyv:<\n !Vk\u001d@\u0001.C", "7rB=X*BT\u001d~y&vM[yjyv", "7rB=X*BT\u001d~y&1\u0007P\u0010lS\f:<\n !Vk\u001d@\u0001.C", "7rB=X*BT\u001d~y&1\u0007P\u0010lS\f", "uI\u0018'", "7rB=X*BT\u001d~y&\fxv\u0016cq&:<\n !Vk\u001d@\u0001.C", "7rB=X*BT\u001d~y&\fxv\u0016cq&", "7rD;f7>Q\u001d\u007f~^+", "7rD;f7>Q\u001d\u007f~^+DS\u007f8J-u\u000f?\u0013 Py\u001d8\u0006)?b\f", "7rD;f7>Q\u001d\u007f~^+DS\u007f8J-u\u000f", "7rD;f7>Q\u001d\u007f~^+D\u000e9-`/O$?\u0013 Py\u001d8\u0006)?b\f", "7rD;f7>Q\u001d\u007f~^+D\u000e9-`/O$", "7rD;f7>Q\u001d\u007f~^+Dh+Sf&m>?\u0013 Py\u001d8\u0006)?b\f", "7rD;f7>Q\u001d\u007f~^+Dh+Sf&m>", "Ahi2", "5dc \\A>\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc \\A>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001b\u0002\u00125W\ruzR", "EhSA[", "5dc$\\+MVWz\u0004g6\f\u0005>i\n1\n", "5dc$\\+MV", "\u0012o>3Y:>b", "F", "G", "\u0012o>3Y:>b`r|Q}k\u0017\u000b", "uE5u=", "\u0012oB6m,", "\u0012oB6m,\u0006G\u001bqLM:X", ":da=", "AsP?g", "As^=", "4qP0g0H\\", ":da= \u0014=\u001b\u001a{aF", "uE5\u0013\u001c\r", ":da= ?AVkONp", "uI9\u0013\u001c\u0011", ":da= \u0010\u001dS,JJ:", ";`g", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, ";`gyL.1%\b\rV", "uE5u9", ";h]", ";h]yL.1%\b\rV", "1nT?V,\u001ab\u007f~vl;", ";h]6`<FD\u0015\u0006\u000b^", "1nT?V,\u001ab\u007f~vl;D|1XQ\u0017\n\u001c", "1nT?V,\u001ab\u0001\t\tm", ";`g6`<FD\u0015\u0006\u000b^", "1nT?V,\u001ab\u0001\t\tmsp\u000b\"7n6W", "1nT?V,\"\\", "1nT?V,\"\\`K\u00100\bi\u0006\u001b", "B`Z2B9\u001eZ'~", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "B`Z2B9\u001eZ'~B={bo\u000eU\u0012", "uE;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHuzN", "B`Z2B9\u001eZ'~B`\u001dby\u00030\u000e", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHuzR", "B`Z2B9\u001eZ'~Bb;\t\u0010+9c", "Bh\\2f", "=sW2e", "Bh\\2fs\f/u\u007fcD:", "uC5u9", "Bh\\2fs\u000f6#\u0006]\\:", "uE9u=", "uH5u9", "uH9u=", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DpKt {
    /* JADX INFO: renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m6665getCenterEaSLcWc$annotations(long j2) {
    }

    public static /* synthetic */ void getDp$annotations(double d2) {
    }

    public static /* synthetic */ void getDp$annotations(float f2) {
    }

    public static /* synthetic */ void getDp$annotations(int i2) {
    }

    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* JADX INFO: renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m6666isFinite0680j_4(float f2) {
        return !(f2 == Float.POSITIVE_INFINITY);
    }

    /* JADX INFO: renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m6667isFinite0680j_4$annotations(float f2) {
    }

    /* JADX INFO: renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m6669isSpecified0680j_4$annotations(float f2) {
    }

    /* JADX INFO: renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m6670isSpecifiedEaSLcWc(long j2) {
        return j2 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* JADX INFO: renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m6671isSpecifiedEaSLcWc$annotations(long j2) {
    }

    /* JADX INFO: renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m6672isSpecifiedjoFl9I(long j2) {
        return j2 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* JADX INFO: renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m6673isSpecifiedjoFl9I$annotations(long j2) {
    }

    /* JADX INFO: renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m6675isUnspecified0680j_4$annotations(float f2) {
    }

    /* JADX INFO: renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m6676isUnspecifiedEaSLcWc(long j2) {
        return j2 == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* JADX INFO: renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m6677isUnspecifiedEaSLcWc$annotations(long j2) {
    }

    /* JADX INFO: renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m6678isUnspecifiedjoFl9I(long j2) {
        return j2 == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* JADX INFO: renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m6679isUnspecifiedjoFl9I$annotations(long j2) {
    }

    /* JADX INFO: renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m6668isSpecified0680j_4(float f2) {
        return !Float.isNaN(f2);
    }

    /* JADX INFO: renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m6674isUnspecified0680j_4(float f2) {
        return Float.isNaN(f2);
    }

    public static final float getDp(int i2) {
        return Dp.m6638constructorimpl(i2);
    }

    public static final float getDp(double d2) {
        return Dp.m6638constructorimpl((float) d2);
    }

    public static final float getDp(float f2) {
        return Dp.m6638constructorimpl(f2);
    }

    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m6689times3ABfNKs(float f2, float f3) {
        return Dp.m6638constructorimpl(f2 * f3);
    }

    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m6688times3ABfNKs(double d2, float f2) {
        return Dp.m6638constructorimpl(((float) d2) * f2);
    }

    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m6690times3ABfNKs(int i2, float f2) {
        return Dp.m6638constructorimpl(i2 * f2);
    }

    /* JADX INFO: renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m6684minYgX7TsA(float f2, float f3) {
        return Dp.m6638constructorimpl(Math.min(f2, f3));
    }

    /* JADX INFO: renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m6683maxYgX7TsA(float f2, float f3) {
        return Dp.m6638constructorimpl(Math.max(f2, f3));
    }

    /* JADX INFO: renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m6663coerceIn2z7ARbQ(float f2, float f3, float f4) {
        return Dp.m6638constructorimpl(RangesKt.coerceIn(f2, f3, f4));
    }

    /* JADX INFO: renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m6661coerceAtLeastYgX7TsA(float f2, float f3) {
        return Dp.m6638constructorimpl(RangesKt.coerceAtLeast(f2, f3));
    }

    /* JADX INFO: renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m6662coerceAtMostYgX7TsA(float f2, float f3) {
        return Dp.m6638constructorimpl(RangesKt.coerceAtMost(f2, f3));
    }

    /* JADX INFO: renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m6681lerpMdfbLM(float f2, float f3, float f4) {
        return Dp.m6638constructorimpl(MathHelpersKt.lerp(f2, f3, f4));
    }

    /* JADX INFO: renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m6686takeOrElsegVKV90s(long j2, Function0<DpOffset> function0) {
        return j2 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? j2 : function0.invoke().m6707unboximpl();
    }

    /* JADX INFO: renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m6682lerpxhh869w(long j2, long j3, float f2) {
        float fLerp = MathHelpersKt.lerp(DpOffset.m6699getXD9Ej5fM(j2), DpOffset.m6699getXD9Ej5fM(j3), f2);
        float fLerp2 = MathHelpersKt.lerp(DpOffset.m6701getYD9Ej5fM(j2), DpOffset.m6701getYD9Ej5fM(j3), f2);
        return DpOffset.m6694constructorimpl((((long) Float.floatToRawIntBits(fLerp)) << 32) | (((long) Float.floatToRawIntBits(fLerp2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m6687takeOrElseitqla9I(long j2, Function0<DpSize> function0) {
        return j2 != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? j2 : function0.invoke().m6744unboximpl();
    }

    /* JADX INFO: renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m6664getCenterEaSLcWc(long j2) {
        float fM6638constructorimpl = Dp.m6638constructorimpl(DpSize.m6736getWidthD9Ej5fM(j2) / 2.0f);
        float fM6638constructorimpl2 = Dp.m6638constructorimpl(DpSize.m6734getHeightD9Ej5fM(j2) / 2.0f);
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(fM6638constructorimpl)) << 32;
        long jFloatToRawIntBits2 = (-1) - (((-1) - ((long) Float.floatToRawIntBits(fM6638constructorimpl2))) | ((-1) - 4294967295L));
        return DpOffset.m6694constructorimpl((jFloatToRawIntBits2 + jFloatToRawIntBits) - (jFloatToRawIntBits2 & jFloatToRawIntBits));
    }

    /* JADX INFO: renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m6692times6HolHcs(int i2, long j2) {
        return DpSize.m6742timesGh9hcWk(j2, i2);
    }

    /* JADX INFO: renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m6691times6HolHcs(float f2, long j2) {
        return DpSize.m6741timesGh9hcWk(j2, f2);
    }

    /* JADX INFO: renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m6680lerpIDex15A(long j2, long j3, float f2) {
        float fM6681lerpMdfbLM = m6681lerpMdfbLM(DpSize.m6736getWidthD9Ej5fM(j2), DpSize.m6736getWidthD9Ej5fM(j3), f2);
        float fM6681lerpMdfbLM2 = m6681lerpMdfbLM(DpSize.m6734getHeightD9Ej5fM(j2), DpSize.m6734getHeightD9Ej5fM(j3), f2);
        long jFloatToRawIntBits = Float.floatToRawIntBits(fM6681lerpMdfbLM);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fM6681lerpMdfbLM2);
        return DpSize.m6727constructorimpl((jFloatToRawIntBits << 32) | ((jFloatToRawIntBits2 + 4294967295L) - (jFloatToRawIntBits2 | 4294967295L)));
    }

    public static final float getWidth(DpRect dpRect) {
        return Dp.m6638constructorimpl(dpRect.m6722getRightD9Ej5fM() - dpRect.m6721getLeftD9Ej5fM());
    }

    public static final float getHeight(DpRect dpRect) {
        return Dp.m6638constructorimpl(dpRect.m6720getBottomD9Ej5fM() - dpRect.m6723getTopD9Ej5fM());
    }

    /* JADX INFO: renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m6685takeOrElseD5KLDUw(float f2, Function0<Dp> function0) {
        return !Float.isNaN(f2) ? f2 : function0.invoke().m6652unboximpl();
    }

    /* JADX INFO: renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m6659DpOffsetYgX7TsA(float f2, float f3) {
        return DpOffset.m6694constructorimpl((-1) - (((-1) - ((-1) - (((-1) - ((long) Float.floatToRawIntBits(f3))) | ((-1) - 4294967295L)))) & ((-1) - (((long) Float.floatToRawIntBits(f2)) << 32))));
    }

    /* JADX INFO: renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m6660DpSizeYgX7TsA(float f2, float f3) {
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f2)) << 32;
        long jFloatToRawIntBits2 = (-1) - (((-1) - ((long) Float.floatToRawIntBits(f3))) | ((-1) - 4294967295L));
        return DpSize.m6727constructorimpl((jFloatToRawIntBits2 + jFloatToRawIntBits) - (jFloatToRawIntBits2 & jFloatToRawIntBits));
    }

    public static final long getSize(DpRect dpRect) {
        return m6660DpSizeYgX7TsA(Dp.m6638constructorimpl(dpRect.m6722getRightD9Ej5fM() - dpRect.m6721getLeftD9Ej5fM()), Dp.m6638constructorimpl(dpRect.m6720getBottomD9Ej5fM() - dpRect.m6723getTopD9Ej5fM()));
    }
}
