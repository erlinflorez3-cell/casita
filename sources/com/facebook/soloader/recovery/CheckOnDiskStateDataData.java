package com.facebook.soloader.recovery;

import com.facebook.soloader.BackupSoSource;
import com.facebook.soloader.LogUtil;
import com.facebook.soloader.SoLoader;
import com.facebook.soloader.SoLoaderULError;
import com.facebook.soloader.SoSource;
import com.facebook.soloader.UnpackingSoSource;

/* JADX INFO: loaded from: classes3.dex */
public class CheckOnDiskStateDataData implements RecoveryStrategy {
    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, SoSource[] soSourceArr) {
        if (!(unsatisfiedLinkError instanceof SoLoaderULError)) {
            return false;
        }
        LogUtil.e(SoLoader.TAG, "Checking /data/data missing libraries.");
        boolean z2 = false;
        for (SoSource soSource : soSourceArr) {
            if ((soSource instanceof UnpackingSoSource) && !(soSource instanceof BackupSoSource)) {
                UnpackingSoSource unpackingSoSource = (UnpackingSoSource) soSource;
                try {
                    UnpackingSoSource.Dso[] dsosBaseApk = unpackingSoSource.getDsosBaseApk();
                    int length = dsosBaseApk.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            UnpackingSoSource.Dso dso = dsosBaseApk[i2];
                            if (unpackingSoSource.getSoFileByName(dso.name) == null) {
                                LogUtil.e(SoLoader.TAG, "Missing " + dso.name + " from " + unpackingSoSource.getName() + ", will force prepare.");
                                unpackingSoSource.prepare(2);
                                z2 = true;
                                break;
                            }
                            i2++;
                        }
                    }
                } catch (Exception e2) {
                    LogUtil.e(SoLoader.TAG, "Encountered an exception while recovering from /data/data failure ", e2);
                    return false;
                }
            }
        }
        if (z2) {
            LogUtil.e(SoLoader.TAG, "Successfully recovered from /data/data disk failure.");
            return true;
        }
        LogUtil.e(SoLoader.TAG, "No libraries missing from unpacking so paths while recovering /data/data failure");
        return false;
    }
}
