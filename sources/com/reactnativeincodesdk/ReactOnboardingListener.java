package com.reactnativeincodesdk;

import android.text.TextUtils;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.braze.models.FeatureFlag;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.exceptions.DeviceEnvironmentException;
import com.incode.welcome_sdk.commons.exceptions.FaceAuthenticationException;
import com.incode.welcome_sdk.commons.exceptions.PermissionDeniedException;
import com.incode.welcome_sdk.commons.exceptions.video_selfie.CameraPermissionDeniedException;
import com.incode.welcome_sdk.data.Event;
import com.incode.welcome_sdk.data.remote.beans.ResponseMedicalDoc;
import com.incode.welcome_sdk.results.AESResult;
import com.incode.welcome_sdk.results.AntifraudResult;
import com.incode.welcome_sdk.results.ApproveResult;
import com.incode.welcome_sdk.results.CaptchaResult;
import com.incode.welcome_sdk.results.CurpValidationResult;
import com.incode.welcome_sdk.results.CustomWatchlistResult;
import com.incode.welcome_sdk.results.DocumentValidationResult;
import com.incode.welcome_sdk.results.EKYBResult;
import com.incode.welcome_sdk.results.EKYCResult;
import com.incode.welcome_sdk.results.EmailAddressResult;
import com.incode.welcome_sdk.results.FaceAuthenticationResult;
import com.incode.welcome_sdk.results.FaceMatchResult;
import com.incode.welcome_sdk.results.GeolocationResult;
import com.incode.welcome_sdk.results.GlobalWatchlistResult;
import com.incode.welcome_sdk.results.IdInfoResult;
import com.incode.welcome_sdk.results.IdProcessResult;
import com.incode.welcome_sdk.results.IdScanResult;
import com.incode.welcome_sdk.results.MachineLearningConsentResult;
import com.incode.welcome_sdk.results.NameResult;
import com.incode.welcome_sdk.results.NfcScanResult;
import com.incode.welcome_sdk.results.PhoneNumberResult;
import com.incode.welcome_sdk.results.QRScanResult;
import com.incode.welcome_sdk.results.ResultCode;
import com.incode.welcome_sdk.results.SelfieScanResult;
import com.incode.welcome_sdk.results.SignatureFormResult;
import com.incode.welcome_sdk.results.UserScoreResult;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import io.sentry.SentryLockReason;
import io.sentry.protocol.Geo;
import io.sentry.protocol.Response;
import io.sentry.protocol.SentryThread;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import yg.C1561oA;
import yg.C1607wl;
import yg.FB;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;

/* JADX INFO: loaded from: classes5.dex */
class ReactOnboardingListener extends IncodeWelcome.OnboardingListener {
    private static final double FACE_MATCH_THRESHOLD = 0.0d;
    private static final double SPOOF_THRESHOLD = 0.0d;
    private IdScanResult backIdScanResult;
    private IdScanResult frontIdScanResult;
    private final Promise promise;
    private final ReactApplicationContext reactApplicationContext;

    /* JADX INFO: renamed from: com.reactnativeincodesdk.ReactOnboardingListener$1 */
    class AnonymousClass1 extends HashMap<String, Object> {
        final /* synthetic */ Map val$extendedOcrJsonData;

        AnonymousClass1(Map map) {
            this.val$extendedOcrJsonData = map;
            put("ocrData", map);
        }
    }

    static class IdValidationResultMapping {
        static HashMap<Integer, String> validationResultMap = new HashMap<Integer, String>() { // from class: com.reactnativeincodesdk.ReactOnboardingListener.IdValidationResultMapping.1
            AnonymousClass1() {
                put(-2, "unknown");
                put(-1, "unknown");
                put(0, "ok");
                put(1, "errorClassification");
                put(2, "unknown");
                put(3, "errorGlare");
                put(4, "errorSharpness");
                put(5, "unknown");
                put(6, "errorClassification");
                put(7, "unknown");
                put(8, "errorReadability");
                put(9, "unknown");
            }
        };

        /* JADX INFO: renamed from: com.reactnativeincodesdk.ReactOnboardingListener$IdValidationResultMapping$1 */
        class AnonymousClass1 extends HashMap<Integer, String> {
            AnonymousClass1() {
                put(-2, "unknown");
                put(-1, "unknown");
                put(0, "ok");
                put(1, "errorClassification");
                put(2, "unknown");
                put(3, "errorGlare");
                put(4, "errorSharpness");
                put(5, "unknown");
                put(6, "errorClassification");
                put(7, "unknown");
                put(8, "errorReadability");
                put(9, "unknown");
            }
        }

        IdValidationResultMapping() {
        }

        public static String fromCode(int i2) {
            String str = validationResultMap.get(Integer.valueOf(i2));
            return str == null ? "unknown" : str;
        }
    }

    interface StepResultsMapping {
        void run(WritableMap writableMap);
    }

