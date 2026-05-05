package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: LazyListMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĝ\u0014D߬)\u001ew\u001fLDyt\fǻ\u000e0\u0019LJ~(-\u001aw\u0015lr96GmH<[[ճ\u0017k\u00124,Ӌ,qY;]\u001a\u0004\"\u0011OdgonP[\u0013C%\u0006\u001exp.QU\u0007b\u001a\u000f8Bw?IMw=?a|6\u001b :\">\u007f\r\u00010*P\u0010|zKK\"\u00128@v;Z\rc\u0005\"Ň\u000e>6\u0001&ձoNLHtҗB/9\u0003qBd'g0\u0013M\u0015Fb'\u0015vw\u001e3@M5\u001d%Y\u0004\u001f҅ZMšWwM\u0007x'U+wr\b@f\u0001,\u001b;Q\u001d]!&\u000b\u0007\u0002j\u001a*CUsM`\u000eVw)}=F\u0012\u0012\u001e-X0=\u001a\u0015\b<5%vaEh\u0002\rH0~o=/%.9[=)niai\u001f~;\n\u000e%\u001eQ\u0007\u001f%i^&`C!\u0005{_<i@kT~\u0010gJ\u0006\u0006\u0007a0846U\u000fG}'-E5g_G49k0Ttk\u0005\u0017xh\u0002|\u0019HX||*O0\u0019\u000ejD\u0013\u0005\u001aR\u0005b:&e\"d\t\u000e\bA \u000bvl%3&fO\u0017\u0001\u001bQk\"=/\u0015=\nry'o9\r9e[q*yX\u0007\u0016O<\u0011\u000b\u0007hrW\u001aut(PNxn\u001e\u0015\u0014D|\u0018C8M\u001046B0G{[H\u001bPPa\u0015\u000fo\\x\u0010-Ta&3m2\u0016!\u0001~b!su\u000fa,+wR1OjM\u0019T[RrB\u0017;\r\u000fu\u0010G\u0016RuN3\u0016\u000eʁ{.829\u007fRm\u0017\u001d\u0017A203uP\u0001{iM@>+\u0001\b3Sh\\m8n~QxjxU\u0005\u001b0\u001dvrQ\u000e\u0015\u0004\b\t^zui\u0005\u000fifar1_lRF&\u001d\u001fL+1s0'M-qCM\u001a\u0006?G\u0015\u0010\n\u001as<\u0005z\u000fT\u0001\u0016\u000e:\u0011.urSm2i>w[/D01\u0005\u0005XG\u0019\u00068H\u0017C%5^@\u0013\u0001\u0007<[\u001cG}\u0015\u0013\\\u0011~hs:A\u0003.><\u000eByS\u007f$^q%?|\u0004k{\u0007c\\9P?\u0014\u0019\u0016It\"\u001eM \u0005]\u0011\u000b`\n\u0002HNAin5@\u0017AL,j\u0014;Ib\u001b\u001e\u0012\u0011~t~?\u001b@t\f;\u0005A\u0005|j\u000b`\u0005\u000fz\u0011%87\u0017\u000faU)b?=\u0006od1s2/Y-\u000b+j}\u0005v8;Ud;+(\u0007<\u001bGmCw>d>ھ-mq-\u001c:(|K\u0001FT\u007fܱВ^ڻҍb\r[$\\%ɽ\u0012kZQ(ĸ\u001b){ʃ@K"}, d2 = {"1`[0h3:b\u0019b\n^4\u000br0f\u000e(\u000bN", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001c\u001e\u0011vqF\u0007b\u0010]v/\u001d", "7sT:f", "", "3wc?T\u0010MS!\rW^-\u0007\u0016/", "3wc?T\u0010MS!\rV_;|\u0016", ":`h<h;0W\u0018\u000e}", "", ":`h<h;!S\u001d\u0001}m", "4h]._\u0014:W\"Z\u000eb:f\n0s\u007f7", ";`g\u001cY-LS(", "7sT:f\u001a<`#\u0006\u0002H-}\u0017/t", "7rE2e;BQ\u0015\u0006", "", "DdaA\\*:Zt\f\bZ5~\t7e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwwc9]z%CS$", "6na6m6Gb\u0015\u0006Vk9x\u00121e\b(\u0005O", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J32", "@de2e:>:\u0015\u0013\u0005n;", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "1qT.g,\"b\u0019\u0007\t:-\f\t<L\u00046\u000b", "Dhb6U3>7(~\u0003l", ";dP@h9>R|\u000ezf\u0017\n\u0013@i~(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001c\u001e\u0011vqF\u0007b\u0010]v/2YX=`QrJi", "7sT:f\nHc\"\u000e", "0dh<a+\u001b])\byl\u0010\f\t7C\n8\u0005O", ">h];X+\"b\u0019\u0007\t", "1n]@h4>R\u0007|\bh3\u0004", "", "7r;<b2B\\\u001bZ}^({", ":`bAC6Lb\u007f\t\u0005d(\u007f\t+df$\u0010J\u0011&zPp\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001b\u001a)rqHjl-XL", "1qT.g,\"b\u0019\u0007\t;,}\u0013<ef,\nO", "1ta?X5M4\u001d\f\tm\u0010\f\t7I\t'{S", ";dP@h9>:\u0015\u0014\u000fE0\u000b\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001c\u001e\u0011vqF\u0007P,\\\u0007.V\"", ";`X;4?Bat\u0010vb3x\u00066em,\u0011@", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", "AoP0X\t>b+~zg\u0010\f\t7s", "4ha@g\u001dBa\u001d{\u0002^\u0010\f\t7I\t'{S", "4ha@g\u001dBa\u001d{\u0002^\u0010\f\t7S}5\u0006G\b\u0001\u0018H}\u000eK", "Aba<_3-]u~Xh5\u000b\u00197e~", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "6dP1X9\"\\\u0018~\u000e^:", "7sT:45B[\u0015\u000e\u0005k", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O(W0dN\u0002G!g", "6`b\u0019b6DO\u001c~v]\u0017x\u0017=O}&\fM\u000e\u0017\u0016", ">nbA?6HY\u0015\u0002zZ+c\u0005Co\u00107_I\u0002!", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", ">kP0X4>\\(lxh7|l8v{/\u007f?|&!T", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005U1,\u0015ur5\u0004j,<t1RL25mNyA\u0013\u000ei\u0018[\u0001", "5qP=[0<av\t\u0004m,\u0010\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<+MDz41$>", ":`h<h;", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", ";dP@h9>:\u0015\u0014\u000fE0\u000b\u0018vxJ\u0012\u0002\u0013q!", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7|*bW\"oB-|h]G\u0017p,MZ6GT99fcv<\u0014\u001f0q2\u000fph=\"\tc+<\u001b\u0019(\u0013\u0012Jl\bU|\u0012CyF)R\u0019F\u0007\u001fy@<2Dcg\u0005QOE,+n\u001ch\u001cXI>.\u001d; \u0017|Z>\u0019E/\u001e\u007fN\u0003igO\u0019\u0004Gb/mhUImQCJ\u000e\u001bTz\u0005\u001c6W\btr7\f?4DdNLq(G]t$0fJp-2P\u001dOZ-QyK\nq!a\u0010\u000ekDo{org]\u0019\u0010l\u0013b\u000bVF|@Q\u0013HMn(pD\tJf\u0004#\tP4q/YL\u001fcJxpM0c \u0017XM\u0014%-#G]\u000e{s]AU\u001e\u0013v8U|cS\u001eoD\u001fqU{%^k9JB\u0018E5=[K@9?\u0005$|0\u0015\u0015\u000f,WxB\u0002\u0012\u001c)-9hBo6\u0013qlO3\u00151H+#4zhVN}4l\u001c{y\u0017g\n\u001fa=KK1KQu,Jc\u0015\u0006Fj[\u000f(\\\u00199i>\u001d>p\b~1j#\u0014j/\u0007\"\u0003(:\u007fW.K$0par\u0010y,6\u001f\nk\u0018\u0014W xXW\u001e\u0007[=Nm,Sr%[\u00052C(LR\u0002\u001f\tny]\u0005?b;xv\u0004x+)L\u001c\u0014\b\u001a\u0014/N*_\u001eyAT^>]N)\fbe;%N\u0011{4)\u0019\u000e_It~LRn\u0012\f6${\u0003~vX>AV\u0001 5t:3)ti\u0002$@\n61\b$Dp{3[Nl|\u0004Y\b\u0019t>B\u0003\u0010=b'>\\+\u0007}jw\u000b4\rIR\u001d\b?@r`0m\u001d=\u0002\u0011+FvS?} C]SE'+*+\u0010^\u0003Ha8Y:(Q_\\s=T\noh\u0018Z/L%\u0007!cP\"eJG)\u0005`\u0012", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyListMeasureKt {
    private static final int calculateItemsOffsets$reverseAware(int i2, boolean z2, int i3) {
        return !z2 ? i2 : (i3 - i2) - 1;
    }

    /* JADX INFO: renamed from: measureLazyList-x0Ok8Vo, reason: not valid java name */
    public static final LazyListMeasureResult m1125measureLazyListx0Ok8Vo(int i2, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i3, int i4, int i5, int i6, int i7, int i8, float f2, long j2, boolean z2, List<Integer> list, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z3, Density density, LazyLayoutItemAnimator<LazyListMeasuredItem> lazyLayoutItemAnimator, int i9, List<Integer> list2, boolean z4, final boolean z5, LazyListLayoutInfo lazyListLayoutInfo, CoroutineScope coroutineScope, final MutableState<Unit> mutableState, GraphicsContext graphicsContext, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> function3) {
        boolean z6;
        int i10;
        int i11 = i7;
        int i12 = i8;
        if (i4 < 0) {
            throw new IllegalArgumentException("invalid beforeContentPadding".toString());
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("invalid afterContentPadding".toString());
        }
        if (i2 <= 0) {
            int iM6593getMinWidthimpl = Constraints.m6593getMinWidthimpl(j2);
            int iM6592getMinHeightimpl = Constraints.m6592getMinHeightimpl(j2);
            lazyLayoutItemAnimator.onMeasured(0, iM6593getMinWidthimpl, iM6592getMinHeightimpl, new ArrayList(), lazyListMeasuredItemProvider.getKeyIndexMap(), lazyListMeasuredItemProvider, z2, z5, 1, z4, 0, 0, coroutineScope, graphicsContext);
            if (!z5) {
                long jM1183getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m1183getMinSizeToFitDisappearingItemsYbymL2g();
                if (!IntSize.m6806equalsimpl0(jM1183getMinSizeToFitDisappearingItemsYbymL2g, IntSize.Companion.m6813getZeroYbymL2g())) {
                    iM6593getMinWidthimpl = ConstraintsKt.m6608constrainWidthK40F9xA(j2, IntSize.m6808getWidthimpl(jM1183getMinSizeToFitDisappearingItemsYbymL2g));
                    iM6592getMinHeightimpl = ConstraintsKt.m6607constrainHeightK40F9xA(j2, IntSize.m6807getHeightimpl(jM1183getMinSizeToFitDisappearingItemsYbymL2g));
                }
            }
            return new LazyListMeasureResult(null, 0, false, 0.0f, function3.invoke(Integer.valueOf(iM6593getMinWidthimpl), Integer.valueOf(iM6592getMinHeightimpl), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }), 0.0f, false, coroutineScope, density, lazyListMeasuredItemProvider.m1134getChildConstraintsmsEJaDk(), CollectionsKt.emptyList(), -i4, i3 + i5, 0, z3, z2 ? Orientation.Vertical : Orientation.Horizontal, i5, i6, null);
        }
        int i13 = 0;
        if (i11 >= i2) {
            i11 = i2 - 1;
            i12 = 0;
        }
        int iRound = Math.round(f2);
        int i14 = i12 - iRound;
        if (i11 == 0 && i14 < 0) {
            iRound += i14;
            i14 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i15 = -i4;
        int i16 = (i6 < 0 ? i6 : 0) + i15;
        int mainAxisSizeWithSpacings = i14 + i16;
        int iMax = 0;
        while (mainAxisSizeWithSpacings < 0 && i11 > 0) {
            i11--;
            LazyListMeasuredItem lazyListMeasuredItemM1131getAndMeasure0kLqBqw$default = LazyListMeasuredItemProvider.m1131getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i11, 0L, 2, null);
            arrayDeque.add(0, lazyListMeasuredItemM1131getAndMeasure0kLqBqw$default);
            iMax = Math.max(iMax, lazyListMeasuredItemM1131getAndMeasure0kLqBqw$default.getCrossAxisSize());
            mainAxisSizeWithSpacings += lazyListMeasuredItemM1131getAndMeasure0kLqBqw$default.getMainAxisSizeWithSpacings();
        }
        if (mainAxisSizeWithSpacings < i16) {
            iRound += mainAxisSizeWithSpacings;
            mainAxisSizeWithSpacings = i16;
        }
        int mainAxisSizeWithSpacings2 = mainAxisSizeWithSpacings - i16;
        int i17 = i3 + i5;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i17, 0);
        int mainAxisSizeWithSpacings3 = -mainAxisSizeWithSpacings2;
        int i18 = i11;
        boolean z7 = false;
        while (true) {
            z6 = true;
            if (i13 >= arrayDeque.size()) {
                break;
            }
            if (mainAxisSizeWithSpacings3 >= iCoerceAtLeast) {
                arrayDeque.remove(i13);
                z7 = true;
            } else {
                i18++;
                mainAxisSizeWithSpacings3 += ((LazyListMeasuredItem) arrayDeque.get(i13)).getMainAxisSizeWithSpacings();
                i13++;
            }
        }
        while (i18 < i2 && (mainAxisSizeWithSpacings3 < iCoerceAtLeast || mainAxisSizeWithSpacings3 <= 0 || arrayDeque.isEmpty())) {
            LazyListMeasuredItem lazyListMeasuredItemM1131getAndMeasure0kLqBqw$default2 = LazyListMeasuredItemProvider.m1131getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i18, 0L, 2, null);
            mainAxisSizeWithSpacings3 += lazyListMeasuredItemM1131getAndMeasure0kLqBqw$default2.getMainAxisSizeWithSpacings();
            if (mainAxisSizeWithSpacings3 <= i16 && i18 != i2 - 1) {
                i11 = i18 + 1;
                mainAxisSizeWithSpacings2 -= lazyListMeasuredItemM1131getAndMeasure0kLqBqw$default2.getMainAxisSizeWithSpacings();
                z7 = true;
            } else {
                iMax = Math.max(iMax, lazyListMeasuredItemM1131getAndMeasure0kLqBqw$default2.getCrossAxisSize());
                arrayDeque.add(lazyListMeasuredItemM1131getAndMeasure0kLqBqw$default2);
            }
            i18++;
        }
        if (mainAxisSizeWithSpacings3 < i3) {
            int i19 = i3 - mainAxisSizeWithSpacings3;
            mainAxisSizeWithSpacings2 -= i19;
            mainAxisSizeWithSpacings3 += i19;
            while (mainAxisSizeWithSpacings2 < i4 && i11 > 0) {
                i11--;
                LazyListMeasuredItem lazyListMeasuredItemM1131getAndMeasure0kLqBqw$default3 = LazyListMeasuredItemProvider.m1131getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i11, 0L, 2, null);
                arrayDeque.add(0, lazyListMeasuredItemM1131getAndMeasure0kLqBqw$default3);
                iMax = Math.max(iMax, lazyListMeasuredItemM1131getAndMeasure0kLqBqw$default3.getCrossAxisSize());
                mainAxisSizeWithSpacings2 += lazyListMeasuredItemM1131getAndMeasure0kLqBqw$default3.getMainAxisSizeWithSpacings();
            }
            i10 = i19 + iRound;
            if (mainAxisSizeWithSpacings2 < 0) {
                i10 += mainAxisSizeWithSpacings2;
                mainAxisSizeWithSpacings3 += mainAxisSizeWithSpacings2;
                mainAxisSizeWithSpacings2 = 0;
            }
        } else {
            i10 = iRound;
        }
        float f3 = (MathKt.getSign(Math.round(f2)) != MathKt.getSign(i10) || Math.abs(Math.round(f2)) < Math.abs(i10)) ? f2 : i10;
        float f4 = f2 - f3;
        float f5 = 0.0f;
        if (z5 && i10 > iRound && f4 <= 0.0f) {
            f5 = (i10 - iRound) + f4;
        }
        if (mainAxisSizeWithSpacings2 < 0) {
            throw new IllegalArgumentException("negative currentFirstItemScrollOffset".toString());
        }
        int i20 = -mainAxisSizeWithSpacings2;
        LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) arrayDeque.first();
        if (i4 > 0 || i6 < 0) {
            int size = arrayDeque.size();
            int i21 = 0;
            while (i21 < size) {
                int mainAxisSizeWithSpacings4 = ((LazyListMeasuredItem) arrayDeque.get(i21)).getMainAxisSizeWithSpacings();
                if (mainAxisSizeWithSpacings2 == 0 || mainAxisSizeWithSpacings4 > mainAxisSizeWithSpacings2 || i21 == CollectionsKt.getLastIndex(arrayDeque)) {
                    break;
                }
                mainAxisSizeWithSpacings2 -= mainAxisSizeWithSpacings4;
                i21++;
                lazyListMeasuredItem = (LazyListMeasuredItem) arrayDeque.get(i21);
            }
        }
        List<LazyListMeasuredItem> listCreateItemsBeforeList = createItemsBeforeList(i11, lazyListMeasuredItemProvider, i9, list2);
        int size2 = listCreateItemsBeforeList.size();
        for (int i22 = 0; i22 < size2; i22++) {
            iMax = Math.max(iMax, listCreateItemsBeforeList.get(i22).getCrossAxisSize());
        }
        ArrayDeque arrayDeque2 = arrayDeque;
        List<LazyListMeasuredItem> listCreateItemsAfterList = createItemsAfterList(arrayDeque2, lazyListMeasuredItemProvider, i2, i9, list2, f3, z5, lazyListLayoutInfo);
        int size3 = listCreateItemsAfterList.size();
        for (int i23 = 0; i23 < size3; i23++) {
            iMax = Math.max(iMax, listCreateItemsAfterList.get(i23).getCrossAxisSize());
        }
        boolean z8 = Intrinsics.areEqual(lazyListMeasuredItem, arrayDeque.first()) && listCreateItemsBeforeList.isEmpty() && listCreateItemsAfterList.isEmpty();
        int iM6608constrainWidthK40F9xA = ConstraintsKt.m6608constrainWidthK40F9xA(j2, z2 ? iMax : mainAxisSizeWithSpacings3);
        if (z2) {
            iMax = mainAxisSizeWithSpacings3;
        }
        int iM6607constrainHeightK40F9xA = ConstraintsKt.m6607constrainHeightK40F9xA(j2, iMax);
        final List<LazyListMeasuredItem> listCalculateItemsOffsets = calculateItemsOffsets(arrayDeque2, listCreateItemsBeforeList, listCreateItemsAfterList, iM6608constrainWidthK40F9xA, iM6607constrainHeightK40F9xA, mainAxisSizeWithSpacings3, i3, i20, z2, vertical, horizontal, z3, density);
        lazyLayoutItemAnimator.onMeasured((int) f3, iM6608constrainWidthK40F9xA, iM6607constrainHeightK40F9xA, listCalculateItemsOffsets, lazyListMeasuredItemProvider.getKeyIndexMap(), lazyListMeasuredItemProvider, z2, z5, 1, z4, mainAxisSizeWithSpacings2, mainAxisSizeWithSpacings3, coroutineScope, graphicsContext);
        if (!z5) {
            long jM1183getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m1183getMinSizeToFitDisappearingItemsYbymL2g();
            if (!IntSize.m6806equalsimpl0(jM1183getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.Companion.m6813getZeroYbymL2g())) {
                int i24 = z2 ? iM6607constrainHeightK40F9xA : iM6608constrainWidthK40F9xA;
                iM6608constrainWidthK40F9xA = ConstraintsKt.m6608constrainWidthK40F9xA(j2, Math.max(iM6608constrainWidthK40F9xA, IntSize.m6808getWidthimpl(jM1183getMinSizeToFitDisappearingItemsYbymL2g2)));
                iM6607constrainHeightK40F9xA = ConstraintsKt.m6607constrainHeightK40F9xA(j2, Math.max(iM6607constrainHeightK40F9xA, IntSize.m6807getHeightimpl(jM1183getMinSizeToFitDisappearingItemsYbymL2g2)));
                int i25 = z2 ? iM6607constrainHeightK40F9xA : iM6608constrainWidthK40F9xA;
                if (i25 != i24) {
                    int size4 = listCalculateItemsOffsets.size();
                    for (int i26 = 0; i26 < size4; i26++) {
                        listCalculateItemsOffsets.get(i26).updateMainAxisLayoutSize(i25);
                    }
                }
            }
        }
        LazyListMeasuredItem lazyListMeasuredItemFindOrComposeLazyListHeader = !list.isEmpty() ? LazyListHeadersKt.findOrComposeLazyListHeader(listCalculateItemsOffsets, lazyListMeasuredItemProvider, list, i4, iM6608constrainWidthK40F9xA, iM6607constrainHeightK40F9xA) : null;
        if (i18 >= i2 && mainAxisSizeWithSpacings3 <= i3) {
            z6 = false;
        }
        final LazyListMeasuredItem lazyListMeasuredItem2 = lazyListMeasuredItemFindOrComposeLazyListHeader;
        MeasureResult measureResultInvoke = function3.invoke(Integer.valueOf(iM6608constrainWidthK40F9xA), Integer.valueOf(iM6607constrainHeightK40F9xA), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListMeasureKt$measureLazyList$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                List<LazyListMeasuredItem> list3 = listCalculateItemsOffsets;
                LazyListMeasuredItem lazyListMeasuredItem3 = lazyListMeasuredItem2;
                boolean z9 = z5;
                int size5 = list3.size();
                for (int i27 = 0; i27 < size5; i27++) {
                    LazyListMeasuredItem lazyListMeasuredItem4 = list3.get(i27);
                    if (lazyListMeasuredItem4 != lazyListMeasuredItem3) {
                        lazyListMeasuredItem4.place(placementScope, z9);
                    }
                }
                LazyListMeasuredItem lazyListMeasuredItem5 = lazyListMeasuredItem2;
                if (lazyListMeasuredItem5 != null) {
                    lazyListMeasuredItem5.place(placementScope, z5);
                }
                ObservableScopeInvalidator.m1192attachToScopeimpl(mutableState);
            }
        });
        if (!z8) {
            ArrayList arrayList = new ArrayList(listCalculateItemsOffsets.size());
            int size5 = listCalculateItemsOffsets.size();
            for (int i27 = 0; i27 < size5; i27++) {
                LazyListMeasuredItem lazyListMeasuredItem3 = listCalculateItemsOffsets.get(i27);
                LazyListMeasuredItem lazyListMeasuredItem4 = lazyListMeasuredItem3;
                if ((lazyListMeasuredItem4.getIndex() >= ((LazyListMeasuredItem) arrayDeque.first()).getIndex() && lazyListMeasuredItem4.getIndex() <= ((LazyListMeasuredItem) arrayDeque.last()).getIndex()) || lazyListMeasuredItem4 == lazyListMeasuredItemFindOrComposeLazyListHeader) {
                    arrayList.add(lazyListMeasuredItem3);
                }
            }
            listCalculateItemsOffsets = arrayList;
        }
        return new LazyListMeasureResult(lazyListMeasuredItem, mainAxisSizeWithSpacings2, z6, f3, measureResultInvoke, f5, z7, coroutineScope, density, lazyListMeasuredItemProvider.m1134getChildConstraintsmsEJaDk(), listCalculateItemsOffsets, i15, i17, i2, z3, z2 ? Orientation.Vertical : Orientation.Horizontal, i5, i6, null);
    }

    private static final List<LazyListMeasuredItem> createItemsAfterList(List<LazyListMeasuredItem> list, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i2, int i3, List<Integer> list2, float f2, boolean z2, LazyListLayoutInfo lazyListLayoutInfo) {
        ArrayList arrayList;
        LazyListItemInfo lazyListItemInfo;
        LazyListMeasuredItem lazyListMeasuredItem;
        LazyListMeasuredItem lazyListMeasuredItem2;
        int mainAxisSizeWithSpacings;
        LazyListMeasuredItem lazyListMeasuredItem3;
        int index;
        int iMin;
        LazyListMeasuredItem lazyListMeasuredItem4;
        LazyListMeasuredItem lazyListMeasuredItem5;
        int i4 = i2 - 1;
        int iMin2 = Math.min(((LazyListMeasuredItem) CollectionsKt.last((List) list)).getIndex() + i3, i4);
        int index2 = ((LazyListMeasuredItem) CollectionsKt.last((List) list)).getIndex() + 1;
        if (index2 <= iMin2) {
            arrayList = null;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LazyListMeasuredItemProvider.m1131getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, index2, 0L, 2, null));
                if (index2 == iMin2) {
                    break;
                }
                index2++;
            }
        } else {
            arrayList = null;
        }
        if (z2 && lazyListLayoutInfo != null && !lazyListLayoutInfo.getVisibleItemsInfo().isEmpty()) {
            List<LazyListItemInfo> visibleItemsInfo = lazyListLayoutInfo.getVisibleItemsInfo();
            for (int size = visibleItemsInfo.size() - 1; -1 < size; size--) {
                if (visibleItemsInfo.get(size).getIndex() > iMin2 && (size == 0 || visibleItemsInfo.get(size - 1).getIndex() <= iMin2)) {
                    lazyListItemInfo = visibleItemsInfo.get(size);
                    break;
                }
            }
            lazyListItemInfo = null;
            LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) CollectionsKt.last((List) lazyListLayoutInfo.getVisibleItemsInfo());
            if (lazyListItemInfo != null && (index = lazyListItemInfo.getIndex()) <= (iMin = Math.min(lazyListItemInfo2.getIndex(), i4))) {
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size2) {
                                lazyListMeasuredItem5 = null;
                                break;
                            }
                            lazyListMeasuredItem5 = arrayList.get(i5);
                            if (lazyListMeasuredItem5.getIndex() == index) {
                                break;
                            }
                            i5++;
                        }
                        lazyListMeasuredItem4 = lazyListMeasuredItem5;
                    } else {
                        lazyListMeasuredItem4 = null;
                    }
                    if (lazyListMeasuredItem4 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(LazyListMeasuredItemProvider.m1131getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, index, 0L, 2, null));
                    }
                    if (index == iMin) {
                        break;
                    }
                    index++;
                }
            }
            float viewportEndOffset = ((lazyListLayoutInfo.getViewportEndOffset() - lazyListItemInfo2.getOffset()) - lazyListItemInfo2.getSize()) - f2;
            if (viewportEndOffset > 0.0f) {
                int index3 = lazyListItemInfo2.getIndex() + 1;
                int i6 = 0;
                while (index3 < i2 && i6 < viewportEndOffset) {
                    if (index3 <= iMin2) {
                        int size3 = list.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size3) {
                                lazyListMeasuredItem3 = null;
                                break;
                            }
                            lazyListMeasuredItem3 = list.get(i7);
                            if (lazyListMeasuredItem3.getIndex() == index3) {
                                break;
                            }
                            i7++;
                        }
                        lazyListMeasuredItem = lazyListMeasuredItem3;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size4) {
                                lazyListMeasuredItem2 = null;
                                break;
                            }
                            lazyListMeasuredItem2 = arrayList.get(i8);
                            if (lazyListMeasuredItem2.getIndex() == index3) {
                                break;
                            }
                            i8++;
                        }
                        lazyListMeasuredItem = lazyListMeasuredItem2;
                    } else {
                        lazyListMeasuredItem = null;
                    }
                    if (lazyListMeasuredItem != null) {
                        index3++;
                        mainAxisSizeWithSpacings = lazyListMeasuredItem.getMainAxisSizeWithSpacings();
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(LazyListMeasuredItemProvider.m1131getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, index3, 0L, 2, null));
                        index3++;
                        mainAxisSizeWithSpacings = ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).getMainAxisSizeWithSpacings();
                    }
                    i6 += mainAxisSizeWithSpacings;
                }
            }
        }
        if (arrayList != null && ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).getIndex() > iMin2) {
            iMin2 = ((LazyListMeasuredItem) CollectionsKt.last((List) arrayList)).getIndex();
        }
        int size5 = list2.size();
        for (int i9 = 0; i9 < size5; i9++) {
            int iIntValue = list2.get(i9).intValue();
            if (iIntValue > iMin2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LazyListMeasuredItemProvider.m1131getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, iIntValue, 0L, 2, null));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<LazyListMeasuredItem> createItemsBeforeList(int i2, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i3, List<Integer> list) {
        int iMax = Math.max(0, i2 - i3);
        int i4 = i2 - 1;
        ArrayList arrayList = null;
        if (iMax <= i4) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(LazyListMeasuredItemProvider.m1131getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, i4, 0L, 2, null));
                if (i4 == iMax) {
                    break;
                }
                i4--;
            }
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i5 = size - 1;
                int iIntValue = list.get(size).intValue();
                if (iIntValue < iMax) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(LazyListMeasuredItemProvider.m1131getAndMeasure0kLqBqw$default(lazyListMeasuredItemProvider, iIntValue, 0L, 2, null));
                }
                if (i5 < 0) {
                    break;
                }
                size = i5;
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<LazyListMeasuredItem> calculateItemsOffsets(List<LazyListMeasuredItem> list, List<LazyListMeasuredItem> list2, List<LazyListMeasuredItem> list3, int i2, int i3, int i4, int i5, int i6, boolean z2, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z3, Density density) {
        int mainAxisSizeWithSpacings = i6;
        int i7 = z2 ? i3 : i2;
        boolean z4 = i4 < Math.min(i7, i5);
        if (z4 && mainAxisSizeWithSpacings != 0) {
            throw new IllegalStateException("non-zero itemsScrollOffset".toString());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z4) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no extra items".toString());
            }
            int size = list.size();
            int[] iArr = new int[size];
            for (int i8 = 0; i8 < size; i8++) {
                iArr[i8] = list.get(calculateItemsOffsets$reverseAware(i8, z3, size)).getSize();
            }
            int[] iArr2 = new int[size];
            for (int i9 = 0; i9 < size; i9++) {
                iArr2[i9] = 0;
            }
            if (!z2) {
                if (horizontal != null) {
                    horizontal.arrange(density, i7, iArr, LayoutDirection.Ltr, iArr2);
                } else {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false".toString());
                }
            } else {
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                }
                vertical.arrange(density, i7, iArr, iArr2);
            }
            IntRange indices = ArraysKt.getIndices(iArr2);
            if (z3) {
                indices = RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int size2 = iArr2[first];
                    LazyListMeasuredItem lazyListMeasuredItem = list.get(calculateItemsOffsets$reverseAware(first, z3, size));
                    if (z3) {
                        size2 = (i7 - size2) - lazyListMeasuredItem.getSize();
                    }
                    lazyListMeasuredItem.position(size2, i2, i3);
                    arrayList.add(lazyListMeasuredItem);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size();
            int mainAxisSizeWithSpacings2 = mainAxisSizeWithSpacings;
            for (int i10 = 0; i10 < size3; i10++) {
                LazyListMeasuredItem lazyListMeasuredItem2 = list2.get(i10);
                mainAxisSizeWithSpacings2 -= lazyListMeasuredItem2.getMainAxisSizeWithSpacings();
                lazyListMeasuredItem2.position(mainAxisSizeWithSpacings2, i2, i3);
                arrayList.add(lazyListMeasuredItem2);
            }
            int size4 = list.size();
            for (int i11 = 0; i11 < size4; i11++) {
                LazyListMeasuredItem lazyListMeasuredItem3 = list.get(i11);
                lazyListMeasuredItem3.position(mainAxisSizeWithSpacings, i2, i3);
                arrayList.add(lazyListMeasuredItem3);
                mainAxisSizeWithSpacings += lazyListMeasuredItem3.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i12 = 0; i12 < size5; i12++) {
                LazyListMeasuredItem lazyListMeasuredItem4 = list3.get(i12);
                lazyListMeasuredItem4.position(mainAxisSizeWithSpacings, i2, i3);
                arrayList.add(lazyListMeasuredItem4);
                mainAxisSizeWithSpacings += lazyListMeasuredItem4.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }
}
