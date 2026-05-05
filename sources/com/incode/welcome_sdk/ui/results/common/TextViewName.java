package com.incode.welcome_sdk.ui.results.common;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes5.dex */
public class TextViewName extends AppCompatTextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f17306b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f17307c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f17308a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f17309d;

    public TextViewName(Context context) {
        super(context);
    }

    public TextViewName(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TextViewName(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public void setName(String str, String str2) {
        int i2 = 2 % 2;
        int i3 = f17306b + 25;
        f17307c = i3 % 128;
        if (i3 % 2 != 0) {
            this.f17308a = str;
            this.f17309d = str2;
            int i4 = 26 / 0;
        } else {
            this.f17308a = str;
            this.f17309d = str2;
        }
    }

    public void showFullName() {
        int i2 = 2 % 2;
        int i3 = f17306b + 93;
        f17307c = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            setText(this.f17308a);
            int i4 = f17307c + 115;
            f17306b = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        setText(this.f17308a);
        obj.hashCode();
        throw null;
    }

    public void showShortName() {
        int i2 = 2 % 2;
        int i3 = f17306b + 79;
        f17307c = i3 % 128;
        int i4 = i3 % 2;
        setText(this.f17309d);
        int i5 = f17307c + 83;
        f17306b = i5 % 128;
        int i6 = i5 % 2;
    }
}
