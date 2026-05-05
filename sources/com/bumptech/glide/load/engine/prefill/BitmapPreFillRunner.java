package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.util.Util;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
final class BitmapPreFillRunner implements Runnable {
    static final int BACKOFF_RATIO = 4;
    static final long INITIAL_BACKOFF_MS = 40;
    static final long MAX_DURATION_MS = 32;
    static final String TAG = "PreFillRunner";
    private final BitmapPool bitmapPool;
    private final Clock clock;
    private long currentDelay;
    private final Handler handler;
    private boolean isCancelled;
    private final MemoryCache memoryCache;
    private final Set<PreFillType> seenTypes;
    private final PreFillQueue toPrefill;
    private static final Clock DEFAULT_CLOCK = new Clock();
    static final long MAX_BACKOFF_MS = TimeUnit.SECONDS.toMillis(1);

    static class Clock {
        Clock() {
        }

        long now() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    private static final class UniqueKey implements Key {
        UniqueKey() {
        }

        @Override // com.bumptech.glide.load.Key
        public void updateDiskCacheKey(MessageDigest messageDigest) {
            throw new UnsupportedOperationException();
        }
    }

    public BitmapPreFillRunner(BitmapPool bitmapPool, MemoryCache memoryCache, PreFillQueue preFillQueue) throws Throwable {
        Clock clock = DEFAULT_CLOCK;
        short sXd = (short) (C1633zX.Xd() ^ (-18514));
        short sXd2 = (short) (C1633zX.Xd() ^ (-27114));
        int[] iArr = new int["#r\u0015t(a\u0019$\\1\u0017G `\u001d\u0005V".length()];
        QB qb = new QB("#r\u0015t(a\u0019$\\1\u0017G `\u001d\u0005V");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Xd("21A\u001b09?\u001eBCE;I", (short) (OY.Xd() ^ 81)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this(bitmapPool, memoryCache, preFillQueue, clock, new Handler((Looper) declaredMethod.invoke(null, objArr)));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    BitmapPreFillRunner(BitmapPool bitmapPool, MemoryCache memoryCache, PreFillQueue preFillQueue, Clock clock, Handler handler) {
        this.seenTypes = new HashSet();
        this.currentDelay = INITIAL_BACKOFF_MS;
        this.bitmapPool = bitmapPool;
        this.memoryCache = memoryCache;
        this.toPrefill = preFillQueue;
        this.clock = clock;
        this.handler = handler;
    }

    private long getFreeMemoryCacheBytes() {
        return this.memoryCache.getMaxSize() - this.memoryCache.getCurrentSize();
    }

    private long getNextDelay() {
        long j2 = this.currentDelay;
        this.currentDelay = Math.min(4 * j2, MAX_BACKOFF_MS);
        return j2;
    }

    private boolean isGcDetected(long j2) {
        return this.clock.now() - j2 >= MAX_DURATION_MS;
    }

    boolean allocate() {
        Bitmap bitmapCreateBitmap;
        long jNow = this.clock.now();
        while (!this.toPrefill.isEmpty() && !isGcDetected(jNow)) {
            PreFillType preFillTypeRemove = this.toPrefill.remove();
            if (this.seenTypes.contains(preFillTypeRemove)) {
                bitmapCreateBitmap = Bitmap.createBitmap(preFillTypeRemove.getWidth(), preFillTypeRemove.getHeight(), preFillTypeRemove.getConfig());
            } else {
                this.seenTypes.add(preFillTypeRemove);
                bitmapCreateBitmap = this.bitmapPool.getDirty(preFillTypeRemove.getWidth(), preFillTypeRemove.getHeight(), preFillTypeRemove.getConfig());
            }
            int bitmapByteSize = Util.getBitmapByteSize(bitmapCreateBitmap);
            if (getFreeMemoryCacheBytes() >= bitmapByteSize) {
                this.memoryCache.put(new UniqueKey(), BitmapResource.obtain(bitmapCreateBitmap, this.bitmapPool));
            } else {
                this.bitmapPool.put(bitmapCreateBitmap);
            }
            if (Log.isLoggable(TAG, 3)) {
                String str = "allocated [" + preFillTypeRemove.getWidth() + "x" + preFillTypeRemove.getHeight() + "] " + preFillTypeRemove.getConfig() + " size: " + bitmapByteSize;
            }
        }
        return (this.isCancelled || this.toPrefill.isEmpty()) ? false : true;
    }

    public void cancel() {
        this.isCancelled = true;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        if (allocate()) {
            Handler handler = this.handler;
            long nextDelay = getNextDelay();
            Class<?> cls = Class.forName(Wg.vd(".</>83+u49p\f\"0#,\"0", (short) (FB.Xd() ^ 22514)));
            Class<?>[] clsArr = {Class.forName(Qg.kd("8.B,w5)5-r\u001680/!!*\"", (short) (Od.Xd() ^ (-23641)), (short) (Od.Xd() ^ (-28755)))), Long.TYPE};
            Object[] objArr = {this, Long.valueOf(nextDelay)};
            Method method = cls.getMethod(hg.Vd(".,//}\u001e$\u0018/\u001a\u0018", (short) (FB.Xd() ^ 6830), (short) (FB.Xd() ^ 2393)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }
}
