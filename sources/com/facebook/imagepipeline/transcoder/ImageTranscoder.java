package com.facebook.imagepipeline.transcoder;

import android.graphics.ColorSpace;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.IOException;
import java.io.OutputStream;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLш|\u0004O\u00128\u000b4C\u0007\":\u001b\u007fјnjO0L͜P.hS2şs{J$c$wCCU0}*ޛWN}gvϺb\u000bY\u000f\u000e\u0016~j4Ic~e܈\u00172XoG3SoC\u001evҚf\u0005N1jZ\b\t\u0019\u001aXM@z\tIc\f@7pvHZ%O\u001b\u0019@\u000fn&\u000f(tid5vw$^w1\u0011uZNUd`\u0001[\u001a^TU\u001b=\u0006fxNFM\u0015Sc3\u000b`aW\u0003mxm\tv8?+w\u0006\b<f\b,\u0017AN;f#,j\u000fib\"&YZ\u0014Q^!@y\u0011z;J4\u0014\u0014;`0C\u0019\u0015\u001d>9\u0003\tkBf\u0001\rYF\u001fˋ:\u00173\u0018\u0004;G\u001b~Q\u0010<oײ9߉\t\u00116%\u0007p/^ړ\u0012y"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u000621b\f\u001eAl\u0016;\u0017'Cg6\u001e\u0004u]B\u0015a6Mv4\u001d", "", "7cT;g0?W\u0019\f", "", "5dc\u0016W,Gb\u001d\u007f~^9", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "1`]\u001fX:Bh\u0019", "", "3mR<W,=7!z|^", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006z-1[}i\u0017v\u00148LC:O<\u001a\u0017h7", "@nc.g0H\\\u0003\n\nb6\u0006\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z =IR?u=\b weC\u0010q\u0002", "@db6m,(^(\u0003\u0005g:", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006t/=a\b)\u0001Z\u0016<QX;U?-\u0019rjG\\", "1`]!e(Ga\u0017\ty^", "7lP4X\rH`!z\n", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(|J\u000e\u001f\u0013V9qDr'5:\b-?i%\u0004", "BqP;f*HR\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\r7a\u0002(\u0007D\f\u0017\u001eKx\u000e\u0006\u000621b\f\u001eAl\u0016;\u0017'Cg6\u001e\u0004u]B\u0015a6Mv\u0014GZ^3k(", "=tc=h;,b&~vf", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "=tc=h;\u001f]&\u0007vm", "?tP9\\;R", "", "1n[<e\u001aIO\u0017~", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006\u0006G\u000b$\u0005Rk\f<L", "uKR<`u?O\u0017~wh6\u0003R3m{*{K\u0005\"\u0017Ns\u0017<@)=U\u007f \u0001M\u001f,WB;j\u0018&\u0011ja\u000fmh(_rpKV\u0018\u0016la}M#\u007fi\u001bN'\u0015Z@?.v\u000e8\u001b\u0006,F\fEnJ\u0010\u001e\n7j{Fa\u0010N}\u001eu\u000b'rNai\u0003\u0011.Oq&s\u0010i&FEI(\u001ez'pON8\u0012ET\rpRvqqMb~@ @mfJPo\\@}'hI\u0006\u007f\u001a<a>\u0018t;\bI* o\u0014Oq!L4_\u00136d\u000b(\"4<\u0010IUi?pF\nj\u001fb\u0012\u001bj1@bIm_J\u000fgg$c1p5g<N\u0017:\u0013v\u00110HH&d\t\u0015\u000b\u00071CLEL\u001aa\u000b\u001eo\u000e$l\r\u000e\u0006j\u0016*wsG`\u0019u\u0018j3K\u0013^,\u001f\n\u0006a\r\u0016lF\u0010jU|a!s,2z\u0011T%>KCz[C9\u001f#0\n\u0019|'riOC\u001a\u001b!'=HE^i=\tqR\"\u0006gF,&<\u0007", "7lP4X7B^\u0019\u0006~g,D\u0006+s\u007f\"\t@\b\u0017\u0013Uo"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public interface ImageTranscoder {
    boolean canResize(EncodedImage encodedImage, RotationOptions rotationOptions, ResizeOptions resizeOptions);

    boolean canTranscode(ImageFormat imageFormat);

    String getIdentifier();

    ImageTranscodeResult transcode(EncodedImage encodedImage, OutputStream outputStream, RotationOptions rotationOptions, ResizeOptions resizeOptions, ImageFormat imageFormat, Integer num, ColorSpace colorSpace) throws IOException;
}
