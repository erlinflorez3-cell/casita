package o.ar;

import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f20579c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f20580d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<o.ex.c, Object> f20581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Date f20582b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f20583e;

    public b(String str, Date date, Map<o.ex.c, Object> map) {
        this.f20583e = str;
        this.f20582b = date;
        this.f20581a = map;
    }

    public final Date a() {
        int i2 = 2 % 2;
        int i3 = f20580d + 85;
        int i4 = i3 % 128;
        f20579c = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Date date = this.f20582b;
        int i5 = i4 + 15;
        f20580d = i5 % 128;
        int i6 = i5 % 2;
        return date;
    }

    public final Map<o.ex.c, Object> d() {
        int i2 = 2 % 2;
        int i3 = f20579c;
        int i4 = i3 + 17;
        f20580d = i4 % 128;
        int i5 = i4 % 2;
        Map<o.ex.c, Object> map = this.f20581a;
        int i6 = i3 + 13;
        f20580d = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 25 / 0;
        }
        return map;
    }
}
