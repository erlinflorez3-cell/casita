package o.x;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f26865h = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f26866m = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f26869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<o.m.i> f26870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f26871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f26872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f26873g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Long f26874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Long f26875j;

    public b(String str, List<o.m.i> list, String str2, String str3, String str4, String str5, String str6, Long l2, Long l3) {
        this.f26867a = str;
        this.f26870d = list;
        this.f26869c = str2;
        this.f26871e = str3;
        this.f26868b = str4;
        this.f26873g = str5;
        this.f26872f = str6;
        this.f26875j = l2;
        this.f26874i = l3;
    }

    public final List<o.m.i> d() {
        int i2 = 2 % 2;
        int i3 = f26866m;
        int i4 = i3 + 121;
        f26865h = i4 % 128;
        int i5 = i4 % 2;
        List<o.m.i> list = this.f26870d;
        int i6 = ((i3 + 35) - (35 | i3)) + ((i3 + 35) - (i3 & 35));
        f26865h = i6 % 128;
        if (i6 % 2 == 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
