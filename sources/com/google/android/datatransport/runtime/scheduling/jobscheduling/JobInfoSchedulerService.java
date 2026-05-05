package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class JobInfoSchedulerService extends JobService {
    /* JADX INFO: renamed from: lambda$onStartJob$0$com-google-android-datatransport-runtime-scheduling-jobscheduling-JobInfoSchedulerService, reason: not valid java name */
    /* synthetic */ void m7552x1ff6a938(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) throws Throwable {
        String string = jobParameters.getExtras().getString(C1561oA.Qd("\u001a\u0018\u0019 \u0019!\u0016~\u0011\u001c\u0013", (short) (FB.Xd() ^ 16777)));
        String string2 = jobParameters.getExtras().getString(C1593ug.zd("<PML<O", (short) (C1580rY.Xd() ^ (-12012)), (short) (C1580rY.Xd() ^ (-13190))));
        int i2 = jobParameters.getExtras().getInt(C1561oA.od("NOEJLBLP", (short) (OY.Xd() ^ 28077)));
        int i3 = jobParameters.getExtras().getInt(C1561oA.Kd("n\u0003\u0004u~\u0003\bb\u000b\u0004y}\f", (short) (C1499aX.Xd() ^ (-23520))));
        TransportRuntime.initialize(getApplicationContext());
        TransportContext.Builder priority = TransportContext.builder().setBackendName(string).setPriority(PriorityMapping.valueOf(i2));
        if (string2 != null) {
            short sXd = (short) (C1633zX.Xd() ^ (-31882));
            short sXd2 = (short) (C1633zX.Xd() ^ (-5342));
            int[] iArr = new int["rH~S\u0019X\u0013\"2\u0018M\u0016#|]5o\u0005c".length()];
            QB qb = new QB("rH~S\u0019X\u0013\"2\u0018M\u0016#|]5o\u0005c");
            int i4 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i4] = xuXd.fK(((i4 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i4++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i4));
            Class<?>[] clsArr = new Class[2];
            short sXd3 = (short) (C1580rY.Xd() ^ (-26874));
            int[] iArr2 = new int["ME[G\u0015TJXR\u001a@baY_Y".length()];
            QB qb2 = new QB("ME[G\u0015TJXR\u001a@baY_Y");
            int i5 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i5] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i5));
                i5++;
            }
            clsArr[0] = Class.forName(new String(iArr2, 0, i5));
            clsArr[1] = Integer.TYPE;
            Object[] objArr = {string2, 0};
            short sXd4 = (short) (ZN.Xd() ^ 782);
            int[] iArr3 = new int["iijumm".length()];
            QB qb3 = new QB("iijumm");
            int i6 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i6] = xuXd3.fK((sXd4 ^ i6) + xuXd3.CK(iKK3));
                i6++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr3, 0, i6), clsArr);
            try {
                declaredMethod.setAccessible(true);
                priority.setExtras((byte[]) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        TransportRuntime.getInstance().getUploader().upload(priority.build(), i3, new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m7552x1ff6a938(jobParameters);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
