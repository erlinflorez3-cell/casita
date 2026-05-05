package com.facetec.sdk;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import yg.C1499aX;
import yg.C1561oA;
import yg.Od;

/* JADX INFO: loaded from: classes3.dex */
abstract class g extends Activity {
    private final AtomicBoolean B = new AtomicBoolean(false);
    Handler Code;
    View I;
    RelativeLayout V;
    ad Z;

    enum Z {
        NOT_GRANTED,
        DENIED_ALWAYS,
        GRANTED
    }

    g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        if (!Code() && !isFinishing()) {
            B();
        }
    }

    abstract void B();

    final void B(boolean z2) {
        this.B.set(z2);
    }

    abstract void C();

    abstract void Code(int i2);

    final boolean Code() {
        return this.B.get();
    }

    abstract void D();

    abstract void F();

    protected final void I() {
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.CAMERA"}, 0);
        B(true);
    }

    abstract void L();

    abstract void S();

    protected final Z V() {
        return ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") != 0 ? (!n.C(this).getBoolean("cameraPermissionsShown", false) || ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.CAMERA")) ? Z.NOT_GRANTED : Z.DENIED_ALWAYS : Z.GRANTED;
    }

    abstract void V(String str);

    abstract void Z();

    abstract void a();

    abstract void b();

    abstract void c();

    abstract void d();

    abstract void e();

    abstract void f();

    abstract void g();

    abstract void i();

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (n.V(configuration)) {
            g();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Handler handler = this.Code;
        if (handler != null) {
            handler.removeCallbacks(null);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() throws Throwable {
        super.onResume();
        Handler handler = this.Code;
        Object[] objArr = {new Runnable() { // from class: com.facetec.sdk.g.4
            @Override // java.lang.Runnable
            public final void run() {
                if (g.this.hasWindowFocus()) {
                    return;
                }
                g.this.j();
            }
        }, 1000L};
        Method method = Class.forName(C1561oA.ud("MYN[WPJ\u0013SV\u0010)AMBIAM", (short) (Od.Xd() ^ (-18068)))).getMethod(C1561oA.Yd("\n\n\u000f\u0011a\u0004\f\u0002\u001b\b\b", (short) (C1499aX.Xd() ^ (-8415))), Class.forName(C1561oA.yd("\u001f\u0017-\u0019f&\u001c*$k\u00115/0$&1+", (short) (C1499aX.Xd() ^ (-20212)))), Long.TYPE);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public synchronized void onWindowFocusChanged(boolean z2) {
        if (!z2) {
            j();
        }
    }
}
