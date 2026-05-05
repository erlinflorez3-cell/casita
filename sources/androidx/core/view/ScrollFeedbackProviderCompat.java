package androidx.core.view;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class ScrollFeedbackProviderCompat {
    private final ScrollFeedbackProviderImpl mImpl;

    private interface ScrollFeedbackProviderImpl {
        void onScrollLimit(int i2, int i3, int i4, boolean z2);

        void onScrollProgress(int i2, int i3, int i4, int i5);

        void onSnapToItem(int i2, int i3, int i4);
    }

    private ScrollFeedbackProviderCompat(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.mImpl = new ScrollFeedbackProviderApi35Impl(view);
        } else {
            this.mImpl = new ScrollFeedbackProviderBaseImpl();
        }
    }

    public static ScrollFeedbackProviderCompat createProvider(View view) {
        return new ScrollFeedbackProviderCompat(view);
    }

    public void onSnapToItem(int i2, int i3, int i4) {
        this.mImpl.onSnapToItem(i2, i3, i4);
    }

    public void onScrollLimit(int i2, int i3, int i4, boolean z2) {
        this.mImpl.onScrollLimit(i2, i3, i4, z2);
    }

    public void onScrollProgress(int i2, int i3, int i4, int i5) {
        this.mImpl.onScrollProgress(i2, i3, i4, i5);
    }

    private static class ScrollFeedbackProviderApi35Impl implements ScrollFeedbackProviderImpl {
        private final ScrollFeedbackProvider mProvider;

        ScrollFeedbackProviderApi35Impl(View view) {
            this.mProvider = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onSnapToItem(int i2, int i3, int i4) {
            this.mProvider.onSnapToItem(i2, i3, i4);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollLimit(int i2, int i3, int i4, boolean z2) {
            this.mProvider.onScrollLimit(i2, i3, i4, z2);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollProgress(int i2, int i3, int i4, int i5) {
            this.mProvider.onScrollProgress(i2, i3, i4, i5);
        }
    }

    private static class ScrollFeedbackProviderBaseImpl implements ScrollFeedbackProviderImpl {
        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollLimit(int i2, int i3, int i4, boolean z2) {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onScrollProgress(int i2, int i3, int i4, int i5) {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void onSnapToItem(int i2, int i3, int i4) {
        }

        private ScrollFeedbackProviderBaseImpl() {
        }
    }
}
