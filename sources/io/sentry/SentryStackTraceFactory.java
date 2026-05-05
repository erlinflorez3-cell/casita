package io.sentry;

import io.sentry.protocol.SentryStackFrame;
import io.sentry.util.CollectionUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.C1633zX;
import yg.EO;
import yg.FB;
import yg.Ig;
import yg.Jg;
import yg.OY;
import yg.QB;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes6.dex */
public final class SentryStackTraceFactory {
    private static final int STACKTRACE_FRAME_LIMIT = 100;
    private final SentryOptions options;

    public SentryStackTraceFactory(SentryOptions sentryOptions) {
        this.options = sentryOptions;
    }

    static /* synthetic */ boolean lambda$getInAppCallStack$1(SentryStackFrame sentryStackFrame) {
        String module = sentryStackFrame.getModule();
        boolean z2 = false;
        if (module != null && (module.startsWith("sun.") || module.startsWith("java.") || module.startsWith("android.") || module.startsWith("com.android."))) {
            z2 = true;
        }
        return !z2;
    }

    public List<SentryStackFrame> getInAppCallStack() {
        return getInAppCallStack(new Exception());
    }

    List<SentryStackFrame> getInAppCallStack(Throwable th) throws Throwable {
        List<SentryStackFrame> stackFrames = getStackFrames(th.getStackTrace(), false);
        if (stackFrames == null) {
            return Collections.emptyList();
        }
        List<SentryStackFrame> listFilterListEntries = CollectionUtils.filterListEntries(stackFrames, new CollectionUtils.Predicate() { // from class: io.sentry.SentryStackTraceFactory$$ExternalSyntheticLambda0
            @Override // io.sentry.util.CollectionUtils.Predicate
            public final boolean test(Object obj) {
                return Boolean.TRUE.equals(((SentryStackFrame) obj).isInApp());
            }
        });
        return !listFilterListEntries.isEmpty() ? listFilterListEntries : CollectionUtils.filterListEntries(stackFrames, new CollectionUtils.Predicate() { // from class: io.sentry.SentryStackTraceFactory$$ExternalSyntheticLambda1
            @Override // io.sentry.util.CollectionUtils.Predicate
            public final boolean test(Object obj) {
                return SentryStackTraceFactory.lambda$getInAppCallStack$1((SentryStackFrame) obj);
            }
        });
    }

