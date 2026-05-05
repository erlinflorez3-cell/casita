package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes8.dex */
public final class PendingResults {
    private PendingResults() {
    }

    public static PendingResult<Status> canceledPendingResult() throws Throwable {
        short sXd = (short) (OY.Xd() ^ 23163);
        short sXd2 = (short) (OY.Xd() ^ 3887);
        int[] iArr = new int["nV!w}\u0013l<v\u0017\u0019C[Y#+f".length()];
        QB qb = new QB("nV!w}\u0013l<v\u0017\u0019C[Y#+f");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(Ig.wd("\u0012:\u0006\u0005nQ0dTf\u0010\\\u001a", (short) (OY.Xd() ^ 766)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            StatusPendingResult statusPendingResult = new StatusPendingResult((Looper) declaredMethod.invoke(null, objArr));
            statusPendingResult.cancel();
            return statusPendingResult;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static <R extends Result> PendingResult<R> canceledPendingResult(R r2) {
        Preconditions.checkNotNull(r2, "Result must not be null");
        Preconditions.checkArgument(r2.getStatus().getStatusCode() == 16, "Status code must be CommonStatusCodes.CANCELED");
        zaf zafVar = new zaf(r2);
        zafVar.cancel();
        return zafVar;
    }

    public static <R extends Result> PendingResult<R> immediateFailedResult(R r2, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r2, "Result must not be null");
        Preconditions.checkArgument(!r2.getStatus().isSuccess(), "Status code must not be SUCCESS");
        zag zagVar = new zag(googleApiClient, r2);
        zagVar.setResult(r2);
        return zagVar;
    }

    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R r2) {
        Preconditions.checkNotNull(r2, "Result must not be null");
        zah zahVar = new zah(null);
        zahVar.setResult(r2);
        return new OptionalPendingResultImpl(zahVar);
    }

    public static <R extends Result> OptionalPendingResult<R> immediatePendingResult(R r2, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(r2, "Result must not be null");
        zah zahVar = new zah(googleApiClient);
        zahVar.setResult(r2);
        return new OptionalPendingResultImpl(zahVar);
    }

    public static PendingResult<Status> immediatePendingResult(Status status) throws Throwable {
        Preconditions.checkNotNull(status, EO.Od("\u0014tR6o\u001dvm-\t\u000e\u0015OH_&6\u0019-E\u0004@d", (short) (C1580rY.Xd() ^ (-24085))));
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Qd("\".#0,%\u001fg(+d\u0002$##\u0017#", (short) (OY.Xd() ^ 10299))).getDeclaredMethod(C1593ug.zd("QP`:OX^=abdZh", (short) (OY.Xd() ^ 31683), (short) (OY.Xd() ^ 11494)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            StatusPendingResult statusPendingResult = new StatusPendingResult((Looper) declaredMethod.invoke(null, objArr));
            statusPendingResult.setResult(status);
            return statusPendingResult;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static PendingResult<Status> immediatePendingResult(Status status, GoogleApiClient googleApiClient) {
        Preconditions.checkNotNull(status, "Result must not be null");
        StatusPendingResult statusPendingResult = new StatusPendingResult(googleApiClient);
        statusPendingResult.setResult(status);
        return statusPendingResult;
    }
}
