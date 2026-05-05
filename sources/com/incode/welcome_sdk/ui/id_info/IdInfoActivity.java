package com.incode.welcome_sdk.ui.id_info;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.exceptions.video_selfie.CompareOcrException;
import com.incode.welcome_sdk.d.n;
import com.incode.welcome_sdk.data.IncodeWelcomeRepository;
import com.incode.welcome_sdk.data.local.j;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.results.IdInfoResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.ui.BaseActivity;
import com.incode.welcome_sdk.ui.id_info.IdInfoContract;
import com.incode.welcome_sdk.views.IncodeEditText;
import com.incode.welcome_sdk.views.IncodeTextView;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import yg.C1499aX;
import yg.C1553lQ;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
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
public final class IdInfoActivity extends BaseActivity implements IdInfoContract.View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Companion f16300b = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f16301g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f16302h = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f16303m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f16304o = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n f16305c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private IdInfoModel f16309i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f16306d = LazyKt.lazy(new b());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ScreenName f16307e = ScreenName.ID_INFO;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Modules f16308f = Modules.ID_OCR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f16310j = "MMM dd yyyy";

    public static /* synthetic */ Object c(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~i5;
        int i10 = ~(i8 | i9);
        int i11 = (~(i8 | i4)) | i10;
        int i12 = (~((~i4) | i8 | i5)) | (~(i9 | i6));
        int i13 = i6 + i5 + i3 + (531708263 * i2) + ((-608630064) * i7);
        int i14 = i13 * i13;
        int i15 = (i6 * (-228234701)) + 730857472 + ((-228234701) * i5) + (i10 * (-1010133554)) + (i11 * (-1010133554)) + ((-1010133554) * i12) + ((-1238368256) * i3) + ((-45088768) * i2) + ((-419430400) * i7) + ((-1471938560) * i14);
        int i16 = ((i6 * (-1679524527)) - 150938974) + (i5 * (-1679524527)) + (i10 * 282) + (i11 * 282) + (i12 * 282) + (i3 * (-1679524245)) + (i2 * (-166744051)) + (i7 * 2062148848) + (i14 * (-865337344));
        int i17 = i15 + (i16 * i16 * (-1617166336));
        if (i17 == 1) {
            return a(objArr);
        }
        if (i17 != 2) {
            return e(objArr);
        }
        boolean z2 = false;
        IdInfoActivity idInfoActivity = (IdInfoActivity) objArr[0];
        String str = (String) objArr[1];
        final Function1 function1 = (Function1) objArr[2];
        int i18 = 2 % 2;
        int i19 = f16301g + 73;
        f16302h = i19 % 128;
        int i20 = i19 % 2;
        final Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        if (!StringsKt.isBlank(str)) {
            int i21 = f16301g + 19;
            f16302h = i21 % 128;
            int i22 = i21 % 2;
            z2 = true;
        }
        if (z2) {
            calendar.setTimeInMillis(Long.parseLong(str));
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(idInfoActivity, new DatePickerDialog.OnDateSetListener() { // from class: com.incode.welcome_sdk.ui.id_info.IdInfoActivity$$ExternalSyntheticLambda4
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i23, int i24, int i25) {
                IdInfoActivity.b(calendar, function1, datePicker, i23, i24, i25);
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5));
        datePickerDialog.show();
        datePickerDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.incode.welcome_sdk.ui.id_info.IdInfoActivity$$ExternalSyntheticLambda5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                IdInfoActivity.d(dialogInterface);
            }
        });
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8499instrumented$0$safeOnCreate$LandroidosBundleV(IdInfoActivity idInfoActivity, n nVar, View view) {
        Callback.onClick_enter(view);
        try {
            e(idInfoActivity, nVar, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8500instrumented$1$safeOnCreate$LandroidosBundleV(IdInfoActivity idInfoActivity, n nVar, View view) {
        Callback.onClick_enter(view);
        try {
            c(idInfoActivity, nVar, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$2$safeOnCreate$-Landroid-os-Bundle--V, reason: not valid java name */
    public static /* synthetic */ void m8501instrumented$2$safeOnCreate$LandroidosBundleV(IdInfoActivity idInfoActivity, n nVar, View view) {
        Callback.onClick_enter(view);
        try {
            a(idInfoActivity, nVar, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        synchronized (C1553lQ.class) {
            String strKd = Qg.kd("+\u0018]\u001b~", (short) (FB.Xd() ^ ((1358267261 ^ 1873469802) ^ 1063203488)), (short) (FB.Xd() ^ (605116100 ^ 605115939)));
            String strVd = hg.Vd("\u001b\b", (short) (C1499aX.Xd() ^ (747328294 ^ (-747329989))), (short) (C1499aX.Xd() ^ ((340727195 ^ 209072635) ^ (-406402643))));
            try {
                Class<?> cls = Class.forName(strKd);
                Field field = 0 != 0 ? cls.getField(strVd) : cls.getDeclaredField(strVd);
                field.setAccessible(true);
                obj = field.get(null);
            } catch (Throwable th) {
                obj = null;
            }
            if (!((AtomicBoolean) obj).get()) {
                String strUd = C1561oA.ud("lY\u001f\\@", (short) (C1633zX.Xd() ^ (458911205 ^ (-458900641))));
                String strYd = C1561oA.yd(":(", (short) (FB.Xd() ^ (627258198 ^ 627250389)));
                try {
                    Class<?> cls2 = Class.forName(strUd);
                    Field field2 = 0 != 0 ? cls2.getField(strYd) : cls2.getDeclaredField(strYd);
                    field2.setAccessible(true);
                    obj2 = field2.get(null);
                } catch (Throwable th2) {
                    obj2 = null;
                }
                if (!((AtomicBoolean) obj2).get()) {
                    String strYd2 = C1561oA.Yd("%\u0014[\u001b\u0001", (short) (C1499aX.Xd() ^ ((1262222162 ^ 1933862169) ^ (-947884490))));
                    String strQd = Xg.qd("\u0002w", (short) (C1607wl.Xd() ^ ((218188618 ^ 1350862435) ^ 1569046537)), (short) (C1607wl.Xd() ^ (448252681 ^ 448252375)));
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
                        Method declaredMethod = Class.forName(Jg.Wd("}##E_", (short) (C1633zX.Xd() ^ (1821625687 ^ (-1821611244))), (short) (C1633zX.Xd() ^ (643011306 ^ (-643023091))))).getDeclaredMethod(ZO.xd("\u001a\u0017", (short) (OY.Xd() ^ (2004081758 ^ 2004083559)), (short) (OY.Xd() ^ ((197465272 ^ 1146991945) ^ 1335397963))), new Class[0]);
                        try {
                            declaredMethod.setAccessible(true);
                            Context context = (Context) declaredMethod.invoke(null, objArr);
                            if (context != null) {
                                Object[] objArr2 = {C1626yg.Ud("\u001e\u0006y\\rx", (short) (OY.Xd() ^ ((257584573 ^ 1260720367) ^ 1149174834)), (short) (OY.Xd() ^ ((1765294097 ^ 675247172) ^ 1090988079)))};
                                Method method = Class.forName(Ig.wd("1\u0014W=b\u0010?\u0010\u001bbcK\u000e\u001d\u000b&\u0007\u0019o\u001eT+T", (short) (C1499aX.Xd() ^ (2094295254 ^ (-2094300720))))).getMethod(C1561oA.Qd("\u0012\u000f\u001dz \u0019\u0019\t\u0010t\u0006\u0012\u0015\u0007\u007f\u0001", (short) (C1580rY.Xd() ^ (1530100701 ^ (-1530083331)))), Class.forName(EO.Od("b\u0007\u007fLz~\u001a8\u0005\u0019V_\rw\u001b{", (short) (OY.Xd() ^ (195085945 ^ 195071634)))));
                                try {
                                    method.setAccessible(true);
                                    WindowManager windowManager = (WindowManager) method.invoke(context, objArr2);
                                    String strZd = C1593ug.zd("`O\u0017V<", (short) (C1580rY.Xd() ^ ((905588498 ^ 1392244664) ^ (-1728182631))), (short) (C1580rY.Xd() ^ (1122690151 ^ (-1122667733))));
                                    String strOd = C1561oA.od("]Q", (short) (C1607wl.Xd() ^ (393694911 ^ 393696916)));
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
                    String strKd2 = C1561oA.Kd("|k3rX", (short) (Od.Xd() ^ ((1478834053 ^ 1698184967) ^ (-1025334637))));
                    short sXd = (short) (ZN.Xd() ^ (1275954096 ^ 1275955684));
                    short sXd2 = (short) (ZN.Xd() ^ ((1432899849 ^ 1661971289) ^ 912768571));
                    int[] iArr = new int["a\b".length()];
                    QB qb = new QB("a\b");
                    int i2 = 0;
                    while (qb.YK()) {
                        int iKK = qb.KK();
                        Xu xuXd = Xu.Xd(iKK);
                        iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                        i2++;
                    }
                    String str = new String(iArr, 0, i2);
                    try {
                        Class<?> cls5 = Class.forName(strKd2);
                        Field field5 = 0 != 0 ? cls5.getField(str) : cls5.getDeclaredField(str);
                        field5.setAccessible(true);
                        obj4 = field5.get(null);
                    } catch (Throwable th5) {
                        obj4 = null;
                    }
                    if (((WindowManager) obj4) != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        String strXd = C1561oA.Xd("&\u0015\\\u001c\u0002", (short) (ZN.Xd() ^ (86017016 ^ 86047777)));
                        String strVd2 = Wg.vd("si", (short) (C1607wl.Xd() ^ (176118380 ^ 176116983)));
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
                        int i3 = (903645187 ^ 1107337664) ^ 2010917256;
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

    public static final /* synthetic */ IdInfoModel access$getIdInfoModel$p(IdInfoActivity idInfoActivity) {
        int i2 = 2 % 2;
        int i3 = f16302h;
        int i4 = i3 + 35;
        f16301g = i4 % 128;
        int i5 = i4 % 2;
        IdInfoModel idInfoModel = idInfoActivity.f16309i;
        int i6 = i3 + 81;
        f16301g = i6 % 128;
        if (i6 % 2 != 0) {
            return idInfoModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ IncodeWelcomeRepository access$getRepo(IdInfoActivity idInfoActivity) {
        int i2 = 2 % 2;
        int i3 = f16301g + 99;
        f16302h = i3 % 128;
        if (i3 % 2 == 0) {
            return idInfoActivity.getRepo();
        }
        idInfoActivity.getRepo();
        throw null;
    }

    public static final /* synthetic */ String access$parseMillisecondsToDate(IdInfoActivity idInfoActivity, long j2) {
        int i2 = 2 % 2;
        int i3 = f16302h + 9;
        f16301g = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            idInfoActivity.b(j2);
            throw null;
        }
        String strB = idInfoActivity.b(j2);
        int i4 = f16302h + 97;
        f16301g = i4 % 128;
        if (i4 % 2 != 0) {
            return strB;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$setIdInfoModel$p(IdInfoActivity idInfoActivity, IdInfoModel idInfoModel) {
        int i2 = 2 % 2;
        int i3 = f16302h + 91;
        int i4 = i3 % 128;
        f16301g = i4;
        int i5 = i3 % 2;
        idInfoActivity.f16309i = idInfoModel;
        if (i5 == 0) {
            throw null;
        }
        int i6 = i4 + 49;
        f16302h = i6 % 128;
        int i7 = i6 % 2;
    }

    public static final /* synthetic */ void access$validateFields(IdInfoActivity idInfoActivity) {
        int i2 = 2 % 2;
        int i3 = f16301g + 79;
        f16302h = i3 % 128;
        int i4 = i3 % 2;
        idInfoActivity.g();
        if (i4 != 0) {
            throw null;
        }
    }

    static final class b extends Lambda implements Function0<IdInfoPresenter> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16317a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16318b = 0;

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ IdInfoPresenter invoke() {
            int i2 = 2 % 2;
            int i3 = f16318b + 43;
            f16317a = i3 % 128;
            int i4 = i3 % 2;
            IdInfoPresenter idInfoPresenterC = c();
            int i5 = f16318b + 71;
            f16317a = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 70 / 0;
            }
            return idInfoPresenterC;
        }

        private IdInfoPresenter c() {
            int i2 = 2 % 2;
            IdInfoActivity idInfoActivity = IdInfoActivity.this;
            IdInfoPresenter idInfoPresenter = new IdInfoPresenter(idInfoActivity, IdInfoActivity.access$getRepo(idInfoActivity));
            int i3 = f16317a + 7;
            f16318b = i3 % 128;
            if (i3 % 2 == 0) {
                return idInfoPresenter;
            }
            throw null;
        }

        b() {
            super(0);
        }
    }

    private final IdInfoPresenter e() {
        int i2 = 2 % 2;
        int i3 = f16301g + 71;
        f16302h = i3 % 128;
        int i4 = i3 % 2;
        IdInfoPresenter idInfoPresenter = (IdInfoPresenter) this.f16306d.getValue();
        int i5 = f16301g + 41;
        f16302h = i5 % 128;
        int i6 = i5 % 2;
        return idInfoPresenter;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f16301g;
        int i4 = i3 + 79;
        f16302h = i4 % 128;
        int i5 = i4 % 2;
        ScreenName screenName = this.f16307e;
        int i6 = i3 + 107;
        f16302h = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 36 / 0;
        }
        return screenName;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public final Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f16302h;
        int i4 = i3 + 63;
        f16301g = i4 % 128;
        int i5 = i4 % 2;
        Modules modules = this.f16308f;
        int i6 = i3 + 7;
        f16301g = i6 % 128;
        int i7 = i6 % 2;
        return modules;
    }

    private final boolean a() {
        int i2 = 2 % 2;
        int i3 = f16301g + 59;
        f16302h = i3 % 128;
        int i4 = i3 % 2;
        boolean booleanExtra = getIntent().getBooleanExtra("argEditableOcr", false);
        int i5 = f16302h + 3;
        f16301g = i5 % 128;
        if (i5 % 2 != 0) {
            return booleanExtra;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final boolean d() {
        int i2 = 2 % 2;
        Serializable serializableExtra = getIntent().getSerializableExtra("argIdCategory");
        Intrinsics.checkNotNull(serializableExtra, "");
        if (((IdCategory) serializableExtra) != IdCategory.SECOND) {
            return false;
        }
        int i3 = f16301g;
        int i4 = i3 + 31;
        f16302h = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 105;
        f16302h = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    private static final void e(IdInfoActivity idInfoActivity, n nVar, View view) throws Throwable {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(idInfoActivity, "");
        Intrinsics.checkNotNullParameter(nVar, "");
        if (!idInfoActivity.a()) {
            idInfoActivity.e().publishResult(new IdInfoResult(null, String.valueOf(nVar.f7280f.getText()), nVar.f7275a.getText().toString(), idInfoActivity.c(), String.valueOf(nVar.f7279e.getText()), String.valueOf(nVar.f7278d.getText()), nVar.f7277c.getText().toString(), 1, null));
            return;
        }
        int i3 = f16301g + 117;
        f16302h = i3 % 128;
        int i4 = i3 % 2;
        Object obj = (Long) c(CompareOcrException.e(), new Object[]{idInfoActivity, nVar.f7275a.getText().toString()}, CompareOcrException.e(), CompareOcrException.e(), 1244979970, -1244979970, CompareOcrException.e());
        if (obj == null) {
            obj = "";
        }
        String string = obj.toString();
        IncodeWelcomeRepository repo = idInfoActivity.getRepo();
        if (idInfoActivity.d()) {
            repo.setBirthDateSecondId(string);
        } else {
            repo.setBirthDate(string);
        }
        String strValueOf = String.valueOf(nVar.f7278d.getText());
        IncodeWelcomeRepository repo2 = idInfoActivity.getRepo();
        if (idInfoActivity.d()) {
            int i5 = f16301g + 49;
            f16302h = i5 % 128;
            int i6 = i5 % 2;
            repo2.setDocumentNumberSecondId(strValueOf);
        } else {
            repo2.setDocumentNumber(strValueOf);
        }
        Object obj2 = (Long) c(CompareOcrException.e(), new Object[]{idInfoActivity, nVar.f7277c.getText().toString()}, CompareOcrException.e(), CompareOcrException.e(), 1244979970, -1244979970, CompareOcrException.e());
        if (obj2 == null) {
            obj2 = "";
        }
        String string2 = obj2.toString();
        IncodeWelcomeRepository repo3 = idInfoActivity.getRepo();
        if (idInfoActivity.d()) {
            int i7 = f16302h + 3;
            f16301g = i7 % 128;
            if (i7 % 2 == 0) {
                repo3.setExpireAtSecondId(string2);
                throw null;
            }
            repo3.setExpireAtSecondId(string2);
        } else {
            repo3.setExpireAt(string2);
            int i8 = f16301g + 1;
            f16302h = i8 % 128;
            int i9 = i8 % 2;
        }
        IdInfoPresenter idInfoPresenterE = idInfoActivity.e();
        IdInfoModel idInfoModel = idInfoActivity.f16309i;
        if (idInfoModel == null) {
            int i10 = f16301g + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f16302h = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i12 = f16302h + 95;
            f16301g = i12 % 128;
            int i13 = i12 % 2;
            idInfoModel = null;
        }
        idInfoPresenterE.addOcrData(idInfoModel.copy(String.valueOf(nVar.f7280f.getText()), string, idInfoActivity.c(), String.valueOf(nVar.f7279e.getText()), strValueOf, string2), idInfoActivity.d());
    }

    static final class d extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16323b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16324d = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ IdInfoActivity f16325c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ n f16326e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f16324d + 17;
            f16323b = i3 % 128;
            int i4 = i3 % 2;
            d(l2.longValue());
            Unit unit = Unit.INSTANCE;
            int i5 = f16323b + 39;
            f16324d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 22 / 0;
            }
            return unit;
        }

        private void d(long j2) {
            int i2 = 2 % 2;
            int i3 = f16323b + 13;
            f16324d = i3 % 128;
            int i4 = i3 % 2;
            this.f16326e.f7275a.setText(IdInfoActivity.access$parseMillisecondsToDate(this.f16325c, j2));
            IdInfoActivity idInfoActivity = this.f16325c;
            IdInfoModel idInfoModelAccess$getIdInfoModel$p = IdInfoActivity.access$getIdInfoModel$p(idInfoActivity);
            if (idInfoModelAccess$getIdInfoModel$p == null) {
                int i5 = f16323b + 103;
                f16324d = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                idInfoModelAccess$getIdInfoModel$p = null;
            }
            IdInfoActivity.access$setIdInfoModel$p(idInfoActivity, IdInfoModel.copy$default(idInfoModelAccess$getIdInfoModel$p, null, String.valueOf(j2), null, null, null, null, 61, null));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n nVar, IdInfoActivity idInfoActivity) {
            super(1);
            this.f16326e = nVar;
            this.f16325c = idInfoActivity;
        }
    }

    private static /* synthetic */ Object a(Object[] objArr) {
        IdInfoActivity idInfoActivity = (IdInfoActivity) objArr[0];
        n nVar = (n) objArr[1];
        int i2 = 2 % 2;
        int i3 = f16301g + 29;
        f16302h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(idInfoActivity, "");
        Intrinsics.checkNotNullParameter(nVar, "");
        IdInfoModel idInfoModel = idInfoActivity.f16309i;
        if (idInfoModel == null) {
            int i5 = f16302h + 45;
            f16301g = i5 % 128;
            if (i5 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i6 = f16302h + 121;
            f16301g = i6 % 128;
            int i7 = i6 % 2;
            idInfoModel = null;
        }
        c(CompareOcrException.e(), new Object[]{idInfoActivity, idInfoModel.getDateOfBirth(), new d(nVar, idInfoActivity)}, CompareOcrException.e(), CompareOcrException.e(), -846526039, 846526041, CompareOcrException.e());
        return null;
    }

    static final class a extends Lambda implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f16313b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16314c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ IdInfoActivity f16315a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ n f16316e;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Long l2) {
            int i2 = 2 % 2;
            int i3 = f16313b + 59;
            f16314c = i3 % 128;
            Long l3 = l2;
            if (i3 % 2 != 0) {
                b(l3.longValue());
                return Unit.INSTANCE;
            }
            b(l3.longValue());
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        private void b(long j2) {
            int i2 = 2 % 2;
            int i3 = f16314c + 5;
            f16313b = i3 % 128;
            int i4 = i3 % 2;
            this.f16316e.f7277c.setText(IdInfoActivity.access$parseMillisecondsToDate(this.f16315a, j2));
            IdInfoActivity idInfoActivity = this.f16315a;
            IdInfoModel idInfoModelAccess$getIdInfoModel$p = IdInfoActivity.access$getIdInfoModel$p(idInfoActivity);
            if (idInfoModelAccess$getIdInfoModel$p == null) {
                int i5 = f16314c + 59;
                f16313b = i5 % 128;
                if (i5 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i6 = 18 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                idInfoModelAccess$getIdInfoModel$p = null;
            }
            IdInfoActivity.access$setIdInfoModel$p(idInfoActivity, IdInfoModel.copy$default(idInfoModelAccess$getIdInfoModel$p, null, null, null, null, null, String.valueOf(j2), 31, null));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n nVar, IdInfoActivity idInfoActivity) {
            super(1);
            this.f16316e = nVar;
            this.f16315a = idInfoActivity;
        }
    }

    private static final void a(IdInfoActivity idInfoActivity, n nVar, View view) {
        int i2 = 2 % 2;
        int i3 = f16301g + 35;
        f16302h = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(idInfoActivity, "");
        Intrinsics.checkNotNullParameter(nVar, "");
        IdInfoModel idInfoModel = idInfoActivity.f16309i;
        if (idInfoModel == null) {
            int i5 = f16301g + 13;
            f16302h = i5 % 128;
            idInfoModel = null;
            if (i5 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                idInfoModel.hashCode();
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        Object[] objArr = {idInfoActivity, idInfoModel.getExpiryDate(), new a(nVar, idInfoActivity)};
        int iE = CompareOcrException.e();
        c(CompareOcrException.e(), objArr, CompareOcrException.e(), iE, -846526039, 846526041, CompareOcrException.e());
        int i6 = f16302h + 43;
        f16301g = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void safeOnCreate(Bundle bundle) {
        Parcelable parcelable;
        int i2 = 2 % 2;
        super.safeOnCreate(bundle);
        n nVarA = n.a(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(nVarA, "");
        this.f16305c = nVarA;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "");
        IdInfoModel idInfoModel = null;
        if (Build.VERSION.SDK_INT >= 33) {
            int i3 = f16301g + 83;
            f16302h = i3 % 128;
            int i4 = i3 % 2;
            parcelable = (Parcelable) intent.getParcelableExtra("argIdInfoModel", IdInfoModel.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("argIdInfoModel");
            if (!(parcelableExtra instanceof IdInfoModel)) {
                int i5 = f16301g + 37;
                f16302h = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                parcelableExtra = null;
            }
            parcelable = (IdInfoModel) parcelableExtra;
        }
        IdInfoModel idInfoModel2 = (IdInfoModel) parcelable;
        if (idInfoModel2 == null) {
            idInfoModel2 = new IdInfoModel("", "", "", "", "", "");
        }
        this.f16309i = idInfoModel2;
        final n nVar = this.f16305c;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            nVar = null;
        }
        setContentView(nVar.b());
        IncodeEditText incodeEditText = nVar.f7278d;
        InputFilter[] filters = incodeEditText.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "");
        incodeEditText.setFilters((InputFilter[]) ArraysKt.plus((InputFilter.AllCaps[]) filters, new InputFilter.AllCaps()));
        nVar.f7276b.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.id_info.IdInfoActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IdInfoActivity.m8499instrumented$0$safeOnCreate$LandroidosBundleV(this.f$0, nVar, view);
            }
        });
        nVar.f7275a.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.id_info.IdInfoActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IdInfoActivity.m8500instrumented$1$safeOnCreate$LandroidosBundleV(this.f$0, nVar, view);
            }
        });
        nVar.f7277c.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.id_info.IdInfoActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IdInfoActivity.m8501instrumented$2$safeOnCreate$LandroidosBundleV(this.f$0, nVar, view);
            }
        });
        IdInfoModel idInfoModel3 = this.f16309i;
        if (idInfoModel3 == null) {
            int i6 = f16302h + 71;
            f16301g = i6 % 128;
            int i7 = i6 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i8 = f16301g + 93;
            f16302h = i8 % 128;
            int i9 = i8 % 2;
        } else {
            idInfoModel = idInfoModel3;
        }
        e(idInfoModel);
        if (!a()) {
            j();
            return;
        }
        int i10 = f16301g + 33;
        f16302h = i10 % 128;
        int i11 = i10 % 2;
        g();
        b();
    }

    @Override // com.incode.welcome_sdk.ui.BaseActivity
    public final void publishUserCancelled() {
        int i2 = 2 % 2;
        super.publishUserCancelled();
        e().publishResult(new IdInfoResult(ResultCode.USER_CANCELLED, null, null, null, null, null, null, 126, null));
        int i3 = f16301g + 29;
        f16302h = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(com.incode.welcome_sdk.ui.id_info.IdInfoModel r11) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_info.IdInfoActivity.e(com.incode.welcome_sdk.ui.id_info.IdInfoModel):void");
    }

    private final String c() {
        int i2 = 2 % 2;
        n nVar = this.f16305c;
        Object obj = null;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i3 = f16302h + 67;
            f16301g = i3 % 128;
            int i4 = i3 % 2;
            nVar = null;
        }
        if (nVar.f7281g.isChecked()) {
            return j.f8603d.c();
        }
        if (!nVar.f7284j.isChecked()) {
            return "";
        }
        int i5 = f16302h + 13;
        f16301g = i5 % 128;
        int i6 = i5 % 2;
        String strC = j.f8602b.c();
        int i7 = f16302h + 7;
        f16301g = i7 % 128;
        if (i7 % 2 != 0) {
            return strC;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Calendar calendar, Function1 function1, DatePicker datePicker, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = f16301g + 113;
        f16302h = i6 % 128;
        int i7 = i6 % 2;
        Intrinsics.checkNotNullParameter(function1, "");
        calendar.set(1, i2);
        calendar.set(2, i3);
        calendar.set(5, i4);
        function1.invoke(Long.valueOf(calendar.getTimeInMillis()));
        int i8 = f16301g + 55;
        f16302h = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(DialogInterface dialogInterface) {
        int i2 = 2 % 2;
        int i3 = f16301g + 73;
        f16302h = i3 % 128;
        int i4 = i3 % 2;
        dialogInterface.dismiss();
        int i5 = f16301g + 5;
        f16302h = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 44 / 0;
        }
    }

    static final class c extends Lambda implements Function1<EditText, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f16320a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f16321e = 0;

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(EditText editText) {
            int i2 = 2 % 2;
            int i3 = f16320a + 87;
            f16321e = i3 % 128;
            int i4 = i3 % 2;
            e(editText);
            Unit unit = Unit.INSTANCE;
            int i5 = f16321e + 55;
            f16320a = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        private void e(EditText editText) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(editText, "");
            final IdInfoActivity idInfoActivity = IdInfoActivity.this;
            editText.addTextChangedListener(new TextWatcher() { // from class: com.incode.welcome_sdk.ui.id_info.IdInfoActivity$setValidationListeners$1$validateAfterText$1$invoke$$inlined$doAfterTextChanged$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private static int f16327a = 0;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private static int f16328c = 1;

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    int i3 = 2 % 2;
                    int i4 = f16328c + 87;
                    f16327a = i4 % 128;
                    if (i4 % 2 == 0) {
                        IdInfoActivity.access$validateFields(idInfoActivity);
                        int i5 = f16327a + 49;
                        f16328c = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 45 / 0;
                            return;
                        }
                        return;
                    }
                    IdInfoActivity.access$validateFields(idInfoActivity);
                    throw null;
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                    int i6 = 2 % 2;
                    int i7 = f16327a + 7;
                    f16328c = i7 % 128;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                    int i6 = 2 % 2;
                    int i7 = f16328c + 117;
                    f16327a = i7 % 128;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                }
            });
            int i3 = f16321e + 23;
            f16320a = i3 % 128;
            int i4 = i3 % 2;
        }

        c() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(IdInfoActivity idInfoActivity, RadioGroup radioGroup, int i2) {
        int i3 = 2 % 2;
        int i4 = f16301g + 105;
        f16302h = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(idInfoActivity, "");
        idInfoActivity.g();
        int i6 = f16302h + 37;
        f16301g = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void b() {
        int i2 = 2 % 2;
        n nVar = this.f16305c;
        if (nVar == null) {
            int i3 = f16301g + 125;
            f16302h = i3 % 128;
            nVar = null;
            if (i3 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                throw null;
            }
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c cVar = new c();
        IncodeEditText incodeEditText = nVar.f7280f;
        Intrinsics.checkNotNullExpressionValue(incodeEditText, "");
        cVar.invoke(incodeEditText);
        IncodeEditText incodeEditText2 = nVar.f7279e;
        Intrinsics.checkNotNullExpressionValue(incodeEditText2, "");
        cVar.invoke(incodeEditText2);
        IncodeEditText incodeEditText3 = nVar.f7278d;
        Intrinsics.checkNotNullExpressionValue(incodeEditText3, "");
        cVar.invoke(incodeEditText3);
        IncodeTextView incodeTextView = nVar.f7275a;
        Intrinsics.checkNotNullExpressionValue(incodeTextView, "");
        incodeTextView.addTextChangedListener(new TextWatcher() { // from class: com.incode.welcome_sdk.ui.id_info.IdInfoActivity$setValidationListeners$lambda$23$$inlined$doOnTextChanged$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f16330b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f16331c = 1;

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                int i4 = 2 % 2;
                int i5 = f16330b + 25;
                f16331c = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                int i7 = 2 % 2;
                int i8 = f16330b + 61;
                f16331c = i8 % 128;
                int i9 = i8 % 2;
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                int i7 = 2 % 2;
                int i8 = f16331c + 43;
                f16330b = i8 % 128;
                int i9 = i8 % 2;
                IdInfoActivity.access$validateFields(this.f16332a);
                int i10 = f16331c + 47;
                f16330b = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
            }
        });
        IncodeTextView incodeTextView2 = nVar.f7277c;
        Intrinsics.checkNotNullExpressionValue(incodeTextView2, "");
        incodeTextView2.addTextChangedListener(new TextWatcher() { // from class: com.incode.welcome_sdk.ui.id_info.IdInfoActivity$setValidationListeners$lambda$23$$inlined$doOnTextChanged$2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f16333b = 1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static int f16334c = 0;

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                int i4 = 2 % 2;
                int i5 = f16333b + 93;
                f16334c = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                int i7 = 2 % 2;
                int i8 = f16333b + 123;
                f16334c = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 53 / 0;
                }
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                int i7 = 2 % 2;
                int i8 = f16334c + 61;
                f16333b = i8 % 128;
                if (i8 % 2 != 0) {
                    IdInfoActivity.access$validateFields(this.f16335a);
                    int i9 = f16333b + 13;
                    f16334c = i9 % 128;
                    int i10 = i9 % 2;
                    return;
                }
                IdInfoActivity.access$validateFields(this.f16335a);
                throw null;
            }
        });
        nVar.f7282h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.incode.welcome_sdk.ui.id_info.IdInfoActivity$$ExternalSyntheticLambda3
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i4) {
                IdInfoActivity.c(this.f$0, radioGroup, i4);
            }
        });
        int i4 = f16301g + 87;
        f16302h = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g() {
        /*
            r9 = this;
            r8 = 2
            int r0 = r8 % r8
            int r2 = com.incode.welcome_sdk.ui.id_info.IdInfoActivity.f16301g
            int r1 = r2 + 39
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_info.IdInfoActivity.f16302h = r0
            int r1 = r1 % r8
            com.incode.welcome_sdk.d.n r5 = r9.f16305c
            r3 = 0
            r7 = 0
            java.lang.String r4 = ""
            if (r5 != 0) goto L24
            int r1 = r2 + 117
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_info.IdInfoActivity.f16302h = r0
            int r1 = r1 % r8
            if (r1 == 0) goto Lb4
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r0 = 49
            int r0 = r0 / r3
        L23:
            r5 = r7
        L24:
            android.widget.RadioButton r0 = r5.f7281g
            boolean r0 = r0.isChecked()
            r6 = 1
            if (r0 != 0) goto L3e
            int r0 = com.incode.welcome_sdk.ui.id_info.IdInfoActivity.f16301g
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_info.IdInfoActivity.f16302h = r0
            int r1 = r1 % r8
            android.widget.RadioButton r0 = r5.f7284j
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto Lb2
        L3e:
            r0 = r6
        L3f:
            com.incode.welcome_sdk.views.IncodeButton r2 = r5.f7276b
            if (r0 == 0) goto La4
            com.incode.welcome_sdk.views.IncodeEditText r0 = r5.f7280f
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            android.widget.EditText r0 = (android.widget.EditText) r0
            boolean r0 = com.incode.welcome_sdk.commons.extensions.f.d(r0)
            if (r0 == 0) goto La4
            int r0 = com.incode.welcome_sdk.ui.id_info.IdInfoActivity.f16302h
            int r1 = r0 + 33
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_info.IdInfoActivity.f16301g = r0
            int r1 = r1 % r8
            if (r1 == 0) goto Lb9
            com.incode.welcome_sdk.views.IncodeEditText r0 = r5.f7279e
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            android.widget.EditText r0 = (android.widget.EditText) r0
            boolean r0 = com.incode.welcome_sdk.commons.extensions.f.d(r0)
            if (r0 == 0) goto La4
            com.incode.welcome_sdk.views.IncodeTextView r0 = r5.f7275a
            java.lang.CharSequence r0 = r0.getText()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            int r0 = r0.length()
            if (r0 <= 0) goto La8
            com.incode.welcome_sdk.views.IncodeEditText r0 = r5.f7278d
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            android.widget.EditText r0 = (android.widget.EditText) r0
            boolean r0 = com.incode.welcome_sdk.commons.extensions.f.d(r0)
            if (r0 == 0) goto La4
            com.incode.welcome_sdk.views.IncodeTextView r0 = r5.f7277c
            java.lang.CharSequence r0 = r0.getText()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            int r0 = r0.length()
            if (r0 <= 0) goto La4
            int r0 = com.incode.welcome_sdk.ui.id_info.IdInfoActivity.f16302h
            int r1 = r0 + 67
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_info.IdInfoActivity.f16301g = r0
            int r1 = r1 % r8
            int r1 = r0 + 43
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_info.IdInfoActivity.f16302h = r0
            int r1 = r1 % r8
            r3 = r6
        La4:
            r2.setEnabled(r3)
            return
        La8:
            int r0 = com.incode.welcome_sdk.ui.id_info.IdInfoActivity.f16302h
            int r1 = r0 + 49
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.id_info.IdInfoActivity.f16301g = r0
            int r1 = r1 % r8
            goto La4
        Lb2:
            r0 = r3
            goto L3f
        Lb4:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            goto L23
        Lb9:
            com.incode.welcome_sdk.views.IncodeEditText r0 = r5.f7279e
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            android.widget.EditText r0 = (android.widget.EditText) r0
            com.incode.welcome_sdk.commons.extensions.f.d(r0)
            r7.hashCode()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.id_info.IdInfoActivity.g():void");
    }

    private final void j() {
        int i2 = 2 % 2;
        int i3 = f16302h + 23;
        f16301g = i3 % 128;
        int i4 = i3 % 2;
        n nVar = this.f16305c;
        if (nVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i5 = f16301g + 25;
            f16302h = i5 % 128;
            int i6 = i5 % 2;
            nVar = null;
        }
        nVar.f7278d.setEnabled(false);
        nVar.f7280f.setEnabled(false);
        nVar.f7279e.setEnabled(false);
        nVar.f7275a.setEnabled(false);
        nVar.f7281g.setEnabled(false);
        nVar.f7284j.setEnabled(false);
        nVar.f7277c.setEnabled(false);
    }

    @Override // com.incode.welcome_sdk.ui.id_info.IdInfoContract.View
    public final void showError() {
        int i2 = 2 % 2;
        int i3 = f16302h + 85;
        f16301g = i3 % 128;
        int i4 = i3 % 2;
        Toast.makeText(this, R.string.onboard_sdk_id_info_error_message, 1).show();
        int i5 = f16301g + 93;
        f16302h = i5 % 128;
        int i6 = i5 % 2;
    }

    private final String b(long j2) {
        int i2 = 2 % 2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.f16310j, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j2));
        Intrinsics.checkNotNullExpressionValue(str, "");
        int i3 = f16302h + 107;
        f16301g = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 61 / 0;
        }
        return str;
    }

    private static /* synthetic */ Object e(Object[] objArr) throws ParseException {
        IdInfoActivity idInfoActivity = (IdInfoActivity) objArr[0];
        String str = (String) objArr[1];
        int i2 = 2 % 2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(idInfoActivity.f16310j, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = simpleDateFormat.parse(str);
        if (date == null) {
            int i3 = f16301g + 57;
            f16302h = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 94 / 0;
            }
            return null;
        }
        Long lValueOf = Long.valueOf(date.getTime());
        int i5 = f16302h + 43;
        f16301g = i5 % 128;
        if (i5 % 2 != 0) {
            return lValueOf;
        }
        throw null;
    }

    public static final class Companion {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f16311c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f16312d = 1;

        private Companion() {
        }

        @JvmStatic
        public final void start(Context context, IdInfoModel idInfoModel, boolean z2, IdCategory idCategory) {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(idInfoModel, "");
            Intrinsics.checkNotNullParameter(idCategory, "");
            Intent intent = new Intent(context, (Class<?>) IdInfoActivity.class);
            intent.putExtra("argIdInfoModel", idInfoModel);
            intent.putExtra("argEditableOcr", z2);
            intent.putExtra("argIdCategory", idCategory);
            CX.ud();
            context.startActivity(intent);
            int i3 = f16311c + 123;
            f16312d = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i2 = f16303m + 109;
        f16304o = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 65 / 0;
        }
    }

    @JvmStatic
    public static final void start(Context context, IdInfoModel idInfoModel, boolean z2, IdCategory idCategory) {
        int i2 = 2 % 2;
        int i3 = f16301g + 43;
        f16302h = i3 % 128;
        if (i3 % 2 != 0) {
            f16300b.start(context, idInfoModel, z2, idCategory);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        f16300b.start(context, idInfoModel, z2, idCategory);
        int i4 = f16301g + 53;
        f16302h = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void c(IdInfoActivity idInfoActivity, n nVar, View view) {
        int iE = CompareOcrException.e();
        int iE2 = CompareOcrException.e();
        c(CompareOcrException.e(), new Object[]{idInfoActivity, nVar, view}, iE2, iE, 1103460271, -1103460270, CompareOcrException.e());
    }

    private final Long a(String str) {
        int iE = CompareOcrException.e();
        int iE2 = CompareOcrException.e();
        return (Long) c(CompareOcrException.e(), new Object[]{this, str}, iE2, iE, 1244979970, -1244979970, CompareOcrException.e());
    }

    private final void a(String str, Function1<? super Long, Unit> function1) {
        int iE = CompareOcrException.e();
        int iE2 = CompareOcrException.e();
        c(CompareOcrException.e(), new Object[]{this, str, function1}, iE2, iE, -846526039, 846526041, CompareOcrException.e());
    }
}
