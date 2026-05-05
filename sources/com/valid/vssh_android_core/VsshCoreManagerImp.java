package com.valid.vssh_android_core;

import com.valid.communication.managers.communicationmanager.CommunicationManager;
import com.valid.vssh_android_core.authentication.CoreAuthentication;
import com.valid.vssh_android_core.authentication.CoreAuthenticationCallback;
import com.valid.vssh_android_core.authentication.CoreAuthenticationImp;
import com.valid.vssh_android_core.card.CoreCard;
import com.valid.vssh_android_core.card.CoreCardCallback;
import com.valid.vssh_android_core.card.CoreCardImp;
import com.valid.vssh_android_core.document.CoreDocument;
import com.valid.vssh_android_core.document.CoreDocumentImp;
import com.valid.vssh_android_core.exception.CommunicationException;
import com.valid.vssh_android_core.generic.CoreGeneric;
import com.valid.vssh_android_core.generic.CoreGenericImp;
import com.valid.vssh_android_core.model.CardInformationModel;
import com.valid.vssh_android_core.model.ClientHelloModel;
import com.valid.vssh_android_core.model.DocumentTypeModel;
import com.valid.vssh_android_core.model.GenerateOtpModel;
import com.valid.vssh_android_core.model.GenericModel;
import com.valid.vssh_android_core.model.LambdaError;
import com.valid.vssh_android_core.model.LambdaSuccess;
import com.valid.vssh_android_core.model.LoginModel;
import com.valid.vssh_android_core.model.PayModel;
import com.valid.vssh_android_core.model.RecoveryModel;
import com.valid.vssh_android_core.model.RegisterModel;
import com.valid.vssh_android_core.model.ScanDocumentModel;
import com.valid.vssh_android_core.model.SetupModel;
import com.valid.vssh_android_core.model.TransactionsModel;
import com.valid.vssh_android_core.model.UploadImageModel;
import com.valid.vssh_android_core.model.ValidateOtpModel;
import com.valid.vssh_android_core.model.response.CardAccountInfoResponse;
import com.valid.vssh_android_core.model.response.ClientHelloModelResponse;
import com.valid.vssh_android_core.model.response.CoreErrorModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericBridgeModelResponse;
import com.valid.vssh_android_core.model.response.CoreGenericModelResponse;
import com.valid.vssh_android_core.model.response.DocumentTypeResponse;
import com.valid.vssh_android_core.model.response.PayResponse;
import com.valid.vssh_android_core.model.response.ScanDocumentModelResponse;
import com.valid.vssh_android_core.model.response.TransactionsResponse;
import com.valid.vssh_android_core.utils.CommunicationHelper;
import com.valid.vssh_android_core.validation.CoreValidation;
import com.valid.vssh_android_core.validation.CoreValidationCallback;
import com.valid.vssh_android_core.validation.CoreValidationImp;
import com.valid.vssh_android_core.vsshcoreinit.VsshCoreInitCallback;
import com.valid.vssh_android_core.vsshcoreinit.VsshCoreInitImpl;
import java.io.IOException;
import java.util.Random;
import yg.C1561oA;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.hg;

/* JADX INFO: loaded from: classes5.dex */
public class VsshCoreManagerImp implements VsshCoreManager, VsshCoreInitCallback, CoreAuthenticationCallback, CoreValidationCallback {

    /* JADX INFO: renamed from: a */
    public VsshCoreManagerCallback f18325a;

    /* JADX INFO: renamed from: b */
    public VsshCoreInitImpl f18326b = new VsshCoreInitImpl();

    /* JADX INFO: renamed from: c */
    public CoreAuthentication f18327c = new CoreAuthenticationImp();

    /* JADX INFO: renamed from: d */
    public CoreValidation f18328d = new CoreValidationImp();

    /* JADX INFO: renamed from: e */
    public CoreCard f18329e = new CoreCardImp();

    /* JADX INFO: renamed from: f */
    public CoreDocument f18330f = new CoreDocumentImp();

    /* JADX INFO: renamed from: g */
    public CoreGeneric f18331g = new CoreGenericImp();

    /* JADX INFO: renamed from: com.valid.vssh_android_core.VsshCoreManagerImp$1 */
    public class AnonymousClass1 {
        public static int lastIndexOf() {
            try {
                return new Random().nextInt((732490521 ^ 1381969272) ^ 2046281258) + 1;
            } catch (ArrayOutOfBoundsException unused) {
                return 0;
            }
        }

