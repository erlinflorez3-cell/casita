package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: PainterModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я~\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG9L͜P.hS2şs{J$cҕyCIZ\"Ԃ*\teNogtfb\u000bY\u000f\u000e\u0016~l4Ikxe\u0012\u00153JoM?UڎE9nt>\u000562*8\u007f\t\t\u001a8N\u0018v\u0011CSÈ\u001a0VpBR\u0013O\r\u001a(\u0006F \u0017\u001edgd6Plc=5#\u0019݃rNU^`|{\rvTU\u000e7\u001f./N9M\u0015SV\u0013\u000b`_W\u0003mvM\u000bn'51as\u0006=h\u0006\u001a\u00159W%]!/l\u000bW`\u001a1CO\u0012V`\u0016.w\t\b%>\u001a\r44ρ2-(tP&A \u000bSn|2bP-\u0013adCk\u007fƊ*ݍӸjSgi'}\u007f\u0014\u0013=6#/ Q_b@x\u0015I\u0006>QƱP̵ףLP\u0010\rK\u001dLvp6B\u0004^|FCD\u001b<M=7\npK!\u001a:\u000fX0\u000b\u0013\u001a\u0001S\u0018Wp@P\u001b\\7Ӡ\bȱʑHf\u000b&^\u0010!@\u001f\n4T5\u00030\u0013N\t><Ȓ$īʽSjo([\u0019R?=%OY\u001d+6Wg\u001fc9_%(a\u00019DCJ&\u001dX\u0015\u0002\u001a #v6fJH\u0019O {r\u000f<\u0017@\u0001\n\u001cbna\u001djZ`\u0003L\u0002\b\u0011Q\u0004h/(~\u0003zL\u0003\u0018l%\r\u000f\u0012tp\u001e1)M:/x\"[r\u0018Iՠ%Şɋl6\u0003m\u0015J<\u001aU4dGz,>u\u0004<P\u001a(zi/kU?\u00037u\u001a-s\f9y\u001ag t\u0013|(Nch\\(8n~mxjx\u0012\u0005\u001b0<vrQG+\u0014JyT\u0001_c\u0003\u00122ųU\u03a2\u0007eDѾP~\u000b.,5!q(\u000eC?\u0014?+ \u0010\u0014] 8ӧuܓ2\u0006jχ>vk\u0017:w6qhfkH\fRWe\u0017@8#\u001b\u0010\u0019לv͎\fN\u0011ͩ%5NXr\tv:S$=\u00187\u001f:\u0015\tV\nCȋ\nӑ2k2ϒ[\u007f\u001ayQA1OY\u0005{\f\u001ct\u0019L'\n9~\b\u07b2\u001eεA,^̰z\u000b6%\u00028VCA\u0004\u0013^Y6BOT\b9H\u000b>\\آ|ķJc'\u00198f\u0002`'&b|tVv\n7ѫlՃ.\r\u0007۰K ~[?*\u000eHZVqZQe+23j}\u0004\u001de\u0002ןVۆ\u001f,p\u0003\u0011okh̵\u0002;\fJ/Ը\b\u001e\u000bխ\u001cK"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Y9x8z.DY\u000b\tAl\u0016\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehe*6q\u00172MP$u3\u001ej", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9lIr7\u001dc|$8q\u0016;6M:k\n", ">`X;g,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n@U\u0002)Fm#w8??tC\u001e\">", "Ahi2G6\"\\(\f~g:\u0001\u0007=", "", "/kX4a4>\\(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\\\u001e\u001bIx\u0016<\u007f4\u000b", "1n]AX5MA\u0017z\u0002^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006T/>h})F[\u0014*TC\u0011", "/k_5T", "", "1n[<e\rBZ(~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~dy$@|\u0016;\u0017.7o=-\u0015u7.m_5M\u00041KKauZ\\zH\u001e ZW^/V``E&wL7(\u0017\u00020}Dg\u000e\u0016\u001a\rH4nL^\u001bQ\b\u0015?Q-2MUs\u0004WP\u000f@4m\u001b_&k(8 \u001bqn{OL7\t\t]\u0015qeCeqO$\u0005F$\b}_\u0010G|QGw+\u001dYEU\u001c9b\u0002\fx4\u001347\f(u", "5dc\u000e_0@\\!~\u0004m", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`rNs\u0010E~%>hS", "Adc\u000e_0@\\!~\u0004m", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJr\u001eKq\u0017Dv.D/A\u0011", "5dc\u000e_7AO", "u(5", "Adc\u000e_7AO", "uE\u0018#", "5dc\u0010b3H`y\u0003\u0002m,\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#[*>w#\u000fQJJkAs", "Adc\u0010b3H`y\u0003\u0002m,\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7\b'Azv2TR;x\na\u0006", "5dc\u0010b5MS\"\u000eh\\(\u0004\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u0013c\u0007/7v%\u001cK?Bk\n", "Adc\u0010b5MS\"\u000eh\\(\u0004\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\u0003?b\r @|\u0004,IJ;Aw\u000f", "5dc\u001dT0Gb\u0019\f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#\t\u001c;v%.Z\r&g8'$hn\u000f", "Adc\u001dT0Gb\u0019\f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~dy$@|\u0016;\u0017.7o=-\u0015u7|w", "Ag^B_+\u001ac(\t^g=x\u00103d{7{", "5dc [6NZ\u0018Z\u000bm6`\u0012@a\u0007,z<\u0010\u0017", "u(I", "5dc \\A>B#b\u0004m9\u0001\u0012=i}6", "Adc \\A>B#b\u0004m9\u0001\u0012=i}6", "uY\u0018#", "CrT\u0016a;KW\"\r~\\\u001a\u0001\u001e/", "5dc\"f,\"\\(\f~g:\u0001\u0007\u001di\u0015(", "1`[0h3:b\u0019lxZ3|\b\u001di\u0015(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "2rc \\A>", "1`[0h3:b\u0019lxZ3|\b\u001di\u0015(C R|*8Z}", "uI\u0018\u0017", ";nS6Y@\u001c]\"\r\nk(\u0001\u0012>s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "1n]@g9:W\"\u000e\t", ";nS6Y@\u001c]\"\r\nk(\u0001\u0012>sG\u001d{Ui\u0001e/", "BnBAe0GU", "", "2qPD", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "6`b c,<W\u001a\u0003z]\b\u0006\b\u0010i\t,\u000b@c\u0017\u001bIr\u001d", "6`b c,<W\u001a\u0003z]\b\u0006\b\u0010i\t,\u000b@c\u0017\u001bIr\u001d\u0004\u00076IM[%=", "uI\u0018'", "6`b c,<W\u001a\u0003z]\b\u0006\b\u0010i\t,\u000b@r\u001b\u0016Vr", "6`b c,<W\u001a\u0003z]\b\u0006\b\u0010i\t,\u000b@r\u001b\u0016VrUL\b9)7\u0003&", ";`g\u0016a;KW\"\r~\\\u000f|\r1h\u000f", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001e\u0003fkD\u00079", ";dP@h9:P ~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006Z.Df\u0002)Eq\u0014\u0016M?I{A\u001a\u0012oa\u000f", "EhSA[", ";`g\u0016a;KW\"\r~\\\u001e\u0001\b>h", "6dX4[;", ";dP@h9>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7Z\u0016<]JJA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-7[\u00148XC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006^%1g\u000e-3j\u001d.#", ";dP@h9>\u001bf\nGl~G\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\r5U\f0Dm\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0019V\"X;\u001cNAA |TD\u001b\u00053IW ,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCN=Yl:sUG\u001dXHJ1\u0014^\u0019)xW=_", ";h]\u0016a;KW\"\r~\\\u000f|\r1h\u000f", ";h]\u0016a;KW\"\r~\\\u001e\u0001\b>h", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    public final void setPainter(Painter painter) {
        this.painter = painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public final void setSizeToIntrinsics(boolean z2) {
        this.sizeToIntrinsics = z2;
    }

    public /* synthetic */ PainterNode(Painter painter, boolean z2, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter, z2, (4 & i2) != 0 ? Alignment.Companion.getCenter() : alignment, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? ContentScale.Companion.getInside() : contentScale, (i2 + 16) - (16 | i2) != 0 ? 1.0f : f2, (i2 & 32) != 0 ? null : colorFilter);
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final void setContentScale(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(float f2) {
        this.alpha = f2;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public PainterNode(Painter painter, boolean z2, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z2;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f2;
        this.colorFilter = colorFilter;
    }

    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.mo4855getIntrinsicSizeNHjbRc() != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo428measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableMo5514measureBRTryo0 = measurable.mo5514measureBRTryo0(m3832modifyConstraintsZezNO4M(j2));
        return MeasureScope.layout$default(measureScope, placeableMo5514measureBRTryo0.getWidth(), placeableMo5514measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
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
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5514measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicWidth(i2);
        }
        long jM3832modifyConstraintsZezNO4M = m3832modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null));
        return Math.max(Constraints.m6593getMinWidthimpl(jM3832modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicWidth(i2);
        }
        long jM3832modifyConstraintsZezNO4M = m3832modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null));
        return Math.max(Constraints.m6593getMinWidthimpl(jM3832modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicHeight(i2);
        }
        long jM3832modifyConstraintsZezNO4M = m3832modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null));
        return Math.max(Constraints.m6592getMinHeightimpl(jM3832modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicHeight(i2);
        }
        long jM3832modifyConstraintsZezNO4M = m3832modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null));
        return Math.max(Constraints.m6592getMinHeightimpl(jM3832modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i2));
    }

    /* JADX INFO: renamed from: calculateScaledSize-E7KxVPU */
    private final long m3829calculateScaledSizeE7KxVPU(long j2) {
        float fM4006getWidthimpl;
        float fM4003getHeightimpl;
        if (getUseIntrinsicSize()) {
            if (!m3831hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.mo4855getIntrinsicSizeNHjbRc())) {
                fM4006getWidthimpl = Size.m4006getWidthimpl(j2);
            } else {
                fM4006getWidthimpl = Size.m4006getWidthimpl(this.painter.mo4855getIntrinsicSizeNHjbRc());
            }
            if (!m3830hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.mo4855getIntrinsicSizeNHjbRc())) {
                fM4003getHeightimpl = Size.m4003getHeightimpl(j2);
            } else {
                fM4003getHeightimpl = Size.m4003getHeightimpl(this.painter.mo4855getIntrinsicSizeNHjbRc());
            }
            long jSize = SizeKt.Size(fM4006getWidthimpl, fM4003getHeightimpl);
            if (Size.m4006getWidthimpl(j2) != 0.0f && Size.m4003getHeightimpl(j2) != 0.0f) {
                return ScaleFactorKt.m5618timesUQTWf7w(jSize, this.contentScale.mo5505computeScaleFactorH7hwNQA(jSize, j2));
            }
            return Size.Companion.m4015getZeroNHjbRc();
        }
        return j2;
    }

    /* JADX INFO: renamed from: modifyConstraints-ZezNO4M */
    private final long m3832modifyConstraintsZezNO4M(long j2) {
        int iM6593getMinWidthimpl;
        int iM6592getMinHeightimpl;
        boolean z2 = Constraints.m6587getHasBoundedWidthimpl(j2) && Constraints.m6586getHasBoundedHeightimpl(j2);
        boolean z3 = Constraints.m6589getHasFixedWidthimpl(j2) && Constraints.m6588getHasFixedHeightimpl(j2);
        if ((!getUseIntrinsicSize() && z2) || z3) {
            return Constraints.m6582copyZbe2FdA$default(j2, Constraints.m6591getMaxWidthimpl(j2), 0, Constraints.m6590getMaxHeightimpl(j2), 0, 10, null);
        }
        long jMo4855getIntrinsicSizeNHjbRc = this.painter.mo4855getIntrinsicSizeNHjbRc();
        if (!m3831hasSpecifiedAndFiniteWidthuvyYCjk(jMo4855getIntrinsicSizeNHjbRc)) {
            iM6593getMinWidthimpl = Constraints.m6593getMinWidthimpl(j2);
        } else {
            iM6593getMinWidthimpl = Math.round(Size.m4006getWidthimpl(jMo4855getIntrinsicSizeNHjbRc));
        }
        if (!m3830hasSpecifiedAndFiniteHeightuvyYCjk(jMo4855getIntrinsicSizeNHjbRc)) {
            iM6592getMinHeightimpl = Constraints.m6592getMinHeightimpl(j2);
        } else {
            iM6592getMinHeightimpl = Math.round(Size.m4003getHeightimpl(jMo4855getIntrinsicSizeNHjbRc));
        }
        long jM3829calculateScaledSizeE7KxVPU = m3829calculateScaledSizeE7KxVPU(SizeKt.Size(ConstraintsKt.m6608constrainWidthK40F9xA(j2, iM6593getMinWidthimpl), ConstraintsKt.m6607constrainHeightK40F9xA(j2, iM6592getMinHeightimpl)));
        return Constraints.m6582copyZbe2FdA$default(j2, ConstraintsKt.m6608constrainWidthK40F9xA(j2, Math.round(Size.m4006getWidthimpl(jM3829calculateScaledSizeE7KxVPU))), 0, ConstraintsKt.m6607constrainHeightK40F9xA(j2, Math.round(Size.m4003getHeightimpl(jM3829calculateScaledSizeE7KxVPU))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        float fM4006getWidthimpl;
        float fM4003getHeightimpl;
        long jM5618timesUQTWf7w;
        long jMo4855getIntrinsicSizeNHjbRc = this.painter.mo4855getIntrinsicSizeNHjbRc();
        if (m3831hasSpecifiedAndFiniteWidthuvyYCjk(jMo4855getIntrinsicSizeNHjbRc)) {
            fM4006getWidthimpl = Size.m4006getWidthimpl(jMo4855getIntrinsicSizeNHjbRc);
        } else {
            fM4006getWidthimpl = Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc());
        }
        if (m3830hasSpecifiedAndFiniteHeightuvyYCjk(jMo4855getIntrinsicSizeNHjbRc)) {
            fM4003getHeightimpl = Size.m4003getHeightimpl(jMo4855getIntrinsicSizeNHjbRc);
        } else {
            fM4003getHeightimpl = Size.m4003getHeightimpl(contentDrawScope.mo4734getSizeNHjbRc());
        }
        long jSize = SizeKt.Size(fM4006getWidthimpl, fM4003getHeightimpl);
        if (Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc()) != 0.0f && Size.m4003getHeightimpl(contentDrawScope.mo4734getSizeNHjbRc()) != 0.0f) {
            jM5618timesUQTWf7w = ScaleFactorKt.m5618timesUQTWf7w(jSize, this.contentScale.mo5505computeScaleFactorH7hwNQA(jSize, contentDrawScope.mo4734getSizeNHjbRc()));
        } else {
            jM5618timesUQTWf7w = Size.Companion.m4015getZeroNHjbRc();
        }
        long jMo3783alignKFBX0sM = this.alignment.mo3783alignKFBX0sM(IntSizeKt.IntSize(Math.round(Size.m4006getWidthimpl(jM5618timesUQTWf7w)), Math.round(Size.m4003getHeightimpl(jM5618timesUQTWf7w))), IntSizeKt.IntSize(Math.round(Size.m4006getWidthimpl(contentDrawScope.mo4734getSizeNHjbRc())), Math.round(Size.m4003getHeightimpl(contentDrawScope.mo4734getSizeNHjbRc()))), contentDrawScope.getLayoutDirection());
        float fM6766getXimpl = IntOffset.m6766getXimpl(jMo3783alignKFBX0sM);
        float fM6767getYimpl = IntOffset.m6767getYimpl(jMo3783alignKFBX0sM);
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        contentDrawScope2.getDrawContext().getTransform().translate(fM6766getXimpl, fM6767getYimpl);
        try {
            this.painter.m4861drawx_KDEd0(contentDrawScope2, jM5618timesUQTWf7w, this.alpha, this.colorFilter);
            contentDrawScope2.getDrawContext().getTransform().translate(-fM6766getXimpl, -fM6767getYimpl);
            contentDrawScope.drawContent();
        } catch (Throwable th) {
            contentDrawScope2.getDrawContext().getTransform().translate(-fM6766getXimpl, -fM6767getYimpl);
            throw th;
        }
    }

    /* JADX INFO: renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk */
    private final boolean m3831hasSpecifiedAndFiniteWidthuvyYCjk(long j2) {
        if (!Size.m4002equalsimpl0(j2, Size.Companion.m4014getUnspecifiedNHjbRc())) {
            float fM4006getWidthimpl = Size.m4006getWidthimpl(j2);
            if (!Float.isInfinite(fM4006getWidthimpl) && !Float.isNaN(fM4006getWidthimpl)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk */
    private final boolean m3830hasSpecifiedAndFiniteHeightuvyYCjk(long j2) {
        if (!Size.m4002equalsimpl0(j2, Size.Companion.m4014getUnspecifiedNHjbRc())) {
            float fM4003getHeightimpl = Size.m4003getHeightimpl(j2);
            if (!Float.isInfinite(fM4003getHeightimpl) && !Float.isNaN(fM4003getHeightimpl)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
