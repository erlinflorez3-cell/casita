package com.incode.welcome_sdk.modules.a;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.data.e.c;
import com.incode.welcome_sdk.data.remote.beans.br;
import com.incode.welcome_sdk.data.remote.beans.bv;
import com.incode.welcome_sdk.data.remote.beans.m;
import com.incode.welcome_sdk.modules.AES;
import com.incode.welcome_sdk.modules.CombinedConsent;
import com.incode.welcome_sdk.modules.DocumentScan;
import com.incode.welcome_sdk.modules.DynamicForms;
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
import com.incode.welcome_sdk.modules.SelfieScan;
import com.incode.welcome_sdk.modules.UserConsent;
import com.incode.welcome_sdk.modules.VideoSelfie;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10664a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f10665b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10666c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10667e = 0;

    public static /* synthetic */ Object d(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        int i8 = ~i3;
        int i9 = ~i5;
        int i10 = ~i2;
        int i11 = (~(i8 | i9 | i10)) | (~(i3 | i5));
        int i12 = ~(i2 | i5);
        int i13 = i11 | i12;
        int i14 = ~(i8 | i5);
        int i15 = i12 | i8 | (~(i9 | i10));
        int i16 = i3 + i5 + i6 + (1349231875 * i7) + (1735201104 * i4);
        int i17 = i16 * i16;
        int i18 = ((-413510627) * i3) + 1558183936 + (237349861 * i5) + (i13 * 325430244) + (325430244 * i14) + ((-325430244) * i15) + ((-88080384) * i6) + ((-1337982976) * i7) + (469762048 * i4) + (1272971264 * i17);
        int i19 = ((i3 * 236314795) - 374860141) + (i5 * 236313123) + (i13 * (-836)) + (i14 * (-836)) + (i15 * 836) + (i6 * 236313959) + (i7 * (-66979019)) + (i4 * (-1872492752)) + (i17 * (-417333248));
        int i20 = i18 + (i19 * i19 * 639631360);
        if (i20 == 1) {
            return b(objArr);
        }
        if (i20 == 2) {
            return d(objArr);
        }
        if (i20 != 3) {
            return c(objArr);
        }
        br brVar = (br) objArr[0];
        int i21 = 2 % 2;
        FaceAuthentication.Builder builder = new FaceAuthentication.Builder();
        bv bvVarB = brVar.b();
        if (bvVarB != null) {
            int i22 = f10665b + 19;
            f10667e = i22 % 128;
            int i23 = i22 % 2;
            builder.setShowTutorials(bvVarB.ae());
            builder.setAutoCaptureTimeout(((Integer) bv.b(new Object[]{bvVarB}, -254919471, c.c(), c.c(), c.c(), 254919474, c.c())).intValue());
            builder.setCaptureAttempts(bvVarB.aj());
            builder.setEyesClosedCheckEnabled(bvVarB.ak());
            builder.setHeadCoverCheckEnabled(bvVarB.al());
            builder.setLensesCheckEnabled(bvVarB.am());
            builder.setMaskCheckEnabled(bvVarB.ai());
        } else {
            int i24 = f10667e + 115;
            f10665b = i24 % 128;
            int i25 = i24 % 2;
        }
        return builder.build();
    }

    private b() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0094, code lost:
    
        if (r1.equals("GOVT_VALIDATION_PROVISIONING") == false) goto L4;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.incode.welcome_sdk.modules.BaseModule a(com.incode.welcome_sdk.data.remote.beans.br r6) {
        /*
            Method dump skipped, instruction units count: 754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.modules.a.b.a(com.incode.welcome_sdk.data.remote.beans.br):com.incode.welcome_sdk.modules.BaseModule");
    }

    private static CombinedConsent c(br brVar) {
        int i2 = 2 % 2;
        CombinedConsent.Builder builder = new CombinedConsent.Builder();
        bv bvVarB = brVar.b();
        if (bvVarB != null) {
            int i3 = f10665b + 39;
            f10667e = i3 % 128;
            int i4 = i3 % 2;
            builder.setCombinedConsentsId(bvVarB.e());
            int i5 = f10665b + 11;
            f10667e = i5 % 128;
            int i6 = i5 % 2;
        }
        return builder.build();
    }

    private static UserConsent b(br brVar) {
        int i2 = 2 % 2;
        UserConsent.Builder builder = new UserConsent.Builder();
        bv bvVarB = brVar.b();
        if (bvVarB != null) {
            int i3 = f10665b + 71;
            f10667e = i3 % 128;
            if (i3 % 2 != 0) {
                builder.setTitle(bvVarB.b());
                builder.setContent(bvVarB.c());
                int i4 = 12 / 0;
            } else {
                builder.setTitle(bvVarB.b());
                builder.setContent(bvVarB.c());
            }
        }
        UserConsent userConsentBuild = builder.build();
        int i5 = f10667e + 81;
        f10665b = i5 % 128;
        if (i5 % 2 != 0) {
            return userConsentBuild;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static MachineLearningConsent e(br brVar) {
        int i2 = 2 % 2;
        MachineLearningConsent.Builder builder = new MachineLearningConsent.Builder();
        bv bvVarB = brVar.b();
        if (bvVarB != null) {
            int i3 = f10667e + 1;
            f10665b = i3 % 128;
            int i4 = i3 % 2;
            builder.setConsentType(bvVarB.a());
            int i5 = f10667e + 13;
            f10665b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 2;
            }
        }
        return builder.build();
    }

    private static Phone d(br brVar) {
        int i2;
        int i3 = 2 % 2;
        Phone.Builder builder = new Phone.Builder();
        bv bvVarB = brVar.b();
        if (bvVarB != null) {
            builder.setOtpVerificationEnabled(bvVarB.d());
            i2 = f10665b + 31;
            f10667e = i2 % 128;
        } else {
            i2 = f10667e + 115;
            f10665b = i2 % 128;
        }
        int i4 = i2 % 2;
        return builder.build();
    }

    private static Email g(br brVar) {
        int i2 = 2 % 2;
        Email.Builder builder = new Email.Builder();
        bv bvVarB = brVar.b();
        if (bvVarB != null) {
            int i3 = f10667e + 123;
            f10665b = i3 % 128;
            int i4 = i3 % 2;
            builder.setOtpVerificationEnabled(bvVarB.d());
        }
        Email emailBuild = builder.build();
        int i5 = f10667e + 81;
        f10665b = i5 % 128;
        int i6 = i5 % 2;
        return emailBuild;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        br brVar = (br) objArr[0];
        int i2 = 2 % 2;
        IdScan.Builder builder = new IdScan.Builder();
        bv bvVarB = brVar.b();
        if (bvVarB != null) {
            builder.setStreamFramesEnabled(bvVarB.k());
            builder.setShowIdTutorials(bvVarB.h());
            builder.setShowIdTypeChooser(bvVarB.o());
            Object[] objArr2 = {Boolean.valueOf(bvVarB.g()), Boolean.valueOf(((Boolean) bv.b(new Object[]{bvVarB}, 394469491, c.c(), c.c(), c.c(), -394469487, c.c())).booleanValue()), Boolean.valueOf(((Boolean) bv.b(new Object[]{bvVarB}, -1617815267, c.c(), c.c(), c.c(), 1617815275, c.c())).booleanValue())};
            builder.setIdType((IdScan.IdType) d(IncodeWelcome.cm.d(), -1344010452, IncodeWelcome.cm.d(), 1344010453, objArr2, IncodeWelcome.cm.d(), IncodeWelcome.cm.d()));
            builder.setAutoCaptureTimeout(bvVarB.j());
            builder.setAutoCaptureNoIdTimeout(((Integer) bv.b(new Object[]{bvVarB}, 69957733, c.c(), c.c(), c.c(), -69957728, c.c())).intValue());
            builder.setCaptureAttempts(bvVarB.n());
            if (bvVarB.l() == m.f9720c) {
                builder.setIdCategory(IdCategory.SECOND);
            }
            if (bvVarB.m()) {
                int i3 = f10665b + 73;
                f10667e = i3 % 128;
                if (i3 % 2 != 0) {
                    builder.setScanStep(IdScan.ScanStep.FRONT);
                    int i4 = 85 / 0;
                } else {
                    builder.setScanStep(IdScan.ScanStep.FRONT);
                }
            }
            if (((Boolean) bv.b(new Object[]{bvVarB}, -1617815267, c.c(), c.c(), c.c(), 1617815275, c.c())).booleanValue()) {
                int i5 = f10665b + 123;
                f10667e = i5 % 128;
                int i6 = i5 % 2;
                builder.setScanStep(IdScan.ScanStep.BACK);
            }
            int i7 = f10665b + 115;
            f10667e = i7 % 128;
            int i8 = i7 % 2;
        }
        return builder.build();
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[2]).booleanValue();
        int i2 = 2 % 2;
        int i3 = f10667e + 107;
        int i4 = i3 % 128;
        f10665b = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (zBooleanValue3) {
            return IdScan.IdType.ID;
        }
        if (zBooleanValue && zBooleanValue2) {
            int i5 = i4 + 69;
            f10667e = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (zBooleanValue) {
            int i6 = i4 + 67;
            f10667e = i6 % 128;
            int i7 = i6 % 2;
            return IdScan.IdType.ID;
        }
        if (!zBooleanValue2) {
            return null;
        }
        IdScan.IdType idType = IdScan.IdType.PASSPORT;
        int i8 = f10667e + 13;
        f10665b = i8 % 128;
        if (i8 % 2 != 0) {
            return idType;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.incode.welcome_sdk.modules.ProcessId h(com.incode.welcome_sdk.data.remote.beans.br r5) {
        /*
            r4 = 2
            int r0 = r4 % r4
            com.incode.welcome_sdk.modules.ProcessId$Builder r3 = new com.incode.welcome_sdk.modules.ProcessId$Builder
            r3.<init>()
            com.incode.welcome_sdk.data.remote.beans.bv r2 = r5.b()
            if (r2 == 0) goto L41
            int r0 = com.incode.welcome_sdk.modules.a.b.f10665b
            int r1 = r0 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.modules.a.b.f10667e = r0
            int r1 = r1 % r4
            if (r1 == 0) goto L38
            com.incode.welcome_sdk.data.remote.beans.m r2 = r2.l()
            com.incode.welcome_sdk.data.remote.beans.m r1 = com.incode.welcome_sdk.data.remote.beans.m.f9720c
            r0 = 84
            int r0 = r0 / 0
            if (r2 != r1) goto L33
        L25:
            int r0 = com.incode.welcome_sdk.modules.a.b.f10667e
            int r1 = r0 + 21
            int r0 = r1 % 128
            com.incode.welcome_sdk.modules.a.b.f10665b = r0
            int r1 = r1 % r4
            com.incode.welcome_sdk.IdCategory r0 = com.incode.welcome_sdk.IdCategory.SECOND
            r3.setIdCategory(r0)
        L33:
            com.incode.welcome_sdk.modules.ProcessId r0 = r3.build()
            return r0
        L38:
            com.incode.welcome_sdk.data.remote.beans.m r1 = r2.l()
            com.incode.welcome_sdk.data.remote.beans.m r0 = com.incode.welcome_sdk.data.remote.beans.m.f9720c
            if (r1 != r0) goto L33
            goto L25
        L41:
            int r0 = com.incode.welcome_sdk.modules.a.b.f10667e
            int r1 = r0 + 21
            int r0 = r1 % 128
            com.incode.welcome_sdk.modules.a.b.f10665b = r0
            int r1 = r1 % r4
            if (r1 != 0) goto L33
            r0 = 5
            int r0 = r0 / r0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.modules.a.b.h(com.incode.welcome_sdk.data.remote.beans.br):com.incode.welcome_sdk.modules.ProcessId");
    }

    private static NfcScan j(br brVar) {
        int i2 = 2 % 2;
        NfcScan.Builder builder = new NfcScan.Builder();
        bv bvVarB = brVar.b();
        if (bvVarB != null) {
            int i3 = f10667e + 81;
            f10665b = i3 % 128;
            int i4 = i3 % 2;
            builder.setProcessNfcData(bvVarB.aa());
            builder.setShowNfcSymbolConfirmationScreen(bvVarB.Y());
            builder.setShowInitialDataConfirmationScreen(bvVarB.Z());
            int i5 = f10667e + 85;
            f10665b = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 4 / 3;
            }
        }
        NfcScan nfcScanBuild = builder.build();
        int i7 = f10665b + 73;
        f10667e = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 47 / 0;
        }
        return nfcScanBuild;
    }

    private static SelfieScan i(br brVar) {
        int i2 = 2 % 2;
        SelfieScan.Builder builder = new SelfieScan.Builder();
        bv bvVarB = brVar.b();
        if (bvVarB != null) {
            int i3 = f10665b + 51;
            f10667e = i3 % 128;
            int i4 = i3 % 2;
            builder.setShowTutorials(bvVarB.t());
            builder.setLensesCheckEnabled(bvVarB.x());
            builder.setMaskCheckEnabled(bvVarB.y());
            builder.setStreamFramesEnabled(bvVarB.v());
            builder.setAutoCaptureTimeout(bvVarB.p());
            builder.setCaptureAttempts(bvVarB.w());
            if (((Boolean) bv.b(new Object[]{bvVarB}, 1192628714, c.c(), c.c(), c.c(), -1192628705, c.c())).booleanValue()) {
                int i5 = f10665b + 123;
                f10667e = i5 % 128;
                int i6 = i5 % 2;
                builder.setAssistedOnboardingEnabled();
            }
        }
        return builder.build();
    }

    private static FaceMatch o(br brVar) {
        int i2 = 2 % 2;
        FaceMatch.Builder builder = new FaceMatch.Builder();
        bv bvVarB = brVar.b();
        if (bvVarB != null) {
            int i3 = f10665b + 73;
            f10667e = i3 % 128;
            int i4 = i3 % 2;
            builder.setMatchType(bvVarB.B());
            builder.setFaceMatchAnimationEnabled(bvVarB.C());
            if (bvVarB.l() == m.f9720c) {
                int i5 = f10667e + 105;
                f10665b = i5 % 128;
                if (i5 % 2 == 0) {
                    IdCategory[] idCategoryArr = new IdCategory[0];
                    idCategoryArr[0] = IdCategory.SECOND;
                    builder.setIdCategory(idCategoryArr);
                } else {
                    builder.setIdCategory(IdCategory.SECOND);
                }
            }
        }
        FaceMatch faceMatchBuild = builder.build();
        int i6 = f10665b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f10667e = i6 % 128;
        if (i6 % 2 == 0) {
            return faceMatchBuild;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static DocumentScan e() {
        int i2 = 2 % 2;
        DocumentScan.Builder builder = new DocumentScan.Builder();
        builder.setDocumentType(DocumentType.OTHER_DOCUMENT_1);
        DocumentScan documentScanBuild = builder.build();
        int i3 = f10665b + 115;
        f10667e = i3 % 128;
        if (i3 % 2 == 0) {
            return documentScanBuild;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static DocumentScan a() {
        int i2 = 2 % 2;
        DocumentScan.Builder builder = new DocumentScan.Builder();
        builder.setDocumentType(DocumentType.ADDRESS_STATEMENT);
        DocumentScan documentScanBuild = builder.build();
        int i3 = f10665b + 111;
        f10667e = i3 % 128;
        int i4 = i3 % 2;
        return documentScanBuild;
    }

    private static AES n(br brVar) {
        int i2 = 2 % 2;
        AES.Builder builder = new AES.Builder();
        bv bvVarB = brVar.b();
        if (bvVarB != null) {
            int i3 = f10665b + 39;
            f10667e = i3 % 128;
            if (i3 % 2 == 0) {
                builder.setDownloadDocument(bvVarB.ag());
                builder.setUploadDocument(bvVarB.ab());
                int i4 = f10665b + 21;
                f10667e = i4 % 128;
                int i5 = i4 % 2;
            } else {
                builder.setDownloadDocument(bvVarB.ag());
                builder.setUploadDocument(bvVarB.ab());
                throw null;
            }
        }
        return builder.build();
    }

    private static IdInfo l(br brVar) {
        int i2 = 2 % 2;
        IdInfo.Builder builder = new IdInfo.Builder();
        bv bvVarB = brVar.b();
        if (bvVarB != null) {
            builder.setEditableOcr(bvVarB.s());
            if (bvVarB.l() == m.f9720c) {
                int i3 = f10667e + 113;
                f10665b = i3 % 128;
                if (i3 % 2 != 0) {
                    builder.setIdCategory(IdCategory.SECOND);
                    int i4 = f10665b + 125;
                    f10667e = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    builder.setIdCategory(IdCategory.SECOND);
                    throw null;
                }
            }
        }
        return builder.build();
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        br brVar = (br) objArr[0];
        int i2 = 2 % 2;
        GovernmentValidation.Builder builder = new GovernmentValidation.Builder();
        bv bvVarB = brVar.b();
        if (bvVarB != null) {
            int i3 = f10665b + 109;
            f10667e = i3 % 128;
            if (i3 % 2 == 0) {
                builder.setSkipAnimation(bvVarB.ah());
            } else {
                builder.setSkipAnimation(bvVarB.ah());
                throw null;
            }
        }
        GovernmentValidation governmentValidationBuild = builder.build();
        int i4 = f10665b + 89;
        f10667e = i4 % 128;
        int i5 = i4 % 2;
        return governmentValidationBuild;
    }

    private static EKYB s(br brVar) {
        int i2 = 2 % 2;
        EKYB.Builder builder = new EKYB.Builder();
        bv bvVarB = brVar.b();
        if (bvVarB != null) {
            int i3 = f10665b + 53;
            f10667e = i3 % 128;
            if (i3 % 2 != 0) {
                builder.setShowAddress(((Boolean) bv.b(new Object[]{bvVarB}, -267659794, c.c(), c.c(), c.c(), 267659794, c.c())).booleanValue());
                builder.setShowBusinessName(bvVarB.L());
                builder.setShowTaxId(bvVarB.S());
                int i4 = 2 / 0;
            } else {
                builder.setShowAddress(((Boolean) bv.b(new Object[]{bvVarB}, -267659794, c.c(), c.c(), c.c(), 267659794, c.c())).booleanValue());
                builder.setShowBusinessName(bvVarB.L());
                builder.setShowTaxId(bvVarB.S());
            }
        }
        EKYB ekybBuild = builder.build();
        int i5 = f10665b + 45;
        f10667e = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return ekybBuild;
    }

    private static EKYC p(br brVar) {
        int i2 = 2 % 2;
        EKYC.Builder builder = new EKYC.Builder();
        bv bvVarB = brVar.b();
        if (bvVarB != null) {
            int i3 = f10667e + 97;
            f10665b = i3 % 128;
            int i4 = i3 % 2;
            builder.setVerifyName(bvVarB.Q());
            builder.setNameSource(bvVarB.O());
            builder.setVerifyEmail(bvVarB.P());
            builder.setVerifyAddress(bvVarB.R());
            builder.setAddressSource(bvVarB.X());
            builder.setVerifyPhone(bvVarB.V());
            builder.setVerifyTaxId(bvVarB.T());
            builder.setVerifyDateOfBirth(bvVarB.W());
            builder.setDateOfBirthSource((EKYC.DataInputSource) bv.b(new Object[]{bvVarB}, -613675420, c.c(), c.c(), c.c(), 613675421, c.c()));
            builder.setVerifyNationality(((Boolean) bv.b(new Object[]{bvVarB}, -1589532798, c.c(), c.c(), c.c(), 1589532809, c.c())).booleanValue());
        }
        EKYC ekycBuild = builder.build();
        int i5 = f10665b + 41;
        f10667e = i5 % 128;
        int i6 = i5 % 2;
        return ekycBuild;
    }

    private static VideoSelfie r(br brVar) {
        int i2 = 2 % 2;
        VideoSelfie.Builder builder = new VideoSelfie.Builder();
        bv bvVarB = brVar.b();
        if (bvVarB != null) {
            int i3 = f10667e + 89;
            f10665b = i3 % 128;
            int i4 = i3 % 2;
            builder.setShowTutorials(bvVarB.z());
            builder.setLivenessEnabled(bvVarB.A());
            builder.setIdScanEnabled(((Boolean) bv.b(new Object[]{bvVarB}, 783691070, c.c(), c.c(), c.c(), -783691063, c.c())).booleanValue());
            builder.setDocumentScanEnabled(bvVarB.I());
            builder.setVoiceConsentEnabled(bvVarB.G());
            builder.setFrontIdComparisonEnabled(bvVarB.E());
            builder.setFrontIdOcrComparisonEnabled(bvVarB.M());
            builder.setBackIdComparisonEnabled(bvVarB.J());
            builder.setBackIdOcrComparisonEnabled(((Boolean) bv.b(new Object[]{bvVarB}, 731527212, c.c(), c.c(), c.c(), -731527206, c.c())).booleanValue());
            if (((Integer) bv.b(new Object[]{bvVarB}, -1872686104, c.c(), c.c(), c.c(), 1872686106, c.c())).intValue() > 0) {
                int i5 = f10667e + 21;
                f10665b = i5 % 128;
                int i6 = i5 % 2;
                builder.setRandomQuestionsEnabled(true);
                builder.setRandomQuestionsCount(((Integer) bv.b(new Object[]{bvVarB}, -1872686104, c.c(), c.c(), c.c(), 1872686106, c.c())).intValue());
                int i7 = f10667e + 51;
                f10665b = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 2 / 5;
                }
            }
            if (((Boolean) bv.b(new Object[]{bvVarB}, 1503985793, c.c(), c.c(), c.c(), -1503985781, c.c())).booleanValue()) {
                builder.setSelfieMode(VideoSelfie.SelfieMode.FACE_MATCH);
            }
        }
        return builder.build();
    }

    private static DynamicForms t(br brVar) {
        int i2;
        int i3 = 2 % 2;
        DynamicForms.Builder builder = new DynamicForms.Builder();
        bv bvVarB = brVar.b();
        if (bvVarB != null) {
            builder.addScreens(bvVarB.af());
            i2 = f10665b + 1;
        } else {
            i2 = f10665b + 41;
        }
        f10667e = i2 % 128;
        int i4 = i2 % 2;
        return builder.build();
    }

    static {
        new b();
        int i2 = f10664a + 79;
        f10666c = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static GovernmentValidation m(br brVar) {
        Object[] objArr = {brVar};
        return (GovernmentValidation) d(IncodeWelcome.cm.d(), -311103684, IncodeWelcome.cm.d(), 311103684, objArr, IncodeWelcome.cm.d(), IncodeWelcome.cm.d());
    }

    private static FaceAuthentication k(br brVar) {
        Object[] objArr = {brVar};
        return (FaceAuthentication) d(IncodeWelcome.cm.d(), -221081187, IncodeWelcome.cm.d(), 221081190, objArr, IncodeWelcome.cm.d(), IncodeWelcome.cm.d());
    }

    private static IdScan.IdType d(boolean z2, boolean z3, boolean z4) {
        Object[] objArr = {Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4)};
        return (IdScan.IdType) d(IncodeWelcome.cm.d(), -1344010452, IncodeWelcome.cm.d(), 1344010453, objArr, IncodeWelcome.cm.d(), IncodeWelcome.cm.d());
    }

    private static IdScan f(br brVar) {
        Object[] objArr = {brVar};
        return (IdScan) d(IncodeWelcome.cm.d(), -1559282411, IncodeWelcome.cm.d(), 1559282413, objArr, IncodeWelcome.cm.d(), IncodeWelcome.cm.d());
    }
}
