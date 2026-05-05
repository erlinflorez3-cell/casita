package com.incode.welcome_sdk.ui.combined_consent.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.incode.welcome_sdk.ui.combined_consent.CheckboxState;
import com.incode.welcome_sdk.ui.combined_consent.CombinedConsentUiState;
import com.incode.welcome_sdk.ui.combined_consent.CombinedConsentViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class ConsentScreenKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f12938a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f12939d = 0;

    static final class d extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12950b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12951e = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ CombinedConsentUiState f12952d;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Boolean invoke() {
            Boolean boolD;
            int i2 = 2 % 2;
            int i3 = f12951e + 27;
            f12950b = i3 % 128;
            if (i3 % 2 == 0) {
                boolD = d();
                int i4 = 61 / 0;
            } else {
                boolD = d();
            }
            int i5 = f12950b + 121;
            f12951e = i5 % 128;
            if (i5 % 2 == 0) {
                return boolD;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private Boolean d() {
            boolean z2;
            int i2 = 2 % 2;
            List<CheckboxState> consents = this.f12952d.getConsents();
            ArrayList arrayList = new ArrayList();
            for (Object obj : consents) {
                if (!((CheckboxState) obj).isOptional()) {
                    int i3 = f12951e + 61;
                    f12950b = i3 % 128;
                    int i4 = i3 % 2;
                    arrayList.add(obj);
                    int i5 = f12950b + 57;
                    f12951e = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 4 % 3;
                    }
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                int i7 = f12950b + 117;
                f12951e = i7 % 128;
                int i8 = i7 % 2;
                z2 = true;
            } else {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (!((CheckboxState) it.next()).isChecked()) {
                        z2 = false;
                        break;
                    }
                }
                int i72 = f12950b + 117;
                f12951e = i72 % 128;
                int i82 = i72 % 2;
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CombinedConsentUiState combinedConsentUiState) {
            super(0);
            this.f12952d = combinedConsentUiState;
        }
    }

    private static final boolean b(State<Boolean> state) {
        int i2 = 2 % 2;
        int i3 = f12939d + 39;
        f12938a = i3 % 128;
        if (i3 % 2 != 0) {
            boolean zBooleanValue = state.getValue().booleanValue();
            int i4 = f12938a + 21;
            f12939d = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 15 / 0;
            }
            return zBooleanValue;
        }
        state.getValue().booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class b extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12944a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12945b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ CombinedConsentViewModel f12946c;

        private void c(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f12944a + 23;
            f12945b = i3 % 128;
            int i4 = i3 % 2;
            this.f12946c.updatePageLoadedState(z2);
            int i5 = f12944a + 23;
            f12945b = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Boolean bool) {
            int i2 = 2 % 2;
            int i3 = f12945b + 21;
            f12944a = i3 % 128;
            int i4 = i3 % 2;
            c(bool.booleanValue());
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 77 / 0;
            }
            int i6 = f12944a + 5;
            f12945b = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CombinedConsentViewModel combinedConsentViewModel) {
            super(1);
            this.f12946c = combinedConsentViewModel;
        }
    }

    static final class a extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12940b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12941e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ CheckboxState f12942a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ CombinedConsentViewModel f12943c;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Boolean bool) {
            int i2 = 2 % 2;
            int i3 = f12941e + 87;
            f12940b = i3 % 128;
            int i4 = i3 % 2;
            a(bool.booleanValue());
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                throw null;
            }
            int i5 = f12941e + 55;
            f12940b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f12940b + 35;
            f12941e = i3 % 128;
            int i4 = i3 % 2;
            this.f12943c.updateCheckboxState(this.f12942a.getCheckboxId(), z2);
            int i5 = f12940b + 51;
            f12941e = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CombinedConsentViewModel combinedConsentViewModel, CheckboxState checkboxState) {
            super(1);
            this.f12943c = combinedConsentViewModel;
            this.f12942a = checkboxState;
        }
    }

    static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12947a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f12948e = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ CombinedConsentViewModel f12949d;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f12948e + 111;
            f12947a = i3 % 128;
            int i4 = i3 % 2;
            d();
            Unit unit = Unit.INSTANCE;
            int i5 = f12947a + 75;
            f12948e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void d() {
            int i2 = 2 % 2;
            int i3 = f12948e + 65;
            f12947a = i3 % 128;
            int i4 = i3 % 2;
            this.f12949d.sendCombinedConsent();
            int i5 = f12948e + 99;
            f12947a = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CombinedConsentViewModel combinedConsentViewModel) {
            super(0);
            this.f12949d = combinedConsentViewModel;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ConsentScreen(com.incode.welcome_sdk.ui.combined_consent.CombinedConsentViewModel r37, androidx.compose.runtime.Composer r38, int r39) {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.combined_consent.view.ConsentScreenKt.ConsentScreen(com.incode.welcome_sdk.ui.combined_consent.CombinedConsentViewModel, androidx.compose.runtime.Composer, int):void");
    }

    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12953b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f12954d = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f12955c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ CombinedConsentViewModel f12956e;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f12953b + 107;
            f12954d = i3 % 128;
            int i4 = i3 % 2;
            c(composer);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 39 / 0;
            }
            int i6 = f12954d + 9;
            f12953b = i6 % 128;
            if (i6 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        private void c(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f12954d + 51;
            f12953b = i3 % 128;
            int i4 = i3 % 2;
            ConsentScreenKt.ConsentScreen(this.f12956e, composer, RecomposeScopeImplKt.updateChangedFlags(this.f12955c | 1));
            int i5 = f12954d + 91;
            f12953b = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CombinedConsentViewModel combinedConsentViewModel, int i2) {
            super(2);
            this.f12956e = combinedConsentViewModel;
            this.f12955c = i2;
        }
    }
}
