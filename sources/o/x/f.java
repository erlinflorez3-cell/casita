package o.x;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface f {
    void onAuthenticationDeclined();

    void onCustomerCredentialsInvalid(o.j.b bVar);

    void onCustomerCredentialsRequired(List<o.m.h> list);

    void onError(o.by.c cVar);

    void onProcessStart();

    void onProcessSuccess();
}
