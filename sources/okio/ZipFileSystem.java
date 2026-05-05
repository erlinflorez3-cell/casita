package okio;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;
import okio.internal.FixedLengthSource;
import okio.internal.ZipEntry;
import okio.internal.ZipFilesKt;
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
@Metadata(bv = {}, d1 = {"ЯZ\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":4\u007f\u0007|jAӄLeV:ZS0\u000fs{J$c$wCCU(\u0007*ޛWNugvJ`\u0014K\u000f\u00144\u0001j2J]xs\u0012\u0017˰JoU3UoC9htL\u0005(2(8\u007fڎ\u0017ɝHm@v)B\u0004\u000b7psvíb\u0011[\u00052\u00124?0\u0005,^\u007fNdG|mH2;\u000fyD^'\u000e1\rO\u001dF\u0003,;zq$9FO7+$\u0002\n\u07baV[M\u000b\b\bK\u000e\u0001'U5yweAp\u007fB\u0016[S\u001bi\u000b&\u000b\u0012\u0018tT=9]{K~\u001dX{\t\f%<2\u000f6+V?E\u001a\u0015\tTG=\u0001aRh\u0002\rC0~oI/%.4qMct_uS\u0019|8,\t\u001b1;\u0001\u001d\"\"TVv#0lw\u007f@\u0002DK^f\n\b>\u001e\b~y\u001a*2=\u000e\u0014w\u0012\u001fF/%eji'/{\u001aHrh'\tnyki\u0001I\u000767,EC!\f\tS\u0015\tyclXZ\u0012} b\u0013\u0016\bA-#\f\u000553*fUxkzM\f\u000bSJ\u0017;g\u0005\u0004\u000e\u0006:%G}oq*yZ\u0007\u0016O<\u0011\u0006nepn<^j>:2vk@{\n`f\fA?\u0006qdJ:N1d%J\u0013\u001epB\u0013\b\u000eu\u0019\u0014\rjK$1jj\tQ\u0011^z\tq}wwK-d0@YQc\u001alijvB\u001d;\u0007-\u00150KuW_L\u001b\u0017<iD>$<QQ]^C\u0013\r4J\u0002[F|vshe\u0012U\b-}\u001dG\u0001.\u0016\u00151\u0005tvxmgTE,'b\u0001. d.z\u0012J\t^{T9h\u0005];\u0011gLf8+)O\"3\f\b\"+6sWw+$},1+`\fpFІ{ˏ\u0013&|ЁTDq\u0019\bna_B;fJi\u0001N\"Rq1F\u001f۶yڇF\t<ؿ\u0004TOf\tVfLaɃ\u007f֨\u000b,\u0015ߞ'gH\u0013\b}b/6͋uʸ\u0002\u0014fƹ҂\u0015s"}, d2 = {"\u001anZ6bu3W$_~e,j\u001d=t\u007f0Q", "\u001anZ6bu\u001fW ~hr:\f\t7;", "Hh_\u001dT;A", "\u001anZ6bu)O(\u0002P", "4h[2F@Lb\u0019\u0007", "3mc?\\,L", "", "\u001anZ6buB\\(~\bg(\u0004R$i\u000b\b\u0005O\u000e+l", "1n\\:X5M", "", "uK^8\\6\b>\u0015\u000e}4\u0013\u0007\u000f3oI\t\u007fG\u0001\u0005+U~\u000eDL\f:U\u000f\u001c\u0001}%2T\r#g?s{m]J\u0003-3J\u007f)\u0011:]9`[t\u0013W\u0003", "/o_2a+B\\\u001bl~g2", "\u001anZ6bu,W\"\u0005P", "4h[2", ";tbA8?Ba(", "", "/s^:\\*&]*~", "", "And?V,", "B`a4X;", "1`]<a0<O \u0003\u0010^", ">`c5", "1`]<a0<O \u0003\u0010^\u0010\u0006\u0018/r\t$\u0003", "1qT.g,\u001dW&~xm6\n\u001d", "2ha", ";tbA69>O(~", "1qT.g,,g!\u0006~g2", "2d[2g,", ":hbA", "", "Bga<j\u0016G4\u0015\u0003\u0002n9|", ":hbAB9'c \u0006", ";dc.W(MO\u0003\fcn3\u0004", "\u001anZ6bu\u001fW ~b^;x\b+t{}", "=oT;E,:R\u0003\b\u0002r", "\u001anZ6bu\u001fW ~]Z5{\u0010/;", "=oT;E,:R\u000b\f~m,", "Ah]8", "\u001anZ6bu,])\fx^\u0002", "\u0011n\\=T5B]\"", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ZipFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, RemoteSettings.FORWARD_SLASH_STRING, false, 1, (Object) null);
    private final String comment;
    private final Map<Path, ZipEntry> entries;
    private final FileSystem fileSystem;
    private final Path zipPath;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߝx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00053i%\nCiW۟\u0002(\u0011ѧfimqX^ŸG\u0014"}, d2 = {"\u001anZ6bu3W$_~e,j\u001d=t\u007f0:\u001e\u000b\u001f\"Cx\u0012F\u007fz", "", "u(E", " N>!", "\u001anZ6bu)O(\u0002P", "5dc\u001fB\u0016-", "u(;<^0H\u001d\u0004z\na\u0002", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Path getROOT() {
            return ZipFileSystem.ROOT;
        }
    }

    public ZipFileSystem(Path zipPath, FileSystem fileSystem, Map<Path, ZipEntry> entries, String str) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.zipPath = zipPath;
        this.fileSystem = fileSystem;
        this.entries = entries;
        this.comment = str;
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    private final List<Path> list(Path path, boolean z2) throws IOException {
        ZipEntry zipEntry = this.entries.get(canonicalizeInternal(path));
        if (zipEntry != null) {
            return CollectionsKt.toList(zipEntry.getChildren());
        }
        if (z2) {
            throw new IOException("not a directory: " + path);
        }
        return null;
    }

    @Override // okio.FileSystem
    public Sink appendingSink(Path file, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public Path canonicalize(Path path) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(path, "path");
        Path pathCanonicalizeInternal = canonicalizeInternal(path);
        if (this.entries.containsKey(pathCanonicalizeInternal)) {
            return pathCanonicalizeInternal;
        }
        throw new FileNotFoundException(String.valueOf(path));
    }

    @Override // okio.FileSystem
    public void createDirectory(Path dir, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.FileSystem
    public void delete(Path path, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[Catch: all -> 0x0065, TRY_ENTER, TryCatch #2 {all -> 0x0065, blocks: (B:8:0x0029, B:22:0x0059, B:23:0x005a, B:17:0x0050, B:9:0x003a, B:15:0x004b), top: B:46:0x0029, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a A[Catch: all -> 0x0065, TryCatch #2 {all -> 0x0065, blocks: (B:8:0x0029, B:22:0x0059, B:23:0x005a, B:17:0x0050, B:9:0x003a, B:15:0x004b), top: B:46:0x0029, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    @Override // okio.FileSystem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public okio.FileMetadata metadataOrNull(okio.Path r15) throws java.lang.Throwable {
        /*
            r14 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            okio.Path r1 = r14.canonicalizeInternal(r15)
            java.util.Map<okio.Path, okio.internal.ZipEntry> r0 = r14.entries
            java.lang.Object r2 = r0.get(r1)
            okio.internal.ZipEntry r2 = (okio.internal.ZipEntry) r2
            r7 = 0
            if (r2 != 0) goto L15
            return r7
        L15:
            long r5 = r2.getOffset()
            r3 = -1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L79
            okio.FileSystem r1 = r14.fileSystem
            okio.Path r0 = r14.zipPath
            okio.FileHandle r4 = r1.openReadOnly(r0)
            java.io.Closeable r4 = (java.io.Closeable) r4
            r3 = r4
            okio.FileHandle r3 = (okio.FileHandle) r3     // Catch: java.lang.Throwable -> L65
            long r0 = r2.getOffset()     // Catch: java.lang.Throwable -> L65
            okio.Source r0 = r3.source(r0)     // Catch: java.lang.Throwable -> L65
            okio.BufferedSource r3 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> L65
            java.io.Closeable r3 = (java.io.Closeable) r3     // Catch: java.lang.Throwable -> L65
            r0 = r3
            okio.BufferedSource r0 = (okio.BufferedSource) r0     // Catch: java.lang.Throwable -> L48
            okio.internal.ZipEntry r2 = okio.internal.ZipFilesKt.readLocalHeader(r0, r2)     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L46
            r3.close()     // Catch: java.lang.Throwable -> L55
        L46:
            r1 = r7
            goto L56
        L48:
            r1 = move-exception
            if (r3 == 0) goto L53
            r3.close()     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r0 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r1, r0)     // Catch: java.lang.Throwable -> L65
        L53:
            r2 = r7
            goto L56
        L55:
            r1 = move-exception
        L56:
            if (r1 != 0) goto L59
            goto L5a
        L59:
            throw r1     // Catch: java.lang.Throwable -> L65
        L5a:
            java.lang.Object r2 = (java.lang.Object) r2     // Catch: java.lang.Throwable -> L65
            okio.internal.ZipEntry r2 = (okio.internal.ZipEntry) r2     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L63
            r4.close()     // Catch: java.lang.Throwable -> L72
        L63:
            r1 = r7
            goto L73
        L65:
            r1 = move-exception
            if (r4 == 0) goto L70
            r4.close()     // Catch: java.lang.Throwable -> L6c
            goto L70
        L6c:
            r0 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r1, r0)
        L70:
            r2 = r7
            goto L73
        L72:
            r1 = move-exception
        L73:
            if (r1 != 0) goto La9
            java.lang.Object r2 = (java.lang.Object) r2
            okio.internal.ZipEntry r2 = (okio.internal.ZipEntry) r2
        L79:
            okio.FileMetadata r3 = new okio.FileMetadata
            boolean r0 = r2.isDirectory()
            r4 = r0 ^ 1
            boolean r5 = r2.isDirectory()
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto La0
        L8b:
            java.lang.Long r8 = r2.getCreatedAtMillis$okio()
            java.lang.Long r9 = r2.getLastModifiedAtMillis$okio()
            java.lang.Long r10 = r2.getLastAccessedAtMillis$okio()
            r12 = 128(0x80, float:1.8E-43)
            r13 = 0
            r6 = 0
            r11 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
        La0:
            long r0 = r2.getSize()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            goto L8b
        La9:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ZipFileSystem.metadataOrNull(okio.Path):okio.FileMetadata");
    }

    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z2, boolean z3) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // okio.FileSystem
    public Sink sink(Path file, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // okio.FileSystem
    public Source source(Path file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        ZipEntry zipEntry = this.entries.get(canonicalizeInternal(file));
        if (zipEntry == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        FileHandle fileHandleOpenReadOnly = this.fileSystem.openReadOnly(this.zipPath);
        BufferedSource th = null;
        try {
            BufferedSource bufferedSourceBuffer = Okio.buffer(fileHandleOpenReadOnly.source(zipEntry.getOffset()));
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = th;
            th = bufferedSourceBuffer;
        } catch (Throwable th3) {
            th = th3;
            if (fileHandleOpenReadOnly != null) {
                try {
                    fileHandleOpenReadOnly.close();
                } catch (Throwable th4) {
                    ExceptionsKt.addSuppressed(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        BufferedSource bufferedSource = th;
        ZipFilesKt.skipLocalHeader(bufferedSource);
        return zipEntry.getCompressionMethod() == 0 ? new FixedLengthSource(bufferedSource, zipEntry.getSize(), true) : new FixedLengthSource(new InflaterSource(new FixedLengthSource(bufferedSource, zipEntry.getCompressedSize(), true), new Inflater(true)), zipEntry.getSize(), false);
    }
}
