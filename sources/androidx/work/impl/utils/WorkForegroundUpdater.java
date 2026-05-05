package androidx.work.impl.utils;

import android.content.Context;
import android.content.Intent;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.drew.metadata.exif.ExifDirectoryBase;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;
import yg.C1561oA;
import yg.C1580rY;
import yg.FB;
import yg.OY;
import yg.Qg;
import yg.Wg;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public class WorkForegroundUpdater implements ForegroundUpdater {
    private static final String TAG = Logger.tagWithPrefix("WMFgUpdater");
    final ForegroundProcessor mForegroundProcessor;
    private final TaskExecutor mTaskExecutor;
    final WorkSpecDao mWorkSpecDao;

    public WorkForegroundUpdater(WorkDatabase workDatabase, ForegroundProcessor foregroundProcessor, TaskExecutor taskExecutor) {
        this.mForegroundProcessor = foregroundProcessor;
        this.mTaskExecutor = taskExecutor;
        this.mWorkSpecDao = workDatabase.workSpecDao();
    }

    @Override // androidx.work.ForegroundUpdater
    public ListenableFuture<Void> setForegroundAsync(final Context context, final UUID id, final ForegroundInfo foregroundInfo) {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        this.mTaskExecutor.executeOnTaskThread(new Runnable() { // from class: androidx.work.impl.utils.WorkForegroundUpdater.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!settableFutureCreate.isCancelled()) {
                        String string = id.toString();
                        WorkSpec workSpec = WorkForegroundUpdater.this.mWorkSpecDao.getWorkSpec(string);
                        if (workSpec == null || workSpec.state.isFinished()) {
                            throw new IllegalStateException(hg.Vd("#@JIOzNHwJ;I\u001aBD67A=B:/\u000b<A5)llb/633] +(*%\u001d+\u001bT\u0016\u0018\u0018 \"\u0014M\u000eKv\u0013\u001c\u001c\f\u0014\u0006\u0006\u000f\u0007w\u000f\u0011\t\u0002\u000e:\r\u0002~\u0005v\u0001\u00072t\u007f|~yq\u007fsxv'uk$zqsk\u001f`v\u001cm_mmid^bZ\u0012R^\u000fW[__KWKL\u0006TJ\u00034FSTJQ\n", (short) (FB.Xd() ^ 6103), (short) (FB.Xd() ^ 9117)));
                        }
                        WorkForegroundUpdater.this.mForegroundProcessor.startForeground(string, foregroundInfo);
                        Intent intentCreateNotifyIntent = SystemForegroundDispatcher.createNotifyIntent(context, WorkSpecKt.generationalId(workSpec), foregroundInfo);
                        Context context2 = context;
                        Class<?> cls = Class.forName(C1561oA.Xd("O]Tca\\X#Yffm_ip+Annug{x", (short) (C1580rY.Xd() ^ (-1366))));
                        Class<?>[] clsArr = new Class[1];
                        clsArr[0] = Class.forName(Wg.vd("%1*7/(&n/:<A-5>v|!*\u001a\u001e#", (short) (OY.Xd() ^ 24706)));
                        Object[] objArr = {intentCreateNotifyIntent};
                        Method method = cls.getMethod(Qg.kd("\u0001\u0001l|}[lx{mfg", (short) (ZN.Xd() ^ 20892), (short) (ZN.Xd() ^ ExifDirectoryBase.TAG_PAGE_NUMBER)), clsArr);
                        try {
                            method.setAccessible(true);
                            method.invoke(context2, objArr);
                        } catch (InvocationTargetException e2) {
                            throw e2.getCause();
                        }
                    }
                    settableFutureCreate.set(null);
                } catch (Throwable th) {
                    settableFutureCreate.setException(th);
                }
            }
        });
        return settableFutureCreate;
    }
}
