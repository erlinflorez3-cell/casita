package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.startup.Initializer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileInstallerInitializer implements Initializer<Result> {
    private static final int DELAY_MS = 5000;

    public static class Result {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public Result create(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(ZO.xd("%2?C\f\b\tHvw\u001a\u0013l\u001bhg}!m4N?l", (short) (C1580rY.Xd() ^ (-8777)), (short) (C1580rY.Xd() ^ (-12288)))).getMethod(C1626yg.Ud("DV 1YGpE\u0004^MC\u0010;i\u00109\u0007$bx", (short) (OY.Xd() ^ 3882), (short) (OY.Xd() ^ 10378)), new Class[0]);
        try {
            method.setAccessible(true);
            delayAfterFirstFrame((Context) method.invoke(context, objArr));
            return new Result();
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    void delayAfterFirstFrame(final Context context) {
        Choreographer16Impl.postFrameCallback(new Runnable() { // from class: androidx.profileinstaller.ProfileInstallerInitializer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.m6968xfbd6c934(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: installAfterDelay, reason: merged with bridge method [inline-methods] */
    public void m6968xfbd6c934(final Context context) throws Throwable {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            short sXd = (short) (OY.Xd() ^ 10276);
            int[] iArr = new int["oLT}\u001ca<Mhk$d]WD^/".length()];
            QB qb = new QB("oLT}\u001ca<Mhk$d]WD^/");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ (sXd + i2)));
                i2++;
            }
            Object[] objArr = new Object[0];
            Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(EO.Od(")_P\u0006a.[A7\b\u001f}9", (short) (OY.Xd() ^ 21899)), new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                handler = Handler28Impl.createAsync((Looper) declaredMethod.invoke(null, objArr));
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } else {
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(C1561oA.Qd("9E:GC<6~?B{\u0019;::.:", (short) (C1580rY.Xd() ^ (-4939)))).getDeclaredMethod(C1593ug.zd("\u0016\u0015%~\u0014\u001d#\u0002&')\u001f-", (short) (C1580rY.Xd() ^ (-7007)), (short) (C1580rY.Xd() ^ (-4444))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                handler = new Handler((Looper) declaredMethod2.invoke(null, objArr2));
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        int iNextInt = new Random().nextInt(Math.max(1000, 1));
        Class<?> cls = Class.forName(C1561oA.od("\u0015!\u0016#\u001f\u0018\u0012Z\u001b\u001eWp\t\u0015\n\u0011\t\u0015", (short) (Od.Xd() ^ (-5023))));
        Class<?>[] clsArr = {Class.forName(C1561oA.Kd("IAWC\u0011PFTN\u0016;_YZNP[U", (short) (C1633zX.Xd() ^ (-31946)))), Long.TYPE};
        Object[] objArr3 = {new Runnable() { // from class: androidx.profileinstaller.ProfileInstallerInitializer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.writeInBackground(context);
            }
        }, Long.valueOf(iNextInt + 5000)};
        short sXd2 = (short) (ZN.Xd() ^ 21383);
        short sXd3 = (short) (ZN.Xd() ^ 8784);
        int[] iArr2 = new int["\u001d3\u0013k\rF%}o/A".length()];
        QB qb2 = new QB("\u001d3\u0013k\rF%}o/A");
        int i3 = 0;
        while (qb2.YK()) {
            int iKK2 = qb2.KK();
            Xu xuXd2 = Xu.Xd(iKK2);
            iArr2[i3] = xuXd2.fK(((i3 * sXd3) ^ sXd2) + xuXd2.CK(iKK2));
            i3++;
        }
        Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr3);
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Override // androidx.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeInBackground(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: androidx.profileinstaller.ProfileInstallerInitializer$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                ProfileInstaller.writeProfile(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class Choreographer16Impl {
        private Choreographer16Impl() {
        }

        public static void postFrameCallback(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.ProfileInstallerInitializer$Choreographer16Impl$$ExternalSyntheticLambda0
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j2) {
                    runnable.run();
                }
            });
        }
    }

    private static class Handler28Impl {
        private Handler28Impl() {
        }

        public static Handler createAsync(Looper looper) {
            return Handler.createAsync(looper);
        }
    }
}
