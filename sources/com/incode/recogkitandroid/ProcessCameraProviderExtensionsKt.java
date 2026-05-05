package com.incode.recogkitandroid;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ProcessCameraProviderExtensionsKt {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $14 = 0;
    private static int $15 = 1;
    private static int $16 = 0;
    private static int $17 = 1;
    private static int IncodeCameraConfig = 0;
    private static byte[] accessgetCameraExecutorp = null;
    private static long accessgetImageAnalysisp = 0;
    private static int accessgetSurfaceComboForVideoLivenessFoundp = 0;
    private static boolean accessgetVideoCapturep = false;
    private static int accessget_cameraStatep = 0;
    private static Object getConfiguration = null;
    private static long getExposureCompensationIndex = 0;
    private static long isExposureCompensationSupported = 0;
    private static Object isZoomSupported = null;
    private static int setExposure = 0;
    private static byte[] setLinearZoom = null;
    private static int setMaxExposureCompensation = 0;
    public static final Map stopRecording;
    private static byte[] toggleTorch = null;
    public static final Map zoomCameraToMax;

    private static String $$c(int i2, short s2, int i3) {
        int i4 = 2 % 2;
        int i5 = $16 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i6 = i5 % 128;
        $17 = i6;
        int i7 = i5 % 2;
        int i8 = s2 + 4;
        int i9 = i2 + 33;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[62 - i3];
        int i10 = 61 - i3;
        int i11 = -1;
        if (bArr == null) {
            int i12 = i6 + 115;
            $16 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            i8++;
            i9 = (i9 + i10) - 3;
            int i13 = $17 + 21;
            $16 = i13 % 128;
            int i14 = i13 % 2;
        }
        while (true) {
            i11++;
            bArr2[i11] = (byte) i9;
            if (i11 == i10) {
                String str = new String(bArr2, 0);
                int i15 = $16 + 27;
                $17 = i15 % 128;
                int i16 = i15 % 2;
                return str;
            }
            byte b2 = bArr[i8];
            i8++;
            i9 = (i9 + b2) - 3;
            int i17 = $17 + 21;
            $16 = i17 % 128;
            int i18 = i17 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:496:0x1658, code lost:
    
        r0 = r33.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r0.setAccessible(true);
        com.incode.recogkitandroid.ProcessCameraProviderExtensionsKt.getConfiguration = r0.newInstance(r13, java.lang.Boolean.valueOf(!r19));
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x167d, code lost:
    
        if (r24 == null) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x167f, code lost:
    
        r0 = com.incode.recogkitandroid.ProcessCameraProviderExtensionsKt.$15;
        r5 = (r0 ^ 99) + ((r0 & 99) << 1);
        com.incode.recogkitandroid.ProcessCameraProviderExtensionsKt.$14 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x168e, code lost:
    
        if ((r5 % 2) != 0) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x1690, code lost:
    
        r24.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x1694, code lost:
    
        r24.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x1698, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x1699, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x169e, code lost:
    
        if (r2 == 0) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x16a2, code lost:
    
        if (r2 < 26) goto L643;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x16a4, code lost:
    
        r6 = com.incode.recogkitandroid.ProcessCameraProviderExtensionsKt.$15;
        r5 = ((r6 | 75) << 1) - (r6 ^ 75);
        com.incode.recogkitandroid.ProcessCameraProviderExtensionsKt.$14 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x16b7, code lost:
    
        r0 = new java.lang.Object[]{-627916881, -339232508};
        r6 = getAvailableCameraInternals(1850029341);
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x16d4, code lost:
    
        if (r6 != null) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x16d6, code lost:
    
        r6 = CameraConstants(android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16, 33 - (~android.graphics.Color.alpha(0)), (char) (17614 - (~(-(-(android.view.ViewConfiguration.getTapTimeout() >> 16))))), -328967076, false, $$c((byte) (-com.incode.recogkitandroid.ProcessCameraProviderExtensionsKt.$$a[1108(0x454, float:1.553E-42)]), (short) com.drew.metadata.photoshop.PhotoshopDirectory.TAG_AUTO_SAVE_FORMAT, r8[560(0x230, float:7.85E-43)]), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x1718, code lost:
    
        ((java.lang.reflect.Method) r6).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x1720, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x1721, code lost:
    
        r0 = r5.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x1725, code lost:
    
        if (r0 != null) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x1727, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x1728, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x1854, code lost:
    
        r5 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x1880, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x18d9, code lost:
    
        r0 = 2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x18db, code lost:
    
        r5 = 2;
        r28 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:209:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0b13  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0ed7  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x12c8  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x17f3 A[Catch: all -> 0x1845, TryCatch #17 {all -> 0x1845, blocks: (B:532:0x1749, B:536:0x17bd, B:538:0x17c3, B:539:0x17c4, B:525:0x1739, B:527:0x173f, B:528:0x1740, B:541:0x17c6, B:543:0x17d1, B:544:0x17d2, B:546:0x17d4, B:548:0x17df, B:549:0x17e0, B:556:0x17ec, B:558:0x17f3, B:559:0x17f4, B:561:0x17f6, B:563:0x1801, B:564:0x1802, B:571:0x180e, B:573:0x1815, B:574:0x1816, B:576:0x1818, B:578:0x1823, B:579:0x1824, B:583:0x1828, B:585:0x1833, B:586:0x1834, B:590:0x1838, B:592:0x1843, B:593:0x1844, B:533:0x1786, B:534:0x17bb, B:311:0x0fc4, B:308:0x0f7d, B:245:0x09d2, B:235:0x0920), top: B:711:0x0fc4, inners: #59, #63, #67, #83, #102 }] */
    /* JADX WARN: Removed duplicated region for block: B:559:0x17f4 A[Catch: all -> 0x1845, TryCatch #17 {all -> 0x1845, blocks: (B:532:0x1749, B:536:0x17bd, B:538:0x17c3, B:539:0x17c4, B:525:0x1739, B:527:0x173f, B:528:0x1740, B:541:0x17c6, B:543:0x17d1, B:544:0x17d2, B:546:0x17d4, B:548:0x17df, B:549:0x17e0, B:556:0x17ec, B:558:0x17f3, B:559:0x17f4, B:561:0x17f6, B:563:0x1801, B:564:0x1802, B:571:0x180e, B:573:0x1815, B:574:0x1816, B:576:0x1818, B:578:0x1823, B:579:0x1824, B:583:0x1828, B:585:0x1833, B:586:0x1834, B:590:0x1838, B:592:0x1843, B:593:0x1844, B:533:0x1786, B:534:0x17bb, B:311:0x0fc4, B:308:0x0f7d, B:245:0x09d2, B:235:0x0920), top: B:711:0x0fc4, inners: #59, #63, #67, #83, #102 }] */
    /* JADX WARN: Removed duplicated region for block: B:609:0x1860 A[Catch: all -> 0x1880, TRY_ENTER, TryCatch #37 {all -> 0x1880, blocks: (B:609:0x1860, B:610:0x1863, B:515:0x1721, B:517:0x1727, B:518:0x1728, B:612:0x1865, B:614:0x1870, B:615:0x1871, B:617:0x1873, B:619:0x187e, B:620:0x187f, B:510:0x16b7, B:512:0x16d6, B:513:0x1718, B:213:0x0816, B:212:0x07ed), top: B:678:0x16b7, inners: #0, #31, #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:636:0x18a3 A[Catch: Exception -> 0x1964, TRY_ENTER, TryCatch #60 {Exception -> 0x1964, blocks: (B:6:0x0084, B:8:0x00a3, B:9:0x00b1, B:38:0x0216, B:47:0x029a, B:50:0x02e9, B:52:0x02ef, B:53:0x02f0, B:54:0x02f1, B:55:0x034c, B:63:0x038b, B:67:0x0392, B:71:0x03ad, B:75:0x03b6, B:81:0x03d4, B:636:0x18a3, B:638:0x18a7, B:645:0x18f4, B:649:0x1940, B:651:0x1946, B:652:0x1947, B:41:0x021a, B:655:0x194a, B:657:0x1950, B:658:0x1951, B:660:0x1953, B:662:0x1959, B:663:0x195a, B:35:0x01c0, B:665:0x195c, B:667:0x1962, B:668:0x1963, B:646:0x190a, B:647:0x193e, B:43:0x0263, B:42:0x022c, B:37:0x01f0, B:48:0x02ae), top: B:786:0x0084, inners: #15, #20, #25, #29, #76 }] */
    /* JADX WARN: Removed duplicated region for block: B:714:0x1318 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:729:0x088d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:782:0x04be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:789:0x0a1a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:792:0x09a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:827:0x0be5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:845:0x1230 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:887:0x1654 A[EDGE_INSN: B:887:0x1654->B:495:0x1654 BREAK  A[LOOP:2: B:239:0x09a1->B:371:0x14aa], SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    static {
        /*
            Method dump skipped, instruction units count: 6532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.recogkitandroid.ProcessCameraProviderExtensionsKt.<clinit>():void");
    }

    private ProcessCameraProviderExtensionsKt() {
    }

    public static int CameraConstants(int i2) throws Throwable {
        int i3 = 2 % 2;
        int i4 = $10;
        int i5 = ((i4 | 7) << 1) - (i4 ^ 7);
        int i6 = i5 % 128;
        $11 = i6;
        int i7 = i5 % 2;
        Object obj = getConfiguration;
        int i8 = (i6 ^ 7) + ((i6 & 7) << 1);
        $10 = i8 % 128;
        int i9 = i8 % 2;
        try {
            int iIntValue = ((Integer) Class.forName($$c((byte) (-$$a[258]), r3[26], r3[89]), true, (ClassLoader) isZoomSupported).getMethod($$c(r3[593], (short) 1136, r3[160]), Integer.TYPE).invoke(obj, Integer.valueOf(i2))).intValue();
            int i10 = $11 + 103;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            return iIntValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object CameraConstants(int i2, int i3, char c2, int i4, boolean z2, String str, Class[] clsArr) throws Throwable {
        Object method;
        int i5;
        int i6 = 2 % 2;
        int i7 = $11;
        int i8 = (i7 & 59) + (i7 | 59);
        $10 = i8 % 128;
        if (i8 % 2 != 0) {
            zoomCameraToMax.get(Integer.valueOf(i4));
            throw null;
        }
        Map map = zoomCameraToMax;
        Object obj = map.get(Integer.valueOf(i4));
        if (obj != null) {
            int i9 = $11;
            int i10 = (i9 & 39) + (i9 | 39);
            $10 = i10 % 128;
            int i11 = i10 % 2;
            return obj;
        }
        Integer numValueOf = Integer.valueOf(i4);
        Object obj2 = getConfiguration;
        try {
            Class cls = (Class) Class.forName($$c((byte) (-$$a[258]), r11[26], r11[89]), true, (ClassLoader) isZoomSupported).getMethod($$c(r11[31], (short) 565, r11[96]), Integer.TYPE, Integer.TYPE, Character.TYPE).invoke(obj2, Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(c2));
            if (str == null) {
                if (z2) {
                    int i12 = $10;
                    int i13 = (i12 ^ 57) + ((i12 & 57) << 1);
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    method = cls.getDeclaredConstructor(clsArr);
                } else {
                    method = cls.getConstructor(clsArr);
                }
            } else if (clsArr == null) {
                if (z2) {
                    method = cls.getDeclaredField(str);
                    int i15 = $11;
                    i5 = (i15 ^ 31) + ((i15 & 31) << 1);
                    $10 = i5 % 128;
                } else {
                    method = cls.getField(str);
                    int i16 = $10;
                    i5 = ((i16 | 71) << 1) - (i16 ^ 71);
                    $11 = i5 % 128;
                }
                int i17 = i5 % 2;
            } else if (!(!z2)) {
                int i18 = $10;
                int i19 = ((i18 | 125) << 1) - (i18 ^ 125);
                $11 = i19 % 128;
                int i20 = i19 % 2;
                method = cls.getDeclaredMethod(str, clsArr);
            } else {
                method = cls.getMethod(str, clsArr);
                int i21 = $11 + 13;
                $10 = i21 % 128;
                int i22 = i21 % 2;
            }
            map.put(numValueOf, method);
            return method;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getAvailableCameraInternals(Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = $10;
        int i4 = ((i3 | 105) << 1) - (i3 ^ 105);
        int i5 = i4 % 128;
        $11 = i5;
        Object obj2 = null;
        if (i4 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        Object obj3 = getConfiguration;
        int i6 = i5 + 39;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        try {
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c((byte) (-bArr[258]), bArr[26], bArr[89]), true, (ClassLoader) isZoomSupported);
            byte b2 = bArr[372];
            int iIntValue = ((Integer) cls.getMethod($$c(b2, (short) (b2 | 1040), (byte) (-bArr[719])), Object.class).invoke(obj3, obj)).intValue();
            int i8 = $11 + 73;
            $10 = i8 % 128;
            if (i8 % 2 == 0) {
                return iIntValue;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object getAvailableCameraInternals(int i2) {
        int i3 = 2 % 2;
        int i4 = $11 + 35;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        Map map = zoomCameraToMax;
        if (i5 == 0) {
            int i6 = accessgetSurfaceComboForVideoLivenessFoundp;
            return map.get(Integer.valueOf((i2 | i6) & (~(i2 & i6))));
        }
        int i7 = accessgetSurfaceComboForVideoLivenessFoundp;
        int i8 = 23 / 0;
        return map.get(Integer.valueOf(((~i2) & i7) | ((~i7) & i2)));
    }

    public static Object getAvailableCameraInternals(int i2, int i3, char c2) throws Throwable {
        int i4 = 2 % 2;
        int i5 = $11;
        int i6 = (i5 & 41) + (i5 | 41);
        int i7 = i6 % 128;
        $10 = i7;
        int i8 = i6 % 2;
        Object obj = getConfiguration;
        int i9 = i7 + 63;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        try {
            return Class.forName($$c((byte) (-$$a[258]), r8[26], r8[89]), true, (ClassLoader) isZoomSupported).getMethod($$c(r8[31], (short) 565, r8[96]), Integer.TYPE, Integer.TYPE, Character.TYPE).invoke(obj, Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(c2));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void init$0() {
        int i2;
        int i3 = 2 % 2;
        int i4 = $11;
        int i5 = ((i4 | 31) << 1) - (i4 ^ 31);
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            byte[] bArr = new byte[1154];
            System.arraycopy("}¦Ó8\u000f\u0001Ä>\bø\u000fø\u0004ÌGö\u0001\u000fû\u0007\u0001\u000eð\u0010ù\u0011\u0000ýþÍ\u001e(ø\u000fø\u0004á!\u000fû\u0010òõ\u0003\u000f\u0001Ä>\bø\u000fø\u0004Ì8\u000f\u0006öý\u0010\u0000\u0001\u0004\u000f\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0001\u0012Õ&\u0006ü\u0011Ô(\f\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\u0001\u0012Ò!\u0005\b\u0000â(\f8\u0000\u0016ðÑ8\u0000\u0016ðÑú\u0018îÐ>\tÂ\u001b&\u0006üú\u0018îÐ>\tÂIü\u0006÷\b\fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ô\n\u0017í\b\t\u0001\u0010ì\u001eú\u000eôî\tí\u000bú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\f\u0006\u0007õî\u0006ð\u000b5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å=\bø\u000fø\u0004ÍFö\u0001\u000fû\u0007\u0001\u000eð\u0010ù\u0011\u0000ýþÎ8\u0003Ô0\u0002Ó\tü\u00047\u0000Ò3Ø\u0000\u0006.Ï\u0001\u0012á\u0016\u0011ÿ\t\u0000ô\u0005ú\u0018îÐCú\u0012½*\u0000ý\u0001\u0012ß\u0014\u0016÷ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000föÿ\u0006å2ú\u0003\u0010ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u000f\u0001Ä>\bø\u000fø\u0004ÌGö\u0001\u000fû\u0007\u0001\u000eð\u0010ù\u0011\u0000ýþÍ<\u0001\u0012Ò/\u0002û\u0006\u0001(ø\u000fø\u0004á!\u000fû\u0010òû\u0001\nöÿ\u0006õ\u0012á\u0016ÿ\u0006î\"\u0001\u0010î\u0007ï\u000bþú\u000eô\u0001\u0012Õ\u0001ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006\tøø\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u0006õ\u0006ã$\u0016\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0004\nü\u0012ô\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nÜ(\u0005\b\u0002â$\u0001öÿ\u000f\u0001\u0012Ý\u001a\u0016ÿÔ,\t\u0001\nú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nØ,\t\u0001\n\u0001\u0012â\u0019\u0014îú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\u000e\u0003\u0006÷\u0001\u0016ôâ(\fö\u0001\u0014\b\u0002ú\u0018îÐ>\tÂ\u0018,\u0006\u0007õÿ\u0004\rü\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0002\u0007ù\u000eø\t\u0002\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ô\u0016÷ç \r\u0004ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\u0001\u0012Ò/\u0001\u0006\u0002\u0002ú\f\tã(úøî\u000bë\u000b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å=\bø\u000fø\u0004ÍFö\u0001\u000fû\u0007\u0001\u000eð\u0010ù\u0011\u0000ýþÎ$%\u0000÷\u0005\u0011\u0003Ó!\u000fû\u0010òò%\u0000\nöþ\u0004\u0010Ö6ÿô\f\bù\t\u0002\bÛ,³@5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å=\bø\u000fø\u0004ÍFö\u0001\u000fû\u0007\u0001\u000eð\u0010ù\u0011\u0000ýþÎ\r\u0000\u0006\u0003û\n\u0001\u0000\u0001\tý3\u0005\u0005\u0002\u0005ÿÎØî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸\u0001\u0012Ð8î\u000b\u0006ø\u0004\rüá!\u000fû\u0010òë(\tô\u0010ÿö\u000e\n!\u000fû\u0010òå/\u0002\b\u0004ð\u0010\t\u0002".getBytes("ISO-8859-1"), 0, bArr, 0, 1154);
            $$a = bArr;
            i2 = 8639;
        } else {
            byte[] bArr2 = new byte[1154];
            System.arraycopy("}¦Ó8\u000f\u0001Ä>\bø\u000fø\u0004ÌGö\u0001\u000fû\u0007\u0001\u000eð\u0010ù\u0011\u0000ýþÍ\u001e(ø\u000fø\u0004á!\u000fû\u0010òõ\u0003\u000f\u0001Ä>\bø\u000fø\u0004Ì8\u000f\u0006öý\u0010\u0000\u0001\u0004\u000f\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0001\u0012Õ&\u0006ü\u0011Ô(\f\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\u0001\u0012Ò!\u0005\b\u0000â(\f8\u0000\u0016ðÑ8\u0000\u0016ðÑú\u0018îÐ>\tÂ\u001b&\u0006üú\u0018îÐ>\tÂIü\u0006÷\b\fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ô\n\u0017í\b\t\u0001\u0010ì\u001eú\u000eôî\tí\u000bú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\f\u0006\u0007õî\u0006ð\u000b5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å=\bø\u000fø\u0004ÍFö\u0001\u000fû\u0007\u0001\u000eð\u0010ù\u0011\u0000ýþÎ8\u0003Ô0\u0002Ó\tü\u00047\u0000Ò3Ø\u0000\u0006.Ï\u0001\u0012á\u0016\u0011ÿ\t\u0000ô\u0005ú\u0018îÐCú\u0012½*\u0000ý\u0001\u0012ß\u0014\u0016÷ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000föÿ\u0006å2ú\u0003\u0010ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u000f\u0001Ä>\bø\u000fø\u0004ÌGö\u0001\u000fû\u0007\u0001\u000eð\u0010ù\u0011\u0000ýþÍ<\u0001\u0012Ò/\u0002û\u0006\u0001(ø\u000fø\u0004á!\u000fû\u0010òû\u0001\nöÿ\u0006õ\u0012á\u0016ÿ\u0006î\"\u0001\u0010î\u0007ï\u000bþú\u000eô\u0001\u0012Õ\u0001ú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006\tøø\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u0006õ\u0006ã$\u0016\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0004\nü\u0012ô\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nÜ(\u0005\b\u0002â$\u0001öÿ\u000f\u0001\u0012Ý\u001a\u0016ÿÔ,\t\u0001\nú\u0018îÐJ\u0002ø\u0006ÅOò\nÁ/\u0012\nØ,\t\u0001\n\u0001\u0012â\u0019\u0014îú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\u000e\u0003\u0006÷\u0001\u0016ôâ(\fö\u0001\u0014\b\u0002ú\u0018îÐ>\tÂ\u0018,\u0006\u0007õÿ\u0004\rü\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0002\u0007ù\u000eø\t\u0002\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010ô\u0016÷ç \r\u0004ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\u0001\u0012Ò/\u0001\u0006\u0002\u0002ú\f\tã(úøî\u000bë\u000b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Å=\bø\u000fø\u0004ÍFö\u0001\u000fû\u0007\u0001\u000eð\u0010ù\u0011\u0000ýþÎ$%\u0000÷\u0005\u0011\u0003Ó!\u000fû\u0010òò%\u0000\nöþ\u0004\u0010Ö6ÿô\f\bù\t\u0002\bÛ,³@5\u0015\u0003õ\u0012\u0002¿7\u000f\u0001Å=\bø\u000fø\u0004ÍFö\u0001\u000fû\u0007\u0001\u000eð\u0010ù\u0011\u0000ýþÎ\r\u0000\u0006\u0003û\n\u0001\u0000\u0001\tý3\u0005\u0005\u0002\u0005ÿÎØî\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸\u0001\u0012Ð8î\u000b\u0006ø\u0004\rüá!\u000fû\u0010òë(\tô\u0010ÿö\u000e\n!\u000fû\u0010òå/\u0002\b\u0004ð\u0010\t\u0002".getBytes("ISO-8859-1"), 0, bArr2, 0, 1154);
            $$a = bArr2;
            i2 = 203;
        }
        $$b = i2;
    }
}
