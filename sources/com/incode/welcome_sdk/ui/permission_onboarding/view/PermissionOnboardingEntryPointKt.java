package com.incode.welcome_sdk.ui.permission_onboarding.view;

import android.os.Process;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionsUtilKt;
import com.incode.welcome_sdk.ui.permission_onboarding.event.PermissionOnboardingEvent;
import com.incode.welcome_sdk.ui.permission_onboarding.viewmodel.PermissionOnboardingStep;
import com.incode.welcome_sdk.ui.permission_onboarding.viewmodel.PermissionViewModel;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class PermissionOnboardingEntryPointKt {

    /* JADX INFO: renamed from: a */
    private static int f16755a = 0;

    /* JADX INFO: renamed from: e */
    private static int f16756e = 1;

    public static final /* synthetic */ void access$BlackScreen(Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = f16755a + 57;
        f16756e = i4 % 128;
        int i5 = i4 % 2;
        a(composer, i2);
        int i6 = f16756e + 85;
        f16755a = i6 % 128;
        int i7 = i6 % 2;
    }

    static final class j extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: b */
        private static int f16785b = 1;

        /* JADX INFO: renamed from: c */
        private static int f16786c = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ PermissionViewModel f16787a;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Boolean bool) {
            int i2 = 2 % 2;
            int i3 = f16786c + 27;
            f16785b = i3 % 128;
            int i4 = i3 % 2;
            b(bool.booleanValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f16785b + 25;
            f16786c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void b(boolean z2) {
            int i2 = 2 % 2;
            this.f16787a.onEvent(new PermissionOnboardingEvent.OnPermissionResult(z2));
            int i3 = f16785b + 85;
            f16786c = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(PermissionViewModel permissionViewModel) {
            super(1);
            this.f16787a = permissionViewModel;
        }
    }

    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<PermissionOnboardingEvent, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f16760a = 0;

        /* JADX INFO: renamed from: c */
        public static int f16761c = 0;

        /* JADX INFO: renamed from: d */
        public static int f16762d = 0;

        /* JADX INFO: renamed from: e */
        private static int f16763e = 1;

        private void c(PermissionOnboardingEvent permissionOnboardingEvent) {
            int i2 = 2 % 2;
            int i3 = f16763e + 123;
            f16760a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
            ((PermissionViewModel) this.receiver).onEvent(permissionOnboardingEvent);
            int i5 = f16763e + 1;
            f16760a = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(PermissionOnboardingEvent permissionOnboardingEvent) {
            int i2 = 2 % 2;
            int i3 = f16763e + 77;
            f16760a = i3 % 128;
            int i4 = i3 % 2;
            c(permissionOnboardingEvent);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 41 / 0;
            }
            return unit;
        }

        public static int b() {
            int i2 = f16762d;
            int i3 = i2 % 5820262;
            f16762d = i2 + 1;
            if (i3 != 0) {
                return f16761c;
            }
            int iMyTid = Process.myTid();
            f16761c = iMyTid;
            return iMyTid;
        }

        b(Object obj) {
            super(1, obj, PermissionViewModel.class, "onEvent", "onEvent(Lcom/incode/welcome_sdk/ui/permission_onboarding/event/PermissionOnboardingEvent;)V", 0);
        }
    }

    /* synthetic */ class c extends FunctionReferenceImpl implements Function1<PermissionOnboardingEvent, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f16764a = 0;

        /* JADX INFO: renamed from: d */
        private static int f16765d = 1;

        private void a(PermissionOnboardingEvent permissionOnboardingEvent) {
            int i2 = 2 % 2;
            int i3 = f16764a + 109;
            f16765d = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
                ((PermissionViewModel) this.receiver).onEvent(permissionOnboardingEvent);
                throw null;
            }
            Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
            ((PermissionViewModel) this.receiver).onEvent(permissionOnboardingEvent);
            int i4 = f16765d + 109;
            f16764a = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(PermissionOnboardingEvent permissionOnboardingEvent) {
            int i2 = 2 % 2;
            int i3 = f16764a + 121;
            f16765d = i3 % 128;
            int i4 = i3 % 2;
            a(permissionOnboardingEvent);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                throw null;
            }
            int i5 = f16765d + 101;
            f16764a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        c(Object obj) {
            super(1, obj, PermissionViewModel.class, "onEvent", "onEvent(Lcom/incode/welcome_sdk/ui/permission_onboarding/event/PermissionOnboardingEvent;)V", 0);
        }
    }

    /* synthetic */ class d extends FunctionReferenceImpl implements Function1<PermissionOnboardingEvent, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f16766a = 1;

        /* JADX INFO: renamed from: c */
        private static int f16767c = 0;

        private void a(PermissionOnboardingEvent permissionOnboardingEvent) {
            int i2 = 2 % 2;
            int i3 = f16767c + 61;
            f16766a = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
                ((PermissionViewModel) this.receiver).onEvent(permissionOnboardingEvent);
            } else {
                Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
                ((PermissionViewModel) this.receiver).onEvent(permissionOnboardingEvent);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(PermissionOnboardingEvent permissionOnboardingEvent) {
            int i2 = 2 % 2;
            int i3 = f16766a + 3;
            f16767c = i3 % 128;
            int i4 = i3 % 2;
            a(permissionOnboardingEvent);
            Unit unit = Unit.INSTANCE;
            int i5 = f16767c + 19;
            f16766a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 33 / 0;
            }
            return unit;
        }

        d(Object obj) {
            super(1, obj, PermissionViewModel.class, "onEvent", "onEvent(Lcom/incode/welcome_sdk/ui/permission_onboarding/event/PermissionOnboardingEvent;)V", 0);
        }
    }

    /* synthetic */ class e extends FunctionReferenceImpl implements Function1<PermissionOnboardingEvent, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f16768a = 0;

        /* JADX INFO: renamed from: c */
        private static int f16769c = 1;

        private void a(PermissionOnboardingEvent permissionOnboardingEvent) {
            int i2 = 2 % 2;
            int i3 = f16769c + 5;
            f16768a = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
                ((PermissionViewModel) this.receiver).onEvent(permissionOnboardingEvent);
            } else {
                Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
                ((PermissionViewModel) this.receiver).onEvent(permissionOnboardingEvent);
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(PermissionOnboardingEvent permissionOnboardingEvent) {
            int i2 = 2 % 2;
            int i3 = f16768a + 85;
            f16769c = i3 % 128;
            int i4 = i3 % 2;
            a(permissionOnboardingEvent);
            Unit unit = Unit.INSTANCE;
            int i5 = f16769c + 87;
            f16768a = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        e(Object obj) {
            super(1, obj, PermissionViewModel.class, "onEvent", "onEvent(Lcom/incode/welcome_sdk/ui/permission_onboarding/event/PermissionOnboardingEvent;)V", 0);
        }
    }

    /* synthetic */ class h extends FunctionReferenceImpl implements Function1<PermissionOnboardingEvent, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f16778c = 1;

        /* JADX INFO: renamed from: d */
        private static int f16779d = 0;

        private void b(PermissionOnboardingEvent permissionOnboardingEvent) {
            int i2 = 2 % 2;
            int i3 = f16779d + 37;
            f16778c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
            ((PermissionViewModel) this.receiver).onEvent(permissionOnboardingEvent);
            int i5 = f16778c + 13;
            f16779d = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(PermissionOnboardingEvent permissionOnboardingEvent) {
            int i2 = 2 % 2;
            int i3 = f16778c + 73;
            f16779d = i3 % 128;
            int i4 = i3 % 2;
            b(permissionOnboardingEvent);
            Unit unit = Unit.INSTANCE;
            int i5 = f16778c + 23;
            f16779d = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 61 / 0;
            }
            return unit;
        }

        h(Object obj) {
            super(1, obj, PermissionViewModel.class, "onEvent", "onEvent(Lcom/incode/welcome_sdk/ui/permission_onboarding/event/PermissionOnboardingEvent;)V", 0);
        }
    }

    /* synthetic */ class g extends FunctionReferenceImpl implements Function1<PermissionOnboardingEvent, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f16776c = 1;

        /* JADX INFO: renamed from: e */
        private static int f16777e = 0;

        private void e(PermissionOnboardingEvent permissionOnboardingEvent) {
            int i2 = 2 % 2;
            int i3 = f16776c + 77;
            f16777e = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
                ((PermissionViewModel) this.receiver).onEvent(permissionOnboardingEvent);
                throw null;
            }
            Intrinsics.checkNotNullParameter(permissionOnboardingEvent, "");
            ((PermissionViewModel) this.receiver).onEvent(permissionOnboardingEvent);
            int i4 = f16777e + 29;
            f16776c = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(PermissionOnboardingEvent permissionOnboardingEvent) {
            int i2 = 2 % 2;
            int i3 = f16776c + 57;
            f16777e = i3 % 128;
            int i4 = i3 % 2;
            e(permissionOnboardingEvent);
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                int i5 = 98 / 0;
            }
            return unit;
        }

        g(Object obj) {
            super(1, obj, PermissionViewModel.class, "onEvent", "onEvent(Lcom/incode/welcome_sdk/ui/permission_onboarding/event/PermissionOnboardingEvent;)V", 0);
        }
    }

    static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a */
        private static int f16770a = 0;

        /* JADX INFO: renamed from: h */
        private static int f16771h = 1;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ PermissionState f16772b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ State<PermissionViewModel.State> f16773c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ Function0<Unit> f16774d;

        /* JADX INFO: renamed from: e */
        private int f16775e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f16770a + 41;
            f16771h = i3 % 128;
            int i4 = i3 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (PermissionsUtilKt.isGranted(this.f16772b.getStatus())) {
                this.f16774d.invoke();
            } else if (Intrinsics.areEqual(this.f16773c.getValue().getPermissionStep(), PermissionOnboardingStep.AskForRealPermission.f16834e)) {
                int i5 = f16771h + 9;
                f16770a = i5 % 128;
                if (i5 % 2 != 0) {
                    this.f16772b.launchPermissionRequest();
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                this.f16772b.launchPermissionRequest();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16771h + 29;
            f16770a = i3 % 128;
            int i4 = i3 % 2;
            Object objD = d(coroutineScope, continuation);
            if (i4 != 0) {
                int i5 = 97 / 0;
            }
            int i6 = f16771h + 23;
            f16770a = i6 % 128;
            int i7 = i6 % 2;
            return objD;
        }

        private Object d(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f16771h + 77;
            f16770a = i3 % 128;
            int i4 = i3 % 2;
            Object objInvokeSuspend = ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i5 = f16771h + 87;
            f16770a = i5 % 128;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            f fVar = new f(this.f16772b, this.f16774d, this.f16773c, continuation);
            int i3 = f16771h + 85;
            f16770a = i3 % 128;
            if (i3 % 2 == 0) {
                return fVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(PermissionState permissionState, Function0<Unit> function0, State<PermissionViewModel.State> state, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f16772b = permissionState;
            this.f16774d = function0;
            this.f16773c = state;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void PermissionOnboardingEntryPoint(com.incode.welcome_sdk.ui.permission_onboarding.viewmodel.PermissionViewModel r16, kotlin.jvm.functions.Function0<kotlin.Unit> r17, androidx.compose.runtime.Composer r18, int r19) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt.PermissionOnboardingEntryPoint(com.incode.welcome_sdk.ui.permission_onboarding.viewmodel.PermissionViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void a(androidx.compose.runtime.Composer r11, int r12) {
        /*
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt.f16756e
            int r1 = r0 + 89
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt.f16755a = r0
            int r1 = r1 % r5
            r3 = 1672925245(0x63b6d03d, float:6.744625E21)
            androidx.compose.runtime.Composer r2 = r11.startRestartGroup(r3)
            r4 = 0
            if (r12 != 0) goto L3b
            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt.f16756e
            int r1 = r0 + 117
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt.f16755a = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L79
            boolean r0 = r2.getSkipping()
            if (r0 == 0) goto L3b
            r2.skipToGroupEnd()
        L2a:
            androidx.compose.runtime.ScopeUpdateScope r1 = r2.endRestartGroup()
            if (r1 == 0) goto L3a
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt$a r0 = new com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt$a
            r0.<init>(r12)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r1.updateScope(r0)
        L3a:
            return
        L3b:
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L47
            r1 = -1
            java.lang.String r0 = "com.incode.welcome_sdk.ui.permission_onboarding.view.BlackScreen (PermissionOnboardingEntryPoint.kt:55)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r3, r12, r1, r0)
        L47:
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r3 = (androidx.compose.ui.Modifier) r3
            r1 = 0
            r0 = 1
            androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(r3, r1, r0, r4)
            com.incode.welcome_sdk.commons.theme.h r0 = com.incode.welcome_sdk.commons.theme.h.f5694b
            com.incode.welcome_sdk.commons.theme.IncodeColorScheme r0 = com.incode.welcome_sdk.commons.theme.h.a(r2)
            long r7 = r0.m8044getSurfaceNeutralDark0d7_KjU()
            r10 = 2
            r11 = 0
            r9 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.BackgroundKt.m573backgroundbw27NRU$default(r6, r7, r9, r10, r11)
            r0 = 0
            androidx.compose.foundation.layout.BoxKt.Box(r1, r2, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L2a
            int r0 = com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt.f16755a
            int r1 = r0 + 21
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt.f16756e = r0
            int r1 = r1 % r5
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L2a
        L79:
            r2.getSkipping()
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.permission_onboarding.view.PermissionOnboardingEntryPointKt.a(androidx.compose.runtime.Composer, int):void");
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: c */
        private static int f16757c = 1;

        /* JADX INFO: renamed from: d */
        private static int f16758d = 0;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ int f16759b;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16758d + 79;
            f16757c = i3 % 128;
            int i4 = i3 % 2;
            b(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f16758d + 11;
            f16757c = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void b(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f16757c + 19;
            f16758d = i3 % 128;
            int i4 = i3 % 2;
            PermissionOnboardingEntryPointKt.access$BlackScreen(composer, RecomposeScopeImplKt.updateChangedFlags(this.f16759b | 1));
            int i5 = f16758d + 105;
            f16757c = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i2) {
            super(2);
            this.f16759b = i2;
        }
    }

    static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: b */
        private static int f16780b = 1;

        /* JADX INFO: renamed from: e */
        private static int f16781e = 0;

        /* JADX INFO: renamed from: a */
        private /* synthetic */ PermissionViewModel f16782a;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Function0<Unit> f16783c;

        /* JADX INFO: renamed from: d */
        private /* synthetic */ int f16784d;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f16781e + 61;
            f16780b = i3 % 128;
            int i4 = i3 % 2;
            a(composer);
            Unit unit = Unit.INSTANCE;
            int i5 = f16780b + 73;
            f16781e = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void a(Composer composer) {
            int i2 = 2 % 2;
            int i3 = f16781e + 27;
            f16780b = i3 % 128;
            int i4 = i3 % 2;
            PermissionOnboardingEntryPointKt.PermissionOnboardingEntryPoint(this.f16782a, this.f16783c, composer, RecomposeScopeImplKt.updateChangedFlags(this.f16784d | 1));
            int i5 = f16781e + 73;
            f16780b = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(PermissionViewModel permissionViewModel, Function0<Unit> function0, int i2) {
            super(2);
            this.f16782a = permissionViewModel;
            this.f16783c = function0;
            this.f16784d = i2;
        }
    }
}
