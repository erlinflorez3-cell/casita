package okhttp3;

import java.io.IOException;
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
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeNóɠR@ş\n\u0002d$\n#*BA\u001e4\f\"!Qdf\u0016oz`\u0019E'\b,w\u0019/yY\u0007a*\u000f`G6cݵQv"}, d2 = {"\u001anZ5g;I!bZ\u000bm/|\u0012>i}$\u000bJ\u000el", "", "/tc5X5MW\u0017z\n^", "\u001anZ5g;I!bkzj<|\u0017>;", "@ndAX", "\u001anZ5g;I!bk\u0005n;|^", "@db=b5LS", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "\u0011n\\=T5B]\"", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface Authenticator {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final Authenticator NONE = new Companion.AuthenticatorNone();
    public static final Authenticator JAVA_NET_AUTHENTICATOR = new okhttp3.internal.authenticator.JavaNetAuthenticator(null, 1, 0 == true ? 1 : 0);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#2ߡx\u001d߿\u001b9^C\u001eG2\u0013X0\u000fө\u007f42[t\u0003Q<m\u001a,$?S%ʼiĔNZ\u0013¼Ǎ\n\u0015I{:Lmx\f\u0014E6\u0019īAݯQoEʠƄx5ӵ$7"}, d2 = {"\u001anZ5g;I!bZ\u000bm/|\u0012>i}$\u000bJ\u000eUtQw\u00198\u007f)?bS", "", "u(E", "\u0018@E\u000eR\u0015\u001eB\u0013ZjM\u000f\\q\u001eI]\u0004j*m", "\u001anZ5g;I!bZ\u000bm/|\u0012>i}$\u000bJ\u000el", "\u001cN=\u0012", "\u000ftc5X5MW\u0017z\nh9e\u00138e", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜N.hݷZ\u000f\u001azt'Ӯ(qQ;\u001e4\f#!Qdf\u0016pz`\u0019F'\b,w\u00190yY\u0007b*\u000f`H6SݵQv"}, d2 = {"\u001anZ5g;I!bZ\u000bm/|\u0012>i}$\u000bJ\u000eUtQw\u00198\u007f)?b<{G|\u0019.VR?i0-\u001fuJC\u0010c\u0002", "\u001anZ5g;I!bZ\u000bm/|\u0012>i}$\u000bJ\u000el", "u(E", "/tc5X5MW\u0017z\n^", "\u001anZ5g;I!bkzj<|\u0017>;", "@ndAX", "\u001anZ5g;I!bk\u0005n;|^", "@db=b5LS", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        private static final class AuthenticatorNone implements Authenticator {
            @Override // okhttp3.Authenticator
            public Request authenticate(Route route, Response response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return null;
            }
        }

        private Companion() {
        }
    }

    Request authenticate(Route route, Response response) throws IOException;
}
