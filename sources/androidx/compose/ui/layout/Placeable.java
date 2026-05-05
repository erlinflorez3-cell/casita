package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.MotionReferencePlacementDelegate;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: Placeable.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯT\u001d<K!&i\u0016DLcz\u0004I\u0006F\u000b6B\u0005$4\u0012\u0006\rnj?4Le^.ZS0\u0013s{J$c$wGCU(}*\tUOog|ObŏK\u000f\u001c\u0016\u0001jBI]xs\u0012\u00172HpG3coE9fu<*6݅R8(\u00049\u0019T\t\u0013ͯ~CY\fZ6N\fRR;iK\u001aZAL=\u0019\u001e\u000b\u0004~:V\u000bu:]%3mPm?_^\u001d}$Tu? \u0007c.+nZE\u00175S1#hZm%ӭu=\u000b\rmIɛH֕ɱ:Z\u00069#Q\u00185k\u0010>\\3m\u0011\u00105IgcyR>,\u0006\u001a\u0014\rj$>\n5oF-H\u000fN \u008fsɁՂDR\b\u0004P)K\u0006D\u001a=\u007fa-i\u001ftRy;GPu<[ځ*ƹ\u007f͙ƈZS\u05f8d\u001d#T\u0006WISFAVSZuKu\u001cp\u0011\tZ\b>H\u0018/*\u0018lW{ڢgޠ''sȵ`Fm\u007f\u0013j9ew]`@PuL\f\u0001µ\u000eʑHh\u001dmV`f6aw*c\u001f}6!P`\u0006I9%>\\\u000e+@ҙYУ\tɘĽe6֍ry\u0016WGdK7Ws\u001efrx\u001aPJtUjtUk\f\tc^v\tʢlݻ{\u007f\\P\u0012'@IBFBBI\u0019\u000b*x\u0007,OY|7t\u0019+fм`ו#Ѱɦ#s֊\u0005^dp}m\u0011K2\u0014n'MCWM'8&>vM\u0015#5\u0006$\u0004UhdGzsT6,ݯ,ک\u001e?YǽU\u0015\u0015\u00197<ċ-NTuk˚i@&\u0003|\u007f.¹lY"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7lk", "u(E", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "/o_.e,Gb\b\tg^(\u0004r0f\u000e(\u000b", "5dc\u000ec7:`\u0019\b\nM6i\t+li)|N\u0001&^PY\f:>!3", "u(9", "\u0018", "", "6dX4[;", "5dc\u0015X0@V(", "u(8", ";dP@h9>R{~~`/\f", "5dc\u001aX(Lc&~yA,\u0001\u000b2t", "D`[BX", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", ";dP@h9>R\u0007\u0003\u0010^", "5dc\u001aX(Lc&~yL0\u0012\tvY|<\u0004'M\u0019", "Adc\u001aX(Lc&~yL0\u0012\tvo\u00150\u00115kz", "uI\u0018#", ";dP@h9>R\u000b\u0003ym/", "5dc\u001aX(Lc&~yP0{\u00182", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>[\u0019\b\n<6\u0006\u0017>r{,\u0005O\u000f", "5dc\u001aX(Lc&~\u0003^5\ff9n\u000e7\t<\u0005 &U7\u0016JV\n18\u0004", "Adc\u001aX(Lc&~\u0003^5\ff9n\u000e7\t<\u0005 &U7j)e2IcH", "EhSA[", "5dc$\\+MV", "=m<2T:N`\u0019}hbA|f2a\t*{?", "", ">kP0X\bM", ">nb6g0H\\", "HH]1X?", "", ":`h2e\tE]\u0017\u0005", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<4?OkA\f\u0013rl9\\", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ">kP0X\bM\u001b\u001aQ\u000eO\u000e\u0006\u0013", "uI5\u0019^6MZ\u001d\bDc=\u0005R0u\t&\u000bD\u000b %\u0011P\u001eEt49c\u0007k\r1\u0007", ":`h2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "uI5\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`I|\nGy)3gG'3\u0002\u0016;\u0017%Hg?!\u0019fo \u0003w,[Lj8", "\u001ekP0X4>\\(lxh7|", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private int width;
    private long measuredSize = IntSizeKt.IntSize(0, 0);
    private long measurementConstraints = PlaceableKt.DefaultConstraints;
    private long apparentToRealOffset = IntOffset.Companion.m6776getZeronOccac();

    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public abstract void mo5515placeAtf8xVGno(long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1);

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return IntSize.m6808getWidthimpl(this.measuredSize);
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return IntSize.m6807getHeightimpl(this.measuredSize);
    }

    /* JADX INFO: renamed from: getMeasuredSize-YbymL2g */
    protected final long m5573getMeasuredSizeYbymL2g() {
        return this.measuredSize;
    }

    /* JADX INFO: renamed from: setMeasuredSize-ozmzZPI */
    protected final void m5576setMeasuredSizeozmzZPI(long j2) {
        if (IntSize.m6806equalsimpl0(this.measuredSize, j2)) {
            return;
        }
        this.measuredSize = j2;
        onMeasuredSizeChanged();
    }

    private final void onMeasuredSizeChanged() {
        this.width = RangesKt.coerceIn(IntSize.m6808getWidthimpl(this.measuredSize), Constraints.m6593getMinWidthimpl(this.measurementConstraints), Constraints.m6591getMaxWidthimpl(this.measurementConstraints));
        this.height = RangesKt.coerceIn(IntSize.m6807getHeightimpl(this.measuredSize), Constraints.m6592getMinHeightimpl(this.measurementConstraints), Constraints.m6590getMaxHeightimpl(this.measurementConstraints));
        this.apparentToRealOffset = IntOffsetKt.IntOffset((this.width - IntSize.m6808getWidthimpl(this.measuredSize)) / 2, (this.height - IntSize.m6807getHeightimpl(this.measuredSize)) / 2);
    }

    /* JADX INFO: renamed from: placeAt-f8xVGno */
    public void mo5575placeAtf8xVGno(long j2, float f2, GraphicsLayer graphicsLayer) {
        mo5515placeAtf8xVGno(j2, f2, (Function1<? super GraphicsLayerScope, Unit>) null);
    }

    /* JADX INFO: renamed from: getMeasurementConstraints-msEJaDk */
    protected final long m5574getMeasurementConstraintsmsEJaDk() {
        return this.measurementConstraints;
    }

    /* JADX INFO: renamed from: setMeasurementConstraints-BRTryo0 */
    public final void m5577setMeasurementConstraintsBRTryo0(long j2) {
        if (Constraints.m6584equalsimpl0(this.measurementConstraints, j2)) {
            return;
        }
        this.measurementConstraints = j2;
        onMeasuredSizeChanged();
    }

    /* JADX INFO: renamed from: getApparentToRealOffset-nOcc-ac */
    protected final long m5572getApparentToRealOffsetnOccac() {
        return this.apparentToRealOffset;
    }

    /* JADX INFO: compiled from: Placeable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яh\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0010nʑA0ZeP.XT2\u000fy\u0002<$a%yCIU\"Ԃ*\teNog\u0005JbŏK\u000f\u0014\u001b\u0001jBI]xc\u0012\u00172XoG3SoE9vt>\u0005&7*8\u0010\u0005\t\u001a0I\u0018v\u0011CS\f\u00189F\u0016Pĥ=M3\u0019R\ţ$\u0001,\\0kDW\u0005]h?S\u0018wSf8o2\rM;Ͽd)\u001dv\u0010.YR˝9\u0015+fK\u0019`oW\u0003m\u0007e\u0005\u0017=W/W\u000bo6\u0007\u0015Z)sY\u001bu\u000b&\u000b\u0015y`:@qO,o^(@w)\f5<2'6+VIE\u001a\u0015$>9zra]h\u0002\rWʎyʨي\u001b'\u0006Q9Xc\t_{S\u0019|G$\u0005;7S\u0005|AsT<lE\u001fb\u0019i1\u007fLmNT\ngZ\u0006\u0004\u001fwJl\u0012R_\u007f]\f9.E>g_G>9k0dtk\u0005\"xh\u0002~\u0003aF(|9O=\u0019\u000ejD\u0013){RdXZ!c\u001b\u0003\u0019ą\f\u0013&o>˔'ڰ\u000fʚћlkprk0m\\tYqn\u001a\u001e\u007f9\rLeUq+yR%0o@p\"pfph<^jO:2v\u0013Vǯ\u0002ϢMۼƱ6AwABUy[j?`\u0003LRi|7x\u000bl\u001e\u001al3R\u001f\u001a(\u0003&\u0019P\u000b\u0006 \u0001~O: x5=Ca5GJe$x4+3\u001d}\"\u0012ěkLM_3ֶ{˖z\u008dک\u001e;WZK9W,7\\\u001a-s\\\u001be\u007ffB+\t\u0018\u0012\u000fi\u0005^k\u0016\b\t,\u000f\u007fzSb>:v\r\u001biΩjҹxӓâ~Ii\u007f\u0019\u0005\u0007m\u0001/q<|H%\u0005M7U\u0005}=\u00155[_W#\u001cw\"L-a\f~ݩ-Ӡˏ\u0013(z\u0013\u0012K,8}\u000fi]`K`I\b\u0018n&2\r\u001bBvv(\fP*L\raTqjvVFj#/,{OX\u001b\u001fn[h#\u0018}bG\u0010.\u0002^\u0016\u0014\r_U\u0015[z\u007fm\u001cs\r\u0011P\u000f\u0018(\u00141\u001d'Ћ<ղݫ[d\u000f_\u0014$`uOiz\u0005j\u0019L4ZU8\u000fQo\u0002\u0006>\u00170Le\u000f%OZsik>k~\\dk\u001dqUb1*/#\u001f5.xcA3\u007fܑX/iEޥR߹͢\u001flU.tKsnbg3(\u0007\u00113E\f\\y\u0006D$_)\u001cw \u0010F9\u0015\u001dp$K=_8wv^\u0007;[jNr\u0014*f\u0001cjf\r)\u0015\u000ej\u001a7\u000bGh#spMdN&Cs\u001e\u000f8\\)5\u0018-iL\u001b;#M-k^\u001b+-{evS\u000f\u0018\"0'2\u00191^g\u000e\u0015\u001a\f-Ɛ\u001aq\u001cuJ5!\u00028\u0004\\Z\u001dr8G8:]\u001dK\u0002Az\no\u0006HX'Y\u00156HQh\u0007'{l\u0012\u0004Т\nӆЂ5X\u007f!;\u0001eH5~F\u0013\u0007jb\u0011\u00029\t\u0015\u000e/-&MR8h/\u0010]\u0001\u0001p\u001ad\f$1/yMyB@T.}M\u001e\u0006\u0006:TV%ih؉Bd\u000foإAĠеbl.\u0017\u00032q>\u000b0`^?#\\F!7\u00153E97[;S\u0011\u000b\u0012fa&O=\u0003C)^J\u000b\u001eP'\u0017\t:p\u0012\u0018*p\u001e;=u]EF\u0003MB'\b=\u001eh\u0011FcEfN80\u001f/)/\tDPDb\u001a*Xi3o.A\u0018\u001b8\u0014\u0013\u001f*ElaSSN\u0011~\u0011\rm\n_}Âw7x6\u007f#}\u001cohQ$cg\u0003{b֢gڧ\u0003Q{X\u0015d:M\u0006Q,~m@.\u0010u߾0Թy#\bӚ\u0002X8ft@\u0005{.Ǎ(ń:r\\%Mu\u0007}Z<w#\fd\nm\u000bц|\u008f\u001dHV,3y\u0015Sރh~\u0013G\u0013ӗ0e\u000eґ-f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "", "u(E", "1n^?W0GO(~\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "5dc\u0010b6KR\u001d\bvm,\u000b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000f", ";nc6b5\u001f`\u0015\u0007zH-i\t0e\r(\u0005>\u0001\u0002\u001eCm\u000eDv.D", "", ">`a2a;%O-\t\u000bm\u000b\u0001\u0016/c\u000f,\u0006I", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u001dT9>\\(evr6\r\u0018\u000ei\r(yO\u0005! ", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", ">`a2a;0W\u0018\u000e}", "", "5dc\u001dT9>\\(p~];\u007f", "u(8", "Ehc5@6MW#\b[k(\u0005\t\u0019fl(|@\u000e\u0017 EoxCr#5a})F", "", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "1ta?X5M", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c5<Y\u000bu", "2dU.h3MD\u0015\u0006\u000b^", "6`]1_,&](\u0003\u0005g\r\n\u00057ei)h@\u0002\u0017$Gx\f<a,1W}(7v%", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", ">kP0X", ">nb6g0H\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "HH]1X?", ">kP0Xs\u0010\u001e(\u000b{.v", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0010<U{ 3j\u001d.#(\u001c/%", "F", "G", ">kP0X\bI^\u0015\fzg;k\u0013\u001ce{/eA\u0002%\u0017V", ":`h2e\tE]\u0017\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<4?OkA\f\u0013rl9\\", ">kP0X\bI^\u0015\fzg;k\u0013\u001ce{/eA\u0002%\u0017V7\n.>x|ke^Gq\u0010;MJ;gB\u001e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0010<U{ 3j\u001d.#(\u001cR:($oeBPh=V@(WUL;`\\{K]rj\u0017L:\u0011\u000fb\ry25", ":`h2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0010<U{ 3j\u001d.#(\u001cR0'\u0014uk=\u0006vuL\u0001/RV\\,&bv\u0007\u0016\u001fV\u0019Q/\u000b\u0013#H \u0003DDhi9E\r>l~\u001a|\nIj}\u0018\u001a\u0001", ">kP0X\bNb#f~k9\u0007\u0016/d", ">kP0X\bNb#f~k9\u0007\u0016/dG$m\bT^)/.\u001e@p25`}\u001cEm", ">kP0X\u0019>Z\u0015\u000e~o,", ">kP0X\u0019>Z\u0015\u000e~o,DZyt\f)K\u000b", ">kP0X\u0019>Z\u0015\u000e~o,n\r>hf$\u0010@\u000e", ">kP0X\u0019>Z\u0015\u000e~o,n\r>hf$\u0010@\u000e^\u001397a\u0004\t\r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0010<U{ 3j\u001d.#(\"g=\u001d\"re8\u001a-*X~2QZNulV<?!\u000ee\u0011R)\u001bN`=8nQ\u0001\u0001\u0015(T\u0005?f\u000fr\u0012\"5wF#\u001a\u0001", ">kP0X\u001eBb\u001cevr,\n", ">kP0X\u001eBb\u001cevr,\nP+WG{CRh", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @PlacementScopeMarker
    public static abstract class PlacementScope {
        public static final int $stable = 8;
        private boolean motionFrameOfReferencePlacement;

        public float current(Ruler ruler, float f2) {
            return f2;
        }

        public LayoutCoordinates getCoordinates() {
            return null;
        }

        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        /* JADX INFO: renamed from: placeRelative-70tqf50$default */
        public static /* synthetic */ void m5579placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j2, float f2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            placementScope.m5589placeRelative70tqf50(placeable, j2, f2);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i4 + 4) - (i4 | 4) != 0) {
                f2 = 0.0f;
            }
            placementScope.placeRelative(placeable, i2, i3, f2);
        }

        public final void placeRelative(Placeable placeable, int i2, int i3, float f2) {
            long jIntOffset = IntOffsetKt.IntOffset(i2, i3);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5515placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, (Function1<? super GraphicsLayerScope, Unit>) null);
            } else {
                long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6766getXimpl(jIntOffset), IntOffset.m6767getYimpl(jIntOffset));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5515placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(jIntOffset2, placeable.apparentToRealOffset), f2, (Function1<? super GraphicsLayerScope, Unit>) null);
            }
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i4 + 4) - (i4 | 4) != 0) {
                f2 = 0.0f;
            }
            placementScope.place(placeable, i2, i3, f2);
        }

        public final void place(Placeable placeable, int i2, int i3, float f2) {
            long jIntOffset = IntOffsetKt.IntOffset(i2, i3);
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5515placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, (Function1<? super GraphicsLayerScope, Unit>) null);
        }

        /* JADX INFO: renamed from: place-70tqf50$default */
        public static /* synthetic */ void m5578place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j2, float f2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i2 + 2) - (i2 | 2) != 0) {
                f2 = 0.0f;
            }
            placementScope.m5584place70tqf50(placeable, j2, f2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM$default */
        public static /* synthetic */ void m5580placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, float f2, Function1 function1, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((2 & i2) != 0) {
                f2 = 0.0f;
            }
            if ((i2 & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m5590placeRelativeWithLayeraW9wM(placeable, j2, f2, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, Function1 function1, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((4 & i4) != 0) {
                f2 = 0.0f;
            }
            if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i2, i3, f2, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i2, int i3, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
            long jIntOffset = IntOffsetKt.IntOffset(i2, i3);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5515placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, function1);
            } else {
                long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6766getXimpl(jIntOffset), IntOffset.m6767getYimpl(jIntOffset));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5515placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(jIntOffset2, placeable.apparentToRealOffset), f2, function1);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, Function1 function1, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((4 & i4) != 0) {
                f2 = 0.0f;
            }
            if ((i4 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i2, i3, f2, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        public final void placeWithLayer(Placeable placeable, int i2, int i3, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
            long jIntOffset = IntOffsetKt.IntOffset(i2, i3);
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5515placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM$default */
        public static /* synthetic */ void m5582placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, float f2, Function1 function1, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((2 & i2) != 0) {
                f2 = 0.0f;
            }
            if ((i2 & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m5592placeWithLayeraW9wM(placeable, j2, f2, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, GraphicsLayer graphicsLayer, float f2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((-1) - (((-1) - i4) | ((-1) - 8)) != 0) {
                f2 = 0.0f;
            }
            placementScope.placeWithLayer(placeable, i2, i3, graphicsLayer, f2);
        }

        public final void placeWithLayer(Placeable placeable, int i2, int i3, GraphicsLayer graphicsLayer, float f2) {
            long jIntOffset = IntOffsetKt.IntOffset(i2, i3);
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5575placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, graphicsLayer);
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM$default */
        public static /* synthetic */ void m5583placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
                f2 = 0.0f;
            }
            placementScope.m5593placeWithLayeraW9wM(placeable, j2, graphicsLayer, f2);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, GraphicsLayer graphicsLayer, float f2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i4 & 8) != 0) {
                f2 = 0.0f;
            }
            placementScope.placeRelativeWithLayer(placeable, i2, i3, graphicsLayer, f2);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i2, int i3, GraphicsLayer graphicsLayer, float f2) {
            long jIntOffset = IntOffsetKt.IntOffset(i2, i3);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5575placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, graphicsLayer);
            } else {
                long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6766getXimpl(jIntOffset), IntOffset.m6767getYimpl(jIntOffset));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5575placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(jIntOffset2, placeable.apparentToRealOffset), f2, graphicsLayer);
            }
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM$default */
        public static /* synthetic */ void m5581placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i2 + 4) - (i2 | 4) != 0) {
                f2 = 0.0f;
            }
            placementScope.m5591placeRelativeWithLayeraW9wM(placeable, j2, graphicsLayer, f2);
        }

        /* JADX INFO: renamed from: placeAutoMirrored-aW-9-wM$ui_release */
        public final void m5588placeAutoMirroredaW9wM$ui_release(Placeable placeable, long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5515placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, function1);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6766getXimpl(j2), IntOffset.m6767getYimpl(j2));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5515placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, function1);
            }
        }

        /* JADX INFO: renamed from: placeAutoMirrored-aW-9-wM$ui_release */
        public final void m5587placeAutoMirroredaW9wM$ui_release(Placeable placeable, long j2, float f2, GraphicsLayer graphicsLayer) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5575placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, graphicsLayer);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6766getXimpl(j2), IntOffset.m6767getYimpl(j2));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5575placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, graphicsLayer);
            }
        }

        /* JADX INFO: renamed from: placeApparentToRealOffset-aW-9-wM$ui_release */
        public final void m5586placeApparentToRealOffsetaW9wM$ui_release(Placeable placeable, long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5515placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, function1);
        }

        /* JADX INFO: renamed from: placeApparentToRealOffset-aW-9-wM$ui_release */
        public final void m5585placeApparentToRealOffsetaW9wM$ui_release(Placeable placeable, long j2, float f2, GraphicsLayer graphicsLayer) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5575placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, graphicsLayer);
        }

        public final void withMotionFrameOfReferencePlacement(Function1<? super PlacementScope, Unit> function1) {
            this.motionFrameOfReferencePlacement = true;
            function1.invoke(this);
            this.motionFrameOfReferencePlacement = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void handleMotionFrameOfReferencePlacement(Placeable placeable) {
            if (placeable instanceof MotionReferencePlacementDelegate) {
                ((MotionReferencePlacementDelegate) placeable).setPlacedUnderMotionFrameOfReference(this.motionFrameOfReferencePlacement);
            }
        }

        /* JADX INFO: renamed from: placeRelative-70tqf50 */
        public final void m5589placeRelative70tqf50(Placeable placeable, long j2, float f2) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5515placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, (Function1<? super GraphicsLayerScope, Unit>) null);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6766getXimpl(j2), IntOffset.m6767getYimpl(j2));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5515placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, (Function1<? super GraphicsLayerScope, Unit>) null);
            }
        }

        /* JADX INFO: renamed from: place-70tqf50 */
        public final void m5584place70tqf50(Placeable placeable, long j2, float f2) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5515placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, (Function1<? super GraphicsLayerScope, Unit>) null);
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM */
        public final void m5590placeRelativeWithLayeraW9wM(Placeable placeable, long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5515placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, function1);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6766getXimpl(j2), IntOffset.m6767getYimpl(j2));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5515placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, function1);
            }
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM */
        public final void m5592placeWithLayeraW9wM(Placeable placeable, long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5515placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, function1);
        }

        /* JADX INFO: renamed from: placeWithLayer-aW-9-wM */
        public final void m5593placeWithLayeraW9wM(Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f2) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5575placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, graphicsLayer);
        }

        /* JADX INFO: renamed from: placeRelativeWithLayer-aW-9-wM */
        public final void m5591placeRelativeWithLayeraW9wM(Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f2) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5575placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, graphicsLayer);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6766getXimpl(j2), IntOffset.m6767getYimpl(j2));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5575placeAtf8xVGno(IntOffset.m6770plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, graphicsLayer);
            }
        }
    }
}
