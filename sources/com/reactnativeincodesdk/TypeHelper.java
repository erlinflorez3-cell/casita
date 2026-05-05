package com.reactnativeincodesdk;

import android.text.TextUtils;
import com.braze.models.FeatureFlag;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.incode.welcome_sdk.CameraFacing;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.OnboardingValidationModule;
import com.incode.welcome_sdk.commons.exceptions.FaceAuthenticationException;
import com.incode.welcome_sdk.data.remote.beans.FaceAuthenticationErrorCode;
import com.incode.welcome_sdk.data.remote.beans.FacialRecognitionResults;
import com.incode.welcome_sdk.data.remote.beans.IdVerificationResults;
import com.incode.welcome_sdk.data.remote.beans.LivenessCheckResults;
import com.incode.welcome_sdk.modules.FaceMatch;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.results.FaceLoginResult;
import com.incode.welcome_sdk.results.FaceMatchResult;
import com.incode.welcome_sdk.results.SelfieScanResult;
import com.incode.welcome_sdk.results.UserScoreResult;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import timber.log.Timber;

/* JADX INFO: loaded from: classes5.dex */
public class TypeHelper {

    /* JADX INFO: renamed from: com.reactnativeincodesdk.TypeHelper$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$incode$welcome_sdk$IdCategory;
        static final /* synthetic */ int[] $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode;
        static final /* synthetic */ int[] $SwitchMap$com$incode$welcome_sdk$ui$camera$id_validation$base$DocumentType;

