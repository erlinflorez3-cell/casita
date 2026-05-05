package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes3.dex */
public final class AFe1oSDK {
    final Set<AFe1pSDK> AFAdRevenueData;
    final NavigableSet<AFe1mSDK<?>> areAllFieldsValid;
    final NavigableSet<AFe1mSDK<?>> component1;
    final Set<AFe1pSDK> component2;
    final List<AFe1mSDK<?>> component3;
    final Set<AFe1mSDK<?>> component4;
    public Executor getCurrencyIso4217Code;
    public final List<AFe1qSDK> getMediationNetwork;
    final Timer getMonetizationNetwork;
    final ExecutorService getRevenue;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1oSDK$1 */
    public class AnonymousClass1 implements Runnable {
        private /* synthetic */ AFe1mSDK getRevenue;

        public AnonymousClass1(AFe1mSDK aFe1mSDK) {
            this.getRevenue = aFe1mSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zAdd;
            synchronized (AFe1oSDK.this.areAllFieldsValid) {
                if (AFe1oSDK.this.component4.contains(this.getRevenue)) {
                    AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, new StringBuilder("tried to add already running task: ").append(this.getRevenue).toString());
                    return;
                }
                if (AFe1oSDK.this.areAllFieldsValid.contains(this.getRevenue) || AFe1oSDK.this.component1.contains(this.getRevenue)) {
                    AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, new StringBuilder("tried to add already scheduled task: ").append(this.getRevenue).toString());
                    return;
                }
                AFe1oSDK aFe1oSDK = AFe1oSDK.this;
                AFe1mSDK aFe1mSDK = this.getRevenue;
                for (AFe1pSDK aFe1pSDK : aFe1mSDK.getCurrencyIso4217Code) {
                    if (aFe1oSDK.component2.contains(aFe1pSDK)) {
                        aFe1mSDK.AFAdRevenueData.add(aFe1pSDK);
                    }
                }
                if (AFe1oSDK.this.getMonetizationNetwork(this.getRevenue)) {
                    zAdd = AFe1oSDK.this.areAllFieldsValid.add(this.getRevenue);
                } else {
                    zAdd = AFe1oSDK.this.component1.add(this.getRevenue);
                    if (zAdd) {
                        AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, new StringBuilder("new task was blocked: ").append(this.getRevenue).toString());
                        this.getRevenue.getMediationNetwork();
                    }
                }
                if (zAdd) {
                    AFe1oSDK.this.areAllFieldsValid.addAll(AFe1oSDK.this.component3);
                    AFe1oSDK.this.component3.clear();
                } else {
                    AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, new StringBuilder("task not added, it's already in the queue: ").append(this.getRevenue).toString());
                }
                if (!zAdd) {
                    AFLogger.INSTANCE.w(AFg1cSDK.QUEUE, new StringBuilder("QUEUE: tried to add already pending task: ").append(this.getRevenue).toString());
                    return;
                }
                AFe1oSDK.this.component2.add(this.getRevenue.getRevenue);
                AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, new StringBuilder("new task added: ").append(this.getRevenue).toString());
                for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                }
                AFe1oSDK aFe1oSDK2 = AFe1oSDK.this;
                aFe1oSDK2.getRevenue.submit(aFe1oSDK2.new AnonymousClass2());
                AFe1oSDK aFe1oSDK3 = AFe1oSDK.this;
                synchronized (aFe1oSDK3.areAllFieldsValid) {
                    for (int size = (aFe1oSDK3.areAllFieldsValid.size() + aFe1oSDK3.component1.size()) - 40; size > 0; size--) {
                        boolean zIsEmpty = aFe1oSDK3.component1.isEmpty();
                        boolean zIsEmpty2 = aFe1oSDK3.areAllFieldsValid.isEmpty();
                        if (zIsEmpty2 || zIsEmpty) {
                            if (!zIsEmpty2) {
                                aFe1oSDK3.getMonetizationNetwork(aFe1oSDK3.areAllFieldsValid);
                            } else if (!zIsEmpty) {
                                aFe1oSDK3.getMonetizationNetwork(aFe1oSDK3.component1);
                            }
                        } else if (aFe1oSDK3.areAllFieldsValid.first().compareTo(aFe1oSDK3.component1.first()) > 0) {
                            aFe1oSDK3.getMonetizationNetwork(aFe1oSDK3.areAllFieldsValid);
                        } else {
                            aFe1oSDK3.getMonetizationNetwork(aFe1oSDK3.component1);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1oSDK$2 */
    final class AnonymousClass2 implements Runnable {
        AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFe1oSDK.this.areAllFieldsValid) {
                AFe1mSDK<?> aFe1mSDKPollFirst = AFe1oSDK.this.areAllFieldsValid.pollFirst();
                if (aFe1mSDKPollFirst == null) {
                    return;
                }
                AFe1oSDK.this.component4.add(aFe1mSDKPollFirst);
                long jAFAdRevenueData = aFe1mSDKPollFirst.AFAdRevenueData();
                AFe1lSDK aFe1lSDK = new AFe1lSDK(Thread.currentThread());
                if (jAFAdRevenueData > 0) {
                    AFe1oSDK.this.getMonetizationNetwork.schedule(aFe1lSDK, jAFAdRevenueData);
                }
                AFe1oSDK aFe1oSDK = AFe1oSDK.this;
                aFe1oSDK.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1oSDK.3
                    private /* synthetic */ AFe1mSDK getMonetizationNetwork;

                    AnonymousClass3(AFe1mSDK aFe1mSDKPollFirst2) {
                        aFe1mSDK = aFe1mSDKPollFirst2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                        }
                    }
                });
                if (!AFe1oSDK.this.areAllFieldsValid.isEmpty()) {
                    AFe1oSDK aFe1oSDK2 = AFe1oSDK.this;
                    aFe1oSDK2.getRevenue.submit(aFe1oSDK2.new AnonymousClass2());
                }
                try {
                    AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, "starting task execution: ".concat(String.valueOf(aFe1mSDKPollFirst2)));
                    AFe1uSDK aFe1uSDKCall = aFe1mSDKPollFirst2.call();
                    aFe1lSDK.cancel();
                    AFe1oSDK aFe1oSDK3 = AFe1oSDK.this;
                    aFe1oSDK3.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1oSDK.4
                        private /* synthetic */ AFe1mSDK AFAdRevenueData;
                        private /* synthetic */ AFe1uSDK getMediationNetwork;

                        AnonymousClass4(AFe1mSDK aFe1mSDKPollFirst2, AFe1uSDK aFe1uSDKCall2) {
                            aFe1mSDK = aFe1mSDKPollFirst2;
                            aFe1uSDK = aFe1uSDKCall2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, new StringBuilder("execution finished for ").append(aFe1mSDK).append(", result: ").append(aFe1uSDK).toString());
                            AFe1oSDK.this.component4.remove(aFe1mSDK);
                            Iterator<AFe1qSDK> it = AFe1oSDK.this.getMediationNetwork.iterator();
                            while (it.hasNext()) {
                                it.next().getRevenue(aFe1mSDK, aFe1uSDK);
                            }
                            if (aFe1uSDK == AFe1uSDK.SUCCESS) {
                                AFe1oSDK.this.AFAdRevenueData.add(aFe1mSDK.getRevenue);
                                AFe1oSDK.this.getRevenue();
                                return;
                            }
                            if (!aFe1mSDK.getMonetizationNetwork()) {
                                AFe1oSDK.this.AFAdRevenueData.add(aFe1mSDK.getRevenue);
                                AFe1oSDK.this.getRevenue();
                            } else if (AFe1oSDK.AFAdRevenueData(aFe1mSDK)) {
                                synchronized (AFe1oSDK.this.areAllFieldsValid) {
                                    AFe1oSDK.this.component3.add(aFe1mSDK);
                                    for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                                    }
                                }
                            }
                        }
                    });
                } catch (InterruptedIOException | InterruptedException unused) {
                    AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(aFe1mSDKPollFirst2)));
                    aFe1mSDKPollFirst2.getMonetizationNetwork = AFe1uSDK.TIMEOUT;
                    AFe1oSDK aFe1oSDK4 = AFe1oSDK.this;
                    aFe1oSDK4.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1oSDK.4
                        private /* synthetic */ AFe1mSDK AFAdRevenueData;
                        private /* synthetic */ AFe1uSDK getMediationNetwork;

                        AnonymousClass4(AFe1mSDK aFe1mSDKPollFirst2, AFe1uSDK aFe1uSDKCall2) {
                            aFe1mSDK = aFe1mSDKPollFirst2;
                            aFe1uSDK = aFe1uSDKCall2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, new StringBuilder("execution finished for ").append(aFe1mSDK).append(", result: ").append(aFe1uSDK).toString());
                            AFe1oSDK.this.component4.remove(aFe1mSDK);
                            Iterator<AFe1qSDK> it = AFe1oSDK.this.getMediationNetwork.iterator();
                            while (it.hasNext()) {
                                it.next().getRevenue(aFe1mSDK, aFe1uSDK);
                            }
                            if (aFe1uSDK == AFe1uSDK.SUCCESS) {
                                AFe1oSDK.this.AFAdRevenueData.add(aFe1mSDK.getRevenue);
                                AFe1oSDK.this.getRevenue();
                                return;
                            }
                            if (!aFe1mSDK.getMonetizationNetwork()) {
                                AFe1oSDK.this.AFAdRevenueData.add(aFe1mSDK.getRevenue);
                                AFe1oSDK.this.getRevenue();
                            } else if (AFe1oSDK.AFAdRevenueData(aFe1mSDK)) {
                                synchronized (AFe1oSDK.this.areAllFieldsValid) {
                                    AFe1oSDK.this.component3.add(aFe1mSDK);
                                    for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                                    }
                                }
                            }
                        }
                    });
                } catch (Throwable unused2) {
                    aFe1lSDK.cancel();
                    AFe1oSDK aFe1oSDK5 = AFe1oSDK.this;
                    aFe1oSDK5.getCurrencyIso4217Code.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1oSDK.4
                        private /* synthetic */ AFe1mSDK AFAdRevenueData;
                        private /* synthetic */ AFe1uSDK getMediationNetwork;

                        AnonymousClass4(AFe1mSDK aFe1mSDKPollFirst2, AFe1uSDK aFe1uSDKCall2) {
                            aFe1mSDK = aFe1mSDKPollFirst2;
                            aFe1uSDK = aFe1uSDKCall2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, new StringBuilder("execution finished for ").append(aFe1mSDK).append(", result: ").append(aFe1uSDK).toString());
                            AFe1oSDK.this.component4.remove(aFe1mSDK);
                            Iterator<AFe1qSDK> it = AFe1oSDK.this.getMediationNetwork.iterator();
                            while (it.hasNext()) {
                                it.next().getRevenue(aFe1mSDK, aFe1uSDK);
                            }
                            if (aFe1uSDK == AFe1uSDK.SUCCESS) {
                                AFe1oSDK.this.AFAdRevenueData.add(aFe1mSDK.getRevenue);
                                AFe1oSDK.this.getRevenue();
                                return;
                            }
                            if (!aFe1mSDK.getMonetizationNetwork()) {
                                AFe1oSDK.this.AFAdRevenueData.add(aFe1mSDK.getRevenue);
                                AFe1oSDK.this.getRevenue();
                            } else if (AFe1oSDK.AFAdRevenueData(aFe1mSDK)) {
                                synchronized (AFe1oSDK.this.areAllFieldsValid) {
                                    AFe1oSDK.this.component3.add(aFe1mSDK);
                                    for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                                    }
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1oSDK$3 */
    final class AnonymousClass3 implements Runnable {
        private /* synthetic */ AFe1mSDK getMonetizationNetwork;

        AnonymousClass3(AFe1mSDK aFe1mSDKPollFirst2) {
            aFe1mSDK = aFe1mSDKPollFirst2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
            }
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1oSDK$4 */
    final class AnonymousClass4 implements Runnable {
        private /* synthetic */ AFe1mSDK AFAdRevenueData;
        private /* synthetic */ AFe1uSDK getMediationNetwork;

        AnonymousClass4(AFe1mSDK aFe1mSDKPollFirst2, AFe1uSDK aFe1uSDKCall2) {
            aFe1mSDK = aFe1mSDKPollFirst2;
            aFe1uSDK = aFe1uSDKCall2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFLogger.INSTANCE.d(AFg1cSDK.QUEUE, new StringBuilder("execution finished for ").append(aFe1mSDK).append(", result: ").append(aFe1uSDK).toString());
            AFe1oSDK.this.component4.remove(aFe1mSDK);
            Iterator<AFe1qSDK> it = AFe1oSDK.this.getMediationNetwork.iterator();
            while (it.hasNext()) {
                it.next().getRevenue(aFe1mSDK, aFe1uSDK);
            }
            if (aFe1uSDK == AFe1uSDK.SUCCESS) {
                AFe1oSDK.this.AFAdRevenueData.add(aFe1mSDK.getRevenue);
                AFe1oSDK.this.getRevenue();
                return;
            }
            if (!aFe1mSDK.getMonetizationNetwork()) {
                AFe1oSDK.this.AFAdRevenueData.add(aFe1mSDK.getRevenue);
                AFe1oSDK.this.getRevenue();
            } else if (AFe1oSDK.AFAdRevenueData(aFe1mSDK)) {
                synchronized (AFe1oSDK.this.areAllFieldsValid) {
                    AFe1oSDK.this.component3.add(aFe1mSDK);
                    for (AFe1qSDK aFe1qSDK : AFe1oSDK.this.getMediationNetwork) {
                    }
                }
            }
        }
    }

    public AFe1oSDK(ExecutorService executorService) throws Throwable {
        Class<?> cls = Class.forName(C1561oA.yd("ndxb6|znh)]hnbsofX`e&<nZO`^Xbb", (short) (C1633zX.Xd() ^ (-28784))));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (C1607wl.Xd() ^ 2084);
        int[] iArr = new int["\u0012\n\u001dy\u0011\u0017\u0011\u0017\u0011\u0001\u0016!\u0015\u0012\u0016w,\u001a\u0019,,(,".length()];
        QB qb = new QB("\u0012\n\u001dy\u0011\u0017\u0011\u0017\u0011\u0001\u0016!\u0015\u0012\u0016w,\u001a\u0019,,(,");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i2), clsArr);
        try {
            declaredMethod.setAccessible(true);
            this.getCurrencyIso4217Code = (ExecutorService) declaredMethod.invoke(null, objArr);
            this.getMonetizationNetwork = new Timer(true);
            this.getMediationNetwork = new CopyOnWriteArrayList();
            this.AFAdRevenueData = new CopyOnWriteArraySet();
            this.component2 = Collections.newSetFromMap(new ConcurrentHashMap());
            this.areAllFieldsValid = new ConcurrentSkipListSet();
            this.component1 = new ConcurrentSkipListSet();
            this.component3 = new ArrayList();
            this.component4 = Collections.newSetFromMap(new ConcurrentHashMap());
            this.getRevenue = executorService;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public static boolean AFAdRevenueData(AFe1mSDK<?> aFe1mSDK) {
        return ((aFe1mSDK instanceof AFf1uSDK) && aFe1mSDK.getRevenue == AFe1pSDK.ARS_VALIDATE) ? false : true;
    }

    final void getMonetizationNetwork(NavigableSet<AFe1mSDK<?>> navigableSet) {
        AFe1mSDK<?> aFe1mSDKPollFirst = navigableSet.pollFirst();
        this.AFAdRevenueData.add(aFe1mSDKPollFirst.getRevenue);
        Iterator<AFe1qSDK> it = this.getMediationNetwork.iterator();
        while (it.hasNext()) {
            it.next().getCurrencyIso4217Code(aFe1mSDKPollFirst);
        }
    }

    final boolean getMonetizationNetwork(AFe1mSDK<?> aFe1mSDK) {
        return this.AFAdRevenueData.containsAll(aFe1mSDK.AFAdRevenueData);
    }

    final void getRevenue() {
        synchronized (this.areAllFieldsValid) {
            Iterator<AFe1mSDK<?>> it = this.component1.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                AFe1mSDK<?> next = it.next();
                if (getMonetizationNetwork(next)) {
                    it.remove();
                    this.areAllFieldsValid.add(next);
                    z2 = true;
                }
            }
            if (z2) {
                this.getRevenue.submit(new AnonymousClass2());
            }
        }
    }
}
