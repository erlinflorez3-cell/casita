package okhttp3.internal.cache;

import com.facebook.cache.disk.DefaultDiskStorage;
import cz.msebera.android.httpclient.message.TokenParser;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
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
@Metadata(bv = {}, d1 = {"Я{\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0RkP.XS2\u000fy\u0003<řc$\bCCU }*\t]Wo˧vJp\u000bKƤ\u000e\u0016~y4Ikxe܈\u00172XoG3[{E9vt>\u0005&?*8\b\u0005\t\u001a0I\u0018v\u0011CS\f\u00187HpPR\u0015M\u000b(\u001a\u0006LG\t\u001eblv5Z\u0003җX\tS\u0003\u0018A~'\u000e05Of!0\u0004M,gӜ;DE6-%\u0002\u0005\u0017ViB\u001b? A\u0015l5,CI\"]F\\\u000e\u001b-+}\u0013mv4d\u001dQ\u000f\u00157/]mcP<3Þ~{\u001bHL\u0014\u0014]`.[Q-\bV9\u0003+k@~9%VH\u001aoo/%.j[A)!ieiT\u001f7*˜=\"1=\u0007!\nbT֫ڠ\u001fT}\u000fyUN{`N8\u0011\u0006\f\u00120z\b@\u0003^\u0003P/*߾^\u001b3ws9QG\u001c\bNDu8\u001d`\u0017\\0W\u0011D01.7X@T`R(\u001dk~\f\u001f@Yb*\u0019\u001f\u0004\u001e\u0012N\"H<Oط@R])\u0002j{\u0004Pɟ//;g5\u0004\u000e\u0006p'7C\u0019{\u0010\u0010`?\u001aM\u0005z\u0005\u0007t\tST`jq:2v\u000eVwDJ\\V+2m)b4t7'(-H1U\tAE\u0017m'\u0001\u0010-\fc(\u00117<t7'\u0017\\9zuGa,+\u0018hΊۮU5\u001fu\u001e.v\u0005\u0015#5\r$\u0004U(dGz\u0013^\rcM8\u0016HG\u00027Ke'\u0003WYR-sɣ9ό˛Q\u0012-NE\u007f\u001d\u0010\u0001.\u0016\u00161ptdx}gTE+?l\u0001x n\u0010\u007fqJ)\r4T9ϵl ;\u0007g\u0014f8+<g,3Y\b\"+l]G5].wBU[a.u}3\u0012b=,KЄ\u0006Нg\u0016w̥\"i@HPI\b\r\u0015а0к\u0007BP۳H\u0014P\u0018L\raX\u0018Яrެ<M\u0013ɀNt\u0015=%p\u0005m\u0011ܧqϻ80g*\u0002VN,lW=\u0011{a>ƛyљ`\u0017R\u05fa\"\r\u0002F|(<?&mezY?\u0014v06o?ك\tB\u0011ӗL.B!\u0019]%{\u0014\u0011\u0013\u007ftaeĠ4¡wA^ՕlzbqV!1Qn>B\u0001-\u001d\nͫ\u0005\u00985\u0005uۮ%;qP\u0019SK\u0017q˅[ǎj%3ל%E)Gp\u00019I4ŠKΜ:\u0004Oӣ>w},P\u0018+!\u0019ȳ\u001dʦU\u0011gڻ\u0001j\u0019v|N\u0013zhשTƬ&)\u0007ғM\u001cJ,'\r/N!\u00139ΥXϸ{7K\u05ceQ9RM\u001f\u001c\reV\u001b[,E3MM\u0019;w{\u0006ėi#^·\"ڗ\bz)Ƹo\u0010l2kD\u000b:\u007f\u001ez\u00027\u001c\u0001$\u0012Xbt!\u0013dLt\u0014Xֶ\u000eեbesլ9B-Vz2bMn&\u0018\u0012=o|\u0005#\u0003\u0015?-Ҷz\u0094T\u001d\u0011ް\u001e:!\tr:?avǈ\u001d\u05ca\u0018\u0015.˿\u0007\u0014pZ(O\u0012qGդ[ܣ\u0011+7մzm?bj\u001e,%PǤ\u0010ցX(\u001d͇'YL\u0018!\\\u001bK.ЕjɈ,d|׃y&\u000b\u0006`^?\u0019\u000bЙt۠h5?؟7]\u0013{n<ˀI'"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mk", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "\u001aiPCTuB]b_\u0002n:\u007f\u0005,l\u007f}", "4h[2F@Lb\u0019\u0007", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI,\u0006\na\u001b\u001eG]\"J\u0006%=/", "2ha2V;H`-", "\u001aiPCTuB]b_~e,R", "/o_#X9LW#\b", "", "D`[BX\nHc\"\u000e", ";`g \\A>", "", "B`b8E<G\\\u0019\f", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004\rGv\u001f.Z\u0019", "uK^8[;M^fH~g;|\u00168a\u0007q\u007fJJw\u001bNo{P\u000545aS\u0007<i'*\u0017GE5\u0015\"\u001ch7\u001djH\u0013X|*V[Yy&V{L\u0014\u001fc\nUt\u000b\u000fb?4{Q7(\u0017u8}Inm\u001c\u001f\u00175wF\u0006G", "1he6_0SS\u0018_~e,j\u001d=t\u007f0", "", "1kT.a<I?)~\u000b^", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&\u0006I~'$To\u0017K@\u00141g\u0004\fGm&.#", "1kT.a<IB\u0015\r\u0001", "=jWAg7\f\u001d\u001d\b\n^9\u0006\u00056/}$yC\u0001`uK}\u0014#\u00045\u0013U{#7,\u00145M?D{?\r\u0011vgwR", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT,TC7tD)\u0004do?E/\u0002", "1k^@X+", "5dc\u0010_6LS\u0018=\u0005d/\f\u0018:", "u(I", "Adc\u0010_6LS\u0018=\u0005d/\f\u0018:", "uY\u0018#", "5dc\u0011\\9>Q(\t\br", "u(;7T=:\u001d\u001d\tD?0\u0004\t\u0005", "5dc\u0013\\3>A-\r\n^4;\u00135h\u000f7\u0007", "u(;<^/Mb$LDb5\f\t<n{/ED\u000b`wKv\u000e*\u000b3DY\u0006u", "6`b\u0017b<K\\\u0015\u0006Zk9\u0007\u0016=", "7mXA\\(EW.~y", "8nd?a(E4\u001d\u0006z", "8nd?a(E4\u001d\u0006z;(z\u000f?p", "8nd?a(E4\u001d\u0006zM4\b", "8nd?a(EE&\u0003\n^9", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", ":qd\u0012a;KW\u0019\r", "\u001aiPCTuNb\u001d\u0006DE0\u0006\u000f/db$\nCh\u0013\"\u001d", "", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT\u000eVRH\u007f\n", "5dc\u0019e<\u001e\\(\f~^:;\u00135h\u000f7\u0007", "u(;7T=:\u001d)\u000e~euc\r8k\u007f'^<\u000f\u001a~Czc", "D`[BX", "5dc\u001aT?,W.~", "u(9", "Adc\u001aT?,W.~", "uI\u0018#", ";nbAE,<S\"\u000eg^)\r\r6d`$\u007fG\u0001\u0016", ";nbAE,<S\"\u000eik0\u0005i+i\u0007(z", "<dgAF,Jc\u0019\bx^\u0015\r\u0011,e\r", "@dSBa+:\\(h\u0006<6\r\u0012>", "Ahi2", "5dc#T3NSv\t\u000bg;;\u00135h\u000f7\u0007", "u(8", "1gT0^\u0015Hbv\u0006\u0005l,{", "", "1k^@X", "1n\\=_,MSx}~m", "3cXAb9", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT\u000eLGJuAs", "AtR0X:L", "1n\\=_,MSx}~mj\u0007\u000f2t\u000f3", "2d[2g,", "3cXA", "9dh", "3w_2V;>R\u0007~\u0007n,\u0006\u0007/N\u00100x@\u000e", "3uX0g\bEZ", "4kd@[", "5dc", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT\u001cV?Fy7($>", "7mXA\\(EW.~", "7r29b:>R", "8nd?a(E@\u0019{\u000bb3{u/q\u0010,\t@\u007f", "<df\u0017b<K\\\u0015\u0006lk0\f\t<", ">q^0X:L8#\u000f\bg(\u0004", "@dP1=6N`\"z\u0002", "@dP1=6N`\"z\u0002E0\u0006\t", ":h]2", "@dQB\\3=8#\u000f\bg(\u0004", "@dQB\\3=8#\u000f\bg(\u0004G9k\u00037\u000bK", "@d\\<i,", "@d\\<i,\u001e\\(\f\u000f", "3mc?l", "@d\\<i,\u001e\\(\f\u000f\u001d6\u0003\f>t\u000b", "@d\\<i,(Z\u0018~\tm\f\u0006\u0018<y", "AmP=f/Hb'", "", "BqX:G6,W.~", "D`[6W(MS~~\u000f", "\u0011n\\=T5B]\"", "\u0013cXAb9", "\u0013mc?l", "!mP=f/Hb", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DiskLruCache implements Closeable, Flushable {
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final File directory;
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private BufferedSink journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    public static final Companion Companion = new Companion(null);
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String VERSION_1 = "1";
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final Regex LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");
    public static final String CLEAN = "CLEAN";
    public static final String DIRTY = "DIRTY";
    public static final String REMOVE = "REMOVE";
    public static final String READ = "READ";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126Ȑ\u0007\":\u001e\u007f\u0007lmA0ZeP.XV0Ŧl\u0012éT[Rp\u0004@[\u001aԥ&\t]N8u|Kr\u000bq\u0011<\u001aƠn֒Yxe܈_@PrW3{ss=7Ңxӯ$2*\u0600J\u0013\u000f\u001fBH>z1G\"ÐTضDpBĥ][\u0013 *\u0006l$7\"3ɩ\u0011ɇLleŽ\u007f1\u0011pZNUcf\u0001$ν\tù+\r~ѭn9N?M\u0015SW9\u000b)Á\u0002ƄCqEݛ9554as\u0006@\u000f\u0004jƋ-̠\u0011]z̦-\u0013_k$'YS\u001aO'ʳjÞ~{\u0015ɝT\u001c\u00143`.[\u001e\u001d\fdޟ7ɤW@X\u061c/P\u000e\by6E)67\u0002ݕ]ƻUaCϊ\u001fE\n\u0013%\u001eQ\u0005%%2ٲP\u05ce\u0019\u001b\\ȭά5`"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT\fWKFg=\"\u001fq7", "", "u(E", "\u000fMH,F\f*CxgX>&ex\u0017B_\u0015", "", "\u0011K4\u000eA", "", "\u0012HA!L", "\u0018ND\u001fA\b%Myba>", "\u0018ND\u001fA\b%Myba>&Yd\rKo\u0013", "\u0018ND\u001fA\b%Myba>&kh\u0017P", "\u001aD6\u000e?&$3\rxe:\u001bkh\u001cN", "\u001aj^A_0G\u001d(~\u000emui\t1e\u0013}", "\u001b@6\u00166", " D0\u0011", " D<\u001cI\f", "$DA <\u0016'Md", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000bDB\u0007\"2\u0012\u007f\u0007tsA0JfP.`i2\u000fq|<$i$yCAW\"}8\tWȞog|PbŏK\u000f\u001c\u0016\u0001̓2նW\u000fزB\u000f`A0P9ݹ\u007fEG`\r:3!\u0003\"f{ڱ\u0005\u001a8KXz\tOc\f@=\ttH`%M3'Z\u0011L/\u0019\u001e\u000bt\u0015ȤՂp]@?k\u000fwSf'\u000eB-Q\u001bYl';\u000b*,9UO7+$\u0002\u00197ViR\u001b? QUt5+CI\"\\\rݜ\fЏ\u0019+WՕ.\t4\\\u001dU\u000f\rw+}e\"ֵ\u0010߭{\u0001\u0004ȞT\u0006\u0014\f5O~A(n \u0010Is!\\\u0017Б\u0004ެF\u0006\u0003ʨN\u0019+\nA6ݶ\u001f}"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT\u000eLGJuAs", "", "3mc?l", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT\u000eVRH\u007f\n", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mk", "uK^8[;M^fH~g;|\u00168a\u0007qy<~\u001a\u0017\u0011N\u0012J|\fBi[\u001c5p\u0016\u00044MAnC- 6+=\u0010r,[\u007f#N\u0016L(ZUr\u0007r\u0016h\u001458\u001dbU?'n\u0003\u0017(\u00179]W~Y", "2n]2", "", "5dc\u0012a;KgW\t\u0001a;\f\u0014", "u(;<^/Mb$LDb5\f\t<n{/E>|\u0015\u001aG9l@\u0005+\u001cf\u000e}3k\u0019.\f#DzA2j", "EqXAg,G", "", "5dc$e0Mb\u0019\b9h2\u007f\u0018>p", "u(J'", "/a^?g", "", "1n\\:\\;", "2dc.V/", "2dc.V/|]\u001f\u0002\nm7", "<df \\5D", "\u001anZ6bu,W\"\u0005P", "7mS2k", "", "<df b<KQ\u0019", "\u001anZ6bu,])\fx^\u0002", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public final class Editor {
        private boolean done;
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        public Editor(DiskLruCache diskLruCache, Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.this$0 = diskLruCache;
            this.entry = entry;
            this.written = entry.getReadable$okhttp() ? null : new boolean[diskLruCache.getValueCount$okhttp()];
        }

        public final void abort() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (Intrinsics.areEqual(this.entry.getCurrentEditor$okhttp(), this)) {
                    diskLruCache.completeEdit$okhttp(this, false);
                }
                this.done = true;
                Unit unit = Unit.INSTANCE;
            }
        }

        public final void commit() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (Intrinsics.areEqual(this.entry.getCurrentEditor$okhttp(), this)) {
                    diskLruCache.completeEdit$okhttp(this, true);
                }
                this.done = true;
                Unit unit = Unit.INSTANCE;
            }
        }

        public final void detach$okhttp() throws IOException {
            if (Intrinsics.areEqual(this.entry.getCurrentEditor$okhttp(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        public final Sink newSink(int i2) {
            final DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!Intrinsics.areEqual(this.entry.getCurrentEditor$okhttp(), this)) {
                    return Okio.blackhole();
                }
                if (!this.entry.getReadable$okhttp()) {
                    boolean[] zArr = this.written;
                    Intrinsics.checkNotNull(zArr);
                    zArr[i2] = true;
                }
                try {
                    return new FaultHidingSink(diskLruCache.getFileSystem$okhttp().sink(this.entry.getDirtyFiles$okhttp().get(i2)), new Function1<IOException, Unit>() { // from class: okhttp3.internal.cache.DiskLruCache$Editor$newSink$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IOException iOException) {
                            invoke2(iOException);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(IOException it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            DiskLruCache diskLruCache2 = diskLruCache;
                            DiskLruCache.Editor editor = this;
                            synchronized (diskLruCache2) {
                                editor.detach$okhttp();
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                    });
                } catch (FileNotFoundException unused) {
                    return Okio.blackhole();
                }
            }
        }

        public final Source newSource(int i2) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                Source source = null;
                if (!this.entry.getReadable$okhttp() || !Intrinsics.areEqual(this.entry.getCurrentEditor$okhttp(), this) || this.entry.getZombie$okhttp()) {
                    return null;
                }
                try {
                    source = diskLruCache.getFileSystem$okhttp().source(this.entry.getCleanFiles$okhttp().get(i2));
                } catch (FileNotFoundException unused) {
                }
                return source;
            }
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яx\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\":1\u007f\u0007|jA0JfP.hS2\u000f\u0002{<$a+yCIi\"}(\nWNumvJ`\u000eK\u000f\u0014\u001f\u0001j2L]xk\u0019\u00172HuG3[nEʠhtD#(݅*8\u0010\u0005\t\u001a0H\u0018v\tCS\f\u00180HpPR\u0015M\u000b\u001b\u001a\u0006T \t\u001ebgTȥJ\u0003җj/Q\u0002*OTϋo4\u000bM%F\u0003(˼za,-\tKCA=S14\u0003eM1WwM\u0007x'U,w#\u001e6!\u000e\"ECO;\u000f#*j7i`:?qO,d^A@w)0=F\u0012<\u001e-X0=\u001a\u0015\t<b;ɁՂDP\b\u0014\u000b\u0011\t\u0018N\u001d;~ab\n\u001b\u0015[(ݢϭR7\u0002=U11:\u0007!\n\t>d#Ulw\u007fl\u0018̵ףLN\u0010\u0016\u000e\u0006\u0012sz\b:\u0006@G.4*\u0015\u0005ϐ'ھ_?+ܩ\u0004\u0004NJu}U~v[\u0002X^?Pwf7X\u0013bɯP\u0081\twXӹp.\u0017X*`'\u007f\u000e .jHT/4(T_jyj{b8)\u0006ϊ9֍rq\u0016ãQ`9E_j`s`v,?jc[֛h͞W\u0012b٢@$8Yx\"H\u000eRa$\u0013`SHʊ6Ϝ5\u001fdé`\u0005$WO\u0013Ywh\u007f(~\u0003Kzѱu˨x\u0015\tˆtru\u0001\u0007cL~f=;]\"M'Cm\"\u0017RSȾ\u0013ҋw\fOхdIR\f$\u0016u}&7([\"GK6'~WVXΐQʆvqY˧*)\u0001\"\b5[j4\u000f\u0016\u0013ADn\u0014bO\u00035xԯjѓ'\u0014lр\u0012cL%U\u0004t\raiW\u0015î]y"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT\u000eVRH\u007f\n", "", "9dh", "", "uK^8[;M^fH~g;|\u00168a\u0007qy<~\u001a\u0017\u0011N\u0012J|\fBi[\u001c5p\u0016\u00044H7|0g\u001cdj;PQ;[z0I\"\u0012\u001d", "1kT.a\rBZ\u0019\r", "", "\u001aiPCTuB]b_~e,R", "5dc\u0010_,:\\y\u0003\u0002^:;\u00135h\u000f7\u0007", "u(;7T=:\u001d)\u000e~euc\r=tU", "1ta?X5M3\u0018\u0003\nh9", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT\u000eLGJuAs", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mk", "5dc\u0010h9KS\"\u000eZ]0\f\u0013<$\n.~O\u0010\"", "u(;<^/Mb$LDb5\f\t<n{/E>|\u0015\u001aG9l@\u0005+\u001cf\u000e}3k\u0019.\f#:oC(\">", "Adc\u0010h9KS\"\u000eZ]0\f\u0013<$\n.~O\u0010\"", "uK^8[;M^fH~g;|\u00168a\u0007qy<~\u001a\u0017\u0011N\u0012J|\fBi[\u001c5p\u0016l-B?z>+j,R", "2haAl\rBZ\u0019\r", "5dc\u0011\\9Mgy\u0003\u0002^:;\u00135h\u000f7\u0007", "5dc\u0018X@|]\u001f\u0002\nm7", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", ":d]4g/L", "", "5dc\u0019X5@b\u001c\r9h2\u007f\u0018>p", "u(J\u0017", ":nR8\\5@A#\u000f\b\\,Z\u0013?n\u000f", "", "5dc\u0019b*DW\"\u0001hh<\n\u0007/C\n8\u0005O?!\u001dJ~\u001dG", "u(8", "Adc\u0019b*DW\"\u0001hh<\n\u0007/C\n8\u0005O?!\u001dJ~\u001dG", "uH\u0018#", "@dP1T)ES", "", "5dc\u001fX(=O\u0016\u0006z\u001d6\u0003\f>t\u000b", "u(I", "Adc\u001fX(=O\u0016\u0006z\u001d6\u0003\f>t\u000b", "uY\u0018#", "Ad`BX5<S\u0002\u000f\u0003[,\n", "", "5dc X8NS\"|zG<\u0005\u0006/r>2\u0002C\u0010&\"", "u(9", "Adc X8NS\"|zG<\u0005\u0006/r>2\u0002C\u0010&\"", "uI\u0018#", "Hn\\/\\,", "5dc'b4;W\u0019=\u0005d/\f\u0018:", "Adc'b4;W\u0019=\u0005d/\f\u0018:", "7me._0=:\u0019\b|m/\u000b", "", "Asa6a.L", "", "<df b<KQ\u0019", "\u001anZ6bu,])\fx^\u0002", "7mS2k", "Adc\u0019X5@b\u001c\r", "", "Adc\u0019X5@b\u001c\r9h2\u007f\u0018>p", "AmP=f/Hb", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT\u001cV?Fy7($>", "AmP=f/HbW\t\u0001a;\f\u0014", "EqXAX\u0013>\\\u001b\u000e}l", "EqXAX9", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "EqXAX\u0013>\\\u001b\u000e}lj\u0007\u000f2t\u000f3", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public final class Entry {
        private final List<File> cleanFiles;
        private Editor currentEditor;
        private final List<File> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(DiskLruCache diskLruCache, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.this$0 = diskLruCache;
            this.key = key;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sbAppend = new StringBuilder(key).append('.');
            int length = sbAppend.length();
            int valueCount$okhttp = diskLruCache.getValueCount$okhttp();
            for (int i2 = 0; i2 < valueCount$okhttp; i2++) {
                sbAppend.append(i2);
                this.cleanFiles.add(new File(this.this$0.getDirectory(), sbAppend.toString()));
                sbAppend.append(DefaultDiskStorage.FileType.TEMP);
                this.dirtyFiles.add(new File(this.this$0.getDirectory(), sbAppend.toString()));
                sbAppend.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        private final Source newSource(int i2) throws FileNotFoundException {
            final Source source = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i2));
            if (this.this$0.civilizedFileSystem) {
                return source;
            }
            this.lockingSourceCount++;
            final DiskLruCache diskLruCache = this.this$0;
            return new ForwardingSource(source) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;

                @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    super.close();
                    if (this.closed) {
                        return;
                    }
                    this.closed = true;
                    DiskLruCache diskLruCache2 = diskLruCache;
                    DiskLruCache.Entry entry = this;
                    synchronized (diskLruCache2) {
                        entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount$okhttp() - 1);
                        if (entry.getLockingSourceCount$okhttp() == 0 && entry.getZombie$okhttp()) {
                            diskLruCache2.removeEntry$okhttp(entry);
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
            };
        }

        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        public final String getKey$okhttp() {
            return this.key;
        }

        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(List<String> strings) throws IOException {
            Intrinsics.checkNotNullParameter(strings, "strings");
            if (strings.size() != this.this$0.getValueCount$okhttp()) {
                invalidLengths(strings);
                throw new KotlinNothingValueException();
            }
            try {
                int size = strings.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.lengths[i2] = Long.parseLong(strings.get(i2));
                }
            } catch (NumberFormatException unused) {
                invalidLengths(strings);
                throw new KotlinNothingValueException();
            }
        }

        public final void setLockingSourceCount$okhttp(int i2) {
            this.lockingSourceCount = i2;
        }

        public final void setReadable$okhttp(boolean z2) {
            this.readable = z2;
        }

        public final void setSequenceNumber$okhttp(long j2) {
            this.sequenceNumber = j2;
        }

        public final void setZombie$okhttp(boolean z2) {
            this.zombie = z2;
        }

        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
            }
            if (!this.readable) {
                return null;
            }
            if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            try {
                int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                for (int i2 = 0; i2 < valueCount$okhttp; i2++) {
                    arrayList.add(newSource(i2));
                }
                return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Util.closeQuietly((Source) it.next());
                }
                try {
                    this.this$0.removeEntry$okhttp(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void writeLengths$okhttp(BufferedSink writer) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            for (long j2 : this.lengths) {
                writer.writeByte(32).writeDecimalLong(j2);
            }
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯD\u001d<K!&i\u0016DLш|\u0004O\u00128é6B\r)4ߚ\u007f\u0007t\tA0ZeP\u008cZS8#s{:$c$\u007fCC٥\"}8\tWN}gvJ`\u000bK\u000f\u0014\u001c\u0001j2I[ޓ_(ƁbB\u001e>sxuމId\u00036\u001d `#H}\u0013\u00032*v\u0013\u0007\u0005QO$\u0018@B\u0001:\u0001\u0013{\n*\u0016\u0014E8\u0001LdʄR6Vu&@=-\u001bipYmsx\u0007[\u0019^Z=\f%nn+nE}!3b\u001b\u0007\u0001^o\u0007M\u0002U\u0005\u00178o7W\u0006o6\u0007\u0006D\u00199_%]!7%\t_`$'YP4W^\u000e@w)|cɠ\u0006؝\n'P͓}&t\u000f&3#z*öRؿbB\bЭ2B%'\u00183Y<qƛSň?\u0019VљL\u0017\u001b\";\u0007~#kT<fC +ȰSśU@Eʰݹ\u000el"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT\u001cV?Fy7($>", "\u001aiPCTuB]b\\\u0002h:|\u0005,l\u007f}", "9dh", "", "Ad`BX5<S\u0002\u000f\u0003[,\n", "", "And?V,L", "", "\u001anZ6bu,])\fx^\u0002", ":d]4g/L", "", "uK^8[;M^fH~g;|\u00168a\u0007qy<~\u001a\u0017\u0011N\u0012J|\fBi[\u001c5p\u0016\u00044H7|0g\u001cdj;PQ;[z0I\"3\u0013aN\u00049]\"i\u0012Uts\tgPyd)z\u0010", "1k^@X", "", "3cXA", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT\u000eLGJuAs", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mk", "5dc\u0019X5@b\u001c", "7mS2k", "", "5dc b<KQ\u0019", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<Source> sources;
        final /* synthetic */ DiskLruCache this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(DiskLruCache diskLruCache, String key, long j2, List<? extends Source> sources, long[] lengths) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sources, "sources");
            Intrinsics.checkNotNullParameter(lengths, "lengths");
            this.this$0 = diskLruCache;
            this.key = key;
            this.sequenceNumber = j2;
            this.sources = sources;
            this.lengths = lengths;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<Source> it = this.sources.iterator();
            while (it.hasNext()) {
                Util.closeQuietly(it.next());
            }
        }

        public final Editor edit() throws IOException {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i2) {
            return this.lengths[i2];
        }

        public final Source getSource(int i2) {
            return this.sources.get(i2);
        }

        public final String key() {
            return this.key;
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.DiskLruCache$snapshots$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я+\u001d̉=!,\u0011\bDZc|\u0004W\u00068é6B\u0015\"4\u0012}\tnjG9LeN.ZS8\u000fsڔ\\#Ӌ*yYП\u0006$\u000e(\u0019S|g8nx[9BW\r$\u007f\u0003,w]?ى\u0012W=PxW7{o\u000e9\u000fu|ӣ z(F\u0004\u001d\u0001H5\u000f$G\u001dQM$(@R\u0001Jp\u0011u\u000b0\u00114Ap\u0001L]\u0016Q\u0007H\u001b^h.yɈkŌR'gܞM_\u001bKl-#u\u0010\u001e{@e6kǯ_Ϋ\u000bRcΪSQ\u007fC\u001dn=&YIDWdYVϯ!ۣS\reö͏`\u0011"}, d2 = {"=jWAg7\f\u001d\u001d\b\n^9\u0006\u00056/}$yC\u0001`uK}\u0014#\u00045\u0013U{#7,$7INIn>-#'-", "", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT\u001cV?Fy7($>", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mk", "2d[2Z(MS", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI&w>\u0004\u0017`&s\u001cB]2E7y\u001e:mT\u000eVRH\u007f\n", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "<dgAF5:^'\u0002\u0005m", "@d\\<i,,\\\u0015\n\ta6\f", "6`b\u001bX?M", "", "<dgA", "@d\\<i,", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Iterator<Snapshot>, KMutableIterator {
        private final Iterator<Entry> delegate;
        private Snapshot nextSnapshot;
        private Snapshot removeSnapshot;

        AnonymousClass1() {
            Iterator<Entry> it = new ArrayList(DiskLruCache.this.getLruEntries$okhttp().values()).iterator();
            Intrinsics.checkNotNullExpressionValue(it, "ArrayList(lruEntries.values).iterator()");
            this.delegate = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Snapshot snapshotSnapshot$okhttp;
            if (this.nextSnapshot != null) {
                return true;
            }
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (diskLruCache.getClosed$okhttp()) {
                    return false;
                }
                while (this.delegate.hasNext()) {
                    Entry next = this.delegate.next();
                    if (next != null && (snapshotSnapshot$okhttp = next.snapshot$okhttp()) != null) {
                        this.nextSnapshot = snapshotSnapshot$okhttp;
                        return true;
                    }
                }
                Unit unit = Unit.INSTANCE;
                return false;
            }
        }

        @Override // java.util.Iterator
        public Snapshot next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Snapshot snapshot = this.nextSnapshot;
            this.removeSnapshot = snapshot;
            this.nextSnapshot = null;
            Intrinsics.checkNotNull(snapshot);
            return snapshot;
        }

        @Override // java.util.Iterator
        public void remove() {
            Snapshot snapshot = this.removeSnapshot;
            if (snapshot == null) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            try {
                DiskLruCache.this.remove(snapshot.key());
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.removeSnapshot = null;
                throw th;
            }
            this.removeSnapshot = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(FileSystem fileSystem, File directory, int i2, int i3, long j2, TaskRunner taskRunner) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.fileSystem = fileSystem;
        this.directory = directory;
        this.appVersion = i2;
        this.valueCount = i3;
        this.maxSize = j2;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        final String str = Util.okHttpName + " Cache";
        this.cleanupTask = new Task(str) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                DiskLruCache diskLruCache = this.this$0;
                synchronized (diskLruCache) {
                    if (!diskLruCache.initialized || diskLruCache.getClosed$okhttp()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        diskLruCache.mostRecentTrimFailed = true;
                    }
                    try {
                        if (diskLruCache.journalRebuildRequired()) {
                            diskLruCache.rebuildJournal$okhttp();
                            diskLruCache.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.mostRecentRebuildFailed = true;
                        diskLruCache.journalWriter = Okio.buffer(Okio.blackhole());
                    }
                    return -1L;
                }
            }
        };
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        this.journalFile = new File(directory, JOURNAL_FILE);
        this.journalFileTmp = new File(directory, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(directory, JOURNAL_FILE_BACKUP);
    }

    private final synchronized void checkNotClosed() {
        if (this.closed) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j2, int i2, Object obj) throws IOException {
        if ((i2 & 2) != 0) {
            j2 = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j2);
    }

    public final boolean journalRebuildRequired() {
        int i2 = this.redundantOpCount;
        return i2 >= 2000 && i2 >= this.lruEntries.size();
    }

    private final BufferedSink newJournalWriter() throws FileNotFoundException {
        return Okio.buffer(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new Function1<IOException, Unit>() { // from class: okhttp3.internal.cache.DiskLruCache$newJournalWriter$faultHidingSink$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IOException iOException) {
                invoke2(iOException);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(IOException it) {
                Intrinsics.checkNotNullParameter(it, "it");
                DiskLruCache diskLruCache = this.this$0;
                if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                    throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
                }
                this.this$0.hasJournalErrors = true;
            }
        }));
    }

    private final void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "i.next()");
            Entry entry = next;
            int i2 = 0;
            if (entry.getCurrentEditor$okhttp() == null) {
                int i3 = this.valueCount;
                while (i2 < i3) {
                    this.size += entry.getLengths$okhttp()[i2];
                    i2++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                int i4 = this.valueCount;
                while (i2 < i4) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i2));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i2));
                    i2++;
                }
                it.remove();
            }
        }
    }

    private final void readJournal() throws IOException {
        BufferedSource bufferedSourceBuffer = Okio.buffer(this.fileSystem.source(this.journalFile));
        try {
            BufferedSource bufferedSource = bufferedSourceBuffer;
            String utf8LineStrict = bufferedSource.readUtf8LineStrict();
            String utf8LineStrict2 = bufferedSource.readUtf8LineStrict();
            String utf8LineStrict3 = bufferedSource.readUtf8LineStrict();
            String utf8LineStrict4 = bufferedSource.readUtf8LineStrict();
            String utf8LineStrict5 = bufferedSource.readUtf8LineStrict();
            if (!Intrinsics.areEqual(MAGIC, utf8LineStrict) || !Intrinsics.areEqual(VERSION_1, utf8LineStrict2) || !Intrinsics.areEqual(String.valueOf(this.appVersion), utf8LineStrict3) || !Intrinsics.areEqual(String.valueOf(this.valueCount), utf8LineStrict4) || utf8LineStrict5.length() > 0) {
                throw new IOException("unexpected journal header: [" + utf8LineStrict + ", " + utf8LineStrict2 + ", " + utf8LineStrict4 + ", " + utf8LineStrict5 + AbstractJsonLexerKt.END_LIST);
            }
            int i2 = 0;
            while (true) {
                try {
                    readJournalLine(bufferedSource.readUtf8LineStrict());
                    i2++;
                } catch (EOFException unused) {
                    this.redundantOpCount = i2 - this.lruEntries.size();
                    if (bufferedSource.exhausted()) {
                        this.journalWriter = newJournalWriter();
                    } else {
                        rebuildJournal$okhttp();
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(bufferedSourceBuffer, null);
                    return;
                }
            }
        } finally {
        }
    }

    private final void readJournalLine(String str) throws IOException {
        String strSubstring;
        String str2 = str;
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str2, TokenParser.SP, 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i2 = iIndexOf$default + 1;
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str2, TokenParser.SP, i2, false, 4, (Object) null);
        if (iIndexOf$default2 == -1) {
            strSubstring = str.substring(i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str3 = REMOVE;
            if (iIndexOf$default == str3.length() && StringsKt.startsWith$default(str, str3, false, 2, (Object) null)) {
                this.lruEntries.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i2, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        Entry entry = this.lruEntries.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            this.lruEntries.put(strSubstring, entry);
        }
        if (iIndexOf$default2 != -1) {
            String str4 = CLEAN;
            if (iIndexOf$default == str4.length() && StringsKt.startsWith$default(str, str4, false, 2, (Object) null)) {
                String strSubstring2 = str.substring(iIndexOf$default2 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List<String> listSplit$default = StringsKt.split$default((CharSequence) strSubstring2, new char[]{TokenParser.SP}, false, 0, 6, (Object) null);
                entry.setReadable$okhttp(true);
                entry.setCurrentEditor$okhttp(null);
                entry.setLengths$okhttp(listSplit$default);
                return;
            }
        }
        if (iIndexOf$default2 == -1) {
            String str5 = DIRTY;
            if (iIndexOf$default == str5.length() && StringsKt.startsWith$default(str, str5, false, 2, (Object) null)) {
                entry.setCurrentEditor$okhttp(new Editor(this, entry));
                return;
            }
        }
        if (iIndexOf$default2 == -1) {
            String str6 = READ;
            if (iIndexOf$default == str6.length() && StringsKt.startsWith$default(str, str6, false, 2, (Object) null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private final boolean removeOldestEntry() throws IOException {
        for (Entry toEvict : this.lruEntries.values()) {
            if (!toEvict.getZombie$okhttp()) {
                Intrinsics.checkNotNullExpressionValue(toEvict, "toEvict");
                removeEntry$okhttp(toEvict);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String str) {
        if (!LEGAL_KEY_PATTERN.matches(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        Editor currentEditor$okhttp;
        if (!this.initialized || this.closed) {
            this.closed = true;
            return;
        }
        Collection<Entry> collectionValues = this.lruEntries.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "lruEntries.values");
        for (Entry entry : (Entry[]) collectionValues.toArray(new Entry[0])) {
            if (entry.getCurrentEditor$okhttp() != null && (currentEditor$okhttp = entry.getCurrentEditor$okhttp()) != null) {
                currentEditor$okhttp.detach$okhttp();
            }
        }
        trimToSize();
        BufferedSink bufferedSink = this.journalWriter;
        Intrinsics.checkNotNull(bufferedSink);
        bufferedSink.close();
        this.journalWriter = null;
        this.closed = true;
    }

    public final synchronized void completeEdit$okhttp(Editor editor, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(editor, "editor");
        Entry entry$okhttp = editor.getEntry$okhttp();
        if (!Intrinsics.areEqual(entry$okhttp.getCurrentEditor$okhttp(), editor)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (z2 && !entry$okhttp.getReadable$okhttp()) {
            int i2 = this.valueCount;
            for (int i3 = 0; i3 < i2; i3++) {
                boolean[] written$okhttp = editor.getWritten$okhttp();
                Intrinsics.checkNotNull(written$okhttp);
                if (!written$okhttp[i3]) {
                    editor.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i3);
                }
                if (!this.fileSystem.exists(entry$okhttp.getDirtyFiles$okhttp().get(i3))) {
                    editor.abort();
                    return;
                }
            }
        }
        int i4 = this.valueCount;
        for (int i5 = 0; i5 < i4; i5++) {
            File file = entry$okhttp.getDirtyFiles$okhttp().get(i5);
            if (!z2 || entry$okhttp.getZombie$okhttp()) {
                this.fileSystem.delete(file);
            } else if (this.fileSystem.exists(file)) {
                File file2 = entry$okhttp.getCleanFiles$okhttp().get(i5);
                this.fileSystem.rename(file, file2);
                long j2 = entry$okhttp.getLengths$okhttp()[i5];
                long size = this.fileSystem.size(file2);
                entry$okhttp.getLengths$okhttp()[i5] = size;
                this.size = (this.size - j2) + size;
            }
        }
        entry$okhttp.setCurrentEditor$okhttp(null);
        if (entry$okhttp.getZombie$okhttp()) {
            removeEntry$okhttp(entry$okhttp);
            return;
        }
        this.redundantOpCount++;
        BufferedSink bufferedSink = this.journalWriter;
        Intrinsics.checkNotNull(bufferedSink);
        if (entry$okhttp.getReadable$okhttp() || z2) {
            entry$okhttp.setReadable$okhttp(true);
            bufferedSink.writeUtf8(CLEAN).writeByte(32);
            bufferedSink.writeUtf8(entry$okhttp.getKey$okhttp());
            entry$okhttp.writeLengths$okhttp(bufferedSink);
            bufferedSink.writeByte(10);
            if (z2) {
                long j3 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j3;
                entry$okhttp.setSequenceNumber$okhttp(j3);
            }
        } else {
            this.lruEntries.remove(entry$okhttp.getKey$okhttp());
            bufferedSink.writeUtf8(REMOVE).writeByte(32);
            bufferedSink.writeUtf8(entry$okhttp.getKey$okhttp());
            bufferedSink.writeByte(10);
        }
        bufferedSink.flush();
        if (this.size > this.maxSize || journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final void delete() throws IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final Editor edit(String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        return edit$default(this, key, 0L, 2, null);
    }

    public final synchronized Editor edit(String key, long j2) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (j2 != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber$okhttp() != j2)) {
            return null;
        }
        if ((entry != null ? entry.getCurrentEditor$okhttp() : null) != null) {
            return null;
        }
        if (entry != null && entry.getLockingSourceCount$okhttp() != 0) {
            return null;
        }
        if (this.mostRecentTrimFailed || this.mostRecentRebuildFailed) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return null;
        }
        BufferedSink bufferedSink = this.journalWriter;
        Intrinsics.checkNotNull(bufferedSink);
        bufferedSink.writeUtf8(DIRTY).writeByte(32).writeUtf8(key).writeByte(10);
        bufferedSink.flush();
        if (this.hasJournalErrors) {
            return null;
        }
        if (entry == null) {
            entry = new Entry(this, key);
            this.lruEntries.put(key, entry);
        }
        Editor editor = new Editor(this, entry);
        entry.setCurrentEditor$okhttp(editor);
        return editor;
    }

    public final synchronized void evictAll() throws IOException {
        initialize();
        Collection<Entry> collectionValues = this.lruEntries.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "lruEntries.values");
        for (Entry entry : (Entry[]) collectionValues.toArray(new Entry[0])) {
            Intrinsics.checkNotNullExpressionValue(entry, "entry");
            removeEntry$okhttp(entry);
        }
        this.mostRecentTrimFailed = false;
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            BufferedSink bufferedSink = this.journalWriter;
            Intrinsics.checkNotNull(bufferedSink);
            bufferedSink.flush();
        }
    }

    public final synchronized Snapshot get(String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return null;
        }
        Snapshot snapshotSnapshot$okhttp = entry.snapshot$okhttp();
        if (snapshotSnapshot$okhttp == null) {
            return null;
        }
        this.redundantOpCount++;
        BufferedSink bufferedSink = this.journalWriter;
        Intrinsics.checkNotNull(bufferedSink);
        bufferedSink.writeUtf8(READ).writeByte(32).writeUtf8(key).writeByte(10);
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return snapshotSnapshot$okhttp;
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final synchronized void initialize() throws IOException {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.initialized) {
            return;
        }
        if (this.fileSystem.exists(this.journalFileBackup)) {
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.delete(this.journalFileBackup);
            } else {
                this.fileSystem.rename(this.journalFileBackup, this.journalFile);
            }
        }
        this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
        if (this.fileSystem.exists(this.journalFile)) {
            try {
                readJournal();
                processJournal();
                this.initialized = true;
                return;
            } catch (IOException e2) {
                Platform.Companion.get().log("DiskLruCache " + this.directory + " is corrupt: " + e2.getMessage() + ", removing", 5, e2);
                try {
                    delete();
                    rebuildJournal$okhttp();
                    this.initialized = true;
                } finally {
                    this.closed = false;
                }
            }
        }
        rebuildJournal$okhttp();
        this.initialized = true;
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void rebuildJournal$okhttp() throws IOException {
        BufferedSink bufferedSink = this.journalWriter;
        if (bufferedSink != null) {
            bufferedSink.close();
        }
        BufferedSink bufferedSinkBuffer = Okio.buffer(this.fileSystem.sink(this.journalFileTmp));
        try {
            BufferedSink bufferedSink2 = bufferedSinkBuffer;
            bufferedSink2.writeUtf8(MAGIC).writeByte(10);
            bufferedSink2.writeUtf8(VERSION_1).writeByte(10);
            bufferedSink2.writeDecimalLong(this.appVersion).writeByte(10);
            bufferedSink2.writeDecimalLong(this.valueCount).writeByte(10);
            bufferedSink2.writeByte(10);
            for (Entry entry : this.lruEntries.values()) {
                if (entry.getCurrentEditor$okhttp() != null) {
                    bufferedSink2.writeUtf8(DIRTY).writeByte(32);
                    bufferedSink2.writeUtf8(entry.getKey$okhttp());
                    bufferedSink2.writeByte(10);
                } else {
                    bufferedSink2.writeUtf8(CLEAN).writeByte(32);
                    bufferedSink2.writeUtf8(entry.getKey$okhttp());
                    entry.writeLengths$okhttp(bufferedSink2);
                    bufferedSink2.writeByte(10);
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(bufferedSinkBuffer, null);
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.rename(this.journalFile, this.journalFileBackup);
            }
            this.fileSystem.rename(this.journalFileTmp, this.journalFile);
            this.fileSystem.delete(this.journalFileBackup);
            this.journalWriter = newJournalWriter();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } finally {
        }
    }

    public final synchronized boolean remove(String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return false;
        }
        boolean zRemoveEntry$okhttp = removeEntry$okhttp(entry);
        if (zRemoveEntry$okhttp && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return zRemoveEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(Entry entry) throws IOException {
        BufferedSink bufferedSink;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (bufferedSink = this.journalWriter) != null) {
                bufferedSink.writeUtf8(DIRTY);
                bufferedSink.writeByte(32);
                bufferedSink.writeUtf8(entry.getKey$okhttp());
                bufferedSink.writeByte(10);
                bufferedSink.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i2 = this.valueCount;
        for (int i3 = 0; i3 < i2; i3++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i3));
            this.size -= entry.getLengths$okhttp()[i3];
            entry.getLengths$okhttp()[i3] = 0;
        }
        this.redundantOpCount++;
        BufferedSink bufferedSink2 = this.journalWriter;
        if (bufferedSink2 != null) {
            bufferedSink2.writeUtf8(REMOVE);
            bufferedSink2.writeByte(32);
            bufferedSink2.writeUtf8(entry.getKey$okhttp());
            bufferedSink2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z2) {
        this.closed = z2;
    }

    public final synchronized void setMaxSize(long j2) {
        this.maxSize = j2;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final synchronized long size() throws IOException {
        initialize();
        return this.size;
    }

    public final synchronized Iterator<Snapshot> snapshots() throws IOException {
        initialize();
        return new AnonymousClass1();
    }

    public final void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }
}
