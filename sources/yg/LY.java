package yg;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class LY extends ByteArrayOutputStream {
    public static int Xd(String str) {
        return Jg.Xd(str.length()) + str.length();
    }

    public void kd(long j2) throws IOException {
        write(hg.Yd(j2));
    }

    public void zd(String str) throws Throwable {
        byte[] bytes = str.getBytes();
        long length = bytes.length;
        Class<?> cls = Class.forName(C1561oA.Yd(">-t\u0014\"", (short) (ZN.Xd() ^ (C1499aX.Xd() ^ (225503338 ^ (-1324073681))))));
        Class<?>[] clsArr = {Long.TYPE};
        Object[] objArr = {Long.valueOf(length)};
        Method method = cls.getMethod(Xg.qd("\u0019\u0013", (short) (C1633zX.Xd() ^ (Od.Xd() ^ (-1207809463))), (short) (C1633zX.Xd() ^ ((1791743380 ^ 8181948) ^ (-1790386490)))), clsArr);
        try {
            method.setAccessible(true);
            method.invoke(this, objArr);
            write(bytes);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
