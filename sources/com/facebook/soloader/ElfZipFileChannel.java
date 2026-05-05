package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.annotation.Nullable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Jg;
import yg.Od;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class ElfZipFileChannel implements ElfByteChannel {

    @Nullable
    private InputStream mIs;
    private final long mLength;
    private boolean mOpened = true;
    private long mPos = 0;
    private final ZipEntry mZipEntry;
    private final ZipFile mZipFile;

    public ElfZipFileChannel(ZipFile zipFile, ZipEntry zipEntry) throws Throwable {
        this.mZipFile = zipFile;
        this.mZipEntry = zipEntry;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Qd("7-A+v=;/1q=+1m\u0019'-\u0001).+1", (short) (C1580rY.Xd() ^ (-20761)))).getMethod(C1593ug.zd("\u0017\u0016&\u0006\u001d/\u001b", (short) (C1580rY.Xd() ^ (-11548)), (short) (C1580rY.Xd() ^ (-4066))), new Class[0]);
        try {
            method.setAccessible(true);
            this.mLength = ((Long) method.invoke(zipEntry, objArr)).longValue();
            Object[] objArr2 = {zipEntry};
            Method method2 = Class.forName(C1561oA.od("`VjT fdXZ\u001bfTZ\u0017BPV+MOG", (short) (C1580rY.Xd() ^ (-2131)))).getMethod(Wg.Zd("Av;G\"[\u0016La:m\u0018I\r", (short) (Od.Xd() ^ (-23536)), (short) (Od.Xd() ^ (-2979))), Class.forName(C1561oA.Kd("^VlX&nndh+xhp/\\ltJt{z\u0003", (short) (C1633zX.Xd() ^ (-7117)))));
            try {
                method2.setAccessible(true);
                InputStream inputStream = (InputStream) method2.invoke(zipFile, objArr2);
                this.mIs = inputStream;
                if (inputStream != null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(C1561oA.Xd("\u0016\u000e$\u0010]&&\u001c b0 (f\u0014$,\u0002,32:", (short) (C1633zX.Xd() ^ (-9501)))).getMethod(Wg.vd("_^jEUbW", (short) (C1580rY.Xd() ^ (-840))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    throw new IOException(sb.append((String) method3.invoke(zipEntry, objArr3)).append(Qg.kd("R\u001eIq\u0016\u0017\u001b\u0019v\u0017\u0014\u0006\u0001\f=\u0006\u000f:\b\u000e\u0004\u0003", (short) (C1607wl.Xd() ^ 19521), (short) (C1607wl.Xd() ^ 18452))).toString());
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.mIs;
        if (inputStream != null) {
            inputStream.close();
            this.mOpened = false;
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.mOpened;
    }

    @Override // com.facebook.soloader.ElfByteChannel
    public long position() throws IOException {
        return this.mPos;
    }

    @Override // com.facebook.soloader.ElfByteChannel
    public ElfByteChannel position(long j2) throws Throwable {
        InputStream inputStream = this.mIs;
        String strVd = hg.Vd("8\u0004/W{|\u0001~\\|ykfq#kt msih", (short) (C1607wl.Xd() ^ 11067), (short) (C1607wl.Xd() ^ 31506));
        if (inputStream == null) {
            StringBuilder sb = new StringBuilder();
            ZipEntry zipEntry = this.mZipEntry;
            Object[] objArr = new Object[0];
            Method method = Class.forName(ZO.xd("EBcHDm(\u0010j25\u001e\b\u0013e\u0015\u00106\u007f\n{%", (short) (Od.Xd() ^ (-14006)), (short) (Od.Xd() ^ (-21629)))).getMethod(C1626yg.Ud("b$z#F\u0019\u0011", (short) (C1499aX.Xd() ^ (-16481)), (short) (C1499aX.Xd() ^ (-23814))), new Class[0]);
            try {
                method.setAccessible(true);
                throw new IOException(sb.append((String) method.invoke(zipEntry, objArr)).append(strVd).toString());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        long j3 = this.mPos;
        if (j2 == j3) {
            return this;
        }
        long j4 = this.mLength;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j2 >= j3) {
            inputStream.skip(j2 - j3);
        } else {
            inputStream.close();
            ZipFile zipFile = this.mZipFile;
            Object[] objArr2 = {this.mZipEntry};
            Method method2 = Class.forName(C1561oA.ud("/%9#n53')i5#)e\u0011\u001f%y\u001c\u001e\u0016", (short) (C1580rY.Xd() ^ (-16251)))).getMethod(C1561oA.Yd("ON^4Z]ccCedXUb", (short) (C1633zX.Xd() ^ (-29177))), Class.forName(C1561oA.yd("&\u001e0\u001ce.*  b,\u001c ^\b\u0018\u001cq\u0018\u001f\u001a\"", (short) (C1633zX.Xd() ^ (-6539)))));
            try {
                method2.setAccessible(true);
                InputStream inputStream2 = (InputStream) method2.invoke(zipFile, objArr2);
                this.mIs = inputStream2;
                if (inputStream2 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    ZipEntry zipEntry2 = this.mZipEntry;
                    Object[] objArr3 = new Object[0];
                    Method method3 = Class.forName(Xg.qd("ldzf4||rv9\u0007v~=jz\u0003X\u0003\n\t\u0011", (short) (FB.Xd() ^ 28884), (short) (FB.Xd() ^ 23565))).getMethod(Jg.Wd(" b4V5G@", (short) (C1499aX.Xd() ^ (-11698)), (short) (C1499aX.Xd() ^ (-3847))), new Class[0]);
                    try {
                        method3.setAccessible(true);
                        throw new IOException(sb2.append((String) method3.invoke(zipEntry2, objArr3)).append(strVd).toString());
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
                inputStream2.skip(j2);
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
        this.mPos = j2;
        return this;
    }

    @Override // com.facebook.soloader.ElfByteChannel, java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return read(byteBuffer, this.mPos);
    }

    @Override // com.facebook.soloader.ElfByteChannel
    public int read(ByteBuffer byteBuffer, long j2) throws Throwable {
        if (this.mIs == null) {
            throw new IOException("InputStream is null");
        }
        int iRemaining = byteBuffer.remaining();
        long j3 = this.mLength - j2;
        if (j3 <= 0) {
            return -1;
        }
        int i2 = (int) j3;
        if (iRemaining > i2) {
            iRemaining = i2;
        }
        position(j2);
        if (byteBuffer.hasArray()) {
            this.mIs.read(byteBuffer.array(), 0, iRemaining);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        } else {
            byte[] bArr = new byte[iRemaining];
            this.mIs.read(bArr, 0, iRemaining);
            byteBuffer.put(bArr, 0, iRemaining);
        }
        this.mPos += (long) iRemaining;
        return iRemaining;
    }

    @Override // com.facebook.soloader.ElfByteChannel
    public long size() throws IOException {
        return this.mLength;
    }

    @Override // com.facebook.soloader.ElfByteChannel
    public ElfByteChannel truncate(long j2) throws IOException {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support truncate");
    }

    @Override // com.facebook.soloader.ElfByteChannel, java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
