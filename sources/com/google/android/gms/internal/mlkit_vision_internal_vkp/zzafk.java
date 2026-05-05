package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public final class zzafk implements Closeable {
    private final Reader zzb;
    private long zzi;
    private int zzj;
    private int[] zzk;
    private String[] zzm;
    private int[] zzn;
    private zzaet zzc = zzaet.LEGACY_STRICT;
    private final char[] zzd = new char[1024];
    private int zze = 0;
    private int zzf = 0;
    private int zzg = 0;
    private int zzh = 0;
    int zza = 0;
    private int zzl = 1;

    static {
        zzaev.zza = new zzafj();
    }

    public zzafk(Reader reader) {
        int[] iArr = new int[32];
        this.zzk = iArr;
        iArr[0] = 6;
        this.zzm = new String[32];
        this.zzn = new int[32];
        this.zzb = (Reader) Objects.requireNonNull(reader, "in == null");
    }

    private final int zzo(boolean z2) throws IOException {
        int i2;
        int i3 = this.zze;
        int i4 = this.zzf;
        while (true) {
            if (i3 == i4) {
                this.zze = i3;
                if (!zzw(1)) {
                    if (z2) {
                        throw new EOFException("End of input".concat(zzc()));
                    }
                    return -1;
                }
                i3 = this.zze;
                i4 = this.zzf;
            }
            char[] cArr = this.zzd;
            int i5 = i3 + 1;
            char c2 = cArr[i3];
            if (c2 == '\n') {
                this.zzg++;
                this.zzh = i5;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.zze = i5;
                    if (i5 == i4) {
                        this.zze = i3;
                        boolean zZzw = zzw(2);
                        this.zze++;
                        if (!zZzw) {
                            return 47;
                        }
                    }
                    zzt();
                    int i6 = this.zze;
                    char c3 = cArr[i6];
                    if (c3 == '*') {
                        this.zze = i6 + 1;
                        while (true) {
                            if (this.zze + 2 > this.zzf && !zzw(2)) {
                                throw zzp("Unterminated comment");
                            }
                            char[] cArr2 = this.zzd;
                            int i7 = this.zze;
                            if (cArr2[i7] != '\n') {
                                while (i2 < 2) {
                                    i2 = this.zzd[this.zze + i2] == "*/".charAt(i2) ? i2 + 1 : 0;
                                }
                                i3 = this.zze + 2;
                                i4 = this.zzf;
                                break;
                            }
                            this.zzg++;
                            this.zzh = i7 + 1;
                            this.zze++;
                        }
                    } else {
                        if (c3 != '/') {
                            return 47;
                        }
                        this.zze = i6 + 1;
                        zzv();
                        i3 = this.zze;
                        i4 = this.zzf;
                    }
                } else {
                    if (c2 != '#') {
                        this.zze = i5;
                        return c2;
                    }
                    this.zze = i5;
                    zzt();
                    zzv();
                    i3 = this.zze;
                    i4 = this.zzf;
                }
            }
            i3 = i5;
        }
    }

    private final zzafn zzp(String str) throws zzafn {
        throw new zzafn(str + zzc() + "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
    }

    private final IllegalStateException zzq(String str) throws IOException {
        int iZzn = zzn();
        String strZza = zzafl.zza(zzn());
        String strZzc = zzc();
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(str);
        sb.append(" but was ");
        sb.append(strZza);
        sb.append(strZzc);
        sb.append("\nSee ");
        sb.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(iZzn == 9 ? "adapter-not-null-safe" : "unexpected-json-structure"));
        return new IllegalStateException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ff, code lost:
    
        r2 = r7 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0101, code lost:
    
        if (r1 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0103, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r2 + r2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x010e, code lost:
    
        r1.append(r4, r3, r2);
        r12.zze = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0134, code lost:
    
        throw zzp("Malformed Unicode escape \\u".concat(new java.lang.String(r4, r12.zze, 4)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String zzr(char r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzafk.zzr(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0076, code lost:
    
        zzt();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String zzs() throws java.io.IOException {
        /*
            r5 = this;
            r3 = 0
            r2 = 0
        L2:
            r4 = r3
        L3:
            int r1 = r5.zze
            int r1 = r1 + r4
            int r0 = r5.zzf
            if (r1 >= r0) goto L48
            char[] r0 = r5.zzd
            char r1 = r0[r1]
            r0 = 9
            if (r1 == r0) goto L79
            r0 = 10
            if (r1 == r0) goto L79
            r0 = 12
            if (r1 == r0) goto L79
            r0 = 13
            if (r1 == r0) goto L79
            r0 = 32
            if (r1 == r0) goto L79
            r0 = 35
            if (r1 == r0) goto L76
            r0 = 44
            if (r1 == r0) goto L79
            r0 = 47
            if (r1 == r0) goto L76
            r0 = 61
            if (r1 == r0) goto L76
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L79
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L79
            r0 = 58
            if (r1 == r0) goto L79
            r0 = 59
            if (r1 == r0) goto L76
            switch(r1) {
                case 91: goto L79;
                case 92: goto L76;
                case 93: goto L79;
                default: goto L45;
            }
        L45:
            int r4 = r4 + 1
            goto L3
        L48:
            r0 = 1024(0x400, float:1.435E-42)
            if (r4 >= r0) goto L55
            int r0 = r4 + 1
            boolean r0 = r5.zzw(r0)
            if (r0 == 0) goto L79
            goto L3
        L55:
            if (r2 != 0) goto L62
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r0 = 16
            int r0 = java.lang.Math.max(r4, r0)
            r2.<init>(r0)
        L62:
            char[] r1 = r5.zzd
            int r0 = r5.zze
            r2.append(r1, r0, r4)
            int r0 = r5.zze
            int r0 = r0 + r4
            r5.zze = r0
            r0 = 1
            boolean r0 = r5.zzw(r0)
            if (r0 != 0) goto L2
            goto L7a
        L76:
            r5.zzt()
        L79:
            r3 = r4
        L7a:
            if (r2 != 0) goto L8b
            char[] r2 = r5.zzd
            java.lang.String r1 = new java.lang.String
            int r0 = r5.zze
            r1.<init>(r2, r0, r3)
        L85:
            int r0 = r5.zze
            int r0 = r0 + r3
            r5.zze = r0
            return r1
        L8b:
            char[] r1 = r5.zzd
            int r0 = r5.zze
            r2.append(r1, r0, r3)
            java.lang.String r1 = r2.toString()
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzafk.zzs():java.lang.String");
    }

    private final void zzt() throws zzafn {
        if (this.zzc != zzaet.LENIENT) {
            throw zzp("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private final void zzu(int i2) throws zzafn {
        int i3 = this.zzl;
        if (i3 - 1 >= 1280) {
            throw new zzafn("Nesting limit 1280 reached" + zzc());
        }
        int[] iArr = this.zzk;
        if (i3 == iArr.length) {
            int i4 = i3 + i3;
            this.zzk = Arrays.copyOf(iArr, i4);
            this.zzn = Arrays.copyOf(this.zzn, i4);
            this.zzm = (String[]) Arrays.copyOf(this.zzm, i4);
        }
        int[] iArr2 = this.zzk;
        int i5 = this.zzl;
        this.zzl = i5 + 1;
        iArr2[i5] = i2;
    }

    private final void zzv() throws IOException {
        char c2;
        do {
            if (this.zze >= this.zzf && !zzw(1)) {
                return;
            }
            char[] cArr = this.zzd;
            int i2 = this.zze;
            int i3 = i2 + 1;
            this.zze = i3;
            c2 = cArr[i2];
            if (c2 == '\n') {
                this.zzg++;
                this.zzh = i3;
                return;
            }
        } while (c2 != '\r');
    }

    private final boolean zzw(int i2) throws IOException {
        int i3;
        int i4 = this.zzh;
        int i5 = this.zze;
        this.zzh = i4 - i5;
        char[] cArr = this.zzd;
        int i6 = this.zzf;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.zzf = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.zzf = 0;
        }
        this.zze = 0;
        do {
            Reader reader = this.zzb;
            int i8 = this.zzf;
            int i9 = reader.read(cArr, i8, 1024 - i8);
            if (i9 == -1) {
                return false;
            }
            i3 = this.zzf + i9;
            this.zzf = i3;
            if (this.zzg == 0 && this.zzh == 0 && i3 > 0 && cArr[0] == 65279) {
                this.zze++;
                this.zzh = 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    private final boolean zzx(char c2) throws IOException {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        zzt();
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza = 0;
        this.zzk[0] = 8;
        this.zzl = 1;
        this.zzb.close();
    }

    public final String toString() {
        return String.valueOf(getClass().getSimpleName()).concat(zzc());
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ab, code lost:
    
        if (zzx(r1) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b7, code lost:
    
        if (r13 != 2) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b9, code lost:
    
        if (r7 == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bf, code lost:
    
        if (r4 != Long.MIN_VALUE) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c1, code lost:
    
        if (r18 == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c7, code lost:
    
        if (r4 != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c9, code lost:
    
        if (r12 != 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00cb, code lost:
    
        r4 = -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cc, code lost:
    
        r19.zzi = r4;
        r19.zze += r10;
        r19.zza = 15;
        r0 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00da, code lost:
    
        if (r12 == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00dd, code lost:
    
        r12 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e0, code lost:
    
        r0 = 2;
        r13 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e2, code lost:
    
        if (r13 == r0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e5, code lost:
    
        if (r13 == 4) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e8, code lost:
    
        if (r13 != 7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ea, code lost:
    
        r19.zzj = r10;
        r0 = 16;
        r19.zza = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zza() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzafk.zza():int");
    }

    public final zzaet zzb() {
        return this.zzc;
    }

    final String zzc() {
        int i2 = this.zzg + 1;
        int i3 = this.zze - this.zzh;
        StringBuilder sb = new StringBuilder("$");
        for (int i4 = 0; i4 < this.zzl; i4++) {
            int i5 = this.zzk[i4];
            switch (i5) {
                case 1:
                case 2:
                    int i6 = this.zzn[i4];
                    sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb.append(i6);
                    sb.append(AbstractJsonLexerKt.END_LIST);
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.zzm[i4];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError("Unknown scope value: " + i5);
            }
        }
        return " at line " + i2 + " column " + (i3 + 1) + " path " + sb.toString();
    }

    public final String zzd() throws IOException {
        String strZzr;
        int iZza = this.zza;
        if (iZza == 0) {
            iZza = zza();
        }
        if (iZza == 14) {
            strZzr = zzs();
        } else if (iZza == 12) {
            strZzr = zzr('\'');
        } else {
            if (iZza != 13) {
                throw zzq("a name");
            }
            strZzr = zzr('\"');
        }
        this.zza = 0;
        this.zzm[this.zzl - 1] = strZzr;
        return strZzr;
    }

    public final String zze() throws IOException {
        String str;
        int iZza = this.zza;
        if (iZza == 0) {
            iZza = zza();
        }
        if (iZza == 10) {
            str = zzs();
        } else if (iZza == 8) {
            str = zzr('\'');
        } else if (iZza == 9) {
            str = zzr('\"');
        } else if (iZza == 11) {
            str = null;
        } else if (iZza == 15) {
            str = Long.toString(this.zzi);
        } else {
            if (iZza != 16) {
                throw zzq("a string");
            }
            str = new String(this.zzd, this.zze, this.zzj);
            this.zze += this.zzj;
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i2 = this.zzl - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final void zzf() throws IOException {
        int iZza = this.zza;
        if (iZza == 0) {
            iZza = zza();
        }
        if (iZza != 3) {
            throw zzq("BEGIN_ARRAY");
        }
        zzu(1);
        this.zzn[this.zzl - 1] = 0;
        this.zza = 0;
    }

    public final void zzg() throws IOException {
        int iZza = this.zza;
        if (iZza == 0) {
            iZza = zza();
        }
        if (iZza != 1) {
            throw zzq("BEGIN_OBJECT");
        }
        zzu(3);
        this.zza = 0;
    }

    public final void zzh() throws IOException {
        int iZza = this.zza;
        if (iZza == 0) {
            iZza = zza();
        }
        if (iZza != 4) {
            throw zzq("END_ARRAY");
        }
        int i2 = this.zzl;
        this.zzl = i2 - 1;
        int[] iArr = this.zzn;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.zza = 0;
    }

    public final void zzi() throws IOException {
        int iZza = this.zza;
        if (iZza == 0) {
            iZza = zza();
        }
        if (iZza != 2) {
            throw zzq("END_OBJECT");
        }
        int i2 = this.zzl;
        int i3 = i2 - 1;
        this.zzl = i3;
        this.zzm[i3] = null;
        int[] iArr = this.zzn;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.zza = 0;
    }

    public final void zzj() throws IOException {
        int iZza = this.zza;
        if (iZza == 0) {
            iZza = zza();
        }
        if (iZza != 7) {
            throw zzq("null");
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i2 = this.zzl - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public final void zzk(zzaet zzaetVar) {
        Objects.requireNonNull(zzaetVar);
        this.zzc = zzaetVar;
    }

    public final boolean zzl() throws IOException {
        int iZza = this.zza;
        if (iZza == 0) {
            iZza = zza();
        }
        return (iZza == 2 || iZza == 4 || iZza == 17) ? false : true;
    }

    public final boolean zzm() throws IOException {
        int iZza = this.zza;
        if (iZza == 0) {
            iZza = zza();
        }
        if (iZza == 5) {
            this.zza = 0;
            int[] iArr = this.zzn;
            int i2 = this.zzl - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iZza != 6) {
            throw zzq("a boolean");
        }
        this.zza = 0;
        int[] iArr2 = this.zzn;
        int i3 = this.zzl - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public final int zzn() throws IOException {
        int iZza = this.zza;
        if (iZza == 0) {
            iZza = zza();
        }
        switch (iZza) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }
}
