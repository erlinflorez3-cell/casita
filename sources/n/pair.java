package n;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pair extends FunctionReferenceImpl implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pair f19881a = new pair();

    public pair() {
        super(0, civilian.class, "defaultNetworkInterfacesProvider", "defaultNetworkInterfacesProvider()Ljava/lang/Object;", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objM8980constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Reader inputStreamReader = new InputStreamReader(new ProcessBuilder((List<String>) CollectionsKt.listOf("/system/bin/netcfg")).directory(new File("/system/bin/")).redirectErrorStream(true).start().getInputStream(), Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                objM8980constructorimpl = Result.m8980constructorimpl(StringsKt.lines(text));
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM8980constructorimpl = Result.m8980constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m8979boximpl(objM8980constructorimpl);
    }
}
