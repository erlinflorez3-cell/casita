package com.braze.events;

import com.braze.models.FeatureFlag;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u000eӵLш|\u0004O$8\u000bDB\u0007\"2\u0014\u007f\u0007tpA0JfP.`\\2\u000fq|<$i0yCAV \u00038ޛm_\u0018g\u001dI\u0013\nTO\u0017&\u0003x,a[\t_\"\u000f`D\u001e@ݯQoK<)\u0003D\u00128487(\u00071\u001e8V(v)R\u0014\u0012 @XphaSaU/ \u0006V&\u0011 lg|8vmҺ>5+Ʌ\u0002DT+m5M\\\u001bLl';}\u0018bҋD;M\u0017+[\u0011\u0010#jM\rWqk\u0010\u001fkݳ/M\fY<b\u000e Ƭ/a"}, d2 = {"\u001ab^:\")KO.~D^=|\u0012>sI\t{<\u0010'$GP\u00158x3%d|\u001cFm\u0015\u000e^CDz\n", "", "4dPAh9>4 z|l", "", "\u001ab^:\")KO.~Df6{\t6sI\t{<\u0010'$GP\u00158xz", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u0019", "5dc\u0013X(Mc&~[e(~\u0017", "u(;7T=:\u001d)\u000e~euc\r=tU", "4kP466N\\(", "", "5dc\u0013_(@1#\u000f\u0004m", "u(8", "7r4:c;R", "", "u(I", "5dc\u0013X(Mc&~[e(~", "7c", "", "BnBAe0GU", "\u0011n\\=T5B]\"", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FeatureFlagsUpdatedEvent {
    public static final Companion Companion = new Companion(null);
    private final List<FeatureFlag> featureFlags;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$2ߢx\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005<i%\nCiWPBxޣQɁkq~L`\u000eQ\u000f\u001e\u0018~n:NǪ|c"}, d2 = {"\u001ab^:\")KO.~D^=|\u0012>sI\t{<\u0010'$GP\u00158x3%d|\u001cFm\u0015\u000e^CDzr{\u001fpl5\u0010g6WL", "", "u(E", "3l_Al\u001cIR\u0015\u000ez", "\u001ab^:\")KO.~D^=|\u0012>sI\t{<\u0010'$GP\u00158x3%d|\u001cFm\u0015\u000e^CDz\n", "5dc\u0012`7Mg\t\nyZ;|G+n\t2\u000b<\u0010\u001b!P}", "5dc\u0012`7Mg\t\nyZ;|", "u(;0b4\bP&z\u0010^u|\u001a/n\u000f6E!\u0001\u0013&W|\u000e\u001d}!7gm+6i%.L#Lk=-j", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getEmptyUpdate$annotations() {
        }

        public final FeatureFlagsUpdatedEvent getEmptyUpdate() {
            return new FeatureFlagsUpdatedEvent(CollectionsKt.emptyList());
        }
    }

    public FeatureFlagsUpdatedEvent(List<FeatureFlag> featureFlags) {
        Intrinsics.checkNotNullParameter(featureFlags, "featureFlags");
        this.featureFlags = featureFlags;
    }

    public static final FeatureFlagsUpdatedEvent getEmptyUpdate() {
        return Companion.getEmptyUpdate();
    }

    public final FeatureFlag getFeatureFlag(String id) {
        Object next;
        Intrinsics.checkNotNullParameter(id, "id");
        Iterator<T> it = this.featureFlags.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((FeatureFlag) next).getId(), id)) {
                break;
            }
        }
        return (FeatureFlag) next;
    }

    public final List<FeatureFlag> getFeatureFlags() {
        return this.featureFlags;
    }

    public final int getFlagCount() {
        return this.featureFlags.size();
    }

    public final boolean isEmpty() {
        return this.featureFlags.isEmpty();
    }

    public String toString() {
        return "FeatureFlagsUpdatedEvent{flag count=" + this.featureFlags.size() + AbstractJsonLexerKt.END_OBJ;
    }
}
