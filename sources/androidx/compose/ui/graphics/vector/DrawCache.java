package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
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
/* JADX INFO: compiled from: DrawCache.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яd\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjO0LeN.ZS@\u000fsڔ<$q$yCAY\"}8\tWȞog\u0005Jb\u000bI\u000f\u000e\u0016\u0007j4I[xe\u0012%2JoU3UoS9ht<\b(20=\u0002ڎ\t\u001a@H\u0018v\u0001CQÈ(ؓpphQMPŋ\u001e\u0012\u0014>hH,r\u007fNd_\u001daH4;\u0003\u0018H~+mC\u0015M;Z\u0005+\u001b\u000fy\u001eYRg9#-k\u00035[\fT\u0011X\nN\u0015j7'Yd\u0004YFX.+CE̠\u0011]xBڑ\u0004ĩԃ\u0010)1lqi\u001906\u0017\u0013{;S4\u0012\u0014G`.[5\u0017\u000e\u00143\u0003\u0014k@~$\u000fJ\u0006zoY/'\u00162Y]cp_\u0007S\u0019|N$\u0005;9i\u0001?-iU&`C\u001d+ȰSśU@Eʰ\u001f\u0018g@\u0006\u0006\u0007a0.Z΅SĬ3{\u0019фg9E`Q#OqX҉PђuݓĔgRׂVJH\"|\u001d\b6\u0017\u0014rD\u0013\u000eB¯`г0\u0011Uȼ%+\f\u0012+\"rvj,[ī\rи?ȋvܷa\u001c-Äv9_zy\u000eo;d@C_\u0004\u0012ga\u0005$\u0010Jp\u0016phXR:l3̨.ĘLj\u0018ǮLX\\\u001f+2m\u0006rؼ8״\u0018¢ŢG\u0002ٿFC\u0005\tmoӓ\u0010\b\\6*Ғ\u0006Rs\u0011\u0001V{˂s\u000e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005nFY{/Az_\rZ?MI0\u001c\u0018h7", "", "u(E", "1`R5X\u001a<]$~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019g=/\u0011v@F\u0003u\u001aL\u00012G\"", "1`R5X+\u001cO\"\u0010vl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "1n]3\\.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FI>'\u0016lc\u000f", "\u0017", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ";BP0[,=7!z|^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FA", "5dc\u001a6(<V\u0019}^f(~\tma\t1\u0006O|&\u001bQx\u001c", "5dc\u001a6(<V\u0019}^f(~\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#a(3o\u0016\u000bQRCg?s", "Adc\u001a6(<V\u0019}^f(~\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\na\u0006", "Ab^=X\u000b>\\'\u0003\nr", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "\u0018", "2qPD6(<V\u0019}^f(~\t", "", "2d]@\\;R", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "2qPD6(<V\u0019}^f(~\tvF\f-X\u0014Sr", "uH9\u0019T5=`#\u0003yquz\u00137p\n6{\n\u0011\u001b`Wx\u0012K@\u00045b\f$F\u0002k\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011\\Rul[vL]xV\"X;\u001cc]N$lS;)\u0011\u00020\bEw\b\u0010\u001fW:{x\fW Pw$yK2v\u0010:o\u0003EPIl30a#\u000e", "2qPD<5M]", "B`a4X;", "/k_5T", "", "1n[<e\rBZ(~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "1kT.e", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class DrawCache {
    public static final int $stable = 8;
    private Canvas cachedCanvas;
    private ImageBitmap mCachedImage;
    private Density scopeDensity;
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private long size = IntSize.Companion.m6813getZeroYbymL2g();
    private int config = ImageBitmapConfig.Companion.m4399getArgb8888_sVssgQ();
    private final CanvasDrawScope cacheScope = new CanvasDrawScope();

    public static /* synthetic */ void getMCachedImage$annotations() {
    }

    public final ImageBitmap getMCachedImage() {
        return this.mCachedImage;
    }

    public final void setMCachedImage(ImageBitmap imageBitmap) {
        this.mCachedImage = imageBitmap;
    }

    /* JADX INFO: renamed from: drawCachedImage-FqjB98A, reason: not valid java name */
    public final void m4862drawCachedImageFqjB98A(int i2, long j2, Density density, LayoutDirection layoutDirection, Function1<? super DrawScope, Unit> function1) {
        this.scopeDensity = density;
        this.layoutDirection = layoutDirection;
        ImageBitmap imageBitmapM4404ImageBitmapx__hDU$default = this.mCachedImage;
        Canvas Canvas = this.cachedCanvas;
        if (imageBitmapM4404ImageBitmapx__hDU$default == null || Canvas == null || IntSize.m6808getWidthimpl(j2) > imageBitmapM4404ImageBitmapx__hDU$default.getWidth() || IntSize.m6807getHeightimpl(j2) > imageBitmapM4404ImageBitmapx__hDU$default.getHeight() || !ImageBitmapConfig.m4394equalsimpl0(this.config, i2)) {
            imageBitmapM4404ImageBitmapx__hDU$default = ImageBitmapKt.m4404ImageBitmapx__hDU$default(IntSize.m6808getWidthimpl(j2), IntSize.m6807getHeightimpl(j2), i2, false, null, 24, null);
            Canvas = CanvasKt.Canvas(imageBitmapM4404ImageBitmapx__hDU$default);
            this.mCachedImage = imageBitmapM4404ImageBitmapx__hDU$default;
            this.cachedCanvas = Canvas;
            this.config = i2;
        }
        this.size = j2;
        CanvasDrawScope canvasDrawScope = this.cacheScope;
        long jM6820toSizeozmzZPI = IntSizeKt.m6820toSizeozmzZPI(j2);
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
        Density densityComponent1 = drawParams.component1();
        LayoutDirection layoutDirectionComponent2 = drawParams.component2();
        Canvas canvasComponent3 = drawParams.component3();
        long jM4651component4NHjbRc = drawParams.m4651component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(Canvas);
        drawParams2.m4654setSizeuvyYCjk(jM6820toSizeozmzZPI);
        Canvas.save();
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        clear(canvasDrawScope2);
        function1.invoke(canvasDrawScope2);
        Canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
        drawParams3.setDensity(densityComponent1);
        drawParams3.setLayoutDirection(layoutDirectionComponent2);
        drawParams3.setCanvas(canvasComponent3);
        drawParams3.m4654setSizeuvyYCjk(jM4651component4NHjbRc);
        imageBitmapM4404ImageBitmapx__hDU$default.prepareToDraw();
    }

    public static /* synthetic */ void drawInto$default(DrawCache drawCache, DrawScope drawScope, float f2, ColorFilter colorFilter, int i2, Object obj) {
        if ((i2 + 2) - (2 | i2) != 0) {
            f2 = 1.0f;
        }
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            colorFilter = null;
        }
        drawCache.drawInto(drawScope, f2, colorFilter);
    }

    public final void drawInto(DrawScope drawScope, float f2, ColorFilter colorFilter) {
        ImageBitmap imageBitmap = this.mCachedImage;
        if (!(imageBitmap != null)) {
            InlineClassHelperKt.throwIllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        DrawScope.m4717drawImageAZ2fEMs$default(drawScope, imageBitmap, 0L, this.size, 0L, 0L, f2, null, colorFilter, 0, 0, 858, null);
    }

    private final void clear(DrawScope drawScope) {
        DrawScope.m4728drawRectnJ9OG0$default(drawScope, Color.Companion.m4204getBlack0d7_KjU(), 0L, 0L, 0.0f, null, null, BlendMode.Companion.m4093getClear0nO6VwU(), 62, null);
    }
}
