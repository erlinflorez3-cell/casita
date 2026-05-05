package com.incode.welcome_sdk.modules;

import com.incode.welcome_sdk.IdCategory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ProcessId extends BaseModule {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10630a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10631b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10632c = 103 % 128;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10633e = 0;
    private final IdCategory idCategory;
    private final boolean isEnabledIdSummaryScreen;

    public final boolean isEnabledIdSummaryScreen() {
        int i2 = 2 % 2;
        int i3 = f10631b + 5;
        f10630a = i3 % 128;
        if (i3 % 2 != 0) {
            return this.isEnabledIdSummaryScreen;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IdCategory getIdCategory() {
        int i2 = 2 % 2;
        int i3 = f10630a + 33;
        f10631b = i3 % 128;
        int i4 = i3 % 2;
        IdCategory idCategory = this.idCategory;
        if (i4 != 0) {
            int i5 = 8 / 0;
        }
        return idCategory;
    }

    private ProcessId(boolean z2, IdCategory idCategory) {
        super(Modules.PROCESS_ID);
        this.isEnabledIdSummaryScreen = z2;
        this.idCategory = idCategory;
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10634a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10635b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10636d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10637e = 113 % 128;
        private boolean enableIdSummaryScreen = true;
        private IdCategory idCategory = IdCategory.FIRST;

        public final Builder setEnableIdSummaryScreen(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10635b + 15;
            int i4 = i3 % 128;
            f10634a = i4;
            if (i3 % 2 != 0) {
                this.enableIdSummaryScreen = z2;
                int i5 = i4 + 29;
                f10635b = i5 % 128;
                if (i5 % 2 == 0) {
                    return this;
                }
                throw null;
            }
            this.enableIdSummaryScreen = z2;
            throw null;
        }

        public final Builder setIdCategory(IdCategory idCategory) {
            int i2 = 2 % 2;
            int i3 = f10635b + 35;
            f10634a = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(idCategory, "");
                this.idCategory = idCategory;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(idCategory, "");
            this.idCategory = idCategory;
            int i4 = f10635b + 7;
            f10634a = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final ProcessId build() {
            int i2 = 2 % 2;
            ProcessId processId = new ProcessId(this.enableIdSummaryScreen, this.idCategory, null);
            int i3 = f10634a + 9;
            f10635b = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 61 / 0;
            }
            return processId;
        }

        static {
            int i2 = 113 % 2;
        }
    }

    static {
        if (103 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ ProcessId(boolean z2, IdCategory idCategory, DefaultConstructorMarker defaultConstructorMarker) {
        this(z2, idCategory);
    }
}
