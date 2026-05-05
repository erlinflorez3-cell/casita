package com.braze.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.LocationProviderName;
import com.braze.models.IBrazeLocation;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.braze.support.PermissionUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.EnumSet;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorsKt;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

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
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0015\"4ߚ\u007f\u0007|jAӄLe^.Zݷ2\u000fy\u0005<$a$yCQU\"Ԃ*\teNo˧vJh\u0017K\u000f\f\u0018\u0001j:I]xc\u0012\u00172XoG3coE9vt>\u0005&68\u0600\u0018$1\u001aXGHu\u001a\u0004Në\u00160Np\u0003b\u001bZ\u001d\u001c(\u0005l.1\"jrf6vx$?wO\u0011xZP=^^\r}\u0011T_?\r%mN5NHM\u001b5U\u0013\u0007\u0001^m\u0005ouK\u0017\u0001'U4yweIp\u007fB\u001ess\u001bq\u000b&\u000b\u001a\u0002d\u001a-CO\u0012R\u0001\u00186\t\u0013\u0002\u001d>\u0014\u000e4*v0]\u001et\f&3#w\u001aT\u0019+lX\u0018z\u0010?GD\u000eJCT+wapi2\u05ee;\u0006\u000b'.)\u0007\n1]Z\u0014\u00071+V\bQ_fnU\u000fbRgK\u000b\u001cp\u0011\u0017Z\b>e\u0018/*!t\u0017uIi:;'{\u0004XD\u0016y3b?\u05c8\u0016ʐL@*ÂfC8\r$Zri[ߛ|Ԝ\\,\u0019۳l`\u0015\u0004 \u0013NcN˖Mٚ\u0014NWŖ:|[e\"%]om\u001aE\u008b\u0010Ć=bK7Wk\u001ek#\u0003\"JTb3d=̾\u007f۱^\\0ίĞL\u000b"}, d2 = {"\u001ab^:\")KO.~De6z\u0005>i\n1E\u001d\u000e\u0013,GS\u0017Kv2>U\u0005\u0007Ak\u0012=QMDG?\"j", "\u001ab^:\")KO.~De6z\u0005>i\n1E$]$\u0013\\otFt!D]\b)\u0013x\u001a\u0004", "u(E", "/k[<j,=:#|vm0\u0007\u0012\u001ar\n9\u007f?\u0001$%", "\u001aiPCTuNb\u001d\u0006D>5\r\u0011\u001de\u000f}", "\u001ab^:\")KO.~D^5\r\u0011=/f2y<\u0010\u001b!PZ\u001bF\b)4Y\u000b\t3u\u0016\u0004", "/o_\u0010b5?W\u001b\u000f\bZ;\u0001\u00138P\r2\rD\u007f\u0017$", "\u001ab^:\")KO.~D\\6\u0006\n3g\u00105wO\u0005! \u0011L\u001b8\f%\u0013c\u0007!;o&;IR?u=\t\"rr=\u0006c9$", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7r;<V(MW#\bXh3\u0004\t-t\u00042\u0005 \n\u0013\u0014No\r", "", "u(I", ":nR.g0H\\\u0001z\u0004Z.|\u0016", "\u001a`]1e6BRb\u0006\u0005\\(\f\r9nI\u000f\u0006>|&\u001bQxu8\u007f!7Y\u000bu", "5dc\u0019T:M9\"\t\rg\u000e\b\u0017\u0016o}$\u000bD\u000b zH`\nCz$", "\u001a`]1e6BRb\u0006\u0005\\(\f\r9nI\u000f\u0006>|&\u001bQxc", "5dc h0MO\u0016\u0006zE6z\u0005>i\n1fM\u000b(\u001bFo\u001b", "", "/k[<j,=>&\t\fb+|\u0016=", "6`b\u0013\\5>>\u0019\f\u0003b:\u000b\r9n", "6`b\u0010b(Ka\u0019izk4\u0001\u0017=i\n1", "7mXAJ0MVv\t\u0004m,\u0010\u0018", "", "@d`BX:MA\u001d\b|e,c\u0013-a\u000f,\u0006Ip\"\u0016C~\u000e", ";`]BT3%]\u0017z\nb6\u0006x:d{7{\u001e|\u001e\u001eDk\fB", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001ab^:\")KO.~Df6{\t6sI\fXM|,\u0017.y\f8\u0006)?bS", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", ":nR.g0H\\", "@d`BX:MA\u001d\b|e,l\u0014.a\u000f(\\M\u000b\u001f}Qm\nKz/>Ay)3o\u0016;", ">q^C\\+>`", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&3\u0007\u0007+t\u00042\u0005:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BrazeInternalLocationApi implements IBrazeLocationApi {
    public static final Companion Companion = new Companion(null);
    public static final int LAST_KNOWN_GPS_LOCATION_MAX_AGE_MS = 600000;
    private EnumSet<LocationProviderName> allowedLocationProviders;
    private BrazeConfigurationProvider appConfigurationProvider;
    private Context context;
    private LocationManager locationManager;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\")KO.~De6z\u0005>i\n1E\u001d\u000e\u0013,GS\u0017Kv2>U\u0005\u0007Ak\u0012=QMDG?\"SFkA\u0012_5R\u00010\u001d", "", "u(E", "\u001a@B!R\u0012'=\u000bgt@\u0017j\u0003\u0016O]\u0004j$j\u007f\u0011/K\u00016R\u0007\u0015Se\u000e", "", "/mS?b0=\u001b'}\u0001&3\u0007\u0007+t\u00042\u0005:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final boolean isLocationCollectionEnabled() {
        BrazeConfigurationProvider brazeConfigurationProvider = this.appConfigurationProvider;
        if (brazeConfigurationProvider == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appConfigurationProvider");
            brazeConfigurationProvider = null;
        }
        if (brazeConfigurationProvider.isLocationCollectionEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeInternalLocationApi.isLocationCollectionEnabled.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Location collection enabled via sdk configuration.";
                }
            }, 6, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeInternalLocationApi.isLocationCollectionEnabled.2
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Location collection disabled via sdk configuration.";
            }
        }, 6, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestSingleLocationUpdate$lambda$0(BrazeInternalLocationApi this$0, Function1 manualLocationUpdateCallback, final Location location) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(manualLocationUpdateCallback, "$manualLocationUpdateCallback");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this$0, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeInternalLocationApi$requestSingleLocationUpdate$6$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Location manager getCurrentLocation got location: " + location;
            }
        }, 7, (Object) null);
        if (location != null) {
            manualLocationUpdateCallback.invoke(new BrazeLocation(location));
        }
    }

    private final void requestSingleUpdateFromLocationManager(String str) {
        Intent intent = new Intent(Constants.BRAZE_ACTION_RECEIVER_SINGLE_LOCATION_UPDATE_INTENT_ACTION);
        Context context = this.context;
        LocationManager locationManager = null;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        Intent intent2 = intent.setClass(context, BrazeActionReceiver.class);
        Intrinsics.checkNotNullExpressionValue(intent2, "Intent(Constants.BRAZE_A…tionReceiver::class.java)");
        int mutablePendingIntentFlags = 134217728 | IntentUtils.getMutablePendingIntentFlags();
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context2 = null;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context2, 0, intent2, mutablePendingIntentFlags);
        LocationManager locationManager2 = this.locationManager;
        if (locationManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationManager");
        } else {
            locationManager = locationManager2;
        }
        locationManager.requestSingleUpdate(str, broadcast);
    }

    public final Location getLastKnownGpsLocationIfValid(LocationManager locationManager) {
        final Location lastKnownLocation;
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        if (!locationManager.isProviderEnabled("gps") || (lastKnownLocation = locationManager.getLastKnownLocation("gps")) == null) {
            return null;
        }
        final long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds() - lastKnownLocation.getTime();
        if (jNowInMilliseconds > 600000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeInternalLocationApi.getLastKnownGpsLocationIfValid.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Last known GPS location is too old and will not be used. Age ms: " + jNowInMilliseconds;
                }
            }, 6, (Object) null);
            return null;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeInternalLocationApi.getLastKnownGpsLocationIfValid.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Using last known GPS location: " + lastKnownLocation;
            }
        }, 7, (Object) null);
        return lastKnownLocation;
    }

    public final String getSuitableLocationProvider(LocationManager locationManager, EnumSet<LocationProviderName> allowedProviders, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        if (z2 && allowedProviders.contains(LocationProviderName.GPS) && locationManager.isProviderEnabled("gps")) {
            return "gps";
        }
        if ((z3 || z2) && allowedProviders.contains(LocationProviderName.NETWORK) && locationManager.isProviderEnabled("network")) {
            return "network";
        }
        if (z2 && allowedProviders.contains(LocationProviderName.PASSIVE) && locationManager.isProviderEnabled("passive")) {
            return "passive";
        }
        return null;
    }

    @Override // com.braze.location.IBrazeLocationApi
    public void initWithContext(Context context, EnumSet<LocationProviderName> enumSet, BrazeConfigurationProvider brazeConfigurationProvider) throws Throwable {
        Intrinsics.checkNotNullParameter(context, EO.Od("xRU\u0002\u0015|J", (short) (FB.Xd() ^ 11676)));
        Intrinsics.checkNotNullParameter(enumSet, C1561oA.Qd(")324;(&\u00112.4&  ,,", (short) (OY.Xd() ^ 6768)));
        short sXd = (short) (C1607wl.Xd() ^ 32737);
        short sXd2 = (short) (C1607wl.Xd() ^ 23661);
        int[] iArr = new int["N^_3``Y]\\kiYmcjjMpnvjfhv".length()];
        QB qb = new QB("N^_3``Y]\\kiYmcjjMpnvjfhv");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Intrinsics.checkNotNullParameter(brazeConfigurationProvider, new String(iArr, 0, i2));
        this.context = context;
        this.appConfigurationProvider = brazeConfigurationProvider;
        this.allowedLocationProviders = enumSet;
        Object[] objArr = {C1561oA.od("\u001c\u001e\u0011\u000e \u0014\u0019\u0017", (short) (C1633zX.Xd() ^ (-25748)))};
        Method method = Class.forName(C1561oA.Kd("~\r\u0004\u0013\u0011\f\bR\t\u0016\u0016\u001d\u000f\u0019 Zp\u001e\u001e%\u0017+(", (short) (Od.Xd() ^ (-6849)))).getMethod(C1561oA.Xd("ON^>e`bT]DWej^Y\\", (short) (Od.Xd() ^ (-22614))), Class.forName(Wg.Zd("4\u000f\u000bl$R.\"\u0016;X`Y/\u001b\u0010", (short) (ZN.Xd() ^ 17100), (short) (ZN.Xd() ^ 25411))));
        try {
            method.setAccessible(true);
            Object objInvoke = method.invoke(context, objArr);
            Intrinsics.checkNotNull(objInvoke, Wg.vd(",4()Y\u001e\u0019'468d$(_$/B@l>:g7EE\u0001CG?<pRXLBy<F=XVMI\u0010OODOcU\\X\u00194XYXh^aa=Rk_bak", (short) (Od.Xd() ^ (-12180))));
            this.locationManager = (LocationManager) objInvoke;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.braze.location.IBrazeLocationApi
    public boolean requestSingleLocationUpdate(final Function1<? super IBrazeLocation, Unit> manualLocationUpdateCallback) {
        Intrinsics.checkNotNullParameter(manualLocationUpdateCallback, "manualLocationUpdateCallback");
        if (!isLocationCollectionEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeInternalLocationApi.requestSingleLocationUpdate.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Did not request single location update. Location collection is disabled.";
                }
            }, 6, (Object) null);
            return false;
        }
        Context context = this.context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        boolean zHasPermission = PermissionUtils.hasPermission(context, "android.permission.ACCESS_FINE_LOCATION");
        Context context2 = this.context;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context2 = null;
        }
        boolean zHasPermission2 = PermissionUtils.hasPermission(context2, "android.permission.ACCESS_COARSE_LOCATION");
        if (!zHasPermission2 && !zHasPermission) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeInternalLocationApi.requestSingleLocationUpdate.2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Did not request single location update. Neither fine nor coarse location permissions found.";
                }
            }, 6, (Object) null);
            return false;
        }
        if (zHasPermission) {
            LocationManager locationManager = this.locationManager;
            if (locationManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("locationManager");
                locationManager = null;
            }
            final Location lastKnownGpsLocationIfValid = getLastKnownGpsLocationIfValid(locationManager);
            if (lastKnownGpsLocationIfValid != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeInternalLocationApi.requestSingleLocationUpdate.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Setting user location to last known GPS location: " + lastKnownGpsLocationIfValid;
                    }
                }, 7, (Object) null);
                manualLocationUpdateCallback.invoke(new BrazeLocation(lastKnownGpsLocationIfValid));
                return true;
            }
        }
        LocationManager locationManager2 = this.locationManager;
        if (locationManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("locationManager");
            locationManager2 = null;
        }
        EnumSet<LocationProviderName> enumSet = this.allowedLocationProviders;
        if (enumSet == null) {
            Intrinsics.throwUninitializedPropertyAccessException("allowedLocationProviders");
            enumSet = null;
        }
        final String suitableLocationProvider = getSuitableLocationProvider(locationManager2, enumSet, zHasPermission, zHasPermission2);
        if (suitableLocationProvider == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeInternalLocationApi.requestSingleLocationUpdate.4
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Could not request single location update. Could not find suitable location provider.";
                }
            }, 7, (Object) null);
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeInternalLocationApi.requestSingleLocationUpdate.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Requesting single location update with provider: " + suitableLocationProvider;
            }
        }, 7, (Object) null);
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                LocationManager locationManager3 = this.locationManager;
                if (locationManager3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("locationManager");
                    locationManager3 = null;
                }
                locationManager3.getCurrentLocation(suitableLocationProvider, null, ExecutorsKt.asExecutor(Dispatchers.getIO()), new Consumer() { // from class: com.braze.location.BrazeInternalLocationApi$$ExternalSyntheticLambda0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        BrazeInternalLocationApi.requestSingleLocationUpdate$lambda$0(this.f$0, manualLocationUpdateCallback, (Location) obj);
                    }
                });
            } else {
                requestSingleUpdateFromLocationManager(suitableLocationProvider);
            }
            return true;
        } catch (SecurityException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeInternalLocationApi.requestSingleLocationUpdate.7
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to request single location update due to security exception from insufficient permissions.";
                }
            }, 4, (Object) null);
            return false;
        } catch (Exception e3) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e3, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeInternalLocationApi.requestSingleLocationUpdate.8
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to request single location update due to exception.";
                }
            }, 4, (Object) null);
            return false;
        }
    }
}
