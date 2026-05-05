package com.incode.welcome_sdk.ui;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.ViewPumpAppCompatDelegate;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.CloseButtonPosition;
import com.incode.welcome_sdk.commons.ISardineRiskSdkWrapper;
import com.incode.welcome_sdk.commons.b;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.extensions.n;
import com.incode.welcome_sdk.commons.o;
import com.incode.welcome_sdk.commons.ui.events.UiEventsBus;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.ak;
import com.incode.welcome_sdk.commons.utils.w;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.remote.beans.s;
import com.incode.welcome_sdk.results.BaseResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.camera.video_selfie.DaggerVideoSelfieComponent;
import dev.b3nedikt.restring.Restring;
import dev.b3nedikt.reword.Reword;
import dev.b3nedikt.viewpump.WrapContext;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import timber.log.Timber;
import yg.CX;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseActivity extends AppCompatActivity implements com.incode.welcome_sdk.commons.b, com.incode.welcome_sdk.e.d, BaseView {
    private static int A = 1;
    private static int B = 0;

    /* JADX INFO: renamed from: v */
    private static int f10722v = 0;

    /* JADX INFO: renamed from: y */
    private static int f10723y = 1;

    /* JADX INFO: renamed from: a */
    public IncodeWelcome f10724a;

    /* JADX INFO: renamed from: b */
    private final Config f10725b = new Config(false, false, false, false, null, 31, null);

    /* JADX INFO: renamed from: c */
    private Function0<Unit> f10726c;

    /* JADX INFO: renamed from: d */
    private final UiEventsBus f10727d;

    /* JADX INFO: renamed from: e */
    private boolean f10728e;

    /* JADX INFO: renamed from: f */
    private boolean f10729f;

    /* JADX INFO: renamed from: g */
    private boolean f10730g;

    /* JADX INFO: renamed from: h */
    private int f10731h;

    /* JADX INFO: renamed from: i */
    private int f10732i;

    /* JADX INFO: renamed from: j */
    private float f10733j;

    /* JADX INFO: renamed from: k */
    private boolean f10734k;

    /* JADX INFO: renamed from: l */
    private boolean f10735l;

    /* JADX INFO: renamed from: m */
    private final boolean f10736m;

    /* JADX INFO: renamed from: n */
    private AppCompatDelegate f10737n;

    /* JADX INFO: renamed from: o */
    private boolean f10738o;

    /* JADX INFO: renamed from: p */
    private final Lazy f10739p;

    /* JADX INFO: renamed from: q */
    private int f10740q;

    /* JADX INFO: renamed from: r */
    private final CompositeDisposable f10741r;

    /* JADX INFO: renamed from: s */
    private final Lazy f10742s;

    /* JADX INFO: renamed from: t */
    private o f10743t;

    /* JADX INFO: renamed from: u */
    private final CompositeDisposable f10744u;

    /* JADX INFO: renamed from: w */
    private final Function0<Unit> f10745w;

    /* JADX INFO: renamed from: x */
    private final Function0<Unit> f10746x;

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, int i6, int i7, Object[] objArr) {
        ViewGroup viewGroup;
        int i8 = ~i3;
        int i9 = ~i7;
        int i10 = (~(i9 | i4)) | i8;
        int i11 = ~i4;
        int i12 = ~(i9 | i11 | i3);
        int i13 = (~(i4 | i8)) | i9 | (~(i11 | i3));
        int i14 = i3 + i7 + i2 + (325770565 * i5) + ((-1284996642) * i6);
        int i15 = i14 * i14;
        int i16 = ((789042555 * i3) - 1205338112) + ((-1364710777) * i7) + (i10 * 1076876666) + (1076876666 * i12) + ((-1076876666) * i13) + ((-287834112) * i2) + ((-667418624) * i5) + ((-145752064) * i6) + (1116340224 * i15);
        int i17 = (i3 * (-1991011123)) + 595473426 + (i7 * (-1991009311)) + (i10 * (-906)) + (i12 * (-906)) + (i13 * TypedValues.Custom.TYPE_REFERENCE) + (i2 * (-1991010217)) + (i5 * (-1223611789)) + (i6 * (-291900814)) + (i15 * (-1931083776));
        int i18 = i16 + (i17 * i17 * (-1558839296));
        if (i18 != 1) {
            if (i18 != 2) {
                return i18 != 3 ? i18 != 4 ? i18 != 5 ? c(objArr) : b(objArr) : d(objArr) : a(objArr);
            }
            BaseActivity baseActivity = (BaseActivity) objArr[0];
            int i19 = 2 % 2;
            int i20 = f10722v + 49;
            f10723y = i20 % 128;
            if (i20 % 2 == 0) {
                Intrinsics.checkNotNullParameter(baseActivity, "");
            } else {
                Intrinsics.checkNotNullParameter(baseActivity, "");
            }
            baseActivity.f10726c.invoke();
            baseActivity.d(false);
            int i21 = f10722v + 53;
            f10723y = i21 % 128;
            int i22 = i21 % 2;
            return null;
        }
        BaseActivity baseActivity2 = (BaseActivity) objArr[0];
        int i23 = 2 % 2;
        int i24 = f10723y + 49;
        f10722v = i24 % 128;
        int i25 = i24 % 2;
        View rootView = baseActivity2.getWindow().getDecorView().getRootView();
        if (rootView instanceof ViewGroup) {
            int i26 = f10723y + 73;
            f10722v = i26 % 128;
            int i27 = i26 % 2;
            viewGroup = (ViewGroup) rootView;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.content);
        int i28 = f10722v + 83;
        f10723y = i28 % 128;
        int i29 = i28 % 2;
        return viewGroup2;
    }

    /* JADX INFO: renamed from: instrumented$0$a$--Ljava-lang-Object--Ljava-lang-Object- */
    public static /* synthetic */ void m8216instrumented$0$a$LjavalangObjectLjavalangObject(BaseActivity baseActivity, View view) {
        Callback.onClick_enter(view);
        try {
            b(baseActivity, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$1$a$--V */
    public static /* synthetic */ void m8217instrumented$1$a$V(BaseActivity baseActivity, View view) {
        Callback.onClick_enter(view);
        try {
            d(baseActivity, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public BaseActivity() {
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        this.f10727d = new UiEventsBus(new com.incode.welcome_sdk.commons.f(lifecycle));
        this.f10726c = d.f10769d;
        this.f10742s = LazyKt.lazy(new b());
        this.f10739p = LazyKt.lazy(new f());
        this.f10741r = new CompositeDisposable();
        this.f10744u = new CompositeDisposable();
        this.f10745w = new e();
        this.f10746x = new c();
    }

    @Override // com.incode.welcome_sdk.commons.b
    public Function0<Unit> closeButtonHandlerOrNull() {
        int i2 = 2 % 2;
        int i3 = f10723y + 27;
        f10722v = i3 % 128;
        if (i3 % 2 == 0) {
            return b.e.a(this);
        }
        b.e.a(this);
        throw null;
    }

    public static final class Config {

        /* JADX INFO: renamed from: f */
        private static int f10747f = 1;

        /* JADX INFO: renamed from: j */
        private static int f10748j = 0;

        /* JADX INFO: renamed from: a */
        private final boolean f10749a;

        /* JADX INFO: renamed from: b */
        private final boolean f10750b;

        /* JADX INFO: renamed from: c */
        private final Function0<BaseResult> f10751c;

        /* JADX INFO: renamed from: d */
        private final boolean f10752d;

        /* JADX INFO: renamed from: e */
        private final boolean f10753e;

        /* JADX WARN: Multi-variable type inference failed */
        public Config(boolean z2, boolean z3, boolean z4, boolean z5, Function0<? extends BaseResult> function0) {
            this.f10750b = z2;
            this.f10752d = z3;
            this.f10749a = z4;
            this.f10753e = z5;
            this.f10751c = function0;
        }

        public /* synthetic */ Config(boolean z2, boolean z3, boolean z4, boolean z5, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z2, (i2 & 2) == 0 ? z3 : false, (i2 & 4) != 0 ? true : z4, (i2 & 8) == 0 ? z5 : true, (i2 & 16) != 0 ? null : function0);
        }

        public final boolean getAllowOnLockScreen() {
            int i2 = 2 % 2;
            int i3 = f10748j + 93;
            int i4 = i3 % 128;
            f10747f = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f10750b;
            int i6 = i4 + 21;
            f10748j = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final boolean getSetDefaultContentView() {
            int i2 = 2 % 2;
            int i3 = f10748j;
            int i4 = i3 + 103;
            f10747f = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            boolean z2 = this.f10752d;
            int i5 = i3 + 77;
            f10747f = i5 % 128;
            if (i5 % 2 != 0) {
                return z2;
            }
            obj.hashCode();
            throw null;
        }

        public final boolean getSendScreenEvents() {
            int i2 = 2 % 2;
            int i3 = f10748j + 81;
            f10747f = i3 % 128;
            if (i3 % 2 != 0) {
                return this.f10749a;
            }
            throw null;
        }

        public final boolean getEnableCloseButtonHandling() {
            int i2 = 2 % 2;
            int i3 = f10747f + 81;
            int i4 = i3 % 128;
            f10748j = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f10753e;
            int i6 = i4 + 13;
            f10747f = i6 % 128;
            if (i6 % 2 != 0) {
                return z2;
            }
            throw null;
        }

        public final Function0<BaseResult> getEmptyResultIfUserCancels() {
            Function0<BaseResult> function0;
            int i2 = 2 % 2;
            int i3 = f10747f;
            int i4 = i3 + 65;
            f10748j = i4 % 128;
            if (i4 % 2 != 0) {
                function0 = this.f10751c;
                int i5 = 40 / 0;
            } else {
                function0 = this.f10751c;
            }
            int i6 = i3 + 109;
            f10748j = i6 % 128;
            int i7 = i6 % 2;
            return function0;
        }

        public Config() {
            this(false, false, false, false, null, 31, null);
        }

        public final boolean equals(Object obj) {
            int i2 = 2 % 2;
            int i3 = f10748j;
            int i4 = i3 + 83;
            int i5 = i4 % 128;
            f10747f = i5;
            if (i4 % 2 == 0) {
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            if (this.f10750b != config.f10750b) {
                int i6 = i5 + 81;
                f10748j = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (this.f10752d != config.f10752d) {
                int i8 = i3 + 19;
                f10747f = i8 % 128;
                return i8 % 2 == 0;
            }
            if (this.f10749a != config.f10749a) {
                return false;
            }
            if (this.f10753e == config.f10753e) {
                return Intrinsics.areEqual(this.f10751c, config.f10751c);
            }
            int i9 = i5 + 45;
            f10748j = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }

        public final int hashCode() {
            int iHashCode;
            int i2 = 2 % 2;
            int i3 = f10747f + 69;
            f10748j = i3 % 128;
            int i4 = i3 % 2;
            int iHashCode2 = ((((((Boolean.hashCode(this.f10750b) * 31) + Boolean.hashCode(this.f10752d)) * 31) + Boolean.hashCode(this.f10749a)) * 31) + Boolean.hashCode(this.f10753e)) * 31;
            Function0<BaseResult> function0 = this.f10751c;
            if (function0 == null) {
                int i5 = f10747f + 37;
                f10748j = i5 % 128;
                int i6 = i5 % 2;
                iHashCode = 0;
            } else {
                iHashCode = function0.hashCode();
                int i7 = f10747f + 115;
                f10748j = i7 % 128;
                if (i7 % 2 != 0) {
                    int i8 = 2 % 3;
                }
            }
            return iHashCode2 + iHashCode;
        }

        public final String toString() {
            int i2 = 2 % 2;
            int i3 = f10748j + 51;
            f10747f = i3 % 128;
            int i4 = i3 % 2;
            String str = "Config(allowOnLockScreen=" + this.f10750b + ", setDefaultContentView=" + this.f10752d + ", sendScreenEvents=" + this.f10749a + ", enableCloseButtonHandling=" + this.f10753e + ", emptyResultIfUserCancels=" + this.f10751c + ")";
            int i5 = f10747f + 115;
            f10748j = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Config copy$default(Config config, boolean z2, boolean z3, boolean z4, boolean z5, Function0 function0, int i2, Object obj) {
            int i3 = 2 % 2;
            if ((i2 & 1) != 0) {
                z2 = config.f10750b;
            }
            if ((i2 & 2) != 0) {
                z3 = config.f10752d;
            }
            if ((i2 & 4) != 0) {
                z4 = config.f10749a;
            }
            if ((i2 & 8) != 0) {
                int i4 = f10748j + 89;
                f10747f = i4 % 128;
                if (i4 % 2 == 0) {
                    boolean z6 = config.f10753e;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                z5 = config.f10753e;
            }
            if ((i2 & 16) != 0) {
                int i5 = f10747f + 57;
                f10748j = i5 % 128;
                int i6 = i5 % 2;
                function0 = config.f10751c;
            }
            return config.copy(z2, z3, z4, z5, function0);
        }

        public final Config copy(boolean z2, boolean z3, boolean z4, boolean z5, Function0<? extends BaseResult> function0) {
            int i2 = 2 % 2;
            Config config = new Config(z2, z3, z4, z5, function0);
            int i3 = f10748j + 49;
            f10747f = i3 % 128;
            int i4 = i3 % 2;
            return config;
        }

        public final Function0<BaseResult> component5() {
            int i2 = 2 % 2;
            int i3 = f10747f + 125;
            int i4 = i3 % 128;
            f10748j = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            Function0<BaseResult> function0 = this.f10751c;
            int i5 = i4 + 123;
            f10747f = i5 % 128;
            if (i5 % 2 != 0) {
                return function0;
            }
            throw null;
        }

        public final boolean component4() {
            int i2 = 2 % 2;
            int i3 = f10747f + 53;
            int i4 = i3 % 128;
            f10748j = i4;
            int i5 = i3 % 2;
            boolean z2 = this.f10753e;
            int i6 = i4 + 91;
            f10747f = i6 % 128;
            if (i6 % 2 != 0) {
                return z2;
            }
            throw null;
        }

        public final boolean component3() {
            int i2 = 2 % 2;
            int i3 = f10748j + 73;
            int i4 = i3 % 128;
            f10747f = i4;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z2 = this.f10749a;
            int i5 = i4 + 63;
            f10748j = i5 % 128;
            int i6 = i5 % 2;
            return z2;
        }

        public final boolean component2() {
            int i2 = 2 % 2;
            int i3 = f10747f;
            int i4 = i3 + 71;
            f10748j = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = this.f10752d;
            int i6 = i3 + 109;
            f10748j = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final boolean component1() {
            int i2 = 2 % 2;
            int i3 = f10747f;
            int i4 = i3 + 1;
            f10748j = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = this.f10750b;
            int i6 = i3 + 41;
            f10748j = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }
    }

    public Config getConfig() {
        int i2 = 2 % 2;
        int i3 = f10723y + 85;
        f10722v = i3 % 128;
        if (i3 % 2 == 0) {
            return this.f10725b;
        }
        throw null;
    }

    public final UiEventsBus getUiBus() {
        int i2 = 2 % 2;
        int i3 = f10722v;
        int i4 = i3 + 27;
        f10723y = i4 % 128;
        int i5 = i4 % 2;
        UiEventsBus uiEventsBus = this.f10727d;
        int i6 = i3 + 43;
        f10723y = i6 % 128;
        if (i6 % 2 != 0) {
            return uiEventsBus;
        }
        throw null;
    }

    static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a */
        private static int f10766a = 0;

        /* JADX INFO: renamed from: b */
        private static int f10767b = 0;

        /* JADX INFO: renamed from: c */
        private static int f10768c = 1;

        /* JADX INFO: renamed from: d */
        public static final d f10769d = new d();

        /* JADX INFO: renamed from: e */
        private static int f10770e = 1;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f10767b + 55;
            f10770e = i3 % 128;
            int i4 = i3 % 2;
            b();
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        private static void b() {
            int i2 = 2 % 2;
            int i3 = f10770e + 15;
            f10767b = i3 % 128;
            int i4 = i3 % 2;
            Timber.Forest.d("Retry action not assigned", new Object[0]);
            int i5 = f10767b + 117;
            f10770e = i5 % 128;
            int i6 = i5 % 2;
        }

        static {
            int i2 = f10766a + 63;
            f10768c = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        d() {
            super(0);
        }
    }

    public final Function0<Unit> getNoNetworkSnackbarRetryAction() {
        int i2 = 2 % 2;
        int i3 = f10722v + 7;
        f10723y = i3 % 128;
        int i4 = i3 % 2;
        Function0<Unit> function0 = this.f10726c;
        if (i4 == 0) {
            int i5 = 28 / 0;
        }
        return function0;
    }

    public final void setNoNetworkSnackbarRetryAction(Function0<Unit> function0) {
        int i2 = 2 % 2;
        int i3 = f10722v + 117;
        f10723y = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.f10726c = function0;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function0, "");
        this.f10726c = function0;
        int i4 = f10723y + 123;
        f10722v = i4 % 128;
        int i5 = i4 % 2;
    }

    protected final boolean isChained() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f10722v;
        int i4 = i3 + 103;
        f10723y = i4 % 128;
        if (i4 % 2 == 0) {
            z2 = this.f10728e;
            int i5 = 67 / 0;
        } else {
            z2 = this.f10728e;
        }
        int i6 = i3 + 43;
        f10723y = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final void setChained(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f10722v + 97;
        int i4 = i3 % 128;
        f10723y = i4;
        int i5 = i3 % 2;
        this.f10728e = z2;
        int i6 = i4 + 3;
        f10722v = i6 % 128;
        int i7 = i6 % 2;
    }

    public boolean isForceShowBackButton() {
        int i2 = 2 % 2;
        int i3 = f10723y;
        int i4 = i3 + 95;
        f10722v = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        boolean z2 = this.f10736m;
        int i5 = i3 + 99;
        f10722v = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    protected final boolean isActivityRunning() {
        int i2 = 2 % 2;
        int i3 = f10723y + 47;
        int i4 = i3 % 128;
        f10722v = i4;
        int i5 = i3 % 2;
        boolean z2 = this.f10735l;
        int i6 = i4 + 23;
        f10723y = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final void setActivityRunning(boolean z2) {
        int i2 = 2 % 2;
        int i3 = f10722v + 99;
        f10723y = i3 % 128;
        int i4 = i3 % 2;
        this.f10735l = z2;
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IncodeWelcome getIncodeWelcome() {
        int i2 = 2 % 2;
        int i3 = f10723y + 111;
        int i4 = i3 % 128;
        f10722v = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        IncodeWelcome incodeWelcome = this.f10724a;
        if (incodeWelcome == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i4 + 125;
        f10723y = i5 % 128;
        if (i5 % 2 != 0) {
            return incodeWelcome;
        }
        obj.hashCode();
        throw null;
    }

    protected final void setIncodeWelcome(IncodeWelcome incodeWelcome) {
        int i2 = 2 % 2;
        int i3 = f10722v + 115;
        f10723y = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(incodeWelcome, "");
        this.f10724a = incodeWelcome;
        int i5 = f10722v + 35;
        f10723y = i5 % 128;
        int i6 = i5 % 2;
    }

    public final IncodeWelcomeRepository getRepo() {
        int i2 = 2 % 2;
        int i3 = f10723y + 25;
        f10722v = i3 % 128;
        if (i3 % 2 == 0) {
            IncodeWelcomeRepository incodeRepository = getIncodeWelcome().getIncodeWelcomeRepositoryComponent().getIncodeRepository();
            Intrinsics.checkNotNullExpressionValue(incodeRepository, "");
            return incodeRepository;
        }
        IncodeWelcomeRepository incodeRepository2 = getIncodeWelcome().getIncodeWelcomeRepositoryComponent().getIncodeRepository();
        Intrinsics.checkNotNullExpressionValue(incodeRepository2, "");
        int i4 = 74 / 0;
        return incodeRepository2;
    }

    static final class b extends Lambda implements Function0<ISardineRiskSdkWrapper> {

        /* JADX INFO: renamed from: d */
        private static int f10760d = 1;

        /* JADX INFO: renamed from: e */
        private static int f10761e = 0;

        private ISardineRiskSdkWrapper b() {
            int i2 = 2 % 2;
            int i3 = f10760d + 57;
            f10761e = i3 % 128;
            int i4 = i3 % 2;
            ISardineRiskSdkWrapper sardineRiskSdkWrapper = BaseActivity.this.getIncodeWelcome().getSardineRiskSdkWrapper();
            int i5 = f10760d + 7;
            f10761e = i5 % 128;
            int i6 = i5 % 2;
            return sardineRiskSdkWrapper;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ ISardineRiskSdkWrapper invoke() {
            int i2 = 2 % 2;
            int i3 = f10761e + 49;
            f10760d = i3 % 128;
            int i4 = i3 % 2;
            ISardineRiskSdkWrapper iSardineRiskSdkWrapperB = b();
            if (i4 == 0) {
                int i5 = 88 / 0;
            }
            return iSardineRiskSdkWrapperB;
        }

        b() {
            super(0);
        }
    }

    static final class f extends Lambda implements Function0<ak> {

        /* JADX INFO: renamed from: a */
        private static int f10774a = 0;

        /* JADX INFO: renamed from: b */
        private static int f10775b = 1;

        private ak d() {
            int i2 = 2 % 2;
            Object systemService = BaseActivity.this.getSystemService("accessibility");
            Intrinsics.checkNotNull(systemService, "");
            ak akVar = new ak((AccessibilityManager) systemService, BaseActivity.this);
            int i3 = f10774a + 29;
            f10775b = i3 % 128;
            int i4 = i3 % 2;
            return akVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ ak invoke() {
            int i2 = 2 % 2;
            int i3 = f10774a + 27;
            f10775b = i3 % 128;
            int i4 = i3 % 2;
            ak akVarD = d();
            int i5 = f10774a + 39;
            f10775b = i5 % 128;
            if (i5 % 2 != 0) {
                return akVarD;
            }
            throw null;
        }

        f() {
            super(0);
        }
    }

    private final ISardineRiskSdkWrapper c() {
        int i2 = 2 % 2;
        int i3 = f10722v + 81;
        f10723y = i3 % 128;
        int i4 = i3 % 2;
        ISardineRiskSdkWrapper iSardineRiskSdkWrapper = (ISardineRiskSdkWrapper) this.f10742s.getValue();
        int i5 = f10722v + 43;
        f10723y = i5 % 128;
        if (i5 % 2 != 0) {
            return iSardineRiskSdkWrapper;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final ak b() {
        int i2 = 2 % 2;
        int i3 = f10723y + 103;
        f10722v = i3 % 128;
        int i4 = i3 % 2;
        ak akVar = (ak) this.f10739p.getValue();
        int i5 = f10723y + 93;
        f10722v = i5 % 128;
        int i6 = i5 % 2;
        return akVar;
    }

    public final o getScreenRecordingInitializer() {
        int i2 = 2 % 2;
        o oVar = this.f10743t;
        if (oVar != null) {
            int i3 = f10723y + 27;
            f10722v = i3 % 128;
            int i4 = i3 % 2;
            return oVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i5 = f10722v + 81;
        f10723y = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    protected final void setScreenRecordingInitializer(o oVar) {
        int i2 = 2 % 2;
        int i3 = f10722v + 59;
        f10723y = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(oVar, "");
            this.f10743t = oVar;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(oVar, "");
        this.f10743t = oVar;
        int i4 = f10722v + 61;
        f10723y = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    protected final CompositeDisposable getDisposeOnStop() {
        int i2 = 2 % 2;
        int i3 = f10722v + 51;
        int i4 = i3 % 128;
        f10723y = i4;
        int i5 = i3 % 2;
        CompositeDisposable compositeDisposable = this.f10741r;
        int i6 = i4 + 65;
        f10722v = i6 % 128;
        int i7 = i6 % 2;
        return compositeDisposable;
    }

    protected final CompositeDisposable getDisposeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f10723y;
        int i4 = i3 + 121;
        f10722v = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CompositeDisposable compositeDisposable = this.f10744u;
        int i5 = i3 + 101;
        f10722v = i5 % 128;
        int i6 = i5 % 2;
        return compositeDisposable;
    }

    protected final boolean getShowCloseButton() {
        int i2 = 2 % 2;
        int i3 = f10722v + 27;
        f10723y = i3 % 128;
        if (i3 % 2 == 0) {
            getConfig().getEnableCloseButtonHandling();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (getConfig().getEnableCloseButtonHandling() && ((shouldShowCloseButton() && isScreenCloseable()) || isForceShowBackButton())) {
            return true;
        }
        int i4 = f10723y + 111;
        f10722v = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
        return false;
    }

    public static final Context d(Context context) {
        int i2 = 2 % 2;
        int i3 = f10723y + 105;
        f10722v = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(context, "");
            return Restring.wrapContext(context);
        }
        Intrinsics.checkNotNullParameter(context, "");
        Restring.wrapContext(context);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public AppCompatDelegate getDelegate() {
        int i2 = 2 % 2;
        if (IncodeWelcome.Companion.isInitialized()) {
            int i3 = f10722v + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f10723y = i3 % 128;
            if (i3 % 2 != 0) {
                setIncodeWelcome(IncodeWelcome.Companion.getInstance());
                if (getRepo().isDynamicLocalisationAvailable()) {
                    AppCompatDelegate delegate = super.getDelegate();
                    Intrinsics.checkNotNullExpressionValue(delegate, "");
                    AppCompatDelegate viewPumpAppCompatDelegate = new ViewPumpAppCompatDelegate(delegate, this, new WrapContext() { // from class: com.incode.welcome_sdk.ui.BaseActivity$$ExternalSyntheticLambda9
                        public final Context perform(Context context) {
                            return BaseActivity.d(context);
                        }
                    });
                    this.f10737n = viewPumpAppCompatDelegate;
                    return viewPumpAppCompatDelegate;
                }
            } else {
                setIncodeWelcome(IncodeWelcome.Companion.getInstance());
                getRepo().isDynamicLocalisationAvailable();
                throw null;
            }
        }
        AppCompatDelegate delegate2 = super.getDelegate();
        Intrinsics.checkNotNullExpressionValue(delegate2, "");
        return delegate2;
    }

    public static /* synthetic */ void setContent$default(BaseActivity baseActivity, CompositionContext compositionContext, Function2 function2, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = f10723y + 79;
        int i5 = i4 % 128;
        f10722v = i5;
        int i6 = i4 % 2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setContent");
        }
        if ((i2 & 1) != 0) {
            int i7 = i5 + 61;
            f10723y = i7 % 128;
            int i8 = i7 % 2;
            compositionContext = null;
        }
        baseActivity.setContent(compositionContext, function2);
    }

    public final void setContent(CompositionContext compositionContext, Function2<? super Composer, ? super Integer, Unit> function2) {
        int i2 = 2 % 2;
        int i3 = f10723y + 91;
        f10722v = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNull(this, "");
        ComponentActivityKt.setContent(this, compositionContext, function2);
        int i5 = f10722v + 25;
        f10723y = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @Deprecated(message = "Use safeOnCreate() instead!")
    protected final void onCreate(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f10722v + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        f10723y = i4;
        Object obj = null;
        if (i3 % 2 != 0) {
            if (this.f10724a == null) {
                IncodeWelcome.Companion.fallbackInit(this);
                super.onCreate(null);
                finish();
                return;
            }
            int i5 = i4 + 3;
            f10722v = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    safeOnCreate(bundle);
                    return;
                } else {
                    safeOnCreate(bundle);
                    int i6 = 55 / 0;
                    return;
                }
            } catch (Exception e2) {
                if (!this.f10734k) {
                    super.onCreate(null);
                }
                this.f10738o = true;
                getIncodeWelcome().onError(e2);
                closeScreen();
                return;
            }
        }
        obj.hashCode();
        throw null;
    }

    public static final void a(BaseActivity baseActivity) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(baseActivity, "");
        Fragment currentFragment = baseActivity.getCurrentFragment();
        if (currentFragment instanceof BaseFragment) {
            int i3 = f10722v + 109;
            f10723y = i3 % 128;
            int i4 = i3 % 2;
            baseActivity.e((BaseFragment) currentFragment);
            int i5 = f10722v + 15;
            f10723y = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    static final class a extends Lambda implements Function1<com.incode.welcome_sdk.commons.a, Unit> {

        /* JADX INFO: renamed from: a */
        private static int f10757a = 0;

        /* JADX INFO: renamed from: e */
        private static int f10758e = 1;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(com.incode.welcome_sdk.commons.a aVar) {
            int i2 = 2 % 2;
            int i3 = f10757a + 67;
            f10758e = i3 % 128;
            int i4 = i3 % 2;
            e(aVar);
            Unit unit = Unit.INSTANCE;
            int i5 = f10757a + 121;
            f10758e = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 26 / 0;
            }
            return unit;
        }

        private void e(com.incode.welcome_sdk.commons.a aVar) {
            int i2 = 2 % 2;
            int i3 = f10757a + 109;
            f10758e = i3 % 128;
            if (i3 % 2 != 0) {
                BaseActivity baseActivity = BaseActivity.this;
                Intrinsics.checkNotNull(aVar);
                baseActivity.handleFragmentResult(aVar);
            } else {
                BaseActivity baseActivity2 = BaseActivity.this;
                Intrinsics.checkNotNull(aVar);
                baseActivity2.handleFragmentResult(aVar);
                throw null;
            }
        }

        a() {
            super(1);
        }
    }

    public static final void a(Function1 function1, Object obj) {
        int i2 = 2 % 2;
        int i3 = f10723y + 35;
        f10722v = i3 % 128;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(function1, "");
            function1.invoke(obj);
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(function1, "");
        function1.invoke(obj);
        int i4 = f10722v + 59;
        f10723y = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.BaseActivity$safeOnCreate$3 */
    public static final class AnonymousClass3 extends OnBackPressedCallback {

        /* JADX INFO: renamed from: b */
        private static int f10782b = 0;

        /* JADX INFO: renamed from: d */
        private static int f10783d = 1;

        AnonymousClass3() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void handleOnBackPressed() {
            int i2 = 2 % 2;
            int i3 = f10783d + 49;
            f10782b = i3 % 128;
            int i4 = i3 % 2;
            BaseActivity.this.onBackButtonPressed();
            int i5 = f10782b + 37;
            f10783d = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    public void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        f();
        super.onCreate(bundle);
        this.f10734k = true;
        if (!(!getConfig().getAllowOnLockScreen())) {
            int i3 = f10722v + 115;
            f10723y = i3 % 128;
            int i4 = i3 % 2;
            com.incode.welcome_sdk.commons.extensions.d.a(this);
        }
        if (getConfig().getSetDefaultContentView()) {
            setContentView(com.incode.welcome_sdk.R.layout.onboard_sdk_activity_container);
            int i5 = f10723y + 1;
            f10722v = i5 % 128;
            int i6 = i5 % 2;
        }
        d();
        setScreenRecordingInitializer(new o(this, getIncodeWelcome()));
        this.f10728e = getIntent().getBooleanExtra("_extraChained", false);
        if (getRepo().isDynamicLocalisationAvailable()) {
            View viewFindViewById = getWindow().getDecorView().findViewById(R.id.content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            Reword.reword(viewFindViewById);
            d(getIncodeWelcome().getInternalConfig().getLocalizationLanguage());
        }
        this.f10740q = getWindow().getAttributes().softInputMode;
        getSupportFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() { // from class: com.incode.welcome_sdk.ui.BaseActivity$$ExternalSyntheticLambda10
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChanged() {
                BaseActivity.a(this.f$0);
            }
        });
        if (bundle == null) {
            onReadyToShowFragment();
        }
        CompositeDisposable compositeDisposable = this.f10744u;
        Observable<com.incode.welcome_sdk.commons.a> observableObserveOn = this.f10727d.c().observeOn(AndroidSchedulers.mainThread());
        final a aVar = new a();
        Disposable disposableSubscribe = observableObserveOn.subscribe(new Consumer() { // from class: com.incode.welcome_sdk.ui.BaseActivity$$ExternalSyntheticLambda11
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseActivity.a(aVar, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "");
        n.b(compositeDisposable, disposableSubscribe);
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.incode.welcome_sdk.ui.BaseActivity.safeOnCreate.3

            /* JADX INFO: renamed from: b */
            private static int f10782b = 0;

            /* JADX INFO: renamed from: d */
            private static int f10783d = 1;

            AnonymousClass3() {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public final void handleOnBackPressed() {
                int i22 = 2 % 2;
                int i32 = f10783d + 49;
                f10782b = i32 % 128;
                int i42 = i32 % 2;
                BaseActivity.this.onBackButtonPressed();
                int i52 = f10782b + 37;
                f10783d = i52 % 128;
                int i62 = i52 % 2;
            }
        });
    }

    public void onReadyToShowFragment() {
        int i2 = 2 % 2;
        int i3 = f10723y + 67;
        f10722v = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        int i2 = 2 % 2;
        super.onResume();
        Object obj = null;
        if (this.f10730g) {
            int i3 = f10723y + 101;
            f10722v = i3 % 128;
            if (i3 % 2 != 0) {
                d();
                throw null;
            }
            d();
        }
        this.f10730g = true;
        a();
        c(DaggerVideoSelfieComponent.b.b(), 711995945, DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b(), -711995942, new Object[]{this});
        g();
        getRepo().setCurrentModule(getModule());
        this.f10735l = true;
        if (!(!getConfig().getSendScreenEvents())) {
            int i4 = f10723y + 31;
            f10722v = i4 % 128;
            if (i4 % 2 == 0) {
                sendScreenOpenedEvent(getScreenName());
            } else {
                sendScreenOpenedEvent(getScreenName());
                obj.hashCode();
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        int i2 = 2 % 2;
        int i3 = f10722v + 1;
        f10723y = i3 % 128;
        int i4 = i3 % 2;
        this.f10735l = false;
        if (getConfig().getSendScreenEvents()) {
            int i5 = f10722v + 5;
            f10723y = i5 % 128;
            int i6 = i5 % 2;
            sendScreenClosedEvent(getScreenName());
        }
        super.onPause();
        int i7 = f10722v + 123;
        f10723y = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        int i2 = 2 % 2;
        int i3 = f10722v + 39;
        f10723y = i3 % 128;
        int i4 = i3 % 2;
        super.onStop();
        this.f10741r.clear();
        int i5 = f10723y + 121;
        f10722v = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    @Deprecated(message = "Use safeOnDestroy() instead!")
    protected final void onDestroy() {
        int i2 = 2 % 2;
        Object obj = null;
        if (!this.f10738o) {
            if (this.f10724a == null) {
                super.onDestroy();
                return;
            }
            int i3 = f10722v + 35;
            f10723y = i3 % 128;
            if (i3 % 2 != 0) {
                safeOnDestroy();
                return;
            } else {
                safeOnDestroy();
                obj.hashCode();
                throw null;
            }
        }
        int i4 = f10723y + 95;
        f10722v = i4 % 128;
        int i5 = i4 % 2;
        super.onDestroy();
        int i6 = f10723y + 33;
        f10722v = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void safeOnDestroy() {
        int i2 = 2 % 2;
        int i3 = f10723y + 69;
        f10722v = i3 % 128;
        int i4 = i3 % 2;
        super.onDestroy();
        this.f10744u.clear();
        int i5 = f10722v + 47;
        f10723y = i5 % 128;
        int i6 = i5 % 2;
    }

    protected void handleFragmentResult(com.incode.welcome_sdk.commons.a aVar) {
        int i2 = 2 % 2;
        int i3 = f10722v + 13;
        f10723y = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aVar, "");
        } else {
            Intrinsics.checkNotNullParameter(aVar, "");
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public Context getContext() {
        int i2 = 2 % 2;
        int i3 = f10723y;
        int i4 = i3 + 47;
        f10722v = i4 % 128;
        int i5 = i4 % 2;
        BaseActivity baseActivity = this;
        int i6 = i3 + 97;
        f10722v = i6 % 128;
        if (i6 % 2 == 0) {
            return baseActivity;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public int getScreenWidth() {
        int i2 = 2 % 2;
        int i3 = f10722v + 31;
        f10723y = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.f10732i;
        if (i4 == 0) {
            int i6 = 82 / 0;
        }
        return i5;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public int getScreenHeight() {
        int i2 = 2 % 2;
        int i3 = f10722v + 31;
        int i4 = i3 % 128;
        f10723y = i4;
        int i5 = i3 % 2;
        int i6 = this.f10731h;
        int i7 = i4 + 13;
        f10722v = i7 % 128;
        if (i7 % 2 == 0) {
            return i6;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public float getScreenDensity() {
        int i2 = 2 % 2;
        int i3 = f10722v + 55;
        int i4 = i3 % 128;
        f10723y = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        float f2 = this.f10733j;
        int i5 = i4 + 93;
        f10722v = i5 % 128;
        int i6 = i5 % 2;
        return f2;
    }

    private final void d() {
        int i2 = 2 % 2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f10732i = displayMetrics.widthPixels;
        this.f10731h = displayMetrics.heightPixels;
        this.f10733j = displayMetrics.density;
        getIncodeWelcome().setScreenDimensions(new s.f(this.f10732i, this.f10731h));
        int i3 = f10722v + 41;
        f10723y = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void d(String str) {
        int i2 = 2 % 2;
        if (TextUtils.isEmpty(str)) {
            Restring restring = Restring.INSTANCE;
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            w.c(restring, locale);
            return;
        }
        int i3 = f10723y + 97;
        f10722v = i3 % 128;
        if (i3 % 2 == 0) {
            w.c(Restring.INSTANCE, w.c(str));
            int i4 = f10722v + 61;
            f10723y = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 6 / 0;
                return;
            }
            return;
        }
        w.c(Restring.INSTANCE, w.c(str));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void startActivityChained(Intent intent) throws Exception {
        int i2 = 2 % 2;
        int i3 = f10723y + 111;
        f10722v = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        intent.putExtra("_extraChained", true);
        CX.ud();
        startActivity(intent);
        int i5 = f10723y + 3;
        f10722v = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected boolean isScreenCloseable() {
        int i2 = 2 % 2;
        int i3 = f10722v + 47;
        int i4 = i3 % 128;
        f10723y = i4;
        boolean z2 = !(i3 % 2 == 0);
        int i5 = i4 + 109;
        f10722v = i5 % 128;
        if (i5 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected boolean isDelayedOnboardingSupported() {
        int i2 = 2 % 2;
        int i3 = f10722v;
        int i4 = i3 + 121;
        f10723y = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 105;
        f10723y = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public static final WindowInsetsCompat d(View view, View view2, WindowInsetsCompat windowInsetsCompat) {
        int i2 = 2 % 2;
        int i3 = f10722v + 85;
        f10723y = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view2, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        ViewCompat.dispatchApplyWindowInsets(view, windowInsetsCompat);
        int i5 = f10723y + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f10722v = i5 % 128;
        int i6 = i5 % 2;
        return windowInsetsCompat;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = f10722v + 39;
        f10723y = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(baseActivity, "");
            baseActivity.i();
            return null;
        }
        Intrinsics.checkNotNullParameter(baseActivity, "");
        baseActivity.i();
        throw null;
    }

    private final void a() {
        int i2;
        int i3 = 2 % 2;
        FrameLayout.LayoutParams layoutParams = null;
        if (this.f10729f) {
            int i4 = f10722v + 13;
            f10723y = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.f10729f = true;
        View viewFindViewById = findViewById(com.incode.welcome_sdk.R.id.btnClose);
        if (!getShowCloseButton()) {
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
                return;
            }
            return;
        }
        if (viewFindViewById == null) {
            int iB = DaggerVideoSelfieComponent.b.b();
            ViewGroup viewGroup = (ViewGroup) c(DaggerVideoSelfieComponent.b.b(), 1354803376, iB, DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b(), -1354803375, new Object[]{this});
            if (viewGroup == null) {
                int i5 = f10723y + 75;
                f10722v = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            final View viewInflate = LayoutInflater.from(this).inflate(com.incode.welcome_sdk.R.layout.onboard_sdk_layout_close_button, viewGroup, false);
            Intrinsics.checkNotNull(viewInflate, "");
            viewFindViewById = ((ViewGroup) viewInflate).getChildAt(0);
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) layoutParams2;
            } else {
                int i7 = f10723y + 3;
                f10722v = i7 % 128;
                int i8 = i7 % 2;
            }
            if (layoutParams != null) {
                int i9 = f10723y + 83;
                f10722v = i9 % 128;
                int i10 = i9 % 2;
                int i11 = WhenMappings.f10756e[getIncodeWelcome().getInternalConfig().getUxConfig().getCloseButtonPosition().ordinal()];
                if (i11 == 1) {
                    i2 = 51;
                } else {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 53;
                }
                layoutParams.gravity = i2;
                viewFindViewById.setLayoutParams(layoutParams);
            }
            viewGroup.addView(viewInflate);
            ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new OnApplyWindowInsetsListener() { // from class: com.incode.welcome_sdk.ui.BaseActivity$$ExternalSyntheticLambda12
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return BaseActivity.d(viewInflate, view, windowInsetsCompat);
                }
            });
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.BaseActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseActivity.m8217instrumented$1$a$V(this.f$0, view);
            }
        });
        int i12 = f10723y + 123;
        f10722v = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 1 / 0;
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public void showNoNetworkMessage() {
        int i2 = 2 % 2;
        int i3 = f10723y + 61;
        f10722v = i3 % 128;
        int i4 = i3 % 2;
        showNoNetworkMessage(this.f10726c);
        if (i4 != 0) {
            int i5 = 45 / 0;
        }
    }

    static final class g extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a */
        public static final g f10777a = new g();

        /* JADX INFO: renamed from: b */
        private static int f10778b = 1;

        /* JADX INFO: renamed from: c */
        private static int f10779c = 1;

        /* JADX INFO: renamed from: d */
        private static int f10780d = 0;

        /* JADX INFO: renamed from: e */
        private static int f10781e = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            Unit unit;
            int i2 = 2 % 2;
            int i3 = f10779c + 23;
            f10781e = i3 % 128;
            int i4 = i3 % 2;
            e();
            if (i4 != 0) {
                unit = Unit.INSTANCE;
                int i5 = 63 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i6 = f10779c + 55;
            f10781e = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        private static void e() {
            int i2 = 2 % 2;
            int i3 = f10781e + 47;
            f10779c = i3 % 128;
            if (i3 % 2 == 0) {
                Timber.Forest.d("Retry action not assigned", new Object[1]);
            } else {
                Timber.Forest.d("Retry action not assigned", new Object[0]);
            }
            int i4 = f10781e + 33;
            f10779c = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        static {
            int i2 = f10780d + 85;
            f10778b = i2 % 128;
            int i3 = i2 % 2;
        }

        g() {
            super(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0014  */
    @Override // com.incode.welcome_sdk.ui.BaseView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void showNoNetworkMessage(kotlin.jvm.functions.Function0<kotlin.Unit> r4) {
        /*
            r3 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.BaseActivity.f10722v
            int r1 = r0 + 67
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.BaseActivity.f10723y = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L28
            r0 = 62
            int r0 = r0 / 0
            if (r4 != 0) goto L18
        L14:
            com.incode.welcome_sdk.ui.BaseActivity$g r4 = com.incode.welcome_sdk.ui.BaseActivity.g.f10777a
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
        L18:
            r3.f10726c = r4
            r0 = 1
            r3.d(r0)
            int r0 = com.incode.welcome_sdk.ui.BaseActivity.f10723y
            int r1 = r0 + 93
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.BaseActivity.f10722v = r0
            int r1 = r1 % r2
            return
        L28:
            if (r4 != 0) goto L18
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.BaseActivity.showNoNetworkMessage(kotlin.jvm.functions.Function0):void");
    }

    public static final void b(BaseActivity baseActivity, boolean z2) {
        int i2 = 2 % 2;
        int i3 = f10722v + 33;
        f10723y = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(baseActivity, "");
        View viewFindViewById = baseActivity.findViewById(com.incode.welcome_sdk.R.id.bottomBarWrapper);
        if (viewFindViewById != null) {
            ViewExtensionsKt.visible$default(viewFindViewById, z2, 0, 2, null);
            return;
        }
        int i5 = f10722v + 37;
        f10723y = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private final void d(final boolean z2) {
        int i2 = 2 % 2;
        int i3 = f10722v + 25;
        f10723y = i3 % 128;
        if (i3 % 2 == 0) {
            runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.BaseActivity$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    BaseActivity.b(this.f$0, z2);
                }
            });
            int i4 = 32 / 0;
        } else {
            runOnUiThread(new Runnable() { // from class: com.incode.welcome_sdk.ui.BaseActivity$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    BaseActivity.b(this.f$0, z2);
                }
            });
        }
        int i5 = f10722v + 33;
        f10723y = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void hideKeyboard() {
        int i2 = 2 % 2;
        int i3 = f10723y + 29;
        f10722v = i3 % 128;
        int i4 = i3 % 2;
        Object systemService = getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
        int i5 = f10722v + 51;
        f10723y = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final WindowInsetsCompat a(View view, View view2, WindowInsetsCompat windowInsetsCompat) {
        int i2 = 2 % 2;
        int i3 = f10722v + 49;
        f10723y = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view2, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        ViewCompat.dispatchApplyWindowInsets(view, windowInsetsCompat);
        int i5 = f10723y + 33;
        f10722v = i5 % 128;
        int i6 = i5 % 2;
        return windowInsetsCompat;
    }

    private final void g() {
        boolean z2;
        int i2 = 2 % 2;
        if (getIncodeWelcome().isDelayedMode() && isDelayedOnboardingSupported()) {
            int i3 = f10722v;
            int i4 = i3 + 107;
            f10723y = i4 % 128;
            z2 = i4 % 2 != 0;
            int i5 = i3 + 125;
            f10723y = i5 % 128;
            int i6 = i5 % 2;
        } else {
            z2 = false;
        }
        View viewFindViewById = findViewById(com.incode.welcome_sdk.R.id.noConnectionIndicator);
        if (!z2) {
            if (viewFindViewById != null) {
                int i7 = f10722v + 47;
                f10723y = i7 % 128;
                int i8 = i7 % 2;
                viewFindViewById.setVisibility(8);
            }
            int i9 = f10723y + 115;
            f10722v = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        if (viewFindViewById == null) {
            ViewGroup viewGroup = (ViewGroup) c(DaggerVideoSelfieComponent.b.b(), 1354803376, DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b(), -1354803375, new Object[]{this});
            if (viewGroup == null) {
                return;
            }
            final View viewInflate = LayoutInflater.from(this).inflate(com.incode.welcome_sdk.R.layout.onboard_sdk_no_connection_indicator, viewGroup, false);
            viewGroup.addView(viewInflate);
            ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new OnApplyWindowInsetsListener() { // from class: com.incode.welcome_sdk.ui.BaseActivity$$ExternalSyntheticLambda3
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return BaseActivity.a(viewInflate, view, windowInsetsCompat);
                }
            });
        }
    }

    public final void showKeyboard(View view) {
        int i2 = 2 % 2;
        int i3 = f10722v + 69;
        f10723y = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Object systemService = getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "");
        ((InputMethodManager) systemService).showSoftInput(view, 0);
        int i5 = f10722v + 29;
        f10723y = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final WindowInsetsCompat e(View view, View view2, WindowInsetsCompat windowInsetsCompat) {
        int i2 = 2 % 2;
        int i3 = f10723y + 121;
        f10722v = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(view2, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        ViewCompat.dispatchApplyWindowInsets(view, windowInsetsCompat);
        int i5 = f10723y + 29;
        f10722v = i5 % 128;
        if (i5 % 2 == 0) {
            return windowInsetsCompat;
        }
        throw null;
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        final BaseActivity baseActivity = (BaseActivity) objArr[0];
        int i2 = 2 % 2;
        Object obj = null;
        if (baseActivity.findViewById(com.incode.welcome_sdk.R.id.bottomBarWrapper) == null) {
            int iB = DaggerVideoSelfieComponent.b.b();
            ViewGroup viewGroup = (ViewGroup) c(DaggerVideoSelfieComponent.b.b(), 1354803376, iB, DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b(), -1354803375, new Object[]{baseActivity});
            if (viewGroup != null) {
                final View viewInflate = LayoutInflater.from(baseActivity).inflate(com.incode.welcome_sdk.R.layout.onboard_sdk_layout_bottom_bar, viewGroup, false);
                ((Button) viewInflate.findViewById(com.incode.welcome_sdk.R.id.bottomBarActionButton)).setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.BaseActivity$$ExternalSyntheticLambda4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BaseActivity.m8216instrumented$0$a$LjavalangObjectLjavalangObject(this.f$0, view);
                    }
                });
                viewGroup.addView(viewInflate);
                ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new OnApplyWindowInsetsListener() { // from class: com.incode.welcome_sdk.ui.BaseActivity$$ExternalSyntheticLambda5
                    @Override // androidx.core.view.OnApplyWindowInsetsListener
                    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                        return BaseActivity.e(viewInflate, view, windowInsetsCompat);
                    }
                });
                int i3 = f10723y + 17;
                f10722v = i3 % 128;
                int i4 = i3 % 2;
            } else {
                int i5 = f10723y + 35;
                f10722v = i5 % 128;
                if (i5 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
        }
        return null;
    }

    public final void sendScreenOpenedEvent(ScreenName screenName) {
        int i2 = 2 % 2;
        int i3 = f10723y + 105;
        f10722v = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(screenName, "");
        getRepo().setCurrentScreenName(screenName);
        EventUtils.sendScreenOpened(getRepo(), screenName, getModule());
        c().logScreenShown(getScreenName().name());
        int i5 = f10723y + 55;
        f10722v = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void sendScreenClosedEvent(ScreenName screenName) {
        int i2 = 2 % 2;
        int i3 = f10722v + 75;
        f10723y = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(screenName, "");
        EventUtils.sendScreenClosed(getRepo(), screenName, getModule());
        int i5 = f10723y + 111;
        f10722v = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
    }

    private final void i() {
        int i2 = 2 % 2;
        int i3 = f10722v + 65;
        f10723y = i3 % 128;
        if (i3 % 2 != 0) {
            EventUtils.sendEvent(getRepo(), Event.CLOSE_BUTTON_PRESSED, getModule());
            onBackButtonPressed();
            int i4 = f10723y + 101;
            f10722v = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        EventUtils.sendEvent(getRepo(), Event.CLOSE_BUTTON_PRESSED, getModule());
        onBackButtonPressed();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void b(BaseActivity baseActivity, DialogInterface dialogInterface, int i2) {
        BaseResult baseResultInvoke;
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(baseActivity, "");
        Function0<BaseResult> emptyResultIfUserCancels = baseActivity.getConfig().getEmptyResultIfUserCancels();
        if (emptyResultIfUserCancels == null || (baseResultInvoke = emptyResultIfUserCancels.invoke()) == null) {
            baseActivity.publishUserCancelled();
            int i4 = f10723y + 81;
            f10722v = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 % 3;
            }
        } else {
            int i6 = f10723y + 27;
            f10722v = i6 % 128;
            int i7 = i6 % 2;
            baseResultInvoke.resultCode = ResultCode.USER_CANCELLED;
            e(baseResultInvoke);
        }
        baseActivity.finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x001a A[PHI: r2
  0x001a: PHI (r2v1 androidx.fragment.app.Fragment) = (r2v0 androidx.fragment.app.Fragment), (r2v3 androidx.fragment.app.Fragment) binds: [B:27:0x0029, B:22:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBackButtonPressed() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.BaseActivity.f10723y
            int r1 = r0 + 61
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.BaseActivity.f10722v = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L23
            androidx.fragment.app.Fragment r2 = r4.getCurrentFragment()
            boolean r1 = r2 instanceof com.incode.welcome_sdk.ui.BaseFragment
            r0 = 73
            int r0 = r0 / 0
            if (r1 == 0) goto L2c
        L1a:
            com.incode.welcome_sdk.ui.BaseFragment r2 = (com.incode.welcome_sdk.ui.BaseFragment) r2
            boolean r0 = r2.onBackPressed()
            if (r0 == 0) goto L2c
            return
        L23:
            androidx.fragment.app.Fragment r2 = r4.getCurrentFragment()
            boolean r0 = r2 instanceof com.incode.welcome_sdk.ui.BaseFragment
            if (r0 == 0) goto L2c
            goto L1a
        L2c:
            boolean r0 = r4.goToPreviousFragmentInStack()
            if (r0 != 0) goto L3a
            com.incode.welcome_sdk.ui.BaseActivity$$ExternalSyntheticLambda0 r0 = new com.incode.welcome_sdk.ui.BaseActivity$$ExternalSyntheticLambda0
            r0.<init>()
            r4.handleExit(r0)
        L3a:
            int r0 = com.incode.welcome_sdk.ui.BaseActivity.f10723y
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.BaseActivity.f10722v = r0
            int r1 = r1 % r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.BaseActivity.onBackButtonPressed():void");
    }

    protected final boolean goToPreviousFragmentInStack() {
        int i2 = 2 % 2;
        int i3 = f10723y + 123;
        f10722v = i3 % 128;
        if (i3 % 2 != 0) {
            if (getSupportFragmentManager().getBackStackEntryCount() <= 0) {
                return false;
            }
        } else if (getSupportFragmentManager().getBackStackEntryCount() <= 1) {
            return false;
        }
        getSupportFragmentManager().isStateSaved();
        return getSupportFragmentManager().popBackStackImmediate();
    }

    public void publishUserCancelled() {
        int i2 = 2 % 2;
        int i3 = f10723y + 3;
        f10722v = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public void closeScreen() {
        int i2 = 2 % 2;
        int i3 = f10722v + 47;
        f10723y = i3 % 128;
        int i4 = i3 % 2;
        finish();
        if (i4 == 0) {
            int i5 = 46 / 0;
        }
        int i6 = f10723y + 55;
        f10722v = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void handleExit(DialogInterface.OnClickListener onClickListener) {
        int i2 = 2 % 2;
        int i3 = f10723y + 47;
        f10722v = i3 % 128;
        if (i3 % 2 == 0) {
            handleExit(onClickListener, null);
        } else {
            handleExit(onClickListener, null);
            throw null;
        }
    }

    public final void handleExit(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        int i2 = 2 % 2;
        int i3 = f10723y + 29;
        f10722v = i3 % 128;
        int i4 = i3 % 2;
        if (!getIncodeWelcome().getInternalConfig().isShowExitConfirmation()) {
            a(onClickListener, (DialogInterface) null, 0);
            return;
        }
        int i5 = f10722v + 107;
        f10723y = i5 % 128;
        if (i5 % 2 == 0) {
            b(onClickListener, onClickListener2);
            int i6 = 87 / 0;
        } else {
            b(onClickListener, onClickListener2);
        }
        int i7 = f10723y + 107;
        f10722v = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    protected final boolean isAccessibilityTalkBackActive() {
        int i2 = 2 % 2;
        int i3 = f10722v + 9;
        f10723y = i3 % 128;
        int i4 = i3 % 2;
        boolean zD = b().d();
        int i5 = f10722v + 45;
        f10723y = i5 % 128;
        int i6 = i5 % 2;
        return zD;
    }

    protected final void talkBackAccessibilityText(int i2) {
        int i3 = 2 % 2;
        int i4 = f10722v + 109;
        f10723y = i4 % 128;
        if (i4 % 2 == 0) {
            b().a(i2);
            int i5 = 70 / 0;
        } else {
            b().a(i2);
        }
    }

    protected final void talkBackAccessibilityText(String str) {
        int i2 = 2 % 2;
        int i3 = f10722v + 7;
        f10723y = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            b().e(str);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            b().e(str);
            throw null;
        }
    }

    public static final void a(BaseActivity baseActivity, DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        int i4 = f10723y + 67;
        f10722v = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(baseActivity, "");
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            baseActivity.c(onClickListener, dialogInterface, i2, "yes");
        } else {
            Intrinsics.checkNotNullParameter(baseActivity, "");
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            baseActivity.c(onClickListener, dialogInterface, i2, "yes");
            int i5 = 62 / 0;
        }
    }

    public static final void c(BaseActivity baseActivity, DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        int i4 = f10723y + 5;
        f10722v = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.checkNotNullParameter(baseActivity, "");
            Intrinsics.checkNotNullParameter(dialogInterface, "");
            baseActivity.c(onClickListener, dialogInterface, i2, "no");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(baseActivity, "");
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        baseActivity.c(onClickListener, dialogInterface, i2, "no");
        int i5 = f10722v + 115;
        f10723y = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) objArr[1];
        DialogInterface dialogInterface = (DialogInterface) objArr[2];
        int i2 = 2 % 2;
        int i3 = f10723y + 83;
        f10722v = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(baseActivity, "");
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        baseActivity.c(onClickListener, dialogInterface, -2, "no");
        int i5 = f10723y + 59;
        f10722v = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 93 / 0;
        }
        return null;
    }

    private final void b(final DialogInterface.OnClickListener onClickListener, final DialogInterface.OnClickListener onClickListener2) {
        int i2 = 2 % 2;
        EventUtils.sendExitPromptEvent(getRepo(), getScreenName().name(), getModule());
        new AlertDialog.Builder(this, com.incode.welcome_sdk.R.style.onboard_sdk_ExitDialog).setTitle(com.incode.welcome_sdk.R.string.onboard_sdk_exit_dialog_title).setMessage(com.incode.welcome_sdk.R.string.onboard_sdk_exit_dialog_message).setPositiveButton(com.incode.welcome_sdk.R.string.onboard_sdk_exit_dialog_positive_button, new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.BaseActivity$$ExternalSyntheticLambda6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                BaseActivity.a(this.f$0, onClickListener, dialogInterface, i3);
            }
        }).setNegativeButton(com.incode.welcome_sdk.R.string.onboard_sdk_exit_dialog_negative_button, new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.BaseActivity$$ExternalSyntheticLambda7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                BaseActivity.c(this.f$0, onClickListener2, dialogInterface, i3);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.incode.welcome_sdk.ui.BaseActivity$$ExternalSyntheticLambda8
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                BaseActivity.a(this.f$0, onClickListener2, dialogInterface);
            }
        }).show();
        int i3 = f10723y + 91;
        f10722v = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void c(DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i2, String str) {
        int i3 = 2 % 2;
        int i4 = f10723y + 79;
        f10722v = i4 % 128;
        int i5 = i4 % 2;
        EventUtils.sendExitConfirmedEvent(getRepo(), getScreenName().name(), getModule(), str);
        if (onClickListener == null) {
            dialogInterface.dismiss();
            int i6 = f10723y + 95;
            f10722v = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i7 = f10722v + 107;
        f10723y = i7 % 128;
        int i8 = i7 % 2;
        a(onClickListener, dialogInterface, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0012, code lost:
    
        if (r5 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0014, code lost:
    
        r5.onClick(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0017, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0018, code lost:
    
        if (r5 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x001b, code lost:
    
        r2 = getConfig().getEmptyResultIfUserCancels();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0023, code lost:
    
        if (r2 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0025, code lost:
    
        r1 = com.incode.welcome_sdk.ui.BaseActivity.f10723y + 75;
        com.incode.welcome_sdk.ui.BaseActivity.f10722v = r1 % 128;
        r1 = r1 % 2;
        r2 = r2.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0034, code lost:
    
        if (r2 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0036, code lost:
    
        r1 = com.incode.welcome_sdk.ui.BaseActivity.f10722v + 13;
        com.incode.welcome_sdk.ui.BaseActivity.f10723y = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003f, code lost:
    
        if ((r1 % 2) == 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0041, code lost:
    
        r2.resultCode = com.incode.welcome_sdk.results.ResultCode.USER_CANCELLED;
        e(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0048, code lost:
    
        finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004c, code lost:
    
        publishUserCancelled();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0050, code lost:
    
        r2.resultCode = com.incode.welcome_sdk.results.ResultCode.USER_CANCELLED;
        e(r2);
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005b, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(android.content.DialogInterface.OnClickListener r5, android.content.DialogInterface r6, int r7) {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.BaseActivity.f10722v
            int r1 = r0 + 75
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.BaseActivity.f10723y = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L18
            r0 = 21
            int r0 = r0 / 0
            if (r5 == 0) goto L1b
        L14:
            r5.onClick(r6, r7)
            return
        L18:
            if (r5 == 0) goto L1b
            goto L14
        L1b:
            com.incode.welcome_sdk.ui.BaseActivity$Config r0 = r4.getConfig()
            kotlin.jvm.functions.Function0 r2 = r0.getEmptyResultIfUserCancels()
            if (r2 == 0) goto L4c
            int r0 = com.incode.welcome_sdk.ui.BaseActivity.f10723y
            int r1 = r0 + 75
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.BaseActivity.f10722v = r0
            int r1 = r1 % r3
            java.lang.Object r2 = r2.invoke()
            com.incode.welcome_sdk.results.BaseResult r2 = (com.incode.welcome_sdk.results.BaseResult) r2
            if (r2 == 0) goto L4c
            int r0 = com.incode.welcome_sdk.ui.BaseActivity.f10722v
            int r1 = r0 + 13
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.BaseActivity.f10723y = r0
            int r1 = r1 % r3
            if (r1 == 0) goto L50
            com.incode.welcome_sdk.results.ResultCode r0 = com.incode.welcome_sdk.results.ResultCode.USER_CANCELLED
            r2.resultCode = r0
            e(r2)
        L48:
            r4.finish()
            return
        L4c:
            r4.publishUserCancelled()
            goto L48
        L50:
            com.incode.welcome_sdk.results.ResultCode r0 = com.incode.welcome_sdk.results.ResultCode.USER_CANCELLED
            r2.resultCode = r0
            e(r2)
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.BaseActivity.a(android.content.DialogInterface$OnClickListener, android.content.DialogInterface, int):void");
    }

    private final void f() {
        int i2 = 2 % 2;
        int i3 = f10723y + 123;
        f10722v = i3 % 128;
        if (i3 % 2 != 0) {
            int iB = DaggerVideoSelfieComponent.b.b();
            ((Boolean) c(DaggerVideoSelfieComponent.b.b(), -1297953274, iB, DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b(), 1297953279, new Object[]{this})).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iB2 = DaggerVideoSelfieComponent.b.b();
        if (((Boolean) c(DaggerVideoSelfieComponent.b.b(), -1297953274, iB2, DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b(), 1297953279, new Object[]{this})).booleanValue()) {
            setTheme(getIncodeWelcome().getInternalConfig().getThemeConfiguration().getCustomTheme());
            int i4 = f10722v + 27;
            f10723y = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        BaseActivity baseActivity = (BaseActivity) objArr[0];
        int i2 = 2 % 2;
        int i3 = f10723y + 97;
        f10722v = i3 % 128;
        int i4 = i3 % 2;
        if (baseActivity.getIncodeWelcome().getInternalConfig().getThemeConfiguration().getCustomTheme() >= 0) {
            int i5 = f10723y + 79;
            f10722v = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = f10723y + 75;
        f10722v = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 3 / 0;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0012, code lost:
    
        if (r7 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0015, code lost:
    
        if ((r6 & 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0017, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0018, code lost:
    
        r3.showFragment(r4, r5);
        r1 = com.incode.welcome_sdk.ui.BaseActivity.f10723y + 59;
        com.incode.welcome_sdk.ui.BaseActivity.f10722v = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0024, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0025, code lost:
    
        if (r7 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002f, code lost:
    
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showFragment");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void showFragment$default(com.incode.welcome_sdk.ui.BaseActivity r3, com.incode.welcome_sdk.ui.BaseFragment r4, boolean r5, int r6, java.lang.Object r7) throws java.lang.Exception {
        /*
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.ui.BaseActivity.f10723y
            int r1 = r0 + 17
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.BaseActivity.f10722v = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L25
            r0 = 86
            int r0 = r0 / 0
            if (r7 != 0) goto L28
        L14:
            r6 = r6 & r2
            if (r6 == 0) goto L18
            r5 = 1
        L18:
            r3.showFragment(r4, r5)
            int r0 = com.incode.welcome_sdk.ui.BaseActivity.f10723y
            int r1 = r0 + 59
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.BaseActivity.f10722v = r0
            int r1 = r1 % r2
            return
        L25:
            if (r7 != 0) goto L28
            goto L14
        L28:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Super calls with default arguments not supported in this target, function: showFragment"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.BaseActivity.showFragment$default(com.incode.welcome_sdk.ui.BaseActivity, com.incode.welcome_sdk.ui.BaseFragment, boolean, int, java.lang.Object):void");
    }

    protected final void showFragment(BaseFragment baseFragment, boolean z2) throws Exception {
        int i2 = 2 % 2;
        int i3 = f10723y + 1;
        f10722v = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(baseFragment, "");
            showFragment(baseFragment, com.incode.welcome_sdk.R.anim.onboard_sdk_slide_in_right, com.incode.welcome_sdk.R.anim.onboard_sdk_slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right, z2);
            throw null;
        }
        Intrinsics.checkNotNullParameter(baseFragment, "");
        showFragment(baseFragment, com.incode.welcome_sdk.R.anim.onboard_sdk_slide_in_right, com.incode.welcome_sdk.R.anim.onboard_sdk_slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right, z2);
        int i4 = f10722v + 81;
        f10723y = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x001e, code lost:
    
        if (r2.getFragments().isEmpty() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0020, code lost:
    
        r1 = com.incode.welcome_sdk.ui.BaseActivity.f10723y + 57;
        com.incode.welcome_sdk.ui.BaseActivity.f10722v = r1 % 128;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002a, code lost:
    
        if ((r1 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (r2.getFragments().isEmpty() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        return r2.getFragments().get(r2.getFragments().size() - 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.fragment.app.Fragment getCurrentFragment() {
        /*
            r4 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.incode.welcome_sdk.ui.BaseActivity.f10722v
            int r1 = r0 + 41
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.BaseActivity.f10723y = r0
            int r1 = r1 % r3
            if (r1 != 0) goto L2d
            androidx.fragment.app.FragmentManager r2 = r4.getSupportFragmentManager()
            java.util.List r0 = r2.getFragments()
            boolean r1 = r0.isEmpty()
            r0 = 84
            int r0 = r0 / 0
            if (r1 == 0) goto L40
        L20:
            int r0 = com.incode.welcome_sdk.ui.BaseActivity.f10723y
            int r1 = r0 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.BaseActivity.f10722v = r0
            int r1 = r1 % r3
            r0 = 0
            if (r1 != 0) goto L3c
            return r0
        L2d:
            androidx.fragment.app.FragmentManager r2 = r4.getSupportFragmentManager()
            java.util.List r0 = r2.getFragments()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L40
            goto L20
        L3c:
            r0.hashCode()
            throw r0
        L40:
            java.util.List r1 = r2.getFragments()
            java.util.List r0 = r2.getFragments()
            int r0 = r0.size()
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.get(r0)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.BaseActivity.getCurrentFragment():androidx.fragment.app.Fragment");
    }

    public static /* synthetic */ void showFragment$default(BaseActivity baseActivity, BaseFragment baseFragment, int i2, int i3, int i4, int i5, boolean z2, int i6, Object obj) throws Exception {
        int i7 = 2 % 2;
        int i8 = f10722v + 17;
        int i9 = i8 % 128;
        f10723y = i9;
        if (i8 % 2 == 0) {
            throw null;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showFragment");
        }
        if ((i6 & 32) != 0) {
            int i10 = i9 + 25;
            f10722v = i10 % 128;
            int i11 = i10 % 2;
            z2 = true;
        }
        baseActivity.showFragment(baseFragment, i2, i3, i4, i5, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[PHI: r2
  0x0036: PHI (r2v2 androidx.fragment.app.FragmentTransaction) = (r2v0 androidx.fragment.app.FragmentTransaction), (r2v3 androidx.fragment.app.FragmentTransaction) binds: [B:22:0x0070, B:17:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void showFragment(com.incode.welcome_sdk.ui.BaseFragment r6, int r7, int r8, int r9, int r10, boolean r11) throws java.lang.Exception {
        /*
            r5 = this;
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.BaseActivity.f10723y
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.BaseActivity.f10722v = r0
            int r1 = r1 % r4
            java.lang.String r3 = ""
            if (r1 == 0) goto L50
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            androidx.fragment.app.FragmentManager r0 = r5.getSupportFragmentManager()
            yg.CX.ud()
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            androidx.fragment.app.FragmentTransaction r1 = r0.setCustomAnimations(r7, r8, r9, r10)
            int r0 = com.incode.welcome_sdk.R.id.fragmentContainer
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            yg.CX.ud()
            androidx.fragment.app.FragmentTransaction r2 = r1.replace(r0, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r0 = 37
            int r0 = r0 / 0
            if (r11 == 0) goto L4c
        L36:
            int r0 = com.incode.welcome_sdk.ui.BaseActivity.f10722v
            int r1 = r0 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.BaseActivity.f10723y = r0
            int r1 = r1 % r4
            r0 = 0
            r2.addToBackStack(r0)
            int r0 = com.incode.welcome_sdk.ui.BaseActivity.f10722v
            int r1 = r0 + 41
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.BaseActivity.f10723y = r0
            int r1 = r1 % r4
        L4c:
            r2.commit()
            return
        L50:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            androidx.fragment.app.FragmentManager r0 = r5.getSupportFragmentManager()
            yg.CX.ud()
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            androidx.fragment.app.FragmentTransaction r1 = r0.setCustomAnimations(r7, r8, r9, r10)
            int r0 = com.incode.welcome_sdk.R.id.fragmentContainer
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            yg.CX.ud()
            androidx.fragment.app.FragmentTransaction r2 = r1.replace(r0, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            if (r11 == 0) goto L4c
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.BaseActivity.showFragment(com.incode.welcome_sdk.ui.BaseFragment, int, int, int, int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0012, code lost:
    
        if (r8 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0016, code lost:
    
        if ((r7 & 1) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0018, code lost:
    
        r1 = r1 + 23;
        com.incode.welcome_sdk.ui.BaseActivity.f10723y = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x001f, code lost:
    
        if ((r1 % 2) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0021, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0022, code lost:
    
        r5.destroyCurrentFragment(r6);
        r1 = com.incode.welcome_sdk.ui.BaseActivity.f10722v + 69;
        com.incode.welcome_sdk.ui.BaseActivity.f10723y = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x002e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002f, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0031, code lost:
    
        if (r8 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003b, code lost:
    
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroyCurrentFragment");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void destroyCurrentFragment$default(com.incode.welcome_sdk.ui.BaseActivity r5, boolean r6, int r7, java.lang.Object r8) throws java.lang.Exception {
        /*
            r4 = 2
            int r0 = r4 % r4
            int r0 = com.incode.welcome_sdk.ui.BaseActivity.f10723y
            int r0 = r0 + 61
            int r1 = r0 % 128
            com.incode.welcome_sdk.ui.BaseActivity.f10722v = r1
            int r0 = r0 % r4
            r3 = 0
            if (r0 == 0) goto L31
            r0 = 53
            int r0 = r0 / r3
            if (r8 != 0) goto L34
        L14:
            r2 = 1
            r7 = r7 & r2
            if (r7 == 0) goto L22
            int r1 = r1 + 23
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.BaseActivity.f10723y = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L2f
            r6 = r2
        L22:
            r5.destroyCurrentFragment(r6)
            int r0 = com.incode.welcome_sdk.ui.BaseActivity.f10722v
            int r1 = r0 + 69
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.BaseActivity.f10723y = r0
            int r1 = r1 % r4
            return
        L2f:
            r6 = r3
            goto L22
        L31:
            if (r8 != 0) goto L34
            goto L14
        L34:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Super calls with default arguments not supported in this target, function: destroyCurrentFragment"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.BaseActivity.destroyCurrentFragment$default(com.incode.welcome_sdk.ui.BaseActivity, boolean, int, java.lang.Object):void");
    }

    protected final void destroyCurrentFragment(boolean z2) throws Exception {
        int i2 = 2 % 2;
        int i3 = f10722v + 79;
        f10723y = i3 % 128;
        int i4 = i3 % 2;
        Fragment currentFragment = getCurrentFragment();
        if (currentFragment != null) {
            int i5 = f10722v + 107;
            f10723y = i5 % 128;
            int i6 = i5 % 2;
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            CX.ud();
            FragmentTransaction fragmentTransactionRemove = supportFragmentManager.beginTransaction().remove(currentFragment);
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionRemove, "");
            if (!(!z2)) {
                fragmentTransactionRemove.commitAllowingStateLoss();
            } else {
                fragmentTransactionRemove.commit();
            }
        }
    }

    private final void e(BaseFragment baseFragment) {
        int i2 = 2 % 2;
        int i3 = f10722v + 65;
        f10723y = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = getWindow().getAttributes().softInputMode;
            int softInputMode = baseFragment.getSoftInputMode();
            if (softInputMode == 0) {
                softInputMode = this.f10740q;
                int i5 = f10722v + 101;
                f10723y = i5 % 128;
                int i6 = i5 % 2;
            }
            if (softInputMode != i4) {
                getWindow().setSoftInputMode(softInputMode);
                return;
            }
            return;
        }
        int i7 = getWindow().getAttributes().softInputMode;
        baseFragment.getSoftInputMode();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(BaseResult baseResult) {
        int i2 = 2 % 2;
        int i3 = f10722v + 77;
        f10723y = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.b.publish(baseResult);
        int i5 = f10723y + 105;
        f10722v = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void publishModuleResultAndFinish(BaseResult baseResult) {
        int i2 = 2 % 2;
        int i3 = f10723y + 47;
        f10722v = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(baseResult, "");
            com.incode.welcome_sdk.b.publish(baseResult);
            finish();
        } else {
            Intrinsics.checkNotNullParameter(baseResult, "");
            com.incode.welcome_sdk.b.publish(baseResult);
            finish();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static final class e extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        private static int f10771b = 0;

        /* JADX INFO: renamed from: e */
        private static int f10772e = 1;

        private void b() {
            int i2 = 2 % 2;
            int i3 = f10771b + 21;
            f10772e = i3 % 128;
            if (i3 % 2 == 0) {
                BaseActivity.this.onBackButtonPressed();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            BaseActivity.this.onBackButtonPressed();
            int i4 = f10771b + 37;
            f10772e = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 8 / 0;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f10771b + 85;
            f10772e = i3 % 128;
            int i4 = i3 % 2;
            b();
            Unit unit = Unit.INSTANCE;
            int i5 = f10772e + 75;
            f10771b = i5 % 128;
            if (i5 % 2 == 0) {
                return unit;
            }
            throw null;
        }

        e() {
            super(0);
        }
    }

    @Override // com.incode.welcome_sdk.commons.b
    public Function0<Unit> getModuleQuitAttempt() {
        int i2 = 2 % 2;
        int i3 = f10722v + 27;
        int i4 = i3 % 128;
        f10723y = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        Function0<Unit> function0 = this.f10745w;
        int i5 = i4 + 43;
        f10722v = i5 % 128;
        if (i5 % 2 == 0) {
            return function0;
        }
        throw null;
    }

    static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        private static int f10763b = 0;

        /* JADX INFO: renamed from: d */
        private static int f10764d = 1;

        private void c() {
            int i2 = 2 % 2;
            int i3 = f10763b + 71;
            f10764d = i3 % 128;
            int i4 = i3 % 2;
            BaseActivity.this.finish();
            int i5 = f10763b + 31;
            f10764d = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            int i2 = 2 % 2;
            int i3 = f10764d + 1;
            f10763b = i3 % 128;
            int i4 = i3 % 2;
            c();
            Unit unit = Unit.INSTANCE;
            int i5 = f10763b + 63;
            f10764d = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        c() {
            super(0);
        }
    }

    @Override // com.incode.welcome_sdk.commons.b
    public Function0<Unit> getCloseScreenAction() {
        int i2 = 2 % 2;
        int i3 = f10722v;
        int i4 = i3 + 61;
        f10723y = i4 % 128;
        int i5 = i4 % 2;
        Function0<Unit> function0 = this.f10746x;
        int i6 = i3 + 25;
        f10723y = i6 % 128;
        int i7 = i6 % 2;
        return function0;
    }

    @Override // com.incode.welcome_sdk.commons.b
    public final boolean shouldShowCloseButton() {
        int i2 = 2 % 2;
        int i3 = f10722v + 79;
        f10723y = i3 % 128;
        int i4 = i3 % 2;
        boolean zIsShowCloseButton = getIncodeWelcome().getInternalConfig().isShowCloseButton();
        int i5 = f10722v + 25;
        f10723y = i5 % 128;
        if (i5 % 2 != 0) {
            return zIsShowCloseButton;
        }
        throw null;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // org.koin.core.component.KoinComponent
    public Koin getKoin() {
        Koin koin;
        int i2 = 2 % 2;
        com.incode.welcome_sdk.e.b bVar = com.incode.welcome_sdk.e.b.f10217b;
        KoinApplication koinApplicationD = com.incode.welcome_sdk.e.b.d();
        if (koinApplicationD != null) {
            koin = koinApplicationD.getKoin();
            int i3 = f10723y + 53;
            f10722v = i3 % 128;
            int i4 = i3 % 2;
        } else {
            int i5 = f10723y + 79;
            f10722v = i5 % 128;
            int i6 = i5 % 2;
            koin = null;
        }
        if (koin != null) {
            return koin;
        }
        throw new IllegalArgumentException("Koin not initialized.".toString());
    }

    static {
        Object obj = null;
        new Companion(null);
        int i2 = B + 39;
        A = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final void a(BaseActivity baseActivity, DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface) {
        int iB = DaggerVideoSelfieComponent.b.b();
        c(DaggerVideoSelfieComponent.b.b(), -549447003, iB, DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b(), 549447007, new Object[]{baseActivity, onClickListener, dialogInterface});
    }

    private static final void b(BaseActivity baseActivity, View view) {
        int iB = DaggerVideoSelfieComponent.b.b();
        c(DaggerVideoSelfieComponent.b.b(), -2045868288, iB, DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b(), 2045868290, new Object[]{baseActivity, view});
    }

    private static final void d(BaseActivity baseActivity, View view) {
        int iB = DaggerVideoSelfieComponent.b.b();
        c(DaggerVideoSelfieComponent.b.b(), -1265566950, iB, DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b(), 1265566950, new Object[]{baseActivity, view});
    }

    protected final void destroyCurrentFragment() throws Exception {
        int i2 = 2 % 2;
        int i3 = f10722v + 105;
        f10723y = i3 % 128;
        int i4 = i3 % 2;
        destroyCurrentFragment$default(this, false, 1, null);
        int i5 = f10722v + 67;
        f10723y = i5 % 128;
        int i6 = i5 % 2;
    }

    private final boolean h() {
        int iB = DaggerVideoSelfieComponent.b.b();
        return ((Boolean) c(DaggerVideoSelfieComponent.b.b(), -1297953274, iB, DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b(), 1297953279, new Object[]{this})).booleanValue();
    }

    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: c */
        private static int f10754c = 0;

        /* JADX INFO: renamed from: d */
        private static int f10755d = 1;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f10756e;

        static {
            int[] iArr = new int[CloseButtonPosition.values().length];
            try {
                iArr[CloseButtonPosition.TOP_LEFT.ordinal()] = 1;
                int i2 = f10755d + 75;
                f10754c = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CloseButtonPosition.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10756e = iArr;
            int i5 = f10755d + 35;
            f10754c = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 13 / 0;
            }
        }
    }

    private final void j() {
        int iB = DaggerVideoSelfieComponent.b.b();
        c(DaggerVideoSelfieComponent.b.b(), 711995945, iB, DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b(), -711995942, new Object[]{this});
    }

    private final ViewGroup e() {
        int iB = DaggerVideoSelfieComponent.b.b();
        return (ViewGroup) c(DaggerVideoSelfieComponent.b.b(), 1354803376, iB, DaggerVideoSelfieComponent.b.b(), DaggerVideoSelfieComponent.b.b(), -1354803375, new Object[]{this});
    }
}
