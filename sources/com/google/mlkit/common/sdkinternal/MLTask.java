package com.google.mlkit.common.sdkinternal;

import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.MLTaskInput;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MLTask<T, S extends MLTaskInput> extends ModelResource {
    public MLTask() {
    }

    protected MLTask(TaskQueue taskQueue) {
        super(taskQueue);
    }

    public abstract T run(S s2) throws MlKitException;
}
