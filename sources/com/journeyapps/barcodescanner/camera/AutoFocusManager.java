package com.journeyapps.barcodescanner.camera;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import yg.C1561oA;
import yg.Jg;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
public final class AutoFocusManager {
    private static final long AUTO_FOCUS_INTERVAL_MS = 2000;
    private static final Collection<String> FOCUS_MODES_CALLING_AF;
    private static final String TAG = "AutoFocusManager";
    private int MESSAGE_FOCUS = 1;
    private final Camera.AutoFocusCallback autoFocusCallback;
    private final Camera camera;
    private final Handler.Callback focusHandlerCallback;
    private boolean focusing;
    private Handler handler;
    private boolean stopped;
    private final boolean useAutoFocus;

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.camera.AutoFocusManager$2, reason: invalid class name */
    class AnonymousClass2 implements Camera.AutoFocusCallback {
        AnonymousClass2() {
        }

        /* JADX INFO: renamed from: lambda$onAutoFocus$0$com-journeyapps-barcodescanner-camera-AutoFocusManager$2, reason: not valid java name */
        /* synthetic */ void m8613x7b23e9dd() {
            AutoFocusManager.this.focusing = false;
            AutoFocusManager.this.autoFocusAgainLater();
        }

        @Override // android.hardware.Camera.AutoFocusCallback
        public void onAutoFocus(boolean z2, Camera camera) throws Throwable {
            Handler handler = AutoFocusManager.this.handler;
            Runnable runnable = new Runnable() { // from class: com.journeyapps.barcodescanner.camera.AutoFocusManager$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m8613x7b23e9dd();
                }
            };
            Class<?> cls = Class.forName(Xg.qd("\f\u001a\u0011 \u001e\u0019\u0015_\"'b}\u0018&\u001d& .", (short) (ZN.Xd() ^ 12080), (short) (ZN.Xd() ^ 10848)));
            Class<?>[] clsArr = {Class.forName(Jg.Wd("&ISce\u0011+lJ>\u0018 NzR\tw\u001e", (short) (ZN.Xd() ^ 12011), (short) (ZN.Xd() ^ 17915)))};
            Object[] objArr = {runnable};
            short sXd = (short) (ZN.Xd() ^ 27940);
            short sXd2 = (short) (ZN.Xd() ^ 27700);
            int[] iArr = new int["m\b(<".length()];
            QB qb = new QB("m\b(<");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        FOCUS_MODES_CALLING_AF = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public AutoFocusManager(Camera camera, CameraSettings cameraSettings) {
        Handler.Callback callback = new Handler.Callback() { // from class: com.journeyapps.barcodescanner.camera.AutoFocusManager.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != AutoFocusManager.this.MESSAGE_FOCUS) {
                    return false;
                }
                AutoFocusManager.this.focus();
                return true;
            }
        };
        this.focusHandlerCallback = callback;
        this.autoFocusCallback = new AnonymousClass2();
        this.handler = new Handler(callback);
        this.camera = camera;
        String focusMode = camera.getParameters().getFocusMode();
        boolean z2 = cameraSettings.isAutoFocusEnabled() && FOCUS_MODES_CALLING_AF.contains(focusMode);
        this.useAutoFocus = z2;
        String str = TAG;
        String str2 = "Current focus mode '" + focusMode + "'; use auto focus? " + z2;
        start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void autoFocusAgainLater() {
        if (!this.stopped && !this.handler.hasMessages(this.MESSAGE_FOCUS)) {
            Handler handler = this.handler;
            handler.sendMessageDelayed(handler.obtainMessage(this.MESSAGE_FOCUS), AUTO_FOCUS_INTERVAL_MS);
        }
    }

    private void cancelOutstandingTask() {
        this.handler.removeMessages(this.MESSAGE_FOCUS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void focus() {
        if (!this.useAutoFocus || this.stopped || this.focusing) {
            return;
        }
        try {
            this.camera.autoFocus(this.autoFocusCallback);
            this.focusing = true;
        } catch (RuntimeException e2) {
            String str = TAG;
            autoFocusAgainLater();
        }
    }

    public void start() {
        this.stopped = false;
        focus();
    }

    public void stop() {
        this.stopped = true;
        this.focusing = false;
        cancelOutstandingTask();
        if (this.useAutoFocus) {
            try {
                this.camera.cancelAutoFocus();
            } catch (RuntimeException e2) {
                String str = TAG;
            }
        }
    }
}
