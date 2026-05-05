package kotlin;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Яp\u001d<K!&i\u000eQLш|\u0004O\f8\u000b4I\u0007\"B\u0012\u007f\u0007lkA0ZeP.XS2\u000f\u0002{<$a-yCI^\"}0ޛWNm\u0007vJp\u000bK\u000f\f(\u0001j:L]xc\u0013\u00172PsG3SpE9ny>\u0005&5*8\b\f\t\u001a0I\u0018v\tKS\f\u00181HpH^\u0015M\u000b&\u0018ç|6ҵ<V\u0018TFJ|]hǂQ\u0002\"AHgn6{]\u0011TT?\r%bӿ/B=7#(\u001c\u0019\u0015Xs?1ӊ\"A\u0013o?'Yɞ:ɖ@ݼ\u0004\u0016\u001b3]\u0016&\t4f\u001dQ\u000f\rW/]jcP<3>߆\u0004Ɂ@\u0006\u0014\u00125UvC(p \u000eau#WNW\u001a^pȕAˀ>а)\u000299G$/goE1Ne|5\u0011,*\u0019nOj\u001bםhڠ\u001fV}a?b\tSVX\"Ykn4tp\tB\u0004^YF\u0083\u0004 2\u0019+JiMk2y\u0017`D\u0016ϸK£pؾhɭ͕D$t,E-Q\"h[|\u0005\u001a¬\u0005\\:\u0018e\u001c\u0003\u0012Dܹ\u001bء`yB93\u001d\u0017ev\u0001\u0003M\f܃U3t>qn\u001aލ\u001e\u07b2fۋ9Si)o[?*MSz\u0005\u0007urW\u001aat(PA\u000fТ\u0018ȑ\u007fFT&!M\b\b*KD1G¢EL\u0011%ZA+\u001b&ʻpʐ\u0003V9@\u0011}l\r\u0017\u001eh\\\u001f\u000e\u0018~W3\u0015b8,op{Ծ'Ɓ&j:\u001d1(G\n\u000ei\u007fLuƂ\u001d\u001a\u0004\\\u0014 D%\u007f֟5ˮ\u0017\u0011\u0005L@\u000fu[Z\u0015}Q{ȼW~\u000b\u0001';\u0017֫.ŕpҔ0bpn]]_8\u0005\u0001\u000b#6s0}oM\u0013G\u0012cQϽDϗv\u0005_a\\SE\u001b-@=\u0001\u001eܲ-9;J?\u001dD\nZٴ\u001b˸akuT\bvW4\u0003\r\u001c,\u0012\u00176ͼPЄ6=>qg\u0002\u000732\u0016\u001bBv۳>٬J߿3ؿάLCj\u001bd;\u0016\u001c=)~\u0007Zݸ7«aȞ\u0012̊ϻ80eV\u0002FF*lp=\u0011{ω\u0018q{Rt\u000bx\u001aP\u03a2\u0004ϥr\u0014\"k.c x\u0017]\u001esFܽq?p\fT\tR҉rь\u0010դGVo5\u001e\u0004H\\m</2p\u0003kZ\u001c[\u0011\\\u0005WKނMȚ%,\u0007/\u001dNf\u000fC^\u001dmt\u07bc_g@\bk\u001d7-1ʲ\u0007ݝ)-J\u0006G/pn\u000f=]]qT2:\u0012NAm\u001azRՌ\u001eԠ!D\u001eNG\u0006Yu\u0005bv\u000b\u0004̤~h\u0005\u0019~R|Ýoͮ\u0001է\u0012>\u0010D\u0019\"\u0018\t}\u0015EL|\u0007gG(\b/DW\u0016RŹi̍\u001f/\fk;X\u0012\u0001\"Y\u0014W\u0002M.\f.'?\u0004#3#ޮ\u0014ҁ\u000e_!q$*^x\u0010B+PNɌ^N\u0003y\".6ˆ\u0016ז=ě\u0017`_&\u0006*\t=9(\u001eByЕ)\u000eqs{n\u0004\u0016Iϧ9ٟ}p3\r+\u0016oc<NpZhÎ\u0004$f\u0018\u0018\u0014Cұeߖ\u0010Ԗ-\u0012U!vy4eiHC/\u001a9\u00125>Y6}M\t<ê2ķ,\u0017A\u0015[Y-\u001fj(ZW<ߜ\u001b,r{$)B\u000fEĤfǚ\u00176L2,xwM'_s\ru\"7\bSP>!_Ĝ\u0006ו?כ\u000fq.9\u001fF\u0003x\u0003DBB740k:4^Tkԣmښ,މh\u0005,\u0011S{\u000b\u001e:W&\u0011]դh$Lc2\u001ci\\y\u0086!֩\u0005\u0017>M}\u0014aKx\u0018k%Xʈ-\u0005\u001bF\u00121\u001a\u009f:يzܯ3\u0011uceo\u0004;C,d':\u0011\u0016N\rT{V=prށ=¹\"{[\n\u000e%g:2L\u000e#.ӚaL8ft@\u0005\u0006\u001eư.ń:pJmU\u0001A\r\u0018w\u0002\u0018\"ߪ\feB\u000e\u0013\u0014GE\u0005Ϩ7ť\u0006ŵޣl{\u0011\u0012\u001bN\\P\u001dTA3Eτ@S\u007f\rCI!Nu۟gۣ\u0012Ŏ̿>4g\u0006\bP\to8VE\u0012\u0003ĝ\u001bn{Xw\u0010f\u001dSŷ\fֶ5TfQn*`=YG^6\u000b\u070e}Ep\u0012X\u000fRۋt˿\u0014ƨ\n\u00184\u001b%\u000bF`ne+3u\u0003qK ]\u0014!K \"ܱ\u000eɚklM\u0013c\r!SG\u0004#mxկeij\fm!yvq۪\bԐ/0M+L.rf\u0014c]dvf\u000bѕJڍq26\b^W#QkZ4\u001fk0[֯\u0005Ǒf9a@\u001f\b\u007fe|0m#[WHϿ\u0016Ā\u001d\u0015\u0011}a\u001az1\u0002nI>*\t#Ż[ߑqK\u0016eoMi=\u0014#GAyQ\u001d̶E϶[A\u0005q.\u000el\u0014!\fzgART݉e̿P8\\\u0013V6\"\u001et.\u0003\u000f)aRBۢ<W\f+\u0014\u007f+-C+w@Z97ĬMܛiɸ۴iqleg&\u000e<\u0004\u000bV1 ±*ٜe\u05f5mҭƤ\\@\u001dJ4C[\u0013(\u0011>a*Woܮ\u001dȂbݗحwVf\u0006g\u001b4Aro\u000bf\u0013P*ޟBĊkÃ˃S\u007f!HRMQv~@Y\u0010\u0011۪\\+DO\u0003\u0019/ͻ\u0012ڡ!ֲ;F|\u001cu<\u000b6o\"k]SH\u0001ԑdÐcߢ\u0019\u0002eեF\u000fu0\u000b\u001aѨ=f̤\u0003l3N۽\u0004m72Lyޙ ("}, d2 = {"\u001aj^A_0G\u001d\tb\u0004m\u0002", "", "2`c.", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uH\u0018\u0016", "5dc\u0011T;:\u0012\u0015\b\u0004h;x\u00183o\t6", "u(E", "/mS", "=sW2e", "/mSyJ!\r?hg\t", "uH8u<", "1n\\=T9>B#", "\u001aj^A_0G\u001d\t[\u000fm,R", "1n\\=T9>B#FLZ7~V\u0019U", "uH1u<", "1n\\=T9>B#FlSzhX\u0018s", "\u001aj^A_0G\u001d\te\u0005g.R", "1n\\=T9>B#FkD!n\u0019\u0016Q", "uH9u<", "\u001aj^A_0G\u001d\tl}h9\f^", "1n\\=T9>B#F\u000ecxhk\u001cw", "uHBu<", "2dR", "2dRyc\u001d@#t\fV", "2he", "2hey*(IUfhj", "2heyJ!\r?hg\t", "2heyI\u00123E)ef", "uH9u=", "2heyk1\u000b?{k\r", "3pd._:", "", "", "3pd._:\u0006W!\n\u0002", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "4k^<e\u000bBd", "4k^<e\u000bBd`Pvi.Jr\u001f", "4k^<e\u000bBd`po-\u0018Lq=", "4k^<e\u000bBd`o`S\u001e\ro\u001b", "4k^<e\u000bBd`\u0012\u007f+\u0018_uA", "6`b566=S", "6`b566=S`\u0003\u0003i3", "7mR", "7mRyc\u001d@#t\fV", "7me", "7meyc\u001d@#t\fV", ";h]Bf", ";h]Bfs\u0010O$\u0001HH\u001c", ";h]Bfs0HgjJG:", ";h]Bfs/9\u000ep\u000bE\u0018", ";h]BfsQXej]K>", ";nS", ";nSy*(IUfhj", "uH1u5", ";nSyJ!\r?hg\t", ";nSyI\u00123E)ef", ";nSyk1\u000b?{k\r", "uHBuF", "=q", "=q\u001c$Mz*#\u0002\r", ">kd@", ">kd@ }:^\u001bLdN", ">kd@ \u001e3\"\u0005Ncl", ">kd@ \u001d$H\u000b\u000faJ", ">kd@ ?C \u0005agp", "@`]4X\u001bH", "\u001aj^A_0G\u001d&z\u0004`,\u000bR\u001fI\t7h<\n\u0019\u0017\u001d", "@`]4X\u001bH\u001b\u000bsIJ{e\u0017", "uH8u?2Hb \u0003\u0004(9x\u00121e\u000eqk$\n&\u0004Cx\u0010<L", "@`]4X\u001cGb\u001d\u0006", "@`]4X\u001cGb\u001d\u0006BP!Kt~N\u000e", "@d\\", "@d\\y*(IUfhj", "@d\\yJ!\r?hg\t", "@d\\yI\u00123E)ef", "@d\\yk1\u000b?{k\r", "Ag[", "0hc\u0010b<Gb", "Ag[yc\u001d@#t\fV", "Aga", "Agayc\u001d@#t\fV", "Bh\\2f", "Bh\\2fs\u0010O$\u0001HH\u001c", "Bh\\2fs0HgjJG:", "Bh\\2fs/9\u000ep\u000bE\u0018", "Bh\\2fsQXej]K>", "Bn1Fg,", "", "Bn1Fg,\u0006W!\n\u0002", "uH\u0018\u000f", "Bn3<h)ES", "", "Bn3<h)ES`\u0003\u0003i3", "uH\u0018\u0011", "Bn59b(M", "", "Bn59b(M\u001b\u001d\u0007\u0006e", "uH\u0018\u0013", "Bn8;g", "Bn8;gsB[$\u0006", "Bn;<a.", "", "Bn;<a.\u0006W!\n\u0002", "uH\u0018\u0017", "BnB5b9M", "", "BnB5b9M\u001b\u001d\u0007\u0006e", "uH\u0018 ", "BnBAe0GU", "", "BnBAe0GU`\u0003\u0003i3", "uH\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "BnD\u000fl;>", "BnD\u000fl;>\u001b+KaK,\u0012t", "BnD\u0016a;", "BnD\u0016a;\u0006^\n\u0001J:9X", "BnD\u0019b5@", "BnD\u0019b5@\u001b'FkD\u0015bx", "BnD [6Kb", "BnD [6Kb`f}+\bp\t1", "Fna", "FnayJ!\r?hg\t", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class UInt implements Comparable<UInt> {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_VALUE = -1;
    public static final int MIN_VALUE = 0;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;
    private final int data;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\rnj?0JͣIDɟ\u0004*=j<9*[ҸuCIUj\u000f0\ngN\u0016iEЁ-ǈBƤو\u001azr,WXIn \u0013JB\u001eA\nހB\u00818śҽ:\u0007(20;J\u0011\u000f\u001fBH>|QŖ\u001eë\u00160H\u0081\u000b^\u001bT\u001d\u001a@\f\u0015įSɉ`gVȤԢl_B/)\"ݬFV"}, d2 = {"\u001aj^A_0G\u001d\tb\u0004mjZ\u00137p{1\u007fJ\nl", "", "u(E", "\u001b@G,I\b%Cx", "\u001aj^A_0G\u001d\tb\u0004m\u0002", "\u0017", "\u001bH=,I\b%Cx", "!HI\u0012R\t\"B\u0007", "", "!HI\u0012R\t2Bxl", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ UInt(int i2) {
        this.data = i2;
    }

    /* JADX INFO: renamed from: and-WZ4Q5Ns */
    private static final int m9068andWZ4Q5Ns(int i2, int i3) {
        return m9075constructorimpl(i2 & i3);
    }

    /* JADX INFO: renamed from: box-impl */
    public static final /* synthetic */ UInt m9069boximpl(int i2) {
        return new UInt(i2);
    }

    /* JADX INFO: renamed from: compareTo-7apg3OU */
    private static final int m9070compareTo7apg3OU(int i2, byte b2) {
        return Integer.compareUnsigned(i2, m9075constructorimpl((-1) - (((-1) - b2) | ((-1) - 255))));
    }

    /* JADX INFO: renamed from: compareTo-VKZWuLQ */
    private static final int m9071compareToVKZWuLQ(int i2, long j2) {
        long j3 = i2;
        return Long.compareUnsigned(ULong.m9154constructorimpl((j3 + 4294967295L) - (j3 | 4294967295L)), j2);
    }

    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns */
    private int m9072compareToWZ4Q5Ns(int i2) {
        return UnsignedKt.uintCompare(m9127unboximpl(), i2);
    }

    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns */
    private static int m9073compareToWZ4Q5Ns(int i2, int i3) {
        return UnsignedKt.uintCompare(i2, i3);
    }

    /* JADX INFO: renamed from: compareTo-xj2QHRw */
    private static final int m9074compareToxj2QHRw(int i2, short s2) {
        return Integer.compareUnsigned(i2, m9075constructorimpl((s2 + 65535) - (s2 | 65535)));
    }

    /* JADX INFO: renamed from: constructor-impl */
    public static int m9075constructorimpl(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: dec-pVg5ArA */
    private static final int m9076decpVg5ArA(int i2) {
        return m9075constructorimpl(i2 - 1);
    }

    /* JADX INFO: renamed from: div-7apg3OU */
    private static final int m9077div7apg3OU(int i2, byte b2) {
        return Integer.divideUnsigned(i2, m9075constructorimpl((-1) - (((-1) - b2) | ((-1) - 255))));
    }

    /* JADX INFO: renamed from: div-VKZWuLQ */
    private static final long m9078divVKZWuLQ(int i2, long j2) {
        return Long.divideUnsigned(ULong.m9154constructorimpl((-1) - (((-1) - ((long) i2)) | ((-1) - 4294967295L))), j2);
    }

    /* JADX INFO: renamed from: div-WZ4Q5Ns */
    private static final int m9079divWZ4Q5Ns(int i2, int i3) {
        return UnsignedKt.m9331uintDivideJ1ME1BU(i2, i3);
    }

    /* JADX INFO: renamed from: div-xj2QHRw */
    private static final int m9080divxj2QHRw(int i2, short s2) {
        return Integer.divideUnsigned(i2, m9075constructorimpl((-1) - (((-1) - s2) | ((-1) - 65535))));
    }

    /* JADX INFO: renamed from: equals-impl */
    public static boolean m9081equalsimpl(int i2, Object obj) {
        return (obj instanceof UInt) && i2 == ((UInt) obj).m9127unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0 */
    public static final boolean m9082equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX INFO: renamed from: floorDiv-7apg3OU */
    private static final int m9083floorDiv7apg3OU(int i2, byte b2) {
        return Integer.divideUnsigned(i2, m9075constructorimpl((b2 + 255) - (b2 | 255)));
    }

    /* JADX INFO: renamed from: floorDiv-VKZWuLQ */
    private static final long m9084floorDivVKZWuLQ(int i2, long j2) {
        return Long.divideUnsigned(ULong.m9154constructorimpl((-1) - (((-1) - ((long) i2)) | ((-1) - 4294967295L))), j2);
    }

    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns */
    private static final int m9085floorDivWZ4Q5Ns(int i2, int i3) {
        return Integer.divideUnsigned(i2, i3);
    }

    /* JADX INFO: renamed from: floorDiv-xj2QHRw */
    private static final int m9086floorDivxj2QHRw(int i2, short s2) {
        return Integer.divideUnsigned(i2, m9075constructorimpl(s2 & 65535));
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl */
    public static int m9087hashCodeimpl(int i2) {
        return Integer.hashCode(i2);
    }

    /* JADX INFO: renamed from: inc-pVg5ArA */
    private static final int m9088incpVg5ArA(int i2) {
        return m9075constructorimpl(i2 + 1);
    }

    /* JADX INFO: renamed from: inv-pVg5ArA */
    private static final int m9089invpVg5ArA(int i2) {
        return m9075constructorimpl(~i2);
    }

    /* JADX INFO: renamed from: minus-7apg3OU */
    private static final int m9090minus7apg3OU(int i2, byte b2) {
        return m9075constructorimpl(i2 - m9075constructorimpl(b2 & 255));
    }

    /* JADX INFO: renamed from: minus-VKZWuLQ */
    private static final long m9091minusVKZWuLQ(int i2, long j2) {
        return ULong.m9154constructorimpl(ULong.m9154constructorimpl((-1) - (((-1) - ((long) i2)) | ((-1) - 4294967295L))) - j2);
    }

    /* JADX INFO: renamed from: minus-WZ4Q5Ns */
    private static final int m9092minusWZ4Q5Ns(int i2, int i3) {
        return m9075constructorimpl(i2 - i3);
    }

    /* JADX INFO: renamed from: minus-xj2QHRw */
    private static final int m9093minusxj2QHRw(int i2, short s2) {
        return m9075constructorimpl(i2 - m9075constructorimpl((-1) - (((-1) - s2) | ((-1) - 65535))));
    }

    /* JADX INFO: renamed from: mod-7apg3OU */
    private static final byte m9094mod7apg3OU(int i2, byte b2) {
        return UByte.m8998constructorimpl((byte) Integer.remainderUnsigned(i2, m9075constructorimpl((b2 + 255) - (b2 | 255))));
    }

    /* JADX INFO: renamed from: mod-VKZWuLQ */
    private static final long m9095modVKZWuLQ(int i2, long j2) {
        long j3 = i2;
        return Long.remainderUnsigned(ULong.m9154constructorimpl((j3 + 4294967295L) - (j3 | 4294967295L)), j2);
    }

    /* JADX INFO: renamed from: mod-WZ4Q5Ns */
    private static final int m9096modWZ4Q5Ns(int i2, int i3) {
        return Integer.remainderUnsigned(i2, i3);
    }

    /* JADX INFO: renamed from: mod-xj2QHRw */
    private static final short m9097modxj2QHRw(int i2, short s2) {
        return UShort.m9261constructorimpl((short) Integer.remainderUnsigned(i2, m9075constructorimpl((-1) - (((-1) - s2) | ((-1) - 65535)))));
    }

    /* JADX INFO: renamed from: or-WZ4Q5Ns */
    private static final int m9098orWZ4Q5Ns(int i2, int i3) {
        return m9075constructorimpl((-1) - (((-1) - i2) & ((-1) - i3)));
    }

    /* JADX INFO: renamed from: plus-7apg3OU */
    private static final int m9099plus7apg3OU(int i2, byte b2) {
        return m9075constructorimpl(i2 + m9075constructorimpl(b2 & 255));
    }

    /* JADX INFO: renamed from: plus-VKZWuLQ */
    private static final long m9100plusVKZWuLQ(int i2, long j2) {
        return ULong.m9154constructorimpl(ULong.m9154constructorimpl(((long) i2) & 4294967295L) + j2);
    }

    /* JADX INFO: renamed from: plus-WZ4Q5Ns */
    private static final int m9101plusWZ4Q5Ns(int i2, int i3) {
        return m9075constructorimpl(i2 + i3);
    }

    /* JADX INFO: renamed from: plus-xj2QHRw */
    private static final int m9102plusxj2QHRw(int i2, short s2) {
        return m9075constructorimpl(i2 + m9075constructorimpl((s2 + 65535) - (s2 | 65535)));
    }

    /* JADX INFO: renamed from: rangeTo-WZ4Q5Ns */
    private static final UIntRange m9103rangeToWZ4Q5Ns(int i2, int i3) {
        return new UIntRange(i2, i3, null);
    }

    /* JADX INFO: renamed from: rangeUntil-WZ4Q5Ns */
    private static final UIntRange m9104rangeUntilWZ4Q5Ns(int i2, int i3) {
        return URangesKt.m10248untilJ1ME1BU(i2, i3);
    }

    /* JADX INFO: renamed from: rem-7apg3OU */
    private static final int m9105rem7apg3OU(int i2, byte b2) {
        return Integer.remainderUnsigned(i2, m9075constructorimpl((-1) - (((-1) - b2) | ((-1) - 255))));
    }

    /* JADX INFO: renamed from: rem-VKZWuLQ */
    private static final long m9106remVKZWuLQ(int i2, long j2) {
        return Long.remainderUnsigned(ULong.m9154constructorimpl(((long) i2) & 4294967295L), j2);
    }

    /* JADX INFO: renamed from: rem-WZ4Q5Ns */
    private static final int m9107remWZ4Q5Ns(int i2, int i3) {
        return UnsignedKt.m9332uintRemainderJ1ME1BU(i2, i3);
    }

    /* JADX INFO: renamed from: rem-xj2QHRw */
    private static final int m9108remxj2QHRw(int i2, short s2) {
        return Integer.remainderUnsigned(i2, m9075constructorimpl(s2 & 65535));
    }

    /* JADX INFO: renamed from: shl-pVg5ArA */
    private static final int m9109shlpVg5ArA(int i2, int i3) {
        return m9075constructorimpl(i2 << i3);
    }

    /* JADX INFO: renamed from: shr-pVg5ArA */
    private static final int m9110shrpVg5ArA(int i2, int i3) {
        return m9075constructorimpl(i2 >>> i3);
    }

    /* JADX INFO: renamed from: times-7apg3OU */
    private static final int m9111times7apg3OU(int i2, byte b2) {
        return m9075constructorimpl(i2 * m9075constructorimpl((-1) - (((-1) - b2) | ((-1) - 255))));
    }

    /* JADX INFO: renamed from: times-VKZWuLQ */
    private static final long m9112timesVKZWuLQ(int i2, long j2) {
        long j3 = i2;
        return ULong.m9154constructorimpl(ULong.m9154constructorimpl((j3 + 4294967295L) - (j3 | 4294967295L)) * j2);
    }

    /* JADX INFO: renamed from: times-WZ4Q5Ns */
    private static final int m9113timesWZ4Q5Ns(int i2, int i3) {
        return m9075constructorimpl(i2 * i3);
    }

    /* JADX INFO: renamed from: times-xj2QHRw */
    private static final int m9114timesxj2QHRw(int i2, short s2) {
        return m9075constructorimpl(i2 * m9075constructorimpl(s2 & 65535));
    }

    /* JADX INFO: renamed from: toByte-impl */
    private static final byte m9115toByteimpl(int i2) {
        return (byte) i2;
    }

    /* JADX INFO: renamed from: toDouble-impl */
    private static final double m9116toDoubleimpl(int i2) {
        return UnsignedKt.uintToDouble(i2);
    }

    /* JADX INFO: renamed from: toFloat-impl */
    private static final float m9117toFloatimpl(int i2) {
        return (float) UnsignedKt.uintToDouble(i2);
    }

    /* JADX INFO: renamed from: toInt-impl */
    private static final int m9118toIntimpl(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: toLong-impl */
    private static final long m9119toLongimpl(int i2) {
        long j2 = i2;
        return (j2 + 4294967295L) - (j2 | 4294967295L);
    }

    /* JADX INFO: renamed from: toShort-impl */
    private static final short m9120toShortimpl(int i2) {
        return (short) i2;
    }

    /* JADX INFO: renamed from: toString-impl */
    public static String m9121toStringimpl(int i2) {
        long j2 = i2;
        return String.valueOf((j2 + 4294967295L) - (j2 | 4294967295L));
    }

    /* JADX INFO: renamed from: toUByte-w2LRezQ */
    private static final byte m9122toUBytew2LRezQ(int i2) {
        return UByte.m8998constructorimpl((byte) i2);
    }

    /* JADX INFO: renamed from: toUInt-pVg5ArA */
    private static final int m9123toUIntpVg5ArA(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: toULong-s-VKNKU */
    private static final long m9124toULongsVKNKU(int i2) {
        return ULong.m9154constructorimpl(((long) i2) & 4294967295L);
    }

    /* JADX INFO: renamed from: toUShort-Mh2AYeg */
    private static final short m9125toUShortMh2AYeg(int i2) {
        return UShort.m9261constructorimpl((short) i2);
    }

    /* JADX INFO: renamed from: xor-WZ4Q5Ns */
    private static final int m9126xorWZ4Q5Ns(int i2, int i3) {
        return m9075constructorimpl(i2 ^ i3);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(UInt uInt) {
        return UnsignedKt.uintCompare(m9127unboximpl(), uInt.m9127unboximpl());
    }

    public boolean equals(Object obj) {
        return m9081equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m9087hashCodeimpl(this.data);
    }

    public String toString() {
        return m9121toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl */
    public final /* synthetic */ int m9127unboximpl() {
        return this.data;
    }
}
