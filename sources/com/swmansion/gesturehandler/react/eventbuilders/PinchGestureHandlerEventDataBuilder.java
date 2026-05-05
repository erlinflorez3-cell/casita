package com.swmansion.gesturehandler.react.eventbuilders;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.swmansion.gesturehandler.core.PinchGestureHandler;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u0016DLc\u000b\u0004I\u00066\f6B\r'4\u0012}\u0007njG4LeN.ZS8\u000fsڔ<$q$yّQ٥J\u00042\u000b_N\u0016g\u001dI\u001b\u0016S\u0013\u0014\u0017\u0011jZIǤ|] \u0011zP}HKM\u001eGid\u0003A\u001d `.~\u000eU\r(-`\u0010%~\u001aź\u000eܘ4@xí#\u0019[\n2\u00124BvҸ ֔kN>ԟ=iH5;\u0003\u0018I%ώa݁\u0001M\u0015Ͽ%3\u001b~y\u001eYG\u000eߑ\u0017ȏW\u0003\u000fѸâC\u0010"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0016?MLJhD\"\u001cgaF\u0015-\u0017R\u007f%J.N:kb\u007f=v\u000ec\rU+\u001adjA-}#3.\u0004\tY\u0006Bg\u0001\u0019k", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0016?MLJhD\"\u001cgaF\u0015-\u000eN\u00056WYN\u000fX[qD\u0014\u001f:\u001fN4\u001ccUP KT;&\u0007,VW", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001X\u001a7KF\u001dkB-%ua\u001c\u0003l+Uv4\u001d", "6`]1_,K", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77\u00012VA>M4,$xn9i_5M}'T\"\u0012\u001d", "4nR._\u001f", "", "4nR._ ", "AbP9X", "", "Dd[<V0Mg", "0tX9W\fOS\"\u000eYZ;x", "", "3uT;g\u000b:b\u0015", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class PinchGestureHandlerEventDataBuilder extends GestureHandlerEventDataBuilder<PinchGestureHandler> {
    private final float focalX;
    private final float focalY;
    private final double scale;
    private final double velocity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinchGestureHandlerEventDataBuilder(PinchGestureHandler handler) {
        super(handler);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.scale = handler.getScale();
        this.focalX = handler.getFocalPointX();
        this.focalY = handler.getFocalPointY();
        this.velocity = handler.getVelocity();
    }

    @Override // com.swmansion.gesturehandler.react.eventbuilders.GestureHandlerEventDataBuilder
    public void buildEventData(WritableMap eventData) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        super.buildEventData(eventData);
        eventData.putDouble("scale", this.scale);
        eventData.putDouble("focalX", PixelUtil.toDIPFromPixel(this.focalX));
        eventData.putDouble("focalY", PixelUtil.toDIPFromPixel(this.focalY));
        eventData.putDouble("velocity", this.velocity);
    }
}
