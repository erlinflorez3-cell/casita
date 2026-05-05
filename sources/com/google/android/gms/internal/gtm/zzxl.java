package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes8.dex */
public enum zzxl {
    DOUBLE(0, 1, zzyh.DOUBLE),
    FLOAT(1, 1, zzyh.FLOAT),
    INT64(2, 1, zzyh.LONG),
    UINT64(3, 1, zzyh.LONG),
    INT32(4, 1, zzyh.INT),
    FIXED64(5, 1, zzyh.LONG),
    FIXED32(6, 1, zzyh.INT),
    BOOL(7, 1, zzyh.BOOLEAN),
    STRING(8, 1, zzyh.STRING),
    MESSAGE(9, 1, zzyh.MESSAGE),
    BYTES(10, 1, zzyh.BYTE_STRING),
    UINT32(11, 1, zzyh.INT),
    ENUM(12, 1, zzyh.ENUM),
    SFIXED32(13, 1, zzyh.INT),
    SFIXED64(14, 1, zzyh.LONG),
    SINT32(15, 1, zzyh.INT),
    SINT64(16, 1, zzyh.LONG),
    GROUP(17, 1, zzyh.MESSAGE),
    DOUBLE_LIST(18, 2, zzyh.DOUBLE),
    FLOAT_LIST(19, 2, zzyh.FLOAT),
    INT64_LIST(20, 2, zzyh.LONG),
    UINT64_LIST(21, 2, zzyh.LONG),
    INT32_LIST(22, 2, zzyh.INT),
    FIXED64_LIST(23, 2, zzyh.LONG),
    FIXED32_LIST(24, 2, zzyh.INT),
    BOOL_LIST(25, 2, zzyh.BOOLEAN),
    STRING_LIST(26, 2, zzyh.STRING),
    MESSAGE_LIST(27, 2, zzyh.MESSAGE),
    BYTES_LIST(28, 2, zzyh.BYTE_STRING),
    UINT32_LIST(29, 2, zzyh.INT),
    ENUM_LIST(30, 2, zzyh.ENUM),
    SFIXED32_LIST(31, 2, zzyh.INT),
    SFIXED64_LIST(32, 2, zzyh.LONG),
    SINT32_LIST(33, 2, zzyh.INT),
    SINT64_LIST(34, 2, zzyh.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzyh.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzyh.FLOAT),
    INT64_LIST_PACKED(37, 3, zzyh.LONG),
    UINT64_LIST_PACKED(38, 3, zzyh.LONG),
    INT32_LIST_PACKED(39, 3, zzyh.INT),
    FIXED64_LIST_PACKED(40, 3, zzyh.LONG),
    FIXED32_LIST_PACKED(41, 3, zzyh.INT),
    BOOL_LIST_PACKED(42, 3, zzyh.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzyh.INT),
    ENUM_LIST_PACKED(44, 3, zzyh.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzyh.INT),
    SFIXED64_LIST_PACKED(46, 3, zzyh.LONG),
    SINT32_LIST_PACKED(47, 3, zzyh.INT),
    SINT64_LIST_PACKED(48, 3, zzyh.LONG),
    GROUP_LIST(49, 2, zzyh.MESSAGE),
    MAP(50, 4, zzyh.VOID);

    private static final zzxl[] zzZ;
    private final zzyh zzab;
    private final int zzac;
    private final Class zzad;

    static {
        zzxl[] zzxlVarArrValues = values();
        zzZ = new zzxl[zzxlVarArrValues.length];
        for (zzxl zzxlVar : zzxlVarArrValues) {
            zzZ[zzxlVar.zzac] = zzxlVar;
        }
    }

    zzxl(int i2, int i3, zzyh zzyhVar) {
        this.zzac = i2;
        this.zzab = zzyhVar;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            this.zzad = zzyhVar.zza();
        } else {
            this.zzad = null;
        }
        if (i3 == 1) {
            zzyh zzyhVar2 = zzyh.VOID;
            zzyhVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzac;
    }
}
