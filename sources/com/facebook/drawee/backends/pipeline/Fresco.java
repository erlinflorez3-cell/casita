package com.facebook.drawee.backends.pipeline;

import android.content.Context;
import com.facebook.common.logging.FLog;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import com.facebook.imagepipeline.core.NativeCodeSetup;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.soloader.nativeloader.NativeLoader;
import com.facebook.soloader.nativeloader.SystemDelegate;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.Nullable;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class Fresco {
    private static final Class<?> TAG = Fresco.class;

    @Nullable
    private static PipelineDraweeControllerBuilderSupplier sDraweeControllerBuilderSupplier = null;
    private static volatile boolean sIsInitialized = false;

    private Fresco() {
    }

    public static PipelineDraweeControllerBuilderSupplier getDraweeControllerBuilderSupplier() {
        return sDraweeControllerBuilderSupplier;
    }

    public static ImagePipeline getImagePipeline() {
        return getImagePipelineFactory().getImagePipeline();
    }

    public static ImagePipelineFactory getImagePipelineFactory() {
        return ImagePipelineFactory.getInstance();
    }

    public static boolean hasBeenInitialized() {
        return sIsInitialized;
    }

    public static void initialize(Context context) throws Throwable {
        initialize(context, null, null);
    }

    public static void initialize(Context context, @Nullable ImagePipelineConfig imagePipelineConfig) throws Throwable {
        initialize(context, imagePipelineConfig, null);
    }

    public static void initialize(Context context, @Nullable ImagePipelineConfig imagePipelineConfig, @Nullable DraweeConfig draweeConfig) throws Throwable {
        initialize(context, imagePipelineConfig, draweeConfig, true);
    }

    public static void initialize(Context context, @Nullable ImagePipelineConfig imagePipelineConfig, @Nullable DraweeConfig draweeConfig, boolean z2) throws Throwable {
        if (FrescoSystrace.isTracing()) {
            short sXd = (short) (C1607wl.Xd() ^ 12292);
            short sXd2 = (short) (C1607wl.Xd() ^ 4420);
            int[] iArr = new int["lu\u0016@]\u0016fY\f#[|\u0012Hr 8".length()];
            QB qb = new QB("lu\u0016@]\u0016fY\f#[|\u0012Hr 8");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((i2 * sXd2) ^ sXd));
                i2++;
            }
            FrescoSystrace.beginSection(new String(iArr, 0, i2));
        }
        if (sIsInitialized) {
            FLog.w(TAG, ZO.xd("\u001cYf%/2.kI;k78s\u000ed\u001d(nUI[j&j;P\u0006L>!\fvKk%i\u0006#\u001f2L\u0001)\u0005\tNk\u0004\u001et\u0012UC)3<MG\rl\u000f\u000fx@g\u001d\u0004MA>\u001e\u00057#C\u001c\f7s.(v\nTn\u0017/TC:?\naL<<fP{~z}Y%s[>\u000b\u001e\u0013\u0013kQ<\u001bt~\\6", (short) (Od.Xd() ^ (-22854)), (short) (Od.Xd() ^ (-24566))));
        } else {
            sIsInitialized = true;
        }
        NativeCodeSetup.setUseNativeCode(z2);
        if (!NativeLoader.isInitialized()) {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection(C1626yg.Ud("3&[$I{kn\u0015i\u0006\u0015\u0017\u0019d\u0015_tb\u0012Ur/5\u001e\\\u000b\u001fVDl'", (short) (C1499aX.Xd() ^ (-6751)), (short) (C1499aX.Xd() ^ (-7268))));
            }
            short sXd3 = (short) (FB.Xd() ^ 15889);
            int[] iArr2 = new int[")\u000eWr`}&^\u007f{{[N}{P1\u0017h\fW\u000fypJ\u0017<O\n\n4bw\rJn\u001d\u0004~&7Q\u0010\u00078zX\u0012&d5\u0004f\u001cx\u0003\u0018#\u0006".length()];
            QB qb2 = new QB(")\u000eWr`}&^\u007f{{[N}{P1\u0017h\fW\u000fypJ\u0017<O\n\n4bw\rJn\u001d\u0004~&7Q\u0010\u00078zX\u0012&d5\u0004f\u001cx\u0003\u0018#\u0006");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                i3++;
            }
            try {
                try {
                    try {
                        Class.forName(new String(iArr2, 0, i3)).getMethod(EO.Od("-[D3", (short) (OY.Xd() ^ 25772)), Context.class).invoke(null, context);
                    } catch (ClassNotFoundException unused) {
                        NativeLoader.initIfUninitialized(new SystemDelegate());
                        if (FrescoSystrace.isTracing()) {
                        }
                    } catch (NoSuchMethodException unused2) {
                        NativeLoader.initIfUninitialized(new SystemDelegate());
                        if (FrescoSystrace.isTracing()) {
                        }
                    }
                } catch (IllegalAccessException unused3) {
                    NativeLoader.initIfUninitialized(new SystemDelegate());
                    if (FrescoSystrace.isTracing()) {
                    }
                } catch (InvocationTargetException unused4) {
                    NativeLoader.initIfUninitialized(new SystemDelegate());
                    if (FrescoSystrace.isTracing()) {
                    }
                }
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
            } catch (Throwable th) {
                if (FrescoSystrace.isTracing()) {
                    FrescoSystrace.endSection();
                }
                throw th;
            }
        }
        short sXd4 = (short) (OY.Xd() ^ 16148);
        int[] iArr3 = new int["\u001b'\u001c)%\u001e\u0018`\u0015 \u001e#\u0013\u001b Xl\u0018\u0016\u001b\u000b\u001d\u0018".length()];
        QB qb3 = new QB("\u001b'\u001c)%\u001e\u0018`\u0015 \u001e#\u0013\u001b Xl\u0018\u0016\u001b\u000b\u001d\u0018");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(sXd4 + sXd4 + sXd4 + i4 + xuXd3.CK(iKK3));
            i4++;
        }
        Class<?> cls = Class.forName(new String(iArr3, 0, i4));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd5 = (short) (C1580rY.Xd() ^ (-28754));
        short sXd6 = (short) (C1580rY.Xd() ^ (-1994));
        int[] iArr4 = new int["\u007f~\u000f\\\r\u000e\u000b\t\u0004\u0003\u0017\r\u0014\u0014i\u0017\u0017\u001e\u0010$!".length()];
        QB qb4 = new QB("\u007f~\u000f\\\r\u000e\u000b\t\u0004\u0003\u0017\r\u0014\u0014i\u0017\u0017\u001e\u0010$!");
        int i5 = 0;
        while (qb4.YK()) {
            int iKK4 = qb4.KK();
            Xu xuXd4 = Xu.Xd(iKK4);
            iArr4[i5] = xuXd4.fK((xuXd4.CK(iKK4) - (sXd5 + i5)) - sXd6);
            i5++;
        }
        Method method = cls.getMethod(new String(iArr4, 0, i5), clsArr);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            if (imagePipelineConfig == null) {
                ImagePipelineFactory.initialize(context2);
            } else {
                ImagePipelineFactory.initialize(imagePipelineConfig);
            }
            initializeDrawee(context2, draweeConfig);
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static void initializeDrawee(Context context, @Nullable DraweeConfig draweeConfig) {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("Fresco.initializeDrawee");
        }
        PipelineDraweeControllerBuilderSupplier pipelineDraweeControllerBuilderSupplier = new PipelineDraweeControllerBuilderSupplier(context, draweeConfig);
        sDraweeControllerBuilderSupplier = pipelineDraweeControllerBuilderSupplier;
        SimpleDraweeView.initialize(pipelineDraweeControllerBuilderSupplier);
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
    }

    public static PipelineDraweeControllerBuilder newDraweeControllerBuilder() {
        return sDraweeControllerBuilderSupplier.get();
    }

    public static void shutDown() {
        sDraweeControllerBuilderSupplier = null;
        SimpleDraweeView.shutDown();
        ImagePipelineFactory.shutDown();
    }
}
