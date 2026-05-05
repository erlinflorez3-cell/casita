package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.prefill.PreFillType;
import com.bumptech.glide.util.Util;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.Jg;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public final class BitmapPreFiller {
    private final BitmapPool bitmapPool;
    private BitmapPreFillRunner current;
    private final DecodeFormat defaultFormat;
    private final Handler handler;
    private final MemoryCache memoryCache;

    public BitmapPreFiller(MemoryCache memoryCache, BitmapPool bitmapPool, DecodeFormat decodeFormat) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.ud("_k`mib\\%eh\"?a``T`", (short) (C1499aX.Xd() ^ (-31317))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (Od.Xd() ^ (-22073));
        int[] iArr = new int["ut\u0001Zs|~]\u0006\u0007\u0005z\r".length()];
        QB qb = new QB("ut\u0001Zs|~]\u0006\u0007\u0005z\r");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            this.handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.memoryCache = memoryCache;
            this.bitmapPool = bitmapPool;
            this.defaultFormat = decodeFormat;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static int getSizeInBytes(PreFillType preFillType) {
        return Util.getBitmapByteSize(preFillType.getWidth(), preFillType.getHeight(), preFillType.getConfig());
    }

    PreFillQueue generateAllocationOrder(PreFillType... preFillTypeArr) {
        long maxSize = (this.memoryCache.getMaxSize() - this.memoryCache.getCurrentSize()) + this.bitmapPool.getMaxSize();
        int weight = 0;
        for (PreFillType preFillType : preFillTypeArr) {
            weight += preFillType.getWeight();
        }
        float f2 = maxSize / weight;
        HashMap map = new HashMap();
        for (PreFillType preFillType2 : preFillTypeArr) {
            map.put(preFillType2, Integer.valueOf(Math.round(preFillType2.getWeight() * f2) / getSizeInBytes(preFillType2)));
        }
        return new PreFillQueue(map);
    }

    public void preFill(PreFillType.Builder... builderArr) throws Throwable {
        BitmapPreFillRunner bitmapPreFillRunner = this.current;
        if (bitmapPreFillRunner != null) {
            bitmapPreFillRunner.cancel();
        }
        PreFillType[] preFillTypeArr = new PreFillType[builderArr.length];
        for (int i2 = 0; i2 < builderArr.length; i2++) {
            PreFillType.Builder builder = builderArr[i2];
            if (builder.getConfig() == null) {
                builder.setConfig(this.defaultFormat == DecodeFormat.PREFER_ARGB_8888 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            }
            preFillTypeArr[i2] = builder.build();
        }
        BitmapPreFillRunner bitmapPreFillRunner2 = new BitmapPreFillRunner(this.bitmapPool, this.memoryCache, generateAllocationOrder(preFillTypeArr));
        this.current = bitmapPreFillRunner2;
        Handler handler = this.handler;
        Object[] objArr = {bitmapPreFillRunner2};
        Method method = Class.forName(C1561oA.Yd("\f\u001a\u0011 \u001e\u0019\u0015_\"'b}\u0018&\u001d& .", (short) (C1580rY.Xd() ^ (-17217)))).getMethod(Jg.Wd("9\u0005vA", (short) (C1580rY.Xd() ^ (-24899)), (short) (C1580rY.Xd() ^ (-6244))), Class.forName(Xg.qd("'\u001f5!n.$2,s\u0019=78,.93", (short) (ZN.Xd() ^ 15871), (short) (ZN.Xd() ^ 25198))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
