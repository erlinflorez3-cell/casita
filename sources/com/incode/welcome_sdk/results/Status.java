package com.incode.welcome_sdk.results;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class Status {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Status[] $VALUES;
    private final String value;
    public static final Status UNCLEAR = new Status("UNCLEAR", 0, "UNCLEAR");
    public static final Status PASS = new Status("PASS", 1, "PASS");
    public static final Status FAIL = new Status("FAIL", 2, "FAIL");

    private static final /* synthetic */ Status[] $values() {
        return new Status[]{UNCLEAR, PASS, FAIL};
    }

    public static EnumEntries<Status> getEntries() {
        return $ENTRIES;
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) $VALUES.clone();
    }

    private Status(String str, int i2, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        Status[] statusArr$values = $values();
        $VALUES = statusArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(statusArr$values);
    }
}
