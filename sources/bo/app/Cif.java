package bo.app;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: bo.app.if, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class Cif extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Cif f903a = new Cif();

    public Cif() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        return "Attempted to flush Push Delivery events, but no events are available";
    }
}
