package com.braze.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import com.braze.support.ReflectionUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007f\u0007ljA0RqP.XS0#\u0002ڔR,\f$ BsT\">%\u07beSNug7Xh\f[\u000f4\u0018)n:Lmx\f\u0016UF\u000b}M8eok;\u0011xD\u000b82P?@\u0019и\u001e3"}, d2 = {"\u001ab^:\")KO.~Di<\u000b\fxB\r$\u0011@a\u001b$Gl\nJv\r5g\f\u001c9q\u001f0;CH|8\u001c\u0015>", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\t\u0017%Uk\u0010@\u007f'~:\u0002-7j\u0012<M+;yB\u001a\u0017lj;tc9_z%G\"", "u(E", "=m<2f::U\u0019kz\\,\u0001\u001a/d", "", "@d\\<g,&S'\rv`,", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\t\u0017%Uk\u0010@\u007f'~F}(A|\u0016\u0016MQIg6\u001ej", "=m=2j\u001bHY\u0019\b", "<df!b2>\\", "", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public class BrazeFirebaseMessagingService extends FirebaseMessagingService {
    private static final String CONTEXT_ATTACH_METHOD = "attachBaseContext";
    public static final Companion Companion = new Companion(null);
    private static final String FCM_SERVICE_OMR_METHOD = "onMessageReceived";

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005\"4\u0012\u0006\u0010nʑA0ZeP\u008cZS@\u000fsڔ<$i$yCAW ԉ#\u001fѧ~g\u0016m\u000b_\u0011CǇ\n\u0016\u0007jt_c|u\u0012=7rsM9eok@\u0011xD\r82PA@\nI=8R(v)N{\u0010 <XphT=Q\u0013\"*\u0006l)1\"jmf6vs$Žǥ'\u0003oO\u00175m>\u0015M;K\u0005+\u001b~y\u001eYI}:e1a\u0004\u001fR\nAYӍDݘ\th/ݐ{U\u0002ZNX.\u0016kۃ\"ոar.ؘԍUo"}, d2 = {"\u001ab^:\")KO.~Di<\u000b\fxB\r$\u0011@a\u001b$Gl\nJv\r5g\f\u001c9q\u001f0;CH|8\u001c\u0015'?C\u000fn(Wz1P\"", "", "u(E", "\u0011N=!8\u001f-Mtmi:\n_\u0003\u0017En\u000be\u001f", "", "\u0014B<,F\f+D|\\ZX\u0016du)M_\u0017^*_", "6`]1_,\u001b`\u0015\u0014zK,\u0005\u0013>eg(\nN|\u0019\u0017", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "@d\\<g,&S'\rv`,", "\u001ab^:\".H]\u001b\u0006z(-\u0001\u0016/b{6{\n\t\u0017%Uk\u0010@\u007f'~F}(A|\u0016\u0016MQIg6\u001ej", "7me<^,\u001fO \u0006wZ*\u0003i3r\u007f%wN\u0001\u0005\u0017T\u0001\u0012:v", "", "1kP@f7:b\u001c", "7me<^,\u001fO \u0006wZ*\u0003i3r\u007f%wN\u0001\u0005\u0017T\u0001\u0012:vc1b|-Aq\u0015([BAeD\"\u000fua@\u0007_:N", "7r1?TA>>)\r}G6\f\r0i}$\u000bD\u000b ", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean handleBrazeRemoteMessage(Context context, final RemoteMessage remoteMessage) throws Throwable {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            if (!isBrazePushNotification(remoteMessage)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Remote message did not originate from Braze. Not consuming remote message: " + remoteMessage;
                    }
                }, 6, (Object) null);
                BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(context);
                if (!configurationProvider.isFallbackFirebaseMessagingServiceEnabled()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$4
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "FallbackFirebaseMessagingService is not enabled";
                        }
                    }, 7, (Object) null);
                    return false;
                }
                final String fallbackFirebaseMessagingServiceClasspath = configurationProvider.getFallbackFirebaseMessagingServiceClasspath();
                if (fallbackFirebaseMessagingServiceClasspath == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$3
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Fallback FCM service enabled but classpath is null. Not routing to any fallback service.";
                        }
                    }, 7, (Object) null);
                    return false;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Fallback FCM service enabled. Attempting to use fallback class at " + fallbackFirebaseMessagingServiceClasspath;
                    }
                }, 6, (Object) null);
                invokeFallbackFirebaseService$android_sdk_ui_release(fallbackFirebaseMessagingServiceClasspath, remoteMessage, context);
                return false;
            }
            final Map<String, String> data = remoteMessage.getData();
            Intrinsics.checkNotNullExpressionValue(data, "remoteMessage.data");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Got remote message from FCM: " + data;
                }
            }, 6, (Object) null);
            Intent intent = new Intent(BrazePushReceiver.FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION);
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : data.entrySet()) {
                final String key = entry.getKey();
                final String value = entry.getValue();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Adding bundle item from FCM remote data with key: " + key + " and value: " + value;
                    }
                }, 6, (Object) null);
                bundle.putString(key, value);
            }
            intent.putExtras(bundle);
            BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.Companion, context, intent, false, 4, null);
            return true;
        }

        public final void invokeFallbackFirebaseService$android_sdk_ui_release(final String classpath, RemoteMessage remoteMessage, Context context) {
            Intrinsics.checkNotNullParameter(classpath, "classpath");
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            Intrinsics.checkNotNullParameter(context, "context");
            Object objConstructObjectQuietly$default = ReflectionUtils.constructObjectQuietly$default(ReflectionUtils.INSTANCE, classpath, null, null, 6, null);
            if (objConstructObjectQuietly$default == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$invokeFallbackFirebaseService$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Fallback firebase messaging service " + classpath + " could not be constructed. Not routing fallback RemoteMessage.";
                    }
                }, 7, (Object) null);
                return;
            }
            Method declaredMethodQuietly = ReflectionUtils.INSTANCE.getDeclaredMethodQuietly(classpath, BrazeFirebaseMessagingService.CONTEXT_ATTACH_METHOD, Context.class);
            if (declaredMethodQuietly == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$invokeFallbackFirebaseService$4
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Could not find attachBaseContext. Not doing anything.";
                    }
                }, 7, (Object) null);
                return;
            }
            declaredMethodQuietly.setAccessible(true);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$invokeFallbackFirebaseService$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Attempting to call " + classpath + " attachBaseContext";
                }
            }, 7, (Object) null);
            if (!ReflectionUtils.invokeMethodQuietly(objConstructObjectQuietly$default, declaredMethodQuietly, context).getFirst().booleanValue()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$invokeFallbackFirebaseService$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Failure invoking " + classpath + ".attachBaseContext. Not doing anything.";
                    }
                }, 7, (Object) null);
                return;
            }
            Method methodQuietly = ReflectionUtils.getMethodQuietly(classpath, "onMessageReceived", (Class<?>[]) new Class[]{RemoteMessage.class});
            if (methodQuietly == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$invokeFallbackFirebaseService$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Fallback firebase messaging service method " + classpath + ".onMessageReceived could not be retrieved. Not routing fallback RemoteMessage.";
                    }
                }, 7, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService$Companion$invokeFallbackFirebaseService$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Attempting to invoke firebase messaging fallback service " + classpath + ".onMessageReceived";
                }
            }, 7, (Object) null);
            if (ReflectionUtils.invokeMethodQuietly(objConstructObjectQuietly$default, methodQuietly, remoteMessage).getFirst().booleanValue()) {
                return;
            }
            String str = "Failure invoking " + classpath + ".onMessageReceived.";
        }

        @JvmStatic
        public final boolean isBrazePushNotification(RemoteMessage remoteMessage) {
            Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
            Map<String, String> data = remoteMessage.getData();
            Intrinsics.checkNotNullExpressionValue(data, "remoteMessage.data");
            return Intrinsics.areEqual("true", data.get(Constants.BRAZE_PUSH_BRAZE_KEY));
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeFirebaseMessagingService$onNewToken$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<String> {
        final /* synthetic */ String $newToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "No configured API key, not registering token in onNewToken. Token: " + str;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeFirebaseMessagingService$onNewToken$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function0<String> {
        final /* synthetic */ String $newToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Automatic FirebaseMessagingService.OnNewToken() registration disabled, not registering token: " + str;
        }
    }

    /* JADX INFO: renamed from: com.braze.push.BrazeFirebaseMessagingService$onNewToken$3 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends Lambda implements Function0<String> {
        final /* synthetic */ String $newToken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Registering Firebase push token in onNewToken. Token: " + str;
        }
    }

    @JvmStatic
    public static final boolean handleBrazeRemoteMessage(Context context, RemoteMessage remoteMessage) {
        return Companion.handleBrazeRemoteMessage(context, remoteMessage);
    }

    @JvmStatic
    public static final boolean isBrazePushNotification(RemoteMessage remoteMessage) {
        return Companion.isBrazePushNotification(remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) throws Throwable {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        Companion.handleBrazeRemoteMessage(this, remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String newToken) {
        Intrinsics.checkNotNullParameter(newToken, "newToken");
        super.onNewToken(newToken);
        BrazeFirebaseMessagingService brazeFirebaseMessagingService = this;
        BrazeInternal.applyPendingRuntimeConfiguration(brazeFirebaseMessagingService);
        BrazeConfigurationProvider configurationProvider = BrazeInternal.INSTANCE.getConfigurationProvider(brazeFirebaseMessagingService);
        String configuredApiKey = Braze.Companion.getConfiguredApiKey(configurationProvider);
        if (configuredApiKey == null || configuredApiKey.length() == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService.onNewToken.1
                final /* synthetic */ String $newToken;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(String newToken2) {
                    super(0);
                    str = newToken2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "No configured API key, not registering token in onNewToken. Token: " + str;
                }
            }, 6, (Object) null);
        } else if (!configurationProvider.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService.onNewToken.2
                final /* synthetic */ String $newToken;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(String newToken2) {
                    super(0);
                    str = newToken2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Automatic FirebaseMessagingService.OnNewToken() registration disabled, not registering token: " + str;
                }
            }, 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.push.BrazeFirebaseMessagingService.onNewToken.3
                final /* synthetic */ String $newToken;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(String newToken2) {
                    super(0);
                    str = newToken2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Registering Firebase push token in onNewToken. Token: " + str;
                }
            }, 6, (Object) null);
            Braze.Companion.getInstance(brazeFirebaseMessagingService).setRegisteredPushToken(newToken2);
        }
    }
}
