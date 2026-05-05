package w0;

import com.dynatrace.android.callback.Callback;
import cz.msebera.android.httpclient.protocol.HTTP;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes2.dex */
public final class cooperative extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fabricate f28377a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ HttpURLConnection f28378b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fling f28379c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cooperative(fabricate fabricateVar, HttpURLConnection httpURLConnection, fling flingVar, Continuation continuation) {
        super(2, continuation);
        this.f28377a = fabricateVar;
        this.f28378b = httpURLConnection;
        this.f28379c = flingVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new cooperative(this.f28377a, this.f28378b, this.f28379c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((cooperative) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        BufferedReader bufferedReader;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = null;
        if (this.f28377a.f28387g != null) {
            this.f28378b.setRequestProperty("Expect", HTTP.EXPECT_CONTINUE);
            this.f28378b.setDoOutput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(Callback.getOutputStream((URLConnection) this.f28378b));
            HttpURLConnection httpURLConnection = this.f28378b;
            fabricate fabricateVar = this.f28377a;
            try {
                Callback.connect((URLConnection) httpURLConnection);
                dataOutputStream.write(fabricateVar.f28387g);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(dataOutputStream, null);
            } finally {
            }
        }
        fling flingVar = this.f28379c;
        HttpURLConnection httpURLConnection2 = this.f28378b;
        boolean z2 = this.f28377a.f28386f;
        flingVar.getClass();
        int responseCode = Callback.getResponseCode(httpURLConnection2);
        if (200 > responseCode || responseCode >= 300) {
            InputStream errorStream = Callback.getErrorStream(httpURLConnection2);
            if (errorStream != null) {
                Reader inputStreamReader = new InputStreamReader(errorStream, Charsets.UTF_8);
                bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    TextStreamsKt.readText(bufferedReader);
                    CloseableKt.closeFinally(bufferedReader, null);
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            return new close(responseCode);
        }
        if (!z2) {
            Callback.getHeaderFields(httpURLConnection2);
            return new sea(responseCode);
        }
        Callback.getHeaderFields(httpURLConnection2);
        InputStream inputStream = Callback.getInputStream((URLConnection) httpURLConnection2);
        if (inputStream != null) {
            Reader inputStreamReader2 = new InputStreamReader(inputStream, Charsets.UTF_8);
            bufferedReader = inputStreamReader2 instanceof BufferedReader ? (BufferedReader) inputStreamReader2 : new BufferedReader(inputStreamReader2, 8192);
            try {
                String text = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                str = text;
            } finally {
            }
        }
        if (str == null) {
            str = "";
        }
        return new proposal(str, responseCode);
    }
}
