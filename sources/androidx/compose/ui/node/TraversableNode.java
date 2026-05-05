package androidx.compose.ui.node;

import kotlin.Metadata;
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
/* JADX INFO: compiled from: TraversableNode.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u0016DLш|\u0004Oي8\u000b4D\u0005\u0007Bߚ\u0016\u000b\u0017jg/|dL~ba*'k*5zӲ&ڱG?m\u001c\u0004$\u0017Rʗf˧ôJ^\u0013E\u0015%Dw̼0NȂ|\\"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9|Ir65f\f\u001c4t\u0016\u0017WB;A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r\u001c4t\u0016\u0017WB;A", "BqPCX9LS~~\u000f", "", "5dc!e(OS&\rzD,\u0011", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\u0011n\\=T5B]\"", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface TraversableNode extends DelegatableNode {
    public static final Companion Companion = Companion.$$INSTANCE;

    Object getTraverseKey();

    /* JADX INFO: compiled from: TraversableNode.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0005Gّ1!Ǟr~P+Jv\b'o?0ǲiH<Rޠ.\u0011"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9|Ir65f\f\u001c4t\u0016\u0017WB;*\u0012(\u001ds]B\u000bm5$", "", "u(E", "\"qPCX9LSw~\t\\,\u0006\b+n\u000f6W>\u0010\u001b!P", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: TraversableNode.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\u0007Gّ/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001͆\rS"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9|Ir65f\f\u001c4t\u0016\u0017WB;*\u0012(\u001ds]B\u000bm5\re4C]N9jRQ=\"\u0010Z\u0017M'\u0016\u0014g\u001d\"}HA(]", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "\u0011n]A\\5NS\b\fvo,\n\u0017+l", "!jX=F<;b&~z:5{f9n\u000f,\u0005P\u0001\u0006$C\u0001\u000eI\u0005!<", "\u0011`]0X3-`\u0015\u0010zk:x\u0010", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public enum TraverseDescendantsAction {
            ContinueTraversal,
            SkipSubtreeAndContinueTraversal,
            CancelTraversal
        }

        private Companion() {
        }
    }
}
