package o.ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f25576c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f25577d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<c, Boolean> f25578e = new HashMap(c.values().length);

    public e() {
        c[] cVarArrValues = c.values();
        int length = cVarArrValues.length;
        for (int i2 = 0; i2 < length; i2 = (((91 | i2) << 1) - (i2 ^ 91)) - 90) {
            this.f25578e.put(cVarArrValues[i2], Boolean.FALSE);
        }
    }

    public final Boolean b(c cVar) {
        int i2 = 2 % 2;
        int i3 = f25577d;
        int i4 = ((i3 + 63) - (63 | i3)) + ((-1) - (((-1) - i3) & ((-1) - 63)));
        f25576c = i4 % 128;
        if (i4 % 2 == 0) {
            this.f25578e.get(cVar);
            throw null;
        }
        Boolean bool = this.f25578e.get(cVar);
        int i5 = f25576c;
        int i6 = (i5 & 79) + ((-1) - (((-1) - i5) & ((-1) - 79)));
        f25577d = i6 % 128;
        if (i6 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    public final void c(List<c> list) {
        Iterator<c> it;
        int i2 = 2 % 2;
        int i3 = f25576c + 63;
        f25577d = i3 % 128;
        if (i3 % 2 != 0) {
            it = list.iterator();
            int i4 = 77 / 0;
        } else {
            it = list.iterator();
        }
        while (it.hasNext()) {
            int i5 = f25577d;
            int i6 = ((25 | i5) << 1) - (i5 ^ 25);
            f25576c = i6 % 128;
            int i7 = i6 % 2;
            this.f25578e.put(it.next(), Boolean.TRUE);
        }
        int i8 = f25577d;
        int i9 = (i8 ^ 107) + (((i8 + 107) - (i8 | 107)) << 1);
        f25576c = i9 % 128;
        if (i9 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
