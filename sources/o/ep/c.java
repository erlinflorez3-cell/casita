package o.ep;

import android.os.Process;
import fr.antelop.sdk.card.CardDisplay;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a */
    public static int f24434a = -829191238;

    /* JADX INFO: renamed from: b */
    public static int f24435b = 228490957;

    /* JADX INFO: renamed from: c */
    public static int f24436c = 1351790947;

    /* JADX INFO: renamed from: d */
    public static int f24437d = -501399845;

    /* JADX INFO: renamed from: e */
    public static int f24438e = 1093012433;

    /* JADX INFO: renamed from: f */
    public static int f24439f = 1785448049;

    /* JADX INFO: renamed from: h */
    public static int f24440h = 428601371;

    /* JADX INFO: renamed from: i */
    public static int f24441i = -1008929049;

    /* JADX INFO: renamed from: l */
    private static int f24442l = 1;

    /* JADX INFO: renamed from: m */
    private static int f24443m = 0;

    /* JADX INFO: renamed from: g */
    private final Date f24444g;

    /* JADX INFO: renamed from: j */
    private final String f24445j;

    /* JADX INFO: renamed from: k */
    private final CardDisplay f24446k;

    /* JADX INFO: renamed from: n */
    private final String f24447n;

    /* JADX INFO: renamed from: o */
    private final String f24448o;

    public c(String str, Date date, String str2, CardDisplay cardDisplay, String str3) {
        this.f24445j = str;
        this.f24444g = date;
        this.f24448o = str2;
        this.f24446k = cardDisplay;
        this.f24447n = str3;
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        c cVar = (c) objArr[0];
        int i2 = 2 % 2;
        int i3 = f24442l + 85;
        int i4 = i3 % 128;
        f24443m = i4;
        int i5 = i3 % 2;
        CardDisplay cardDisplay = cVar.f24446k;
        int i6 = (i4 ^ 85) + (((-1) - (((-1) - i4) | ((-1) - 85))) << 1);
        f24442l = i6 % 128;
        if (i6 % 2 != 0) {
            return cardDisplay;
        }
        throw null;
    }

    public static /* synthetic */ Object c(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~(i8 | i6);
        int i10 = ~i6;
        int i11 = ~i2;
        int i12 = ~((i11 + i10) - (i11 & i10));
        int i13 = ~((-1) - (((-1) - i10) & ((-1) - i5)));
        int i14 = (-1) - (((-1) - i12) & ((-1) - i13));
        int i15 = (-1) - (((-1) - (~(i2 | i8))) & ((-1) - (i13 | i9)));
        int i16 = i6 + i5 + i3 + ((-168536539) * i7) + (1787681333 * i4);
        int i17 = i16 * i16;
        int i18 = ((-1349843359) * i6) + 1460535296 + ((-923239215) * i5) + ((-1716058528) * i9) + (i14 * (-1289454384)) + ((-1289454384) * i15) + (366215168 * i3) + (1604583424 * i7) + (216268800 * i4) + (1778253824 * i17);
        int i19 = (i6 * (-925914073)) + 175428941 + (i5 * (-925912777)) + (i9 * (-864)) + (i14 * 432) + (i15 * 432) + (i3 * (-925913209)) + (i7 * 1252505731) + (i4 * 30625011) + (i17 * (-2030960640));
        int i20 = i18 + (i19 * i19 * 899809280);
        if (i20 == 1) {
            c cVar = (c) objArr[0];
            int i21 = 2 % 2;
            int i22 = f24442l;
            int i23 = ((-1) - (((-1) - i22) | ((-1) - 65))) + (i22 | 65);
            f24443m = i23 % 128;
            int i24 = i23 % 2;
            int iHash = Objects.hash(cVar.f24445j, cVar.f24444g, cVar.f24448o, cVar.f24446k, cVar.f24447n);
            int i25 = f24443m;
            int i26 = (((i25 + 111) - (111 & i25)) << 1) - (i25 ^ 111);
            f24442l = i26 % 128;
            int i27 = i26 % 2;
            return Integer.valueOf(iHash);
        }
        if (i20 == 2) {
            return b(objArr);
        }
        c cVar2 = (c) objArr[0];
        int i28 = 2 % 2;
        int i29 = f24442l;
        int i30 = (i29 & 13) + ((i29 + 13) - (13 & i29));
        f24443m = i30 % 128;
        int i31 = i30 % 2;
        String str = cVar2.f24448o;
        int i32 = (i29 ^ 121) + (((i29 + 121) - (i29 | 121)) << 1);
        f24443m = i32 % 128;
        int i33 = i32 % 2;
        return str;
    }

    public final String a() {
        int i2 = 2 % 2;
        int i3 = f24442l + 95;
        int i4 = i3 % 128;
        f24443m = i4;
        int i5 = i3 % 2;
        String str = this.f24447n;
        int i6 = ((51 | i4) << 1) - (i4 ^ 51);
        f24442l = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String b() {
        String str;
        int i2 = 2 % 2;
        int i3 = f24443m;
        int i4 = ((27 | i3) << 1) - (i3 ^ 27);
        int i5 = i4 % 128;
        f24442l = i5;
        if (i4 % 2 == 0) {
            str = this.f24445j;
            int i6 = 45 / 0;
        } else {
            str = this.f24445j;
        }
        int i7 = (i5 & 73) + (i5 | 73);
        f24443m = i7 % 128;
        int i8 = i7 % 2;
        return str;
    }

    public final Date c() {
        int i2 = 2 % 2;
        int i3 = f24442l;
        int i4 = ((-1) - (((-1) - i3) | ((-1) - 65))) + ((i3 + 65) - (65 & i3));
        f24443m = i4 % 128;
        int i5 = i4 % 2;
        Date date = this.f24444g;
        int i6 = i3 + 91;
        f24443m = i6 % 128;
        if (i6 % 2 == 0) {
            return date;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String d() {
        int i2 = f24438e * 574268897;
        f24438e = i2;
        int id = (int) Thread.currentThread().getId();
        int i3 = f24436c * 1169734117;
        f24436c = i3;
        int i4 = f24434a * (-2104816085);
        f24434a = i4;
        return (String) c(i2, id, i4, 1241915024, new Object[]{this}, -1241915024, i3);
    }

    public final CardDisplay e() {
        int i2 = f24440h * (-581252450);
        f24440h = i2;
        int i3 = (int) Runtime.getRuntime().totalMemory();
        int i4 = f24441i * 151058815;
        f24441i = i4;
        int i5 = f24439f * (-518773767);
        f24439f = i5;
        return (CardDisplay) c(i2, i3, i5, -465660215, new Object[]{this}, 465660217, i4);
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        int i3 = f24442l + 115;
        int i4 = i3 % 128;
        f24443m = i4;
        Object obj2 = null;
        if (i3 % 2 != 0) {
            boolean z2 = obj instanceof c;
            obj2.hashCode();
            throw null;
        }
        if (!(obj instanceof c)) {
            int i5 = (i4 ^ 53) + (((i4 + 53) - (i4 | 53)) << 1);
            f24442l = i5 % 128;
            return i5 % 2 == 0;
        }
        c cVar = (c) obj;
        if (!(!Objects.equals(this.f24445j, cVar.b())) && Objects.equals(this.f24444g, cVar.f24444g)) {
            int i6 = f24443m + 29;
            f24442l = i6 % 128;
            int i7 = i6 % 2;
            if (Objects.equals(this.f24448o, cVar.f24448o)) {
                int i8 = f24443m;
                int i9 = (((-1) - (((-1) - i8) & ((-1) - 101))) << 1) - (i8 ^ 101);
                f24442l = i9 % 128;
                int i10 = i9 % 2;
                if (Objects.equals(this.f24447n, cVar.f24447n)) {
                    int i11 = f24442l;
                    int i12 = (i11 ^ 87) + ((87 & i11) << 1);
                    f24443m = i12 % 128;
                    int i13 = i12 % 2;
                    int i14 = i11 + 13;
                    f24443m = i14 % 128;
                    if (i14 % 2 == 0) {
                        return true;
                    }
                    throw null;
                }
            }
        }
        int i15 = f24442l;
        int i16 = ((i15 | 27) << 1) - (i15 ^ 27);
        f24443m = i16 % 128;
        int i17 = i16 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = f24435b * (-1342150136);
        f24435b = i2;
        int iMyTid = Process.myTid();
        int iMyTid2 = Process.myTid();
        int i3 = f24437d * 1517836776;
        f24437d = i3;
        return ((Integer) c(i2, iMyTid, i3, 2072654806, new Object[]{this}, -2072654805, iMyTid2)).intValue();
    }
}
