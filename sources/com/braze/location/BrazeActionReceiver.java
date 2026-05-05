package com.braze.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.enums.GeofenceTransitionType;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.support.BrazeLogger;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingEvent;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.ZO;

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
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u0016DLcz\u0004I\u0006>\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN.XX@ş\u001c{b#\u0014#x\u0004>ڈ\u001e}0\t\u0018huh\u0007J\t\rs\u0015\u0014\u0019\u0011lBH\u0004|\u000e\u0018\u001d7ZqU2{u\u0004MƄx>"}, d2 = {"\u001ab^:\")KO.~De6z\u0005>i\n1E\u001d\u000e\u0013,GK\fKz/>F}\u001e7q'.Z\u0019", "\u001a`]1e6BRb|\u0005g;|\u0012>/\\5\u0006<\u007f\u0015\u0013U~z<t%9j}-\r", "u(E", "=mA2V,Bd\u0019", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7mc2a;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "\u000fbc6b5+S\u0017~~o,\n", "/mS?b0=\u001b'}\u0001&3\u0007\u0007+t\u00042\u0005:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BrazeActionReceiver extends BroadcastReceiver {

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG<L͜P.`S2\u000fq|:#qҕ\u0010MkUH|Z\bY\u000fzwrXZ#C=\u0007&|x.aU'`ܫ\u00132Ps\b9[vU9\u000f||\nh60A\u0012\u0005/\"zV\u001e{\u0013Ea\u000b@6\u0017\u0084<ň\u0011M\r܅b\u0012L \u0019\u001e\u000bh%ȧJǰa:7݊SuPP?_^\u007f$θHù+\r~ѭԅ/K"}, d2 = {"\u001ab^:\")KO.~De6z\u0005>i\n1E\u001d\u000e\u0013,GK\fKz/>F}\u001e7q'.Z\u0002\u0017iC\"\u001fqN9\u0005c0_v4\u001d", "", "/o_9\\*:b\u001d\t\u0004<6\u0006\u0018/x\u000f", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7mc2a;", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEt8\u007f$Bc\u0002\u001f\u0001k 7\\CDz}\u0002\u001ewaB\u00169o?", "/bc6b5", "", ">da3b9FE#\f\u0001", "", "@t]", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&3\u0007\u0007+t\u00042\u0005:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ActionReceiver {
        public static final Companion Companion = new Companion(null);
        private final String action;
        private final Context applicationContext;
        private final Intent intent;

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007fјnjO0LeN.ZS@\u000fsڔ:Š\\:ڎs;\u0004\u0019>'\u000fOɁkg|J#!Q\u0010\u001e\u0016'l\\Mc{u\u0012=6rsM8eok?'y~\u001b.9:8(\u00071\u001e8K(v)G{\u0010 8Xph[SMő\u001e\u001c"}, d2 = {"\u001ab^:\")KO.~De6z\u0005>i\n1E\u001d\u000e\u0013,GK\fKz/>F}\u001e7q'.Z\u0002\u0017iC\"\u001fqN9\u0005c0_v4\u0006*X4gN{A\u001e\u001b0", "", "u(E", "6`]1_, S#\u007fzg*|h@e\t7", "", "/o_9\\*:b\u001d\t\u0004<6\u0006\u0018/x\u000f", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5d^3X5<Sx\u0010zg;", "\u001ab^:\".H]\u001b\u0006z((\u0006\b<o\u0004'EB\t%`Ny\f8\u0006)?bG\u00027w\u0017.VA?t6}&hjH\\", "6`]1_,,W\"\u0001\u0002^\u0013\u0007\u0007+t\u00042\u00050\f\u0016\u0013Vo", ":nR.g0H\\", "\u001a`]1e6BRb\u0006\u0005\\(\f\r9nI\u000f\u0006>|&\u001bQxc", "/mS?b0=\u001b'}\u0001&3\u0007\u0007+t\u00042\u0005:\u000e\u0017\u001eGk\u001c<"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final boolean handleSingleLocationUpdate(Context context, Location location) {
                try {
                    BrazeInternal.logLocationRecordedEvent(context, new BrazeLocation(location));
                    return true;
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeActionReceiver$ActionReceiver$Companion$handleSingleLocationUpdate$1
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Exception while processing single location update";
                        }
                    }, 4, (Object) null);
                    return false;
                }
            }

            public final boolean handleGeofenceEvent(Context applicationContext, GeofencingEvent geofenceEvent) {
                Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
                Intrinsics.checkNotNullParameter(geofenceEvent, "geofenceEvent");
                if (geofenceEvent.hasError()) {
                    final int errorCode = geofenceEvent.getErrorCode();
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeActionReceiver$ActionReceiver$Companion$handleGeofenceEvent$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "Location Services error: " + errorCode;
                        }
                    }, 6, (Object) null);
                    return false;
                }
                final int geofenceTransition = geofenceEvent.getGeofenceTransition();
                List<Geofence> triggeringGeofences = geofenceEvent.getTriggeringGeofences();
                if (1 == geofenceTransition) {
                    if (triggeringGeofences != null) {
                        Iterator<T> it = triggeringGeofences.iterator();
                        while (it.hasNext()) {
                            String requestId = ((Geofence) it.next()).getRequestId();
                            Intrinsics.checkNotNullExpressionValue(requestId, "geofence.requestId");
                            BrazeInternal.recordGeofenceTransition(applicationContext, requestId, GeofenceTransitionType.ENTER);
                        }
                    }
                } else {
                    if (2 != geofenceTransition) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeActionReceiver$ActionReceiver$Companion$handleGeofenceEvent$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                return "Unsupported transition type received: " + geofenceTransition;
                            }
                        }, 6, (Object) null);
                        return false;
                    }
                    if (triggeringGeofences != null) {
                        Iterator<T> it2 = triggeringGeofences.iterator();
                        while (it2.hasNext()) {
                            String requestId2 = ((Geofence) it2.next()).getRequestId();
                            Intrinsics.checkNotNullExpressionValue(requestId2, "geofence.requestId");
                            BrazeInternal.recordGeofenceTransition(applicationContext, requestId2, GeofenceTransitionType.EXIT);
                        }
                    }
                }
                return true;
            }
        }

        public ActionReceiver(Context applicationContext, Intent intent) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.applicationContext = applicationContext;
            this.intent = intent;
            this.action = intent.getAction();
        }

        public final void performWork() {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeActionReceiver$ActionReceiver$performWork$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Received intent with action " + this.this$0.action;
                }
            }, 7, (Object) null);
            String str = this.action;
            if (str == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeActionReceiver$ActionReceiver$performWork$2
                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Received intent with null action. Doing nothing.";
                    }
                }, 7, (Object) null);
                return;
            }
            if (Intrinsics.areEqual(str, Constants.BRAZE_ACTION_RECEIVER_GEOFENCE_UPDATE_INTENT_ACTION)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeActionReceiver$ActionReceiver$performWork$3
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "BrazeActionReceiver received intent with geofence transition: " + this.this$0.action;
                    }
                }, 7, (Object) null);
                GeofencingEvent geofencingEventFromIntent = GeofencingEvent.fromIntent(this.intent);
                if (geofencingEventFromIntent != null) {
                    Companion.handleGeofenceEvent(this.applicationContext, geofencingEventFromIntent);
                    return;
                }
                return;
            }
            if (!Intrinsics.areEqual(str, Constants.BRAZE_ACTION_RECEIVER_SINGLE_LOCATION_UPDATE_INTENT_ACTION)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeActionReceiver$ActionReceiver$performWork$7
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Unknown intent received in BrazeActionReceiver with action: " + this.this$0.action;
                    }
                }, 6, (Object) null);
                return;
            }
            Location location = null;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeActionReceiver$ActionReceiver$performWork$5
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "BrazeActionReceiver received intent with single location update: " + this.this$0.action;
                }
            }, 7, (Object) null);
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle extras = this.intent.getExtras();
                if (extras != null) {
                    location = (Location) extras.getParcelable(FirebaseAnalytics.Param.LOCATION, Location.class);
                }
            } else {
                Bundle extras2 = this.intent.getExtras();
                location = (Location) (extras2 != null ? extras2.get(FirebaseAnalytics.Param.LOCATION) : null);
            }
            if (location != null) {
                Companion.handleSingleLocationUpdate(this.applicationContext, location);
            }
        }

        public final void run() {
            try {
                performWork();
            } catch (Exception e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeActionReceiver$ActionReceiver$run$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Caught exception while performing the BrazeActionReceiver work. Action: " + this.this$0.action + " Intent: " + this.this$0.intent;
                    }
                }, 4, (Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: com.braze.location.BrazeActionReceiver$onReceive$3, reason: invalid class name */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDZc\u0003İY\u0006^\nVB-\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ActionReceiver $actionReceiver;
        final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ActionReceiver actionReceiver, BroadcastReceiver.PendingResult pendingResult, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$actionReceiver = actionReceiver;
            this.$pendingResult = pendingResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$actionReceiver, this.$pendingResult, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$actionReceiver.run();
            this.$pendingResult.finish();
            return Unit.INSTANCE;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        if (intent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeActionReceiver.onReceive.1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "BrazeActionReceiver received null intent. Doing nothing.";
                }
            }, 6, (Object) null);
            return;
        }
        if (context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.location.BrazeActionReceiver.onReceive.2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "BrazeActionReceiver received null context. Doing nothing.";
                }
            }, 6, (Object) null);
            return;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("du$V\u0012\u0006$\u007f1~*\u0018\u0007Nn{a-]QK\u0002\u001d", (short) (C1633zX.Xd() ^ (-10334)), (short) (C1633zX.Xd() ^ (-5214)))).getMethod(C1626yg.Ud(">imB9\u007f|\u007fndxuloG\r{\f.\u0004\u0016", (short) (C1580rY.Xd() ^ (-16355)), (short) (C1580rY.Xd() ^ (-14560))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            Intrinsics.checkNotNullExpressionValue(context2, Ig.wd("\u0015XH+m2ZsE\u0012\u0015E>51~Xx", (short) (C1633zX.Xd() ^ (-26140))));
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new AnonymousClass3(new ActionReceiver(context2, intent), pendingResultGoAsync, null), 2, null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
