package com.ticnow.sdk.idnowsecurity.http.codes;

import com.drew.metadata.exif.makernotes.OlympusCameraSettingsMakernoteDirectory;
import com.google.common.base.Ascii;
import com.ticnow.sdk.idnowonboarding.steps.response.IDStepResponseCodes;

/* JADX INFO: loaded from: classes5.dex */
public class IDEnrollmentResponseParser {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static IDEnrollmentResponseCodes processResponseCode(String str) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    b2 = 0;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    b2 = 1;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    b2 = 2;
                }
                break;
            case OlympusCameraSettingsMakernoteDirectory.TagImageQuality2 /* 1539 */:
                if (str.equals("03")) {
                    b2 = 3;
                }
                break;
            case OlympusCameraSettingsMakernoteDirectory.TagImageStabilization /* 1540 */:
                if (str.equals("04")) {
                    b2 = 4;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    b2 = 5;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    b2 = 6;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    b2 = 7;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    b2 = 8;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    b2 = 9;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    b2 = 10;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    b2 = Ascii.VT;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    b2 = Ascii.FF;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    b2 = Ascii.CR;
                }
                break;
            case 1574:
                if (str.equals("17")) {
                    b2 = Ascii.SO;
                }
                break;
            case 1575:
                if (str.equals("18")) {
                    b2 = Ascii.SI;
                }
                break;
            case 1576:
                if (str.equals("19")) {
                    b2 = 16;
                }
                break;
            case 1601:
                if (str.equals("23")) {
                    b2 = 17;
                }
                break;
            case 1604:
                if (str.equals("26")) {
                    b2 = Ascii.DC2;
                }
                break;
            case 1607:
                if (str.equals("29")) {
                    b2 = 19;
                }
                break;
            case 1632:
                if (str.equals("33")) {
                    b2 = Ascii.DC4;
                }
                break;
            case 1633:
                if (str.equals("34")) {
                    b2 = Ascii.NAK;
                }
                break;
            case 1634:
                if (str.equals("35")) {
                    b2 = Ascii.SYN;
                }
                break;
            case 1636:
                if (str.equals("37")) {
                    b2 = Ascii.ETB;
                }
                break;
            case 1663:
                if (str.equals("43")) {
                    b2 = Ascii.CAN;
                }
                break;
            case 1665:
                if (str.equals("45")) {
                    b2 = Ascii.EM;
                }
                break;
            case 1666:
                if (str.equals("46")) {
                    b2 = Ascii.SUB;
                }
                break;
            case 1667:
                if (str.equals("47")) {
                    b2 = Ascii.ESC;
                }
                break;
            case 1669:
                if (str.equals("49")) {
                    b2 = Ascii.FS;
                }
                break;
            case 1694:
                if (str.equals("53")) {
                    b2 = Ascii.GS;
                }
                break;
            case 1695:
                if (str.equals("54")) {
                    b2 = Ascii.RS;
                }
                break;
            case 1696:
                if (str.equals("55")) {
                    b2 = Ascii.US;
                }
                break;
            case 1697:
                if (str.equals("56")) {
                    b2 = 32;
                }
                break;
            case 1698:
                if (str.equals("57")) {
                    b2 = 33;
                }
                break;
            case IDStepResponseCodes.STEP_REQUEST /* 1700 */:
                if (str.equals("59")) {
                    b2 = 34;
                }
                break;
        }
        switch (b2) {
            case 0:
                return IDEnrollmentResponseCodes.COD_OK;
            case 1:
                return IDEnrollmentResponseCodes.COD_DEVICE_NOT_FOUND;
            case 2:
                return IDEnrollmentResponseCodes.COD_DEVICE_STATUS_NOK;
            case 3:
                return IDEnrollmentResponseCodes.COD_ENROLL_DEF_NOT_FOUND;
            case 4:
                return IDEnrollmentResponseCodes.COD_IMAGE_NOT_VALID;
            case 5:
                return IDEnrollmentResponseCodes.COD_PATH_NOT_VALID;
            case 6:
                return IDEnrollmentResponseCodes.COD_DNIFRONT_NOT_VALID;
            case 7:
                return IDEnrollmentResponseCodes.COD_ENROLL_STEP_ALLREADY_EXISTS;
            case 8:
                return IDEnrollmentResponseCodes.COD_DNIBACK_NOT_VALID;
            case 9:
                return IDEnrollmentResponseCodes.COD_USER_BLOCKED;
            case 10:
                return IDEnrollmentResponseCodes.COD_FACE_IMAGE_NOT_VALID;
            case 11:
                return IDEnrollmentResponseCodes.COD_SMS_CODES_EXPIRES;
            case 12:
                return IDEnrollmentResponseCodes.COD_SMS_CODES_NOT_VALID;
            case 13:
                return IDEnrollmentResponseCodes.COD_DNI_INFO_NOT_FOUND;
            case 14:
                return IDEnrollmentResponseCodes.COD_ENROLLMENT_PATH_INCOMPLETE;
            case 15:
                return IDEnrollmentResponseCodes.COD_ENROLLMENT_SCORING_NOT_VALID;
            case 16:
                return IDEnrollmentResponseCodes.COD_REQUIRED_ENROLL_STEP;
            case 17:
                return IDEnrollmentResponseCodes.COD_USER_NOT_FOUND;
            case 18:
                return IDEnrollmentResponseCodes.COD_INVALID_PARAMETERS;
            case 19:
                return IDEnrollmentResponseCodes.COD_INSTITUTION_NOT_FOUND;
            case 20:
                return IDEnrollmentResponseCodes.COD_DEFINITION_WORKFLOW_NOT_VALID;
            case 21:
                return IDEnrollmentResponseCodes.COD_USER_ALREADY_EXISTS;
            case 22:
                return IDEnrollmentResponseCodes.COD_INVALID_STATUS_CODE;
            case 23:
                return IDEnrollmentResponseCodes.COD_INSTITUTION_CONFIG_NOT_VALID;
            case 24:
                return IDEnrollmentResponseCodes.COD_NOT_VALID_OS;
            case 25:
                return IDEnrollmentResponseCodes.COD_APP_ALREADY_REGISTERED;
            case 26:
                return IDEnrollmentResponseCodes.COD_ENROLL_STEP_OMMITED;
            case 27:
                return IDEnrollmentResponseCodes.COD_ENROLL_WORKFLOW_CANCELLED;
            case 28:
                return IDEnrollmentResponseCodes.COD_CHANNEL_NOT_FOUND;
            case 29:
                return IDEnrollmentResponseCodes.COD_ENROLL_WORKFLOW_MANUAL_REVIEW;
            case 30:
                return IDEnrollmentResponseCodes.COD_USER_IS_IN_MANUAL_REVIEW;
            case 31:
                return IDEnrollmentResponseCodes.COD_ERROR_MAX_REINTENT;
            case 32:
                return IDEnrollmentResponseCodes.COD_ADITIONAL_REINTENT;
            case 33:
                return IDEnrollmentResponseCodes.COD_STEP_NOT_VALID;
            case 34:
                return IDEnrollmentResponseCodes.COD_INVALID_ENROLL_RESTRICTIONS;
            default:
                return IDEnrollmentResponseCodes.GENERAL_ERROR;
        }
    }
}
