package i1;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class tongue extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tongue f19728a = new tongue();

    public tongue() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
        if (cipher != null) {
            return cipher;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
