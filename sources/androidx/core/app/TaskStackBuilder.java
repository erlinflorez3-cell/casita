package androidx.core.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes4.dex */
public final class TaskStackBuilder implements Iterable<Intent> {
    private static final String TAG = "TaskStackBuilder";
    private final ArrayList<Intent> mIntents = new ArrayList<>();
    private final Context mSourceContext;

    public interface SupportParentable {
        Intent getSupportParentActivityIntent();
    }

    private TaskStackBuilder(Context context) {
        this.mSourceContext = context;
    }

    public static TaskStackBuilder create(Context context) {
        return new TaskStackBuilder(context);
    }

    @Deprecated
    public static TaskStackBuilder from(Context context) {
        return create(context);
    }

    public TaskStackBuilder addNextIntent(Intent intent) {
        this.mIntents.add(intent);
        return this;
    }

    public TaskStackBuilder addNextIntentWithParentStack(Intent intent) throws Throwable {
        ComponentName component = intent.getComponent();
        if (component == null) {
            Context context = this.mSourceContext;
            Object[] objArr = new Object[0];
            Method method = Class.forName(hg.Vd("4@5B>71y.97<,49q\u00061/4$61", (short) (C1499aX.Xd() ^ (-12277)), (short) (C1499aX.Xd() ^ (-10631)))).getMethod(C1561oA.ud("hesN^_f[`]DWcUZWc", (short) (C1633zX.Xd() ^ (-2193))), new Class[0]);
            try {
                method.setAccessible(true);
                component = intent.resolveActivity((PackageManager) method.invoke(context, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        if (component != null) {
            addParentStack(component);
        }
        addNextIntent(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaskStackBuilder addParentStack(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof SupportParentable ? ((SupportParentable) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = NavUtils.getParentActivityIntent(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                Context context = this.mSourceContext;
                Class<?> cls = Class.forName(C1561oA.yd("\u007f\f\u0001\u000e\n\u0003|E\n\u0015\u0013\u0018\b\u0010\u0015Mq\u001d\u001b \u0010\"\u001d", (short) (C1580rY.Xd() ^ (-32474))));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd = (short) (ZN.Xd() ^ 19479);
                int[] iArr = new int["SRb?QT]T[ZCXfZa`n".length()];
                QB qb = new QB("SRb?QT]T[ZCXfZa`n");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    component = supportParentActivityIntent.resolveActivity((PackageManager) method.invoke(context, objArr));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            addParentStack(component);
            addNextIntent(supportParentActivityIntent);
        }
        return this;
    }

    public TaskStackBuilder addParentStack(Class<?> cls) {
        return addParentStack(new ComponentName(this.mSourceContext, cls));
    }

    public TaskStackBuilder addParentStack(ComponentName componentName) throws Throwable {
        int size = this.mIntents.size();
        try {
            Intent parentActivityIntent = NavUtils.getParentActivityIntent(this.mSourceContext, componentName);
            while (parentActivityIntent != null) {
                this.mIntents.add(size, parentActivityIntent);
                parentActivityIntent = NavUtils.getParentActivityIntent(this.mSourceContext, parentActivityIntent.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public int getIntentCount() {
        return this.mIntents.size();
    }

    @Deprecated
    public Intent getIntent(int i2) {
        return editIntentAt(i2);
    }

    public Intent editIntentAt(int i2) {
        return this.mIntents.get(i2);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.mIntents.iterator();
    }

    public void startActivities() {
        startActivities(null);
    }

    public void startActivities(Bundle bundle) throws Throwable {
        if (this.mIntents.isEmpty()) {
            throw new IllegalStateException(C1626yg.Ud("\u0014\u000b\u0003!n4a~Z&\u0010e,Q2U/dj\u0019Nyp\u000b$dP\u0006Z!bl\\!<\u00135\u0005G3lZM\u0015(\u0013$9i\u0019AB\tu3$dv=1", (short) (ZN.Xd() ^ 14948), (short) (ZN.Xd() ^ 21599)));
        }
        Intent[] intentArr = (Intent[]) this.mIntents.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (!ContextCompat.startActivities(this.mSourceContext, intentArr, bundle)) {
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            Context context = this.mSourceContext;
            Object[] objArr = {intent};
            Method method = Class.forName(Xg.qd("\u0010\u001e\u0015$\"\u001d\u0019c\u001a''. *1k\u0002//6(<9", (short) (C1499aX.Xd() ^ (-17484)), (short) (C1499aX.Xd() ^ (-24819)))).getMethod(ZO.xd("jge\u0001r-$RTy\u0005\u007f\u0011", (short) (OY.Xd() ^ 2968), (short) (OY.Xd() ^ 17653)), Class.forName(Jg.Wd("\u0016Wr5W\b0\u001ex+_\u0012&e\u0011~7\u0003>S\u0012>", (short) (C1633zX.Xd() ^ (-22925)), (short) (C1633zX.Xd() ^ (-24150)))));
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    public PendingIntent getPendingIntent(int i2, int i3) {
        return getPendingIntent(i2, i3, (Bundle) null);
    }

    public PendingIntent getPendingIntent(int i2, int i3, boolean z2) {
        return getPendingIntent(i2, PendingIntentCompat.addMutabilityFlags(z2, i3));
    }

    public PendingIntent getPendingIntent(int i2, int i3, Bundle bundle) {
        if (this.mIntents.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.mIntents.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return PendingIntent.getActivities(this.mSourceContext, i2, intentArr, i3, bundle);
    }

    public PendingIntent getPendingIntent(int i2, int i3, Bundle bundle, boolean z2) {
        return getPendingIntent(i2, PendingIntentCompat.addMutabilityFlags(z2, i3), bundle);
    }

    public Intent[] getIntents() {
        int size = this.mIntents.size();
        Intent[] intentArr = new Intent[size];
        if (size == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent(this.mIntents.get(0)).addFlags(268484608);
        for (int i2 = 1; i2 < size; i2++) {
            intentArr[i2] = new Intent(this.mIntents.get(i2));
        }
        return intentArr;
    }
}
