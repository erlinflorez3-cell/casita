package cz.msebera.android.httpclient.impl.client.cache;

import cz.msebera.android.httpclient.util.Args;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class ExponentialBackOffSchedulingStrategy implements SchedulingStrategy {
    public static final long DEFAULT_BACK_OFF_RATE = 10;
    public static final long DEFAULT_INITIAL_EXPIRY_IN_MILLIS = TimeUnit.SECONDS.toMillis(6);
    public static final long DEFAULT_MAX_EXPIRY_IN_MILLIS = TimeUnit.SECONDS.toMillis(86400);
    private final long backOffRate;
    private final ScheduledExecutorService executor;
    private final long initialExpiryInMillis;
    private final long maxExpiryInMillis;

    public ExponentialBackOffSchedulingStrategy(CacheConfig cacheConfig) {
        this(cacheConfig, 10L, DEFAULT_INITIAL_EXPIRY_IN_MILLIS, DEFAULT_MAX_EXPIRY_IN_MILLIS);
    }

    public ExponentialBackOffSchedulingStrategy(CacheConfig cacheConfig, long j2, long j3, long j4) {
        this(createThreadPoolFromCacheConfig(cacheConfig), j2, j3, j4);
    }

    ExponentialBackOffSchedulingStrategy(ScheduledExecutorService scheduledExecutorService, long j2, long j3, long j4) {
        this.executor = (ScheduledExecutorService) Args.notNull(scheduledExecutorService, "Executor");
        this.backOffRate = Args.notNegative(j2, "BackOffRate");
        this.initialExpiryInMillis = Args.notNegative(j3, "InitialExpiryInMillis");
        this.maxExpiryInMillis = Args.notNegative(j4, "MaxExpiryInMillis");
    }

    @Deprecated
    protected static long checkNotNegative(String str, long j2) {
        if (j2 >= 0) {
            return j2;
        }
        throw new IllegalArgumentException(str + " may not be negative");
    }

    @Deprecated
    protected static <T> T checkNotNull(String str, T t2) {
        if (t2 != null) {
            return t2;
        }
        throw new IllegalArgumentException(str + " may not be null");
    }

    private static ScheduledThreadPoolExecutor createThreadPoolFromCacheConfig(CacheConfig cacheConfig) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(cacheConfig.getAsynchronousWorkersMax());
        scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
        return scheduledThreadPoolExecutor;
    }

    protected long calculateDelayInMillis(int i2) {
        if (i2 > 0) {
            return Math.min((long) (this.initialExpiryInMillis * Math.pow(this.backOffRate, i2 - 1)), this.maxExpiryInMillis);
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.executor.shutdown();
    }

    public long getBackOffRate() {
        return this.backOffRate;
    }

    public long getInitialExpiryInMillis() {
        return this.initialExpiryInMillis;
    }

    public long getMaxExpiryInMillis() {
        return this.maxExpiryInMillis;
    }

    @Override // cz.msebera.android.httpclient.impl.client.cache.SchedulingStrategy
    public void schedule(AsynchronousValidationRequest asynchronousValidationRequest) {
        Args.notNull(asynchronousValidationRequest, "RevalidationRequest");
        this.executor.schedule(asynchronousValidationRequest, calculateDelayInMillis(asynchronousValidationRequest.getConsecutiveFailedAttempts()), TimeUnit.MILLISECONDS);
    }
}
