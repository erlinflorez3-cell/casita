package io.cobrowse;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.PersistableBundle;
import com.statsig.androidsdk.StatsigLoggerKt;
import io.cobrowse.DeviceRegistrationLoop;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Timer;
import java.util.TimerTask;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.CX;
import yg.EO;
import yg.FB;
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
public class DeviceRegistrationLoop {

    public static class CobrowseRegistrationJob extends JobService {
        /* JADX INFO: Access modifiers changed from: private */
        public static void ensureServiceIsStarted(Context context) throws Exception {
            try {
                Intent intent = new Intent(context, (Class<?>) CobrowseRegistrationJob.class);
                CX.ud();
                short sXd = (short) (ZN.Xd() ^ 15518);
                int[] iArr = new int["TbUd^YQ\u001cN[W^LVY\u0014Fsovdxq".length()];
                QB qb = new QB("TbUd^YQ\u001cN[W^LVY\u0014Fsovdxq");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i2));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[1];
                short sXd2 = (short) (ZN.Xd() ^ 1666);
                int[] iArr2 = new int["\r\u001b\u0012!\u001f\u001a\u0016`\u0017$$+\u001d'.h\u0005+2$.5".length()];
                QB qb2 = new QB("\r\u001b\u0012!\u001f\u001a\u0016`\u0017$$+\u001d'.h\u0005+2$.5");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (((sXd2 + sXd2) + sXd2) + i3));
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                Object[] objArr = {intent};
                Method method = cls.getMethod(Xg.qd("JL:LO/BPUIDG", (short) (ZN.Xd() ^ 31618), (short) (ZN.Xd() ^ 24854)), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(context, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (IllegalStateException e3) {
                String str = Jg.Wd("r\u0001o'\u0019I;C%CT4waX\u0017\b7*\u0015=B\u0006&", (short) (Od.Xd() ^ (-22640)), (short) (Od.Xd() ^ (-24174))) + e3;
                ZO.xd("B|\u007f,E>j\u000f\u0007:", (short) (C1633zX.Xd() ^ (-11997)), (short) (C1633zX.Xd() ^ (-3795)));
            }
        }

        private int getRegistrationJobId() {
            return getRegistrationJobId(this);
        }

        private static int getRegistrationJobId(Context context) throws Throwable {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1626yg.Ud("3U\"\u0019<>l\u0018Yx\u0017.\u0015a9K\u0018 \u000f KeT", (short) (OY.Xd() ^ 4492), (short) (OY.Xd() ^ 27908))).getMethod(Ig.wd("c9VP,\\87X\n\u000e:", (short) (ZN.Xd() ^ 626)), new Class[0]);
            try {
                method.setAccessible(true);
                return ((Resources) method.invoke(context, objArr)).getInteger(R.integer.cobrowse_job_id);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static void schedule(Context context, long j2, int i2) throws Throwable {
            JobInfo.Builder builder = new JobInfo.Builder(getRegistrationJobId(context), new ComponentName(context, (Class<?>) CobrowseRegistrationJob.class));
            builder.setMinimumLatency(j2);
            builder.setOverrideDeadline(j2);
            builder.setRequiredNetworkType(1);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt(EO.Od("#^\r&e5\u001d", (short) (C1607wl.Xd() ^ 18222)), i2);
            builder.setExtras(persistableBundle);
            String strQd = C1561oA.Qd("IM?O>B><LB:F", (short) (FB.Xd() ^ 18185));
            short sXd = (short) (C1499aX.Xd() ^ (-9170));
            short sXd2 = (short) (C1499aX.Xd() ^ (-25057));
            int[] iArr = new int["/=4CA<8\u00039FFM?IP\u000b!NNUG[X".length()];
            QB qb = new QB("/=4CA<8\u00039FFM?IP\u000b!NNUG[X");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((xuXd.CK(iKK) - (sXd + i3)) - sXd2);
                i3++;
            }
            Class<?> cls = Class.forName(new String(iArr, 0, i3));
            Class<?>[] clsArr = {Class.forName(C1561oA.od("PFZD\u0010MAME\u000b/OLBF>", (short) (C1499aX.Xd() ^ (-21687))))};
            Object[] objArr = {strQd};
            short sXd3 = (short) (C1607wl.Xd() ^ 14460);
            int[] iArr2 = new int["cbrRytvhqXky~rmp".length()];
            QB qb2 = new QB("cbrRytvhqXky~rmp");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - ((sXd3 + sXd3) + i4));
                i4++;
            }
            Method method = cls.getMethod(new String(iArr2, 0, i4), clsArr);
            try {
                method.setAccessible(true);
                JobScheduler jobScheduler = (JobScheduler) method.invoke(context, objArr);
                if (jobScheduler == null || jobScheduler.schedule(builder.build()) == 1) {
                    return;
                }
                short sXd4 = (short) (C1580rY.Xd() ^ (-24912));
                short sXd5 = (short) (C1580rY.Xd() ^ (-23675));
                int[] iArr3 = new int["\u0006?z\u001a\u007f\u0015URbp".length()];
                QB qb3 = new QB("\u0006?z\u001a\u007f\u0015URbp");
                int i5 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i5] = xuXd3.fK(((i5 * sXd5) ^ sXd4) + xuXd3.CK(iKK3));
                    i5++;
                }
                new String(iArr3, 0, i5);
                C1561oA.Xd("iz\u0001~~\u0011\t\u0007\r\u0007@\u0014\b\u000b\u000e\u0019\u001b\u001a\n\u001e\u0014\u001b\u001bM\u0019\u001f\u0013Q\u0019\u0015\u001e\"\u001c\u001c", (short) (C1633zX.Xd() ^ (-29524)));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        static void stop(Context context) throws Throwable {
            Object[] objArr = {Wg.vd("y}o\u007fvzvt|rjv", (short) (Od.Xd() ^ (-23983)))};
            Method method = Class.forName(Qg.kd("9E:GC<6~3><A19>v\u000b649);6", (short) (OY.Xd() ^ 15496), (short) (OY.Xd() ^ 29125))).getMethod(C1561oA.ud("\u001f\u001c*\b-&&\u0016\u001d\u0002\u0013\u001f\"\u0014\r\u000e", (short) (C1607wl.Xd() ^ 27677)), Class.forName(hg.Vd("B8L6\u0002?3?7|!A>480", (short) (ZN.Xd() ^ 28572), (short) (ZN.Xd() ^ 31358))));
            try {
                method.setAccessible(true);
                JobScheduler jobScheduler = (JobScheduler) method.invoke(context, objArr);
                if (jobScheduler != null) {
                    jobScheduler.cancel(getRegistrationJobId(context));
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }

        /* JADX INFO: renamed from: lambda$onStartJob$0$io-cobrowse-DeviceRegistrationLoop$CobrowseRegistrationJob, reason: not valid java name */
        /* synthetic */ void m8814xca82c6ce(JobParameters jobParameters, Error error, Device device) {
            jobFinished(jobParameters, false);
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(final JobParameters jobParameters) throws Throwable {
            if (jobParameters.getJobId() != getRegistrationJobId()) {
                return false;
            }
            DeviceRegistrationLoop.register(getApplication(), jobParameters.getExtras().getInt("attempt", 0), new Callback() { // from class: io.cobrowse.DeviceRegistrationLoop$CobrowseRegistrationJob$$ExternalSyntheticLambda0
                @Override // io.cobrowse.Callback
                public final void call(Error error, Object obj) {
                    this.f$0.m8814xca82c6ce(jobParameters, error, (Device) obj);
                }
            });
            return false;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) throws Throwable {
            if (jobParameters.getJobId() != getRegistrationJobId()) {
                return false;
            }
            schedule(getApplication(), StatsigLoggerKt.FLUSH_TIMER_MS, jobParameters.getExtras().getInt("attempt", 0));
            return false;
        }
    }

    static class CobrowseRegistrationTimer {
        private static Timer next = null;

        /* JADX INFO: renamed from: io.cobrowse.DeviceRegistrationLoop$CobrowseRegistrationTimer$1, reason: invalid class name */
        class AnonymousClass1 extends TimerTask {
            final /* synthetic */ int val$attempt;
            final /* synthetic */ Context val$context;

            AnonymousClass1(Context context, int i2) {
                this.val$context = context;
                this.val$attempt = i2;
            }

            static /* synthetic */ void lambda$run$0(Error error, Device device) {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() throws Throwable {
                Timer unused = CobrowseRegistrationTimer.next = null;
                DeviceRegistrationLoop.register(this.val$context, this.val$attempt, new Callback() { // from class: io.cobrowse.DeviceRegistrationLoop$CobrowseRegistrationTimer$1$$ExternalSyntheticLambda0
                    @Override // io.cobrowse.Callback
                    public final void call(Error error, Object obj) {
                        DeviceRegistrationLoop.CobrowseRegistrationTimer.AnonymousClass1.lambda$run$0(error, (Device) obj);
                    }
                });
            }
        }

        CobrowseRegistrationTimer() {
        }

        static void schedule(Context context, long j2, int i2) {
            stop();
            Timer timer = new Timer();
            next = timer;
            timer.schedule(new AnonymousClass1(context, i2), j2);
        }

        static void stop() {
            Timer timer = next;
            if (timer != null) {
                timer.cancel();
                next = null;
            }
        }
    }

    static void init(Context context) throws Exception {
        if (supportsJobService()) {
            CobrowseRegistrationJob.ensureServiceIsStarted(context);
        }
    }

    static /* synthetic */ void lambda$register$0(int i2, Context context, Callback callback, Error error, Device device) {
        if (error != null || device == null) {
            String str = "CobrowseIO device registration failed " + error;
            long jRound = Math.round(Math.pow(1.5d, i2) * 60.0d);
            if (jRound < 60) {
                jRound = 60;
            }
            schedule(context, jRound * 1000, i2 + 1);
        } else {
            schedule(context, ((long) device.registrationInterval()) * 1000, 0);
        }
        ThreadUtils.invoke(callback, error, device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void register(final Context context, final int i2, final Callback<Error, Device> callback) throws Throwable {
        Device device = CobrowseIO.instance().getDevice();
        if (device != null) {
            Jg.Wd("Wvz 6S\u0001\b\u0005 ", (short) (Od.Xd() ^ (-11194)), (short) (Od.Xd() ^ (-20536)));
            ZO.xd("?,U\u0013\u000b<+OdU\f3_MC0^}&\u0006E4\fQ\u0002iq$O", (short) (C1633zX.Xd() ^ (-3476)), (short) (C1633zX.Xd() ^ (-28609)));
            device.register(new Callback() { // from class: io.cobrowse.DeviceRegistrationLoop$$ExternalSyntheticLambda0
                @Override // io.cobrowse.Callback
                public final void call(Error error, Object obj) {
                    DeviceRegistrationLoop.lambda$register$0(i2, context, callback, error, (Device) obj);
                }
            });
            return;
        }
        short sXd = (short) (C1633zX.Xd() ^ (-14395));
        int[] iArr = new int["\n*)2+718.%])+\u001fY\u001f=O?:9tI4Cp<D89".length()];
        QB qb = new QB("\n*)2+718.%])+\u001fY\u001f=O?:9tI4Cp<D89");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd ^ i3));
            i3++;
        }
        Object[] objArr = {new String(iArr, 0, i3)};
        Constructor<?> constructor = Class.forName(C1561oA.Yd("[SiU#bXf`(@nomq", (short) (C1607wl.Xd() ^ 25410))).getConstructor(Class.forName(Xg.qd("\u0013\u000b!\rZ\u001a\u0010\u001e\u0018_\u0006('\u001f%\u001f", (short) (C1580rY.Xd() ^ (-2979)), (short) (C1580rY.Xd() ^ (-16437)))));
        try {
            constructor.setAccessible(true);
            ThreadUtils.invoke(callback, (Error) constructor.newInstance(objArr), null);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    static void schedule(Context context, long j2, int i2) {
        String str = "CobrowseIO scheduling next registration attempt (" + i2 + ") in " + j2;
        if (supportsJobService()) {
            CobrowseRegistrationJob.schedule(context, j2, i2);
        } else {
            CobrowseRegistrationTimer.schedule(context, j2, i2);
        }
    }

    static void stop(Context context) throws Throwable {
        if (supportsJobService()) {
            CobrowseRegistrationJob.stop(context);
        } else {
            CobrowseRegistrationTimer.stop();
        }
    }

    private static boolean supportsJobService() {
        return true;
    }
}
