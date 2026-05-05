package androidx.webkit;

/* JADX INFO: loaded from: classes4.dex */
public class SpeculativeLoadingConfig {
    private final int mMaxPrefetches;
    private final int mMaxPrerenders;
    private final int mPrefetchTTLSeconds;

    private SpeculativeLoadingConfig(int i2, int i3, int i4) {
        this.mPrefetchTTLSeconds = i2;
        this.mMaxPrefetches = i3;
        this.mMaxPrerenders = i4;
    }

    public int getPrefetchTtlSeconds() {
        return this.mPrefetchTTLSeconds;
    }

    public int getMaxPrefetches() {
        return this.mMaxPrefetches;
    }

    public int getMaxPrerenders() {
        return this.mMaxPrerenders;
    }

    public static final class Builder {
        private int mMaxPrefetches;
        private int mMaxPrerenders;
        private int mPrefetchTTLSeconds;

        public Builder setPrefetchTtlSeconds(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("Prefetch TTL must be greater than 0");
            }
            this.mPrefetchTTLSeconds = i2;
            return this;
        }

        public Builder setMaxPrefetches(int i2) {
            if (i2 < 1) {
                throw new IllegalArgumentException("Max prefetches must be greater than 0");
            }
            this.mMaxPrefetches = i2;
            return this;
        }

        public Builder setMaxPrerenders(int i2) {
            if (i2 < 1) {
                throw new IllegalArgumentException("Max prerenders must be greater than 0");
            }
            this.mMaxPrerenders = i2;
            return this;
        }

        public SpeculativeLoadingConfig build() {
            return new SpeculativeLoadingConfig(this.mPrefetchTTLSeconds, this.mMaxPrefetches, this.mMaxPrerenders);
        }
    }
}
