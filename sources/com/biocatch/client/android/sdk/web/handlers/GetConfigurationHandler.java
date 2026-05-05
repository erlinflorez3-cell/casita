package com.biocatch.client.android.sdk.web.handlers;

import android.webkit.WebView;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.web.IWebViewService;
import com.biocatch.client.android.sdk.web.WebViewMessageType;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG<LeN/ZS8\u000fsڔ<$q$yCAU Ԃ8ޛ\u007fN\u0016f/]j\u000fQ\u000f\u001e\u0016'k<Mczu\u0012=5Բs?AQ8WGi\r63*b(F\u0005\u001d\u00030)v\u001c'\u0001QX$\u0014F?\u001f@\u0019!\u001e\u0011(\u0012\u001e>N\u0002tմiߑ:Htҗ\u000bA1\b\u0002B|-\u0016\u0005Sֈ\u000fТX+%xg%9H\bA#'k\u00035U2έ\u0005ӭu=\rؒҐ+9"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_1IL:r4+#2C9\u0016A6Ww+I\\[(kV|Fv\u000ec\rU+\u001aZ", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_1IL:r4+#2S9\u0004T0N\t\nCUM3\\_H", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "EdQ#\\,PA\u0019\f\fb*|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_\u0012?C8\\8\u001e'VaF\u0018g*NL", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAv\u00172OSHgC\"\u001fq+\u0017\u0011l-Rx7TH]0f[_=\u001f\u001ch\u0012]5\u001a\u0019/(\"xL\u0001\u001c\f6G}Jf\u0004U\u0014\u00159jyQ \fPx\"\u007fE(2TXeCYAB,\u000eV\f\\\u000e`:L\u0012\u0014~*\u001ffP\u0004Ml", "<`\\2", "", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "6`]1_,&S'\rv`,", "", "EdQ#\\,P", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%lD\u0001)l", ";db@T.>2\u0015\u000ev", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class GetConfigurationHandler implements WebViewHandler {
    private final ConfigurationRepository configurationRepository;
    private final IWebViewService webViewService;

    public GetConfigurationHandler(ConfigurationRepository configurationRepository, IWebViewService webViewService) {
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(webViewService, "webViewService");
        this.configurationRepository = configurationRepository;
        this.webViewService = webViewService;
    }

    @Override // com.biocatch.client.android.sdk.web.handlers.WebViewHandler
    public String getName() {
        return "registerSlave";
    }

    @Override // com.biocatch.client.android.sdk.web.handlers.WebViewHandler
    public void handleMessage(WebView webView, String str) {
        if (webView == null) {
            Log.Companion.getLogger().error("Unable to get configuration for webview. WebView instance is unavailable. Aborting operation");
            return;
        }
        try {
            this.webViewService.sendMessage(webView, WebViewMessageType.UPDATE_SLAVE_CONF, this.configurationRepository.getConfigurationsAsString());
            Log.Companion.getLogger().info("Sent configuration to webView: " + webView.getUrl());
        } catch (Throwable th) {
            Log.Companion.getLogger().error("Failed sending configuration to webview.", th);
        }
    }
}
