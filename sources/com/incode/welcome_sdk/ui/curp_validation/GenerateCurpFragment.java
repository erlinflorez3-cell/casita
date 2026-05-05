package com.incode.welcome_sdk.ui.curp_validation;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.SpinnerAdapter;
import androidx.core.widget.TextViewKt;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.ScreenName;
import com.incode.welcome_sdk.commons.extensions.ViewExtensionsKt;
import com.incode.welcome_sdk.commons.ui.FragmentWithListener;
import com.incode.welcome_sdk.commons.ui.adapter.FormAdapter;
import com.incode.welcome_sdk.commons.utils.EventUtils;
import com.incode.welcome_sdk.commons.utils.StringUtils;
import com.incode.welcome_sdk.d.at;
import com.incode.welcome_sdk.modules.Modules;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

/* JADX INFO: loaded from: classes5.dex */
public class GenerateCurpFragment extends FragmentWithListener<GenerateCurpFragmentInterface> implements DatePickerDialog.OnDateSetListener {

    /* JADX INFO: renamed from: f */
    private static int f13131f = 0;

    /* JADX INFO: renamed from: i */
    private static int f13132i = 1;

    /* JADX INFO: renamed from: a */
    private final Calendar f13133a = Calendar.getInstance();

    /* JADX INFO: renamed from: b */
    private String f13134b;

    /* JADX INFO: renamed from: c */
    private String f13135c;

    /* JADX INFO: renamed from: d */
    private int f13136d;

    /* JADX INFO: renamed from: e */
    private String f13137e;

    /* JADX INFO: renamed from: g */
    private at f13138g;

    /* JADX INFO: renamed from: h */
    private String f13139h;

    /* JADX INFO: renamed from: j */
    private int f13140j;

    public interface GenerateCurpFragmentInterface {
        void generateCurp_onContinue(String str, String str2, String str3, int i2, String str4, int i3);
    }

