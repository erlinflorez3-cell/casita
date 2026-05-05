package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: FlowLayoutOverflow.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4\u0012}\u0007njO0Le^.ZS@\u000fs{:$c$\bCCU(}*\teNogtNb\u000bQ.\u000e\u0016~l4Ikxe\u0012%2JoU3UoS9hҚ<:6݅R8(\u00049\u0019B\tƽu\u0001E[\u0010 0XphS\u001dS\u000b\u001a \bV /!lmT6Vpu:]&\u0013\u0018HN5dH%]\u001eVcU\u0014țe(1HG;\u001b.c\u0005\rX\u0002I\u0013L\u0002H\u0015j7'YU\"b͏\\\u007f\u001a\"AN;c\u0003Tb\u0005_n$O;`sZ~\u0015߭{\u0005\u0002\u0015L\n\u0014\u000f7J43@p\u0018\u001bC\u007f\u0003UPP0jp\u000bѐe6\u001d2\u00162Y?ӸjQoJazE\u000e\u001d\rL/1r/el\u000e\u000f\u001cKi\u0006dIbPJXY\u001a[Mm2|\u0011\rò\b0M\r]\u0010Wфϲ)7aNk,y\u0018`D\u0016}K\u009bĈWiX_\u0011V|$OR\u0019\u001djS\u0013\f\u07fbT^^4!S\"]\u0017\u007f\u000e\u0019Ff\bI10 P_h\u0018v{hܦ)/lDom\u001a\u0014.ޭ`ۋ9Qk߄2^\u0005\u0018W<\u0011\b/٫Dΐ\u0010Zd̥r>Vl(w*G%ۿ\u0015\u0558Cq$ع|e'a-p\u0013/RP+\u0010ރ^r\u0016\u0007d9*\fy&z\u000f'Zl}\u007fr\tK<|\u000f.[Lپ9\u0019,b8gb\u0003yȗ\u0001\u0381\u0004Goն\u0018^z\u0016\u000eU*!l֞;ֺ3C\u001bÁ\u0017+8\u0012;Vɦqgjg-CϾ\u0001\u0017"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%wKJ\u0007p-U\u00019\u001d", "", "Bx_2", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%wKJ\u0007p-U\u00019\u00066_,iSyG&\u0001n\u0019N\u0001", ";h]\u0019\\5>a\b\tha6\u000ff9l\u0007$\u0007N\u0001", "", ";h]\u0010e6Lat\u0012~l\u001a\u0001\u001e/T\n\u0016~J\u0013t!Nv\nG\u0005%", "AdT\u001ab9>5\u0019\u000e\n^9", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%wKJ\u0007p-U\u000195[J;\\(", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "AsPAX", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "1n[9T7LSz~\nm,\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u0012*G|_\u000fTMMR02\u001fxp#\u0018c9O}1Y\u000b8=\\_sD\u001e$I\"Y+bh=(*xS>#\u0011uN\u0013C2\u0002\u001c\u001f\fDnzKdY(\n\u001esP-rO%5`MKTi.mUd.d\u0004;4\u001do(\u001frY<S\\c\u001apa}qp\u0013n>)", "5dc!l7>\u0012\u001a\t\u000bg+x\u00183o\t\"\u0003<\u0015!'Vi\u001b<}%1g}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y4A}%w.JE}\u001b\u001a)rqHpt,[w.Q^\r\u0016mR\u007f>\u001b\u001cl|b6\rZ", "/cS\u001ci,KT \t\r<6\u0005\u00149s{%\u0003@\u000f", ":hbA", "", "/cS\u001ci,KT \t\r<6\u0005\u00149s{%\u0003@\u000fU\u0018Q\u007f\u0017;r49c\u0007\u001a>i*8]R5x4%\u0015do9", "1qT.g,(d\u0019\f{e6\u000fv>a\u000f(", "1qT.g,(d\u0019\f{e6\u000fv>a\u000f(:A\u000b' Fk\u001d@\u0001./`y4A}%(ZCBk0,\u0015", "\u001duT?Y3He\b\u0013\u0006^", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8VR;~C.\u0011oB@\u0011u\nX}7OU8=\\_sD\u001e$0", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7s8VR;~C.\u0011oB@\u0011u\u0019X\t\u0011XL[-c\\\u0005\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\u0019u;.\u001dqKJ\u0007p-U\u00019\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU(uF\b&hn:\u000em>$", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class FlowLayoutOverflow {
    public static final int $stable = 0;
    private final Function1<FlowLayoutOverflowState, Function2<Composer, Integer, Unit>> collapseGetter;
    private final int minCrossAxisSizeToShowCollapse;
    private final int minLinesToShowCollapse;
    private final Function1<FlowLayoutOverflowState, Function2<Composer, Integer, Unit>> seeMoreGetter;
    private final OverflowType type;

    /* JADX INFO: compiled from: FlowLayoutOverflow.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eRLcz\bGً/!Ǟr\u00052.\"w5߿\u00198pIkH¯VS8\u000fT{:%D$wE$U \u0001\u000b\tUR˝ks"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7v5WU\"gH(%wKJ\u0007p-U\u00019\u00066_,iSyG&\u0001n\u0019N\u0001", "", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}_\u0004q", "$hb6U3>", "\u0011kX=", "\u0013w_.a+\"\\\u0018\u0003xZ;\u0007\u0016", "\u0013w_.a+(`v\t\u0002e(\b\u0017/I\t'\u007f>|&!T", "4nd;W(MW#\bBe(\u0011\u0013?ty5{G\u0001\u0013%G"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public enum OverflowType {
        Visible,
        Clip,
        ExpandIndicator,
        ExpandOrCollapseIndicator
    }

    /* JADX INFO: compiled from: FlowLayoutOverflow.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OverflowType.values().length];
            try {
                iArr[OverflowType.ExpandIndicator.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OverflowType.ExpandOrCollapseIndicator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i2, int i3, Function1 function1, Function1 function12, DefaultConstructorMarker defaultConstructorMarker) {
        this(overflowType, i2, i3, function1, function12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FlowLayoutOverflow(OverflowType overflowType, int i2, int i3, Function1<? super FlowLayoutOverflowState, ? extends Function2<? super Composer, ? super Integer, Unit>> function1, Function1<? super FlowLayoutOverflowState, ? extends Function2<? super Composer, ? super Integer, Unit>> function12) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i2;
        this.minCrossAxisSizeToShowCollapse = i3;
        this.seeMoreGetter = function1;
        this.collapseGetter = function12;
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i2, int i3, Function1 function1, Function1 function12, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(overflowType, (-1) - (((-1) - i4) | ((-1) - 2)) != 0 ? 0 : i2, (-1) - (((-1) - i4) | ((-1) - 4)) == 0 ? i3 : 0, (i4 + 8) - (8 | i4) != 0 ? null : function1, (i4 & 16) == 0 ? function12 : null, null);
    }

    public final OverflowType getType$foundation_layout_release() {
        return this.type;
    }

    public final FlowLayoutOverflowState createOverflowState$foundation_layout_release() {
        return new FlowLayoutOverflowState(this.type, this.minLinesToShowCollapse, this.minCrossAxisSizeToShowCollapse);
    }

    public final void addOverflowComposables$foundation_layout_release(FlowLayoutOverflowState flowLayoutOverflowState, List<Function2<Composer, Integer, Unit>> list) {
        Function1<FlowLayoutOverflowState, Function2<Composer, Integer, Unit>> function1 = this.seeMoreGetter;
        Function2<Composer, Integer, Unit> function2Invoke = function1 != null ? function1.invoke(flowLayoutOverflowState) : null;
        Function1<FlowLayoutOverflowState, Function2<Composer, Integer, Unit>> function12 = this.collapseGetter;
        Function2<Composer, Integer, Unit> function2Invoke2 = function12 != null ? function12.invoke(flowLayoutOverflowState) : null;
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i2 == 1) {
            if (function2Invoke != null) {
                list.add(function2Invoke);
            }
        } else if (i2 == 2) {
            if (function2Invoke != null) {
                list.add(function2Invoke);
            }
            if (function2Invoke2 == null) {
                return;
            }
            list.add(function2Invoke2);
        }
    }
}
