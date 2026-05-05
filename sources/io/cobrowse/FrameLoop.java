package io.cobrowse;

import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1633zX;
import yg.FB;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
final class FrameLoop {
    private final Delegate delegate;
    private final Display display;
    private Runnable frameRunner;
    private final Handler handler;
    private Frame previousFrame;
    private Source source;

    interface Delegate extends Listener {
        void handleFrame(Display display, Frame frame);
    }

    interface Listener {
        void didCaptureFrame(Display display, Frame frame);

        boolean willCaptureFrame(Display display);
    }

    interface Source {
        void capturingWillStart(Display display);

        void capturingWillStop(Display display);

        boolean isNewFrameAvailable(Display display);

        Frame newFrame(Display display);
    }

    FrameLoop(Display display, Delegate delegate) throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.Kd("lzq\u0001~yu@\u0003\bCb\u0007\b\n\u007f\u000e", (short) (FB.Xd() ^ 24987))).getDeclaredMethod(Wg.Zd("D&PL{'GH\u0007:F^\u0007", (short) (ZN.Xd() ^ 9499), (short) (ZN.Xd() ^ 494)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            this.display = display;
            this.delegate = delegate;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private Frame generateFrame(Frame frame) {
        Source source = this.source;
        if (source == null) {
            return null;
        }
        if (frame != null && !source.isNewFrameAvailable(this.display)) {
            return frame;
        }
        if (!this.delegate.willCaptureFrame(this.display)) {
            return null;
        }
        Frame frameNewFrame = this.source.newFrame(this.display);
        this.delegate.didCaptureFrame(this.display, frameNewFrame);
        return frameNewFrame;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void loop() {
        if (isRunning()) {
            Handler handler = this.handler;
            Runnable runnable = this.frameRunner;
            short sXd = (short) (C1499aX.Xd() ^ (-21507));
            int[] iArr = new int["Yg^mkfb-ot0Kesjsm{".length()];
            QB qb = new QB("Yg^mkfb-ot0Kesjsm{");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (sXd + i2));
                i2++;
            }
            Object[] objArr = {runnable, 100L};
            Method method = Class.forName(new String(iArr, 0, i2)).getMethod(Qg.kd("8699\b(.\"9$\"", (short) (ZN.Xd() ^ 17592), (short) (ZN.Xd() ^ 10796)), Class.forName(Wg.vd("yo\bqA~v\u0003~Dk\u000e\n\t~~kc", (short) (Od.Xd() ^ (-27333)))), Long.TYPE);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
                Frame frameGenerateFrame = generateFrame(this.previousFrame);
                if (frameGenerateFrame != null) {
                    this.previousFrame = frameGenerateFrame;
                    this.delegate.handleFrame(this.display, frameGenerateFrame);
                    return;
                }
                this.handler.removeCallbacks(this.frameRunner);
                Handler handler2 = this.handler;
                Object[] objArr2 = {this.frameRunner, 15L};
                Method method2 = Class.forName(hg.Vd("\u0014 \u0015\"\u001e\u0017\u0011Y\u001a\u001dVo\b\u0014\t\u0010\b\u0014", (short) (C1633zX.Xd() ^ (-8513)), (short) (C1633zX.Xd() ^ (-11908)))).getMethod(C1561oA.yd("IINP\u0019;C9J77", (short) (C1580rY.Xd() ^ (-26947))), Class.forName(C1561oA.ud("\u001e\u0014(\u0012]\u001b\u000f\u001b\u0013X{\u001e\u0016\u0015\u0007\u0007\u0010\b", (short) (FB.Xd() ^ 1994))), Long.TYPE);
                try {
                    method2.setAccessible(true);
                    method2.invoke(handler2, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    boolean isRunning() {
        return this.frameRunner != null;
    }

    void setFrameSource(Source source) {
        if (this.source == source) {
            return;
        }
        if (!isRunning()) {
            this.source = source;
            return;
        }
        Source source2 = this.source;
        if (source2 != null) {
            source2.capturingWillStop(this.display);
        }
        this.source = source;
        source.capturingWillStart(this.display);
    }

    synchronized void start(Source source) {
        if (this.frameRunner == null) {
            this.source = source;
            source.capturingWillStart(this.display);
            this.frameRunner = new Runnable() { // from class: io.cobrowse.FrameLoop$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.loop();
                }
            };
            loop();
        }
    }

    synchronized void stop() {
        Runnable runnable = this.frameRunner;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
            this.frameRunner = null;
        }
        Source source = this.source;
        if (source != null) {
            source.capturingWillStop(this.display);
            this.source = null;
        }
        this.previousFrame = null;
    }
}
