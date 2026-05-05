package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public class AlarmManagerScheduler implements WorkScheduler {
    static final String ATTEMPT_NUMBER = "attemptNumber";
    static final String BACKEND_NAME = "backendName";
    static final String EVENT_PRIORITY = "priority";
    static final String EXTRAS = "extras";
    private static final String LOG_TAG = "AlarmManagerScheduler";
    private AlarmManager alarmManager;
    private final Clock clock;
    private final SchedulerConfig config;
    private final Context context;
    private final EventStore eventStore;

    AlarmManagerScheduler(Context context, EventStore eventStore, AlarmManager alarmManager, Clock clock, SchedulerConfig schedulerConfig) {
        this.context = context;
        this.eventStore = eventStore;
        this.alarmManager = alarmManager;
        this.clock = clock;
        this.config = schedulerConfig;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AlarmManagerScheduler(Context context, EventStore eventStore, Clock clock, SchedulerConfig schedulerConfig) throws Throwable {
        Object[] objArr = {C1561oA.Qd("R\\P`Z", (short) (C1633zX.Xd() ^ (-8121)))};
        Method method = Class.forName(C1593ug.zd("o}t\u0004\u0002|xCy\u0007\u0007\u000e\u007f\n\u0011Ka\u000f\u000f\u0016\b\u001c\u0019", (short) (C1580rY.Xd() ^ (-1710)), (short) (C1580rY.Xd() ^ (-8065)))).getMethod(C1561oA.Kd("\u001f\u001e.\u000e502$-\u0014'5:.),", (short) (C1607wl.Xd() ^ 1642)), Class.forName(C1561oA.od("\r\u0003\u0017\u0001L\n}\n\u0002Gk\f\t~\u0003z", (short) (C1499aX.Xd() ^ (-23915)))));
        try {
            method.setAccessible(true);
            this(context, eventStore, (AlarmManager) method.invoke(context, objArr), clock, schedulerConfig);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    boolean isJobServiceOn(Intent intent) {
        return PendingIntent.getBroadcast(this.context, 0, intent, 603979776) != null;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i2) throws Throwable {
        schedule(transportContext, i2, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler
    public void schedule(TransportContext transportContext, int i2, boolean z2) throws Throwable {
        Uri.Builder builder = new Uri.Builder();
        short sXd = (short) (FB.Xd() ^ 16109);
        short sXd2 = (short) (FB.Xd() ^ 18177);
        int[] iArr = new int["_\u007f&Pi\u0016.8n\\4".length()];
        QB qb = new QB("_\u007f&Pi\u0016.8n\\4");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK(((i3 * sXd2) ^ sXd) + xuXd.CK(iKK));
            i3++;
        }
        builder.appendQueryParameter(new String(iArr, 0, i3), transportContext.getBackendName());
        String strValueOf = String.valueOf(PriorityMapping.toInt(transportContext.getPriority()));
        short sXd3 = (short) (Od.Xd() ^ (-9751));
        int[] iArr2 = new int["ILDKOGSY".length()];
        QB qb2 = new QB("ILDKOGSY");
        int i4 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i4] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd3 + i4));
            i4++;
        }
        builder.appendQueryParameter(new String(iArr2, 0, i4), strValueOf);
        if (transportContext.getExtras() != null) {
            byte[] extras = transportContext.getExtras();
            short sXd4 = (short) (Od.Xd() ^ (-19656));
            int[] iArr3 = new int["%3&572*tAA37}\u0013/B\u0019je".length()];
            QB qb3 = new QB("%3&572*tAA37}\u0013/B\u0019je");
            int i5 = 0;
            while (qb3.YK()) {
                int iKK3 = qb3.KK();
                Xu xuXd3 = Xu.Xd(iKK3);
                iArr3[i5] = xuXd3.fK((sXd4 ^ i5) + xuXd3.CK(iKK3));
                i5++;
            }
            Object[] objArr = {extras, 0};
            Method declaredMethod = Class.forName(new String(iArr3, 0, i5)).getDeclaredMethod(Qg.kd("YaU`TTB\\?_\\RVN", (short) (OY.Xd() ^ 12537), (short) (OY.Xd() ^ 8397)), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                String str = (String) declaredMethod.invoke(null, objArr);
                short sXd5 = (short) (OY.Xd() ^ 12507);
                short sXd6 = (short) (OY.Xd() ^ 3536);
                int[] iArr4 = new int["~\u0011\f\tv\b".length()];
                QB qb4 = new QB("~\u0011\f\tv\b");
                int i6 = 0;
                while (qb4.YK()) {
                    int iKK4 = qb4.KK();
                    Xu xuXd4 = Xu.Xd(iKK4);
                    iArr4[i6] = xuXd4.fK(sXd5 + i6 + xuXd4.CK(iKK4) + sXd6);
                    i6++;
                }
                builder.appendQueryParameter(new String(iArr4, 0, i6), str);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        Intent intent = new Intent(this.context, (Class<?>) AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra(C1561oA.ud("_qp`gilEkbVXd", (short) (C1499aX.Xd() ^ (-5775))), i2);
        String strYd = C1561oA.yd("^\u000b\u0001\u0013\u0007g|\u000bv}|\u000bdu{yq\u0004{u{", (short) (FB.Xd() ^ 28591));
        if (!z2 && isJobServiceOn(intent)) {
            Logging.d(strYd, C1561oA.Yd("[wtxko,s}\u00020t\u0002\u0002\tz\u000f\f8>\u000e;\u0006\u0011>\u0001\r\u0014\b\u0005\t\u001fF\u001b\f\u0012\u0010\u0010\"\u001a\u0014\u0014^Q\u0005\u0019)+)&\"(\"ijk", (short) (C1499aX.Xd() ^ (-7839))), transportContext);
            return;
        }
        long nextCallTime = this.eventStore.getNextCallTime(transportContext);
        long scheduleDelay = this.config.getScheduleDelay(transportContext.getPriority(), nextCallTime, i2);
        Object[] objArr2 = {transportContext, Long.valueOf(scheduleDelay), Long.valueOf(nextCallTime), Integer.valueOf(i2)};
        short sXd7 = (short) (C1607wl.Xd() ^ 1618);
        short sXd8 = (short) (C1607wl.Xd() ^ 17914);
        int[] iArr5 = new int["9JPNN`XV\\V\u0010fb_cVZ\u0017^hl\u001b_llseyv#)x&pv)/oy\u00016Qqt}x\u0003y6\u0006}\u0012\u000f;\u007f~\u000b\f@\u0016\f\u0011\n\u0019\u001b\t\u0016\u001aJP\u0011V\\Oq&'\u0019\"&+W]\u001e".length()];
        QB qb5 = new QB("9JPNN`XV\\V\u0010fb_cVZ\u0017^hl\u001b_llseyv#)x&pv)/oy\u00016Qqt}x\u0003y6\u0006}\u0012\u000f;\u007f~\u000b\f@\u0016\f\u0011\n\u0019\u001b\t\u0016\u001aJP\u0011V\\Oq&'\u0019\"&+W]\u001e");
        int i7 = 0;
        while (qb5.YK()) {
            int iKK5 = qb5.KK();
            Xu xuXd5 = Xu.Xd(iKK5);
            iArr5[i7] = xuXd5.fK((xuXd5.CK(iKK5) - (sXd7 + i7)) + sXd8);
            i7++;
        }
        Logging.d(strYd, new String(iArr5, 0, i7), objArr2);
        this.alarmManager.set(3, this.clock.getTime() + scheduleDelay, PendingIntent.getBroadcast(this.context, 0, intent, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL));
    }
}
