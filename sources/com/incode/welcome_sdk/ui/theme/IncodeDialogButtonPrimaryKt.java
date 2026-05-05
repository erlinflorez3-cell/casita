package com.incode.welcome_sdk.ui.theme;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class IncodeDialogButtonPrimaryKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17606b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f17607d = 1;

    public static final /* synthetic */ TextStyle access$IncodeDialogButtonPrimary$lambda$3(MutableState mutableState) {
        int i2 = 2 % 2;
        int i3 = f17606b + 25;
        f17607d = i3 % 128;
        if (i3 % 2 == 0) {
            d(mutableState);
            throw null;
        }
        TextStyle textStyleD = d(mutableState);
        int i4 = f17607d + 17;
        f17606b = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return textStyleD;
    }

    public static final /* synthetic */ void access$IncodeDialogButtonPrimary$lambda$4(MutableState mutableState, TextStyle textStyle) {
        int i2 = 2 % 2;
        int i3 = f17606b + 111;
        f17607d = i3 % 128;
        int i4 = i3 % 2;
        b((MutableState<TextStyle>) mutableState, textStyle);
        int i5 = f17606b + 89;
        f17607d = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$IncodeDialogButtonPrimary$lambda$7(MutableState mutableState, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f17606b + 69;
        f17607d = i3 % 128;
        int i4 = i3 % 2;
        e(mutableState, z2);
        int i5 = f17606b + 63;
        f17607d = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$PreviewIncodeButtonPrimary(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f17607d + 23;
        f17606b = i4 % 128;
        int i5 = i4 % 2;
        b(composer, i2);
        int i6 = f17607d + 11;
        f17606b = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean a(State<Boolean> state) {
        int i2 = 2 % 2;
        int i3 = f17606b + 75;
        f17607d = i3 % 128;
        if (i3 % 2 != 0) {
            boolean zBooleanValue = state.getValue().booleanValue();
            int i4 = f17606b + 37;
            f17607d = i4 % 128;
            int i5 = i4 % 2;
            return zBooleanValue;
        }
        state.getValue().booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void b(MutableState<TextStyle> mutableState, TextStyle textStyle) {
        int i2 = 2 % 2;
        int i3 = f17606b + 45;
        f17607d = i3 % 128;
        if (i3 % 2 == 0) {
            mutableState.setValue(textStyle);
            throw null;
        }
        mutableState.setValue(textStyle);
    }

    private static final TextStyle d(MutableState<TextStyle> mutableState) {
        int i2 = 2 % 2;
        int i3 = f17606b + 91;
        f17607d = i3 % 128;
        MutableState<TextStyle> mutableState2 = mutableState;
        if (i3 % 2 == 0) {
            mutableState2.getValue();
            throw null;
        }
        return mutableState2.getValue();
    }

    private static final void e(MutableState<Boolean> mutableState, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f17607d + 63;
        f17606b = i3 % 128;
        int i4 = i3 % 2;
        Boolean boolValueOf = Boolean.valueOf(z2);
        if (i4 != 0) {
            mutableState.setValue(boolValueOf);
            int i5 = 49 / 0;
        } else {
            mutableState.setValue(boolValueOf);
        }
        int i6 = f17606b + 5;
        f17607d = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 15 / 0;
        }
    }

    static final class d extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17616e = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f17617h = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ MutableState<TextStyle> f17618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ MutableState<Boolean> f17619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ String f17620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ TextStyle f17621d;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f17616e + 121;
            f17617h = i3 % 128;
            int i4 = i3 % 2;
            b(rowScope, composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f17617h + 83;
            f17616e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        static final class e extends Lambda implements Function1<TextLayoutResult, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f17622a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f17623d = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ MutableState<TextStyle> f17624c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private /* synthetic */ MutableState<Boolean> f17625e;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                int i2 = 2 % 2;
                int i3 = f17623d + 47;
                f17622a = i3 % 128;
                int i4 = i3 % 2;
                d(textLayoutResult);
                Unit unit = Unit.INSTANCE;
                if (i4 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private void d(TextLayoutResult textLayoutResult) {
                int i2 = 2 % 2;
                int i3 = f17623d + 17;
                f17622a = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(textLayoutResult, "");
                if (!textLayoutResult.getDidOverflowWidth()) {
                    IncodeDialogButtonPrimaryKt.access$IncodeDialogButtonPrimary$lambda$7(this.f17625e, true);
                    return;
                }
                int i5 = f17622a + 55;
                f17623d = i5 % 128;
                int i6 = i5 % 2;
                MutableState<TextStyle> mutableState = this.f17624c;
                TextStyle textStyleAccess$IncodeDialogButtonPrimary$lambda$3 = IncodeDialogButtonPrimaryKt.access$IncodeDialogButtonPrimary$lambda$3(mutableState);
                long jM6154getFontSizeXSAIIZE = IncodeDialogButtonPrimaryKt.access$IncodeDialogButtonPrimary$lambda$3(this.f17624c).m6154getFontSizeXSAIIZE();
                TextUnitKt.m6844checkArithmeticR2X_6o(jM6154getFontSizeXSAIIZE);
                IncodeDialogButtonPrimaryKt.access$IncodeDialogButtonPrimary$lambda$4(mutableState, TextStyle.m6136copyp1EtxEg$default(textStyleAccess$IncodeDialogButtonPrimary$lambda$3, 0L, TextUnitKt.pack(TextUnit.m6829getRawTypeimpl(jM6154getFontSizeXSAIIZE), (float) (((double) TextUnit.m6831getValueimpl(jM6154getFontSizeXSAIIZE)) * 0.9d)), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(MutableState<TextStyle> mutableState, MutableState<Boolean> mutableState2) {
                super(1);
                this.f17624c = mutableState;
                this.f17625e = mutableState2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void b(androidx.compose.foundation.layout.RowScope r32, androidx.compose.runtime.Composer r33, int r34) {
            /*
                r31 = this;
                r5 = r31
                r0 = 2
                int r0 = r0 % r0
                int r0 = com.incode.welcome_sdk.ui.theme.IncodeDialogButtonPrimaryKt.d.f17617h
                int r1 = r0 + 123
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.theme.IncodeDialogButtonPrimaryKt.d.f17616e = r0
                int r2 = r1 % 2
                java.lang.String r0 = ""
                r4 = r34
                r1 = r33
                r3 = r32
                if (r2 == 0) goto Lbb
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r2 = r4 & 81
                r0 = 120(0x78, float:1.68E-43)
                if (r2 != r0) goto L27
            L21:
                boolean r0 = r1.getSkipping()
                if (r0 != 0) goto Lb7
            L27:
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == 0) goto L36
                r3 = -1
                java.lang.String r2 = "com.incode.welcome_sdk.ui.theme.IncodeDialogButtonPrimary.<anonymous> (IncodeDialogButtonPrimary.kt:47)"
                r0 = -163880399(0xfffffffff63b6231, float:-9.501475E32)
                androidx.compose.runtime.ComposerKt.traceEventStart(r0, r4, r3, r2)
            L36:
                androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.Companion
                java.lang.String r6 = r5.f17620c
                androidx.compose.ui.Modifier r7 = (androidx.compose.ui.Modifier) r7
                r0 = 728525180(0x2b6c697c, float:8.399043E-13)
                r1.startReplaceableGroup(r0)
                androidx.compose.runtime.MutableState<androidx.compose.ui.text.TextStyle> r0 = r5.f17618a
                boolean r2 = r1.changed(r0)
                androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r5.f17619b
                boolean r0 = r1.changed(r0)
                r2 = r2 | r0
                androidx.compose.runtime.MutableState<androidx.compose.ui.text.TextStyle> r4 = r5.f17618a
                androidx.compose.runtime.MutableState<java.lang.Boolean> r3 = r5.f17619b
                java.lang.Object r0 = r1.rememberedValue()
                if (r2 != 0) goto L61
                androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.Companion
                java.lang.Object r2 = r2.getEmpty()
                if (r0 != r2) goto Lac
            L61:
                com.incode.welcome_sdk.ui.theme.IncodeDialogButtonPrimaryKt$d$e r0 = new com.incode.welcome_sdk.ui.theme.IncodeDialogButtonPrimaryKt$d$e
                r0.<init>(r4, r3)
                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                r1.updateRememberedValue(r0)
            L6b:
                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                r1.endReplaceableGroup()
                androidx.compose.ui.text.TextStyle r2 = r5.f17621d
                r29 = 1572864(0x180000, float:2.204052E-39)
                r30 = 32764(0x7ffc, float:4.5912E-41)
                r8 = 0
                r10 = 0
                r13 = 0
                r18 = r13
                r14 = r13
                r12 = r13
                r15 = 0
                r19 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r28 = 48
                r17 = r13
                r25 = r0
                r26 = r2
                r27 = r1
                androidx.compose.material3.TextKt.m2711Text4IGK_g(r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == 0) goto Lab
                int r0 = com.incode.welcome_sdk.ui.theme.IncodeDialogButtonPrimaryKt.d.f17616e
                int r1 = r0 + 7
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.theme.IncodeDialogButtonPrimaryKt.d.f17617h = r0
                int r0 = r1 % 2
                androidx.compose.runtime.ComposerKt.traceEventEnd()
            Lab:
                return
            Lac:
                int r2 = com.incode.welcome_sdk.ui.theme.IncodeDialogButtonPrimaryKt.d.f17616e
                int r3 = r2 + 15
                int r2 = r3 % 128
                com.incode.welcome_sdk.ui.theme.IncodeDialogButtonPrimaryKt.d.f17617h = r2
                int r2 = r3 % 2
                goto L6b
            Lb7:
                r1.skipToGroupEnd()
                goto Lab
            Lbb:
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r2 = r4 & 81
                r0 = 16
                if (r2 != r0) goto L27
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.theme.IncodeDialogButtonPrimaryKt.d.b(androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, MutableState<TextStyle> mutableState, MutableState<Boolean> mutableState2, TextStyle textStyle) {
            super(3);
            this.f17620c = str;
            this.f17618a = mutableState;
            this.f17619b = mutableState2;
            this.f17621d = textStyle;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IncodeDialogButtonPrimary(androidx.compose.ui.Modifier r22, java.lang.String r23, boolean r24, kotlin.jvm.functions.Function0<kotlin.Unit> r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.theme.IncodeDialogButtonPrimaryKt.IncodeDialogButtonPrimary(androidx.compose.ui.Modifier, java.lang.String, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f17608a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17609b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17610c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17611d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17612e = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f17611d + 73;
            f17612e = i3 % 128;
            int i4 = i3 % 2;
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        static {
            int i2 = f17610c + 109;
            f17609b = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        b() {
            super(0);
        }
    }

    private static final void b(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f17607d + 5;
        f17606b = i4 % 128;
        if (i4 % 2 == 0) {
            Composer composerStartRestartGroup = composer.startRestartGroup(-783144981);
            if (i2 == 0 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-783144981, i2, -1, "com.incode.welcome_sdk.ui.theme.PreviewIncodeButtonPrimary (IncodeDialogButtonPrimary.kt:64)");
                }
                IncodeDialogButtonPrimary(null, "Continue", true, b.f17608a, composerStartRestartGroup, 3504, 1);
                if (ComposerKt.isTraceInProgress()) {
                    int i5 = f17607d + 109;
                    f17606b = i5 % 128;
                    int i6 = i5 % 2;
                    ComposerKt.traceEventEnd();
                    int i7 = f17606b + 123;
                    f17607d = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new c(i2));
                return;
            }
            return;
        }
        composer.startRestartGroup(-783144981);
        throw null;
    }

    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17613b = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17614d = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f17615c;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f17614d + 35;
            f17613b = i3 % 128;
            int i4 = i3 % 2;
            d(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f17613b + 9;
            f17614d = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void d(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f17613b + 103;
            f17614d = i3 % 128;
            int i4 = i3 % 2;
            int i5 = this.f17615c;
            if (i4 == 0) {
                i5 |= 1;
            }
            IncodeDialogButtonPrimaryKt.access$PreviewIncodeButtonPrimary(composer, RecomposeScopeImplKt.updateChangedFlags(i5));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i2) {
            super(2);
            this.f17615c = i2;
        }
    }

    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f17626g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f17627h = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ int f17628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function0<Unit> f17629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ String f17630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Modifier f17631d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ boolean f17632e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ int f17633i;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f17627h + 115;
            f17626g = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f17627h + 121;
            f17626g = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f17626g + 27;
            f17627h = i3 % 128;
            int i4 = i3 % 2;
            IncodeDialogButtonPrimaryKt.IncodeDialogButtonPrimary(this.f17631d, this.f17630c, this.f17632e, this.f17629b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f17628a | 1), this.f17633i);
            int i5 = f17627h + 79;
            f17626g = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Modifier modifier, String str, boolean z2, Function0<Unit> function0, int i2, int i3) {
            super(2);
            this.f17631d = modifier;
            this.f17630c = str;
            this.f17632e = z2;
            this.f17629b = function0;
            this.f17628a = i2;
            this.f17633i = i3;
        }
    }
}
