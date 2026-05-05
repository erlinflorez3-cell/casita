package com.braze.push;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import yg.C1580rY;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Qg;
import yg.Wg;

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
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN.Xg@ş\n\u0003d$\n#*BB\u0016\u001dԥ&\t]N0}|Kr\u000bq\u00116\u001a\u0007mDI\u0004|\u000e\u0016\u001d7Zom9\u0014\u0004\u07b2=h"}, d2 = {"\u001ab^:\")KO.~Di<\u000b\fxB\r$\u0011@k'%J\\\u000e:v)FY\u000bu", "\u001a`]1e6BRb|\u0005g;|\u0012>/\\5\u0006<\u007f\u0015\u0013U~z<t%9j}-\r", "u(E", "=mA2V,Bd\u0019", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7mc2a;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class BrazePushReceiver extends BroadcastReceiver {
    private static final String ADM_ERROR_DESCRIPTION_KEY = "error_description";
    private static final String ADM_ERROR_KEY = "error";
    private static final String ADM_RECEIVE_INTENT_ACTION = "com.amazon.device.messaging.intent.RECEIVE";
    private static final String ADM_REGISTRATION_ID_KEY = "registration_id";
    private static final String ADM_REGISTRATION_INTENT_ACTION = "com.amazon.device.messaging.intent.REGISTRATION";
    private static final String ADM_UNREGISTERED_KEY = "unregistered";
    public static final Companion Companion = new Companion(null);
    private static final String DELETED_MESSAGES_KEY = "deleted_messages";
    public static final String FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION = "firebase_messaging_service_routing_action";
    public static final String HMS_PUSH_SERVICE_ROUTING_ACTION = "hms_push_service_routing_action";
    private static final String MESSAGE_TYPE_KEY = "message_type";
    private static final String NUMBER_OF_MESSAGES_DELETED_KEY = "total_deleted";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯF\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005+4\u0012\u000e\u0007nʑA0ZeP\u008cZS@\u000fsڔ<$q$yCAU\"}0\u0012WȞog\u0005Jb\u000bI\u000f\u000e\u0016\u0007j4I[}c\u070f\u0010Hԏ ?aL0B?`ҽ:\u0005.2j^\b\u0012\u0019\u001aXV@z\tRc\f@@ptHc%M3,B\nL3\u0019\u001e\u000b{~:V\u0002u:]7In\u000bl5uH|{$vX5\u001e\u000faL=p;C$=S1\u0017\u0003_M\u001bWqk\u001e/,oAW\u000eo6\u0007\u0017D\u00199^%]!6\r\t_x$'Yh*P\u0019$6\u0013\u0013{;X4\u0012\u00146`.[*\u0017\f\u001cK\rr\u0002Y\u0017\u0002'X\u000e\u0018y6E<079H3f\u007fqk\u001d\\O\u0014\u0005;7i\u00067Air&`C7\u0005{_@i@kX~\u000egU\u0006\u0004\u001f{20\n0U\u001fG{?E]*\u007fvGC9k0dtk\u0005\u0014xh\u0002y\u0003LNC\u0007\u0016e8O\u000bʑHd\u000b\u000e!`f-)MJV]åZ˙$\\\u007f˓q1\u001eQgh\u0018l$έ\\ɻ3f?ժ?w\u001c[Q^a7(ҲbуVv\u001c̳\rn\u0013]~B\u0002\u000e1٥zϒ6HrݘH\bRT$\u0013`AHʌ\u0007Ϝ5\u0019dé\u0019\u000f,IY|7a1ӓbњX3,Ѱ:0\u0003\u0011\u0019P\u000brF\u03a2Kͅ0|hõ}M_>1&\u0004$?؛Oɠ\u000b~{Ò\u0018sZQdlDw,ݯrک\u001e9Yǽ\u000e\u001f\u001d\nA20/\u001cɦEϯUM\u001a\u05fdK\t\b\u001bSh\\i^ρCݽdjR֢ݠ\u001bE"}, d2 = {"\u001ab^:\")KO.~Di<\u000b\fxB\r$\u0011@k'%J\\\u000e:v)FY\u000b^\u0015w\u001e9IL?u=s", "", "u(E", "\u000fC<,8\u0019+=\u0006xY>\u001aZu\u0013Pn\fe)z|v;", "", "\u000fC<,8\u0019+=\u0006x`> ", "\u000fC<,E\f\u001c3|oZX\u0010ew\u000fNn\"W\u001eoz\u00010", "\u000fC<,E\f 7\u0007mg:\u001b`r\u0018_c\u0007u&`\u000b", "\u000fC<,E\f 7\u0007mg:\u001b`r\u0018_c\u0011j i\u0006\u0011#M| `\u000e", "\u000fC<,H\u0015+3zbhM\fih\u000e_e\bo", "\u0012D;\u0012G\f\u001dM\u0001^hL\b^h\u001d_e\bo", "\u0014HA\u00125\b,3\u0013fZL\u001aXj\u0013Na\"i m\bz%O\b)`\u0015$=f\u00021Is\u001d1-$", "\u0016LB,C\u001c,6\u0013lZK\u001d`f\u000f_l\u0012k/d\u007fxAKk+Z\u000f\u001e", "\u001bDB 4\u000e\u001eM\bre>&bh#", "\u001cT<\u000f8\u00198=yxb>\u001ajd\u0011Em\"Z gv\u0006'N\b\"V\u0019", "1qT.g,)O-\u0006\u0005Z+", "\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`\u000f", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "/o_\u0010b5?W\u001b\u000f\bZ;\u0001\u00138P\r2\rD\u007f\u0017$", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;o&;IR?u=\t\"rr=\u0006c9$", "<nc6Y0<O(\u0003\u0005g\f\u0010\u0018<a\u000e", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "0qPGX\fQb&z\t", "6`]1_,\u001aR!kz`0\u000b\u0018<a\u000f,\u0006I`(\u0017P~q=V.1V\u0005 6", "", "7mc2a;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "6`]1_,\u001aR!kz`0\u000b\u0018<a\u000f,\u0006Id &Gx\u001d", "6`]1_,)c'\u0002", "", "6`]1_,)c'\u0002ch;\u0001\n3c{7\u007fJ\n\u0002\u0013[v\u00188u", "6`]1_,+S\u0017~~o,{l8t\u007f1\u000b", "@t]\u001ca\u001bA`\u0019zy", ":nV\u001bb;BT\u001d|vm0\u0007\u0012\u0017e\u000f$z<\u0010\u0013", ">`h9b(=", ":nV\u001bb;BT\u001d|vm0\u0007\u0012\u0017e\u000f$z<\u0010\u0013UCx\rI\u0001)4S\f\u001f=g&2GP;r4\u001a#h", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handlePush(Context context, final Intent intent) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Wg.vd("\u001c(\u001d*.'!i&1/4,49qm\u0019\u0017\u001c\u0014&!", (short) (C1580rY.Xd() ^ (-18451)))).getMethod(Qg.kd("|y\bS\u0002\u0001{wpm\u007fsxvJusxhzu", (short) (FB.Xd() ^ 3990), (short) (FB.Xd() ^ 29068)), new Class[0]);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                final String action = intent.getAction();
                try {
                    handlePush$performWork(action, context2, intent, context);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePush$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Caught exception while performing the push notification handling work. Action: " + action + " Intent: " + intent;
                        }
                    }, 4, (Object) null);
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
        
            if (r8.equals(com.braze.push.BrazePushReceiver.FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION) == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
        
            if (r8.equals(com.braze.Constants.BRAZE_STORY_TRAVERSE_CLICKED_ACTION) == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
        
            if (r8.equals(com.braze.push.BrazePushReceiver.ADM_RECEIVE_INTENT_ACTION) == false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
        
            if (r8.equals(com.braze.push.BrazePushReceiver.HMS_PUSH_SERVICE_ROUTING_ACTION) == false) goto L10;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static final void handlePush$performWork(java.lang.String r8, android.content.Context r9, final android.content.Intent r10, android.content.Context r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 260
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.push.BrazePushReceiver.Companion.handlePush$performWork(java.lang.String, android.content.Context, android.content.Intent, android.content.Context):void");
        }

        public static /* synthetic */ void handleReceivedIntent$default(Companion companion, Context context, Intent intent, boolean z2, int i2, Object obj) throws Throwable {
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                z2 = true;
            }
            companion.handleReceivedIntent(context, intent, z2);
        }

        @JvmStatic
        public final BrazeNotificationPayload createPayload(Context context, BrazeConfigurationProvider appConfigurationProvider, Bundle notificationExtras, Bundle brazeExtras) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
            Intrinsics.checkNotNullParameter(notificationExtras, "notificationExtras");
            Intrinsics.checkNotNullParameter(brazeExtras, "brazeExtras");
            return Constants.isAmazonDevice() ? new BrazeNotificationPayload(notificationExtras, BrazeNotificationPayload.Companion.getAttachedBrazeExtras(notificationExtras), context, appConfigurationProvider) : new BrazeNotificationPayload(notificationExtras, brazeExtras, context, appConfigurationProvider);
        }

        @JvmStatic
        public final boolean handleAdmRegistrationEventIfEnabled(BrazeConfigurationProvider appConfigurationProvider, Context context, final Intent intent) {
            Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationEventIfEnabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Received ADM registration. Message: " + intent;
                }
            }, 6, (Object) null);
            if (!Constants.isAmazonDevice() || !appConfigurationProvider.isAdmMessagingRegistrationEnabled()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationEventIfEnabled$3
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "ADM not enabled in braze.xml. Ignoring ADM registration intent. Note: you must set com_braze_push_adm_messaging_registration_enabled to true in your braze.xml to enable ADM.";
                    }
                }, 6, (Object) null);
                return false;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationEventIfEnabled$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "ADM enabled in braze.xml. Continuing to process ADM registration intent.";
                }
            }, 7, (Object) null);
            handleAdmRegistrationIntent(context, intent);
            return true;
        }

        @JvmStatic
        public final boolean handleAdmRegistrationIntent(Context context, Intent intent) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            final String stringExtra = intent.getStringExtra("error");
            final String stringExtra2 = intent.getStringExtra(BrazePushReceiver.ADM_ERROR_DESCRIPTION_KEY);
            final String stringExtra3 = intent.getStringExtra(BrazePushReceiver.ADM_REGISTRATION_ID_KEY);
            final String stringExtra4 = intent.getStringExtra(BrazePushReceiver.ADM_UNREGISTERED_KEY);
            if (stringExtra != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationIntent$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Error during ADM registration: " + stringExtra + " description: " + stringExtra2;
                    }
                }, 6, (Object) null);
                return true;
            }
            if (stringExtra3 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationIntent$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Registering for ADM messages with registrationId: " + stringExtra3;
                    }
                }, 6, (Object) null);
                Braze.Companion.getInstance(context).setRegisteredPushToken(stringExtra3);
                return true;
            }
            if (stringExtra4 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationIntent$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "The device was un-registered from ADM: " + stringExtra4;
                    }
                }, 6, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationIntent$4
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.";
                }
            }, 6, (Object) null);
            return false;
        }

        @JvmStatic
        public final boolean handlePushNotificationPayload(Context context, Intent intent) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!BrazeNotificationUtils.isBrazePushMessage(intent)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Not handling non-Braze push message.";
                    }
                }, 7, (Object) null);
                return false;
            }
            if (Intrinsics.areEqual("deleted_messages", intent.getStringExtra("message_type"))) {
                final int intExtra = intent.getIntExtra(BrazePushReceiver.NUMBER_OF_MESSAGES_DELETED_KEY, -1);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Firebase messaging 'total_deleted' reports " + intExtra + " messages.";
                    }
                }, 6, (Object) null);
                return false;
            }
            final Bundle extras = intent.getExtras();
            if (extras == null) {
                return false;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Push message payload received: " + extras;
                }
            }, 6, (Object) null);
            Bundle attachedBrazeExtras = BrazeNotificationPayload.Companion.getAttachedBrazeExtras(extras);
            extras.putBundle("extra", attachedBrazeExtras);
            if (!extras.containsKey("braze_push_received_timestamp")) {
                extras.putLong("braze_push_received_timestamp", DateTimeUtils.nowInMilliseconds());
            }
            BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
            final BrazeNotificationPayload brazeNotificationPayloadCreatePayload = createPayload(context, configurationProvider, extras, attachedBrazeExtras);
            if (brazeNotificationPayloadCreatePayload.isUninstallTrackingPush()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$4
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Push message is uninstall tracking push. Doing nothing. Not forwarding this notification to broadcast receivers.";
                    }
                }, 6, (Object) null);
                return false;
            }
            final String pushUniqueId = brazeNotificationPayloadCreatePayload.getPushUniqueId();
            if (pushUniqueId != null && !BrazeInternal.INSTANCE.validateAndStorePushId(context, pushUniqueId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) BrazePushReceiver.Companion, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Push with identifier '" + pushUniqueId + "' has already been seen. Not displaying or forwarding push.";
                    }
                }, 6, (Object) null);
                return false;
            }
            BrazeNotificationUtils.handleContentCardsSerializedCardIfPresent(brazeNotificationPayloadCreatePayload);
            if (brazeNotificationPayloadCreatePayload.getShouldFetchTestTriggers() && configurationProvider.isInAppMessageTestPushEagerDisplayEnabled() && BrazeInAppMessageManager.Companion.getInstance().getActivity() != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$6
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Bypassing push display due to test in-app message presence and eager test in-app message display configuration setting.";
                    }
                }, 7, (Object) null);
                BrazeInternal.handleInAppMessageTestPush(context, intent);
                return false;
            }
            if (!BrazeNotificationUtils.isNotificationMessage(intent)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$14
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Received silent push notification";
                    }
                }, 7, (Object) null);
                BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, brazeNotificationPayloadCreatePayload);
                BrazeNotificationUtils.requestGeofenceRefreshIfAppropriate(brazeNotificationPayloadCreatePayload);
                BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate(brazeNotificationPayloadCreatePayload);
                return false;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$7
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Received visible push notification";
                }
            }, 7, (Object) null);
            int notificationId = BrazeNotificationUtils.getNotificationId(brazeNotificationPayloadCreatePayload);
            extras.putInt(Constants.BRAZE_PUSH_NOTIFICATION_ID, notificationId);
            if (brazeNotificationPayloadCreatePayload.isPushStory()) {
                if (Constants.isAmazonDevice()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$8
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Push stories not supported on Amazon devices.";
                        }
                    }, 7, (Object) null);
                    return false;
                }
                if (!extras.containsKey(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$9
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Received the initial Push Story notification.";
                        }
                    }, 7, (Object) null);
                    extras.putBoolean(Constants.BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED, true);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$10
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Creating notification with payload:\n" + brazeNotificationPayloadCreatePayload;
                }
            }, 6, (Object) null);
            Notification notificationCreateNotification = BrazeNotificationUtils.getActiveNotificationFactory().createNotification(brazeNotificationPayloadCreatePayload);
            if (notificationCreateNotification == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$11
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Notification created by notification factory was null. Not displaying notification.";
                    }
                }, 7, (Object) null);
                return false;
            }
            final NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context);
            Intrinsics.checkNotNullExpressionValue(notificationManagerCompatFrom, "from(context)");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazePushReceiver$Companion$handlePushNotificationPayload$12
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Value of notificationManager.areNotificationsEnabled() = " + notificationManagerCompatFrom.areNotificationsEnabled();
                }
            }, 7, (Object) null);
            notificationManagerCompatFrom.notify(Constants.BRAZE_PUSH_NOTIFICATION_TAG, notificationId, notificationCreateNotification);
            BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, brazeNotificationPayloadCreatePayload);
            BrazeNotificationUtils.wakeScreenIfAppropriate(context, configurationProvider, extras);
            Integer pushDuration = brazeNotificationPayloadCreatePayload.getPushDuration();
            if (pushDuration != null) {
                BrazeNotificationUtils.setNotificationDurationAlarm(context, BrazePushReceiver.class, notificationId, pushDuration.intValue());
            }
            logNotificationMetadata$android_sdk_ui_release(context, brazeNotificationPayloadCreatePayload);
            return true;
        }

        @JvmStatic
        public final void handleReceivedIntent(Context context, Intent intent) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            handleReceivedIntent$default(this, context, intent, false, 4, null);
        }

        @JvmStatic
        public final void handleReceivedIntent(Context context, Intent intent, boolean z2) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (z2) {
                BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new BrazePushReceiver$Companion$handleReceivedIntent$1(context, intent, null), 3, null);
            } else {
                handlePush(context, intent);
            }
        }

        public final void logNotificationMetadata$android_sdk_ui_release(Context context, BrazeNotificationPayload payload) {
            String campaignId;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (payload.isPushDeliveryEnabled() && (campaignId = payload.getCampaignId()) != null) {
                long jCoerceAtLeast = RangesKt.coerceAtLeast(payload.getFlushMinMinutes(), 0L);
                long jCoerceAtLeast2 = RangesKt.coerceAtLeast(payload.getFlushMaxMinutes(), jCoerceAtLeast);
                long millis = TimeUnit.MINUTES.toMillis(jCoerceAtLeast);
                if (jCoerceAtLeast2 > jCoerceAtLeast) {
                    millis = Random.Default.nextLong(millis, TimeUnit.MINUTES.toMillis(jCoerceAtLeast2));
                }
                BrazeInternal.INSTANCE.logPushDelivery(context, campaignId, millis);
            }
            String campaignId2 = payload.getCampaignId();
            if (campaignId2 != null) {
                BrazeInternal.INSTANCE.logPushCampaign(context, campaignId2);
            }
        }
    }

    @JvmStatic
    public static final BrazeNotificationPayload createPayload(Context context, BrazeConfigurationProvider brazeConfigurationProvider, Bundle bundle, Bundle bundle2) {
        return Companion.createPayload(context, brazeConfigurationProvider, bundle, bundle2);
    }

    @JvmStatic
    public static final boolean handleAdmRegistrationEventIfEnabled(BrazeConfigurationProvider brazeConfigurationProvider, Context context, Intent intent) {
        return Companion.handleAdmRegistrationEventIfEnabled(brazeConfigurationProvider, context, intent);
    }

    @JvmStatic
    public static final boolean handleAdmRegistrationIntent(Context context, Intent intent) {
        return Companion.handleAdmRegistrationIntent(context, intent);
    }

    @JvmStatic
    public static final boolean handlePushNotificationPayload(Context context, Intent intent) {
        return Companion.handlePushNotificationPayload(context, intent);
    }

    @JvmStatic
    public static final void handleReceivedIntent(Context context, Intent intent) throws Throwable {
        Companion.handleReceivedIntent(context, intent);
    }

    @JvmStatic
    public static final void handleReceivedIntent(Context context, Intent intent, boolean z2) throws Throwable {
        Companion.handleReceivedIntent(context, intent, z2);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Companion.handleReceivedIntent$default(Companion, context, intent, false, 4, null);
    }
}
