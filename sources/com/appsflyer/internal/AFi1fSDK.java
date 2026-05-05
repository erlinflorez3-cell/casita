package com.appsflyer.internal;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.drew.metadata.photoshop.PhotoshopDirectory;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AFi1fSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    private static long afDebugLog = 0;
    private static int afErrorLog = 0;
    private static long afInfoLog = 0;
    private static byte[] afLogForce = null;
    private static int afRDLog = 0;
    private static int afVerboseLog = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Object f2603d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Object f2604e = null;
    private static long force = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static byte[] f2605i = null;
    public static final Map registerClient;
    private static byte[] unregisterClient = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f2606v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Map f2607w;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d A[PHI: r0 r2 r3 r4
  0x001d: PHI (r0v13 int) = (r0v3 int), (r0v14 int) binds: [B:15:0x0050, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x001d: PHI (r2v4 byte[]) = (r2v0 byte[]), (r2v5 byte[]) binds: [B:15:0x0050, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x001d: PHI (r3v6 int) = (r3v0 int), (r3v7 int) binds: [B:15:0x0050, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x001d: PHI (r4v3 byte[]) = (r4v0 byte[]), (r4v4 byte[]) binds: [B:15:0x0050, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024 A[PHI: r0 r2 r3 r4 r5 r6
  0x0024: PHI (r0v4 int) = (r0v3 int), (r0v12 int), (r0v14 int) binds: [B:15:0x0050, B:7:0x001f, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x0024: PHI (r2v1 byte[] A[IMMUTABLE_TYPE]) = (r2v0 byte[]), (r2v3 byte[]), (r2v5 byte[]) binds: [B:15:0x0050, B:7:0x001f, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x0024: PHI (r3v1 int) = (r3v0 int), (r3v5 int), (r3v7 int) binds: [B:15:0x0050, B:7:0x001f, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x0024: PHI (r4v1 byte[] A[IMMUTABLE_TYPE]) = (r4v0 byte[]), (r4v2 byte[]), (r4v4 byte[]) binds: [B:15:0x0050, B:7:0x001f, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x0024: PHI (r5v1 int) = (r5v0 int), (r5v2 int), (r5v3 int) binds: [B:15:0x0050, B:7:0x001f, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]
  0x0024: PHI (r6v1 int) = (r6v0 int), (r6v3 int), (r6v0 int) binds: [B:15:0x0050, B:7:0x001f, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003d -> B:7:0x001f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, int r9, short r10) {
        /*
            r7 = 2
            int r0 = r7 % r7
            int r0 = com.appsflyer.internal.AFi1fSDK.$12
            int r1 = r0 + 35
            int r0 = r1 % 128
            com.appsflyer.internal.AFi1fSDK.$13 = r0
            int r1 = r1 % r7
            r6 = -1
            if (r1 != 0) goto L44
            int r1 = r8 * 87
            byte[] r2 = com.appsflyer.internal.AFi1fSDK.$$a
            int r5 = r9 + 6
            int r0 = r10 + 61
            byte[] r4 = new byte[r1]
            int r3 = r1 + 41
            if (r2 != 0) goto L24
        L1d:
            r8 = r3
            r1 = r0
        L1f:
            int r0 = -r0
            int r3 = r3 + r0
            r0 = r1
            r5 = r3
            r3 = r8
        L24:
            int r6 = r6 + 1
            byte r1 = (byte) r5
            r4[r6] = r1
            if (r6 != r3) goto L3d
            java.lang.String r2 = new java.lang.String
            r0 = 0
            r2.<init>(r4, r0)
            int r0 = com.appsflyer.internal.AFi1fSDK.$13
            int r1 = r0 + 115
            int r0 = r1 % 128
            com.appsflyer.internal.AFi1fSDK.$12 = r0
            int r1 = r1 % r7
            if (r1 != 0) goto L54
            return r2
        L3d:
            int r1 = r0 + 1
            r0 = r2[r1]
            r8 = r3
            r3 = r5
            goto L1f
        L44:
            int r1 = 49 - r8
            byte[] r2 = com.appsflyer.internal.AFi1fSDK.$$a
            int r5 = r9 + 33
            int r0 = r10 + 4
            byte[] r4 = new byte[r1]
            int r3 = 48 - r8
            if (r2 != 0) goto L53
            goto L1d
        L53:
            goto L24
        L54:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1fSDK.$$c(int, int, short):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:528:0x1e48, code lost:
    
        r1 = r30.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r1.setAccessible(true);
        com.appsflyer.internal.AFi1fSDK.f2603d = r1.newInstance(r11, java.lang.Boolean.valueOf(!r20));
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x1e88, code lost:
    
        r3 = new java.lang.Object[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x1ea9, code lost:
    
        r1 = java.lang.Class.forName(yg.Xg.qd(",$:&s<<26xF6>|*:B\u0019=A;", (short) (yg.C1499aX.Xd() ^ (-21614)), (short) (yg.C1499aX.Xd() ^ (-8844)))).getMethod(yg.Jg.Wd("lPQW?", (short) (yg.C1499aX.Xd() ^ (-32455)), (short) (yg.C1499aX.Xd() ^ (-17835))), new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x1eae, code lost:
    
        r1.setAccessible(true);
        r1.invoke(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x1eb9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x1ebe, code lost:
    
        throw r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:696:0x20d4, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x225c, code lost:
    
        r1 = com.appsflyer.internal.AFi1fSDK.$10 + 97;
        com.appsflyer.internal.AFi1fSDK.$11 = r1 % 128;
        r1 = r1 % 2;
        r26 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:1018:0x2276 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1030:0x223b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1032:0x1e48 A[EDGE_INSN: B:1032:0x1e48->B:528:0x1e48 BREAK  A[LOOP:4: B:246:0x0d1e->B:403:0x1c95], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0dae  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0f55  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x146d  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x17de  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x18b1  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x1986  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x1cb0 A[Catch: all -> 0x2037, TryCatch #9 {all -> 0x2037, blocks: (B:249:0x0d23, B:250:0x0d34, B:284:0x1135, B:413:0x1caa, B:415:0x1cb0, B:416:0x1cb1), top: B:789:0x0d23 }] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x1cb1 A[Catch: all -> 0x2037, TRY_LEAVE, TryCatch #9 {all -> 0x2037, blocks: (B:249:0x0d23, B:250:0x0d34, B:284:0x1135, B:413:0x1caa, B:415:0x1cb0, B:416:0x1cb1), top: B:789:0x0d23 }] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x1e0e A[Catch: all -> 0x201b, TryCatch #121 {all -> 0x201b, blocks: (B:403:0x1c95, B:501:0x1e08, B:503:0x1e0e, B:504:0x1e0f, B:506:0x1e11, B:508:0x1e1b, B:509:0x1e1c, B:511:0x1e1e, B:513:0x1e28, B:514:0x1e29, B:516:0x1e2b, B:518:0x1e35, B:519:0x1e36, B:528:0x1e48, B:555:0x1ee8, B:559:0x1f65, B:561:0x1f6b, B:562:0x1f6c, B:548:0x1ed7, B:550:0x1edd, B:551:0x1ede, B:567:0x1f72, B:569:0x1f7c, B:570:0x1f7d, B:577:0x1f8e, B:579:0x1f96, B:580:0x1f97, B:582:0x1f99, B:584:0x1fa5, B:585:0x1fa6, B:602:0x1fc2, B:604:0x1fc8, B:605:0x1fc9, B:607:0x1fcb, B:609:0x1fd7, B:610:0x1fd8, B:615:0x1fe6, B:617:0x1fec, B:618:0x1fed, B:620:0x1fef, B:622:0x1ffb, B:623:0x1ffc, B:625:0x1ffe, B:627:0x200a, B:628:0x200b, B:630:0x200d, B:632:0x2019, B:633:0x201a, B:396:0x1a9c, B:556:0x1f32, B:557:0x1f63, B:321:0x151d, B:252:0x0d5a, B:242:0x0ca9, B:241:0x0c75, B:240:0x0c3f, B:398:0x1b75, B:397:0x1ad1), top: B:1000:0x1c95, inners: #4, #23, #46, #82, #107, #112, #117, #118, #122 }] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x1e0f A[Catch: all -> 0x201b, TryCatch #121 {all -> 0x201b, blocks: (B:403:0x1c95, B:501:0x1e08, B:503:0x1e0e, B:504:0x1e0f, B:506:0x1e11, B:508:0x1e1b, B:509:0x1e1c, B:511:0x1e1e, B:513:0x1e28, B:514:0x1e29, B:516:0x1e2b, B:518:0x1e35, B:519:0x1e36, B:528:0x1e48, B:555:0x1ee8, B:559:0x1f65, B:561:0x1f6b, B:562:0x1f6c, B:548:0x1ed7, B:550:0x1edd, B:551:0x1ede, B:567:0x1f72, B:569:0x1f7c, B:570:0x1f7d, B:577:0x1f8e, B:579:0x1f96, B:580:0x1f97, B:582:0x1f99, B:584:0x1fa5, B:585:0x1fa6, B:602:0x1fc2, B:604:0x1fc8, B:605:0x1fc9, B:607:0x1fcb, B:609:0x1fd7, B:610:0x1fd8, B:615:0x1fe6, B:617:0x1fec, B:618:0x1fed, B:620:0x1fef, B:622:0x1ffb, B:623:0x1ffc, B:625:0x1ffe, B:627:0x200a, B:628:0x200b, B:630:0x200d, B:632:0x2019, B:633:0x201a, B:396:0x1a9c, B:556:0x1f32, B:557:0x1f63, B:321:0x151d, B:252:0x0d5a, B:242:0x0ca9, B:241:0x0c75, B:240:0x0c3f, B:398:0x1b75, B:397:0x1ad1), top: B:1000:0x1c95, inners: #4, #23, #46, #82, #107, #112, #117, #118, #122 }] */
    /* JADX WARN: Removed duplicated region for block: B:694:0x20d2 A[Catch: all -> 0x20d4, TryCatch #90 {all -> 0x20d4, blocks: (B:664:0x208e, B:663:0x208b, B:530:0x1e88, B:532:0x1ea9, B:533:0x1eae, B:535:0x1eba, B:536:0x1ebe, B:672:0x209e, B:674:0x20a6, B:675:0x20a7, B:680:0x20b1, B:682:0x20b9, B:683:0x20ba, B:692:0x20cc, B:694:0x20d2, B:695:0x20d3, B:655:0x2054, B:657:0x2075, B:658:0x207a, B:660:0x2085, B:661:0x2089), top: B:941:0x1e88, inners: #28, #42 }] */
    /* JADX WARN: Removed duplicated region for block: B:695:0x20d3 A[Catch: all -> 0x20d4, TRY_LEAVE, TryCatch #90 {all -> 0x20d4, blocks: (B:664:0x208e, B:663:0x208b, B:530:0x1e88, B:532:0x1ea9, B:533:0x1eae, B:535:0x1eba, B:536:0x1ebe, B:672:0x209e, B:674:0x20a6, B:675:0x20a7, B:680:0x20b1, B:682:0x20b9, B:683:0x20ba, B:692:0x20cc, B:694:0x20d2, B:695:0x20d3, B:655:0x2054, B:657:0x2075, B:658:0x207a, B:660:0x2085, B:661:0x2089), top: B:941:0x1e88, inners: #28, #42 }] */
    /* JADX WARN: Removed duplicated region for block: B:724:0x220e  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x2242 A[Catch: Exception -> 0x2330, TryCatch #98 {Exception -> 0x2330, blocks: (B:8:0x0261, B:10:0x0278, B:42:0x0444, B:45:0x0492, B:47:0x0498, B:48:0x0499, B:49:0x049a, B:50:0x04f6, B:60:0x0541, B:64:0x0555, B:68:0x055c, B:76:0x0570, B:722:0x2166, B:725:0x2220, B:731:0x223e, B:733:0x2242, B:738:0x227c, B:742:0x2302, B:744:0x2308, B:745:0x2309, B:728:0x2226, B:34:0x037a, B:749:0x2316, B:751:0x231c, B:752:0x231d, B:754:0x231f, B:756:0x2325, B:757:0x2326, B:40:0x03fd, B:759:0x2328, B:761:0x232e, B:762:0x232f, B:41:0x041f, B:43:0x045e, B:739:0x22cf, B:740:0x2300, B:37:0x03d6, B:35:0x0392), top: B:956:0x0261, inners: #2, #44, #115, #119, #123 }] */
    /* JADX WARN: Removed duplicated region for block: B:789:0x0d23 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:957:0x1111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v160, types: [int, short] */
    static {
        /*
            Method dump skipped, instruction units count: 9048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1fSDK.<clinit>():void");
    }

    private AFi1fSDK() {
    }

    public static int getCurrencyIso4217Code(int i2) throws Throwable {
        Object obj;
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = i4 + 97;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            obj = f2603d;
            int i6 = 11 / 0;
        } else {
            obj = f2603d;
        }
        int i7 = (i4 ^ 85) + (((-1) - (((-1) - i4) | ((-1) - 85))) << 1);
        $10 = i7 % 128;
        int i8 = i7 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2)};
            byte[] bArr = $$a;
            int iIntValue = ((Integer) Class.forName($$c(bArr[27], bArr[82], (short) 563), true, (ClassLoader) f2604e).getMethod($$c(bArr[718], bArr[427], (short) 1167), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i9 = $11 + 41;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            return iIntValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getCurrencyIso4217Code(Object obj) throws Throwable {
        Object obj2;
        int i2 = 2 % 2;
        int i3 = $11;
        int i4 = (i3 & 63) + ((i3 + 63) - (i3 & 63));
        int i5 = i4 % 128;
        $10 = i5;
        if (i4 % 2 != 0) {
            obj2 = f2603d;
            int i6 = 46 / 0;
        } else {
            obj2 = f2603d;
        }
        int i7 = i5 + 51;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 3 % 5;
        }
        try {
            byte[] bArr = $$a;
            int iIntValue = ((Integer) Class.forName($$c(bArr[27], bArr[82], (short) 563), true, (ClassLoader) f2604e).getMethod($$c(bArr[452], bArr[427], (short) ($$b | PhotoshopDirectory.TAG_COPYRIGHT)), Object.class).invoke(obj2, obj)).intValue();
            int i9 = $11 + 9;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            return iIntValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object getMediationNetwork(char c2, int i2, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = $10;
        int i6 = ((-1) - (((-1) - i5) | ((-1) - 89))) + ((i5 + 89) - (89 & i5));
        $11 = i6 % 128;
        int i7 = i6 % 2;
        Object obj = f2603d;
        int i8 = ((i5 + 105) - (105 | i5)) + (i5 | 105);
        int i9 = i8 % 128;
        $11 = i9;
        int i10 = i8 % 2;
        int i11 = ((i9 + 79) - (79 | i9)) + ((i9 + 79) - (i9 & 79));
        $10 = i11 % 128;
        int i12 = i11 % 2;
        try {
            Object[] objArr = {Character.valueOf(c2), Integer.valueOf(i2), Integer.valueOf(i3)};
            byte[] bArr = $$a;
            return Class.forName($$c(bArr[27], bArr[82], (short) 563), true, (ClassLoader) f2604e).getMethod($$c(bArr[506], bArr[427], (short) 1128), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(obj, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static void getRevenue(int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = $10 + 49;
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    static void init$0() {
        int i2;
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = ((i4 + 11) - (11 | i4)) + (i4 | 11);
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            byte[] bArr = new byte[1181];
            System.arraycopy(")\u009f5»ó\nò\u0003\u0006\u00056Çõ\u0011ñ\bÿ\u0006ðEëÔ\u0003ýýö÷\u0010ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûÝ8Ï\u000f\u000fùø\u0000ô\u0002?Íñ\u0000ý\rúó\u0014óó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ýî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001ó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\u0002ñ.Ýý\u0007ò/Û÷\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷\u0002ñ1âþû\u0003!Û÷Ë\u0003í\u00132Ë\u0003í\u00132\të\u00153ÅúAèÝý\u0007\të\u00153ÅúAº\u0007ý\fû÷\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000fø\u0002ñ$Þ\u0003ÿ\u000bóþûô\u000bÿ\u0006ü\u0002þû\u0003ó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\u000fùì\u0016ûú\u0002ó\u0017å\tõ\u000f\u0015ú\u0016ø\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001î\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003ö\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô÷ýü\u000e\u0015ý\u0013øÎî\u0000\u000eñ\u0001DÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=ýú\u0004\u0000ÿ\u0003\u0002ùÖ+Ð1Ôû-\u0002Ô6\u0002ñ\"íò\u0004ú\u0003\u000fþ\të\u00153À\tñFÙ\u0003\u0006\u0002ñ$ïí\f\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ô\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ô\r\u0004ý\u001eÑ\t\u0000ó\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ôô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûÛ:¿\u001f\u000fùô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûÝ8Ï\u000f\u000fùø\u0000û\u0005Ý\u0012íï\u0011÷ù\u0010!ãí\u0013\b\u0002ù\r\u0004ý\u000eñ\"í\u0004ý\u0015á\u0002ó\u0015ü\u0014ø\u0005\tõ\u000f\u0002ñ.\u0002\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ýú\u000b\u000b\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ý\u000eý ßí\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fÿù\u0007ñ\u000f\u0002ñ1×\u000bî\u0000'Ý\u000eýÿó\të\u00153¹\u0001\u000bý>´\u0011ùBÔñù'Ûþû\u0001!ß\u0002\r\u0004ô\u0002ñ&éí\u0004/×ú\u0002ù\të\u00153¹\u0001\u000bý>´\u0011ùBÔñù+×ú\u0002ù\u0002ñ!êï\u0015\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è*Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0005-É\u0005\u000f$Ï\u0000\u0011è\të\u00153ÅúAë×ýü\u000e\u0004ÿö\u0007\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001ó\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿó\u0005\u0011ñ\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u000fí\f\u001cãöÿ\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001\u0002ñ1Ô\u0002ý\u0001\u0001\t÷ú Û\t\u000b\u0015ø\u0018øý\u000eý!×\u000bî\u0000ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûÝ8Ë\u0013\u000fù'\u00adÎî\u0000\u000eñ\u0001DÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Ë3Ï\u0000/ú\u0005Ò\u0001)ÿ\bþûÒ4Î7\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòK\u0002ñ'è\u0001û\bí\u000bú\u0001 éñý\bý\u0007\u0002ñ1Î\u0003\u0000\r÷\u000bê0Ö\u0004;\u0002\u0001úôÔ\u000bÿ\u0002ñ\"íï\u0011÷ù\u0010".getBytes("ISO-8859-1"), 0, bArr, 0, 1181);
            $$a = bArr;
            i2 = 69;
        } else {
            byte[] bArr2 = new byte[1181];
            System.arraycopy(")\u009f5»ó\nò\u0003\u0006\u00056Çõ\u0011ñ\bÿ\u0006ðEëÔ\u0003ýýö÷\u0010ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûÝ8Ï\u000f\u000fùø\u0000ô\u0002?Íñ\u0000ý\rúó\u0014óó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ýî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001ó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\u0002ñ.Ýý\u0007ò/Û÷\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷\u0002ñ1âþû\u0003!Û÷Ë\u0003í\u00132Ë\u0003í\u00132\të\u00153ÅúAèÝý\u0007\të\u00153ÅúAº\u0007ý\fû÷\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000fø\u0002ñ$Þ\u0003ÿ\u000bóþûô\u000bÿ\u0006ü\u0002þû\u0003ó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\u000fùì\u0016ûú\u0002ó\u0017å\tõ\u000f\u0015ú\u0016ø\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001î\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003ö\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô÷ýü\u000e\u0015ý\u0013øÎî\u0000\u000eñ\u0001DÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=ýú\u0004\u0000ÿ\u0003\u0002ùÖ+Ð1Ôû-\u0002Ô6\u0002ñ\"íò\u0004ú\u0003\u000fþ\të\u00153À\tñFÙ\u0003\u0006\u0002ñ$ïí\f\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ô\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ô\r\u0004ý\u001eÑ\t\u0000ó\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ôô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûÛ:¿\u001f\u000fùô\u0002?Íñ\u0000ý\rúó\u0014óDÅûú\u000fó\u0004\rõ>íûÝ8Ï\u000f\u000fùø\u0000û\u0005Ý\u0012íï\u0011÷ù\u0010!ãí\u0013\b\u0002ù\r\u0004ý\u000eñ\"í\u0004ý\u0015á\u0002ó\u0015ü\u0014ø\u0005\tõ\u000f\u0002ñ.\u0002\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ýú\u000b\u000b\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ý\u000eý ßí\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fÿù\u0007ñ\u000f\u0002ñ1×\u000bî\u0000'Ý\u000eýÿó\të\u00153¹\u0001\u000bý>´\u0011ùBÔñù'Ûþû\u0001!ß\u0002\r\u0004ô\u0002ñ&éí\u0004/×ú\u0002ù\të\u00153¹\u0001\u000bý>´\u0011ùBÔñù+×ú\u0002ù\u0002ñ!êï\u0015\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è*Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô\u0005-É\u0005\u000f$Ï\u0000\u0011è\të\u00153ÅúAë×ýü\u000e\u0004ÿö\u0007\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001ó\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿó\u0005\u0011ñ\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u000fí\f\u001cãöÿ\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001\u0002ñ1Ô\u0002ý\u0001\u0001\t÷ú Û\t\u000b\u0015ø\u0018øý\u000eý!×\u000bî\u0000ô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=îûÝ8Ë\u0013\u000fù'\u00adÎî\u0000\u000eñ\u0001DÌô\u0002>Îñ\u0000ý\rúó\u0014óCÆûú\u000fó\u0004\rõ=Ë3Ï\u0000/ú\u0005Ò\u0001)ÿ\bþûÒ4Î7\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòK\u0002ñ'è\u0001û\bí\u000bú\u0001 éñý\bý\u0007\u0002ñ1Î\u0003\u0000\r÷\u000bê0Ö\u0004;\u0002\u0001úôÔ\u000bÿ\u0002ñ\"íï\u0011÷ù\u0010".getBytes("ISO-8859-1"), 0, bArr2, 0, 1181);
            $$a = bArr2;
            i2 = PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION;
        }
        $$b = i2;
    }
}
