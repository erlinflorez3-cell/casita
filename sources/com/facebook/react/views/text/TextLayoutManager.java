package com.facebook.react.views.text;

import android.content.Context;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.SetSpanOperation;
import com.facebook.yoga.YogaConstants;
import com.facebook.yoga.YogaMeasureMode;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class TextLayoutManager {
    public static final short AS_KEY_CACHE_ID = 3;
    public static final short AS_KEY_FRAGMENTS = 2;
    public static final short AS_KEY_HASH = 0;
    public static final short AS_KEY_STRING = 1;
    private static final boolean DEFAULT_ADJUST_FONT_SIZE_TO_FIT = false;
    private static final boolean DEFAULT_INCLUDE_FONT_PADDING = true;
    private static final boolean ENABLE_MEASURE_LOGGING;
    public static final short FR_KEY_HEIGHT = 4;
    public static final short FR_KEY_IS_ATTACHMENT = 2;
    public static final short FR_KEY_REACT_TAG = 1;
    public static final short FR_KEY_STRING = 0;
    public static final short FR_KEY_TEXT_ATTRIBUTES = 5;
    public static final short FR_KEY_WIDTH = 3;
    private static final String INLINE_VIEW_PLACEHOLDER = "0";
    public static final short PA_KEY_ADJUST_FONT_SIZE_TO_FIT = 3;
    public static final short PA_KEY_ELLIPSIZE_MODE = 1;
    public static final short PA_KEY_HYPHENATION_FREQUENCY = 5;
    public static final short PA_KEY_INCLUDE_FONT_PADDING = 4;
    public static final short PA_KEY_MAXIMUM_FONT_SIZE = 7;
    public static final short PA_KEY_MAX_NUMBER_OF_LINES = 0;
    public static final short PA_KEY_MINIMUM_FONT_SIZE = 6;
    public static final short PA_KEY_TEXT_BREAK_STRATEGY = 2;
    private static final String TAG;
    private static final ConcurrentHashMap<Integer, Spannable> sTagToSpannableCache;
    private static final TextPaint sTextPaintInstance;

    static {
        boolean z2 = ReactBuildConfig.DEBUG;
        ENABLE_MEASURE_LOGGING = false;
        TAG = "TextLayoutManager";
        sTextPaintInstance = new TextPaint(1);
        sTagToSpannableCache = new ConcurrentHashMap<>();
    }

    public static void adjustSpannableFontToFit(Spannable spannable, float f2, YogaMeasureMode yogaMeasureMode, float f3, YogaMeasureMode yogaMeasureMode2, double d2, int i2, boolean z2, int i3, int i4, Layout.Alignment alignment) {
        double pixelFromDIP = d2;
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(spannable, sTextPaintInstance);
        Layout layoutCreateLayout = createLayout(spannable, metricsIsBoring, f2, yogaMeasureMode, z2, i3, i4, alignment);
        if (Double.isNaN(pixelFromDIP)) {
            pixelFromDIP = PixelUtil.toPixelFromDIP(4.0f);
        }
        int i5 = (int) pixelFromDIP;
        int i6 = 0;
        int iMax = i5;
        for (ReactAbsoluteSizeSpan reactAbsoluteSizeSpan : (ReactAbsoluteSizeSpan[]) spannable.getSpans(0, spannable.length(), ReactAbsoluteSizeSpan.class)) {
            iMax = Math.max(iMax, reactAbsoluteSizeSpan.getSize());
        }
        int iMax2 = iMax;
        while (iMax2 > i5) {
            if ((i2 == -1 || i2 == 0 || layoutCreateLayout.getLineCount() <= i2) && (yogaMeasureMode2 == YogaMeasureMode.UNDEFINED || layoutCreateLayout.getHeight() <= f3)) {
                return;
            }
            iMax2 -= Math.max(1, (int) PixelUtil.toPixelFromDIP(1.0f));
            float f4 = iMax2 / iMax;
            ReactAbsoluteSizeSpan[] reactAbsoluteSizeSpanArr = (ReactAbsoluteSizeSpan[]) spannable.getSpans(i6, spannable.length(), ReactAbsoluteSizeSpan.class);
            int length = reactAbsoluteSizeSpanArr.length;
            while (i6 < length) {
                ReactAbsoluteSizeSpan reactAbsoluteSizeSpan2 = reactAbsoluteSizeSpanArr[i6];
                spannable.setSpan(new ReactAbsoluteSizeSpan((int) Math.max(reactAbsoluteSizeSpan2.getSize() * f4, i5)), spannable.getSpanStart(reactAbsoluteSizeSpan2), spannable.getSpanEnd(reactAbsoluteSizeSpan2), spannable.getSpanFlags(reactAbsoluteSizeSpan2));
                spannable.removeSpan(reactAbsoluteSizeSpan2);
                i6++;
            }
            layoutCreateLayout = createLayout(spannable, metricsIsBoring, f2, yogaMeasureMode, z2, i3, i4, alignment);
            i6 = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a4, code lost:
    
        r27.add(new com.facebook.react.views.text.internal.span.SetSpanOperation(r11, r9, new com.facebook.react.views.text.internal.span.ReactClickableSpan(r8)));
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void buildSpannableFromFragments(android.content.Context r24, com.facebook.react.common.mapbuffer.MapBuffer r25, android.text.SpannableStringBuilder r26, java.util.List<com.facebook.react.views.text.internal.span.SetSpanOperation> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.TextLayoutManager.buildSpannableFromFragments(android.content.Context, com.facebook.react.common.mapbuffer.MapBuffer, android.text.SpannableStringBuilder, java.util.List):void");
    }

    public static Layout createLayout(Context context, MapBuffer mapBuffer, MapBuffer mapBuffer2, float f2, float f3, ReactTextViewManagerCallback reactTextViewManagerCallback) {
        Spannable orCreateSpannableForText = getOrCreateSpannableForText(context, mapBuffer, reactTextViewManagerCallback);
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(orCreateSpannableForText, sTextPaintInstance);
        int textBreakStrategy = TextAttributeProps.getTextBreakStrategy(mapBuffer2.getString(2));
        boolean z2 = mapBuffer2.contains(4) ? mapBuffer2.getBoolean(4) : true;
        int hyphenationFrequency = TextAttributeProps.getHyphenationFrequency(mapBuffer2.getString(5));
        boolean z3 = mapBuffer2.contains(3) ? mapBuffer2.getBoolean(3) : false;
        int i2 = mapBuffer2.contains(0) ? mapBuffer2.getInt(0) : -1;
        Layout.Alignment textAlignment = getTextAlignment(mapBuffer, orCreateSpannableForText);
        if (z3) {
            adjustSpannableFontToFit(orCreateSpannableForText, f2, YogaMeasureMode.EXACTLY, f3, YogaMeasureMode.UNDEFINED, mapBuffer2.contains(6) ? mapBuffer2.getDouble(6) : Double.NaN, i2, z2, textBreakStrategy, hyphenationFrequency, textAlignment);
        }
        return createLayout(orCreateSpannableForText, metricsIsBoring, f2, YogaMeasureMode.EXACTLY, z2, textBreakStrategy, hyphenationFrequency, textAlignment);
    }

    private static Layout createLayout(Spannable spannable, BoringLayout.Metrics metrics, float f2, YogaMeasureMode yogaMeasureMode, boolean z2, int i2, int i3, Layout.Alignment alignment) {
        int length = spannable.length();
        int i4 = 0;
        boolean z3 = yogaMeasureMode == YogaMeasureMode.UNDEFINED || f2 < 0.0f;
        float desiredWidth = metrics == null ? Layout.getDesiredWidth(spannable, sTextPaintInstance) : Float.NaN;
        boolean zIsRtl = TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, length);
        if (metrics == null && (z3 || (!YogaConstants.isUndefined(desiredWidth) && desiredWidth <= f2))) {
            if (yogaMeasureMode == YogaMeasureMode.EXACTLY) {
                desiredWidth = f2;
            }
            return StaticLayout.Builder.obtain(spannable, 0, length, sTextPaintInstance, (int) Math.ceil(desiredWidth)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z2).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(zIsRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR).build();
        }
        if (metrics == null || (!z3 && metrics.width > f2)) {
            StaticLayout.Builder textDirection = StaticLayout.Builder.obtain(spannable, 0, length, sTextPaintInstance, (int) Math.ceil(f2)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z2).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(zIsRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            if (Build.VERSION.SDK_INT >= 28) {
                textDirection.setUseLineSpacingFromFallbacks(true);
            }
            return textDirection.build();
        }
        int iCeil = metrics.width;
        if (yogaMeasureMode == YogaMeasureMode.EXACTLY) {
            iCeil = (int) Math.ceil(f2);
        }
        if (metrics.width < 0) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Text width is invalid: " + metrics.width));
        } else {
            i4 = iCeil;
        }
        return BoringLayout.make(spannable, sTextPaintInstance, i4, alignment, 1.0f, 0.0f, metrics, z2);
    }

    private static Spannable createSpannableFromAttributedString(Context context, MapBuffer mapBuffer, ReactTextViewManagerCallback reactTextViewManagerCallback) throws Throwable {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        buildSpannableFromFragments(context, mapBuffer.getMapBuffer(2), spannableStringBuilder, arrayList);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((SetSpanOperation) arrayList.get((arrayList.size() - i2) - 1)).execute(spannableStringBuilder, i2);
        }
        if (reactTextViewManagerCallback != null) {
            reactTextViewManagerCallback.onPostProcessSpannable(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public static void deleteCachedSpannableForTag(int i2) {
        if (ENABLE_MEASURE_LOGGING) {
            FLog.e(TAG, "Delete cached spannable for tag[" + i2 + "]");
        }
        sTagToSpannableCache.remove(Integer.valueOf(i2));
    }

    public static Spannable getOrCreateSpannableForText(Context context, MapBuffer mapBuffer, ReactTextViewManagerCallback reactTextViewManagerCallback) {
        if (!mapBuffer.contains(3)) {
            return createSpannableFromAttributedString(context, mapBuffer, reactTextViewManagerCallback);
        }
        return sTagToSpannableCache.get(Integer.valueOf(mapBuffer.getInt(3)));
    }

    public static Layout.Alignment getTextAlignment(MapBuffer mapBuffer, Spannable spannable) {
        if (!mapBuffer.contains(2)) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        boolean z2 = isRTL(mapBuffer) != TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, spannable.length());
        Layout.Alignment alignment = z2 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        MapBuffer mapBuffer2 = mapBuffer.getMapBuffer(2);
        if (mapBuffer2.getCount() == 0) {
            return alignment;
        }
        MapBuffer mapBuffer3 = mapBuffer2.getMapBuffer(0).getMapBuffer(5);
        if (!mapBuffer3.contains(12)) {
            return alignment;
        }
        String string = mapBuffer3.getString(12);
        return string.equals("center") ? Layout.Alignment.ALIGN_CENTER : string.equals(ViewProps.RIGHT) ? z2 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : alignment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r3 != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        return 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r3 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getTextGravity(com.facebook.react.common.mapbuffer.MapBuffer r4, android.text.Spannable r5, int r6) {
        /*
            android.text.Layout$Alignment r4 = getTextAlignment(r4, r5)
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            r1 = 0
            int r0 = r5.length()
            boolean r3 = r2.isRtl(r5, r1, r0)
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            r2 = 5
            r1 = 3
            if (r4 != r0) goto L19
            if (r3 == 0) goto L1f
        L17:
            r6 = r2
        L18:
            return r6
        L19:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            if (r4 != r0) goto L21
            if (r3 == 0) goto L17
        L1f:
            r6 = r1
            goto L18
        L21:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            if (r4 != r0) goto L18
            r6 = 1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.TextLayoutManager.getTextGravity(com.facebook.react.common.mapbuffer.MapBuffer, android.text.Spannable, int):int");
    }

    public static boolean isRTL(MapBuffer mapBuffer) {
        if (!mapBuffer.contains(2)) {
            return false;
        }
        MapBuffer mapBuffer2 = mapBuffer.getMapBuffer(2);
        if (mapBuffer2.getCount() == 0) {
            return false;
        }
        MapBuffer mapBuffer3 = mapBuffer2.getMapBuffer(0).getMapBuffer(5);
        return mapBuffer3.contains(23) && TextAttributeProps.getLayoutDirection(mapBuffer3.getString(23)) == 1;
    }

    public static WritableArray measureLines(Context context, MapBuffer mapBuffer, MapBuffer mapBuffer2, float f2, float f3) {
        Layout layoutCreateLayout = createLayout(context, mapBuffer, mapBuffer2, f2, f3, null);
        return FontMetricsUtil.getFontMetrics(layoutCreateLayout.getText(), layoutCreateLayout, sTextPaintInstance, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long measureText(android.content.Context r16, com.facebook.react.common.mapbuffer.MapBuffer r17, com.facebook.react.common.mapbuffer.MapBuffer r18, float r19, com.facebook.yoga.YogaMeasureMode r20, float r21, com.facebook.yoga.YogaMeasureMode r22, com.facebook.react.views.text.ReactTextViewManagerCallback r23, float[] r24) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.TextLayoutManager.measureText(android.content.Context, com.facebook.react.common.mapbuffer.MapBuffer, com.facebook.react.common.mapbuffer.MapBuffer, float, com.facebook.yoga.YogaMeasureMode, float, com.facebook.yoga.YogaMeasureMode, com.facebook.react.views.text.ReactTextViewManagerCallback, float[]):long");
    }

    public static void setCachedSpannableForTag(int i2, Spannable spannable) {
        if (ENABLE_MEASURE_LOGGING) {
            FLog.e(TAG, "Set cached spannable for tag[" + i2 + "]: " + spannable.toString());
        }
        sTagToSpannableCache.put(Integer.valueOf(i2), spannable);
    }
}
