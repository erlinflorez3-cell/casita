package com.valid.communication.managers.httprequestmanager;

import android.content.Context;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.dynatrace.android.agent.Global;
import com.google.gson.Gson;
import com.valid.communication.a;
import com.valid.communication.e;
import com.valid.communication.events.BaseErrorEvent;
import com.valid.communication.events.BaseSuccessEvent;
import com.valid.communication.helpers.ConvertDataHelper;
import com.valid.communication.managers.TimeoutManager;
import com.valid.communication.managers.VolleyManager;
import com.valid.communication.managers.communicationmanager.CommunicationManagerCallback;
import com.valid.communication.models.ErrorData;
import com.valid.utils.VsshLogger;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
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

/* JADX INFO: loaded from: classes5.dex */
public class HttpRequestManagerImp<Success extends BaseSuccessEvent, Error extends BaseErrorEvent> implements HttpRequestManager {
    private static final String TAG;
    private String baseUrl;
    private JSONObject body;
    private Class<Error> errorClass;
    private Response.ErrorListener errorListener;
    private int httpStatusCode;
    private CommunicationManagerCallback mCallback;
    private Context mContext;
    private JSONObject responseHeaders;
    private String sBody;
    private StringRequest stringRequest;
    private Response.Listener<String> stringResponseListener;
    private Class<Success> successClass;
    private EventBus eventBus = EventBus.getDefault();
    private Map<String, String> mHeaders = new HashMap();
    private ErrorData errorData = new ErrorData();

    public class IOException extends RuntimeException {
    }

    static {
        try {
            TAG = HttpRequestManager.class.getName();
        } catch (IOException unused) {
        }
    }

    public HttpRequestManagerImp(Class<Success> cls, Class<Error> cls2) {
        this.successClass = cls;
        this.errorClass = cls2;
        setListeners();
    }

    public static /* synthetic */ JSONObject access$102(HttpRequestManagerImp httpRequestManagerImp, JSONObject jSONObject) {
        try {
            httpRequestManagerImp.responseHeaders = jSONObject;
            return jSONObject;
        } catch (IOException unused) {
            return null;
        }
    }

    public static /* synthetic */ int access$202(HttpRequestManagerImp httpRequestManagerImp, int i2) {
        try {
            httpRequestManagerImp.httpStatusCode = i2;
            return i2;
        } catch (IOException unused) {
            return 0;
        }
    }

    public static /* synthetic */ JSONObject access$302(HttpRequestManagerImp httpRequestManagerImp, JSONObject jSONObject) {
        try {
            httpRequestManagerImp.body = jSONObject;
            return jSONObject;
        } catch (IOException unused) {
            return null;
        }
    }

    public static /* synthetic */ String access$402(HttpRequestManagerImp httpRequestManagerImp, String str) {
        try {
            httpRequestManagerImp.sBody = str;
            return str;
        } catch (IOException unused) {
            return null;
        }
    }

    private final void addToRequestQueue(Request request) {
        try {
            addToRequestQueue(request, "");
        } catch (IOException unused) {
        }
    }

    private final void addToRequestQueue(Request request, String str) {
        if (TextUtils.isEmpty(str)) {
            str = TAG;
        }
        request.setTag(str);
        (Integer.parseInt(C1561oA.od("j", (short) (C1607wl.Xd() ^ (177000502 ^ 176995228)))) != 0 ? null : VolleyManager.getInstance(this.mContext)).getRequestQueue().add(request);
    }

    private static String createGetUrl(Map<String, Object> map) {
        Map.Entry<String, Object> entry;
        String str;
        if (map == null) {
            return "";
        }
        String strKd = C1561oA.Kd(ProxyConfig.MATCH_ALL_SCHEMES, (short) (FB.Xd() ^ ((1784251032 ^ 1582678706) ^ 873213224)));
        StringBuilder sb = new StringBuilder(strKd);
        for (Map.Entry<String, Object> entry2 : map.entrySet()) {
            int iXd = OY.Xd() ^ 69955756;
            short sXd = (short) (C1607wl.Xd() ^ ((534351379 ^ 2067267435) ^ 1693343018));
            short sXd2 = (short) (C1607wl.Xd() ^ iXd);
            int[] iArr = new int["(".length()];
            QB qb = new QB("(");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            String str2 = new String(iArr, 0, i2);
            if (Integer.parseInt(str2) != 0) {
                str = null;
                entry = null;
            } else {
                entry = entry2;
                str = strKd;
            }
            if (!str.equals(sb.toString())) {
                sb.append(C1561oA.Xd("\u001d", (short) (Od.Xd() ^ (680932409 ^ (-680943463)))).charAt(0));
            }
            sb.append(entry.getKey()).append(Integer.parseInt(str2) != 0 ? (char) 1 : Wg.vd("\u0019", (short) (C1499aX.Xd() ^ (ZN.Xd() ^ (1226105799 ^ (-2057209090))))).charAt(0)).append(entry.getValue());
        }
        return sb.toString();
    }

