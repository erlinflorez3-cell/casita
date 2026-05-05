package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: IntRect.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я0\u001d̉=!4i\bӵLc\u000b\u0004I\u00066\u000e6B\u0015\"4\u0012}\bnjG6LeN2ZS8\u0014sڔ<$q$yCAU2\u001e0ޛgN\u0016f\u001fNh\u000b[\u000f4\u0017)n:Kmx\f\u0013U7ֈnЀݯQqC<nxN%.݅:8(\u00041\u001e8M(v)D{\u0010 6XphYSRơ\u0019ŇĂB\"\u0007&jkfVVǍu:]\"3mPW?_^}}\u0011T^?\r%ld0ġ6ߎչ)U\t\u0013`hW!M\u007fU\u0005\u0017&W/W\u0003o6\u0007~D\u00199_%]!%\r\t_q$'Ya*Ph\u00186\u000b\u0013{;;,\u000e4;\u000f3E$t\u001d&3#\u0007{@~\u0001%GȘzf>\u001a+ŐOY8Ӿjg"}, d2 = {"\u0017mc\u001fX*M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00125W\ru", "Bn_\u0019X-M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "0ncAb4+W\u001b\u0002\n", "\u0017mc\u001fX*M\u001bxJba\u001cz|", "uI9u?(GR&\t~]?F\u00079m\u000b2\n@J'\u001b\u0011\u007f\u0017@\u0006n\u0019b\r\r7k%\u0004", "=eU@X;", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "\u0017mc\u001fX*M\u001b\n{z<1\u0005|", "1d]AX9", "@`S6h:", "", "\u0017mc\u001fX*M\u001b\u0015\fJ\\\b\u000b\u0013", "uI8u?(GR&\t~]?F\u00079m\u000b2\n@J'\u001b\u0011\u007f\u0017@\u0006n\u0019b\r\r7k%\u0004", ":da=", "AsP?g", "As^=", "4qP0g0H\\", "", "@nd;W\u001bH7\"\u000eg^*\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "BnA2V;", "Ch\u001cBa0MM&~\u0002^(\u000b\t"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class IntRectKt {
    /* JADX INFO: renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final IntRect m6798IntRectVbeCjmY(long j2, long j3) {
        return new IntRect(IntOffset.m6766getXimpl(j2), IntOffset.m6767getYimpl(j2), IntOffset.m6766getXimpl(j2) + IntSize.m6808getWidthimpl(j3), IntOffset.m6767getYimpl(j2) + IntSize.m6807getHeightimpl(j3));
    }

    /* JADX INFO: renamed from: IntRect-E1MhUcY, reason: not valid java name */
    public static final IntRect m6797IntRectE1MhUcY(long j2, long j3) {
        return new IntRect(IntOffset.m6766getXimpl(j2), IntOffset.m6767getYimpl(j2), IntOffset.m6766getXimpl(j3), IntOffset.m6767getYimpl(j3));
    }

    /* JADX INFO: renamed from: IntRect-ar5cAso, reason: not valid java name */
    public static final IntRect m6799IntRectar5cAso(long j2, int i2) {
        return new IntRect(IntOffset.m6766getXimpl(j2) - i2, IntOffset.m6767getYimpl(j2) - i2, IntOffset.m6766getXimpl(j2) + i2, IntOffset.m6767getYimpl(j2) + i2);
    }

    public static final IntRect lerp(IntRect intRect, IntRect intRect2, float f2) {
        return new IntRect(MathHelpersKt.lerp(intRect.getLeft(), intRect2.getLeft(), f2), MathHelpersKt.lerp(intRect.getTop(), intRect2.getTop(), f2), MathHelpersKt.lerp(intRect.getRight(), intRect2.getRight(), f2), MathHelpersKt.lerp(intRect.getBottom(), intRect2.getBottom(), f2));
    }

    public static final Rect toRect(IntRect intRect) {
        return new Rect(intRect.getLeft(), intRect.getTop(), intRect.getRight(), intRect.getBottom());
    }

    public static final IntRect roundToIntRect(Rect rect) {
        return new IntRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }
}
