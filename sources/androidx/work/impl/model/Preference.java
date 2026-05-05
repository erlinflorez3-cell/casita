package androidx.work.impl.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message tag had invalid wire type.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidWireType(InvalidProtocolBufferException.java:99)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:268)
    	at kotlin.metadata.internal.protobuf.GeneratedMessageLite.parseUnknownField(GeneratedMessageLite.java:73)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:110)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:37)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readClassDataFrom(JvmProtoBufUtil.kt:32)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmClass$kotlin_metadata_jvm(JvmReadUtils.kt:27)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Class.<init>(KotlinClassMetadata.kt:95)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:50)
    	... 4 more
    */
/* JADX INFO: compiled from: Preference.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u00128é6B\r+4ߚ\u007f\u0007tqA0JpP.`Y2\u000fq{:ša:ڎs;\u0004\u0019>7\u000fc^kunbZ9D\u001f\n$z\u0003,wXޯa\u0012\u001d6\u0003\u0005O7[oU9\u000fuF\u000b.4::\u0010\u0004/\u001fݵL\u0010\u0005\u0001\fR\u001a\u001eH@\u001f;\u0019ӏNM( \u0013V\"\u0017\u001d\u000bl\u0015ɫIǰa:=-K\fP\\?_^ŧ}\u0013LT5\r\u000faL,p?;\u00153U\u001b\thZm\b\u0006҃<ݾl'5:\u0012\u0005eFp\u007fB\u0018[U\u001bn\u000b(r\u0004\u007f_R̃,\u0018jYb&(&\u000eBɵ;L\u0015\u0014;`.[\u001b-۳\r\u0004\t\u0001SXP0_x\u0004Qʰ8а)\u0006;ٿQ\u001dlXoCifE}\u001d\u000f4\"/sW_+םbڠ\u001f\\\u007fQ?\\X?NW\u0018cǆq\u0019"}, d2 = {"\u001a`]1e6BR,H\rh9\u0003R3m\u000b/EH\u000b\u0016\u0017N9xIv&5f})5mk", "", "9dh", "", "D`[BX", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}p\u0004q", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001cc\u0007\"\r1\u0007", "5dc\u0018X@", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uc\u00138gU", "\u001aiPCTuEO\"\u0001DE6\u0006\u000b\u0005", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn\u001cc\u0007\"\r1|*VBHu8\u001d(2sC\u0014iuR~2N\u0016V6[Ry\u0007~\u001fZ\u000fN8\r\u000eWAy", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "Ena8 9N\\(\u0003\u0003^&\n\t6e{6{"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class Preference {
    private final String key;
    private final Long value;

    public static /* synthetic */ Preference copy$default(Preference preference, String str, Long l2, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            str = preference.key;
        }
        if ((i2 & 2) != 0) {
            l2 = preference.value;
        }
        return preference.copy(str, l2);
    }

    public final String component1() {
        return this.key;
    }

    public final Long component2() {
        return this.value;
    }

    public final Preference copy(String key, Long l2) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new Preference(key, l2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Preference)) {
            return false;
        }
        Preference preference = (Preference) obj;
        return Intrinsics.areEqual(this.key, preference.key) && Intrinsics.areEqual(this.value, preference.value);
    }

    public int hashCode() {
        int iHashCode = this.key.hashCode() * 31;
        Long l2 = this.value;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.key + ", value=" + this.value + ')';
    }

    public Preference(String key, Long l2) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.key = key;
        this.value = l2;
    }

    public final String getKey() {
        return this.key;
    }

    public final Long getValue() {
        return this.value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Preference(String key, boolean z2) {
        this(key, Long.valueOf(z2 ? 1L : 0L));
        Intrinsics.checkNotNullParameter(key, "key");
    }
}
