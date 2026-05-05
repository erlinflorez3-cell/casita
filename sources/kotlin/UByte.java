package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;
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
@Metadata(bv = {}, d1 = {"Яp\u001d<K!&i\u000eQLш|\u0004O\t8\u000b4I\u0007\":\u0018\u007f\u0007ljA0ZeP.XS2\u000f\u0002{<$a$yCQU\"}(\u0012WNupvJhŏK\u000f\f5\u0001jBI]xc!\u00172PsG3SpE9ny>\u0005&5*8\b\f\t\u001a0I\u0018v\tKS\f\u00181HpH^\u0015M\u000b&\u0018ç|6ҵ<Q\u0018TFJ|]hǂQ\u0002\"ACgn6{]\u0011TT?\r%bӿ/B=7#(\u001c\u0019\u0015Xs?1ӊ\"A\u0013o?'Yɞ:ɖ@ݼ\u0004\u0016\u001b3]\u0016&\t4f\u001dQ\u000f\u0017W/]jcP<ߊ>ߖ\u0004Ɂ@\u0006\u0014\u00125UvC(p \u000ea\u007f#WNW\u001a^p\u000eAʰ>а)\u00029:G+/goE1Ne\u00075\u0011,*\u0019nOl\u001bםhڠ\u001fV}c?d\tSVX\"Ykx4tp\tB\u0004^[F\u0083\u0004 2\u0019+LiOk2y\u0019`D\u0016ϸK£pؾhɭ͕D$t.E-Q\"h]|\u0005\u001a^\u0005\\:\u0018e\u001c\u0003͵Dܹ\u001bء`yB;3\u001d\u0017ev\u0003\u0003M\f\u0018U3t>qn\u001a\u001c\u001e\u07b2fۋ9Si+ob?*MUz\u0005\u0007wrW\u001aat(PC\u000fТ\u0018ȑ\u007fFT(!O\b\b*MD1GjEL\u0011%ZA+\u001d&ʻpʐ\u0003V9B\u0011\u007fl\r\u0017 h\\\u001f\u0010\u0018~W3\u0015b8,or{Ծ'Ɓ&j:\u001f1*G\n\u000ek\u007fLuZ\u001d\u001a\u0004\\\u0014 D֝\u007f֟5ˮ\u0017\u0011\u0005N@\u000fu[Z\u0017}Q{ W~\u000b\u0001';\u0017<.ŕpҔ0bpp]d_8\u0005\u0003\u000b#6u0}oM\u0013G\u0012eQϽDϗv\u0005_c\\UE\u001b-B=\u0001\u001e0-9;J?\u001dD\fZٴ\u001b˸akuV\bxW4\u0003\u000f\u001c,\u0012!6ͼPЄ6=>sg*\u000732\u0019\u001bBv۳>٬J߿3ؿάLCj\u001ed;\u0016\u001c=,~\u0007Zݸ7«aȞ\u0012̊ϻ80eY\u0002FF*ls=\u0011{a\u0018q{Rt\u000bx\u05faP\u03a2\u0004ϥr\u0014\"n.c x\u0017`\u001esFDq?p\fT\tRBrь\u0010դGVo8\u001e\u000bH\\m?/2p\u0005kZ\u001c[\u0011\\\u0005YKނMȚ%,\u00072\u001dPf\u000fCa\u001dmtb_g@\bk\u001d7/1ʲ\u0007ݝ)-J\tG1pn\u000f@]]q̲2:\u0012NAm\u001aƑRՌ\u001eԠ!D\u001eQGZYu\u0005ev\u000b\u0004r~h\u0005\u0019~R|0oͮ\u0001է\u0012>\u0010F\u0019)\u0018\t}\u0018EL|\tgG(\b/DW\u0018RŹi̍\u001f/\fm;Z\u0012\u0001\"\\\u0014W\u0002O.\f.'?\u0004#5#ޮ\u0014ҁ\u000e_!s$,^x\u0010D+PNɌ^N\u0003y\".6ˆ\u0016ז=ě\u0017`_(\u0006*\t=9*\u001eByv)\u000eqs{n\u0004̃Iϧ9ٟ}p3\u000f+\u0016oc<PpZh\u001f\u0004$f\u0018\u0018\u0014C4eߖ\u0010Ԗ-\u0012U#v\u00014eiJC/\u001a;\u00125>Y6}M\u000b<ê2ķ,\u0017A\u0017[[-\u001fj*ZW<l\u001b,r{$)B\u0011EĤfǚ\u00176L4,zwM'as\ru$7\bSP>!_Ĝ\u0006ו?כ\u000fq.;\u001fH\u0003x\u0003FBB760k:4^Tkԣmښ,މh\u0005,\u0013S}\u000b\u001e:Y&\u0011]hh$Lc2\u001ciǛy\u0086!֩\u0005\u0017>O}\u0014aKx\u001ak%X\u000f-\u0005\u001bF\u00121\u001aH:يzܯ3\u0011ueev\u0004;C.d':\u0013\u0016N\rT{V=rrށ=¹\"{[\f\u000e'g:2N\u000e#.SaL8ft@\u0005\b\u001eư.ń:pJoU\u0003A\n\u0018y\u0002\u0018\"r\feBH\u0013\u0014Gܒ\u0005Ϩ5ď\u000bGS7\b\u0018\r#SaO\u000f47c\u001b\u000b\u0017gqn9\u0010פUҰ`_Bb\u0002\u0014\u0003Ho\u0004\u0012GnjZ\n;\u0019lc\u0019{4˱gݳ<\u0014\u0013]\u0012\u0015yhnMx\u001dF5{zT=tx{U)ޙHǦ(`4\u0014\u001a!N$<\u001b/\u0002,K'Ő\u0019чKuG\u001b YD/+es%4z.\u07fbMˇYs^\u0014G\u000bS{X1Me\u000b^\u001cمQߠ/\u0017\u0006E9\n\u0010dLvBX4\u0019\fŁNЄHzJ\u0006{[x>^]rC\f`b\u0603C֘\u0019g\u0005\u0013p\u0019$r\u001f\u000eOW\u001d6\u001cƲ3ӟ\u0006\u0005\u0016&'xS+a J#\"twRϳ\f^O>\u000bW\u0012!\u0011Lb!]Φ\u0006ďG۔kɟ͑C\u001b]+\r\u000fh82r+$\u0011uYس\u0014\u07ba^̜Ը:X/6Y\u0005YwPY'z#\u001dtۇ>͊\u0005۳۠\u0015d\"%IA\t=<a!G}~BۙkߎeڎʡQG1g'$y\b\u001fVg_Bש\u0002`fE/WTċY˳$ݑ*c\u0002<79giqm\u0003s\u0003aGמ\u000bɋ2ټ}xnͣNeD@VqÌeOʚ\u001aQrcľ`rPA\u0016\u0002ܓ0\u001d"}, d2 = {"\u001aj^A_0G\u001d\t[\u000fm,R", "", "2`c.", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uA\u0018\u000f", "5dc\u0011T;:\u0012\u0015\b\u0004h;x\u00183o\t6", "u(E", "/mS", "=sW2e", "/mSy*(IUfhj", "uA1u5", "1n\\=T9>B#", "", "1n\\=T9>B#FLZ7~V\u0019U", "uA1u<", "\u001aj^A_0G\u001d\tb\u0004m\u0002", "1n\\=T9>B#FlSzhX\u0018s", "uA8u<", "\u001aj^A_0G\u001d\te\u0005g.R", "1n\\=T9>B#FkD!n\u0019\u0016Q", "uA9u<", "\u001aj^A_0G\u001d\tl}h9\f^", "1n\\=T9>B#F\u000ecxhk\u001cw", "uABu<", "2dR", "2dRyjx%@\u0019\u0014f", "2he", "2hey*(IUfhj", "2heyJ!\r?hg\t", "2heyI\u00123E)ef", "uA9u=", "2heyk1\u000b?{k\r", "3pd._:", "", "", "3pd._:\u0006W!\n\u0002", "uA;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "4k^<e\u000bBd", "4k^<e\u000bBd`Pvi.Jr\u001f", "4k^<e\u000bBd`po-\u0018Lq=", "4k^<e\u000bBd`o`S\u001e\ro\u001b", "4k^<e\u000bBd`\u0012\u007f+\u0018_uA", "6`b566=S", "6`b566=S`\u0003\u0003i3", "uA\u0018\u0016", "7mR", "7mRyjx%@\u0019\u0014f", "7me", "7meyjx%@\u0019\u0014f", ";h]Bf", ";h]Bfs\u0010O$\u0001HH\u001c", ";h]Bfs0HgjJG:", ";h]Bfs/9\u000ep\u000bE\u0018", ";h]BfsQXej]K>", ";nS", ";nSy*(IUfhj", ";nSyJ!\r?hg\t", ";nSyI\u00123E)ef", ";nSyk1\u000b?{k\r", "uABuF", "=q", "=q\u001c\u0004T7@!\u0003n", ">kd@", ">kd@ }:^\u001bLdN", ">kd@ \u001e3\"\u0005Ncl", ">kd@ \u001d$H\u000b\u000faJ", ">kd@ ?C \u0005agp", "@`]4X\u001bH", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fI\t7h<\n\u0019\u0017\u001d", "@`]4X\u001bH\u001bjz\u0006`yfx", "uA1u?2Hb \u0003\u0004(9x\u00121e\u000eqk$\n&\u0004Cx\u0010<L", "@`]4X\u001cGb\u001d\u0006", "@`]4X\u001cGb\u001d\u0006B0(\b\u000b|Oo", "@d\\", "@d\\y*(IUfhj", "@d\\yJ!\r?hg\t", "@d\\yI\u00123E)ef", "@d\\yk1\u000b?{k\r", "Bh\\2f", "Bh\\2fs\u0010O$\u0001HH\u001c", "Bh\\2fs0HgjJG:", "Bh\\2fs/9\u000ep\u000bE\u0018", "Bh\\2fsQXej]K>", "Bn1Fg,", "Bn1Fg,\u0006W!\n\u0002", "Bn3<h)ES", "", "Bn3<h)ES`\u0003\u0003i3", "uA\u0018\u0011", "Bn59b(M", "", "Bn59b(M\u001b\u001d\u0007\u0006e", "uA\u0018\u0013", "Bn8;g", "Bn8;gsB[$\u0006", "Bn;<a.", "", "Bn;<a.\u0006W!\n\u0002", "uA\u0018\u0017", "BnB5b9M", "", "BnB5b9M\u001b\u001d\u0007\u0006e", "uA\u0018 ", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uA\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "BnD\u000fl;>", "BnD\u000fl;>\u001b+KaK,\u0012t", "BnD\u0016a;", "BnD\u0016a;\u0006^\n\u0001J:9X", "BnD\u0019b5@", "BnD\u0019b5@\u001b'FkD\u0015bx", "BnD [6Kb", "BnD [6Kb`f}+\bp\t1", "Fna", "Fnay*(IUfhj", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class UByte implements Comparable<UByte> {
    public static final Companion Companion = new Companion(null);
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\rnj?0JͣIDɟ\u0004*=j<9*[ҸuCIUj\u000f0\ngN\u0016iEЁ-ǈBƤو\u001azr,WXIn \u0013JB\u001eA\nހB\u00818śҽ:\u0007(20;J\u0011\u000f\u001fBH>|QŖ\u001eë\u00160H\u0081\u000b^\u001bT\u001d\u001a@\f\u0015įSɉ`gVȤԢl_B/)\"ݬFV"}, d2 = {"\u001aj^A_0G\u001d\t[\u000fm,;f9m\u000b$\u0005D\u000b l", "", "u(E", "\u001b@G,I\b%Cx", "\u001aj^A_0G\u001d\t[\u000fm,R", "\u0010", "\u001bH=,I\b%Cx", "!HI\u0012R\t\"B\u0007", "", "!HI\u0012R\t2Bxl", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ UByte(byte b2) {
        this.data = b2;
    }

    /* JADX INFO: renamed from: and-7apg3OU */
    private static final byte m8991and7apg3OU(byte b2, byte b3) {
        return m8998constructorimpl((byte) ((b2 + b3) - (b2 | b3)));
    }

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ UByte m8992boximpl(byte b2) {
        return new UByte(b2);
    }

    /* JADX INFO: renamed from: compareTo-7apg3OU */
    private int m8993compareTo7apg3OU(byte b2) {
        return Intrinsics.compare(m9048unboximpl() & 255, (-1) - (((-1) - b2) | ((-1) - 255)));
    }

    /* JADX INFO: renamed from: compareTo-7apg3OU */
    private static int m8994compareTo7apg3OU(byte b2, byte b3) {
        return Intrinsics.compare(b2 & 255, (b3 + 255) - (b3 | 255));
    }

    /* JADX INFO: renamed from: compareTo-VKZWuLQ */
    private static final int m8995compareToVKZWuLQ(byte b2, long j2) {
        return Long.compareUnsigned(ULong.m9154constructorimpl(((long) b2) & 255), j2);
    }

    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns */
    private static final int m8996compareToWZ4Q5Ns(byte b2, int i2) {
        return Integer.compareUnsigned(UInt.m9075constructorimpl((-1) - (((-1) - b2) | ((-1) - 255))), i2);
    }

    /* JADX INFO: renamed from: compareTo-xj2QHRw */
    private static final int m8997compareToxj2QHRw(byte b2, short s2) {
        return Intrinsics.compare((b2 + 255) - (b2 | 255), s2 & 65535);
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static byte m8998constructorimpl(byte b2) {
        return b2;
    }

    /* JADX INFO: renamed from: dec-w2LRezQ */
    private static final byte m8999decw2LRezQ(byte b2) {
        return m8998constructorimpl((byte) (b2 - 1));
    }

    /* JADX INFO: renamed from: div-7apg3OU */
    private static final int m9000div7apg3OU(byte b2, byte b3) {
        return Integer.divideUnsigned(UInt.m9075constructorimpl((b2 + 255) - (b2 | 255)), UInt.m9075constructorimpl((b3 + 255) - (b3 | 255)));
    }

    /* JADX INFO: renamed from: div-VKZWuLQ */
    private static final long m9001divVKZWuLQ(byte b2, long j2) {
        return Long.divideUnsigned(ULong.m9154constructorimpl(((long) b2) & 255), j2);
    }

    /* JADX INFO: renamed from: div-WZ4Q5Ns */
    private static final int m9002divWZ4Q5Ns(byte b2, int i2) {
        return Integer.divideUnsigned(UInt.m9075constructorimpl((b2 + 255) - (b2 | 255)), i2);
    }

    /* JADX INFO: renamed from: div-xj2QHRw */
    private static final int m9003divxj2QHRw(byte b2, short s2) {
        return Integer.divideUnsigned(UInt.m9075constructorimpl((-1) - (((-1) - b2) | ((-1) - 255))), UInt.m9075constructorimpl((s2 + 65535) - (s2 | 65535)));
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m9004equalsimpl(byte b2, Object obj) {
        return (obj instanceof UByte) && b2 == ((UByte) obj).m9048unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m9005equalsimpl0(byte b2, byte b3) {
        return b2 == b3;
    }

    /* JADX INFO: renamed from: floorDiv-7apg3OU */
    private static final int m9006floorDiv7apg3OU(byte b2, byte b3) {
        return Integer.divideUnsigned(UInt.m9075constructorimpl(b2 & 255), UInt.m9075constructorimpl((-1) - (((-1) - b3) | ((-1) - 255))));
    }

    /* JADX INFO: renamed from: floorDiv-VKZWuLQ */
    private static final long m9007floorDivVKZWuLQ(byte b2, long j2) {
        return Long.divideUnsigned(ULong.m9154constructorimpl((-1) - (((-1) - ((long) b2)) | ((-1) - 255))), j2);
    }

    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns */
    private static final int m9008floorDivWZ4Q5Ns(byte b2, int i2) {
        return Integer.divideUnsigned(UInt.m9075constructorimpl((b2 + 255) - (b2 | 255)), i2);
    }

    /* JADX INFO: renamed from: floorDiv-xj2QHRw */
    private static final int m9009floorDivxj2QHRw(byte b2, short s2) {
        return Integer.divideUnsigned(UInt.m9075constructorimpl(b2 & 255), UInt.m9075constructorimpl((s2 + 65535) - (s2 | 65535)));
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m9010hashCodeimpl(byte b2) {
        return Byte.hashCode(b2);
    }

    /* JADX INFO: renamed from: inc-w2LRezQ */
    private static final byte m9011incw2LRezQ(byte b2) {
        return m8998constructorimpl((byte) (b2 + 1));
    }

    /* JADX INFO: renamed from: inv-w2LRezQ */
    private static final byte m9012invw2LRezQ(byte b2) {
        return m8998constructorimpl((byte) (~b2));
    }

    /* JADX INFO: renamed from: minus-7apg3OU */
    private static final int m9013minus7apg3OU(byte b2, byte b3) {
        return UInt.m9075constructorimpl(UInt.m9075constructorimpl((-1) - (((-1) - b2) | ((-1) - 255))) - UInt.m9075constructorimpl((-1) - (((-1) - b3) | ((-1) - 255))));
    }

    /* JADX INFO: renamed from: minus-VKZWuLQ */
    private static final long m9014minusVKZWuLQ(byte b2, long j2) {
        long j3 = b2;
        return ULong.m9154constructorimpl(ULong.m9154constructorimpl((j3 + 255) - (j3 | 255)) - j2);
    }

    /* JADX INFO: renamed from: minus-WZ4Q5Ns */
    private static final int m9015minusWZ4Q5Ns(byte b2, int i2) {
        return UInt.m9075constructorimpl(UInt.m9075constructorimpl((b2 + 255) - (b2 | 255)) - i2);
    }

    /* JADX INFO: renamed from: minus-xj2QHRw */
    private static final int m9016minusxj2QHRw(byte b2, short s2) {
        return UInt.m9075constructorimpl(UInt.m9075constructorimpl(b2 & 255) - UInt.m9075constructorimpl(s2 & 65535));
    }

    /* JADX INFO: renamed from: mod-7apg3OU */
    private static final byte m9017mod7apg3OU(byte b2, byte b3) {
        return m8998constructorimpl((byte) Integer.remainderUnsigned(UInt.m9075constructorimpl(b2 & 255), UInt.m9075constructorimpl((-1) - (((-1) - b3) | ((-1) - 255)))));
    }

    /* JADX INFO: renamed from: mod-VKZWuLQ */
    private static final long m9018modVKZWuLQ(byte b2, long j2) {
        return Long.remainderUnsigned(ULong.m9154constructorimpl((-1) - (((-1) - ((long) b2)) | ((-1) - 255))), j2);
    }

    /* JADX INFO: renamed from: mod-WZ4Q5Ns */
    private static final int m9019modWZ4Q5Ns(byte b2, int i2) {
        return Integer.remainderUnsigned(UInt.m9075constructorimpl((b2 + 255) - (b2 | 255)), i2);
    }

    /* JADX INFO: renamed from: mod-xj2QHRw */
    private static final short m9020modxj2QHRw(byte b2, short s2) {
        return UShort.m9261constructorimpl((short) Integer.remainderUnsigned(UInt.m9075constructorimpl((b2 + 255) - (b2 | 255)), UInt.m9075constructorimpl((s2 + 65535) - (s2 | 65535))));
    }

    /* JADX INFO: renamed from: or-7apg3OU */
    private static final byte m9021or7apg3OU(byte b2, byte b3) {
        return m8998constructorimpl((byte) (b2 | b3));
    }

    /* JADX INFO: renamed from: plus-7apg3OU */
    private static final int m9022plus7apg3OU(byte b2, byte b3) {
        return UInt.m9075constructorimpl(UInt.m9075constructorimpl(b2 & 255) + UInt.m9075constructorimpl((-1) - (((-1) - b3) | ((-1) - 255))));
    }

    /* JADX INFO: renamed from: plus-VKZWuLQ */
    private static final long m9023plusVKZWuLQ(byte b2, long j2) {
        return ULong.m9154constructorimpl(ULong.m9154constructorimpl(((long) b2) & 255) + j2);
    }

    /* JADX INFO: renamed from: plus-WZ4Q5Ns */
    private static final int m9024plusWZ4Q5Ns(byte b2, int i2) {
        return UInt.m9075constructorimpl(UInt.m9075constructorimpl(b2 & 255) + i2);
    }

    /* JADX INFO: renamed from: plus-xj2QHRw */
    private static final int m9025plusxj2QHRw(byte b2, short s2) {
        return UInt.m9075constructorimpl(UInt.m9075constructorimpl(b2 & 255) + UInt.m9075constructorimpl((-1) - (((-1) - s2) | ((-1) - 65535))));
    }

    /* JADX INFO: renamed from: rangeTo-7apg3OU */
    private static final UIntRange m9026rangeTo7apg3OU(byte b2, byte b3) {
        return new UIntRange(UInt.m9075constructorimpl((b2 + 255) - (b2 | 255)), UInt.m9075constructorimpl(b3 & 255), null);
    }

    /* JADX INFO: renamed from: rangeUntil-7apg3OU */
    private static final UIntRange m9027rangeUntil7apg3OU(byte b2, byte b3) {
        return URangesKt.m10248untilJ1ME1BU(UInt.m9075constructorimpl(b2 & 255), UInt.m9075constructorimpl(b3 & 255));
    }

    /* JADX INFO: renamed from: rem-7apg3OU */
    private static final int m9028rem7apg3OU(byte b2, byte b3) {
        return Integer.remainderUnsigned(UInt.m9075constructorimpl(b2 & 255), UInt.m9075constructorimpl(b3 & 255));
    }

    /* JADX INFO: renamed from: rem-VKZWuLQ */
    private static final long m9029remVKZWuLQ(byte b2, long j2) {
        long j3 = b2;
        return Long.remainderUnsigned(ULong.m9154constructorimpl((j3 + 255) - (j3 | 255)), j2);
    }

    /* JADX INFO: renamed from: rem-WZ4Q5Ns */
    private static final int m9030remWZ4Q5Ns(byte b2, int i2) {
        return Integer.remainderUnsigned(UInt.m9075constructorimpl(b2 & 255), i2);
    }

    /* JADX INFO: renamed from: rem-xj2QHRw */
    private static final int m9031remxj2QHRw(byte b2, short s2) {
        return Integer.remainderUnsigned(UInt.m9075constructorimpl(b2 & 255), UInt.m9075constructorimpl((s2 + 65535) - (s2 | 65535)));
    }

    /* JADX INFO: renamed from: times-7apg3OU */
    private static final int m9032times7apg3OU(byte b2, byte b3) {
        return UInt.m9075constructorimpl(UInt.m9075constructorimpl((b2 + 255) - (b2 | 255)) * UInt.m9075constructorimpl(b3 & 255));
    }

    /* JADX INFO: renamed from: times-VKZWuLQ */
    private static final long m9033timesVKZWuLQ(byte b2, long j2) {
        return ULong.m9154constructorimpl(ULong.m9154constructorimpl(((long) b2) & 255) * j2);
    }

    /* JADX INFO: renamed from: times-WZ4Q5Ns */
    private static final int m9034timesWZ4Q5Ns(byte b2, int i2) {
        return UInt.m9075constructorimpl(UInt.m9075constructorimpl(b2 & 255) * i2);
    }

    /* JADX INFO: renamed from: times-xj2QHRw */
    private static final int m9035timesxj2QHRw(byte b2, short s2) {
        return UInt.m9075constructorimpl(UInt.m9075constructorimpl((b2 + 255) - (b2 | 255)) * UInt.m9075constructorimpl((-1) - (((-1) - s2) | ((-1) - 65535))));
    }

    /* JADX INFO: renamed from: toByte-impl */
    private static final byte m9036toByteimpl(byte b2) {
        return b2;
    }

    /* JADX INFO: renamed from: toDouble-impl */
    private static final double m9037toDoubleimpl(byte b2) {
        return (b2 + 255) - (b2 | 255);
    }

    /* JADX INFO: renamed from: toFloat-impl */
    private static final float m9038toFloatimpl(byte b2) {
        return (-1) - (((-1) - b2) | ((-1) - 255));
    }

    /* JADX INFO: renamed from: toInt-impl */
    private static final int m9039toIntimpl(byte b2) {
        return b2 & 255;
    }

    /* JADX INFO: renamed from: toLong-impl */
    private static final long m9040toLongimpl(byte b2) {
        long j2 = b2;
        return (j2 + 255) - (j2 | 255);
    }

    /* JADX INFO: renamed from: toShort-impl */
    private static final short m9041toShortimpl(byte b2) {
        short s2 = b2;
        return (short) ((s2 + 255) - (s2 | 255));
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m9042toStringimpl(byte b2) {
        return String.valueOf((b2 + 255) - (b2 | 255));
    }

    /* JADX INFO: renamed from: toUByte-w2LRezQ */
    private static final byte m9043toUBytew2LRezQ(byte b2) {
        return b2;
    }

    /* JADX INFO: renamed from: toUInt-pVg5ArA */
    private static final int m9044toUIntpVg5ArA(byte b2) {
        return UInt.m9075constructorimpl((b2 + 255) - (b2 | 255));
    }

    /* JADX INFO: renamed from: toULong-s-VKNKU */
    private static final long m9045toULongsVKNKU(byte b2) {
        return ULong.m9154constructorimpl(((long) b2) & 255);
    }

    /* JADX INFO: renamed from: toUShort-Mh2AYeg */
    private static final short m9046toUShortMh2AYeg(byte b2) {
        return UShort.m9261constructorimpl((short) ((-1) - (((-1) - b2) | ((-1) - 255))));
    }

    /* JADX INFO: renamed from: xor-7apg3OU */
    private static final byte m9047xor7apg3OU(byte b2, byte b3) {
        return m8998constructorimpl((byte) (b2 ^ b3));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare((-1) - (((-1) - m9048unboximpl()) | ((-1) - 255)), uByte.m9048unboximpl() & 255);
    }

    public boolean equals(Object obj) {
        return m9004equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m9010hashCodeimpl(this.data);
    }

    public String toString() {
        return m9042toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ byte m9048unboximpl() {
        return this.data;
    }
}
