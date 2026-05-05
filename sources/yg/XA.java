package yg;

import android.util.Printer;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public class XA implements Printer {
    private String Xd;

    public XA() {
        String strKd = Qg.kd("aN\u0014=%", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134253241)), (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ 831090847)));
        String strVd = hg.Vd("BM", (short) (C1580rY.Xd() ^ (C1633zX.Xd() ^ (18320712 ^ 1967580269))), (short) (C1580rY.Xd() ^ ((1620147679 ^ 545774917) ^ (-1075231038))));
        try {
            Class<?> cls = Class.forName(strKd);
            Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
            field.setAccessible(true);
            field.set(this, null);
        } catch (Throwable th) {
        }
    }

    public String GK() {
        Object obj;
        String strUd = C1561oA.ud("\u001d\nOx`", (short) (FB.Xd() ^ (C1580rY.Xd() ^ (1882747742 ^ (-1102147584)))));
        short sXd = (short) (C1633zX.Xd() ^ (C1580rY.Xd() ^ 831068024));
        int[] iArr = new int["z\b".length()];
        QB qb = new QB("z\b");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        try {
            Class<?> cls = Class.forName(strUd);
            Field field = 0 != 0 ? cls.getField(str) : cls.getDeclaredField(str);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        return (String) obj;
    }

    @Override // android.util.Printer
    public void println(String str) {
        if (str.startsWith(C1561oA.Yd("C6;A:D\u0013", (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (2059657874 ^ (-962119448))))))) {
            String strQd = Xg.qd("\u001c\u000bR}g", (short) (C1633zX.Xd() ^ (1027976758 ^ (-1027985680))), (short) (C1633zX.Xd() ^ ((1787168614 ^ 453372262) ^ (-1904456602))));
            String strWd = Jg.Wd("T\u001b", (short) (FB.Xd() ^ (1495696942 ^ 1495697445)), (short) (FB.Xd() ^ ((379963334 ^ 1700155694) ^ 1945338343)));
            try {
                Class<?> cls = Class.forName(strQd);
                Field field = 0 != 0 ? cls.getField(strWd) : cls.getDeclaredField(strWd);
                field.setAccessible(true);
                field.set(this, str);
            } catch (Throwable th) {
            }
        }
    }
}
