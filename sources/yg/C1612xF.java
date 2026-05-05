package yg;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.SecureRandom;

/* JADX INFO: renamed from: yg.xF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1612xF extends RY {
    private static int Qd = 0;
    private static int od = 0;
    private static int ud = 0;
    private static final SecureRandom wd;
    private static boolean yd = false;

    static {
        if (C1544kF.Kd == null) {
            YX.Kd = 0;
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.Qd("UK_I\u0015YJGXTJTX\f0A>OK=)7C8B?", (short) (Od.Xd() ^ (C1580rY.Xd() ^ 831066396)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            wd = (SecureRandom) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public C1612xF() {
        String str = C1544kF.Kd;
        if (str != null) {
            JX.Kd = str.hashCode();
        }
    }

    private boolean vd() {
        switch (C1617xo.Xd % 8) {
            case 0:
                Ug.vd(C1623yX.Kd);
                break;
            case 1:
                Ig.qd(C1544kF.Kd);
            default:
                Qg.od(0);
                break;
        }
        return GF.ud();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // yg.RY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void FK() {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.C1612xF.FK():void");
    }
}
