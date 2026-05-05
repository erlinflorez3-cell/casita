package com.biocatch.client.android.sdk.web;

import android.os.Build;
import android.webkit.WebView;
import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.client.android.sdk.core.exceptions.UnsupportedAPIException;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{B$cҕyCQU\"}(\tWNupvJ`\fK\u000f\u001c\u0016\u0001̓4Ic\u0005e\u0012\u00154HģU\u074c}ok8!\u0018F\t.2:8(\u0006\u0011\u001e8J(v)F[\u0010 4XphW\u001dQ\u0013 *\u0006l'Ә\"\\uV~VzfR/Q\r\u001aF\\2w0+YSF\u001d5\u001b\u0004y\u001eYJg9#0k\u00035^\"SKE\u007fK\u001dhU6qI<gDh\u0018\u0014C5\u007f\u0013k}>^\u001bP\u000f\u0018m?\u0018\bYa&(&\u0005,\u0013J\u000f&\b=G\\9Jl\u0016 Kv\tRnc2dP\u0014\u0013cL\u0016S\u0015y?\u0002!tgy;GX}{M\u0013,:\u0019nOe\u001b\")\u001b)l\u0010Q_[\u0007Q\u0019Z\u0018]Um2u9̦,˙4G\b\u07fcL\u001d<\u001d=7\n@yܬmɘLDoϸUlvS\u0002RvAxÅ\u0018֖.\t\u0014ɮ\u0015p\u0013mhT\u0007/g۶\u001eΤ\u000b}\u0010ʶا`\u0011"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40\u0003hnJ\u000ba,$", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_\u0012?C8\\8\u001e'VaF\u0018g*NL", "EdQ#\\,P1#\b\u0004^*\f\r9n`$yO\u000b$+", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40rrjB\u0007a;R\u00010(HL;f_\u0007\u0013", "EdQ#\\,Pa\u0006~\u0006h:\u0001\u00189r\u0014", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_\u0012?C8\\8\u001e'vN9\u0012m:R\u00061T`$", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004iIm\u0013w?C8\\8\u001e'FkB\u0010c*]z1P-J*k\\\u007fQixX\u0018Vt\n\tc? }B:h\u00063M\u0002DwJ\b\u001f\rBttA \u001eF\u007f^\bA&2*K_v8EEt8Q\fj'j>I.!\u0006n\u0002fZ6SxW\u001bpN\tej\u0011\u0015\u000471HqZ\u0010Cy]D~0-J\u0002A\u0010<au/v=\u001109:n\u000e\u0015E\"G_|\u0017<i=6*@E\u007f?Vm\u0004pM\u0018u37n\fl=z\u0016ioaD\u001e\u0005``W>`l\u000b;QO<Sw\u001d1O\rAaC\u0013\u0013\u0014$7UXG\"bV]a", "/bc6i(MS\u000b~wO0|\u001b", "", "EdQ#\\,P", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%lD\u0001)l", "/cS$X)/W\u0019\u0011", "7r7FU9BR\u0007\t\u0002n;\u0001\u00138E\t$xG\u0001\u0016", "", "@d\\<i,0S\u0016o~^>", "Ad]1@,La\u0015\u0001z", ";db@T.>B-\nz", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40|hoG\u0003e,=\u000b2G\"", "2`c.", "", "AsP?g\u0010GO\u0017\u000e~o,n\t,V\u0004(\u000eN", "As^=", "CoS.g,!g\u0016\f~]\u001a\u0007\u0010?t\u00042\u0005", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WebViewService implements IWebViewService {
    private final ConfigurationRepository configurationRepository;
    private final Utils utils;
    private final WebViewConnectionFactory webViewConnectionFactory;
    private final IWebViewsRepository webViewsRepository;

    public WebViewService(WebViewConnectionFactory webViewConnectionFactory, IWebViewsRepository webViewsRepository, ConfigurationRepository configurationRepository, Utils utils) {
        Intrinsics.checkNotNullParameter(webViewConnectionFactory, "webViewConnectionFactory");
        Intrinsics.checkNotNullParameter(webViewsRepository, "webViewsRepository");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(utils, "utils");
        this.webViewConnectionFactory = webViewConnectionFactory;
        this.webViewsRepository = webViewsRepository;
        this.configurationRepository = configurationRepository;
        this.utils = utils;
    }

    private final void activateWebView(WebView webView) throws UnsupportedAPIException {
        Log logger = Log.Companion.getLogger();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("Starting communication with webView - %s.", Arrays.copyOf(new Object[]{webView.getUrl()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        logger.info(str);
        WebViewConnection webViewConnectionCreateConnection = this.webViewConnectionFactory.createConnection(webView);
        this.webViewsRepository.addActiveWebView(webView, webViewConnectionCreateConnection);
        webViewConnectionCreateConnection.connect();
    }

    private final boolean isHybridSolutionEnabled() {
        return this.configurationRepository.getBoolean(ConfigurationFields.enableHybridSolution);
    }

    private final void startInactiveWebViews() throws UnsupportedAPIException {
        Log.Companion.getLogger().info("starting communication with inactive webViews.");
        for (WebView webView : this.webViewsRepository.getInactiveWebViews()) {
            activateWebView(webView);
        }
        this.webViewsRepository.removeInactiveWebViews();
    }

    @Override // com.biocatch.client.android.sdk.web.IWebViewService
    public void addWebView(WebView webView) throws UnsupportedAPIException {
        Intrinsics.checkNotNullParameter(webView, "webView");
        if (!this.utils.isVersionGreaterOrEqualTo(23)) {
            Log logger = Log.Companion.getLogger();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("Events will not be collected from webView - %s, since build number %s is not supported by this feature.", Arrays.copyOf(new Object[]{webView.getUrl(), Integer.valueOf(Build.VERSION.SDK_INT)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            logger.info(str);
            return;
        }
        if (!isHybridSolutionEnabled()) {
            this.webViewsRepository.addInactiveWebView(webView);
        } else if (this.webViewsRepository.getWebViewConnection(webView) != null) {
            Log.Companion.getLogger().warning("webView connection already initialized.");
        } else {
            activateWebView(webView);
        }
    }

    @Override // com.biocatch.client.android.sdk.web.IWebViewService
    public void removeWebView(WebView webView) {
        if (!this.utils.isVersionGreaterOrEqualTo(23) || webView == null) {
            return;
        }
        WebViewConnection webViewConnection = this.webViewsRepository.getWebViewConnection(webView);
        Log logger = Log.Companion.getLogger();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("Stopping communication with webView - %s.", Arrays.copyOf(new Object[]{webViewConnection != null ? webViewConnection.getWebViewUrl() : null}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
        logger.info(str);
        if (webViewConnection != null) {
            webViewConnection.destroy();
        }
        this.webViewsRepository.removeWebView(webView);
    }

    @Override // com.biocatch.client.android.sdk.web.IWebViewService
    public void sendMessage(WebView webView, WebViewMessageType webViewMessageType, String str) {
        Log logger = Log.Companion.getLogger();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Intrinsics.checkNotNull(webView);
        String str2 = String.format("Sending msg with type - %s to webView - %s.", Arrays.copyOf(new Object[]{webViewMessageType, webView.getUrl()}, 2));
        Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
        logger.info(str2);
        WebViewConnection webViewConnection = this.webViewsRepository.getWebViewConnection(webView);
        if (webViewConnection != null) {
            webViewConnection.sendMessage(webViewMessageType, str);
        }
    }

    @Override // com.biocatch.client.android.sdk.web.IWebViewService
    public void stop() {
        if (this.utils.isVersionGreaterOrEqualTo(23)) {
            Log.Companion.getLogger().info("Stopping all active web views.");
            for (WebViewConnection webViewConnection : this.webViewsRepository.getActiveWebViewConnections()) {
                if (webViewConnection != null) {
                    webViewConnection.destroy();
                }
            }
            this.webViewsRepository.resetRepository();
        }
    }

    @Override // com.biocatch.client.android.sdk.web.IWebViewService
    public void updateHybridSolution() throws UnsupportedAPIException {
        if (isHybridSolutionEnabled()) {
            Log.Companion.getLogger().info("hybridSolution turned on.");
            startInactiveWebViews();
        } else {
            Log.Companion.getLogger().info("hybridSolution turned off.");
            stop();
        }
    }
}
