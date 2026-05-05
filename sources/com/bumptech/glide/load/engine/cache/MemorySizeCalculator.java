package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.util.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public final class MemorySizeCalculator {
    static final int BYTES_PER_ARGB_8888_PIXEL = 4;
    private static final int LOW_MEMORY_BYTE_ARRAY_POOL_DIVISOR = 2;
    private static final String TAG = "MemorySizeCalculator";
    private final int arrayPoolSize;
    private final int bitmapPoolSize;
    private final Context context;
    private final int memoryCacheSize;

    public static final class Builder {
        static final int ARRAY_POOL_SIZE_BYTES = 4194304;
        static final int BITMAP_POOL_TARGET_SCREENS = 1;
        static final float LOW_MEMORY_MAX_SIZE_MULTIPLIER = 0.33f;
        static final float MAX_SIZE_MULTIPLIER = 0.4f;
        static final int MEMORY_CACHE_TARGET_SCREENS = 2;
        ActivityManager activityManager;
        float bitmapPoolScreens;
        final Context context;
        ScreenDimensions screenDimensions;
        float memoryCacheScreens = 2.0f;
        float maxSizeMultiplier = 0.4f;
        float lowMemoryMaxSizeMultiplier = LOW_MEMORY_MAX_SIZE_MULTIPLIER;
        int arrayPoolSizeBytes = 4194304;

        public Builder(Context context) throws Throwable {
            this.bitmapPoolScreens = BITMAP_POOL_TARGET_SCREENS;
            this.context = context;
            Object[] objArr = {Ig.wd("\b9|\r\u000b)T\u0001", (short) (ZN.Xd() ^ 6700))};
            Method method = Class.forName(EO.Od("\u000bPv#\n8\rI%sv\u00150AY/\u0001IrNWB\u0010", (short) (OY.Xd() ^ 29022))).getMethod(C1593ug.zd("21A!HCE7@':HMA<?", (short) (FB.Xd() ^ 17363), (short) (FB.Xd() ^ 22546)), Class.forName(C1561oA.Qd("\u0017\r!\u000bV\u0014\b\u0014\fQu\u0016\u0013\t\r\u0005", (short) (ZN.Xd() ^ 27111))));
            try {
                method.setAccessible(true);
                this.activityManager = (ActivityManager) method.invoke(context, objArr);
                short sXd = (short) (Od.Xd() ^ (-25556));
                int[] iArr = new int["MYN[WPJ\u0013GRPUEMR\u000b\u001fJHM=OJ".length()];
                QB qb = new QB("MYN[WPJ\u0013GRPUEMR\u000b\u001fJHM=OJ");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Kd("\u001f\u001e.\r!0-42$'6", (short) (C1607wl.Xd() ^ 17251)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    this.screenDimensions = new DisplayMetricsScreenDimensions(((Resources) method2.invoke(context, objArr2)).getDisplayMetrics());
                    if (MemorySizeCalculator.isLowMemoryDevice(this.activityManager)) {
                        this.bitmapPoolScreens = 0.0f;
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }

        public MemorySizeCalculator build() {
            return new MemorySizeCalculator(this);
        }

        Builder setActivityManager(ActivityManager activityManager) {
            this.activityManager = activityManager;
            return this;
        }

        public Builder setArrayPoolSize(int i2) {
            this.arrayPoolSizeBytes = i2;
            return this;
        }

        public Builder setBitmapPoolScreens(float f2) {
            Preconditions.checkArgument(f2 >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
            this.bitmapPoolScreens = f2;
            return this;
        }

        public Builder setLowMemoryMaxSizeMultiplier(float f2) {
            Preconditions.checkArgument(f2 >= 0.0f && f2 <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            this.lowMemoryMaxSizeMultiplier = f2;
            return this;
        }

        public Builder setMaxSizeMultiplier(float f2) {
            Preconditions.checkArgument(f2 >= 0.0f && f2 <= 1.0f, "Size multiplier must be between 0 and 1");
            this.maxSizeMultiplier = f2;
            return this;
        }

        public Builder setMemoryCacheScreens(float f2) {
            Preconditions.checkArgument(f2 >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            this.memoryCacheScreens = f2;
            return this;
        }

        Builder setScreenDimensions(ScreenDimensions screenDimensions) {
            this.screenDimensions = screenDimensions;
            return this;
        }
    }

    private static final class DisplayMetricsScreenDimensions implements ScreenDimensions {
        private final DisplayMetrics displayMetrics;

        DisplayMetricsScreenDimensions(DisplayMetrics displayMetrics) {
            this.displayMetrics = displayMetrics;
        }

        @Override // com.bumptech.glide.load.engine.cache.MemorySizeCalculator.ScreenDimensions
        public int getHeightPixels() {
            return this.displayMetrics.heightPixels;
        }

        @Override // com.bumptech.glide.load.engine.cache.MemorySizeCalculator.ScreenDimensions
        public int getWidthPixels() {
            return this.displayMetrics.widthPixels;
        }
    }

    interface ScreenDimensions {
        int getHeightPixels();

        int getWidthPixels();
    }

    MemorySizeCalculator(Builder builder) {
        this.context = builder.context;
        int i2 = isLowMemoryDevice(builder.activityManager) ? builder.arrayPoolSizeBytes / 2 : builder.arrayPoolSizeBytes;
        this.arrayPoolSize = i2;
        int maxSize = getMaxSize(builder.activityManager, builder.maxSizeMultiplier, builder.lowMemoryMaxSizeMultiplier);
        float widthPixels = builder.screenDimensions.getWidthPixels() * builder.screenDimensions.getHeightPixels() * 4;
        int iRound = Math.round(builder.bitmapPoolScreens * widthPixels);
        int iRound2 = Math.round(widthPixels * builder.memoryCacheScreens);
        int i3 = maxSize - i2;
        int i4 = iRound2 + iRound;
        if (i4 <= i3) {
            this.memoryCacheSize = iRound2;
            this.bitmapPoolSize = iRound;
        } else {
            float f2 = i3 / (builder.bitmapPoolScreens + builder.memoryCacheScreens);
            this.memoryCacheSize = Math.round(builder.memoryCacheScreens * f2);
            this.bitmapPoolSize = Math.round(f2 * builder.bitmapPoolScreens);
        }
        if (Log.isLoggable(TAG, 3)) {
            String str = "Calculation complete, Calculated memory cache size: " + toMb(this.memoryCacheSize) + ", pool size: " + toMb(this.bitmapPoolSize) + ", byte array size: " + toMb(i2) + ", memory class limited? " + (i4 > maxSize) + ", max size: " + toMb(maxSize) + ", memoryClass: " + builder.activityManager.getMemoryClass() + ", isLowMemoryDevice: " + isLowMemoryDevice(builder.activityManager);
        }
    }

    private static int getMaxSize(ActivityManager activityManager, float f2, float f3) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (isLowMemoryDevice(activityManager)) {
            f2 = f3;
        }
        return Math.round(memoryClass * f2);
    }

    static boolean isLowMemoryDevice(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String toMb(int i2) {
        return Formatter.formatFileSize(this.context, i2);
    }

    public int getArrayPoolSizeInBytes() {
        return this.arrayPoolSize;
    }

    public int getBitmapPoolSize() {
        return this.bitmapPoolSize;
    }

    public int getMemoryCacheSize() {
        return this.memoryCacheSize;
    }
}
