package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
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
/* JADX INFO: compiled from: RowColumnMeasurePolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯJ\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4\u0012}\tnjG9LeN/ZS@\u000fsڔ<$i3yCQU\"Ԃ*\teNogtJb\u000bQ\"\u000e\u0016~p4Icxe\u0012\u00154HNU\u074c}ok8)2D\u000582P9*\t\u000f\u001cBH>y+GY\u0010*0nsjV\u001bR\u001d\u001a@\tn$\u000f$tg|9xrc:=*\u001bipVm\u0004ޗ{ձЮESܮ\u0011xg'9J\u007f\u001b#0k\u00035^\fK\u0011L\nE\u0015l7)AH\"fdf0\u0018#;g\r\f\u0004V`\u0013cx\fU.\u007fgYc&(&\u000f,\u0011J\u0019&\u0006UK^1(| \u000eaw#YNg\u001a`X~)uf\u001b3\u0018K+g\u001e\u0017UoT1Ne~5\u0011,=\u0019nO^\u001b2\u05ce\u0019\u001bb\u0013\u001aW_\\UH|'\nA{\u0019\tb0-44U\u001eG{?BG)EnQ#O\u007f2LRw\u000f\u0005\u000fy\u001a\u000e\u001bRNA\u0007\u0016e-1\f\tS+)4ZbxD\u0011{\u001f|\u0007,\u0017YDиv<Ɯ%\u001fVOn\trPcܥA]e?[t\u000b<VߓbT͑Ub"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u00038_!ErD&\u001ePa5\u0015s9Na1NPL@2", "", "1qT.g,\u001c]\"\r\nk(\u0001\u0012>s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";`X;4?Ba\u0001\u0003\u0004", "", "1q^@f\bQW'f~g", ";`X;4?Ba\u0001z\u000e", "1q^@f\bQW'fvq", "7r??\\6KW(\u0003\u0010b5~", "", "1qT.g,\u001c]\"\r\nk(\u0001\u0012>sG;\\\rj{f3", "uH8\u0016<!\u00028", ">kP0X\u000f>Z$~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", ">kP0X(;Z\u0019\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", ";dP@h9>A\u0017\t\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "0dU<e,\u001c`#\r\t:?\u0001\u0017\u000bl\u0004*\u0005H\u0001 &.s\u0017<", ";`X;4?Ba\u0004\t\tb;\u0001\u00138s", "", ";`X;4?Ba\u007fz\u000fh<\fv3z\u007f", "1q^@f\bQW'evr6\r\u0018\u001di\u0015(", "1q^@f\bQW'h{_:|\u0018", "1ta?X5M:\u001d\bzB5{\tB", "AsP?g\u0010GR\u0019\u0012", "3mS\u0016a+>f", "uZ;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n `y\u001e7i\u00135M\u0019\"g=\u001d\"re8\u001a-*X~2QZNulV<D\u0010&d\u001e]tt\u0005UO4{D%\u001d\u00127IW\u001f^doy\u0004\u0019NT&\u001avC\u0003\u0014\u0003K-gY#]\u0004OLOp*.\u001ccfc6N.$\u0001b\u0003hL<\u001a\tS}r`\nnv\u001d", ">n_B_(MS\u0001z~g\b\u0010\r=P\n6\u007fO\u0005! U", "", "1gX9W9>\\\u0001z~g\b\u0010\r=S\u0004={", "1q^@f\bQW'l~s,", ";`X;4?Ba\u0007\u0003\u0010^", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface RowColumnMeasurePolicy {
    /* JADX INFO: renamed from: createConstraints-xF2OJ5Q */
    long mo933createConstraintsxF2OJ5Q(int i2, int i3, int i4, int i5, boolean z2);

    int crossAxisSize(Placeable placeable);

    int mainAxisSize(Placeable placeable);

    MeasureResult placeHelper(Placeable[] placeableArr, MeasureScope measureScope, int i2, int[] iArr, int i3, int i4, int[] iArr2, int i5, int i6, int i7);

    void populateMainAxisPositions(int i2, int[] iArr, int[] iArr2, MeasureScope measureScope);

    /* JADX INFO: renamed from: createConstraints-xF2OJ5Q$default, reason: not valid java name */
    static /* synthetic */ long m1043createConstraintsxF2OJ5Q$default(RowColumnMeasurePolicy rowColumnMeasurePolicy, int i2, int i3, int i4, int i5, boolean z2, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createConstraints-xF2OJ5Q");
        }
        if ((i6 & 16) != 0) {
            z2 = false;
        }
        return rowColumnMeasurePolicy.mo933createConstraintsxF2OJ5Q(i2, i3, i4, i5, z2);
    }
}
