package com.biocatch.android.commonsdk.collection.collectors.key;

import com.biocatch.android.commonsdk.backend.CollectionItem;
import com.biocatch.android.commonsdk.collection.collectors.elements.IsTrusted;
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
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r)4ߚ\u007f\u0007|jA0JeP.`_2\u000fq}<$q$yّCU0}*\tUiog\u0005JbŏYƤ6\u0016'il1e\u0001c\u0012\u001d2ZqU2{pMAftD\u00078487(\b\u0011 0H\u001ez\u0013Cy\u0011\"4NvRR;P\u0015\"\u0018\u0006L'\u0019 rf|>XpkCG#1jRT5iH~c\ft\\7\u0011\u0005l6+n8E\u001b+S\u0011\u0013j[m\u0010OwC\u0005v5?+w\u0003ɱ:X\u000e$]1]9urT\nKe1$54gcyQdߑ\u0004ߡ\u007f\u0019Dǉ&\b-Y<?:h\u000e!A\tCmNZ\u001a`X~)i\rД1ő77Aӕ~SgP'dW}\u000b$,;Q\u000b/[l\u0010v\u0014IUNΊ=ҨDKPN\u0018vUo\n\np\u001cJ\u00066b\u000eKL\"<\u001e=9q8Q)Ƞ\u0006NLϙ\u000f\u0007f\u0007a\u007f#dN$\u0007\u0018M)7\u000f1լpʰo^\\X:4e\u001eZ&\f(3\"b\u0019JCu\u001f\\Z\u0001i\u0019Nύ\u000e+7ωO[t\u0010\u001ci\nmAAic>n؏z\u001aGֺz\u0007^rPx\\ij6:2vyݻ{\u0002L\u0088$\u00158e\u007fC\u0005;?\u001ft\u0015v\u0006ٿFG\u0005ȁw\\n8\r}\u00043\u0011m<t7\u0006˩`vwΟ\u0011K2'nMγE\u007f"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pMLbuBR\u0007\u001d%\u0012c\u001d65\f\u0005`\u0017", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#z\u001c5s\u00167L\r\u0019u;%\u0015fp=\u0011l\u0010]v/\u001d", "1n]AX?M7w", "", "3uT;g\u0010\u001d", "", "Bx_2", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pMLbuBR\u0007\u001d%\u0012c\u001d=?\u0018\u0005/", "Bh\\2f;:[$", "3kT:X5M7\u0018", "", "1gP?66=S", "1gP?T*MS&", "6`b5", "7rC?h:MS\u0018", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pGSN4\\[\u0002K]uh|[;\u001b\u0014Y@y", ":nR.g0H\\", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pMLbuBR\u0007$\u001e\u0010V\u001dR5\u0016smL$D", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q'\u0006\u0013(C9\u00158\u007f'~@\b)9C|,WK\u0005h8(\u0013dp7\n-(Wu4QPMuZ\\zE\u001e\u001bh\rTt\u000b\u000f`H$lS;)\u0011uG\fBo\u0001\n%\u0018Bx:HV$\u0011_\u0015\n!:hOhN\u000eRA\u001bG\u0011i\bp\u0019&A6-\u0016;\u0007*uT7\fQ7wwN\u000bc1N\u0015\u0004:m,|hJNq+ [%)SEt\u0016<Vp:r0M035q\u000fOfa<h\u0001\u001d6eO&,\u007f:\u001dFRcs{B\u0018qh_\u0012\u0015i5/(orq\u0012\u000f\u000e]\u001f[>pmJ\u001b`tKY}$'ET)Y\u0004\u001dR\u0004(wcER\u0019WJ\u0016yC/i\u0015\u0002Ld\"$6 Fg\u000ens]AT\u001a\tfG\u0010\u0006b\r\u0013zO\u0017mI\u0002ed}m<x%\u0013\u00073_#\u0001P?~\u0014 =o\u001f\n\u001dI-3", "5dc\u0010[(K1#}z", "u(8", "Adc\u0010[(K1#}z", "uH\u0018#", "5dc\u0010[(KO\u0017\u000ezk", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u0010[(KO\u0017\u000ezk", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "5dc\u0010b5MS,\u000e^=", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adc\u0010b5MS,\u000e^=", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "5dc\u0012_,FS\"\u000e^]", "5dc\u0012i,Gb|]", "u(;7T=:\u001d z\u0004`uc\u00138gU", "Adc\u0012i,Gb|]", "uKY.i(\bZ\u0015\b|(\u0013\u0007\u00121;C\u0019", "\u001aiPCTuEO\"\u0001DE6\u0006\u000b\u0005", "5dc\u0015T:A", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016N3\\ZrF# $q\\\u001a\u001a\u0015gP$m\u001a", "5dc\u0019b*:b\u001d\t\u0004", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016T,p\u001cX=(xd\fJ:\u0011\u000fb08yD\r", "5dc!\\4>a(z\u0003i", "u(9", "5dc!l7>", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016T,p\u001cX=(qk\u000eW:{\u0019dAy", "Bn9 B\u0015\u001a`&z\u000f", "\u001ana4\"1L]\"H_L\u0016ed<r{<Q", "1n\\:b5LR\u001fFH'yv\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class KeyEventModel extends CollectionItem {
    private int charCode;
    private String character;
    private Integer contextID;
    private final String elementId;
    private Long eventID;
    private final int hash;
    private final IsTrusted isTrusted;
    private final KeyLocationType location;
    private final long timestamp;
    private final KeyEventType type;

    public KeyEventModel(Integer num, Long l2, KeyEventType type, long j2, String str, int i2, String str2, int i3, IsTrusted isTrusted, KeyLocationType location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(isTrusted, "isTrusted");
        Intrinsics.checkNotNullParameter(location, "location");
        this.contextID = num;
        this.eventID = l2;
        this.type = type;
        this.timestamp = j2;
        this.elementId = str;
        this.charCode = i2;
        this.character = str2;
        this.hash = i3;
        this.isTrusted = isTrusted;
        this.location = location;
    }

    public /* synthetic */ KeyEventModel(Integer num, Long l2, KeyEventType keyEventType, long j2, String str, int i2, String str2, int i3, IsTrusted isTrusted, KeyLocationType keyLocationType, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : num, (i4 & 2) != 0 ? 0L : l2, (i4 + 4) - (i4 | 4) != 0 ? KeyEventType.KEY_PRESS : keyEventType, j2, (i4 & 16) != 0 ? null : str, i2, str2, i3, (i4 + 256) - (i4 | 256) != 0 ? IsTrusted.UNDEFINED : isTrusted, (i4 & 512) != 0 ? KeyLocationType.UNKNOWN : keyLocationType);
    }

    public final int getCharCode() {
        return this.charCode;
    }

    public final String getCharacter() {
        return this.character;
    }

    public final Integer getContextID() {
        return this.contextID;
    }

    public final String getElementId() {
        return this.elementId;
    }

    public final Long getEventID() {
        return this.eventID;
    }

    public final int getHash() {
        return this.hash;
    }

    public final KeyLocationType getLocation() {
        return this.location;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final KeyEventType getType() {
        return this.type;
    }

    public final IsTrusted isTrusted() {
        return this.isTrusted;
    }

    public final void setCharCode(int i2) {
        this.charCode = i2;
    }

    public final void setCharacter(String str) {
        this.character = str;
    }

    public final void setContextID(Integer num) {
        this.contextID = num;
    }

    public final void setEventID(Long l2) {
        this.eventID = l2;
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
        jSONArray.put(this.charCode);
        jSONArray.put(clearNull(this.character));
        jSONArray.put(-1);
        jSONArray.put(false);
        jSONArray.put(false);
        jSONArray.put(false);
        jSONArray.put(false);
        jSONArray.put(this.location.ordinal());
        return jSONArray;
    }
}
