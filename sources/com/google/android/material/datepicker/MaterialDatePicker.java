package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.util.Pair;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.EdgeToEdgeUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashSet;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes8.dex */
public final class MaterialDatePicker<S> extends DialogFragment {
    private static final String CALENDAR_CONSTRAINTS_KEY = "CALENDAR_CONSTRAINTS_KEY";
    private static final String DATE_SELECTOR_KEY = "DATE_SELECTOR_KEY";
    private static final String DAY_VIEW_DECORATOR_KEY = "DAY_VIEW_DECORATOR_KEY";
    public static final int INPUT_MODE_CALENDAR = 0;
    private static final String INPUT_MODE_KEY = "INPUT_MODE_KEY";
    public static final int INPUT_MODE_TEXT = 1;
    private static final String NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY";
    private static final String NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY";
    private static final String NEGATIVE_BUTTON_TEXT_KEY = "NEGATIVE_BUTTON_TEXT_KEY";
    private static final String NEGATIVE_BUTTON_TEXT_RES_ID_KEY = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY";
    private static final String OVERRIDE_THEME_RES_ID = "OVERRIDE_THEME_RES_ID";
    private static final String POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY";
    private static final String POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY";
    private static final String POSITIVE_BUTTON_TEXT_KEY = "POSITIVE_BUTTON_TEXT_KEY";
    private static final String POSITIVE_BUTTON_TEXT_RES_ID_KEY = "POSITIVE_BUTTON_TEXT_RES_ID_KEY";
    private static final String TITLE_TEXT_KEY = "TITLE_TEXT_KEY";
    private static final String TITLE_TEXT_RES_ID_KEY = "TITLE_TEXT_RES_ID_KEY";
    private MaterialShapeDrawable background;
    private MaterialCalendar<S> calendar;
    private CalendarConstraints calendarConstraints;
    private Button confirmButton;
    private DateSelector<S> dateSelector;
    private DayViewDecorator dayViewDecorator;
    private boolean edgeToEdgeEnabled;
    private CharSequence fullTitleText;
    private boolean fullscreen;
    private TextView headerSelectionText;
    private TextView headerTitleTextView;
    private CheckableImageButton headerToggleButton;
    private int inputMode;
    private CharSequence negativeButtonContentDescription;
    private int negativeButtonContentDescriptionResId;
    private CharSequence negativeButtonText;
    private int negativeButtonTextResId;
    private int overrideThemeResId;
    private PickerFragment<S> pickerFragment;
    private CharSequence positiveButtonContentDescription;
    private int positiveButtonContentDescriptionResId;
    private CharSequence positiveButtonText;
    private int positiveButtonTextResId;
    private CharSequence singleLineTitleText;
    private CharSequence titleText;
    private int titleTextResId;
    static final Object CONFIRM_BUTTON_TAG = "CONFIRM_BUTTON_TAG";
    static final Object CANCEL_BUTTON_TAG = "CANCEL_BUTTON_TAG";
    static final Object TOGGLE_BUTTON_TAG = "TOGGLE_BUTTON_TAG";
    private final LinkedHashSet<MaterialPickerOnPositiveButtonClickListener<? super S>> onPositiveButtonClickListeners = new LinkedHashSet<>();
    private final LinkedHashSet<View.OnClickListener> onNegativeButtonClickListeners = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnCancelListener> onCancelListeners = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> onDismissListeners = new LinkedHashSet<>();

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialDatePicker$1 */
    class AnonymousClass1 implements View.OnClickListener {
        AnonymousClass1() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                Iterator it = MaterialDatePicker.this.onPositiveButtonClickListeners.iterator();
                while (it.hasNext()) {
                    ((MaterialPickerOnPositiveButtonClickListener) it.next()).onPositiveButtonClick(MaterialDatePicker.this.getSelection());
                }
                MaterialDatePicker.this.dismiss();
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialDatePicker$2 */
    class AnonymousClass2 implements View.OnClickListener {
        AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                Iterator it = MaterialDatePicker.this.onNegativeButtonClickListeners.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                MaterialDatePicker.this.dismiss();
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialDatePicker$3 */
    class AnonymousClass3 implements OnApplyWindowInsetsListener {
        final /* synthetic */ View val$headerLayout;
        final /* synthetic */ int val$originalHeaderHeight;
        final /* synthetic */ int val$originalPaddingTop;

