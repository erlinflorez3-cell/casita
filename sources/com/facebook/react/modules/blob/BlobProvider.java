package com.facebook.react.modules.blob;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.react.ReactApplication;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public final class BlobProvider extends ContentProvider {
    private static final int PIPE_CAPACITY = 65536;
    private final ExecutorService executor;

    public BlobProvider() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(hg.Vd("XNbL\u0018^\\PR\u0013GRPDUQPBJO\b\u001eP<9JHBDD", (short) (Od.Xd() ^ (-4807)), (short) (Od.Xd() ^ (-15658)))).getDeclaredMethod(C1561oA.ud("@6G\"7;37/\u001d09+&(\b:&#42,.", (short) (C1499aX.Xd() ^ (-25144))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.executor = (ExecutorService) declaredMethod.invoke(null, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws Throwable {
        boolean zEquals = str.equals(C1561oA.yd("\t", (short) (C1499aX.Xd() ^ (-23565))));
        String strYd = C1561oA.Yd("Edrsu{(xzpz-", (short) (C1633zX.Xd() ^ (-9136)));
        if (!zEquals) {
            throw new FileNotFoundException(strYd + uri.toString() + Ig.wd("\u001f:\r#1Ur,\u0007\u0013", (short) (C1580rY.Xd() ^ (-15040))) + str + EO.Od("u", (short) (ZN.Xd() ^ 16165)));
        }
        Context context = getContext();
        Class<?> cls = Class.forName(Xg.qd("\"0'64/+u,99@2<C}\u0014AAH:NK", (short) (FB.Xd() ^ 13876), (short) (FB.Xd() ^ 16424)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 20420);
        short sXd2 = (short) (ZN.Xd() ^ 5780);
        int[] iArr = new int["\u007fi5i9%aN`K\u001e\u0004%\u0011!:]Oxw\u0014".length()];
        QB qb = new QB("\u007fi5i9%aN`K\u001e\u0004%\u0011!:]Oxw\u0014");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            Object obj = (Context) method.invoke(context, objArr);
            BlobModule blobModule = obj instanceof ReactApplication ? (BlobModule) ((ReactApplication) obj).getReactNativeHost().getReactInstanceManager().getCurrentReactContext().getNativeModule(BlobModule.class) : null;
            if (blobModule == null) {
                throw new RuntimeException(C1626yg.Ud("xu\u00119Cj@48\u0013%[\u0012i)*\f|CN9e[Q\u00022u\u000fzdN)t2L\u0001,.!\u0019\u0007S\u001c", (short) (C1499aX.Xd() ^ (-23395)), (short) (C1499aX.Xd() ^ (-23142))));
            }
            final byte[] bArrResolve = blobModule.resolve(uri);
            if (bArrResolve != null) {
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                    final ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[1];
                    if (bArrResolve.length <= 65536) {
                        try {
                            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                            try {
                                autoCloseOutputStream.write(bArrResolve);
                                autoCloseOutputStream.close();
                            } finally {
                            }
                        } catch (IOException unused) {
                            return null;
                        }
                    } else {
                        this.executor.submit(new Runnable() { // from class: com.facebook.react.modules.blob.BlobProvider.1
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2 = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                                    try {
                                        autoCloseOutputStream2.write(bArrResolve);
                                        autoCloseOutputStream2.close();
                                    } finally {
                                    }
                                } catch (IOException unused2) {
                                }
                            }
                        });
                    }
                    return parcelFileDescriptor;
                } catch (IOException unused2) {
                    return null;
                }
            }
            StringBuilder sbAppend = new StringBuilder(strYd).append(uri);
            short sXd3 = (short) (FB.Xd() ^ 31394);
            short sXd4 = (short) (FB.Xd() ^ 32103);
            int[] iArr2 = new int["h\u001c2\u0012\rQ_/s\u0013[Tf+\u0013\u000bm".length()];
            QB qb2 = new QB("h\u001c2\u0012\rQ_/s\u0013[Tf+\u0013\u000bm");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((i3 * sXd4) + sXd3)));
                i3++;
            }
            throw new FileNotFoundException(sbAppend.append(new String(iArr2, 0, i3)).toString());
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
