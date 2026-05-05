package com.incode.welcome_sdk;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ScreenName extends Enum<ScreenName> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ScreenName[] $VALUES;
    public static final ScreenName AES_PRESIGN = new ScreenName("AES_PRESIGN", 0);
    public static final ScreenName AES_SIGNED = new ScreenName("AES_SIGNED", 1);
    public static final ScreenName AES_FAILED = new ScreenName("AES_FAILED", 2);
    public static final ScreenName AES_SUCCESS = new ScreenName("AES_SUCCESS", 3);
    public static final ScreenName AES_CONFIRMED_SIGNATURE_DETAILS = new ScreenName("AES_CONFIRMED_SIGNATURE_DETAILS", 4);
    public static final ScreenName QES_PRESIGN = new ScreenName("QES_PRESIGN", 5);
    public static final ScreenName QES_SIGNED = new ScreenName("QES_SIGNED", 6);
    public static final ScreenName QES_FAILED = new ScreenName("QES_FAILED", 7);
    public static final ScreenName QES_SUCCESS = new ScreenName("QES_SUCCESS", 8);
    public static final ScreenName QES_CONFIRMED_SIGNATURE_DETAILS = new ScreenName("QES_CONFIRMED_SIGNATURE_DETAILS", 9);
    public static final ScreenName INTRO = new ScreenName("INTRO", 10);
    public static final ScreenName ID_CAPTURE_TUTORIAL = new ScreenName("ID_CAPTURE_TUTORIAL", 11);
    public static final ScreenName ID_TYPE_CHOOSER = new ScreenName("ID_TYPE_CHOOSER", 12);
    public static final ScreenName FAKE_PERMISSION = new ScreenName("FAKE_PERMISSION", 13);
    public static final ScreenName FAKE_PERMISSION_DECLINE = new ScreenName("FAKE_PERMISSION_DECLINE", 14);
    public static final ScreenName REAL_PERMISSION_DECLINE = new ScreenName("REAL_PERMISSION_DECLINE", 15);
    public static final ScreenName FRONT_ID_CAPTURE_TUTORIAL = new ScreenName("FRONT_ID_CAPTURE_TUTORIAL", 16);
    public static final ScreenName FRONT_ID_CAMERA_CAPTURE = new ScreenName("FRONT_ID_CAMERA_CAPTURE", 17);
    public static final ScreenName FRONT_ID_HELP = new ScreenName("FRONT_ID_HELP", 18);
    public static final ScreenName FRONT_ID_REVIEW_PHOTO = new ScreenName("FRONT_ID_REVIEW_PHOTO", 19);
    public static final ScreenName BACK_ID_CAPTURE_TUTORIAL = new ScreenName("BACK_ID_CAPTURE_TUTORIAL", 20);
    public static final ScreenName BACK_ID_CAMERA_CAPTURE = new ScreenName("BACK_ID_CAMERA_CAPTURE", 21);
    public static final ScreenName BACK_ID_HELP = new ScreenName("BACK_ID_HELP", 22);
    public static final ScreenName BACK_ID_REVIEW_PHOTO = new ScreenName("BACK_ID_REVIEW_PHOTO", 23);
    public static final ScreenName PASSPORT_CAMERA_CAPTURE = new ScreenName("PASSPORT_CAMERA_CAPTURE", 24);
    public static final ScreenName PASSPORT_CAPTURE_TUTORIAL = new ScreenName("PASSPORT_CAPTURE_TUTORIAL", 25);
    public static final ScreenName DOCUMENT_SCAN_PROBLEM = new ScreenName("DOCUMENT_SCAN_PROBLEM", 26);
    public static final ScreenName DOCUMENT_SCAN_SUCCESS = new ScreenName("DOCUMENT_SCAN_SUCCESS", 27);
    public static final ScreenName ID_INFO = new ScreenName("ID_INFO", 28);
    public static final ScreenName ID_PROCESS = new ScreenName("ID_PROCESS", 29);
    public static final ScreenName ID_SUMMARY = new ScreenName("ID_SUMMARY", 30);
    public static final ScreenName SELFIE_CAPTURE_TUTORIAL = new ScreenName("SELFIE_CAPTURE_TUTORIAL", 31);
    public static final ScreenName SELFIE_CAMERA_CAPTURE = new ScreenName("SELFIE_CAMERA_CAPTURE", 32);
    public static final ScreenName BARCODE_TUTORIAL = new ScreenName("BARCODE_TUTORIAL", 33);
    public static final ScreenName BARCODE_UPLOAD = new ScreenName("BARCODE_UPLOAD", 34);
    public static final ScreenName BARCODE_SCAN = new ScreenName("BARCODE_SCAN", 35);
    public static final ScreenName QR_TUTORIAL = new ScreenName("QR_TUTORIAL", 36);
    public static final ScreenName QR_SCAN = new ScreenName("QR_SCAN", 37);
    public static final ScreenName QR_SCAN_FAILURE_COMMON_ISSUES = new ScreenName("QR_SCAN_FAILURE_COMMON_ISSUES", 38);
    public static final ScreenName CAMERA_PERMISSION_MANDATORY_DIALOG = new ScreenName("CAMERA_PERMISSION_MANDATORY_DIALOG", 39);
    public static final ScreenName CCV_INPUT = new ScreenName("CCV_INPUT", 40);
    public static final ScreenName FACE_MATCH = new ScreenName("FACE_MATCH", 41);
    public static final ScreenName FACE_MATCH_COMPACT = new ScreenName("FACE_MATCH_COMPACT", 42);
    public static final ScreenName DOCUMENT_CAPTURE_CHOOSER = new ScreenName("DOCUMENT_CAPTURE_CHOOSER", 43);
    public static final ScreenName DOCUMENT_CAPTURE_TUTORIAL = new ScreenName("DOCUMENT_CAPTURE_TUTORIAL", 44);
    public static final ScreenName DOCUMENT_CAMERA_CAPTURE = new ScreenName("DOCUMENT_CAMERA_CAPTURE", 45);
    public static final ScreenName DOCUMENT_HELP = new ScreenName("DOCUMENT_HELP", 46);
    public static final ScreenName DOCUMENT_REVIEW_PHOTO = new ScreenName("DOCUMENT_REVIEW_PHOTO", 47);
    public static final ScreenName NAME_INPUT = new ScreenName("NAME_INPUT", 48);
    public static final ScreenName PHONE_INPUT = new ScreenName("PHONE_INPUT", 49);
    public static final ScreenName EMAIL_INPUT = new ScreenName("EMAIL_INPUT", 50);
    public static final ScreenName OTP = new ScreenName("OTP", 51);
    public static final ScreenName SIGNATURE_INPUT = new ScreenName("SIGNATURE_INPUT", 52);
    public static final ScreenName USER_CONSENT = new ScreenName("USER_CONSENT", 53);
    public static final ScreenName MACHINE_LEARNING_CONSENT = new ScreenName("MACHINE_LEARNING_CONSENT", 54);
    public static final ScreenName COMBINED_CONSENT = new ScreenName("COMBINED_CONSENT", 55);
    public static final ScreenName MANDATORY_BIOMETRIC_CONSENT = new ScreenName("MANDATORY_BIOMETRIC_CONSENT", 56);
    public static final ScreenName MICROPHONE_PERMISSION_MANDATORY_DIALOG = new ScreenName("MICROPHONE_PERMISSION_MANDATORY_DIALOG", 57);
    public static final ScreenName GEOLOCATION = new ScreenName("GEOLOCATION", 58);
    public static final ScreenName GEOLOCATION_PERMISSION_MANDATORY_DIALOG = new ScreenName("GEOLOCATION_PERMISSION_MANDATORY_DIALOG", 59);
    public static final ScreenName CONFERENCE_WAIT = new ScreenName("CONFERENCE_WAIT", 60);
    public static final ScreenName CONFERENCE_VIDEO_CHAT = new ScreenName("CONFERENCE_VIDEO_CHAT", 61);
    public static final ScreenName CONFERENCE_MESSAGE_CHAT = new ScreenName("CONFERENCE_MESSAGE_CHAT", 62);
    public static final ScreenName VIDEO_SELFIE_SETTING_UP = new ScreenName("VIDEO_SELFIE_SETTING_UP", 63);
    public static final ScreenName VIDEO_SELFIE_TUTORIAL = new ScreenName("VIDEO_SELFIE_TUTORIAL", 64);
    public static final ScreenName VIDEO_SELFIE_VOICE_QUESTION_X = new ScreenName("VIDEO_SELFIE_VOICE_QUESTION_X", 65);
    public static final ScreenName VIDEO_SELFIE_VOICE_FINAL_QUESTION = new ScreenName("VIDEO_SELFIE_VOICE_FINAL_QUESTION", 66);
    public static final ScreenName VIDEO_SELFIE_VIDEO_UPLOAD = new ScreenName("VIDEO_SELFIE_VIDEO_UPLOAD", 67);
    public static final ScreenName ENTER_CURP = new ScreenName("ENTER_CURP", 68);
    public static final ScreenName VALIDATE_CURP = new ScreenName("VALIDATE_CURP", 69);
    public static final ScreenName GENERATE_CURP = new ScreenName("GENERATE_CURP", 70);
    public static final ScreenName SHOW_RESULTS = new ScreenName("SHOW_RESULTS", 71);
    public static final ScreenName INCODE_WATCHLIST_VALIDATION_PROGRESS = new ScreenName("INCODE_WATCHLIST_VALIDATION_PROGRESS", 72);
    public static final ScreenName NFC_SCAN_EDIT_OCR = new ScreenName("NFC_SCAN_EDIT_OCR", 73);
    public static final ScreenName NFC_SCAN_TUTORIAL = new ScreenName("NFC_SCAN_TUTORIAL", 74);
    public static final ScreenName NFC_SCAN = new ScreenName("NFC_SCAN", 75);
    public static final ScreenName NFC_SCAN_RESULT = new ScreenName("NFC_SCAN_RESULT", 76);
    public static final ScreenName NFC_SCAN_SUCCESS = new ScreenName("NFC_SCAN_SUCCESS", 77);
    public static final ScreenName NFC_SCAN_FAILURE = new ScreenName("NFC_SCAN_FAILURE", 78);
    public static final ScreenName NFC_SCAN_UNHAPPY_TUTORIAL_ONE = new ScreenName("NFC_SCAN_UNHAPPY_TUTORIAL_ONE", 79);
    public static final ScreenName NFC_SCAN_UNHAPPY_TUTORIAL_TWO = new ScreenName("NFC_SCAN_UNHAPPY_TUTORIAL_TWO", 80);
    public static final ScreenName NFC_SCAN_UNHAPPY_TUTORIAL_THREE = new ScreenName("NFC_SCAN_UNHAPPY_TUTORIAL_THREE", 81);
    public static final ScreenName NFC_SCAN_UNHAPPY_TUTORIAL_FOUR = new ScreenName("NFC_SCAN_UNHAPPY_TUTORIAL_FOUR", 82);
    public static final ScreenName NFC_FAILURE_COMMON_ISSUES = new ScreenName("NFC_FAILURE_COMMON_ISSUES", 83);
    public static final ScreenName NFC_PERMISSION_MANDATORY_DIALOG = new ScreenName("NFC_PERMISSION_MANDATORY_DIALOG", 84);
    public static final ScreenName EKYB_INPUT = new ScreenName("EKYB_INPUT", 85);
    public static final ScreenName EKYB_PROGRESS = new ScreenName("EKYB_PROGRESS", 86);
    public static final ScreenName EKYB_SUCCEEDED = new ScreenName("EKYB_SUCCEEDED", 87);
    public static final ScreenName EKYB_FAILED = new ScreenName("EKYB_FAILED", 88);
    public static final ScreenName EKYC_INPUT = new ScreenName("EKYC_INPUT", 89);
    public static final ScreenName EKYC_PROGRESS = new ScreenName("EKYC_PROGRESS", 90);
    public static final ScreenName EKYC_SUCCEEDED = new ScreenName("EKYC_SUCCEEDED", 91);
    public static final ScreenName EKYC_FAILED = new ScreenName("EKYC_FAILED", 92);
    public static final ScreenName GLOBAL_WATCHLIST_INPUT = new ScreenName("GLOBAL_WATCHLIST_INPUT", 93);
    public static final ScreenName GLOBAL_WATCHLIST_PROGRESS = new ScreenName("GLOBAL_WATCHLIST_PROGRESS", 94);
    public static final ScreenName GLOBAL_WATCHLIST_SUCCEEDED = new ScreenName("GLOBAL_WATCHLIST_SUCCEEDED", 95);
    public static final ScreenName GLOBAL_WATCHLIST_FAILED = new ScreenName("GLOBAL_WATCHLIST_FAILED", 96);
    public static final ScreenName DYNAMIC_FORMS = new ScreenName("DYNAMIC_FORMS", 97);
    public static final ScreenName ACCEPT_VIDEO_SELFIE = new ScreenName("ACCEPT_VIDEO_SELFIE", 98);
    public static final ScreenName APPROVE = new ScreenName("APPROVE", 99);
    public static final ScreenName VIDEO_SELFIE = new ScreenName("VIDEO_SELFIE", 100);
    public static final ScreenName CUSTOM_WATCHLIST = new ScreenName("CUSTOM_WATCHLIST", 101);
    public static final ScreenName GLOBAL_WATCHLIST = new ScreenName("GLOBAL_WATCHLIST", 102);
    public static final ScreenName GOVERNMENT_VALIDATION = new ScreenName("GOVERNMENT_VALIDATION", 103);
    public static final ScreenName TUTORIAL_FRONT_SECOND_ID = new ScreenName("TUTORIAL_FRONT_SECOND_ID", 104);
    public static final ScreenName TUTORIAL_BACK_SECOND_ID = new ScreenName("TUTORIAL_BACK_SECOND_ID", 105);
    public static final ScreenName VALIDATION = new ScreenName("VALIDATION", 106);
    public static final ScreenName SELFIE = new ScreenName("SELFIE", 107);
    public static final ScreenName TUTORIAL_SECOND_PASSPORT = new ScreenName("TUTORIAL_SECOND_PASSPORT", 108);
    public static final ScreenName QR_FACE_LOGIN_QR_SCAN = new ScreenName("QR_FACE_LOGIN_QR_SCAN", 109);
    public static final ScreenName QR_FACE_LOGIN_FACE_SCAN = new ScreenName("QR_FACE_LOGIN_FACE_SCAN", 110);
    public static final ScreenName NFC_SYMBOL_CONFIRMATION = new ScreenName("NFC_SYMBOL_CONFIRMATION", 111);
    public static final ScreenName NO_NFC_ACCESS = new ScreenName("NO_NFC_ACCESS", PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION);
    public static final ScreenName ANTIFRAUD = new ScreenName("ANTIFRAUD", 113);
    public static final ScreenName TAX_ID_VALIDATION = new ScreenName("TAX_ID_VALIDATION", 114);
    public static final ScreenName TRANSITION_LOADER = new ScreenName("TRANSITION_LOADER", 115);
    public static final ScreenName UNUSED = new ScreenName("UNUSED", 116);

    private static final /* synthetic */ ScreenName[] $values() {
        return new ScreenName[]{AES_PRESIGN, AES_SIGNED, AES_FAILED, AES_SUCCESS, AES_CONFIRMED_SIGNATURE_DETAILS, QES_PRESIGN, QES_SIGNED, QES_FAILED, QES_SUCCESS, QES_CONFIRMED_SIGNATURE_DETAILS, INTRO, ID_CAPTURE_TUTORIAL, ID_TYPE_CHOOSER, FAKE_PERMISSION, FAKE_PERMISSION_DECLINE, REAL_PERMISSION_DECLINE, FRONT_ID_CAPTURE_TUTORIAL, FRONT_ID_CAMERA_CAPTURE, FRONT_ID_HELP, FRONT_ID_REVIEW_PHOTO, BACK_ID_CAPTURE_TUTORIAL, BACK_ID_CAMERA_CAPTURE, BACK_ID_HELP, BACK_ID_REVIEW_PHOTO, PASSPORT_CAMERA_CAPTURE, PASSPORT_CAPTURE_TUTORIAL, DOCUMENT_SCAN_PROBLEM, DOCUMENT_SCAN_SUCCESS, ID_INFO, ID_PROCESS, ID_SUMMARY, SELFIE_CAPTURE_TUTORIAL, SELFIE_CAMERA_CAPTURE, BARCODE_TUTORIAL, BARCODE_UPLOAD, BARCODE_SCAN, QR_TUTORIAL, QR_SCAN, QR_SCAN_FAILURE_COMMON_ISSUES, CAMERA_PERMISSION_MANDATORY_DIALOG, CCV_INPUT, FACE_MATCH, FACE_MATCH_COMPACT, DOCUMENT_CAPTURE_CHOOSER, DOCUMENT_CAPTURE_TUTORIAL, DOCUMENT_CAMERA_CAPTURE, DOCUMENT_HELP, DOCUMENT_REVIEW_PHOTO, NAME_INPUT, PHONE_INPUT, EMAIL_INPUT, OTP, SIGNATURE_INPUT, USER_CONSENT, MACHINE_LEARNING_CONSENT, COMBINED_CONSENT, MANDATORY_BIOMETRIC_CONSENT, MICROPHONE_PERMISSION_MANDATORY_DIALOG, GEOLOCATION, GEOLOCATION_PERMISSION_MANDATORY_DIALOG, CONFERENCE_WAIT, CONFERENCE_VIDEO_CHAT, CONFERENCE_MESSAGE_CHAT, VIDEO_SELFIE_SETTING_UP, VIDEO_SELFIE_TUTORIAL, VIDEO_SELFIE_VOICE_QUESTION_X, VIDEO_SELFIE_VOICE_FINAL_QUESTION, VIDEO_SELFIE_VIDEO_UPLOAD, ENTER_CURP, VALIDATE_CURP, GENERATE_CURP, SHOW_RESULTS, INCODE_WATCHLIST_VALIDATION_PROGRESS, NFC_SCAN_EDIT_OCR, NFC_SCAN_TUTORIAL, NFC_SCAN, NFC_SCAN_RESULT, NFC_SCAN_SUCCESS, NFC_SCAN_FAILURE, NFC_SCAN_UNHAPPY_TUTORIAL_ONE, NFC_SCAN_UNHAPPY_TUTORIAL_TWO, NFC_SCAN_UNHAPPY_TUTORIAL_THREE, NFC_SCAN_UNHAPPY_TUTORIAL_FOUR, NFC_FAILURE_COMMON_ISSUES, NFC_PERMISSION_MANDATORY_DIALOG, EKYB_INPUT, EKYB_PROGRESS, EKYB_SUCCEEDED, EKYB_FAILED, EKYC_INPUT, EKYC_PROGRESS, EKYC_SUCCEEDED, EKYC_FAILED, GLOBAL_WATCHLIST_INPUT, GLOBAL_WATCHLIST_PROGRESS, GLOBAL_WATCHLIST_SUCCEEDED, GLOBAL_WATCHLIST_FAILED, DYNAMIC_FORMS, ACCEPT_VIDEO_SELFIE, APPROVE, VIDEO_SELFIE, CUSTOM_WATCHLIST, GLOBAL_WATCHLIST, GOVERNMENT_VALIDATION, TUTORIAL_FRONT_SECOND_ID, TUTORIAL_BACK_SECOND_ID, VALIDATION, SELFIE, TUTORIAL_SECOND_PASSPORT, QR_FACE_LOGIN_QR_SCAN, QR_FACE_LOGIN_FACE_SCAN, NFC_SYMBOL_CONFIRMATION, NO_NFC_ACCESS, ANTIFRAUD, TAX_ID_VALIDATION, TRANSITION_LOADER, UNUSED};
    }

    public static EnumEntries<ScreenName> getEntries() {
        return $ENTRIES;
    }

    public static ScreenName valueOf(String str) {
        return (ScreenName) Enum.valueOf(ScreenName.class, str);
    }

    public static ScreenName[] values() {
        return (ScreenName[]) $VALUES.clone();
    }

    private ScreenName(String str, int i2) {
        super(str, i2);
    }

    static {
        ScreenName[] screenNameArr$values = $values();
        $VALUES = screenNameArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(screenNameArr$values);
    }
}
