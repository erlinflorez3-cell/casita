package com.biocatch.client.android.sdk.collection.collectors.elements;

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
@Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4\u0012}\u0007njG<LeN5Xݷ@ş\u001c{b#\u001cG\u0002GIU2}P\n_Rui\u0007J\t\u000eS\u0013\u0014\u001a\u0011jZLe|k\u0017'2puУ7M}D\no\u0003;\u001d `(أ}\u000b\tɝBJ\u0016~\tL\u001c\u001b 2XphUҫQ\u000b\"Ň\u001e@&\u000b,g8]DL\u0005]h2ݭ\u0007oJ÷?a6\t[\u0018\u0017c5\r\u000faL,Ë;;\u001dǬk\u0005\r_iMƊC\u0001"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[:\u0015N3\r\u000eh!5nMF}\u0004;EW", "", "Bx_2", "\u001ab^:\")B]\u0017z\n\\/F\u00058d\r2\u007f?J\u0015!Ow\u0018E\u0005$;#{*>t\u0016,\\GEt}\u001c\u001foh9\u0005r6[\u0005pGSN4\\[\u0002K]qa\u000eV+\u0016\u00149R$wS&3\u0013,\u001f", "6`b5", "", ":d]4g/", "3kT:X5MD\u0015\u0006\u000b^", "", "uKR<`u;W#|vm*\u007fR+n~5\u0006D\u007f`\u0015Qw\u0016F\u007f34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[:\u0015N3\r\u000eh!5nMF\u000e\u001c7IW\u001fLg\u0011\u0012\u001f14w>_\u0012\u0011g$\u0003E2j\u001c\u001dP", "5dc\u0012_,FS\"\u000ekZ3\r\t", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0015T:A", "u(8", "5dc\u0019X5@b\u001c", "5dc!l7>", "u(;0b4\bP\u001d\txZ;z\fxa\t'\tJ\u0005\u0016`Ey\u0016D\u0001.CX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016N3\\ZrF# $mU+\u0015\u0005bP\u0004\u007fD@.v@T\u0002\u0011", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ElementEventData {
    private final String elementValue;
    private final int hash;
    private final int length;
    private final ElementEventType type;

    public ElementEventData(ElementEventType type, int i2, int i3, String elementValue) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(elementValue, "elementValue");
        this.type = type;
        this.hash = i2;
        this.length = i3;
        this.elementValue = elementValue;
    }

    public final String getElementValue() {
        return this.elementValue;
    }

    public final int getHash() {
        return this.hash;
    }

    public final int getLength() {
        return this.length;
    }

    public final ElementEventType getType() {
        return this.type;
    }
}
