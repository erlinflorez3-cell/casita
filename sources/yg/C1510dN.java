package yg;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: yg.dN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1510dN {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int Kd(java.io.RandomAccessFile r7, yg.WF[] r8, int[][] r9, long r10) throws java.io.IOException {
        /*
            int r0 = r8.length
            int[] r2 = new int[r0]
            r5 = 0
        L5:
            int r3 = yg.FB.Xd()
            r1 = 2075316390(0x7bb2d0a6, float:1.8569215E36)
            r0 = -610123670(0xffffffffdba2406a, float:-9.133954E16)
            r1 = r1 ^ r0
            r3 = r3 ^ r1
            int r0 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r0 >= 0) goto L1b
            int r4 = r7.read()
            if (r4 != r3) goto L1c
        L1b:
            return r3
        L1c:
            r3 = 0
        L1d:
            int r0 = r8.length
            if (r3 >= r0) goto L4d
            r0 = r8[r3]
            byte[] r1 = r0.Xd
            r0 = r2[r3]
            r0 = r1[r0]
            if (r4 != r0) goto L3a
            r0 = r2[r3]
            int r0 = r0 + 1
            r2[r3] = r0
            r1 = r2[r3]
            r0 = r8[r3]
            byte[] r0 = r0.Xd
            int r0 = r0.length
            if (r1 != r0) goto L4a
            return r3
        L3a:
            r0 = r2[r3]
            if (r0 == 0) goto L4a
            r1 = r9[r3]
            r0 = r2[r3]
            int r0 = r0 + (-1)
            r0 = r1[r0]
            r2[r3] = r0
            int r3 = r3 + (-1)
        L4a:
            int r3 = r3 + 1
            goto L1d
        L4d:
            r0 = 1
            long r5 = r5 + r0
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.C1510dN.Kd(java.io.RandomAccessFile, yg.WF[], int[][], long):int");
    }

    public static int Xd(long j2, WF[] wfArr, int[][] iArr, long j3) throws Throwable {
        int[] iArr2 = new int[wfArr.length];
        int i2 = (int) j3;
        int iXd = C1499aX.Xd() ^ (1734211070 ^ 616993517);
        try {
            for (byte b2 : ZY.Xd(j2, i2)) {
                int i3 = 0;
                while (i3 < wfArr.length) {
                    if (b2 == wfArr[i3].Xd[iArr2[i3]]) {
                        iArr2[i3] = iArr2[i3] + 1;
                        if (iArr2[i3] == wfArr[i3].Xd.length) {
                            return i3;
                        }
                    } else if (iArr2[i3] != 0) {
                        iArr2[i3] = iArr[i3][iArr2[i3] - 1];
                        i3--;
                    }
                    i3++;
                }
            }
            return iXd;
        } catch (IOException e2) {
            return iXd;
        }
    }

    public static Set<Integer> Yd(RandomAccessFile randomAccessFile, WF[] wfArr, int[][] iArr, long j2) throws IOException {
        HashSet hashSet = new HashSet();
        int[] iArr2 = new int[wfArr.length];
        for (long j3 = 0; j3 < j2; j3++) {
            int i2 = randomAccessFile.read();
            int i3 = 0;
            while (i3 < wfArr.length) {
                if (i2 == wfArr[i3].Xd[iArr2[i3]]) {
                    iArr2[i3] = iArr2[i3] + 1;
                    if (iArr2[i3] == wfArr[i3].Xd.length) {
                        hashSet.add(Integer.valueOf(i3));
                        iArr2[i3] = 0;
                    }
                } else if (iArr2[i3] != 0) {
                    iArr2[i3] = iArr[i3][iArr2[i3] - 1];
                    i3--;
                }
                i3++;
            }
        }
        return hashSet;
    }

    public static int[][] ud(WF[] wfArr) {
        int[][] iArr = new int[wfArr.length][];
        for (int i2 = 0; i2 < wfArr.length; i2++) {
            iArr[i2] = new int[wfArr[i2].Xd.length];
            byte b2 = 0;
            for (int i3 = 1; i3 < wfArr[i2].Xd.length; i3++) {
                b2 = wfArr[i2].Xd[i3] == wfArr[i2].Xd[b2] ? (byte) (b2 + 1) : (byte) 0;
                iArr[i2][i3] = b2;
            }
        }
        return iArr;
    }
}
