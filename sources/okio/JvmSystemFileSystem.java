package okio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG9L͜P.`S2\u000fq\u0004<$iByCAV\"}8\tWȞog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4կ]xk\u001e\u00172HpEAcڎm9\u000fsv\bڶ6\"FyM\u0017(+`\u0010%|sO\u001a\u0015H@\u001f>\u0003\u0011[\n2\u00124Df\u0015fruUNH\u001bej31\f\u0002B|+\u00104\u000bW%F\u0003+S\u000b*,9KO5C)\u0004\u0007\u0015^s?1C8QM~54CI\"_f\\\u000e\"-+}\u0011\u000ev4k\u001dQ\u000f\u0012m?\u0018yY`&(&\u0003,\u0011J\r&\u0006UL^1(p \u000eax9g\tf\u0010oZ\u007f)if\u001b3\fK+g\u001f\u0017Uo@1Ne\u0002K!f7\u000f\u00019ad\u0010p\u0015IX&daUNK`N8]\u0004\u0002L\u000fp\u0014B\f@I\u0010/*\u0015D\u0016SJ\f=1/\u0004\u0002vH\u0018z\u0013t\u0001S\u0018X\u000f@j\u0005$LB\u0011\u001c\\Td3ofS\u0007?AQ*b\u001f}6\u0017fp@L/;(Peg\u0018\u0002}a\u00181Gfe]5\u007fVeGvK5\u007f|@e`y,?jfKl/`a&r\\V;bLx\u0013\u0010{rR<\u0017@N\n\u001cb2a\u001dj\u001a`\u0003LH\b\u0011Quh\u0004(~\u00035T\u0007w'\r\t/T\rt}v\u0011IZ\u0003'6uO_>1&\u0004>\u00198\u000b&\u001f~\"\u0004\u000e{\u0015MZ\n.u\u0004\u001af*bC_NU\u0013=\u0007Q201\fL;o_m*')\u0005\"\u000filtgŶn\u0012"}, d2 = {"\u001anZ6bu#d!l\u000fl;|\u0011\u0010i\u0007(iT\u000f&\u0017OE", "\u001anZ6bu\u001fW ~hr:\f\t7;", "u(E", "/o_2a+B\\\u001bl~g2", "\u001anZ6bu,W\"\u0005P", "4h[2", "\u001anZ6bu)O(\u0002P", ";tbA8?Ba(", "", "/s^:\\*&]*~", "", "And?V,", "B`a4X;", "1`]<a0<O \u0003\u0010^", ">`c5", "1qT.g,\u001dW&~xm6\n\u001d", "2ha", ";tbA69>O(~", "1qT.g,,g!\u0006~g2", "2d[2g,", ":hbA", "", "Bga<j\u0016G4\u0015\u0003\u0002n9|", ":hbAB9'c \u0006", ";dc.W(MO\u0003\fcn3\u0004", "\u001anZ6bu\u001fW ~b^;x\b+t{}", "=oT;E,:R\u0003\b\u0002r", "\u001anZ6bu\u001fW ~]Z5{\u0010/;", "=oT;E,:R\u000b\f~m,", "Ah]8", "\u001anZ6bu,])\fx^\u0002", "BnBAe0GU", "", "@d`B\\9>1&~vm,", "@d`B\\9>3,\u0003\tm", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class JvmSystemFileSystem extends FileSystem {
    private final List<Path> list(Path path, boolean z2) throws IOException {
        File file = path.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!z2) {
                return null;
            }
            if (file.exists()) {
                throw new IOException("failed to list " + path);
            }
            throw new FileNotFoundException("no such file: " + path);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            Intrinsics.checkNotNull(str);
            arrayList.add(path.resolve(str));
        }
        ArrayList arrayList2 = arrayList;
        CollectionsKt.sort(arrayList2);
        return arrayList2;
    }

    private final void requireCreate(Path path) throws IOException {
        if (exists(path)) {
            throw new IOException(path + " already exists.");
        }
    }

    private final void requireExist(Path path) throws IOException {
        if (!exists(path)) {
            throw new IOException(path + " doesn't exist.");
        }
    }

    @Override // okio.FileSystem
    public Sink appendingSink(Path file, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z2) {
            requireExist(file);
        }
        return Okio.sink(file.toFile(), true);
    }

    @Override // okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!source.toFile().renameTo(target.toFile())) {
            throw new IOException("failed to move " + source + " to " + target);
        }
    }

    @Override // okio.FileSystem
    public Path canonicalize(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        File canonicalFile = path.toFile().getCanonicalFile();
        if (!canonicalFile.exists()) {
            throw new FileNotFoundException("no such file");
        }
        Path.Companion companion = Path.Companion;
        Intrinsics.checkNotNull(canonicalFile);
        return Path.Companion.get$default(companion, canonicalFile, false, 1, (Object) null);
    }

    @Override // okio.FileSystem
    public void createDirectory(Path dir, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        FileMetadata fileMetadataMetadataOrNull = metadataOrNull(dir);
        if (fileMetadataMetadataOrNull == null || !fileMetadataMetadataOrNull.isDirectory()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (z2) {
            throw new IOException(dir + " already exists.");
        }
    }

    @Override // okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("unsupported");
    }

    @Override // okio.FileSystem
    public void delete(Path path, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (z2) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // okio.FileSystem
    public List<Path> list(Path dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<Path> list = list(dir, true);
        Intrinsics.checkNotNull(list);
        return list;
    }

    @Override // okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return list(dir, false);
    }

    @Override // okio.FileSystem
    public FileMetadata metadataOrNull(Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new FileMetadata(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return new JvmFileHandle(false, new RandomAccessFile(file.toFile(), "r"));
    }

    @Override // okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z2, boolean z3) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z2 && z3) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
        }
        if (z2) {
            requireCreate(file);
        }
        if (z3) {
            requireExist(file);
        }
        return new JvmFileHandle(true, new RandomAccessFile(file.toFile(), "rw"));
    }

    @Override // okio.FileSystem
    public Sink sink(Path file, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (z2) {
            requireCreate(file);
        }
        return Okio__JvmOkioKt.sink$default(file.toFile(), false, 1, null);
    }

    @Override // okio.FileSystem
    public Source source(Path file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return Okio.source(file.toFile());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
