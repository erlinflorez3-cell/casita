package com.incode.welcome_sdk.modules;

import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import com.incode.welcome_sdk.modules.exceptions.ModuleConfigurationException;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class UserConsent extends BaseModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f10654a = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10655c = 0;
    private String content;
    private String title;

    UserConsent(String str, String str2) {
        super(Modules.USER_CONSENT);
        this.title = str;
        this.content = str2;
    }

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f10656a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static int f10657b = 0;
        private String content;
        private String title;

        public final Builder setTitle(String str) {
            int i2 = 2 % 2;
            int i3 = f10657b + 57;
            f10656a = i3 % 128;
            if (i3 % 2 != 0) {
                this.title = str;
                return this;
            }
            this.title = str;
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Builder setContent(String str) {
            int i2 = 2 % 2;
            int i3 = f10657b + 79;
            int i4 = i3 % 128;
            f10656a = i4;
            int i5 = i3 % 2;
            this.content = str;
            int i6 = i4 + 35;
            f10657b = i6 % 128;
            if (i6 % 2 == 0) {
                return this;
            }
            throw null;
        }

        public final UserConsent build() {
            int i2 = 2 % 2;
            UserConsent userConsent = new UserConsent(this.title, this.content);
            int i3 = f10657b + 51;
            f10656a = i3 % 128;
            int i4 = i3 % 2;
            return userConsent;
        }
    }

    public String getTitle() {
        int i2 = 2 % 2;
        int i3 = f10654a + 95;
        f10655c = i3 % 128;
        if (i3 % 2 == 0) {
            return this.title;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String getContent() {
        int i2 = 2 % 2;
        int i3 = f10654a;
        int i4 = i3 + PanasonicMakernoteDirectory.TAG_BURST_SPEED;
        f10655c = i4 % 128;
        int i5 = i4 % 2;
        String str = this.content;
        int i6 = i3 + 71;
        f10655c = i6 % 128;
        if (i6 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // com.incode.welcome_sdk.modules.BaseModule
    public void verifyConfiguration(List<Modules> list) throws ModuleConfigurationException {
        int i2 = 2 % 2;
        int i3 = f10655c + 37;
        f10654a = i3 % 128;
        int i4 = i3 % 2;
        verifyAddAndProcessDataNotAfterApprove(list);
        int i5 = f10655c + 73;
        f10654a = i5 % 128;
        int i6 = i5 % 2;
    }
}
