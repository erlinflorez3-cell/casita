package com.facetec.sdk;

import android.content.Context;
import android.os.AsyncTask;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1580rY;
import yg.C1626yg;
import yg.C1633zX;
import yg.Ig;

/* JADX INFO: loaded from: classes3.dex */
abstract class ax extends AsyncTask<Void, Void, Void> {
    protected Context V;

    /* JADX INFO: renamed from: com.facetec.sdk.ax$2 */
    final class AnonymousClass2 extends ax {
        private /* synthetic */ Runnable Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context, Runnable runnable) {
            super(context);
            runnable = runnable;
        }

        @Override // com.facetec.sdk.ax
        final void Code() {
            runnable.run();
        }

        @Override // com.facetec.sdk.ax, android.os.AsyncTask
        protected final /* synthetic */ Void doInBackground(Void[] voidArr) {
            return super.Z();
        }

        @Override // com.facetec.sdk.ax, android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(Void r1) {
            super.I();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.ax$4 */
    final class AnonymousClass4 extends ax {
        private /* synthetic */ Runnable B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(Context context, Runnable runnable) {
            super(context);
            runnable = runnable;
        }

        @Override // com.facetec.sdk.ax
        final void Code() {
            runnable.run();
        }

        @Override // com.facetec.sdk.ax, android.os.AsyncTask
        protected final /* synthetic */ Void doInBackground(Void[] voidArr) {
            return super.Z();
        }

        @Override // com.facetec.sdk.ax, android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(Void r1) {
            super.I();
        }
    }

    ax(Context context) throws Throwable {
        this.V = null;
        if (context != null) {
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1626yg.Ud("\u0001\rByQ%@)>gV+\u0019dw\u0017Xg#?\u000e$x", (short) (C1580rY.Xd() ^ (-12668)), (short) (C1580rY.Xd() ^ (-15940)))).getMethod(Ig.wd("]\f\u000b52\u000e\u001c.qAP)CL\u001do!5Ne*", (short) (C1633zX.Xd() ^ (-9281))), new Class[0]);
            try {
                method.setAccessible(true);
                this.V = (Context) method.invoke(context, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    static void Code(Runnable runnable) {
        new ax(null) { // from class: com.facetec.sdk.ax.4
            private /* synthetic */ Runnable B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(Context context, Runnable runnable2) {
                super(context);
                runnable = runnable2;
            }

            @Override // com.facetec.sdk.ax
            final void Code() {
                runnable.run();
            }

            @Override // com.facetec.sdk.ax, android.os.AsyncTask
            protected final /* synthetic */ Void doInBackground(Void[] voidArr) {
                return super.Z();
            }

            @Override // com.facetec.sdk.ax, android.os.AsyncTask
            protected final /* synthetic */ void onPostExecute(Void r1) {
                super.I();
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    static void Z(Runnable runnable) {
        new ax(null) { // from class: com.facetec.sdk.ax.2
            private /* synthetic */ Runnable Z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Context context, Runnable runnable2) {
                super(context);
                runnable = runnable2;
            }

            @Override // com.facetec.sdk.ax
            final void Code() {
                runnable.run();
            }

            @Override // com.facetec.sdk.ax, android.os.AsyncTask
            protected final /* synthetic */ Void doInBackground(Void[] voidArr) {
                return super.Z();
            }

            @Override // com.facetec.sdk.ax, android.os.AsyncTask
            protected final /* synthetic */ void onPostExecute(Void r1) {
                super.I();
            }
        }.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    protected void B() {
    }

    abstract void Code();

    protected final void I() {
        try {
            B();
        } catch (Throwable th) {
            L.V(th);
        }
    }

    protected final Void Z() {
        try {
            Code();
            return null;
        } catch (Throwable th) {
            L.V(th);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    protected /* synthetic */ Void doInBackground(Void[] voidArr) {
        return Z();
    }

    @Override // android.os.AsyncTask
    protected /* synthetic */ void onPostExecute(Void r1) {
        I();
    }
}
