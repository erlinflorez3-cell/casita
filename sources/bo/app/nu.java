package bo.app;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class nu implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.compareValues(Long.valueOf(((z80) obj).f2364b), Long.valueOf(((z80) obj2).f2364b));
    }
}
