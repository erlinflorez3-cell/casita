package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.Asserts;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
final class zaa implements Runnable {
    final /* synthetic */ ImageManager zaa;
    private final Uri zab;
    private final ParcelFileDescriptor zac;

    public zaa(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.zaa = imageManager;
        this.zab = uri;
        this.zac = parcelFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Asserts.checkNotMainThread(Wg.Zd("\\^\f\r%k0(W\u0002\u0016}xQ'\u0006\u0010bD'Zx'&i\u0003w6s[\u0012\u001bC`cW\u0019\fr/|\u0019DC8\u001eb\u000e\"pj`-z\u007fCn#QX\u0007\"^", (short) (Od.Xd() ^ (-15333)), (short) (Od.Xd() ^ (-11399))));
        ParcelFileDescriptor parcelFileDescriptor = this.zac;
        boolean z2 = false;
        Bitmap bitmapDecodeFileDescriptor = null;
        C1561oA.Xd("QvkrqZo}qxw\u0006", (short) (C1607wl.Xd() ^ 16373));
        if (parcelFileDescriptor != null) {
            try {
                bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor());
            } catch (OutOfMemoryError e2) {
                Wg.vd("./.\u0002ZLNRL\bUYLPV\\6o3;GA6Fv>HLzQOGx_", (short) (C1633zX.Xd() ^ (-3196))).concat(String.valueOf(String.valueOf(this.zab)));
                z2 = true;
            }
            try {
                this.zac.close();
            } catch (IOException e3) {
                Qg.kd("pxz}nl'lfmoge", (short) (C1580rY.Xd() ^ (-15774)), (short) (C1580rY.Xd() ^ (-13374)));
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ImageManager imageManager = this.zaa;
        Uri uri = this.zab;
        Handler handler = imageManager.zae;
        zac zacVar = new zac(imageManager, uri, bitmapDecodeFileDescriptor, z2, countDownLatch);
        Class<?> cls = Class.forName(hg.Vd("NZO\\XQK\u0014TW\u0011*BNCJBN", (short) (C1633zX.Xd() ^ (-2507)), (short) (C1633zX.Xd() ^ (-21119))));
        Class<?>[] clsArr = new Class[1];
        short sXd = (short) (ZN.Xd() ^ 10654);
        int[] iArr = new int["MCWA\rJ>JB\b+MED66?7".length()];
        QB qb = new QB("MCWA\rJ>JB\b+MED66?7");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        Object[] objArr = {zacVar};
        Method method = cls.getMethod(C1561oA.yd("\u0007\u0005\b\b", (short) (OY.Xd() ^ 919)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                C1561oA.Yd("7MaQW\u0010Z`gYghlhm__\u001ctfhlf\"ssxzpvp*", (short) (Od.Xd() ^ (-7848))).concat(String.valueOf(String.valueOf(this.zab)));
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }
}
