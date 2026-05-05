package com.biocatch.client.android.sdk.web;

import android.os.Handler;
import android.webkit.WebView;
import com.biocatch.android.commonsdk.configuration.ConfigurationFields;
import com.biocatch.android.commonsdk.configuration.ConfigurationRepository;
import com.biocatch.android.commonsdk.core.Utils;
import com.biocatch.client.android.sdk.core.exceptions.UnsupportedAPIException;
import com.biocatch.client.android.sdk.web.handlers.HybridDataHandler;
import java.lang.ref.WeakReference;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.ZS0\u000fs{J$cҕyCQU\"Ԃ(ޛeȞ\u0018g\u001dI\u001b.S\u0013\u0014\u0016\u0011jZJe|k\u0014'2prO7[sU9\u000fyF\t.8:8(\fв\u001e*V\u0018?\u0007QT$\u0012^J!>`\u0018e\u0005H\u001eVJ.\u00056\\\u0016S\rԢnҺ>/+Ʌ:N\\'w0+NcЂVܮ\u0011viӜ{LE7-%\u0002\u0006]ѻ]ύ\u0007?yܵUt5-CI\"^\rݜ\u0002Џ\u0019+WՕǇv3"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40rrjB\u0007a;R\u00010(HL;f_\u0007\u0013", "", "6`]1_,K", "\u001a`]1e6BRb\t\t(\u000fx\u0012.l\u007f5Q", "6xQ?\\+\u001dO(z]Z5{\u0010/r", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_1IL:r4+#2DM\u0004p0MU#VH1(eQy=!g", "1n]3\\.N`\u0015\u000e~h5i\t:o\u000e,\u000bJ\u000e+", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*@n\u001a0]P7z8(\u001e2?C\u0010d0P\u00074C[R6e?rH\u001e ^\u001dX8!Z", "CsX9f", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*Dm_\u001e\\GBy\n", "uKP;W9HW\u0018H\u0005lu_\u00058d\u0007(\t\u0016g\u0015!O9\u000b@\u0001#1h{#\u0001k\u001d2MLJ50'\u0014uk=\u0006-:M|pYLKu_N{<\u001b\u0012g\u001c\u0018\u000e!\u0002fE#M@F\u001bj(R\u0001Bh\u000ea|\f?r:?Z\u001aEu$sDrdOXl\u0004K@\u000f`4l\u0014i&j9@m\u0012{\"\u001clR>\u0017wb\u0015|[CEqP\u001a~:4KijJOxB<\u007f1-O\u000b\u0002\u001fF.[)~5M1.@b\u0001Ze\u001b\bZ\u0002\u00149fE&o4F\u001bGUl\u0004kDWf)n\bWRD5 s;'9", "1qT.g,\u001c]\"\bz\\;\u0001\u00138", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40rrjB\u0007a;R\u00010\u001d", "EdQ#\\,P", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%lD\u0001)l", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WebViewConnectionFactory {
    private final ConfigurationRepository configurationRepository;
    private final Handler handler;
    private final HybridDataHandler hybridDataHandler;
    private final Utils utils;

    public WebViewConnectionFactory(Handler handler, HybridDataHandler hybridDataHandler, ConfigurationRepository configurationRepository, Utils utils) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(hybridDataHandler, "hybridDataHandler");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(utils, "utils");
        this.handler = handler;
        this.hybridDataHandler = hybridDataHandler;
        this.configurationRepository = configurationRepository;
        this.utils = utils;
    }

    public final WebViewConnection createConnection(WebView webView) throws UnsupportedAPIException {
        Intrinsics.checkNotNullParameter(webView, "webView");
        if (!this.utils.isVersionGreaterOrEqualTo(23)) {
            throw new UnsupportedAPIException("WebViewConnectionFactory Requires API level 23 and above");
        }
        return new WebViewConnection(this.hybridDataHandler, new WeakReference(webView), this.handler, this.utils, webView.getUrl(), this.configurationRepository.getInt(ConfigurationFields.webViewCommunicationReconnectInterval), this.configurationRepository.getInt(ConfigurationFields.slaveKeepAliveInterval));
    }
}
