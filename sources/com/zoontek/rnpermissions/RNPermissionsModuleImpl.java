package com.zoontek.rnpermissions;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яf\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005&4\u0012\u0006)njG6LeN.ZS8\u000fsڔ<$q$yّCU0}*\tURog\u0005Jb\u000bI\u000f\u000e\u0016\u000fj4կ]xk\u001b\u00172HoG3coE9vt>ӌ(20K\u0002\u0005\u0007\u001d2H&v\u0003CQ\u000f\u0018ٚ@\u0007í\u0003\r{\u0004Z\u0017\f>ŋ\u0005\u001ejg\u0017JVxu:]03mP\\?_^\f}\u0011Td?\r%rf?NIM\u0015S`3\u000b`iW\u0003m\u0001m\tv7?+w\u0005 Rf\u0013,\u0015Y\\=a\u00014t\u0005\u007fo<+9c{K~\u0010X{\t\f%<2\u001fN3VCE\u001a\u0015\u0015>7\u0003\u0003k@~\u0013'^\u000e\u0011y6E2079G3f\u007fpk\u001d\\N\u0014\u0005;6S\u0005|1sT<q]/b\u0011i1\u007fMmL\\\u0018q=\u001c\u0013!f\u0010:\u001c0u\u0011w\n\u001fH/%evi'/y\u001aHrv=\u0005)va\u0006jHn?\u001f\u001aE>!\f\tF+\u00054zbvD\u0011{9\u0005\u000b\f\u0016+ \u000b\u0007l+3/fUxkzM\f+SO\u0017;gy\u0004\u000e\u0006C\u000f7Cs{\u0010\u0010u? M`z\u0005\u0007srW\u001ajt(PC\u0011\t\u001e\u001d\u0014D|\u0019C6M\u007f44Z@Ib#n\u001b X@+\u000b\u0010^v \u0017Ta5K\u001c2\u001c!\u0001~i!su\u0007a,+oR1OyM\u0019T~RrB\u001c;\r\u000fu\u0010G\u0016mul\u001d\u001a\u0004i\u0014 D\u001ciU=M+\u000f-:z\u000e;odr\u0014^}\u00165\u000b\u0015y=L1`u3\u0003pZm\u001bN]b/\"%m#'\u0016\r\u0018y\u0010o+Qqs#aNK\u0003\u0003\b]|X-\t-5=\u0001\u001e:-9;S?\u001dD\t\\C#\u000eui\u001e;*f\u001d4\re2;\u0014\u001a}ri]`L\u0001eg,V\"Ry3FVx\u0010\bp\u0018d\u0011A\\Yd\u001fXhQ\u0019?\u0016f5=]|d\\R\u0013\u001e\u007f\u000bʠ2ͫwC\u0006ж/O3\u0014eS\u0016oDй/\u05c8N\u000f\u0012ΚL=|\u00164=NX.Ņ[ޘ\ns ܽ\u0012Gp\nT\tR6\u0003чZդGTqв`\u0007\u000eLw\u000fE4\u0019Ǆ\u000eټ\u0012T\u0001ִ'T\u0013g]`O,Wϖaʟ\"x=̍U\u0006T\\GoB\u0003c\u001d7\u001dzQ\u000ffS5r]\u0010Ќ*\u0092\u0005\u000bM؏\u0014U\u0010A\u001cGWwBƔ\u0018է\u001c|%\u00adə\u001fg"}, d2 = {"\u001ab^:\"AH]\"\u000ezdu\n\u0012:e\r0\u007fN\u000f\u001b!P}W)_\u00105f\u0006$E{\u001a8VQ#u3.\u001chEA\u0012j\u0002", "", "u(E", "\u0010K>\u0010>\f\u001d", "", "\u0012D=\u00168\u000b", "\u0013QA\u001cE&\"<\nZaB\u000bvd\rTc\u0019_/t", "\u0015Q0\u001bG\f\u001d", "\u001c@<\u0012", "#M0#4\u0010%/ueZ", ";h]6`<F/$\u0003", "", "", "@d`BX:M1#}z", "1`] V/>R)\u0006z>?x\u0007>A\u0007$\tH\u000f", "", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!3hY+Bt\u001a,IR?u={\u001fqp9\u001ar\u0002", ">q^:\\:>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW'\u0004/=]\f \r", "1`]\"f,\u001fc \u0006h\\9|\t8I\t7{I\u0010", "1gT0^", ">da:\\:LW#\b", "1gT0^\u0013HQ\u0015\u000e~h5X\u0007-u\r$yT", "1gT0^\u0014NZ(\u0003\u0006e,", ">da:\\:LW#\b\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "1gT0^\u0015Hb\u001d\u007f~\\(\f\r9n\u000e", "5dc\u001dX9FW'\r~h5X\u001b+r\u007f\u0004yO\u0005(\u001bV\u0004", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u000b7z\u001e2[Q?u=y'dn9ba;R\b+V`$", "7r?2e4Ba'\u0003\u0005g\b\u000e\u00053l{%\u0003@", "", "=mA2d<>a(izk4\u0001\u0017=i\n1\n-\u0001%'N~", "1`[9U(<Y'", "\u001a`]1e6BRb\u000f\nb3Fv:a\r6{\u001c\u000e$\u0013[E", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW\u001ar,<Vy\u001e=C", "5qP;g\u0019>a)\u0006\nl", "", "=oT;C/Hb#i~\\2|\u0016", "=oT;F,Mb\u001d\b|l", "Bx_2", "@d`BX:M", ":hbAX5>`", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EH\u000b\u0016'No\u001c\u0006t/BYG\u000b7z\u001e2[Q?u=\u0005\u0019vp9\u0010c9$", "@d`BX:M:#|vm0\u0007\u0012\u000bc}8\t<~+", "@d`BX:M;)\u0006\nb7\u0004\t", "@d`BX:M<#\u000e~_0z\u0005>i\n1\n", "Ag^B_+,V#\u0011g^8\r\t=tl$\u000bD\u000b \u0013No", "@dP0gsGO(\u0003\f^s\b\t<m\u00046\nD\u000b %A|\u000eCv!CY"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class RNPermissionsModuleImpl {
    private static final String BLOCKED = "blocked";
    private static final String DENIED = "denied";
    private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    private static final String GRANTED = "granted";
    public static final String NAME = "RNPermissions";
    private static final String UNAVAILABLE = "unavailable";
    private static int requestCode = 0;
    public static final RNPermissionsModuleImpl INSTANCE = new RNPermissionsModuleImpl();
    private static final Map<String, Integer> minimumApi = MapsKt.mapOf(TuplesKt.to("android.permission.ACCEPT_HANDOVER", 28), TuplesKt.to("android.permission.ACCESS_BACKGROUND_LOCATION", 29), TuplesKt.to("android.permission.ACCESS_MEDIA_LOCATION", 29), TuplesKt.to("android.permission.ACTIVITY_RECOGNITION", 29), TuplesKt.to("android.permission.ANSWER_PHONE_CALLS", 26), TuplesKt.to("android.permission.BLUETOOTH_ADVERTISE", 31), TuplesKt.to("android.permission.BLUETOOTH_CONNECT", 31), TuplesKt.to("android.permission.BLUETOOTH_SCAN", 31), TuplesKt.to("android.permission.BODY_SENSORS_BACKGROUND", 33), TuplesKt.to("android.permission.NEARBY_WIFI_DEVICES", 33), TuplesKt.to("android.permission.READ_MEDIA_AUDIO", 33), TuplesKt.to("android.permission.READ_MEDIA_IMAGES", 33), TuplesKt.to("android.permission.READ_MEDIA_VIDEO", 33), TuplesKt.to("android.permission.READ_MEDIA_VISUAL_USER_SELECTED", 34), TuplesKt.to("android.permission.READ_PHONE_NUMBERS", 26), TuplesKt.to("android.permission.UWB_RANGING", 31));

    private RNPermissionsModuleImpl() {
    }

    private final PermissionAwareActivity getPermissionAwareActivity(ReactApplicationContext reactApplicationContext) {
        ComponentCallbacks2 currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.".toString());
        }
        if (currentActivity instanceof PermissionAwareActivity) {
            return (PermissionAwareActivity) currentActivity;
        }
        throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.".toString());
    }

    private final boolean isPermissionAvailable(String str) {
        if (!StringsKt.startsWith$default(str, "android.", false, 2, (Object) null) && !StringsKt.startsWith$default(str, "com.android", false, 2, (Object) null)) {
            return false;
        }
        int i2 = Build.VERSION.SDK_INT;
        Integer num = minimumApi.get(str);
        return i2 >= (num != null ? num.intValue() : 1);
    }

    public static final void request$lambda$6(Promise promise, String permission, Object[] args) {
        Intrinsics.checkNotNullParameter(promise, "$promise");
        Intrinsics.checkNotNullParameter(permission, "$permission");
        Intrinsics.checkNotNullParameter(args, "args");
        Object obj = args[0];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        Object obj2 = args[1];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
        PermissionAwareActivity permissionAwareActivity = (PermissionAwareActivity) obj2;
        Integer orNull = ArraysKt.getOrNull((int[]) obj, 0);
        promise.resolve((orNull != null && orNull.intValue() == 0) ? GRANTED : permissionAwareActivity.shouldShowRequestPermissionRationale(permission) ? DENIED : BLOCKED);
    }

    public static final void requestMultiple$lambda$9(ArrayList permissionsToCheck, Promise promise, WritableMap output, Object[] args) {
        Intrinsics.checkNotNullParameter(permissionsToCheck, "$permissionsToCheck");
        Intrinsics.checkNotNullParameter(promise, "$promise");
        Intrinsics.checkNotNullParameter(output, "$output");
        Intrinsics.checkNotNullParameter(args, "args");
        int i2 = 0;
        Object obj = args[0];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.IntArray");
        int[] iArr = (int[]) obj;
        Object obj2 = args[1];
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.facebook.react.modules.core.PermissionAwareActivity");
        PermissionAwareActivity permissionAwareActivity = (PermissionAwareActivity) obj2;
        for (Object obj3 : permissionsToCheck) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj3;
            Integer orNull = ArraysKt.getOrNull(iArr, i2);
            output.putString(str, (orNull != null && orNull.intValue() == 0) ? GRANTED : permissionAwareActivity.shouldShowRequestPermissionRationale(str) ? DENIED : BLOCKED);
            i2 = i3;
        }
        promise.resolve(output);
    }

    public final void canScheduleExactAlarms(ReactApplicationContext reactContext, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (Build.VERSION.SDK_INT < 31) {
            promise.resolve(true);
            return;
        }
        Object systemService = reactContext.getSystemService(NotificationCompat.CATEGORY_ALARM);
        AlarmManager alarmManager = systemService instanceof AlarmManager ? (AlarmManager) systemService : null;
        promise.resolve(Boolean.valueOf(alarmManager != null ? alarmManager.canScheduleExactAlarms() : false));
    }

    public final void canUseFullScreenIntent(ReactApplicationContext reactContext, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (Build.VERSION.SDK_INT < 34) {
            promise.resolve(true);
            return;
        }
        Object systemService = reactContext.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        promise.resolve(Boolean.valueOf(((NotificationManager) systemService).canUseFullScreenIntent()));
    }

    public final void check(ReactApplicationContext reactApplicationContext, String str, Promise promise) throws Throwable {
        Intrinsics.checkNotNullParameter(reactApplicationContext, Ig.wd(",p:$u\u0010`fF\u0007\u0014y", (short) (C1580rY.Xd() ^ (-12788))));
        Intrinsics.checkNotNullParameter(str, EO.Od("o7\u0006e0\u000f'=\u0006e", (short) (OY.Xd() ^ 14519)));
        Intrinsics.checkNotNullParameter(promise, C1561oA.Qd("cd`]XaR", (short) (FB.Xd() ^ 25100)));
        if (!isPermissionAvailable(str)) {
            promise.resolve(C1593ug.zd("\n\u0004w\u000ey\u0003\u0007|~\n\u0004", (short) (FB.Xd() ^ 29500), (short) (FB.Xd() ^ 5477)));
            return;
        }
        Context baseContext = reactApplicationContext.getBaseContext();
        Object[] objArr = {str};
        Method method = Class.forName(C1561oA.od("\u007f\f\u0001\u000e\n\u0003|Ey\u0005\u0003\bw\u007f\u0005=Q|z\u007fo\u0002|", (short) (OY.Xd() ^ 19470))).getMethod(Wg.Zd("{Ezu4\u0019WY\fb.4_X\u0019\u0016D1`", (short) (C1633zX.Xd() ^ (-4686)), (short) (C1633zX.Xd() ^ (-29588))), Class.forName(C1561oA.Kd("og}i7vlzt<b\u0005\u0004{\u0002{", (short) (C1580rY.Xd() ^ (-16373)))));
        try {
            method.setAccessible(true);
            if (((Integer) method.invoke(baseContext, objArr)).intValue() == 0) {
                promise.resolve(C1561oA.Xd("\u0010\u001c\f\u001a!\u0013\u0013", (short) (C1633zX.Xd() ^ (-20619))));
            } else {
                promise.resolve(Wg.vd("24:677", (short) (Od.Xd() ^ (-24048))));
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public final void checkLocationAccuracy(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.reject("Permissions:checkLocationAccuracy", "checkLocationAccuracy is not supported on Android");
    }

    public final void checkMultiple(ReactApplicationContext reactApplicationContext, ReadableArray readableArray, Promise promise) throws Throwable {
        String strXd;
        Intrinsics.checkNotNullParameter(reactApplicationContext, Qg.kd("\u001d\u000f\n\u000b\u001bh\u0014\u0012\u0017\u0007\u0019\u0014", (short) (C1633zX.Xd() ^ (-27928)), (short) (C1633zX.Xd() ^ (-16801))));
        Intrinsics.checkNotNullParameter(readableArray, hg.Vd("ymysnwvkpnr", (short) (C1499aX.Xd() ^ (-26110)), (short) (C1499aX.Xd() ^ (-26385))));
        Intrinsics.checkNotNullParameter(promise, C1561oA.ud("ab^[V_P", (short) (FB.Xd() ^ 32605)));
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Context baseContext = reactApplicationContext.getBaseContext();
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            String string = readableArray.getString(i2);
            String str = string;
            if (str != null && !StringsKt.isBlank(str)) {
                if (isPermissionAvailable(string)) {
                    Object[] objArr = {string};
                    Method method = Class.forName(C1561oA.Yd("DRIXVQM\u0018N[[bT^e 6ccj\\pm", (short) (FB.Xd() ^ 19148))).getMethod(Jg.Wd("@,Tv*\\Se\nxxpP7(\rm>b", (short) (C1499aX.Xd() ^ (-4478)), (short) (C1499aX.Xd() ^ (-4544))), Class.forName(Xg.qd("ZRhT\"aWe_'Monflf", (short) (ZN.Xd() ^ 11176), (short) (ZN.Xd() ^ 20032))));
                    try {
                        method.setAccessible(true);
                        strXd = ((Integer) method.invoke(baseContext, objArr)).intValue() == 0 ? ZO.xd(",P@JtF\u001b", (short) (ZN.Xd() ^ 10597), (short) (ZN.Xd() ^ 8789)) : C1626yg.Ud("\\,\u001c\u007f\u0005I", (short) (C1499aX.Xd() ^ (-16093)), (short) (C1499aX.Xd() ^ (-10953)));
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } else {
                    strXd = C1561oA.yd("91#7)02&\u001e'\u001f", (short) (FB.Xd() ^ 11400));
                }
                writableNativeMap.putString(string, strXd);
            }
        }
        promise.resolve(writableNativeMap);
    }

    public final void checkNotifications(ReactApplicationContext reactContext, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        boolean zAreNotificationsEnabled = NotificationManagerCompat.from(reactContext).areNotificationsEnabled();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("status", zAreNotificationsEnabled ? GRANTED : DENIED);
        writableMapCreateMap.putMap("settings", Arguments.createMap());
        promise.resolve(writableMapCreateMap);
    }

    public final boolean onRequestPermissionsResult(ReactApplicationContext reactContext, SparseArray<Callback> callbacks, int i2, int[] grantResults) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        try {
            Callback callback = callbacks.get(i2);
            if (callback != null) {
                callback.invoke(grantResults, getPermissionAwareActivity(reactContext));
                callbacks.remove(i2);
            } else {
                FLog.w("PermissionsModule", "Unable to find callback with requestCode %d", Integer.valueOf(i2));
            }
            return callbacks.size() == 0;
        } catch (IllegalStateException e2) {
            FLog.e("PermissionsModule", e2, "Unexpected invocation of `onRequestPermissionsResult`", new Object[0]);
            return false;
        }
    }

    public final void openPhotoPicker(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.reject("Permissions:openPhotoPicker", "openPhotoPicker is not supported on Android");
    }

    public final void openSettings(ReactApplicationContext reactContext, String str, Promise promise) throws Exception {
        Intent intent;
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            String packageName = reactContext.getPackageName();
            if (Build.VERSION.SDK_INT >= 31 && Intrinsics.areEqual(str, "alarms")) {
                intent = new Intent();
                intent.setAction("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
                intent.setData(Uri.parse("package:" + packageName));
            } else if (Build.VERSION.SDK_INT >= 34 && Intrinsics.areEqual(str, "fullscreen")) {
                intent = new Intent();
                intent.setAction("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
                intent.setData(Uri.parse("package:" + packageName));
            } else if (Intrinsics.areEqual(str, "notifications")) {
                intent = new Intent();
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", packageName);
            } else {
                intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:" + packageName));
            }
            intent.addFlags(268435456);
            CX.ud();
            reactContext.startActivity(intent);
            promise.resolve(true);
        } catch (Exception e2) {
            promise.reject(ERROR_INVALID_ACTIVITY, e2);
        }
    }

    public final void request(ReactApplicationContext reactApplicationContext, PermissionListener permissionListener, SparseArray<Callback> sparseArray, final String str, final Promise promise) throws Throwable {
        Intrinsics.checkNotNullParameter(reactApplicationContext, Ig.wd("\u0002ESm\u001f8H\u0010n[l\u000f", (short) (Od.Xd() ^ (-27175))));
        Intrinsics.checkNotNullParameter(permissionListener, EO.Od("'Z\u00154n<\u001dl", (short) (C1633zX.Xd() ^ (-13191))));
        short sXd = (short) (C1607wl.Xd() ^ 22933);
        int[] iArr = new int["52<;0./6=".length()];
        QB qb = new QB("52<;0./6=");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(sparseArray, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(str, C1593ug.zd("\u001e\u0014\"\u001e\u001b&'\u001e%%", (short) (C1607wl.Xd() ^ 27723), (short) (C1607wl.Xd() ^ 24809)));
        Intrinsics.checkNotNullParameter(promise, C1561oA.od("mnjgbk\\", (short) (Od.Xd() ^ (-4711))));
        if (!isPermissionAvailable(str)) {
            promise.resolve(C1561oA.Kd("HB6L8AE;=HB", (short) (C1607wl.Xd() ^ 6607)));
            return;
        }
        Context baseContext = reactApplicationContext.getBaseContext();
        Class<?> cls = Class.forName(Wg.Zd("C:\u001f\u0017\u0001dM\u0001#\u0019\u0007vUH=`\"9%\u0014rpZ", (short) (Od.Xd() ^ (-17429)), (short) (Od.Xd() ^ (-15010))));
        Class<?>[] clsArr = new Class[1];
        short sXd2 = (short) (C1633zX.Xd() ^ (-2220));
        int[] iArr2 = new int["d\\r^,kaoi1Wyxpvp".length()];
        QB qb2 = new QB("d\\r^,kaoi1Wyxpvp");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 + i3));
            i3++;
        }
        clsArr[0] = Class.forName(new String(iArr2, 0, i3));
        Object[] objArr = {str};
        Method method = cls.getMethod(Wg.vd("0441<#8>;$<HFANMFKM", (short) (C1607wl.Xd() ^ 22980)), clsArr);
        try {
            method.setAccessible(true);
            if (((Integer) method.invoke(baseContext, objArr)).intValue() == 0) {
                promise.resolve(Qg.kd(")3!-2\" ", (short) (C1580rY.Xd() ^ (-25805)), (short) (C1580rY.Xd() ^ (-4209))));
                return;
            }
            try {
                PermissionAwareActivity permissionAwareActivity = getPermissionAwareActivity(reactApplicationContext);
                sparseArray.put(requestCode, new Callback() { // from class: com.zoontek.rnpermissions.RNPermissionsModuleImpl$$ExternalSyntheticLambda0
                    @Override // com.facebook.react.bridge.Callback
                    public final void invoke(Object[] objArr2) {
                        RNPermissionsModuleImpl.request$lambda$6(promise, str, objArr2);
                    }
                });
                permissionAwareActivity.requestPermissions(new String[]{str}, requestCode, permissionListener);
                requestCode++;
            } catch (IllegalStateException e2) {
                promise.reject(hg.Vd("azcgnXb^XrSTdXdV`d", (short) (ZN.Xd() ^ 6835), (short) (ZN.Xd() ^ 11100)), e2);
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public final void requestLocationAccuracy(Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.reject("Permissions:requestLocationAccuracy", "requestLocationAccuracy is not supported on Android");
    }

    public final void requestMultiple(ReactApplicationContext reactApplicationContext, PermissionListener permissionListener, SparseArray<Callback> sparseArray, ReadableArray readableArray, final Promise promise) throws Throwable {
        short sXd = (short) (FB.Xd() ^ 9269);
        int[] iArr = new int["UGBCS!LJO?QL".length()];
        QB qb = new QB("UGBCS!LJO?QL");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(reactApplicationContext, new String(iArr, 0, i2));
        Intrinsics.checkNotNullParameter(permissionListener, C1561oA.yd("WS\\\\T\\R^", (short) (OY.Xd() ^ 9083)));
        Intrinsics.checkNotNullParameter(sparseArray, C1561oA.Yd("wv\u0003\u0004zz}\u0007\u0010", (short) (C1499aX.Xd() ^ (-26048))));
        Intrinsics.checkNotNullParameter(readableArray, Xg.qd("\u0017\r\u001b\u0017\u0014\u001f \u0017\u001e\u001e$", (short) (FB.Xd() ^ 25208), (short) (FB.Xd() ^ 30524)));
        short sXd2 = (short) (Od.Xd() ^ (-32768));
        short sXd3 = (short) (Od.Xd() ^ (-29545));
        int[] iArr2 = new int["n#\r>7sB".length()];
        QB qb2 = new QB("n#\r>7sB");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - ((i3 * sXd3) ^ sXd2));
            i3++;
        }
        Intrinsics.checkNotNullParameter(promise, new String(iArr2, 0, i3));
        final WritableNativeMap writableNativeMap = new WritableNativeMap();
        final ArrayList arrayList = new ArrayList();
        Context baseContext = reactApplicationContext.getBaseContext();
        int size = readableArray.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            String string = readableArray.getString(i5);
            String str = string;
            if (str != null && !StringsKt.isBlank(str)) {
                if (isPermissionAvailable(string)) {
                    Class<?> cls = Class.forName(C1626yg.Ud("do-Zn[\u000eGiue8+ImN:qVy\u0018\u001c\u0013", (short) (C1499aX.Xd() ^ (-17771)), (short) (C1499aX.Xd() ^ (-18498))));
                    Class<?>[] clsArr = new Class[1];
                    short sXd4 = (short) (C1580rY.Xd() ^ (-21434));
                    int[] iArr3 = new int["\"iP\u001c0):\u007f%LwvAB\u001br".length()];
                    QB qb3 = new QB("\"iP\u001c0):\u007f%LwvAB\u001br");
                    int i6 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i6] = xuXd3.fK(xuXd3.CK(iKK3) - (C1561oA.Xd[i6 % C1561oA.Xd.length] ^ (sXd4 + i6)));
                        i6++;
                    }
                    clsArr[0] = Class.forName(new String(iArr3, 0, i6));
                    Object[] objArr = {string};
                    Method method = cls.getMethod(EO.Od("4\u0011\u0012-_\u001d\u0001a\u001f\u001a'X##+R\u001e\u0014L", (short) (Od.Xd() ^ (-2086))), clsArr);
                    try {
                        method.setAccessible(true);
                        if (((Integer) method.invoke(baseContext, objArr)).intValue() == 0) {
                            writableNativeMap.putString(string, C1561oA.Qd("\u0016 \u000e\u001a\u001f\u000f\r", (short) (C1580rY.Xd() ^ (-17512))));
                        } else {
                            arrayList.add(string);
                        }
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } else {
                    writableNativeMap.putString(string, ZO.xd("_XWm\u0001.]og1\u0006", (short) (C1499aX.Xd() ^ (-2074)), (short) (C1499aX.Xd() ^ (-23461))));
                }
                i4++;
            }
        }
        if (readableArray.size() == i4) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            PermissionAwareActivity permissionAwareActivity = getPermissionAwareActivity(reactApplicationContext);
            sparseArray.put(requestCode, new Callback() { // from class: com.zoontek.rnpermissions.RNPermissionsModuleImpl$$ExternalSyntheticLambda1
                @Override // com.facebook.react.bridge.Callback
                public final void invoke(Object[] objArr2) {
                    RNPermissionsModuleImpl.requestMultiple$lambda$9(arrayList, promise, writableNativeMap, objArr2);
                }
            });
            permissionAwareActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), requestCode, permissionListener);
            requestCode++;
        } catch (IllegalStateException e3) {
            promise.reject(C1593ug.zd("h\u0004nt}iuso\fnq\u0004y\b{\b\u000e", (short) (C1607wl.Xd() ^ 16977), (short) (C1607wl.Xd() ^ 14535)), e3);
        }
    }

    public final void requestNotifications(ReactApplicationContext reactContext, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(promise, "promise");
        boolean zAreNotificationsEnabled = NotificationManagerCompat.from(reactContext).areNotificationsEnabled();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("status", zAreNotificationsEnabled ? GRANTED : BLOCKED);
        writableMapCreateMap.putMap("settings", Arguments.createMap());
        promise.resolve(writableMapCreateMap);
    }

    public final void shouldShowRequestRationale(ReactApplicationContext reactContext, String permission, Promise promise) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(permission, "permission");
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            promise.resolve(Boolean.valueOf(getPermissionAwareActivity(reactContext).shouldShowRequestPermissionRationale(permission)));
        } catch (IllegalStateException e2) {
            promise.reject(ERROR_INVALID_ACTIVITY, e2);
        }
    }
}
