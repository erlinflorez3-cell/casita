package com.facetec.sdk;

import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class fj {
    private final long C;
    private final String D;
    private final String F;
    private final boolean L;
    private final String S;
    private final String V;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f3171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f3172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f3173e;
    private static final Pattern Z = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern Code = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern B = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern I = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    private fj(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.V = str;
        this.S = str2;
        this.C = j2;
        this.D = str3;
        this.F = str4;
        this.L = z2;
        this.f3172d = z3;
        this.f3171c = z4;
        this.f3173e = z5;
    }

    private static boolean B(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !gg.I(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac A[Catch: IllegalArgumentException -> 0x021c, TryCatch #3 {IllegalArgumentException -> 0x021c, blocks: (B:23:0x0082, B:44:0x00e8, B:30:0x0093, B:32:0x009f, B:47:0x010e, B:35:0x00ac, B:37:0x00b8, B:41:0x00d2, B:43:0x00de, B:46:0x00f4, B:52:0x0120, B:56:0x0128), top: B:163:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [char] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.regex.Matcher] */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.facetec.sdk.fj Code(long r33, com.facetec.sdk.fp r35, java.lang.String r36) {
        /*
            Method dump skipped, instruction units count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.fj.Code(long, com.facetec.sdk.fp, java.lang.String):com.facetec.sdk.fj");
    }

    private static int I(String str, int i2, int i3, boolean z2) {
        while (i2 < i3) {
            char cCharAt = str.charAt(i2);
            boolean z3 = true;
            if ((cCharAt >= ' ' || cCharAt == '\t') && cCharAt < 127 && ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && cCharAt != ':')))) {
                z3 = false;
            }
            if (z3 == (!z2)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    private static long I(String str) {
        try {
            long j2 = Long.parseLong(str);
            if (j2 <= 0) {
                return Long.MIN_VALUE;
            }
            return j2;
        } catch (NumberFormatException e2) {
            if (str.matches("-?\\d+")) {
                return str.startsWith(Global.HYPHEN) ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e2;
        }
    }

    public static List<fj> I(fp fpVar, fr frVar) {
        int iCode = frVar.Code();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i2 = 0; i2 < iCode; i2++) {
            if ("Set-Cookie".equalsIgnoreCase(frVar.B(i2))) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(2);
                }
                arrayList2.add(frVar.Code(i2));
            }
        }
        List listUnmodifiableList = arrayList2 != null ? Collections.unmodifiableList(arrayList2) : Collections.emptyList();
        int size = listUnmodifiableList.size();
        for (int i3 = 0; i3 < size; i3++) {
            fj fjVarCode = Code(System.currentTimeMillis(), fpVar, (String) listUnmodifiableList.get(i3));
            if (fjVarCode != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fjVarCode);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public final String V() {
        return this.V;
    }

    public final String Z() {
        return this.S;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof fj)) {
            return false;
        }
        fj fjVar = (fj) obj;
        return fjVar.V.equals(this.V) && fjVar.S.equals(this.S) && fjVar.D.equals(this.D) && fjVar.F.equals(this.F) && fjVar.C == this.C && fjVar.L == this.L && fjVar.f3172d == this.f3172d && fjVar.f3173e == this.f3173e && fjVar.f3171c == this.f3171c;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.V.hashCode() + 527) * 31) + this.S.hashCode()) * 31) + this.D.hashCode()) * 31) + this.F.hashCode()) * 31;
        long j2 = this.C;
        return ((((((((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (!this.L ? 1 : 0)) * 31) + (!this.f3172d ? 1 : 0)) * 31) + (!this.f3173e ? 1 : 0)) * 31) + (!this.f3171c ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.V);
        sb.append('=');
        sb.append(this.S);
        if (this.f3173e) {
            if (this.C == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=").append(gw.B(new Date(this.C)));
            }
        }
        if (!this.f3171c) {
            sb.append("; domain=");
            sb.append(this.D);
        }
        sb.append("; path=").append(this.F);
        if (this.L) {
            sb.append("; secure");
        }
        if (this.f3172d) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
