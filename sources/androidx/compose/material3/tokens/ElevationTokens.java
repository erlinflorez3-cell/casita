package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: ElevationTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005.2\u009aw\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u0005;i%\nCiWܵ|̝\u0093NM˗kvRZ\u0019H'\b\u001c{x0\u001al\u0007c*\u000f`DƜ>\u074c߲n<˃d|>\u0005.7::\u007f\f\u000f\u001ez_\u001e~\u0013Cy\u000eݮ/ϋú9QҫQ\r\"\u0012\u0014C8\u0003$euR\u0007_zgR/Q\u0005\u07bcA÷ф^/ƊQ\u0015NT5\u0012\u000fc$6N;\u0006,3_\u001b\u0007\u0001]У\u0002ӊҵ<\u0004ص+/3I\u0002\\NZ\u0006!#/ $k\u0001>\\3Sՙ\u000bʬ̼NbׂT\u00160w\t\u0001%>\n\u001d\u0014+Ρ.6\"i\u000eԦO#q[@V!\u07b2F\u0010"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001M\u001d.^?Jo>'\u0004rg9\u0010q\u0002", "", "u(E", "\u001ade2_v", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0019X=>ZcFY2\f\u0002X0M", "u(5", "\u0014", "\u001ade2_w", "5dc\u0019X=>ZdFY2\f\u0002X0M", "\u001ade2_x", "5dc\u0019X=>ZeFY2\f\u0002X0M", "\u001ade2_y", "5dc\u0019X=>ZfFY2\f\u0002X0M", "\u001ade2_z", "5dc\u0019X=>ZgFY2\f\u0002X0M", "\u001ade2_{", "5dc\u0019X=>ZhFY2\f\u0002X0M", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ElevationTokens {
    public static final int $stable = 0;
    public static final ElevationTokens INSTANCE = new ElevationTokens();
    private static final float Level0 = Dp.m6638constructorimpl((float) 0.0d);
    private static final float Level1 = Dp.m6638constructorimpl((float) 1.0d);
    private static final float Level2 = Dp.m6638constructorimpl((float) 3.0d);
    private static final float Level3 = Dp.m6638constructorimpl((float) 6.0d);
    private static final float Level4 = Dp.m6638constructorimpl((float) 8.0d);
    private static final float Level5 = Dp.m6638constructorimpl((float) 12.0d);

    private ElevationTokens() {
    }

    /* JADX INFO: renamed from: getLevel0-D9Ej5fM, reason: not valid java name */
    public final float m3191getLevel0D9Ej5fM() {
        return Level0;
    }

    /* JADX INFO: renamed from: getLevel1-D9Ej5fM, reason: not valid java name */
    public final float m3192getLevel1D9Ej5fM() {
        return Level1;
    }

    /* JADX INFO: renamed from: getLevel2-D9Ej5fM, reason: not valid java name */
    public final float m3193getLevel2D9Ej5fM() {
        return Level2;
    }

    /* JADX INFO: renamed from: getLevel3-D9Ej5fM, reason: not valid java name */
    public final float m3194getLevel3D9Ej5fM() {
        return Level3;
    }

    /* JADX INFO: renamed from: getLevel4-D9Ej5fM, reason: not valid java name */
    public final float m3195getLevel4D9Ej5fM() {
        return Level4;
    }

    /* JADX INFO: renamed from: getLevel5-D9Ej5fM, reason: not valid java name */
    public final float m3196getLevel5D9Ej5fM() {
        return Level5;
    }
}
