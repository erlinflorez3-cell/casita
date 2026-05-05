package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.OY;
import yg.Qg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public final class AFb1mSDK extends AFb1uSDK<String> {
    public AFb1mSDK(Context context, Executor executor) {
        super(context, executor, "com.facebook.katana.provider.AttributionIdProvider", "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.appsflyer.internal.AFb1uSDK
    /* JADX INFO: renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
    public String getRevenue() throws Throwable {
        Cursor cursorQuery;
        String strKd = Qg.kd("t{u", (short) (OY.Xd() ^ 26141), (short) (OY.Xd() ^ 3509));
        try {
            Context context = this.getMonetizationNetwork;
            Object[] objArr = new Object[0];
            Method method = Class.forName(hg.Vd("R^S`\\UO\u0018LWUZJRW\u0010$OMRBTO", (short) (FB.Xd() ^ 6222), (short) (FB.Xd() ^ 30168))).getMethod(C1561oA.ud("nkyGrpuemrOanien\\h", (short) (ZN.Xd() ^ 1139)), new Class[0]);
            try {
                method.setAccessible(true);
                cursorQuery = ((ContentResolver) method.invoke(context, objArr)).query(Uri.parse(new StringBuilder(C1561oA.yd("\u0010\u001d\u0019 \u0016 #iST", (short) (C1580rY.Xd() ^ (-31813)))).append(this.getMediationNetwork).toString()), new String[]{strKd}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(strKd));
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return string;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        throw th;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th2) {
            th = th2;
            cursorQuery = null;
        }
    }

    public final String getMediationNetwork() {
        this.AFAdRevenueData.execute(this.getRevenue);
        return (String) super.getMonetizationNetwork();
    }

    @Override // com.appsflyer.internal.AFb1uSDK
    public final /* synthetic */ String getMonetizationNetwork() {
        this.AFAdRevenueData.execute(this.getRevenue);
        return (String) super.getMonetizationNetwork();
    }
}
