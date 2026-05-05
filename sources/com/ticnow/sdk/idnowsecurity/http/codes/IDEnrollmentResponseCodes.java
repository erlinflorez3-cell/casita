package com.ticnow.sdk.idnowsecurity.http.codes;

/* JADX INFO: loaded from: classes5.dex */
public enum IDEnrollmentResponseCodes {
    COD_OK("00", "OK"),
    COD_DEVICE_NOT_FOUND("01", "Device Not Found"),
    COD_DEVICE_STATUS_NOK("02", "Device Status Not Valid"),
    COD_ENROLL_DEF_NOT_FOUND("03", "Enroll Definition Not Found"),
    COD_IMAGE_NOT_VALID("04", "Image Not Valid"),
    COD_PATH_NOT_VALID("05", "Path Enrollment Not Valid"),
    COD_DNIFRONT_NOT_VALID("06", "DNI Image Front Not Valid"),
    COD_ENROLL_STEP_ALLREADY_EXISTS("07", "Enroll Step Already Exists"),
    COD_DNIBACK_NOT_VALID("08", "DNI Image Back Not Valid"),
    COD_USER_BLOCKED("09", "User Blocked"),
    COD_FACE_IMAGE_NOT_VALID("10", "Face image not valid"),
    COD_SMS_CODES_EXPIRES("11", "SMS Code expired"),
    COD_SMS_CODES_NOT_VALID("12", "SMS Code not valid"),
    COD_DNI_INFO_NOT_FOUND("13", "Dni Info not found"),
    COD_ENROLLMENT_PATH_INCOMPLETE("17", "Enrollment Path is Incompleted"),
    COD_ENROLLMENT_SCORING_NOT_VALID("18", "Enrollment Scoring not valid"),
    COD_REQUIRED_ENROLL_STEP("19", "Step is required by institution"),
    COD_USER_NOT_FOUND("23", "User not found"),
    COD_INVALID_PARAMETERS("26", "Invalid Parameters"),
    COD_INSTITUTION_NOT_FOUND("29", "Institution Not Found"),
    COD_DEFINITION_WORKFLOW_NOT_VALID("33", "Definition Workflow Not Valid"),
    COD_USER_ALREADY_EXISTS("34", "User already exists"),
    COD_INVALID_STATUS_CODE("35", "Status not Found"),
    COD_INSTITUTION_CONFIG_NOT_VALID("37", "Institution Atribute Config not Found"),
    COD_NOT_VALID_OS("43", "Operating System not Valid"),
    COD_APP_ALREADY_REGISTERED("45", "App Already Registerd for User"),
    COD_ENROLL_STEP_OMMITED("46", "Step has been Ommitted"),
    COD_ENROLL_WORKFLOW_CANCELLED("47", "Enrollment Workflow is Cancelled"),
    COD_CHANNEL_NOT_FOUND("49", "Channel not Found"),
    COD_ENROLL_WORKFLOW_MANUAL_REVIEW("53", "Additional Review is Required"),
    COD_USER_IS_IN_MANUAL_REVIEW("54", "User Status is Manual Review"),
    COD_ERROR_MAX_REINTENT("55", "Max Number of Attemps has been Reached"),
    COD_ADITIONAL_REINTENT("56", "Authentication Fail, Need Additional Reintent"),
    COD_STEP_NOT_VALID("57", "Step Result not Valid"),
    COD_INVALID_ENROLL_RESTRICTIONS("59", "Invalid enroll restrictions"),
    GENERAL_ERROR("500", "General Error");

    private final String code;
    private final String description;

    IDEnrollmentResponseCodes(String str, String str2) {
        this.code = str;
        this.description = str2;
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }
}
