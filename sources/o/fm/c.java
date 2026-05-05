package o.fm;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.m.i;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends e<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26044b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f26045c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<i, o.m.h> f26046a;

    c() {
        super(false);
        this.f26046a = new HashMap<>(0);
    }

    public c(Context context, HashMap<i, o.m.h> map) throws Throwable {
        super(true);
        this.f26046a = map;
        o.m.c.d().e(context, map);
    }

    public final boolean b(c cVar) {
        int i2 = 2 % 2;
        int i3 = f26045c + 95;
        f26044b = i3 % 128;
        int i4 = i3 % 2;
        if (this.f26046a.size() != cVar.f26046a.size()) {
            int i5 = f26044b + 15;
            f26045c = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        Set<i> setKeySet = this.f26046a.keySet();
        Iterator<i> it = cVar.f26046a.keySet().iterator();
        int i7 = f26044b + 81;
        f26045c = i7 % 128;
        while (true) {
            int i8 = i7 % 2;
            if (it.hasNext()) {
                int i9 = f26044b;
                int i10 = ((i9 + 73) - (73 | i9)) + ((-1) - (((-1) - i9) & ((-1) - 73)));
                f26045c = i10 % 128;
                if (i10 % 2 == 0) {
                    setKeySet.remove(it.next());
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                setKeySet.remove(it.next());
                int i11 = f26045c;
                i7 = (i11 ^ 89) + ((i11 & 89) << 1);
                f26044b = i7 % 128;
            } else {
                if (setKeySet.size() != 0) {
                    int i12 = f26044b + 15;
                    f26045c = i12 % 128;
                    int i13 = i12 % 2;
                    return false;
                }
                Iterator<Map.Entry<i, o.m.h>> it2 = this.f26046a.entrySet().iterator();
                int i14 = f26044b;
                int i15 = (i14 & 85) + (i14 | 85);
                f26045c = i15 % 128;
                while (true) {
                    int i16 = i15 % 2;
                    if (!it2.hasNext()) {
                        return true;
                    }
                    Map.Entry<i, o.m.h> next = it2.next();
                    o.m.h hVar = cVar.f26046a.get(next.getKey());
                    if (hVar == null) {
                        int i17 = f26044b;
                        int i18 = (i17 ^ 5) + ((i17 & 5) << 1);
                        int i19 = i18 % 128;
                        f26045c = i19;
                        int i20 = i18 % 2;
                        int i21 = i19 + 31;
                        f26044b = i21 % 128;
                        int i22 = i21 % 2;
                        return false;
                    }
                    if (!next.getValue().equals(hVar)) {
                        int i23 = f26044b + 27;
                        f26045c = i23 % 128;
                        int i24 = i23 % 2;
                        return false;
                    }
                    i15 = f26045c + 25;
                    f26044b = i15 % 128;
                }
            }
        }
    }

    final HashMap<i, o.m.h> c() {
        int i2 = 2 % 2;
        int i3 = f26044b + 17;
        int i4 = i3 % 128;
        f26045c = i4;
        int i5 = i3 % 2;
        HashMap<i, o.m.h> map = this.f26046a;
        int i6 = (i4 ^ 101) + ((i4 & 101) << 1);
        f26044b = i6 % 128;
        if (i6 % 2 == 0) {
            return map;
        }
        throw null;
    }
}
