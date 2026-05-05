package com.incode.welcome_sdk.commons.ui.checkbox;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.R;

/* JADX INFO: loaded from: classes5.dex */
public class CheckboxRecyclerViewAdapter extends RecyclerView.Adapter<MyViewHolder> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f5924c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f5925d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CheckboxRecyclerViewClickListener f5926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f5927b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f5928e = false;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        int i3 = 2 % 2;
        int i4 = f5924c + 113;
        f5925d = i4 % 128;
        int i5 = i4 % 2;
        b((MyViewHolder) viewHolder, i2);
        if (i5 != 0) {
            throw null;
        }
        int i6 = f5925d + 1;
        f5924c = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        int i3 = 2 % 2;
        int i4 = f5925d + 67;
        f5924c = i4 % 128;
        int i5 = i4 % 2;
        MyViewHolder myViewHolderC = c(viewGroup);
        int i6 = f5925d + 89;
        f5924c = i6 % 128;
        int i7 = i6 % 2;
        return myViewHolderC;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f5929a = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f5930f = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f5931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CheckBox f5932c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5933d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final CheckboxRecyclerViewClickListener f5934e;

        public MyViewHolder(View view, CheckboxRecyclerViewClickListener checkboxRecyclerViewClickListener) {
            super(view);
            this.f5931b = (TextView) view.findViewById(R.id.text);
            this.f5932c = (CheckBox) view.findViewById(R.id.checkbox);
            this.f5934e = checkboxRecyclerViewClickListener;
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Callback.onClick_enter(view);
            try {
                int i2 = 2 % 2;
                int i3 = f5929a + 89;
                f5930f = i3 % 128;
                if (i3 % 2 != 0) {
                    this.f5934e.onClick(view, this.f5933d);
                    this.f5932c.toggle();
                } else {
                    this.f5934e.onClick(view, this.f5933d);
                    this.f5932c.toggle();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            } finally {
                Callback.onClick_exit();
            }
        }
    }

    public CheckboxRecyclerViewAdapter(String[] strArr, CheckboxRecyclerViewClickListener checkboxRecyclerViewClickListener) {
        this.f5927b = strArr;
        this.f5926a = checkboxRecyclerViewClickListener;
    }

    private MyViewHolder c(ViewGroup viewGroup) {
        int i2 = 2 % 2;
        MyViewHolder myViewHolder = new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.onboard_sdk_checkbox_list_item, viewGroup, false), this.f5926a);
        int i3 = f5924c + 101;
        f5925d = i3 % 128;
        if (i3 % 2 == 0) {
            return myViewHolder;
        }
        throw null;
    }

    private void b(MyViewHolder myViewHolder, int i2) {
        int i3 = 2 % 2;
        int i4 = f5925d + 91;
        f5924c = i4 % 128;
        if (i4 % 2 != 0) {
            myViewHolder.f5931b.setText(this.f5927b[i2]);
            myViewHolder.f5932c.setChecked(this.f5928e);
            myViewHolder.f5933d = i2;
            int i5 = f5924c + 13;
            f5925d = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        myViewHolder.f5931b.setText(this.f5927b[i2]);
        myViewHolder.f5932c.setChecked(this.f5928e);
        myViewHolder.f5933d = i2;
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i2 = 2 % 2;
        int i3 = f5924c + 85;
        int i4 = i3 % 128;
        f5925d = i4;
        int i5 = i3 % 2;
        int length = this.f5927b.length;
        int i6 = i4 + 43;
        f5924c = i6 % 128;
        int i7 = i6 % 2;
        return length;
    }
}
