package androidx.compose.ui.graphics.layer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.AndroidBlendMode_androidKt;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidColorFilter_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
/* JADX INFO: compiled from: GraphicsViewLayer.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яš\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~03\u001aՄ\u000ff\u000198ǏmHDR[*\u0015k\u000442`,qI>]\u001a\u0014\"\u0011OTkon`Z\u0013C\u0015\u000f\u001exx5QU~b\u001a\u000fHBwЀ;M\u0006=A`z9\r H\"@y\u000b\u0007\"*^\u0010~zIL\u0014\u0012F@x:X\rU\u00050\u0012\u000e>&\u0002&\\}N>HraB/9\u0003qBT:g0\u0013M\u0015FZ/\u0015vw\u001e3¨?5#+[\u0003\rRc?\u0011?y=\u000bh/'AI{W<Y\b\u0014++W\rcs.\\\u001bQhϯ/+ecSִ\u0016(\u000ez\u0004ȞD\u0004$\u0006/HD-\"f\u001e\u000e;txVHP\u0018^J\u007f\u0001i<Ѝ;ĮQژ8Kf\u007f`s\u0019פ6<,\u001d\"1\u0001\u0007!\nU\u001ed#\u001dlw\u007f4aFCH\\\u000eq=\u001c\t\u0001h\b*\u00126_\u007f]\u0003 2\u00173?$Q1\u0015\u0004\u0002v9\u0018z\u0013\u0015\u0001S\u0018\u0006\u000f@·mݫ֖.\u000b\u0012PR\u0001Mq^Kp,?EbhO\u0004\u0016\f8\\&1g9X\\]b\u0002j{R:)=aOY\u001dgTk\u0002dA2ic>\u001e\u0019v\\\u0001J`\u001dX\u00157\u0004\u0012h٣':3vМ\u000f(\u0002R\u008b\u000b+3mڨ\u001bd2?ǎ[-I1٢Aq\u0016\u0017ݧY\u0001$\u000fWC%1Ƕ#\u0005\u000b\u0011P\u000be\u001eΧwͅ0}fÿ,\be} 4ũ!\u00014+\u0018M~<\u0007UёK_L\u001b9<UD'$֪8i/k6U~qZ\u0010ΝDdr\u0014F}\u001a5Ϥ{\u0012\u0012Qg\\Ԧ\u0007\u001bu:ߝibO\u0003{h\u000bޞqּϋh\u0004\u007fӥE\tąb\u001d6iƀH\u000b\u0003\b1~<\u000bu7\u001eSr &\u000b(ECU\u000fF{\"\u0013-a\fN6Bՙaχ֑xi\nЏb$̇a\u001ad@օ7aY-3h$5\nP\u05edi\u0010\bp}z\r\u0004jOo\tVfW;3\fo\u001f,;z\u00150\u0011ܻ{ϻ8:g͈\fE\u0004 lPE\u0013Sau|>uj\u001cb\u000f8\u001b,5|\u001b4=Nf\u00167_ތ\u0012\u0605\u0017ܽن:aƀ@\u0017,4:R \rIfw\u00190|\u0006Zm$g\\P\fSV<k)`dQ\u001d`sw_~WϪ\u001b˵\u001d֭î0\u0004֪Jb7c@\u001ek\u001f\u000f4xi\u001fh+FRp\n=6v\u0019\u000bsgsM\u0010?\u001cGWw\"DJ\rnԔ)Ð\u001c%QS\u0017~\u0005=~\r[\u0005\\sG!tVf\"W\u0004Ҷ\u0001\u0014D߽'\r\u001fp\u0001\u00123OZr\u00107q=1\u001bR2\u001f\f+\u0007|okZ\fϚIƹn\u001e?}]xI$(\"&N\u0012\u001dqhe7~\n\f>\u0011φ}їf\u0002\u0011ސ!,\u0012Xbt!5\u0005ý8с\u00063\nՂ/ey$9@UNCݬNƑlx\u0012ɨ=\n|\u0004#\u0005|0\u0005'\u001f3^&!)c-A\u0006\u0019\u000fgֽ,Ǩ\u0015\f\u001cݻ>!<7pY0Qi\u001a~\u001e \u0006\u001b_GkX\u0015a4`'\u0016\u001f()B~+Ӧ!πUצͷc\bЁpP_\u000el\b@fzA7.\u001d\u0001N\u0015\u001f/\u0005^\u0001U|/e<uˑ\u0019Ӵd\u0013\fـa('h`e;98C}PG\u001d\u0011:zt.+\u0019տtϨk,5õ%O(`q$\u001cgYΐMԺ<H\u0010ϴ)\u0010\u0017ihKpLjU4=g2oUg۷!Ƭ\no\u000fؒ\u0006v_\u0011=*/ W\u0090Kƺ5kBݩ\b\u000511'oIZ=օ'̂iR/ڄ\u001agP=[v'\u001doka7[\u001d(\u0016\u0017\u0097\fڍ($\u000e®s\u000eSr`,u[n[Jӕ\u0006ڲ.6vޏsUz;\f\fBhFz;՚cƍEz\u001cԌ\u0015h8q\u0005\u0007s\u0011\u0019}\u0019M%EBzMZ\u007fث#н\u000fށǹ?*߳v[7\\kR+u\n\u007f@tV{M\u0007g?VS \u001d{l\u0001l\u007f'@> \u0016%\u0006\u000e0\u0001(>5sȘ3ֲzR>˧\u0011OG,\u0019\u000b/&dyPX[\u001a${`\u001f Mrb+\u0012a\u0016\"\u0010\u001e̋XÝ%\u001d\u0019\u0603u(38\u0003Gm_\"\\KBK\u000b\u001cT\u0017\n<ڻ\u0011Ȝ%WlƓ-\u0002p|<Tv@ |f\u0015^gr\u001c(D'NXq>9HP-d\u00022W\u008b+ߚY!mۿJd=0r\u001eK9]D`dsO\u0007X\u001b\u0010o#C\u000f,\\Q2Q}K\u0006\u0015ϧ\u0014ׂMa\u0005˷a\u0012\t9X.O\bE\bOZ=xs\u00191Wm\t<$5-\u001e\u0013Rl&g@ڕ.ό\u0007X>̅AJQ4\u001fsbl\u0015V\u0003\u001b~.F2\u001e=4\u001b\u0013 CDw@Z8/]\u001eڹvʛ.qwѕ\r[S#9\u00039@7P\u001fr \u0002\"Ni\\\u0007HG[4I+\u0002H'd6RŲ5݉\u001bakݗ\u0003uZA\u001ffTm6F\b\u00027pLFV<v\u0010oʣ[ʪ\u001fQLϾYt~,Y\u0010\u0011Q\u0003ȲBǫiߘ˧\u007fJڼ\u001b\u0016?D\u000598]H\by\"\u0002mUKX\u000f&j\u0010\bSP4ռBǠnێΐ\u0014\u0004âj\u0001\fl\u0013cH\u0006q\u0016@YzB\"\u0015h<>\u000b\u0016\u0013&\f+\u000f\\ra[iuM|#Sy̥&҄[EO̖+\u0005\u001f&\u0016?mZ\u0001YfkuP\nq7\u0012p\u0006epO|\u00143\u0006{\u000e\t4Ї5բm\u0004(Ȩ\u0004\u0014\nPX0okh~k=\u001e\u0004\u0015HTYoq`ީ+Ά\f\u0015/ܝ\u0019@X#:#/\u0001\rΦVփrx-ߏ6\u0018=g\u000e\u000e`_\u0015ӽrʾk4Iǯω]\bM05ʹ$yHu~1fدMۙ9"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,\u0006laKm_@N\u0004|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u0014G4Y}|", ":`h2e\nH\\(z~g,\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7'2MU\u0005JA\u001a'Fd=\u000eb\nX\u007f6CPW,i(", "=v]2e\u0010=", "", "1`]CT:!] }zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{x8TB;x\n", "1`]CT:\u001d`\u0015\u0011h\\6\b\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019g=/\u0011v@F\u0003u\u001aL\u00012G\"", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~`y47z_?QCM5\u0013+\u0011z?<\u000bj+,\u00010VHR5\\_H\"z\u000ec\r[5\u0011\u0004l\u000b\"xLB)\u0016,\u0013\u0012?2\u0003\u0019\u0012\u00198nnP mC\u0003&qO\frMX_\u0007\u001d(Ak)q\u0016c\u001co\u00048.\u001c|#)h\u001a>\u000eEU\u001en]|keUbyE P{YPPo\u001f\u001ap00G\nV\u001f.jb)~8\u0004\nm'", "D`[BX", "", "/k_5T", "5dc\u000e_7AO", "u(5", "Adc\u000e_7AO", "uE\u0018#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "/lQ6X5MA\u001czyh>Z\u00136o\r", "5dc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006MHa\u0016\u0019isAf", "u(9", "Adc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006MHi\u0011\u001a;\u0015CR", "uI\u0018#", "\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "0kT;W\u0014HR\u0019", "5dc\u000f_,GR\u0001\ty^sG\u0012\u00196p:k", "u(8", "Adc\u000f_,GR\u0001\ty^s\u000b\\+n\u0001.N", "uH\u0018#", "\u0017", "1`\\2e(\u001dW'\u000evg*|", "5dc\u0010T4>`\u0015]~l;x\u0012-e", "Adc\u0010T4>`\u0015]~l;x\u0012-e", "5dc\u0010T5OO'a\u0005e+|\u0016", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#[\u001c@~\u0012<0MBj4+j", "", "1kX=", "5dc\u0010_0I", "u(I", "Adc\u0010_0I", "uY\u0018#", "1kX=56N\\\u0018\r^g=x\u00103d{7{?", "1kX=E,<b", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "1kX=G6\u001b])\byl", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "1n[<e\rBZ(~\b", "5dc\u0010b3H`y\u0003\u0002m,\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#[*>w#\u000fQJJkAs", "Adc\u0010b3H`y\u0003\u0002m,\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7\b'Azv2TR;x\na\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7s8UNEy8-\u0019qc'\u0016p(]v)[\"", "1n\\=b:Bb\u001d\b|L;\n\u0005>e\u0002<", "5dc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^\u001dG<sPF7", "Adc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^\tR\u0002a:\u007f'", "7r8;i(EW\u0018z\n^+", "Adc\u0016a=:Z\u001d}vm,{", ":`h2e\u0010=", "5dc\u0019T@>`|}", ":`h2e\u0017:W\"\u000e", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&l", "=tc9\\5>7'i\bh=\u0001\b/d", "5dc\u001cj5>`|}", ">hRAh9>", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u007f>\u0010'$GE", ">hRAh9>1\u0015\b\fZ:_\u00136d\u007f5", ">hRAh9>2&z\rL*\u0007\u0014/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ">he<g\u0016?T'~\n", "5dc\u001d\\=Hb\u0003\u007f{l,\fP\u00101]wX2K", "Adc\u001d\\=Hb\u0003\u007f{l,\fP5-N/g\u000bh", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u0007\u001f7zu/NC9z\n", "@d]1X9\u001eT\u001a~xm", "5dc\u001fX5=S&^{_,z\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#j @l\u0016;-D<k2-j", "Adc\u001fX5=S&^{_,z\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~F})6m#\u000eND;iCsXY", "@db<h9<S'", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\nm\u0017%Q\u007f\u001b:v3\u000b", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "@nc.g0H\\\f", "5dc\u001fb;:b\u001d\t\u0004Q", "Adc\u001fb;:b\u001d\t\u0004Q", "@nc.g0H\\\r", "5dc\u001fb;:b\u001d\t\u0004R", "Adc\u001fb;:b\u001d\t\u0004R", "@nc.g0H\\\u000e", "5dc\u001fb;:b\u001d\t\u0004S", "Adc\u001fb;:b\u001d\t\u0004S", "AbP9X\u001f", "5dc V(ES\f", "Adc V(ES\f", "AbP9X ", "5dc V(ES\r", "Adc V(ES\r", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "5dc [(=]+^\u0002^=x\u00183o\t", "Adc [(=]+^\u0002^=x\u00183o\t", "Ag^B_+&O\"\u000fve3\u0011v/t](\u0005O\u0001$\u0002K\u0001\u0018K", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "Ao^AF/:R#\u0011Xh3\u0007\u0016", "5dc c6MA\u001czyh>Z\u00136o\roF?R\u0011|L_", "Adc c6MA\u001czyh>Z\u00136o\roN:Sb\u001eNK", "BqP;f3:b\u001d\t\u0004Q", "5dc!e(Ga z\nb6\u0006{", "Adc!e(Ga z\nb6\u0006{", "BqP;f3:b\u001d\t\u0004R", "5dc!e(Ga z\nb6\u0006|", "Adc!e(Ga z\nb6\u0006|", "DhTD?(RS&", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7\u00072MU\"gH\u001e\">", "F", "", "G", "/o_9l\nH[$\t\tb;\u0001\u00121L{<{M", "", "/o_9l\nH[$\t\tb;\u0001\u00121L{<{MH\t\"YC\fEx", "1`[0h3:b\u0019fvm9\u0001\u001c", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "2hb0T9=2\u001d\r\u0006e(\u0011o3s\u000f", "2qPD", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "=ac.\\5%O-~\bI(\u0001\u0012>", "@dR<e+", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ":`h2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "@dR<e+\u001d`\u0015\u0011~g.f\u0014/r{7\u007fJ\n%", "@d`B\\9>av\t\u0003i6\u000b\r>i\t*b<\u0015\u0017$", "@d`B\\9>a\u007fz\u000f^9g\u00053n\u000f", "Adc\u001ch;EW\"~", "=tc9\\5>", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0012\fO\b\u001b GE", "=tc9\\5>A\u001d\u0014z", "Adc\u001ch;EW\"~BHv\u0003p<_}", "uKP;W9HW\u0018H|k(\b\f3c\u000eqeP\u0010\u001e\u001bPoc!:\u0016", "Adc\u001db:Bb\u001d\t\u0004", "Adc\u001db:Bb\u001d\t\u0004&\u000fG\u0014\u001cu\n\u001c", "uH8\u0017\u001c\u001d", "CoS.g,\u001cZ\u001d\nWh<\u0006\b=", "CoS.g,%O-~\bI9\u0007\u0014/r\u000f,{N", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class GraphicsViewLayer implements GraphicsLayerImpl {
    private float alpha;
    private long ambientShadowColor;
    private int blendMode;
    private final CanvasHolder canvasHolder;
    private boolean clipBoundsInvalidated;
    private final Rect clipRect;
    private boolean clipToBounds;
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private boolean isInvalidated;
    private final DrawChildContainer layerContainer;
    private final long layerId;
    private Paint layerPaint;
    private boolean outlineIsProvided;
    private final long ownerId;
    private final Picture picture;
    private final CanvasHolder pictureCanvasHolder;
    private final CanvasDrawScope pictureDrawScope;
    private long pivotOffset;
    private RenderEffect renderEffect;
    private final Resources resources;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private float shadowElevation;
    private boolean shouldManuallySetCenterPivot;
    private long size;
    private long spotShadowColor;
    private float translationX;
    private float translationY;
    private final ViewLayer viewLayer;

    /* JADX INFO: renamed from: x */
    private int f111x;

    /* JADX INFO: renamed from: y */
    private int f112y;
    public static final Companion Companion = new Companion(null);
    private static final boolean mayRenderInSoftware = !SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable();
    private static final Canvas PlaceholderCanvas = new Canvas() { // from class: androidx.compose.ui.graphics.layer.GraphicsViewLayer$Companion$PlaceholderCanvas$1
        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }
    };

    public GraphicsViewLayer(DrawChildContainer drawChildContainer, long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.layerContainer = drawChildContainer;
        this.ownerId = j2;
        this.canvasHolder = canvasHolder;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, canvasHolder, canvasDrawScope);
        this.viewLayer = viewLayer;
        this.resources = drawChildContainer.getResources();
        this.clipRect = new Rect();
        boolean z2 = mayRenderInSoftware;
        this.picture = z2 ? new Picture() : null;
        this.pictureDrawScope = z2 ? new CanvasDrawScope() : null;
        this.pictureCanvasHolder = z2 ? new CanvasHolder() : null;
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.size = IntSize.Companion.m6813getZeroYbymL2g();
        this.isInvalidated = true;
        this.layerId = View.generateViewId();
        this.blendMode = BlendMode.Companion.m4120getSrcOver0nO6VwU();
        this.compositingStrategy = CompositingStrategy.Companion.m4814getAutoke2Ky5w();
        this.alpha = 1.0f;
        this.pivotOffset = Offset.Companion.m3953getZeroF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.ambientShadowColor = Color.Companion.m4204getBlack0d7_KjU();
        this.spotShadowColor = Color.Companion.m4204getBlack0d7_KjU();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getOwnerId() {
        return this.ownerId;
    }

    public /* synthetic */ GraphicsViewLayer(DrawChildContainer drawChildContainer, long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawChildContainer, j2, (4 & i2) != 0 ? new CanvasHolder() : canvasHolder, (i2 + 8) - (i2 | 8) != 0 ? new CanvasDrawScope() : canvasDrawScope);
    }

    public final CanvasHolder getCanvasHolder() {
        return this.canvasHolder;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean isInvalidated() {
        return this.isInvalidated;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setInvalidated(boolean z2) {
        this.isInvalidated = z2;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getLayerId() {
        return this.layerId;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getBlendMode-0nO6VwU */
    public int mo4838getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setBlendMode-s9anfk8 */
    public void mo4843setBlendModes9anfk8(int i2) {
        this.blendMode = i2;
        obtainLayerPaint().setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m4030toPorterDuffModes9anfk8(i2)));
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        obtainLayerPaint().setColorFilter(colorFilter != null ? AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter) : null);
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getCompositingStrategy-ke2Ky5w */
    public int mo4839getCompositingStrategyke2Ky5w() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setCompositingStrategy-Wpw9cng */
    public void mo4844setCompositingStrategyWpw9cng(int i2) {
        this.compositingStrategy = i2;
        updateLayerProperties();
    }

    /* JADX INFO: renamed from: applyCompositingLayer-Wpw9cng */
    private final void m4851applyCompositingLayerWpw9cng(int i2) {
        ViewLayer viewLayer = this.viewLayer;
        boolean z2 = true;
        if (CompositingStrategy.m4810equalsimpl0(i2, CompositingStrategy.Companion.m4816getOffscreenke2Ky5w())) {
            this.viewLayer.setLayerType(2, this.layerPaint);
        } else if (CompositingStrategy.m4810equalsimpl0(i2, CompositingStrategy.Companion.m4815getModulateAlphake2Ky5w())) {
            this.viewLayer.setLayerType(0, this.layerPaint);
            z2 = false;
        } else {
            this.viewLayer.setLayerType(0, this.layerPaint);
        }
        viewLayer.setCanUseCompositingLayer$ui_graphics_release(z2);
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m4851applyCompositingLayerWpw9cng(CompositingStrategy.Companion.m4816getOffscreenke2Ky5w());
        } else {
            m4851applyCompositingLayerWpw9cng(mo4839getCompositingStrategyke2Ky5w());
        }
    }

    private final Paint obtainLayerPaint() {
        Paint paint = this.layerPaint;
        if (paint != null) {
            return paint;
        }
        Paint paint2 = new Paint();
        this.layerPaint = paint2;
        return paint2;
    }

    private final boolean requiresCompositingLayer() {
        return CompositingStrategy.m4810equalsimpl0(mo4839getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m4816getOffscreenke2Ky5w()) || requiresLayerPaint();
    }

    private final boolean requiresLayerPaint() {
        return (BlendMode.m4089equalsimpl0(mo4838getBlendMode0nO6VwU(), BlendMode.Companion.m4120getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setAlpha(float f2) {
        this.alpha = f2;
        this.viewLayer.setAlpha(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getPivotOffset-F1C5BW0 */
    public long mo4840getPivotOffsetF1C5BW0() {
        return this.pivotOffset;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setPivotOffset-k-4lQ0M */
    public void mo4846setPivotOffsetk4lQ0M(long j2) {
        this.pivotOffset = j2;
        if (OffsetKt.m3958isUnspecifiedk4lQ0M(j2)) {
            if (Build.VERSION.SDK_INT >= 28) {
                ViewLayerVerificationHelper28.INSTANCE.resetPivot(this.viewLayer);
                return;
            }
            this.shouldManuallySetCenterPivot = true;
            this.viewLayer.setPivotX(IntSize.m6808getWidthimpl(this.size) / 2.0f);
            this.viewLayer.setPivotY(IntSize.m6807getHeightimpl(this.size) / 2.0f);
            return;
        }
        this.shouldManuallySetCenterPivot = false;
        this.viewLayer.setPivotX(Offset.m3937getXimpl(j2));
        this.viewLayer.setPivotY(Offset.m3938getYimpl(j2));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleX(float f2) {
        this.scaleX = f2;
        this.viewLayer.setScaleX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleY(float f2) {
        this.scaleY = f2;
        this.viewLayer.setScaleY(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float f2) {
        this.translationX = f2;
        this.viewLayer.setTranslationX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float f2) {
        this.translationY = f2;
        this.viewLayer.setTranslationY(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setShadowElevation(float f2) {
        this.shadowElevation = f2;
        this.viewLayer.setElevation(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getAmbientShadowColor-0d7_KjU */
    public long mo4837getAmbientShadowColor0d7_KjU() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setAmbientShadowColor-8_81llA */
    public void mo4842setAmbientShadowColor8_81llA(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.ambientShadowColor = j2;
            ViewLayerVerificationHelper28.INSTANCE.setOutlineAmbientShadowColor(this.viewLayer, ColorKt.m4232toArgb8_81llA(j2));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU */
    public long mo4841getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA */
    public void mo4848setSpotShadowColor8_81llA(long j2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.spotShadowColor = j2;
            ViewLayerVerificationHelper28.INSTANCE.setOutlineSpotShadowColor(this.viewLayer, ColorKt.m4232toArgb8_81llA(j2));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationX(float f2) {
        this.rotationX = f2;
        this.viewLayer.setRotationX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationY(float f2) {
        this.rotationY = f2;
        this.viewLayer.setRotationY(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationZ(float f2) {
        this.rotationZ = f2;
        this.viewLayer.setRotation(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getCameraDistance() {
        return this.viewLayer.getCameraDistance() / this.resources.getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f2) {
        this.viewLayer.setCameraDistance(f2 * this.resources.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getClip() {
        return this.clipToBounds || this.viewLayer.getClipToOutline();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean z2) {
        boolean z3 = false;
        this.clipToBounds = z2 && !this.outlineIsProvided;
        this.clipBoundsInvalidated = true;
        ViewLayer viewLayer = this.viewLayer;
        if (z2 && this.outlineIsProvided) {
            z3 = true;
        }
        viewLayer.setClipToOutline(z3);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
        if (Build.VERSION.SDK_INT >= 31) {
            ViewLayerVerificationHelper31.INSTANCE.setRenderEffect(this.viewLayer, renderEffect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setPosition-H0pRuoY */
    public void mo4847setPositionH0pRuoY(int i2, int i3, long j2) {
        if (!IntSize.m6806equalsimpl0(this.size, j2)) {
            if (getClip()) {
                this.clipBoundsInvalidated = true;
            }
            this.viewLayer.layout(i2, i3, IntSize.m6808getWidthimpl(j2) + i2, IntSize.m6807getHeightimpl(j2) + i3);
            this.size = j2;
            if (this.shouldManuallySetCenterPivot) {
                this.viewLayer.setPivotX(IntSize.m6808getWidthimpl(j2) / 2.0f);
                this.viewLayer.setPivotY(IntSize.m6807getHeightimpl(j2) / 2.0f);
            }
        } else {
            int i4 = this.f111x;
            if (i4 != i2) {
                this.viewLayer.offsetLeftAndRight(i2 - i4);
            }
            int i5 = this.f112y;
            if (i5 != i3) {
                this.viewLayer.offsetTopAndBottom(i3 - i5);
            }
        }
        this.f111x = i2;
        this.f112y = i3;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setOutline-O0kMr_c */
    public void mo4845setOutlineO0kMr_c(Outline outline, long j2) {
        boolean layerOutline = this.viewLayer.setLayerOutline(outline);
        if (getClip() && outline != null) {
            this.viewLayer.setClipToOutline(true);
            if (this.clipToBounds) {
                this.clipToBounds = false;
                this.clipBoundsInvalidated = true;
            }
        }
        this.outlineIsProvided = outline != null;
        if (layerOutline) {
            return;
        }
        this.viewLayer.invalidate();
        recordDrawingOperations();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void record(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, Function1<? super DrawScope, Unit> function1) {
        if (this.viewLayer.getParent() == null) {
            this.layerContainer.addView(this.viewLayer);
        }
        this.viewLayer.setDrawParams(density, layoutDirection, graphicsLayer, function1);
        if (this.viewLayer.isAttachedToWindow()) {
            this.viewLayer.setVisibility(4);
            this.viewLayer.setVisibility(0);
            recordDrawingOperations();
            Picture picture = this.picture;
            if (picture != null) {
                Canvas canvasBeginRecording = picture.beginRecording(IntSize.m6808getWidthimpl(this.size), IntSize.m6807getHeightimpl(this.size));
                try {
                    CanvasHolder canvasHolder = this.pictureCanvasHolder;
                    if (canvasHolder != null) {
                        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
                        canvasHolder.getAndroidCanvas().setInternalCanvas(canvasBeginRecording);
                        AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
                        CanvasDrawScope canvasDrawScope = this.pictureDrawScope;
                        if (canvasDrawScope != null) {
                            long jM6820toSizeozmzZPI = IntSizeKt.m6820toSizeozmzZPI(this.size);
                            CanvasDrawScope.DrawParams drawParams = canvasDrawScope.getDrawParams();
                            Density densityComponent1 = drawParams.component1();
                            LayoutDirection layoutDirectionComponent2 = drawParams.component2();
                            androidx.compose.ui.graphics.Canvas canvasComponent3 = drawParams.component3();
                            long jM4651component4NHjbRc = drawParams.m4651component4NHjbRc();
                            CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope.getDrawParams();
                            drawParams2.setDensity(density);
                            drawParams2.setLayoutDirection(layoutDirection);
                            drawParams2.setCanvas(androidCanvas);
                            drawParams2.m4654setSizeuvyYCjk(jM6820toSizeozmzZPI);
                            androidCanvas.save();
                            function1.invoke(canvasDrawScope);
                            androidCanvas.restore();
                            CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope.getDrawParams();
                            drawParams3.setDensity(densityComponent1);
                            drawParams3.setLayoutDirection(layoutDirectionComponent2);
                            drawParams3.setCanvas(canvasComponent3);
                            drawParams3.m4654setSizeuvyYCjk(jM4651component4NHjbRc);
                        }
                        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
                        Unit unit = Unit.INSTANCE;
                    }
                } finally {
                    picture.endRecording();
                }
            }
        }
    }

    private final void recordDrawingOperations() {
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            Canvas canvas = PlaceholderCanvas;
            Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.drawChild$ui_graphics_release(androidCanvas, viewLayer, viewLayer.getDrawingTime());
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void draw(androidx.compose.ui.graphics.Canvas canvas) {
        updateClipBounds();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.drawChild$ui_graphics_release(canvas, viewLayer, viewLayer.getDrawingTime());
        } else {
            Picture picture = this.picture;
            if (picture != null) {
                nativeCanvas.drawPicture(picture);
            }
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public Matrix calculateMatrix() {
        return this.viewLayer.getMatrix();
    }

    private final void updateClipBounds() {
        Rect rect;
        if (this.clipBoundsInvalidated) {
            ViewLayer viewLayer = this.viewLayer;
            if (getClip() && !this.outlineIsProvided) {
                rect = this.clipRect;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.viewLayer.getWidth();
                rect.bottom = this.viewLayer.getHeight();
            } else {
                rect = null;
            }
            viewLayer.setClipBounds(rect);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void discardDisplayList() {
        this.layerContainer.removeViewInLayout(this.viewLayer);
    }

    /* JADX INFO: compiled from: GraphicsViewLayer.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001e\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u0006\u0010nj?1JͣIDɟ\u0004*=j<9*[ҸuCIUj\r0\ngN\u0016iĔN`\u0013¼'\b\u001c{x0\u001ad\u0007b*\u000f`HņC9UڎU;f{D\rڼ6+"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,\u0006laKm_@N\u0004e%VV7X[vG\u001dg", "", "u(E", "\u001ekP0X/HZ\u0018~\b<(\u0006\u001a+s", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "5dc\u001d_(<S\u001c\t\u0002],\nf+n\u0011$\n", "u(;.a+K]\u001d}D`9x\u00142i}6E\u001e| (C}c", ";`h\u001fX5=S&b\u0004L6}\u0018Aa\r(", "", "5dc\u001aT@+S\"}zk\u0010\u0006v9f\u000f:wM\u0001", "u(I", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean getMayRenderInSoftware() {
            return GraphicsViewLayer.mayRenderInSoftware;
        }

        public final Canvas getPlaceholderCanvas() {
            return GraphicsViewLayer.PlaceholderCanvas;
        }
    }
}
