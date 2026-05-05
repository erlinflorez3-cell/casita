package com.google.common.eventbus;

import com.google.common.base.Preconditions;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1626yg;
import yg.C1633zX;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.Kl;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes7.dex */
@ElementTypesAreNonnullByDefault
class Subscriber {
    private EventBus bus;
    private final Executor executor;
    private final Method method;
    final Object target;

    static final class SynchronizedSubscriber extends Subscriber {
        private SynchronizedSubscriber(EventBus bus, Object target, Method method) {
            super(bus, target, method);
        }

        /* synthetic */ SynchronizedSubscriber(EventBus eventBus, Object obj, Method method, AnonymousClass1 anonymousClass1) {
            this(eventBus, obj, method);
        }

        @Override // com.google.common.eventbus.Subscriber
        void invokeSubscriberMethod(Object event) throws InvocationTargetException {
            synchronized (this) {
                super.invokeSubscriberMethod(event);
            }
        }
    }

    private Subscriber(EventBus bus, Object target, Method method) {
        this.bus = bus;
        this.target = Preconditions.checkNotNull(target);
        this.method = method;
        method.setAccessible(true);
        this.executor = bus.executor();
    }

    /* synthetic */ Subscriber(EventBus eventBus, Object obj, Method method, AnonymousClass1 anonymousClass1) {
        this(eventBus, obj, method);
    }

    private SubscriberExceptionContext context(Object event) {
        return new SubscriberExceptionContext(this.bus, event, this.target, this.method);
    }

    static Subscriber create(EventBus bus, Object listener, Method method) {
        return isDeclaredThreadSafe(method) ? new Subscriber(bus, listener, method) : new SynchronizedSubscriber(bus, listener, method);
    }

    private static boolean isDeclaredThreadSafe(Method method) {
        return Kl.zd(method, AllowConcurrentEvents.class) != null;
    }

    final void dispatchEvent(final Object event) {
        this.executor.execute(new Runnable() { // from class: com.google.common.eventbus.Subscriber$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f$0.m7676lambda$dispatchEvent$0$comgooglecommoneventbusSubscriber(event);
            }
        });
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (!(obj instanceof Subscriber)) {
            return false;
        }
        Subscriber subscriber = (Subscriber) obj;
        return this.target == subscriber.target && this.method.equals(subscriber.method);
    }

    public final int hashCode() {
        return ((this.method.hashCode() + 31) * 31) + System.identityHashCode(this.target);
    }

    void invokeSubscriberMethod(Object event) throws Throwable {
        try {
            this.method.invoke(this.target, Preconditions.checkNotNull(event));
        } catch (IllegalAccessException e2) {
            Object[] objArr = {Jg.Wd("\tI} NqRCm\u001a=w\u0017\u007fn\"<i\u0010Au#?g\u0018>9N", (short) (FB.Xd() ^ 20043), (short) (FB.Xd() ^ 32715)) + event, e2};
            Constructor<?> constructor = Class.forName(ZO.xd("\u0004aTA\b\t\u001b\f2\u0003\f5^WS", (short) (OY.Xd() ^ 30705), (short) (OY.Xd() ^ 28463))).getConstructor(Class.forName(C1626yg.Ud("RXqV\u0014Q\"Q\u0013pwk3}y]", (short) (C1580rY.Xd() ^ (-31670)), (short) (C1580rY.Xd() ^ (-12079)))), Class.forName(Ig.wd("4c+2\u001e7\u0004a'\"N<ry&n&:k", (short) (ZN.Xd() ^ 26215))));
            try {
                constructor.setAccessible(true);
                throw ((Error) constructor.newInstance(objArr));
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (IllegalArgumentException e4) {
            short sXd = (short) (Od.Xd() ^ (-11408));
            int[] iArr = new int["d*-{\u0015V %B61\u000fN;@\\e^\u001aY\u0012K\u0016Fqt'gk)M1A".length()];
            QB qb = new QB("d*-{\u0015V %B61\u000fN;@\\e^\u001aY\u0012K\u0016Fqt'gk)M1A");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + i2)) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr2 = {new String(iArr, 0, i2) + event, e4};
            Constructor<?> constructor2 = Class.forName(C1561oA.Qd("\u0013\t\u001d\u0007R\u0010\u0004\u0010\bMc\u0010\u000f\u000b\r", (short) (OY.Xd() ^ 26452))).getConstructor(Class.forName(C1593ug.zd("5-C/|<2@:\u0002(JIAGA", (short) (ZN.Xd() ^ 20125), (short) (ZN.Xd() ^ 782))), Class.forName(C1561oA.od("xn\u0003l8uium3Xktpw``ia", (short) (C1633zX.Xd() ^ (-17667)))));
            try {
                constructor2.setAccessible(true);
                throw ((Error) constructor2.newInstance(objArr2));
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        } catch (InvocationTargetException e6) {
            if (!(e6.getCause() instanceof Error)) {
                throw e6;
            }
            throw ((Error) e6.getCause());
        }
    }

    /* JADX INFO: renamed from: lambda$dispatchEvent$0$com-google-common-eventbus-Subscriber */
    /* synthetic */ void m7676lambda$dispatchEvent$0$comgooglecommoneventbusSubscriber(Object obj) throws Throwable {
        try {
            invokeSubscriberMethod(obj);
        } catch (InvocationTargetException e2) {
            this.bus.handleSubscriberException(e2.getCause(), context(obj));
        }
    }
}
