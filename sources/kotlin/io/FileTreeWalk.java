package kotlin.io;

import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\u0015\"4\u0012}\u0007njO0LeV7Zݷ2\u000fy{<řc$\bCCU0}*\tUNog\u0005Jb\u000bI\u000f\u000e\u0016\u0007p4I[xe\u0012\u001dXJoE7cڎm?pvF\u0005N2P72\u0006\u00193D\t'|\tSO\u001a\u0013H@\u001f:b\u0013S\u0005(\u0014\u001e>N\u0004ɉ`g\\:\tǗ\\@/3\u0007wCf'\u000e0\rS\u0013Fb)%v\u0010!;RE:-3c\u0005\u0017R\n?\u0013A\u0002=3o=&YO\u0004iD`\u0018\"%-_\r\fr6^\u0015Q\u000f\u0015=*}i[\u0007\u001c2\u0010-\f\u001eL\u0013<\u0006όL83&v\u000e\u0014@\u0005tYFv\u0010nS\u0010\n\u0010Eа)\n97I!l^q=\u001fT]\f\u0015\u000f.#/w7Z\u0003\u0019p\u001b!T\u0006bIQnO˓R\ngP6\u0011~v\u001a0\u00142W\u007f]{?C]½7$E12\u0004\u0002vֳ\u0018z\u0013v\u0001S\u0018d\u0011X0s.7X\u009e<jR{\u001dw`Vh,?M,V\u0017}6\u001aNb@Z//(N}Ŗ\u001a\u0001[t\"7?hGY\u001dk\u001eYI^aDae a\u0001\u007fBJ\u0005z\u0013`~B\u0002ێ\u000bl69JTz\u0012\b{rN\u001c\u0015B? %b2\u0002%j\u0017`\u0003LE\u0018Ҕ\u000bރ^h\u0018з%?2\u0014\u0002$#\u001bWˉ^ʼsg\u0001̢|\u0017n'EOa7)&\u0004\"x6\r#5\u0006\n~um#܄N̡\u001au]ݨpT(CiaM$\u001f\u000eW2ī1OR~uWS\u001f7|\u0003\u007f5Ix?w\u0017\u0019\u007fݽdtP[d\u001d(\u0004nt)\u000e\u000b\u0010\ncVzulj\n\nI \u0382\u0005ʾ@N@وU9,-\u0019}2~E-q'-\u0018\b\u0014]\u001ew\\\u0018u\u0005ӣdϪ*tmֽ|o$pzQ\f2\u0012ͲK˕\u0003>*غр\u0007]"}, d2 = {"\u001aj^A_0G\u001d\u001d\tD?0\u0004\t\u001er\u007f(m<\b\u001dl", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "\u001aiPCTuB]b_~e,R", "AsP?g", "2ha2V;B]\"", "\u001aj^A_0G\u001d\u001d\tD?0\u0004\t!a\u0007.ZD\u000e\u0017\u0015Vs\u0018EL", "uKY.i(\bW#H[b3|^\u0016k\n7\u0003D\n`\u001bQ9n@}%'U\u0005&\u0016q#.KR?u=sXY", "=m4;g,K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "=m;2T=>", "", "=m5.\\3", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4", "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", ExifInterface.GPS_MEASUREMENT_3D, ";`g\u0011X7MV", "", "uKY.i(\bW#H[b3|^\u0016k\n7\u0003D\n`\u001bQ9n@}%'U\u0005&\u0016q#.KR?u=s{nkH\u000eg5\u0018{8O\u0016O<eP\u0002A\u001e\u001bhW/;\u0016\u0003hE.w\u0010\r\u0006\u000e6X\t?qJ\u0011'\u0016~k\u0001KT\u001fK\u0004\u001e\u0004\u000b\nxOWn}QJ\u00118\u0011j\u0016n$`C\u0004)%yb\u001cxY,\u0019\u007f]\u001a\u0001\u001cZwpE(~B-\u000bC?\n6", "7sT?T;H`", "", "2d_A[", "4t]0g0H\\", "\u0012ha2V;H`-l\nZ;|", "\u0014h[2G9>S\u000bz\u0002d\u0010\f\t<a\u000f2\t", "%`[8F;:b\u0019", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class FileTreeWalk implements Sequence<File> {
    private final FileWalkDirection direction;
    private final int maxDepth;
    private final Function1<File, Boolean> onEnter;
    private final Function2<File, IOException, Unit> onFail;
    private final Function1<File, Unit> onLeave;
    private final File start;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0005BBߚ(\u0007\u0015iy;TiV.jSX\u0010ө\u007f42]ҾuF"}, d2 = {"\u001aj^A_0G\u001d\u001d\tD?0\u0004\t\u001er\u007f(m<\b\u001dU&s\u001b<t4?f\u0012\u000eFi%.#", "\u001aj^A_0G\u001d\u001d\tD?0\u0004\t\u001er\u007f(m<\b\u001dU9k\u0015Bd41h}u", "@n^A70K", "\u001aiPCTuB]b_~e,R", "uKY.i(\bW#H[b3|^rV", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static abstract class DirectoryState extends WalkState {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DirectoryState(File rootDir) {
            super(rootDir);
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\u000b6B\u0015\"4\u0012\u000e\u0007nʑA0ReP\u008cZS@\u000fs{:(aҘsYП\u0006 \u000e$\u0019O|g\u0016m\u0003[\u0016O\u001cF\u0019ѱn,WVAc \u0014JB\u001eEy_8KGg\r63(b&F\u0003\u001d\u0001H*\u000f\u0010?\u0004QU$\u0014F?\u001f:\u0019ҋ[U, \bV&\u0011 lg|:vo4ƀ1ݭ\u0007iJ÷ϴc>"}, d2 = {"\u001aj^A_0G\u001d\u001d\tD?0\u0004\t\u001er\u007f(m<\b\u001dU(s\u0015<e25Yo\u001c>sy=MP7z>+j", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c}%&Tk\fKZ45fy/Azk", "\u001aiPCTuB]b_~e,R", "uKZ<g3B\\b\u0003\u0005(\r\u0001\u0010/T\r({2|\u001e\u001d\u001d3~", "AsPAX", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CD\u007f4\f@V", "\u001aj^A_0G\u001d\u001d\tD?0\u0004\t\u001er\u007f(m<\b\u001dU9k\u0015Bd41h}u", "1n\\=h;><\u0019\u0012\n", "", "2ha2V;H`-l\nZ;|", "\u001aj^A_0G\u001d\u001d\tD?0\u0004\t\u001er\u007f(m<\b\u001dU&s\u001b<t4?f\u0012\u000eFi%.#", "@n^A", "5nc<A,Qb", "\u0010ncAb4.^w\u0003\b^*\f\u0013<ym7wO\u0001", "!h]4_,\u001fW ~hm(\f\t", "\"n_\u0011b>G2\u001d\fz\\;\u0007\u0016CS\u000f$\u000b@", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private final class FileTreeWalkIterator extends AbstractIterator<File> {
        private final ArrayDeque<WalkState> state;

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007fјnjG6L͜P.`b2\u000fq}:Ŝ]:ڎs;\u0004\u0019>-\u0019S\\g\u007fnx[ŲG\u000f\u0014\u0018Ar:Tmzs\u0011=3\t\u0004\u0010?[rU9\u000fx\rӏ,ݨ&8\u0002ڎQ&8M(v)I\"Ë\u001eضDpBĥ]c\u0013!*\u000eN\"\u0011\u001e\u000bhd5vt4ƀ;ݭ\u0007kJN5h\u0001\t[\u0017^TU\u0011MѰ*ҋD7=ՖȕW\u000f"}, d2 = {"\u001aj^A_0G\u001d\u001d\tD?0\u0004\t\u001er\u007f(m<\b\u001dU(s\u0015<e25Yo\u001c>sy=MP7z>+SEkH\u0016m4>\u0002\u0006KYN*k\\\u007fQ\u0002!V\u001dN\u0001", "\u001aj^A_0G\u001d\u001d\tD?0\u0004\t\u001er\u007f(m<\b\u001dU&s\u001b<t4?f\u0012\u000eFi%.#", "@n^A70K", "\u001aiPCTuB]b_~e,R", "uKZ<g3B\\b\u0003\u0005(\r\u0001\u0010/T\r({2|\u001e\u001d\u0006P\u0012Cv\u0014BY}\u00123t\u001c\u0012\\CHgC(\">H>\u0003t(\u0018z1\u0011-R3\\(6.", "4`X9X+", "", "4h[2<5=S,", "", "4h[2?0Lb", "", ")KY.i(\bW#H[b3|^", "@n^AI0LW(~y", "AsT=", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        private final class BottomUpDirectoryState extends DirectoryState {
            private boolean failed;
            private int fileIndex;
            private File[] fileList;
            private boolean rootVisited;
            final /* synthetic */ FileTreeWalkIterator this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BottomUpDirectoryState(FileTreeWalkIterator fileTreeWalkIterator, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.this$0 = fileTreeWalkIterator;
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            public File step() {
                if (!this.failed && this.fileList == null) {
                    Function1 function1 = FileTreeWalk.this.onEnter;
                    if (function1 != null && !((Boolean) function1.invoke(getRoot())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = getRoot().listFiles();
                    this.fileList = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        Function2 function2 = FileTreeWalk.this.onFail;
                        if (function2 != null) {
                            function2.invoke(getRoot(), new AccessDeniedException(getRoot(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.failed = true;
                    }
                }
                File[] fileArr = this.fileList;
                if (fileArr != null) {
                    int i2 = this.fileIndex;
                    Intrinsics.checkNotNull(fileArr);
                    if (i2 < fileArr.length) {
                        File[] fileArr2 = this.fileList;
                        Intrinsics.checkNotNull(fileArr2);
                        int i3 = this.fileIndex;
                        this.fileIndex = i3 + 1;
                        return fileArr2[i3];
                    }
                }
                if (!this.rootVisited) {
                    this.rootVisited = true;
                    return getRoot();
                }
                Function1 function12 = FileTreeWalk.this.onLeave;
                if (function12 != null) {
                    function12.invoke(getRoot());
                }
                return null;
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007f\u0007lj?ӇF{߉^R\u0002)Ov\f82[<qq<ڈ\u001e}0\u000b\u0018Vul\u0007Lp\nq\u0010L*Iv:Lmx\f\u0016e˳NņC3Uڎ\u07b2=f"}, d2 = {"\u001aj^A_0G\u001d\u001d\tD?0\u0004\t\u001er\u007f(m<\b\u001dU(s\u0015<e25Yo\u001c>sy=MP7z>+SVeB\tj,/z.G:](kRH", "\u001aj^A_0G\u001d\u001d\tD?0\u0004\t\u001er\u007f(m<\b\u001dU9k\u0015Bd41h}u", "@n^A90ES", "\u001aiPCTuB]b_~e,R", "uKZ<g3B\\b\u0003\u0005(\r\u0001\u0010/T\r({2|\u001e\u001d\u0006P\u0012Cv\u0014BY}\u00123t\u001c\u0012\\CHgC(\">H>\u0003t(\u0018z1\u0011-R3\\(6.", "Dhb6g,=", "", "AsT=", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        private final class SingleFileState extends WalkState {
            final /* synthetic */ FileTreeWalkIterator this$0;
            private boolean visited;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SingleFileState(FileTreeWalkIterator fileTreeWalkIterator, File rootFile) {
                super(rootFile);
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                this.this$0 = fileTreeWalkIterator;
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            public File step() {
                if (this.visited) {
                    return null;
                }
                this.visited = true;
                return getRoot();
            }
        }

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0018\u007fјnjG?LeN.ZS8\u0018s{:$aҘsYП\u0006\u001a,!IZ^kunbZ9DǇ\n\u0016\u0007ltQc\u0003u\u0014%1pp\u0006G\u001e{K<xtd\tv݈.أ}\u0005\tɝz^\u001e{\u0013K[\u000e\"0nqPQ;S[܈\u001eĂB\"\t\u001ejn\u001fBVtu:],Y݆NĚ+_8ŧ֚\u0011Q"}, d2 = {"\u001aj^A_0G\u001d\u001d\tD?0\u0004\t\u001er\u007f(m<\b\u001dU(s\u0015<e25Yo\u001c>sy=MP7z>+SWkDem>WU+TLL;f_\u0007+#\u000ei\u000e$", "\u001aj^A_0G\u001d\u001d\tD?0\u0004\t\u001er\u007f(m<\b\u001dU&s\u001b<t4?f\u0012\u000eFi%.#", "@n^A70K", "\u001aiPCTuB]b_~e,R", "uKZ<g3B\\b\u0003\u0005(\r\u0001\u0010/T\r({2|\u001e\u001d\u0006P\u0012Cv\u0014BY}\u00123t\u001c\u0012\\CHgC(\">H>\u0003t(\u0018z1\u0011-R3\\(6.", "4h[2<5=S,", "", "4h[2?0Lb", "", ")KY.i(\bW#H[b3|^", "@n^AI0LW(~y", "", "AsT=", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        private final class TopDownDirectoryState extends DirectoryState {
            private int fileIndex;
            private File[] fileList;
            private boolean rootVisited;
            final /* synthetic */ FileTreeWalkIterator this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TopDownDirectoryState(FileTreeWalkIterator fileTreeWalkIterator, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.this$0 = fileTreeWalkIterator;
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
            
                if (r0.length == 0) goto L26;
             */
            @Override // kotlin.io.FileTreeWalk.WalkState
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.io.File step() {
                /*
                    r9 = this;
                    boolean r0 = r9.rootVisited
                    r2 = 0
                    if (r0 != 0) goto L28
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r9.this$0
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r1 = kotlin.io.FileTreeWalk.access$getOnEnter$p(r0)
                    if (r1 == 0) goto L20
                    java.io.File r0 = r9.getRoot()
                    java.lang.Object r0 = r1.invoke(r0)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r2
                L20:
                    r0 = 1
                    r9.rootVisited = r0
                    java.io.File r0 = r9.getRoot()
                    return r0
                L28:
                    java.io.File[] r0 = r9.fileList
                    if (r0 == 0) goto L34
                    int r1 = r9.fileIndex
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r1 >= r0) goto L8d
                L34:
                    java.io.File[] r0 = r9.fileList
                    if (r0 != 0) goto L7f
                    java.io.File r0 = r9.getRoot()
                    java.io.File[] r0 = r0.listFiles()
                    r9.fileList = r0
                    if (r0 != 0) goto L63
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r9.this$0
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function2 r1 = kotlin.io.FileTreeWalk.access$getOnFail$p(r0)
                    if (r1 == 0) goto L63
                    java.io.File r0 = r9.getRoot()
                    kotlin.io.AccessDeniedException r3 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r9.getRoot()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3.<init>(r4, r5, r6, r7, r8)
                    r1.invoke(r0, r3)
                L63:
                    java.io.File[] r0 = r9.fileList
                    if (r0 == 0) goto L6d
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L7f
                L6d:
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r9.this$0
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r1 = kotlin.io.FileTreeWalk.access$getOnLeave$p(r0)
                    if (r1 == 0) goto L7e
                    java.io.File r0 = r9.getRoot()
                    r1.invoke(r0)
                L7e:
                    return r2
                L7f:
                    java.io.File[] r2 = r9.fileList
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                    int r1 = r9.fileIndex
                    int r0 = r1 + 1
                    r9.fileIndex = r0
                    r0 = r2[r1]
                    return r0
                L8d:
                    kotlin.io.FileTreeWalk$FileTreeWalkIterator r0 = r9.this$0
                    kotlin.io.FileTreeWalk r0 = kotlin.io.FileTreeWalk.this
                    kotlin.jvm.functions.Function1 r1 = kotlin.io.FileTreeWalk.access$getOnLeave$p(r0)
                    if (r1 == 0) goto L9e
                    java.io.File r0 = r9.getRoot()
                    r1.invoke(r0)
                L9e:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState.step():java.io.File");
            }
        }

        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public FileTreeWalkIterator() {
            ArrayDeque<WalkState> arrayDeque = new ArrayDeque<>();
            this.state = arrayDeque;
            if (FileTreeWalk.this.start.isDirectory()) {
                arrayDeque.push(directoryState(FileTreeWalk.this.start));
            } else if (FileTreeWalk.this.start.isFile()) {
                arrayDeque.push(new SingleFileState(this, FileTreeWalk.this.start));
            } else {
                done();
            }
        }

        private final DirectoryState directoryState(File file) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[FileTreeWalk.this.direction.ordinal()];
            if (i2 == 1) {
                return new TopDownDirectoryState(this, file);
            }
            if (i2 == 2) {
                return new BottomUpDirectoryState(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        private final File gotoNext() {
            File fileStep;
            while (true) {
                WalkState walkStatePeek = this.state.peek();
                if (walkStatePeek == null) {
                    return null;
                }
                fileStep = walkStatePeek.step();
                if (fileStep == null) {
                    this.state.pop();
                } else {
                    if (Intrinsics.areEqual(fileStep, walkStatePeek.getRoot()) || !fileStep.isDirectory() || this.state.size() >= FileTreeWalk.this.maxDepth) {
                        break;
                    }
                    this.state.push(directoryState(fileStep));
                }
            }
            return fileStep;
        }

        @Override // kotlin.collections.AbstractIterator
        protected void computeNext() {
            File fileGotoNext = gotoNext();
            if (fileGotoNext != null) {
                setNext(fileGotoNext);
            } else {
                done();
            }
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4E\u0005BBߚ(\u0007\u0015iy;TiV.jSX\u0010ө\u007f42]lyQ@m\u001c\u0014!7P\u0015\f8}XZ#C=\u0007Ȁ|p4կmzc\u0015\u001d6ԸsE"}, d2 = {"\u001aj^A_0G\u001d\u001d\tD?0\u0004\t\u001er\u007f(m<\b\u001dU9k\u0015Bd41h}u", "", "@n^A", "\u001aiPCTuB]b_~e,R", "uKY.i(\bW#H[b3|^rV", "5dc\u001fb6M", "u(;7T=:\u001d\u001d\tD?0\u0004\t\u0005", "AsT=", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static abstract class WalkState {
        private final File root;

        public WalkState(File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.root = root;
        }

        public final File getRoot() {
            return this.root;
        }

        public abstract File step();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileTreeWalk(File start, FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }

    public /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FileTreeWalk(File file, FileWalkDirection fileWalkDirection, Function1<? super File, Boolean> function1, Function1<? super File, Unit> function12, Function2<? super File, ? super IOException, Unit> function2, int i2) {
        this.start = file;
        this.direction = fileWalkDirection;
        this.onEnter = function1;
        this.onLeave = function12;
        this.onFail = function2;
        this.maxDepth = i2;
    }

    /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (-1) - (((-1) - i3) | ((-1) - 2)) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, function1, function12, function2, (i3 & 32) != 0 ? Integer.MAX_VALUE : i2);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<File> iterator() {
        return new FileTreeWalkIterator();
    }

    public final FileTreeWalk maxDepth(int i2) {
        if (i2 > 0) {
            return new FileTreeWalk(this.start, this.direction, this.onEnter, this.onLeave, this.onFail, i2);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i2 + '.');
    }

    public final FileTreeWalk onEnter(Function1<? super File, Boolean> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new FileTreeWalk(this.start, this.direction, function, this.onLeave, this.onFail, this.maxDepth);
    }

    public final FileTreeWalk onFail(Function2<? super File, ? super IOException, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new FileTreeWalk(this.start, this.direction, this.onEnter, this.onLeave, function, this.maxDepth);
    }

    public final FileTreeWalk onLeave(Function1<? super File, Unit> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new FileTreeWalk(this.start, this.direction, this.onEnter, function, this.onFail, this.maxDepth);
    }
}
