package com.braze.ui.support;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

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
@Metadata(bv = {}, d1 = {"Я.\u001d̉=!,u\bӵLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0RnP.XS2\u000fy\u001e<$q$yّSo(}:\u000beM\u0016h\u001fNh\r[\u000f4\u0019)r2Ic|u\u0014%1ptWG[uU9\u000f{f\t.4:8(\b1\u001e8P(v)Bc  9X|JT\u001dM3\u0019\"\bN /\u001d\u000bqv6vw}F=݊\u001bipM}ۂ2ƊQ\rNÖܴ\u0011\u0003"}, d2 = {"\"@6", "", "5dc\u001aT0G/\u0017\u000e~o0\f\u001d\u0013n\u000f(\u0005O", "\u001a`]1e6BRb|\u0005g;|\u0012>/c1\u000b@\n&l", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "3wc?T:", "\u001a`]1e6BRb\t\t(\t\r\u0012.l\u007f}", "7r00g0OW(\u0013g^.\u0001\u0017>e\r(z$\n~\u0013Ps\u000f<\u00054", "", "1kP@f\u0015:[\u0019", "5dc\u001eh,Kg\u0004z\bZ4|\u0018/r\u000e", "", "\u001a`]1e6BRb\bzmul\u00163;", "/mS?b0=\u001b'}\u0001&<\u0001\u0003<e\u0007(wN\u0001"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class UriUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("UriUtils");

    /* JADX INFO: renamed from: com.braze.ui.support.UriUtils$getQueryParameters$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<String> {
        final /* synthetic */ Ref.ObjectRef<Uri> $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef<Uri> objectRef) {
            super(0);
            objectRef = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Encoded query is null for Uri: " + objectRef.element + " Returning empty map for query parameters";
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.support.UriUtils$getQueryParameters$2 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function0<String> {
        final /* synthetic */ Ref.ObjectRef<Uri> $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Ref.ObjectRef<Uri> objectRef) {
            super(0);
            objectRef = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Failed to map the query parameters of Uri: " + objectRef.element;
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.support.UriUtils$isActivityRegisteredInManifest$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,u\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C10901 extends Lambda implements Function0<String> {
        final /* synthetic */ String $className;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10901(String str) {
            super(0);
            str = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Could not find activity info for class with name: " + str;
        }
    }

    public static final Intent getMainActivityIntent(Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, C1626yg.Ud("`59_;&\u0018", (short) (C1499aX.Xd() ^ (-18929)), (short) (C1499aX.Xd() ^ (-15199))));
        Class<?> cls = Class.forName(Ig.wd("1\u000e LX\u001d\u0002\n\u001c*1O\u0011\u0016\u000e_?W=Iv0\u0014", (short) (C1499aX.Xd() ^ (-1822))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1607wl.Xd() ^ 10031);
        int[] iArr = new int["(P\u0012\u0016^-\u0001o bHz6#!=~".length()];
        QB qb = new QB("(P\u0012\u0016^-\u0001o bHz6#!=~");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Qd("\u0012\u001e\u0013 \u001c\u0015\u000fW\f\u0017\u0015\u001a\n\u0012\u0017Oc\u000f\r\u0012\u0002\u0014\u000f", (short) (OY.Xd() ^ 17328))).getMethod(C1593ug.zd("wv\u0007cux\u0002x\u007f~h|\n\u0003", (short) (OY.Xd() ^ 19078), (short) (OY.Xd() ^ 12878)), new Class[0]);
            try {
                method2.setAccessible(true);
                Object[] objArr3 = {(String) method2.invoke(context, objArr2)};
                Method method3 = Class.forName(C1561oA.od("/;0=92,t)427'/4l.*i\u000b\u001b\u001c#\u0018\u001d\u001a\u0001\u0014 \u0012\u0017\u0014 ", (short) (C1580rY.Xd() ^ (-2758)))).getMethod(Wg.Zd("\u001cVBU\u0004\u0017,\u001e:XT\u0013!%H\u0015[\u001bO\u001eG,Z{v", (short) (Od.Xd() ^ (-7926)), (short) (Od.Xd() ^ (-20383))), Class.forName(C1561oA.Kd("`XnZ(g]ke-Sutlrl", (short) (C1580rY.Xd() ^ (-9352)))));
                try {
                    method3.setAccessible(true);
                    Intent intent = (Intent) method3.invoke(packageManager, objArr3);
                    if (intent != null) {
                        intent.setFlags(BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.URI_UTILS_GET_MAIN_ACTIVITY_INTENT));
                    }
                    if (bundle != null && intent != null) {
                        intent.putExtras(bundle);
                    }
                    return intent;
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    public static /* synthetic */ Intent getMainActivityIntent$default(Context context, Bundle bundle, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            bundle = null;
        }
        return getMainActivityIntent(context, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, android.net.Uri, java.lang.Object] */
    public static final Map<String, String> getQueryParameters(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = uri;
        String encodedQuery = ((Uri) objectRef.element).getEncodedQuery();
        if (encodedQuery == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Function0<String>() { // from class: com.braze.ui.support.UriUtils.getQueryParameters.1
                final /* synthetic */ Ref.ObjectRef<Uri> $uri;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Ref.ObjectRef<Uri> objectRef2) {
                    super(0);
                    objectRef = objectRef2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Encoded query is null for Uri: " + objectRef.element + " Returning empty map for query parameters";
                }
            }, 12, (Object) null);
            return MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            if (((Uri) objectRef2.element).isOpaque()) {
                ?? Build = Uri.parse("://").buildUpon().encodedQuery(encodedQuery).build();
                Intrinsics.checkNotNullExpressionValue(Build, "parse(\"://\")\n           …\n                .build()");
                objectRef2.element = Build;
            }
            Set<String> queryParameterNames = ((Uri) objectRef2.element).getQueryParameterNames();
            Intrinsics.checkNotNullExpressionValue(queryParameterNames, "uri.queryParameterNames");
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : queryParameterNames) {
                String str = (String) obj;
                if (!(str == null || str.length() == 0)) {
                    arrayList.add(obj);
                }
            }
            for (String queryParameterKey : arrayList) {
                String queryParameter = ((Uri) objectRef2.element).getQueryParameter(queryParameterKey);
                String str2 = queryParameter;
                if (str2 != null && str2.length() != 0) {
                    Intrinsics.checkNotNullExpressionValue(queryParameterKey, "queryParameterKey");
                    linkedHashMap.put(queryParameterKey, queryParameter);
                }
            }
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) new Function0<String>() { // from class: com.braze.ui.support.UriUtils.getQueryParameters.2
                final /* synthetic */ Ref.ObjectRef<Uri> $uri;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(Ref.ObjectRef<Uri> objectRef2) {
                    super(0);
                    objectRef = objectRef2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to map the query parameters of Uri: " + objectRef.element;
                }
            }, 8, (Object) null);
        }
        return linkedHashMap;
    }

    public static final boolean isActivityRegisteredInManifest(Context context, String str) throws Throwable {
        Intrinsics.checkNotNullParameter(context, C1561oA.Xd("jww~p\u0005\u0002", (short) (C1580rY.Xd() ^ (-9404))));
        short sXd = (short) (FB.Xd() ^ 14675);
        int[] iArr = new int["U]Qba;MXO".length()];
        QB qb = new QB("U]Qba;MXO");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Intrinsics.checkNotNullParameter(str, new String(iArr, 0, i2));
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                Class<?> cls = Class.forName(Qg.kd("FRGTPIC\f@KIN>FK\u0004\u0018CAF6HC", (short) (C1499aX.Xd() ^ (-11722)), (short) (C1499aX.Xd() ^ (-3437))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd2 = (short) (C1499aX.Xd() ^ (-11348));
                short sXd3 = (short) (C1499aX.Xd() ^ (-14008));
                int[] iArr2 = new int["GDR-=>E:?<#6B496B".length()];
                QB qb2 = new QB("GDR-=>E:?<#6B496B");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd2 + i3 + xuXd2.CK(iKK2) + sXd3);
                    i3++;
                }
                Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method.setAccessible(true);
                    PackageManager packageManager = (PackageManager) method.invoke(context, objArr);
                    ComponentName componentName = new ComponentName(context, str);
                    PackageManager.ComponentInfoFlags componentInfoFlagsOf = PackageManager.ComponentInfoFlags.of(0L);
                    short sXd4 = (short) (C1633zX.Xd() ^ (-23488));
                    int[] iArr3 = new int["VbWd`YS\u001cP[Y^NV[\u0014UQ\u00112BCJ?DA(;G9>;G".length()];
                    QB qb3 = new QB("VbWd`YS\u001cP[Y^NV[\u0014UQ\u00112BCJ?DA(;G9>;G");
                    int i4 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i4] = xuXd3.fK(sXd4 + i4 + xuXd3.CK(iKK3));
                        i4++;
                    }
                    Class<?> cls2 = Class.forName(new String(iArr3, 0, i4));
                    Class<?>[] clsArr2 = new Class[2];
                    clsArr2[0] = Class.forName(C1561oA.yd("FTKZXSO\u001aP]]dV`g\"8edhhh`jqL`mf", (short) (C1607wl.Xd() ^ 25178)));
                    short sXd5 = (short) (C1633zX.Xd() ^ (-31662));
                    int[] iArr4 = new int["kyp\u007f}xt?u\u0003\u0003\n{\u0006\rG\u000b\tJm\u007f\u0003\f\u0003\n\tq\u0007\u0015\t\u0010\u000f\u001dOo\u001d\u001c   \u0018\")~%\u001e(\u007f'\u001d$1".length()];
                    QB qb4 = new QB("kyp\u007f}xt?u\u0003\u0003\n{\u0006\rG\u000b\tJm\u007f\u0003\f\u0003\n\tq\u0007\u0015\t\u0010\u000f\u001dOo\u001d\u001c   \u0018\")~%\u001e(\u007f'\u001d$1");
                    int i5 = 0;
                    while (qb4.YK()) {
                        int iKK4 = qb4.KK();
                        Xu xuXd4 = Xu.Xd(iKK4);
                        iArr4[i5] = xuXd4.fK(xuXd4.CK(iKK4) - (((sXd5 + sXd5) + sXd5) + i5));
                        i5++;
                    }
                    clsArr2[1] = Class.forName(new String(iArr4, 0, i5));
                    Object[] objArr2 = {componentName, componentInfoFlagsOf};
                    Method method2 = cls2.getMethod(Xg.qd("\u000f\u000e\u001ek\u000f!\u0017%\u0019%+{\"\u001b%", (short) (C1580rY.Xd() ^ (-25902)), (short) (C1580rY.Xd() ^ (-15362))), clsArr2);
                    try {
                        method2.setAccessible(true);
                        method2.invoke(packageManager, objArr2);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } else {
                short sXd6 = (short) (Od.Xd() ^ (-5070));
                short sXd7 = (short) (Od.Xd() ^ (-10467));
                int[] iArr5 = new int[";\u0015]\u0018'M\u001b1X3b78oF.UN\u007fR5\u0019C".length()];
                QB qb5 = new QB(";\u0015]\u0018'M\u001b1X3b78oF.UN\u007fR5\u0019C");
                int i6 = 0;
                while (qb5.YK()) {
                    int iKK5 = qb5.KK();
                    Xu xuXd5 = Xu.Xd(iKK5);
                    iArr5[i6] = xuXd5.fK(xuXd5.CK(iKK5) - ((i6 * sXd7) ^ sXd6));
                    i6++;
                }
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(new String(iArr5, 0, i6)).getMethod(ZO.xd("i\u0002}K\\@\ra?Rq\u0010\u0004;k|K", (short) (C1607wl.Xd() ^ 21934), (short) (C1607wl.Xd() ^ 1000)), new Class[0]);
                try {
                    method3.setAccessible(true);
                    PackageManager packageManager2 = (PackageManager) method3.invoke(context, objArr3);
                    ComponentName componentName2 = new ComponentName(context, str);
                    short sXd8 = (short) (C1607wl.Xd() ^ 32647);
                    short sXd9 = (short) (C1607wl.Xd() ^ 15886);
                    int[] iArr6 = new int["r\u0006muX#:(1\u000e\u00193\u0006%ir&-2:.R6&oT\tXPAq\u001a\"".length()];
                    QB qb6 = new QB("r\u0006muX#:(1\u000e\u00193\u0006%ir&-2:.R6&oT\tXPAq\u001a\"");
                    int i7 = 0;
                    while (qb6.YK()) {
                        int iKK6 = qb6.KK();
                        Xu xuXd6 = Xu.Xd(iKK6);
                        iArr6[i7] = xuXd6.fK((C1561oA.Xd[i7 % C1561oA.Xd.length] ^ ((sXd8 + sXd8) + (i7 * sXd9))) + xuXd6.CK(iKK6));
                        i7++;
                    }
                    Class<?> cls3 = Class.forName(new String(iArr6, 0, i7));
                    Class<?>[] clsArr3 = new Class[2];
                    clsArr3[0] = Class.forName(Ig.wd("w4\u001c\u0007\u001chsUO0-\u0015R.0\u000f[\u00127~Cq~\b?1a\u001d?", (short) (C1499aX.Xd() ^ (-6049))));
                    clsArr3[1] = Integer.TYPE;
                    Object[] objArr4 = {componentName2, 0};
                    Method method4 = cls3.getMethod(EO.Od("S\u0003s(:\u0011*F\r[v,\u0001j$", (short) (ZN.Xd() ^ 23603)), clsArr3);
                    try {
                        method4.setAccessible(true);
                        method4.invoke(packageManager2, objArr4);
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } catch (InvocationTargetException e5) {
                    throw e5.getCause();
                }
            }
            return true;
        } catch (PackageManager.NameNotFoundException e6) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) e6, false, (Function0) new Function0<String>() { // from class: com.braze.ui.support.UriUtils.isActivityRegisteredInManifest.1
                final /* synthetic */ String $className;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C10901(String str2) {
                    super(0);
                    str = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Could not find activity info for class with name: " + str;
                }
            }, 8, (Object) null);
            return false;
        }
    }
}
