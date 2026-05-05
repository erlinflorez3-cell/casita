package yg;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class HN extends ByteArrayInputStream {
    private boolean Kd;
    private boolean Xd;

    public HN(byte[] bArr, boolean z2, boolean z3) {
        super(bArr);
        this.Kd = false;
        this.Xd = false;
        this.Xd = z2;
        this.Kd = z3;
    }

    private long Kd(long j2) {
        int i2 = (1815817300 ^ 948379364) ^ 1421619856;
        return (((long) Xd((int) j2)) << i2) | ((-1) - (((-1) - ((long) Xd((int) (j2 >>> i2)))) | ((-1) - (8179389991423301923L ^ (-8179389991423301924L)))));
    }

    private int Xd(int i2) {
        int iYd = Yd((short) i2) << 16;
        int iYd2 = (-1) - (((-1) - Yd((short) (i2 >>> 16))) | ((-1) - ((727967132 ^ 109812225) ^ 770211938)));
        return (iYd + iYd2) - (iYd & iYd2);
    }

    private short Yd(short s2) {
        int i2 = s2 << 8;
        int i3 = s2 >>> 8;
        int i4 = (i3 + 255) - (i3 | 255);
        return (short) ((i2 + i4) - (i2 & i4));
    }

    public int Kd() throws IOException {
        int i2 = read();
        int i3 = i2 << 0;
        int i4 = read() << 8;
        int i5 = (-1) - (((-1) - ((-1) - (((-1) - ((i3 + i4) - (i3 & i4))) & ((-1) - (read() << 16))))) & ((-1) - (read() << 24)));
        return this.Kd ? Xd(i5) : i5;
    }

    public short Qd() throws IOException {
        int i2 = read() << 0;
        int i3 = read() << 8;
        short s2 = (short) ((i2 + i3) - (i2 & i3));
        return this.Kd ? Yd(s2) : s2;
    }

    public byte Xd() throws IOException {
        return (byte) read();
    }

    public long Yd() throws IOException {
        return this.Xd ? ud() : ((long) Kd()) & (C1580rY.Kd() ^ (4979103106167981015L ^ 5142478521828300745L));
    }

    public long ud() throws IOException {
        int i2 = (-1) - (((-1) - (read() << 0)) & ((-1) - (read() << 8)));
        int i3 = read() << 16;
        int i4 = (i2 + i3) - (i2 & i3);
        int i5 = read() << 24;
        long j2 = ((long) ((((-1) - (((-1) - (read() << 0)) & ((-1) - (read() << 8)))) | (read() << 16)) | (read() << 24))) << (818615119 ^ 818615151);
        long j3 = (i4 + i5) - (i4 & i5);
        long jKd = C1499aX.Kd() ^ 5572127254833227539L;
        long j4 = (-1) - (((-1) - j2) & ((-1) - ((j3 + jKd) - (j3 | jKd))));
        return this.Kd ? Kd(j4) : j4;
    }

    public boolean wd() {
        return this.Xd;
    }
}
