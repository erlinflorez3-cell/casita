package com.facebook.drawee.backends.pipeline;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.common.executors.UiThreadImmediateExecutorService;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.components.DeferredReleaser;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.fresco.ui.common.ControllerListener2;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import javax.annotation.Nullable;
import yg.C1561oA;
import yg.FB;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public class PipelineDraweeControllerBuilderSupplier implements Supplier<PipelineDraweeControllerBuilder> {
    private final Set<ControllerListener> mBoundControllerListeners;
    private final Set<ControllerListener2> mBoundControllerListeners2;
    private final Context mContext;

    @Nullable
    private final ImagePerfDataListener mDefaultImagePerfDataListener;
    private final ImagePipeline mImagePipeline;
    private final PipelineDraweeControllerFactory mPipelineDraweeControllerFactory;

    public PipelineDraweeControllerBuilderSupplier(Context context) {
        this(context, null);
    }

    public PipelineDraweeControllerBuilderSupplier(Context context, @Nullable DraweeConfig draweeConfig) {
        this(context, ImagePipelineFactory.getInstance(), draweeConfig);
    }

    public PipelineDraweeControllerBuilderSupplier(Context context, ImagePipelineFactory imagePipelineFactory, @Nullable DraweeConfig draweeConfig) {
        this(context, imagePipelineFactory, null, null, draweeConfig);
    }

    public PipelineDraweeControllerBuilderSupplier(Context context, ImagePipelineFactory imagePipelineFactory, Set<ControllerListener> set, Set<ControllerListener2> set2, @Nullable DraweeConfig draweeConfig) throws Throwable {
        this.mContext = context;
        ImagePipeline imagePipeline = imagePipelineFactory.getImagePipeline();
        this.mImagePipeline = imagePipeline;
        if (draweeConfig == null || draweeConfig.getPipelineDraweeControllerFactory() == null) {
            this.mPipelineDraweeControllerFactory = new PipelineDraweeControllerFactory();
        } else {
            this.mPipelineDraweeControllerFactory = draweeConfig.getPipelineDraweeControllerFactory();
        }
        PipelineDraweeControllerFactory pipelineDraweeControllerFactory = this.mPipelineDraweeControllerFactory;
        short sXd = (short) (FB.Xd() ^ 21975);
        int[] iArr = new int[",8-:6/)q&1/4$,1i})',\u001c.)".length()];
        QB qb = new QB(",8-:6/)q&1/4$,1i})',\u001c.)");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.Kd("WVfEYhelj\\_n", (short) (FB.Xd() ^ 30064)), new Class[0]);
        try {
            method.setAccessible(true);
            pipelineDraweeControllerFactory.init((Resources) method.invoke(context, objArr), DeferredReleaser.getInstance(), imagePipelineFactory.getAnimatedDrawableFactory(context), UiThreadImmediateExecutorService.getInstance(), imagePipeline.getBitmapMemoryCache(), draweeConfig != null ? draweeConfig.getCustomDrawableFactories() : null, draweeConfig != null ? draweeConfig.getDebugOverlayEnabledSupplier() : null);
            this.mBoundControllerListeners = set;
            this.mBoundControllerListeners2 = set2;
            this.mDefaultImagePerfDataListener = draweeConfig != null ? draweeConfig.getImagePerfDataListener() : null;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.common.internal.Supplier
    public PipelineDraweeControllerBuilder get() {
        return new PipelineDraweeControllerBuilder(this.mContext, this.mPipelineDraweeControllerFactory, this.mImagePipeline, this.mBoundControllerListeners, this.mBoundControllerListeners2).setPerfDataListener(this.mDefaultImagePerfDataListener);
    }
}
