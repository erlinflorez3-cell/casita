package fr.bamlab.rnimageresizer;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class ImageResizerModule extends ReactContextBaseJavaModule {
    private Context context;

    public ImageResizerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.context = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createResizedImageWithExceptions(String str, int i2, int i3, String str2, int i4, int i5, String str3, boolean z2, ReadableMap readableMap, Callback callback, Callback callback2) throws Throwable {
        Bitmap.CompressFormat compressFormatValueOf = Bitmap.CompressFormat.valueOf(str2);
        Uri uri = Uri.parse(str);
        Bitmap bitmapCreateResizedImage = ImageResizer.createResizedImage(this.context, uri, i2, i3, i4, i5, readableMap.getString(hg.Vd("HI==", (short) (ZN.Xd() ^ 6338), (short) (ZN.Xd() ^ 21664))), readableMap.getBoolean(C1561oA.ud("974@\u0019(%/'\u0005/6,", (short) (Od.Xd() ^ (-2120)))));
        if (bitmapCreateResizedImage == null) {
            throw new IOException(C1561oA.Kd("%:8s>C8?>yA=FJDD\u0001VR\u0004GK\u0007ZN]TfRR*\u0010Z`iUa_[\u0018;coi^n\u001frfuxpy4", (short) (C1607wl.Xd() ^ 9959)));
        }
        Context context = this.context;
        Class<?> cls = Class.forName(C1561oA.yd("\u0002\u0010\u0007\u0016\u0014\u000f\u000bU\f\u0019\u0019 \u0012\u001c#]s!!(\u001a.+", (short) (C1607wl.Xd() ^ 31898)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1499aX.Xd() ^ (-4054));
        int[] iArr = new int["32B\u001214:8\u0018>H".length()];
        QB qb = new QB("32B\u001214:8\u0018>H");
        int i6 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i6] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i6));
            i6++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i6), clsArr);
        try {
            method.setAccessible(true);
            File file = (File) method.invoke(context, objArr);
            if (str3 != null) {
                file = new File(str3);
            }
            File fileSaveImage = ImageResizer.saveImage(bitmapCreateResizedImage, file, UUID.randomUUID().toString(), compressFormatValueOf, i4);
            if (fileSaveImage.isFile()) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString(Xg.qd("\u0011\u0003\u0017\f", (short) (ZN.Xd() ^ 22344), (short) (ZN.Xd() ^ 5739)), fileSaveImage.getAbsolutePath());
                writableMapCreateMap.putString(Jg.Wd("hF)", (short) (OY.Xd() ^ 11458), (short) (OY.Xd() ^ 23981)), Uri.fromFile(fileSaveImage).toString());
                writableMapCreateMap.putString(ZO.xd("\u0012\u000fM\u0002", (short) (ZN.Xd() ^ 18500), (short) (ZN.Xd() ^ 10452)), fileSaveImage.getName());
                writableMapCreateMap.putDouble(C1626yg.Ud("\b`b1", (short) (C1580rY.Xd() ^ (-29997)), (short) (C1580rY.Xd() ^ (-26177))), fileSaveImage.length());
                writableMapCreateMap.putDouble(Ig.wd("i\u0004pe0", (short) (Od.Xd() ^ (-28951))), bitmapCreateResizedImage.getWidth());
                writableMapCreateMap.putDouble(EO.Od("z/Us\u001dm", (short) (C1499aX.Xd() ^ (-26337))), bitmapCreateResizedImage.getHeight());
                if (z2) {
                    try {
                        ImageResizer.copyExif(this.context, uri, fileSaveImage.getAbsolutePath());
                    } catch (Exception e2) {
                        C1561oA.Qd("[~qvs_q~s\u0004my@?gugbtdPbodt^\\@cV[XIZdW3eOPZ]QVTX", (short) (FB.Xd() ^ 11075));
                        C1593ug.zd("L`RP+o|~\t0ws|\u0001zz", (short) (OY.Xd() ^ 5368), (short) (OY.Xd() ^ 30376));
                    }
                }
                callback.invoke(writableMapCreateMap);
            } else {
                callback2.invoke(C1561oA.od("'SRNP|C@NMAE=tF8E:J42l58+0-f6&8+", (short) (ZN.Xd() ^ 9511)));
            }
            bitmapCreateResizedImage.recycle();
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [fr.bamlab.rnimageresizer.ImageResizerModule$1] */
    @ReactMethod
    public void createResizedImage(final String str, final int i2, final int i3, final String str2, final int i4, final int i5, final String str3, final boolean z2, final ReadableMap readableMap, final Callback callback, final Callback callback2) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: fr.bamlab.rnimageresizer.ImageResizerModule.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.react.bridge.GuardedAsyncTask
            public void doInBackgroundGuarded(Void... voidArr) throws Throwable {
                try {
                    ImageResizerModule.this.createResizedImageWithExceptions(str, i2, i3, str2, i4, i5, str3, z2, readableMap, callback, callback2);
                } catch (IOException e2) {
                    callback2.invoke(e2.getMessage());
                }
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ImageResizerAndroid";
    }
}
