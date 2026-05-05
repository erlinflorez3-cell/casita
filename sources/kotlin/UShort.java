package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;
import okhttp3.internal.ws.WebSocketProtocol;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яl\u001d<K!&i\u000eQLш|\u0004O\u000e8\u000b4I\u0007\":\u0018\u007f\u0007|jA0JeP.hS2\u000fq{<$q$yCA`\"}0\u0012WNu˧vJ`*K\u000f\u001c\u0016\u0001j2V]xk\u0015\u00172HpG3[sE9fu>\u0005.7*8\u007f\b\t\u001a8O\u0018v\u0001FS\f <Hp@^\u0013˧C0Ň$3P\u0007.^wNdԟ\u001b\\r.\u0018CxHM7c>|e\rtUܮ\u0011xg 9C\u007fK#+k\u00035Ѹ\fC\u0011F\n=3ؒmݘ5ʁwY<`\u000e\u001d]A]\u0017urTg5Un\u0013?+}o\u0012ּ\u0016߭{|\u0002\u001aJ\u0012V\u001c5RF-Hq8\u0012A{\u000bSn_HޑJȸ~c<'3\u0011{AG%~Q\u0010FIRE\u0003\u001d\rL5G͡)ƟX\u0010f()h@g?[X=vY:]Kt\u001cp\u0011̣pˎ8Ͻ\u00041\u0002&<-mHiP;!\u001aȵ\u000fֻoѱ\u0004\u009bĈWkX`N%7,EC!\f\tS\u0015\tyWlXZ\u001d\u0014Ʉ\\Θ\u0002\n\u0019:j\u0006\u000573)fO\u0017x\u001bQk\u0011=/\u0015F ʬsް[;dNCb,&ok\u000f\u0014mN\u0013\tfmZS:l#̭*ĘLl\u0016\u0014\na\u0017\"!KWqJC\\5'c-H1ٜ\tˎ\u0005Ȥc\\n.\rj{<\u0011\t<t7!\u0001b~v\u007fz_++\u0002hϡBپ9\u001b,w0\f|\u00131+\u0017s.V\u0018PUS\u0005\u0016$aB\u0095\u001c׀=S5b!\u001dG?@&EEz\u0002\u0016U[\u0019?z+\tU\u0098n\u05cek\np\u0017:q3`]x/\"%p#'\u0016k\u0018y\u0010XAúiӝ\u000f]Dp\u0001 \"R\\\\\u0015\u0005M-U\u0005})\u00155[ξmݼ\u001c߳\u00181\u001b\nk\u007f8<\b\f'&#pJёb݁sdW\b@f\u0001Zg+V\"RЗIܱPݬv٤ɚ\r6\u0013`VD-\u0002dfe\u000b]̎-\u00862߱o£ݍ>\u0015u-B1(@\u0002s\u0016\u0014\rRU\u0015[Z\u007fm\u001cW#֭R؝\u000e\r\u0002b| dS.\u0007ob7?6w&=Y;\u0011\u0014\u0003ʇ,Ҭ0>\u000e=Qe2\u001c\u001e+\u0018F\u000e!G6PzSV<f?ּ^߃\tbK\u0014/GI\u0015\u001dc6xc@5qT[Gc`ܬ\u001a\u0080\u0011ƨnQ\u0005\u001b3A\rjGP@X/\u0017uaQP\u001a62SoԞqƴ\u0010:\u001e3+y`1G\u0007)_%?\u000f\u000fckfd%!-ŢTĀ-\u0001\u00015\u001cMR%\u0019Ngr\u001et]P\\~OCH\u0013]\u05f5/ܰ\u0010~i\u007f)JNK;rajB՝,[aB\u0016\bNém\u05fczֈ`Y\u0014!\u0018fcP$-.b0ƁCT.\u000bFJ#ҚPڜ\u0012˩S\u00049>!g\"\u0002\u0006^X'Y{6FYo\u0011\n\u0012x*ߣ]̦\u0007h7\u0015\b|uf+F?M\\\"\t^H\u0018k \u0007 FǼ\u001dӔ#8\u000e\"7!\u0018yv.\u0004O\n\u001f[3y1y1^ddݡ'ݺy\u00060\u001562\u0004l[{|\t\u000b{r[\u001ce\u0003(\u0013ÆRÑ\u001cμ\u0003JdR!J\u000f\t,'G7Gb\f\u0011Ug\u001f\u0004sÒlϻ9ĿC\u001d=v\u00195p\r\u001fIRb#CZF\u0017y\u0018gZߠ\r¯EՆ+[*5rHnaS\u0001Z\bZ >\u0015=aP lh`˩CǾ7C\u001fZ\u000f#\u0001\u001c}O15\u0019`\u0004)8\b\u0015\u0001;N@ۯsÂw9xm= 81e/S%cw|+\u001a\t}J-_*Ȇ\u0017ˋ0K;\u0011,\u0017\u001eV\u000eR7$R\u0015&'\u000eLIHXأ#Ȇ^ؾ[\u0006,vD\u0005\r9U:\u0011s8;\u001a\u001c\u0002ksabMAߵ!ܵB,3;\u0015S\u0016~\bX\\\rs#g\u0013\u00140K\u0017+\u001f\u0016ƈH\u0557MtS~jn\u0005)\u0002QR2\u0010H*KN`B\u0006[$\u001bĥrݺqSe`F/U#\u0012EIR\u000f\u000f\u0011!&.cvt՝#ܖUیf\rF`2tvP\u001a]\u001e\u0016\\\u001c]у\u0004ߢd\u0017\u0019\bUI\nU -\u0014!Kh\"ܱ\fɚklM\u0018cK!KG\u000e#mx4{ƾb֓Y#QA9rHx9\r_Vl%pӍ\fکIfNoR$\r6{\u0011H0~`!ִcԀ !C8#IG@p\u001csd?,}ǢtדY%3^\u0010\u0006XN'y#\u001e\u0002!x7Ѵ\u00113Dd\u0016F\u0012f\u000bXa\u00101m\u0011Č5П>ćϸOn\\QMn P\rx8'R\u0015Yکhճ\u0012ثڡ&a\t:D\u0002qYYH)fp|Uߏz\u0093-ڿޮY\bCu\u001fFdFIPX,\\߾O\u009fUɣzۑڿshzK[Hs\f'1Iq?ˮ\u007fc\"ui\\\u0007ƃ]ϲ0Į\u0017\u0004 \u00114jL\\70/U\u0012n!Ԕ+ƽ\u0013\u06018q8ٙ\ntlhLhޠ;HՂ\u0018f}~ܱQFj\tf\u0010לE\u0006"}, d2 = {"\u001aj^A_0G\u001d\tl}h9\f^", "", "2`c.", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uR\u0018 ", "5dc\u0011T;:\u0012\u0015\b\u0004h;x\u00183o\t6", "u(E", "/mS", "=sW2e", "/mSyk1\u000b?{k\r", "uRBuF", "1n\\=T9>B#", "", "\u001aj^A_0G\u001d\t[\u000fm,R", "1n\\=T9>B#FLZ7~V\u0019U", "uR1u<", "\u001aj^A_0G\u001d\tb\u0004m\u0002", "1n\\=T9>B#FlSzhX\u0018s", "uR8u<", "\u001aj^A_0G\u001d\te\u0005g.R", "1n\\=T9>B#FkD!n\u0019\u0016Q", "uR9u<", "1n\\=T9>B#F\u000ecxhk\u001cw", "uRBu<", "2dR", "2dRy@/\u000b/\r~|", "2he", "2hey*(IUfhj", "2heyJ!\r?hg\t", "2heyI\u00123E)ef", "uR9u=", "2heyk1\u000b?{k\r", "3pd._:", "", "", "3pd._:\u0006W!\n\u0002", "uR;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "4k^<e\u000bBd", "4k^<e\u000bBd`Pvi.Jr\u001f", "4k^<e\u000bBd`po-\u0018Lq=", "4k^<e\u000bBd`o`S\u001e\ro\u001b", "4k^<e\u000bBd`\u0012\u007f+\u0018_uA", "6`b566=S", "6`b566=S`\u0003\u0003i3", "uR\u0018\u0016", "7mR", "7mRy@/\u000b/\r~|", "7me", "7mey@/\u000b/\r~|", ";h]Bf", ";h]Bfs\u0010O$\u0001HH\u001c", ";h]Bfs0HgjJG:", ";h]Bfs/9\u000ep\u000bE\u0018", ";h]BfsQXej]K>", ";nS", ";nSy*(IUfhj", "uR1u5", ";nSyJ!\r?hg\t", ";nSyI\u00123E)ef", ";nSyk1\u000b?{k\r", "=q", "=q\u001cE]x*6\u0006\u0011", ">kd@", ">kd@ }:^\u001bLdN", ">kd@ \u001e3\"\u0005Ncl", ">kd@ \u001d$H\u000b\u000faJ", ">kd@ ?C \u0005agp", "@`]4X\u001bH", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fI\t7h<\n\u0019\u0017\u001d", "@`]4X\u001bH\u001b,\u0004GJ\u000fi\u001b", "uRBu?2Hb \u0003\u0004(9x\u00121e\u000eqk$\n&\u0004Cx\u0010<L", "@`]4X\u001cGb\u001d\u0006", "@`]4X\u001cGb\u001d\u0006Bq1It\u0012R\u0012", "@d\\", "@d\\y*(IUfhj", "@d\\yJ!\r?hg\t", "@d\\yI\u00123E)ef", "@d\\yk1\u000b?{k\r", "Bh\\2f", "Bh\\2fs\u0010O$\u0001HH\u001c", "Bh\\2fs0HgjJG:", "Bh\\2fs/9\u000ep\u000bE\u0018", "Bh\\2fsQXej]K>", "Bn1Fg,", "", "Bn1Fg,\u0006W!\n\u0002", "uR\u0018\u000f", "Bn3<h)ES", "", "Bn3<h)ES`\u0003\u0003i3", "uR\u0018\u0011", "Bn59b(M", "", "Bn59b(M\u001b\u001d\u0007\u0006e", "uR\u0018\u0013", "Bn8;g", "Bn8;gsB[$\u0006", "Bn;<a.", "", "Bn;<a.\u0006W!\n\u0002", "uR\u0018\u0017", "BnB5b9M", "BnB5b9M\u001b\u001d\u0007\u0006e", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uR\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "BnD\u000fl;>", "BnD\u000fl;>\u001b+KaK,\u0012t", "BnD\u0016a;", "BnD\u0016a;\u0006^\n\u0001J:9X", "BnD\u0019b5@", "BnD\u0019b5@\u001b'FkD\u0015bx", "BnD [6Kb", "BnD [6Kb`f}+\bp\t1", "Fna", "Fnayk1\u000b?{k\r", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class UShort implements Comparable<UShort> {
    public static final Companion Companion = new Companion(null);
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    private final short data;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\rnj?0JͣIDɟ\u0004*=j<9*[ҸuCIUj\u000f0\ngN\u0016iEЁ-ǈBƤو\u001azr,WXIn \u0013JB\u001eA\nހB\u00818śҽ:\u0007(20;J\u0011\u000f\u001fBH>|QŖ\u001eë\u00160H\u0081\u000b^\u001bT\u001d\u001a@\f\u0015įSɉ`gVȤԢl_B/)\"ݬFV"}, d2 = {"\u001aj^A_0G\u001d\tl}h9\fG\ro\b3wI\u0005! \u001d", "", "u(E", "\u001b@G,I\b%Cx", "\u001aj^A_0G\u001d\tl}h9\f^", "!", "\u001bH=,I\b%Cx", "!HI\u0012R\t\"B\u0007", "", "!HI\u0012R\t2Bxl", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ UShort(short s2) {
        this.data = s2;
    }

    /* JADX INFO: renamed from: and-xj2QHRw */
    private static final short m9254andxj2QHRw(short s2, short s3) {
        return m9261constructorimpl((short) ((s2 + s3) - (s2 | s3)));
    }

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ UShort m9255boximpl(short s2) {
        return new UShort(s2);
    }

    /* JADX INFO: renamed from: compareTo-7apg3OU */
    private static final int m9256compareTo7apg3OU(short s2, byte b2) {
        return Intrinsics.compare(s2 & 65535, b2 & 255);
    }

    /* JADX INFO: renamed from: compareTo-VKZWuLQ */
    private static final int m9257compareToVKZWuLQ(short s2, long j2) {
        long j3 = s2;
        return Long.compareUnsigned(ULong.m9154constructorimpl((j3 + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (j3 | WebSocketProtocol.PAYLOAD_SHORT_MAX)), j2);
    }

    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns */
    private static final int m9258compareToWZ4Q5Ns(short s2, int i2) {
        return Integer.compareUnsigned(UInt.m9075constructorimpl((s2 + 65535) - (s2 | 65535)), i2);
    }

    /* JADX INFO: renamed from: compareTo-xj2QHRw */
    private int m9259compareToxj2QHRw(short s2) {
        return Intrinsics.compare(m9311unboximpl() & 65535, (s2 + 65535) - (s2 | 65535));
    }

    /* JADX INFO: renamed from: compareTo-xj2QHRw */
    private static int m9260compareToxj2QHRw(short s2, short s3) {
        return Intrinsics.compare((-1) - (((-1) - s2) | ((-1) - 65535)), (s3 + 65535) - (s3 | 65535));
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static short m9261constructorimpl(short s2) {
        return s2;
    }

    /* JADX INFO: renamed from: dec-Mh2AYeg */
    private static final short m9262decMh2AYeg(short s2) {
        return m9261constructorimpl((short) (s2 - 1));
    }

    /* JADX INFO: renamed from: div-7apg3OU */
    private static final int m9263div7apg3OU(short s2, byte b2) {
        return Integer.divideUnsigned(UInt.m9075constructorimpl(s2 & 65535), UInt.m9075constructorimpl((b2 + 255) - (b2 | 255)));
    }

    /* JADX INFO: renamed from: div-VKZWuLQ */
    private static final long m9264divVKZWuLQ(short s2, long j2) {
        return Long.divideUnsigned(ULong.m9154constructorimpl((-1) - (((-1) - ((long) s2)) | ((-1) - WebSocketProtocol.PAYLOAD_SHORT_MAX))), j2);
    }

    /* JADX INFO: renamed from: div-WZ4Q5Ns */
    private static final int m9265divWZ4Q5Ns(short s2, int i2) {
        return Integer.divideUnsigned(UInt.m9075constructorimpl(s2 & 65535), i2);
    }

    /* JADX INFO: renamed from: div-xj2QHRw */
    private static final int m9266divxj2QHRw(short s2, short s3) {
        return Integer.divideUnsigned(UInt.m9075constructorimpl((s2 + 65535) - (s2 | 65535)), UInt.m9075constructorimpl((-1) - (((-1) - s3) | ((-1) - 65535))));
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m9267equalsimpl(short s2, Object obj) {
        return (obj instanceof UShort) && s2 == ((UShort) obj).m9311unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m9268equalsimpl0(short s2, short s3) {
        return s2 == s3;
    }

    /* JADX INFO: renamed from: floorDiv-7apg3OU */
    private static final int m9269floorDiv7apg3OU(short s2, byte b2) {
        return Integer.divideUnsigned(UInt.m9075constructorimpl(s2 & 65535), UInt.m9075constructorimpl((b2 + 255) - (b2 | 255)));
    }

    /* JADX INFO: renamed from: floorDiv-VKZWuLQ */
    private static final long m9270floorDivVKZWuLQ(short s2, long j2) {
        return Long.divideUnsigned(ULong.m9154constructorimpl((-1) - (((-1) - ((long) s2)) | ((-1) - WebSocketProtocol.PAYLOAD_SHORT_MAX))), j2);
    }

    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns */
    private static final int m9271floorDivWZ4Q5Ns(short s2, int i2) {
        return Integer.divideUnsigned(UInt.m9075constructorimpl((s2 + 65535) - (s2 | 65535)), i2);
    }

    /* JADX INFO: renamed from: floorDiv-xj2QHRw */
    private static final int m9272floorDivxj2QHRw(short s2, short s3) {
        return Integer.divideUnsigned(UInt.m9075constructorimpl(s2 & 65535), UInt.m9075constructorimpl((-1) - (((-1) - s3) | ((-1) - 65535))));
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m9273hashCodeimpl(short s2) {
        return Short.hashCode(s2);
    }

    /* JADX INFO: renamed from: inc-Mh2AYeg */
    private static final short m9274incMh2AYeg(short s2) {
        return m9261constructorimpl((short) (s2 + 1));
    }

    /* JADX INFO: renamed from: inv-Mh2AYeg */
    private static final short m9275invMh2AYeg(short s2) {
        return m9261constructorimpl((short) (~s2));
    }

    /* JADX INFO: renamed from: minus-7apg3OU */
    private static final int m9276minus7apg3OU(short s2, byte b2) {
        return UInt.m9075constructorimpl(UInt.m9075constructorimpl(s2 & 65535) - UInt.m9075constructorimpl((-1) - (((-1) - b2) | ((-1) - 255))));
    }

    /* JADX INFO: renamed from: minus-VKZWuLQ */
    private static final long m9277minusVKZWuLQ(short s2, long j2) {
        return ULong.m9154constructorimpl(ULong.m9154constructorimpl((-1) - (((-1) - ((long) s2)) | ((-1) - WebSocketProtocol.PAYLOAD_SHORT_MAX))) - j2);
    }

    /* JADX INFO: renamed from: minus-WZ4Q5Ns */
    private static final int m9278minusWZ4Q5Ns(short s2, int i2) {
        return UInt.m9075constructorimpl(UInt.m9075constructorimpl((s2 + 65535) - (s2 | 65535)) - i2);
    }

    /* JADX INFO: renamed from: minus-xj2QHRw */
    private static final int m9279minusxj2QHRw(short s2, short s3) {
        return UInt.m9075constructorimpl(UInt.m9075constructorimpl((s2 + 65535) - (s2 | 65535)) - UInt.m9075constructorimpl(s3 & 65535));
    }

    /* JADX INFO: renamed from: mod-7apg3OU */
    private static final byte m9280mod7apg3OU(short s2, byte b2) {
        return UByte.m8998constructorimpl((byte) Integer.remainderUnsigned(UInt.m9075constructorimpl(s2 & 65535), UInt.m9075constructorimpl(b2 & 255)));
    }

    /* JADX INFO: renamed from: mod-VKZWuLQ */
    private static final long m9281modVKZWuLQ(short s2, long j2) {
        return Long.remainderUnsigned(ULong.m9154constructorimpl(((long) s2) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j2);
    }

    /* JADX INFO: renamed from: mod-WZ4Q5Ns */
    private static final int m9282modWZ4Q5Ns(short s2, int i2) {
        return Integer.remainderUnsigned(UInt.m9075constructorimpl((-1) - (((-1) - s2) | ((-1) - 65535))), i2);
    }

    /* JADX INFO: renamed from: mod-xj2QHRw */
    private static final short m9283modxj2QHRw(short s2, short s3) {
        return m9261constructorimpl((short) Integer.remainderUnsigned(UInt.m9075constructorimpl(s2 & 65535), UInt.m9075constructorimpl((s3 + 65535) - (s3 | 65535))));
    }

    /* JADX INFO: renamed from: or-xj2QHRw */
    private static final short m9284orxj2QHRw(short s2, short s3) {
        return m9261constructorimpl((short) (s2 | s3));
    }

    /* JADX INFO: renamed from: plus-7apg3OU */
    private static final int m9285plus7apg3OU(short s2, byte b2) {
        return UInt.m9075constructorimpl(UInt.m9075constructorimpl(s2 & 65535) + UInt.m9075constructorimpl((b2 + 255) - (b2 | 255)));
    }

    /* JADX INFO: renamed from: plus-VKZWuLQ */
    private static final long m9286plusVKZWuLQ(short s2, long j2) {
        long j3 = s2;
        return ULong.m9154constructorimpl(ULong.m9154constructorimpl((j3 + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (j3 | WebSocketProtocol.PAYLOAD_SHORT_MAX)) + j2);
    }

    /* JADX INFO: renamed from: plus-WZ4Q5Ns */
    private static final int m9287plusWZ4Q5Ns(short s2, int i2) {
        return UInt.m9075constructorimpl(UInt.m9075constructorimpl(s2 & 65535) + i2);
    }

    /* JADX INFO: renamed from: plus-xj2QHRw */
    private static final int m9288plusxj2QHRw(short s2, short s3) {
        return UInt.m9075constructorimpl(UInt.m9075constructorimpl(s2 & 65535) + UInt.m9075constructorimpl((-1) - (((-1) - s3) | ((-1) - 65535))));
    }

    /* JADX INFO: renamed from: rangeTo-xj2QHRw */
    private static final UIntRange m9289rangeToxj2QHRw(short s2, short s3) {
        return new UIntRange(UInt.m9075constructorimpl((-1) - (((-1) - s2) | ((-1) - 65535))), UInt.m9075constructorimpl((-1) - (((-1) - s3) | ((-1) - 65535))), null);
    }

    /* JADX INFO: renamed from: rangeUntil-xj2QHRw */
    private static final UIntRange m9290rangeUntilxj2QHRw(short s2, short s3) {
        return URangesKt.m10248untilJ1ME1BU(UInt.m9075constructorimpl(s2 & 65535), UInt.m9075constructorimpl(s3 & 65535));
    }

    /* JADX INFO: renamed from: rem-7apg3OU */
    private static final int m9291rem7apg3OU(short s2, byte b2) {
        return Integer.remainderUnsigned(UInt.m9075constructorimpl((s2 + 65535) - (s2 | 65535)), UInt.m9075constructorimpl(b2 & 255));
    }

    /* JADX INFO: renamed from: rem-VKZWuLQ */
    private static final long m9292remVKZWuLQ(short s2, long j2) {
        long j3 = s2;
        return Long.remainderUnsigned(ULong.m9154constructorimpl((j3 + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (j3 | WebSocketProtocol.PAYLOAD_SHORT_MAX)), j2);
    }

    /* JADX INFO: renamed from: rem-WZ4Q5Ns */
    private static final int m9293remWZ4Q5Ns(short s2, int i2) {
        return Integer.remainderUnsigned(UInt.m9075constructorimpl((s2 + 65535) - (s2 | 65535)), i2);
    }

    /* JADX INFO: renamed from: rem-xj2QHRw */
    private static final int m9294remxj2QHRw(short s2, short s3) {
        return Integer.remainderUnsigned(UInt.m9075constructorimpl((-1) - (((-1) - s2) | ((-1) - 65535))), UInt.m9075constructorimpl((s3 + 65535) - (s3 | 65535)));
    }

    /* JADX INFO: renamed from: times-7apg3OU */
    private static final int m9295times7apg3OU(short s2, byte b2) {
        return UInt.m9075constructorimpl(UInt.m9075constructorimpl((-1) - (((-1) - s2) | ((-1) - 65535))) * UInt.m9075constructorimpl((b2 + 255) - (b2 | 255)));
    }

    /* JADX INFO: renamed from: times-VKZWuLQ */
    private static final long m9296timesVKZWuLQ(short s2, long j2) {
        long j3 = s2;
        return ULong.m9154constructorimpl(ULong.m9154constructorimpl((j3 + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (j3 | WebSocketProtocol.PAYLOAD_SHORT_MAX)) * j2);
    }

    /* JADX INFO: renamed from: times-WZ4Q5Ns */
    private static final int m9297timesWZ4Q5Ns(short s2, int i2) {
        return UInt.m9075constructorimpl(UInt.m9075constructorimpl((s2 + 65535) - (s2 | 65535)) * i2);
    }

    /* JADX INFO: renamed from: times-xj2QHRw */
    private static final int m9298timesxj2QHRw(short s2, short s3) {
        return UInt.m9075constructorimpl(UInt.m9075constructorimpl(s2 & 65535) * UInt.m9075constructorimpl(s3 & 65535));
    }

    /* JADX INFO: renamed from: toByte-impl */
    private static final byte m9299toByteimpl(short s2) {
        return (byte) s2;
    }

    /* JADX INFO: renamed from: toDouble-impl */
    private static final double m9300toDoubleimpl(short s2) {
        return s2 & 65535;
    }

    /* JADX INFO: renamed from: toFloat-impl */
    private static final float m9301toFloatimpl(short s2) {
        return (s2 + 65535) - (s2 | 65535);
    }

    /* JADX INFO: renamed from: toInt-impl */
    private static final int m9302toIntimpl(short s2) {
        return (s2 + 65535) - (s2 | 65535);
    }

    /* JADX INFO: renamed from: toLong-impl */
    private static final long m9303toLongimpl(short s2) {
        return ((long) s2) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
    }

    /* JADX INFO: renamed from: toShort-impl */
    private static final short m9304toShortimpl(short s2) {
        return s2;
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m9305toStringimpl(short s2) {
        return String.valueOf(s2 & 65535);
    }

    /* JADX INFO: renamed from: toUByte-w2LRezQ */
    private static final byte m9306toUBytew2LRezQ(short s2) {
        return UByte.m8998constructorimpl((byte) s2);
    }

    /* JADX INFO: renamed from: toUInt-pVg5ArA */
    private static final int m9307toUIntpVg5ArA(short s2) {
        return UInt.m9075constructorimpl((s2 + 65535) - (s2 | 65535));
    }

    /* JADX INFO: renamed from: toULong-s-VKNKU */
    private static final long m9308toULongsVKNKU(short s2) {
        return ULong.m9154constructorimpl(((long) s2) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    /* JADX INFO: renamed from: toUShort-Mh2AYeg */
    private static final short m9309toUShortMh2AYeg(short s2) {
        return s2;
    }

    /* JADX INFO: renamed from: xor-xj2QHRw */
    private static final short m9310xorxj2QHRw(short s2, short s3) {
        return m9261constructorimpl((short) (s2 ^ s3));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UShort uShort) {
        return Intrinsics.compare(m9311unboximpl() & 65535, uShort.m9311unboximpl() & 65535);
    }

    public boolean equals(Object obj) {
        return m9267equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m9273hashCodeimpl(this.data);
    }

    public String toString() {
        return m9305toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ short m9311unboximpl() {
        return this.data;
    }
}
