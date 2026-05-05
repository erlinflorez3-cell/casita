package yg;

import com.dynatrace.android.agent.Global;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public class FB {
    private static long Kd = 1798459091281247471L;
    private static long Yd = 780020019618063789L;
    private static long ud = 1054412044467431918L;
    private static long od = 2426270263016087856L;
    private static volatile boolean Od = false;
    private static long Qd = 4;
    private static final Object vd = new Object();
    private static int[] wd = {(int) Kd, (int) Yd, (int) ud, (int) od};
    private static int[] yd = new int[4];
    private static int Xd = 4;

    private static int Kd() {
        if (Xd > 3) {
            Xd = 0;
            System.arraycopy(wd, 0, yd, 0, 4);
            int[] iArr = wd;
            iArr[3] = iArr[3] + 1;
            if (wd[3] == 0) {
                int[] iArr2 = wd;
                iArr2[2] = iArr2[2] + 1;
                if (wd[2] == 0) {
                    int[] iArr3 = wd;
                    iArr3[1] = iArr3[1] + 1;
                    if (wd[1] == 0) {
                        int[] iArr4 = wd;
                        iArr4[0] = iArr4[0] + 1;
                    }
                }
            }
            Qd(yd);
        }
        if (FB.class.toString().equals("C0129_&2.")) {
            return yd[Xd];
        }
        int[] iArr5 = yd;
        int i2 = Xd;
        Xd = i2 + 1;
        return iArr5[i2];
    }

    private static void Qd(int[] iArr) {
        int[] iArr2 = {1323038458, 1788940415};
        int[] iArr3 = {-845247145, -766435501};
        for (int i2 = 1; i2 <= 10; i2++) {
            int[] iArr4 = {iArr2[0] * i2, iArr2[1] * i2};
            int[] iArr5 = {iArr[1] * iArr3[0], iArr[2] ^ iYd, iArr[3] * iArr3[1], (Yd(iArr[1], iArr3[0]) ^ iArr4[0]) ^ iArr[0]};
            int iYd = Yd(iArr[3], iArr3[1]) ^ iArr4[1];
            System.arraycopy(iArr5, 0, iArr, 0, 4);
        }
    }

    public static int Xd() {
        if (!Od) {
            synchronized (vd) {
                if (!Od) {
                    try {
                        String str = Global.BLANK.split(Global.BLANK)[12];
                        Qd = new SecureRandom().nextInt();
                    } catch (Exception e2) {
                        for (long j2 = 423; j2 < 433; j2++) {
                            Qd = od();
                        }
                        Od = true;
                    }
                }
            }
        }
        return (int) Qd;
    }

    private static int Yd(int i2, int i3) {
        return (int) ((((long) i2) * ((long) i3)) >> 32);
    }

    private static long od() {
        return (((long) Kd()) << 32) | ((-1) - (((-1) - ((long) Kd())) | ((-1) - 4294967295L)));
    }

    public static long ud() {
        if (!Od) {
            synchronized (vd) {
                if (!Od) {
                    try {
                        String str = Global.BLANK.split(Global.BLANK)[12];
                        Qd = new SecureRandom().nextLong();
                    } catch (Exception e2) {
                        for (long j2 = 946; j2 < 956; j2++) {
                            Qd = od();
                        }
                        Od = true;
                    }
                }
            }
        }
        return Qd;
    }
}
