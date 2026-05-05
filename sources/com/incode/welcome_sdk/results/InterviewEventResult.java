package com.incode.welcome_sdk.results;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class InterviewEventResult {
    public static final int $stable = 8;
    private final String eventName;
    private final Long eventTimeStamp;
    private final String moduleName;
    private final Map<String, Object> payload;
    private final String screenName;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterviewEventResult copy$default(InterviewEventResult interviewEventResult, String str, String str2, String str3, Map map, Long l2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = interviewEventResult.eventName;
        }
        if ((i2 & 2) != 0) {
            str2 = interviewEventResult.moduleName;
        }
        if ((i2 & 4) != 0) {
            str3 = interviewEventResult.screenName;
        }
        if ((i2 & 8) != 0) {
            map = interviewEventResult.payload;
        }
        if ((i2 & 16) != 0) {
            l2 = interviewEventResult.eventTimeStamp;
        }
        return interviewEventResult.copy(str, str2, str3, map, l2);
    }

    public final String component1() {
        return this.eventName;
    }

    public final String component2() {
        return this.moduleName;
    }

    public final String component3() {
        return this.screenName;
    }

    public final Map<String, Object> component4() {
        return this.payload;
    }

    public final Long component5() {
        return this.eventTimeStamp;
    }

    public final InterviewEventResult copy(String eventName, String str, String str2, Map<String, ? extends Object> map, Long l2) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        return new InterviewEventResult(eventName, str, str2, map, l2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterviewEventResult)) {
            return false;
        }
        InterviewEventResult interviewEventResult = (InterviewEventResult) obj;
        return Intrinsics.areEqual(this.eventName, interviewEventResult.eventName) && Intrinsics.areEqual(this.moduleName, interviewEventResult.moduleName) && Intrinsics.areEqual(this.screenName, interviewEventResult.screenName) && Intrinsics.areEqual(this.payload, interviewEventResult.payload) && Intrinsics.areEqual(this.eventTimeStamp, interviewEventResult.eventTimeStamp);
    }

    public final int hashCode() {
        int iHashCode = this.eventName.hashCode() * 31;
        String str = this.moduleName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.screenName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Object> map = this.payload;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Long l2 = this.eventTimeStamp;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "InterviewEventResult(eventName=" + this.eventName + ", moduleName=" + this.moduleName + ", screenName=" + this.screenName + ", payload=" + this.payload + ", eventTimeStamp=" + this.eventTimeStamp + ")";
    }

    public InterviewEventResult(String eventName, String str, String str2, Map<String, ? extends Object> map, Long l2) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.eventName = eventName;
        this.moduleName = str;
        this.screenName = str2;
        this.payload = map;
        this.eventTimeStamp = l2;
    }

    public /* synthetic */ InterviewEventResult(String str, String str2, String str3, Map map, Long l2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : map, (i2 & 16) == 0 ? l2 : null);
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final String getModuleName() {
        return this.moduleName;
    }

    public final String getScreenName() {
        return this.screenName;
    }

    public final Map<String, Object> getPayload() {
        return this.payload;
    }

    public final Long getEventTimeStamp() {
        return this.eventTimeStamp;
    }
}
