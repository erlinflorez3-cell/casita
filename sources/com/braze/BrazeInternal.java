package com.braze;

import android.content.Context;
import android.content.Intent;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.GeofenceTransitionType;
import com.braze.events.InAppMessageEvent;
import com.braze.models.IBrazeLocation;
import com.braze.models.push.BrazeNotificationPayload;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
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
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjG<LeN/ZS@\u000fsڔ<$q$yCAU\"}8\tWNmgvJp\u000bK\u000f\f\u0018\u0001j:P]xc\u0013\u00172XoG\u074cUoS9ht<\u0006(288\u0002\u0005\u0007\u001a2H&v\u0003CQ\r\u001a0NyBR\u0013O\u000bݍ\u0012\u001c̄P\u0001L[(S<Hǰa:=#K\nPO?_^~}\u0011TW?\r%eN/N<M\u0015SY3\r`bW\u0005Upk\u000b/,o9W{o6\u0007\u0002D\u00199R%]!*#\n\u001al\u001a0CO\u0012U\u0001\u00126z\u0013{;@L\u001c\u00142`.[&\u0017\f\u001c6\rr\u0002D\u0017\u0002'X\u000e\by6E'079<3f\u007fek\u001d\\E\u0014\u0005;-i\u000677id&`C\u001d\u0005{_4i@kL~\u000egN\u0006\u0004\u001ftH/LDU\u0013G{?0G)E^Q#Oo2LR{\u000f\u0005\u000fn\u001c\u0006`]X\"\u001d\u0018g.\u0017\u000frD\u0013\t\u001cTblD\u0011{\"\u0005\u000b\f\u001e+ \u000b\u000f\u0005-3(fO\u0017k\u001bQk\r=/\u0015;\"\u000by'o9\r5eUq\u0013yR%\u0018o@p\u001fpfpn<^jD:2v\bX\u0016\nbf\fA4ou*7D1G`EL\u0011=ZA+\u000f\u0010^v0\u0017TaEInl\t\u0017#h\\\u001fq\u0018|W/\u0015`P1qUC<>UP\r|\u000b1,\u0017s.I\u0018PUO\u0005\u0016$YB%^0GwG=A\u0011/-@\u0005EEzv\u0016U[#?z+\fU@1Du.\u0003pZb\u001bN]W/\"%b#'\u0016\f\u0018y\u0010nAL,j\u0019\u0005VI!\u0005\n@\\;\u0015\u0005M\"U\u0005}E\u00155[gm\"^\f\"Y-a\f\u0012 2\be'&#i40qA\bb\u007fcя?d"}, d2 = {"\u001ab^:\")KO.~D;9x\u001e/I\t7{M\n\u0013\u001e\u001d", "", "u(E", "/cS X9BO \u0003\u0010^+Z\u00138t\u007f1\u000b\u001e|$\u00166y{K\u000121[}", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Ada6T3Bh\u0019}XZ9{m=o\t", "", "CrT?<+", "/o_9l\u0017>\\\u0018\u0003\u0004`\u0019\r\u0012>i\b(YJ\n\u0018\u001bI\u007f\u001b8\u0006)?b", "5dc\u0010b5?W\u001b\u000f\bZ;\u0001\u00138P\r2\rD\u007f\u0017$", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;o&;IR?u=\t\"rr=\u0006c9$", "5dc\u0016a:MO\"|z", "\u001ab^:\")KO.~D;9x\u001e/;", "6`]1_,\"\\t\n\u0006F,\u000b\u0017+g\u007f\u0017{N\u0010\u0002'Ur", "7mc2a;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", ":nV\u0019b*:b\u001d\t\u0004K,z\u0013<d\u007f'[Q\u0001 &", ":nR.g0H\\", "\u001ab^:\")KO.~Df6{\t6sI\fXM|,\u0017.y\f8\u0006)?bS", ":nV\u001dh:A1\u0015\u0007\u0006Z0~\u0012", "1`\\=T0@\\|}", ":nV\u001dh:A2\u0019\u0006~o,\n\u001d", "E`XAG0FS\u0001\r", "", ">da3b9F>)\r}=,\u0004\r@e\r<\\G\u0011%\u001a", ">tQ9\\:A0&z\u0010^\u0017\r\u00172A}7\u007fJ\n", ">tb54*MW#\bir7|", "\u001ab^:\")KO.~D^5\r\u0011=/\\5wU\u0001\u0002'UrmMv.DH\u0012+7C", ">`h9b(=", "\u001ab^:\")KO.~Df6{\t6sI3\fN\u0004`sTk#<_/D]~$5i%2WL&gH%\u001fd`\u000f", "@dR<e+ S#\u007fzg*|w<a\t6\u007fO\u0005! ", "5d^3X5<S|}", "BqP;f0MW#\bir7|", "\u001ab^:\")KO.~D^5\r\u0011=/a(\u0006A\u0001 \u0015G^\u001b8\u007f39h\u0002*@\\*9M\u0019", "@dT;d<>c\u0019b\u0004:7\bp/s\u000e$}@", "7m0=c\u0014>a'z|^\f\u000e\t8t", "\u001ab^:\")KO.~D^=|\u0012>sI\f\u0005\u001c\f\"~G}\u001c8x%\u0015j})FC", "@dU?X:A4\u0019z\nn9|i6a\u00026", "@d`BX:M5\u0019\t{^5z\t\u001ce\u00015{N\u0004", "7f]<e,+O(~ab4\u0001\u0018", "", "@dc?l\u0010G/$\nb^:\u000b\u00051e", "D`[6W(MSt\byL;\u0007\u0016/P\u00106~$\u007f", ">tb5<+", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BrazeInternal {
    public static final BrazeInternal INSTANCE = new BrazeInternal();

    private BrazeInternal() {
    }

    @JvmStatic
    public static final void addSerializedContentCardToStorage(Context context, String serializedCardJson, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serializedCardJson, "serializedCardJson");
        INSTANCE.getInstance(context).addSerializedCardJsonToStorage$android_sdk_base_release(serializedCardJson, str);
    }

    @JvmStatic
    public static final void applyPendingRuntimeConfiguration(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.getInstance(context).applyPendingRuntimeConfiguration$android_sdk_base_release();
    }

    private final Braze getInstance(Context context) {
        return Braze.Companion.getInstance(context);
    }

    @JvmStatic
    public static final void handleInAppMessageTestPush(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        INSTANCE.getInstance(context).handleInAppMessageTestPush$android_sdk_base_release(intent);
    }

    @JvmStatic
    public static final void logLocationRecordedEvent(Context context, IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        INSTANCE.getInstance(context).logLocationRecordedEventFromLocationUpdate$android_sdk_base_release(location);
    }

    @JvmStatic
    public static final void recordGeofenceTransition(Context context, String geofenceId, GeofenceTransitionType transitionType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(geofenceId, "geofenceId");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        INSTANCE.getInstance(context).recordGeofenceTransition$android_sdk_base_release(geofenceId, transitionType);
    }

    @JvmStatic
    public static final void refreshFeatureFlags(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.getInstance(context).refreshFeatureFlags();
    }

    @JvmStatic
    public static final void requestGeofenceRefresh(Context context, IBrazeLocation location) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        INSTANCE.getInstance(context).requestGeofenceRefresh$android_sdk_base_release(location);
    }

    @JvmStatic
    public static final void requestGeofenceRefresh(Context context, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        INSTANCE.getInstance(context).requestGeofenceRefresh$android_sdk_base_release(z2);
    }

    @JvmStatic
    public static final void retryInAppMessage(Context context, InAppMessageEvent inAppMessageEvent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessageEvent, "inAppMessageEvent");
        INSTANCE.getInstance(context).retryInAppMessage$android_sdk_base_release(inAppMessageEvent);
    }

    public final BrazeConfigurationProvider getConfigurationProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getInstance(context).getConfigurationProviderSafe$android_sdk_base_release(context);
    }

    public final /* synthetic */ void logPushCampaign(Context context, String campaignId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        getInstance(context).logPushMaxCampaign$android_sdk_base_release(campaignId);
    }

    public final /* synthetic */ void logPushDelivery(Context context, String campaignId, long j2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        getInstance(context).logPushDelivery$android_sdk_base_release(campaignId, j2);
    }

    public final /* synthetic */ void performPushDeliveryFlush(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        getInstance(context).performPushDeliveryFlush$android_sdk_base_release();
    }

    public final /* synthetic */ void publishBrazePushAction(Context context, BrazePushEventType pushActionType, BrazeNotificationPayload payload) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pushActionType, "pushActionType");
        Intrinsics.checkNotNullParameter(payload, "payload");
        getInstance(context).publishBrazePushAction$android_sdk_base_release(pushActionType, payload);
    }

    public final void reenqueueInAppMessage(Context context, InAppMessageEvent inAppMessageEvent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessageEvent, "inAppMessageEvent");
        getInstance(context).reenqueueInAppMessage$android_sdk_base_release(inAppMessageEvent);
    }

    public final /* synthetic */ boolean validateAndStorePushId(Context context, String pushId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        return getInstance(context).validateAndStorePushId$android_sdk_base_release(pushId);
    }
}
