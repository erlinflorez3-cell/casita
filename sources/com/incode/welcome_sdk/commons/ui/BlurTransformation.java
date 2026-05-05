package com.incode.welcome_sdk.commons.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes5.dex */
public final class BlurTransformation extends BitmapTransformation {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5762c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5763e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RenderScript f5764a;

    public BlurTransformation(Context context) {
        RenderScript renderScriptCreate = RenderScript.create(context);
        Intrinsics.checkNotNullExpressionValue(renderScriptCreate, "");
        this.f5764a = renderScriptCreate;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.BitmapTransformation
    protected final Bitmap transform(BitmapPool bitmapPool, Bitmap bitmap, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = f5762c + 121;
        f5763e = i5 % 128;
        int i6 = i5 % 2;
        Intrinsics.checkNotNullParameter(bitmapPool, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(this.f5764a, bitmapCopy, Allocation.MipmapControl.MIPMAP_FULL, 128);
        Allocation allocationCreateTyped = Allocation.createTyped(this.f5764a, allocationCreateFromBitmap.getType());
        RenderScript renderScript = this.f5764a;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.setRadius(25.0f);
        scriptIntrinsicBlurCreate.forEach(allocationCreateTyped);
        allocationCreateTyped.copyTo(bitmapCopy);
        Intrinsics.checkNotNull(bitmapCopy);
        int i7 = f5762c + 91;
        f5763e = i7 % 128;
        if (i7 % 2 == 0) {
            return bitmapCopy;
        }
        throw null;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        int i2 = 2 % 2;
        int i3 = f5762c + 17;
        f5763e = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(messageDigest, "");
            byte[] bytes = "blur transformation".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            messageDigest.update(bytes);
            int i4 = 66 / 0;
        } else {
            Intrinsics.checkNotNullParameter(messageDigest, "");
            byte[] bytes2 = "blur transformation".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes2, "");
            messageDigest.update(bytes2);
        }
        int i5 = f5763e + 87;
        f5762c = i5 % 128;
        int i6 = i5 % 2;
    }
}
