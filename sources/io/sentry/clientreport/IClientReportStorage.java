package io.sentry.clientreport;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface IClientReportStorage {
    void addCount(ClientReportKey clientReportKey, Long l2);

    List<DiscardedEvent> resetCountsAndGet();
}
