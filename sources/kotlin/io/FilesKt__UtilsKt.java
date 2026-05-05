package kotlin.io;

import androidx.exifinterface.media.ExifInterface;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
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
@Metadata(bv = {}, d1 = {"Я>\u001d̉=!,u\bDZc|\u0004G\u00108\u000b<K\u0007\"2\u0013\u007f\u0007|jA0ZeP.hS2\u000fq{<$i*yCAW\"}0'WȞog\u0005Jb\u000bI\u0019\u001e>\u0007qDI\u0004x\u000e\u0018\u00152PwW3{nmAftD\u000e8487(\u00041\"0H\u001e\u0001\u0013Ea\u000b@0\u0007uRz\u001bX\u001d\u001a@\u0006n&\u0007\u001ejof6vk\u000eB5#\u0011rZP=^^{}\u0015LT5\u0017\u000fc4*n7{\u001a=\n\u0011\u0013j[m\u0010gqk\u0005\u0019+59as\u00066\t\u0006\u001a\u00159^%]!3\r\u001dW`\u001a7CasM`\u000eVw\u000b}\u001d<2 \u0016)X.[-\u0015\u0019&W\u0003\u0007k@~\u0002\u0007B.z\u0012:%3\u00183Y9KlWaI(f7*\u0012=$)\u0001|6sT<v-#b\u000fi1\u007fMeH|\nqM{\u001c\tb07,0u\u007f_\u007f\u001fG/%e[Q3/\u0004\u001aHrt\u001f\u0005\u000fh\u0004m`aX\"\u001d\u0015O2\u0017&rD\u0013\u0005\u0014P\u0003XD,[6l\r\u000e\n# \u000bwj<M\u0016^Qxi\u0019M\f%k/Ϭ;Yt\b&fGxK5\u007f\u00018a\u0001\u0014Z?םf\u0005^\u0003Zc\u001axt(P2pj>w,H\\++2mq4F:Q1^+G1\u001ejA+\t\u0010^v/\u0017Ta$\u001by2\u0016!\u0001~\\\u0019o\u0016xy0\u000b\u007f:-oQM)4w:hb|K\u0007-s0Kuo_L\u001b\u0016\u000ee\nB.\u001agQW=A\u000f/-@%EEzq}a[6?z+y7;\u0017.\u0018\fx\u0014D`\u0019Jgd%F\u000f^!#0d.y\u0012J\tj{T9ZVY\u0001(q<|E%\u0005M\u001eU\u0005};\u00155[C?-$\u001d,/Cn\u0006i\u001e.*f\u001d?\re2+{&}\ti]`:`I\b~n&2\f\u001bBvj\u0010!P0L\u000fIGoc\u0019VfM;3\f\u0006\u001f,;p\u001d[ǈ\u0017o\u0004\\Nr8ϒ[}B]k%?M\n,ƽqOt\rP\u0010\u0018\r\u001cD|\u00154=NU\u007fb70<8͛:ESd\u000b@\u0017&T?J\r#C\u0003h.\u0010)\u007f|$ʸ\u001b6ZuA\\\u001cVܨ`\u007f"}, d2 = {"3wc2a:B]\"", "", "\u001aiPCTuB]b_~e,R", "5dc\u0012k;>\\'\u0003\u0005g", "uKY.i(\bW#H[b3|^rL\u0005$\r<J\u001e\u0013PqW*\u000629b\u007fu", "7me.e0:\\(lzi(\n\u0005>o\r6f<\u0010\u001a", "5dc\u0016a=:`\u001dz\u0004m\u001a|\u0014+r{7\u0006M\u000f\u0002\u0013Vr", "<`\\2J0MV#\u000f\n>?\f\t8s\u00042\u0005", "5dc\u001bT4>E\u001d\u000e}h<\fhBt\u007f1\nD\u000b ", "1qT.g,-S!\nYb9", ">qT3\\?", "AtU3\\?", "2ha2V;H`-", "1qT.g,-S!\n[b3|", "1n_FE,<c&\r~o,\u0004\u001d", "", "B`a4X;", "=uT?j9Bb\u0019", "=m4?e6K", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001d\u001d\tDH5\\\u0016<o\r\u0004yO\u0005! \u001d", "1n_FG6", "0tU3X9,W.~", "", "2d[2g,+S\u0017\u000f\bl0\u000e\t6y", "3mS@J0MV", "=sW2e", "<na:T3Bh\u0019", "", "<na:T3Bh\u0019=[b3|\u0017\u0015ty\"kO\u0005\u001e%-~", "\u001aj^A_0G\u001d\u001d\tD?0\u0004\t\u001aa\u000f+YJ\t\"!Po\u0017K\u0005z", "@d[.g0OS\b\t", "0`b2", "@d[.g0OS\b\tdk\u0015\r\u00106", "@d[.g0OS\b\tdk\u001a|\u00100", "@db<_=>", "@d[.g0OS", "@db<_=>A\u001d{\u0002b5~", "AsP?g:0W(\u0002", "BnA2_(MW*~hm9\u0001\u00121", "BnA2_(MW*~hm9\u0001\u00121O\r\u0011\fG\b", "BnA2_(MW*~hm9\u0001\u00121O\r\u0011\fG\bUwKv\u000eJ\\4/Sm/;t$\u0014\\", "9nc9\\5\u0006a(}\u0002b)"}, k = 5, mv = {1, 9, 0}, pn = "", xi = 49, xs = ">AE<8<{5:x\u000f13+8\u000f7")
public class FilesKt__UtilsKt extends FilesKt__FileTreeWalkKt {

    /* JADX INFO: renamed from: kotlin.io.FilesKt__UtilsKt$copyRecursively$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,h\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015ii4Re`.\u0001TZ\u0013y}L$\n'8KтY\u001a\u0004&"}, d2 = {"\n`]<a@F])\rS", "", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzKo", "\u001aiPCTuB]b_~e,R", "3wR2c;B]\"", "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function2 {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final Void invoke(File file, IOException exception) throws IOException {
            Intrinsics.checkNotNullParameter(file, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(exception, "exception");
            throw exception;
        }
    }

    /* JADX INFO: renamed from: kotlin.io.FilesKt__UtilsKt$copyRecursively$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,i\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ:ߚ\u0010\u0007\u0015ii4Re`.\u0001TZ\u0013y}L$\n'8KтY\u001a\u0004&"}, d2 = {"\n`]<a@F])\rS", "", "4", "\u001aiPCTuB]b_~e,R", ExifInterface.GPS_MEASUREMENT_3D, "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", "7me<^,"}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<File, IOException, Unit> {
        final /* synthetic */ Function2<File, IOException, OnErrorAction> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super File, ? super IOException, ? extends OnErrorAction> function2) {
            super(2);
            function2 = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(File file, IOException iOException) throws TerminateException {
            invoke2(file, iOException);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(File f2, IOException e2) throws TerminateException {
            Intrinsics.checkNotNullParameter(f2, "f");
            Intrinsics.checkNotNullParameter(e2, "e");
            if (function2.invoke(f2, e2) == OnErrorAction.TERMINATE) {
                throw new TerminateException(f2);
            }
        }
    }

    public static final boolean copyRecursively(File file, File target, boolean z2, Function2<? super File, ? super IOException, ? extends OnErrorAction> onError) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (!file.exists()) {
            return onError.invoke(file, new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null)) != OnErrorAction.TERMINATE;
        }
        try {
            for (File file2 : FilesKt.walkTopDown(file).onFail(new Function2<File, IOException, Unit>() { // from class: kotlin.io.FilesKt__UtilsKt.copyRecursively.2
                final /* synthetic */ Function2<File, IOException, OnErrorAction> $onError;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                AnonymousClass2(Function2<? super File, ? super IOException, ? extends OnErrorAction> onError2) {
                    super(2);
                    function2 = onError2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(File file3, IOException iOException) throws TerminateException {
                    invoke2(file3, iOException);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke */
                public final void invoke2(File f2, IOException e2) throws TerminateException {
                    Intrinsics.checkNotNullParameter(f2, "f");
                    Intrinsics.checkNotNullParameter(e2, "e");
                    if (function2.invoke(f2, e2) == OnErrorAction.TERMINATE) {
                        throw new TerminateException(f2);
                    }
                }
            })) {
                if (file2.exists()) {
                    File file3 = new File(target, FilesKt.toRelativeString(file2, file));
                    if (file3.exists() && (!file2.isDirectory() || !file3.isDirectory())) {
                        if (z2) {
                            if (file3.isDirectory()) {
                                if (!FilesKt.deleteRecursively(file3)) {
                                }
                            } else if (!file3.delete()) {
                            }
                        }
                        if (onError2.invoke(file3, new FileAlreadyExistsException(file2, file3, "The destination file already exists.")) == OnErrorAction.TERMINATE) {
                            return false;
                        }
                    }
                    if (file2.isDirectory()) {
                        file3.mkdirs();
                    } else if (FilesKt.copyTo$default(file2, file3, z2, 0, 4, null).length() != file2.length() && onError2.invoke(file2, new IOException("Source file wasn't copied completely, length of destination file differs.")) == OnErrorAction.TERMINATE) {
                        return false;
                    }
                } else if (onError2.invoke(file2, new NoSuchFileException(file2, null, "The source file doesn't exist.", 2, null)) == OnErrorAction.TERMINATE) {
                    return false;
                }
            }
            return true;
        } catch (TerminateException unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean copyRecursively$default(File file, File file2, boolean z2, Function2 function2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z2 = false;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            function2 = AnonymousClass1.INSTANCE;
        }
        return FilesKt.copyRecursively(file, file2, z2, function2);
    }

    public static final File copyTo(File file, File target, boolean z2, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            throw new NoSuchFileException(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z2) {
                throw new FileAlreadyExistsException(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new FileAlreadyExistsException(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (!file.isDirectory()) {
            File parentFile = target.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileOutputStream fileInputStream = new FileInputStream(file);
            try {
                FileInputStream fileInputStream2 = fileInputStream;
                fileInputStream = new FileOutputStream(target);
                try {
                    ByteStreamsKt.copyTo(fileInputStream2, fileInputStream, i2);
                    CloseableKt.closeFinally(fileInputStream, null);
                    CloseableKt.closeFinally(fileInputStream, null);
                } finally {
                }
            } finally {
            }
        } else if (!target.mkdirs()) {
            throw new FileSystemException(file, target, "Failed to create target directory.");
        }
        return target;
    }

    public static /* synthetic */ File copyTo$default(File file, File file2, boolean z2, int i2, int i3, Object obj) {
        if ((2 & i3) != 0) {
            z2 = false;
        }
        if ((i3 & 4) != 0) {
            i2 = 8192;
        }
        return FilesKt.copyTo(file, file2, z2, i2);
    }

    @Deprecated(message = "\u0004\\\u000b>u4\u0018i]H<\u0004^\u001ckbaY\u00196\u0017i\u001ek6Jw|Sw8uzUiU\revxZ&8y\u0016[Rz7d\\zyCA\"KS#G\u001c\u000b=\u0011\u0001K\u0007@0S=\u0010e+\u001b;N%M}U77?\u0013sPX[\u0003\u000b_\n1SO=\b\u001f\u001aJIW$-(QJn\n%9\u0001Jd\u001d_9!\u000fG7\u00061yr\u001b\u0012\n\u0005CioWH`i\u000f\"6\nJ\u0016\"<kW#h\u0006w\u0005Vhn{\u0015}6\u001ck,66QtyioS\u0010LsY|c:$cYF\u001eZpQZ5oP!3\u001b")
    @InterfaceC1492Gx
    public static final File createTempDir(String prefix, String str, File file) throws IOException {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        File fileCreateTempFile = File.createTempFile(prefix, str, file);
        fileCreateTempFile.delete();
        if (!fileCreateTempFile.mkdir()) {
            throw new IOException("Unable to create temporary directory " + fileCreateTempFile + '.');
        }
        Intrinsics.checkNotNull(fileCreateTempFile);
        return fileCreateTempFile;
    }

    public static /* synthetic */ File createTempDir$default(String str, String str2, File file, int i2, Object obj) {
        if ((1 & i2) != 0) {
            str = "tmp";
        }
        if ((2 & i2) != 0) {
            str2 = null;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            file = null;
        }
        return FilesKt.createTempDir(str, str2, file);
    }

    @Deprecated(message = "\u0004\\\u000b>u4\u0018i]H<\u0004^\u001ckbaY\u00196\u0017i\u001ek6LwvS\bcov\fxJR\u001cl>L\u001fHF&\u0016`~/h\bGtA5&\u0015V\"\u00042\u007fH\n2 w@/\u000b\u0004\u0011k%\u001c\u0005W\u001e~~V3gEb/Ob+.\u0013)y'\u0004 +\u0011(\u001e\u001eL[!.2}Fs:+.Fzdbb=5\u000f<Ds&t8\u001c?\u000b\r;i9W9j\\I*1\u000fD\u0006bJ\u007fSk9{|x\u0018br3\r\u0003m\u007fo%>NWny(d\\/[kJ\u001d\u001a71 W<\u001fPC\\\f6j\u000b*0c!Vpq\u0004Mz_ts7e9\u0015}+q$\u00122\u000e\b\u000e\t\u0001")
    @InterfaceC1492Gx
    public static final File createTempFile(String prefix, String str, File file) throws IOException {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        File fileCreateTempFile = File.createTempFile(prefix, str, file);
        Intrinsics.checkNotNullExpressionValue(fileCreateTempFile, "createTempFile(...)");
        return fileCreateTempFile;
    }

    public static /* synthetic */ File createTempFile$default(String str, String str2, File file, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            str = "tmp";
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            file = null;
        }
        return FilesKt.createTempFile(str, str2, file);
    }

    public static final boolean deleteRecursively(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        while (true) {
            boolean z2 = true;
            for (File file2 : FilesKt.walkBottomUp(file)) {
                if (!file2.delete() && file2.exists()) {
                    z2 = false;
                } else {
                    if (z2) {
                        break;
                    }
                    z2 = false;
                }
            }
            return z2;
        }
    }

    public static final boolean endsWith(File file, File other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        FilePathComponents components = FilesKt.toComponents(file);
        FilePathComponents components2 = FilesKt.toComponents(other);
        if (components2.isRooted()) {
            return Intrinsics.areEqual(file, other);
        }
        int size = components.getSize() - components2.getSize();
        if (size < 0) {
            return false;
        }
        return components.getSegments().subList(size, components.getSize()).equals(components2.getSegments());
    }

    public static final boolean endsWith(File file, String other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return FilesKt.endsWith(file, new File(other));
    }

    public static final String getExtension(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.substringAfterLast(name, '.', "");
    }

    public static final String getInvariantSeparatorsPath(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        if (File.separatorChar != '/') {
            String path = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            return StringsKt.replace$default(path, File.separatorChar, '/', false, 4, (Object) null);
        }
        String path2 = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path2, "getPath(...)");
        return path2;
    }

    public static final String getNameWithoutExtension(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.substringBeforeLast$default(name, ".", (String) null, 2, (Object) null);
    }

    public static final File normalize(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        FilePathComponents components = FilesKt.toComponents(file);
        File root = components.getRoot();
        List<File> listNormalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(components.getSegments());
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        return FilesKt.resolve(root, CollectionsKt.joinToString$default(listNormalize$FilesKt__UtilsKt, separator, null, null, 0, null, null, 62, null));
    }

    private static final List<File> normalize$FilesKt__UtilsKt(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!Intrinsics.areEqual(name, ".")) {
                if (!Intrinsics.areEqual(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || Intrinsics.areEqual(((File) CollectionsKt.last((List) arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    private static final FilePathComponents normalize$FilesKt__UtilsKt(FilePathComponents filePathComponents) {
        return new FilePathComponents(filePathComponents.getRoot(), normalize$FilesKt__UtilsKt(filePathComponents.getSegments()));
    }

    public static final File relativeTo(File file, File base) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        return new File(FilesKt.toRelativeString(file, base));
    }

    public static final File relativeToOrNull(File file, File base) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, base);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return new File(relativeStringOrNull$FilesKt__UtilsKt);
        }
        return null;
    }

    public static final File relativeToOrSelf(File file, File base) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, base);
        return relativeStringOrNull$FilesKt__UtilsKt != null ? new File(relativeStringOrNull$FilesKt__UtilsKt) : file;
    }

    public static final File resolve(File file, File relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        if (FilesKt.isRooted(relative)) {
            return relative;
        }
        String string = file.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String str = string;
        return (str.length() == 0 || StringsKt.endsWith$default((CharSequence) str, File.separatorChar, false, 2, (Object) null)) ? new File(string + relative) : new File(string + File.separatorChar + relative);
    }

    public static final File resolve(File file, String relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        return FilesKt.resolve(file, new File(relative));
    }

    public static final File resolveSibling(File file, File relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        FilePathComponents components = FilesKt.toComponents(file);
        return FilesKt.resolve(FilesKt.resolve(components.getRoot(), components.getSize() == 0 ? new File("..") : components.subPath(0, components.getSize() - 1)), relative);
    }

    public static final File resolveSibling(File file, String relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        return FilesKt.resolveSibling(file, new File(relative));
    }

    public static final boolean startsWith(File file, File other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        FilePathComponents components = FilesKt.toComponents(file);
        FilePathComponents components2 = FilesKt.toComponents(other);
        if (Intrinsics.areEqual(components.getRoot(), components2.getRoot()) && components.getSize() >= components2.getSize()) {
            return components.getSegments().subList(0, components2.getSize()).equals(components2.getSegments());
        }
        return false;
    }

    public static final boolean startsWith(File file, String other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return FilesKt.startsWith(file, new File(other));
    }

    public static final String toRelativeString(File file, File base) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String relativeStringOrNull$FilesKt__UtilsKt = toRelativeStringOrNull$FilesKt__UtilsKt(file, base);
        if (relativeStringOrNull$FilesKt__UtilsKt != null) {
            return relativeStringOrNull$FilesKt__UtilsKt;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + '.');
    }

    private static final String toRelativeStringOrNull$FilesKt__UtilsKt(File file, File file2) {
        FilePathComponents filePathComponentsNormalize$FilesKt__UtilsKt = normalize$FilesKt__UtilsKt(FilesKt.toComponents(file));
        FilePathComponents filePathComponentsNormalize$FilesKt__UtilsKt2 = normalize$FilesKt__UtilsKt(FilesKt.toComponents(file2));
        if (!Intrinsics.areEqual(filePathComponentsNormalize$FilesKt__UtilsKt.getRoot(), filePathComponentsNormalize$FilesKt__UtilsKt2.getRoot())) {
            return null;
        }
        int size = filePathComponentsNormalize$FilesKt__UtilsKt2.getSize();
        int size2 = filePathComponentsNormalize$FilesKt__UtilsKt.getSize();
        int iMin = Math.min(size2, size);
        int i2 = 0;
        while (i2 < iMin && Intrinsics.areEqual(filePathComponentsNormalize$FilesKt__UtilsKt.getSegments().get(i2), filePathComponentsNormalize$FilesKt__UtilsKt2.getSegments().get(i2))) {
            i2++;
        }
        StringBuilder sb = new StringBuilder();
        int i3 = size - 1;
        if (i2 <= i3) {
            while (!Intrinsics.areEqual(filePathComponentsNormalize$FilesKt__UtilsKt2.getSegments().get(i3).getName(), "..")) {
                sb.append("..");
                if (i3 != i2) {
                    sb.append(File.separatorChar);
                }
                if (i3 != i2) {
                    i3--;
                }
            }
            return null;
        }
        if (i2 < size2) {
            if (i2 < size) {
                sb.append(File.separatorChar);
            }
            String separator = File.separator;
            Intrinsics.checkNotNullExpressionValue(separator, "separator");
            CollectionsKt.joinTo$default(CollectionsKt.drop(filePathComponentsNormalize$FilesKt__UtilsKt.getSegments(), i2), sb, separator, null, null, 0, null, null, 124, null);
        }
        return sb.toString();
    }
}
