package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composition;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
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
/* JADX INFO: compiled from: VectorPainter.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u001b\u007f\u0007lpA0ZeP.XT2\u000f\u0002{<$a'yCIZ\"Ԃ*\teNo˧vJh\u0011K\u000f\f\u001b\u0001jBI]xc\u0018\u00172P{G3SxE9vt>\u0005&:*8\b\u0005\t\u001a@H\u0018͌\u0001HaÈB0noza\u0013˟\u0015 \u0018\u0006L \u0019\u001e\u000bhߑ:Hz_\u0003=1A\u0002B|+\u00104\u000b\r%F\u0003>S\t*.9\u0001O5C)\u0004\t\u0015\u0014sA\u0019> VKzo19\f\fWd\u001c(\u0014Co\u0016\u001f.\u001c4a\u001dQ\u000f\u0010W/]fcP<,.9:K\u0013Ǌ؉\u0006όL>5\u001cl\u0012\u001c>\rtYF^\t~D\u0006\u0003o?g=\u000e?C9Is\b \u0012ϋPӒz˜۵\u001d\"ъr%sV\u0014n#*%\u0012_AiBSG|\u001b0ƞyձtn\nÏ\u001c2M\u0012=\u000f10\u001d9Ep\n//\u0002\u001aHr~MݖlĈWiZ̲\u00110|.O,\u001f\u000b\t];ʐwÏXX4Ҋ\u001e(b!\u0016\bA;3ɿHƼ)\u0010Vи9\u0010xju\f;.\u0015P\nty*o;t2cj\u001aN \u0011MܞKםf\u000fphHq\u001ay|*(RV\f`\u0010\nff\fAUuFrِ.״\u0018¢ŢG\u0002ٿFE\u0015\u000be~v5O}AJ\u001biR\u00109\u0005^_\to\u0016\u0014\u007fl;!x\u038dۚQڤ\u001d6]$n^\u000bN\u001f\u0001y'UvlIR\u0015$\u001f&\u001e.C29\u007f[m\u0017\u001d\u001bA20Y{\u000b1$(˨\u001eؠ~\u0007\u0012\u0011A\u0017<\u0017(lv\\n\u001c\u001b~bI:v\r\u0016S\fr\u0003\u0012at\u001e}\"\u0013I2ŭσrľXߢӷ7{ġ#.-\u0003uX\u000b@EE-P$\u001d41\u001b\u0016k\u001f@@\b\u001a'&#\u001eZϻe݁shYϡJ=>\u0003g9\u000fJ2(\u001bBv\u000e(\fP%L\rakw#/\u0015\u000fԈ\u0017ʹ|օ÷+\f\u0080ZeR\u0015u:BS\u007f,y\u0001\fIٮC.\u0019PYܬ\n\u001cJd\u000bP.Ё\u000fA"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA\t\u0011ljH\u0007p\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n@U\u0002)Fm#w8??tC\u001e\">", "@n^A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u0010ZMKv\u0012(\u001dskB\u0007l;$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~j}\u001eFw#w/PE{?{\u001fplC\u0010c5]Lj8", "\nrTA \u0006\u0017", "", "/tc<@0K`#\f", "5dc\u000eh;H;\u001d\f\bh9;\u00193_\r(\u0003@|%\u0017", "u(I", "Adc\u000eh;H;\u001d\f\bh9;\u00193_\r(\u0003@|%\u0017", "uY\u0018#", "/tc<@0K`#\f9],\u0004\t1a\u000f(", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "0hc:T7\u001c]\"\u007f~`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FI>'\u0016lc\u000f", "5dc\u000f\\;FO$\\\u0005g-\u0001\u000bv_\u000e\u0019\nN\u0003\u0003UWs\bIv,5U\f ", "u(8", "1n\\=b:Bb\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0004", "5dc\u0010b4I]'\u0003\nb6\u0006G?iy5{G\u0001\u0013%G", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.;|\u001a8V\u0019", "Adc\u0010b4I]'\u0003\nb6\u0006G?iy5{G\u0001\u0013%G", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f$Fq 7#\u0007,", "1ta?X5M/ \n}Z", "", "1ta?X5M1#\u0006\u0005k\r\u0001\u0010>e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "2qPD66N\\(", "", "D`[BX", "7mc?\\5LW\u0017\\\u0005e6\ni3l\u000f(\t", "5dc\u0016a;KW\"\r~\\\n\u0007\u00109r`,\u0003O\u0001$UWs\bIv,5U\f ", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#[*>w#\u000fQJJkAs", "Adc\u0016a;KW\"\r~\\\n\u0007\u00109r`,\u0003O\u0001$UWs\bIv,5U\f ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7\b'Azv2TR;x\na\u0006", "7mc?\\5LW\u0017l~s,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc\u0016a;KW\"\r~\\\u001a\u0001\u001e/-h\u000bCE}\u0004\u0015", "u(9", "7me._0=O(~Xh<\u0006\u0018", "5dc\u0016a=:Z\u001d}vm,Z\u0013?n\u000f", "Adc\u0016a=:Z\u001d}vm,Z\u0013?n\u000f", "uH\u0018#", "7me._0=O(~Xh<\u0006\u0018md\u007f/{B|&\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0004@|\u0004=IR;A", "", "<`\\2", "5dc\u001bT4>\u0012)\u0003tk,\u0004\t+s\u007f", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u001bT4>\u0012)\u0003tk,\u0004\t+s\u007f", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "Ahi2", "5dc \\A>\u001b\u0002aBc)i\u0007mu\u0004\"\t@\b\u0017\u0013Uo", "Adc \\A>\u001b)\u0010\u000fR\n\u0002\u000fmu\u0004\"\t@\b\u0017\u0013Uo", "uI\u0018#", "Ahi2\u0017+>Z\u0019\u0001vm,", "DdRAb9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\u001fMAJuA{\u001fplC\u0010c5]L", "5dc#X*M]&=\u000bb&\n\t6e{6{", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#\u000f 5| ;\u00174;iC(\"FkA\u0012m5N\u007f6\u001d", "DhTDc6Kb\u0007\u0003\u0010^", "5dc#\\,P^#\f\nL0\u0012\tvNbo\u0001=m\u0015UWs\bIv,5U\f ", "Adc#\\,P^#\f\nL0\u0012\tvu\u0011<o\u001e\u0006\u001dUWs\bIv,5U\f ", "/o_9l\bE^\u001cz", "/k_5T", "/o_9l\nHZ#\f[b3\f\t<", "1n[<e\rBZ(~\b", "=m3?T>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class VectorPainter extends Painter {
    public static final int $stable = 8;
    private final MutableState autoMirror$delegate;
    private Composition composition;
    private float currentAlpha;
    private ColorFilter currentColorFilter;
    private int drawCount;
    private final MutableIntState invalidateCount$delegate;
    private final MutableState size$delegate;
    private final VectorComponent vector;

    public VectorPainter() {
        this(null, 1, null);
    }

    public VectorPainter(GroupComponent groupComponent) {
        this.size$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m3994boximpl(Size.Companion.m4015getZeroNHjbRc()), null, 2, null);
        this.autoMirror$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        VectorComponent vectorComponent = new VectorComponent(groupComponent);
        vectorComponent.setInvalidateCallback$ui_release(new Function0<Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainter$vector$1$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.this$0.drawCount == this.this$0.getInvalidateCount()) {
                    VectorPainter vectorPainter = this.this$0;
                    vectorPainter.setInvalidateCount(vectorPainter.getInvalidateCount() + 1);
                }
            }
        });
        this.vector = vectorComponent;
        this.invalidateCount$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.currentAlpha = 1.0f;
        this.drawCount = -1;
    }

    public /* synthetic */ VectorPainter(GroupComponent groupComponent, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((-1) - (((-1) - i2) | ((-1) - 1)) != 0 ? new GroupComponent() : groupComponent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSize-NH-jbRc$ui_release */
    public final long m4888getSizeNHjbRc$ui_release() {
        return ((Size) this.size$delegate.getValue()).m4011unboximpl();
    }

    /* JADX INFO: renamed from: setSize-uvyYCjk$ui_release */
    public final void m4890setSizeuvyYCjk$ui_release(long j2) {
        this.size$delegate.setValue(Size.m3994boximpl(j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getAutoMirror$ui_release() {
        return ((Boolean) this.autoMirror$delegate.getValue()).booleanValue();
    }

    public final void setAutoMirror$ui_release(boolean z2) {
        this.autoMirror$delegate.setValue(Boolean.valueOf(z2));
    }

    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return this.vector.getIntrinsicColorFilter$ui_release();
    }

    public final void setIntrinsicColorFilter$ui_release(ColorFilter colorFilter) {
        this.vector.setIntrinsicColorFilter$ui_release(colorFilter);
    }

    /* JADX INFO: renamed from: getViewportSize-NH-jbRc$ui_release */
    public final long m4889getViewportSizeNHjbRc$ui_release() {
        return this.vector.m4880getViewportSizeNHjbRc$ui_release();
    }

    /* JADX INFO: renamed from: setViewportSize-uvyYCjk$ui_release */
    public final void m4891setViewportSizeuvyYCjk$ui_release(long j2) {
        this.vector.m4881setViewportSizeuvyYCjk$ui_release(j2);
    }

    public final String getName$ui_release() {
        return this.vector.getName();
    }

    public final void setName$ui_release(String str) {
        this.vector.setName(str);
    }

    public final VectorComponent getVector$ui_release() {
        return this.vector;
    }

    /* JADX INFO: renamed from: getBitmapConfig-_sVssgQ$ui_release */
    public final int m4887getBitmapConfig_sVssgQ$ui_release() {
        return this.vector.m4879getCacheBitmapConfig_sVssgQ$ui_release();
    }

    public final Composition getComposition$ui_release() {
        return this.composition;
    }

    public final void setComposition$ui_release(Composition composition) {
        this.composition = composition;
    }

    public final int getInvalidateCount() {
        return this.invalidateCount$delegate.getIntValue();
    }

    public final void setInvalidateCount(int i2) {
        this.invalidateCount$delegate.setIntValue(i2);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo4855getIntrinsicSizeNHjbRc() {
        return m4888getSizeNHjbRc$ui_release();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void onDraw(DrawScope drawScope) {
        VectorComponent vectorComponent = this.vector;
        ColorFilter intrinsicColorFilter$ui_release = this.currentColorFilter;
        if (intrinsicColorFilter$ui_release == null) {
            intrinsicColorFilter$ui_release = vectorComponent.getIntrinsicColorFilter$ui_release();
        }
        if (!getAutoMirror$ui_release() || drawScope.getLayoutDirection() != LayoutDirection.Rtl) {
            vectorComponent.draw(drawScope, this.currentAlpha, intrinsicColorFilter$ui_release);
        } else {
            long jMo4733getCenterF1C5BW0 = drawScope.mo4733getCenterF1C5BW0();
            DrawContext drawContext = drawScope.getDrawContext();
            long jMo4655getSizeNHjbRc = drawContext.mo4655getSizeNHjbRc();
            drawContext.getCanvas().save();
            try {
                drawContext.getTransform().mo4662scale0AR0LA0(-1.0f, 1.0f, jMo4733getCenterF1C5BW0);
                vectorComponent.draw(drawScope, this.currentAlpha, intrinsicColorFilter$ui_release);
            } finally {
                drawContext.getCanvas().restore();
                drawContext.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
            }
        }
        this.drawCount = getInvalidateCount();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float f2) {
        this.currentAlpha = f2;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(ColorFilter colorFilter) {
        this.currentColorFilter = colorFilter;
        return true;
    }
}
