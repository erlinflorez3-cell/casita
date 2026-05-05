package androidx.privacysandbox.ads.adservices.appsetid;

import androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import yg.InterfaceC1492Gx;

/* JADX INFO: compiled from: AppSetIdManager.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
@DebugMetadata(c = "drixvqm\u00039|\u007fw\u0006qt\f\u0007u\u0004zy\b\u0012H|\u0001\u0011L\u0001\u0005\u0015\b\u0016\u001b\u000f\n\r\u001cW\f\u001c\u001d!\u0014$\u001a\u0016`t%&\n\u001d-\u0003\u001f\t\u001e, '&4f\u00055/yz\u000eB?\u007f\u0016;?<", f = "\u000e<;\u001d.<\u0010*\u0012%1#(%1k(0", i = {}, l = {55}, m = "65E\u0013CD(;K!=", n = {}, s = {})
final class AppSetIdManager$Api33Ext4Impl$getAppSetId$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppSetIdManager.Api33Ext4Impl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppSetIdManager$Api33Ext4Impl$getAppSetId$1(AppSetIdManager.Api33Ext4Impl api33Ext4Impl, Continuation<? super AppSetIdManager$Api33Ext4Impl$getAppSetId$1> continuation) {
        super(continuation);
        this.this$0 = api33Ext4Impl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label = (-1) - (((-1) - this.label) & ((-1) - Integer.MIN_VALUE));
        return this.this$0.getAppSetId(this);
    }
}
