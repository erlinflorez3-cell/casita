package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: LazyLayoutMeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĳ\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*ܥ\u001aw\u001dfr96DmH<W[*\u0015n\u000442d,qI;]\u001a\u0014\"\u0011ѧVg}nRZ\u0011D\u0017\u0006,xr,W[\u0001] -:B\u0006?;M\u0006=Aś|6\u001b :\">z\r\u0001(LP\u0010\rzKŷ\u0014\u0012F@x:h\rU\u0005(\u0012\u000e>6\u0001&ձoNLHt]@0+\u0003\u007fBV'e1\u0005M#F\\'\u0013vi\u001eA@?5\u001b,[\u0003\u001dRc?\u0019?y=\u000bl/'AI{WLX\b\u0014\u001b1U\fsöV\\3P\u0011\fU+\u0010xQִ\u001e,\u0006{\u0014\rj\u0006\u001e\n5KF-Hjڿ\u00123\u0003w\u001c$^\u001dvB.\u0017\u0012:%B\u00183YPKj_\u007fS\u0019|N,\u0017\u0013\u001e1 \u0007-kV\u001e`C<dya1\u007fWkh~#_={&\tu\u0012,\u00140u$?}!.EJMZgF\u074co\u0002Nj\u0018\f\u0013\b\u0001dyTX@P\u0017&9:\t:\u007fr\bʰoPZ~rҡLd\u001b\u0015\u0019 \u0013Nx(@/B(N}\u007f\u001an[{\"%]}gktk\u001cvQjC7ac>\u0003bx$?jy3x\u0017Wa3rm8$BH\u00198\b}TN:8`bۇ 42W_¹\u0014\u0011),kY\u0003\u0019ajh>\u0018\u0003KT\u0007wN\r\t/g\rt}\u0013\u0011IZ)'6Ѓ@ٛڤ\u001d([OvbE8\u0015.\f\u007fu~tGz\u001d\\\u0086Tߡ\u001fچ׀=S5n!AG>@1EEz\n\u000eQ{Emϭ{ʣ\u000e\u0090ÿ2i\u000e\u001f~a)~X\u0006l\u0017P'\u0007rQ;+\u0014ّ`¿یKeZBiv\u0012\n\u0011\u0010TNf--\u001fL,G\u0004ޫ{4տBگޗ\u001ay\u001ah#\u001c&\u0001}d\u0012b=V\u001de2C**ͪaPњ1ծΒM[\u0005w0_5\u0017P\u0005\u0003w6\u007f14;q\u000fUҥoމиQ\r5=tGt\"~\u0018s:Av&4\\\u0010pϪBϘ\u0013٫ǜ)\u0013S\u0016u(6`jLb\u000f8\u0012$1\u001dEbݓ\u001f߁Vłס4\by[Dy\u0004m\u0013\u0001!$bqd\b9\n\u001bɃ\u0005X\u000f\u000e\u000ew\u000fEpjsi\u0014Thݸ[Ƈ߃\tbK)/jI\u0013\u001d|6xcd-mt\u0005uwӛ\u007fҵ\u009b\r\u001dp\u001a\r2mBR\u001eQ\u001bV\f)\u000bsd\n]ϲ5\u0003ܔ(ԖÃs\u000e>d\u000bh\u000b/)\u0003i\u0011\u000e*X^9l+bѿu\u0011ٟQƉĀ-\u0001\u0001I\u001c\nZ!\u0019\u001fgr\u001eic`%߯:ƴ\u001e\u0005/F/\u000f\u001a\u00064X)7\u001e5[D\u007f~jյ~\u009cW?\u0016\n&+5\rE3jc&f8jQ\u000flޡ\u0019ȫ\u0006\r+R&\u0010<XE~\u0018/ 6}\u0004\nû\u0015Ȩ]k\u007f˺\u001139{\u001eByxOƀeؼgn]̃Sv?g\u0012n[bsԫ*Ӱ2\u0017p\\@$a4)E\u000e)-N/8\u0018bW'_kxv{Qk\rYH\u001aB\u0010G\u0019d.\u007f/y$\u001b:\\8\u001bKX]>\u0013\"\u000b\u0005!qdߟl܍ht\u0014Éd\t\rKv\u0011A8\u001dݴ Ү37!ےʽ\rPh\n\n٢eT 9RE:ω6Y"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,JP|H\u0014ub\u0019U\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,JP|H\u0014g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "7sT:66Gb\u0019\b\n?(z\u00189r\u0014", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O*X5kR{Lt\u000eX\u001dX8!Z", "AtQ0b4I]'~b^(\u000b\u0019<em&\u0006K\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006d52W\b(Bw$.5C7yD+\u0015V_C\u0012c\u0002", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn<U\u00134\u0001t\u0012BWSJ5\u001b\u001a*|H5\u001bm<]Z6GT,6earF#rV\f]5\u001a\u0019/( wCD)\f+\\K9r\t\u0017 \u001c54\u0001F \u0017C\u000e\u001f\u0006PrVVV]\u0004OLOp*L\f[+lG:\u0012\u0012{$\u001b>\u0014\u001f", "2d]@\\;R", "", "5dc\u0011X5LW(\u0013", "u(5", "4n]AF*:Z\u0019", "5dc\u0013b5MA\u0017z\u0002^", "7r;<b2B\\\u001bZ}^({", "", "u(I", "7sT:C9Hd\u001d}zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O7[6mVq=!g", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", ">kP0X(;Z\u0019\rXZ*\u007f\t", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u0017a\u000b}", "", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a/k\u0019\u0012", ":`h<h;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "EhSA[", "6dX4[;", "/kX4a4>\\(e~g,\u000b", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006R,9[\u0007(7v%\u0015QL;A", "@t[2e:", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006c5<Y\u000b\u000e5w!.#", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", ">kP0X4>\\([\u0002h*\u0003", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", ";dP@h9>", "7mS2k", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ";dP@h9>\u001bc\u0005aj\t\t\u001b", "uH9u?1:d\u0015H\u000bm0\u0004R\u0016i\u000e7Q", "@nd;W\u001bH>,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "@nd;W\u001bH>,FE/~G\u000e)4", "uE\u0018\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9|<\n4%b\u0002/\r", "@nd;W\u001bH>,FBKxo\u0003\u007fo", "uI\u0018\u0016", "Bn3=", "Bn3= \u000e:<d]n:", "uI\u0018\u0013", "Bn3= <\u000bc#ljF", "uE\u0018\u0013", "uH\u0018\u0013", "Bn3=F0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "Bn3=F0SS`\u0005Bk-my\u0017", "uI\u0018\u0017", "Bn?E", "Bn?E v\u000f&c\u0004t-", "Bn?E s+ \fxKh", "BnA2V;", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGc%3hS", "BnB6m,", "BnB6m,\u0006F\u001fzlG\u001bh", "BnB=", "BnB= vQ;\tNyh", "uE\u0018\u0017", "BnB= 2)he`\u000f-", "uH\u0018\u0017", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyLayoutMeasureScopeImpl implements LazyLayoutMeasureScope, MeasureScope {
    public static final int $stable = 0;
    private final LazyLayoutItemContentFactory itemContentFactory;
    private final LazyLayoutItemProvider itemProvider;
    private final HashMap<Integer, List<Placeable>> placeablesCache = new HashMap<>();
    private final SubcomposeMeasureScope subcomposeMeasureScope;

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.subcomposeMeasureScope.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.subcomposeMeasureScope.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.subcomposeMeasureScope.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.subcomposeMeasureScope.isLookingAhead();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(int i2, int i3, Map<AlignmentLine, Integer> map, Function1<? super Placeable.PlacementScope, Unit> function1) {
        return this.subcomposeMeasureScope.layout(i2, i3, map, function1);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult layout(int i2, int i3, Map<AlignmentLine, Integer> map, Function1<? super RulerScope, Unit> function1, Function1<? super Placeable.PlacementScope, Unit> function12) {
        return this.subcomposeMeasureScope.layout(i2, i3, map, function1, function12);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public int mo703roundToPxR2X_6o(long j2) {
        return this.subcomposeMeasureScope.mo703roundToPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public int mo704roundToPx0680j_4(float f2) {
        return this.subcomposeMeasureScope.mo704roundToPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public float mo709toPxR2X_6o(long j2) {
        return this.subcomposeMeasureScope.mo709toPxR2X_6o(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public float mo710toPx0680j_4(float f2) {
        return this.subcomposeMeasureScope.mo710toPx0680j_4(f2);
    }

    @Override // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect) {
        return this.subcomposeMeasureScope.toRect(dpRect);
    }

    public LazyLayoutMeasureScopeImpl(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, SubcomposeMeasureScope subcomposeMeasureScope) {
        this.itemContentFactory = lazyLayoutItemContentFactory;
        this.subcomposeMeasureScope = subcomposeMeasureScope;
        this.itemProvider = lazyLayoutItemContentFactory.getItemProvider().invoke();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope
    /* JADX INFO: renamed from: measure-0kLqBqw */
    public List<Placeable> mo1189measure0kLqBqw(int i2, long j2) {
        List<Placeable> list = this.placeablesCache.get(Integer.valueOf(i2));
        if (list == null) {
            Object key = this.itemProvider.getKey(i2);
            List<Measurable> listSubcompose = this.subcomposeMeasureScope.subcompose(key, this.itemContentFactory.getContent(i2, key, this.itemProvider.getContentType(i2)));
            int size = listSubcompose.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(listSubcompose.get(i3).mo5514measureBRTryo0(j2));
            }
            ArrayList arrayList2 = arrayList;
            this.placeablesCache.put(Integer.valueOf(i2), arrayList2);
            return arrayList2;
        }
        return list;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public float mo705toDpGaN1DYA(long j2) {
        return this.subcomposeMeasureScope.mo705toDpGaN1DYA(j2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo707toDpu2uoSUM(int i2) {
        return this.subcomposeMeasureScope.mo707toDpu2uoSUM(i2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public float mo706toDpu2uoSUM(float f2) {
        return this.subcomposeMeasureScope.mo706toDpu2uoSUM(f2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo713toSpkPz2Gy4(float f2) {
        return this.subcomposeMeasureScope.mo713toSpkPz2Gy4(f2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public long mo714toSpkPz2Gy4(int i2) {
        return this.subcomposeMeasureScope.mo714toSpkPz2Gy4(i2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public long mo712toSp0xMU5do(float f2) {
        return this.subcomposeMeasureScope.mo712toSp0xMU5do(f2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public long mo711toSizeXkaWNTQ(long j2) {
        return this.subcomposeMeasureScope.mo711toSizeXkaWNTQ(j2);
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope, androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public long mo708toDpSizekrfVVM(long j2) {
        return this.subcomposeMeasureScope.mo708toDpSizekrfVVM(j2);
    }
}
