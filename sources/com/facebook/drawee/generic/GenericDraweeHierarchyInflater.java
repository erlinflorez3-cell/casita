package com.facebook.drawee.generic;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.Nullable;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.Jg;
import yg.Od;
import yg.Xg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class GenericDraweeHierarchyInflater {
    @Nullable
    public static Drawable getDrawable(Context context, TypedArray typedArray, int i2) throws Throwable {
        int resourceId = typedArray.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        Class<?> cls = Class.forName(C1561oA.Yd("\u0014\"\u0019(&!\u001dg\u001e++2$.5o\u000633:,@=", (short) (ZN.Xd() ^ 20137)));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(resourceId)};
        Method method = cls.getMethod(Xg.qd("\t\b\u0018h\u0018\b\u001f\n\f\u0017\u0011", (short) (C1580rY.Xd() ^ (-9010)), (short) (C1580rY.Xd() ^ (-18252))), clsArr);
        try {
            method.setAccessible(true);
            return (Drawable) method.invoke(context, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private static RoundingParams getRoundingParams(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder) {
        if (genericDraweeHierarchyBuilder.getRoundingParams() == null) {
            genericDraweeHierarchyBuilder.setRoundingParams(new RoundingParams());
        }
        return genericDraweeHierarchyBuilder.getRoundingParams();
    }

    @Nullable
    public static ScalingUtils.ScaleType getScaleTypeFromXml(TypedArray typedArray, int i2) {
        switch (typedArray.getInt(i2, -2)) {
            case -1:
                return null;
            case 0:
                return ScalingUtils.ScaleType.FIT_XY;
            case 1:
                return ScalingUtils.ScaleType.FIT_START;
            case 2:
                return ScalingUtils.ScaleType.FIT_CENTER;
            case 3:
                return ScalingUtils.ScaleType.FIT_END;
            case 4:
                return ScalingUtils.ScaleType.CENTER;
            case 5:
                return ScalingUtils.ScaleType.CENTER_INSIDE;
            case 6:
                return ScalingUtils.ScaleType.CENTER_CROP;
            case 7:
                return ScalingUtils.ScaleType.FOCUS_CROP;
            case 8:
                return ScalingUtils.ScaleType.FIT_BOTTOM_START;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    public static GenericDraweeHierarchyBuilder inflateBuilder(Context context, @Nullable AttributeSet attributeSet) throws Throwable {
        if (FrescoSystrace.isTracing()) {
            FrescoSystrace.beginSection(Jg.Wd("\n\u0014mQ/#k87\u0013\u001aTGv\u0018`^(\u001awLJs\u0016Z:#\u007f{x0\u0012z\\$$u?C\"\u0005YK%", (short) (Od.Xd() ^ (-30500)), (short) (Od.Xd() ^ (-12478))));
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("\u0003\u001fc]\u0019-W\u001fH5UW8\u001aPbF\u0007@1k\u0012\u0019", (short) (Od.Xd() ^ (-23318)), (short) (Od.Xd() ^ (-9997)))).getMethod(C1626yg.Ud("cOR\f\u0017\u000bEiA .U", (short) (C1607wl.Xd() ^ 15093), (short) (C1607wl.Xd() ^ 31542)), new Class[0]);
        try {
            method.setAccessible(true);
            GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilderUpdateBuilder = updateBuilder(new GenericDraweeHierarchyBuilder((Resources) method.invoke(context, objArr)), context, attributeSet);
            if (FrescoSystrace.isTracing()) {
                FrescoSystrace.endSection();
            }
            return genericDraweeHierarchyBuilderUpdateBuilder;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static GenericDraweeHierarchy inflateHierarchy(Context context, @Nullable AttributeSet attributeSet) {
        return inflateBuilder(context, attributeSet).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:325:0x0303 A[PHI: r2 r3 r5
  0x0303: PHI (r2v22 boolean) = (r2v20 boolean), (r2v24 boolean) binds: [B:359:0x0351, B:324:0x0301] A[DONT_GENERATE, DONT_INLINE]
  0x0303: PHI (r3v14 boolean) = (r3v12 boolean), (r3v16 boolean) binds: [B:359:0x0351, B:324:0x0301] A[DONT_GENERATE, DONT_INLINE]
  0x0303: PHI (r5v9 boolean) = (r5v7 boolean), (r5v11 boolean) binds: [B:359:0x0351, B:324:0x0301] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.drawee.generic.GenericDraweeHierarchyBuilder updateBuilder(com.facebook.drawee.generic.GenericDraweeHierarchyBuilder r16, android.content.Context r17, @javax.annotation.Nullable android.util.AttributeSet r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 861
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.generic.GenericDraweeHierarchyInflater.updateBuilder(com.facebook.drawee.generic.GenericDraweeHierarchyBuilder, android.content.Context, android.util.AttributeSet):com.facebook.drawee.generic.GenericDraweeHierarchyBuilder");
    }
}
