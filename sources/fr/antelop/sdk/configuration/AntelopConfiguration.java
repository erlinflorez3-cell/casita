package fr.antelop.sdk.configuration;

/* JADX INFO: loaded from: classes5.dex */
public final class AntelopConfiguration {
    private final String applicationId;
    private final String issuerId;

    public AntelopConfiguration(Long l2, String str) {
        if (l2 != null) {
            this.applicationId = String.valueOf(l2);
        } else {
            this.applicationId = null;
        }
        this.issuerId = str;
    }

    public AntelopConfiguration(String str, String str2) {
        this.applicationId = str;
        this.issuerId = str2;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getIssuerId() {
        return this.issuerId;
    }
}
