package com.google.common.util.concurrent;

import com.google.errorprone.annotations.DoNotMock;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes7.dex */
@DoNotMock("^}l(ynh$~w\u0004x|r~,bh\u0017>jjhffu\u001f(igfa\tSTUJJLEeW5eac]Q\u0002yFJt)8HUCALB$PP?=-")
@InterfaceC1492Gx
@ElementTypesAreNonnullByDefault
public interface ListenableFuture<V> extends Future<V> {
    void addListener(Runnable listener, Executor executor);
}
