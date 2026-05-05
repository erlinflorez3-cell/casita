package yg;

import io.reactivex.annotations.SchedulerSupport;

/* JADX INFO: renamed from: yg.pq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C1567pq implements SchedulerSupport {
    private SchedulerSupport xq;

    public C1567pq(SchedulerSupport schedulerSupport) {
        this.xq = schedulerSupport;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return SchedulerSupport.class;
    }

    @Override // io.reactivex.annotations.SchedulerSupport
    public String value() {
        String strValue = this.xq.value();
        short sXd = (short) (C1633zX.Xd() ^ (OY.Xd() ^ (509387193 ^ (-444052789))));
        int[] iArr = new int[strValue.length()];
        QB qb = new QB(strValue);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (((sXd + sXd) + sXd) + i2));
            i2++;
        }
        return new String(iArr, 0, i2);
    }
}
