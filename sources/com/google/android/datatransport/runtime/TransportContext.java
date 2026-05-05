package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1633zX;
import yg.FB;
import yg.QB;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TransportContext {

    public static abstract class Builder {
        public abstract TransportContext build();

        public abstract Builder setBackendName(String str);

        public abstract Builder setExtras(byte[] bArr);

        public abstract Builder setPriority(Priority priority);
    }

    public static Builder builder() {
        return new AutoValue_TransportContext.Builder().setPriority(Priority.DEFAULT);
    }

    public abstract String getBackendName();

    public abstract byte[] getExtras();

    public abstract Priority getPriority();

    public boolean shouldUploadClientHealthMetrics() {
        return getExtras() != null;
    }

    public final String toString() throws Throwable {
        String str;
        String backendName = getBackendName();
        Priority priority = getPriority();
        if (getExtras() == null) {
            str = "";
        } else {
            byte[] extras = getExtras();
            short sXd = (short) (FB.Xd() ^ 19674);
            short sXd2 = (short) (FB.Xd() ^ 30897);
            int[] iArr = new int["0\u001a]7\u0011X\u001f6:\u0015W&D&\u0011p_\fW".length()];
            QB qb = new QB("0\u001a]7\u0011X\u001f6:\u0015W&D&\u0011p_\fW");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(((i2 * sXd2) ^ sXd) + xuXd.CK(iKK));
                i2++;
            }
            Object[] objArr = {extras, 2};
            Method declaredMethod = Class.forName(new String(iArr, 0, i2)).getDeclaredMethod(C1561oA.Xd("XbXe[]MiNpogmg", (short) (ZN.Xd() ^ 3681)), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                str = (String) declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        return String.format(Wg.vd("\u001b8&2>:8:3\u0001,*7'94^Z(_Z^,cNR T", (short) (C1633zX.Xd() ^ (-28305))), backendName, priority, str);
    }

    public TransportContext withPriority(Priority priority) {
        return builder().setBackendName(getBackendName()).setPriority(priority).setExtras(getExtras()).build();
    }
}
