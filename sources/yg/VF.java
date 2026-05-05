package yg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class VF extends qX {
    private boolean wd;
    private boolean yd;

    public VF(File file) throws FileNotFoundException {
        super(file);
        this.wd = false;
        this.yd = false;
    }

    public VF(File file, int i2) throws FileNotFoundException {
        super(file, i2);
        this.wd = false;
        this.yd = false;
    }

    private long Kd(long j2) {
        long jXd = Xd((int) j2);
        int iXd = FB.Xd() ^ (1015206357 ^ 1668136646);
        long j3 = jXd << iXd;
        long jXd2 = Xd((int) (j2 >>> iXd));
        long jKd = C1633zX.Kd() ^ (-5236203346832825292L);
        return j3 | ((jXd2 + jKd) - (jXd2 | jKd));
    }

    private int Xd(int i2) {
        int iYd = Yd((short) i2) << 16;
        int iYd2 = Yd((short) (i2 >>> 16)) & (C1580rY.Xd() ^ (-831122402));
        return (iYd + iYd2) - (iYd & iYd2);
    }

    private short Yd(short s2) {
        int i2 = s2 << 8;
        int i3 = s2 >>> 8;
        int i4 = (i3 + 255) - (i3 | 255);
        return (short) ((i2 + i4) - (i2 & i4));
    }

    public void BX(boolean z2) {
        this.wd = z2;
    }

    public long Ud() throws IOException {
        int i2 = ((-1) - (((-1) - ((-1) - (((-1) - (read() << 0)) & ((-1) - (read() << 8))))) & ((-1) - (read() << 16)))) | (read() << 24);
        long jXd = (((long) ((-1) - (((-1) - ((-1) - (((-1) - ((-1) - (((-1) - (read() << 0)) & ((-1) - (read() << 8))))) & ((-1) - (read() << 16))))) & ((-1) - (read() << 24))))) << (ZN.Xd() ^ (16006563 ^ 863896435))) | (((long) i2) & (OY.Kd() ^ (6333999757229843575L ^ (-9101984198204550304L))));
        return this.wd ? Kd(jXd) : jXd;
    }

    public byte Wd() throws IOException {
        return (byte) read();
    }

    public short YX() throws IOException {
        int i2 = read() << 0;
        int i3 = read() << 8;
        short s2 = (short) ((i2 + i3) - (i2 & i3));
        return this.wd ? Yd(s2) : s2;
    }

    public long Zd() throws IOException {
        return this.yd ? Ud() : (-1) - (((-1) - ((long) xd())) | ((-1) - ((155593024779083333L ^ 439823806657837017L) ^ 302399108643690083L)));
    }

    public void lX(boolean z2) {
        this.yd = z2;
    }

    public boolean oX() {
        return this.yd;
    }

    public byte[] pX(int i2) throws IOException {
        byte[] bArr = new byte[i2];
        int i3 = read(bArr);
        if (i3 == i2) {
            return bArr;
        }
        StringBuilder sbAppend = new StringBuilder().append(Wg.vd("\u001aNG=<N@@l", (short) (OY.Xd() ^ (2041978200 ^ 2041976727)))).append(i2);
        int iXd = C1499aX.Xd() ^ (1439169872 ^ (-375172160));
        throw new IOException(sbAppend.append(Qg.kd("-n\u0005~n{3&lsw\"", (short) (ZN.Xd() ^ ((1719468863 ^ 2014549418) ^ 510568212)), (short) (ZN.Xd() ^ iXd))).append(i3).toString());
    }

    public boolean uX() {
        return this.wd;
    }

    public int xd() throws IOException {
        int i2 = (-1) - (((-1) - (read() << 0)) & ((-1) - (read() << 8)));
        int i3 = read() << 16;
        int i4 = ((i2 + i3) - (i2 & i3)) | (read() << 24);
        return this.wd ? Xd(i4) : i4;
    }
}
