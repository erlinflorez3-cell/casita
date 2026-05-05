package yg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public class qX extends RandomAccessFile {
    private long Kd;
    private int Xd;
    private long Yd;
    private byte[] od;
    private long ud;

    public qX(File file) throws FileNotFoundException {
        this(file, C1633zX.Xd() ^ (603175457 ^ (-1470299670)));
    }

    public qX(File file, int i2) throws FileNotFoundException {
        super(file, C1561oA.yd("O", (short) (FB.Xd() ^ (1864954026 ^ 1864939913))));
        this.Xd = -1;
        if (i2 > 0) {
            this.od = new byte[i2];
            return;
        }
        short sXd = (short) (FB.Xd() ^ (155273988 ^ 155284807));
        int[] iArr = new int["~3%&&4b7.@,g\u0005\u0007j{".length()];
        QB qb = new QB("~3%&&4b7.@,g\u0005\u0007j{");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
            i3++;
        }
        throw new IllegalArgumentException(new String(iArr, 0, i3));
    }

    private void Xd() throws IOException {
        seek(this.ud);
        this.Xd = super.read(this.od, 0, this.od.length);
        this.Kd = this.ud;
        this.Yd = 0L;
    }

    public boolean Vd() {
        return this.od != null;
    }

    @Override // java.io.RandomAccessFile, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.od = null;
    }

    @Override // java.io.RandomAccessFile
    public long getFilePointer() throws IOException {
        return this.ud;
    }

    @Override // java.io.RandomAccessFile
    public int read() throws IOException {
        if (Vd()) {
            if (this.Yd < 0 || this.Yd >= this.Xd || this.ud < this.Kd || this.ud >= this.Kd + ((long) this.Xd)) {
                Xd();
            }
            if (this.Xd <= 0) {
                return -1;
            }
            int i2 = this.od[(int) this.Yd] & 255;
            this.ud++;
            this.Yd++;
            return i2;
        }
        short sXd = (short) (ZN.Xd() ^ (Od.Xd() ^ 1207799482));
        short sXd2 = (short) (ZN.Xd() ^ ((1872328004 ^ 874423045) ^ 1535633817));
        int[] iArr = new int["\u0010 .%10\u0005(),;<\u0010482m8Cp5?CH;;".length()];
        QB qb = new QB("\u0010 .%10\u0005(),;<\u0010482m8Cp5?CH;;");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) + sXd2);
            i3++;
        }
        throw new IOException(new String(iArr, 0, i3));
    }

    @Override // java.io.RandomAccessFile
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.RandomAccessFile
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (!Vd()) {
            throw new IOException(Jg.Wd("q(\u001f~qU\u0012\u001e\u00062.\u0015Q^K(L~1GxkUC\u001f\u0004", (short) (C1580rY.Xd() ^ (FB.Xd() ^ (-1609517586))), (short) (C1580rY.Xd() ^ ((770261842 ^ 700730682) ^ (-70071363)))));
        }
        if (this.Xd == (FB.Xd() ^ (-1609527092))) {
            Xd();
        }
        if (i3 > this.Xd) {
            seek(this.ud);
            int i4 = super.read(bArr, i2, i3);
            this.ud += (long) i4;
            return i4;
        }
        if (this.Yd < 0 || (this.Yd + ((long) i3)) - 1 >= this.Xd || this.ud < this.Kd || (this.ud + ((long) i3)) - 1 >= this.Kd + ((long) this.Xd)) {
            Xd();
        }
        if (this.Xd <= 0) {
            return -1;
        }
        System.arraycopy(this.od, (int) this.Yd, bArr, i2, i3);
        this.ud += (long) i3;
        this.Yd += (long) i3;
        return i3;
    }

    @Override // java.io.RandomAccessFile
    public void seek(long j2) throws IOException {
        super.seek(j2);
        this.ud = j2;
        this.Yd = j2 - this.Kd;
    }
}
