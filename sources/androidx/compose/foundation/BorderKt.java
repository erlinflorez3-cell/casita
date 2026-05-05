package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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
/* JADX INFO: compiled from: Border.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яh\u001d̉=!4i\bӵLc\u0003\tI\u00066\u000b6B\u0015\"4\u0012}\bnjG9L͜P.hS2\u000f\u0002{<řc$\bCC٥\"}8\tWȞog\u0005Jb\u000bI\u0010\u000e\u0016\u000fj4I[ye\u0012%2JoU3UoC9htL\u0005(݅*8\u0010\u0005\t\u001a0J\u0018v\u0011CS\f\u00182X\u0007Hĥ%M3\u0019B\nL \u0019\u001e\u000bh~:Vnu:]\"IiZt5bH|{\u0011vX5\u0012\u000faL/p;C\u0017=S1\u0006\u0003_M\tWqk\u0006\u0019+52as\u0006>\u001f\u007f,19X%]!0\u0005\u0005\u007fj<+9X{K~\u0019X}\u0001{\u001bH\u001c\u000e44\u000f3EFt\u0011&3#|{@~\f\u000fF\u000e\ty6E4079I3f\u007frk\u001d\\C\u0014\u0005;+i\u0006ϒ żڍ\u0012b\u001b-b\u000bi__IUH|\u0014\u0002=\u001c\u000e!f\u00108\u001c0u\u000f_\u007f\u001fB/%epi)'k\u0010T\\g%\u0012'mؾhɭ͕D$t,EA!\u0016h\\|\u0005\u001ai|XZ+\u0014\u001clC\f#+ \u000b\u0011d!S*~Svy\u0003M\f\u001bU3tSqn\u001a+\b=lQMQ\u0012/\u0012V\u0005\u001bW<\u0011\r\tjPs$Z\u000b)h2̄iݘȑ\u007fFT-!TW\u000e*WD1G\u0001=H1BrE\u000b.wZ\u0017\u0011ETו#ѰȐ(v\u000f'^\u0004ʜol\u0001L2ʫ|P,۴U]"}, d2 = {"1qT.g,\"\\'~\nK6\r\u0012.e~\u0015{>\u0010", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"c\u000e)6Z\u0016,\\\u0019", "EhSA[\u0017Q", "", "@nd;W,=@\u0019|\n", "1qT.g,+])\byK,z\u0018\u001aa\u000f+", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\r", "B`a4X;)O(\u0002", "Asa<^,0W\u0018\u000e}", "4h[949>O", "", "0na1X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "EhSA[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "0qd@[", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012f\u000e.:C", "0na1X9\u0006h\u001dg|=\u0013\\", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:d\u001c@l#8QBN52(\u001dskG\u0007-<R@)THY/`P\u0001\u0007p\u001fj\u001cQ\u0001s\u0001b@1xH62Q*S\nFr\u000f\f_\u001e94rOR\u001bJ}\u0013\u0004\u000b\u0017kBd_O\u000b(Ak)q\u0016c\u001co\u00048.\u001c|#)h\u001a>\u000eE;\u001bqVzkgTn", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "0na1X9\u0006f\bMtj>l", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b:b\u00073v\u0015;WG:~}\u001c\u001fplC\u0015cu^zpIYJ7_VpK]\u007f]\nY+bH@=-mQA#\u0007?\u0013\u007fEp\f\u0016$\u000e~zt\f>\u001aF}\u0016yA6>", "2qPD66Gb\u0019\b\nP0\f\f9u\u000f\u0005\u0006M\u007f\u0017$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Y9lIr7\"Y\f0>|k", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Y9k8t(58\u000b\u001cI[\u00148XC\u0011", "2qPDE,<bu\t\b],\n", "Bn_\u0019X-M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "0na1X9,W.~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "Asa<^,0W\u0018\u000e}I?", "2qPDE,<bu\t\b],\nP\u0018s\f&b\"p", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0016$C\u0002W\u001ar#8Y\\-3\u007f\u0004,WN;A\u001b\u001a\u001egnC\u000bb?\u0018t1OWX:\\\u001c\u0003A]\u0014g\nY.\u0011\u0003g\u000b\u0001{TE\"]\u0011.v\u001c,g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010icCFNAtsC\u0019[/I:H4\u001b\u0001n", "Aga6a2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u0013c\u000b)7z\u0003*LGKy\n", "D`[BX", "Aga6a2\u00069\u001d{\u0003j}X", "uI5u=", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class BorderKt {
    public static /* synthetic */ Modifier border$default(Modifier modifier, BorderStroke borderStroke, Shape shape, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return border(modifier, borderStroke, shape);
    }

    public static final Modifier border(Modifier modifier, BorderStroke borderStroke, Shape shape) {
        return m586borderziNgDLE(modifier, borderStroke.m599getWidthD9Ej5fM(), borderStroke.getBrush(), shape);
    }

    /* JADX INFO: renamed from: border-xT4_qwU$default */
    public static /* synthetic */ Modifier m585borderxT4_qwU$default(Modifier modifier, float f2, long j2, Shape shape, int i2, Object obj) {
        if ((i2 + 4) - (i2 | 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m584borderxT4_qwU(modifier, f2, j2, shape);
    }

    /* JADX INFO: renamed from: border-xT4_qwU */
    public static final Modifier m584borderxT4_qwU(Modifier modifier, float f2, long j2, Shape shape) {
        return m586borderziNgDLE(modifier, f2, new SolidColor(j2, null), shape);
    }

    /* JADX INFO: renamed from: border-ziNgDLE */
    public static final Modifier m586borderziNgDLE(Modifier modifier, float f2, Brush brush, Shape shape) {
        return modifier.then(new BorderModifierNodeElement(f2, brush, shape, null));
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.BorderKt$drawContentWithoutBorder$1 */
    /* JADX INFO: compiled from: Border.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bDZc|İOيH\u000b\\A'\"Z\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019u=-\u0015qp\u0018\u0014_><t1RL$", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<ContentDrawScope, Unit> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
            invoke2(contentDrawScope);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2(ContentDrawScope contentDrawScope) {
            contentDrawScope.drawContent();
        }
    }

    public static final DrawResult drawContentWithoutBorder(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(AnonymousClass1.INSTANCE);
    }

    /* JADX INFO: renamed from: drawRectBorder-NsqcLGU */
    public static final DrawResult m587drawRectBorderNsqcLGU(CacheDrawScope cacheDrawScope, final Brush brush, long j2, long j3, boolean z2, float f2) {
        final long jM3827getSizeNHjbRc = j3;
        final long jM3953getZeroF1C5BW0 = j2;
        if (z2) {
            jM3953getZeroF1C5BW0 = Offset.Companion.m3953getZeroF1C5BW0();
        }
        if (z2) {
            jM3827getSizeNHjbRc = cacheDrawScope.m3827getSizeNHjbRc();
        }
        final DrawStyle stroke = z2 ? Fill.INSTANCE : new Stroke(f2, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                DrawScope.m4727drawRectAsUm42w$default(contentDrawScope, brush, jM3953getZeroF1C5BW0, jM3827getSizeNHjbRc, 0.0f, stroke, null, 0, 104, null);
            }
        });
    }

    public static final Path createRoundRectPath(Path path, RoundRect roundRect, float f2, boolean z2) {
        path.reset();
        Path.addRoundRect$default(path, roundRect, null, 2, null);
        if (!z2) {
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect$default(Path, createInsetRoundedRect(f2, roundRect), null, 2, null);
            path.mo4070opN5in7k0(path, Path, PathOperation.Companion.m4470getDifferenceb3I0S0c());
        }
        return path;
    }

    private static final RoundRect createInsetRoundedRect(float f2, RoundRect roundRect) {
        return new RoundRect(f2, f2, roundRect.getWidth() - f2, roundRect.getHeight() - f2, m588shrinkKibmq7A(roundRect.m3987getTopLeftCornerRadiuskKHJgLs(), f2), m588shrinkKibmq7A(roundRect.m3988getTopRightCornerRadiuskKHJgLs(), f2), m588shrinkKibmq7A(roundRect.m3986getBottomRightCornerRadiuskKHJgLs(), f2), m588shrinkKibmq7A(roundRect.m3985getBottomLeftCornerRadiuskKHJgLs(), f2), null);
    }

    /* JADX INFO: renamed from: shrink-Kibmq7A */
    public static final long m588shrinkKibmq7A(long j2, float f2) {
        return CornerRadiusKt.CornerRadius(Math.max(0.0f, CornerRadius.m3912getXimpl(j2) - f2), Math.max(0.0f, CornerRadius.m3913getYimpl(j2) - f2));
    }
}
