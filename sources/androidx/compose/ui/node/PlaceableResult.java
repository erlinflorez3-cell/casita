package androidx.compose.ui.node;

import androidx.compose.ui.layout.MeasureResult;
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
/* JADX INFO: compiled from: LookaheadDelegate.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4\u0012}\u0007njG9LeN6ZS8şsڔ<$i*yّCU(\n*ޛUȡm}ñzZ9BO\u0019&|x,aU'^\"\u0013@D\b?aPڱA9nx~\f.>:8(\u0006Gʤ+\u0011\u0017\u0005\b[K:\u0015vВq\u0003m\u001b[\u001d\u001a@ßn&\u0007\u001ejgf6vm\u000e@5#\u0011kZNUbvƮLUWb6%v\u0010$[FEE-'i\u00025c\"Ё\u0004\bxK\u0017\u0001'U>\u0010\u05ecV~_\u000e(-+}\"$ō%-\u0017_e$'YU\u001a '˂*Þ~\u007f%>\n\u0013\u0014.\u0019=;\u001c~\b<6ϢvYHА\u001a`H\b\tj\u0007&3\u007fK+g\u001cƻUgCϊf9\u0002\u000f\u001b)ũ\u0005\u0005"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9xCr#5Uz'7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%BG{*Bmk", "@dbB_;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", ">kP0X(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9tF\u0001+1\\}\u001c6K\u00129I@Bk\u001f%\u0011fa5\u0004j,$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0003.[SBz\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[c\u0018M+VkcK*jG7\u001b\u0007\nE\r7e\b\f\u0001\u00151hp>S\u0017GOXf", "7rE._0==+\bzk\u001az\u0013:e", "", "u(I", "5dc\u001d_(<S\u0015{\u0002^", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]/?_y#7i\u0015\fIN7h;\u001e\u007fo]7\u0007_)Uv|", "5dc\u001fX:NZ(", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001dYy.Gz\u0016\u001bMQKrCs", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n_F", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class PlaceableResult implements OwnerScope {
    private final LookaheadCapablePlaceable placeable;
    private final MeasureResult result;

    public static /* synthetic */ PlaceableResult copy$default(PlaceableResult placeableResult, MeasureResult measureResult, LookaheadCapablePlaceable lookaheadCapablePlaceable, int i2, Object obj) {
        if ((i2 + 1) - (1 | i2) != 0) {
            measureResult = placeableResult.result;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            lookaheadCapablePlaceable = placeableResult.placeable;
        }
        return placeableResult.copy(measureResult, lookaheadCapablePlaceable);
    }

    public final MeasureResult component1() {
        return this.result;
    }

    public final LookaheadCapablePlaceable component2() {
        return this.placeable;
    }

    public final PlaceableResult copy(MeasureResult measureResult, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        return new PlaceableResult(measureResult, lookaheadCapablePlaceable);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceableResult)) {
            return false;
        }
        PlaceableResult placeableResult = (PlaceableResult) obj;
        return Intrinsics.areEqual(this.result, placeableResult.result) && Intrinsics.areEqual(this.placeable, placeableResult.placeable);
    }

    public int hashCode() {
        return (this.result.hashCode() * 31) + this.placeable.hashCode();
    }

    public String toString() {
        return "PlaceableResult(result=" + this.result + ", placeable=" + this.placeable + ')';
    }

    public PlaceableResult(MeasureResult measureResult, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        this.result = measureResult;
        this.placeable = lookaheadCapablePlaceable;
    }

    public final MeasureResult getResult() {
        return this.result;
    }

    public final LookaheadCapablePlaceable getPlaceable() {
        return this.placeable;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.placeable.getCoordinates().isAttached();
    }
}
