package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import java.util.List;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes3.dex */
@Encodable
public abstract class BatchedLogRequest {
    public static BatchedLogRequest create(List<LogRequest> list) {
        return new AutoValue_BatchedLogRequest(list);
    }

    public static DataEncoder createDataEncoder() {
        return new JsonDataEncoderBuilder().configureWith(AutoBatchedLogRequestEncoder.CONFIG).ignoreNullValues(true).build();
    }

    @InterfaceC1492Gx
    @Encodable.Field(name = "46-\u0017)47&33")
    public abstract List<LogRequest> getLogRequests();
}
