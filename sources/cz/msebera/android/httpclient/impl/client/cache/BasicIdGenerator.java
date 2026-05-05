package cz.msebera.android.httpclient.impl.client.cache;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Formatter;
import java.util.Locale;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes5.dex */
class BasicIdGenerator {
    private long count;
    private final String hostname;
    private final SecureRandom rnd;

    public BasicIdGenerator() throws Throwable {
        String strZd;
        try {
            strZd = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException unused) {
            strZd = C1593ug.zd("\u000b\u000f\u0004\u0003\u000f\f\u0014\u0019\u001b", (short) (OY.Xd() ^ 29467), (short) (OY.Xd() ^ 1011));
        }
        this.hostname = strZd;
        String strOd = C1561oA.od(")\u001d\u0015\u0004\"#\u001e\u0016", (short) (C1607wl.Xd() ^ 27980));
        short sXd = (short) (ZN.Xd() ^ 2938);
        int[] iArr = new int["VNdP\u001edWVig_kq'M`_rpdRbpgsr".length()];
        QB qb = new QB("VNdP\u001edWVig_kq'M`_rpdRbpgsr");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - ((sXd + sXd) + i2));
            i2++;
        }
        try {
            Class<?> cls = Class.forName(new String(iArr, 0, i2));
            Class<?>[] clsArr = new Class[1];
            clsArr[0] = Class.forName(Wg.Zd("7k5|}\u0015F\b]\\V4f6wE", (short) (Od.Xd() ^ (-4758)), (short) (Od.Xd() ^ (-26774))));
            Object[] objArr = {strOd};
            Method declaredMethod = cls.getDeclaredMethod(C1561oA.Xd("FEU+QWYGUKN", (short) (OY.Xd() ^ 32025)), clsArr);
            try {
                declaredMethod.setAccessible(true);
                this.rnd = (SecureRandom) declaredMethod.invoke(null, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (NoSuchAlgorithmException e3) {
            short sXd2 = (short) (C1607wl.Xd() ^ 26163);
            int[] iArr2 = new int["\u0014\f\u001e\nS\u0013\u0005\u0013\u0019`t# \u001e\u001e".length()];
            QB qb2 = new QB("\u0014\f\u001e\nS\u0013\u0005\u0013\u0019`t# \u001e\u001e");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((sXd2 ^ i3) + xuXd2.CK(iKK2));
                i3++;
            }
            Object[] objArr2 = {e3};
            Constructor<?> constructor = Class.forName(new String(iArr2, 0, i3)).getConstructor(Class.forName(Qg.kd("G=Q;\u0007D8D<\u0002':C?F//80", (short) (C1580rY.Xd() ^ (-29201)), (short) (C1580rY.Xd() ^ (-27431)))));
            try {
                constructor.setAccessible(true);
                throw ((Error) constructor.newInstance(objArr2));
            } catch (InvocationTargetException e4) {
                throw e4.getCause();
            }
        }
    }

    public String generate() {
        StringBuilder sb = new StringBuilder();
        generate(sb);
        return sb.toString();
    }

    public synchronized void generate(StringBuilder sb) {
        this.count++;
        int iNextInt = this.rnd.nextInt();
        sb.append(System.currentTimeMillis());
        sb.append('.');
        Formatter formatter = new Formatter(sb, Locale.US);
        formatter.format("%1$016x-%2$08x", Long.valueOf(this.count), Integer.valueOf(iNextInt));
        formatter.close();
        sb.append('.');
        sb.append(this.hostname);
    }
}
