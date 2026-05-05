package com.airbnb.lottie.manager;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.airbnb.lottie.ImageAssetDelegate;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes.dex */
public class ImageAssetManager {
    private static final Object bitmapHashLock = new Object();
    private final Context context;
    private ImageAssetDelegate delegate;
    private final Map<String, LottieImageAsset> imageAssets;
    private final String imagesFolder;

    public ImageAssetManager(Drawable.Callback callback, String str, ImageAssetDelegate imageAssetDelegate, Map<String, LottieImageAsset> map) throws Throwable {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.imagesFolder = str;
        } else {
            this.imagesFolder = str + '/';
        }
        this.imageAssets = map;
        setDelegate(imageAssetDelegate);
        if (!(callback instanceof View)) {
            this.context = null;
            return;
        }
        Context context = ((View) callback).getContext();
        short sXd = (short) (C1580rY.Xd() ^ (-16532));
        int[] iArr = new int["*6+84-'o$/-2\"*/g{'%*\u001a,'".length()];
        QB qb = new QB("*6+84-'o$/-2\"*/g{'%*\u001a,'");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.yd("DAS\u001fQPOK85K?HF\u001eI[`Tfe", (short) (C1580rY.Xd() ^ (-15768))), new Class[0]);
        try {
            method.setAccessible(true);
            this.context = (Context) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private Bitmap putBitmap(String str, Bitmap bitmap) {
        synchronized (bitmapHashLock) {
            this.imageAssets.get(str).setBitmap(bitmap);
        }
        return bitmap;
    }

    public Bitmap bitmapForId(String str) throws Throwable {
        LottieImageAsset lottieImageAsset = this.imageAssets.get(str);
        if (lottieImageAsset == null) {
            return null;
        }
        Bitmap bitmap = lottieImageAsset.getBitmap();
        if (bitmap != null) {
            return bitmap;
        }
        ImageAssetDelegate imageAssetDelegate = this.delegate;
        if (imageAssetDelegate != null) {
            Bitmap bitmapFetchBitmap = imageAssetDelegate.fetchBitmap(lottieImageAsset);
            if (bitmapFetchBitmap != null) {
                putBitmap(str, bitmapFetchBitmap);
            }
            return bitmapFetchBitmap;
        }
        Context context = this.context;
        if (context == null) {
            return null;
        }
        String fileName = lottieImageAsset.getFileName();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        boolean zStartsWith = fileName.startsWith(C1561oA.Yd("PNbP*", (short) (C1580rY.Xd() ^ (-11090))));
        String strQd = Xg.qd("\u0014T\u001f*W'/'(j", (short) (ZN.Xd() ^ 31250), (short) (ZN.Xd() ^ 18228));
        String strWd = Jg.Wd("5\u00174l\u0003 N&\u0011ATEe=,", (short) (ZN.Xd() ^ 29867), (short) (ZN.Xd() ^ 24877));
        short sXd = (short) (C1499aX.Xd() ^ (-22934));
        short sXd2 = (short) (C1499aX.Xd() ^ (-24481));
        int[] iArr = new int["d\u0006".length()];
        QB qb = new QB("d\u0006");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        String str2 = new String(iArr, 0, i2);
        short sXd3 = (short) (FB.Xd() ^ 12986);
        short sXd4 = (short) (FB.Xd() ^ 19025);
        int[] iArr2 = new int["J\u0006\u001bHg08}i\u001dV\u0007\fPWVI\u0007\u001f$\\i\u0007\u0005".length()];
        QB qb2 = new QB("J\u0006\u001bHg08}i\u001dV\u0007\fPWVI\u0007\u001f$\\i\u0007\u0005");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
            i3++;
        }
        String str3 = new String(iArr2, 0, i3);
        if (!zStartsWith || fileName.indexOf(Ig.wd("U\"R\\}F*", (short) (C1499aX.Xd() ^ (-5790)))) <= 0) {
            try {
                if (TextUtils.isEmpty(this.imagesFolder)) {
                    throw new IllegalStateException(C1561oA.Xd("w\u000f\u0016A\u0010\u0019\u0018\u001aF\u001b\u000e\u001eJ\r\u001bM\u0018\u001d\u0012\u0019\u0018'T\u001c&$\u001d\u001f-[\u001f#%/3'b04'+171j-;m8=298\u0002t)<LxCO{TGSH\u0001.RXYOL+XW[[`WcY``\u0016gZj@eZa`oCmkdft#sw&Sw}~tqQ\u0001p\brt\u007fy8\n|\rb\b|\u0004\u0003\u0012e\u0010\u000e\u0007\t\u0017", (short) (C1580rY.Xd() ^ (-18023))));
                }
                Object[] objArr = new Object[0];
                Method method = Class.forName(C1561oA.Kd("lzq\u0001~yu@v\u0004\u0004\u000b|\u0007\u000eH^\f\f\u0013\u0005\u0019\u0016", (short) (C1607wl.Xd() ^ 8453))).getMethod(Wg.Zd("Lui&<mGF+", (short) (C1499aX.Xd() ^ (-15054)), (short) (C1499aX.Xd() ^ (-3787))), new Class[0]);
                try {
                    method.setAccessible(true);
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(((AssetManager) method.invoke(context, objArr)).open(this.imagesFolder + fileName), null, options);
                        if (bitmapDecodeStream != null) {
                            return putBitmap(str, Utils.resizeBitmapIfNeeded(bitmapDecodeStream, lottieImageAsset.getWidth(), lottieImageAsset.getHeight()));
                        }
                        Logger.warning(strWd + str + strQd);
                        return null;
                    } catch (IllegalArgumentException e2) {
                        Logger.warning(str3 + str + str2, e2);
                        return null;
                    }
                } catch (InvocationTargetException e3) {
                    throw e3.getCause();
                }
            } catch (IOException e4) {
                Logger.warning(Wg.vd("\n\"\u0018\u0018%\u001dZ.,[..&.b#\u0018\u0017\f\u001aV", (short) (FB.Xd() ^ 733)), e4);
                return null;
            }
        }
        try {
            String strSubstring = fileName.substring(fileName.indexOf(44) + 1);
            Class<?> cls = Class.forName(EO.Od("\u0003ae\u000f\rD\u0017XOm\\\u0006r\u0015P\u0004\u0013M$", (short) (C1633zX.Xd() ^ (-20333))));
            Class<?>[] clsArr = new Class[2];
            short sXd5 = (short) (Od.Xd() ^ (-24469));
            int[] iArr3 = new int["tj~h4qeqi/Sspfjb".length()];
            QB qb3 = new QB("tj~h4qeqi/Sspfjb");
            int i4 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i4] = xuXd3.fK(sXd5 + sXd5 + sXd5 + i4 + xuXd3.CK(iKK3));
                i4++;
            }
            clsArr[0] = Class.forName(new String(iArr3, 0, i4));
            clsArr[1] = Integer.TYPE;
            Object[] objArr2 = {strSubstring, 0};
            Method declaredMethod = cls.getDeclaredMethod(C1593ug.zd("LNMZPR", (short) (C1499aX.Xd() ^ (-10294)), (short) (C1499aX.Xd() ^ (-29547))), clsArr);
            try {
                declaredMethod.setAccessible(true);
                byte[] bArr = (byte[]) declaredMethod.invoke(null, objArr2);
                try {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    if (bitmapDecodeByteArray != null) {
                        return putBitmap(str, Utils.resizeBitmapIfNeeded(bitmapDecodeByteArray, lottieImageAsset.getWidth(), lottieImageAsset.getHeight()));
                    }
                    Logger.warning(strWd + str + strQd);
                    return null;
                } catch (IllegalArgumentException e5) {
                    Logger.warning(str3 + str + str2, e5);
                    return null;
                }
            } catch (InvocationTargetException e6) {
                throw e6.getCause();
            }
        } catch (IllegalArgumentException e7) {
            short sXd6 = (short) (C1633zX.Xd() ^ (-32537));
            int[] iArr4 = new int["\u001f\u001b-\u0019V\u000b\u0007\u007fR\u0016\u001a\u0014N\u001c\u001c J\u0012\n\u001e\fE\b\u0013\u0015\u0014\u0006\u0003\u0013=~|\u000e~NK6{\u0004\u0006\u007fr\u0005=".length()];
            QB qb4 = new QB("\u001f\u001b-\u0019V\u000b\u0007\u007fR\u0016\u001a\u0014N\u001c\u001c J\u0012\n\u001e\fE\b\u0013\u0015\u0014\u0006\u0003\u0013=~|\u000e~NK6{\u0004\u0006\u007fr\u0005=");
            int i5 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i5] = xuXd4.fK(sXd6 + sXd6 + i5 + xuXd4.CK(iKK4));
                i5++;
            }
            Logger.warning(new String(iArr4, 0, i5), e7);
            return null;
        }
    }

    public LottieImageAsset getImageAssetById(String str) {
        return this.imageAssets.get(str);
    }

    public boolean hasSameContext(Context context) throws Throwable {
        if (context == null) {
            return this.context == null;
        }
        if (this.context instanceof Application) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(Qg.kd("KWLYUNH\u0011EPNSCKP\t\u001dHFK;MH", (short) (OY.Xd() ^ 3336), (short) (OY.Xd() ^ 2491))).getMethod(hg.Vd("<9G\u0013A@;70-?386\n538(:5", (short) (C1633zX.Xd() ^ (-1016)), (short) (C1633zX.Xd() ^ (-511))), new Class[0]);
            try {
                method.setAccessible(true);
                context = (Context) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return context == this.context;
    }

    public void setDelegate(ImageAssetDelegate imageAssetDelegate) {
        this.delegate = imageAssetDelegate;
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmap2 = this.imageAssets.get(str).getBitmap();
            putBitmap(str, bitmap);
            return bitmap2;
        }
        LottieImageAsset lottieImageAsset = this.imageAssets.get(str);
        Bitmap bitmap3 = lottieImageAsset.getBitmap();
        lottieImageAsset.setBitmap(null);
        return bitmap3;
    }
}
