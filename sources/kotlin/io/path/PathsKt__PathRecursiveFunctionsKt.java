package kotlin.io.path;

import com.dynatrace.android.agent.Global;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystemException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яx\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0013\u007f\u0007|jA0JnP.hS2\u000f\u0002{<$a$yCQU\"}8\tWȞog\u0005JbŏK\u000f\u0014\u001f\u0001j2I]xs\u0012\u00172XoG3coE9ft>\u0005.P*8\u007f\u0005\t\u001a@H\u0018v\u0001GS\f ?HpPR\u0015M\u000b\u001b\u001a\u0006T \t\u001ebgfXVǍu:]\"3mPN?_^}}\u0017TV?\u0013\u0007c.+n6c\u0018kو\t\u07baV[E\u0007W\rK\n\u0001'U*ywe<p\u007fB\u001c[S\u001b]\u000b&\u000b\u0006\u0018`В++Ukck\u001c1\u0010z*\fl\b\u001c\u0010?H\\4Jj\u0016\u000eKt!T\u0007PؿbB\u0006\u0006yZ%1\u00185A8asqcAϊ\\D,\u000f\u001b ;\u0007~#kTTmC\u001e\u001bȰWśUBCV\\\u0019q3{\u0014\tb01,0u\u0007_\u007f\u001f?/%ebir'k\u0010Z\\1\u0007\u0016pw\u0002pʐLJ(\u0003&=0\u001e\u001c\\Jj+\u0002`eh;?TɟX\u0011\u0004\u001c#&b\rL#+\u0016t`x~z`\f!\u000e/EO֍ru\u0014kId9Jae\u0016gx\u0010$ALb3r\u0015U\u0004\u0010hw@\"`d\u001b\u0014\u0006\u0019\\N:/xD\nʾ3:A1\\CO+\u001epH-\rmk\u0001\u0010-[cs\ti2\u0007!J`m\u0001~\u0016\u007fͅ0\u0007f6=GWJ)([(\u000fJ\r4\u0017\u000e\"\u0007ěkVM`|\u001c{j\f\"\u001c _b?R#\"-@\u001b\u0002\f]ʆvoWa\"-\u0001\u0012\n\u0011AnT\u0001\u0018l\u0001,\u000f\u0005xb\u0005\u001b0\u0012vrQ$\u0015A\u007faT\u0019_\u001fd\rk>w\u0012\u0013jL]f\u0004ġ#(+\u0015\u007f(\u0003J=E-#<\u000e$@%p\fpܓ2\u0004h#6zk\u0019<e\u001cu\tbm4K8wy-Qѐ(l\tc\u000fo\u0010\u0012P+L\raGid\u001f]~R#H\f\n\u001f6\u001dvf_h*X}\u0013F\u000eN\u001cC,\u001b%CѼ\u0015MY\r\u0006\u0013Y\u0003#J=\t3\u0002Ap\"\u001ck'\u0005~\u0013\r>\u001b\f\u0018dHkf\u0013<!$b-\u0003\bդGTo.( \u000eow\u000fE1jyKX\u001eT'c\u0005o5dSu9*/\u0006?7,xM13n\rTвg2\u0007}5<)\u0016g~\u0015ASJd;+(\u0007\b9l\u000eGW.N\u0004u0\u001e{}9P \r!H\u0017+9\u007f@\u000e%P^9\u0005+NЩz\u0014l\u0003\\SA\u000e\t/&<8B3\u0019}\u00136cυPN}k[)\u000fI\\)5?%ct5s\u0007\u05f91=O\u001f͈+1"}, d2 = {"1n[9X*M7\u001am}k6\u000f\u0017", "", "1n[9X*M]&", "\u001aj^A_0G\u001d\u001d\tDi(\f\fxE\u0013&{K\u0010\u001b!P}kF},5W\r*DC", "4t]0g0H\\", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "1n[9X*M7\u001am}k6\u000f\u0017mP{7~Nf&\u0011AZ\nKy\u00125W\u000e-Eq'..SDiC\"\u001fqo\u001f\u0016", "7mb2V<KSx\b\n^9[\r<e}7\u0006M\u0015", ">`c5", "\u001aiPCTuGW#H{b3|R\u001aa\u000f+Q", "7mb2V<KSx\b\n^9[\r<e}7\u0006M\u0015U\u0002C~\u0011J\\4/Sh\u001cFp\u0003.KSHy8/\u0015IqB\u0005r0X\u007f5-[", "7mb2V<KS{z\u0004]3|h8t\r<", "3mc?l", "7mb2V<KS{z\u0004]3|h8t\r<:+|&\u001aUU\u001d6p\u00101h\u0001\r7k&;[GLk\u0015.\u001efp=\u0011l:4\u0006", "Bqh\u0016Z5H`\u0019g\u0005L<z\f\u0010i\u0007([S~\u0017\"Vs\u0018E", Global.BLANK, "Bqh\u0016Z5H`\u0019g\u0005L<z\f\u0010i\u0007([S~\u0017\"Vs\u0018E5\u00101h\u0001.\u001d|\u0010(8?Jn!\u001e\u0013xnG\u000bt,/\u00070E[R6e`XL", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "1n_FG6+S\u0017\u000f\bl0\u000e\t6y", "B`a4X;", "=m4?e6K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "And?V,", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU", "3wR2c;B]\"", "\u001aj^A_0G\u001d\u001d\tDi(\f\fxO\t\b\tM\u000b$\u0004G}\u001eC\u0006z", "4n[9b>%W\"\u0005\t", "", "=uT?j9Bb\u0019", "1n_F4*MW#\b", "\u001aj^A_0G\u001d\u001d\tDi(\f\fxC\n3\u0010\u001c~&\u001bQxkF\u007f45l\ru", "\u001aj^A_0G\u001d\u001d\tDi(\f\fxC\n3\u0010\u001c~&\u001bQxz<\u00055<hS", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "2d[2g,+S\u0017\u000f\bl0\u000e\t6y", "2d[2g,+S\u0017\u000f\bl0\u000e\t6yc0\u0007G", "", "2d[2g,+S\u0017\u000f\bl0\u000e\t6yc0\u0007G?\u0002\u0013Vr\u001c\"\u0006\u001f/Dy/:Z\u0016,]PIoE\u001euxj7\u0016g6W\u0005\rV", "3mc2e\u000bB`\u0019|\nh9\u0011", "\u001aiPCTuGW#H{b3|R\u001de}8\t@_\u001b$Gm\u001dF\u00049#h\u000b 3uk", "3mc2e\u000bB`\u0019|\nh9\u0011G\u001aa\u000f+\n&\u0010\u0011\u00112k\u001d?c%3i\u000b.;~\u0016\u000f]L9z8(\u001evGH", "6`]1_,\u001e\\(\f\u000f", "6`]1_,\u001e\\(\f\u000f\u001d\u0017x\u00182se7u:k\u0013&J\\\u000e:\u00072C]\u000f \u0018}\u001f,\\GEtB\u0004$", "7r36e,<b#\f\u000f", "3mc?l\u0015:[\u0019", "=oc6b5L", "", "\u001aiPCTuGW#H{b3|R\u0016i\t.eK\u0010\u001b!PE", "7r36e,<b#\f\u000f\u001d\u0017x\u00182se7u:k\u0013&J\\\u000e:\u00072C]\u000f \u0018}\u001f,\\GEtB\u0004$", "uKY.i(\b\\\u001d\tD_0\u0004\txS\u007f&\fM\u0001u\u001bTo\fK\u00012IG\r-7i\u001e\u00044H7|0g\u001elk\u0003\bg3N@\u0012C[Q\u0002R9w9%\u000e$\u0017R5V\u0006]H$8+;(\u000e\u0016T\u0011?r\naY\u0003", "Bn56_,/W'\u0003\nK,\u000b\u00196t", "\u001aiPCTuGW#H{b3|R\u0010i\u0007(lD\u000f\u001b&4o\u001cL}4\u000b", "Bn56_,/W'\u0003\nK,\u000b\u00196t>\u0013wO\u0004%|Vi\b'r48F}\u001eGz$2^C\u001c{=\u001c$lkB\u0015I;", "9nc9\\5\u0006a(}\u0002b)D\u000e.kQ"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{5:x9);.s\u0014$6)3\n2")
class PathsKt__PathRecursiveFunctionsKt extends PathsKt__PathReadWriteKt {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CopyActionResult.values().length];
            try {
                iArr[CopyActionResult.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CopyActionResult.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CopyActionResult.SKIP_SUBTREE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OnErrorResult.values().length];
            try {
                iArr2[OnErrorResult.TERMINATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OnErrorResult.SKIP_SUBTREE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final void collectIfThrows$PathsKt__PathRecursiveFunctionsKt(ExceptionsCollector exceptionsCollector, Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Exception e2) {
            exceptionsCollector.collect(e2);
        }
    }

    public static final Path copyToRecursively(final Path path, final Path target, final Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> onError, boolean z2, final Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> copyAction) throws FileSystemException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(copyAction, "copyAction");
        LinkOption[] linkOptions = LinkFollowing.INSTANCE.toLinkOptions(z2);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
        if (!Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            throw new NoSuchFileException(path.toString(), target.toString(), "The source file doesn't exist.");
        }
        boolean zStartsWith = false;
        if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && (z2 || !Files.isSymbolicLink(path))) {
            boolean z3 = Files.exists(target, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && !Files.isSymbolicLink(target);
            if (!z3 || !Files.isSameFile(path, target)) {
                if (Intrinsics.areEqual(path.getFileSystem(), target.getFileSystem())) {
                    if (z3) {
                        zStartsWith = target.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]));
                    } else {
                        Path parent = target.getParent();
                        if (parent != null && Files.exists(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && parent.toRealPath(new LinkOption[0]).startsWith(path.toRealPath(new LinkOption[0]))) {
                            zStartsWith = true;
                        }
                    }
                }
                if (zStartsWith) {
                    throw new FileSystemException(path.toString(), target.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
                }
            }
        }
        PathsKt.visitFileTree$default(path, 0, z2, new Function1<FileVisitorBuilder, Unit>() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.copyToRecursively.5

            /* JADX INFO: renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$1, reason: invalid class name */
            @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
            /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<Path, BasicFileAttributes, FileVisitResult> {
                final /* synthetic */ Function3<CopyActionContext, Path, Path, CopyActionResult> $copyAction;
                final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> $onError;
                final /* synthetic */ Path $target;
                final /* synthetic */ Path $this_copyToRecursively;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass1(Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> function3, Path path, Path path2, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function32) {
                    super(2, Intrinsics.Kotlin.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                    this.$copyAction = function3;
                    this.$this_copyToRecursively = path;
                    this.$target = path2;
                    this.$onError = function32;
                }

                @Override // kotlin.jvm.functions.Function2
                public final FileVisitResult invoke(Path p02, BasicFileAttributes p1) {
                    Intrinsics.checkNotNullParameter(p02, "p0");
                    Intrinsics.checkNotNullParameter(p1, "p1");
                    return PathsKt__PathRecursiveFunctionsKt.copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError, p02, p1);
                }
            }

            /* JADX INFO: renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2, reason: invalid class name */
            @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
            /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function2<Path, BasicFileAttributes, FileVisitResult> {
                final /* synthetic */ Function3<CopyActionContext, Path, Path, CopyActionResult> $copyAction;
                final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> $onError;
                final /* synthetic */ Path $target;
                final /* synthetic */ Path $this_copyToRecursively;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> function3, Path path, Path path2, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function32) {
                    super(2, Intrinsics.Kotlin.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                    this.$copyAction = function3;
                    this.$this_copyToRecursively = path;
                    this.$target = path2;
                    this.$onError = function32;
                }

                @Override // kotlin.jvm.functions.Function2
                public final FileVisitResult invoke(Path p02, BasicFileAttributes p1) {
                    Intrinsics.checkNotNullParameter(p02, "p0");
                    Intrinsics.checkNotNullParameter(p1, "p1");
                    return PathsKt__PathRecursiveFunctionsKt.copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(this.$copyAction, this.$this_copyToRecursively, this.$target, this.$onError, p02, p1);
                }
            }

            /* JADX INFO: renamed from: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3, reason: invalid class name */
            @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
            /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function2<Path, Exception, FileVisitResult> {
                final /* synthetic */ Function3<Path, Path, Exception, OnErrorResult> $onError;
                final /* synthetic */ Path $target;
                final /* synthetic */ Path $this_copyToRecursively;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass3(Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function3, Path path, Path path2) {
                    super(2, Intrinsics.Kotlin.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
                    this.$onError = function3;
                    this.$this_copyToRecursively = path;
                    this.$target = path2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final FileVisitResult invoke(Path p02, Exception p1) {
                    Intrinsics.checkNotNullParameter(p02, "p0");
                    Intrinsics.checkNotNullParameter(p1, "p1");
                    return PathsKt__PathRecursiveFunctionsKt.copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(this.$onError, this.$this_copyToRecursively, this.$target, p02, p1);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(FileVisitorBuilder fileVisitorBuilder) {
                invoke2(fileVisitorBuilder);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(FileVisitorBuilder visitFileTree) {
                Intrinsics.checkNotNullParameter(visitFileTree, "$this$visitFileTree");
                visitFileTree.onPreVisitDirectory(new AnonymousClass1(copyAction, path, target, onError));
                visitFileTree.onVisitFile(new AnonymousClass2(copyAction, path, target, onError));
                visitFileTree.onVisitFileFailed(new AnonymousClass3(onError, path, target));
                final Function3<Path, Path, Exception, OnErrorResult> function3 = onError;
                final Path path2 = path;
                final Path path3 = target;
                visitFileTree.onPostVisitDirectory(new Function2<Path, IOException, FileVisitResult>() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.copyToRecursively.5.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final FileVisitResult invoke(Path directory, IOException iOException) {
                        Intrinsics.checkNotNullParameter(directory, "directory");
                        return iOException == null ? FileVisitResult.CONTINUE : PathsKt__PathRecursiveFunctionsKt.copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(function3, path2, path3, directory, iOException);
                    }
                });
            }
        }, 1, (Object) null);
        return target;
    }

    public static final Path copyToRecursively(Path path, Path target, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> onError, final boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onError, "onError");
        return z3 ? PathsKt.copyToRecursively(path, target, onError, z2, new Function3<CopyActionContext, Path, Path, CopyActionResult>() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.copyToRecursively.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final CopyActionResult invoke(CopyActionContext copyToRecursively, Path src, Path dst) {
                Intrinsics.checkNotNullParameter(copyToRecursively, "$this$copyToRecursively");
                Intrinsics.checkNotNullParameter(src, "src");
                Intrinsics.checkNotNullParameter(dst, "dst");
                LinkOption[] linkOptions = LinkFollowing.INSTANCE.toLinkOptions(z2);
                boolean zIsDirectory = Files.isDirectory(dst, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1));
                LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptions, linkOptions.length);
                if (!Files.isDirectory(src, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !zIsDirectory) {
                    if (zIsDirectory) {
                        PathsKt.deleteRecursively(dst);
                    }
                    SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                    spreadBuilder.addSpread(linkOptions);
                    spreadBuilder.add(StandardCopyOption.REPLACE_EXISTING);
                    CopyOption[] copyOptionArr = (CopyOption[]) spreadBuilder.toArray(new CopyOption[spreadBuilder.size()]);
                    Intrinsics.checkNotNullExpressionValue(Files.copy(src, dst, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(...)");
                }
                return CopyActionResult.CONTINUE;
            }
        }) : PathsKt.copyToRecursively$default(path, target, onError, z2, (Function3) null, 8, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult> function3, Path path, Path path2, Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function32, Path path3, BasicFileAttributes basicFileAttributes) {
        try {
            return toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(function3.invoke(DefaultCopyActionContext.INSTANCE, path3, copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(path, path2, path3)));
        } catch (Exception e2) {
            return copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(function32, path, path2, path3, e2);
        }
    }

    public static /* synthetic */ Path copyToRecursively$default(Path path, Path path2, Function3 function3, final boolean z2, Function3 function32, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            function3 = new Function3() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.copyToRecursively.3
                @Override // kotlin.jvm.functions.Function3
                public final Void invoke(Path path3, Path path4, Exception exception) throws Exception {
                    Intrinsics.checkNotNullParameter(path3, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(path4, "<anonymous parameter 1>");
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    throw exception;
                }
            };
        }
        if ((i2 + 8) - (i2 | 8) != 0) {
            function32 = new Function3<CopyActionContext, Path, Path, CopyActionResult>() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.copyToRecursively.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final CopyActionResult invoke(CopyActionContext copyActionContext, Path src, Path dst) {
                    Intrinsics.checkNotNullParameter(copyActionContext, "$this$null");
                    Intrinsics.checkNotNullParameter(src, "src");
                    Intrinsics.checkNotNullParameter(dst, "dst");
                    return copyActionContext.copyToIgnoringExistingDirectory(src, dst, z2);
                }
            };
        }
        return PathsKt.copyToRecursively(path, path2, (Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult>) function3, z2, (Function3<? super CopyActionContext, ? super Path, ? super Path, ? extends CopyActionResult>) function32);
    }

    public static /* synthetic */ Path copyToRecursively$default(Path path, Path path2, Function3 function3, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function3 = new Function3() { // from class: kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.copyToRecursively.1
                @Override // kotlin.jvm.functions.Function3
                public final Void invoke(Path path3, Path path4, Exception exception) throws Exception {
                    Intrinsics.checkNotNullParameter(path3, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(path4, "<anonymous parameter 1>");
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    throw exception;
                }
            };
        }
        return PathsKt.copyToRecursively(path, path2, (Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult>) function3, z2, z3);
    }

    private static final Path copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(Path path, Path path2, Path path3) {
        Path pathResolve = path2.resolve(PathsKt.relativeTo(path3, path).toString());
        Intrinsics.checkNotNullExpressionValue(pathResolve, "resolve(...)");
        return pathResolve;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FileVisitResult copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Function3<? super Path, ? super Path, ? super Exception, ? extends OnErrorResult> function3, Path path, Path path2, Path path3, Exception exc) {
        return toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(function3.invoke(path3, copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(path, path2, path3), exc));
    }

    public static final void deleteRecursively(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        List<Exception> listDeleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt = deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(path);
        if (listDeleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt.isEmpty()) {
            return;
        }
        FileSystemException fileSystemException = new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
        Iterator<T> it = listDeleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(fileSystemException, (Exception) it.next());
        }
        throw fileSystemException;
    }

    private static final List<Exception> deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(Path path) throws IOException {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        boolean z2 = false;
        boolean z3 = true;
        ExceptionsCollector exceptionsCollector = new ExceptionsCollector(0, 1, null);
        Path parent = path.getParent();
        if (parent != null) {
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(parent);
            } catch (Throwable unused) {
                directoryStreamNewDirectoryStream = null;
            }
            if (directoryStreamNewDirectoryStream != null) {
                DirectoryStream<Path> directoryStream = directoryStreamNewDirectoryStream;
                try {
                    DirectoryStream<Path> directoryStream2 = directoryStream;
                    if (directoryStream2 instanceof SecureDirectoryStream) {
                        exceptionsCollector.setPath(parent);
                        Path fileName = path.getFileName();
                        Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                        handleEntry$PathsKt__PathRecursiveFunctionsKt((SecureDirectoryStream) directoryStream2, fileName, exceptionsCollector);
                    } else {
                        z2 = true;
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(directoryStream, null);
                    z3 = z2;
                } finally {
                }
            }
        }
        if (z3) {
            insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(path, exceptionsCollector);
        }
        return exceptionsCollector.getCollectedExceptions();
    }

    private static final void enterDirectory$PathsKt__PathRecursiveFunctionsKt(SecureDirectoryStream<Path> secureDirectoryStream, Path path, ExceptionsCollector exceptionsCollector) {
        SecureDirectoryStream<Path> secureDirectoryStreamNewDirectoryStream;
        try {
            try {
                secureDirectoryStreamNewDirectoryStream = secureDirectoryStream.newDirectoryStream(path, LinkOption.NOFOLLOW_LINKS);
            } catch (NoSuchFileException unused) {
                secureDirectoryStreamNewDirectoryStream = null;
            }
            if (secureDirectoryStreamNewDirectoryStream == null) {
                return;
            }
            SecureDirectoryStream<Path> secureDirectoryStream2 = secureDirectoryStreamNewDirectoryStream;
            try {
                SecureDirectoryStream<Path> secureDirectoryStream3 = secureDirectoryStream2;
                Iterator<Path> it = secureDirectoryStream3.iterator();
                while (it.hasNext()) {
                    Path fileName = it.next().getFileName();
                    Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                    handleEntry$PathsKt__PathRecursiveFunctionsKt(secureDirectoryStream3, fileName, exceptionsCollector);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(secureDirectoryStream2, null);
            } finally {
            }
        } catch (Exception e2) {
            exceptionsCollector.collect(e2);
        }
    }

    private static final void handleEntry$PathsKt__PathRecursiveFunctionsKt(SecureDirectoryStream<Path> secureDirectoryStream, Path path, ExceptionsCollector exceptionsCollector) {
        exceptionsCollector.enterEntry(path);
        try {
        } catch (Exception e2) {
            exceptionsCollector.collect(e2);
        }
        if (isDirectory$PathsKt__PathRecursiveFunctionsKt(secureDirectoryStream, path, LinkOption.NOFOLLOW_LINKS)) {
            int totalExceptions = exceptionsCollector.getTotalExceptions();
            enterDirectory$PathsKt__PathRecursiveFunctionsKt(secureDirectoryStream, path, exceptionsCollector);
            if (totalExceptions == exceptionsCollector.getTotalExceptions()) {
                secureDirectoryStream.deleteDirectory(path);
                Unit unit = Unit.INSTANCE;
            }
            exceptionsCollector.exitEntry(path);
        }
        secureDirectoryStream.deleteFile(path);
        Unit unit2 = Unit.INSTANCE;
        exceptionsCollector.exitEntry(path);
    }

    private static final void insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(Path path, ExceptionsCollector exceptionsCollector) {
        DirectoryStream<Path> directoryStreamNewDirectoryStream;
        try {
            try {
                directoryStreamNewDirectoryStream = Files.newDirectoryStream(path);
            } catch (Exception e2) {
                exceptionsCollector.collect(e2);
                return;
            }
        } catch (NoSuchFileException unused) {
            directoryStreamNewDirectoryStream = null;
        }
        if (directoryStreamNewDirectoryStream == null) {
            return;
        }
        DirectoryStream<Path> directoryStream = directoryStreamNewDirectoryStream;
        try {
            for (Path path2 : directoryStream) {
                Intrinsics.checkNotNull(path2);
                insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(path2, exceptionsCollector);
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(directoryStream, null);
        } finally {
        }
    }

    private static final void insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(Path path, ExceptionsCollector exceptionsCollector) {
        try {
            if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                int totalExceptions = exceptionsCollector.getTotalExceptions();
                insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(path, exceptionsCollector);
                if (totalExceptions == exceptionsCollector.getTotalExceptions()) {
                    Files.deleteIfExists(path);
                }
            } else {
                Files.deleteIfExists(path);
            }
        } catch (Exception e2) {
            exceptionsCollector.collect(e2);
        }
    }

    private static final boolean isDirectory$PathsKt__PathRecursiveFunctionsKt(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean boolValueOf;
        try {
            boolValueOf = Boolean.valueOf(((BasicFileAttributeView) secureDirectoryStream.getFileAttributeView(path, BasicFileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))).readAttributes().isDirectory());
        } catch (NoSuchFileException unused) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    private static final FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(CopyActionResult copyActionResult) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[copyActionResult.ordinal()];
        if (i2 == 1) {
            return FileVisitResult.CONTINUE;
        }
        if (i2 == 2) {
            return FileVisitResult.TERMINATE;
        }
        if (i2 == 3) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(OnErrorResult onErrorResult) {
        int i2 = WhenMappings.$EnumSwitchMapping$1[onErrorResult.ordinal()];
        if (i2 == 1) {
            return FileVisitResult.TERMINATE;
        }
        if (i2 == 2) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final <R> R tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt(Function0<? extends R> function0) {
        try {
            return function0.invoke();
        } catch (NoSuchFileException unused) {
            return null;
        }
    }
}
