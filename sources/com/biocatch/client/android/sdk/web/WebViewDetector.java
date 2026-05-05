package com.biocatch.client.android.sdk.web;

import android.view.View;
import android.webkit.WebView;
import com.biocatch.android.commonsdk.logging.Log;
import com.biocatch.android.commonsdk.technicalServices.events.EventBusService;
import com.biocatch.client.android.sdk.core.exceptions.InvalidOperationException;
import com.biocatch.client.android.sdk.events.ViewsDetectedEvent;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG9L͜P.`S2şs{J$c$wFCU0}*\tUQm˧\u0005Ϻ\u000b\u000bq\u000e>\u0015\r+?YY\u0007]*\u000f`C\u007fCAO\b=gcҽ:\u0005.6jK\b\f\u0019\u001aXP@z\tLc\f@:\u0007\u0081ĐV\rS\u0010b%\u0014J8\u0001Ld\u0018RDQ\u0005]h9iɅݦFN-lx\u0010[\u001b^TU\u0015'e,:X7c%kRΫ\u000bRaPKC\u007fO\u001dhU/sM\u0002jNX.\u001ce7]\rurT][ĬbВ++WҪ\u001c\\\u001c-\u0010z*\u0013\u0013ǌ\u001aΝ+H6Ʀjr\u0016\u0010Kt!V\u0017Г\u0004ެF\u007f\u0003ʨِ\u001b:"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40shp9\u0005r6[L", "", "3uT;g\tNa\u0007~\bo0z\t", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#\r 5p\u001f2K?BY4+&l_9\u0015-,_v0VZ\u0018\fmR{Lp\"h{N8\u001e\tWAy", "EdQ#\\,PA\u0019\f\fb*|", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_\u0012?C8\\8\u001e'VaF\u0018g*NL", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G/7k\u00197QA7r\"\u001e\"ye7\u0007quN\b'P[\\u<crF#nj\u001c<+\u001a\u0016]?$D+5)\u0010uF\u0006Ef|\u001b\u0014\u0011~hwFV\u0019VC\u0011~@6rJX)\bFG\u000ft*aUC\u000f\\7+(\u0014\u0004\u0007\u001bua2\b{)Tc", "7rBAT9MS\u0018", "", "/sc.V/", "", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "/sc.V/|a\u0018\u0005t,&J\u0003y_SuL:\u000e\u0017\u001eGk\u001c<", "2dc.V/", "2dc.V/|a\u0018\u0005t,&J\u0003y_SuL:\u000e\u0017\u001eGk\u001c<", "6`]1_,", "3uT;g", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G Hm\u001f=[\r,o40#GaH\u0007a;Nu\u0007XLW;2", "6`]1_,|a\u0018\u0005t,&J\u0003y_SuL:\u000e\u0017\u001eGk\u001c<", "AsP?g", "As^=", "%dQ#\\,PA(z\n^\u0013\u0001\u0017>e\t(\t", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WebViewDetector {
    private final EventBusService eventBusService;
    private boolean isStarted;
    private final IWebViewService webViewService;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lj?ӅF{߉^R\u0002)Onڷ8$i$:QIV2}P\u000b\u007fRuj\u0007J\t\u000f\n#N$\u0007oDI\u0004z\u000e\u0016\u001d5Zom7\u0014\u0004\u07b2=f"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40shp9\u0005r6[5\u0019GI?0\\d`L\u0010!ZtR9\u001c\u0005bA1D", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feI\\&&Cm\u0011*\u0006!DY[#3v\u0018.4GIz4'\u0015u7", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004iIm\u0013w?C8\\8\u001e'GaH\u0007a;X\u0004|\u000b=", "=mE6X>\u001ab(zxa,{w9W\u00041zJ\u0013", "", "D", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "=mE6X>\u001dS(zxa,{i<o\b\u001a\u007fI\u007f!)", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
    public final class WebViewStateListener implements View.OnAttachStateChangeListener {
        public WebViewStateListener() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v2) {
            Intrinsics.checkNotNullParameter(v2, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v2) {
            Intrinsics.checkNotNullParameter(v2, "v");
            WebViewDetector.this.detach$sdk_3_3_0_936_release(v2);
            v2.removeOnAttachStateChangeListener(this);
        }
    }

    public WebViewDetector(EventBusService eventBusService, IWebViewService webViewService) {
        Intrinsics.checkNotNullParameter(eventBusService, "eventBusService");
        Intrinsics.checkNotNullParameter(webViewService, "webViewService");
        this.eventBusService = eventBusService;
        this.webViewService = webViewService;
    }

    public final void attach$sdk_3_3_0_936_release(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof WebView) {
            Log.Companion.getLogger().debug("Attaching to WebView");
            this.webViewService.addWebView((WebView) view);
            view.addOnAttachStateChangeListener(new WebViewStateListener());
        }
    }

    public final void detach$sdk_3_3_0_936_release(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view instanceof WebView) {
            Log.Companion.getLogger().debug("Detaching from WebView");
            this.webViewService.removeWebView((WebView) view);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void handle$sdk_3_3_0_936_release(ViewsDetectedEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Iterator<View> it = event.getViews().iterator();
        while (it.hasNext()) {
            attach$sdk_3_3_0_936_release(it.next());
        }
    }

    public final void start() {
        if (this.isStarted) {
            Log.Companion.getLogger().error("WebView detector is already started. Aborting the start operation.");
            throw new InvalidOperationException("WebView detector is already started. Aborting the start operation.");
        }
        this.eventBusService.subscribe(this);
        this.isStarted = true;
    }

    public final void stop() {
        this.eventBusService.unsubscribe(this);
        this.isStarted = false;
    }
}
