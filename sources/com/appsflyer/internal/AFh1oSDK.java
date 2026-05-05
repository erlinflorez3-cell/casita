package com.appsflyer.internal;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.migration.internal.MigrationDataProvider;
import com.biocatch.android.commonsdk.configuration.ConfigurationDefaultValue;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AFh1oSDK implements AFh1pSDK {
    private Long AFAdRevenueData;
    private boolean component1;
    private boolean component2;
    private JSONObject getCurrencyIso4217Code;
    private Long getMediationNetwork;
    private final AFc1oSDK getMonetizationNetwork;
    private final AFj1sSDK getRevenue;

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] AFAdRevenueData;

        static {
            int[] iArr = new int[AFe1pSDK.values().length];
            try {
                iArr[AFe1pSDK.LAUNCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFe1pSDK.ATTR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AFAdRevenueData = iArr;
        }
    }

    public AFh1oSDK(AFc1oSDK aFc1oSDK, AFj1sSDK aFj1sSDK) {
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFj1sSDK, "");
        this.getMonetizationNetwork = aFc1oSDK;
        this.getRevenue = aFj1sSDK;
    }

    private final void AFAdRevenueData(String str, AFh1mSDK aFh1mSDK, JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put(str, jSONObject);
        HashMap map2 = new HashMap();
        map2.put("branch", map);
        HashMap map3 = new HashMap();
        map3.put("external", map2);
        aFh1mSDK.AFAdRevenueData(map3);
        Map<String, Object> map4 = aFh1mSDK.AFAdRevenueData;
        Intrinsics.checkNotNullExpressionValue(map4, "");
        AFe1pSDK aFe1pSDKAFAdRevenueData = aFh1mSDK.AFAdRevenueData();
        Intrinsics.checkNotNullExpressionValue(aFe1pSDKAFAdRevenueData, "");
        getMonetizationNetwork(map4, aFe1pSDKAFAdRevenueData);
    }

    private final JSONObject getCurrencyIso4217Code() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObjectWaitForAttributionData = MigrationDataProvider.waitForAttributionData(ConfigurationDefaultValue.MotionPaddingAroundTouchMSec);
        if (jSONObjectWaitForAttributionData != null) {
            this.getMediationNetwork = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
        }
        return jSONObjectWaitForAttributionData;
    }

    private final void getMonetizationNetwork(Map<String, Object> map, AFe1pSDK aFe1pSDK) {
        int i2 = AFa1uSDK.AFAdRevenueData[aFe1pSDK.ordinal()];
        Long l2 = i2 != 1 ? i2 != 2 ? null : this.getMediationNetwork : this.AFAdRevenueData;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            Map<String, Object> mediationNetwork = AFa1ySDK.getMediationNetwork(map);
            Intrinsics.checkNotNullExpressionValue(mediationNetwork, "");
            mediationNetwork.put("migration", MapsKt.mapOf(TuplesKt.to("delay", Long.valueOf(jLongValue))));
        }
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void AFAdRevenueData() {
        this.component1 = false;
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void getCurrencyIso4217Code(AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        JSONObject attributionData = MigrationDataProvider.getAttributionData();
        if (attributionData != null) {
            AFAdRevenueData("attr", aFh1mSDK, attributionData);
            this.component2 = true;
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void getMediationNetwork(AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        JSONObject jSONObject = this.getCurrencyIso4217Code;
        if (jSONObject != null) {
            Intrinsics.checkNotNull(jSONObject);
            AFAdRevenueData("attr", aFh1mSDK, jSONObject);
        } else {
            JSONObject currencyIso4217Code = getCurrencyIso4217Code();
            if (currencyIso4217Code != null) {
                AFAdRevenueData("attr", aFh1mSDK, currencyIso4217Code);
            }
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void getMonetizationNetwork(AFf1rSDK aFf1rSDK, Function0<Unit> function0) {
        JSONObject currencyIso4217Code;
        Intrinsics.checkNotNullParameter(aFf1rSDK, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (this.getMonetizationNetwork.getMediationNetwork.getRevenue("appsFlyerCount", 0) == 1 && aFf1rSDK.getRevenue == AFe1pSDK.CONVERSION && this.getRevenue.getMediationNetwork() && !getRevenue() && (currencyIso4217Code = getCurrencyIso4217Code()) != null) {
            this.getCurrencyIso4217Code = currencyIso4217Code;
            function0.invoke();
        }
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void getMonetizationNetwork(AFh1mSDK aFh1mSDK) {
        Intrinsics.checkNotNullParameter(aFh1mSDK, "");
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObjectWaitForDeepLinkingData = MigrationDataProvider.waitForDeepLinkingData(ConfigurationDefaultValue.MotionPaddingAroundTouchMSec);
        if (jSONObjectWaitForDeepLinkingData != null) {
            this.AFAdRevenueData = Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis);
            AFAdRevenueData("dl", aFh1mSDK, jSONObjectWaitForDeepLinkingData);
        }
        MigrationDataProvider.clear();
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final boolean getMonetizationNetwork() {
        return this.component1;
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final boolean getRevenue() {
        return this.component2;
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final void u_(Intent intent, AFa1mSDK aFa1mSDK) throws Throwable {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        if (MigrationDataProvider.waitForDeepLinkingData(0L) != null) {
            this.component1 = true;
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        try {
            Object[] objArr = {data, aFa1mSDK};
            Object declaredConstructor = AFa1hSDK.f2584d.get(862139947);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1hSDK.getRevenue((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (62049 - ExpandableListView.getPackedPositionGroup(0L)), 37 - (ViewConfiguration.getTouchSlop() >> 8))).getDeclaredConstructor(Uri.class, AFa1mSDK.class);
                AFa1hSDK.f2584d.put(862139947, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr);
            Object method = AFa1hSDK.f2584d.get(-180621578);
            if (method == null) {
                method = ((Class) AFa1hSDK.getRevenue((-1) - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (62050 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36)).getMethod("getMediationNetwork", null);
                AFa1hSDK.f2584d.put(-180621578, method);
            }
            Object objInvoke = ((Method) method).invoke(objNewInstance, null);
            Object method2 = AFa1hSDK.f2584d.get(614194017);
            if (method2 == null) {
                method2 = ((Class) AFa1hSDK.getRevenue(Color.blue(0) + 37, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 52 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).getMethod("AFAdRevenueData", null);
                AFa1hSDK.f2584d.put(614194017, method2);
            }
            this.component1 = !((Boolean) ((Method) method2).invoke(objInvoke, null)).booleanValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
