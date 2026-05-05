package com.horcrux.svg;

import android.view.View;
import com.horcrux.svg.TextProperties;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
class TextLayoutAlgorithm {

    /* JADX INFO: renamed from: com.horcrux.svg.TextLayoutAlgorithm$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor;

        static {
            int[] iArr = new int[TextProperties.TextAnchor.values().length];
            $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor = iArr;
            try {
                iArr[TextProperties.TextAnchor.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[TextProperties.TextAnchor.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[TextProperties.TextAnchor.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.horcrux.svg.TextLayoutAlgorithm$1CharacterPositioningResolver, reason: invalid class name */
    class C1CharacterPositioningResolver {
        private int global;
        private boolean horizontal;
        private boolean in_text_path;
        private String[] resolve_dx;
        private String[] resolve_dy;
        private String[] resolve_x;
        private String[] resolve_y;
        private CharacterInformation[] result;

        private C1CharacterPositioningResolver(CharacterInformation[] characterInformationArr, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
            this.global = 0;
            this.horizontal = true;
            this.in_text_path = false;
            this.result = characterInformationArr;
            this.resolve_x = strArr;
            this.resolve_y = strArr2;
            this.resolve_dx = strArr3;
            this.resolve_dy = strArr4;
        }

        private void resolveCharacterPositioning(TextView textView) {
            boolean z2 = true;
            if (textView.getClass() != TextView.class && textView.getClass() != TSpanView.class) {
                if (textView.getClass() == TextPathView.class) {
                    this.result[this.global].anchoredChunk = true;
                    this.in_text_path = true;
                    for (int i2 = 0; i2 < textView.getChildCount(); i2++) {
                        resolveCharacterPositioning((TextView) textView.getChildAt(i2));
                    }
                    if (textView instanceof TextPathView) {
                        this.in_text_path = false;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = this.global;
            String[] strArr = new String[0];
            String[] strArr2 = new String[0];
            String[] strArr3 = new String[0];
            String[] strArr4 = new String[0];
            double[] dArr = new double[0];
            int iMax = !this.in_text_path ? Math.max(0, 0) : 0;
            String str = ((TSpanView) textView).mContent;
            int length = str == null ? 0 : str.length();
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = i3 + i4;
                if (this.result[i6].addressable) {
                    CharacterInformation characterInformation = this.result[i6];
                    if (i5 >= iMax) {
                        z2 = false;
                    }
                    characterInformation.anchoredChunk = z2;
                    if (i5 < 0) {
                        this.resolve_x[i6] = strArr[i5];
                    }
                    boolean z3 = this.in_text_path;
                    if (z3 && !this.horizontal) {
                        this.resolve_x[i3] = "";
                    }
                    if (i5 < 0) {
                        this.resolve_y[i6] = strArr2[i5];
                    }
                    if (z3 && this.horizontal) {
                        this.resolve_y[i3] = "";
                    }
                    if (i5 < 0) {
                        this.resolve_dx[i6] = strArr3[i5];
                    }
                    if (i5 < 0) {
                        this.resolve_dy[i6] = strArr4[i5];
                    }
                    if (i5 < 0) {
                        this.result[i6].rotate = dArr[i5];
                    }
                }
                i5++;
                i4++;
                z2 = true;
            }
        }
    }

    class CharacterInformation {
        double advance;
        char character;
        TextView element;
        int index;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        double f3549x = 0.0d;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        double f3550y = 0.0d;
        double rotate = 0.0d;
        boolean hidden = false;
        boolean middle = false;
        boolean resolved = false;
        boolean xSpecified = false;
        boolean ySpecified = false;
        boolean addressable = true;
        boolean anchoredChunk = false;
        boolean rotateSpecified = false;
        boolean firstCharacterInResolvedDescendant = false;

        CharacterInformation(int i2, char c2) {
            this.index = i2;
            this.character = c2;
        }
    }

    class LayoutInput {
        boolean horizontal;
        TextView text;

        LayoutInput() {
        }
    }

    TextLayoutAlgorithm() {
    }

    private void getSubTreeTypographicCharacterPositions(ArrayList<TextPathView> arrayList, ArrayList<TextView> arrayList2, StringBuilder sb, View view, TextPathView textPathView) {
        TextPathView textPathView2 = textPathView;
        int i2 = 0;
        if (!(view instanceof TSpanView)) {
            if (view instanceof TextPathView) {
                textPathView2 = (TextPathView) view;
            }
            while (i2 < textPathView2.getChildCount()) {
                getSubTreeTypographicCharacterPositions(arrayList, arrayList2, sb, textPathView2.getChildAt(i2), textPathView2);
                i2++;
            }
            return;
        }
        TSpanView tSpanView = (TSpanView) view;
        String str = tSpanView.mContent;
        if (str == null) {
            while (i2 < tSpanView.getChildCount()) {
                getSubTreeTypographicCharacterPositions(arrayList, arrayList2, sb, tSpanView.getChildAt(i2), textPathView2);
                i2++;
            }
        } else {
            while (i2 < str.length()) {
                arrayList2.add(tSpanView);
                arrayList.add(textPathView2);
                i2++;
            }
            sb.append(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e5  */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.horcrux.svg.TextLayoutAlgorithm$1TextLengthResolver] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.graphics.Canvas, android.graphics.Paint] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    com.horcrux.svg.TextLayoutAlgorithm.CharacterInformation[] layoutText(com.horcrux.svg.TextLayoutAlgorithm.LayoutInput r31) {
        /*
            Method dump skipped, instruction units count: 913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.TextLayoutAlgorithm.layoutText(com.horcrux.svg.TextLayoutAlgorithm$LayoutInput):com.horcrux.svg.TextLayoutAlgorithm$CharacterInformation[]");
    }
}
