package com.braze.location;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import com.braze.managers.BrazeGeofenceManager;
import com.braze.managers.IBrazeGeofenceLocationUpdateListener;
import com.braze.models.BrazeGeofence;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.support.BrazeLogger;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.hg;

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
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u0012\u007fјnjO0L͜P.hS2\u000fq|<$iByCQU\"Ԃ*\teNogtKb\u000bY\u000f\u000e\u0016~o4Ikxe\u0012\u00153Hū?Iݹ =g_5;\u000b ݨ&8\b\u0005I(8K(v)G{\u0010 5XphXSRM- \rV /&\rk\\;`l\f@u\"ɨmBT0(T\u000bW%F\u0003+=zo#C@e;E/a\u000e\u001fXkA\u0013? J3tW+9W\fWdgF\u0014]\b]\u001durT`5Un\u0011?+}i{Z\u001c9\u0010\u0001\f\u000fL\u0004<\u0013UT^1(t \u000ea\u0004#kFP\u0010pZ\u0012\u000biF\u001d5\u0002C+g\u001d\u0015]q=)Ne\u007f3 N;\u0007n/ol p\u001d+Z\bSAQnJvZ\u001a[Mm2t\u0011\u0015p\txc\u000eD\u0014\u0011\\\u001bU;i>;!\u001a\bxNu\r\u001dfxUyRvBPz\\7r*\u001aq\\d3o\u0001Xf1)MJZ7\b\u0016)8b\b>1%>P}t0iܷa\n+G/Mg\b\u0004\u000e\u0006=\u000f7CV{\u0010\u0010X'\u0018MVz\u0005\u0007\u0002\tXT{jD:2vn@{\nIf\fA8o{*?D7)^%H1+pMC\bރ^h\u0016\u001c%?2\u0004\u0002$#\u000bWˉ/ʼsg\u0001̢ؼ\u0001~"}, d2 = {"\u001ab^:\")KO.~De6z\u0005>i\n1E\"\u000b!\u0019NoxCr9\u001cc{\u001cFq 7=R?rBs", "", "u(E", " D6\u0016F\u001b\u001e@x]t@\ffi\u000fN]\bu.cr\u0004'N\b'c\u0005\u0016Gw\u0007!Kq\u001d1-$", "", "2d[2g,+S\u001b\u0003\tm,\n\t.G\u007f2|@\n\u0015\u0017%k\f?v", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u001fX.Ba(~\b^+^\t9f\u007f1y@n\u001a\u0013To\r'\u0004%6g", "\u001a`]1e6BRb|\u0005g;|\u0012>/m+wM\u0001\u0016\u0002To\u000f<\u0004%>W}.\r", "5dc\u001fX.Ba(~\b^+^\t9f\u007f1y@n\u001a\u0013To\r'\u0004%6g<\u001c@l#8QB5y3$\u000fok7\u0003r0X\u007f!TLU,X`r", "@dV6f;>`z~\u0005_,\u0006\u0007/sq,\u000bCb\u0017!Ho\u0017:z.77\u0005$7v%", "<df\u0014X6?S\"|zl\u001b\u0007u/g\u00046\u000b@\u000e", "", "\u001ab^:\")KO.~Df6{\t6sI\u0005\t<\u0016\u0017xGy\u000f<\u007f#5/", "5d^3X5<S\u0006~\u0007n,\u000b\u0018\u0013n\u000f(\u0005O", "\u001a`]1e6BRbz\u0006iug\t8d\u00041}$\n&\u0017P~c", "@dV6f;>`z~\u0005_,\u0006\u0007/sq,\u000bCb!!Iv\u000e'}!I=~\t7k\u0016<[?H\u007f", "2db6e,=5\u0019\t{^5z\t=T\n\u0015{B\u0005%&G|", "@d\\<i(E4)\bxm0\u0007\u0012", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "@dV6f;>`y\u000f\u0004\\;\u0001\u00138", "@d\\<i, S#\u007fzg*|\u0017\u0010r\n0iC|$\u0017FZ\u001b<w3", "=ab<_,MSz~\u0005_,\u0006\u0007/I~6", "@d\\<i, S#\u007fzg*|\u0017\u001ce\u0002,\nO\u0001$\u0017Fa\u0012Ky\u00075c~ @k\u001a7O!Bo4'$", "@d\\<i, S#\u007fzg*|\u0017\u001ce\u0002,\nO\u0001$\u0017Fa\u0012Ky\u00075c~ @k\u001a7O!Bo4'$']B\u0006p6Ru!UKT&c\\p9#\u0016d\u0017H8\r\fY=2n", "@d`BX:MA\u001d\b|e,c\u0013-a\u000f,\u0006Ip\"\u0016C~\u000e\u001d\u0004/=;\b*9t\u0016\u0019T?O", "@dbB_;%W'\u000ezg,\n", "\u001ab^:\")KO.~Df(\u0006\u00051e\r6E$]$\u0013\\oo<\u0001&5b{ \u001ew\u0014*\\GEt$)\u0014dp9mg:]v0GY$", "As^?X\u000e>]\u001a~\u0004\\,\u000bw9S\u0003$\t@\u007f\u0002$Gp\u001c", "As^?X\u000e>]\u001a~\u0004\\,\u000bw9S\u0003$\t@\u007f\u0002$Gp\u001czr.4f\b$6g$-S=Bu2\u001a$lkB\u0001p,Uv#UL", "/mS?b0=\u001b'}\u0001&3\u0007\u0007+t\u00042\u0005:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class GooglePlayLocationUtils {
    public static final GooglePlayLocationUtils INSTANCE = new GooglePlayLocationUtils();
    private static final String REGISTERED_GEOFENCE_SHARED_PREFS_LOCATION = "com.appboy.support.geofences";

    private GooglePlayLocationUtils() {
    }

    @JvmStatic
    public static final void deleteRegisteredGeofenceCache(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        GooglePlayLocationUtils googlePlayLocationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) googlePlayLocationUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils.deleteRegisteredGeofenceCache.1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Deleting registered geofence cache.";
            }
        }, 7, (Object) null);
        googlePlayLocationUtils.getRegisteredGeofenceSharedPrefs$android_sdk_location_release(context).edit().clear().apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerGeofencesWithGeofencingClient(final Context context, final List<BrazeGeofence> list, PendingIntent pendingIntent) {
        List<BrazeGeofence> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(GooglePlayLocationUtilsKt.toGeofence((BrazeGeofence) it.next()));
        }
        GeofencingRequest geofencingRequestBuild = new GeofencingRequest.Builder().addGeofences(arrayList).setInitialTrigger(0).build();
        Intrinsics.checkNotNullExpressionValue(geofencingRequestBuild, "Builder()\n            .a…r(0)\n            .build()");
        Task<Void> taskAddGeofences = LocationServices.getGeofencingClient(context).addGeofences(geofencingRequestBuild, pendingIntent);
        final Function1<Void, Unit> function1 = new Function1<Void, Unit>() { // from class: com.braze.location.GooglePlayLocationUtils.registerGeofencesWithGeofencingClient.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Void r2) {
                invoke2(r2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Void r9) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GooglePlayLocationUtils.INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils.registerGeofencesWithGeofencingClient.1.1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Geofences successfully registered with Google Play Services.";
                    }
                }, 7, (Object) null);
                GooglePlayLocationUtils.INSTANCE.storeGeofencesToSharedPrefs$android_sdk_location_release(context, list);
            }
        };
        taskAddGeofences.addOnSuccessListener(new OnSuccessListener() { // from class: com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$7(function1, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                GooglePlayLocationUtils.registerGeofencesWithGeofencingClient$lambda$8(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerGeofencesWithGeofencingClient$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerGeofencesWithGeofencingClient$lambda$8(Exception exc) {
        if (!(exc instanceof ApiException)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$registerGeofencesWithGeofencingClient$2$6
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Geofence exception encountered while adding geofences.";
                }
            }, 4, (Object) null);
            return;
        }
        final int statusCode = ((ApiException) exc).getStatusCode();
        if (statusCode == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$registerGeofencesWithGeofencingClient$2$4
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Received Geofence registration success code in failure block with Google Play Services.";
                }
            }, 7, (Object) null);
            return;
        }
        switch (statusCode) {
            case 1000:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$registerGeofencesWithGeofencingClient$2$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Geofences not registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: " + statusCode;
                    }
                }, 6, (Object) null);
                break;
            case 1001:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$registerGeofencesWithGeofencingClient$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: " + statusCode;
                    }
                }, 6, (Object) null);
                break;
            case 1002:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$registerGeofencesWithGeofencingClient$2$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Geofences not registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: " + statusCode;
                    }
                }, 6, (Object) null);
                break;
            default:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$registerGeofencesWithGeofencingClient$2$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Geofence pending result returned unknown status code: " + statusCode;
                    }
                }, 6, (Object) null);
                break;
        }
    }

    @JvmStatic
    public static final void registerGeofencesWithGooglePlayIfNecessary(Context context, final List<BrazeGeofence> desiredGeofencesToRegister, PendingIntent geofenceRequestIntent, Function1<? super List<String>, Unit> removalFunction, Function1<? super List<BrazeGeofence>, Unit> registerFunction) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(desiredGeofencesToRegister, "desiredGeofencesToRegister");
        Intrinsics.checkNotNullParameter(geofenceRequestIntent, "geofenceRequestIntent");
        Intrinsics.checkNotNullParameter(removalFunction, "removalFunction");
        Intrinsics.checkNotNullParameter(registerFunction, "registerFunction");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        GooglePlayLocationUtils googlePlayLocationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) googlePlayLocationUtils, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "registerGeofencesWithGooglePlayIfNecessary called with " + desiredGeofencesToRegister;
            }
        }, 6, (Object) null);
        try {
            List<BrazeGeofence> listRetrieveBrazeGeofencesFromLocalStorage = BrazeGeofenceManager.Companion.retrieveBrazeGeofencesFromLocalStorage(googlePlayLocationUtils.getRegisteredGeofenceSharedPrefs$android_sdk_location_release(context));
            List<BrazeGeofence> list = listRetrieveBrazeGeofencesFromLocalStorage;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(((BrazeGeofence) obj).getId(), obj);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listRetrieveBrazeGeofencesFromLocalStorage) {
                BrazeGeofence brazeGeofence = (BrazeGeofence) obj2;
                List<BrazeGeofence> list2 = desiredGeofencesToRegister;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((BrazeGeofence) it.next()).getId(), brazeGeofence.getId())) {
                            break;
                        }
                    }
                }
                arrayList.add(obj2);
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((BrazeGeofence) it2.next()).getId());
            }
            final ArrayList arrayList4 = arrayList3;
            final ArrayList arrayList5 = new ArrayList();
            for (final BrazeGeofence brazeGeofence2 : desiredGeofencesToRegister) {
                BrazeGeofence brazeGeofence3 = (BrazeGeofence) linkedHashMap.get(brazeGeofence2.getId());
                if (brazeGeofence3 == null || !brazeGeofence2.equivalentServerData(brazeGeofence3)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary.4
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Geofence with id: " + brazeGeofence2.getId() + " is new or has been updated.";
                        }
                    }, 7, (Object) null);
                    arrayList5.add(brazeGeofence2);
                }
            }
            if (arrayList4.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary.6
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "No obsolete geofences need to be unregistered from Google Play Services.";
                    }
                }, 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary.5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Un-registering " + arrayList4 + " obsolete geofences from Google Play Services.";
                    }
                }, 7, (Object) null);
                removalFunction.invoke(arrayList4);
            }
            if (arrayList5.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary.8
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "No new geofences need to be registered with Google Play Services.";
                    }
                }, 7, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary.7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Registering " + arrayList5 + " new geofences with Google Play Services.";
                    }
                }, 7, (Object) null);
                registerFunction.invoke(arrayList5);
            }
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary.9
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Exception while adding geofences.";
                }
            }, 4, (Object) null);
        }
    }

    public static /* synthetic */ void registerGeofencesWithGooglePlayIfNecessary$default(final Context context, List list, final PendingIntent pendingIntent, Function1 function1, Function1 function12, int i2, Object obj) throws Throwable {
        if ((8 & i2) != 0) {
            function1 = new Function1<List<? extends String>, Unit>() { // from class: com.braze.location.GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list2) {
                    invoke2((List<String>) list2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<String> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    GooglePlayLocationUtils.INSTANCE.removeGeofencesRegisteredWithGeofencingClient$android_sdk_location_release(context, it);
                }
            };
        }
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            function12 = new Function1<List<? extends BrazeGeofence>, Unit>() { // from class: com.braze.location.GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends BrazeGeofence> list2) {
                    invoke2((List<BrazeGeofence>) list2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<BrazeGeofence> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    GooglePlayLocationUtils.INSTANCE.registerGeofencesWithGeofencingClient(context, it, pendingIntent);
                }
            };
        }
        registerGeofencesWithGooglePlayIfNecessary(context, list, pendingIntent, function1, function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeGeofencesFromSharedPrefs(Context context, List<String> list) {
        SharedPreferences.Editor editorEdit = getRegisteredGeofenceSharedPrefs$android_sdk_location_release(context).edit();
        for (final String str : list) {
            editorEdit.remove(str);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils.removeGeofencesFromSharedPrefs.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Geofence with id: " + str + " removed from shared preferences.";
                }
            }, 6, (Object) null);
        }
        editorEdit.apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeGeofencesRegisteredWithGeofencingClient$lambda$10(Exception exc) {
        if (!(exc instanceof ApiException)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$removeGeofencesRegisteredWithGeofencingClient$2$6
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Geofence exception encountered while removing geofences.";
                }
            }, 4, (Object) null);
            return;
        }
        final int statusCode = ((ApiException) exc).getStatusCode();
        if (statusCode == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$removeGeofencesRegisteredWithGeofencingClient$2$4
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Received Geofence un-registration success code in failure block with Google Play Services.";
                }
            }, 7, (Object) null);
            return;
        }
        switch (statusCode) {
            case 1000:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$removeGeofencesRegisteredWithGeofencingClient$2$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Geofences cannot be un-registered with Google Play Services due to GEOFENCE_NOT_AVAILABLE: " + statusCode;
                    }
                }, 6, (Object) null);
                break;
            case 1001:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$removeGeofencesRegisteredWithGeofencingClient$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Geofences cannot be un-registered with Google Play Services due to GEOFENCE_TOO_MANY_GEOFENCES: " + statusCode;
                    }
                }, 6, (Object) null);
                break;
            case 1002:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$removeGeofencesRegisteredWithGeofencingClient$2$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Geofences cannot be un-registered with Google Play Services due to GEOFENCE_TOO_MANY_PENDING_INTENTS: " + statusCode;
                    }
                }, 6, (Object) null);
                break;
            default:
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$removeGeofencesRegisteredWithGeofencingClient$2$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Geofence pending result returned unknown status code: " + statusCode;
                    }
                }, 6, (Object) null);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeGeofencesRegisteredWithGeofencingClient$lambda$9(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @JvmStatic
    public static final void requestSingleLocationUpdateFromGooglePlay(Context context, final IBrazeGeofenceLocationUpdateListener resultListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resultListener, "resultListener");
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils.requestSingleLocationUpdateFromGooglePlay.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Requesting single location update from Google Play Services.";
                }
            }, 7, (Object) null);
            Task<Location> currentLocation = LocationServices.getFusedLocationProviderClient(context).getCurrentLocation(100, (CancellationToken) null);
            final Function1<Location, Unit> function1 = new Function1<Location, Unit>() { // from class: com.braze.location.GooglePlayLocationUtils.requestSingleLocationUpdateFromGooglePlay.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Location location) {
                    invoke2(location);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Location it) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GooglePlayLocationUtils.INSTANCE, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils.requestSingleLocationUpdateFromGooglePlay.2.1
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Single location request from Google Play services was successful.";
                        }
                    }, 6, (Object) null);
                    IBrazeGeofenceLocationUpdateListener iBrazeGeofenceLocationUpdateListener = resultListener;
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    iBrazeGeofenceLocationUpdateListener.onLocationRequestComplete(new BrazeLocation(it));
                }
            };
            currentLocation.addOnSuccessListener(new OnSuccessListener() { // from class: com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    GooglePlayLocationUtils.requestSingleLocationUpdateFromGooglePlay$lambda$4(function1, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda3
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    GooglePlayLocationUtils.requestSingleLocationUpdateFromGooglePlay$lambda$5(resultListener, exc);
                }
            });
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils.requestSingleLocationUpdateFromGooglePlay.4
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to request location update due to exception.";
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestSingleLocationUpdateFromGooglePlay$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestSingleLocationUpdateFromGooglePlay$lambda$5(IBrazeGeofenceLocationUpdateListener resultListener, Exception exc) {
        Intrinsics.checkNotNullParameter(resultListener, "$resultListener");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) exc, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$requestSingleLocationUpdateFromGooglePlay$3$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Failed to get single location update from Google Play services.";
            }
        }, 4, (Object) null);
        resultListener.onLocationRequestComplete(null);
    }

    public final SharedPreferences getRegisteredGeofenceSharedPrefs$android_sdk_location_release(Context context) throws Throwable {
        short sXd = (short) (FB.Xd() ^ 21432);
        short sXd2 = (short) (FB.Xd() ^ 21968);
        int[] iArr = new int["8CAF6HC".length()];
        QB qb = new QB("8CAF6HC");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Intrinsics.checkNotNullParameter(context, new String(iArr, 0, i2));
        String strVd = hg.Vd("ozw7iwvgs|0tuonlno(`]f\\ZbVWd", (short) (C1499aX.Xd() ^ (-2613)), (short) (C1499aX.Xd() ^ (-4369)));
        Class<?> cls = Class.forName(C1561oA.ud("~\u000b\u007f\r\t\u0002{Dx\u0004\u0002\u0007v~\u0004<P{y~n\u0001{", (short) (OY.Xd() ^ 4931)));
        Class<?>[] clsArr = {Class.forName(C1561oA.yd("\u001a\u0010$\u000eY\u0017\u000b\u0017\u001fd\t)&\u001c \u0018", (short) (C1607wl.Xd() ^ 18605))), Integer.TYPE};
        Object[] objArr = {strVd, 0};
        short sXd3 = (short) (C1499aX.Xd() ^ (-15061));
        int[] iArr2 = new int["sr\u0003bxr\u0005xxe\t|~~\r\u0001\u000b\u0001\u0004\u0013".length()];
        QB qb2 = new QB("sr\u0003bxr\u0005xxe\t|~~\r\u0001\u000b\u0001\u0004\u0013");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd3 + sXd3) + sXd3) + i3));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            short sXd4 = (short) (Od.Xd() ^ (-16536));
            short sXd5 = (short) (Od.Xd() ^ (-22528));
            int[] iArr3 = new int[")66=/C@z54D$:4F::'J>@@NB༦..\r\u0002&SSZL`]\u00188;13N@C;I5I; ".length()];
            QB qb3 = new QB(")66=/C@z54D$:4F::'J>@@NB༦..\r\u0002&SSZL`]\u00188;13N@C;I5I; ");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i4)) + sXd5);
                i4++;
            }
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, new String(iArr3, 0, i4));
            return sharedPreferences;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void removeGeofencesRegisteredWithGeofencingClient$android_sdk_location_release(final Context context, final List<String> obsoleteGeofenceIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(obsoleteGeofenceIds, "obsoleteGeofenceIds");
        Task<Void> taskRemoveGeofences = LocationServices.getGeofencingClient(context).removeGeofences(obsoleteGeofenceIds);
        final Function1<Void, Unit> function1 = new Function1<Void, Unit>() { // from class: com.braze.location.GooglePlayLocationUtils$removeGeofencesRegisteredWithGeofencingClient$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Void r2) {
                invoke2(r2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Void r9) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) GooglePlayLocationUtils.INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$removeGeofencesRegisteredWithGeofencingClient$1.1
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Geofences successfully un-registered with Google Play Services.";
                    }
                }, 7, (Object) null);
                GooglePlayLocationUtils.INSTANCE.removeGeofencesFromSharedPrefs(context, obsoleteGeofenceIds);
            }
        };
        taskRemoveGeofences.addOnSuccessListener(new OnSuccessListener() { // from class: com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda4
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$9(function1, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda5
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                GooglePlayLocationUtils.removeGeofencesRegisteredWithGeofencingClient$lambda$10(exc);
            }
        });
    }

    public final void storeGeofencesToSharedPrefs$android_sdk_location_release(Context context, List<BrazeGeofence> newGeofencesToRegister) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(newGeofencesToRegister, "newGeofencesToRegister");
        SharedPreferences.Editor editorEdit = getRegisteredGeofenceSharedPrefs$android_sdk_location_release(context).edit();
        for (final BrazeGeofence brazeGeofence : newGeofencesToRegister) {
            editorEdit.putString(brazeGeofence.getId(), brazeGeofence.forJsonPut().toString());
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.GooglePlayLocationUtils$storeGeofencesToSharedPrefs$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Geofence with id: " + brazeGeofence.getId() + " added to shared preferences.";
                }
            }, 6, (Object) null);
        }
        editorEdit.apply();
    }
}
