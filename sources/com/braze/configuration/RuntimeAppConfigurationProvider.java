package com.braze.configuration;

import android.content.Context;
import android.content.SharedPreferences;
import bo.app.c90;
import bo.app.d90;
import bo.app.e90;
import com.braze.BrazeInternal;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.support.BrazeLogger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Qg;
import yg.Wg;
import yg.hg;

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
@Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u000eӵLc\u0003\u0010Iي8\u000b<H\u0007Ӭ4\u0012\u0006\u0007nj?0LeV7ZS0\u000fs{B2cҕyCQU\"}(\nWN}gvJ`\u0015K\u000f\u00146\u0001j:j]xc\u001d\u00172XoG3SoE9vt>\u0005&4*8\u0010\u0005\t\u001a0Q\u0016{\u0011ŏiIB0norQK\u000e\u0012*\u0016\u0014k8\u0001L\tʄR8N(kvwB\u0011nZNUc`\u0001[\u000e^TU\r'g,.X9K\u0014SUI\u0007қ_A\tD\u007fCM\b5/CI\"[f\\\u000e\u0015-+}\r\u000ex4_\u001dSv\u000bU2\u0016cׂT\u0010.\u007f\t\u0005Us\u0012\u001c\u001e'v2M(lڜ\u001c>\u001dzcB`\u0002\u0015ۍ\u0016y\u0010@G1\u000e@CA+haaqϊd6*\u0011=\"1\u0002\u0007!\nTT`ڠ\u001fV}_?`\tPV`\"Ykq4tp\u0013B\u0004^WĬ3}\u0017@%8\u007ffG79k0Lזkx\u000btvh2qVW:p,6X\t<^Re\u001dk~T\t2\u001fc4V\u001d|6\u0013ء`yB83(\u0017jv\u0003\u0003M\f\fU3t8qn\u001a\u000e\b=lIMQ\u0012\u0012уVx\u001aXJ|Mst]k\f\tcX&@I\u0003\u0010&{tR\u001a)J? #ٜ03\u001fw#dKKP`\u0015\u0011o\\x\u0010-TI#1\bTx\u0017\u0002h\\\u001fo\u0018\u0007WB\u0015j21QSK\u0018TU8gb\u001aɠ\u000b\u0001y\u001fU\b\u0015ZZ\u000e.u\u0004\u0003P\u001a(:i/k\u0013ä\u0003+8#;g\u0015\u0016ste\u0012U~-}\u001d<\u0001.\u0016\b\u001bz:c\u0003P_T\u001d#\r]!-Niѣ}cL\u001eU\b\u001d(icar1]lRF}\u001d\u001fL%1u0\u007fM/Y&K\u0016߳\u00181\u001b\u0007k\u00108a\b\u000b'&#i$:iܞ}myeB=HI\u0010˚T!Rv3FVk\u0010\bp\td\u0017AoYj\u0001XHMAɀ,r¡0\u000fv~ic[z\f^F_Xwʸ\u0002\u0016dm3&\u0016^u\u0019\u0006K\u000b\u000fΊ\u0013\f\u0011'?\u0004b.KMnW\u00115f\u0006J̻8װ?f\r>\u000fQBZ\r\u001d\u0019sli4?1\u0004ʮc\u0019\u001f4H$I\b&V~\u000fd{U\u0003S\u00169,\u0017}=gT|s5[֎Rߟ3s:\u0003YR\u0017Q\u0003Q\u0005\u001e3cdV?T6\u0013܇\u000f\u0005"}, d2 = {"\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011\\\u001eE\u0006)=YY+BK 7NG={A\u001a$lkBqp6_z&GY$", "", "", "9dh", "", "D`[BX", "", ">tc\u0016a;", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u0019b\r 9m#\u0004\u00114", "", ">tc\u000fb6ES\u0015\b", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u0012c\b'7i\u001f\u0004\u00114", "", "\"", "\u001aiPCTuNb\u001d\u0006D>5\r\u0011\u001de\u000f}", "3md:F,M", ">tc\u0012a<FA\u0019\u000e", "uKY.i(\bc(\u0003\u0002(\f\u0006\u00197S\u007f7Q'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004\u00114", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;ok", "1n]3\\.", "Adc\u0010b5?W\u001b\u000f\bZ;\u0001\u00138", "uKR<`u;`\u0015\u0014z(*\u0007\u00120i\u00028\t<\u0010\u001b!P9jIr:57\b)8q\u0018\u0004\u00114", "1kT.e\bEZv\t\u0004_0~\u0019<a\u000f,\u0006Iq\u0013\u001eWo\u001c", "u(E", "2dU.h3MD\u0015\u0006\u000b^", "5dc g9B\\\u001bove<|", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq4H7|0g\u001cdj;PQ;[z0I\"", "5dc\u0016a;/O \u000fz", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004d", "5dc\u000fb6ES\u0015\bkZ3\r\t", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p\u0004u", "", "", "5dc g9B\\\u001blzm\u001dx\u0010?e", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011\u007f\u001d@}n#Y\ruzT\u001b*^?\u0005{C\"\u001c2O9\u00169", "1n]AT0Ga~~\u000f", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?5", ">tc\u0012a<F/'l\nk0\u0006\u000b", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u0015b\u000e(\r1\u0007", ">tc g9B\\\u001b", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@okq>", "CoS.g,/O \u000fz", "CoS.g,\u001e\\)\u0007h^;[\u0005>a", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011\u007f\u001d@}n\u0015b\u000e(%m%\u0004\u00114", "AsP?g\f=W(", "/o_9l\f=W(", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "As^?T.>;\u0015\n", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "5dc g6KO\u001b~bZ7", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqiC|$\u0017FZ\u001b<w%BY\u0007\u001e7{k", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.uM\u00152\\MHA", "3cXAb9", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.uM\u00152\\MHA", "5dc\u0012W0M]&", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqiC|$\u0017FZ\u001b<w%BY\u0007\u001e7{T\u000eLGJuAs", "Adc\u0012W0M]&", "uKP;W9HW\u0018Hxh5\f\t8tI\u0016~<\u000e\u0017\u00162|\u000e=v25b{ E,u-QREx\na\u0006", "\nh]6g\u0005", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "\u0011n\\=T5B]\"", "0n\u001e.c7\bQlI", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public final class RuntimeAppConfigurationProvider {
    public static final c90 Companion = new c90();
    private static final String SHARED_PREFERENCES_NAME = "com.appboy.override.configuration.cache";
    private final Context context;
    private SharedPreferences.Editor editor;
    private final SharedPreferences storageMap;

    public RuntimeAppConfigurationProvider(Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(context, Wg.Zd("\r\u0018U\"a3-", (short) (C1607wl.Xd() ^ 7910), (short) (C1607wl.Xd() ^ 3793)));
        this.context = context;
        Object[] objArr = {C1561oA.Xd("\u0012\u001f\u001e_\u0014$%\u0018&1f)1!/0($&o&33,0/><,@6==}436<:", (short) (OY.Xd() ^ 10881)), 0};
        Method method = Class.forName(Wg.vd("\u0001\r\u0002\u000f\u0013\f\u0006N\u000b\u0016\u0014\u0019\u0011\u0019\u001eVR}{\u0001x\u000b\u0006", (short) (FB.Xd() ^ 5727))).getMethod(hg.Vd("74B 4,<.,\u00178**(4&.\"#0", (short) (C1633zX.Xd() ^ (-12378)), (short) (C1633zX.Xd() ^ (-4124))), Class.forName(Qg.kd("RH\\F\u0012OCOG\r1QNDH@", (short) (C1607wl.Xd() ^ 7849), (short) (C1607wl.Xd() ^ 17032))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, C1561oA.ud("*538(:5m&#1\u000f#\u001b+\u001d\u001b\u0006'\u0019\u0019\u0017#\u0015\uf51bzqWJl\u0018\u0016\u001b\u000b\u001d\u0018Pnocc|lmcoYk[>", (short) (OY.Xd() ^ 10779)));
            this.storageMap = sharedPreferences;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final void putBoolean(String str, Boolean bool) {
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            SharedPreferences.Editor editor = this.editor;
            if (editor != null) {
                editor.putBoolean(str, zBooleanValue);
            }
        }
    }

    private final <T extends Enum<T>> void putEnumSet(EnumSet<T> enumSet, String str) {
        if (enumSet == null) {
            return;
        }
        Set<String> setA = com.braze.support.e.a(enumSet);
        SharedPreferences.Editor editor = this.editor;
        if (editor != null) {
            editor.putStringSet(str, setA);
        }
    }

    private final void putInt(String str, Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            SharedPreferences.Editor editor = this.editor;
            if (editor != null) {
                editor.putInt(str, iIntValue);
            }
        }
    }

    public final void applyEdit() {
        SharedPreferences.Editor editor = this.editor;
        if (editor != null) {
            editor.apply();
        }
    }

    public final void clearAllConfigurationValues() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) d90.f472a, 7, (Object) null);
        this.storageMap.edit().clear().apply();
    }

    public final boolean containsKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.storageMap.contains(key);
    }

    public final boolean getBooleanValue(String key, boolean z2) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.storageMap.getBoolean(key, z2);
    }

    public final SharedPreferences.Editor getEditor() {
        return this.editor;
    }

    public final int getIntValue(String key, int i2) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.storageMap.getInt(key, i2);
    }

    public final SharedPreferences getStorageMap() {
        return this.storageMap;
    }

    public final Set<String> getStringSetValue(String key, Set<String> set) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.storageMap.getStringSet(key, set);
    }

    public final String getStringValue(String key, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.storageMap.getString(key, str);
    }

    public final void putEnumAsString(String key, Enum<?> r3) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (r3 != null) {
            putString(key, r3.toString());
        }
    }

    public final void putString(String key, String str) {
        SharedPreferences.Editor editor;
        Intrinsics.checkNotNullParameter(key, "key");
        if (str == null || (editor = this.editor) == null) {
            return;
        }
        editor.putString(key, str);
    }

    public final void setConfiguration(BrazeConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new e90(config), 6, (Object) null);
        startEdit();
        putString("com_braze_api_key", config.apiKey);
        putString("com_braze_server_target", config.serverTarget);
        putEnumAsString("com_braze_sdk_flavor", config.sdkFlavor);
        putBoolean("com_braze_newsfeed_unread_visual_indicator_on", config.isNewsFeedVisualIndicatorOn);
        putString("com_braze_custom_endpoint", config.customEndpoint);
        putString("com_braze_push_small_notification_icon", config.smallNotificationIcon);
        putString("com_braze_push_large_notification_icon", config.largeNotificationIcon);
        putInt("com_braze_session_timeout", config.sessionTimeout);
        putInt("com_braze_default_notification_accent_color", config.defaultNotificationAccentColor);
        putInt("com_braze_trigger_action_minimum_time_interval_seconds", config.triggerActionMinimumTimeIntervalSeconds);
        putBoolean("com_braze_push_adm_messaging_registration_enabled", config.isAdmMessagingRegistrationEnabled);
        putBoolean("com_braze_handle_push_deep_links_automatically", config.willHandlePushDeepLinksAutomatically);
        putBoolean("com_braze_enable_location_collection", config.isLocationCollectionEnabled);
        putInt("com_braze_data_flush_interval_bad_network", config.badNetworkInterval);
        putInt("com_braze_data_flush_interval_good_network", config.goodNetworkInterval);
        putInt("com_braze_data_flush_interval_great_network", config.greatNetworkInterval);
        putString("com_braze_default_notification_channel_name", config.defaultNotificationChannelName);
        putString("com_braze_default_notification_channel_description", config.defaultNotificationChannelDescription);
        putBoolean("com_braze_push_deep_link_back_stack_activity_enabled", config.isPushDeepLinkBackStackActivityEnabled);
        putString("com_braze_push_deep_link_back_stack_activity_class_name", config.pushDeepLinkBackStackActivityClassName);
        putBoolean("com_braze_session_start_based_timeout_enabled", config.isSessionStartBasedTimeoutEnabled);
        putBoolean("com_braze_firebase_cloud_messaging_registration_enabled", config.isFirebaseCloudMessagingRegistrationEnabled);
        putString("com_braze_firebase_cloud_messaging_sender_id", config.firebaseCloudMessagingSenderIdKey);
        putBoolean("com_braze_content_cards_unread_visual_indicator_enabled", config.isContentCardsUnreadVisualIndicatorEnabled);
        putBoolean("com_braze_device_object_whitelisting_enabled", config.isDeviceObjectAllowlistEnabled);
        putBoolean("com_braze_device_in_app_message_accessibility_exclusive_mode_enabled", config.isInAppMessageAccessibilityExclusiveModeEnabled);
        putBoolean("com_braze_push_wake_screen_for_notification_enabled", config.isPushWakeScreenForNotificationEnabled);
        putBoolean("com_braze_push_notification_html_rendering_enabled", config.isPushHtmlRenderingEnabled);
        putBoolean("com_braze_does_push_story_dismiss_on_click", config.doesPushStoryDismissOnClick);
        putBoolean("com_braze_geofences_enabled", config.areGeofencesEnabled);
        putBoolean("com_braze_in_app_message_push_test_eager_display_enabled", config.isInAppMessageTestPushEagerDisplayEnabled);
        putString("com_braze_custom_html_webview_activity_class_name", config.customHtmlWebViewActivityClassName);
        putBoolean("com_braze_automatic_geofence_requests_enabled", config.areAutomaticGeofenceRequestsEnabled);
        putInt("com_braze_in_app_message_webview_client_max_onpagefinished_wait_ms", config.inAppMessageWebViewClientMaxOnPageFinishedWaitMs);
        putBoolean("com_braze_firebase_messaging_service_automatically_register_on_new_token", config.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled);
        putBoolean("com_braze_sdk_authentication_enabled", config.isSdkAuthEnabled);
        putBoolean("com_braze_require_touch_mode_for_html_in_app_messages", config.isTouchModeRequiredForHtmlInAppMessages);
        putBoolean("com_braze_html_in_app_message_apply_insets", config.isHtmlInAppMessageApplyWindowInsetsEnabled);
        putBoolean("com_braze_html_in_app_message_enable_html_link_target", config.isHtmlInAppMessageHtmlLinkTargetEnabled);
        putEnumSet(config.deviceObjectAllowlist, "com_braze_device_object_whitelist");
        putEnumSet(config.customLocationProviderNames, "com_braze_custom_location_providers_list");
        putBoolean("com_braze_prevent_in_app_message_display_for_different_user", config.shouldPreventInAppMessageDisplayForDifferentUsers);
        EnumSet<BrazeSdkMetadata> enumSet = config.brazeSdkMetadata;
        if (enumSet != null) {
            updateEnumSetData("com_braze_sdk_metadata", enumSet);
        }
        putBoolean("com_braze_fallback_firebase_cloud_messaging_service_enabled", config.isFallbackFirebaseMessagingServiceEnabled);
        putString("com_braze_fallback_firebase_cloud_messaging_service_classpath", config.fallbackFirebaseMessagingServiceClasspath);
        putBoolean("com_braze_optin_when_push_authorized", config.shouldOptInWhenPushAuthorized);
        putBoolean("com_braze_use_activity_window_flag_secure", config.shouldUseWindowFlagSecureInActivities);
        applyEdit();
        BrazeInternal.INSTANCE.getConfigurationProvider(this.context).resetCache$android_sdk_base_release();
    }

    public final void setEditor(SharedPreferences.Editor editor) {
        this.editor = editor;
    }

    public final void startEdit() {
        this.editor = this.storageMap.edit();
    }

    public final <T extends Enum<T>> void updateEnumSetData(String key, EnumSet<T> updateValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(updateValue, "updateValue");
        Set<String> stringSetValue = getStringSetValue(key, new HashSet());
        if (stringSetValue != null) {
            stringSetValue.addAll(com.braze.support.e.a(updateValue));
        }
        this.storageMap.edit().putStringSet(key, stringSetValue).apply();
    }
}
