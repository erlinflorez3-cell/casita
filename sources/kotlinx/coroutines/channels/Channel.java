package kotlinx.coroutines.channels;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.internal.SystemPropsKt;
import kotlinx.coroutines.selects.SelectClause1;
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
@Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&˛\bDZc|\u0004W\u00068\u000b4B\u0005\u0007Bߚ\u0016\t\u000fl?ӄRdx4bU:\u000f2zb$\f*\u0002EKU`|P\n\bMi̐rM"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7tk", "\u0013", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00135b|}:i\u001f7MJ\u0011", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00125W}$Hms1ILDk;s", "\u0014`RAb9R", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public interface Channel<E> extends SendChannel<E>, ReceiveChannel<E> {
    public static final int BUFFERED = -2;
    public static final int CONFLATED = -1;
    public static final String DEFAULT_BUFFER_PROPERTY_NAME = "kotlinx.coroutines.channels.defaultBuffer";
    public static final Factory Factory = Factory.$$INSTANCE;
    public static final int OPTIONAL_CHANNEL = -3;
    public static final int RENDEZVOUS = 0;
    public static final int UNLIMITED = Integer.MAX_VALUE;

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class DefaultImpls {
        public static <E> SelectClause1<E> getOnReceiveOrNull(Channel<E> channel) {
            return ReceiveChannel.DefaultImpls.getOnReceiveOrNull(channel);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0004^T@Va\f\u000f(\u001bw!d6Ut*\u0015\t6\u007f[QrF\u0014\u001cu>Z&B>", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
        @InterfaceC1492Gx
        public static <E> boolean offer(Channel<E> channel, E e2) {
            return SendChannel.DefaultImpls.offer(channel, e2);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0004^T@Va\f\u000f(\u001bw!d6Ut*\u0015\t6\u007fZQgGVrm\u007f\u0014]#F\u0017W_~afWOj}H\u001a\r[SX#{s\u0012\u0005\u001b\u0006@ P\u0002;o'\u0018\bI\u0013D\bF<<pW~@f[|\u000b454I$.\u0011*,J<Z\u0013.-CC,\u000eV)MJib\u000b4\u001ddL7.&sr^\u0010\u0014\u0010;++\u001cM[#I%1\rw\u0011\\\u00026T0.}q\u0004O\u001fr3\u001czi\u000fo%3vb\"\u0005t`O/L&[\u001e`-1 YFKU9M\fhkZ,;\u0014_\rveKtva\u0004'H\\C\"", replaceWith = @ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
        @InterfaceC1492Gx
        public static <E> E poll(Channel<E> channel) {
            return (E) ReceiveChannel.DefaultImpls.poll(channel);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "\u0007K\fGvw\u0016k]Kg\u0004^T2Or[\u001bf\u0014nK\u0019\tKqoW\u000b)Ii`gJVjo\u007f\u0014]#F\u0017W_~afWOj}H\u001a\r[SX#{s\u0012\u0005\u001b\u0006@ P\u0002;o'\u0018\bI\u0013D\bF<<pW~@f[|\u000b454I$.\u0011*,J<Z\u0013.-CC,\u000eV)MJib\u000b4\u001ddL7.&sr^\u0012\n\u00074m\u0002\u001d3iE\u001f+.Aw\u0001]\u0001B\u0004$8\r(\u0005Rd 2\u0011\u0003i\u0015v\u001d2(`g\u0005t\\Q!TkW-\u001a8+eFJ\u0011\u0001CMR'm\u000b4>\r4\u0011l\"|yvVt/JX#&W;\n+Ka,\u000e\u0005\u0019@\u0003SIhEM#)", replaceWith = @ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
        @InterfaceC1492Gx
        public static <E> Object receiveOrNull(Channel<E> channel, Continuation<? super E> continuation) {
            return ReceiveChannel.DefaultImpls.receiveOrNull(channel, continuation);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0005I\u0006>\u00116B\u0005%4\u0012\u0006\u0013nj?2JͣIDɟ\u0004*=j<;*[ҸuEAU(~r\u0015]P\u007fg\u001dM1Ŗ\u0016Ǉ\n\u0016\u0001̓|Uc|u\u0012=5\u0019Ī\u0012ݯQoEʠ1\u0001D\n82P;PڕSʀ.H\u0018͌KOY\u0012*0ns\u0011Ĭ_̂\t\u001a\u001aß\u000f,\u000f%tg|9\u001fǎ0Ơ3#\u000b݃\u0013Z5gH|{\u0016\u001dÝy˼za&Ѩ\u0011IC\u001f=S1\n)ºAƄCwEݛ\u0001)-6W\u007fɷ:e"}, d2 = {"\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E>\u0004\u0013 Po\u0015J@\u00038U\u0007)7tT\u000fIAJuA2j", "", "\nh]6g\u0005", "u(E", "#M;\u0016@\u0010-3w", "", " D=\u00118!/=\tl", "\u0011N=\u0013?\b-3w", "\u0010T5\u00138\u0019\u001e2", "\u001dOC\u0016B\u0015\u001a:\u0013\\]:\u0015eh\u0016", "\u0012D5\u000eH\u0013-Mun[?\fi\u0003\u001aRi\u0013[-o\u000b\u00110Ku\u001c", "", "\u0011G0\u001bA\f%Mw^[:\u001ccw)C[\u0013W\u001ed\u0006\u000b", "5dc\u0010;\b'<xet=\f]d\u001fLn\"Y\u001ckrt+^\u0002z|/D`\u0002)Jg\u00148ZMKz8'\u0015v[7\u0011p,", "u(8", "9nc9\\5Q\u001b\u0017\t\bh<\f\r8e\u000eoyJ\u000e\u0017"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Factory {
        public static final int BUFFERED = -2;
        public static final int CONFLATED = -1;
        public static final String DEFAULT_BUFFER_PROPERTY_NAME = "kotlinx.coroutines.channels.defaultBuffer";
        public static final int OPTIONAL_CHANNEL = -3;
        public static final int RENDEZVOUS = 0;
        public static final int UNLIMITED = Integer.MAX_VALUE;
        static final /* synthetic */ Factory $$INSTANCE = new Factory();
        private static final int CHANNEL_DEFAULT_CAPACITY = SystemPropsKt.systemProp("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        private Factory() {
        }

        public final int getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core() {
            return CHANNEL_DEFAULT_CAPACITY;
        }
    }
}
