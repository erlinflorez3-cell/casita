package yg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class Xo implements Enumeration {
    public Iterator<String> Kd;
    public HashSet<String> Xd;

    public Xo() {
        kK(C1561oA.Xd("\u001b\u001e\u001c\u0011]\u001e\u0016&a)#\u001f/", (short) (C1580rY.Xd() ^ ((583424393 ^ 1911882340) ^ (-1395869285)))));
    }

    public Xo(String str) {
        kK(str);
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.Kd.hasNext();
    }

    public void kK(String str) {
        this.Xd = new HashSet<>();
        try {
            FileReader fileReader = new FileReader(new File(str));
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        String[] strArrSplit = line.split(Wg.vd("%;u", (short) (FB.Xd() ^ ((1577193334 ^ 110612897) ^ 1486207298))));
                        if (strArrSplit.length >= ((1675913770 ^ 1466281351) ^ 880920485)) {
                            int i2 = 1884745232 ^ 1884745239;
                            if (strArrSplit[i2].startsWith(Qg.kd("\u001f", (short) (OY.Xd() ^ ((2055194246 ^ 20785324) ^ 2067985381)), (short) (OY.Xd() ^ ((750506874 ^ 1304295137) ^ 1627791289))))) {
                                this.Xd.add(strArrSplit[i2].substring(1));
                            }
                        }
                    } finally {
                    }
                }
                bufferedReader.close();
                fileReader.close();
            } finally {
            }
        } catch (Throwable th) {
        }
        this.Kd = this.Xd.iterator();
    }

    @Override // java.util.Enumeration
    /* JADX INFO: renamed from: qK, reason: merged with bridge method [inline-methods] */
    public String nextElement() {
        return this.Kd.next();
    }
}
