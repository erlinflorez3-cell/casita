package io.sentry;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class NoOpTransactionPerformanceCollector implements TransactionPerformanceCollector {
    private static final NoOpTransactionPerformanceCollector instance = new NoOpTransactionPerformanceCollector();

    private NoOpTransactionPerformanceCollector() {
    }

    public static NoOpTransactionPerformanceCollector getInstance() {
        return instance;
    }

    @Override // io.sentry.TransactionPerformanceCollector
    public void close() {
    }

    @Override // io.sentry.TransactionPerformanceCollector
    public void onSpanFinished(ISpan iSpan) {
    }

    @Override // io.sentry.TransactionPerformanceCollector
    public void onSpanStarted(ISpan iSpan) {
    }

    @Override // io.sentry.TransactionPerformanceCollector
    public void start(ITransaction iTransaction) {
    }

    @Override // io.sentry.TransactionPerformanceCollector
    public List<PerformanceCollectionData> stop(ITransaction iTransaction) {
        return null;
    }
}
