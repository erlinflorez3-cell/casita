package yg;

import android.os.Build;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class EK {
    private static final int Od = 432;
    private static final int Qd = 388;
    private static final int Yd = 128;
    private static final int od = 380;
    public static final int qd = 456;
    private static final int ud = 372;
    private static final int vd = 424;
    private static final int wd = 416;
    private static final int yd = 416;
    public final C1525gu Kd;
    public final String Xd;

    public EK(byte[] bArr, boolean z2, boolean z3) throws IOException {
        HN hn = new HN(bArr, z2, z3);
        if (Build.VERSION.SDK_INT == (FB.Xd() ^ (1491668128 ^ 117859206)) || (Build.VERSION.SDK_INT == (C1607wl.Xd() ^ (768720987 ^ 1133892503)) && !z2)) {
            byte[] bArr2 = new byte[Od.Xd() ^ 1207801045];
            hn.read(bArr2);
            this.Xd = Kd(bArr2);
            this.Kd = null;
            return;
        }
        hn.read(new byte[Xd(z2)]);
        byte[] bArr3 = new byte[z2 ? Od.Xd() ^ (1897694483 ^ 920719710) : Od.Xd() ^ 1207800921];
        hn.read(bArr3);
        this.Kd = new C1525gu(bArr3, z2, z3);
        this.Xd = null;
    }

    private String Kd(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        for (int i2 = 0; i2 < (C1633zX.Xd() ^ (273651503 ^ (-1679750044))); i2++) {
            byte b2 = bArr[i2];
            if (z2) {
                if (b2 != 0) {
                    return null;
                }
            } else if (b2 == 0) {
                z2 = true;
            } else {
                if (!Yd(b2)) {
                    return null;
                }
                sb.append((int) b2);
            }
        }
        if (z2) {
            return sb.toString();
        }
        return null;
    }

    private static int Xd(boolean z2) {
        int iXd = ZN.Xd() ^ (1395581491 ^ 1621417180);
        int i2 = (1687469459 ^ 2109157474) ^ 421760464;
        if (!z2) {
            return Build.VERSION.SDK_INT >= i2 ? FB.Xd() ^ (346729982 ^ 1262863281) : Build.VERSION.SDK_INT >= iXd ? 1265663706 ^ 1265663838 : 494843356 ^ 494843048;
        }
        int i3 = Build.VERSION.SDK_INT;
        int iXd2 = C1633zX.Xd() ^ (750791494 ^ (-1485917907));
        return i3 >= i2 ? iXd2 : Build.VERSION.SDK_INT >= iXd ? (419813927 ^ 730990773) ^ 848810786 : Build.VERSION.SDK_INT >= ((326874086 ^ 867280524) ^ 550114672) ? iXd2 : OY.Xd() ^ 69929280;
    }

    private static boolean Yd(byte b2) {
        return b2 > ((754936178 ^ 658934022) ^ 196730987) && b2 != ((729128338 ^ 1568034717) ^ 1979961968);
    }
}
