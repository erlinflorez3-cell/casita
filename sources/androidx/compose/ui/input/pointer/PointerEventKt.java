package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.IntSize;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:47)
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readPackageDataFrom(JvmProtoBufUtil.kt:42)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmPackage$kotlin_metadata_jvm(JvmReadUtils.kt:32)
    	at kotlin.metadata.jvm.KotlinClassMetadata$FileFacade.<init>(KotlinClassMetadata.kt:140)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:51)
    	... 4 more
    */
/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d̉=!,r\bDZc|\u0004G\t8\u000b<B\u0007\"2\u0014\u007f\u0007|jA0JfP.hS2\u000fq|<$q$yCA\\2\b0ޛgN\u0016f\u0017J\t\u000b\n\u0014\u001e\u001e\u0007kDI\u0004w\u0006\u0012=2ZwM5eok8\ttd\u00058:0;\u0012\u0005/\u0019RH>v\u0013KY\u0010*0nobR;M\u001d$ \u000bV /$\u0005g|6\u000fquD=*\u001bipTO_^|\u0014\u0012^^5\u0015\u000faL1h7c\u0015kX\u001b#`dW\u0003mpe\u0005\u0017'W/W}o6\u0007\u000bZ\u001aܹNՕǁv(b\u0011_m$I9X{K~\rPw){=@\u0012\u0018\u001e'v9]\u001et\u0016&3#\u0002֘?АؿbD\u0006\u000boG/2\u000eEC9Iyyai\u0019\u05ee;{\u0013!6-\u000f\u00049[\u0003\r\t\u0015IT>VI^NS`N8lem2pĊ\u0006*\u0012D_\u0019=\u0013).E8_[g#Qq\bHR\u007f\u000f\u0005\u000fg\u001aiʐL@0\b.?8#$Zrc-k~Tp4\u001fh4T5|0\u0013N\\ɿ<&-\u0013Tњ\u0005\u0018iܽa&"}, d2 = {"/mh\u0010[(GU\u0019\\\u0005g:\r\u0011/d", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0017\n_5Pv|", "1gP;Z,=B#]\u0005p5", "1gP;Z,=B#]\u0005p5`\u000b8o\r(YJ\n%'Oo\r", "1gP;Z,=B#n\u0006", "1gP;Z,=B#n\u0006B.\u0006\u0013<e]2\u0005N\u0011\u001f\u0017F", "1n]@h4>/ \u0006Xa(\u0006\u000b/s", "", "1n]@h4>2#\u0011\u0004</x\u00121e", "1n]@h4>>#\r~m0\u0007\u0012\rh{1}@", "7r>Bg\u0016?0#\u000f\u0004]:", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "7r>Bg\u0016?0#\u000f\u0004]:Drykg5u>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHdf(Wx'\u001d1\u0012!", "3wc2a+>R\b\t\u000b\\/g\u0005.d\u00041}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "7r>Bg\u0016?0#\u000f\u0004]:D\u000eAH\u0013$mN", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHdf(Wx'\u001d13oQ", ">nb6g0H\\v\u0002vg.|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHdf(Wx'\u001d\u00103", ">nb6g0H\\v\u0002vg.|f9n\u000e8\u0004@\u007f", ">nb6g0H\\v\u0002vg.|l1n\n5{\u001e\u000b %Ww\u000e;", ">nb6g0H\\v\u0002vg.|l8t\u007f5\u0005<\b", "7f]<e,\u001c]\"\r\u000bf,{", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHdf(Wx'\u001dA\u0012\u0011", ">nb6g0H\\v\u0002vg.|\b", ">nb6g0H\\v\u0002vg.|\b\u0013g\t2\t@^! U\u007f\u0016<u", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PointerEventKt {
    public static final boolean changedToDown(PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(PointerInputChange pointerInputChange) {
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    public static final boolean changedToUp(PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(PointerInputChange pointerInputChange) {
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    public static final boolean positionChanged(PointerInputChange pointerInputChange) {
        return !Offset.m3934equalsimpl0(positionChangeInternal(pointerInputChange, false), Offset.Companion.m3953getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(PointerInputChange pointerInputChange) {
        return !Offset.m3934equalsimpl0(positionChangeInternal(pointerInputChange, true), Offset.Companion.m3953getZeroF1C5BW0());
    }

    public static final long positionChange(PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, false);
    }

    public static final long positionChangeIgnoreConsumed(PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, true);
    }

    static /* synthetic */ long positionChangeInternal$default(PointerInputChange pointerInputChange, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = false;
        }
        return positionChangeInternal(pointerInputChange, z2);
    }

    private static final long positionChangeInternal(PointerInputChange pointerInputChange, boolean z2) {
        long jM3941minusMKHz9U = Offset.m3941minusMKHz9U(pointerInputChange.m5385getPositionF1C5BW0(), pointerInputChange.m5386getPreviousPositionF1C5BW0());
        return (z2 || !pointerInputChange.isConsumed()) ? jM3941minusMKHz9U : Offset.Companion.m3953getZeroF1C5BW0();
    }

    @Deprecated(message = "\u0013G\u000eIzu!\u0017[V6\u000ee\"<be[\u0017f\ri\u001f\u0012xKsx\u000ex)vzQgCaal\u0007\u0006\u0013F?Q__\\1f[PrC8Q\u0015U'X w8", replaceWith = @ReplaceWith(expression = "isConsumed", imports = {}))
    @InterfaceC1492Gx
    public static final boolean positionChangeConsumed(PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    @Deprecated(message = "\u0013G\u000eIzu!\u0017[V6\u000ee\"<be[\u0017f\ri\u001f\u0012xKsx\u000ex)vzQgCaal\u0007\u0006\u0013F?Q__\\1f[PrC8Q\u0015U'X w8", replaceWith = @ReplaceWith(expression = "isConsumed", imports = {}))
    @InterfaceC1492Gx
    public static final boolean anyChangeConsumed(PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    @Deprecated(message = "\u0013G\u000eIzu!\u0017[V6\u000ee\"<be[\u0017f\ri\u001f\u0012xKsx\u000ex)vzQgCaal\u0007\u0006\u0013F?QY[\b5mU@-\u0007s\u001b\u001aZ(I\u001cz\u0002", replaceWith = @ReplaceWith(expression = "if (pressed != previousPressed) consume()", imports = {}))
    @InterfaceC1492Gx
    public static final void consumeDownChange(PointerInputChange pointerInputChange) {
        if (pointerInputChange.getPressed() != pointerInputChange.getPreviousPressed()) {
            pointerInputChange.consume();
        }
    }

    @Deprecated(message = "\u0013G\u000eIzu!\u0017[V6\u000ee\"<be[\u0017f\ri\u001f\u0012xKsx\u000ex)vzQgCaal\u0007\u0006\u0013F?QY[\b5mU@-\u0007s\u001b\u001aZ(I\u001cz\u0002", replaceWith = @ReplaceWith(expression = "if (positionChange() != Offset.Zero) consume()", imports = {}))
    @InterfaceC1492Gx
    public static final void consumePositionChange(PointerInputChange pointerInputChange) {
        if (Offset.m3934equalsimpl0(positionChange(pointerInputChange), Offset.Companion.m3953getZeroF1C5BW0())) {
            return;
        }
        pointerInputChange.consume();
    }

    @Deprecated(message = "\u0018Y\u0001tt\u0004#jmT-B\u0019T5\\o`\u000e(\t", replaceWith = @ReplaceWith(expression = "consume()", imports = {}))
    @InterfaceC1492Gx
    public static final void consumeAllChanges(PointerInputChange pointerInputChange) {
        pointerInputChange.consume();
    }

    @Deprecated(message = "\u0018Y\u0001tz\b\u0004ll6.\\_*:Ro\u0014Qf\u0019p\rf6Y\u0004z^\u00046z{\fqK[euNS]GI'YT96YZBjR", replaceWith = @ReplaceWith(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m5329isOutOfBoundsO0kMr_c(PointerInputChange pointerInputChange, long j2) {
        long jM5385getPositionF1C5BW0 = pointerInputChange.m5385getPositionF1C5BW0();
        float fM3937getXimpl = Offset.m3937getXimpl(jM5385getPositionF1C5BW0);
        float fM3938getYimpl = Offset.m3938getYimpl(jM5385getPositionF1C5BW0);
        return fM3937getXimpl < 0.0f || fM3937getXimpl > ((float) IntSize.m6808getWidthimpl(j2)) || fM3938getYimpl < 0.0f || fM3938getYimpl > ((float) IntSize.m6807getHeightimpl(j2));
    }

    /* JADX INFO: renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m5330isOutOfBoundsjwHxaWs(PointerInputChange pointerInputChange, long j2, long j3) {
        if (!PointerType.m5457equalsimpl0(pointerInputChange.m5388getTypeT8wyACA(), PointerType.Companion.m5464getTouchT8wyACA())) {
            return m5329isOutOfBoundsO0kMr_c(pointerInputChange, j2);
        }
        long jM5385getPositionF1C5BW0 = pointerInputChange.m5385getPositionF1C5BW0();
        float fM3937getXimpl = Offset.m3937getXimpl(jM5385getPositionF1C5BW0);
        float fM3938getYimpl = Offset.m3938getYimpl(jM5385getPositionF1C5BW0);
        return fM3937getXimpl < (-Size.m4006getWidthimpl(j3)) || fM3937getXimpl > ((float) IntSize.m6808getWidthimpl(j2)) + Size.m4006getWidthimpl(j3) || fM3938getYimpl < (-Size.m4003getHeightimpl(j3)) || fM3938getYimpl > ((float) IntSize.m6807getHeightimpl(j2)) + Size.m4003getHeightimpl(j3);
    }
}
