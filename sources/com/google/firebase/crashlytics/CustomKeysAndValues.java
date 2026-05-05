package com.google.firebase.crashlytics;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class CustomKeysAndValues {
    final Map<String, String> keysAndValues;

    public static class Builder {
        private Map<String, String> keysAndValues = new HashMap();

        public CustomKeysAndValues build() {
            return new CustomKeysAndValues(this);
        }

        public Builder putBoolean(String str, boolean z2) {
            this.keysAndValues.put(str, Boolean.toString(z2));
            return this;
        }

        public Builder putDouble(String str, double d2) {
            this.keysAndValues.put(str, Double.toString(d2));
            return this;
        }

        public Builder putFloat(String str, float f2) {
            this.keysAndValues.put(str, Float.toString(f2));
            return this;
        }

        public Builder putInt(String str, int i2) {
            this.keysAndValues.put(str, Integer.toString(i2));
            return this;
        }

        public Builder putLong(String str, long j2) {
            this.keysAndValues.put(str, Long.toString(j2));
            return this;
        }

        public Builder putString(String str, String str2) {
            this.keysAndValues.put(str, str2);
            return this;
        }
    }

    CustomKeysAndValues(Builder builder) {
        this.keysAndValues = builder.keysAndValues;
    }
}
