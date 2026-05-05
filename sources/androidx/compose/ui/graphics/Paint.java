package androidx.compose.ui.graphics;

import android.graphics.Shader;
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
/* JADX INFO: compiled from: Paint.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яr\u001d<K!&i\u000eӵLш|\u0004O\u000b8\u000b4E\u0007\"B\u0012\u007f\u0007lmA0ZeP.XV2\u000f\u0002{<$a'yCQU\"}(\nWNupvJ`\rK\u000f\u001c\u0016\u0001j2L]xs\u0012\u00172XoG3SrE9vt>\u0005&3*8\u0010\u0005\t\u001a0O\u0018v\u0011CS\f\u00181HpPR\u0015M\u001b\u001a\u001aßD\u0005\u0017Ȧ\rg|5\u0011vkzG'1++N\u0006\"v!\u001e#TT?\r%btҏL˝9\u001f=U\t\t`^_\u0005EuK\n9C51as\u0006=/ă Ǽ*˽\u05ce\\q͉`\u000fib\u0012/9X\u0004MV\u00186\u0003K\u0018\u001bH\u001c\u000e44\u001fͺ9ָeڜս2sɤWJh\u0004dP\u000e\n\u00028\u001d5\u000eD{Q)xicQ\u0018|JR̃\u0019̷'\u000b\u0007#ah\u001cu5\u001dZ\u000e_H\"\\K`f\n\bVDյ|Š\u0001Ï̯/FĬ3\u0006)0\u001d?EdY%'\u0007\u0010S\u0015}\u0005!xh\u0002\u0007)͙Ḻr O,\u000f(hb\u0005\u0007qobx|)[=l\t\u0014\u0007AB3ʣHƼ)\u001afQn\rxq}\f+Tt]*\ry5oAt2cyL\u0012wQU=\u0016סnۖ\\pZU\u0012\u0005jSB4N\u0017\u001e%L`\\:+2m!r٠8״\u0018¢ŢG\u0002ٿFK\u0015\u000be\u000bv\u0019\u001fV9U\u0011tt\u0011\u00173h\\\u001f#>֕Uڌ{ʠŮ,@پ9#>W(\u001dB\u0006C\t\u0005)\u000eR8bU\u0003\u0005\u0016$VR´\"׀=[G?\u0019F\r,R\u00043}Zw6g[K?z+ze·t\u05cek\u0012\u0003r2\u001bxMoV\u001d]\u0005cC?\u0016!\u0018y\u0010\u0004QęoԳ\nϵǥHqè]Ff:\u0003C-'E\u0003ua\u000b@տB'ݷ\u0016\u0007\u001c2\u001b˷y\u0018n6yh..vk#Zb݇s&єa1"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", "", "/k_5T", "", "5dc\u000e_7AO", "u(5", "Adc\u000e_7AO", "uE\u0018#", "0kT;W\u0014HR\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "5dc\u000f_,GR\u0001\ty^sG\u0012\u00196p:k", "u(8", "Adc\u000f_,GR\u0001\ty^s\u000b\\+n\u0001.N", "uH\u0018#", "1n[<e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "5dc\u0010b3H``Iy0&b\u000e\u001f", "u(9", "Adc\u0010b3H``Qt1w\u0004\u0010\u000b", "uI\u0018#", "1n[<e\rBZ(~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "5dc\u0010b3H`y\u0003\u0002m,\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#[*>w#\u000fQJJkAs", "Adc\u0010b3H`y\u0003\u0002m,\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7\b'Azv2TR;x\na\u0006", "4h[AX9*c\u0015\u0006~m@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0016]\u0005/7z\u0002>IJ?zHs", "5dc\u0013\\3MS&j\u000bZ3\u0001\u0018C-\u0001o\r\u0014\u0004bz", "Adc\u0013\\3MS&j\u000bZ3\u0001\u0018C-\u0011\u0007^KN*!", "7r0;g0\u001aZ\u001dz\t", "", "u(I", "Adc\u000ea;B/ \u0003vl", "uY\u0018#", ">`c58-?S\u0017\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\r#\u0017n\u0017.KR\u0011", "5dc\u001dT;A3\u001a\u007fz\\;", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#h\u001cFpu/NC9z\n", "Adc\u001dT;A3\u001a\u007fz\\;", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~Dy/:M\u0017/MAJAw\u000f", "AgP1X9", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0016~<\u007f\u0017$\u001d", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#\\y\u001f7zk", "5dc [(=S&", "u(;.a+K]\u001d}D`9x\u00142i}6E.\u0004\u0013\u0016G|c", "Adc [(=S&", "uKP;W9HW\u0018H|k(\b\f3c\u000eqiC|\u0016\u0017TEQ-", "Asa<^,\u001cO$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=ms*X\u0019", "5dc g9HY\u0019\\visb\u0005\u001aH\u0006\n\u000e", "Adc g9HY\u0019\\visY\t\u00157c\f[", "Asa<^,#]\u001d\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n#h\u000b*=mz8QL\u0011", "5dc g9HY\u0019c\u0005b5DoBF\\0\u0002\u0013", "Adc g9HY\u0019c\u0005b5DzA9`t\u0004,", "Asa<^,&W(~\bE0\u0005\r>", "5dc g9HY\u0019f~m,\no3m\u00047", "Adc g9HY\u0019f~m,\no3m\u00047", "Asa<^,0W\u0018\u000e}", "5dc g9HY\u0019p~];\u007f", "Adc g9HY\u0019p~];\u007f", "Ash9X", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)Fq\u001f0;ROr4s", "5dc g@ES`m~n\u001ayf9", "Adc g@ES`\u0005NI\u001d\f[=", "/r5?T4>e#\f\u0001I(\u0001\u0012>", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&l", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001eU\r$Hm\u0001*QLJA", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface Paint {
    android.graphics.Paint asFrameworkPaint();

    float getAlpha();

    /* JADX INFO: renamed from: getBlendMode-0nO6VwU */
    int mo4050getBlendMode0nO6VwU();

    /* JADX INFO: renamed from: getColor-0d7_KjU */
    long mo4051getColor0d7_KjU();

    ColorFilter getColorFilter();

    /* JADX INFO: renamed from: getFilterQuality-f-v9h1I */
    int mo4052getFilterQualityfv9h1I();

    PathEffect getPathEffect();

    Shader getShader();

    /* JADX INFO: renamed from: getStrokeCap-KaPHkGw */
    int mo4053getStrokeCapKaPHkGw();

    /* JADX INFO: renamed from: getStrokeJoin-LxFBmk8 */
    int mo4054getStrokeJoinLxFBmk8();

    float getStrokeMiterLimit();

    float getStrokeWidth();

    /* JADX INFO: renamed from: getStyle-TiuSbCo */
    int mo4055getStyleTiuSbCo();

    boolean isAntiAlias();

    void setAlpha(float f2);

    void setAntiAlias(boolean z2);

    /* JADX INFO: renamed from: setBlendMode-s9anfk8 */
    void mo4056setBlendModes9anfk8(int i2);

    /* JADX INFO: renamed from: setColor-8_81llA */
    void mo4057setColor8_81llA(long j2);

    void setColorFilter(ColorFilter colorFilter);

    /* JADX INFO: renamed from: setFilterQuality-vDHp3xo */
    void mo4058setFilterQualityvDHp3xo(int i2);

    void setPathEffect(PathEffect pathEffect);

    void setShader(Shader shader);

    /* JADX INFO: renamed from: setStrokeCap-BeK7IIE */
    void mo4059setStrokeCapBeK7IIE(int i2);

    /* JADX INFO: renamed from: setStrokeJoin-Ww9F2mQ */
    void mo4060setStrokeJoinWw9F2mQ(int i2);

    void setStrokeMiterLimit(float f2);

    void setStrokeWidth(float f2);

    /* JADX INFO: renamed from: setStyle-k9PVt8s */
    void mo4061setStylek9PVt8s(int i2);
}
