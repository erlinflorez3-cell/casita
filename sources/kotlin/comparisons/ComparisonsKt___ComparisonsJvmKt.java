package kotlin.comparisons;

import com.dynatrace.android.agent.AdkSettings;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$MultiFileClassPart.<init>(KotlinClassMetadata.kt:308)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:54)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯH\u001d<;!&i\u000eQLcz\bI\u0006>\u001a6Ȑ\u0007\":\u0015\u007f\u0007tzA0RiP.`d2\u000fy\u0001<$i6yCI[\"}0\u001cWNunvJh\u001fK\u000f\u0014\u001e\u0001j:^]xc\u0012']PģW3\u0014n]EfҚD\u0004H82:\n\u0005G\u0019XH@z\tDc\fX/ptHT%MK\u0019X\u000b̧$\u0001,_\u007f\u0002Dԟ\u0005]\u0001.C\u000foĩ\\&\b6\rO\u001dF\u001b&;v\u0012\"9AO5[$\u0004\u0007\u0015Ts?I>\"A\u0013l?'qH:\\͏\\\u007f\"\u001aC\u0007\u001bƞ\u000b&#\u0004ql\u0012ʬ9N\fQ`\u00108wAz;<4\u0012\u0014(`.s\u0019\u0017\u0018\u001c9\rzcDV\u0001nBFy\u0010=7%F2q>ӸjQoC1eEަ\u001d\rL,1r/\\l\u000e\u000f\u001eKX\u0006SIQnF\u000fݘ\u0010q\\{Վ\tb0344U\u0001G{?7G)E]Q#Ot2LRk\u000f\u0005\u000fq\u001a֧X`Z0Â.7X\u0012<^Re\u001dk~]\t4\u001fS4T5\b(\u0013Ne>A9<\u001eʚgh\u0018u}a\u0018&Gfed\u001fo\u001cYQ^a@\u0018ҷ\u0016yq\u0005ܝW<\u0011\u0010\tjPT$Z\u000b3R6Vl(w*O~\u0010!6WqJ?rփ\u001ft/Vґ6Bo\b9chi(~\u0003>T\u000bw*\r\t/\\|p\u001er?ND\u0014nõEA\u007fBI*c#\u00014+07\u0003\u0002\u0002_gzT\u0013̆\u001c\u000et\n\u008d.\u001ag^_A!\u0010\u0017)`\u000f]IZt}Q{\u001fW~\u000b}';\u0017;.ŕp\tFnʄbO\u0003$Rzls;\b\u0013\r*iT\u0001_c\u0003\u0019{>w\u007fI^TeFو\u001d\u001fL41s0}M-q6M\u001a\u0006\u0016G\u0015\u0010l0۸4\u0012\u0002\u001dծ\re2;\u0014\u001a}ci]`JhMg\u0001V\"R{3FVn\u0010\bp\u0018zه9`[rݥn8{\u001a_\u0002t\bD\r\u001fe\fB!u\u00164\\oJsq\rZc[<\u001f\u07bdkg\u001c~{`\u0019K'\n9\rar \u001eU \u0005h)׆6\u001e\u0013&ܽY;\u0011\u0016l\r25D<6\u001csXw\b(z.W\u0010\u0013%6ZsigT֒~tpVγxE\u000f2Z\u0005\r\u0010K\u001e'Fa\r{Ll/\u0012D!SK\u001aaog\u0016tއCD\u0003LK,f\u0002#E\fVy\u0006D\u0006_)\u001c~6ȷ>0\u001c+\u00ad0\u001bgdAc\u00051v\u000b\u0004w~h\u0005\u0014~R|5Y\u0003\t\u0001&<8\"QćU\u000b\np\u03a2dN&Js\u001e\u000f\u0018\\)5\u001f-kT!E\u0006cA]I\u0019'm\u0001o~I\u0013  f&$\u0001'Ƹe\r\u000f\u0010m\u001dJ\u00168\u0015\u0011\u00029\u0017^!\u001c.\u0011s#\u000e<\nNOH2H\u0018Ȩ]k\u0006$XZ9\u0002\u001eB\u0012g\u0019\u0016iؙqm}\u0011\u0013hAV@m[PM\r5NF\u0013\u001fYj\u0015a\"p\u0011F\u0013E*-: bo\u000f\u0016h\u05cftk]`%b=\u0001Baw/r*\u0004Υ\bt,0d*%;\u001dLld9`zCo\u000e%iXt\u0003\u0012A\u001c\r\u0003N]!\u0013zE!%\u0005/}\u0018e`ǏK`\u0015\f]`46IRm$g6\u0019p@v?\fjf\u0003\u0002BB7{Fפ2EebR2'\b-\u001eh\u0011'cEfK80\u001f\u0010)/\tAPBj\u001e4;\u007f<\b˚\u0017\u0019/F\u001b\b\u0007G>\u001bUa&B\u0001+\n=G\b7\u0004:\"A\u0013#]\u00186 o}I:Mez2<\u0006sK\u0017M\u0012a?e:KMEL\u0005\u001cʶ\u0006\">29\u001euQ\u000bu5V+w\\na$[\u0012(B6\u001dOSKz|\f\nZt^Ľjs{BV\u0013\u0014GOn.;m\u001fE{s*\u0013R\u0013]\u0014e\u001b&)a\"C\u0015g\tN@ar{<\raJ\u0014\f\u0004h?\u0012:\bIXYX\u0013s¢Z{\nx\u0003i_>EB\u0011\u001b\u0005\u00101\u0001m0d+\u001a?K%Sf`\u0007QYb9MUģdF\\\u001a \u001e\u0016\\UG\u0006\fKx\u0015A@w{OM*V*/=\u0011\n2L*\u007f\u0002UTmq\u0007Li7\u0019nbXct\r\tc#cdY$Fӵ1FfdS2*\u0007\u0015>IrI(D'SXq>2HP-isa\u000f 7=\u0004$,܇8zQiy)+ef\u001fVc$Ex0\u0012@I'\u0019#\u001e\u0002IR#\"\u001cwC\u0014\u001fj^m|\u001cZ@\u0007oK9/4P_EYnnem*\u001eé\u0005$?59\u001e\u0013Rs\u0018\u0017w\u000f:_1]fZ7JcY?wrn\u001d~\r\f\\\u001d~˙\fU \u001fw45ipp0<q!G}{,2su~t\b_e+$*\u00056\n(qdw\u0014\u001dd\r\\L\u0018o&n&2\u001e+(y{v<vń[{\rx\tl`?ldo>e\u0012r\u0015wngL>`lGy\u007f\u0002)U\\b7s7ֻG(|zA?6v}I\u0005\u000fLy\u0017BJt~1mK:PuBS\f8\u000eOԺ\u0012\u0001"}, d2 = {";`g\u001cY", "\"", "", RemoteSettings.FORWARD_SLASH_STRING, AdkSettings.PLATFORM_TYPE_MOBILE, "uKY.i(\bZ\u0015\b|(\n\u0007\u0011:a\r$xG\u0001l}Lk\u001f8@,1b\u007fi\u0015w\u001e9IP7h;\u001ej,H>\u0003t(\u0018}#PN\u0018\nfZ}9!\u000eW\u0015N\u0001", "1", "uKY.i(\bZ\u0015\b|(\n\u0007\u0011:a\r$xG\u0001l}Lk\u001f8@,1b\u007fi\u0015w\u001e9IP7h;\u001ejOf5\u0018_uUr0I\u0016,6d]nJ\u0010\u000fa\u000e$ns\nUR 8K3(\nu'\fCs|\u0019\u0012\u000b<jF", "=sW2e", "", "uKY.i(\bZ\u0015\b|(\n\u0007\u0011:a\r$xG\u0001l\r.t\nMrn<U\u0007\"\u0001K 6X?Hg1%\u0015>% \f_=J@.CUPu:\\zH\u0010\u001fV\u000bU+b", "", "", "", "", "", "", "", "", "", "", "", "", ";h]\u001cY", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{/:79)9/8315o\u0003.+-\u001d-#,'%)\u007f(")
public class ComparisonsKt___ComparisonsJvmKt extends ComparisonsKt__ComparisonsKt {
    private static final byte maxOf(byte b2, byte b3) {
        return (byte) Math.max((int) b2, (int) b3);
    }

    private static final byte maxOf(byte b2, byte b3, byte b4) {
        return (byte) Math.max((int) b2, Math.max((int) b3, (int) b4));
    }

    public static final byte maxOf(byte b2, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b3 : other) {
            b2 = (byte) Math.max((int) b2, (int) b3);
        }
        return b2;
    }

    private static final double maxOf(double d2, double d3) {
        return Math.max(d2, d3);
    }

    private static final double maxOf(double d2, double d3, double d4) {
        return Math.max(d2, Math.max(d3, d4));
    }

    public static final double maxOf(double d2, double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d3 : other) {
            d2 = Math.max(d2, d3);
        }
        return d2;
    }

    private static final float maxOf(float f2, float f3) {
        return Math.max(f2, f3);
    }

    private static final float maxOf(float f2, float f3, float f4) {
        return Math.max(f2, Math.max(f3, f4));
    }

    public static final float maxOf(float f2, float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f3 : other) {
            f2 = Math.max(f2, f3);
        }
        return f2;
    }

    private static final int maxOf(int i2, int i3) {
        return Math.max(i2, i3);
    }

    private static final int maxOf(int i2, int i3, int i4) {
        return Math.max(i2, Math.max(i3, i4));
    }

    public static final int maxOf(int i2, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i3 : other) {
            i2 = Math.max(i2, i3);
        }
        return i2;
    }

    private static final long maxOf(long j2, long j3) {
        return Math.max(j2, j3);
    }

    private static final long maxOf(long j2, long j3, long j4) {
        return Math.max(j2, Math.max(j3, j4));
    }

    public static final long maxOf(long j2, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j3 : other) {
            j2 = Math.max(j2, j3);
        }
        return j2;
    }

    public static final <T extends Comparable<? super T>> T maxOf(T a2, T b2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        return a2.compareTo(b2) >= 0 ? a2 : b2;
    }

    public static final <T extends Comparable<? super T>> T maxOf(T a2, T b2, T c2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        return (T) ComparisonsKt.maxOf(a2, ComparisonsKt.maxOf(b2, c2));
    }

    public static final <T extends Comparable<? super T>> T maxOf(T a2, T... other) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t2 : other) {
            a2 = (T) ComparisonsKt.maxOf(a2, t2);
        }
        return a2;
    }

    private static final short maxOf(short s2, short s3) {
        return (short) Math.max((int) s2, (int) s3);
    }

    private static final short maxOf(short s2, short s3, short s4) {
        return (short) Math.max((int) s2, Math.max((int) s3, (int) s4));
    }

    public static final short maxOf(short s2, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s3 : other) {
            s2 = (short) Math.max((int) s2, (int) s3);
        }
        return s2;
    }

    private static final byte minOf(byte b2, byte b3) {
        return (byte) Math.min((int) b2, (int) b3);
    }

    private static final byte minOf(byte b2, byte b3, byte b4) {
        return (byte) Math.min((int) b2, Math.min((int) b3, (int) b4));
    }

    public static final byte minOf(byte b2, byte... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (byte b3 : other) {
            b2 = (byte) Math.min((int) b2, (int) b3);
        }
        return b2;
    }

    private static final double minOf(double d2, double d3) {
        return Math.min(d2, d3);
    }

    private static final double minOf(double d2, double d3, double d4) {
        return Math.min(d2, Math.min(d3, d4));
    }

    public static final double minOf(double d2, double... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (double d3 : other) {
            d2 = Math.min(d2, d3);
        }
        return d2;
    }

    private static final float minOf(float f2, float f3) {
        return Math.min(f2, f3);
    }

    private static final float minOf(float f2, float f3, float f4) {
        return Math.min(f2, Math.min(f3, f4));
    }

    public static final float minOf(float f2, float... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (float f3 : other) {
            f2 = Math.min(f2, f3);
        }
        return f2;
    }

    private static final int minOf(int i2, int i3) {
        return Math.min(i2, i3);
    }

    private static final int minOf(int i2, int i3, int i4) {
        return Math.min(i2, Math.min(i3, i4));
    }

    public static final int minOf(int i2, int... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (int i3 : other) {
            i2 = Math.min(i2, i3);
        }
        return i2;
    }

    private static final long minOf(long j2, long j3) {
        return Math.min(j2, j3);
    }

    private static final long minOf(long j2, long j3, long j4) {
        return Math.min(j2, Math.min(j3, j4));
    }

    public static final long minOf(long j2, long... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (long j3 : other) {
            j2 = Math.min(j2, j3);
        }
        return j2;
    }

    public static final <T extends Comparable<? super T>> T minOf(T a2, T b2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        return a2.compareTo(b2) <= 0 ? a2 : b2;
    }

    public static final <T extends Comparable<? super T>> T minOf(T a2, T b2, T c2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        return (T) ComparisonsKt.minOf(a2, ComparisonsKt.minOf(b2, c2));
    }

    public static final <T extends Comparable<? super T>> T minOf(T a2, T... other) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        for (T t2 : other) {
            a2 = (T) ComparisonsKt.minOf(a2, t2);
        }
        return a2;
    }

    private static final short minOf(short s2, short s3) {
        return (short) Math.min((int) s2, (int) s3);
    }

    private static final short minOf(short s2, short s3, short s4) {
        return (short) Math.min((int) s2, Math.min((int) s3, (int) s4));
    }

    public static final short minOf(short s2, short... other) {
        Intrinsics.checkNotNullParameter(other, "other");
        for (short s3 : other) {
            s2 = (short) Math.min((int) s2, (int) s3);
        }
        return s2;
    }
}
