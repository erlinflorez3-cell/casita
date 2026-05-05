package com.incode.welcome_sdk.ui.composables;

import android.graphics.BlurMaskFilter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.commons.extensions.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class ShadowCustomKt {

    /* JADX INFO: renamed from: a */
    private static int f13030a = 1;

    /* JADX INFO: renamed from: d */
    private static int f13031d = 0;

    /* JADX INFO: renamed from: shadowCustom-aBf7M2Q$default */
    public static /* synthetic */ Modifier m8429shadowCustomaBf7M2Q$default(Modifier modifier, long j2, float f2, float f3, float f4, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            j2 = Color.Companion.m4204getBlack0d7_KjU();
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.m6638constructorimpl(0.0f);
        }
        if ((i2 & 4) != 0) {
            f3 = Dp.m6638constructorimpl(0.0f);
            int i4 = f13030a + 65;
            f13031d = i4 % 128;
            int i5 = i4 % 2;
        }
        if ((i2 & 8) != 0) {
            f4 = Dp.m6638constructorimpl(0.0f);
            int i6 = f13031d + 69;
            f13030a = i6 % 128;
            int i7 = i6 % 2;
        }
        return m8428shadowCustomaBf7M2Q(modifier, j2, f2, f3, f4);
    }

    static final class b extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: b */
        private static int f13032b = 0;

        /* JADX INFO: renamed from: j */
        private static int f13033j = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ float f13034a;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ long f13035c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ float f13036d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ float f13037e;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13032b + 1;
            f13033j = i3 % 128;
            int i4 = i3 % 2;
            Modifier modifier2 = modifier;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if (i4 != 0) {
                return e(modifier2, composer2, iIntValue);
            }
            e(modifier2, composer2, iIntValue);
            throw null;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.composables.ShadowCustomKt$b$4 */
        static final class AnonymousClass4 extends Lambda implements Function1<DrawScope, Unit> {

            /* JADX INFO: renamed from: f */
            private static int f13038f = 1;

            /* JADX INFO: renamed from: i */
            private static int f13039i = 0;

            /* JADX INFO: renamed from: a */
            private /* synthetic */ BlurMaskFilter f13040a;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ float f13041b;

            /* JADX INFO: renamed from: d */
            private /* synthetic */ float f13043d;

            /* JADX INFO: renamed from: e */
            private /* synthetic */ long f13044e;

            /* JADX INFO: renamed from: j */
            private /* synthetic */ float f13045j;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(DrawScope drawScope) {
                int i2 = 2 % 2;
                int i3 = f13038f + 67;
                f13039i = i3 % 128;
                int i4 = i3 % 2;
                d(drawScope);
                Unit unit = Unit.INSTANCE;
                int i5 = f13039i + 113;
                f13038f = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            private void d(DrawScope drawScope) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(drawScope, "");
                Paint paint = paint;
                float f2 = f;
                BlurMaskFilter blurMaskFilter = blurMaskFilter;
                long j2 = j;
                float f3 = f;
                float f4 = f;
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                android.graphics.Paint paintAsFrameworkPaint = paint.asFrameworkPaint();
                if (!Dp.m6643equalsimpl0(f2, Dp.m6638constructorimpl(0.0f))) {
                    int i3 = f13038f + 75;
                    f13039i = i3 % 128;
                    int i4 = i3 % 2;
                    paintAsFrameworkPaint.setMaskFilter(blurMaskFilter);
                    int i5 = f13038f + 111;
                    f13039i = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 4 / 3;
                    }
                }
                paintAsFrameworkPaint.setColor(ColorKt.m4232toArgb8_81llA(j2));
                float f5 = drawScope.mo710toPx0680j_4(f3);
                float f6 = drawScope.mo710toPx0680j_4(f4);
                canvas.drawRect(f5, f6, Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc()) + f5, Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc()) + f6, paint);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(float f2, BlurMaskFilter blurMaskFilter, long j2, float f3, float f4) {
                super(1);
                f = f2;
                blurMaskFilter = blurMaskFilter;
                j = j2;
                f = f3;
                f = f4;
            }
        }

        private Modifier e(Modifier modifier, Composer composer, int i2) {
            int i3;
            int i4 = 2 % 2;
            Intrinsics.checkNotNullParameter(modifier, "");
            composer.startReplaceableGroup(2111080851);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2111080851, i2, -1, "com.incode.welcome_sdk.ui.composables.shadowCustom.<anonymous> (ShadowCustom.kt:23)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                int i5 = f13033j + 1;
                f13032b = i5 % 128;
                if (i5 % 2 != 0) {
                    composer.updateRememberedValue(AndroidPaint_androidKt.Paint());
                    throw null;
                }
                objRememberedValue = AndroidPaint_androidKt.Paint();
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Paint paint = (Paint) objRememberedValue;
            float f2 = this.f13037e;
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer);
            float fD = c.d(f2, (Density) objConsume);
            ComposerKt.sourceInformationMarkerStart(composer, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new BlurMaskFilter(fD, BlurMaskFilter.Blur.NORMAL);
                composer.updateRememberedValue(objRememberedValue2);
                i3 = f13033j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            } else {
                i3 = f13033j + 15;
            }
            f13032b = i3 % 128;
            int i6 = i3 % 2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            Modifier modifierDrawBehind = DrawModifierKt.drawBehind(modifier, new Function1<DrawScope, Unit>() { // from class: com.incode.welcome_sdk.ui.composables.ShadowCustomKt.b.4

                /* JADX INFO: renamed from: f */
                private static int f13038f = 1;

                /* JADX INFO: renamed from: i */
                private static int f13039i = 0;

                /* JADX INFO: renamed from: a */
                private /* synthetic */ BlurMaskFilter f13040a;

                /* JADX INFO: renamed from: b */
                private /* synthetic */ float f13041b;

                /* JADX INFO: renamed from: d */
                private /* synthetic */ float f13043d;

                /* JADX INFO: renamed from: e */
                private /* synthetic */ long f13044e;

                /* JADX INFO: renamed from: j */
                private /* synthetic */ float f13045j;

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Unit invoke(DrawScope drawScope) {
                    int i22 = 2 % 2;
                    int i32 = f13038f + 67;
                    f13039i = i32 % 128;
                    int i42 = i32 % 2;
                    d(drawScope);
                    Unit unit = Unit.INSTANCE;
                    int i52 = f13039i + 113;
                    f13038f = i52 % 128;
                    if (i52 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }

                private void d(DrawScope drawScope) {
                    int i22 = 2 % 2;
                    Intrinsics.checkNotNullParameter(drawScope, "");
                    Paint paint2 = paint;
                    float f22 = f;
                    BlurMaskFilter blurMaskFilter = blurMaskFilter;
                    long j2 = j;
                    float f3 = f;
                    float f4 = f;
                    Canvas canvas = drawScope.getDrawContext().getCanvas();
                    android.graphics.Paint paintAsFrameworkPaint = paint2.asFrameworkPaint();
                    if (!Dp.m6643equalsimpl0(f22, Dp.m6638constructorimpl(0.0f))) {
                        int i32 = f13038f + 75;
                        f13039i = i32 % 128;
                        int i42 = i32 % 2;
                        paintAsFrameworkPaint.setMaskFilter(blurMaskFilter);
                        int i52 = f13038f + 111;
                        f13039i = i52 % 128;
                        if (i52 % 2 != 0) {
                            int i62 = 4 / 3;
                        }
                    }
                    paintAsFrameworkPaint.setColor(ColorKt.m4232toArgb8_81llA(j2));
                    float f5 = drawScope.mo710toPx0680j_4(f3);
                    float f6 = drawScope.mo710toPx0680j_4(f4);
                    canvas.drawRect(f5, f6, Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc()) + f5, Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc()) + f6, paint2);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass4(float f22, BlurMaskFilter blurMaskFilter, long j2, float f3, float f4) {
                    super(1);
                    f = f22;
                    blurMaskFilter = blurMaskFilter;
                    j = j2;
                    f = f3;
                    f = f4;
                }
            });
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierDrawBehind;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f2, long j2, float f3, float f4) {
            super(3);
            this.f13037e = f2;
            this.f13035c = j2;
            this.f13036d = f3;
            this.f13034a = f4;
        }
    }

    /* JADX INFO: renamed from: shadowCustom-aBf7M2Q */
    public static final Modifier m8428shadowCustomaBf7M2Q(Modifier modifier, long j2, float f2, float f3, float f4) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(modifier, "");
        Object obj = null;
        Modifier modifierComposed$default = ComposedModifierKt.composed$default(modifier, null, new b(f4, j2, f2, f3), 1, null);
        int i3 = f13031d + 37;
        f13030a = i3 % 128;
        if (i3 % 2 != 0) {
            return modifierComposed$default;
        }
        obj.hashCode();
        throw null;
    }
}
