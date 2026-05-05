package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.List;
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
/* JADX INFO: compiled from: Shader.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d̉=!4i\bDZc|İI\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007lmA0ZeP.XS2\u000fy\u001a<$q$yّCU(\u0003*\tUX\u007f\u0016|Ϻr\u000fq\u000en\u0016Wj\\Mcyu\u0012=4ruE3[rU9\u000fxf\u000b&20=\u0012\u0005/\u001eߋGƵͯ~EQ\u0012 7X=HZ%Q3\u0019z\u0006\u001d 1\"jpf6vv\u000e>=.\u001bipXWi>\te\u0013VV7\r%oL8pE;\u00153b\u001b\u000fb]O\u0003m\u0002S\u0004\u00174W1OseGp\u007fB\u0019ܹNՕǁv(b\u0017_s$s9c{O~\r\u0011wY{=@\u0012#\u001e'v8]\u001et\u001e&3#\u0003\u0004J^\u000evH\u0010|q6E3.@[G!f_pS!^9\f\u0005;.9\u007f\u001d.\fZ\u0014`#,lw\u007f5Ӿ?׀˓R\f_T{\u001c\t\u001d\u0010C\u001c4u~\u0018{o.G)EpQ#Ou2RRs\u000f\u000bpjci\u0001Vn/\u001f$=*\u0017\u001brLt\u0007{P\u0003hB\u0010{)Ϻ\u0006âݔ\u0017\"b\u0012J<غ\u0010SWkoҶi\f\tʁ3\u0003"}, d2 = {"\u0017lP4X\u001aAO\u0018~\b", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0016~<\u007f\u0017$\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001f7zk", "7lP4X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0019ay\"7J\u001a=U?FA", "Bh[2@6=S\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n$]\u0005 \u001fw\u0015.#", "Bh[2@6=S\r", "\u0017lP4X\u001aAO\u0018~\b&\rK\\@jS6", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~=\u0006\u001c9mr2\\K7v\n\u0002x,H5\u0010b9Xz&\u0011N[(gUv;\"[H\u0011J*\r\u0012/", "\u001ah]2T9 `\u0015}~^5\fv2a~(\t", "4q^:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "Bn", "1n[<e:", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "1n[<e\u001aM]$\r", "", "Bh[2@6=S", "\u001ah]2T9 `\u0015}~^5\fv2a~(\t\bq\u001cv\u0018_w,", "uI9\u0019](OOb\u000f\nb3Fo3s\u000f}bE|(\u0013\u0011\u007f\u001d@}n\u001c]\f/\rQY\u0015IL:x>\"\u00142cF\u0003n/Rt5\u0011:Q([R\u007f\u0013", " `S6T3 `\u0015}~^5\fv2a~(\t", "1d]AX9", "@`S6h:", " `S6T3 `\u0015}~^5\fv2a~(\t\bS'+DmuB", "uI5\u0019](OOb\u000f\nb3Fo3s\u000f}bE|(\u0013\u0011\u007f\u001d@}n\u001c]\f/\rQY\u0015IL:x>\"\u00142cF\u0003n/Rt5\u0011:Q([R\u007f\u0013", "!vT2c\u000eKO\u0018\u0003zg;j\f+d\u007f5", "!vT2c\u000eKO\u0018\u0003zg;j\f+d\u007f5C\u0014fz~U\u0005\u0018", "uI;7T=:\u001d)\u000e~euc\r=tU\u000f\u0001<\u0012\u0013`W~\u0012C@\f9g\ruzT\u00127LPEo3g\u0017u]D\ng*\\@\u0015JHM,i(", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ShaderKt {
    /* JADX INFO: renamed from: LinearGradientShader-VjE6UOU$default, reason: not valid java name */
    public static /* synthetic */ Shader m4494LinearGradientShaderVjE6UOU$default(long j2, long j3, List list, List list2, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            list2 = null;
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            i2 = TileMode.Companion.m4551getClamp3opZhB0();
        }
        return m4493LinearGradientShaderVjE6UOU(j2, j3, list, list2, i2);
    }

    /* JADX INFO: renamed from: LinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m4493LinearGradientShaderVjE6UOU(long j2, long j3, List<Color> list, List<Float> list2, int i2) {
        return AndroidShader_androidKt.m4079ActualLinearGradientShaderVjE6UOU(j2, j3, list, list2, i2);
    }

    /* JADX INFO: renamed from: RadialGradientShader-8uybcMk$default, reason: not valid java name */
    public static /* synthetic */ Shader m4496RadialGradientShader8uybcMk$default(long j2, float f2, List list, List list2, int i2, int i3, Object obj) {
        if ((i3 + 8) - (8 | i3) != 0) {
            list2 = null;
        }
        if ((i3 + 16) - (i3 | 16) != 0) {
            i2 = TileMode.Companion.m4551getClamp3opZhB0();
        }
        return m4495RadialGradientShader8uybcMk(j2, f2, list, list2, i2);
    }

    /* JADX INFO: renamed from: RadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m4495RadialGradientShader8uybcMk(long j2, float f2, List<Color> list, List<Float> list2, int i2) {
        return AndroidShader_androidKt.m4080ActualRadialGradientShader8uybcMk(j2, f2, list, list2, i2);
    }

    /* JADX INFO: renamed from: SweepGradientShader-9KIMszo$default, reason: not valid java name */
    public static /* synthetic */ Shader m4498SweepGradientShader9KIMszo$default(long j2, List list, List list2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 4)) != 0) {
            list2 = null;
        }
        return m4497SweepGradientShader9KIMszo(j2, list, list2);
    }

    /* JADX INFO: renamed from: SweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m4497SweepGradientShader9KIMszo(long j2, List<Color> list, List<Float> list2) {
        return AndroidShader_androidKt.m4081ActualSweepGradientShader9KIMszo(j2, list, list2);
    }

    /* JADX INFO: renamed from: ImageShader-F49vj9s$default, reason: not valid java name */
    public static /* synthetic */ Shader m4492ImageShaderF49vj9s$default(ImageBitmap imageBitmap, int i2, int i3, int i4, Object obj) {
        if ((-1) - (((-1) - i4) | ((-1) - 2)) != 0) {
            i2 = TileMode.Companion.m4551getClamp3opZhB0();
        }
        if ((i4 + 4) - (i4 | 4) != 0) {
            i3 = TileMode.Companion.m4551getClamp3opZhB0();
        }
        return m4491ImageShaderF49vj9s(imageBitmap, i2, i3);
    }

    /* JADX INFO: renamed from: ImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m4491ImageShaderF49vj9s(ImageBitmap imageBitmap, int i2, int i3) {
        return AndroidShader_androidKt.m4078ActualImageShaderF49vj9s(imageBitmap, i2, i3);
    }
}
