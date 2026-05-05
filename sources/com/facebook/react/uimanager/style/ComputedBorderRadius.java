package com.facebook.react.uimanager.style;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@Metadata(bv = {}, d1 = {"Я2\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005/4\u0012\u0006\u0010nj?1Le^.ZS0\u000fs{B*cҕyCIa\"Ԃ(ޢUdʴ\u0018nxYKH\u0015\u001aȀ|j:I\u0016\u001cm\u0016\u001d3Zom5]sK<xtd\u0007060<\u0012\u0005/\u001c:L\u001e{\u0013Cy\u000eܘ4@~@\u001b\u0014[\u00112\u00124@fӼ\u001f%n\\C`l\f<uޑ\u00042I\\5w0+OSцUo\u0014\u0005p6+n9{֝&\u001c2\u0015bs?1ӊ\"C\u000bh5(CI\"Yf^\u0006\u0014#.g\r\ftVb\u000bQn\u0010?+}e{V\u0014(\u0006\u007f\u0014\rj\u0006Tρ&\u0011?;+~\b<E%xaSh\u0004tA.y(پ\u0018m\fA?Q\u001b\u0015S\u0012?'cO{3#f'\u000f\u00069[\u0003 )\u001c)l\u0010Q_j\u0007ؗG\u0017\u0011gW\u0006\u0004\u001f}HĦ\u0003\u0001V\u000e3\u0014\u0011\\\u0019É;aA\u05fa9m\bORoG\u0014nmki\u0001Jغ&t\u001eճB\u000b\u0012cRlUz^Up,?OɟX\r\u0006ܱ+\"b\u0002J)u\u001f\\R\u0001i\u0019Oύ\u000e+7ωO[tv\u001c_ߓbO"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77s8UNKz4\u001dqrn8\u0007p\u0019Ju+WZ$", "", "u(E", "Bn_\u0019X-M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77s8ZL;x!\u001a\u0014le\u000f", "Bn_\u001f\\.Ab", "0ncAb4%S\u001a\u000e", "0ncAb4+W\u001b\u0002\n", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~g\r4>m_\fWPDkA\u000b\u0011ge=\\J*X~pHHL,Y\\|C]\u001fZ\nL:V\u0015]I w@9\u001f\u0015uW\u0011Oo\u0001Us\u0018BspOC\fF}\u0019K('rN#`uEABl4jUl\u001dX8Im$u!\u0017qL0\n\t\u001d\u001f\u0002f\u0001g1%#\bA$KZWEIs+#r1'\u0015|s\u00102U~5zv\u00114&4sN[k :gt\u0017,i\u000b55JC\u0013\t)m\u0003u>\u001bU\u001b`\f\u00128x\"", "5dc\u000fb;M]!ez_;", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#\f/Kt\u0016w+MHt4+\u0002d`=\u000b9", "5dc\u000fb;M]!k~`/\f", "5dc!b7%S\u001a\u000e", "5dc!b7+W\u001b\u0002\n", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n_F", "3pd._:", "", "=sW2e", "5dc", ">q^=X9Mg", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77s8UNKz4\u001dqrn8\u0007p\u0019Ju+WZ99f]H", "6`b\u001fb<GR\u0019}Wh9{\t<s", "6`b566=S", "", "BnBAe0GU", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ComputedBorderRadius {
    private final CornerRadii bottomLeft;
    private final CornerRadii bottomRight;
    private final CornerRadii topLeft;
    private final CornerRadii topRight;

    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComputedBorderRadiusProp.values().length];
            try {
                iArr[ComputedBorderRadiusProp.COMPUTED_BORDER_TOP_LEFT_RADIUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComputedBorderRadiusProp.COMPUTED_BORDER_TOP_RIGHT_RADIUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComputedBorderRadiusProp.COMPUTED_BORDER_BOTTOM_LEFT_RADIUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ComputedBorderRadiusProp.COMPUTED_BORDER_BOTTOM_RIGHT_RADIUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ComputedBorderRadius() {
        this(new CornerRadii(0.0f, 0.0f), new CornerRadii(0.0f, 0.0f), new CornerRadii(0.0f, 0.0f), new CornerRadii(0.0f, 0.0f));
    }

    public ComputedBorderRadius(CornerRadii topLeft, CornerRadii topRight, CornerRadii bottomLeft, CornerRadii bottomRight) {
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(topRight, "topRight");
        Intrinsics.checkNotNullParameter(bottomLeft, "bottomLeft");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    public static /* synthetic */ ComputedBorderRadius copy$default(ComputedBorderRadius computedBorderRadius, CornerRadii cornerRadii, CornerRadii cornerRadii2, CornerRadii cornerRadii3, CornerRadii cornerRadii4, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            cornerRadii = computedBorderRadius.topLeft;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            cornerRadii2 = computedBorderRadius.topRight;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            cornerRadii3 = computedBorderRadius.bottomLeft;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            cornerRadii4 = computedBorderRadius.bottomRight;
        }
        return computedBorderRadius.copy(cornerRadii, cornerRadii2, cornerRadii3, cornerRadii4);
    }

    public final CornerRadii component1() {
        return this.topLeft;
    }

    public final CornerRadii component2() {
        return this.topRight;
    }

    public final CornerRadii component3() {
        return this.bottomLeft;
    }

    public final CornerRadii component4() {
        return this.bottomRight;
    }

    public final ComputedBorderRadius copy(CornerRadii topLeft, CornerRadii topRight, CornerRadii bottomLeft, CornerRadii bottomRight) {
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(topRight, "topRight");
        Intrinsics.checkNotNullParameter(bottomLeft, "bottomLeft");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        return new ComputedBorderRadius(topLeft, topRight, bottomLeft, bottomRight);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComputedBorderRadius)) {
            return false;
        }
        ComputedBorderRadius computedBorderRadius = (ComputedBorderRadius) obj;
        return Intrinsics.areEqual(this.topLeft, computedBorderRadius.topLeft) && Intrinsics.areEqual(this.topRight, computedBorderRadius.topRight) && Intrinsics.areEqual(this.bottomLeft, computedBorderRadius.bottomLeft) && Intrinsics.areEqual(this.bottomRight, computedBorderRadius.bottomRight);
    }

    public final CornerRadii get(ComputedBorderRadiusProp property) {
        Intrinsics.checkNotNullParameter(property, "property");
        int i2 = WhenMappings.$EnumSwitchMapping$0[property.ordinal()];
        if (i2 == 1) {
            return this.topLeft;
        }
        if (i2 == 2) {
            return this.topRight;
        }
        if (i2 == 3) {
            return this.bottomLeft;
        }
        if (i2 == 4) {
            return this.bottomRight;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final CornerRadii getBottomLeft() {
        return this.bottomLeft;
    }

    public final CornerRadii getBottomRight() {
        return this.bottomRight;
    }

    public final CornerRadii getTopLeft() {
        return this.topLeft;
    }

    public final CornerRadii getTopRight() {
        return this.topRight;
    }

    public final boolean hasRoundedBorders() {
        return this.topLeft.getHorizontal() > 0.0f || this.topLeft.getVertical() > 0.0f || this.topRight.getHorizontal() > 0.0f || this.topRight.getVertical() > 0.0f || this.bottomLeft.getHorizontal() > 0.0f || this.bottomLeft.getVertical() > 0.0f || this.bottomRight.getHorizontal() > 0.0f;
    }

    public int hashCode() {
        return (((((this.topLeft.hashCode() * 31) + this.topRight.hashCode()) * 31) + this.bottomLeft.hashCode()) * 31) + this.bottomRight.hashCode();
    }

    public String toString() {
        return "ComputedBorderRadius(topLeft=" + this.topLeft + ", topRight=" + this.topRight + ", bottomLeft=" + this.bottomLeft + ", bottomRight=" + this.bottomRight + ")";
    }
}
