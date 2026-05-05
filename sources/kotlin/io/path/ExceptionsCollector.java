package kotlin.io.path;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\":1\u007f\u0007|jA0ZeP.XT2\u000f\u0002{<$a+yCIU\"}(\fUN}˧\u001fJ\t\n\u0004\u001c\u0016\u001c~j:Imx\f\u0013Ƥ6B}A{]}PQ`#J5(@7P}3\u0006\u0003*'\u0016?\u0007Qa$\u0012^T!>`$e\u0005H\u001cNJ.\u00196\\\u0016bfLztR/Q\r:[\\*w:\rS\u001dJ\u0003,uv@$YD˝9\u001b-م\u001b\tXbM\u000b\u0010}K\u0005\u0001'U, ֘Y͏\\\u007f\u001cƃ{i\u001bf\u000b(r\u0004\u007fjbʳ7յgWXʫ@y\u0001\u0007\u001bH$\u0010\f4V<}6t\u0018&3#s\u0004D^\u0011vB.{ vmӢ\fĴ/?#ƘicA*\\Iߏ\t&"}, d2 = {"\u001aj^A_0G\u001d\u001d\tDi(\f\fxE\u0013&{K\u0010\u001b!P}kF},5W\r*DC", "", ":h\\6g", "", "uH\u0018#", "1n[9X*MS\u0018^\u000e\\,\b\u00183o\t6", "", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU", "5dc\u0010b3ES\u0017\u000ez]\f\u0010\u0007/p\u000f,\u0006I\u000f", "u(;7T=:\u001d)\u000e~euc\r=tU", ">`c5", "\u001aiPCTuGW#H{b3|R\u001aa\u000f+Q", "5dc\u001dT;A", "u(;7T=:\u001d\"\u0003\u0005(-\u0001\u0010//j$\u000bCV", "Adc\u001dT;A", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016D\b", "\nrTA \u0006\u0017", "Bnc._\fQQ\u0019\n\nb6\u0006\u0017", "5dc!b;:Zx\u0012x^7\f\r9n\u000e", "u(8", "1n[9X*M", "", "3wR2c;B]\"", "3mc2e\fGb&\u0013", "<`\\2", "3wXA85M`-", "9nc9\\5\u0006a(}\u0002b)D\u000e.kQ"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
final class ExceptionsCollector {
    private final List<Exception> collectedExceptions;
    private final int limit;
    private Path path;
    private int totalExceptions;

    public ExceptionsCollector() {
        this(0, 1, null);
    }

    public ExceptionsCollector(int i2) {
        this.limit = i2;
        this.collectedExceptions = new ArrayList();
    }

    public /* synthetic */ ExceptionsCollector(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 64 : i2);
    }

    public final void collect(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.totalExceptions++;
        if (this.collectedExceptions.size() < this.limit) {
            if (this.path != null) {
                Throwable thInitCause = new FileSystemException(String.valueOf(this.path)).initCause(exception);
                Intrinsics.checkNotNull(thInitCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exception = (FileSystemException) thInitCause;
            }
            this.collectedExceptions.add(exception);
        }
    }

    public final void enterEntry(Path name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Path path = this.path;
        this.path = path != null ? path.resolve(name) : null;
    }

    public final void exitEntry(Path name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Path path = this.path;
        if (!Intrinsics.areEqual(name, path != null ? path.getFileName() : null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Path path2 = this.path;
        this.path = path2 != null ? path2.getParent() : null;
    }

    public final List<Exception> getCollectedExceptions() {
        return this.collectedExceptions;
    }

    public final Path getPath() {
        return this.path;
    }

    public final int getTotalExceptions() {
        return this.totalExceptions;
    }

    public final void setPath(Path path) {
        this.path = path;
    }
}