        AnonymousClass3(int i2, View view, int i3) {
            i = i2;
            view = view;
            i = i3;
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            int i2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top;
            if (i >= 0) {
                view.getLayoutParams().height = i + i2;
                View view2 = view;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = view;
            view3.setPadding(view3.getPaddingLeft(), i + i2, view.getPaddingRight(), view.getPaddingBottom());
            return windowInsetsCompat;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialDatePicker$4 */
    class AnonymousClass4 extends OnSelectionChangedListener<S> {
        AnonymousClass4() {
        }

        @Override // com.google.android.material.datepicker.OnSelectionChangedListener
        public void onIncompleteSelectionChanged() {
            MaterialDatePicker.this.confirmButton.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.OnSelectionChangedListener
        public void onSelectionChanged(S s2) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            materialDatePicker.updateHeader(materialDatePicker.getHeaderText());
            MaterialDatePicker.this.confirmButton.setEnabled(MaterialDatePicker.this.getDateSelector().isSelectionComplete());
        }
    }

    public static final class Builder<S> {
        CalendarConstraints calendarConstraints;
        final DateSelector<S> dateSelector;
        DayViewDecorator dayViewDecorator;
        int overrideThemeResId = 0;
        int titleTextResId = 0;
        CharSequence titleText = null;
        int positiveButtonTextResId = 0;
        CharSequence positiveButtonText = null;
        int positiveButtonContentDescriptionResId = 0;
        CharSequence positiveButtonContentDescription = null;
        int negativeButtonTextResId = 0;
        CharSequence negativeButtonText = null;
        int negativeButtonContentDescriptionResId = 0;
        CharSequence negativeButtonContentDescription = null;
        S selection = null;
        int inputMode = 0;

        private Builder(DateSelector<S> dateSelector) {
            this.dateSelector = dateSelector;
        }

        private Month createDefaultOpenAt() {
            if (!this.dateSelector.getSelectedDays().isEmpty()) {
                Month monthCreate = Month.create(this.dateSelector.getSelectedDays().iterator().next().longValue());
                if (monthInValidRange(monthCreate, this.calendarConstraints)) {
                    return monthCreate;
                }
            }
            Month monthCurrent = Month.current();
            return monthInValidRange(monthCurrent, this.calendarConstraints) ? monthCurrent : this.calendarConstraints.getStart();
        }

        public static <S> Builder<S> customDatePicker(DateSelector<S> dateSelector) {
            return new Builder<>(dateSelector);
        }

        public static Builder<Long> datePicker() {
            return new Builder<>(new SingleDateSelector());
        }

        public static Builder<Pair<Long, Long>> dateRangePicker() {
            return new Builder<>(new RangeDateSelector());
        }

        private static boolean monthInValidRange(Month month, CalendarConstraints calendarConstraints) {
            return month.compareTo(calendarConstraints.getStart()) >= 0 && month.compareTo(calendarConstraints.getEnd()) <= 0;
        }

        public MaterialDatePicker<S> build() {
            if (this.calendarConstraints == null) {
                this.calendarConstraints = new CalendarConstraints.Builder().build();
            }
            if (this.titleTextResId == 0) {
                this.titleTextResId = this.dateSelector.getDefaultTitleResId();
            }
            S s2 = this.selection;
            if (s2 != null) {
                this.dateSelector.setSelection(s2);
            }
            if (this.calendarConstraints.getOpenAt() == null) {
                this.calendarConstraints.setOpenAt(createDefaultOpenAt());
            }
            return MaterialDatePicker.newInstance(this);
        }

        public Builder<S> setCalendarConstraints(CalendarConstraints calendarConstraints) {
            this.calendarConstraints = calendarConstraints;
            return this;
        }

        public Builder<S> setDayViewDecorator(DayViewDecorator dayViewDecorator) {
            this.dayViewDecorator = dayViewDecorator;
            return this;
        }

        public Builder<S> setInputMode(int i2) {
            this.inputMode = i2;
            return this;
        }

        public Builder<S> setNegativeButtonContentDescription(int i2) {
            this.negativeButtonContentDescriptionResId = i2;
            this.negativeButtonContentDescription = null;
            return this;
        }

        public Builder<S> setNegativeButtonContentDescription(CharSequence charSequence) {
            this.negativeButtonContentDescription = charSequence;
            this.negativeButtonContentDescriptionResId = 0;
            return this;
        }

        public Builder<S> setNegativeButtonText(int i2) {
            this.negativeButtonTextResId = i2;
            this.negativeButtonText = null;
            return this;
        }

        public Builder<S> setNegativeButtonText(CharSequence charSequence) {
            this.negativeButtonText = charSequence;
            this.negativeButtonTextResId = 0;
            return this;
        }

        public Builder<S> setPositiveButtonContentDescription(int i2) {
            this.positiveButtonContentDescriptionResId = i2;
            this.positiveButtonContentDescription = null;
            return this;
        }

        public Builder<S> setPositiveButtonContentDescription(CharSequence charSequence) {
            this.positiveButtonContentDescription = charSequence;
            this.positiveButtonContentDescriptionResId = 0;
            return this;
        }

        public Builder<S> setPositiveButtonText(int i2) {
            this.positiveButtonTextResId = i2;
            this.positiveButtonText = null;
            return this;
        }

        public Builder<S> setPositiveButtonText(CharSequence charSequence) {
            this.positiveButtonText = charSequence;
            this.positiveButtonTextResId = 0;
            return this;
        }

        public Builder<S> setSelection(S s2) {
            this.selection = s2;
            return this;
        }

        public Builder<S> setTextInputFormat(SimpleDateFormat simpleDateFormat) {
            this.dateSelector.setTextInputFormat(simpleDateFormat);
            return this;
        }

        public Builder<S> setTheme(int i2) {
            this.overrideThemeResId = i2;
            return this;
        }

        public Builder<S> setTitleText(int i2) {
            this.titleTextResId = i2;
            this.titleText = null;
            return this;
        }

        public Builder<S> setTitleText(CharSequence charSequence) {
            this.titleText = charSequence;
            this.titleTextResId = 0;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface InputMode {
    }

    private static Drawable createHeaderToggleDrawable(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, AppCompatResources.getDrawable(context, com.google.android.material.R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AppCompatResources.getDrawable(context, com.google.android.material.R.drawable.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    private void enableEdgeToEdgeIfNeeded(Window window) throws Throwable {
        if (this.edgeToEdgeEnabled) {
            return;
        }
        View viewFindViewById = requireView().findViewById(com.google.android.material.R.id.fullscreen_header);
        EdgeToEdgeUtils.applyEdgeToEdge(window, true, ViewUtils.getBackgroundColor(viewFindViewById), null);
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.datepicker.MaterialDatePicker.3
            final /* synthetic */ View val$headerLayout;
            final /* synthetic */ int val$originalHeaderHeight;
            final /* synthetic */ int val$originalPaddingTop;

            AnonymousClass3(int i2, View viewFindViewById2, int i3) {
                i = i2;
                view = viewFindViewById2;
                i = i3;
            }

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                int i2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top;
                if (i >= 0) {
                    view.getLayoutParams().height = i + i2;
                    View view2 = view;
                    view2.setLayoutParams(view2.getLayoutParams());
                }
                View view3 = view;
                view3.setPadding(view3.getPaddingLeft(), i + i2, view.getPaddingRight(), view.getPaddingBottom());
                return windowInsetsCompat;
            }
        });
        this.edgeToEdgeEnabled = true;
    }

    public DateSelector<S> getDateSelector() {
        if (this.dateSelector == null) {
            this.dateSelector = (DateSelector) getArguments().getParcelable(DATE_SELECTOR_KEY);
        }
        return this.dateSelector;
    }

    private static CharSequence getFirstLineBySeparator(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    private String getHeaderContentDescription() {
        return getDateSelector().getSelectionContentDescription(requireContext());
    }

    private static int getPaddedPickerWidth(Context context) throws Throwable {
        short sXd = (short) (Od.Xd() ^ (-23192));
        int[] iArr = new int["AOBQSNF\u0011KXT[Q[^\u00193`\\cYmf".length()];
        QB qb = new QB("AOBQSNF\u0011KXT[Q[^\u00193`\\cYmf");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Class<?> cls = Class.forName(new String(iArr, 0, i2));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd2 = (short) (C1607wl.Xd() ^ 2461);
        short sXd3 = (short) (C1607wl.Xd() ^ 3218);
        int[] iArr2 = new int["ro}Zlytyuefs".length()];
        QB qb2 = new QB("ro}Zlytyuefs");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((sXd2 + i3) + xuXd2.CK(iKK2)) - sXd3);
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            int dimensionPixelOffset = resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_content_padding);
            int i4 = Month.current().daysInWeek;
            return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_calendar_day_width) * i4) + ((i4 - 1) * resources.getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_month_horizontal_padding));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private int getThemeResId(Context context) {
        int i2 = this.overrideThemeResId;
        return i2 != 0 ? i2 : getDateSelector().getDefaultThemeResId(context);
    }

    private void initHeaderToggle(Context context) throws Throwable {
        this.headerToggleButton.setTag(TOGGLE_BUTTON_TAG);
        this.headerToggleButton.setImageDrawable(createHeaderToggleDrawable(context));
        this.headerToggleButton.setChecked(this.inputMode != 0);
        ViewCompat.setAccessibilityDelegate(this.headerToggleButton, null);
        updateToggleContentDescription(this.headerToggleButton);
        this.headerToggleButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialDatePicker$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialDatePicker.m7629instrumented$0$initHeaderToggle$LandroidcontentContextV(this.f$0, view);
            }
        });
    }

