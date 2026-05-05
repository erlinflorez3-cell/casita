package kotlin.io.path;

import java.nio.file.Path;
import java.util.Iterator;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4D\u0007\":8\u007f\u0007ls?0Z͜x.\u0001Rj.{\u007fB$s$ DK[(\u007f:\u000beM\u0016f~Ph\u000e[\u0011\u001c\u0015'߽̓MU\u0007ab/@G\bGCO\u007f=gś\u000b53&\tĹDѩ\t\r\"ݒ`\u0012|\u0002QS,\u00146I~D#\u001e[\u00072\u0014\u001c=N\u007fɉ`mVȤ`ncE=/SzPQ?aF{{εТX-\u0015Ǹy 1MECe4a\u0003\u001fR\n@ƄCwEݛ\u0001)-:W\u0004ɷ:i"}, d2 = {"\u001aj^A_0G\u001d\u001d\tDi(\f\fxP{7~)\u000b\u0016\u0017\u001d", "", ">`c5", "\u001aiPCTuGW#H{b3|R\u001aa\u000f+Q", "9dh", ">`a2a;", "uKY.i(\b\\\u001d\tD_0\u0004\txP{7~\u0016g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#*AuC%\u0019q+=\u0011-7J\u0006*\u00117J;_;|<\u0014g\u001e~", "1n]AX5M7(~\bZ;\u0007\u0016", "", "5dc\u0010b5MS\"\u000e^m,\n\u0005>o\r", "u(;7T=:\u001d)\u000e~eu`\u0018/r{7\u0006MV", "Adc\u0010b5MS\"\u000e^m,\n\u0005>o\r", "uKY.i(\bc(\u0003\u0002(\u0010\f\t<a\u000f2\t\u0016D\b", "5dc\u0018X@", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "5dc\u001dT9>\\(", "u(;8b;EW\"H~hu\b\u0005>hI\u0013wO\u0004\u007f!Foc", "5dc\u001dT;A", "u(;7T=:\u001d\"\u0003\u0005(-\u0001\u0010//j$\u000bCV", "9nc9\\5\u0006a(}\u0002b)D\u000e.kQ"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
final class PathNode {
    private Iterator<PathNode> contentIterator;
    private final Object key;
    private final PathNode parent;
    private final Path path;

    public PathNode(Path path, Object obj, PathNode pathNode) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
        this.key = obj;
        this.parent = pathNode;
    }

    public final Iterator<PathNode> getContentIterator() {
        return this.contentIterator;
    }

    public final Object getKey() {
        return this.key;
    }

    public final PathNode getParent() {
        return this.parent;
    }

    public final Path getPath() {
        return this.path;
    }

    public final void setContentIterator(Iterator<PathNode> it) {
        this.contentIterator = it;
    }
}
