package com.incode.welcome_sdk.data.local.model.delayed_onboarding;

import com.incode.welcome_sdk.OnboardingValidationModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f8933c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f8934e = 0;

    static final class b extends Lambda implements Function1<OnboardingValidationModule, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f8935a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f8936b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f8937c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f8938d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f8939e = new b();

        private static CharSequence a(OnboardingValidationModule onboardingValidationModule) {
            int i2 = 2 % 2;
            int i3 = f8937c + 23;
            f8935a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(onboardingValidationModule, "");
            String strName = onboardingValidationModule.name();
            int i5 = f8937c + 65;
            f8935a = i5 % 128;
            int i6 = i5 % 2;
            return strName;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CharSequence invoke(OnboardingValidationModule onboardingValidationModule) {
            int i2 = 2 % 2;
            int i3 = f8935a + 89;
            f8937c = i3 % 128;
            int i4 = i3 % 2;
            CharSequence charSequenceA = a(onboardingValidationModule);
            int i5 = f8935a + 93;
            f8937c = i5 % 128;
            int i6 = i5 % 2;
            return charSequenceA;
        }

        static {
            int i2 = f8936b + 61;
            f8938d = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 42 / 0;
            }
        }

        b() {
            super(1);
        }
    }

    public static String e(List<? extends OnboardingValidationModule> list) {
        int i2 = 2 % 2;
        int i3 = f8933c + 39;
        f8934e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        String strJoinToString$default = CollectionsKt.joinToString$default(list, ",", null, null, 0, null, b.f8939e, 30, null);
        int i5 = f8933c + 109;
        f8934e = i5 % 128;
        int i6 = i5 % 2;
        return strJoinToString$default;
    }

    public static List<OnboardingValidationModule> d(String str) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = str;
        if (StringsKt.isBlank(str2)) {
            int i3 = f8933c + 117;
            f8934e = i3 % 128;
            if (i3 % 2 == 0) {
                return CollectionsKt.emptyList();
            }
            CollectionsKt.emptyList();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List listSplit$default = StringsKt.split$default((CharSequence) str2, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        int i4 = f8933c + 89;
        f8934e = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            int i6 = f8933c + 3;
            f8934e = i6 % 128;
            int i7 = i6 % 2;
            arrayList.add(OnboardingValidationModule.valueOf((String) it.next()));
        }
        return arrayList;
    }
}
