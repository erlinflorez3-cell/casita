package com.bumptech.glide.load.resource.transcode;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource;
import com.bumptech.glide.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.FB;
import yg.Wg;

/* JADX INFO: loaded from: classes3.dex */
public class BitmapDrawableTranscoder implements ResourceTranscoder<Bitmap, BitmapDrawable> {
    private final Resources resources;

    /* JADX WARN: Illegal instructions before constructor call */
    public BitmapDrawableTranscoder(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Kd("<JAPNIE\u0010FSSZLV]\u0018.[[bThe", (short) (FB.Xd() ^ 18670))).getMethod(Wg.Zd("Vi)\u0019\u001d}jC12fE", (short) (FB.Xd() ^ 16220), (short) (FB.Xd() ^ 5499)), new Class[0]);
        try {
            method.setAccessible(true);
            this((Resources) method.invoke(context, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public BitmapDrawableTranscoder(Resources resources) {
        this.resources = (Resources) Preconditions.checkNotNull(resources);
    }

    @Deprecated
    public BitmapDrawableTranscoder(Resources resources, BitmapPool bitmapPool) {
        this(resources);
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public Resource<BitmapDrawable> transcode(Resource<Bitmap> resource, Options options) {
        return LazyBitmapDrawableResource.obtain(this.resources, resource);
    }
}
