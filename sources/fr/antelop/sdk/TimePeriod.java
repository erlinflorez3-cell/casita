package fr.antelop.sdk;

/* JADX INFO: loaded from: classes5.dex */
public enum TimePeriod {
    Day("DAILY"),
    Week("WEEKLY"),
    Month("MONTHLY");

    private final String value;

    TimePeriod(String str) {
        this.value = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static fr.antelop.sdk.TimePeriod getPeriodFromString(java.lang.String r5) throws java.lang.Throwable {
        /*
            r4 = 0
            if (r5 != 0) goto L4
            return r4
        L4:
            int r3 = r5.hashCode()
            r0 = -1738378111(0xffffffff98627481, float:-2.9268635E-24)
            r2 = 2
            r1 = 1
            if (r3 == r0) goto L53
            r0 = 64808441(0x3dce5f9, float:1.2983237E-36)
            if (r3 == r0) goto L49
            r0 = 1954618349(0x74811bed, float:8.18326E31)
            if (r3 == r0) goto L3f
        L19:
            r0 = -1
        L1a:
            if (r0 == 0) goto L3c
            if (r0 == r1) goto L39
            if (r0 == r2) goto L36
            boolean r0 = o.ea.f.a()
            if (r0 == 0) goto L35
            java.lang.String r1 = "getPeriodFromString - Velocity Period not recognized : "
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r1 = r1.concat(r0)
            java.lang.String r0 = "TimePeriod"
            o.ea.f.d(r0, r1)
        L35:
            return r4
        L36:
            fr.antelop.sdk.TimePeriod r4 = fr.antelop.sdk.TimePeriod.Month
            goto L35
        L39:
            fr.antelop.sdk.TimePeriod r4 = fr.antelop.sdk.TimePeriod.Week
            goto L35
        L3c:
            fr.antelop.sdk.TimePeriod r4 = fr.antelop.sdk.TimePeriod.Day
            goto L35
        L3f:
            java.lang.String r0 = "MONTHLY"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L19
            r0 = r2
            goto L1a
        L49:
            java.lang.String r0 = "DAILY"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L19
            r0 = 0
            goto L1a
        L53:
            java.lang.String r0 = "WEEKLY"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L19
            r0 = r1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.antelop.sdk.TimePeriod.getPeriodFromString(java.lang.String):fr.antelop.sdk.TimePeriod");
    }

    public final String getString() {
        return this.value;
    }
}
