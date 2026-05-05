package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.unit.Density;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:305)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
/* JADX INFO: compiled from: LazyStaggeredGridMeasureResult.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яć\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.P\u0012*,\u0018w\u000ffx>8DkH6Ra3\u0017k\u00025,[:qKП]\u001a\u0014\"\u0011ѧVg}nRҙ\u0013C\u001d\f\u001eюr,Ws\u0001](\u000f:ԏw?IMw=?d|6\u001b :\">{\r\u0001(LP\u0010\rzKK\u0012,8@\u0007:Z\rS\u0007\"\u0012\u001c>(\u00014\\oNDHt]P/+\u0003oTTϋuܞ-M;E\u0005';v\"Ԁ*P;C\u0016=S1\tb_M\u0006Wqk\u0007x+5/as\u0006;h\u0004\"\u001bCO;]\u0003*j\fi`:/;SqTh\u000eV\u007f\u000b\u007f\u001bF\u001c\u000e4/X2;%~\b<?\u0005vaMh\u0002\rP\u0010~oE/%.C;=)wiai+^A\n\u0018%$3\u0003~!\ni<t%\u001fb\u000ei1\u007fWML\\\"q=\u001c\u0016\u0001f\u0010C\u001c0u\u0012?\u007f\u001fH/%emI'/\u0007\u001aHry\u0007\tn\u0005ki\u0001ZP&|3O*7*ʑHd\u0013\u000b\u0019[f\u0007)MJ\u001dMù\u0007[,jST!S\u0018~SvF\u0003M\f\u001cuAtRqn\u001a .߁`ۋ9Wk߄yT|4M]3!f\tZ_\u001c\\l(PVXl w*V|/iՌBۇ 8D3\u001f\u0002#nS0P[\u0015\t\u000el?ʄ\u0001Ձ7*\u000bǭ<v\u000f(^}A~u!a,+hXqۮU91([Kv^M;\u0015\u0006\f\u007fuo#܈X̡\u001a\u0002]ݨ8\u0018 d_Y]\u0015\u0015+7_RESP\u000be\u007fRh\u0604\u0007܃}\u001bCÜFi\u000e\u0019~[\u0001lP\u007fbHr\u0006l\u0010;\b\u0013\u001e\u05fbeL\u0003ò{V\u0011\u000eL|C\u0012gKf8+\u0015ȷ\"+\tǻ:~;aQ\\m%\u0006\u0015G\u0015\u0010_ɳs4\u0002ʬ'(z\u001c\u0012c4.}ei]`=\u000fՅe˽B.,З\u001bDN#\u0006?b\u000b:FA\u0003\u0012t~\u0012PM9AT֜\nՐ\u0011tn]@O}\u001f\u0005=m3\fC,\u001cڎG+\u0019\u07bdkisvY\u0007[\\\u001d&#{_\u0001hΩ?֕Z]j־H\byUDb\fq\u0013B!$b,ѧ\f\u0011Kҍ\u0002\b\u00169\u000e\u00060!%rZsi\u0018d֡zחZN\rݺ]b'l\u000fB_B,\u0003M13uܑX5kѢ\u0019U#M)\u0015 $tjCWd;+(\u0007H\u001bGmCwJL\u0003uoԹoo\u0012\u0002NQsÄ\u001bê=U)a|zlV&s\\o\u000f\u0012\u0015^Ƭ&/\u0007ғ\u0015\u0010BV\u001dXi^\u0001|z-z\\ߺ;I\"݅/F/U\u001aL4X)>\u001e5[O ݴ\u0016ր\u007f][Ȍ\u0016\n&p5%E3jp&f8oqƄ\u0018ޭ\u001ah\nƁ+R&U<kE\r\u0018D 6}\u0019\nď\u0015ɾXŕץ ?Ӳ/t\u000eBY=\u0011\fi?qB&\u001d\u0011~IV(\u0001\u0004Ƿ\u001fԷ+S6߾p\\@faA))\u000e'-,/8\u0018bW%}w?ӋmϪ_\u00133Ԛ\u0004,g\b>*n\u000e-R\u000e\u0004Xf~ה>ܑQB|\u000bbFPxЕ^s0gzץEB{\u0007Hd0ӫ8$"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YuN'\u001b\u0015fA\u0011nRG&\u0017\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YtJ?\u0017\u0015h%-oN\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "4ha@g\u001dBa\u001d{\u0002^\u0010\f\t7I\t'\u007f>\u0001%", "", "4ha@g\u001dBa\u001d{\u0002^\u0010\f\t7S}5\u0006G\b\u0001\u0018H}\u000eK\u0005", "1n]@h4>R\u0007|\bh3\u0004", "", ";dP@h9>@\u0019\r\u000be;", "1`] V9HZ _\u0005k>x\u0016.", "", "7rE2e;BQ\u0015\u0006", "@d\\2T:N`\u0019gz^+|\b", "Ak^Af", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Y{U5\u001c\u0013/", "AoP;C9Hd\u001d}zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016Y{Y'\u0016ofK5rC7,]", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "Bnc._\u0010MS!\rXh<\u0006\u0018", "", "Dhb6U3>7(~\u0003l\u0010\u0006\n9", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012iE|\u00120OCHk3 \"l`\u0003m_Abd6CNP,iRq\u001f!\u0016YuN'\u001b\u0015fA#RS7']", "DhTDc6Kb\u0007\u0003\u0010^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "DhTDc6Kb\u0007\u000evk;f\n0s\u007f7", "DhTDc6Kbx\byH-}\u0017/t", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", ";`X;4?Ba|\u000ezf\u001a\b\u0005-i\t*", "1na<h;B\\\u0019lxh7|", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "uZ8(<\r%O\"}\bh0{\u001cxc\n0\u0007J\u000f\u0017`WsWCr9?i\ri\u001fm\u0012<]P;X4,%op\u000f{X!5r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0006cQ-m@F#\u00125\u0013\t7}\u0015U$\u001d1lrBc\u0010F{\"y@rOBnsgV=Gd*q\f^~i>9\u0012\u001b{()>7*\u0013z`\u001bvQ\r1eQ!\u0006B2>7\\PUxT8\u0004+)TE~\u000eGl>9\u0004)\u00066*Cd\u0004Mt\u001c=(_\u0011Ap/6\"8>\u0013LKbWyB\rV*]\u0011xo?B\u001ddep\u001eu\u0003f\u0016h?e^\u0014\u0001P\u0010FTy#'\u0010\u000fF%\n\u001e\r\u0016mLeRQ\u001fc\u0015oT+'[\"~Lv' 5_$]\u001dw\u007fD\u001b1vlL\u001f\u0012\u0006hJ\u0019y[YkU\u007feg~(?x\u001f\u0013~=XF\u0007aGx\u0010\u00042\u000b\u0016~rZoL\t=\u0017.nBj@,d8\u001ag`+\u0015n\u0002z\u001f.-\u0012YOLh\u00015$\u000b\u001ef\f\u001fj&4\u000f9AV@e-", "5dc\u000eY;>`v\t\u0004m,\u0006\u0018\u001aa~'\u007fI\u0003", "u(8", "/kX4a4>\\(e~g,\u000b", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "5dc\u000e_0@\\!~\u0004m\u0013\u0001\u0012/s", "u(;7T=:\u001d)\u000e~eud\u0005:;", "5dc\u000fX-H`\u0019\\\u0005g;|\u0012>P{'zD\n\u0019", "1`] V9HZ [v\\2\u000f\u0005<d", "5dc\u0010T5,Q&\t\u0002e\tx\u00075w{5z", "u(I", "5dc\u0010T5,Q&\t\u0002e\r\u0007\u0016Aa\r'", "Adc\u0010T5,Q&\t\u0002e\r\u0007\u0016Aa\r'", "uY\u0018#", "5dc\u0010b5Lc!~yL*\n\u00136l", "u(5", "Adc\u0010b5Lc!~yL*\n\u00136l", "uE\u0018#", "5dc\u0010b9Hc(\u0003\u0004^\u001az\u0013:e", "u(;8b;EW\"\u0012D\\6\n\u0013?t\u00041{NJt!Ty\u001eKz.5G{*Bmk", "5dc\u0011X5LW(\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "5dc\u0013\\9Lb\n\u0003\tb)\u0004\t\u0013t\u007f0_I\u007f\u001b\u0015G}", "u(J\u0016", "5dc\u0013\\9Lb\n\u0003\tb)\u0004\t\u0013t\u007f0i>\u000e!\u001eNY\u000f=\u0005%Dg", "Adc\u0013\\9Lb\n\u0003\tb)\u0004\t\u0013t\u007f0i>\u000e!\u001eNY\u000f=\u0005%Dg", "uZ8uI", "6dX4[;", "5dc\u0015X0@V(", "5dc\u001aT0G/,\u0003\tB;|\u0011\u001dp{&\u007fI\u0003", "5dc\u001aX(Lc&~g^:\r\u0010>", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001dYy.Gz\u0016\u001bMQKrCs", "=qX2a;:b\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w7P?k=-\u0011weC\u00109", "5dc\u001ce0>\\(z\nb6\u0006", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~[}.F}#.[\r%x8\u001e\u001ew]H\u000bm5$", "5dc\u001fX4>O'\u000f\b^\u0015|\t.e~", "@t[2e:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c5<Y\u000b\u000e5w!.#", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc\u001fh3>`'", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "5dc _6Ma", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7$=IE=kA\u001e\u0014jn=\u0006-\u0013J\f;5[J.^R\u007f=\u0013sg\u0012M\u0019\u0014\u000fhOy", "5dc c(G>&\t\fb+|\u0016", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~`y5K7$=IE=kA\u001e\u0014jn=\u0006-\u0013J\f;5[J.^R\u007f=\u0013sg\u0012M\u0019\u0018\u0001b,1xU;\u001e\b9\u001f", "5dc!b;:Z|\u000ezf:Z\u0013?n\u000f", "5dc#\\,P^#\f\n>5{r0f\u000e(\u000b", "5dc#\\,P^#\f\nL0\u0012\tvY|<\u0004'M\u0019", "u(9", "\u0018", "5dc#\\,P^#\f\nL;x\u0016>O\u0001)\n@\u0010", "5dc#\\:BP ~^m,\u0005\u0017\u0013n\u00012", "u(;7T=:\u001d)\u000e~euc\r=tU", "EhSA[", "5dc$\\+MV", ">kP0X\nAW }\b^5", "Bqh!b\bI^ \u0013h\\9\u0007\u00106W\u00047~J\u0011&\u0004Gw\u000e8\u00055BY", "2d[AT", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyStaggeredGridMeasureResult implements LazyStaggeredGridLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final int beforeContentPadding;
    private boolean canScrollForward;
    private float consumedScroll;
    private final CoroutineScope coroutineScope;
    private final Density density;
    private final int[] firstVisibleItemIndices;
    private int[] firstVisibleItemScrollOffsets;
    private final boolean isVertical;
    private final int mainAxisItemSpacing;
    private final MeasureResult measureResult;
    private final Orientation orientation;
    private final boolean remeasureNeeded;
    private final LazyStaggeredGridSlots slots;
    private final LazyStaggeredGridSpanProvider spanProvider;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final long viewportSize;
    private final int viewportStartOffset;
    private final List<LazyStaggeredGridMeasuredItem> visibleItemsInfo;

    public /* synthetic */ LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f2, MeasureResult measureResult, boolean z2, boolean z3, boolean z4, LazyStaggeredGridSlots lazyStaggeredGridSlots, LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider, Density density, int i2, List list, long j2, int i3, int i4, int i5, int i6, int i7, CoroutineScope coroutineScope, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, iArr2, f2, measureResult, z2, z3, z4, lazyStaggeredGridSlots, lazyStaggeredGridSpanProvider, density, i2, list, j2, i3, i4, i5, i6, i7, coroutineScope);
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.measureResult.getAlignmentLines();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getHeight() {
        return this.measureResult.getHeight();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public Function1<RulerScope, Unit> getRulers() {
        return this.measureResult.getRulers();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public int getWidth() {
        return this.measureResult.getWidth();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.measureResult.placeChildren();
    }

    private LazyStaggeredGridMeasureResult(int[] iArr, int[] iArr2, float f2, MeasureResult measureResult, boolean z2, boolean z3, boolean z4, LazyStaggeredGridSlots lazyStaggeredGridSlots, LazyStaggeredGridSpanProvider lazyStaggeredGridSpanProvider, Density density, int i2, List<LazyStaggeredGridMeasuredItem> list, long j2, int i3, int i4, int i5, int i6, int i7, CoroutineScope coroutineScope) {
        this.firstVisibleItemIndices = iArr;
        this.firstVisibleItemScrollOffsets = iArr2;
        this.consumedScroll = f2;
        this.measureResult = measureResult;
        this.canScrollForward = z2;
        this.isVertical = z3;
        this.remeasureNeeded = z4;
        this.slots = lazyStaggeredGridSlots;
        this.spanProvider = lazyStaggeredGridSpanProvider;
        this.density = density;
        this.totalItemsCount = i2;
        this.visibleItemsInfo = list;
        this.viewportSize = j2;
        this.viewportStartOffset = i3;
        this.viewportEndOffset = i4;
        this.beforeContentPadding = i5;
        this.afterContentPadding = i6;
        this.mainAxisItemSpacing = i7;
        this.coroutineScope = coroutineScope;
        this.orientation = z3 ? Orientation.Vertical : Orientation.Horizontal;
    }

    public final int[] getFirstVisibleItemIndices() {
        return this.firstVisibleItemIndices;
    }

    public final int[] getFirstVisibleItemScrollOffsets() {
        return this.firstVisibleItemScrollOffsets;
    }

    public final void setFirstVisibleItemScrollOffsets(int[] iArr) {
        this.firstVisibleItemScrollOffsets = iArr;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    public final void setConsumedScroll(float f2) {
        this.consumedScroll = f2;
    }

    public final MeasureResult getMeasureResult() {
        return this.measureResult;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    public final void setCanScrollForward(boolean z2) {
        this.canScrollForward = z2;
    }

    public final boolean isVertical() {
        return this.isVertical;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    public final LazyStaggeredGridSlots getSlots() {
        return this.slots;
    }

    public final LazyStaggeredGridSpanProvider getSpanProvider() {
        return this.spanProvider;
    }

    public final Density getDensity() {
        return this.density;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public List<LazyStaggeredGridMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    /* JADX INFO: renamed from: getViewportSize-YbymL2g */
    public long mo1220getViewportSizeYbymL2g() {
        return this.viewportSize;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public final boolean getCanScrollBackward() {
        return this.firstVisibleItemIndices[0] != 0 || this.firstVisibleItemScrollOffsets[0] > 0;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridLayoutInfo
    public Orientation getOrientation() {
        return this.orientation;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean tryToApplyScrollWithoutRemeasure(int r10) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult.tryToApplyScrollWithoutRemeasure(int):boolean");
    }
}
