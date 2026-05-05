package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007lkA0ZeP\u008cZS@\u000fs{J$c$\u007fCCU0}*ޛWN}gvJ`\u0011K\u000f\u001c\u0016\u0001j2L]xk\u001b\u0017˰JoM?UoC<htL\u0005(2(:\u0002\u0005\u000f\u001f2H\u0016\u0003\u0001ŏaÈB0noz]\u001dQ\u0013\u001a*\u0006l!Ә\"\\uP~Nz\u0012R/Q\u000f0B\u0017-me\u0015M;f\u001b;U\u0001oTC@eA=%\u0002\u000eMf$Y\u0011u\n=3tO'YT$[D\u0010\u0018\u0014CV\u007f\u0013k+>^\u001bP\u000f\u001bwC]fcP<,.9Rȟ>ɂ\rͺТG-ǉ\u001ej \u00109y\u0001Y\u0011\\\u0010eZ\u007f)i\rА'ő7+Aӕ7noD1_G}\u0015\rL.\u0011p1[\u0003\u001a\u000f\u001fôXwW>(̸?˓R\naƝ>1~r\u001a,\u001a/u\u000f_\u0002\u001f</'MZg2W*@\u0007\u001bϚЇ\u0005¾lcqTNU0\u0005.90\u001a\u001aldf\u000b~^h)J\u001fd4Z\u0017\u007f\u0018\u0013Nh&Twظ\u001cʽStqҔe_\u0010>=\u0001W[t\u0007\u001cs\njARic>\u007f)Λ ͖@b\r֚7Za+r\\VB\tʒvݻ{\bL\u0088$\u00158`\u007f>T.7<j9\u0019\u0017,gY|7\u00061ӓ\u001cҰS՜˭\u0002h˨x\u000b\tPj\u0018@v\u0007ID|\u000f#έEW=ӧ>W(\u0011B&s\u0013\r\u001e\u0018G\u0016w\u001eƅxטyU\u0004\u008df&G}G=A:UǾ>ī1ETǩ6_[??|\u0013x=J?֮sŰnp4ߌ;y]\u0003/\"%\u0005#'\u0016r\u0018y\u0010l1\u0006\"\u0013a϶ŻIϸ\u0002ʛÚM7٫\t/&'\u0007#0\u0013M/IV+F\u0018\u00165Fo\u0010ɓo7\u0002e\u0015\u0590\u0011\u0014\u00034c\u001c\u000f͎U\u0017"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA{\u001fplC\u0010c5]L", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001f6M:k\n", "@n^A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0010ZMKv\u0012(\u001dskB\u0007l;$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~j}\u001eFw#w/PE{?{\u001fplC\u0010c5]Lj8", "1`R5X\tBb!z\u0006<6\u0006\n3g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FI>'\u0016lc\u000f", "5dc\u0010T*ASu\u0003\nf(\bf9n\u0001,}\bz%\bU}\u0010(559S\u000b >m\u0012<M", "u(8", "1`R5X\u000bKO+lxh7|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\rZ?MI0\u001c\u0018h7", "2qPDI,<b#\fWe6z\u000f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "7mc?\\5LW\u0017\\\u0005e6\ni3l\u000f(\t", "5dc\u0016a;KW\"\r~\\\n\u0007\u00109r`,\u0003O\u0001$UWs\bIv,5U\f ", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#[*>w#\u000fQJJkAs", "Adc\u0016a;KW\"\r~\\\n\u0007\u00109r`,\u0003O\u0001$UWs\bIv,5U\f ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7\b'Azv2TR;x\na\u0006", "7mc?\\5LW\u0017\\\u0005e6\ni3l\u000f(\t~\u007f\u0017\u001eGq\nKv", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "7me._0=O(~XZ3\u0004\u0006+c\u0006", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "5dc\u0016a=:Z\u001d}vm,Z\u00056l|$yF?'\u001bA|\u000eCv!CY", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "Adc\u0016a=:Z\u001d}vm,Z\u00056l|$yF?'\u001bA|\u000eCv!CY", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>$Sc(", "7r36e;R", "", "<`\\2", "", "5dc\u001bT4>", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u001bT4>", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", ">qTC\\6Naw\fvp\u001a\u0001\u001e/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "\u0018", "5dc\u001fb6M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#\u000f 5| ;\u0017%HuD)rriD\u0011l,W\u0006|", "@n^AF*:Z\u0019q", "", "@n^AF*:Z\u0019r", "Bh]A90Eb\u0019\f", "DhTDc6Kb\u0007\u0003\u0010^", "5dc#\\,P^#\f\nL0\u0012\tvNbo\u0001=m\u0015UWs\bIv,5U\f ", "u(9", "Adc#\\,P^#\f\nL0\u0012\tvu\u0011<o\u001e\u0006\u001dUWs\bIv,5U\f ", "uI\u0018#", "DhTDc6Kb\u0007\u0003\u0010^j{\t6e\u0002$\u000b@", "2n8;i(EW\u0018z\n^", "BnBAe0GU", "2qPD", "/k_5T", "1n[<e\rBZ(~\b", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class VectorComponent extends VNode {
    public static final int $stable = 8;
    private final DrawCache cacheDrawScope;
    private final Function1<DrawScope, Unit> drawVectorBlock;
    private final MutableState intrinsicColorFilter$delegate;
    private Function0<Unit> invalidateCallback;
    private boolean isDirty;
    private String name;
    private long previousDrawSize;
    private final GroupComponent root;
    private float rootScaleX;
    private float rootScaleY;
    private ColorFilter tintFilter;
    private final MutableState viewportSize$delegate;

    public VectorComponent(GroupComponent groupComponent) {
        super(null);
        this.root = groupComponent;
        groupComponent.setInvalidateListener$ui_release(new Function1<VNode, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(VNode vNode) {
                invoke2(vNode);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(VNode vNode) {
                VectorComponent.this.doInvalidate();
            }
        });
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new DrawCache();
        this.invalidateCallback = new Function0<Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$invalidateCallback$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        this.intrinsicColorFilter$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.viewportSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m3994boximpl(Size.Companion.m4015getZeroNHjbRc()), null, 2, null);
        this.previousDrawSize = Size.Companion.m4014getUnspecifiedNHjbRc();
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$drawVectorBlock$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                GroupComponent root = this.this$0.getRoot();
                VectorComponent vectorComponent = this.this$0;
                float f2 = vectorComponent.rootScaleX;
                float f3 = vectorComponent.rootScaleY;
                long jM3953getZeroF1C5BW0 = Offset.Companion.m3953getZeroF1C5BW0();
                DrawContext drawContext = drawScope.getDrawContext();
                long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo4662scale0AR0LA0(f2, f3, jM3953getZeroF1C5BW0);
                    root.draw(drawScope);
                } finally {
                    drawContext.getCanvas().restore();
                    drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
                }
            }
        };
    }

    public final GroupComponent getRoot() {
        return this.root;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doInvalidate() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    /* JADX INFO: renamed from: getCacheBitmapConfig-_sVssgQ$ui_release, reason: not valid java name */
    public final int m4879getCacheBitmapConfig_sVssgQ$ui_release() {
        ImageBitmap mCachedImage = this.cacheDrawScope.getMCachedImage();
        return mCachedImage != null ? mCachedImage.mo4045getConfig_sVssgQ() : ImageBitmapConfig.Companion.m4399getArgb8888_sVssgQ();
    }

    public final Function0<Unit> getInvalidateCallback$ui_release() {
        return this.invalidateCallback;
    }

    public final void setInvalidateCallback$ui_release(Function0<Unit> function0) {
        this.invalidateCallback = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return (ColorFilter) this.intrinsicColorFilter$delegate.getValue();
    }

    public final void setIntrinsicColorFilter$ui_release(ColorFilter colorFilter) {
        this.intrinsicColorFilter$delegate.setValue(colorFilter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getViewportSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m4880getViewportSizeNHjbRc$ui_release() {
        return ((Size) this.viewportSize$delegate.getValue()).m4011unboximpl();
    }

    /* JADX INFO: renamed from: setViewportSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m4881setViewportSizeuvyYCjk$ui_release(long j2) {
        this.viewportSize$delegate.setValue(Size.m3994boximpl(j2));
    }

    public final void draw(DrawScope drawScope, float f2, ColorFilter colorFilter) {
        int iM4399getArgb8888_sVssgQ;
        if (this.root.isTintable() && this.root.m4864getTintColor0d7_KjU() != 16 && VectorKt.tintableWithAlphaMask(getIntrinsicColorFilter$ui_release()) && VectorKt.tintableWithAlphaMask(colorFilter)) {
            iM4399getArgb8888_sVssgQ = ImageBitmapConfig.Companion.m4398getAlpha8_sVssgQ();
        } else {
            iM4399getArgb8888_sVssgQ = ImageBitmapConfig.Companion.m4399getArgb8888_sVssgQ();
        }
        if (this.isDirty || !Size.m4002equalsimpl0(this.previousDrawSize, drawScope.mo4734getSizeNHjbRc()) || !ImageBitmapConfig.m4394equalsimpl0(iM4399getArgb8888_sVssgQ, m4879getCacheBitmapConfig_sVssgQ$ui_release())) {
            this.tintFilter = ImageBitmapConfig.m4394equalsimpl0(iM4399getArgb8888_sVssgQ, ImageBitmapConfig.Companion.m4398getAlpha8_sVssgQ()) ? ColorFilter.Companion.m4219tintxETnrds$default(ColorFilter.Companion, this.root.m4864getTintColor0d7_KjU(), 0, 2, null) : null;
            this.rootScaleX = Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc()) / Size.m4006getWidthimpl(m4880getViewportSizeNHjbRc$ui_release());
            this.rootScaleY = Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc()) / Size.m4003getHeightimpl(m4880getViewportSizeNHjbRc$ui_release());
            this.cacheDrawScope.m4862drawCachedImageFqjB98A(iM4399getArgb8888_sVssgQ, IntSizeKt.IntSize((int) Math.ceil(Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc())), (int) Math.ceil(Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc()))), drawScope, drawScope.getLayoutDirection(), this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = drawScope.mo4734getSizeNHjbRc();
        }
        if (colorFilter == null) {
            if (getIntrinsicColorFilter$ui_release() != null) {
                colorFilter = getIntrinsicColorFilter$ui_release();
            } else {
                colorFilter = this.tintFilter;
            }
        }
        this.cacheDrawScope.drawInto(drawScope, f2, colorFilter);
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope) {
        draw(drawScope, 1.0f, null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.name).append("\n\tviewportWidth: ");
        sb.append(Size.m4006getWidthimpl(m4880getViewportSizeNHjbRc$ui_release())).append("\n\tviewportHeight: ");
        sb.append(Size.m4003getHeightimpl(m4880getViewportSizeNHjbRc$ui_release())).append("\n");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
