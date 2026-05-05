package o.ey;

import android.app.Activity;
import android.os.Process;
import android.os.SystemClock;
import java.util.List;
import o.ap.a;
import o.ea.h;
import o.ea.j;
import o.ep.d;
import o.es.c;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements o.es.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f25579a = 2004948661;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f25580b = -458026379;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f25581c = 1089034787;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f25582d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f25583e = -1034073546;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f25584f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f25585g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f25586h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f25587i = 0;

    static {
        e();
        int i2 = f25587i + 63;
        f25585g = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ Object a(Object[] objArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ~i2;
        int i9 = ~((-1) - (((-1) - i8) & ((-1) - i7)));
        int i10 = ~i3;
        int i11 = ~i7;
        int i12 = i9 | (~((-1) - (((-1) - ((-1) - (((-1) - i10) & ((-1) - i11)))) & ((-1) - i2))));
        int i13 = (~(i7 | ((i10 + i2) - (i10 & i2)))) | (~((i11 + i8) - (i11 & i8)));
        int i14 = ~((i8 + i10) - (i8 & i10));
        int i15 = i3 + i2 + i6 + (563899752 * i4) + (667302295 * i5);
        int i16 = i15 * i15;
        int i17 = ((i3 * 1426164010) - 416808960) + (1426164010 * i2) + (i12 * 480671447) + (i13 * 480671447) + (480671447 * i14) + (1906835456 * i6) + ((-1270874112) * i4) + (1914175488 * i5) + ((-1995833344) * i16);
        int i18 = (i3 * (-901935710)) + 144807674 + (i2 * (-901935710)) + (i12 * 171) + (i13 * 171) + (i14 * 171) + (i6 * (-901935539)) + (i4 * 42244168) + (i5 * (-913566613)) + (i16 * (-1006501888));
        if (i17 + (i18 * i18 * (-1006239744)) != 1) {
            return d(objArr);
        }
        int i19 = 2 % 2;
        int i20 = f25584f + 125;
        f25586h = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    public static a a() {
        int i2 = 2 % 2;
        int i3 = f25584f + 95;
        int i4 = i3 % 128;
        f25586h = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i4 + 111;
        f25584f = i5 % 128;
        if (i5 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = f25586h + 97;
        f25584f = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    static void e() {
        f25582d = new char[]{56431, 56423, 56435, 56401, 56432, 56436, 56433, 56397, 56440, 56425, 56432, 56432, 56421, 56411, 56445, 56421, 56404, 56425, 56432, 56427, 56435, 56435, 56395, 56424, 56425};
    }

    @Override // o.es.c
    public final void a(c.a<String> aVar) {
        int i2 = 2 % 2;
        int i3 = f25586h + 93;
        f25584f = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.es.a
    public final void a(o.es.e eVar) {
        int i2 = 2 % 2;
        int i3 = f25584f + 29;
        f25586h = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.es.c
    public final void b(Activity activity) {
        int i2 = 2 % 2;
        int i3 = f25584f + 31;
        f25586h = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // o.es.a
    public final void b(Activity activity, o.es.e eVar) {
        int i2 = f25581c * (-1390628959);
        f25581c = i2;
        int iMyUid = Process.myUid();
        int i3 = f25583e * 1187319502;
        f25583e = i3;
        int i4 = f25579a * (-1258233761);
        f25579a = i4;
        a(new Object[]{this, activity, eVar}, -859188536, 859188536, i3, i4, iMyUid, i2);
    }

    @Override // o.es.c
    public final void c(c.a<List<o.es.e>> aVar) {
        int i2 = 2 % 2;
        int i3 = f25586h + 73;
        f25584f = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.es.c
    public final void d(Activity activity, c.a<Object> aVar, j jVar) {
        int i2 = 2 % 2;
        int i3 = f25586h + 61;
        f25584f = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 89 / 0;
        }
    }

    @Override // o.es.a
    public final void d(Activity activity, o.es.e eVar) {
        int i2 = (int) Runtime.getRuntime().totalMemory();
        int i3 = f25580b * 373062975;
        f25580b = i3;
        a(new Object[]{this, activity, eVar}, -1552772917, 1552772918, (int) SystemClock.elapsedRealtime(), (int) Thread.currentThread().getId(), i3, i2);
    }

    @Override // o.es.c
    public final void d(c.a<c.e> aVar) {
        int i2 = 2 % 2;
        int i3 = f25586h + 9;
        f25584f = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 72 / 0;
        }
    }

    @Override // o.es.c
    public final /* synthetic */ void e(Activity activity, c.InterfaceC0350c interfaceC0350c, j jVar, d dVar, o.es.e eVar, a.d dVar2, h hVar) {
        int i2 = 2 % 2;
        int i3 = f25586h + 65;
        int i4 = i3 % 128;
        f25584f = i4;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i4 + 87;
        f25586h = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.es.c
    public final void e(c.a<String> aVar) {
        int i2 = 2 % 2;
        int i3 = f25586h + 109;
        f25584f = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
