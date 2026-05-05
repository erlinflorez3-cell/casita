package com.biocatch.android.commonsdk.collection.collectors.elements;

import com.biocatch.android.commonsdk.backend.CollectionItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
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
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r)4\u0012}\u0007njG<L͜P.hS2\u000fq{<$q$yCAo\"}8\tWȞ}˧\u001fJ\t\n\u0004l\u0016\u001e~j:Imzs\u0011=3RwE3[qU;vsd\b060<\u0012\u0005/\u001d:P\u0016v\tHc\u000e(/nvJV\u001bT\u001d\u001a@\u000eN$\u000f'tg|7Xrc:=-\u001bipY7g6|[\u0019^V=\f%b./NDM\u0015SYΫ\u000bRiMKE\u007fd\u001dhUOq]DsDX\u0018\u0016+*}\u000e4ý2ػ\t_h\f5>geQ_\u001c8\u0018|\u0002\u001eJ\u0016^\u00175MF/0e6\u0014\u07baxx[óh\u0004dV\u000e\u00102N%2\u00183Y?qƟ]ň?%Vљ\u0014\u0007\u001341\u0016\u000f#ak\u001cxe7byi3g?kK%˪eǀq\u0012xb\u0010G\u001c2M\u0019=\u001610\u001d@Ew\n2/t\u001aHrhЛ\tfpׅ\u0002TN^0\u000efF8\u0013$ZroʰoV\\АD\u0013S&b'N$!,tyR S\u0011%пtȬn[e\n3B~9_\u0010y\u001ew;dUCc4\u001foV\u000f\u0014m?И\t^n̻k\u000e`\u007f6F\u0003Wx\u0017\u0010{rVܟ\u00178Gڤ462V'\u0003ĒL,"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pGSN4\\[\u0002K]qa\u000eV+\u0016\u00149R$wS\u001f)\u0007,PW", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "1n]AX?M7w", "", "3uT;g\u0010\u001d", "", "Bh\\2f;:[$", "3kT:X5M7\u0018", "", "Bx_2", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pGSN4\\[\u0002K]qa\u000eV+\u0016\u00149R$wS&3\u0013,\u001f", "6`b5", "7rC?h:MS\u0018", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pGSN4\\[\u0002K]uh|[;\u001b\u0014Y@y", ":d]4g/", "3kT:X5MD\u0015\u0006\u000b^", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q'\u0006\u0013(C9\u00158\u007f'~@\b)9Cz\u0015R?Lg}%\u0011qc\u0003tr9R\u007f)\u001d3L6d\u001coA\u001e\u0010V\u001dL.V\u0001b@1xH6h\u00066Q\nEq\u000f\u000b\u001cW3twIV\u000eV}\u001f~\u000b'rM`_wVKRpsd\u0013_%\\CI2]Q \u001bpP7\u0019[d\u0011{ah{rGn^\u001f\"Hu%CIyS8\u0004%\"\u0015w\u0001\u0011?bx*>+\u000e<2@m\u0013Jma<h\u007f\u001c,ZP+0?\u0006\u0011IRjujM\u0018u-+\b\u0015b=1\"ts-,\u001duj'iDa^V\u001eW\u0002OE9\u001c#O\u0001\f?\u0003$\t\t$z;0H\u0017e|cw@+aZp\u0012s\u001c%0k\u0001J", "5dc\u0010b5MS,\u000e^=", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adc\u0010b5MS,\u000e^=", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "5dc\u0012_,FS\"\u000e^]", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0012_,FS\"\u000ekZ3\r\t", "Adc\u0012_,FS\"\u000ekZ3\r\t", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0012i,Gb|]", "u(;7T=:\u001d z\u0004`uc\u00138gU", "Adc\u0012i,Gb|]", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;C\u0019", "\u001aiPCTuEO\"\u0001DE6\u0006\u000b\u0005", "5dc\u0015T:A", "u(8", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016N3\\ZrF# $q\\\u001a\u001a\u0015gP$m\u001a", "5dc\u0019X5@b\u001c", "Adc\u0019X5@b\u001c", "5dc!\\4>a(z\u0003i", "u(9", "5dc!l7>", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016N3\\ZrF# $mU+\u0015\u0005bP\u0004\u007fD@.v@T\u0002\u0011", "Bn9 B\u0015\u001a`&z\u000f", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ElementEventModel extends CollectionItem {
    private Integer contextID;
    private final String elementId;
    private String elementValue;
    private Long eventID;
    private final int hash;
    private final IsTrusted isTrusted;
    private Integer length;
    private final long timestamp;
    private final ElementEventType type;

    public ElementEventModel(Integer num, Long l2, long j2, String str, ElementEventType type, int i2, IsTrusted isTrusted, Integer num2, String elementValue) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(isTrusted, "isTrusted");
        Intrinsics.checkNotNullParameter(elementValue, "elementValue");
        this.contextID = num;
        this.eventID = l2;
        this.timestamp = j2;
        this.elementId = str;
        this.type = type;
        this.hash = i2;
        this.isTrusted = isTrusted;
        this.length = num2;
        this.elementValue = elementValue;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ElementEventModel(Integer num, Long l2, long j2, String str, ElementEventType elementEventType, int i2, IsTrusted isTrusted, Integer num2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i3) | ((-1) - 1)) != 0 ? num : num, (i3 + 2) - (i3 | 2) != 0 ? 0L : l2, j2, (i3 + 8) - (i3 | 8) != 0 ? null : str, elementEventType, i2, (i3 & 64) != 0 ? IsTrusted.UNDEFINED : isTrusted, (i3 & 128) == 0 ? num2 : 0, str2);
    }

    public final Integer getContextID() {
        return this.contextID;
    }

    public final String getElementId() {
        return this.elementId;
    }

    public final String getElementValue() {
        return this.elementValue;
    }

    public final Long getEventID() {
        return this.eventID;
    }

    public final int getHash() {
        return this.hash;
    }

    public final Integer getLength() {
        return this.length;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final ElementEventType getType() {
        return this.type;
    }

    public final IsTrusted isTrusted() {
        return this.isTrusted;
    }

    public final void setContextID(Integer num) {
        this.contextID = num;
    }

    public final void setElementValue(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.elementValue = str;
    }

    public final void setEventID(Long l2) {
        this.eventID = l2;
    }

    public final void setLength(Integer num) {
        this.length = num;
    }

    @Override // com.biocatch.android.commonsdk.backend.CollectionItem
    public JSONArray toJSONArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(clearNull(this.contextID));
        jSONArray.put(clearNull(this.eventID));
        jSONArray.put(this.timestamp);
        jSONArray.put(this.type.ordinal());
        jSONArray.put(this.isTrusted.ordinal());
        jSONArray.put(this.hash);
        jSONArray.put(clearNull(this.length));
        jSONArray.put(this.elementValue);
        jSONArray.put(-1);
        return jSONArray;
    }
}
