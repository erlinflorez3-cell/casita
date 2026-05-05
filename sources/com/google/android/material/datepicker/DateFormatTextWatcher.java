package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.material.R;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import cz.msebera.android.httpclient.message.TokenParser;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import kotlin.text.Typography;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
abstract class DateFormatTextWatcher extends TextWatcherAdapter {
    private final CalendarConstraints constraints;
    private final DateFormat dateFormat;
    private final String formatHint;
    private int lastLength = 0;
    private final String outOfRange;
    private final Runnable setErrorCallback;
    private Runnable setRangeErrorCallback;
    private final TextInputLayout textInputLayout;

    DateFormatTextWatcher(final String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) throws Throwable {
        this.formatHint = str;
        this.dateFormat = dateFormat;
        this.textInputLayout = textInputLayout;
        this.constraints = calendarConstraints;
        Context context = textInputLayout.getContext();
        int i2 = R.string.mtrl_picker_out_of_range;
        Class<?> cls = Class.forName(EO.Od("3\b\u000eBZ\u0011]*\u000e<7]x\u0012\u0012o!3\nw(\u0003X", (short) (C1499aX.Xd() ^ (-2476))));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        short sXd = (short) (OY.Xd() ^ AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
        int[] iArr = new int["QN\\:ZWMQI".length()];
        QB qb = new QB("QN\\:ZWMQI");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            this.outOfRange = (String) method.invoke(context, objArr);
            this.setErrorCallback = new Runnable() { // from class: com.google.android.material.datepicker.DateFormatTextWatcher$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.m7627x5657fb8e(str);
                }
            };
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private Runnable createRangeErrorCallback(final long j2) {
        return new Runnable() { // from class: com.google.android.material.datepicker.DateFormatTextWatcher$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m7626x14d77527(j2);
            }
        };
    }

    private String sanitizeDateString(String str) {
        return str.replace(TokenParser.SP, Typography.nbsp);
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.formatHint.length() && editable.length() >= this.lastLength) {
            char cCharAt = this.formatHint.charAt(editable.length());
            if (Character.isLetterOrDigit(cCharAt)) {
                return;
            }
            editable.append(cCharAt);
        }
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.lastLength = charSequence.length();
    }

    /* JADX INFO: renamed from: lambda$createRangeErrorCallback$1$com-google-android-material-datepicker-DateFormatTextWatcher, reason: not valid java name */
    /* synthetic */ void m7626x14d77527(long j2) {
        this.textInputLayout.setError(String.format(this.outOfRange, sanitizeDateString(DateStrings.getDateString(j2))));
        onInvalidDate();
    }

    /* JADX INFO: renamed from: lambda$new$0$com-google-android-material-datepicker-DateFormatTextWatcher, reason: not valid java name */
    /* synthetic */ void m7627x5657fb8e(String str) throws Throwable {
        TextInputLayout textInputLayout = this.textInputLayout;
        DateFormat dateFormat = this.dateFormat;
        Context context = textInputLayout.getContext();
        int i2 = R.string.mtrl_picker_invalid_format;
        Class<?> cls = Class.forName(C1593ug.zd("m{r\u0002\u007fzvAw\u0005\u0005\f}\b\u000fI_\r\r\u0014\u0006\u001a\u0017", (short) (FB.Xd() ^ 14094), (short) (FB.Xd() ^ 23041)));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(i2)};
        short sXd = (short) (FB.Xd() ^ 4652);
        int[] iArr = new int["1.<\u001a:7-1)".length()];
        QB qb = new QB("1.<\u001a:7-1)");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(sXd + sXd + i3 + xuXd.CK(iKK));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            String str2 = (String) method.invoke(context, objArr);
            int i4 = R.string.mtrl_picker_invalid_format_use;
            Class<?> cls2 = Class.forName(C1561oA.Kd("UcZigb^)_llseov1Gtt{m\u0002~", (short) (C1633zX.Xd() ^ (-14857))));
            Class<?>[] clsArr2 = {Integer.TYPE};
            Object[] objArr2 = {Integer.valueOf(i4)};
            short sXd2 = (short) (C1633zX.Xd() ^ (-15957));
            short sXd3 = (short) (C1633zX.Xd() ^ (-2899));
            int[] iArr2 = new int["Qt=T%]N\u0014H".length()];
            QB qb2 = new QB("Qt=T%]N\u0014H");
            int i5 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i5] = xuXd2.fK(((i5 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                i5++;
            }
            Method method2 = cls2.getMethod(new String(iArr2, 0, i5), clsArr2);
            try {
                method2.setAccessible(true);
                String str3 = String.format((String) method2.invoke(context, objArr2), sanitizeDateString(str));
                int i6 = R.string.mtrl_picker_invalid_format_example;
                Class<?> cls3 = Class.forName(C1561oA.Xd("Q_Vec^Z%[hhoakr-Cppwi}z", (short) (OY.Xd() ^ 11201)));
                Class<?>[] clsArr3 = {Integer.TYPE};
                Object[] objArr3 = {Integer.valueOf(i6)};
                Method method3 = cls3.getMethod(Wg.vd("po\u007f_\u0002\u0001x~h", (short) (C1633zX.Xd() ^ (-4916))), clsArr3);
                try {
                    method3.setAccessible(true);
                    String str4 = String.format((String) method3.invoke(context, objArr3), sanitizeDateString(dateFormat.format(new Date(UtcDates.getTodayCalendar().getTimeInMillis()))));
                    StringBuilder sbAppend = new StringBuilder().append(str2);
                    String strKd = Qg.kd("\u0017", (short) (FB.Xd() ^ 11368), (short) (FB.Xd() ^ 16934));
                    textInputLayout.setError(sbAppend.append(strKd).append(str3).append(strKd).append(str4).toString());
                    onInvalidDate();
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    void onInvalidDate() {
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.textInputLayout.removeCallbacks(this.setErrorCallback);
        this.textInputLayout.removeCallbacks(this.setRangeErrorCallback);
        this.textInputLayout.setError(null);
        onValidDate(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.formatHint.length()) {
            return;
        }
        try {
            Date date = this.dateFormat.parse(charSequence.toString());
            this.textInputLayout.setError(null);
            long time = date.getTime();
            if (this.constraints.getDateValidator().isValid(time) && this.constraints.isWithinBounds(time)) {
                onValidDate(Long.valueOf(date.getTime()));
                return;
            }
            Runnable runnableCreateRangeErrorCallback = createRangeErrorCallback(time);
            this.setRangeErrorCallback = runnableCreateRangeErrorCallback;
            runValidation(this.textInputLayout, runnableCreateRangeErrorCallback);
        } catch (ParseException unused) {
            runValidation(this.textInputLayout, this.setErrorCallback);
        }
    }

    abstract void onValidDate(Long l2);

    public void runValidation(View view, Runnable runnable) {
        view.post(runnable);
    }
}
