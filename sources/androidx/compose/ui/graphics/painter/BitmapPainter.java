package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: BitmapPainter.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яb\u001d<K!&i\u0016DLш|\u0004W\u00068é6B\u0015\"4ߚ\u007f\u0007|jA0JeP.`X2şs{J$cҕyCQU\"}(\rWN}gvJ`\u000eK\u000f\u0014\u001f\u0001j2J]xk܈\u0017˰JoM9UڎE9n\u0001>\u0005&4*8\b\u0005\t\u001a@H\u0018͌\u0011ŏ{\f@/\u0001\u0010JV\u001bM\u001d\u001a@\u0007N&\u0007\u001ejif6vom@5#\u0011mZNUd݁\u0001M\u001bL\u001d5\u001b\u000fy\u001eYYg9#,k\u00035Z\"QKO\u007fW\u001dhU@[O\u0002`NZ\u0016\u0013C5\u0016\u001f&\u00044w\u001dQ\u000f%W1]\u007fcR$'&\u0018Bȵ<L\u0014\u0014E`.[9-\u001cV9\u0003\u0013k@~#%VH\u001boX/%.8[=)hiai\u001c~;\n\t%\u001eQ\u00065!ǵSו\u05ce\u0019\u001dZ\u001b_U\u001aJKmf\n\bc\u0016\u0004\u001f\nH<T<U\u0007G{?6m©C٦=#)ǽRVRp\u000f\u0007vg\u0002s)̵Ḻr\u0016?ѧY,hO|\u0005\u001a\\+Б8ԃLȼϺ\u0006|ݔ\u0017.dwJ2=\u0012T\\vw\u000bOc\u00193?7Cgn\u0004\u000e\u0006:5ګ7Ʉg\u0010i\u05ecG,MNz\u0005\u0007yx(bȮ^Ξ!ȭi\u000fȑ\u007fHf\u000e\u0019FM\u0007lH:G1\\CMYٟD̿{ȁߙYgʐ\u0003V;$\u0011\u0001t\t\u0017\u0003h\\\u001fr>ձKڌ{ʠŮ,@پ9\u001b.U0\u007f\u0005\u00111\u000b\u0017s.L>չIǻkֵçTz°\u001a\u001cAQ=TТ\u000f\b15\bαazqmQS1ئ~%"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n@U\u0002)Fm#w*GJs0)\u007fdeB\u0016c9$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n@U\u0002)Fm#w8??tC\u001e\">", "7lP4X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FA", "AqR\u001cY-LS(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "AqR \\A>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0003yOgC\u0016j0W@,XT\u00180earJ\u001d\u000eaW-+\u000e\u0001iH3LN@-\u00179Y\u007fJr\u000es\u0012\u001b;j}\u0018\u001a\u0001", "/k_5T", "", "1n[<e\rBZ(~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "4h[AX9*c\u0015\u0006~m@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0016]\u0005/7z\u0002>IJ?zHs", "5dc\u0013\\3MS&j\u000bZ3\u0001\u0018C-\u0001o\r\u0014\u0004bz\u0006\u007f\u00126x21d\u0001$5{\u0010;MJ;gB\u001e", "u(8", "Adc\u0013\\3MS&j\u000bZ3\u0001\u0018C-\u0011\u0007^KN*!\u0006\u007f\u00126x21d\u0001$5{\u0010;MJ;gB\u001e", "uH\u0018#", "\u0017", "7mc?\\5LW\u0017l~s,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "5dc\u0016a;KW\"\r~\\\u001a\u0001\u001e/-h\u000bCE}\u0004\u0015", "u(9", "Ahi2", "\u0018", "/o_9l\bE^\u001cz", "", "/o_9l\nHZ#\f[b3\f\t<", "3pd._:", "=sW2e", "", "6`b566=S", "", "BnBAe0GU", "", "D`[6W(MS\u0007\u0003\u0010^", "D`[6W(MS\u0007\u0003\u0010^seX/q\\\u0007y", "uI9u=", "=m3?T>", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BitmapPainter extends Painter {
    private float alpha;
    private ColorFilter colorFilter;
    private int filterQuality;
    private final ImageBitmap image;
    private final long size;
    private final long srcOffset;
    private final long srcSize;

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, j2, j3);
    }

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, (2 & i2) != 0 ? IntOffset.Companion.m6776getZeronOccac() : j2, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight()) : j3, null);
    }

    private BitmapPainter(ImageBitmap imageBitmap, long j2, long j3) {
        this.image = imageBitmap;
        this.srcOffset = j2;
        this.srcSize = j3;
        this.filterQuality = FilterQuality.Companion.m4278getLowfv9h1I();
        this.size = m4853validateSizeN5eqBDc(j2, j3);
        this.alpha = 1.0f;
    }

    /* JADX INFO: renamed from: getFilterQuality-f-v9h1I$ui_graphics_release, reason: not valid java name */
    public final int m4854getFilterQualityfv9h1I$ui_graphics_release() {
        return this.filterQuality;
    }

    /* JADX INFO: renamed from: setFilterQuality-vDHp3xo$ui_graphics_release, reason: not valid java name */
    public final void m4856setFilterQualityvDHp3xo$ui_graphics_release(int i2) {
        this.filterQuality = i2;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void onDraw(DrawScope drawScope) {
        DrawScope.m4717drawImageAZ2fEMs$default(drawScope, this.image, this.srcOffset, this.srcSize, 0L, IntSizeKt.IntSize(Math.round(Size.m4006getWidthimpl(drawScope.mo4734getSizeNHjbRc())), Math.round(Size.m4003getHeightimpl(drawScope.mo4734getSizeNHjbRc()))), this.alpha, null, this.colorFilter, 0, this.filterQuality, 328, null);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo4855getIntrinsicSizeNHjbRc() {
        return IntSizeKt.m6820toSizeozmzZPI(this.size);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float f2) {
        this.alpha = f2;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    /* JADX INFO: renamed from: validateSize-N5eqBDc, reason: not valid java name */
    private final long m4853validateSizeN5eqBDc(long j2, long j3) {
        if (IntOffset.m6766getXimpl(j2) < 0 || IntOffset.m6767getYimpl(j2) < 0 || IntSize.m6808getWidthimpl(j3) < 0 || IntSize.m6807getHeightimpl(j3) < 0 || IntSize.m6808getWidthimpl(j3) > this.image.getWidth() || IntSize.m6807getHeightimpl(j3) > this.image.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        return j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return Intrinsics.areEqual(this.image, bitmapPainter.image) && IntOffset.m6765equalsimpl0(this.srcOffset, bitmapPainter.srcOffset) && IntSize.m6806equalsimpl0(this.srcSize, bitmapPainter.srcSize) && FilterQuality.m4273equalsimpl0(this.filterQuality, bitmapPainter.filterQuality);
    }

    public int hashCode() {
        return (((((this.image.hashCode() * 31) + IntOffset.m6768hashCodeimpl(this.srcOffset)) * 31) + IntSize.m6809hashCodeimpl(this.srcSize)) * 31) + FilterQuality.m4274hashCodeimpl(this.filterQuality);
    }

    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((Object) IntOffset.m6773toStringimpl(this.srcOffset)) + ", srcSize=" + ((Object) IntSize.m6811toStringimpl(this.srcSize)) + ", filterQuality=" + ((Object) FilterQuality.m4275toStringimpl(this.filterQuality)) + ')';
    }
}
