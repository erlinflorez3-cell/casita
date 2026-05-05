package o.bn;

import android.app.Application;
import android.os.AsyncTask;
import android.os.Process;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import fr.antelop.sdk.transaction.hce.HceTransaction;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import o.bs.d;
import o.dq.c;
import o.en.b;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends AndroidViewModel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f21407d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f21408f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static byte[] f21409g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f21410h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f21411i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f21412j = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static int f21413m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f21414o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f21415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21417c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    MutableLiveData<List<HceTransaction>> f21418e;

    static final class d extends AsyncTask<Void, Void, List<HceTransaction>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f21419a = 1907679988;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f21420c = -404959135;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f21421d = -1561714117;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f21422e = 1114449905;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f21423f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f21424g = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f21425b;

        d(a aVar) {
            this.f21425b = aVar;
        }

        private List<HceTransaction> b() {
            int iMyTid = Process.myTid();
            int i2 = f21420c * 530692613;
            f21420c = i2;
            int i3 = f21419a * (-672627170);
            f21419a = i3;
            int i4 = f21421d * (-278204268);
            f21421d = i4;
            return (List) d(i4, new Object[]{this}, iMyTid, 1958825104, i2, i3, -1958825104);
        }

        public static /* synthetic */ Object d(int i2, Object[] objArr, int i3, int i4, int i5, int i6, int i7) {
            int i8 = ~i4;
            int i9 = ~i3;
            int i10 = (-1) - (((-1) - (~(i8 | i9))) & ((-1) - (~((-1) - (((-1) - i8) & ((-1) - i7))))));
            int i11 = ~(i9 | i7);
            int i12 = (i10 + i11) - (i10 & i11);
            int i13 = ~((-1) - (((-1) - i3) & ((-1) - i8)));
            int i14 = (-1) - (((-1) - ((i7 + i13) - (i7 & i13))) & ((-1) - (~((i9 + i4) - (i9 & i4)))));
            int i15 = i7 + i4 + i5 + (1997535707 * i6) + (1930545336 * i2);
            int i16 = i15 * i15;
            int i17 = ((-1352905585) * i7) + 1468203008 + ((-417352845) * i4) + (i12 * 1679707278) + (1679707278 * i13) + ((-1679707278) * i14) + (1262354432 * i5) + ((-1408630784) * i6) + ((-2070937600) * i2) + (392888320 * i16);
            int i18 = (i7 * (-2054695253)) + 138751921 + (i4 * (-2054693473)) + (i12 * (-890)) + (i13 * (-890)) + (i14 * 890) + (i5 * (-2054694363)) + (i6 * 1502648999) + (i2 * 931574424) + (i16 * (-2139684864));
            return i17 + ((i18 * i18) * (-174260224)) != 1 ? e(objArr) : d(objArr);
        }

        private static /* synthetic */ Object d(Object[] objArr) {
            d dVar = (d) objArr[0];
            List<HceTransaction> list = (List) objArr[1];
            int i2 = 2 % 2;
            int i3 = f21423f;
            int i4 = (i3 ^ 15) + (((-1) - (((-1) - i3) | ((-1) - 15))) << 1);
            f21424g = i4 % 128;
            int i5 = i4 % 2;
            dVar.f21425b.f21418e.setValue(list);
            int i6 = f21423f + 101;
            f21424g = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 84 / 0;
            }
            return null;
        }

        private void d(List<HceTransaction> list) {
            int iMyPid = Process.myPid();
            int iNextInt = new Random().nextInt(1619741964);
            int i2 = f21422e * 1434080507;
            f21422e = i2;
            d(new Random().nextInt(1041961848), new Object[]{this, list}, iMyPid, 43513637, iNextInt, i2, -43513636);
        }

        private static /* synthetic */ Object e(Object[] objArr) {
            d dVar = (d) objArr[0];
            int i2 = 2 % 2;
            int i3 = f21424g;
            int i4 = (((-1) - (((-1) - i3) & ((-1) - 79))) << 1) - (i3 ^ 79);
            f21423f = i4 % 128;
            int i5 = i4 % 2;
            a aVar = dVar.f21425b;
            if (i5 == 0) {
                return aVar.b();
            }
            aVar.b();
            throw null;
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ List<HceTransaction> doInBackground(Void[] voidArr) {
            List<HceTransaction> list;
            int i2 = 2 % 2;
            int i3 = f21423f + 9;
            f21424g = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = {this};
            int iMyTid = Process.myTid();
            int i5 = f21420c * 530692613;
            f21420c = i5;
            int i6 = f21419a * (-672627170);
            f21419a = i6;
            int i7 = f21421d * (-278204268);
            f21421d = i7;
            if (i4 == 0) {
                list = (List) d(i7, objArr, iMyTid, 1958825104, i5, i6, -1958825104);
                int i8 = 3 / 0;
            } else {
                list = (List) d(i7, objArr, iMyTid, 1958825104, i5, i6, -1958825104);
            }
            int i9 = f21424g;
            int i10 = (i9 ^ 95) + (((-1) - (((-1) - i9) | ((-1) - 95))) << 1);
            f21423f = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 78 / 0;
            }
            return list;
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(List<HceTransaction> list) {
            Random random;
            int i2 = 2 % 2;
            int i3 = f21423f + 61;
            f21424g = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = {this, list};
            int iMyPid = Process.myPid();
            if (i4 == 0) {
                random = new Random();
                int iNextInt = random.nextInt(1619741964);
                int i5 = f21422e * 1434080507;
                f21422e = i5;
                d(new Random().nextInt(1041961848), objArr, iMyPid, 43513637, iNextInt, i5, -43513636);
                int i6 = 17 / 0;
            } else {
                random = new Random();
                int iNextInt2 = random.nextInt(1619741964);
                int i7 = f21422e * 1434080507;
                f21422e = i7;
                d(new Random().nextInt(1041961848), objArr, iMyPid, 43513637, iNextInt2, i7, -43513636);
            }
            int i8 = f21424g;
            int i9 = ((i8 + 101) - (101 | i8)) + ((i8 + 101) - (i8 & 101));
            f21423f = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 77 / 0;
            }
        }
    }

    static {
        a();
        ViewConfiguration.getScrollBarFadeDuration();
        ViewConfiguration.getMinimumFlingVelocity();
        ViewConfiguration.getScrollBarSize();
        Process.getThreadPriority(0);
        SystemClock.elapsedRealtimeNanos();
        int i2 = f21414o + 97;
        f21413m = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public a(Application application, b bVar, int i2, int i3) {
        super(application);
        this.f21415a = bVar;
        this.f21417c = i2;
        this.f21416b = i3;
    }

    static void a() {
        f21407d = -291581196;
        f21412j = 1150422417;
        f21408f = 1515546529;
        f21409g = new byte[]{-72, -66, MessagePack.Code.FLOAT32, -97, -21, -81, MessagePack.Code.UINT16, -84, MessagePack.Code.UINT32, -65, -108, MessagePack.Code.FIXEXT8, -80, -69, MessagePack.Code.FLOAT32, -82, -65, MessagePack.Code.TRUE, -70, -94, MessagePack.Code.NIL, -109, -115};
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0125 A[PHI: r1
  0x0125: PHI (r1v5 o.ep.d) = (r1v4 o.ep.d), (r1v15 o.ep.d) binds: [B:14:0x0121, B:5:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(o.dq.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bn.a.c(o.dq.c):void");
    }

    private static o.bs.a[] d() {
        int i2 = 2 % 2;
        int i3 = f21411i + 123;
        f21410h = i3 % 128;
        int i4 = i3 % 2;
        o.bs.a[] aVarArr = {o.bs.a.f21591b, o.bs.a.f21593e};
        int i5 = f21411i + 21;
        f21410h = i5 % 128;
        int i6 = i5 % 2;
        return aVarArr;
    }

    private void e() {
        int i2 = 2 % 2;
        new d(this).execute(new Void[0]);
        int i3 = f21411i + 79;
        f21410h = i3 % 128;
        int i4 = i3 % 2;
    }

    final List<HceTransaction> b() {
        int i2 = 2 % 2;
        o.bs.d dVar = new o.bs.d(getApplication());
        ArrayList arrayList = new ArrayList();
        d.a aVarE = dVar.e(getApplication(), d(), this.f21417c, this.f21416b);
        while (aVarE.hasNext()) {
            try {
                c cVarA = aVarE.a();
                if (cVarA != null) {
                    int i3 = f21411i + 107;
                    f21410h = i3 % 128;
                    if (i3 % 2 == 0) {
                        c(cVarA);
                        int iMyTid = Process.myTid();
                        int i4 = c.L * (-2097288704);
                        c.L = i4;
                        int i5 = c.S * 302093969;
                        c.S = i5;
                        arrayList.add((HceTransaction) c.e(i5, (int) Runtime.getRuntime().freeMemory(), new Object[]{cVarA}, 1323051983, iMyTid, -1323051962, i4));
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    c(cVarA);
                    int iMyTid2 = Process.myTid();
                    int i6 = c.L * (-2097288704);
                    c.L = i6;
                    int i7 = c.S * 302093969;
                    c.S = i7;
                    arrayList.add((HceTransaction) c.e(i7, (int) Runtime.getRuntime().freeMemory(), new Object[]{cVarA}, 1323051983, iMyTid2, -1323051962, i6));
                }
            } catch (Throwable th) {
                try {
                    aVarE.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        aVarE.close();
        int i8 = f21411i + 125;
        f21410h = i8 % 128;
        int i9 = i8 % 2;
        return arrayList;
    }

    public final MutableLiveData<List<HceTransaction>> c() {
        int i2 = 2 % 2;
        int i3 = f21411i + 27;
        f21410h = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.f21418e == null) {
            this.f21418e = new MutableLiveData<>();
            e();
        }
        MutableLiveData<List<HceTransaction>> mutableLiveData = this.f21418e;
        int i4 = f21411i + 67;
        f21410h = i4 % 128;
        int i5 = i4 % 2;
        return mutableLiveData;
    }
}
