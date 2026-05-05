package d1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import y0.mile;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class apparatus extends FunctionReferenceImpl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final apparatus f18427a = new apparatus();

    public apparatus() {
        super(1, mile.class, "parseFrom", "parseFrom([B)Lcom/cleafy/mobile/detection/probes/Dto$Settings;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return mile.a((byte[]) obj);
    }
}
