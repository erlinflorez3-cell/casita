package com.davivienda.daviviendaapp.bridges.ticnow;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1633zX;
import yg.OY;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public class IDNowSecuritySuitePackage implements ReactPackage {
    @Override // com.facebook.react.ReactPackage
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) throws Throwable {
        ArrayList arrayList = new ArrayList();
        Object[] objArr = {reactApplicationContext};
        Constructor<?> constructor = Class.forName(C1561oA.Qd("+63r($8*6(#+ \u001cg\u001d\u0019-\u001f+\u001d\u0018 \u0015\u0011\u0010\u001e\u001dY\r\u001c\u0012\f\u000e\u000b\u0018Q\u0017\u000b\u0004\u000e\u000e\u0015Jd^g\b\u000fizw\t\u0005z\u0005\ta\u0003u\u007fo", (short) (C1633zX.Xd() ^ (C1499aX.Xd() ^ 1134251654)))).getConstructor(Class.forName(C1593ug.zd("ERQ\u0013LHKNLZ[X\u001caURUg\"Wh`\\`_)Nb_btBrspnih|ryyO||\u0004u\n\u0007", (short) (OY.Xd() ^ (ZN.Xd() ^ (156886646 ^ 986956301))), (short) (OY.Xd() ^ (C1580rY.Xd() ^ (1599108950 ^ (-1859739214)))))));
        try {
            constructor.setAccessible(true);
            arrayList.add(constructor.newInstance(objArr));
            return arrayList;
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    @Override // com.facebook.react.ReactPackage
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
