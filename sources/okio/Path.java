package okio;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u000eQLш|\u0004W\u00068\u000b4D\u0007\":\u001b\u007f\u0007llA0RqP.XX2\u000fy\u001a<$a'yCI_\"}(\tWNumvJ`\u000eK\u000f\u0014ǝ\u0001j2L]xs\u0012\u0017˰JoU3UoC:vҚT1P82:\n\u0005/ɝXGHu'\u0004X\u0012۵@D~:j\r{\u0006ܨ\u0016\u0006L\"I-j\u0003f6v\t\u000e>=@\u001bip÷mۖ0Ea\u001bdl';Ǹ\u0012\"9_O5C0\u001aΐ\u0007қ_?\t_:Q\u0013\u0007?'Yɞ$[Dw\u0018\u0014C,\u0016՝]ę*\\\u000bq) 5Igcyִ>,\u0006\u001a\u0014\rjǉT\u0382'ρ2- \u0007P\u001fA\u0016\u000bSnV2dP\u001d\u0013cL\u0016S\"yږ9cl_\u0005S\u0019|SB\u0019U\"1%\u0007!\n٪Vl#@lw\u007fĸ\u0002DKef\n\bƝ6\u001a~\u0003\u001a*2\u0382w\u0004=\u001b).E0ga?#/\u0012\u001aHrm?\u001bn\tki\u0001̲p&|5O*7\r\u000bJj\u0005yvlXZ\u0017\u00162b'\u0016\bA\u05fe\r{J@=\u0010|и\u0019opMk0=/\u0015=\"ry5o9\r[}Uq9yR%>\bBp0pfp^Rn-:02`j>xRͪPܟ\u00178Gڤ4624'`eW\u0011#ZA+\u000f\u0016\u001fӳ\u0014\u0003l5*\bw+E\u0018\u000fXtp\u001em/\u000eض\u0001d:/GYC vd0qL|Q\r58õKkdIRu$|&\u000b. 29\u007f:sXä\u0003-J\u00043OZ~6`[\u001f?z+zE\u0001ÿ2k lv9nn\u001b`b%:xtqQΨ\u001bE\u05fbeJ\u0013Iib\u0019j\u000fZ\u0001\u0013q>d7+þUbݵ\u0005s:~;>Q6m+\u0006&G\u001bq_yo\\\u0005\u0011\"\\9Ф\b0{\u0018uv_r\u0003PF_q\u0005N$4l1Cv}.Lɚ\r8%5NXr\u0006'I[#G\u007f|\u0006Z&'\u001cݍ>\u0017\b\u007f:FmDϻG+"}, d2 = {"\u001anZ6bu)O(\u0002P", "", "0xc2f", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "uK^8\\6\b0-\u000ezL;\n\r8gUkl", "5dc\u000fl;>aW\t\u0001b6", "u(;<^0H\u001du\u0013\n^\u001a\f\u00163n\u0002}", "7r0/f6Ec(~", "", "u(I", "7rA2_(MW*~", "7rA<b;", "<`\\2", "", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "<`\\25@MS'", ">`a2a;", "u(;<^0H\u001d\u0004z\na\u0002", "@n^A", "5dc\u001fb6M", "AdV:X5Ma", "", "5dc X.FS\"\u000e\t", "u(;7T=:\u001d)\u000e~euc\r=tU", "AdV:X5Mau\u0013\n^:", "5dc X.FS\"\u000e\t;@\f\t=", "Dn[B`,%S(\u000ezk", "", "u(;7T=:\u001d z\u0004`uZ\f+r{&\u000b@\u000el", "1n\\=T9>B#", "", "=sW2e", "2he", "1gX9W", "@db<_=>", "3pd._:", "", "6`b566=S", "<na:T3Bh\u0019}", "@d[.g0OS\b\t", "<na:T3Bh\u0019", "Bn56_,", "\u001aiPCTuB]b_~e,R", "Bn=6b\u0017:b\u001c", "\u001aiPCTuGW#H{b3|R\u001aa\u000f+Q", "BnBAe0GU", "\u0011n\\=T5B]\"", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class Path implements Comparable<Path> {
    public static final Companion Companion = new Companion(null);
    public static final String DIRECTORY_SEPARATOR;
    private final ByteString bytes;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\"B\u0012\u007f\u0007|jAӄLeV7Zݷ2\u000f\u0002{<$a$w٘<kڼ.\"7N\u000flmnН^\u000bQ\u000fN/\u0007mDI\u0004|\u0006\u0012=7ruE3[uU9\u000f{|\nڶ6\">\u0002M\u001a(-`\u0010%~kK:\u001b`Fv:`\u0013e\u0005H\u0019LCŋ\u0005\u001ebo\u0017OVvu:]'+ipPWe6|[\u0013^TU\u0014=fӿ/@==e3a\u0004\u001fR\nA9CHܽ\u0007ص+'3ɞ־[A"}, d2 = {"\u001anZ6bu)O(\u00029<6\u0005\u0014+n\u00042\u0005\u0016", "", "u(E", "\u0012HA\u00126\u001b(@\rxh>\u0017Xu\u000bTi\u0015", "", "Bn>8\\6)O(\u0002", "\u001anZ6bu)O(\u0002P", "\u001aiPCTuB]b_~e,R", "<na:T3Bh\u0019", "", "5dc", "\u001aiPCTuGW#H{b3|R\u001aa\u000f+Q", "Bn?.g/", "=jX<"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Path get$default(Companion companion, File file, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            return companion.get(file, z2);
        }

        public static /* synthetic */ Path get$default(Companion companion, String str, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            return companion.get(str, z2);
        }

        public static /* synthetic */ Path get$default(Companion companion, java.nio.file.Path path, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            return companion.get(path, z2);
        }

        @JvmStatic
        public final Path get(File file) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            return get$default(this, file, false, 1, (Object) null);
        }

        @JvmStatic
        public final Path get(File file, boolean z2) {
            Intrinsics.checkNotNullParameter(file, "<this>");
            String string = file.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return get(string, z2);
        }

        @JvmStatic
        public final Path get(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return get$default(this, str, false, 1, (Object) null);
        }

        @JvmStatic
        public final Path get(String str, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return okio.internal.Path.commonToPath(str, z2);
        }

        @JvmStatic
        public final Path get(java.nio.file.Path path) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            return get$default(this, path, false, 1, (Object) null);
        }

        @JvmStatic
        public final Path get(java.nio.file.Path path, boolean z2) {
            Intrinsics.checkNotNullParameter(path, "<this>");
            return get(path.toString(), z2);
        }
    }

    static {
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        DIRECTORY_SEPARATOR = separator;
    }

    public Path(ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.bytes = bytes;
    }

    @JvmStatic
    public static final Path get(File file) {
        return Companion.get(file);
    }

    @JvmStatic
    public static final Path get(File file, boolean z2) {
        return Companion.get(file, z2);
    }

    @JvmStatic
    public static final Path get(String str) {
        return Companion.get(str);
    }

    @JvmStatic
    public static final Path get(String str, boolean z2) {
        return Companion.get(str, z2);
    }

    @JvmStatic
    public static final Path get(java.nio.file.Path path) {
        return Companion.get(path);
    }

    @JvmStatic
    public static final Path get(java.nio.file.Path path, boolean z2) {
        return Companion.get(path, z2);
    }

    public static /* synthetic */ Path resolve$default(Path path, String str, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        return path.resolve(str, z2);
    }

    public static /* synthetic */ Path resolve$default(Path path, ByteString byteString, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        return path.resolve(byteString, z2);
    }

    public static /* synthetic */ Path resolve$default(Path path, Path path2, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        return path.resolve(path2, z2);
    }

    @Override // java.lang.Comparable
    public int compareTo(Path other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return getBytes$okio().compareTo(other.getBytes$okio());
    }

    public boolean equals(Object obj) {
        return (obj instanceof Path) && Intrinsics.areEqual(((Path) obj).getBytes$okio(), getBytes$okio());
    }

    public final ByteString getBytes$okio() {
        return this.bytes;
    }

    public final Path getRoot() {
        int iRootLength = okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            return null;
        }
        return new Path(getBytes$okio().substring(0, iRootLength));
    }

    public final List<String> getSegments() {
        ArrayList arrayList = new ArrayList();
        int iRootLength = okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes$okio().size() && getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes$okio().size();
        int i2 = iRootLength;
        while (iRootLength < size) {
            if (getBytes$okio().getByte(iRootLength) == 47 || getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(getBytes$okio().substring(i2, iRootLength));
                i2 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i2 < getBytes$okio().size()) {
            arrayList.add(getBytes$okio().substring(i2, getBytes$okio().size()));
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((ByteString) it.next()).utf8());
        }
        return arrayList3;
    }

    public final List<ByteString> getSegmentsBytes() {
        ArrayList arrayList = new ArrayList();
        int iRootLength = okio.internal.Path.rootLength(this);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < getBytes$okio().size() && getBytes$okio().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = getBytes$okio().size();
        int i2 = iRootLength;
        while (iRootLength < size) {
            if (getBytes$okio().getByte(iRootLength) == 47 || getBytes$okio().getByte(iRootLength) == 92) {
                arrayList.add(getBytes$okio().substring(i2, iRootLength));
                i2 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i2 < getBytes$okio().size()) {
            arrayList.add(getBytes$okio().substring(i2, getBytes$okio().size()));
        }
        return arrayList;
    }

    public int hashCode() {
        return getBytes$okio().hashCode();
    }

    public final boolean isAbsolute() {
        return okio.internal.Path.rootLength(this) != -1;
    }

    public final boolean isRelative() {
        return okio.internal.Path.rootLength(this) == -1;
    }

    public final boolean isRoot() {
        return okio.internal.Path.rootLength(this) == getBytes$okio().size();
    }

    public final String name() {
        return nameBytes().utf8();
    }

    public final ByteString nameBytes() {
        int indexOfLastSlash = okio.internal.Path.getIndexOfLastSlash(this);
        return indexOfLastSlash != -1 ? ByteString.substring$default(getBytes$okio(), indexOfLastSlash + 1, 0, 2, null) : (volumeLetter() == null || getBytes$okio().size() != 2) ? getBytes$okio() : ByteString.EMPTY;
    }

    public final Path normalized() {
        return Companion.get(toString(), true);
    }

    public final Path parent() {
        Path path;
        if (Intrinsics.areEqual(getBytes$okio(), okio.internal.Path.DOT) || Intrinsics.areEqual(getBytes$okio(), okio.internal.Path.SLASH) || Intrinsics.areEqual(getBytes$okio(), okio.internal.Path.BACKSLASH) || okio.internal.Path.lastSegmentIsDotDot(this)) {
            return null;
        }
        int indexOfLastSlash = okio.internal.Path.getIndexOfLastSlash(this);
        if (indexOfLastSlash != 2 || volumeLetter() == null) {
            if (indexOfLastSlash == 1 && getBytes$okio().startsWith(okio.internal.Path.BACKSLASH)) {
                return null;
            }
            if (indexOfLastSlash != -1 || volumeLetter() == null) {
                if (indexOfLastSlash == -1) {
                    return new Path(okio.internal.Path.DOT);
                }
                if (indexOfLastSlash != 0) {
                    return new Path(ByteString.substring$default(getBytes$okio(), 0, indexOfLastSlash, 1, null));
                }
                path = new Path(ByteString.substring$default(getBytes$okio(), 0, 1, 1, null));
            } else {
                if (getBytes$okio().size() == 2) {
                    return null;
                }
                path = new Path(ByteString.substring$default(getBytes$okio(), 0, 2, 1, null));
            }
        } else {
            if (getBytes$okio().size() == 3) {
                return null;
            }
            path = new Path(ByteString.substring$default(getBytes$okio(), 0, 3, 1, null));
        }
        return path;
    }

    public final Path relativeTo(Path other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!Intrinsics.areEqual(getRoot(), other.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List<ByteString> segmentsBytes = getSegmentsBytes();
        List<ByteString> segmentsBytes2 = other.getSegmentsBytes();
        int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i2 = 0;
        while (i2 < iMin && Intrinsics.areEqual(segmentsBytes.get(i2), segmentsBytes2.get(i2))) {
            i2++;
        }
        if (i2 == iMin && getBytes$okio().size() == other.getBytes$okio().size()) {
            return Companion.get$default(Companion, ".", false, 1, (Object) null);
        }
        if (segmentsBytes2.subList(i2, segmentsBytes2.size()).indexOf(okio.internal.Path.DOT_DOT) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (Intrinsics.areEqual(other.getBytes$okio(), okio.internal.Path.DOT)) {
            return this;
        }
        Buffer buffer = new Buffer();
        ByteString slash = okio.internal.Path.getSlash(other);
        if (slash == null && (slash = okio.internal.Path.getSlash(this)) == null) {
            slash = okio.internal.Path.toSlash(DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i3 = i2; i3 < size; i3++) {
            buffer.write(okio.internal.Path.DOT_DOT);
            buffer.write(slash);
        }
        int size2 = segmentsBytes.size();
        while (i2 < size2) {
            buffer.write(segmentsBytes.get(i2));
            buffer.write(slash);
            i2++;
        }
        return okio.internal.Path.toPath(buffer, false);
    }

    public final Path resolve(String child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().writeUtf8(child), false), false);
    }

    public final Path resolve(String child, boolean z2) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().writeUtf8(child), false), z2);
    }

    public final Path resolve(ByteString child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().write(child), false), false);
    }

    public final Path resolve(ByteString child, boolean z2) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, okio.internal.Path.toPath(new Buffer().write(child), false), z2);
    }

    public final Path resolve(Path child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, child, false);
    }

    public final Path resolve(Path child, boolean z2) {
        Intrinsics.checkNotNullParameter(child, "child");
        return okio.internal.Path.commonResolve(this, child, z2);
    }

    public final File toFile() {
        return new File(toString());
    }

    public final java.nio.file.Path toNioPath() {
        java.nio.file.Path path = Paths.get(toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        return path;
    }

    public String toString() {
        return getBytes$okio().utf8();
    }

    public final Character volumeLetter() {
        if (ByteString.indexOf$default(getBytes$okio(), okio.internal.Path.SLASH, 0, 2, (Object) null) != -1 || getBytes$okio().size() < 2 || getBytes$okio().getByte(1) != 58) {
            return null;
        }
        char c2 = (char) getBytes$okio().getByte(0);
        if (('a' > c2 || c2 >= '{') && ('A' > c2 || c2 >= '[')) {
            return null;
        }
        return Character.valueOf(c2);
    }
}
