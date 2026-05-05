package com.ticnow.sdk.idnowonboarding.connectivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.ConnectionResult;
import com.ticnow.sdk.idnowonboarding.dialog.Dialog;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {1, 0, 3}, d1 = {"Я*\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0007\":\u001b\u007fјnjO0LeN.ZS8\u000fs{:$qҕ\u0010MkUH|Z\bY\u000fj̊rJh\u000b\f\u001b\u0014\u0019\u0011jZM\u0006|k\u0017'2pu\bA[vU9\u000fxf\t.7:8(\u000bG\u001arV\u001e~\u0013Cy\u0015B4NuRR;SK\u001ab\u0012L!\u0019\u001e\u000bi%ȧ\u000bǰa:7݊ɮmM"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#{*@v\u0016,\\GLoC2^L@\u0017\u0011l5Nt6K]R;p(", "", "u(E", "\"@6", "", "1gT0^\u0010Gb\u0019\f\u0004^;Z\u00138n\u007f&\u000bD\u000b ", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "7r=2g>H`\u001fZ\fZ0\u0004\u0005,l\u007f", ":`d;V/\u001aZ\u0019\f\n=0x\u00109g", "", "\u0011n\\=T5B]\"", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
public final class IDConnectivity {
    public static final Companion Companion = new Companion(null);
    private final String TAG = "IDConnectivity";

    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00146Ȑ\u0007\"B\u0012\u007fјlʘ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$:OIV2}P\u000b\u007fRuj\u0007J\t\u000få\u0013\u000b"}, d2 = {"\u001ab^:\";BQ\"\t\r(:{\u000fxi~1\u0006R\u000b \u0014Qk\u001b;z.7#{*@v\u0016,\\GLoC2^L@\u0017\u0011l5Nt6K]R;p\u0011PG\u001c\u001dV\u0017R5\u0016Z", "", "u(E", "7r>;_0GS", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "\u0017C=<j\u0016GP#z\b]0\u0006\u000b)r\u007f/{<\u000f\u0017"}, k = 1, mv = {1, 1, 16}, pn = "", xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isOnline(Context context) throws Throwable {
            Intrinsics.checkParameterIsNotNull(context, C1561oA.yd("*77>0DA", (short) (FB.Xd() ^ 14763)));
            short sXd = (short) (OY.Xd() ^ 17431);
            int[] iArr = new int["2??@87I?MAMS".length()];
            QB qb = new QB("2??@87I?MAMS");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            Object[] objArr = {new String(iArr, 0, i2)};
            Method method = Class.forName(Xg.qd("\u0018&\u001d,*%!k\"//6(29s\n77>0DA", (short) (C1633zX.Xd() ^ (-13041)), (short) (C1633zX.Xd() ^ (-4056)))).getMethod(ZO.xd("e\u0017XuE6\f\u0014i$R#7\u0014UC", (short) (FB.Xd() ^ 16912), (short) (FB.Xd() ^ 694)), Class.forName(Jg.Wd("t8a\u0019z\u0006\u001fx\u0005\u001cQ\u0014bi?G", (short) (ZN.Xd() ^ 27921), (short) (ZN.Xd() ^ 30257))));
            try {
                method.setAccessible(true);
                Object objInvoke = method.invoke(context, objArr);
                if (objInvoke == null) {
                    throw new TypeCastException(C1626yg.Ud("oC?<iRVG\tj\u001f+zNb8y61R\u0011f\u000e=\u007fg\t<y4vux9(6\u0003AK\u0014a\u001bw$a\u0012JF)\u0003IK\u001aPrRag\"\u007fTMMpMyUI", (short) (ZN.Xd() ^ 4883), (short) (ZN.Xd() ^ 24529)));
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) objInvoke;
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null) {
                    return networkCapabilities.hasCapability(12);
                }
                return false;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.connectivity.IDConnectivity$launchAlertDialog$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {1, 0, 3}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u0013tjQ8bgp0hRX\u0010\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "=m29\\*D"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
    static final class AnonymousClass1 implements View.OnClickListener {
        final /* synthetic */ Context $context;
        final /* synthetic */ Activity $mActivity;

        /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.connectivity.IDConnectivity$launchAlertDialog$1$1 */
        @InterfaceC1492Gx
        @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
        static final class RunnableC02761 implements Runnable {
            RunnableC02761() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                activity.setResult(IDStepResponseCodes.STEP_RESULT_ABORT_FLOW, new Intent());
                activity.finish();
            }
        }

        AnonymousClass1(Context context, Activity activity) {
            context = context;
            activity = activity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                ((Activity) context).runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.connectivity.IDConnectivity.launchAlertDialog.1.1
                    RunnableC02761() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        activity.setResult(IDStepResponseCodes.STEP_RESULT_ABORT_FLOW, new Intent());
                        activity.finish();
                    }
                });
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    private final boolean isNetworkAvailable(Context context) throws Throwable {
        short sXd = (short) (C1633zX.Xd() ^ (-3538));
        int[] iArr = new int["\u001eyF.e\u001fDp'\n\u000f]".length()];
        QB qb = new QB("\u001eyF.e\u001fDp'\n\u000f]");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        Object[] objArr = {new String(iArr, 0, i2)};
        Method method = Class.forName(EO.Od("|C[\u0005\u001bZ=NWbw(HCY8r-Se\u001aTz", (short) (OY.Xd() ^ 10171))).getMethod(C1593ug.zd("\u0013\u0012\"\u0002)$&\u0018!\b\u001b).\"\u001d ", (short) (C1633zX.Xd() ^ (-29717)), (short) (C1633zX.Xd() ^ (-25322))), Class.forName(C1561oA.Qd("J@T>\nG;G?\u0005)IF<@8", (short) (Od.Xd() ^ (-19036)))));
        try {
            method.setAccessible(true);
            ConnectivityManager connectivityManager = (ConnectivityManager) method.invoke(context, objArr);
            if (connectivityManager == null) {
                Intrinsics.throwNpe();
            }
            return connectivityManager.getActiveNetworkInfo() != null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final void launchAlertDialog(Context context) {
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        Activity activity = (Activity) context;
        Dialog.INSTANCE.show(((FragmentActivity) context).getSupportFragmentManager(), activity, "Comunicación no disponible", "Intente nuevamente", "Aceptar", new View.OnClickListener() { // from class: com.ticnow.sdk.idnowonboarding.connectivity.IDConnectivity.launchAlertDialog.1
            final /* synthetic */ Context $context;
            final /* synthetic */ Activity $mActivity;

            /* JADX INFO: renamed from: com.ticnow.sdk.idnowonboarding.connectivity.IDConnectivity$launchAlertDialog$1$1 */
            @InterfaceC1492Gx
            @Metadata(bv = {1, 0, 3}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "@t]"}, k = 3, mv = {1, 1, 16}, pn = "", xs = "")
            static final class RunnableC02761 implements Runnable {
                RunnableC02761() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    activity.setResult(IDStepResponseCodes.STEP_RESULT_ABORT_FLOW, new Intent());
                    activity.finish();
                }
            }

            AnonymousClass1(Context context2, Activity activity2) {
                context = context2;
                activity = activity2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.onClick_enter(view);
                try {
                    ((Activity) context).runOnUiThread(new Runnable() { // from class: com.ticnow.sdk.idnowonboarding.connectivity.IDConnectivity.launchAlertDialog.1.1
                        RunnableC02761() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            activity.setResult(IDStepResponseCodes.STEP_RESULT_ABORT_FLOW, new Intent());
                            activity.finish();
                        }
                    });
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
    }

    public final boolean checkInternetConnection(Context context) throws Exception {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (isNetworkAvailable(context)) {
            try {
                URLConnection uRLConnectionOpenConnection = new URL("http://www.google.com").openConnection();
                Callback.openConnection(uRLConnectionOpenConnection);
                if (uRLConnectionOpenConnection == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.net.HttpURLConnection");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setRequestProperty("User-Agent", "Test");
                httpURLConnection.setRequestProperty("Connection", "close");
                httpURLConnection.setConnectTimeout(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
                Callback.connect(httpURLConnection);
                return Callback.getResponseCode(httpURLConnection) == 200;
            } catch (IOException unused) {
                launchAlertDialog(context);
            }
        } else {
            launchAlertDialog(context);
        }
        return false;
    }
}
