package com.dynatrace.agent.userinteraction.model;

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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4M\u0007\":\u001b\u007f\u0007ljA0RkP.XS0Šq\u0012éT[Rp\u0004Xe\u001e\f\"!O|hwrX\\#C=\u0007&|x/aU'^ܫ\u00134HsM8\u0016vKCxtd\u0006fތ#\u0001\u0001\u0013\f2*v\u0011=ڠD\u0014\u0013 <XphSȘ\u0006b7\u0014K8\u0001Lձ\u0018T<Hz]R/Q\u0004\u001aHT'm2\u0015M;G\u0005-\u0013vo!C@e6[ȳRK\u0018`iW\u0003m\u0001m\u000bv7?-_r\u00065\u001fĳ\u0015]2]\u001eurTnKƀ_T.9b{K~\u000fnĒyL\u001cJ\u0004&\u0006UIͶ1 nڜ&5zxaG!\u0011lD\u0018z\u00107а)\u0006;ٿQ\u001dlYoBi]E~\u001d\rL$ъr'c٪&b\u001b$b~ά5e"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\u000e\u0019Hh9\u000fc5]L", "", "<`\\2", "", "1n\\=b5>\\(", "7c", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d\u0010?", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0010b4I]\"~\u0004m", "5dc\u0016W", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class UiElement {
    private final String component;
    private final String id;
    private final String name;

    public UiElement(String name, String component, String id) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(id, "id");
        this.name = name;
        this.component = component;
        this.id = id;
    }

    public static /* synthetic */ UiElement copy$default(UiElement uiElement, String str, String str2, String str3, int i2, Object obj) {
        if ((1 & i2) != 0) {
            str = uiElement.name;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            str2 = uiElement.component;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            str3 = uiElement.id;
        }
        return uiElement.copy(str, str2, str3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.component;
    }

    public final String component3() {
        return this.id;
    }

    public final UiElement copy(String name, String component, String id) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(id, "id");
        return new UiElement(name, component, id);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiElement)) {
            return false;
        }
        UiElement uiElement = (UiElement) obj;
        return Intrinsics.areEqual(this.name, uiElement.name) && Intrinsics.areEqual(this.component, uiElement.component) && Intrinsics.areEqual(this.id, uiElement.id);
    }

    public final String getComponent() {
        return this.component;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.component.hashCode()) * 31) + this.id.hashCode();
    }

    public String toString() {
        return "UiElement(name=" + this.name + ", component=" + this.component + ", id=" + this.id + ')';
    }
}
