package com.google.android.gms.internal.mlkit_vision_internal_vkp;

import com.dynatrace.android.agent.Global;
import com.facebook.hermes.intl.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public final class zzafm implements Closeable, Flushable {
    private static final Pattern zza = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] zzb = new String[128];
    private static final String[] zzc;
    private final Writer zzd;
    private int[] zze = new int[32];
    private int zzf = 0;
    private final zzaej zzg;
    private final String zzh;
    private String zzi;
    private final boolean zzj;
    private zzaet zzk;
    private String zzl;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            zzb[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = zzb;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        zzc = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public zzafm(Writer writer) {
        boolean z2 = false;
        zzp(6);
        this.zzk = zzaet.LEGACY_STRICT;
        this.zzd = (Writer) Objects.requireNonNull(writer, "out == null");
        zzaej zzaejVar = (zzaej) Objects.requireNonNull(zzaej.zza);
        this.zzg = zzaejVar;
        this.zzi = ",";
        if (zzaejVar.zzc()) {
            this.zzh = ": ";
            if (zzaejVar.zzb().isEmpty()) {
                this.zzi = ", ";
            }
        } else {
            this.zzh = Global.COLON;
        }
        if (zzaejVar.zzb().isEmpty() && zzaejVar.zza().isEmpty()) {
            z2 = true;
        }
        this.zzj = z2;
    }

    private final int zzk() {
        int i2 = this.zzf;
        if (i2 != 0) {
            return this.zze[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final zzafm zzl(int i2, int i3, char c2) throws IOException {
        int iZzk = zzk();
        if (iZzk != i3 && iZzk != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.zzl;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.zzf--;
        if (iZzk == i3) {
            zzo();
        }
        this.zzd.write(c2);
        return this;
    }

    private final zzafm zzm(int i2, char c2) throws IOException {
        zzn();
        zzp(i2);
        this.zzd.write(c2);
        return this;
    }

    private final void zzn() throws IOException {
        int iZzk = zzk();
        if (iZzk == 1) {
            zzq(2);
            zzo();
            return;
        }
        if (iZzk == 2) {
            this.zzd.append((CharSequence) this.zzi);
            zzo();
        } else {
            if (iZzk == 4) {
                this.zzd.append((CharSequence) this.zzh);
                zzq(5);
                return;
            }
            if (iZzk != 6) {
                if (iZzk != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.zzk != zzaet.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            zzq(7);
        }
    }

    private final void zzo() throws IOException {
        if (this.zzj) {
            return;
        }
        this.zzd.write(this.zzg.zzb());
        int i2 = this.zzf;
        for (int i3 = 1; i3 < i2; i3++) {
            this.zzd.write(this.zzg.zza());
        }
    }

    private final void zzp(int i2) {
        int i3 = this.zzf;
        int[] iArr = this.zze;
        if (i3 == iArr.length) {
            this.zze = Arrays.copyOf(iArr, i3 + i3);
        }
        int[] iArr2 = this.zze;
        int i4 = this.zzf;
        this.zzf = i4 + 1;
        iArr2[i4] = i2;
    }

    private final void zzq(int i2) {
        this.zze[this.zzf - 1] = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzr(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            java.io.Writer r0 = r8.zzd
            java.lang.String[] r7 = com.google.android.gms.internal.mlkit_vision_internal_vkp.zzafm.zzb
            r6 = 34
            r0.write(r6)
            int r5 = r9.length()
            r4 = 0
            r3 = r4
        Lf:
            if (r4 >= r5) goto L3d
            int r2 = r4 + 1
            char r1 = r9.charAt(r4)
            r0 = 128(0x80, float:1.8E-43)
            if (r1 >= r0) goto L2f
            r1 = r7[r1]
            if (r1 == 0) goto L2d
        L1f:
            if (r3 >= r4) goto L27
            java.io.Writer r0 = r8.zzd
            int r4 = r4 - r3
            r0.write(r9, r3, r4)
        L27:
            java.io.Writer r0 = r8.zzd
            r0.write(r1)
            r3 = r2
        L2d:
            r4 = r2
            goto Lf
        L2f:
            r0 = 8232(0x2028, float:1.1535E-41)
            if (r1 != r0) goto L36
            java.lang.String r1 = "\\u2028"
            goto L1f
        L36:
            r0 = 8233(0x2029, float:1.1537E-41)
            if (r1 != r0) goto L2d
            java.lang.String r1 = "\\u2029"
            goto L1f
        L3d:
            if (r3 >= r5) goto L45
            java.io.Writer r0 = r8.zzd
            int r5 = r5 - r3
            r0.write(r9, r3, r5)
        L45:
            java.io.Writer r0 = r8.zzd
            r0.write(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_internal_vkp.zzafm.zzr(java.lang.String):void");
    }

    private final void zzs() throws IOException {
        if (this.zzl != null) {
            int iZzk = zzk();
            if (iZzk == 5) {
                this.zzd.write(this.zzi);
            } else if (iZzk != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            zzo();
            zzq(4);
            zzr(this.zzl);
            this.zzl = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zzd.close();
        int i2 = this.zzf;
        if (i2 > 1 || (i2 == 1 && this.zze[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.zzf = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.zzf == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.zzd.flush();
    }

    public final zzafm zza() throws IOException {
        zzs();
        zzm(1, AbstractJsonLexerKt.BEGIN_LIST);
        return this;
    }

    public final zzafm zzb() throws IOException {
        zzs();
        zzm(3, AbstractJsonLexerKt.BEGIN_OBJ);
        return this;
    }

    public final zzafm zzc() throws IOException {
        zzl(1, 2, AbstractJsonLexerKt.END_LIST);
        return this;
    }

    public final zzafm zzd() throws IOException {
        zzl(3, 5, AbstractJsonLexerKt.END_OBJ);
        return this;
    }

    public final zzafm zze(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.zzl != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iZzk = zzk();
        if (iZzk != 3 && iZzk != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.zzl = str;
        return this;
    }

    public final zzafm zzf() throws IOException {
        if (this.zzl != null) {
            zzs();
        }
        zzn();
        this.zzd.write("null");
        return this;
    }

    public final zzafm zzg(Number number) throws IOException {
        if (number == null) {
            zzf();
            return this;
        }
        zzs();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.zzk != zzaet.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(string)));
                }
            } else if (cls != Float.class && cls != Double.class && !zza.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + String.valueOf(cls) + " is not a valid JSON number: " + string);
            }
        }
        zzn();
        this.zzd.append((CharSequence) string);
        return this;
    }

    public final zzafm zzh(String str) throws IOException {
        if (str == null) {
            zzf();
            return this;
        }
        zzs();
        zzn();
        zzr(str);
        return this;
    }

    public final zzafm zzi(boolean z2) throws IOException {
        zzs();
        zzn();
        this.zzd.write(true != z2 ? Constants.CASEFIRST_FALSE : "true");
        return this;
    }

    public final void zzj(zzaet zzaetVar) {
        this.zzk = (zzaet) Objects.requireNonNull(zzaetVar);
    }
}
