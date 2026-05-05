package com.incode.welcome_sdk.results;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes5.dex */
public final class ResultCode extends Enum<ResultCode> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ResultCode[] $VALUES;
    public static final ResultCode SUCCESS = new ResultCode("SUCCESS", 0);
    public static final ResultCode ERROR = new ResultCode("ERROR", 1);
    public static final ResultCode USER_CANCELLED = new ResultCode("USER_CANCELLED", 2);
    public static final ResultCode EMULATOR_DETECTED = new ResultCode("EMULATOR_DETECTED", 3);

    private static final /* synthetic */ ResultCode[] $values() {
        return new ResultCode[]{SUCCESS, ERROR, USER_CANCELLED, EMULATOR_DETECTED};
    }

    public static EnumEntries<ResultCode> getEntries() {
        return $ENTRIES;
    }

    public static ResultCode valueOf(String str) {
        return (ResultCode) Enum.valueOf(ResultCode.class, str);
    }

    public static ResultCode[] values() {
        return (ResultCode[]) $VALUES.clone();
    }

    private ResultCode(String str, int i2) {
        super(str, i2);
    }

    static {
        ResultCode[] resultCodeArr$values = $values();
        $VALUES = resultCodeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(resultCodeArr$values);
    }
}
