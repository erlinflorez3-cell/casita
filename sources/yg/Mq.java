package yg;

import com.facebook.react.module.annotations.ReactModule;

/* JADX INFO: loaded from: classes9.dex */
public class Mq implements ReactModule {
    private ReactModule iq;

    public Mq(ReactModule reactModule) {
        this.iq = reactModule;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return ReactModule.class;
    }

    @Override // com.facebook.react.module.annotations.ReactModule
    public boolean canOverrideExistingModule() {
        return this.iq.canOverrideExistingModule();
    }

    @Override // com.facebook.react.module.annotations.ReactModule
    public boolean hasConstants() {
        return this.iq.hasConstants();
    }

    @Override // com.facebook.react.module.annotations.ReactModule
    public boolean isCxxModule() {
        return this.iq.isCxxModule();
    }

    @Override // com.facebook.react.module.annotations.ReactModule
    public String name() {
        String strName = this.iq.name();
        short sXd = (short) (FB.Xd() ^ (Od.Xd() ^ (1366300490 ^ 378382617)));
        int[] iArr = new int[strName.length()];
        QB qb = new QB(strName);
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        return new String(iArr, 0, i2);
    }

    @Override // com.facebook.react.module.annotations.ReactModule
    public boolean needsEagerInit() {
        return this.iq.needsEagerInit();
    }
}
