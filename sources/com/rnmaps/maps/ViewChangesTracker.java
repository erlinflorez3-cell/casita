package com.rnmaps.maps;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.Jg;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class ViewChangesTracker {
    private static ViewChangesTracker instance = null;
    private final LinkedList<MapMarker> markers = new LinkedList<>();
    private boolean hasScheduledFrame = false;
    private final long fps = 40;
    private final LinkedList<MapMarker> markersToRemove = new LinkedList<>();
    private final Handler handler = new Handler(Looper.myLooper());
    private final Runnable updateRunnable = new Runnable() { // from class: com.rnmaps.maps.ViewChangesTracker.1
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            ViewChangesTracker.this.update();
            if (ViewChangesTracker.this.markers.size() <= 0) {
                ViewChangesTracker.this.hasScheduledFrame = false;
                return;
            }
            Handler handler = ViewChangesTracker.this.handler;
            Object[] objArr = {ViewChangesTracker.this.updateRunnable, 40L};
            Method method = Class.forName(hg.Vd("6B7D@93{<?x\u0012*6+2*6", (short) (C1580rY.Xd() ^ (-9465)), (short) (C1580rY.Xd() ^ (-4681)))).getMethod(C1561oA.yd("\u0007\u0007\f\u000eVx\u0001v\btt", (short) (C1580rY.Xd() ^ (-12499))), Class.forName(C1561oA.ud("$\u001a.\u0018c!\u0015!\u0019^\u0002$\u001c\u001b\r\r\u0016\u000e", (short) (C1607wl.Xd() ^ 7539))), Long.TYPE);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    };

    /* JADX INFO: renamed from: com.rnmaps.maps.ViewChangesTracker$1 */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            ViewChangesTracker.this.update();
            if (ViewChangesTracker.this.markers.size() <= 0) {
                ViewChangesTracker.this.hasScheduledFrame = false;
                return;
            }
            Handler handler = ViewChangesTracker.this.handler;
            Object[] objArr = {ViewChangesTracker.this.updateRunnable, 40L};
            Method method = Class.forName(hg.Vd("6B7D@93{<?x\u0012*6+2*6", (short) (C1580rY.Xd() ^ (-9465)), (short) (C1580rY.Xd() ^ (-4681)))).getMethod(C1561oA.yd("\u0007\u0007\f\u000eVx\u0001v\btt", (short) (C1580rY.Xd() ^ (-12499))), Class.forName(C1561oA.ud("$\u001a.\u0018c!\u0015!\u0019^\u0002$\u001c\u001b\r\r\u0016\u000e", (short) (C1607wl.Xd() ^ 7539))), Long.TYPE);
            try {
                method.setAccessible(true);
                method.invoke(handler, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    private ViewChangesTracker() {
    }

    static ViewChangesTracker getInstance() {
        if (instance == null) {
            synchronized (ViewChangesTracker.class) {
                instance = new ViewChangesTracker();
            }
        }
        return instance;
    }

    public void addMarker(MapMarker mapMarker) throws Throwable {
        this.markers.add(mapMarker);
        if (this.hasScheduledFrame) {
            return;
        }
        this.hasScheduledFrame = true;
        Handler handler = this.handler;
        Runnable runnable = this.updateRunnable;
        Class<?> cls = Class.forName(C1561oA.Yd("M[Ra_ZV!ch$?Yg^gao", (short) (C1607wl.Xd() ^ 31654)));
        Class<?>[] clsArr = new Class[2];
        short sXd = (short) (ZN.Xd() ^ 32726);
        short sXd2 = (short) (ZN.Xd() ^ 18672);
        int[] iArr = new int["&\u001e4 m-#1+r\u0018<67+-82".length()];
        QB qb = new QB("&\u001e4 m-#1+r\u0018<67+-82");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) + sXd2);
            i2++;
        }
        clsArr[0] = Class.forName(new String(iArr, 0, i2));
        clsArr[1] = Long.TYPE;
        Object[] objArr = {runnable, 40L};
        Method method = cls.getMethod(Jg.Wd("9?nAAi}?\u0003w&", (short) (C1607wl.Xd() ^ 22888), (short) (C1607wl.Xd() ^ 28553)), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(handler, objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    public boolean containsMarker(MapMarker mapMarker) {
        return this.markers.contains(mapMarker);
    }

    public void removeMarker(MapMarker mapMarker) {
        this.markers.remove(mapMarker);
    }

    public void update() {
        for (MapMarker mapMarker : this.markers) {
            if (!mapMarker.updateCustomForTracking()) {
                this.markersToRemove.add(mapMarker);
            }
        }
        if (this.markersToRemove.size() > 0) {
            this.markers.removeAll(this.markersToRemove);
            this.markersToRemove.clear();
        }
    }
}
