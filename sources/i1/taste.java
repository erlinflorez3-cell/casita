package i1;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class taste {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f19726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IvParameterSpec f19727b;

    public taste(SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec) {
        this.f19726a = secretKeySpec;
        this.f19727b = ivParameterSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof taste)) {
            return false;
        }
        taste tasteVar = (taste) obj;
        return Intrinsics.areEqual(this.f19726a, tasteVar.f19726a) && Intrinsics.areEqual(this.f19727b, tasteVar.f19727b);
    }

    public final int hashCode() {
        return this.f19727b.hashCode() + (this.f19726a.hashCode() * 31);
    }

    public final String toString() {
        return "CryptoSpecs(key=" + this.f19726a + ", iv=" + this.f19727b + ")";
    }
}
