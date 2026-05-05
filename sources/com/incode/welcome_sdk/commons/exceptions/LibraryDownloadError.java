package com.incode.welcome_sdk.commons.exceptions;

import kotlin.Deprecated;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated(message = "Libraries are now bundled with the SDK, and always available. This class should not be used anymore")
public final class LibraryDownloadError {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LibraryDownloadError[] $VALUES;
    public static final LibraryDownloadError INSUFFICIENT_SPACE = new LibraryDownloadError("INSUFFICIENT_SPACE", 0);
    public static final LibraryDownloadError NETWORK_ERROR = new LibraryDownloadError("NETWORK_ERROR", 1);
    public static final LibraryDownloadError ERROR_LOADING_LIBRARIES = new LibraryDownloadError("ERROR_LOADING_LIBRARIES", 2);

    private static final /* synthetic */ LibraryDownloadError[] $values() {
        return new LibraryDownloadError[]{INSUFFICIENT_SPACE, NETWORK_ERROR, ERROR_LOADING_LIBRARIES};
    }

    public static EnumEntries<LibraryDownloadError> getEntries() {
        return $ENTRIES;
    }

    public static LibraryDownloadError valueOf(String str) {
        return (LibraryDownloadError) Enum.valueOf(LibraryDownloadError.class, str);
    }

    public static LibraryDownloadError[] values() {
        return (LibraryDownloadError[]) $VALUES.clone();
    }

    private LibraryDownloadError(String str, int i2) {
    }

    static {
        LibraryDownloadError[] libraryDownloadErrorArr$values = $values();
        $VALUES = libraryDownloadErrorArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(libraryDownloadErrorArr$values);
    }
}
