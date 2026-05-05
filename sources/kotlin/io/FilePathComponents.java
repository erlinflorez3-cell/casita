package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r@4\u0012}\u0007njG9LeN0ZS8\u001bs{:'c$\u007fICU \t(ޜUdʴ\u0018nxYK^\u0015إ&|x,aU'^\"\u0019@D\bECO\u007f=ga#9ӯ$20<B\f\u000f.BH>wAƖLT\u001f>U\t@b\u000f]\u0005H\u00134AfӼ\u001f%\t\\L`l\fŽ_)\tiPN?_^}}\u0019LT5\u000f\u000fg.-P7c\u0016SVIߞQ$P\u0011V\n=3nW-9a\fYLW.\u0013[ܗPUd\u0001?t\u0005\u007fqR̃*\u0018wYj&(&{,\u0011J\u001f&\u0006UY^1(\u0003 \u000ea\u0006;ZNm\u001a^p\u000bA˿5g4\u000e8C9Il\b&ޅ\u001dRO}\u000b\u0012,*Q}/[l\u000e\u000f\u0016ôX}YĸiBCP\\\u0013*L{\u000e\tb05:tϽ\u00043\u0014\u00134#3D,N1#\u0004\bXFwv3a\u0017VׂVNH̎\u0007\u0018=8\u0017\u001b+Sr\u0015\u0004P\u0003ibUܖ X\u001f\u007f\u000e%.oʥ@?"}, d2 = {"\u001aj^A_0G\u001d\u001d\tD?0\u0004\t\u001aa\u000f+YJ\t\"!Po\u0017K\u0005z", "", "@n^A", "\u001aiPCTuB]b_~e,R", "AdV:X5Ma", "", "uKY.i(\bW#H[b3|^\u0016j{9w\n\u0011&\u001bN9t@\u00054\u000b\u001dn", "7rA<b;>R", "", "u(I", "5dc\u001fb6M", "u(;7T=:\u001d\u001d\tD?0\u0004\t\u0005", "@n^AA(FS", "", "5dc\u001fb6M<\u0015\u0007z", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc X.FS\"\u000e\t", "u(;7T=:\u001d)\u000e~euc\r=tU", "Ahi2", "", "5dc \\A>", "u(8", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "AtQ\u001dT;A", "0dV6a\u0010GR\u0019\u0012", "3mS\u0016a+>f", "BnBAe0GU", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class FilePathComponents {
    private final File root;
    private final List<File> segments;

    /* JADX WARN: Multi-variable type inference failed */
    public FilePathComponents(File root, List<? extends File> segments) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.root = root;
        this.segments = segments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilePathComponents copy$default(FilePathComponents filePathComponents, File file, List list, int i2, Object obj) {
        if ((1 & i2) != 0) {
            file = filePathComponents.root;
        }
        if ((i2 & 2) != 0) {
            list = filePathComponents.segments;
        }
        return filePathComponents.copy(file, list);
    }

    public final File component1() {
        return this.root;
    }

    public final List<File> component2() {
        return this.segments;
    }

    public final FilePathComponents copy(File root, List<? extends File> segments) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(segments, "segments");
        return new FilePathComponents(root, segments);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilePathComponents)) {
            return false;
        }
        FilePathComponents filePathComponents = (FilePathComponents) obj;
        return Intrinsics.areEqual(this.root, filePathComponents.root) && Intrinsics.areEqual(this.segments, filePathComponents.segments);
    }

    public final File getRoot() {
        return this.root;
    }

    public final String getRootName() {
        String path = this.root.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return path;
    }

    public final List<File> getSegments() {
        return this.segments;
    }

    public final int getSize() {
        return this.segments.size();
    }

    public int hashCode() {
        return (this.root.hashCode() * 31) + this.segments.hashCode();
    }

    public final boolean isRooted() {
        String path = this.root.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        return path.length() > 0;
    }

    public final File subPath(int i2, int i3) {
        if (i2 < 0 || i2 > i3 || i3 > getSize()) {
            throw new IllegalArgumentException();
        }
        List<File> listSubList = this.segments.subList(i2, i3);
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        return new File(CollectionsKt.joinToString$default(listSubList, separator, null, null, 0, null, null, 62, null));
    }

    public String toString() {
        return "FilePathComponents(root=" + this.root + ", segments=" + this.segments + ')';
    }
}
