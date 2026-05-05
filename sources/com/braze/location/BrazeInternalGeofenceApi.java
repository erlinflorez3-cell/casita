package com.braze.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.braze.Constants;
import com.braze.models.BrazeGeofence;
import com.braze.support.IntentUtils;
import com.google.android.gms.location.LocationServices;
import java.util.List;
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
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN.ZS8-s{J$c$wFQ٥J}P\b\u0010Q˗knXZSQ\u001d\u0007.x\u0019.yY\u0007`*\u000f`F6S{[}BQ`#<5$@%Py3\u0005`>\u00114\u0005\u0002[K:\u0014`D~=j\r{\tJ\u001c\u0014F8\u0007.^wNdR\u001bfj31\u000e\u0002B|-&DEc\u001bRl';x\u0012\"9MO5C)\u0004\u0007\u0015`s?1E8Qބl6"}, d2 = {"\u001ab^:\")KO.~De6z\u0005>i\n1E\u001d\u000e\u0013,GS\u0017Kv2>U\u0005\u00027w\u0017.VA;G?\"j", "\u001ab^:\")KO.~De6z\u0005>i\n1E$]$\u0013\\oo<\u0001&5b{ \u0013x\u001a\u0004", "u(E", "2d[2g,+S\u001b\u0003\tm,\n\t.G\u007f2|@\n\u0015\u0017%k\f?v", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u0014X6?S\"|zM9x\u0012=i\u000f,\u0006Ik\u0017 Fs\u0017>Z.DY\u0007/", "\u001a`]1e6BRbz\u0006iug\t8d\u00041}$\n&\u0017P~c", "@dV6f;>`z~\u0005_,\u0006\u0007/s", "5d^3X5<S\u007f\u0003\tm", "", "\u001ab^:\")KO.~Df6{\t6sI\u0005\t<\u0016\u0017xGy\u000f<\u007f#5/", "5d^3X5<S\u0006~\u0007n,\u000b\u0018\u0013n\u000f(\u0005O", "BdP?W6P\\z~\u0005_,\u0006\u0007/s", "/o_9\\*:b\u001d\t\u0004<6\u0006\u0018/x\u000f", "7mc2a;", "/mS?b0=\u001b'}\u0001&3\u0007\u0007+t\u00042\u0005:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BrazeInternalGeofenceApi implements IBrazeGeofenceApi {
    @Override // com.braze.location.IBrazeGeofenceApi
    public void deleteRegisteredGeofenceCache(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        GooglePlayLocationUtils.deleteRegisteredGeofenceCache(context);
    }

    @Override // com.braze.location.IBrazeGeofenceApi
    public PendingIntent getGeofenceTransitionPendingIntent(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intent = new Intent(Constants.BRAZE_ACTION_RECEIVER_GEOFENCE_UPDATE_INTENT_ACTION).setClass(context, BrazeActionReceiver.class);
        Intrinsics.checkNotNullExpressionValue(intent, "Intent(Constants.BRAZE_A…tionReceiver::class.java)");
        int mutablePendingIntentFlags = IntentUtils.getMutablePendingIntentFlags();
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, (134217728 + mutablePendingIntentFlags) - (134217728 & mutablePendingIntentFlags));
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(context, 0, geofenceIntent, flags)");
        return broadcast;
    }

    @Override // com.braze.location.IBrazeGeofenceApi
    public void registerGeofences(Context context, List<BrazeGeofence> geofenceList, PendingIntent geofenceRequestIntent) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(geofenceList, "geofenceList");
        Intrinsics.checkNotNullParameter(geofenceRequestIntent, "geofenceRequestIntent");
        GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary$default(context, geofenceList, geofenceRequestIntent, null, null, 24, null);
    }

    @Override // com.braze.location.IBrazeGeofenceApi
    public void teardownGeofences(Context applicationContext, PendingIntent intent) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(intent, "intent");
        LocationServices.getGeofencingClient(applicationContext).removeGeofences(intent);
    }
}
