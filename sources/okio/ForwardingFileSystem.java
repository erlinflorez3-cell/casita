package okio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
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
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u0016DLcz\u0006I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG9L͜P.`S2\u000fq\u0004<$iByCAU\"}8\tWNmgvJp\u000bK\u000f\f\u0016\u0001j:U]xc\u0013\u00172XoG3SoE9vt>\u0005&2(\\\u0010ڎ1\u001aXGP\u0002\u000bGY\f*0noĐV\r[\u0006b(\u0014A8\u0001L`\u0018RDM\u0005]h5S\u0007wIf'\u000e8CaU\\b0%v\u0010([DE@-%\u0002\t7ViK\u001b? CK|o59V\fWd^0\u0018#9g\r\fxlpMgn\u001b?+}m{T\u001c8\u0010z*\u0013l\b\u001c\u0017?H\\5`zP$A\u0007\u000bSnZ2bP\u000b\u0013ad\u001dU\u0004A7Q\u001b\u0015W(OadE\u000f\u001d\rL-1r/il\u000e\u000f\u001bKX\u0006XIQnE\u000fbRmK\u0002\u001cvr\u0004:\u0004^M.D,\u0015<'=7\n?i54\u0018VZ\u007f~\u0015bxS\u0018X^?P\u0004F;8\u0019$ZrjK\u007f\u0019pfC)S,V\u0017}6\u0019Nt(@/5(N}n\u001an[v\"%]n}m7{\u001cqQ`I4\u007f~@e`\u0005,?jhKl/`a(r\\V(bLx\u001e\u0010{rT<\u0017@\\\n\u001cbJa\u001dj4`\u0003L`\b\u0011Quh\t(~\u00039T\u0007w2\r\t/V\rt}\u0005\u0011IZ\u001b'6uO_V1&\u0004D\u00198\u000b(\u001f~\"\u0006\u000e{\u0015eZ\u0010.u\u0004\u001eP\u001a(>i/k\u0019?\u00037C\u001a-sT#i_T*')\u0005@#\u0004~<\f j\u001f0\u0011nXTl\u0017P|\u000fv1\u0019|\u007f(i\r\u000f\u0010qb\u0016s>w\u00183]JSP|3%d9Iu0#M-qEc*H%=\u0015y]\u0018nd~ˏ\u0013,|Ё\u001c.i\u0016}dмaY"}, d2 = {"\u001anZ6bu\u001f]&\u0011vk+\u0001\u00121F\u0004/{.\u0015%&Gwc", "\u001anZ6bu\u001fW ~hr:\f\t7;", "2d[2Z(MS", "uK^8\\6\b4\u001d\u0006zL@\u000b\u0018/mUkl", "u(;<^0H\u001dy\u0003\u0002^\u001a\u0011\u0017>e\b}", "/o_2a+B\\\u001bl~g2", "\u001anZ6bu,W\"\u0005P", "4h[2", "\u001anZ6bu)O(\u0002P", ";tbA8?Ba(", "", "/s^:\\*&]*~", "", "And?V,", "B`a4X;", "1`]<a0<O \u0003\u0010^", ">`c5", "1qT.g,\u001dW&~xm6\n\u001d", "2ha", ";tbA69>O(~", "1qT.g,,g!\u0006~g2", "2d[2g,", ":hbA", "", ":hbAB9'c \u0006", ":hbAE,<c&\r~o,\u0004\u001d", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "4n[9b>,g!\u0006~g2\u000b", ";dc.W(MO\u0003\fcn3\u0004", "\u001anZ6bu\u001fW ~b^;x\b+t{}", "=m?.g/)O&z\u0003^;|\u0016", "4t]0g0H\\\u0002z\u0003^", "", ">`a.`,MS&gvf,", "=m?.g/+S'\u000f\u0002m", "=oT;E,:R\u0003\b\u0002r", "\u001anZ6bu\u001fW ~]Z5{\u0010/;", "=oT;E,:R\u000b\f~m,", "Ah]8", "\u001anZ6bu,])\fx^\u0002", "BnBAe0GU", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public abstract class ForwardingFileSystem extends FileSystem {
    private final FileSystem delegate;

    public ForwardingFileSystem(FileSystem delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // okio.FileSystem
    public Sink appendingSink(Path file, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.appendingSink(onPathParameter(file, "appendingSink", "file"), z2);
    }

    @Override // okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        this.delegate.atomicMove(onPathParameter(source, "atomicMove", "source"), onPathParameter(target, "atomicMove", "target"));
    }

    @Override // okio.FileSystem
    public Path canonicalize(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        return onPathResult(this.delegate.canonicalize(onPathParameter(path, "canonicalize", "path")), "canonicalize");
    }

    @Override // okio.FileSystem
    public void createDirectory(Path dir, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        this.delegate.createDirectory(onPathParameter(dir, "createDirectory", "dir"), z2);
    }

    @Override // okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        this.delegate.createSymlink(onPathParameter(source, "createSymlink", "source"), onPathParameter(target, "createSymlink", "target"));
    }

    public final FileSystem delegate() {
        return this.delegate;
    }

    @Override // okio.FileSystem
    public void delete(Path path, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        this.delegate.delete(onPathParameter(path, "delete", "path"), z2);
    }

    @Override // okio.FileSystem
    public List<Path> list(Path dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<Path> list = this.delegate.list(onPathParameter(dir, "list", "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "list"));
        }
        ArrayList arrayList2 = arrayList;
        CollectionsKt.sort(arrayList2);
        return arrayList2;
    }

    @Override // okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<Path> listListOrNull = this.delegate.listOrNull(onPathParameter(dir, "listOrNull", "dir"));
        if (listListOrNull == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listListOrNull.iterator();
        while (it.hasNext()) {
            arrayList.add(onPathResult((Path) it.next(), "listOrNull"));
        }
        ArrayList arrayList2 = arrayList;
        CollectionsKt.sort(arrayList2);
        return arrayList2;
    }

    @Override // okio.FileSystem
    public Sequence<Path> listRecursively(Path dir, boolean z2) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return SequencesKt.map(this.delegate.listRecursively(onPathParameter(dir, "listRecursively", "dir"), z2), new Function1<Path, Path>() { // from class: okio.ForwardingFileSystem.listRecursively.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Path invoke(Path it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ForwardingFileSystem.this.onPathResult(it, "listRecursively");
            }
        });
    }

    @Override // okio.FileSystem
    public FileMetadata metadataOrNull(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        FileMetadata fileMetadataMetadataOrNull = this.delegate.metadataOrNull(onPathParameter(path, "metadataOrNull", "path"));
        if (fileMetadataMetadataOrNull == null) {
            return null;
        }
        return fileMetadataMetadataOrNull.getSymlinkTarget() == null ? fileMetadataMetadataOrNull : FileMetadata.copy$default(fileMetadataMetadataOrNull, false, false, onPathResult(fileMetadataMetadataOrNull.getSymlinkTarget(), "metadataOrNull"), null, null, null, null, null, 251, null);
    }

    public Path onPathParameter(Path path, String functionName, String parameterName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
        return path;
    }

    public Path onPathResult(Path path, String functionName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        return path;
    }

    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.openReadOnly(onPathParameter(file, "openReadOnly", "file"));
    }

    @Override // okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z2, boolean z3) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.openReadWrite(onPathParameter(file, "openReadWrite", "file"), z2, z3);
    }

    @Override // okio.FileSystem
    public Sink sink(Path file, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.sink(onPathParameter(file, "sink", "file"), z2);
    }

    @Override // okio.FileSystem
    public Source source(Path file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.delegate.source(onPathParameter(file, "source", "file"));
    }

    public String toString() {
        return Reflection.getOrCreateKotlinClass(getClass()).getSimpleName() + '(' + this.delegate + ')';
    }
}
