package com.incode.welcome_sdk.ui.qes;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.d.be;
import com.incode.welcome_sdk.ui.qes.QESDocumentsAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class QESDocumentsAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f17063a = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f17064d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f17065c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function1<Integer, Unit> f17066e;

    public /* synthetic */ QESDocumentsAdapter(int i2, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i2, function1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        int i3 = 2 % 2;
        int i4 = f17063a + 3;
        f17064d = i4 % 128;
        int i5 = i4 % 2;
        onBindViewHolder((ViewHolder) viewHolder, i2);
        if (i5 != 0) {
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        int i3 = 2 % 2;
        int i4 = f17064d + 87;
        f17063a = i4 % 128;
        int i5 = i4 % 2;
        ViewHolder viewHolderOnCreateViewHolder = onCreateViewHolder(viewGroup, i2);
        if (i5 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = f17063a + 71;
        f17064d = i6 % 128;
        int i7 = i6 % 2;
        return viewHolderOnCreateViewHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QESDocumentsAdapter(int i2, Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.f17065c = i2;
        this.f17066e = function1;
    }

    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f17067c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f17068d = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Function1<Integer, Unit> f17069b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final be f17070e;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: instrumented$0$bind$-I-V, reason: not valid java name */
        public static /* synthetic */ void m8546instrumented$0$bind$IV(ViewHolder viewHolder, int i2, View view) {
            Callback.onClick_enter(view);
            try {
                b(viewHolder, i2, view);
            } finally {
                Callback.onClick_exit();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ViewHolder(be beVar, Function1<? super Integer, Unit> function1) {
            super(beVar.b());
            Intrinsics.checkNotNullParameter(beVar, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.f17070e = beVar;
            this.f17069b = function1;
        }

        private static final void b(ViewHolder viewHolder, int i2, View view) {
            int i3 = 2 % 2;
            int i4 = f17067c + 21;
            f17068d = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(viewHolder, "");
            viewHolder.f17069b.invoke(Integer.valueOf(i2));
            int i6 = f17067c + 83;
            f17068d = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 24 / 0;
            }
        }

        public final void bind(final int i2) {
            int i3 = 2 % 2;
            be beVar = this.f17070e;
            Context context = beVar.b().getContext();
            beVar.f7049a.setText(context.getString(R.string.onboard_sdk_qes_documents_list_item_title, Integer.valueOf(i2 + 1)));
            SpannableString spannableString = new SpannableString(context.getString(R.string.onboard_sdk_qes_documents_list_item_view_doc));
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            beVar.f7050b.setText(spannableString);
            beVar.f7050b.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.qes.QESDocumentsAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    QESDocumentsAdapter.ViewHolder.m8546instrumented$0$bind$IV(this.f$0, i2, view);
                }
            });
            int i4 = f17067c + 59;
            f17068d = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        be beVarD = be.d(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        Intrinsics.checkNotNullExpressionValue(beVarD, "");
        ViewHolder viewHolder = new ViewHolder(beVarD, this.f17066e);
        int i4 = f17064d + 103;
        f17063a = i4 % 128;
        if (i4 % 2 != 0) {
            return viewHolder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        int i2 = 2 % 2;
        int i3 = f17064d + 67;
        int i4 = i3 % 128;
        f17063a = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i5 = this.f17065c;
        int i6 = i4 + 37;
        f17064d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 49 / 0;
        }
        return i5;
    }

    public final void onBindViewHolder(ViewHolder viewHolder, int i2) {
        int i3 = 2 % 2;
        int i4 = f17064d + 49;
        f17063a = i4 % 128;
        if (i4 % 2 == 0) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            viewHolder.bind(i2);
            int i5 = 29 / 0;
        } else {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            viewHolder.bind(i2);
        }
        int i6 = f17064d + 43;
        f17063a = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void updateNumberOfDocs(int i2) {
        int i3 = 2 % 2;
        int i4 = f17063a;
        int i5 = i4 + 13;
        f17064d = i5 % 128;
        int i6 = i5 % 2;
        if (this.f17065c != i2) {
            int i7 = i4 + 69;
            f17064d = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 59 / 0;
                if (i2 < 0) {
                    return;
                }
            } else if (i2 < 0) {
                return;
            }
            this.f17065c = i2;
            notifyDataSetChanged();
        }
    }
}
