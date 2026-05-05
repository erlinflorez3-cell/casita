package com.facetec.sdk;

import com.dynatrace.android.agent.Global;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import yg.Kl;

/* JADX INFO: loaded from: classes3.dex */
public final class eb {
    private static cz<AtomicInteger> A = null;
    public static final cy B;
    public static final cy C;
    public static final cy Code;
    public static final cy D;
    private static cz<Number> E = null;
    public static final cy F;
    private static cz<AtomicIntegerArray> G = null;
    private static cz<AtomicBoolean> H = null;
    public static final cz<Boolean> I;
    private static cz<StringBuilder> J = null;
    private static cz<Number> K = null;
    public static final cy L;
    private static cz<Character> M = null;
    private static cz<String> N = null;
    private static cz<StringBuffer> O = null;
    private static cz<InetAddress> P = null;
    private static cz<UUID> Q = null;
    private static cz<URI> R = null;
    public static final cy S;
    private static cz<Currency> T = null;
    private static cz<URL> U = null;
    public static final cy V;
    private static cz<Locale> W = null;
    public static final cy Z;

    /* JADX INFO: renamed from: a */
    public static final cz<Number> f3122a;
    private static cz<Calendar> aa = null;

    /* JADX INFO: renamed from: b */
    public static final cy f3123b;

    /* JADX INFO: renamed from: c */
    public static final cz<Number> f3124c;

    /* JADX INFO: renamed from: d */
    public static final cy f3125d;

    /* JADX INFO: renamed from: e */
    public static final cz<Number> f3126e;

    /* JADX INFO: renamed from: f */
    public static final cy f3127f;

    /* JADX INFO: renamed from: g */
    public static final cy f3128g;

    /* JADX INFO: renamed from: h */
    public static final cy f3129h;

    /* JADX INFO: renamed from: i */
    public static final cz<BigInteger> f3130i;

    /* JADX INFO: renamed from: j */
    public static final cz<BigDecimal> f3131j;

    /* JADX INFO: renamed from: k */
    public static final cy f3132k;

    /* JADX INFO: renamed from: l */
    public static final cy f3133l;

    /* JADX INFO: renamed from: m */
    public static final cy f3134m;

    /* JADX INFO: renamed from: n */
    public static final cy f3135n;

    /* JADX INFO: renamed from: o */
    public static final cy f3136o;

    /* JADX INFO: renamed from: p */
    public static final cy f3137p;

    /* JADX INFO: renamed from: q */
    public static final cz<cm> f3138q;

    /* JADX INFO: renamed from: r */
    public static final cy f3139r;

    /* JADX INFO: renamed from: s */
    public static final cy f3140s;

    /* JADX INFO: renamed from: t */
    public static final cy f3141t;

    /* JADX INFO: renamed from: u */
    private static cz<BitSet> f3142u = null;

    /* JADX INFO: renamed from: v */
    public static final cy f3143v;

    /* JADX INFO: renamed from: w */
    private static cz<Number> f3144w = null;

    /* JADX INFO: renamed from: x */
    private static cz<Class> f3145x = null;

    /* JADX INFO: renamed from: y */
    private static cz<Boolean> f3146y = null;

    /* JADX INFO: renamed from: z */
    private static cz<Number> f3147z = null;

    /* JADX INFO: renamed from: com.facetec.sdk.eb$1 */
    final class AnonymousClass1 extends cz<Number> {
        AnonymousClass1() {
        }

