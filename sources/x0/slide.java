package x0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import y0.absolute;

/* JADX INFO: loaded from: classes2.dex */
public final class slide extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteArrayOutputStream f28453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ absolute f28454b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public slide(ByteArrayOutputStream byteArrayOutputStream, absolute absoluteVar, Continuation continuation) {
        super(2, continuation);
        this.f28453a = byteArrayOutputStream;
        this.f28454b = absoluteVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new slide(this.f28453a, this.f28454b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new slide(this.f28453a, this.f28454b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(this.f28453a);
        this.f28454b.writeTo(gZIPOutputStream);
        gZIPOutputStream.finish();
        ByteArrayOutputStream byteArrayOutputStream = this.f28453a;
        try {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            CloseableKt.closeFinally(byteArrayOutputStream, null);
            return byteArray;
        } finally {
        }
    }
}
