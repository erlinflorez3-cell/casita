package com.incode.welcome_sdk.data.local.model.delayed_onboarding;

import com.incode.welcome_sdk.modules.Modules;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8638a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f8639b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<Modules> f8640c = CollectionsKt.listOf((Object[]) new Modules[]{Modules.ID, Modules.PROCESS_ID, Modules.DOCUMENT_CAPTURE, Modules.SELFIE, Modules.FACE_MATCH, Modules.COMBINED_CONSENT});

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f8641d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8642e = 0;

    public static final List<Modules> b() {
        int i2 = 2 % 2;
        int i3 = f8642e + 9;
        int i4 = i3 % 128;
        f8639b = i4;
        int i5 = i3 % 2;
        List<Modules> list = f8640c;
        int i6 = i4 + 55;
        f8642e = i6 % 128;
        int i7 = i6 % 2;
        return list;
    }

    static {
        int i2 = f8638a + 11;
        f8641d = i2 % 128;
        int i3 = i2 % 2;
    }
}
