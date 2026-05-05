package c1;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class civilian extends FunctionReferenceImpl implements Function1 {
    public civilian() {
        super(1, i1.close.f19714a, i1.close.class, "sha256", "sha256(Ljava/io/InputStream;)Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws NoSuchAlgorithmException, IOException {
        InputStream inputStream = (InputStream) obj;
        ((i1.close) this.receiver).getClass();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bArr = new byte[16384];
        while (true) {
            int i2 = inputStream.read(bArr, 0, 16384);
            if (i2 <= 0) {
                return ArraysKt.joinToString$default(messageDigest.digest(), (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) i1.gregarious.f19716a, 30, (Object) null);
            }
            messageDigest.update(bArr, 0, i2);
        }
    }
}
