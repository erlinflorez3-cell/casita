package com.facebook.soloader.recovery;

import com.facebook.soloader.SoSource;

/* JADX INFO: loaded from: classes3.dex */
public class CompositeRecoveryStrategy implements RecoveryStrategy {
    private int mCurrentStrategy = 0;
    private final RecoveryStrategy[] mStrategies;

    public CompositeRecoveryStrategy(RecoveryStrategy... recoveryStrategyArr) {
        this.mStrategies = recoveryStrategyArr;
    }

    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, SoSource[] soSourceArr) {
        int i2;
        RecoveryStrategy[] recoveryStrategyArr;
        do {
            i2 = this.mCurrentStrategy;
            recoveryStrategyArr = this.mStrategies;
            if (i2 >= recoveryStrategyArr.length) {
                return false;
            }
            this.mCurrentStrategy = i2 + 1;
        } while (!recoveryStrategyArr[i2].recover(unsatisfiedLinkError, soSourceArr));
        return true;
    }
}
