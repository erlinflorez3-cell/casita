package com.facebook.drawee.components;

import android.os.Handler;
import android.os.Looper;
import com.facebook.drawee.components.DeferredReleaser;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import yg.C1499aX;
import yg.C1580rY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
class DeferredReleaserConcurrentImpl extends DeferredReleaser {
    private final Handler mUiHandler;
    private final Object mLock = new Object();
    private final Runnable releaseRunnable = new Runnable() { // from class: com.facebook.drawee.components.DeferredReleaserConcurrentImpl.1
        @Override // java.lang.Runnable
        public void run() {
            synchronized (DeferredReleaserConcurrentImpl.this.mLock) {
                ArrayList arrayList = DeferredReleaserConcurrentImpl.this.mTempList;
                DeferredReleaserConcurrentImpl deferredReleaserConcurrentImpl = DeferredReleaserConcurrentImpl.this;
                deferredReleaserConcurrentImpl.mTempList = deferredReleaserConcurrentImpl.mPendingReleasables;
                DeferredReleaserConcurrentImpl.this.mPendingReleasables = arrayList;
            }
            int size = DeferredReleaserConcurrentImpl.this.mTempList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((DeferredReleaser.Releasable) DeferredReleaserConcurrentImpl.this.mTempList.get(i2)).release();
            }
            DeferredReleaserConcurrentImpl.this.mTempList.clear();
        }
    };
    private ArrayList<DeferredReleaser.Releasable> mPendingReleasables = new ArrayList<>();
    private ArrayList<DeferredReleaser.Releasable> mTempList = new ArrayList<>();

    public DeferredReleaserConcurrentImpl() throws Throwable {
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Wg.vd("HVIXRME\u0010NS\u000b*JKI?I", (short) (C1580rY.Xd() ^ (-12224)))).getDeclaredMethod(Qg.kd("\u0012\u000f\u001dt\b\u000f\u0013o\u0012\u0011\u0011\u0005\u0011", (short) (ZN.Xd() ^ 221), (short) (ZN.Xd() ^ 30258)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            this.mUiHandler = new Handler((Looper) declaredMethod.invoke(null, objArr));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facebook.drawee.components.DeferredReleaser
    public void cancelDeferredRelease(DeferredReleaser.Releasable releasable) {
        synchronized (this.mLock) {
            this.mPendingReleasables.remove(releasable);
        }
    }

    @Override // com.facebook.drawee.components.DeferredReleaser
    public void scheduleDeferredRelease(DeferredReleaser.Releasable releasable) throws Throwable {
        if (!isOnUiThread()) {
            releasable.release();
            return;
        }
        synchronized (this.mLock) {
            if (this.mPendingReleasables.contains(releasable)) {
                return;
            }
            this.mPendingReleasables.add(releasable);
            boolean z2 = this.mPendingReleasables.size() == 1;
            if (z2) {
                Handler handler = this.mUiHandler;
                Runnable runnable = this.releaseRunnable;
                Class<?> cls = Class.forName(hg.Vd("\u001a&\u001b($\u001d\u0017_ #\\u\u000e\u001a\u000f\u0016\u000e\u001a", (short) (C1499aX.Xd() ^ (-19630)), (short) (C1499aX.Xd() ^ (-24404))));
                Class<?>[] clsArr = new Class[1];
                short sXd = (short) (C1499aX.Xd() ^ (-3068));
                int[] iArr = new int["'\u001d1\u001bf$\u0018$\u001ca\u0005'\u001f\u001e\u0010\u0010\u0019\u0011".length()];
                QB qb = new QB("'\u001d1\u001bf$\u0018$\u001ca\u0005'\u001f\u001e\u0010\u0010\u0019\u0011");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                clsArr[0] = Class.forName(new String(iArr, 0, i2));
                Object[] objArr = {runnable};
                short sXd2 = (short) (C1580rY.Xd() ^ (-5791));
                int[] iArr2 = new int["uuz|".length()];
                QB qb2 = new QB("uuz|");
                int i3 = 0;
                while (qb2.YK()) {
                    int iKK2 = qb2.KK();
                    Xu xuXd2 = Xu.Xd(iKK2);
                    iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                    i3++;
                }
                Method method = cls.getMethod(new String(iArr2, 0, i3), clsArr);
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
        }
    }
}
