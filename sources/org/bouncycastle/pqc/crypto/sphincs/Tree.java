package org.bouncycastle.pqc.crypto.sphincs;

/* JADX INFO: loaded from: classes2.dex */
class Tree {

    static class leafaddr {
        int level;
        long subleaf;
        long subtree;

        public leafaddr() {
        }

        public leafaddr(leafaddr leafaddrVar) {
            this.level = leafaddrVar.level;
            this.subtree = leafaddrVar.subtree;
            this.subleaf = leafaddrVar.subleaf;
        }
    }

    Tree() {
    }

    static void gen_leaf_wots(HashFunctions hashFunctions, byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, leafaddr leafaddrVar) {
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[2144];
        Wots wots = new Wots();
        Seed.get_seed(hashFunctions, bArr4, 0, bArr3, leafaddrVar);
        wots.wots_pkgen(hashFunctions, bArr5, 0, bArr4, 0, bArr2, i3);
        l_tree(hashFunctions, bArr, i2, bArr5, 0, bArr2, i3);
    }

    static void l_tree(HashFunctions hashFunctions, byte[] bArr, int i2, byte[] bArr2, int i3, byte[] bArr3, int i4) {
        int i5;
        int i6 = 67;
        for (int i7 = 0; i7 < 7; i7++) {
            int i8 = 0;
            while (true) {
                i5 = i6 >>> 1;
                if (i8 >= i5) {
                    break;
                }
                hashFunctions.hash_2n_n_mask(bArr2, i3 + (i8 * 32), bArr2, i3 + (i8 * 64), bArr3, i4 + (i7 * 64));
                i8++;
            }
            if ((-1) - (((-1) - i6) | ((-1) - 1)) != 0) {
                System.arraycopy(bArr2, i3 + ((i6 - 1) * 32), bArr2, (i5 * 32) + i3, 32);
                i5++;
            }
            i6 = i5;
        }
        System.arraycopy(bArr2, i3, bArr, i2, 32);
    }

    static void treehash(HashFunctions hashFunctions, byte[] bArr, int i2, int i3, byte[] bArr2, leafaddr leafaddrVar, byte[] bArr3, int i4) {
        leafaddr leafaddrVar2 = new leafaddr(leafaddrVar);
        int i5 = i3 + 1;
        byte[] bArr4 = new byte[i5 * 32];
        int[] iArr = new int[i5];
        int i6 = (int) (leafaddrVar2.subleaf + ((long) (1 << i3)));
        int i7 = 0;
        while (leafaddrVar2.subleaf < i6) {
            gen_leaf_wots(hashFunctions, bArr4, i7 * 32, bArr3, i4, bArr2, leafaddrVar2);
            iArr[i7] = 0;
            i7++;
            while (i7 > 1) {
                int i8 = iArr[i7 - 1];
                int i9 = i7 - 2;
                if (i8 == iArr[i9]) {
                    int i10 = i9 * 32;
                    hashFunctions.hash_2n_n_mask(bArr4, i10, bArr4, i10, bArr3, i4 + ((i8 + 7) * 64));
                    iArr[i9] = iArr[i9] + 1;
                    i7--;
                }
            }
            leafaddrVar2.subleaf++;
        }
        for (int i11 = 0; i11 < 32; i11++) {
            bArr[i2 + i11] = bArr4[i11];
        }
    }
}
