package com.incode.welcome_sdk.commons.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class FormAdapter extends ArrayAdapter<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f5916a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5917b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LayoutInflater f5918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<String> f5919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f5920e;

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final /* synthetic */ Object getItem(int i2) {
        int i3 = 2 % 2;
        int i4 = f5917b + 99;
        f5916a = i4 % 128;
        if (i4 % 2 != 0) {
            return d(i2);
        }
        d(i2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private FormAdapter(Context context, List<String> list, String str, int i2) {
        super(context, R.layout.onboard_sdk_spinner_view);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.f5920e = i2;
        Object systemService = context.getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "");
        this.f5918c = (LayoutInflater) systemService;
        ArrayList arrayList = new ArrayList();
        this.f5919d = arrayList;
        arrayList.add(str);
        arrayList.addAll(list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormAdapter(Context context, String[] strArr, String str) {
        this(context, (List<String>) ArraysKt.toList(strArr), str, 4);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FormAdapter(Context context, String[] strArr, String str, byte b2) {
        this(context, (List<String>) ArraysKt.toList(strArr), str, 2);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public final void setData(List<String> list) {
        int i2 = 2 % 2;
        int i3 = f5916a + 47;
        f5917b = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            this.f5919d.addAll(list);
            notifyDataSetChanged();
            int i4 = 83 / 0;
        } else {
            Intrinsics.checkNotNullParameter(list, "");
            this.f5919d.addAll(list);
            notifyDataSetChanged();
        }
        int i5 = f5917b + 87;
        f5916a = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        int i2 = 2 % 2;
        int i3 = f5917b + 79;
        f5916a = i3 % 128;
        int i4 = i3 % 2;
        int size = this.f5919d.size();
        if (i4 == 0) {
            int i5 = 55 / 0;
        }
        return size;
    }

    private String d(int i2) {
        int i3 = 2 % 2;
        int i4 = f5916a + 75;
        f5917b = i4 % 128;
        int i5 = i4 % 2;
        String str = this.f5919d.get(i2);
        if (i5 == 0) {
            return str;
        }
        throw null;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        int i3 = 2 % 2;
        int i4 = f5916a + 5;
        f5917b = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(viewGroup, "");
            return e(i2, view, viewGroup, R.layout.onboard_sdk_spinner_view);
        }
        Intrinsics.checkNotNullParameter(viewGroup, "");
        int i5 = 3 / 0;
        return e(i2, view, viewGroup, R.layout.onboard_sdk_spinner_view);
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        int i3 = 2 % 2;
        int i4 = f5916a + 81;
        f5917b = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        View viewE = e(i2, view, viewGroup, R.layout.onboard_sdk_spinner_drop_down_view);
        int i6 = f5916a + 81;
        f5917b = i6 % 128;
        int i7 = i6 % 2;
        return viewE;
    }

    private final View e(int i2, View view, ViewGroup viewGroup, int i3) {
        c cVar;
        int i4 = 2 % 2;
        int i5 = f5917b + 51;
        f5916a = i5 % 128;
        if (i5 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (view != null) {
            Object tag = view.getTag();
            Intrinsics.checkNotNull(tag, "");
            cVar = (c) tag;
        } else {
            view = this.f5918c.inflate(i3, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(view, "");
            cVar = new c(view);
            view.setTag(cVar);
            int i6 = f5917b + 17;
            f5916a = i6 % 128;
            int i7 = i6 % 2;
        }
        cVar.c(d(i2), i2, this.f5920e);
        int i8 = f5917b + 51;
        f5916a = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 17 / 0;
        }
        return view;
    }

    static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f5921b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f5922d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f5923a;

        public c(View view) {
            Intrinsics.checkNotNullParameter(view, "");
            View viewFindViewById = view.findViewById(R.id.text);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.f5923a = (TextView) viewFindViewById;
        }

        public final void c(String str, int i2, int i3) {
            int i4 = 2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            if (i2 == 0) {
                int i5 = f5921b + 115;
                f5922d = i5 % 128;
                if (i5 % 2 == 0) {
                    this.f5923a.setHint(str);
                    this.f5923a.setText("");
                    throw null;
                }
                this.f5923a.setHint(str);
                this.f5923a.setText("");
            } else {
                this.f5923a.setHint("");
                this.f5923a.setText(str);
            }
            if (i3 == 2 || i3 == 3) {
                int dimensionPixelSize = this.f5923a.getResources().getDimensionPixelSize(R.dimen.onboard_sdk_ekyc_form_text_padding);
                this.f5923a.setTextAlignment(i3);
                TextView textView = this.f5923a;
                textView.setPadding(dimensionPixelSize, textView.getPaddingTop(), dimensionPixelSize, this.f5923a.getPaddingBottom());
            }
            int i6 = f5922d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f5921b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 97 / 0;
            }
        }
    }
}
