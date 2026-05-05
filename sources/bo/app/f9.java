package bo.app;

import com.braze.models.inappmessage.MessageButton;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class f9 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessageButton f628b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(String str, MessageButton messageButton) {
        super(0);
        this.f627a = str;
        this.f628b = messageButton;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ba(lx.INAPP_MESSAGE_BUTTON_CLICK, z9.a(ba.f257g, this.f627a, this.f628b.getStringId(), 4), 0.0d, 12);
    }
}
