package com.biocatch.client.android.sdk.web;

import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
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
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012\u000e\u0007njO0L͜P.hS2\u000f\u0002{<řc$\u007fCCU \u007f*\t]]ogtP`ŏYƤ6\u0016'ilLǤ|] \u000fzZ}HKM\u001eGid\u0003A\u001d `&h\u007f\u0013\r2,^\u000f%\u0003\n_T >M\t:\u0001\u0017}\t(\u001d\u001e>N\u0005dp0aDV\u0005eJ33\u0005\u007fA|/\u000e?CaϘJT5\u001d?r,<X=E\u00175S1\u000b\u0001j\u0006\u0017ӭu=\u0013zo79\\\fYLW.\u001cE/]\u0018urT`Ke)\u00125?gcyZT<@\t\n\"T\u0004<\u0010WL<82f6\u0012y\t;YNf\u001a^p\nAu\u0007?3\u0001KGI#vWq=)Ne\u007f3\u0010L%iz1cd\u0014p\u0017+T&U_T\u001fB\u001fݓ\fՒAm\f͏3\u001c8\nHU\u00101\f\u0011\\\u001b5;k;9 \u001a\nvK>ϻ\u0007¾lSqɭ͛D9"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40#UaD\u0011q0]\u00014[\"", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_\u0012?C8\\8\u001e'vN9\u0012m:R\u00061T`$", "u(E", "7mP0g0OS\u000b~wO0|\u001b=", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u001de\u000f}", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "\u001a`]1e6BRb\u0011z[2\u0001\u0018xW\u007f%lD\u0001)l", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a5o\u001d\u0012", "EdQ#\\,Pa", "\u001aiPCTuNb\u001d\u0006DP,x\u000f\u0012a\u000e+c<\fl", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G27j_ M@,o40rrjB\u0007a;R\u00010\u001d", "/cS\u000eV;Bd\u0019pz[\u001d\u0001\tA", "", "EdQ#\\,P", "EdQ#\\,P1#\b\u0004^*\f\r9n", "/cS\u0016a(<b\u001d\u0010zP,yy3e\u0012", "5dc\u000eV;Bd\u0019pz[\u001d\u0001\tAC\n1\u0005@~&\u001bQx\u001c", "", "u(J\u0019V6F\u001d\u0016\u0003\u0005\\(\f\u00072/}/\u007f@\n&`Cx\rI\u0001)4#\f\u001f=7(.J\r-k1\u000f\u0019hs\u0017\u0011l5Nt6KVW\u0002", "5dc\u0016a(<b\u001d\u0010zP,yy3e\u00126", "u(J\u0019T5=`#\u0003y(>|\u00065i\u000fqm@}\b\u001bG\u0002c", "5dc$X)/W\u0019\u0011Xh5\u0006\t-t\u00042\u0005", "@d\\<i,\"\\\u0015|\nb=|z/bp,{R\u000f", "@d\\<i,0S\u0016o~^>", "@db2g\u0019>^#\r~m6\n\u001d", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class WebViewsRepository implements IWebViewsRepository {
    private final WeakHashMap<WebView, WebViewConnection> webViews = new WeakHashMap<>();
    private final HashSet<WeakReference<WebView>> inactiveWebViews = new HashSet<>();

    @Override // com.biocatch.client.android.sdk.web.IWebViewsRepository
    public void addActiveWebView(WebView webView, WebViewConnection webViewConnection) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webViews.put(webView, webViewConnection);
    }

    @Override // com.biocatch.client.android.sdk.web.IWebViewsRepository
    public void addInactiveWebView(WebView webView) {
        Object next;
        Intrinsics.checkNotNullParameter(webView, "webView");
        Iterator<T> it = this.inactiveWebViews.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual(((WeakReference) next).get(), webView)) {
                    break;
                }
            }
        }
        if (next == null) {
            this.inactiveWebViews.add(new WeakReference<>(webView));
        }
    }

    @Override // com.biocatch.client.android.sdk.web.IWebViewsRepository
    public WebViewConnection[] getActiveWebViewConnections() {
        Collection<WebViewConnection> collectionValues = this.webViews.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "this.webViews.values");
        Object[] array = collectionValues.toArray(new WebViewConnection[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (WebViewConnection[]) array;
    }

    @Override // com.biocatch.client.android.sdk.web.IWebViewsRepository
    public WebView[] getInactiveWebViews() {
        HashSet<WeakReference<WebView>> hashSet = this.inactiveWebViews;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = hashSet.iterator();
        while (it.hasNext()) {
            WebView webView = (WebView) ((WeakReference) it.next()).get();
            if (webView != null) {
                arrayList.add(webView);
            }
        }
        Object[] array = arrayList.toArray(new WebView[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (WebView[]) array;
    }

    @Override // com.biocatch.client.android.sdk.web.IWebViewsRepository
    public WebViewConnection getWebViewConnection(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        return this.webViews.get(webView);
    }

    @Override // com.biocatch.client.android.sdk.web.IWebViewsRepository
    public void removeInactiveWebViews() {
        this.inactiveWebViews.clear();
    }

    @Override // com.biocatch.client.android.sdk.web.IWebViewsRepository
    public void removeWebView(WebView webView) {
        Object next;
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.webViews.remove(webView);
        Iterator<T> it = this.inactiveWebViews.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.areEqual(((WeakReference) next).get(), webView)) {
                    break;
                }
            }
        }
        WeakReference weakReference = (WeakReference) next;
        if (weakReference != null) {
            this.inactiveWebViews.remove(weakReference);
        }
    }

    @Override // com.biocatch.client.android.sdk.web.IWebViewsRepository
    public void resetRepository() {
        this.webViews.clear();
        removeInactiveWebViews();
    }
}
