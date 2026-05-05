package com.ts.coresdk.logger.db;

import android.content.Context;
import com.ts.coresdk.ITSModuleInfo;
import com.ts.coresdk.TSBaseDao;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends TSBaseDao<TSLogEntity> {
    public a() {
        super("te");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ts.coresdk.TSBaseDao
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public TSLogEntity encryptEntity(Context context, ITSModuleInfo iTSModuleInfo, TSLogEntity tSLogEntity) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(tSLogEntity, "");
        try {
            return new TSLogEntity(tSLogEntity.r(), b.a(tSLogEntity.s(), context, iTSModuleInfo), b.a(tSLogEntity.t(), context, iTSModuleInfo), b.a(tSLogEntity.u(), context, iTSModuleInfo), tSLogEntity.v(), tSLogEntity.w(), tSLogEntity.x());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ts.coresdk.TSBaseDao
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public TSLogEntity decryptEntity(Context context, ITSModuleInfo iTSModuleInfo, TSLogEntity tSLogEntity) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iTSModuleInfo, "");
        Intrinsics.checkNotNullParameter(tSLogEntity, "");
        try {
            return new TSLogEntity(tSLogEntity.r(), b.b(tSLogEntity.s(), context, iTSModuleInfo), b.b(tSLogEntity.t(), context, iTSModuleInfo), b.b(tSLogEntity.u(), context, iTSModuleInfo), tSLogEntity.v(), tSLogEntity.w(), tSLogEntity.x());
        } catch (Throwable unused) {
            return null;
        }
    }

    public abstract int g(String str);
}