    public ReactOnboardingListener(Promise promise, ReactApplicationContext reactApplicationContext) {
        this.promise = promise;
        this.reactApplicationContext = reactApplicationContext;
    }

    private void addAllAddressFields(WritableMap writableMap, IncodeWelcome.AddressFields addressFields) {
        if (addressFields != null) {
            writableMap.putString(Geo.JsonKeys.CITY, addressFields.getCity());
            writableMap.putString("colony", addressFields.getColony());
            writableMap.putString(HintConstants.AUTOFILL_HINT_POSTAL_CODE, addressFields.getPostalCode());
            writableMap.putString(SentryThread.JsonKeys.STATE, addressFields.getState());
            writableMap.putString("street", addressFields.getStreet());
        }
    }

    private static void addMapToResults(WritableMap writableMap, String str, StepResultsMapping stepResultsMapping) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        stepResultsMapping.run(writableMapCreateMap);
        writableMap.putMap(str, writableMapCreateMap);
    }

    private static WritableMap addResultsToEventData(String str, StepResultsMapping stepResultsMapping) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("module", str);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        stepResultsMapping.run(writableMapCreateMap2);
        writableMapCreateMap.putMap("result", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    private void emit(WritableMap writableMap, String str) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    private void emitOnboardingStepCompleted(WritableMap writableMap) {
        emit(writableMap, "ONBOARDING_STEP_COMPLETED");
    }

    private void emitOnboardingStepError(WritableMap writableMap) {
        emit(writableMap, "ONBOARDING_STEP_ERROR");
    }

    static /* synthetic */ void lambda$onAESCompleted$6(AESResult aESResult, WritableMap writableMap) {
        writableMap.putString("status", aESResult.resultCode == ResultCode.SUCCESS ? FirebaseAnalytics.Param.SUCCESS : "fail");
        if (aESResult.resultCode != ResultCode.SUCCESS) {
            if (!aESResult.documentSigning) {
                writableMap.putString("error", "failedToSign");
            } else {
                if (aESResult.resourcesNotFound) {
                    return;
                }
                writableMap.putString("error", "noDocuments");
            }
        }
    }

    static /* synthetic */ void lambda$onAddEmailCompleted$7(EmailAddressResult emailAddressResult, WritableMap writableMap) {
        writableMap.putString("email", emailAddressResult.email);
        writableMap.putString("status", emailAddressResult.resultCode == ResultCode.SUCCESS ? FirebaseAnalytics.Param.SUCCESS : "fail");
    }

    static /* synthetic */ void lambda$onAddNameCompleted$26(NameResult nameResult, WritableMap writableMap) {
        writableMap.putString("status", nameResult.resultCode == ResultCode.SUCCESS ? FirebaseAnalytics.Param.SUCCESS : nameResult.error != null ? nameResult.error.getMessage() : "fail");
        if (nameResult.name != null) {
            writableMap.putString("name", nameResult.name);
        }
    }

    static /* synthetic */ void lambda$onAddPhoneCompleted$0(PhoneNumberResult phoneNumberResult, WritableMap writableMap) {
        writableMap.putString(HintConstants.AUTOFILL_HINT_PHONE, phoneNumberResult.phone);
        writableMap.putString("resultCode", phoneNumberResult.resultCode.name());
    }

    static /* synthetic */ void lambda$onApproveCompleted$1(boolean z2, ApproveResult approveResult, WritableMap writableMap) {
        writableMap.putString("status", z2 ? "approved" : "failed");
        writableMap.putString("id", approveResult.uuid);
        writableMap.putString("customerToken", approveResult.token);
    }

    static /* synthetic */ void lambda$onCaptchaCollected$8(CaptchaResult captchaResult, WritableMap writableMap) {
        writableMap.putString(Response.TYPE, captchaResult.captchaResponse);
        writableMap.putString("status", captchaResult.resultCode.name().toLowerCase());
    }

    static /* synthetic */ void lambda$onCurpValidationCompleted$27(CurpValidationResult curpValidationResult, WritableMap writableMap) {
        writableMap.putString("status", curpValidationResult.resultCode == ResultCode.SUCCESS ? FirebaseAnalytics.Param.SUCCESS : curpValidationResult.error != null ? curpValidationResult.error.getMessage() : "fail");
        if (curpValidationResult.curp != null) {
            writableMap.putString("curp", curpValidationResult.curp);
        } else {
            writableMap.putString("curp", "");
        }
    }

    static /* synthetic */ void lambda$onDocumentValidationCompleted$14(DocumentValidationResult documentValidationResult, WritableMap writableMap) {
        ResponseMedicalDoc medicalDocData = documentValidationResult.getMedicalDocData();
        if (medicalDocData != null) {
            writableMap.putString("data", medicalDocData.getRawData());
        }
    }

    public /* synthetic */ void lambda$onDocumentValidationCompleted$15(DocumentType documentType, final DocumentValidationResult documentValidationResult, WritableMap writableMap) {
        writableMap.putString("type", TypeHelper.getRNDocumentType(documentType));
        writableMap.putMap(FeatureFlag.PROPERTIES_TYPE_IMAGE, mapImageFromPath(documentValidationResult.documentPath));
        IncodeWelcome.AddressFields addressFields = documentValidationResult.addressFields;
        if (addressFields != null) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            addAllAddressFields(writableMapCreateMap, addressFields);
            writableMap.putMap(SentryLockReason.JsonKeys.ADDRESS, writableMapCreateMap);
        }
        if (documentType == DocumentType.MEDICAL_DOC) {
            addMapToResults(writableMap, "insuranceCard", new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda31
                @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
                public final void run(WritableMap writableMap2) {
                    ReactOnboardingListener.lambda$onDocumentValidationCompleted$14(documentValidationResult, writableMap2);
                }
            });
        }
    }

    static /* synthetic */ void lambda$onFaceAuthenticationCompleted$33(FaceAuthenticationResult faceAuthenticationResult, WritableMap writableMap) {
        writableMap.putString("status", faceAuthenticationResult.isSuccess ? FirebaseAnalytics.Param.SUCCESS : "fail");
        writableMap.putString("customerUUID", faceAuthenticationResult.customerUUID);
        writableMap.putString("selfieBase64", faceAuthenticationResult.selfieBase64);
        writableMap.putString("selfieEncryptedBase64", faceAuthenticationResult.encryptedSelfieBase64);
        if (faceAuthenticationResult.error != null) {
            writableMap.putString("error", TypeHelper.parseFaceAuthError(faceAuthenticationResult.error));
        } else {
            writableMap.putNull("error");
        }
    }

    static /* synthetic */ void lambda$onFaceMatchCompleted$18(FaceMatchResult faceMatchResult, WritableMap writableMap) {
        writableMap.putString("status", (faceMatchResult.isFaceMatched && faceMatchResult.isFaceMatched) ? "match" : "mismatch");
        writableMap.putDouble("confidence", !Double.isNaN(faceMatchResult.confidence) ? faceMatchResult.confidence : 0.0d);
        writableMap.putString("existingInterviewId", faceMatchResult.existingInterviewId);
        writableMap.putBoolean("existingUser", faceMatchResult.isExistingUser);
        IdCategory idCategory = faceMatchResult.idCategories.get(0);
        if (idCategory != null) {
            writableMap.putString("idCategory", TypeHelper.getRNIdCategory(idCategory));
        }
    }

    public /* synthetic */ void lambda$onGeolocationFetched$16(GeolocationResult geolocationResult, WritableMap writableMap) {
        addAllAddressFields(writableMap, geolocationResult.addressFields);
    }

    static /* synthetic */ void lambda$onIdBackCompleted$10(IdScanResult idScanResult, WritableMap writableMap) {
        Integer numValueOf = Integer.valueOf(idScanResult.scanStatus);
        writableMap.putString("status", numValueOf != null ? IdValidationResultMapping.fromCode(numValueOf.intValue()) : IdValidationResultMapping.fromCode(-1));
        writableMap.putMap(FeatureFlag.PROPERTIES_TYPE_IMAGE, TypeHelper.mapImageResult(idScanResult.idImageBase64, null));
        writableMap.putString("classifiedIdType", idScanResult.classifiedIdType);
        IdCategory idCategory = idScanResult.idCategory;
        if (idCategory != null) {
            writableMap.putString("idCategory", TypeHelper.getRNIdCategory(idCategory));
        }
        if (idScanResult.chosenIdType != null) {
            writableMap.putString("chosenIdType", idScanResult.chosenIdType.name().toLowerCase());
        }
    }

    static /* synthetic */ void lambda$onIdFrontCompleted$9(IdScanResult idScanResult, WritableMap writableMap) {
        Integer numValueOf = Integer.valueOf(idScanResult.scanStatus);
        writableMap.putString("status", numValueOf != null ? IdValidationResultMapping.fromCode(numValueOf.intValue()) : IdValidationResultMapping.fromCode(-1));
        writableMap.putMap(FeatureFlag.PROPERTIES_TYPE_IMAGE, TypeHelper.mapImageResult(idScanResult.idImageBase64, null));
        writableMap.putMap("croppedFace", mapImageFromPath(idScanResult.croppedFacePath));
        if (idScanResult.classifiedIdType != null) {
            writableMap.putString("classifiedIdType", idScanResult.classifiedIdType);
        }
        if (idScanResult.idCategory != null) {
            writableMap.putString("idCategory", TypeHelper.getRNIdCategory(idScanResult.idCategory));
        }
        if (idScanResult.chosenIdType != null) {
            writableMap.putString("chosenIdType", idScanResult.chosenIdType.name().toLowerCase());
        }
        if (idScanResult.failReason != null) {
            writableMap.putString("failReason", idScanResult.failReason);
        }
        if (idScanResult.issueName != null) {
            writableMap.putString("issueName", idScanResult.issueName);
        }
        if (idScanResult.issueYear != null) {
            writableMap.putInt("issueYear", idScanResult.issueYear.intValue());
        }
        if (idScanResult.countryCode != null) {
            writableMap.putString("countryCode", idScanResult.countryCode);
        }
    }

    public /* synthetic */ void lambda$onIdProcessed$11(IdProcessResult idProcessResult, WritableMap writableMap) {
        if (idProcessResult.getOcrData() != null) {
            Map<String, Object> extendedOcrJsonData = idProcessResult.getOcrData().getExtendedOcrJsonData();
            if (extendedOcrJsonData.get("extendedData") == null) {
                writableMap.putString("extendedOcrData", new JSONObject(new HashMap<String, Object>(extendedOcrJsonData) { // from class: com.reactnativeincodesdk.ReactOnboardingListener.1
                    final /* synthetic */ Map val$extendedOcrJsonData;

                    AnonymousClass1(Map extendedOcrJsonData2) {
                        this.val$extendedOcrJsonData = extendedOcrJsonData2;
                        put("ocrData", extendedOcrJsonData2);
                    }
                }).toString());
                return;
            }
            try {
                writableMap.putString("extendedOcrData", new JSONObject("{\"ocrData\":{\"curp\":\"MXMO860324HDFRDM05\",\"cic\":\"153654132\",\"registrationDate\":2004,\"numeroEmisionCredencial\":\"01\",\"birthDate\":512006400000,\"issueDate\":2012,\"claveDeElector\":\"MRMDOM86032409H800\",\"addressFields\":{\"colony\":\"COL JORGE NEGRETE\",\"street\":\"C MARIO MORENO MZ 201E LT 4\",\"city\":\"GUSTAVO A. MADERO\",\"state\":\"D.F.\",\"postalCode\":\"07280\"},\"fullNameMrz\":\"Omar Martinez Madrid\",\"expirationDate\":2022,\"address\":\"C MARIO MORENO MZ 201E LT 4 COL JORGE NEGRETE 07280 GUSTAVO A. MADERO ,D.F.\",\"ocr\":\"3145897456321\",\"gender\":\"M\",\"name\":{\"firstName\":\"Omar\",\"paternalLastName\":\"Martinez\",\"fullName\":\"Omar Martinez Madrid\",\"maternalLastName\":\"Madrid\"}}}").toString());
            } catch (JSONException e2) {
                String str = "Couldn't parse extendedOCR: " + e2.getMessage();
            }
        }
    }

    public /* synthetic */ void lambda$onIdProcessed$12(IdProcessResult idProcessResult, WritableMap writableMap) {
        if (idProcessResult == null || idProcessResult.getOcrData() == null) {
            return;
        }
        putOcrResult(writableMap, idProcessResult.getOcrData());
    }

    public /* synthetic */ void lambda$onIdProcessed$13(final IdProcessResult idProcessResult, StepResultsMapping stepResultsMapping, WritableMap writableMap) {
        addMapToResults(writableMap, "data", new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda25
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap2) {
                this.f$0.lambda$onIdProcessed$12(idProcessResult, writableMap2);
            }
        });
        stepResultsMapping.run(writableMap);
    }

    static /* synthetic */ void lambda$onNfcScanCompleted$32(NfcScanResult nfcScanResult, WritableMap writableMap) {
        writableMap.putString("status", nfcScanResult.resultCode == ResultCode.SUCCESS ? FirebaseAnalytics.Param.SUCCESS : "fail");
        writableMap.putString("birthDate", TypeHelper.parseDate(nfcScanResult.getDateOfBirth()));
        writableMap.putString("compositeCheckDigit", TypeHelper.parseChar(Character.valueOf(nfcScanResult.getCompositeCheckDigit())));
        writableMap.putString("dateOfBirthCheckDigit", TypeHelper.parseChar(Character.valueOf(nfcScanResult.getDateOfBirthCheckDigit())));
        writableMap.putString("documentCode", nfcScanResult.getDocumentCode());
        writableMap.putString("documentNumber", nfcScanResult.getDocumentNumber());
        writableMap.putString("documentNumberCheckDigit", TypeHelper.parseChar(Character.valueOf(nfcScanResult.getDocumentNumberCheckDigit())));
        writableMap.putString("expirationDateCheckDigit", TypeHelper.parseChar(Character.valueOf(nfcScanResult.getDateOfExpiryCheckDigit())));
        writableMap.putString("expireAt", TypeHelper.parseDate(nfcScanResult.getDateOfExpiry()));
        writableMap.putString(HintConstants.AUTOFILL_HINT_GENDER, TypeHelper.parseGender(nfcScanResult.getGender()));
        writableMap.putString("issuingStateOrOrganization", nfcScanResult.getIssuingStateOrOrganization());
        writableMap.putString("nationality", nfcScanResult.getNationality());
        writableMap.putString("optionalData1", nfcScanResult.getOptionalData1());
        writableMap.putString("optionalData2", nfcScanResult.getOptionalData2());
        writableMap.putString("personalNumber", nfcScanResult.getPersonalNumber());
        writableMap.putString("personalNumberCheckDigit", TypeHelper.parseChar(nfcScanResult.getPersonalNumberCheckDigit()));
        writableMap.putString("primaryIdentifier", nfcScanResult.getPrimaryIdentifier());
        writableMap.putString("secondaryIdentifier", nfcScanResult.getSecondaryIdentifier());
    }

    static /* synthetic */ void lambda$onSelfieScanCompleted$17(SelfieScanResult selfieScanResult, WritableMap writableMap) {
        boolean z2 = selfieScanResult.isSpoofAttempt != null && selfieScanResult.isSpoofAttempt.booleanValue();
        if (selfieScanResult.isSpoofAttempt != null) {
            writableMap.putBoolean("spoofAttempt", selfieScanResult.isSpoofAttempt.booleanValue());
        }
        if (selfieScanResult.isSpoofAttempt == null) {
            writableMap.putString("status", "unknown");
        } else {
            writableMap.putString("status", z2 ? "spoof" : FirebaseAnalytics.Param.SUCCESS);
        }
        writableMap.putMap(FeatureFlag.PROPERTIES_TYPE_IMAGE, TypeHelper.mapImageResult(selfieScanResult.selfieBase64, selfieScanResult.selfieEncryptedBase64));
    }

    static /* synthetic */ void lambda$onSignatureCollected$19(SignatureFormResult signatureFormResult, WritableMap writableMap) {
        writableMap.putString("status", FirebaseAnalytics.Param.SUCCESS);
        ReadableMap readableMapMapImageFromPath = mapImageFromPath(signatureFormResult.signaturePath);
        if (readableMapMapImageFromPath == null || !readableMapMapImageFromPath.hasKey("pngBase64")) {
            return;
        }
        writableMap.putString(FeatureFlag.PROPERTIES_TYPE_IMAGE, readableMapMapImageFromPath.getString("pngBase64"));
    }

    public /* synthetic */ void lambda$putOcrResult$34(IncodeWelcome.OCRData oCRData, WritableMap writableMap) {
        addAllAddressFields(writableMap, oCRData.getAddressFields());
    }

    private static ReadableMap mapImageFromPath(String str) {
        short sXd = (short) (Od.Xd() ^ (-9533));
        short sXd2 = (short) (Od.Xd() ^ (-25133));
        int[] iArr = new int["7<187FsE7:CBHB{BPQOS\u001c\u0003".length()];
        QB qb = new QB("7<187FsE7:CBHB{BPQOS\u001c\u0003");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        new String(iArr, 0, i2);
        C1561oA.od("NRFF", (short) (OY.Xd() ^ 26549));
        if (TextUtils.isEmpty(str)) {
            return Arguments.createMap();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int i3 = fileInputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            String strKd = C1561oA.Kd("wvpLl\u007frDC", (short) (C1607wl.Xd() ^ 19678));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            short sXd3 = (short) (FB.Xd() ^ 6333);
            short sXd4 = (short) (FB.Xd() ^ 20290);
            int[] iArr2 = new int["b>\tg5\u007fOi\u0002O\u0019l~cW:\\}N".length()];
            QB qb2 = new QB("b>\tg5\u007fOi\u0002O\u0019l~cW:\\}N");
            int i4 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i4] = xuXd2.fK(((i4 * sXd4) ^ sXd3) + xuXd2.CK(iKK2));
                i4++;
            }
            Object[] objArr = {byteArray, 0};
            Method declaredMethod = Class.forName(new String(iArr2, 0, i4)).getDeclaredMethod(C1561oA.Xd("\",\"/%'\u00173\u0018:9171", (short) (C1607wl.Xd() ^ 4461)), byte[].class, Integer.TYPE);
            try {
                declaredMethod.setAccessible(true);
                writableMapCreateMap.putString(strKd, (String) declaredMethod.invoke(null, objArr));
                return writableMapCreateMap;
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (FileNotFoundException | IOException e3) {
            return Arguments.createMap();
        }
    }

    private void putOcrResult(WritableMap writableMap, final IncodeWelcome.OCRData oCRData) {
        writableMap.putString("fullAddress", oCRData.getAddress());
        addMapToResults(writableMap, SentryLockReason.JsonKeys.ADDRESS, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda30
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap2) {
                this.f$0.lambda$putOcrResult$34(oCRData, writableMap2);
            }
        });
        writableMap.putString("birthDate", oCRData.getBirthDate());
        writableMap.putInt("expirationDate", oCRData.getExpirationDate());
        writableMap.putString(HintConstants.AUTOFILL_HINT_GENDER, oCRData.getGender());
        writableMap.putString("name", oCRData.getFullName());
        writableMap.putInt("issueDate", oCRData.getIssueDate());
        writableMap.putString("numeroEmisionCredencial", oCRData.getNumeroEmisionCredencial());
    }

    private void resolveWithStatus(String str) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("status", str);
        this.promise.resolve(writableMapCreateMap);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.AESListener
    public void onAESCompleted(final AESResult aESResult) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.AES, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda20
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                ReactOnboardingListener.lambda$onAESCompleted$6(aESResult, writableMap);
            }
        }));
        super.onAESCompleted(aESResult);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.EmailAddressListener
    public void onAddEmailCompleted(final EmailAddressResult emailAddressResult) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.EMAIL, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda4
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                ReactOnboardingListener.lambda$onAddEmailCompleted$7(emailAddressResult, writableMap);
            }
        }));
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.NameListener
    public void onAddNameCompleted(final NameResult nameResult) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.NAME, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda24
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                ReactOnboardingListener.lambda$onAddNameCompleted$26(nameResult, writableMap);
            }
        }));
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.PhoneNumberListener
    public void onAddPhoneCompleted(final PhoneNumberResult phoneNumberResult) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.PHONE, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda18
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                ReactOnboardingListener.lambda$onAddPhoneCompleted$0(phoneNumberResult, writableMap);
            }
        }));
        super.onAddPhoneCompleted(phoneNumberResult);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.AntifraudListener
    public void onAntifraudCompleted(final AntifraudResult antifraudResult) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.ANTIFRAUD, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda10
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                writableMap.putString("status", antifraudResult.resultCode == ResultCode.SUCCESS ? FirebaseAnalytics.Param.SUCCESS : "fail");
            }
        }));
        super.onAntifraudCompleted(antifraudResult);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.ApproveListener
    public void onApproveCompleted(final ApproveResult approveResult) {
        final boolean z2 = approveResult.uuid != null;
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.APPROVE, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda2
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                ReactOnboardingListener.lambda$onApproveCompleted$1(z2, approveResult, writableMap);
            }
        }));
        super.onApproveCompleted(approveResult);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.CaptchaListener
    public void onCaptchaCollected(final CaptchaResult captchaResult) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.CAPTCHA, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda15
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                ReactOnboardingListener.lambda$onCaptchaCollected$8(captchaResult, writableMap);
            }
        }));
        super.onCaptchaCollected(captchaResult);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.VideoConferenceListener
    public void onConferenceEnded() {
        super.onConferenceEnded();
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.CONFERENCE, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda12
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                writableMap.putString("status", FirebaseAnalytics.Param.SUCCESS);
            }
        }));
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.CurpValidationListener
    public void onCurpValidationCompleted(final CurpValidationResult curpValidationResult) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.CURP, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda17
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                ReactOnboardingListener.lambda$onCurpValidationCompleted$27(curpValidationResult, writableMap);
            }
        }));
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.ProcessCustomWatchlistListener
    public void onCustomWatchlistProcessed(final CustomWatchlistResult customWatchlistResult) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.CUSTOM_WATCHLIST, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda3
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                writableMap.putString("status", customWatchlistResult.resultCode == ResultCode.SUCCESS ? FirebaseAnalytics.Param.SUCCESS : "fail");
            }
        }));
        super.onCustomWatchlistProcessed(customWatchlistResult);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.DocumentValidationListener
    public void onDocumentValidationCompleted(final DocumentType documentType, final DocumentValidationResult documentValidationResult) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.DOCUMENT_SCAN, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda16
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                this.f$0.lambda$onDocumentValidationCompleted$15(documentType, documentValidationResult, writableMap);
            }
        }));
        super.onDocumentValidationCompleted(documentType, documentValidationResult);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.EKYBListener
    public void onEKYBChecksCompleted(final EKYBResult eKYBResult) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.eKYB, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda5
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                EKYBResult eKYBResult2 = eKYBResult;
                writableMap.putString("status", eKYBResult2.resultCode == ResultCode.SUCCESS ? FirebaseAnalytics.Param.SUCCESS : eKYBResult2.error != null ? eKYBResult2.error.getMessage() : "fail");
            }
        }));
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.EKYCListener
    public void onEKYCChecksCompleted(final EKYCResult eKYCResult) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.eKYC, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda13
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                EKYCResult eKYCResult2 = eKYCResult;
                writableMap.putString("status", eKYCResult2.resultCode == ResultCode.SUCCESS ? FirebaseAnalytics.Param.SUCCESS : eKYCResult2.error != null ? eKYCResult2.error.getMessage() : "fail");
            }
        }));
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.ErrorListener
    public void onError(Throwable th) {
        super.onError(th);
        String value = IncodeSdkFlowError.UNKNOWN.getValue();
        if (th instanceof DeviceEnvironmentException) {
            String message = th.getMessage();
            if (IncodeSdkErrorMessage.SIMULATOR_DETECTED.getErrorMessage().equals(message)) {
                value = IncodeSdkFlowError.SIMULATOR_DETECTED.getValue();
            } else if (IncodeSdkErrorMessage.HOOK_DETECTED.getErrorMessage().equals(message)) {
                value = IncodeSdkFlowError.HOOK_DETECTED.getValue();
            } else if (IncodeSdkErrorMessage.VIRTUAL_ENV_DETECTED.getErrorMessage().equals(message)) {
                value = IncodeSdkFlowError.VIRTUAL_ENV_DETECTED.getValue();
            } else if (IncodeSdkErrorMessage.ROOT_DETECTED.getErrorMessage().equals(message)) {
                value = IncodeSdkFlowError.ROOT_DETECTED.getValue();
            } else if (IncodeSdkErrorMessage.BAD_ENV_DETECTED.getErrorMessage().equals(message)) {
                value = IncodeSdkFlowError.BAD_ENV_DETECTED.getValue();
            }
        } else if ((th instanceof PermissionDeniedException) || (th instanceof CameraPermissionDeniedException)) {
            value = IncodeSdkFlowError.PERMISSIONS_DENIED.getValue();
        } else if (th instanceof FaceAuthenticationException) {
            value = IncodeSdkFlowError.FACE_AUTHENTICATION_FAILED.getValue();
        }
        this.promise.reject(value, th);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.EstimatedWaitingTimeListener
    public void onEstimatedWaitingTime(final int i2) {
        emit(addResultsToEventData(ModuleNames.CONFERENCE, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda1
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                writableMap.putInt("newWaitingTimeSeconds", i2);
            }
        }), "ONBOARDING_STEP_UPDATE");
        super.onEstimatedWaitingTime(i2);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.EventListener
    public void onEvent(Event event, HashMap<String, Object> map) {
        ArrayList arrayList = new ArrayList();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(NotificationCompat.CATEGORY_EVENT, event.getName());
        if (map != null) {
            writableMapCreateMap.putString("data", new JSONObject(map).toString());
        } else {
            writableMapCreateMap.putString("data", "{}");
        }
        arrayList.add(writableMapCreateMap);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putArray("events", Arguments.makeNativeArray((List) arrayList));
        emit(writableMapCreateMap2, "ON_EVENTS");
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.FaceAuthenticationListener
    public void onFaceAuthenticationCompleted(final FaceAuthenticationResult faceAuthenticationResult) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.FACE_AUTHENTICATION, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda33
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                ReactOnboardingListener.lambda$onFaceAuthenticationCompleted$33(faceAuthenticationResult, writableMap);
            }
        }));
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.FaceMatchListener
    public void onFaceMatchCompleted(final FaceMatchResult faceMatchResult) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.FACE_MATCH, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda14
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                ReactOnboardingListener.lambda$onFaceMatchCompleted$18(faceMatchResult, writableMap);
            }
        }));
        super.onFaceMatchCompleted(faceMatchResult);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.GeolocationListener
    public void onGeolocationFetched(final GeolocationResult geolocationResult) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.GEOLOCATION, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda26
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                this.f$0.lambda$onGeolocationFetched$16(geolocationResult, writableMap);
            }
        }));
        super.onGeolocationFetched(geolocationResult);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.GeolocationListener
    public void onGeolocationUnavailable(Throwable th) {
        super.onGeolocationUnavailable(th);
        emitOnboardingStepError(addResultsToEventData("GEOLOCATION", new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda6
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                writableMap.putString("status", "permissionsDenied");
            }
        }));
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.ProcessGlobalWatchlistListener
    public void onGlobalWatchlistProcessed(final GlobalWatchlistResult globalWatchlistResult) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.GLOBAL_WATCHLIST, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda19
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                writableMap.putString("status", globalWatchlistResult.resultCode == ResultCode.SUCCESS ? FirebaseAnalytics.Param.SUCCESS : "fail");
            }
        }));
        super.onGlobalWatchlistProcessed(globalWatchlistResult);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.GovernmentValidationListener
    public void onGovernmentValidationCompleted(final boolean z2) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.GOVERNMENT_VALIDATION, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda8
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                writableMap.putString("status", z2 ? FirebaseAnalytics.Param.SUCCESS : "fail");
            }
        }));
        super.onGovernmentValidationCompleted(z2);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.IdScanListener
    public void onIdBackCompleted(final IdScanResult idScanResult) {
        if (idScanResult.scanStatus != 10) {
            StepResultsMapping stepResultsMapping = new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda21
                @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
                public final void run(WritableMap writableMap) {
                    ReactOnboardingListener.lambda$onIdBackCompleted$10(idScanResult, writableMap);
                }
            };
            Objects.requireNonNull(stepResultsMapping);
            emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.ID_SCAN_BACK, new ReactOnboardingListener$$ExternalSyntheticLambda23(stepResultsMapping)));
        }
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.IdScanListener
    public void onIdFrontCompleted(final IdScanResult idScanResult) {
        StepResultsMapping stepResultsMapping = new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda27
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                ReactOnboardingListener.lambda$onIdFrontCompleted$9(idScanResult, writableMap);
            }
        };
        Objects.requireNonNull(stepResultsMapping);
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.ID_SCAN_FRONT, new ReactOnboardingListener$$ExternalSyntheticLambda23(stepResultsMapping)));
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.IdInfoListener
    public void onIdInfoCompleted(final IdInfoResult idInfoResult) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.OCREdit, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda32
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                IdInfoResult idInfoResult2 = idInfoResult;
                writableMap.putString("status", idInfoResult2.resultCode == ResultCode.SUCCESS ? FirebaseAnalytics.Param.SUCCESS : idInfoResult2.error != null ? idInfoResult2.error.getMessage() : "fail");
            }
        }));
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.IdProcessListener
    public void onIdProcessed(final IdProcessResult idProcessResult) {
        final StepResultsMapping stepResultsMapping = new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda22
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                this.f$0.lambda$onIdProcessed$11(idProcessResult, writableMap);
            }
        };
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.PROCESS_ID, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda29
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                this.f$0.lambda$onIdProcessed$13(idProcessResult, stepResultsMapping, writableMap);
            }
        }));
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.MachineLearningConsentListener
    public void onMachineLearningConsentCompleted(final MachineLearningConsentResult machineLearningConsentResult) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.ML_CONSENT, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda11
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                MachineLearningConsentResult machineLearningConsentResult2 = machineLearningConsentResult;
                writableMap.putString("status", machineLearningConsentResult2.isSuccess ? FirebaseAnalytics.Param.SUCCESS : machineLearningConsentResult2.error != null ? machineLearningConsentResult2.error.getMessage() : "fail");
            }
        }));
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.NfcScanListener
    public void onNfcScanCompleted(final NfcScanResult nfcScanResult) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.NFC_SCAN, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda9
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                ReactOnboardingListener.lambda$onNfcScanCompleted$32(nfcScanResult, writableMap);
            }
        }));
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.OnboardingSectionCompletedListener
    public void onOnboardingSectionCompleted(String str) {
        super.onOnboardingSectionCompleted(str);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("status", FirebaseAnalytics.Param.SUCCESS);
        writableMapCreateMap.putString("sectionTag", str);
        this.promise.resolve(writableMapCreateMap);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.OnboardingSessionListener
    public void onOnboardingSessionCreated(String str, String str2, String str3) {
        emit(TypeHelper.getOnboardingSessionResult(str2, str), "ONBOARDING_SESSION_CREATED");
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.QRScanListener
    public void onQRScanCompleted(final QRScanResult qRScanResult) {
        emit(addResultsToEventData(ModuleNames.QR_SCAN, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda0
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                writableMap.putString("idCic", qRScanResult.value);
            }
        }), "ONBOARDING_STEP_UPDATE");
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.QueuePositionChangeListener
    public void onQueuePositionChanged(final int i2) {
        emit(addResultsToEventData(ModuleNames.CONFERENCE, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda7
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                writableMap.putInt("newQueuePosition", i2);
            }
        }), "ONBOARDING_STEP_UPDATE");
        super.onQueuePositionChanged(i2);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.UserScoreListener
    public void onResultsShown(UserScoreResult userScoreResult) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("module", ModuleNames.USER_SCORE);
        writableMapCreateMap.putMap("result", TypeHelper.getUserScoreResultMap(userScoreResult));
        emitOnboardingStepCompleted(writableMapCreateMap);
        super.onResultsShown(userScoreResult);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.SelfieScanListener
    public void onSelfieScanCompleted(final SelfieScanResult selfieScanResult) {
        if (selfieScanResult == null) {
            return;
        }
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.SELFIE_SCAN, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda28
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                ReactOnboardingListener.lambda$onSelfieScanCompleted$17(selfieScanResult, writableMap);
            }
        }));
        super.onSelfieScanCompleted(selfieScanResult);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.SignatureFormListener
    public void onSignatureCollected(final SignatureFormResult signatureFormResult) {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.SIGNATURE, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda34
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                ReactOnboardingListener.lambda$onSignatureCollected$19(signatureFormResult, writableMap);
            }
        }));
        super.onSignatureCollected(signatureFormResult);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.SuccessListener
    public void onSuccess() {
        super.onSuccess();
        resolveWithStatus(FirebaseAnalytics.Param.SUCCESS);
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.UserCancelledListener
    public void onUserCancelled() {
        resolveWithStatus("userCancelled");
    }

    @Override // com.incode.welcome_sdk.IncodeWelcome.OnboardingListener, com.incode.welcome_sdk.listeners.UserConsentListener
    public void onUserConsentCompleted() {
        emitOnboardingStepCompleted(addResultsToEventData(ModuleNames.CONSENT, new StepResultsMapping() { // from class: com.reactnativeincodesdk.ReactOnboardingListener$$ExternalSyntheticLambda35
            @Override // com.reactnativeincodesdk.ReactOnboardingListener.StepResultsMapping
            public final void run(WritableMap writableMap) {
                writableMap.putString("status", FirebaseAnalytics.Param.SUCCESS);
            }
        }));
    }
}
