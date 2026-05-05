package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.json.JSONObject;
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
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public final class AFc1uSDK {
    public AFe1pSDK AFAdRevenueData;
    private byte[] component4;
    String getCurrencyIso4217Code;
    public String getMediationNetwork;
    public Map<String, String> getMonetizationNetwork;
    public String getRevenue;

    public AFc1uSDK(String str, byte[] bArr, String str2, AFe1pSDK aFe1pSDK, Map<String, String> map) {
        this.getRevenue = str;
        this.component4 = bArr;
        this.getCurrencyIso4217Code = str2;
        this.AFAdRevenueData = aFe1pSDK;
        this.getMonetizationNetwork = map;
    }

    public AFc1uSDK(char[] cArr) {
        LinkedHashMap linkedHashMapEmptyMap;
        String string;
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine()) {
            try {
                String strNextLine = scanner.nextLine();
                if (strNextLine.startsWith(Wg.vd("\u0019\u0017\u000e_", (short) (C1633zX.Xd() ^ (-5826))))) {
                    this.getRevenue = strNextLine.substring(4).trim();
                } else if (strNextLine.startsWith(Qg.kd("\u007fmyynsq?", (short) (Od.Xd() ^ (-10075)), (short) (Od.Xd() ^ (-3440))))) {
                    this.getCurrencyIso4217Code = strNextLine.substring(8).trim();
                } else if (strNextLine.startsWith(hg.Vd("HD?AAMM\u0016", (short) (C1499aX.Xd() ^ (-8081)), (short) (C1499aX.Xd() ^ (-16103))))) {
                    try {
                        String strTrim = strNextLine.substring(8).trim();
                        short sXd = (short) (C1499aX.Xd() ^ (-13297));
                        int[] iArr = new int["S_Ta]VP\u0019_]QS\u0014'EVG\u0017\u0014".length()];
                        QB qb = new QB("S_Ta]VP\u0019_]QS\u0014'EVG\u0017\u0014");
                        int i2 = 0;
                        while (qb.YK()) {
                            int iKK = qb.KK();
                            Xu xuXd = Xu.Xd(iKK);
                            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                            i2++;
                        }
                        Class<?> cls = Class.forName(new String(iArr, 0, i2));
                        Class<?>[] clsArr = new Class[2];
                        clsArr[0] = Class.forName(C1561oA.yd("\t\u0001\u0013~H\by\b}Eg\n\u0005|~x", (short) (FB.Xd() ^ 18685)));
                        clsArr[1] = Integer.TYPE;
                        Object[] objArr = {strTrim, 2};
                        Method declaredMethod = cls.getDeclaredMethod(C1561oA.Yd("prq~tv", (short) (C1633zX.Xd() ^ (-3484))), clsArr);
                        try {
                            declaredMethod.setAccessible(true);
                            JSONObject jSONObject = new JSONObject(new String((byte[]) declaredMethod.invoke(null, objArr), Charset.defaultCharset()));
                            Intrinsics.checkNotNullParameter(jSONObject, "");
                            if (jSONObject.length() == 0) {
                                linkedHashMapEmptyMap = MapsKt.emptyMap();
                            } else {
                                Iterator<String> itKeys = jSONObject.keys();
                                Intrinsics.checkNotNullExpressionValue(itKeys, "");
                                Sequence sequenceAsSequence = SequencesKt.asSequence(itKeys);
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (Object obj : sequenceAsSequence) {
                                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                                    Object obj2 = jSONObject.get((String) obj);
                                    if (Intrinsics.areEqual(obj2, JSONObject.NULL)) {
                                        short sXd2 = (short) (C1580rY.Xd() ^ (-8442));
                                        short sXd3 = (short) (C1580rY.Xd() ^ (-24883));
                                        int[] iArr2 = new int["(0()".length()];
                                        QB qb2 = new QB("(0()");
                                        int i3 = 0;
                                        while (qb2.YK()) {
                                            int iKK2 = qb2.KK();
                                            Xu xuXd2 = Xu.Xd(iKK2);
                                            iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                                            i3++;
                                        }
                                        string = new String(iArr2, 0, i3);
                                    } else {
                                        string = obj2.toString();
                                    }
                                    linkedHashMap2.put(obj, string);
                                }
                                linkedHashMapEmptyMap = linkedHashMap;
                            }
                            this.getMonetizationNetwork = linkedHashMapEmptyMap;
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    } catch (Exception e3) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK = AFg1cSDK.CACHE;
                        short sXd4 = (short) (Od.Xd() ^ (-12231));
                        short sXd5 = (short) (Od.Xd() ^ (-31139));
                        int[] iArr3 = new int[";\u00051JW!\u001e+Jg\n).\u0003w\u0013\u001d<g\u0011\u001e".length()];
                        QB qb3 = new QB(";\u00051JW!\u001e+Jg\n).\u0003w\u0013\u001d<g\u0011\u001e");
                        int i4 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((i4 * sXd5) ^ sXd4));
                            i4++;
                        }
                        aFLogger.e(aFg1cSDK, new String(iArr3, 0, i4), e3);
                        this.getMonetizationNetwork = new HashMap();
                    }
                } else if (strNextLine.startsWith(ZO.xd("b\u001eb\u0004]", (short) (OY.Xd() ^ 29803), (short) (OY.Xd() ^ 5669)))) {
                    String strTrim2 = strNextLine.substring(5).trim();
                    Class<?> cls2 = Class.forName(C1626yg.Ud(">*,W7i>jzQ\u0006.}\u001b/i>_`", (short) (FB.Xd() ^ 2226), (short) (FB.Xd() ^ 16558)));
                    Class<?>[] clsArr2 = new Class[2];
                    clsArr2[0] = Class.forName(Ig.wd("#IP\u001c0IZ\u007fE\f7v\"#<R", (short) (C1607wl.Xd() ^ 27757)));
                    clsArr2[1] = Integer.TYPE;
                    Object[] objArr2 = {strTrim2, 2};
                    Method declaredMethod2 = cls2.getDeclaredMethod(EO.Od("\u0011\\h\u0019u3", (short) (C1580rY.Xd() ^ (-11367))), clsArr2);
                    try {
                        declaredMethod2.setAccessible(true);
                        this.component4 = (byte[]) declaredMethod2.invoke(null, objArr2);
                    } catch (InvocationTargetException e4) {
                        throw e4.getCause();
                    }
                } else if (strNextLine.startsWith(C1561oA.Qd("\u0014\u0018\u000e\u0002X", (short) (C1499aX.Xd() ^ (-15738))))) {
                    String strTrim3 = strNextLine.substring(5).trim();
                    try {
                        this.AFAdRevenueData = AFe1pSDK.valueOf(strTrim3);
                    } catch (Exception e5) {
                        AFLogger.INSTANCE.e(AFg1cSDK.CACHE, C1593ug.zd("\u00182046?7i?-@9nDJB8\u000et", (short) (C1633zX.Xd() ^ (-15278)), (short) (C1633zX.Xd() ^ (-6751))).concat(String.valueOf(strTrim3)), e5);
                    }
                }
            } catch (Throwable th) {
                try {
                    scanner.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        scanner.close();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AFc1uSDK aFc1uSDK = (AFc1uSDK) obj;
            if (Objects.equals(this.getCurrencyIso4217Code, aFc1uSDK.getCurrencyIso4217Code) && Arrays.equals(this.component4, aFc1uSDK.component4) && Objects.equals(this.getRevenue, aFc1uSDK.getRevenue) && Objects.equals(this.getMediationNetwork, aFc1uSDK.getMediationNetwork) && Objects.equals(this.getMonetizationNetwork, aFc1uSDK.getMonetizationNetwork) && this.AFAdRevenueData == aFc1uSDK.AFAdRevenueData) {
                return true;
            }
        }
        return false;
    }

    public final byte[] getMediationNetwork() {
        return this.component4;
    }

    public final int hashCode() {
        String str = this.getCurrencyIso4217Code;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.component4)) * 31;
        String str2 = this.getRevenue;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.getMediationNetwork;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFe1pSDK aFe1pSDK = this.AFAdRevenueData;
        int iHashCode4 = (iHashCode3 + (aFe1pSDK != null ? aFe1pSDK.hashCode() : 0)) * 31;
        Map<String, String> map = this.getMonetizationNetwork;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }
}