        public static String lastIndexOf(int i2, String str) {
            int iXd;
            String strUd;
            int i3;
            int i4;
            char[] charArray;
            int i5;
            int length;
            int i6;
            String strVd = hg.Vd("\u000f", (short) (C1633zX.Xd() ^ (1815552813 ^ (-1815560856))), (short) (C1633zX.Xd() ^ (C1633zX.Xd() ^ (192044736 ^ 2133011420))));
            int i7 = 4;
            if (Integer.parseInt(strVd) != 0) {
                iXd = FB.Xd() ^ (656434242 ^ 2026834811);
                strUd = strVd;
                i3 = 4;
            } else {
                iXd = 5;
                strUd = C1561oA.ud("\u0012\u0012", (short) (C1607wl.Xd() ^ ((889851353 ^ 2125457299) ^ 1269162107)));
                i3 = 5;
            }
            char[] cArr = null;
            int i8 = 1;
            if (iXd != 0) {
                i2 += 12;
                charArray = str.toCharArray();
                i4 = 0;
                i5 = 0;
            } else {
                i4 = iXd + 14;
                strVd = strUd;
                charArray = null;
                i5 = 1;
            }
            if (Integer.parseInt(strVd) != 0) {
                i6 = i4 + 8;
                length = 1;
            } else {
                length = charArray.length;
                i6 = i4 + 6;
            }
            if (i6 != 0) {
                i7 = 4 << i3;
                cArr = charArray;
                i8 = i5;
            }
            int i9 = (i7 - 1) ^ 32;
            while (i8 != length) {
                int i10 = cArr[i8] ^ ((i2 + i9) - (i2 | i9));
                i2 -= 5;
                cArr[i8] = (char) i10;
                i8++;
            }
            return String.valueOf(cArr, 0, length);
        }
    }

