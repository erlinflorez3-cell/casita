package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.gestures.snapping.SnapPositionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: PagerMeasure.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĳ\u0014D߬)\u001ew\u0005LDit\fA\u001c0\u0013ǞJ~02\u001aՄ\u000ffxW8DkJ6Ri*\u0017k\u00029,[:qK;[\u001b\u0006\"\u0017OVʴon`Z\u0013C\u001d\u0012\u001eюr,Wt\u0001](\u000f:BuF;M\u0006=Aś|6\u0013):Ĳ@y\u001b\u0001\"*N\u0012~zYK\u0014۵8@\u0007:Z҈U\u00050\u0012\u000ē(\u00014\\oޮ>H\u0003]Bǂ+\u0003\u007fBV'e1\u0005M#F\\'\u0013yi\u001eA@?ߎ\u001d%i\u0003\u000fѸc?\u0019?y=\u001bh/'AI{WLX\b\u0014\u001b,gSks>^\u001bP\u000f\u000eW/]fcP<,(\u0005\n\u0012T\n\u001e\b7H\\/Hl8\u0012A{\u000bSnT2bP\b\u0013ad\u001bU\u0004A4Q\u001b\u0015U\u0012?'XO{3\u0018N'\u000fz9[\u0003\u0012'\u00153\u001b\u0006^IWP?XN8[ks4tp\u0010B\u0004^K03\n F\u0017S;\f=11\u0004\u0002vH\u0018\u0001\u0013q\u0001YyTX@PrD=Z\u0019\u001al\\p\u0015m`T\u00070!O,T5\u007f6&f\\\u0010z/9(T_jyj{_8+_jEn\u0007k<[ibAEic>e\u0003\u0001\"PTh\u0015ZvB\u0002\u0010\tbX2@Z\u0003\u001c\b}TN:\u0017BA\u0002\u001cb._,#\u0015`\u0018,XY|7v\u000br\u001e\u0017l94\u0005y$##/i#ʜu\u007fջH:\u0018x(=Ca5G(\u0004>\u00114+@7\t\u0002\u001e_m\\I\\lDw\u0004\u0002P (Xi5M\u0015\u001f~W403uV\u0001\u0006iS\")\u000b|(\u0011in^k\u0016\f\t,\u000fnzSb9:v\rvS\fr#\u0012at~wgb/s>wv3]JsP|3#N)\u000f\u0016:|cTs++>\u0010\u0014]>\u0012aw\u001aFy\u0011:Vxs0DcDs\u0013Uk_S8w]E>:\rz\u0015ZH\u0019y0B7Q=7Vo|p\u0005<}\u000f=-~\u0007Z=!Zik+o,f^c8'[}B\u0013s)\u001fskg\u001c\u0015{b\u0019\u007f'\f!z_%B\"KWnYx\b^>$\u001cDzSb3v9(BTT\b9l\u0005m\u0014=\u0013\u007ftcU\u0017ѡAƽŌZ\u0010Z4j\u0013`Х_S\u001e9*/=73L\u0016e5\u0013y^T]gb\u0005aN!\u001b\u0019\u0002/j3j\\Tg\u001fX\\\u000f\u0012]]qM2:\u0012OAm\u001as<<&)5BF\u001fiU\u001f \u000f0\r\u000f\u0006h\\&\u000f\u0012\u0015V~&7A\u0013|<l:\u0013\u0019?gr\u001e\n]R\\/OE0\u007fE|Y\r\u001a2{H1,4k]AW\u0013,'*\u0001\u0004?\f;8 U8%%j\u0005&f8aK>$\u0002.b0\rCZ.\u0015FP\u0005t\u001a.6:}\bc\u0006!hqk&,p+90\u001eBy-)\u000eq2{n\u0004Q3\u0014?\u001e\u0012\u0018=R-\tUQ>\u0015hZh\u0015c3h\"\u0010\u0016%&M\u007f\u0018d9\u0010}z\u0017\u0004քS[\u0013u?m:a_{\u0001fDΥߐtâցX*\u001b\bd\u001b^p\u0017Ϟ\u0005B\u0006\r5Ȧz̒x\f1ح\u001d\u000bV^)\u0013bEIھ7Ԙ;\u0019'ʺƯGe\u000f\u0007KôBO0ŅCi"}, d2 = {"\u001b`g\u001dT.>=\u001a\u007f\t^;", "", "\u001bh]\u001dT.>=\u001a\u007f\t^;", "1`[0h3:b\u0019gzp\n\r\u0016<e\t7f<\u0003\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001U\u0016*[SHk3\t\u0011ja\u000f", "DhTDc6Kb\u0007\u0003\u0010^", "", "Dhb6U3>>\u0015\u0001zl\u0010\u0006\n9", "", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", "7sT:F0SS", "AmP=C6LW(\u0003\u0005g", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w[L7v?\"\u001ej+'\u0010_79\u00015K[R6e(", ">`V266N\\(", "1qT.g,)O\u001b~\t:-\f\t<L\u00046\u000b", "1ta?X5M:\u0015\r\nI(~\t", ">`V2f\nHc\"\u000e", "0dh<a+/W\u0019\u0011\u0006h9\fs+g\u007f\u0006\u0006P\n&", ">h];X+)O\u001b~\t", "5dc\u000ea+&S\u0015\r\u000bk,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "1qT.g,)O\u001b~\t;,}\u0013<ef,\nO", "1ta?X5M4\u001d\f\tm\u0017x\u000b/", "2dQBZ\u0013HU", "", "5d]2e(MS\u0001\r|", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "1`[0h3:b\u0019iv`,\u000br0f\u000e(\u000bN", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,JP|H\u0014g", ">`V2f", "3wc?T\u0017:U\u0019\rW^-\u0007\u0016/", "3wc?T\u0017:U\u0019\rV_;|\u0016", ":`h<h;0W\u0018\u000e}", ":`h<h;!S\u001d\u0001}m", "4h]._\u0014:W\"Z\u000eb:f\n0s\u007f7", ";`g\u001cY-LS(", ">`V2f\u001a<`#\u0006\u0002H-}\u0017/t", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "@de2e:>:\u0015\u0013\u0005n;", "", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "AoP0X\t>b+~zg\u0017x\u000b/s", ">`V24=:W zwe,j\rDe", "7mS2k", "1gX9W\nH\\'\u000e\bZ0\u0006\u0018=", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ">`V2e\u0010MS!i\bh=\u0001\b/r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP\"gI2{duC\u0017r\u0010]v/2YX=`QrJi", "DhbBT3)O\u001b~d_-\u000b\t>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "6na6m6Gb\u0015\u0006Ve0~\u00127e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "DdaA\\*:Zt\u0006~`5\u0005\t8t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u000ea+&S\u0015\r\u000bk,Dv\u0011fQ'_\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]^'CZ^9\\@pG\u001f\u00120q3\u0012\t\u000eXN.rCJh\u00066Q\rEv\u0001U\u0017\u0018Eso>e\u0014Q\u0003^\u0001=+hS#JuIARI&y F\u0019pDJ3w\u0001\u0019#S]8\u001b\u007fR\u0011\u007f(^NcP\u0018\bB(=\u0001%DOw`F\u0003'hL\u0006\b\u001b1T\u0004/~6M6*Ds\u0015Xg&\bH\u0006\u0019,eP#5:F\u001c\u00152_~kK\u0018l\u001etQ\fl=<#se-X\u0013P9\u001e_7jg\u0001@aD!S|\u0019<P\bQW\u0001jo\u0003-lrSG\u001agJ\u0018zL-i\u001f\u0003Lv\u001ce\n\u001dA[\u0018p*hF\f\u0004\tuG\u0010yUJjWD\u0019lX|_V\u0003m4\u0003\u0019T+AK\u0006\u0007V\r\u007f\u0019\u001aCJqz1}yQX: %#L]Bk6$n+:\u001e\"fE&#,DKPJvi\u00025\u0015G\u000fr\r\u001e\\:G\u0006=J\u0013u\u001e>cXN$ZN\u001e<Z\u0015.Kp\u0018B1", ";dP@h9>>\u0015\u0001zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@01[}-\u0001X\u00120MP#k0,%ua&\u0007q<U\u0006|", ";`X;4?Bat\u0010vb3x\u00066em,\u0011@", "1ta?X5M>\u0015\u0001z", "1ta?X5M>\u0015\u0001zH-}\u0017/t", "1n]@g9:W\"\u000e\t", ">kP0X4>\\(lxh7|l8v{/\u007f?|&!T", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005U1,\u0015ur5\u0004j,<t1RL25mNyA\u0013\u000ei\u0018[\u0001", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", ":`h<h;", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", ";dP@h9>>\u0015\u0001zksy\u001158t\u0013\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]^'CZ^9\\@pG\u001f\u00120q5'\u0016\u0004fK(mW\u0001\u001d\u00124T\fIhJ\r \u001e>ilQZ\u001aPC qC)u\u0010D[{GN,^?xr[1fJI\b#q!\u0006uZ?\u000ezS\u001eH6]KK+|_\u001f GlhPInh\u0006r1'V\u0006\u0006\u0012{Y~;},\u007fC.@mNMg&Mn\u0006\u0015:&+4*6E\";Zg\u007fu\u0014td(`\u0015\u0018f4DbcokS\u0019\u0015]`k9+;\b;T\u000fFIx$e7~Oj}\u0013\u0005\u000eyTaRB(^\u0005\u0019\u0004\u000e i\u0019\u000e\rt\u0018e>\u001a\u00075\u0016l,h?M\u001c\u0018'\u001b\u0016\t]X\u001fyW\ft!g@;S\u000b;t\"EjCZ@}\u001c*s\u001e%\ng\u0007\b\u001c\u0001sFxI\\#/EdBp`x\fqc+\u0018cG )6z\u0004RN}n\u0005'#G\u001cqx hBA\u0004|/Rf-'mY\tK^\\\u0019\u00024\u00118_\u0002 FZ\u0007~Hx\u0016\u000b\u000e9x\\)</\u0005K'gd\u0017v\u001b\b\u0007v\u001d\u001d*|gNk4\u0019xWO\u001e\u0007nx\u0003\u001a/Px$P\n)Q\u0004,R\u0004)C\u0017\u0002]\u0006 VA\u0005c\u0010a'+P\u0019\n\u0011\u001a\f0Md\\&\u0003u{R9j_kl\u0005_=%RE\u001e\u0006u]gQNtx\rXc\u001dJ* \u0004Dx\u0001\u000f\u00065d\u0006&0r;mQp7\u0002\u001d>\f5\u001dh\u00177pu\f\u0006ct\u0003\u0002Rp\u00109I8\n\u001c", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PagerMeasureKt {
    public static final float MaxPageOffset = 0.5f;
    public static final float MinPageOffset = -0.5f;

    private static final int calculatePagesOffsets$reverseAware(int i2, boolean z2, int i3) {
        return !z2 ? i2 : (i3 - i2) - 1;
    }

    private static final void debugLog(Function0<String> function0) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: measurePager-bmk8ZPk, reason: not valid java name */
    public static final PagerMeasureResult m1260measurePagerbmk8ZPk(final LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, final PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i3, int i4, int i5, int i6, int i7, int i8, long j2, Orientation orientation, final Alignment.Vertical vertical, final Alignment.Horizontal horizontal, final boolean z2, final long j3, final int i9, int i10, List<Integer> list, SnapPosition snapPosition, final MutableState<Unit> mutableState, CoroutineScope coroutineScope, Function3<? super Integer, ? super Integer, ? super Function1<? super Placeable.PlacementScope, Unit>, ? extends MeasureResult> function3) {
        boolean z3;
        int i11;
        ArrayList arrayList;
        ArrayList arrayListEmptyList;
        ArrayList arrayListEmptyList2;
        int i12 = i7;
        if (i4 < 0) {
            throw new IllegalArgumentException("negative beforeContentPadding".toString());
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("negative afterContentPadding".toString());
        }
        int i13 = 0;
        int iCoerceAtLeast = RangesKt.coerceAtLeast(i9 + i6, 0);
        Orientation orientation2 = orientation;
        if (i2 <= 0) {
            return new PagerMeasureResult(CollectionsKt.emptyList(), i9, i6, i5, orientation2, -i4, i3 + i5, false, i10, null, null, 0.0f, 0, false, snapPosition, function3.invoke(Integer.valueOf(Constraints.m6593getMinWidthimpl(j2)), Integer.valueOf(Constraints.m6592getMinHeightimpl(j2)), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$4
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }), false, null, null, coroutineScope, 393216, null);
        }
        final long jConstraints$default = ConstraintsKt.Constraints$default(0, orientation2 == Orientation.Vertical ? Constraints.m6591getMaxWidthimpl(j2) : i9, 0, orientation2 != Orientation.Vertical ? Constraints.m6590getMaxHeightimpl(j2) : i9, 5, null);
        while (i12 > 0 && i8 > 0) {
            i12--;
            i8 -= iCoerceAtLeast;
        }
        int i14 = i8 * (-1);
        if (i12 >= i2) {
            i12 = i2 - 1;
            i14 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i15 = -i4;
        int i16 = (i6 < 0 ? i6 : 0) + i15;
        int i17 = i14 + i16;
        int iMax = 0;
        while (i17 < 0 && i12 > 0) {
            int i18 = i12 - 1;
            i12 = i18;
            MeasuredPage measuredPageM1259getAndMeasureSGf7dI0 = m1259getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i18, jConstraints$default, pagerLazyLayoutItemProvider, j3, orientation2, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z2, i9);
            arrayDeque.add(0, measuredPageM1259getAndMeasureSGf7dI0);
            iMax = Math.max(iMax, measuredPageM1259getAndMeasureSGf7dI0.getCrossAxisSize());
            i17 += iCoerceAtLeast;
        }
        if (i17 < i16) {
            i17 = i16;
        }
        int i19 = i17 - i16;
        int i20 = i3 + i5;
        int iCoerceAtLeast2 = RangesKt.coerceAtLeast(i20, 0);
        int i21 = -i19;
        boolean z4 = false;
        int i22 = i12;
        while (true) {
            z3 = 1;
            z3 = 1;
            if (i13 >= arrayDeque.size()) {
                break;
            }
            if (i21 >= iCoerceAtLeast2) {
                arrayDeque.remove(i13);
                z4 = true;
            } else {
                i22++;
                i21 += iCoerceAtLeast;
                i13++;
            }
        }
        while (i22 < i2 && (i21 < iCoerceAtLeast2 || i21 <= 0 || arrayDeque.isEmpty())) {
            int i23 = i22;
            MeasuredPage measuredPageM1259getAndMeasureSGf7dI02 = m1259getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i22, jConstraints$default, pagerLazyLayoutItemProvider, j3, orientation2, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z2, i9);
            int i24 = i2 - 1;
            i21 += i23 == i24 ? i9 : iCoerceAtLeast;
            if (i21 > i16 || i23 == i24) {
                iMax = Math.max(iMax, measuredPageM1259getAndMeasureSGf7dI02.getCrossAxisSize());
                arrayDeque.add(measuredPageM1259getAndMeasureSGf7dI02);
            } else {
                i12 = i23 + 1;
                i19 -= iCoerceAtLeast;
                z4 = true;
            }
            i22 = i23 + 1;
        }
        if (i21 < i3) {
            int i25 = i3 - i21;
            i19 -= i25;
            int i26 = i25 + i21;
            while (i19 < i4 && i12 > 0) {
                i12--;
                orientation2 = orientation2;
                MeasuredPage measuredPageM1259getAndMeasureSGf7dI03 = m1259getAndMeasureSGf7dI0(lazyLayoutMeasureScope, i12, jConstraints$default, pagerLazyLayoutItemProvider, j3, orientation2, horizontal, vertical, lazyLayoutMeasureScope.getLayoutDirection(), z2, i9);
                arrayDeque.add(0, measuredPageM1259getAndMeasureSGf7dI03);
                iMax = Math.max(iMax, measuredPageM1259getAndMeasureSGf7dI03.getCrossAxisSize());
                i19 += iCoerceAtLeast;
            }
            i11 = 0;
            if (i19 < 0) {
                i21 = i26 + i19;
                i19 = 0;
            } else {
                i21 = i26;
            }
        } else {
            i11 = 0;
        }
        if (i19 < 0) {
            throw new IllegalArgumentException("invalid currentFirstPageScrollOffset".toString());
        }
        int i27 = -i19;
        MeasuredPage measuredPage = (MeasuredPage) arrayDeque.first();
        if (i4 > 0 || i6 < 0) {
            int size = arrayDeque.size();
            int i28 = i11;
            while (i28 < size && i19 != 0 && iCoerceAtLeast <= i19 && i28 != CollectionsKt.getLastIndex(arrayDeque)) {
                i19 -= iCoerceAtLeast;
                i28++;
                measuredPage = (MeasuredPage) arrayDeque.get(i28);
            }
        }
        final Orientation orientation3 = orientation2;
        List<MeasuredPage> listCreatePagesBeforeList = createPagesBeforeList(i12, i10, list, new Function1<Integer, MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesBefore$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ MeasuredPage invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final MeasuredPage invoke(int i29) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                return PagerMeasureKt.m1259getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i29, jConstraints$default, pagerLazyLayoutItemProvider, j3, orientation3, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z2, i9);
            }
        });
        int size2 = listCreatePagesBeforeList.size();
        for (int i29 = i11; i29 < size2; i29++) {
            iMax = Math.max(iMax, listCreatePagesBeforeList.get(i29).getCrossAxisSize());
        }
        List<MeasuredPage> listCreatePagesAfterList = createPagesAfterList(((MeasuredPage) arrayDeque.last()).getIndex(), i2, i10, list, new Function1<Integer, MeasuredPage>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$extraPagesAfter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ MeasuredPage invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final MeasuredPage invoke(int i30) {
                LazyLayoutMeasureScope lazyLayoutMeasureScope2 = lazyLayoutMeasureScope;
                return PagerMeasureKt.m1259getAndMeasureSGf7dI0(lazyLayoutMeasureScope2, i30, jConstraints$default, pagerLazyLayoutItemProvider, j3, orientation3, horizontal, vertical, lazyLayoutMeasureScope2.getLayoutDirection(), z2, i9);
            }
        });
        int size3 = listCreatePagesAfterList.size();
        for (int i30 = i11; i30 < size3; i30++) {
            iMax = Math.max(iMax, listCreatePagesAfterList.get(i30).getCrossAxisSize());
        }
        int i31 = (Intrinsics.areEqual(measuredPage, arrayDeque.first()) && listCreatePagesBeforeList.isEmpty() && listCreatePagesAfterList.isEmpty()) ? 1 : i11;
        int iM6608constrainWidthK40F9xA = ConstraintsKt.m6608constrainWidthK40F9xA(j2, orientation3 == Orientation.Vertical ? iMax : i21);
        if (orientation3 == Orientation.Vertical) {
            iMax = i21;
        }
        int iM6607constrainHeightK40F9xA = ConstraintsKt.m6607constrainHeightK40F9xA(j2, iMax);
        final List<MeasuredPage> listCalculatePagesOffsets = calculatePagesOffsets(lazyLayoutMeasureScope, arrayDeque, listCreatePagesBeforeList, listCreatePagesAfterList, iM6608constrainWidthK40F9xA, iM6607constrainHeightK40F9xA, i21, i3, i27, orientation3, z2, lazyLayoutMeasureScope, i6, i9);
        if (i31 != 0) {
            arrayList = listCalculatePagesOffsets;
        } else {
            ArrayList arrayList2 = new ArrayList(listCalculatePagesOffsets.size());
            int size4 = listCalculatePagesOffsets.size();
            for (int i32 = i11; i32 < size4; i32++) {
                MeasuredPage measuredPage2 = listCalculatePagesOffsets.get(i32);
                MeasuredPage measuredPage3 = measuredPage2;
                if (measuredPage3.getIndex() >= ((MeasuredPage) arrayDeque.first()).getIndex() && measuredPage3.getIndex() <= ((MeasuredPage) arrayDeque.last()).getIndex()) {
                    arrayList2.add(measuredPage2);
                }
            }
            arrayList = arrayList2;
        }
        if (listCreatePagesBeforeList.isEmpty()) {
            arrayListEmptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(listCalculatePagesOffsets.size());
            int size5 = listCalculatePagesOffsets.size();
            for (int i33 = i11; i33 < size5; i33++) {
                MeasuredPage measuredPage4 = listCalculatePagesOffsets.get(i33);
                if (measuredPage4.getIndex() < ((MeasuredPage) arrayDeque.first()).getIndex()) {
                    arrayList3.add(measuredPage4);
                }
            }
            arrayListEmptyList = arrayList3;
        }
        if (listCreatePagesAfterList.isEmpty()) {
            arrayListEmptyList2 = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList4 = new ArrayList(listCalculatePagesOffsets.size());
            int size6 = listCalculatePagesOffsets.size();
            for (int i34 = i11; i34 < size6; i34++) {
                MeasuredPage measuredPage5 = listCalculatePagesOffsets.get(i34);
                if (measuredPage5.getIndex() > ((MeasuredPage) arrayDeque.last()).getIndex()) {
                    arrayList4.add(measuredPage5);
                }
            }
            arrayListEmptyList2 = arrayList4;
        }
        MeasuredPage measuredPageCalculateNewCurrentPage = calculateNewCurrentPage(orientation3 == Orientation.Vertical ? iM6607constrainHeightK40F9xA : iM6608constrainWidthK40F9xA, arrayList, i4, i5, iCoerceAtLeast, snapPosition, i2);
        float fCoerceIn = iCoerceAtLeast == 0 ? 0.0f : RangesKt.coerceIn((snapPosition.position(i3, i9, i4, i5, measuredPageCalculateNewCurrentPage != null ? measuredPageCalculateNewCurrentPage.getIndex() : i11, i2) - (measuredPageCalculateNewCurrentPage != null ? measuredPageCalculateNewCurrentPage.getOffset() : i11)) / iCoerceAtLeast, -0.5f, 0.5f);
        MeasureResult measureResultInvoke = function3.invoke(Integer.valueOf(iM6608constrainWidthK40F9xA), Integer.valueOf(iM6607constrainHeightK40F9xA), new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.pager.PagerMeasureKt$measurePager$14
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
                List<MeasuredPage> list2 = listCalculatePagesOffsets;
                int size7 = list2.size();
                for (int i35 = 0; i35 < size7; i35++) {
                    list2.get(i35).place(placementScope);
                }
                ObservableScopeInvalidator.m1192attachToScopeimpl(mutableState);
            }
        });
        if (i22 >= i2 && i21 <= i3) {
            z3 = i11;
        }
        return new PagerMeasureResult(arrayList, i9, i6, i5, orientation3, i15, i20, z2, i10, measuredPage, measuredPageCalculateNewCurrentPage, fCoerceIn, i19, z3, snapPosition, measureResultInvoke, z4, arrayListEmptyList, arrayListEmptyList2, coroutineScope);
    }

    private static final List<MeasuredPage> createPagesAfterList(int i2, int i3, int i4, List<Integer> list, Function1<? super Integer, MeasuredPage> function1) {
        int iMin = Math.min(i4 + i2, i3 - 1);
        int i5 = i2 + 1;
        ArrayList arrayList = null;
        if (i5 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i5)));
                if (i5 == iMin) {
                    break;
                }
                i5++;
            }
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            int iIntValue = list.get(i6).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i3) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<MeasuredPage> createPagesBeforeList(int i2, int i3, List<Integer> list, Function1<? super Integer, MeasuredPage> function1) {
        int iMax = Math.max(0, i2 - i3);
        int i4 = i2 - 1;
        ArrayList arrayList = null;
        if (iMax <= i4) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i4)));
                if (i4 == iMax) {
                    break;
                }
                i4--;
            }
        }
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int iIntValue = list.get(i5).intValue();
            if (iIntValue < iMax) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getAndMeasure-SGf7dI0, reason: not valid java name */
    public static final MeasuredPage m1259getAndMeasureSGf7dI0(LazyLayoutMeasureScope lazyLayoutMeasureScope, int i2, long j2, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j3, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z2, int i3) {
        return new MeasuredPage(i2, i3, lazyLayoutMeasureScope.mo1189measure0kLqBqw(i2, j2), j3, pagerLazyLayoutItemProvider.getKey(i2), orientation, horizontal, vertical, layoutDirection, z2, null);
    }

    private static final List<MeasuredPage> calculatePagesOffsets(LazyLayoutMeasureScope lazyLayoutMeasureScope, List<MeasuredPage> list, List<MeasuredPage> list2, List<MeasuredPage> list3, int i2, int i3, int i4, int i5, int i6, Orientation orientation, boolean z2, Density density, int i7, int i8) {
        int i9 = i6;
        int i10 = i8 + i7;
        int i11 = orientation == Orientation.Vertical ? i3 : i2;
        boolean z3 = i4 < Math.min(i11, i5);
        if (z3 && i9 != 0) {
            throw new IllegalStateException(("non-zero pagesScrollOffset=" + i9).toString());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z3) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                throw new IllegalArgumentException("No extra pages".toString());
            }
            int size = list.size();
            int[] iArr = new int[size];
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = i8;
            }
            int[] iArr2 = new int[size];
            for (int i13 = 0; i13 < size; i13++) {
                iArr2[i13] = 0;
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM901spacedBy0680j_4 = Arrangement.Absolute.INSTANCE.m901spacedBy0680j_4(lazyLayoutMeasureScope.mo707toDpu2uoSUM(i7));
            if (orientation == Orientation.Vertical) {
                horizontalOrVerticalM901spacedBy0680j_4.arrange(density, i11, iArr, iArr2);
            } else {
                horizontalOrVerticalM901spacedBy0680j_4.arrange(density, i11, iArr, LayoutDirection.Ltr, iArr2);
            }
            IntRange indices = ArraysKt.getIndices(iArr2);
            if (z2) {
                indices = RangesKt.reversed(indices);
            }
            int first = indices.getFirst();
            int last = indices.getLast();
            int step = indices.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int size2 = iArr2[first];
                    MeasuredPage measuredPage = list.get(calculatePagesOffsets$reverseAware(first, z2, size));
                    if (z2) {
                        size2 = (i11 - size2) - measuredPage.getSize();
                    }
                    measuredPage.position(size2, i2, i3);
                    arrayList.add(measuredPage);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size();
            int i14 = i9;
            for (int i15 = 0; i15 < size3; i15++) {
                MeasuredPage measuredPage2 = list2.get(i15);
                i14 -= i10;
                measuredPage2.position(i14, i2, i3);
                arrayList.add(measuredPage2);
            }
            int size4 = list.size();
            for (int i16 = 0; i16 < size4; i16++) {
                MeasuredPage measuredPage3 = list.get(i16);
                measuredPage3.position(i9, i2, i3);
                arrayList.add(measuredPage3);
                i9 += i10;
            }
            int size5 = list3.size();
            for (int i17 = 0; i17 < size5; i17++) {
                MeasuredPage measuredPage4 = list3.get(i17);
                measuredPage4.position(i9, i2, i3);
                arrayList.add(measuredPage4);
                i9 += i10;
            }
        }
        return arrayList;
    }

    private static final MeasuredPage calculateNewCurrentPage(int i2, List<MeasuredPage> list, int i3, int i4, int i5, SnapPosition snapPosition, int i6) {
        MeasuredPage measuredPage;
        if (list.isEmpty()) {
            measuredPage = null;
        } else {
            measuredPage = list.get(0);
            MeasuredPage measuredPage2 = measuredPage;
            float f2 = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i2, i3, i4, i5, measuredPage2.getOffset(), measuredPage2.getIndex(), snapPosition, i6));
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i7 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    MeasuredPage measuredPage3 = list.get(i7);
                    MeasuredPage measuredPage4 = measuredPage3;
                    float f3 = -Math.abs(SnapPositionKt.calculateDistanceToDesiredSnapPosition(i2, i3, i4, i5, measuredPage4.getOffset(), measuredPage4.getIndex(), snapPosition, i6));
                    if (Float.compare(f2, f3) < 0) {
                        measuredPage = measuredPage3;
                        f2 = f3;
                    }
                    if (i7 == lastIndex) {
                        break;
                    }
                    i7++;
                }
            }
        }
        return measuredPage;
    }
}
