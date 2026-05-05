package o.s;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.ea.m;
import o.m.i;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f26792a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f26793b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f26794c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f26795d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<i, Date> f26796e = new HashMap();

    static {
        int i2 = f26795d + 111;
        f26794c = i2 % 128;
        int i3 = i2 % 2;
    }

    private static boolean a(i iVar) {
        int i2 = 2 % 2;
        int i3 = f26792a;
        int i4 = (i3 ^ 21) + (((i3 + 21) - (i3 | 21)) << 1);
        f26793b = i4 % 128;
        int i5 = i4 % 2;
        if (m.c.e(iVar, i.f26497e, i.f26500i, i.f26495c)) {
            return false;
        }
        int i6 = f26793b + 29;
        int i7 = i6 % 128;
        f26792a = i7;
        boolean z2 = i6 % 2 == 0;
        int i8 = i7 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f26793b = i8 % 128;
        if (i8 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    private synchronized void d(i iVar) {
        int i2 = 2 % 2;
        int i3 = f26793b + 29;
        f26792a = i3 % 128;
        int i4 = i3 % 2;
        if (a(iVar)) {
            f26796e.put(iVar, new Date());
            int i5 = f26793b;
            int i6 = (((i5 + 15) - (15 & i5)) << 1) - (i5 ^ 15);
            f26792a = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 / 5;
            } else {
                int i8 = 2 % 2;
            }
        }
    }

    public final synchronized void b(List<i> list) {
        int i2 = 2 % 2;
        int i3 = f26793b + 125;
        f26792a = i3 % 128;
        if (i3 % 2 != 0) {
            list.iterator();
            throw null;
        }
        Iterator<i> it = list.iterator();
        int i4 = 2 % 2;
        while (it.hasNext()) {
            int i5 = f26792a;
            int i6 = (i5 ^ 105) + (((i5 + 105) - (i5 | 105)) << 1);
            f26793b = i6 % 128;
            int i7 = i6 % 2;
            d(it.next());
        }
    }

    public final synchronized List<i> d(int i2) {
        int i3 = 2 % 2;
        ArrayList arrayList = new ArrayList();
        if (i2 < 0) {
            int i4 = f26793b;
            int i5 = (i4 & 81) + ((i4 + 81) - (i4 & 81));
            int i6 = i5 % 128;
            f26792a = i6;
            int i7 = i5 % 2;
            int i8 = ((83 | i6) << 1) - (i6 ^ 83);
            f26793b = i8 % 128;
            if (i8 % 2 != 0) {
                return arrayList;
            }
            int i9 = 68 / 0;
            return arrayList;
        }
        Date date = new Date(System.currentTimeMillis() - ((long) (i2 * 1000)));
        Iterator<Map.Entry<i, Date>> it = f26796e.entrySet().iterator();
        while (!(!it.hasNext())) {
            int i10 = f26792a + 87;
            f26793b = i10 % 128;
            int i11 = i10 % 2;
            Map.Entry<i, Date> next = it.next();
            if (next.getValue().after(date)) {
                int i12 = f26793b;
                int i13 = (i12 ^ 33) + (((i12 + 33) - (i12 | 33)) << 1);
                f26792a = i13 % 128;
                int i14 = i13 % 2;
                arrayList.add(next.getKey());
                int i15 = f26793b + 81;
                f26792a = i15 % 128;
                if (i15 % 2 == 0) {
                    int i16 = 2 % 2;
                }
            }
        }
        return arrayList;
    }
}
