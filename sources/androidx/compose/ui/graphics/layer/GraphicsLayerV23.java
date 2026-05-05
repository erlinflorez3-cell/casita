package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
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
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: compiled from: GraphicsLayerV23.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŉ\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~03\u001aՄ\u000ff\u000198ǏmHDR[*\u0015k\u000442`,qI>]\u001a\u0014\"\u0011OTkon`Z\u0013C\u0015\r\u001exx5QU~b\u001a\u000fHBw?9Pw=O`|6\u000b(:\"Ny\rЏ\"*^\u0010~zIK\u0014\u0012F@xíZ\rc\u0005\"\u0012\f@(\u00014\\oN<Kt]P/+\u0003o^V'm0\u0005M\u0013L\\'#vi\u001e1A?5+%[Έ\u000fRq?\u000bӊy=\u001bh/ݐ3I\nW>X\u0016\u0014\u001d+e\rer,]\rQv\f/+UeSP\u001c.\u007fz\u0002\u0012B\u0003$ͺEΰ-]\u001a\u0015\u0007F3ϑq\u0014g`\u0006lB\u0018z\u00107')\u000e5C9IiagA\u0019\\;\u0014\u0005;#3\u0007t!iZ&`C\"ƻ{Q?Y\tCV9\"YkYJp+\u001a8pHG.\u001b,\u0015<G=7\nhi!ɶ\u0001҆זkx\u000bNvo2XV/:nDsp\u001dT`RT\u001dk~@\u001f@YX*E\u001f}6~fοʟ@!+\u0002\u0017]v\\\u0003M\fuU3t+qn\u001a\u0003\u001eM'9CG{\u0010\u0010\r=\u0014\bvp{pfp?<^j :2vc@{\n>f\fA-ou*0D1GYE`\u0011\u001cZU\r\fo[\u0017ɯ}d54\u0003\u0018\u0010#ը\u007f˩`qu\u03a2w\u0010@Eg0Ύ@i5GG\u001c\"1[\u000bɂ\u0006\u0017s.3\u0018TUƈk.xkzNڍ\u0019iU={+\u000f-hx\u0016ЈDɣȌiUSɄ&\t۩xWjvֵf j\u001f\u0018\u0011pX֭S/#%ܱqS\u000erэxyG)þb\u0005\u000fi\u001far1\u0019\u0003bʹ{þȷ\")\u0007ȉ!\u000bޕ,\f.+Ɇv,/CM$i8=\bʽ\u000e>t\u0014o\\g$;zQ\f~\u00028\u001a{\rI:$\u001b\rrLx\u0001 B7>K\b\u001fпpވZDUߒG\u007fl\u0013:\u001a\u0011XaH!~N^<pBsq\u000eDbQ.)M\u0002w,B\"ţ\u0017Ϡ\u000eϘГz0ߎ\u0016*E dmz\u000b6\u0018\u0002+VCAv\u0013QYNBDT\b9Z\u0005m\u0014\u0019\u0013\u007ftvMk\t\u0095\u007fƢUՕ\u0603w[ƪL\u0013hEn>B\u0003\u0005(A8\u001977 {b%QqP\u0019SK\u0013Kn]\b~%YN\u0013\u000eqϐd܁\u000fQeŝa\u0004<#U6\u000emu,F'M)P\u001e39\u007f\u00186ھ2Ϳ\u000fUl̯5\u0003 jjNP.UҖ~ɽ@\n\u0017ԥiq\u0001\u0012z-zo(;Q#\u0019\u0017rJE`SބRɴ1\u0012=σUKp75 wUA#\u0016Fp3\u0012\u001c9\\\u0006/=ōiΌ>\u0016yд3\u000e\u0017;h 2O!Ɩ~˹2\b>ОRY\u0010=v[\u0002vOiW1z\u000fZM~w8\r+8Eπ\u0017өj=^ҳ\u0007/VH\u0017Sm0\u0019\u0006hha}.\t)\u007fBDV#D\u0011z)>~\"=Gո[ݹ\fċ֓j)Հ5>Z\u001e\f<\u0012w\n[bB5=\\\u007fL\u0001Ynzuo\u000e\r\f^9Kך+ِ\u0001\u0003``\u0017GBjC6rdO\u0019M|cӨlԥ\bQQ\u008e93Xt)[R\ru^\u00057SLp,\u0018*p\fIϜ*ǋ1L\\ش2)_\\{wS4Y~PD\u001e+?Hg˒fߣ$>dӊlI_nY\u001b'\u007fCt\\˒\u0013ص9jYƚu6\u000f:\u0019\rm\u001b\bˌFތ;r+˄_\u0004)\u0016~;St<͚3۽\u0001ʆ۽}L\u07b2Z\u0011i,WK\u00160\bWX\u007f8\"zڥ\bÑ'\u0006Mʹ`,e\u001dNiD\u0002\u0012hB6\u001d\u0006SKz\u0002\f\nZ+VH;ծmǣ@ʯå\u0018CĎ.;t\u0007Sc\u0001{\u0011\b\u001bX49\u0015J7Hg\u0017\u001e\u0015\nBAH!\u0014\u0006ۮiڍ\u0017\u007f\f͡Jc<AU\ty,\fv \u001f4vx9i_>\u0005hԗ\u000fՠ{1ZϒP\u0003+e?K%Pf`\u0007VYb9JMx5ݒNՠ\u000f\u0012\u001eǚ`\u0019\bLXm5\u00159\u0017\u0002P\u00184dL9\u001d?eU\n3p\u0003Gm_0-\u0014ّ?ٱqV`˂}^\u000b'/X\u0005-\u001bRx:~id\u00122*\u0007\u0010>IrQ(D'NfB\u0007ߧ<ʒ\u0003fKי\u0019\u001e%\u0012c\"\u0006\u000188Ej539\u000eon\u0001_S1\u0007\u000b\u001b\u0010o#Q_tҤEߊ'\u007f\u0015ГV}\u000e4Wb\u001doOh\u0011p\u001bC=_W/oU\u001dZsH1Wm\tJt}\u0558\u0012ڃ(noѕ\u0002\u0010(:\u0011YVX/$Yha\tPG'z#\u0016^\u0010F^\u001e=4\u001b!p\fĺkޱ0:xĤ_QpY8r\u0010hz8[T{\u0002'\u001eIq?\u0005&ǳ ،U\\`ƃgk4!+\u0002H\\|ɂ\bǔ(ܦƵTbݺnu\\`\u001fo\u0005\u0016>F\u0012r\u0015tngLE`lGv\u000eRqсPѷ\bȢϘG@Źfz4'D^\u0003\u001b\u0007cYt7\u0016=(\u000588UH\u0007y\"\u0002gUKX\u000f&j\u0010\u0002SP4ռBƊs8\u0005ϯ\u001d@lX\u0012y%O6jy>\u0003hh(4-\t1\u001el\u00163&\f+\u000fjC*\u0086]Ρ#~lչ;  *eFg#\u0019l'K\u03832V`}t˫xS-\u0004\u0006%1ܩ\u007fҭk"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u0014Tx\u001cL", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u0014G4Y}|", "=v]2e\u001dBS+", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "=v]2e\u0010=", "", "1`]CT:!] }zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{x8TB;x\n", "1`]CT:\u001d`\u0015\u0011h\\6\b\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019g=/\u0011v@F\u0003u\u001aL\u00012G\"", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:Q%g\u0013 F|\u0018@u8~W\b(Bw$.\u0017S?56+\u0011sd=\u0005qu,r0XH\\\u000ffYq=!gA\nW*\u001a\u000f]@78BA'\u00136W\u0002\u0005x\u0005U\u0018\u001b1usFT\u001e\u0011x\"qS7fPd_C%=Ns&rjl\u0019n(8.\u001fqn^Y", "D`[BX", "", "/k_5T", "5dc\u000e_7AO", "u(5", "Adc\u000e_7AO", "uE\u0018#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "/lQ6X5MA\u001czyh>Z\u00136o\r", "5dc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006MHa\u0016\u0019isAf", "u(9", "Adc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006MHi\u0011\u001a;\u0015CR", "uI\u0018#", "\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "0kT;W\u0014HR\u0019", "5dc\u000f_,GR\u0001\ty^sG\u0012\u00196p:k", "u(8", "Adc\u000f_,GR\u0001\ty^s\u000b\\+n\u0001.N", "uH\u0018#", "\u0017", "1`\\2e(\u001dW'\u000evg*|", "5dc\u0010T4>`\u0015]~l;x\u0012-e", "Adc\u0010T4>`\u0015]~l;x\u0012-e", "", "1kX=", "5dc\u0010_0I", "u(I", "Adc\u0010_0I", "uY\u0018#", "1kX=G6\u001b])\byl", "1kX=G6(c(\u0006~g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "1n[<e\rBZ(~\b", "5dc\u0010b3H`y\u0003\u0002m,\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#[*>w#\u000fQJJkAs", "Adc\u0010b3H`y\u0003\u0002m,\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7\b'Azv2TR;x\na\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7s8UNEy8-\u0019qc'\u0016p(]v)[\"", "1n\\=b:Bb\u001d\b|L;\n\u0005>e\u0002<", "5dc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^\u001dG<sPF7", "Adc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^\tR\u0002a:\u007f'", "6`b\u0011\\:IZ\u0015\u0013ab:\f", "5dc\u0015T:\u001dW'\n\u0002Z@c\r=t", "7r8;i(EW\u0018z\n^+", "Adc\u0016a=:Z\u001d}vm,{", ":`h2e\u0010=", "5dc\u0019T@>`|}", ":`h2e\u0017:W\"\u000e", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&l", ";`c?\\?", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "=tc9\\5>7'i\bh=\u0001\b/d", "=tc9\\5>A\u001d\u0014z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "5dc\u001cj5>`|}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ">he<g\u0016?T'~\n", "5dc\u001d\\=Hb\u0003\u007f{l,\fP\u00101]wX2K", "Adc\u001d\\=Hb\u0003\u007f{l,\fP5-N/g\u000bh", "@d]1X9\u001eT\u001a~xm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u0007\u001f7zu/NC9z\n", "5dc\u001fX5=S&^{_,z\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#j @l\u0016;-D<k2-j", "Adc\u001fX5=S&^{_,z\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~F})6m#\u000eND;iCsXY", "@d]1X9']\u0018~", "\u001a`]1e6BRb\u0010~^>Fu/n~(\t)\u000b\u0016\u0017\u001d", "@nc.g0H\\\f", "5dc\u001fb;:b\u001d\t\u0004Q", "Adc\u001fb;:b\u001d\t\u0004Q", "@nc.g0H\\\r", "5dc\u001fb;:b\u001d\t\u0004R", "Adc\u001fb;:b\u001d\t\u0004R", "@nc.g0H\\\u000e", "5dc\u001fb;:b\u001d\t\u0004S", "Adc\u001fb;:b\u001d\t\u0004S", "AbP9X\u001f", "5dc V(ES\f", "Adc V(ES\f", "AbP9X ", "5dc V(ES\r", "Adc V(ES\r", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "5dc [(=]+^\u0002^=x\u00183o\t", "Adc [(=]+^\u0002^=x\u00183o\t", "Ag^B_+&O\"\u000fve3\u0011v/t](\u0005O\u0001$\u0002K\u0001\u0018K", "Ahi2", "Ao^AF/:R#\u0011Xh3\u0007\u0016", "5dc c6MA\u001czyh>Z\u00136o\roF?R\u0011|L_", "Adc c6MA\u001czyh>Z\u00136o\roN:Sb\u001eNK", "BqP;f3:b\u001d\t\u0004Q", "5dc!e(Ga z\nb6\u0006{", "Adc!e(Ga z\nb6\u0006{", "BqP;f3:b\u001d\t\u0004R", "5dc!e(Ga z\nb6\u0006|", "Adc!e(Ga z\nb6\u0006|", "/o_9l\nEW$", "", "/o_9l\nH[$\t\tb;\u0001\u00121S\u000f5wO\u0001\u0019+", "/o_9l\nH[$\t\tb;\u0001\u00121S\u000f5wO\u0001\u0019+\u000fa\u0019NJ#>[", "1`[0h3:b\u0019fvm9\u0001\u001c", "2hb0T9=2\u001d\r\u0006e(\u0011o3s\u000f", "2hb0T9=2\u001d\r\u0006e(\u0011o3s\u000f\f\u0005O\u0001$ Cv", "2hb0T9=2\u001d\r\u0006e(\u0011o3s\u000f\f\u0005O\u0001$ CvLLz\u001f7fy+:q\u0014<GP;r4\u001a#h", "2qPD", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "=ac.\\5%O-~\bI(\u0001\u0012>", "@dR<e+", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ":`h2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "@d`B\\9>av\t\u0003i6\u000b\r>i\t*b<\u0015\u0017$", "Adc\u001ch;EW\"~", "=tc9\\5>", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0012\fO\b\u001b GE", "Adc\u001ch;EW\"~BHv\u0003p<_}", "uKP;W9HW\u0018H|k(\b\f3c\u000eqeP\u0010\u001e\u001bPoc!:\u0016", "Adc\u001db:Bb\u001d\t\u0004", "F", "", "G", "Adc\u001db:Bb\u001d\t\u0004&\u000fG\u0014\u001cu\n\u001c", "uH8\u0017\u001c\u001d", "CoS.g,%O-~\bI9\u0007\u0014/r\u000f,{N", "Dda6Y@,V\u0015}\u0005p\n\u0007\u00109rj5\u0006K\u0001$&Ko\u001c", "\u0011n\\=T5B]\"", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class GraphicsLayerV23 implements GraphicsLayerImpl {
    public static final Companion Companion = new Companion(null);
    private static final AtomicBoolean needToValidateAccess = new AtomicBoolean(true);
    private static boolean testFailCreateRenderNode = false;
    private float alpha;
    private long ambientShadowColor;
    private int blendMode;
    private float cameraDistance;
    private final CanvasDrawScope canvasDrawScope;
    private final CanvasHolder canvasHolder;
    private boolean clip;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private ColorFilter colorFilter;
    private int compositingStrategy;
    private boolean isInvalidated;
    private final long layerId;
    private Paint layerPaint;
    private Matrix matrix;
    private boolean outlineIsProvided;
    private long outlineSize;
    private final long ownerId;
    private long pivotOffset;
    private RenderEffect renderEffect;
    private final RenderNode renderNode;
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

    public GraphicsLayerV23(View view, long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.ownerId = j2;
        this.canvasHolder = canvasHolder;
        this.canvasDrawScope = canvasDrawScope;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view);
        this.renderNode = renderNodeCreate;
        this.size = IntSize.Companion.m6813getZeroYbymL2g();
        this.outlineSize = IntSize.Companion.m6813getZeroYbymL2g();
        if (needToValidateAccess.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            verifyShadowColorProperties(renderNodeCreate);
            discardDisplayListInternal$ui_graphics_release();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        if (testFailCreateRenderNode) {
            throw new NoClassDefFoundError();
        }
        renderNodeCreate.setClipToBounds(false);
        m4849applyCompositingStrategyWpw9cng(CompositingStrategy.Companion.m4814getAutoke2Ky5w());
        this.compositingStrategy = CompositingStrategy.Companion.m4814getAutoke2Ky5w();
        this.blendMode = BlendMode.Companion.m4120getSrcOver0nO6VwU();
        this.alpha = 1.0f;
        this.pivotOffset = Offset.Companion.m3952getUnspecifiedF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.ambientShadowColor = Color.Companion.m4204getBlack0d7_KjU();
        this.spotShadowColor = Color.Companion.m4204getBlack0d7_KjU();
        this.cameraDistance = 8.0f;
        this.isInvalidated = true;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getOwnerId() {
        return this.ownerId;
    }

    public /* synthetic */ GraphicsLayerV23(View view, long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, j2, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? new CanvasHolder() : canvasHolder, (-1) - (((-1) - i2) | ((-1) - 8)) != 0 ? new CanvasDrawScope() : canvasDrawScope);
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

    /* JADX INFO: renamed from: applyCompositingStrategy-Wpw9cng */
    private final void m4849applyCompositingStrategyWpw9cng(int i2) {
        RenderNode renderNode = this.renderNode;
        if (CompositingStrategy.m4810equalsimpl0(i2, CompositingStrategy.Companion.m4816getOffscreenke2Ky5w())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m4810equalsimpl0(i2, CompositingStrategy.Companion.m4815getModulateAlphake2Ky5w())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getBlendMode-0nO6VwU */
    public int mo4838getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setBlendMode-s9anfk8 */
    public void mo4843setBlendModes9anfk8(int i2) {
        if (BlendMode.m4089equalsimpl0(this.blendMode, i2)) {
            return;
        }
        this.blendMode = i2;
        obtainLayerPaint().setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m4030toPorterDuffModes9anfk8(i2)));
        updateLayerProperties();
    }

    private final boolean requiresCompositingLayer() {
        return (!CompositingStrategy.m4810equalsimpl0(mo4839getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m4816getOffscreenke2Ky5w()) && BlendMode.m4089equalsimpl0(mo4838getBlendMode0nO6VwU(), BlendMode.Companion.m4120getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m4849applyCompositingStrategyWpw9cng(CompositingStrategy.Companion.m4816getOffscreenke2Ky5w());
        } else {
            m4849applyCompositingStrategyWpw9cng(mo4839getCompositingStrategyke2Ky5w());
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        if (colorFilter != null) {
            m4849applyCompositingStrategyWpw9cng(CompositingStrategy.Companion.m4816getOffscreenke2Ky5w());
            RenderNode renderNode = this.renderNode;
            Paint paintObtainLayerPaint = obtainLayerPaint();
            paintObtainLayerPaint.setColorFilter(AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter));
            renderNode.setLayerPaint(paintObtainLayerPaint);
            return;
        }
        updateLayerProperties();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setAlpha(float f2) {
        this.alpha = f2;
        this.renderNode.setAlpha(f2);
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
            this.shouldManuallySetCenterPivot = true;
            this.renderNode.setPivotX(IntSize.m6808getWidthimpl(this.size) / 2.0f);
            this.renderNode.setPivotY(IntSize.m6807getHeightimpl(this.size) / 2.0f);
        } else {
            this.shouldManuallySetCenterPivot = false;
            this.renderNode.setPivotX(Offset.m3937getXimpl(j2));
            this.renderNode.setPivotY(Offset.m3938getYimpl(j2));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleX(float f2) {
        this.scaleX = f2;
        this.renderNode.setScaleX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setScaleY(float f2) {
        this.scaleY = f2;
        this.renderNode.setScaleY(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationX(float f2) {
        this.translationX = f2;
        this.renderNode.setTranslationX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setTranslationY(float f2) {
        this.translationY = f2;
        this.renderNode.setTranslationY(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setShadowElevation(float f2) {
        this.shadowElevation = f2;
        this.renderNode.setElevation(f2);
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
            RenderNodeVerificationHelper28.INSTANCE.setAmbientShadowColor(this.renderNode, ColorKt.m4232toArgb8_81llA(j2));
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
            RenderNodeVerificationHelper28.INSTANCE.setSpotShadowColor(this.renderNode, ColorKt.m4232toArgb8_81llA(j2));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationX(float f2) {
        this.rotationX = f2;
        this.renderNode.setRotationX(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationY(float f2) {
        this.rotationY = f2;
        this.renderNode.setRotationY(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRotationZ(float f2) {
        this.rotationZ = f2;
        this.renderNode.setRotation(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f2) {
        this.cameraDistance = f2;
        this.renderNode.setCameraDistance(-f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setClip(boolean z2) {
        this.clip = z2;
        applyClip();
    }

    private final void applyClip() {
        boolean z2 = getClip() && !this.outlineIsProvided;
        boolean z3 = getClip() && this.outlineIsProvided;
        if (z2 != this.clipToBounds) {
            this.clipToBounds = z2;
            this.renderNode.setClipToBounds(z2);
        }
        if (z3 != this.clipToOutline) {
            this.clipToOutline = z3;
            this.renderNode.setClipToOutline(z3);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setPosition-H0pRuoY */
    public void mo4847setPositionH0pRuoY(int i2, int i3, long j2) {
        this.renderNode.setLeftTopRightBottom(i2, i3, IntSize.m6808getWidthimpl(j2) + i2, IntSize.m6807getHeightimpl(j2) + i3);
        if (IntSize.m6806equalsimpl0(this.size, j2)) {
            return;
        }
        if (this.shouldManuallySetCenterPivot) {
            this.renderNode.setPivotX(IntSize.m6808getWidthimpl(j2) / 2.0f);
            this.renderNode.setPivotY(IntSize.m6807getHeightimpl(j2) / 2.0f);
        }
        this.size = j2;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setOutline-O0kMr_c */
    public void mo4845setOutlineO0kMr_c(Outline outline, long j2) {
        this.outlineSize = j2;
        this.renderNode.setOutline(outline);
        this.outlineIsProvided = outline != null;
        applyClip();
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
    public boolean getHasDisplayList() {
        return this.renderNode.isValid();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void record(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, Function1<? super DrawScope, Unit> function1) {
        Canvas canvasStart = this.renderNode.start(Math.max(IntSize.m6808getWidthimpl(this.size), IntSize.m6808getWidthimpl(this.outlineSize)), Math.max(IntSize.m6807getHeightimpl(this.size), IntSize.m6807getHeightimpl(this.outlineSize)));
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(canvasStart);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            CanvasDrawScope canvasDrawScope = this.canvasDrawScope;
            long jM6820toSizeozmzZPI = IntSizeKt.m6820toSizeozmzZPI(this.size);
            Density density2 = canvasDrawScope.getDrawContext().getDensity();
            LayoutDirection layoutDirection2 = canvasDrawScope.getDrawContext().getLayoutDirection();
            androidx.compose.ui.graphics.Canvas canvas = canvasDrawScope.getDrawContext().getCanvas();
            long jMo4655getSizeNHjbRc = canvasDrawScope.getDrawContext().mo4655getSizeNHjbRc();
            GraphicsLayer graphicsLayer2 = canvasDrawScope.getDrawContext().getGraphicsLayer();
            DrawContext drawContext = canvasDrawScope.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setCanvas(androidCanvas);
            drawContext.mo4656setSizeuvyYCjk(jM6820toSizeozmzZPI);
            drawContext.setGraphicsLayer(graphicsLayer);
            androidCanvas.save();
            try {
                function1.invoke(canvasDrawScope);
                androidCanvas.restore();
                DrawContext drawContext2 = canvasDrawScope.getDrawContext();
                drawContext2.setDensity(density2);
                drawContext2.setLayoutDirection(layoutDirection2);
                drawContext2.setCanvas(canvas);
                drawContext2.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
                drawContext2.setGraphicsLayer(graphicsLayer2);
                canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
                this.renderNode.end(canvasStart);
                setInvalidated(false);
            } catch (Throwable th) {
                androidCanvas.restore();
                DrawContext drawContext3 = canvasDrawScope.getDrawContext();
                drawContext3.setDensity(density2);
                drawContext3.setLayoutDirection(layoutDirection2);
                drawContext3.setCanvas(canvas);
                drawContext3.mo4656setSizeuvyYCjk(jMo4655getSizeNHjbRc);
                drawContext3.setGraphicsLayer(graphicsLayer2);
                throw th;
            }
        } catch (Throwable th2) {
            this.renderNode.end(canvasStart);
            throw th2;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void draw(androidx.compose.ui.graphics.Canvas canvas) {
        DisplayListCanvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        Intrinsics.checkNotNull(nativeCanvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        nativeCanvas.drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public Matrix calculateMatrix() {
        Matrix matrix = this.matrix;
        if (matrix == null) {
            matrix = new Matrix();
            this.matrix = matrix;
        }
        this.renderNode.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void discardDisplayList() {
        discardDisplayListInternal$ui_graphics_release();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getLayerId() {
        return this.layerId;
    }

    private final void verifyShadowColorProperties(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            RenderNodeVerificationHelper28.INSTANCE.setAmbientShadowColor(renderNode, RenderNodeVerificationHelper28.INSTANCE.getAmbientShadowColor(renderNode));
            RenderNodeVerificationHelper28.INSTANCE.setSpotShadowColor(renderNode, RenderNodeVerificationHelper28.INSTANCE.getSpotShadowColor(renderNode));
        }
    }

    public final void discardDisplayListInternal$ui_graphics_release() {
        RenderNodeVerificationHelper24.INSTANCE.discardDisplayList(this.renderNode);
    }

    /* JADX INFO: compiled from: GraphicsLayerV23.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\":\u001b\u007f\u0007lm?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\fa(~:\t}P>˪pН^\u000bKƤV.\u0007mDI\u0004|4܉\u001b̓F{G\u074ceqC>nzV\u0007&90@ѯ\t\n"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u0014Tx\u001c5\u0005QTY(eV|Fi", "", "u(E", "<dT1G6/O \u0003yZ;|d-c\u007f6\n", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "BdbA9(BZv\fzZ;|u/n~(\t)\u000b\u0016\u0017", "", "5dc!X:M4\u0015\u0003\u0002<9|\u0005>el(\u0005?\u0001$\u007fQn\u000ez\u0007)/[\u000b\u001cBp\u001a,[=Hk;\u001e\u0011va", "u(I", "Adc!X:M4\u0015\u0003\u0002<9|\u0005>el(\u0005?\u0001$\u007fQn\u000ez\u0007)/[\u000b\u001cBp\u001a,[=Hk;\u001e\u0011va", "uY\u0018#", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean getTestFailCreateRenderNode$ui_graphics_release() {
            return GraphicsLayerV23.testFailCreateRenderNode;
        }

        public final void setTestFailCreateRenderNode$ui_graphics_release(boolean z2) {
            GraphicsLayerV23.testFailCreateRenderNode = z2;
        }
    }
}
