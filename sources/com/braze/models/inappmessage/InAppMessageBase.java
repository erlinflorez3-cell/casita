package com.braze.models.inappmessage;

import android.graphics.Color;
import android.net.Uri;
import bo.app.a20;
import bo.app.b20;
import bo.app.c20;
import bo.app.g30;
import bo.app.h00;
import bo.app.m10;
import bo.app.n10;
import bo.app.o10;
import bo.app.p10;
import bo.app.q10;
import bo.app.qa0;
import bo.app.r10;
import bo.app.s10;
import bo.app.t10;
import bo.app.u10;
import bo.app.w10;
import bo.app.x10;
import bo.app.y10;
import bo.app.z10;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.Orientation;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.j;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.json.JSONException;
import org.json.JSONObject;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.truncatedMessage(InvalidProtocolBufferException.java:70)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.refillBuffer(CodedInputStream.java:1094)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.ensureAvailable(CodedInputStream.java:1080)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readRawBytesSlowPath(CodedInputStream.java:1215)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readBytes(CodedInputStream.java:529)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:244)
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
@Metadata(bv = {}, d1 = {"Яĕ\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.Jչ*, w\u000ffp98D{H6RY*\u0017k\n=,[*uK;c8\u0006\"\u0017[VgmnRZ\u0019e\u0017\u0006\u001cyr,_U\u0001]\u0018/:B\u0006?;MuAA`\u0003<\r 8'@y\u001b\u0001\"*N\u0014~zYK\u0014\u00126Dx:h\rU\u0005 \u0016\u000e>.\b&\\m`>H\u0003]B/)\tqBd'g0\u0003Q\u0015Fj'\u0015vg21eMߎ3ȇR3\u0007\u0001Zo\u0003mqu\u0005خ&g3O\u0002ɱ:[\u0006Є\u00149]M\rx;l\n_ӹ\u000b?+}{[U\u001cߋv\u0013{;:\u0014\u0014\f'V$E\u001a\u0015\u0011\u001e9zra8h\u0002\rKȸ~e<Х$\u000eī*\u00020tUy;GQg\u007f\u0013\u000f6#/ogoڍ\u0012b\u001b\u001fb|\u001aP_DUH|\r\nA{\u0006\tb0+46U\u0007G}'-E+}oޠ'#q\u0006VL0\u0004\u0013j\u0001S\u0018[\u000fṮr\u0018=4\u0017\u0017#Qr\u0011\u0004P\u0003ar%ܖ V\r\n\u0016\u001ehi\u0006I9%>Q\u0016|ȬnOc\u00173=/Dg}\u0004\u000e\u0006<%G̳Ue\u0016p`\u0005\\RJt\u001d^vDc\f\tmV2x\\н\u0014y\u0002V\\\u001f[SM\b44Z4Il#]\u001b*RC\r\t\u000ekx\u0012\u000fTa51}j\t֊\u0005Rb\u0007}~AV:\u0016x\"[Y\u0018IԊ*W(\u0002B\u0017s\u001b\r\u000f\u0018G\u0016M}L+\u0016Lɠ\b°\u001a\u001eAS5X!+O?@\u001fEGbq\u0014W\u0004\u0012ezSȭ\u001b³l2o\np\u000e:~;l]s/$\r]!4>x>\u000e8Ö\u0007ĕgd\u0013]Dh\u0001#q>TY\u000b'? +$}FMW;h?\u001f,vB@Ku\u001c}FК\u0006ˏ\u00136|g\nQq6\bdW\u0004@]XK_&LFt\u0013\u0011j`j&\u0011x\u001dr!\nǼMяtl@O\u0011W\f\u0010\u0017.\u0013\u001ediR\u0015u(B9\u007f,yn\f@/o3?e_wo}K\u000b\u001cZ\u0011\u001a\u000b*B\u001d&RQ^j.ř\u0015ޘ\n\u0004 8Gip4T\u000b*d:m(\rI\u0007w\u001d`!\u000eyw\u000fE;x\byjd֡\u0005חZ^\rbK\u0014/S\u0011\u0001\u0015i,\u0007M3\u000b\"T_Oe86aIYAx\u0007\u0017fS4zhw/~\u0086\rխIsKK\bm\u0012p9oq*\u001aF0~#z&&YS\u0017\u0019\u0005\\/+c!fd%M\u001df\r6\u007fͽ\u0007է\u0012L\u0012\u0011\u0011U]0\bd3\u000b\\7WE A%\u0006y/\u001aA{FIo69;\u0001ajBi2k\u0012\u0010TЯ,Č+\u0014|#b\u001c\u001c,\"_!\u0001$96d\bQ!\u001ap$<\u0016\rr8x>J\u000e\u0016\nď\u001fȨ]{\u007f#Fr99\u001eDQ6\u0007X\u0004ni>c[S\u0007?)\u0012n[\"S\u001dea\u0005\u0094dŷ>![\"^c\u000eg-(%\u000b\u00168I\u0012U:vH<oifC/\u001a\u0003\u0018Enftݰ+ݺy\u00142V.nI1e@jdjIbY\u0014<x\u00075\u0015\u001a\n,|-(\u0015%QH\u001dވ*Ү3G!!amUB\u001f\u0006K,4\u0005QTE\u007fE\u0018[\u00106])\u0003h%+\u0014hV_ۚ\f\u05ff0=NVC\u00015\u001f<ojj4\u0013e:Hp:Z^1=DP l\u001fP0ye\n\u0096%֩\u0005%@\bup'z\u0003SY\u00108H\u001d\u0003\u0013+\bz<Z\u0002$\u000b#]Q&/\u0016z\u0012üAְP7\u0014\u0004k7\r\u0013{X\u0015O:\u0011UG$hc\nP*-\u0014<\u0006$e6Yo\\\u0001ػhȡZ\u0004_\u0006,\u001aD4\\%M]\u0007;*.o\n\u0002.,\u0002B4\u0013\u0014GMt>k\u0001]ƌY˫}\u001bL\u000fK\u0007E8\u001e+9\n\u000b\u001bosF\u001fW\u001f\u001eAjST\u0013\"xp28֏{üD]2\b3\bbZ;|{Iw\u0010f\u0007C\rZ֖3ؒd\u0004h\u001f\u001e\u001fYm\u0017XjqeCx\nn'ZblFbƌ\u0012\u00892X\u001f\u0004\u0004Cn\u000f+5MnOa2X\u0002\u001d+\u000e,N\u0014ȸf\u0003IUT Vs=q\u000fDԹd˥ir\rY'ʀc9ۤ~\u0003/4ܛULϚ)x\n\u0014ȏcVϧCIn6Қ/H3f}\tֳ\\7 ]A,Ǥqܢ6x?_jɷ*EǣmjY)ٔw\u0010Ђ\u000fa\u001d\u0019Ȇ\u001daձ1s\u001a\u001bС=\u0014\nrH\u0004\u000e$]N\u00178Ņ-ǵ\nR7DQОUs_1ZE׆\u000b.ID\t\u0019ڱau7:\"0a\u001bLdW_\u001d\"Õ\u0013ߒFp'~zެ-\u001aޝTVS\u0014\u0018z\u001eK:\u000eFb\u0003GĻIۅn\u0002BiuѨsgǆD{\n'ѷ0\n\u0011\u0012X\u0016hEӄ^мB\u001co)FȒ\u0001((vt\nŲ(H\u0019kb\u001c{*\u0019Ǟ\u0015^Ln6ٯx\u0001\tΌBͱ="}, d2 = {"\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=\u0007{Bx}.[Q7m4z\u0011va\u000f", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001ej", "\u001ab^:\")KO.~Df6{\t6sI,\u0005<\f\"\u001fG}\u001c8x%~=a)\u0013x!\u0016MQIg6\u001e\u0004kaA\u0007_)Uv|", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u0013`\u0002\u001e=I\u0014=QMDA", "1kX0^\b<b\u001d\t\u0004", "", "Adc\u0010_0<Yu~}Z=\u0001\u0013<", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI,\u0005<\f\"\u001fG}\u001c8x%~7\u0005$5sq,\\GEt\na\u0006", "\u001a`]1e6BRb\bzmul\u00163;", "CqX", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI,\u0005<\f\"\u001fG}\u001c8x%~7\u0005$5sq,\\GEt\n\u0005\u0011q`F\u0011g+\u0018\u007f'V\u0016>9`(6.", "", ":nV\u0016`7KS'\r~h5", "u(I", ":nV\u0010_0<Y", "=m03g,K1 \t\t^+", "u(E", "3mP/_,\u001dO&\u0005ia,\u0005\t", "", "", "5dc\u001fX4Hb\u0019Z\tl,\fs+t\u00036\\J\u000e\u0002$Gp\u000eKt(", "u(;7T=:\u001d)\u000e~euc\r=tU", "", "@d\\<g,)O(\u0002ih\u0013\u0007\u0007+l[6\n@\u0010~\u0013R", "Adc\u0019b*:Z\u0004\fz_,\f\u00072e~\u0004\nN\u0001&\u0002C~\u0011J", "uKY.i(\bc(\u0003\u0002(\u0014x\u0014\u0005)p", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "4na\u0017f6G>)\u000e", "u(;<e.\bX'\t\u0004(\u0011jr\u0018O|-{>\u0010l", "7mc2e5:Zv\u0006~\\2X\u0007>i\n1", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u0013`\u0002\u001e=I\u0014=QMDA", "7mc2e5:Z\t\f~", "\u001a`]1e6BRb\bzmul\u00163;", ";db@T.>", "\u001aiPCTuEO\"\u0001DL;\n\r8gU", "5dc\u001aX:LO\u001b~", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u001aX:LO\u001b~", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "7b^;", "5dc\u0016V6G", "Adc\u0016V6G", "=oT;H9B7\"pz[\u001d\u0001\tA", "(", "5dc\u001cc,GC&\u0003^g\u001e|\u0006 i\u007f:", "Adc\u001cc,GC&\u0003^g\u001e|\u0006 i\u007f:", "uY\u0018#", "5dc\u001cc,GC&\u0003^g\u001e|\u0006 i\u007f::<\n !Vk\u001d@\u0001.C", "3wc?T:", "\u001aiPCTuNb\u001d\u0006DF(\b^", "5dc\u0012k;KO'", "u(;7T=:\u001d)\u000e~eud\u0005:;", "Adc\u0012k;KO'", "/mX:T;>7\"", "5dc\u000ea0FO(~^g", "Adc\u000ea0FO(~^g", "5dc\u000ea0FO(~^gjx\u00128o\u000f$\u000bD\u000b %", "/mX:T;>=)\u000e", "5dc\u000ea0FO(~dn;", "Adc\u000ea0FO(~dn;", "5dc\u000ea0FO(~dn;;\u00058n\n7wO\u0005! U", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u0014]\f(;{$\u001daN;A", "2hb:\\:LB-\nz", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u0014]\f(;{$\u001daN;A", "5dc\u0011\\:FW'\rir7|", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eq\u007fI|\"\"Oo\u001cJr'5#\\$Eu\u001a<[2Ov4s", "Adc\u0011\\:FW'\rir7|", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI,\u0005<\f\"\u001fG}\u001c8x%~8\u0002.?q$<<WFk\na\u0006", "", "D`[BX", "2ta.g0H\\|\bbb3\u0004\r=e}2\u0005?\u000f", "\u0017", "5dc\u0011h9:b\u001d\t\u0004B5d\r6l\u00046{>\u000b \u0016U", "u(8", "Adc\u0011h9:b\u001d\t\u0004B5d\r6l\u00046{>\u000b \u0016U", "uH\u0018#", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u001ff\u0002 @|\u0012=QMDA", "=qX2a;:b\u001d\t\u0004", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u001ff\u0002 @|\u0012=QMDA", "5dc\u001ce0>\\(z\nb6\u0006", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eq\u007fI|\"\"Oo\u001cJr'5#g-;m\u001f=IR?u=s", "Adc\u001ce0>\\(z\nb6\u0006", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI,\u0005<\f\"\u001fG}\u001c8x%~C\u000b$7v%*\\GEt\na\u0006", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u0013f\b+&\u0002!.#", "1q^=G@IS", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn\u0013f\b+&\u0002!.#", "5dc\u0010e6IB-\nz", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eq\u007fI|\"\"Oo\u001cJr'5#[-Ax\u0005BXC\u0011", "Adc\u0010e6IB-\nz", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI,\u0005<\f\"\u001fG}\u001c8x%~7\u000b*B\\*9M\u0019~\\", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn$Y\u0011/\u0013t\u001a0V\u0019", ";db@T.>B\u0019\u0012\n:3\u0001\u000b8", "\u001ab^:\")KO.~D^5\r\u0011=/\u00041wK\f\u001f\u0017U}\n>vn$Y\u0011/\u0013t\u001a0V\u0019", "5dc\u001aX:LO\u001b~i^?\fd6i\u00021", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eq\u007fI|\"\"Oo\u001cJr'5#l J|q5QEDA", "Adc\u001aX:LO\u001b~i^?\fd6i\u00021", "uKR<`u;`\u0015\u0014z(,\u0006\u00197sI,\u0005<\f\"\u001fG}\u001c8x%~H}3FI\u001d2OL\u0011/%", "", "3w_6e(MW#\bib4|\u0017>a\b3", "\u0018", "5dc\u0012k7B`\u0015\u000e~h5k\r7e\u000e7wH\f", "u(9", "Adc\u0012k7B`\u0015\u000e~h5k\r7e\u000e7wH\f", "uI\u0018#", "7b^;5(<Y\u001b\f\u0005n5{f9l\n5", "5dc\u0016V6G0\u0015|\u0001`9\u0007\u00198d]2\u0003J\u000e", "Adc\u0016V6G0\u0015|\u0001`9\u0007\u00198d]2\u0003J\u000e", ";db@T.>B\u0019\u0012\n<6\u0004\u0013<", "5dc\u001aX:LO\u001b~i^?\ff9l\n5", "Adc\u001aX:LO\u001b~i^?\ff9l\n5", "0`R8Z9Hc\"}Xh3\u0007\u0016", "5dc\u000fT*DU&\t\u000bg+Z\u00136o\r", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r", "7b^;66E]&", "5dc\u0016V6G1#\u0006\u0005k", "Adc\u0016V6G1#\u0006\u0005k", "7rC2f;,S\"}", "Adc!X:MA\u0019\by", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "7l_?X:LW#\bah.~\t.", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5J 8TC7t\n", "1kX0^\u0013HU\u001b~y", "8r^;B)CS\u0017\u000e", "\u001ana4\"1L]\"H_L\u0016er,j\u007f&\u000b\u0016", "5dc\u0017f6G=\u0016\u0004z\\;", "Adc\u0017f6G=\u0016\u0004z\\;", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOVZ\b", "\u001aa^{T7I\u001d\u001cIE4", "0qPGX\u0014:\\\u0015\u0001zk", "\u001aa^{T7I\u001d\u001cIE4", "5dc\u000fe(SS\u0001z\u0004Z.|\u0016", "u(;/bu:^$H})vR", "Adc\u000fe(SS\u0001z\u0004Z.|\u0016", "uKQ<\"(I^b\u0002E)\u0002@y", "\u001aa^{T7I\u001d\u001bLE4", "7m0=c\u0014>a'z|^\u000bx\u00165T\u0003(\u0004@r$\u0013Rz\u000eI", "\u001aa^{T7I\u001d\u001bLE4", "5dc\u0016a\bI^\u0001~\tl(~\t\u000ea\r.jC\u0001\u001f\u00179|\nG\u0002%B", "u(;/bu:^$H|,vR", "Adc\u0016a\bI^\u0001~\tl(~\t\u000ea\r.jC\u0001\u001f\u00179|\nG\u0002%B", "uKQ<\"(I^b\u0001H)\u0002@y", ";db@T.>3,\u000e\bZ:", "5dc\u001aX:LO\u001b~Zq;\n\u0005=", "Adc\u001aX:LO\u001b~Zq;\n\u0005=", "5dc\u0010_0<Yt|\nb6\u0006", "u(;0b4\bP&z\u0010^u|\u0012?m\u000eq\u007fI|\"\"Oo\u001cJr'5#[';k\u001c\nKR?u=s", "5dc\"e0", "u(;.a+K]\u001d}Dg,\fR\u001fr\u0004}", "7r2<a;K] ", "5dc!e0@U\u0019\f^]", "BqX4Z,K7\u0018", "\nh]6g\u0005", "8r^;", "uK^?ZuCa#\bDC\u001afq\u0019b\u0005(yOV}\u0014Q9\nG\u0002n8$Hu,bY\u001f", "\u0011n\\=T5B]\"", "0n\u001e.c7\b[dI", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xs = "")
public abstract class InAppMessageBase implements IInAppMessage, IInAppMessageThemeable {
    protected static final String ANIMATE_IN = "animate_in";
    protected static final String ANIMATE_OUT = "animate_out";
    public static final String BG_COLOR = "bg_color";
    public static final String CLICK_ACTION = "click_action";
    public static final String CROP_TYPE = "crop_type";
    public static final m10 Companion = new m10();
    public static final String DISMISS_TYPE = "message_close";
    public static final String DURATION = "duration";
    public static final String EXTRAS = "extras";
    public static final String ICON = "icon";
    public static final String ICON_BG_COLOR = "icon_bg_color";
    public static final String ICON_COLOR = "icon_color";
    public static final int INAPP_MESSAGE_DURATION_DEFAULT_MILLIS = 5000;
    public static final int INAPP_MESSAGE_DURATION_MIN_MILLIS = 999;
    public static final String IS_CONTROL = "is_control";
    public static final String IS_TEST_SEND = "is_test_send";
    public static final String MESSAGE = "message";
    public static final String MESSAGE_EXTRAS = "message_extras";
    public static final String MESSAGE_TEXT_ALIGN = "text_align_message";
    public static final String MESSAGE_TEXT_COLOR = "text_color";
    public static final String OPEN_URI_IN_WEBVIEW = "use_webview";
    public static final String ORIENTATION = "orientation";
    public static final String TRIGGER_ID = "trigger_id";
    public static final String TYPE = "type";
    public static final String URI = "uri";
    private boolean animateIn;
    private boolean animateOut;
    private int backgroundColor;
    private h00 brazeManager;
    private final AtomicBoolean clickLogged;
    private CropType cropType;
    private DismissType dismissType;
    private int durationInMilliseconds;
    private long expirationTimestamp;
    private Map<String, String> extras;
    private String icon;
    private int iconBackgroundColor;
    private int iconColor;
    private final AtomicBoolean impressionLogged;
    private g30 inAppMessageDarkThemeWrapper;
    private ClickAction internalClickAction;
    private Uri internalUri;
    private boolean isTestSend;
    private JSONObject jsonObject;
    private String message;
    private String messageExtras;
    private TextAlign messageTextAlign;
    private int messageTextColor;
    private boolean openUriInWebView;
    private Orientation orientation;

    public InAppMessageBase() {
        this.internalClickAction = ClickAction.NONE;
        this.extras = MapsKt.emptyMap();
        this.animateIn = true;
        this.animateOut = true;
        this.dismissType = DismissType.AUTO_DISMISS;
        this.durationInMilliseconds = 5000;
        this.orientation = Orientation.ANY;
        this.cropType = CropType.FIT_CENTER;
        this.messageTextAlign = TextAlign.CENTER;
        this.expirationTimestamp = -1L;
        this.iconBackgroundColor = Color.parseColor("#ff0073d5");
        this.messageTextColor = Color.parseColor("#555555");
        this.backgroundColor = -1;
        this.iconColor = -1;
        this.impressionLogged = new AtomicBoolean(false);
        this.clickLogged = new AtomicBoolean(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageBase(JSONObject json, h00 brazeManager) {
        this(json, brazeManager, false, false, 12, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageBase(JSONObject json, h00 brazeManager, boolean z2) {
        this(json, brazeManager, z2, false, 8, null);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
    }

    public InAppMessageBase(JSONObject json, h00 brazeManager, boolean z2, boolean z3) throws JSONException {
        String upperCase;
        String upperCase2;
        int i2;
        String upperCase3;
        int i3;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.internalClickAction = ClickAction.NONE;
        this.extras = MapsKt.emptyMap();
        this.animateIn = true;
        this.animateOut = true;
        this.dismissType = DismissType.AUTO_DISMISS;
        this.durationInMilliseconds = 5000;
        Orientation orientation = Orientation.ANY;
        this.orientation = orientation;
        this.cropType = CropType.FIT_CENTER;
        this.messageTextAlign = TextAlign.CENTER;
        this.expirationTimestamp = -1L;
        this.iconBackgroundColor = Color.parseColor("#ff0073d5");
        this.messageTextColor = Color.parseColor("#555555");
        this.backgroundColor = -1;
        this.iconColor = -1;
        this.impressionLogged = new AtomicBoolean(false);
        this.clickLogged = new AtomicBoolean(false);
        this.jsonObject = json;
        this.brazeManager = brazeManager;
        setMessage(json.optString("message"));
        setAnimateIn(json.optBoolean(ANIMATE_IN, true));
        setAnimateOut(json.optBoolean(ANIMATE_OUT, true));
        setDurationInMilliseconds(json.optInt("duration"));
        setIcon(json.optString(ICON));
        try {
            String string = json.getString("orientation");
            Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(key)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            upperCase3 = string.toUpperCase(US);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "this as java.lang.String).toUpperCase(locale)");
        } catch (Exception unused) {
        }
        for (Orientation orientation2 : Orientation.values()) {
            if (Intrinsics.areEqual(orientation2.name(), upperCase3)) {
                if (orientation2 != null) {
                    orientation = orientation2;
                }
                setOrientation(orientation);
                setOpenUriInWebView(json.optBoolean(OPEN_URI_IN_WEBVIEW, false));
                setIconBackgroundColor(json.optInt(ICON_BG_COLOR));
                setMessageTextColor(json.optInt(MESSAGE_TEXT_COLOR));
                setBackgroundColor(json.optInt(BG_COLOR));
                setIconColor(json.optInt(ICON_COLOR));
                this.impressionLogged.set(z2);
                this.clickLogged.set(z3);
                setExtras(JsonUtils.convertJSONObjectToMap(json.optJSONObject(EXTRAS)));
                if (json.has(MESSAGE_EXTRAS)) {
                    setMessageExtras(json.optString(MESSAGE_EXTRAS));
                }
                String strOptString = json.optString("uri");
                ClickAction clickAction = ClickAction.NONE;
                try {
                    String string2 = json.getString(CLICK_ACTION);
                    Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(key)");
                    Locale US2 = Locale.US;
                    Intrinsics.checkNotNullExpressionValue(US2, "US");
                    upperCase2 = string2.toUpperCase(US2);
                    Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                } catch (Exception unused2) {
                }
                for (ClickAction clickAction2 : ClickAction.values()) {
                    if (Intrinsics.areEqual(clickAction2.name(), upperCase2)) {
                        if (clickAction2 != null) {
                            clickAction = clickAction2;
                        }
                        if (clickAction == ClickAction.URI && strOptString != null && !StringsKt.isBlank(strOptString)) {
                            this.internalUri = Uri.parse(strOptString);
                        }
                        this.internalClickAction = clickAction;
                        DismissType dismissType = DismissType.AUTO_DISMISS;
                        try {
                            String string3 = json.getString(DISMISS_TYPE);
                            Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.getString(key)");
                            Locale US3 = Locale.US;
                            Intrinsics.checkNotNullExpressionValue(US3, "US");
                            upperCase = string3.toUpperCase(US3);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
                        } catch (Exception unused3) {
                        }
                        for (DismissType dismissType2 : DismissType.values()) {
                            if (Intrinsics.areEqual(dismissType2.name(), upperCase)) {
                                if (dismissType2 != null) {
                                    dismissType = dismissType2;
                                }
                                setDismissType(dismissType == DismissType.SWIPE ? DismissType.MANUAL : dismissType);
                                this.inAppMessageDarkThemeWrapper = j.a(json);
                                json.put(IS_TEST_SEND, isTestSend());
                                return;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public /* synthetic */ InAppMessageBase(JSONObject jSONObject, h00 h00Var, boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, h00Var, (-1) - (((-1) - i2) | ((-1) - 4)) != 0 ? false : z2, (i2 + 8) - (i2 | 8) != 0 ? false : z3);
    }

    public static /* synthetic */ void getAnimateIn$annotations() {
    }

    public static /* synthetic */ void getAnimateOut$annotations() {
    }

    public static /* synthetic */ void getOpenUriInWebView$annotations() {
    }

    @Override // com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        g30 g30Var = this.inAppMessageDarkThemeWrapper;
        if (g30Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) q10.f1564a, 7, (Object) null);
            return;
        }
        if (g30Var != null) {
            Integer num = g30Var.f703a;
            if (num != null) {
                setBackgroundColor(num.intValue());
            }
            Integer num2 = g30Var.f706d;
            if (num2 != null) {
                setIconColor(num2.intValue());
            }
            Integer num3 = g30Var.f707e;
            if (num3 != null) {
                setIconBackgroundColor(num3.intValue());
            }
            Integer num4 = g30Var.f704b;
            if (num4 != null) {
                setMessageTextColor(num4.intValue());
            }
        }
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.putOpt("message", getMessage());
            jSONObject2.put("duration", getDurationInMilliseconds());
            jSONObject2.putOpt(TRIGGER_ID, getTriggerId());
            jSONObject2.putOpt(CLICK_ACTION, getClickAction().toString());
            jSONObject2.putOpt(DISMISS_TYPE, getDismissType().toString());
            if (getUri() != null) {
                jSONObject2.put("uri", String.valueOf(getUri()));
            }
            jSONObject2.put(OPEN_URI_IN_WEBVIEW, getOpenUriInWebView());
            jSONObject2.put(ANIMATE_IN, getAnimateIn());
            jSONObject2.put(ANIMATE_OUT, getAnimateOut());
            jSONObject2.put(BG_COLOR, getBackgroundColor());
            jSONObject2.put(MESSAGE_TEXT_COLOR, getMessageTextColor());
            jSONObject2.put(ICON_COLOR, getIconColor());
            jSONObject2.put(ICON_BG_COLOR, getIconBackgroundColor());
            jSONObject2.putOpt(ICON, getIcon());
            jSONObject2.putOpt(CROP_TYPE, getCropType().toString());
            jSONObject2.putOpt("orientation", getOrientation().toString());
            jSONObject2.putOpt(MESSAGE_TEXT_ALIGN, getMessageTextAlign().toString());
            jSONObject2.putOpt(IS_CONTROL, Boolean.valueOf(isControl()));
            jSONObject2.put(IS_TEST_SEND, isTestSend());
            if (!getExtras().isEmpty()) {
                jSONObject2.put(EXTRAS, getExtras());
            }
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (Function0) r10.f1640a, 4, (Object) null);
        }
        return jSONObject2;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getAnimateIn() {
        return this.animateIn;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getAnimateOut() {
        return this.animateOut;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final h00 getBrazeManager() {
        return this.brazeManager;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public ClickAction getClickAction() {
        return this.internalClickAction;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public CropType getCropType() {
        return this.cropType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public DismissType getDismissType() {
        return this.dismissType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getDurationInMilliseconds() {
        return this.durationInMilliseconds;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public long getExpirationTimestamp() {
        return this.expirationTimestamp;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Map<String, String> getExtras() {
        return this.extras;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public String getIcon() {
        return this.icon;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getIconColor() {
        return this.iconColor;
    }

    public final g30 getInAppMessageDarkThemeWrapper() {
        return this.inAppMessageDarkThemeWrapper;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public String getMessage() {
        return this.message;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public String getMessageExtras() {
        return this.messageExtras;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public TextAlign getMessageTextAlign() {
        return this.messageTextAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public int getMessageTextColor() {
        return this.messageTextColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean getOpenUriInWebView() {
        return this.openUriInWebView;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Orientation getOrientation() {
        return this.orientation;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public List<String> getRemoteAssetPathsForPrefetch() {
        return CollectionsKt.emptyList();
    }

    public final String getTriggerId() {
        JSONObject jSONObject = this.jsonObject;
        if (jSONObject != null) {
            return jSONObject.optString(TRIGGER_ID);
        }
        return null;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public Uri getUri() {
        return this.internalUri;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean isControl() {
        JSONObject jSONObject = this.jsonObject;
        return jSONObject != null && jSONObject.optBoolean(IS_CONTROL);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean isTestSend() {
        return this.isTestSend;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean logClick() {
        String triggerId = getTriggerId();
        if (triggerId == null || StringsKt.isBlank(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) s10.f1720a, 7, (Object) null);
            return false;
        }
        h00 h00Var = this.brazeManager;
        if (h00Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) t10.f1801a, 6, (Object) null);
            return false;
        }
        if (getMessageType() != MessageType.HTML && this.clickLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) u10.f1903a, 6, (Object) null);
            return false;
        }
        this.clickLogged.set(true);
        BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new w10(triggerId, h00Var, null), 3, null);
        return true;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public boolean logImpression() {
        String triggerId = getTriggerId();
        if (triggerId == null || StringsKt.isBlank(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) x10.f2176a, 6, (Object) null);
            return false;
        }
        h00 h00Var = this.brazeManager;
        if (h00Var == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) y10.f2258a, 6, (Object) null);
            return false;
        }
        if (this.impressionLogged.get()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) z10.f2339a, 6, (Object) null);
            return false;
        }
        this.impressionLogged.set(true);
        BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new a20(triggerId, this, h00Var, null), 3, null);
        return true;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        String triggerId = getTriggerId();
        if (triggerId == null || triggerId.length() == 0) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(qa0.f1589a, null, null, new b20(this, null), 3, null);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setAnimateIn(boolean z2) {
        this.animateIn = z2;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setAnimateOut(boolean z2) {
        this.animateOut = z2;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setBackgroundColor(int i2) {
        this.backgroundColor = i2;
    }

    public final void setBrazeManager(h00 h00Var) {
        this.brazeManager = h00Var;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setClickBehavior(ClickAction clickAction) {
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        setClickBehavior(clickAction, null);
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setClickBehavior(ClickAction clickAction, Uri uri) {
        Intrinsics.checkNotNullParameter(clickAction, "clickAction");
        if (n10.f1331a[clickAction.ordinal()] != 1) {
            this.internalClickAction = clickAction;
            this.internalUri = null;
        } else if (uri == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) c20.f310a, 6, (Object) null);
        } else {
            this.internalClickAction = clickAction;
            this.internalUri = uri;
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setCropType(CropType cropType) {
        Intrinsics.checkNotNullParameter(cropType, "<set-?>");
        this.cropType = cropType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setDismissType(DismissType dismissType) {
        Intrinsics.checkNotNullParameter(dismissType, "<set-?>");
        this.dismissType = dismissType;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setDurationInMilliseconds(int i2) {
        if (i2 < 999) {
            this.durationInMilliseconds = 5000;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new o10(i2), 7, (Object) null);
        } else {
            this.durationInMilliseconds = i2;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new p10(i2), 7, (Object) null);
        }
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setExpirationTimestamp(long j2) {
        this.expirationTimestamp = j2;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setExtras(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.extras = map;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setIcon(String str) {
        this.icon = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setIconBackgroundColor(int i2) {
        this.iconBackgroundColor = i2;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setIconColor(int i2) {
        this.iconColor = i2;
    }

    public final void setInAppMessageDarkThemeWrapper(g30 g30Var) {
        this.inAppMessageDarkThemeWrapper = g30Var;
    }

    public final void setJsonObject(JSONObject jSONObject) {
        this.jsonObject = jSONObject;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setLocalPrefetchedAssetPaths(Map<String, String> remotePathToLocalAssetMap) {
        Intrinsics.checkNotNullParameter(remotePathToLocalAssetMap, "remotePathToLocalAssetMap");
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setMessage(String str) {
        this.message = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setMessageExtras(String str) {
        this.messageExtras = str;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setMessageTextAlign(TextAlign textAlign) {
        Intrinsics.checkNotNullParameter(textAlign, "<set-?>");
        this.messageTextAlign = textAlign;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setMessageTextColor(int i2) {
        this.messageTextColor = i2;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setOpenUriInWebView(boolean z2) {
        this.openUriInWebView = z2;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setOrientation(Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "<set-?>");
        this.orientation = orientation;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public void setTestSend(boolean z2) {
        this.isTestSend = z2;
    }
}