        private static Number Z(ei eiVar) throws IOException {
            if (eiVar.D() == el.NULL) {
                eiVar.S();
                return null;
            }
            try {
                return Long.valueOf(eiVar.a());
            } catch (NumberFormatException e2) {
                throw new da(e2);
            }
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, Number number) throws IOException {
            ekVar.I(number);
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ Number V(ei eiVar) throws IOException {
            return Z(eiVar);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$10 */
    final class AnonymousClass10 extends cz<String> {
        AnonymousClass10() {
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, String str) throws IOException {
            ekVar.V(str);
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ String V(ei eiVar) throws IOException {
            el elVarD = eiVar.D();
            if (elVarD != el.NULL) {
                return elVarD == el.BOOLEAN ? Boolean.toString(eiVar.F()) : eiVar.L();
            }
            eiVar.S();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$11 */
    final class AnonymousClass11 extends cz<URI> {
        AnonymousClass11() {
        }

        private static URI I(ei eiVar) throws IOException {
            if (eiVar.D() == el.NULL) {
                eiVar.S();
                return null;
            }
            try {
                String strL = eiVar.L();
                if ("null".equals(strL)) {
                    return null;
                }
                return new URI(strL);
            } catch (URISyntaxException e2) {
                throw new cu(e2);
            }
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, URI uri) throws IOException {
            URI uri2 = uri;
            ekVar.V(uri2 == null ? null : uri2.toASCIIString());
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ URI V(ei eiVar) throws IOException {
            return I(eiVar);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$12 */
    final class AnonymousClass12 extends cz<BitSet> {
        AnonymousClass12() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0038  */
        /* JADX WARN: Type inference failed for: r0v11, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.String] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.util.BitSet Code(com.facetec.sdk.ei r7) throws java.io.IOException {
            /*
                java.util.BitSet r6 = new java.util.BitSet
                r6.<init>()
                r7.I()
                com.facetec.sdk.el r5 = r7.D()
                r4 = 0
                r3 = r4
            Le:
                com.facetec.sdk.el r0 = com.facetec.sdk.el.END_ARRAY
                if (r5 == r0) goto L68
                int[] r1 = com.facetec.sdk.eb.AnonymousClass30.V
                int r0 = r5.ordinal()
                r2 = r1[r0]
                r1 = 1
                if (r2 == r1) goto L31
                r0 = 2
                if (r2 == r0) goto L2c
                r0 = 3
                if (r2 != r0) goto L58
                java.lang.String r0 = r7.L()
                int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L48
                goto L3a
            L2c:
                boolean r1 = r7.F()
                goto L3c
            L31:
                int r0 = r7.b()
                if (r0 == 0) goto L38
                goto L3c
            L38:
                r1 = r4
                goto L3c
            L3a:
                if (r0 == 0) goto L38
            L3c:
                if (r1 == 0) goto L41
                r6.set(r3)
            L41:
                int r3 = r3 + 1
                com.facetec.sdk.el r5 = r7.D()
                goto Le
            L48:
                com.facetec.sdk.da r2 = new com.facetec.sdk.da
                java.lang.String r1 = "Error: Expecting: bitset number value (1, 0), Found: "
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.String r0 = r1.concat(r0)
                r2.<init>(r0)
                throw r2
            L58:
                com.facetec.sdk.da r2 = new com.facetec.sdk.da
                java.lang.String r1 = "Invalid bitset value type: "
                java.lang.String r0 = java.lang.String.valueOf(r5)
                java.lang.String r0 = r1.concat(r0)
                r2.<init>(r0)
                throw r2
            L68:
                r7.B()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.eb.AnonymousClass12.Code(com.facetec.sdk.ei):java.util.BitSet");
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, BitSet bitSet) throws IOException {
            BitSet bitSet2 = bitSet;
            ekVar.V();
            int length = bitSet2.length();
            for (int i2 = 0; i2 < length; i2++) {
                ekVar.Z(bitSet2.get(i2) ? 1L : 0L);
            }
            ekVar.Z();
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ BitSet V(ei eiVar) throws IOException {
            return Code(eiVar);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$13 */
    final class AnonymousClass13 extends cz<StringBuffer> {
        AnonymousClass13() {
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, StringBuffer stringBuffer) throws IOException {
            StringBuffer stringBuffer2 = stringBuffer;
            ekVar.V(stringBuffer2 == null ? null : stringBuffer2.toString());
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ StringBuffer V(ei eiVar) throws IOException {
            if (eiVar.D() != el.NULL) {
                return new StringBuffer(eiVar.L());
            }
            eiVar.S();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$14 */
    final class AnonymousClass14 extends cz<URL> {
        AnonymousClass14() {
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, URL url) throws IOException {
            URL url2 = url;
            ekVar.V(url2 == null ? null : url2.toExternalForm());
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ URL V(ei eiVar) throws IOException {
            if (eiVar.D() == el.NULL) {
                eiVar.S();
                return null;
            }
            String strL = eiVar.L();
            if ("null".equals(strL)) {
                return null;
            }
            return new URL(strL);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$15 */
    final class AnonymousClass15 extends cz<StringBuilder> {
        AnonymousClass15() {
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, StringBuilder sb) throws IOException {
            StringBuilder sb2 = sb;
            ekVar.V(sb2 == null ? null : sb2.toString());
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ StringBuilder V(ei eiVar) throws IOException {
            if (eiVar.D() != el.NULL) {
                return new StringBuilder(eiVar.L());
            }
            eiVar.S();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$16 */
    final class AnonymousClass16 extends cz<InetAddress> {
        AnonymousClass16() {
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, InetAddress inetAddress) throws IOException {
            InetAddress inetAddress2 = inetAddress;
            ekVar.V(inetAddress2 == null ? null : inetAddress2.getHostAddress());
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ InetAddress V(ei eiVar) throws IOException {
            if (eiVar.D() != el.NULL) {
                return InetAddress.getByName(eiVar.L());
            }
            eiVar.S();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$17 */
    final class AnonymousClass17 extends cz<Currency> {
        AnonymousClass17() {
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, Currency currency) throws IOException {
            ekVar.V(currency.getCurrencyCode());
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ Currency V(ei eiVar) throws IOException {
            return Currency.getInstance(eiVar.L());
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$18 */
    final class AnonymousClass18 implements cy {

        /* JADX INFO: renamed from: com.facetec.sdk.eb$18$4 */
        final class AnonymousClass4 extends cz<Timestamp> {
            AnonymousClass4() {
            }

            @Override // com.facetec.sdk.cz
            public final /* bridge */ /* synthetic */ void B(ek ekVar, Timestamp timestamp) throws IOException {
                czVar.B(ekVar, timestamp);
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ Timestamp V(ei eiVar) throws IOException {
                Date date = (Date) czVar.V(eiVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }
        }

        AnonymousClass18() {
        }

        @Override // com.facetec.sdk.cy
        public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
            if (efVar.Z() != Timestamp.class) {
                return null;
            }
            return new cz<Timestamp>() { // from class: com.facetec.sdk.eb.18.4
                AnonymousClass4() {
                }

                @Override // com.facetec.sdk.cz
                public final /* bridge */ /* synthetic */ void B(ek ekVar, Timestamp timestamp) throws IOException {
                    czVar.B(ekVar, timestamp);
                }

                @Override // com.facetec.sdk.cz
                public final /* synthetic */ Timestamp V(ei eiVar) throws IOException {
                    Date date = (Date) czVar.V(eiVar);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }
            };
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$19 */
    final class AnonymousClass19 extends cz<Calendar> {
        AnonymousClass19() {
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, Calendar calendar) throws IOException {
            if (calendar == null) {
                ekVar.F();
                return;
            }
            ekVar.I();
            ekVar.Code("year");
            ekVar.Z(r4.get(1));
            ekVar.Code("month");
            ekVar.Z(r4.get(2));
            ekVar.Code("dayOfMonth");
            ekVar.Z(r4.get(5));
            ekVar.Code("hourOfDay");
            ekVar.Z(r4.get(11));
            ekVar.Code("minute");
            ekVar.Z(r4.get(12));
            ekVar.Code("second");
            ekVar.Z(r4.get(13));
            ekVar.B();
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ Calendar V(ei eiVar) throws IOException {
            if (eiVar.D() == el.NULL) {
                eiVar.S();
                return null;
            }
            eiVar.Code();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (eiVar.D() != el.END_OBJECT) {
                String strC = eiVar.C();
                int iB = eiVar.b();
                if ("year".equals(strC)) {
                    i2 = iB;
                } else if ("month".equals(strC)) {
                    i3 = iB;
                } else if ("dayOfMonth".equals(strC)) {
                    i4 = iB;
                } else if ("hourOfDay".equals(strC)) {
                    i5 = iB;
                } else if ("minute".equals(strC)) {
                    i6 = iB;
                } else if ("second".equals(strC)) {
                    i7 = iB;
                }
            }
            eiVar.Z();
            return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$2 */
    final class AnonymousClass2 extends cz<Number> {
        AnonymousClass2() {
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, Number number) throws IOException {
            ekVar.I(number);
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ Number V(ei eiVar) throws IOException {
            if (eiVar.D() != el.NULL) {
                return Float.valueOf((float) eiVar.c());
            }
            eiVar.S();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$20 */
    final class AnonymousClass20 extends cz<UUID> {
        AnonymousClass20() {
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, UUID uuid) throws IOException {
            UUID uuid2 = uuid;
            ekVar.V(uuid2 == null ? null : uuid2.toString());
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ UUID V(ei eiVar) throws IOException {
            if (eiVar.D() != el.NULL) {
                return UUID.fromString(eiVar.L());
            }
            eiVar.S();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$21 */
    final class AnonymousClass21 extends cz<Locale> {
        AnonymousClass21() {
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, Locale locale) throws IOException {
            Locale locale2 = locale;
            ekVar.V(locale2 == null ? null : locale2.toString());
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ Locale V(ei eiVar) throws IOException {
            if (eiVar.D() == el.NULL) {
                eiVar.S();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(eiVar.L(), Global.UNDERSCORE);
            String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$22 */
    final class AnonymousClass22 implements cy {
        private /* synthetic */ cz B;
        private /* synthetic */ Class Z;

        AnonymousClass22(Class cls, cz czVar) {
            cls = cls;
            czVar = czVar;
        }

        @Override // com.facetec.sdk.cy
        public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
            if (efVar.Z() == cls) {
                return czVar;
            }
            return null;
        }

        public final String toString() {
            return new StringBuilder("Factory[type=").append(cls.getName()).append(",adapter=").append(czVar).append("]").toString();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$23 */
    final class AnonymousClass23 extends cz<Boolean> {
        AnonymousClass23() {
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, Boolean bool) throws IOException {
            ekVar.V(bool);
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ Boolean V(ei eiVar) throws IOException {
            el elVarD = eiVar.D();
            if (elVarD != el.NULL) {
                return elVarD == el.STRING ? Boolean.valueOf(Boolean.parseBoolean(eiVar.L())) : Boolean.valueOf(eiVar.F());
            }
            eiVar.S();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$24 */
    final class AnonymousClass24 implements cy {
        AnonymousClass24() {
        }

        @Override // com.facetec.sdk.cy
        public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
            Class<? super T> clsZ = efVar.Z();
            if (!Enum.class.isAssignableFrom(clsZ) || clsZ == Enum.class) {
                return null;
            }
            if (!clsZ.isEnum()) {
                clsZ = clsZ.getSuperclass();
            }
            return new I(clsZ);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$25 */
    final class AnonymousClass25 extends cz<cm> {
        AnonymousClass25() {
        }

        @Override // com.facetec.sdk.cz
        /* JADX INFO: renamed from: Code */
        public void B(ek ekVar, cm cmVar) throws IOException {
            if (cmVar == null || cmVar.S()) {
                ekVar.F();
                return;
            }
            if (cmVar.F()) {
                ct ctVarD = cmVar.d();
                if (ctVarD.a()) {
                    ekVar.I(ctVarD.Code());
                    return;
                } else if (ctVarD.c()) {
                    ekVar.I(ctVarD.L());
                    return;
                } else {
                    ekVar.V(ctVarD.V());
                    return;
                }
            }
            if (cmVar.C()) {
                ekVar.V();
                if (!cmVar.C()) {
                    throw new IllegalStateException("Not a JSON Array: ".concat(String.valueOf(cmVar)));
                }
                Iterator<cm> it = ((co) cmVar).iterator();
                while (it.hasNext()) {
                    B(ekVar, it.next());
                }
                ekVar.Z();
                return;
            }
            if (!cmVar.D()) {
                throw new IllegalArgumentException(new StringBuilder("Couldn't write ").append(cmVar.getClass()).toString());
            }
            ekVar.I();
            if (!cmVar.D()) {
                throw new IllegalStateException("Not a JSON Object: ".concat(String.valueOf(cmVar)));
            }
            for (Map.Entry<String, cm> entry : ((cv) cmVar).e()) {
                ekVar.Code(entry.getKey());
                B(ekVar, entry.getValue());
            }
            ekVar.B();
        }

        @Override // com.facetec.sdk.cz
        /* JADX INFO: renamed from: I */
        public cm V(ei eiVar) throws IOException {
            switch (AnonymousClass30.V[eiVar.D().ordinal()]) {
                case 1:
                    return new ct(new dl(eiVar.L()));
                case 2:
                    return new ct(Boolean.valueOf(eiVar.F()));
                case 3:
                    return new ct(eiVar.L());
                case 4:
                    eiVar.S();
                    return cs.I;
                case 5:
                    co coVar = new co();
                    eiVar.I();
                    while (eiVar.V()) {
                        coVar.B(V(eiVar));
                    }
                    eiVar.B();
                    return coVar;
                case 6:
                    cv cvVar = new cv();
                    eiVar.Code();
                    while (eiVar.V()) {
                        cvVar.I(eiVar.C(), V(eiVar));
                    }
                    eiVar.Z();
                    return cvVar;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$26 */
    final class AnonymousClass26 implements cy {
        private /* synthetic */ Class B;
        private /* synthetic */ cz Code;
        private /* synthetic */ Class I;

        AnonymousClass26(Class cls, Class cls2, cz czVar) {
            cls = cls;
            cls = cls2;
            czVar = czVar;
        }

        @Override // com.facetec.sdk.cy
        public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
            Class<? super T> clsZ = efVar.Z();
            if (clsZ == cls || clsZ == cls) {
                return czVar;
            }
            return null;
        }

        public final String toString() {
            return new StringBuilder("Factory[type=").append(cls.getName()).append("+").append(cls.getName()).append(",adapter=").append(czVar).append("]").toString();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$27 */
    final class AnonymousClass27 extends cz<Boolean> {
        AnonymousClass27() {
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, Boolean bool) throws IOException {
            Boolean bool2 = bool;
            ekVar.V(bool2 == null ? "null" : bool2.toString());
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ Boolean V(ei eiVar) throws IOException {
            if (eiVar.D() != el.NULL) {
                return Boolean.valueOf(eiVar.L());
            }
            eiVar.S();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$28 */
    final class AnonymousClass28 implements cy {
        private /* synthetic */ Class B;
        final /* synthetic */ cz V;

        /* JADX INFO: renamed from: com.facetec.sdk.eb$28$5 */
        final class AnonymousClass5<T1> extends cz<T1> {
            private /* synthetic */ Class Z;

            AnonymousClass5(Class cls) {
                cls = cls;
            }

            @Override // com.facetec.sdk.cz
            public final void B(ek ekVar, T1 t1) throws IOException {
                czVar.B(ekVar, t1);
            }

            @Override // com.facetec.sdk.cz
            public final T1 V(ei eiVar) throws IOException {
                T1 t1 = (T1) czVar.V(eiVar);
                if (t1 == null || cls.isInstance(t1)) {
                    return t1;
                }
                throw new da(new StringBuilder("Expected a ").append(cls.getName()).append(" but was ").append(t1.getClass().getName()).toString());
            }
        }

        AnonymousClass28(Class cls, cz czVar) {
            cls = cls;
            czVar = czVar;
        }

        @Override // com.facetec.sdk.cy
        public final <T2> cz<T2> V(ck ckVar, ef<T2> efVar) {
            Class<? super T2> clsZ = efVar.Z();
            if (cls.isAssignableFrom(clsZ)) {
                return new cz<T1>() { // from class: com.facetec.sdk.eb.28.5
                    private /* synthetic */ Class Z;

                    AnonymousClass5(Class clsZ2) {
                        cls = clsZ2;
                    }

                    @Override // com.facetec.sdk.cz
                    public final void B(ek ekVar, T1 t1) throws IOException {
                        czVar.B(ekVar, t1);
                    }

                    @Override // com.facetec.sdk.cz
                    public final T1 V(ei eiVar) throws IOException {
                        T1 t1 = (T1) czVar.V(eiVar);
                        if (t1 == null || cls.isInstance(t1)) {
                            return t1;
                        }
                        throw new da(new StringBuilder("Expected a ").append(cls.getName()).append(" but was ").append(t1.getClass().getName()).toString());
                    }
                };
            }
            return null;
        }

        public final String toString() {
            return new StringBuilder("Factory[typeHierarchy=").append(cls.getName()).append(",adapter=").append(czVar).append("]").toString();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$29 */
    final class AnonymousClass29 implements cy {
        private /* synthetic */ Class Code;
        private /* synthetic */ cz V;
        private /* synthetic */ Class Z;

        AnonymousClass29(Class cls, Class cls2, cz czVar) {
            cls = cls;
            cls = cls2;
            czVar = czVar;
        }

        @Override // com.facetec.sdk.cy
        public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
            Class<? super T> clsZ = efVar.Z();
            if (clsZ == cls || clsZ == cls) {
                return czVar;
            }
            return null;
        }

        public final String toString() {
            return new StringBuilder("Factory[type=").append(cls.getName()).append("+").append(cls.getName()).append(",adapter=").append(czVar).append("]").toString();
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$3 */
    final class AnonymousClass3 extends cz<Number> {
        AnonymousClass3() {
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, Number number) throws IOException {
            ekVar.I(number);
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ Number V(ei eiVar) throws IOException {
            if (eiVar.D() != el.NULL) {
                return Double.valueOf(eiVar.c());
            }
            eiVar.S();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$30 */
    static /* synthetic */ class AnonymousClass30 {
        static final /* synthetic */ int[] V;

        static {
            int[] iArr = new int[el.values().length];
            V = iArr;
            try {
                iArr[el.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                V[el.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                V[el.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                V[el.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                V[el.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                V[el.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                V[el.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                V[el.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                V[el.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                V[el.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$31 */
    final class AnonymousClass31 extends cz<Number> {
        AnonymousClass31() {
        }

        private static Number Code(ei eiVar) throws IOException {
            if (eiVar.D() == el.NULL) {
                eiVar.S();
                return null;
            }
            try {
                return Byte.valueOf((byte) eiVar.b());
            } catch (NumberFormatException e2) {
                throw new da(e2);
            }
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, Number number) throws IOException {
            ekVar.I(number);
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ Number V(ei eiVar) throws IOException {
            return Code(eiVar);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$32 */
    final class AnonymousClass32 extends cz<AtomicInteger> {
        AnonymousClass32() {
        }

        private static AtomicInteger I(ei eiVar) throws IOException {
            try {
                return new AtomicInteger(eiVar.b());
            } catch (NumberFormatException e2) {
                throw new da(e2);
            }
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, AtomicInteger atomicInteger) throws IOException {
            ekVar.Z(atomicInteger.get());
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ AtomicInteger V(ei eiVar) throws IOException {
            return I(eiVar);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$33 */
    final class AnonymousClass33 extends cz<Number> {
        AnonymousClass33() {
        }

        private static Number I(ei eiVar) throws IOException {
            if (eiVar.D() == el.NULL) {
                eiVar.S();
                return null;
            }
            try {
                return Integer.valueOf(eiVar.b());
            } catch (NumberFormatException e2) {
                throw new da(e2);
            }
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, Number number) throws IOException {
            ekVar.I(number);
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ Number V(ei eiVar) throws IOException {
            return I(eiVar);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$34 */
    final class AnonymousClass34 extends cz<AtomicBoolean> {
        AnonymousClass34() {
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, AtomicBoolean atomicBoolean) throws IOException {
            ekVar.I(atomicBoolean.get());
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ AtomicBoolean V(ei eiVar) throws IOException {
            return new AtomicBoolean(eiVar.F());
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$35 */
    final class AnonymousClass35 extends cz<Number> {
        AnonymousClass35() {
        }

        private static Number I(ei eiVar) throws IOException {
            if (eiVar.D() == el.NULL) {
                eiVar.S();
                return null;
            }
            try {
                return Short.valueOf((short) eiVar.b());
            } catch (NumberFormatException e2) {
                throw new da(e2);
            }
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, Number number) throws IOException {
            ekVar.I(number);
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ Number V(ei eiVar) throws IOException {
            return I(eiVar);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$4 */
    final class AnonymousClass4 extends cz<AtomicIntegerArray> {
        AnonymousClass4() {
        }

        private static AtomicIntegerArray I(ei eiVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            eiVar.I();
            while (eiVar.V()) {
                try {
                    arrayList.add(Integer.valueOf(eiVar.b()));
                } catch (NumberFormatException e2) {
                    throw new da(e2);
                }
            }
            eiVar.B();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i2 = 0; i2 < size; i2++) {
                atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
            ekVar.V();
            int length = atomicIntegerArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                ekVar.Z(r6.get(i2));
            }
            ekVar.Z();
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ AtomicIntegerArray V(ei eiVar) throws IOException {
            return I(eiVar);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$5 */
    final class AnonymousClass5 extends cz<Class> {
        AnonymousClass5() {
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, Class cls) throws IOException {
            throw new UnsupportedOperationException(new StringBuilder("Attempted to serialize java.lang.Class: ").append(cls.getName()).append(". Forgot to register a type adapter?").toString());
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ Class V(ei eiVar) throws IOException {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$6 */
    final class AnonymousClass6 extends cz<Number> {
        AnonymousClass6() {
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, Number number) throws IOException {
            ekVar.I(number);
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ Number V(ei eiVar) throws IOException {
            el elVarD = eiVar.D();
            int i2 = AnonymousClass30.V[elVarD.ordinal()];
            if (i2 == 1 || i2 == 3) {
                return new dl(eiVar.L());
            }
            if (i2 != 4) {
                throw new da("Expecting number, got: ".concat(String.valueOf(elVarD)));
            }
            eiVar.S();
            return null;
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$7 */
    final class AnonymousClass7 extends cz<BigInteger> {
        AnonymousClass7() {
        }

        private static BigInteger I(ei eiVar) throws IOException {
            if (eiVar.D() == el.NULL) {
                eiVar.S();
                return null;
            }
            try {
                return new BigInteger(eiVar.L());
            } catch (NumberFormatException e2) {
                throw new da(e2);
            }
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, BigInteger bigInteger) throws IOException {
            ekVar.I(bigInteger);
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ BigInteger V(ei eiVar) throws IOException {
            return I(eiVar);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$8 */
    final class AnonymousClass8 extends cz<BigDecimal> {
        AnonymousClass8() {
        }

        private static BigDecimal Code(ei eiVar) throws IOException {
            if (eiVar.D() == el.NULL) {
                eiVar.S();
                return null;
            }
            try {
                return new BigDecimal(eiVar.L());
            } catch (NumberFormatException e2) {
                throw new da(e2);
            }
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, BigDecimal bigDecimal) throws IOException {
            ekVar.I(bigDecimal);
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ BigDecimal V(ei eiVar) throws IOException {
            return Code(eiVar);
        }
    }

    /* JADX INFO: renamed from: com.facetec.sdk.eb$9 */
    final class AnonymousClass9 extends cz<Character> {
        AnonymousClass9() {
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, Character ch) throws IOException {
            Character ch2 = ch;
            ekVar.V(ch2 == null ? null : String.valueOf(ch2));
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ Character V(ei eiVar) throws IOException {
            if (eiVar.D() == el.NULL) {
                eiVar.S();
                return null;
            }
            String strL = eiVar.L();
            if (strL.length() == 1) {
                return Character.valueOf(strL.charAt(0));
            }
            throw new da("Expecting character, got: ".concat(String.valueOf(strL)));
        }
    }

    static final class I<T extends Enum<T>> extends cz<T> {
        private final Map<String, T> Z = new HashMap();
        private final Map<T, String> Code = new HashMap();

        public I(Class<T> cls) {
            try {
                for (T t2 : cls.getEnumConstants()) {
                    String strName = t2.name();
                    db dbVar = (db) Kl.qd(cls.getField(strName), db.class);
                    if (dbVar != null) {
                        strName = dbVar.B();
                        for (String str : dbVar.V()) {
                            this.Z.put(str, t2);
                        }
                    }
                    this.Z.put(strName, t2);
                    this.Code.put(t2, strName);
                }
            } catch (NoSuchFieldException e2) {
                throw new AssertionError(e2);
            }
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ void B(ek ekVar, Object obj) throws IOException {
            Enum r3 = (Enum) obj;
            ekVar.V(r3 == null ? null : this.Code.get(r3));
        }

        @Override // com.facetec.sdk.cz
        public final /* synthetic */ Object V(ei eiVar) throws IOException {
            if (eiVar.D() != el.NULL) {
                return this.Z.get(eiVar.L());
            }
            eiVar.S();
            return null;
        }
    }

    static {
        cz<Class> czVarCode = new cz<Class>() { // from class: com.facetec.sdk.eb.5
            AnonymousClass5() {
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, Class cls) throws IOException {
                throw new UnsupportedOperationException(new StringBuilder("Attempted to serialize java.lang.Class: ").append(cls.getName()).append(". Forgot to register a type adapter?").toString());
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ Class V(ei eiVar) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }
        }.Code();
        f3145x = czVarCode;
        B = V(Class.class, czVarCode);
        cz<BitSet> czVarCode2 = new cz<BitSet>() { // from class: com.facetec.sdk.eb.12
            AnonymousClass12() {
            }

            private static BitSet Code(ei v2) throws IOException {
                /*
                    java.util.BitSet r6 = new java.util.BitSet
                    r6.<init>()
                    r7.I()
                    com.facetec.sdk.el r5 = r7.D()
                    r4 = 0
                    r3 = r4
                Le:
                    com.facetec.sdk.el r0 = com.facetec.sdk.el.END_ARRAY
                    if (r5 == r0) goto L68
                    int[] r1 = com.facetec.sdk.eb.AnonymousClass30.V
                    int r0 = r5.ordinal()
                    r2 = r1[r0]
                    r1 = 1
                    if (r2 == r1) goto L31
                    r0 = 2
                    if (r2 == r0) goto L2c
                    r0 = 3
                    if (r2 != r0) goto L58
                    java.lang.String r0 = r7.L()
                    int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L48
                    goto L3a
                L2c:
                    boolean r1 = r7.F()
                    goto L3c
                L31:
                    int r0 = r7.b()
                    if (r0 == 0) goto L38
                    goto L3c
                L38:
                    r1 = r4
                    goto L3c
                L3a:
                    if (r0 == 0) goto L38
                L3c:
                    if (r1 == 0) goto L41
                    r6.set(r3)
                L41:
                    int r3 = r3 + 1
                    com.facetec.sdk.el r5 = r7.D()
                    goto Le
                L48:
                    com.facetec.sdk.da r2 = new com.facetec.sdk.da
                    java.lang.String r1 = "Error: Expecting: bitset number value (1, 0), Found: "
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    java.lang.String r0 = r1.concat(r0)
                    r2.<init>(r0)
                    throw r2
                L58:
                    com.facetec.sdk.da r2 = new com.facetec.sdk.da
                    java.lang.String r1 = "Invalid bitset value type: "
                    java.lang.String r0 = java.lang.String.valueOf(r5)
                    java.lang.String r0 = r1.concat(r0)
                    r2.<init>(r0)
                    throw r2
                L68:
                    r7.B()
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.eb.AnonymousClass12.Code(com.facetec.sdk.ei):java.util.BitSet");
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, BitSet bitSet) throws IOException {
                BitSet bitSet2 = bitSet;
                ekVar.V();
                int length = bitSet2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    ekVar.Z(bitSet2.get(i2) ? 1L : 0L);
                }
                ekVar.Z();
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ BitSet V(ei eiVar) throws IOException {
                return Code(eiVar);
            }
        }.Code();
        f3142u = czVarCode2;
        Code = V(BitSet.class, czVarCode2);
        f3146y = new cz<Boolean>() { // from class: com.facetec.sdk.eb.23
            AnonymousClass23() {
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, Boolean bool) throws IOException {
                ekVar.V(bool);
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ Boolean V(ei eiVar) throws IOException {
                el elVarD = eiVar.D();
                if (elVarD != el.NULL) {
                    return elVarD == el.STRING ? Boolean.valueOf(Boolean.parseBoolean(eiVar.L())) : Boolean.valueOf(eiVar.F());
                }
                eiVar.S();
                return null;
            }
        };
        I = new cz<Boolean>() { // from class: com.facetec.sdk.eb.27
            AnonymousClass27() {
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, Boolean bool) throws IOException {
                Boolean bool2 = bool;
                ekVar.V(bool2 == null ? "null" : bool2.toString());
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ Boolean V(ei eiVar) throws IOException {
                if (eiVar.D() != el.NULL) {
                    return Boolean.valueOf(eiVar.L());
                }
                eiVar.S();
                return null;
            }
        };
        V = Z(Boolean.TYPE, Boolean.class, f3146y);
        f3144w = new cz<Number>() { // from class: com.facetec.sdk.eb.31
            AnonymousClass31() {
            }

            private static Number Code(ei eiVar) throws IOException {
                if (eiVar.D() == el.NULL) {
                    eiVar.S();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) eiVar.b());
                } catch (NumberFormatException e2) {
                    throw new da(e2);
                }
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, Number number) throws IOException {
                ekVar.I(number);
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ Number V(ei eiVar) throws IOException {
                return Code(eiVar);
            }
        };
        Z = Z(Byte.TYPE, Byte.class, f3144w);
        E = new cz<Number>() { // from class: com.facetec.sdk.eb.35
            AnonymousClass35() {
            }

            private static Number I(ei eiVar) throws IOException {
                if (eiVar.D() == el.NULL) {
                    eiVar.S();
                    return null;
                }
                try {
                    return Short.valueOf((short) eiVar.b());
                } catch (NumberFormatException e2) {
                    throw new da(e2);
                }
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, Number number) throws IOException {
                ekVar.I(number);
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ Number V(ei eiVar) throws IOException {
                return I(eiVar);
            }
        };
        C = Z(Short.TYPE, Short.class, E);
        f3147z = new cz<Number>() { // from class: com.facetec.sdk.eb.33
            AnonymousClass33() {
            }

            private static Number I(ei eiVar) throws IOException {
                if (eiVar.D() == el.NULL) {
                    eiVar.S();
                    return null;
                }
                try {
                    return Integer.valueOf(eiVar.b());
                } catch (NumberFormatException e2) {
                    throw new da(e2);
                }
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, Number number) throws IOException {
                ekVar.I(number);
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ Number V(ei eiVar) throws IOException {
                return I(eiVar);
            }
        };
        D = Z(Integer.TYPE, Integer.class, f3147z);
        cz<AtomicInteger> czVarCode3 = new cz<AtomicInteger>() { // from class: com.facetec.sdk.eb.32
            AnonymousClass32() {
            }

            private static AtomicInteger I(ei eiVar) throws IOException {
                try {
                    return new AtomicInteger(eiVar.b());
                } catch (NumberFormatException e2) {
                    throw new da(e2);
                }
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, AtomicInteger atomicInteger) throws IOException {
                ekVar.Z(atomicInteger.get());
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ AtomicInteger V(ei eiVar) throws IOException {
                return I(eiVar);
            }
        }.Code();
        A = czVarCode3;
        L = V(AtomicInteger.class, czVarCode3);
        cz<AtomicBoolean> czVarCode4 = new cz<AtomicBoolean>() { // from class: com.facetec.sdk.eb.34
            AnonymousClass34() {
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, AtomicBoolean atomicBoolean) throws IOException {
                ekVar.I(atomicBoolean.get());
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ AtomicBoolean V(ei eiVar) throws IOException {
                return new AtomicBoolean(eiVar.F());
            }
        }.Code();
        H = czVarCode4;
        F = V(AtomicBoolean.class, czVarCode4);
        cz<AtomicIntegerArray> czVarCode5 = new cz<AtomicIntegerArray>() { // from class: com.facetec.sdk.eb.4
            AnonymousClass4() {
            }

            private static AtomicIntegerArray I(ei eiVar) throws IOException {
                ArrayList arrayList = new ArrayList();
                eiVar.I();
                while (eiVar.V()) {
                    try {
                        arrayList.add(Integer.valueOf(eiVar.b()));
                    } catch (NumberFormatException e2) {
                        throw new da(e2);
                    }
                }
                eiVar.B();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, AtomicIntegerArray atomicIntegerArray) throws IOException {
                ekVar.V();
                int length = atomicIntegerArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    ekVar.Z(r6.get(i2));
                }
                ekVar.Z();
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ AtomicIntegerArray V(ei eiVar) throws IOException {
                return I(eiVar);
            }
        }.Code();
        G = czVarCode5;
        S = V(AtomicIntegerArray.class, czVarCode5);
        f3122a = new cz<Number>() { // from class: com.facetec.sdk.eb.1
            AnonymousClass1() {
            }

            private static Number Z(ei eiVar) throws IOException {
                if (eiVar.D() == el.NULL) {
                    eiVar.S();
                    return null;
                }
                try {
                    return Long.valueOf(eiVar.a());
                } catch (NumberFormatException e2) {
                    throw new da(e2);
                }
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, Number number) throws IOException {
                ekVar.I(number);
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ Number V(ei eiVar) throws IOException {
                return Z(eiVar);
            }
        };
        f3126e = new cz<Number>() { // from class: com.facetec.sdk.eb.2
            AnonymousClass2() {
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, Number number) throws IOException {
                ekVar.I(number);
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ Number V(ei eiVar) throws IOException {
                if (eiVar.D() != el.NULL) {
                    return Float.valueOf((float) eiVar.c());
                }
                eiVar.S();
                return null;
            }
        };
        f3124c = new cz<Number>() { // from class: com.facetec.sdk.eb.3
            AnonymousClass3() {
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, Number number) throws IOException {
                ekVar.I(number);
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ Number V(ei eiVar) throws IOException {
                if (eiVar.D() != el.NULL) {
                    return Double.valueOf(eiVar.c());
                }
                eiVar.S();
                return null;
            }
        };
        AnonymousClass6 anonymousClass6 = new cz<Number>() { // from class: com.facetec.sdk.eb.6
            AnonymousClass6() {
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, Number number) throws IOException {
                ekVar.I(number);
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ Number V(ei eiVar) throws IOException {
                el elVarD = eiVar.D();
                int i2 = AnonymousClass30.V[elVarD.ordinal()];
                if (i2 == 1 || i2 == 3) {
                    return new dl(eiVar.L());
                }
                if (i2 != 4) {
                    throw new da("Expecting number, got: ".concat(String.valueOf(elVarD)));
                }
                eiVar.S();
                return null;
            }
        };
        K = anonymousClass6;
        f3125d = V(Number.class, anonymousClass6);
        M = new cz<Character>() { // from class: com.facetec.sdk.eb.9
            AnonymousClass9() {
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, Character ch) throws IOException {
                Character ch2 = ch;
                ekVar.V(ch2 == null ? null : String.valueOf(ch2));
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ Character V(ei eiVar) throws IOException {
                if (eiVar.D() == el.NULL) {
                    eiVar.S();
                    return null;
                }
                String strL = eiVar.L();
                if (strL.length() == 1) {
                    return Character.valueOf(strL.charAt(0));
                }
                throw new da("Expecting character, got: ".concat(String.valueOf(strL)));
            }
        };
        f3123b = Z(Character.TYPE, Character.class, M);
        N = new cz<String>() { // from class: com.facetec.sdk.eb.10
            AnonymousClass10() {
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, String str) throws IOException {
                ekVar.V(str);
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ String V(ei eiVar) throws IOException {
                el elVarD = eiVar.D();
                if (elVarD != el.NULL) {
                    return elVarD == el.BOOLEAN ? Boolean.toString(eiVar.F()) : eiVar.L();
                }
                eiVar.S();
                return null;
            }
        };
        f3131j = new cz<BigDecimal>() { // from class: com.facetec.sdk.eb.8
            AnonymousClass8() {
            }

            private static BigDecimal Code(ei eiVar) throws IOException {
                if (eiVar.D() == el.NULL) {
                    eiVar.S();
                    return null;
                }
                try {
                    return new BigDecimal(eiVar.L());
                } catch (NumberFormatException e2) {
                    throw new da(e2);
                }
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, BigDecimal bigDecimal) throws IOException {
                ekVar.I(bigDecimal);
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ BigDecimal V(ei eiVar) throws IOException {
                return Code(eiVar);
            }
        };
        f3130i = new cz<BigInteger>() { // from class: com.facetec.sdk.eb.7
            AnonymousClass7() {
            }

            private static BigInteger I(ei eiVar) throws IOException {
                if (eiVar.D() == el.NULL) {
                    eiVar.S();
                    return null;
                }
                try {
                    return new BigInteger(eiVar.L());
                } catch (NumberFormatException e2) {
                    throw new da(e2);
                }
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, BigInteger bigInteger) throws IOException {
                ekVar.I(bigInteger);
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ BigInteger V(ei eiVar) throws IOException {
                return I(eiVar);
            }
        };
        f3129h = V(String.class, N);
        AnonymousClass15 anonymousClass15 = new cz<StringBuilder>() { // from class: com.facetec.sdk.eb.15
            AnonymousClass15() {
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, StringBuilder sb) throws IOException {
                StringBuilder sb2 = sb;
                ekVar.V(sb2 == null ? null : sb2.toString());
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ StringBuilder V(ei eiVar) throws IOException {
                if (eiVar.D() != el.NULL) {
                    return new StringBuilder(eiVar.L());
                }
                eiVar.S();
                return null;
            }
        };
        J = anonymousClass15;
        f3127f = V(StringBuilder.class, anonymousClass15);
        AnonymousClass13 anonymousClass13 = new cz<StringBuffer>() { // from class: com.facetec.sdk.eb.13
            AnonymousClass13() {
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, StringBuffer stringBuffer) throws IOException {
                StringBuffer stringBuffer2 = stringBuffer;
                ekVar.V(stringBuffer2 == null ? null : stringBuffer2.toString());
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ StringBuffer V(ei eiVar) throws IOException {
                if (eiVar.D() != el.NULL) {
                    return new StringBuffer(eiVar.L());
                }
                eiVar.S();
                return null;
            }
        };
        O = anonymousClass13;
        f3128g = V(StringBuffer.class, anonymousClass13);
        AnonymousClass14 anonymousClass14 = new cz<URL>() { // from class: com.facetec.sdk.eb.14
            AnonymousClass14() {
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, URL url) throws IOException {
                URL url2 = url;
                ekVar.V(url2 == null ? null : url2.toExternalForm());
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ URL V(ei eiVar) throws IOException {
                if (eiVar.D() == el.NULL) {
                    eiVar.S();
                    return null;
                }
                String strL = eiVar.L();
                if ("null".equals(strL)) {
                    return null;
                }
                return new URL(strL);
            }
        };
        U = anonymousClass14;
        f3134m = V(URL.class, anonymousClass14);
        AnonymousClass11 anonymousClass11 = new cz<URI>() { // from class: com.facetec.sdk.eb.11
            AnonymousClass11() {
            }

            private static URI I(ei eiVar) throws IOException {
                if (eiVar.D() == el.NULL) {
                    eiVar.S();
                    return null;
                }
                try {
                    String strL = eiVar.L();
                    if ("null".equals(strL)) {
                        return null;
                    }
                    return new URI(strL);
                } catch (URISyntaxException e2) {
                    throw new cu(e2);
                }
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, URI uri) throws IOException {
                URI uri2 = uri;
                ekVar.V(uri2 == null ? null : uri2.toASCIIString());
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ URI V(ei eiVar) throws IOException {
                return I(eiVar);
            }
        };
        R = anonymousClass11;
        f3135n = V(URI.class, anonymousClass11);
        AnonymousClass16 anonymousClass16 = new cz<InetAddress>() { // from class: com.facetec.sdk.eb.16
            AnonymousClass16() {
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, InetAddress inetAddress) throws IOException {
                InetAddress inetAddress2 = inetAddress;
                ekVar.V(inetAddress2 == null ? null : inetAddress2.getHostAddress());
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ InetAddress V(ei eiVar) throws IOException {
                if (eiVar.D() != el.NULL) {
                    return InetAddress.getByName(eiVar.L());
                }
                eiVar.S();
                return null;
            }
        };
        P = anonymousClass16;
        f3132k = Z(InetAddress.class, anonymousClass16);
        AnonymousClass20 anonymousClass20 = new cz<UUID>() { // from class: com.facetec.sdk.eb.20
            AnonymousClass20() {
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, UUID uuid) throws IOException {
                UUID uuid2 = uuid;
                ekVar.V(uuid2 == null ? null : uuid2.toString());
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ UUID V(ei eiVar) throws IOException {
                if (eiVar.D() != el.NULL) {
                    return UUID.fromString(eiVar.L());
                }
                eiVar.S();
                return null;
            }
        };
        Q = anonymousClass20;
        f3136o = V(UUID.class, anonymousClass20);
        cz<Currency> czVarCode6 = new cz<Currency>() { // from class: com.facetec.sdk.eb.17
            AnonymousClass17() {
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, Currency currency) throws IOException {
                ekVar.V(currency.getCurrencyCode());
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ Currency V(ei eiVar) throws IOException {
                return Currency.getInstance(eiVar.L());
            }
        }.Code();
        T = czVarCode6;
        f3133l = V(Currency.class, czVarCode6);
        f3140s = new cy() { // from class: com.facetec.sdk.eb.18

            /* JADX INFO: renamed from: com.facetec.sdk.eb$18$4 */
            final class AnonymousClass4 extends cz<Timestamp> {
                AnonymousClass4() {
                }

                @Override // com.facetec.sdk.cz
                public final /* bridge */ /* synthetic */ void B(ek ekVar, Timestamp timestamp) throws IOException {
                    czVar.B(ekVar, timestamp);
                }

                @Override // com.facetec.sdk.cz
                public final /* synthetic */ Timestamp V(ei eiVar) throws IOException {
                    Date date = (Date) czVar.V(eiVar);
                    if (date != null) {
                        return new Timestamp(date.getTime());
                    }
                    return null;
                }
            }

            AnonymousClass18() {
            }

            @Override // com.facetec.sdk.cy
            public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
                if (efVar.Z() != Timestamp.class) {
                    return null;
                }
                return new cz<Timestamp>() { // from class: com.facetec.sdk.eb.18.4
                    AnonymousClass4() {
                    }

                    @Override // com.facetec.sdk.cz
                    public final /* bridge */ /* synthetic */ void B(ek ekVar, Timestamp timestamp) throws IOException {
                        czVar.B(ekVar, timestamp);
                    }

                    @Override // com.facetec.sdk.cz
                    public final /* synthetic */ Timestamp V(ei eiVar) throws IOException {
                        Date date = (Date) czVar.V(eiVar);
                        if (date != null) {
                            return new Timestamp(date.getTime());
                        }
                        return null;
                    }
                };
            }
        };
        AnonymousClass19 anonymousClass19 = new cz<Calendar>() { // from class: com.facetec.sdk.eb.19
            AnonymousClass19() {
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, Calendar calendar) throws IOException {
                if (calendar == null) {
                    ekVar.F();
                    return;
                }
                ekVar.I();
                ekVar.Code("year");
                ekVar.Z(r4.get(1));
                ekVar.Code("month");
                ekVar.Z(r4.get(2));
                ekVar.Code("dayOfMonth");
                ekVar.Z(r4.get(5));
                ekVar.Code("hourOfDay");
                ekVar.Z(r4.get(11));
                ekVar.Code("minute");
                ekVar.Z(r4.get(12));
                ekVar.Code("second");
                ekVar.Z(r4.get(13));
                ekVar.B();
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ Calendar V(ei eiVar) throws IOException {
                if (eiVar.D() == el.NULL) {
                    eiVar.S();
                    return null;
                }
                eiVar.Code();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (eiVar.D() != el.END_OBJECT) {
                    String strC = eiVar.C();
                    int iB = eiVar.b();
                    if ("year".equals(strC)) {
                        i2 = iB;
                    } else if ("month".equals(strC)) {
                        i3 = iB;
                    } else if ("dayOfMonth".equals(strC)) {
                        i4 = iB;
                    } else if ("hourOfDay".equals(strC)) {
                        i5 = iB;
                    } else if ("minute".equals(strC)) {
                        i6 = iB;
                    } else if ("second".equals(strC)) {
                        i7 = iB;
                    }
                }
                eiVar.Z();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            }
        };
        aa = anonymousClass19;
        f3139r = new cy() { // from class: com.facetec.sdk.eb.26
            private /* synthetic */ Class B;
            private /* synthetic */ cz Code;
            private /* synthetic */ Class I;

            AnonymousClass26(Class cls, Class cls2, cz anonymousClass192) {
                cls = cls;
                cls = cls2;
                czVar = anonymousClass192;
            }

            @Override // com.facetec.sdk.cy
            public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
                Class<? super T> clsZ = efVar.Z();
                if (clsZ == cls || clsZ == cls) {
                    return czVar;
                }
                return null;
            }

            public final String toString() {
                return new StringBuilder("Factory[type=").append(cls.getName()).append("+").append(cls.getName()).append(",adapter=").append(czVar).append("]").toString();
            }
        };
        AnonymousClass21 anonymousClass21 = new cz<Locale>() { // from class: com.facetec.sdk.eb.21
            AnonymousClass21() {
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ void B(ek ekVar, Locale locale) throws IOException {
                Locale locale2 = locale;
                ekVar.V(locale2 == null ? null : locale2.toString());
            }

            @Override // com.facetec.sdk.cz
            public final /* synthetic */ Locale V(ei eiVar) throws IOException {
                if (eiVar.D() == el.NULL) {
                    eiVar.S();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(eiVar.L(), Global.UNDERSCORE);
                String strNextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String strNextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (strNextToken2 == null && strNextToken3 == null) ? new Locale(strNextToken) : strNextToken3 == null ? new Locale(strNextToken, strNextToken2) : new Locale(strNextToken, strNextToken2, strNextToken3);
            }
        };
        W = anonymousClass21;
        f3141t = V(Locale.class, anonymousClass21);
        AnonymousClass25 anonymousClass25 = new cz<cm>() { // from class: com.facetec.sdk.eb.25
            AnonymousClass25() {
            }

            @Override // com.facetec.sdk.cz
            /* JADX INFO: renamed from: Code */
            public void B(ek ekVar, cm cmVar) throws IOException {
                if (cmVar == null || cmVar.S()) {
                    ekVar.F();
                    return;
                }
                if (cmVar.F()) {
                    ct ctVarD = cmVar.d();
                    if (ctVarD.a()) {
                        ekVar.I(ctVarD.Code());
                        return;
                    } else if (ctVarD.c()) {
                        ekVar.I(ctVarD.L());
                        return;
                    } else {
                        ekVar.V(ctVarD.V());
                        return;
                    }
                }
                if (cmVar.C()) {
                    ekVar.V();
                    if (!cmVar.C()) {
                        throw new IllegalStateException("Not a JSON Array: ".concat(String.valueOf(cmVar)));
                    }
                    Iterator<cm> it = ((co) cmVar).iterator();
                    while (it.hasNext()) {
                        B(ekVar, it.next());
                    }
                    ekVar.Z();
                    return;
                }
                if (!cmVar.D()) {
                    throw new IllegalArgumentException(new StringBuilder("Couldn't write ").append(cmVar.getClass()).toString());
                }
                ekVar.I();
                if (!cmVar.D()) {
                    throw new IllegalStateException("Not a JSON Object: ".concat(String.valueOf(cmVar)));
                }
                for (Map.Entry<String, cm> entry : ((cv) cmVar).e()) {
                    ekVar.Code(entry.getKey());
                    B(ekVar, entry.getValue());
                }
                ekVar.B();
            }

            @Override // com.facetec.sdk.cz
            /* JADX INFO: renamed from: I */
            public cm V(ei eiVar) throws IOException {
                switch (AnonymousClass30.V[eiVar.D().ordinal()]) {
                    case 1:
                        return new ct(new dl(eiVar.L()));
                    case 2:
                        return new ct(Boolean.valueOf(eiVar.F()));
                    case 3:
                        return new ct(eiVar.L());
                    case 4:
                        eiVar.S();
                        return cs.I;
                    case 5:
                        co coVar = new co();
                        eiVar.I();
                        while (eiVar.V()) {
                            coVar.B(V(eiVar));
                        }
                        eiVar.B();
                        return coVar;
                    case 6:
                        cv cvVar = new cv();
                        eiVar.Code();
                        while (eiVar.V()) {
                            cvVar.I(eiVar.C(), V(eiVar));
                        }
                        eiVar.Z();
                        return cvVar;
                    default:
                        throw new IllegalArgumentException();
                }
            }
        };
        f3138q = anonymousClass25;
        f3137p = Z(cm.class, anonymousClass25);
        f3143v = new cy() { // from class: com.facetec.sdk.eb.24
            AnonymousClass24() {
            }

            @Override // com.facetec.sdk.cy
            public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
                Class<? super T> clsZ = efVar.Z();
                if (!Enum.class.isAssignableFrom(clsZ) || clsZ == Enum.class) {
                    return null;
                }
                if (!clsZ.isEnum()) {
                    clsZ = clsZ.getSuperclass();
                }
                return new I(clsZ);
            }
        };
    }

    public static <TT> cy V(Class<TT> cls, cz<TT> czVar) {
        return new cy() { // from class: com.facetec.sdk.eb.22
            private /* synthetic */ cz B;
            private /* synthetic */ Class Z;

            AnonymousClass22(Class cls2, cz czVar2) {
                cls = cls2;
                czVar = czVar2;
            }

            @Override // com.facetec.sdk.cy
            public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
                if (efVar.Z() == cls) {
                    return czVar;
                }
                return null;
            }

            public final String toString() {
                return new StringBuilder("Factory[type=").append(cls.getName()).append(",adapter=").append(czVar).append("]").toString();
            }
        };
    }

    private static <T1> cy Z(Class<T1> cls, cz<T1> czVar) {
        return new cy() { // from class: com.facetec.sdk.eb.28
            private /* synthetic */ Class B;
            final /* synthetic */ cz V;

            /* JADX INFO: renamed from: com.facetec.sdk.eb$28$5 */
            final class AnonymousClass5<T1> extends cz<T1> {
                private /* synthetic */ Class Z;

                AnonymousClass5(Class clsZ2) {
                    cls = clsZ2;
                }

                @Override // com.facetec.sdk.cz
                public final void B(ek ekVar, T1 t1) throws IOException {
                    czVar.B(ekVar, t1);
                }

                @Override // com.facetec.sdk.cz
                public final T1 V(ei eiVar) throws IOException {
                    T1 t1 = (T1) czVar.V(eiVar);
                    if (t1 == null || cls.isInstance(t1)) {
                        return t1;
                    }
                    throw new da(new StringBuilder("Expected a ").append(cls.getName()).append(" but was ").append(t1.getClass().getName()).toString());
                }
            }

            AnonymousClass28(Class cls2, cz czVar2) {
                cls = cls2;
                czVar = czVar2;
            }

            @Override // com.facetec.sdk.cy
            public final <T2> cz<T2> V(ck ckVar, ef<T2> efVar) {
                Class clsZ2 = efVar.Z();
                if (cls.isAssignableFrom(clsZ2)) {
                    return new cz<T1>() { // from class: com.facetec.sdk.eb.28.5
                        private /* synthetic */ Class Z;

                        AnonymousClass5(Class clsZ22) {
                            cls = clsZ22;
                        }

                        @Override // com.facetec.sdk.cz
                        public final void B(ek ekVar, T1 t1) throws IOException {
                            czVar.B(ekVar, t1);
                        }

                        @Override // com.facetec.sdk.cz
                        public final T1 V(ei eiVar) throws IOException {
                            T1 t1 = (T1) czVar.V(eiVar);
                            if (t1 == null || cls.isInstance(t1)) {
                                return t1;
                            }
                            throw new da(new StringBuilder("Expected a ").append(cls.getName()).append(" but was ").append(t1.getClass().getName()).toString());
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return new StringBuilder("Factory[typeHierarchy=").append(cls.getName()).append(",adapter=").append(czVar).append("]").toString();
            }
        };
    }

    public static <TT> cy Z(Class<TT> cls, Class<TT> cls2, cz<? super TT> czVar) {
        return new cy() { // from class: com.facetec.sdk.eb.29
            private /* synthetic */ Class Code;
            private /* synthetic */ cz V;
            private /* synthetic */ Class Z;

            AnonymousClass29(Class cls3, Class cls22, cz czVar2) {
                cls = cls3;
                cls = cls22;
                czVar = czVar2;
            }

            @Override // com.facetec.sdk.cy
            public final <T> cz<T> V(ck ckVar, ef<T> efVar) {
                Class<? super T> clsZ = efVar.Z();
                if (clsZ == cls || clsZ == cls) {
                    return czVar;
                }
                return null;
            }

            public final String toString() {
                return new StringBuilder("Factory[type=").append(cls.getName()).append("+").append(cls.getName()).append(",adapter=").append(czVar).append("]").toString();
            }
        };
    }
}
