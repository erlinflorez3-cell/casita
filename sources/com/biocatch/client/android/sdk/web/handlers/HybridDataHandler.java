package com.biocatch.client.android.sdk.web.handlers;

import android.webkit.WebView;
import com.biocatch.android.commonsdk.logging.Log;
import java.util.Arrays;
import java.util.HashMap;
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
@Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b<N\u0007\"B\u0012\u007f\u0007ljA0ReP.XV2\u000f\u0002{<$a%wّQ٥J}P\b\u0010eww|Jr\u0017S\u0011\u0016\u0016'l<Kex\f\u0015=3Բs?AQ8IGe\r63&b&F\u0001\u001d\u0001H-\u0011 \u0005\u0003[M\"\u0011^C!>`\u0016e\u0005H\u0014L>h\u001f,f\u007fNdN\u001dcH:;\u0005\u007fA|3\u00104\u000bZ%F\u0003)=zo,C@e7e=a\u0003\u001f^kA\u0013? ?\u0015j7'YL\"X\rݜ\u0002Џ\u0019+WՕǇv5"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_1IL:r4+#2DM\u0004p0MU#VH1(eQy=!g", "", "6`]1_,Ka", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_1IL:r4+#2S9\u0004T0N\t\nCUM3\\_H", "uKY.i(\bc(\u0003\u0002(\u000fx\u00172M{3Q\u0004q", "/cS\u0015T5=Z\u0019\f", "", "6`]1_,K", "5dc\u0015T5=Z\u0019\f", "<`\\2", "6`]1_,\u001dO(z[k6\u0005z/b", "EdQ#\\,P", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%lD\u0001)l", ";rV!l7>", "@`f\u0011T;:", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class HybridDataHandler {
    private final HashMap<String, WebViewHandler> handlers;

    public HybridDataHandler(HashMap<String, WebViewHandler> handlers) {
        Intrinsics.checkNotNullParameter(handlers, "handlers");
        this.handlers = handlers;
    }

    private final WebViewHandler getHandler(String str) {
        WebViewHandler webViewHandler;
        if (!Intrinsics.areEqual(str, "undefined")) {
            if (this.handlers.containsKey(str)) {
                webViewHandler = this.handlers.get(str);
            } else if (Intrinsics.areEqual(str, "changeContextCommand")) {
                webViewHandler = this.handlers.get("dummyHandler");
            } else {
                Log.Companion.getLogger().error("no event handler for event name " + str);
            }
            return webViewHandler;
        }
        Log.Companion.getLogger().error("no event name parameter for WebView message");
        return null;
    }

    public final void addHandler(WebViewHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        String name = handler.getName();
        if (this.handlers.containsKey(handler.getName())) {
            Log.Companion.getLogger().warning("error adding webview handler: " + name);
        } else {
            this.handlers.put(handler.getName(), handler);
        }
    }

    public final void handleDataFromWeb(WebView webView, String msgType, String rawData) {
        Intrinsics.checkNotNullParameter(msgType, "msgType");
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        try {
            Log.Companion companion = Log.Companion;
            Log logger = companion.getLogger();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("received message from web %s => %s", Arrays.copyOf(new Object[]{msgType, rawData}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            logger.debug(str);
            WebViewHandler handler = getHandler(msgType);
            if (handler == null) {
                return;
            }
            Log logger2 = companion.getLogger();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format("invoking handler %s with %s", Arrays.copyOf(new Object[]{handler.getName(), rawData}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
            logger2.debug(str2);
            handler.handleMessage(webView, rawData);
        } catch (Throwable th) {
            Log.Companion companion2 = Log.Companion;
            Log logger3 = companion2.getLogger();
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String str3 = String.format("error handling WebView message with message type - %s", Arrays.copyOf(new Object[]{msgType}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(format, *args)");
            logger3.error(str3, th);
            Log logger4 = companion2.getLogger();
            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
            String str4 = String.format("message data: %s", Arrays.copyOf(new Object[]{rawData}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "format(format, *args)");
            logger4.debug(str4, th);
        }
    }
}
