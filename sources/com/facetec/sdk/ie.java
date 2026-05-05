package com.facetec.sdk;

import androidx.compose.animation.core.AnimationKt;
import com.drew.metadata.exif.makernotes.CanonMakernoteDirectory;
import com.dynatrace.android.agent.events.eventsapi.EnrichmentAttributesGenerator;
import com.facetec.sdk.cf;
import com.squareup.wire.internal.MathMethodsKt;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import kotlin.text.Typography;
import okhttp3.internal.connection.RealConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class ie implements cf.I, Cloneable, ByteChannel {
    private static final byte[] Code = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    @Nullable
    il V;
    long Z;

    private boolean B(ib ibVar, int i2) {
        if (i2 < 0 || this.Z < i2 || ibVar.S() < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (F(i3) != ibVar.B(i3)) {
                return false;
            }
        }
        return true;
    }

    private String V(long j2, Charset charset) throws EOFException {
        is.Z(this.Z, 0L, j2);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j2 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j2)));
        }
        if (j2 == 0) {
            return "";
        }
        il ilVar = this.V;
        if (((long) ilVar.Z) + j2 > ilVar.I) {
            return new String(D(j2), charset);
        }
        String str = new String(ilVar.V, ilVar.Z, (int) j2, charset);
        ilVar.Z = (int) (((long) ilVar.Z) + j2);
        this.Z -= j2;
        if (ilVar.Z == ilVar.I) {
            this.V = ilVar.V();
            ip.Z(ilVar);
        }
        return str;
    }

    private String a(long j2) throws EOFException {
        return V(j2, is.V);
    }

    @Override // com.facetec.sdk.cf.I
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final ie I(int i2) {
        il ilVarC = C(1);
        byte[] bArr = ilVarC.V;
        int i3 = ilVarC.I;
        ilVarC.I = i3 + 1;
        bArr[i3] = (byte) i2;
        this.Z++;
        return this;
    }

    public final ie B(ib ibVar) {
        if (ibVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        ibVar.Code(this);
        return this;
    }

    public final ie B(String str, int i2, int i3) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i2)));
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(new StringBuilder("endIndex < beginIndex: ").append(i3).append(" < ").append(i2).toString());
        }
        if (i3 > str.length()) {
            throw new IllegalArgumentException(new StringBuilder("endIndex > string.length: ").append(i3).append(" > ").append(str.length()).toString());
        }
        while (i2 < i3) {
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 < 128) {
                il ilVarC = C(1);
                byte[] bArr = ilVarC.V;
                int i4 = ilVarC.I - i2;
                int iMin = Math.min(i3, 8192 - i4);
                int i5 = i2 + 1;
                bArr[i2 + i4] = (byte) cCharAt2;
                while (true) {
                    i2 = i5;
                    if (i2 >= iMin || (cCharAt = str.charAt(i2)) >= 128) {
                        break;
                    }
                    i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) cCharAt;
                }
                int i6 = (i4 + i2) - ilVarC.I;
                ilVarC.I += i6;
                this.Z += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    int i7 = cCharAt2 >> 6;
                    I((i7 + 192) - (i7 & 192));
                    int i8 = cCharAt2 & '?';
                    I((i8 + 128) - (i8 & 128));
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    I((cCharAt2 >> '\f') | CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY);
                    I((-1) - (((-1) - ((-1) - (((-1) - (cCharAt2 >> 6)) | ((-1) - 63)))) & ((-1) - 128)));
                    int i9 = cCharAt2 & '?';
                    I((i9 + 128) - (i9 & 128));
                } else {
                    int i10 = i2 + 1;
                    char cCharAt3 = i10 < i3 ? str.charAt(i10) : (char) 0;
                    if (cCharAt2 > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        I(63);
                        i2 = i10;
                    } else {
                        int i11 = (cCharAt2 & 10239) << 10;
                        int i12 = 9215 & cCharAt3;
                        int i13 = ((i11 + i12) - (i11 & i12)) + 65536;
                        I((i13 >> 18) | 240);
                        int i14 = i13 >> 12;
                        I(((i14 + 63) - (i14 | 63)) | 128);
                        int i15 = (i13 >> 6) & 63;
                        I((i15 + 128) - (i15 & 128));
                        int i16 = i13 & 63;
                        I((i16 + 128) - (i16 & 128));
                        i2 += 2;
                    }
                }
                i2++;
            }
        }
        return this;
    }

    @Override // com.facetec.sdk.cf.I
    public final /* bridge */ /* synthetic */ cf.I C() throws IOException {
        return this;
    }

    final il C(int i2) {
        if (i2 <= 0 || i2 > 8192) {
            throw new IllegalArgumentException();
        }
        il ilVar = this.V;
        if (ilVar != null) {
            il ilVar2 = ilVar.D;
            return (ilVar2.I + i2 > 8192 || !ilVar2.Code) ? ilVar2.Z(ip.Code()) : ilVar2;
        }
        il ilVarCode = ip.Code();
        this.V = ilVarCode;
        ilVarCode.D = ilVarCode;
        ilVarCode.C = ilVarCode;
        return ilVarCode;
    }

    @Override // com.facetec.sdk.cf.I
    public final String C(long j2) throws EOFException {
        if (j2 < 0) {
            throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j2)));
        }
        long j3 = j2 != Long.MAX_VALUE ? j2 + 1 : Long.MAX_VALUE;
        long jZ = Z((byte) 10, 0L, j3);
        if (jZ != -1) {
            return S(jZ);
        }
        if (j3 < h() && F(j3 - 1) == 13 && F(j3) == 10) {
            return S(j3);
        }
        ie ieVar = new ie();
        Code(ieVar, 0L, Math.min(32L, h()));
        throw new EOFException(new StringBuilder("\\n not found: limit=").append(Math.min(h(), j2)).append(" content=").append(ieVar.i().I()).append(Typography.ellipsis).toString());
    }

    @Override // com.facetec.sdk.cf.I
    public final ib Code(long j2) throws EOFException {
        return new ib(D(j2));
    }

    public final ie Code(ie ieVar, long j2, long j3) {
        long j4 = j3;
        long j5 = j2;
        if (ieVar == null) {
            throw new IllegalArgumentException("out == null");
        }
        is.Z(this.Z, j5, j4);
        if (j4 == 0) {
            return this;
        }
        ieVar.Z += j4;
        il ilVar = this.V;
        while (j5 >= ilVar.I - ilVar.Z) {
            j5 -= (long) (ilVar.I - ilVar.Z);
            ilVar = ilVar.C;
        }
        while (j4 > 0) {
            il ilVarZ = ilVar.Z();
            ilVarZ.Z = (int) (((long) ilVarZ.Z) + j5);
            ilVarZ.I = Math.min(ilVarZ.Z + ((int) j4), ilVarZ.I);
            il ilVar2 = ieVar.V;
            if (ilVar2 == null) {
                ilVarZ.D = ilVarZ;
                ilVarZ.C = ilVarZ;
                ieVar.V = ilVarZ;
            } else {
                ilVar2.D.Z(ilVarZ);
            }
            j4 -= (long) (ilVarZ.I - ilVarZ.Z);
            ilVar = ilVar.C;
            j5 = 0;
        }
        return this;
    }

    @Override // com.facetec.sdk.cf.I
    public final String Code(Charset charset) {
        try {
            return V(this.Z, charset);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.facetec.sdk.cf.I
    public final void Code(byte[] bArr) throws EOFException {
        int i2 = 0;
        while (i2 < bArr.length) {
            int iV = V(bArr, i2, bArr.length - i2);
            if (iV == -1) {
                throw new EOFException();
            }
            i2 += iV;
        }
    }

    @Override // com.facetec.sdk.cf.I
    public final byte D() {
        if (this.Z == 0) {
            throw new IllegalStateException("size == 0");
        }
        il ilVar = this.V;
        int i2 = ilVar.Z;
        int i3 = ilVar.I;
        int i4 = i2 + 1;
        byte b2 = ilVar.V[i2];
        this.Z--;
        if (i4 == i3) {
            this.V = ilVar.V();
            ip.Z(ilVar);
        } else {
            ilVar.Z = i4;
        }
        return b2;
    }

    @Override // com.facetec.sdk.cf.I
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final ie Code(int i2) {
        il ilVarC = C(4);
        byte[] bArr = ilVarC.V;
        int i3 = ilVarC.I;
        bArr[i3] = (byte) (i2 >>> 24);
        bArr[i3 + 1] = (byte) (i2 >>> 16);
        bArr[i3 + 2] = (byte) (i2 >>> 8);
        bArr[i3 + 3] = (byte) i2;
        ilVarC.I = i3 + 4;
        this.Z += 4;
        return this;
    }

    @Override // com.facetec.sdk.cf.I
    public final byte[] D(long j2) throws EOFException {
        is.Z(this.Z, 0L, j2);
        if (j2 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j2)));
        }
        byte[] bArr = new byte[(int) j2];
        Code(bArr);
        return bArr;
    }

    public final byte F(long j2) {
        long j3 = j2;
        is.Z(this.Z, j3, 1L);
        long j4 = this.Z;
        if (j4 - j3 <= j3) {
            long j5 = j3 - j4;
            il ilVar = this.V;
            do {
                ilVar = ilVar.D;
                j5 += (long) (ilVar.I - ilVar.Z);
            } while (j5 < 0);
            return ilVar.V[ilVar.Z + ((int) j5)];
        }
        il ilVar2 = this.V;
        while (true) {
            long j6 = ilVar2.I - ilVar2.Z;
            if (j3 < j6) {
                return ilVar2.V[ilVar2.Z + ((int) j3)];
            }
            j3 -= j6;
            ilVar2 = ilVar2.C;
        }
    }

    @Override // com.facetec.sdk.cf.I
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final ie Z(int i2) {
        il ilVarC = C(2);
        byte[] bArr = ilVarC.V;
        int i3 = ilVarC.I;
        bArr[i3] = (byte) (i2 >>> 8);
        bArr[i3 + 1] = (byte) i2;
        ilVarC.I = i3 + 2;
        this.Z += 2;
        return this;
    }

    @Override // com.facetec.sdk.cf.I
    public final boolean F() {
        return this.Z == 0;
    }

    @Override // com.facetec.sdk.cf.I
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final ie Z(byte[] bArr, int i2, int i3) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j2 = i3;
        is.Z(bArr.length, i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            il ilVarC = C(1);
            int iMin = Math.min(i4 - i2, 8192 - ilVarC.I);
            System.arraycopy(bArr, i2, ilVarC.V, ilVarC.I, iMin);
            i2 += iMin;
            ilVarC.I += iMin;
        }
        this.Z += j2;
        return this;
    }

    @Override // com.facetec.sdk.cf.I
    public final ie L() {
        return this;
    }

    @Override // com.facetec.sdk.cf.I
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final ie B(long j2) {
        boolean z2;
        if (j2 == 0) {
            return I(48);
        }
        int i2 = 1;
        if (j2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                return V("-9223372036854775808");
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 >= 100000000) {
            i2 = j2 < 1000000000000L ? j2 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j2 < MathMethodsKt.NANOS_PER_SECOND ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < EnrichmentAttributesGenerator.SEND_NOW_PLACEHOLDER ? 18 : 19;
        } else if (j2 >= 10000) {
            i2 = j2 < AnimationKt.MillisToNanos ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
        } else if (j2 >= 100) {
            i2 = j2 < 1000 ? 3 : 4;
        } else if (j2 >= 10) {
            i2 = 2;
        }
        if (z2) {
            i2++;
        }
        il ilVarC = C(i2);
        byte[] bArr = ilVarC.V;
        int i3 = ilVarC.I + i2;
        while (j2 != 0) {
            i3--;
            bArr[i3] = Code[(int) (j2 % 10)];
            j2 /= 10;
        }
        if (z2) {
            bArr[i3 - 1] = 45;
        }
        ilVarC.I += i2;
        this.Z += (long) i2;
        return this;
    }

    @Override // com.facetec.sdk.cf.I
    public final im S() {
        return im.Code;
    }

    final String S(long j2) throws EOFException {
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (F(j3) == 13) {
                String strA = a(j3);
                V(2L);
                return strA;
            }
        }
        String strA2 = a(j2);
        V(1L);
        return strA2;
    }

    public final int V(byte[] bArr, int i2, int i3) {
        is.Z(bArr.length, i2, i3);
        il ilVar = this.V;
        if (ilVar == null) {
            return -1;
        }
        int iMin = Math.min(i3, ilVar.I - ilVar.Z);
        System.arraycopy(ilVar.V, ilVar.Z, bArr, i2, iMin);
        ilVar.Z += iMin;
        this.Z -= (long) iMin;
        if (ilVar.Z == ilVar.I) {
            this.V = ilVar.V();
            ip.Z(ilVar);
        }
        return iMin;
    }

    public final long V(cf.I i2) throws IOException {
        if (i2 == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j2 = 0;
        while (true) {
            long jV = i2.V(this, 8192L);
            if (jV == -1) {
                return j2;
            }
            j2 += jV;
        }
    }

    @Override // com.facetec.sdk.cf.I
    public final long V(ie ieVar, long j2) {
        if (ieVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j2)));
        }
        long j3 = this.Z;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        ieVar.Z(this, j2);
        return j2;
    }

    public final ie V(int i2) {
        if (i2 < 128) {
            I(i2);
        } else if (i2 < 2048) {
            I((i2 >> 6) | 192);
            int i3 = (-1) - (((-1) - i2) | ((-1) - 63));
            I((i3 + 128) - (i3 & 128));
        } else if (i2 < 65536) {
            if (i2 < 55296 || i2 > 57343) {
                I((i2 >> 12) | CanonMakernoteDirectory.TAG_SENSOR_INFO_ARRAY);
                int i4 = i2 >> 6;
                I((-1) - (((-1) - ((i4 + 63) - (i4 | 63))) & ((-1) - 128)));
                int i5 = i2 & 63;
                I((i5 + 128) - (i5 & 128));
            } else {
                I(63);
            }
        } else {
            if (i2 > 1114111) {
                throw new IllegalArgumentException(new StringBuilder("Unexpected code point: ").append(Integer.toHexString(i2)).toString());
            }
            int i6 = i2 >> 18;
            I((i6 + 240) - (i6 & 240));
            I(((-1) - (((-1) - (i2 >> 12)) | ((-1) - 63))) | 128);
            int i7 = i2 >> 6;
            I((-1) - (((-1) - ((i7 + 63) - (i7 | 63))) & ((-1) - 128)));
            I(((i2 + 63) - (i2 | 63)) | 128);
        }
        return this;
    }

    public final ie V(String str, int i2, int i3, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i2 < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i2)));
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(new StringBuilder("endIndex < beginIndex: ").append(i3).append(" < ").append(i2).toString());
        }
        if (i3 > str.length()) {
            throw new IllegalArgumentException(new StringBuilder("endIndex > string.length: ").append(i3).append(" > ").append(str.length()).toString());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(is.V)) {
            return B(str, i2, i3);
        }
        byte[] bytes = str.substring(i2, i3).getBytes(charset);
        return Z(bytes, 0, bytes.length);
    }

    @Override // com.facetec.sdk.cf.I
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final ie Z(byte[] bArr) {
        if (bArr != null) {
            return Z(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.facetec.sdk.cf.I
    public final void V(long j2) throws EOFException {
        while (j2 > 0) {
            if (this.V == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j2, r0.I - this.V.Z);
            long j3 = iMin;
            this.Z -= j3;
            j2 -= j3;
            this.V.Z += iMin;
            if (this.V.Z == this.V.I) {
                il ilVar = this.V;
                this.V = ilVar.V();
                ip.Z(ilVar);
            }
        }
    }

    @Override // com.facetec.sdk.cf.I
    public final boolean V(ib ibVar) {
        return B(ibVar, ibVar.S());
    }

    public final long Z(byte b2, long j2, long j3) {
        il ilVar;
        long j4 = 0;
        if (j2 < 0 || j3 < j2) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.Z), Long.valueOf(j2), Long.valueOf(j3)));
        }
        long j5 = this.Z;
        if (j3 > j5) {
            j3 = j5;
        }
        if (j2 == j3 || (ilVar = this.V) == null) {
            return -1L;
        }
        if (j5 - j2 < j2) {
            while (j5 > j2) {
                ilVar = ilVar.D;
                j5 -= (long) (ilVar.I - ilVar.Z);
            }
        } else {
            while (true) {
                long j6 = ((long) (ilVar.I - ilVar.Z)) + j4;
                if (j6 >= j2) {
                    break;
                }
                ilVar = ilVar.C;
                j4 = j6;
            }
            j5 = j4;
        }
        while (j5 < j3) {
            byte[] bArr = ilVar.V;
            int iMin = (int) Math.min(ilVar.I, (((long) ilVar.Z) + j3) - j5);
            for (int i2 = (int) ((((long) ilVar.Z) + j2) - j5); i2 < iMin; i2++) {
                if (bArr[i2] == b2) {
                    return ((long) (i2 - ilVar.Z)) + j5;
                }
            }
            j5 += (long) (ilVar.I - ilVar.Z);
            ilVar = ilVar.C;
            j2 = j5;
        }
        return -1L;
    }

    @Override // com.facetec.sdk.cf.I
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final ie V(String str) {
        return B(str, 0, str.length());
    }

    @Override // com.facetec.sdk.cf.I
    public final void Z(long j2) throws EOFException {
        if (this.Z < j2) {
            throw new EOFException();
        }
    }

    @Override // com.facetec.sdk.cf.I
    public final void Z(ie ieVar, long j2) {
        il ilVarCode;
        long j3 = j2;
        if (ieVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (ieVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        is.Z(ieVar.Z, 0L, j3);
        while (j3 > 0) {
            if (j3 < ieVar.V.I - ieVar.V.Z) {
                il ilVar = this.V;
                il ilVar2 = ilVar != null ? ilVar.D : null;
                if (ilVar2 != null && ilVar2.Code) {
                    if ((((long) ilVar2.I) + j3) - ((long) (ilVar2.B ? 0 : ilVar2.Z)) <= 8192) {
                        ieVar.V.B(ilVar2, (int) j3);
                        ieVar.Z -= j3;
                        this.Z += j3;
                        return;
                    }
                }
                il ilVar3 = ieVar.V;
                int i2 = (int) j3;
                if (i2 <= 0 || i2 > ilVar3.I - ilVar3.Z) {
                    throw new IllegalArgumentException();
                }
                if (i2 >= 1024) {
                    ilVarCode = ilVar3.Z();
                } else {
                    ilVarCode = ip.Code();
                    System.arraycopy(ilVar3.V, ilVar3.Z, ilVarCode.V, 0, i2);
                }
                ilVarCode.I = ilVarCode.Z + i2;
                ilVar3.Z += i2;
                ilVar3.D.Z(ilVarCode);
                ieVar.V = ilVarCode;
            }
            il ilVar4 = ieVar.V;
            long j4 = ilVar4.I - ilVar4.Z;
            ieVar.V = ilVar4.V();
            il ilVar5 = this.V;
            if (ilVar5 == null) {
                this.V = ilVar4;
                ilVar4.D = ilVar4;
                ilVar4.C = ilVar4;
            } else {
                il ilVarZ = ilVar5.D.Z(ilVar4);
                if (ilVarZ.D == ilVarZ) {
                    throw new IllegalStateException();
                }
                if (ilVarZ.D.Code) {
                    int i3 = ilVarZ.I - ilVarZ.Z;
                    if (i3 <= (8192 - ilVarZ.D.I) + (ilVarZ.D.B ? 0 : ilVarZ.D.Z)) {
                        ilVarZ.B(ilVarZ.D, i3);
                        ilVarZ.V();
                        ip.Z(ilVarZ);
                    }
                }
            }
            ieVar.Z -= j4;
            this.Z += j4;
            j3 -= j4;
        }
    }

    @Override // com.facetec.sdk.cf.I
    public final int a() {
        return is.I(d());
    }

    @Override // com.facetec.sdk.cf.I
    public final short b() {
        if (this.Z < 2) {
            throw new IllegalStateException(new StringBuilder("size < 2: ").append(this.Z).toString());
        }
        il ilVar = this.V;
        int i2 = ilVar.Z;
        int i3 = ilVar.I;
        if (i3 - i2 < 2) {
            int iD = ((-1) - (((-1) - D()) | ((-1) - 255))) << 8;
            int iD2 = D() & 255;
            return (short) ((iD + iD2) - (iD & iD2));
        }
        byte[] bArr = ilVar.V;
        int i4 = i2 + 1;
        int i5 = (bArr[i2] & 255) << 8;
        int i6 = i2 + 2;
        int i7 = bArr[i4] & 255;
        int i8 = (i7 + i5) - (i7 & i5);
        this.Z -= 2;
        if (i6 == i3) {
            this.V = ilVar.V();
            ip.Z(ilVar);
        } else {
            ilVar.Z = i6;
        }
        return (short) i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f A[EDGE_INSN: B:43:0x006f->B:32:0x006f BREAK  A[LOOP:0: B:5:0x000f->B:45:?], SYNTHETIC] */
    @Override // com.facetec.sdk.cf.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c() {
        /*
            r19 = this;
            r8 = r19
            long r1 = r8.Z
            r17 = 0
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 == 0) goto Lb8
            r11 = 0
            r16 = r11
            r4 = r17
        Lf:
            com.facetec.sdk.il r14 = r8.V
            byte[] r15 = r14.V
            int r13 = r14.Z
            int r12 = r14.I
        L17:
            if (r13 >= r12) goto L5e
            r3 = r15[r13]
            r0 = 48
            if (r3 < r0) goto L44
            r0 = 57
            if (r3 > r0) goto L44
            int r2 = r3 + (-48)
        L25:
            r0 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            r9 = -1
            long r6 = r9 - r0
            long r0 = r9 - r4
            long r6 = r6 | r0
            long r9 = r9 - r6
            int r0 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r0 != 0) goto L79
            r0 = 4
            long r4 = r4 << r0
            long r9 = (long) r2
            r6 = -1
            long r2 = r6 - r4
            long r0 = r6 - r9
            long r2 = r2 & r0
            long r6 = r6 - r2
            r4 = r6
            int r13 = r13 + 1
            int r11 = r11 + 1
            goto L17
        L44:
            r0 = 97
            if (r3 < r0) goto L4f
            r0 = 102(0x66, float:1.43E-43)
            if (r3 > r0) goto L4f
            int r2 = r3 + (-87)
            goto L25
        L4f:
            r0 = 65
            if (r3 < r0) goto L5a
            r0 = 70
            if (r3 > r0) goto L5a
            int r2 = r3 + (-55)
            goto L25
        L5a:
            if (r11 == 0) goto L9f
            r16 = 1
        L5e:
            if (r13 != r12) goto L76
            com.facetec.sdk.il r0 = r14.V()
            r8.V = r0
            com.facetec.sdk.ip.Z(r14)
        L69:
            if (r16 != 0) goto L6f
            com.facetec.sdk.il r0 = r8.V
            if (r0 != 0) goto Lf
        L6f:
            long r2 = r8.Z
            long r0 = (long) r11
            long r2 = r2 - r0
            r8.Z = r2
            return r4
        L76:
            r14.Z = r13
            goto L69
        L79:
            com.facetec.sdk.ie r0 = new com.facetec.sdk.ie
            r0.<init>()
            com.facetec.sdk.ie r0 = r0.I(r4)
            com.facetec.sdk.ie r3 = r0.I(r3)
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Number too large: "
            r1.<init>(r0)
            java.lang.String r0 = r3.n()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L9f:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r3)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        Lb8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "size == 0"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ie.c():long");
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        ie ieVar = new ie();
        if (this.Z == 0) {
            return ieVar;
        }
        il ilVarZ = this.V.Z();
        ieVar.V = ilVarZ;
        ilVarZ.D = ilVarZ;
        ilVarZ.C = ilVarZ;
        il ilVar = this.V;
        while (true) {
            ilVar = ilVar.C;
            if (ilVar == this.V) {
                ieVar.Z = this.Z;
                return ieVar;
            }
            ieVar.V.D.Z(ilVar.Z());
        }
    }

    @Override // com.facetec.sdk.cf.I, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    @Override // com.facetec.sdk.cf.I
    public final int d() {
        if (this.Z < 4) {
            throw new IllegalStateException(new StringBuilder("size < 4: ").append(this.Z).toString());
        }
        il ilVar = this.V;
        int i2 = ilVar.Z;
        int i3 = ilVar.I;
        if (i3 - i2 < 4) {
            byte bD = D();
            int i4 = ((bD + 255) - (bD | 255)) << 24;
            int iD = ((-1) - (((-1) - D()) | ((-1) - 255))) << 16;
            return (-1) - (((-1) - (((i4 + iD) - (i4 & iD)) | ((D() & 255) << 8))) & ((-1) - (D() & 255)));
        }
        byte[] bArr = ilVar.V;
        int i5 = (((-1) - (((-1) - bArr[i2 + 1]) | ((-1) - 255))) << 16) | (((-1) - (((-1) - bArr[i2]) | ((-1) - 255))) << 24);
        int i6 = i2 + 3;
        byte b2 = bArr[i2 + 2];
        int i7 = ((b2 + 255) - (b2 | 255)) << 8;
        int i8 = i2 + 4;
        int i9 = (bArr[i6] & 255) | ((i5 + i7) - (i5 & i7));
        this.Z -= 4;
        if (i8 == i3) {
            this.V = ilVar.V();
            ip.Z(ilVar);
        } else {
            ilVar.Z = i8;
        }
        return i9;
    }

    @Override // com.facetec.sdk.cf.I
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ie I(long j2) {
        if (j2 == 0) {
            return I(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j2)) / 4) + 1;
        il ilVarC = C(iNumberOfTrailingZeros);
        byte[] bArr = ilVarC.V;
        int i2 = ilVarC.I;
        for (int i3 = (ilVarC.I + iNumberOfTrailingZeros) - 1; i3 >= i2; i3--) {
            bArr[i3] = Code[(int) ((15 + j2) - (15 | j2))];
            j2 >>>= 4;
        }
        ilVarC.I += iNumberOfTrailingZeros;
        this.Z += (long) iNumberOfTrailingZeros;
        return this;
    }

    @Override // com.facetec.sdk.cf.I
    public final short e() {
        return is.I(b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie)) {
            return false;
        }
        ie ieVar = (ie) obj;
        long j2 = this.Z;
        if (j2 != ieVar.Z) {
            return false;
        }
        long j3 = 0;
        if (j2 == 0) {
            return true;
        }
        il ilVar = this.V;
        il ilVar2 = ieVar.V;
        int i2 = ilVar.Z;
        int i3 = ilVar2.Z;
        while (j3 < this.Z) {
            long jMin = Math.min(ilVar.I - i2, ilVar2.I - i3);
            int i4 = 0;
            while (i4 < jMin) {
                int i5 = i2 + 1;
                int i6 = i3 + 1;
                if (ilVar.V[i2] != ilVar2.V[i3]) {
                    return false;
                }
                i4++;
                i2 = i5;
                i3 = i6;
            }
            if (i2 == ilVar.I) {
                ilVar = ilVar.C;
                i2 = ilVar.Z;
            }
            if (i3 == ilVar2.I) {
                ilVar2 = ilVar2.C;
                i3 = ilVar2.Z;
            }
            j3 += jMin;
        }
        return true;
    }

    public final long f() {
        long j2 = this.Z;
        if (j2 == 0) {
            return 0L;
        }
        il ilVar = this.V.D;
        return (ilVar.I >= 8192 || !ilVar.Code) ? j2 : j2 - ((long) (ilVar.I - ilVar.Z));
    }

    @Override // com.facetec.sdk.cf.I, java.io.Flushable
    public final void flush() {
    }

    @Override // com.facetec.sdk.cf.I
    public final long g() {
        return Z((byte) 0, 0L, Long.MAX_VALUE);
    }

    public final long h() {
        return this.Z;
    }

    public final int hashCode() {
        il ilVar = this.V;
        if (ilVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = ilVar.I;
            for (int i4 = ilVar.Z; i4 < i3; i4++) {
                i2 = (i2 * 31) + ilVar.V[i4];
            }
            ilVar = ilVar.C;
        } while (ilVar != this.V);
        return i2;
    }

    public final ib i() {
        return new ib(o());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // com.facetec.sdk.cf.I
    public final String j() throws EOFException {
        return C(Long.MAX_VALUE);
    }

    public final void m() {
        try {
            V(this.Z);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public final String n() {
        try {
            return V(this.Z, is.V);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] o() {
        try {
            return D(this.Z);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        il ilVar = this.V;
        if (ilVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), ilVar.I - ilVar.Z);
        byteBuffer.put(ilVar.V, ilVar.Z, iMin);
        ilVar.Z += iMin;
        this.Z -= (long) iMin;
        if (ilVar.Z == ilVar.I) {
            this.V = ilVar.V();
            ip.Z(ilVar);
        }
        return iMin;
    }

    public final String toString() {
        long j2 = this.Z;
        if (j2 > 2147483647L) {
            throw new IllegalArgumentException(new StringBuilder("size > Integer.MAX_VALUE: ").append(this.Z).toString());
        }
        int i2 = (int) j2;
        return (i2 == 0 ? ib.Code : new in(this, i2)).toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i2 = iRemaining;
        while (i2 > 0) {
            il ilVarC = C(1);
            int iMin = Math.min(i2, 8192 - ilVarC.I);
            byteBuffer.get(ilVarC.V, ilVarC.I, iMin);
            i2 -= iMin;
            ilVarC.I += iMin;
        }
        this.Z += (long) iRemaining;
        return iRemaining;
    }
}
