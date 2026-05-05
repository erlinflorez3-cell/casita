package io.sentry;

import io.sentry.util.Objects;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.Qg;
import yg.Wg;

/* JADX INFO: loaded from: classes6.dex */
final class HostnameCache {
    private static HostnameCache INSTANCE = null;
    private final long cacheDuration;
    private final ExecutorService executorService;
    private volatile long expirationTimestamp;
    private final Callable<InetAddress> getLocalhost;
    private volatile String hostname;
    private final AtomicBoolean updateRunning;
    private static final long HOSTNAME_CACHE_DURATION = TimeUnit.HOURS.toMillis(5);
    private static final long GET_HOSTNAME_TIMEOUT = TimeUnit.SECONDS.toMillis(1);

    private static final class HostnameCacheThreadFactory implements ThreadFactory {
        private int cnt;

        private HostnameCacheThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb = new StringBuilder("SentryHostnameCache-");
            int i2 = this.cnt;
            this.cnt = i2 + 1;
            Thread thread = new Thread(runnable, sb.append(i2).toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    private HostnameCache() {
        this(HOSTNAME_CACHE_DURATION);
    }

    HostnameCache(long j2) {
        this(j2, new Callable() { // from class: io.sentry.HostnameCache$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return InetAddress.getLocalHost();
            }
        });
    }

    HostnameCache(long j2, Callable<InetAddress> callable) throws Throwable {
        this.updateRunning = new AtomicBoolean(false);
        Object[] objArr = {new HostnameCacheThreadFactory()};
        Method declaredMethod = Class.forName(Wg.Zd("La\fnP\u0012'\u0019=OB'X#UgHuX\u0014\u001dq~\"\u00050$4Q#", (short) (C1633zX.Xd() ^ (-3455)), (short) (C1633zX.Xd() ^ (-9054)))).getDeclaredMethod(Wg.vd("\u001d\u0015(\u0005\u0014\u001a\u0014\u001a\u001c\f!,\u0018\u0015\u0019z\u0017\u0005\u0004\u0017\u000f\u000b\u000f", (short) (C1499aX.Xd() ^ (-13753))), Class.forName(C1561oA.Xd("zr\ttB\u000b\u000b\u0001\u0005G}\u000b\u000b\u0001\u0014\u0012\u0013\u0007\u0011\u0018Ry\u000f\u001a\u000e\u000b\u000fq\u000e\u0011#\u001f#+", (short) (C1607wl.Xd() ^ 30495))));
        try {
            declaredMethod.setAccessible(true);
            this.executorService = (ExecutorService) declaredMethod.invoke(null, objArr);
            this.cacheDuration = j2;
            this.getLocalhost = (Callable) Objects.requireNonNull(callable, Qg.kd("'$2\t+\u001e\u001b% &))S\u001c%P\"\u0014\u001f\"\u0015\u001d\u000f\r", (short) (C1607wl.Xd() ^ 17386), (short) (C1607wl.Xd() ^ 7727)));
            updateCache();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static HostnameCache getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HostnameCache();
        }
        return INSTANCE;
    }

    private void handleCacheUpdateFailure() {
        this.expirationTimestamp = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(1L);
    }

    private void updateCache() {
        try {
            this.executorService.submit(new Callable() { // from class: io.sentry.HostnameCache$$ExternalSyntheticLambda1
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f$0.m8866lambda$updateCache$1$iosentryHostnameCache();
                }
            }).get(GET_HOSTNAME_TIMEOUT, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            handleCacheUpdateFailure();
        } catch (RuntimeException | ExecutionException | TimeoutException unused2) {
            handleCacheUpdateFailure();
        }
    }

    void close() {
        this.executorService.shutdown();
    }

    String getHostname() {
        if (this.expirationTimestamp < System.currentTimeMillis() && this.updateRunning.compareAndSet(false, true)) {
            updateCache();
        }
        return this.hostname;
    }

    boolean isClosed() {
        return this.executorService.isShutdown();
    }

    /* JADX INFO: renamed from: lambda$updateCache$1$io-sentry-HostnameCache, reason: not valid java name */
    /* synthetic */ Void m8866lambda$updateCache$1$iosentryHostnameCache() throws Exception {
        try {
            this.hostname = this.getLocalhost.call().getCanonicalHostName();
            this.expirationTimestamp = System.currentTimeMillis() + this.cacheDuration;
            this.updateRunning.set(false);
            return null;
        } catch (Throwable th) {
            this.updateRunning.set(false);
            throw th;
        }
    }
}
