package yg;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class NK {
    public static String Xd(Object obj) {
        Class<?> cls = obj.getClass();
        if (cls.isArray() && cls.getComponentType().isArray()) {
            return Arrays.deepToString((Object[]) obj);
        }
        if (cls.isArray() && !cls.getComponentType().isPrimitive()) {
            return Arrays.toString((Object[]) obj);
        }
        if (!cls.isArray()) {
            return obj.toString();
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType == Long.TYPE) {
            return Arrays.toString((long[]) obj);
        }
        if (componentType == Integer.TYPE) {
            return Arrays.toString((int[]) obj);
        }
        if (componentType == Short.TYPE) {
            return Arrays.toString((short[]) obj);
        }
        if (componentType == Character.TYPE) {
            return Arrays.toString((char[]) obj);
        }
        if (componentType == Byte.TYPE) {
            return Arrays.toString((byte[]) obj);
        }
        if (componentType == Boolean.TYPE) {
            return Arrays.toString((boolean[]) obj);
        }
        if (componentType == Float.TYPE) {
            return Arrays.toString((float[]) obj);
        }
        if (componentType == Double.TYPE) {
            return Arrays.toString((double[]) obj);
        }
        StringBuilder sb = new StringBuilder();
        short sXd = (short) (C1499aX.Xd() ^ (1050210803 ^ (-1050209741)));
        int[] iArr = new int["1IMNPOMOXHF\u0001IYXFEj>B@4m".length()];
        QB qb = new QB("1IMNPOMOXHF\u0001IYXFEj>B@4m");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((sXd ^ i2) + xuXd.CK(iKK));
            i2++;
        }
        throw new RuntimeException(sb.append(new String(iArr, 0, i2)).append(cls.getName()).toString());
    }
}
