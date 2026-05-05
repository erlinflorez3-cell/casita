package com.biocatch.client.android.sdk.collection.collectors.elements;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
@Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r.4\u0012}\u000elʑOӄtev-\u0013v:\u0013y{L$\n%\u0002GIW2}P\f_Ruk\u0007J\t\fS\u0013\u0014\u001b\u0011jZJǤ|] \u0015zF}JKM\u001e@\no\u0003;\u001d `#أ}\u000b\tɝBJ\u0016}\tK\u001c\u001b 0XphSҫQ\u000b\"Ň\u001e@&\n,d8ZDJ\u0005]h2yɈkŌR'gܞM\\\u001bJl';wҐ\"1HʺM\u0017+]\u0011\u000fҡ_K"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAt\u001d.KR?u=g\u0013rh@\u0007a;X\u00045\u0011LU,dR{L\"[K\u0012N=l\fYI$wS\r", "", "BqPCX9LO b\u0004],\u0010", "", "DhTD63:a'gvf,", "", "DhTD;(LVv\ty^", ">`a2a;!O'\u0002Xh+|", "uH;7T=:\u001d z\u0004`uj\u0018<i\t*Q$dZ\b", "5dc\u001dT9>\\(avl/Z\u0013.e", "u(8", "5dc!e(OS&\rve\u0010\u0006\b/x", "5dc#\\,P6\u0015\r}<6{\t", "5dc#\\,P1 z\tl\u0015x\u0011/", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class ViewElement {
    private final int parentHashCode;
    private final int traversalIndex;
    private final String viewClassName;
    private final int viewHashCode;

    public ViewElement(int i2, String viewClassName, int i3, int i4) {
        Intrinsics.checkNotNullParameter(viewClassName, "viewClassName");
        this.traversalIndex = i2;
        this.viewClassName = viewClassName;
        this.viewHashCode = i3;
        this.parentHashCode = i4;
    }

    public final int getParentHashCode() {
        return this.parentHashCode;
    }

    public final int getTraversalIndex() {
        return this.traversalIndex;
    }

    public final String getViewClassName() {
        String str = this.viewClassName;
        String strSubstring = str.substring(StringsKt.lastIndexOf$default((CharSequence) str, ".", 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final int getViewHashCode() {
        return this.viewHashCode;
    }
}
