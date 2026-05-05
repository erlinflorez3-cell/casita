package com.braze.ui.inappmessage.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.PermissionUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutKt;
import org.json.JSONObject;
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
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njO0LeN/ZS8\u0018s{:'c$\u007fCCU }*\t]ZogtRb\u000bQ\u0013\u000e\u0016~j4Ic~e܈\u00172XoG3SqSʠ~\u001bf\u0005N1Z7 E\u0014*.V\u0010\u000fzqL\u001c\u0016>B\t:\u0001\u0010̂\t\u001a \n\u0007&\u000f-tg|F\u000fq&R=4\u001bip^Wc>\u000fe\rtgW\u0013\u0005u6-V6c(kXK\u0017`pW\u0003m\u0002m\u000bv=?-_r\u0006I\u001f\u0005\\\u001b9f%]!6#\n\u001az\u001a?CO\u0012[\u0001\u00146\u0011\u0013}#;2!6-VHE\u001c|\u0007<F;w\u001ct^\u001dvB.\u000b\u0012<%A\u00185A8Iy\u0002eI6f7*#=$1 \u0007#qS<sE\u001fb\u0018i1\u007famN\\$q?\u0004\u0003\u001fuH/LBU\"G}'-EHgaG=9m\u0018Grz=\n)na\u000ejHn25\u001b\u007f0\u00171rD\u0013\u00152U%d:\u0011e\u001c\u0003\bTܴ\u0015ء`wDƙu\u001c\\Q\u0001i\u0019P4܆'çj7aʤ<\u001fe>v3cW\u001aUуV|\u001c̳Td\u000b_tJ$$he@\"`RAݟ\u0004ԞHZ\u0014ƎJAw'B8Q\u001bb\"V\u0011څFh"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWA\u0005)>h}-8i\u0014.\u0017'DG?)|hoG\u0003e,3r8CZL9`]\u0002!\u001d!Z\u001bO'\u000b\u0005/", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7m0=c\u0014>a'z|^", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ewwi@\\", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt:\u0001-~V\u000b\u001cLm_6WB;rBg\u0019q]D\u0012k,\\\u0005#IL\u0018\u0010@[NH\u001fyZ\u001c\\'\u000f\u0005<P,u\u001az\u0010", "CrT?", "\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWA\u0005)>h}-8i\u0014.\u0017'DG?)|hoG\u0003e,>\u0005'T1J=X`pJ\u0018\u001diqW:\r\u0012Z=\"n\u001a", "5dc\"f,K", "u(;0b4\bP&z\u0010^u\r\rxi\t$\u0007K\t\u0017%Uk\u0010<@*C]\u0007/7z\u0017*KC\u0005O=y sI9\u0015q(Pv\u0017UL[\u0011XcnK\u0012\u001f^\u0019]\u000f\u0016\u0014YN%jB7t", "E`b\u0010_6LS\u0001~\tl(~\t\ra\u0007/{?", "", "5dc$T:\u001cZ#\rzF,\u000b\u0017+g\u007f\u0006wG\b\u0017\u0016", "u(I", "Adc$T:\u001cZ#\rzF,\u000b\u0017+g\u007f\u0006wG\b\u0017\u0016", "uY\u0018#", "0dU<e,&S'\rv`,Z\u00109s\u007f'", "", "1gP;Z,.a\u0019\f", "CrT?<+", "", "AcZ\u000eh;AA\u001d\u0001\u0004Z;\r\u0016/", ":nV\u000fh;M]\"\\\u0002b*\u0003", "0tcAb5\"R", ":nV\u0010_0<Y", ":nV\u0010h:M]!^\f^5\fz3t\u0003\ri*i", "3uT;g\u0015:[\u0019", ">q^=X9MW\u0019\r_L\u0016e", ":nV\u001dh9<V\u0015\rzP0\f\f\u0014Si\u0011", ">q^1h*M7\u0018", ">qX0X", "", "1ta?X5<gv\ty^", "?tP;g0Mg", "", ">`a@X\u0017K]$~\bm0|\u0017", "\u001ab^:\")KO.~Df6{\t6sI2\fO\u0003!\u001bPqW\u0019\u0004!JYh-Ax\u0016;\\G;y\n", "@d`BX:M7!\u0007z]0x\u0018/D{7w!\b'%J", "@d`BX:M>)\r}I,\n\u00113s\u000e,\u0006I", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class InAppMessageJavascriptInterface {
    public static final Companion Companion = new Companion(null);
    private static final long PUSH_PROMPT_INITIAL_DELAY_MS = 75;
    private static final long PUSH_PROMPT_WAIT_DELAY_TIMEOUT_MS = 25;
    private static final long PUSH_PROMPT_WAIT_FOR_DISPLAY_TIMEOUT_MS = 2500;
    private final Context context;
    private final IInAppMessageHtml inAppMessage;
    private final InAppMessageUserJavascriptInterface user;
    private boolean wasCloseMessageCalled;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00126B\u0005#2ߡx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԅt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̖~֒Yxe܈_>PsW3{q\u0014ʣ3ҽ:\u0005(݅ś<~"}, d2 = {"\u001ab^:\")KO.~Dn0F\r8a\u000b3\u0004@\u000f%\u0013IoWA\u0005)>h}-8i\u0014.\u0017'DG?)|hoG\u0003e,3r8CZL9`]\u0002!\u001d!Z\u001bO'\u000b\u0005\u0018\u001f.vO3(\f6RW", "", "u(E", "\u001eTB\u0015R\u0017+=\u0001iiX\u0010el\u001eI[\u000fu\u001f`}r;iu*", "", "\u001eTB\u0015R\u0017+=\u0001iiX\u001eXl\u001e_^\bb\u001ct\u0011\u0006+Wm&f\u0014/Ak", "\u001eTB\u0015R\u0017+=\u0001iiX\u001eXl\u001e_`\u0012h:_z\u00052Vi0p\u0014\u0019A]\n'\\\u0010\u0016;", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\b\u001d̉=!,i\u000eӵ\\c#\u0003\bٕn"}, d2 = {"\n`]<a@F])\rS", ""}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10271 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1$1, reason: invalid class name and collision with other inner class name */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class C01431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            C01431(Continuation<? super C01431> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01431 c01431 = new C01431(continuation);
                c01431.L$0 = obj;
                return c01431;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.L$0, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface.requestPushPermission.1.1.1
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Waiting for IAM to be fully closed before requesting push prompt";
                        }
                    }, 6, (Object) null);
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                while (BrazeInAppMessageManager.Companion.getInstance().isCurrentlyDisplayingInAppMessage()) {
                    this.label = 1;
                    if (DelayKt.delay(InAppMessageJavascriptInterface.PUSH_PROMPT_WAIT_DELAY_TIMEOUT_MS, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        C10271(Continuation<? super C10271> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return InAppMessageJavascriptInterface.this.new C10271(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C10271) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (InAppMessageJavascriptInterface.this.getWasCloseMessageCalled()) {
                    this.label = 1;
                    if (TimeoutKt.withTimeout(InAppMessageJavascriptInterface.PUSH_PROMPT_WAIT_FOR_DISPLAY_TIMEOUT_MS, new C01431(null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) InAppMessageJavascriptInterface.this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface.requestPushPermission.1.2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Requesting push prompt from Braze bridge html interface";
                }
            }, 6, (Object) null);
            PermissionUtils.requestPushPermissionPrompt(BrazeInAppMessageManager.Companion.getInstance().getActivity());
            return Unit.INSTANCE;
        }
    }

    public InAppMessageJavascriptInterface(Context context, IInAppMessageHtml inAppMessage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        this.context = context;
        this.inAppMessage = inAppMessage;
        this.user = new InAppMessageUserJavascriptInterface(context);
    }

    @JavascriptInterface
    public final void beforeMessageClosed() {
        this.wasCloseMessageCalled = true;
    }

    @JavascriptInterface
    public final void changeUser(String userId, String str) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Braze.Companion.getInstance(this.context).changeUser(userId, str);
    }

    @JavascriptInterface
    public final InAppMessageUserJavascriptInterface getUser() {
        return this.user;
    }

    public final boolean getWasCloseMessageCalled() {
        return this.wasCloseMessageCalled;
    }

    @JavascriptInterface
    public final void logButtonClick(String str) {
        if (str != null) {
            this.inAppMessage.logButtonClick(str);
        }
    }

    @JavascriptInterface
    public final void logClick() {
        this.inAppMessage.logClick();
    }

    @JavascriptInterface
    public final void logCustomEventWithJSON(String str, String str2) {
        Braze.Companion.getInstance(this.context).logCustomEvent(str, parseProperties(str2));
    }

    @JavascriptInterface
    public final void logPurchaseWithJSON(String str, double d2, String str2, int i2, String str3) {
        Braze.Companion.getInstance(this.context).logPurchase(str, str2, new BigDecimal(String.valueOf(d2)), i2, parseProperties(str3));
    }

    public final BrazeProperties parseProperties(final String str) {
        if (str == null) {
            return null;
        }
        try {
            if (Intrinsics.areEqual(str, "undefined") || Intrinsics.areEqual(str, "null")) {
                return null;
            }
            return new BrazeProperties(new JSONObject(str));
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface.parseProperties.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to parse properties JSON String: " + str;
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @JavascriptInterface
    public final void requestImmediateDataFlush() {
        Braze.Companion.getInstance(this.context).requestImmediateDataFlush();
    }

    @JavascriptInterface
    public final void requestPushPermission() {
        BrazeInAppMessageManager.Companion.getInstance().setShouldNextUnregisterBeSkipped(true);
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, (Number) 75L, null, new C10271(null), 2, null);
    }

    public final void setWasCloseMessageCalled(boolean z2) {
        this.wasCloseMessageCalled = z2;
    }
}
