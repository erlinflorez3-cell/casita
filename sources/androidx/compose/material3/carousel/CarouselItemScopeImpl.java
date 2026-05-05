package androidx.compose.material3.carousel;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
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
/* JADX INFO: compiled from: CarouselItemScope.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4E\u0007\"B\u0012\u007fјnjO0LeN.ZS@\u000fsڔ<$q$yCAW |8ޛ\u007fN\u0016f/Uj\u000fQ\u000f\u001e\u0016'k߽MU\u0007_Z\"@H\b?aT AGh\r63)x7أ}\u0005\u000f$rg\u001e\u0002\u0013Cy\u0018:0n|jV\u001bZ\u001d\u001a@\u0014n$\u000f&tg|?\u000f\u0002Һ>/1\u00122Y\\7w0+Y5F\u00033=zo&C@e>[:٨\u0007\u0007`l\u0010\u0015MtU\u0005\u0017(]\u007f ֬Y͏\\\u0004,\u00171S\u001bbC2j\u0005i`:(\u0002ՕeׂT\u000e0»ߧ\u007f\u001f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\fIPE{B\u001e\u001cLp9\u000fQ*X\u0002'+TY32", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\fIPE{B\u001e\u001cLp9\u000fQ*X\u0002'\u001d", "7sT:<5?]", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006t!Bc\u000e.7t_\fIPE{B\u001e\u001cLp9\u000fG5O\u0001|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@#1f\b0Em\u001dw+?HuD,\u0015oEH\u0007k\u0010Ww1\u001d\u0010?", "1`a<h:>Z|\u000ezf\u0010\u0006\n9", "5dc\u0010T9Hc'~\u0002B;|\u0011\u0013n\u00012", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn3U\u000b*G{\u00165\u0017!7x>.#hh\u001d\u0016c42\u007f(Q\"", "@d\\2`)>`\u0001z\td\u001a\u007f\u0005:e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@38U\t \u0001O\u00167MP?i\"!\u0011sa\u000f", "AgP=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y+7C", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~G\u0001\u001cBmk\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011Y^5kVz=]od\u0016Y5\u001b\u0005f\u0017\b2+3(\u00079S\u0006:{J\n \u0016@t~B \u0011Q\n\u001et=8lPb)\bJ=PbsF\fh\u001di>8\u0012\u0017m$\u001b>", ";`b856KR\u0019\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "0na1X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Pd6^\u007f&C[R6e\u001cOG!\u0011Z\u001b<:\u001a\u000f_AyU@@\u001e\u00156M\u0001N2~\u0016\u001e\u0019?xp\ff\u0014\u0011{\"qL,lDg)gJ=Pb\u007fK\bh\u001ciD>#';\u0017%p[8\u0018{\u001d\u001e\u0003[\tkoGbXB,IwiFRE9\u007f[#(J\t\u0002\u00161k>)~5\u000f>86.\u0015O1\u007fH]|\u00160\\N|", ";`b863B^", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ~!Fs\u000f@v2\u000b@y)6z 2LV\u0005i>& ro9Ps0\u0018x4CWQ0Z`<+\u0017\u000ee\u000e$\u0012\t\u000eXN.rCJh\u00066Q\rEv\u0001U#\u001e>ytJVY%\u0004\u001d\u0001K7hS/C=.=Na7n\u0010^0&8D,\u001f{'\u001b2`2Sc]\u0010vS}gt\u001d", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CarouselItemScopeImpl implements CarouselItemScope {
    public static final int $stable = 8;
    private final CarouselItemInfo itemInfo;

    public CarouselItemScopeImpl(CarouselItemInfo carouselItemInfo) {
        this.itemInfo = carouselItemInfo;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    public CarouselItemInfo getCarouselItemInfo() {
        return this.itemInfo;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    public Modifier maskClip(Modifier modifier, Shape shape, Composer composer, int i2) {
        composer.startReplaceGroup(440683050);
        ComposerKt.sourceInformation(composer, "C(maskClip)80@3238L32:CarouselItemScope.kt#dcf9yb");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(440683050, i2, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.maskClip (CarouselItemScope.kt:80)");
        }
        int i3 = i2 >> 3;
        Modifier modifierClip = ClipKt.clip(modifier, rememberMaskShape(shape, composer, (i3 + 126) - (i3 | 126)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierClip;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    public Modifier maskBorder(Modifier modifier, BorderStroke borderStroke, Shape shape, Composer composer, int i2) {
        composer.startReplaceGroup(610897768);
        ComposerKt.sourceInformation(composer, "C(maskBorder)84@3397L32:CarouselItemScope.kt#dcf9yb");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(610897768, i2, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.maskBorder (CarouselItemScope.kt:84)");
        }
        Modifier modifierBorder = BorderKt.border(modifier, borderStroke, rememberMaskShape(shape, composer, (-1) - (((-1) - (i2 >> 6)) | ((-1) - 126))));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierBorder;
    }

    @Override // androidx.compose.material3.carousel.CarouselItemScope
    public GenericShape rememberMaskShape(final Shape shape, Composer composer, int i2) {
        composer.startReplaceGroup(152582312);
        ComposerKt.sourceInformation(composer, "C(rememberMaskShape)88@3548L7,89@3571L319:CarouselItemScope.kt#dcf9yb");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(152582312, i2, -1, "androidx.compose.material3.carousel.CarouselItemScopeImpl.rememberMaskShape (CarouselItemScope.kt:87)");
        }
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(composer);
        final Density density = (Density) objConsume;
        Object carouselItemInfo = getCarouselItemInfo();
        ComposerKt.sourceInformationMarkerStart(composer, 332766031, "CC(remember):CarouselItemScope.kt#9igjgp");
        boolean zChanged = composer.changed(carouselItemInfo) | composer.changed(density);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new GenericShape(new Function3<Path, Size, LayoutDirection, Unit>() { // from class: androidx.compose.material3.carousel.CarouselItemScopeImpl$rememberMaskShape$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Path path, Size size, LayoutDirection layoutDirection) {
                    m2900invoke12SF9DM(path, size.m4011unboximpl(), layoutDirection);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke-12SF9DM, reason: not valid java name */
                public final void m2900invoke12SF9DM(Path path, long j2, LayoutDirection layoutDirection) {
                    Rect rectIntersect = this.this$0.getCarouselItemInfo().getMaskRect().intersect(SizeKt.m4027toRectuvyYCjk(j2));
                    OutlineKt.addOutline(path, shape.mo621createOutlinePq9zytI(rectIntersect.m3970getSizeNHjbRc(), layoutDirection, density));
                    path.mo4073translatek4lQ0M(OffsetKt.Offset(rectIntersect.getLeft(), rectIntersect.getTop()));
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        GenericShape genericShape = (GenericShape) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return genericShape;
    }
}
