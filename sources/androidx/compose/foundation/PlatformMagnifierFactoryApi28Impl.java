package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
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
@Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0016DLcz\u0004I\u0006>\u00146B\u0005#4\u0012\u000e\u0007nʑA0ZeP.XS2\u000f\u0002{<řc$\bCCU ~*\teNo˧vJh\u0010K\u000f\f\u0018~͕,_ǁ)]@\u000ejA\u0006\u007f8Soެ=`\u00036Mp@'Py3\u0007J.V\u0017\u000fzqS<\u0016>I\t:\u0001\u000f}\t(\u001c\u001e>N\fN`uZNH\u001bjj31\u0011\u0002B|4\u00104\u000b\\%F\u0003)=zo.C@eFE)a\u0015\u001fR\nRISҵ<ݛص+)1]\u0002l\u0007j\u000e\u0015-+}\u000f4čhػ\tWhϯ?-UfYTʮ(|\u0003~\u0013ɿ <\u0005ϒLE"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0010<U\r!Az\u001e\u0016IEDo5\"\u0015uB5\u0005r6[\u000b\u0003RP\u001b~@Z}Di", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0010<U\r!Az\u001e\u0016IEDo5\"\u0015uB5\u0005r6[\u000b|", "u(E", "1`]\"c+:b\u0019s\u0005h4", "", "5dc\u0010T5.^\u0018z\n^!\u0007\u00137", "u(I", "1qT.g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0010<U\r!Az\u001e\u0016IEDo5\"\u0015uB5\u0005r6[\u000b\u0003RP\u001b~@Z}DR|a\n],\u0017\u0012a) pM; \f,VeCs\ba", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "CrT!X?M2\u0019\u007fvn3\f", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGd)JYS", "1na;X9+O\u0018\u0003\u000bl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "3kTCT;B]\"", "1kX=c0GUx\bv[3|\b", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "7mXA\\(EH#\t\u0003", "", "1qT.g,\u0006\\{amlxp", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q5eww<V\nEu2?]|3\u0001k 6XMIk}.\u00192qB\u000bru-v0UP]@236$\u0010\u001bY\u001bX/\f\u0018#?.vOA-\buJ\fKq\u007f\b%\u0012?s:-]\fVz\u001f\u0003I\u0011dHbczKARC&b\u001bi*p\u0016E(`D|#sWlt\u0003O s\\\u0007oOC\u001b\u0004<%Bmh*Mz\\\u0012", "\u001ekPAY6K[\u0001z|g0}\r/rc0\u0007G", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class PlatformMagnifierFactoryApi28Impl implements PlatformMagnifierFactory {
    public static final int $stable = 0;
    public static final PlatformMagnifierFactoryApi28Impl INSTANCE = new PlatformMagnifierFactoryApi28Impl();
    private static final boolean canUpdateZoom = false;

    private PlatformMagnifierFactoryApi28Impl() {
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    /* JADX INFO: renamed from: create-nHHXs2Y */
    public PlatformMagnifierImpl mo664createnHHXs2Y(View view, boolean z2, long j2, float f2, float f3, boolean z3, Density density, float f4) {
        return new PlatformMagnifierImpl(new Magnifier(view));
    }

    /* JADX INFO: compiled from: PlatformMagnifier.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4D\u0007\"B\u0012\u007f\u0007lkA0ReP.XS2\u000f\u0002{<$a$yCIZ\"}(\u000bUc}˧\u001fJ\t\n\u0004\u001a\u0016\u001a\u0007jDI\u0004yٕ\u0016\u000f@D8EAV\b=gj;JMH@-Py3\u000bJ.V\u001c\u000fzqX<\u0016>N\t:\u0001\u001a}\t(!\u001e>N\u0011dp˚MȤՂp_@@1\u00152H\\:w0+WSZ%6\u001bvy\u001eYA˝9\u001b-م\u001b\tX^M\u0007\u0010\nK\n\u0001'U1\u007fH.̓Zŕ\u0013ƃܹN\fǁv*t\u0007Wg\u001a/ˆOlSS\u0014߬\u0014)z\u0015<\n-Σ+\\"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0010<U\r!Az\u001e\u0016IEDo5\"\u0015uB5\u0005r6[\u000b\u0003RP\u001b~@Z}DR|a\n],\u0017\u0012a) pM; \f,VeCs\ba", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0010<U\r!Az\u001e\u0016IEDo5\"\u0015u7", ";`V;\\-BS&", "\u001a`]1e6BRb\u0011~].|\u0018xM{*\u0005D\u0002\u001b\u0017TE", "uKP;W9HW\u0018H\rb+~\t>/g$}I\u0005\u0018\u001bG|c\u007fg", "5dc\u001aT.GW\u001a\u0003zk", "u(;.a+K]\u001d}Dp0{\u000b/tI\u0010wB\n\u001b\u0018Ko\u001b\u0012", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc \\A>\u001b\r{\u000ff\u0013I\u000b", "u(9", "2hb:\\:L", "", "CoS.g,", "And?V,\u001cS\"\u000ezk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ";`V;\\-BS&\\zg;|\u0016", "Hn^:", "", "CoS.g,\u0006E\u001f\tF]}~", "uI9\u0013\u001c\u001d", "CoS.g,\u001c]\"\u000ezg;", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static class PlatformMagnifierImpl implements PlatformMagnifier {
        public static final int $stable = 8;
        private final Magnifier magnifier;

        public PlatformMagnifierImpl(Magnifier magnifier) {
            this.magnifier = magnifier;
        }

        public final Magnifier getMagnifier() {
            return this.magnifier;
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        /* JADX INFO: renamed from: getSize-YbymL2g */
        public long mo662getSizeYbymL2g() {
            return IntSizeKt.IntSize(this.magnifier.getWidth(), this.magnifier.getHeight());
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public void updateContent() {
            this.magnifier.update();
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        /* JADX INFO: renamed from: update-Wko1d7g */
        public void mo663updateWko1d7g(long j2, long j3, float f2) {
            this.magnifier.show(Offset.m3937getXimpl(j2), Offset.m3938getYimpl(j2));
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public void dismiss() {
            this.magnifier.dismiss();
        }
    }
}
