package com.incode.welcome_sdk.ui.dynamic_forms.view;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsContainerUiState;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsCountrySelectorUiState;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsDateInputUiState;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsInputUiState;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsPhoneInputUiState;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsSelectInputUiState;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsTextInputUiState;
import com.incode.welcome_sdk.ui.dynamic_forms.state.FormsYesNoUiState;
import com.incode.welcome_sdk.ui.dynamic_forms.view.DynamicFormsContainerScreenKt;
import com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class DynamicFormsContainerScreenKt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f13460c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f13461e = 1;

    public static final /* synthetic */ void access$DynamicFormsContainerScreen$lambda$2(MutableState mutableState, float f2) {
        int i2 = 2 % 2;
        int i3 = f13461e + 15;
        f13460c = i3 % 128;
        int i4 = i3 % 2;
        a(mutableState, f2);
        int i5 = f13460c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f13461e = i5 % 128;
        int i6 = i5 % 2;
    }

    private static final void a(MutableState<Dp> mutableState, float f2) {
        int i2 = 2 % 2;
        int i3 = f13461e + 43;
        f13460c = i3 % 128;
        int i4 = i3 % 2;
        Dp dpM6636boximpl = Dp.m6636boximpl(f2);
        if (i4 != 0) {
            mutableState.setValue(dpM6636boximpl);
            int i5 = 49 / 0;
        } else {
            mutableState.setValue(dpM6636boximpl);
        }
        int i6 = f13461e + 89;
        f13460c = i6 % 128;
        int i7 = i6 % 2;
    }

    private static final float e(MutableState<Dp> mutableState) {
        int i2 = 2 % 2;
        int i3 = f13461e + 69;
        f13460c = i3 % 128;
        int i4 = i3 % 2;
        float fM6652unboximpl = mutableState.getValue().m6652unboximpl();
        int i5 = f13461e + 59;
        f13460c = i5 % 128;
        if (i5 % 2 == 0) {
            return fM6652unboximpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class d extends Lambda implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13496b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13497c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ DynamicFormsViewModel f13498a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ FormsContainerUiState f13499d;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
            int i2 = 2 % 2;
            int i3 = f13496b + 111;
            f13497c = i3 % 128;
            int i4 = i3 % 2;
            b(lazyListScope);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                int i5 = 82 / 0;
            }
            return unit;
        }

        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.dynamic_forms.view.DynamicFormsContainerScreenKt$d$d, reason: collision with other inner class name */
        static final class C0247d extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f13506b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f13507d = 1;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private /* synthetic */ String f13508a;

            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                int i2 = 2 % 2;
                int i3 = f13506b + 25;
                f13507d = i3 % 128;
                int i4 = i3 % 2;
                a(lazyItemScope, composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i5 = f13506b + 55;
                f13507d = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private void a(androidx.compose.foundation.lazy.LazyItemScope r33, androidx.compose.runtime.Composer r34, int r35) {
                /*
                    r32 = this;
                    r6 = 2
                    int r0 = r6 % r6
                    int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.DynamicFormsContainerScreenKt.d.C0247d.f13506b
                    int r2 = r0 + 5
                    int r0 = r2 % 128
                    com.incode.welcome_sdk.ui.dynamic_forms.view.DynamicFormsContainerScreenKt.d.C0247d.f13507d = r0
                    int r2 = r2 % r6
                    java.lang.String r0 = ""
                    r5 = r35
                    r1 = r34
                    r3 = r33
                    if (r2 != 0) goto Lb3
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    r2 = r5 & 34
                    r0 = 115(0x73, float:1.61E-43)
                    if (r2 != r0) goto L2e
                L1f:
                    int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.DynamicFormsContainerScreenKt.d.C0247d.f13507d
                    int r2 = r0 + 35
                    int r0 = r2 % 128
                    com.incode.welcome_sdk.ui.dynamic_forms.view.DynamicFormsContainerScreenKt.d.C0247d.f13506b = r0
                    int r2 = r2 % r6
                    boolean r0 = r1.getSkipping()
                    if (r0 != 0) goto Lad
                L2e:
                    boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    r0 = 1
                    r2 = r2 ^ r0
                    if (r2 == r0) goto L3f
                    r4 = -1
                    java.lang.String r3 = "com.incode.welcome_sdk.ui.dynamic_forms.view.DynamicFormsContainerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DynamicFormsContainerScreen.kt:85)"
                    r2 = 1316976282(0x4e7f769a, float:1.0714907E9)
                    androidx.compose.runtime.ComposerKt.traceEventStart(r2, r5, r4, r3)
                L3f:
                    r2 = r32
                    java.lang.String r7 = r2.f13508a
                    com.incode.welcome_sdk.commons.theme.g$d r2 = com.incode.welcome_sdk.commons.theme.g.d.f5677e
                    androidx.compose.ui.text.TextStyle r27 = com.incode.welcome_sdk.commons.theme.g.d.c()
                    r30 = 1572864(0x180000, float:2.204052E-39)
                    r31 = 65534(0xfffe, float:9.1833E-41)
                    r8 = 0
                    r9 = 0
                    r11 = 0
                    r13 = 0
                    r14 = 0
                    r15 = 0
                    r16 = 0
                    r18 = 0
                    r19 = 0
                    r20 = 0
                    r22 = 0
                    r23 = 0
                    r24 = 0
                    r25 = 0
                    r26 = 0
                    r29 = 0
                    r28 = r1
                    androidx.compose.material3.TextKt.m2711Text4IGK_g(r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                    androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
                    androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
                    r2 = 1098907648(0x41800000, float:16.0)
                    float r2 = androidx.compose.ui.unit.Dp.m6638constructorimpl(r2)
                    androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.m1049height3ABfNKs(r3, r2)
                    r2 = 6
                    androidx.compose.foundation.layout.SpacerKt.Spacer(r3, r1, r2)
                    boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                    r1 = r1 ^ r0
                    if (r1 == r0) goto La8
                    int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.DynamicFormsContainerScreenKt.d.C0247d.f13506b
                    int r1 = r0 + 41
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.dynamic_forms.view.DynamicFormsContainerScreenKt.d.C0247d.f13507d = r0
                    int r1 = r1 % r6
                    if (r1 != 0) goto La9
                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                    r0 = 6
                    int r0 = r0 / 0
                L99:
                    int r0 = com.incode.welcome_sdk.ui.dynamic_forms.view.DynamicFormsContainerScreenKt.d.C0247d.f13507d
                    int r1 = r0 + 55
                    int r0 = r1 % 128
                    com.incode.welcome_sdk.ui.dynamic_forms.view.DynamicFormsContainerScreenKt.d.C0247d.f13506b = r0
                    int r1 = r1 % r6
                    if (r1 == 0) goto La8
                    r0 = 50
                    int r0 = r0 / 0
                La8:
                    return
                La9:
                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                    goto L99
                Lad:
                    r1.skipToGroupEnd()
                    r0 = r32
                    goto La8
                Lb3:
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    r2 = r5 & 81
                    r0 = 16
                    if (r2 != r0) goto L2e
                    goto L1f
                */
                throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.DynamicFormsContainerScreenKt.d.C0247d.a(androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, int):void");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0247d(String str) {
                super(3);
                this.f13508a = str;
            }
        }

        /* synthetic */ class b extends FunctionReferenceImpl implements Function2<String, String, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f13502a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f13503d = 0;

            private void c(String str, String str2) {
                int i2 = 2 % 2;
                int i3 = f13503d + 125;
                f13502a = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    ((DynamicFormsViewModel) this.receiver).onTextInputTextChanged(str, str2);
                } else {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    ((DynamicFormsViewModel) this.receiver).onTextInputTextChanged(str, str2);
                    int i4 = 69 / 0;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Unit invoke(String str, String str2) {
                int i2 = 2 % 2;
                int i3 = f13503d + 111;
                f13502a = i3 % 128;
                int i4 = i3 % 2;
                c(str, str2);
                Unit unit = Unit.INSTANCE;
                if (i4 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            b(Object obj) {
                super(2, obj, DynamicFormsViewModel.class, "onTextInputTextChanged", "onTextInputTextChanged(Ljava/lang/String;Ljava/lang/String;)V", 0);
            }
        }

        /* synthetic */ class j extends FunctionReferenceImpl implements Function1<String, Unit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f13519b = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f13520d = 1;

            private void e(String str) {
                int i2 = 2 % 2;
                int i3 = f13519b + 125;
                f13520d = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    ((DynamicFormsViewModel) this.receiver).onFieldFocusChanged(str);
                } else {
                    Intrinsics.checkNotNullParameter(str, "");
                    ((DynamicFormsViewModel) this.receiver).onFieldFocusChanged(str);
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(String str) {
                int i2 = 2 % 2;
                int i3 = f13520d + 51;
                f13519b = i3 % 128;
                int i4 = i3 % 2;
                e(str);
                Unit unit = Unit.INSTANCE;
                int i5 = f13520d + 109;
                f13519b = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            j(Object obj) {
                super(1, obj, DynamicFormsViewModel.class, "onFieldFocusChanged", "onFieldFocusChanged(Ljava/lang/String;)V", 0);
            }
        }

        /* synthetic */ class f extends FunctionReferenceImpl implements Function2<String, String, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f13511a = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f13512e = 1;

            private void b(String str, String str2) {
                int i2 = 2 % 2;
                int i3 = f13512e + 13;
                f13511a = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    ((DynamicFormsViewModel) this.receiver).onPhoneInputTextChanged(str, str2);
                    int i4 = 49 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    ((DynamicFormsViewModel) this.receiver).onPhoneInputTextChanged(str, str2);
                }
                int i5 = f13512e + 57;
                f13511a = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Unit invoke(String str, String str2) {
                int i2 = 2 % 2;
                int i3 = f13511a + 25;
                f13512e = i3 % 128;
                int i4 = i3 % 2;
                b(str, str2);
                Unit unit = Unit.INSTANCE;
                if (i4 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            f(Object obj) {
                super(2, obj, DynamicFormsViewModel.class, "onPhoneInputTextChanged", "onPhoneInputTextChanged(Ljava/lang/String;Ljava/lang/String;)V", 0);
            }
        }

        /* synthetic */ class g extends FunctionReferenceImpl implements Function1<String, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f13513a = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f13514e = 0;

            private void d(String str) {
                int i2 = 2 % 2;
                int i3 = f13514e + 15;
                f13513a = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                ((DynamicFormsViewModel) this.receiver).onFieldFocusChanged(str);
                int i5 = f13514e + 89;
                f13513a = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 21 / 0;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(String str) {
                int i2 = 2 % 2;
                int i3 = f13514e + 77;
                f13513a = i3 % 128;
                int i4 = i3 % 2;
                d(str);
                Unit unit = Unit.INSTANCE;
                int i5 = f13514e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                f13513a = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            g(Object obj) {
                super(1, obj, DynamicFormsViewModel.class, "onFieldFocusChanged", "onFieldFocusChanged(Ljava/lang/String;)V", 0);
            }
        }

        /* synthetic */ class l extends FunctionReferenceImpl implements Function1<String, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f13523a = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f13524e = 1;

            private void b(String str) {
                int i2 = 2 % 2;
                int i3 = f13524e + 61;
                f13523a = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    ((DynamicFormsViewModel) this.receiver).showCountrySelectorDialog(str);
                } else {
                    Intrinsics.checkNotNullParameter(str, "");
                    ((DynamicFormsViewModel) this.receiver).showCountrySelectorDialog(str);
                    int i4 = 83 / 0;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(String str) {
                int i2 = 2 % 2;
                int i3 = f13523a + 11;
                f13524e = i3 % 128;
                int i4 = i3 % 2;
                b(str);
                Unit unit = Unit.INSTANCE;
                int i5 = f13524e + 11;
                f13523a = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            l(Object obj) {
                super(1, obj, DynamicFormsViewModel.class, "showCountrySelectorDialog", "showCountrySelectorDialog(Ljava/lang/String;)V", 0);
            }
        }

        /* synthetic */ class n extends FunctionReferenceImpl implements Function2<String, String, Unit> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f13527c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f13528d = 0;

            private void e(String str, String str2) {
                int i2 = 2 % 2;
                int i3 = f13527c + 101;
                f13528d = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                ((DynamicFormsViewModel) this.receiver).onCountrySelectorSearchTextChanged(str, str2);
                int i5 = f13527c + 87;
                f13528d = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Unit invoke(String str, String str2) {
                int i2 = 2 % 2;
                int i3 = f13528d + 111;
                f13527c = i3 % 128;
                int i4 = i3 % 2;
                e(str, str2);
                Unit unit = Unit.INSTANCE;
                int i5 = f13528d + 105;
                f13527c = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            n(Object obj) {
                super(2, obj, DynamicFormsViewModel.class, "onCountrySelectorSearchTextChanged", "onCountrySelectorSearchTextChanged(Ljava/lang/String;Ljava/lang/String;)V", 0);
            }
        }

        /* synthetic */ class m extends FunctionReferenceImpl implements Function2<String, FormsCountrySelectorUiState.CountryUiState, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f13525a = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f13526d = 1;

            private void d(String str, FormsCountrySelectorUiState.CountryUiState countryUiState) {
                int i2 = 2 % 2;
                int i3 = f13526d + 55;
                f13525a = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(countryUiState, "");
                ((DynamicFormsViewModel) this.receiver).onCountrySelectorItemSelected(str, countryUiState);
                int i5 = f13526d + 35;
                f13525a = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Unit invoke(String str, FormsCountrySelectorUiState.CountryUiState countryUiState) {
                int i2 = 2 % 2;
                int i3 = f13525a + 1;
                f13526d = i3 % 128;
                int i4 = i3 % 2;
                d(str, countryUiState);
                Unit unit = Unit.INSTANCE;
                int i5 = f13526d + 85;
                f13525a = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            m(Object obj) {
                super(2, obj, DynamicFormsViewModel.class, "onCountrySelectorItemSelected", "onCountrySelectorItemSelected(Ljava/lang/String;Lcom/incode/welcome_sdk/ui/dynamic_forms/state/FormsCountrySelectorUiState$CountryUiState;)V", 0);
            }
        }

        /* synthetic */ class o extends FunctionReferenceImpl implements Function1<String, Unit> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f13529d = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f13530e = 0;

            private void d(String str) {
                int i2 = 2 % 2;
                int i3 = f13530e + 61;
                f13529d = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    ((DynamicFormsViewModel) this.receiver).onCountrySelectorClearButtonClicked(str);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(str, "");
                ((DynamicFormsViewModel) this.receiver).onCountrySelectorClearButtonClicked(str);
                int i4 = f13530e + 125;
                f13529d = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(String str) {
                int i2 = 2 % 2;
                int i3 = f13529d + 79;
                f13530e = i3 % 128;
                int i4 = i3 % 2;
                d(str);
                Unit unit = Unit.INSTANCE;
                int i5 = f13530e + 27;
                f13529d = i5 % 128;
                if (i5 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            o(Object obj) {
                super(1, obj, DynamicFormsViewModel.class, "onCountrySelectorClearButtonClicked", "onCountrySelectorClearButtonClicked(Ljava/lang/String;)V", 0);
            }
        }

        /* synthetic */ class k extends FunctionReferenceImpl implements Function1<String, Unit> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f13521c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f13522d = 1;

            private void c(String str) {
                int i2 = 2 % 2;
                int i3 = f13521c + 17;
                f13522d = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    ((DynamicFormsViewModel) this.receiver).hideCountrySelectorDialog(str);
                    int i4 = 78 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(str, "");
                    ((DynamicFormsViewModel) this.receiver).hideCountrySelectorDialog(str);
                }
                int i5 = f13522d + 111;
                f13521c = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 80 / 0;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(String str) {
                int i2 = 2 % 2;
                int i3 = f13522d + 21;
                f13521c = i3 % 128;
                int i4 = i3 % 2;
                c(str);
                Unit unit = Unit.INSTANCE;
                int i5 = f13522d + 53;
                f13521c = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            k(Object obj) {
                super(1, obj, DynamicFormsViewModel.class, "hideCountrySelectorDialog", "hideCountrySelectorDialog(Ljava/lang/String;)V", 0);
            }
        }

        /* synthetic */ class a extends FunctionReferenceImpl implements Function2<String, Boolean, Unit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f13500b = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f13501e = 1;

            private void c(String str, boolean z2) {
                int i2 = 2 % 2;
                int i3 = f13500b + 117;
                f13501e = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    ((DynamicFormsViewModel) this.receiver).onYesNoAnswerSelected(str, z2);
                } else {
                    Intrinsics.checkNotNullParameter(str, "");
                    ((DynamicFormsViewModel) this.receiver).onYesNoAnswerSelected(str, z2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Unit invoke(String str, Boolean bool) {
                int i2 = 2 % 2;
                int i3 = f13500b + 73;
                f13501e = i3 % 128;
                int i4 = i3 % 2;
                c(str, bool.booleanValue());
                Unit unit = Unit.INSTANCE;
                if (i4 == 0) {
                    throw null;
                }
                int i5 = f13501e + 37;
                f13500b = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            a(Object obj) {
                super(2, obj, DynamicFormsViewModel.class, "onYesNoAnswerSelected", "onYesNoAnswerSelected(Ljava/lang/String;Z)V", 0);
            }
        }

        /* synthetic */ class e extends FunctionReferenceImpl implements Function1<String, Unit> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f13509b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f13510c = 0;

            private void a(String str) {
                int i2 = 2 % 2;
                int i3 = f13509b + 123;
                f13510c = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    ((DynamicFormsViewModel) this.receiver).onDateInputLableClicked(str);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(str, "");
                ((DynamicFormsViewModel) this.receiver).onDateInputLableClicked(str);
                int i4 = f13510c + 93;
                f13509b = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(String str) {
                int i2 = 2 % 2;
                int i3 = f13509b + 45;
                f13510c = i3 % 128;
                int i4 = i3 % 2;
                a(str);
                Unit unit = Unit.INSTANCE;
                int i5 = f13510c + 95;
                f13509b = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            e(Object obj) {
                super(1, obj, DynamicFormsViewModel.class, "onDateInputLableClicked", "onDateInputLableClicked(Ljava/lang/String;)V", 0);
            }
        }

        /* synthetic */ class c extends FunctionReferenceImpl implements Function1<String, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f13504a = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f13505b = 0;

            private void a(String str) {
                int i2 = 2 % 2;
                int i3 = f13504a + 67;
                f13505b = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                ((DynamicFormsViewModel) this.receiver).onDatePickerDismiss(str);
                int i5 = f13505b + 13;
                f13504a = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(String str) {
                int i2 = 2 % 2;
                int i3 = f13505b + 99;
                f13504a = i3 % 128;
                int i4 = i3 % 2;
                a(str);
                Unit unit = Unit.INSTANCE;
                if (i4 == 0) {
                    int i5 = 18 / 0;
                }
                int i6 = f13504a + 99;
                f13505b = i6 % 128;
                int i7 = i6 % 2;
                return unit;
            }

            c(Object obj) {
                super(1, obj, DynamicFormsViewModel.class, "onDatePickerDismiss", "onDatePickerDismiss(Ljava/lang/String;)V", 0);
            }
        }

        /* synthetic */ class i extends FunctionReferenceImpl implements Function2<String, Long, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f13517a = 1;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f13518e = 0;

            private void b(String str, Long l2) {
                int i2 = 2 % 2;
                int i3 = f13518e + 75;
                f13517a = i3 % 128;
                if (i3 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(str, "");
                    ((DynamicFormsViewModel) this.receiver).onDatePickerOkButtonClicked(str, l2);
                } else {
                    Intrinsics.checkNotNullParameter(str, "");
                    ((DynamicFormsViewModel) this.receiver).onDatePickerOkButtonClicked(str, l2);
                    throw null;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Unit invoke(String str, Long l2) {
                int i2 = 2 % 2;
                int i3 = f13518e + 97;
                f13517a = i3 % 128;
                int i4 = i3 % 2;
                b(str, l2);
                Unit unit = Unit.INSTANCE;
                int i5 = f13518e + 27;
                f13517a = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 9 / 0;
                }
                return unit;
            }

            i(Object obj) {
                super(2, obj, DynamicFormsViewModel.class, "onDatePickerOkButtonClicked", "onDatePickerOkButtonClicked(Ljava/lang/String;Ljava/lang/Long;)V", 0);
            }
        }

        /* synthetic */ class h extends FunctionReferenceImpl implements Function2<String, String, Unit> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f13515c = 0;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static int f13516e = 1;

            private void d(String str, String str2) {
                int i2 = 2 % 2;
                int i3 = f13516e + 47;
                f13515c = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                ((DynamicFormsViewModel) this.receiver).onAnswerSelected(str, str2);
                int i5 = f13515c + 69;
                f13516e = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 27 / 0;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Unit invoke(String str, String str2) {
                int i2 = 2 % 2;
                int i3 = f13515c + 59;
                f13516e = i3 % 128;
                int i4 = i3 % 2;
                d(str, str2);
                Unit unit = Unit.INSTANCE;
                int i5 = f13515c + 5;
                f13516e = i5 % 128;
                int i6 = i5 % 2;
                return unit;
            }

            h(Object obj) {
                super(2, obj, DynamicFormsViewModel.class, "onAnswerSelected", "onAnswerSelected(Ljava/lang/String;Ljava/lang/String;)V", 0);
            }
        }

        private void b(LazyListScope lazyListScope) {
            int i2 = 2 % 2;
            int i3 = f13497c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f13496b = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(lazyListScope, "");
                this.f13499d.getTitle();
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(lazyListScope, "");
            String title = this.f13499d.getTitle();
            if (title != null) {
                LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(1316976282, true, new C0247d(title)), 3, null);
            }
            final List<FormsInputUiState<?>> questions = this.f13499d.getQuestions();
            final DynamicFormsViewModel dynamicFormsViewModel = this.f13498a;
            final DynamicFormsContainerScreenKt$DynamicFormsContainerScreen$1$1$3$invoke$$inlined$items$default$1 dynamicFormsContainerScreenKt$DynamicFormsContainerScreen$1$1$3$invoke$$inlined$items$default$1 = new Function1() { // from class: com.incode.welcome_sdk.ui.dynamic_forms.view.DynamicFormsContainerScreenKt$DynamicFormsContainerScreen$1$1$3$invoke$$inlined$items$default$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f13462a = 0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f13463b = 1;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f13464c = 1;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private static int f13465d = 0;

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    int i4 = 2 % 2;
                    int i5 = f13463b + 59;
                    f13462a = i5 % 128;
                    int i6 = i5 % 2;
                    Void voidInvoke = invoke((FormsInputUiState<?>) obj2);
                    if (i6 != 0) {
                        int i7 = 54 / 0;
                    }
                    int i8 = f13462a + 9;
                    f13463b = i8 % 128;
                    int i9 = i8 % 2;
                    return voidInvoke;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(FormsInputUiState<?> formsInputUiState) {
                    int i4 = 2 % 2;
                    int i5 = f13463b;
                    int i6 = i5 + 55;
                    f13462a = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = i5 + 107;
                    f13462a = i8 % 128;
                    int i9 = i8 % 2;
                    return null;
                }

                static {
                    int i4 = f13464c + 101;
                    f13465d = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                }
            };
            lazyListScope.items(questions.size(), null, new Function1<Integer, Object>() { // from class: com.incode.welcome_sdk.ui.dynamic_forms.view.DynamicFormsContainerScreenKt$DynamicFormsContainerScreen$1$1$3$invoke$$inlined$items$default$3

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f13471a = 1;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f13472b = 0;

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Integer num) {
                    int i4 = 2 % 2;
                    int i5 = f13472b + 17;
                    f13471a = i5 % 128;
                    int i6 = i5 % 2;
                    Object objInvoke = invoke(num.intValue());
                    if (i6 == 0) {
                        int i7 = 4 / 0;
                    }
                    return objInvoke;
                }

                public final Object invoke(int i4) {
                    int i5 = 2 % 2;
                    int i6 = f13471a + 29;
                    f13472b = i6 % 128;
                    int i7 = i6 % 2;
                    Object objInvoke = dynamicFormsContainerScreenKt$DynamicFormsContainerScreen$1$1$3$invoke$$inlined$items$default$1.invoke(questions.get(i4));
                    int i8 = f13471a + 59;
                    f13472b = i8 % 128;
                    int i9 = i8 % 2;
                    return objInvoke;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.incode.welcome_sdk.ui.dynamic_forms.view.DynamicFormsContainerScreenKt$DynamicFormsContainerScreen$1$1$3$invoke$$inlined$items$default$4

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private static int f13475b = 1;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f13476c = 0;

                @Override // kotlin.jvm.functions.Function4
                public final /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    int i4 = 2 % 2;
                    int i5 = f13476c + 39;
                    f13475b = i5 % 128;
                    int i6 = i5 % 2;
                    Object obj2 = null;
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    Unit unit = Unit.INSTANCE;
                    if (i6 == 0) {
                        obj2.hashCode();
                        throw null;
                    }
                    int i7 = f13476c + 85;
                    f13475b = i7 % 128;
                    if (i7 % 2 != 0) {
                        return unit;
                    }
                    obj2.hashCode();
                    throw null;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i4, Composer composer, int i5) {
                    int i6;
                    int i7;
                    int i8;
                    int i9 = 2 % 2;
                    int i10 = f13475b + 91;
                    f13476c = i10 % 128;
                    int i11 = i10 % 2;
                    ComposerKt.sourceInformation(composer, "C152@7074L22:LazyDsl.kt#428nma");
                    if ((i5 & 6) == 0) {
                        if (composer.changed(lazyItemScope)) {
                            int i12 = f13476c + 99;
                            f13475b = i12 % 128;
                            int i13 = i12 % 2;
                            i8 = 4;
                        } else {
                            i8 = 2;
                        }
                        i6 = i8 | i5;
                    } else {
                        i6 = i5;
                    }
                    if ((i5 & 48) == 0) {
                        if (composer.changed(i4)) {
                            int i14 = f13476c + 37;
                            f13475b = i14 % 128;
                            int i15 = i14 % 2;
                            i7 = 32;
                        } else {
                            i7 = 16;
                        }
                        i6 |= i7;
                    }
                    if ((i6 & 147) == 146 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i6, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                        }
                        FormsInputUiState formsInputUiState = (FormsInputUiState) questions.get(i4);
                        if (formsInputUiState instanceof FormsTextInputUiState) {
                            composer.startReplaceableGroup(1463614716);
                            FormsTextInputViewKt.FormsTextInputView((FormsTextInputUiState) formsInputUiState, new DynamicFormsContainerScreenKt.d.b(dynamicFormsViewModel), new DynamicFormsContainerScreenKt.d.j(dynamicFormsViewModel), composer, 0);
                            composer.endReplaceableGroup();
                        } else if (formsInputUiState instanceof FormsPhoneInputUiState) {
                            composer.startReplaceableGroup(1463615019);
                            FormsPhoneInputScreenKt.FormsPhoneInputScreen((FormsPhoneInputUiState) formsInputUiState, new DynamicFormsContainerScreenKt.d.f(dynamicFormsViewModel), new DynamicFormsContainerScreenKt.d.g(dynamicFormsViewModel), composer, 0);
                            composer.endReplaceableGroup();
                        } else if (formsInputUiState instanceof FormsCountrySelectorUiState) {
                            composer.startReplaceableGroup(1463615331);
                            FormsCountrySelectorScreenKt.FormsCountrySelectorScreen((FormsCountrySelectorUiState) formsInputUiState, new DynamicFormsContainerScreenKt.d.l(dynamicFormsViewModel), new DynamicFormsContainerScreenKt.d.k(dynamicFormsViewModel), new DynamicFormsContainerScreenKt.d.n(dynamicFormsViewModel), new DynamicFormsContainerScreenKt.d.m(dynamicFormsViewModel), new DynamicFormsContainerScreenKt.d.o(dynamicFormsViewModel), composer, 8);
                            composer.endReplaceableGroup();
                        } else if (formsInputUiState instanceof FormsYesNoUiState) {
                            composer.startReplaceableGroup(1463615941);
                            FormsYesNoScreenKt.FormsYesNoScreen((FormsYesNoUiState) formsInputUiState, new DynamicFormsContainerScreenKt.d.a(dynamicFormsViewModel), composer, 0);
                            composer.endReplaceableGroup();
                        } else if (formsInputUiState instanceof FormsDateInputUiState) {
                            composer.startReplaceableGroup(1463616169);
                            FormsDateInputScreenKt.FormsDateInputScreen((FormsDateInputUiState) formsInputUiState, new DynamicFormsContainerScreenKt.d.e(dynamicFormsViewModel), new DynamicFormsContainerScreenKt.d.c(dynamicFormsViewModel), new DynamicFormsContainerScreenKt.d.i(dynamicFormsViewModel), composer, 8);
                            composer.endReplaceableGroup();
                        } else if (formsInputUiState instanceof FormsSelectInputUiState) {
                            composer.startReplaceableGroup(1463616589);
                            FormsSelectInputScreenKt.FormsSelectInputScreen((FormsSelectInputUiState) formsInputUiState, new DynamicFormsContainerScreenKt.d.h(dynamicFormsViewModel), composer, 8);
                            composer.endReplaceableGroup();
                        } else {
                            composer.startReplaceableGroup(1463616786);
                            composer.endReplaceableGroup();
                        }
                        SpacerKt.Spacer(SizeKt.m1049height3ABfNKs(Modifier.Companion, Dp.m6638constructorimpl(32.0f)), composer, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            int i16 = f13475b + 51;
                            f13476c = i16 % 128;
                            if (i16 % 2 == 0) {
                                ComposerKt.traceEventEnd();
                                return;
                            } else {
                                ComposerKt.traceEventEnd();
                                int i17 = 22 / 0;
                                return;
                            }
                        }
                    }
                    int i18 = f13475b + 51;
                    f13476c = i18 % 128;
                    if (i18 % 2 == 0) {
                        return;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }
            }));
            int i4 = f13496b + 89;
            f13497c = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(FormsContainerUiState formsContainerUiState, DynamicFormsViewModel dynamicFormsViewModel) {
            super(1);
            this.f13499d = formsContainerUiState;
            this.f13498a = dynamicFormsViewModel;
        }
    }

    static final class e extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13531b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f13532c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ MutableState<Dp> f13533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Density f13534e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            int i2 = 2 % 2;
            int i3 = f13531b + 57;
            f13532c = i3 % 128;
            int i4 = i3 % 2;
            e(layoutCoordinates);
            Unit unit = Unit.INSTANCE;
            int i5 = f13532c + 59;
            f13531b = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(LayoutCoordinates layoutCoordinates) {
            int i2 = 2 % 2;
            int i3 = f13531b + 31;
            f13532c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(layoutCoordinates, "");
            DynamicFormsContainerScreenKt.access$DynamicFormsContainerScreen$lambda$2(this.f13533d, this.f13534e.mo707toDpu2uoSUM(IntSize.m6807getHeightimpl(layoutCoordinates.mo5522getSizeYbymL2g())));
            int i5 = f13532c + 27;
            f13531b = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Density density, MutableState<Dp> mutableState) {
            super(1);
            this.f13534e = density;
            this.f13533d = mutableState;
        }
    }

    static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f13492a = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f13493d = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ DynamicFormsViewModel f13494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ FormsContainerUiState f13495c;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f13492a + 3;
            f13493d = i3 % 128;
            int i4 = i3 % 2;
            e();
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void e() {
            int i2 = 2 % 2;
            int i3 = f13493d + 45;
            f13492a = i3 % 128;
            int i4 = i3 % 2;
            this.f13494b.onButtonClicked(this.f13495c.getQuestions());
            int i5 = f13493d + 43;
            f13492a = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(DynamicFormsViewModel dynamicFormsViewModel, FormsContainerUiState formsContainerUiState) {
            super(0);
            this.f13494b = dynamicFormsViewModel;
            this.f13495c = formsContainerUiState;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x02b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void DynamicFormsContainerScreen(com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel r25, com.incode.welcome_sdk.commons.b r26, androidx.compose.runtime.Composer r27, int r28) {
        /*
            Method dump skipped, instruction units count: 1081
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.DynamicFormsContainerScreenKt.DynamicFormsContainerScreen(com.incode.welcome_sdk.ui.dynamic_forms.viewmodel.DynamicFormsViewModel, com.incode.welcome_sdk.commons.b, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0029 A[PHI: r6
  0x0029: PHI (r6v4 androidx.compose.runtime.Composer) = (r6v0 androidx.compose.runtime.Composer), (r6v5 androidx.compose.runtime.Composer) binds: [B:74:0x018d, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0191 A[PHI: r6
  0x0191: PHI (r6v1 androidx.compose.runtime.Composer) = (r6v0 androidx.compose.runtime.Composer), (r6v5 androidx.compose.runtime.Composer) binds: [B:74:0x018d, B:5:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void BottomButtonContainer(androidx.compose.foundation.layout.ColumnScope r16, boolean r17, boolean r18, boolean r19, kotlin.jvm.functions.Function0<kotlin.Unit> r20, androidx.compose.runtime.Composer r21, int r22) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.dynamic_forms.view.DynamicFormsContainerScreenKt.BottomButtonContainer(androidx.compose.foundation.layout.ColumnScope, boolean, boolean, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f13479h = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static int f13480j = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ boolean f13481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ boolean f13482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Function0<Unit> f13483c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ ColumnScope f13484d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ boolean f13485e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private /* synthetic */ int f13486i;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13479h + 81;
            f13480j = i3 % 128;
            int i4 = i3 % 2;
            e(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f13479h + 13;
            f13480j = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13480j + 15;
            f13479h = i3 % 128;
            int i4 = i3 % 2;
            DynamicFormsContainerScreenKt.BottomButtonContainer(this.f13484d, this.f13482b, this.f13481a, this.f13485e, this.f13483c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13486i | 1));
            int i5 = f13480j + 67;
            f13479h = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ColumnScope columnScope, boolean z2, boolean z3, boolean z4, Function0<Unit> function0, int i2) {
            super(2);
            this.f13484d = columnScope;
            this.f13482b = z2;
            this.f13481a = z3;
            this.f13485e = z4;
            this.f13483c = function0;
            this.f13486i = i2;
        }
    }

    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f13487b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f13488e = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ com.incode.welcome_sdk.commons.b f13489a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ int f13490c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ DynamicFormsViewModel f13491d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f13488e + 49;
            f13487b = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f13488e + 41;
            f13487b = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f13488e + 111;
            f13487b = i3 % 128;
            int i4 = i3 % 2;
            DynamicFormsContainerScreenKt.DynamicFormsContainerScreen(this.f13491d, this.f13489a, composer, RecomposeScopeImplKt.updateChangedFlags(this.f13490c | 1));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(DynamicFormsViewModel dynamicFormsViewModel, com.incode.welcome_sdk.commons.b bVar, int i2) {
            super(2);
            this.f13491d = dynamicFormsViewModel;
            this.f13489a = bVar;
            this.f13490c = i2;
        }
    }
}
