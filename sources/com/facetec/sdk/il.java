package com.facetec.sdk;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class il {
    boolean B;
    il C;
    boolean Code;
    il D;
    int I;
    final byte[] V;
    int Z;

    il() {
        this.V = new byte[8192];
        this.Code = true;
        this.B = false;
    }

    il(byte[] bArr, int i2, int i3) {
        this.V = bArr;
        this.Z = i2;
        this.I = i3;
        this.B = true;
        this.Code = false;
    }

    public final void B(il ilVar, int i2) {
        if (!ilVar.Code) {
            throw new IllegalArgumentException();
        }
        int i3 = ilVar.I;
        if (i3 + i2 > 8192) {
            if (ilVar.B) {
                throw new IllegalArgumentException();
            }
            int i4 = ilVar.Z;
            if ((i3 + i2) - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = ilVar.V;
            System.arraycopy(bArr, i4, bArr, 0, i3 - i4);
            ilVar.I -= ilVar.Z;
            ilVar.Z = 0;
        }
        System.arraycopy(this.V, this.Z, ilVar.V, ilVar.I, i2);
        ilVar.I += i2;
        this.Z += i2;
    }

    @Nullable
    public final il V() {
        il ilVar = this.C;
        il ilVar2 = ilVar != this ? ilVar : null;
        il ilVar3 = this.D;
        ilVar3.C = ilVar;
        this.C.D = ilVar3;
        this.C = null;
        this.D = null;
        return ilVar2;
    }

    final il Z() {
        this.B = true;
        return new il(this.V, this.Z, this.I);
    }

    public final il Z(il ilVar) {
        ilVar.D = this;
        ilVar.C = this.C;
        this.C.D = ilVar;
        this.C = ilVar;
        return ilVar;
    }
}
