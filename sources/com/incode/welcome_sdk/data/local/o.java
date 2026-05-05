package com.incode.welcome_sdk.data.local;

/* JADX INFO: loaded from: classes5.dex */
public enum o {
    VOTER_IDENTIFICATION("VoterIdentification"),
    PASSPORT("Passport"),
    ADDRESS_STATEMENT("AddressStatement");


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f8956g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f8957h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static int f8958i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static int f8959j = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f8960d;

    public static o valueOf(String str) {
        int i2 = 2 % 2;
        int i3 = f8956g + 47;
        f8957h = i3 % 128;
        int i4 = i3 % 2;
        o oVar = (o) Enum.valueOf(o.class, str);
        int i5 = f8957h + 57;
        f8956g = i5 % 128;
        int i6 = i5 % 2;
        return oVar;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static o[] valuesCustom() {
        o[] oVarArr;
        int i2 = 2 % 2;
        int i3 = f8957h + 5;
        f8956g = i3 % 128;
        if (i3 % 2 != 0) {
            oVarArr = (o[]) values().clone();
            int i4 = 56 / 0;
        } else {
            oVarArr = (o[]) values().clone();
        }
        int i5 = f8957h + 121;
        f8956g = i5 % 128;
        int i6 = i5 % 2;
        return oVarArr;
    }

    static {
        int i2 = f8959j + 105;
        f8958i = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 50 / 0;
        }
    }

    o(String str) {
        this.f8960d = str;
    }
}
