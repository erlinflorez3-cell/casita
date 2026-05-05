package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Okio;
import okio.Okio__JvmOkioKt;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007tjA0JfP.`\\2\u000fq~<$i+yّCU0}*\tUNmL\u0005Ϻx\u001ds\u000f4\u00151i>\u0012c\u0007]*\u000f`C CAO\b=gc;ZM.@&Py3\u0006J.V\u0012\u000fzqNR6xN~@j\r{\nJ\u0016\u0014E8\u0001L_.r~VzeR/Q\f\u001aF\\)w0+PSj\u001d=\u001b\u0001y\u001eYEg9#0k\u00035U\fC\u0011K\n=3kmKsW\u0002dNX.\u0015E/]\u000furT_Ku)\u001a59gcy_>,\u0006|\u0014\rj\u0007T*oV<=2f6\u001fcx\u0001UXP0a\t$іeI"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI,\u0006\na\u001b\u001eG]\"J\u0006%=/", "", "/o_2a+B\\\u001bl~g2", "\u001anZ6bu,W\"\u0005P", "4h[2", "\u001aiPCTuB]b_~e,R", "2d[2g,", "", "2d[2g,\u001c]\"\u000ezg;\u000b", "2ha2V;H`-", "3wX@g:", "", "@d].`,", "4q^:", "Bn", "Ah]8", "Ahi2", "", "And?V,", "\u001anZ6bu,])\fx^\u0002", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface FileSystem {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"2ߡx\u001d߿\u001b9^C\u001eG1\u0013X0\u000fө\u007f42[t\u0003Q<m\u001a,$?S%ʼiĔNZ\u0013¼Ǎ\n\u0015ѷn0"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI,\u0006\na\u001b\u001eG]\"J\u0006%=\u0018[*?x\u00127QMDA", "", "u(E", "!XB!8\u0014", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI,\u0006\na\u001b\u001eG]\"J\u0006%=/", "!xbAX4\u001fW ~hr:\f\t7", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG0LeN/ZS8\u0018s{:'c$\u007fJC٥\"}8\tWȞog|VbŏI\u000f\u001cǝ)jZH\u0016{ٕ\u0016\u000f@B8MAN\b=gb%:\u0013#J\"f}K\u0015b8V\u0015\u000fzqQ<\u0016>C\t:\u0001\u0011\u0014\u0019b \u0014E8\u0001Lb\u0018RDP\u0005]h3i\u00172P\\0w0+W=Jb*%v\u0010\"qT\u007fK#0k\u00035X\fC\u0011K\n=3lW+9V\fWd\\F(]9]\u001burT^5Un\u000f?+}g\u0012dV6\u0006\n\u0014\rj\u0014>\n5KF-HjN\"{\u0003\u0001dXP0pr\u0004\tdN\u0017S\u0004y?\u0002!tdy;Gb}\u0010̅\u00113"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI,\u0006\na\u001b\u001eG]\"J\u0006%=\u0018[*?x\u00127QMD*\"2#waAgg3Nd;U[N42", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI,\u0006\na\u001b\u001eG]\"J\u0006%=/", "u(E", "/o_2a+B\\\u001bl~g2", "\u001anZ6bu,W\"\u0005P", "4h[2", "\u001aiPCTuB]b_~e,R", "2d[2g,", "", "2d[2g,\u001c]\"\u000ezg;\u000b", "2ha2V;H`-", "3wX@g:", "", "@d].`,", "4q^:", "Bn", "Ah]8", "Ahi2", "", "And?V,", "\u001anZ6bu,])\fx^\u0002", "BnBAe0GU", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        private static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            public Sink appendingSink(File file) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return Okio.appendingSink(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio.appendingSink(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(File file) throws IOException {
                Intrinsics.checkNotNullParameter(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException("failed to delete " + file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(File directory) throws IOException {
                Intrinsics.checkNotNullParameter(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : fileArrListFiles) {
                    if (file.isDirectory()) {
                        Intrinsics.checkNotNullExpressionValue(file, "file");
                        deleteContents(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(File from, File to) throws IOException {
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to, "to");
                delete(to);
                if (!from.renameTo(to)) {
                    throw new IOException("failed to rename " + from + " to " + to);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public Sink sink(File file) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(File file) {
                Intrinsics.checkNotNullParameter(file, "file");
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            public Source source(File file) throws FileNotFoundException {
                Intrinsics.checkNotNullParameter(file, "file");
                return Okio.source(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    Sink appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    Sink sink(File file) throws FileNotFoundException;

    long size(File file);

    Source source(File file) throws FileNotFoundException;
}
