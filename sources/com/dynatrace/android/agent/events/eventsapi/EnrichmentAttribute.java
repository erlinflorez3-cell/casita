package com.dynatrace.android.agent.events.eventsapi;

import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class EnrichmentAttribute implements Comparable<EnrichmentAttribute> {
    private final boolean addToOverridableKeys;
    private final String key;
    private final OverridingStrategy overridingStrategy;
    private final Object value;
    private static final OverridingStrategy OVERRIDABLE = new OverridingStrategy() { // from class: com.dynatrace.android.agent.events.eventsapi.EnrichmentAttribute.1
        @Override // com.dynatrace.android.agent.events.eventsapi.OverridingStrategy
        public boolean isOverridableBy(Object obj) {
            return true;
        }
    };
    private static final OverridingStrategy NOT_OVERRIDABLE = new OverridingStrategy() { // from class: com.dynatrace.android.agent.events.eventsapi.EnrichmentAttribute.2
        @Override // com.dynatrace.android.agent.events.eventsapi.OverridingStrategy
        public boolean isOverridableBy(Object obj) {
            return false;
        }
    };

    private EnrichmentAttribute(String str, Object obj, OverridingStrategy overridingStrategy, boolean z2) {
        this.key = str;
        this.value = obj;
        this.overridingStrategy = overridingStrategy;
        this.addToOverridableKeys = z2;
    }

    public static EnrichmentAttribute conditionalEnrichmentAttribute(String str, Object obj, OverridingStrategy overridingStrategy, boolean z2) {
        return new EnrichmentAttribute(str, obj, overridingStrategy, z2);
    }

    public static EnrichmentAttribute mandatoryEnrichmentAttribute(String str, Object obj) {
        return new EnrichmentAttribute(str, obj, NOT_OVERRIDABLE, true);
    }

    public static EnrichmentAttribute overridableEnrichmentAttribute(String str, Object obj) {
        return new EnrichmentAttribute(str, obj, OVERRIDABLE, true);
    }

    @Override // java.lang.Comparable
    public int compareTo(EnrichmentAttribute enrichmentAttribute) {
        return this.key.compareTo(enrichmentAttribute.key);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EnrichmentAttribute enrichmentAttribute = (EnrichmentAttribute) obj;
        return Objects.equals(this.key, enrichmentAttribute.key) && Objects.equals(this.value, enrichmentAttribute.value) && Objects.equals(this.overridingStrategy, enrichmentAttribute.overridingStrategy) && this.addToOverridableKeys == enrichmentAttribute.addToOverridableKeys;
    }

    public String getKey() {
        return this.key;
    }

    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return Objects.hash(this.key, this.value, this.overridingStrategy, Boolean.valueOf(this.addToOverridableKeys));
    }

    public boolean isOverridableBy(Object obj) {
        return this.overridingStrategy.isOverridableBy(obj);
    }

    public boolean shouldBeAddedToOverridableKeys() {
        return this.addToOverridableKeys;
    }

    public String toString() {
        return "EnrichmentAttribute{key='" + this.key + "', value=" + this.value + ", overridingStrategy=" + this.overridingStrategy + ", addToOverridableKeys=" + this.addToOverridableKeys + AbstractJsonLexerKt.END_OBJ;
    }
}
