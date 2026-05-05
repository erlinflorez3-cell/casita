package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import com.drew.metadata.exif.makernotes.OlympusFocusInfoMakernoteDirectory;
import com.dynatrace.android.agent.Global;
import com.facebook.imageutils.JfifUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.CharBuffer;
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

/* JADX INFO: loaded from: classes4.dex */
public class Debug {
    public static void logStack(String tag, String msg, int n2) throws Throwable {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(n2, stackTrace.length - 1);
        String strQd = Xg.qd("l", (short) (ZN.Xd() ^ 5976), (short) (ZN.Xd() ^ 11902));
        String str = strQd;
        for (int i2 = 1; i2 <= iMin; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            short sXd = (short) (C1607wl.Xd() ^ 11914);
            short sXd2 = (short) (C1607wl.Xd() ^ 7075);
            int[] iArr = new int["y<".length()];
            QB qb = new QB("y<");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - ((i3 * sXd2) ^ sXd));
                i3++;
            }
            StringBuilder sb = new StringBuilder(new String(iArr, 0, i3));
            StackTraceElement stackTraceElement2 = stackTrace[i2];
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("VxF}y1\u001d\u001eoi7}b~Bc\u001f;\u0012+\u001eW/*> `", (short) (OY.Xd() ^ 26689), (short) (OY.Xd() ^ 31254))).getMethod(C1626yg.Ud("o~ET-\u0012\u0007\u007f\u0006{%", (short) (Od.Xd() ^ (-21281)), (short) (Od.Xd() ^ (-24081))), new Class[0]);
            try {
                method.setAccessible(true);
                StringBuilder sbAppend = sb.append((String) method.invoke(stackTraceElement2, objArr)).append(Ig.wd("\u0007", (short) (Od.Xd() ^ (-28522))));
                StackTraceElement stackTraceElement3 = stackTrace[i2];
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(EO.Od("f\rV_ny88[d\nGb`^g:Iu.H.swK\u0018\u007f", (short) (C1499aX.Xd() ^ (-679)))).getMethod(C1561oA.Qd("\u0012\u000f\u001ds\u0010\u0014\nq\u0018\u000f\u0003\u0005\u0011", (short) (OY.Xd() ^ 14234)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    StringBuilder sbAppend2 = sbAppend.append(((Integer) method2.invoke(stackTraceElement3, objArr2)).intValue()).append(C1593ug.zd("{s", (short) (C1580rY.Xd() ^ (-30747)), (short) (C1580rY.Xd() ^ (-23241))));
                    StackTraceElement stackTraceElement4 = stackTrace[i2];
                    Class<?> cls = Class.forName(C1561oA.od("YOcM\u0019VJVN\u00148XDEL4Q?@A F>E<DI", (short) (Od.Xd() ^ (-6476))));
                    Class<?>[] clsArr = new Class[0];
                    Object[] objArr3 = new Object[0];
                    short sXd3 = (short) (ZN.Xd() ^ 19391);
                    int[] iArr2 = new int["^]mG`pemcNboh".length()];
                    QB qb2 = new QB("^]mG`pemcNboh");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i4));
                        i4++;
                    }
                    Method method3 = cls.getMethod(new String(iArr2, 0, i4), clsArr);
                    try {
                        method3.setAccessible(true);
                        str = str + strQd;
                        String str2 = msg + str + sbAppend2.append((String) method3.invoke(stackTraceElement4, objArr3)).toString() + str;
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
    }

    public static void printStack(String msg, int n2) throws Throwable {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(n2, stackTrace.length - 1);
        String strZd = Wg.Zd("\u001b", (short) (FB.Xd() ^ 24464), (short) (FB.Xd() ^ 9495));
        String str = strZd;
        for (int i2 = 1; i2 <= iMin; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            StringBuilder sb = new StringBuilder(C1561oA.Xd("&!", (short) (C1633zX.Xd() ^ (-20794))));
            StackTraceElement stackTraceElement2 = stackTrace[i2];
            short sXd = (short) (C1607wl.Xd() ^ 3965);
            int[] iArr = new int["\n\u0002\u0018\u0004Q\u0011\u0007\u0015~Fl\u000f|\u007f\tr\u0002qtwX\u0001z\u0004lv}".length()];
            QB qb = new QB("\n\u0002\u0018\u0004Q\u0011\u0007\u0015~Fl\u000f|\u007f\tr\u0002qtwX\u0001z\u0004lv}");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((sXd ^ i3) + xuXd.CK(iKK));
                i3++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i3)).getMethod(Qg.kd("vs\u0002RtvnVhsj", (short) (C1580rY.Xd() ^ (-7371)), (short) (C1580rY.Xd() ^ (-12597))), new Class[0]);
            try {
                method.setAccessible(true);
                StringBuilder sbAppend = sb.append((String) method.invoke(stackTraceElement2, objArr)).append(hg.Vd("!", (short) (OY.Xd() ^ 25535), (short) (OY.Xd() ^ 318)));
                StackTraceElement stackTraceElement3 = stackTrace[i2];
                short sXd2 = (short) (C1499aX.Xd() ^ (-722));
                int[] iArr2 = new int["[QeO\u001bXLXP\u0016:ZFGN6SABC\"H@G>FK".length()];
                QB qb2 = new QB("[QeO\u001bXLXP\u0016:ZFGN6SABC\"H@G>FK");
                int i4 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i4] = xuXd2.fK(sXd2 + i4 + xuXd2.CK(iKK2));
                    i4++;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(new String(iArr2, 0, i4)).getMethod(C1561oA.yd("\u0004\u0003\u0013k\u0002\b\u007fi\u001a\u0013\t\r\u0013", (short) (Od.Xd() ^ (-8239))), new Class[0]);
                try {
                    method2.setAccessible(true);
                    str = str + strZd;
                    System.out.println(msg + str + sbAppend.append(((Integer) method2.invoke(stackTraceElement3, objArr2)).intValue()).append(C1561oA.Yd("VN", (short) (ZN.Xd() ^ 15482))).toString() + str);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    public static String getName(View view) {
        try {
            Context context = view.getContext();
            short sXd = (short) (FB.Xd() ^ 30539);
            int[] iArr = new int["\u000f\u001b\u0010\u001d\u0019\u0012\fT\t\u0014\u0012\u0017\u0007\u000f\u0014L`\f\n\u000f~\u0011\f".length()];
            QB qb = new QB("\u000f\u001b\u0010\u001d\u0019\u0012\fT\t\u0014\u0012\u0017\u0007\u000f\u0014L`\f\n\u000f~\u0011\f");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                i2++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Object[] objArr = new Object[0];
            Method method = cls.getMethod(C1561oA.Kd("LK[:N]Za_QTc", (short) (C1580rY.Xd() ^ (-18666))), new Class[0]);
            try {
                method.setAccessible(true);
                return ((Resources) method.invoke(context, objArr)).getResourceEntryName(view.getId());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Exception unused) {
            return Wg.Zd("l[\r6q K", (short) (FB.Xd() ^ 11346), (short) (FB.Xd() ^ 14063));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x028c A[Catch: IllegalAccessException -> 0x0364, TryCatch #0 {IllegalAccessException -> 0x0364, blocks: (B:30:0x021a, B:32:0x0230, B:35:0x0238, B:37:0x023c, B:43:0x0284, B:46:0x028c, B:48:0x0290, B:50:0x02ab, B:53:0x02b3, B:55:0x02b7, B:61:0x02f6, B:64:0x02fd, B:66:0x0301, B:68:0x0313, B:71:0x031a, B:73:0x0333, B:75:0x0355), top: B:86:0x021a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02fd A[Catch: IllegalAccessException -> 0x0364, TryCatch #0 {IllegalAccessException -> 0x0364, blocks: (B:30:0x021a, B:32:0x0230, B:35:0x0238, B:37:0x023c, B:43:0x0284, B:46:0x028c, B:48:0x0290, B:50:0x02ab, B:53:0x02b3, B:55:0x02b7, B:61:0x02f6, B:64:0x02fd, B:66:0x0301, B:68:0x0313, B:71:0x031a, B:73:0x0333, B:75:0x0355), top: B:86:0x021a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void dumpPoc(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 919
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.Debug.dumpPoc(java.lang.Object):void");
    }

    public static String getName(Context context, int id) {
        if (id != -1) {
            short sXd = (short) (C1580rY.Xd() ^ (-3935));
            short sXd2 = (short) (C1580rY.Xd() ^ (-26978));
            int[] iArr = new int["nzo|xqk4hsqvfns,@kin^pk".length()];
            QB qb = new QB("nzo|xqk4hsqvfns,@kin^pk");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
                i2++;
            }
            try {
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd3 = (short) (ZN.Xd() ^ 19372);
                int[] iArr2 = new int["\u001f\u001c*\u0007\u0019&!&\"\u0012\u0013 ".length()];
                QB qb2 = new QB("\u001f\u001c*\u0007\u0019&!&\"\u0012\u0013 ");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method.setAccessible(true);
                    return ((Resources) method.invoke(context, objArr)).getResourceEntryName(id);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Exception unused) {
                return C1561oA.Yd("|", (short) (ZN.Xd() ^ 27469)) + id;
            }
        }
        return C1561oA.yd("A99;7>8", (short) (C1633zX.Xd() ^ (-14066)));
    }

    public static String getName(Context context, int[] id) throws Throwable {
        String string;
        try {
            StringBuilder sbAppend = new StringBuilder().append(id.length);
            short sXd = (short) (Od.Xd() ^ (-10246));
            short sXd2 = (short) (Od.Xd() ^ (-25107));
            int[] iArr = new int["G".length()];
            QB qb = new QB("G");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
                i2++;
            }
            String string2 = sbAppend.append(new String(iArr, 0, i2)).toString();
            int i3 = 0;
            while (i3 < id.length) {
                StringBuilder sbAppend2 = new StringBuilder().append(string2);
                String strWd = Jg.Wd("\t", (short) (C1580rY.Xd() ^ (-18141)), (short) (C1580rY.Xd() ^ (-17713)));
                String string3 = sbAppend2.append(i3 == 0 ? "" : strWd).toString();
                try {
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(ZO.xd("}$\u001c,\u0014ZX8[l}oOm\u0014S5)_O_\"$", (short) (C1633zX.Xd() ^ (-10018)), (short) (C1633zX.Xd() ^ (-29962)))).getMethod(C1626yg.Ud("J9ghZ`D:'%\u001eG", (short) (C1607wl.Xd() ^ 16508), (short) (C1607wl.Xd() ^ 8507)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        string = ((Resources) method.invoke(context, objArr)).getResourceEntryName(id[i3]);
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                } catch (Resources.NotFoundException unused) {
                    StringBuilder sb = new StringBuilder();
                    short sXd3 = (short) (OY.Xd() ^ 6341);
                    int[] iArr2 = new int["\rB".length()];
                    QB qb2 = new QB("\rB");
                    int i4 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i4 % C1561oA.Xd.length] ^ (sXd3 + i4)));
                        i4++;
                    }
                    string = sb.append(new String(iArr2, 0, i4)).append(id[i3]).append(strWd).toString();
                }
                string2 = string3 + string;
                i3++;
            }
            StringBuilder sbAppend3 = new StringBuilder().append(string2);
            short sXd4 = (short) (C1580rY.Xd() ^ (-19540));
            int[] iArr3 = new int[Global.UNDERSCORE.length()];
            QB qb3 = new QB(Global.UNDERSCORE);
            int i5 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i5] = xuXd3.fK((C1561oA.Xd[i5 % C1561oA.Xd.length] ^ ((sXd4 + sXd4) + i5)) + xuXd3.CK(iKK3));
                i5++;
            }
            return sbAppend3.append(new String(iArr3, 0, i5)).toString();
        } catch (Exception e3) {
            C1561oA.Qd("\\\\Xj[", (short) (C1580rY.Xd() ^ (-25740)));
            e3.toString();
            return C1593ug.zd("\"\u001c\u001a\u001e )!", (short) (Od.Xd() ^ (-32662)), (short) (Od.Xd() ^ (-20020)));
        }
    }

    public static String getState(MotionLayout layout, int stateId) {
        return getState(layout, stateId, -1);
    }

    public static String getState(MotionLayout layout, int stateId, int len) throws Throwable {
        int length;
        if (stateId == -1) {
            return C1561oA.Xd("\r\u0007}\u007f\u0002\u0006\f\u0004\u0004", (short) (ZN.Xd() ^ 7939));
        }
        Context context = layout.getContext();
        Object[] objArr = new Object[0];
        Method method = Class.forName(Wg.vd(">L?NPKC\u000e8EAH>HK\u0006\u0010=9@6JC", (short) (C1607wl.Xd() ^ 23903))).getMethod(Qg.kd("96D!3@;@<,-:", (short) (FB.Xd() ^ 15666), (short) (FB.Xd() ^ 559)), new Class[0]);
        try {
            method.setAccessible(true);
            String resourceEntryName = ((Resources) method.invoke(context, objArr)).getResourceEntryName(stateId);
            if (len == -1) {
                return resourceEntryName;
            }
            if (resourceEntryName.length() > len) {
                resourceEntryName = resourceEntryName.replaceAll(hg.Vd("b\u0015\u0017\u0017\u0014^\u0010\u0015\u0018\u001b %\fX", (short) (C1607wl.Xd() ^ 4490), (short) (C1607wl.Xd() ^ 25174)), C1561oA.ud("S_", (short) (C1499aX.Xd() ^ (-4728))));
            }
            if (resourceEntryName.length() <= len || (length = resourceEntryName.replaceAll(C1561oA.yd("y{\u007f|", (short) (C1633zX.Xd() ^ (-6018))), "").length()) <= 0) {
                return resourceEntryName;
            }
            StringBuilder sbAppend = new StringBuilder().append(CharBuffer.allocate((resourceEntryName.length() - len) / length).toString().replace((char) 0, '.'));
            String strYd = C1561oA.Yd("H", (short) (ZN.Xd() ^ 7804));
            return resourceEntryName.replaceAll(sbAppend.append(strYd).toString(), strYd);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static String getActionType(MotionEvent event) {
        int action = event.getAction();
        for (Field field : MotionEvent.class.getFields()) {
            try {
                if (Modifier.isStatic(field.getModifiers()) && field.getType().equals(Integer.TYPE) && field.getInt(null) == action) {
                    return field.getName();
                }
            } catch (IllegalAccessException unused) {
            }
        }
        return "---";
    }

    public static String getLocation() throws Throwable {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sb = new StringBuilder(Xg.qd("\u000f\n", (short) (C1580rY.Xd() ^ (-23528)), (short) (C1580rY.Xd() ^ (-23607))));
        Object[] objArr = new Object[0];
        Method method = Class.forName(Jg.Wd("E_POtO(L\"|y7\t#\u0006\u0003yDjEA;P1M2P", (short) (C1499aX.Xd() ^ (-31284)), (short) (C1499aX.Xd() ^ (-31811)))).getMethod(ZO.xd("|4pz\u007f\u001f8F~\u0017o", (short) (ZN.Xd() ^ 15585), (short) (ZN.Xd() ^ 23731)), new Class[0]);
        try {
            method.setAccessible(true);
            StringBuilder sbAppend = sb.append((String) method.invoke(stackTraceElement, objArr));
            short sXd = (short) (C1499aX.Xd() ^ (-4994));
            short sXd2 = (short) (C1499aX.Xd() ^ (-2756));
            int[] iArr = new int["@".length()];
            QB qb = new QB("@");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            StringBuilder sbAppend2 = sbAppend.append(new String(iArr, 0, i2));
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Ig.wd("\u0013<}\u000bEVA|*_\u0005\n'-/xA@xt\u0019r_i&|_", (short) (C1607wl.Xd() ^ 5312))).getMethod(EO.Od("c\t\bF.\u007f\u0019\u0014ydU8o", (short) (C1633zX.Xd() ^ (-19089))), new Class[0]);
            try {
                method2.setAccessible(true);
                StringBuilder sbAppend3 = sbAppend2.append(((Integer) method2.invoke(stackTraceElement, objArr2)).intValue());
                short sXd3 = (short) (C1607wl.Xd() ^ 17567);
                int[] iArr2 = new int["J".length()];
                QB qb2 = new QB("J");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd3 + sXd3 + sXd3 + i3 + xuXd2.CK(iKK2));
                    i3++;
                }
                return sbAppend3.append(new String(iArr2, 0, i3)).toString();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static String getLoc() throws Throwable {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sb = new StringBuilder(C1561oA.od("@9", (short) (C1607wl.Xd() ^ 19230)));
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("NF\\H\u0016UKYS\u001bAcQT]GfVY\\=e_hakr", (short) (C1607wl.Xd() ^ 24204))).getMethod(Wg.Zd("0MfW'DLQ\u000f:>", (short) (C1633zX.Xd() ^ (-15299)), (short) (C1633zX.Xd() ^ (-12481))), new Class[0]);
        try {
            method.setAccessible(true);
            StringBuilder sbAppend = sb.append((String) method.invoke(stackTraceElement, objArr)).append(C1561oA.Xd("m", (short) (Od.Xd() ^ (-27292))));
            Class<?> cls = Class.forName(Wg.vd("8.B,w5)5=\u0003'G34;#P>?@\u001fE=DKSX", (short) (OY.Xd() ^ 17520)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd = (short) (Od.Xd() ^ (-30427));
            short sXd2 = (short) (Od.Xd() ^ (-24766));
            int[] iArr = new int["iftKgkaIofZ\\h".length()];
            QB qb = new QB("iftKgkaIofZ\\h");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
                i2++;
            }
            Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method2.setAccessible(true);
                StringBuilder sbAppend2 = sbAppend.append(((Integer) method2.invoke(stackTraceElement, objArr2)).intValue()).append(hg.Vd("\u0017\r", (short) (ZN.Xd() ^ 10763), (short) (ZN.Xd() ^ 24283)));
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1561oA.ud("lbv`,i]ia'KkWX_GdRST3YQXOW\\", (short) (C1633zX.Xd() ^ (-22705)))).getMethod(C1561oA.yd("1.<\u00143A4:6\u001f1<;", (short) (ZN.Xd() ^ 3091)), new Class[0]);
                try {
                    method3.setAccessible(true);
                    return sbAppend2.append((String) method3.invoke(stackTraceElement, objArr3)).append(C1561oA.Yd("fh", (short) (C1607wl.Xd() ^ 8322))).toString();
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

    public static String getLocation2() throws Throwable {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        StringBuilder sb = new StringBuilder(C1593ug.zd("\u001e\u0019", (short) (Od.Xd() ^ (-12244)), (short) (Od.Xd() ^ (-27075))));
        short sXd = (short) (C1633zX.Xd() ^ (-10183));
        int[] iArr = new int["tj~h4qeqi/Ss_`gOlZ[\\;aY`W_d".length()];
        QB qb = new QB("tj~h4qeqi/Ss_`gOlZ[\\;aY`W_d");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Kd("\u001e\u001d-\u007f$(\"\f -&", (short) (ZN.Xd() ^ 15200)), new Class[0]);
        try {
            method.setAccessible(true);
            StringBuilder sbAppend = sb.append((String) method.invoke(stackTraceElement, objArr));
            short sXd2 = (short) (Od.Xd() ^ (-17197));
            short sXd3 = (short) (Od.Xd() ^ (-18539));
            int[] iArr2 = new int["b".length()];
            QB qb2 = new QB("b");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                i3++;
            }
            StringBuilder sbAppend2 = sbAppend.append(new String(iArr2, 0, i3));
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Xd("nf|h6ukys;a\u0004qt}g\u0007vy|]\u0006\u007f\t\u0002\f\u0013", (short) (OY.Xd() ^ 27729))).getMethod(Wg.vd("ur\u0001W{\u007fu]\f\u0003vx\r", (short) (ZN.Xd() ^ 18188)), new Class[0]);
            try {
                method2.setAccessible(true);
                return sbAppend2.append(((Integer) method2.invoke(stackTraceElement, objArr2)).intValue()).append(Qg.kd("\u0017", (short) (OY.Xd() ^ 4160), (short) (OY.Xd() ^ 18731))).toString();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static String getCallFrom(int n2) throws Throwable {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[n2 + 2];
        StringBuilder sb = new StringBuilder(Jg.Wd("\u0011\u001b", (short) (C1580rY.Xd() ^ (-14488)), (short) (C1580rY.Xd() ^ (-27355))));
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("Z\u00170|G25d\u007fiCLsK*\u0004p7\u0006.\u0001GJ\u0004@c7", (short) (C1607wl.Xd() ^ 11172), (short) (C1607wl.Xd() ^ 11079))).getMethod(C1626yg.Ud("'lw^\rXQ#\bc5", (short) (ZN.Xd() ^ 21299), (short) (ZN.Xd() ^ 16480)), new Class[0]);
        try {
            method.setAccessible(true);
            StringBuilder sbAppend = sb.append((String) method.invoke(stackTraceElement, objArr)).append(Ig.wd("F", (short) (Od.Xd() ^ (-17669))));
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(EO.Od("\u0014<?\u0007CNk\u00018o\u000f\u0016--a-wp\u001bIg3\u001a\u001eT\u000e2", (short) (FB.Xd() ^ 19543))).getMethod(C1561oA.Qd("|y\b^z~t\\\u0003ymo{", (short) (C1499aX.Xd() ^ (-22405))), new Class[0]);
            try {
                method2.setAccessible(true);
                return sbAppend.append(((Integer) method2.invoke(stackTraceElement, objArr2)).intValue()).append(C1593ug.zd(RemoteSettings.FORWARD_SLASH_STRING, (short) (C1607wl.Xd() ^ 10987), (short) (C1607wl.Xd() ^ JfifUtil.MARKER_APP1))).toString();
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static void dumpLayoutParams(ViewGroup layout, String str) throws Throwable {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sb = new StringBuilder(C1593ug.zd("gb", (short) (C1499aX.Xd() ^ (-27844)), (short) (C1499aX.Xd() ^ (-12983))));
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od("\u001f\u0015)\u0013^\u001c\u0010\u001c\u0014Y}\u001e\n\u000b\u0012y\u0017\u0005\u0006\u0007e\f\u0004\u000b\u0002\n\u000f", (short) (C1499aX.Xd() ^ (-8391)))).getMethod(C1561oA.Kd("RQa4X\\V@TaZ", (short) (C1633zX.Xd() ^ (-2009))), new Class[0]);
        try {
            method.setAccessible(true);
            StringBuilder sbAppend = sb.append((String) method.invoke(stackTraceElement, objArr));
            short sXd = (short) (C1633zX.Xd() ^ (-7051));
            short sXd2 = (short) (C1633zX.Xd() ^ (-23923));
            int[] iArr = new int["z".length()];
            QB qb = new QB("z");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            StringBuilder sbAppend2 = sbAppend.append(new String(iArr, 0, i2));
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.Xd("kcye3rhvp8^\u0001nqzd\u0004svyZ\u0003|\u0006~\t\u0010", (short) (ZN.Xd() ^ 30976))).getMethod(Wg.vd("=:L#;?9!C:24<", (short) (Od.Xd() ^ (-2249))), new Class[0]);
            try {
                method2.setAccessible(true);
                StringBuilder sbAppend3 = sbAppend2.append(((Integer) method2.invoke(stackTraceElement, objArr2)).intValue()).append(Qg.kd("SI", (short) (ZN.Xd() ^ OlympusFocusInfoMakernoteDirectory.TagImageStabilization), (short) (ZN.Xd() ^ 6122))).append(str);
                short sXd3 = (short) (C1607wl.Xd() ^ 9318);
                short sXd4 = (short) (C1607wl.Xd() ^ 24177);
                int[] iArr2 = new int[",+".length()];
                QB qb2 = new QB(",+");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(sXd3 + i3 + xuXd2.CK(iKK2) + sXd4);
                    i3++;
                }
                String string = sbAppend3.append(new String(iArr2, 0, i3)).toString();
                int childCount = layout.getChildCount();
                System.out.println(str + C1561oA.ud("/quuwn{mu&", (short) (FB.Xd() ^ 3868)) + childCount);
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = layout.getChildAt(i4);
                    System.out.println(string + C1561oA.yd("\u0006\u0005\b\u0007\u0002", (short) (C1499aX.Xd() ^ (-27487))) + getName(childAt));
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    for (Field field : layoutParams.getClass().getFields()) {
                        try {
                            Object obj = field.get(layoutParams);
                            if (field.getName().contains(C1561oA.Yd("\u00151", (short) (FB.Xd() ^ 20959))) && !obj.toString().equals(Xg.qd("\u0010\u0015", (short) (C1607wl.Xd() ^ 7248), (short) (C1607wl.Xd() ^ 10506)))) {
                                System.out.println(string + Jg.Wd("m\"7,\t}\u0013", (short) (C1580rY.Xd() ^ (-1334)), (short) (C1580rY.Xd() ^ (-27160))) + field.getName() + ZO.xd("\t", (short) (Od.Xd() ^ (-6187)), (short) (Od.Xd() ^ (-5929))) + obj);
                            }
                        } catch (IllegalAccessException unused) {
                        }
                    }
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static void dumpLayoutParams(ViewGroup.LayoutParams param, String str) throws Throwable {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sb = new StringBuilder(C1561oA.Xd("\u0001{", (short) (C1633zX.Xd() ^ (-11509))));
        Class<?> cls = Class.forName(Wg.vd("\u0001v\u000bt@}q}u;_\u007fkls[xfghGmelckp", (short) (C1607wl.Xd() ^ 26586)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1633zX.Xd() ^ (-13490));
        short sXd2 = (short) (C1633zX.Xd() ^ (-23142));
        int[] iArr = new int["\u000f\f\u001aj\r\u000f\u0007n\u0001\f\u0003".length()];
        QB qb = new QB("\u000f\f\u001aj\r\u000f\u0007n\u0001\f\u0003");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((sXd + i2) + xuXd.CK(iKK)) - sXd2);
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            StringBuilder sbAppend = sb.append((String) method.invoke(stackTraceElement, objArr)).append(hg.Vd(ExifInterface.GPS_DIRECTION_TRUE, (short) (FB.Xd() ^ 16348), (short) (FB.Xd() ^ 24385)));
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(C1561oA.ud("cYmW#`T`X\u001eBbNOV>[IJK*PHOFNS", (short) (ZN.Xd() ^ 1250))).getMethod(C1561oA.yd("2/=\u001404*\u0012H?35A", (short) (C1580rY.Xd() ^ (-29978))), new Class[0]);
            try {
                method2.setAccessible(true);
                StringBuilder sbAppend2 = sbAppend.append(((Integer) method2.invoke(stackTraceElement, objArr2)).intValue());
                short sXd3 = (short) (OY.Xd() ^ 2521);
                int[] iArr2 = new int["C;".length()];
                QB qb2 = new QB("C;");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd3 + sXd3) + sXd3) + i3));
                    i3++;
                }
                StringBuilder sbAppend3 = sbAppend2.append(new String(iArr2, 0, i3)).append(str);
                short sXd4 = (short) (OY.Xd() ^ 10147);
                short sXd5 = (short) (OY.Xd() ^ 17763);
                int[] iArr3 = new int["#$".length()];
                QB qb3 = new QB("#$");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd4 + i4)) + sXd5);
                    i4++;
                }
                String str2 = new String(iArr3, 0, i4);
                String string = sbAppend3.append(str2).toString();
                System.out.println(Jg.Wd("\u0017\u0002\u001aj\u0003\u001fk\b p\t)q\n*r\u000f+w\u0004\u0012\u001fP`,{", (short) (C1607wl.Xd() ^ 24789), (short) (C1607wl.Xd() ^ 10618)) + string + str2 + param.getClass().getName());
                for (Field field : param.getClass().getFields()) {
                    try {
                        Object obj = field.get(param);
                        String name = field.getName();
                        if (name.contains(ZO.xd("\u0004\u001d", (short) (FB.Xd() ^ 4354), (short) (FB.Xd() ^ 26153))) && !obj.toString().equals(C1626yg.Ud("at", (short) (Od.Xd() ^ (-5699)), (short) (Od.Xd() ^ (-5742))))) {
                            System.out.println(string + Ig.wd("T\u001c:]&a9", (short) (C1607wl.Xd() ^ 9500)) + name + EO.Od("p", (short) (Od.Xd() ^ (-14007))) + obj);
                        }
                    } catch (IllegalAccessException unused) {
                    }
                }
                System.out.println(C1561oA.Qd("6QPONMLKJIHGFEDCBA$gwnp\u001f", (short) (C1499aX.Xd() ^ (-7741))) + string);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
