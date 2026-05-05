package io.cobrowse;

import android.os.Handler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1593ug;
import yg.EO;
import yg.Ig;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
abstract class Encoder {
    protected Delegate delegate;
    protected Handler handler;

    interface Delegate {
        void onEncodedFrameData(Encoder encoder, byte[] bArr);

        void onEncoderError(Encoder encoder, Error error);
    }

    Encoder(Delegate delegate) {
        this.delegate = delegate;
    }

    Encoder(Delegate delegate, Handler handler) {
        this.delegate = delegate;
        this.handler = handler;
    }

    void destroy() {
        this.delegate = null;
    }

    abstract void encode(Frame frame);

    /* JADX INFO: renamed from: lambda$raiseEncodedFrameData$0$io-cobrowse-Encoder, reason: not valid java name */
    /* synthetic */ void m8815lambda$raiseEncodedFrameData$0$iocobrowseEncoder(Delegate delegate, byte[] bArr) {
        delegate.onEncodedFrameData(this, bArr);
    }

    /* JADX INFO: renamed from: lambda$raiseEncoderError$1$io-cobrowse-Encoder, reason: not valid java name */
    /* synthetic */ void m8816lambda$raiseEncoderError$1$iocobrowseEncoder(Delegate delegate, Error error) {
        delegate.onEncoderError(this, error);
    }

    abstract int maximumFramesInFlight();

    abstract String mimeType();

    protected void raiseEncodedFrameData(final byte[] bArr) throws Throwable {
        final Delegate delegate = this.delegate;
        if (delegate == null) {
            return;
        }
        Handler handler = this.handler;
        if (handler == null) {
            delegate.onEncodedFrameData(this, bArr);
            return;
        }
        Runnable runnable = new Runnable() { // from class: io.cobrowse.Encoder$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8815lambda$raiseEncodedFrameData$0$iocobrowseEncoder(delegate, bArr);
            }
        };
        short sXd = (short) (Od.Xd() ^ (-16734));
        short sXd2 = (short) (Od.Xd() ^ (-29333));
        int[] iArr = new int["F\u001a?\u007f\u0004N\u0011\u001ck_\u0007s,\"4\u0018 5".length()];
        QB qb = new QB("F\u001a?\u007f\u0004N\u0011\u001ck_\u0007s,\"4\u0018 5");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
            i2++;
        }
        Object[] objArr = {runnable};
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(EO.Od("\u000bYk\u0010", (short) (ZN.Xd() ^ 13486)), Class.forName(Ig.wd("c(OZwX9/XKu7dV}\u001diD", (short) (ZN.Xd() ^ 17776))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    protected void raiseEncoderError(final Error error) throws Throwable {
        final Delegate delegate = this.delegate;
        if (delegate == null) {
            return;
        }
        Handler handler = this.handler;
        if (handler == null) {
            delegate.onEncoderError(this, error);
            return;
        }
        Object[] objArr = {new Runnable() { // from class: io.cobrowse.Encoder$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m8816lambda$raiseEncoderError$1$iocobrowseEncoder(delegate, error);
            }
        }};
        Method method = Class.forName(C1561oA.Qd("o{p}yrl5ux2Kcodkco", (short) (Od.Xd() ^ (-9626)))).getMethod(C1561oA.od("}{~~", (short) (ZN.Xd() ^ 16458)), Class.forName(C1593ug.zd("\u0007~\u0015\u0001N\u000e\u0004\u0012\fSx\u001d\u0017\u0018\f\u000e\u0019\u0013", (short) (OY.Xd() ^ 5578), (short) (OY.Xd() ^ 6121))));
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    abstract void reset();
}
