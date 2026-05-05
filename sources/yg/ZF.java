package yg;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class ZF {
    public static final int ud = 3;
    private boolean Kd;
    private RandomAccessFile Xd;
    private boolean Yd;

    private int Kd(int i2) {
        return (yd((short) i2) << 16) | (yd((short) (i2 >>> 16)) & ((1428472537 ^ 2113841316) ^ 685413762));
    }

    private short Qd() throws IOException {
        short s2 = this.Xd.readShort();
        return !this.Yd ? yd(s2) : s2;
    }

    private int Xd() throws IOException {
        int i2 = this.Xd.readInt();
        return !this.Yd ? Kd(i2) : i2;
    }

    private long Yd() throws IOException {
        long j2 = this.Xd.readLong();
        return !this.Yd ? od(j2) : j2;
    }

    private long od(long j2) {
        int i2 = (1202867430 ^ 930224701) ^ 1891653371;
        return (((long) Kd((int) j2)) << i2) | ((-1) - (((-1) - ((long) Kd((int) (j2 >>> i2)))) | ((-1) - (C1633zX.Kd() ^ (6595410843920182672L ^ (-1381795864241092188L))))));
    }

    private long ud() throws IOException {
        return this.Kd ? Yd() : Xd();
    }

    private byte[] vd(int i2) throws IOException {
        byte[] bArr = new byte[i2];
        this.Xd.read(bArr);
        return bArr;
    }

    private boolean wd() throws IOException {
        int iXd = OY.Xd() ^ 69929196;
        byte[] bArr = new byte[iXd];
        return this.Xd.read(bArr) == iXd && bArr[0] == (ZN.Xd() ^ 864697999) && bArr[1] == (638219023 ^ 638219082) && bArr[C1499aX.Xd() ^ (563583131 ^ (-1645019019))] == (FB.Xd() ^ 1609527167) && bArr[ZN.Xd() ^ (1743139396 ^ 1416367287)] == (Od.Xd() ^ (570127656 ^ 1711726907));
    }

    private short yd(short s2) {
        int i2 = s2 << 8;
        int i3 = s2 >>> 8;
        int i4 = (i3 + 255) - (i3 | 255);
        return (short) ((i2 + i4) - (i2 & i4));
    }

    public int gK(File file, WF[] wfArr) {
        qX qXVar;
        try {
            try {
                qXVar = new qX(file);
            } catch (Throwable th) {
            }
        } catch (Throwable th2) {
        }
        try {
            this.Xd = qXVar;
            if (!wd()) {
                qXVar.close();
                this.Xd = null;
                return -1;
            }
            int i2 = (2070120740 ^ 185510033) ^ 1886200247;
            this.Kd = this.Xd.read() == i2;
            this.Yd = this.Xd.read() == i2;
            if (this.Xd.read() != 1) {
                qXVar.close();
                this.Xd = null;
                return -1;
            }
            this.Xd.read();
            vd((913527220 ^ 398732012) ^ 565672784);
            Qd();
            Qd();
            vd((1129890448 ^ 1216346976) ^ 187120116);
            ud();
            ud();
            long jUd = ud();
            Xd();
            Qd();
            Qd();
            Qd();
            Qd();
            short sQd = Qd();
            short sQd2 = Qd();
            this.Xd.seek(jUd);
            TreeMap treeMap = new TreeMap();
            for (int i3 = 0; i3 < sQd; i3++) {
                Xd();
                int iXd = Xd();
                ud();
                ud();
                long jUd2 = ud();
                long jUd3 = ud();
                Xd();
                Xd();
                ud();
                ud();
                if (iXd == ((1101278474 ^ 1403103712) ^ 302351593) && i3 != sQd2) {
                    treeMap.put(Long.valueOf(jUd2), Long.valueOf(jUd3));
                }
            }
            int[][] iArrUd = C1510dN.ud(wfArr);
            for (Map.Entry entry : treeMap.entrySet()) {
                long filePointer = this.Xd.getFilePointer();
                this.Xd.seek(((Long) entry.getKey()).longValue());
                try {
                    int iKd = C1510dN.Kd(this.Xd, wfArr, iArrUd, ((Long) entry.getValue()).longValue());
                    if (iKd != ((53026721 ^ 754771805) ^ (-802552061))) {
                        qXVar.close();
                        this.Xd = null;
                        return iKd;
                    }
                    this.Xd.seek(filePointer);
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            qXVar.close();
            this.Xd = null;
            return (436053356 ^ 630714377) ^ (-1013601638);
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            qXVar.close();
        } catch (Throwable th5) {
            th.addSuppressed(th5);
        }
        throw th;
    }
}
