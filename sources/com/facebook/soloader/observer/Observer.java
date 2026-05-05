package com.facebook.soloader.observer;

import com.facebook.soloader.SoFileLoader;
import com.facebook.soloader.SoSource;
import com.facebook.soloader.recovery.RecoveryStrategy;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface Observer {
    void onGetDependenciesEnd(@Nullable Throwable th);

    void onGetDependenciesStart();

    void onLoadDependencyEnd(@Nullable Throwable th, boolean z2);

    void onLoadDependencyStart(String str, int i2);

    void onLoadLibraryEnd(@Nullable Throwable th, boolean z2);

    void onLoadLibraryStart(String str, @Nullable String str2, int i2);

    void onRecoveryEnd(@Nullable Throwable th);

    void onRecoveryStart(RecoveryStrategy recoveryStrategy);

    void onSoFileLoaderLoadEnd(@Nullable Throwable th);

    void onSoFileLoaderLoadStart(SoFileLoader soFileLoader, String str, int i2);

    void onSoSourceLoadLibraryEnd(@Nullable Throwable th);

    void onSoSourceLoadLibraryStart(SoSource soSource);
}
