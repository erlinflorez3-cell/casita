package com.incode.welcome_sdk.data.remote.beans;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.data.remote.beans.q;
import com.incode.welcome_sdk.modules.Modules;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f9098a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f9099b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f9100c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f9101d = 0;
    private final boolean active;
    private final boolean autoApproveEnabled;
    private final com.incode.welcome_sdk.data.remote.beans.a autoApproveLevel;
    private final boolean checkAuthorization;
    private final boolean checkDocumentScan;
    private final boolean checkIdScan;
    private final boolean checkLiveness;
    private final boolean checkMinVideoLengthRequired;
    private final boolean checkTutorials;
    private final boolean checkVoiceConsent;
    private final boolean defaultConfiguration;
    private final String description;
    private final boolean governmentValidation;
    private final String id;
    private final double idSecurityLevel;
    private final boolean idValidation;
    private final bo liveness;
    private final boolean manualCorrection;
    private final LinkedHashSet<c> modules;
    private final String name;
    private final int numberOfSessions;
    private final int questionsCount;
    private final String redirectUrl;
    private final bo severityLevel;
    private final bs signatureProvider;
    public static final a Companion = new a(0);
    public static final int $stable = 8;

    public Flow(String str, String str2, String str3, boolean z2, int i2, LinkedHashSet<c> linkedHashSet, boolean z3, bo boVar, bs bsVar, bo boVar2, double d2, boolean z4, boolean z5, boolean z6, boolean z7, com.incode.welcome_sdk.data.remote.beans.a aVar, String str4, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(linkedHashSet, "");
        Intrinsics.checkNotNullParameter(boVar, "");
        Intrinsics.checkNotNullParameter(boVar2, "");
        Intrinsics.checkNotNullParameter(aVar, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.active = z2;
        this.numberOfSessions = i2;
        this.modules = linkedHashSet;
        this.defaultConfiguration = z3;
        this.liveness = boVar;
        this.signatureProvider = bsVar;
        this.severityLevel = boVar2;
        this.idSecurityLevel = d2;
        this.idValidation = z4;
        this.governmentValidation = z5;
        this.manualCorrection = z6;
        this.autoApproveEnabled = z7;
        this.autoApproveLevel = aVar;
        this.redirectUrl = str4;
        this.checkMinVideoLengthRequired = z8;
        this.checkTutorials = z9;
        this.checkAuthorization = z10;
        this.checkLiveness = z11;
        this.checkIdScan = z12;
        this.checkDocumentScan = z13;
        this.checkVoiceConsent = z14;
        this.questionsCount = i3;
    }

    public /* synthetic */ Flow(String str, String str2, String str3, boolean z2, int i2, LinkedHashSet linkedHashSet, boolean z3, bo boVar, bs bsVar, bo boVar2, double d2, boolean z4, boolean z5, boolean z6, boolean z7, com.incode.welcome_sdk.data.remote.beans.a aVar, String str4, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, z2, i2, linkedHashSet, z3, boVar, (i4 & 256) != 0 ? null : bsVar, boVar2, d2, z4, z5, z6, z7, aVar, str4, z8, z9, z10, z11, z12, z13, z14, i3);
    }

    public final String getId() {
        int i2 = 2 % 2;
        int i3 = f9099b + 101;
        f9100c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.id;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getName() {
        int i2 = 2 % 2;
        int i3 = f9099b + 27;
        f9100c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.name;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDescription() {
        int i2 = 2 % 2;
        int i3 = f9100c;
        int i4 = i3 + 33;
        f9099b = i4 % 128;
        int i5 = i4 % 2;
        String str = this.description;
        int i6 = i3 + 71;
        f9099b = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getActive() {
        int i2 = 2 % 2;
        int i3 = f9100c + 101;
        int i4 = i3 % 128;
        f9099b = i4;
        int i5 = i3 % 2;
        boolean z2 = this.active;
        int i6 = i4 + 21;
        f9100c = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final int getNumberOfSessions() {
        int i2 = 2 % 2;
        int i3 = f9100c + 27;
        f9099b = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.numberOfSessions;
        if (i4 == 0) {
            int i6 = 37 / 0;
        }
        return i5;
    }

    public final LinkedHashSet<c> getModules() {
        int i2 = 2 % 2;
        int i3 = f9100c + 115;
        int i4 = i3 % 128;
        f9099b = i4;
        int i5 = i3 % 2;
        LinkedHashSet<c> linkedHashSet = this.modules;
        int i6 = i4 + 39;
        f9100c = i6 % 128;
        if (i6 % 2 == 0) {
            return linkedHashSet;
        }
        throw null;
    }

    public final boolean getDefaultConfiguration() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f9100c + 1;
        int i4 = i3 % 128;
        f9099b = i4;
        if (i3 % 2 == 0) {
            z2 = this.defaultConfiguration;
            int i5 = 44 / 0;
        } else {
            z2 = this.defaultConfiguration;
        }
        int i6 = i4 + 123;
        f9100c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 91 / 0;
        }
        return z2;
    }

    public final bo getLiveness() {
        int i2 = 2 % 2;
        int i3 = f9100c;
        int i4 = i3 + 97;
        f9099b = i4 % 128;
        int i5 = i4 % 2;
        bo boVar = this.liveness;
        int i6 = i3 + 67;
        f9099b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 97 / 0;
        }
        return boVar;
    }

    public final bs getSignatureProvider() {
        int i2 = 2 % 2;
        int i3 = f9100c;
        int i4 = i3 + 105;
        f9099b = i4 % 128;
        int i5 = i4 % 2;
        bs bsVar = this.signatureProvider;
        int i6 = i3 + 89;
        f9099b = i6 % 128;
        int i7 = i6 % 2;
        return bsVar;
    }

    public final bo getSeverityLevel() {
        int i2 = 2 % 2;
        int i3 = f9099b + 1;
        int i4 = i3 % 128;
        f9100c = i4;
        if (i3 % 2 != 0) {
            throw null;
        }
        bo boVar = this.severityLevel;
        int i5 = i4 + 105;
        f9099b = i5 % 128;
        if (i5 % 2 != 0) {
            return boVar;
        }
        throw null;
    }

    public final double getIdSecurityLevel() {
        int i2 = 2 % 2;
        int i3 = f9100c;
        int i4 = i3 + 125;
        f9099b = i4 % 128;
        int i5 = i4 % 2;
        double d2 = this.idSecurityLevel;
        int i6 = i3 + 111;
        f9099b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 20 / 0;
        }
        return d2;
    }

    public final boolean getIdValidation() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f9100c + 103;
        int i4 = i3 % 128;
        f9099b = i4;
        if (i3 % 2 == 0) {
            z2 = this.idValidation;
            int i5 = 67 / 0;
        } else {
            z2 = this.idValidation;
        }
        int i6 = i4 + 17;
        f9100c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 40 / 0;
        }
        return z2;
    }

    public final boolean getGovernmentValidation() {
        int i2 = 2 % 2;
        int i3 = f9100c + 5;
        int i4 = i3 % 128;
        f9099b = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.governmentValidation;
        int i5 = i4 + 7;
        f9100c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 4 / 0;
        }
        return z2;
    }

    public final boolean getManualCorrection() {
        int i2 = 2 % 2;
        int i3 = f9100c;
        int i4 = i3 + 45;
        f9099b = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.manualCorrection;
        int i5 = i3 + 9;
        f9099b = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final boolean getAutoApproveEnabled() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f9099b;
        int i4 = i3 + 41;
        f9100c = i4 % 128;
        if (i4 % 2 != 0) {
            z2 = this.autoApproveEnabled;
            int i5 = 43 / 0;
        } else {
            z2 = this.autoApproveEnabled;
        }
        int i6 = i3 + 103;
        f9100c = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final com.incode.welcome_sdk.data.remote.beans.a getAutoApproveLevel() {
        int i2 = 2 % 2;
        int i3 = f9100c + 7;
        f9099b = i3 % 128;
        int i4 = i3 % 2;
        com.incode.welcome_sdk.data.remote.beans.a aVar = this.autoApproveLevel;
        if (i4 == 0) {
            int i5 = 57 / 0;
        }
        return aVar;
    }

    public final String getRedirectUrl() {
        int i2 = 2 % 2;
        int i3 = f9099b + 113;
        int i4 = i3 % 128;
        f9100c = i4;
        int i5 = i3 % 2;
        String str = this.redirectUrl;
        int i6 = i4 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f9099b = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final boolean getCheckMinVideoLengthRequired() {
        int i2 = 2 % 2;
        int i3 = f9099b + 93;
        int i4 = i3 % 128;
        f9100c = i4;
        int i5 = i3 % 2;
        boolean z2 = this.checkMinVideoLengthRequired;
        int i6 = i4 + 3;
        f9099b = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final boolean getCheckTutorials() {
        int i2 = 2 % 2;
        int i3 = f9099b + 59;
        f9100c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.checkTutorials;
        }
        throw null;
    }

    public final boolean getCheckAuthorization() {
        int i2 = 2 % 2;
        int i3 = f9099b + 53;
        int i4 = i3 % 128;
        f9100c = i4;
        int i5 = i3 % 2;
        boolean z2 = this.checkAuthorization;
        int i6 = i4 + 33;
        f9099b = i6 % 128;
        if (i6 % 2 != 0) {
            return z2;
        }
        throw null;
    }

    public final boolean getCheckLiveness() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f9100c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        int i4 = i3 % 128;
        f9099b = i4;
        if (i3 % 2 == 0) {
            z2 = this.checkLiveness;
            int i5 = 37 / 0;
        } else {
            z2 = this.checkLiveness;
        }
        int i6 = i4 + 45;
        f9100c = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getCheckIdScan() {
        int i2 = 2 % 2;
        int i3 = f9099b + 39;
        f9100c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.checkIdScan;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getCheckDocumentScan() {
        int i2 = 2 % 2;
        int i3 = f9099b;
        int i4 = i3 + 77;
        f9100c = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.checkDocumentScan;
        int i6 = i3 + 9;
        f9100c = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean getCheckVoiceConsent() {
        int i2 = 2 % 2;
        int i3 = f9100c;
        int i4 = i3 + 23;
        f9099b = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.checkVoiceConsent;
        int i6 = i3 + 53;
        f9099b = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final int getQuestionsCount() {
        int i2 = 2 % 2;
        int i3 = f9100c + 19;
        int i4 = i3 % 128;
        f9099b = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        int i5 = this.questionsCount;
        int i6 = i4 + 91;
        f9100c = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        r4 = (com.incode.welcome_sdk.data.remote.beans.Flow.c) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        r1 = com.incode.welcome_sdk.data.remote.beans.Flow.f9099b + 115;
        com.incode.welcome_sdk.data.remote.beans.Flow.f9100c = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if ((r1 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        r1 = r4.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
    
        if ((r1 instanceof com.incode.welcome_sdk.data.remote.beans.q.ac) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        r3 = (com.incode.welcome_sdk.data.remote.beans.q.ac) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (r3 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        return r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        r1 = com.incode.welcome_sdk.data.remote.beans.Flow.f9100c + 101;
        com.incode.welcome_sdk.data.remote.beans.Flow.f9099b = r1 % 128;
        r1 = r1 % 2;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        r4.c();
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasUseAsSelfieConfiguration() {
        /*
            r6 = this;
            r5 = 2
            int r0 = r5 % r5
            int r0 = com.incode.welcome_sdk.data.remote.beans.Flow.f9099b
            int r1 = r0 + 77
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.Flow.f9100c = r0
            int r1 = r1 % r5
            r3 = 0
            if (r1 != 0) goto L82
            java.util.LinkedHashSet<com.incode.welcome_sdk.data.remote.beans.Flow$c> r0 = r6.modules
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r2 = r0.iterator()
        L17:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L73
            int r0 = com.incode.welcome_sdk.data.remote.beans.Flow.f9099b
            int r1 = r0 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.Flow.f9100c = r0
            int r1 = r1 % r5
            java.lang.Object r4 = r2.next()
            r0 = r4
            com.incode.welcome_sdk.data.remote.beans.Flow$c r0 = (com.incode.welcome_sdk.data.remote.beans.Flow.c) r0
            com.incode.welcome_sdk.modules.Modules r1 = r0.b()
            com.incode.welcome_sdk.modules.Modules r0 = com.incode.welcome_sdk.modules.Modules.VIDEO_ONBOARDING
            if (r1 != r0) goto L17
            int r2 = com.incode.welcome_sdk.data.remote.beans.Flow.f9099b
            int r1 = r2 + 57
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.Flow.f9100c = r0
            int r1 = r1 % r5
            int r1 = r2 + 15
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.Flow.f9100c = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L7e
        L47:
            com.incode.welcome_sdk.data.remote.beans.Flow$c r4 = (com.incode.welcome_sdk.data.remote.beans.Flow.c) r4
            if (r4 == 0) goto L68
            int r0 = com.incode.welcome_sdk.data.remote.beans.Flow.f9099b
            int r1 = r0 + 115
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.Flow.f9100c = r0
            int r1 = r1 % r5
            if (r1 != 0) goto L77
            com.incode.welcome_sdk.data.remote.beans.q r1 = r4.c()
        L5a:
            boolean r0 = r1 instanceof com.incode.welcome_sdk.data.remote.beans.q.ac
            if (r0 == 0) goto L61
            r3 = r1
            com.incode.welcome_sdk.data.remote.beans.q$ac r3 = (com.incode.welcome_sdk.data.remote.beans.q.ac) r3
        L61:
            if (r3 == 0) goto L75
            boolean r0 = r3.c()
            return r0
        L68:
            int r0 = com.incode.welcome_sdk.data.remote.beans.Flow.f9100c
            int r1 = r0 + 101
            int r0 = r1 % 128
            com.incode.welcome_sdk.data.remote.beans.Flow.f9099b = r0
            int r1 = r1 % r5
            r1 = r3
            goto L5a
        L73:
            r4 = r3
            goto L47
        L75:
            r0 = 0
            return r0
        L77:
            r4.c()
            r3.hashCode()
            throw r3
        L7e:
            r3.hashCode()
            throw r3
        L82:
            java.util.LinkedHashSet<com.incode.welcome_sdk.data.remote.beans.Flow$c> r0 = r6.modules
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r0.iterator()
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.incode.welcome_sdk.data.remote.beans.Flow.hasUseAsSelfieConfiguration():boolean");
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9104a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static int f9105c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f9106e = new d(0);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static int f9107f = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f9108h = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f9109b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Modules f9110d;

        public static final class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static int f9111a = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static int f9112b = 0;

            private d() {
            }

            @JvmStatic
            public static c c(JSONObject jSONObject) {
                Modules modules;
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(jSONObject, "");
                String strOptString = jSONObject.optString("moduleKey");
                Modules[] modulesArrValues = Modules.values();
                int length = modulesArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        modules = null;
                        break;
                    }
                    int i4 = f9111a + 79;
                    f9112b = i4 % 128;
                    if (i4 % 2 != 0) {
                        Intrinsics.areEqual(modulesArrValues[i3].name(), strOptString);
                        throw null;
                    }
                    modules = modulesArrValues[i3];
                    if (Intrinsics.areEqual(modules.name(), strOptString)) {
                        break;
                    }
                    i3++;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("moduleConfiguration");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                if (modules == null) {
                    return null;
                }
                q.b bVar = q.f9760c;
                c cVar = new c(modules, q.b.e(modules, jSONObjectOptJSONObject));
                int i5 = f9112b + 39;
                f9111a = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 17 / 0;
                }
                return cVar;
            }

            public /* synthetic */ d(byte b2) {
                this();
            }
        }

        public c(Modules modules, q qVar) {
            Intrinsics.checkNotNullParameter(modules, "");
            Intrinsics.checkNotNullParameter(qVar, "");
            this.f9110d = modules;
            this.f9109b = qVar;
        }

        public final Modules b() {
            int i2 = 2 % 2;
            int i3 = f9105c;
            int i4 = i3 + 55;
            f9104a = i4 % 128;
            int i5 = i4 % 2;
            Modules modules = this.f9110d;
            int i6 = i3 + 53;
            f9104a = i6 % 128;
            if (i6 % 2 == 0) {
                return modules;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final q c() {
            int i2 = 2 % 2;
            int i3 = f9105c + 55;
            f9104a = i3 % 128;
            if (i3 % 2 == 0) {
                return this.f9109b;
            }
            throw null;
        }

        static {
            int i2 = f9108h + 37;
            f9107f = i2 % 128;
            int i3 = i2 % 2;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f9102a = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f9103e = 0;

        private a() {
        }

        @JvmStatic
        public static Flow b(ResponseBody responseBody) throws JSONException, IOException {
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(responseBody, "");
            Flow flowC = c(new JSONObject(responseBody.string()));
            int i3 = f9103e + 75;
            f9102a = i3 % 128;
            int i4 = i3 % 2;
            return flowC;
        }

        @JvmStatic
        public static Flow c(JSONObject jSONObject) throws JSONException {
            JSONObject jSONObject2;
            c cVarC;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            if (!jSONObject.optBoolean("active")) {
                return null;
            }
            JSONArray jSONArrayB = com.incode.welcome_sdk.commons.extensions.i.b(jSONObject, "flowModules");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = jSONArrayB.length();
            for (int i3 = 0; i3 < length; i3++) {
                Object obj = jSONArrayB.get(i3);
                if (obj instanceof JSONObject) {
                    int i4 = f9103e + 11;
                    f9102a = i4 % 128;
                    if (i4 % 2 == 0) {
                        jSONObject2 = (JSONObject) obj;
                        int i5 = 15 / 0;
                    } else {
                        jSONObject2 = (JSONObject) obj;
                    }
                } else {
                    int i6 = f9103e + 17;
                    f9102a = i6 % 128;
                    int i7 = i6 % 2;
                    jSONObject2 = null;
                }
                if (jSONObject2 != null) {
                    c.d dVar = c.f9106e;
                    cVarC = c.d.c(jSONObject2);
                    int i8 = f9103e + 33;
                    f9102a = i8 % 128;
                    int i9 = i8 % 2;
                } else {
                    cVarC = null;
                }
                if (cVarC != null) {
                    linkedHashSet.add(cVarC);
                }
            }
            String strOptString = jSONObject.optString("_id");
            String strOptString2 = jSONObject.optString("name");
            boolean zOptBoolean = jSONObject.optBoolean("autoApproveEnabled");
            boolean zOptBoolean2 = jSONObject.optBoolean("checkMinVideoLengthRequired", true);
            boolean zOptBoolean3 = jSONObject.optBoolean("checkTutorials");
            boolean zOptBoolean4 = jSONObject.optBoolean("checkAuthorization");
            boolean zOptBoolean5 = jSONObject.optBoolean("checkLiveness");
            boolean zOptBoolean6 = jSONObject.optBoolean("checkIdScan");
            boolean zOptBoolean7 = jSONObject.optBoolean("checkDocumentScan");
            boolean zOptBoolean8 = jSONObject.optBoolean("checkVoiceConsent");
            int iOptInt = jSONObject.optInt("questionsCount");
            String strOptString3 = jSONObject.optString("signatureProvider", "INCODE");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "");
            String upperCase = strOptString3.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
            bs bsVarValueOf = bs.valueOf(upperCase);
            String strOptString4 = jSONObject.optString("autoApproveLevel", "CONVERSION");
            Intrinsics.checkNotNullExpressionValue(strOptString4, "");
            String upperCase2 = strOptString4.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "");
            com.incode.welcome_sdk.data.remote.beans.a aVarValueOf = com.incode.welcome_sdk.data.remote.beans.a.valueOf(upperCase2);
            boolean zOptBoolean9 = jSONObject.optBoolean("defaultConfiguration");
            String strOptString5 = jSONObject.optString("description");
            boolean zOptBoolean10 = jSONObject.optBoolean("governmentValidation");
            int iOptInt2 = jSONObject.optInt("numberOfSessions", 1);
            String strOptString6 = jSONObject.optString("liveness", "MEDIUM");
            Intrinsics.checkNotNullExpressionValue(strOptString6, "");
            String upperCase3 = strOptString6.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "");
            bo boVarValueOf = bo.valueOf(upperCase3);
            String strOptString7 = jSONObject.optString("severityLevel", "MEDIUM");
            Intrinsics.checkNotNullExpressionValue(strOptString7, "");
            String upperCase4 = strOptString7.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase4, "");
            bo boVarValueOf2 = bo.valueOf(upperCase4);
            double dOptDouble = jSONObject.optDouble("idSecurityLevel", 1.0d);
            boolean zOptBoolean11 = jSONObject.optBoolean("idValidation");
            boolean zOptBoolean12 = jSONObject.optBoolean("manualCorrection");
            String strOptString8 = jSONObject.optString("redirectUrl");
            Intrinsics.checkNotNull(strOptString);
            Intrinsics.checkNotNull(strOptString2);
            Intrinsics.checkNotNull(strOptString5);
            Intrinsics.checkNotNull(strOptString8);
            return new Flow(strOptString, strOptString2, strOptString5, true, iOptInt2, linkedHashSet, zOptBoolean9, boVarValueOf, bsVarValueOf, boVarValueOf2, dOptDouble, zOptBoolean11, zOptBoolean10, zOptBoolean12, zOptBoolean, aVarValueOf, strOptString8, zOptBoolean2, zOptBoolean3, zOptBoolean4, zOptBoolean5, zOptBoolean6, zOptBoolean7, zOptBoolean8, iOptInt);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        int i2 = f9101d + 125;
        f9098a = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @JvmStatic
    public static final Flow parseFlowOrNull(JSONObject jSONObject) throws JSONException {
        int i2 = 2 % 2;
        int i3 = f9100c + 113;
        f9099b = i3 % 128;
        int i4 = i3 % 2;
        Flow flowC = a.c(jSONObject);
        int i5 = f9099b + 45;
        f9100c = i5 % 128;
        int i6 = i5 % 2;
        return flowC;
    }

    @JvmStatic
    public static final Flow parse(ResponseBody responseBody) throws JSONException, IOException {
        int i2 = 2 % 2;
        int i3 = f9099b + 91;
        f9100c = i3 % 128;
        int i4 = i3 % 2;
        Flow flowB = a.b(responseBody);
        int i5 = f9099b + 121;
        f9100c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
        return flowB;
    }

    public final boolean equals(Object obj) {
        int i2 = 2 % 2;
        if (this == obj) {
            int i3 = f9100c + 3;
            f9099b = i3 % 128;
            int i4 = i3 % 2;
            return true;
        }
        if (!(obj instanceof Flow)) {
            return false;
        }
        Flow flow = (Flow) obj;
        if (!Intrinsics.areEqual(this.id, flow.id)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.name, flow.name)) {
            int i5 = f9099b + 33;
            f9100c = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.description, flow.description)) {
            int i7 = f9100c + 15;
            f9099b = i7 % 128;
            return i7 % 2 == 0;
        }
        if (this.active != flow.active) {
            int i8 = f9100c + 111;
            f9099b = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.numberOfSessions != flow.numberOfSessions || !Intrinsics.areEqual(this.modules, flow.modules) || this.defaultConfiguration != flow.defaultConfiguration || this.liveness != flow.liveness) {
            return false;
        }
        if (this.signatureProvider != flow.signatureProvider) {
            int i10 = f9100c + 7;
            f9099b = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (this.severityLevel != flow.severityLevel || Double.compare(this.idSecurityLevel, flow.idSecurityLevel) != 0 || this.idValidation != flow.idValidation || this.governmentValidation != flow.governmentValidation || this.manualCorrection != flow.manualCorrection || this.autoApproveEnabled != flow.autoApproveEnabled || this.autoApproveLevel != flow.autoApproveLevel || !Intrinsics.areEqual(this.redirectUrl, flow.redirectUrl) || this.checkMinVideoLengthRequired != flow.checkMinVideoLengthRequired || this.checkTutorials != flow.checkTutorials || this.checkAuthorization != flow.checkAuthorization) {
            return false;
        }
        if (this.checkLiveness != flow.checkLiveness) {
            int i12 = f9100c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            f9099b = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (this.checkIdScan != flow.checkIdScan) {
            int i14 = f9100c + 47;
            f9099b = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (this.checkDocumentScan == flow.checkDocumentScan) {
            return this.checkVoiceConsent == flow.checkVoiceConsent && this.questionsCount == flow.questionsCount;
        }
        int i16 = f9100c + 47;
        f9099b = i16 % 128;
        int i17 = i16 % 2;
        return false;
    }

    public final int hashCode() {
        int i2 = 2 % 2;
        int i3 = f9099b + 13;
        f9100c = i3 % 128;
        int i4 = i3 % 2;
        int iHashCode = ((((((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.active)) * 31) + Integer.hashCode(this.numberOfSessions)) * 31) + this.modules.hashCode()) * 31) + Boolean.hashCode(this.defaultConfiguration)) * 31) + this.liveness.hashCode()) * 31;
        bs bsVar = this.signatureProvider;
        int iHashCode2 = ((((((((((((((((((((((((((((((((iHashCode + (bsVar == null ? 0 : bsVar.hashCode())) * 31) + this.severityLevel.hashCode()) * 31) + Double.hashCode(this.idSecurityLevel)) * 31) + Boolean.hashCode(this.idValidation)) * 31) + Boolean.hashCode(this.governmentValidation)) * 31) + Boolean.hashCode(this.manualCorrection)) * 31) + Boolean.hashCode(this.autoApproveEnabled)) * 31) + this.autoApproveLevel.hashCode()) * 31) + this.redirectUrl.hashCode()) * 31) + Boolean.hashCode(this.checkMinVideoLengthRequired)) * 31) + Boolean.hashCode(this.checkTutorials)) * 31) + Boolean.hashCode(this.checkAuthorization)) * 31) + Boolean.hashCode(this.checkLiveness)) * 31) + Boolean.hashCode(this.checkIdScan)) * 31) + Boolean.hashCode(this.checkDocumentScan)) * 31) + Boolean.hashCode(this.checkVoiceConsent)) * 31) + Integer.hashCode(this.questionsCount);
        int i5 = f9100c + 25;
        f9099b = i5 % 128;
        if (i5 % 2 != 0) {
            return iHashCode2;
        }
        throw null;
    }

    public final String toString() {
        int i2 = 2 % 2;
        int i3 = f9100c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f9099b = i3 % 128;
        int i4 = i3 % 2;
        String str = "Flow(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", active=" + this.active + ", numberOfSessions=" + this.numberOfSessions + ", modules=" + this.modules + ", defaultConfiguration=" + this.defaultConfiguration + ", liveness=" + this.liveness + ", signatureProvider=" + this.signatureProvider + ", severityLevel=" + this.severityLevel + ", idSecurityLevel=" + this.idSecurityLevel + ", idValidation=" + this.idValidation + ", governmentValidation=" + this.governmentValidation + ", manualCorrection=" + this.manualCorrection + ", autoApproveEnabled=" + this.autoApproveEnabled + ", autoApproveLevel=" + this.autoApproveLevel + ", redirectUrl=" + this.redirectUrl + ", checkMinVideoLengthRequired=" + this.checkMinVideoLengthRequired + ", checkTutorials=" + this.checkTutorials + ", checkAuthorization=" + this.checkAuthorization + ", checkLiveness=" + this.checkLiveness + ", checkIdScan=" + this.checkIdScan + ", checkDocumentScan=" + this.checkDocumentScan + ", checkVoiceConsent=" + this.checkVoiceConsent + ", questionsCount=" + this.questionsCount + ")";
        int i5 = f9099b + 47;
        f9100c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Flow copy$default(Flow flow, String str, String str2, String str3, boolean z2, int i2, LinkedHashSet linkedHashSet, boolean z3, bo boVar, bs bsVar, bo boVar2, double d2, boolean z4, boolean z5, boolean z6, boolean z7, com.incode.welcome_sdk.data.remote.beans.a aVar, String str4, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i3, int i4, Object obj) {
        bs bsVar2 = bsVar;
        String str5 = str;
        int i5 = i2;
        bo boVar3 = boVar;
        boolean z15 = z2;
        double d3 = d2;
        boolean z16 = z3;
        String str6 = str3;
        bo boVar4 = boVar2;
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        String str7 = str2;
        int i6 = i3;
        boolean z17 = z14;
        boolean z18 = z13;
        boolean z19 = z7;
        boolean z20 = z9;
        boolean z21 = z6;
        boolean z22 = z8;
        boolean z23 = z12;
        String str8 = str4;
        com.incode.welcome_sdk.data.remote.beans.a aVar2 = aVar;
        boolean z24 = z11;
        boolean z25 = z10;
        boolean z26 = z5;
        boolean z27 = z4;
        int i7 = 2 % 2;
        int i8 = f9100c + 99;
        int i9 = i8 % 128;
        f9099b = i9;
        int i10 = i8 % 2;
        if ((i4 & 1) != 0) {
            str5 = flow.id;
        }
        if ((i4 & 2) != 0) {
            str7 = flow.name;
        }
        if ((i4 & 4) != 0) {
            str6 = flow.description;
        }
        if ((i4 & 8) != 0) {
            int i11 = i9 + 9;
            f9100c = i11 % 128;
            int i12 = i11 % 2;
            z15 = flow.active;
        }
        if ((i4 & 16) != 0) {
            i5 = flow.numberOfSessions;
        }
        if ((i4 & 32) != 0) {
            linkedHashSet2 = flow.modules;
        }
        if ((i4 & 64) != 0) {
            z16 = flow.defaultConfiguration;
        }
        if ((i4 & 128) != 0) {
            int i13 = i9 + 93;
            f9100c = i13 % 128;
            int i14 = i13 % 2;
            boVar3 = flow.liveness;
        }
        if ((i4 & 256) != 0) {
            bsVar2 = flow.signatureProvider;
        }
        if ((i4 & 512) != 0) {
            boVar4 = flow.severityLevel;
        }
        if ((i4 & 1024) != 0) {
            d3 = flow.idSecurityLevel;
        }
        if ((i4 & 2048) != 0) {
            int i15 = i9 + 11;
            f9100c = i15 % 128;
            int i16 = i15 % 2;
            z27 = flow.idValidation;
            if (i16 != 0) {
                int i17 = 48 / 0;
            }
        }
        if ((i4 & 4096) != 0) {
            z26 = flow.governmentValidation;
        }
        if ((i4 & 8192) != 0) {
            int i18 = f9100c + 7;
            f9099b = i18 % 128;
            int i19 = i18 % 2;
            z21 = flow.manualCorrection;
            if (i19 == 0) {
                int i20 = 13 / 0;
            }
        }
        if ((i4 & 16384) != 0) {
            z19 = flow.autoApproveEnabled;
        }
        if ((32768 & i4) != 0) {
            aVar2 = flow.autoApproveLevel;
        }
        if ((65536 & i4) != 0) {
            int i21 = f9100c + 15;
            f9099b = i21 % 128;
            int i22 = i21 % 2;
            str8 = flow.redirectUrl;
            if (i22 == 0) {
                int i23 = 34 / 0;
            }
        }
        if ((131072 & i4) != 0) {
            z22 = flow.checkMinVideoLengthRequired;
        }
        if ((262144 & i4) != 0) {
            z20 = flow.checkTutorials;
        }
        if ((524288 & i4) != 0) {
            int i24 = f9100c + 39;
            f9099b = i24 % 128;
            int i25 = i24 % 2;
            z25 = flow.checkAuthorization;
            if (i25 == 0) {
                int i26 = 40 / 0;
            }
        }
        if ((1048576 & i4) != 0) {
            int i27 = f9099b + 7;
            f9100c = i27 % 128;
            int i28 = i27 % 2;
            z24 = flow.checkLiveness;
        }
        if ((2097152 & i4) != 0) {
            z23 = flow.checkIdScan;
        }
        if ((4194304 & i4) != 0) {
            z18 = flow.checkDocumentScan;
        }
        if ((8388608 & i4) != 0) {
            z17 = flow.checkVoiceConsent;
        }
        if ((i4 & 16777216) != 0) {
            i6 = flow.questionsCount;
        }
        return flow.copy(str5, str7, str6, z15, i5, linkedHashSet2, z16, boVar3, bsVar2, boVar4, d3, z27, z26, z21, z19, aVar2, str8, z22, z20, z25, z24, z23, z18, z17, i6);
    }

    public final Flow copy(String str, String str2, String str3, boolean z2, int i2, LinkedHashSet<c> linkedHashSet, boolean z3, bo boVar, bs bsVar, bo boVar2, double d2, boolean z4, boolean z5, boolean z6, boolean z7, com.incode.welcome_sdk.data.remote.beans.a aVar, String str4, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i3) {
        int i4 = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(linkedHashSet, "");
        Intrinsics.checkNotNullParameter(boVar, "");
        Intrinsics.checkNotNullParameter(boVar2, "");
        Intrinsics.checkNotNullParameter(aVar, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Flow flow = new Flow(str, str2, str3, z2, i2, linkedHashSet, z3, boVar, bsVar, boVar2, d2, z4, z5, z6, z7, aVar, str4, z8, z9, z10, z11, z12, z13, z14, i3);
        int i5 = f9100c + 117;
        f9099b = i5 % 128;
        int i6 = i5 % 2;
        return flow;
    }

    public final int component25() {
        int i2 = 2 % 2;
        int i3 = f9100c + 125;
        int i4 = i3 % 128;
        f9099b = i4;
        int i5 = i3 % 2;
        int i6 = this.questionsCount;
        int i7 = i4 + 1;
        f9100c = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 55 / 0;
        }
        return i6;
    }

    public final boolean component24() {
        int i2 = 2 % 2;
        int i3 = f9099b + 43;
        int i4 = i3 % 128;
        f9100c = i4;
        int i5 = i3 % 2;
        boolean z2 = this.checkVoiceConsent;
        int i6 = i4 + 101;
        f9099b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 12 / 0;
        }
        return z2;
    }

    public final boolean component23() {
        int i2 = 2 % 2;
        int i3 = f9100c + 91;
        int i4 = i3 % 128;
        f9099b = i4;
        int i5 = i3 % 2;
        boolean z2 = this.checkDocumentScan;
        int i6 = i4 + 55;
        f9100c = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final boolean component22() {
        int i2 = 2 % 2;
        int i3 = f9099b + 17;
        f9100c = i3 % 128;
        int i4 = i3 % 2;
        boolean z2 = this.checkIdScan;
        if (i4 != 0) {
            int i5 = 33 / 0;
        }
        return z2;
    }

    public final boolean component21() {
        int i2 = 2 % 2;
        int i3 = f9099b + 7;
        f9100c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.checkLiveness;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component20() {
        int i2 = 2 % 2;
        int i3 = f9099b;
        int i4 = i3 + 43;
        f9100c = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.checkAuthorization;
        int i6 = i3 + 3;
        f9100c = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean component19() {
        int i2 = 2 % 2;
        int i3 = f9100c + 121;
        int i4 = i3 % 128;
        f9099b = i4;
        int i5 = i3 % 2;
        boolean z2 = this.checkTutorials;
        int i6 = i4 + 41;
        f9100c = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component18() {
        boolean z2;
        int i2 = 2 % 2;
        int i3 = f9099b;
        int i4 = i3 + 7;
        f9100c = i4 % 128;
        if (i4 % 2 != 0) {
            z2 = this.checkMinVideoLengthRequired;
            int i5 = 34 / 0;
        } else {
            z2 = this.checkMinVideoLengthRequired;
        }
        int i6 = i3 + 9;
        f9100c = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component17() {
        int i2 = 2 % 2;
        int i3 = f9099b;
        int i4 = i3 + 65;
        f9100c = i4 % 128;
        int i5 = i4 % 2;
        String str = this.redirectUrl;
        int i6 = i3 + 35;
        f9100c = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final com.incode.welcome_sdk.data.remote.beans.a component16() {
        com.incode.welcome_sdk.data.remote.beans.a aVar;
        int i2 = 2 % 2;
        int i3 = f9100c;
        int i4 = i3 + 31;
        f9099b = i4 % 128;
        if (i4 % 2 == 0) {
            aVar = this.autoApproveLevel;
            int i5 = 80 / 0;
        } else {
            aVar = this.autoApproveLevel;
        }
        int i6 = i3 + 97;
        f9099b = i6 % 128;
        int i7 = i6 % 2;
        return aVar;
    }

    public final boolean component15() {
        int i2 = 2 % 2;
        int i3 = f9100c + 117;
        int i4 = i3 % 128;
        f9099b = i4;
        int i5 = i3 % 2;
        boolean z2 = this.autoApproveEnabled;
        int i6 = i4 + 101;
        f9100c = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean component14() {
        int i2 = 2 % 2;
        int i3 = f9100c + 115;
        int i4 = i3 % 128;
        f9099b = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.manualCorrection;
        int i5 = i4 + 15;
        f9100c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return z2;
    }

    public final boolean component13() {
        int i2 = 2 % 2;
        int i3 = f9100c + 27;
        f9099b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.governmentValidation;
        }
        throw null;
    }

    public final boolean component12() {
        int i2 = 2 % 2;
        int i3 = f9099b;
        int i4 = i3 + 25;
        f9100c = i4 % 128;
        if (i4 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.idValidation;
        int i5 = i3 + 51;
        f9100c = i5 % 128;
        int i6 = i5 % 2;
        return z2;
    }

    public final double component11() {
        int i2 = 2 % 2;
        int i3 = f9100c;
        int i4 = i3 + 103;
        f9099b = i4 % 128;
        int i5 = i4 % 2;
        double d2 = this.idSecurityLevel;
        int i6 = i3 + 19;
        f9099b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 89 / 0;
        }
        return d2;
    }

    public final bo component10() {
        int i2 = 2 % 2;
        int i3 = f9100c;
        int i4 = i3 + 61;
        f9099b = i4 % 128;
        int i5 = i4 % 2;
        bo boVar = this.severityLevel;
        int i6 = i3 + 5;
        f9099b = i6 % 128;
        int i7 = i6 % 2;
        return boVar;
    }

    public final bs component9() {
        int i2 = 2 % 2;
        int i3 = f9100c;
        int i4 = i3 + 65;
        f9099b = i4 % 128;
        int i5 = i4 % 2;
        bs bsVar = this.signatureProvider;
        int i6 = i3 + 15;
        f9099b = i6 % 128;
        int i7 = i6 % 2;
        return bsVar;
    }

    public final bo component8() {
        int i2 = 2 % 2;
        int i3 = f9100c + 75;
        f9099b = i3 % 128;
        int i4 = i3 % 2;
        bo boVar = this.liveness;
        if (i4 == 0) {
            int i5 = 92 / 0;
        }
        return boVar;
    }

    public final boolean component7() {
        int i2 = 2 % 2;
        int i3 = f9099b;
        int i4 = i3 + 9;
        f9100c = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.defaultConfiguration;
        int i6 = i3 + 59;
        f9100c = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final LinkedHashSet<c> component6() {
        int i2 = 2 % 2;
        int i3 = f9099b;
        int i4 = i3 + 41;
        f9100c = i4 % 128;
        int i5 = i4 % 2;
        LinkedHashSet<c> linkedHashSet = this.modules;
        int i6 = i3 + 9;
        f9100c = i6 % 128;
        if (i6 % 2 == 0) {
            return linkedHashSet;
        }
        throw null;
    }

    public final int component5() {
        int i2 = 2 % 2;
        int i3 = f9099b + 33;
        f9100c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.numberOfSessions;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component4() {
        int i2 = 2 % 2;
        int i3 = f9099b;
        int i4 = i3 + 11;
        f9100c = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.active;
        int i6 = i3 + 51;
        f9100c = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final String component3() {
        int i2 = 2 % 2;
        int i3 = f9100c + 41;
        f9099b = i3 % 128;
        if (i3 % 2 != 0) {
            return this.description;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i2 = 2 % 2;
        int i3 = f9099b + 61;
        int i4 = i3 % 128;
        f9100c = i4;
        int i5 = i3 % 2;
        String str = this.name;
        int i6 = i4 + 37;
        f9099b = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 40 / 0;
        }
        return str;
    }

    public final String component1() {
        int i2 = 2 % 2;
        int i3 = f9099b + 81;
        f9100c = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        if (i4 != 0) {
            int i5 = 74 / 0;
        }
        return str;
    }
}
