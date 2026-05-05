package androidx.compose.foundation.layout;

import androidx.collection.IntIntPair;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: FlowLayoutBuildingBlocks.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\u0015\"4ߚ\u007f\u0007|jA0JiP.hS2şs{J$cҕyCI^\"}(\u000eWN}gvJ`\u0013IƤ\u001cǝ)jZH\u000ex}3OeRsM3eok:pxD\u000782P;\n\t\u000f\u001eBH>{\u000bGY\u0012*0nqJV\u001bT\u001d\u001a@\u0007N$\u000f&tg|7Ղp]H8k9wMf)u/+Y=Jb4%v\u0010,[DED-%\u0002\u00137ViP\u001b? >5l59CI\"Xf\\\u000e'-+}\u000e\u000ev4p\u001dQ\u000f\ro\u0004]xcP<6(~\n#T\u0004<\u0016WL<A2f6\u000fcx\u0001jXP0vr\u0006\tzN\u0019;~aCi\u001ftky;GOg\u007f\u0013\u001f6#/oQ_b)x\u0015IU(U?mX=v^:]K\u000b\u001cp\u0011\u0012ň\u0003\u0382Ͻ\u00041\u0002/<6uKi=;!\u001a\u0007\u001fֶiѱ\u0004\u009bŞRhʐLB*n$Az\u0015\u001ab\\d3l'ӼZ¯\u0015M$\u0381W\n\u0016\u001a8\\&=wغ\u0012ʽShqҔ\u001ei\u0018%GfeZE\u008b\u0010Ć=^;̐\"o\u001egjvB@\u0013ϸ\u0007ֽjB[ێ+h6$JH\u0019\u0013NӾF«\u0010\u0013:ŭڧ\u001c=44\u001fÄ1v\u0002&BG\u001cȪc|"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%w>I\u000bj+R\u007f)$SX*b`H", "", ";`g\u0016g,Fa|\bbZ0\u0006dBi\u000e", "", "=uT?Y3He", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%wKJ\u0007p-U\u000195[J;\\(", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7\u007f;QCDz0-\u0019rj\u001d\u0010b,Yv0FLW;:\\{K#\u001fV\u0012W:\u001bZ", ";`g\u0019\\5>a", ";`X;4?Ba\u0007\nv\\0\u0006\u000b", "1q^@f\bQW'l\u0006Z*\u0001\u00121", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w.JE}\u001b\u001a)rqHpt,[w.Q^<;Xar\u0013xu>q51\u0017\u0014`E-8IH'Q0R\u0011;u\n\b\u001dW\u0014jq>f\u0017VW\u001f~O8uVWn\u0004T)Ao0d\u00195`M", "\u0018", "5dc$e(I3 \u0006~i:\u0001\u0017\u0013n\u00012", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%w>I\u000bj+R\u007f)$SX*b`1/!\u000eemU2\u0011\u0010gE2RM8)]", "EqP=<5?]", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%w>I\u000bj+R\u007f)$SX*b`1/!\u000eeqW,\u0017Z", "6`b\u001bX?M", "", ":`bA66Gb\u0019\b\nE0\u0006\t\u0013n~(\u000f", "Bnc._\nK]'\rVq0\u000bv3z\u007f", ":dUAB=>`\u0001z~g\b\u0010\r=", "<dgA<5=S,b\u0004E0\u0006\t", "5dc$e(I7\"\u007f\u0005", "<dgA<;>[{z\tG,\u0010\u0018", ":dUAB=>`", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &+x\u001d'r)B/", "<dgAF0SS", ":h]2<5=S,", "1ta?X5M:\u001d\bz<9\u0007\u0017=A\u0013,\n.\u0005,\u0017", "7rF?T7IW\"\u0001gh<\u0006\b", "7r49_0Ia\u001d\rlk(\b", "5dc$e(I7\"\u007f\u0005&\u0016\bx6n\u00062", "uY8\u0017?(GR&\t~]?F\u00079l\u0007(yO\u0005! \u0011S\u0017KZ.DDy$DCy\u0012180/\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001csG$\u001bY\n]/\u0017\u000e#H \u0003NG.Q\rP\fMO|  \u001eDG\u0001F]\u000fK\u0003\u0017RH3fLg\u001ekT=PF3e\u00165", "%qP=83EW$\r~l\u0010\u0006\n9", "%qP=<5?]", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FlowLayoutBuildingBlocks {
    public static final int $stable = 8;
    private final long constraints;
    private final int crossAxisSpacing;
    private final int mainAxisSpacing;
    private final int maxItemsInMainAxis;
    private final int maxLines;
    private final FlowLayoutOverflowState overflow;

    public /* synthetic */ FlowLayoutBuildingBlocks(int i2, FlowLayoutOverflowState flowLayoutOverflowState, long j2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, flowLayoutOverflowState, j2, i3, i4, i5);
    }

    private FlowLayoutBuildingBlocks(int i2, FlowLayoutOverflowState flowLayoutOverflowState, long j2, int i3, int i4, int i5) {
        this.maxItemsInMainAxis = i2;
        this.overflow = flowLayoutOverflowState;
        this.constraints = j2;
        this.maxLines = i3;
        this.mainAxisSpacing = i4;
        this.crossAxisSpacing = i5;
    }

    /* JADX INFO: compiled from: FlowLayoutBuildingBlocks.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004O\u000f8\u000b4D\u0005'Bߚ(\u0007\u0015iyGTkN.`SB\u000f\u001a|D*a$\u007fESUH~̀\rO\\j8}X\\#C=\u0007Ȁ|p4կmzc\u0014\u001d6\u0013~M3eok:žx<\rړJ$>y\u0013\u0005ʆ.M"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%w>I\u000bj+R\u007f)$SX*b`1/!\u000eeqW,\u0017Z", "", "7r;.f;\"b\u0019\u0007^g\u0013\u0001\u0012/", "", "7r;.f;\"b\u0019\u0007^g\n\u0007\u0012>a\u00041{M", "uYIuI", "u(I", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class WrapInfo {
        public static final int $stable = 0;
        private final boolean isLastItemInContainer;
        private final boolean isLastItemInLine;

        /* JADX WARN: Illegal instructions before constructor call */
        public WrapInfo() {
            boolean z2 = false;
            this(z2, z2, 3, null);
        }

        public WrapInfo(boolean z2, boolean z3) {
            this.isLastItemInLine = z2;
            this.isLastItemInContainer = z3;
        }

        public /* synthetic */ WrapInfo(boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? false : z2, (i2 & 2) != 0 ? false : z3);
        }

        public final boolean isLastItemInLine() {
            return this.isLastItemInLine;
        }

        public final boolean isLastItemInContainer() {
            return this.isLastItemInContainer;
        }
    }

    /* JADX INFO: compiled from: FlowLayoutBuildingBlocks.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jAӄLeV7ZS0\u001aq\u0001Jř\f$ B{|*\u00020\tgN\u0016h~Ph\r[\u0011\u001c\u0015'm<Mc|u\u0012=7RuE3[uU9\u000f{ȥ\t @*\t\t\u0013\u00012*v\u0011ͯ~ISÈ*2FyH\\]d\u0013\u001e*\u0006l%Ԯ\u001dձ˚M5ՂpeB/1\u0010\u0002DT2m<Me\u001bLl';}8ӣ7Ë;A\u001dǬk\u0005\r`iN#AwM\u0013yw89K\fYLW.\u0017Ʀ/U\u0015ƞ\u000b(b\u0017_sϲ'4WfQז*Vv\u0003{\u0013[ǲ\u0012\u001a"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%w>I\u000bj+R\u007f)$SX*b`1/!\u000eemU2\u0011\u0010gE2RM8)]", "", "3k[6c:Ba", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", ">kP0X(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "3k[6c:Ba\u0007\u0003\u0010^", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nd &+x\u001d'r)B/", ">kP0X\fEZ\u001d\n\tb:f\u0012\u0016a\u000e7YJ\n&\u0017P~t@\u007f%", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Di\u00135M\u0019\"g=\u001d\"re8\u001a-*X~2QZNulV<D\u0010&d\u001e]tw\fU?$jA>\u001f]\u0011>hAr\u0010\u0013\u001a\u0017~o\u0002J \u0014P\t\u0015\u0003J%o\u00108_zCQLq\bn\u0015m,iJ83\u001e~\u0001\u0017uV.\u0017Q\u0017\u0002", "5dc\u0012_3B^'\u0003\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001dYy.Gz\u0012+TC\u0011", "5dc\u0012_3B^'\u0003\tL0\u0012\tvOitG)Rz", "u(9", "\u0018", "5dc\u001d_(<Sx\u0006\u0002b7\u000b\r=O\t\u000fwN\u0010t!P~\u000eE\u0006\f9b}", "u(I", "Adc\u001d_(<Sx\u0006\u0002b7\u000b\r=O\t\u000fwN\u0010t!P~\u000eE\u0006\f9b}", "uY\u0018#", "5dc\u001d_(<S\u0015{\u0002^", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n `y\u001e7i\u00135M\u0019", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class WrapEllipsisInfo {
        public static final int $stable = 8;
        private final Measurable ellipsis;
        private final long ellipsisSize;
        private boolean placeEllipsisOnLastContentLine;
        private final Placeable placeable;

        public /* synthetic */ WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j2, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(measurable, placeable, j2, z2);
        }

        private WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j2, boolean z2) {
            this.ellipsis = measurable;
            this.placeable = placeable;
            this.ellipsisSize = j2;
            this.placeEllipsisOnLastContentLine = z2;
        }

        public /* synthetic */ WrapEllipsisInfo(Measurable measurable, Placeable placeable, long j2, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(measurable, placeable, j2, (i2 + 8) - (i2 | 8) != 0 ? true : z2, null);
        }

        public final Measurable getEllipsis() {
            return this.ellipsis;
        }

        public final Placeable getPlaceable() {
            return this.placeable;
        }

        /* JADX INFO: renamed from: getEllipsisSize-OO21N7I, reason: not valid java name */
        public final long m942getEllipsisSizeOO21N7I() {
            return this.ellipsisSize;
        }

        public final boolean getPlaceEllipsisOnLastContentLine() {
            return this.placeEllipsisOnLastContentLine;
        }

        public final void setPlaceEllipsisOnLastContentLine(boolean z2) {
            this.placeEllipsisOnLastContentLine = z2;
        }
    }

    public final WrapEllipsisInfo getWrapEllipsisInfo(WrapInfo wrapInfo, boolean z2, int i2, int i3, int i4, int i5) {
        WrapEllipsisInfo wrapEllipsisInfoEllipsisInfo$foundation_layout_release;
        if (!wrapInfo.isLastItemInContainer() || (wrapEllipsisInfoEllipsisInfo$foundation_layout_release = this.overflow.ellipsisInfo$foundation_layout_release(z2, i2, i3)) == null) {
            return null;
        }
        wrapEllipsisInfoEllipsisInfo$foundation_layout_release.setPlaceEllipsisOnLastContentLine(i2 >= 0 && (i5 == 0 || (i4 - IntIntPair.m365getFirstimpl(wrapEllipsisInfoEllipsisInfo$foundation_layout_release.m942getEllipsisSizeOO21N7I()) >= 0 && i5 < this.maxItemsInMainAxis)));
        return wrapEllipsisInfoEllipsisInfo$foundation_layout_release;
    }

    /* JADX INFO: renamed from: getWrapInfo-OpUlnko, reason: not valid java name */
    public final WrapInfo m941getWrapInfoOpUlnko(boolean z2, int i2, long j2, IntIntPair intIntPair, int i3, int i4, int i5, boolean z3, boolean z4) {
        int i6 = i4 + i5;
        if (intIntPair == null) {
            return new WrapInfo(true, true);
        }
        if (this.overflow.getType$foundation_layout_release() != FlowLayoutOverflow.OverflowType.Visible && (i3 >= this.maxLines || IntIntPair.m366getSecondimpl(j2) - IntIntPair.m366getSecondimpl(intIntPair.m369unboximpl()) < 0)) {
            return new WrapInfo(true, true);
        }
        if (i2 != 0 && (i2 >= this.maxItemsInMainAxis || IntIntPair.m365getFirstimpl(j2) - IntIntPair.m365getFirstimpl(intIntPair.m369unboximpl()) < 0)) {
            if (z3) {
                return new WrapInfo(true, true);
            }
            return new WrapInfo(true, m941getWrapInfoOpUlnko(z2, 0, IntIntPair.m361constructorimpl(Constraints.m6591getMaxWidthimpl(this.constraints), (IntIntPair.m366getSecondimpl(j2) - this.crossAxisSpacing) - i5), IntIntPair.m358boximpl(IntIntPair.m361constructorimpl(IntIntPair.m365getFirstimpl(intIntPair.m369unboximpl()) - this.mainAxisSpacing, IntIntPair.m366getSecondimpl(intIntPair.m369unboximpl()))), i3 + 1, i6, 0, true, false).isLastItemInContainer());
        }
        int iMax = i4 + Math.max(i5, IntIntPair.m366getSecondimpl(intIntPair.m369unboximpl()));
        IntIntPair intIntPairM946ellipsisSizeF35zmw$foundation_layout_release = z4 ? null : this.overflow.m946ellipsisSizeF35zmw$foundation_layout_release(z2, i3, iMax);
        if (intIntPairM946ellipsisSizeF35zmw$foundation_layout_release != null) {
            intIntPairM946ellipsisSizeF35zmw$foundation_layout_release.m369unboximpl();
            if (i2 + 1 >= this.maxItemsInMainAxis || ((IntIntPair.m365getFirstimpl(j2) - IntIntPair.m365getFirstimpl(intIntPair.m369unboximpl())) - this.mainAxisSpacing) - IntIntPair.m365getFirstimpl(intIntPairM946ellipsisSizeF35zmw$foundation_layout_release.m369unboximpl()) < 0) {
                if (z4) {
                    return new WrapInfo(true, true);
                }
                WrapInfo wrapInfoM941getWrapInfoOpUlnko = m941getWrapInfoOpUlnko(false, 0, IntIntPair.m361constructorimpl(Constraints.m6591getMaxWidthimpl(this.constraints), (IntIntPair.m366getSecondimpl(j2) - this.crossAxisSpacing) - Math.max(i5, IntIntPair.m366getSecondimpl(intIntPair.m369unboximpl()))), intIntPairM946ellipsisSizeF35zmw$foundation_layout_release, i3 + 1, iMax, 0, true, true);
                return new WrapInfo(wrapInfoM941getWrapInfoOpUlnko.isLastItemInContainer(), wrapInfoM941getWrapInfoOpUlnko.isLastItemInContainer());
            }
        }
        return new WrapInfo(false, false);
    }
}
