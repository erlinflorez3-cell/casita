package io.sentry.cache;

import io.sentry.Breadcrumb;
import io.sentry.IScope;
import io.sentry.ScopeObserverAdapter;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanContext;
import io.sentry.cache.tape.ObjectQueue;
import io.sentry.cache.tape.QueueFile;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import io.sentry.util.LazyEvaluator;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class PersistingScopeObserver extends ScopeObserverAdapter {
    public static final String BREADCRUMBS_FILENAME = "breadcrumbs.json";
    public static final String CONTEXTS_FILENAME = "contexts.json";
    public static final String EXTRAS_FILENAME = "extras.json";
    public static final String FINGERPRINT_FILENAME = "fingerprint.json";
    public static final String LEVEL_FILENAME = "level.json";
    public static final String REPLAY_FILENAME = "replay.json";
    public static final String REQUEST_FILENAME = "request.json";
    public static final String SCOPE_CACHE = ".scope-cache";
    public static final String TAGS_FILENAME = "tags.json";
    public static final String TRACE_FILENAME = "trace.json";
    public static final String TRANSACTION_FILENAME = "transaction.json";
    public static final String USER_FILENAME = "user.json";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final LazyEvaluator<ObjectQueue<Breadcrumb>> breadcrumbsQueue = new LazyEvaluator<>(new LazyEvaluator.Evaluator() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda7
        @Override // io.sentry.util.LazyEvaluator.Evaluator
        public final Object evaluate() {
            return this.f$0.m8950lambda$new$0$iosentrycachePersistingScopeObserver();
        }
    });
    private SentryOptions options;

    /* JADX INFO: renamed from: io.sentry.cache.PersistingScopeObserver$1 */
    class AnonymousClass1 implements ObjectQueue.Converter<Breadcrumb> {
        AnonymousClass1() {
        }

        @Override // io.sentry.cache.tape.ObjectQueue.Converter
        public Breadcrumb from(byte[] bArr) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), PersistingScopeObserver.UTF_8));
                try {
                    Breadcrumb breadcrumb = (Breadcrumb) PersistingScopeObserver.this.options.getSerializer().deserialize(bufferedReader, Breadcrumb.class);
                    bufferedReader.close();
                    return breadcrumb;
                } finally {
                }
            } catch (Throwable th) {
                PersistingScopeObserver.this.options.getLogger().log(SentryLevel.ERROR, th, "Error reading entity from scope cache", new Object[0]);
                return null;
            }
        }

        @Override // io.sentry.cache.tape.ObjectQueue.Converter
        public void toStream(Breadcrumb breadcrumb, OutputStream outputStream) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, PersistingScopeObserver.UTF_8));
            try {
                PersistingScopeObserver.this.options.getSerializer().serialize(breadcrumb, bufferedWriter);
                bufferedWriter.close();
            } catch (Throwable th) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public PersistingScopeObserver(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    private void delete(String str) {
        CacheUtils.delete(this.options, SCOPE_CACHE, str);
    }

    private void serializeToDisk(final Runnable runnable) {
        if (this.options.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Serialization task failed", th);
                    return;
                }
            }
            try {
                this.options.getExecutorService().submit(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m8951xf585d0b1(runnable);
                    }
                });
            } catch (Throwable th2) {
                this.options.getLogger().log(SentryLevel.ERROR, "Serialization task could not be scheduled", th2);
            }
        }
    }

    public static <T> void store(SentryOptions sentryOptions, T t2, String str) {
        CacheUtils.store(sentryOptions, t2, SCOPE_CACHE, str);
    }

    private <T> void store(T t2, String str) {
        store(this.options, t2, str);
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void addBreadcrumb(final Breadcrumb breadcrumb) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8949lambda$addBreadcrumb$2$iosentrycachePersistingScopeObserver(breadcrumb);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$addBreadcrumb$2$io-sentry-cache-PersistingScopeObserver */
    /* synthetic */ void m8949lambda$addBreadcrumb$2$iosentrycachePersistingScopeObserver(Breadcrumb breadcrumb) {
        try {
            this.breadcrumbsQueue.getValue().add(breadcrumb);
        } catch (IOException e2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to add breadcrumb to file queue", e2);
        }
    }

    /* JADX INFO: renamed from: lambda$new$0$io-sentry-cache-PersistingScopeObserver */
    /* synthetic */ ObjectQueue m8950lambda$new$0$iosentrycachePersistingScopeObserver() {
        QueueFile queueFileBuild;
        File fileEnsureCacheDir = CacheUtils.ensureCacheDir(this.options, SCOPE_CACHE);
        if (fileEnsureCacheDir == null) {
            this.options.getLogger().log(SentryLevel.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return ObjectQueue.createEmpty();
        }
        File file = new File(fileEnsureCacheDir, BREADCRUMBS_FILENAME);
        try {
            try {
                queueFileBuild = new QueueFile.Builder(file).size(this.options.getMaxBreadcrumbs()).build();
            } catch (IOException unused) {
                file.delete();
                queueFileBuild = new QueueFile.Builder(file).size(this.options.getMaxBreadcrumbs()).build();
            }
            return ObjectQueue.create(queueFileBuild, new ObjectQueue.Converter<Breadcrumb>() { // from class: io.sentry.cache.PersistingScopeObserver.1
                AnonymousClass1() {
                }

                @Override // io.sentry.cache.tape.ObjectQueue.Converter
                public Breadcrumb from(byte[] bArr) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), PersistingScopeObserver.UTF_8));
                        try {
                            Breadcrumb breadcrumb = (Breadcrumb) PersistingScopeObserver.this.options.getSerializer().deserialize(bufferedReader, Breadcrumb.class);
                            bufferedReader.close();
                            return breadcrumb;
                        } finally {
                        }
                    } catch (Throwable th) {
                        PersistingScopeObserver.this.options.getLogger().log(SentryLevel.ERROR, th, "Error reading entity from scope cache", new Object[0]);
                        return null;
                    }
                }

                @Override // io.sentry.cache.tape.ObjectQueue.Converter
                public void toStream(Breadcrumb breadcrumb, OutputStream outputStream) throws IOException {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, PersistingScopeObserver.UTF_8));
                    try {
                        PersistingScopeObserver.this.options.getSerializer().serialize(breadcrumb, bufferedWriter);
                        bufferedWriter.close();
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
        } catch (IOException e2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to create breadcrumbs queue", e2);
            return ObjectQueue.createEmpty();
        }
    }

    /* JADX INFO: renamed from: lambda$serializeToDisk$13$io-sentry-cache-PersistingScopeObserver */
    /* synthetic */ void m8951xf585d0b1(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, "Serialization task failed", th);
        }
    }

    /* JADX INFO: renamed from: lambda$setBreadcrumbs$3$io-sentry-cache-PersistingScopeObserver */
    /* synthetic */ void m8952lambda$setBreadcrumbs$3$iosentrycachePersistingScopeObserver() {
        try {
            this.breadcrumbsQueue.getValue().clear();
        } catch (IOException e2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to clear breadcrumbs from file queue", e2);
        }
    }

    /* JADX INFO: renamed from: lambda$setContexts$11$io-sentry-cache-PersistingScopeObserver */
    /* synthetic */ void m8953lambda$setContexts$11$iosentrycachePersistingScopeObserver(Contexts contexts) {
        store(contexts, CONTEXTS_FILENAME);
    }

    /* JADX INFO: renamed from: lambda$setExtras$5$io-sentry-cache-PersistingScopeObserver */
    /* synthetic */ void m8954lambda$setExtras$5$iosentrycachePersistingScopeObserver(Map map) {
        store(map, EXTRAS_FILENAME);
    }

    /* JADX INFO: renamed from: lambda$setFingerprint$7$io-sentry-cache-PersistingScopeObserver */
    /* synthetic */ void m8955lambda$setFingerprint$7$iosentrycachePersistingScopeObserver(Collection collection) {
        store(collection, FINGERPRINT_FILENAME);
    }

    /* JADX INFO: renamed from: lambda$setLevel$8$io-sentry-cache-PersistingScopeObserver */
    /* synthetic */ void m8956lambda$setLevel$8$iosentrycachePersistingScopeObserver(SentryLevel sentryLevel) {
        if (sentryLevel == null) {
            delete(LEVEL_FILENAME);
        } else {
            store(sentryLevel, LEVEL_FILENAME);
        }
    }

    /* JADX INFO: renamed from: lambda$setReplayId$12$io-sentry-cache-PersistingScopeObserver */
    /* synthetic */ void m8957lambda$setReplayId$12$iosentrycachePersistingScopeObserver(SentryId sentryId) {
        store(sentryId, REPLAY_FILENAME);
    }

    /* JADX INFO: renamed from: lambda$setRequest$6$io-sentry-cache-PersistingScopeObserver */
    /* synthetic */ void m8958lambda$setRequest$6$iosentrycachePersistingScopeObserver(Request request) {
        if (request == null) {
            delete(REQUEST_FILENAME);
        } else {
            store(request, REQUEST_FILENAME);
        }
    }

    /* JADX INFO: renamed from: lambda$setTags$4$io-sentry-cache-PersistingScopeObserver */
    /* synthetic */ void m8959lambda$setTags$4$iosentrycachePersistingScopeObserver(Map map) {
        store(map, "tags.json");
    }

    /* JADX INFO: renamed from: lambda$setTrace$10$io-sentry-cache-PersistingScopeObserver */
    /* synthetic */ void m8960lambda$setTrace$10$iosentrycachePersistingScopeObserver(SpanContext spanContext, IScope iScope) {
        if (spanContext == null) {
            store(iScope.getPropagationContext().toSpanContext(), TRACE_FILENAME);
        } else {
            store(spanContext, TRACE_FILENAME);
        }
    }

    /* JADX INFO: renamed from: lambda$setTransaction$9$io-sentry-cache-PersistingScopeObserver */
    /* synthetic */ void m8961lambda$setTransaction$9$iosentrycachePersistingScopeObserver(String str) {
        if (str == null) {
            delete(TRANSACTION_FILENAME);
        } else {
            store(str, TRANSACTION_FILENAME);
        }
    }

    /* JADX INFO: renamed from: lambda$setUser$1$io-sentry-cache-PersistingScopeObserver */
    /* synthetic */ void m8962lambda$setUser$1$iosentrycachePersistingScopeObserver(User user) {
        if (user == null) {
            delete(USER_FILENAME);
        } else {
            store(user, USER_FILENAME);
        }
    }

    public <T> T read(SentryOptions sentryOptions, String str, Class<T> cls) {
        if (!str.equals(BREADCRUMBS_FILENAME)) {
            return (T) CacheUtils.read(sentryOptions, SCOPE_CACHE, str, cls, null);
        }
        try {
            return cls.cast(this.breadcrumbsQueue.getValue().asList());
        } catch (IOException unused) {
            sentryOptions.getLogger().log(SentryLevel.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public void resetCache() {
        try {
            this.breadcrumbsQueue.getValue().clear();
        } catch (IOException e2) {
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to clear breadcrumbs from file queue", e2);
        }
        delete(USER_FILENAME);
        delete(LEVEL_FILENAME);
        delete(REQUEST_FILENAME);
        delete(FINGERPRINT_FILENAME);
        delete(CONTEXTS_FILENAME);
        delete(EXTRAS_FILENAME);
        delete("tags.json");
        delete(TRACE_FILENAME);
        delete(TRANSACTION_FILENAME);
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setBreadcrumbs(Collection<Breadcrumb> collection) {
        if (collection.isEmpty()) {
            serializeToDisk(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8952lambda$setBreadcrumbs$3$iosentrycachePersistingScopeObserver();
                }
            });
        }
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setContexts(final Contexts contexts) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8953lambda$setContexts$11$iosentrycachePersistingScopeObserver(contexts);
            }
        });
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setExtras(final Map<String, Object> map) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8954lambda$setExtras$5$iosentrycachePersistingScopeObserver(map);
            }
        });
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setFingerprint(final Collection<String> collection) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8955lambda$setFingerprint$7$iosentrycachePersistingScopeObserver(collection);
            }
        });
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setLevel(final SentryLevel sentryLevel) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8956lambda$setLevel$8$iosentrycachePersistingScopeObserver(sentryLevel);
            }
        });
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setReplayId(final SentryId sentryId) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8957lambda$setReplayId$12$iosentrycachePersistingScopeObserver(sentryId);
            }
        });
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setRequest(final Request request) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8958lambda$setRequest$6$iosentrycachePersistingScopeObserver(request);
            }
        });
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setTags(final Map<String, String> map) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8959lambda$setTags$4$iosentrycachePersistingScopeObserver(map);
            }
        });
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setTrace(final SpanContext spanContext, final IScope iScope) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8960lambda$setTrace$10$iosentrycachePersistingScopeObserver(spanContext, iScope);
            }
        });
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setTransaction(final String str) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8961lambda$setTransaction$9$iosentrycachePersistingScopeObserver(str);
            }
        });
    }

    @Override // io.sentry.ScopeObserverAdapter, io.sentry.IScopeObserver
    public void setUser(final User user) {
        serializeToDisk(new Runnable() { // from class: io.sentry.cache.PersistingScopeObserver$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8962lambda$setUser$1$iosentrycachePersistingScopeObserver(user);
            }
        });
    }
}
