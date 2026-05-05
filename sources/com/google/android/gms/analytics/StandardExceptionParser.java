package com.google.android.gms.analytics;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
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
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes8.dex */
public class StandardExceptionParser implements ExceptionParser {
    private final TreeSet zza = new TreeSet();

    public StandardExceptionParser(Context context, Collection<String> collection) throws Throwable {
        setIncludedPackages(context, collection);
    }

    protected StackTraceElement getBestStackTraceElement(Throwable th) throws Throwable {
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace == null || (stackTrace.length) == 0) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            Class<?> cls = Class.forName(C1561oA.yd("\u0010\u0006\u001a\u0004O\r\u0001\r\u0005Jn\u000fz{\u0003j(\u0016\u0017\u0018v\u001d\u0015\u001c\u0013\u001b ", (short) (Od.Xd() ^ (-16742))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (ZN.Xd() ^ 7686);
            int[] iArr = new int["\u0011\u0010 o\u001a\u0010#$\u007f\u0014!\u001a".length()];
            QB qb = new QB("\u0011\u0010 o\u001a\u0010#$\u007f\u0014!\u001a");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                String str = (String) method.invoke(stackTraceElement, objArr);
                Iterator it = this.zza.iterator();
                while (it.hasNext()) {
                    if (str.startsWith((String) it.next())) {
                        return stackTraceElement;
                    }
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return stackTrace[0];
    }

    protected Throwable getCause(Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    @Override // com.google.android.gms.analytics.ExceptionParser
    public String getDescription(String str, Throwable th) {
        return getDescription(getCause(th), getBestStackTraceElement(getCause(th)), str);
    }

    protected String getDescription(Throwable th, StackTraceElement stackTraceElement, String str) throws Throwable {
        int length;
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getSimpleName());
        if (stackTraceElement != null) {
            short sXd = (short) (OY.Xd() ^ 20569);
            short sXd2 = (short) (OY.Xd() ^ 5484);
            int[] iArr = new int["\u000f\u0007\u001d\tV\u0016\f\u001a\u0014[\u0002$\u0012\u0015\u001e\b'\u0017\u001a\u001d}& )\",3".length()];
            QB qb = new QB("\u000f\u0007\u001d\tV\u0016\f\u001a\u0014[\u0002$\u0012\u0015\u001e\b'\u0017\u001a\u001d}& )\",3");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Jg.Wd("\\*\u001a8\u0018mP\u000fA%o6", (short) (Od.Xd() ^ (-13343)), (short) (Od.Xd() ^ (-27920))), new Class[0]);
            try {
                method.setAccessible(true);
                String[] strArrSplit = ((String) method.invoke(stackTraceElement, objArr)).split(ZO.xd("EI", (short) (C1580rY.Xd() ^ (-20141)), (short) (C1580rY.Xd() ^ (-30084))));
                String strUd = (strArrSplit == null || (length = strArrSplit.length) <= 0) ? C1626yg.Ud("hPez[]\u0011", (short) (C1633zX.Xd() ^ (-31168)), (short) (C1633zX.Xd() ^ (-5102))) : strArrSplit[length - 1];
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Ig.wd("Bej<\u0016wNIws\u0015Ztv\u001d)nq)\u0001&\u000b,:3n\u0010", (short) (OY.Xd() ^ 1747))).getMethod(EO.Od("A\u0017i\"R7?]\u0016cl^&", (short) (C1580rY.Xd() ^ (-15778))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    String str2 = (String) method2.invoke(stackTraceElement, objArr2);
                    short sXd3 = (short) (OY.Xd() ^ 1978);
                    int[] iArr2 = new int["\u0018\u000e\"\fW\u0015\t\u0015\rRv\u0017\u0003\u0004\u000br\u0010}~\u007f^\u0005|\u0004z\u0003\b".length()];
                    QB qb2 = new QB("\u0018\u000e\"\fW\u0015\t\u0015\rRv\u0017\u0003\u0004\u000br\u0010}~\u007f^\u0005|\u0004z\u0003\b");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                        i3++;
                    }
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(new String(iArr2, 0, i3)).getMethod(C1593ug.zd("JIY2PVN8`YOSa", (short) (C1607wl.Xd() ^ 14985), (short) (C1607wl.Xd() ^ 23537)), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        sb.append(String.format(C1561oA.od("=D[?\rR<\nO9\u0007;", (short) (FB.Xd() ^ 4614)), strUd, str2, Integer.valueOf(((Integer) method3.invoke(stackTraceElement, objArr3)).intValue())));
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
        if (str != null) {
            Object[] objArr4 = {str};
            short sXd4 = (short) (C1633zX.Xd() ^ (-10676));
            int[] iArr3 = new int["fCm=H".length()];
            QB qb3 = new QB("fCm=H");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(xuXd3.CK(iKK3) - ((sXd4 + sXd4) + i4));
                i4++;
            }
            sb.append(String.format(new String(iArr3, 0, i4), objArr4));
        }
        return sb.toString();
    }

    public void setIncludedPackages(Context context, Collection<String> collection) throws Throwable {
        this.zza.clear();
        HashSet<String> hashSet = new HashSet();
        if (collection != null) {
            hashSet.addAll(collection);
        }
        if (context != null) {
            Class<?> cls = Class.forName(Wg.Zd("\u0005$]5\nMUrmI\u001egeH\u0016\u0019\u0002\u007f\b]\u001czL", (short) (Od.Xd() ^ (-26345)), (short) (Od.Xd() ^ (-1762))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (Od.Xd() ^ (-25978));
            int[] iArr = new int["XWg5efca\\[oellBoovh|y".length()];
            QB qb = new QB("XWg5efca\\[oellBoovh|y");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                Context context2 = (Context) method.invoke(context, objArr);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Wg.vd("\r\u0019\u0012\u001f\u0017\u0010\u000eV\u0017\"$)\u0015\u001d&^~*,1\u001d/.", (short) (Od.Xd() ^ (-22385)))).getMethod(Qg.kd("\u0018\u0015#}\u000e\u000f\u0016\u000b\u0010\rt\u0007\u0012\t", (short) (C1633zX.Xd() ^ (-914)), (short) (C1633zX.Xd() ^ (-22284))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    hashSet.add((String) method2.invoke(context2, objArr2));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        for (String str : hashSet) {
            Iterator it = this.zza.iterator();
            boolean z2 = true;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (str.startsWith(str2)) {
                    z2 = false;
                } else if (str2.startsWith(str)) {
                    this.zza.remove(str2);
                }
            }
            if (z2) {
                this.zza.add(str);
            }
        }
    }
}
