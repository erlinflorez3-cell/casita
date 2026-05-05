package yg;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class Pu extends ByteArrayInputStream {
    public Pu(byte[] bArr) {
        super(bArr);
    }

    public long Od() throws IOException {
        return C1593ug.Kd(this);
    }

    public String qd() throws Throwable {
        int iXd = C1499aX.Xd() ^ (1486740665 ^ 453418401);
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1561oA.Yd("gV\u001eAg", (short) (C1580rY.Xd() ^ iXd))).getMethod(Xg.qd("4J", (short) (C1580rY.Xd() ^ (1256085870 ^ (-1256088927))), (short) (C1580rY.Xd() ^ ((99064819 ^ 1849497432) ^ (-1809497595)))), new Class[0]);
        try {
            method.setAccessible(true);
            int iLongValue = (int) ((Long) method.invoke(this, objArr)).longValue();
            if (iLongValue == 0) {
                return "";
            }
            byte[] bArr = new byte[iLongValue];
            if (read(bArr, 0, iLongValue) == iLongValue) {
                return new String(bArr);
            }
            throw new IOException(Jg.Wd("VaXf]\u0001\u0002=\u0015wwpw\u0013K$!\u00035\u000b\u0002)04", (short) (Od.Xd() ^ (543913211 ^ (-543891649))), (short) (Od.Xd() ^ (628555407 ^ (-628537466)))));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
