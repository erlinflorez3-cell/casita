package com.biocatch.client.android.sdk.contract.externalCollectors.continuousCollectors.elementEvents;

import com.biocatch.android.commonsdk.collection.collectors.elements.ElementEventType;
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
@Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4ߚ\u007f\u0007tvA0JrP.`\\2\u000fq}:Ša:ڎs;\u0004\u0019>E\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019/YY\u0007a*\u000f`G\u007fCAS\b=geҽ:\u0005.9j?\b\u0014\u0019\u001aXIVΓ{\fR\u001a\"H@\u001f=\u0019ӏNM! \u0017V /##ʨO~OzoR/Q\b0ŰOo\u000f>\u0010e\rtÖW\u0013|a,+X7c\u0016UY\t\u0007`]W\u0003mtm\u000bn'5/as\u0006;\t\u0006\u001a\u00159U%]!+#ԫP)\u001d5?gcye>.\u0006\u0011\u0014\u000fR\u0003<\u0005mϵ/u!t\u001f&3#u\u001aŊOJeP\u0018\u0013ad\u001ckƅ2{H)jiai\u001e\u05ee;\u0002\rټ6%\u0007v/d%\u001dn\u001b3T&VśUFEʰf\f_G{\rAq\u0010,\u001c0u\u0003\u009e\u007f\u00176Ϗ=9aD1-<\u0011VD\u007fv3aĈWoZ̲X$t#E8Ç\u0010s"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<;\u001e\u001bi\u0012W;\u0017\u0015g\u001f.uK7\u001d\u00176V\u0010\u0005h\b\f\u001e\u000e>yPSV\u0019V\b^UH)pFbnYXANq8L\u0016^\u001dc\u001aMy", "", "Bx_2", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pGSN4\\[\u0002K]qa\u000eV+\u0016\u00149R$wS&3\u0013,\u001f", "6`b5", "", "3kT:X5M7w", "", "3kT:X5MD\u0015\u0006\u000b^", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[:\u0015N3\r\u000eh!5nMF\u000e\u001c7IW\u001fO\u0006\b'\n~qlKXY5\t\"yJ+>-^[\u000bC\u000bL^3fUM,i>C&i5\n", "5dc\u0012_,FS\"\u000e^=", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0012_,FS\"\u000ekZ3\r\t", "5dc\u0015T:A", "u(8", "5dc!l7>", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016N3\\ZrF# $mU+\u0015\u0005bP\u0004\u007fD@.v@T\u0002\u0011", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ElementEventsModelEx {
    private final String elementID;
    private final String elementValue;
    private final int hash;
    private final ElementEventType type;

    public ElementEventsModelEx(ElementEventType type, int i2, String elementID, String elementValue) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(elementID, "elementID");
        Intrinsics.checkNotNullParameter(elementValue, "elementValue");
        this.type = type;
        this.hash = i2;
        this.elementID = elementID;
        this.elementValue = elementValue;
    }

    public static /* synthetic */ ElementEventsModelEx copy$default(ElementEventsModelEx elementEventsModelEx, ElementEventType elementEventType, int i2, String str, String str2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            elementEventType = elementEventsModelEx.type;
        }
        if ((i3 + 2) - (2 | i3) != 0) {
            i2 = elementEventsModelEx.hash;
        }
        if ((4 & i3) != 0) {
            str = elementEventsModelEx.elementID;
        }
        if ((i3 + 8) - (i3 | 8) != 0) {
            str2 = elementEventsModelEx.elementValue;
        }
        return elementEventsModelEx.copy(elementEventType, i2, str, str2);
    }

    public final ElementEventType component1() {
        return this.type;
    }

    public final int component2() {
        return this.hash;
    }

    public final String component3() {
        return this.elementID;
    }

    public final String component4() {
        return this.elementValue;
    }

    public final ElementEventsModelEx copy(ElementEventType type, int i2, String elementID, String elementValue) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(elementID, "elementID");
        Intrinsics.checkNotNullParameter(elementValue, "elementValue");
        return new ElementEventsModelEx(type, i2, elementID, elementValue);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElementEventsModelEx)) {
            return false;
        }
        ElementEventsModelEx elementEventsModelEx = (ElementEventsModelEx) obj;
        return this.type == elementEventsModelEx.type && this.hash == elementEventsModelEx.hash && Intrinsics.areEqual(this.elementID, elementEventsModelEx.elementID) && Intrinsics.areEqual(this.elementValue, elementEventsModelEx.elementValue);
    }

    public final String getElementID() {
        return this.elementID;
    }

    public final String getElementValue() {
        return this.elementValue;
    }

    public final int getHash() {
        return this.hash;
    }

    public final ElementEventType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((this.type.hashCode() * 31) + Integer.hashCode(this.hash)) * 31) + this.elementID.hashCode()) * 31) + this.elementValue.hashCode();
    }

    public String toString() {
        return "ElementEventsModelEx(type=" + this.type + ", hash=" + this.hash + ", elementID=" + this.elementID + ", elementValue=" + this.elementValue + ')';
    }
}
