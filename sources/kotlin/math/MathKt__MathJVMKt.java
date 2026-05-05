package kotlin.math;

import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
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
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d̉=!,m\bDJe|\u0004O\u000b8\u000b4B\u0007\":\u0018\u007f\u0007ljA0RlP.X\nB\u001ey\u0010L$\n#\"GIj2}P\b\u0016Ȧm\u007f}Xn#C=\nF|xAaU'aXƉ8Z~MGeok@\u0011xD\u001b82P?@ږ\u000729V$\u000fzqU<\u0016>V\t:\u0001\u0017\u0014İ *\u0015L7\u0019\u001e\u000bf~:V\u0002u:]\"I\u074bHf6mG\u0015M;J\u0005+\u001b\fy\u001eYD}ߖ\u001b=a\u0011\u001fj[m\u0002ouK\u001a\u0001'U*\u0010xoEf\u0018,\u0015YS=a\u0001;t\u0005\u007fdRʴ1grYi&(&y,\u0011J\u0019&\u0006UGtƮ ~\u0017\u001cL\rr\u0002D\u0001\u0006lW\u0018z\u0010:]ӣ\u0006K9G5~Q\u0010:IRE\u0011\u001d\rL\"Gs9jb(x\u0015IX(U?fX=vRPԷC\u0006\u0013~}\u001a*2/w\u0004=\u0011).E$}ً?;0y\u001d`D\u0016z5dvh\u0002RvDhÊ\u001cOA\u0017(rD\u0013\u0004\u001cTbuD\u0011{\u001b\u0005\u000b\f\u001d+ \u000bv\u0003ơ+(e]\u0005\u0002j{a:)=\u0004OY\u001do>[GsK5\u007fgVШX\u000f\"MZz\u0005\u0007erW\u001aot(P1\u000fo(\u0007\nbf\fA6ou*ID1G`[ȅ\t6QO\u001c!_\tg@\u0003bH<\u0003\u0018#;կ\u0007hk~\u000f\u007fxw0-d0BYQc\u001dlŦ(\u0001C\u000bC\u001f~\"~wkZ\\dlDt\u001cݰ&.)GqG=A\u0013/-@\u0017EEzv,ˀS*6\t\u001e\u0012\u000fig^k\u0016\u007f\t,\u000fi\u0011֪Z/1\u0005\u007f\u000b#6h0}o[\u0013G\u0012XQϽDa\u0002\u0011{TNf{5#,:\u0019oP{{ԎI?,$\u001a,/Ce\u000em}C\u0012b=*;Љ\nDr$\u0013zQ\f1k<Wn\u0017>P#3ßH`y\u0006+Z\tb\u0011cLOy\tVfQQɈ\u0004~\u0016:1\tV\n9Cs\fIF_Xr\nͧ\u001avR35eS\u0016q\u001eOj b\u000f8\u000fBϊt*+KEnW\u0011\b`\n\u0002-NAiaK½\u000f<C:a \u000bqX\u001a\n\u001e\u0010\u0018F\u000e\u0013]ϰH\fRd4lx\u000bUx\tnZx!X\u007f/\u0013A;\u00115_\u00044۶ZGz@'k\u001d7\u001f\u001bS\r{=+rXi\u001f6u\u0019\u000bsa\n̺\bN\u0013UP\u0006k\u001e\u000bh\u001c\u000b2Z\u0018I8\u0018Ρe\u000f?l2md|h'\u0016tgf\"W\u0003AՌ\u0014T\u0019\u001d31O!n\u00131Zc\u00107q\u0019GӇJA\u0016\u001a%{FI169;RajB+B\u0081YS\u0014\u0016I8'2sQ`e#~\n\f\u001aj\u001a\u007f@z\u00027\u0012\u0017%\u001cDX\u001e\u000b\n\\\ffS\u0010H\u001a\u0013\r]\u001c{/j?+\u001b\n\tP\u0001\b\u0018\u000f\u0005c\u001dT;\u0007tFny\u001d,\u0017ɇ\u000f?\\<>pZh\u0015\u0004$f&\u0018\u0014C*eߖ\u000ez7\u001e{{h\u001fj\u007f_\u001b@GkX`w5j,\fK\u0012u2.\u0005,#PnMlhOa\u0005Ye;vjVc%\u00107B\u0015~v]A\u0017Bu\u000b\u001e\u0013.}ا%s$U\u000e\u001f\u0004sMV%?\u0001W\u001be6;s6&)\u0003hf;ʜ0Z \u0001-\u007f,[M\u0005A(Uq$\u001ck3*YtPB63WÈ\u0017GqFMV\\H&kUAo1\u0011/\u001fh\n}615\u0019[\u001aϿ0\u0019\u0014\u000f=Wy_jjwE!;/=nK[tj=5\u0014Kmڌ\b}a\r}{V=e\\MCs6y\u0004D0\u000e-S<\u0006$'FӢ7`Am\rXV\"^4*8d\u0007DQN\u001d|\u00029DiFz+՟gLX\tD1Dl4]p\u0015seh(\u0015t\u0011SCO\u000f43y٢\u0003(^\u007fqCI!L_`kQ+s29x\u074b<\u0012VN\u000bB\u0006[\u0016\u0005gx\u007f\u0006Q\u000e\u0014~ܾ\u0013%\u0013\u0006>j`._M\u001c5`\u000fFd[?\u0098Gz\u001aN\u001c<^\\F<\u000f\u0014+FHE\u0006D߇f-\"Ay\fAu\u0011\u0007\u007f/2)[S\u0005k٨p_Nc$p=g7;qXmMe\u000b\t\u001cمQ|:#3\u0003+\\F\u0007B(?p\u0006<D+в\u0016\\\bR[\u00060^4\u0001\u0003hXu\u0001J#\u0004ս\u001b}\u000e@\u0017O[\u0013\u0010[;e\u0004jUQ,?ߗ\t(P'G#\u001e\u0002=b'\u0002\"I>*\f#Ż[\u0015|WE\u001bax _\nMDYK\u001bU,ǲ\u001foN\rA8'R\nC(p|+i<&&̤RNe7~cY?ern\u001d\u0010\r\f\\\u000b~˙\fU\u0015\u001f\u001945icp0<\u0006!G}nBۙk\bt\u0003\u0011eEYtIB?\u0007)c}^Zsijfu/WTDC\u0006(2>a*Lo5/hq&\u0003s\u0003_9Ybj`h\b,~dlb\u0005̩N\u0005,t\b\u0016\u001b\u007fH\u000b\t\u000ftxE\u001e\u001c\u0005,U:\u000fЫ\u001f\u0019\fY\u001c/\u0014eC\u001f#\u00162\u0001ɑg:^k__J4\u0012\u0013a&\u0019B֦9N }g\u0015\u00153=\u000fr2k5Q>@\u0004/`E!ݸ\"Em5)\u0001\bX\u00124|30\u001fW`\u000e\u000e\u001f!hEԅ$2Lev_!A\u0002A<61\u0014ó\u0001\u0007cjbF{4#:B*93͒y\u0014Fe0g4\f\u001dQ}\u0018vP\u0011y'\u001ccx\"\u0016يh)p<\f\u0010\u0007\b;\u0002A0\tR-2\u001e-'0Ozϗ8:6\u000fMN\u0018xj\u0017xS\r\u0016\u0010=\n\u000e\u000e`q\u0005ԂluzB\u007fUU\f\u0003m-]u8OW\u0004\u0017+u\u0015\u0010ۇ@gV{5s=\u0003\u001dZ\u0007\u001e\u0003w\u0015\fji\u0002/w6i\\kh\u007f\u000e\b,tYn2Z\u0015x\u0015v~`VB.\u0017\"EVsW-h%\u000ed.\u0005S\u001c~^OQsc3D?'\u00116L\u001f'H\u0007eT܂\b\u001d^r[.9swhKCZ4kq^:gvrnު\u0010\u0010)D^\u00185g\u0011\u001cP\r9\u0018b\u0017b;\u000eUr\u0016ȳwHEU\u001fr ]_0\u000exj|T\u001bN\u001fl\\}=ܫ\u001d_2\u0010ȇ]\"KB\u000e\u0019\u0016\u0004lʚ;4ԵU̐~(~]a'>~\u001e#\u0019C-\u0019.A\u0016ؓ\r[bS\u001e\u0001nLIú\u001a\u001aǐ\nĄ\to\\\u0007;\nO6WUv\u001b9}\u007f{PѪ%%O/3\u0018Vh#űokܞ$Ȑ\u0017\u0001+o\u000f\u0010*Q=\u000b3S\u0005\u0004:O\u001eـm\u0010m\u0014;b\r\u00026͊I\u0007٤u֝QV}\u007f4j}u\u0010`\u0016Q\u007fH}\u001c\u0006C](>%z;Ba\u0013Ď'2ЀFݔ\u0012(/,*@\u001aoH\u001dbw\fr\u0017op\u001fx4\u001d9\u0001@c/Yֱ&W˘\u000bւa5$@_cTi'h|_Q\u0018~\u0011Lv\u0015\b_$,\u0006ylh`\u0010ȱ{ӱo>P$0p\",}\u000e\u0013[^6:RmI:9j\"\u001c0-!G\u0005Aߞ\u0006ƂJ\u001b\u0003\u000bv?@Tw^%;l9\u0011\t\b@hRoL\u0017/H\u0016\\Ζa\u000e̥Mӱ&&UiC[3\u0016%!p\u001f\u0003\u0006=R\u007fmv*m\u0006.$BF5֮p\u001a܃@ؽ >$v(tw9FDhb8\u001cؼi\u0011"}, d2 = {"/ab<_<MS\nz\u0002n,", "", "5dc\u000eU:HZ)\u000ezO(\u0004\u0019/${1\u0005J\u0010\u0013&Ky\u0017J", "uC\u0018#", "5dc\u000eU:HZ)\u000ezO(\u0004\u0019/", "uC\u0018\u0011", "", "uE\u0018#", "uE\u0018\u0013", "", "uH\u0018#", "uH\u0018\u0016", "", "uI\u0018#", "uI\u0018\u0017", "AhV;", "5dc \\.G\u0012\u0015\b\u0004h;x\u00183o\t6", "5dc \\.G", "uI\u0018\u0016", "Ck_", "5dc\"_7|O\"\b\u0005m(\f\r9n\u000e", "5dc\"_7", "/ab", "F", "<", "/b^@", "/b^@[", "/rX;", "/rX;[", "/sP;", "/sP;%", "G", "/sP;[", "1aaA", "1dX9", "1nb", "1nb5", "3w_", "3w_:$", "4k^<e", "6x_<g", ":m", ":m =", ":nV", "0`b2", ":nV}#", ":nV~", ";`g", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, ";h]", "@nd;W", "Ah]", "Ah]5", "ApaA", "B`]", "B`]5", "Bqd;V(MS", "\u0017D4\u0012e,F", "2he6f6K", "<dgA76P\\", "<dgAG6PO&}\t", "Bn", "<dgAH7", ">nf", "@nd;W\u001bH7\"\u000e", "@nd;W\u001bH:#\b|", "Ehc5F0@\\", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{9,>1v\u0014'9,\u000e6")
public class MathKt__MathJVMKt extends MathKt__MathHKt {
    private static final double IEEErem(double d2, double d3) {
        return Math.IEEEremainder(d2, d3);
    }

    private static final float IEEErem(float f2, float f3) {
        return (float) Math.IEEEremainder(f2, f3);
    }

    private static final double abs(double d2) {
        return Math.abs(d2);
    }

    private static final float abs(float f2) {
        return Math.abs(f2);
    }

    private static final int abs(int i2) {
        return Math.abs(i2);
    }

    private static final long abs(long j2) {
        return Math.abs(j2);
    }

    private static final double acos(double d2) {
        return Math.acos(d2);
    }

    private static final float acos(float f2) {
        return (float) Math.acos(f2);
    }

    public static final double acosh(double d2) {
        if (d2 < 1.0d) {
            return Double.NaN;
        }
        if (d2 > Constants.upper_taylor_2_bound) {
            return Math.log(d2) + Constants.LN2;
        }
        double d3 = 1;
        double d4 = d2 - d3;
        if (d4 >= Constants.taylor_n_bound) {
            return Math.log(d2 + Math.sqrt((d2 * d2) - d3));
        }
        double dSqrt = Math.sqrt(d4);
        if (dSqrt >= Constants.taylor_2_bound) {
            dSqrt -= ((dSqrt * dSqrt) * dSqrt) / ((double) 12);
        }
        return dSqrt * Math.sqrt(2.0d);
    }

    private static final float acosh(float f2) {
        return (float) MathKt.acosh(f2);
    }

    private static final double asin(double d2) {
        return Math.asin(d2);
    }

    private static final float asin(float f2) {
        return (float) Math.asin(f2);
    }

    public static final double asinh(double d2) {
        if (d2 < Constants.taylor_n_bound) {
            return d2 <= (-Constants.taylor_n_bound) ? -MathKt.asinh(-d2) : Math.abs(d2) >= Constants.taylor_2_bound ? d2 - (((d2 * d2) * d2) / ((double) 6)) : d2;
        }
        if (d2 <= Constants.upper_taylor_n_bound) {
            return Math.log(d2 + Math.sqrt((d2 * d2) + ((double) 1)));
        }
        if (d2 > Constants.upper_taylor_2_bound) {
            return Math.log(d2) + Constants.LN2;
        }
        double d3 = d2 * ((double) 2);
        return Math.log(d3 + (((double) 1) / d3));
    }

    private static final float asinh(float f2) {
        return (float) MathKt.asinh(f2);
    }

    private static final double atan(double d2) {
        return Math.atan(d2);
    }

    private static final float atan(float f2) {
        return (float) Math.atan(f2);
    }

    private static final double atan2(double d2, double d3) {
        return Math.atan2(d2, d3);
    }

    private static final float atan2(float f2, float f3) {
        return (float) Math.atan2(f2, f3);
    }

    public static final double atanh(double d2) {
        if (Math.abs(d2) < Constants.taylor_n_bound) {
            return Math.abs(d2) > Constants.taylor_2_bound ? d2 + (((d2 * d2) * d2) / ((double) 3)) : d2;
        }
        double d3 = 1;
        return Math.log((d3 + d2) / (d3 - d2)) / ((double) 2);
    }

    private static final float atanh(float f2) {
        return (float) MathKt.atanh(f2);
    }

    private static final double cbrt(double d2) {
        return Math.cbrt(d2);
    }

    private static final float cbrt(float f2) {
        return (float) Math.cbrt(f2);
    }

    private static final double ceil(double d2) {
        return Math.ceil(d2);
    }

    private static final float ceil(float f2) {
        return (float) Math.ceil(f2);
    }

    private static final double cos(double d2) {
        return Math.cos(d2);
    }

    private static final float cos(float f2) {
        return (float) Math.cos(f2);
    }

    private static final double cosh(double d2) {
        return Math.cosh(d2);
    }

    private static final float cosh(float f2) {
        return (float) Math.cosh(f2);
    }

    private static final double exp(double d2) {
        return Math.exp(d2);
    }

    private static final float exp(float f2) {
        return (float) Math.exp(f2);
    }

    private static final double expm1(double d2) {
        return Math.expm1(d2);
    }

    private static final float expm1(float f2) {
        return (float) Math.expm1(f2);
    }

    private static final double floor(double d2) {
        return Math.floor(d2);
    }

    private static final float floor(float f2) {
        return (float) Math.floor(f2);
    }

    private static final double getAbsoluteValue(double d2) {
        return Math.abs(d2);
    }

    private static final float getAbsoluteValue(float f2) {
        return Math.abs(f2);
    }

    private static final int getAbsoluteValue(int i2) {
        return Math.abs(i2);
    }

    private static final long getAbsoluteValue(long j2) {
        return Math.abs(j2);
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(double d2) {
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(float f2) {
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(int i2) {
    }

    public static /* synthetic */ void getAbsoluteValue$annotations(long j2) {
    }

    private static final double getSign(double d2) {
        return Math.signum(d2);
    }

    private static final float getSign(float f2) {
        return Math.signum(f2);
    }

    public static final int getSign(int i2) {
        if (i2 < 0) {
            return -1;
        }
        return i2 > 0 ? 1 : 0;
    }

    public static final int getSign(long j2) {
        if (j2 < 0) {
            return -1;
        }
        return j2 > 0 ? 1 : 0;
    }

    public static /* synthetic */ void getSign$annotations(double d2) {
    }

    public static /* synthetic */ void getSign$annotations(float f2) {
    }

    public static /* synthetic */ void getSign$annotations(int i2) {
    }

    public static /* synthetic */ void getSign$annotations(long j2) {
    }

    private static final double getUlp(double d2) {
        return Math.ulp(d2);
    }

    private static final float getUlp(float f2) {
        return Math.ulp(f2);
    }

    public static /* synthetic */ void getUlp$annotations(double d2) {
    }

    public static /* synthetic */ void getUlp$annotations(float f2) {
    }

    private static final double hypot(double d2, double d3) {
        return Math.hypot(d2, d3);
    }

    private static final float hypot(float f2, float f3) {
        return (float) Math.hypot(f2, f3);
    }

    private static final double ln(double d2) {
        return Math.log(d2);
    }

    private static final float ln(float f2) {
        return (float) Math.log(f2);
    }

    private static final double ln1p(double d2) {
        return Math.log1p(d2);
    }

    private static final float ln1p(float f2) {
        return (float) Math.log1p(f2);
    }

    public static final double log(double d2, double d3) {
        if (d3 <= 0.0d || d3 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d2) / Math.log(d3);
    }

    public static final float log(float f2, float f3) {
        if (f3 <= 0.0f || f3 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log(f2) / Math.log(f3));
    }

    private static final double log10(double d2) {
        return Math.log10(d2);
    }

    private static final float log10(float f2) {
        return (float) Math.log10(f2);
    }

    public static final double log2(double d2) {
        return Math.log(d2) / Constants.LN2;
    }

    public static final float log2(float f2) {
        return (float) (Math.log(f2) / Constants.LN2);
    }

    private static final double max(double d2, double d3) {
        return Math.max(d2, d3);
    }

    private static final float max(float f2, float f3) {
        return Math.max(f2, f3);
    }

    private static final int max(int i2, int i3) {
        return Math.max(i2, i3);
    }

    private static final long max(long j2, long j3) {
        return Math.max(j2, j3);
    }

    private static final double min(double d2, double d3) {
        return Math.min(d2, d3);
    }

    private static final float min(float f2, float f3) {
        return Math.min(f2, f3);
    }

    private static final int min(int i2, int i3) {
        return Math.min(i2, i3);
    }

    private static final long min(long j2, long j3) {
        return Math.min(j2, j3);
    }

    private static final double nextDown(double d2) {
        return Math.nextAfter(d2, Double.NEGATIVE_INFINITY);
    }

    private static final float nextDown(float f2) {
        return Math.nextAfter(f2, Double.NEGATIVE_INFINITY);
    }

    private static final double nextTowards(double d2, double d3) {
        return Math.nextAfter(d2, d3);
    }

    private static final float nextTowards(float f2, float f3) {
        return Math.nextAfter(f2, f3);
    }

    private static final double nextUp(double d2) {
        return Math.nextUp(d2);
    }

    private static final float nextUp(float f2) {
        return Math.nextUp(f2);
    }

    private static final double pow(double d2, double d3) {
        return Math.pow(d2, d3);
    }

    private static final double pow(double d2, int i2) {
        return Math.pow(d2, i2);
    }

    private static final float pow(float f2, float f3) {
        return (float) Math.pow(f2, f3);
    }

    private static final float pow(float f2, int i2) {
        return (float) Math.pow(f2, i2);
    }

    private static final double round(double d2) {
        return Math.rint(d2);
    }

    private static final float round(float f2) {
        return (float) Math.rint(f2);
    }

    public static final int roundToInt(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    public static final int roundToInt(float f2) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f2);
    }

    public static final long roundToLong(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d2);
    }

    public static final long roundToLong(float f2) {
        return MathKt.roundToLong(f2);
    }

    private static final double sign(double d2) {
        return Math.signum(d2);
    }

    private static final float sign(float f2) {
        return Math.signum(f2);
    }

    private static final double sin(double d2) {
        return Math.sin(d2);
    }

    private static final float sin(float f2) {
        return (float) Math.sin(f2);
    }

    private static final double sinh(double d2) {
        return Math.sinh(d2);
    }

    private static final float sinh(float f2) {
        return (float) Math.sinh(f2);
    }

    private static final double sqrt(double d2) {
        return Math.sqrt(d2);
    }

    private static final float sqrt(float f2) {
        return (float) Math.sqrt(f2);
    }

    private static final double tan(double d2) {
        return Math.tan(d2);
    }

    private static final float tan(float f2) {
        return (float) Math.tan(f2);
    }

    private static final double tanh(double d2) {
        return Math.tanh(d2);
    }

    private static final float tanh(float f2) {
        return (float) Math.tanh(f2);
    }

    public static final double truncate(double d2) {
        return (Double.isNaN(d2) || Double.isInfinite(d2)) ? d2 : d2 > 0.0d ? Math.floor(d2) : Math.ceil(d2);
    }

    public static final float truncate(float f2) {
        if (Float.isNaN(f2) || Float.isInfinite(f2)) {
            return f2;
        }
        return (float) (f2 > 0.0f ? Math.floor(f2) : Math.ceil(f2));
    }

    private static final double withSign(double d2, double d3) {
        return Math.copySign(d2, d3);
    }

    private static final double withSign(double d2, int i2) {
        return Math.copySign(d2, i2);
    }

    private static final float withSign(float f2, float f3) {
        return Math.copySign(f2, f3);
    }

    private static final float withSign(float f2, int i2) {
        return Math.copySign(f2, i2);
    }
}
