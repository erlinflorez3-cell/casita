package com.appsflyer.share;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFa1ySDK;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class ShareInviteHelper {
    public static LinkGenerator generateInviteUrl(Context context) throws Throwable {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        String appsFlyerUID = appsFlyerLib.getAppsFlyerUID(context);
        String string = AppsFlyerProperties.getInstance().getString(EO.Od("<j\u0014\u001aW:\u0013:/;+", (short) (C1633zX.Xd() ^ (-10214))));
        String string2 = AppsFlyerProperties.getInstance().getString(C1561oA.Qd("FD:@<@<\u0014>;.59", (short) (C1499aX.Xd() ^ (-1378))));
        String mediationNetwork = AFa1ySDK.getMediationNetwork();
        short sXd = (short) (C1499aX.Xd() ^ (-28969));
        short sXd2 = (short) (C1499aX.Xd() ^ (-4522));
        int[] iArr = new int["rxru\u0006\u0007v\u0002\b\u0011\u0005\u0011\u0003\u0012".length()];
        QB qb = new QB("rxru\u0006\u0007v\u0002\b\u0011\u0005\u0011\u0003\u0012");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        LinkGenerator linkGenerator = new LinkGenerator(new String(iArr, 0, i2));
        short sXd3 = (short) (OY.Xd() ^ 9954);
        int[] iArr2 = new int["\u0014 \u0015\"\u001e\u0017\u0011Y\u000e\u0019\u0017\u001c\f\u0014\u0019Qe\u0011\u000f\u0014\u0004\u0016\u0011".length()];
        QB qb2 = new QB("\u0014 \u0015\"\u001e\u0017\u0011Y\u000e\u0019\u0017\u001c\f\u0014\u0019Qe\u0011\u000f\u0014\u0004\u0016\u0011");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Kd("qp\u0001]or{ryxbv\u0004|", (short) (C1607wl.Xd() ^ 22050)), new Class[0]);
        try {
            method.setAccessible(true);
            LinkGenerator referrerCustomerId = linkGenerator.setBaseURL(string, string2, (String) method.invoke(context, objArr)).setReferrerUID(appsFlyerUID).setReferrerCustomerId(mediationNetwork);
            String strZd = Wg.Zd("Vg]~qqoof", (short) (ZN.Xd() ^ 7991), (short) (ZN.Xd() ^ 30365));
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Xd("SaXge`\\']jjqcmt/Erryk\u007f|", (short) (Od.Xd() ^ (-11594)))).getMethod(Wg.vd("MJ\\7KLWLUR>P_V", (short) (Od.Xd() ^ (-9941))), new Class[0]);
            try {
                method2.setAccessible(true);
                LinkGenerator linkGeneratorAddParameter = referrerCustomerId.addParameter(strZd, (String) method2.invoke(context, objArr2));
                String string3 = AppsFlyerProperties.getInstance().getString(Qg.kd("\u0001~tzvzv]lplsj", (short) (OY.Xd() ^ 20797), (short) (OY.Xd() ^ 7431)));
                if (string3 != null && string3.length() > 3) {
                    linkGeneratorAddParameter.setBaseDeeplink(string3);
                }
                return linkGeneratorAddParameter;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static void logInvite(Context context, String str, Map<String, String> map) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            AFLogger.afWarnLog("[Invite] Cannot report App-Invite with null/empty channel");
            return;
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, report Invite is disabled", true);
            return;
        }
        LinkGenerator linkGeneratorGenerateInviteUrl = generateInviteUrl(context);
        linkGeneratorGenerateInviteUrl.addParameters(map);
        AFLogger.afDebugLog("[Invite] Reporting App-Invite via channel: ".concat(String.valueOf(str)));
        AFLogger.afDebugLog(new StringBuilder("[Invite] Generated URL: ").append(linkGeneratorGenerateInviteUrl.generateLink()).toString());
        String mediaSource = linkGeneratorGenerateInviteUrl.getMediaSource();
        if ("af_app_invites".equals(mediaSource)) {
            mediaSource = AFInAppEventType.INVITE;
        } else if ("af_user_share".equals(mediaSource)) {
            mediaSource = AFInAppEventType.SHARE;
        }
        HashMap map2 = new HashMap();
        if (linkGeneratorGenerateInviteUrl.getUserParams() != null) {
            map2.putAll(linkGeneratorGenerateInviteUrl.getUserParams());
        }
        map2.put(AFInAppEventParameterName.AF_CHANNEL, str);
        AppsFlyerLib.getInstance().logEvent(context, mediaSource, map2);
    }
}
