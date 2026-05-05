package com.incode.welcome_sdk.commons.extensions;

import android.view.ViewGroup;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
public final class TransitionManagerUtils {
    public static final int $stable = 0;
    public static final TransitionManagerUtils INSTANCE = new TransitionManagerUtils();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5094a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5095b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5096d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f5097e = 0;

    private TransitionManagerUtils() {
    }

    static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5098a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f5099e = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ ViewGroup f5100b;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            Unit unit;
            int i2 = 2 % 2;
            int i3 = f5099e + 73;
            f5098a = i3 % 128;
            int i4 = i3 % 2;
            c();
            if (i4 == 0) {
                unit = Unit.INSTANCE;
                int i5 = 81 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i6 = f5099e + 17;
            f5098a = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        private void c() {
            int i2 = 2 % 2;
            int i3 = f5098a + 39;
            f5099e = i3 % 128;
            int i4 = i3 % 2;
            ViewGroup viewGroup = this.f5100b;
            viewGroup.notifySubtreeAccessibilityStateChanged(viewGroup, viewGroup, 1);
            int i5 = f5098a + 89;
            f5099e = i5 % 128;
            int i6 = i5 % 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ViewGroup viewGroup) {
            super(0);
            this.f5100b = viewGroup;
        }
    }

    @JvmStatic
    public static final void beginDelayedTransition(ViewGroup viewGroup, boolean z2) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        beginDelayedTransition(viewGroup, z2, new a(viewGroup));
        int i3 = f5097e + 43;
        f5094a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @JvmStatic
    public static final void beginDelayedTransition(ViewGroup viewGroup, boolean z2, Function0<Unit> function0) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(function0, "");
        beginDelayedTransition(viewGroup, new AutoTransition(), z2, function0);
        int i3 = f5094a + 79;
        f5097e = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public static final class b implements Transition.TransitionListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f5101c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5102d = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ boolean f5103b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Function0<Unit> f5104e;

        b(boolean z2, Function0<Unit> function0) {
            this.f5103b = z2;
            this.f5104e = function0;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            int i2 = 2 % 2;
            int i3 = f5102d + 101;
            f5101c = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(transition, "");
            } else {
                Intrinsics.checkNotNullParameter(transition, "");
                int i4 = 88 / 0;
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
            int i2 = 2 % 2;
            int i3 = f5102d + 3;
            f5101c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(transition, "");
            int i5 = f5101c + 3;
            f5102d = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
            int i2 = 2 % 2;
            int i3 = f5102d + 63;
            f5101c = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(transition, "");
                int i4 = 53 / 0;
            } else {
                Intrinsics.checkNotNullParameter(transition, "");
            }
            int i5 = f5101c + 63;
            f5102d = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
            int i2 = 2 % 2;
            int i3 = f5102d + 59;
            f5101c = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(transition, "");
                return;
            }
            Intrinsics.checkNotNullParameter(transition, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            int i2 = 2 % 2;
            int i3 = f5101c + 71;
            f5102d = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(transition, "");
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(transition, "");
            if (this.f5103b) {
                this.f5104e.invoke();
            }
            int i4 = f5102d + 3;
            f5101c = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 10 / 0;
            }
        }
    }

    @JvmStatic
    public static final void beginDelayedTransition(ViewGroup viewGroup, Transition transition, boolean z2, Function0<Unit> function0) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(transition, "");
        Intrinsics.checkNotNullParameter(function0, "");
        transition.addListener(new b(z2, function0));
        TransitionManager.beginDelayedTransition(viewGroup, transition);
        int i3 = f5094a + 77;
        f5097e = i3 % 128;
        int i4 = i3 % 2;
    }

    static {
        int i2 = f5095b + 89;
        f5096d = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
