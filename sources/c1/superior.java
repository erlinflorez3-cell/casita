package c1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.zip.ZipFile;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import yg.FB;
import yg.Jg;
import yg.ZN;
import yg.ZO;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class superior extends FunctionReferenceImpl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final superior f2515a = new superior();

    public superior() {
        super(1, ZipFile.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        Object[] objArr = {(String) obj};
        Constructor<?> constructor = Class.forName(Jg.Wd("yHt7k\u000b!-Xq\u0015[\u000b_#\nx&`;\u001c", (short) (FB.Xd() ^ 31956), (short) (FB.Xd() ^ 1849))).getConstructor(Class.forName(ZO.xd("\u0016HQC4NnQ\u0002`\u00158\t\u0007B4", (short) (ZN.Xd() ^ 1347), (short) (ZN.Xd() ^ 26435))));
        try {
            constructor.setAccessible(true);
            return (ZipFile) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }
}
