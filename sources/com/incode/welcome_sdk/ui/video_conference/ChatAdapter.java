package com.incode.welcome_sdk.ui.video_conference;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.commons.utils.i;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ChatAdapter extends RecyclerView.Adapter<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f18048b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f18049e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<VideoConferenceChatMessage> f18050a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f18051c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        int i3 = 2 % 2;
        int i4 = f18048b + 85;
        f18049e = i4 % 128;
        int i5 = i4 % 2;
        onBindViewHolder((c) viewHolder, i2);
        if (i5 == 0) {
            throw null;
        }
        int i6 = f18049e + 93;
        f18048b = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        int i3 = 2 % 2;
        int i4 = f18048b + 59;
        f18049e = i4 % 128;
        int i5 = i4 % 2;
        c cVarOnCreateViewHolder = onCreateViewHolder(viewGroup, i2);
        int i6 = f18049e + 113;
        f18048b = i6 % 128;
        if (i6 % 2 == 0) {
            return cVarOnCreateViewHolder;
        }
        throw null;
    }

    class c extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f18052a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f18054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f18055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ImageView f18056e;

        public c(View view) {
            super(view);
            this.f18056e = (ImageView) view.findViewById(R.id.ivAvatar);
            this.f18055d = (TextView) view.findViewById(R.id.tvMessage);
            this.f18052a = (TextView) view.findViewById(R.id.tvDate);
            this.f18054c = (TextView) view.findViewById(R.id.tvTime);
        }
    }

    public ChatAdapter(List<VideoConferenceChatMessage> list, File file) {
        this.f18050a = list;
        this.f18051c = file;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        int i3 = 2 % 2;
        int i4 = f18048b + 97;
        f18049e = i4 % 128;
        int i5 = i4 % 2;
        int iOrdinal = this.f18050a.get(i2).f18097b.ordinal();
        int i6 = f18049e + 107;
        f18048b = i6 % 128;
        if (i6 % 2 == 0) {
            return iOrdinal;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public c onCreateViewHolder(ViewGroup viewGroup, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = f18048b + 3;
        f18049e = i5 % 128;
        View viewInflate = null;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.onboard_sdk_conference_chat_message_user, viewGroup, false);
                i3 = f18048b + 71;
                f18049e = i3 % 128;
            }
            return new c(viewInflate);
        }
        viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.onboard_sdk_conference_chat_message_interviewer, viewGroup, false);
        i3 = f18049e + 33;
        f18048b = i3 % 128;
        int i6 = i3 % 2;
        return new c(viewInflate);
    }

    public void onBindViewHolder(c cVar, int i2) {
        int i3 = 2 % 2;
        int i4 = f18048b + 89;
        f18049e = i4 % 128;
        int i5 = i4 % 2;
        cVar.f18055d.setText(this.f18050a.get(i2).f18099e);
        cVar.f18052a.setText(i.d(this.f18050a.get(i2).f18098c));
        cVar.f18054c.setText(i.a(this.f18050a.get(i2).f18098c));
        if (1 == cVar.getItemViewType()) {
            Glide.with(cVar.f18056e).load(this.f18051c).skipMemoryCache(true).circleCrop().diskCacheStrategy(DiskCacheStrategy.NONE).placeholder(R.drawable.onboard_sdk_placeholder_face).into(cVar.f18056e);
            int i6 = f18048b + 91;
            f18049e = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i2 = 2 % 2;
        int i3 = f18049e + 55;
        f18048b = i3 % 128;
        int i4 = i3 % 2;
        int size = this.f18050a.size();
        int i5 = f18048b + 27;
        f18049e = i5 % 128;
        if (i5 % 2 != 0) {
            return size;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onNewChatMessage() {
        int i2 = 2 % 2;
        int i3 = f18049e + 121;
        f18048b = i3 % 128;
        int i4 = i3 % 2;
        notifyDataSetChanged();
        int i5 = f18048b + 13;
        f18049e = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 26 / 0;
        }
    }
}
