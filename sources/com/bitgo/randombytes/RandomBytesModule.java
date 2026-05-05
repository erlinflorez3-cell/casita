package com.bitgo.randombytes;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1593ug;
import yg.C1607wl;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.QB;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
class RandomBytesModule extends ReactContextBaseJavaModule {
    private static final String SEED_KEY = "seed";

    public RandomBytesModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private String getRandomBytes(int i2) throws Throwable {
        short sXd = (short) (ZN.Xd() ^ 29202);
        short sXd2 = (short) (ZN.Xd() ^ 28604);
        int[] iArr = new int["pG9\u0012\u0016$\u0015\rjk0h\u000eH QM7z1\u0018etpt ".length()];
        QB qb = new QB("pG9\u0012\u0016$\u0015\rjk0h\u000eH QM7z1\u0018etpt ");
        int i3 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i3] = xuXd.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd + sXd) + (i3 * sXd2))) + xuXd.CK(iKK));
            i3++;
        }
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(new String(iArr, 0, i3)).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(objArr);
            byte[] bArr = new byte[i2];
            Object[] objArr2 = {bArr};
            Method method = Class.forName(Ig.wd("u&gpckG\u0014f\n\u0001,\u0002*Q,`\u00136?l6'\u0013\u0013z", (short) (FB.Xd() ^ 4898))).getMethod(EO.Od("/u\u000b*HU(xJ", (short) (FB.Xd() ^ 26492)), byte[].class);
            try {
                method.setAccessible(true);
                method.invoke(objNewInstance, objArr2);
                Object[] objArr3 = {bArr, 2};
                Method declaredMethod = Class.forName(C1561oA.Qd("^j_lha[$jh\\^\u001f2PaR\"\u001f", (short) (C1499aX.Xd() ^ (-6679)))).getDeclaredMethod(C1593ug.zd("2<2?57'C(JIAGA", (short) (C1607wl.Xd() ^ 22528), (short) (C1607wl.Xd() ^ 26033)), byte[].class, Integer.TYPE);
                try {
                    declaredMethod.setAccessible(true);
                    return (String) declaredMethod.invoke(null, objArr3);
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        } catch (InvocationTargetException e4) {
            throw e4.getCause();
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put(SEED_KEY, getRandomBytes(4096));
        return map;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNRandomBytes";
    }

    @ReactMethod
    public void randomBytes(int i2, Callback callback) {
        callback.invoke(null, getRandomBytes(i2));
    }
}
