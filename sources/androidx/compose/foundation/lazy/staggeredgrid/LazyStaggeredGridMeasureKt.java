package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.graphics.GraphicsContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.truncatedMessage(InvalidProtocolBufferException.java:70)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readRawBytesSlowPath(CodedInputStream.java:1250)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readBytes(CodedInputStream.java:529)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:244)
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
/* JADX INFO: compiled from: LazyStaggeredGridMeasure.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĥ\u0014D߬)\u001ew\tL܀kt\u0012G\u000eֶ\u0013.P~*ܥ\u001aw\u001dfr9>PmH4S[*%k\u0004é,[:qK;k\u001a\u0006\"\u000fOVgu\rRZ!C\u0017\u0006,xr,OU\u0001](\u000f:BuB;M}LA`\u000b6\rړ:\"F\r\r\u0001 6P\u0010\rzKK\u0012\u001c8@\u0007:Z\rS\t\"\u0012\u001c>(\u0001$\\oNLHtҗB/9\u0003qĩV'u0\u0005M\u0013G\\'#vi\u001e1C?5+%[Έ\u000fRq?\u000b?wA\u001d}5)CI\"Zfb\u000e\u0018-1_\u000fmrTb3V'ϲ-C\u0003qRh\u000en\u007f\u001b}\u0013ɝ\u0012\u00166+V7E\u001a\u0015\u0012>H\u0003}kQ`\u0004nB.\u0005q8'%F;YEӸjQgH_\u05cf=߉\t\r,1\u0019?/jl\u0014p\u0017+T&b_ah=v`:iK\u0001\u001c|r\u0004:\u0004^X\u00101\f\u0011\\\u001aSC\fX15\u0004\u001dXUw\u00063aĈWsX]P(t,G,\u000f\u0012\u0001[t\u0007{P\u0003WZ\u001d} b\u001f\u0016\bA\u001f#ʀB9^\u001eggnyl]]86]v_Y\u001d}>gGxKAak gbx$?js3t\u0015]\u0004\u0010hy@\"`f\u001b\u0014\u0006\u001b\\N:\u0014x?ۇ 4:Q1w#i\u001b\u001epG%\u0015obx\u0016\u000fVC$1zR\u00117\u001c\u0017\\ʼsg\u0007kD\u0017nEEA\u007f8A&\u00044\u00198\u000bG\u001f~\"\u001ewkZldlDv\u001c{8K(_i/k\u0016/\u0001/Ʌ\u00105mR\u0003gaMX/)\r*\u0015Ah<\u000f j\u001f+\u0011zXwl#2xnri\u0010t\u0002\nat}uo\u001bޯaVc\u0001,q<|9%\u0005M0U\u0005}L\u00155[DW!$#,/Cb$i\bW\b\u000f'&#h,,\u0012C r_hJGHKi~l#4n\u0013Bvm&\u0014\tމ:ڸ2ǥыhr\\f[:G\bt7D\r\u001fW\u0004:A\u000eD4F\u00108%[}B_c'\u0017\u07bdao\u0016s[^\u001bJU\u00129\u0017a~ 'U,fYr\tv\u000e\u0004\u001aFAic3HOӚ:ʙ@\b\u0019ul}\u0014C\u0013\u007ft`7\u0017``$A\\\u000eb-tVv\u0006'Ѥx=86\u0017\u000fa\u001f!5_#\u001eJbe{2/\u0001c\tǾiʪǎj'1{bq3Rf:#E\f}q\u0002d\u0016w-{'\b\ff\u0019-!PT39\u007f/\u0010z>\u001c#U\u0013l\u0015z %jNP(E{\u0015ɧ;\u0018N#\u0019}-\u0018b[V~{E\u00042\u0001E\u0006Y\u0011\u001a?{L+/\u00165[>wzD+\n\u001bk;,LP$5I\r!\u000b\u001e>j\u0018%3:D:Ff\u0010R+PN\u0003^N\u0003=\".65\u007f\u0006AM+^\b8(%NtCl4C{l\u0007X{l\u0012o\u0006\u000f\u00116IV(o]T+Y?M\\\u0014\t^Hbk \u0007c0\u0018#y7667o\u000f͏b֬ӗoQab9\u0006\u0004<o\tHRL\u0001Gy$\"ZX6mSV{?+\tt\fP1&^\u0019F\rt:GD\r\rSv\u001d#6VrLe?9)\u001f\n\u000eulMʚKi2/ܐj?I6\tЦBĬz\u0011\u000b̌\u0003\u0001\u000e*Z\t!\u0001>ƫ\u007fĘX=\"śڕ$rl\u0006,ɶafAݳ0k"}, d2 = {"\u0012dQBZ\u0013HU\u001b\u0003\u0004`\f\u0006\u0005,l\u007f'", "", "#mb2g", "", "2dQBZ\u0013HU", "", ";db@T.>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "Ehc57,;c\u001be\u0005`.\u0001\u00121", "\"", "Ab^=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,JP|H\u0014g", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]^'CZ^9\\@pG\u001f\u00120tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003`K\u0005\u0010mBj[CN=NdsN\td\u001dZI\u0010", "1`[0h3:b\u0019^\u000em9xl>e\b6", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YuN'\u001b\u0015fA#RS7']", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YuN'\u001b\u0015fA\u0002xMF\u001f\u001b;\u001f", ">nb6g0H\\", "4h[AX9", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "7sT:<5=S,", "0dU<e,/W'\u0003we,Y\u0013?n~6", "1`[0h3:b\u0019o~l0y\u0010/I\u000f(\u0004N", ";dP@h9>R|\u000ezf:", "", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[N\u000eH\u0007%\u000b", "7sT:F*K] \u0006d_-\u000b\t>s", "", ";`X;4?Ba\u007fz\u000fh<\fv3z\u007f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001{%*OE;x4\u001d\u0017ue8PJ(c\u000b\u0015VHP.\\_r<u\u001f^\r6+\t\u0013iN$LN@.\b?XW1O\u0007\u0016%\u00159s:@`\u0017Ny\u0013\u0005E3qT#;\u0007T=YA*p\u001c_rR\u001e\u001egzv\u0015,d\u001a>\u0019\u007fZZYV\bv=", "2dQBZ\u0019>\\\u0018~\b", "uZ;8b;EW\"Hxh3\u0004\t-t\u00042\u0005NJr$Tk\"\u001bv1EYSc\u001er\u0012?I\rBg= ^VpF\u000bl.$", "3mbBe,\"\\\u0018\u0003x^:`\u0012\u001ca\t*{", "7mS6V,L", "7sT:66N\\(", "4`bA96K3\u0015|}", "@de2e:>", "/bc6b5", "4h]1C9>d\u001d\t\u000bl\u0010\f\t7I\t'{S", "7sT:", ":`]2", "4na\u0012T*A", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003tn(Wc#PNN\u0002", "4na\u0012T*A\u001b\"bh.8\\[", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIuz^", "7mS2k\u0016?;\u0015\u0012kZ3\r\t", "7mS2k\u0016?;\u001d\bWr", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q'\u0007!&Ns\u0017\u0006{6=#~0@k%2WLI5\u0015.\u001efp=\u0011lw$:\u000b", "7mS2k\u0016?;\u001d\bkZ3\r\t", ";h]\u000fb<GR", ";`g\u0016a\u0019:\\\u001b~", "7mS2k\u0019:\\\u001b~", ";`g\u0016a\u0019:\\\u001b~Bc@Mg\u001dck", "uZ8\u0017\u001c\u0010", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YuN'\u001b\u0015fA\u0011nRG&\u0017\u0002", "7mXA\\(EA\u0017\f\u0005e3[\t6t{", "7mXA\\(E7(~\u0003B5{\r-e\u000e", "7mXA\\(E7(~\u0003H-}\u0017/t\u000e", "1`]\u001fX:MO&\u000eb^(\u000b\u0019<e", ";dP@h9>A(z|`,\n\t.G\r,z", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Y{]'\u001c\u0005/", ">h];X+\"b\u0019\u0007\t", "7sT:C9Hd\u001d}zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Yq]+\u0015ofK5rC7,]", "@db<_=>R\u0007\u0006\u0005m:", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Y{U5\u001c\u0013/", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "7rE2e;BQ\u0015\u0006", "@de2e:>:\u0015\u0013\u0005n;", "1n]AX5M=\u001a\u007f\t^;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", ";`X;4?Bat\u0010vb3x\u00066em,\u0011@", ";`X;4?Ba\u0007\nv\\0\u0006\u000b", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "5qP=[0<av\t\u0004m,\u0010\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<+MDz41$>", ";dP@h9>A(z|`,\n\t.G\r,z\bs&|\u001am\u0002(", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]^'CZ^9\\@pG\u001f\u00120tJ4\f\u0012cE#\u0002\u000e5)\u00107S\u0010;2\u0002\u0016&\u00174f\u007fF`\u0019\u0011\u0001\u0011\u000bUrvUUa{GNEa,q\u0010^fC6O8\u0002\u0001\u0015\u001djP;\nz5\u001evQgvcV\u0019P\u001f):~W\u0010U~YC>\u000e#Y\u000bMx.as8~1\u0003Gs4n\rVq&>(y\u001f<e@#5:F\u001c\tR_\u000b\u0001\b\u001cw\u001bc\n\u000eo50\u001brib\u0012u\u0003r+ID]a\u00037_\u0006=+|\u0019&*\u000eBcd\"\u0013\u0018(leV\u0019\u0002P\n\u0019}N&^$L\u0001p '8$=#\u0010r:h6I\"\rrAU\u0003UX):V\u001fiMt[do#8\u0006\u0015Hj\u001aGQ\u000b@Rk\u0012\u00184\u000e\u000b}~\u0001mAg=\u001d43\u0013>-WE\u0013nK7\t\u001fqG##6DKPJ{h\b6\u0019\u0007\u000evFrgKB\u0012BERj\u0010:mV\u0005\u0012AN\u0019+Z\u001f3_\b_@e{@T|\u000eI\u0014/B\u0015)(1xK\u001dud\u0011s\b\u0017\rs\u001b=x\u000ba]\u0016`\"D\f/\u0016\u0007Z<\u000f\u0014!Y2\u0013V\t4MHN\u0012w)C\u0011|P\u00156b@Cj6\u00105jO!\u0002\nR\u0007,E\u001a]#}v65+ve\u0010\u001bpXA\u0016[;\u0014\u001a-\u001e\u007f=Eqy\u0013adv\u0001:&\u0003HD", "=eU@X;\u001bg", "2d[AT", "BqP;f-H`!", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;
    private static final int Unset = Integer.MIN_VALUE;

    private static final void debugLog(Function0<String> function0) {
    }

    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, Function1<? super LazyLayoutMeasureScope, ? extends T> function1) {
        return function1.invoke(lazyLayoutMeasureScope);
    }

    private static final String debugRender(ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr) {
        return "";
    }

    /* JADX INFO: renamed from: measureStaggeredGrid-XtK8cYQ, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m1229measureStaggeredGridXtK8cYQ(LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j2, boolean z2, boolean z3, long j3, int i2, int i3, int i4, int i5, CoroutineScope coroutineScope, GraphicsContext graphicsContext) {
        int iM1228maxInRangejy6DScQ;
        int i6;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j2, z2, lazyLayoutMeasureScope, i2, j3, i4, i5, z3, i3, coroutineScope, graphicsContext, null);
        int[] iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition$foundation_release().getIndices());
        int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition$foundation_release().getScrollOffsets();
        if (iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr = new int[laneCount];
            int i7 = 0;
            while (i7 < laneCount) {
                if (i7 >= iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (iM1228maxInRangejy6DScQ = iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release[i7]) == -1) {
                    iM1228maxInRangejy6DScQ = i7 == 0 ? 0 : m1228maxInRangejy6DScQ(iArr, SpanRange.m1239constructorimpl(0, i7)) + 1;
                }
                iArr[i7] = iM1228maxInRangejy6DScQ;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i7], i7);
                i7++;
            }
            iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = iArr;
        }
        if (scrollOffsets.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr2 = new int[laneCount2];
            int i8 = 0;
            while (i8 < laneCount2) {
                if (i8 < scrollOffsets.length) {
                    i6 = scrollOffsets[i8];
                } else {
                    i6 = i8 == 0 ? 0 : iArr2[i8 - 1];
                }
                iArr2[i8] = i6;
                i8++;
            }
            scrollOffsets = iArr2;
        }
        return measure(lazyStaggeredGridMeasureContext, Math.round(lazyStaggeredGridState.getScrollToBeConsumed$foundation_release()), iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release, scrollOffsets, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0325, code lost:
    
        if (r11 < r17) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0380, code lost:
    
        r2 = r47.m1224getSpanRangelOCCd4c(r47.getItemProvider(), r11, r4);
        r12 = r47.getLaneInfo();
        r10 = (int) (r2 & 4294967295L);
        r13 = (int) (r2 >> 32);
        r5 = r10 - r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03a1, code lost:
    
        if (r5 == 1) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03a3, code lost:
    
        r4 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03a4, code lost:
    
        r12.setLane(r11, r4);
        r4 = r47.getMeasuredItemProvider().m1233getAndMeasurejy6DScQ(r11, r2);
        r12 = m1228maxInRangejy6DScQ(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03b6, code lost:
    
        if (r5 == 1) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03b8, code lost:
    
        r5 = r47.getLaneInfo().getGaps(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03c0, code lost:
    
        if (r5 != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03c2, code lost:
    
        r5 = new int[r47.getLaneCount()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03c8, code lost:
    
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03c9, code lost:
    
        if (r3 >= r10) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03cb, code lost:
    
        if (r5 == null) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03cd, code lost:
    
        r5[r3] = r12 - r1[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03d3, code lost:
    
        r6[r3] = r11;
        r1[r3] = r4.getMainAxisSizeWithSpacings() + r12;
        r7[r3].addLast(r4);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03e5, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03e7, code lost:
    
        r4 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03e9, code lost:
    
        r47.getLaneInfo().setGaps(r11, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x03f0, code lost:
    
        if (r12 >= r9) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03f4, code lost:
    
        if (r1[r13] > r9) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03f6, code lost:
    
        r4.setVisible(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x045a, code lost:
    
        r3 = indexOfMinValue$default(r0, 0, 1, null);
        r5 = indexOfMaxValue(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0465, code lost:
    
        if (r3 == r5) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x046b, code lost:
    
        if (r0[r3] != r0[r5]) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x046d, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x046e, code lost:
    
        r4 = r8[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0471, code lost:
    
        if (r4 != (-1)) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0473, code lost:
    
        r4 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0475, code lost:
    
        r10 = findPreviousItemIndex(r47, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x047b, code lost:
    
        if (r10 >= 0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x047d, code lost:
    
        if (r15 != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0485, code lost:
    
        if (measure$lambda$41$misalignedStart(r8, r47, r0, r3) == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0487, code lost:
    
        if (r51 == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0489, code lost:
    
        r47.getLaneInfo().reset();
        r4 = r8.length;
        r6 = new int[r4];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0494, code lost:
    
        if (r2 >= r4) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0496, code lost:
    
        r6[r2] = -1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x049c, code lost:
    
        r2 = r47.m1224getSpanRangelOCCd4c(r47.getItemProvider(), r10, r3);
        r12 = r47.getLaneInfo();
        r9 = (int) ((-1) - (((-1) - r2) | ((-1) - 4294967295L)));
        r13 = (int) (r2 >> 32);
        r4 = r9 - r13;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x04c4, code lost:
    
        if (r4 == 1) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x04c6, code lost:
    
        if (r5 == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x04c8, code lost:
    
        r5 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x04c9, code lost:
    
        r12.setLane(r10, r5);
        r5 = r47.getMeasuredItemProvider().m1233getAndMeasurejy6DScQ(r10, r2);
        r3 = m1228maxInRangejy6DScQ(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04db, code lost:
    
        if (r4 == 1) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x04dd, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x04de, code lost:
    
        if (r2 == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x04e0, code lost:
    
        r12 = r47.getLaneInfo().getGaps(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x04e8, code lost:
    
        if (r13 >= r9) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x04ec, code lost:
    
        if (r0[r13] == r3) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x04ee, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x04ef, code lost:
    
        r7[r13].addFirst(r5);
        r8[r13] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x04f6, code lost:
    
        if (r12 != null) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x04f8, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x04f9, code lost:
    
        r0[r13] = (r5.getMainAxisSizeWithSpacings() + r3) + r4;
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0504, code lost:
    
        r4 = r12[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0507, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0509, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x050b, code lost:
    
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x050d, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0511, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x051b, code lost:
    
        r5 = r0.length;
        r4 = new int[r5];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x051f, code lost:
    
        if (r2 >= r5) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0521, code lost:
    
        r4[r2] = r0[r3];
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0531, code lost:
    
        return measure(r47, r27, r6, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0317, code lost:
    
        r3 = 1;
        r4 = indexOfMinValue$default(r1, 0, 1, null);
        r11 = kotlin.collections.ArraysKt.maxOrThrow(r6) + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06e8 A[EDGE_INSN: B:290:0x06e8->B:291:0x06e9 BREAK  A[LOOP:21: B:306:0x072e->B:312:0x0738]] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0878  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult measure(final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r47, int r48, int[] r49, int[] r50, boolean r51) {
        /*
            Method dump skipped, instruction units count: 2287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int[], int[], boolean):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }

    private static final boolean measure$lambda$41$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (iArr2[i2] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i3 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$41$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i2) {
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i3], i3) == -1 && iArr2[i3] != iArr2[i2]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i4 = 0; i4 < length2; i4++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i4], i4) != -1 && iArr2[i4] >= iArr2[i2]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateVisibleItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr, int[] iArr, int i2) {
        int size = 0;
        for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque : arrayDequeArr) {
            size += arrayDeque.size();
        }
        ArrayList arrayList = new ArrayList(size);
        while (true) {
            for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque2 : arrayDequeArr) {
                if (!arrayDeque2.isEmpty()) {
                    int length = arrayDequeArr.length;
                    int i3 = -1;
                    int i4 = Integer.MAX_VALUE;
                    for (int i5 = 0; i5 < length; i5++) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemFirstOrNull = arrayDequeArr[i5].firstOrNull();
                        int index = lazyStaggeredGridMeasuredItemFirstOrNull != null ? lazyStaggeredGridMeasuredItemFirstOrNull.getIndex() : Integer.MAX_VALUE;
                        if (i4 > index) {
                            i3 = i5;
                            i4 = index;
                        }
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemRemoveFirst = arrayDequeArr[i3].removeFirst();
                    if (lazyStaggeredGridMeasuredItemRemoveFirst.getLane() == i3) {
                        long jM1239constructorimpl = SpanRange.m1239constructorimpl(lazyStaggeredGridMeasuredItemRemoveFirst.getLane(), lazyStaggeredGridMeasuredItemRemoveFirst.getSpan());
                        int iM1228maxInRangejy6DScQ = m1228maxInRangejy6DScQ(iArr, jM1239constructorimpl);
                        lazyStaggeredGridMeasuredItemRemoveFirst.position(iM1228maxInRangejy6DScQ, lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i3], i2);
                        arrayList.add(lazyStaggeredGridMeasuredItemRemoveFirst);
                        int i6 = (int) ((jM1239constructorimpl + 4294967295L) - (jM1239constructorimpl | 4294967295L));
                        for (int i7 = (int) (jM1239constructorimpl >> 32); i7 < i6; i7++) {
                            iArr[i7] = lazyStaggeredGridMeasuredItemRemoveFirst.getMainAxisSizeWithSpacings() + iM1228maxInRangejy6DScQ;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, Function1<? super LazyStaggeredGridMeasuredItem, Unit> function1, Function1<? super Integer, Boolean> function12, boolean z2) {
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        ArrayList arrayList = null;
        if (z2) {
            int size = pinnedItems.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = size - 1;
                    int iIntValue = pinnedItems.get(size).intValue();
                    if (function12.invoke(Integer.valueOf(iIntValue)).booleanValue()) {
                        long jM1224getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m1224getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM1233getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1233getAndMeasurejy6DScQ(iIntValue, jM1224getSpanRangelOCCd4c);
                        function1.invoke(lazyStaggeredGridMeasuredItemM1233getAndMeasurejy6DScQ);
                        arrayList.add(lazyStaggeredGridMeasuredItemM1233getAndMeasurejy6DScQ);
                    }
                    if (i2 < 0) {
                        break;
                    }
                    size = i2;
                }
            }
        } else {
            int size2 = pinnedItems.size();
            for (int i3 = 0; i3 < size2; i3++) {
                int iIntValue2 = pinnedItems.get(i3).intValue();
                if (function12.invoke(Integer.valueOf(iIntValue2)).booleanValue()) {
                    long jM1224getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m1224getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue2, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM1233getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m1233getAndMeasurejy6DScQ(iIntValue2, jM1224getSpanRangelOCCd4c2);
                    function1.invoke(lazyStaggeredGridMeasuredItemM1233getAndMeasurejy6DScQ2);
                    arrayList.add(lazyStaggeredGridMeasuredItemM1233getAndMeasurejy6DScQ2);
                }
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    /* JADX INFO: renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m1227forEachnIS5qE8(long j2, Function1<? super Integer, Unit> function1) {
        int i2 = (int) ((j2 + 4294967295L) - (j2 | 4294967295L));
        for (int i3 = (int) (j2 >> 32); i3 < i2; i3++) {
            function1.invoke(Integer.valueOf(i3));
        }
    }

    private static final void offsetBy(int[] iArr, int i2) {
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = iArr[i3] + i2;
        }
    }

    /* JADX INFO: renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m1228maxInRangejy6DScQ(int[] iArr, long j2) {
        int i2 = (int) ((j2 + 4294967295L) - (j2 | 4294967295L));
        int iMax = Integer.MIN_VALUE;
        for (int i3 = (int) (j2 >> 32); i3 < i2; i3++) {
            iMax = Math.max(iMax, iArr[i3]);
        }
        return iMax;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 + 1) - (i3 | 1) != 0) {
            i2 = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i2);
    }

    public static final int indexOfMinValue(int[] iArr, int i2) {
        int length = iArr.length;
        int i3 = -1;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i2 + 1;
            int i7 = iArr[i5];
            if (i6 <= i7 && i7 < i4) {
                i3 = i5;
                i4 = i7;
            }
        }
        return i3;
    }

    private static final <T> int indexOfMinBy(T[] tArr, Function1<? super T, Integer> function1) {
        int length = tArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int iIntValue = function1.invoke(tArr[i4]).intValue();
            if (i3 > iIntValue) {
                i2 = i4;
                i3 = iIntValue;
            }
        }
        return i2;
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i3 < i5) {
                i2 = i4;
                i3 = i5;
            }
        }
        return i2;
    }

    private static final int[] transform(int[] iArr, Function1<? super Integer, Integer> function1) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = function1.invoke(Integer.valueOf(iArr[i2])).intValue();
        }
        return iArr;
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i2) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = length - 1;
            while (true) {
                if (iArr[length] < i2 && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i3 < 0) {
                return;
            } else {
                length = i3;
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i2, int i3) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i2, i3);
    }

    private static final <T> void fastForEach(List<? extends T> list, boolean z2, Function1<? super T, Unit> function1) {
        if (z2) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i2 = size - 1;
                function1.invoke(list.get(size));
                if (i2 >= 0) {
                    size = i2;
                } else {
                    return;
                }
            }
        } else {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                function1.invoke(list.get(i3));
            }
        }
    }

    static /* synthetic */ void fastForEach$default(List list, boolean z2, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = false;
        }
        if (z2) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            while (true) {
                int i3 = size - 1;
                function1.invoke(list.get(size));
                if (i3 >= 0) {
                    size = i3;
                } else {
                    return;
                }
            }
        } else {
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                function1.invoke(list.get(i4));
            }
        }
    }
}
