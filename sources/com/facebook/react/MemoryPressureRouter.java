package com.facebook.react;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.drew.metadata.exif.makernotes.OlympusFocusInfoMakernoteDirectory;
import com.facebook.react.bridge.MemoryPressureListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.hg;

/* JADX INFO: loaded from: classes3.dex */
public class MemoryPressureRouter implements ComponentCallbacks2 {
    private final CopyOnWriteArrayList<MemoryPressureListener> mListeners = new CopyOnWriteArrayList<>();

    public MemoryPressureRouter(Context context) throws Throwable {
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.od("htivrke.bmkp`hm&:echXje", (short) (C1499aX.Xd() ^ (-18410)))).getMethod(C1561oA.Kd("\u0016\u0015%r#$!\u001f\u001a\u0019-#**\u007f--4&:7", (short) (Od.Xd() ^ (-28066))), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Class<?> cls = Class.forName(Wg.Zd("Sw\fQl}vWKn\f\n\u00199}Na$B~\u000f84", (short) (FB.Xd() ^ 29155), (short) (FB.Xd() ^ 15925)));
            Class<?>[] clsArr = {Class.forName(C1561oA.Xd("}\f\u0003\u0012\u0010\u000b\u0007Q\b\u0015\u0015\u001c\u000e\u0018\u001fYo\u001d\u001c   \u0018\")x\u0018$%\u001c\u001c\u001f(1", (short) (OY.Xd() ^ 3449)))};
            Object[] objArr2 = {this};
            short sXd = (short) (FB.Xd() ^ 23019);
            int[] iArr = new int[",\u001e\u001f ))\u0019%\u00050-/-+!)>\f)32'%&=D".length()];
            QB qb = new QB(",\u001e\u001f ))\u0019%\u00050-/-+!)>\f)32'%&=D");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
                i2++;
            }
            Method method2 = cls.getMethod(new String(iArr, 0, i2), clsArr);
            try {
                method2.setAccessible(true);
                method2.invoke(context2, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    private void dispatchMemoryPressure(int i2) {
        Iterator<MemoryPressureListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().handleMemoryPressure(i2);
        }
    }

    public void addMemoryPressureListener(MemoryPressureListener memoryPressureListener) {
        if (this.mListeners.contains(memoryPressureListener)) {
            return;
        }
        this.mListeners.add(memoryPressureListener);
    }

    public void destroy(Context context) {
        Object[] objArr = new Object[0];
        Method method = Class.forName(Qg.kd("%1&3/(\"j\u001f*(-\u001d%*bv\" %\u0015'\"", (short) (OY.Xd() ^ 8325), (short) (OY.Xd() ^ 19487))).getMethod(hg.Vd("C@N\u001aHGB>74F:?=\u0011<:?/A<", (short) (FB.Xd() ^ 25721), (short) (FB.Xd() ^ 18503)), new Class[0]);
        try {
            method.setAccessible(true);
            Context context2 = (Context) method.invoke(context, objArr);
            Object[] objArr2 = {this};
            Method method2 = Class.forName(C1561oA.ud("MYN[WPJ\u0013GRPUEMR\u000b\u001fJHM=OJ", (short) (C1607wl.Xd() ^ OlympusFocusInfoMakernoteDirectory.TagAfInfo))).getMethod(C1561oA.Yd("\u0012\f\u0011\u0005\b\u000b\u0016\u0018\n\u0018i\u0017\u0016\u001a\u001a\u001a\u0012\u001c#r\u0012\u001e\u001f\u0016\u0016\u0019\"+", (short) (C1499aX.Xd() ^ (-8414))), Class.forName(C1561oA.yd("\\japfa](VccjT^e N{z~vvnxwGfrkbbeFO", (short) (C1633zX.Xd() ^ (-665)))));
            try {
                method2.setAccessible(true);
                method2.invoke(context2, objArr2);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        dispatchMemoryPressure(i2);
    }

    public void removeMemoryPressureListener(MemoryPressureListener memoryPressureListener) {
        this.mListeners.remove(memoryPressureListener);
    }
}