    /* JADX INFO: renamed from: instrumented$0$b$--V */
    public static /* synthetic */ void m8433instrumented$0$b$V(GenerateCurpFragment generateCurpFragment, View view) {
        Callback.onClick_enter(view);
        try {
            generateCurpFragment.a(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: renamed from: instrumented$1$b$--V */
    public static /* synthetic */ void m8434instrumented$1$b$V(GenerateCurpFragment generateCurpFragment, View view) {
        Callback.onClick_enter(view);
        try {
            generateCurpFragment.c(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public ScreenName getScreenName() {
        int i2 = 2 % 2;
        int i3 = f13132i + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f13131f = i3 % 128;
        if (i3 % 2 != 0) {
            ScreenName screenName = ScreenName.GENERATE_CURP;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ScreenName screenName2 = ScreenName.GENERATE_CURP;
        int i4 = f13132i + 65;
        f13131f = i4 % 128;
        int i5 = i4 % 2;
        return screenName2;
    }

    @Override // com.incode.welcome_sdk.ui.BaseView
    public Modules getModule() {
        int i2 = 2 % 2;
        int i3 = f13131f + 89;
        f13132i = i3 % 128;
        int i4 = i3 % 2;
        Modules modules = Modules.CURP_VALIDATION;
        int i5 = f13131f + 113;
        f13132i = i5 % 128;
        if (i5 % 2 != 0) {
            return modules;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static GenerateCurpFragment newInstance() {
        int i2 = 2 % 2;
        GenerateCurpFragment generateCurpFragment = new GenerateCurpFragment();
        int i3 = f13131f + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f13132i = i3 % 128;
        if (i3 % 2 != 0) {
            return generateCurpFragment;
        }
        throw null;
    }

    public static GenerateCurpFragment newInstance(String str, String str2, String str3, int i2, String str4, int i3) {
        int i4 = 2 % 2;
        GenerateCurpFragment generateCurpFragment = new GenerateCurpFragment();
        Bundle bundle = new Bundle();
        bundle.putString("argName", str);
        bundle.putString("argFirstLastName", str2);
        bundle.putString("argSecondLastName", str3);
        bundle.putInt("argGender", i2);
        bundle.putString("argBirthDate", str4);
        bundle.putInt("argState", i3);
        generateCurpFragment.setArguments(bundle);
        int i5 = f13132i + 29;
        f13131f = i5 % 128;
        int i6 = i5 % 2;
        return generateCurpFragment;
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment
    public int getSoftInputMode() {
        int i2 = 2 % 2;
        int i3 = f13132i + 63;
        int i4 = i3 % 128;
        f13131f = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 81;
        f13132i = i6 % 128;
        int i7 = i6 % 2;
        return 16;
    }

    @Override // com.incode.welcome_sdk.ui.BaseFragment
    public void safeOnCreate(Bundle bundle) {
        int i2 = 2 % 2;
        int i3 = f13131f + 3;
        f13132i = i3 % 128;
        if (i3 % 2 != 0) {
            super.safeOnCreate(bundle);
            if (getArguments() != null) {
                int i4 = f13132i + 51;
                f13131f = i4 % 128;
                int i5 = i4 % 2;
                this.f13137e = getArguments().getString("argName");
                this.f13135c = getArguments().getString("argFirstLastName");
                this.f13134b = getArguments().getString("argSecondLastName");
                this.f13136d = getArguments().getInt("argGender");
                this.f13139h = getArguments().getString("argBirthDate");
                this.f13140j = getArguments().getInt("argState");
            }
            int i6 = f13131f + 19;
            f13132i = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        super.safeOnCreate(bundle);
        getArguments();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = 2 % 2;
        this.f13138g = at.d(layoutInflater, viewGroup);
        EventUtils.sendScreenOpened(getRepo(), getScreenName(), getModule());
        Object obj = null;
        if (this.f13137e != null) {
            int i3 = f13131f + 5;
            f13132i = i3 % 128;
            if (i3 % 2 == 0) {
                this.f13138g.f6949c.setText(this.f13137e);
                obj.hashCode();
                throw null;
            }
            this.f13138g.f6949c.setText(this.f13137e);
            int i4 = f13131f + 47;
            f13132i = i4 % 128;
            int i5 = i4 % 2;
        }
        if (this.f13135c != null) {
            int i6 = f13131f + 105;
            f13132i = i6 % 128;
            int i7 = i6 % 2;
            this.f13138g.f6947a.setText(this.f13135c);
        }
        if (this.f13134b != null) {
            this.f13138g.f6953g.setText(this.f13134b);
        }
        this.f13138g.f6948b.setAdapter((SpinnerAdapter) new FormAdapter(getContext(), getResources().getStringArray(R.array.onboard_sdk_genders), getString(R.string.onboard_sdk_curp_gender)));
        if (this.f13136d != 0) {
            int i8 = f13132i + 45;
            f13131f = i8 % 128;
            if (i8 % 2 != 0) {
                this.f13138g.f6948b.setSelection(this.f13136d);
                throw null;
            }
            this.f13138g.f6948b.setSelection(this.f13136d);
        }
        if (this.f13139h != null) {
            try {
                this.f13133a.setTime(new SimpleDateFormat("dd/MM/yyyy", Locale.US).parse(this.f13139h));
                this.f13138g.f6955i.setText(new SimpleDateFormat("dd / MMM / yyyy", Locale.US).format(this.f13133a.getTime()));
            } catch (ParseException e2) {
                e2.printStackTrace();
            }
        }
        this.f13138g.f6951e.setAdapter((SpinnerAdapter) new FormAdapter(getContext(), getResources().getStringArray(R.array.onboard_sdk_mexico_states), getString(R.string.onboard_sdk_curp_state)));
        if (this.f13140j != 0) {
            this.f13138g.f6951e.setSelection(this.f13140j);
        }
        b();
        g();
        j();
        return this.f13138g.a();
    }

    private void c() {
        int i2 = 2 % 2;
        new DatePickerDialog(getContext(), this, this.f13133a.get(1), this.f13133a.get(2), this.f13133a.get(5)).show();
        int i3 = f13131f + 39;
        f13132i = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        this.f13133a.set(1, i2);
        this.f13133a.set(2, i3);
        this.f13133a.set(5, i4);
        this.f13138g.f6955i.setText(new SimpleDateFormat("dd / MMM / yyyy", Locale.US).format(this.f13133a.getTime()));
        d();
        int i6 = f13131f + 81;
        f13132i = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 46 / 0;
        }
    }

    void d() {
        int i2 = 2 % 2;
        int i3 = f13132i + 61;
        f13131f = i3 % 128;
        if (i3 % 2 == 0) {
            boolean zIsEnabled = this.f13138g.f6950d.isEnabled();
            boolean zA = a();
            if (zIsEnabled != zA) {
                this.f13138g.f6950d.setEnabled(zA);
            }
            int i4 = f13131f + 85;
            f13132i = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        this.f13138g.f6950d.isEnabled();
        a();
        throw null;
    }

    private boolean a() {
        int i2 = 2 % 2;
        if (!StringUtils.isBlank(this.f13138g.f6949c.getText().toString())) {
            if (!StringUtils.isBlank(this.f13138g.f6947a.getText().toString())) {
                if (this.f13138g.f6948b.getSelectedItemPosition() == 0) {
                    return false;
                }
                if (StringUtils.isBlank(this.f13138g.f6955i.getText().toString())) {
                    int i3 = f13132i + 19;
                    f13131f = i3 % 128;
                    int i4 = i3 % 2;
                    return false;
                }
                if (this.f13138g.f6951e.getSelectedItemPosition() != 0) {
                    return true;
                }
            } else {
                int i5 = f13132i + 11;
                f13131f = i5 % 128;
                return i5 % 2 != 0;
            }
        }
        return false;
    }

    private void e() {
        int i2 = 2 % 2;
        ViewExtensionsKt.preventDoubleClick(this.f13138g.f6950d);
        EventUtils.sendScreenClosed(getRepo(), getScreenName(), getModule());
        getListener().generateCurp_onContinue(this.f13138g.f6949c.getText().toString().trim(), this.f13138g.f6947a.getText().toString().trim(), this.f13138g.f6953g.getText().toString().trim(), this.f13138g.f6948b.getSelectedItemPosition(), new SimpleDateFormat("dd/MM/yyyy", Locale.US).format(this.f13133a.getTime()), this.f13138g.f6951e.getSelectedItemPosition());
        int i3 = f13131f + 75;
        f13132i = i3 % 128;
        int i4 = i3 % 2;
    }

    private /* synthetic */ void a(View view) {
        int i2 = 2 % 2;
        int i3 = f13131f + 67;
        f13132i = i3 % 128;
        int i4 = i3 % 2;
        e();
        int i5 = f13132i + 37;
        f13131f = i5 % 128;
        int i6 = i5 % 2;
    }

    private /* synthetic */ void c(View view) {
        int i2 = 2 % 2;
        int i3 = f13131f + 11;
        f13132i = i3 % 128;
        int i4 = i3 % 2;
        c();
        if (i4 == 0) {
            throw null;
        }
        int i5 = f13132i + 91;
        f13131f = i5 % 128;
        int i6 = i5 % 2;
    }

    private void b() {
        int i2 = 2 % 2;
        int i3 = f13132i + 57;
        f13131f = i3 % 128;
        int i4 = i3 % 2;
        this.f13138g.f6950d.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.curp_validation.GenerateCurpFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GenerateCurpFragment.m8433instrumented$0$b$V(this.f$0, view);
            }
        });
        this.f13138g.f6955i.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.curp_validation.GenerateCurpFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GenerateCurpFragment.m8434instrumented$1$b$V(this.f$0, view);
            }
        });
        int i5 = f13131f + 63;
        f13132i = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
    }

    public /* synthetic */ Unit d(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
        int i2 = 2 % 2;
        int i3 = f13132i + 95;
        f13131f = i3 % 128;
        int i4 = i3 % 2;
        d();
        Unit unit = Unit.INSTANCE;
        int i5 = f13131f + 75;
        f13132i = i5 % 128;
        int i6 = i5 % 2;
        return unit;
    }

    private void g() {
        int i2 = 2 % 2;
        int i3 = f13132i + 115;
        f13131f = i3 % 128;
        if (i3 % 2 == 0) {
            Function4 function4 = new Function4() { // from class: com.incode.welcome_sdk.ui.curp_validation.GenerateCurpFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return this.f$0.d((CharSequence) obj, (Integer) obj2, (Integer) obj3, (Integer) obj4);
                }
            };
            TextViewKt.doOnTextChanged(this.f13138g.f6949c, function4);
            TextViewKt.doOnTextChanged(this.f13138g.f6947a, function4);
            TextViewKt.doOnTextChanged(this.f13138g.f6953g, function4);
            int i4 = f13132i + 87;
            f13131f = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        Function4 function42 = new Function4() { // from class: com.incode.welcome_sdk.ui.curp_validation.GenerateCurpFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return this.f$0.d((CharSequence) obj, (Integer) obj2, (Integer) obj3, (Integer) obj4);
            }
        };
        TextViewKt.doOnTextChanged(this.f13138g.f6949c, function42);
        TextViewKt.doOnTextChanged(this.f13138g.f6947a, function42);
        TextViewKt.doOnTextChanged(this.f13138g.f6953g, function42);
        throw null;
    }

    /* JADX INFO: renamed from: com.incode.welcome_sdk.ui.curp_validation.GenerateCurpFragment$4 */
    final class AnonymousClass4 implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: b */
        private static int f13141b = 0;

        /* JADX INFO: renamed from: c */
        private static int f13142c = 1;

        AnonymousClass4() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            Callback.onItemSelected_enter(view, i2);
            try {
                int i3 = 2 % 2;
                int i4 = f13142c + 23;
                f13141b = i4 % 128;
                if (i4 % 2 == 0) {
                    GenerateCurpFragment.this.d();
                    int i5 = f13141b + 93;
                    f13142c = i5 % 128;
                    int i6 = i5 % 2;
                    return;
                }
                GenerateCurpFragment.this.d();
                Object obj = null;
                obj.hashCode();
                throw null;
            } finally {
                Callback.onItemSelected_exit();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
            int i2 = 2 % 2;
            int i3 = f13141b + 13;
            f13142c = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private void j() {
        int i2 = 2 % 2;
        AnonymousClass4 anonymousClass4 = new AdapterView.OnItemSelectedListener() { // from class: com.incode.welcome_sdk.ui.curp_validation.GenerateCurpFragment.4

            /* JADX INFO: renamed from: b */
            private static int f13141b = 0;

            /* JADX INFO: renamed from: c */
            private static int f13142c = 1;

            AnonymousClass4() {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i22, long j2) {
                Callback.onItemSelected_enter(view, i22);
                try {
                    int i3 = 2 % 2;
                    int i4 = f13142c + 23;
                    f13141b = i4 % 128;
                    if (i4 % 2 == 0) {
                        GenerateCurpFragment.this.d();
                        int i5 = f13141b + 93;
                        f13142c = i5 % 128;
                        int i6 = i5 % 2;
                        return;
                    }
                    GenerateCurpFragment.this.d();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                } finally {
                    Callback.onItemSelected_exit();
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView<?> adapterView) {
                int i22 = 2 % 2;
                int i3 = f13141b + 13;
                f13142c = i3 % 128;
                int i4 = i3 % 2;
            }
        };
        this.f13138g.f6948b.setOnItemSelectedListener(anonymousClass4);
        this.f13138g.f6951e.setOnItemSelectedListener(anonymousClass4);
        int i3 = f13131f + 57;
        f13132i = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }
}
