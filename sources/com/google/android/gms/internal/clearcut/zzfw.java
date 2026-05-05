package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes8.dex */
public final class zzfw implements Cloneable {
    private static final zzfx zzrl = new zzfx();
    private int mSize;
    private boolean zzrm;
    private int[] zzrn;
    private zzfx[] zzro;

    zzfw() {
        this(10);
    }

    private zzfw(int i2) {
        this.zzrm = false;
        int i3 = i2 << 2;
        int i4 = 4;
        while (true) {
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (i3 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 4;
        this.zzrn = new int[i6];
        this.zzro = new zzfx[i6];
        this.mSize = 0;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i2 = this.mSize;
        zzfw zzfwVar = new zzfw(i2);
        System.arraycopy(this.zzrn, 0, zzfwVar.zzrn, 0, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            zzfx zzfxVar = this.zzro[i3];
            if (zzfxVar != null) {
                zzfwVar.zzro[i3] = (zzfx) zzfxVar.clone();
            }
        }
        zzfwVar.mSize = i2;
        return zzfwVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfw)) {
            return false;
        }
        zzfw zzfwVar = (zzfw) obj;
        int i2 = this.mSize;
        if (i2 != zzfwVar.mSize) {
            return false;
        }
        int[] iArr = this.zzrn;
        int[] iArr2 = zzfwVar.zzrn;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                zzfx[] zzfxVarArr = this.zzro;
                zzfx[] zzfxVarArr2 = zzfwVar.zzro;
                int i4 = this.mSize;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (zzfxVarArr[i5].equals(zzfxVarArr2[i5])) {
                    }
                }
                return true;
            }
            if (iArr[i3] != iArr2[i3]) {
                break;
            }
            i3++;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 17;
        for (int i2 = 0; i2 < this.mSize; i2++) {
            iHashCode = (((iHashCode * 31) + this.zzrn[i2]) * 31) + this.zzro[i2].hashCode();
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.mSize == 0;
    }

    final int size() {
        return this.mSize;
    }

    final zzfx zzaq(int i2) {
        return this.zzro[i2];
    }
}
