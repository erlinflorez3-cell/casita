package i1;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes4.dex */
public final class close {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final close f19714a = new close();

    public static String a() {
        return StringsKt.take(ArraysKt.joinToString$default(MessageDigest.getInstance("SHA-256").digest(UUID.randomUUID().toString().getBytes(Charsets.UTF_8)), (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) gregarious.f19716a, 30, (Object) null), 32);
    }

    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            try {
                byte[] bArr = new byte[8192];
                for (int i2 = fileInputStream.read(bArr); i2 > 0; i2 = fileInputStream.read(bArr)) {
                    messageDigest.update(bArr, 0, i2);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileInputStream, null);
                return ArraysKt.joinToString$default(messageDigest.digest(), (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) fabricate.f19715a, 30, (Object) null).toUpperCase(Locale.ROOT);
            } finally {
            }
        } catch (Throwable unused) {
            String str2 = "Couldn't compute MD5 digest for " + str;
            return null;
        }
    }

    public static String b(String str) {
        return ArraysKt.joinToString$default(MessageDigest.getInstance("SHA-1").digest(str.getBytes(Charsets.UTF_8)), (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) gregarious.f19716a, 30, (Object) null);
    }

    public static String c(String str) {
        try {
            return ArraysKt.joinToString$default(MessageDigest.getInstance(MessageDigestAlgorithms.MD5).digest(str.getBytes(Charsets.UTF_8)), (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) abundant.f19711a, 30, (Object) null);
        } catch (Throwable unused) {
            String str2 = "Couldn't compute MD5 digest for " + str;
            return "";
        }
    }
}
