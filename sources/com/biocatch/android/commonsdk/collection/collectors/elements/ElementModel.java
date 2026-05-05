package com.biocatch.android.commonsdk.collection.collectors.elements;

import com.biocatch.android.commonsdk.backend.CollectionItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLш|\u0004O\f8\u000b4B\u0007\":\u001e\u007f\u0007lvA0RlP.Xr2\u000f\u0002{<řqҕ\"CiTZՒ!\u0019WTgunb\\!B=\u0007&|x.aU'^\"\u00178B}BKO\u0006<gd\u0005<\u0013%J$Nx3\u0005*2N\u0010\u0005\u0001[M\"\u0011^D\u0001@`\u0014e\u00070\u00114B0\t$\\uVNJ\u0003\\h03\u000boB\\0w2\u0013L;Gd/\u0013vo(CBM4C&c\u000b\rRiJ\u001bA\b<3i7/1I\u0002cNZ\u0016\u0013C/_\u0015cr4i\u001dSv\u000bU/_kQP\u001c6\u0010|\u0012\fj\b\u001e\u000e-H<<2h\u001e\rax\u0003[FP\u0010nZ\u0002\u0011`d\u001b5\u0006A<Q\u001d|P\u0010?)RE\u000e\u001d\rL6\u0011v'[b\"x\u00171S&UśU@K]\u0017\u0010gq\u0006\u0004\u001f\u0018H>TAU\u000fG}'-E)ھ_?+ܩ\u0004\u0004NZu\u000eU|vS\u0002T^?Polպ6Á\u0010hLd\u0013\bhV^D\u001ff<V\r\u0018\u0016.pm\u0006B9'&M}lȬnSe܃=1lTg\u0006<(eJv5KP\u0012\u00148׳\u0003݀CHjڳphHq\u001aq|*(QV\u000b`\u0007\nFf\fA3Ɛu\"<ιI\u001bb6V%nUO\b!apg>\u007fՁ7,\u000bi2\u0011!\u0003V\u007f~\t8\nW8\u0015b8,oUڤ\u001d,]Ȩ\u00016\u0003G\u0015\u0016D\u001aUldIbkDy,ݯ,ک\u001eEYǽU\u0015\u0015$7I\"/Kr\u0001\u0006\"i /\u0013~\u0010\u000eii\u0005ԝ\u0014ϡt:hjXkl\u0019(\u001el\fC\nj(\b|\u0017\fUsl\rq=wvè]BV˻\u0015\u0007%G3\u0018@3\u000bBEE=\u001cD{ӄ3\u001biӠ\u0002q4$p&v\u0006s\u0007De,n\u0011UЄ6A@Ծq\u0001DM2\u0004SQV|\u0010\bp\u001cΌ\u00119PШ|r\\d[8\u007f\u000ft\u0015D\u000f\u0007U\n>݇s\u0004<ʝw,yq\f+/_3\u001aeU}l\u001cL3֬V؝\u000e\u0019\u00041|.4?&\u0006e{)2\f$&Q\u0012Lp\fT\u000b:3Z@ޭ\u000fI\\ȫ\u001e\u0012\u00011Tv_(@V\f=l\r\u0003|חZN\rݺ]b'\\\u000f\u0016_F,\u0003M3\u001bltUвg:\tS+%3lU2t>ŦH\u000b"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pGSN4\\[\u0002K]qa\u000eV+\u0016\u0014AK#nK\r", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "1n]AX?M7w", "", "6`b5", "B`V\u001bT4>", "", "7c", "3kT:X5M<\u0015\u0007z", "Bx_2", ":dUA", "Bn_", "EhSA[", "6dX4[;", "6qT3", "Ash9X", "Bn^9g0I", "/bR2f:BP\u001d\u0006~m@", "Ad[2V;>R\nz\u0002n,\u000b", "3kT:X5MD\u0015\u0006\u000b^", "Bh\\2f;:[$", "", "CmX>h,\u001eZ\u0019\u0007zg;`\b", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q$g\u001c\u0013XkWCr.7#k/Dq\u001f0#*@gE\u001a^o]B\t-\u001a]\u0004+PN$\u0013aN\u00049]\u0019V\u0017Ptz\u0014fE-p\u001a\u001e$\u0004=EKBd\n\u000e_{DwtKXe.~\u0011\u0007=roBbaC+JTb,d\u00195\u0004a6K ]x\u0015$j\u001a\u0012\u0013\u000bS\u0013r_ONlC*v\u0002+:v]\u0010)xd<v',!b|\u000eCT>2p6\u0006}\u000e?s\u0005Mg%\u0014E}\u0011=X\u000b.\"?>\\-Zpyu@cO$]\u0019\n,<-\"g/QW\u001c\u000bf\u00191\u001cf[\u00123\u001c\r:Rq^\u0015U\fFd{jo\f ~a\u0013J\u0017]\u0003c^S/c\u001a\u0005XM\u001d\u0018?\u0012\u0007`\u000bq,)%\\ \rq:ab^?&l\u0012\u0017iTt%E~1:\u0002\u0013\u001f\u0006\u001aP8\bN\rv\f\u001f6Jx\u000e*wrDOy\u0004", "5dc\u000eV*>a'\u0003wb3\u0001\u0018C", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0010b5MS,\u000e^=", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adc\u0010b5MS,\u000e^=", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "5dc\u0012_,FS\"\u000ecZ4|", "5dc\u0012_,FS\"\u000ekZ3\r\t", "Adc\u0012_,FS\"\u000ekZ3\r\t", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0015T:A", "u(8", "5dc\u0015X0@V(", "5dc\u0015e,?", "5dc\u0016W", "Adc\u0016W", "5dc\u0019X-M", "Adc\u0019X-M", "5dc X3>Q(~yO(\u0004\u0019/s", "5dc g@ES", "5dc!T.'O!~", "5dc!\\4>a(z\u0003i", "u(9", "5dc!b6Eb\u001d\n", "5dc!b7", "Adc!b7", "5dc!l7>", "5dc\"a0Jc\u0019^\u0002^4|\u0012>I~", "5dc$\\+MV", "Bn9 B\u0015\u001a`&z\u000f", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ElementModel extends CollectionItem {
    private final String accessibility;
    private Integer contextID;
    private final String elementName;
    private String elementValue;
    private final int hash;
    private final Integer height;
    private final String href;
    private String id;
    private Integer left;
    private final String selectedValues;
    private final String style;
    private final String tagName;
    private final long timestamp;
    private final String tooltip;
    private Integer top;
    private final String type;
    private final String uniqueElementId;
    private final Integer width;

    public ElementModel(Integer num, int i2, String str, String str2, String str3, String str4, Integer num2, Integer num3, Integer num4, Integer num5, String str5, String str6, String str7, String str8, String str9, String str10, long j2, String str11) {
        this.contextID = num;
        this.hash = i2;
        this.tagName = str;
        this.id = str2;
        this.elementName = str3;
        this.type = str4;
        this.left = num2;
        this.top = num3;
        this.width = num4;
        this.height = num5;
        this.href = str5;
        this.style = str6;
        this.tooltip = str7;
        this.accessibility = str8;
        this.selectedValues = str9;
        this.elementValue = str10;
        this.timestamp = j2;
        this.uniqueElementId = str11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ElementModel(Integer num, int i2, String str, String str2, String str3, String str4, Integer num2, Integer num3, Integer num4, Integer num5, String str5, String str6, String str7, String str8, String str9, String str10, long j2, String str11, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 + 1) - (i3 | 1) != 0 ? num : num, i2, (-1) - (((-1) - i3) | ((-1) - 4)) != 0 ? "" : str, str2, (i3 & 16) != 0 ? "" : str3, str4, (i3 & 64) != 0 ? num : num2, (-1) - (((-1) - i3) | ((-1) - 128)) != 0 ? num : num3, (i3 + 256) - (i3 | 256) != 0 ? num : num4, (i3 & 512) == 0 ? num5 : 0, (-1) - (((-1) - i3) | ((-1) - 1024)) != 0 ? "" : str5, (-1) - (((-1) - i3) | ((-1) - 2048)) != 0 ? "" : str6, (i3 & 4096) != 0 ? "" : str7, (i3 & 8192) != 0 ? "" : str8, (i3 + 16384) - (i3 | 16384) != 0 ? "" : str9, str10, j2, (i3 & 131072) == 0 ? str11 : "");
    }

    public final String getAccessibility() {
        return this.accessibility;
    }

    public final Integer getContextID() {
        return this.contextID;
    }

    public final String getElementName() {
        return this.elementName;
    }

    public final String getElementValue() {
        return this.elementValue;
    }

    public final int getHash() {
        return this.hash;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getHref() {
        return this.href;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getLeft() {
        return this.left;
    }

    public final String getSelectedValues() {
        return this.selectedValues;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getTagName() {
        return this.tagName;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getTooltip() {
        return this.tooltip;
    }

    public final Integer getTop() {
        return this.top;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUniqueElementId() {
        return this.uniqueElementId;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public final void setContextID(Integer num) {
        this.contextID = num;
    }

    public final void setElementValue(String str) {
        this.elementValue = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setLeft(Integer num) {
        this.left = num;
    }

    public final void setTop(Integer num) {
        this.top = num;
    }

    @Override // com.biocatch.android.commonsdk.backend.CollectionItem
    public JSONArray toJSONArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(clearNull(this.contextID));
        jSONArray.put(this.hash);
        jSONArray.put(clearNull(this.tagName));
        jSONArray.put(clearNull(this.id));
        jSONArray.put(clearNull(this.elementName));
        jSONArray.put(clearNull(this.type));
        jSONArray.put(clearNull(this.left));
        jSONArray.put(clearNull(this.top));
        jSONArray.put(clearNull(this.width));
        jSONArray.put(clearNull(this.height));
        jSONArray.put(clearNull(this.href));
        jSONArray.put(clearNull(this.style));
        jSONArray.put(clearNull(this.tooltip));
        jSONArray.put(clearNull(this.accessibility));
        jSONArray.put(clearNull(this.selectedValues));
        jSONArray.put(clearNull(this.elementValue));
        jSONArray.put(-1);
        jSONArray.put(this.timestamp);
        jSONArray.put("");
        jSONArray.put("");
        jSONArray.put(clearNull(this.uniqueElementId));
        return jSONArray;
    }
}
