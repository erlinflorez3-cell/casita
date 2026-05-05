package com.biocatch.client.android.sdk.wrappers;

import com.dynatrace.android.callback.Callback;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.util.Map;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\u0015\"4\u0012}\bnjGRL͜P.hS2\u000fq{:řqҕ\"CiTZ\u000b(\u001d_Rug\u0007J\t\fß\u0013\u0006$z+9Oi\ta \u000fJB\u001eBݯQoK=)\u000fD\n82P\u0600*\u0017\u000f BV x\u000bCy\r\"4PrPQ;N3!Z\nL(\u0019\u001e\u000bp\u0017<Vvu:]$I}\u0013Z5_H|{\u0010\u001dÙ3˼za&ѨÑ;@"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G2Di!9MPI5$\u000b{>", "", "Cq[", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "\u001aiPCTuGS(HjK\u0013R", "uKY.i(\b\\\u0019\u000eDN\u0019c^rV", "/o_2a+)O&z\u0003^;|\u0016=", ">`a.`,MS&\r", "", "=oT;66G\\\u0019|\nb6\u0006", "\u001aiPCTuGS(HjK\u0013Z\u00138n\u007f&\u000bD\u000b l", "BnBAe0GU", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class URL {
    private java.net.URL url;

    public URL(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = new java.net.URL(url);
    }

    public URL(java.net.URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
    }

    public final URL appendParameters(Map<String, String> parameters) throws MalformedURLException {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        if (parameters.isEmpty()) {
            return this;
        }
        String string = parameters.toString();
        String strSubstring = string.substring(1, string.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new URL(new java.net.URL(this.url + '?' + StringsKt.replace$default(strSubstring, ", ", "&", false, 4, (Object) null)));
    }

    public final URLConnection openConnection() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.url.openConnection();
        Callback.openConnection(uRLConnectionOpenConnection);
        Intrinsics.checkNotNullExpressionValue(uRLConnectionOpenConnection, "url.openConnection()");
        return uRLConnectionOpenConnection;
    }

    public String toString() {
        String string = this.url.toString();
        Intrinsics.checkNotNullExpressionValue(string, "url.toString()");
        return string;
    }
}
