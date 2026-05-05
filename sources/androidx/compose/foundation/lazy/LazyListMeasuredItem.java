package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
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
/* JADX INFO: compiled from: LazyListMeasuredItem.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яv\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<H\u0007Ӭ4\u0012\u0006%njO0L͜P.`\\2şs{J$cҕyCQU\"Ԃ*\teNogtMb\u000bY\u000f\u000eǝ\u0001j:կ]xc\u0012\u00172XoG\u074cUoS9ht<\u001e(20K\u0002\u0005\u0007%2H\u001ev\u0003CQ\u0011\u001a0VpBR\u0013T\r\u001a(\u0006F \u0007\u001fbɡdȤxl\f9_#1i\u0003ĉ&e5\rQ\u001bGl';xq(9CO;%'c\u00035W\nC\u0013C\u007fC\u001dhU.;O\u0002_NZ\u0016\u0013C4_\u0013k|>^\u001bP\u000f\u00177/]ocP<5\b~\n\u001bT\u0004<\r7L<<2f6\u0010Cx\u0001cXP0`R\u0004\trN\u0017S\u0002C/G-~Q\u0010N)RE\u0010\u001d\rL8\u0011t/ql\u0010v\u0014Ii\b[?hXCXP\u001aYkЧ2\tr\u00068\u001dHG.Iɨ\u0015.%@\u007foGf9k0\rtk\u0005Jxh\u0002k\u0003LNh\u0007\u0016e1Q'hx|\u0005\u001ac\u0005\\:\u0012e\u001c\u0003\tD\u001c̯\u001f[˵;ƙٚ\u0014PU0w3\u0016m\u0018nGhMX\u001d\u0001>[G_K5\u007feVu\u001b\u000b\"\nTb3\u001d\u0017FaWr\\VnbLx]\u0010{rUT/@\u000e\n\u001cbpa\u001djd`\u0003LDq\u0001\u00170rh>\u0001\u000572T\u0002$#\u000bIvj?\bg'\u000e\\\u0001nqEA\u007f7I*ct\u00014+%7\u0003\u0002P_gzI|p$Gm{N\u0018`M\u001a;Kf'~Wv21Su\u000be\u007fOZP\tQ\u0012\u000fi{Vg6}!<n@b[d\u00192v\rt3\nt\u007f(ctQ\u000eύZ¤ZŬϗv\u0005_\u0014\\\u0011M\u0011-.=\u0001\u001e$Sމ/ϡ+\u001d\u001eߐdA#xuo\u007f0\nb=ծ#}ZϽe݁sbYϡ\u0003GFXq~l$zК\u0005\u074cLj\u007f٤\u0013#B&KHo~Gޠ:ր\nɀ·e\u0006Ր\u0011x^[H1\b\u007f:JmGDW\f*vE;\u0010{h>Ʊoљ`\u0011R\u05fa\"\r\u0002P|2lL.wob72Ӓw\u001e>\u05cdSd\u000b^\u0017G\u0005:J\u0010#Ejh4\u0019QėHݍ\u0013\u0017:߿DMd\u000flx\u000bX\u001fϊb҇d'2܀\u0017\u00119B\u0007X\u0002\u0017{Ll/\u00129Wӌ\u001f͢\u001fpWƫ~'1Jb^k:f\u0015#E\fX ΐ8\u0086K/u \b\u000e>>\u000b=\u0013*)`i\u0011\u000ex\u0007ͳMڀhTlɺ*hXv0LO\u0007\u000b\u001aT\n=\u0018o\u06ddtƚf-TϕHCQC\u0019\u0017r+]ќ\tސJ\u001b5ݢ\u0006?Ks\u0003\u0014U}.Į=֞\f&(ٴ\u001cv'\be17\u0016kGR\u0016 \u00189ղ\u0015\u07b3T \f˸\u001b\u0001\u00017F\bdQXֲ\u000eեbYsլqX5Y\u0005\u0006pR?Ǥ\u0016ʋpovΩ#\u0005l`d\u001f\u000f/VM\u0017X\u001eJ!\fr:?UP\\\u001f2,\u0015T!tX9Ё\u001c˹gnxաg]\u0013_=\u000fzm?ej\u001e,UPǤ\u0006ցX(\u001d͇'_Lg!b|Dg\u000e\roVhK׆+ِ\u0001~P՝a%B}\u000b\u001e\u00131mmuˑ\u000fӴd\u000b\u001cGO^/T#K)EJ\u000b\u001e/M֮\u0005̯ft\b˟\u0013\u001b\u00019\u007f,[H+ً\u001cž]*uѦ\u001b(Q\u007fFeX8\u001f\u001f)/\t:vګ^ӭ ;Y߂\u0012+\u001f<-84q]ةw֚UY-ܹ\u0019~\u0007IM\u001d\u0002yH}Ot9.=zqʳh֑)5m͗w \u0010wb~{v-բcЫHʿď\u001dxߝD\u0002\u0012\u001f2BV\f1=]1v,\b\\ni*\u0018Zڒ,߂rH;Ir7\u0002I|\u007f&4|[\u00106izB\u001ez~\u0001˸nخIQ\u0001{\u0011\u0006\u001b\bŬ7\u0018\u000e,9ټ\u0019>Ny@1h\u0605Q\t"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u001c\u001e\u0011vqF\u0007b\u0010]v/\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i\u001ei+B4GIz\u0018-\u0015pEB\bm\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;6v#U\\[,[6\u0002=\u001cg", "7mS2k", "", ">kP0X(;Z\u0019\r", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016\u0004", "7rE2e;BQ\u0015\u0006", "", "6na6m6Gb\u0015\u0006Ve0~\u00127e\t7", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4s<\b-;\u0003 7\\?BA", "DdaA\\*:Zt\u0006~`5\u0005\t8t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4sJ}-Fq\u0014*T\u0019", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "@de2e:>:\u0015\u0013\u0005n;", "0dU<e,\u001c]\"\u000ezg;g\u0005.d\u00041}", "/ec2e\nH\\(~\u0004m\u0017x\b.i\t*", "AoP0\\5@", "DhbBT3(T\u001a\rzm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "9dh", "", "1n]AX5MB-\nz", "/mX:T;H`", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@,1n\u0012i>i*8]R\u0005R03)O]M\u0011s;2\u0006'O(W0dN\u0002G!g", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "uH;7T=:\u001d)\u000e~euc\r=tU\u001db<\n\u0016$Qs\rO@#?a\t*Em_>Q\r\u0017r8 \u001epaB\u0016\"\u000fX\u0004+\\VW;XYH$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buY\u0006\u0005D\b\u0010\u0018\u0017=jyQ\u0015\u0001G\u0007$y?%o\u001c@[\u0003FNOf)wU]'dED2\u0014;)\u001f2`7\u000e\u000b\u001dwnf\u0004wv&\u001d\b8\"MqeO\u001bd9 X\f\u0006Pw\t\u000e{_p4vvm1/6b\u0014!N\u001d:ot^3XJ)o 9\u0018?IrKS:\u0017g,k\f\ru~/#mpmV\u000fP^!k>`[\u0010;\\\u000f\bPk*;\u0010\u0006>o\u0004%\u0018P\u000biz]*\u0017h\u000b*\u007f(1_\u0019^\fj \u0018= J/sO0iFT\u0017\u00122=\u001d\u0004#G\u001e\u007fH\u001dvGy%6o%2\t\u0018X~=TJ\u0006_Sm\u001f Ah\u0007\f#sv\u0018='", "5dc\u0010b5Lb&z~g;\u000bP7s_\rw\u001f\u0007", "u(9", "\u0018", "5dc\u0010b5MS\"\u000eir7|", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1q^@f\bQW'l~s,", "5dc\u0010e6Lat\u0012~l\u001a\u0001\u001e/", "u(8", "5dc\u0016a+>f", "u(I", "5dc\u0018X@", ":`]2", "5dc\u0019T5>", ";`X;4?Ba\u007fz\u000fh<\fv3z\u007f", ";`X;4?Ba\u0007\u0003\u0010^\u001e\u0001\u00182S\u000b$yD\n\u0019%", "5dc\u001aT0G/,\u0003\tL0\u0012\t!i\u000f+iK|\u0015\u001bPq\u001c", ";`g\u001aT0G/,\u0003\tH-}\u0017/t", ";h]\u001aT0G/,\u0003\tH-}\u0017/t", "<n] V9HZ zwe,`\u0018/m", "5dc\u001bb5,Q&\t\u0002e(y\u0010/I\u000f(\u0004", "Adc\u001bb5,Q&\t\u0002e(y\u0010/I\u000f(\u0004", "uY\u0018#", "\nrTA \u0006\u0017", "=eU@X;", "5dc\u001cY-LS(", ">kP0X(;Z\u0019h{_:|\u0018=", "", ">kP0X(;Z\u0019\rXh<\u0006\u0018", "5dc\u001d_(<S\u0015{\u0002^:Z\u0013?n\u000f", "Ahi2", "5dc \\A>", "AoP;", "5dc c(G", ";`X;4?Ba", "5dc\u001aT0G/,\u0003\t&s~\u001dCY\\6", "uI\u0018\u0016", ";`X;4?Ba\u0007\u0003\u0010^", "5dc\u001aT0G/,\u0003\tL0\u0012\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0010<U{ 3j\u001d.#\u0007\u001f", "/o_9l\u001a<`#\u0006\u0002=,\u0004\u0018+", "", "2d[AT", "CoS.g,\u001a\\\u001d\u0007vm0\u0007\u0012=", "5dc\u001cY-LS(FWc6LX64", "uH\u0018\u0017", "5dc\u001dT9>\\(]vm(", ">kP0X", "Ab^=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "7r;<b2B\\\u001bZ}^({", ">nb6g0H\\", ";`X;4?Ba\u0003\u007f{l,\f", ":`h<h;0W\u0018\u000e}", ":`h<h;!S\u001d\u0001}m", "1q^@f\bQW'h{_:|\u0018", "CoS.g,&O\u001d\bVq0\u000bo+y\n8\u000b.\u0005,\u0017", "1n_F", ";`X;4?Ba\u0001z\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "1n_F z-c\u001cL\u0001>", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIuzR", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LazyListMeasuredItem implements LazyListItemInfo, LazyLayoutMeasuredItem {
    public static final int $stable = 8;
    private final int afterContentPadding;
    private final LazyLayoutItemAnimator<LazyListMeasuredItem> animator;
    private final int beforeContentPadding;
    private final long constraints;
    private final Object contentType;
    private final int crossAxisSize;
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final int lane;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private final int mainAxisSizeWithSpacings;
    private int maxMainAxisOffset;
    private int minMainAxisOffset;
    private boolean nonScrollableItem;
    private int offset;
    private final int[] placeableOffsets;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final int spacing;
    private final int span;
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    public /* synthetic */ LazyListMeasuredItem(int i2, List list, boolean z2, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z3, int i3, int i4, int i5, long j2, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, list, z2, horizontal, vertical, layoutDirection, z3, i3, i4, i5, j2, obj, obj2, lazyLayoutItemAnimator, j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LazyListMeasuredItem(int i2, List<? extends Placeable> list, boolean z2, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z3, int i3, int i4, int i5, long j2, Object obj, Object obj2, LazyLayoutItemAnimator<LazyListMeasuredItem> lazyLayoutItemAnimator, long j3) {
        this.index = i2;
        this.placeables = list;
        this.isVertical = z2;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z3;
        this.beforeContentPadding = i3;
        this.afterContentPadding = i4;
        this.spacing = i5;
        this.visualOffset = j2;
        this.key = obj;
        this.contentType = obj2;
        this.animator = lazyLayoutItemAnimator;
        this.constraints = j3;
        this.span = 1;
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
        int size = list.size();
        int height = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Placeable placeable = (Placeable) list.get(i6);
            height += isVertical() ? placeable.getHeight() : placeable.getWidth();
            iMax = Math.max(iMax, !isVertical() ? placeable.getHeight() : placeable.getWidth());
        }
        this.size = height;
        this.mainAxisSizeWithSpacings = RangesKt.coerceAtLeast(getSize() + this.spacing, 0);
        this.crossAxisSize = iMax;
        this.placeableOffsets = new int[this.placeables.size() * 2];
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean isVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo, androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public Object getContentType() {
        return this.contentType;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getConstraints-msEJaDk */
    public long mo1129getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getOffset() {
        return this.offset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListItemInfo
    public int getSize() {
        return this.size;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getLane() {
        return this.lane;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getSpan() {
        return this.span;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getMainAxisSizeWithSpacings() {
        return this.mainAxisSizeWithSpacings;
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public boolean getNonScrollableItem() {
        return this.nonScrollableItem;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void setNonScrollableItem(boolean z2) {
        this.nonScrollableItem = z2;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public int getPlaceablesCount() {
        return this.placeables.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public Object getParentData(int i2) {
        return this.placeables.get(i2).getParentData();
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    public void position(int i2, int i3, int i4, int i5) {
        position(i2, i4, i5);
    }

    public final void position(int i2, int i3, int i4) {
        int width;
        this.offset = i2;
        this.mainAxisLayoutSize = isVertical() ? i4 : i3;
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Placeable placeable = list.get(i5);
            int i6 = i5 * 2;
            if (isVertical()) {
                int[] iArr = this.placeableOffsets;
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == true".toString());
                }
                iArr[i6] = horizontal.align(placeable.getWidth(), i3, this.layoutDirection);
                this.placeableOffsets[i6 + 1] = i2;
                width = placeable.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i6] = i2;
                int i7 = i6 + 1;
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalAlignment when isVertical == false".toString());
                }
                iArr2[i7] = vertical.align(placeable.getHeight(), i4);
                width = placeable.getWidth();
            }
            i2 += width;
        }
        this.minMainAxisOffset = -this.beforeContentPadding;
        this.maxMainAxisOffset = this.mainAxisLayoutSize + this.afterContentPadding;
    }

    public final void updateMainAxisLayoutSize(int i2) {
        this.mainAxisLayoutSize = i2;
        this.maxMainAxisOffset = i2 + this.afterContentPadding;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem
    /* JADX INFO: renamed from: getOffset-Bjo55l4 */
    public long mo1130getOffsetBjo55l4(int i2) {
        int[] iArr = this.placeableOffsets;
        int i3 = i2 * 2;
        return IntOffsetKt.IntOffset(iArr[i3], iArr[i3 + 1]);
    }

    public final void applyScrollDelta(int i2, boolean z2) {
        if (getNonScrollableItem()) {
            return;
        }
        this.offset = getOffset() + i2;
        int length = this.placeableOffsets.length;
        for (int i3 = 0; i3 < length; i3++) {
            if ((isVertical() && i3 % 2 == 1) || (!isVertical() && i3 % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i3] = iArr[i3] + i2;
            }
        }
        if (z2) {
            int placeablesCount = getPlaceablesCount();
            for (int i4 = 0; i4 < placeablesCount; i4++) {
                LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i4);
                if (animation != null) {
                    long jM1178getRawOffsetnOccac = animation.m1178getRawOffsetnOccac();
                    int iM6766getXimpl = isVertical() ? IntOffset.m6766getXimpl(jM1178getRawOffsetnOccac) : Integer.valueOf(IntOffset.m6766getXimpl(jM1178getRawOffsetnOccac) + i2).intValue();
                    boolean zIsVertical = isVertical();
                    int iM6767getYimpl = IntOffset.m6767getYimpl(jM1178getRawOffsetnOccac);
                    if (zIsVertical) {
                        iM6767getYimpl += i2;
                    }
                    animation.m1181setRawOffsetgyyYBs(IntOffsetKt.IntOffset(iM6766getXimpl, iM6767getYimpl));
                }
            }
        }
    }

    public final void place(Placeable.PlacementScope placementScope, boolean z2) {
        GraphicsLayer layer;
        int iM6767getYimpl;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first".toString());
        }
        int placeablesCount = getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            Placeable placeable = this.placeables.get(i2);
            int mainAxisSize = this.minMainAxisOffset - getMainAxisSize(placeable);
            int i3 = this.maxMainAxisOffset;
            long jMo1130getOffsetBjo55l4 = mo1130getOffsetBjo55l4(i2);
            LazyLayoutItemAnimation animation = this.animator.getAnimation(getKey(), i2);
            if (animation != null) {
                if (z2) {
                    animation.m1180setLookaheadOffsetgyyYBs(jMo1130getOffsetBjo55l4);
                } else {
                    if (!IntOffset.m6765equalsimpl0(animation.m1176getLookaheadOffsetnOccac(), LazyLayoutItemAnimation.Companion.m1182getNotInitializednOccac())) {
                        jMo1130getOffsetBjo55l4 = animation.m1176getLookaheadOffsetnOccac();
                    }
                    long jM6770plusqkQi6aY = IntOffset.m6770plusqkQi6aY(jMo1130getOffsetBjo55l4, animation.m1177getPlacementDeltanOccac());
                    if ((m1128getMainAxisgyyYBs(jMo1130getOffsetBjo55l4) <= mainAxisSize && m1128getMainAxisgyyYBs(jM6770plusqkQi6aY) <= mainAxisSize) || (m1128getMainAxisgyyYBs(jMo1130getOffsetBjo55l4) >= i3 && m1128getMainAxisgyyYBs(jM6770plusqkQi6aY) >= i3)) {
                        animation.cancelPlacementAnimation();
                    }
                    jMo1130getOffsetBjo55l4 = jM6770plusqkQi6aY;
                }
                layer = animation.getLayer();
            } else {
                layer = null;
            }
            if (this.reverseLayout) {
                int iM6766getXimpl = isVertical() ? IntOffset.m6766getXimpl(jMo1130getOffsetBjo55l4) : (this.mainAxisLayoutSize - IntOffset.m6766getXimpl(jMo1130getOffsetBjo55l4)) - getMainAxisSize(placeable);
                if (isVertical()) {
                    iM6767getYimpl = (this.mainAxisLayoutSize - IntOffset.m6767getYimpl(jMo1130getOffsetBjo55l4)) - getMainAxisSize(placeable);
                } else {
                    iM6767getYimpl = IntOffset.m6767getYimpl(jMo1130getOffsetBjo55l4);
                }
                jMo1130getOffsetBjo55l4 = IntOffsetKt.IntOffset(iM6766getXimpl, iM6767getYimpl);
            }
            long jM6770plusqkQi6aY2 = IntOffset.m6770plusqkQi6aY(jMo1130getOffsetBjo55l4, this.visualOffset);
            if (!z2 && animation != null) {
                animation.m1179setFinalOffsetgyyYBs(jM6770plusqkQi6aY2);
            }
            if (isVertical()) {
                if (layer != null) {
                    Placeable.PlacementScope.m5583placeWithLayeraW9wM$default(placementScope, placeable, jM6770plusqkQi6aY2, layer, 0.0f, 4, (Object) null);
                } else {
                    Placeable.PlacementScope.m5582placeWithLayeraW9wM$default(placementScope, placeable, jM6770plusqkQi6aY2, 0.0f, (Function1) null, 6, (Object) null);
                }
            } else if (layer != null) {
                Placeable.PlacementScope.m5581placeRelativeWithLayeraW9wM$default(placementScope, placeable, jM6770plusqkQi6aY2, layer, 0.0f, 4, (Object) null);
            } else {
                Placeable.PlacementScope.m5580placeRelativeWithLayeraW9wM$default(placementScope, placeable, jM6770plusqkQi6aY2, 0.0f, (Function1) null, 6, (Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: getMainAxis--gyyYBs */
    private final int m1128getMainAxisgyyYBs(long j2) {
        return isVertical() ? IntOffset.m6767getYimpl(j2) : IntOffset.m6766getXimpl(j2);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return isVertical() ? placeable.getHeight() : placeable.getWidth();
    }

    /* JADX INFO: renamed from: copy-4Tuh3kE */
    private final long m1127copy4Tuh3kE(long j2, Function1<? super Integer, Integer> function1) {
        int iM6766getXimpl = isVertical() ? IntOffset.m6766getXimpl(j2) : function1.invoke(Integer.valueOf(IntOffset.m6766getXimpl(j2))).intValue();
        boolean zIsVertical = isVertical();
        int iM6767getYimpl = IntOffset.m6767getYimpl(j2);
        if (zIsVertical) {
            iM6767getYimpl = function1.invoke(Integer.valueOf(iM6767getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(iM6766getXimpl, iM6767getYimpl);
    }
}
