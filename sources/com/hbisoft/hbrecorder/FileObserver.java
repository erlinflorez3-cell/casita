package com.hbisoft.hbrecorder;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.Ig;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes7.dex */
class FileObserver extends android.os.FileObserver {
    private final int mMask;
    private List<SingleFileObserver> mObservers;
    private final String mPath;
    private final MyListener ml;

    class SingleFileObserver extends android.os.FileObserver {
        final String mPath;

        SingleFileObserver(String str, int i2) {
            super(str, i2);
            this.mPath = str;
        }

        @Override // android.os.FileObserver
        public void onEvent(int i2, String str) throws Throwable {
            FileObserver.this.onEvent(i2, this.mPath + RemoteSettings.FORWARD_SLASH_STRING + str);
        }
    }

    FileObserver(String str, MyListener myListener) {
        super(str, 4095);
        this.mPath = str;
        this.mMask = 4095;
        this.ml = myListener;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i2, String str) throws Throwable {
        if (i2 == 8) {
            Class<?> cls = Class.forName(ZO.xd("8\u0018sv,r1UUIu\u001b~_dyG", (short) (C1633zX.Xd() ^ (-21332)), (short) (C1633zX.Xd() ^ (-9035))));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr = new Object[0];
            short sXd = (short) (Od.Xd() ^ (-23207));
            short sXd2 = (short) (Od.Xd() ^ (-19524));
            int[] iArr = new int["\n||FWtG}$04n\u0010".length()];
            QB qb = new QB("\n||FWtG}$04n\u0010");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
                i3++;
            }
            Method declaredMethod = cls.getDeclaredMethod(new String(iArr, 0, i3), clsArr);
            try {
                declaredMethod.setAccessible(true);
                Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
                Object[] objArr2 = {new Runnable() { // from class: com.hbisoft.hbrecorder.FileObserver.1
                    @Override // java.lang.Runnable
                    public void run() {
                        FileObserver.this.ml.onCompleteCallback();
                    }
                }};
                Method method = Class.forName(Ig.wd("k Fz\u001er?gq\b>|*?S@k\u0001", (short) (ZN.Xd() ^ 17636))).getMethod(C1561oA.Qd("\u001b\u0019\u001c\u001c", (short) (ZN.Xd() ^ 25929)), Class.forName(EO.Od("r\u001a\u001fki]p7W\f43W_tQ\u0019\u0012", (short) (C1607wl.Xd() ^ 27100))));
                try {
                    method.setAccessible(true);
                    method.invoke(handler, objArr2);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
    }

    @Override // android.os.FileObserver
    public void startWatching() {
        if (this.mObservers != null) {
            return;
        }
        this.mObservers = new ArrayList();
        Stack stack = new Stack();
        stack.push(this.mPath);
        while (!stack.isEmpty()) {
            String str = (String) stack.pop();
            this.mObservers.add(new SingleFileObserver(str, this.mMask));
            File[] fileArrListFiles = new File(str).listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    if (file.isDirectory() && !file.getName().equals(".") && !file.getName().equals("..")) {
                        stack.push(file.getPath());
                    }
                }
            }
        }
        Iterator<SingleFileObserver> it = this.mObservers.iterator();
        while (it.hasNext()) {
            it.next().startWatching();
        }
    }

    @Override // android.os.FileObserver
    public void stopWatching() {
        List<SingleFileObserver> list = this.mObservers;
        if (list == null) {
            return;
        }
        Iterator<SingleFileObserver> it = list.iterator();
        while (it.hasNext()) {
            it.next().stopWatching();
        }
        this.mObservers.clear();
        this.mObservers = null;
    }
}
