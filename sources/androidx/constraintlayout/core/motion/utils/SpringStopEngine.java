package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;

/* JADX INFO: loaded from: classes4.dex */
public class SpringStopEngine implements StopEngine {
    private static final double UNSET = Double.MAX_VALUE;
    private float mLastTime;
    private double mLastVelocity;
    private float mMass;
    private float mPos;
    private double mStiffness;
    private float mStopThreshold;
    private double mTargetPos;
    private float mV;
    double mDamping = 0.5d;
    private boolean mInitialized = false;
    private int mBoundaryMode = 0;

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f2) {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return 0.0f;
    }

    void log(String str) throws Throwable {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder sb = new StringBuilder(Xg.qd("\"\u001d", (short) (OY.Xd() ^ 14320), (short) (OY.Xd() ^ 29381)));
        Class<?> cls = Class.forName(Jg.Wd("/i)BYGf:]S#\u0013*S&=&C\u0011AC9]\u00146\u000e7", (short) (ZN.Xd() ^ 18239), (short) (ZN.Xd() ^ 833)));
        Class<?>[] clsArr = new Class[0];
        Object[] objArr = new Object[0];
        short sXd = (short) (ZN.Xd() ^ 21719);
        short sXd2 = (short) (ZN.Xd() ^ 27794);
        int[] iArr = new int["dA U\u001f^siLn\u0013".length()];
        QB qb = new QB("dA U\u001f^siLn\u0013");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
            i2++;
        }
        Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
        try {
            method.setAccessible(true);
            StringBuilder sbAppend = sb.append((String) method.invoke(stackTraceElement, objArr));
            short sXd3 = (short) (C1607wl.Xd() ^ 24453);
            short sXd4 = (short) (C1607wl.Xd() ^ 13148);
            int[] iArr2 = new int["H".length()];
            QB qb2 = new QB("H");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK((C1561oA.Xd[i3 % C1561oA.Xd.length] ^ ((sXd3 + sXd3) + (i3 * sXd4))) + xuXd2.CK(iKK2));
                i3++;
            }
            StringBuilder sbAppend2 = sbAppend.append(new String(iArr2, 0, i3));
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(Ig.wd("\tR\u0004\rGP/zP\u0019F\u007f=;UV?\u001a\u0003j\u0007T57\u001c'\n", (short) (C1633zX.Xd() ^ (-27707)))).getMethod(EO.Od("E\u0014% MwV/\n!lY5", (short) (C1580rY.Xd() ^ (-20038))), new Class[0]);
            try {
                method2.setAccessible(true);
                StringBuilder sbAppend3 = sbAppend2.append(((Integer) method2.invoke(stackTraceElement, objArr2)).intValue()).append(C1561oA.Qd("pf", (short) (FB.Xd() ^ 10499)));
                short sXd5 = (short) (C1580rY.Xd() ^ (-28582));
                short sXd6 = (short) (C1580rY.Xd() ^ (-673));
                int[] iArr3 = new int["\u000b\u0003\u0019\u0005R\u0012\b\u0016\u0010W} \u000e\u0011\u001a\u0004#\u0013\u0016\u0019y\"\u001c%\u001e(/".length()];
                QB qb3 = new QB("\u000b\u0003\u0019\u0005R\u0012\b\u0016\u0010W} \u000e\u0011\u001a\u0004#\u0013\u0016\u0019y\"\u001c%\u001e(/");
                int i4 = 0;
                while (qb3.YK()) {
                    int iKK3 = qb3.KK();
                    Xu xuXd3 = Xu.Xd(iKK3);
                    iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd5 + i4)) - sXd6);
                    i4++;
                }
                Object[] objArr3 = new Object[0];
                Method method3 = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.od(">;I!8F9?3\u001c.90", (short) (C1633zX.Xd() ^ (-1977))), new Class[0]);
                try {
                    method3.setAccessible(true);
                    System.out.println(sbAppend3.append((String) method3.invoke(stackTraceElement, objArr3)).append(C1561oA.Kd("UWO", (short) (C1633zX.Xd() ^ (-4042)))).toString() + str);
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

    public void springConfig(float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i2) {
        this.mTargetPos = f3;
        this.mDamping = f7;
        this.mInitialized = false;
        this.mPos = f2;
        this.mLastVelocity = f4;
        this.mStiffness = f6;
        this.mMass = f5;
        this.mStopThreshold = f8;
        this.mBoundaryMode = i2;
        this.mLastTime = 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f2) {
        return this.mV;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f2) {
        compute(f2 - this.mLastTime);
        this.mLastTime = f2;
        return this.mPos;
    }

    public float getAcceleration() {
        double d2 = this.mStiffness;
        return ((float) (((-d2) * (((double) this.mPos) - this.mTargetPos)) - (this.mDamping * ((double) this.mV)))) / this.mMass;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        double d2 = ((double) this.mPos) - this.mTargetPos;
        double d3 = this.mStiffness;
        double d4 = this.mV;
        return Math.sqrt((((d4 * d4) * ((double) this.mMass)) + ((d3 * d2) * d2)) / d3) <= ((double) this.mStopThreshold);
    }

    private void compute(double d2) {
        double d3 = this.mStiffness;
        double d4 = this.mDamping;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d3 / ((double) this.mMass)) * d2) * 4.0d)) + 1.0d);
        double d5 = d2 / ((double) iSqrt);
        for (int i2 = 0; i2 < iSqrt; i2++) {
            float f2 = this.mPos;
            double d6 = this.mTargetPos;
            float f3 = this.mV;
            float f4 = this.mMass;
            double d7 = ((double) f3) + ((((((-d3) * (((double) f2) - d6)) - (((double) f3) * d4)) / ((double) f4)) * d5) / 2.0d);
            double d8 = ((((-((((double) f2) + ((d5 * d7) / 2.0d)) - d6)) * d3) - (d7 * d4)) / ((double) f4)) * d5;
            float f5 = (float) (((double) f3) + d8);
            this.mV = f5;
            float f6 = (float) (((double) f2) + ((((double) f3) + (d8 / 2.0d)) * d5));
            this.mPos = f6;
            int i3 = this.mBoundaryMode;
            if (i3 > 0) {
                if (f6 < 0.0f && (i3 & 1) == 1) {
                    this.mPos = -f6;
                    this.mV = -f5;
                }
                float f7 = this.mPos;
                if (f7 > 1.0f && (i3 + 2) - (i3 | 2) == 2) {
                    this.mPos = 2.0f - f7;
                    this.mV = -this.mV;
                }
            }
        }
    }
}
