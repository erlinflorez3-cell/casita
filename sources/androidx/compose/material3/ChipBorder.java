package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@Deprecated(level = DeprecationLevel.WARNING, message = "\u0010G\u0005C\u0006u\u001ee]Kg\u0001_'kPeZ\n9\u001e(\u000fa\u0004Vo~Wv-rq`}\u0010\rQ{>\u00062;?QYT\u00032:WMiCFQ\u0012\\\"G/\u007fC\u0010\u0006KxE/_\u0003|a")
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я4\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4B\u0007\"B\u0012\u007f\u0007llA0ZeP.hS2şs{B-c$wFCU(\u0004*ޛUS}˧\u001fJ\t\n\u0004,\fǝ\tn:Imx\f\u0013\u001f6PqW3{pM=nwN\u0005N6ŕ<y\u0013\u0006bGV\u0018\u000f\u0003SO\u001c\u0014F?\u001fD\u0001\u0016}\t(\u001d\u001e>N\rd[ʄR8NykHw4\u0011xZNUk`\u0003[\u001d^V=\f%`dѿ@\u007f;#6k\u00035d\"SSS\u007f=\u001dhU(\u0002ɡuˇ5ݙŕ\u0013\u0014ۣS\u000fer4bUen\u000f?+}g\"ַ\u0010Âv\u07beց\f;Ǭ\u0012\b/H<4jz\u0016\u0010Kt!T\u0017Г\u0004\u0081AȕҦ`5а)\u0002;+G!ƛQjC\u001cTѻ\u00183\f&#\u0007\u000eĸ_g"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006T(9dZ*Dl\u0016;#", "", "0na1X9\u001c] \t\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "2hb.U3>Ru\t\b],\nf9l\n5", "0na1X90W\u0018\u000e}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "uI9\u0013?2Hb \u0003\u0004(1\u000e\u0011xi\t7{M\n\u0013\u001e\u0011N\u000e=r5<h[*@{%;]AJuA\u0006\u0011ug9\u00149o?", "\u0018", "\u0014", "0na1X9,b&\t\u0001^", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0002?f| D[%;WI;A", "3mP/_,=", "", "0na1X9,b&\t\u0001^j\u0005\u0005>e\r,wGN\u0011$Gv\u000e8\u0005%", "uY;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.7zk\u0012\u0011*7t3+\u001fl`LPa6V\u00021UL\u00189l[\u0002A\u001c\u0012${]'\u001c\u0005/", "3pd._:", "=sW2e", "6`b566=S", "", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ChipBorder {
    public static final int $stable = 0;
    private final long borderColor;
    private final float borderWidth;
    private final long disabledBorderColor;

    public /* synthetic */ ChipBorder(long j2, long j3, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, f2);
    }

    private ChipBorder(long j2, long j3, float f2) {
        this.borderColor = j2;
        this.disabledBorderColor = j3;
        this.borderWidth = f2;
    }

    public final State<BorderStroke> borderStroke$material3_release(boolean z2, Composer composer, int i2) {
        ComposerKt.sourceInformationMarkerStart(composer, 1899621712, "C(borderStroke)2734@128285L120:Chip.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899621712, i2, -1, "androidx.compose.material3.ChipBorder.borderStroke (Chip.kt:2733)");
        }
        State<BorderStroke> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(BorderStrokeKt.m600BorderStrokecXLIe8U(this.borderWidth, z2 ? this.borderColor : this.disabledBorderColor), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return stateRememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChipBorder)) {
            return false;
        }
        ChipBorder chipBorder = (ChipBorder) obj;
        return Color.m4179equalsimpl0(this.borderColor, chipBorder.borderColor) && Color.m4179equalsimpl0(this.disabledBorderColor, chipBorder.disabledBorderColor) && Dp.m6643equalsimpl0(this.borderWidth, chipBorder.borderWidth);
    }

    public int hashCode() {
        return (((Color.m4185hashCodeimpl(this.borderColor) * 31) + Color.m4185hashCodeimpl(this.disabledBorderColor)) * 31) + Dp.m6644hashCodeimpl(this.borderWidth);
    }
}
