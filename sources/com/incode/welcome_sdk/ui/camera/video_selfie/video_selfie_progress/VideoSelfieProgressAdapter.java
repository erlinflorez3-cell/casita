package com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.incode.welcome_sdk.R;
import com.incode.welcome_sdk.d.bo;
import com.incode.welcome_sdk.ui.camera.video_selfie.VideoSelfieScanState;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class VideoSelfieProgressAdapter extends RecyclerView.Adapter<VideoSelfieProgressViewHolder> {

    /* JADX INFO: renamed from: a */
    private static int f12608a = 1;

    /* JADX INFO: renamed from: e */
    private static int f12609e = 0;

    /* JADX INFO: renamed from: b */
    private int f12610b;

    /* JADX INFO: renamed from: c */
    private final List<VideoSelfieProgress> f12611c;

    /* JADX INFO: renamed from: d */
    private final Context f12612d;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        int i3 = 2 % 2;
        int i4 = f12608a + 39;
        f12609e = i4 % 128;
        int i5 = i4 % 2;
        onBindViewHolder((VideoSelfieProgressViewHolder) viewHolder, i2);
        int i6 = f12608a + 11;
        f12609e = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        int i3 = 2 % 2;
        int i4 = f12608a + 81;
        f12609e = i4 % 128;
        int i5 = i4 % 2;
        VideoSelfieProgressViewHolder videoSelfieProgressViewHolderOnCreateViewHolder = onCreateViewHolder(viewGroup, i2);
        if (i5 == 0) {
            return videoSelfieProgressViewHolderOnCreateViewHolder;
        }
        throw null;
    }

    public VideoSelfieProgressAdapter(Context context, List<VideoSelfieProgress> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.f12612d = context;
        this.f12611c = list;
        c(list.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final VideoSelfieProgressViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        int i3 = 2 % 2;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        bo boVarC = bo.c(LayoutInflater.from(viewGroup.getContext()), viewGroup);
        Intrinsics.checkNotNullExpressionValue(boVarC, "");
        VideoSelfieProgressViewHolder videoSelfieProgressViewHolder = new VideoSelfieProgressViewHolder(boVarC);
        ViewGroup.LayoutParams layoutParams = videoSelfieProgressViewHolder.getBinding().f7128e.getLayoutParams();
        layoutParams.width = this.f12610b;
        videoSelfieProgressViewHolder.getBinding().f7128e.setLayoutParams(layoutParams);
        int i4 = f12609e + 103;
        f12608a = i4 % 128;
        int i5 = i4 % 2;
        return videoSelfieProgressViewHolder;
    }

    public final void onBindViewHolder(VideoSelfieProgressViewHolder videoSelfieProgressViewHolder, int i2) {
        int i3 = 2 % 2;
        int i4 = f12608a + 65;
        f12609e = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNullParameter(videoSelfieProgressViewHolder, "");
        videoSelfieProgressViewHolder.bind(this.f12611c.get(i2));
        int i6 = f12609e + 9;
        f12608a = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 9 / 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        int i2 = 2 % 2;
        int i3 = f12609e + 47;
        f12608a = i3 % 128;
        int i4 = i3 % 2;
        List<VideoSelfieProgress> list = this.f12611c;
        if (i4 != 0) {
            return list.size();
        }
        list.size();
        throw null;
    }

    private final void c(int i2) {
        int i3 = 2 % 2;
        int i4 = f12608a + 73;
        f12609e = i4 % 128;
        int i5 = i4 % 2;
        float f2 = i2;
        this.f12610b = (int) (((this.f12612d.getResources().getDisplayMetrics().widthPixels - (this.f12612d.getResources().getDimension(R.dimen.onboard_sdk_video_selfie_progress_margin) * 2.0f)) - ((this.f12612d.getResources().getDimension(R.dimen.onboard_sdk_video_selfie_progress_item_margin) * 2.0f) * f2)) / f2);
        int i6 = f12608a + 55;
        f12609e = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void startVideoSelfieProgressStep(VideoSelfieScanState videoSelfieScanState) {
        int i2 = 2 % 2;
        int i3 = f12608a + 67;
        f12609e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(videoSelfieScanState, "");
        d(videoSelfieScanState, VideoSelfieProgressItemState.f12626c);
        int i5 = f12608a + 65;
        f12609e = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void finishVideoSelfieProgressStep(VideoSelfieScanState videoSelfieScanState) {
        int i2 = 2 % 2;
        int i3 = f12608a + 75;
        f12609e = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(videoSelfieScanState, "");
            d(videoSelfieScanState, VideoSelfieProgressItemState.f12628e);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(videoSelfieScanState, "");
        d(videoSelfieScanState, VideoSelfieProgressItemState.f12628e);
        int i4 = f12609e + 61;
        f12608a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
    }

    private final void d(VideoSelfieScanState videoSelfieScanState, VideoSelfieProgressItemState videoSelfieProgressItemState) {
        int i2 = 2 % 2;
        int i3 = f12608a + 33;
        f12609e = i3 % 128;
        int i4 = i3 % 2;
        Iterator<Integer> it = CollectionsKt.getIndices(this.f12611c).iterator();
        int i5 = -1;
        while (it.hasNext()) {
            int i6 = f12609e + 87;
            f12608a = i6 % 128;
            int i7 = i6 % 2;
            int iNextInt = ((IntIterator) it).nextInt();
            if (this.f12611c.get(iNextInt).getVideoSelfieProgressItem().getVideoSelfieScanState() == videoSelfieScanState) {
                int i8 = f12609e + 121;
                f12608a = i8 % 128;
                int i9 = i8 % 2;
                i5 = iNextInt;
            }
        }
        if (i5 != -1) {
            int i10 = f12608a + 17;
            f12609e = i10 % 128;
            int i11 = i10 % 2;
            this.f12611c.set(i5, VideoSelfieProgress.copy$default(this.f12611c.get(i5), VideoSelfieProgressItem.copy$default(this.f12611c.get(i5).getVideoSelfieProgressItem(), null, videoSelfieProgressItemState, 1, null), false, 2, null));
            notifyItemChanged(i5);
        }
    }

    public final void completeVideoSelfieProgress() {
        int i2 = 2 % 2;
        Iterator<Integer> it = CollectionsKt.getIndices(this.f12611c).iterator();
        while (it.hasNext()) {
            int i3 = f12608a + 87;
            f12609e = i3 % 128;
            int i4 = i3 % 2;
            int iNextInt = ((IntIterator) it).nextInt();
            this.f12611c.set(iNextInt, VideoSelfieProgress.copy$default(this.f12611c.get(iNextInt), null, true, 1, null));
            notifyItemChanged(iNextInt);
            int i5 = f12609e + 25;
            f12608a = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean areAllStepsCompleted() {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            java.util.List<com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgress> r2 = r6.f12611c
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r0 = r2 instanceof java.util.Collection
            r4 = 1
            if (r0 == r4) goto L41
        Lc:
            java.util.Iterator r3 = r2.iterator()
        L10:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L56
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressAdapter.f12608a
            int r1 = r0 + 105
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressAdapter.f12609e = r0
            int r1 = r1 % r5
            java.lang.Object r0 = r3.next()
            com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgress r0 = (com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgress) r0
            com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressItem r0 = r0.getVideoSelfieProgressItem()
            com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressItemState r1 = r0.getState()
            com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressItemState r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressItemState.f12628e
            r2 = 0
            if (r1 != r0) goto L3f
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressAdapter.f12608a
            int r1 = r0 + 35
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressAdapter.f12609e = r0
            int r1 = r1 % r5
            r0 = r4
        L3c:
            if (r0 != 0) goto L10
            return r2
        L3f:
            r0 = r2
            goto L3c
        L41:
            int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressAdapter.f12609e
            int r1 = r0 + 99
            int r0 = r1 % 128
            com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressAdapter.f12608a = r0
            int r1 = r1 % r5
            if (r1 == 0) goto L57
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L56
            goto Lc
        L56:
            return r4
        L57:
            java.util.Collection r2 = (java.util.Collection) r2
            r2.isEmpty()
            r0 = 0
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressAdapter.areAllStepsCompleted():boolean");
    }

    public static final class VideoSelfieProgressViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        private static int f12613a = 1;

        /* JADX INFO: renamed from: c */
        private static int f12614c = 0;

        /* JADX INFO: renamed from: b */
        private final bo f12615b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VideoSelfieProgressViewHolder(bo boVar) {
            super(boVar.b());
            Intrinsics.checkNotNullParameter(boVar, "");
            this.f12615b = boVar;
        }

        public final bo getBinding() {
            int i2 = 2 % 2;
            int i3 = f12614c + 111;
            f12613a = i3 % 128;
            int i4 = i3 % 2;
            bo boVar = this.f12615b;
            if (i4 == 0) {
                int i5 = 85 / 0;
            }
            return boVar;
        }

        public final void bind(VideoSelfieProgress videoSelfieProgress) {
            int i2;
            int i3 = 2 % 2;
            Intrinsics.checkNotNullParameter(videoSelfieProgress, "");
            bo boVar = this.f12615b;
            ViewGroup.LayoutParams layoutParams = boVar.f7128e.getLayoutParams();
            if (!(!videoSelfieProgress.isVideoSelfieProgressCompleted())) {
                e(videoSelfieProgress.getVideoSelfieProgressItem());
                return;
            }
            int i4 = WhenMappings.f12616a[videoSelfieProgress.getVideoSelfieProgressItem().getState().ordinal()];
            if (i4 == 1) {
                boVar.f7125a.setVisibility(4);
                layoutParams.height /= 2;
                boVar.f7128e.setLayoutParams(layoutParams);
                boVar.f7128e.setAlpha(0.25f);
                return;
            }
            if (i4 != 2) {
                if (i4 == 3) {
                    boVar.f7125a.setImageResource(R.drawable.onboard_sdk_checkmark_transparent);
                    boVar.f7125a.setVisibility(0);
                    layoutParams.height = (int) boVar.b().getContext().getResources().getDimension(R.dimen.onboard_sdk_video_selfie_progress_item_height);
                    boVar.f7128e.setLayoutParams(layoutParams);
                    boVar.f7128e.setAlpha(0.5f);
                }
                int i5 = f12614c + 39;
                f12613a = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
                return;
            }
            boVar.f7128e.setAlpha(1.0f);
            layoutParams.height = (int) boVar.b().getContext().getResources().getDimension(R.dimen.onboard_sdk_video_selfie_progress_item_height);
            boVar.f7128e.setLayoutParams(layoutParams);
            switch (WhenMappings.f12618d[videoSelfieProgress.getVideoSelfieProgressItem().getVideoSelfieScanState().ordinal()]) {
                case 1:
                    i2 = R.drawable.onboard_sdk_ic_user_permission_checkmark_transparent;
                    break;
                case 2:
                    i2 = R.drawable.onboard_sdk_selfie_scan_transparent;
                    int i6 = f12614c + 103;
                    f12613a = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 4 / 2;
                    }
                    break;
                case 3:
                    i2 = R.drawable.onboard_sdk_ic_front_id_transparent;
                    break;
                case 4:
                    i2 = R.drawable.onboard_sdk_back_id_transparent;
                    int i8 = f12613a + 9;
                    f12614c = i8 % 128;
                    int i9 = i8 % 2;
                    break;
                case 5:
                    i2 = R.drawable.onboard_sdk_ic_questions_transparent;
                    break;
                case 6:
                    i2 = R.drawable.onboard_sdk_ic_message_transparent;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            boVar.f7125a.setImageResource(i2);
            boVar.f7125a.setVisibility(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0021 A[PHI: r4
  0x0021: PHI (r4v3 com.incode.welcome_sdk.d.bo) = (r4v0 com.incode.welcome_sdk.d.bo), (r4v4 com.incode.welcome_sdk.d.bo) binds: [B:23:0x0064, B:18:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0067 A[PHI: r4
  0x0067: PHI (r4v1 com.incode.welcome_sdk.d.bo) = (r4v0 com.incode.welcome_sdk.d.bo), (r4v4 com.incode.welcome_sdk.d.bo) binds: [B:23:0x0064, B:18:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void e(com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressItem r7) {
            /*
                r6 = this;
                r5 = 2
                int r0 = r5 % r5
                int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressAdapter.VideoSelfieProgressViewHolder.f12614c
                int r1 = r0 + 9
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressAdapter.VideoSelfieProgressViewHolder.f12613a = r0
                int r1 = r1 % r5
                r3 = 0
                if (r1 != 0) goto L57
                com.incode.welcome_sdk.d.bo r4 = r6.f12615b
                com.incode.welcome_sdk.views.IncodeImageView r0 = r4.f7128e
                r0.getLayoutParams()
                com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressItemState r2 = r7.getState()
                com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressItemState r1 = com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressItemState.f12628e
                r0 = 14
                int r0 = r0 / r3
                if (r2 != r1) goto L67
            L21:
                com.incode.welcome_sdk.views.IncodeImageView r1 = r4.f7125a
                int r0 = com.incode.welcome_sdk.R.drawable.onboard_sdk_checkmark_green
                r1.setImageResource(r0)
                com.incode.welcome_sdk.views.IncodeImageView r1 = r4.f7128e
                int r0 = com.incode.welcome_sdk.R.drawable.onboard_sdk_video_selfie_progress_bar_green
                r1.setImageResource(r0)
            L2f:
                com.incode.welcome_sdk.views.IncodeImageView r1 = r4.f7128e
                r0 = 1065353216(0x3f800000, float:1.0)
                r1.setAlpha(r0)
                com.incode.welcome_sdk.views.IncodeImageView r0 = r4.f7128e
                android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout r0 = r4.b()
                android.content.Context r0 = r0.getContext()
                android.content.res.Resources r1 = r0.getResources()
                int r0 = com.incode.welcome_sdk.R.dimen.onboard_sdk_video_selfie_progress_item_height
                float r0 = r1.getDimension(r0)
                int r0 = (int) r0
                r2.height = r0
                com.incode.welcome_sdk.views.IncodeImageView r0 = r4.f7125a
                r0.setVisibility(r3)
                return
            L57:
                com.incode.welcome_sdk.d.bo r4 = r6.f12615b
                com.incode.welcome_sdk.views.IncodeImageView r0 = r4.f7128e
                r0.getLayoutParams()
                com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressItemState r1 = r7.getState()
                com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressItemState r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressItemState.f12628e
                if (r1 != r0) goto L67
                goto L21
            L67:
                com.incode.welcome_sdk.views.IncodeImageView r1 = r4.f7125a
                int r0 = com.incode.welcome_sdk.R.drawable.onboard_sdk_cancel_red
                r1.setImageResource(r0)
                com.incode.welcome_sdk.views.IncodeImageView r1 = r4.f7128e
                int r0 = com.incode.welcome_sdk.R.drawable.onboard_sdk_video_selfie_progress_bar_red
                r1.setImageResource(r0)
                int r0 = com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressAdapter.VideoSelfieProgressViewHolder.f12614c
                int r1 = r0 + 79
                int r0 = r1 % 128
                com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressAdapter.VideoSelfieProgressViewHolder.f12613a = r0
                int r1 = r1 % r5
                goto L2f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressAdapter.VideoSelfieProgressViewHolder.e(com.incode.welcome_sdk.ui.camera.video_selfie.video_selfie_progress.VideoSelfieProgressItem):void");
        }

        public /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f12616a;

            /* JADX INFO: renamed from: c */
            private static int f12617c = 0;

            /* JADX INFO: renamed from: d */
            public static final /* synthetic */ int[] f12618d;

            /* JADX INFO: renamed from: e */
            private static int f12619e = 1;

            static {
                int[] iArr = new int[VideoSelfieScanState.values().length];
                try {
                    iArr[VideoSelfieScanState.f12196b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VideoSelfieScanState.f12197c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[VideoSelfieScanState.f12199e.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[VideoSelfieScanState.f12195a.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[VideoSelfieScanState.f12203i.ordinal()] = 5;
                    int i2 = f12617c + 85;
                    f12619e = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[VideoSelfieScanState.f12204j.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f12618d = iArr;
                int[] iArr2 = new int[VideoSelfieProgressItemState.values().length];
                try {
                    iArr2[VideoSelfieProgressItemState.f12624a.ordinal()] = 1;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[VideoSelfieProgressItemState.f12626c.ordinal()] = 2;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[VideoSelfieProgressItemState.f12628e.ordinal()] = 3;
                    int i4 = f12617c + 33;
                    f12619e = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 2 % 2;
                    }
                } catch (NoSuchFieldError unused9) {
                }
                f12616a = iArr2;
                int i6 = f12617c + 53;
                f12619e = i6 % 128;
                int i7 = i6 % 2;
            }
        }
    }
}
