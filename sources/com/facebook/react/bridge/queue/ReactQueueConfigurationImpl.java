package com.facebook.react.bridge.queue;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1607wl;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class ReactQueueConfigurationImpl implements ReactQueueConfiguration {
    private final MessageQueueThreadImpl mJSQueueThread;
    private final MessageQueueThreadImpl mNativeModulesQueueThread;
    private final MessageQueueThreadImpl mUIQueueThread;

    private ReactQueueConfigurationImpl(MessageQueueThreadImpl messageQueueThreadImpl, MessageQueueThreadImpl messageQueueThreadImpl2, MessageQueueThreadImpl messageQueueThreadImpl3) {
        this.mUIQueueThread = messageQueueThreadImpl;
        this.mNativeModulesQueueThread = messageQueueThreadImpl2;
        this.mJSQueueThread = messageQueueThreadImpl3;
    }

    public static ReactQueueConfigurationImpl create(ReactQueueConfigurationSpec reactQueueConfigurationSpec, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        return new ReactQueueConfigurationImpl(MessageQueueThreadImpl.create(MessageQueueThreadSpec.mainThreadSpec(), queueThreadExceptionHandler), MessageQueueThreadImpl.create(reactQueueConfigurationSpec.getNativeModulesQueueThreadSpec(), queueThreadExceptionHandler), MessageQueueThreadImpl.create(reactQueueConfigurationSpec.getJSQueueThreadSpec(), queueThreadExceptionHandler));
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    public void destroy() throws Throwable {
        Looper looper = this.mNativeModulesQueueThread.getLooper();
        Class<?> cls = Class.forName(C1561oA.Xd("LZQ`^YU bg#Bfgi_m", (short) (OY.Xd() ^ 7511)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 6249);
        int[] iArr = new int["\u0001\u007f\fev\u007f\u0002`\u0011\u0012\u0010\u0006\u0010".length()];
        QB qb = new QB("\u0001\u007f\fev\u007f\u0002`\u0011\u0012\u0010\u0006\u0010");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            if (looper != ((Looper) declaredMethod.invoke(null, objArr))) {
                this.mNativeModulesQueueThread.quitSynchronous();
            }
            Looper looper2 = this.mJSQueueThread.getLooper();
            Object[] objArr2 = new Object[0];
            Method declaredMethod2 = Class.forName(Qg.kd("%1&3/(\"j+.g\u0005'&&\u001a&", (short) (C1607wl.Xd() ^ 24517), (short) (C1607wl.Xd() ^ 768))).getDeclaredMethod(hg.Vd("\u0014\u0011\u001fv\n\u0011\u0015q\u0014\u0013\u0013\u0007\u0013", (short) (C1607wl.Xd() ^ 18417), (short) (C1607wl.Xd() ^ 25027)), new Class[0]);
            try {
                declaredMethod2.setAccessible(true);
                if (looper2 != ((Looper) declaredMethod2.invoke(null, objArr2))) {
                    this.mJSQueueThread.quitSynchronous();
                }
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    public MessageQueueThread getJSQueueThread() {
        return this.mJSQueueThread;
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    public MessageQueueThread getNativeModulesQueueThread() {
        return this.mNativeModulesQueueThread;
    }

    @Override // com.facebook.react.bridge.queue.ReactQueueConfiguration
    public MessageQueueThread getUIQueueThread() {
        return this.mUIQueueThread;
    }
}
