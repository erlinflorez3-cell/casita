package com.google.maps.android.collections;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.collections.MapObjectManager.Collection;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.Ig;
import yg.Jg;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MapObjectManager<O, C extends Collection> {
    protected final GoogleMap mMap;
    private final Map<String, C> mNamedCollections = new HashMap();
    protected final Map<O, C> mAllObjects = new HashMap();

    /* JADX INFO: renamed from: com.google.maps.android.collections.MapObjectManager$1 */
    class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MapObjectManager.this.setListenersOnUiThread();
        }
    }

    public class Collection {
        private final Set<O> mObjects = new LinkedHashSet();

        public Collection() {
        }

        protected void add(O o2) {
            this.mObjects.add(o2);
            MapObjectManager.this.mAllObjects.put(o2, this);
        }

        public void clear() {
            for (O o2 : this.mObjects) {
                MapObjectManager.this.removeObjectFromMap(o2);
                MapObjectManager.this.mAllObjects.remove(o2);
            }
            this.mObjects.clear();
        }

        protected java.util.Collection<O> getObjects() {
            return Collections.unmodifiableCollection(this.mObjects);
        }

        protected boolean remove(O o2) {
            if (!this.mObjects.remove(o2)) {
                return false;
            }
            MapObjectManager.this.mAllObjects.remove(o2);
            MapObjectManager.this.removeObjectFromMap(o2);
            return true;
        }
    }

    public MapObjectManager(GoogleMap googleMap) throws Throwable {
        this.mMap = googleMap;
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(Xg.qd("GUL[YTP\u001b]b\u001e=abdZh", (short) (C1633zX.Xd() ^ (-24169)), (short) (C1633zX.Xd() ^ (-22322)))).getDeclaredMethod(Jg.Wd("\b\f\u0019wiwz^\u007f\u0006\u0005\u007fj", (short) (ZN.Xd() ^ 18396), (short) (ZN.Xd() ^ 15602)), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            Handler handler = new Handler((Looper) declaredMethod.invoke(null, objArr));
            AnonymousClass1 anonymousClass1 = new Runnable() { // from class: com.google.maps.android.collections.MapObjectManager.1
                AnonymousClass1() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    MapObjectManager.this.setListenersOnUiThread();
                }
            };
            Class<?> cls = Class.forName(ZO.xd("\u001bb\u001bMT\u0010)ug9>f9a.\b\u0005R", (short) (C1633zX.Xd() ^ (-4736)), (short) (C1633zX.Xd() ^ (-5405))));
            Class<?>[] clsArr = new Class[1];
            short sXd = (short) (C1580rY.Xd() ^ (-9245));
            short sXd2 = (short) (C1580rY.Xd() ^ (-14548));
            int[] iArr = new int["%=\u0003$M\b\u001fsgi\u0005#!&?Z\u0014\u0007".length()];
            QB qb = new QB("%=\u0003$M\b\u001fsgi\u0005#!&?Z\u0014\u0007");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK((C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i2 * sXd2))) + xuXd.CK(iKK));
                i2++;
            }
            clsArr[0] = Class.forName(new String(iArr, 0, i2));
            Object[] objArr2 = {anonymousClass1};
            Method method = cls.getMethod(Ig.wd("N\u0007xQ", (short) (C1607wl.Xd() ^ 9771)), clsArr);
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

    public C getCollection(String str) {
        return this.mNamedCollections.get(str);
    }

    public abstract C newCollection();

    public C newCollection(String str) {
        if (this.mNamedCollections.get(str) != null) {
            throw new IllegalArgumentException("collection id is not unique: " + str);
        }
        C c2 = (C) newCollection();
        this.mNamedCollections.put(str, c2);
        return c2;
    }

    public boolean remove(O o2) {
        C c2 = this.mAllObjects.get(o2);
        return c2 != null && c2.remove(o2);
    }

    protected abstract void removeObjectFromMap(O o2);

    abstract void setListenersOnUiThread();
}
