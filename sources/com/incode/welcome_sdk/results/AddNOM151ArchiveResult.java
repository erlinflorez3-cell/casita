package com.incode.welcome_sdk.results;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class AddNOM151ArchiveResult {
    public static final int $stable = 0;
    private final String archiveUrl;
    private final String signature;

    public static /* synthetic */ AddNOM151ArchiveResult copy$default(AddNOM151ArchiveResult addNOM151ArchiveResult, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = addNOM151ArchiveResult.archiveUrl;
        }
        if ((i2 & 2) != 0) {
            str2 = addNOM151ArchiveResult.signature;
        }
        return addNOM151ArchiveResult.copy(str, str2);
    }

    public final String component1() {
        return this.archiveUrl;
    }

    public final String component2() {
        return this.signature;
    }

    public final AddNOM151ArchiveResult copy(String str, String str2) {
        return new AddNOM151ArchiveResult(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddNOM151ArchiveResult)) {
            return false;
        }
        AddNOM151ArchiveResult addNOM151ArchiveResult = (AddNOM151ArchiveResult) obj;
        return Intrinsics.areEqual(this.archiveUrl, addNOM151ArchiveResult.archiveUrl) && Intrinsics.areEqual(this.signature, addNOM151ArchiveResult.signature);
    }

    public final int hashCode() {
        String str = this.archiveUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.signature;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "AddNOM151ArchiveResult(archiveUrl=" + this.archiveUrl + ", signature=" + this.signature + ")";
    }

    public AddNOM151ArchiveResult(String str, String str2) {
        this.archiveUrl = str;
        this.signature = str2;
    }

    public final String getArchiveUrl() {
        return this.archiveUrl;
    }

    public final String getSignature() {
        return this.signature;
    }
}
