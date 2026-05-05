package okhttp3.internal;

import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.Cookie;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯV\u001d̉=!4i\bDJc|\u0004O\u00128\u000b4C\u0007\":\u0012\u007fјnjO0L͜P.hS2şs{B-cҕyCQU\"Ԃ*\teNo˧vJp\u000bK\u000f\f\u0016\u0001jBI]xc\u0013\u00172PvG\u074cUoS9ht<\u00058F0\u0600\u0012\u0005/\u0019ZL\u001ev\u0013Cy\u000bB4NqRR;O\u001d6 ßV /\u001d\rk\\6`l\f9_'\u0011lZNUa`\u0001[\u0011^TU\u000f\u000f},0X7c\u001bUW\u0011\u000ej[m\u000bouK\u000e\u0001'U5yweAp\u007fB!Ce\u001bj\u000b(r\u0004\u007fn<+9^{K~\u001eX{\t\r%<2 \u001e;VAE\u001a\u0015\n>7\u0003\u0007k@~\u0017\u000fF\u000e\u0011y6E1\u0018Q9P3hg`i.~;\n\u001d%\u001eQ\u001a\u001f%in&`C6\u0005{_Mi@kJݹ\u000ev"}, d2 = {"/cS\u0015X(=S&ezg0|\u0012>", "\u001anZ5g;I!bazZ+|\u0016=$\\8\u007fG\u007f\u0017$\u001d", "0tX9W,K", ":h]2", "", "<`\\2", "D`[BX", "/o_9l\nH\\\"~xm0\u0007\u0012\u001dp\u007f&", "", "1n];X*MW#\bhi,z", "\u001anZ5g;I!b\\\u0005g5|\u0007>i\n1iK\u0001\u0015l", "Ar[ b*DS(", "\u001aiPCT?\b\\\u0019\u000eDl:\u0004R\u001dSf\u0016\u0006>\u0007\u0017&\u001d", "7r5._3;O\u0017\u0005", "", "1`R5X\u000e>b", "\u001anZ5g;I!bkzl7\u0007\u0012=eU", "1`R5X", "\u001anZ5g;I!b\\v\\/|^", "@d`BX:M", "\u001anZ5g;I!bkzj<|\u0017>;", "1n^8\\,-]\u0007\u000e\bb5~", "1n^8\\,", "\u001anZ5g;I!b\\\u0005h2\u0001\t\u0005", "4na\u001cU:HZ\u0019\u000ezK-zU\u00036O", ">`a@X\nH]\u001f\u0003z", "1ta?X5MB\u001d\u0007zF0\u0004\u00103s", "", "Cq[", "\u001anZ5g;I!ba\nm7l\u00166;", "Adc\u0010b6DW\u0019", "=jWAg7"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String line) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(line, "line");
        return builder.addLenient$okhttp(line);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String name, String value) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return builder.addLenient$okhttp(name, value);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sslSocket, boolean z2) {
        Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        connectionSpec.apply$okhttp(sslSocket, z2);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(request, "request");
        return cache.get$okhttp(request);
    }

    public static final String cookieToString(Cookie cookie, boolean z2) {
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        return cookie.toString$okhttp(z2);
    }

    public static final Cookie parseCookie(long j2, HttpUrl url, String setCookie) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(setCookie, "setCookie");
        return Cookie.Companion.parse$okhttp(j2, url, setCookie);
    }
}
