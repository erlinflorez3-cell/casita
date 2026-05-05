package com.incode.welcome_sdk.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.ISardineRiskSdkWrapper;
import com.incode.welcome_sdk.commons.ui.events.UiEvent;
import com.incode.welcome_sdk.commons.ui.events.UiEventsBus;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import yg.CX;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseFragment extends Fragment implements BaseView {

    /* JADX INFO: renamed from: g */
    private static int f10785g = 0;

    /* JADX INFO: renamed from: o */
    private static int f10786o = 1;

    /* JADX INFO: renamed from: b */
    private boolean f10788b;

    /* JADX INFO: renamed from: c */
    private boolean f10789c;

    /* JADX INFO: renamed from: d */
    private boolean f10790d;

    /* JADX INFO: renamed from: f */
    private float f10792f;

    /* JADX INFO: renamed from: h */
    private int f10793h;

    /* JADX INFO: renamed from: i */
    private int f10794i;

    /* JADX INFO: renamed from: j */
    private boolean f10795j;

    /* JADX INFO: renamed from: a */
    private final Lazy f10787a = LazyKt.lazy(e.f10802d);

    /* JADX INFO: renamed from: e */
    private final Lazy f10791e = LazyKt.lazy(new a());

    static final class e extends Lambda implements Function0<IncodeWelcome> {

        /* JADX INFO: renamed from: a */
        private static int f10799a = 0;

        /* JADX INFO: renamed from: b */
        private static int f10800b = 1;

        /* JADX INFO: renamed from: c */
        private static int f10801c = 1;

        /* JADX INFO: renamed from: d */
        public static final e f10802d = new e();

        /* JADX INFO: renamed from: e */
        private static int f10803e = 0;

        private static IncodeWelcome e() {
            int i2 = 2 % 2;
            int i3 = f10800b + 71;
            f10803e = i3 % 128;
            int i4 = i3 % 2;
            IncodeWelcome companion = IncodeWelcome.Companion.getInstance();
            int i5 = f10803e + 123;
            f10800b = i5 % 128;
            if (i5 % 2 != 0) {
                return companion;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ IncodeWelcome invoke() {
            int i2 = 2 % 2;
            int i3 = f10800b + 71;
            f10803e = i3 % 128;
            int i4 = i3 % 2;
            IncodeWelcome incodeWelcomeE = e();
            int i5 = f10800b + 11;
            f10803e = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 28 / 0;
            }
            return incodeWelcomeE;
        }

        static {
            int i2 = f10801c + 57;
            f10799a = i2 % 128;
            int i3 = i2 % 2;
        }

        e() {
            super(0);
        }
    }

    protected final IncodeWelcome getIncodeWelcome() {
        IncodeWelcome incodeWelcome;
        int i2 = 2 % 2;
        int i3 = f10786o + 125;
        f10785g = i3 % 128;
        if (i3 % 2 != 0) {
            incodeWelcome = (IncodeWelcome) this.f10787a.getValue();
            int i4 = 70 / 0;
        } else {
            incodeWelcome = (IncodeWelcome) this.f10787a.getValue();
        }
        int i5 = f10785g + 91;
        f10786o = i5 % 128;
        int i6 = i5 % 2;
        return incodeWelcome;
    }

    public final IncodeWelcomeRepository getRepo() {
        int i2 = 2 % 2;
        int i3 = f10785g + 77;
        f10786o = i3 % 128;
        int i4 = i3 % 2;
        IncodeWelcomeRepository incodeRepository = getIncodeWelcome().getIncodeWelcomeRepositoryComponent().getIncodeRepository();
        Intrinsics.checkNotNullExpressionValue(incodeRepository, "");
        int i5 = f10786o + 73;
        f10785g = i5 % 128;
        int i6 = i5 % 2;
        return incodeRepository;
    }

    static final class a extends Lambda implements Function0<ISardineRiskSdkWrapper> {

        /* JADX INFO: renamed from: b */
        private static int f10796b = 1;

        /* JADX INFO: renamed from: c */
        private static int f10797c = 0;

        private ISardineRiskSdkWrapper d() {
            int i2 = 2 % 2;
            int i3 = f10796b + 23;
            f10797c = i3 % 128;
            int i4 = i3 % 2;
            ISardineRiskSdkWrapper sardineRiskSdkWrapper = BaseFragment.this.getIncodeWelcome().getSardineRiskSdkWrapper();
            if (i4 != 0) {
                int i5 = 74 / 0;
            }
            return sardineRiskSdkWrapper;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ ISardineRiskSdkWrapper invoke() {
            int i2 = 2 % 2;
            int i3 = f10796b + 65;
            f10797c = i3 % 128;
            if (i3 % 2 == 0) {
                return d();
            }
            d();
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        a() {
            super(0);
        }
    }

    private final ISardineRiskSdkWrapper c() {
        int i2 = 2 % 2;
        int i3 = f10786o + 97;
        f10785g = i3 % 128;
        int i4 = i3 % 2;
        ISardineRiskSdkWrapper iSardineRiskSdkWrapper = (ISardineRiskSdkWrapper) this.f10791e.getValue();
        int i5 = f10785g + 91;
        f10786o = i5 % 128;
        if (i5 % 2 != 0) {
            return iSardineRiskSdkWrapper;
        }
        throw null;
    }

    protected final Unit publishUiEvent(UiEvent uiEvent) {
        UiEventsBus uiBus;
        int i2 = 2 % 2;
        int i3 = f10785g + 51;
        f10786o = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(uiEvent, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(uiEvent, "");
        BaseActivity baseActivity = (BaseActivity) getActivity();
        if (baseActivity != null && (uiBus = baseActivity.getUiBus()) != null) {
            uiBus.c(uiEvent);
            return Unit.INSTANCE;
        }
        int i4 = f10785g + 89;
        f10786o = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public int getSoftInputMode() {
        int i2 = 2 % 2;
        int i3 = f10785g + 11;
        int i4 = i3 % 128;
        f10786o = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 45;
        f10785g = i6 % 128;
        if (i6 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated(message = "Use safeOnCreate() instead!")
    public final void onCreate(Bundle bundle) throws Exception {
        int i2 = 2 % 2;
        int i3 = f10785g + 95;
        f10786o = i3 % 128;
        int i4 = i3 % 2;
        try {
            safeOnCreate(bundle);
            int i5 = f10786o + 53;
            f10785g = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        } catch (Exception e2) {
            if (!this.f10790d) {
                super.onCreate(bundle);
            }
            this.f10788b = true;
            getIncodeWelcome().onError(e2);
            FragmentManager parentFragmentManager = getParentFragmentManager();
            CX.ud();
            parentFragmentManager.beginTransaction().remove(this).commit();
            closeScreen();
        }
    }

    public void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f10786o + 49;
        f10785g = i3 % 128;
        int i4 = i3 % 2;
        super.onCreate(bundle);
        this.f10790d = true;
        d();
        int i5 = f10786o + 83;
        f10785g = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated(message = "Use safeOnViewCreated() instead!")
    public final void onViewCreated(View view, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f10785g + 3;
        f10786o = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(view, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(view, "");
        if (this.f10788b) {
            super.onViewCreated(view, bundle);
            int i4 = f10786o + 75;
            f10785g = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        try {
            safeOnViewCreated(view, bundle);
        } catch (Exception e2) {
            if (!this.f10789c) {
                super.onViewCreated(view, bundle);
            }
            this.f10788b = true;
            getIncodeWelcome().onError(e2);
            closeScreen();
        }
    }

    public void safeOnViewCreated(View view, Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f10786o + 111;
        f10785g = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(view, "");
        } else {
            Intrinsics.checkNotNullParameter(view, "");
        }
        super.onViewCreated(view, bundle);
        this.f10789c = true;
        int i4 = f10786o + 121;
        f10785g = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        BaseActivity baseActivity;
        int i2 = 2 % 2;
        super.onResume();
        if (this.f10795j) {
            d();
        }
        this.f10795j = true;
        ScreenName screenName = getScreenName();
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
            int i3 = f10785g + 27;
            f10786o = i3 % 128;
            int i4 = i3 % 2;
        } else {
            baseActivity = null;
        }
        if (baseActivity != null) {
            baseActivity.sendScreenOpenedEvent(screenName);
        }
        c().logScreenShown(screenName.name());
        int i5 = f10786o + 35;
        f10785g = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        BaseActivity baseActivity;
        int i2 = 2 % 2;
        ScreenName screenName = getScreenName();
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
            int i3 = f10785g + 113;
            f10786o = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 / 2;
            }
        } else {
            baseActivity = null;
        }
        if (baseActivity != null) {
            int i5 = f10786o + 103;
            f10785g = i5 % 128;
            int i6 = i5 % 2;
            baseActivity.sendScreenClosedEvent(screenName);
        }
        super.onPause();
        int i7 = f10786o + 109;
        f10785g = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    @Deprecated(message = "Use safeOnDestroy() instead!")
    public final void onDestroy() {
        int i2 = 2 % 2;
        if (!this.f10788b) {
            safeOnDestroy();
            return;
        }
        int i3 = f10786o + 35;
        f10785g = i3 % 128;
        if (i3 % 2 != 0) {
            super.onDestroy();
            int i4 = 37 / 0;
        } else {
            super.onDestroy();
        }
        int i5 = f10786o + 73;
        f10785g = i5 % 128;
        int i6 = i5 % 2;
    }

    public void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f10786o + 13;
        f10785g = i3 % 128;
        int i4 = i3 % 2;
        super.onDestroy();
        int i5 = f10786o + 87;
        f10785g = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.fragment.app.Fragment, com.incode.welcome_sdk.ui.BaseView
    public Context getContext() {
        int i2 = 2 % 2;
        int i3 = f10785g + 99;
        f10786o = i3 % 128;
        int i4 = i3 % 2;
        Context context = super.getContext();
        if (context == null) {
            throw new IllegalStateException("context not available");
        }
        int i5 = f10785g + 67;
        f10786o = i5 % 128;
        int i6 = i5 % 2;
        return context;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public int getScreenWidth() {
        int i2 = 2 % 2;
        int i3 = f10785g;
        int i4 = i3 + 19;
        f10786o = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        int i5 = this.f10793h;
        int i6 = i3 + 81;
        f10786o = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public int getScreenHeight() {
        int i2 = 2 % 2;
        int i3 = f10785g;
        int i4 = i3 + 45;
        f10786o = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f10794i;
        int i7 = i3 + 25;
        f10786o = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public float getScreenDensity() {
        int i2 = 2 % 2;
        int i3 = f10785g;
        int i4 = i3 + 57;
        f10786o = i4 % 128;
        int i5 = i4 % 2;
        float f2 = this.f10792f;
        int i6 = i3 + 69;
        f10786o = i6 % 128;
        int i7 = i6 % 2;
        return f2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public void closeScreen() {
        int i2 = 2 % 2;
        int i3 = f10786o + 125;
        f10785g = i3 % 128;
        int i4 = i3 % 2;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            int i5 = f10786o + 67;
            f10785g = i5 % 128;
            if (i5 % 2 == 0) {
                activity.finish();
                return;
            } else {
                activity.finish();
                int i6 = 37 / 0;
                return;
            }
        }
        int i7 = f10786o + 69;
        f10785g = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 25 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public void showNoNetworkMessage() {
        int i2 = 2 % 2;
        int i3 = f10786o + 5;
        f10785g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            showNoNetworkMessage(null);
            int i4 = f10785g + 15;
            f10786o = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        showNoNetworkMessage(null);
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public void showNoNetworkMessage(Function0<Unit> function0) {
        int i2 = 2 % 2;
        int i3 = f10785g + 27;
        f10786o = i3 % 128;
        int i4 = i3 % 2;
        BaseActivity baseActivity = (BaseActivity) getActivity();
        if (baseActivity != null) {
            baseActivity.showNoNetworkMessage(function0);
            int i5 = f10785g + 15;
            f10786o = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 99 / 0;
            }
        }
    }

    private final void d() {
        WindowManager windowManager;
        int i2 = 2 % 2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        FragmentActivity activity = getActivity();
        if (activity != null && (windowManager = activity.getWindowManager()) != null) {
            int i3 = f10785g + 65;
            f10786o = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                windowManager.getDefaultDisplay();
                obj.hashCode();
                throw null;
            }
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (defaultDisplay != null) {
                int i4 = f10785g + 99;
                f10786o = i4 % 128;
                if (i4 % 2 == 0) {
                    defaultDisplay.getMetrics(displayMetrics);
                    obj.hashCode();
                    throw null;
                }
                defaultDisplay.getMetrics(displayMetrics);
            }
        }
        this.f10793h = displayMetrics.widthPixels;
        this.f10794i = displayMetrics.heightPixels;
        this.f10792f = displayMetrics.density;
    }

    public final void hideKeyboard() {
        int i2 = 2 % 2;
        int i3 = f10785g + 73;
        f10786o = i3 % 128;
        int i4 = i3 % 2;
        BaseActivity baseActivity = (BaseActivity) getActivity();
        if (baseActivity != null) {
            int i5 = f10786o + 73;
            f10785g = i5 % 128;
            int i6 = i5 % 2;
            baseActivity.hideKeyboard();
        }
    }

    public final void showKeyboard(View view) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        BaseActivity baseActivity = (BaseActivity) getActivity();
        if (baseActivity == null) {
            int i3 = f10785g + 41;
            f10786o = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        int i4 = f10785g + 11;
        f10786o = i4 % 128;
        if (i4 % 2 != 0) {
            baseActivity.showKeyboard(view);
        } else {
            baseActivity.showKeyboard(view);
            int i5 = 28 / 0;
        }
    }

    public boolean onBackPressed() {
        int i2 = 2 % 2;
        int i3 = f10786o + 27;
        f10785g = i3 % 128;
        return i3 % 2 != 0;
    }
}
