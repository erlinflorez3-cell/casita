package com.google.android.odml.image;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.MediaStore;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.Jg;
import yg.OY;
import yg.Xg;
import yg.ZN;

/* JADX INFO: loaded from: classes9.dex */
public class BitmapMlImageBuilder {
    private final Bitmap zza;
    private int zzb;
    private Rect zzc;

    /* JADX WARN: Illegal instructions before constructor call */
    public BitmapMlImageBuilder(Context context, Uri uri) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Xg.qd("Xf]ljea,boovhry4Jww~p\u0005\u0002", (short) (OY.Xd() ^ 27909), (short) (OY.Xd() ^ 14345))).getMethod(Jg.Wd("]-x\nr2v(o'@\u0016`\u001eY#P.", (short) (ZN.Xd() ^ 8518), (short) (ZN.Xd() ^ 1983)), new Class[0]);
        try {
            method.setAccessible(true);
            this(MediaStore.Images.Media.getBitmap((ContentResolver) method.invoke(context, objArr), uri));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public BitmapMlImageBuilder(Bitmap bitmap) {
        this.zza = bitmap;
        this.zzb = 0;
        this.zzc = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
    }

    public MlImage build() {
        return new MlImage(new zze(this.zza), this.zzb, this.zzc, 0L, this.zza.getWidth(), this.zza.getHeight());
    }

    public BitmapMlImageBuilder setRotation(int i2) {
        MlImage.zzc(i2);
        this.zzb = i2;
        return this;
    }
}
