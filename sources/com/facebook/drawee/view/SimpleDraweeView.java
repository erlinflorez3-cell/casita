package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.util.UriUtil;
import com.facebook.drawee.R;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.Nullable;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Xg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class SimpleDraweeView extends GenericDraweeView {

    @Nullable
    private static Supplier<? extends AbstractDraweeControllerBuilder> sDraweecontrollerbuildersupplier = null;
    private AbstractDraweeControllerBuilder mControllerBuilder;

    public SimpleDraweeView(Context context) {
        super(context);
        init(context, null);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init(context, attributeSet);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        init(context, attributeSet);
    }

    public SimpleDraweeView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
        init(context, null);
    }

    private void init(Context context, @Nullable AttributeSet attributeSet) {
        int resourceId;
        try {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.beginSection(C1561oA.yd("|\u0014\u0015\u0019\u001a\u0014o\u001f\u0013*\u0015\u0016\f \u0019,\\$&\"2", (short) (OY.Xd() ^ 2890)));
            }
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                Preconditions.checkNotNull(sDraweecontrollerbuildersupplier, C1561oA.Yd("$;@DA;\u001bJ:Q@A3GDW\u0001YDW\u0005TV\\\tSYUaWP\\ZlXX\u0016", (short) (OY.Xd() ^ 1221)));
                this.mControllerBuilder = sDraweecontrollerbuildersupplier.get();
            }
            if (attributeSet != null) {
                int[] iArr = R.styleable.SimpleDraweeView;
                Class<?> cls = Class.forName(Xg.qd("hvm|zuq<r\u007f\u007f\u0007x\u0003\nDZ\b\b\u000f\u0001\u0015\u0012", (short) (FB.Xd() ^ 31573), (short) (FB.Xd() ^ 19087)));
                Class<?>[] clsArr = new Class[2];
                clsArr[0] = Class.forName(Jg.Wd("\u0011U\u0005j!2f\b\t?N\t$n;rJx+T\rU|&n", (short) (ZN.Xd() ^ 351), (short) (ZN.Xd() ^ 7799)));
                clsArr[1] = int[].class;
                Object[] objArr = {attributeSet, iArr};
                Method method = cls.getMethod(ZO.xd("R.*gq\u0013\u0004WgO\u0005rQ\f\u0019CIpvj$\u0006", (short) (C1580rY.Xd() ^ (-19389)), (short) (C1580rY.Xd() ^ (-13935))), clsArr);
                try {
                    method.setAccessible(true);
                    TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                    try {
                        if (typedArray.hasValue(R.styleable.SimpleDraweeView_actualImageUri)) {
                            setImageURI(Uri.parse(typedArray.getString(R.styleable.SimpleDraweeView_actualImageUri)), (Object) null);
                        } else if (typedArray.hasValue(R.styleable.SimpleDraweeView_actualImageResource) && (resourceId = typedArray.getResourceId(R.styleable.SimpleDraweeView_actualImageResource, -1)) != -1) {
                            if (isInEditMode()) {
                                setImageResource(resourceId);
                            } else {
                                setActualImageResource(resourceId);
                            }
                        }
                    } finally {
                        typedArray.recycle();
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        } finally {
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
        }
    }

    public static void initialize(Supplier<? extends AbstractDraweeControllerBuilder> supplier) {
        sDraweecontrollerbuildersupplier = supplier;
    }

    public static void shutDown() {
        sDraweecontrollerbuildersupplier = null;
    }

    public AbstractDraweeControllerBuilder getControllerBuilder() {
        return this.mControllerBuilder;
    }

    public void setActualImageResource(int i2) {
        setActualImageResource(i2, null);
    }

    public void setActualImageResource(int i2, @Nullable Object obj) {
        setImageURI(UriUtil.getUriForResourceId(i2), obj);
    }

    public void setImageRequest(ImageRequest imageRequest) {
        setController(this.mControllerBuilder.setImageRequest(imageRequest).setOldController(getController()).build());
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView
    public void setImageResource(int i2) {
        super.setImageResource(i2);
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        setImageURI(uri, (Object) null);
    }

    public void setImageURI(Uri uri, @Nullable Object obj) {
        setController(this.mControllerBuilder.setCallerContext(obj).setUri(uri).setOldController(getController()).build());
    }

    public void setImageURI(@Nullable String str) {
        setImageURI(str, (Object) null);
    }

    public void setImageURI(@Nullable String str, @Nullable Object obj) {
        setImageURI(str != null ? Uri.parse(str) : null, obj);
    }
}
