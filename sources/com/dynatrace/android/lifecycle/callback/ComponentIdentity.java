package com.dynatrace.android.lifecycle.callback;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class ComponentIdentity {
    private final String componentName;
    private final int uniqueId;

    public ComponentIdentity(String str, int i2) {
        this.componentName = str;
        this.uniqueId = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentIdentity componentIdentity = (ComponentIdentity) obj;
        if (this.uniqueId != componentIdentity.uniqueId) {
            return false;
        }
        String str = this.componentName;
        String str2 = componentIdentity.componentName;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public String getComponentName() {
        return this.componentName;
    }

    public int hashCode() {
        String str = this.componentName;
        return ((str != null ? str.hashCode() : 0) * 31) + this.uniqueId;
    }

    public String toString() {
        return "ComponentIdentity{componentName='" + this.componentName + "', uniqueId=" + this.uniqueId + AbstractJsonLexerKt.END_OBJ;
    }
}
