package androidx.core.content.pm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public class ShortcutXmlParser {
    private static final String ATTR_SHORTCUT_ID = "shortcutId";
    private static final Object GET_INSTANCE_LOCK = new Object();
    private static final String META_DATA_APP_SHORTCUTS = "android.app.shortcuts";
    private static final String TAG = "ShortcutXmlParser";
    private static final String TAG_SHORTCUT = "shortcut";
    private static volatile ArrayList<String> sShortcutIds = null;

    public static List<String> getShortcutIds(Context context) {
        if (sShortcutIds == null) {
            synchronized (GET_INSTANCE_LOCK) {
                if (sShortcutIds == null) {
                    sShortcutIds = new ArrayList<>();
                    sShortcutIds.addAll(parseShortcutIds(context));
                }
            }
        }
        return sShortcutIds;
    }

    private ShortcutXmlParser() {
    }

    private static Set<String> parseShortcutIds(Context context) throws Throwable {
        HashSet hashSet = new HashSet();
        Intent intent = new Intent(Jg.Wd("BVzk'_XT^Bvi1u\u000es$Sv_\u001d\u001b9c6\u0012", (short) (OY.Xd() ^ 28157), (short) (OY.Xd() ^ 5778)));
        intent.addCategory(ZO.xd("u0V#.\u001e4F\u00029X\r\u0005$\f^}H@]]\u0003iaB?6`\u000f[Q^", (short) (C1633zX.Xd() ^ (-7850)), (short) (C1633zX.Xd() ^ (-19769))));
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("fF[\u0003\b;7#'\n2[`^\u0005P5N\u007f\u0015pMM", (short) (ZN.Xd() ^ 24328), (short) (ZN.Xd() ^ 30614))).getMethod(Ig.wd("J#\u00027>c\u001a-dP=0qY", (short) (C1633zX.Xd() ^ (-25941))), new Class[0]);
        try {
            method.setAccessible(true);
            intent.setPackage((String) method.invoke(context, objArr));
            short sXd = (short) (C1633zX.Xd() ^ (-28412));
            int[] iArr = new int["\u0018tl\"\u007fO\u001eG@_T\u0001ALR1\u001c2hV\u000bI[".length()];
            QB qb = new QB("\u0018tl\"\u007fO\u001eG@_T\u0001ALR1\u001c2hV\u000bI[");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Qd("/,:\u0015%&-\"'$\u000b\u001e*\u001c!\u001e*", (short) (C1607wl.Xd() ^ 8961)), new Class[0]);
            try {
                method2.setAccessible(true);
                PackageManager packageManager = (PackageManager) method2.invoke(context, objArr2);
                short sXd2 = (short) (C1580rY.Xd() ^ (-9719));
                short sXd3 = (short) (C1580rY.Xd() ^ (-878));
                int[] iArr2 = new int["P^Udb]Y$Zggn`jq,om/RdgpgnmVkymts\u0002".length()];
                QB qb2 = new QB("P^Udb]Y$Zggn`jq,om/RdgpgnmVkymts\u0002");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) - sXd3);
                    i3++;
                }
                Object[] objArr3 = {intent, 128};
                Method method3 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1561oA.Kd("\u001b \u0011\u001f'w\u001e%\u0017!(u\u0019+!/#/%\"1", (short) (FB.Xd() ^ 12003)), Class.forName(C1561oA.od("\u007f\f\u0001\u000e\n\u0003|Ey\u0005\u0003\bw\u007f\u0005=W{\u0001px}", (short) (C1633zX.Xd() ^ (-16786)))), Integer.TYPE);
                try {
                    method3.setAccessible(true);
                    List list = (List) method3.invoke(packageManager, objArr3);
                    if (list != null && list.size() != 0) {
                        try {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
                                Bundle bundle = activityInfo.metaData;
                                if (bundle != null && bundle.containsKey(Wg.Zd("s\u000f\u000b'Yab:#@F\u0011\r\u0010\u001d-dax\u0006;", (short) (C1607wl.Xd() ^ 3688), (short) (C1607wl.Xd() ^ 6878)))) {
                                    XmlResourceParser xmlResourceParser = getXmlResourceParser(context, activityInfo);
                                    try {
                                        hashSet.addAll(parseShortcutIds(xmlResourceParser));
                                        if (xmlResourceParser != null) {
                                            xmlResourceParser.close();
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            C1561oA.Xd("Rhptwgzz_uuZl~\u0001s\u0002", (short) (C1607wl.Xd() ^ 13929));
                            Wg.vd("\u001738<::rH8i7)?A0kUJD\u007f=SO\u0004K?JGRP>AjQ", (short) (OY.Xd() ^ 17533));
                        }
                    }
                    return hashSet;
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        } catch (InvocationTargetException e5) {
            throw e5.getCause();
        }
    }

    private static XmlResourceParser getXmlResourceParser(Context context, ActivityInfo activityInfo) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.ud("o{p}yrl5itrwgot-Aljo_ql", (short) (OY.Xd() ^ 15202)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 17058);
        int[] iArr = new int["43?\u001c25:1<; 5G;>=/".length()];
        QB qb = new QB("43?\u001c25:1<; 5G;>=/");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            XmlResourceParser xmlResourceParserLoadXmlMetaData = activityInfo.loadXmlMetaData((PackageManager) method.invoke(context, objArr), C1561oA.Yd("\t\u0017\u000e\u001d\u001b\u0016\u0012\\\u0011!\"`'\u001d%),\u001c///", (short) (OY.Xd() ^ 30439)));
            if (xmlResourceParserLoadXmlMetaData != null) {
                return xmlResourceParserLoadXmlMetaData;
            }
            short sXd2 = (short) (C1580rY.Xd() ^ (-13972));
            short sXd3 = (short) (C1580rY.Xd() ^ (-18342));
            int[] iArr2 = new int["5QZ^XX\u0015jf\u0018hj`j\u001d_mdsqlh3gwx7}s{\u007f\u0003r\u0006\u0006\u00063\u0002z\u000bxE}{\u0010}=\u0011\u0005\u0014\u0011\u0018\u0016\b\u000bF\u0017\u000fI".length()];
            QB qb2 = new QB("5QZ^XX\u0015jf\u0018hj`j\u001d_mdsqlh3gwx7}s{\u007f\u0003r\u0006\u0006\u00063\u0002z\u000bxE}{\u0010}=\u0011\u0005\u0014\u0011\u0018\u0016\b\u000bF\u0017\u000fI");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                i3++;
            }
            throw new IllegalArgumentException(new String(iArr2, 0, i3) + activityInfo.name);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static List<String> parseShortcutIds(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= 0)) {
                break;
            }
            int depth = xmlPullParser.getDepth();
            String name = xmlPullParser.getName();
            if (next == 2 && depth == 2 && TAG_SHORTCUT.equals(name) && (attributeValue = getAttributeValue(xmlPullParser, ATTR_SHORTCUT_ID)) != null) {
                arrayList.add(attributeValue);
            }
        }
        return arrayList;
    }

    private static String getAttributeValue(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }
}
