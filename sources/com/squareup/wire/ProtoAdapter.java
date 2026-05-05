package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapterKt;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.ReflectionKt;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
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
@Metadata(bv = {}, d1 = {"Яĩ\u0014D57\u001eqܜLDqŞ\fǻ\u000e0!.Jչ*,(w\u000f߿r9>Pm߉6Ri*\u0017k\u00026,[:qK;[.\u0006\"\u0017mVgmtRZ\u0019I\u0017\u0006\u001c{r,WU\u0001ز\u001a\u000fHBwЀ;M\u0006=A`z9\r H\"@ц\r\u0001(:P\u0010|zKK\"\u00128@v:Z\rc\u0005\"\u0012\f?(\u00014\\oޮ>H\u0003]B/)\u0006qBd'g0\u0003N\u0015FbF\u0015vw\u001e3@=8\u001d%i\u0003\u000fRaA\u000b?\u007fF\rh-*1m\nɎT>(\u0016\u001bۀ]\f\u000erT\\=QEqgp_gYQ&(&|\f\u0017J\u0007&\f7H4.0e6\u0012Cz\u0001XXR\u0018]p\u0006\u000beD\u001e=\u007fa3I#lQoD1PMz;ټ.+\u0007n/el\u0010v\u0014IZɐU3WKKT\u000f%_Q}\b~c\u001a*22W\b=~)2'%=\\g0\u074co\u0004NOu\u0005E\u0006ngyVVA:nD9:\u0011\u001a]\\h\u0015kVU\u00079!S*Y\u001f\u007f\u001e\u0012Nbʟ@#+\u001b\\^)\u0017pam\u000e30~7\bp{\u0016e<v7EQi\u0011\u0010_\u0007\u001aMAz\u0007nepY\u001c^j/:2vrݻ{}JY\u001a#rvw0D0?\u001at\u0015v\u0005.JO\u007f!cjh\u0016\u007f\u0003@4\tw)\r\u000b\u0017O\u000bv\u007fk\u0007PD|\u000f*=G_>1(k!\u001fؔč'\t\u0005~\u000eX(iM`|\u001a\u0004V\u0014 D\u001cI[=@+\u0015\u000f)8\u0003CDzvϯUO\u00182\t\u000f:6A|>k\u0016k\t,\u000flZYb\u001a:|nr)\tz~(eV\u0001Uhl\rq=wxè]>TC\u000b\u0018_M+\u0015\u007f&\u000b6ECU\u001f&\u0002\"2-gmiu/\u0010a=*\u0005k\u00121{\u0018\u0006a\u007fcB?FPq~l*ٝp\u0005HSx\fH{\u000fH\u001d7VB|p\u0005:]\u0015=\u0001~\r<\rvWq9As\u000e:<dBuY|BdS)\u001fTkg\u001cu[b\u0019S'\f!zgޫ݁ ?&aewIq\f\b(:O<z\u0005j\u000b4<:? \u000fSTo\u0007>\b\u0010Lm\u0014/4Xri\\\u001eX\u0007cnH3hUf/3\u0019\u0001%2T֭E7\u0013w^VEb`\u0007Ә!\u000b!u]\u0015/89ml9Qι\t\u0005\u0019ouC\u007f\u0379|(ھ-my\u001bTK&)5BFHiU\u001f\n\u000f0\u0015Η\u001c\t͒hv \u0015\u001bk0X\u0017z+;l\u000e\u001d;1O!\u001d\u00133Zx\u00109Y\u00197ҿ\u000b=ܰ\u0010|qwcH\u0014gE=w\u001eD+\n\fk;,=P$5.\r!\u0013ަT\u000bŭa\u001bHL:1p4!\u0013~S42X)\u000b\n\\?fS\u0010]\u001a\u0013\u0015̏2\f̝D'9%NgY\"\u0011\n\u0012 \u0014rc?\u001bf_\f*r;\u00015\tUz^\u0019f\u0005R\u0013i\u001f\u000fҹF(ޞ*\u001fDB+N\u001e\t{h\u001f\u001f\u007f_\u001b_GkX\u0019a4`N\u0016\u001f(#40bR-=lLtĹOp\u05cfFW\u001c\u001a3Ar'$)B0/LlM+4t0Nh=a1\u001f\u0012ƬӴd\u0007\u0012\u0004\u00127/cj?Ivb\u000f}R\u000f\u00119̌Ūx\u007f8\u0003Q\u0004\u000e)D-t\u0017m\u001e5\u0004<m\u001bܞΜOEF\u0006PE\u001f@)/\tkPBj^4;\u007fxq\u001d\u001f+-8<ˏ߁\u001d5x\u0018\u001c88H\u0015\u0001Cׄ*5y\u0003\f7!lu3Θ\u001fWt\u0006mHs\u0014?\f8ʆz\u0003[,n\u000f\u0010w\u0010I¹\"yc\rH\u001b-k<\u0006,߿0I?\u0016B_\u000b\u007fҕwW\u0012trG|\f;G#ԭ$\u000e:70s\u0013\u001eɈ8A\tcaULqEl=ŵ}l\b[\\\rseʁ\u0013\u00067\u0006_\u0017\u001e#\n@Y|#Q=%u<A=4D@6N\u007fWBi*<Ќ@*,\u0005xAi_>kB\u0011\u001bL\u00101\u0001,0j+l?Q\u0007HF\\/\u0090o8SQ\u001dkv.xԽ;\n$r`\u00170Tߢd\u0015!\u000b\u0010\u0007O *V*'M\u0015iO\u001e%\u001e߳\u000eS߂uXK\u0013{\"{%p9u\\\u000bVOɿ\u0015/#[\u0003+\\$\u001dÍϹ.X\fk\u000etVn\\\u0005T0}6@2`~\u0011֬\f%J\u05fb\u0006e#E\u0017>r?kj!-GW%ְ\u0004G[ҼR\u0015\u001eB1\u00139 *ե4עw\u00139ą\u0014\nb`c\u0015>^\u001e\u0006yP1/\f@E@ypʂiE!ًW\u0001\u001295>V$2g\u007f\u0015\u007f\rPe̿P<^ʷ`M_,t^;\u001e\t{$.:@˴\nC\u000e\u0086z\u001e;Xm^|A~\u0012_Q\u0001z`ڜݸj|aMSL\u000e\u001bDP\u007f14`m\u001e\u0007SrWl\u001dЍ*F\u001b˫2\u001f,\u0004\ndyP%x{{z{df![Dkfٙ(\u0017|cl͔\u0015̢JՒ\u001dlWʇ3SJ\b\u0017\u0007AhO7zz</FNz\u001b\u0011\u0001\u0002ڙE8MC%Ÿ>ʩ<ɬe([ԥ=IP.\u001c\u00112\n#\\u3dn&jSϰ\u0007âjv\u001cn\u000b0>gθ3\u0019"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "\u0013", "", "4hT9W\fGQ#}~g.", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq\\D\u0001\u001e\u0016'x\fFu)>[S", "Bx_2", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "Bx_2H9E", "", "Ax]AT?", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqiT\n&\u0013ZE", "7cT;g0Mg", "And?V,\u001fW ~", "\nh]6g\u0005", "uKR<`uL_)z\b^<\bRAi\r(E!\u0005\u0017\u001eFO\u0017:\u0001$9b\u007fu\u001es =TGD5A\u001e\u0016oa7\u0016-\u0012,}#UZ$\u0013aN\u00049]\u0019V\u0017Ptz\u0014fE-p\u001a\u001e\u001d\u00124\u0013\u0010Gx|\u0019\u0016\u001e@4\u0003Fc\u0010\u0011g)~P%{\u001c@duX=\u000fi&m\u000e)\u0007Y?:\"#G\u007f da*S\u0003O\u001at\u001cgvtK\"|\u000eg/", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "uKR<`uL_)z\b^<\bRAi\r(E!\u0005\u0017\u001eFO\u0017:\u0001$9b\u007fu\u001er\u0012?I\rBg= ^Fh5\u0015q\u0002\u0012g", "uKR<`uL_)z\b^<\bRAi\r(E!\u0005\u0017\u001eFO\u0017:\u0001$9b\u007fu\u001er\u0012?I\rBg= ^Fh5\u0015q\u00025{#XH\u00183X[t\u0007\u0002!g\u0012W-bHJ", "uKR<`uL_)z\b^<\bRAi\r(E!\u0005\u0017\u001eFO\u0017:\u0001$9b\u007fu\u001er\u0012?I\rBg= ^Fh5\u0015q\u00025{#XH\u00183X[t\u0007\u0002!g\u0012W-bkWK,8RC/\u00049I\u0012F2\u0013\u0010#\u000e~X\u0005Ke\fZOXf", "uKR<`uL_)z\b^<\bRAi\r(E!\u0005\u0017\u001eFO\u0017:\u0001$9b\u007fu\u001er\u0012?I\rBg= ^Fh5\u0015q\u00025{#XH\u00183X[t\u0007\u0002!g\u0012W-bkWK,8RC/\u00049I\u0012F2\u0013\u0010#\u000e~X\u0005Ke\fZO{z=:d\u0010`[\u0003I\u000b/_/d\nnr +", "uKR<`uL_)z\b^<\bRAi\r(E!\u0005\u0017\u001eFO\u0017:\u0001$9b\u007fu\u001es =TGD5A\u001e\u0016oa7\u0016-\u0012,}#UZ$oM", "uKR<`uL_)z\b^<\bRAi\r(E!\u0005\u0017\u001eFO\u0017:\u0001$9b\u007fu\u001es =TGD5A\u001e\u0016oa7\u0016-\u0012,}#UZ$\u0013aN\u00049]\u0019V\u0017Ptz\u0014fE-p\u001az\u0010", "uKR<`uL_)z\b^<\bRAi\r(E!\u0005\u0017\u001eFO\u0017:\u0001$9b\u007fu\u001es =TGD5A\u001e\u0016oa7\u0016-\u0012,}#UZ$\u0013aN\u00049]\u0019V\u0017Ptz\u0014fE-p\u001a\u001e\u001d\u00124\u0013\u0010Gx|\u0019\u0016\u001e@4\u0003Fc\u0010\u0011g)~P%{\u001c\u001dP", "uKR<`uL_)z\b^<\bRAi\r(E!\u0005\u0017\u001eFO\u0017:\u0001$9b\u007fu\u001es =TGD5A\u001e\u0016oa7\u0016-\u0012,}#UZ$\u0013aN\u00049]\u0019V\u0017Ptz\u0014fE-p\u001a\u001e\u001d\u00124\u0013\u0010Gx|\u0019\u0016\u001e@4\u0003Fc\u0010\u0011g)~P%{\u001c@duX=\u000fi&m\u000e)\u0007Y?:\"#G\\\f", "uKR<`uL_)z\b^<\bRAi\r(E!\u0005\u0017\u001eFO\u0017:\u0001$9b\u007fu\u001er\u0012?I\rBg= ^Fh5\u0015q\u00025{#XH\u00183X[t\u0007\u0002!g\u0012W-bkWK,8RC/\u00049I\u0012F2\u0013\u0010#\u000e~X\u0005Ke\fZO{z=:d\u0010`[\u0003I\u000b/_/d\nnrC?65\u0010; \u0017qRww\u000b`\u0015{TO+X", "5dc\u0013\\,ERx\bxh+\u0001\u00121$\u0012,\t@z$'P~\u0012Dv", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\na\u001b\u0017NnmEt/4]\u0007\"\r", "5dc!l7>", "u(;8b;EW\"H\b^-\u0004\t-tI\u000eYG|%%\u001d", "5dc!l7>C&\u0006", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc l5MO,", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nn+ Vk!\u0012", "5dc\u0016W,Gb\u001d\u000e\u000f", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "5dc b<KQ\u0019_~e,", ">`R8X+\u001aR\u0015\n\n^9", "", "5dc\u001dT*DS\u0018ZyZ7\f\t<$\u0012,\t@z$'P~\u0012Dv", "u(;0b4\ba%\u000fvk,\r\u0014xw\u00045{\nk$!Vyi;r0DY\u000bu", "@d_2T;>Rt}vi;|\u0016", "5dc\u001fX7>O(~y:+x\u0014>e\rf\u000eD\u000e\u0017\u0011T\u007f\u0017Kz-5", "@dS.V;", "D`[BX", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004", "3mR<W,=A\u001d\u0014z", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?$", "3mR<W,=A\u001d\u0014zP0\f\f\u001ea\u0002", "B`V", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004d", "3mR<W,", "", "EqXAX9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!9|\u0012Kv2\u000b", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&Qa\u001b@\u0006%B/d%3~\u0012wT?Dm}\b\u0012ma7\u00169o?", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqh@\u0012\u0017$UoxI\u00014?K\u000b$Fm#\u0004", "uKR<`uL_)z\b^<\bRAi\r(E-\u0001(\u0017T}\u000e'\u0004/Dco-;|\u0016;#*@gE\u001a^o]B\t-\u0016K{'E[$oM", "3mR<W,0W(\u0002iZ.", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&Qa\u001b@\u0006%B/a\u0007<i'*\u0017J7t6g~ef9\u0005r\u0002\u0012g", "uKR<`uL_)z\b^<\bRAi\r(E-\u0001(\u0017T}\u000e'\u0004/Dco-;|\u0016;#'\"p0/\u00112h5\u0010eu8s,GJ]\u0002 C", "Ah]8", "\u001anZ6bu\u001bc\u001a\u007fzk,{v3n\u0006}", "uK^8\\6\b0)\u007f{^9|\b\u001di\t.Q'\u0006\u0013(C9\u00158\u007f'~Cz%7k%\u0004\u00114", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?6]", "3mR<W,\u001bg(~hm9\u0001\u00121", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u000b\u001d\u001bQ9jP\u0006%#h\u000b$@ok", "Asa2T4", "\u001aiPCTuB]bh\u000bm7\r\u0018\u001dt\r(wHV", "uKY.i(\bW#Hdn;\b\u0019>S\u000f5{<\tl}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011/%", "2dR<W,", "@dP1X9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u000b", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&Q\\\u000e8u%B/A\u0007<i'*\u0017J7t6g~ef9\u0005r\u0002", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u0003&S", "uKR<`uL_)z\b^<\bRAi\r(E+\u000e!&Q\\\u000e8u%B'JuzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "0xc2f", "uZ1u?1:d\u0015H\u0002Z5~R\u0019b\u0005(yOV", "uK^8\\6\b0-\u000ezL;\n\r8gUkbE|(\u0013\u0011v\nExn\u001fV\u0003 5|k", "And?V,", "\u001anZ6bu\u001bc\u001a\u007fzk,{v9u\r&{\u0016", "uK^8\\6\b0)\u007f{^9|\b\u001do\u00105y@VZ}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011", "Bqh\u0011X*HR\u0019", "2dbA\\5:b\u001d\t\u0004", "", "\u001aiPCTuB]bb\u0004i<\fv>r\u007f$\u0004\u0016", "uKY.i(\bW#H^g7\r\u0018\u001dt\r(wHVZ}Lk\u001f8@,1b\u007fi!j\u001b.KR\u0011", "BnBAe0GU", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~G\r-;v\u0018\u0004", "Ehc5?(;S ", ":`Q2_", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017wKo\u0015;5\f1V}'\r", "Ehc5?(;S =\rb9|\u0003<u\t7\u007fH\u0001", "/r?.V2>R", "/rA2c,:b\u0019}", "7rBAe<<b", "", "7rBAe<<bW\u0011~k,v\u0016?n\u000f,\u0004@", "u(I", "\u0013md:66Ga(z\u0004m\u0015\u0007\u0018\u0010o\u00101z \u0014\u0015\u0017R~\u0012F\u007f", "\u0011n\\=T5B]\"", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
public abstract class ProtoAdapter<E> {
    public static final ProtoAdapter<Boolean> BOOL;
    public static final ProtoAdapter<Boolean> BOOL_VALUE;
    public static final ProtoAdapter<ByteString> BYTES;
    public static final ProtoAdapter<ByteString> BYTES_VALUE;
    public static final Companion Companion = new Companion(null);
    public static final ProtoAdapter<Double> DOUBLE;
    public static final ProtoAdapter<double[]> DOUBLE_ARRAY;
    public static final ProtoAdapter<Double> DOUBLE_VALUE;
    public static final ProtoAdapter<Duration> DURATION;
    public static final ProtoAdapter<Unit> EMPTY;
    public static final ProtoAdapter<Integer> FIXED32;
    public static final ProtoAdapter<int[]> FIXED32_ARRAY;
    public static final ProtoAdapter<Long> FIXED64;
    public static final ProtoAdapter<long[]> FIXED64_ARRAY;
    public static final ProtoAdapter<Float> FLOAT;
    public static final ProtoAdapter<float[]> FLOAT_ARRAY;
    public static final ProtoAdapter<Float> FLOAT_VALUE;
    public static final ProtoAdapter<Instant> INSTANT;
    public static final ProtoAdapter<Integer> INT32;
    public static final ProtoAdapter<int[]> INT32_ARRAY;
    public static final ProtoAdapter<Integer> INT32_VALUE;
    public static final ProtoAdapter<Long> INT64;
    public static final ProtoAdapter<long[]> INT64_ARRAY;
    public static final ProtoAdapter<Long> INT64_VALUE;
    public static final ProtoAdapter<Integer> SFIXED32;
    public static final ProtoAdapter<int[]> SFIXED32_ARRAY;
    public static final ProtoAdapter<Long> SFIXED64;
    public static final ProtoAdapter<long[]> SFIXED64_ARRAY;
    public static final ProtoAdapter<Integer> SINT32;
    public static final ProtoAdapter<int[]> SINT32_ARRAY;
    public static final ProtoAdapter<Long> SINT64;
    public static final ProtoAdapter<long[]> SINT64_ARRAY;
    public static final ProtoAdapter<String> STRING;
    public static final ProtoAdapter<String> STRING_VALUE;
    public static final ProtoAdapter<List<?>> STRUCT_LIST;
    public static final ProtoAdapter<Map<String, ?>> STRUCT_MAP;
    public static final ProtoAdapter STRUCT_NULL;
    public static final ProtoAdapter<Object> STRUCT_VALUE;
    public static final ProtoAdapter<Integer> UINT32;
    public static final ProtoAdapter<int[]> UINT32_ARRAY;
    public static final ProtoAdapter<Integer> UINT32_VALUE;
    public static final ProtoAdapter<Long> UINT64;
    public static final ProtoAdapter<long[]> UINT64_ARRAY;
    public static final ProtoAdapter<Long> UINT64_VALUE;
    private final FieldEncoding fieldEncoding;
    private final E identity;
    private final ProtoAdapter<List<E>> packedAdapter;
    private final ProtoAdapter<List<E>> repeatedAdapter;
    private final String sourceFile;
    private final Syntax syntax;
    private final KClass<?> type;
    private final String typeUrl;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯĿ\u0014D57\u001eq\u007fR܀kt\nB\u000e0!.J~0N\u001aw\rjr9FDm߉6Ri*\u0017ӆ\u00044:[,ڎK;c&\u0006̝\u0011OdgoñRZ!C\u0017إ\u001ex\u0001,Qǁ\u0001](\u000f:BuB;M}FAś|6\u0013&:Ĳ@y\u0013\u0014\"*N\u0017~zQR\u0014۵8@~NZ\rS\f\"\u0012\u0014C(ҵ&\\u`>ԟt]H3+ɅqB\\8gܞ\u0005M#F\\'\u0013vi\u001e9@?5\u001b%[\u0003\u0015pcΪ\u000b?\u007f<\rh-03I\nW>X\u0016\u0014\u001dۀW\rsr.\\\u001bQh\f-+UұLfʫXw)zE;^N\r-HͶ1\u001cl\b\u001c4=3aBh\u0014nP\u0010\u0007q8'%F8;;+f\u0018gi\u001d|:\u001c\u0007\u0013\u001d1\u0006\u000f#aT\u001cfE%b~i7aBMH\u0015\u000f\b@\u001e\u000e~j\u001a0\u00142W\u007fu\u0002?1]*\u007f\"G,9q\u0012JTg=\u000f\u000fks{XGN,\u0017\"G,\u0019\f!Nt\u0007{P\u001bdZ\u001cm.Z\u0007\f\u0014;,lyL!k\u001a^Qxi1Y\f\u0017U9tEqt{\u0010g9%=c`*\u0015*!\u0005\u001dWBr\u0007hf\t]:]|:(1Vt8\u0004\fF^\fY<Os,4r=Gg5Z\t\u001ePM%\u0015o\\x\u0010E^C&\u0013ij\u00017\u000e\u0001f~}\u007f~Y.\r`h7o`e\u001d4e:hb\u000ei\fGJ\u000eP\u007fRWN|\u0016<_*#6,?P=G;\u001b\u000f+B\u0002sO\\tuQ\u0014\u001eU\u0006\u001d\f\u0015;v:\u0010\u0014zr<`1T_V'\"=j!08n\u000e\byL\u000bIsTQelX#\u0007gLf8+\u0016O\"3\u0013\b\"+HsHo}$\u0001,5%cmi68(e/8zd\u00126\f\"\u007fda]xEHKi~\u0005.Rw#TNj\u0006\u0014j\u0015D\u000fCH\bn\u0001XHMQ;,s76\u001b~naJ\u0015\u007f}z8\u000e9$G\f$vCS\"}Wu\u007f\u0006K\u000b\u001ez\u0015\u0018\u001f\u00143\u0005\u0011JRf[ \u0007\u0017F\u001ey(8Q;)\u001dj D:2;\u0016#kT\u0018\u001f@\u0005\u000eTw\u0015'4Rs\u0002n<c?a\u001fs\u0013z]f1,\u0011~U=L{U?\u000blT^WkB\u0001Y\u001e\u0019\u001bpP-qU/RoQ\u001bnbG\u0010\u0558aCW\u001e~$UC\u0006q\u007f\u000eH\u0018C'p\u001b;;W\u0010m\u0001`h\u0019c|Ttx\"f\u0019XP8E\u007fE J$'\u000f)Oxp\u00110|R\u0006T[\u001a/(\u000b.O(\u000b}^\u001f=\u0006;.kL\u001b\u00185\u0019oSi\u000f8&.;\u001cv7[\u0006#-\u000f./H4\n\u001cr\u0004\u0019\u0013~?21\u0001xI˞0ĝ:O\n֯R'ly\u0004}1B7+\u001b'pN\u001f|`ɰn̼rU\u0013ӆ7Ed\u001c\u00073`\u001f\u0019'{QA[\u0011>g֮\"Ǩ\u0015\u007f\u001cݻv3D,z/ Qsh\u001f\r}^C/\u0006ռ,Հ50ZʴN3\b\u001b\u001c0d*%;\u0005plg?`C܈Yеbj0˯E 7:\u0015\u0005X`!\u0013bg!!\u001b3\u000eا!˝\u0011GhԂTYWM97bA+7`.\u001e+-\u0015Y̔d߰\u0004*JռC\u0014uTELd?*'\bE\u001cg9*\"ԟ:ܥ\f,\u0019ÀaCha8Dl\u001c,;\u007fVo\u001cG\u0005kƑ\b˲\u000b\u0019=շ\"g3T\u0019\u0003\u0011\u000fOy_\rhvmvyˌ\u0011Θ\u001fWnծuIsw?\u0012\u0012gZ~{\u0007\u0005\u0012\u00180 ˇGɭ}UH\u0094Z32P\u001e{3\u0002U1vW\u000e_vZJӚ\u0006ڲ.6vޏs[z'\f\u0010<k(s\u0013\u000b\u00107w~jԔFĎ.-t؋\u0016av*#J\u001dG$7=3W6M\u0001fމŝ/Izى\u007fpkm+y\u0014<Bad)uC\u0010.\\Д\u0014̊gjr҃\"s\u001ej*\u0013\u001d\u0006\b1\u0001\u000e.cS\u001c}֗x̒:\\\u0001\u0090\u0012v\u0019s'*n0R\f95D1~\u001bXѲL\u0099\u0019\u0013;ʺDUUFn\u00021\u001f![S3Sj!K\u0016ާsٌA9;َ>^fj}b\u0015W1K\u0013ZC\u0003!/\u0005ܠXð\u001e*`ƙ^Yr~(J\tF8m^]^S5^\u001aס\u0003\u0097#=]ǝ6\u0013@\u001aOat\u0013;7\u0006\u001e\u0001XY1Oߗ\u0005ߓE\u0019\u001bǺngGj;y\u001d3N{6\u0016wX3q ʥ\u0005˔N!7Φ\u0010CO\u0006\u0005\\uA)Wm::#](\\٨&\u008ek\u0013qپrs\u0011\tN\\9J[Y?$pmE~Kޣ0ۢ<U\u000e۳V%pZMAoB<.\u001fHuR!\u007f\u0001ڤqѸxYUҗ{\n'~Iw!e__B0\u007f_\u000fBmϲ(Į\u0017\u0002\"ܮvu\n\u000bA6'Wsm\u0019\u0005\u0003cG]\u000bɑ2ټ}rnͣ\u000fwL\u007f`r)h_}I\u0016re?dGֻCŹfl4ȯ\u0007hx^\u0019\u0013[o' GF\u0007#\u0016DJ\"g#i\\SKx\tDn8߇\u0017ٛa3>ŧ@F\u000b[\u001dJvz\u0014r\u0015M6\u0005\u0002.`\u000e\tCR11°oȼ\f*\u0016ۨM\u001b:7kZay/tz}QgHD\u000e=\u001e̞\u0015ћ\u001d<\u0010ȏ\u001en\t9pd52\f\b5\u0011pzcowwRّYƖS4eϰy\u0014wC8\u0015{\u0016\u0014e`\"}'\u0011\u0014\u00142$ȇ\tƥ@YIӈZ87p \u001d7\u0006X6`1P\\/\u0012l\u001c!ըpޓ)\tm\u05c8\u007f\u000b\u0004[JuNwv_}3oj\u0004`5I\u0004ÒsۻOIuȚ{]\u001c\u0018.B_P}wq<\u0003C`\n&\b\b֑uԾ_B\u001fܓXxB;R\u0004W\u0007$la-H{\u0015q#z'ݕ\u0012Ĝ\u001a\r\u001c؊\u000f\n7sX-odw\u0002Q\b\u001f>eT{haӆ\u0013܃d2Fҁ_^f8&#\u0012\t[f0\u0015gd'C\u0002\u00192߶iЪU\"oɵ<>=\\\u0010\u001eF!\u00107O\f\"a\r8\u001eb_Ե%Ǣ+nWȫBF@\u001bub03k\n$I\u0015\u000e~\u0010w\u000bCͫxƲv\u0017GʏRBSv5Mu\u001fw\tdB$]G*\u0013}Tr2Б)ީ\u0002\u0006)Ú\u00127$e<\u0012\u0010zk8}Ni@'l:\u001dy2^é\u0007\u0087P\u0005=Ǫ҇5\u001b"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B\u0018[*?x\u00127QMDA", "", "\nh]6g\u0005", "u(E", "<df\u001aT7\u001aR\u0015\n\n^9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "", "\u0019", "$", "9dh\u000eW(Ib\u0019\f", "D`[BX\b=O$\u000ezk", "<df\u001aX:LO\u001b~V](\b\u0018/r", "\u001b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013Ioc", "\u0010", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqc@\u000f%\u0013IoL\u0019\u0007)<X}-\r", "Bx_2", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "Bx_2H9E", "", "Ax]AT?", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqiT\n&\u0013ZE", "1kP@f\u0013HO\u0018~\b", "\u001aiPCTuEO\"\u0001D<3x\u0017=L\n$z@\u000el", "<df\u0012a<F/\u0018z\u0006m,\n", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq[I\u0011\u001frFk\u0019Kv2\u000b", "\u0013", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqmD\u000e\u0017vP\u007f\u0016\u0012", "5dc", ";db@T.>", "uKR<`uL_)z\b^<\bRAi\r(E(\u0001%%Cq\u000e\u0012:\f3c\u0006iEy&*ZCKv}0\u0019ua\u0003qp6]\u0001\u0003FHY;\\_H", "/cP=g,KA(\f~g.", "\u0010N>\u0019", "", "\u0017MC\u007f%", "", "\u0017MC\u007f%&\u001a@\u0006Zn", "", "#H=!&x", "#H=!&x8/\u0006kVR", "!H=!&x", "!H=!&x8/\u0006kVR", "\u0014HG\u00127y\u000b", "\u0014HG\u00127y\u000bMtkg: ", "!E8%8\u000b\f ", "!E8%8\u000b\f \u0013ZgK\bp", "\u0017MC\u0003'", "", "\u0017MC\u0003'&\u001a@\u0006Zn", "", "#H=!)z", "#H=!)z8/\u0006kVR", "!H=!)z", "!H=!)z8/\u0006kVR", "\u0014HG\u00127|\r", "\u0014HG\u00127|\rMtkg: ", "!E8%8\u000b\u000f\"", "!E8%8\u000b\u000f\"\u0013ZgK\bp", "\u0014K>\u000eG", "", "\u0014K>\u000eG&\u001a@\u0006Zn", "", "\u0012ND\u000f?\f", "", "\u0012ND\u000f?\f8/\u0006kVR", "", "\u0010XC\u0012F", "\u001anZ6bu\u001bg(~hm9\u0001\u00121;", "!SA\u0016A\u000e", "\u0013L?!L", "", "!SA\"6\u001b8;ti", "!SA\"6\u001b8:|li", "", "!SA\"6\u001b8<\tea", "", "!SA\"6\u001b8Dtej>", "\u0012ND\u000f?\f8Dtej>", "\u0014K>\u000eG&//\u007fnZ", "\u0017MC\u0003'&//\u007fnZ", "#H=!)z8Dtej>", "\u0017MC\u007f%&//\u007fnZ", "#H=!&x8Dtej>", "\u0010N>\u0019R\u001d\u001a:\t^", "!SA\u0016A\u000e8Dtej>", "\u0010XC\u0012F&//\u007fnZ", "\u0012TA\u000eG\u0010(<", "\u001aiPCTuMW!~D=<\n\u0005>i\n1Q", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqZP\u000e\u0013&Ky\u0017\u0012", "\u0017MB!4\u0015-", "\u001aiPCTuMW!~DB5\u000b\u0018+n\u000f}", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fq_I\u000f&\u0013P~c", "#mbBc7H`(~yM@\b\t\u001ar\n7\u0006\u001c\u007f\u0013\"Vo\u001b", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u0016DLc\u0003\u0003I\u00066\u00106B\u0015\"4\u0012\u000e\u0007nj?0Le^.ZS@\u000fsڔJř\f*\u0002EKUH}P\b\u0010S˗kpP[\u0019EW\u0014${\u0003,wU)a \u0013JB\u001e?ya8KGe\r63 b&F}\u001d\u0001H*\u000f$?\u0011QQ$\u0012^@!>`\u0014e\u0005H\u001a6B.\u00056\\\u0016N|\\5sH5;\u0003\u0018B~+m7\u0015M;O\u0005+\u001bzy\u001eY@}I]3a\r\u001fR\n?3C\u007fH\u001dhU3q]<eDb\u0018\u0014C+\u007f\u0011k}>\\3^' ˕/]"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B\u0018[*?x\u00127QMD*$'#xlD\u0011p;Nu\u0016[WN\u0017i\\\u0002Go\u0011V\u0019]+\u001aZ", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B/", "", "\nh]6g\u0005", "u(E", "@dS.V;", "D`[BX", "3mR<W,=A\u001d\u0014z", "3mR<W,", "EqXAX9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!9|\u0012Kv2\u000b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqh@\u0012\u0017$UoxI\u00014?K\u000b$Fm#\u0004", "2dR<W,", "@dP1X9", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u000b", "\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!4o\n;v2\u0003&S", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
        public static final class UnsupportedTypeProtoAdapter extends ProtoAdapter {
            public UnsupportedTypeProtoAdapter() {
                super(FieldEncoding.LENGTH_DELIMITED, (KClass<?>) Reflection.getOrCreateKotlinClass(Void.class));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader32 reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void decode(ProtoReader reader) {
                Intrinsics.checkNotNullParameter(reader, "reader");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void encode(ProtoWriter writer, Void value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void encode(ReverseProtoWriter writer, Void value) {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public /* bridge */ /* synthetic */ int encodedSize(Object obj) {
                return ((Number) encodedSize((Void) obj)).intValue();
            }

            public Void encodedSize(Void value) {
                Intrinsics.checkNotNullParameter(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Void redact(Void value) {
                Intrinsics.checkNotNullParameter(value, "value");
                throw new IllegalStateException("Operation not supported.");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final <M extends Message<?, ?>> ProtoAdapter<M> get(M message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return get(message.getClass());
        }

        @JvmStatic
        public final <M> ProtoAdapter<M> get(Class<M> type) {
            Intrinsics.checkNotNullParameter(type, "type");
            try {
                Object obj = type.getField("ADAPTER").get(null);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<M of com.squareup.wire.ProtoAdapter.Companion.get>");
                return (ProtoAdapter) obj;
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("failed to access " + type.getName() + "#ADAPTER", e2);
            } catch (NoSuchFieldException e3) {
                throw new IllegalArgumentException("failed to access " + type.getName() + "#ADAPTER", e3);
            }
        }

        @JvmStatic
        public final ProtoAdapter<?> get(String adapterString) {
            Intrinsics.checkNotNullParameter(adapterString, "adapterString");
            return get(adapterString, ProtoAdapter.class.getClassLoader());
        }

        @JvmStatic
        public final ProtoAdapter<?> get(String adapterString, ClassLoader classLoader) {
            Intrinsics.checkNotNullParameter(adapterString, "adapterString");
            try {
                int iIndexOf$default = StringsKt.indexOf$default((CharSequence) adapterString, '#', 0, false, 6, (Object) null);
                String strSubstring = adapterString.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                String strSubstring2 = adapterString.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                Object obj = Class.forName(strSubstring, true, classLoader).getField(strSubstring2).get(null);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                return (ProtoAdapter) obj;
            } catch (ClassNotFoundException e2) {
                throw new IllegalArgumentException("failed to access " + adapterString, e2);
            } catch (IllegalAccessException e3) {
                throw new IllegalArgumentException("failed to access " + adapterString, e3);
            } catch (NoSuchFieldException e4) {
                throw new IllegalArgumentException("failed to access " + adapterString, e4);
            }
        }

        @JvmStatic
        public final <E extends WireEnum> EnumAdapter<E> newEnumAdapter(Class<E> type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new RuntimeEnumAdapter(type);
        }

        @JvmStatic
        public final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> keyAdapter, ProtoAdapter<V> valueAdapter) {
            Intrinsics.checkNotNullParameter(keyAdapter, "keyAdapter");
            Intrinsics.checkNotNullParameter(valueAdapter, "valueAdapter");
            return new MapProtoAdapter(keyAdapter, valueAdapter);
        }

        @JvmStatic
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return ReflectionKt.createRuntimeMessageAdapter$default(type, null, Syntax.PROTO_2, null, false, 24, null);
        }

        @JvmStatic
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type, String typeUrl) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(typeUrl, "typeUrl");
            return ReflectionKt.createRuntimeMessageAdapter$default(type, typeUrl, Syntax.PROTO_2, null, false, 24, null);
        }

        @JvmStatic
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type, String typeUrl, Syntax syntax) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(typeUrl, "typeUrl");
            Intrinsics.checkNotNullParameter(syntax, "syntax");
            return ReflectionKt.createRuntimeMessageAdapter$default(type, typeUrl, syntax, null, false, 24, null);
        }

        @JvmStatic
        public final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> type, String typeUrl, Syntax syntax, ClassLoader classLoader) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(typeUrl, "typeUrl");
            Intrinsics.checkNotNullParameter(syntax, "syntax");
            return ReflectionKt.createRuntimeMessageAdapter$default(type, typeUrl, syntax, classLoader, false, 16, null);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000b<H\u0007Ӭ4\u0012\u000e\u0007nj?0Le^.ZS0\u000f\u0002ڔd(\n#ZC\u001aUZ\u00192\r]O\u007fg\u001dLj\u0015Q\u0012\u001e\u001c\tj2Jkw\f\u0016Ƥ6DuDAS0X?t\u0005:\u0013!J\"f{\u0015\t(-`\u0014\u0007zIL:\u0019ضDr@W\u001bUU( \u0007V / \u0013k%ȬJǰa:7݊ɮmK"}, d2 = {"\u001ab^:\":Jc\u0015\fzn7F\u001b3r\u007fqfM\u000b&!#n\nG\u0006%B\u0018])Gus8VQJg=-}rp\u001a\u0011s5MV:ELY;`\\{\u0013", "\u001aiPCTuEO\"\u0001DB3\u0004\t1a\u0007\u0004\tB\u0011\u001f\u0017P~mOt%@h\u0002*@C", "\u001aj^A_0G\u001d|\u0006\u0002^.x\u0010\u000br\u00028\u0004@\n&vZm\u000eG\u0006)?bS", "D`[BX", "", "Bx_2", "\u001aj^A_0G\u001d&~{e,z\u0018xK]/wN\u000fl", "\nh]6g\u0005", "uH;8b;EW\"H\b^-\u0004\t-tI\u000eYG|%%\u001d3~", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "uH;7T=:\u001d z\u0004`uZ\u0010+s\u000e}?1", "Eha2 9N\\(\u0003\u0003^"}, k = 1, mv = {2, 0, 0}, pn = "", xi = 48, xs = "")
    public static final class EnumConstantNotFoundException extends IllegalArgumentException {
        public final int value;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public EnumConstantNotFoundException(int i2, Class<?> type) {
            this(i2, (KClass<?>) JvmClassMappingKt.getKotlinClass(type));
            Intrinsics.checkNotNullParameter(type, "type");
        }

        public EnumConstantNotFoundException(int i2, KClass<?> kClass) {
            Class javaClass;
            super("Unknown enum tag " + i2 + " for " + ((kClass == null || (javaClass = JvmClassMappingKt.getJavaClass((KClass) kClass)) == null) ? null : javaClass.getName()));
            this.value = i2;
        }
    }

    static {
        Companion.UnsupportedTypeProtoAdapter unsupportedTypeProtoAdapter;
        Companion.UnsupportedTypeProtoAdapter unsupportedTypeProtoAdapter2;
        ProtoAdapter<Boolean> protoAdapterCommonBool = ProtoAdapterKt.commonBool();
        BOOL = protoAdapterCommonBool;
        ProtoAdapter<Integer> protoAdapterCommonInt32 = ProtoAdapterKt.commonInt32();
        INT32 = protoAdapterCommonInt32;
        INT32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonInt32);
        ProtoAdapter<Integer> protoAdapterCommonUint32 = ProtoAdapterKt.commonUint32();
        UINT32 = protoAdapterCommonUint32;
        UINT32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonUint32);
        ProtoAdapter<Integer> protoAdapterCommonSint32 = ProtoAdapterKt.commonSint32();
        SINT32 = protoAdapterCommonSint32;
        SINT32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonSint32);
        ProtoAdapter<Integer> protoAdapterCommonFixed32 = ProtoAdapterKt.commonFixed32();
        FIXED32 = protoAdapterCommonFixed32;
        FIXED32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonFixed32);
        ProtoAdapter<Integer> protoAdapterCommonSfixed32 = ProtoAdapterKt.commonSfixed32();
        SFIXED32 = protoAdapterCommonSfixed32;
        SFIXED32_ARRAY = new IntArrayProtoAdapter(protoAdapterCommonSfixed32);
        ProtoAdapter<Long> protoAdapterCommonInt64 = ProtoAdapterKt.commonInt64();
        INT64 = protoAdapterCommonInt64;
        INT64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonInt64);
        ProtoAdapter<Long> protoAdapterCommonUint64 = ProtoAdapterKt.commonUint64();
        UINT64 = protoAdapterCommonUint64;
        UINT64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonUint64);
        ProtoAdapter<Long> protoAdapterCommonSint64 = ProtoAdapterKt.commonSint64();
        SINT64 = protoAdapterCommonSint64;
        SINT64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonSint64);
        ProtoAdapter<Long> protoAdapterCommonFixed64 = ProtoAdapterKt.commonFixed64();
        FIXED64 = protoAdapterCommonFixed64;
        FIXED64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonFixed64);
        ProtoAdapter<Long> protoAdapterCommonSfixed64 = ProtoAdapterKt.commonSfixed64();
        SFIXED64 = protoAdapterCommonSfixed64;
        SFIXED64_ARRAY = new LongArrayProtoAdapter(protoAdapterCommonSfixed64);
        FloatProtoAdapter floatProtoAdapterCommonFloat = ProtoAdapterKt.commonFloat();
        FLOAT = floatProtoAdapterCommonFloat;
        FLOAT_ARRAY = new FloatArrayProtoAdapter(floatProtoAdapterCommonFloat);
        DoubleProtoAdapter doubleProtoAdapterCommonDouble = ProtoAdapterKt.commonDouble();
        DOUBLE = doubleProtoAdapterCommonDouble;
        DOUBLE_ARRAY = new DoubleArrayProtoAdapter(doubleProtoAdapterCommonDouble);
        ProtoAdapter<ByteString> protoAdapterCommonBytes = ProtoAdapterKt.commonBytes();
        BYTES = protoAdapterCommonBytes;
        ProtoAdapter<String> protoAdapterCommonString = ProtoAdapterKt.commonString();
        STRING = protoAdapterCommonString;
        EMPTY = ProtoAdapterKt.commonEmpty();
        STRUCT_MAP = ProtoAdapterKt.commonStructMap();
        STRUCT_LIST = ProtoAdapterKt.commonStructList();
        STRUCT_NULL = ProtoAdapterKt.commonStructNull();
        STRUCT_VALUE = ProtoAdapterKt.commonStructValue();
        DOUBLE_VALUE = ProtoAdapterKt.commonWrapper(doubleProtoAdapterCommonDouble, "type.googleapis.com/google.protobuf.DoubleValue");
        FLOAT_VALUE = ProtoAdapterKt.commonWrapper(floatProtoAdapterCommonFloat, "type.googleapis.com/google.protobuf.FloatValue");
        INT64_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonInt64, "type.googleapis.com/google.protobuf.Int64Value");
        UINT64_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonUint64, "type.googleapis.com/google.protobuf.UInt64Value");
        INT32_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonInt32, "type.googleapis.com/google.protobuf.Int32Value");
        UINT32_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonUint32, "type.googleapis.com/google.protobuf.UInt32Value");
        BOOL_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonBool, "type.googleapis.com/google.protobuf.BoolValue");
        STRING_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonString, "type.googleapis.com/google.protobuf.StringValue");
        BYTES_VALUE = ProtoAdapterKt.commonWrapper(protoAdapterCommonBytes, "type.googleapis.com/google.protobuf.BytesValue");
        try {
            unsupportedTypeProtoAdapter = ProtoAdapterKt.commonDuration();
        } catch (NoClassDefFoundError unused) {
            unsupportedTypeProtoAdapter = new Companion.UnsupportedTypeProtoAdapter();
        }
        DURATION = unsupportedTypeProtoAdapter;
        try {
            unsupportedTypeProtoAdapter2 = ProtoAdapterKt.commonInstant();
        } catch (NoClassDefFoundError unused2) {
            unsupportedTypeProtoAdapter2 = new Companion.UnsupportedTypeProtoAdapter();
        }
        INSTANT = unsupportedTypeProtoAdapter2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type) {
        this(fieldEncoding, (KClass<?>) JvmClassMappingKt.getKotlinClass(type));
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type, String str) {
        this(fieldEncoding, (KClass<?>) JvmClassMappingKt.getKotlinClass(type), str, Syntax.PROTO_2);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type, "type");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type, String str, Syntax syntax) {
        this(fieldEncoding, (KClass<?>) JvmClassMappingKt.getKotlinClass(type), str, syntax);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type, String str, Syntax syntax, E e2) {
        this(fieldEncoding, (KClass<?>) JvmClassMappingKt.getKotlinClass(type), str, syntax, e2, (String) null);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, Class<?> type, String str, Syntax syntax, E e2, String str2) {
        this(fieldEncoding, (KClass<?>) JvmClassMappingKt.getKotlinClass(type), str, syntax, e2, str2);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, KClass<?> kClass) {
        this(fieldEncoding, kClass, (String) null, Syntax.PROTO_2);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, KClass<?> kClass, String str) {
        this(fieldEncoding, kClass, str, Syntax.PROTO_2);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, KClass<?> kClass, String str, Syntax syntax) {
        this(fieldEncoding, kClass, str, syntax, (Object) null);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProtoAdapter(FieldEncoding fieldEncoding, KClass<?> kClass, String str, Syntax syntax, E e2) {
        this(fieldEncoding, kClass, str, syntax, e2, (String) null);
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
    }

    public ProtoAdapter(FieldEncoding fieldEncoding, KClass<?> kClass, String str, Syntax syntax, E e2, String str2) {
        PackedProtoAdapter packedProtoAdapter;
        Intrinsics.checkNotNullParameter(fieldEncoding, "fieldEncoding");
        Intrinsics.checkNotNullParameter(syntax, "syntax");
        this.fieldEncoding = fieldEncoding;
        this.type = kClass;
        this.typeUrl = str;
        this.syntax = syntax;
        this.identity = e2;
        this.sourceFile = str2;
        boolean z2 = this instanceof PackedProtoAdapter;
        RepeatedProtoAdapter repeatedProtoAdapter = null;
        if (z2 || (this instanceof RepeatedProtoAdapter) || fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            packedProtoAdapter = null;
        } else {
            if (getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
                throw new IllegalArgumentException("Unable to pack a length-delimited type.".toString());
            }
            packedProtoAdapter = new PackedProtoAdapter(this);
        }
        this.packedAdapter = packedProtoAdapter;
        if (!(this instanceof RepeatedProtoAdapter) && !z2) {
            repeatedProtoAdapter = new RepeatedProtoAdapter(this);
        }
        this.repeatedAdapter = repeatedProtoAdapter;
    }

    public /* synthetic */ ProtoAdapter(FieldEncoding fieldEncoding, KClass kClass, String str, Syntax syntax, Object obj, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fieldEncoding, (KClass<?>) kClass, str, syntax, (i2 + 16) - (16 | i2) != 0 ? null : obj, (i2 & 32) == 0 ? str2 : null);
    }

    @JvmStatic
    public static final <M extends Message<?, ?>> ProtoAdapter<M> get(M m2) {
        return Companion.get(m2);
    }

    @JvmStatic
    public static final <M> ProtoAdapter<M> get(Class<M> cls) {
        return Companion.get(cls);
    }

    @JvmStatic
    public static final ProtoAdapter<?> get(String str) {
        return Companion.get(str);
    }

    @JvmStatic
    public static final ProtoAdapter<?> get(String str, ClassLoader classLoader) {
        return Companion.get(str, classLoader);
    }

    @JvmStatic
    public static final <E extends WireEnum> EnumAdapter<E> newEnumAdapter(Class<E> cls) {
        return Companion.newEnumAdapter(cls);
    }

    @JvmStatic
    public static final <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return Companion.newMapAdapter(protoAdapter, protoAdapter2);
    }

    @JvmStatic
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls) {
        return Companion.newMessageAdapter(cls);
    }

    @JvmStatic
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str) {
        return Companion.newMessageAdapter(cls, str);
    }

    @JvmStatic
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str, Syntax syntax) {
        return Companion.newMessageAdapter(cls, str, syntax);
    }

    @JvmStatic
    public static final <M extends Message<M, B>, B extends Message.Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls, String str, Syntax syntax, ClassLoader classLoader) {
        return Companion.newMessageAdapter(cls, str, syntax, classLoader);
    }

    public final ProtoAdapter<List<E>> asPacked() {
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            throw new IllegalArgumentException("Unable to pack a length-delimited type.".toString());
        }
        ProtoAdapter<List<E>> protoAdapter = this.packedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        throw new UnsupportedOperationException("Can't create a packed adapter from a packed or repeated adapter.");
    }

    public final ProtoAdapter<List<E>> asRepeated() {
        ProtoAdapter<List<E>> protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        throw new UnsupportedOperationException("Can't create a repeated adapter from a repeated or packed adapter.");
    }

    public E decode(ProtoReader32 reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return decode(reader.asProtoReader());
    }

    public abstract E decode(ProtoReader protoReader) throws IOException;

    public final E decode(InputStream stream) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        return decode(Okio.buffer(Okio.source(stream)));
    }

    public final E decode(BufferedSource source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        return decode(new ProtoReader(source));
    }

    public final E decode(ByteString bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return decode(ProtoReader32Kt.ProtoReader32$default(bytes, 0, 0, 6, (Object) null));
    }

    public final E decode(byte[] bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return decode(ProtoReader32Kt.ProtoReader32$default(bytes, 0, 0, 6, (Object) null));
    }

    public abstract void encode(ProtoWriter protoWriter, E e2) throws IOException;

    public void encode(ReverseProtoWriter writer, E e2) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        writer.writeForward$wire_runtime(new ProtoAdapterKt.C11871(this, e2));
    }

    public final void encode(OutputStream stream, E e2) throws IOException {
        Intrinsics.checkNotNullParameter(stream, "stream");
        BufferedSink bufferedSinkBuffer = Okio.buffer(Okio.sink(stream));
        encode(bufferedSinkBuffer, e2);
        bufferedSinkBuffer.emit();
    }

    public final void encode(BufferedSink sink, E e2) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        ReverseProtoWriter reverseProtoWriter = new ReverseProtoWriter();
        encode(reverseProtoWriter, e2);
        reverseProtoWriter.writeTo(sink);
    }

    public final byte[] encode(E e2) throws IOException {
        Buffer buffer = new Buffer();
        encode(buffer, e2);
        return buffer.readByteArray();
    }

    public final ByteString encodeByteString(E e2) throws IOException {
        Buffer buffer = new Buffer();
        encode(buffer, e2);
        return buffer.readByteString();
    }

    public void encodeWithTag(ProtoWriter writer, int i2, E e2) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (e2 != null) {
            writer.writeTag(i2, getFieldEncoding$wire_runtime());
            if (getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
                writer.writeVarint32(encodedSize(e2));
            }
            encode(writer, e2);
        }
    }

    public void encodeWithTag(ReverseProtoWriter writer, int i2, E e2) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (e2 != null) {
            if (getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
                int byteCount = writer.getByteCount();
                encode(writer, e2);
                writer.writeVarint32(writer.getByteCount() - byteCount);
            } else {
                encode(writer, e2);
            }
            writer.writeTag(i2, getFieldEncoding$wire_runtime());
        }
    }

    public abstract int encodedSize(E e2);

    public int encodedSizeWithTag(int i2, E e2) {
        if (e2 == null) {
            return 0;
        }
        int iEncodedSize = encodedSize(e2);
        if (getFieldEncoding$wire_runtime() == FieldEncoding.LENGTH_DELIMITED) {
            iEncodedSize += ProtoWriter.Companion.varint32Size$wire_runtime(iEncodedSize);
        }
        return ProtoWriter.Companion.tagSize$wire_runtime(i2) + iEncodedSize;
    }

    public final FieldEncoding getFieldEncoding$wire_runtime() {
        return this.fieldEncoding;
    }

    public final E getIdentity() {
        return this.identity;
    }

    public final ProtoAdapter<List<E>> getPackedAdapter$wire_runtime() {
        return this.packedAdapter;
    }

    public final ProtoAdapter<List<E>> getRepeatedAdapter$wire_runtime() {
        return this.repeatedAdapter;
    }

    public final String getSourceFile() {
        return this.sourceFile;
    }

    public final Syntax getSyntax() {
        return this.syntax;
    }

    public final KClass<?> getType() {
        return this.type;
    }

    public final String getTypeUrl() {
        return this.typeUrl;
    }

    public final boolean isStruct$wire_runtime() {
        return Intrinsics.areEqual(this, STRUCT_MAP) || Intrinsics.areEqual(this, STRUCT_LIST) || Intrinsics.areEqual(this, STRUCT_VALUE) || Intrinsics.areEqual(this, STRUCT_NULL);
    }

    public abstract E redact(E e2);

    public String toString(E e2) {
        return String.valueOf(e2);
    }

    public final void tryDecode(ProtoReader32 reader, List<E> destination) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (reader.beforePossiblyPackedScalar()) {
            destination.add(decode(reader));
        }
    }

    public final void tryDecode(ProtoReader reader, List<E> destination) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (reader.beforePossiblyPackedScalar$wire_runtime()) {
            destination.add(decode(reader));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ProtoAdapter<?> withLabel$wire_runtime(WireField.Label label) {
        Intrinsics.checkNotNullParameter(label, "label");
        return label.isRepeated() ? label.isPacked() ? asPacked() : asRepeated() : this;
    }
}
