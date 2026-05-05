package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001a6B\u0015\"4\u0012}\u0007njGPLe^.ZS0\u0011s{B-c$wDAڦ\u001a\u0014̝9O|f(sPZŲG\u000f\u0014\u0016A\u0002:Sm~m\u0014\u001f2prm5}sKDxtd\u0011ڶ6\"F\u0007M\u0013(8`\u0016\u0007|SK:\u0019^F!>`\u0018e\u0005H\u001eVR.\u00026bwPFH\u001b`h1yɈkŌR)g0\u000bQ]Xb,%|q ;@e<C+*\u038b\tқ_?\u000bӊBQ\u0013p?-;K\u0004Wd[.\u0016kۃQոat.\\\u0013U1\u001e54gi[R\u001e(&\u0002*\u0013\u0013ǌ\u0010Ν+H6Ʀըj\u0017"}, d2 = {"\u001aj^A_0G\u001d\u001d\tDi(\f\fxL\u00041\u0002!\u000b\u001e\u001eQ\u0002\u0012Exz", "", "u(E", "4n[9b>%W\"\u0005di;\u0001\u00138", "", "\u001aiPCTuGW#H{b3|R\u0016i\t.eK\u0010\u001b!PE", ")KY.i(\b\\\u001d\tD_0\u0004\txL\u00041\u0002*\f&\u001bQxc", "4n[9b>/W'\u0003\nH7\f\r9n", "", "\u001aiPCTuGW#H{b3|R\u0010i\u0007(lD\u000f\u001b&1z\u001d@\u0001.\u000b", "<nU<_3He\u007f\u0003\u0004d\u0016\b\u00183o\t", "<nU<_3He\n\u0003\tb;f\u0014>i\n1", "Bn;6a2(^(\u0003\u0005g:", "4n[9b>%W\"\u0005\t", "", "uY\u0018(?1:d\u0015H\u0004b6F\n3l\u007fqbD\n\u001d\u0001R~\u0012F\u007fz", "BnE6f0M=$\u000e~h5\u000b", "9nc9\\5\u0006a(}\u0002b)D\u000e.kQ"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class LinkFollowing {
    public static final LinkFollowing INSTANCE = new LinkFollowing();
    private static final LinkOption[] nofollowLinkOption = {LinkOption.NOFOLLOW_LINKS};
    private static final LinkOption[] followLinkOption = new LinkOption[0];
    private static final Set<FileVisitOption> nofollowVisitOption = SetsKt.emptySet();
    private static final Set<FileVisitOption> followVisitOption = SetsKt.setOf(FileVisitOption.FOLLOW_LINKS);

    private LinkFollowing() {
    }

    public final LinkOption[] toLinkOptions(boolean z2) {
        return z2 ? followLinkOption : nofollowLinkOption;
    }

    public final Set<FileVisitOption> toVisitOptions(boolean z2) {
        return z2 ? followVisitOption : nofollowVisitOption;
    }
}
