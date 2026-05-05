package com.reactnativeincodesdk;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.google.common.base.Ascii;
import com.incode.welcome_sdk.CameraFacing;
import com.incode.welcome_sdk.FlowConfig;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.SessionConfig;
import com.incode.welcome_sdk.data.local.VideoSelfieLocalQuestion;
import com.incode.welcome_sdk.modules.AES;
import com.incode.welcome_sdk.modules.CurpValidation;
import com.incode.welcome_sdk.modules.DocumentScan;
import com.incode.welcome_sdk.modules.EKYB;
import com.incode.welcome_sdk.modules.EKYC;
import com.incode.welcome_sdk.modules.Email;
import com.incode.welcome_sdk.modules.FaceAuthentication;
import com.incode.welcome_sdk.modules.FaceMatch;
import com.incode.welcome_sdk.modules.GovernmentValidation;
import com.incode.welcome_sdk.modules.IdInfo;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.MachineLearningConsent;
import com.incode.welcome_sdk.modules.NfcScan;
import com.incode.welcome_sdk.modules.Phone;
import com.incode.welcome_sdk.modules.ProcessId;
import com.incode.welcome_sdk.modules.SelfieScan;
import com.incode.welcome_sdk.modules.Signature;
import com.incode.welcome_sdk.modules.UserConsent;
import com.incode.welcome_sdk.modules.VideoSelfie;
import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import io.sentry.protocol.Geo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import yg.C1499aX;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1607wl;
import yg.C1626yg;
import yg.EO;
import yg.FB;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xg;
import yg.Xu;
import yg.ZN;
import yg.ZO;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class OnboardingConfigFactory {
    public static final boolean SHOW_TUTORIAL_DEFAULT = true;
    public static boolean WAIT_FOR_TUTORIALS = true;

    protected OnboardingConfigFactory() {
    }

    private static void addAes(FlowConfig.Builder builder, ReadableMap readableMap) throws ModuleConfigurationException {
        AES.Builder builder2 = new AES.Builder();
        if (readableMap.hasKey("uploadDocument")) {
            builder2.setUploadDocument(readableMap.getBoolean("uploadDocument"));
        }
        if (readableMap.hasKey("downloadDocument")) {
            builder2.setDownloadDocument(readableMap.getBoolean("downloadDocument"));
        }
        builder.addAES(builder2.build());
    }

    private static void addAntifraud(FlowConfig.Builder builder, ReadableMap readableMap) {
        builder.addAntifraud();
    }

    private static void addApproveConfig(FlowConfig.Builder builder, ReadableMap readableMap) {
        builder.addApproval(false, false, readableMap.hasKey("forceApproval") ? readableMap.getBoolean("forceApproval") : false);
    }

    private static void addCURP(FlowConfig.Builder builder, ReadableMap readableMap) {
        CurpValidation.Builder builder2 = new CurpValidation.Builder();
        if (readableMap.hasKey("validationEnabled")) {
            builder2.setValidationEnabled(readableMap.getBoolean("validationEnabled"));
        }
        builder.addCurpValidation(builder2.build());
    }

    private static void addConferenceIdConfig(FlowConfig.Builder builder, ReadableMap readableMap) {
        builder.addConference(readableMap.getBoolean("disableMicOnStart"));
    }

    private static void addConsentConfig(FlowConfig.Builder builder, ReadableMap readableMap) {
        UserConsent.Builder builder2 = new UserConsent.Builder();
        if (readableMap.hasKey("title")) {
            builder2.setTitle(readableMap.getString("title"));
        }
        if (readableMap.hasKey("content")) {
            builder2.setContent(readableMap.getString("content"));
        }
        builder.addUserConsent(builder2.build());
    }

    private static void addCustomWatchlist(FlowConfig.Builder builder, ReadableMap readableMap) {
        builder.addCustomWatchlist();
    }

    private static void addDocumentScanConfig(FlowConfig.Builder builder, ReadableMap readableMap) {
        DocumentScan.Builder waitForTutorials = new DocumentScan.Builder().setShowTutorials(shouldShowTutorial(readableMap)).setWaitForTutorials(WAIT_FOR_TUTORIALS);
        if (readableMap.hasKey("showDocumentProviderScreen")) {
            waitForTutorials.setShowDocumentProviderOptions(readableMap.getBoolean("showDocumentProviderScreen"));
        }
        if (readableMap.hasKey("type")) {
            String string = readableMap.getString("type");
            if (!TextUtils.isEmpty(string)) {
                waitForTutorials.setDocumentType(TypeHelper.getDocumentType(string));
            }
        }
        builder.addDocumentScan(waitForTutorials.build());
    }

    private static void addEKYB(FlowConfig.Builder builder, ReadableMap readableMap) {
        EKYB.Builder builder2 = new EKYB.Builder();
        if (readableMap.hasKey("checkBusinessName")) {
            builder2.setShowBusinessName(readableMap.getBoolean("checkBusinessName"));
        } else {
            builder2.setShowBusinessName(false);
        }
        if (readableMap.hasKey("checkAddress")) {
            builder2.setShowAddress(readableMap.getBoolean("checkAddress"));
        } else {
            builder2.setShowAddress(false);
        }
        if (readableMap.hasKey("checkTaxId")) {
            builder2.setShowTaxId(readableMap.getBoolean("checkTaxId"));
        } else {
            builder2.setShowTaxId(false);
        }
        builder.addEKYB(builder2.build());
    }

    private static void addEKYC(FlowConfig.Builder builder, ReadableMap readableMap) {
        EKYC.Builder builder2 = new EKYC.Builder();
        if (readableMap.hasKey("checkName")) {
            builder2.setVerifyName(readableMap.getBoolean("checkName"));
        } else {
            builder2.setVerifyName(false);
        }
        if (readableMap.hasKey("checkEmail")) {
            builder2.setVerifyEmail(readableMap.getBoolean("checkEmail"));
        } else {
            builder2.setVerifyEmail(false);
        }
        if (readableMap.hasKey("checkAddress")) {
            builder2.setVerifyAddress(readableMap.getBoolean("checkAddress"));
        } else {
            builder2.setVerifyAddress(false);
        }
        if (readableMap.hasKey("checkPhone")) {
            builder2.setVerifyPhone(readableMap.getBoolean("checkPhone"));
        } else {
            builder2.setVerifyPhone(false);
        }
        if (readableMap.hasKey("checkSsn")) {
            builder2.setVerifyTaxId(readableMap.getBoolean("checkSsn"));
        } else {
            builder2.setVerifyTaxId(false);
        }
        if (readableMap.hasKey("checkDob")) {
            builder2.setVerifyDateOfBirth(readableMap.getBoolean("checkDob"));
        } else {
            builder2.setVerifyDateOfBirth(false);
        }
        if (readableMap.hasKey("checkNationality")) {
            builder2.setVerifyNationality(readableMap.getBoolean("checkNationality"));
        } else {
            builder2.setVerifyNationality(false);
        }
        builder.addEKYC(builder2.build());
    }

    private static void addEmailConfig(FlowConfig.Builder builder, ReadableMap readableMap) {
        Email.Builder builder2 = new Email.Builder();
        if (readableMap.hasKey("otpVerification")) {
            builder2.setOtpVerificationEnabled(readableMap.getBoolean("otpVerification"));
        }
        builder.addEmail(builder2.build());
    }

    private static void addFaceAuthentication(FlowConfig.Builder builder, ReadableMap readableMap) {
        FaceAuthentication.Builder builder2 = new FaceAuthentication.Builder();
        if (readableMap.hasKey("showTutorials")) {
            builder2.setShowTutorials(readableMap.getBoolean("showTutorials"));
        }
        if (readableMap.hasKey("autoCaptureTimeout")) {
            builder2.setAutoCaptureTimeout(readableMap.getInt("autoCaptureTimeout"));
        }
        if (readableMap.hasKey("captureAttempts")) {
            builder2.setCaptureAttempts(readableMap.getInt("captureAttempts"));
        }
        if (readableMap.hasKey("eyesClosedCheck")) {
            builder2.setEyesClosedCheckEnabled(readableMap.getBoolean("eyesClosedCheck"));
        }
        if (readableMap.hasKey("headCoverCheck")) {
            builder2.setHeadCoverCheckEnabled(readableMap.getBoolean("headCoverCheck"));
        }
        if (readableMap.hasKey("lensesCheck")) {
            builder2.setLensesCheckEnabled(readableMap.getBoolean("lensesCheck"));
        }
        if (readableMap.hasKey("faceMaskCheck")) {
            builder2.setMaskCheckEnabled(readableMap.getBoolean("faceMaskCheck"));
        }
        builder.addFaceAuthentication(builder2.build());
    }

    private static void addFaceMatchConfig(FlowConfig.Builder builder, ReadableMap readableMap) {
        String string;
        FaceMatch.Builder builder2 = new FaceMatch.Builder();
        IdCategory iDCategory = TypeHelper.getIDCategory(readableMap);
        if (iDCategory != null) {
            builder2.setIdCategory(iDCategory);
        }
        if (readableMap.hasKey("matchType") && (string = readableMap.getString("matchType")) != null) {
            builder2.setMatchType(TypeHelper.getFaceMatchType(string));
        }
        Boolean boolValueOf = readableMap.hasKey("showUserExists") ? Boolean.valueOf(readableMap.getBoolean("showUserExists")) : null;
        if (boolValueOf != null) {
            builder2.setShowUserExists(boolValueOf.booleanValue());
        }
        builder.addFaceMatch(builder2.build());
    }

    private static void addGeolocationConfig(FlowConfig.Builder builder) {
        builder.addGeolocation();
    }

    private static void addGlobalWatchlist(FlowConfig.Builder builder, ReadableMap readableMap) {
        builder.addGlobalWatchlist();
    }

    private static void addGovernmentValidation(FlowConfig.Builder builder, ReadableMap readableMap) {
        GovernmentValidation.Builder builder2 = new GovernmentValidation.Builder();
        if (readableMap.hasKey("isBackgroundExecuted")) {
            builder2.setSkipAnimation(readableMap.getBoolean("isBackgroundExecuted"));
        }
        builder.addGovernmentValidation(builder2.build());
    }

    private static void addIdScanBackConfig(FlowConfig.Builder builder, ReadableMap readableMap) {
        IdScan.Builder idScanConfigFromModule = getIdScanConfigFromModule(readableMap);
        idScanConfigFromModule.setScanStep(IdScan.ScanStep.BACK);
        idScanConfigFromModule.setIdType(IdScan.IdType.ID);
        builder.addID(idScanConfigFromModule.build());
    }

    private static void addIdScanConfig(FlowConfig.Builder builder, ReadableMap readableMap) {
        IdScan idScanBuild = getIdScanConfigFromModule(readableMap).build();
        builder.addID(idScanBuild);
        if (IncodeWelcome.getInstance().getSdkMode() != com.incode.welcome_sdk.SdkMode.CAPTURE_ONLY) {
            builder.addProcessId(new ProcessId.Builder().setIdCategory(idScanBuild.getIdCategory()).build());
        }
    }

    private static void addIdScanFrontConfig(FlowConfig.Builder builder, ReadableMap readableMap) {
        IdScan.Builder idScanConfigFromModule = getIdScanConfigFromModule(readableMap);
        idScanConfigFromModule.setScanStep(IdScan.ScanStep.FRONT);
        builder.addID(idScanConfigFromModule.build());
    }

    private static void addMLConsentConfig(FlowConfig.Builder builder, ReadableMap readableMap) {
        if (readableMap.hasKey("type")) {
            String lowerCase = readableMap.getString("type").toLowerCase();
            MachineLearningConsent.ConsentType consentType = "us".equals(lowerCase) ? MachineLearningConsent.ConsentType.US : "gdpr".equals(lowerCase) ? MachineLearningConsent.ConsentType.GDPR : null;
            if (consentType != null) {
                builder.addMachineLearningConsent(new MachineLearningConsent.Builder().setConsentType(consentType).build());
            }
        }
    }

    private static void addNFCScan(FlowConfig.Builder builder, ReadableMap readableMap) {
        String string;
        NfcScan.Builder builder2 = new NfcScan.Builder();
        if (readableMap.hasKey("idType") && (string = readableMap.getString("idType")) != null) {
            builder2.setIdType(IdScan.IdType.valueOf(string.toUpperCase(Locale.ROOT)));
        }
        if (readableMap.hasKey("showNFCSymbolConfirmationScreen")) {
            builder2.setShowNfcSymbolConfirmationScreen(readableMap.getBoolean("showNFCSymbolConfirmationScreen"));
        }
        if (readableMap.hasKey("showInitialDataConfirmationScreen")) {
            builder2.setShowInitialDataConfirmationScreen(readableMap.getBoolean("showInitialDataConfirmationScreen"));
        }
        if (readableMap.hasKey("processNFCData")) {
            builder2.setProcessNfcData(readableMap.getBoolean("processNFCData"));
        }
        builder.addNfcScan(builder2.build());
    }

    private static void addName(FlowConfig.Builder builder, ReadableMap readableMap) {
        builder.addName();
    }

    private static void addOCREdit(FlowConfig.Builder builder, ReadableMap readableMap) {
        IdInfo.Builder builder2 = new IdInfo.Builder();
        if (readableMap.hasKey("isEditable")) {
            builder2.setEditableOcr(readableMap.getBoolean("isEditable"));
        }
        builder.addIdInfo(builder2.build());
    }

    private static void addPhoneConfig(FlowConfig.Builder builder, ReadableMap readableMap) {
        Phone.Builder builder2 = new Phone.Builder();
        builder2.setOtpVerificationEnabled(readableMap.hasKey("otpVerification") ? readableMap.getBoolean("otpVerification") : false);
        builder.addPhone(builder2.build());
    }

    private static void addProcessIdConfig(FlowConfig.Builder builder, ReadableMap readableMap) {
        ProcessId.Builder builder2 = new ProcessId.Builder();
        IdCategory iDCategory = TypeHelper.getIDCategory(readableMap);
        if (iDCategory != null) {
            builder2.setIdCategory(iDCategory);
        }
        if (readableMap.hasKey("enableIdSummaryScreen")) {
            builder2.setEnableIdSummaryScreen(readableMap.getBoolean("enableIdSummaryScreen"));
        }
        builder.addProcessId(builder2.build());
    }

    private static void addSelfieScanConfig(FlowConfig.Builder builder, ReadableMap readableMap) {
        boolean zShouldShowTutorial = shouldShowTutorial(readableMap);
        boolean z2 = readableMap.hasKey("lensesCheck") ? readableMap.getBoolean("lensesCheck") : true;
        SelfieScan.Builder livenessDetectionMode = new SelfieScan.Builder().setShowTutorials(zShouldShowTutorial).setWaitForTutorials(WAIT_FOR_TUTORIALS).setLensesCheckEnabled(z2).setMaskCheckEnabled(readableMap.hasKey("faceMaskCheck") ? readableMap.getBoolean("faceMaskCheck") : false).setStreamFramesEnabled(readableMap.hasKey("streamFrames") ? readableMap.getBoolean("streamFrames") : false).setLivenessDetectionMode(SelfieScan.LivenessDetectionMode.SERVER);
        if (readableMap.hasKey("cameraFacing")) {
            livenessDetectionMode.setCameraFacing(TypeHelper.getCameraFacingFromString(readableMap.getString("cameraFacing")));
        }
        builder.addSelfieScan(livenessDetectionMode.build());
    }

    private static void addSignatureConfig(Context context, FlowConfig.Builder builder, ReadableMap readableMap) throws Throwable {
        Signature.Builder builder2 = new Signature.Builder();
        String strVd = hg.Vd("aU_VN", (short) (C1499aX.Xd() ^ (-18510)), (short) (C1499aX.Xd() ^ (-15120)));
        boolean zHasKey = readableMap.hasKey(strVd);
        short sXd = (short) (OY.Xd() ^ 32478);
        int[] iArr = new int["OOLBF>".length()];
        QB qb = new QB("OOLBF>");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK(sXd + i2 + xuXd.CK(iKK));
            i2++;
        }
        String str = new String(iArr, 0, i2);
        if (zHasKey) {
            String string = readableMap.getString(strVd);
            Object[] objArr = new Object[0];
            Method method = Class.forName(C1561oA.yd("u\u0004z\n\u007fzvA\u007f\r\r\u0014}\b\u000fIGtt{eyv", (short) (C1607wl.Xd() ^ 27854))).getMethod(C1561oA.Yd("KJZ9M\\Y`^PSb", (short) (OY.Xd() ^ 4091)), new Class[0]);
            try {
                method.setAccessible(true);
                Resources resources = (Resources) method.invoke(context, objArr);
                Object[] objArr2 = new Object[0];
                Method method2 = Class.forName(Xg.qd("r\u0001w\u0007\u0005\u007f{F|\n\n\u0011\u0003\r\u0014Nd\u0012\u0012\u0019\u000b\u001f\u001c", (short) (OY.Xd() ^ 23617), (short) (OY.Xd() ^ 25220))).getMethod(Jg.Wd("\"WCP>\u0013T\u001fa7tD\"T", (short) (OY.Xd() ^ 28292), (short) (OY.Xd() ^ 23560)), new Class[0]);
                try {
                    method2.setAccessible(true);
                    builder2.setTitle(resources.getIdentifier(string, str, (String) method2.invoke(context, objArr2)));
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        String strXd = ZO.xd("5X\t\"+us>\u00104m", (short) (Od.Xd() ^ (-12855)), (short) (Od.Xd() ^ (-23365)));
        if (readableMap.hasKey(strXd)) {
            String string2 = readableMap.getString(strXd);
            Class<?> cls = Class.forName(C1626yg.Ud("7\u001a&51>%u+^,\f8x{u \u001d\u001bS\u0016=#", (short) (ZN.Xd() ^ 1135), (short) (ZN.Xd() ^ 29876)));
            Class<?>[] clsArr = new Class[0];
            Object[] objArr3 = new Object[0];
            short sXd2 = (short) (C1580rY.Xd() ^ (-7965));
            int[] iArr2 = new int["\u007fPkk\r=\u001f$Edf\u0019".length()];
            QB qb2 = new QB("\u007fPkk\r=\u001f$Edf\u0019");
            int i3 = 0;
            while (qb2.YK()) {
                int iKK2 = qb2.KK();
                Xu xuXd2 = Xu.Xd(iKK2);
                iArr2[i3] = xuXd2.fK(xuXd2.CK(iKK2) - (C1561oA.Xd[i3 % C1561oA.Xd.length] ^ (sXd2 + i3)));
                i3++;
            }
            Method method3 = cls.getMethod(new String(iArr2, 0, i3), clsArr);
            try {
                method3.setAccessible(true);
                Resources resources2 = (Resources) method3.invoke(context, objArr3);
                Object[] objArr4 = new Object[0];
                Method method4 = Class.forName(EO.Od("\u001d\u0004\b5zI`:6'(\bCRL`R|DB\nU#", (short) (ZN.Xd() ^ 7982))).getMethod(C1561oA.Qd("OLZ5EFMBGD,>I@", (short) (FB.Xd() ^ 32725)), new Class[0]);
                try {
                    method4.setAccessible(true);
                    builder2.setDescription(resources2.getIdentifier(string2, str, (String) method4.invoke(context, objArr4)));
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            } catch (InvocationTargetException e5) {
                throw e5.getCause();
            }
        }
        builder.addSignature(builder2.build());
    }

    private static void addUserScoreConfig(FlowConfig.Builder builder, ReadableMap readableMap) {
        builder.addResults("fast".equals(readableMap.hasKey("mode") ? readableMap.getString("mode") : null) ? IncodeWelcome.IDResultsFetchMode.FAST : IncodeWelcome.IDResultsFetchMode.ACCURATE);
    }

    private static void addVideoSelfieConfig(FlowConfig.Builder builder, ReadableMap readableMap) {
        ReadableArray array;
        VideoSelfie.Builder builder2 = new VideoSelfie.Builder();
        if (readableMap.hasKey("showTutorial")) {
            builder2.setShowTutorials(shouldShowTutorial(readableMap));
        }
        if (readableMap.hasKey("selfieLivenessCheck")) {
            builder2.setLivenessEnabled(readableMap.getBoolean("selfieLivenessCheck"));
        }
        if (readableMap.hasKey("selfieScanMode")) {
            builder2.setSelfieMode("faceMatch".equals(readableMap.getString("selfieScanMode")) ? VideoSelfie.SelfieMode.FACE_MATCH : VideoSelfie.SelfieMode.SELFIE_MATCH);
        }
        if (readableMap.hasKey("showIdScan")) {
            builder2.setIdScanEnabled(readableMap.getBoolean("showIdScan"));
        }
        if (readableMap.hasKey("showVoiceConsent")) {
            builder2.setVoiceConsentEnabled(readableMap.getBoolean("showVoiceConsent"));
            builder2.setRandomQuestionsEnabled(readableMap.getBoolean("showVoiceConsent"));
        }
        if (readableMap.hasKey("voiceConsentFR")) {
            builder2.setVoiceConsentFaceRecognitionEnabled(readableMap.getBoolean("voiceConsentFR"));
        }
        if (readableMap.hasKey("voiceConsentQuestionsCount")) {
            if (readableMap.getInt("voiceConsentQuestionsCount") > 0) {
                builder2.setRandomQuestionsEnabled(true);
                builder2.setRandomQuestionsCount(readableMap.getInt("voiceConsentQuestionsCount"));
            } else {
                builder2.setRandomQuestionsEnabled(false);
            }
        }
        if (readableMap.hasKey("cameraFacingConfig")) {
            ReadableMap map = readableMap.getMap("cameraFacingConfig");
            builder2.setSelfieCameraFacing(TypeHelper.getCameraFacing(map, "selfieCameraFacing", CameraFacing.FRONT));
            builder2.setIdFrontCameraFacing(TypeHelper.getCameraFacing(map, "idFrontCameraFacing", CameraFacing.BACK));
            builder2.setIdBackCameraFacing(TypeHelper.getCameraFacing(map, "idBackCameraFacing", CameraFacing.BACK));
            builder2.setDocumentScanCameraFacing(TypeHelper.getCameraFacing(map, "documentScanCameraFacing", CameraFacing.BACK));
            builder2.setRandomQuestionsCameraFacing(TypeHelper.getCameraFacing(map, "randomQuestionsCameraFacing", CameraFacing.FRONT));
            builder2.setVoiceConsentCameraFacing(TypeHelper.getCameraFacing(map, "voiceConsentCameraFacing", CameraFacing.FRONT));
        }
        if (readableMap.hasKey("questions") && readableMap.getType("questions") == ReadableType.Array && (array = readableMap.getArray("questions")) != null && array.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < array.size(); i2++) {
                ReadableMap map2 = array.getMap(i2);
                if (map2.hasKey("question") && map2.hasKey("answer") && !map2.isNull("question") && !map2.isNull("answer")) {
                    String string = map2.getString("question");
                    String string2 = map2.getString("answer");
                    if (string != null && string2 != null) {
                        arrayList.add(new VideoSelfieLocalQuestion(string, string2));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                builder2.setRandomQuestions(arrayList);
            }
        }
        builder.addVideoSelfie(builder2.build());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static FlowConfig getFlowConfigByMap(Context context, ReadableArray readableArray, ReadableMap readableMap, String str) throws Throwable {
        FlowConfig.Builder builder = new FlowConfig.Builder();
        if (readableArray == null) {
            return builder.build();
        }
        if (readableMap != null && readableMap.hasKey("recordSession")) {
            boolean z2 = readableMap.getBoolean("recordSession");
            Boolean boolValueOf = readableMap.hasKey("forcePermissions") ? Boolean.valueOf(readableMap.getBoolean("forcePermissions")) : null;
            if (z2) {
                builder.setRecordSession(boolValueOf.booleanValue());
            }
        }
        builder.setFlowTag(str);
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            ReadableMap map = readableArray.getMap(i2);
            String string = map.getString("module");
            if (string == null) {
                throw new IllegalArgumentException("Module name not present in config");
            }
            if (!map.hasKey("enabled") || map.getBoolean("enabled")) {
                string.hashCode();
                byte b2 = -1;
                switch (string.hashCode()) {
                    case -2110116264:
                        if (string.equals(ModuleNames.ID_SCAN)) {
                            b2 = 0;
                        }
                        break;
                    case -2077746598:
                        if (string.equals(ModuleNames.CAPTCHA)) {
                            b2 = 1;
                        }
                        break;
                    case -1977464401:
                        if (string.equals(ModuleNames.CONSENT)) {
                            b2 = 2;
                        }
                        break;
                    case -1963054745:
                        if (string.equals(ModuleNames.USER_SCORE)) {
                            b2 = 3;
                        }
                        break;
                    case -1868153762:
                        if (string.equals(ModuleNames.QR_SCAN)) {
                            b2 = 4;
                        }
                        break;
                    case -1720669528:
                        if (string.equals(ModuleNames.NFC_SCAN)) {
                            b2 = 5;
                        }
                        break;
                    case -1598203485:
                        if (string.equals(ModuleNames.VIDEO_SELFIE)) {
                            b2 = 6;
                        }
                        break;
                    case -1573838532:
                        if (string.equals(ModuleNames.CONFERENCE)) {
                            b2 = 7;
                        }
                        break;
                    case -1308927400:
                        if (string.equals(ModuleNames.DOCUMENT_SCAN)) {
                            b2 = 8;
                        }
                        break;
                    case -1217415016:
                        if (string.equals(ModuleNames.SIGNATURE)) {
                            b2 = 9;
                        }
                        break;
                    case -905616344:
                        if (string.equals(ModuleNames.OCREdit)) {
                            b2 = 10;
                        }
                        break;
                    case -584492459:
                        if (string.equals(ModuleNames.FACE_AUTHENTICATION)) {
                            b2 = Ascii.VT;
                        }
                        break;
                    case -349374799:
                        if (string.equals(ModuleNames.ID_SCAN_FRONT)) {
                            b2 = Ascii.FF;
                        }
                        break;
                    case -109849566:
                        if (string.equals(ModuleNames.ANTIFRAUD)) {
                            b2 = Ascii.CR;
                        }
                        break;
                    case 65711:
                        if (string.equals(ModuleNames.AES)) {
                            b2 = Ascii.SO;
                        }
                        break;
                    case 2080304:
                        if (string.equals(ModuleNames.CURP)) {
                            b2 = Ascii.SI;
                        }
                        break;
                    case 2420395:
                        if (string.equals(ModuleNames.NAME)) {
                            b2 = 16;
                        }
                        break;
                    case 3083791:
                        if (string.equals(ModuleNames.eKYB)) {
                            b2 = 17;
                        }
                        break;
                    case 3083792:
                        if (string.equals(ModuleNames.eKYC)) {
                            b2 = Ascii.DC2;
                        }
                        break;
                    case 67066748:
                        if (string.equals(ModuleNames.EMAIL)) {
                            b2 = 19;
                        }
                        break;
                    case 77090126:
                        if (string.equals(ModuleNames.PHONE)) {
                            b2 = Ascii.DC4;
                        }
                        break;
                    case 190713211:
                        if (string.equals(ModuleNames.ML_CONSENT)) {
                            b2 = Ascii.NAK;
                        }
                        break;
                    case 215328072:
                        if (string.equals(ModuleNames.FACE_MATCH)) {
                            b2 = Ascii.SYN;
                        }
                        break;
                    case 871602989:
                        if (string.equals(ModuleNames.APPROVE)) {
                            b2 = Ascii.ETB;
                        }
                        break;
                    case 909207498:
                        if (string.equals(ModuleNames.PROCESS_ID)) {
                            b2 = Ascii.CAN;
                        }
                        break;
                    case 1382898725:
                        if (string.equals(ModuleNames.SELFIE_SCAN)) {
                            b2 = Ascii.EM;
                        }
                        break;
                    case 1498812764:
                        if (string.equals(ModuleNames.CUSTOM_WATCHLIST)) {
                            b2 = Ascii.SUB;
                        }
                        break;
                    case 1651161951:
                        if (string.equals(ModuleNames.ID_SCAN_BACK)) {
                            b2 = Ascii.ESC;
                        }
                        break;
                    case 1734538726:
                        if (string.equals(ModuleNames.GEOLOCATION)) {
                            b2 = Ascii.FS;
                        }
                        break;
                    case 1737603434:
                        if (string.equals(ModuleNames.GOVERNMENT_VALIDATION)) {
                            b2 = Ascii.GS;
                        }
                        break;
                    case 1923264874:
                        if (string.equals(ModuleNames.GLOBAL_WATCHLIST)) {
                            b2 = Ascii.RS;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                        addIdScanConfig(builder, map);
                        break;
                    case 1:
                        builder.addCaptcha();
                        break;
                    case 2:
                        addConsentConfig(builder, map);
                        break;
                    case 3:
                        addUserScoreConfig(builder, map);
                        break;
                    case 4:
                        builder.addQRScan(shouldShowTutorial(map));
                        break;
                    case 5:
                        addNFCScan(builder, map);
                        break;
                    case 6:
                        addVideoSelfieConfig(builder, map);
                        break;
                    case 7:
                        addConferenceIdConfig(builder, map);
                        break;
                    case 8:
                        addDocumentScanConfig(builder, map);
                        break;
                    case 9:
                        addSignatureConfig(context, builder, map);
                        break;
                    case 10:
                        addOCREdit(builder, map);
                        break;
                    case 11:
                        addFaceAuthentication(builder, map);
                        break;
                    case 12:
                        addIdScanFrontConfig(builder, map);
                        break;
                    case 13:
                        addAntifraud(builder, map);
                        break;
                    case 14:
                        addAes(builder, map);
                        break;
                    case 15:
                        addCURP(builder, map);
                        break;
                    case 16:
                        addName(builder, map);
                        break;
                    case 17:
                        addEKYB(builder, map);
                        break;
                    case 18:
                        addEKYC(builder, map);
                        break;
                    case 19:
                        addEmailConfig(builder, map);
                        break;
                    case 20:
                        addPhoneConfig(builder, map);
                        break;
                    case 21:
                        addMLConsentConfig(builder, map);
                        break;
                    case 22:
                        addFaceMatchConfig(builder, map);
                        break;
                    case 23:
                        addApproveConfig(builder, map);
                        break;
                    case 24:
                        addProcessIdConfig(builder, map);
                        break;
                    case 25:
                        addSelfieScanConfig(builder, map);
                        break;
                    case 26:
                        addCustomWatchlist(builder, map);
                        break;
                    case 27:
                        addIdScanBackConfig(builder, map);
                        break;
                    case 28:
                        addGeolocationConfig(builder);
                        break;
                    case 29:
                        addGovernmentValidation(builder, map);
                        break;
                    case 30:
                        addGlobalWatchlist(builder, map);
                        break;
                    default:
                        throw new UnknownModuleException(string);
                }
            }
        }
        return builder.build();
    }

    private static IdScan.Builder getIdScanConfigFromModule(ReadableMap readableMap) {
        String string;
        IdScan.Builder builder = new IdScan.Builder();
        if (readableMap.hasKey("idType") && (string = readableMap.getString("idType")) != null) {
            builder.setIdType(IdScan.IdType.valueOf(string.toUpperCase(Locale.ROOT)));
        }
        IdCategory iDCategory = TypeHelper.getIDCategory(readableMap);
        if (iDCategory != null) {
            builder.setIdCategory(iDCategory);
        }
        if (readableMap.hasKey("scanStep")) {
            builder.setScanStep(TypeHelper.getScanStep(readableMap.getString("scanStep")));
        }
        if (readableMap.hasKey("showRetakeScreen")) {
            builder.setShowRetakeScreen(Boolean.valueOf(readableMap.getBoolean("showRetakeScreen")).booleanValue(), getShowAutoCaptureRetakeScreen(readableMap));
        } else {
            builder.setShowRetakeScreen(true, getShowAutoCaptureRetakeScreen(readableMap));
        }
        if (readableMap.hasKey("enableRotationOnRetakeScreen")) {
            builder.setEnableRotationOnRetakeScreen(Boolean.valueOf(readableMap.getBoolean("enableRotationOnRetakeScreen")).booleanValue());
        }
        if (readableMap.hasKey("autocaptureUxMode")) {
            builder.setAutocaptureUXMode(TypeHelper.getAutoCaptureUxMode(readableMap.getString("autocaptureUxMode")));
        }
        if (readableMap.hasKey("showIDOverlay")) {
            builder.setShowIdOverlay(Boolean.valueOf(readableMap.getBoolean("showIDOverlay")).booleanValue());
        }
        if (readableMap.hasKey("enableFrontShownAsBackCheck")) {
            builder.setEnableFrontShownAsBackCheck(Boolean.valueOf(readableMap.getBoolean("enableFrontShownAsBackCheck")).booleanValue());
        }
        if (readableMap.hasKey("enableBackShownAsFrontCheck")) {
            builder.setEnableBackShownAsFrontCheck(Boolean.valueOf(readableMap.getBoolean("enableBackShownAsFrontCheck")).booleanValue());
        }
        if (readableMap.hasKey("streamFrames")) {
            builder.setStreamFramesEnabled(Boolean.valueOf(readableMap.getBoolean("streamFrames")).booleanValue());
        }
        return builder.setShowIdTutorials(shouldShowTutorial(readableMap)).setWaitForTutorials(WAIT_FOR_TUTORIALS);
    }

    public static SessionConfig getSessionConfigByMap(ReadableMap readableMap) {
        SessionConfig.Builder builder = new SessionConfig.Builder();
        if (readableMap == null) {
            return builder.build();
        }
        if (readableMap.hasKey(Geo.JsonKeys.REGION)) {
            builder.setRegionIsoCode(readableMap.getString(Geo.JsonKeys.REGION));
        }
        if (readableMap.hasKey("queue")) {
            builder.setQueueName(readableMap.getString("queue"));
        }
        if (readableMap.hasKey("configurationId")) {
            builder.setConfigurationId(readableMap.getString("configurationId"));
        }
        if (readableMap.hasKey("validationModules")) {
            builder.setValidationModuleList(TypeHelper.getValidationModulesFromArray(readableMap.getArray("validationModules")));
        }
        if (readableMap.hasKey("customFields")) {
            builder.setCustomFields(TypeHelper.getCustomFields(readableMap.getMap("customFields")));
        }
        if (readableMap.hasKey("interviewId")) {
            builder.setInterviewId(readableMap.getString("interviewId"));
        }
        if (readableMap.hasKey("token")) {
            builder.setExternalToken(readableMap.getString("token"));
        }
        if (readableMap.hasKey("externalId")) {
            builder.setExternalId(readableMap.getString("externalId"));
        }
        if (readableMap.hasKey("externalCustomerId")) {
            builder.setExternalCustomerId(readableMap.getString("externalCustomerId"));
        }
        if (readableMap.hasKey("e2eEncryptionEnabled")) {
            builder.setE2eEncryptionEnabled(readableMap.getBoolean("e2eEncryptionEnabled"));
        }
        if (readableMap.hasKey("mergeSessionRecordings")) {
            builder.setMergeSessionRecordings(readableMap.getBoolean("mergeSessionRecordings"));
        }
        return builder.build();
    }

    private static boolean getShowAutoCaptureRetakeScreen(ReadableMap readableMap) {
        if (readableMap.hasKey("showAutoCaptureRetakeScreen")) {
            return readableMap.getBoolean("showAutoCaptureRetakeScreen");
        }
        return false;
    }

    private static boolean shouldShowTutorial(ReadableMap readableMap) {
        if (readableMap.hasKey("showTutorial")) {
            return readableMap.getBoolean("showTutorial");
        }
        return true;
    }
}
