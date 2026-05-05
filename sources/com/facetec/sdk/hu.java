package com.facetec.sdk;

import androidx.webkit.ProxyConfig;
import com.facetec.sdk.cf;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class hu {
    private byte[] D;
    private byte[] F;
    private static final byte[] Code = {42};
    private static final String[] B = new String[0];
    private static final String[] Z = {ProxyConfig.MATCH_ALL_SCHEMES};
    private static final hu I = new hu();
    private final AtomicBoolean V = new AtomicBoolean(false);
    private final CountDownLatch C = new CountDownLatch(1);

    private String[] I(String[] strArr) {
        String str;
        String strV;
        String strV2;
        InputStream resourceAsStream;
        int i2 = 0;
        if (this.V.get() || !this.V.compareAndSet(false, true)) {
            try {
                this.C.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z2 = false;
            while (true) {
                try {
                    try {
                        resourceAsStream = hu.class.getResourceAsStream(PublicSuffixDatabase.PUBLIC_SUFFIX_RESOURCE);
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z2 = true;
                    } catch (IOException e2) {
                        hv.B().Code(5, "Failed to read public suffix list", e2);
                        if (z2) {
                        }
                    }
                } finally {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            if (resourceAsStream != null) {
                cf.I iCode = ik.Code(new ij(ik.B(resourceAsStream)));
                try {
                    byte[] bArr = new byte[iCode.d()];
                    iCode.Code(bArr);
                    byte[] bArr2 = new byte[iCode.d()];
                    iCode.Code(bArr2);
                    synchronized (this) {
                        this.D = bArr;
                        this.F = bArr2;
                    }
                    this.C.countDown();
                } finally {
                    gg.B(iCode);
                }
            }
        }
        synchronized (this) {
            if (this.D == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr3 = new byte[length][];
        for (int i3 = 0; i3 < strArr.length; i3++) {
            bArr3[i3] = strArr[i3].getBytes(gg.Code);
        }
        int i4 = 0;
        while (true) {
            str = null;
            if (i4 >= length) {
                strV = null;
                break;
            }
            strV = V(this.D, bArr3, i4);
            if (strV != null) {
                break;
            }
            i4++;
        }
        if (length > 1) {
            byte[][] bArr4 = (byte[][]) bArr3.clone();
            for (int i5 = 0; i5 < bArr4.length - 1; i5++) {
                bArr4[i5] = Code;
                strV2 = V(this.D, bArr4, i5);
                if (strV2 != null) {
                    break;
                }
            }
            strV2 = null;
        } else {
            strV2 = null;
        }
        if (strV2 != null) {
            while (true) {
                if (i2 >= length - 1) {
                    break;
                }
                String strV3 = V(this.F, bArr3, i2);
                if (strV3 != null) {
                    str = strV3;
                    break;
                }
                i2++;
            }
        }
        if (str != null) {
            return "!".concat(String.valueOf(str)).split("\\.");
        }
        if (strV == null && strV2 == null) {
            return Z;
        }
        String[] strArrSplit = strV != null ? strV.split("\\.") : B;
        String[] strArrSplit2 = strV2 != null ? strV2.split("\\.") : B;
        return strArrSplit.length > strArrSplit2.length ? strArrSplit : strArrSplit2;
    }

    private static String V(byte[] bArr, byte[][] bArr2, int i2) {
        int i3;
        int i4;
        int i5;
        int length = bArr.length;
        int i6 = 0;
        while (i6 < length) {
            int i7 = (i6 + length) / 2;
            while (i7 >= 0 && bArr[i7] != 10) {
                i7--;
            }
            int i8 = i7 + 1;
            int i9 = 1;
            while (true) {
                i3 = i8 + i9;
                if (bArr[i3] == 10) {
                    break;
                }
                i9++;
            }
            int i10 = i3 - i8;
            int i11 = i2;
            boolean z2 = false;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (z2) {
                    i4 = 46;
                    z2 = false;
                } else {
                    byte b2 = bArr2[i11][i12];
                    i4 = (b2 + 255) - (b2 | 255);
                }
                i5 = i4 - ((-1) - (((-1) - bArr[i8 + i13]) | ((-1) - 255)));
                if (i5 != 0) {
                    break;
                }
                i13++;
                i12++;
                if (i13 != i10) {
                    if (bArr2[i11].length == i12) {
                        if (i11 == bArr2.length - 1) {
                            break;
                        }
                        i11++;
                        i12 = -1;
                        z2 = true;
                    }
                } else {
                    break;
                }
            }
            if (i5 >= 0) {
                if (i5 <= 0) {
                    int i14 = i10 - i13;
                    int length2 = bArr2[i11].length - i12;
                    while (true) {
                        i11++;
                        if (i11 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i11].length;
                    }
                    if (length2 >= i14) {
                        if (length2 <= i14) {
                            return new String(bArr, i8, i10, gg.Code);
                        }
                    }
                }
                i6 = i3 + 1;
            }
            length = i7;
        }
        return null;
    }

    public static hu Z() {
        return I;
    }

    public final String B(String str) {
        int length;
        int length2;
        if (str == null) {
            throw new NullPointerException("domain == null");
        }
        String[] strArrSplit = IDN.toUnicode(str).split("\\.");
        String[] strArrI = I(strArrSplit);
        if (strArrSplit.length == strArrI.length && strArrI[0].charAt(0) != '!') {
            return null;
        }
        if (strArrI[0].charAt(0) == '!') {
            length = strArrSplit.length;
            length2 = strArrI.length;
        } else {
            length = strArrSplit.length;
            length2 = strArrI.length + 1;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit2 = str.split("\\.");
        for (int i2 = length - length2; i2 < strArrSplit2.length; i2++) {
            sb.append(strArrSplit2[i2]).append('.');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
