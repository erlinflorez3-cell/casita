package com.incode.welcome_sdk.ui.theme;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
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
public final class IncodeButtonPrimaryKt {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f17576d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f17577e = 1;

    public static final /* synthetic */ TextStyle access$IncodeButtonPrimary$lambda$3(MutableState mutableState) {
        int i2 = 2 % 2;
        int i3 = f17577e + 19;
        f17576d = i3 % 128;
        if (i3 % 2 == 0) {
            return a((MutableState<TextStyle>) mutableState);
        }
        a((MutableState<TextStyle>) mutableState);
        throw null;
    }

    public static final /* synthetic */ void access$IncodeButtonPrimary$lambda$4(MutableState mutableState, TextStyle textStyle) {
        int i2 = 2 % 2;
        int i3 = f17577e + 87;
        f17576d = i3 % 128;
        int i4 = i3 % 2;
        a((MutableState<TextStyle>) mutableState, textStyle);
        if (i4 != 0) {
            throw null;
        }
        int i5 = f17577e + 53;
        f17576d = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$IncodeButtonPrimary$lambda$7(MutableState mutableState, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f17576d + 89;
        f17577e = i3 % 128;
        int i4 = i3 % 2;
        a((MutableState<Boolean>) mutableState, z2);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$PreviewIncodeButtonPrimary(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f17576d + 29;
        f17577e = i4 % 128;
        int i5 = i4 % 2;
        c(composer, i2);
        int i6 = f17577e + 29;
        f17576d = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean a(State<Boolean> state) {
        int i2 = 2 % 2;
        int i3 = f17577e + 101;
        f17576d = i3 % 128;
        int i4 = i3 % 2;
        boolean zBooleanValue = state.getValue().booleanValue();
        int i5 = f17576d + 67;
        f17577e = i5 % 128;
        if (i5 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private static final TextStyle a(MutableState<TextStyle> mutableState) {
        int i2 = 2 % 2;
        int i3 = f17577e + 85;
        f17576d = i3 % 128;
        MutableState<TextStyle> mutableState2 = mutableState;
        if (i3 % 2 != 0) {
            mutableState2.getValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        return mutableState2.getValue();
    }

    private static final void a(MutableState<TextStyle> mutableState, TextStyle textStyle) {
        int i2 = 2 % 2;
        int i3 = f17576d + 121;
        f17577e = i3 % 128;
        int i4 = i3 % 2;
        mutableState.setValue(textStyle);
        int i5 = f17577e + 61;
        f17576d = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void a(MutableState<Boolean> mutableState, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f17577e + 125;
        f17576d = i3 % 128;
        int i4 = i3 % 2;
        mutableState.setValue(Boolean.valueOf(z2));
        int i5 = f17577e + 87;
        f17576d = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static final class b extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f17587h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f17588i = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ boolean f17589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ MutableState<Boolean> f17590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ TextStyle f17591c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ MutableState<TextStyle> f17592d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ String f17593e;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f17588i + 61;
            f17587h = i3 % 128;
            int i4 = i3 % 2;
            d(rowScope, composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 89 / 0;
            }
            return unit;
        }

        static final class a extends Lambda implements Function1<TextLayoutResult, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f17594a = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f17595e = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ MutableState<TextStyle> f17596c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private /* synthetic */ MutableState<Boolean> f17597d;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                int i2 = 2 % 2;
                int i3 = f17595e + 107;
                f17594a = i3 % 128;
                int i4 = i3 % 2;
                a(textLayoutResult);
                Unit unit = Unit.INSTANCE;
                int i5 = f17594a + 5;
                f17595e = i5 % 128;
                if (i5 % 2 == 0) {
                    return unit;
                }
                throw null;
            }

            private void a(TextLayoutResult textLayoutResult) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(textLayoutResult, "");
                if (!textLayoutResult.getDidOverflowWidth()) {
                    IncodeButtonPrimaryKt.access$IncodeButtonPrimary$lambda$7(this.f17597d, true);
                    int i3 = f17594a + 45;
                    f17595e = i3 % 128;
                    if (i3 % 2 == 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = f17594a + 9;
                f17595e = i4 % 128;
                int i5 = i4 % 2;
                MutableState<TextStyle> mutableState = this.f17596c;
                TextStyle textStyleAccess$IncodeButtonPrimary$lambda$3 = IncodeButtonPrimaryKt.access$IncodeButtonPrimary$lambda$3(mutableState);
                long jM6154getFontSizeXSAIIZE = IncodeButtonPrimaryKt.access$IncodeButtonPrimary$lambda$3(this.f17596c).m6154getFontSizeXSAIIZE();
                TextUnitKt.m6844checkArithmeticR2X_6o(jM6154getFontSizeXSAIIZE);
                IncodeButtonPrimaryKt.access$IncodeButtonPrimary$lambda$4(mutableState, TextStyle.m6136copyp1EtxEg$default(textStyleAccess$IncodeButtonPrimary$lambda$3, 0L, TextUnitKt.pack(TextUnit.m6829getRawTypeimpl(jM6154getFontSizeXSAIIZE), (float) (((double) TextUnit.m6831getValueimpl(jM6154getFontSizeXSAIIZE)) * 0.9d)), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MutableState<TextStyle> mutableState, MutableState<Boolean> mutableState2) {
                super(1);
                this.f17596c = mutableState;
                this.f17597d = mutableState2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void d(androidx.compose.foundation.layout.RowScope r33, androidx.compose.runtime.Composer r34, int r35) {
            /*
                Method dump skipped, instruction units count: 305
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.theme.IncodeButtonPrimaryKt.b.d(androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z2, String str, MutableState<TextStyle> mutableState, MutableState<Boolean> mutableState2, TextStyle textStyle) {
            super(3);
            this.f17589a = z2;
            this.f17593e = str;
            this.f17592d = mutableState;
            this.f17590b = mutableState2;
            this.f17591c = textStyle;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003b A[PHI: r6
  0x003b: PHI (r6v33 int) = (r6v0 int), (r6v1 int), (r6v2 int) binds: [B:9:0x0039, B:106:0x028a, B:105:0x0286] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IncodeButtonPrimary(androidx.compose.ui.Modifier r55, java.lang.String r56, boolean r57, boolean r58, kotlin.jvm.functions.Function0<kotlin.Unit> r59, androidx.compose.runtime.Composer r60, int r61, int r62) {
        /*
            Method dump skipped, instruction units count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.theme.IncodeButtonPrimaryKt.IncodeButtonPrimary(androidx.compose.ui.Modifier, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    static final class e extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f17601a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f17602b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f17603c = new e();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17604d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f17605e = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f17604d + 91;
            f17605e = i3 % 128;
            if (i3 % 2 == 0) {
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Unit unit2 = Unit.INSTANCE;
            int i4 = f17604d + 103;
            f17605e = i4 % 128;
            int i5 = i4 % 2;
            return unit2;
        }

        static {
            int i2 = f17602b + 83;
            f17601a = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        e() {
            super(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void c(androidx.compose.runtime.Composer r11, int r12) {
        /*
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.theme.IncodeButtonPrimaryKt.f17576d
            int r1 = r0 + 55
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.theme.IncodeButtonPrimaryKt.f17577e = r0
            int r1 = r1 % r3
            r2 = -2075702397(0xffffffff84474b83, float:-2.342701E-36)
            androidx.compose.runtime.Composer r9 = r11.startRestartGroup(r2)
            if (r12 != 0) goto L3a
            int r0 = com.incode.welcome_sdk.ui.theme.IncodeButtonPrimaryKt.f17577e
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.theme.IncodeButtonPrimaryKt.f17576d = r0
            int r1 = r1 % r3
            boolean r1 = r9.getSkipping()
            r0 = 1
            r1 = r1 ^ r0
            if (r1 == r0) goto L3a
            r9.skipToGroupEnd()
        L29:
            androidx.compose.runtime.ScopeUpdateScope r1 = r9.endRestartGroup()
            if (r1 == 0) goto L39
            com.incode.welcome_sdk.ui.theme.IncodeButtonPrimaryKt$c r0 = new com.incode.welcome_sdk.ui.theme.IncodeButtonPrimaryKt$c
            r0.<init>(r12)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.updateScope(r0)
        L39:
            return
        L3a:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L4f
            int r0 = com.incode.welcome_sdk.ui.theme.IncodeButtonPrimaryKt.f17577e
            int r1 = r0 + 89
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.theme.IncodeButtonPrimaryKt.f17576d = r0
            int r1 = r1 % r3
            r1 = -1
            java.lang.String r0 = "com.incode.welcome_sdk.ui.theme.PreviewIncodeButtonPrimary (IncodeButtonPrimary.kt:83)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r12, r1, r0)
        L4f:
            com.incode.welcome_sdk.ui.theme.IncodeButtonPrimaryKt$e r8 = com.incode.welcome_sdk.ui.theme.IncodeButtonPrimaryKt.e.f17603c
            kotlin.jvm.functions.Function0 r8 = (kotlin.jvm.functions.Function0) r8
            r10 = 25008(0x61b0, float:3.5044E-41)
            r11 = 9
            r4 = 0
            java.lang.String r5 = "Continue"
            r6 = 1
            r7 = 0
            IncodeButtonPrimary(r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L29
            int r0 = com.incode.welcome_sdk.ui.theme.IncodeButtonPrimaryKt.f17576d
            int r1 = r0 + 121
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.theme.IncodeButtonPrimaryKt.f17577e = r0
            int r1 = r1 % r3
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            int r0 = com.incode.welcome_sdk.ui.theme.IncodeButtonPrimaryKt.f17577e
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.theme.IncodeButtonPrimaryKt.f17576d = r0
            int r1 = r1 % r3
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.theme.IncodeButtonPrimaryKt.c(androidx.compose.runtime.Composer, int):void");
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f17578g = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f17579i = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ boolean f17580a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Function0<Unit> f17581b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ String f17582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ boolean f17583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Modifier f17584e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ int f17585f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ int f17586j;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f17579i + 71;
            f17578g = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void e(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f17578g + 71;
            f17579i = i3 % 128;
            if (i3 % 2 == 0) {
                IncodeButtonPrimaryKt.IncodeButtonPrimary(this.f17584e, this.f17582c, this.f17580a, this.f17583d, this.f17581b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f17586j | 1), this.f17585f);
            } else {
                IncodeButtonPrimaryKt.IncodeButtonPrimary(this.f17584e, this.f17582c, this.f17580a, this.f17583d, this.f17581b, composer, RecomposeScopeImplKt.updateChangedFlags(this.f17586j | 1), this.f17585f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Modifier modifier, String str, boolean z2, boolean z3, Function0<Unit> function0, int i2, int i3) {
            super(2);
            this.f17584e = modifier;
            this.f17582c = str;
            this.f17580a = z2;
            this.f17583d = z3;
            this.f17581b = function0;
            this.f17586j = i2;
            this.f17585f = i3;
        }
    }

    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17598c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17599d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ int f17600e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f17599d + 111;
            f17598c = i3 % 128;
            int i4 = i3 % 2;
            c(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 62 / 0;
            }
            return unit;
        }

        private void c(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f17599d + 33;
            f17598c = i3 % 128;
            int i4 = i3 % 2;
            IncodeButtonPrimaryKt.access$PreviewIncodeButtonPrimary(composer, RecomposeScopeImplKt.updateChangedFlags(this.f17600e | 1));
            int i5 = f17599d + 111;
            f17598c = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i2) {
            super(2);
            this.f17600e = i2;
        }
    }
}
