package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.graphics.ColorUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1580rY;
import yg.C1607wl;
import yg.EO;
import yg.Ig;

/* JADX INFO: loaded from: classes.dex */
public final class AppCompatDrawableManager {
    private static final boolean DEBUG = false;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static AppCompatDrawableManager INSTANCE = null;
    private static final String TAG = "AppCompatDrawableManag";
    private ResourceManagerInternal mResourceManager;

    public static synchronized void preload() {
        if (INSTANCE == null) {
            AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
            INSTANCE = appCompatDrawableManager;
            appCompatDrawableManager.mResourceManager = ResourceManagerInternal.get();
            INSTANCE.mResourceManager.setHooks(new ResourceManagerInternal.ResourceManagerHooks() { // from class: androidx.appcompat.widget.AppCompatDrawableManager.1
                private final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                private final int[] TINT_COLOR_CONTROL_NORMAL = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                private final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
                private final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                private final int[] TINT_COLOR_CONTROL_STATE_LIST = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                private final int[] TINT_CHECKABLE_BUTTON_LIST = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

                AnonymousClass1() {
                }

                private ColorStateList createDefaultButtonColorStateList(Context context) {
                    return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, R.attr.colorButtonNormal));
                }

                private ColorStateList createBorderlessButtonColorStateList(Context context) {
                    return createButtonColorStateList(context, 0);
                }

                private ColorStateList createColoredButtonColorStateList(Context context) {
                    return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, R.attr.colorAccent));
                }

