package com.incode.welcome_sdk.modules;

import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class GovernmentValidation extends BaseModule {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10555a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10556b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10557c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10558d = 1;
    private final boolean skipAnimation;

    public /* synthetic */ GovernmentValidation(boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2);
    }

    public final boolean getSkipAnimation() {
        int i2 = 2 % 2;
        int i3 = f10555a;
        int i4 = i3 + 53;
        f10558d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        boolean z2 = this.skipAnimation;
        int i5 = i3 + 17;
        f10558d = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public GovernmentValidation(boolean z2) {
        super(Modules.INE_VALIDATION);
        this.skipAnimation = z2;
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10559a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10560b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10561c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10562d = 1;
        private boolean skipAnimation;

        public final Builder setSkipAnimation(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10559a + 39;
            int i4 = i3 % 128;
            f10562d = i4;
            if (i3 % 2 != 0) {
                this.skipAnimation = z2;
                int i5 = i4 + 63;
                f10559a = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 49 / 0;
                }
                return this;
            }
            this.skipAnimation = z2;
            throw null;
        }

        public final GovernmentValidation build() {
            int i2 = 2 % 2;
            GovernmentValidation governmentValidation = new GovernmentValidation(this.skipAnimation);
            int i3 = f10559a + 19;
            f10562d = i3 % 128;
            int i4 = i3 % 2;
            return governmentValidation;
        }

        static {
            int i2 = 1 + 65;
            f10561c = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public final void verifyConfiguration(List<? extends Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10555a + 41;
        f10558d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        verifyAddAndProcessDataNotAfterApprove(list);
        verifyIfAfter(list, Modules.SELFIE);
        verifyIfAfterEither(list, Modules.ID, Modules.QR_SCAN);
        int i5 = f10558d + 27;
        f10555a = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        int i2 = 1 + 13;
        f10556b = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public GovernmentValidation() {
        this(false, 1, null);
    }
}