        static {
            int[] iArr = new int[FaceAuthenticationErrorCode.values().length];
            $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode = iArr;
            try {
                iArr[FaceAuthenticationErrorCode.INACTIVE_SESSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[FaceAuthenticationErrorCode.NONEXISTENT_CUSTOMER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[FaceAuthenticationErrorCode.LENSES_DETECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[FaceAuthenticationErrorCode.FACE_MASK_DETECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[FaceAuthenticationErrorCode.HEAD_COVER_DETECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[FaceAuthenticationErrorCode.CLOSED_EYES_DETECTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[FaceAuthenticationErrorCode.FACE_TOO_DARK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[FaceAuthenticationErrorCode.SPOOF_ATTEMPT_DETECTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[FaceAuthenticationErrorCode.USER_IS_NOT_RECOGNIZED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[FaceAuthenticationErrorCode.SELFIE_IMAGE_LOW_QUALITY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[FaceAuthenticationErrorCode.HINT_NOT_PROVIDED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[FaceAuthenticationErrorCode.FACE_NOT_FOUND.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[FaceAuthenticationErrorCode.FACE_CROPPING_FAILED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[FaceAuthenticationErrorCode.FACE_TOO_SMALL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[FaceAuthenticationErrorCode.FACE_TOO_BLURRY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[FaceAuthenticationErrorCode.BAD_PHOTO_QUALITY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[FaceAuthenticationErrorCode.PROCESSING_ERROR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[FaceAuthenticationErrorCode.BAD_REQUEST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[FaceAuthenticationErrorCode.NETWORK_ERROR.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[FaceAuthenticationErrorCode.UNKNOWN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            int[] iArr2 = new int[DocumentType.values().length];
            $SwitchMap$com$incode$welcome_sdk$ui$camera$id_validation$base$DocumentType = iArr2;
            try {
                iArr2[DocumentType.MEDICAL_DOC.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$ui$camera$id_validation$base$DocumentType[DocumentType.PAYMENT_PROOF.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$ui$camera$id_validation$base$DocumentType[DocumentType.OTHER_DOCUMENT_1.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$ui$camera$id_validation$base$DocumentType[DocumentType.OTHER_DOCUMENT_2.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$ui$camera$id_validation$base$DocumentType[DocumentType.OTHER_DOCUMENT_3.ordinal()] = 5;
            } catch (NoSuchFieldError unused25) {
            }
            int[] iArr3 = new int[IdCategory.values().length];
            $SwitchMap$com$incode$welcome_sdk$IdCategory = iArr3;
            try {
                iArr3[IdCategory.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$com$incode$welcome_sdk$IdCategory[IdCategory.SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public static IdScan.AutocaptureUXMode getAutoCaptureUxMode(String str) {
        str.hashCode();
        if (!str.equals("holdStill") && str.equals("countdown")) {
            return new IdScan.AutocaptureUXMode.Countdown();
        }
        return new IdScan.AutocaptureUXMode.HoldStill();
    }

    public static CameraFacing getCameraFacing(ReadableMap readableMap, String str, CameraFacing cameraFacing) {
        String string;
        if (!readableMap.hasKey(str) || (string = readableMap.getString(str)) == null) {
            return cameraFacing;
        }
        string.hashCode();
        return !string.equals("back") ? !string.equals("front") ? cameraFacing : CameraFacing.FRONT : CameraFacing.BACK;
    }

    public static CameraFacing getCameraFacingFromString(String str) {
        str.hashCode();
        if (str.equals("back")) {
            return CameraFacing.BACK;
        }
        if (str.equals("front")) {
            return CameraFacing.FRONT;
        }
        return null;
    }

    static Map<String, String> getCustomFields(ReadableMap readableMap) {
        HashMap map = new HashMap();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            map.put(strNextKey, readableMap.getString(strNextKey));
        }
        return map;
    }

    public static DocumentType getDocumentType(String str) {
        str.hashCode();
        switch (str) {
            case "paymentProof":
                return DocumentType.PAYMENT_PROOF;
            case "otherDocument1":
                return DocumentType.OTHER_DOCUMENT_1;
            case "otherDocument2":
                return DocumentType.OTHER_DOCUMENT_2;
            case "otherDocument3":
                return DocumentType.OTHER_DOCUMENT_3;
            case "medicalDoc":
                return DocumentType.MEDICAL_DOC;
            default:
                return DocumentType.ADDRESS_STATEMENT;
        }
    }

    public static ReadableMap getFaceLoginResultMap(SelfieScanResult selfieScanResult) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("faceMatched", false);
        if (selfieScanResult.isSpoofAttempt != null) {
            writableMapCreateMap.putBoolean("spoofAttempt", selfieScanResult.isSpoofAttempt.booleanValue());
        }
        writableMapCreateMap.putMap(FeatureFlag.PROPERTIES_TYPE_IMAGE, mapImageResult(selfieScanResult.selfieBase64, selfieScanResult.selfieEncryptedBase64));
        FaceLoginResult faceLoginResult = selfieScanResult.faceLoginResult;
        if (faceLoginResult != null) {
            writableMapCreateMap.putBoolean("faceMatched", faceLoginResult.success);
            if (faceLoginResult.customerUUID != null) {
                writableMapCreateMap.putString("customerUUID", faceLoginResult.customerUUID);
            }
            if (faceLoginResult.interviewId != null) {
                writableMapCreateMap.putString("interviewId", faceLoginResult.interviewId);
            }
            if (faceLoginResult.interviewToken != null) {
                writableMapCreateMap.putString("interviewToken", faceLoginResult.interviewToken);
            }
            if (faceLoginResult.transactionId != null) {
                writableMapCreateMap.putString("transactionId", faceLoginResult.transactionId);
            }
            if (faceLoginResult.token != null) {
                writableMapCreateMap.putString("token", faceLoginResult.token);
            }
        }
        return writableMapCreateMap;
    }

    public static HashMap<String, Object> getFaceMatchResultMap(FaceMatchResult faceMatchResult) {
        HashMap<String, Object> map = new HashMap<>();
        if (!Double.isNaN(faceMatchResult.confidence)) {
            map.put("confidence", Double.valueOf(faceMatchResult.confidence));
        }
        if (!TextUtils.isEmpty(faceMatchResult.existingInterviewId)) {
            map.put("existingInterviewId", faceMatchResult.existingInterviewId);
        }
        String str = "primary";
        if (!faceMatchResult.idCategories.isEmpty() && !faceMatchResult.idCategories.get(0).equals(IdCategory.FIRST)) {
            str = "secondary";
        }
        map.put("idCategory", str);
        map.put("isExistingUser", Boolean.valueOf(faceMatchResult.isExistingUser));
        map.put("isFaceMatched", Boolean.valueOf(faceMatchResult.isFaceMatched));
        map.put("isNameMatched", Boolean.valueOf(faceMatchResult.isNameMatched));
        if (!Double.isNaN(faceMatchResult.nfcVsIdConfidence)) {
            map.put("nfcVsIdConfidence", Double.valueOf(faceMatchResult.nfcVsIdConfidence));
        }
        if (!Double.isNaN(faceMatchResult.nfcVsSelfieConfidence)) {
            map.put("nfcVsSelfieConfidence", Double.valueOf(faceMatchResult.nfcVsSelfieConfidence));
        }
        if (!Double.isNaN(faceMatchResult.secondIdConfidence)) {
            map.put("secondIdConfidence", Double.valueOf(faceMatchResult.secondIdConfidence));
        }
        return map;
    }

    public static FaceMatch.MatchType getFaceMatchType(String str) {
        str.hashCode();
        switch (str) {
            case "idSelfie":
                return FaceMatch.MatchType.ID_SELFIE;
            case "nfcSelfie":
                return FaceMatch.MatchType.NFC_SELFIE;
            case "nfc3Way":
                return FaceMatch.MatchType.NFC_3_WAY;
            default:
                return null;
        }
    }

    static IdCategory getIDCategory(ReadableMap readableMap) {
        String string;
        if (readableMap.hasKey("idCategory") && (string = readableMap.getString("idCategory")) != null) {
            string.hashCode();
            if (string.equals("secondary")) {
                return IdCategory.SECOND;
            }
            if (string.equals("primary")) {
                return IdCategory.FIRST;
            }
        }
        return null;
    }

    public static WritableMap getOnboardingSessionResult(String str, String str2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("interviewId", str);
        writableMapCreateMap.putString("token", str2);
        return writableMapCreateMap;
    }

    public static String getRNDocumentType(DocumentType documentType) {
        int i2 = AnonymousClass1.$SwitchMap$com$incode$welcome_sdk$ui$camera$id_validation$base$DocumentType[documentType.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "addressStatement" : "otherDocument3" : "otherDocument2" : "otherDocument1" : "paymentProof" : "medicalDoc";
    }

    public static String getRNIdCategory(IdCategory idCategory) {
        int i2 = AnonymousClass1.$SwitchMap$com$incode$welcome_sdk$IdCategory[idCategory.ordinal()];
        return (i2 == 1 || i2 != 2) ? "primary" : "secondary";
    }

    public static IdScan.ScanStep getScanStep(String str) {
        str.hashCode();
        switch (str) {
            case "back":
                return IdScan.ScanStep.BACK;
            case "both":
                return IdScan.ScanStep.BOTH;
            case "front":
                return IdScan.ScanStep.FRONT;
            default:
                return IdScan.ScanStep.BOTH;
        }
    }

    public static ReadableMap getUserScoreResultMap(UserScoreResult userScoreResult) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("extendedUserScoreJsonData", new JSONObject(userScoreResult.extendedUserScoreJsonData).toString());
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putString("overallScore", userScoreResult.overallScore);
        writableMapCreateMap2.putString("status", userScoreResult.overallStatus.name().toLowerCase());
        FacialRecognitionResults facialRecognitionResults = userScoreResult.facialRecognitionResults;
        if (facialRecognitionResults != null) {
            writableMapCreateMap2.putString("facialRecognitionScore", facialRecognitionResults.getOverallScore());
            writableMapCreateMap2.putBoolean("existingUser", facialRecognitionResults.isExistingUser());
        }
        IdVerificationResults idVerificationResults = userScoreResult.idVerificationResults;
        if (idVerificationResults != null) {
            writableMapCreateMap2.putString("idVerificationScore", idVerificationResults.getOverallScore());
        }
        LivenessCheckResults livenessCheckResults = userScoreResult.livenessCheckResults;
        if (livenessCheckResults != null) {
            writableMapCreateMap2.putString("livenessOverallScore", livenessCheckResults.getOverallScore());
        }
        writableMapCreateMap.putMap("data", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    public static OnboardingValidationModule getValidationModuleFromString(String str) {
        str.hashCode();
        switch (str) {
            case "governmentFaceValidation":
                return OnboardingValidationModule.governmentFaceValidation;
            case "faceRecognitionSecondId":
                return OnboardingValidationModule.faceRecognitionSecondId;
            case "id":
                return OnboardingValidationModule.id;
            case "governmentOcrValidation":
                return OnboardingValidationModule.governmentOcrValidation;
            case "faceMask":
                return OnboardingValidationModule.faceMask;
            case "faceRecognition":
                return OnboardingValidationModule.faceRecognition;
            case "secondId":
                return OnboardingValidationModule.secondId;
            case "videoSelfie":
                return OnboardingValidationModule.videoSelfie;
            case "liveness":
                return OnboardingValidationModule.liveness;
            case "governmentValidation":
                return OnboardingValidationModule.governmentValidation;
            default:
                return null;
        }
    }

    public static List<OnboardingValidationModule> getValidationModulesFromArray(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            arrayList.add(getValidationModuleFromString(readableArray.getString(i2)));
        }
        return arrayList;
    }

    public static ReadableMap mapImageResult(String str, String str2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("pngBase64", str);
        if (str2 != null) {
            writableMapCreateMap.putString("encryptedBase64", str2);
        }
        return writableMapCreateMap;
    }

    public static String parseChar(Character ch) {
        if (ch == null) {
            return null;
        }
        return String.valueOf(ch);
    }

    public static String parseDate(String str) {
        Timber.d("INCD", "parseDate date string: %s", str);
        try {
            Date date = new SimpleDateFormat("yyMMdd", Locale.US).parse(str);
            if (date != null) {
                return String.valueOf(date.getTime());
            }
            return null;
        } catch (Exception e2) {
            Timber.d(e2, "Invalid date string: %s", str);
            return null;
        }
    }

    public static String parseFaceAuthError(Throwable th) {
        FaceAuthenticationErrorCode code;
        if (th == null || !(th instanceof FaceAuthenticationException) || (code = ((FaceAuthenticationException) th).getCode()) == null) {
            return "unknown";
        }
        switch (AnonymousClass1.$SwitchMap$com$incode$welcome_sdk$data$remote$beans$FaceAuthenticationErrorCode[code.ordinal()]) {
        }
        return "unknown";
    }

    public static String parseGender(String str) {
        str.hashCode();
        return !str.equals("MALE") ? !str.equals("FEMALE") ? str : "F" : "M";
    }
}