    public List<SentryStackFrame> getStackFrames(StackTraceElement[] stackTraceElementArr, boolean z2) throws Throwable {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                Class<?> cls = Class.forName(hg.Vd("\u0012\b\u001c\u0006Q\u000f\u0003\u000f\u0007Lp\u0011|}\u0005l\nwxyX~v}t|\u0002", (short) (FB.Xd() ^ 6279), (short) (FB.Xd() ^ 5644)));
                Class<?>[] clsArr = new Class[0];
                Object[] objArr = new Object[0];
                short sXd = (short) (FB.Xd() ^ 7773);
                int[] iArr = new int["\u0015\u0012 m\u0016\n\u001b\u001as\u0006\u0011\b".length()];
                QB qb = new QB("\u0015\u0012 m\u0016\n\u001b\u001as\u0006\u0011\b");
                int i2 = 0;
                while (qb.YK()) {
                    int iKK = qb.KK();
                    Xu xuXd = Xu.Xd(iKK);
                    iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
                    i2++;
                }
                Method method = cls.getMethod(new String(iArr, 0, i2), clsArr);
                try {
                    method.setAccessible(true);
                    String str = (String) method.invoke(stackTraceElement, objArr);
                    if (!z2) {
                        short sXd2 = (short) (C1499aX.Xd() ^ (-30517));
                        int[] iArr2 = new int["16s8)163I|".length()];
                        QB qb2 = new QB("16s8)163I|");
                        int i3 = 0;
                        while (qb2.YK()) {
                            int iKK2 = qb2.KK();
                            Xu xuXd2 = Xu.Xd(iKK2);
                            iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (sXd2 ^ i3));
                            i3++;
                        }
                        if (!str.startsWith(new String(iArr2, 0, i3)) || str.startsWith(C1561oA.Yd(")0o6)3:9Av=,9=:4C~", (short) (C1607wl.Xd() ^ 555))) || str.startsWith(Xg.qd("JQ\u0011WJT[Zb\u0018X[OW[U\u001f", (short) (C1499aX.Xd() ^ (-19939)), (short) (C1499aX.Xd() ^ (-10716))))) {
                        }
                    }
                    SentryStackFrame sentryStackFrame = new SentryStackFrame();
                    sentryStackFrame.setInApp(isInApp(str));
                    sentryStackFrame.setModule(str);
                    Object[] objArr2 = new Object[0];
                    Method method2 = Class.forName(Jg.Wd("\u0005\u001f\u0010\u0012: h\u0015iLP\rQ7_\u001bX+A#\u001d$9\u0019l\u001cu", (short) (FB.Xd() ^ 271), (short) (FB.Xd() ^ 22400))).getMethod(ZO.xd("ba\u001a(\u0010\u000e\u0016AFGA\u001c\u000e", (short) (OY.Xd() ^ 2718), (short) (OY.Xd() ^ 31372)), new Class[0]);
                    try {
                        method2.setAccessible(true);
                        sentryStackFrame.setFunction((String) method2.invoke(stackTraceElement, objArr2));
                        Object[] objArr3 = new Object[0];
                        Method method3 = Class.forName(C1626yg.Ud("\u0017qa3\bh_\u001cJ\u007f7y \u0006yk|ktD*M+o\u0018zs", (short) (OY.Xd() ^ 16020), (short) (OY.Xd() ^ 11855))).getMethod(Ig.wd("Z'D58^;$\\$\u001e", (short) (C1499aX.Xd() ^ (-12498))), new Class[0]);
                        try {
                            method3.setAccessible(true);
                            sentryStackFrame.setFilename((String) method3.invoke(stackTraceElement, objArr3));
                            Object[] objArr4 = new Object[0];
                            Method method4 = Class.forName(EO.Od("t3Zi^Y.$WNq5P\\\nR6\u001dxp\f\u0011es7*\u0014", (short) (ZN.Xd() ^ 32393))).getMethod(C1561oA.Qd("%\"0\u0007#'\u001d\u0005+\"\u0016\u0018$", (short) (C1633zX.Xd() ^ (-22022))), new Class[0]);
                            try {
                                method4.setAccessible(true);
                                if (((Integer) method4.invoke(stackTraceElement, objArr4)).intValue() >= 0) {
                                    short sXd3 = (short) (C1633zX.Xd() ^ (-8591));
                                    short sXd4 = (short) (C1633zX.Xd() ^ (-31878));
                                    int[] iArr3 = new int["\u0014\f\"\u000e[\u001b\u0011\u001f\u0019`\u0007)\u0017\u001a#\r,\u001c\u001f\"\u0003+%.'18".length()];
                                    QB qb3 = new QB("\u0014\f\"\u000e[\u001b\u0011\u001f\u0019`\u0007)\u0017\u001a#\r,\u001c\u001f\"\u0003+%.'18");
                                    int i4 = 0;
                                    while (qb3.YK()) {
                                        int iKK3 = qb3.KK();
                                        Xu xuXd3 = Xu.Xd(iKK3);
                                        iArr3[i4] = xuXd3.fK((xuXd3.CK(iKK3) - (sXd3 + i4)) - sXd4);
                                        i4++;
                                    }
                                    Object[] objArr5 = new Object[0];
                                    Method method5 = Class.forName(new String(iArr3, 0, i4)).getMethod(C1561oA.od("UR`7SWM5[RFHT", (short) (OY.Xd() ^ 17922)), new Class[0]);
                                    try {
                                        method5.setAccessible(true);
                                        sentryStackFrame.setLineno(Integer.valueOf(((Integer) method5.invoke(stackTraceElement, objArr5)).intValue()));
                                    } catch (InvocationTargetException e2) {
                                        throw e2.getCause();
                                    }
                                }
                                Object[] objArr6 = new Object[0];
                                Method method6 = Class.forName(C1561oA.Kd("5-C/|<2@:\u0002(J8;D.M=@C$LFOHRY", (short) (C1607wl.Xd() ^ 23240))).getMethod(Wg.Zd("FBN\u0013\u0017=yYr;;`\u0017|", (short) (C1580rY.Xd() ^ (-9309)), (short) (C1580rY.Xd() ^ (-24295))), new Class[0]);
                                try {
                                    method6.setAccessible(true);
                                    sentryStackFrame.setNative(Boolean.valueOf(((Boolean) method6.invoke(stackTraceElement, objArr6)).booleanValue()));
                                    arrayList.add(sentryStackFrame);
                                    if (arrayList.size() >= 100) {
                                        break;
                                    }
                                } catch (InvocationTargetException e3) {
                                    throw e3.getCause();
                                }
                            } catch (InvocationTargetException e4) {
                                throw e4.getCause();
                            }
                        } catch (InvocationTargetException e5) {
                            throw e5.getCause();
                        }
                    } catch (InvocationTargetException e6) {
                        throw e6.getCause();
                    }
                } catch (InvocationTargetException e7) {
                    throw e7.getCause();
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public Boolean isInApp(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        Iterator<String> it = this.options.getInAppIncludes().iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        Iterator<String> it2 = this.options.getInAppExcludes().iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return false;
            }
        }
        return null;
    }
}
