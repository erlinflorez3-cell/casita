package com.davivienda.daviviendaapp.triggerArxan;

import android.app.Activity;
import android.app.Dialog;
import android.os.Process;
import android.view.View;
import android.widget.Button;
import com.davivienda.daviviendaapp.R;
import com.davivienda.daviviendaapp.triggerArxan.GuardReaction;
import com.dynatrace.android.callback.Callback;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1580rY;
import yg.C1626yg;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes3.dex */
public class GuardReaction {
    private static Activity s_instance = null;

    /* JADX INFO: renamed from: com.davivienda.daviviendaapp.triggerArxan.GuardReaction$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: instrumented$0$run$--V, reason: not valid java name */
        public static /* synthetic */ void m7094instrumented$0$run$V(View view) {
            Callback.onClick_enter(view);
            try {
                lambda$run$0(view);
            } finally {
                Callback.onClick_exit();
            }
        }

        private static /* synthetic */ void lambda$run$0(View view) {
            GuardReaction.s_instance.finish();
            Process.killProcess(Process.myPid());
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialog = new Dialog(GuardReaction.s_instance);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.arxan_modal);
            ((Button) dialog.findViewById(R.id.AlertButton)).setOnClickListener(new View.OnClickListener() { // from class: com.davivienda.daviviendaapp.triggerArxan.GuardReaction$1$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GuardReaction.AnonymousClass1.m7094instrumented$0$run$V(view);
                }
            });
            dialog.show();
        }
    }

    public static void deviceRooted() throws Throwable {
        int iXd = C1580rY.Xd() ^ (1073171515 ^ (-243161136));
        Class<?> cls = Class.forName(Jg.Wd("C\u001dW&.", (short) (C1499aX.Xd() ^ ((1983785102 ^ 143830331) ^ (-2125265334))), (short) (C1499aX.Xd() ^ (C1580rY.Xd() ^ 831077910))));
        Class<?>[] clsArr = {Integer.TYPE};
        Object[] objArr = {Integer.valueOf(iXd)};
        Method declaredMethod = cls.getDeclaredMethod(ZO.xd("7\u001b", (short) (OY.Xd() ^ (FB.Xd() ^ (844991042 ^ 1840442154))), (short) (OY.Xd() ^ (432646131 ^ 432656594))), clsArr);
        try {
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, objArr);
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(C1626yg.Ud("\u000f\\F\u00110", (short) (C1580rY.Xd() ^ (648119131 ^ (-648145662))), (short) (C1580rY.Xd() ^ (1449733948 ^ (-1449739894))))).getDeclaredMethod(Ig.wd("#@", (short) (ZN.Xd() ^ ((1355618900 ^ 284751841) ^ 1077271003))), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                declaredMethod2.invoke(null, objArr2);
                s_instance.runOnUiThread(new AnonymousClass1());
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    public static void setInstance(Activity activity) {
        s_instance = activity;
    }
}
