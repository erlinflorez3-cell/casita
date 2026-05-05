package com.incode.welcome_sdk.data.a;

import com.incode.welcome_sdk.FlowConfig;
import com.incode.welcome_sdk.IdCategory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.commons.utils.h;
import com.incode.welcome_sdk.data.local.db.c.a.a;
import com.incode.welcome_sdk.data.remote.beans.ap;
import com.incode.welcome_sdk.data.remote.beans.p;
import com.incode.welcome_sdk.data.remote.beans.q;
import com.incode.welcome_sdk.modules.AES;
import com.incode.welcome_sdk.modules.CombinedConsent;
import com.incode.welcome_sdk.modules.DocumentScan;
import com.incode.welcome_sdk.modules.DynamicForms;
import com.incode.welcome_sdk.modules.EKYB;
import com.incode.welcome_sdk.modules.EKYC;
import com.incode.welcome_sdk.modules.Email;
import com.incode.welcome_sdk.modules.FaceAuthentication;
import com.incode.welcome_sdk.modules.FaceMatch;
import com.incode.welcome_sdk.modules.IdInfo;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.Intro;
import com.incode.welcome_sdk.modules.IntroChecks;
import com.incode.welcome_sdk.modules.MachineLearningConsent;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.modules.NfcScan;
import com.incode.welcome_sdk.modules.Phone;
import com.incode.welcome_sdk.modules.ProcessId;
import com.incode.welcome_sdk.modules.QES;
import com.incode.welcome_sdk.modules.Signature;
import com.incode.welcome_sdk.modules.UserConsent;
import com.incode.welcome_sdk.modules.VideoSelfie;
import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt;
import com.incode.welcome_sdk.ui.name.NamePresenter;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f7591b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f7592c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<p> f7593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FlowConfig.Builder f7594e;

    public static /* synthetic */ Object b(int i2, int i3, int i4, int i5, Object[] objArr, int i6, int i7) {
        Object next;
        q qVarE;
        Object next2;
        int i8 = ~i5;
        int i9 = ~i4;
        int i10 = (~(i8 | i9)) | i3;
        int i11 = i9 | i3;
        int i12 = (~((~i3) | i5)) | (~i11);
        int i13 = (~(i4 | i8 | i3)) | (~(i11 | i5));
        int i14 = i3 + i5 + i7 + (528639218 * i2) + ((-532493036) * i6);
        int i15 = i14 * i14;
        int i16 = ((i3 * 873666089) - 1460666368) + (873666089 * i5) + ((-875965520) * i10) + (437982760 * i12) + ((-437982760) * i13) + (435683328 * i7) + (1819279360 * i2) + ((-1621098496) * i6) + (586088448 * i15);
        int i17 = (i3 * (-1573143961)) + 2078511484 + (i5 * (-1573143961)) + (i10 * 1872) + (i12 * (-936)) + (i13 * 936) + (i7 * (-1573143025)) + (i2 * 123045422) + (i6 * (-1548035028)) + (i15 * 1845559296);
        switch (i16 + (i17 * i17 * 1848705024)) {
            case 1:
                d dVar = (d) objArr[0];
                int i18 = 2 % 2;
                if (((Boolean) b(IdCaptureModuleScreenKt.d.a(), 1688686818, IdCaptureModuleScreenKt.d.a(), -1688686815, new Object[]{dVar, Modules.NAME_CAPTURE}, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a())).booleanValue()) {
                    int i19 = f7592c + 79;
                    f7591b = i19 % 128;
                    int i20 = i19 % 2;
                    dVar.f7594e.addName();
                }
                int i21 = f7591b + 33;
                f7592c = i21 % 128;
                int i22 = i21 % 2;
                return dVar;
            case 2:
                d dVar2 = (d) objArr[0];
                int i23 = 2 % 2;
                Iterator<T> it = dVar2.f7593d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        int i24 = f7592c + 15;
                        f7591b = i24 % 128;
                        int i25 = i24 % 2;
                        next2 = it.next();
                        if (((p) next2).e() instanceof q.f) {
                        }
                    } else {
                        int i26 = f7591b + 125;
                        f7592c = i26 % 128;
                        int i27 = i26 % 2;
                        next2 = null;
                    }
                }
                p pVar = (p) next2;
                q qVarE2 = pVar != null ? pVar.e() : null;
                q.f fVar = (q.f) (qVarE2 instanceof q.f ? qVarE2 : null);
                if (fVar == null) {
                    return dVar2;
                }
                dVar2.f7594e.addEmail(new Email.Builder().setOtpVerificationEnabled(fVar.a()).build());
                return dVar2;
            case 3:
                return b(objArr);
            case 4:
                d dVar3 = (d) objArr[0];
                int i28 = 2 % 2;
                int i29 = f7592c + 99;
                f7591b = i29 % 128;
                int i30 = i29 % 2;
                Iterator<T> it2 = dVar3.f7593d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (((p) next).e() instanceof q.h) {
                            int i31 = f7591b + 93;
                            f7592c = i31 % 128;
                            int i32 = i31 % 2;
                        }
                    } else {
                        next = null;
                    }
                }
                p pVar2 = (p) next;
                if (pVar2 != null) {
                    qVarE = pVar2.e();
                } else {
                    int i33 = f7591b + 37;
                    f7592c = i33 % 128;
                    int i34 = i33 % 2;
                    qVarE = null;
                }
                q.h hVar = (q.h) (qVarE instanceof q.h ? qVarE : null);
                if (hVar != null) {
                    dVar3.f7594e.addDynamicForms(new DynamicForms.Builder().addScreens(hVar.e()).build());
                }
                int i35 = f7591b + 27;
                f7592c = i35 % 128;
                int i36 = i35 % 2;
                return dVar3;
            case 5:
                return d(objArr);
            case 6:
                return a(objArr);
            default:
                return e(objArr);
        }
    }

    private d(ap apVar, IncodeWelcome.InternalConfig internalConfig, FlowConfig.Builder builder) {
        Intrinsics.checkNotNullParameter(apVar, "");
        Intrinsics.checkNotNullParameter(internalConfig, "");
        Intrinsics.checkNotNullParameter(builder, "");
        this.f7594e = builder;
        List<p> listB = apVar.b();
        this.f7593d = listB;
        b(apVar);
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            String strC = ((p) it.next()).c();
            switch (strC.hashCode()) {
                case -2139331622:
                    strC.equals("ID_OCR");
                    break;
                case -2110024104:
                    if (strC.equals("INE_VALIDATION")) {
                        r();
                    }
                    break;
                case -2075336218:
                    if (strC.equals("GEOLOCATION")) {
                        o();
                    }
                    break;
                case -1981146813:
                    if (strC.equals("FACE_MATCH")) {
                        k();
                    }
                    break;
                case -1946896329:
                    if (strC.equals("USER_APPROVAL")) {
                        e();
                    }
                    break;
                case -1852691096:
                    if (strC.equals("SELFIE")) {
                        a(internalConfig);
                    }
                    break;
                case -1790572367:
                    if (strC.equals("NFC_SCAN")) {
                        y();
                    }
                    break;
                case -1788312115:
                    if (strC.equals("WATCHLIST")) {
                        f();
                    }
                    break;
                case -1750284680:
                    if (strC.equals("AUTHENTICATION")) {
                        e(internalConfig);
                    }
                    break;
                case -1614637553:
                    if (strC.equals("EXTERNAL_VERIFICATION")) {
                        n();
                    }
                    break;
                case -1558852035:
                    if (strC.equals("AE_SIGNATURE")) {
                        int iA = IdCaptureModuleScreenKt.d.a();
                        int iA2 = IdCaptureModuleScreenKt.d.a();
                    }
                    break;
                case -1413739032:
                    if (strC.equals("CURP_VALIDATION")) {
                        j();
                    }
                    break;
                case -731183520:
                    if (strC.equals("INCODE_WATCHLIST")) {
                        h();
                    }
                    break;
                case -434788200:
                    if (strC.equals("SIGNATURE")) {
                        C();
                    }
                    break;
                case -429709356:
                    if (strC.equals("ADDRESS")) {
                        c();
                    }
                    break;
                case -356403008:
                    if (strC.equals("COMBINED_CONSENT")) {
                        z();
                    }
                    break;
                case 78603:
                    if (strC.equals("OTP")) {
                        u();
                    }
                    break;
                case 2130479:
                    if (strC.equals("EKYB")) {
                        l();
                    }
                    break;
                case 66081660:
                    if (strC.equals("EMAIL")) {
                        int iA3 = IdCaptureModuleScreenKt.d.a();
                        int iA4 = IdCaptureModuleScreenKt.d.a();
                    }
                    break;
                case 69824076:
                    if (strC.equals("INTRO")) {
                        t();
                    }
                    break;
                case 76105038:
                    if (strC.equals("PHONE")) {
                        int iA5 = IdCaptureModuleScreenKt.d.a();
                        int iA6 = IdCaptureModuleScreenKt.d.a();
                    }
                    break;
                case 434822022:
                    if (strC.equals("USER_CONSENT")) {
                        B();
                    }
                    break;
                case 496825492:
                    if (strC.equals("SHOW_RESULTS")) {
                        A();
                    }
                    break;
                case 506471469:
                    if (strC.equals("QE_SIGNATURE")) {
                        a();
                    }
                    break;
                case 510078364:
                    if (strC.equals("TUTORIAL_ID")) {
                        int iA7 = IdCaptureModuleScreenKt.d.a();
                        int iA8 = IdCaptureModuleScreenKt.d.a();
                    }
                    break;
                case 571281391:
                    if (strC.equals("DYNAMIC_FORMS")) {
                        int iA9 = IdCaptureModuleScreenKt.d.a();
                        int iA10 = IdCaptureModuleScreenKt.d.a();
                    }
                    break;
                case 672777250:
                    if (strC.equals("ANTIFRAUD")) {
                        g();
                    }
                    break;
                case 1212756252:
                    if (strC.equals("CONFERENCE")) {
                        i();
                    }
                    break;
                case 1311218139:
                    if (strC.equals("QR_SCAN")) {
                        w();
                    }
                    break;
                case 1395945474:
                    if (strC.equals("DOCUMENT_CAPTURE")) {
                        v();
                    }
                    break;
                case 1839768703:
                    if (strC.equals("VIDEO_ONBOARDING")) {
                        D();
                    }
                    break;
                case 1853484378:
                    if (strC.equals("ML_CONSENT")) {
                        q();
                    }
                    break;
                case 1862644082:
                    if (strC.equals("NAME_CAPTURE")) {
                        int iA11 = IdCaptureModuleScreenKt.d.a();
                        int iA12 = IdCaptureModuleScreenKt.d.a();
                    }
                    break;
            }
        }
    }

    public /* synthetic */ d(ap apVar, IncodeWelcome.InternalConfig internalConfig) {
        this(apVar, internalConfig, new FlowConfig.Builder());
    }

    public final FlowConfig d() throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f7592c + 65;
        f7591b = i3 % 128;
        int i4 = i3 % 2;
        FlowConfig flowConfigBuild = this.f7594e.build();
        int i5 = f7592c + 29;
        f7591b = i5 % 128;
        int i6 = i5 % 2;
        return flowConfigBuild;
    }

    private void b(ap apVar) {
        int i2 = 2 % 2;
        int i3 = f7592c + 67;
        f7591b = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(apVar, "");
        this.f7594e.setAgeAssuranceUXEnabled(apVar.e());
        this.f7594e.configureScreenRecording(false, false);
        int i5 = f7592c + 17;
        f7591b = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final d c() {
        Object next;
        int i2 = 2 % 2;
        int i3 = f7592c + 55;
        f7591b = i3 % 128;
        q qVar = null;
        if (i3 % 2 == 0) {
            Iterator<T> it = this.f7593d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                int i4 = f7591b + 19;
                f7592c = i4 % 128;
                int i5 = i4 % 2;
                next = it.next();
                if (!(!(((p) next).e() instanceof q.c))) {
                    break;
                }
            }
            p pVar = (p) next;
            q qVarE = pVar != null ? pVar.e() : null;
            if (qVarE instanceof q.c) {
                qVar = qVarE;
            } else {
                int i6 = f7592c + 31;
                f7591b = i6 % 128;
                int i7 = i6 % 2;
            }
            if (((q.c) qVar) != null) {
                FlowConfig.Builder builder = this.f7594e;
                DocumentScan documentScanBuild = new DocumentScan.Builder().setShowTutorials(true).setDocumentType(DocumentType.ADDRESS_STATEMENT).build();
                Intrinsics.checkNotNullExpressionValue(documentScanBuild, "");
                builder.addDocumentScan(documentScanBuild);
            }
            return this;
        }
        this.f7593d.iterator();
        qVar.hashCode();
        throw null;
    }

    private static /* synthetic */ Object e(Object[] objArr) throws ModuleConfigurationException {
        Object next;
        q qVarE;
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        Iterator<T> it = dVar.f7593d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((p) next).e() instanceof q.a) {
                int i3 = f7592c + 43;
                f7591b = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 62 / 0;
                }
            }
        }
        p pVar = (p) next;
        if (pVar != null) {
            qVarE = pVar.e();
        } else {
            int i5 = f7592c + 69;
            f7591b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 3 / 2;
            }
            qVarE = null;
        }
        q.a aVar = (q.a) (qVarE instanceof q.a ? qVarE : null);
        if (aVar != null) {
            q.a aVar2 = aVar;
            dVar.f7594e.addAES(new AES.Builder().setUploadDocument(aVar2.c()).setDownloadDocument(aVar2.a()).build());
        }
        return dVar;
    }

    private final d a() {
        q qVar;
        Object next;
        int i2 = 2 % 2;
        int i3 = f7592c + 37;
        f7591b = i3 % 128;
        int i4 = i3 % 2;
        Iterator<T> it = this.f7593d.iterator();
        while (true) {
            qVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((p) next).e() instanceof q.v) {
                break;
            }
        }
        p pVar = (p) next;
        q qVarE = pVar != null ? pVar.e() : null;
        if (qVarE instanceof q.v) {
            qVar = qVarE;
        } else {
            int i5 = f7592c + 109;
            f7591b = i5 % 128;
            int i6 = i5 % 2;
        }
        q.v vVar = (q.v) qVar;
        if (vVar != null) {
            this.f7594e.addQES(new QES.Builder().setDownloadDocument(vVar.d()).build());
        } else {
            int i7 = f7591b + 91;
            f7592c = i7 % 128;
            int i8 = i7 % 2;
        }
        return this;
    }

    private final d e() {
        int i2 = 2 % 2;
        int i3 = f7592c + 23;
        f7591b = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 12 / 0;
        }
        return this;
    }

    private final d i() {
        q qVar;
        Object next;
        int i2 = 2 % 2;
        int i3 = f7592c + 125;
        f7591b = i3 % 128;
        int i4 = i3 % 2;
        if (((Boolean) b(IdCaptureModuleScreenKt.d.a(), 1688686818, IdCaptureModuleScreenKt.d.a(), -1688686815, new Object[]{this, Modules.CONFERENCE}, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a())).booleanValue()) {
            Iterator<T> it = this.f7593d.iterator();
            while (true) {
                qVar = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                int i5 = f7591b + 95;
                f7592c = i5 % 128;
                if (i5 % 2 == 0) {
                    boolean z2 = ((p) it.next()).e() instanceof q.x;
                    qVar.hashCode();
                    throw null;
                }
                next = it.next();
                if (((p) next).e() instanceof q.x) {
                    int i6 = f7592c + 67;
                    f7591b = i6 % 128;
                    int i7 = i6 % 2;
                    break;
                }
            }
            p pVar = (p) next;
            q qVarE = pVar != null ? pVar.e() : null;
            if (qVarE instanceof q.x) {
                qVar = qVarE;
            } else {
                int i8 = f7591b + 111;
                f7592c = i8 % 128;
                if (i8 % 2 == 0) {
                    throw null;
                }
            }
            q.x xVar = (q.x) qVar;
            if (xVar != null && xVar.b()) {
                if (!((Boolean) b(IdCaptureModuleScreenKt.d.a(), 1688686818, IdCaptureModuleScreenKt.d.a(), -1688686815, new Object[]{this, Modules.OTP}, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a())).booleanValue()) {
                    this.f7594e.addCaptcha();
                }
            }
            this.f7594e.addConference();
        }
        return this;
    }

    private final d j() {
        int i2 = 2 % 2;
        int i3 = f7592c + 111;
        f7591b = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this, Modules.CURP_VALIDATION};
            if (((Boolean) b(IdCaptureModuleScreenKt.d.a(), 1688686818, IdCaptureModuleScreenKt.d.a(), -1688686815, objArr, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a())).booleanValue()) {
                this.f7594e.addCurpValidation();
            }
            int i4 = f7591b + 75;
            f7592c = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }
        Object[] objArr2 = {this, Modules.CURP_VALIDATION};
        ((Boolean) b(IdCaptureModuleScreenKt.d.a(), 1688686818, IdCaptureModuleScreenKt.d.a(), -1688686815, objArr2, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a())).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final d h() {
        int i2 = 2 % 2;
        int i3 = f7592c + 71;
        f7591b = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this, Modules.INCODE_WATCHLIST};
        if (((Boolean) b(IdCaptureModuleScreenKt.d.a(), 1688686818, IdCaptureModuleScreenKt.d.a(), -1688686815, objArr, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a())).booleanValue()) {
            int i5 = f7591b + 123;
            f7592c = i5 % 128;
            int i6 = i5 % 2;
            g();
            this.f7594e.addCustomWatchlist();
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.incode.welcome_sdk.data.a.d f() {
        /*
            r10 = this;
            r2 = 2
            int r0 = r2 % r2
            int r0 = com.incode.welcome_sdk.data.a.d.f7591b
            int r1 = r0 + 63
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.a.d.f7592c = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L51
            r0 = r10
            com.incode.welcome_sdk.data.a.d r0 = (com.incode.welcome_sdk.data.a.d) r0
            com.incode.welcome_sdk.modules.Modules r0 = com.incode.welcome_sdk.modules.Modules.WATCHLIST
            java.lang.Object[] r7 = new java.lang.Object[]{r10, r0}
            int r5 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt.d.a()
            int r9 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt.d.a()
            int r3 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt.d.a()
            int r8 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt.d.a()
            r4 = 1688686818(0x64a750e2, float:2.4691476E22)
            r6 = -1688686815(0xffffffff9b58af21, float:-1.7923688E-22)
            java.lang.Object r0 = b(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 20
            int r0 = r0 / 0
            if (r1 == 0) goto L4d
        L3d:
            int r0 = com.incode.welcome_sdk.data.a.d.f7591b
            int r1 = r0 + 9
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.a.d.f7592c = r0
            int r1 = r1 % r2
            if (r1 == 0) goto L7d
            com.incode.welcome_sdk.FlowConfig$Builder r0 = r10.f7594e
            r0.addGlobalWatchlist()
        L4d:
            r0 = r10
            com.incode.welcome_sdk.data.a.d r0 = (com.incode.welcome_sdk.data.a.d) r0
            return r10
        L51:
            r0 = r10
            com.incode.welcome_sdk.data.a.d r0 = (com.incode.welcome_sdk.data.a.d) r0
            com.incode.welcome_sdk.modules.Modules r0 = com.incode.welcome_sdk.modules.Modules.WATCHLIST
            java.lang.Object[] r7 = new java.lang.Object[]{r10, r0}
            int r5 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt.d.a()
            int r9 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt.d.a()
            int r3 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt.d.a()
            int r8 = com.incode.welcome_sdk.ui.id_capture.view.IdCaptureModuleScreenKt.d.a()
            r4 = 1688686818(0x64a750e2, float:2.4691476E22)
            r6 = -1688686815(0xffffffff9b58af21, float:-1.7923688E-22)
            java.lang.Object r0 = b(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4d
            goto L3d
        L7d:
            com.incode.welcome_sdk.FlowConfig$Builder r0 = r10.f7594e
            r0.addGlobalWatchlist()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.a.d.f():com.incode.welcome_sdk.data.a.d");
    }

    private final d g() {
        int i2 = 2 % 2;
        int i3 = f7592c + 43;
        f7591b = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this, Modules.ANTIFRAUD};
        if (((Boolean) b(IdCaptureModuleScreenKt.d.a(), 1688686818, IdCaptureModuleScreenKt.d.a(), -1688686815, objArr, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a())).booleanValue() && !this.f7594e.contains(Modules.ANTIFRAUD)) {
            this.f7594e.addAntifraud();
            int i5 = f7592c + 25;
            f7591b = i5 % 128;
            int i6 = i5 % 2;
        }
        return this;
    }

    private final d l() {
        Iterator it;
        q qVar;
        Object next;
        q qVarE;
        int i2 = 2 % 2;
        int i3 = f7591b + 9;
        f7592c = i3 % 128;
        if (i3 % 2 == 0) {
            it = this.f7593d.iterator();
            int i4 = 16 / 0;
        } else {
            it = this.f7593d.iterator();
        }
        while (true) {
            qVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((p) next).e() instanceof q.i) {
                int i5 = f7591b + 81;
                f7592c = i5 % 128;
                int i6 = i5 % 2;
                break;
            }
        }
        p pVar = (p) next;
        if (pVar != null) {
            int i7 = f7591b + 87;
            f7592c = i7 % 128;
            int i8 = i7 % 2;
            qVarE = pVar.e();
        } else {
            qVarE = null;
        }
        if (qVarE instanceof q.i) {
            qVar = qVarE;
        } else {
            int i9 = f7592c + 75;
            f7591b = i9 % 128;
            int i10 = i9 % 2;
        }
        q.i iVar = (q.i) qVar;
        if (iVar != null) {
            q.i iVar2 = iVar;
            this.f7594e.addEKYB(new EKYB.Builder().setShowBusinessName(iVar2.a()).setShowAddress(iVar2.b()).setShowTaxId(iVar2.c()).build());
        }
        int i11 = f7592c + 33;
        f7591b = i11 % 128;
        int i12 = i11 % 2;
        return this;
    }

    private final d n() {
        q qVar;
        Object next;
        q qVarE;
        int i2 = 2 % 2;
        Iterator<T> it = this.f7593d.iterator();
        int i3 = f7592c + 105;
        f7591b = i3 % 128;
        int i4 = i3 % 2;
        while (true) {
            qVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(!(((p) next).e() instanceof q.j))) {
                break;
            }
        }
        p pVar = (p) next;
        if (pVar != null) {
            qVarE = pVar.e();
            int i5 = f7592c + 51;
            f7591b = i5 % 128;
            int i6 = i5 % 2;
        } else {
            qVarE = null;
        }
        if (qVarE instanceof q.j) {
            qVar = qVarE;
        } else {
            int i7 = f7591b + 57;
            f7592c = i7 % 128;
            int i8 = i7 % 2;
        }
        q.j jVar = (q.j) qVar;
        if (jVar != null) {
            q.j jVar2 = jVar;
            this.f7594e.addEKYC(new EKYC.Builder().setVerifyName(jVar2.b()).setNameSource(jVar2.a()).setVerifyEmail(jVar2.e()).setVerifyAddress(jVar2.c()).setAddressSource(jVar2.d()).setVerifyPhone(jVar2.i()).setVerifyTaxId(((Boolean) q.j.a(NamePresenter.b.a(), NamePresenter.b.a(), new Object[]{jVar2}, -446517511, NamePresenter.b.a(), NamePresenter.b.a(), 446517511)).booleanValue()).setVerifyDateOfBirth(jVar2.g()).setDateOfBirthSource((EKYC.DataInputSource) q.j.a(NamePresenter.b.a(), NamePresenter.b.a(), new Object[]{jVar2}, 2024871166, NamePresenter.b.a(), NamePresenter.b.a(), -2024871165)).setVerifyNationality(jVar2.f()).build());
        }
        return this;
    }

    private final d k() {
        Object obj;
        Object next;
        q qVarE;
        Object next2;
        q qVarE2;
        int i2 = 2 % 2;
        int i3 = f7591b + 3;
        f7592c = i3 % 128;
        int i4 = i3 % 2;
        Iterator<T> it = this.f7593d.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((p) next).e() instanceof q.k) {
                break;
            }
        }
        p pVar = (p) next;
        if (pVar != null) {
            int i5 = f7592c + 55;
            f7591b = i5 % 128;
            if (i5 % 2 != 0) {
                pVar.e();
                obj.hashCode();
                throw null;
            }
            qVarE = pVar.e();
        } else {
            qVarE = null;
        }
        if (!(qVarE instanceof q.k)) {
            qVarE = null;
        }
        q.k kVar = (q.k) qVarE;
        if (kVar != null) {
            q.k kVar2 = kVar;
            FaceMatch.Builder idCategory = new FaceMatch.Builder().setShowUserExists(true).setMatchType(kVar2.b()).setFaceMatchAnimationEnabled(kVar2.e()).setIdCategory(IdCategory.FIRST);
            Iterator<T> it2 = this.f7593d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((p) next2).e() instanceof q.t) {
                    break;
                }
            }
            p pVar2 = (p) next2;
            if (pVar2 != null) {
                int i6 = f7592c + 117;
                f7591b = i6 % 128;
                if (i6 % 2 != 0) {
                    pVar2.e();
                    throw null;
                }
                qVarE2 = pVar2.e();
            } else {
                qVarE2 = null;
            }
            if (!(qVarE2 instanceof q.t)) {
                qVarE2 = null;
            }
            q.t tVar = (q.t) qVarE2;
            if (tVar != null && tVar.d()) {
                int i7 = f7591b + 123;
                f7592c = i7 % 128;
                if (i7 % 2 == 0) {
                    idCategory.addIdCategory(IdCategory.SECOND);
                    throw null;
                }
                idCategory.addIdCategory(IdCategory.SECOND);
            }
            this.f7594e.addFaceMatch(idCategory.build());
        }
        int i8 = f7591b + 49;
        f7592c = i8 % 128;
        if (i8 % 2 != 0) {
            return this;
        }
        throw null;
    }

    private final d o() {
        int i2 = 2 % 2;
        int i3 = f7592c + 9;
        f7591b = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this, Modules.GEOLOCATION};
        if (((Boolean) b(IdCaptureModuleScreenKt.d.a(), 1688686818, IdCaptureModuleScreenKt.d.a(), -1688686815, objArr, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a())).booleanValue()) {
            this.f7594e.addGeolocation();
            int i5 = f7592c + 117;
            f7591b = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 5 % 5;
            }
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[PHI: r2
  0x0078: PHI (r2v6 com.incode.welcome_sdk.data.remote.beans.q$t) = (r2v5 com.incode.welcome_sdk.data.remote.beans.q$t), (r2v7 com.incode.welcome_sdk.data.remote.beans.q$t) binds: [B:20:0x0075, B:17:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object a(java.lang.Object[] r7) {
        /*
            r6 = 0
            r3 = r7[r6]
            com.incode.welcome_sdk.data.a.d r3 = (com.incode.welcome_sdk.data.a.d) r3
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.data.a.d.f7592c
            int r1 = r0 + 109
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.a.d.f7591b = r0
            int r1 = r1 % r5
            r0 = r3
            com.incode.welcome_sdk.data.a.d r0 = (com.incode.welcome_sdk.data.a.d) r0
            java.util.List<com.incode.welcome_sdk.data.remote.beans.p> r0 = r3.f7593d
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
        L1c:
            boolean r0 = r1.hasNext()
            r2 = 0
            if (r0 == 0) goto L82
            java.lang.Object r4 = r1.next()
            r0 = r4
            com.incode.welcome_sdk.data.remote.beans.p r0 = (com.incode.welcome_sdk.data.remote.beans.p) r0
            com.incode.welcome_sdk.data.remote.beans.q r0 = r0.e()
            boolean r0 = r0 instanceof com.incode.welcome_sdk.data.remote.beans.q.t
            if (r0 == 0) goto L1c
        L32:
            com.incode.welcome_sdk.data.remote.beans.p r4 = (com.incode.welcome_sdk.data.remote.beans.p) r4
            if (r4 == 0) goto L80
            int r0 = com.incode.welcome_sdk.data.a.d.f7592c
            int r1 = r0 + 25
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.a.d.f7591b = r0
            int r1 = r1 % r5
            com.incode.welcome_sdk.data.remote.beans.q r1 = r4.e()
        L43:
            boolean r0 = r1 instanceof com.incode.welcome_sdk.data.remote.beans.q.t
            if (r0 != 0) goto L7e
        L47:
            com.incode.welcome_sdk.data.remote.beans.q$t r2 = (com.incode.welcome_sdk.data.remote.beans.q.t) r2
            com.incode.welcome_sdk.data.remote.beans.q r2 = (com.incode.welcome_sdk.data.remote.beans.q) r2
            if (r2 == 0) goto L69
            int r0 = com.incode.welcome_sdk.data.a.d.f7591b
            int r1 = r0 + 103
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.a.d.f7592c = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L6a
            com.incode.welcome_sdk.data.remote.beans.q$t r2 = (com.incode.welcome_sdk.data.remote.beans.q.t) r2
            com.incode.welcome_sdk.IdCategory r0 = com.incode.welcome_sdk.IdCategory.FIRST
            r3.c(r2, r0)
            boolean r1 = r2.d()
            r0 = 29
            int r0 = r0 / r6
            r0 = 1
            if (r1 == r0) goto L78
        L69:
            return r3
        L6a:
            com.incode.welcome_sdk.data.remote.beans.q$t r2 = (com.incode.welcome_sdk.data.remote.beans.q.t) r2
            com.incode.welcome_sdk.IdCategory r0 = com.incode.welcome_sdk.IdCategory.FIRST
            r3.c(r2, r0)
            boolean r0 = r2.d()
            if (r0 != 0) goto L78
            goto L69
        L78:
            com.incode.welcome_sdk.IdCategory r0 = com.incode.welcome_sdk.IdCategory.SECOND
            r3.c(r2, r0)
            goto L69
        L7e:
            r2 = r1
            goto L47
        L80:
            r1 = r2
            goto L43
        L82:
            r4 = r2
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.a.d.a(java.lang.Object[]):java.lang.Object");
    }

    private final void c(q.t tVar, IdCategory idCategory) {
        Object next;
        int i2 = 2 % 2;
        FlowConfig.Builder builder = this.f7594e;
        IdScan.Builder captureAttempts = new IdScan.Builder().setStreamFramesEnabled(tVar.g()).setShowIdTutorials(tVar.a()).setShowIdTypeChooser(tVar.i()).setIdType(tVar.f()).setIdCategory(idCategory).setAutoCaptureTimeout(tVar.c()).setAutoCaptureNoIdTimeout(tVar.e()).setCaptureAttempts(((Integer) q.t.e(1071022772, IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), new Object[]{tVar}, -1071022771, IncodeWelcome.cm.d(), IncodeWelcome.cm.d())).intValue());
        if (tVar.j()) {
            captureAttempts.setScanStep(IdScan.ScanStep.FRONT);
            int i3 = f7592c + 51;
            f7591b = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 / 2;
            }
        }
        if (((Boolean) q.t.e(-1775562723, IncodeWelcome.cm.d(), IncodeWelcome.cm.d(), new Object[]{tVar}, 1775562723, IncodeWelcome.cm.d(), IncodeWelcome.cm.d())).booleanValue()) {
            captureAttempts.setScanStep(IdScan.ScanStep.BACK);
        }
        builder.addID(captureAttempts.build()).addProcessId(new ProcessId.Builder().setIdCategory(idCategory).build());
        Iterator<T> it = this.f7593d.iterator();
        while (true) {
            if (!it.hasNext()) {
                int i5 = f7592c + 63;
                f7591b = i5 % 128;
                int i6 = i5 % 2;
                next = null;
                break;
            }
            int i7 = f7592c + 35;
            f7591b = i7 % 128;
            if (i7 % 2 != 0) {
                next = it.next();
                int i8 = 52 / 0;
                if (((p) next).e() instanceof q.C0237q) {
                    break;
                }
            } else {
                next = it.next();
                if (((p) next).e() instanceof q.C0237q) {
                    break;
                }
            }
        }
        p pVar = (p) next;
        q qVarE = pVar != null ? pVar.e() : null;
        q.C0237q c0237q = (q.C0237q) (qVarE instanceof q.C0237q ? qVarE : null);
        if (c0237q != null) {
            this.f7594e.addIdInfo(new IdInfo.Builder().setEditableOcr(c0237q.b()).setIdCategory(idCategory).build());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        r1 = com.incode.welcome_sdk.data.a.d.f7592c + 53;
        com.incode.welcome_sdk.data.a.d.f7591b = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if ((r1 % 2) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        r1 = r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if ((r1 instanceof com.incode.welcome_sdk.data.remote.beans.q.n) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        r1 = com.incode.welcome_sdk.data.a.d.f7592c + 47;
        com.incode.welcome_sdk.data.a.d.f7591b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        r3 = (com.incode.welcome_sdk.data.remote.beans.q.n) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (r3 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r6.f7594e.addGovernmentValidation(new com.incode.welcome_sdk.modules.GovernmentValidation.Builder().setSkipAnimation(r3.b()).build());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        r1 = com.incode.welcome_sdk.data.a.d.f7591b + 9;
        com.incode.welcome_sdk.data.a.d.f7592c = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
    
        r2.e();
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        r2 = (com.incode.welcome_sdk.data.remote.beans.p) r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.incode.welcome_sdk.data.a.d r() {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            r0 = r6
            com.incode.welcome_sdk.data.a.d r0 = (com.incode.welcome_sdk.data.a.d) r0
            java.util.List<com.incode.welcome_sdk.data.remote.beans.p> r0 = r6.f7593d
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r4 = r0.iterator()
            int r0 = com.incode.welcome_sdk.data.a.d.f7592c
            int r1 = r0 + 69
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.a.d.f7591b = r0
            int r1 = r1 % r5
        L17:
            boolean r0 = r4.hasNext()
            r3 = 0
            if (r0 == 0) goto L85
            java.lang.Object r2 = r4.next()
            r0 = r2
            com.incode.welcome_sdk.data.remote.beans.p r0 = (com.incode.welcome_sdk.data.remote.beans.p) r0
            com.incode.welcome_sdk.data.remote.beans.q r0 = r0.e()
            boolean r0 = r0 instanceof com.incode.welcome_sdk.data.remote.beans.q.n
            if (r0 == 0) goto L17
            int r0 = com.incode.welcome_sdk.data.a.d.f7592c
            int r1 = r0 + 33
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.a.d.f7591b = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L8e
        L38:
            com.incode.welcome_sdk.data.remote.beans.p r2 = (com.incode.welcome_sdk.data.remote.beans.p) r2
            if (r2 == 0) goto L83
            int r0 = com.incode.welcome_sdk.data.a.d.f7592c
            int r1 = r0 + 53
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.a.d.f7591b = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L87
            com.incode.welcome_sdk.data.remote.beans.q r1 = r2.e()
        L4b:
            boolean r0 = r1 instanceof com.incode.welcome_sdk.data.remote.beans.q.n
            if (r0 != 0) goto L81
            int r0 = com.incode.welcome_sdk.data.a.d.f7592c
            int r1 = r0 + 47
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.a.d.f7591b = r0
            int r1 = r1 % r5
        L58:
            com.incode.welcome_sdk.data.remote.beans.q$n r3 = (com.incode.welcome_sdk.data.remote.beans.q.n) r3
            com.incode.welcome_sdk.data.remote.beans.q r3 = (com.incode.welcome_sdk.data.remote.beans.q) r3
            if (r3 == 0) goto L77
            com.incode.welcome_sdk.data.remote.beans.q$n r3 = (com.incode.welcome_sdk.data.remote.beans.q.n) r3
            com.incode.welcome_sdk.FlowConfig$Builder r2 = r6.f7594e
            com.incode.welcome_sdk.modules.GovernmentValidation$Builder r1 = new com.incode.welcome_sdk.modules.GovernmentValidation$Builder
            r1.<init>()
            boolean r0 = r3.b()
            com.incode.welcome_sdk.modules.GovernmentValidation$Builder r0 = r1.setSkipAnimation(r0)
            com.incode.welcome_sdk.modules.GovernmentValidation r0 = r0.build()
            r2.addGovernmentValidation(r0)
        L76:
            return r6
        L77:
            int r0 = com.incode.welcome_sdk.data.a.d.f7591b
            int r1 = r0 + 9
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.a.d.f7592c = r0
            int r1 = r1 % r5
            goto L76
        L81:
            r3 = r1
            goto L58
        L83:
            r1 = r3
            goto L4b
        L85:
            r2 = r3
            goto L38
        L87:
            r2.e()
            r3.hashCode()
            throw r3
        L8e:
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.a.d.r():com.incode.welcome_sdk.data.a.d");
    }

    private final d t() {
        int i2 = 2 % 2;
        int i3 = f7592c + 21;
        f7591b = i3 % 128;
        int i4 = i3 % 2;
        List<IntroChecks> listF = F();
        if (!listF.isEmpty()) {
            int i5 = f7592c + 3;
            int i6 = i5 % 128;
            f7591b = i6;
            z = !(i5 % 2 != 0);
            int i7 = i6 + 55;
            f7592c = i7 % 128;
            int i8 = i7 % 2;
        }
        if (z) {
            FlowConfig.Builder builder = this.f7594e;
            Intro introBuild = new Intro.Builder().setIntroChecks(listF).setAllowContinueWithoutConsent(true).build();
            Intrinsics.checkNotNullExpressionValue(introBuild, "");
            builder.addIntro(introBuild);
        }
        return this;
    }

    private final d q() {
        q qVar;
        Object next;
        int i2;
        int i3 = 2 % 2;
        Iterator<T> it = this.f7593d.iterator();
        while (true) {
            qVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((p) next).e() instanceof q.r) {
                int i4 = f7591b + 5;
                f7592c = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 0;
                }
            }
        }
        p pVar = (p) next;
        q qVarE = pVar != null ? pVar.e() : null;
        if (qVarE instanceof q.r) {
            qVar = qVarE;
        } else {
            int i6 = f7591b + 79;
            f7592c = i6 % 128;
            int i7 = i6 % 2;
        }
        q.r rVar = (q.r) qVar;
        if (rVar != null) {
            this.f7594e.addMachineLearningConsent(new MachineLearningConsent.Builder().setConsentType(rVar.d()).build());
            i2 = f7592c + 29;
            f7591b = i2 % 128;
        } else {
            i2 = f7591b + 41;
            f7592c = i2 % 128;
        }
        int i8 = i2 % 2;
        return this;
    }

    private final d y() {
        Object next;
        int i2 = 2 % 2;
        int i3 = f7592c + 11;
        f7591b = i3 % 128;
        q qVar = null;
        if (i3 % 2 != 0) {
            this.f7593d.iterator();
            throw null;
        }
        Iterator<T> it = this.f7593d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((p) next).e() instanceof q.p) {
                break;
            }
        }
        p pVar = (p) next;
        q qVarE = pVar != null ? pVar.e() : null;
        if (!(qVarE instanceof q.p)) {
            int i4 = f7591b + 15;
            f7592c = i4 % 128;
            int i5 = i4 % 2;
        } else {
            qVar = qVarE;
        }
        q.p pVar2 = (q.p) qVar;
        if (pVar2 != null) {
            q.p pVar3 = pVar2;
            this.f7594e.addNfcScan(new NfcScan.Builder().setShowNfcSymbolConfirmationScreen(pVar3.d()).setProcessNfcData(pVar3.b()).setShowInitialDataConfirmationScreen(pVar3.c()).build());
        }
        return this;
    }

    private final d v() {
        q qVar;
        Object next;
        q qVarE;
        DocumentType documentType;
        int i2 = 2 % 2;
        Iterator<T> it = this.f7593d.iterator();
        while (true) {
            qVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i3 = f7592c + 1;
            f7591b = i3 % 128;
            int i4 = i3 % 2;
            next = it.next();
            if (((p) next).e() instanceof q.g) {
                break;
            }
        }
        p pVar = (p) next;
        if (pVar != null) {
            int i5 = f7591b + 29;
            f7592c = i5 % 128;
            int i6 = i5 % 2;
            qVarE = pVar.e();
        } else {
            qVarE = null;
        }
        if (qVarE instanceof q.g) {
            qVar = qVarE;
        } else {
            int i7 = f7591b + 47;
            f7592c = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 40 / 0;
            }
        }
        if (((q.g) qVar) != null) {
            if (!(!Intrinsics.areEqual(r2.e(), "processPoaOcr"))) {
                documentType = DocumentType.ADDRESS_STATEMENT;
                int i9 = f7591b + 59;
                f7592c = i9 % 128;
                int i10 = i9 % 2;
            } else {
                documentType = DocumentType.OTHER_DOCUMENT_1;
            }
            FlowConfig.Builder builder = this.f7594e;
            DocumentScan documentScanBuild = new DocumentScan.Builder().setShowTutorials(true).setDocumentType(documentType).build();
            Intrinsics.checkNotNullExpressionValue(documentScanBuild, "");
            builder.addDocumentScan(documentScanBuild);
            int i11 = f7591b + 63;
            f7592c = i11 % 128;
            int i12 = i11 % 2;
        }
        return this;
    }

    private final d u() {
        int i2 = 2 % 2;
        int i3 = f7592c + 63;
        f7591b = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {this, Modules.OTP};
        if (((Boolean) b(IdCaptureModuleScreenKt.d.a(), 1688686818, IdCaptureModuleScreenKt.d.a(), -1688686815, objArr, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a())).booleanValue()) {
            this.f7594e.addCaptcha();
            int i5 = f7592c + 109;
            f7591b = i5 % 128;
            int i6 = i5 % 2;
        }
        return this;
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        Object obj;
        Object next;
        q qVarE;
        d dVar = (d) objArr[0];
        int i2 = 2 % 2;
        Iterator<T> it = dVar.f7593d.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                int i3 = f7591b + 75;
                f7592c = i3 % 128;
                int i4 = i3 % 2;
                next = null;
                break;
            }
            int i5 = f7591b + 33;
            f7592c = i5 % 128;
            int i6 = i5 % 2;
            next = it.next();
            if (((p) next).e() instanceof q.y) {
                break;
            }
        }
        p pVar = (p) next;
        if (pVar != null) {
            int i7 = f7592c + 77;
            f7591b = i7 % 128;
            if (i7 % 2 != 0) {
                pVar.e();
                throw null;
            }
            qVarE = pVar.e();
        } else {
            qVarE = null;
        }
        if (!(qVarE instanceof q.y)) {
            qVarE = null;
        }
        q.y yVar = (q.y) qVarE;
        if (yVar != null) {
            dVar.f7594e.addPhone(new Phone.Builder().setOtpVerificationEnabled(yVar.a()).setDefaultRegionPrefix(-1).build());
        }
        int i8 = f7592c + 77;
        f7591b = i8 % 128;
        if (i8 % 2 == 0) {
            return dVar;
        }
        obj.hashCode();
        throw null;
    }

    private final d w() {
        int i2 = 2 % 2;
        Object[] objArr = {this, Modules.QR_SCAN};
        if (((Boolean) b(IdCaptureModuleScreenKt.d.a(), 1688686818, IdCaptureModuleScreenKt.d.a(), -1688686815, objArr, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a())).booleanValue()) {
            int i3 = f7592c + 121;
            f7591b = i3 % 128;
            int i4 = i3 % 2;
            this.f7594e.addQRScan();
        }
        int i5 = f7592c + 125;
        f7591b = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    private final d A() {
        int i2 = 2 % 2;
        int i3 = f7592c + 89;
        f7591b = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr = {this, Modules.SHOW_RESULTS};
            if (((Boolean) b(IdCaptureModuleScreenKt.d.a(), 1688686818, IdCaptureModuleScreenKt.d.a(), -1688686815, objArr, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a())).booleanValue()) {
                this.f7594e.addResults();
                int i4 = f7591b + 81;
                f7592c = i4 % 128;
                int i5 = i4 % 2;
            }
            return this;
        }
        Object[] objArr2 = {this, Modules.SHOW_RESULTS};
        ((Boolean) b(IdCaptureModuleScreenKt.d.a(), 1688686818, IdCaptureModuleScreenKt.d.a(), -1688686815, objArr2, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a())).booleanValue();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        if (r2 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        r0 = r2.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if ((r0 instanceof com.incode.welcome_sdk.data.remote.beans.q.w) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        r0 = (com.incode.welcome_sdk.data.remote.beans.q.w) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        r0 = r0;
        r7 = com.incode.welcome_sdk.commons.utils.h.a();
        r11 = com.incode.welcome_sdk.commons.utils.h.a();
        r3 = ((java.lang.Boolean) com.incode.welcome_sdk.data.remote.beans.q.w.d(r7, com.incode.welcome_sdk.commons.utils.h.a(), 1223284828, com.incode.welcome_sdk.commons.utils.h.a(), r11, new java.lang.Object[]{r0}, -1223284827)).booleanValue();
        r15.setSelfieDeepsightLiveness(r0.m());
        r2 = r14.f7594e;
        r4 = new com.incode.welcome_sdk.modules.SelfieScan.Builder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0088, code lost:
    
        if (r3 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        r3 = com.incode.welcome_sdk.data.a.d.f7591b + 91;
        com.incode.welcome_sdk.data.a.d.f7592c = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        if ((r3 % 2) == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        r1 = com.incode.welcome_sdk.CameraFacing.BACK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0097, code lost:
    
        r3 = r4.setCameraFacing(r1).setShowTutorials(r0.a()).setWaitForTutorials(true).setMode(com.incode.welcome_sdk.modules.SelfieScan.Mode.ENROLL).setLivenessDetectionMode(r15.getLivenessDetectionMode()).setBrightnessThreshold(r15.getBrightnessThreshold());
        r7 = com.incode.welcome_sdk.commons.utils.h.a();
        r11 = com.incode.welcome_sdk.commons.utils.h.a();
        r1 = r3.setEyesClosedCheckEnabled(((java.lang.Boolean) com.incode.welcome_sdk.data.remote.beans.q.w.d(r7, com.incode.welcome_sdk.commons.utils.h.a(), 1388377246, com.incode.welcome_sdk.commons.utils.h.a(), r11, new java.lang.Object[]{r0}, -1388377246)).booleanValue()).setHeadCoverCheckEnabled(r0.f()).setLensesCheckEnabled(r0.g()).setMaskCheckEnabled(r0.i()).setBrightnessCheckEnabled(r0.j()).setStreamFramesEnabled(r0.c()).setAutoCaptureTimeout(r0.e()).setCaptureAttempts(r0.d()).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "");
        r2.addSelfieScan(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x012a, code lost:
    
        r1 = com.incode.welcome_sdk.data.a.d.f7592c + 85;
        com.incode.welcome_sdk.data.a.d.f7591b = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0133, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0134, code lost:
    
        r1 = com.incode.welcome_sdk.CameraFacing.FRONT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0138, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x013e, code lost:
    
        r0 = com.incode.welcome_sdk.CameraFacing.BACK;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0140, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0041, code lost:
    
        r2 = (com.incode.welcome_sdk.data.remote.beans.p) r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.incode.welcome_sdk.data.a.d a(com.incode.welcome_sdk.IncodeWelcome.InternalConfig r15) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.a.d.a(com.incode.welcome_sdk.IncodeWelcome$InternalConfig):com.incode.welcome_sdk.data.a.d");
    }

    private final d C() {
        int i2 = 2 % 2;
        int i3 = f7591b + 69;
        f7592c = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr = {this, Modules.SIGNATURE};
            if (((Boolean) b(IdCaptureModuleScreenKt.d.a(), 1688686818, IdCaptureModuleScreenKt.d.a(), -1688686815, objArr, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a())).booleanValue()) {
                this.f7594e.addSignature(new Signature.Builder().build());
            }
            int i4 = f7592c + 75;
            f7591b = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }
        Object[] objArr2 = {this, Modules.SIGNATURE};
        ((Boolean) b(IdCaptureModuleScreenKt.d.a(), 1688686818, IdCaptureModuleScreenKt.d.a(), -1688686815, objArr2, IdCaptureModuleScreenKt.d.a(), IdCaptureModuleScreenKt.d.a())).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final d B() {
        q qVar;
        Object next;
        q qVarE;
        int i2 = 2 % 2;
        Iterator<T> it = this.f7593d.iterator();
        int i3 = f7591b + 107;
        f7592c = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 2 % 3;
        }
        while (true) {
            qVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i5 = f7591b + 1;
            f7592c = i5 % 128;
            int i6 = i5 % 2;
            next = it.next();
            if (((p) next).e() instanceof q.u) {
                break;
            }
        }
        p pVar = (p) next;
        if (pVar != null) {
            int i7 = f7592c + 79;
            f7591b = i7 % 128;
            if (i7 % 2 != 0) {
                pVar.e();
                qVar.hashCode();
                throw null;
            }
            qVarE = pVar.e();
        } else {
            qVarE = null;
        }
        if (qVarE instanceof q.u) {
            qVar = qVarE;
        } else {
            int i8 = f7591b + 37;
            f7592c = i8 % 128;
            int i9 = i8 % 2;
        }
        q.u uVar = (q.u) qVar;
        if (uVar != null) {
            q.u uVar2 = uVar;
            FlowConfig.Builder builder = this.f7594e;
            UserConsent userConsentBuild = new UserConsent.Builder().setTitle(uVar2.b()).setContent(uVar2.c()).build();
            Intrinsics.checkNotNullExpressionValue(userConsentBuild, "");
            builder.addUserConsent(userConsentBuild);
            int i10 = f7591b + 79;
            f7592c = i10 % 128;
            int i11 = i10 % 2;
        } else {
            int i12 = f7592c + 73;
            f7591b = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 4 / 2;
            }
        }
        return this;
    }

    private final d z() {
        Object next;
        q qVarE;
        int i2 = 2 % 2;
        int i3 = f7591b + 17;
        f7592c = i3 % 128;
        q qVar = null;
        if (i3 % 2 == 0) {
            this.f7593d.iterator();
            throw null;
        }
        Iterator<T> it = this.f7593d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((p) next).e() instanceof q.e) {
                break;
            }
        }
        p pVar = (p) next;
        if (pVar != null) {
            int i4 = f7592c + 105;
            f7591b = i4 % 128;
            int i5 = i4 % 2;
            qVarE = pVar.e();
        } else {
            qVarE = null;
        }
        if (qVarE instanceof q.e) {
            qVar = qVarE;
        } else {
            int i6 = f7592c + 85;
            f7591b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 46 / 0;
            }
        }
        q.e eVar = (q.e) qVar;
        if (eVar != null) {
            this.f7594e.addCombinedConsent(new CombinedConsent.Builder().setCombinedConsentsId(eVar.b()).build());
            int i8 = f7592c + 35;
            f7591b = i8 % 128;
            int i9 = i8 % 2;
        }
        return this;
    }

    private final d e(IncodeWelcome.InternalConfig internalConfig) {
        q qVar;
        Object next;
        q qVarE;
        int i2 = 2 % 2;
        Iterator<T> it = this.f7593d.iterator();
        while (true) {
            qVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i3 = f7591b + 35;
            f7592c = i3 % 128;
            if (i3 % 2 == 0) {
                next = it.next();
                int i4 = 42 / 0;
                if (((p) next).e() instanceof q.l) {
                    break;
                }
            } else {
                next = it.next();
                if (((p) next).e() instanceof q.l) {
                    break;
                }
            }
        }
        p pVar = (p) next;
        if (pVar != null) {
            int i5 = f7591b + 109;
            f7592c = i5 % 128;
            if (i5 % 2 == 0) {
                pVar.e();
                throw null;
            }
            qVarE = pVar.e();
        } else {
            qVarE = null;
        }
        if (qVarE instanceof q.l) {
            qVar = qVarE;
        } else {
            int i6 = f7592c + 111;
            f7591b = i6 % 128;
            int i7 = i6 % 2;
        }
        q.l lVar = (q.l) qVar;
        if (lVar != null) {
            q.l lVar2 = lVar;
            internalConfig.setSelfieDeepsightLiveness(lVar2.j());
            this.f7594e.addFaceAuthentication(new FaceAuthentication.Builder().setShowTutorials(lVar2.c()).setCaptureAttempts(lVar2.e()).setAutoCaptureTimeout(lVar2.a()).setHeadCoverCheckEnabled(lVar2.f()).setEyesClosedCheckEnabled(lVar2.h()).setLensesCheckEnabled(lVar2.d()).setMaskCheckEnabled(lVar2.b()).build());
        }
        return this;
    }

    private final d D() {
        Iterator it;
        Object next;
        q qVarE;
        Object next2;
        int i2 = 2 % 2;
        int i3 = f7592c + 1;
        f7591b = i3 % 128;
        if (i3 % 2 != 0) {
            it = this.f7593d.iterator();
            int i4 = 3 / 0;
        } else {
            it = this.f7593d.iterator();
        }
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((p) next).e() instanceof q.ac) {
                int i5 = f7592c + 17;
                f7591b = i5 % 128;
                int i6 = i5 % 2;
                break;
            }
        }
        p pVar = (p) next;
        if (pVar != null) {
            qVarE = pVar.e();
        } else {
            int i7 = f7591b + 49;
            f7592c = i7 % 128;
            int i8 = i7 % 2;
            qVarE = null;
        }
        if (!(qVarE instanceof q.ac)) {
            qVarE = null;
        }
        q.ac acVar = (q.ac) qVarE;
        if (acVar != null) {
            q.ac acVar2 = acVar;
            VideoSelfie.Builder maxVideoLength = new VideoSelfie.Builder().setIdScanEnabled(((Boolean) q.ac.a(a.c(), a.c(), new Object[]{acVar2}, -833971025, 833971025, a.c(), a.c())).booleanValue()).setFrontIdComparisonEnabled(acVar2.f()).setFrontIdOcrComparisonEnabled(acVar2.h()).setBackIdComparisonEnabled(acVar2.g()).setBackIdOcrComparisonEnabled(acVar2.j()).setShowTutorials(acVar2.b()).setSelfieMode(acVar2.c() ? VideoSelfie.SelfieMode.FACE_MATCH : VideoSelfie.SelfieMode.SELFIE_MATCH).setLivenessEnabled(acVar2.a()).setDocumentScanEnabled(acVar2.e()).setRandomQuestionsEnabled(acVar2.i() && acVar2.n() > 0).setRandomQuestionsCount(acVar2.n()).setVoiceConsentEnabled(acVar2.i()).setMaxVideoLength(((Integer) q.ac.a(a.c(), a.c(), new Object[]{acVar2}, 1177297104, -1177297103, a.c(), a.c())).intValue());
            Iterator<T> it2 = this.f7593d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((p) next2).e() instanceof q.w) {
                    int i9 = f7591b + 107;
                    f7592c = i9 % 128;
                    int i10 = i9 % 2;
                    break;
                }
            }
            p pVar2 = (p) next2;
            q qVarE2 = pVar2 != null ? pVar2.e() : null;
            q.w wVar = (q.w) (qVarE2 instanceof q.w ? qVarE2 : null);
            if (wVar != null) {
                q.w wVar2 = wVar;
                maxVideoLength.setEyesClosedCheckEnabled(((Boolean) q.w.d(h.a(), h.a(), 1388377246, h.a(), h.a(), new Object[]{wVar2}, -1388377246)).booleanValue()).setHeadCoverCheckEnabled(wVar2.f()).setLensesCheckEnabled(wVar2.g()).setMaskCheckEnabled(wVar2.i()).setBrightnessCheckEnabled(wVar2.j());
                if (((Boolean) q.w.d(h.a(), h.a(), 1223284828, h.a(), h.a(), new Object[]{wVar2}, -1223284827)).booleanValue()) {
                    maxVideoLength.setAssistedOnboardingEnabled();
                }
            }
            FlowConfig.Builder builder = this.f7594e;
            VideoSelfie videoSelfieBuild = maxVideoLength.build();
            Intrinsics.checkNotNullExpressionValue(videoSelfieBuild, "");
            builder.addVideoSelfie(videoSelfieBuild);
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object b(java.lang.Object[] r8) {
        /*
            r7 = 0
            r2 = r8[r7]
            com.incode.welcome_sdk.data.a.d r2 = (com.incode.welcome_sdk.data.a.d) r2
            r3 = 1
            r4 = r8[r3]
            com.incode.welcome_sdk.modules.Modules r4 = (com.incode.welcome_sdk.modules.Modules) r4
            r6 = 2
            int r0 = r6 % r6
            int r5 = com.incode.welcome_sdk.data.a.d.f7591b
            int r1 = r5 + 73
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.a.d.f7592c = r0
            int r1 = r1 % r6
            java.util.List<com.incode.welcome_sdk.data.remote.beans.p> r2 = r2.f7593d
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            if (r1 != 0) goto L69
            boolean r1 = r2 instanceof java.util.Collection
            r0 = 31
            int r0 = r0 / r7
            if (r1 == 0) goto L33
        L23:
            int r1 = r5 + 61
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.a.d.f7592c = r0
            int r1 = r1 % r6
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6e
        L33:
            java.util.Iterator r2 = r2.iterator()
        L37:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6e
            int r0 = com.incode.welcome_sdk.data.a.d.f7592c
            int r1 = r0 + 91
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.a.d.f7591b = r0
            int r1 = r1 % r6
            java.lang.Object r0 = r2.next()
            com.incode.welcome_sdk.data.remote.beans.p r0 = (com.incode.welcome_sdk.data.remote.beans.p) r0
            java.lang.String r1 = r0.c()
            java.lang.String r0 = r4.name()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            r0 = r0 ^ r3
            if (r0 == r3) goto L37
            int r0 = com.incode.welcome_sdk.data.a.d.f7592c
            int r1 = r0 + 83
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.a.d.f7591b = r0
            int r1 = r1 % r6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L69:
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L33
            goto L23
        L6e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.a.d.b(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<com.incode.welcome_sdk.modules.IntroChecks> F() {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.a.d.F():java.util.List");
    }

    private final boolean c(Modules modules) {
        int iA = IdCaptureModuleScreenKt.d.a();
        int iA2 = IdCaptureModuleScreenKt.d.a();
        return ((Boolean) b(IdCaptureModuleScreenKt.d.a(), 1688686818, iA, -1688686815, new Object[]{this, modules}, IdCaptureModuleScreenKt.d.a(), iA2)).booleanValue();
    }

    private final d E() {
        int iA = IdCaptureModuleScreenKt.d.a();
        int iA2 = IdCaptureModuleScreenKt.d.a();
        return (d) b(IdCaptureModuleScreenKt.d.a(), 1813196808, iA, -1813196804, new Object[]{this}, IdCaptureModuleScreenKt.d.a(), iA2);
    }

    private final d x() {
        int iA = IdCaptureModuleScreenKt.d.a();
        int iA2 = IdCaptureModuleScreenKt.d.a();
        return (d) b(IdCaptureModuleScreenKt.d.a(), -1560992885, iA, 1560992890, new Object[]{this}, IdCaptureModuleScreenKt.d.a(), iA2);
    }

    private final d s() {
        int iA = IdCaptureModuleScreenKt.d.a();
        int iA2 = IdCaptureModuleScreenKt.d.a();
        return (d) b(IdCaptureModuleScreenKt.d.a(), -264099639, iA, 264099640, new Object[]{this}, IdCaptureModuleScreenKt.d.a(), iA2);
    }

    private final d p() {
        int iA = IdCaptureModuleScreenKt.d.a();
        int iA2 = IdCaptureModuleScreenKt.d.a();
        return (d) b(IdCaptureModuleScreenKt.d.a(), -1650967418, iA, 1650967424, new Object[]{this}, IdCaptureModuleScreenKt.d.a(), iA2);
    }

    private final d m() {
        int iA = IdCaptureModuleScreenKt.d.a();
        int iA2 = IdCaptureModuleScreenKt.d.a();
        return (d) b(IdCaptureModuleScreenKt.d.a(), 249586635, iA, -249586633, new Object[]{this}, IdCaptureModuleScreenKt.d.a(), iA2);
    }

    private final d b() {
        int iA = IdCaptureModuleScreenKt.d.a();
        int iA2 = IdCaptureModuleScreenKt.d.a();
        return (d) b(IdCaptureModuleScreenKt.d.a(), 1833937951, iA, -1833937951, new Object[]{this}, IdCaptureModuleScreenKt.d.a(), iA2);
    }
}