    private final StringRequest getStringRequest() {
        StringRequest stringRequest = this.stringRequest;
        short sXd = (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ (952830901 ^ 1285189144)));
        short sXd2 = (short) (C1633zX.Xd() ^ (1717916998 ^ (-1717905634)));
        int[] iArr = new int["|".length()];
        QB qb = new QB("|");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        stringRequest.setRetryPolicy(Integer.parseInt(new String(iArr, 0, i2)) != 0 ? null : new DefaultRetryPolicy(TimeoutManager.getInstance().getTimeout(), 0, Float.intBitsToFloat(1147546824 ^ 2078682312)));
        return this.stringRequest;
    }

    private final void setListeners() {
        try {
            this.stringResponseListener = new Response.Listener<String>() { // from class: com.valid.communication.managers.httprequestmanager.HttpRequestManagerImp.2
                @Override // com.android.volley.Response.Listener
                public void onResponse(String str) {
                    BaseSuccessEvent baseSuccessEvent;
                    int i2;
                    String str2;
                    String str3;
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    String strYd = C1561oA.Yd("|", (short) (ZN.Xd() ^ ((1426290947 ^ 2087066578) ^ 694492873)));
                    try {
                        HttpRequestManagerImp httpRequestManagerImp = HttpRequestManagerImp.this;
                        int i10 = Integer.parseInt(strYd);
                        String strQd = Xg.qd("\u001f\"", (short) (C1499aX.Xd() ^ ((623779519 ^ 409108435) ^ (-1028410141))), (short) (C1499aX.Xd() ^ (1620146178 ^ (-1620138519))));
                        String strWd = null;
                        if (i10 != 0) {
                            i2 = 1777744969 ^ 1777744973;
                            str2 = strYd;
                            baseSuccessEvent = null;
                        } else {
                            baseSuccessEvent = (BaseSuccessEvent) httpRequestManagerImp.successClass.newInstance();
                            i2 = 13;
                            str2 = strQd;
                        }
                        int i11 = 0;
                        if (i2 != 0) {
                            str3 = HttpRequestManagerImp.TAG;
                            strWd = Jg.Wd("J\u0004Ae\u0011*\\\n!TCd/)GC$5b\"+g\u0018sPwmH*\u0007\u00127\rx`Me6r\u0012i\u0011\nAUn+\u00110", (short) (C1607wl.Xd() ^ (630956355 ^ 630949435)), (short) (C1607wl.Xd() ^ ((207530023 ^ 36745527) ^ 242122547)));
                            str2 = strYd;
                            i3 = 0;
                        } else {
                            i3 = i2 + 13;
                            str3 = null;
                            baseSuccessEvent = null;
                        }
                        int i12 = 1;
                        int i13 = (2098273617 ^ 1153455295) ^ 970017249;
                        if (Integer.parseInt(str2) != 0) {
                            i4 = i3 + i13;
                            i5 = 1;
                        } else {
                            i4 = i3 + 5;
                            i5 = 165;
                            str2 = strQd;
                        }
                        if (i4 != 0) {
                            i12 = 8;
                            str2 = strYd;
                            i6 = 0;
                        } else {
                            i6 = i4 + 7;
                        }
                        if (Integer.parseInt(str2) != 0) {
                            i7 = i6 + 10;
                            strQd = str2;
                            i8 = 0;
                        } else {
                            i5 += i12;
                            i7 = i6 + 14;
                            i8 = i13;
                        }
                        if (i7 != 0) {
                            strWd = a.startsWith(strWd, i5 / (i8 + i8));
                        } else {
                            i11 = i7 + 7;
                            strYd = strQd;
                        }
                        if (Integer.parseInt(strYd) != 0) {
                            i9 = i11 + i13;
                        } else {
                            VsshLogger.logDebug(str3, strWd);
                            baseSuccessEvent.setResponse(str);
                            i9 = i11 + 3;
                        }
                        if (i9 != 0) {
                            baseSuccessEvent.setHttpStatusCode(HttpRequestManagerImp.this.httpStatusCode);
                        }
                        if (HttpRequestManagerImp.this.responseHeaders != null) {
                            baseSuccessEvent.setHeader(HttpRequestManagerImp.this.responseHeaders);
                        }
                        HttpRequestManagerImp.this.eventBus.post(baseSuccessEvent);
                    } catch (Exception e2) {
                        VsshLogger.logDebug(HttpRequestManagerImp.TAG, e2.getMessage(), e2);
                    }
                }
            };
            this.errorListener = new Response.ErrorListener() { // from class: com.valid.communication.managers.httprequestmanager.HttpRequestManagerImp.3
                @Override // com.android.volley.Response.ErrorListener
                public void onErrorResponse(VolleyError volleyError) {
                    int i2;
                    int i3;
                    int i4;
                    String str;
                    int i5;
                    int i6;
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    int i11;
                    int i12;
                    int i13;
                    int i14;
                    int i15;
                    String str2;
                    HttpRequestManagerImp httpRequestManagerImp;
                    int i16;
                    AnonymousClass3 anonymousClass3;
                    ErrorData errorData;
                    String string;
                    String strOd;
                    String str3;
                    int i17;
                    int i18;
                    int i19;
                    int i20;
                    int i21;
                    String str4;
                    int i22;
                    int i23;
                    int i24;
                    int i25;
                    int i26;
                    ErrorData errorData2;
                    String strXd = ZO.xd("\u0013", (short) (OY.Xd() ^ (OY.Xd() ^ (2068894945 ^ 2138825364))), (short) (OY.Xd() ^ ((1105868437 ^ 435000459) ^ 1476899685)));
                    try {
                        String str5 = HttpRequestManagerImp.TAG;
                        String strUd = C1626yg.Ud("\u001b\u0015jI9\u001b\u0015\f\u0014!FL\u0017", (short) (Od.Xd() ^ (1519728687 ^ (-1519728695))), (short) (Od.Xd() ^ ((1423045783 ^ 1740737122) ^ (-856705497))));
                        int i27 = Integer.parseInt(strXd);
                        int i28 = 8;
                        int i29 = 1491275476 ^ 1491275475;
                        String strWd = Ig.wd("\u0001", (short) (ZN.Xd() ^ ((1556225454 ^ 1636749932) ^ 1028431455)));
                        int i30 = 0;
                        if (i27 != 0) {
                            str = strXd;
                            i2 = 8;
                            i3 = 0;
                            i4 = 0;
                        } else {
                            i2 = 15;
                            i3 = i29;
                            i4 = i3;
                            str = strWd;
                        }
                        int i31 = 1;
                        if (i2 != 0) {
                            i6 = i3 + i3;
                            str = strXd;
                            i5 = 0;
                        } else {
                            i5 = i2 + 15;
                            i4 = 0;
                            i6 = 1;
                        }
                        int i32 = 1030505164 ^ 1030505161;
                        if (Integer.parseInt(str) != 0) {
                            i7 = i5 + i32;
                        } else {
                            i6 += i4 << 2;
                            i7 = i5 + 10;
                            str = strWd;
                        }
                        if (i7 != 0) {
                            str = strXd;
                            i9 = 4;
                            i10 = 4;
                            i8 = 0;
                        } else {
                            i8 = i7 + 12;
                            i9 = 1;
                            i10 = 1;
                        }
                        int i33 = 6;
                        if (Integer.parseInt(str) != 0) {
                            i11 = i8 + 9;
                        } else {
                            i6 += i10 + i9 + i9;
                            i11 = i8 + 6;
                            str = strWd;
                        }
                        if (i11 != 0) {
                            i13 = 24;
                            str = strXd;
                            i12 = 0;
                        } else {
                            i12 = i11 + 6;
                            i13 = 1;
                        }
                        if (Integer.parseInt(str) != 0) {
                            i14 = i12 + 14;
                        } else {
                            VsshLogger.logDebug(str5, a.startsWith(strUd, i6 / i13));
                            i14 = i12 + 2;
                            str = strWd;
                        }
                        String strQd = null;
                        if (i14 != 0) {
                            str2 = HttpRequestManagerImp.TAG;
                            httpRequestManagerImp = HttpRequestManagerImp.this;
                            str = strXd;
                            i15 = 0;
                        } else {
                            i15 = i14 + i29;
                            str2 = null;
                            httpRequestManagerImp = null;
                        }
                        if (Integer.parseInt(str) != 0) {
                            i16 = i15 + i29;
                            anonymousClass3 = null;
                        } else {
                            VsshLogger.logDebug(str2, httpRequestManagerImp.baseUrl);
                            i16 = i15 + 12;
                            anonymousClass3 = this;
                        }
                        BaseErrorEvent baseErrorEvent = (BaseErrorEvent) (i16 != 0 ? HttpRequestManagerImp.this.errorClass.newInstance() : null);
                        int i34 = 3;
                        if (volleyError.networkResponse != null) {
                            baseErrorEvent.setHttpStatusCode(volleyError.networkResponse.statusCode);
                            byte[] bArr = volleyError.networkResponse.data;
                            if (bArr != null) {
                                short sXd = (short) (ZN.Xd() ^ (1778620499 ^ 1778631412));
                                short sXd2 = (short) (ZN.Xd() ^ ((263481416 ^ 1725246380) ^ 1767992641));
                                int[] iArr = new int["\u001948\u0002>".length()];
                                QB qb = new QB("\u001948\u0002>");
                                int i35 = 0;
                                while (qb.YK()) {
                                    int iKK = qb.KK();
                                    Xu xuXd = Xu.Xd(iKK);
                                    iArr[i35] = xuXd.fK((xuXd.CK(iKK) - (sXd + i35)) - sXd2);
                                    i35++;
                                }
                                baseErrorEvent.setBodyAsString(new String(bArr, Charset.forName(a.startsWith(new String(iArr, 0, i35), 3))));
                            }
                            HttpRequestManagerImp.this.errorData.setErrorType(volleyError.networkResponse.statusCode);
                        } else if (volleyError.getClass().equals(TimeoutError.class)) {
                            HttpRequestManagerImp.this.errorData.setErrorType((1497816068 ^ 2107616880) ^ (-618230152));
                        } else {
                            int i36 = 1161779603 ^ (-1161780829);
                            if (volleyError.getMessage() == null) {
                                errorData2 = HttpRequestManagerImp.this.errorData;
                            } else {
                                String message = volleyError.getMessage();
                                if (Integer.parseInt(strXd) != 0) {
                                    str3 = strXd;
                                    strOd = null;
                                    i17 = 0;
                                } else {
                                    strOd = EO.Od("#xpM\u001cWit\u0007\u0017\u0011J\u001bW<\u001bdFW ", (short) (FB.Xd() ^ ((1669434432 ^ 1746628470) ^ 194676963)));
                                    str3 = strWd;
                                    i28 = 9;
                                    i17 = 6;
                                }
                                if (i28 != 0) {
                                    i19 = i17 + i17 + i17;
                                    str3 = strXd;
                                    i18 = 0;
                                } else {
                                    i18 = i28 + 10;
                                    i19 = 1;
                                }
                                if (Integer.parseInt(str3) != 0) {
                                    i20 = i18 + 4;
                                    i21 = 1;
                                } else {
                                    i20 = i18 + 14;
                                    i21 = 6;
                                }
                                if (i20 != 0) {
                                    i19 += i21;
                                } else {
                                    i33 = 0;
                                }
                                if (message.contains(a.startsWith(strOd, i19 / (i33 + i33)))) {
                                    HttpRequestManagerImp.this.errorData.setErrorType(1495162470 ^ (-1495162263));
                                } else {
                                    String message2 = volleyError.getMessage();
                                    if (Integer.parseInt(strXd) != 0) {
                                        i22 = 0;
                                        i32 = 10;
                                        str4 = strXd;
                                    } else {
                                        strQd = C1561oA.Qd("~\u0011 \feUN/\n\u0015\u0005\u0002\u0016[GT", (short) (OY.Xd() ^ ((1020363793 ^ 1062213597) ^ 58828078)));
                                        str4 = strWd;
                                        i22 = 13;
                                    }
                                    if (i32 != 0) {
                                        i24 = i22 + i22;
                                        str4 = strXd;
                                        i23 = 0;
                                    } else {
                                        i23 = i32 + 6;
                                        i22 = 0;
                                        i24 = 1;
                                    }
                                    if (Integer.parseInt(str4) != 0) {
                                        i26 = i23 + 14;
                                        i25 = 1;
                                        strWd = str4;
                                    } else {
                                        i25 = i22 << 2;
                                        i26 = i23 + 4;
                                    }
                                    if (i26 != 0) {
                                        i24 += i25;
                                        strWd = strXd;
                                        i31 = 3;
                                    } else {
                                        i34 = i25;
                                    }
                                    if (Integer.parseInt(strWd) == 0) {
                                        i24 += i34 + i31;
                                        i30 = 13;
                                    }
                                    if (message2.contains(a.startsWith(strQd, i24 / (i30 + i30)))) {
                                        HttpRequestManagerImp.this.errorData.setErrorType(149626632 ^ (-149626084));
                                    } else {
                                        errorData2 = HttpRequestManagerImp.this.errorData;
                                    }
                                }
                            }
                            errorData2.setErrorType(i36);
                        }
                        if (volleyError.getMessage() == null || volleyError.getMessage().isEmpty()) {
                            errorData = HttpRequestManagerImp.this.errorData;
                            string = volleyError.toString();
                        } else {
                            errorData = HttpRequestManagerImp.this.errorData;
                            string = volleyError.getMessage();
                        }
                        errorData.setMessage(string);
                        String str6 = HttpRequestManagerImp.TAG;
                        String string2 = volleyError.toString();
                        if (Integer.parseInt(strXd) == 0) {
                            VsshLogger.logDebug(str6, string2);
                            baseErrorEvent.setErrorData(HttpRequestManagerImp.this.errorData);
                        }
                        HttpRequestManagerImp.this.eventBus.post(baseErrorEvent);
                    } catch (Exception e2) {
                        VsshLogger.logDebug(HttpRequestManagerImp.TAG, e2.getMessage(), e2);
                    }
                }
            };
        } catch (IOException unused) {
        }
    }

    private final void validateHeaders(Map<String, String> map, Map<String, Object> map2) {
        if (map != null) {
            if (map.get(e.concat(C1633zX.Xd() ^ (-1951491122), hg.Vd("b\u0017\n\b\u0019\u0002FARGNDw", (short) (C1607wl.Xd() ^ (Od.Xd() ^ (1406513451 ^ 338169373))), (short) (C1607wl.Xd() ^ ((407165314 ^ 1664571016) ^ 2071186009))))) != null) {
                this.sBody = String.valueOf(map2.get(a.startsWith(C1561oA.ud("C838", (short) (C1633zX.Xd() ^ (759783291 ^ (-759780180)))), 1)));
                return;
            }
        }
        try {
            this.body = new JSONObject(new Gson().toJson(map2));
        } catch (JSONException e2) {
            String str = TAG;
            if (Integer.parseInt(C1561oA.yd("K", (short) (C1633zX.Xd() ^ ((1275320451 ^ 1744829719) ^ (-737943929))))) == 0) {
                VsshLogger.logError(str, e2.getMessage(), e2);
            }
            this.body = new JSONObject();
        }
    }

    @Override // com.valid.communication.managers.httprequestmanager.HttpRequestManager
    public void cancelRequests() {
        try {
            VolleyManager.getInstance(this.mContext).getRequestQueue().cancelAll("");
        } catch (IOException unused) {
        }
    }

    @Override // com.valid.communication.managers.httprequestmanager.HttpRequestManager
    public void consumeWebService(int i2, String str, Map<String, String> map, Map<String, Object> map2) {
        int i3;
        int i4;
        int i5;
        String str2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String strConcat;
        int i11;
        int i12;
        HttpRequestManagerImp<Success, Error> httpRequestManagerImp;
        StringRequest stringRequest;
        int i13;
        int i14;
        String str3;
        String strStartsWith;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        String strCreateGetUrl;
        String string = str;
        String str4 = this.baseUrl;
        if (str4 != null) {
            string = ConvertDataHelper.concatenateWithSlash(str4, string);
        }
        this.mHeaders = new HashMap();
        if (map != null) {
            this.mHeaders = map;
        }
        HttpRequestManagerImp<Success, Error> httpRequestManagerImp2 = null;
        short sXd = (short) (C1607wl.Xd() ^ (1684167300 ^ 1684156739));
        int[] iArr = new int["]".length()];
        QB qb = new QB("]");
        int i23 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i23] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i23));
            i23++;
        }
        String str5 = new String(iArr, 0, i23);
        if (map2 != null && !map2.isEmpty()) {
            if (i2 == 0) {
                StringBuilder sb = new StringBuilder();
                if (Integer.parseInt(str5) != 0) {
                    strCreateGetUrl = null;
                } else {
                    sb = sb.append(string);
                    strCreateGetUrl = createGetUrl(map2);
                }
                string = sb.append(strCreateGetUrl).toString();
            } else {
                validateHeaders(map, map2);
            }
        }
        int i24 = Integer.parseInt(str5);
        int i25 = 1720848387 ^ 1720848391;
        String strQd = Xg.qd("MU", (short) (FB.Xd() ^ (744602631 ^ 744589355)), (short) (FB.Xd() ^ (C1607wl.Xd() ^ (573377621 ^ 1281973857))));
        int iXd = 1;
        if (i24 != 0) {
            str2 = str5;
            i4 = 14;
            i3 = 1;
            i5 = 1;
        } else {
            i3 = 308;
            i4 = i25;
            i5 = i4;
            str2 = strQd;
        }
        int i26 = 0;
        if (i4 != 0) {
            i5 += i5 + i5;
            str2 = str5;
            i6 = 0;
        } else {
            i6 = i4 + 9;
        }
        if (Integer.parseInt(str2) != 0) {
            i7 = i6 + 15;
            i8 = 0;
        } else {
            i3 += i5;
            i7 = i6 + i25;
            i8 = 22;
            str2 = strQd;
        }
        if (i7 != 0) {
            i10 = i8 + i8 + i8;
            str2 = str5;
            i9 = 0;
        } else {
            i9 = i7 + 11;
            i10 = 1;
        }
        if (Integer.parseInt(str2) != 0) {
            i11 = i9 + 12;
            strConcat = null;
        } else {
            strConcat = e.concat(i3 / i10, Jg.Wd("UiLoNg\u0015\u001b\u001ei\u0014|F\"", (short) (C1499aX.Xd() ^ (Od.Xd() ^ (234420096 ^ (-1241842725)))), (short) (C1499aX.Xd() ^ (411531243 ^ (-411522667)))));
            i11 = i9 + 7;
            str2 = strQd;
        }
        if (i11 != 0) {
            VsshLogger.logDebug(strConcat, string);
            httpRequestManagerImp = this;
            str2 = str5;
            i12 = 0;
        } else {
            i12 = i11 + 9;
            httpRequestManagerImp = null;
        }
        if (Integer.parseInt(str2) != 0) {
            i13 = i12 + 8;
            stringRequest = null;
        } else {
            stringRequest = new StringRequest(i2, string, this.stringResponseListener, this.errorListener) { // from class: com.valid.communication.managers.httprequestmanager.HttpRequestManagerImp.1
                @Override // com.android.volley.Request
                public byte[] getBody() {
                    int i27;
                    int i28;
                    String str6;
                    int i29;
                    int i30;
                    int i31;
                    int i32;
                    int i33;
                    int i34;
                    int i35;
                    AnonymousClass1 anonymousClass1;
                    String str7;
                    int i36;
                    int i37;
                    String str8;
                    int i38;
                    int i39;
                    int i40;
                    int i41;
                    int i42;
                    String string2;
                    char c2;
                    AnonymousClass1 anonymousClass12;
                    JSONObject jSONObject = HttpRequestManagerImp.this.body;
                    String strXd = null;
                    String strOd = C1561oA.od("\u0013", (short) (ZN.Xd() ^ (FB.Xd() ^ (351059698 ^ 1258531829))));
                    if (jSONObject != null) {
                        HttpRequestManagerImp httpRequestManagerImp3 = HttpRequestManagerImp.this;
                        if (Integer.parseInt(strOd) != 0) {
                            c2 = '\n';
                            string2 = null;
                        } else {
                            string2 = httpRequestManagerImp3.body.toString();
                            c2 = '\b';
                        }
                        if (c2 != 0) {
                            HttpRequestManagerImp.access$402(httpRequestManagerImp3, string2);
                            anonymousClass12 = this;
                        } else {
                            anonymousClass12 = null;
                        }
                        HttpRequestManagerImp.access$302(HttpRequestManagerImp.this, null);
                    }
                    String str9 = HttpRequestManagerImp.TAG;
                    int i43 = Integer.parseInt(strOd);
                    int i44 = 1406244293 ^ 1406244299;
                    String strKd = C1561oA.Kd("Za", (short) (C1633zX.Xd() ^ (FB.Xd() ^ (-1609511004))));
                    if (i43 != 0) {
                        i28 = 8;
                        str6 = strOd;
                        i27 = 1;
                    } else {
                        i27 = 182;
                        i28 = i44;
                        str6 = strKd;
                    }
                    int i45 = 0;
                    if (i28 != 0) {
                        i31 = 4;
                        str6 = strOd;
                        i30 = 4;
                        i29 = 0;
                    } else {
                        i29 = i28 + 10;
                        i30 = 1;
                        i31 = 1;
                    }
                    if (Integer.parseInt(str6) != 0) {
                        i32 = i29 + 5;
                    } else {
                        i27 += i30 + i31 + i31;
                        i32 = i29 + 2;
                        str6 = strKd;
                    }
                    if (i32 != 0) {
                        i34 = 52;
                        str6 = strOd;
                        i33 = 0;
                    } else {
                        i33 = i32 + 5;
                        i34 = 1;
                    }
                    int i46 = Integer.parseInt(str6);
                    String strZd = Wg.Zd("9jH}\u0013e", (short) (C1580rY.Xd() ^ ((206137287 ^ 1540342586) ^ (-1468455622))), (short) (C1580rY.Xd() ^ (Od.Xd() ^ (-1207798042))));
                    if (i46 != 0) {
                        i35 = i33 + i44;
                        anonymousClass1 = null;
                    } else {
                        strZd = a.startsWith(strZd, i27 / i34);
                        i35 = i33 + 9;
                        anonymousClass1 = this;
                    }
                    if (i35 != 0) {
                        strZd = strZd.concat(HttpRequestManagerImp.this.sBody);
                    }
                    VsshLogger.logDebug(str9, strZd);
                    if (HttpRequestManagerImp.this.sBody == null) {
                        return null;
                    }
                    HttpRequestManagerImp httpRequestManagerImp4 = HttpRequestManagerImp.this;
                    if (Integer.parseInt(strOd) != 0) {
                        i36 = 10;
                        str7 = null;
                        str8 = strOd;
                        i37 = 0;
                    } else {
                        str7 = httpRequestManagerImp4.sBody;
                        strXd = C1561oA.Xd("\u0010!-t3", (short) (C1607wl.Xd() ^ (FB.Xd() ^ 1609524274)));
                        i36 = (453834139 ^ 1901896790) ^ 1783648714;
                        i37 = 17;
                        str8 = strKd;
                    }
                    if (i36 != 0) {
                        i39 = (139358700 ^ 1557706968) ^ 1419168055;
                        i40 = i37 << i39;
                        str8 = strOd;
                        i38 = 0;
                    } else {
                        i38 = i36 + 9;
                        i39 = 1;
                        i40 = 1;
                    }
                    if (Integer.parseInt(str8) != 0) {
                        i42 = i38 + 10;
                        i41 = 1;
                        strKd = str8;
                    } else {
                        i41 = i39 + i39;
                        i42 = i38 + 8;
                    }
                    if (i42 != 0) {
                        i40 += i39 + i41;
                        i45 = 17;
                    } else {
                        strOd = strKd;
                    }
                    return str7.getBytes(Charset.forName(a.startsWith(strXd, i40 / (i45 + (Integer.parseInt(strOd) == 0 ? i45 + i45 : 1)))));
                }

                @Override // com.android.volley.Request
                public String getBodyContentType() {
                    int iXd2;
                    int iXd3;
                    String strKd;
                    int i27;
                    int i28;
                    int i29;
                    short sXd2 = (short) (ZN.Xd() ^ (C1580rY.Xd() ^ (-831064928)));
                    int[] iArr2 = new int[Global.SEMICOLON.length()];
                    QB qb2 = new QB(Global.SEMICOLON);
                    int i30 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i30] = xuXd2.fK((sXd2 ^ i30) + xuXd2.CK(iKK2));
                        i30++;
                    }
                    String str6 = new String(iArr2, 0, i30);
                    int i31 = 5;
                    if (Integer.parseInt(str6) != 0) {
                        strKd = str6;
                        iXd3 = 5;
                        iXd2 = 1;
                    } else {
                        iXd2 = ZN.Xd() ^ (269201278 ^ 595694002);
                        iXd3 = FB.Xd() ^ (1149456276 ^ 460071077);
                        strKd = Qg.kd("tt", (short) (ZN.Xd() ^ ((851024706 ^ 1563214027) ^ 1872047502)), (short) (ZN.Xd() ^ (156121168 ^ 156139384)));
                    }
                    if (iXd3 != 0) {
                        i28 = (514023117 ^ 1975937565) ^ 1801794774;
                        i27 = 0;
                    } else {
                        i27 = iXd3 + 10;
                        i28 = 1;
                        str6 = strKd;
                    }
                    if (Integer.parseInt(str6) != 0) {
                        i29 = i27 + 10;
                        i31 = 1;
                    } else {
                        iXd2 += i28;
                        i29 = i27 + 13;
                        i28 = 5;
                    }
                    if (i29 != 0) {
                        i28 = i28 + i31 + i31;
                    }
                    int i32 = iXd2 / i28;
                    short sXd3 = (short) (Od.Xd() ^ (1828952711 ^ (-1828947387)));
                    short sXd4 = (short) (Od.Xd() ^ (1051397309 ^ (-1051395389)));
                    int[] iArr3 = new int["o\u000btro\u0002+*7-Bunaqd%:%670\u001d[t\u001fgjb_d".length()];
                    QB qb3 = new QB("o\u000btro\u0002+*7-Bunaqd%:%670\u001d[t\u001fgjb_d");
                    int i33 = 0;
                    while (qb3.YK()) {
                        int iKK3 = qb3.KK();
                        Xu xuXd3 = Xu.Xd(iKK3);
                        iArr3[i33] = xuXd3.fK(sXd3 + i33 + xuXd3.CK(iKK3) + sXd4);
                        i33++;
                    }
                    return e.concat(i32, new String(iArr3, 0, i33));
                }

                @Override // com.android.volley.Request
                public Map<String, String> getHeaders() {
                    try {
                        return HttpRequestManagerImp.this.mHeaders;
                    } catch (IOException unused) {
                        return null;
                    }
                }

                @Override // com.android.volley.toolbox.StringRequest, com.android.volley.Request
                public Response<String> parseNetworkResponse(NetworkResponse networkResponse) {
                    JSONObject jSONObject;
                    String strYd;
                    int i27;
                    AnonymousClass1 anonymousClass1;
                    HttpRequestManagerImp httpRequestManagerImp3;
                    int i28;
                    String strUd = C1561oA.ud("\"", (short) (C1499aX.Xd() ^ (1559721011 ^ (-1559722650))));
                    try {
                        HttpRequestManagerImp httpRequestManagerImp4 = HttpRequestManagerImp.this;
                        if (Integer.parseInt(strUd) != 0) {
                            i27 = 1349741262 ^ 1349741259;
                            strYd = strUd;
                            jSONObject = null;
                        } else {
                            jSONObject = new JSONObject(networkResponse.headers);
                            strYd = C1561oA.yd("\\", (short) (FB.Xd() ^ ((801494628 ^ 520057545) ^ 825928907)));
                            i27 = 8;
                        }
                        if (i27 != 0) {
                            HttpRequestManagerImp.access$102(httpRequestManagerImp4, jSONObject);
                            anonymousClass1 = this;
                        } else {
                            anonymousClass1 = null;
                            strUd = strYd;
                        }
                        if (Integer.parseInt(strUd) != 0) {
                            i28 = 1;
                            httpRequestManagerImp3 = null;
                        } else {
                            httpRequestManagerImp3 = HttpRequestManagerImp.this;
                            i28 = networkResponse.statusCode;
                        }
                        HttpRequestManagerImp.access$202(httpRequestManagerImp3, i28);
                        return super.parseNetworkResponse(networkResponse);
                    } catch (IOException unused) {
                        return null;
                    }
                }
            };
            i13 = i12 + 8;
            str2 = strQd;
        }
        if (i13 != 0) {
            httpRequestManagerImp.stringRequest = stringRequest;
            str3 = TAG;
            strStartsWith = ZO.xd("tW0+}\u0004\u001f&\t0\u001a\u0004\u007f>2\u00077@jE", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (1579985274 ^ 498593859))), (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134240098)));
            str2 = str5;
            i14 = 0;
        } else {
            i14 = i13 + 14;
            str3 = null;
            strStartsWith = null;
        }
        int i27 = Integer.parseInt(str2);
        int iXd2 = C1580rY.Xd() ^ (790246476 ^ (-512958553));
        if (i27 != 0) {
            i15 = i14 + 14;
            i16 = 0;
            i17 = 0;
        } else {
            i15 = i14 + 13;
            i16 = iXd2;
            i17 = i16;
            str2 = strQd;
        }
        if (i15 != 0) {
            i20 = i17 + i16 + i16;
            i19 = 3;
            str2 = str5;
            i18 = 0;
        } else {
            i18 = i15 + i25;
            i19 = 1;
            i20 = 1;
        }
        if (Integer.parseInt(str2) != 0) {
            i21 = i18 + 8;
            strQd = str2;
        } else {
            i20 += i19 + i19;
            i21 = i18 + 15;
        }
        if (i21 != 0) {
            iXd = ZN.Xd() ^ 864698084;
        } else {
            i26 = i21 + 6;
            str5 = strQd;
        }
        if (Integer.parseInt(str5) != 0) {
            i22 = i26 + 12;
        } else {
            strStartsWith = a.startsWith(strStartsWith, i20 / iXd);
            i22 = i26 + iXd2;
            httpRequestManagerImp2 = this;
        }
        if (i22 != 0) {
            strStartsWith = strStartsWith.concat(httpRequestManagerImp2.stringRequest.toString());
        }
        VsshLogger.logDebug(str3, strStartsWith);
        execute();
    }

    @Override // com.valid.communication.managers.httprequestmanager.HttpRequestManager
    public void execute() {
        int i2;
        int iXd;
        String strWd;
        int i3;
        int i4;
        int i5;
        String str = TAG;
        String strUd = C1626yg.Ud("\u0002", (short) (C1499aX.Xd() ^ (OY.Xd() ^ (1685431431 ^ (-1616834653)))), (short) (C1499aX.Xd() ^ (OY.Xd() ^ (1141478072 ^ (-1076002878)))));
        int iXd2 = 1;
        if (Integer.parseInt(strUd) != 0) {
            iXd = C1499aX.Xd() ^ (-1134257946);
            strWd = strUd;
            i2 = 1;
        } else {
            i2 = 88;
            iXd = 11;
            strWd = Ig.wd("v3", (short) (Od.Xd() ^ (FB.Xd() ^ (136046170 ^ (-1475668727)))));
        }
        if (iXd != 0) {
            i4 = 1481719930 ^ 1481719922;
            i3 = 0;
        } else {
            i3 = iXd + 5;
            i4 = 1;
            strUd = strWd;
        }
        if (Integer.parseInt(strUd) != 0) {
            i5 = i3 + 7;
        } else {
            i2 += i4;
            i5 = i3 + 15;
            i4 = (974590196 ^ 1062688999) ^ 88098839;
            iXd2 = Od.Xd() ^ 1207800919;
        }
        String strOd = EO.Od("0~\u0003\u001b;\\F@\u001fO(\u000fl \u0007a", (short) (C1607wl.Xd() ^ (447700950 ^ 447699095)));
        if (i5 != 0) {
            strOd = a.startsWith(strOd, i2 / (i4 << iXd2));
        }
        VsshLogger.logDebug(str, strOd);
        addToRequestQueue(getStringRequest());
    }

    @Override // com.valid.communication.managers.httprequestmanager.HttpRequestManager
    public void publishEvent(BaseSuccessEvent baseSuccessEvent, BaseErrorEvent baseErrorEvent) {
        try {
            CommunicationManagerCallback communicationManagerCallback = this.mCallback;
            if (communicationManagerCallback != null) {
                if (baseErrorEvent == null) {
                    communicationManagerCallback.successEvent(baseSuccessEvent);
                } else {
                    communicationManagerCallback.errorEvent(baseErrorEvent);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.valid.communication.managers.httprequestmanager.HttpRequestManager
    public void setBaseURL(String str) {
        try {
            this.baseUrl = str;
        } catch (IOException unused) {
        }
    }

    @Override // com.valid.communication.managers.httprequestmanager.HttpRequestManager
    public void setCallback(CommunicationManagerCallback communicationManagerCallback) {
        try {
            this.mCallback = communicationManagerCallback;
        } catch (IOException unused) {
        }
    }

    @Override // com.valid.communication.managers.httprequestmanager.HttpRequestManager
    public void setContext(Context context) {
        try {
            this.mContext = context;
        } catch (IOException unused) {
        }
    }

    @Override // com.valid.communication.managers.httprequestmanager.HttpRequestManager
    public void setTimeOut(int i2) {
        try {
            TimeoutManager.getInstance().setTimeout(i2);
        } catch (IOException unused) {
        }
    }
}
