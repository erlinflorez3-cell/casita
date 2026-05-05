package com.biocatch.client.android.sdk.techicalServices;

import com.biocatch.client.android.sdk.core.exceptions.URLFormatException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001e\u007f\u0007lm?ԅD{߉^R\u0002)Op\u00024ż_$\u007fC\u0004a(~:\t}P\u0018k|Mr\u000bq\u0013N$\u0007oDI\u0004|\u000e\u0016\u001d8Zom7\u0014o\u0006In{N\u000761P<*\t\u000f\u001dBH>zAC\u0014\u001c 8XrPQ;Q5\u001e \tV /\"#gߗ:Q"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G/7k\u00192K?BY4+&l_9\u0015-\u001c;]\bKLU+j2\u0006L!\u000eX\u001dX8b", "", "u(E", "3wc?T*M", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G/7k\u00192K?BY4+&l_9\u0015-\u001c;]\bKLU+j(", "Et_ X9OS&ngE", "", "3wc?T*M1|][k6\u0005t?e\r<", "?tT?l", "5dc\u0010<\u000b", "5dc X9OS&ngE", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class URLFieldsExtractor {
    public static final URLFieldsExtractor INSTANCE = new URLFieldsExtractor();

    private URLFieldsExtractor() {
    }

    private final String extractCIDFromQuery(String str) {
        Object[] array = StringsKt.split$default((CharSequence) str, new String[]{"cid="}, false, 0, 6, (Object) null).toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Object[] array2 = StringsKt.split$default((CharSequence) ((String[]) array)[1], new String[]{"&"}, false, 0, 6, (Object) null).toArray(new String[0]);
        Intrinsics.checkNotNull(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return ((String[]) array2)[0];
    }

    private final String getCID(String str) {
        URL url = new URL(str);
        if (url.getQuery() == null) {
            return null;
        }
        String query = url.getQuery();
        Intrinsics.checkNotNullExpressionValue(query, "urlParams.query");
        if (!StringsKt.contains$default((CharSequence) query, (CharSequence) "cid=", false, 2, (Object) null)) {
            return null;
        }
        String query2 = url.getQuery();
        Intrinsics.checkNotNullExpressionValue(query2, "urlParams.query");
        return extractCIDFromQuery(query2);
    }

    private final String getServerURL(String str) {
        String host;
        String str2;
        URL url = new URL(str);
        if (Intrinsics.areEqual(url.getHost(), "")) {
            return null;
        }
        if (Intrinsics.areEqual(url.getAuthority(), "")) {
            host = url.getHost();
            str2 = "urlParams.host";
        } else {
            host = url.getAuthority();
            str2 = "urlParams.authority";
        }
        Intrinsics.checkNotNullExpressionValue(host, str2);
        return Intrinsics.areEqual(url.getProtocol(), "http") ? url.getProtocol() + "://" + host : host;
    }

    public final URLFields extract(String wupServerURL) throws URLFormatException {
        Intrinsics.checkNotNullParameter(wupServerURL, "wupServerURL");
        if (wupServerURL.length() == 0) {
            throw new URLFormatException("Invalid wupServerURL. Parameter is empty", null, 2, null);
        }
        try {
            new URL(wupServerURL);
            String cid = getCID(wupServerURL);
            String serverURL = getServerURL(wupServerURL);
            if (cid == null || cid.length() == 0) {
                throw new URLFormatException("Invalid field. Failed extracting the cid parameter: " + wupServerURL, null, 2, null);
            }
            if (serverURL == null || serverURL.length() == 0) {
                throw new URLFormatException("Invalid field. Failed extracting the address parameter: " + wupServerURL, null, 2, null);
            }
            return new URLFields(cid, serverURL);
        } catch (Exception unused) {
            throw new URLFormatException("Invalid wup server url structure, Failed extracting CID and Address in: " + wupServerURL, null, 2, null);
        }
    }
}
