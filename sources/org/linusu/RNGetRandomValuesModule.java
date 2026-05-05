package org.linusu;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.OY;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;

/* JADX INFO: loaded from: classes2.dex */
public class RNGetRandomValuesModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    public RNGetRandomValuesModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGetRandomValues";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getRandomBase64(int i2) throws Throwable {
        byte[] bArr = new byte[i2];
        Object[] objArr = new Object[0];
        Constructor<?> constructor = Class.forName(C1561oA.Kd("\u001e\u0016,\u0018e,\u001f\u001e1/'39n\u0015(':8,\u001a*8/;:", (short) (C1580rY.Xd() ^ (-175)))).getConstructor(new Class[0]);
        try {
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(objArr);
            Class<?> cls = Class.forName(Wg.Zd("[ [\u0013\u000e!9\u0004Dm+h6\u0015\u0003HnKp5I%`\u0003T\u007f", (short) (OY.Xd() ^ 11817), (short) (OY.Xd() ^ 5221)));
            Class<?>[] clsArr = {byte[].class};
            Object[] objArr2 = {bArr};
            short sXd = (short) (C1633zX.Xd() ^ (-8713));
            int[] iArr = new int["80DA\u0010HD6E".length()];
            QB qb = new QB("80DA\u0010HD6E");
            int i3 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i3] = xuXd.fK(xuXd.CK(iKK) - (sXd + i3));
                i3++;
            }
            Method method = cls.getMethod(new String(iArr, 0, i3), clsArr);
            try {
                method.setAccessible(true);
                method.invoke(objNewInstance, objArr2);
                Object[] objArr3 = {bArr, 2};
                Method declaredMethod = Class.forName(Wg.vd("<H=JF?9\u0002HF:<|\u0010.?P \u001d", (short) (C1607wl.Xd() ^ 10730))).getDeclaredMethod(Qg.kd("$, +\u001f\u001f\r'\n*'\u001d!\u0019", (short) (C1633zX.Xd() ^ (-28223)), (short) (C1633zX.Xd() ^ (-8017))), byte[].class, Integer.TYPE);
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
}
