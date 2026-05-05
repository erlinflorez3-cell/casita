package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ULongRange;
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
@Metadata(bv = {}, d1 = {"Яl\u001d<K!&i\u000eQLш|\u0004O\r8\u000b4I\u0007\":\u0018\u007f\u0007|jA0JeP.hS2\u000fq}<$q$yCA`\"}0\u0012WNu˧vJ`+K\u000f\u001c\u0016\u0001j2[]xk\u0015\u00172HpG3[sE9fu>\u0005.7*8\u007f\n\t\u001a8P\u0018v\u0001DS\f <Hp@^\u0013˧C0Ň$;P\u0007.^wNdԟ\u001b\\r. CxHM7c>|e\rtUܮ\u0011xg 9C\u007fK#+k\u00035Ѹ\fC\u0011F\n=3ؒmݘ5ʁwY<`\u000e\u001d]A]\u0017urTg5Un\u0013?+}o\u0012ּ\u0016߭{|\u0002\u001aJ\u0012V\u001c5RF-Hq8\u0012A{\u000bSn_HޑJȸ~c<'3\u0011{AG%~Q\u0010FIRE\u0003\u001d\rLŀGͱ)ƟX\u0010f')g@g?[X=vY:]Kt\u001cp\u0011\u0016pʾ8Ͻ\u00041\u0002&<-mHiP;!\u001aȵ\u000fֻoѱ\u0004\u009bĈWkX`N%7,EC!\f\tե\u0015\tyWlXZ\u001d\u0014Ʉ\\Θ\u0002\n\u0019:j\u0013\u000573)fO\u0017ȉ\u001bQk\u0011=/\u0015F ʬsް[;dOCn,&ok\u000f\u0014mֺ\u0013\tfmZS:ȗ#̭*ĘLl\u0016\u0016\nM\u0017\"!KWqJع\\5'c-H12\tˎ\u0005Ȥc\\n/\rt{<\u0011\u000b<t7#\u0001b~v\u007fz_++\u0004hϡBپ9\u001b,y0\u000e|\u00131-\u0017s.ø\u0018PUS\u0005\u0016$aB\u0095\u001c׀=S5d!*G?@(EEzǩ\u0016U[\u0019?z+\tU\u0098n\u05cek\np\u0019:}3`]z/\"%ܥ#'\u0016k\u0018y\u0010¿Aúiӝ\u000f]Dr\u0001\f\"R\\^\u0015\u0005MǇU\u0005})\u00155[Wmݼ\u001c߳\u00181\u001b\fk\n8<\b\u000e'&#pJёb݁sdW\n@h\u0001Zg-V\"RЗIܱPݬv٤ɚ\r6\u0013bVD-\u0002dhe\u000b]̎-\u00862߱o£ݍ>\u0015u/B1(@\u0002u\u0016\u0014\rƹU\u0015[Z\u007fm\u001cW#֭R؝\u000e\r\u0002d|-dS.\tob7ݵ6w&=Y;\u0011\u0014\u0003ʇ,Ҭ0>\u000e?Qq2\u001c\u001e-\u0018F\u000eʕG6PzSV<֊?ּ^߃\tbK\u0016/3I\u0015\u001de6xc̍5qT[Gc`\u0015\u001a\u0080\u0011ƨnQ\u0005\u001d3K\rjGR@X/\u0017uaQP\u001a62SoԞqƴ\u0010:\u001e5+{`1G\t)_%?\u000f\u000fckfd%!-ŢTĀ-\u0001\u00017\u001cMR%\u0019Pgr\u001eۮ]P\\~OCH݅]\u05f5/ܰ\u0010~i\u0002)6NK;tajB;,[aB\u0016\bN4m\u05fczֈ`Y\u0014#\u0018\u001bcP$0.b0ƁCT.\u000bFJ#ҚPڜ\u0012˩S\u00049A!g\"\u0002\u0006aX'Yˊ6FYo\u0011\n\u0012x*ߣ]̦\u0007h7\u0018\b\nuf+I?M\\߾\t^H\u0018k \u0007 FǼ\u001dӔ#8\u000e%7-\u0018yv1\u0004O\n¾[3y1y1^ܼdݡ'ݺy\u00060\u00186\u001e\u0004l[~|\t\u000b֬r[\u001ce\u0003(\u0013\tRÑ\u001cμ\u0003JdU!T\u000f\t,*G7Ge\f\u0011Ug\u001f\u0004sÒlϻ9ĿC\u001d=y\u00198p\r\u001fLRb#FZF\u0017y\u0018gZߠ\r¯EՆ+[*8rKnaS\u0004Z\bZֶ>\u0015=aP lh`˩CǾ7C\u001f]\u000f0\u0001\u001c}R15\u0019\u070e\u0004)8\b\u0015\u0001;N@ۯsÂw9xp=,81e2S%c֍|+\u001a\t}J-\u07b7*Ȇ\u0017ˋ0K;\u0014,\u0003\u001eV\u000eU7$RԖ&'\u000eLIHXs#Ȇ^ؾ[\u0006,yD\u000f\r<U=\u0011s8\u07bf\u001a\u001c\u00026sabLAߵ#ދ=Ϡ̘p\tK v\u0017S]\u001b\u0019,7=ѨY7%N(O Kqߘ|ۂ.ۗґ@\u0015yXHO*L\b\u001dXYXƊ]\u0016bj\u0003j\u001c]&ݘ@ݙ\u0011\u000f\nN?m)\u0016nr0'yĴv:j\u007feA\u0011\u001a\u0007ǋ,ۮ2D\u0012b\u00143v^%W\u0016J\u000fňC7UzYG@͟B\u05fc%Ǳ_'\f}us\u0010UcGp=gߒ;qX_Me\u000b\u0019\u001cمSߠ/\u0017\u0006D9N\u0010dLtBX4i\fŁNЄHzJ\u0005{\u000ex>^]rC\f`b\u0603C֘\u0019g\u0005\u0013p\u0019$r\u001f\u000eOW\u001d6\u001cƲ3ӟ\u0006\u0005\u0016&'xS,a J#\"\u0018wč\u0002ţ`K[d{vX\u0011o39/4@uϝQгZgE\u0003eBG\u001a.\u0012<\u0006A\u0010)Ԃ\u0019َ\u0012$eoZ$\u001f6V:q\u0011\u001521#ߪx\u000e4|FGNN\u0014\u0004z\u001ccG&ޖ2ʡoĤºSl\u0002\u001esM/\u0006gB]+$(\u0005ҀwĪbٔȓ\u0018pWRfk_h47+\u0002Hܮlɇ\u0002ǔ(ܦşYesb\u0002W)\"g-\u00040\u0013\u000e9ژjڣbޗ̈́Ln\u001f`]kcgR]!`\u001fֳq\u0014psD'dŲ1ߠ\u000bΞOc\u001d\u0010EMG7u3R\"\u0010#\nԥ{ϕLԴ\u0012pi\u07bf%}c7D\u0012Ѯ+|Ђ\u0004>\u0015sÛl\u0007U0\n\u000bΞ6D"}, d2 = {"\u001aj^A_0G\u001d\te\u0005g.R", "", "2`c.", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "5dc\u0011T;:\u0012\u0015\b\u0004h;x\u00183o\t6", "u(E", "/mS", "=sW2e", "/mSyI\u00123E)ef", "uI9u=", "1n\\=T9>B#", "", "\u001aj^A_0G\u001d\t[\u000fm,R", "1n\\=T9>B#FLZ7~V\u0019U", "uI1u<", "\u001aj^A_0G\u001d\tb\u0004m\u0002", "1n\\=T9>B#FlSzhX\u0018s", "uI8u<", "1n\\=T9>B#FkD!n\u0019\u0016Q", "uI9u<", "\u001aj^A_0G\u001d\tl}h9\f^", "1n\\=T9>B#F\u000ecxhk\u001cw", "uIBu<", "2dR", "2dRyfs/9\u0002dj", "2he", "2hey*(IUfhj", "uI1u=", "2heyJ!\r?hg\t", "uI8u=", "2heyI\u00123E)ef", "2heyk1\u000b?{k\r", "uIBu=", "3pd._:", "", "", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "4k^<e\u000bBd", "4k^<e\u000bBd`Pvi.Jr\u001f", "4k^<e\u000bBd`po-\u0018Lq=", "4k^<e\u000bBd`o`S\u001e\ro\u001b", "4k^<e\u000bBd`\u0012\u007f+\u0018_uA", "6`b566=S", "6`b566=S`\u0003\u0003i3", "uI\u0018\u0016", "7mR", "7mRyfs/9\u0002dj", "7me", "7meyfs/9\u0002dj", ";h]Bf", ";h]Bfs\u0010O$\u0001HH\u001c", ";h]Bfs0HgjJG:", ";h]Bfs/9\u000ep\u000bE\u0018", ";h]BfsQXej]K>", ";nS", ";nSy*(IUfhj", "uI1u5", ";nSyJ!\r?hg\t", ";nSyI\u00123E)ef", ";nSyk1\u000b?{k\r", "uIBuF", "=q", "=q\u001c#>!0c\u007fj", ">kd@", ">kd@ }:^\u001bLdN", ">kd@ \u001e3\"\u0005Ncl", ">kd@ \u001d$H\u000b\u000faJ", ">kd@ ?C \u0005agp", "@`]4X\u001bH", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fL\n1}-| \u0019GE", "@`]4X\u001bH\u001b\ndoP<ct", "uI9u?2Hb \u0003\u0004(9x\u00121e\u000eqk'\u000b \u00194k\u0017>vz", "@`]4X\u001cGb\u001d\u0006", "@`]4X\u001cGb\u001d\u0006BO\u0012qz?Lk", "@d\\", "@d\\y*(IUfhj", "@d\\yJ!\r?hg\t", "@d\\yI\u00123E)ef", "@d\\yk1\u000b?{k\r", "Ag[", "0hc\u0010b<Gb", "Ag[yfs/9\u0002dj", "Aga", "Agayfs/9\u0002dj", "Bh\\2f", "Bh\\2fs\u0010O$\u0001HH\u001c", "Bh\\2fs0HgjJG:", "Bh\\2fs/9\u000ep\u000bE\u0018", "Bh\\2fsQXej]K>", "Bn1Fg,", "", "Bn1Fg,\u0006W!\n\u0002", "uI\u0018\u000f", "Bn3<h)ES", "", "Bn3<h)ES`\u0003\u0003i3", "uI\u0018\u0011", "Bn59b(M", "", "Bn59b(M\u001b\u001d\u0007\u0006e", "uI\u0018\u0013", "Bn8;g", "Bn8;gsB[$\u0006", "Bn;<a.", "Bn;<a.\u0006W!\n\u0002", "BnB5b9M", "", "BnB5b9M\u001b\u001d\u0007\u0006e", "uI\u0018 ", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "BnD\u000fl;>", "BnD\u000fl;>\u001b+KaK,\u0012t", "BnD\u0016a;", "BnD\u0016a;\u0006^\n\u0001J:9X", "BnD\u0019b5@", "BnD\u0019b5@\u001b'FkD\u0015bx", "BnD [6Kb", "BnD [6Kb`f}+\bp\t1", "Fna", "FnayI\u00123E)ef", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class ULong implements Comparable<ULong> {
    public static final Companion Companion = new Companion(null);
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;
    private final long data;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\rnj?0JͣIDɟ\u0004*=j<9*[ҸuCIUj\u000f0\ngN\u0016iEЁ-ǈBƤو\u001azr,WXIn \u0013JB\u001eA\nހB\u00818śҽ:\u0007(20;J\u0011\u000f\u001fBH>|QŖ\u001eë\u00160H\u0081\u000b^\u001bT\u001d\u001a@\f\u0015įSɉ`gVȤԢl_B/)\"ݬFV"}, d2 = {"\u001aj^A_0G\u001d\te\u0005g.;f9m\u000b$\u0005D\u000b l", "", "u(E", "\u001b@G,I\b%Cx", "\u001aj^A_0G\u001d\te\u0005g.R", "\u0018", "\u001bH=,I\b%Cx", "!HI\u0012R\t\"B\u0007", "", "!HI\u0012R\t2Bxl", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ ULong(long j2) {
        this.data = j2;
    }

    /* JADX INFO: renamed from: and-VKZWuLQ */
    private static final long m9147andVKZWuLQ(long j2, long j3) {
        return m9154constructorimpl(j2 & j3);
    }

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ ULong m9148boximpl(long j2) {
        return new ULong(j2);
    }

    /* JADX INFO: renamed from: compareTo-7apg3OU */
    private static final int m9149compareTo7apg3OU(long j2, byte b2) {
        return Long.compareUnsigned(j2, m9154constructorimpl(((long) b2) & 255));
    }

    /* JADX INFO: renamed from: compareTo-VKZWuLQ */
    private int m9150compareToVKZWuLQ(long j2) {
        return UnsignedKt.ulongCompare(m9206unboximpl(), j2);
    }

    /* JADX INFO: renamed from: compareTo-VKZWuLQ */
    private static int m9151compareToVKZWuLQ(long j2, long j3) {
        return UnsignedKt.ulongCompare(j2, j3);
    }

    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns */
    private static final int m9152compareToWZ4Q5Ns(long j2, int i2) {
        long j3 = i2;
        return Long.compareUnsigned(j2, m9154constructorimpl((j3 + 4294967295L) - (j3 | 4294967295L)));
    }

    /* JADX INFO: renamed from: compareTo-xj2QHRw */
    private static final int m9153compareToxj2QHRw(long j2, short s2) {
        return Long.compareUnsigned(j2, m9154constructorimpl((-1) - (((-1) - ((long) s2)) | ((-1) - WebSocketProtocol.PAYLOAD_SHORT_MAX))));
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static long m9154constructorimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: dec-s-VKNKU */
    private static final long m9155decsVKNKU(long j2) {
        return m9154constructorimpl(j2 - 1);
    }

    /* JADX INFO: renamed from: div-7apg3OU */
    private static final long m9156div7apg3OU(long j2, byte b2) {
        return Long.divideUnsigned(j2, m9154constructorimpl(((long) b2) & 255));
    }

    /* JADX INFO: renamed from: div-VKZWuLQ */
    private static final long m9157divVKZWuLQ(long j2, long j3) {
        return UnsignedKt.m9333ulongDivideeb3DHEI(j2, j3);
    }

    /* JADX INFO: renamed from: div-WZ4Q5Ns */
    private static final long m9158divWZ4Q5Ns(long j2, int i2) {
        return Long.divideUnsigned(j2, m9154constructorimpl(((long) i2) & 4294967295L));
    }

    /* JADX INFO: renamed from: div-xj2QHRw */
    private static final long m9159divxj2QHRw(long j2, short s2) {
        return Long.divideUnsigned(j2, m9154constructorimpl(((long) s2) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m9160equalsimpl(long j2, Object obj) {
        return (obj instanceof ULong) && j2 == ((ULong) obj).m9206unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m9161equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: floorDiv-7apg3OU */
    private static final long m9162floorDiv7apg3OU(long j2, byte b2) {
        long j3 = b2;
        return Long.divideUnsigned(j2, m9154constructorimpl((j3 + 255) - (j3 | 255)));
    }

    /* JADX INFO: renamed from: floorDiv-VKZWuLQ */
    private static final long m9163floorDivVKZWuLQ(long j2, long j3) {
        return Long.divideUnsigned(j2, j3);
    }

    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns */
    private static final long m9164floorDivWZ4Q5Ns(long j2, int i2) {
        long j3 = i2;
        return Long.divideUnsigned(j2, m9154constructorimpl((j3 + 4294967295L) - (j3 | 4294967295L)));
    }

    /* JADX INFO: renamed from: floorDiv-xj2QHRw */
    private static final long m9165floorDivxj2QHRw(long j2, short s2) {
        long j3 = s2;
        return Long.divideUnsigned(j2, m9154constructorimpl((j3 + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (j3 | WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m9166hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* JADX INFO: renamed from: inc-s-VKNKU */
    private static final long m9167incsVKNKU(long j2) {
        return m9154constructorimpl(j2 + 1);
    }

    /* JADX INFO: renamed from: inv-s-VKNKU */
    private static final long m9168invsVKNKU(long j2) {
        return m9154constructorimpl(~j2);
    }

    /* JADX INFO: renamed from: minus-7apg3OU */
    private static final long m9169minus7apg3OU(long j2, byte b2) {
        return m9154constructorimpl(j2 - m9154constructorimpl((-1) - (((-1) - ((long) b2)) | ((-1) - 255))));
    }

    /* JADX INFO: renamed from: minus-VKZWuLQ */
    private static final long m9170minusVKZWuLQ(long j2, long j3) {
        return m9154constructorimpl(j2 - j3);
    }

    /* JADX INFO: renamed from: minus-WZ4Q5Ns */
    private static final long m9171minusWZ4Q5Ns(long j2, int i2) {
        return m9154constructorimpl(j2 - m9154constructorimpl((-1) - (((-1) - ((long) i2)) | ((-1) - 4294967295L))));
    }

    /* JADX INFO: renamed from: minus-xj2QHRw */
    private static final long m9172minusxj2QHRw(long j2, short s2) {
        return m9154constructorimpl(j2 - m9154constructorimpl(((long) s2) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* JADX INFO: renamed from: mod-7apg3OU */
    private static final byte m9173mod7apg3OU(long j2, byte b2) {
        long j3 = b2;
        return UByte.m8998constructorimpl((byte) Long.remainderUnsigned(j2, m9154constructorimpl((j3 + 255) - (j3 | 255))));
    }

    /* JADX INFO: renamed from: mod-VKZWuLQ */
    private static final long m9174modVKZWuLQ(long j2, long j3) {
        return Long.remainderUnsigned(j2, j3);
    }

    /* JADX INFO: renamed from: mod-WZ4Q5Ns */
    private static final int m9175modWZ4Q5Ns(long j2, int i2) {
        long j3 = i2;
        return UInt.m9075constructorimpl((int) Long.remainderUnsigned(j2, m9154constructorimpl((j3 + 4294967295L) - (j3 | 4294967295L))));
    }

    /* JADX INFO: renamed from: mod-xj2QHRw */
    private static final short m9176modxj2QHRw(long j2, short s2) {
        long j3 = s2;
        return UShort.m9261constructorimpl((short) Long.remainderUnsigned(j2, m9154constructorimpl((j3 + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (j3 | WebSocketProtocol.PAYLOAD_SHORT_MAX))));
    }

    /* JADX INFO: renamed from: or-VKZWuLQ */
    private static final long m9177orVKZWuLQ(long j2, long j3) {
        return m9154constructorimpl((j2 + j3) - (j2 & j3));
    }

    /* JADX INFO: renamed from: plus-7apg3OU */
    private static final long m9178plus7apg3OU(long j2, byte b2) {
        return m9154constructorimpl(j2 + m9154constructorimpl((-1) - (((-1) - ((long) b2)) | ((-1) - 255))));
    }

    /* JADX INFO: renamed from: plus-VKZWuLQ */
    private static final long m9179plusVKZWuLQ(long j2, long j3) {
        return m9154constructorimpl(j2 + j3);
    }

    /* JADX INFO: renamed from: plus-WZ4Q5Ns */
    private static final long m9180plusWZ4Q5Ns(long j2, int i2) {
        long j3 = i2;
        return m9154constructorimpl(j2 + m9154constructorimpl((j3 + 4294967295L) - (j3 | 4294967295L)));
    }

    /* JADX INFO: renamed from: plus-xj2QHRw */
    private static final long m9181plusxj2QHRw(long j2, short s2) {
        return m9154constructorimpl(j2 + m9154constructorimpl(((long) s2) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* JADX INFO: renamed from: rangeTo-VKZWuLQ */
    private static final ULongRange m9182rangeToVKZWuLQ(long j2, long j3) {
        return new ULongRange(j2, j3, null);
    }

    /* JADX INFO: renamed from: rangeUntil-VKZWuLQ */
    private static final ULongRange m9183rangeUntilVKZWuLQ(long j2, long j3) {
        return URangesKt.m10250untileb3DHEI(j2, j3);
    }

    /* JADX INFO: renamed from: rem-7apg3OU */
    private static final long m9184rem7apg3OU(long j2, byte b2) {
        return Long.remainderUnsigned(j2, m9154constructorimpl(((long) b2) & 255));
    }

    /* JADX INFO: renamed from: rem-VKZWuLQ */
    private static final long m9185remVKZWuLQ(long j2, long j3) {
        return UnsignedKt.m9334ulongRemaindereb3DHEI(j2, j3);
    }

    /* JADX INFO: renamed from: rem-WZ4Q5Ns */
    private static final long m9186remWZ4Q5Ns(long j2, int i2) {
        long j3 = i2;
        return Long.remainderUnsigned(j2, m9154constructorimpl((j3 + 4294967295L) - (j3 | 4294967295L)));
    }

    /* JADX INFO: renamed from: rem-xj2QHRw */
    private static final long m9187remxj2QHRw(long j2, short s2) {
        long j3 = s2;
        return Long.remainderUnsigned(j2, m9154constructorimpl((j3 + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (j3 | WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    /* JADX INFO: renamed from: shl-s-VKNKU */
    private static final long m9188shlsVKNKU(long j2, int i2) {
        return m9154constructorimpl(j2 << i2);
    }

    /* JADX INFO: renamed from: shr-s-VKNKU */
    private static final long m9189shrsVKNKU(long j2, int i2) {
        return m9154constructorimpl(j2 >>> i2);
    }

    /* JADX INFO: renamed from: times-7apg3OU */
    private static final long m9190times7apg3OU(long j2, byte b2) {
        return m9154constructorimpl(j2 * m9154constructorimpl((-1) - (((-1) - ((long) b2)) | ((-1) - 255))));
    }

    /* JADX INFO: renamed from: times-VKZWuLQ */
    private static final long m9191timesVKZWuLQ(long j2, long j3) {
        return m9154constructorimpl(j2 * j3);
    }

    /* JADX INFO: renamed from: times-WZ4Q5Ns */
    private static final long m9192timesWZ4Q5Ns(long j2, int i2) {
        return m9154constructorimpl(j2 * m9154constructorimpl(((long) i2) & 4294967295L));
    }

    /* JADX INFO: renamed from: times-xj2QHRw */
    private static final long m9193timesxj2QHRw(long j2, short s2) {
        long j3 = s2;
        return m9154constructorimpl(j2 * m9154constructorimpl((j3 + WebSocketProtocol.PAYLOAD_SHORT_MAX) - (j3 | WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    /* JADX INFO: renamed from: toByte-impl */
    private static final byte m9194toByteimpl(long j2) {
        return (byte) j2;
    }

    /* JADX INFO: renamed from: toDouble-impl */
    private static final double m9195toDoubleimpl(long j2) {
        return UnsignedKt.ulongToDouble(j2);
    }

    /* JADX INFO: renamed from: toFloat-impl */
    private static final float m9196toFloatimpl(long j2) {
        return (float) UnsignedKt.ulongToDouble(j2);
    }

    /* JADX INFO: renamed from: toInt-impl */
    private static final int m9197toIntimpl(long j2) {
        return (int) j2;
    }

    /* JADX INFO: renamed from: toLong-impl */
    private static final long m9198toLongimpl(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: toShort-impl */
    private static final short m9199toShortimpl(long j2) {
        return (short) j2;
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m9200toStringimpl(long j2) {
        return UnsignedKt.ulongToString(j2);
    }

    /* JADX INFO: renamed from: toUByte-w2LRezQ */
    private static final byte m9201toUBytew2LRezQ(long j2) {
        return UByte.m8998constructorimpl((byte) j2);
    }

    /* JADX INFO: renamed from: toUInt-pVg5ArA */
    private static final int m9202toUIntpVg5ArA(long j2) {
        return UInt.m9075constructorimpl((int) j2);
    }

    /* JADX INFO: renamed from: toULong-s-VKNKU */
    private static final long m9203toULongsVKNKU(long j2) {
        return j2;
    }

    /* JADX INFO: renamed from: toUShort-Mh2AYeg */
    private static final short m9204toUShortMh2AYeg(long j2) {
        return UShort.m9261constructorimpl((short) j2);
    }

    /* JADX INFO: renamed from: xor-VKZWuLQ */
    private static final long m9205xorVKZWuLQ(long j2, long j3) {
        return m9154constructorimpl(j2 ^ j3);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.ulongCompare(m9206unboximpl(), uLong.m9206unboximpl());
    }

    public boolean equals(Object obj) {
        return m9160equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m9166hashCodeimpl(this.data);
    }

    public String toString() {
        return m9200toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ long m9206unboximpl() {
        return this.data;
    }
}
