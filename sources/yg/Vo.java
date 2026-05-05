package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Vo implements Wd {
    private String Xd;

    @Override // yg.Wd
    public YK UY(BF bf) throws Throwable {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        String strUd = C1626yg.Ud("|", (short) (FB.Xd() ^ (1653025638 ^ 1653024454)), (short) (FB.Xd() ^ ((1289794790 ^ 93758740) ^ 1232489666)));
        short sXd = (short) (C1633zX.Xd() ^ (2081356723 ^ (-2081352121)));
        int[] iArr = new int["'f=\u000bz".length()];
        QB qb = new QB("'f=\u000bz");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strOd = EO.Od("`\u001d", (short) (C1633zX.Xd() ^ ((1189311623 ^ 1431518933) ^ (-330308722))));
        try {
            Class<?> cls = Class.forName(str);
            Field field = 0 != 0 ? cls.getField(strOd) : cls.getDeclaredField(strOd);
            field.setAccessible(true);
            obj = field.get(this);
        } catch (Throwable th) {
            obj = null;
        }
        try {
            jSONObject.put(strUd, (String) obj);
        } catch (Exception e2) {
        }
        short sXd2 = (short) (FB.Xd() ^ ((446389326 ^ 1107478626) ^ 1486469271));
        int[] iArr2 = new int["C8228:+-15-\t)7'$4(-+\u0010 --\n\u001c)* '%".length()];
        QB qb2 = new QB("C8228:+-15-\t)7'$4(-+\u0010 --\n\u001c)* '%");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i3 + xuXd2.CK(iKK2));
            i3++;
        }
        String str2 = new String(iArr2, 0, i3);
        String string = jSONObject.toString();
        Class<?> cls2 = Class.forName(C1593ug.zd("|k3qw", (short) (OY.Xd() ^ (1156357270 ^ 1156357744)), (short) (OY.Xd() ^ (263424928 ^ 263434191))));
        Class<?>[] clsArr = new Class[1863845622 ^ 1863845621];
        short sXd3 = (short) (Od.Xd() ^ (628991975 ^ (-628981829)));
        int[] iArr3 = new int["5\"gz}".length()];
        QB qb3 = new QB("5\"gz}");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(sXd3 + sXd3 + i4 + xuXd3.CK(iKK3));
            i4++;
        }
        clsArr[0] = Class.forName(new String(iArr3, 0, i4));
        clsArr[1] = Class.forName(C1561oA.Kd("\u007fw\u000eyG\u0007|\u000b\u0005Lr\u0015\u0014\f\u0012\f", (short) (OY.Xd() ^ (1358061949 ^ 1358044490))));
        clsArr[(1131956884 ^ 2008993787) ^ 885425517] = Class.forName(Wg.Zd("%,E?\u0010OXbc7d\u0001\u0017\r\u0016\u001e", (short) (C1580rY.Xd() ^ (1115668092 ^ (-1115679200))), (short) (C1580rY.Xd() ^ (266116064 ^ (-266126689)))));
        Object[] objArr = new Object[1155039494 ^ 1155039493];
        objArr[0] = bf;
        objArr[1] = str2;
        objArr[(619452257 ^ 844097204) ^ 379843031] = string;
        Constructor<?> constructor = cls2.getConstructor(clsArr);
        try {
            constructor.setAccessible(true);
            return (C1549kp) constructor.newInstance(objArr);
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public void vK(String str) {
        String strWd = Jg.Wd("9@\u001eaR", (short) (C1607wl.Xd() ^ ((2014829260 ^ 834668647) ^ 1238888751)), (short) (C1607wl.Xd() ^ (C1499aX.Xd() ^ (-1134249025))));
        String strXd = ZO.xd("QC", (short) (OY.Xd() ^ (C1580rY.Xd() ^ (-831065263))), (short) (OY.Xd() ^ (1597232118 ^ 1597224384)));
        try {
            Class<?> cls = Class.forName(strWd);
            Field field = 0 != 0 ? cls.getField(strXd) : cls.getDeclaredField(strXd);
            field.setAccessible(true);
            field.set(this, str);
        } catch (Throwable th) {
        }
    }
}
