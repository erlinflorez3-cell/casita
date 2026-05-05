package com.incode.welcome_sdk.modules;

import com.incode.welcome_sdk.IdCategory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class IdInfo extends BaseModule {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10563a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10564b = 45 % 128;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10565c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10566e = 0;
    private final IdCategory idCategory;
    private final boolean isEditableOcr;

    public /* synthetic */ IdInfo(boolean z2, IdCategory idCategory, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z2, idCategory);
    }

    public final boolean isEditableOcr() {
        int i2 = 2 % 2;
        int i3 = f10563a + 87;
        f10565c = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.isEditableOcr;
        if (i4 == 0) {
            int i5 = 16 / 0;
        }
        return z2;
    }

    public final IdCategory getIdCategory() {
        int i2 = 2 % 2;
        int i3 = f10565c + 7;
        f10563a = i3 % 128;
        int i4 = i3 % 2;
        IdCategory idCategory = this.idCategory;
        if (i4 != 0) {
            int i5 = 66 / 0;
        }
        return idCategory;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdInfo(boolean z2, IdCategory idCategory) {
        super(Modules.ID_OCR);
        Intrinsics.checkNotNullParameter(idCategory, "");
        this.isEditableOcr = z2;
        this.idCategory = idCategory;
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10567a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10568b = 9 % 128;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f10569c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10570e = 1;
        private IdCategory idCategory = IdCategory.FIRST;
        private boolean isEditableOCr;

        public final Builder setEditableOcr(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10570e + 117;
            int i4 = i3 % 128;
            f10569c = i4;
            if (i3 % 2 != 0) {
                this.isEditableOCr = z2;
                int i5 = 34 / 0;
            } else {
                this.isEditableOCr = z2;
            }
            int i6 = i4 + 117;
            f10570e = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 67 / 0;
            }
            return this;
        }

        public final Builder setIdCategory(IdCategory idCategory) {
            int i2 = 2 % 2;
            int i3 = f10569c + 87;
            f10570e = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(idCategory, "");
                this.idCategory = idCategory;
                int i4 = 99 / 0;
            } else {
                Intrinsics.checkNotNullParameter(idCategory, "");
                this.idCategory = idCategory;
            }
            int i5 = f10570e + 59;
            f10569c = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final IdInfo build() {
            int i2 = 2 % 2;
            IdInfo idInfo = new IdInfo(this.isEditableOCr, this.idCategory);
            int i3 = f10570e + 37;
            f10569c = i3 % 128;
            if (i3 % 2 == 0) {
                return idInfo;
            }
            throw null;
        }

        static {
            if (9 % 2 == 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if ((r3 - 1) != r1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0096, code lost:
    
        throw new com.incode.welcome_sdk.modules.exceptions.InvalidModuleOrderException(getName() + " module must be called in order after " + com.incode.welcome_sdk.modules.Modules.ID + ", " + com.incode.welcome_sdk.modules.Modules.PROCESS_ID + " and then " + getName() + "!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bd, code lost:
    
        throw new com.incode.welcome_sdk.modules.exceptions.InvalidModuleOrderException(getName() + " module must be called right after " + com.incode.welcome_sdk.modules.Modules.PROCESS_ID + "!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002b, code lost:
    
        if ((r3 >>> 1) != r1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        if ((r3 - 2) == r2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        r1 = com.incode.welcome_sdk.modules.IdInfo.f10563a + 81;
        com.incode.welcome_sdk.modules.IdInfo.f10565c = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        return;
     */
    @Override // com.incode.welcome_sdk.modules.BaseModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void verifyConfiguration(java.util.List<? extends com.incode.welcome_sdk.modules.Modules> r8) throws com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException {
        /*
            r7 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.modules.IdInfo.f10563a
            int r1 = r0 + 35
            int r0 = r1 % 128
            com.incode.welcome_sdk.modules.IdInfo.f10565c = r0
            int r1 = r1 % r5
            java.lang.String r4 = "!"
            java.lang.String r0 = ""
            if (r1 != 0) goto L3a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.incode.welcome_sdk.modules.Modules r0 = r7.getName()
            int r3 = r8.indexOf(r0)
            com.incode.welcome_sdk.modules.Modules r0 = com.incode.welcome_sdk.modules.Modules.PROCESS_ID
            int r1 = r8.indexOf(r0)
            com.incode.welcome_sdk.modules.Modules r0 = com.incode.welcome_sdk.modules.Modules.ID
            int r2 = r8.indexOf(r0)
            int r0 = r3 >>> 1
            if (r0 == r1) goto L97
        L2d:
            int r3 = r3 - r5
            if (r3 == r2) goto L56
            int r0 = com.incode.welcome_sdk.modules.IdInfo.f10563a
            int r1 = r0 + 81
            int r0 = r1 % 128
            com.incode.welcome_sdk.modules.IdInfo.f10565c = r0
            int r1 = r1 % r5
            return
        L3a:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.incode.welcome_sdk.modules.Modules r0 = r7.getName()
            int r3 = r8.indexOf(r0)
            com.incode.welcome_sdk.modules.Modules r0 = com.incode.welcome_sdk.modules.Modules.PROCESS_ID
            int r1 = r8.indexOf(r0)
            com.incode.welcome_sdk.modules.Modules r0 = com.incode.welcome_sdk.modules.Modules.ID
            int r2 = r8.indexOf(r0)
            int r0 = r3 + (-1)
            if (r0 == r1) goto L97
            goto L2d
        L56:
            com.incode.welcome_sdk.modules.exceptions.InvalidModuleOrderException r3 = new com.incode.welcome_sdk.modules.exceptions.InvalidModuleOrderException
            com.incode.welcome_sdk.modules.Modules r1 = r7.getName()
            com.incode.welcome_sdk.modules.Modules r6 = com.incode.welcome_sdk.modules.Modules.ID
            com.incode.welcome_sdk.modules.Modules r5 = com.incode.welcome_sdk.modules.Modules.PROCESS_ID
            com.incode.welcome_sdk.modules.Modules r2 = r7.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r0 = " module must be called in order after "
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r1 = r0.append(r6)
            java.lang.String r0 = ", "
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r1 = r0.append(r5)
            java.lang.String r0 = " and then "
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L97:
            com.incode.welcome_sdk.modules.exceptions.InvalidModuleOrderException r3 = new com.incode.welcome_sdk.modules.exceptions.InvalidModuleOrderException
            com.incode.welcome_sdk.modules.Modules r1 = r7.getName()
            com.incode.welcome_sdk.modules.Modules r2 = com.incode.welcome_sdk.modules.Modules.PROCESS_ID
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = r0.append(r1)
            java.lang.String r0 = " module must be called right after "
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.modules.IdInfo.verifyConfiguration(java.util.List):void");
    }

    static {
        if (45 % 2 == 0) {
            throw null;
        }
    }
}
