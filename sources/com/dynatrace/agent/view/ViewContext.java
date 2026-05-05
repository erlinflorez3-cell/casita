package com.dynatrace.agent.view;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4M\u0007\":\u001b\u007f\u0007ljA0RkP.XS0Šq\u0012éT[Rp\u0004`e\u001e\f\"!O|hwvPZ\u0019E'\b,w\u0019-Y]~] \u0012JD\u0006>aNڱA;fxD\nh90B\u0012\u0005/\u001bpс\u0011?\u0004QV$\u0014F?\u001f;\u0019ӏNM# \u0012V\"\u0017\u001d\u000bh\u0015ɫI5\u0007H<;\u0003\u0018ĩ~-e0\u000bM%F\u0003(=~g\u001e9BO7+$\u0002\u00047Za?\u0011B\n?\u001bgU(qʥr Gf\u000e,\u0015Y^=c\u00016t\u0007g_:&q֩d\u0014W\u001c9\u0010z*\u001f\u0003Ƞ\rN.VAE\u001a\u0015\tT߮sCbNP\u001a^p\u0001ѐe<\u001fӛ\u001851?)m\"rI\u001bf9\u0012\u0004;\u001fţ\u0005t)żl\u0010f\u001d)[Hb?TX?^M8Zǀq\nxç\u001a,\n9U\u0007¤\u007f%"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0012\u001b\u0017Y9~@v7\u0013c\u0007/7\u0001%\u0004", "", "7c", "", "<`\\2", "2dc2V;>R\u0002z\u0003^", "\nh]6g\u0005", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d\u0010?", "5dc\u0016W", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u001bT4>", "5dc\u0011X;>Q(~yG(\u0005\t", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class ViewContext {
    private final String detectedName;
    private final String id;
    private final String name;

    public ViewContext(String id, String str, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.name = str;
        this.detectedName = str2;
    }

    public /* synthetic */ ViewContext(String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (2 & i2) != 0 ? null : str2, (i2 + 4) - (i2 | 4) != 0 ? null : str3);
    }

    public static /* synthetic */ ViewContext copy$default(ViewContext viewContext, String str, String str2, String str3, int i2, Object obj) {
        if ((1 & i2) != 0) {
            str = viewContext.id;
        }
        if ((2 & i2) != 0) {
            str2 = viewContext.name;
        }
        if ((i2 + 4) - (i2 | 4) != 0) {
            str3 = viewContext.detectedName;
        }
        return viewContext.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.detectedName;
    }

    public final ViewContext copy(String id, String str, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new ViewContext(id, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewContext)) {
            return false;
        }
        ViewContext viewContext = (ViewContext) obj;
        return Intrinsics.areEqual(this.id, viewContext.id) && Intrinsics.areEqual(this.name, viewContext.name) && Intrinsics.areEqual(this.detectedName, viewContext.detectedName);
    }

    public final String getDetectedName() {
        return this.detectedName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.detectedName;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ViewContext(id=" + this.id + ", name=" + this.name + ", detectedName=" + this.detectedName + ')';
    }
}
