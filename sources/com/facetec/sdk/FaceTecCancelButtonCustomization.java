package com.facetec.sdk;

import android.graphics.Rect;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes3.dex */
public final class FaceTecCancelButtonCustomization {
    public int customImage = 0;
    ButtonLocation V = ButtonLocation.TOP_LEFT;
    Rect Z = null;

    public enum ButtonLocation {
        TOP_LEFT("Top Left"),
        TOP_RIGHT("Top Right"),
        CUSTOM(TypedValues.Custom.NAME),
        DISABLED("Disabled");

        private final String Z;

        ButtonLocation(String str) {
            this.Z = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.Z;
        }
    }

    public final Rect getCustomLocation() {
        return this.Z;
    }

    public final ButtonLocation getLocation() {
        return this.V;
    }

    public final void setCustomLocation(Rect rect) {
        this.Z = rect;
    }

    public final void setLocation(ButtonLocation buttonLocation) {
        if (buttonLocation == null) {
            buttonLocation = ButtonLocation.TOP_LEFT;
        }
        this.V = buttonLocation;
    }
}
