package okio.internal;

import com.dynatrace.android.callback.Callback;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.FileHandle;
import okio.FileMetadata;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.Sink;
import okio.Source;
import org.springframework.util.ClassUtils;
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
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r+4\u0012}\bnjGNLe^.ZS@\u000fs{:'c$\bCCU ~*\t]NogtUb\u000bY\u000f\u000eǝ\u0001jBI]xc\u0012\u00172XoG3SoE9vt>\u0005&2*8\b\u0011\t\u001a0H\u0016͌\u0011ŏi9B0norQ:\u000e$ Ň\u0016B.\u00016\\\u0016OFLz_R/Q\u0006yHT'm4\u0015M;Eù+\r\u0005ffANEM\u0015Sb3\u000b`kW\u0003mzm\tv8?+wv\u001eJ!\u0016\"'CO;p#*j\u0019i`:0[Sq`h\u000eV\u0001A\u0010UJ\u0012$\u001e'v7]\u001et\u001f&3#{\u001aT\u0019\u0010lZ\u0018z\u0010?G)\u000eJC9Io\u0018a\u0004/\\P\u0014\u0005;1S\u0005|;sT<iE\u001fb\u0013i1\u007fC\u0004\\\u0017 gY\u0006\u0004\u001fu2.\u0012D_\u007f]\u0005A2%:O[g,g\u007fJ^R\u0005\u000f\u0005\u000f{\u0004m`_X\"\u001d\u001fg.\u0017\u001drD\u0013\b2d\u001dl:/e\"d\t\u000e\bA)\u000b~l%3*fO\u0017r1a& 3N~?ip{\u000e\u0006Bt2cX\u0014\u0014ol\u000f\u0014mE)\u0019!vPs$\\r'PSxn\u001e\u000f\u0014D|\u0015YF\b\u007f*VD1G\u007fEL\u0011.ZA+\u0012&n1.\rxK$1\rTx\u0017\u0011h\\\u001fx\u0018|WG\u0015`P0qUC*>UPkz\u0011k\u001d\r\u0019\u0018G\u0016[wPz&\u000eU*)F\u001eGlG=A\u0012E=z\u0010;Ydr\u0014w}\u00165\u000b\u0015y=D/B0$x\u0018DrzX_`'$\u0007^!\"\u0018f\u0010y\u0010O)O\u0012[3[lJ9\u0003\"T\\`\u0015\u0013/ 5\u0001\u001e!\r7=CU&,vB7=a\f\u00136.Bz\u001dP\rs\u0014.s\u0016\u001eaa_B;fRo}l*Ll1k\u000fj@\u0012P4L\ratid\u001f_~M[;\ff\u001f,;q-ܭ<݇s}<ʝ0U\u0002I\u0016&nQ5\u001d]Uwm\u001cJl\rZ\u000f8\u0014*9\u001d\u0019R}v\u074b̵bס4\u0010{\u001a<MIo\u001d>\u000f.B7\r\u0014\u0019Gli4\u000fQėHݍ\u0013\u0017:߿Ǧ?\u0005"}, d2 = {"\u001anZ6buB\\(~\bg(\u0004R\u001ce\u000e2\fM~\u0017wKv\u000e*\u000b3DY\u0006u", "\u001anZ6bu\u001fW ~hr:\f\t7;", "1kP@f\u0013HO\u0018~\b", "\u001aiPCTuEO\"\u0001D<3x\u0017=L\n$z@\u000el", "7mS2k\f:U\u0019\f\u0002r", "", "AxbAX4\u001fW ~hr:\f\t7", "uKY.i(\bZ\u0015\b|(\n\u0004\u0005=sf2w?\u0001$l<V\u0018Bz/~:\u0002'7[*<\\CCAw\u000f", "@n^Af", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001anZ6bu)O(\u0002P", "5dc\u001fb6Ma", "u(;7T=:\u001d)\u000e~euc\r=tU", "@n^Afj=S ~|Z;|", "\u001aj^A_0G\u001d\u007fz\u0010r\u0002", "/o_2a+B\\\u001bl~g2", "\u001anZ6bu,W\"\u0005P", "4h[2", ";tbA8?Ba(", "/s^:\\*&]*~", "", "And?V,", "B`a4X;", "1`]<a0<O \u0003\u0010^", ">`c5", "1`]<a0<O \u0003\u0010^\u0010\u0006\u0018/r\t$\u0003", "1qT.g,\u001dW&~xm6\n\u001d", "2ha", ";tbA69>O(~", "1qT.g,,g!\u0006~g2", "2d[2g,", ":hbA", ":hbAB9'c \u0006", ";dc.W(MO\u0003\fcn3\u0004", "\u001anZ6bu\u001fW ~b^;x\b+t{}", "=oT;E,:R\u0003\b\u0002r", "\u001anZ6bu\u001fW ~]Z5{\u0010/;", "=oT;E,:R\u000b\f~m,", "Ah]8", "\u001anZ6bu,])\fx^\u0002", "Bn29T:L^\u0015\u000e}K6\u0007\u0018=", "Bn56_,+]#\u000e", "\u001aiPCTuGS(HjK\u0013R", "Bn9.e\u0019H](", "BnA2_(MW*~eZ;\u007f", "", "\u0011n\\=T5B]\"", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ResourceFileSystem extends FileSystem {
    private static final Companion Companion = new Companion(null);
    private static final Path ROOT = Path.Companion.get$default(Path.Companion, RemoteSettings.FORWARD_SLASH_STRING, false, 1, (Object) null);
    private final ClassLoader classLoader;
    private final Lazy roots$delegate;
    private final FileSystem systemFileSystem;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0010nj?2J͟IDɟ\u0004*=j<9*[ҸuCIUb\f0\u000egN\u0016m\u001fNh\u0012[\u000f4\u0018?jtYc\u0001u\u0012=4jom5}sKBxtd\u0007pA09\u0012\u0005/\u001cݵL\u0016~ٙ[M\u0012\u0015>Dª>\\"}, d2 = {"\u001anZ6buB\\(~\bg(\u0004R\u001ce\u000e2\fM~\u0017wKv\u000e*\u000b3DY\u0006^\u0015w\u001e9IL?u=s", "", "u(E", " N>!", "\u001anZ6bu)O(\u0002P", "5dc\u001fB\u0016-", "u(;<^0H\u001d\u0004z\na\u0002", "9dT=C(MV", "", ">`c5", "@d\\<i,\u001bO'~", "0`b2", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean keepPath(Path path) {
            return !StringsKt.endsWith(path.name(), ClassUtils.CLASS_FILE_SUFFIX, true);
        }

        public final Path getROOT() {
            return ResourceFileSystem.ROOT;
        }

        public final Path removeBase(Path path, Path base) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            Intrinsics.checkNotNullParameter(base, "base");
            return getROOT().resolve(StringsKt.replace$default(StringsKt.removePrefix(path.toString(), (CharSequence) base.toString()), '\\', '/', false, 4, (Object) null));
        }
    }

    public ResourceFileSystem(ClassLoader classLoader, boolean z2, FileSystem systemFileSystem) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        Intrinsics.checkNotNullParameter(systemFileSystem, "systemFileSystem");
        this.classLoader = classLoader;
        this.systemFileSystem = systemFileSystem;
        this.roots$delegate = LazyKt.lazy(new Function0<List<? extends Pair<? extends FileSystem, ? extends Path>>>() { // from class: okio.internal.ResourceFileSystem$roots$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Pair<? extends FileSystem, ? extends Path>> invoke() {
                ResourceFileSystem resourceFileSystem = this.this$0;
                return resourceFileSystem.toClasspathRoots(resourceFileSystem.classLoader);
            }
        });
        if (z2) {
            getRoots().size();
        }
    }

    public /* synthetic */ ResourceFileSystem(ClassLoader classLoader, boolean z2, FileSystem fileSystem, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z2, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? FileSystem.SYSTEM : fileSystem);
    }

    private final Path canonicalizeInternal(Path path) {
        return ROOT.resolve(path, true);
    }

    private final List<Pair<FileSystem, Path>> getRoots() {
        return (List) this.roots$delegate.getValue();
    }

    public final List<Pair<FileSystem, Path>> toClasspathRoots(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        Intrinsics.checkNotNullExpressionValue(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            Intrinsics.checkNotNull(url);
            Pair<FileSystem, Path> fileRoot = toFileRoot(url);
            if (fileRoot != null) {
                arrayList.add(fileRoot);
            }
        }
        ArrayList arrayList2 = arrayList;
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        Intrinsics.checkNotNullExpressionValue(list2, "list(...)");
        ArrayList arrayList3 = new ArrayList();
        for (URL url2 : list2) {
            Intrinsics.checkNotNull(url2);
            Pair<FileSystem, Path> jarRoot = toJarRoot(url2);
            if (jarRoot != null) {
                arrayList3.add(jarRoot);
            }
        }
        return CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList3);
    }

    private final Pair<FileSystem, Path> toFileRoot(URL url) {
        if (Intrinsics.areEqual(url.getProtocol(), "file")) {
            return TuplesKt.to(this.systemFileSystem, Path.Companion.get$default(Path.Companion, new File(url.toURI()), false, 1, (Object) null));
        }
        return null;
    }

    private final Pair<FileSystem, Path> toJarRoot(URL url) {
        int iLastIndexOf$default;
        String string = url.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (!StringsKt.startsWith$default(string, "jar:file:", false, 2, (Object) null) || (iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) string, "!", 0, false, 6, (Object) null)) == -1) {
            return null;
        }
        Path.Companion companion = Path.Companion;
        String strSubstring = string.substring(4, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return TuplesKt.to(ZipFilesKt.openZip(Path.Companion.get$default(companion, new File(URI.create(strSubstring)), false, 1, (Object) null), this.systemFileSystem, new Function1<ZipEntry, Boolean>() { // from class: okio.internal.ResourceFileSystem$toJarRoot$zip$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(ZipEntry entry) {
                Intrinsics.checkNotNullParameter(entry, "entry");
                return Boolean.valueOf(ResourceFileSystem.Companion.keepPath(entry.getCanonicalPath()));
            }
        }), ROOT);
    }

    private final String toRelativePath(Path path) {
        return canonicalizeInternal(path).relativeTo(ROOT).toString();
    }

    @Override // okio.FileSystem
    public Sink appendingSink(Path file, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void atomicMove(Path source, Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public Path canonicalize(Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return canonicalizeInternal(path);
    }

    @Override // okio.FileSystem
    public void createDirectory(Path dir, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void createSymlink(Path source, Path target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public void delete(Path path, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public List<Path> list(Path dir) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z2 = false;
        for (Pair<FileSystem, Path> pair : getRoots()) {
            FileSystem fileSystemComponent1 = pair.component1();
            Path pathComponent2 = pair.component2();
            try {
                LinkedHashSet linkedHashSet2 = linkedHashSet;
                List<Path> list = fileSystemComponent1.list(pathComponent2.resolve(relativePath));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Companion.removeBase((Path) it.next(), pathComponent2));
                }
                CollectionsKt.addAll(linkedHashSet2, arrayList3);
                z2 = true;
            } catch (IOException unused) {
            }
        }
        if (z2) {
            return CollectionsKt.toList(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // okio.FileSystem
    public List<Path> listOrNull(Path dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        String relativePath = toRelativePath(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Pair<FileSystem, Path>> it = getRoots().iterator();
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair<FileSystem, Path> next = it.next();
            FileSystem fileSystemComponent1 = next.component1();
            Path pathComponent2 = next.component2();
            List<Path> listListOrNull = fileSystemComponent1.listOrNull(pathComponent2.resolve(relativePath));
            if (listListOrNull != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listListOrNull) {
                    if (Companion.keepPath((Path) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Companion.removeBase((Path) it2.next(), pathComponent2));
                }
                arrayList = arrayList4;
            }
            if (arrayList != null) {
                CollectionsKt.addAll(linkedHashSet, arrayList);
                z2 = true;
            }
        }
        if (z2) {
            return CollectionsKt.toList(linkedHashSet);
        }
        return null;
    }

    @Override // okio.FileSystem
    public FileMetadata metadataOrNull(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!Companion.keepPath(path)) {
            return null;
        }
        String relativePath = toRelativePath(path);
        for (Pair<FileSystem, Path> pair : getRoots()) {
            FileMetadata fileMetadataMetadataOrNull = pair.component1().metadataOrNull(pair.component2().resolve(relativePath));
            if (fileMetadataMetadataOrNull != null) {
                return fileMetadataMetadataOrNull;
            }
        }
        return null;
    }

    @Override // okio.FileSystem
    public FileHandle openReadOnly(Path file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!Companion.keepPath(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String relativePath = toRelativePath(file);
        for (Pair<FileSystem, Path> pair : getRoots()) {
            try {
                return pair.component1().openReadOnly(pair.component2().resolve(relativePath));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // okio.FileSystem
    public FileHandle openReadWrite(Path file, boolean z2, boolean z3) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // okio.FileSystem
    public Sink sink(Path file, boolean z2) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.FileSystem
    public Source source(Path file) throws Exception {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!Companion.keepPath(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        Path path = ROOT;
        URL resource = this.classLoader.getResource(Path.resolve$default(path, file, false, 2, (Object) null).relativeTo(path).toString());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = Callback.getInputStream(uRLConnectionOpenConnection);
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return Okio.source(inputStream);
    }
}
