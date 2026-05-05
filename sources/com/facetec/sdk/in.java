package com.facetec.sdk;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class in extends ib {
    private transient byte[][] I;
    private transient int[] Z;

    in(ie ieVar, int i2) {
        super(null);
        is.Z(ieVar.Z, 0L, i2);
        il ilVar = ieVar.V;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            if (ilVar.I == ilVar.Z) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += ilVar.I - ilVar.Z;
            i5++;
            ilVar = ilVar.C;
        }
        this.I = new byte[i5][];
        this.Z = new int[i5 << 1];
        il ilVar2 = ieVar.V;
        int i6 = 0;
        while (i3 < i2) {
            this.I[i6] = ilVar2.V;
            i3 += ilVar2.I - ilVar2.Z;
            if (i3 > i2) {
                i3 = i2;
            }
            int[] iArr = this.Z;
            iArr[i6] = i3;
            iArr[this.I.length + i6] = ilVar2.Z;
            ilVar2.B = true;
            i6++;
            ilVar2 = ilVar2.C;
        }
    }

    private ib C() {
        return new ib(D());
    }

    private int V(int i2) {
        int iBinarySearch = Arrays.binarySearch(this.Z, 0, this.I.length, i2 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private Object writeReplace() {
        return C();
    }

    @Override // com.facetec.sdk.ib
    public final byte B(int i2) {
        is.Z(this.Z[this.I.length - 1], i2, 1L);
        int iV = V(i2);
        int i3 = iV == 0 ? 0 : this.Z[iV - 1];
        int[] iArr = this.Z;
        byte[][] bArr = this.I;
        return bArr[iV][(i2 - i3) + iArr[bArr.length + iV]];
    }

    @Override // com.facetec.sdk.ib
    public final ib B() {
        return C().B();
    }

    @Override // com.facetec.sdk.ib
    public final String Code() {
        return C().Code();
    }

    @Override // com.facetec.sdk.ib
    final void Code(ie ieVar) {
        int length = this.I.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.Z;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            il ilVar = new il(this.I[i2], i4, (i4 + i5) - i3);
            if (ieVar.V == null) {
                ilVar.D = ilVar;
                ilVar.C = ilVar;
                ieVar.V = ilVar;
            } else {
                ieVar.V.D.Z(ilVar);
            }
            i2++;
            i3 = i5;
        }
        ieVar.Z += (long) i3;
    }

    @Override // com.facetec.sdk.ib
    public final byte[] D() {
        int[] iArr = this.Z;
        byte[][] bArr = this.I;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr2 = this.Z;
            int i4 = iArr2[length + i2];
            int i5 = iArr2[i2];
            System.arraycopy(this.I[i2], i4, bArr2, i3, i5 - i3);
            i2++;
            i3 = i5;
        }
        return bArr2;
    }

    @Override // com.facetec.sdk.ib
    public final String I() {
        return C().I();
    }

    @Override // com.facetec.sdk.ib
    public final boolean I(int i2, ib ibVar, int i3, int i4) {
        if (S() - i4 < 0) {
            return false;
        }
        int iV = V(0);
        while (i4 > 0) {
            int i5 = iV == 0 ? 0 : this.Z[iV - 1];
            int iMin = Math.min(i4, ((this.Z[iV] - i5) + i5) - i2);
            int[] iArr = this.Z;
            byte[][] bArr = this.I;
            if (!ibVar.Z(i3, bArr[iV], (i2 - i5) + iArr[bArr.length + iV], iMin)) {
                return false;
            }
            i2 += iMin;
            i3 += iMin;
            i4 -= iMin;
            iV++;
        }
        return true;
    }

    @Override // com.facetec.sdk.ib
    public final ib L() {
        return C().L();
    }

    @Override // com.facetec.sdk.ib
    public final int S() {
        return this.Z[this.I.length - 1];
    }

    @Override // com.facetec.sdk.ib
    public final ib V() {
        return C().V();
    }

    @Override // com.facetec.sdk.ib
    public final ib Z(int i2, int i3) {
        return C().Z(i2, i3);
    }

    @Override // com.facetec.sdk.ib
    public final String Z() {
        return C().Z();
    }

    @Override // com.facetec.sdk.ib
    public final boolean Z(int i2, byte[] bArr, int i3, int i4) {
        if (i2 < 0 || i2 > S() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int iV = V(i2);
        while (i4 > 0) {
            int i5 = iV == 0 ? 0 : this.Z[iV - 1];
            int iMin = Math.min(i4, ((this.Z[iV] - i5) + i5) - i2);
            int[] iArr = this.Z;
            byte[][] bArr2 = this.I;
            if (!is.Z(bArr2[iV], (i2 - i5) + iArr[bArr2.length + iV], bArr, i3, iMin)) {
                return false;
            }
            i2 += iMin;
            i3 += iMin;
            i4 -= iMin;
            iV++;
        }
        return true;
    }

    @Override // com.facetec.sdk.ib
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ib) {
            ib ibVar = (ib) obj;
            if (ibVar.S() == S() && I(0, ibVar, 0, S())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facetec.sdk.ib
    public final int hashCode() {
        int i2 = this.V;
        if (i2 != 0) {
            return i2;
        }
        int length = this.I.length;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i3 < length) {
            byte[] bArr = this.I[i3];
            int[] iArr = this.Z;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            int i8 = (i7 - i5) + i6;
            while (i6 < i8) {
                i4 = (i4 * 31) + bArr[i6];
                i6++;
            }
            i3++;
            i5 = i7;
        }
        this.V = i4;
        return i4;
    }

    @Override // com.facetec.sdk.ib
    public final String toString() {
        return C().toString();
    }
}
