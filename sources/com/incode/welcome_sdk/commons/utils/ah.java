package com.incode.welcome_sdk.commons.utils;

import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.utils.ah;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public final class ah {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f6385c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f6387e = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f6388g = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f6389j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f6386d = new d(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Action f6384b = new Action() { // from class: com.incode.welcome_sdk.commons.utils.ah$$ExternalSyntheticLambda0
        @Override // io.reactivex.functions.Action
        public final void run() {
            ah.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Consumer<Object> f6383a = new Consumer() { // from class: com.incode.welcome_sdk.commons.utils.ah$$ExternalSyntheticLambda1
        @Override // io.reactivex.functions.Consumer
        public final void accept(Object obj) {
            ah.a(obj);
        }
    };

    public static final class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f6390d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f6391e = 0;

        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(IncodeWelcome.OnboardingListener onboardingListener, Throwable th) {
            int i2 = 2 % 2;
            if (onboardingListener != null) {
                int i3 = f6391e + 39;
                f6390d = i3 % 128;
                if (i3 % 2 == 0) {
                    Intrinsics.checkNotNull(th);
                    onboardingListener.onError(th);
                    int i4 = 95 / 0;
                } else {
                    Intrinsics.checkNotNull(th);
                    onboardingListener.onError(th);
                }
            }
            Timber.Forest.e(th);
            int i5 = f6390d + 69;
            f6391e = i5 % 128;
            int i6 = i5 % 2;
        }

        @JvmStatic
        public static Consumer<Throwable> d(final IncodeWelcome.OnboardingListener onboardingListener) {
            int i2 = 2 % 2;
            int i3 = f6391e + 97;
            f6390d = i3 % 128;
            int i4 = i3 % 2;
            Consumer<Throwable> consumer = new Consumer() { // from class: com.incode.welcome_sdk.commons.utils.ah$d$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    ah.d.c(onboardingListener, (Throwable) obj);
                }
            };
            int i5 = f6391e + 55;
            f6390d = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 59 / 0;
            }
            return consumer;
        }

        public /* synthetic */ d(byte b2) {
            this();
        }
    }

    static {
        int i2 = f6389j + 81;
        f6388g = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e() {
        int i2 = 2 % 2;
        int i3 = f6387e + 79;
        f6385c = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Object obj) {
        int i2 = 2 % 2;
        int i3 = f6387e + 81;
        f6385c = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
