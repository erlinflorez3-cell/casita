package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
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
/* JADX INFO: compiled from: GraphicsLayerV29.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŋ\u0014D57\u001eq\u007fZDkŞ\fA\u00147\u0013ǞJ~8,\u001aՄ\u000ff\u000198DkH6Ra/\u0017k\u00027,[:qK;[\u001e\u0006\"\u001fOVgmuRZ\u0019L\u0017\u0006\u001c}r,_U\u0001]\u0018\u0012:B\u0006?;MuEA`\u000b6\rړ:\"Ny\r\u0001 *P\u0010\rzKK\u0012\u00138@\u0007:Z\rS\t\"\u0012\u001c>(\u0001$moNLHt]@7+\u0003wBV'e2\u0005M#F\\'\u0013wi\u001eA@?ߎ\u001d%i\u0003\u000fѸc?\u0019?yܵ\rh='3I\nW>X\u0016\u0014\u001d+U\u000fer<\\\rĩh\f=+WcQR\u0016(\u0006\u0001\u0004\rB\n\u0014\u0005=Ξ^-HeH-Cx\u0001SXP0_R\u0006\u0001aD\u0019=\u007fa.I!lQo?1Ne\u0001˿\u0011\u001e1\u00077'i;&`C\u0003\u001bw\u001a7_)UH|D Q6\n~L\u001a*2\u0018\u000e\u0014w\n\u001f\u0019/%eCi'/W\u001aHrT=\u0019)naWjHnZ5\u0016\u007fa\u0017zrD\u0013l\u001cTbHD\u0011{\r\u0005\u000b\fy+ \u000bjl%3\u0004fO\u0017^\u001bbk\u007f=@v9in\u001a\u0006g;n3c9\u0012\u0007уVv\u001a8\u0003vM^t<k\f\t{n\"zNx\u000b\u0010{rmR\u0013ze\u007f\u0018L,_\u0001\r\u001bV\u007f6DW{7]\u000bn\u001eиSK%1ǯ#;\u001dˏOʔʼsk~̥+\u000bʤ!uq_چ\u0018>UPPd\u00031Ț}\f\u0001uьKwRzֽtm|Nڍ\u0019iV=\u0019+\u0010-ǽ1HAןKǩϯUQ\u0018؆y\u000bȴ\u000e\u0004o<ԡ\u0007\u0003pZH1J\u0018s%ǽuvrQo\r\u007f(*v~U\u0012l\u000b\nk\u0010rľXߢҡ<\u0001\u000bȡ\u001d3˨nr\u001fC6['K\u001e(\u0018=\u001cy]\u0018wlN9Ϟ2܌i\u00104ϣ.qh[k=[:Oe\rKrNz\u0012ZH\u0019\u00068F\u0017;%3vO#E-ЬYÊ.̎\u05fe\u0006+ޛtdc:!\u0004\u001664o8\u0005c\u007f\u001apQ8awa}\u0006myq;N\u001d\u0011#{_\u0004Pp\u0014։bΩa־߮\u0005r͛:OCb\u0013W!&:CJ +EZ\u0003\u0014*K\"T{'\u0017`J$?d\u0015lx\u000b^\u0007Y7ѻlՃ.\r\u0007۰K ~R?\u0010\u000eHZMq?Q_+\r3j}\u0004=ފ-\u05ffX9#ι)\r\u0019GuCw\u0005\rߧIԆqkwȯ\t:\u000b=Z\u0018IX\u0002\u0015m}H^9t##;ʑ\u001e؉VZ*Ė\u0017|\u0003/J,/\r\u001fr\u0001\u001439Zs\u00107q9WӂPͫ\u000b\f\u0005ݭ\u0017';,M-khA̢3ٖ[SCջXF.O\u001cv7[\u00065\u0017\u0010k\"R\u0018\b\u0015\u0011)Gg'ܗ\u0010̛N\u0001z˖F\n<x\u0010]\"\u0015d\u0005y$qj5Y\u0005\u0006px\u0019|\u0018j\u0005c\u001d\u0003IW=܉bԬm߲ə\u001c\bߓQ<\u001bXhU)U&\b\u001f\u00184\u0017,OD\"3;\u001e\u0001{h\u001f\u000b\u00060cĢ1֗.eI2XP\fAJ\u000e\u0012]l(CZ-\u05fdJŜ\rht܀o\u0010d\u001e6\u0007\u0015\u000e/H\u000b#\u0019p\u001fHLF!\u001f\u001b\u0004\u000eض!˝\u0011Kx\t\n{W7q?`v39H\n\u001e`M֮\u000f̯ft\b˟\u0013\u0017\u00019\u007f.CE\u0003wpŞeޡqd\u000b\u0379\u001cQF} ,?-g˒fߣ$>dӊlM_3Y\u0019?\u0002kƠ\b˲\u000b\u001f=շiU+f\u000f\u000eQ7M8Ikh1gv16'oI\u0015%\u0010{˶qϐ&ڄ\u0604dIԐQq^\u000fo@a7K]\bf`\u0002\u0010_27V\u001c1B]3^)\u000e\u001ep\\\u0002^\u001c(@5\u001d\u0006a\u001cCՄ\u007fԤ0u ĵ|]gwO?4\u001bJ\u00048s=\u0013S\u0015\u0001y9\rcҸ\u0016ʁ\u0013\u00061ؔg\u001f\u001e\u0019\n@YQ#Q=cu<A{B\u000f\tݚB̹KLaآ\u001e/\u0018\u001fqu\u000boW+\u001eEb/\u001bP\u00101\u0001h0d+\u001f?K%Nt1O§MǶ\u000fL\u0017ěv0HY\u0019\u001160Ne\u0010\u000b\u001b\u0003#bKG\"Iw\u0016d\u00039\u001d?ccZ{ٷvߒCayةU;9[{Ux7k.\u0013bqmr}-\u007f\u00193^KdE2*\u0007\u000eL\u001a;с\u001cͭ|P0ҒH26$\rec_\u0007p-J&7sTJbec\u0015\u00159>on\u0001]a\u0002Oߦ\u000fߓE%\u001bǺ6U?\t1~-3DS\u0016i\u001aw\u000bFa\u00101iz%=\rW/oS++<ȁ%ٮC\u000b\u0014Ԍ?&\fl2m\b\u0015oh0lS`D2AHy6g\u07b2Nڡ\u000e߇ɗ\u000b-ۢ<W\u000e=\u0014%3FC\u0019w@Z<!\rUV\u0003{Xs.;KʕYԐ*ܲ\u05f5=0߄\u0015qW_\"\u0003i^^\u001d%hFB\u0019a(0v\u0004\n)A0E]\u0014qxzl`?ar@\u0007ٰ\u0006ܛjpF͔V>NN'qo\u007f!4RoY\u0003~,Y\u0010\u0011t\\+DO\u0003\u0019/\t\n6m֦Cޑz/oʨR$g\u0007ahEIPk\u001cwˇw\u001e\u0004`9\u038d)\u001e+\u0005\u0015\u000b]ܵvçk"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u0014Tx\"L", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u0014G4Y}|", "=v]2e\u0010=", "", "1`]CT:!] }zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{x8TB;x\n", "1`]CT:\u001d`\u0015\u0011h\\6\b\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u0019g=/\u0011v@F\u0003u\u001aL\u00012G\"", "uI;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#[\u001c@~\u0012<0MBj4+jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^WP8\t\u0010\\E\"|\u000e6,\u0004>W\u007fEs\u0001Us\n>{lP5\u001dC\f\u0003sK4h\u001c\u001dP", "D`[BX", "", "/k_5T", "5dc\u000e_7AO", "u(5", "Adc\u000e_7AO", "uE\u0018#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "/lQ6X5MA\u001czyh>Z\u00136o\r", "5dc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006MHa\u0016\u0019isAf", "u(9", "Adc\u000e`)BS\"\u000eha({\u0013AC\n/\u0006MHi\u0011\u001a;\u0015CR", "uI\u0018#", "\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0012`})6U -M\u0019", "0kT;W\u0014HR\u0019", "5dc\u000f_,GR\u0001\ty^sG\u0012\u00196p:k", "u(8", "Adc\u000f_,GR\u0001\ty^s\u000b\\+n\u0001.N", "uH\u0018#", "\u0017", "1`\\2e(\u001dW'\u000evg*|", "5dc\u0010T4>`\u0015]~l;x\u0012-e", "Adc\u0010T4>`\u0015]~l;x\u0012-e", "", "1kX=", "5dc\u0010_0I", "u(I", "Adc\u0010_0I", "uY\u0018#", "1kX=G6\u001b])\byl", "1kX=G6(c(\u0006~g,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DN\u001a5\\CHA", "1n[<e\rBZ(~\b", "5dc\u0010b3H`y\u0003\u0002m,\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#[*>w#\u000fQJJkAs", "Adc\u0010b3H`y\u0003\u0002m,\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~7\b'Azv2TR;x\na\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7s8UNEy8-\u0019qc'\u0016p(]v)[\"", "1n\\=b:Bb\u001d\b|L;\n\u0005>e\u0002<", "5dc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^\u001dG<sPF7", "Adc\u0010b4I]'\u0003\nb5~v>r{7{B\u0015^\tR\u0002a:\u007f'", "6`b\u0011\\:IZ\u0015\u0013ab:\f", "5dc\u0015T:\u001dW'\n\u0002Z@c\r=t", "7r8;i(EW\u0018z\n^+", "Adc\u0016a=:Z\u001d}vm,{", ":`h2e\u0010=", "5dc\u0019T@>`|}", ":`h2e\u0017:W\"\u000e", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wD\n&l", ";`c?\\?", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0010wO\u000e\u001b*\u001d", "=tc9\\5>7'i\bh=\u0001\b/d", "5dc\u001cj5>`|}", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ">he<g\u0016?T'~\n", "5dc\u001d\\=Hb\u0003\u007f{l,\fP\u00101]wX2K", "Adc\u001d\\=Hb\u0003\u007f{l,\fP5-N/g\u000bh", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\"Y\u0007\u001f7zu/NC9z\n", "@d]1X9\u001eT\u001a~xm", "5dc\u001fX5=S&^{_,z\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#j @l\u0016;-D<k2-j", "Adc\u001fX5=S&^{_,z\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019$Cz\u0011@t3~F})6m#\u000eND;iCsXY", "@d]1X9']\u0018~", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{I\u007f\u0017$0y\r<L", "@nc.g0H\\\f", "5dc\u001fb;:b\u001d\t\u0004Q", "Adc\u001fb;:b\u001d\t\u0004Q", "@nc.g0H\\\r", "5dc\u001fb;:b\u001d\t\u0004R", "Adc\u001fb;:b\u001d\t\u0004R", "@nc.g0H\\\u000e", "5dc\u001fb;:b\u001d\t\u0004S", "Adc\u001fb;:b\u001d\t\u0004S", "AbP9X\u001f", "5dc V(ES\f", "Adc V(ES\f", "AbP9X ", "5dc V(ES\r", "Adc V(ES\r", "AgP1b>\u001eZ\u0019\u0010vm0\u0007\u0012", "5dc [(=]+^\u0002^=x\u00183o\t", "Adc [(=]+^\u0002^=x\u00183o\t", "Ahi2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "Ao^AF/:R#\u0011Xh3\u0007\u0016", "5dc c6MA\u001czyh>Z\u00136o\roF?R\u0011|L_", "Adc c6MA\u001czyh>Z\u00136o\roN:Sb\u001eNK", "BqP;f3:b\u001d\t\u0004Q", "5dc!e(Ga z\nb6\u0006{", "Adc!e(Ga z\nb6\u0006{", "BqP;f3:b\u001d\t\u0004R", "5dc!e(Ga z\nb6\u0006|", "Adc!e(Ga z\nb6\u0006|", "/o_9l\nEW$", "", "1`[0h3:b\u0019fvm9\u0001\u001c", "2hb0T9=2\u001d\r\u0006e(\u0011o3s\u000f", "2qPD", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "=ac.\\5%O-~\bI(\u0001\u0012>", "@dR<e+", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", ":`h<h;\u001dW&~xm0\u0007\u0012", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ":`h2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "@d`B\\9>av\t\u0003i6\u000b\r>i\t*b<\u0015\u0017$", "@d`B\\9>a\u007fz\u000f^9g\u00053n\u000f", "Adc\u001ch;EW\"~", "=tc9\\5>", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0012\fO\b\u001b GE", "=tc9\\5>A\u001d\u0014z", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "Adc\u001ch;EW\"~BHv\u0003p<_}", "uKP;W9HW\u0018H|k(\b\f3c\u000eqeP\u0010\u001e\u001bPoc!:\u0016", "Adc\u001db:Bb\u001d\t\u0004", "F", "", "G", "Adc\u001db:Bb\u001d\t\u0004&\u000fG\u0014\u001cu\n\u001c", "uH8\u0017\u001c\u001d", "CoS.g,%O-~\bI9\u0007\u0014/r\u000f,{N", "/o_9l\nH[$\t\tb;\u0001\u00121S\u000f5wO\u0001\u0019+", "/o_9l\nH[$\t\tb;\u0001\u00121S\u000f5wO\u0001\u0019+\u000fdY/G6 W", "uKP;W9HW\u0018H|k(\b\f3c\u000eqh@\n\u0016\u0017TX\u0018;vz\u0019\u001dn", "Ch\u001c4e(IV\u001d|\tX9|\u0010/a\u000e("}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class GraphicsLayerV29 implements GraphicsLayerImpl {
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
    private Paint layerPaint;
    private Matrix matrix;
    private boolean outlineIsProvided;
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
    private long size;
    private long spotShadowColor;
    private float translationX;
    private float translationY;

    public GraphicsLayerV29(long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope) {
        this.ownerId = j2;
        this.canvasHolder = canvasHolder;
        this.canvasDrawScope = canvasDrawScope;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.renderNode = renderNode;
        this.size = Size.Companion.m4015getZeroNHjbRc();
        renderNode.setClipToBounds(false);
        m4850applyCompositingStrategyZ1X6vPc(renderNode, CompositingStrategy.Companion.m4814getAutoke2Ky5w());
        this.alpha = 1.0f;
        this.blendMode = BlendMode.Companion.m4120getSrcOver0nO6VwU();
        this.pivotOffset = Offset.Companion.m3952getUnspecifiedF1C5BW0();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.ambientShadowColor = Color.Companion.m4204getBlack0d7_KjU();
        this.spotShadowColor = Color.Companion.m4204getBlack0d7_KjU();
        this.cameraDistance = 8.0f;
        this.compositingStrategy = CompositingStrategy.Companion.m4814getAutoke2Ky5w();
        this.isInvalidated = true;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getOwnerId() {
        return this.ownerId;
    }

    public /* synthetic */ GraphicsLayerV29(long j2, CanvasHolder canvasHolder, CanvasDrawScope canvasDrawScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, (2 & i2) != 0 ? new CanvasHolder() : canvasHolder, (i2 + 4) - (i2 | 4) != 0 ? new CanvasDrawScope() : canvasDrawScope);
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
    /* JADX INFO: renamed from: getBlendMode-0nO6VwU */
    public int mo4838getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setBlendMode-s9anfk8 */
    public void mo4843setBlendModes9anfk8(int i2) {
        this.blendMode = i2;
        obtainLayerPaint().setBlendMode(AndroidBlendMode_androidKt.m4029toAndroidBlendModes9anfk8(i2));
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
    /* JADX INFO: renamed from: getPivotOffset-F1C5BW0 */
    public long mo4840getPivotOffsetF1C5BW0() {
        return this.pivotOffset;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setPivotOffset-k-4lQ0M */
    public void mo4846setPivotOffsetk4lQ0M(long j2) {
        this.pivotOffset = j2;
        if (OffsetKt.m3958isUnspecifiedk4lQ0M(j2)) {
            this.renderNode.resetPivot();
        } else {
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
        this.ambientShadowColor = j2;
        this.renderNode.setAmbientShadowColor(ColorKt.m4232toArgb8_81llA(j2));
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: getSpotShadowColor-0d7_KjU */
    public long mo4841getSpotShadowColor0d7_KjU() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setSpotShadowColor-8_81llA */
    public void mo4848setSpotShadowColor8_81llA(long j2) {
        this.spotShadowColor = j2;
        this.renderNode.setSpotShadowColor(ColorKt.m4232toArgb8_81llA(j2));
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
        this.renderNode.setRotationZ(f2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void setCameraDistance(float f2) {
        this.cameraDistance = f2;
        this.renderNode.setCameraDistance(f2);
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
        if (Build.VERSION.SDK_INT >= 31) {
            RenderNodeVerificationHelper.INSTANCE.setRenderEffect(this.renderNode, renderEffect);
        }
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

    /* JADX INFO: renamed from: applyCompositingStrategy-Z1X6vPc */
    private final void m4850applyCompositingStrategyZ1X6vPc(RenderNode renderNode, int i2) {
        if (CompositingStrategy.m4810equalsimpl0(i2, CompositingStrategy.Companion.m4816getOffscreenke2Ky5w())) {
            renderNode.setUseCompositingLayer(true, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (CompositingStrategy.m4810equalsimpl0(i2, CompositingStrategy.Companion.m4815getModulateAlphake2Ky5w())) {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    private final void updateLayerProperties() {
        if (requiresCompositingLayer()) {
            m4850applyCompositingStrategyZ1X6vPc(this.renderNode, CompositingStrategy.Companion.m4816getOffscreenke2Ky5w());
        } else {
            m4850applyCompositingStrategyZ1X6vPc(this.renderNode, mo4839getCompositingStrategyke2Ky5w());
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setPosition-H0pRuoY */
    public void mo4847setPositionH0pRuoY(int i2, int i3, long j2) {
        this.renderNode.setPosition(i2, i3, IntSize.m6808getWidthimpl(j2) + i2, IntSize.m6807getHeightimpl(j2) + i3);
        this.size = IntSizeKt.m6820toSizeozmzZPI(j2);
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    /* JADX INFO: renamed from: setOutline-O0kMr_c */
    public void mo4845setOutlineO0kMr_c(Outline outline, long j2) {
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
    public void record(Density density, LayoutDirection layoutDirection, GraphicsLayer graphicsLayer, Function1<? super DrawScope, Unit> function1) {
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        try {
            CanvasHolder canvasHolder = this.canvasHolder;
            Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
            canvasHolder.getAndroidCanvas().setInternalCanvas(recordingCanvasBeginRecording);
            AndroidCanvas androidCanvas = canvasHolder.getAndroidCanvas();
            DrawContext drawContext = this.canvasDrawScope.getDrawContext();
            drawContext.setDensity(density);
            drawContext.setLayoutDirection(layoutDirection);
            drawContext.setGraphicsLayer(graphicsLayer);
            drawContext.mo4656setSizeuvyYCjk(this.size);
            drawContext.setCanvas(androidCanvas);
            function1.invoke(this.canvasDrawScope);
            canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
            this.renderNode.endRecording();
            setInvalidated(false);
        } catch (Throwable th) {
            this.renderNode.endRecording();
            throw th;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void draw(androidx.compose.ui.graphics.Canvas canvas) {
        AndroidCanvas_androidKt.getNativeCanvas(canvas).drawRenderNode(this.renderNode);
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
    public boolean getHasDisplayList() {
        return this.renderNode.hasDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public void discardDisplayList() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.GraphicsLayerImpl
    public long getLayerId() {
        return this.renderNode.getUniqueId();
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
        return CompositingStrategy.m4810equalsimpl0(mo4839getCompositingStrategyke2Ky5w(), CompositingStrategy.Companion.m4816getOffscreenke2Ky5w()) || requiresLayerPaint() || getRenderEffect() != null;
    }

    private final boolean requiresLayerPaint() {
        return (BlendMode.m4089equalsimpl0(mo4838getBlendMode0nO6VwU(), BlendMode.Companion.m4120getSrcOver0nO6VwU()) && getColorFilter() == null) ? false : true;
    }
}
