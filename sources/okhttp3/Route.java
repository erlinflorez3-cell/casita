package okhttp3;

import io.sentry.SentryLockReason;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JiP.`\\2\u000fq{<$i*yCAW\"}0\u0015WȞ}˧\u001fJ\t\n\u0004*\u0016\u001a\u0007jDI\u0004ym\u0016\u001d4Zom6]sK=xtd\nڶ6\"F\u007fM\f(*`\u0010%{\nPë\u00160Fz\u0003c\u001bX\u001d\u001a@\u0012n&\u000f+tid5vk$Ɣ/k\twPf'\u000e?CaUQb)%v\u0010!qE˝9\u0015+cK\u000b`lW\u0003m}\u0006\u0010v+?+wx\u001e;ݼ\u0004\u0014\u001b=\u0018\u0013k\u0006>\\3e' w<]ccP<).\u007fԫ\u0011B\f\u05fa\u001e)N.;!7\u0019\u001c5\rr\u0002C\u0007\u0007ެF\u0006\u0003ʨN\u0019+\u0002A3\n,tUy;GSm\u0001˿\u0011$+Ч\u0007#aX\u001ciڦ\u001fi"}, d2 = {"\u001anZ5g;I!bk\u0005n;|^", "", "/cS?X:L", "\u001anZ5g;I!bZy]9|\u0017=;", ">q^El", "\u001aiPCTuGS(Hek6\u0010\u001d\u0005", "AnR8X;\u001aR\u0018\fzl:", "\u001aiPCTuGS(H^g,\fv9c\u0006(\u000b\u001c\u007f\u0016$G}\u001c\u0012", "uK^8[;M^fHV]+\n\t=sU\u000f\u0001<\u0012\u0013`Po\u001d\u0006a2?l\u0012u\u001er\u0012?I\rDkCgxqaHtm*Tv6#KM9\\`\u0001\u0013W\u0003", "u(;<^/Mb$LD:+{\u0016/s\u000e}", "u(;7T=:\u001d\"~\n(\u0017\n\u0013ByU", "u(;7T=:\u001d\"~\n(\u0010\u0006\t>S\n&\u0002@\u0010r\u0016F|\u000eJ\u0005z", "zcT=e,<O(~yX({\b<e\u000e6", "3pd._:", "", "=sW2e", "6`b566=S", "", "zcT=e,<O(~yX7\n\u0013By", "@d`B\\9>a\b\u000f\u0004g,\u0004", "zcT=e,<O(~yX:\u0007\u00075e\u000f\u0004z?\u000e\u0017%U", "BnBAe0GU", "", "=jWAg7"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Route {
    private final Address address;
    private final Proxy proxy;
    private final InetSocketAddress socketAddress;

    public Route(Address address, Proxy proxy, InetSocketAddress socketAddress) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(socketAddress, "socketAddress");
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = socketAddress;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = SentryLockReason.JsonKeys.ADDRESS, imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_address, reason: not valid java name */
    public final Address m10790deprecated_address() {
        return this.address;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "proxy", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m10791deprecated_proxy() {
        return this.proxy;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "0U\u0012:u4)f\u0018])\u0007", replaceWith = @ReplaceWith(expression = "socketAddress", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: -deprecated_socketAddress, reason: not valid java name */
    public final InetSocketAddress m10792deprecated_socketAddress() {
        return this.socketAddress;
    }

    public final Address address() {
        return this.address;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (Intrinsics.areEqual(route.address, this.address) && Intrinsics.areEqual(route.proxy, this.proxy) && Intrinsics.areEqual(route.socketAddress, this.socketAddress)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.address.hashCode()) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        return this.address.sslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    public String toString() {
        return "Route{" + this.socketAddress + AbstractJsonLexerKt.END_OBJ;
    }
}
