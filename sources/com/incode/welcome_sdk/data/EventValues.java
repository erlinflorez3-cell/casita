package com.incode.welcome_sdk.data;

import com.npmdavi.davinotification.Constant;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class EventValues {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EventValues[] $VALUES;
    private final String value;
    public static final EventValues ACTION = new EventValues("ACTION", 0, Constant.NOTIFICATION_DETAILS_ACTION);
    public static final EventValues AUTO_FOCUS = new EventValues("AUTO_FOCUS", 1, "autoFocus");
    public static final EventValues CONFIGURATION_NAME = new EventValues("CONFIGURATION_NAME", 2, "configurationName");
    public static final EventValues ERROR_MESSAGE = new EventValues("ERROR_MESSAGE", 3, "errorMessage");
    public static final EventValues ERROR_STATES = new EventValues("ERROR_STATES", 4, "errorStates");
    public static final EventValues ERROR_TYPE = new EventValues("ERROR_TYPE", 5, "errorType");
    public static final EventValues ERROR_DESCRIPTION = new EventValues("ERROR_DESCRIPTION", 6, "errorDescription");
    public static final EventValues FAILURE_EXCEPTION = new EventValues("FAILURE_EXCEPTION", 7, "failureException");
    public static final EventValues FAILURE_EXCEPTION_MESSAGE = new EventValues("FAILURE_EXCEPTION_MESSAGE", 8, "failureExceptionMessage");
    public static final EventValues FILE_SIZE = new EventValues("FILE_SIZE", 9, "fileSize");
    public static final EventValues MODULE = new EventValues("MODULE", 10, "module");
    public static final EventValues RESOLUTION = new EventValues("RESOLUTION", 11, "resolution");
    public static final EventValues SCREEN_NAME = new EventValues("SCREEN_NAME", 12, "screenName");
    public static final EventValues VERTICAL_ID_DETECTED = new EventValues("VERTICAL_ID_DETECTED", 13, "verticalIdDetected");
    public static final EventValues HORIZONTAL_ID_DETECTED = new EventValues("HORIZONTAL_ID_DETECTED", 14, "horizontalIdDetected");
    public static final EventValues NEW_ORIENTATION = new EventValues("NEW_ORIENTATION", 15, "newOrientation");
    public static final EventValues VERTICAL = new EventValues("VERTICAL", 16, "vertical");
    public static final EventValues HORIZONTAL = new EventValues("HORIZONTAL", 17, "horizontal");
    public static final EventValues SECTION_NAME = new EventValues("SECTION_NAME", 18, "sectionName");
    public static final EventValues TIMESTAMP = new EventValues("TIMESTAMP", 19, "timestamp");
    public static final EventValues UPLOAD_URL = new EventValues("UPLOAD_URL", 20, "uploadURL");
    public static final EventValues VERSION = new EventValues("VERSION", 21, "version");
    public static final EventValues VERSION_DETAILS = new EventValues("VERSION_DETAILS", 22, "versionDetails");
    public static final EventValues VIDEO_LENGTH = new EventValues("VIDEO_LENGTH", 23, "videoLength");
    public static final EventValues VIDEO_CODEC = new EventValues("VIDEO_CODEC", 24, "videoCodec");
    public static final EventValues AUDIO_REQUESTED = new EventValues("AUDIO_REQUESTED", 25, "audioRequested");
    public static final EventValues AUDIO_RECORDED = new EventValues("AUDIO_RECORDED", 26, "audioRecorded");
    public static final EventValues PREVIOUS_INTERVIEW_ID = new EventValues("PREVIOUS_INTERVIEW_ID", 27, "previousInterviewId");
    public static final EventValues LOGS = new EventValues("LOGS", 28, "logs");
    public static final EventValues FEEDBACK = new EventValues("FEEDBACK", 29, "feedback");
    public static final EventValues MODULE_VERSION = new EventValues("MODULE_VERSION", 30, "moduleVersion");
    public static final EventValues ID_TEXT_BARCODE_READABILITY = new EventValues("ID_TEXT_BARCODE_READABILITY", 31, "idTextBarcodeReadability");
    public static final EventValues ID_IOU_CHECK = new EventValues("ID_IOU_CHECK", 32, "id_iou_check");

    private static final /* synthetic */ EventValues[] $values() {
        return new EventValues[]{ACTION, AUTO_FOCUS, CONFIGURATION_NAME, ERROR_MESSAGE, ERROR_STATES, ERROR_TYPE, ERROR_DESCRIPTION, FAILURE_EXCEPTION, FAILURE_EXCEPTION_MESSAGE, FILE_SIZE, MODULE, RESOLUTION, SCREEN_NAME, VERTICAL_ID_DETECTED, HORIZONTAL_ID_DETECTED, NEW_ORIENTATION, VERTICAL, HORIZONTAL, SECTION_NAME, TIMESTAMP, UPLOAD_URL, VERSION, VERSION_DETAILS, VIDEO_LENGTH, VIDEO_CODEC, AUDIO_REQUESTED, AUDIO_RECORDED, PREVIOUS_INTERVIEW_ID, LOGS, FEEDBACK, MODULE_VERSION, ID_TEXT_BARCODE_READABILITY, ID_IOU_CHECK};
    }

    public static EnumEntries<EventValues> getEntries() {
        return $ENTRIES;
    }

    public static EventValues valueOf(String str) {
        return (EventValues) Enum.valueOf(EventValues.class, str);
    }

    public static EventValues[] values() {
        return (EventValues[]) $VALUES.clone();
    }

    private EventValues(String str, int i2, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        EventValues[] eventValuesArr$values = $values();
        $VALUES = eventValuesArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(eventValuesArr$values);
    }
}
