package com.google.android.gms.internal.mlkit_vision_object_detection_bundled;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes8.dex */
final class zzbl extends zzat {
    static final zzat zza = new zzbl(null, new Object[0], 0);
    final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzbl(@CheckForNull Object obj, Object[] objArr, int i2) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v3 */
    static zzbl zzh(int i2, Object[] objArr, zzas zzasVar) {
        int iHighestOneBit;
        short[] sArr;
        char c2;
        ?? r2;
        ?? r22;
        if (i2 == 0) {
            return (zzbl) zza;
        }
        zzar zzarVar = null;
        ?? r23 = 0;
        zzar zzarVar2 = null;
        zzar zzarVar3 = null;
        int i3 = 1;
        if (i2 == 1) {
            zzw.zzb(Objects.requireNonNull(objArr[0]), Objects.requireNonNull(objArr[1]));
            return new zzbl(null, objArr, 1);
        }
        zzd.zzb(i2, objArr.length >> 1, FirebaseAnalytics.Param.INDEX);
        char c3 = 2;
        int iMax = Math.max(i2, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i2 == 1) {
            zzw.zzb(Objects.requireNonNull(objArr[0]), Objects.requireNonNull(objArr[1]));
            i2 = 1;
            c2 = 1;
        } else {
            int i4 = iHighestOneBit - 1;
            byte b2 = -1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i5 = 0;
                int i6 = 0;
                while (i5 < i2) {
                    int i7 = i6 + i6;
                    int i8 = i5 + i5;
                    Object objRequireNonNull = Objects.requireNonNull(objArr[i8]);
                    Object objRequireNonNull2 = Objects.requireNonNull(objArr[i8 ^ i3]);
                    zzw.zzb(objRequireNonNull, objRequireNonNull2);
                    int iZza = zzai.zza(objRequireNonNull.hashCode());
                    while (true) {
                        int i9 = iZza & i4;
                        int i10 = (-1) - (((-1) - bArr[i9]) | ((-1) - 255));
                        if (i10 == 255) {
                            bArr[i9] = (byte) i7;
                            if (i6 < i5) {
                                objArr[i7] = objRequireNonNull;
                                objArr[i7 ^ 1] = objRequireNonNull2;
                            }
                            i6++;
                        } else {
                            if (objRequireNonNull.equals(objArr[i10])) {
                                int i11 = i10 ^ 1;
                                zzarVar2 = new zzar(objRequireNonNull, objRequireNonNull2, Objects.requireNonNull(objArr[i11]));
                                objArr[i11] = objRequireNonNull2;
                                break;
                            }
                            iZza = i9 + 1;
                        }
                    }
                    i5++;
                    i3 = 1;
                }
                if (i6 == i2) {
                    r2 = bArr;
                } else {
                    c3 = 2;
                    r22 = new Object[]{bArr, Integer.valueOf(i6), zzarVar2};
                    c2 = 1;
                    r23 = r22;
                }
            } else if (iHighestOneBit <= 32768) {
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i12 = 0;
                for (int i13 = 0; i13 < i2; i13++) {
                    int i14 = i12 + i12;
                    int i15 = i13 + i13;
                    Object objRequireNonNull3 = Objects.requireNonNull(objArr[i15]);
                    Object objRequireNonNull4 = Objects.requireNonNull(objArr[i15 ^ 1]);
                    zzw.zzb(objRequireNonNull3, objRequireNonNull4);
                    int iZza2 = zzai.zza(objRequireNonNull3.hashCode());
                    while (true) {
                        int i16 = iZza2 & i4;
                        char c4 = (char) sArr[i16];
                        if (c4 == 65535) {
                            sArr[i16] = (short) i14;
                            if (i12 < i13) {
                                objArr[i14] = objRequireNonNull3;
                                objArr[i14 ^ 1] = objRequireNonNull4;
                            }
                            i12++;
                        } else {
                            if (objRequireNonNull3.equals(objArr[c4])) {
                                int i17 = c4 ^ 1;
                                zzarVar3 = new zzar(objRequireNonNull3, objRequireNonNull4, Objects.requireNonNull(objArr[i17 == true ? 1 : 0]));
                                objArr[i17 == true ? 1 : 0] = objRequireNonNull4;
                                break;
                            }
                            iZza2 = i16 + 1;
                        }
                    }
                }
                if (i12 != i2) {
                    c2 = 1;
                    c3 = 2;
                    r23 = new Object[]{sArr, Integer.valueOf(i12), zzarVar3};
                }
                r2 = sArr;
            } else {
                int i18 = 1;
                sArr = new int[iHighestOneBit];
                Arrays.fill((int[]) sArr, -1);
                int i19 = 0;
                int i20 = 0;
                while (i19 < i2) {
                    int i21 = i20 + i20;
                    int i22 = i19 + i19;
                    Object objRequireNonNull5 = Objects.requireNonNull(objArr[i22]);
                    Object objRequireNonNull6 = Objects.requireNonNull(objArr[i22 ^ i18]);
                    zzw.zzb(objRequireNonNull5, objRequireNonNull6);
                    int iZza3 = zzai.zza(objRequireNonNull5.hashCode());
                    while (true) {
                        int i23 = (-1) - (((-1) - iZza3) | ((-1) - i4));
                        ?? r1 = sArr[i23];
                        if (r1 == b2) {
                            sArr[i23] = i21;
                            if (i20 < i19) {
                                objArr[i21] = objRequireNonNull5;
                                objArr[i21 ^ 1] = objRequireNonNull6;
                            }
                            i20++;
                        } else {
                            if (objRequireNonNull5.equals(objArr[r1])) {
                                int i24 = r1 ^ 1;
                                zzarVar = new zzar(objRequireNonNull5, objRequireNonNull6, Objects.requireNonNull(objArr[i24 == true ? 1 : 0]));
                                objArr[i24 == true ? 1 : 0] = objRequireNonNull6;
                                break;
                            }
                            iZza3 = i23 + 1;
                            b2 = -1;
                        }
                    }
                    i19++;
                    i18 = 1;
                    b2 = -1;
                }
                if (i20 != i2) {
                    c2 = 1;
                    c3 = 2;
                    r23 = new Object[]{sArr, Integer.valueOf(i20), zzarVar};
                }
                r2 = sArr;
            }
            c3 = 2;
            r22 = r2;
            c2 = 1;
            r23 = r22;
        }
        boolean z2 = r23 instanceof Object[];
        ?? r24 = r23;
        if (z2) {
            Object[] objArr2 = (Object[]) r23;
            zzar zzarVar4 = (zzar) objArr2[c3];
            if (zzasVar == null) {
                throw zzarVar4.zza();
            }
            zzasVar.zzc = zzarVar4;
            Object obj = objArr2[0];
            i2 = ((Integer) objArr2[c2]).intValue();
            objArr = Arrays.copyOf(objArr, i2 + i2);
            r24 = obj;
        }
        return new zzbl(r24, objArr, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:18:0x0039->B:24:0x004f], EDGE_INSN: B:47:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:28:0x0063->B:34:0x0080], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:36:0x008f->B:42:0x00a7]] */
    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzat, java.util.Map
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r9) {
        /*
            r8 = this;
            r7 = 0
            if (r9 != 0) goto L7
        L3:
            r0 = r7
        L4:
            if (r0 != 0) goto Laa
            return r7
        L7:
            int r0 = r8.zzd
            java.lang.Object[] r4 = r8.zzb
            r1 = 1
            if (r0 != r1) goto L22
            r0 = 0
            r0 = r4[r0]
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L3
            r0 = r4[r1]
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            goto L4
        L22:
            java.lang.Object r5 = r8.zzc
            if (r5 != 0) goto L27
            goto L3
        L27:
            boolean r0 = r5 instanceof byte[]
            r6 = -1
            if (r0 == 0) goto L52
            byte[] r5 = (byte[]) r5
            int r0 = r5.length
            int r3 = r0 + (-1)
            int r0 = r9.hashCode()
            int r2 = com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzai.zza(r0)
        L39:
            r2 = r2 & r3
            r1 = r5[r2]
            r0 = 255(0xff, float:3.57E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L42
            goto L3
        L42:
            r0 = r4[r1]
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L4f
            r0 = r1 ^ 1
            r0 = r4[r0]
            goto L4
        L4f:
            int r2 = r2 + 1
            goto L39
        L52:
            boolean r0 = r5 instanceof short[]
            if (r0 == 0) goto L83
            short[] r5 = (short[]) r5
            int r0 = r5.length
            int r3 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzai.zza(r0)
        L63:
            int r1 = (-1) - r0
            int r0 = (-1) - r3
            r1 = r1 | r0
            int r2 = (-1) - r1
            short r0 = r5[r2]
            char r1 = (char) r0
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r1 != r0) goto L73
            goto L3
        L73:
            r0 = r4[r1]
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L80
            r0 = r1 ^ 1
            r0 = r4[r0]
            goto L4
        L80:
            int r0 = r2 + 1
            goto L63
        L83:
            int[] r5 = (int[]) r5
            int r3 = r5.length
            int r3 = r3 + r6
            int r0 = r9.hashCode()
            int r0 = com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzai.zza(r0)
        L8f:
            int r2 = r0 + r3
            r0 = r0 | r3
            int r2 = r2 - r0
            r1 = r5[r2]
            if (r1 != r6) goto L99
            goto L3
        L99:
            r0 = r4[r1]
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto La7
            r0 = r1 ^ 1
            r0 = r4[r0]
            goto L4
        La7:
            int r0 = r2 + 1
            goto L8f
        Laa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzbl.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzat
    final zzal zza() {
        return new zzbk(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzat
    final zzau zze() {
        return new zzbi(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_object_detection_bundled.zzat
    final zzau zzf() {
        return new zzbj(this, new zzbk(this.zzb, 0, this.zzd));
    }
}
