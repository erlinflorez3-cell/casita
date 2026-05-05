package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
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
@Metadata(bv = {}, d1 = {"ЯN\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007f\u0007|jA0ZeP.hS2şs{J$c$wDCU0}*ޛWNugvJ`\u000bK\u000f\u0014ǝ\u0001̓4Ic\u0005e\u0012%2JoE6SnSʠ\u0011td\u0004`5ŕ<y\u0013\u0001b4V\u001c\u000f\u0001SM\u001c\u0012^E\u001fG\u001b\u0013[\u00132\u00124Mf\u0001ftu^NH\u001blj51\u0014\u0002Dd&\u000eB-Q\u001bYl';\u000b(\u001es\u0001E8-%\u0002\u00127\tiP\u001bq\u0002N\u0015wU,ȅM}]Kh\u0006\u001a(;Q\u0013c\u0019<l\u0018aq\"&YUӍOZ\u0014=\b\u0001\u0002 L\u0006\u0014\fM_>/*f6\u0015ax9g\t\u000f\u0010fZ\u007f)pfK3\u0011K[I,v`\u0010@ϭRA\u0002\u001a\u001d$)\u0014~#aZ4v%,d\u0007\u007f:ҨDGNc\u001a_C\u0001\u0014rh\bP\u001c@I\u0010/*\u0018\\\u001bkK$w1+\u0004\u0002vS\u0018+\u0013q\u0001\u0004ycXOPsގ;4\u000f!jJj\u0018{RZ^R*]-d\u0016,\u0011˙$f}Q1+\u0016a_jopsu\u001a'?fe`\u001doTk\u0002\u001dA@ic>p\u0003+\"PT\u0013\u0015ivQ\u0002\u0011Ⱥ`2(GXp\u0016\u000b\fFT\u00129KO\u0003,CZ7Ǭ`\u001fN\u0018.HG\u0010\u0019a`n6\u0016d54\u0003\u0018+#\rGd-|}h\u0011IZ~7ø9ۮU5!ğ&Dv7\u00159\u0017\u0001\u0004\u007ful\\K\\n,t\u0004\u00020\u0018*9\u007f6S\u0012=\u0003\u007fɈ\u000eβILzό\"m /\u0013\u0011\n\u0011Kh\\l\u0018l\u0001,\u000fsZQd\u0017P}tqQ\f;у\u0006ӶJzOϊ%+iHa\u0007\u0013[LNf\u0002\u0015!.%/x2~E-q.3\u0015&\u0018\u0006֕mԃmo6Ӡ3/4\u007f}\u0018<e&o\u0011Vm4K8w_\u000f@2$\u001b\nXG\u0019{^Ⱥ\u0015Ό\u00113PШѕtp"}, d2 = {"\u001aj^A_0G\u001d\u001d\tDi(\f\fxF\u0004/{1\u0005%\u001bVy\u001b\u0019\u0007)<X}-\u001bu!5#", "\u001aj^A_0G\u001d\u001d\tDi(\f\fxF\u0004/{1\u0005%\u001bVy\u001b\u0019\u0007)<X}-\r", "u(E", "7r1B\\3M", "", "=m?<f;/W'\u0003\n=0\n\t-t\n5\u0010", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aiPCTuGW#H{b3|R\u001aa\u000f+Q", "\u001aiPCTuB]bbd>?z\t:t\u00042\u0005\u0016", "\u001aiPCTuGW#H{b3|R\u0010i\u0007(lD\u000f\u001b&4o\u001cL}4\u000b", "=m??X\u001dBa\u001d\u000eYb9|\u0007>o\r<", "\u001aiPCTuGW#H{b3|R+t\u000f5\u007f=\u0011&\u0017\u0011L\nJz#\u0016]\u0005 \u0013|%;Q@Kz4,j", "=mE6f0M4\u001d\u0006z", "=mE6f0M4\u001d\u0006z?(\u0001\u0010/d", "0tX9W", "\u001aiPCTuGW#H{b3|R\u0010i\u0007(lD\u000f\u001b&Q|c", "1gT0^\u0010L<#\u000eWn0\u0004\u0018", "", "1gT0^\u0015Hbw~{b5|\b", "4t]0g0H\\", "", "<`\\2", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "2ha2V;H`-", "3wR2c;B]\"", "/sc?\\)Nb\u0019\r", "4h[2", "9nc9\\5\u0006a(}\u0002b)D\u000e.kQ"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class FileVisitorBuilderImpl implements FileVisitorBuilder {
    private boolean isBuilt;
    private Function2<? super Path, ? super IOException, ? extends FileVisitResult> onPostVisitDirectory;
    private Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> onPreVisitDirectory;
    private Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> onVisitFile;
    private Function2<? super Path, ? super IOException, ? extends FileVisitResult> onVisitFileFailed;

    private final void checkIsNotBuilt() {
        if (this.isBuilt) {
            throw new IllegalStateException("This builder was already built");
        }
    }

    private final void checkNotDefined(Object obj, String str) {
        if (obj != null) {
            throw new IllegalStateException(str + " was already defined");
        }
    }

    public final FileVisitor<Path> build() {
        checkIsNotBuilt();
        this.isBuilt = true;
        return new FileVisitorImpl(this.onPreVisitDirectory, this.onVisitFile, this.onVisitFileFailed, this.onPostVisitDirectory);
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void onPostVisitDirectory(Function2<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        checkIsNotBuilt();
        checkNotDefined(this.onPostVisitDirectory, "onPostVisitDirectory");
        this.onPostVisitDirectory = function;
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void onPreVisitDirectory(Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        checkIsNotBuilt();
        checkNotDefined(this.onPreVisitDirectory, "onPreVisitDirectory");
        this.onPreVisitDirectory = function;
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void onVisitFile(Function2<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        checkIsNotBuilt();
        checkNotDefined(this.onVisitFile, "onVisitFile");
        this.onVisitFile = function;
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void onVisitFileFailed(Function2<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        checkIsNotBuilt();
        checkNotDefined(this.onVisitFileFailed, "onVisitFileFailed");
        this.onVisitFileFailed = function;
    }
}
