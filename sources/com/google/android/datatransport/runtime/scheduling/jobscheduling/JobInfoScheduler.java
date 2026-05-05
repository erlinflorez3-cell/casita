package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class JobInfoScheduler implements WorkScheduler {
    static final String ATTEMPT_NUMBER = "attemptNumber";
    static final String BACKEND_NAME = "backendName";
    static final String EVENT_PRIORITY = "priority";
    static final String EXTRAS = "extras";
    private static final String LOG_TAG = "JobInfoScheduler";
    private final SchedulerConfig config;
    private final Context context;
    private final EventStore eventStore;

    public JobInfoScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig) {
        this.context = context;
        this.eventStore = eventStore;
        this.config = schedulerConfig;
    }

    private boolean isJobServiceOn(JobScheduler jobScheduler, int i2, int i3) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i4 = jobInfo.getExtras().getInt(ATTEMPT_NUMBER);
            if (jobInfo.getId() == i2) {
                return i4 >= i3;
            }
        }
        return false;
    }

    int getJobId(TransportContext transportContext) throws Throwable {
        Adler32 adler32 = new Adler32();
        Context context = this.context;
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od("u\u0002v\u0004\u007fxr;ozx}muz3Grpuewr", (short) (OY.Xd() ^ 15968))).getMethod(C1561oA.Kd("NM]:LOXOVU?S`Y", (short) (C1580rY.Xd() ^ (-9682))), new Class[0]);
        try {
            method.setAccessible(true);
            String str = (String) method.invoke(context, objArr);
            String strZd = Wg.Zd("\u001dRIvG", (short) (ZN.Xd() ^ 21166), (short) (ZN.Xd() ^ 9660));
            adler32.update(str.getBytes(Charset.forName(strZd)));
            adler32.update(transportContext.getBackendName().getBytes(Charset.forName(strZd)));
            adler32.update(ByteBuffer.allocate(4).putInt(PriorityMapping.toInt(transportContext.getPriority())).array());
            if (transportContext.getExtras() != null) {
                adler32.update(transportContext.getExtras());
            }
            return (int) adler32.getValue();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i2) throws Throwable {
        schedule(transportContext, i2, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i2, boolean z2) throws Throwable {
        ComponentName componentName = new ComponentName(this.context, (Class<?>) JobInfoSchedulerService.class);
        Context context = this.context;
        String strXd = C1561oA.Xd("\u0012\u0018\f\u001e\u000f\u0015\u0013\u0013%\u001d\u0017%", (short) (ZN.Xd() ^ 8217));
        short sXd = (short) (Od.Xd() ^ (-13472));
        int[] iArr = new int["lzm|~yq<fsovlvy4^\f\b\u000f\u0005\u0019\u0012".length()];
        QB qb = new QB("lzm|~yq<fsovlvy4^\f\b\u000f\u0005\u0019\u0012");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((sXd ^ i3) + xuXd.CK(iKK));
            i3++;
        }
        Object[] objArr = {strXd};
        Method method = Class.forName(new String(iArr, 0, i3)).getMethod(hg.Vd("olzX}vvfmRcord]^", (short) (C1580rY.Xd() ^ (-29403)), (short) (C1580rY.Xd() ^ (-4679))), Class.forName(Qg.kd("zp\u0005n:wkwo5Yyvlph", (short) (OY.Xd() ^ 21428), (short) (OY.Xd() ^ 29507))));
        try {
            method.setAccessible(true);
            JobScheduler jobScheduler = (JobScheduler) method.invoke(context, objArr);
            int jobId = getJobId(transportContext);
            short sXd2 = (short) (C1633zX.Xd() ^ (-32077));
            int[] iArr2 = new int["\u001fC5\u001b?6>!040.>4,8".length()];
            QB qb2 = new QB("\u001fC5\u001b?6>!040.>4,8");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(sXd2 + i4 + xuXd2.CK(iKK2));
                i4++;
            }
            String str = new String(iArr2, 0, i4);
            if (!z2 && isJobServiceOn(jobScheduler, jobId, i2)) {
                short sXd3 = (short) (C1633zX.Xd() ^ (-17064));
                int[] iArr3 = new int["6PKMFH\u0003HXZ\u0007I\\Z_OIDnrHs<Ex9CHB=?S!sbfjhxnnl5&_q\u007f\u007fc^X\\\\\"! ".length()];
                QB qb3 = new QB("6PKMFH\u0003HXZ\u0007I\\Z_OIDnrHs<Ex9CHB=?S!sbfjhxnnl5&_q\u007f\u007fc^X\\\\\"! ");
                int i5 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i5] = xuXd3.fK(xuXd3.CK(iKK3) - (sXd3 ^ i5));
                    i5++;
                }
                Logging.d(str, new String(iArr3, 0, i5), transportContext);
                return;
            }
            long nextCallTime = this.eventStore.getNextCallTime(transportContext);
            JobInfo.Builder builderConfigureJob = this.config.configureJob(new JobInfo.Builder(jobId, componentName), transportContext.getPriority(), nextCallTime, i2);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt(C1561oA.Yd("\u0011%&\u0018!%*\u0005-&\u001c .", (short) (OY.Xd() ^ 3653)), i2);
            persistableBundle.putString(Xg.qd("\u000e\u000e\u0011\u001a\u0015\u001f\u0016\u0001\u0015\"\u001b", (short) (Od.Xd() ^ (-15781)), (short) (Od.Xd() ^ (-15946))), transportContext.getBackendName());
            persistableBundle.putInt(Jg.Wd("2d\nAv\u001dV\u000e", (short) (C1633zX.Xd() ^ (-9872)), (short) (C1633zX.Xd() ^ (-16687))), PriorityMapping.toInt(transportContext.getPriority()));
            if (transportContext.getExtras() != null) {
                Object[] objArr2 = {transportContext.getExtras(), 0};
                Method declaredMethod = Class.forName(ZO.xd("`\u001a8\\O\u00028%\u000b\u0006Lr\u007fs\u001fuw\u001f8", (short) (C1607wl.Xd() ^ 27091), (short) (C1607wl.Xd() ^ 6717))).getDeclaredMethod(C1626yg.Ud("_\u000fiZ8u\u001fMj9NA/~", (short) (Od.Xd() ^ (-2456)), (short) (Od.Xd() ^ (-22311))), byte[].class, Integer.TYPE);
                try {
                    declaredMethod.setAccessible(true);
                    persistableBundle.putString(Ig.wd("h)#y\u0019\u0006", (short) (C1633zX.Xd() ^ (-387))), (String) declaredMethod.invoke(null, objArr2));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            builderConfigureJob.setExtras(persistableBundle);
            Logging.d(str, EO.Od("?'yS;p\u00185pJ\u00058\u001e\u0010\u0007\u0013b\b'\u001cUG19>l{[i#XA\u0006wS);\u0013BUHG\u0015\u007fh\u001a]TM\\$Adk{WvT,21\u0007gFv\u0010G ?;2\u0014+%\nac\u0011,8\u0007Y\u001cC\u0010@GRCfR-|Ma*RO", (short) (C1580rY.Xd() ^ (-23413))), transportContext, Integer.valueOf(jobId), Long.valueOf(this.config.getScheduleDelay(transportContext.getPriority(), nextCallTime, i2)), Long.valueOf(nextCallTime), Integer.valueOf(i2));
            jobScheduler.schedule(builderConfigureJob.build());
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }
}
