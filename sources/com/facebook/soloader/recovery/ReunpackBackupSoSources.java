package com.facebook.soloader.recovery;

import com.facebook.soloader.BackupSoSource;
import com.facebook.soloader.LogUtil;
import com.facebook.soloader.SoLoader;
import com.facebook.soloader.SoLoaderDSONotFoundError;
import com.facebook.soloader.SoLoaderULError;
import com.facebook.soloader.SoSource;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ReunpackBackupSoSources implements RecoveryStrategy {
    private int mRecoveryFlags;

    public ReunpackBackupSoSources() {
        this(0);
    }

    public ReunpackBackupSoSources(int i2) {
        this.mRecoveryFlags = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r3 >= r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r1 = r7[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if ((r1 instanceof com.facebook.soloader.DirectorySoSource) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if ((r1 instanceof com.facebook.soloader.BackupSoSource) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        ((com.facebook.soloader.DirectorySoSource) r1).setExplicitDependencyResolution();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        com.facebook.soloader.LogUtil.e(com.facebook.soloader.SoLoader.TAG, "Encountered an exception while reunpacking BackupSoSource " + r5.getName() + " for library " + r8 + ": ", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        r5 = (com.facebook.soloader.BackupSoSource) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        com.facebook.soloader.LogUtil.e(com.facebook.soloader.SoLoader.TAG, "Preparing BackupSoSource for the first time " + r5.getName());
        r5.prepare(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        r2 = r7.length;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean lazyPrepareBackupSoSource(com.facebook.soloader.SoSource[] r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.String r4 = "SoLoader"
            int r2 = r7.length
            r3 = 0
            r1 = r3
        L5:
            if (r1 >= r2) goto L6f
            r5 = r7[r1]
            boolean r0 = r5 instanceof com.facebook.soloader.BackupSoSource
            if (r0 != 0) goto L10
            int r1 = r1 + 1
            goto L5
        L10:
            com.facebook.soloader.BackupSoSource r5 = (com.facebook.soloader.BackupSoSource) r5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L48
            r1.<init>()     // Catch: java.lang.Exception -> L48
            java.lang.String r0 = "Preparing BackupSoSource for the first time "
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch: java.lang.Exception -> L48
            java.lang.String r0 = r5.getName()     // Catch: java.lang.Exception -> L48
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Exception -> L48
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L48
            com.facebook.soloader.LogUtil.e(r4, r0)     // Catch: java.lang.Exception -> L48
            r5.prepare(r3)     // Catch: java.lang.Exception -> L48
            int r2 = r7.length
        L30:
            if (r3 >= r2) goto L46
            r1 = r7[r3]
            boolean r0 = r1 instanceof com.facebook.soloader.DirectorySoSource
            if (r0 != 0) goto L3b
        L38:
            int r3 = r3 + 1
            goto L30
        L3b:
            boolean r0 = r1 instanceof com.facebook.soloader.BackupSoSource
            if (r0 == 0) goto L40
            goto L38
        L40:
            com.facebook.soloader.DirectorySoSource r1 = (com.facebook.soloader.DirectorySoSource) r1
            r1.setExplicitDependencyResolution()
            goto L38
        L46:
            r0 = 1
            return r0
        L48:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Encountered an exception while reunpacking BackupSoSource "
            r1.<init>(r0)
            java.lang.String r0 = r5.getName()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r0 = " for library "
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r1 = r0.append(r8)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            com.facebook.soloader.LogUtil.e(r4, r0, r2)
        L6f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.recovery.ReunpackBackupSoSources.lazyPrepareBackupSoSource(com.facebook.soloader.SoSource[], java.lang.String):boolean");
    }

    private void logRecovery(Error error, String str) {
        LogUtil.e(SoLoader.TAG, "Reunpacking BackupSoSources due to " + error + ", retrying for specific library " + str);
    }

    private boolean recoverDSONotFoundError(SoSource[] soSourceArr, String str, int i2) {
        try {
            for (SoSource soSource : soSourceArr) {
                if ((soSource instanceof BackupSoSource) && ((BackupSoSource) soSource).peekAndPrepareSoSource(str, i2)) {
                    return true;
                }
            }
            return false;
        } catch (IOException e2) {
            LogUtil.e(SoLoader.TAG, "Failed to run recovery for backup so source due to: " + e2);
            return false;
        }
    }

    @Override // com.facebook.soloader.recovery.RecoveryStrategy
    public boolean recover(UnsatisfiedLinkError unsatisfiedLinkError, SoSource[] soSourceArr) {
        if (!(unsatisfiedLinkError instanceof SoLoaderULError)) {
            return false;
        }
        SoLoaderULError soLoaderULError = (SoLoaderULError) unsatisfiedLinkError;
        String soName = soLoaderULError.getSoName();
        String message = soLoaderULError.getMessage();
        if (soName == null) {
            LogUtil.e(SoLoader.TAG, "No so name provided in ULE, cannot recover");
            return false;
        }
        if (soLoaderULError instanceof SoLoaderDSONotFoundError) {
            if ((-1) - (((-1) - this.mRecoveryFlags) | ((-1) - 1)) == 0) {
                return false;
            }
            logRecovery(soLoaderULError, soName);
            return recoverDSONotFoundError(soSourceArr, soName, 0);
        }
        if (message == null || !(message.contains("/app/") || message.contains("/mnt/"))) {
            return false;
        }
        logRecovery(soLoaderULError, soName);
        return lazyPrepareBackupSoSource(soSourceArr, soName);
    }
}
