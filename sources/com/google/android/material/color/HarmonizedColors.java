package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import com.google.android.material.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.Wg;

/* JADX INFO: loaded from: classes8.dex */
public class HarmonizedColors {
    private static final String TAG = "HarmonizedColors";

    private HarmonizedColors() {
    }

    private static void addHarmonizedColorAttributesToReplacementMap(Map<Integer, Integer> map, TypedArray typedArray, TypedArray typedArray2, int i2) {
        if (typedArray2 == null) {
            typedArray2 = typedArray;
        }
        for (int i3 = 0; i3 < typedArray.getIndexCount(); i3++) {
            int resourceId = typedArray2.getResourceId(i3, 0);
            if (resourceId != 0 && typedArray.hasValue(i3) && ResourcesLoaderUtils.isColorResource(typedArray.getType(i3))) {
                map.put(Integer.valueOf(resourceId), Integer.valueOf(MaterialColors.harmonize(typedArray.getColor(i3, 0), i2)));
            }
        }
    }

    public static void applyToContextIfAvailable(Context context, HarmonizedColorsOptions harmonizedColorsOptions) throws Throwable {
        if (isHarmonizedColorAvailable()) {
            Map<Integer, Integer> mapCreateHarmonizedColorReplacementMap = createHarmonizedColorReplacementMap(context, harmonizedColorsOptions);
            int themeOverlayResourceId = harmonizedColorsOptions.getThemeOverlayResourceId(0);
            if (!ResourcesLoaderUtils.addResourcesLoaderToContext(context, mapCreateHarmonizedColorReplacementMap) || themeOverlayResourceId == 0) {
                return;
            }
            ThemeUtils.applyThemeOverlay(context, themeOverlayResourceId);
        }
    }

    private static Map<Integer, Integer> createHarmonizedColorReplacementMap(Context context, HarmonizedColorsOptions harmonizedColorsOptions) throws Throwable {
        HashMap map = new HashMap();
        int color = MaterialColors.getColor(context, harmonizedColorsOptions.getColorAttributeToHarmonizeWith(), TAG);
        for (int i2 : harmonizedColorsOptions.getColorResourceIds()) {
            map.put(Integer.valueOf(i2), Integer.valueOf(MaterialColors.harmonize(ContextCompat.getColor(context, i2), color)));
        }
        HarmonizedColorAttributes colorAttributes = harmonizedColorsOptions.getColorAttributes();
        if (colorAttributes != null) {
            int[] attributes = colorAttributes.getAttributes();
            if (attributes.length > 0) {
                int themeOverlay = colorAttributes.getThemeOverlay();
                Object[] objArr = {attributes};
                Method method = Class.forName(Wg.Zd("B28)*p\u0012$aP[,=\u000f#Az1\u0019'^\u0016`", (short) (C1607wl.Xd() ^ 5448), (short) (C1607wl.Xd() ^ 28299))).getMethod(C1561oA.Xd("\u000e\u0002\u0015\u0003\f\u0012w\u001a \u0014\u000e\u000ek ! \u0018\u0012&&\u0018'", (short) (C1633zX.Xd() ^ (-764))), int[].class);
                try {
                    method.setAccessible(true);
                    TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
                    TypedArray typedArrayObtainStyledAttributes = themeOverlay != 0 ? new ContextThemeWrapper(context, themeOverlay).obtainStyledAttributes(attributes) : null;
                    addHarmonizedColorAttributesToReplacementMap(map, typedArray, typedArrayObtainStyledAttributes, color);
                    typedArray.recycle();
                    if (typedArrayObtainStyledAttributes != null) {
                        typedArrayObtainStyledAttributes.recycle();
                    }
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
        return map;
    }

    public static boolean isHarmonizedColorAvailable() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static Context wrapContextIfAvailable(Context context, HarmonizedColorsOptions harmonizedColorsOptions) throws Throwable {
        if (!isHarmonizedColorAvailable()) {
            return context;
        }
        Map<Integer, Integer> mapCreateHarmonizedColorReplacementMap = createHarmonizedColorReplacementMap(context, harmonizedColorsOptions);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, harmonizedColorsOptions.getThemeOverlayResourceId(R.style.ThemeOverlay_Material3_HarmonizedColors_Empty));
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        return ResourcesLoaderUtils.addResourcesLoaderToContext(contextThemeWrapper, mapCreateHarmonizedColorReplacementMap) ? contextThemeWrapper : context;
    }
}
