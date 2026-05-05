package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLш|\u0004O\u000f8é6B\r(4ߚ\u007f\u0007|jA0JgP.`q2\u000f\u0002{<$a%yCIU\"Ԃ*\teNogtJ`oYƤ$()jZH\u000ewoZ5@B\b?aN AGb\r63#b&F}\u001d\u0001H/x\u0014\u0005\u0001[K:\u0015`D~Aj\r{\u0006`6Nb.\t6\\\u0016OfLz_R/Q\u0006\u001aL\\0w6\rO\u001dF\u00032;\u0001\u0012\"9GO5C&\u001a'OniK\u001b? >5l5)CI\"Zfb\u000e!-1_\u000fmrTg3['0oA]qcP<7(~\n\u000fT\u0004<\tWL<=2f6\u001fy\u0019ɪWS"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`2\u007f\u001c?`\"CY\u000b17zk", "", "=m3.g(", "", "Asa2T4\"R", "", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "0xc266N\\(", ":`bA", "=m72T+>`'", "@db=b5LS{~v],\n\u0017", "", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*o\n;v2\u000b", "=mA2d<>a(", "@d`BX:M6\u0019zy^9\u000b", "=mA2f,M", "", "3qa<e\nHR\u0019", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`'|\u001bF\u0004\u0003?X}u", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface PushObserver {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final PushObserver CANCEL = new Companion.PushObserverCancel();

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005\"2ߡx\u001d߿\u001b9^C\u001eG1\u0013X0\u000fө\u007f42[t\u0003Q<m\u001a,$?S%ʼiĔNZ\u0013¼Ǎ\n\u0015ѷn0"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`2\u007f\u001c?`\"CY\u000b17zT\fWKFg=\"\u001fq7", "", "u(E", "\u0011@=\u00108\u0013", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`2\u007f\u001c?`\"CY\u000b17zk", "\u001etb5B)LS&\u0010zk\nx\u0012-e\u0007", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146Ȑ\u0007\":\u0018\u007fјnjO0LeN0ZS8-s{J$c$wDCU(}*ޛWN}gvϺ`\u000bYƤ6\u0016'ilLǤ|] \u000fzh}@KM\u001e?id\u00039\u001d `&h}\u0013\u00062*v\u0016'~QR$\u0012^D!>`\u0015e\u0005H\u0014LRh%,e\u007fNdJ\u001daH2;\u0003\u0018F~1m:\u0015S\u001dHd';\u0003\u0010)[DE=-%\u0002\u0005Mf$[\u0011L\n=3jW+9L\fWd\\0\u001e#9g\u0013mt6\\3]\u000f\u0017m?\u0018yY_&(&\u000b,\u0011J\u0007&\u0006UL^1(w \u000ea\u00079gĜT\u0015"}, d2 = {"\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`2\u007f\u001c?`\"CY\u000b17zT\fWKFg=\"\u001fq $\u0017q/8s5GY_,i0nF\u0012\u0012ac", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`2\u007f\u001c?`\"CY\u000b17zk", "u(E", "=m3.g(", "", "Asa2T4\"R", "", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "0xc266N\\(", ":`bA", "=m72T+>`'", "@db=b5LS{~v],\n\u0017", "", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`*o\n;v2\u000b", "=mA2d<>a(", "@d`BX:M6\u0019zy^9\u000b", "=mA2f,M", "", "3qa<e\nHR\u0019", "\u001anZ5g;I!b\u0003\u0004m,\n\u0012+lI+\u000bO\fc`'|\u001bF\u0004\u0003?X}u", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        private static final class PushObserverCancel implements PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int i2, BufferedSource source, int i3, boolean z2) throws IOException {
                Intrinsics.checkNotNullParameter(source, "source");
                source.skip(i3);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int i2, List<Header> responseHeaders, boolean z2) {
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int i2, List<Header> requestHeaders) {
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int i2, ErrorCode errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            }
        }

        private Companion() {
        }
    }

    boolean onData(int i2, BufferedSource bufferedSource, int i3, boolean z2) throws IOException;

    boolean onHeaders(int i2, List<Header> list, boolean z2);

    boolean onRequest(int i2, List<Header> list);

    void onReset(int i2, ErrorCode errorCode);
}
