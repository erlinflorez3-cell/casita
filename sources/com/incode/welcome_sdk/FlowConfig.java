package com.incode.welcome_sdk;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.IncodeWelcome;
import com.incode.welcome_sdk.modules.AES;
import com.incode.welcome_sdk.modules.BaseModule;
import com.incode.welcome_sdk.modules.CombinedConsent;
import com.incode.welcome_sdk.modules.Conference;
import com.incode.welcome_sdk.modules.CurpValidation;
import com.incode.welcome_sdk.modules.DocumentScan;
import com.incode.welcome_sdk.modules.DynamicForms;
import com.incode.welcome_sdk.modules.EKYB;
import com.incode.welcome_sdk.modules.EKYC;
import com.incode.welcome_sdk.modules.Email;
import com.incode.welcome_sdk.modules.FaceAuthentication;
import com.incode.welcome_sdk.modules.FaceMatch;
import com.incode.welcome_sdk.modules.GlobalWatchlist;
import com.incode.welcome_sdk.modules.GovernmentValidation;
import com.incode.welcome_sdk.modules.IdInfo;
import com.incode.welcome_sdk.modules.IdScan;
import com.incode.welcome_sdk.modules.Intro;
import com.incode.welcome_sdk.modules.MachineLearningConsent;
import com.incode.welcome_sdk.modules.Modules;
import com.incode.welcome_sdk.modules.NfcScan;
import com.incode.welcome_sdk.modules.Phone;
import com.incode.welcome_sdk.modules.ProcessId;
import com.incode.welcome_sdk.modules.QES;
import com.incode.welcome_sdk.modules.SelfieScan;
import com.incode.welcome_sdk.modules.Signature;
import com.incode.welcome_sdk.modules.UserConsent;
import com.incode.welcome_sdk.modules.VideoSelfie;
import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import com.incode.welcome_sdk.modules.exceptions.ModuleNotAvailableException;
import com.incode.welcome_sdk.modules.l;
import com.incode.welcome_sdk.ui.camera.id_validation.base.DocumentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FlowConfig {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: b */
    private static int f3677b = 1;

    /* JADX INFO: renamed from: c */
    private static int f3678c = 0;

    /* JADX INFO: renamed from: d */
    private static int f3679d = 1;

    /* JADX INFO: renamed from: e */
    private static int f3680e = 0;
    private final String flowTag;
    private final boolean isAgeAssuranceUXEnabled;
    private final boolean isRecordSession;
    private final boolean isRecordSessionMandatory;
    private final ArrayList<BaseModule> moduleConfigs;
    private final ArrayList<Modules> moduleNames;

    private FlowConfig(Builder builder) {
        this.flowTag = builder.getFlowTag$onboard_release();
        this.moduleNames = builder.getModuleNames$onboard_release();
        this.moduleConfigs = builder.getModuleConfigs$onboard_release();
        this.isRecordSession = builder.getRecordSession$onboard_release();
        this.isRecordSessionMandatory = builder.getRecordSessionMandatory$onboard_release();
        this.isAgeAssuranceUXEnabled = builder.getAgeAssuranceUXEnabled$onboard_release();
    }

    public final String getFlowTag() {
        int i2 = 2 % 2;
        int i3 = f3680e;
        int i4 = i3 + 113;
        f3679d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.flowTag;
        int i6 = i3 + 35;
        f3679d = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isRecordSession() {
        int i2 = 2 % 2;
        int i3 = f3680e + 63;
        int i4 = i3 % 128;
        f3679d = i4;
        int i5 = i3 % 2;
        boolean z2 = this.isRecordSession;
        int i6 = i4 + 47;
        f3680e = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean isRecordSessionMandatory() {
        int i2 = 2 % 2;
        int i3 = f3679d;
        int i4 = i3 + 125;
        f3680e = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.isRecordSessionMandatory;
        int i5 = i3 + 67;
        f3680e = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final boolean isAgeAssuranceUXEnabled() {
        int i2 = 2 % 2;
        int i3 = f3679d;
        int i4 = i3 + 105;
        f3680e = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.isAgeAssuranceUXEnabled;
        int i6 = i3 + 27;
        f3680e = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final BaseModule getModuleAt(int i2) {
        int i3 = 2 % 2;
        if (i2 >= this.moduleConfigs.size()) {
            int i4 = f3680e + 113;
            f3679d = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
        BaseModule baseModule = this.moduleConfigs.get(i2);
        int i6 = f3679d + 3;
        f3680e = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 40 / 0;
        }
        return baseModule;
    }

    public final boolean contains(Modules modules) {
        int i2 = 2 % 2;
        int i3 = f3680e + 51;
        f3679d = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(modules, "");
            this.moduleNames.contains(modules);
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(modules, "");
        boolean zContains = this.moduleNames.contains(modules);
        int i4 = f3679d + 83;
        f3680e = i4 % 128;
        if (i4 % 2 == 0) {
            return zContains;
        }
        obj.hashCode();
        throw null;
    }

    public final BaseModule get(Modules modules) {
        int i2 = 2 % 2;
        int i3 = f3679d + 25;
        f3680e = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(modules, "");
        BaseModule baseModule = this.moduleConfigs.get(this.moduleNames.indexOf(modules));
        Intrinsics.checkNotNullExpressionValue(baseModule, "");
        BaseModule baseModule2 = baseModule;
        int i5 = f3679d + 11;
        f3680e = i5 % 128;
        int i6 = i5 % 2;
        return baseModule2;
    }

    public final List<BaseModule> getAllModules() {
        int i2 = 2 % 2;
        int i3 = f3679d + 69;
        f3680e = i3 % 128;
        int i4 = i3 % 2;
        ArrayList<BaseModule> arrayList = this.moduleConfigs;
        if (i4 != 0) {
            int i5 = 42 / 0;
        }
        return arrayList;
    }

    public final List<BaseModule> getAll(Modules modules) {
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(modules, "");
        ArrayList<BaseModule> arrayList = this.moduleConfigs;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            int i3 = f3679d + 13;
            f3680e = i3 % 128;
            int i4 = i3 % 2;
            if (((BaseModule) obj).getName() == modules) {
                int i5 = f3679d + 115;
                f3680e = i5 % 128;
                int i6 = i5 % 2;
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = arrayList2;
        int i7 = f3679d + 33;
        f3680e = i7 % 128;
        if (i7 % 2 == 0) {
            return arrayList3;
        }
        throw null;
    }

    public final void removeModulesBefore(Modules modules) {
        int i2 = 2 % 2;
        int i3 = f3680e + 15;
        f3679d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(modules, "");
        Iterator<BaseModule> it = this.moduleConfigs.iterator();
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                i5 = -1;
                break;
            }
            int i6 = f3679d + 79;
            f3680e = i6 % 128;
            int i7 = i6 % 2;
            if (Intrinsics.areEqual(it.next().getName().name(), modules.name())) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 != -1) {
            List listDrop = CollectionsKt.drop(this.moduleConfigs, i5);
            this.moduleConfigs.clear();
            this.moduleConfigs.addAll(listDrop);
            List listDrop2 = CollectionsKt.drop(this.moduleNames, i5);
            this.moduleNames.clear();
            this.moduleNames.addAll(listDrop2);
            int i8 = f3679d + 87;
            f3680e = i8 % 128;
            int i9 = i8 % 2;
        }
    }

    public final IdScan getIdModule(List<? extends BaseModule> list, IdCategory idCategory) {
        IdScan idScan;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(idCategory, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((BaseModule) next).getName() == Modules.ID) {
                int i3 = f3680e + 59;
                f3679d = i3 % 128;
                int i4 = i3 % 2;
                z2 = true;
            }
            if (!(!z2)) {
                int i5 = f3680e + 97;
                f3679d = i5 % 128;
                int i6 = i5 % 2;
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            Object obj = null;
            if (!it2.hasNext()) {
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    int i7 = f3680e + 89;
                    f3679d = i7 % 128;
                    int i8 = i7 % 2;
                    Object next2 = it3.next();
                    if (((IdScan) next2).getIdCategory() == idCategory) {
                        obj = next2;
                        break;
                    }
                }
                return (IdScan) obj;
            }
            int i9 = f3679d + 95;
            f3680e = i9 % 128;
            if (i9 % 2 != 0) {
                boolean z3 = ((BaseModule) it2.next()) instanceof IdScan;
                throw null;
            }
            BaseModule baseModule = (BaseModule) it2.next();
            if (baseModule instanceof IdScan) {
                int i10 = f3679d + 33;
                f3680e = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                idScan = (IdScan) baseModule;
            } else {
                int i11 = f3680e + 23;
                f3679d = i11 % 128;
                int i12 = i11 % 2;
                idScan = null;
            }
            if (idScan != null) {
                int i13 = f3679d + 11;
                f3680e = i13 % 128;
                if (i13 % 2 != 0) {
                    arrayList2.add(idScan);
                    obj.hashCode();
                    throw null;
                }
                arrayList2.add(idScan);
            }
        }
    }

    private final SelfieScan getSelfieScanModule(List<? extends BaseModule> list) {
        Object next;
        int i2 = 2 % 2;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((BaseModule) next).getName() == Modules.SELFIE) {
                int i3 = f3680e + 69;
                int i4 = i3 % 128;
                f3679d = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 113;
                f3680e = i6 % 128;
                int i7 = i6 % 2;
                break;
            }
        }
        if (!(!(next instanceof SelfieScan))) {
            return (SelfieScan) next;
        }
        int i8 = f3680e + 11;
        f3679d = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    public final boolean findFaceMaskCheckEnabled(List<? extends BaseModule> list) {
        int i2 = 2 % 2;
        int i3 = f3680e + 105;
        f3679d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        SelfieScan selfieScanModule = getSelfieScanModule(list);
        if (selfieScanModule == null) {
            return false;
        }
        boolean zIsMaskCheckEnabled = selfieScanModule.isMaskCheckEnabled();
        int i5 = f3680e + 107;
        f3679d = i5 % 128;
        if (i5 % 2 != 0) {
            return zIsMaskCheckEnabled;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VideoSelfie getVideoSelfieModule(List<? extends BaseModule> list) {
        Iterator it;
        Object next;
        int i2 = 2 % 2;
        int i3 = f3679d + 73;
        f3680e = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            it = list.iterator();
            int i4 = 98 / 0;
        } else {
            Intrinsics.checkNotNullParameter(list, "");
            it = list.iterator();
        }
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            int i5 = f3679d + 55;
            f3680e = i5 % 128;
            int i6 = i5 % 2;
            next = it.next();
            if (((BaseModule) next).getName() == Modules.VIDEO_ONBOARDING) {
                int i7 = f3680e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
                int i8 = i7 % 128;
                f3679d = i8;
                int i9 = i7 % 2;
                int i10 = i8 + 55;
                f3680e = i10 % 128;
                int i11 = i10 % 2;
                break;
            }
        }
        if (next instanceof VideoSelfie) {
            return (VideoSelfie) next;
        }
        int i12 = f3680e + 117;
        f3679d = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    public final boolean findIdModule(List<? extends BaseModule> list, IdCategory idCategory) {
        int i2 = 2 % 2;
        int i3 = f3679d + 93;
        f3680e = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(idCategory, "");
            getIdModule(list, idCategory);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(idCategory, "");
        if (getIdModule(list, idCategory) == null) {
            return false;
        }
        int i4 = f3679d + 83;
        f3680e = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final boolean findFaceMatchModule(List<? extends BaseModule> list, IdCategory idCategory) {
        int i2 = 2 % 2;
        int i3 = f3680e + 3;
        f3679d = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(idCategory, "");
            getFaceMatchModule(list, idCategory);
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(idCategory, "");
        if (getFaceMatchModule(list, idCategory) == null) {
            return false;
        }
        int i4 = f3679d + 45;
        f3680e = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 50 / 0;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x003c A[PHI: r3
  0x003c: PHI (r3v9 java.lang.Object) = (r3v7 java.lang.Object), (r3v10 java.lang.Object) binds: [B:63:0x0059, B:58:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.incode.welcome_sdk.modules.FaceMatch getFaceMatchModule(java.util.List<? extends com.incode.welcome_sdk.modules.BaseModule> r9, com.incode.welcome_sdk.IdCategory r10) {
        /*
            r8 = this;
            r7 = 2
            int r0 = r7 % r7
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r5 = r9.iterator()
        L18:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5c
            int r0 = com.incode.welcome_sdk.FlowConfig.f3679d
            int r1 = r0 + 3
            int r0 = r1 % 128
            com.incode.welcome_sdk.FlowConfig.f3680e = r0
            int r1 = r1 % r7
            r4 = 0
            if (r1 == 0) goto L4c
            java.lang.Object r3 = r5.next()
            r0 = r3
            com.incode.welcome_sdk.modules.BaseModule r0 = (com.incode.welcome_sdk.modules.BaseModule) r0
            com.incode.welcome_sdk.modules.Modules r2 = r0.getName()
            com.incode.welcome_sdk.modules.Modules r1 = com.incode.welcome_sdk.modules.Modules.FACE_MATCH
            r0 = 53
            int r0 = r0 / r4
            if (r2 != r1) goto L3d
        L3c:
            r4 = 1
        L3d:
            if (r4 == 0) goto L18
            int r0 = com.incode.welcome_sdk.FlowConfig.f3679d
            int r1 = r0 + 43
            int r0 = r1 % 128
            com.incode.welcome_sdk.FlowConfig.f3680e = r0
            int r1 = r1 % r7
            r6.add(r3)
            goto L18
        L4c:
            java.lang.Object r3 = r5.next()
            r0 = r3
            com.incode.welcome_sdk.modules.BaseModule r0 = (com.incode.welcome_sdk.modules.BaseModule) r0
            com.incode.welcome_sdk.modules.Modules r1 = r0.getName()
            com.incode.welcome_sdk.modules.Modules r0 = com.incode.welcome_sdk.modules.Modules.FACE_MATCH
            if (r1 != r0) goto L3d
            goto L3c
        L5c:
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r4 = r6.iterator()
        L6b:
            boolean r0 = r4.hasNext()
            r3 = 0
            if (r0 == 0) goto La6
            int r0 = com.incode.welcome_sdk.FlowConfig.f3679d
            int r1 = r0 + 125
            int r0 = r1 % 128
            com.incode.welcome_sdk.FlowConfig.f3680e = r0
            int r1 = r1 % r7
            java.lang.Object r2 = r4.next()
            com.incode.welcome_sdk.modules.BaseModule r2 = (com.incode.welcome_sdk.modules.BaseModule) r2
            boolean r0 = r2 instanceof com.incode.welcome_sdk.modules.FaceMatch
            if (r0 == 0) goto L99
            int r0 = com.incode.welcome_sdk.FlowConfig.f3680e
            int r1 = r0 + 49
            int r0 = r1 % 128
            com.incode.welcome_sdk.FlowConfig.f3679d = r0
            int r1 = r1 % r7
            if (r1 == 0) goto La3
            r3 = r2
            com.incode.welcome_sdk.modules.FaceMatch r3 = (com.incode.welcome_sdk.modules.FaceMatch) r3
        L93:
            if (r3 == 0) goto L6b
            r5.add(r3)
            goto L6b
        L99:
            int r0 = com.incode.welcome_sdk.FlowConfig.f3680e
            int r1 = r0 + 115
            int r0 = r1 % 128
            com.incode.welcome_sdk.FlowConfig.f3679d = r0
            int r1 = r1 % r7
            goto L93
        La3:
            com.incode.welcome_sdk.modules.FaceMatch r2 = (com.incode.welcome_sdk.modules.FaceMatch) r2
            throw r3
        La6:
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r2 = r5.iterator()
        Lae:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lc4
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.incode.welcome_sdk.modules.FaceMatch r0 = (com.incode.welcome_sdk.modules.FaceMatch) r0
            java.util.List<com.incode.welcome_sdk.IdCategory> r0 = r0.f10541c
            boolean r0 = r0.contains(r10)
            if (r0 == 0) goto Lae
            r3 = r1
        Lc4:
            com.incode.welcome_sdk.modules.FaceMatch r3 = (com.incode.welcome_sdk.modules.FaceMatch) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.FlowConfig.getFaceMatchModule(java.util.List, com.incode.welcome_sdk.IdCategory):com.incode.welcome_sdk.modules.FaceMatch");
    }

    public final boolean findAddressModule(List<? extends BaseModule> list) {
        int i2 = 2 % 2;
        int i3 = f3680e + 55;
        f3679d = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        if (getAddressModule(list) == null) {
            return false;
        }
        int i5 = f3680e + 97;
        f3679d = i5 % 128;
        return i5 % 2 != 0;
    }

    public final DocumentScan getAddressModule(List<? extends BaseModule> list) {
        Object obj;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((BaseModule) obj2).getName() == Modules.DOCUMENT_CAPTURE) {
                int i3 = f3680e + 11;
                f3679d = i3 % 128;
                int i4 = i3 % 2;
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BaseModule baseModule = (BaseModule) it.next();
            obj = baseModule instanceof DocumentScan ? (DocumentScan) baseModule : null;
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((DocumentScan) next).c() == DocumentType.ADDRESS_STATEMENT) {
                int i5 = f3679d + 87;
                int i6 = i5 % 128;
                f3680e = i6;
                if (i5 % 2 == 0) {
                    int i7 = i6 + 31;
                    f3679d = i7 % 128;
                    if (i7 % 2 == 0) {
                        int i8 = 28 / 0;
                    }
                    obj = next;
                }
            }
        }
        return (DocumentScan) obj;
    }

    public static final class Builder {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a */
        private static int f3681a = 19 % 128;

        /* JADX INFO: renamed from: b */
        private static int f3682b = 0;

        /* JADX INFO: renamed from: d */
        private static int f3683d = 1;

        /* JADX INFO: renamed from: e */
        private static int f3684e = 0;
        private boolean ageAssuranceUXEnabled;
        private String flowTag;
        private boolean recordSession;
        private boolean recordSessionMandatory;
        private ArrayList<Modules> moduleNames = new ArrayList<>();
        private ArrayList<BaseModule> moduleConfigs = new ArrayList<>();

        public final String getFlowTag$onboard_release() {
            String str;
            int i2 = 2 % 2;
            int i3 = f3683d + 79;
            int i4 = i3 % 128;
            f3682b = i4;
            if (i3 % 2 != 0) {
                str = this.flowTag;
                int i5 = 12 / 0;
            } else {
                str = this.flowTag;
            }
            int i6 = i4 + 77;
            f3683d = i6 % 128;
            if (i6 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final void setFlowTag$onboard_release(String str) {
            int i2 = 2 % 2;
            int i3 = f3683d;
            int i4 = i3 + 109;
            f3682b = i4 % 128;
            int i5 = i4 % 2;
            this.flowTag = str;
            if (i5 != 0) {
                throw null;
            }
            int i6 = i3 + 107;
            f3682b = i6 % 128;
            int i7 = i6 % 2;
        }

        public final ArrayList<Modules> getModuleNames$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f3683d + 43;
            int i4 = i3 % 128;
            f3682b = i4;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ArrayList<Modules> arrayList = this.moduleNames;
            int i5 = i4 + 77;
            f3683d = i5 % 128;
            int i6 = i5 % 2;
            return arrayList;
        }

        public final void setModuleNames$onboard_release(ArrayList<Modules> arrayList) {
            int i2 = 2 % 2;
            int i3 = f3682b + 55;
            f3683d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.moduleNames = arrayList;
            int i5 = f3682b + 115;
            f3683d = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        public final ArrayList<BaseModule> getModuleConfigs$onboard_release() {
            ArrayList<BaseModule> arrayList;
            int i2 = 2 % 2;
            int i3 = f3682b + 65;
            int i4 = i3 % 128;
            f3683d = i4;
            if (i3 % 2 == 0) {
                arrayList = this.moduleConfigs;
                int i5 = 34 / 0;
            } else {
                arrayList = this.moduleConfigs;
            }
            int i6 = i4 + 117;
            f3682b = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 95 / 0;
            }
            return arrayList;
        }

        public final void setModuleConfigs$onboard_release(ArrayList<BaseModule> arrayList) {
            int i2 = 2 % 2;
            int i3 = f3683d + 125;
            f3682b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.moduleConfigs = arrayList;
            int i5 = f3683d + 17;
            f3682b = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final boolean getRecordSession$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f3683d + 33;
            int i4 = i3 % 128;
            f3682b = i4;
            int i5 = i3 % 2;
            boolean z2 = this.recordSession;
            int i6 = i4 + 21;
            f3683d = i6 % 128;
            if (i6 % 2 != 0) {
                return z2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setRecordSession$onboard_release(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f3683d;
            int i4 = i3 + 19;
            f3682b = i4 % 128;
            int i5 = i4 % 2;
            this.recordSession = z2;
            int i6 = i3 + 59;
            f3682b = i6 % 128;
            int i7 = i6 % 2;
        }

        public final boolean getRecordSessionMandatory$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f3683d;
            int i4 = i3 + 57;
            f3682b = i4 % 128;
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean z2 = this.recordSessionMandatory;
            int i5 = i3 + 37;
            f3682b = i5 % 128;
            int i6 = i5 % 2;
            return z2;
        }

        public final void setRecordSessionMandatory$onboard_release(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f3682b;
            int i4 = i3 + 57;
            f3683d = i4 % 128;
            int i5 = i4 % 2;
            this.recordSessionMandatory = z2;
            if (i5 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i6 = i3 + 71;
            f3683d = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 48 / 0;
            }
        }

        public final boolean getAgeAssuranceUXEnabled$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f3682b;
            int i4 = i3 + 101;
            f3683d = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = this.ageAssuranceUXEnabled;
            int i6 = i3 + 53;
            f3683d = i6 % 128;
            if (i6 % 2 != 0) {
                return z2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setAgeAssuranceUXEnabled$onboard_release(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f3683d + 11;
            int i4 = i3 % 128;
            f3682b = i4;
            int i5 = i3 % 2;
            this.ageAssuranceUXEnabled = z2;
            int i6 = i4 + 33;
            f3683d = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private final void addModule(Modules modules, BaseModule baseModule) {
            int i2 = 2 % 2;
            int i3 = f3683d + 41;
            f3682b = i3 % 128;
            int i4 = i3 % 2;
            this.moduleNames.add(modules);
            this.moduleConfigs.add(baseModule);
            int i5 = f3682b + 121;
            f3683d = i5 % 128;
            int i6 = i5 % 2;
        }

        public final Builder setFlowTag(String str) {
            int i2 = 2 % 2;
            int i3 = f3683d + 73;
            int i4 = i3 % 128;
            f3682b = i4;
            if (i3 % 2 == 0) {
                this.flowTag = str;
                int i5 = i4 + 55;
                f3683d = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 43 / 0;
                }
                return this;
            }
            this.flowTag = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder addPhone() {
            int i2 = 2 % 2;
            addModule(Modules.PHONE, new Phone.Builder().build());
            int i3 = f3682b + 43;
            f3683d = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final Builder addPhone(Phone phone) {
            int i2 = 2 % 2;
            int i3 = f3682b + 99;
            f3683d = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(phone, "");
                addModule(Modules.PHONE, phone);
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(phone, "");
            addModule(Modules.PHONE, phone);
            int i4 = f3682b + 103;
            f3683d = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            obj.hashCode();
            throw null;
        }

        public final Builder addEmail() {
            int i2 = 2 % 2;
            addModule(Modules.EMAIL, new Email.Builder().build());
            int i3 = f3683d + 123;
            f3682b = i3 % 128;
            if (i3 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder addEmail(Email email) {
            int i2 = 2 % 2;
            int i3 = f3683d + 113;
            f3682b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(email, "");
            addModule(Modules.EMAIL, email);
            int i5 = f3682b + 87;
            f3683d = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder addName() {
            int i2 = 2 % 2;
            addModule(Modules.NAME_CAPTURE, new com.incode.welcome_sdk.modules.j());
            int i3 = f3682b + 13;
            f3683d = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final Builder addIntro(Intro intro) {
            int i2 = 2 % 2;
            int i3 = f3683d + 23;
            f3682b = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(intro, "");
                addModule(Modules.INTRO, intro);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(intro, "");
            addModule(Modules.INTRO, intro);
            int i4 = f3683d + 21;
            f3682b = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        @Deprecated(message = "This method was replaced by addID()", replaceWith = @ReplaceWith(expression = "addID()", imports = {}))
        public final Builder addIDScan() {
            int i2 = 2 % 2;
            addID();
            addProcessId(new ProcessId.Builder().build());
            int i3 = f3682b + 3;
            f3683d = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final Builder addID() {
            int i2 = 2 % 2;
            addModule(Modules.ID, new IdScan.Builder().build());
            int i3 = f3683d + 101;
            f3682b = i3 % 128;
            if (i3 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder addID(IdScan idScan) {
            int i2 = 2 % 2;
            int i3 = f3683d + 41;
            f3682b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(idScan, "");
            addModule(Modules.ID, idScan);
            int i5 = f3683d + 85;
            f3682b = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder addProcessId(ProcessId processId) {
            int i2 = 2 % 2;
            int i3 = f3682b + 95;
            f3683d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(processId, "");
            addModule(Modules.PROCESS_ID, processId);
            int i5 = f3683d + 51;
            f3682b = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder addIdInfo() {
            int i2 = 2 % 2;
            addModule(Modules.ID_OCR, new IdInfo.Builder().build());
            int i3 = f3683d + 91;
            f3682b = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final Builder addIdInfo(IdInfo idInfo) {
            int i2 = 2 % 2;
            int i3 = f3682b + 45;
            f3683d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(idInfo, "");
            addModule(Modules.ID_OCR, idInfo);
            int i5 = f3683d + 59;
            f3682b = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder addNfcScan(NfcScan nfcScan) {
            int i2 = 2 % 2;
            int i3 = f3683d + 53;
            f3682b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(nfcScan, "");
            addModule(Modules.NFC_SCAN, nfcScan);
            int i5 = f3682b + 65;
            f3683d = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder addQRScan() {
            int i2 = 2 % 2;
            addModule(Modules.QR_SCAN, new com.incode.welcome_sdk.modules.i());
            int i3 = f3682b + 51;
            f3683d = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 62 / 0;
            }
            return this;
        }

        public final Builder addQRScan(boolean z2) {
            int i2 = 2 % 2;
            addModule(Modules.QR_SCAN, new com.incode.welcome_sdk.modules.i(z2));
            int i3 = f3682b + 79;
            f3683d = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder addDocumentScan(DocumentScan documentScan) {
            int i2 = 2 % 2;
            int i3 = f3682b + 57;
            f3683d = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(documentScan, "");
                addModule(Modules.DOCUMENT_CAPTURE, documentScan);
                throw null;
            }
            Intrinsics.checkNotNullParameter(documentScan, "");
            addModule(Modules.DOCUMENT_CAPTURE, documentScan);
            int i4 = f3683d + 71;
            f3682b = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final Builder addSelfieScan() {
            int i2 = 2 % 2;
            Modules modules = Modules.SELFIE;
            SelfieScan selfieScanBuild = new SelfieScan.Builder().build();
            Intrinsics.checkNotNullExpressionValue(selfieScanBuild, "");
            addModule(modules, selfieScanBuild);
            int i3 = f3683d + 123;
            f3682b = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final Builder addSelfieScan(SelfieScan selfieScan) {
            int i2 = 2 % 2;
            int i3 = f3683d + 91;
            f3682b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(selfieScan, "");
            addModule(Modules.SELFIE, selfieScan);
            int i5 = f3683d + 55;
            f3682b = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder addFaceAuthentication() {
            int i2 = 2 % 2;
            addModule(Modules.AUTHENTICATION, new FaceAuthentication.Builder().build());
            int i3 = f3682b + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f3683d = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder addFaceAuthentication(FaceAuthentication faceAuthentication) {
            int i2 = 2 % 2;
            int i3 = f3683d + 35;
            f3682b = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(faceAuthentication, "");
                addModule(Modules.AUTHENTICATION, faceAuthentication);
                int i4 = 71 / 0;
            } else {
                Intrinsics.checkNotNullParameter(faceAuthentication, "");
                addModule(Modules.AUTHENTICATION, faceAuthentication);
            }
            return this;
        }

        public final Builder addFaceMatch() {
            int i2 = 2 % 2;
            addModule(Modules.FACE_MATCH, new FaceMatch.Builder().build());
            int i3 = f3683d + 49;
            f3682b = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final Builder addFaceMatch(FaceMatch faceMatch) {
            int i2 = 2 % 2;
            int i3 = f3683d + 23;
            f3682b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(faceMatch, "");
            addModule(Modules.FACE_MATCH, faceMatch);
            int i5 = f3683d + 125;
            f3682b = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder addGovernmentValidation() {
            int i2 = 2 % 2;
            addModule(Modules.INE_VALIDATION, new GovernmentValidation.Builder().build());
            int i3 = f3683d + 87;
            f3682b = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final Builder addGovernmentValidation(GovernmentValidation governmentValidation) {
            int i2 = 2 % 2;
            int i3 = f3683d + 39;
            f3682b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(governmentValidation, "");
            addModule(Modules.INE_VALIDATION, governmentValidation);
            int i5 = f3682b + 123;
            f3683d = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder addSignature() {
            int i2 = 2 % 2;
            Modules modules = Modules.SIGNATURE;
            Signature signatureBuild = new Signature.Builder().build();
            Intrinsics.checkNotNullExpressionValue(signatureBuild, "");
            addModule(modules, signatureBuild);
            int i3 = f3682b + 107;
            f3683d = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 47 / 0;
            }
            return this;
        }

        public final Builder addSignature(Signature signature) {
            int i2 = 2 % 2;
            int i3 = f3683d + 59;
            f3682b = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                Modules modules = Modules.SIGNATURE;
                Intrinsics.checkNotNull(signature);
                addModule(modules, signature);
                int i4 = f3683d + 99;
                f3682b = i4 % 128;
                if (i4 % 2 == 0) {
                    return this;
                }
                throw null;
            }
            Modules modules2 = Modules.SIGNATURE;
            Intrinsics.checkNotNull(signature);
            addModule(modules2, signature);
            obj.hashCode();
            throw null;
        }

        public final Builder addUserConsent(UserConsent userConsent) {
            int i2 = 2 % 2;
            int i3 = f3683d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f3682b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(userConsent, "");
            addModule(Modules.USER_CONSENT, userConsent);
            int i5 = f3683d + 31;
            f3682b = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder addCombinedConsent(CombinedConsent combinedConsent) {
            int i2 = 2 % 2;
            int i3 = f3683d + 43;
            f3682b = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(combinedConsent, "");
                addModule(Modules.COMBINED_CONSENT, combinedConsent);
                throw null;
            }
            Intrinsics.checkNotNullParameter(combinedConsent, "");
            addModule(Modules.COMBINED_CONSENT, combinedConsent);
            int i4 = f3683d + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f3682b = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.incode.welcome_sdk.FlowConfig.Builder addConference() {
            /*
                r4 = this;
                r3 = 2
                int r0 = r3 % r3
                int r0 = com.incode.welcome_sdk.FlowConfig.Builder.f3683d
                int r1 = r0 + 35
                int r0 = r1 % 128
                com.incode.welcome_sdk.FlowConfig.Builder.f3682b = r0
                int r1 = r1 % r3
                if (r1 == 0) goto L43
                r0 = r4
                com.incode.welcome_sdk.FlowConfig$Builder r0 = (com.incode.welcome_sdk.FlowConfig.Builder) r0
                com.incode.welcome_sdk.IncodeWelcome$Companion r0 = com.incode.welcome_sdk.IncodeWelcome.Companion
                com.incode.welcome_sdk.IncodeWelcome r0 = r0.getInstance()
                boolean r1 = r0.isSubmitOnlyMode()
                r0 = 96
                int r0 = r0 / 0
                if (r1 != 0) goto L3f
            L21:
                com.incode.welcome_sdk.modules.Modules r2 = com.incode.welcome_sdk.modules.Modules.CONFERENCE
                com.incode.welcome_sdk.modules.Conference$Builder r0 = new com.incode.welcome_sdk.modules.Conference$Builder
                r0.<init>()
                com.incode.welcome_sdk.modules.Conference r1 = r0.build()
                java.lang.String r0 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
                com.incode.welcome_sdk.modules.BaseModule r1 = (com.incode.welcome_sdk.modules.BaseModule) r1
                r4.addModule(r2, r1)
                int r0 = com.incode.welcome_sdk.FlowConfig.Builder.f3682b
                int r1 = r0 + 27
                int r0 = r1 % 128
                com.incode.welcome_sdk.FlowConfig.Builder.f3683d = r0
                int r1 = r1 % r3
            L3f:
                r0 = r4
                com.incode.welcome_sdk.FlowConfig$Builder r0 = (com.incode.welcome_sdk.FlowConfig.Builder) r0
                return r4
            L43:
                r0 = r4
                com.incode.welcome_sdk.FlowConfig$Builder r0 = (com.incode.welcome_sdk.FlowConfig.Builder) r0
                com.incode.welcome_sdk.IncodeWelcome$Companion r0 = com.incode.welcome_sdk.IncodeWelcome.Companion
                com.incode.welcome_sdk.IncodeWelcome r0 = r0.getInstance()
                boolean r0 = r0.isSubmitOnlyMode()
                if (r0 != 0) goto L3f
                goto L21
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.FlowConfig.Builder.addConference():com.incode.welcome_sdk.FlowConfig$Builder");
        }

        public final Builder addConference(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f3682b + 75;
            f3683d = i3 % 128;
            int i4 = i3 % 2;
            if (!IncodeWelcome.Companion.getInstance().isSubmitOnlyMode()) {
                Modules modules = Modules.CONFERENCE;
                Conference conferenceBuild = new Conference.Builder().setDisableMicOnCallStart(z2).build();
                Intrinsics.checkNotNullExpressionValue(conferenceBuild, "");
                addModule(modules, conferenceBuild);
            }
            int i5 = f3683d + 35;
            f3682b = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.incode.welcome_sdk.FlowConfig.Builder addResults() {
            /*
                r3 = this;
                r2 = 2
                int r0 = r2 % r2
                int r0 = com.incode.welcome_sdk.FlowConfig.Builder.f3682b
                int r1 = r0 + 71
                int r0 = r1 % 128
                com.incode.welcome_sdk.FlowConfig.Builder.f3683d = r0
                int r1 = r1 % r2
                if (r1 != 0) goto L45
                r0 = r3
                com.incode.welcome_sdk.FlowConfig$Builder r0 = (com.incode.welcome_sdk.FlowConfig.Builder) r0
                com.incode.welcome_sdk.IncodeWelcome$Companion r0 = com.incode.welcome_sdk.IncodeWelcome.Companion
                com.incode.welcome_sdk.IncodeWelcome r0 = r0.getInstance()
                boolean r1 = r0.isSubmitOnlyMode()
                r0 = 36
                int r0 = r0 / 0
                if (r1 != 0) goto L36
            L21:
                com.incode.welcome_sdk.modules.Modules r1 = com.incode.welcome_sdk.modules.Modules.SHOW_RESULTS
                com.incode.welcome_sdk.modules.m r0 = new com.incode.welcome_sdk.modules.m
                r0.<init>()
                com.incode.welcome_sdk.modules.BaseModule r0 = (com.incode.welcome_sdk.modules.BaseModule) r0
                r3.addModule(r1, r0)
                int r0 = com.incode.welcome_sdk.FlowConfig.Builder.f3683d
                int r1 = r0 + 17
                int r0 = r1 % 128
                com.incode.welcome_sdk.FlowConfig.Builder.f3682b = r0
                int r1 = r1 % r2
            L36:
                r0 = r3
                com.incode.welcome_sdk.FlowConfig$Builder r0 = (com.incode.welcome_sdk.FlowConfig.Builder) r0
                int r0 = com.incode.welcome_sdk.FlowConfig.Builder.f3682b
                int r1 = r0 + 63
                int r0 = r1 % 128
                com.incode.welcome_sdk.FlowConfig.Builder.f3683d = r0
                int r1 = r1 % r2
                if (r1 == 0) goto L55
                return r3
            L45:
                r0 = r3
                com.incode.welcome_sdk.FlowConfig$Builder r0 = (com.incode.welcome_sdk.FlowConfig.Builder) r0
                com.incode.welcome_sdk.IncodeWelcome$Companion r0 = com.incode.welcome_sdk.IncodeWelcome.Companion
                com.incode.welcome_sdk.IncodeWelcome r0 = r0.getInstance()
                boolean r0 = r0.isSubmitOnlyMode()
                if (r0 != 0) goto L36
                goto L21
            L55:
                r0 = 0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.FlowConfig.Builder.addResults():com.incode.welcome_sdk.FlowConfig$Builder");
        }

        public final Builder addResults(IncodeWelcome.IDResultsFetchMode iDResultsFetchMode) {
            int i2 = 2 % 2;
            int i3 = f3683d + 7;
            f3682b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(iDResultsFetchMode, "");
            if (!IncodeWelcome.Companion.getInstance().isSubmitOnlyMode()) {
                addModule(Modules.SHOW_RESULTS, new com.incode.welcome_sdk.modules.m(iDResultsFetchMode));
            }
            int i5 = f3683d + 15;
            f3682b = i5 % 128;
            if (i5 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder addApproval() {
            int i2 = 2 % 2;
            int i3 = f3682b + 71;
            f3683d = i3 % 128;
            if (i3 % 2 == 0) {
                addApproval(true, true, false);
            } else {
                addApproval(false, false, false);
            }
            int i4 = f3683d + 111;
            f3682b = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder addApproval(boolean z2, boolean z3) {
            int i2 = 2 % 2;
            int i3 = f3682b + 95;
            f3683d = i3 % 128;
            int i4 = i3 % 2;
            addApproval(z2, z3, false);
            int i5 = f3682b + 85;
            f3683d = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder addApproval(boolean z2, boolean z3, boolean z4) {
            int i2 = 2 % 2;
            addModule(Modules.USER_APPROVAL, new com.incode.welcome_sdk.modules.e(z2, z3, z4));
            int i3 = f3682b + 67;
            f3683d = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final Builder addAcceptVideoSelfie() {
            int i2 = 2 % 2;
            addModule(Modules.ACCEPT_VIDEO_SELFIE, new com.incode.welcome_sdk.modules.c());
            int i3 = f3682b + 1;
            f3683d = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final Builder addVideoSelfie() {
            int i2 = 2 % 2;
            Modules modules = Modules.VIDEO_ONBOARDING;
            VideoSelfie videoSelfieBuild = new VideoSelfie.Builder().build();
            Intrinsics.checkNotNullExpressionValue(videoSelfieBuild, "");
            addModule(modules, videoSelfieBuild);
            int i3 = f3682b + 117;
            f3683d = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder addVideoSelfie(VideoSelfie videoSelfie) {
            int i2 = 2 % 2;
            int i3 = f3682b + 39;
            f3683d = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(videoSelfie, "");
                addModule(Modules.VIDEO_ONBOARDING, videoSelfie);
                return this;
            }
            Intrinsics.checkNotNullParameter(videoSelfie, "");
            addModule(Modules.VIDEO_ONBOARDING, videoSelfie);
            throw null;
        }

        public final Builder addCaptcha() {
            int i2 = 2 % 2;
            addModule(Modules.OTP, new com.incode.welcome_sdk.modules.a());
            int i3 = f3682b + 19;
            f3683d = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 78 / 0;
            }
            return this;
        }

        public final Builder addGeolocation() {
            int i2 = 2 % 2;
            addModule(Modules.GEOLOCATION, new com.incode.welcome_sdk.modules.f());
            int i3 = f3683d + 61;
            f3682b = i3 % 128;
            if (i3 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder addCurpValidation() {
            int i2 = 2 % 2;
            CurpValidation curpValidationBuild = new CurpValidation.Builder().build();
            Intrinsics.checkNotNullExpressionValue(curpValidationBuild, "");
            addCurpValidation(curpValidationBuild);
            int i3 = f3682b + 83;
            f3683d = i3 % 128;
            if (i3 % 2 != 0) {
                return this;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder addCurpValidation(CurpValidation curpValidation) {
            int i2 = 2 % 2;
            int i3 = f3682b + 9;
            f3683d = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(curpValidation, "");
                addModule(Modules.CURP_VALIDATION, curpValidation);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(curpValidation, "");
            addModule(Modules.CURP_VALIDATION, curpValidation);
            int i4 = f3682b + 3;
            f3683d = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 61 / 0;
            }
            return this;
        }

        public final Builder addTaxIdValidation() {
            int i2 = 2 % 2;
            addModule(Modules.TAX_ID_VALIDATION, new l());
            int i3 = f3683d + 29;
            f3682b = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final Builder addCustomWatchlist() {
            int i2 = 2 % 2;
            addModule(Modules.INCODE_WATCHLIST, new com.incode.welcome_sdk.modules.b());
            int i3 = f3683d + 45;
            f3682b = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final Builder addGlobalWatchlist() {
            int i2 = 2 % 2;
            addModule(Modules.WATCHLIST, new GlobalWatchlist());
            int i3 = f3682b + 83;
            f3683d = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final Builder addMachineLearningConsent(MachineLearningConsent machineLearningConsent) {
            int i2 = 2 % 2;
            int i3 = f3682b + 51;
            f3683d = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(machineLearningConsent, "");
                addModule(Modules.ML_CONSENT, machineLearningConsent);
                throw null;
            }
            Intrinsics.checkNotNullParameter(machineLearningConsent, "");
            addModule(Modules.ML_CONSENT, machineLearningConsent);
            int i4 = f3682b + 43;
            f3683d = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public final Builder addAES() throws ModuleConfigurationException {
            int i2 = 2 % 2;
            if (!(!contains(Modules.ID)) && contains(Modules.SELFIE) && contains(Modules.PHONE)) {
                addModule(Modules.AE_SIGNATURE, new AES.Builder().build());
                int i3 = f3683d;
                int i4 = i3 + 65;
                f3682b = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 65;
                f3682b = i6 % 128;
                if (i6 % 2 == 0) {
                    return this;
                }
                throw null;
            }
            throw new ModuleConfigurationException("Cannot add AES module. Ensure that ID Scan, Selfie Scan, and Phone modules are included before adding the AES module. If using the OTP module, ensure it is added before the AES module.");
        }

        public final Builder addAES(AES aes) throws ModuleConfigurationException {
            int i2 = 2 % 2;
            int i3 = f3682b + 11;
            f3683d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(aes, "");
            if ((!contains(Modules.ID)) || !contains(Modules.SELFIE) || !contains(Modules.PHONE)) {
                throw new ModuleConfigurationException("Cannot add AES module. Ensure that ID Scan, Selfie Scan, and Phone modules are included before adding the AES module. If using the OTP module, ensure it is added before the AES module.");
            }
            addModule(Modules.AE_SIGNATURE, aes);
            int i5 = f3683d;
            int i6 = i5 + 77;
            f3682b = i6 % 128;
            if (i6 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i7 = i5 + 85;
            f3682b = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 77 / 0;
            }
            return this;
        }

        public final Builder addQES(QES qes) {
            int i2 = 2 % 2;
            int i3 = f3683d + 55;
            f3682b = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(qes, "");
            addModule(Modules.QE_SIGNATURE, qes);
            int i5 = f3683d + 95;
            f3682b = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder addEKYB(EKYB ekyb) {
            int i2 = 2 % 2;
            int i3 = f3682b + 113;
            f3683d = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(ekyb, "");
            addModule(Modules.EKYB, ekyb);
            int i5 = f3683d + 115;
            f3682b = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder addEKYC(EKYC ekyc) {
            int i2 = 2 % 2;
            int i3 = f3683d + 63;
            f3682b = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(ekyc, "");
                addModule(Modules.EXTERNAL_VERIFICATION, ekyc);
                return this;
            }
            Intrinsics.checkNotNullParameter(ekyc, "");
            addModule(Modules.EXTERNAL_VERIFICATION, ekyc);
            throw null;
        }

        public final Builder addAntifraud() {
            int i2 = 2 % 2;
            addModule(Modules.ANTIFRAUD, new com.incode.welcome_sdk.modules.d());
            int i3 = f3683d + 49;
            f3682b = i3 % 128;
            int i4 = i3 % 2;
            return this;
        }

        public final Builder addDynamicForms(DynamicForms dynamicForms) {
            int i2 = 2 % 2;
            int i3 = f3683d + 37;
            f3682b = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(dynamicForms, "");
                addModule(Modules.DYNAMIC_FORMS, dynamicForms);
                return this;
            }
            Intrinsics.checkNotNullParameter(dynamicForms, "");
            addModule(Modules.DYNAMIC_FORMS, dynamicForms);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Deprecated(message = "This method was replaced by configureScreenRecording()", replaceWith = @ReplaceWith(expression = "configureScreenRecording()", imports = {}))
        public final Builder setRecordSession(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f3682b + 13;
            f3683d = i3 % 128;
            int i4 = i3 % 2;
            configureScreenRecording(true, z2);
            int i5 = f3682b + 109;
            f3683d = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.incode.welcome_sdk.FlowConfig.Builder configureScreenRecording(boolean r4, boolean r5) {
            /*
                r3 = this;
                r2 = 2
                int r0 = r2 % r2
                int r0 = com.incode.welcome_sdk.FlowConfig.Builder.f3682b
                int r0 = r0 + 53
                int r1 = r0 % 128
                com.incode.welcome_sdk.FlowConfig.Builder.f3683d = r1
                int r0 = r0 % r2
                if (r0 != 0) goto L31
                r0 = r3
                com.incode.welcome_sdk.FlowConfig$Builder r0 = (com.incode.welcome_sdk.FlowConfig.Builder) r0
                r3.recordSession = r4
                r0 = 25
                int r0 = r0 / 0
                r0 = 1
                r4 = r4 ^ r0
                if (r4 == r0) goto L2d
            L1b:
                int r1 = r1 + 29
                int r0 = r1 % 128
                com.incode.welcome_sdk.FlowConfig.Builder.f3682b = r0
                int r1 = r1 % r2
                if (r1 != 0) goto L39
                r3.recordSessionMandatory = r5
                int r1 = r0 + 73
                int r0 = r1 % 128
                com.incode.welcome_sdk.FlowConfig.Builder.f3683d = r0
                int r1 = r1 % r2
            L2d:
                r0 = r3
                com.incode.welcome_sdk.FlowConfig$Builder r0 = (com.incode.welcome_sdk.FlowConfig.Builder) r0
                return r3
            L31:
                r0 = r3
                com.incode.welcome_sdk.FlowConfig$Builder r0 = (com.incode.welcome_sdk.FlowConfig.Builder) r0
                r3.recordSession = r4
                if (r4 == 0) goto L2d
                goto L1b
            L39:
                r3.recordSessionMandatory = r5
                r0 = 0
                r0.hashCode()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.FlowConfig.Builder.configureScreenRecording(boolean, boolean):com.incode.welcome_sdk.FlowConfig$Builder");
        }

        public final Builder setAgeAssuranceUXEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f3682b;
            int i4 = i3 + 37;
            f3683d = i4 % 128;
            int i5 = i4 % 2;
            this.ageAssuranceUXEnabled = z2;
            int i6 = i3 + 97;
            f3683d = i6 % 128;
            if (i6 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final boolean contains(Modules modules) {
            boolean zContains;
            int i2 = 2 % 2;
            int i3 = f3682b + 51;
            f3683d = i3 % 128;
            if (i3 % 2 == 0) {
                zContains = CollectionsKt.contains(this.moduleNames, modules);
                int i4 = 3 / 0;
            } else {
                zContains = CollectionsKt.contains(this.moduleNames, modules);
            }
            int i5 = f3683d + 57;
            f3682b = i5 % 128;
            int i6 = i5 % 2;
            return zContains;
        }

        public final FlowConfig build() throws ModuleConfigurationException {
            int i2 = 2 % 2;
            if (contains(Modules.OTP)) {
                int i3 = f3682b + 31;
                f3683d = i3 % 128;
                if (i3 % 2 == 0) {
                    contains(Modules.AE_SIGNATURE);
                    throw null;
                }
                if (contains(Modules.AE_SIGNATURE)) {
                    if (this.moduleNames.indexOf(Modules.AE_SIGNATURE) <= this.moduleNames.indexOf(Modules.OTP)) {
                        throw new ModuleConfigurationException("AES module must be after OTP module");
                    }
                }
            }
            if (IncodeWelcome.Companion.getInstance().isCaptureOnlyMode()) {
                if (contains(Modules.INE_VALIDATION)) {
                    throw new ModuleNotAvailableException(Modules.INE_VALIDATION);
                }
                if (contains(Modules.FACE_MATCH)) {
                    throw new ModuleNotAvailableException(Modules.FACE_MATCH);
                }
                if (contains(Modules.CONFERENCE)) {
                    throw new ModuleNotAvailableException(Modules.CONFERENCE);
                }
                if (contains(Modules.USER_APPROVAL)) {
                    throw new ModuleNotAvailableException(Modules.USER_APPROVAL);
                }
                if (contains(Modules.SHOW_RESULTS)) {
                    throw new ModuleNotAvailableException(Modules.SHOW_RESULTS);
                }
            }
            FlowConfig flowConfig = new FlowConfig(this, null);
            int i4 = f3683d + 103;
            f3682b = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 10 / 0;
            }
            return flowConfig;
        }

        static {
            int i2 = 19 % 2;
        }
    }

    static {
        int i2 = 1 + 91;
        f3678c = i2 % 128;
        int i3 = i2 % 2;
    }

    public /* synthetic */ FlowConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
