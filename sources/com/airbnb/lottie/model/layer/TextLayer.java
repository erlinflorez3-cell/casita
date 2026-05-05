package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.content.ContentGroup;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.model.content.TextRangeUnits;
import com.airbnb.lottie.utils.DropShadow;
import com.airbnb.lottie.utils.Utils;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TextLayer extends BaseLayer {
    private final LongSparseArray<String> codePointCache;
    private BaseKeyframeAnimation<Integer, Integer> colorAnimation;
    private BaseKeyframeAnimation<Integer, Integer> colorCallbackAnimation;
    private final LottieComposition composition;
    private final Map<FontCharacter, List<ContentGroup>> contentsForCharacter;
    private final Paint fillPaint;
    private final LottieDrawable lottieDrawable;
    private final Matrix matrix;
    private BaseKeyframeAnimation<Integer, Integer> opacityAnimation;
    private final RectF rectF;
    private final StringBuilder stringBuilder;
    private BaseKeyframeAnimation<Integer, Integer> strokeColorAnimation;
    private BaseKeyframeAnimation<Integer, Integer> strokeColorCallbackAnimation;
    private final Paint strokePaint;
    private BaseKeyframeAnimation<Float, Float> strokeWidthAnimation;
    private BaseKeyframeAnimation<Float, Float> strokeWidthCallbackAnimation;
    private final TextKeyframeAnimation textAnimation;
    private BaseKeyframeAnimation<Integer, Integer> textRangeEndAnimation;
    private BaseKeyframeAnimation<Integer, Integer> textRangeOffsetAnimation;
    private BaseKeyframeAnimation<Integer, Integer> textRangeStartAnimation;
    private TextRangeUnits textRangeUnits;
    private BaseKeyframeAnimation<Float, Float> textSizeCallbackAnimation;
    private final List<TextSubLine> textSubLines;
    private BaseKeyframeAnimation<Float, Float> trackingAnimation;
    private BaseKeyframeAnimation<Float, Float> trackingCallbackAnimation;
    private BaseKeyframeAnimation<Typeface, Typeface> typefaceCallbackAnimation;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.TextLayer$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$airbnb$lottie$model$DocumentData$Justification[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static class TextSubLine {
        private String text;
        private float width;

        private TextSubLine() {
            this.text = "";
            this.width = 0.0f;
        }

        void set(String str, float f2) {
            this.text = str;
            this.width = f2;
        }
    }

    TextLayer(LottieDrawable lottieDrawable, Layer layer) {
        super(lottieDrawable, layer);
        this.stringBuilder = new StringBuilder(2);
        this.rectF = new RectF();
        this.matrix = new Matrix();
        int i2 = 1;
        this.fillPaint = new Paint(i2) { // from class: com.airbnb.lottie.model.layer.TextLayer.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.strokePaint = new Paint(i2) { // from class: com.airbnb.lottie.model.layer.TextLayer.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.contentsForCharacter = new HashMap();
        this.codePointCache = new LongSparseArray<>();
        this.textSubLines = new ArrayList();
        this.textRangeUnits = TextRangeUnits.INDEX;
        this.lottieDrawable = lottieDrawable;
        this.composition = layer.getComposition();
        TextKeyframeAnimation textKeyframeAnimationCreateAnimation = layer.getText().createAnimation();
        this.textAnimation = textKeyframeAnimationCreateAnimation;
        textKeyframeAnimationCreateAnimation.addUpdateListener(this);
        addAnimation(textKeyframeAnimationCreateAnimation);
        AnimatableTextProperties textProperties = layer.getTextProperties();
        if (textProperties != null && textProperties.textStyle != null && textProperties.textStyle.color != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation = textProperties.textStyle.color.createAnimation();
            this.colorAnimation = baseKeyframeAnimationCreateAnimation;
            baseKeyframeAnimationCreateAnimation.addUpdateListener(this);
            addAnimation(this.colorAnimation);
        }
        if (textProperties != null && textProperties.textStyle != null && textProperties.textStyle.stroke != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation2 = textProperties.textStyle.stroke.createAnimation();
            this.strokeColorAnimation = baseKeyframeAnimationCreateAnimation2;
            baseKeyframeAnimationCreateAnimation2.addUpdateListener(this);
            addAnimation(this.strokeColorAnimation);
        }
        if (textProperties != null && textProperties.textStyle != null && textProperties.textStyle.strokeWidth != null) {
            FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation = textProperties.textStyle.strokeWidth.createAnimation();
            this.strokeWidthAnimation = floatKeyframeAnimationCreateAnimation;
            floatKeyframeAnimationCreateAnimation.addUpdateListener(this);
            addAnimation(this.strokeWidthAnimation);
        }
        if (textProperties != null && textProperties.textStyle != null && textProperties.textStyle.tracking != null) {
            FloatKeyframeAnimation floatKeyframeAnimationCreateAnimation2 = textProperties.textStyle.tracking.createAnimation();
            this.trackingAnimation = floatKeyframeAnimationCreateAnimation2;
            floatKeyframeAnimationCreateAnimation2.addUpdateListener(this);
            addAnimation(this.trackingAnimation);
        }
        if (textProperties != null && textProperties.textStyle != null && textProperties.textStyle.opacity != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation3 = textProperties.textStyle.opacity.createAnimation();
            this.opacityAnimation = baseKeyframeAnimationCreateAnimation3;
            baseKeyframeAnimationCreateAnimation3.addUpdateListener(this);
            addAnimation(this.opacityAnimation);
        }
        if (textProperties != null && textProperties.rangeSelector != null && textProperties.rangeSelector.start != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation4 = textProperties.rangeSelector.start.createAnimation();
            this.textRangeStartAnimation = baseKeyframeAnimationCreateAnimation4;
            baseKeyframeAnimationCreateAnimation4.addUpdateListener(this);
            addAnimation(this.textRangeStartAnimation);
        }
        if (textProperties != null && textProperties.rangeSelector != null && textProperties.rangeSelector.end != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation5 = textProperties.rangeSelector.end.createAnimation();
            this.textRangeEndAnimation = baseKeyframeAnimationCreateAnimation5;
            baseKeyframeAnimationCreateAnimation5.addUpdateListener(this);
            addAnimation(this.textRangeEndAnimation);
        }
        if (textProperties != null && textProperties.rangeSelector != null && textProperties.rangeSelector.offset != null) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimationCreateAnimation6 = textProperties.rangeSelector.offset.createAnimation();
            this.textRangeOffsetAnimation = baseKeyframeAnimationCreateAnimation6;
            baseKeyframeAnimationCreateAnimation6.addUpdateListener(this);
            addAnimation(this.textRangeOffsetAnimation);
        }
        if (textProperties == null || textProperties.rangeSelector == null) {
            return;
        }
        this.textRangeUnits = textProperties.rangeSelector.units;
    }

    private String codePointToString(String str, int i2) {
        int iCodePointAt = str.codePointAt(i2);
        int iCharCount = Character.charCount(iCodePointAt) + i2;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!isModifier(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j2 = iCodePointAt;
        if (this.codePointCache.containsKey(j2)) {
            return this.codePointCache.get(j2);
        }
        this.stringBuilder.setLength(0);
        while (i2 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i2);
            this.stringBuilder.appendCodePoint(iCodePointAt3);
            i2 += Character.charCount(iCodePointAt3);
        }
        String string = this.stringBuilder.toString();
        this.codePointCache.put(j2, string);
        return string;
    }

    private void configurePaint(DocumentData documentData, int i2, int i3) {
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.colorCallbackAnimation;
        if (baseKeyframeAnimation != null) {
            this.fillPaint.setColor(baseKeyframeAnimation.getValue().intValue());
        } else if (this.colorAnimation == null || !isIndexInRangeSelection(i3)) {
            this.fillPaint.setColor(documentData.color);
        } else {
            this.fillPaint.setColor(this.colorAnimation.getValue().intValue());
        }
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.strokeColorCallbackAnimation;
        if (baseKeyframeAnimation2 != null) {
            this.strokePaint.setColor(baseKeyframeAnimation2.getValue().intValue());
        } else if (this.strokeColorAnimation == null || !isIndexInRangeSelection(i3)) {
            this.strokePaint.setColor(documentData.strokeColor);
        } else {
            this.strokePaint.setColor(this.strokeColorAnimation.getValue().intValue());
        }
        int iIntValue = 100;
        int iIntValue2 = this.transform.getOpacity() == null ? 100 : this.transform.getOpacity().getValue().intValue();
        if (this.opacityAnimation != null && isIndexInRangeSelection(i3)) {
            iIntValue = this.opacityAnimation.getValue().intValue();
        }
        int iRound = Math.round(((((iIntValue2 * 255.0f) / 100.0f) * (iIntValue / 100.0f)) * i2) / 255.0f);
        this.fillPaint.setAlpha(iRound);
        this.strokePaint.setAlpha(iRound);
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.strokeWidthCallbackAnimation;
        if (baseKeyframeAnimation3 != null) {
            this.strokePaint.setStrokeWidth(baseKeyframeAnimation3.getValue().floatValue());
        } else if (this.strokeWidthAnimation == null || !isIndexInRangeSelection(i3)) {
            this.strokePaint.setStrokeWidth(documentData.strokeWidth * Utils.dpScale());
        } else {
            this.strokePaint.setStrokeWidth(this.strokeWidthAnimation.getValue().floatValue());
        }
    }

    private void drawCharacter(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void drawCharacterAsGlyph(FontCharacter fontCharacter, float f2, DocumentData documentData, Canvas canvas, int i2, int i3) {
        configurePaint(documentData, i3, i2);
        List<ContentGroup> contentsForCharacter = getContentsForCharacter(fontCharacter);
        for (int i4 = 0; i4 < contentsForCharacter.size(); i4++) {
            Path path = contentsForCharacter.get(i4).getPath();
            path.computeBounds(this.rectF, false);
            this.matrix.reset();
            this.matrix.preTranslate(0.0f, (-documentData.baselineShift) * Utils.dpScale());
            this.matrix.preScale(f2, f2);
            path.transform(this.matrix);
            if (documentData.strokeOverFill) {
                drawGlyph(path, this.fillPaint, canvas);
                drawGlyph(path, this.strokePaint, canvas);
            } else {
                drawGlyph(path, this.strokePaint, canvas);
                drawGlyph(path, this.fillPaint, canvas);
            }
        }
    }

    private void drawCharacterFromFont(String str, DocumentData documentData, Canvas canvas, int i2, int i3) {
        configurePaint(documentData, i3, i2);
        if (documentData.strokeOverFill) {
            drawCharacter(str, this.fillPaint, canvas);
            drawCharacter(str, this.strokePaint, canvas);
        } else {
            drawCharacter(str, this.strokePaint, canvas);
            drawCharacter(str, this.fillPaint, canvas);
        }
    }

    private void drawFontTextLine(String str, DocumentData documentData, Canvas canvas, float f2, int i2, int i3) {
        int length = 0;
        while (length < str.length()) {
            String strCodePointToString = codePointToString(str, length);
            drawCharacterFromFont(strCodePointToString, documentData, canvas, i2 + length, i3);
            canvas.translate(this.fillPaint.measureText(strCodePointToString) + f2, 0.0f);
            length += strCodePointToString.length();
        }
    }

    private void drawGlyph(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void drawGlyphTextLine(String str, DocumentData documentData, Font font, Canvas canvas, float f2, float f3, float f4, int i2) {
        for (int i3 = 0; i3 < str.length(); i3++) {
            FontCharacter fontCharacter = this.composition.getCharacters().get(FontCharacter.hashFor(str.charAt(i3), font.getFamily(), font.getStyle()));
            if (fontCharacter != null) {
                drawCharacterAsGlyph(fontCharacter, f3, documentData, canvas, i3, i2);
                canvas.translate((((float) fontCharacter.getWidth()) * f3 * Utils.dpScale()) + f4, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void drawTextWithFont(com.airbnb.lottie.model.DocumentData r25, com.airbnb.lottie.model.Font r26, android.graphics.Canvas r27, int r28) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.TextLayer.drawTextWithFont(com.airbnb.lottie.model.DocumentData, com.airbnb.lottie.model.Font, android.graphics.Canvas, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void drawTextWithGlyphs(com.airbnb.lottie.model.DocumentData r28, android.graphics.Matrix r29, com.airbnb.lottie.model.Font r30, android.graphics.Canvas r31, int r32) {
        /*
            r27 = this;
            r9 = r27
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> r0 = r9.textSizeCallbackAnimation
            r10 = r28
            if (r0 == 0) goto Lab
            java.lang.Object r0 = r0.getValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r8 = r0.floatValue()
        L12:
            r0 = 1120403456(0x42c80000, float:100.0)
            float r8 = r8 / r0
            float r19 = com.airbnb.lottie.utils.Utils.getScale(r29)
            java.lang.String r0 = r10.text
            java.util.List r7 = r9.getTextLines(r0)
            int r6 = r7.size()
            int r0 = r10.tracking
            float r5 = (float) r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r5 = r5 / r0
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> r0 = r9.trackingCallbackAnimation
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r0.getValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
        L37:
            float r5 = r5 + r0
        L38:
            r13 = 0
            r1 = -1
            r4 = r13
        L3b:
            if (r4 >= r6) goto Laf
            java.lang.Object r2 = r7.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            android.graphics.PointF r0 = r10.boxSize
            if (r0 != 0) goto L97
            r0 = 0
        L48:
            r26 = 1
            r20 = r27
            r17 = r30
            r21 = r2
            r22 = r0
            r23 = r17
            r24 = r8
            r25 = r5
            java.util.List r11 = r20.splitGlyphTextIntoLines(r21, r22, r23, r24, r25, r26)
            r3 = r13
        L5d:
            int r0 = r11.size()
            if (r3 >= r0) goto L94
            java.lang.Object r2 = r11.get(r3)
            com.airbnb.lottie.model.layer.TextLayer$TextSubLine r2 = (com.airbnb.lottie.model.layer.TextLayer.TextSubLine) r2
            int r1 = r1 + 1
            r12 = r31
            r12.save()
            float r0 = com.airbnb.lottie.model.layer.TextLayer.TextSubLine.access$000(r2)
            boolean r0 = r9.offsetCanvas(r12, r10, r1, r0)
            if (r0 == 0) goto L93
            java.lang.String r15 = com.airbnb.lottie.model.layer.TextLayer.TextSubLine.access$100(r2)
            r14 = r27
            r16 = r10
            r22 = r32
            r20 = r8
            r21 = r5
            r18 = r12
            r14.drawGlyphTextLine(r15, r16, r17, r18, r19, r20, r21, r22)
        L8d:
            r12.restore()
            int r3 = r3 + 1
            goto L5d
        L93:
            goto L8d
        L94:
            int r4 = r4 + 1
            goto L3b
        L97:
            android.graphics.PointF r0 = r10.boxSize
            float r0 = r0.x
            goto L48
        L9c:
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> r0 = r9.trackingAnimation
            if (r0 == 0) goto L38
            java.lang.Object r0 = r0.getValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L37
        Lab:
            float r8 = r10.size
            goto L12
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.TextLayer.drawTextWithGlyphs(com.airbnb.lottie.model.DocumentData, android.graphics.Matrix, com.airbnb.lottie.model.Font, android.graphics.Canvas, int):void");
    }

    private TextSubLine ensureEnoughSubLines(int i2) {
        for (int size = this.textSubLines.size(); size < i2; size++) {
            this.textSubLines.add(new TextSubLine());
        }
        return this.textSubLines.get(i2 - 1);
    }

    private List<ContentGroup> getContentsForCharacter(FontCharacter fontCharacter) {
        if (this.contentsForCharacter.containsKey(fontCharacter)) {
            return this.contentsForCharacter.get(fontCharacter);
        }
        List<ShapeGroup> shapes = fontCharacter.getShapes();
        int size = shapes.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new ContentGroup(this.lottieDrawable, this, shapes.get(i2), this.composition));
        }
        this.contentsForCharacter.put(fontCharacter, arrayList);
        return arrayList;
    }

    private List<String> getTextLines(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private Typeface getTypeface(Font font) {
        Typeface value;
        BaseKeyframeAnimation<Typeface, Typeface> baseKeyframeAnimation = this.typefaceCallbackAnimation;
        if (baseKeyframeAnimation != null && (value = baseKeyframeAnimation.getValue()) != null) {
            return value;
        }
        Typeface typeface = this.lottieDrawable.getTypeface(font);
        return typeface != null ? typeface : font.getTypeface();
    }

    private boolean isIndexInRangeSelection(int i2) {
        int length = this.textAnimation.getValue().text.length();
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.textRangeStartAnimation;
        if (baseKeyframeAnimation == null || this.textRangeEndAnimation == null) {
            return true;
        }
        int iMin = Math.min(baseKeyframeAnimation.getValue().intValue(), this.textRangeEndAnimation.getValue().intValue());
        int iMax = Math.max(this.textRangeStartAnimation.getValue().intValue(), this.textRangeEndAnimation.getValue().intValue());
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.textRangeOffsetAnimation;
        if (baseKeyframeAnimation2 != null) {
            int iIntValue = baseKeyframeAnimation2.getValue().intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.textRangeUnits == TextRangeUnits.INDEX) {
            return i2 >= iMin && i2 < iMax;
        }
        float f2 = (i2 / length) * 100.0f;
        return f2 >= ((float) iMin) && f2 < ((float) iMax);
    }

    private boolean isModifier(int i2) {
        return Character.getType(i2) == 16 || Character.getType(i2) == 27 || Character.getType(i2) == 6 || Character.getType(i2) == 28 || Character.getType(i2) == 8 || Character.getType(i2) == 19;
    }

    private boolean offsetCanvas(Canvas canvas, DocumentData documentData, int i2, float f2) {
        PointF pointF = documentData.boxPosition;
        PointF pointF2 = documentData.boxSize;
        float fDpScale = Utils.dpScale();
        float f3 = (i2 * documentData.lineHeight * fDpScale) + (pointF == null ? 0.0f : (documentData.lineHeight * fDpScale) + pointF.y);
        if (this.lottieDrawable.getClipTextToBoundingBox() && pointF2 != null && pointF != null && f3 >= pointF.y + pointF2.y + documentData.size) {
            return false;
        }
        float f4 = pointF == null ? 0.0f : pointF.x;
        float f5 = pointF2 != null ? pointF2.x : 0.0f;
        int i3 = AnonymousClass3.$SwitchMap$com$airbnb$lottie$model$DocumentData$Justification[documentData.justification.ordinal()];
        if (i3 == 1) {
            canvas.translate(f4, f3);
        } else if (i3 == 2) {
            canvas.translate((f4 + f5) - f2, f3);
        } else if (i3 == 3) {
            canvas.translate((f4 + (f5 / 2.0f)) - (f2 / 2.0f), f3);
        }
        return true;
    }

    private List<TextSubLine> splitGlyphTextIntoLines(String str, float f2, Font font, float f3, float f4, boolean z2) {
        float fMeasureText;
        int i2 = 0;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char cCharAt = str.charAt(i5);
            if (z2) {
                FontCharacter fontCharacter = this.composition.getCharacters().get(FontCharacter.hashFor(cCharAt, font.getFamily(), font.getStyle()));
                if (fontCharacter != null) {
                    fMeasureText = ((float) fontCharacter.getWidth()) * f3 * Utils.dpScale();
                }
            } else {
                fMeasureText = this.fillPaint.measureText(str.substring(i5, i5 + 1));
            }
            float f8 = fMeasureText + f4;
            if (cCharAt == ' ') {
                z3 = true;
                f7 = f8;
            } else if (z3) {
                z3 = false;
                i4 = i5;
                f6 = f8;
            } else {
                f6 += f8;
            }
            f5 += f8;
            if (f2 > 0.0f && f5 >= f2 && cCharAt != ' ') {
                i2++;
                TextSubLine textSubLineEnsureEnoughSubLines = ensureEnoughSubLines(i2);
                if (i4 == i3) {
                    textSubLineEnsureEnoughSubLines.set(str.substring(i3, i5).trim(), (f5 - f8) - ((r6.length() - r0.length()) * f7));
                    i3 = i5;
                    i4 = i3;
                    f5 = f8;
                    f6 = f5;
                } else {
                    textSubLineEnsureEnoughSubLines.set(str.substring(i3, i4 - 1).trim(), ((f5 - f6) - ((r0.length() - r7.length()) * f7)) - f7);
                    f5 = f6;
                    i3 = i4;
                }
            }
        }
        if (f5 > 0.0f) {
            i2++;
            ensureEnoughSubLines(i2).set(str.substring(i3), f5);
        }
        return this.textSubLines.subList(0, i2);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t2, LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t2, lottieValueCallback);
        if (t2 == LottieProperty.COLOR) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.colorCallbackAnimation;
            if (baseKeyframeAnimation != null) {
                removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.colorCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.colorCallbackAnimation = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            addAnimation(this.colorCallbackAnimation);
            return;
        }
        if (t2 == LottieProperty.STROKE_COLOR) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation2 = this.strokeColorCallbackAnimation;
            if (baseKeyframeAnimation2 != null) {
                removeAnimation(baseKeyframeAnimation2);
            }
            if (lottieValueCallback == null) {
                this.strokeColorCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.strokeColorCallbackAnimation = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            addAnimation(this.strokeColorCallbackAnimation);
            return;
        }
        if (t2 == LottieProperty.STROKE_WIDTH) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.strokeWidthCallbackAnimation;
            if (baseKeyframeAnimation3 != null) {
                removeAnimation(baseKeyframeAnimation3);
            }
            if (lottieValueCallback == null) {
                this.strokeWidthCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.strokeWidthCallbackAnimation = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.addUpdateListener(this);
            addAnimation(this.strokeWidthCallbackAnimation);
            return;
        }
        if (t2 == LottieProperty.TEXT_TRACKING) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation4 = this.trackingCallbackAnimation;
            if (baseKeyframeAnimation4 != null) {
                removeAnimation(baseKeyframeAnimation4);
            }
            if (lottieValueCallback == null) {
                this.trackingCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.trackingCallbackAnimation = valueCallbackKeyframeAnimation4;
            valueCallbackKeyframeAnimation4.addUpdateListener(this);
            addAnimation(this.trackingCallbackAnimation);
            return;
        }
        if (t2 == LottieProperty.TEXT_SIZE) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation5 = this.textSizeCallbackAnimation;
            if (baseKeyframeAnimation5 != null) {
                removeAnimation(baseKeyframeAnimation5);
            }
            if (lottieValueCallback == null) {
                this.textSizeCallbackAnimation = null;
                return;
            }
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation5 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.textSizeCallbackAnimation = valueCallbackKeyframeAnimation5;
            valueCallbackKeyframeAnimation5.addUpdateListener(this);
            addAnimation(this.textSizeCallbackAnimation);
            return;
        }
        if (t2 != LottieProperty.TYPEFACE) {
            if (t2 == LottieProperty.TEXT) {
                this.textAnimation.setStringValueCallback(lottieValueCallback);
                return;
            }
            return;
        }
        BaseKeyframeAnimation<Typeface, Typeface> baseKeyframeAnimation6 = this.typefaceCallbackAnimation;
        if (baseKeyframeAnimation6 != null) {
            removeAnimation(baseKeyframeAnimation6);
        }
        if (lottieValueCallback == null) {
            this.typefaceCallbackAnimation = null;
            return;
        }
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation6 = new ValueCallbackKeyframeAnimation(lottieValueCallback);
        this.typefaceCallbackAnimation = valueCallbackKeyframeAnimation6;
        valueCallbackKeyframeAnimation6.addUpdateListener(this);
        addAnimation(this.typefaceCallbackAnimation);
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    void drawLayer(Canvas canvas, Matrix matrix, int i2, DropShadow dropShadow) {
        DocumentData value = this.textAnimation.getValue();
        Font font = this.composition.getFonts().get(value.fontName);
        if (font == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        configurePaint(value, i2, 0);
        if (this.lottieDrawable.useTextGlyphs()) {
            drawTextWithGlyphs(value, matrix, font, canvas, i2);
        } else {
            drawTextWithFont(value, font, canvas, i2);
        }
        canvas.restore();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(RectF rectF, Matrix matrix, boolean z2) {
        super.getBounds(rectF, matrix, z2);
        rectF.set(0.0f, 0.0f, this.composition.getBounds().width(), this.composition.getBounds().height());
    }
}
