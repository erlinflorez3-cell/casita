package com.braze.ui.inappmessage.listeners;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.enums.Channel;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.NewsfeedAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.utils.InAppMessageWebViewClient;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0007nʑA0ZeP\u008cZS8\u001bsڔ<$q$yCAX \u00128ޛm^\u0018g\u001dI\u0013\nSO\tȀ|j:I\u001e\u0017k\u0017'2puo7[vU9\u000f|f\t.;:8(\u000f1\u001e8S(v)O\u0012 ZNN}RR;S5\u001e \rV /&\rk\\?`l\fD_'\u0011tZNUkv\u0011\u0016+Tb?\r%gN/N>M\u0015S[3\u000b`dW\u0003m{m\tv2?+w\u007f\u001eJ!\u001e\"$CO;c#*j\fi`:/[SqTh\u000eV\u0002+\u007f\u001bG\u001c\u000e43\u000fB},t\t&3#t\n\u0001'؟`۰\u0004~y8\u001d(\u000e7ڨ=,"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\rMD7{;-xq=D\u0012K,\\\u0005#IL@,YCv=&oa\u0012N4\u001ck]O3nM7,]", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u00121L\u0017v?\u0006\u0015vo5\tc\u001eNs\u0018KL`\ncVrF#x^\u001c]+\u0016\u0005f\u0017", "u(E", "7m0=c\u0014>a'z|^\u0014x\u0012+g\u007f5", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW\u0019\u0004!JYa)\u0013x!\u0016MQIg6\u001e|dj5\tc9$", "5dc\u0016a\bI^\u0001~\tl(~\t\u0017a\t$}@\u000e", "u(;0b4\bP&z\u0010^u\r\rxi\t$\u0007K\t\u0017%Uk\u0010<@\u0002BU\u0013 \u001bvq9X+;yB\u001a\u0017hI5\u0010_.N\u0004|", "=m29b:>/\u0017\u000e~h5", "", "7m0=c\u0014>a'z|^", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ej", "Cq[", "", "?tT?l\tN\\\u0018\u0006z", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "=m2Bf;H[x\u0010zg;X\u0007>i\n1", "=m=2j:?S\u0019}V\\;\u0001\u00138", "=m>A[,KC&\u0006V\\;\u0001\u00138", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class DefaultInAppMessageWebViewClientListener implements IInAppMessageWebViewClientListener {
    public static final Companion Companion = new Companion(null);
    private static final String HTML_IN_APP_MESSAGE_CUSTOM_EVENT_NAME_KEY = "name";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u0012\u007fјnjO0L͜P.hS2\u000fq{<$q$yّCU(\u0007*ޛUȥh}ñzZ9BO\u000b\u001cx̶0Icx&(\u001d5Zom7}sK>xtd\u000bP60?\u0012\u0005/\"pMX\u0007\tLc\u000e(/nrjV\u001bT\u001d\u001a@\u000e\u0005%I,jqf6vw\u000e>=*\u001bipVmdx\u0013[\u0019^TU\u001a'e,0X7c\u001bUW\u0011\u000ej[m\u000b\u0006v\u000e\u0011v(?+wu.̯+ÿ\u0018\u00153˽վa\u0001"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\rMD7{;-xq=D\u0012K,\\\u0005#IL@,YCv=&oa\u0012N4\u001ck]O3nM7,F\nS\nFd\n\u0010 \u0017\u000b", "", "u(E", "\u0016S<\u0019R\u0010'MtieX\u0014\\v\u001dAa\bu\u001ep\u0005\u00061W\b\u001cg\u0005\u001eHw\t\u0013Uu(3#/", "", ":nV\u0015g4E7\"Z\u0006i\u0014|\u0017=a\u0002(YG\u0005\u0015\u001d", "", "7m0=c\u0014>a'z|^", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ej", "?tT?l\tN\\\u0018\u0006z", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", ">`a@X\nNa(\t\u0003>=|\u0012>N{0{!\u000e!\u001f3\u007f\u000eI\u000b\u0002Eb|'7", ">`a@X\u0017K]$~\bm0|\u0017\u0010r\n0gP\u0001$+$\u007f\u0017;}%", "\u001ab^:\")KO.~Df6{\t6sI2\fO\u0003!\u001bPqW\u0019\u0004!JYh-Ax\u0016;\\G;y\n", ">`a@X\u001cLS\u000b~wO0|\u001b\u0010r\n0gP\u0001$+$\u007f\u0017;}%", "", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void logHtmlInAppMessageClick(IInAppMessage inAppMessage, Bundle queryBundle) {
            Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
            Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
            if (!queryBundle.containsKey(InAppMessageWebViewClient.QUERY_NAME_BUTTON_ID)) {
                if (inAppMessage.getMessageType() == MessageType.HTML_FULL) {
                    inAppMessage.logClick();
                }
            } else {
                IInAppMessageHtml iInAppMessageHtml = (IInAppMessageHtml) inAppMessage;
                String string = queryBundle.getString(InAppMessageWebViewClient.QUERY_NAME_BUTTON_ID);
                if (string != null) {
                    iInAppMessageHtml.logButtonClick(string);
                }
            }
        }

        @JvmStatic
        public final String parseCustomEventNameFromQueryBundle(Bundle queryBundle) {
            Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
            return queryBundle.getString("name");
        }

        @JvmStatic
        public final BrazeProperties parsePropertiesFromQueryBundle(Bundle queryBundle) {
            Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
            BrazeProperties brazeProperties = new BrazeProperties();
            for (String key : queryBundle.keySet()) {
                if (!Intrinsics.areEqual(key, "name")) {
                    String string = queryBundle.getString(key, null);
                    String str = string;
                    if (str != null && !StringsKt.isBlank(str)) {
                        Intrinsics.checkNotNullExpressionValue(key, "key");
                        brazeProperties.addProperty(key, string);
                    }
                }
            }
            return brazeProperties;
        }

        @JvmStatic
        public final boolean parseUseWebViewFromQueryBundle(IInAppMessage inAppMessage, Bundle queryBundle) {
            boolean z2;
            boolean z3;
            boolean z4;
            Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
            Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
            if (queryBundle.containsKey(InAppMessageWebViewClient.QUERY_NAME_DEEPLINK)) {
                z2 = Boolean.parseBoolean(queryBundle.getString(InAppMessageWebViewClient.QUERY_NAME_DEEPLINK));
                z3 = true;
            } else {
                z2 = false;
                z3 = false;
            }
            if (queryBundle.containsKey(InAppMessageWebViewClient.QUERY_NAME_EXTERNAL_OPEN)) {
                z4 = Boolean.parseBoolean(queryBundle.getString(InAppMessageWebViewClient.QUERY_NAME_EXTERNAL_OPEN));
                z3 = true;
            } else {
                z4 = false;
            }
            boolean openUriInWebView = inAppMessage.getOpenUriInWebView();
            if (z3) {
                return (z2 || z4) ? false : true;
            }
            return openUriInWebView;
        }
    }

    private final BrazeInAppMessageManager getInAppMessageManager() {
        return BrazeInAppMessageManager.Companion.getInstance();
    }

    @JvmStatic
    public static final void logHtmlInAppMessageClick(IInAppMessage iInAppMessage, Bundle bundle) {
        Companion.logHtmlInAppMessageClick(iInAppMessage, bundle);
    }

    @JvmStatic
    public static final String parseCustomEventNameFromQueryBundle(Bundle bundle) {
        return Companion.parseCustomEventNameFromQueryBundle(bundle);
    }

    @JvmStatic
    public static final BrazeProperties parsePropertiesFromQueryBundle(Bundle bundle) {
        return Companion.parsePropertiesFromQueryBundle(bundle);
    }

    @JvmStatic
    public static final boolean parseUseWebViewFromQueryBundle(IInAppMessage iInAppMessage, Bundle bundle) {
        return Companion.parseUseWebViewFromQueryBundle(iInAppMessage, bundle);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onCloseAction(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onCloseAction.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageWebViewClientListener.onCloseAction called.";
            }
        }, 7, (Object) null);
        Companion.logHtmlInAppMessageClick(inAppMessage, queryBundle);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(true);
        getInAppMessageManager().getHtmlInAppMessageActionListener().onCloseClicked(inAppMessage, url, queryBundle);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onCloseAction.2
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageWebViewClientListener.onCloseAction finished.";
            }
        }, 7, (Object) null);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onCustomEventAction(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onCustomEventAction.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageWebViewClientListener.onCustomEventAction called.";
            }
        }, 7, (Object) null);
        if (getInAppMessageManager().getActivity() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onCustomEventAction.2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Can't perform custom event action because the activity is null.";
                }
            }, 6, (Object) null);
            return;
        }
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onCustomEventFired(inAppMessage, url, queryBundle)) {
            return;
        }
        Companion companion = Companion;
        String customEventNameFromQueryBundle = companion.parseCustomEventNameFromQueryBundle(queryBundle);
        String str = customEventNameFromQueryBundle;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        BrazeProperties propertiesFromQueryBundle = companion.parsePropertiesFromQueryBundle(queryBundle);
        Activity activity = getInAppMessageManager().getActivity();
        if (activity != null) {
            Braze.Companion.getInstance(activity).logCustomEvent(customEventNameFromQueryBundle, propertiesFromQueryBundle);
        }
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onNewsfeedAction(IInAppMessage inAppMessage, String url, Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onNewsfeedAction.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageWebViewClientListener.onNewsfeedAction called.";
            }
        }, 7, (Object) null);
        if (getInAppMessageManager().getActivity() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onNewsfeedAction.2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Can't perform news feed action because the cached activity is null.";
                }
            }, 6, (Object) null);
            return;
        }
        Companion.logHtmlInAppMessageClick(inAppMessage, queryBundle);
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onNewsfeedClicked(inAppMessage, url, queryBundle)) {
            return;
        }
        inAppMessage.setAnimateOut(false);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
        NewsfeedAction newsfeedAction = new NewsfeedAction(BundleUtils.toBundle(inAppMessage.getExtras()), Channel.INAPP_MESSAGE);
        Activity activity = getInAppMessageManager().getActivity();
        if (activity != null) {
            BrazeDeeplinkHandler.Companion.getInstance().gotoNewsFeed(activity, newsfeedAction);
        }
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onOtherUrlAction(IInAppMessage inAppMessage, final String url, Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onOtherUrlAction.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageWebViewClientListener.onOtherUrlAction called.";
            }
        }, 7, (Object) null);
        if (getInAppMessageManager().getActivity() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onOtherUrlAction.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Can't perform other url action because the cached activity is null. Url: " + url;
                }
            }, 6, (Object) null);
            return;
        }
        Companion companion = Companion;
        companion.logHtmlInAppMessageClick(inAppMessage, queryBundle);
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onOtherUrlAction(inAppMessage, url, queryBundle)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onOtherUrlAction.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "HTML message action listener handled url in onOtherUrlAction. Doing nothing further. Url: " + url;
                }
            }, 6, (Object) null);
            return;
        }
        boolean useWebViewFromQueryBundle = companion.parseUseWebViewFromQueryBundle(inAppMessage, queryBundle);
        Bundle bundle = BundleUtils.toBundle(inAppMessage.getExtras());
        bundle.putAll(queryBundle);
        UriAction uriActionCreateUriActionFromUrlString = BrazeDeeplinkHandler.Companion.getInstance().createUriActionFromUrlString(url, bundle, useWebViewFromQueryBundle, Channel.INAPP_MESSAGE);
        if (uriActionCreateUriActionFromUrlString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onOtherUrlAction.4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "UriAction is null. Not passing any URI to BrazeDeeplinkHandler. Url: " + url;
                }
            }, 6, (Object) null);
            return;
        }
        final Uri uri = uriActionCreateUriActionFromUrlString.getUri();
        if (BrazeFileUtils.isLocalUri(uri)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener.onOtherUrlAction.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Not passing local uri to BrazeDeeplinkHandler. Got local uri: " + uri + " for url: " + url;
                }
            }, 6, (Object) null);
            return;
        }
        inAppMessage.setAnimateOut(false);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
        Activity activity = getInAppMessageManager().getActivity();
        if (activity != null) {
            BrazeDeeplinkHandler.Companion.getInstance().gotoUri(activity, uriActionCreateUriActionFromUrlString);
        }
    }
}
