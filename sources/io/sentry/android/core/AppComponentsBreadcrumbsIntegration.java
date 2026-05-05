package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.npmdavi.davinotification.Constant;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.IHub;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.internal.util.AndroidCurrentDateProvider;
import io.sentry.android.core.internal.util.Debouncer;
import io.sentry.android.core.internal.util.DeviceOrientations;
import io.sentry.protocol.Device;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class AppComponentsBreadcrumbsIntegration implements Integration, Closeable, ComponentCallbacks2 {
    private static final long DEBOUNCE_WAIT_TIME_MS = 60000;
    private static final Hint EMPTY_HINT = new Hint();
    private final Context context;
    private IHub hub;
    private SentryAndroidOptions options;
    private final Debouncer trimMemoryDebouncer = new Debouncer(AndroidCurrentDateProvider.getInstance(), 60000, 0);

    public AppComponentsBreadcrumbsIntegration(Context context) {
        this.context = (Context) Objects.requireNonNull(ContextUtils.getApplicationContext(context), "Context is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: captureConfigurationChangedBreadcrumb, reason: merged with bridge method [inline-methods] */
    public void m8904x57f88530(long j2, Configuration configuration) throws Throwable {
        if (this.hub != null) {
            Context context = this.context;
            short sXd = (short) (C1580rY.Xd() ^ (-23149));
            int[] iArr = new int["Q]Vc[TR\u001bKVX]IQZ\u0013Cnpuasr".length()];
            QB qb = new QB("Q]Vc[TR\u001bKVX]IQZ\u0013Cnpuasr");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Qg.kd("\u001f\u001c*\u0007\u0019&!&\"\u0012\u0013 ", (short) (C1580rY.Xd() ^ (-4899)), (short) (C1580rY.Xd() ^ (-23421))), new Class[0]);
            try {
                method.setAccessible(true);
                Device.DeviceOrientation orientation = DeviceOrientations.getOrientation(((Resources) method.invoke(context, objArr)).getConfiguration().orientation);
                String lowerCase = orientation != null ? orientation.name().toLowerCase(Locale.ROOT) : hg.Vd("\u0001xmmmosig", (short) (OY.Xd() ^ 466), (short) (OY.Xd() ^ 25020));
                Breadcrumb breadcrumb = new Breadcrumb(j2);
                breadcrumb.setType(C1561oA.ud("F8L>;4F:?=", (short) (C1633zX.Xd() ^ (-24326))));
                breadcrumb.setCategory(C1561oA.yd("\u0017\u0017+\u001d\u001a\u001bf'-#\"*3\u001f5)20", (short) (C1499aX.Xd() ^ (-16147))));
                breadcrumb.setData(C1561oA.Yd(",,1(4*11", (short) (C1499aX.Xd() ^ (-32671))), lowerCase);
                breadcrumb.setLevel(SentryLevel.INFO);
                Hint hint = new Hint();
                short sXd2 = (short) (FB.Xd() ^ 56);
                short sXd3 = (short) (FB.Xd() ^ 32586);
                int[] iArr2 = new int["2@7FD?;\u0012<IIBFETRBVLSS".length()];
                QB qb2 = new QB("2@7FD?;\u0012<IIBFETRBVLSS");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK((xuXd2.CK(iKK2) - (sXd2 + i3)) + sXd3);
                    i3++;
                }
                hint.set(new String(iArr2, 0, i3), configuration);
                this.hub.addBreadcrumb(breadcrumb, hint);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: captureLowMemoryBreadcrumb, reason: merged with bridge method [inline-methods] */
    public void m8905x2259e8ca(long j2, int i2) {
        if (this.hub != null) {
            Breadcrumb breadcrumb = new Breadcrumb(j2);
            breadcrumb.setType("system");
            breadcrumb.setCategory("device.event");
            breadcrumb.setMessage("Low memory");
            breadcrumb.setData(Constant.NOTIFICATION_DETAILS_ACTION, "LOW_MEMORY");
            breadcrumb.setData("level", Integer.valueOf(i2));
            breadcrumb.setLevel(SentryLevel.WARNING);
            this.hub.addBreadcrumb(breadcrumb, EMPTY_HINT);
        }
    }

    private void executeInBackground(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, th, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            Context context = this.context;
            Class<?> cls = Class.forName(Jg.Wd("\u0006:zOv\u0017\\l\rO\tEp0p oS|I\u0005>%", (short) (Od.Xd() ^ (-98)), (short) (Od.Xd() ^ (-10647))));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(ZO.xd("\u0011\u0002\u000e4TT!v;\u0014\"\u0017HwY\u007f\"/f&\u000f\u000fRKd#sf\u000fx\u0004\u0016X5", (short) (C1499aX.Xd() ^ (-14239)), (short) (C1499aX.Xd() ^ (-30624))));
            Object[] objArr = {this};
            Method method = cls.getMethod(C1626yg.Ud("\u0010:;0j1$Q,\"{-y\u0004$<fLU\u0003x7\u000ep%\u001a98", (short) (OY.Xd() ^ 25712), (short) (OY.Xd() ^ 875)), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (Throwable th) {
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, th, Ig.wd("\u0010rL;]3Ki,@m`1+;z+?_BXz\u0011^ME\u001aK/\u000bwRCmAxiDjKP>bb\u001f\u0017W(:h7", (short) (FB.Xd() ^ 5858)), new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.options;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().log(SentryLevel.DEBUG, EO.Od("\rm\u0010\nf\u001apo\u0012LKw&v7O\u0001\u001e5<\u0002V!6^gP\u0016ig*$xi\u0007~,z\u007f\u0014\u0017n\u0014\u007f", (short) (C1499aX.Xd() ^ (-1989))), new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(final Configuration configuration) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        executeInBackground(new Runnable() { // from class: io.sentry.android.core.AppComponentsBreadcrumbsIntegration$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.m8904x57f88530(jCurrentTimeMillis, configuration);
            }
        });
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(final int i2) {
        if (i2 >= 40 && !this.trimMemoryDebouncer.checkForDebounce()) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            executeInBackground(new Runnable() { // from class: io.sentry.android.core.AppComponentsBreadcrumbsIntegration$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8905x2259e8ca(jCurrentTimeMillis, i2);
                }
            });
        }
    }

    @Override // io.sentry.Integration
    public void register(IHub iHub, SentryOptions sentryOptions) {
        this.hub = (IHub) Objects.requireNonNull(iHub, C1561oA.Qd("{(\u0014P\u0019\"M\u001f\u0011\u001c\u001f\u0012\u001a\f\n", (short) (C1607wl.Xd() ^ 20786)));
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, C1593ug.zd("\u0002\u0015\u001f&%-u$\u001b*(#\u001f\u000b-2(//5b-8e9-:?4>22", (short) (Od.Xd() ^ (-11429)), (short) (Od.Xd() ^ (-6663))));
        this.options = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, C1561oA.od("`\u000f\u000e_\u000b\b\n\b\u0006{\u0004\t\u0007T\u0004uprp~\u0001wk{Ptyijtbthmk\u001c`hZZc[Y.\u0013\u0017d", (short) (OY.Xd() ^ 18502)), Boolean.valueOf(this.options.isEnableAppComponentBreadcrumbs()));
        if (this.options.isEnableAppComponentBreadcrumbs()) {
            try {
                Context context = this.context;
                short sXd = (short) (ZN.Xd() ^ 2771);
                int[] iArr = new int["y\b~\u000e\f\u0007\u0003M\u0004\u0011\u0011\u0018\n\u0014\u001bUk\u0019\u0019 \u0012&#".length()];
                QB qb = new QB("y\b~\u000e\f\u0007\u0003M\u0004\u0011\u0011\u0018\n\u0014\u001bUk\u0019\u0019 \u0012&#");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
                    i2++;
                }
                Class<?> cls = Class.forName(new String(iArr, 0, i2));
                Class<?>[] clsArr = new Class[1];
                short sXd2 = (short) (C1580rY.Xd() ^ (-22614));
                short sXd3 = (short) (C1580rY.Xd() ^ (-1855));
                int[] iArr2 = new int["|C\u0004[#V[lj@y\u000bD\u0017UXum6r:@\u0002D\u0015-U(` ivG\t".length()];
                QB qb2 = new QB("|C\u0004[#V[lj@y\u000bD\u0017UXum6r:@\u0002D\u0015-U(` ivG\t");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
                    i3++;
                }
                clsArr[0] = Class.forName(new String(iArr2, 0, i3));
                Object[] objArr = {this};
                Method method = cls.getMethod(C1561oA.Xd("qehkvxjxJwvzzzr|\u0004Sr~\u007fvvy\u0003\f", (short) (C1633zX.Xd() ^ (-16244))), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(context, objArr);
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, Wg.vd("m\u001c\u001fp\u0018\u0015\u001b\u0019\u0013\t\u0015\u001a\u0014a\u0015\u0007\u001e \"0.%\u001d-}\"+\u001b\u0018\"\u0014&6;=m26>>&03+%m", (short) (C1499aX.Xd() ^ (-22370))), new Object[0]);
                    IntegrationUtils.addIntegrationToSdkVersion(Qg.kd("V\u0005\u0004U\u0001}\u007f}{qy~|Jykfhftvmaq", (short) (ZN.Xd() ^ 10261), (short) (ZN.Xd() ^ 25601)));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (Throwable th) {
                this.options.setEnableAppComponentBreadcrumbs(false);
                sentryOptions.getLogger().log(SentryLevel.INFO, th, hg.Vd("Hsprpndlq?\\feZXY`g%\u0012Zc\u000f\\\\`\u000bK_IPRFFOG\u000f", (short) (FB.Xd() ^ 32443), (short) (FB.Xd() ^ 12157)), new Object[0]);
            }
        }
    }
}
