package com.braze.support;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import bo.app.a60;
import bo.app.b60;
import bo.app.c60;
import bo.app.d60;
import bo.app.e60;
import bo.app.t50;
import bo.app.u50;
import bo.app.v50;
import bo.app.w50;
import bo.app.x50;
import bo.app.y50;
import bo.app.z50;
import com.braze.support.BrazeLogger;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!,u\bDJd|\u0004O\f8é6B\u0015\"4\u0012}\u0007njG0L͜P.`\\2şs{J$c$wCSi(\u007f:\t}Q\u0018k|Nr\u000bq\u00146\u001a\u0007pDI\u0004wu&\u001d9Zom;}sK=xtd\nP60>\u0012\u0005/\u0019BZ\u001e\u007f\u0013Cy\u0016:2VohW=Q\u0013 *\u0006l\u001f\u0019(jrf6vt\u0006<E\"1uZX5lH|{\u0017nV=\f%m>9NʺM\u0015SR9\u0007)½\u0012ƄCqEݛ\t35+as\u00065/ßfƦ/O\u0015ƞ\u00132j\u0006i`:&\u0002ՕeׂT\u000e0»ߧ\u007f\u001b"}, d2 = {"\u001cNC\u00169\u0010\u001c/\bbdG&gh\u001cMc\u0016i$j\u007f", "", "\u001eDA\u001a<\u001a,7\u0003gtL\u001bfu\u000bG_\"f-`w\u0005APq#V", "\"@6", "5dc\u001dX9FW'\r~h5i\t;u\u007f6\u000b\u001e\u000b' V", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", ">da:\\:LW#\b", "7mR?X4>\\(izk4\u0001\u0017=i\n1h@\r'\u0017U~kF\u0007.D", "", "6`b\u001dX9FW'\r~h5", "", "@d`BX:M>)\r}I,\n\u00113s\u000e,\u0006Ik$!Oz\u001d", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "End9W\u0017Na\u001cizk4\u0001\u0017=i\n1fM\u000b\u001f\"VN\u0012J\u0002,1m", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PermissionUtils {
    private static final String NOTIFICATION_PERMISSION = "android.permission.POST_NOTIFICATIONS";
    private static final String PERMISSION_STORAGE_PREFS_FILE = "com.braze.support.permission_util.requested_perms";
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("PermissionUtils");

    public static final int getPermissionRequestCount(Context context, String str) throws Throwable {
        Intrinsics.checkNotNullParameter(context, hg.Vd(":ECH8JE", (short) (C1633zX.Xd() ^ (-32662)), (short) (C1633zX.Xd() ^ (-23914))));
        Intrinsics.checkNotNullParameter(str, C1561oA.ud("}q}wr{zotr", (short) (OY.Xd() ^ 19202)));
        Object[] objArr = {C1561oA.yd("fsn0izf\u0001p:|\u007f\u007f\u0001|\u0001\bB\u0002w\n\u0006~\n\u000f\u0006\t\t~\u0016\u0012\bO\u0012SGX]JY_QMI_U_[f", (short) (C1607wl.Xd() ^ 9208)), 0};
        Method method = Class.forName(C1561oA.Yd("\r\u001b\u0012!\u001f\u001a\u0016`\u0017$$+\u001d'.h~,,3%96", (short) (C1499aX.Xd() ^ (-15908)))).getMethod(Jg.Wd("\u0012\u000f\u0019%5\\XInH&CBcf\u0011\bo' ", (short) (Od.Xd() ^ (-378)), (short) (Od.Xd() ^ (-1498))), Class.forName(Xg.qd("sk\u0002m;zp~x@f\t\b\u007f\u0006\u007f", (short) (Od.Xd() ^ (-5071)), (short) (Od.Xd() ^ (-30656)))), Integer.TYPE);
        try {
            method.setAccessible(true);
            return ((SharedPreferences) method.invoke(context, objArr)).getInt(str, 0);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final boolean hasPermission(Context context, String str) {
        Intrinsics.checkNotNullParameter(str, ZO.xd("LWu\u0018Pq-\u0006!?", (short) (OY.Xd() ^ 14260), (short) (OY.Xd() ^ 16964)));
        if (context == null) {
            return false;
        }
        try {
            Class<?> cls = Class.forName(C1626yg.Ud("b}\u007f\u000b.\u001d\u0011=B[}\u007f<\b\u001bY4\u000fgXdT\u0005", (short) (Od.Xd() ^ (-20058)), (short) (Od.Xd() ^ (-15190))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1633zX.Xd() ^ (-23057));
            int[] iArr = new int["\fL1\u0003E>E\u00112{\u001d\"TSF$".length()];
            QB qb = new QB("\fL1\u0003E>E\u00112{\u001d\"TSF$");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = {str};
            Method method = cls.getMethod(EO.Od("\n^)\u000f\b5/\u0012Yip\u00047`%P5\u0015FC(JXf\u001e(K{", (short) (ZN.Xd() ^ 28734)), clsArr);
            try {
                method.setAccessible(true);
                return ((Integer) method.invoke(context, objArr)).intValue() == 0;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, th, false, (Function0) new t50(str), 8, (Object) null);
            return false;
        }
    }

    public static final void incrementPermissionRequestCount(Context context, String str) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.Qd("#.,1!3.", (short) (C1607wl.Xd() ^ 27824)));
        Intrinsics.checkNotNullParameter(str, C1593ug.zd("J@NJGRSJQQ", (short) (FB.Xd() ^ 8127), (short) (FB.Xd() ^ 30602)));
        Object[] objArr = {C1561oA.od("~\n\u0007Fy\tv\u000fx@\u0005\u0006\u007f~|~\u007f8ymysnwvkpn^sqeg(k]hkZggWUO_S_Y^", (short) (OY.Xd() ^ 11663)), 0};
        Method method = Class.forName(C1561oA.Kd("R`Wfd_[&\\iipbls.Dqqxj~{", (short) (ZN.Xd() ^ 10746))).getMethod(C1561oA.Xd("?>N.D>PDD1THJJXLVLO^", (short) (C1499aX.Xd() ^ (-25312))), Class.forName(Wg.Zd("u>\u001eWr~>\u001eq\u0006yi2zJ\u0012", (short) (ZN.Xd() ^ 23513), (short) (ZN.Xd() ^ 26353))), Integer.TYPE);
        try {
            method.setAccessible(true);
            SharedPreferences sharedPreferences = (SharedPreferences) method.invoke(context, objArr);
            int i2 = sharedPreferences.getInt(str, 0) + 1;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new u50(i2), 14, (Object) null);
            sharedPreferences.edit().putInt(str, i2).apply();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static final void requestPushPermissionPrompt(Activity activity) throws Throwable {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        String str = TAG;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, str, priority, (Throwable) null, false, (Function0) v50.f2001a, 12, (Object) null);
        if (activity == null) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) w50.f2104a, 14, (Object) null);
            return;
        }
        if (!wouldPushPermissionPromptDisplay(activity) || Build.VERSION.SDK_INT < 33) {
            BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) x50.f2185a, 14, (Object) null);
            return;
        }
        incrementPermissionRequestCount(activity, NOTIFICATION_PERMISSION);
        BrazeLogger.brazelog$default(brazeLogger, str, priority, (Throwable) null, false, (Function0) y50.f2270a, 12, (Object) null);
        activity.requestPermissions(new String[]{NOTIFICATION_PERMISSION}, IntentUtils.getRequestCode());
    }

    public static final boolean wouldPushPermissionPromptDisplay(Activity activity) throws Throwable {
        Object obj;
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) z50.f2354a, 14, (Object) null);
            return false;
        }
        if (Build.VERSION.SDK_INT < 33) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) a60.f175a, 12, (Object) null);
            return false;
        }
        ApplicationInfo applicationInfo = activity.getApplicationInfo();
        String strVd = Wg.vd("<H=JF?9\u0002FQOTDLQ\n[W\u0017)WVQMVSeY^\\6Z!)", (short) (ZN.Xd() ^ 6312));
        String strKd = Qg.kd("0\u001c, \u001d+\t\u0019\u001f\t\u0017##\u0018\u001d\u001b", (short) (C1633zX.Xd() ^ (-25992)), (short) (C1633zX.Xd() ^ (-23883)));
        try {
            Class<?> cls = Class.forName(strVd);
            Field field = 1 != 0 ? cls.getField(strKd) : cls.getDeclaredField(strKd);
            field.setAccessible(true);
            obj = field.get(applicationInfo);
        } catch (Throwable th) {
            obj = null;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (iIntValue < 33) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new b60(iIntValue), 12, (Object) null);
            return false;
        }
        String strVd2 = hg.Vd("O[P]YRL\u0015VJVPKTSHMK\n+),,6$$(\u001c\u0018\u001a\u0013\u0010\"\u0016\u001b\u0019\u001d", (short) (ZN.Xd() ^ 32387), (short) (ZN.Xd() ^ 15077));
        if (hasPermission(activity, strVd2)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) c60.f320a, 12, (Object) null);
            return false;
        }
        int permissionRequestCount = getPermissionRequestCount(activity, strVd2);
        if (permissionRequestCount >= 2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new d60(permissionRequestCount), 12, (Object) null);
            return activity.shouldShowRequestPermissionRationale(strVd2);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) e60.f549a, 12, (Object) null);
        return true;
    }
}
