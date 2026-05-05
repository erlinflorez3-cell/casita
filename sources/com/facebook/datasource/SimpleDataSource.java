package com.facebook.datasource;

import com.facebook.common.internal.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class SimpleDataSource<T> extends AbstractDataSource<T> {
    private SimpleDataSource() {
    }

    public static <T> SimpleDataSource<T> create() {
        return new SimpleDataSource<>();
    }

    @Override // com.facebook.datasource.AbstractDataSource
    public boolean setFailure(Throwable th) {
        return super.setFailure((Throwable) Preconditions.checkNotNull(th));
    }

    @Override // com.facebook.datasource.AbstractDataSource
    public boolean setProgress(float f2) {
        return super.setProgress(f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean setResult(T t2) {
        return super.setResult(Preconditions.checkNotNull(t2), true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.datasource.AbstractDataSource
    public boolean setResult(T t2, boolean z2, Map<String, Object> map) {
        return super.setResult(Preconditions.checkNotNull(t2), z2, map);
    }
}
