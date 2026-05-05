package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.math.MathKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	... 5 more
    */
/* JADX INFO: compiled from: PlatformMagnifier.android.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146B\u0005#4\u0012\u000e\u0007nʑA0ZeP.XS2\u000f\u0002{<řc$\bCCU ~*\teNo˧vJh\u0010K\u000f\f\u0018~͕,_ǁ)]@\u000ejA\u0006\u007f8Soެ=`\u00036Mp@'Py3\u0007J.V\u0017\u000fzqS<\u0016>I\t:\u0001\u000f}\t(\u001c\u001e>N\fN`uZNH\u001bjj31\u0011\u0002B|4\u00104\u000b\\%F\u0003)=zo.C@eFE)a\u0015\u001fR\nRISҵ<ݛص+)1]\u0002l\u0007j\u000e\u0015-+}\u000f4čhػ\tWhϯ?-UfYTʮ(|\u0003~\u0013ɿ <\u0005ϒLE"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0010<U\r!Az\u001e\u0016IEDo5\"\u0015uB5\u0005r6[\u000b\u0003RP\u001b\u007f@Z}Di", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0010<U\r!Az\u001e\u0016IEDo5\"\u0015uB5\u0005r6[\u000b|", "u(E", "1`]\"c+:b\u0019s\u0005h4", "", "5dc\u0010T5.^\u0018z\n^!\u0007\u00137", "u(I", "1qT.g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0010<U\r!Az\u001e\u0016IEDo5\"\u0015uB5\u0005r6[\u000b\u0003RP\u001b\u007f@Z}DR|a\n],\u0017\u0012a) pM; \f,VeCs\ba", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "CrT!X?M2\u0019\u007fvn3\f", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "1na;X9+O\u0018\u0003\u000bl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "3kTCT;B]\"", "1kX=c0GUx\bv[3|\b", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "7mXA\\(EH#\t\u0003", "", "1qT.g,\u0006\\{amlxp", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q5eww<V\nEu2?]|3\u0001k 6XMIk}.\u00192qB\u000bru-v0UP]@236$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buJ\fKq\u007f\b%\u0012?s:-]\fVz\u001f\u0003I\u0011dHbczKARC&b\u001bi*p\u0016E(`E|#sWlt\u0003O s\\\u0007oOC\u001b\u0004<%Bmh*Mz\\\u0012", "\u001ekPAY6K[\u0001z|g0}\r/rc0\u0007G", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {
    public static final int $stable = 0;
    public static final PlatformMagnifierFactoryApi29Impl INSTANCE = new PlatformMagnifierFactoryApi29Impl();
    private static final boolean canUpdateZoom = true;

    private PlatformMagnifierFactoryApi29Impl() {
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    /* JADX INFO: renamed from: create-nHHXs2Y */
    public PlatformMagnifierImpl mo664createnHHXs2Y(View view, boolean z2, long j2, float f2, float f3, boolean z3, Density density, float f4) {
        if (z2) {
            return new PlatformMagnifierImpl(new Magnifier(view));
        }
        long jMo711toSizeXkaWNTQ = density.mo711toSizeXkaWNTQ(j2);
        float fMo710toPx0680j_4 = density.mo710toPx0680j_4(f2);
        float fMo710toPx0680j_42 = density.mo710toPx0680j_4(f3);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jMo711toSizeXkaWNTQ != InlineClassHelperKt.UnspecifiedPackedFloats) {
            builder.setSize(MathKt.roundToInt(Size.m4006getWidthimpl(jMo711toSizeXkaWNTQ)), MathKt.roundToInt(Size.m4003getHeightimpl(jMo711toSizeXkaWNTQ)));
        }
        if (!Float.isNaN(fMo710toPx0680j_4)) {
            builder.setCornerRadius(fMo710toPx0680j_4);
        }
        if (!Float.isNaN(fMo710toPx0680j_42)) {
            builder.setElevation(fMo710toPx0680j_42);
        }
        if (!Float.isNaN(f4)) {
            builder.setInitialZoom(f4);
        }
        builder.setClippingEnabled(z3);
        return new PlatformMagnifierImpl(builder.build());
    }

    /* JADX INFO: compiled from: PlatformMagnifier.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я*\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0012\u007fјnjO0LeN.ZS8\u0014s{:%a)\bّkUH|b\u0014_Rug\u0007J\t\fß\u0013\u0006$z3TWX\u0011]@\u0013bF}DKM\u001eCid\u0003=\u001d `(h}\u0013\t2*v\u0019=\u000fǈJÈܘ4BvD`\u0018ˢ\u0005\u001f\u001a\tDŊ\u001dL[ʊRB"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0010<U\r!Az\u001e\u0016IEDo5\"\u0015uB5\u0005r6[\u000b\u0003RP\u001b\u007f@Z}DR|a\n],\u0017\u0012a) pM; \f,VeCs\ba", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0010<U\r!Az\u001e\u0016IEDo5\"\u0015uB5\u0005r6[\u000b\u0003RP\u001b~@Z}DR|a\n],\u0017\u0012a) pM; \f,VeCs\ba", ";`V;\\-BS&", "\u001a`]1e6BRb\u0011~].|\u0018xM{*\u0005D\u0002\u001b\u0017TE", "uKP;W9HW\u0018H\rb+~\t>/g$}I\u0005\u0018\u001bG|c\u007fg", "CoS.g,", "", "And?V,\u001cS\"\u000ezk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ";`V;\\-BS&\\zg;|\u0016", "Hn^:", "", "CoS.g,\u0006E\u001f\tF]}~", "uI9\u0013\u001c\u001d", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class PlatformMagnifierImpl extends PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        public static final int $stable = 0;

        public PlatformMagnifierImpl(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl, androidx.compose.foundation.PlatformMagnifier
        /* JADX INFO: renamed from: update-Wko1d7g */
        public void mo663updateWko1d7g(long j2, long j3, float f2) {
            if (!Float.isNaN(f2)) {
                getMagnifier().setZoom(f2);
            }
            if (OffsetKt.m3956isSpecifiedk4lQ0M(j3)) {
                getMagnifier().show(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2), Offset.m3937getXimpl(j3), Offset.m3938getYimpl(j3));
            } else {
                getMagnifier().show(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2));
            }
        }
    }
}
