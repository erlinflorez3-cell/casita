package com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_checks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.incode.welcome_sdk.d.bp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoSelfieChecksAdapter extends RecyclerView.Adapter<VideoSelfieChecksViewHolder> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f12594b = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f12595d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<VideoSelfieIntroCheck> f12596a = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        int i3 = 2 % 2;
        int i4 = f12595d + 13;
        f12594b = i4 % 128;
        int i5 = i4 % 2;
        onBindViewHolder((VideoSelfieChecksViewHolder) viewHolder, i2);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        int i3 = 2 % 2;
        int i4 = f12594b + 35;
        f12595d = i4 % 128;
        int i5 = i4 % 2;
        VideoSelfieChecksViewHolder videoSelfieChecksViewHolderOnCreateViewHolder = onCreateViewHolder(viewGroup, i2);
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = f12594b + 87;
        f12595d = i6 % 128;
        int i7 = i6 % 2;
        return videoSelfieChecksViewHolderOnCreateViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final VideoSelfieChecksViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        bp bpVarD = bp.d(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        Intrinsics.checkNotNullExpressionValue(bpVarD, "");
        VideoSelfieChecksViewHolder videoSelfieChecksViewHolder = new VideoSelfieChecksViewHolder(bpVarD);
        int i4 = f12594b + 17;
        f12595d = i4 % 128;
        if (i4 % 2 == 0) {
            return videoSelfieChecksViewHolder;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        int i2 = 2 % 2;
        int i3 = f12595d + 29;
        f12594b = i3 % 128;
        int i4 = i3 % 2;
        int size = this.f12596a.size();
        int i5 = f12595d + 79;
        f12594b = i5 % 128;
        int i6 = i5 % 2;
        return size;
    }

    public final void onBindViewHolder(VideoSelfieChecksViewHolder videoSelfieChecksViewHolder, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(videoSelfieChecksViewHolder, "");
        VideoSelfieIntroCheck videoSelfieIntroCheck = this.f12596a.get(i2);
        boolean z2 = true;
        if (this.f12596a.size() - 1 == i2) {
            int i4 = f12595d;
            int i5 = i4 + 87;
            f12594b = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 61;
            f12594b = i7 % 128;
            int i8 = i7 % 2;
        } else {
            z2 = false;
        }
        videoSelfieChecksViewHolder.bind(videoSelfieIntroCheck, z2);
    }

    public final void addItems(List<VideoSelfieIntroCheck> list) {
        int i2 = 2 % 2;
        int i3 = f12595d + 11;
        f12594b = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
        } else {
            Intrinsics.checkNotNullParameter(list, "");
        }
        this.f12596a.addAll(list);
        notifyItemRangeChanged(0, list.size());
    }

    public static final class VideoSelfieChecksViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f12597a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f12598b = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final bp f12599e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VideoSelfieChecksViewHolder(bp bpVar) {
            super(bpVar.b());
            Intrinsics.checkNotNullParameter(bpVar, "");
            this.f12599e = bpVar;
        }

        public final bp getBinding() {
            int i2 = 2 % 2;
            int i3 = f12598b;
            int i4 = i3 + 125;
            f12597a = i4 % 128;
            int i5 = i4 % 2;
            bp bpVar = this.f12599e;
            int i6 = i3 + 77;
            f12597a = i6 % 128;
            if (i6 % 2 == 0) {
                return bpVar;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void bind(VideoSelfieIntroCheck videoSelfieIntroCheck, boolean z2) {
            View view;
            int i2;
            int i3 = 2 % 2;
            int i4 = f12598b + 65;
            f12597a = i4 % 128;
            int i5 = i4 % 2;
            Intrinsics.checkNotNullParameter(videoSelfieIntroCheck, "");
            bp bpVar = this.f12599e;
            bpVar.f7129b.setText(bpVar.b().getContext().getString(videoSelfieIntroCheck.getText()));
            bpVar.f7132e.setImageResource(videoSelfieIntroCheck.getIcon());
            if (z2) {
                int i6 = f12598b + 45;
                f12597a = i6 % 128;
                if (i6 % 2 != 0) {
                    view = bpVar.f7131d;
                    i2 = 14;
                } else {
                    view = bpVar.f7131d;
                    i2 = 8;
                }
                view.setVisibility(i2);
            }
        }
    }
}
