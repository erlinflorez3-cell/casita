package androidx.compose.foundation.lazy.grid;

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
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: compiled from: LazyGridMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĭ\u0014D߬)\u001ew\u001eLDyt\fǻ\u000e0\u00194Jչ*,(w\u000f߿r9FDm߉6Ri*\u0017k\n=,Ӌ,qQZ]ڼ\u0006\"\u001fOVgmuRZ!C\u0017إ\u001ex\u0001,QU~]\u001a\u000fHBwЀ;M\u0006=A`z<\r @'@ц\r\u00010*PƵ~zYK\u0014\u00126@x:h\rUĨ\"\u0012\u001c>(ҵ&\\}N>ԟt]P/+\u0003oBV'u0\u0005ձ\u0015Fj'\u0015vw\u001e3@E5\u001d%i\u0003\u000fRq?\u000b?w@\rh563IyWN\u0018\u000eϬ-1_\u000fmrT\\3P\u0011\u00165,gi[R\u001e(&|*\fl\b\u001c\t?H\\1Jj\u0016\u0013Kt!Yp`\u0010eZ\f\u000bcF\u0017S\u0002C-I\u001b\u0015Z\u0010C_\u05cf=\u0014˩\f,-\u0019t1]d\u000e\u000f\u0015I_([?]XCXP\u001aYkz2o\u0013\f8\u0012HM\u00101\f\u0011\\\u0017S6\fC10\u0004\bXFwv3`\u0017R\u001aVVP:nD9Z\r\u001ak\\d3m\u0001Xf>)MJV7\u0002\u0016&8\\&>Q)\u001ebgh\u0018l}a\u0018:Gfeb\u001fq\u001cmQ`I4\u007fz@g`\u000f,ARa3q\u0017Fa&r\\V+bLx+\u0010{rjR\u0013JƦq*QD1GzEL\u0011=ZA+\u000b\u0010^v\u0015\u0017Ta*3m2w!\u0001~`!su\u0019a,+bR1OrM\u0019TWRlB\u001f;\u0007-u0Kuo_L\u001b\u0018&Y\nD.\u001agS_A!4\u0017)`\u0004]IZ\u0019}Q{9W~\u000b\"';\u0017W\u0018\fx\u0006D`\u0019S\u007fZ%8\u000f`\t\"6{0\u007fo^\u0013IyS9tnM\u0001\u001dq<|A-\t-9=\u0001\u001e>-?;m?#&y$/Ca\f\u0015 2\b\u000f'&#g46q\u0017\bha_B;fK\b}n&2\u001a\u001bBv\u0019(\fP8L\raxqh~\bPM9a.\u0018\u0015_%\u001eflJ\"\u001e\u007fӑ2i0(S\u0004\u001a\u0014S'\u0017Sy\u001e}\u0002[n\u001bX\u001f\u0016\u001b}An@\u001eM\"fW\u00112^=\"\u0017dIk\u0010\u0013t!MD.L\b9Edk\u0016\u0010)\u0002Vr\u001f(BD\u0004;\u0005HdzlVv@\u000fMȚ%*\u0007;\u001f5.xcn3'\r\u07bc҈bѢݏW\u001f\u000fYx\u000f\u0017\u00103k\\TgVHZ\u0007ՊS\u001fkO\u00128\u0014Go/\u001az<B&?5H(\u001dIQW!%s%\u000bڀhNr;ԦfWV%/Έ\u0017+\rۜ\u000eT"}, d2 = {"1`[0h3:b\u0019^\u000em9xl>e\b6", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`!\u0007_:^\u0004'F0],d(", ">h];X+\"b\u0019\u0007\t", "", ";dP@h9>R|\u000ezf\u0017\n\u0013@i~(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`!\u0007_:^\u0004'F0],d=\u007fG%\u0016Y\u000e[\u0001", ";dP@h9>R\u007f\u0003\u0004^\u0017\n\u0013@i~(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`!\u0007_:^\u0004'F3R5\\=\u007fG%\u0016Y\u000e[\u0001", "4h[AX9", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "1`[0h3:b\u0019b\n^4\u000br0f\u000e(\u000bN", "", ":h]2f", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`!\u0007_:^\u0004'F3R5\\(", "7sT:f\t>T#\fz", "7sT:f\b?b\u0019\f", ":`h<h;0W\u0018\u000e}", ":`h<h;!S\u001d\u0001}m", "4h]._\u0014:W\"Z\u000eb:f\n0s\u007f7", ";`g\u001cY-LS(", "4ha@g\u0013B\\\u0019lxk6\u0004\u0010\u0019f\u00016{O", "7rE2e;BQ\u0015\u0006", "DdaA\\*:Zt\f\bZ5~\t7e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwwc9]z%CS$", "6na6m6Gb\u0015\u0006Vk9x\u00121e\b(\u0005O", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1m\b0F7q;Z?Dm4&\u0015qpwim9R\f1P[J32", "@de2e:>:\u0015\u0013\u0005n;", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", ";dP@h9>:\u0015\u0014\u000f@9\u0001\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i9z\u001a-\u0017*7\u0001H\u007f\"l`!\u0007_:^\u0004'4L\\<caH", "7sT:f\nHc\"\u000e", ";`X;4?Bat\u0010vb3x\u00066em,\u0011@", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", "AoP0X\t>b+~zg\u0013\u0001\u0012/s", "4ha@g\u001dBa\u001d{\u0002^\u0013\u0001\u0012/I\t'{S", "4ha@g\u001dBa\u001d{\u0002^\u0013\u0001\u0012/S}5\u0006G\b\u0001\u0018H}\u000eK", "Aba<_3-]u~Xh5\u000b\u00197e~", "", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "7sT:45B[\u0015\u000e\u0005k", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O(W0dN\u0002G!g", "Ak^Af\u0017>`\u007f\u0003\u0004^", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", ">kP0X4>\\(lxh7|l8v{/\u007f?|&!T", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005U1,\u0015ur5\u0004j,<t1RL25mNyA\u0013\u000ei\u0018[\u0001", "5qP=[0<av\t\u0004m,\u0010\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<+MDz41$>", ">qT3X;<V|\b{h\u0019|\u0018<i\u007f9{M", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", ":h]2", "\u001aj^A_0G\u001d\u0004z~k\u0002", ":`h<h;", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", ";dP@h9>:\u0015\u0014\u000f@9\u0001\bvOt\u000e\u00075mr", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7\u0018;QB\u0005R03)Jn=\u0006K,J\u00057TLM\u0013`[r(!\u001ck\u0012M+\u001aZ@=-mQA#\u0007?\u0013\u007fEp\f\u0016$\u000e~kzR_\u000fC\t\u0019\u007fJroBnsCINIasK\bt1>G>#{q\u0015)x].\t_b\u0011z=\u0007qxK\u0018zEy\"Q?*)S6!i\u000e\u001bTz\u0005\u001c6W\btr7\f?4DdNLq(G]t$0fJp-2P\u001dOZ-QyK\nq!a\u0010\u000ekDo\nerrL\r\u0003dlB1j^\u000eAV\u0005Q\u0013m\u001f/Q\tP[C\u0016\u0013\u0017-laXG%]J!lX,o L^s%\u00187\u0018=a\u000fq9\u001e\u001aW \r}B\u0015\u000bUJje/\fvJ\u007fe[n7\u007fv\u001bQ,=Y<@bG9 \u001f8\u0010T]\u001d|wF\tJh\f!FXEld.\u001e1Q,!rB*\u001fv2\fbImZ\u0007+\u001f\u0007Wox*q\b?}GKYyk#_`\u0019#Vf\u001a<\\x>`|qK_{1Yx\u001bUg\u0012}\u000f-(o\u0006V#nd\u0016j\u001a\u001b_V#9*\b\\W)\u0017\u0011xUR*\r_8\u0005\u001ek$r\"V\u00118GCN6t)>\bS;\u0002;WD\u0004g9\u000ej\u001fK\u001a\u0011\u0012^\u0007hR+d%}\u007fl\u0018\u0017q`\u001e\t{V-%JJ\u0015\u000e\u0007\u0016\nTR\u007fo\u0002g.\b\u000b4!\u0006Gn<\u001f@}\\\u0003\u0019<y0gU1O\u0004\u001dG\u000f,Q\fx?yw$\u0019v<Yz\\\u0013\u0017/Bz\u007fWD\u001c\u001fPV%\fxf78md[L\u0017\r:|&h\u001fX\u001aH\u0004\u000e+P-\u000fR{a9cNCl.*$\u0015)gIf,_t+^\u0018\u001em=T}Z\u000f\u001eP\u001fwn\t\u001d[N,\u0007J\u0003\u001a\baE\u0012UA\u000f\f!Y6T\u0010T\u001e\u0010jo\u000eI\u001a\u0007\bX9f{H7?d>6\u000b1_NnP-%M", "/cS\u000e_3\u001f`#\u0007Vk9x\u001d", "\"", "/qa", "", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;u\u000f\u0001<\u0012\u0013`Nk\u0017>@\u000f2^}\u001eFCY\u001f", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyGridMeasureKt {
    private static final int calculateItemsOffsets$reverseAware(int i2, boolean z2, int i3) {
        return !z2 ? i2 : (i3 - i2) - 1;
    }

    /* JADX INFO: renamed from: measureLazyGrid-OZKpZRA, reason: not valid java name */
    public static final LazyGridMeasureResult m1159measureLazyGridOZKpZRA(int i2, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, int i3, int i4, int i5, int i6, int i7, int i8, float f2, long j2, boolean z2, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z3, Density density, LazyLayoutItemAnimator<LazyGridMeasuredItem> lazyLayoutItemAnimator, int i9, List<Integer> list, CoroutineScope coroutineScope, final MutableState<Unit> mutableState, GraphicsContext graphicsContext, Function1<? super Integer, ? extends List<Pair<Integer, Constraints>>> function1, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> function3) {
        boolean z4;
        int iM6608constrainWidthK40F9xA;
        int iM6590getMaxHeightimpl;
        LazyGridMeasuredItem[] items;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        float f3 = f2;
        int i10 = i7;
        if (i4 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding".toString());
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding".toString());
        }
        if (i2 <= 0) {
            int iM6593getMinWidthimpl = Constraints.m6593getMinWidthimpl(j2);
            int iM6592getMinHeightimpl = Constraints.m6592getMinHeightimpl(j2);
            lazyLayoutItemAnimator.onMeasured(0, iM6593getMinWidthimpl, iM6592getMinHeightimpl, new ArrayList(), lazyGridMeasuredItemProvider.getKeyIndexMap(), lazyGridMeasuredItemProvider, z2, false, i9, false, 0, 0, coroutineScope, graphicsContext);
            long jM1183getMinSizeToFitDisappearingItemsYbymL2g = lazyLayoutItemAnimator.m1183getMinSizeToFitDisappearingItemsYbymL2g();
            if (!IntSize.m6806equalsimpl0(jM1183getMinSizeToFitDisappearingItemsYbymL2g, IntSize.Companion.m6813getZeroYbymL2g())) {
                iM6593getMinWidthimpl = ConstraintsKt.m6608constrainWidthK40F9xA(j2, IntSize.m6808getWidthimpl(jM1183getMinSizeToFitDisappearingItemsYbymL2g));
                iM6592getMinHeightimpl = ConstraintsKt.m6607constrainHeightK40F9xA(j2, IntSize.m6807getHeightimpl(jM1183getMinSizeToFitDisappearingItemsYbymL2g));
            }
            return new LazyGridMeasureResult(null, 0, false, 0.0f, function3.invoke(Integer.valueOf(iM6593getMinWidthimpl), Integer.valueOf(iM6592getMinHeightimpl), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$3
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }), false, coroutineScope, density, i9, function1, CollectionsKt.emptyList(), -i4, i3 + i5, 0, z3, z2 ? Orientation.Vertical : Orientation.Horizontal, i5, i6);
        }
        int iRound = Math.round(f3);
        int i11 = i8 - iRound;
        if (i10 == 0 && i11 < 0) {
            iRound += i11;
            i11 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i12 = -i4;
        int i13 = (i6 < 0 ? i6 : 0) + i12;
        int mainAxisSizeWithSpacings = i11 + i13;
        while (mainAxisSizeWithSpacings < 0 && i10 > 0) {
            i10--;
            LazyGridMeasuredLine andMeasure = lazyGridMeasuredLineProvider.getAndMeasure(i10);
            arrayDeque.add(0, andMeasure);
            mainAxisSizeWithSpacings += andMeasure.getMainAxisSizeWithSpacings();
        }
        if (mainAxisSizeWithSpacings < i13) {
            iRound += mainAxisSizeWithSpacings;
            mainAxisSizeWithSpacings = i13;
        }
        int mainAxisSizeWithSpacings2 = mainAxisSizeWithSpacings - i13;
        int i14 = i3 + i5;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i14, 0);
        int mainAxisSizeWithSpacings3 = -mainAxisSizeWithSpacings2;
        int i15 = i10;
        int i16 = 0;
        boolean z5 = false;
        while (true) {
            z4 = true;
            if (i16 >= arrayDeque.size()) {
                break;
            }
            if (mainAxisSizeWithSpacings3 >= iCoerceAtLeast) {
                arrayDeque.remove(i16);
                z5 = true;
            } else {
                i15++;
                mainAxisSizeWithSpacings3 += ((LazyGridMeasuredLine) arrayDeque.get(i16)).getMainAxisSizeWithSpacings();
                i16++;
            }
        }
        while (i15 < i2 && (mainAxisSizeWithSpacings3 < iCoerceAtLeast || mainAxisSizeWithSpacings3 <= 0 || arrayDeque.isEmpty())) {
            LazyGridMeasuredLine andMeasure2 = lazyGridMeasuredLineProvider.getAndMeasure(i15);
            if (andMeasure2.isEmpty()) {
                break;
            }
            mainAxisSizeWithSpacings3 += andMeasure2.getMainAxisSizeWithSpacings();
            if (mainAxisSizeWithSpacings3 > i13 || ((LazyGridMeasuredItem) ArraysKt.last(andMeasure2.getItems())).getIndex() == i2 - 1) {
                arrayDeque.add(andMeasure2);
            } else {
                i10 = i15 + 1;
                mainAxisSizeWithSpacings2 -= andMeasure2.getMainAxisSizeWithSpacings();
                z5 = true;
            }
            i15++;
        }
        if (mainAxisSizeWithSpacings3 < i3) {
            int i17 = i3 - mainAxisSizeWithSpacings3;
            mainAxisSizeWithSpacings2 -= i17;
            mainAxisSizeWithSpacings3 += i17;
            while (mainAxisSizeWithSpacings2 < i4 && i10 > 0) {
                i10--;
                LazyGridMeasuredLine andMeasure3 = lazyGridMeasuredLineProvider.getAndMeasure(i10);
                arrayDeque.add(0, andMeasure3);
                mainAxisSizeWithSpacings2 += andMeasure3.getMainAxisSizeWithSpacings();
            }
            iRound += i17;
            if (mainAxisSizeWithSpacings2 < 0) {
                iRound += mainAxisSizeWithSpacings2;
                mainAxisSizeWithSpacings3 += mainAxisSizeWithSpacings2;
                mainAxisSizeWithSpacings2 = 0;
            }
        }
        if (MathKt.getSign(Math.round(f3)) == MathKt.getSign(iRound) && Math.abs(Math.round(f3)) >= Math.abs(iRound)) {
            f3 = iRound;
        }
        if (mainAxisSizeWithSpacings2 < 0) {
            throw new IllegalArgumentException("negative initial offset".toString());
        }
        int i18 = -mainAxisSizeWithSpacings2;
        LazyGridMeasuredLine lazyGridMeasuredLine = (LazyGridMeasuredLine) arrayDeque.first();
        LazyGridMeasuredItem lazyGridMeasuredItem2 = (LazyGridMeasuredItem) ArraysKt.firstOrNull(lazyGridMeasuredLine.getItems());
        int index = lazyGridMeasuredItem2 != null ? lazyGridMeasuredItem2.getIndex() : 0;
        LazyGridMeasuredLine lazyGridMeasuredLine2 = (LazyGridMeasuredLine) arrayDeque.lastOrNull();
        int index2 = (lazyGridMeasuredLine2 == null || (items = lazyGridMeasuredLine2.getItems()) == null || (lazyGridMeasuredItem = (LazyGridMeasuredItem) ArraysKt.lastOrNull(items)) == null) ? 0 : lazyGridMeasuredItem.getIndex();
        int size = list.size();
        ArrayList arrayListEmptyList = null;
        ArrayList arrayListEmptyList2 = null;
        int i19 = 0;
        while (i19 < size) {
            int i20 = i19;
            int iIntValue = list.get(i20).intValue();
            if (iIntValue >= 0 && iIntValue < index) {
                int iSpanOf = lazyGridMeasuredLineProvider.spanOf(iIntValue);
                LazyGridMeasuredItem lazyGridMeasuredItemMo1132getAndMeasurehBUhpc = lazyGridMeasuredItemProvider.mo1132getAndMeasurehBUhpc(iIntValue, 0, iSpanOf, lazyGridMeasuredLineProvider.m1163childConstraintsJhjzzOo$foundation_release(0, iSpanOf));
                if (arrayListEmptyList2 == null) {
                    arrayListEmptyList2 = new ArrayList();
                }
                arrayListEmptyList2.add(lazyGridMeasuredItemMo1132getAndMeasurehBUhpc);
            }
            i19 = i20 + 1;
        }
        if (arrayListEmptyList2 == null) {
            arrayListEmptyList2 = CollectionsKt.emptyList();
        }
        int size2 = list.size();
        int i21 = 0;
        while (i21 < size2) {
            int i22 = i21;
            int iIntValue2 = list.get(i22).intValue();
            if (index2 + 1 <= iIntValue2 && iIntValue2 < i2) {
                int iSpanOf2 = lazyGridMeasuredLineProvider.spanOf(iIntValue2);
                LazyGridMeasuredItem lazyGridMeasuredItemMo1132getAndMeasurehBUhpc2 = lazyGridMeasuredItemProvider.mo1132getAndMeasurehBUhpc(iIntValue2, 0, iSpanOf2, lazyGridMeasuredLineProvider.m1163childConstraintsJhjzzOo$foundation_release(0, iSpanOf2));
                if (arrayListEmptyList == null) {
                    arrayListEmptyList = new ArrayList();
                }
                arrayListEmptyList.add(lazyGridMeasuredItemMo1132getAndMeasurehBUhpc2);
            }
            i21 = i22 + 1;
        }
        if (arrayListEmptyList == null) {
            arrayListEmptyList = CollectionsKt.emptyList();
        }
        if (i4 > 0 || i6 < 0) {
            int size3 = arrayDeque.size();
            int i23 = 0;
            while (i23 < size3) {
                int mainAxisSizeWithSpacings4 = ((LazyGridMeasuredLine) arrayDeque.get(i23)).getMainAxisSizeWithSpacings();
                if (mainAxisSizeWithSpacings2 == 0 || mainAxisSizeWithSpacings4 > mainAxisSizeWithSpacings2 || i23 == CollectionsKt.getLastIndex(arrayDeque)) {
                    break;
                }
                mainAxisSizeWithSpacings2 -= mainAxisSizeWithSpacings4;
                i23++;
                lazyGridMeasuredLine = (LazyGridMeasuredLine) arrayDeque.get(i23);
            }
        }
        if (z2) {
            iM6608constrainWidthK40F9xA = Constraints.m6591getMaxWidthimpl(j2);
        } else {
            iM6608constrainWidthK40F9xA = ConstraintsKt.m6608constrainWidthK40F9xA(j2, mainAxisSizeWithSpacings3);
        }
        if (z2) {
            iM6590getMaxHeightimpl = ConstraintsKt.m6607constrainHeightK40F9xA(j2, mainAxisSizeWithSpacings3);
        } else {
            iM6590getMaxHeightimpl = Constraints.m6590getMaxHeightimpl(j2);
        }
        int iM6607constrainHeightK40F9xA = iM6590getMaxHeightimpl;
        int iM6608constrainWidthK40F9xA2 = iM6608constrainWidthK40F9xA;
        final List<LazyGridMeasuredItem> listCalculateItemsOffsets = calculateItemsOffsets(arrayDeque, arrayListEmptyList2, arrayListEmptyList, iM6608constrainWidthK40F9xA, iM6590getMaxHeightimpl, mainAxisSizeWithSpacings3, i3, i18, z2, vertical, horizontal, z3, density);
        lazyLayoutItemAnimator.onMeasured((int) f3, iM6608constrainWidthK40F9xA2, iM6607constrainHeightK40F9xA, listCalculateItemsOffsets, lazyGridMeasuredItemProvider.getKeyIndexMap(), lazyGridMeasuredItemProvider, z2, false, i9, false, mainAxisSizeWithSpacings2, mainAxisSizeWithSpacings3, coroutineScope, graphicsContext);
        long jM1183getMinSizeToFitDisappearingItemsYbymL2g2 = lazyLayoutItemAnimator.m1183getMinSizeToFitDisappearingItemsYbymL2g();
        if (!IntSize.m6806equalsimpl0(jM1183getMinSizeToFitDisappearingItemsYbymL2g2, IntSize.Companion.m6813getZeroYbymL2g())) {
            int i24 = z2 ? iM6607constrainHeightK40F9xA : iM6608constrainWidthK40F9xA2;
            iM6608constrainWidthK40F9xA2 = ConstraintsKt.m6608constrainWidthK40F9xA(j2, Math.max(iM6608constrainWidthK40F9xA2, IntSize.m6808getWidthimpl(jM1183getMinSizeToFitDisappearingItemsYbymL2g2)));
            iM6607constrainHeightK40F9xA = ConstraintsKt.m6607constrainHeightK40F9xA(j2, Math.max(iM6607constrainHeightK40F9xA, IntSize.m6807getHeightimpl(jM1183getMinSizeToFitDisappearingItemsYbymL2g2)));
            int i25 = z2 ? iM6607constrainHeightK40F9xA : iM6608constrainWidthK40F9xA2;
            if (i25 != i24) {
                int size4 = listCalculateItemsOffsets.size();
                for (int i26 = 0; i26 < size4; i26++) {
                    listCalculateItemsOffsets.get(i26).updateMainAxisLayoutSize(i25);
                }
            }
        }
        if (index2 == i2 - 1 && mainAxisSizeWithSpacings3 <= i3) {
            z4 = false;
        }
        MeasureResult measureResultInvoke = function3.invoke(Integer.valueOf(iM6608constrainWidthK40F9xA2), Integer.valueOf(iM6607constrainHeightK40F9xA), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridMeasureKt$measureLazyGrid$6
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
                List<LazyGridMeasuredItem> list2 = listCalculateItemsOffsets;
                int size5 = list2.size();
                for (int i27 = 0; i27 < size5; i27++) {
                    list2.get(i27).place(placementScope);
                }
                ObservableScopeInvalidator.m1192attachToScopeimpl(mutableState);
            }
        });
        if (!arrayListEmptyList2.isEmpty() || !arrayListEmptyList.isEmpty()) {
            ArrayList arrayList = new ArrayList(listCalculateItemsOffsets.size());
            int size5 = listCalculateItemsOffsets.size();
            for (int i27 = 0; i27 < size5; i27++) {
                LazyGridMeasuredItem lazyGridMeasuredItem3 = listCalculateItemsOffsets.get(i27);
                int index3 = lazyGridMeasuredItem3.getIndex();
                if (index <= index3 && index3 <= index2) {
                    arrayList.add(lazyGridMeasuredItem3);
                }
            }
            listCalculateItemsOffsets = arrayList;
        }
        return new LazyGridMeasureResult(lazyGridMeasuredLine, mainAxisSizeWithSpacings2, z4, f3, measureResultInvoke, z5, coroutineScope, density, i9, function1, listCalculateItemsOffsets, i12, i14, i2, z3, z2 ? Orientation.Vertical : Orientation.Horizontal, i5, i6);
    }

    private static final List<LazyGridMeasuredItem> calculateItemsOffsets(List<LazyGridMeasuredLine> list, List<LazyGridMeasuredItem> list2, List<LazyGridMeasuredItem> list3, int i2, int i3, int i4, int i5, int i6, boolean z2, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z3, Density density) {
        int mainAxisSizeWithSpacings = i6;
        int i7 = z2 ? i3 : i2;
        boolean z4 = i4 < Math.min(i7, i5);
        if (z4 && mainAxisSizeWithSpacings != 0) {
            throw new IllegalStateException("non-zero firstLineScrollOffset".toString());
        }
        int size = list.size();
        int length = 0;
        for (int i8 = 0; i8 < size; i8++) {
            length += list.get(i8).getItems().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (z4) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("no items".toString());
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i9 = 0; i9 < size2; i9++) {
                iArr[i9] = list.get(calculateItemsOffsets$reverseAware(i9, z3, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            for (int i10 = 0; i10 < size2; i10++) {
                iArr2[i10] = 0;
            }
            if (!z2) {
                if (horizontal != null) {
                    horizontal.arrange(density, i7, iArr, LayoutDirection.Ltr, iArr2);
                } else {
                    throw new IllegalArgumentException("null horizontalArrangement".toString());
                }
            } else {
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalArrangement".toString());
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
                    int mainAxisSize = iArr2[first];
                    LazyGridMeasuredLine lazyGridMeasuredLine = list.get(calculateItemsOffsets$reverseAware(first, z3, size2));
                    if (z3) {
                        mainAxisSize = (i7 - mainAxisSize) - lazyGridMeasuredLine.getMainAxisSize();
                    }
                    addAllFromArray(arrayList, lazyGridMeasuredLine.position(mainAxisSize, i2, i3));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int mainAxisSizeWithSpacings2 = mainAxisSizeWithSpacings;
                while (true) {
                    int i11 = size3 - 1;
                    LazyGridMeasuredItem lazyGridMeasuredItem = list2.get(size3);
                    mainAxisSizeWithSpacings2 -= lazyGridMeasuredItem.getMainAxisSizeWithSpacings();
                    lazyGridMeasuredItem.position(mainAxisSizeWithSpacings2, 0, i2, i3);
                    arrayList.add(lazyGridMeasuredItem);
                    if (i11 < 0) {
                        break;
                    }
                    size3 = i11;
                }
            }
            int size4 = list.size();
            for (int i12 = 0; i12 < size4; i12++) {
                LazyGridMeasuredLine lazyGridMeasuredLine2 = list.get(i12);
                addAllFromArray(arrayList, lazyGridMeasuredLine2.position(mainAxisSizeWithSpacings, i2, i3));
                mainAxisSizeWithSpacings += lazyGridMeasuredLine2.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i13 = 0; i13 < size5; i13++) {
                LazyGridMeasuredItem lazyGridMeasuredItem2 = list3.get(i13);
                lazyGridMeasuredItem2.position(mainAxisSizeWithSpacings, 0, i2, i3);
                arrayList.add(lazyGridMeasuredItem2);
                mainAxisSizeWithSpacings += lazyGridMeasuredItem2.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final <T> void addAllFromArray(List<T> list, T[] tArr) {
        for (T t2 : tArr) {
            list.add(t2);
        }
    }

    private static final List<LazyGridMeasuredItem> calculateExtraItems(List<Integer> list, LazyGridMeasuredItemProvider lazyGridMeasuredItemProvider, LazyGridMeasuredLineProvider lazyGridMeasuredLineProvider, Function1<? super Integer, Boolean> function1) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            int iIntValue = list.get(i2).intValue();
            if (function1.invoke(Integer.valueOf(iIntValue)).booleanValue()) {
                int iSpanOf = lazyGridMeasuredLineProvider.spanOf(iIntValue);
                LazyGridMeasuredItem lazyGridMeasuredItemMo1132getAndMeasurehBUhpc = lazyGridMeasuredItemProvider.mo1132getAndMeasurehBUhpc(iIntValue, 0, iSpanOf, lazyGridMeasuredLineProvider.m1163childConstraintsJhjzzOo$foundation_release(0, iSpanOf));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyGridMeasuredItemMo1132getAndMeasurehBUhpc);
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }
}
