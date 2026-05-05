package i1;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class misplace {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f19717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f19718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f19719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f19720d;

    public misplace() {
        superior superiorVar = superior.f19725a;
        tongue tongueVar = tongue.f19728a;
        apparatus apparatusVar = apparatus.f19712a;
        civilian civilianVar = civilian.f19713a;
        this.f19717a = superiorVar;
        this.f19718b = tongueVar;
        this.f19719c = apparatusVar;
        this.f19720d = civilianVar;
    }

    public final byte[] a(String str, int i2, byte[] bArr) {
        Object objM8980constructorimpl;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        PBEKeySpec pBEKeySpec = new PBEKeySpec(str.toCharArray(), slide.f19723a, 16384, 512);
        try {
            Result.Companion companion = Result.Companion;
            byte[] encoded = ((SecretKeyFactory) this.f19717a.invoke()).generateSecret(pBEKeySpec).getEncoded();
            objM8980constructorimpl = Result.m8980constructorimpl(encoded != null ? new taste(new SecretKeySpec(ArraysKt.copyOfRange(encoded, 0, 16), "AES"), new IvParameterSpec(ArraysKt.copyOfRange(encoded, 16, 32))) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
        }
        taste tasteVar = (taste) (Result.m8986isFailureimpl(objM8980constructorimpl) ? null : objM8980constructorimpl);
        if (tasteVar == null) {
            byte[] bArr2 = new byte[32];
            for (int i3 = 0; i3 < 32; i3++) {
                bArr2[i3] = (byte) (str.codePointAt(i3 % str.length()) ^ slide.f19723a[i3 % 8]);
            }
            tasteVar = new taste(new SecretKeySpec(ArraysKt.copyOfRange(bArr2, 0, 16), "AES"), new IvParameterSpec(ArraysKt.copyOfRange(bArr2, 16, 32)));
        }
        Cipher cipher = (Cipher) this.f19718b.invoke();
        cipher.init(i2, tasteVar.f19726a, tasteVar.f19727b);
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        if (bArrDoFinal != null) {
            return bArrDoFinal;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
