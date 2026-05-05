package com.ts.coresdk.logger.db;

import android.content.Context;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.TSLog;
import com.ts.coresdk.controllers.TSDataSource;
import com.ts.coresdk.db.CDatabase;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements TSDataSource<TSLogEntity> {
    private final Context bW;

    public d(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.bW = context;
    }

    private final void a(ITSModuleInfo iTSModuleInfo) {
        try {
            CDatabase.f18279a.b(this.bW).l().deleteAll();
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message != null) {
                TSLog.e(this.bW, iTSModuleInfo, message, th);
            }
        }
    }

    @Override // com.ts.coresdk.controllers.TSDataSource
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void addData(TSLogEntity tSLogEntity, ITSModuleInfo iTSModuleInfo) {
        Intrinsics.checkNotNullParameter(tSLogEntity, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        CDatabase.f18279a.b(this.bW).l().insertEncryptedData(this.bW, iTSModuleInfo, tSLogEntity);
    }

    @Override // com.ts.coresdk.controllers.TSDataSource
    public void addData(List<? extends TSLogEntity> list, ITSModuleInfo iTSModuleInfo) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        CDatabase.f18279a.b(this.bW).l().insertEncryptedData(this.bW, iTSModuleInfo, list);
    }

    @Override // com.ts.coresdk.controllers.TSDataSource
    public List<TSLogEntity> fetchAndRemove(ITSModuleInfo iTSModuleInfo) {
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        try {
            List<TSLogEntity> listFetchAll = CDatabase.f18279a.b(this.bW).l().fetchAll(this.bW, iTSModuleInfo);
            CDatabase.f18279a.b(this.bW).l().delete(this.bW, iTSModuleInfo, listFetchAll);
            return listFetchAll;
        } catch (Throwable unused) {
            a(iTSModuleInfo);
            return CollectionsKt.emptyList();
        }
    }

    @Override // com.ts.coresdk.controllers.TSDataSource
    public boolean isEmpty(ITSModuleInfo iTSModuleInfo) {
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        return CDatabase.f18279a.b(this.bW).l().g(iTSModuleInfo.subSystemName()) == 0;
    }

    @Override // com.ts.coresdk.controllers.TSDataSource
    public boolean isNotEmpty(ITSModuleInfo iTSModuleInfo) {
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        return CDatabase.f18279a.b(this.bW).l().g(iTSModuleInfo.subSystemName()) != 0;
    }

    @Override // com.ts.coresdk.controllers.TSDataSource
    public int size(ITSModuleInfo iTSModuleInfo) {
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        return CDatabase.f18279a.b(this.bW).l().g(iTSModuleInfo.subSystemName());
    }
}
