package io.sentry;

import io.sentry.transport.ITransport;
import io.sentry.transport.NoOpTransport;

/* JADX INFO: loaded from: classes6.dex */
public final class NoOpTransportFactory implements ITransportFactory {
    private static final NoOpTransportFactory instance = new NoOpTransportFactory();

    private NoOpTransportFactory() {
    }

    public static NoOpTransportFactory getInstance() {
        return instance;
    }

    @Override // io.sentry.ITransportFactory
    public ITransport create(SentryOptions sentryOptions, RequestDetails requestDetails) {
        return NoOpTransport.getInstance();
    }
}
