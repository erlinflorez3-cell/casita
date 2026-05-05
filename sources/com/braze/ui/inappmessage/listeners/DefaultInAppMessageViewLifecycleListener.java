package com.braze.ui.inappmessage.listeners;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.Channel;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeFunctionNotImplemented;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.support.WebContentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.NewsfeedAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.InAppMessageCloser;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0007nʑA0ZeP.XS2\u000f\u0002{<$a&yCQU\"Ԃ*\teNo˧vJp\u000bK\u000f\f\u0018\u0001jBI]ތe\u0012%2JģG3[xE9fv<\u00196݅R8(\u0004A\u001dݵL\u0010\u0005z\fY\u001a\u0017H@\u001f@\u0003\u0011[\f2\u00124Ff\u0015fruWNH\u001bcj31\r\u0002B|2\u00104\u000bT%F\u0003/S\u000b*49LO5C+\u0004\u0007\u0015\\s?1J\"A\u0013o?'YQ:k~n\u000e!-+}\u0013\u000ev4f\u001dQ\u000f\u0017W/]jcP<0>\u000fD+J\u0012&\u0006UN^1(u \u000ea\u0005#WNa\u001a^p\u0012+eD*=\u007fa?\u007f//ooP1Ne\u00025\u0011,2\u0019nOk\u0005\u0012n\u001f3T&\\aUND`N8a\u0004\u0002L\u0007p\u0018B\u0004^M03\n\u001bF\u0017SB\f=1(\u0004\u0002vL.\u000bM\u0011vj\u0002RvFRr$OB\t:sth\u0013rhT\u00074AQ*c\u001f}6#Pb\u0006V9'&M}\u0004\u001an[y\"%]\u0004}Y7\n\u001cuQ^a;\u0002g\u001erjvBQlf\u0013_~B\u0002\u0014\u000b`61JH\u0019 >{\rd\u001a2J? \"d0? t\u0015v\u000bNFO\f!_\txV~\u001d92#\u0002$#\u000fGP-\u0003}h\u0011IZ~\u0017b\u0004ێSڤ\u001d*m$n7\u000b'Ƚ\u0003\u0015"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\rMD7{;-xq=D\u0012K,\\\u0005#IL?0\\dYA\u0015\u0012X\"L2\rk]O3nM7,]", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWCz3DY\u0007 D{_\u00121L\u0017v?\u0006\u0015vo5\tc\u001dRv9.PO,ZfpD\u0014x^\u001c]+\u0016\u0005f\u0017", "u(E", "7m0=c\u0014>a'z|^\u0014x\u0012+g\u007f5", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW\u0019\u0004!JYa)\u0013x!\u0016MQIg6\u001e|dj5\tc9$", "5dc\u0016a\bI^\u0001~\tl(~\t\u0017a\t$}@\u000e", "u(;0b4\bP&z\u0010^u\r\rxi\t$\u0007K\t\u0017%Uk\u0010<@\u0002BU\u0013 \u001bvq9X+;yB\u001a\u0017hI5\u0010_.N\u0004|", "/ec2e\nE]'~y", "", "7m0=c\u0014>a'z|^", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ej", "/ec2e\u0016IS\"~y", "7m0=c\u0014>a'z|^\u001d\u0001\tA", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "0dU<e,\u001cZ#\rz]", "0dU<e,(^\u0019\bz]", "=m1Bg;H\\v\u0006~\\2|\b", "7m0=c\u0014>a'z|^\n\u0004\u0013=e\r", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoW \u007f\u0001@de E{\u00120M!BuB\u001e\">", ";db@T.>0)\u000e\nh5", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~A}.Ei\u0018.*SJz>'j", "7m0=c\u0014>a'z|^\u0010\u0005\u0011/r\u000e,\r@", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001expi9\u0014q0_v|", "=m29\\*DS\u0018", "=m36f4Ba'~y", ">da3b9F1 \u0003xd\bz\u00183o\t", "1kX0^\b<b\u001d\t\u0004", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u0013`\u0002\u001e=I\u0014=QMDA", "1kX0^\u001cKW", "\u001a`]1e6BRb\bzmul\u00163;", "=oT;H9B7\"pz[=\u0001\tA", "", ">da3b9F7\"Z\u0006i\u0014|\u0017=a\u0002(XP\u0010&!PM\u0015@t+5X", ">da3b9F7\"Z\u0006i\u0014|\u0017=a\u0002(YG\u0005\u0015\u001dGn", "AsP?g\nES\u0015\f]m4\u0004l8A\u000b3c@\u000f%\u0013IoiJ\u0005%Dgl#Dm\u0012-", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class DefaultInAppMessageViewLifecycleListener implements IInAppMessageViewLifecycleListener {

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClickAction.values().length];
            try {
                iArr[ClickAction.NEWS_FEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClickAction.URI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClickAction.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C10611(Continuation<? super C10611> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C10611(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Activity activity = BrazeInAppMessageManager.Companion.getInstance().getActivity();
            if (activity != null) {
                BrazeFileUtils.deleteFileOrDirectory(WebContentUtils.getHtmlInAppMessageAssetCacheDirectory(activity));
            }
            return Unit.INSTANCE;
        }
    }

    private final BrazeInAppMessageManager getInAppMessageManager() {
        return BrazeInAppMessageManager.Companion.getInstance();
    }

    private final void performClickAction(ClickAction clickAction, IInAppMessage iInAppMessage, InAppMessageCloser inAppMessageCloser, Uri uri, boolean z2) {
        Activity activity = getInAppMessageManager().getActivity();
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.performClickAction.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Can't perform click action because the cached activity is null.";
                }
            }, 6, (Object) null);
            return;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[clickAction.ordinal()];
        if (i2 == 1) {
            inAppMessageCloser.close(false);
            BrazeDeeplinkHandler.Companion.getInstance().gotoNewsFeed(activity, new NewsfeedAction(BundleUtils.toBundle(iInAppMessage.getExtras()), Channel.INAPP_MESSAGE));
            return;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                inAppMessageCloser.close(false);
                return;
            } else {
                inAppMessageCloser.close(iInAppMessage.getAnimateOut());
                return;
            }
        }
        inAppMessageCloser.close(false);
        if (uri == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.performClickAction.2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "clickUri is null, not performing click action";
                }
            }, 7, (Object) null);
            return;
        }
        UriAction uriActionCreateUriActionFromUri = BrazeDeeplinkHandler.Companion.getInstance().createUriActionFromUri(uri, BundleUtils.toBundle(iInAppMessage.getExtras()), z2, Channel.INAPP_MESSAGE);
        Context applicationContext = getInAppMessageManager().getApplicationContext();
        if (applicationContext == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.performClickAction.3
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "appContext is null, not performing click action";
                }
            }, 7, (Object) null);
        } else {
            BrazeDeeplinkHandler.Companion.getInstance().gotoUri(applicationContext, uriActionCreateUriActionFromUri);
        }
    }

    private final void performInAppMessageButtonClicked(MessageButton messageButton, IInAppMessage iInAppMessage, InAppMessageCloser inAppMessageCloser) {
        performClickAction(messageButton.getClickAction(), iInAppMessage, inAppMessageCloser, messageButton.getUri(), messageButton.getOpenUriInWebview());
    }

    private final void performInAppMessageClicked(IInAppMessage iInAppMessage, InAppMessageCloser inAppMessageCloser) {
        performClickAction(iInAppMessage.getClickAction(), iInAppMessage, inAppMessageCloser, iInAppMessage.getUri(), iInAppMessage.getOpenUriInWebView());
    }

    private final void startClearHtmlInAppMessageAssetsThread() {
        BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new C10611(null), 3, null);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void afterClosed(IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.afterClosed.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.afterClosed called.";
            }
        }, 7, (Object) null);
        getInAppMessageManager().resetAfterInAppMessageClose();
        if (inAppMessage instanceof IInAppMessageHtml) {
            startClearHtmlInAppMessageAssetsThread();
        }
        inAppMessage.onAfterClosed();
        getInAppMessageManager().getInAppMessageManagerListener().afterInAppMessageViewClosed(inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void afterOpened(View inAppMessageView, IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.afterOpened.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.afterOpened called.";
            }
        }, 7, (Object) null);
        getInAppMessageManager().getInAppMessageManagerListener().afterInAppMessageViewOpened(inAppMessageView, inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void beforeClosed(View inAppMessageView, IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        getInAppMessageManager().getInAppMessageManagerListener().beforeInAppMessageViewClosed(inAppMessageView, inAppMessage);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.beforeClosed.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.beforeClosed called.";
            }
        }, 7, (Object) null);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void beforeOpened(View inAppMessageView, IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        getInAppMessageManager().getInAppMessageManagerListener().beforeInAppMessageViewOpened(inAppMessageView, inAppMessage);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.beforeOpened.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.beforeOpened called.";
            }
        }, 7, (Object) null);
        inAppMessage.logImpression();
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onButtonClicked(InAppMessageCloser inAppMessageCloser, MessageButton messageButton, IInAppMessageImmersive inAppMessageImmersive) {
        boolean zOnInAppMessageButtonClicked;
        Intrinsics.checkNotNullParameter(inAppMessageCloser, "inAppMessageCloser");
        Intrinsics.checkNotNullParameter(messageButton, "messageButton");
        Intrinsics.checkNotNullParameter(inAppMessageImmersive, "inAppMessageImmersive");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.onButtonClicked.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.onButtonClicked called.";
            }
        }, 7, (Object) null);
        inAppMessageImmersive.logButtonClick(messageButton);
        try {
            zOnInAppMessageButtonClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageButtonClicked(inAppMessageImmersive, messageButton, inAppMessageCloser);
        } catch (BrazeFunctionNotImplemented unused) {
            zOnInAppMessageButtonClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageButtonClicked(inAppMessageImmersive, messageButton);
        }
        if (zOnInAppMessageButtonClicked) {
            return;
        }
        performInAppMessageButtonClicked(messageButton, inAppMessageImmersive, inAppMessageCloser);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onClicked(InAppMessageCloser inAppMessageCloser, View inAppMessageView, IInAppMessage inAppMessage) {
        boolean zOnInAppMessageClicked;
        Intrinsics.checkNotNullParameter(inAppMessageCloser, "inAppMessageCloser");
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.onClicked.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.onClicked called.";
            }
        }, 7, (Object) null);
        inAppMessage.logClick();
        try {
            zOnInAppMessageClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageClicked(inAppMessage, inAppMessageCloser);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$onClicked$wasHandled$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Deprecated onInAppMessageClicked(inAppMessage, inAppMessageCloser) called.";
                }
            }, 7, (Object) null);
        } catch (BrazeFunctionNotImplemented unused) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$onClicked$wasHandled$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Using non-deprecated onInAppMessageClicked(inAppMessage)";
                }
            }, 7, (Object) null);
            zOnInAppMessageClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageClicked(inAppMessage);
        }
        if (zOnInAppMessageClicked) {
            return;
        }
        performInAppMessageClicked(inAppMessage, inAppMessageCloser);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onDismissed(View inAppMessageView, IInAppMessage inAppMessage) {
        Intrinsics.checkNotNullParameter(inAppMessageView, "inAppMessageView");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener.onDismissed.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "IInAppMessageViewLifecycleListener.onDismissed called.";
            }
        }, 7, (Object) null);
        getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageDismissed(inAppMessage);
    }
}
