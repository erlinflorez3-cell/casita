package com.biocatch.client.android.sdk.contract.externalCollectors.continuousCollectors.keyEvents;

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
@Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4B\u0007\":\u0018\u007f\u0007lsA0RnP.XU0Ŧq\u0012éT[Rp\u0004Ve\u001e\f\"!O|hwrX\\#C=\u0007&|x/aU'aܫ\u00132Pt\b:[zU9\u000fu|ԓ!z)F\u0006\u001d\u0001H+\u000fǼwCJY\u0019*0nt\u0001Ŭ\u000e\u0016*( \u001e>NҵNbmNDH\u0005]h0S\toB\\)w0+N=LZ'\u001byy\u001eYD}\u0094\u0014md\u0011\u0016j[m\u0013owK\u0016\u0001)=*wr\u001e\u0383YH\u001b#=g\r\fvlٯ\u0004\u001ag\u001a:CO\u0012L\u0017̂'H\n\n\rT\u0004<\u0007όL45Կ~\n\u00149\u0003y$O^\u0004vB.{ˋ:\u001d-ĮK-?#tX2J'QO{3\u0011̷'\u0007vďsV\u0014i#%ǁ{e"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<;\u001e\u001bi\u0012W;\u0017\u0015g\u001f.uK7\u001d\u00176V\u0010\u0005n\u0001 u\u001f5s\u007fP uG\u000et\u0007A2w.c^yN!X8", "", "1gP?T*MS&", "", "3kT:X5M7w", "6`b5", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}bE|(\u0013\u0011v\nExn#h\u000b$@ok\u0012\u00114", "5dc\u0010[(KO\u0017\u000ezk", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc\u0012_,FS\"\u000e^=", "5dc\u0015T:A", "u(8", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class KeyEventModelEx {
    private final String character;
    private final String elementID;
    private final int hash;

    public KeyEventModelEx(String character, String elementID, int i2) {
        Intrinsics.checkNotNullParameter(character, "character");
        Intrinsics.checkNotNullParameter(elementID, "elementID");
        this.character = character;
        this.elementID = elementID;
        this.hash = i2;
    }

    public static /* synthetic */ KeyEventModelEx copy$default(KeyEventModelEx keyEventModelEx, String str, String str2, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 1)) != 0) {
            str = keyEventModelEx.character;
        }
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            str2 = keyEventModelEx.elementID;
        }
        if ((i3 + 4) - (i3 | 4) != 0) {
            i2 = keyEventModelEx.hash;
        }
        return keyEventModelEx.copy(str, str2, i2);
    }

    public final String component1() {
        return this.character;
    }

    public final String component2() {
        return this.elementID;
    }

    public final int component3() {
        return this.hash;
    }

    public final KeyEventModelEx copy(String character, String elementID, int i2) {
        Intrinsics.checkNotNullParameter(character, "character");
        Intrinsics.checkNotNullParameter(elementID, "elementID");
        return new KeyEventModelEx(character, elementID, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyEventModelEx)) {
            return false;
        }
        KeyEventModelEx keyEventModelEx = (KeyEventModelEx) obj;
        return Intrinsics.areEqual(this.character, keyEventModelEx.character) && Intrinsics.areEqual(this.elementID, keyEventModelEx.elementID) && this.hash == keyEventModelEx.hash;
    }

    public final String getCharacter() {
        return this.character;
    }

    public final String getElementID() {
        return this.elementID;
    }

    public final int getHash() {
        return this.hash;
    }

    public int hashCode() {
        return (((this.character.hashCode() * 31) + this.elementID.hashCode()) * 31) + Integer.hashCode(this.hash);
    }

    public String toString() {
        return "KeyEventModelEx(character=" + this.character + ", elementID=" + this.elementID + ", hash=" + this.hash + ')';
    }
}
