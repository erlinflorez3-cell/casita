package com.incode.welcome_sdk.ui.id_capture.view;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import com.google.android.material.math.MathUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class HorizontalCarouselKt {

    /* JADX INFO: renamed from: a */
    private static int f15213a = 1;

    /* JADX INFO: renamed from: e */
    private static int f15214e = 0;

    public static final /* synthetic */ void access$CarouselPreview(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f15213a + 109;
        f15214e = i4 % 128;
        int i5 = i4 % 2;
        c(composer, i2);
        if (i5 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ Modifier access$carouselTransition(Modifier modifier, int i2, PagerState pagerState) {
        int i3 = 2 % 2;
        int i4 = f15213a + 63;
        f15214e = i4 % 128;
        if (i4 % 2 == 0) {
            return c(modifier, i2, pagerState);
        }
        c(modifier, i2, pagerState);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class c extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: a */
        private static int f15225a = 1;

        /* JADX INFO: renamed from: d */
        private static int f15226d = 0;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ int f15227c;

        private Integer e() {
            int i2 = 2 % 2;
            int i3 = f15226d + 39;
            f15225a = i3 % 128;
            if (i3 % 2 == 0) {
                Integer.valueOf(this.f15227c);
                throw null;
            }
            Integer numValueOf = Integer.valueOf(this.f15227c);
            int i4 = f15226d + 61;
            f15225a = i4 % 128;
            int i5 = i4 % 2;
            return numValueOf;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Integer invoke() {
            int i2 = 2 % 2;
            int i3 = f15225a + 43;
            f15226d = i3 % 128;
            int i4 = i3 % 2;
            Integer numE = e();
            int i5 = f15226d + 49;
            f15225a = i5 % 128;
            if (i5 % 2 != 0) {
                return numE;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i2) {
            super(0);
            this.f15227c = i2;
        }
    }

    static final class a extends Lambda implements Function4<PagerScope, Integer, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b */
        private static int f15215b = 1;

        /* JADX INFO: renamed from: e */
        private static int f15216e = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ List<HelpCarouselItem> f15217a;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ PagerState f15218c;

        @Override // kotlin.jvm.functions.Function4
        public final /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
            int i2 = 2 % 2;
            int i3 = f15215b + 5;
            f15216e = i3 % 128;
            int i4 = i3 % 2;
            Object obj = null;
            c(pagerScope, num.intValue(), composer, num2.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = f15216e + 109;
            f15215b = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.view.HorizontalCarouselKt$a$1 */
        static final class AnonymousClass1 extends Lambda implements Function3<ColumnScope, Composer, Integer, Unit> {

            /* JADX INFO: renamed from: a */
            private static int f15219a = 0;

            /* JADX INFO: renamed from: d */
            private static int f15220d = 1;

            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
                int i2 = 2 % 2;
                int i3 = f15220d + 65;
                f15219a = i3 % 128;
                int i4 = i3 % 2;
                b(columnScope, composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i5 = f15219a + 101;
                f15220d = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:25:0x0026  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void b(androidx.compose.foundation.layout.ColumnScope r33, androidx.compose.runtime.Composer r34, int r35) {
                /*
                    Method dump skipped, instruction units count: 293
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.HorizontalCarouselKt.a.AnonymousClass1.b(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void");
            }

            AnonymousClass1() {
                super(3);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x001d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void c(androidx.compose.foundation.pager.PagerScope r14, int r15, androidx.compose.runtime.Composer r16, int r17) {
            /*
                r13 = this;
                r3 = 2
                int r0 = r3 % r3
                int r0 = com.incode.welcome_sdk.ui.id_capture.view.HorizontalCarouselKt.a.f15216e
                int r1 = r0 + 39
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.view.HorizontalCarouselKt.a.f15215b = r0
                int r1 = r1 % r3
                java.lang.String r0 = ""
                if (r1 != 0) goto L6f
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                r0 = 85
                int r0 = r0 / 0
                if (r1 == 0) goto L36
            L1d:
                r2 = -1
                java.lang.String r1 = "com.incode.welcome_sdk.ui.id_capture.view.HelpCarousel.<anonymous>.<anonymous> (HorizontalCarousel.kt:56)"
                r0 = 1914867839(0x7222907f, float:3.2199204E30)
                r4 = r17
                androidx.compose.runtime.ComposerKt.traceEventStart(r0, r4, r2, r1)
                int r0 = com.incode.welcome_sdk.ui.id_capture.view.HorizontalCarouselKt.a.f15216e
                int r1 = r0 + 75
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.view.HorizontalCarouselKt.a.f15215b = r0
                int r1 = r1 % r3
                if (r1 != 0) goto L36
                r0 = 4
                int r0 = r0 / 3
            L36:
                java.util.List<com.incode.welcome_sdk.ui.id_capture.view.HelpCarouselItem> r0 = r13.f15217a
                java.lang.Object r3 = r0.get(r15)
                com.incode.welcome_sdk.ui.id_capture.view.HelpCarouselItem r3 = (com.incode.welcome_sdk.ui.id_capture.view.HelpCarouselItem) r3
                androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.Companion
                androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
                androidx.compose.foundation.pager.PagerState r0 = r13.f15218c
                androidx.compose.ui.Modifier r4 = com.incode.welcome_sdk.ui.id_capture.view.HorizontalCarouselKt.access$carouselTransition(r1, r15, r0)
                com.incode.welcome_sdk.ui.id_capture.view.HorizontalCarouselKt$a$1 r2 = new com.incode.welcome_sdk.ui.id_capture.view.HorizontalCarouselKt$a$1
                r2.<init>()
                r0 = -970065715(0xffffffffc62df8cd, float:-11134.2)
                r1 = 1
                r10 = r16
                androidx.compose.runtime.internal.ComposableLambda r9 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r10, r0, r1, r2)
                kotlin.jvm.functions.Function3 r9 = (kotlin.jvm.functions.Function3) r9
                r11 = 196608(0x30000, float:2.75506E-40)
                r12 = 30
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                androidx.compose.material3.CardKt.Card(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                r0 = r0 ^ r1
                if (r0 == r1) goto L6e
                androidx.compose.runtime.ComposerKt.traceEventEnd()
            L6e:
                return
            L6f:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 != 0) goto L1d
                goto L36
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.HorizontalCarouselKt.a.c(androidx.compose.foundation.pager.PagerScope, int, androidx.compose.runtime.Composer, int):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<HelpCarouselItem> list, PagerState pagerState) {
            super(4);
            this.f15217a = list;
            this.f15218c = pagerState;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void HelpCarousel(androidx.compose.ui.Modifier r28, java.util.List<com.incode.welcome_sdk.ui.id_capture.view.HelpCarouselItem> r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.HorizontalCarouselKt.HelpCarousel(androidx.compose.ui.Modifier, java.util.List, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DotIndicators(androidx.compose.ui.Modifier r16, androidx.compose.foundation.pager.PagerState r17, int r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.HorizontalCarouselKt.DotIndicators(androidx.compose.ui.Modifier, androidx.compose.foundation.pager.PagerState, int, androidx.compose.runtime.Composer, int, int):void");
    }

    static final class j extends Lambda implements Function1<GraphicsLayerScope, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f15241a = 0;

        /* JADX INFO: renamed from: d */
        private static int f15242d = 1;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ int f15243c;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ PagerState f15244e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
            int i2 = 2 % 2;
            int i3 = f15241a + 45;
            f15242d = i3 % 128;
            int i4 = i3 % 2;
            a(graphicsLayerScope);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 85 / 0;
            }
            int i6 = f15242d + 17;
            f15241a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 59 / 0;
            }
            return unit;
        }

        private void a(GraphicsLayerScope graphicsLayerScope) {
            int i2 = 2 % 2;
            int i3 = f15242d + 17;
            f15241a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
            float fCoerceIn = 1.0f - RangesKt.coerceIn(Math.abs((this.f15244e.getCurrentPage() - this.f15243c) + this.f15244e.getCurrentPageOffsetFraction()), 0.0f, 1.0f);
            graphicsLayerScope.setAlpha(MathUtils.lerp(0.5f, 1.0f, fCoerceIn));
            graphicsLayerScope.setScaleY(MathUtils.lerp(0.8f, 1.0f, fCoerceIn));
            int i5 = f15242d + 45;
            f15241a = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 42 / 0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(PagerState pagerState, int i2) {
            super(1);
            this.f15244e = pagerState;
            this.f15243c = i2;
        }
    }

    private static final Modifier c(Modifier modifier, int i2, PagerState pagerState) {
        int i3 = 2 % 2;
        Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifier, new j(pagerState, i2));
        int i4 = f15213a + 21;
        f15214e = i4 % 128;
        int i5 = i4 % 2;
        return modifierGraphicsLayer;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x001b A[PHI: r4
  0x001b: PHI (r4v3 androidx.compose.runtime.Composer) = (r4v0 androidx.compose.runtime.Composer), (r4v4 androidx.compose.runtime.Composer) binds: [B:43:0x0072, B:28:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0021 A[PHI: r4
  0x0021: PHI (r4v1 androidx.compose.runtime.Composer) = 
  (r4v0 androidx.compose.runtime.Composer)
  (r4v3 androidx.compose.runtime.Composer)
  (r4v4 androidx.compose.runtime.Composer)
 binds: [B:43:0x0072, B:30:0x001f, B:28:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void c(androidx.compose.runtime.Composer r6, int r7) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.id_capture.view.HorizontalCarouselKt.f15213a
            int r1 = r0 + 23
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.view.HorizontalCarouselKt.f15214e = r0
            int r1 = r1 % r3
            r5 = 0
            r2 = 1211215051(0x4831accb, float:181939.17)
            if (r1 == 0) goto L6e
            androidx.compose.runtime.Composer r4 = r6.startRestartGroup(r2)
            r0 = 80
            int r0 = r0 / r5
            if (r7 != 0) goto L21
        L1b:
            boolean r0 = r4.getSkipping()
            if (r0 != 0) goto L6a
        L21:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L36
            int r0 = com.incode.welcome_sdk.ui.id_capture.view.HorizontalCarouselKt.f15214e
            int r1 = r0 + 75
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_capture.view.HorizontalCarouselKt.f15213a = r0
            int r1 = r1 % r3
            r1 = -1
            java.lang.String r0 = "com.incode.welcome_sdk.ui.id_capture.view.CarouselPreview (HorizontalCarousel.kt:149)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r7, r1, r0)
        L36:
            com.incode.welcome_sdk.ui.id_capture.view.HelpCarouselItem r3 = new com.incode.welcome_sdk.ui.id_capture.view.HelpCarouselItem
            int r0 = com.incode.welcome_sdk.R.drawable.onboard_sdk_id_capture_help_align
            androidx.compose.ui.graphics.painter.Painter r2 = androidx.compose.ui.res.PainterResources_androidKt.painterResource(r0, r4, r5)
            java.lang.String r1 = "Align title"
            java.lang.String r0 = "Align subtitle"
            r3.<init>(r2, r1, r0)
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r3)
            r2 = 64
            r1 = 1
            r0 = 0
            HelpCarousel(r0, r3, r4, r2, r1)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L59
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L59:
            androidx.compose.runtime.ScopeUpdateScope r1 = r4.endRestartGroup()
            if (r1 == 0) goto L69
            com.incode.welcome_sdk.ui.id_capture.view.HorizontalCarouselKt$b r0 = new com.incode.welcome_sdk.ui.id_capture.view.HorizontalCarouselKt$b
            r0.<init>(r7)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.updateScope(r0)
        L69:
            return
        L6a:
            r4.skipToGroupEnd()
            goto L59
        L6e:
            androidx.compose.runtime.Composer r4 = r6.startRestartGroup(r2)
            if (r7 != 0) goto L21
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.view.HorizontalCarouselKt.c(androidx.compose.runtime.Composer, int):void");
    }

    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f15222a = 1;

        /* JADX INFO: renamed from: b */
        private static int f15223b = 0;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ int f15224d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15223b + 67;
            f15222a = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15223b + 25;
            f15222a = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15223b + 83;
            f15222a = i3 % 128;
            int i4 = i3 % 2;
            HorizontalCarouselKt.access$CarouselPreview(composer, RecomposeScopeImplKt.updateChangedFlags(this.f15224d | 1));
            int i5 = f15223b + 3;
            f15222a = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i2) {
            super(2);
            this.f15224d = i2;
        }
    }

    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: d */
        private static int f15228d = 0;

        /* JADX INFO: renamed from: f */
        private static int f15229f = 1;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ int f15230a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ int f15231b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ List<HelpCarouselItem> f15232c;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ Modifier f15233e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15228d + 117;
            f15229f = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f15228d + 3;
            f15229f = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15229f + 59;
            f15228d = i3 % 128;
            int i4 = i3 % 2;
            HorizontalCarouselKt.HelpCarousel(this.f15233e, this.f15232c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15231b | 1), this.f15230a);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Modifier modifier, List<HelpCarouselItem> list, int i2, int i3) {
            super(2);
            this.f15233e = modifier;
            this.f15232c = list;
            this.f15231b = i2;
            this.f15230a = i3;
        }
    }

    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: f */
        private static int f15234f = 1;

        /* JADX INFO: renamed from: j */
        private static int f15235j = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ Modifier f15236a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ int f15237b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ int f15238c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ int f15239d;

        /* JADX INFO: renamed from: e */
        private /* synthetic */ PagerState f15240e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f15235j + 47;
            f15234f = i3 % 128;
            int i4 = i3 % 2;
            b(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void b(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f15234f + 11;
            f15235j = i3 % 128;
            int i4 = i3 % 2;
            HorizontalCarouselKt.DotIndicators(this.f15236a, this.f15240e, this.f15238c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f15237b | 1), this.f15239d);
            int i5 = f15234f + 29;
            f15235j = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Modifier modifier, PagerState pagerState, int i2, int i3, int i4) {
            super(2);
            this.f15236a = modifier;
            this.f15240e = pagerState;
            this.f15238c = i2;
            this.f15237b = i3;
            this.f15239d = i4;
        }
    }
}
