package com.biocatch.client.android.sdk.contract.externalCollectors.continuousCollectors.accessibilityEvents;

import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4I\u0007\":\u0018\u007fјnjG<L͜N\u0093Xiճ?k*3dn4uQ;m\u001a,#\u0019S\\i\u007fnx[ŲG\u000f\u0014\u0019Aq:Nmx\f\u0013U̷C8FAS\b=ga;ɉ\u0006hM0?\u0012\u0005/ɝZN\u0016v\tCc\f@1pv@R\u001bO\u001d\u001a@\u0007\u0005ů\u007ffmuVNH\u001b^j51\f\u0002Dd&\u000e/C\u05c8\u000e\u000f[5\u0017\u000faL6\u0007̑4],a\u000f\u001fR\nLIԡp\u000e\u0014v'?+wtɱ:^\bϬ--U\rkvvk\u0013Sx\fU,յgQXʫ@y\u0001}\u001b@ǲ\u0012\u0014"}, d2 = {"\u001ab^:\")B]\u0017z\n\\/F\u00076i\u007f1\u000b\n| \u0016Ty\u0012;@34_G\u001eAv%;IAJ541$hnB\u0003j\nX}.GJ]6i`<;\u001e\u001bi\u0012W;\u0017\u0015g\u001f.uK7\u001d\u00176V\u0010\u0005d~\n\u0016\u001cCnmF]\u0014V\u000et\u0007A2wT#;wEASp.a\u0010f!kN\u001a5\u0014z(\u0003rO.\u0011[ff", "", "7r00V,LW\u0016\u0003\u0002b;\u0011", "", "7rC<h*A3,\n\u0002h9x\u00183o\t", "uYIuI", "u(I", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "AcZy&t\f\u001ccGN,|v\u0016/l\u007f$\n@"}, k = 1, mv = {1, 7, 1}, pn = "", xi = 48, xs = "")
public final class AccessibilityEventModelEx {
    private final boolean isAccesibility;
    private final boolean isTouchExploration;

    public AccessibilityEventModelEx(boolean z2, boolean z3) {
        this.isAccesibility = z2;
        this.isTouchExploration = z3;
    }

    public static /* synthetic */ AccessibilityEventModelEx copy$default(AccessibilityEventModelEx accessibilityEventModelEx, boolean z2, boolean z3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = accessibilityEventModelEx.isAccesibility;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            z3 = accessibilityEventModelEx.isTouchExploration;
        }
        return accessibilityEventModelEx.copy(z2, z3);
    }

    public final boolean component1() {
        return this.isAccesibility;
    }

    public final boolean component2() {
        return this.isTouchExploration;
    }

    public final AccessibilityEventModelEx copy(boolean z2, boolean z3) {
        return new AccessibilityEventModelEx(z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityEventModelEx)) {
            return false;
        }
        AccessibilityEventModelEx accessibilityEventModelEx = (AccessibilityEventModelEx) obj;
        return this.isAccesibility == accessibilityEventModelEx.isAccesibility && this.isTouchExploration == accessibilityEventModelEx.isTouchExploration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    public int hashCode() {
        boolean z2 = this.isAccesibility;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = r02 * 31;
        boolean z3 = this.isTouchExploration;
        return i2 + (z3 ? 1 : z3);
    }

    public final boolean isAccesibility() {
        return this.isAccesibility;
    }

    public final boolean isTouchExploration() {
        return this.isTouchExploration;
    }

    public String toString() {
        return "AccessibilityEventModelEx(isAccesibility=" + this.isAccesibility + ", isTouchExploration=" + this.isTouchExploration + ')';
    }
}
