package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import com.facebook.common.logging.FLog;
import com.facebook.react.R;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.MatrixMathHelper;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.util.ReactFindViewUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseViewManager<T extends View, C extends LayoutShadowNode> extends ViewManager<T, C> implements BaseViewManagerInterface<T>, View.OnLayoutChangeListener {
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private static final String STATE_BUSY = "busy";
    private static final String STATE_CHECKED = "checked";
    private static final String STATE_EXPANDED = "expanded";
    private static final String STATE_MIXED = "mixed";
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float) Math.sqrt(5.0d);
    private static final MatrixMathHelper.MatrixDecompositionContext sMatrixDecompositionContext = new MatrixMathHelper.MatrixDecompositionContext();
    private static final double[] sTransformDecompositionArray = new double[16];

    private static class LayerEffectsHelper {
        private LayerEffectsHelper() {
        }

        public static void apply(View view, ReadableArray readableArray, Boolean bool) {
            Paint paint;
            if (Build.VERSION.SDK_INT >= 31) {
                view.setRenderEffect(null);
            }
            if (readableArray == null) {
                paint = null;
            } else if (FilterHelper.isOnlyColorMatrixFilters(readableArray)) {
                paint = new Paint();
                paint.setColorFilter(FilterHelper.parseColorMatrixFilters(readableArray));
            } else {
                if (Build.VERSION.SDK_INT >= 31) {
                    view.setRenderEffect(FilterHelper.parseFilters(readableArray));
                }
                paint = null;
            }
            if (paint == null) {
                view.setLayerType((bool == null || !bool.booleanValue()) ? 0 : 2, null);
            } else {
                view.setLayerType(2, paint);
            }
        }
    }

    public BaseViewManager() {
        super(null);
    }

    public BaseViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private void logUnsupportedPropertyWarning(String str) {
        FLog.w(ReactConstants.TAG, "%s doesn't support property '%s'", getName(), str);
    }

    private static float sanitizeFloatPropertyValue(float f2) {
        if (f2 >= -3.4028235E38f && f2 <= Float.MAX_VALUE) {
            return f2;
        }
        if (f2 < -3.4028235E38f || f2 == Float.NEGATIVE_INFINITY) {
            return -3.4028235E38f;
        }
        if (f2 > Float.MAX_VALUE || f2 == Float.POSITIVE_INFINITY) {
            return Float.MAX_VALUE;
        }
        if (Float.isNaN(f2)) {
            return 0.0f;
        }
        throw new IllegalStateException("Invalid float property value: " + f2);
    }

    private static void setPointerEventsFlag(View view, PointerEventHelper.EVENT event, boolean z2) {
        Integer num = (Integer) view.getTag(R.id.pointer_events);
        int iIntValue = num != null ? num.intValue() : 0;
        int iOrdinal = 1 << event.ordinal();
        view.setTag(R.id.pointer_events, Integer.valueOf(z2 ? (iOrdinal + iIntValue) - (iOrdinal & iIntValue) : (~iOrdinal) & iIntValue));
    }

    private void updateViewAccessibility(T t2) {
        ReactAccessibilityDelegate.setDelegate(t2, t2.isFocusable(), t2.getImportantForAccessibility());
    }

    private void updateViewContentDescription(T t2) throws Throwable {
        Dynamic dynamic;
        String str = (String) t2.getTag(R.id.accessibility_label);
        ReadableMap readableMap = (ReadableMap) t2.getTag(R.id.accessibility_state);
        ArrayList arrayList = new ArrayList();
        ReadableMap readableMap2 = (ReadableMap) t2.getTag(R.id.accessibility_value);
        if (str != null) {
            arrayList.add(str);
        }
        if (readableMap != null) {
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                Dynamic dynamic2 = readableMap.getDynamic(strNextKey);
                short sXd = (short) (C1580rY.Xd() ^ (-27671));
                int[] iArr = new int["W][Zc^^".length()];
                QB qb = new QB("W][Zc^^");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                    i2++;
                }
                if (strNextKey.equals(new String(iArr, 0, i2)) && dynamic2.getType() == ReadableType.String) {
                    String strAsString = dynamic2.asString();
                    short sXd2 = (short) (FB.Xd() ^ 26126);
                    short sXd3 = (short) (FB.Xd() ^ 7769);
                    int[] iArr2 = new int["\u001e 4#/".length()];
                    QB qb2 = new QB("\u001e 4#/");
                    int i3 = 0;
                    while (qb2.YK()) {
                        int iKK2 = qb2.KK();
                        Xu xuXd2 = Xu.Xd(iKK2);
                        iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                        i3++;
                    }
                    if (strAsString.equals(new String(iArr2, 0, i3))) {
                        Context context = t2.getContext();
                        int i4 = R.string.state_mixed_description;
                        Class<?> cls = Class.forName(C1561oA.Xd("&4+:83/y0==D6@G\u0002\u0018EEL>RO", (short) (ZN.Xd() ^ 31435)));
                        Class<?>[] clsArr = {Integer.TYPE};
                        Object[] objArr = {Integer.valueOf(i4)};
                        short sXd4 = (short) (ZN.Xd() ^ 23395);
                        int[] iArr3 = new int["\b\u0007\u0017v\u0011\u0010\b\u000e\u007f".length()];
                        QB qb3 = new QB("\b\u0007\u0017v\u0011\u0010\b\u000e\u007f");
                        int i5 = 0;
                        while (qb3.YK()) {
                            int iKK3 = qb3.KK();
                            Xu xuXd3 = Xu.Xd(iKK3);
                            iArr3[i5] = xuXd3.fK((sXd4 ^ i5) + xuXd3.CK(iKK3));
                            i5++;
                        }
                        Method method = cls.getMethod(new String(iArr3, 0, i5), clsArr);
                        try {
                            method.setAccessible(true);
                            arrayList.add((String) method.invoke(context, objArr));
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                }
                if (strNextKey.equals(Qg.kd(">PMR", (short) (OY.Xd() ^ 21456), (short) (OY.Xd() ^ 21371))) && dynamic2.getType() == ReadableType.Boolean && dynamic2.asBoolean()) {
                    Context context2 = t2.getContext();
                    int i6 = R.string.state_busy_description;
                    Class<?> cls2 = Class.forName(hg.Vd("z\u0007{\t\u0005}w@t\u007f}\u0003rz\u007f8Lwuzj|w", (short) (C1633zX.Xd() ^ (-32026)), (short) (C1633zX.Xd() ^ (-14585))));
                    Class<?>[] clsArr2 = {Integer.TYPE};
                    Object[] objArr2 = {Integer.valueOf(i6)};
                    Method method2 = cls2.getMethod(C1561oA.ud("ZWeCc`VZR", (short) (FB.Xd() ^ 5928)), clsArr2);
                    try {
                        method2.setAccessible(true);
                        arrayList.add((String) method2.invoke(context2, objArr2));
                    } catch (InvocationTargetException e3) {
                        throw e3.getCause();
                    }
                }
            }
        }
        if (readableMap2 != null) {
            String strYd = C1561oA.yd("'\u0019)&", (short) (OY.Xd() ^ 23918));
            if (readableMap2.hasKey(strYd) && (dynamic = readableMap2.getDynamic(strYd)) != null && dynamic.getType() == ReadableType.String) {
                arrayList.add(dynamic.asString());
            }
        }
        if (arrayList.size() > 0) {
            short sXd5 = (short) (C1633zX.Xd() ^ (-29947));
            int[] iArr4 = new int["{p".length()];
            QB qb4 = new QB("{p");
            int i7 = 0;
            while (qb4.YK()) {
                int iKK4 = qb4.KK();
                Xu xuXd4 = Xu.Xd(iKK4);
                iArr4[i7] = xuXd4.fK(xuXd4.CK(iKK4) - (((sXd5 + sXd5) + sXd5) + i7));
                i7++;
            }
            t2.setContentDescription(TextUtils.join(new String(iArr4, 0, i7), arrayList));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(MapBuilder.builder().put(PointerEventHelper.POINTER_CANCEL, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPointerCancel", "captured", "onPointerCancelCapture"))).put(PointerEventHelper.POINTER_DOWN, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPointerDown", "captured", "onPointerDownCapture"))).put(PointerEventHelper.POINTER_ENTER, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPointerEnter", "captured", "onPointerEnterCapture", "skipBubbling", true))).put(PointerEventHelper.POINTER_LEAVE, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPointerLeave", "captured", "onPointerLeaveCapture", "skipBubbling", true))).put(PointerEventHelper.POINTER_MOVE, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPointerMove", "captured", "onPointerMoveCapture"))).put(PointerEventHelper.POINTER_UP, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPointerUp", "captured", "onPointerUpCapture"))).put(PointerEventHelper.POINTER_OUT, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPointerOut", "captured", "onPointerOutCapture"))).put(PointerEventHelper.POINTER_OVER, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onPointerOver", "captured", "onPointerOverCapture"))).put(PointerEventHelper.CLICK, MapBuilder.of("phasedRegistrationNames", MapBuilder.of("bubbled", "onClick", "captured", "onClickCapture"))).build());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(MapBuilder.builder().put(ReactAccessibilityDelegate.TOP_ACCESSIBILITY_ACTION_EVENT, MapBuilder.of("registrationName", "onAccessibilityAction")).build());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected void onAfterUpdateTransaction(T t2) {
        super.onAfterUpdateTransaction(t2);
        updateViewAccessibility(t2);
        Boolean bool = (Boolean) t2.getTag(R.id.invalidate_transform);
        if (bool != null && bool.booleanValue()) {
            t2.addOnLayoutChangeListener(this);
            setTransformProperty(t2, (ReadableArray) t2.getTag(R.id.transform), (ReadableArray) t2.getTag(R.id.transform_origin));
            t2.setTag(R.id.invalidate_transform, false);
        }
        LayerEffectsHelper.apply(t2, (ReadableArray) t2.getTag(R.id.filter), (Boolean) t2.getTag(R.id.use_hardware_layer));
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i8 - i6;
        int i11 = i4 - i2;
        if (i5 - i3 == i9 - i7 && i11 == i10) {
            return;
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(R.id.transform_origin);
        ReadableArray readableArray2 = (ReadableArray) view.getTag(R.id.transform);
        if (readableArray2 == null && readableArray == null) {
            return;
        }
        setTransformProperty(view, readableArray2, readableArray);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected T prepareToRecycleView(ThemedReactContext themedReactContext, T t2) {
        t2.setTag(null);
        t2.setTag(R.id.pointer_events, null);
        t2.setTag(R.id.react_test_id, null);
        t2.setTag(R.id.view_tag_native_id, null);
        t2.setTag(R.id.labelled_by, null);
        t2.setTag(R.id.accessibility_label, null);
        t2.setTag(R.id.accessibility_hint, null);
        t2.setTag(R.id.accessibility_role, null);
        t2.setTag(R.id.accessibility_state, null);
        t2.setTag(R.id.accessibility_actions, null);
        t2.setTag(R.id.accessibility_value, null);
        t2.setTag(R.id.accessibility_state_expanded, null);
        setTransformProperty(t2, null, null);
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        t2.resetPivot();
        t2.setTop(0);
        t2.setBottom(0);
        t2.setLeft(0);
        t2.setRight(0);
        t2.setElevation(0.0f);
        if (Build.VERSION.SDK_INT >= 29) {
            t2.setAnimationMatrix(null);
        }
        t2.setTag(R.id.transform, null);
        t2.setTag(R.id.transform_origin, null);
        t2.setTag(R.id.invalidate_transform, null);
        t2.removeOnLayoutChangeListener(this);
        t2.setTag(R.id.use_hardware_layer, null);
        t2.setTag(R.id.filter, null);
        t2.setTag(R.id.mix_blend_mode, null);
        LayerEffectsHelper.apply(t2, null, null);
        if (Build.VERSION.SDK_INT >= 28) {
            t2.setOutlineAmbientShadowColor(ViewCompat.MEASURED_STATE_MASK);
            t2.setOutlineSpotShadowColor(ViewCompat.MEASURED_STATE_MASK);
        }
        t2.setNextFocusDownId(-1);
        t2.setNextFocusForwardId(-1);
        t2.setNextFocusRightId(-1);
        t2.setNextFocusUpId(-1);
        t2.setFocusable(false);
        t2.setFocusableInTouchMode(false);
        t2.setElevation(0.0f);
        t2.setAlpha(1.0f);
        setPadding(t2, 0, 0, 0, 0);
        t2.setForeground(null);
        return t2;
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002Rb~\u000f;\u0017z_B9*z@^Q\u0014\u0014Z\u001b")
    public void setAccessibilityActions(T t2, ReadableArray readableArray) {
        if (readableArray == null) {
            return;
        }
        t2.setTag(R.id.accessibility_actions, readableArray);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002Rb~\u000f;\u0017z_B9*zBjI\u0017\nO\u001cP*\u0017")
    public void setAccessibilityCollection(T t2, ReadableMap readableMap) {
        t2.setTag(R.id.accessibility_collection, readableMap);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002Rb~\u000f;\u0017z_B9*zBjI\u0017\nO\u001cP*\u0017mxI/")
    public void setAccessibilityCollectionItem(T t2, ReadableMap readableMap) {
        t2.setTag(R.id.accessibility_collection_item, readableMap);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002Rb~\u000f;\u0017z_B9*zGdK\u001f")
    public void setAccessibilityHint(T t2, String str) throws Throwable {
        t2.setTag(R.id.accessibility_hint, str);
        updateViewContentDescription(t2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002Rb~\u000f;\u0017z_B9*zK\\?\u0010\u0011")
    public void setAccessibilityLabel(T t2, String str) throws Throwable {
        t2.setTag(R.id.accessibility_label, str);
        updateViewContentDescription(t2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002Rb~\u000f;\u0017z_B9*zK\\?\u0010\u0011X\rK|\"")
    public void setAccessibilityLabelledBy(T t2, Dynamic dynamic) {
        if (dynamic.isNull()) {
            return;
        }
        if (dynamic.getType() == ReadableType.String) {
            t2.setTag(R.id.labelled_by, dynamic.asString());
        } else if (dynamic.getType() == ReadableType.Array) {
            t2.setTag(R.id.labelled_by, dynamic.asArray().getString(0));
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002Rb~\u000f;\u0017z_B9*zKdS\u0010vQ\u000fP*\u0017")
    public void setAccessibilityLiveRegion(T t2, String str) {
        if (str == null || str.equals("none")) {
            ViewCompat.setAccessibilityLiveRegion(t2, 0);
        } else if (str.equals("polite")) {
            ViewCompat.setAccessibilityLiveRegion(t2, 1);
        } else if (str.equals("assertive")) {
            ViewCompat.setAccessibilityLiveRegion(t2, 2);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002Rb~\u000f;\u0017z_B9*zQjI\u0010")
    public void setAccessibilityRole(T t2, String str) {
        if (str == null) {
            t2.setTag(R.id.accessibility_role, null);
        } else {
            t2.setTag(R.id.accessibility_role, ReactAccessibilityDelegate.AccessibilityRole.fromValue(str));
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002Rb~\u000f;\u0017z_B9*zU\\I \n")
    public void setAccessibilityValue(T t2, ReadableMap readableMap) throws Throwable {
        if (readableMap == null) {
            t2.setTag(R.id.accessibility_value, null);
            t2.setContentDescription(null);
        } else {
            t2.setTag(R.id.accessibility_value, readableMap);
            if (readableMap.hasKey("text")) {
                updateViewContentDescription(t2);
            }
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", defaultInt = 0, name = "\u0003Pb\u0005\u0003:\u001d\u000ed:\u0013%mnm")
    public void setBackgroundColor(T t2, int i2) {
        t2.setBackgroundColor(i2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    public void setBorderBottomLeftRadius(T t2, float f2) {
        logUnsupportedPropertyWarning("borderBottomLeftRadius");
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    public void setBorderBottomRightRadius(T t2, float f2) {
        logUnsupportedPropertyWarning("borderBottomRightRadius");
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    public void setBorderRadius(T t2, float f2) {
        logUnsupportedPropertyWarning("borderRadius");
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    public void setBorderTopLeftRadius(T t2, float f2) {
        logUnsupportedPropertyWarning("borderTopLeftRadius");
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    public void setBorderTopRightRadius(T t2, float f2) {
        logUnsupportedPropertyWarning("borderTopRightRadius");
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]B\u0006\u0005+\u0019")
    public void setClick(T t2, boolean z2) {
        setPointerEventsFlag(t2, PointerEventHelper.EVENT.CLICK, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]B\u0006\u0005+\u0019[WFD+sd")
    public void setClickCapture(T t2, boolean z2) {
        setPointerEventsFlag(t2, PointerEventHelper.EVENT.CLICK_CAPTURE, z2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0006[d\u0010|<\u0017\bd")
    public void setElevation(T t2, float f2) {
        ViewCompat.setElevation(t2, PixelUtil.toPixelFromDIP(f2));
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = "%zoPHx", name = "\u0007Xk\u000e\u0001:")
    public void setFilter(T t2, ReadableArray readableArray) {
        if (ViewUtil.getUIManagerType(t2) == 2) {
            t2.setTag(R.id.filter, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\n\\o\t\u000e<\u000f\u0007j\u001c?(Bb^B\u001e\u0018U\nP'\u0012\u0019}")
    public void setImportantForAccessibility(T t2, String str) {
        if (str == null || str.equals("auto")) {
            ViewCompat.setImportantForAccessibility(t2, 0);
            return;
        }
        if (str.equals("yes")) {
            ViewCompat.setImportantForAccessibility(t2, 1);
        } else if (str.equals("no")) {
            ViewCompat.setImportantForAccessibility(t2, 2);
        } else if (str.equals("no-hide-descendants")) {
            ViewCompat.setImportantForAccessibility(t2, 4);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0006go~\u000e1\u001b}dJ1\"`ldUl\u0011Q\u0016K\b\u0018\ti")
    public void setMixBlendMode(T t2, String str) {
        if (ViewUtil.getUIManagerType(t2) == 2) {
            t2.setTag(R.id.mix_blend_mode, BlendModeHelper.parseMixBlendMode(str));
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]L\t\u0012-\u0001\u0001eK<\u001aTdo/\u0010\u0018\\\u0017U\u001f\u000e\u0017")
    public void setMoveShouldSetResponder(T t2, boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]L\t\u0012-\u0001\u0001eK<\u001aTdo/\u0010\u0018\\\u0017U\u001f\u000e\u0017GE2kf1\f")
    public void setMoveShouldSetResponderCapture(T t2, boolean z2) {
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u000fPs\u0003\u0012-v\\")
    public void setNativeId(T t2, String str) {
        t2.setTag(R.id.view_tag_native_id, str);
        ReactFindViewUtil.notifyViewRendered(t2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0010_`|\u0005<'")
    public void setOpacity(T t2, float f2) {
        t2.setAlpha(f2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]O\t\u00056\"}h\u001b>*fq")
    public void setPointerEnter(T t2, boolean z2) {
        setPointerEventsFlag(t2, PointerEventHelper.EVENT.ENTER, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]O\t\u00056\"}h\u001b>*fq>>\u001b\u0019a\u001aL")
    public void setPointerEnterCapture(T t2, boolean z2) {
        setPointerEventsFlag(t2, PointerEventHelper.EVENT.ENTER_CAPTURE, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]O\t\u00056\"}h\"5\u0017wd")
    public void setPointerLeave(T t2, boolean z2) {
        setPointerEventsFlag(t2, PointerEventHelper.EVENT.LEAVE, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]O\t\u00056\"}h\"5\u0017wd>>\u001b\u0019a\u001aL")
    public void setPointerLeaveCapture(T t2, boolean z2) {
        setPointerEventsFlag(t2, PointerEventHelper.EVENT.LEAVE_CAPTURE, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]O\t\u00056\"}h#?,f")
    public void setPointerMove(T t2, boolean z2) {
        setPointerEventsFlag(t2, PointerEventHelper.EVENT.MOVE, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]O\t\u00056\"}h#?,fB\\M\u001f\u001a^\r")
    public void setPointerMoveCapture(T t2, boolean z2) {
        setPointerEventsFlag(t2, PointerEventHelper.EVENT.MOVE_CAPTURE, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]O\t\u00056\"}h%E*")
    public void setPointerOut(T t2, boolean z2) {
        setPointerEventsFlag(t2, PointerEventHelper.EVENT.OUT, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]O\t\u00056\"}h%E*D`kQ \u0017Q")
    public void setPointerOutCapture(T t2, boolean z2) {
        setPointerEventsFlag(t2, PointerEventHelper.EVENT.OUT_CAPTURE, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]O\t\u00056\"}h%F\u001bs")
    public void setPointerOver(T t2, boolean z2) {
        setPointerEventsFlag(t2, PointerEventHelper.EVENT.OVER, z2);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]O\t\u00056\"}h%F\u001bsB\\M\u001f\u001a^\r")
    public void setPointerOverCapture(T t2, boolean z2) {
        setPointerEventsFlag(t2, PointerEventHelper.EVENT.OVER_CAPTURE, z2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Tm}\u0001:\u0002\b>7B\u001ax`mB~\nd\u001c\\-\u000eerH4fZ#")
    public void setRenderToHardwareTexture(T t2, boolean z2) {
        t2.setTag(R.id.use_hardware_layer, Boolean.valueOf(z2));
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]Q~\u000f8\u001d\u0007Z;Bzoc")
    public void setResponderEnd(T t2, boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]Q~\u000f8\u001d\u0007Z;B|s`iQ")
    public void setResponderGrant(T t2, boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]Q~\u000f8\u001d\u0007Z;B\u0003pu`")
    public void setResponderMove(T t2, boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]Q~\u000f8\u001d\u0007Z;B\bfi`@\u001f")
    public void setResponderReject(T t2, boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]Q~\u000f8\u001d\u0007Z;B\bfk`>\u001e\n")
    public void setResponderRelease(T t2, boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]Q~\u000f8\u001d\u0007Z;B\tu`mQ")
    public void setResponderStart(T t2, boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]Q~\u000f8\u001d\u0007Z;B\nfqhF\u0019\u0006`\r")
    public void setResponderTerminate(T t2, boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]Q~\u000f8\u001d\u0007Z;B\nfqhF\u0019\u0006`\u0011V)z\nuY'je")
    public void setResponderTerminationRequest(T t2, boolean z2) {
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013^k~")
    public void setRole(T t2, String str) {
        if (str == null) {
            t2.setTag(R.id.role, null);
        } else {
            t2.setTag(R.id.role, ReactAccessibilityDelegate.Role.fromValue(str));
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013^sz\u00101\u001d\u0007")
    @Deprecated
    public void setRotation(T t2, float f2) {
        t2.setRotation(f2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014R`\u0006\u0001 ")
    @Deprecated
    public void setScaleX(T t2, float f2) {
        t2.setScaleX(f2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 1.0f, name = "\u0014R`\u0006\u0001!")
    @Deprecated
    public void setScaleY(T t2, float f2) {
        t2.setScaleY(f2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = "\"\u0001oKU", defaultInt = ViewCompat.MEASURED_STATE_MASK, name = "\u0014W`}\u000b?p\bbEB")
    public void setShadowColor(T t2, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            t2.setOutlineAmbientShadowColor(i2);
            t2.setOutlineSpotShadowColor(i2);
        }
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]R\u0002\u000b=\u001a|8B?\u0019lM\\Q\u0014\u001bQyL.\u0019\u0014rH'i")
    public void setShouldBlockNativeResponder(T t2, boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]R\u000e|:\"k^EE\"eR`Q|\n_\u0018V)\r\nv")
    public void setStartShouldSetResponder(T t2, boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]R\u000e|:\"k^EE\"eR`Q|\n_\u0018V)\r\nv'#ge4\u0019o")
    public void setStartShouldSetResponderCapture(T t2, boolean z2) {
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015Tr\u000ed\f")
    public void setTestId(T t2, String str) {
        t2.setTag(R.id.react_test_id, str);
        t2.setTag(str);
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]S\t\u0011+\u0016[WD3\u001bm")
    public void setTouchCancel(T t2, boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]S\t\u0011+\u0016]d:")
    public void setTouchEnd(T t2, boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]S\t\u0011+\u0016eeL5")
    public void setTouchMove(T t2, boolean z2) {
    }

    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0010]S\t\u0011+\u0016kj7B*")
    public void setTouchStart(T t2, boolean z2) {
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015a`\b\u000f.\u001d\u000bc")
    public void setTransform(T t2, ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t2.getTag(R.id.transform), readableArray)) {
            return;
        }
        t2.setTag(R.id.transform, readableArray);
        t2.setTag(R.id.invalidate_transform, true);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015a`\b\u000f.\u001d\u000bc%B\u001fhhi")
    public void setTransformOrigin(T t2, ReadableArray readableArray) {
        if (Objects.equals((ReadableArray) t2.getTag(R.id.transform_origin), readableArray)) {
            return;
        }
        t2.setTag(R.id.transform_origin, readableArray);
        t2.setTag(R.id.invalidate_transform, true);
    }

    protected void setTransformProperty(T t2, ReadableArray readableArray, ReadableArray readableArray2) {
        if (readableArray == null) {
            t2.setTranslationX(PixelUtil.toPixelFromDIP(0.0f));
            t2.setTranslationY(PixelUtil.toPixelFromDIP(0.0f));
            t2.setRotation(0.0f);
            t2.setRotationX(0.0f);
            t2.setRotationY(0.0f);
            t2.setScaleX(1.0f);
            t2.setScaleY(1.0f);
            t2.setCameraDistance(0.0f);
            return;
        }
        boolean z2 = ViewUtil.getUIManagerType(t2) == 2;
        MatrixMathHelper.MatrixDecompositionContext matrixDecompositionContext = sMatrixDecompositionContext;
        matrixDecompositionContext.reset();
        double[] dArr = sTransformDecompositionArray;
        TransformHelper.processTransform(readableArray, dArr, PixelUtil.toDIPFromPixel(t2.getWidth()), PixelUtil.toDIPFromPixel(t2.getHeight()), readableArray2, z2);
        MatrixMathHelper.decomposeMatrix(dArr, matrixDecompositionContext);
        t2.setTranslationX(PixelUtil.toPixelFromDIP(sanitizeFloatPropertyValue((float) matrixDecompositionContext.translation[0])));
        t2.setTranslationY(PixelUtil.toPixelFromDIP(sanitizeFloatPropertyValue((float) matrixDecompositionContext.translation[1])));
        t2.setRotation(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[2]));
        t2.setRotationX(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[0]));
        t2.setRotationY(sanitizeFloatPropertyValue((float) matrixDecompositionContext.rotationDegrees[1]));
        t2.setScaleX(sanitizeFloatPropertyValue((float) matrixDecompositionContext.scale[0]));
        t2.setScaleY(sanitizeFloatPropertyValue((float) matrixDecompositionContext.scale[1]));
        double[] dArr2 = matrixDecompositionContext.perspective;
        if (dArr2.length > 2) {
            float f2 = (float) dArr2[2];
            if (f2 == 0.0f) {
                f2 = 7.8125E-4f;
            }
            float f3 = (-1.0f) / f2;
            float f4 = DisplayMetricsHolder.getScreenDisplayMetrics().density;
            t2.setCameraDistance(sanitizeFloatPropertyValue(f4 * f4 * f3 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 0.0f, name = "\u0015a`\b\u000f4\u000f\r[.")
    @Deprecated
    public void setTranslateX(T t2, float f2) {
        t2.setTranslationX(PixelUtil.toPixelFromDIP(f2));
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", defaultFloat = 0.0f, name = "\u0015a`\b\u000f4\u000f\r[/")
    @Deprecated
    public void setTranslateY(T t2, float f2) {
        t2.setTranslationY(PixelUtil.toPixelFromDIP(f2));
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0002Rb~\u000f;\u0017z_B9*zRo>\u001f\n")
    public void setViewState(T t2, ReadableMap readableMap) throws Throwable {
        if (readableMap == null) {
            return;
        }
        short sXd = (short) (C1580rY.Xd() ^ (-19638));
        short sXd2 = (short) (C1580rY.Xd() ^ (-3619));
        int[] iArr = new int["Rf_Q_VXX".length()];
        QB qb = new QB("Rf_Q_VXX");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        String str = new String(iArr, 0, i2);
        if (readableMap.hasKey(str)) {
            t2.setTag(R.id.accessibility_state_expanded, Boolean.valueOf(readableMap.getBoolean(str)));
        }
        String strWd = Jg.Wd("90\u0018FE;}\u0002", (short) (C1580rY.Xd() ^ (-24369)), (short) (C1580rY.Xd() ^ (-20894)));
        if (readableMap.hasKey(strWd)) {
            boolean zIsSelected = t2.isSelected();
            boolean z2 = readableMap.getBoolean(strWd);
            t2.setSelected(z2);
            if (t2.isAccessibilityFocused() && zIsSelected && !z2) {
                Context context = t2.getContext();
                int i3 = R.string.state_unselected_description;
                Class<?> cls = Class.forName(ZO.xd("m=<DI\u007f\u001b>);Q4RD+X<'\u0018)vN#", (short) (C1499aX.Xd() ^ (-15815)), (short) (C1499aX.Xd() ^ (-20316))));
                Class<?>[] clsArr = {Integer.TYPE};
                Object[] objArr = {Integer.valueOf(i3)};
                Method method = cls.getMethod(C1626yg.Ud("p:U-/O+No", (short) (OY.Xd() ^ 30897), (short) (OY.Xd() ^ 20698)), clsArr);
                try {
                    method.setAccessible(true);
                    t2.announceForAccessibility((String) method.invoke(context, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        } else {
            t2.setSelected(false);
        }
        t2.setTag(R.id.accessibility_state, readableMap);
        String strWd2 = Ig.wd("DzAK=qR2", (short) (Od.Xd() ^ (-23509)));
        if (readableMap.hasKey(strWd2) && !readableMap.getBoolean(strWd2)) {
            t2.setEnabled(true);
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            if (!strNextKey.equals(EO.Od("`CEq", (short) (C1499aX.Xd() ^ (-20413)))) && !strNextKey.equals(str)) {
                String strQd = C1561oA.Qd("(,(%,%#", (short) (C1499aX.Xd() ^ (-15127)));
                if (!strNextKey.equals(strQd) || readableMap.getType(strQd) != ReadableType.String) {
                    if (t2.isAccessibilityFocused()) {
                        t2.sendAccessibilityEvent(1);
                    }
                }
            }
            updateViewContentDescription(t2);
            return;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u001b8m}\u0001@")
    public void setZIndex(T t2, float f2) {
        ViewGroupManager.setViewZIndex(t2, Math.round(f2));
        ViewParent parent = t2.getParent();
        if (parent instanceof ReactZIndexedViewGroup) {
            ((ReactZIndexedViewGroup) parent).updateDrawingOrder();
        }
    }
}
