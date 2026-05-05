package com.incode.welcome_sdk.ui.id_capture;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.exceptions.video_selfie.CameraPermissionDeniedException;
import com.incode.welcome_sdk.commons.n;
import com.incode.welcome_sdk.commons.o;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.BaseResult;
import com.incode.welcome_sdk.results.IdScanCompleted;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.id_capture.AudioPermissionHandler;
import com.incode.welcome_sdk.ui.id_capture.event.AudioPermissionState;
import com.incode.welcome_sdk.ui.id_capture.viewmodel.InitIdCaptureViewModel;
import com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract;
import com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryDialog;
import io.sentry.protocol.SentryStackFrame;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import timber.log.Timber;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public final class IdCaptureActivity extends BaseActivity implements AudioPermissionHandler, PermissionsMandatoryContract.View {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f14653c = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f14654h = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f14655j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f14656l = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f14657o = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f14658b = LazyKt.lazy(new e());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final StateFlow<AudioPermissionState> f14659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MutableStateFlow<AudioPermissionState> f14660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f14661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f14662g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Modules f14663i;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strKd = Qg.kd("E2w5\u0019", (short) (C1607wl.Xd() ^ (709670323 ^ 709670433)), (short) (C1607wl.Xd() ^ (1171535422 ^ 1171535594)));
            String strVd = hg.Vd("-\u001a", (short) (C1607wl.Xd() ^ (408566960 ^ 408578366)), (short) (C1607wl.Xd() ^ ((685185876 ^ 1835023581) ^ 1169628994)));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("/\u001ca\u001f\u0003", (short) (C1499aX.Xd() ^ ((214430394 ^ 373776494) ^ (-444647561))));
                String strYd = C1561oA.yd("\u0012\u007f", (short) (C1580rY.Xd() ^ ((830118785 ^ 773740117) ^ (-526684071))));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("q`(gM", (short) (OY.Xd() ^ ((851800221 ^ 90292981) ^ 933542348)));
                    String strQd = Xg.qd("aW", (short) (FB.Xd() ^ (2103736185 ^ 2103723442)), (short) (FB.Xd() ^ (394830757 ^ 394837707)));
                    try {
                        Class<?> cls3 = Class.forName(strYd2);
                        Field field3 = 0 != 0 ? cls3.getField(strQd) : cls3.getDeclaredField(strQd);
                        field3.setAccessible(true);
                        obj3 = field3.get(null);
                    } catch (Throwable th3) {
                        obj3 = null;
                    }
                    if (((WindowManager) obj3) == null) {
                        Object[] objArr = new Object[0];
                        Method declaredMethod = Class.forName(Jg.Wd("'M\t(}", (short) (OY.Xd() ^ ((2082945191 ^ 1023396813) ^ 1087962269)), (short) (OY.Xd() ^ ((807225396 ^ 177647712) ^ 982252137)))).getDeclaredMethod(ZO.xd("aM", (short) (C1633zX.Xd() ^ (902885161 ^ (-902865069))), (short) (C1633zX.Xd() ^ ((442243277 ^ 339102931) ^ (-241832008)))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                short sXd = (short) (Od.Xd() ^ (1431930220 ^ (-1431937463)));
                                short sXd2 = (short) (Od.Xd() ^ ((1269905308 ^ 1018693776) ^ (-1997102148)));
                                int[] iArr = new int["W\f9h$N".length()];
                                QB qb = new QB("W\f9h$N");
                                int i2 = 0;
                                while (qb.YK()) {
                                    int iKK = qb.KK();
                                    Xu xuXd = Xu.Xd(iKK);
                                    iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                                    i2++;
                                }
                                Object[] objArr2 = {new String(iArr, 0, i2)};
                                Method method = Class.forName(Ig.wd("k0V\u0003&rG_5$'\t.7cyA}3_\u0011N\u001e", (short) (Od.Xd() ^ (1851752708 ^ (-1851757239))))).getMethod(C1561oA.Qd("\u000e\u000b\u0019v\u001c\u0015\u0015\u0005\fp\u0002\u000e\u0011\u0003{|", (short) (Od.Xd() ^ ((692418089 ^ 1968965511) ^ (-1545170015)))), Class.forName(EO.Od("\u0016]<\u0001FZe\fHl\n\u0013`[.\u000f", (short) (Od.Xd() ^ ((1005937425 ^ 1843224274) ^ (-1445462679))))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("p_'fL", (short) (OY.Xd() ^ (122258707 ^ 122275364)), (short) (OY.Xd() ^ ((889544604 ^ 1656922699) ^ 1472724180)));
                                    String strOd = C1561oA.od("\u0001t", (short) (FB.Xd() ^ (1399512116 ^ 1399496726)));
                                    try {
                                        Class<?> cls4 = Class.forName(strZd);
                                        Field field4 = 0 != 0 ? cls4.getField(strOd) : cls4.getDeclaredField(strOd);
                                        field4.setAccessible(true);
                                        field4.set(null, windowManager);
                                    } catch (Throwable th4) {
                                    }
                                } catch (InvocationTargetException e2) {
                                    throw e2.getCause();
                                }
                            }
                        } catch (InvocationTargetException e3) {
                            throw e3.getCause();
                        }
                    }
                    String strKd2 = C1561oA.Kd("(\u0017^\u001e\u0004", (short) (OY.Xd() ^ (446186303 ^ 446189147)));
                    String strZd2 = Wg.Zd("e4", (short) (FB.Xd() ^ ((313887127 ^ 544333112) ^ 851713441)), (short) (FB.Xd() ^ (1757211099 ^ 1757209715)));
                    try {
                        Class<?> cls5 = Class.forName(strKd2);
                        Field field5 = 0 != 0 ? cls5.getField(strZd2) : cls5.getDeclaredField(strZd2);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("O>\u0006E+", (short) (C1607wl.Xd() ^ ((1367505762 ^ 178948846) ^ 1529387402)));
                        String strVd2 = Wg.vd("\n}", (short) (ZN.Xd() ^ ((1708487121 ^ 841799509) ^ 1475983100)));
                        try {
                            Class<?> cls6 = Class.forName(strXd);
                            Field field6 = 0 != 0 ? cls6.getField(strVd2) : cls6.getDeclaredField(strVd2);
                            field6.setAccessible(true);
                            obj5 = field6.get(null);
                        } catch (Throwable th6) {
                            obj5 = null;
                        }
                        ((WindowManager) obj5).getDefaultDisplay().getMetrics(displayMetrics);
                        int x2 = (int) motionEvent.getX();
                        int y2 = (int) motionEvent.getY();
                        int i3 = (468540480 ^ 966563285) ^ 577882590;
                        if (x2 > i3 && x2 < displayMetrics.widthPixels - i3 && y2 > i3 && y2 < displayMetrics.heightPixels - i3) {
                            C1553lQ.vd(motionEvent);
                            C1553lQ.Od(motionEvent);
                        }
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public IdCaptureActivity() {
        MutableStateFlow<AudioPermissionState> MutableStateFlow = StateFlowKt.MutableStateFlow(AudioPermissionState.f14992e);
        this.f14660e = MutableStateFlow;
        this.f14659d = MutableStateFlow;
        final IdCaptureActivity idCaptureActivity = this;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final byte b2 = 0 == true ? 1 : 0;
        this.f14662g = LazyKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<n>() { // from class: com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity$special$$inlined$inject$default$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f14710a = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f14711b = 0;

            /* JADX WARN: Type inference failed for: r0v10, types: [com.incode.welcome_sdk.commons.n, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v1, types: [com.incode.welcome_sdk.commons.n, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final n invoke() {
                int i2 = 2 % 2;
                int i3 = f14710a + 105;
                f14711b = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    KoinComponent koinComponent = idCaptureActivity;
                    Qualifier qualifier2 = qualifier;
                    Function0<? extends ParametersHolder> function0 = b2;
                    if (koinComponent instanceof KoinScopeComponent) {
                        ?? r2 = ((KoinScopeComponent) koinComponent).getScope().get(Reflection.getOrCreateKotlinClass(n.class), qualifier2, function0);
                        int i4 = f14710a + 7;
                        f14711b = i4 % 128;
                        if (i4 % 2 == 0) {
                            return r2;
                        }
                        obj.hashCode();
                        throw null;
                    }
                    return koinComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(n.class), qualifier2, function0);
                }
                boolean z2 = idCaptureActivity instanceof KoinScopeComponent;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        final i iVar = new i();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final byte b3 = 0 == true ? 1 : 0;
        this.f14661f = LazyKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<InitIdCaptureViewModel>() { // from class: com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity$special$$inlined$inject$default$2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f14715a = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static int f14716d = 0;

            /* JADX WARN: Type inference failed for: r0v6, types: [com.incode.welcome_sdk.ui.id_capture.viewmodel.InitIdCaptureViewModel, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r2v1, types: [com.incode.welcome_sdk.ui.id_capture.viewmodel.InitIdCaptureViewModel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final InitIdCaptureViewModel invoke() {
                int i2 = 2 % 2;
                KoinComponent koinComponent = idCaptureActivity;
                Qualifier qualifier2 = b3;
                Function0<? extends ParametersHolder> function0 = iVar;
                if (!(koinComponent instanceof KoinScopeComponent)) {
                    ?? r2 = koinComponent.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(InitIdCaptureViewModel.class), qualifier2, function0);
                    int i3 = f14716d + 33;
                    f14715a = i3 % 128;
                    if (i3 % 2 != 0) {
                        return r2;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = f14715a + 111;
                f14716d = i4 % 128;
                int i5 = i4 % 2;
                return ((KoinScopeComponent) koinComponent).getScope().get(Reflection.getOrCreateKotlinClass(InitIdCaptureViewModel.class), qualifier2, function0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.f14663i = Modules.ID;
    }

    public static final /* synthetic */ IdScan access$getIdScan(IdCaptureActivity idCaptureActivity) {
        int i2 = 2 % 2;
        int i3 = f14654h + 81;
        f14655j = i3 % 128;
        int i4 = i3 % 2;
        IdScan idScanC = idCaptureActivity.c();
        int i5 = f14655j + 117;
        f14654h = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
        return idScanC;
    }

    public static final /* synthetic */ n access$getScreenNameHolder(IdCaptureActivity idCaptureActivity) {
        int i2 = 2 % 2;
        int i3 = f14654h + 79;
        f14655j = i3 % 128;
        if (i3 % 2 != 0) {
            idCaptureActivity.e();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        n nVarE = idCaptureActivity.e();
        int i4 = f14654h + 109;
        f14655j = i4 % 128;
        int i5 = i4 % 2;
        return nVarE;
    }

    public static final /* synthetic */ o access$getScreenRecordingInitializer(IdCaptureActivity idCaptureActivity) {
        int i2 = 2 % 2;
        int i3 = f14655j + 75;
        f14654h = i3 % 128;
        int i4 = i3 % 2;
        o screenRecordingInitializer = idCaptureActivity.getScreenRecordingInitializer();
        int i5 = f14654h + 51;
        f14655j = i5 % 128;
        int i6 = i5 % 2;
        return screenRecordingInitializer;
    }

    public static final /* synthetic */ InitIdCaptureViewModel access$getViewModel(IdCaptureActivity idCaptureActivity) {
        int i2 = 2 % 2;
        int i3 = f14655j + 17;
        f14654h = i3 % 128;
        int i4 = i3 % 2;
        InitIdCaptureViewModel initIdCaptureViewModelB = idCaptureActivity.b();
        int i5 = f14654h + 75;
        f14655j = i5 % 128;
        if (i5 % 2 == 0) {
            return initIdCaptureViewModelB;
        }
        throw null;
    }

    public static final /* synthetic */ void access$handlePermissionScreenClosed(IdCaptureActivity idCaptureActivity) {
        int i2 = 2 % 2;
        int i3 = f14654h + 111;
        f14655j = i3 % 128;
        int i4 = i3 % 2;
        idCaptureActivity.a();
        int i5 = f14654h + 49;
        f14655j = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.id_capture.AudioPermissionHandler
    public final boolean isGranted() {
        int i2 = 2 % 2;
        int i3 = f14655j + 7;
        f14654h = i3 % 128;
        if (i3 % 2 != 0) {
            return AudioPermissionHandler.DefaultImpls.isGranted(this);
        }
        AudioPermissionHandler.DefaultImpls.isGranted(this);
        throw null;
    }

    static final class e extends Lambda implements Function0<IdScan> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14691c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14692d = 0;

        private IdScan a() {
            int i2 = 2 % 2;
            int i3 = f14692d + 113;
            f14691c = i3 % 128;
            if (i3 % 2 != 0) {
                return (IdScan) IdCaptureActivity.this.getIntent().getParcelableExtra("extra_id_scan");
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ IdScan invoke() {
            int i2 = 2 % 2;
            int i3 = f14691c + 13;
            f14692d = i3 % 128;
            if (i3 % 2 != 0) {
                a();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            IdScan idScanA = a();
            int i4 = f14691c + 113;
            f14692d = i4 % 128;
            int i5 = i4 % 2;
            return idScanA;
        }

        e() {
            super(0);
        }
    }

    private final IdScan c() {
        int i2 = 2 % 2;
        int i3 = f14655j + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f14654h = i3 % 128;
        int i4 = i3 % 2;
        IdScan idScan = (IdScan) this.f14658b.getValue();
        if (i4 == 0) {
            int i5 = 48 / 0;
        }
        return idScan;
    }

    @Override // com.incode.welcome_sdk.ui.id_capture.AudioPermissionHandler
    public final StateFlow<AudioPermissionState> getState() {
        int i2 = 2 % 2;
        int i3 = f14655j + 35;
        f14654h = i3 % 128;
        if (i3 % 2 != 0) {
            return this.f14659d;
        }
        throw null;
    }

    static final class i extends Lambda implements Function0<ParametersHolder> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f14707c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14708d = 0;

        private ParametersHolder c() {
            int i2 = 2 % 2;
            int i3 = f14708d + 87;
            f14707c = i3 % 128;
            int i4 = i3 % 2;
            ParametersHolder parametersHolderParametersOf = ParametersHolderKt.parametersOf(IdCaptureActivity.access$getIdScan(IdCaptureActivity.this), IdCaptureActivity.access$getScreenNameHolder(IdCaptureActivity.this));
            int i5 = f14707c + 47;
            f14708d = i5 % 128;
            if (i5 % 2 == 0) {
                return parametersHolderParametersOf;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ ParametersHolder invoke() {
            int i2 = 2 % 2;
            int i3 = f14708d + 117;
            f14707c = i3 % 128;
            int i4 = i3 % 2;
            ParametersHolder parametersHolderC = c();
            int i5 = f14708d + 39;
            f14707c = i5 % 128;
            int i6 = i5 % 2;
            return parametersHolderC;
        }

        i() {
            super(0);
        }
    }

    private final n e() {
        int i2 = 2 % 2;
        int i3 = f14654h + 93;
        f14655j = i3 % 128;
        int i4 = i3 % 2;
        n nVar = (n) this.f14662g.getValue();
        int i5 = f14655j + 103;
        f14654h = i5 % 128;
        if (i5 % 2 != 0) {
            return nVar;
        }
        throw null;
    }

    private final InitIdCaptureViewModel b() {
        int i2 = 2 % 2;
        int i3 = f14654h + 43;
        f14655j = i3 % 128;
        int i4 = i3 % 2;
        InitIdCaptureViewModel initIdCaptureViewModel = (InitIdCaptureViewModel) this.f14661f.getValue();
        int i5 = f14654h + 111;
        f14655j = i5 % 128;
        int i6 = i5 % 2;
        return initIdCaptureViewModel;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f14654h;
        int i4 = i3 + 55;
        f14655j = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        Modules modules = this.f14663i;
        int i5 = i3 + 83;
        f14655j = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 22 / 0;
        }
        return modules;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f14655j + 25;
        f14654h = i3 % 128;
        int i4 = i3 % 2;
        ScreenName value = e().b().getValue();
        if (i4 != 0) {
            return value;
        }
        throw null;
    }

    static final class c extends Lambda implements Function0<BaseResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f14683a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14684b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f14685c = new c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14686d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14687e = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ BaseResult invoke() {
            int i2 = 2 % 2;
            int i3 = f14683a + 123;
            f14687e = i3 % 128;
            int i4 = i3 % 2;
            BaseResult baseResultB = b();
            int i5 = f14683a + 105;
            f14687e = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 8 / 0;
            }
            return baseResultB;
        }

        private static BaseResult b() {
            int i2 = 2 % 2;
            IdScanCompleted idScanCompleted = new IdScanCompleted(ResultCode.USER_CANCELLED, null, 2, null);
            int i3 = f14683a + 103;
            f14687e = i3 % 128;
            if (i3 % 2 == 0) {
                return idScanCompleted;
            }
            throw null;
        }

        static {
            int i2 = f14686d + 95;
            f14684b = i2 % 128;
            int i3 = i2 % 2;
        }

        c() {
            super(0);
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final BaseActivity.Config getConfig() {
        int i2 = 2 % 2;
        int i3 = f14655j + 65;
        f14654h = i3 % 128;
        return i3 % 2 == 0 ? BaseActivity.Config.copy$default(super.getConfig(), true, false, false, false, c.f14685c, 4, null) : BaseActivity.Config.copy$default(super.getConfig(), false, false, false, false, c.f14685c, 3, null);
    }

    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14666d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14667e = 1;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            int i2 = 2 % 2;
            int i3 = f14666d + 25;
            f14667e = i3 % 128;
            int i4 = i3 % 2;
            a(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i4 != 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
        
            if (r6.getSkipping() == false) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        
            r6.skipToGroupEnd();
            r1 = com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity.a.f14667e + 89;
            com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity.a.f14666d = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        
            if (r6.getSkipping() != true) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void a(androidx.compose.runtime.Composer r6, int r7) {
            /*
                r5 = this;
                r2 = 2
                int r0 = r2 % r2
                r0 = r7 & 11
                r4 = 0
                r3 = 1
                if (r0 != r2) goto L1d
                int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity.a.f14666d
                int r1 = r0 + 91
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity.a.f14667e = r0
                int r1 = r1 % r2
                if (r1 != 0) goto L4e
                boolean r1 = r6.getSkipping()
                r0 = 94
                int r0 = r0 / r4
                if (r1 == r3) goto L55
            L1d:
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == 0) goto L2c
                r2 = -1
                java.lang.String r1 = "com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity.safeOnCreate.<anonymous> (IdCaptureActivity.kt:77)"
                r0 = -1733021087(0xffffffff98b43261, float:-4.657978E-24)
                androidx.compose.runtime.ComposerKt.traceEventStart(r0, r7, r2, r1)
            L2c:
                com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity.this
                org.koin.core.Koin r2 = r0.getKoin()
                com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity$a$5 r1 = new com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity$a$5
                com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity.this
                r1.<init>()
                r0 = -979158469(0xffffffffc5a33a3b, float:-5223.279)
                androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r6, r0, r3, r1)
                kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
                r0 = 56
                org.koin.compose.KoinApplicationKt.KoinContext(r2, r1, r6, r0, r4)
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == r3) goto L62
            L4d:
                return
            L4e:
                boolean r0 = r6.getSkipping()
                if (r0 != 0) goto L55
                goto L1d
            L55:
                r6.skipToGroupEnd()
                int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity.a.f14667e
                int r1 = r0 + 89
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity.a.f14666d = r0
                int r1 = r1 % r2
                goto L4d
            L62:
                androidx.compose.runtime.ComposerKt.traceEventEnd()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity.a.a(androidx.compose.runtime.Composer, int):void");
        }

        a() {
            super(2);
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f14655j + 79;
        f14654h = i3 % 128;
        int i4 = i3 % 2;
        super.safeOnCreate(bundle);
        Object obj = null;
        if (f()) {
            int i5 = f14654h;
            int i6 = i5 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f14655j = i6 % 128;
            if (i6 % 2 == 0) {
                MutableStateFlow<AudioPermissionState> mutableStateFlow = this.f14660e;
                int i7 = i5 + 69;
                f14655j = i7 % 128;
                int i8 = i7 % 2;
                while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), AudioPermissionState.f14988a)) {
                }
            } else {
                obj.hashCode();
                throw null;
            }
        }
        if (c() != null) {
            d();
            super.setContent(null, ComposableLambdaKt.composableLambdaInstance(-1733021087, true, new a()));
            return;
        }
        int i9 = f14654h + 125;
        f14655j = i9 % 128;
        if (i9 % 2 != 0) {
            Timber.Forest.e("IdScan must not be null.", new Object[0]);
        } else {
            Timber.Forest.e("IdScan must not be null.", new Object[0]);
        }
    }

    static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f14688a = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14689e = 1;

        private void a() {
            int i2 = 2 % 2;
            int i3 = f14688a + 57;
            f14689e = i3 % 128;
            int i4 = i3 % 2;
            IdCaptureActivity.access$handlePermissionScreenClosed(IdCaptureActivity.this);
            int i5 = f14689e + 5;
            f14688a = i5 % 128;
            int i6 = i5 % 2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            Unit unit;
            int i2 = 2 % 2;
            int i3 = f14689e + 89;
            f14688a = i3 % 128;
            int i4 = i3 % 2;
            a();
            if (i4 != 0) {
                unit = Unit.INSTANCE;
                int i5 = 31 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i6 = f14689e + 103;
            f14688a = i6 % 128;
            if (i6 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        d() {
            super(0);
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity, com.incode.welcome_sdk.commons.b
    public final Function0<Unit> getModuleQuitAttempt() {
        int i2 = 2 % 2;
        d dVar = new d();
        int i3 = f14655j + 31;
        f14654h = i3 % 128;
        int i4 = i3 % 2;
        return dVar;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void onBackButtonPressed() {
        int i2 = 2 % 2;
        int i3 = f14655j + 73;
        f14654h = i3 % 128;
        if (i3 % 2 != 0) {
            a();
            int i4 = f14654h + 99;
            f14655j = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        a();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(IdCaptureActivity idCaptureActivity, DialogInterface dialogInterface, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(idCaptureActivity, "");
        idCaptureActivity.publishModuleResultAndFinish(new IdScanCompleted(ResultCode.ERROR, new CameraPermissionDeniedException()));
        int i4 = f14654h + 21;
        f14655j = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
    }

    private final void a() {
        int i2 = 2 % 2;
        int i3 = f14654h + 65;
        f14655j = i3 % 128;
        int i4 = i3 % 2;
        if (!(b().getState().getValue().getIdCaptureStep() instanceof InitIdCaptureViewModel.IdCaptureStep.PermissionOnboarding)) {
            super.onBackButtonPressed();
            return;
        }
        int i5 = f14655j + 39;
        f14654h = i5 % 128;
        int i6 = i5 % 2;
        handleExit(new DialogInterface.OnClickListener() { // from class: com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                IdCaptureActivity.b(this.f$0, dialogInterface, i7);
            }
        });
        int i7 = f14654h + 113;
        f14655j = i7 % 128;
        int i8 = i7 % 2;
    }

    static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f14675a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f14676b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f14678e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i2 = 2 % 2;
            int i3 = f14676b + 69;
            f14675a = i3 % 128;
            int i4 = i3 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i5 = this.f14678e;
            if (i5 == 0) {
                ResultKt.throwOnFailure(obj);
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                final Flow flowDrop = FlowKt.drop(IdCaptureActivity.access$getScreenNameHolder(IdCaptureActivity.this).b(), 1);
                final IdCaptureActivity idCaptureActivity = IdCaptureActivity.this;
                Flow<ScreenName> flow = new Flow<ScreenName>() { // from class: com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity$handleScreenChanges$1$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static int f14694d = 0;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    private static int f14695e = 1;

                    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity$handleScreenChanges$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        private static int f14698a = 1;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        private static int f14699e = 0;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        private /* synthetic */ IdCaptureActivity f14700b;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        private /* synthetic */ FlowCollector f14701d;

                        /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
                        /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                            /*
                                r6 = this;
                                r2 = 2
                                int r0 = r2 % r2
                                int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity$handleScreenChanges$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f14698a
                                int r1 = r0 + 57
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity$handleScreenChanges$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f14699e = r0
                                int r1 = r1 % r2
                                if (r1 == 0) goto L63
                                boolean r1 = r8 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity$handleScreenChanges$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                r0 = 8
                                int r0 = r0 / 0
                                if (r1 == 0) goto L68
                            L16:
                                r5 = r8
                                com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity$handleScreenChanges$1$invokeSuspend$$inlined$filter$1$2$1 r5 = (com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity$handleScreenChanges$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r5
                                int r0 = r5.f14704c
                                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                r0 = r0 & r1
                                if (r0 == 0) goto L68
                                int r0 = r5.f14704c
                                int r0 = r0 - r1
                                r5.f14704c = r0
                            L25:
                                java.lang.Object r1 = r5.f14706e
                                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r0 = r5.f14704c
                                r3 = 1
                                if (r0 == 0) goto L45
                                if (r0 != r3) goto L6e
                                kotlin.ResultKt.throwOnFailure(r1)
                                int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity$handleScreenChanges$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f14699e
                                int r1 = r0 + 23
                                int r0 = r1 % 128
                                com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity$handleScreenChanges$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.f14698a = r0
                                int r1 = r1 % r2
                                if (r1 != 0) goto L42
                                r0 = 3
                                int r0 = r0 / r2
                            L42:
                                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                                return r0
                            L45:
                                kotlin.ResultKt.throwOnFailure(r1)
                                kotlinx.coroutines.flow.FlowCollector r2 = r6.f14701d
                                r0 = r5
                                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                                r0 = r7
                                com.incode.welcome_sdk.ScreenName r0 = (com.incode.welcome_sdk.ScreenName) r0
                                com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity r0 = r6.f14700b
                                com.incode.welcome_sdk.ScreenName r1 = r0.getScreenName()
                                com.incode.welcome_sdk.ScreenName r0 = com.incode.welcome_sdk.ScreenName.UNUSED
                                if (r1 == r0) goto L42
                                r5.f14704c = r3
                                java.lang.Object r0 = r2.emit(r7, r5)
                                if (r0 != r4) goto L42
                                return r4
                            L63:
                                boolean r0 = r8 instanceof com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity$handleScreenChanges$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L68
                                goto L16
                            L68:
                                com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity$handleScreenChanges$1$invokeSuspend$$inlined$filter$1$2$1 r5 = new com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity$handleScreenChanges$1$invokeSuspend$$inlined$filter$1$2$1
                                r5.<init>(r8)
                                goto L25
                            L6e:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r1.<init>(r0)
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity$handleScreenChanges$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity$handleScreenChanges$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            private static int f14702a = 0;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            private static int f14703b = 1;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            int f14704c;

                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                            /* synthetic */ Object f14706e;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                int i2 = 2 % 2;
                                int i3 = f14703b + 23;
                                f14702a = i3 % 128;
                                int i4 = i3 % 2;
                                this.f14706e = obj;
                                this.f14704c |= Integer.MIN_VALUE;
                                Object objEmit = AnonymousClass2.this.emit(null, this);
                                int i5 = f14703b + 31;
                                f14702a = i5 % 128;
                                int i6 = i5 % 2;
                                return objEmit;
                            }

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, IdCaptureActivity idCaptureActivity) {
                            this.f14701d = flowCollector;
                            this.f14700b = idCaptureActivity;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector<? super ScreenName> flowCollector, Continuation continuation) {
                        int i6 = 2 % 2;
                        Object objCollect = flowDrop.collect(new AnonymousClass2(flowCollector, idCaptureActivity), continuation);
                        if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            return objCollect;
                        }
                        Unit unit = Unit.INSTANCE;
                        int i7 = f14695e + 33;
                        f14694d = i7 % 128;
                        int i8 = i7 % 2;
                        return unit;
                    }
                };
                final IdCaptureActivity idCaptureActivity2 = IdCaptureActivity.this;
                this.f14678e = 1;
                if (flow.collect(new FlowCollector() { // from class: com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity.b.5

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private static int f14679b = 0;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    private static int f14680d = 1;

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        int i6 = 2 % 2;
                        int i7 = f14680d + 51;
                        f14679b = i7 % 128;
                        int i8 = i7 % 2;
                        Object objC = c((ScreenName) obj2);
                        int i9 = f14680d + 35;
                        f14679b = i9 % 128;
                        int i10 = i9 % 2;
                        return objC;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:6:0x002d A[PHI: r2
  0x002d: PHI (r2v5 com.incode.welcome_sdk.ScreenName) = (r2v4 com.incode.welcome_sdk.ScreenName), (r2v8 com.incode.welcome_sdk.ScreenName) binds: [B:12:0x006c, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private java.lang.Object c(com.incode.welcome_sdk.ScreenName r6) {
                        /*
                            r5 = this;
                            r4 = 2
                            int r0 = r4 % r4
                            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity.b.AnonymousClass5.f14679b
                            int r2 = r0 + 103
                            int r0 = r2 % 128
                            com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity.b.AnonymousClass5.f14680d = r0
                            int r2 = r2 % r4
                            r3 = 0
                            java.lang.String r1 = "BOJAN Got a screenName change: "
                            if (r2 != 0) goto L52
                            timber.log.Timber$Forest r2 = timber.log.Timber.Forest
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>(r1)
                            java.lang.StringBuilder r0 = r0.append(r6)
                            java.lang.String r1 = r0.toString()
                            java.lang.Object[] r0 = new java.lang.Object[r3]
                            r2.d(r1, r0)
                            kotlin.jvm.internal.Ref$ObjectRef<com.incode.welcome_sdk.ScreenName> r0 = r1
                            T r2 = r0.element
                            com.incode.welcome_sdk.ScreenName r2 = (com.incode.welcome_sdk.ScreenName) r2
                            if (r2 == 0) goto L46
                        L2d:
                            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity.b.AnonymousClass5.f14679b
                            int r1 = r0 + 97
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity.b.AnonymousClass5.f14680d = r0
                            int r1 = r1 % r4
                            if (r1 == 0) goto L6f
                            com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity r0 = r2
                            r0.sendScreenClosedEvent(r2)
                            int r0 = com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity.b.AnonymousClass5.f14680d
                            int r1 = r0 + 5
                            int r0 = r1 % 128
                            com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity.b.AnonymousClass5.f14679b = r0
                            int r1 = r1 % r4
                        L46:
                            com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity r0 = r2
                            r0.sendScreenOpenedEvent(r6)
                            kotlin.jvm.internal.Ref$ObjectRef<com.incode.welcome_sdk.ScreenName> r0 = r1
                            r0.element = r6
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        L52:
                            timber.log.Timber$Forest r2 = timber.log.Timber.Forest
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>(r1)
                            java.lang.StringBuilder r0 = r0.append(r6)
                            java.lang.String r1 = r0.toString()
                            java.lang.Object[] r0 = new java.lang.Object[r3]
                            r2.d(r1, r0)
                            kotlin.jvm.internal.Ref$ObjectRef<com.incode.welcome_sdk.ScreenName> r0 = r1
                            T r2 = r0.element
                            com.incode.welcome_sdk.ScreenName r2 = (com.incode.welcome_sdk.ScreenName) r2
                            if (r2 == 0) goto L46
                            goto L2d
                        L6f:
                            com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity r0 = r2
                            r0.sendScreenClosedEvent(r2)
                            r0 = 0
                            throw r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_capture.IdCaptureActivity.b.AnonymousClass5.c(com.incode.welcome_sdk.ScreenName):java.lang.Object");
                    }
                }, this) == coroutine_suspended) {
                    int i6 = f14675a + 27;
                    f14676b = i6 % 128;
                    if (i6 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i7 = f14675a + 87;
            f14676b = i7 % 128;
            int i8 = i7 % 2;
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f14676b + 123;
            f14675a = i3 % 128;
            int i4 = i3 % 2;
            Object objE = e(coroutineScope, continuation);
            int i5 = f14675a + 81;
            f14676b = i5 % 128;
            int i6 = i5 % 2;
            return objE;
        }

        private Object e(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i2 = 2 % 2;
            int i3 = f14676b + 91;
            f14675a = i3 % 128;
            int i4 = i3 % 2;
            b bVar = (b) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i4 == 0) {
                return bVar.invokeSuspend(unit);
            }
            bVar.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i2 = 2 % 2;
            b bVar = IdCaptureActivity.this.new b(continuation);
            int i3 = f14675a + 113;
            f14676b = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 73 / 0;
            }
            return bVar;
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }
    }

    private final void d() {
        int i2 = 2 % 2;
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        Object obj = null;
        BuildersKt__Builders_commonKt.launch$default(LifecycleKt.getCoroutineScope(lifecycle), null, null, new b(null), 3, null);
        int i3 = f14655j + 103;
        f14654h = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        int i3 = 2 % 2;
        int i4 = f14655j + 117;
        f14654h = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(iArr, "");
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (i2 == 1) {
            if (f()) {
                MutableStateFlow<AudioPermissionState> mutableStateFlow = this.f14660e;
                while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), AudioPermissionState.f14988a)) {
                }
                return;
            } else {
                j();
                int i6 = f14655j + 85;
                f14654h = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        int i8 = f14655j + 75;
        f14654h = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void j() {
        int i2 = 2 % 2;
        int i3 = f14654h + 37;
        f14655j = i3 % 128;
        if (i3 % 2 == 0) {
            PermissionsMandatoryDialog.newInstance(R.drawable.onboard_sdk_microphone_permission_image, R.string.onboard_sdk_dialog_microphone_permissions_mandatory_title, R.string.onboard_sdk_dialog_microphone_permissions_mandatory_subtitle, "android.permission.RECORD_AUDIO", getModule(), getRepo()).show(getSupportFragmentManager(), PermissionsMandatoryDialog.TAG);
            return;
        }
        PermissionsMandatoryDialog.newInstance(R.drawable.onboard_sdk_microphone_permission_image, R.string.onboard_sdk_dialog_microphone_permissions_mandatory_title, R.string.onboard_sdk_dialog_microphone_permissions_mandatory_subtitle, "android.permission.RECORD_AUDIO", getModule(), getRepo()).show(getSupportFragmentManager(), PermissionsMandatoryDialog.TAG);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean f() throws Throwable {
        int i2 = 2 % 2;
        int i3 = f14655j + 93;
        f14654h = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            ContextCompat.checkSelfPermission(this, "android.permission.RECORD_AUDIO");
            obj.hashCode();
            throw null;
        }
        if (ContextCompat.checkSelfPermission(this, "android.permission.RECORD_AUDIO") != 0) {
            return false;
        }
        int i4 = f14654h + 17;
        f14655j = i4 % 128;
        if (i4 % 2 == 0) {
            return true;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.incode.welcome_sdk.ui.id_capture.AudioPermissionHandler
    public final void requestPermission() {
        int i2 = 2 % 2;
        int i3 = f14654h + 63;
        f14655j = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<AudioPermissionState> mutableStateFlow = this.f14660e;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), AudioPermissionState.f14989b)) {
        }
        int i5 = f14654h + 49;
        f14655j = i5 % 128;
        int i6 = i5 % 2;
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.RECORD_AUDIO"}, 1);
    }

    @Override // com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract.View
    public final void onBtnOpenSettingsClicked() throws Exception {
        int i2 = 2 % 2;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts(SentryStackFrame.JsonKeys.PACKAGE, getPackageName(), null));
        CX.ud();
        startActivity(intent);
        int i3 = f14654h + 1;
        f14655j = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.ui.permissions.PermissionsMandatoryContract.View
    public final void onPermissionMandatoryDialogClosed(Exception exc) {
        int i2 = 2 % 2;
        int i3 = f14654h + 113;
        f14655j = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<AudioPermissionState> mutableStateFlow = this.f14660e;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), AudioPermissionState.f14991d)) {
        }
        int i5 = f14655j + 9;
        f14654h = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() throws Exception {
        int i2 = 2 % 2;
        int i3 = f14654h + 1;
        f14655j = i3 % 128;
        int i4 = i3 % 2;
        super.onResume();
        if (this.f14660e.getValue() == AudioPermissionState.f14989b) {
            if (f()) {
                MutableStateFlow<AudioPermissionState> mutableStateFlow = this.f14660e;
                while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), AudioPermissionState.f14988a)) {
                }
                Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag(PermissionsMandatoryDialog.TAG);
                if (fragmentFindFragmentByTag != null) {
                    FragmentManager supportFragmentManager = getSupportFragmentManager();
                    CX.ud();
                    supportFragmentManager.beginTransaction().remove(fragmentFindFragmentByTag).commit();
                    return;
                }
                return;
            }
            if (getSupportFragmentManager().findFragmentByTag(PermissionsMandatoryDialog.TAG) == null) {
                int i5 = f14655j + 103;
                f14654h = i5 % 128;
                if (i5 % 2 != 0) {
                    requestPermission();
                    return;
                }
                requestPermission();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
    }

    public static final class Companion {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f14664d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f14665e = 1;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, IdScan idScan) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(idScan, "");
            Intent intentPutExtra = new Intent(context, (Class<?>) IdCaptureActivity.class).putExtra("extra_id_scan", idScan);
            CX.ud();
            context.startActivity(intentPutExtra);
            int i3 = f14665e + 75;
            f14664d = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f14656l + 83;
        f14657o = i2 % 128;
        int i3 = i2 % 2;
    }

    @JvmStatic
    public static final void start(Context context, IdScan idScan) {
        int i2 = 2 % 2;
        int i3 = f14655j + 25;
        f14654h = i3 % 128;
        int i4 = i3 % 2;
        f14653c.start(context, idScan);
        int i5 = f14654h + 111;
        f14655j = i5 % 128;
        int i6 = i5 % 2;
    }
}
