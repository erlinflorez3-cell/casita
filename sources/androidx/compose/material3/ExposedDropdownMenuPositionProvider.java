package androidx.compose.material3;

import androidx.compose.material3.internal.MenuPosition;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:104)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.<init>(JvmProtoBuf.java:69)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:175)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes$1.parsePartialFrom(JvmProtoBuf.java:170)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:192)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialDelimitedFrom(AbstractParser.java:233)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:245)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parseDelimitedFrom(AbstractParser.java:49)
    	at kotlin.metadata.internal.metadata.jvm.JvmProtoBuf$StringTableTypes.parseDelimitedFrom(JvmProtoBuf.java:1736)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readNameResolver(JvmProtoBufUtil.kt:57)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯX\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\r(4ߚ\u007f\u0007|jA0ReP.XS2\u000f\u0002{<$q$yCQU\"}(\fWN}gvJ`\rK\u000f\u001c\u0016\u0001j2T]xs\u0012\u0017˰JoU3UڎE9vt>\u0005&4(7\u0010ڎ1\u001aXGP`\u000bGY\f*0nqJV\u001bO\u001d\u001a@\tN.\u0007\u001ejkf>Xnm:])\u0019hpS7e6|[\u0014^TU\u0010\u0007\u0018$+N?ME5d\u0013\u0016\u0001eύ\u0007IwH\u0015n-3;Ky]\\e\u0010%%:}\u0017ǁv0b\u0010af\u00123;QiQv\u001c8y\u000b{;B2\u0017Ν+H<<b\u0017\u00161Kt!wpT\u0010kZ\u007f)kf\u001b3%K+gA\u0017Uob1Ne$5\u0011,L\u0019nO\u0002\u001b\"ؤ\u0014Ñƻ{S7{Nh\u0019Z\u0018iUm2\u00029̦,˙4G\b\u07fcL\u001d<)=7\nJyܬmɘLDoϸUovS\u0002RvA̱r\u001c?ѧ!\u000e`Wr\u0019<\\bmD\u0011{2+\u0378\u007fݔ\u0017 dɼ\r83\u0014fWxkzM\f\u0010;.\u0015<֍rq\u0016ãQ`9L_{`m`\u0010,?jx[֝h͞W\fb٢xa@P\u0003@\b\rT]:\u001d\u0558C{\"?<7\u001fh%J\t$hN\r\u001aoi\u0017\u001aњX=*\u000ey*z\u0015\u0011Rbv\u0016u\tK<|\u000f([Jپ9\u001f.Ş:j:\u00171\"O\u007f\u000ec\u007fLubCָwʀ\u007f \u001e֝\n]=Z+\u000f-?\tċ/։Prmʸ\u001e\u001e5\u0019\u0015y=L?֮iŰnp4ߌ;V]s/\"%oIֿ\nܐ\u0004yi¿KVqV#[lL\u03a2\u0007_DѾP~\u000b?,FQ~0\u0004M-q*ޗ\u001a}\u001c٬-cc\f}Oӣb\u0014.wkןH\u0012\u0015̚f}"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006V8@c\f 6L#8XBE}=\u0006\u0015qq$\u0011q0]z1P7[6mVq=!g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0013\u001b Fy \u0006a/@i\t\u000bA{\u001a=QMDVA(&l`9\u00149", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "Bn_$\\5=]+b\u0004l,\f\u0017", "", "9dh/b(KR\u0007\u0003|g(\u0004v>a\u000f(", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "", "DdaA\\*:Z\u0001z\b`0\u0006", "=m?<f0MW#\bXZ3z\u00196a\u000f(z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00125W\ru", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "/mR5b9\u001b])\byl", ";d]B56N\\\u0018\r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\rQ|*VBHu8\u001d(2_C\u000fn6\\vpT\\W;`Zr\u0007\u0002!V\u001dN\u0001pk_K3uH@h\r=QK<x\n\n%\u0012?s~\f7 Pw$yK25\u001c\u001dP", "0ncAb4-]t\bxa6\nw9p", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0016MLKV>,\u0019weC\u0010\"\u001dN\u00046KJJ32", "0ncAb4-]\u000b\u0003\u0004]6\u000fe9t\u000f2\u0004", "5dc\u0011X5LW(\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "3mS!b\bGQ\u001c\t\b>5{", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0016MLKV>,\u0019weC\u0010\"\u000fX\u0004+\\VW;XYH", "5dc\u0018X@;]\u0015\fyL0~\u0012+lm7wO\u0001", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d41h}u", ":dUAG60W\"}\u0005p\u0013|\n>", "5dc\u001ca\u0017Ha\u001d\u000e~h5Z\u00056c\u0010/wO\u0001\u0016", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "@hV5g\u001bHE\u001d\byh>i\r1h\u000f", "AsP?g\u001bH/\"|}h9j\u0018+r\u000f", "Bn_!b\bGQ\u001c\t\b;6\f\u00189m", "Bn_!b\u001eB\\\u0018\t\rM6\b", "5dc!b70W\"}\u0005p\u0010\u0006\u0017/t\u000e", "u(8", "5dc#X9MW\u0017z\u0002F(\n\u000b3n", "1`[0h3:b\u0019i\u0005l0\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "Eh]1b>,W.~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ">n_Bc\nH\\(~\u0004m\u001a\u0001\u001e/", "1`[0h3:b\u0019i\u0005l0\f\r9nG/\u0003Rqyy\u0016", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W \u007f4\"Y{/\rR|*VBHu8\u001d(2_C\u000fn6\\vpWP\u0018<eV\u0002\u0007z\u000en\u0018^:k\tfA\"}HA(]\u0011\rf", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ExposedDropdownMenuPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;
    private final MenuPosition.Vertical bottomToAnchorTop;
    private final MenuPosition.Vertical bottomToWindowBottom;
    private final Density density;
    private final MenuPosition.Horizontal endToAnchorEnd;
    private final State<Unit> keyboardSignalState;
    private final MenuPosition.Horizontal leftToWindowLeft;
    private final Function2<IntRect, IntRect, Unit> onPositionCalculated;
    private final MenuPosition.Horizontal rightToWindowRight;
    private final MenuPosition.Horizontal startToAnchorStart;
    private final MenuPosition.Vertical topToAnchorBottom;
    private final MenuPosition.Vertical topToWindowTop;
    private final int topWindowInsets;
    private final int verticalMargin;

    /* JADX WARN: Multi-variable type inference failed */
    public ExposedDropdownMenuPositionProvider(Density density, int i2, State<Unit> state, int i3, Function2<? super IntRect, ? super IntRect, Unit> function2) {
        this.density = density;
        this.topWindowInsets = i2;
        this.keyboardSignalState = state;
        this.verticalMargin = i3;
        this.onPositionCalculated = function2;
        this.startToAnchorStart = MenuPosition.startToAnchorStart$default(MenuPosition.INSTANCE, 0, 1, null);
        this.endToAnchorEnd = MenuPosition.endToAnchorEnd$default(MenuPosition.INSTANCE, 0, 1, null);
        this.leftToWindowLeft = MenuPosition.leftToWindowLeft$default(MenuPosition.INSTANCE, 0, 1, null);
        this.rightToWindowRight = MenuPosition.rightToWindowRight$default(MenuPosition.INSTANCE, 0, 1, null);
        this.topToAnchorBottom = MenuPosition.topToAnchorBottom$default(MenuPosition.INSTANCE, 0, 1, null);
        this.bottomToAnchorTop = MenuPosition.bottomToAnchorTop$default(MenuPosition.INSTANCE, 0, 1, null);
        this.topToWindowTop = MenuPosition.INSTANCE.topToWindowTop(i3);
        this.bottomToWindowBottom = MenuPosition.INSTANCE.bottomToWindowBottom(i3);
    }

    public final Density getDensity() {
        return this.density;
    }

    public final int getTopWindowInsets() {
        return this.topWindowInsets;
    }

    public final State<Unit> getKeyboardSignalState() {
        return this.keyboardSignalState;
    }

    /* JADX INFO: renamed from: androidx.compose.material3.ExposedDropdownMenuPositionProvider$2 */
    /* JADX INFO: compiled from: ExposedDropdownMenu.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,i\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rfx2`UB\u000f\u001a|z,Ӯ(qI>"}, d2 = {"\n`]<a@F])\rS", "", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzKo", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00125W\ru", "\n`]<a@F])\r5i(\n\u00057e\u000f(\tzLo", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function2<IntRect, IntRect, Unit> {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(IntRect intRect, IntRect intRect2) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(IntRect intRect, IntRect intRect2) {
            invoke2(intRect, intRect2);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ ExposedDropdownMenuPositionProvider(Density density, int i2, State state, int i3, Function2 function2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(density, i2, (4 & i4) != 0 ? null : state, (i4 + 8) - (8 | i4) != 0 ? density.mo704roundToPx0680j_4(MenuKt.getMenuVerticalMargin()) : i3, (-1) - (((-1) - i4) | ((-1) - 16)) != 0 ? AnonymousClass2.INSTANCE : function2);
    }

    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    public final Function2<IntRect, IntRect, Unit> getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public long mo682calculatePositionllwVHH4(IntRect intRect, long j2, LayoutDirection layoutDirection, long j3) {
        MenuPosition.Horizontal horizontal;
        int iMo2909position95KtPRI;
        MenuPosition.Vertical vertical;
        State<Unit> state = this.keyboardSignalState;
        if (state != null) {
            state.getValue();
        }
        long jIntSize = IntSizeKt.IntSize(IntSize.m6808getWidthimpl(j2), IntSize.m6807getHeightimpl(j2) + this.topWindowInsets);
        MenuPosition.Horizontal[] horizontalArr = new MenuPosition.Horizontal[3];
        int i2 = 0;
        horizontalArr[0] = this.startToAnchorStart;
        horizontalArr[1] = this.endToAnchorEnd;
        if (IntOffset.m6766getXimpl(intRect.m6789getCenternOccac()) < IntSize.m6808getWidthimpl(jIntSize) / 2) {
            horizontal = this.leftToWindowLeft;
        } else {
            horizontal = this.rightToWindowRight;
        }
        horizontalArr[2] = horizontal;
        List listListOf = CollectionsKt.listOf((Object[]) horizontalArr);
        int size = listListOf.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                iMo2909position95KtPRI = 0;
                break;
            }
            iMo2909position95KtPRI = ((MenuPosition.Horizontal) listListOf.get(i3)).mo2909position95KtPRI(intRect, jIntSize, IntSize.m6808getWidthimpl(j3), layoutDirection);
            if (i3 == CollectionsKt.getLastIndex(listListOf) || (iMo2909position95KtPRI >= 0 && IntSize.m6808getWidthimpl(j3) + iMo2909position95KtPRI <= IntSize.m6808getWidthimpl(jIntSize))) {
                break;
            }
            i3++;
        }
        MenuPosition.Vertical[] verticalArr = new MenuPosition.Vertical[3];
        verticalArr[0] = this.topToAnchorBottom;
        verticalArr[1] = this.bottomToAnchorTop;
        if (IntOffset.m6767getYimpl(intRect.m6789getCenternOccac()) < IntSize.m6807getHeightimpl(jIntSize) / 2) {
            vertical = this.topToWindowTop;
        } else {
            vertical = this.bottomToWindowBottom;
        }
        verticalArr[2] = vertical;
        List listListOf2 = CollectionsKt.listOf((Object[]) verticalArr);
        int size2 = listListOf2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            int iMo2910positionJVtK1S4 = ((MenuPosition.Vertical) listListOf2.get(i4)).mo2910positionJVtK1S4(intRect, jIntSize, IntSize.m6807getHeightimpl(j3));
            if (i4 == CollectionsKt.getLastIndex(listListOf2) || (iMo2910positionJVtK1S4 >= 0 && IntSize.m6807getHeightimpl(j3) + iMo2910positionJVtK1S4 <= IntSize.m6807getHeightimpl(jIntSize))) {
                i2 = iMo2910positionJVtK1S4;
                break;
            }
        }
        long jIntOffset = IntOffsetKt.IntOffset(iMo2909position95KtPRI, i2);
        this.onPositionCalculated.invoke(intRect, IntRectKt.m6798IntRectVbeCjmY(jIntOffset, j3));
        return jIntOffset;
    }
}