    public class ArrayOutOfBoundsException extends RuntimeException {
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void cardAccountInfo(CardInformationModel cardInformationModel, CoreCardCallback coreCardCallback) throws CommunicationException {
        try {
            this.f18329e.cardAccountInfo(cardInformationModel, coreCardCallback);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void cardAccountInfo(CardInformationModel cardInformationModel, LambdaSuccess<CardAccountInfoResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
        try {
            this.f18329e.cardAccountInfo(cardInformationModel, lambdaSuccess, lambdaSuccess2, lambdaError);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void clientHello(ClientHelloModel clientHelloModel, VsshCoreManagerCallback vsshCoreManagerCallback) throws CommunicationException {
        try {
            this.f18325a = vsshCoreManagerCallback;
            this.f18327c.clientHello(clientHelloModel, this);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void clientHello(ClientHelloModel clientHelloModel, LambdaSuccess<ClientHelloModelResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
        try {
            this.f18327c.clientHello(clientHelloModel, lambdaSuccess, lambdaSuccess2, lambdaError);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void consumeGenericService(GenericModel genericModel, LambdaSuccess<CoreGenericBridgeModelResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
        try {
            this.f18331g.consumeGenericService(genericModel, lambdaSuccess, lambdaSuccess2, lambdaError);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public <T> void consumeGenericService(GenericModel genericModel, Class<T> cls, LambdaSuccess<T> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
        try {
            this.f18331g.consumeGenericService(genericModel, cls, lambdaSuccess, lambdaSuccess2, lambdaError);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void generateOtp(GenerateOtpModel generateOtpModel, VsshCoreManagerCallback vsshCoreManagerCallback) throws CommunicationException {
        try {
            this.f18325a = vsshCoreManagerCallback;
            this.f18328d.generateOtp(generateOtpModel, this);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void generateOtp(GenerateOtpModel generateOtpModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
        try {
            this.f18328d.generateOtp(generateOtpModel, lambdaSuccess, lambdaError);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public CommunicationManager getCommunicationManager() {
        try {
            return CommunicationHelper.getInstance().getCommunicationManager();
        } catch (ArrayOutOfBoundsException unused) {
            return null;
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void getDocumentType(DocumentTypeModel documentTypeModel, LambdaSuccess<DocumentTypeResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
        try {
            this.f18330f.getDocumentType(documentTypeModel, lambdaSuccess, lambdaSuccess2, lambdaError);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void getTransactions(TransactionsModel transactionsModel, CoreCardCallback coreCardCallback) throws CommunicationException {
        try {
            this.f18329e.getTransactions(transactionsModel, coreCardCallback);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void getTransactions(TransactionsModel transactionsModel, LambdaSuccess<TransactionsResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
        try {
            this.f18329e.getTransactions(transactionsModel, lambdaSuccess, lambdaSuccess2, lambdaError);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.vsshcoreinit.VsshCoreInitCallback
    public void initResponse(boolean z2) {
        try {
            this.f18325a.setupResponse(z2);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void login(LoginModel loginModel, VsshCoreManagerCallback vsshCoreManagerCallback) throws CommunicationException, IOException {
        try {
            this.f18325a = vsshCoreManagerCallback;
            this.f18327c.login(loginModel, this);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void login(LoginModel loginModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException, IOException {
        try {
            this.f18327c.login(loginModel, lambdaSuccess, lambdaError);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.authentication.CoreAuthenticationCallback
    public void onClientHelloResponse(ClientHelloModelResponse clientHelloModelResponse) {
        try {
            this.f18325a.coreClientHelloResponse(clientHelloModelResponse);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.basecore.BaseVsshCoreCallback
    public void onCoreError(Integer num, Integer num2, String str) {
        try {
            this.f18325a.coreErrorResponse(num, num2, str);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.basecore.BaseVsshCoreCallback
    public void onGenericResponse(String str, Integer num, String str2) {
        try {
            this.f18325a.coreGenericResponse(str, num, str2);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.basecore.BaseVsshCoreCallback
    public void onGenericResponse(String str, Integer num, String str2, String str3) {
        try {
            this.f18325a.coreGenericResponse(str, num, str2, str3);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void pay(PayModel payModel, CoreCardCallback coreCardCallback) throws CommunicationException {
        try {
            this.f18329e.pay(payModel, coreCardCallback);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void pay(PayModel payModel, LambdaSuccess<PayResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
        try {
            this.f18329e.pay(payModel, lambdaSuccess, lambdaSuccess2, lambdaError);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void recovery(RecoveryModel recoveryModel, VsshCoreManagerCallback vsshCoreManagerCallback) throws CommunicationException, IOException {
        try {
            this.f18325a = vsshCoreManagerCallback;
            this.f18327c.recovery(recoveryModel, this);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void recovery(RecoveryModel recoveryModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException, IOException {
        try {
            this.f18327c.recovery(recoveryModel, lambdaSuccess, lambdaError);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void register(RegisterModel registerModel, VsshCoreManagerCallback vsshCoreManagerCallback) throws CommunicationException, IOException {
        try {
            this.f18325a = vsshCoreManagerCallback;
            this.f18327c.register(registerModel, this);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void register(RegisterModel registerModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException, IOException {
        try {
            this.f18327c.register(registerModel, lambdaSuccess, lambdaError);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void scanDocument(ScanDocumentModel scanDocumentModel, LambdaSuccess<ScanDocumentModelResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
        try {
            this.f18330f.scanDocument(scanDocumentModel, lambdaSuccess, lambdaSuccess2, lambdaError);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void setCommunicationManager(CommunicationManager communicationManager) {
        try {
            CommunicationHelper.getInstance().setCommunicationManager(communicationManager);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void setup(SetupModel setupModel, VsshCoreManagerCallback vsshCoreManagerCallback) {
        try {
            this.f18325a = vsshCoreManagerCallback;
            this.f18326b.setup(setupModel, this);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void setup(SetupModel setupModel, LambdaSuccess<Boolean> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) {
        try {
            this.f18326b.setup(setupModel, lambdaSuccess, lambdaError);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void setup(SetupModel setupModel, LambdaSuccess<CoreGenericBridgeModelResponse> lambdaSuccess, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess2, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
        try {
            this.f18326b.setup(setupModel, lambdaSuccess, lambdaSuccess2, lambdaError);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void uploadImage(UploadImageModel uploadImageModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException, IOException {
        try {
            this.f18330f.uploadImage(uploadImageModel, lambdaSuccess, lambdaError);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void validateOtp(ValidateOtpModel validateOtpModel, VsshCoreManagerCallback vsshCoreManagerCallback) throws CommunicationException {
        try {
            this.f18325a = vsshCoreManagerCallback;
            this.f18328d.validateOtp(validateOtpModel, this);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }

    @Override // com.valid.vssh_android_core.VsshCoreManager
    public void validateOtp(ValidateOtpModel validateOtpModel, LambdaSuccess<CoreGenericModelResponse> lambdaSuccess, LambdaError<CoreErrorModelResponse> lambdaError) throws CommunicationException {
        try {
            this.f18328d.validateOtp(validateOtpModel, lambdaSuccess, lambdaError);
        } catch (ArrayOutOfBoundsException unused) {
        }
    }
}
