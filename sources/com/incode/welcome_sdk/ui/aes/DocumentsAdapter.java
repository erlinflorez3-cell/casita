package com.incode.welcome_sdk.ui.aes;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.d.ak;
import com.incode.welcome_sdk.ui.aes.DocumentsAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class DocumentsAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f11039a = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f11040e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1<Integer, Unit> f11041b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11042d;

    public /* synthetic */ DocumentsAdapter(int i2, Function1 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i2, function1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        int i3 = 2 % 2;
        int i4 = f11040e + 47;
        f11039a = i4 % 128;
        int i5 = i4 % 2;
        onBindViewHolder((ViewHolder) viewHolder, i2);
        int i6 = f11039a + 47;
        f11040e = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        int i3 = 2 % 2;
        int i4 = f11039a + 107;
        f11040e = i4 % 128;
        int i5 = i4 % 2;
        ViewHolder viewHolderOnCreateViewHolder = onCreateViewHolder(viewGroup, i2);
        int i6 = f11040e + 101;
        f11039a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 89 / 0;
        }
        return viewHolderOnCreateViewHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DocumentsAdapter(int i2, Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.f11042d = i2;
        this.f11041b = function1;
    }

    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f11043a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f11044c = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ak f11045b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Function1<Integer, Unit> f11046d;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: instrumented$0$bind$-I-V, reason: not valid java name */
        public static /* synthetic */ void m8227instrumented$0$bind$IV(ViewHolder viewHolder, int i2, View view) {
            Callback.onClick_enter(view);
            try {
                e(viewHolder, i2, view);
            } finally {
                Callback.onClick_exit();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ViewHolder(ak akVar, Function1<? super Integer, Unit> function1) {
            super(akVar.e());
            Intrinsics.checkNotNullParameter(akVar, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.f11045b = akVar;
            this.f11046d = function1;
        }

        private static final void e(ViewHolder viewHolder, int i2, View view) {
            int i3 = 2 % 2;
            int i4 = f11044c + 65;
            f11043a = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(viewHolder, "");
            viewHolder.f11046d.invoke(Integer.valueOf(i2));
            int i6 = f11044c + 17;
            f11043a = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void bind(final int i2) {
            int i3 = 2 % 2;
            ak akVar = this.f11045b;
            Context context = akVar.e().getContext();
            akVar.f6877d.setText(context.getString(R.string.onboard_sdk_aes_documents_list_item_title, Integer.valueOf(i2 + 1)));
            SpannableString spannableString = new SpannableString(context.getString(R.string.onboard_sdk_aes_documents_list_item_view_doc));
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            akVar.f6878e.setText(spannableString);
            akVar.f6878e.setOnClickListener(new View.OnClickListener() { // from class: com.incode.welcome_sdk.ui.aes.DocumentsAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DocumentsAdapter.ViewHolder.m8227instrumented$0$bind$IV(this.f$0, i2, view);
                }
            });
            int i4 = f11044c + 115;
            f11043a = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ak akVarE = ak.e(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        Intrinsics.checkNotNullExpressionValue(akVarE, "");
        ViewHolder viewHolder = new ViewHolder(akVarE, this.f11041b);
        int i4 = f11039a + 55;
        f11040e = i4 % 128;
        int i5 = i4 % 2;
        return viewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        int i2 = 2 % 2;
        int i3 = f11040e;
        int i4 = i3 + 93;
        f11039a = i4 % 128;
        int i5 = i4 % 2;
        int i6 = this.f11042d;
        int i7 = i3 + 61;
        f11039a = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    public final void onBindViewHolder(ViewHolder viewHolder, int i2) {
        int i3 = 2 % 2;
        int i4 = f11040e + 47;
        f11039a = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        viewHolder.bind(i2);
        int i6 = f11039a + 29;
        f11040e = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final void updatedNumberOfDocs(int i2) {
        int i3 = 2 % 2;
        int i4 = f11039a;
        int i5 = i4 + 23;
        f11040e = i5 % 128;
        if (i5 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.f11042d != i2) {
            int i6 = i4 + 75;
            f11040e = i6 % 128;
            int i7 = i6 % 2;
            this.f11042d = i2;
            notifyDataSetChanged();
            int i8 = f11039a + 51;
            f11040e = i8 % 128;
            int i9 = i8 % 2;
        }
    }
}
