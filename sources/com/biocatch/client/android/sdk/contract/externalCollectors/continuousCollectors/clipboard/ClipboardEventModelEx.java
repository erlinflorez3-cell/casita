package com.biocatch.client.android.sdk.contract.externalCollectors.continuousCollectors.clipboard;

import com.biocatch.client.android.sdk.collection.collectors.clipboard.ClipEventType;
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
@Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r.4\u0012}\u000enjG9LeN.ZS8\u0015s{:$aҜwYП\u0006\u001a,!Id^kunbZ9D\u001f\f$z\u0003._T'`ܫ\u00132Ps\b:[xU9\u000fu|ԓ!z+F\u0004\u001d\u00030)v\u0013=ڠD\u0014) ;Xphĥ=S\u000b\u001a \u0006V /\u001f\roT6Vnu<E\"1l\tľ&(A\u000bY%F\u00034=|o,CBM4C$\u001aϟ\b\u001bbM\u0012Wqk\u0015/Ҿ&sP\u0002hNX.\u0017[ܗN]l\u0001&t\u0005\u007faВ+1WҪcR\u0014-\u0006\u0001L\u001eJ\u0006&\b=G\\0բj\u000e\u0016ޗ\rtYG^\n\u07b2F\u0012"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<;\u001e\u001bi\u0012W;\u0017\u0015g\u001f.uK7\u001d\u00176V\u0010\u0005f\b\u0010!\u000b?f}A mN} rK%uE9pyPP-l)d\u0013?02", "", "3uT;g\u001bR^\u0019", "\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011JU0gO|9!\u0011$kU/\u0018djA-}3K*\b\u0002", "BdgA", "", "uKR<`u;W#|vm*\u007fR-l\u0004(\u0005OJ\u0013 F|\u0018@unCX\u0004i5w\u001d5MAJo>'^fk@\u000ec*]\u00014U\u0016L3`]oG\u0010\u001fYW,2\u0011\u00109R$wS&3\u0013,\u001fh@d\u0012\b_\u00151sr\fD\u001fT}\u001ew\u0017lY", "5dc\u0012i,Gb\b\u0013\u0006^", "u(;0b4\bP\u001d\txZ;z\fxc\u0007,{I\u0010`\u0013Pn\u001bFz$~g|&\u0001k 5TC9z8(\u001e2_C\u000ej,L\u00061TZ\u0018*cV}:\u001e\u000eg\r\u0018\t\u0014\td!5nMF\u000e\u001c7IW", "5dc!X?M", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ClipboardEventModelEx {
    private final ClipEventType eventType;
    private final String text;

    public ClipboardEventModelEx(ClipEventType eventType, String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.eventType = eventType;
        this.text = str;
    }

    public static /* synthetic */ ClipboardEventModelEx copy$default(ClipboardEventModelEx clipboardEventModelEx, ClipEventType clipEventType, String str, int i2, Object obj) {
        if ((1 & i2) != 0) {
            clipEventType = clipboardEventModelEx.eventType;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            str = clipboardEventModelEx.text;
        }
        return clipboardEventModelEx.copy(clipEventType, str);
    }

    public final ClipEventType component1() {
        return this.eventType;
    }

    public final String component2() {
        return this.text;
    }

    public final ClipboardEventModelEx copy(ClipEventType eventType, String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return new ClipboardEventModelEx(eventType, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipboardEventModelEx)) {
            return false;
        }
        ClipboardEventModelEx clipboardEventModelEx = (ClipboardEventModelEx) obj;
        return this.eventType == clipboardEventModelEx.eventType && Intrinsics.areEqual(this.text, clipboardEventModelEx.text);
    }

    public final ClipEventType getEventType() {
        return this.eventType;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.eventType.hashCode() * 31;
        String str = this.text;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ClipboardEventModelEx(eventType=" + this.eventType + ", text=" + this.text + ')';
    }
}
