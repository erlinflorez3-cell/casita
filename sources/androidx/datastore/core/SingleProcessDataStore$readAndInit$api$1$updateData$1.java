package androidx.datastore.core;

import com.drew.metadata.exif.ExifDirectoryBase;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import yg.InterfaceC1492Gx;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
@DebugMetadata(c = "drixvqm\u00039pn\u0003p\u0004\u0006\u0002\u0006yCy\u0007\u000b~Hn\u0006\f\u0006\f\u0006q\u0015\u0013\b\u000b\u001a\u001bl\u000b\u001f\r\u007f\"\u001e\"\u0016U%\u0019\u0016\u001aw&\u001d\u0003)%1a 0*es", f = " 5915-\u001784'(54\u0004 2\u001e\u000f/)+\u001dd!)", i = {0, 0, 1, 2, 2}, l = {503, 337, ExifDirectoryBase.TAG_SAMPLE_FORMAT}, m = "D@53G9\u00197K9", n = {"chcTe\\QYC", "\u0013jjOe\u001aYPJB29:E\u001e;dj&\f\u0018\u0018\u001c\u0017\u000b>\u0010x", "\u0013jjOe\u001aYPJB29:E\u001e;dj&\f\u0018\u0018\u001c\u0017\u000b>\u0010x", "\u0013jjOe\u001aYPJB29:E\u001e;dj&\f\u0018\u0018\u001c\u0017\u000b>\u0010x", "][y*SjC"}, s = {"xQ^", "xQ_", "xQ^", "xQ^", "xQ`"})
final class SingleProcessDataStore$readAndInit$api$1$updateData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleProcessDataStore$readAndInit$api$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$readAndInit$api$1$updateData$1(SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1, Continuation<? super SingleProcessDataStore$readAndInit$api$1$updateData$1> continuation) {
        super(continuation);
        this.this$0 = singleProcessDataStore$readAndInit$api$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
        return this.this$0.updateData(null, this);
    }
}
