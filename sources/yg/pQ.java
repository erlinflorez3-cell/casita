package yg;

import com.facebook.common.callercontext.ContextChain;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class pQ {
    public static byte[] Kd = null;
    public static Map<WF, Integer> Xd = null;

    static {
        short sXd = (short) (C1499aX.Xd() ^ (459754746 ^ (-459759736)));
        short sXd2 = (short) (C1499aX.Xd() ^ ((1804157288 ^ 844092866) ^ (-1506194874)));
        int[] iArr = new int["0!^D\u001c".length()];
        QB qb = new QB("0!^D\u001c");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(ZO.xd("oe", (short) (C1499aX.Xd() ^ (Od.Xd() ^ (-1207818369))), (short) (C1499aX.Xd() ^ (C1499aX.Xd() ^ (757717913 ^ 1857208924)))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr);
            String strUd = C1626yg.Ud("mc*\u00059", (short) (C1580rY.Xd() ^ (1439043691 ^ (-1439055336))), (short) (C1580rY.Xd() ^ (1616977515 ^ (-1616979483))));
            String strWd = Ig.wd("\u0007Y", (short) (C1499aX.Xd() ^ ((1289454971 ^ 1658657942) ^ (-772198311))));
            try {
                Class<?> cls = Class.forName(strUd);
                Field field = 0 != 0 ? cls.getField(strWd) : cls.getDeclaredField(strWd);
                field.setAccessible(true);
                field.set(null, bArr);
            } catch (Throwable th) {
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static byte[] Qx() {
        byte[] bArr = new byte[(126418973 ^ 1389055705) ^ 1430408908];
        // fill-array-data instruction
        bArr[0] = -7;
        bArr[1] = -3;
        bArr[2] = -74;
        bArr[3] = -65;
        bArr[4] = -5;
        bArr[5] = -17;
        bArr[6] = -36;
        bArr[7] = 63;
        return bArr;
    }

    public static String Yd(String str) {
        String str2 = str.split(EO.Od(ContextChain.TAG_INFRA, (short) (C1607wl.Xd() ^ (C1580rY.Xd() ^ (-831090251)))))[r1.length - 1];
        if (!str2.startsWith(C1561oA.Qd("d`[WaK", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ (248714556 ^ 1296567637)))))) {
            return str2;
        }
        return str2.substring(FB.Xd() ^ 1609527093, str2.length() - 4);
    }

    public static void od() throws Exception {
        if (Math.random() * Double.longBitsToDouble(7219815958918596954L ^ 2623611064210295130L) < 0.0d) {
            switch (YX.Kd) {
                case 1:
                    C1603vu.Xd += C1603vu.Xd;
                case 2:
                    C1603vu.Xd += C1603vu.Xd;
                case 3:
                    C1603vu.Xd -= C1603vu.Xd * Float.intBitsToFloat(ZN.Xd() ^ (-209043728));
                    break;
            }
        }
        CX.ud();
        if (ZO.lX(Ig.wd("`8Mtp\u0005XY\u00026", (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (-1849966413)))))) {
            C1587uA.Kd = "";
            C1526hF.Xd = 0;
            C1603vu.Xd = 0.0f;
        }
        ud();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0467 A[Catch: all -> 0x051b, TRY_LEAVE, TryCatch #24 {all -> 0x051b, blocks: (B:93:0x03fa, B:96:0x0439, B:98:0x0443, B:99:0x045e, B:101:0x0467), top: B:274:0x03fa }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x05b9 A[LOOP:6: B:139:0x05b3->B:141:0x05b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.reflect.Method] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ud() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.pQ.ud():void");
    }
}
