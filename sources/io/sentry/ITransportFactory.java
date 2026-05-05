package io.sentry;

import io.sentry.transport.ITransport;

/* JADX INFO: loaded from: classes6.dex */
public interface ITransportFactory {
    ITransport create(SentryOptions sentryOptions, RequestDetails requestDetails);
}
