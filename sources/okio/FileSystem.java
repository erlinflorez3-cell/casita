package okio;

import java.io.IOException;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import okio.Path;
import okio.internal.ResourceFileSystem;
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
@Metadata(bv = {}, d1 = {"Яh\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG9L͜P.`S2\u000fq\t<$iByCAU\"}8\tWNmgvJp\u000bK\u000f\f\u0016\u0001jBI]xc\u0014\u00172XoG3coE9vt>\u0005&3*8\u0010\u0005\t\u001a0H\u0018v\u0011CS\f\u00182F\u0015Pĥ+\u007f5\u001a@\u0005v\u001f3^_ʄR6Vl&F=$\u001bipPWc>\u007fe\rtXo%\u0005b6+n9e\u00193V\u001b\u0007\u0001_o\tEqK\n\u0001'U1\u0010\u0018 Lf\u0007,\u0015YW=a\u0001/t\u0005\u007fd<+9Y{K~\u0012n\u001cC\n\u001bG\u001c\u000e4+x2;&~\b<7;\u0017\u001cV^\u000fvB.\u0003\u0012:%.\u00183Y=Kj_kS\u0019|;B\u0019U*1\u000f\u0007!\n\\>d#*lw\u007f5\u001aVKVf\n\bE\u001e\b~q\u001a*24w\u00065{\u001f>/%ea\u0002//|\u001aHro'\tnwki\u0001L\t:|'O*7\u0014\u000bHr\u0014\u0004P\u0003\\\\\u0017S\u001cb\u0017\u0016\bA&#\u001c\u000573\"fO\u0017q\u001bQk\u0013=/\u0015;\nry\u0018o9\r7{u,\u001coe\u000f\u0014mD\u0013\tfrZS:^%@0E`j>\u007f,H\\\u0018+2muL:21'a-H1$\teE\u0015mn\u0001\u0010-\\c(\u0011~<t7\u0005\u0019t~\u0004\u007fxw4-d0BYQc\u001dV[(hB\u0002;\u0007-yF[0XUb\u0005\u0016$[,$$&QQ]A[#\r@J\b=G\\r\u0014U{*W~\u000b\t';\u00172.,3\u0007:y\u0003R_V'\"%b\t\"6|0}oU\u0013G\u0012XQ\u007f\u0007[\u0001\u001dqB^:\r\u0005M\"S\u001c &\u000bDECU!^\u0016\"I-gmk\u007f.(f=A%i\u0012;{\u0016\u001ef\u0002c8;Feq~l(j\u0001KNV\b\u0010\bp'd\u0011ATYd\u001fZ\u0001]\u0019N\u0016h\u001d+;\u000f\u0007_H\u001f\b}b2&N<Q\f4vCS2}Wup\u0006K\u000b\u000f\u00113R\u0017\nS\u0007\u0012J^PZee!04w`XO]z\u0005j*T8:? \u000bqX\u001a\f\u0016z\u000eVw\u000fE8ryAV\u001cY\u0011\\\u0005NK\u0005\u000e\u0019/M\u0019~UW>z;̍\u0013\u0012vX=fJ\u0001\u0002!90xt\u0017w5-TTgB8Z\u0011\u000b\f\u0002qoΜ:\u0004MQ4¨uʨ7\u008eԠ!D\u001eDG{Yk\u0005[v\u000b\u0004f~h\u0005\u0015~R|&q\u0017\t(&<8\u0011;\u001d]u\bb[P~}=C(\u0011/DW\rR!,T)6\u001e5[iyn\"*\u0014W\u0002?D,hb51\r!#{.h\u0010܁)^Fu$e\u001a\tATP\n4J\u0003\u0003\".6<\u007f\u0017A0+oim\b!nV;n\u0016B\u0012\r'0ʋpct}QӎlݫUҳӊ1R#95~ܛ\u0013]b=\u0017׀P\u0007\u0010א\u0018H"}, d2 = {"\u001anZ6bu\u001fW ~hr:\f\t7;", "", "u(E", "/o_2a+B\\\u001bl~g2", "\u001anZ6bu,W\"\u0005P", "4h[2", "\u001anZ6bu)O(\u0002P", ";tbA8?Ba(", "", "/s^:\\*&]*~", "", "And?V,", "B`a4X;", "1`]<a0<O \u0003\u0010^", ">`c5", "1n_F", "1qT.g,\u001dW&~xm6\n\r/s", "2ha", ";tbA69>O(~", "1qT.g,\u001dW&~xm6\n\u001d", "1qT.g,,g!\u0006~g2", "2d[2g,", "2d[2g,+S\u0017\u000f\bl0\u000e\t6y", "4h[2B9\u001dW&~xm6\n\u001d", "3wX@g:", ":hbA", "", ":hbAB9'c \u0006", ":hbAE,<c&\r~o,\u0004\u001d", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "4n[9b>,g!\u0006~g2\u000b", ";dc.W(MO", "\u001anZ6bu\u001fW ~b^;x\b+t{}", ";dc.W(MO\u0003\fcn3\u0004", "=oT;E,:R\u0003\b\u0002r", "\u001anZ6bu\u001fW ~]Z5{\u0010/;", "=oT;E,:R\u000b\f~m,", "@dP1", "\"", "@dP1X9\u001aQ(\u0003\u0005g", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "zqT.W", "uK^8\\6\b>\u0015\u000e}4\u0013\u0003\u0013>l\u00041EE\u0012\u001f`H\u007f\u0017:\u0006)?b\fi\u0018}\u001f,\\GEt\u007fsXOf5\u0018_uUr0I\u00168)aRpLi", "Ah]8", "\u001anZ6bu,])\fx^\u0002", "EqXAX", "EqXAX9\u001aQ(\u0003\u0005g", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "zva6g,", "uK^8\\6\b>\u0015\u000e}4!c\u000f9t\u0007,\u0005\n\u0006(\u001f\u0011p\u001eEt49c\u0007.\u0001N&7KR?u=ij,H>\u0003t(\u0018}#PN\u0018\u0016YWr;#g", "\u0011n\\=T5B]\"", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public abstract class FileSystem {
    public static final Companion Companion = new Companion(null);
    public static final FileSystem RESOURCES;
    public static final FileSystem SYSTEM;
    public static final Path SYSTEM_TEMPORARY_DIRECTORY;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nʑA0ZeP.XS0Ŧl\u0012éT[Rp\u0004@[\u001aԥ&\t]N0v|Pr\u000bq\u0011.\u0016'qrNǤ|]\u0018\u0017\u0003P}@KM\u001e?odKȊ\u0007ڶ6\"@цU\u000f(-`\u0010%|yOb۽2Ϯt:Z҈\u001e\u0013(\u0016\u001e>N\u0006T`>\u07b68Ղp]Bǂݳ\u0007r"}, d2 = {"\u001anZ6bu\u001fW ~hr:\f\t7$]2\u0004K| \u001bQxc", "", "u(E", " DB\u001cH\u0019\u001c3\u0007", "\u001anZ6bu\u001fW ~hr:\f\t7;", "!XB!8\u0014", "!XB!8\u00148BxfeH\u0019Xu#_^\fh ^\u0006\u00014c", "\u001anZ6bu)O(\u0002P", "/r>8\\6\u001fW ~hr:\f\t7", "\u001aiPCTuGW#H{b3|R\u0010i\u0007(iT\u000f&\u0017OE", "5dc", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final FileSystem get(java.nio.file.FileSystem fileSystem) {
            Intrinsics.checkNotNullParameter(fileSystem, "<this>");
            return new NioFileSystemWrappingFileSystem(fileSystem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX INFO: renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ Object m10807write$default(FileSystem fileSystem, Path file, boolean z2, Function1 writerAction, int i2, Object obj) throws IOException {
        ?? r1;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(writerAction, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(fileSystem.sink(file, z2));
        Object th = null;
        try {
            Object objInvoke = writerAction.invoke(bufferedSinkBuffer);
            InlineMarker.finallyStart(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            InlineMarker.finallyEnd(1);
            r1 = th;
            th = objInvoke;
        } catch (Throwable th3) {
            InlineMarker.finallyStart(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th4) {
                    ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            InlineMarker.finallyEnd(1);
            r1 = th3;
        }
        if (r1 == 0) {
            return th;
        }
        throw r1;
    }

    static {
        NioSystemFileSystem jvmSystemFileSystem;
        try {
            Class.forName("java.nio.file.Files");
            jvmSystemFileSystem = new NioSystemFileSystem();
        } catch (ClassNotFoundException unused) {
            jvmSystemFileSystem = new JvmSystemFileSystem();
        }
        SYSTEM = jvmSystemFileSystem;
        Path.Companion companion = Path.Companion;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        SYSTEM_TEMPORARY_DIRECTORY = Path.Companion.get$default(companion, property, false, 1, (Object) null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        RESOURCES = new ResourceFileSystem(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ Sink appendingSink$default(FileSystem fileSystem, Path path, boolean z2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        return fileSystem.appendingSink(path, z2);
    }

    public static /* synthetic */ void createDirectories$default(FileSystem fileSystem, Path path, boolean z2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        fileSystem.createDirectories(path, z2);
    }

    public static /* synthetic */ void createDirectory$default(FileSystem fileSystem, Path path, boolean z2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        fileSystem.createDirectory(path, z2);
    }

    public static /* synthetic */ void delete$default(FileSystem fileSystem, Path path, boolean z2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        fileSystem.delete(path, z2);
    }

    public static /* synthetic */ void deleteRecursively$default(FileSystem fileSystem, Path path, boolean z2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        fileSystem.deleteRecursively(path, z2);
    }

    @JvmStatic
    public static final FileSystem get(java.nio.file.FileSystem fileSystem) {
        return Companion.get(fileSystem);
    }

    public static /* synthetic */ Sequence listRecursively$default(FileSystem fileSystem, Path path, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        return fileSystem.listRecursively(path, z2);
    }

    public static /* synthetic */ FileHandle openReadWrite$default(FileSystem fileSystem, Path path, boolean z2, boolean z3, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        return fileSystem.openReadWrite(path, z2, z3);
    }

    public static /* synthetic */ Sink sink$default(FileSystem fileSystem, Path path, boolean z2, int i2, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = false;
        }
        return fileSystem.sink(path, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX INFO: renamed from: -read, reason: not valid java name */
    public final <T> T m10808read(Path file, Function1<? super BufferedSource, ? extends T> readerAction) throws IOException {
        ?? r1;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(readerAction, "readerAction");
        BufferedSource bufferedSourceBuffer = Okio.buffer(source(file));
        T th = null;
        try {
            T tInvoke = readerAction.invoke(bufferedSourceBuffer);
            InlineMarker.finallyStart(1);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            InlineMarker.finallyEnd(1);
            r1 = th;
            th = tInvoke;
        } catch (Throwable th3) {
            InlineMarker.finallyStart(1);
            if (bufferedSourceBuffer != null) {
                try {
                    bufferedSourceBuffer.close();
                } catch (Throwable th4) {
                    ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            InlineMarker.finallyEnd(1);
            r1 = th3;
        }
        if (r1 == 0) {
            return th;
        }
        throw r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX INFO: renamed from: -write, reason: not valid java name */
    public final <T> T m10809write(Path file, boolean z2, Function1<? super BufferedSink, ? extends T> writerAction) throws IOException {
        ?? r1;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(writerAction, "writerAction");
        BufferedSink bufferedSinkBuffer = Okio.buffer(sink(file, z2));
        T th = null;
        try {
            T tInvoke = writerAction.invoke(bufferedSinkBuffer);
            InlineMarker.finallyStart(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            InlineMarker.finallyEnd(1);
            r1 = th;
            th = tInvoke;
        } catch (Throwable th3) {
            InlineMarker.finallyStart(1);
            if (bufferedSinkBuffer != null) {
                try {
                    bufferedSinkBuffer.close();
                } catch (Throwable th4) {
                    ExceptionsKt.addSuppressed(th3, th4);
                }
            }
            InlineMarker.finallyEnd(1);
            r1 = th3;
        }
        if (r1 == 0) {
            return th;
        }
        throw r1;
    }

    public final Sink appendingSink(Path file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return appendingSink(file, false);
    }

    public abstract Sink appendingSink(Path path, boolean z2) throws IOException;

    public abstract void atomicMove(Path path, Path path2) throws IOException;

    public abstract Path canonicalize(Path path) throws IOException;

    public void copy(Path source, Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        okio.internal.FileSystem.commonCopy(this, source, target);
    }

    public final void createDirectories(Path dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        createDirectories(dir, false);
    }

    public final void createDirectories(Path dir, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        okio.internal.FileSystem.commonCreateDirectories(this, dir, z2);
    }

    public final void createDirectory(Path dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        createDirectory(dir, false);
    }

    public abstract void createDirectory(Path path, boolean z2) throws IOException;

    public abstract void createSymlink(Path path, Path path2) throws IOException;

    public final void delete(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        delete(path, false);
    }

    public abstract void delete(Path path, boolean z2) throws IOException;

    public final void deleteRecursively(Path fileOrDirectory) throws IOException {
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        deleteRecursively(fileOrDirectory, false);
    }

    public void deleteRecursively(Path fileOrDirectory, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(fileOrDirectory, "fileOrDirectory");
        okio.internal.FileSystem.commonDeleteRecursively(this, fileOrDirectory, z2);
    }

    public final boolean exists(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        return okio.internal.FileSystem.commonExists(this, path);
    }

    public abstract List<Path> list(Path path) throws IOException;

    public abstract List<Path> listOrNull(Path path);

    public final Sequence<Path> listRecursively(Path dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return listRecursively(dir, false);
    }

    public Sequence<Path> listRecursively(Path dir, boolean z2) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return okio.internal.FileSystem.commonListRecursively(this, dir, z2);
    }

    public final FileMetadata metadata(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        return okio.internal.FileSystem.commonMetadata(this, path);
    }

    public abstract FileMetadata metadataOrNull(Path path) throws IOException;

    public abstract FileHandle openReadOnly(Path path) throws IOException;

    public final FileHandle openReadWrite(Path file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return openReadWrite(file, false, false);
    }

    public abstract FileHandle openReadWrite(Path path, boolean z2, boolean z3) throws IOException;

    public final Sink sink(Path file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return sink(file, false);
    }

    public abstract Sink sink(Path path, boolean z2) throws IOException;

    public abstract Source source(Path path) throws IOException;
}
