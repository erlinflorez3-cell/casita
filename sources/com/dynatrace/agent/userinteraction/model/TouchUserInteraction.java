package com.dynatrace.agent.userinteraction.model;

import java.util.List;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLш|\u0004O$8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nj?;LeV7ZS0\u000fs{B*cҕyCIa\"Ԃ(ޜUdʴ\u0018nxYKh\u001f\u0010$x\u00032YW\t]@\u0011`C\u007fCAP\b=gd\u0005<\u0013%J$Nx3\u0005ʀ.J\u0016|\tJ\u0014\u0019 =XvJT\u001dM3\u001c@\u0007\u0005ů\u0002fcu\\NH\u001ba\u0001ȉ$KrP]?aF{{\u0011\rĝ(U$o.C@eߎE1Y\u0003\u0015RsE\u0013A\u0002=3jU([OyWD[\u0018\u0014C/\u007f\u0015cr4a\u001dSv\u000bU/\u0016ӱJ\u0019\u001f6\t\u0013{;N4\u0014\u0014:`0C\u0019\u0015\u0007T߮u;ZNd\u001a^p\u0015A˿5_,\u000eIC9I}\u0018ż:icE{\u001d\u0013.%\u0011nO]\u0003\u000f\u05ce\u0019!\\ȭi3WHKQ\u001f\u0019g@\u0006\u0004\u001ff͆.\n8Ϛ\u00181\u0002\u001b<\"uHi>;#\u0002\u0001vHϼz\u000bhåkkXTN-ë\u001aO"}, d2 = {"\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<vq,[Z0VL[(ZavG\u001dg", "", ">nb6g0H\\'", "", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\r\u001fx_<ft,W\u0006|", "3kT:X5M", "\u001ab^:\"+R\\\u0015\u000e\bZ*|R+g\u007f1\u000b\n\u0011%\u0017Ts\u0017Kv21W\r$Av_6WB;r}\u000e\u0019Hh9\u000fc5]L", "/mR2f;H`", "\nh]6g\u0005", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;f&\u0006HJ\u0016+Pk\u001dIr#5#y\"7v%w]Q;x8'$hn5\u0005r0X\u007fpOVM,c\u001cbAs\u0019Z\u0016N4\u001cZ@?.v\u000e63\u0011(X\u000f7f\u0001U\u0012\u00105s\u007f\ff\u001eG\u0007\u0019~P)uBWn}QJ\u000fj4c\fffL>\u001a+\u0014y\u0019$w&qz", "5dc\u001db:Bb\u001d\t\u0004l", "u(;7T=:\u001d)\u000e~euc\r=tU", "5dc\u0012_,FS\"\u000e", "u(;0b4\bR-\bvm9x\u0007//{*{I\u0010`'Uo\u001b@\u007f45fy\u001eFq 7\u0017KEj4%^Xe\u0019\u000ec4N\u007f6\u001d", "5dc\u000ea*>a(\t\b", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "", "BnBAe0GU", "", "1n\\zW@GO(\fv\\,E\u00051e\t7uM\u0001\u001e\u0017C}\u000e"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public final class TouchUserInteraction {
    private final UiElement ancestor;
    private final UiElement element;
    private final List<TouchEvent> positions;

    public TouchUserInteraction(List<TouchEvent> positions, UiElement element, UiElement uiElement) {
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(element, "element");
        this.positions = positions;
        this.element = element;
        this.ancestor = uiElement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TouchUserInteraction copy$default(TouchUserInteraction touchUserInteraction, List list, UiElement uiElement, UiElement uiElement2, int i2, Object obj) {
        if ((1 & i2) != 0) {
            list = touchUserInteraction.positions;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            uiElement = touchUserInteraction.element;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            uiElement2 = touchUserInteraction.ancestor;
        }
        return touchUserInteraction.copy(list, uiElement, uiElement2);
    }

    public final List<TouchEvent> component1() {
        return this.positions;
    }

    public final UiElement component2() {
        return this.element;
    }

    public final UiElement component3() {
        return this.ancestor;
    }

    public final TouchUserInteraction copy(List<TouchEvent> positions, UiElement element, UiElement uiElement) {
        Intrinsics.checkNotNullParameter(positions, "positions");
        Intrinsics.checkNotNullParameter(element, "element");
        return new TouchUserInteraction(positions, element, uiElement);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TouchUserInteraction)) {
            return false;
        }
        TouchUserInteraction touchUserInteraction = (TouchUserInteraction) obj;
        return Intrinsics.areEqual(this.positions, touchUserInteraction.positions) && Intrinsics.areEqual(this.element, touchUserInteraction.element) && Intrinsics.areEqual(this.ancestor, touchUserInteraction.ancestor);
    }

    public final UiElement getAncestor() {
        return this.ancestor;
    }

    public final UiElement getElement() {
        return this.element;
    }

    public final List<TouchEvent> getPositions() {
        return this.positions;
    }

    public int hashCode() {
        int iHashCode = ((this.positions.hashCode() * 31) + this.element.hashCode()) * 31;
        UiElement uiElement = this.ancestor;
        return iHashCode + (uiElement == null ? 0 : uiElement.hashCode());
    }

    public String toString() {
        return "TouchUserInteraction(positions=" + this.positions + ", element=" + this.element + ", ancestor=" + this.ancestor + ')';
    }
}
