package io.sentry;

import io.sentry.rrweb.RRWebEvent;

/* JADX INFO: loaded from: classes6.dex */
public interface ReplayBreadcrumbConverter {
    RRWebEvent convert(Breadcrumb breadcrumb);
}
