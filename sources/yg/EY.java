package yg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EY {
    public static long[] Xd = null;

    public static List<Integer> Kd() {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = new File(Jg.Wd("|\u0010h0Zx", (short) (C1633zX.Xd() ^ (789253850 ^ (-789280000))), (short) (C1633zX.Xd() ^ (C1607wl.Xd() ^ (257906041 ^ (-1629182035)))))).listFiles();
        if (fileArrListFiles == null) {
            return arrayList;
        }
        for (File file : fileArrListFiles) {
            try {
                arrayList.add(Integer.valueOf(Integer.decode(file.getName()).intValue()));
            } catch (Exception e2) {
            }
        }
        return arrayList;
    }

    public static List<C1570qB> Yd() throws IOException {
        int iXd = ZN.Xd() ^ (-864695626);
        File file = new File(ZO.xd("j):#'DB0+\u0001!l@'Y", (short) (Od.Xd() ^ ((158419553 ^ 1039840702) ^ (-881582039))), (short) (Od.Xd() ^ iXd)));
        ArrayList arrayList = new ArrayList();
        FileReader fileReader = new FileReader(file);
        try {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        fileReader.close();
                        return arrayList;
                    }
                    C1570qB c1570qB = new C1570qB(line);
                    if (!C1626yg.wd(c1570qB.Kd, c1570qB.Xd)) {
                        arrayList.add(c1570qB);
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                fileReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean ud() {
        Object obj;
        short sXd = (short) (ZN.Xd() ^ (C1607wl.Xd() ^ (1525868570 ^ 884394769)));
        short sXd2 = (short) (ZN.Xd() ^ (343211988 ^ 343182930));
        int[] iArr = new int["!\u001e \u000f".length()];
        QB qb = new QB("!\u001e \u000f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK) + sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        String strUd = C1561oA.ud("\u007fl2{[", (short) (C1580rY.Xd() ^ ((2060909195 ^ 1154140741) ^ (-1042031419))));
        String strYd = C1561oA.yd("}\u0016", (short) (OY.Xd() ^ (1516849898 ^ 1516853375)));
        try {
            Class<?> cls = Class.forName(strUd);
            Field field = 0 != 0 ? cls.getField(strYd) : cls.getDeclaredField(strYd);
            field.setAccessible(true);
            obj = field.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        return str.equals(obj);
    }
}
