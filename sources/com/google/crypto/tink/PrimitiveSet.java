package com.google.crypto.tink;

import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.monitoring.MonitoringAnnotations;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Hex;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public final class PrimitiveSet<P> {
    private final MonitoringAnnotations annotations;
    private final boolean isMutable;
    private Entry<P> primary;
    private final Class<P> primitiveClass;
    private final ConcurrentMap<Prefix, List<Entry<P>>> primitives;

    public static class Builder<P> {
        private MonitoringAnnotations annotations;
        private Entry<P> primary;
        private final Class<P> primitiveClass;
        private ConcurrentMap<Prefix, List<Entry<P>>> primitives;

        private Builder(Class<P> primitiveClass) {
            this.primitives = new ConcurrentHashMap();
            this.primitiveClass = primitiveClass;
            this.annotations = MonitoringAnnotations.EMPTY;
        }

        /* synthetic */ Builder(Class cls, AnonymousClass1 anonymousClass1) {
            this(cls);
        }

        private Builder<P> addPrimitive(@Nullable final P fullPrimitive, @Nullable final P primitive, Keyset.Key key, boolean asPrimary) throws GeneralSecurityException {
            if (this.primitives == null) {
                throw new IllegalStateException("addPrimitive cannot be called after build");
            }
            if (fullPrimitive == null && primitive == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (key.getStatus() != KeyStatusType.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            Entry<P> entryAddEntryToMap = PrimitiveSet.addEntryToMap(fullPrimitive, primitive, key, this.primitives);
            if (asPrimary) {
                if (this.primary != null) {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
                this.primary = entryAddEntryToMap;
            }
            return this;
        }

        public Builder<P> addFullPrimitiveAndOptionalPrimitive(@Nullable final P fullPrimitive, @Nullable final P primitive, Keyset.Key key) throws GeneralSecurityException {
            return addPrimitive(fullPrimitive, primitive, key, false);
        }

        public Builder<P> addPrimaryFullPrimitiveAndOptionalPrimitive(@Nullable final P fullPrimitive, @Nullable final P primitive, Keyset.Key key) throws GeneralSecurityException {
            return addPrimitive(fullPrimitive, primitive, key, true);
        }

        public Builder<P> addPrimaryPrimitive(final P primitive, Keyset.Key key) throws GeneralSecurityException {
            return addPrimitive(null, primitive, key, true);
        }

        public Builder<P> addPrimitive(final P primitive, Keyset.Key key) throws GeneralSecurityException {
            return addPrimitive(null, primitive, key, false);
        }

        public PrimitiveSet<P> build() throws GeneralSecurityException {
            if (this.primitives == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            PrimitiveSet<P> primitiveSet = new PrimitiveSet<>(this.primitives, this.primary, this.annotations, this.primitiveClass);
            this.primitives = null;
            return primitiveSet;
        }

        public Builder<P> setAnnotations(MonitoringAnnotations annotations) {
            if (this.primitives == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.annotations = annotations;
            return this;
        }
    }

    public static final class Entry<P> {

        @Nullable
        private final P fullPrimitive;
        private final byte[] identifier;
        private final Key key;
        private final int keyId;
        private final String keyType;
        private final OutputPrefixType outputPrefixType;

        @Nullable
        private final P primitive;
        private final KeyStatusType status;

        Entry(@Nullable P fullPrimitive, @Nullable P primitive, final byte[] identifier, KeyStatusType status, OutputPrefixType outputPrefixType, int keyId, String keyType, Key key) {
            this.fullPrimitive = fullPrimitive;
            this.primitive = primitive;
            this.identifier = Arrays.copyOf(identifier, identifier.length);
            this.status = status;
            this.outputPrefixType = outputPrefixType;
            this.keyId = keyId;
            this.keyType = keyType;
            this.key = key;
        }

        @Nullable
        public P getFullPrimitive() {
            return this.fullPrimitive;
        }

        @Nullable
        public final byte[] getIdentifier() {
            byte[] bArr = this.identifier;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public Key getKey() {
            return this.key;
        }

        public int getKeyId() {
            return this.keyId;
        }

        public String getKeyType() {
            return this.keyType;
        }

        public OutputPrefixType getOutputPrefixType() {
            return this.outputPrefixType;
        }

        @Nullable
        public Parameters getParameters() {
            Key key = this.key;
            if (key == null) {
                return null;
            }
            return key.getParameters();
        }

        @Nullable
        public P getPrimitive() {
            return this.primitive;
        }

        public KeyStatusType getStatus() {
            return this.status;
        }
    }

    private static class Prefix implements Comparable<Prefix> {
        private final byte[] prefix;

        private Prefix(byte[] prefix) {
            this.prefix = Arrays.copyOf(prefix, prefix.length);
        }

        /* synthetic */ Prefix(byte[] bArr, AnonymousClass1 anonymousClass1) {
            this(bArr);
        }

        @Override // java.lang.Comparable
        public int compareTo(Prefix o2) {
            byte[] bArr = this.prefix;
            int length = bArr.length;
            byte[] bArr2 = o2.prefix;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i2 = 0;
            while (true) {
                byte[] bArr3 = this.prefix;
                if (i2 >= bArr3.length) {
                    return 0;
                }
                byte b2 = bArr3[i2];
                byte b3 = o2.prefix[i2];
                if (b2 != b3) {
                    return b2 - b3;
                }
                i2++;
            }
        }

        public boolean equals(Object o2) {
            if (o2 instanceof Prefix) {
                return Arrays.equals(this.prefix, ((Prefix) o2).prefix);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.prefix);
        }

        public String toString() {
            return Hex.encode(this.prefix);
        }
    }

    private PrimitiveSet(Class<P> primitiveClass) {
        this.primitives = new ConcurrentHashMap();
        this.primitiveClass = primitiveClass;
        this.annotations = MonitoringAnnotations.EMPTY;
        this.isMutable = true;
    }

    private PrimitiveSet(ConcurrentMap<Prefix, List<Entry<P>>> primitives, Entry<P> primary, MonitoringAnnotations annotations, Class<P> primitiveClass) {
        this.primitives = primitives;
        this.primary = primary;
        this.primitiveClass = primitiveClass;
        this.annotations = annotations;
        this.isMutable = false;
    }

    /* synthetic */ PrimitiveSet(ConcurrentMap concurrentMap, Entry entry, MonitoringAnnotations monitoringAnnotations, Class cls, AnonymousClass1 anonymousClass1) {
        this(concurrentMap, entry, monitoringAnnotations, cls);
    }

    public static <P> Entry<P> addEntryToMap(@Nullable P fullPrimitive, @Nullable P primitive, Keyset.Key key, ConcurrentMap<Prefix, List<Entry<P>>> primitives) throws GeneralSecurityException {
        Integer numValueOf = Integer.valueOf(key.getKeyId());
        if (key.getOutputPrefixType() == OutputPrefixType.RAW) {
            numValueOf = null;
        }
        Entry<P> entry = new Entry<>(fullPrimitive, primitive, CryptoFormat.getOutputPrefix(key), key.getStatus(), key.getOutputPrefixType(), key.getKeyId(), key.getKeyData().getTypeUrl(), MutableSerializationRegistry.globalInstance().parseKeyWithLegacyFallback(ProtoKeySerialization.create(key.getKeyData().getTypeUrl(), key.getKeyData().getValue(), key.getKeyData().getKeyMaterialType(), key.getOutputPrefixType(), numValueOf), InsecureSecretKeyAccess.get()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(entry);
        Prefix prefix = new Prefix(entry.getIdentifier());
        List<Entry<P>> listPut = primitives.put(prefix, Collections.unmodifiableList(arrayList));
        if (listPut != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listPut);
            arrayList2.add(entry);
            primitives.put(prefix, Collections.unmodifiableList(arrayList2));
        }
        return entry;
    }

    public static <P> Builder<P> newBuilder(Class<P> primitiveClass) {
        return new Builder<>(primitiveClass);
    }

    @Deprecated
    public static <P> PrimitiveSet<P> newPrimitiveSet(Class<P> primitiveClass) {
        return new PrimitiveSet<>(primitiveClass);
    }

    @Deprecated
    public Entry<P> addPrimitive(final P primitive, Keyset.Key key) throws GeneralSecurityException {
        if (!this.isMutable) {
            throw new IllegalStateException("addPrimitive cannot be called on an immutable primitive set");
        }
        if (key.getStatus() == KeyStatusType.ENABLED) {
            return addEntryToMap(null, primitive, key, this.primitives);
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    public Collection<List<Entry<P>>> getAll() {
        return this.primitives.values();
    }

    public MonitoringAnnotations getAnnotations() {
        return this.annotations;
    }

    @Nullable
    public Entry<P> getPrimary() {
        return this.primary;
    }

    public List<Entry<P>> getPrimitive(final byte[] identifier) {
        List<Entry<P>> list = this.primitives.get(new Prefix(identifier));
        return list != null ? list : Collections.emptyList();
    }

    public Class<P> getPrimitiveClass() {
        return this.primitiveClass;
    }

    public List<Entry<P>> getRawPrimitives() {
        return getPrimitive(CryptoFormat.RAW_PREFIX);
    }

    public boolean hasAnnotations() {
        return !this.annotations.toMap().isEmpty();
    }

    @Deprecated
    public void setPrimary(final Entry<P> primary) {
        if (!this.isMutable) {
            throw new IllegalStateException("setPrimary cannot be called on an immutable primitive set");
        }
        if (primary == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        }
        if (primary.getStatus() != KeyStatusType.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
        if (getPrimitive(primary.getIdentifier()).isEmpty()) {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        this.primary = primary;
    }
}
