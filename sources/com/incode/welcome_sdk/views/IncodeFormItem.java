package com.incode.welcome_sdk.views;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.ui.adapter.FormAdapter;
import com.incode.welcome_sdk.commons.utils.al;
import com.incode.welcome_sdk.commons.utils.i;
import com.incode.welcome_sdk.data.remote.b;
import com.incode.welcome_sdk.ui.ekyc.CapitalLetterOnlyInputFilter;
import com.reactnativeincodesdk.ModuleNames;
import java.util.Calendar;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class IncodeFormItem extends ConstraintLayout {
    public static final int $stable = 8;
    private final AttributeSet attrs;
    private final ImageView clearButton;
    private final IncodeSpinner dropdownMenu;
    private final EditText editText;
    private String errorMessage;
    private final View errorMessageSection;
    private final TextView errorTextView;
    private final Map<a, Integer> formTypeToStringResource;
    private boolean isOptional;
    private String selectedKey;
    private String[] spinnerItems;
    private final TextView txtTitle;
    private a type;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$0$new$-Landroid-content-Context-Landroid-util-AttributeSet-I-V, reason: not valid java name */
    public static /* synthetic */ void m8606x4de12e11(IncodeFormItem incodeFormItem, View view) {
        Callback.onClick_enter(view);
        try {
            _init_$lambda$0(incodeFormItem, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: instrumented$1$useAsDatePicker$--V, reason: not valid java name */
    public static /* synthetic */ void m8607instrumented$1$useAsDatePicker$V(DatePickerDialog datePickerDialog, View view) {
        Callback.onClick_enter(view);
        try {
            useAsDatePicker$lambda$8$lambda$7(datePickerDialog, view);
        } finally {
            Callback.onClick_exit();
        }
    }

    public /* synthetic */ IncodeFormItem(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IncodeFormItem(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.attrs = attributeSet;
        this.type = a.f18150b;
        this.formTypeToStringResource = MapsKt.mapOf(TuplesKt.to(a.f18152d, Integer.valueOf(R.string.onboard_sdk_ekyc_street_form_error_message)), TuplesKt.to(a.f18151c, Integer.valueOf(R.string.onboard_sdk_ekyc_street_house_number_missing_message)), TuplesKt.to(a.f18158j, Integer.valueOf(R.string.onboard_sdk_ekyc_email_format_not_valid_message)), TuplesKt.to(a.f18154f, Integer.valueOf(R.string.onboard_sdk_ekyc_phone_format_not_valid_message)), TuplesKt.to(a.f18155g, Integer.valueOf(R.string.onboard_sdk_ekyc_postal_format_not_valid_message_us)), TuplesKt.to(a.f18156h, Integer.valueOf(R.string.onboard_sdk_ekyc_postal_format_not_valid_message_br)), TuplesKt.to(a.f18157i, Integer.valueOf(R.string.onboard_sdk_ekyc_tax_id_format_not_valid_message_us)));
        this.spinnerItems = new String[0];
        this.errorMessage = "";
        this.selectedKey = "";
        LayoutInflater.from(context).inflate(R.layout.onboard_sdk_item_ekyc_form, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.etField);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        this.editText = (EditText) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.btnClear);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        ImageView imageView = (ImageView) viewFindViewById2;
        this.clearButton = imageView;
        View viewFindViewById3 = findViewById(R.id.txtTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        this.txtTitle = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.errorMessageSection);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        this.errorMessageSection = viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.txtErrorMessage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
        this.errorTextView = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.dropdownMenu);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
        this.dropdownMenu = (IncodeSpinner) viewFindViewById6;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.views.IncodeFormItem$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IncodeFormItem.m8606x4de12e11(this.f$0, view);
            }
        });
        setFormRule();
        setXmlAttributes();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f18150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f18151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f18152d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f18153e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f18154f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f18155g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f18156h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f18157i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f18158j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f18159l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f18160m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final /* synthetic */ a[] f18161n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f18162o;

        private a(String str, int i2) {
        }

        static {
            a aVar = new a("DEFAULT", 0);
            f18150b = aVar;
            a aVar2 = new a("NAME", 1);
            f18153e = aVar2;
            a aVar3 = new a("HOUSE_NUM", 2);
            f18151c = aVar3;
            a aVar4 = new a("STREET", 3);
            f18152d = aVar4;
            a aVar5 = new a(ModuleNames.CURP, 4);
            f18149a = aVar5;
            a aVar6 = new a("EMAIL", 5);
            f18158j = aVar6;
            a aVar7 = new a("PHONE", 6);
            f18154f = aVar7;
            a aVar8 = new a("US_POSTAL_CODE", 7);
            f18155g = aVar8;
            a aVar9 = new a("BR_POSTAL_CODE", 8);
            f18156h = aVar9;
            a aVar10 = new a("SSN", 9);
            f18157i = aVar10;
            a aVar11 = new a("CPF", 10);
            f18159l = aVar11;
            a aVar12 = new a("SELECTOR", 11);
            f18160m = aVar12;
            a aVar13 = new a("STATE", 12);
            f18162o = aVar13;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13};
            f18161n = aVarArr;
            EnumEntriesKt.enumEntries(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f18161n.clone();
        }
    }

    public final boolean isOptional() {
        return this.isOptional;
    }

    public static final class c implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public c() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            IncodeFormItem.this.validateString();
        }
    }

    public static final class e implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public e() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            if (charSequence == null || charSequence.length() == 0 || StringsKt.first(charSequence) != '+') {
                IncodeFormItem.this.editText.setText("+");
                IncodeFormItem.this.editText.setSelection(1);
            }
        }
    }

    private static final void _init_$lambda$0(IncodeFormItem incodeFormItem, View view) {
        Intrinsics.checkNotNullParameter(incodeFormItem, "");
        incodeFormItem.editText.getText().clear();
    }

    private final String getValidationErrorMessage() {
        Integer num = this.formTypeToStringResource.get(this.type);
        String string = getResources().getString(num != null ? num.intValue() : R.string.onboard_sdk_ekyc_invalid_text_error_message);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateString() {
        if (isValidString()) {
            removeError();
        } else {
            showErrorMessage(getValidationErrorMessage());
        }
    }

    private final void setFormRule() {
        this.editText.addTextChangedListener(new c());
    }

    public final boolean isValidString() {
        if (this.isOptional) {
            Editable text = this.editText.getText();
            Intrinsics.checkNotNullExpressionValue(text, "");
            if (text.length() == 0) {
                return true;
            }
        }
        switch (d.f18167d[this.type.ordinal()]) {
            case 1:
                Editable text2 = this.editText.getText();
                Intrinsics.checkNotNullExpressionValue(text2, "");
                return text2.length() > 0;
            case 2:
                al alVar = al.f6409c;
                Editable text3 = this.editText.getText();
                Intrinsics.checkNotNullExpressionValue(text3, "");
                return al.e(text3);
            case 3:
                Editable text4 = this.editText.getText();
                Intrinsics.checkNotNullExpressionValue(text4, "");
                return text4.length() > 0;
            case 4:
                al alVar2 = al.f6409c;
                Editable text5 = this.editText.getText();
                Intrinsics.checkNotNullExpressionValue(text5, "");
                return al.h(text5);
            case 5:
                al alVar3 = al.f6409c;
                Editable text6 = this.editText.getText();
                Intrinsics.checkNotNullExpressionValue(text6, "");
                return al.c(text6);
            case 6:
                al alVar4 = al.f6409c;
                Editable text7 = this.editText.getText();
                Intrinsics.checkNotNullExpressionValue(text7, "");
                return al.d(text7);
            case 7:
                al alVar5 = al.f6409c;
                Editable text8 = this.editText.getText();
                Intrinsics.checkNotNullExpressionValue(text8, "");
                return al.a(text8);
            case 8:
                al alVar6 = al.f6409c;
                Editable text9 = this.editText.getText();
                Intrinsics.checkNotNullExpressionValue(text9, "");
                return al.b(text9);
            case 9:
                al alVar7 = al.f6409c;
                Editable text10 = this.editText.getText();
                Intrinsics.checkNotNullExpressionValue(text10, "");
                return ((Boolean) al.d(1637345827, b.a.e.d(), b.a.e.d(), b.a.e.d(), -1637345827, new Object[]{text10}, b.a.e.d())).booleanValue();
            case 10:
                al alVar8 = al.f6409c;
                Editable text11 = this.editText.getText();
                Intrinsics.checkNotNullExpressionValue(text11, "");
                return ((Boolean) al.d(-2126822359, b.a.e.d(), b.a.e.d(), b.a.e.d(), 2126822360, new Object[]{text11}, b.a.e.d())).booleanValue();
            case 11:
                al alVar9 = al.f6409c;
                Editable text12 = this.editText.getText();
                Intrinsics.checkNotNullExpressionValue(text12, "");
                return al.f(text12);
            case 12:
                al alVar10 = al.f6409c;
                Editable text13 = this.editText.getText();
                Intrinsics.checkNotNullExpressionValue(text13, "");
                return al.i(text13);
            case 13:
                return ArraysKt.contains(this.spinnerItems, this.dropdownMenu.getSelectedItem().toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void updateErrorMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.errorMessage = str;
    }

    public final void updateTitleText(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txtTitle.setText(str);
    }

    private final void setXmlAttributes() {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(this.attrs, R.styleable.onboard_sdk_IncodeFormItem);
        EditText editText = this.editText;
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.onboard_sdk_IncodeFormItem_android_hint);
        editText.setHint(string != null ? string : this.editText.getHint());
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.onboard_sdk_IncodeFormItem_android_text);
        if (string2 != null) {
            this.editText.setText(string2);
            removeError();
        }
        String string3 = typedArrayObtainStyledAttributes.getString(R.styleable.onboard_sdk_IncodeFormItem_onboard_sdk_error_message);
        if (string3 == null) {
            string3 = this.errorMessage;
        } else {
            Intrinsics.checkNotNull(string3);
        }
        this.errorMessage = string3;
        TextView textView = this.txtTitle;
        String string4 = typedArrayObtainStyledAttributes.getString(R.styleable.onboard_sdk_IncodeFormItem_onboard_sdk_title_message);
        textView.setText(string4 != null ? string4 : this.txtTitle.getText());
        this.isOptional = typedArrayObtainStyledAttributes.getBoolean(R.styleable.onboard_sdk_IncodeFormItem_onboard_sdk_is_optional, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setFieldType(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "");
        this.type = aVar;
        int i2 = d.f18167d[aVar.ordinal()];
        int i3 = 2;
        if (i2 == 2) {
            i3 = 96;
        } else if (i2 != 12) {
            switch (i2) {
                case 6:
                    i3 = 32;
                    break;
                case 7:
                    this.editText.addTextChangedListener(new e());
                    i3 = 3;
                    break;
                case 8:
                case 10:
                    break;
                case 9:
                    this.editText.setFilters(new CapitalLetterOnlyInputFilter[]{new CapitalLetterOnlyInputFilter()});
                    i3 = 4097;
                    break;
                default:
                    i3 = 1;
                    break;
            }
        }
        this.editText.setInputType(i3);
    }

    public final a getFiledType() {
        return this.type;
    }

    public final String getText() {
        return this.editText.getText().toString();
    }

    public final String getSpinnerSelectedItem() {
        return this.dropdownMenu.getSelectedItem().toString();
    }

    public final String getSpinnerSelectedItemKey() {
        return this.selectedKey;
    }

    public final void setText(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        this.editText.setText(charSequence);
    }

    public static /* synthetic */ void showErrorMessage$default(IncodeFormItem incodeFormItem, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        incodeFormItem.showErrorMessage(str);
    }

    public final void showErrorMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.errorMessageSection.setVisibility(0);
        TextView textView = this.errorTextView;
        String str2 = str;
        if (StringsKt.isBlank(str2)) {
            str2 = this.errorMessage;
        }
        textView.setText(str2);
    }

    public final void removeError() {
        this.errorMessageSection.setVisibility(8);
    }

    public final void useAsDatePicker() {
        disableCloseButton();
        final EditText editText = this.editText;
        final KeyListener keyListener = editText.getKeyListener();
        editText.setFocusable(false);
        editText.setFocusableInTouchMode(false);
        editText.setCursorVisible(false);
        editText.setKeyListener(null);
        Calendar calendar = Calendar.getInstance();
        final DatePickerDialog datePickerDialog = new DatePickerDialog(editText.getContext(), new DatePickerDialog.OnDateSetListener() { // from class: com.incode.welcome_sdk.views.IncodeFormItem$$ExternalSyntheticLambda1
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
                IncodeFormItem.useAsDatePicker$lambda$8$lambda$6(editText, keyListener, datePicker, i2, i3, i4);
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5));
        editText.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.views.IncodeFormItem$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IncodeFormItem.m8607instrumented$1$useAsDatePicker$V(datePickerDialog, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void useAsDatePicker$lambda$8$lambda$6(EditText editText, KeyListener keyListener, DatePicker datePicker, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(editText, "");
        editText.setKeyListener(keyListener);
        editText.setText(i.a(i2, i3, i4));
        editText.setKeyListener(null);
    }

    private static final void useAsDatePicker$lambda$8$lambda$7(DatePickerDialog datePickerDialog, View view) {
        Intrinsics.checkNotNullParameter(datePickerDialog, "");
        datePickerDialog.show();
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ String[] f18163a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Function1<String, Unit> f18165c;

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(String[] strArr, Function1<? super String, Unit> function1) {
            this.f18163a = strArr;
            this.f18165c = function1;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            Callback.onItemSelected_enter(view, i2);
            try {
                Intrinsics.checkNotNullParameter(view, "");
                if (i2 > 0) {
                    IncodeFormItem.this.selectedKey = this.f18163a[i2 - 1];
                    Function1<String, Unit> function1 = this.f18165c;
                    if (function1 != null) {
                        function1.invoke(IncodeFormItem.this.selectedKey);
                    }
                    IncodeFormItem.this.removeError();
                }
            } finally {
                Callback.onItemSelected_exit();
            }
        }
    }

    private final void addOnItemSelectedListeners(String[] strArr, Function1<? super String, Unit> function1) {
        this.dropdownMenu.setOnItemSelectedListener(new b(strArr, function1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void useAsSelector$default(IncodeFormItem incodeFormItem, String[] strArr, String[] strArr2, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        incodeFormItem.useAsSelector(strArr, strArr2, str, function1);
    }

    public final void useAsSelector(String[] strArr, String[] strArr2, String str, Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(strArr2, "");
        Intrinsics.checkNotNullParameter(str, "");
        disableCloseButton();
        this.spinnerItems = strArr;
        this.editText.setVisibility(4);
        this.dropdownMenu.setVisibility(0);
        IncodeSpinner incodeSpinner = this.dropdownMenu;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        incodeSpinner.setAdapter((SpinnerAdapter) new FormAdapter(context, strArr, str, (byte) 0));
        addOnItemSelectedListeners(strArr2, function1);
    }

    public final void selectFirstOption() {
        this.dropdownMenu.setSelection(1);
    }

    private final void disableCloseButton() {
        this.clearButton.setVisibility(8);
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f18167d;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f18150b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f18153e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f18152d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f18151c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f18149a.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.f18158j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.f18154f.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.f18155g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.f18162o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[a.f18156h.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[a.f18159l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[a.f18157i.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[a.f18160m.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f18167d = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncodeFormItem(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncodeFormItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }
}
