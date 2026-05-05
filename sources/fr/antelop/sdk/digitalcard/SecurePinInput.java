package fr.antelop.sdk.digitalcard;

/* JADX INFO: loaded from: classes5.dex */
public final class SecurePinInput {
    private final CurrentPinInputProperties currentPinInputProperties;
    private final NewPinInputProperties newPinInputProperties;

    public static class CurrentPinInputProperties {
        private final String subtitle;
        private final String title;

        public CurrentPinInputProperties(String str, String str2) {
            this.title = str;
            this.subtitle = str2;
        }

        public String getSubtitle() {
            return this.subtitle;
        }

        public String getTitle() {
            return this.title;
        }
    }

    public static class NewPinInputProperties {
        private final String confirmationSubtitle;
        private final String confirmationTitle;
        private final boolean requestConfirmation;
        private final String subtitle;
        private final String title;

        public NewPinInputProperties(String str, String str2) {
            this.title = str;
            this.subtitle = str2;
            this.confirmationTitle = null;
            this.confirmationSubtitle = null;
            this.requestConfirmation = false;
        }

        public NewPinInputProperties(String str, String str2, String str3, String str4) {
            this.title = str;
            this.subtitle = str2;
            this.confirmationTitle = str3;
            this.confirmationSubtitle = str4;
            this.requestConfirmation = true;
        }

        public String getConfirmationSubtitle() {
            return this.confirmationSubtitle;
        }

        public String getConfirmationTitle() {
            return this.confirmationTitle;
        }

        public boolean getRequestConfirmation() {
            return this.requestConfirmation;
        }

        public String getSubtitle() {
            return this.subtitle;
        }

        public String getTitle() {
            return this.title;
        }
    }

    public SecurePinInput(CurrentPinInputProperties currentPinInputProperties, NewPinInputProperties newPinInputProperties) {
        this.currentPinInputProperties = currentPinInputProperties;
        this.newPinInputProperties = newPinInputProperties;
    }

    public final CurrentPinInputProperties getCurrentPinInputProperties() {
        return this.currentPinInputProperties;
    }

    public final NewPinInputProperties getNewPinInputProperties() {
        return this.newPinInputProperties;
    }
}
