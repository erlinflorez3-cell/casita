package com.airbnb.lottie.model;

import androidx.webkit.ProxyConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class KeyPath {
    public static final KeyPath COMPOSITION = new KeyPath("COMPOSITION");
    private final List<String> keys;
    private KeyPathElement resolvedElement;

    private KeyPath(KeyPath keyPath) {
        this.keys = new ArrayList(keyPath.keys);
        this.resolvedElement = keyPath.resolvedElement;
    }

    public KeyPath(String... strArr) {
        this.keys = Arrays.asList(strArr);
    }

    private boolean endsWithGlobstar() {
        return this.keys.get(r1.size() - 1).equals("**");
    }

    private boolean isContainer(String str) {
        return "__container".equals(str);
    }

    public KeyPath addKey(String str) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.keys.add(str);
        return keyPath;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeyPath keyPath = (KeyPath) obj;
        if (!this.keys.equals(keyPath.keys)) {
            return false;
        }
        KeyPathElement keyPathElement = this.resolvedElement;
        KeyPathElement keyPathElement2 = keyPath.resolvedElement;
        return keyPathElement != null ? keyPathElement.equals(keyPathElement2) : keyPathElement2 == null;
    }

    public boolean fullyResolvesTo(String str, int i2) {
        if (i2 >= this.keys.size()) {
            return false;
        }
        boolean z2 = i2 == this.keys.size() - 1;
        String str2 = this.keys.get(i2);
        if (!str2.equals("**")) {
            return (z2 || (i2 == this.keys.size() + (-2) && endsWithGlobstar())) && (str2.equals(str) || str2.equals(ProxyConfig.MATCH_ALL_SCHEMES));
        }
        if (!z2 && this.keys.get(i2 + 1).equals(str)) {
            return i2 == this.keys.size() + (-2) || (i2 == this.keys.size() + (-3) && endsWithGlobstar());
        }
        if (z2) {
            return true;
        }
        int i3 = i2 + 1;
        if (i3 < this.keys.size() - 1) {
            return false;
        }
        return this.keys.get(i3).equals(str);
    }

    public KeyPathElement getResolvedElement() {
        return this.resolvedElement;
    }

    public int hashCode() {
        int iHashCode = this.keys.hashCode() * 31;
        KeyPathElement keyPathElement = this.resolvedElement;
        return iHashCode + (keyPathElement != null ? keyPathElement.hashCode() : 0);
    }

    public int incrementDepthBy(String str, int i2) {
        if (isContainer(str)) {
            return 0;
        }
        if (this.keys.get(i2).equals("**")) {
            return (i2 != this.keys.size() - 1 && this.keys.get(i2 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public String keysToString() {
        return this.keys.toString();
    }

    public boolean matches(String str, int i2) {
        if (isContainer(str)) {
            return true;
        }
        if (i2 >= this.keys.size()) {
            return false;
        }
        return this.keys.get(i2).equals(str) || this.keys.get(i2).equals("**") || this.keys.get(i2).equals(ProxyConfig.MATCH_ALL_SCHEMES);
    }

    public boolean propagateToChildren(String str, int i2) {
        return "__container".equals(str) || i2 < this.keys.size() - 1 || this.keys.get(i2).equals("**");
    }

    public KeyPath resolve(KeyPathElement keyPathElement) {
        KeyPath keyPath = new KeyPath(this);
        keyPath.resolvedElement = keyPathElement;
        return keyPath;
    }

    public String toString() {
        return "KeyPath{keys=" + this.keys + ",resolved=" + (this.resolvedElement != null) + AbstractJsonLexerKt.END_OBJ;
    }
}
