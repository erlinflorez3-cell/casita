package androidx.compose.ui.graphics;

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
/* JADX INFO: compiled from: GraphicsLayerScope.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я\u0016\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u000522\u009aw\u001d߿\u001b9^C&M4Rޚ.\u000fy{\u00050i%\nCiWpԉt\u07beSNo˧?Vh\u000e[\u000f4\u0018O̚~֒Yxe܈_>PsW3{q\u0014ʧ3ҽ:\u0005(݅rD\b\n\u0019\u001aXJf͓MŲO\f\u001aؓ\u0011|HX%M3\u001chæ\u0011ŋ\u0005\u001edɡ\u001fBVsu:]%Y݊\u0015Ě+_8ŧ\u001e\u0019T\\?\r%ctѯ\u0013˝9\u0015-مS\u0013`dW\u0003ms\u0014ݢ;Ҋ++Q֕(Bf\n,\u0015YQcƥE͉`\u0005YӠ\\39Z{K~\u0010~ÂMԫ\u0011<\f\u05faV3V:E\u001a\u0015\ndޞGɤW@X\u061c/N\u000e\by6E'VĘ}ݰ\u001ffYĥ\f%\\E\u0014\u0005; yЮAĲ_T\u0016֫e'b\u0007i1\u007fB\u0014ʷ!̆]=uՎAn\u0010:\u001c0u\u0002\u0006Ɍcѧ\u001b%?ك\n//|\u001aHriMݚ3ĈWiZ̲\u0011.|(O*7\u000e1լ7ʰoP\\А|\u001d[/l\u0007,\ni\u0605/ʟ@!-ī˃S|"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0016]}'6{k", "", "u(E", "\u000fk_5T", "", "\u000flQ6X5MA\u001czyh>Z\u00136o\r", "\u0011`\\2e(\u001dW'\u000evg*|", "\u0011kX=", "\u0011n\\=b:Bb\u001d\b|L;\n\u0005>e\u0002<", "\u001b`c?\\?\u001aT\u001a~xm0\u0006\u000b\u0010i\u007f/zN", " d]1X9\u001eT\u001a~xm", " nc.g0H\\\f", " nc.g0H\\\r", " nc.g0H\\\u000e", "!bP9X\u001f", "!bP9X ", "!gP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "!gP=X", "!o^AF/:R#\u0011Xh3\u0007\u0016", "\"qP;f-H`!h\bb.\u0001\u0012", "\"qP;f3:b\u001d\t\u0004Q", "\"qP;f3:b\u001d\t\u0004R", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Fields {
    public static final int $stable = 0;
    public static final int Alpha = 4;
    public static final int AmbientShadowColor = 64;
    public static final int CameraDistance = 2048;
    public static final int Clip = 16384;
    public static final int CompositingStrategy = 32768;
    public static final Fields INSTANCE = new Fields();
    public static final int MatrixAffectingFields = 7963;
    public static final int RenderEffect = 131072;
    public static final int RotationX = 256;
    public static final int RotationY = 512;
    public static final int RotationZ = 1024;
    public static final int ScaleX = 1;
    public static final int ScaleY = 2;
    public static final int ShadowElevation = 32;
    public static final int Shape = 8192;
    public static final int SpotShadowColor = 128;
    public static final int TransformOrigin = 4096;
    public static final int TranslationX = 8;
    public static final int TranslationY = 16;

    private Fields() {
    }
}