    /* JADX INFO: renamed from: instrumented$0$initHeaderToggle$-Landroid-content-Context--V */
    public static /* synthetic */ void m7629instrumented$0$initHeaderToggle$LandroidcontentContextV(MaterialDatePicker materialDatePicker, View view) {
        Callback.onClick_enter(view);
        try {
            materialDatePicker.lambda$initHeaderToggle$0(view);
        } finally {
            Callback.onClick_exit();
        }
    }

    static boolean isFullscreen(Context context) {
        return readMaterialCalendarStyleBoolean(context, R.attr.windowFullscreen);
    }

    private boolean isLandscape() {
        return getResources().getConfiguration().orientation == 2;
    }

    static boolean isNestedScrollable(Context context) {
        return readMaterialCalendarStyleBoolean(context, com.google.android.material.R.attr.nestedScrollable);
    }

    private /* synthetic */ void lambda$initHeaderToggle$0(View view) throws Throwable {
        this.confirmButton.setEnabled(getDateSelector().isSelectionComplete());
        this.headerToggleButton.toggle();
        this.inputMode = this.inputMode == 1 ? 0 : 1;
        updateToggleContentDescription(this.headerToggleButton);
        startPickerFragment();
    }

    static <S> MaterialDatePicker<S> newInstance(Builder<S> builder) {
        MaterialDatePicker<S> materialDatePicker = new MaterialDatePicker<>();
        Bundle bundle = new Bundle();
        bundle.putInt(OVERRIDE_THEME_RES_ID, builder.overrideThemeResId);
        bundle.putParcelable(DATE_SELECTOR_KEY, builder.dateSelector);
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, builder.calendarConstraints);
        bundle.putParcelable(DAY_VIEW_DECORATOR_KEY, builder.dayViewDecorator);
        bundle.putInt(TITLE_TEXT_RES_ID_KEY, builder.titleTextResId);
        bundle.putCharSequence(TITLE_TEXT_KEY, builder.titleText);
        bundle.putInt(INPUT_MODE_KEY, builder.inputMode);
        bundle.putInt(POSITIVE_BUTTON_TEXT_RES_ID_KEY, builder.positiveButtonTextResId);
        bundle.putCharSequence(POSITIVE_BUTTON_TEXT_KEY, builder.positiveButtonText);
        bundle.putInt(POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY, builder.positiveButtonContentDescriptionResId);
        bundle.putCharSequence(POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY, builder.positiveButtonContentDescription);
        bundle.putInt(NEGATIVE_BUTTON_TEXT_RES_ID_KEY, builder.negativeButtonTextResId);
        bundle.putCharSequence(NEGATIVE_BUTTON_TEXT_KEY, builder.negativeButtonText);
        bundle.putInt(NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY, builder.negativeButtonContentDescriptionResId);
        bundle.putCharSequence(NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY, builder.negativeButtonContentDescription);
        materialDatePicker.setArguments(bundle);
        return materialDatePicker;
    }

