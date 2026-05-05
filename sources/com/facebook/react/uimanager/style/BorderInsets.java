package com.facebook.react.uimanager.style;

import android.content.Context;
import android.graphics.RectF;
import com.facebook.react.modules.i18nmanager.I18nUtil;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я:\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u001a6B\r'4\u0012}\u0007njO0L͜P.`Y2şs{J$cҕyCIU\"Ԃ*\teNogtK`ŏYƤ6\u0016'ilLǤ|] \u000fzV}DKM\u001eCid\u0003=\u001d `*h}\u0013\n2*v\u001a?\u0016QV$\u0012^L!>`\u001ae\u0005H 6D.\u00106^}MdKǰa:=3S\u007fPO?g@\u0001]\u000f\\SU\u0010%ctѫB˝9\u0017-S\u0011\u000bҡ_P"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77r8ZB;x\u0018'#hpG\\", "", "u(E", "3cV2<5LS(\r", "", "", ")KY.i(\bZ\u0015\b|(\r\u0004\u0013+tU", "@db<_=>", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010wl", ":`h<h;\u001dW&~xm0\u0007\u0012", "", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "Adc\u000fb9=S&p~];\u007f", "", "3cV2", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004nCh\u0012'77|8OG9g;}\u0014ja\u000f", "EhSA[", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~g\r4>m_\u0015WE?i0%tgc9\\J1J\b#\u0011SJ5^\u001cSD\u001e\u000eic\u0012\u001c", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class BorderInsets {
    private final Float[] edgeInsets = new Float[LogicalEdge.values().length];

    public final RectF resolve(int i2, Context context) {
        RectF rectF;
        Intrinsics.checkNotNullParameter(context, "context");
        if (i2 == 0) {
            Float f2 = this.edgeInsets[LogicalEdge.START.ordinal()];
            float fFloatValue = (f2 == null && (f2 = this.edgeInsets[LogicalEdge.LEFT.ordinal()]) == null && (f2 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f2 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f2.floatValue();
            Float f3 = this.edgeInsets[LogicalEdge.BLOCK_START.ordinal()];
            float fFloatValue2 = (f3 == null && (f3 = this.edgeInsets[LogicalEdge.TOP.ordinal()]) == null && (f3 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f3 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f3 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f3.floatValue();
            Float f4 = this.edgeInsets[LogicalEdge.END.ordinal()];
            float fFloatValue3 = (f4 == null && (f4 = this.edgeInsets[LogicalEdge.RIGHT.ordinal()]) == null && (f4 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f4 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f4.floatValue();
            Float f5 = this.edgeInsets[LogicalEdge.BLOCK_END.ordinal()];
            rectF = new RectF(fFloatValue, fFloatValue2, fFloatValue3, (f5 == null && (f5 = this.edgeInsets[LogicalEdge.BOTTOM.ordinal()]) == null && (f5 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f5 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f5 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f5.floatValue());
        } else {
            if (i2 != 1) {
                throw new IllegalArgumentException("Expected resolved layout direction");
            }
            if (I18nUtil.Companion.getInstance().doLeftAndRightSwapInRTL(context)) {
                Float f6 = this.edgeInsets[LogicalEdge.END.ordinal()];
                float fFloatValue4 = (f6 == null && (f6 = this.edgeInsets[LogicalEdge.RIGHT.ordinal()]) == null && (f6 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f6 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f6.floatValue();
                Float f7 = this.edgeInsets[LogicalEdge.BLOCK_START.ordinal()];
                float fFloatValue5 = (f7 == null && (f7 = this.edgeInsets[LogicalEdge.TOP.ordinal()]) == null && (f7 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f7 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f7 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f7.floatValue();
                Float f8 = this.edgeInsets[LogicalEdge.START.ordinal()];
                float fFloatValue6 = (f8 == null && (f8 = this.edgeInsets[LogicalEdge.LEFT.ordinal()]) == null && (f8 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f8 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f8.floatValue();
                Float f9 = this.edgeInsets[LogicalEdge.BLOCK_END.ordinal()];
                rectF = new RectF(fFloatValue4, fFloatValue5, fFloatValue6, (f9 == null && (f9 = this.edgeInsets[LogicalEdge.BOTTOM.ordinal()]) == null && (f9 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f9 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f9 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f9.floatValue());
            } else {
                Float f10 = this.edgeInsets[LogicalEdge.END.ordinal()];
                float fFloatValue7 = (f10 == null && (f10 = this.edgeInsets[LogicalEdge.LEFT.ordinal()]) == null && (f10 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f10 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f10.floatValue();
                Float f11 = this.edgeInsets[LogicalEdge.BLOCK_START.ordinal()];
                float fFloatValue8 = (f11 == null && (f11 = this.edgeInsets[LogicalEdge.TOP.ordinal()]) == null && (f11 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f11 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f11 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f11.floatValue();
                Float f12 = this.edgeInsets[LogicalEdge.START.ordinal()];
                float fFloatValue9 = (f12 == null && (f12 = this.edgeInsets[LogicalEdge.RIGHT.ordinal()]) == null && (f12 = this.edgeInsets[LogicalEdge.HORIZONTAL.ordinal()]) == null && (f12 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f12.floatValue();
                Float f13 = this.edgeInsets[LogicalEdge.BLOCK_END.ordinal()];
                rectF = new RectF(fFloatValue7, fFloatValue8, fFloatValue9, (f13 == null && (f13 = this.edgeInsets[LogicalEdge.BOTTOM.ordinal()]) == null && (f13 = this.edgeInsets[LogicalEdge.BLOCK.ordinal()]) == null && (f13 = this.edgeInsets[LogicalEdge.VERTICAL.ordinal()]) == null && (f13 = this.edgeInsets[LogicalEdge.ALL.ordinal()]) == null) ? 0.0f : f13.floatValue());
            }
        }
        return rectF;
    }

    public final void setBorderWidth(LogicalEdge edge, Float f2) {
        Intrinsics.checkNotNullParameter(edge, "edge");
        this.edgeInsets[edge.ordinal()] = f2;
    }
}
