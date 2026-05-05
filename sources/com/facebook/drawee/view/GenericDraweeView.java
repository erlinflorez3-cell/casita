package com.facebook.drawee.view;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.GenericDraweeHierarchyInflater;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class GenericDraweeView extends DraweeView<GenericDraweeHierarchy> {

    @Nullable
    private static InflateHierarchyListener sInflateHierarchyListener = null;

    public interface InflateHierarchyListener {
        void onInflateHierarchy(GenericDraweeView genericDraweeView, Context context, @Nullable AttributeSet attributeSet);
    }

    public GenericDraweeView(Context context) throws Throwable {
        super(context);
        inflateHierarchy(context, null);
    }

    public GenericDraweeView(Context context, @Nullable AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        inflateHierarchy(context, attributeSet);
    }

    public GenericDraweeView(Context context, @Nullable AttributeSet attributeSet, int i2) throws Throwable {
        super(context, attributeSet, i2);
        inflateHierarchy(context, attributeSet);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet, int i2, int i3) throws Throwable {
        super(context, attributeSet, i2, i3);
        inflateHierarchy(context, attributeSet);
    }

    public GenericDraweeView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context);
        setHierarchy(genericDraweeHierarchy);
    }

    public static void setInflateHierarchyListener(@Nullable InflateHierarchyListener inflateHierarchyListener) {
        sInflateHierarchyListener = inflateHierarchyListener;
    }

    protected void inflateHierarchy(Context context, @Nullable AttributeSet attributeSet) throws Throwable {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection("GenericDraweeView#inflateHierarchy");
        }
        GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilderInflateBuilder = GenericDraweeHierarchyInflater.inflateBuilder(context, attributeSet);
        setAspectRatio(genericDraweeHierarchyBuilderInflateBuilder.getDesiredAspectRatio());
        setHierarchy(genericDraweeHierarchyBuilderInflateBuilder.build());
        InflateHierarchyListener inflateHierarchyListener = sInflateHierarchyListener;
        if (inflateHierarchyListener != null) {
            inflateHierarchyListener.onInflateHierarchy(this, context, attributeSet);
        }
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.endSection();
        }
    }
}