    static boolean readMaterialCalendarStyleBoolean(Context context, int i2) throws Throwable {
        int iResolveOrThrow = MaterialAttributes.resolveOrThrow(context, com.google.android.material.R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName());
        int[] iArr = {i2};
        short sXd = (short) (FB.Xd() ^ 29123);
        short sXd2 = (short) (FB.Xd() ^ 7047);
        int[] iArr2 = new int["\u0014 \u0015\"\u001e\u0017\u0011Y\u000e\u0019\u0017\u001c\f\u0014\u0019Qe\u0011\u000f\u0014\u0004\u0016\u0011".length()];
        QB qb = new QB("\u0014 \u0015\"\u001e\u0017\u0011Y\u000e\u0019\u0017\u001c\f\u0014\u0019Qe\u0011\u000f\u0014\u0004\u0016\u0011");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr2[i3] = xuXd.fK(sXd + i3 + xuXd.CK(iKK) + sXd2);
            i3++;
        }
        Class<?> cls = Class.forName(new String(iArr2, 0, i3));
        Class<?>[] clsArr = {Integer.TYPE, int[].class};
        Object[] objArr = {Integer.valueOf(iResolveOrThrow), iArr};
        Method method = cls.getMethod(C1561oA.ud("eWhT[_CcgYQO+]\\YOGYWGT", (short) (Od.Xd() ^ (-28460))), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            boolean z2 = typedArray.getBoolean(0, false);
            typedArray.recycle();
            return z2;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private void startPickerFragment() {
        int themeResId = getThemeResId(requireContext());
        MaterialTextInputPicker materialTextInputPickerNewInstance = MaterialCalendar.newInstance(getDateSelector(), themeResId, this.calendarConstraints, this.dayViewDecorator);
        this.calendar = materialTextInputPickerNewInstance;
        if (this.inputMode == 1) {
            materialTextInputPickerNewInstance = MaterialTextInputPicker.newInstance(getDateSelector(), themeResId, this.calendarConstraints);
        }
        this.pickerFragment = materialTextInputPickerNewInstance;
        updateTitle();
        updateHeader(getHeaderText());
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(com.google.android.material.R.id.mtrl_calendar_frame, this.pickerFragment);
        fragmentTransactionBeginTransaction.commitNow();
        this.pickerFragment.addOnSelectionChangedListener(new OnSelectionChangedListener<S>() { // from class: com.google.android.material.datepicker.MaterialDatePicker.4
            AnonymousClass4() {
            }

            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public void onIncompleteSelectionChanged() {
                MaterialDatePicker.this.confirmButton.setEnabled(false);
            }

            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public void onSelectionChanged(S s2) {
                MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
                materialDatePicker.updateHeader(materialDatePicker.getHeaderText());
                MaterialDatePicker.this.confirmButton.setEnabled(MaterialDatePicker.this.getDateSelector().isSelectionComplete());
            }
        });
    }

    public static long thisMonthInUtcMilliseconds() {
        return Month.current().timeInMillis;
    }

    public static long todayInUtcMilliseconds() {
        return UtcDates.getTodayCalendar().getTimeInMillis();
    }

    private void updateTitle() {
        this.headerTitleTextView.setText((this.inputMode == 1 && isLandscape()) ? this.singleLineTitleText : this.fullTitleText);
    }

    private void updateToggleContentDescription(CheckableImageButton checkableImageButton) throws Throwable {
        String str;
        if (this.inputMode == 1) {
            Context context = checkableImageButton.getContext();
            int i2 = com.google.android.material.R.string.mtrl_picker_toggle_to_calendar_input_mode;
            Class<?> cls = Class.forName(C1561oA.yd("\n\u0018\u000b\u001a\u0014\u000f\u0007Q\u0004\u0011\r\u0014\u0002\f\u000fI{)%,\u001a.'", (short) (C1580rY.Xd() ^ (-30801))));
            Class<?>[] clsArr = {Integer.TYPE};
            Object[] objArr = {Integer.valueOf(i2)};
            short sXd = (short) (C1607wl.Xd() ^ 9166);
            int[] iArr = new int["FEU5WVNTN".length()];
            QB qb = new QB("FEU5WVNTN");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i3));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                str = (String) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            Context context2 = checkableImageButton.getContext();
            int i4 = com.google.android.material.R.string.mtrl_picker_toggle_to_text_input_mode;
            short sXd2 = (short) (Od.Xd() ^ (-7653));
            short sXd3 = (short) (Od.Xd() ^ (-23545));
            int[] iArr2 = new int["jxo~|ws>t\u0002\u0002\tz\u0005\fF\\\n\n\u0011\u0003\u0017\u0014".length()];
            QB qb2 = new QB("jxo~|ws>t\u0002\u0002\tz\u0005\fF\\\n\n\u0011\u0003\u0017\u0014");
            int i5 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i5] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i5)) + sXd3);
                i5++;
            }
            Class<?> cls2 = Class.forName(new String(iArr2, 0, i5));
            Class<?>[] clsArr2 = {Integer.TYPE};
            Object[] objArr2 = {Integer.valueOf(i4)};
            Method method2 = cls2.getMethod(Jg.Wd("\u001d7#=;UGi=", (short) (C1580rY.Xd() ^ (-5049)), (short) (C1580rY.Xd() ^ (-20143))), clsArr2);
            try {
                method2.setAccessible(true);
                str = (String) method2.invoke(context2, objArr2);
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        this.headerToggleButton.setContentDescription(str);
    }

    public boolean addOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.onCancelListeners.add(onCancelListener);
    }

    public boolean addOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.onDismissListeners.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.onNegativeButtonClickListeners.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(MaterialPickerOnPositiveButtonClickListener<? super S> materialPickerOnPositiveButtonClickListener) {
        return this.onPositiveButtonClickListeners.add(materialPickerOnPositiveButtonClickListener);
    }

    public void clearOnCancelListeners() {
        this.onCancelListeners.clear();
    }

    public void clearOnDismissListeners() {
        this.onDismissListeners.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.onNegativeButtonClickListeners.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.onPositiveButtonClickListeners.clear();
    }

    public String getHeaderText() {
        return getDateSelector().getSelectionDisplayString(getContext());
    }

    public int getInputMode() {
        return this.inputMode;
    }

    public final S getSelection() {
        return getDateSelector().getSelection();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.onCancelListeners.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.overrideThemeResId = bundle.getInt(ZO.xd(".OT\u001f\u0015wy #\bCp\u0014\u001a\u0014a\u0014#=\u0007:", (short) (ZN.Xd() ^ 22624), (short) (ZN.Xd() ^ 21763)));
        short sXd = (short) (ZN.Xd() ^ 11150);
        short sXd2 = (short) (ZN.Xd() ^ 18842);
        int[] iArr = new int["qI_^G`sE\\C2\u0017.\fgC=".length()];
        QB qb = new QB("qI_^G`sE\\C2\u0017.\fgC=");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        this.dateSelector = (DateSelector) bundle.getParcelable(new String(iArr, 0, i2));
        this.calendarConstraints = (CalendarConstraints) bundle.getParcelable(Ig.wd("[\t@^v0\u000f}PEQpG<\u0014b&/Z_1B\u001c2", (short) (C1499aX.Xd() ^ (-1346))));
        this.dayViewDecorator = (DayViewDecorator) bundle.getParcelable(EO.Od("\u000fF\r3QxPS\u0002+.F|\u0006\t6m\u000fDH^8", (short) (OY.Xd() ^ 14622)));
        this.titleTextResId = bundle.getInt(C1561oA.Qd("bV`WOh\\L^YcUGT_HB\\G@S", (short) (Od.Xd() ^ (-4984))));
        this.titleText = bundle.getCharSequence(C1593ug.zd("/%1*$?5';8D1,A", (short) (C1499aX.Xd() ^ (-25941)), (short) (C1499aX.Xd() ^ (-29558))));
        this.inputMode = bundle.getInt(C1561oA.od("{\u007f\u0001\u0005\u0003\ryznn\brk~", (short) (Od.Xd() ^ (-32145))));
        this.positiveButtonTextResId = bundle.getInt(C1561oA.Kd("YY^UaWeUpThhieewm_sp|pds\u0001kg\u0004pk\u0001", (short) (C1607wl.Xd() ^ 10645)));
        short sXd3 = (short) (C1607wl.Xd() ^ 4871);
        short sXd4 = (short) (C1607wl.Xd() ^ 22373);
        int[] iArr2 = new int["qc\u001bH\u000b/o\u0016gy@v.X\u000bS\u007f f\u001a\\w%p".length()];
        QB qb2 = new QB("qc\u001bH\u000b/o\u0016gy@v.X\u000bS\u007f f\u001a\\w%p");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((i3 * sXd4) ^ sXd3) + xuXd2.CK(iKK2));
            i3++;
        }
        this.positiveButtonText = bundle.getCharSequence(new String(iArr2, 0, i3));
        this.positiveButtonContentDescriptionResId = bundle.getInt(C1561oA.Xd("yy~u\u0002w\u0006u\u0011t\t\t\n\u0006\u0006\u0018|\n\n\u0011\u0003\r\u0014 \u0006\b\u0017\b\u0018\u0010\u0018\u001d\u0013\u001a\u001a, \u0014#0\u001b\u00173 \u001b0", (short) (C1633zX.Xd() ^ (-8880))));
        this.positiveButtonContentDescription = bundle.getCharSequence(Wg.vd("%#*\u001f-!1\u001f,\u000e$\"%\u001f!1\b\u0013\u0015\u001a\u000e\u0016\u001f)\u0001\u0001\u0012\u0001\u0013\t\u0013\u0016}\u0003\u0005\u0015\u0004|\u0014", (short) (FB.Xd() ^ 15669)));
        short sXd5 = (short) (C1580rY.Xd() ^ (-1361));
        short sXd6 = (short) (C1580rY.Xd() ^ (-3101));
        int[] iArr3 = new int["\u0010\u0006\u0007\u007f\u0012\u0006\u0012\u007f\u0019z\r\u000b\n\u0004\u0002\u0012\u0006u\b\u0003\r~p}\tqk\u0006pi|".length()];
        QB qb3 = new QB("\u0010\u0006\u0007\u007f\u0012\u0006\u0012\u007f\u0019z\r\u000b\n\u0004\u0002\u0012\u0006u\b\u0003\r~p}\tqk\u0006pi|");
        int i4 = 0;
        while (qb3.YK()) {
            int iKK3 = qb3.KK();
            Xu xuXd3 = Xu.Xd(iKK3);
            iArr3[i4] = xuXd3.fK(((sXd5 + i4) + xuXd3.CK(iKK3)) - sXd6);
            i4++;
        }
        this.negativeButtonTextResId = bundle.getInt(new String(iArr3, 0, i4));
        this.negativeButtonText = bundle.getCharSequence(hg.Vd("%\u001b\u001c\u0015'\u001b'\u0015.\u0010\" \u001f\u0019\u0017'\u001b\u000b\u001d\u0018\"\r\u0006\u0019", (short) (C1633zX.Xd() ^ (-7412)), (short) (C1633zX.Xd() ^ (-5178))));
        this.negativeButtonContentDescriptionResId = bundle.getInt(C1561oA.ud("g]^Wi]iWpRdba[YiLWUZJRWaEERAOEKNBGEUG9FQ:4N92E", (short) (ZN.Xd() ^ 22245)));
        this.negativeButtonContentDescription = bundle.getCharSequence(C1561oA.yd("jba\\tjtd\u0004gww|xt\u0007o|x\u007fu\u007f\u0003\u000fxz\u0006v\u000b\u0003\u0007\f\u0006\r\t\u001b\f\u0007\u0018", (short) (Od.Xd() ^ (-18281))));
        CharSequence text = this.titleText;
        if (text == null) {
            Context contextRequireContext = requireContext();
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.Yd("drixvqm8n{{\u0003t~\u0006@V\u0004\u0004\u000b|\u0011\u000e", (short) (C1633zX.Xd() ^ (-18580)))).getMethod(Xg.qd(":9I(<KHOM?BQ", (short) (C1499aX.Xd() ^ (-12063)), (short) (C1499aX.Xd() ^ (-13106))), new Class[0]);
            try {
                method.setAccessible(true);
                text = ((Resources) method.invoke(contextRequireContext, objArr)).getText(this.titleTextResId);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.fullTitleText = text;
        this.singleLineTitleText = getFirstLineBySeparator(text);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) throws Throwable {
        Dialog dialog = new Dialog(requireContext(), getThemeResId(requireContext()));
        Context context = dialog.getContext();
        this.fullscreen = isFullscreen(context);
        this.background = new MaterialShapeDrawable(context, null, com.google.android.material.R.attr.materialCalendarStyle, com.google.android.material.R.style.Widget_MaterialComponents_MaterialCalendar);
        int[] iArr = com.google.android.material.R.styleable.MaterialCalendar;
        int i2 = com.google.android.material.R.attr.materialCalendarStyle;
        int i3 = com.google.android.material.R.style.Widget_MaterialComponents_MaterialCalendar;
        Class<?> cls = Class.forName(Jg.Wd("@nJ'\nX9Qle: eR/H2J0\u0006\\B$", (short) (ZN.Xd() ^ 7273), (short) (ZN.Xd() ^ 12495)));
        Class<?>[] clsArr = {Class.forName(ZO.xd("Pr[O\u0007\u0001\u001cR2](p/kK2\u0007<4\u0003rz\u0006\u0002J", (short) (C1580rY.Xd() ^ (-1105)), (short) (C1580rY.Xd() ^ (-4704)))), int[].class, Integer.TYPE, Integer.TYPE};
        Object[] objArr = {null, iArr, Integer.valueOf(i2), Integer.valueOf(i3)};
        Method method = cls.getMethod(C1626yg.Ud("p,z\u000f_&.%k_FUV]J\"Pb7\u000b,\u0012", (short) (Od.Xd() ^ (-21090)), (short) (Od.Xd() ^ (-13318))), clsArr);
        try {
            method.setAccessible(true);
            TypedArray typedArray = (TypedArray) method.invoke(context, objArr);
            int color = typedArray.getColor(com.google.android.material.R.styleable.MaterialCalendar_backgroundTint, 0);
            typedArray.recycle();
            this.background.initializeElevationOverlay(context);
            this.background.setFillColor(ColorStateList.valueOf(color));
            this.background.setElevation(ViewCompat.getElevation(dialog.getWindow().getDecorView()));
            return dialog;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Throwable {
        View viewInflate = layoutInflater.inflate(this.fullscreen ? com.google.android.material.R.layout.mtrl_picker_fullscreen : com.google.android.material.R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        DayViewDecorator dayViewDecorator = this.dayViewDecorator;
        if (dayViewDecorator != null) {
            dayViewDecorator.initialize(context);
        }
        if (this.fullscreen) {
            viewInflate.findViewById(com.google.android.material.R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(getPaddedPickerWidth(context), -2));
        } else {
            viewInflate.findViewById(com.google.android.material.R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(getPaddedPickerWidth(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(com.google.android.material.R.id.mtrl_picker_header_selection_text);
        this.headerSelectionText = textView;
        ViewCompat.setAccessibilityLiveRegion(textView, 1);
        this.headerToggleButton = (CheckableImageButton) viewInflate.findViewById(com.google.android.material.R.id.mtrl_picker_header_toggle);
        this.headerTitleTextView = (TextView) viewInflate.findViewById(com.google.android.material.R.id.mtrl_picker_title_text);
        initHeaderToggle(context);
        this.confirmButton = (Button) viewInflate.findViewById(com.google.android.material.R.id.confirm_button);
        if (getDateSelector().isSelectionComplete()) {
            this.confirmButton.setEnabled(true);
        } else {
            this.confirmButton.setEnabled(false);
        }
        this.confirmButton.setTag(CONFIRM_BUTTON_TAG);
        CharSequence charSequence = this.positiveButtonText;
        if (charSequence != null) {
            this.confirmButton.setText(charSequence);
        } else {
            int i2 = this.positiveButtonTextResId;
            if (i2 != 0) {
                this.confirmButton.setText(i2);
            }
        }
        CharSequence charSequence2 = this.positiveButtonContentDescription;
        if (charSequence2 != null) {
            this.confirmButton.setContentDescription(charSequence2);
        } else if (this.positiveButtonContentDescriptionResId != 0) {
            Button button = this.confirmButton;
            Context context2 = getContext();
            Class<?> cls = Class.forName(Ig.wd("L\b{b>\u0013*\u0004\u0006^\u0007'I`\u0007Y*\\\u0013Ao&<", (short) (C1607wl.Xd() ^ 19052)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (C1499aX.Xd() ^ (-18847));
            int[] iArr = new int["\u0012W:}{7=\u001degi\u0014".length()];
            QB qb = new QB("\u0012W:}{7=\u001degi\u0014");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + i3)) + xuXd.CK(iKK));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                button.setContentDescription(((Resources) method.invoke(context2, objArr)).getText(this.positiveButtonContentDescriptionResId));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        this.confirmButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialDatePicker.1
            AnonymousClass1() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Callback.onClick_enter(view);
                try {
                    Iterator it = MaterialDatePicker.this.onPositiveButtonClickListeners.iterator();
                    while (it.hasNext()) {
                        ((MaterialPickerOnPositiveButtonClickListener) it.next()).onPositiveButtonClick(MaterialDatePicker.this.getSelection());
                    }
                    MaterialDatePicker.this.dismiss();
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
        Button button2 = (Button) viewInflate.findViewById(com.google.android.material.R.id.cancel_button);
        button2.setTag(CANCEL_BUTTON_TAG);
        CharSequence charSequence3 = this.negativeButtonText;
        if (charSequence3 != null) {
            button2.setText(charSequence3);
        } else {
            int i4 = this.negativeButtonTextResId;
            if (i4 != 0) {
                button2.setText(i4);
            }
        }
        CharSequence charSequence4 = this.negativeButtonContentDescription;
        if (charSequence4 != null) {
            button2.setContentDescription(charSequence4);
        } else if (this.negativeButtonContentDescriptionResId != 0) {
            Context context3 = getContext();
            short sXd2 = (short) (C1633zX.Xd() ^ (-19272));
            int[] iArr2 = new int["iujwslf/cnlqain';fdiYkf".length()];
            QB qb2 = new QB("iujwslf/cnlqain';fdiYkf");
            int i5 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i5] = xuXd2.fK(sXd2 + sXd2 + sXd2 + i5 + xuXd2.CK(iKK2));
                i5++;
            }
            Class<?> cls2 = Class.forName(new String(iArr2, 0, i5));
            Class<?>[] clsArr2 = new Class[0];
            Object[] objArr2 = new Object[0];
            short sXd3 = (short) (C1580rY.Xd() ^ (-24201));
            short sXd4 = (short) (C1580rY.Xd() ^ (-14730));
            int[] iArr3 = new int["\u0007\u0006\u0016t\t\u0018\u0015\u001c\u001a\f\u000f\u001e".length()];
            QB qb3 = new QB("\u0007\u0006\u0016t\t\u0018\u0015\u001c\u001a\f\u000f\u001e");
            int i6 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i6] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i6)) - sXd4);
                i6++;
            }
            Method method2 = cls2.getMethod(new String(iArr3, 0, i6), clsArr2);
            try {
                method2.setAccessible(true);
                button2.setContentDescription(((Resources) method2.invoke(context3, objArr2)).getText(this.negativeButtonContentDescriptionResId));
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialDatePicker.2
            AnonymousClass2() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Callback.onClick_enter(view);
                try {
                    Iterator it = MaterialDatePicker.this.onNegativeButtonClickListeners.iterator();
                    while (it.hasNext()) {
                        ((View.OnClickListener) it.next()).onClick(view);
                    }
                    MaterialDatePicker.this.dismiss();
                } finally {
                    Callback.onClick_exit();
                }
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) throws Throwable {
        Iterator<DialogInterface.OnDismissListener> it = this.onDismissListeners.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(OVERRIDE_THEME_RES_ID, this.overrideThemeResId);
        bundle.putParcelable(DATE_SELECTOR_KEY, this.dateSelector);
        CalendarConstraints.Builder builder = new CalendarConstraints.Builder(this.calendarConstraints);
        MaterialCalendar<S> materialCalendar = this.calendar;
        Month currentMonth = materialCalendar == null ? null : materialCalendar.getCurrentMonth();
        if (currentMonth != null) {
            builder.setOpenAt(currentMonth.timeInMillis);
        }
        bundle.putParcelable(CALENDAR_CONSTRAINTS_KEY, builder.build());
        bundle.putParcelable(DAY_VIEW_DECORATOR_KEY, this.dayViewDecorator);
        bundle.putInt(TITLE_TEXT_RES_ID_KEY, this.titleTextResId);
        bundle.putCharSequence(TITLE_TEXT_KEY, this.titleText);
        bundle.putInt(INPUT_MODE_KEY, this.inputMode);
        bundle.putInt(POSITIVE_BUTTON_TEXT_RES_ID_KEY, this.positiveButtonTextResId);
        bundle.putCharSequence(POSITIVE_BUTTON_TEXT_KEY, this.positiveButtonText);
        bundle.putInt(POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY, this.positiveButtonContentDescriptionResId);
        bundle.putCharSequence(POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY, this.positiveButtonContentDescription);
        bundle.putInt(NEGATIVE_BUTTON_TEXT_RES_ID_KEY, this.negativeButtonTextResId);
        bundle.putCharSequence(NEGATIVE_BUTTON_TEXT_KEY, this.negativeButtonText);
        bundle.putInt(NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY, this.negativeButtonContentDescriptionResId);
        bundle.putCharSequence(NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY, this.negativeButtonContentDescription);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() throws Throwable {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.fullscreen) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.background);
            enableEdgeToEdgeIfNeeded(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(com.google.android.material.R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.background, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(requireDialog(), rect));
        }
        startPickerFragment();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.pickerFragment.clearOnSelectionChangedListeners();
        super.onStop();
    }

    public boolean removeOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.onCancelListeners.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.onDismissListeners.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.onNegativeButtonClickListeners.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(MaterialPickerOnPositiveButtonClickListener<? super S> materialPickerOnPositiveButtonClickListener) {
        return this.onPositiveButtonClickListeners.remove(materialPickerOnPositiveButtonClickListener);
    }

    void updateHeader(String str) {
        this.headerSelectionText.setContentDescription(getHeaderContentDescription());
        this.headerSelectionText.setText(str);
    }
}
