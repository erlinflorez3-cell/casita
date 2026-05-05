package com.dynatrace.android.agent.conf;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class UserPrivacyOptions {
    private static final String LOGTAG = Global.LOG_PREFIX + "UserPrivacyOptions";
    private final boolean crashReplayOptedIn;
    private final boolean crashReportingOptedIn;
    private final DataCollectionLevel dataCollectionLevel;
    private final Boolean screenRecordOptedIn;

    public static class Builder {
        private boolean crashReplayOptedIn;
        private boolean crashReportingOptedIn;
        private DataCollectionLevel dataCollectionLevel;
        private Boolean screenRecordOptedIn;

        public Builder() {
            this.dataCollectionLevel = DataCollectionLevel.OFF;
            this.crashReportingOptedIn = false;
            this.crashReplayOptedIn = false;
            this.screenRecordOptedIn = null;
        }

        private Builder(UserPrivacyOptions userPrivacyOptions) {
            this.dataCollectionLevel = userPrivacyOptions.dataCollectionLevel;
            this.crashReportingOptedIn = userPrivacyOptions.crashReportingOptedIn;
            this.crashReplayOptedIn = userPrivacyOptions.crashReplayOptedIn;
            this.screenRecordOptedIn = userPrivacyOptions.screenRecordOptedIn;
        }

        public UserPrivacyOptions build() {
            return new UserPrivacyOptions(this);
        }

        @Deprecated(since = "8.321")
        public Builder withCrashReplayOptedIn(boolean z2) {
            if (this.screenRecordOptedIn == null) {
                this.crashReplayOptedIn = z2;
            }
            return this;
        }

        public Builder withCrashReportingOptedIn(boolean z2) {
            this.crashReportingOptedIn = z2;
            return this;
        }

        public Builder withDataCollectionLevel(DataCollectionLevel dataCollectionLevel) {
            if (dataCollectionLevel != null) {
                this.dataCollectionLevel = dataCollectionLevel;
                return this;
            }
            if (Global.DEBUG) {
                Utility.zlogE(UserPrivacyOptions.LOGTAG, "dataCollectionLevel == null is not allowed");
            }
            return this;
        }

        public Builder withScreenRecordOptedIn(Boolean bool) {
            this.screenRecordOptedIn = bool;
            if (bool != null) {
                this.crashReplayOptedIn = bool.booleanValue();
            }
            return this;
        }
    }

    private UserPrivacyOptions(Builder builder) {
        this.dataCollectionLevel = builder.dataCollectionLevel;
        this.crashReportingOptedIn = builder.crashReportingOptedIn;
        this.crashReplayOptedIn = builder.crashReplayOptedIn;
        this.screenRecordOptedIn = builder.screenRecordOptedIn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserPrivacyOptions userPrivacyOptions = (UserPrivacyOptions) obj;
        return this.dataCollectionLevel == userPrivacyOptions.dataCollectionLevel && this.crashReportingOptedIn == userPrivacyOptions.crashReportingOptedIn && this.crashReplayOptedIn == userPrivacyOptions.crashReplayOptedIn && Objects.equals(this.screenRecordOptedIn, userPrivacyOptions.screenRecordOptedIn);
    }

    public DataCollectionLevel getDataCollectionLevel() {
        return this.dataCollectionLevel;
    }

    public int hashCode() {
        int iHashCode = ((((this.dataCollectionLevel.hashCode() * 31) + (this.crashReportingOptedIn ? 1 : 0)) * 31) + (this.crashReplayOptedIn ? 1 : 0)) * 31;
        Boolean bool = this.screenRecordOptedIn;
        return iHashCode + ((bool == null || !bool.booleanValue()) ? 0 : 1);
    }

    @Deprecated(since = "8.321")
    public boolean isCrashReplayOptedIn() {
        return this.crashReplayOptedIn;
    }

    public boolean isCrashReportingOptedIn() {
        return this.crashReportingOptedIn;
    }

    public Boolean isScreenRecordOptedIn() {
        return this.screenRecordOptedIn;
    }

    public Builder newBuilder() {
        return new Builder();
    }

    public String toString() {
        return "UserPrivacyOptions{dataCollectionLevel=" + this.dataCollectionLevel + ", crashReportingOptedIn=" + this.crashReportingOptedIn + ", crashReplayOptedIn=" + this.crashReplayOptedIn + ", screenRecordOptedIn=" + this.screenRecordOptedIn + AbstractJsonLexerKt.END_OBJ;
    }
}
