package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
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
/* JADX INFO: compiled from: TextLayoutState.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яċ\u0014D57\u001eq\u007fR܀kt\nA\u000e0!.J~(-\u001aw\u001dfr96NmHDR[ճ\u0017k\u00124,[*sK;k\u001a\u0006\"\u000fTVg}nRZ!C\u0017\u0006,xr,WU\u0001](\u000f:BuF;M\u0006=A`z8\r @(@y\u000b\u0001\"*V\u0019~zIQ\u0014\u0012F@xíZ\rc\u0005\"Ň\u000e>6\u0001&\\mP>H\u0003]Bǂ+\u0003\u007fBV'e1\u0003ձ#Ͽ\u0005';u\"!ҋD7C\u0015mk\u00116j[m3ouK6\u0001'U[\u0010֕ˇ5ݙÿ\u0018\u00171\u0002\u001b\u0011;Fj9i`:\\[Sq\u0002h\u000eV(+\u0002\u0013<\u0012E\u001e'vfȟ\u0019Ǒڿ\u00125z,az\u0019\u0018l}\u0018z\u0010nG)\u000edC9I\u0017ј`ݢϭR9\u0002A\u001b[k/|_sT<uE\u001fb7i1\u007fcmL\\Jq=\u001cE!f\u0010l\u001c0uC_\u007f\u001fr/%e!߶\"ܩȠ\u0006JJ.\u0005L)\ra2jHnG\u001f\u001aEs!\f\t\u000f\u0015\ty\u001clXZ]} bT\u0016\bAX\r{Jo=\u0010|\b9xxNu\nS1Ϭ;_v\u0088&Y?aA9\"\u0011\u001ehjx*>jh5^tGk\u000ep[V(h\r)TNԂ\u0378Nܟ\u0017BGs\"@:>1^\u001bP\u0011'bC\u0003\u0013me9=\rbK&\u0019hRz9\u0007^a\tq}ww23%`q\u0018٢ڐ\u0019łY2p6\u00034\u0015\f\f\u0002MvZPln\u001c\u0006c\u0007p\"(Ki/k&eȲ5ɨ\u0006-MɣC\u0001_a*)\u0011{($q-\u0005ԝŒjҔ0jrLUl%;\u000f`x9\u0016{P)oa\u0013G\u0012n;_LN\u000b\u0003\bV\u0005|;Iuǎݡ\u0001ɴ!Ĝ߿,Bے!&\u007f\u001655oj\u0002q4\u0016p,Fvk\":\u0003f)pruSK:YY-a2.|\u000bRLzy\u001eA7I;WXCtp\u0005]c\n] ֨\u000b,\u0013\u0017-ܱF݇s\n<ʝw,yj\f<~E+:[}8\u001b{vt\r`\u000e8\u0011,7|\u00174?6U\u0006h?tD8n݄ל;ك\tL\u0011&:ZJ\u0015#EZ\u0016\u0014\u0019\u001b\u0002L\r\u001d\"ϫB|CY\u0014֬\u0015\u000bUP\u0005fdȠ%y"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\u000eC`X<k@\u00029#\u00120", "", "u(E", "0qX;Z\u0010Gb#o~^>i\t;u\u007f6\u000b@\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@25`\b\u001e3|\u001a8V\r\u0018x8'\u0017LjH\u0011T0N\t\u0014GX^,jarJi", "5dc\u000fe0GU|\b\nh\u001d\u0001\tAR\u007f4\f@\u000f&\u0017T", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~f}'Ak\u0012=QMD5\u0011+\u0019qc\u001d\u0010r6?z'Y9N8lR\u0001L\u0014\u001f0", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "1na2A6=Sv\t\u0005k+\u0001\u0012+t\u007f6", "5dc\u0010b9><#}z<6\u0007\u0016.i\t$\u000b@\u000f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000f", "Adc\u0010b9><#}z<6\u0007\u0016.i\t$\u000b@\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7|w", "1na2A6=Sv\t\u0005k+\u0001\u0012+t\u007f6:?\u0001\u001e\u0017Ik\u001d<", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "2dR<e(M]&g\u0005],Z\u00139r~,\u0005<\u0010\u0017%", "5dc\u0011X*H`\u0015\u000e\u0005k\u0015\u0007\b/C\n2\t?\u0005 \u0013Vo\u001c", "Adc\u0011X*H`\u0015\u000e\u0005k\u0015\u0007\b/C\n2\t?\u0005 \u0013Vo\u001c", "2dR<e(M]&g\u0005],Z\u00139r~,\u0005<\u0010\u0017%\u0006n\u000eCv'1h}", ":`h<h;\u001cO\u0017\u0002z", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+CN\u0007G$!H\u001dJ:\rbU?'n\u001a", ":`h<h;+S'\u000f\u0002m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "5dc\u0019T@Hc(kzl<\u0004\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006e%Hhd\u001cKw&=:CI{;-j", ":`h<h;+S'\u000f\u0002mj{\t6e\u0002$\u000b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR,a\u0006\bKLU+CN\u0007G$!H\u001dJ:\rbU?'n\u001a", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", ";h]\u0015X0@V(_\u0005k\u001a\u0001\u00121l\u007f\u000f\u007fI\u0001w\u001bGv\r", "5dc\u001a\\5!S\u001d\u0001}m\r\u0007\u0016\u001di\t*\u0003@g\u001b GP\u0012<}$|8Q\u007f<=\u0017\u0016", "u(5", "Adc\u001a\\5!S\u001d\u0001}m\r\u0007\u0016\u001di\t*\u0003@g\u001b GP\u0012<}$|$Nr\u0002r\u0010|", "uE\u0018#", ";h]\u0015X0@V(_\u0005k\u001a\u0001\u00121l\u007f\u000f\u007fI\u0001w\u001bGv\rzu%<Y\u007f\u001cFm", "=mC2k;%O-\t\u000bm", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "5dc\u001ca\u001b>f(evr6\r\u0018", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJu", "Adc\u001ca\u001b>f(evr6\r\u0018", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&Sc(", "BdgA?(R])\u000ech+|f9o\r'\u007fI|&\u0017U", "5dc!X?M:\u0015\u0013\u0005n;e\u0013.e]2\u0006M\u007f\u001b C~\u000eJ", "Adc!X?M:\u0015\u0013\u0005n;e\u0013.e]2\u0006M\u007f\u001b C~\u000eJ", "BdgA?(R])\u000ech+|f9o\r'\u007fI|&\u0017U.\r<}%7U\r ", "1nT?V,=7\"o~l0y\u0010/B\n8\u0005?\u000f\u0001\u0018+x\u0019L\u0006\u00145l\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "=eU@X;", "1nT?V,=7\"o~l0y\u0010/B\n8\u0005?\u000f\u0001\u0018+x\u0019L\u0006\u00145l\rg\u001fS]\u0011b\u0017+*5(%q`5\u0016g6Wp4GSN(jR", "uI\u0018\u0017", "5dc\u001cY-LS(_\u0005k\u0017\u0007\u00173t\u00042\u0005", "", ">nb6g0H\\", "1nT?V,\"\\\n\u0003\tb)\u0004\t\fo\u00101zN", "", "5dc\u001cY-LS(_\u0005k\u0017\u0007\u00173t\u00042\u0005\bN~\u001fGW^B", "uIIu<", "7r?<f0MW#\bdg\u001b|\u001c>", "7r?<f0MW#\bdg\u001b|\u001c>-\u0006oJGla~", "uI\u0018'", ":`h<h;0W(\u0002c^>d\t+s\u00105{$\n\"'V}", "2d]@\\;R", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "1n]@g9:W\"\u000e\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", ":`h<h;0W(\u0002c^>d\t+s\u00105{$\n\"'V}U\u0004y\u0002%\\\t\u001e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\rT\u00127LPEo31^fkA\u0012m:N@7K\u0016^5`a<$\u0010&d\u001e]\n\u0011\u0012Y?3rN@tn(R\u0001Hr\u0005\u000b)W3txM`\u001eGC%y\u000b8hYh)zQJT,\u000bn\u0015n}XB>+(0\u0006\u001bvZ5\u001b{`fW\u0016`cpF&\u0005<#Q7YPMz_Jtp/OE\u0007\u0012Eg>\u001at@\u0013\u001b&Jn\u0015ZT\u0018Ln\u007f$\u0002", "CoS.g,']\"fzZ:\r\u0016/I\t3\fO\u000f", "BdgA90>Z\u0018l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri;v!>\\\r?tC\u001e\"q]@PR9J\u007f5HV[4\\Qa='!;\u0012N2\frh=3n\u001a", "BdgAF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "Ah]4_,%W\"~", "AnUAJ9:^", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextLayoutState {
    public static final int $stable = 8;
    private final BringIntoViewRequester bringIntoViewRequester;
    private final MutableState coreNodeCoordinates$delegate;
    private final MutableState decoratorNodeCoordinates$delegate;
    private TextFieldLayoutStateCache layoutCache;
    private final TextFieldLayoutStateCache layoutResult$delegate;
    private final MutableState minHeightForSingleLineField$delegate;
    private Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> onTextLayout;
    private final MutableState textLayoutNodeCoordinates$delegate;

    public TextLayoutState() {
        TextFieldLayoutStateCache textFieldLayoutStateCache = new TextFieldLayoutStateCache();
        this.layoutCache = textFieldLayoutStateCache;
        this.layoutResult$delegate = textFieldLayoutStateCache;
        this.textLayoutNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.coreNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.decoratorNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.minHeightForSingleLineField$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m6636boximpl(Dp.m6638constructorimpl(0)), null, 2, null);
        this.bringIntoViewRequester = BringIntoViewRequesterKt.BringIntoViewRequester();
    }

    public final Function2<Density, Function0<TextLayoutResult>, Unit> getOnTextLayout() {
        return this.onTextLayout;
    }

    public final void setOnTextLayout(Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2) {
        this.onTextLayout = function2;
    }

    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult$delegate.getValue();
    }

    public final LayoutCoordinates getTextLayoutNodeCoordinates() {
        return (LayoutCoordinates) this.textLayoutNodeCoordinates$delegate.getValue();
    }

    public final void setTextLayoutNodeCoordinates(LayoutCoordinates layoutCoordinates) {
        this.textLayoutNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    public final LayoutCoordinates getCoreNodeCoordinates() {
        return (LayoutCoordinates) this.coreNodeCoordinates$delegate.getValue();
    }

    public final void setCoreNodeCoordinates(LayoutCoordinates layoutCoordinates) {
        this.coreNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    public final LayoutCoordinates getDecoratorNodeCoordinates() {
        return (LayoutCoordinates) this.decoratorNodeCoordinates$delegate.getValue();
    }

    public final void setDecoratorNodeCoordinates(LayoutCoordinates layoutCoordinates) {
        this.decoratorNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getMinHeightForSingleLineField-D9Ej5fM */
    public final float m1553getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((Dp) this.minHeightForSingleLineField$delegate.getValue()).m6652unboximpl();
    }

    /* JADX INFO: renamed from: setMinHeightForSingleLineField-0680j_4 */
    public final void m1557setMinHeightForSingleLineField0680j_4(float f2) {
        this.minHeightForSingleLineField$delegate.setValue(Dp.m6636boximpl(f2));
    }

    public final BringIntoViewRequester getBringIntoViewRequester() {
        return this.bringIntoViewRequester;
    }

    public final void updateNonMeasureInputs(TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z2, boolean z3) {
        this.layoutCache.updateNonMeasureInputs(transformedTextFieldState, textStyle, z2, z3);
    }

    /* JADX INFO: renamed from: layoutWithNewMeasureInputs--hBUhpc */
    public final TextLayoutResult m1556layoutWithNewMeasureInputshBUhpc(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j2) {
        TextLayoutResult textLayoutResultM1545layoutWithNewMeasureInputshBUhpc = this.layoutCache.m1545layoutWithNewMeasureInputshBUhpc(density, layoutDirection, resolver, j2);
        Function2<? super Density, ? super Function0<TextLayoutResult>, Unit> function2 = this.onTextLayout;
        if (function2 != null) {
            function2.invoke(density, new Function0<TextLayoutResult>() { // from class: androidx.compose.foundation.text.input.internal.TextLayoutState$layoutWithNewMeasureInputs$1$textLayoutProvider$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final TextLayoutResult invoke() {
                    return this.this$0.layoutCache.getValue();
                }
            });
        }
        return textLayoutResultM1545layoutWithNewMeasureInputshBUhpc;
    }

    /* JADX INFO: renamed from: getOffsetForPosition-3MmeM6k$default */
    public static /* synthetic */ int m1551getOffsetForPosition3MmeM6k$default(TextLayoutState textLayoutState, long j2, boolean z2, int i2, Object obj) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            z2 = true;
        }
        return textLayoutState.m1554getOffsetForPosition3MmeM6k(j2, z2);
    }

    /* JADX INFO: renamed from: getOffsetForPosition-3MmeM6k */
    public final int m1554getOffsetForPosition3MmeM6k(long j2, boolean z2) {
        TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return -1;
        }
        if (z2) {
            j2 = m1552coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(j2);
        }
        return layoutResult.m6095getOffsetForPositionk4lQ0M(TextLayoutStateKt.m1559fromDecorationToTextLayoutUv8p0NA(this, j2));
    }

    /* JADX INFO: renamed from: isPositionOnText-k-4lQ0M */
    public final boolean m1555isPositionOnTextk4lQ0M(long j2) {
        TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return false;
        }
        long jM1559fromDecorationToTextLayoutUv8p0NA = TextLayoutStateKt.m1559fromDecorationToTextLayoutUv8p0NA(this, m1552coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(j2));
        int lineForVerticalPosition = layoutResult.getLineForVerticalPosition(Offset.m3938getYimpl(jM1559fromDecorationToTextLayoutUv8p0NA));
        return Offset.m3937getXimpl(jM1559fromDecorationToTextLayoutUv8p0NA) >= layoutResult.getLineLeft(lineForVerticalPosition) && Offset.m3937getXimpl(jM1559fromDecorationToTextLayoutUv8p0NA) <= layoutResult.getLineRight(lineForVerticalPosition);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x001b  */
    /* JADX INFO: renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U$foundation_release */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m1552coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r4 = r5.getTextLayoutNodeCoordinates()
            if (r4 == 0) goto L1b
            boolean r0 = r4.isAttached()
            if (r0 == 0) goto L26
            androidx.compose.ui.layout.LayoutCoordinates r3 = r5.getDecoratorNodeCoordinates()
            r2 = 0
            if (r3 == 0) goto L19
            r1 = 0
            r0 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.ui.layout.LayoutCoordinates.localBoundingBoxOf$default(r3, r4, r1, r0, r2)
        L19:
            if (r2 != 0) goto L21
        L1b:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L21:
            long r0 = androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m1558coerceIn3MmeM6k(r6, r2)
            return r0
        L26:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextLayoutState.m1552coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(long):long");
    }
}