                private ColorStateList createButtonColorStateList(Context context, int i2) throws Throwable {
                    int themeAttrColor = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlHighlight);
                    return new ColorStateList(new int[][]{ThemeUtils.DISABLED_STATE_SET, ThemeUtils.PRESSED_STATE_SET, ThemeUtils.FOCUSED_STATE_SET, ThemeUtils.EMPTY_STATE_SET}, new int[]{ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorButtonNormal), ColorUtils.compositeColors(themeAttrColor, i2), ColorUtils.compositeColors(themeAttrColor, i2), i2});
                }

                private ColorStateList createSwitchThumbColorStateList(Context context) {
                    int[][] iArr = new int[3][];
                    int[] iArr2 = new int[3];
                    ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, R.attr.colorSwitchThumbNormal);
                    if (themeAttrColorStateList != null && themeAttrColorStateList.isStateful()) {
                        int[] iArr3 = ThemeUtils.DISABLED_STATE_SET;
                        iArr[0] = iArr3;
                        iArr2[0] = themeAttrColorStateList.getColorForState(iArr3, 0);
                        iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                        iArr2[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
                        iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                        iArr2[2] = themeAttrColorStateList.getDefaultColor();
                    } else {
                        iArr[0] = ThemeUtils.DISABLED_STATE_SET;
                        iArr2[0] = ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorSwitchThumbNormal);
                        iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                        iArr2[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
                        iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                        iArr2[2] = ThemeUtils.getThemeAttrColor(context, R.attr.colorSwitchThumbNormal);
                    }
                    return new ColorStateList(iArr, iArr2);
                }

                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                public Drawable createDrawableFor(ResourceManagerInternal resourceManagerInternal, Context context, int i2) {
                    if (i2 == R.drawable.abc_cab_background_top_material) {
                        return new LayerDrawable(new Drawable[]{resourceManagerInternal.getDrawable(context, R.drawable.abc_cab_background_internal_bg), resourceManagerInternal.getDrawable(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
                    }
                    if (i2 == R.drawable.abc_ratingbar_material) {
                        return getRatingBarLayerDrawable(resourceManagerInternal, context, R.dimen.abc_star_big);
                    }
                    if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                        return getRatingBarLayerDrawable(resourceManagerInternal, context, R.dimen.abc_star_medium);
                    }
                    if (i2 == R.drawable.abc_ratingbar_small_material) {
                        return getRatingBarLayerDrawable(resourceManagerInternal, context, R.dimen.abc_star_small);
                    }
                    return null;
                }

                private LayerDrawable getRatingBarLayerDrawable(ResourceManagerInternal resourceManagerInternal, Context context, int i2) throws Throwable {
                    BitmapDrawable bitmapDrawable;
                    BitmapDrawable bitmapDrawable2;
                    BitmapDrawable bitmapDrawable3;
                    Object[] objArr = new Object[0];
                    Method method = Class.forName(Ig.wd("qO#\r\u0019^\u0002J])2\u000ePWM`AW;\f9n\u0017", (short) (C1580rY.Xd() ^ (-1265)))).getMethod(EO.Od("`\f\u000fG-\b\u0012JqQSA", (short) (C1607wl.Xd() ^ 7423)), new Class[0]);
                    try {
                        method.setAccessible(true);
                        int dimensionPixelSize = ((Resources) method.invoke(context, objArr)).getDimensionPixelSize(i2);
                        Drawable drawable = resourceManagerInternal.getDrawable(context, R.drawable.abc_star_black_48dp);
                        Drawable drawable2 = resourceManagerInternal.getDrawable(context, R.drawable.abc_star_half_black_48dp);
                        if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable = (BitmapDrawable) drawable;
                            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                        } else {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(bitmapCreateBitmap);
                            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            drawable.draw(canvas);
                            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
                        }
                        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
                        if ((drawable2 instanceof BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
                            bitmapDrawable3 = (BitmapDrawable) drawable2;
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                            drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                            drawable2.draw(canvas2);
                            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
                        }
                        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
                        layerDrawable.setId(0, android.R.id.background);
                        layerDrawable.setId(1, android.R.id.secondaryProgress);
                        layerDrawable.setId(2, android.R.id.progress);
                        return layerDrawable;
                    } catch (InvocationTargetException e2) {
                        throw e2.getCause();
                    }
                }

                private void setPorterDuffColorFilter(Drawable drawable, int i2, PorterDuff.Mode mode) {
                    Drawable drawableMutate = drawable.mutate();
                    if (mode == null) {
                        mode = AppCompatDrawableManager.DEFAULT_MODE;
                    }
                    drawableMutate.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(i2, mode));
                }

                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                public boolean tintDrawable(Context context, int i2, Drawable drawable) {
                    if (i2 == R.drawable.abc_seekbar_track_material) {
                        LayerDrawable layerDrawable = (LayerDrawable) drawable;
                        setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(android.R.id.background), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlNormal), AppCompatDrawableManager.DEFAULT_MODE);
                        setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlNormal), AppCompatDrawableManager.DEFAULT_MODE);
                        setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(android.R.id.progress), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated), AppCompatDrawableManager.DEFAULT_MODE);
                        return true;
                    }
                    if (i2 != R.drawable.abc_ratingbar_material && i2 != R.drawable.abc_ratingbar_indicator_material && i2 != R.drawable.abc_ratingbar_small_material) {
                        return false;
                    }
                    LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                    setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(android.R.id.background), ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorControlNormal), AppCompatDrawableManager.DEFAULT_MODE);
                    setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated), AppCompatDrawableManager.DEFAULT_MODE);
                    setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(android.R.id.progress), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated), AppCompatDrawableManager.DEFAULT_MODE);
                    return true;
                }

                private boolean arrayContains(int[] iArr, int i2) {
                    for (int i3 : iArr) {
                        if (i3 == i2) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                public ColorStateList getTintListForDrawableRes(Context context, int i2) {
                    if (i2 == R.drawable.abc_edit_text_material) {
                        return AppCompatResources.getColorStateList(context, R.color.abc_tint_edittext);
                    }
                    if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
                        return AppCompatResources.getColorStateList(context, R.color.abc_tint_switch_track);
                    }
                    if (i2 == R.drawable.abc_switch_thumb_material) {
                        return createSwitchThumbColorStateList(context);
                    }
                    if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                        return createDefaultButtonColorStateList(context);
                    }
                    if (i2 == R.drawable.abc_btn_borderless_material) {
                        return createBorderlessButtonColorStateList(context);
                    }
                    if (i2 == R.drawable.abc_btn_colored_material) {
                        return createColoredButtonColorStateList(context);
                    }
                    if (i2 == R.drawable.abc_spinner_mtrl_am_alpha || i2 == R.drawable.abc_spinner_textfield_background_material) {
                        return AppCompatResources.getColorStateList(context, R.color.abc_tint_spinner);
                    }
                    if (arrayContains(this.TINT_COLOR_CONTROL_NORMAL, i2)) {
                        return ThemeUtils.getThemeAttrColorStateList(context, R.attr.colorControlNormal);
                    }
                    if (arrayContains(this.TINT_COLOR_CONTROL_STATE_LIST, i2)) {
                        return AppCompatResources.getColorStateList(context, R.color.abc_tint_default);
                    }
                    if (arrayContains(this.TINT_CHECKABLE_BUTTON_LIST, i2)) {
                        return AppCompatResources.getColorStateList(context, R.color.abc_tint_btn_checkable);
                    }
                    if (i2 == R.drawable.abc_seekbar_thumb_material) {
                        return AppCompatResources.getColorStateList(context, R.color.abc_tint_seek_thumb);
                    }
                    return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:35:0x0015  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x005d A[RETURN] */
                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public boolean tintDrawableUsingColorFilter(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
                    /*
                        r7 = this;
                        android.graphics.PorterDuff$Mode r5 = androidx.appcompat.widget.AppCompatDrawableManager.access$000()
                        int[] r0 = r7.COLORFILTER_TINT_COLOR_CONTROL_NORMAL
                        boolean r0 = r7.arrayContains(r0, r9)
                        r6 = 1
                        r1 = 0
                        r4 = -1
                        if (r0 == 0) goto L2a
                        int r3 = androidx.appcompat.R.attr.colorControlNormal
                    L11:
                        r0 = r6
                    L12:
                        r2 = r4
                    L13:
                        if (r0 == 0) goto L5d
                        android.graphics.drawable.Drawable r1 = r10.mutate()
                        int r0 = androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(r8, r3)
                        android.graphics.PorterDuffColorFilter r0 = androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(r0, r5)
                        r1.setColorFilter(r0)
                        if (r2 == r4) goto L29
                        r1.setAlpha(r2)
                    L29:
                        return r6
                    L2a:
                        int[] r0 = r7.COLORFILTER_COLOR_CONTROL_ACTIVATED
                        boolean r0 = r7.arrayContains(r0, r9)
                        if (r0 == 0) goto L35
                        int r3 = androidx.appcompat.R.attr.colorControlActivated
                        goto L11
                    L35:
                        int[] r0 = r7.COLORFILTER_COLOR_BACKGROUND_MULTIPLY
                        boolean r0 = r7.arrayContains(r0, r9)
                        r3 = 16842801(0x1010031, float:2.3693695E-38)
                        if (r0 == 0) goto L45
                        android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.MULTIPLY
                    L42:
                        r2 = r4
                        r0 = r6
                        goto L13
                    L45:
                        int r0 = androidx.appcompat.R.drawable.abc_list_divider_mtrl_alpha
                        if (r9 != r0) goto L55
                        r0 = 1109603123(0x42233333, float:40.8)
                        int r2 = java.lang.Math.round(r0)
                        r3 = 16842800(0x1010030, float:2.3693693E-38)
                        r0 = r6
                        goto L13
                    L55:
                        int r0 = androidx.appcompat.R.drawable.abc_dialog_material_background
                        if (r9 != r0) goto L5a
                        goto L42
                    L5a:
                        r3 = r1
                        r0 = r3
                        goto L12
                    L5d:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1.tintDrawableUsingColorFilter(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
                }

                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                public PorterDuff.Mode getTintModeForDrawableRes(int i2) {
                    if (i2 == R.drawable.abc_switch_thumb_material) {
                        return PorterDuff.Mode.MULTIPLY;
                    }
                    return null;
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatDrawableManager$1 */
    class AnonymousClass1 implements ResourceManagerInternal.ResourceManagerHooks {
        private final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        private final int[] TINT_COLOR_CONTROL_NORMAL = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        private final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        private final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        private final int[] TINT_COLOR_CONTROL_STATE_LIST = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        private final int[] TINT_CHECKABLE_BUTTON_LIST = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        AnonymousClass1() {
        }

        private ColorStateList createDefaultButtonColorStateList(Context context) {
            return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, R.attr.colorButtonNormal));
        }

        private ColorStateList createBorderlessButtonColorStateList(Context context) {
            return createButtonColorStateList(context, 0);
        }

        private ColorStateList createColoredButtonColorStateList(Context context) {
            return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, R.attr.colorAccent));
        }

        private ColorStateList createButtonColorStateList(Context context, int i2) throws Throwable {
            int themeAttrColor = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{ThemeUtils.DISABLED_STATE_SET, ThemeUtils.PRESSED_STATE_SET, ThemeUtils.FOCUSED_STATE_SET, ThemeUtils.EMPTY_STATE_SET}, new int[]{ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorButtonNormal), ColorUtils.compositeColors(themeAttrColor, i2), ColorUtils.compositeColors(themeAttrColor, i2), i2});
        }

        private ColorStateList createSwitchThumbColorStateList(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, R.attr.colorSwitchThumbNormal);
            if (themeAttrColorStateList != null && themeAttrColorStateList.isStateful()) {
                int[] iArr3 = ThemeUtils.DISABLED_STATE_SET;
                iArr[0] = iArr3;
                iArr2[0] = themeAttrColorStateList.getColorForState(iArr3, 0);
                iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                iArr2[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
                iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                iArr2[2] = themeAttrColorStateList.getDefaultColor();
            } else {
                iArr[0] = ThemeUtils.DISABLED_STATE_SET;
                iArr2[0] = ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                iArr2[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
                iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                iArr2[2] = ThemeUtils.getThemeAttrColor(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        public Drawable createDrawableFor(ResourceManagerInternal resourceManagerInternal, Context context, int i2) {
            if (i2 == R.drawable.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{resourceManagerInternal.getDrawable(context, R.drawable.abc_cab_background_internal_bg), resourceManagerInternal.getDrawable(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            }
            if (i2 == R.drawable.abc_ratingbar_material) {
                return getRatingBarLayerDrawable(resourceManagerInternal, context, R.dimen.abc_star_big);
            }
            if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                return getRatingBarLayerDrawable(resourceManagerInternal, context, R.dimen.abc_star_medium);
            }
            if (i2 == R.drawable.abc_ratingbar_small_material) {
                return getRatingBarLayerDrawable(resourceManagerInternal, context, R.dimen.abc_star_small);
            }
            return null;
        }

        private LayerDrawable getRatingBarLayerDrawable(ResourceManagerInternal resourceManagerInternal, Context context, int i2) throws Throwable {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            Object[] objArr = new Object[0];
            Method method = Class.forName(Ig.wd("qO#\r\u0019^\u0002J])2\u000ePWM`AW;\f9n\u0017", (short) (C1580rY.Xd() ^ (-1265)))).getMethod(EO.Od("`\f\u000fG-\b\u0012JqQSA", (short) (C1607wl.Xd() ^ 7423)), new Class[0]);
            try {
                method.setAccessible(true);
                int dimensionPixelSize = ((Resources) method.invoke(context, objArr)).getDimensionPixelSize(i2);
                Drawable drawable = resourceManagerInternal.getDrawable(context, R.drawable.abc_star_black_48dp);
                Drawable drawable2 = resourceManagerInternal.getDrawable(context, R.drawable.abc_star_half_black_48dp);
                if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
                    bitmapDrawable = (BitmapDrawable) drawable;
                    bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                } else {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    drawable.draw(canvas);
                    bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                    bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
                }
                bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
                if ((drawable2 instanceof BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
                    bitmapDrawable3 = (BitmapDrawable) drawable2;
                } else {
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                    drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                    drawable2.draw(canvas2);
                    bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
                }
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
                layerDrawable.setId(0, android.R.id.background);
                layerDrawable.setId(1, android.R.id.secondaryProgress);
                layerDrawable.setId(2, android.R.id.progress);
                return layerDrawable;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        private void setPorterDuffColorFilter(Drawable drawable, int i2, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = AppCompatDrawableManager.DEFAULT_MODE;
            }
            drawableMutate.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(i2, mode));
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        public boolean tintDrawable(Context context, int i2, Drawable drawable) {
            if (i2 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(android.R.id.background), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlNormal), AppCompatDrawableManager.DEFAULT_MODE);
                setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlNormal), AppCompatDrawableManager.DEFAULT_MODE);
                setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(android.R.id.progress), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated), AppCompatDrawableManager.DEFAULT_MODE);
                return true;
            }
            if (i2 != R.drawable.abc_ratingbar_material && i2 != R.drawable.abc_ratingbar_indicator_material && i2 != R.drawable.abc_ratingbar_small_material) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(android.R.id.background), ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorControlNormal), AppCompatDrawableManager.DEFAULT_MODE);
            setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated), AppCompatDrawableManager.DEFAULT_MODE);
            setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(android.R.id.progress), ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated), AppCompatDrawableManager.DEFAULT_MODE);
            return true;
        }

        private boolean arrayContains(int[] iArr, int i2) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        public ColorStateList getTintListForDrawableRes(Context context, int i2) {
            if (i2 == R.drawable.abc_edit_text_material) {
                return AppCompatResources.getColorStateList(context, R.color.abc_tint_edittext);
            }
            if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
                return AppCompatResources.getColorStateList(context, R.color.abc_tint_switch_track);
            }
            if (i2 == R.drawable.abc_switch_thumb_material) {
                return createSwitchThumbColorStateList(context);
            }
            if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                return createDefaultButtonColorStateList(context);
            }
            if (i2 == R.drawable.abc_btn_borderless_material) {
                return createBorderlessButtonColorStateList(context);
            }
            if (i2 == R.drawable.abc_btn_colored_material) {
                return createColoredButtonColorStateList(context);
            }
            if (i2 == R.drawable.abc_spinner_mtrl_am_alpha || i2 == R.drawable.abc_spinner_textfield_background_material) {
                return AppCompatResources.getColorStateList(context, R.color.abc_tint_spinner);
            }
            if (arrayContains(this.TINT_COLOR_CONTROL_NORMAL, i2)) {
                return ThemeUtils.getThemeAttrColorStateList(context, R.attr.colorControlNormal);
            }
            if (arrayContains(this.TINT_COLOR_CONTROL_STATE_LIST, i2)) {
                return AppCompatResources.getColorStateList(context, R.color.abc_tint_default);
            }
            if (arrayContains(this.TINT_CHECKABLE_BUTTON_LIST, i2)) {
                return AppCompatResources.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i2 == R.drawable.abc_seekbar_thumb_material) {
                return AppCompatResources.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        public boolean tintDrawableUsingColorFilter(Context v2, int v3, Drawable v4) {
            /*
                this = this;
                android.graphics.PorterDuff$Mode r5 = androidx.appcompat.widget.AppCompatDrawableManager.access$000()
                int[] r0 = r7.COLORFILTER_TINT_COLOR_CONTROL_NORMAL
                boolean r0 = r7.arrayContains(r0, r9)
                r6 = 1
                r1 = 0
                r4 = -1
                if (r0 == 0) goto L2a
                int r3 = androidx.appcompat.R.attr.colorControlNormal
            L11:
                r0 = r6
            L12:
                r2 = r4
            L13:
                if (r0 == 0) goto L5d
                android.graphics.drawable.Drawable r1 = r10.mutate()
                int r0 = androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(r8, r3)
                android.graphics.PorterDuffColorFilter r0 = androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(r0, r5)
                r1.setColorFilter(r0)
                if (r2 == r4) goto L29
                r1.setAlpha(r2)
            L29:
                return r6
            L2a:
                int[] r0 = r7.COLORFILTER_COLOR_CONTROL_ACTIVATED
                boolean r0 = r7.arrayContains(r0, r9)
                if (r0 == 0) goto L35
                int r3 = androidx.appcompat.R.attr.colorControlActivated
                goto L11
            L35:
                int[] r0 = r7.COLORFILTER_COLOR_BACKGROUND_MULTIPLY
                boolean r0 = r7.arrayContains(r0, r9)
                r3 = 16842801(0x1010031, float:2.3693695E-38)
                if (r0 == 0) goto L45
                android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.MULTIPLY
            L42:
                r2 = r4
                r0 = r6
                goto L13
            L45:
                int r0 = androidx.appcompat.R.drawable.abc_list_divider_mtrl_alpha
                if (r9 != r0) goto L55
                r0 = 1109603123(0x42233333, float:40.8)
                int r2 = java.lang.Math.round(r0)
                r3 = 16842800(0x1010030, float:2.3693693E-38)
                r0 = r6
                goto L13
            L55:
                int r0 = androidx.appcompat.R.drawable.abc_dialog_material_background
                if (r9 != r0) goto L5a
                goto L42
            L5a:
                r3 = r1
                r0 = r3
                goto L12
            L5d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1.tintDrawableUsingColorFilter(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        public PorterDuff.Mode getTintModeForDrawableRes(int i2) {
            if (i2 == R.drawable.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }
    }

    public static synchronized AppCompatDrawableManager get() {
        if (INSTANCE == null) {
            preload();
        }
        return INSTANCE;
    }

    public synchronized Drawable getDrawable(Context context, int i2) {
        return this.mResourceManager.getDrawable(context, i2);
    }

    synchronized Drawable getDrawable(Context context, int i2, boolean z2) {
        return this.mResourceManager.getDrawable(context, i2, z2);
    }

    public synchronized void onConfigurationChanged(Context context) {
        this.mResourceManager.onConfigurationChanged(context);
    }

    synchronized Drawable onDrawableLoadedFromResources(Context context, VectorEnabledTintResources vectorEnabledTintResources, int i2) {
        return this.mResourceManager.onDrawableLoadedFromResources(context, vectorEnabledTintResources, i2);
    }

    boolean tintDrawableUsingColorFilter(Context context, int i2, Drawable drawable) {
        return this.mResourceManager.tintDrawableUsingColorFilter(context, i2, drawable);
    }

    synchronized ColorStateList getTintList(Context context, int i2) {
        return this.mResourceManager.getTintList(context, i2);
    }

    static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        ResourceManagerInternal.tintDrawable(drawable, tintInfo, iArr);
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i2, PorterDuff.Mode mode) {
        return ResourceManagerInternal.getPorterDuffColorFilter(i2, mode);
    }
}
