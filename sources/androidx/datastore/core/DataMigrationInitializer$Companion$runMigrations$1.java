package androidx.datastore.core;

import androidx.datastore.core.DataMigrationInitializer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import yg.InterfaceC1492Gx;

/* JADX INFO: compiled from: DataMigrationInitializer.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1}, pn = "", xi = 48, xs = "")
@DebugMetadata(c = "drixvqm\u00039pn\u0003p\u0004\u0006\u0002\u0006yCy\u0007\u000b~H_}\u0012\u007fl\n\t\u0015\u0005\u0019\u000f\u0016\u0016q\u0018\u0014 \u0016\u000f\u001b\u0019+\u0017%Ww%$(\u001a($++", f = "\u0011-?+\u00161.8&8,1/\t-'1%\u001c&\"2\u001c(b\u001f'", i = {0, 1}, l = {42, 57}, m = "AE?\u001f<;G7KAHHN", n = {"RbgG`KRZ", "RbgG`KR-7CR?I?"}, s = {"xQ^", "xQ^"})
final class DataMigrationInitializer$Companion$runMigrations$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DataMigrationInitializer.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataMigrationInitializer$Companion$runMigrations$1(DataMigrationInitializer.Companion companion, Continuation<? super DataMigrationInitializer$Companion$runMigrations$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
        return this.this$0.runMigrations(null, null, this);
    }
}
