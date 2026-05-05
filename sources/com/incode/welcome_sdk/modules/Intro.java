package com.incode.welcome_sdk.modules;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class Intro extends BaseModule {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f10597d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f10598e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<IntroChecks> f10599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f10600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<IntroChecks> f10601c;

    public static final class Builder {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static int f10602d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static int f10603e = 1;
        private List<IntroChecks> introChecks = new ArrayList();
        private boolean allowContinueWithoutConsent = false;

        public final Builder setIntroChecks(List<IntroChecks> list) {
            int i2 = 2 % 2;
            int i3 = f10602d + 13;
            f10603e = i3 % 128;
            if (i3 % 2 != 0) {
                this.introChecks = list;
                return this;
            }
            this.introChecks = list;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setIntroChecks(IntroChecks[] introChecksArr) {
            int i2 = 2 % 2;
            int i3 = f10603e + 105;
            f10602d = i3 % 128;
            if (i3 % 2 != 0) {
                this.introChecks = Arrays.asList(introChecksArr);
                int i4 = 70 / 0;
            } else {
                this.introChecks = Arrays.asList(introChecksArr);
            }
            return this;
        }

        public final Builder setAllowContinueWithoutConsent(boolean z2) {
            int i2 = 2 % 2;
            int i3 = f10602d + 101;
            int i4 = i3 % 128;
            f10603e = i4;
            int i5 = i3 % 2;
            this.allowContinueWithoutConsent = z2;
            int i6 = i4 + 31;
            f10602d = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public final Intro build() {
            int i2 = 2 % 2;
            Intro intro = new Intro(this.introChecks, this.allowContinueWithoutConsent);
            int i3 = f10603e + 49;
            f10602d = i3 % 128;
            int i4 = i3 % 2;
            return intro;
        }
    }

    Intro(List<IntroChecks> list, boolean z2) {
        super(Modules.INTRO);
        this.f10601c = Arrays.asList(IntroChecks.ID, IntroChecks.PASSPORT, IntroChecks.ID_OR_PASSPORT, IntroChecks.PROOF_OF_ADDRESS, IntroChecks.SELFIE, IntroChecks.MEDICAL_DOC, IntroChecks.OTHER_DOC);
        this.f10599a = list;
        this.f10600b = z2;
    }

    public final List<IntroChecks> d() {
        int i2 = 2 % 2;
        int i3 = f10598e;
        int i4 = i3 + 103;
        f10597d = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        List<IntroChecks> list = this.f10599a;
        int i5 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f10597d = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final boolean c() {
        int i2 = 2 % 2;
        int i3 = f10597d;
        int i4 = i3 + 33;
        f10598e = i4 % 128;
        int i5 = i4 % 2;
        boolean z2 = this.f10600b;
        int i6 = i3 + 113;
        f10598e = i6 % 128;
        int i7 = i6 % 2;
        return z2;
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public void verifyConfiguration(List<Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10597d + 43;
        f10598e = i3 % 128;
        if (i3 % 2 == 0) {
            if (this.f10599a.isEmpty()) {
                throw new ModuleConfigurationException("No modules selected!");
            }
            for (IntroChecks introChecks : this.f10599a) {
                int i4 = f10598e + 13;
                f10597d = i4 % 128;
                int i5 = i4 % 2;
                if (!this.f10601c.contains(introChecks)) {
                    throw new ModuleConfigurationException(new StringBuilder("Unsupported modules selected for intro check: ").append(introChecks.name()).toString());
                }
            }
            int i6 = f10597d + 49;
            f10598e = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 70 / 0;
                return;
            }
            return;
        }
        this.f10599a.isEmpty();
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
