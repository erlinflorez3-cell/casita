package com.biocatch.client.android.sdk.web;

import android.webkit.WebView;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.`b2\u000fq\u0002:\u0003qҕ\"CiTb\u00160\tgN\u0016h\u001fNh\r[\u000f4\u0019)p:Mmzs\u0011=7\t\u0014\bA[uU9\u000fuf\t.4:8(\bG>r[\u001e}\u0013K[\u0010\"2VohW;UK>Ū\n>.\nfmuXNN|_J/Q\u0006\u0018J\u0015Kۢ4|[\u0018\u000fd5\u0019\u000fc4*n<e\u00193U\u001b\u0007\u0001^\u0006'\bwK\u0012\u0001'U,\u0010\u0018 Df\u000e,\u0015YP=a\u0001(t\u0005\u007fcRKsUqZh\u000eVxA ɇ@\u0014"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_\u0012?C8\\8\u001e'vN9\u0012m:R\u00061T`$", "", "/cS\u000eV;Bd\u0019pz[\u001d\u0001\tA", "", "EdQ#\\,P", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%lD\u0001)l", "EdQ#\\,P1#\b\u0004^*\f\r9n", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40rrjB\u0007a;R\u00010\u001d", "/cS\u0016a(<b\u001d\u0010zP,yy3e\u0012", "5dc\u000eV;Bd\u0019pz[\u001d\u0001\tAC\n1\u0005@~&\u001bQx\u001c", "", "u(J\u0019V6F\u001d\u0016\u0003\u0005\\(\f\u00072/}/\u007f@\n&`Cx\rI\u0001)4#\f\u001f=7(.J\r-k1\u000f\u0019hs\u0017\u0011l5Nt6KVW\u0002", "5dc\u0016a(<b\u001d\u0010zP,yy3e\u00126", "u(J\u0019T5=`#\u0003y(>|\u00065i\u000fqm@}\b\u001bG\u0002c", "5dc$X)/W\u0019\u0011Xh5\u0006\t-t\u00042\u0005", "@d\\<i,\"\\\u0015|\nb=|z/bp,{R\u000f", "@d\\<i,0S\u0016o~^>", "@db2g\u0019>^#\r~m6\n\u001d", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public interface IWebViewsRepository {
    void addActiveWebView(WebView webView, WebViewConnection webViewConnection);

    void addInactiveWebView(WebView webView);

    WebViewConnection[] getActiveWebViewConnections();

    WebView[] getInactiveWebViews();

    WebViewConnection getWebViewConnection(WebView webView);

    void removeInactiveWebViews();

    void removeWebView(WebView webView);

    void resetRepository();
}
