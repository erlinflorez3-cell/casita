package kotlinx.coroutines;

import kotlin.Metadata;
import yg.InterfaceC1492Gx;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|[\u0015e\u0013\u0010qZUTX$r,W7\u000eE5\u0011r\\E'\u00029oe..=\rd\u0013l/1KJ12Ly#\u0002g|\\[\u001e'7fI}|\u001f\fb", "_q\b'\u001d\u000e\u0015\u0017a25Qhv)r\u0014|[\u0015e\u0013\u0010qZUTX$r,W7\u000eE5\u0011r\\E'\u00029vX4\u001f5|L\u0010v:\u0011OY]*Ml*rv_k"}, d2 = {}, k = 4, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ThreadPoolDispatcherKt {
    public static final ExecutorCoroutineDispatcher newFixedThreadPoolContext(int i2, String str) {
        return ThreadPoolDispatcherKt__ThreadPoolDispatcherKt.newFixedThreadPoolContext(i2, str);
    }

    public static final ExecutorCoroutineDispatcher newSingleThreadContext(String str) {
        return ThreadPoolDispatcherKt__MultithreadedDispatchers_commonKt.newSingleThreadContext(str);
    }
}
