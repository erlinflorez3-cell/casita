package com.incode.welcome_sdk;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2ParameterSpec;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SessionConfig {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: b */
    private static int f4392b = 0;

    /* JADX INFO: renamed from: c */
    private static int f4393c = 0;

    /* JADX INFO: renamed from: d */
    private static int f4394d = 1;

    /* JADX INFO: renamed from: e */
    private static int f4395e = 1;

    /* JADX INFO: renamed from: a */
    private final boolean f4396a;
    private final String configurationId;
    private final Map<String, String> customFields;
    private final boolean downloadImagesEnabled;
    private final E2eEncryptionAlgorithm e2eEncryptionAlgorithm;
    private final String externalCustomerId;
    private final String externalId;
    private final String externalToken;
    private final String interviewId;
    private final String languageCode;
    private final boolean mergeSessionRecordings;
    private final String queueName;
    private final List<OnboardingValidationModule> validationModuleList;

    private SessionConfig(Builder builder) {
        this.interviewId = builder.getInterviewId$onboard_release();
        this.configurationId = builder.getConfigurationId$onboard_release();
        this.validationModuleList = CollectionsKt.toMutableList((Collection) builder.getValidationModuleList$onboard_release());
        this.queueName = builder.getQueueName$onboard_release();
        this.externalId = builder.getExternalId$onboard_release();
        this.externalCustomerId = builder.getExternalCustomerId$onboard_release();
        this.externalToken = builder.getExternalToken$onboard_release();
        this.languageCode = builder.getLanguageCode$onboard_release();
        this.customFields = builder.getCustomFields$onboard_release();
        this.mergeSessionRecordings = builder.getMergeSessionRecordings$onboard_release();
        this.downloadImagesEnabled = builder.getDownloadImagesEnabled$onboard_release();
        this.f4396a = builder.getI();
        this.e2eEncryptionAlgorithm = builder.getE2eEncryptionAlgorithm$onboard_release();
    }

    public static final /* synthetic */ boolean access$getDownloadImagesEnabled$p(SessionConfig sessionConfig) {
        int i2 = 2 % 2;
        int i3 = f4394d;
        int i4 = i3 + 67;
        f4393c = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = sessionConfig.downloadImagesEnabled;
        int i6 = i3 + 123;
        f4393c = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 88 / 0;
        }
        return z2;
    }

    public static final /* synthetic */ E2eEncryptionAlgorithm access$getE2eEncryptionAlgorithm$p(SessionConfig sessionConfig) {
        int i2 = 2 % 2;
        int i3 = f4394d;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f4393c = i4 % 128;
        int i5 = i4 % 2;
        E2eEncryptionAlgorithm e2eEncryptionAlgorithm = sessionConfig.e2eEncryptionAlgorithm;
        int i6 = i3 + 89;
        f4393c = i6 % 128;
        if (i6 % 2 == 0) {
            return e2eEncryptionAlgorithm;
        }
        throw null;
    }

    public final String getInterviewId() {
        int i2 = 2 % 2;
        int i3 = f4393c;
        int i4 = i3 + 23;
        f4394d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.interviewId;
        int i6 = i3 + 43;
        f4394d = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String getConfigurationId() {
        int i2 = 2 % 2;
        int i3 = f4393c;
        int i4 = i3 + 69;
        f4394d = i4 % 128;
        int i5 = i4 % 2;
        String str = this.configurationId;
        int i6 = i3 + 111;
        f4394d = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<OnboardingValidationModule> getValidationModuleList() {
        int i2 = 2 % 2;
        int i3 = f4393c;
        int i4 = i3 + 109;
        f4394d = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        List<OnboardingValidationModule> list = this.validationModuleList;
        int i5 = i3 + 81;
        f4394d = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final String getQueueName() {
        int i2 = 2 % 2;
        int i3 = f4394d + 23;
        f4393c = i3 % 128;
        int i4 = i3 % 2;
        String str = this.queueName;
        if (i4 != 0) {
            int i5 = 61 / 0;
        }
        return str;
    }

    public final String getExternalId() {
        int i2 = 2 % 2;
        int i3 = f4393c + 77;
        int i4 = i3 % 128;
        f4394d = i4;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.externalId;
        int i5 = i4 + 27;
        f4393c = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 78 / 0;
        }
        return str;
    }

    public final String getExternalCustomerId() {
        String str;
        int i2 = 2 % 2;
        int i3 = f4393c;
        int i4 = i3 + 45;
        f4394d = i4 % 128;
        if (i4 % 2 == 0) {
            str = this.externalCustomerId;
            int i5 = 38 / 0;
        } else {
            str = this.externalCustomerId;
        }
        int i6 = i3 + 37;
        f4394d = i6 % 128;
        if (i6 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getExternalToken() {
        int i2 = 2 % 2;
        int i3 = f4393c + 79;
        int i4 = i3 % 128;
        f4394d = i4;
        int i5 = i3 % 2;
        String str = this.externalToken;
        int i6 = i4 + 91;
        f4393c = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    public final String getLanguageCode() {
        int i2 = 2 % 2;
        int i3 = f4393c + 11;
        int i4 = i3 % 128;
        f4394d = i4;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.languageCode;
        int i5 = i4 + 41;
        f4393c = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Map<String, String> getCustomFields() {
        Map<String, String> map;
        int i2 = 2 % 2;
        int i3 = f4393c;
        int i4 = i3 + 61;
        f4394d = i4 % 128;
        if (i4 % 2 == 0) {
            map = this.customFields;
            int i5 = 63 / 0;
        } else {
            map = this.customFields;
        }
        int i6 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f4394d = i6 % 128;
        int i7 = i6 % 2;
        return map;
    }

    public final boolean getMergeSessionRecordings() {
        int i2 = 2 % 2;
        int i3 = f4393c + 117;
        int i4 = i3 % 128;
        f4394d = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z2 = this.mergeSessionRecordings;
        int i5 = i4 + 111;
        f4393c = i5 % 128;
        if (i5 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final boolean getA() {
        int i2 = 2 % 2;
        int i3 = f4394d;
        int i4 = i3 + 41;
        f4393c = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f4396a;
        int i6 = i3 + 25;
        f4393c = i6 % 128;
        if (i6 % 2 == 0) {
            return z2;
        }
        throw null;
    }

    public final boolean isDownloadImagesEnabled() {
        int i2 = 2 % 2;
        int i3 = f4394d;
        int i4 = i3 + 31;
        f4393c = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.downloadImagesEnabled;
        int i6 = i3 + 49;
        f4393c = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    public final boolean isE2eEncryptionEnabled() {
        int i2 = 2 % 2;
        int i3 = f4393c + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f4394d = i3 % 128;
        if (i3 % 2 != 0) {
            return getA();
        }
        getA();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final E2eEncryptionAlgorithm getE2eEncryptionAlgorithm() {
        int i2 = 2 % 2;
        int i3 = f4394d;
        int i4 = i3 + 1;
        f4393c = i4 % 128;
        int i5 = i4 % 2;
        E2eEncryptionAlgorithm e2eEncryptionAlgorithm = this.e2eEncryptionAlgorithm;
        int i6 = i3 + 33;
        f4393c = i6 % 128;
        if (i6 % 2 == 0) {
            return e2eEncryptionAlgorithm;
        }
        throw null;
    }

    public static final class E2eEncryptionAlgorithm extends Enum<E2eEncryptionAlgorithm> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ E2eEncryptionAlgorithm[] $VALUES;
        public static final E2eEncryptionAlgorithm SHA1 = new E2eEncryptionAlgorithm("SHA1", 0);
        public static final E2eEncryptionAlgorithm SHA256 = new E2eEncryptionAlgorithm(McElieceCCA2ParameterSpec.DEFAULT_MD, 1);

        /* JADX INFO: renamed from: b */
        private static int f4404b = 1;

        /* JADX INFO: renamed from: c */
        private static int f4405c = 0;

        /* JADX INFO: renamed from: d */
        private static int f4406d = 1;

        /* JADX INFO: renamed from: e */
        private static int f4407e = 0;

        private E2eEncryptionAlgorithm(String str, int i2) {
            super(str, i2);
        }

        static {
            E2eEncryptionAlgorithm[] e2eEncryptionAlgorithmArr$values = $values();
            $VALUES = e2eEncryptionAlgorithmArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(e2eEncryptionAlgorithmArr$values);
            int i2 = f4406d + 99;
            f4405c = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 25 / 0;
            }
        }

        private static final /* synthetic */ E2eEncryptionAlgorithm[] $values() {
            int i2 = 2 % 2;
            int i3 = f4404b + 11;
            int i4 = i3 % 128;
            f4407e = i4;
            int i5 = i3 % 2;
            E2eEncryptionAlgorithm[] e2eEncryptionAlgorithmArr = {SHA1, SHA256};
            int i6 = i4 + 89;
            f4404b = i6 % 128;
            if (i6 % 2 != 0) {
                return e2eEncryptionAlgorithmArr;
            }
            throw null;
        }

        public static EnumEntries<E2eEncryptionAlgorithm> getEntries() {
            int i2 = 2 % 2;
            int i3 = f4407e;
            int i4 = i3 + 71;
            f4404b = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            EnumEntries<E2eEncryptionAlgorithm> enumEntries = $ENTRIES;
            int i5 = i3 + 11;
            f4404b = i5 % 128;
            if (i5 % 2 != 0) {
                return enumEntries;
            }
            throw null;
        }

        public static E2eEncryptionAlgorithm valueOf(String str) {
            int i2 = 2 % 2;
            int i3 = f4407e + 15;
            f4404b = i3 % 128;
            int i4 = i3 % 2;
            E2eEncryptionAlgorithm e2eEncryptionAlgorithm = (E2eEncryptionAlgorithm) Enum.valueOf(E2eEncryptionAlgorithm.class, str);
            if (i4 == 0) {
                throw null;
            }
            int i5 = f4407e + 27;
            f4404b = i5 % 128;
            if (i5 % 2 != 0) {
                return e2eEncryptionAlgorithm;
            }
            throw null;
        }

        public static E2eEncryptionAlgorithm[] values() {
            int i2 = 2 % 2;
            int i3 = f4404b + 73;
            f4407e = i3 % 128;
            int i4 = i3 % 2;
            E2eEncryptionAlgorithm[] e2eEncryptionAlgorithmArr = $VALUES;
            if (i4 == 0) {
                return (E2eEncryptionAlgorithm[]) e2eEncryptionAlgorithmArr.clone();
            }
            throw null;
        }
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a */
        private static int f4397a = 1;

        /* JADX INFO: renamed from: b */
        private static int f4398b = 1;

        /* JADX INFO: renamed from: c */
        private static int f4399c = 0;

        /* JADX INFO: renamed from: e */
        private static int f4400e = 0;
        private String configurationId;
        private Map<String, String> customFields;
        private String externalCustomerId;
        private String externalId;
        private String externalToken;

        /* JADX INFO: renamed from: i */
        private boolean f4401i;
        private String interviewId;
        private String languageCode;
        private boolean mergeSessionRecordings;
        private String queueName;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private List<? extends OnboardingValidationModule> validationModuleList = new ArrayList();
        private boolean downloadImagesEnabled = true;
        private E2eEncryptionAlgorithm e2eEncryptionAlgorithm = E2eEncryptionAlgorithm.SHA1;

        public final String getInterviewId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4400e + 111;
            f4397a = i3 % 128;
            if (i3 % 2 != 0) {
                return this.interviewId;
            }
            throw null;
        }

        public final void setInterviewId$onboard_release(String str) {
            int i2 = 2 % 2;
            int i3 = f4397a + 43;
            f4400e = i3 % 128;
            int i4 = i3 % 2;
            this.interviewId = str;
            if (i4 != 0) {
                throw null;
            }
        }

        public final String getConfigurationId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4400e + 39;
            int i4 = i3 % 128;
            f4397a = i4;
            int i5 = i3 % 2;
            String str = this.configurationId;
            int i6 = i4 + 89;
            f4400e = i6 % 128;
            if (i6 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final void setConfigurationId$onboard_release(String str) {
            int i2 = 2 % 2;
            int i3 = f4397a + 29;
            f4400e = i3 % 128;
            int i4 = i3 % 2;
            this.configurationId = str;
            if (i4 != 0) {
                int i5 = 29 / 0;
            }
        }

        public final List<OnboardingValidationModule> getValidationModuleList$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4397a + 63;
            int i4 = i3 % 128;
            f4400e = i4;
            int i5 = i3 % 2;
            List list = this.validationModuleList;
            int i6 = i4 + 17;
            f4397a = i6 % 128;
            int i7 = i6 % 2;
            return list;
        }

        public final void setValidationModuleList$onboard_release(List<? extends OnboardingValidationModule> list) {
            int i2 = 2 % 2;
            int i3 = f4397a + 105;
            f4400e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            this.validationModuleList = list;
            int i5 = f4397a + 89;
            f4400e = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        }

        public final String getQueueName$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4400e + 73;
            int i4 = i3 % 128;
            f4397a = i4;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.queueName;
            int i5 = i4 + 97;
            f4400e = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 43 / 0;
            }
            return str;
        }

        public final void setQueueName$onboard_release(String str) {
            int i2 = 2 % 2;
            int i3 = f4397a + 71;
            f4400e = i3 % 128;
            int i4 = i3 % 2;
            this.queueName = str;
            if (i4 != 0) {
                int i5 = 82 / 0;
            }
        }

        public final String getExternalId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4400e;
            int i4 = i3 + 3;
            f4397a = i4 % 128;
            int i5 = i4 % 2;
            String str = this.externalId;
            int i6 = i3 + 91;
            f4397a = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 95 / 0;
            }
            return str;
        }

        public final void setExternalId$onboard_release(String str) {
            int i2 = 2 % 2;
            int i3 = f4397a;
            int i4 = i3 + 83;
            f4400e = i4 % 128;
            int i5 = i4 % 2;
            this.externalId = str;
            if (i5 != 0) {
                int i6 = 25 / 0;
            }
            int i7 = i3 + 25;
            f4400e = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
        }

        public final String getExternalCustomerId$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4397a;
            int i4 = i3 + 71;
            f4400e = i4 % 128;
            int i5 = i4 % 2;
            String str = this.externalCustomerId;
            int i6 = i3 + 67;
            f4400e = i6 % 128;
            if (i6 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final void setExternalCustomerId$onboard_release(String str) {
            int i2 = 2 % 2;
            int i3 = f4397a + 109;
            f4400e = i3 % 128;
            int i4 = i3 % 2;
            this.externalCustomerId = str;
            if (i4 != 0) {
                throw null;
            }
        }

        public final String getExternalToken$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4400e + 121;
            int i4 = i3 % 128;
            f4397a = i4;
            int i5 = i3 % 2;
            String str = this.externalToken;
            int i6 = i4 + 19;
            f4400e = i6 % 128;
            int i7 = i6 % 2;
            return str;
        }

        public final void setExternalToken$onboard_release(String str) {
            int i2 = 2 % 2;
            int i3 = f4397a + 39;
            int i4 = i3 % 128;
            f4400e = i4;
            int i5 = i3 % 2;
            this.externalToken = str;
            int i6 = i4 + 95;
            f4397a = i6 % 128;
            int i7 = i6 % 2;
        }

        public final String getLanguageCode$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4400e + 59;
            f4397a = i3 % 128;
            int i4 = i3 % 2;
            String str = this.languageCode;
            if (i4 == 0) {
                int i5 = 10 / 0;
            }
            return str;
        }

        public final void setLanguageCode$onboard_release(String str) {
            int i2 = 2 % 2;
            int i3 = f4400e + 37;
            int i4 = i3 % 128;
            f4397a = i4;
            int i5 = i3 % 2;
            this.languageCode = str;
            int i6 = i4 + 41;
            f4400e = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        }

        public final Map<String, String> getCustomFields$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4397a + 43;
            int i4 = i3 % 128;
            f4400e = i4;
            int i5 = i3 % 2;
            Map<String, String> map = this.customFields;
            int i6 = i4 + 17;
            f4397a = i6 % 128;
            int i7 = i6 % 2;
            return map;
        }

        public final void setCustomFields$onboard_release(Map<String, String> map) {
            int i2 = 2 % 2;
            int i3 = f4397a + 91;
            f4400e = i3 % 128;
            int i4 = i3 % 2;
            this.customFields = map;
            if (i4 != 0) {
                int i5 = 81 / 0;
            }
        }

        public final boolean getMergeSessionRecordings$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4397a + 57;
            int i4 = i3 % 128;
            f4400e = i4;
            int i5 = i3 % 2;
            boolean z2 = this.mergeSessionRecordings;
            int i6 = i4 + 23;
            f4397a = i6 % 128;
            int i7 = i6 % 2;
            return z2;
        }

        public final void setMergeSessionRecordings$onboard_release(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f4400e + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
            int i4 = i3 % 128;
            f4397a = i4;
            int i5 = i3 % 2;
            this.mergeSessionRecordings = z2;
            int i6 = i4 + 59;
            f4400e = i6 % 128;
            int i7 = i6 % 2;
        }

        public final boolean getDownloadImagesEnabled$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4397a + 19;
            f4400e = i3 % 128;
            if (i3 % 2 == 0) {
                return this.downloadImagesEnabled;
            }
            throw null;
        }

        public final void setDownloadImagesEnabled$onboard_release(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f4400e + 17;
            int i4 = i3 % 128;
            f4397a = i4;
            int i5 = i3 % 2;
            this.downloadImagesEnabled = z2;
            int i6 = i4 + 99;
            f4400e = i6 % 128;
            int i7 = i6 % 2;
        }

        public final boolean getI() {
            int i2 = 2 % 2;
            int i3 = f4397a + 51;
            int i4 = i3 % 128;
            f4400e = i4;
            if (i3 % 2 != 0) {
                throw null;
            }
            boolean z2 = this.f4401i;
            int i5 = i4 + 5;
            f4397a = i5 % 128;
            if (i5 % 2 != 0) {
                return z2;
            }
            throw null;
        }

        public final void setI(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f4400e + 113;
            int i4 = i3 % 128;
            f4397a = i4;
            int i5 = i3 % 2;
            this.f4401i = z2;
            int i6 = i4 + 33;
            f4400e = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 22 / 0;
            }
        }

        public final E2eEncryptionAlgorithm getE2eEncryptionAlgorithm$onboard_release() {
            int i2 = 2 % 2;
            int i3 = f4397a + 61;
            f4400e = i3 % 128;
            if (i3 % 2 == 0) {
                return this.e2eEncryptionAlgorithm;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final void setE2eEncryptionAlgorithm$onboard_release(E2eEncryptionAlgorithm e2eEncryptionAlgorithm) {
            int i2 = 2 % 2;
            int i3 = f4397a + 115;
            f4400e = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(e2eEncryptionAlgorithm, "");
                this.e2eEncryptionAlgorithm = e2eEncryptionAlgorithm;
            } else {
                Intrinsics.checkNotNullParameter(e2eEncryptionAlgorithm, "");
                this.e2eEncryptionAlgorithm = e2eEncryptionAlgorithm;
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public static final class Companion {

            /* JADX INFO: renamed from: a */
            private static int f4402a = 0;

            /* JADX INFO: renamed from: e */
            private static int f4403e = 1;

            private Companion() {
            }

            @JvmStatic
            public final Builder from(SessionConfig sessionConfig) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(sessionConfig, "");
                Builder builder = new Builder();
                builder.setInterviewId$onboard_release(sessionConfig.getInterviewId());
                builder.setConfigurationId$onboard_release(sessionConfig.getConfigurationId());
                builder.setValidationModuleList$onboard_release(sessionConfig.getValidationModuleList());
                builder.setQueueName$onboard_release(sessionConfig.getQueueName());
                builder.setExternalId$onboard_release(sessionConfig.getExternalId());
                builder.setExternalCustomerId$onboard_release(sessionConfig.getExternalCustomerId());
                builder.setExternalToken$onboard_release(sessionConfig.getExternalToken());
                builder.setCustomFields$onboard_release(sessionConfig.getCustomFields());
                builder.setMergeSessionRecordings$onboard_release(sessionConfig.getMergeSessionRecordings());
                builder.setDownloadImagesEnabled$onboard_release(SessionConfig.access$getDownloadImagesEnabled$p(sessionConfig));
                builder.setI(sessionConfig.getA());
                builder.setE2eEncryptionAlgorithm$onboard_release(SessionConfig.access$getE2eEncryptionAlgorithm$p(sessionConfig));
                int i3 = f4403e + 51;
                f4402a = i3 % 128;
                int i4 = i3 % 2;
                return builder;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final Builder setInterviewId(String str) {
            int i2 = 2 % 2;
            int i3 = f4400e + 121;
            f4397a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            this.interviewId = str;
            int i5 = f4400e + 83;
            f4397a = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder setConfigurationId(String str) {
            int i2 = 2 % 2;
            int i3 = f4400e + 61;
            f4397a = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                this.configurationId = str;
                int i4 = 70 / 0;
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                this.configurationId = str;
            }
            return this;
        }

        public final Builder setValidationModuleList(List<? extends OnboardingValidationModule> list) {
            int i2 = 2 % 2;
            int i3 = f4397a + 93;
            f4400e = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(list, "");
                this.validationModuleList = list;
                return this;
            }
            Intrinsics.checkNotNullParameter(list, "");
            this.validationModuleList = list;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Deprecated(message = "This method is deprecated as the region is no longer necessary in the onboarding flow.")
        public final Builder setRegionIsoCode(String str) {
            int i2 = 2 % 2;
            int i3 = f4397a + 65;
            f4400e = i3 % 128;
            if (i3 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                Timber.Forest.w("Builder.setRegionIsoCode() is deprecated as the region is no longer necessary in the onboarding flow.", new Object[1]);
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                Timber.Forest.w("Builder.setRegionIsoCode() is deprecated as the region is no longer necessary in the onboarding flow.", new Object[0]);
            }
            return this;
        }

        public final Builder setQueueName(String str) {
            int i2 = 2 % 2;
            int i3 = f4397a + 87;
            f4400e = i3 % 128;
            if (i3 % 2 != 0) {
                this.queueName = str;
                int i4 = 39 / 0;
            } else {
                this.queueName = str;
            }
            return this;
        }

        public final Builder setExternalId(String str) {
            int i2 = 2 % 2;
            int i3 = f4400e + 69;
            f4397a = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                this.externalId = str;
                int i4 = 29 / 0;
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                this.externalId = str;
            }
            return this;
        }

        public final Builder setExternalCustomerId(String str) {
            int i2 = 2 % 2;
            int i3 = f4397a + 63;
            f4400e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            this.externalCustomerId = str;
            int i5 = f4400e + 19;
            f4397a = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        public final Builder setExternalToken(String str) {
            int i2 = 2 % 2;
            int i3 = f4397a + 125;
            f4400e = i3 % 128;
            if (i3 % 2 == 0) {
                Intrinsics.checkNotNullParameter(str, "");
                this.externalToken = str;
                return this;
            }
            Intrinsics.checkNotNullParameter(str, "");
            this.externalToken = str;
            throw null;
        }

        public final Builder setCustomFields(Map<String, String> map) {
            int i2 = 2 % 2;
            int i3 = f4400e + 71;
            f4397a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(map, "");
            this.customFields = map;
            int i5 = f4397a + 69;
            f4400e = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder setDownloadImagesEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f4400e + 69;
            int i4 = i3 % 128;
            f4397a = i4;
            int i5 = i3 % 2;
            this.downloadImagesEnabled = z2;
            int i6 = i4 + 63;
            f4400e = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final Builder setE2eEncryptionEnabled(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f4400e;
            int i4 = i3 + 121;
            f4397a = i4 % 128;
            int i5 = i4 % 2;
            this.f4401i = z2;
            int i6 = i3 + 73;
            f4397a = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setE2eEncryptionAlgorithm(E2eEncryptionAlgorithm e2eEncryptionAlgorithm) {
            int i2 = 2 % 2;
            int i3 = f4400e + 121;
            f4397a = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(e2eEncryptionAlgorithm, "");
            this.e2eEncryptionAlgorithm = e2eEncryptionAlgorithm;
            int i5 = f4400e + 103;
            f4397a = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final Builder setMergeSessionRecordings(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f4397a + 43;
            int i4 = i3 % 128;
            f4400e = i4;
            int i5 = i3 % 2;
            this.mergeSessionRecordings = z2;
            int i6 = i4 + 83;
            f4397a = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Builder setLanguage(String str) {
            int i2 = 2 % 2;
            int i3 = f4397a + 41;
            f4400e = i3 % 128;
            int i4 = i3 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            this.languageCode = str;
            int i5 = f4397a + 37;
            f4400e = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public final SessionConfig build() {
            int i2 = 2 % 2;
            SessionConfig sessionConfig = new SessionConfig(this, null);
            int i3 = f4397a + 91;
            f4400e = i3 % 128;
            int i4 = i3 % 2;
            return sessionConfig;
        }

        static {
            int i2 = f4399c + 31;
            f4398b = i2 % 128;
            int i3 = i2 % 2;
        }

        @JvmStatic
        public static final Builder from(SessionConfig sessionConfig) {
            int i2 = 2 % 2;
            int i3 = f4397a + 45;
            f4400e = i3 % 128;
            int i4 = i3 % 2;
            Builder builderFrom = Companion.from(sessionConfig);
            int i5 = f4400e + 111;
            f4397a = i5 % 128;
            int i6 = i5 % 2;
            return builderFrom;
        }

        public static /* synthetic */ void getI$annotations() {
            int i2 = 2 % 2;
            int i3 = f4397a + 29;
            f4400e = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static {
        int i2 = 1 + 73;
        f4392b = i2 % 128;
        int i3 = i2 % 2;
    }

    public /* synthetic */ SessionConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public static /* synthetic */ void getA$annotations() {
        int i2 = 2 % 2;
        int i3 = f4394d + 27;
        f4393c = i3 % 128;
        int i4 = i3 % 2;
    }
}
