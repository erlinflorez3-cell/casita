package yg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: renamed from: yg.gF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1520gF extends C1504bX {
    private final long Od;

    public C1520gF(C1570qB c1570qB) throws IOException {
        super(c1570qB.Qd);
        this.Od = c1570qB.Kd;
    }

    public static C1570qB Xd(String str) throws IOException {
        C1570qB c1570qB;
        short sXd = (short) (OY.Xd() ^ (ZN.Xd() ^ 864701463));
        int[] iArr = new int[">\u0001\u0004\u0002vC\t{\u0004~H\b|\r\u0011".length()];
        QB qb = new QB(">\u0001\u0004\u0002vC\t{\u0004~H\b|\r\u0011");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        FileReader fileReader = new FileReader(new File(new String(iArr, 0, i2)));
        try {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        fileReader.close();
                        throw new IOException(Xg.qd("\u007f\u001c%)##_51b*.4+g27,32m8>7A", (short) (C1607wl.Xd() ^ ((1372852450 ^ 1195722931) ^ 378612193)), (short) (C1607wl.Xd() ^ ((196748668 ^ 2141620504) ^ 1948036080))));
                    }
                    try {
                        c1570qB = new C1570qB(line);
                    } catch (Throwable th) {
                    }
                    if (new File(c1570qB.Qd).getName().equals(str) && (c1570qB.wd || (c1570qB.wd && c1570qB.yd))) {
                        break;
                    }
                } finally {
                }
            }
            bufferedReader.close();
            fileReader.close();
            return c1570qB;
        } catch (Throwable th2) {
            try {
                fileReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public long dY(String str) throws IOException {
        long jZK = ZK(str);
        if (jZK == 0) {
            return 0L;
        }
        return this.Od + jZK;
    }
}
