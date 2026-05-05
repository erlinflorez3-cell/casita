package com.swmansion.gesturehandler.core;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.swmansion.gesturehandler.core.GestureHandler;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯĹ\u0014D57\u001eqܜLDqŞ\fA\f0\u0013.P\u0005*,\u0018}\u000ff\u000198DkK6Ra2\u0017k\u00026,[2\u0004KП]\u001a\u0014\"\u0011ѧVguwRZ\u0011H\u0017\u0006$}r,Ol\u0001](\u000f:ԏw?IMw=?p|6\u00133:Ĳ@y\u0013\u0010\"*^\u0010~zIM\u0014\u0012F@x:X\u0014U\u0005(\u0012\u000e>&\u0001&\\}N>HraB/9\u0003qBd'g0\u0003R\u0015Fj'\u0015vg+3@M5\u001dǬ[\u0003\u001dRc?\tuy=\u0013t/ݐ3I\nW>X\u0006\u0017\u001d+e\rer,^\u000bevϯE̒N\fWVʫ6v#\u0002\u001d>\u0014\u000eL&v͓]\u001a\u0015\bF7Ѝqծ?Ѡ\u0001\u001fEȸ~aD\u0018m\u0004A\u000fQ\u001b\u00156*I'2O{3qN'\u000fT9[\u0003)')cb\u00068IQn%xR\u0018BUm2X)\u0002r\u0012>1\u0018/*u^\u001b3\"s9Qv2\u0002\u0011Rub\u001d`\u00178\u001aVV+:nD\rp\tT\u0003RQ\u001dk\u0007ӹ\tA\u001f;4e\u0017\u007f\u0018\u0013Vο\b>1%>3}WȬnMcykÉlǶXʤ«\u0012WGO{9_U(a\u0001[\\CJU\u001dX\u0015'\u001c\u0012hP@\"`-1\u0010@\u0002RC$\u0015H> (|2?\u000ft\u0017^\u0002LN\n\u0013\u0017Vrp.w|5:\u0002\u0018\u001c#\u00011Tj[\bg'\u001fr|)0;;i5G\u000b\u0006&v\u001d\u0015#5f:\u0014\u0010}ZBdlDZ\u0006\u007f.\u001229\u007f2m\u0017\u001d{A200\f`;|_K*')a*\u0013IQFg6R!1nʅIgTE\n=^;*\u0016ۯ~\u0012at_\u000ew\u001d#iůH\u000b\u0003\b!~<\u000bm7\u001eSh '\u000bއ,['K}>\u0014w-oӤh\b.(G?*\u0003N\u001c,\u0012} g_Ϣ1S8wAE>j)zÜA`j&l\u000b\u0010Bم2`A\u0013U\u001d8\u0016\u0010=̕e\u001f,;U\u001fbHܬn\u00164\\bps\f\u0014\"ٴB=\u0014cR\u0016Ƥl{d\u0019Ͳ\u000e\"\u000e\u00120\u001dܪ\u001b\u0004 \u001fnp\u05cb/\u001esF\u001bq@pū;!$b\u0014l\r\u0019͐S\u0002\u0006>bHXmʤ\u0016JB\"V\u0007\u0017b\u070f[nL\u0015`KaOơI\u000f\u001dʍ\u001d\u00115_ \u001eKbСbJ\u0001\u0002 O\u001b3a\rݍ$CD\u0003TK1f۲\n]aSI\b72ڛq\u000ey\u0012$8F\u0018MH&vQS'^%\u000b\u000f\u0010c̹M|v@\n\u0003S0Ĭ}\u0013|<_R\u001e\u0019ĖN\u000bo\u0011\u0012|R\u00063[\u001a/\u001a\u000b)O\u001b\u000bޅE3-4P]AWS,'*?\u001a;F\u000f.Ă&\u001ctOA\u001e /\"k\u03839.qDG2\r!98\u0004\\2%w\u0018ڕ\u0007NO0\u001bH%'qyև X'YQ6FYQ\u0011\n\u0012T\u0014sc̄\u0002~1\u0005a5?\u0019$\u0017ߌLF\u0013\u0007?\u0001#\u001c'fӖ~,\u0015T\u0004|\u001a+A\u001e˴b\u0001p\u001a4\f\u00119+\u0004*\u00104`W,ݸ\u001e\u0012u2-\u001b:]Td؆=|\t\u000bQr]\u001c:\u0003*zs:\u0004D\u0003\r\u0007v\u0013)3t2fi=я\u00187[;,)\u000e\u0012٢H>!_7\u0006/\u007f9\u0019Ã'\u000f\u00111\u001f)\tH7P֠q\u0018gbߠ\rVٗ\u001e(gޣl-\u00174ɺDPB>ϴA\u0013\u001f˶YP lwӭ <_ߪ@a%\u000fͪ7\u001eo=ؒeo_Ǆ$B\u0001+$°Cz?˴9<x\u0001ܵ.'oQʰ\u0017@3̋dd':%\u0016O\rߤbn\u000f\u0010Oy:Sɸxm@.-O)2Յt;\u007fsTx/mз?ns\u0006'V/D̅C;G\u001b\u001cݨ\u000e-wҔr-qoƝ@\u0013\u0014Oܒn1;Ġ\u0006]O~x9]՜I\u0015Eˉ\u0005qF%Ϻ\u000fgqvԴyv[bt]j.ű\b;@ݫ5BYN\u0010B\f=\u0014dc!ݗ\u001c˩\u0010\u0014FF%\r2zyfnڲ_5\u001c7K|Gd˧)TOȋ\nX\u0011:]\\\u007fT\u001a\u0014\u009f-`\u00170bzd#{KG\")\u000e\u0012\u001f\u000f/Β\u0010s%<ȷ\u0018nU\u0006mq\u0007Xٝ7\f{՚W}uj֫T9K\u0013FE\u0005xݝ-_Vl\u0002pZN\"SŵG(D'_Xv>\u008c/h\u0003jCc\u0002J\u05fb\u0004i]y\rǬaO[\u0013,[@eזQm'=x\b\u0004>Ý_'S2a֣1;s;Ln\u0005\u0016לHm\u0001}I\u0016\u0004\u0010ĮgCNQ=ЕJ\u0005V\u0014ZI`M״\u000b8+4\u0006\u0019%\u0011Ӻ[w\u001cނ^\u001bLd;YMYĀ\u0010~B\u0019\u0012C\u0003\u001a̛\u000bPU4\"6\u0016pʑ4S_n/vx\u0017ÛN\u0003|Xۡn-\t\"_Sϔt1?_ߨ\u0010\u0014Umׄmi]\u0007Ǌ\u0016\u001e(\t)\u0010ð\u001c>a*-Y4%>{m\u0019[\u0005e\u001fן3\u00040\u0013a;krٴbV<v\ba{]˒\u001aiD\u0011m\u0011|VƲ\u000fzs<)FH\u0019}/ψJ2/\"9\\vQj\n\u0602.ۆ&_eՋ_L\f\u0012xf\u0018\u0017\u0002cA=]\b:\u0005-\u0005liIßxЙQ<\fΏG4LcN!M\\-wv\u000fz.\u001a\n\u001d.\u0005R\u0001]&%\u0001o\u0017%4\u0019ocw\bwˑ\u000fƨ@\u000e:Ìp|tfj4~\u001c\u0014/*D\u00124\u001bM$\u0002Ab\nQJ\\L5<*N߄\u0019ܡ\u0016\nkˈ;Qos\u001fl~i\u0006\u001aq<\bS2\u000e04<\bC9@\t\u000bϖ>ؗ'\u0007\u0017՛0Ll\u0003\u0007:Ys\u001aE\rw$1\u001cUJԱiû8AEφ.\rSEGs\u001eJw\u0007UնSةM\u0016BÔ\u001d\u0006\u0004uUTDM]،\u0010ϐ\u0014\u007fhܳZ\u0019}\"pP\f<\u0002d\u00112;c<9rf\u001d\bMʽmшA\"\u0015К\u001d@yH1\\Eaf\b\u000eYY\r+XiE\u0013&t\u00156kJ>@*\u0007\u0019=Á'ĳ\tQl΄.;K\u001aNgew\u0012\n{QP\u0003xo6:\"wDQ[@\fܝ\u0019¡Td=ٻv\u000b[E\u001cC?k\u0016\u0016H2u\u0001\u000b$=f \u000ex\n\u000b\u0011c\u0603\u0013ؼ2|~ܣ/A\u001b'8kr9Q\r1g3Y\u001d?kskd)A-\u001c2ۥ<ܛ\n'\u001bԳ7\u0018\u0014L\u0016&EgBx\u000e\u0001nki¶&ÿ2\b\u001cպ6X\u0013_\"A_b*ɗ%މ{_fȝU\u001c3L@\u000bFK\u00181ōs\u0019@$I?\u0005A>\u0018\u001eIa%7P\b;Ņ\u001e6(\"[>M0cql'\u0018!wSf8֝QP\u0006\u007f4\u001b}\u0011Hm\u001e\u0001\n<\f\".zޅ,\u0014>TAFp\u0003\u00153i[\\\u0017<9uڽ0\u05fa\u0010n8ٰ-\u0001\f$\u000fR\u0011\u00157Οzϝ\\L=ؿ;\u0003,6\u000f\u000eC_1JL`&^rF~v~^h߬\u0001ʃm\t\u0010Ӓ5\u0006\f\u0004sN<;O3/\n\u0005\\0dz\u0014Rh<\u0011Z[E\u001adbzb\u0010ʶ'ˌ4\u0005\u001fؒXlz?=Ka\u0001\u0017-I4_^\u000b\\\u0003ԕ5֚oy7Ô#[[-G\u001c-%f!\u000e̢Wӱ&(MӒUK+U\u001b`\u000b\u000ezE+xBxlnW\u00024'DF\rA\tC\u0019A4\\\u000bװ\u0001\u0099fo<ŤZdUo$\u00176Z5\u001e\ndA|\u000b\u0381FΠ\u001e\u0002f̮W%4jE\u000bIEYϐPڝ7xkȏmxbU\u001dM]kMyZ\u0014K\u001a*|\n@&u\u0012oDP\u0018\u0018WG\bq\tݳ\u0018ʇPu\u0005ܞa\u0014RVP\u0017cJNj\u0018\u001b\u0005i ֻTА`Btѷ\\+\u0004[t;\u000e@\u0012\u001cS]~\"Dlwj-v'Zt\u001eW\u0017@\u0019;?\u0013ݤqԞi,+ڃ^\u0002Y\u0004o\u0001(_x``\u0017`7\u000b̃\u0016а\u000f\u001e2ũp!\u0019#\u007f<.<\\z\\Ms73\u0003xɑd՝\u00110xo^\u0011)\u001dk\u001eQ;Kv\u0005dG|xv\u0006*\u000f)\u000eͩ\u0017ԡ6ITߊv#38\u0019\u0018\u001b)alk\u0002\u007f0)יCݴ]\b_ν=(<z]k5n3\u0013\u001fEYu.)UV&6\u001fj\u0017ֲ\u000fΘ\u0019J(̊*)\u0013\u001bK{G D\u0006\u001d\u000b\u0006#;رt\u0381\u001e\u0015sΦYS %UC\u0004\u0004\fuI0vJ:4cf\u0006¿&Մkr.ܚ-pjl__.L?2z\n\u0018t\u001e\u0014\t\b44DE\u0018R\u0018\u074c'ˤ%?Oβa5;f\u001cv̥o\u00049[z˯\u001e\u0011Wֳ6ʂ\u001d"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "\u0011n]0e,MSz~\tm<\n\t\u0012a\t'\u0003@\u000e\u0006", "", "u(E", "/bc6b5-g$~", "", "5dc\u000eV;B]\"m\u000fi,", "u(8", "Adc\u000eV;B]\"m\u000fi,", "uH\u0018#", "/bc6i(MW#\b^g+|\u001c", "5dc\u000eV;Bd\u0015\u000e~h5`\u0012.e\u0013", "Adc\u000eV;Bd\u0015\u000e~h5`\u0012.e\u0013", "\nrTA \u0006\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7I#;IW\u0011", "/k[!b<<V\u0019\reZ@\u0004\u0013+d", "5dc\u000e_3-])|}^:g\u0005Cl\n$z", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ\u0014$Kn\u0010<@\u0017B]\r\u001c4t\u0016\nZP7\u007f\n", "1gP;Z,=B#\u000fxa,\u000bs+y\u00072w?", "5dc\u0010[(GU\u0019}ih<z\f/sj$\u0010G\u000b\u0013\u0016", "", "3uT;g\nHO ~\t\\0\u0006\u000b\u0015e\u0014", "5dc\u0012i,Gbv\tve,\u000b\u00073n\u0002\u000e{T", "u(B", "6hc _6I", "", "7mc2e(<b\u001d\t\u0004<6\u0006\u0018<o\u0007/{M", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u0014G5]v4CJ]0f[PG\u001d!g\u0018U2\r\u0012/", "7r00g0OS", "", "u(I", "Adc\u000eV;Bd\u0019", "uY\u0018#", "7r0DT0MW\"\u0001", "Adc\u000ej(Bb\u001d\b|", "7r4;T)ES\u0018", "7rF6g/B\\u\t\u000bg+\u000b", "", ":`bA4)L] \u000f\n^\u0017\u0007\u00173t\u00042\u00053", "5dc\u0019T:M/\u0016\r\u0005e<\f\t\u001ao\u000e,\u000bD\u000b \n", "u(5", ":`bA4)L] \u000f\n^\u0017\u0007\u00173t\u00042\u00054", "5dc\u0019T:M/\u0016\r\u0005e<\f\t\u001ao\u000e,\u000bD\u000b \u000b", ":`bA8=>\\(h{_:|\u0018\"", ":`bA8=>\\(h{_:|\u0018#", ":`bAC6LW(\u0003\u0005g\u0010\u0006z3n~2\u000e3", "5dc\u0019T:M>#\r~m0\u0007\u0012\u0013nq,\u0005?\u000b)\n", ":`bAC6LW(\u0003\u0005g\u0010\u0006z3n~2\u000e4", "5dc\u0019T:M>#\r~m0\u0007\u0012\u0013nq,\u0005?\u000b)\u000b", ":`bAE,EO(\u0003\f^\u0017\u0007\u00173t\u00042\u00053", "5dc\u0019T:M@\u0019\u0006vm0\u000e\t\u001ao\u000e,\u000bD\u000b \n", ":`bAE,EO(\u0003\f^\u0017\u0007\u00173t\u00042\u00054", "5dc\u0019T:M@\u0019\u0006vm0\u000e\t\u001ao\u000e,\u000bD\u000b \u000b", ";`]BT3\u001aQ(\u0003\fZ;\u0001\u00138", ";nd@X\tNb(\t\u0004", "5dc\u001ab<LSu\u000f\nm6\u0006", "Adc\u001ab<LSu\u000f\nm6\u0006", "<dT1f\u0017HW\"\u000ezk\u000bx\u0018+", "5dc\u001bX,=a\u0004\t~g;|\u0016\u000ea\u000f$", "Adc\u001bX,=a\u0004\t~g;|\u0016\u000ea\u000f$", "<t\\/X9(T\u0004\t~g;|\u0016=", "5dc\u001bh4;S&h{I6\u0001\u0012>e\r6", "=mC<h*A3*~\u0004m\u0013\u0001\u0017>e\t(\t", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001W\u001f\u001dWS9n\u0014/\u0015qp \u000bq;N\u007f'T\"", "=qR5X:M`\u0015\u000e\u0005k", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u0014M9Ly'U[[(k\\\u007f\u0013", "5dc\u001ce*AS'\u000e\bZ;\u0007\u0016", "u(;0b4\ba+\u0007vg:\u0001\u00138/\u0002(\nO\u0011$\u0017Jk\u0017;}%B#{*Dm_\u0010MQJ{A\u001ewdj8\u000ec98\u0004%JL\\;iN\u0002G!g", "Adc\u001ce*AS'\u000e\bZ;\u0007\u0016", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77w.[RKx4\u0001\u0011q`@\u0007p\u0016[t*GZ]9Xa|JiUK", ">nX;g,KB-\nz", "5dc\u001db0Gb\u0019\fir7|", "Ag^B_+\u001cO\"|ze\u001e\u007f\t8O\u00107\nD\u007f\u0017", "Ag^B_++S'~\nI9\u0007\u000b<e\u000e6", "5dc [6NZ\u0018kzl,\fs<o\u00025{N\u000f", "Adc [6NZ\u0018kzl,\fs<o\u00025{N\u000f", "AsPAX", "5dc g(MS", "B`V", "5dc!T.", "Adc!T.", "Bnd0[\fOS\"\u000eir7|", "5dc!b<<Vx\u0010zg;k\u001d:e", "BqP0^,=>#\u0003\u0004m,\nl\u000es", "", "BqP0^,=>#\u0003\u0004m,\n\u0017", "", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u0014\"\u0017Xz0VL[\u000bXan\u0013", ")KR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77w.[RKx4\u0001\u0011q`@\u0007pj9\u0001+P[N9;N\u00029i", "BqP0^,=>#\u0003\u0004m,\n\u0017\ro\u00101\u000b", "5dc!e(<Y\u0019}eh0\u0006\u0018/r\u000e\u0006\u0006P\n&", "BqP0^,=>#\u0003\u0004m,\n\u0017\u0013D\u000e\u0006\u0006P\n&", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "DhTD", "5dc#\\,P", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "Eh]1b>(T\u001a\rzm", "F", "5dc%", "G", "5dc&", "/bc6i(MS", "", "4na0X", "/cP=g\fOS\"\u000e", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "3uT;g", "/cS\u0010[(GU\u0019}eh0\u0006\u0018/r", ">nX;g,K2\u0015\u000ev", "/cS\u001db0Gb\u0019\fih\b\u0004\u0010", "/o_9l\u001a>Z\u001a", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc\u001ek 6\u0017QMs0'#lkBPe,\\\u00067TLQ(eQy=![X\u0018[+VfYO3~Q7\u0002\u00045H\t;uV", "0dV6a", "1`]0X3", "1`]0X3)]\u001d\b\n^9\u000b", "1n]@h4>/ \u0006ih<z\f/sj$\u0010G\u000b\u0013\u0016", "1n]@h4>1\u001cz\u0004`,{w9u}+{Nk\u0013+Ny\n;", "1qT.g,)]\u001d\b\n^9[\u0005>a", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW.\u0004)DUz'7U\u00129#", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "2hb=T;<V{z\u0004]3|\u0016\u001fp~$\u000b@", "2hb=T;<V\u0007\u000evm,Z\f+n\u0002(", "<df g(MS", ">qTCF;:b\u0019", "2hb=T;<V\b\t\u000b\\/[\u0013An_9{I\u0010", "And?V,\u001ed\u0019\b\n", "2hb=T;<V\b\t\u000b\\/\\\u001a/n\u000f", "2hb=T;<V\b\t\u000b\\/d\u0013@e_9{I\u0010", "2hb=T;<V\b\t\u000b\\/l\u0014\u000fv\u007f1\u000b", "3mS", "3wc?T*M/ \u0006eh0\u0006\u0018/r\u000e\u0007wO|", "4`X9", "4h]1A,Qb\u007f\txZ3g\u00133n\u000f(\t$\u007f", "5dc\u000eV;Bd\u001d\u000e\u000f", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "6`]1_,", "BqP;f-H`!~y>=|\u0012>", "6`b\u0010b4F]\"i\u0005b5\f\t<s", "=sW2e", "7r1Bg;H\\|\bXh5}\r1", "1kX0^,=0)\u000e\nh5", "7r32f*>\\\u0018z\u0004m\u0016}", "=e", ">nb%", ">nb&", ";ne2G6,b\u0015\u000ez", "<dT14+:^(", "=m2.a*>Z", "=m7.a+ES", "=m7.a+ES{\t\f^9", "=m??X7:`\u0019", "=mA2f,M", "=mBAT;>1\u001cz\u0004`,", ">qTC\\6Na\u0007\u000evm,", ">qT=T9>", "@db2g", "@db2g\nH\\\u001a\u0003|", "@db2g\u0017K]\u001b\fzl:", "Ad[3", "u(;0b4\ba+\u0007vg:\u0001\u00138/\u0002(\nO\u0011$\u0017Jk\u0017;}%B#{*Dm_\u0010MQJ{A\u001ewdj8\u000ec9$", "Adc\u0012a(;Z\u0019}", "3mP/_,=", "uY\u0018\u0019V6F\u001d'\u0011\u0003Z5\u000b\r9nI*{N\u0010'$Gr\nEu,5fG\u001eAz\u0016w/CIzD+\u0015K]B\u0006j,[L", "Adc\u0015\\;,Z#\n", ">`S1\\5@", "uE\u0018\u0019V6F\u001d'\u0011\u0003Z5\u000b\r9nI*{N\u0010'$Gr\nEu,5fG\u001eAz\u0016w/CIzD+\u0015K]B\u0006j,[L", ":dUAC(=", "Bn_\u001dT+", "@hV5g\u0017:R", "0ncAb4)O\u0018", "EhSA[", "6dX4[;", "uE5\u00139\r\u001f\u0017\u007f|\u0005fu\u000b\u001b7a\t6\u007fJ\n`\u0019G}\u001dL\u0004%8U\u0007\u001f>m#wKMHk}\u007f\u0015vpI\u0014c\u000fJ\u007f&NL[\u0002", "Adc\u0016a;>`\u0015|\nb6\u0006f9n\u000f5\u0006G\b\u0017$", "1n]Ae6EZ\u0019\f", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77w.[RKx4\u0001\u0011q`@\u0007p\u0010W\u0006'THL;`\\{\u001b\u001e\u001bi\u001bX2\u0014\u0005f\u0017gUBA'Q:[\n7q\u000f\u0010 \u0017~lpPe Ty\u0018qJ(oFf)wQNE,\fd\u001an-i:\u001d \u001dp \u001bu&", "Adc\u001aT5NO Zxm0\u000e\u0005>i\n1", "Adc\u001ca\u001bHc\u0017\u0002Zo,\u0006\u0018\u0016i\u000e7{I\u0001$", ":hbAX5>`", "Adc\u001db0Gb\u0019\fir7|", "Adc [6NZ\u0018\\vg*|\u0010!h\u007f1eP\u0010%\u001bFo", "Ag^B_+\u001aQ(\u0003\fZ;|z3t\u0003\u0010\u0006P\u000f\u0017", "Ag^B_+\u001bSvz\u0004\\,\u0004\u0010/d\\<", "6`]1_,K", "Ag^B_++S\u0017\t|g0\u0012\t\u001di\b8\u0003O| \u0017Q\u007f\u001cC\u000b", "Ag^B_++S%\u000f~k,k\u0013!a\u00047\\J\u000ew\u0013Kv\u001eIv", "Ag^B_+0O\u001d\u000e[h9_\u00058d\u0007(\t!|\u001b\u001eW|\u000e", "AsP?g\u001bKO\u0017\u0005~g.g\u00133n\u000f(\t", ">nX;g,K7\u0018", "As^=G9:Q\u001f\u0003\u0004`\u0017\u0007\r8t\u007f5", "BnBAe0GU", "", "BqP;f-H`!i\u0005b5\f", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&w\u001d", ">nX;g", "CoS.g,)]\u001d\b\n^9[\u0005>a", "E`]A8=>\\(\r", "Ehc5@(KY\u0019}Vl\u0010\u0006e9u\t'\n", "1k^@h9>", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u000fcP=g\fOS\"\u000eZq*|\u0014>i\n1", "\u0011n\\=T5B]\"", "\u001enX;g,K2\u0015\u000ev", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public class GestureHandler<ConcreteGestureHandlerT extends GestureHandler<ConcreteGestureHandlerT>> {
    public static final int ACTION_TYPE_JS_FUNCTION_NEW_API = 4;
    public static final int ACTION_TYPE_JS_FUNCTION_OLD_API = 3;
    public static final int ACTION_TYPE_NATIVE_ANIMATED_EVENT = 2;
    public static final int ACTION_TYPE_REANIMATED_WORKLET = 1;
    public static final Companion Companion = new Companion(null);
    public static final int DIRECTION_DOWN = 8;
    public static final int DIRECTION_LEFT = 2;
    public static final int DIRECTION_RIGHT = 1;
    public static final int DIRECTION_UP = 4;
    private static final int HIT_SLOP_BOTTOM_IDX = 3;
    private static final int HIT_SLOP_HEIGHT_IDX = 5;
    private static final int HIT_SLOP_LEFT_IDX = 0;
    public static final float HIT_SLOP_NONE = Float.NaN;
    private static final int HIT_SLOP_RIGHT_IDX = 2;
    private static final int HIT_SLOP_TOP_IDX = 1;
    private static final int HIT_SLOP_WIDTH_IDX = 4;
    private static final int MAX_POINTERS_COUNT = 12;
    public static final int POINTER_TYPE_MOUSE = 2;
    public static final int POINTER_TYPE_OTHER = 3;
    public static final int POINTER_TYPE_STYLUS = 1;
    public static final int POINTER_TYPE_TOUCH = 0;
    public static final int STATE_ACTIVE = 4;
    public static final int STATE_BEGAN = 2;
    public static final int STATE_CANCELLED = 3;
    public static final int STATE_END = 5;
    public static final int STATE_FAILED = 1;
    public static final int STATE_UNDETERMINED = 0;
    private static short nextEventCoalescingKey = 0;
    private static MotionEvent.PointerCoords[] pointerCoords = null;
    private static MotionEvent.PointerProperties[] pointerProps = null;
    private int actionType;
    private int activationIndex;
    private WritableArray allTouchesPayload;
    private WritableArray changedTouchesPayload;
    private short eventCoalescingKey;
    private float[] hitSlop;
    private GestureHandlerInteractionController interactionController;
    private boolean isActive;
    private boolean isAwaiting;
    private boolean isEnabled;
    private boolean isWithinBounds;
    private float lastAbsolutePositionX;
    private float lastAbsolutePositionY;
    private float lastEventOffsetX;
    private float lastEventOffsetY;
    private boolean manualActivation;
    private int mouseButton;
    private boolean needsPointerData;
    private int numberOfPointers;
    private OnTouchEventListener onTouchEventListener;
    private GestureHandlerOrchestrator orchestrator;
    private int pointerType;
    private boolean shouldCancelWhenOutside;
    private boolean shouldResetProgress;
    private int state;
    private int tag;
    private int touchEventType;
    private final int[] trackedPointerIDs = new int[12];
    private final PointerData[] trackedPointers;
    private int trackedPointersCount;
    private int trackedPointersIDsCount;
    private View view;
    private final int[] windowOffset;

    /* JADX INFO: renamed from: x */
    private float f18206x;

    /* JADX INFO: renamed from: y */
    private float f18207y;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑA0ZeP.hS2\u000fq{Jř\f( B$Ux}b,_Vuh\u0007Nj\u000bI\u00104\u0018\tn:Lmx\f\u0016\u001f:PtW7{u&9?{ȥ\t @*ة}\u000e"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u0014\"\bMr2V,_,eaRP\u0012\u0012e\u001dR5\u0016Z", "\u001aiPCTuEO\"\u0001D>?z\t:t\u00042\u0005\u0016", "\u001aj^A_0G\u001dx\u0012x^7\f\r9nU", "6`]1_,K", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u00149", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", ExifInterface.GPS_MEASUREMENT_3D, "\u001aiPCTuEO\"\u0001DB3\u0004\t1a\u0007\u0004\tB\u0011\u001f\u0017P~mOt%@h\u0002*@C", "\u001aj^A_0G\u001d|\u0006\u0002^.x\u0010\u000br\u00028\u0004@\n&vZm\u000eG\u0006)?bS", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~W\b-77w.[RKx4\u0001\u0011q`@\u0007p\u00025r0FYX0[\u001c\u0004A\u0014$$uX:\u0011\u000fb!5nMFtn1E\u001372\b\b\u001f\u0010~NwIV\u0012C\u0001p\u0003C9pFbnYZ?Em9h\u0016hr +", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AdaptEventException extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AdaptEventException(GestureHandler<?> handler, MotionEvent event, IllegalArgumentException e2) {
            super(StringsKt.trimIndent("\n    handler: " + Reflection.getOrCreateKotlinClass(handler.getClass()).getSimpleName() + "\n    state: " + handler.getState() + "\n    view: " + handler.getView() + "\n    orchestrator: " + handler.getOrchestrator() + "\n    isEnabled: " + handler.isEnabled() + "\n    isActive: " + handler.isActive() + "\n    isAwaiting: " + handler.isAwaiting() + "\n    trackedPointersCount: " + ((GestureHandler) handler).trackedPointersIDsCount + "\n    trackedPointers: " + ArraysKt.joinToString$default(((GestureHandler) handler).trackedPointerIDs, (CharSequence) ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + "\n    while handling event: " + event + "\n    "), e2);
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(e2, "e");
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯP\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00116B\u0005+4\u0012\u0006\fnj?=LeV6Zݷ2\u000fy\u000b<$q$yCAU\"}8\tWNmgvJh\u0014K\u000f\f\u0016\u0001j:I]xc\u0012\u00172P{G3SoCʧa\u000bȂ5 `!x~\u000b\u0001ʀ.H\u001evCQY2*0n\u0018jV\u001bu\u001d\u001a@\u0014\u0005 I,j\u0011f6v\u0017\u000e>=N\u001bipPm_x\u000b[9^V=\f%\u000fN/NeM\u0015SUS\u0013`\\W\u0003ms\u0014ݢ;Ҋ++Q֕(Bf\u0003,\u0015YQcƥE͉`\u0005YӠ\\39S{K~\u0010~ÂMԫ\u0011<\f\u05faV3V3E\u001a\u0015\ndޞGɤW@X\u061c/N\u000e\u0001y6E'VĘ}ݰ\u001ffYĥ\f%\\>\u0014\u0005; yЮAĲ_T\u0016֫e'b\u007fi1\u007fB\u0014ʷ!̆]=uՎAn\u00103\u001c0u\u0002\u0006Ɍcѧ\u001b%?ك\n//u\u001aHriMݖ3ĈWiZ̲\u0011.|!O*7\u000e1ը7ʰoP\\А|\u001d[(l\u0007,\ni\u0601/ʟ@!-ī\u001f[vv\u0003M\f\u0018{Ë9Ơ]nsލ(ElBMQ\u0012\u00128ׯI݀C<jڳ)rPc$Z\u000b*xø\u001bн\u0014w\u0004ͩ\u001f\u0018!CWqJ6\u0003վkÅ\u0019H\u000bٜ\u0013M\u000b\u001bwZ\u0017\u0012Uԡ\u0006ʗ\u0007i,ڏY\r^o\to\u0016z ؚO˃&-Iٛ\u0006%4i:hb~yțQ\u0381\u0004Goն\u0018Xz+\u000eU*\"l֤\fֺ3=\u001bÁO5@\u0018EEzt<ʿ ɟ+z\u0005Ȫ_GvE\u007f\b\u0019r\u0003ߓ=ߝST\u001fǱGj\u0001; d.{8ÆMĕgT\u0013ϵ\u000fU\u0001\u001cq<|:SąqǪ)\u0001wܲMA;]?\u001dDyjٳg˸aiwЃJn\u001dA\re2.:ܥB͈U]:ծ\tUg\u001bV\"RnYܰ\u001bܖ{\bJކ\u0005\u0019AeYd\u001ft\u000fԊ\u0017ɣ\u0002f\u000fԭ]\u0007dzR\u001b\u007f\u0002D0u)\"d,45ƼQݱQUom{m-!X2\"\u0013\f5~\u00142<Nz\u0006\u0003_ݸ2֯\u001c8I;p*Þ\rS"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u0014\"\nX~2CUR6e(", "", "u(E", "\u000fBC\u0016B\u00158B\riZX\u0011j\u0003\u0010Uh\u0006j$j\u007f\u00110O\u007f6R\u0010\u0019", "", "\u000fBC\u0016B\u00158B\riZX\u0011j\u0003\u0010Uh\u0006j$j\u007f\u00111Vl6R\u0010\u0019", "\u000fBC\u0016B\u00158B\riZX\u0015Xw\u0013V_\"W)d~r6Ol6V\u0016\u0015Bl", "\u000fBC\u0016B\u00158B\riZX\u0019\\d\u0018Ig\u0004j _\u0011\t1\\s#V\u0014", "\u0012HA\u00126\u001b\"=\u0002xYH\u001ee", "\u0012HA\u00126\u001b\"=\u0002xa>\rk", "\u0012HA\u00126\u001b\"=\u0002xgB\u000e_w", "\u0012HA\u00126\u001b\"=\u0002xjI", "\u0016HC,F\u0013(>\u0013[dM\u001bfp)I^\u001b", "\u0016HC,F\u0013(>\u0013aZB\u000e_w)I^\u001b", "\u0016HC,F\u0013(>\u0013eZ?\u001bvl\u000eX", "\u0016HC,F\u0013(>\u0013gdG\f", "", "\u0016HC,F\u0013(>\u0013k^@\u000fk\u0003\u0013Dr", "\u0016HC,F\u0013(>\u0013mdI&`g\"", "\u0016HC,F\u0013(>\u0013p^=\u001b_\u0003\u0013Dr", "\u001b@G,C\u0016\"<\b^gL&Zr\u001fNn", "\u001eN8\u001bG\f+M\bre>&dr\u001fS_", "\u001eN8\u001bG\f+M\bre>&fw\u0012El", "\u001eN8\u001bG\f+M\bre>&jw#Lo\u0016", "\u001eN8\u001bG\f+M\bre>&kr\u001fCb", "!S0!8&\u001a1\bbk>", "!S0!8&\u001b3zZc", "!S0!8&\u001c/\u0002\\ZE\u0013\\g", "!S0!8&\u001e<w", "!S0!8&\u001f/|eZ=", "!S0!8&.<w^i>\u0019dl\u0018E^", "<dgA8=>\\(\\\u0005Z3|\u0017-i\t*a@\u0015", "", ">nX;g,K1#\t\b]:", "", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 V.xFz.DY\u000b}Aw#-[\u0019", ")KP;W9HW\u0018H\fb,\u000fR\u0017o\u000f,\u0006I`(\u0017P~L'\u0001)>h}-\u0015w ;LQ\u0011", ">nX;g,K>&\t\u0006l", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 V.xFz.DY\u000b\u000bDw!.ZR?kBs", ")KP;W9HW\u0018H\fb,\u000fR\u0017o\u000f,\u0006I`(\u0017P~L'\u0001)>h}-\"z 9MPJo4,j", "6hc _6IA\u0019\u000e", "", "D`[BX", "7mXAC6B\\(~\bI9\u0007\u0014=", "", "Ahi2", "AsPAX\u001bHA(\f~g.", "", "AsPAX", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean hitSlopSet(float f2) {
            return !Float.isNaN(f2);
        }

        public final void initPointerProps(int i2) {
            if (GestureHandler.pointerProps == null) {
                GestureHandler.pointerProps = new MotionEvent.PointerProperties[12];
                GestureHandler.pointerCoords = new MotionEvent.PointerCoords[12];
            }
            while (i2 > 0) {
                MotionEvent.PointerProperties[] pointerPropertiesArr = GestureHandler.pointerProps;
                MotionEvent.PointerCoords[] pointerCoordsArr = null;
                if (pointerPropertiesArr == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
                    pointerPropertiesArr = null;
                }
                int i3 = i2 - 1;
                if (pointerPropertiesArr[i3] != null) {
                    return;
                }
                MotionEvent.PointerProperties[] pointerPropertiesArr2 = GestureHandler.pointerProps;
                if (pointerPropertiesArr2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pointerProps");
                    pointerPropertiesArr2 = null;
                }
                pointerPropertiesArr2[i3] = new MotionEvent.PointerProperties();
                MotionEvent.PointerCoords[] pointerCoordsArr2 = GestureHandler.pointerCoords;
                if (pointerCoordsArr2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pointerCoords");
                } else {
                    pointerCoordsArr = pointerCoordsArr2;
                }
                pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
                i2--;
            }
        }

        public final String stateToString(int i2) {
            if (i2 == 0) {
                return "UNDETERMINED";
            }
            if (i2 == 1) {
                return "FAILED";
            }
            if (i2 == 2) {
                return "BEGIN";
            }
            if (i2 == 3) {
                return "CANCELLED";
            }
            if (i2 == 4) {
                return "ACTIVE";
            }
            if (i2 != 5) {
                return null;
            }
            return "END";
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\f8é6B\r'4\u0012}\u001cnjG9LeN/ZS8\u001bsڔ:Ŝa:ڎs;\u0004\u0019>M\u0019S\\g\u007fnx[\u001bG\u001d\b.x\u0019/YY\u0007a*\u000f`E\u007fCAR\b=gc\u0005:\u0013&J\"f|ڱ\u0005\u001a8OX}\tWc\f@1\u0007È;\u001b\u0014[\u001a2\u00124AfӼ\u001f%n\\L`l\f=uޑ\u00042I\\>w0+PSцUo\u0014\u0005y6+n:{֝&\u001c<\u0015ks?1ӊ\"C\u000bh5'CI\"Xf^\u0006\u0014#-g\r\fuVb\u000bQn\u0010?+}f{V\u0014(\u0006\u007f\u0014\rj\u0007>\f-H<32f6\u0011yІq\u001cQ^\u001cvB.\u0016\u0012<%A\u00185A8Ie\u0018ż<aUE\u0019\u001d\rL$Gΰ $[\u001c~-\u001b\u0003\u0017\u0018ƏP\u0011UVS\"YkpZ͖n͆.\u00108Ϛ\u00181\u0002\u0019< E9aC1,<\u001aVJ\u007fv3c?\u05ccuʐLL*Â.90\u0015\u001acdf\u000bx^_);\u001fM4T5~ݔ\u0017&dɼT#+\u001e\\^9\u0002xOu\nS2=Ƅeˇo\u001a_ުv5;aq\u0019\u0002T|%MG3\u001dfjZS:]3̬.ĘLv\u0018Ǯ\u0014FT\u001e!;_s\"G:<ǲ`5"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001O\u0016<\\SHk\u0017\u001a\u001egh9\u0014\"\u0017Xz0VL[\u000bXan\u0013", "", ">nX;g,K7\u0018", "", "F", "", "G", "/ab<_<MS\f", "/ab<_<MS\r", "uH5\u00139\r\u0002D", "5dc\u000eU:HZ)\u000ezQ", "u(5", "Adc\u000eU:HZ)\u000ezQ", "uE\u0018#", "5dc\u000eU:HZ)\u000ezR", "Adc\u000eU:HZ)\u000ezR", "5dc\u001db0Gb\u0019\f^]", "u(8", "5dc%", "Adc%", "5dc&", "Adc&", "1n\\=b5>\\(J", "1n\\=b5>\\(K", "1n\\=b5>\\(L", "1n\\=b5>\\(M", "1n\\=b5>\\(N", "1n_F", "3pd._:", "", "=sW2e", "6`b566=S", "BnBAe0GU", "", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class PointerData {
        private float absoluteX;
        private float absoluteY;
        private final int pointerId;

        /* JADX INFO: renamed from: x */
        private float f18208x;

        /* JADX INFO: renamed from: y */
        private float f18209y;

        public PointerData(int i2, float f2, float f3, float f4, float f5) {
            this.pointerId = i2;
            this.f18208x = f2;
            this.f18209y = f3;
            this.absoluteX = f4;
            this.absoluteY = f5;
        }

        public static /* synthetic */ PointerData copy$default(PointerData pointerData, int i2, float f2, float f3, float f4, float f5, int i3, Object obj) {
            if ((1 & i3) != 0) {
                i2 = pointerData.pointerId;
            }
            if ((i3 + 2) - (2 | i3) != 0) {
                f2 = pointerData.f18208x;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 4)) != 0) {
                f3 = pointerData.f18209y;
            }
            if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
                f4 = pointerData.absoluteX;
            }
            if ((i3 + 16) - (i3 | 16) != 0) {
                f5 = pointerData.absoluteY;
            }
            return pointerData.copy(i2, f2, f3, f4, f5);
        }

        public final int component1() {
            return this.pointerId;
        }

        public final float component2() {
            return this.f18208x;
        }

        public final float component3() {
            return this.f18209y;
        }

        public final float component4() {
            return this.absoluteX;
        }

        public final float component5() {
            return this.absoluteY;
        }

        public final PointerData copy(int i2, float f2, float f3, float f4, float f5) {
            return new PointerData(i2, f2, f3, f4, f5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PointerData)) {
                return false;
            }
            PointerData pointerData = (PointerData) obj;
            return this.pointerId == pointerData.pointerId && Float.compare(this.f18208x, pointerData.f18208x) == 0 && Float.compare(this.f18209y, pointerData.f18209y) == 0 && Float.compare(this.absoluteX, pointerData.absoluteX) == 0 && Float.compare(this.absoluteY, pointerData.absoluteY) == 0;
        }

        public final float getAbsoluteX() {
            return this.absoluteX;
        }

        public final float getAbsoluteY() {
            return this.absoluteY;
        }

        public final int getPointerId() {
            return this.pointerId;
        }

        public final float getX() {
            return this.f18208x;
        }

        public final float getY() {
            return this.f18209y;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.pointerId) * 31) + Float.hashCode(this.f18208x)) * 31) + Float.hashCode(this.f18209y)) * 31) + Float.hashCode(this.absoluteX)) * 31) + Float.hashCode(this.absoluteY);
        }

        public final void setAbsoluteX(float f2) {
            this.absoluteX = f2;
        }

        public final void setAbsoluteY(float f2) {
            this.absoluteY = f2;
        }

        public final void setX(float f2) {
            this.f18208x = f2;
        }

        public final void setY(float f2) {
            this.f18209y = f2;
        }

        public String toString() {
            return "PointerData(pointerId=" + this.pointerId + ", x=" + this.f18208x + ", y=" + this.f18209y + ", absoluteX=" + this.absoluteX + ", absoluteY=" + this.absoluteY + ")";
        }
    }

    public GestureHandler() {
        int[] iArr = new int[2];
        for (int i2 = 0; i2 < 2; i2++) {
            iArr[i2] = 0;
        }
        this.windowOffset = iArr;
        this.isEnabled = true;
        PointerData[] pointerDataArr = new PointerData[12];
        for (int i3 = 0; i3 < 12; i3++) {
            pointerDataArr[i3] = null;
        }
        this.trackedPointers = pointerDataArr;
        this.pointerType = 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.view.MotionEvent adaptEvent(android.view.MotionEvent r30) throws com.swmansion.gesturehandler.core.GestureHandler.AdaptEventException {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.core.GestureHandler.adaptEvent(android.view.MotionEvent):android.view.MotionEvent");
    }

    private final void addChangedPointer(PointerData pointerData) {
        if (this.changedTouchesPayload == null) {
            this.changedTouchesPayload = Arguments.createArray();
        }
        WritableArray writableArray = this.changedTouchesPayload;
        Intrinsics.checkNotNull(writableArray);
        writableArray.pushMap(createPointerData(pointerData));
    }

    private final void addPointerToAll(PointerData pointerData) {
        if (this.allTouchesPayload == null) {
            this.allTouchesPayload = Arguments.createArray();
        }
        WritableArray writableArray = this.allTouchesPayload;
        Intrinsics.checkNotNull(writableArray);
        writableArray.pushMap(createPointerData(pointerData));
    }

    private final void cancelPointers() {
        this.touchEventType = 4;
        this.changedTouchesPayload = null;
        extractAllPointersData();
        for (PointerData pointerData : this.trackedPointers) {
            if (pointerData != null) {
                addChangedPointer(pointerData);
            }
        }
        this.trackedPointersCount = 0;
        ArraysKt.fill$default(this.trackedPointers, (Object) null, 0, 0, 6, (Object) null);
        dispatchTouchEvent();
    }

    private final WritableMap createPointerData(PointerData pointerData) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("id", pointerData.getPointerId());
        writableMapCreateMap.putDouble("x", PixelUtil.toDIPFromPixel(pointerData.getX()));
        writableMapCreateMap.putDouble("y", PixelUtil.toDIPFromPixel(pointerData.getY()));
        writableMapCreateMap.putDouble("absoluteX", PixelUtil.toDIPFromPixel(pointerData.getAbsoluteX()));
        writableMapCreateMap.putDouble("absoluteY", PixelUtil.toDIPFromPixel(pointerData.getAbsoluteY()));
        return writableMapCreateMap;
    }

    private final void dispatchTouchDownEvent(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.changedTouchesPayload = null;
        this.touchEventType = 1;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.trackedPointers[pointerId] = new PointerData(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - this.windowOffset[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - this.windowOffset[1]);
        this.trackedPointersCount++;
        PointerData pointerData = this.trackedPointers[pointerId];
        Intrinsics.checkNotNull(pointerData);
        addChangedPointer(pointerData);
        extractAllPointersData();
        dispatchTouchEvent();
    }

    private final void dispatchTouchMoveEvent(MotionEvent motionEvent, MotionEvent motionEvent2) {
        this.changedTouchesPayload = null;
        this.touchEventType = 2;
        float rawX = motionEvent2.getRawX() - motionEvent2.getX();
        float rawY = motionEvent2.getRawY() - motionEvent2.getY();
        int pointerCount = motionEvent.getPointerCount();
        int i2 = 0;
        for (int i3 = 0; i3 < pointerCount; i3++) {
            PointerData pointerData = this.trackedPointers[motionEvent.getPointerId(i3)];
            if (pointerData != null && (pointerData.getX() != motionEvent.getX(i3) || pointerData.getY() != motionEvent.getY(i3))) {
                pointerData.setX(motionEvent.getX(i3));
                pointerData.setY(motionEvent.getY(i3));
                pointerData.setAbsoluteX((motionEvent2.getX(i3) + rawX) - this.windowOffset[0]);
                pointerData.setAbsoluteY((motionEvent2.getY(i3) + rawY) - this.windowOffset[1]);
                addChangedPointer(pointerData);
                i2++;
            }
        }
        if (i2 > 0) {
            extractAllPointersData();
            dispatchTouchEvent();
        }
    }

    private final void dispatchTouchUpEvent(MotionEvent motionEvent, MotionEvent motionEvent2) {
        extractAllPointersData();
        this.changedTouchesPayload = null;
        this.touchEventType = 3;
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.trackedPointers[pointerId] = new PointerData(pointerId, motionEvent.getX(motionEvent.getActionIndex()), motionEvent.getY(motionEvent.getActionIndex()), (motionEvent2.getX(motionEvent.getActionIndex()) + (motionEvent2.getRawX() - motionEvent2.getX())) - this.windowOffset[0], (motionEvent2.getY(motionEvent.getActionIndex()) + (motionEvent2.getRawY() - motionEvent2.getY())) - this.windowOffset[1]);
        PointerData pointerData = this.trackedPointers[pointerId];
        Intrinsics.checkNotNull(pointerData);
        addChangedPointer(pointerData);
        this.trackedPointers[pointerId] = null;
        this.trackedPointersCount--;
        dispatchTouchEvent();
    }

    private final void extractAllPointersData() {
        this.allTouchesPayload = null;
        for (PointerData pointerData : this.trackedPointers) {
            if (pointerData != null) {
                addPointerToAll(pointerData);
            }
        }
    }

    private final int findNextLocalPointerId() {
        int[] iArr;
        int i2 = 0;
        while (i2 < this.trackedPointersIDsCount) {
            int i3 = 0;
            while (true) {
                iArr = this.trackedPointerIDs;
                if (i3 >= iArr.length || iArr[i3] == i2) {
                    break;
                }
                i3++;
            }
            if (i3 == iArr.length) {
                return i2;
            }
            i2++;
        }
        return i2;
    }

    private final Activity getActivity(Context context) {
        if (context instanceof ReactContext) {
            return ((ReactContext) context).getCurrentActivity();
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return getActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private final boolean isButtonInConfig(int i2) {
        int i3 = this.mouseButton;
        return i3 == 0 ? i2 == 1 : (i2 & i3) != 0;
    }

    private final void moveToState(int i2) {
        UiThreadUtil.assertOnUiThread();
        if (this.state == i2) {
            return;
        }
        if (this.trackedPointersCount > 0 && (i2 == 5 || i2 == 3 || i2 == 1)) {
            cancelPointers();
        }
        int i3 = this.state;
        this.state = i2;
        if (i2 == 4) {
            short s2 = nextEventCoalescingKey;
            nextEventCoalescingKey = (short) (s2 + 1);
            this.eventCoalescingKey = s2;
        }
        GestureHandlerOrchestrator gestureHandlerOrchestrator = this.orchestrator;
        Intrinsics.checkNotNull(gestureHandlerOrchestrator);
        gestureHandlerOrchestrator.onHandlerStateChange(this, i2, i3);
        onStateChange(i2, i3);
    }

    private final boolean needAdapt(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != this.trackedPointersIDsCount) {
            return true;
        }
        int length = this.trackedPointerIDs.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = this.trackedPointerIDs[i2];
            if (i3 != -1 && i3 != i2) {
                return true;
            }
        }
        return false;
    }

    public static final void setEnabled$lambda$3$lambda$2(GestureHandler this_applySelf) {
        Intrinsics.checkNotNullParameter(this_applySelf, "$this_applySelf");
        this_applySelf.cancel();
    }

    private final void setPointerType(MotionEvent motionEvent) {
        int toolType = motionEvent.getToolType(motionEvent.getActionIndex());
        int i2 = 1;
        if (toolType == 1) {
            i2 = 0;
        } else if (toolType != 2) {
            i2 = 3;
            if (toolType == 3) {
                i2 = 2;
            }
        }
        this.pointerType = i2;
    }

    public final void activate() {
        activate(false);
    }

    public void activate(boolean z2) {
        if (!this.manualActivation || z2) {
            int i2 = this.state;
            if (i2 == 0 || i2 == 2) {
                moveToState(4);
            }
        }
    }

    protected final ConcreteGestureHandlerT applySelf(Function1<? super ConcreteGestureHandlerT, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        GestureHandler gestureHandlerSelf = self();
        block.invoke(gestureHandlerSelf);
        return gestureHandlerSelf;
    }

    public final void begin() {
        if (this.state == 0) {
            moveToState(2);
        }
    }

    public final void cancel() {
        int i2 = this.state;
        if (i2 == 4 || i2 == 0 || i2 == 2 || this.isAwaiting) {
            onCancel();
            moveToState(3);
        }
    }

    public final WritableArray consumeAllTouchesPayload() {
        WritableArray writableArray = this.allTouchesPayload;
        this.allTouchesPayload = null;
        return writableArray;
    }

    public final WritableArray consumeChangedTouchesPayload() {
        WritableArray writableArray = this.changedTouchesPayload;
        this.changedTouchesPayload = null;
        return writableArray;
    }

    public void dispatchHandlerUpdate(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        OnTouchEventListener onTouchEventListener = this.onTouchEventListener;
        if (onTouchEventListener != null) {
            onTouchEventListener.onHandlerUpdate(self(), event);
        }
    }

    public void dispatchStateChange(int i2, int i3) {
        OnTouchEventListener onTouchEventListener = this.onTouchEventListener;
        if (onTouchEventListener != null) {
            onTouchEventListener.onStateChange(self(), i2, i3);
        }
    }

    public void dispatchTouchEvent() {
        OnTouchEventListener onTouchEventListener;
        if (this.changedTouchesPayload == null || (onTouchEventListener = this.onTouchEventListener) == null) {
            return;
        }
        onTouchEventListener.onTouchEvent(self());
    }

    public final void end() {
        int i2 = this.state;
        if (i2 == 2 || i2 == 4) {
            moveToState(5);
        }
    }

    public final void fail() {
        int i2 = this.state;
        if (i2 == 4 || i2 == 0 || i2 == 2) {
            moveToState(1);
        }
    }

    public final int getActionType() {
        return this.actionType;
    }

    public final int getActivationIndex() {
        return this.activationIndex;
    }

    public final WritableArray getAllTouchesPayload() {
        return this.allTouchesPayload;
    }

    public final WritableArray getChangedTouchesPayload() {
        return this.changedTouchesPayload;
    }

    public final short getEventCoalescingKey() {
        return this.eventCoalescingKey;
    }

    public final float getLastAbsolutePositionX() {
        return this.lastAbsolutePositionX;
    }

    public final float getLastAbsolutePositionY() {
        return this.lastAbsolutePositionY;
    }

    public final float getLastPositionInWindowX() {
        return (this.lastAbsolutePositionX + this.lastEventOffsetX) - this.windowOffset[0];
    }

    public final float getLastPositionInWindowY() {
        return (this.lastAbsolutePositionY + this.lastEventOffsetY) - this.windowOffset[1];
    }

    public final float getLastRelativePositionX() {
        return this.lastAbsolutePositionX;
    }

    public final float getLastRelativePositionY() {
        return this.lastAbsolutePositionY;
    }

    protected final int getMouseButton() {
        return this.mouseButton;
    }

    public final boolean getNeedsPointerData() {
        return this.needsPointerData;
    }

    public final int getNumberOfPointers() {
        return this.numberOfPointers;
    }

    protected final GestureHandlerOrchestrator getOrchestrator() {
        return this.orchestrator;
    }

    public final int getPointerType() {
        return this.pointerType;
    }

    public final boolean getShouldResetProgress() {
        return this.shouldResetProgress;
    }

    public final int getState() {
        return this.state;
    }

    public final int getTag() {
        return this.tag;
    }

    public final int getTouchEventType() {
        return this.touchEventType;
    }

    public final int getTrackedPointersCount() {
        return this.trackedPointersCount;
    }

    public final View getView() {
        return this.view;
    }

    public final float getX() {
        return this.f18206x;
    }

    public final float getY() {
        return this.f18207y;
    }

    public final void handle(MotionEvent transformedEvent, MotionEvent sourceEvent) {
        int i2;
        Intrinsics.checkNotNullParameter(transformedEvent, "transformedEvent");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (!this.isEnabled || (i2 = this.state) == 3 || i2 == 1 || i2 == 5 || this.trackedPointersIDsCount < 1) {
            return;
        }
        try {
            MotionEvent motionEventAdaptEvent = adaptEvent(sourceEvent);
            MotionEvent motionEvent = new MotionEvent[]{adaptEvent(transformedEvent), motionEventAdaptEvent}[0];
            this.f18206x = motionEvent.getX();
            this.f18207y = motionEvent.getY();
            this.numberOfPointers = motionEvent.getPointerCount();
            boolean zIsWithinBounds = isWithinBounds(this.view, this.f18206x, this.f18207y);
            this.isWithinBounds = zIsWithinBounds;
            if (this.shouldCancelWhenOutside && !zIsWithinBounds) {
                int i3 = this.state;
                if (i3 == 4) {
                    cancel();
                    return;
                } else {
                    if (i3 == 2) {
                        fail();
                        return;
                    }
                    return;
                }
            }
            this.lastAbsolutePositionX = GestureUtils.INSTANCE.getLastPointerX(motionEvent, true);
            this.lastAbsolutePositionY = GestureUtils.INSTANCE.getLastPointerY(motionEvent, true);
            this.lastEventOffsetX = motionEvent.getRawX() - motionEvent.getX();
            this.lastEventOffsetY = motionEvent.getRawY() - motionEvent.getY();
            if (sourceEvent.getAction() == 0 || sourceEvent.getAction() == 9 || sourceEvent.getAction() == 7) {
                setPointerType(sourceEvent);
            }
            if (sourceEvent.getAction() == 9 || sourceEvent.getAction() == 7 || sourceEvent.getAction() == 10) {
                onHandleHover(motionEvent, motionEventAdaptEvent);
            } else {
                onHandle(motionEvent, motionEventAdaptEvent);
            }
            if (!Intrinsics.areEqual(motionEvent, transformedEvent)) {
                motionEvent.recycle();
            }
            if (Intrinsics.areEqual(motionEventAdaptEvent, sourceEvent)) {
                return;
            }
            motionEventAdaptEvent.recycle();
        } catch (AdaptEventException unused) {
            fail();
        }
    }

    public final boolean hasCommonPointers(GestureHandler<?> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int length = this.trackedPointerIDs.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.trackedPointerIDs[i2] != -1 && other.trackedPointerIDs[i2] != -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isAwaiting() {
        return this.isAwaiting;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0014, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isDescendantOf(com.swmansion.gesturehandler.core.GestureHandler<?> r4) {
        /*
            r3 = this;
            java.lang.String r0 = "of"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.view.View r0 = r3.view
            r2 = 0
            if (r0 == 0) goto L2d
            android.view.ViewParent r1 = r0.getParent()
        Le:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L2b
            android.view.View r1 = (android.view.View) r1
        L14:
            if (r1 == 0) goto L2f
            android.view.View r0 = r4.view
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L20
            r0 = 1
            return r0
        L20:
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L2b
            android.view.View r1 = (android.view.View) r1
            goto L14
        L2b:
            r1 = r2
            goto L14
        L2d:
            r1 = r2
            goto Le
        L2f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.core.GestureHandler.isDescendantOf(com.swmansion.gesturehandler.core.GestureHandler):boolean");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isWithinBounds() {
        return this.isWithinBounds;
    }

    public final boolean isWithinBounds(View view, float f2, float f3) {
        float f4;
        Intrinsics.checkNotNull(view);
        float width = view.getWidth();
        float height = view.getHeight();
        float[] fArr = this.hitSlop;
        if (fArr != null) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[2];
            float f8 = fArr[3];
            Companion companion = Companion;
            float f9 = companion.hitSlopSet(f5) ? 0.0f - f5 : 0.0f;
            f = companion.hitSlopSet(f6) ? 0.0f - f6 : 0.0f;
            if (companion.hitSlopSet(f7)) {
                width += f7;
            }
            if (companion.hitSlopSet(f8)) {
                height += f8;
            }
            float f10 = fArr[4];
            float f11 = fArr[5];
            if (companion.hitSlopSet(f10)) {
                if (!companion.hitSlopSet(f5)) {
                    f9 = width - f10;
                } else if (!companion.hitSlopSet(f7)) {
                    width = f10 + f9;
                }
            }
            if (companion.hitSlopSet(f11)) {
                if (!companion.hitSlopSet(f6)) {
                    f = height - f11;
                } else if (!companion.hitSlopSet(f8)) {
                    height = f11 + f;
                }
            }
            f4 = f;
            f = f9;
        } else {
            f4 = 0.0f;
        }
        return f <= f2 && f2 <= width && f4 <= f3 && f3 <= height;
    }

    protected void onCancel() {
    }

    protected void onHandle(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        moveToState(1);
    }

    protected void onHandleHover(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
    }

    protected void onPrepare() {
    }

    protected void onReset() {
    }

    protected void onStateChange(int i2, int i3) {
    }

    public final void prepare(View view, GestureHandlerOrchestrator gestureHandlerOrchestrator) {
        if (this.view != null || this.orchestrator != null) {
            throw new IllegalStateException("Already prepared or hasn't been reset".toString());
        }
        Arrays.fill(this.trackedPointerIDs, -1);
        this.trackedPointersIDsCount = 0;
        this.state = 0;
        this.view = view;
        this.orchestrator = gestureHandlerOrchestrator;
        Activity activity = getActivity(view != null ? view.getContext() : null);
        View viewFindViewById = activity != null ? activity.findViewById(R.id.content) : null;
        if (viewFindViewById != null) {
            viewFindViewById.getLocationOnScreen(this.windowOffset);
        } else {
            int[] iArr = this.windowOffset;
            iArr[0] = 0;
            iArr[1] = 0;
        }
        onPrepare();
    }

    public final void reset() {
        this.view = null;
        this.orchestrator = null;
        Arrays.fill(this.trackedPointerIDs, -1);
        this.trackedPointersIDsCount = 0;
        this.trackedPointersCount = 0;
        ArraysKt.fill$default(this.trackedPointers, (Object) null, 0, 0, 6, (Object) null);
        this.touchEventType = 0;
        onReset();
    }

    public void resetConfig() {
        this.needsPointerData = false;
        this.manualActivation = false;
        this.shouldCancelWhenOutside = false;
        this.isEnabled = true;
        this.hitSlop = null;
    }

    public void resetProgress() {
    }

    public final ConcreteGestureHandlerT self() {
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type ConcreteGestureHandlerT of com.swmansion.gesturehandler.core.GestureHandler");
        return this;
    }

    public final void setActionType(int i2) {
        this.actionType = i2;
    }

    public final void setActivationIndex(int i2) {
        this.activationIndex = i2;
    }

    public final void setActive(boolean z2) {
        this.isActive = z2;
    }

    public final void setAwaiting(boolean z2) {
        this.isAwaiting = z2;
    }

    public final ConcreteGestureHandlerT setEnabled(boolean z2) {
        final ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) self();
        if (concretegesturehandlert.view != null && concretegesturehandlert.isEnabled != z2) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.core.GestureHandler$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    GestureHandler.setEnabled$lambda$3$lambda$2(this.f$0);
                }
            });
        }
        concretegesturehandlert.isEnabled = z2;
        return concretegesturehandlert;
    }

    public final ConcreteGestureHandlerT setHitSlop(float f2) {
        return (ConcreteGestureHandlerT) setHitSlop(f2, f2, f2, f2, Float.NaN, Float.NaN);
    }

    public final ConcreteGestureHandlerT setHitSlop(float f2, float f3, float f4, float f5, float f6, float f7) {
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) self();
        if (concretegesturehandlert.hitSlop == null) {
            concretegesturehandlert.hitSlop = new float[6];
        }
        float[] fArr = concretegesturehandlert.hitSlop;
        Intrinsics.checkNotNull(fArr);
        fArr[0] = f2;
        float[] fArr2 = concretegesturehandlert.hitSlop;
        Intrinsics.checkNotNull(fArr2);
        fArr2[1] = f3;
        float[] fArr3 = concretegesturehandlert.hitSlop;
        Intrinsics.checkNotNull(fArr3);
        fArr3[2] = f4;
        float[] fArr4 = concretegesturehandlert.hitSlop;
        Intrinsics.checkNotNull(fArr4);
        fArr4[3] = f5;
        float[] fArr5 = concretegesturehandlert.hitSlop;
        Intrinsics.checkNotNull(fArr5);
        fArr5[4] = f6;
        float[] fArr6 = concretegesturehandlert.hitSlop;
        Intrinsics.checkNotNull(fArr6);
        fArr6[5] = f7;
        Companion companion = Companion;
        if (companion.hitSlopSet(f6) && companion.hitSlopSet(f2) && companion.hitSlopSet(f4)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined".toString());
        }
        if (companion.hitSlopSet(f6) && !companion.hitSlopSet(f2) && !companion.hitSlopSet(f4)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined".toString());
        }
        if (companion.hitSlopSet(f7) && companion.hitSlopSet(f5) && companion.hitSlopSet(f3)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined".toString());
        }
        if (!companion.hitSlopSet(f7) || companion.hitSlopSet(f5) || companion.hitSlopSet(f3)) {
            return concretegesturehandlert;
        }
        throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined".toString());
    }

    public final ConcreteGestureHandlerT setInteractionController(GestureHandlerInteractionController gestureHandlerInteractionController) {
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) self();
        concretegesturehandlert.interactionController = gestureHandlerInteractionController;
        return concretegesturehandlert;
    }

    public final ConcreteGestureHandlerT setManualActivation(boolean z2) {
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) self();
        concretegesturehandlert.manualActivation = z2;
        return concretegesturehandlert;
    }

    public final GestureHandler<ConcreteGestureHandlerT> setMouseButton(int i2) {
        this.mouseButton = i2;
        return this;
    }

    /* JADX INFO: renamed from: setMouseButton */
    protected final void m8734setMouseButton(int i2) {
        this.mouseButton = i2;
    }

    public final void setNeedsPointerData(boolean z2) {
        this.needsPointerData = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final GestureHandler<?> setOnTouchEventListener(OnTouchEventListener onTouchEventListener) {
        this.onTouchEventListener = onTouchEventListener;
        return this;
    }

    protected final void setOrchestrator(GestureHandlerOrchestrator gestureHandlerOrchestrator) {
        this.orchestrator = gestureHandlerOrchestrator;
    }

    public final ConcreteGestureHandlerT setShouldCancelWhenOutside(boolean z2) {
        ConcreteGestureHandlerT concretegesturehandlert = (ConcreteGestureHandlerT) self();
        concretegesturehandlert.shouldCancelWhenOutside = z2;
        return concretegesturehandlert;
    }

    public final void setShouldResetProgress(boolean z2) {
        this.shouldResetProgress = z2;
    }

    public final void setTag(int i2) {
        this.tag = i2;
    }

    protected final boolean shouldActivateWithMouse(MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (sourceEvent.getToolType(0) == 3) {
            if (sourceEvent.getAction() == 0 || sourceEvent.getAction() == 1 || sourceEvent.getAction() == 6 || sourceEvent.getAction() == 5 || !(sourceEvent.getAction() == 2 || isButtonInConfig(sourceEvent.getActionButton()))) {
                return false;
            }
            if (sourceEvent.getAction() == 2 && !isButtonInConfig(sourceEvent.getButtonState())) {
                return false;
            }
        }
        return true;
    }

    public boolean shouldBeCancelledBy(GestureHandler<?> handler) {
        GestureHandlerInteractionController gestureHandlerInteractionController;
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this || (gestureHandlerInteractionController = this.interactionController) == null) {
            return false;
        }
        return gestureHandlerInteractionController.shouldHandlerBeCancelledBy(this, handler);
    }

    public boolean shouldRecognizeSimultaneously(GestureHandler<?> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this) {
            return true;
        }
        GestureHandlerInteractionController gestureHandlerInteractionController = this.interactionController;
        if (gestureHandlerInteractionController != null) {
            return gestureHandlerInteractionController.shouldRecognizeSimultaneously(this, handler);
        }
        return false;
    }

    public boolean shouldRequireToWaitForFailure(GestureHandler<?> handler) {
        GestureHandlerInteractionController gestureHandlerInteractionController;
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this || (gestureHandlerInteractionController = this.interactionController) == null) {
            return false;
        }
        return gestureHandlerInteractionController.shouldRequireHandlerToWaitForFailure(this, handler);
    }

    public final boolean shouldWaitForHandlerFailure(GestureHandler<?> handler) {
        GestureHandlerInteractionController gestureHandlerInteractionController;
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (handler == this || (gestureHandlerInteractionController = this.interactionController) == null) {
            return false;
        }
        return gestureHandlerInteractionController.shouldWaitForHandlerFailure(this, handler);
    }

    public final void startTrackingPointer(int i2) {
        int[] iArr = this.trackedPointerIDs;
        if (iArr[i2] == -1) {
            iArr[i2] = findNextLocalPointerId();
            this.trackedPointersIDsCount++;
        }
    }

    public final void stopTrackingPointer(int i2) {
        int[] iArr = this.trackedPointerIDs;
        if (iArr[i2] != -1) {
            iArr[i2] = -1;
            this.trackedPointersIDsCount--;
        }
    }

    public String toString() {
        String simpleName;
        View view = this.view;
        if (view == null) {
            simpleName = null;
        } else {
            Intrinsics.checkNotNull(view);
            simpleName = view.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "@[" + this.tag + "]:" + simpleName;
    }

    protected final PointF transformPoint(PointF point) {
        PointF pointFTransformPointToViewCoords;
        Intrinsics.checkNotNullParameter(point, "point");
        GestureHandlerOrchestrator gestureHandlerOrchestrator = this.orchestrator;
        if (gestureHandlerOrchestrator != null && (pointFTransformPointToViewCoords = gestureHandlerOrchestrator.transformPointToViewCoords(this.view, point)) != null) {
            return pointFTransformPointToViewCoords;
        }
        point.x = Float.NaN;
        point.y = Float.NaN;
        return point;
    }

    public final void updatePointerData(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (event.getActionMasked() == 0 || event.getActionMasked() == 5) {
            dispatchTouchDownEvent(event, sourceEvent);
            dispatchTouchMoveEvent(event, sourceEvent);
        } else if (event.getActionMasked() == 1 || event.getActionMasked() == 6) {
            dispatchTouchMoveEvent(event, sourceEvent);
            dispatchTouchUpEvent(event, sourceEvent);
        } else if (event.getActionMasked() == 2) {
            dispatchTouchMoveEvent(event, sourceEvent);
        }
    }

    public final boolean wantEvents() {
        int i2;
        return (!this.isEnabled || (i2 = this.state) == 1 || i2 == 3 || i2 == 5 || this.trackedPointersIDsCount <= 0) ? false : true;
    }

    public final void withMarkedAsInBounds(Function0<Unit> closure) {
        Intrinsics.checkNotNullParameter(closure, "closure");
        this.isWithinBounds = true;
        closure.invoke();
        this.isWithinBounds = false;
    }
}
