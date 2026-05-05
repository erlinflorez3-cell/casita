package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
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
/* JADX INFO: compiled from: Background.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯR\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0L͜P.`X2şs{J$c$wPCU0}*ޛWN}gvJ`\u000bK\u000f\u001c\u0016\u0001j2L]xk\u0012\u0017˰JoU3UoC;ftLӌP2P7*\u0005/\u001aZH>w;h[\u0010 2XphU\u001dS\u0013\u001e*\bT\u001f/#lk\\<`l\fA?'\u0011qZNUh݁\u0001M\u001bP\u001d-\u001b\u001ay\u001eYd}I]/a(\u001fR\nc+? cK|o19p\fWd|(\u0014CQ\u0016\r&|4\u0005\u001dQ\u000f0O+}\n\u0012PV2\u0006$\u0014\rj\u001f6\u0006Unt-j~\u0016\u0014Kt!Z\u0017З\u000eެF\f\u0003ʨN\u0019+\u000bA7Y\u001dl^oIihE\u007f\u001d\u000f4\"/swƃ`\u05f8d!#Ƙ\u0010S7`NMhP\u0010jK\u007fT\u0011p\u0004B\u0004^JV\u0082\bö-Ϗğ6Zޠ'/s\u0002V[\u007fx\u000bsvg\nTNU0\u0005fE8!$\\Zc3\u0005'Ӽd¯\u0015M$\u0381W\f\u0016-8^\u000e;O@fʝ[ŹmjUΪZ3=\u0003O[\u0005j<`\u0010ӗ?̳Uc\u0018Р#\u000b\"\\Tb3v=̾_݇Y٢Ξ!1ʮn\u0012\u007f{Re\\+@G\n\u001cb5\bǐhČL\u000f&ՓY~\u000f~h\t0\u0001ZT2%ǰ$}\u0011\u0004Vʶ\r\u001ef\u0001I2\u001cˉ&W"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00021W\u0004\"Dw&7L,Ej4s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9lIr7\u001dc|$8q\u0016;6M:k\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9w9\u0005%Bj}-\u001fw\u00152NG;x\u001d(\u0014h7", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "/k_5T", "", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#Z-G{\u0019\u0004.*7t3+\u001fl`LPa6V\u00021UL\u0018<`\u001ctJ\u0010\u001d]\u0012L9Vr\\=/n\u001a\u001e%\u0012;P\u0006D2\u0006\u001d\u001eW9s\u007fBc\u0019C\u0001^TA*dV`nWQJSq7t\nn'i\"61\u001aq&p,A", "5dc\u000e_7AO", "u(5", "Adc\u000e_7AO", "uE\u0018#", "5dc\u000fe<LV", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#Z-G{\u0019\u0004", "Adc\u000fe<LV", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~6\u000b0Epkq>", "5dc\u0010b3H``Iy0&b\u000e\u001f", "u(9", "Adc\u0010b3H``Qt1w\u0004\u0010\u000b", "uI\u0018#", "\u0018", ":`bA?(R])\u000eYb9|\u0007>i\n1", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ":`bAB<MZ\u001d\bz", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001fi\r';v\u0016\u0004", ":`bAF/:^\u0019", ":`bAF0SS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc [(IS", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#k#3x\u0016\u0004", "Adc [(IS", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~G\u0001\u001cBmkq>", "=m>/f,Kd\u0019}g^({\u0017\rh{1}@\u007f", "", "2qPD", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "2qPDB<MZ\u001d\bz", "2qPDE,<b", "5dc\u001ch;EW\"~", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
final class BackgroundNode extends Modifier.Node implements DrawModifierNode, ObserverModifierNode {
    private float alpha;
    private Brush brush;
    private long color;
    private LayoutDirection lastLayoutDirection;
    private Outline lastOutline;
    private Shape lastShape;
    private long lastSize;
    private Shape shape;

    public /* synthetic */ BackgroundNode(long j2, Brush brush, float f2, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, brush, f2, shape);
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU */
    public final long m574getColor0d7_KjU() {
        return this.color;
    }

    /* JADX INFO: renamed from: setColor-8_81llA */
    public final void m575setColor8_81llA(long j2) {
        this.color = j2;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final void setBrush(Brush brush) {
        this.brush = brush;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(float f2) {
        this.alpha = f2;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final void setShape(Shape shape) {
        this.shape = shape;
    }

    private BackgroundNode(long j2, Brush brush, float f2, Shape shape) {
        this.color = j2;
        this.brush = brush;
        this.alpha = f2;
        this.shape = shape;
        this.lastSize = Size.Companion.m4014getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        if (this.shape == RectangleShapeKt.getRectangleShape()) {
            drawRect(contentDrawScope);
        } else {
            drawOutline(contentDrawScope);
        }
        contentDrawScope.drawContent();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        this.lastSize = Size.Companion.m4014getUnspecifiedNHjbRc();
        this.lastLayoutDirection = null;
        this.lastOutline = null;
        this.lastShape = null;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    private final void drawRect(ContentDrawScope contentDrawScope) {
        if (!Color.m4179equalsimpl0(this.color, Color.Companion.m4214getUnspecified0d7_KjU())) {
            DrawScope.m4728drawRectnJ9OG0$default(contentDrawScope, this.color, 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
        Brush brush = this.brush;
        if (brush != null) {
            DrawScope.m4727drawRectAsUm42w$default(contentDrawScope, brush, 0L, 0L, this.alpha, null, null, 0, 118, null);
        }
    }

    private final void drawOutline(ContentDrawScope contentDrawScope) {
        Outline outline = getOutline(contentDrawScope);
        if (!Color.m4179equalsimpl0(this.color, Color.Companion.m4214getUnspecified0d7_KjU())) {
            OutlineKt.m4437drawOutlinewDX37Ww$default(contentDrawScope, outline, this.color, 0.0f, null, null, 0, 60, null);
        }
        Brush brush = this.brush;
        if (brush != null) {
            OutlineKt.m4435drawOutlinehn5TExg$default(contentDrawScope, outline, brush, this.alpha, null, null, 0, 56, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, androidx.compose.ui.graphics.Outline, java.lang.Object] */
    private final Outline getOutline(ContentDrawScope contentDrawScope) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (Size.m4002equalsimpl0(contentDrawScope.mo4734getSizeNHjbRc(), this.lastSize) && contentDrawScope.getLayoutDirection() == this.lastLayoutDirection && Intrinsics.areEqual(this.lastShape, this.shape)) {
            ?? r02 = this.lastOutline;
            Intrinsics.checkNotNull(r02);
            objectRef.element = r02;
        } else {
            ObserverModifierNodeKt.observeReads(this, new Function0<Unit>() { // from class: androidx.compose.foundation.BackgroundNode.getOutline.1
                final /* synthetic */ Ref.ObjectRef<Outline> $outline;
                final /* synthetic */ ContentDrawScope $this_getOutline;
                final /* synthetic */ BackgroundNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Ref.ObjectRef<Outline> objectRef2, BackgroundNode this, ContentDrawScope contentDrawScope2) {
                    super(0);
                    objectRef = objectRef2;
                    backgroundNode = this;
                    contentDrawScope = contentDrawScope2;
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r0v5, types: [T, androidx.compose.ui.graphics.Outline] */
                /* JADX INFO: renamed from: invoke */
                public final void invoke2() {
                    objectRef.element = backgroundNode.getShape().mo621createOutlinePq9zytI(contentDrawScope.mo4734getSizeNHjbRc(), contentDrawScope.getLayoutDirection(), contentDrawScope);
                }
            });
        }
        this.lastOutline = (Outline) objectRef2.element;
        this.lastSize = contentDrawScope2.mo4734getSizeNHjbRc();
        this.lastLayoutDirection = contentDrawScope2.getLayoutDirection();
        this.lastShape = this.shape;
        T t2 = objectRef2.element;
        Intrinsics.checkNotNull(t2);
        return (Outline) t2;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.BackgroundNode$getOutline$1 */
    /* JADX INFO: compiled from: Background.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ Ref.ObjectRef<Outline> $outline;
        final /* synthetic */ ContentDrawScope $this_getOutline;
        final /* synthetic */ BackgroundNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef<Outline> objectRef2, BackgroundNode this, ContentDrawScope contentDrawScope2) {
            super(0);
            objectRef = objectRef2;
            backgroundNode = this;
            contentDrawScope = contentDrawScope2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [T, androidx.compose.ui.graphics.Outline] */
        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            objectRef.element = backgroundNode.getShape().mo621createOutlinePq9zytI(contentDrawScope.mo4734getSizeNHjbRc(), contentDrawScope.getLayoutDirection(), contentDrawScope);
        }
    }
}
