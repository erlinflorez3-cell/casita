package com.rnmaps.maps;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.DraweeHolder;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes5.dex */
public class ImageReader {
    private final Context context;
    private DataSource<CloseableReference<CloseableImage>> dataSource;
    private final ImageReadable imp;
    private final DraweeHolder<?> logoHolder;
    private final ControllerListener<ImageInfo> mLogoControllerListener = new BaseControllerListener<ImageInfo>() { // from class: com.rnmaps.maps.ImageReader.1
        AnonymousClass1() {
        }

        @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
        public void onFinalImageSet(String str, ImageInfo imageInfo, Animatable animatable) throws Throwable {
            CloseableReference closeableReference;
            Bitmap underlyingBitmap;
            try {
                closeableReference = (CloseableReference) ImageReader.this.dataSource.getResult();
                if (closeableReference != null) {
                    try {
                        CloseableImage closeableImage = (CloseableImage) closeableReference.get();
                        if ((closeableImage instanceof CloseableStaticBitmap) && (underlyingBitmap = ((CloseableStaticBitmap) closeableImage).getUnderlyingBitmap()) != null) {
                            Bitmap bitmapCopy = underlyingBitmap.copy(Bitmap.Config.ARGB_8888, true);
                            ImageReader.this.imp.setIconBitmap(bitmapCopy);
                            ImageReader.this.imp.setIconBitmapDescriptor(BitmapDescriptorFactory.fromBitmap(bitmapCopy));
                        }
                    } catch (Throwable th) {
                        th = th;
                        ImageReader.this.dataSource.close();
                        if (closeableReference != null) {
                            CloseableReference.closeSafely((CloseableReference<?>) closeableReference);
                        }
                        throw th;
                    }
                }
                ImageReader.this.dataSource.close();
                if (closeableReference != null) {
                    CloseableReference.closeSafely((CloseableReference<?>) closeableReference);
                }
                ImageReader.this.imp.update();
            } catch (Throwable th2) {
                th = th2;
                closeableReference = null;
            }
        }
    };
    private final Resources resources;

    /* JADX INFO: renamed from: com.rnmaps.maps.ImageReader$1 */
    class AnonymousClass1 extends BaseControllerListener<ImageInfo> {
        AnonymousClass1() {
        }

        @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
        public void onFinalImageSet(String str, ImageInfo imageInfo, Animatable animatable) throws Throwable {
            CloseableReference closeableReference;
            Bitmap underlyingBitmap;
            try {
                closeableReference = (CloseableReference) ImageReader.this.dataSource.getResult();
                if (closeableReference != null) {
                    try {
                        CloseableImage closeableImage = (CloseableImage) closeableReference.get();
                        if ((closeableImage instanceof CloseableStaticBitmap) && (underlyingBitmap = ((CloseableStaticBitmap) closeableImage).getUnderlyingBitmap()) != null) {
                            Bitmap bitmapCopy = underlyingBitmap.copy(Bitmap.Config.ARGB_8888, true);
                            ImageReader.this.imp.setIconBitmap(bitmapCopy);
                            ImageReader.this.imp.setIconBitmapDescriptor(BitmapDescriptorFactory.fromBitmap(bitmapCopy));
                        }
                    } catch (Throwable th) {
                        th = th;
                        ImageReader.this.dataSource.close();
                        if (closeableReference != null) {
                            CloseableReference.closeSafely((CloseableReference<?>) closeableReference);
                        }
                        throw th;
                    }
                }
                ImageReader.this.dataSource.close();
                if (closeableReference != null) {
                    CloseableReference.closeSafely((CloseableReference<?>) closeableReference);
                }
                ImageReader.this.imp.update();
            } catch (Throwable th2) {
                th = th2;
                closeableReference = null;
            }
        }
    }

    public ImageReader(Context context, Resources resources, ImageReadable imageReadable) {
        this.context = context;
        this.resources = resources;
        this.imp = imageReadable;
        DraweeHolder<?> draweeHolderCreate = DraweeHolder.create(createDraweeHeirarchy(resources), context);
        this.logoHolder = draweeHolderCreate;
        draweeHolderCreate.onAttach();
    }

    private GenericDraweeHierarchy createDraweeHeirarchy(Resources resources) {
        return new GenericDraweeHierarchyBuilder(resources).setActualImageScaleType(ScalingUtils.ScaleType.FIT_CENTER).setFadeDuration(0).build();
    }

    private BitmapDescriptor getBitmapDescriptorByName(String str) {
        return BitmapDescriptorFactory.fromResource(getDrawableResourceByName(str));
    }

    private int getDrawableResourceByName(String str) throws Throwable {
        Resources resources = this.resources;
        Context context = this.context;
        Class<?> cls = Class.forName(ZO.xd("2\u0012\u001b4qKiGK`*#@Lu=/\u00142EvQc", (short) (FB.Xd() ^ 28285), (short) (FB.Xd() ^ 8302)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1607wl.Xd() ^ 31446);
        short sXd2 = (short) (C1607wl.Xd() ^ 22308);
        int[] iArr = new int["(q@r|H~\u0006o31<\fl".length()];
        QB qb = new QB("(q@r|H~\u0006o31<\fl");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            String str2 = (String) method.invoke(context, objArr);
            short sXd3 = (short) (ZN.Xd() ^ 30375);
            int[] iArr2 = new int["M\u00165h0\rp7".length()];
            QB qb2 = new QB("M\u00165h0\rp7");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd3 + i3)));
                i3++;
            }
            return resources.getIdentifier(str, new String(iArr2, 0, i3), str2);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public void setImage(String str) {
        if (str == null) {
            this.imp.setIconBitmapDescriptor(null);
            this.imp.update();
            return;
        }
        if (str.startsWith("http://") || str.startsWith("https://") || str.startsWith("file://") || str.startsWith("asset://") || str.startsWith("data:")) {
            ImageRequest imageRequestBuild = ImageRequestBuilder.newBuilderWithSource(Uri.parse(str)).build();
            this.dataSource = Fresco.getImagePipeline().fetchDecodedImage(imageRequestBuild, this);
            this.logoHolder.setController(Fresco.newDraweeControllerBuilder().setImageRequest(imageRequestBuild).setControllerListener(this.mLogoControllerListener).setOldController(this.logoHolder.getController()).build());
            return;
        }
        this.imp.setIconBitmapDescriptor(getBitmapDescriptorByName(str));
        this.imp.setIconBitmap(BitmapFactory.decodeResource(this.resources, getDrawableResourceByName(str)));
        this.imp.update();
    }
}
