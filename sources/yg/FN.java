package yg;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public final class FN {
    public static final int Kd = 1896449818;
    private static final int Xd = 32;
    public static final int Yd = -262969152;
    private static final long od = 3617552046287187010L;
    private static final long ud = 2334950737559900225L;

    private FN() {
    }

    public static Pair<ByteBuffer, Long> Kd(RandomAccessFile randomAccessFile) throws C1539jX, IOException {
        Pair<ByteBuffer, Long> pairQd = Wg.Qd(randomAccessFile);
        if (pairQd != null) {
            return pairQd;
        }
        throw new C1539jX(EO.Od("sExDuOdN\u001cK\u001a\u000301VM_(?.<\n]O).\u0005\u001c\u000f!\u0010yY(.\u0015!,*\u0015\u0019\u0014:Mk i+lZ?V88l_bQ*$z\u0018", (short) (FB.Xd() ^ ((1604494201 ^ 635861781) ^ 2051337387))));
    }

    public static long Xd(ByteBuffer byteBuffer, long j2) throws C1539jX {
        long jYd = ZO.Yd(byteBuffer);
        if (jYd <= j2) {
            if (jYd + hg.ud(byteBuffer) == j2) {
                return jYd;
            }
            throw new C1539jX(ZO.xd("t\u000b-\u0018\u001e!i}$Yu`FOj\u00070O_y\u0013\u0001\u007f|,R~cB\u0016Z1GZ-n/JY\b9Z\u0017lO`\u0014FN\u001em2rtq?OR0Oy:{o$W.\b|u%9&Y|}a", (short) (C1499aX.Xd() ^ ((133817614 ^ 1281388054) ^ (-1268381545))), (short) (C1499aX.Xd() ^ (C1607wl.Xd() ^ (-1849972089)))));
        }
        throw new C1539jX(C1626yg.Ud("L\u0017NK3j..]_~\u0007jbU<2\u000bX!Kv.TFu\u0018Y\u001bEA7Z'R:T\u000e2`K\u0014U", (short) (C1633zX.Xd() ^ (OY.Xd() ^ (717733945 ^ (-787269849)))), (short) (C1633zX.Xd() ^ ((1447472436 ^ 1268398655) ^ (-501003871)))) + jYd + Ig.wd("<a\bez%\\\u001cZ|D\u0003m\u001dIq/MaR?\u001d^]\u000e.^\u001d@v/ A`\u00045YAJ", (short) (OY.Xd() ^ (C1499aX.Xd() ^ (-1134248911)))) + j2);
    }

    public static Pair<ByteBuffer, Long> Yd(RandomAccessFile randomAccessFile, long j2) throws C1539jX, IOException {
        if (j2 < ((2564153722164122227L ^ 1868077791168640161L) ^ 4213410896664438514L)) {
            throw new C1539jX(new StringBuilder().append(Xg.qd("l|xN$ !R'\"\u0017#$X *.\\~\u000f\u000b`\u0015,+3/5/h\f7;09|o+\u001b#s\u0018;ELK;G{!GQEDVRV^\u0006VNO]P`'\u000e", (short) (ZN.Xd() ^ (1049395398 ^ 1049396913)), (short) (ZN.Xd() ^ (Od.Xd() ^ (1333098418 ^ 143187419))))).append(j2).toString());
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(OY.Xd() ^ 69929200);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        randomAccessFile.seek(j2 - ((long) byteBufferAllocate.capacity()));
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        if (byteBufferAllocate.getLong(FB.Xd() ^ 1609527099) != (8575038443090229353L ^ 6298215201292249128L) || byteBufferAllocate.getLong(2058703243 ^ 2058703259) != ((2234793264087335518L ^ 7516004234273389507L) ^ 5006176286050194911L)) {
            throw new C1539jX(C1561oA.Yd("k\u000e?aqmCw\u000f\u000e\u0016\u0012\u0018\u0012Kn\u001a\u001e\u0013\u001cQ\u0015\u0019\u001b%)\u001dX\u0014\u0004\f\\\u0001$.54$0d\n0:.-?;?G", (short) (C1499aX.Xd() ^ (OY.Xd() ^ (906603574 ^ (-841122148))))));
        }
        long j3 = byteBufferAllocate.getLong(0);
        if (j3 < byteBufferAllocate.capacity() || j3 > ((5880520733315744081L ^ 6425083483523643829L) ^ 626480911487256339L)) {
            StringBuilder sb = new StringBuilder();
            short sXd = (short) (Od.Xd() ^ (1074683556 ^ (-1074673566)));
            int[] iArr = new int["Yga5o\u0005\u0002\b\n\u000e\u0006=f\u0010\u0012\u0005s'yn\u0007p*x\u0006\u0004.|z3\u0005r'\u001f\u001co\\".length()];
            QB qb = new QB("Yga5o\u0005\u0002\b\n\u000e\u0006=f\u0010\u0012\u0005s'yn\u0007p*x\u0006\u0004.|z3\u0005r'\u001f\u001co\\");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                i2++;
            }
            throw new C1539jX(sb.append(new String(iArr, 0, i2)).append(j3).toString());
        }
        int iKd = (int) ((Od.Kd() ^ 2601039965261239389L) + j3);
        long j4 = j2 - ((long) iKd);
        if (j4 < 0) {
            throw new C1539jX(C1561oA.ud("9GA\u0015G\\Y_Y]U\r.WYLS\u0007UKJVGU\u007fNSQ{J@xJ8D<9\rq", (short) (ZN.Xd() ^ ((1949964903 ^ 1959042623) ^ 16689609))) + j4);
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(iKd);
        byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
        randomAccessFile.seek(j4);
        randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
        long j5 = byteBufferAllocate2.getLong(0);
        if (j5 == j3) {
            return Pair.create(byteBufferAllocate2, Long.valueOf(j4));
        }
        throw new C1539jX(new StringBuilder().append(Qg.kd("3A;\u000fAVSYSWO\u0007(QSFM\u0001SHXBOzCGw?;688Dp1=2l2:9=-9e)3b004^+\u001e0\u001e\"rW", (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ (679983043 ^ 420389205))), (short) (C1499aX.Xd() ^ (713250831 ^ (-713229824))))).append(j5).append(hg.Vd("lB>i", (short) (Od.Xd() ^ (276620434 ^ (-276611692))), (short) (Od.Xd() ^ (C1607wl.Xd() ^ (603351195 ^ (-1303532753)))))).append(j3).toString());
    }

    public static ByteBuffer od(ByteBuffer byteBuffer, int i2) throws BufferUnderflowException {
        if (i2 < 0) {
            throw new IllegalArgumentException(Jg.Wd("%\u00055\f#$", (short) (ZN.Xd() ^ (ZN.Xd() ^ (1680796009 ^ 1470409666))), (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (325859835 ^ (-1358367886))))) + i2);
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i3 = iPosition + i2;
        if (i3 < iPosition || i3 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i3);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i3);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static ByteBuffer ud(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < (C1633zX.Xd() ^ (2113556688 ^ (-162215137)))) {
            throw new IOException(C1561oA.Kd("u\n\u0013\b\u0011\u0017\u0013\u0019\u0013L\u0010$\u0016\u0017\u0017%S)%&W,\"*.1]3/`%229'06h60:4B7o@8r@:D>LA\u0007KNBDHXFF\u0003JNKSL\u0017\n=QZOX^Z`Z.\u0015", (short) (FB.Xd() ^ (C1607wl.Xd() ^ (1385134413 ^ 1019954144)))) + byteBuffer.remaining());
        }
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            throw new IllegalArgumentException(C1561oA.od("$:;4F:F4m9191=0", (short) (C1499aX.Xd() ^ (134176379 ^ (-134155589)))));
        }
        if (i2 <= byteBuffer.remaining()) {
            return od(byteBuffer, i2);
        }
        StringBuilder sb = new StringBuilder();
        short sXd = (short) (C1580rY.Xd() ^ (1806979520 ^ (-1806970614)));
        int[] iArr = new int["C[c[gZ\u001e`aSSUcOM\bMOJPG\u0002MOMEBNzNA9EuG9@3:>8<4k-?/.,8rc\t+&,#])!)!- pU".length()];
        QB qb = new QB("C[c[gZ\u001e`aSSUcOM\bMOJPG\u0002MOMEBNzNA9EuG9@3:>8<4k-?/.,8rc\t+&,#])!)!- pU");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        throw new IOException(sb.append(new String(iArr, 0, i3)).append(i2).append(C1593ug.zd(" \u0015h\\eZcieke9 ", (short) (Od.Xd() ^ (C1633zX.Xd() ^ 1951484346)), (short) (Od.Xd() ^ (1009868877 ^ (-1009874213))))).append(byteBuffer.remaining()).toString());
    }
}
