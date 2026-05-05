package com.braze.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.braze.Braze;
import com.braze.Constants;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.hS2\u000fq|<$q$yّCU0}*\tUNog|VbŏIǫ\u0006,ю\u001b,wT9b\u0018\u000f̓FoM3\u0016\fK:xtd\u0007P60;\u0012\u0005/\u001eZL\u001e{\u0013Cy\u0012B4NwRR;UM0 \u000fV / \rk\\9`l\f>_'\u0011nZNUev\u0002\u0016#T^?\r%cN/NBM\u0015S_3\u000b`hW\u0003m\u007f\u0004\n1E5:as\u00068\t\u0004\" CO;i#*j\u0012i`:5[Uq[h\u0010>v)\rɇ@\u0016"}, d2 = {"\u001ab^:\")KO.~Di<\u000b\fxB\r$\u0011@i!&Kp\u0012:r49c\u0007{5|\u001a8V3Jo;,j", "", "u(E", "/cS\u001bb;BT\u001d|vm0\u0007\u0012\u000bc\u000f,\u0006I", "", "<nc6Y0<O(\u0003\u0005g\t\r\r6d\u007f5", "\u001a`]1e6BR,Hxh9|R+p\u000bqdJ\u0010\u001b\u0018Km\nKz/>7\b(Bi%l*S?r3\u001e\">", ">`h9b(=", "\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`\u000f", "/bc6b5\u001bc(\u000e\u0005g", "\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`wba;R\u00010$\\];f[H", "/cS\u001bb;BT\u001d|vm0\u0007\u0012\u000bc\u000f,\u0006I\u000f", "6`]1_,'](\u0003{b*x\u00183o\t\u0004yO\u0005! %v\u0012:|%4", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7mc2a;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", ":nV\u001bb;BT\u001d|vm0\u0007\u0012\u000bc\u000f,\u0006I^\u001e\u001bEu\u000e;", "/bc6b5-g$~", "", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BrazeNotificationActionUtils {
    public static final BrazeNotificationActionUtils INSTANCE = new BrazeNotificationActionUtils();

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationActionUtils$addNotificationAction$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<String> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Cannot add notification action with null context from payload";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationActionUtils$addNotificationAction$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function0<String> {
        final /* synthetic */ String $actionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Adding notification action with type: " + str + "Setting intent class to notification receiver: " + BrazeNotificationUtils.getNotificationReceiverClass();
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationActionUtils$addNotificationAction$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function0<String> {
        final /* synthetic */ String $actionType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Adding notification action with type: " + str + " Setting intent class to trampoline activity";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationActionUtils$addNotificationAction$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass4 extends Lambda implements Function0<String> {
        final /* synthetic */ Bundle $actionExtras;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Bundle bundle) {
            super(0);
            bundle = bundle;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Added action with bundle: " + bundle;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationActionUtils$addNotificationActions$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C08881 extends Lambda implements Function0<String> {
        public static final C08881 INSTANCE = ;

        C08881() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Context cannot be null when adding notification buttons.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationActionUtils$addNotificationActions$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C08892 extends Lambda implements Function0<String> {
        public static final C08892 INSTANCE = ;

        C08892() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "No action buttons present. Not adding notification actions";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationActionUtils$addNotificationActions$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C08903 extends Lambda implements Function0<String> {
        C08903() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Adding action button: " + actionButton;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationActionUtils$handleNotificationActionClicked$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C08911 extends Lambda implements Function0<String> {
        public static final C08911 INSTANCE = ;

        C08911() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Notification action button type was blank or null. Doing nothing.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationActionUtils$handleNotificationActionClicked$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C08922 extends Lambda implements Function0<String> {
        public static final C08922 INSTANCE = ;

        C08922() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Not handling deep links automatically, skipping deep link handling";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationActionUtils$handleNotificationActionClicked$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C08933 extends Lambda implements Function0<String> {
        public static final C08933 INSTANCE = ;

        C08933() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Unknown notification action button clicked. Doing nothing.";
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeNotificationActionUtils$handleNotificationActionClicked$4 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C08944 extends Lambda implements Function0<String> {
        public static final C08944 INSTANCE = ;

        C08944() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Caught exception while handling notification action button click.";
        }
    }

    private BrazeNotificationActionUtils() {
    }

    @JvmStatic
    public static final void addNotificationActions(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.getContext() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C08881.INSTANCE, 7, (Object) null);
            return;
        }
        List<BrazeNotificationPayload.ActionButton> actionButtons = payload.getActionButtons();
        if (actionButtons.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) C08892.INSTANCE, 7, (Object) null);
            return;
        }
        for (BrazeNotificationPayload.ActionButton actionButton : actionButtons) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationActionUtils brazeNotificationActionUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeNotificationActionUtils, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationActionUtils.addNotificationActions.3
                C08903() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Adding action button: " + actionButton;
                }
            }, 6, (Object) null);
            brazeNotificationActionUtils.addNotificationAction(notificationBuilder, payload, actionButton);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0064, code lost:
    
        if (r6.equals(com.braze.Constants.BRAZE_PUSH_ACTION_TYPE_OPEN) == false) goto L98;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void handleNotificationActionClicked(android.content.Context r12, android.content.Intent r13) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.push.BrazeNotificationActionUtils.handleNotificationActionClicked(android.content.Context, android.content.Intent):void");
    }

    public final void addNotificationAction(NotificationCompat.Builder notificationBuilder, BrazeNotificationPayload payload, BrazeNotificationPayload.ActionButton actionButton) {
        PendingIntent activity;
        Intrinsics.checkNotNullParameter(notificationBuilder, "notificationBuilder");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        Context context = payload.getContext();
        if (context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) AnonymousClass1.INSTANCE, 7, (Object) null);
            return;
        }
        Bundle bundle = new Bundle(payload.getNotificationExtras());
        actionButton.putIntoBundle(bundle);
        String type = actionButton.getType();
        int immutablePendingIntentFlags = (-1) - (((-1) - 134217728) & ((-1) - IntentUtils.getImmutablePendingIntentFlags()));
        if (Intrinsics.areEqual(Constants.BRAZE_PUSH_ACTION_TYPE_NONE, type)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationActionUtils.addNotificationAction.2
                final /* synthetic */ String $actionType;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(String type2) {
                    super(0);
                    str = type2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Adding notification action with type: " + str + "Setting intent class to notification receiver: " + BrazeNotificationUtils.getNotificationReceiverClass();
                }
            }, 6, (Object) null);
            Intent intent = new Intent(Constants.BRAZE_ACTION_CLICKED_ACTION).setClass(context, BrazeNotificationUtils.getNotificationReceiverClass());
            Intrinsics.checkNotNullExpressionValue(intent, "Intent(Constants.BRAZE_A…ceiverClass\n            )");
            intent.putExtras(bundle);
            activity = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, immutablePendingIntentFlags);
            Intrinsics.checkNotNullExpressionValue(activity, "getBroadcast(\n          …IntentFlags\n            )");
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationActionUtils.addNotificationAction.3
                final /* synthetic */ String $actionType;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(String type2) {
                    super(0);
                    str = type2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Adding notification action with type: " + str + " Setting intent class to trampoline activity";
                }
            }, 6, (Object) null);
            Intent intent2 = new Intent(Constants.BRAZE_ACTION_CLICKED_ACTION).setClass(context, NotificationTrampolineActivity.class);
            Intrinsics.checkNotNullExpressionValue(intent2, "Intent(Constants.BRAZE_A…lineActivity::class.java)");
            intent2.setFlags(intent2.getFlags() | BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK));
            intent2.putExtras(bundle);
            activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent2, immutablePendingIntentFlags);
            Intrinsics.checkNotNullExpressionValue(activity, "getActivity(\n           …IntentFlags\n            )");
        }
        NotificationCompat.Action.Builder builder = new NotificationCompat.Action.Builder(0, actionButton.getText(), activity);
        builder.addExtras(new Bundle(bundle));
        notificationBuilder.addAction(builder.build());
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeNotificationActionUtils.addNotificationAction.4
            final /* synthetic */ Bundle $actionExtras;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(Bundle bundle2) {
                super(0);
                bundle = bundle2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Added action with bundle: " + bundle;
            }
        }, 6, (Object) null);
    }

    public final void logNotificationActionClicked(Context context, Intent intent, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Braze.Companion.getInstance(context).logPushNotificationActionClicked(intent.getStringExtra("cid"), intent.getStringExtra(Constants.BRAZE_ACTION_ID_KEY), str);
    }
}
