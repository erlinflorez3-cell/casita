package com.incode.welcome_sdk.data;

import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class FlowType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FlowType[] $VALUES;
    public static final d Companion;
    public static final FlowType FLOW = new FlowType("FLOW", 0);
    public static final FlowType WORKFLOW = new FlowType("WORKFLOW", 1);

    private static final /* synthetic */ FlowType[] $values() {
        return new FlowType[]{FLOW, WORKFLOW};
    }

    @JvmStatic
    public static final FlowType fromName(String str) {
        return Companion.c(str);
    }

    public static EnumEntries<FlowType> getEntries() {
        return $ENTRIES;
    }

    public static FlowType valueOf(String str) {
        return (FlowType) Enum.valueOf(FlowType.class, str);
    }

    public static FlowType[] values() {
        return (FlowType[]) $VALUES.clone();
    }

    private FlowType(String str, int i2) {
    }

    static {
        FlowType[] flowTypeArr$values = $values();
        $VALUES = flowTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(flowTypeArr$values);
        Companion = new d(null);
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f7471b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f7472c = 1;

        private d() {
        }

        @JvmStatic
        public final FlowType c(String str) {
            int i2 = 2 % 2;
            int i3 = f7471b + 19;
            f7472c = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            FlowType flowTypeValueOf = FlowType.valueOf(upperCase);
            int i5 = f7472c + 39;
            f7471b = i5 % 128;
            int i6 = i5 % 2;
            return flowTypeValueOf;
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
