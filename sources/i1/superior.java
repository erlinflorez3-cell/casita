package i1;

import java.security.NoSuchAlgorithmException;
import javax.crypto.SecretKeyFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class superior extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final superior f19725a = new superior();

    public superior() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchAlgorithmException {
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        if (secretKeyFactory != null) {
            return secretKeyFactory;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
