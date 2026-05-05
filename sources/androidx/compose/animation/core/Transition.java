package androidx.compose.animation.core;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.drew.metadata.exif.makernotes.PanasonicMakernoteDirectory;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
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
/* JADX INFO: compiled from: Transition.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яn\u001d<K!&˛\bDRш|İI\u0006F\u000b6Ȑ\u0007\":\u001e\u007f\u0007lkA0ZeP.XU2\u000f\u0002{<$q$yّCU(\u0005*\tUUog|hb\u000bI\u0013\u000e\u0016\u0007s4I[\fe\u0012%2JoEQUoK9ht<\u0011(20=\u0002\u0005\u0007\u001e2H&v\u0003CQ\u0015\u001a0VpBR\u0013Y\u000b\u001f(ßf\"\u0007Ȧjf~6vl\u0016@ǉ\"ɍhĲMϕ^p\u001cS\u001cV^5\u000e\u000fg.-P7kՖSU\u0013\u000fX[M\u0006WsS\u0004\u0017+ݳ/I\u0002\\vo\u0006\"%/]\u0013ur\\ؘ\u0015Wn\u000f?-ebyTˎ,w\t\u0003M[\n\u001d\u00161V/E v\n\u001e3+Ɂ\u0002H`\ndB\u000e}y8-$.7ڢ=\u001btZ\"h\u001f\u05cbG\u0006\u0013\u000e6)\u0011p1[\u000bו\u000f\u0017+^\u0006[IWP=NO XkЧ\u0014xh\u00028\u0007HI\u0016.*\u0015ѧ\u001b%Ef\u0002H/=\u001aHr\t'\u001bn;k{bHF#~\u0016=+7\u001a+Jt\u0007{P\u000bАZҊ\u0014ȼΤ\u000b}\u000efhs\u0006\u00119%>o\u007fpw@ea\u001a%5geժ5\u0088ް[9d\n}fqgyR%lo@pGpfxͭRYڅ,$8\"xj@\u0002R*$\u0013`O8\u001c|7?ut\u0015v[dՓ˩\u0001\te81\u0016\r3K$1BjtQ\f^<\to\u0016Q\u0010ؓʬd\"3\"\u001aP'\bm\"\u0017\r-'\u0015a\f\u007fuw|KZP.u\u0004\u001dfچ׀=Q5\"[*\r\u000bJ\u0002[\u001e|vs7e\u0012U\u000b-}\u001d\"\u0001.\u0016o1ѱݽdjP4\u001d\"0_vrQ`+р\u05fbeF\u00011,g\u0019FVI![\n@\\\u001e\u0015\u0005M.k˚Ȟ&|;\u0019\fL+\u0003\u0010\u0014]m\u0012sw]F\fr\u000f,uu\u00042dD^3Wm4K8\u007fʲ-Жhغк\u0007BNZ@-PuL\ra!qz~)P_\u001b/\u0004g\u0017,\u0013q\u0005i\u000b\u0019\u007f\u007fD.\u0016͈\"ʕDжڎG%\u0017=\u001c~{^c\\9k?\u0012\u0019QIr\"\u001cC!\u0005̰)־ޘ\ns\u001e(\nNpwT\tR\r\\@\u0016~[T\u0018mVÿķJ_\u0015\fzH\u00021n\u000e\u0003Q#V\u0011\u0018n<x!XY/\u0013AR\u00115_\u00154ۮߟ3c8x\u001c0\u0017\u0014\u0003O-?U/RNQ\u001bVSGՊ\u0558aCO}~*U&\u0006k\u001edh\u001c\u000b#Z\u0018Qʃ\u0002\u0015m9H^Aٝ\u0015Rr+*f\u0001^h.Ή~\u007f\u0014:\u0018ۈ\naV\u0001ŹaEL|{}Wb\u000e%װ(\u001f\f+<\rɑұ\n63֕H3+5ظVk;,`P$5F\r!\u0013ަTўŭa\u001e@ωp$(R-!\\8\u001c>^\u0005\u0005\u001a.\u000e7_\u00029\u0003Al*q\b#P'aˊ4לyuOƀeؼgn]̃S\u0010?g\u0012n[`M\r5\\F\u0013\u0007jpQ\u0012`/Ҽֶ\u0014ޞ*/>\nh?\u001ef{jv}]n--5\u007f8v\u0002F`6\u0016)\n{\u0014.d(\u001b<\u0005צlq_ϡnܣ[\u000efȥx\f\u0003%A,\r\u0013Xp!\u0013:G\u0003\u001ej0e'oa\u001dIp\u0007:ـw\u008eOK\t\u0004װ;6#q.\u0012\u001f\u001f\u000bq\u0003\u001dBB?ۂ6,ǋ1Jl? EgC>|\u0011FcEfc>qgÈ\u0013˲^B0@b<*^i5G=\u001f&eG\u0014\u0016\u001f\u0019c\f\b\u0018К.\u0005\u0015\u0003\u0013e\bV<c\u0002^\u000b#]0 \u001feuS%c\u0007\u0003lJA<ڋӼM\u07b2Z\u001fi.O_SI\u0012WF'\u0018DD&\f\u001e1)\u0016BV-w^VU\"[ǋ*0>˔\\%M\u0019\u0007!ZDwF\fd\nq\u000bТ\u0007\u008f\u001dPFϠEn\rt[{\u001a\rJ=S)\b&\u00143K\u001d\r\u0010UrV*wל\u00044ۺaB\u001bŎ\u001c<8\u0013D,\u0018bg^\u001e-@d\u0014nx!i_>HHRKIN١^ϵ\u0004j5\u001a-\u0001\u0005YV^~\u0004Ow[u\u001d\\v4R\u000e\u001b\u0006LǚvN2\bXo-\u0019CI\u0004A}̈\u00053WaO\u001c{̼Ɇg\u0095KO]s^zG^#oP\u0012C |\u0007[\\Y!{>\u000e)C.ufn\u001e8g\u001e\u000est~N\u00037\u001b٫ҡ0߳4`\u0007\\I\u001f\u000f37?[Ts\u0012Rd=\u001cr&{`e1jUYي)\u0006\u0011\u001fY\u0019IǺT\u0018wpyјԫ1Ĩ\u007f\u0018dK[C{t(\u0005g\u000e/N&A5\u0006Y2'~M`o?-\u001cVkzʮ٥$\u008ek\u001dq\u0010()\u0011\u0017NX/\u0011YlaxPk'\u0001\u0005\u000e>\fnˑ4?\\\u0089dɲ9;gގ|G~T_Yz\u0002:i\u007ffzZ{җY\u0010O\u0003қu\u0015{Qe`|m-\u0002Ldo&n42\u001e+5y{vJfW\u0014$D؍ԣTǞ\u0015i<m65\b\u001e~fD2Lahn\u001f6]'ݗUɍa"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "!", "", "BqP;f0MW#\bhm(\f\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\f$dp9\\", ":`Q2_", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'\u0003w]H\u00079\u0013Sr8C\u0016U(eT<+#\u001f^\u0017P\u0001Pu", "7mXA\\(EA(z\n^", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn#h\u000b$@okq>", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\bG|\u0012+TC*x0'#lp=\u0011l\u001a]r6G\"", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u001f}%*JJ;ZA\u001a\u001eveH\u000bm5<\u0006#VL$\u0013aN\u00049]\u0019V\u0017Ptz\u0014fE-p\u001az\u0010", ">`a2a;-`\u0015\b\tb;\u0001\u00138", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'\u0003w]H\u00079\u0013J\u007f&TVR+o\u001cpG\u001c\u001dd\u001cNt\t\u000e]I }HA(Q*S\u000f;2o\u0019\u0012\u0017Cn\u007fF`\u0019\u001d`\u001aqR%2MUh{\u0011/To.m\u000e5`M", "-`]6`(MW#\b\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001cEr0C\\\b/E7\u00047INIn>-\u0003w]H\u0007J0\\\u0006|", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\\u0004u]B\u0015g;R\u00010#UR4XavG\u001d\u007fi\n]+b", "\nrTA \u0006\u0017", "", "-o[.l\u001bB[\u0019gvg6\u000b", "5dc,c3:g\b\u0003\u0003^\u0015x\u00129s", "u(9", "Adc,c3:g\b\u0003\u0003^\u0015x\u00129s", "uI\u0018#", "-o[.l\u001bB[\u0019gvg6\u000bG.e\u0007(}<\u0010\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0007Av\u0018\u001c\\?Jk\n", "-sa.a:Bb\u001d\t\u0004l", "/mX:T;B]\"\r", "", "5dc\u000ea0FO(\u0003\u0005g:", "u(;7T=:\u001d)\u000e~euc\r=tU", "1ta?X5MA(z\n^", "5dc\u0010h9KS\"\u000ehm(\f\t", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "6`b\u0016a0MW\u0015\u0006kZ3\r\t\u000bn\u00040wO\u0005! U", "", "5dc\u0015T:\"\\\u001d\u000e~Z3m\u00056u\u007f\u0004\u0005D\t\u0013&Ky\u0017J5!>b\b/3|\u001a8VQ", "u(E", "5dc\u0015T:\"\\\u001d\u000e~Z3m\u00056u\u007f\u0004\u0005D\t\u0013&Ky\u0017J", "u(I", "7rABa5B\\\u001b", "7rB2X2B\\\u001b", "Adc X,DW\"\u00019Z5\u0001\u0011+t\u00042\u0005:~!$Gi\u001b<}%1g}", "uY\u0018#", "7rB2X2B\\\u001b=y^3|\u000b+t\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "5dc\u0019T)>Z", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", ":`bAF,>Y\u0019}ib4|q+n\n6", "5dc\u0019T:MA\u0019~\u0001^+k\r7eh$\u0005J\u000fU\u0013Ps\u00168\u0006)?bw\u001eAz\u0016(ZCBk0,\u0015", "Adc\u0019T:MA\u0019~\u0001^+k\r7eh$\u0005J\u000fU\u0013Ps\u00168\u0006)?bw\u001eAz\u0016(ZCBk0,\u0015", "5dc\u001dT9>\\(m\bZ5\u000b\r>i\n1", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\#*VQ?z8(\u001e>", "D`[BX", ">kPFG0FS\u0002z\u0004h:", "5dc\u001d_(RB\u001d\u0007zG(\u0006\u0013=", "Adc\u001d_(RB\u001d\u0007zG(\u0006\u0013=", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\\u0003hcA\u0007l;$", "AdV:X5M", "5dc X.FS\"\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\#*VQ?z8(\u001e'O9\tk,W\u0006|", "Adc X.FS\"\u000e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'SVa;\u000fc5]Lj8", "AdV:X5M\u0012\u0018~\u0002^.x\u0018/", "AsP?g\u001bB[\u0019gvg6\u000b", "5dc g(Kb\b\u0003\u0003^\u0015x\u00129s>$\u0005D\t\u0013&Ky\u00176t/BYw-7t\u0016*[C", "Adc g(Kb\b\u0003\u0003^\u0015x\u00129s>$\u0005D\t\u0013&Ky\u00176t/BYw-7t\u0016*[C", "AsP?g\u001bB[\u0019gvg6\u000bG.e\u0007(}<\u0010\u0017", "B`a4X;,b\u0015\u000ez", "5dc!T9@S(l\nZ;|", "Adc!T9@S(l\nZ;|G+n\u00040wO\u0005! Am\u0018Iv\u001fBY\u0005 3{\u0016", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "B`a4X;,b\u0015\u000ez\u001d+|\u0010/g{7{", "Bnc._\u000bN`\u0015\u000e~h5e\u00058o\u000e", "5dc!b;:Zw\u000f\bZ;\u0001\u00138N{1\u0006N", "Bnc._\u000bN`\u0015\u000e~h5e\u00058o\u000efz@\b\u0017\u0019C~\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "BqP;f0MW#\b\t", "5dc!e(Ga\u001d\u000e~h5\u000b", "CoS.g,\u001cV\u001d\u0006yk,\u0006q/e~(z", "5dc\"c+:b\u0019\\}b3{\u0016/nh({?\u0001\u0016", "Adc\"c+:b\u0019\\}b3{\u0016/nh({?\u0001\u0016", "CoS.g,\u001cV\u001d\u0006yk,\u0006q/e~(z~\u007f\u0017\u001eGq\nKv", "/cS\u000ea0FO(\u0003\u0005g", "/mX:T;B]\"", "/cS\u000ea0FO(\u0003\u0005gjx\u00123m{7\u007fJ\n\u0011\u0015Q|\u000e6\u0004%<Yy.7", "/cS!e(Ga\u001d\u000e~h5", "BqP;f0MW#\b", "/cS!e(Ga\u001d\u000e~h5;\u00058i\b$\u000bD\u000b \u0011Ey\u001b<p25`}\u001cEm", "/mX:T;>B#", "", "/mX:T;>B#=vg0\u0005\u0005>i\n1u>\u000b$\u0017A|\u000eCv!CY", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_;]LJo<\u001e^FkA\u0012m:N\u0004|+\u0010?", "1`[0h3:b\u0019m\u0005m(\u0004g?r{7\u007fJ\n\u007f\u0013Py\u001c", "1kT.e\u0010GW(\u0003ve\b\u0006\r7a\u000f,\u0006I\u000f", "1kT.e\u0010GW(\u0003ve\b\u0006\r7a\u000f,\u0006I\u000fU\u0013Ps\u00168\u0006)?bw\u001eAz\u0016(ZCBk0,\u0015", "=m25\\3=/\"\u0003\u0003Z;\u0001\u00138U\u000b'wO\u0001\u0016", "=m36f7Ha\u0019}", "=m36f7Ha\u0019}9Z5\u0001\u0011+t\u00042\u0005:~!$Gi\u001b<}%1g}", "=m5?T4>", "AbP9X+)Z\u0015\u0013ib4|q+n\n6", "AbP9X\u001bH3\"}", "=m5?T4>\u0012\u0015\b~f(\f\r9ny&\u0006M\u0001\u0011$Gv\u000e8\u0005%", "4qP:X\u001bB[\u0019gvg6\u000b", "2ta.g0H\\\u0007|ve,", "", "=mC?T5LW(\u0003\u0005g\f\u0006\b", "=mC?T5LW(\u0003\u0005g\f\u0006\bma\t,\u0004<\u0010\u001b!Pi\fF\u0004%/f}'7i$.", "=mC?T5LW(\u0003\u0005g\u001a\f\u0005<t", "=mC?T5LW(\u0003\u0005g\u001a\f\u0005<t>$\u0005D\t\u0013&Ky\u00176t/BYw-7t\u0016*[C", "@d\\<i,\u001a\\\u001d\u0007vm0\u0007\u0012", "2dU2e9>Rt\b~f(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\shb9\u0014p,MR0KTJ;`\\{\u0013", "@d\\<i,\u001a\\\u001d\u0007vm0\u0007\u0012ma\t,\u0004<\u0010\u001b!Pi\fF\u0004%/f}'7i$.", "@d\\<i,-`\u0015\b\tb;\u0001\u00138", "@d\\<i,-`\u0015\b\tb;\u0001\u00138${1\u007fH|&\u001bQx\b:\u000125S\u000b >m\u0012<M", "@db2g\bGW!z\nb6\u0006i<a}7\u007fJ\n", "4qP0g0H\\", "@db2g\bGW!z\nb6\u0006i<a}7\u007fJ\nU\u0013Ps\u00168\u0006)?bw\u001eAz\u0016(ZCBk0,\u0015", "@db2g\bGW!z\nb6\u0006\u0017", "AdT845B[\u0015\u000e~h5\u000b", "AdT845B[\u0015\u000e~h5\u000bG+n\u00040wO\u0005! Am\u0018Iv\u001fBY\u0005 3{\u0016", "Adc\u0016a0MW\u0015\u0006Vg0\u0005\u0005>i\n1\n", "/mX:T;B]\"l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000e7m\u001c*JJ;ZA\u001a\u001eveH\u000bm5<\u0006#VL\r\u001a\\RxA\u001d\u00146\u0017R3\t\u0014]K-\\S3.\b\u0002", "Adc\u0016a0MW\u0015\u0006Vg0\u0005\u0005>i\n1\n~| \u001bOk\u001d@\u0001./W\b-7g#.TC7y4", "Adc\u001d_(Rb\u001d\u0007z:-\f\t<I\t,\u000bD|\u001erPn|8\u0004'5hk/3|\u0016\u000e[R7h;\"#ka8", "AdT8", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0013\u00114", "BnBAe0GU", "CoS.g,\"\\\u001d\u000e~Z3m\u00056u\u007f6", "CoS.g,\"\\\u001d\u000e~Z3m\u00056u\u007f6:<\n\u001b\u001fC~\u0012F\u007f\u001f3c\u000b 1z\u00165M?Ik", "CoS.g,-O&\u0001zm", "CoS.g,-O&\u0001zmjx\u00123m{7\u007fJ\n\u0011\u0015Q|\u000e6\u0004%<Yy.7", "\u0012dU2e9>Rt\b~f(\f\r9n", "!dV:X5M", "!dV:X5M7!\n\u0002", "\"qP;f0MW#\bVg0\u0005\u0005>i\n1iO|&\u0017", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Transition<S> {
    public static final int $stable = 0;
    private final SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> _animations;
    private final MutableLongState _playTimeNanos$delegate;
    private final SnapshotStateList<Transition<?>> _transitions;
    private final MutableState isSeeking$delegate;
    private final String label;
    private long lastSeekedTimeNanos;
    private final Transition<?> parentTransition;
    private final MutableState segment$delegate;
    private final MutableLongState startTimeNanos$delegate;
    private final MutableState targetState$delegate;
    private final State totalDurationNanos$delegate;
    private final TransitionState<S> transitionState;
    private final MutableState updateChildrenNeeded$delegate;

    public static /* synthetic */ void getHasInitialValueAnimations$annotations() {
    }

    public Transition(TransitionState<S> transitionState, Transition<?> transition, String str) {
        this.transitionState = transitionState;
        this.parentTransition = transition;
        this.label = str;
        this.targetState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getCurrentState(), null, 2, null);
        this.segment$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new SegmentImpl(getCurrentState(), getCurrentState()), null, 2, null);
        this._playTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(0L);
        this.startTimeNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(Long.MIN_VALUE);
        this.updateChildrenNeeded$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this._animations = SnapshotStateKt.mutableStateListOf();
        this._transitions = SnapshotStateKt.mutableStateListOf();
        this.isSeeking$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.totalDurationNanos$delegate = SnapshotStateKt.derivedStateOf(new Function0<Long>(this) { // from class: androidx.compose.animation.core.Transition$totalDurationNanos$2
            final /* synthetic */ Transition<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                return Long.valueOf(this.this$0.calculateTotalDurationNanos());
            }
        });
        transitionState.transitionConfigured$animation_core_release(this);
    }

    public /* synthetic */ Transition(TransitionState transitionState, Transition transition, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(transitionState, transition, (i2 & 4) != 0 ? null : str);
    }

    public final Transition<?> getParentTransition() {
        return this.parentTransition;
    }

    public final String getLabel() {
        return this.label;
    }

    public /* synthetic */ Transition(TransitionState transitionState, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(transitionState, (-1) - (((-1) - i2) | ((-1) - 2)) != 0 ? null : str);
    }

    public Transition(TransitionState<S> transitionState, String str) {
        this(transitionState, null, str);
    }

    public Transition(S s2, String str) {
        this(new MutableTransitionState(s2), null, str);
    }

    public /* synthetic */ Transition(MutableTransitionState mutableTransitionState, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableTransitionState, (i2 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Transition(MutableTransitionState<S> mutableTransitionState, String str) {
        this(mutableTransitionState, null, str);
        Intrinsics.checkNotNull(mutableTransitionState, "null cannot be cast to non-null type androidx.compose.animation.core.TransitionState<S of androidx.compose.animation.core.Transition>");
    }

    public final S getCurrentState() {
        return this.transitionState.getCurrentState();
    }

    public final S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public final void setTargetState$animation_core_release(S s2) {
        this.targetState$delegate.setValue(s2);
    }

    private final void setSegment(Segment<S> segment) {
        this.segment$delegate.setValue(segment);
    }

    public final Segment<S> getSegment() {
        return (Segment) this.segment$delegate.getValue();
    }

    public final boolean isRunning() {
        return getStartTimeNanos$animation_core_release() != Long.MIN_VALUE;
    }

    private final long get_playTimeNanos() {
        return this._playTimeNanos$delegate.getLongValue();
    }

    private final void set_playTimeNanos(long j2) {
        this._playTimeNanos$delegate.setLongValue(j2);
    }

    public final long getPlayTimeNanos() {
        Transition<?> transition = this.parentTransition;
        return transition != null ? transition.getPlayTimeNanos() : get_playTimeNanos();
    }

    public final void setPlayTimeNanos(long j2) {
        if (this.parentTransition == null) {
            set_playTimeNanos(j2);
        }
    }

    public final long getStartTimeNanos$animation_core_release() {
        return this.startTimeNanos$delegate.getLongValue();
    }

    public final void setStartTimeNanos$animation_core_release(long j2) {
        this.startTimeNanos$delegate.setLongValue(j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getUpdateChildrenNeeded() {
        return ((Boolean) this.updateChildrenNeeded$delegate.getValue()).booleanValue();
    }

    private final void setUpdateChildrenNeeded(boolean z2) {
        this.updateChildrenNeeded$delegate.setValue(Boolean.valueOf(z2));
    }

    public final List<Transition<?>> getTransitions() {
        return this._transitions;
    }

    public final List<Transition<S>.TransitionAnimationState<?, ?>> getAnimations() {
        return this._animations;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isSeeking() {
        return ((Boolean) this.isSeeking$delegate.getValue()).booleanValue();
    }

    public final void setSeeking$animation_core_release(boolean z2) {
        this.isSeeking$delegate.setValue(Boolean.valueOf(z2));
    }

    public final long getLastSeekedTimeNanos$animation_core_release() {
        return this.lastSeekedTimeNanos;
    }

    public final void setLastSeekedTimeNanos$animation_core_release(long j2) {
        this.lastSeekedTimeNanos = j2;
    }

    public final boolean getHasInitialValueAnimations() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (snapshotStateList.get(i2).getInitialValueState$animation_core_release() != null) {
                    break;
                }
                i2++;
            } else {
                SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
                int size2 = snapshotStateList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    if (!snapshotStateList2.get(i3).getHasInitialValueAnimations()) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final long getTotalDurationNanos() {
        return ((Number) this.totalDurationNanos$delegate.getValue()).longValue();
    }

    public final long calculateTotalDurationNanos() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, snapshotStateList.get(i2).getDurationNanos$animation_core_release());
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            jMax = Math.max(jMax, snapshotStateList2.get(i3).calculateTotalDurationNanos());
        }
        return jMax;
    }

    public final void onFrame$animation_core_release(long j2, float f2) {
        if (getStartTimeNanos$animation_core_release() == Long.MIN_VALUE) {
            onTransitionStart$animation_core_release(j2);
        }
        long startTimeNanos$animation_core_release = j2 - getStartTimeNanos$animation_core_release();
        if (f2 != 0.0f) {
            startTimeNanos$animation_core_release = MathKt.roundToLong(startTimeNanos$animation_core_release / ((double) f2));
        }
        setPlayTimeNanos(startTimeNanos$animation_core_release);
        onFrame$animation_core_release(startTimeNanos$animation_core_release, f2 == 0.0f);
    }

    public final void onFrame$animation_core_release(long j2, boolean z2) {
        boolean z3 = true;
        if (getStartTimeNanos$animation_core_release() == Long.MIN_VALUE) {
            onTransitionStart$animation_core_release(j2);
        } else if (!this.transitionState.isRunning$animation_core_release()) {
            this.transitionState.setRunning$animation_core_release(true);
        }
        setUpdateChildrenNeeded(false);
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState = snapshotStateList.get(i2);
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                transitionAnimationState.onPlayTimeChanged$animation_core_release(j2, z2);
            }
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                z3 = false;
            }
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Transition<?> transition = snapshotStateList2.get(i3);
            if (!Intrinsics.areEqual(transition.getTargetState(), transition.getCurrentState())) {
                transition.onFrame$animation_core_release(j2, z2);
            }
            if (!Intrinsics.areEqual(transition.getTargetState(), transition.getCurrentState())) {
                z3 = false;
            }
        }
        if (z3) {
            onTransitionEnd$animation_core_release();
        }
    }

    public final void onTransitionStart$animation_core_release(long j2) {
        setStartTimeNanos$animation_core_release(j2);
        this.transitionState.setRunning$animation_core_release(true);
    }

    public final void onDisposed$animation_core_release() {
        onTransitionEnd$animation_core_release();
        this.transitionState.transitionRemoved$animation_core_release();
    }

    public final void onTransitionEnd$animation_core_release() {
        setStartTimeNanos$animation_core_release(Long.MIN_VALUE);
        TransitionState<S> transitionState = this.transitionState;
        if (transitionState instanceof MutableTransitionState) {
            transitionState.setCurrentState$animation_core_release(getTargetState());
        }
        setPlayTimeNanos(0L);
        this.transitionState.setRunning$animation_core_release(false);
        SnapshotStateList<Transition<?>> snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            snapshotStateList.get(i2).onTransitionEnd$animation_core_release();
        }
    }

    public final void seek(S s2, S s3, long j2) {
        setStartTimeNanos$animation_core_release(Long.MIN_VALUE);
        this.transitionState.setRunning$animation_core_release(false);
        if (!isSeeking() || !Intrinsics.areEqual(getCurrentState(), s2) || !Intrinsics.areEqual(getTargetState(), s3)) {
            if (!Intrinsics.areEqual(getCurrentState(), s2)) {
                TransitionState<S> transitionState = this.transitionState;
                if (transitionState instanceof MutableTransitionState) {
                    transitionState.setCurrentState$animation_core_release(s2);
                }
            }
            setTargetState$animation_core_release(s3);
            setSeeking$animation_core_release(true);
            setSegment(new SegmentImpl(s2, s3));
        }
        SnapshotStateList<Transition<?>> snapshotStateList = this._transitions;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Transition<?> transition = snapshotStateList.get(i2);
            Intrinsics.checkNotNull(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (transition.isSeeking()) {
                transition.seek(transition.getCurrentState(), transition.getTargetState(), j2);
            }
        }
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList2 = this._animations;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            snapshotStateList2.get(i3).seekTo$animation_core_release(j2);
        }
        this.lastSeekedTimeNanos = j2;
    }

    public final boolean addTransition$animation_core_release(Transition<?> transition) {
        return this._transitions.add(transition);
    }

    public final boolean removeTransition$animation_core_release(Transition<?> transition) {
        return this._transitions.remove(transition);
    }

    public final boolean addAnimation$animation_core_release(Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState) {
        return this._animations.add(transitionAnimationState);
    }

    public final void removeAnimation$animation_core_release(Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState) {
        this._animations.remove(transitionAnimationState);
    }

    public final void updateTarget$animation_core_release(S s2) {
        if (Intrinsics.areEqual(getTargetState(), s2)) {
            return;
        }
        setSegment(new SegmentImpl(getTargetState(), s2));
        if (!Intrinsics.areEqual(getCurrentState(), getTargetState())) {
            this.transitionState.setCurrentState$animation_core_release(getTargetState());
        }
        setTargetState$animation_core_release(s2);
        if (!isRunning()) {
            setUpdateChildrenNeeded(true);
        }
        resetAnimations();
    }

    private final void resetAnimations() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            snapshotStateList.get(i2).resetAnimation$animation_core_release();
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            snapshotStateList2.get(i3).resetAnimations();
        }
    }

    public final void animateTo$animation_core_release(final S s2, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1493585151);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(animateTo):Transition.kt#pdpnli");
        if ((i2 + 6) - (6 | i2) == 0) {
            i3 = (-1) - (((-1) - ((-1) - (((-1) - i2) | ((-1) - 8)) == 0 ? composerStartRestartGroup.changed(s2) : composerStartRestartGroup.changedInstance(s2) ? 4 : 2)) & ((-1) - i2));
        } else {
            i3 = i2;
        }
        if ((48 & i2) == 0) {
            i3 = (-1) - (((-1) - i3) & ((-1) - (composerStartRestartGroup.changed(this) ? 32 : 16)));
        }
        if ((i3 + 19) - (19 | i3) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1493585151, i3, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1211)");
            }
            if (isSeeking()) {
                composerStartRestartGroup.startReplaceGroup(1823992347);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1822507602);
                ComposerKt.sourceInformation(composerStartRestartGroup, "");
                updateTarget$animation_core_release(s2);
                if (!Intrinsics.areEqual(s2, getCurrentState()) || isRunning() || getUpdateChildrenNeeded()) {
                    composerStartRestartGroup.startReplaceGroup(1822738893);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "1219@49831L24,1220@49911L1012,1220@49872L1051");
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 335900987, "CC(remember):Transition.kt#9igjgp");
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope);
                    int i4 = (-1) - (((-1) - i3) | ((-1) - PanasonicMakernoteDirectory.TAG_INTELLIGENT_RESOLUTION));
                    int i5 = (-1) - (((-1) - (zChangedInstance ? 1 : 0)) & ((-1) - (i4 == 32 ? 1 : 0)));
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (i5 != 0 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.core.Transition$animateTo$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX INFO: renamed from: androidx.compose.animation.core.Transition$animateTo$1$1$1, reason: invalid class name */
                            /* JADX INFO: compiled from: Transition.kt */
                            @InterfaceC1492Gx
                            @Metadata(bv = {}, d1 = {"Я\u000e\u001d̉=!,i\bӵLc\u000b\u0004OيH\u000b\\A\u001f$2ߚ\u0006\u0007\u000fjg1\u000bͧ\u0007"}, d2 = {"\n`]<a@F])\rS", "", "!", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
                            @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAu\u0004\u007f\u0005y\u000e\u0004\u000b\u000bK\u0002\u000f\u0013\u0007Pw\u0017\u0007\u0015\u001b\u0012\u001e\u0014\u001b\u001bQ\u0010\u001e\u001a\u001f\u0014(\u001a\n&[i]k_m", f = "!>,8<1;/42p-5", i = {0, 0}, l = {1227}, m = "8>GA>9(KJH>H?", n = {"\u0013jjOe\u001aNHKHI2", "SktGf_QU)=G6<"}, s = {"xQ^", "rQ^"})
                            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                float F$0;
                                private /* synthetic */ Object L$0;
                                int label;
                                final /* synthetic */ Transition<S> this$0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                AnonymousClass1(Transition<S> transition, Continuation<? super AnonymousClass1> continuation) {
                                    super(2, continuation);
                                    this.this$0 = transition;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                                    anonymousClass1.L$0 = obj;
                                    return anonymousClass1;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    CoroutineScope coroutineScope;
                                    final float durationScale;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i2 = this.label;
                                    if (i2 == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        coroutineScope = (CoroutineScope) this.L$0;
                                        durationScale = SuspendAnimationKt.getDurationScale(coroutineScope.getCoroutineContext());
                                    } else {
                                        if (i2 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        durationScale = this.F$0;
                                        coroutineScope = (CoroutineScope) this.L$0;
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    while (CoroutineScopeKt.isActive(coroutineScope)) {
                                        final Transition<S> transition = this.this$0;
                                        this.L$0 = coroutineScope;
                                        this.F$0 = durationScale;
                                        this.label = 1;
                                        if (MonotonicFrameClockKt.withFrameNanos(new Function1<Long, Unit>() { // from class: androidx.compose.animation.core.Transition.animateTo.1.1.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Long l2) {
                                                invoke(l2.longValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                             */
                                            public final void invoke(long j2) {
                                                if (transition.isSeeking()) {
                                                    return;
                                                }
                                                transition.onFrame$animation_core_release(j2, durationScale);
                                            }
                                        }, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this, null), 1, null);
                                return new DisposableEffectResult() { // from class: androidx.compose.animation.core.Transition$animateTo$1$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    EffectsKt.DisposableEffect(coroutineScope, this, (Function1) objRememberedValue2, composerStartRestartGroup, i4);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1823982427);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>(this) { // from class: androidx.compose.animation.core.Transition$animateTo$2
                final /* synthetic */ Transition<S> $tmp1_rcvr;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.$tmp1_rcvr = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                public final void invoke(Composer composer2, int i6) {
                    this.$tmp1_rcvr.animateTo$animation_core_release(s2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    public final void seekAnimations$animation_core_release(long j2) {
        if (getStartTimeNanos$animation_core_release() == Long.MIN_VALUE) {
            setStartTimeNanos$animation_core_release(j2);
        }
        setPlayTimeNanos(j2);
        setUpdateChildrenNeeded(false);
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            snapshotStateList.get(i2).seekTo$animation_core_release(j2);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Transition<?> transition = snapshotStateList2.get(i3);
            if (!Intrinsics.areEqual(transition.getTargetState(), transition.getCurrentState())) {
                transition.seekAnimations$animation_core_release(j2);
            }
        }
    }

    public final void setInitialAnimations$animation_core_release(SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            snapshotStateList.get(i2).setInitialValueAnimation$animation_core_release(seekingAnimationState);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            snapshotStateList2.get(i3).setInitialAnimations$animation_core_release(seekingAnimationState);
        }
    }

    public final void resetAnimationFraction$animation_core_release(float f2) {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            snapshotStateList.get(i2).resetAnimationValue$animation_core_release(f2);
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            snapshotStateList2.get(i3).resetAnimationFraction$animation_core_release(f2);
        }
    }

    public final void clearInitialAnimations$animation_core_release() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            snapshotStateList.get(i2).clearInitialAnimation$animation_core_release();
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            snapshotStateList2.get(i3).clearInitialAnimations$animation_core_release();
        }
    }

    public final void updateInitialValues$animation_core_release() {
        SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
        int size = snapshotStateList.size();
        for (int i2 = 0; i2 < size; i2++) {
            snapshotStateList.get(i2).updateInitialValue$animation_core_release();
        }
        SnapshotStateList<Transition<?>> snapshotStateList2 = this._transitions;
        int size2 = snapshotStateList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            snapshotStateList2.get(i3).updateInitialValues$animation_core_release();
        }
    }

    public String toString() {
        List<Transition<S>.TransitionAnimationState<?, ?>> animations = getAnimations();
        int size = animations.size();
        String str = "Transition animation values: ";
        for (int i2 = 0; i2 < size; i2++) {
            str = str + animations.get(i2) + ", ";
        }
        return str;
    }

    public final void onChildAnimationUpdated() {
        setUpdateChildrenNeeded(true);
        if (isSeeking()) {
            SnapshotStateList<Transition<S>.TransitionAnimationState<?, ?>> snapshotStateList = this._animations;
            int size = snapshotStateList.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Transition<S>.TransitionAnimationState<?, ?> transitionAnimationState = snapshotStateList.get(i2);
                jMax = Math.max(jMax, transitionAnimationState.getDurationNanos$animation_core_release());
                transitionAnimationState.seekTo$animation_core_release(this.lastSeekedTimeNanos);
            }
            setUpdateChildrenNeeded(false);
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я`\u001d<K!&i\u0006DLc\u000b\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nʑA0RqP.XS2\u000f\u0002{<$a)yCQU\"}(\u000eWN}gvJh\u0012K\u000f\f\u001d\u0001jBI]xc\u0015\u00172PxG3SvE9ny>\u0005&G*8\b\u0005\t\u001a0b\u0016͔|Yŷ4\u00146?~9z\u0013S\u0005(\u0012.>N\u0002NbwPFH3\\h1c4oĩ^+m3\u0015MCEd+\u001bzy\u001ea@GE#*k\u000f\u0017Tk?9>\u0002?\u0015h]'YO\u0004[D_\u0018\u0014C3̠\u0011]\u0001/%\u0010_.$'Y\u001e*֟ח\u0012(}JD(JT&\u0006U\u0017^1(8 \u000ea\u0011#WN#\u001a^p,Aʨي\u001b%\u0006\u0007sD);iaig\u0015љ߉\t\r$xI\u0002/2l\u000e\u000fcKX\u0006)IQns\u000fݐ̆]=s\\9u\u0010\u0004\u001c0uN_\u007f\u001f\u007f/%ew\u007f\u05fa\u074co\u0002N\u001f0\n\u0013<\u0001S\u0018!xD0K.7X/Rɮֈh\u0005q.\u001d^:oe\u001c\u0003\u000fD\u001c[?jWT!S^~UnixPu\n[.\u0017=_nyno9\r_{QӒ\u0014a`X\\jJE\u001dX\u0015\u0011\u0004\u0010h_@\"hG\u001b\u0014\u0006:\\NB\u0012bI\u007f0L2A\u001bl\u0015~\u0002LU\bґȤc\\ns\r9{/\u0011O<t7O\u0017ʔʼsg~0t n\nEA\u007f\u0004I*c`\u000143\"7\t\u0002\u0014_m\\I\\lLt\u0004\u000ffچ׀=S5&!xOj@\u000eEQ\\tuQ\u0004\u00117|\ryE;\u00179\u0018\u0018xzDlzL_TM!\u0007`\u0003#>d.\u0005\u0018\u000b9\b:Ӂ\u07bb[ƏM\u0003\u000b[B_F\u000f\u001d!$2\u000f}B~;<Q7mK\u0006(G\u001bq_yodx\u0011\"V~s\u000eDi&qrQ\u00141iK\u007f\u001e=~xفЦ\u0003\u074cLz\u007f\nH\"B\u001fKJGy~lXO\u0011F\f~W>\u001b\u000bnaJ\u0015\u007f}j-\u000eEJʘ\u007fљbC-ݎ\u001e|u\u000b\u0006K\u000b'z\u0013\u0018\u0015\u00141\u001d.R{^\u0015.Ń\u05cd0Ӓw(>CA\u0005\u0013_!&:JJ'+EZ\n\u00141K\u001aT\u0004'%BD\u0004;\r\rdzlV~\u0005vD\u000f,\u0001܃\u000bܓ7\u001e\u0001߶\u0002\u001f{kl1y1/ys̀'˥S\u000bnއCFZ`)Px\u0003\u0011nkm\u001a\u0014D/_/}m\u007f\fn\u0017+0\u0019ȳ\u001dʦU\u0011gڻ\u0001\b\u0019\u0003|N\u0013#Bj`X:)-'3LzHeԦĎOζsr5NT*EU2\u0003\u001dr76,~iv)^VA;pajBSR߽_ȯ\u0002\b(éw\u0013\u0003(tW<nŭa!Bσ\n\u0018h6\u0017H!I\u0012ebt!@^\fDY\u001a30I\u0015\u0018*6w̹Ӟ+˭\nRSj~Fq*{p[C\u0011 QX\u007f);\fm25\fF\u0013\u000fYj\u0015a*p\u00116\u0013Kf]v^ӶϹ\u0010˹gxxmU\u001f\u001b=Gm0!?pr \u0004`\b8TEb--GfONd?[|Dg\u000e\u0015jVjé\u0010/\u001cΙ\u0017JdU!y\u0017~,+G7GK2ƯSֿ\u000b\u0004MÒvJ?\u001aW\u001bm1;s6\u0001)\u0003pa+Th\u0011_ۙϔgǋ1V\\? qg6\u0006f\tnY\u0006XD\u000eu\u001fPa=h\u00048>\u0013\u001arԠ]ߥE\u001b\u0019\u0001#\u0005۶sq"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\\u0004u]B\u0015g;R\u00010#UR4XavG\u001d\u007fi\n]+b", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "7mXA\\(ED\u0015\u0006\u000b^", "7mXA\\(ED\u0019\u0006\u0005\\0\f\u001d e}7\u0006M", "Bx_266Gd\u0019\f\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", ":`Q2_", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jOf5\u0018_uUr0I\u00168)aRpLixV\u0017M8\u0017\tXTmlN?*\u0012:IK7q\u0005\u0014\u0012\u001d9ty\fT\u001aTy^QJ-pBhc\u0004P2E`9n\u00195\u0004XC91\u001eu\u0018.2N8\u0012\u0007]\u001fr\u001cupkO\u0015\n<.G7YPRo\u001f+\u00071\u0011G\u0010U\u001c;it8\u0004-\u0011\n\u0011;`\u0016G1\u001f:gz^\u001akN+/8\u0012V0", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000f3z\u0018.\\ 7y4\u001dpqeA\u0003r0X\u007f|", "/mX:T;B]\"", "5dc\u000ea0FO(\u0003\u0005g", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\\u0012;OCJH0,\u0015g=B\u000bk(]z1P\"", "Adc\u000ea0FO(\u0003\u0005g", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&i#0MR\u0018gB\u001e\u0014Dj=\u000f_;R\u00010\u001d\u0010?", "/mX:T;B]\"=y^3|\u000b+t\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "/mX:T;B]\"l\u0006^*", "5dc\u000ea0FO(\u0003\u0005g\u001a\b\t-", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001N\u001a7QR;G=\"\u001ddp=\u0011l\u001aYv%\u001d", "Adc\u000ea0FO(\u0003\u0005g\u001a\b\t-", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i\u0018q\u001f2\\C\u0017t8&\u0011weC\u0010Q7Nt|\u000b=", "/mX:T;B]\"l\u0006^*;\b/l\u007f*wO\u0001", "2dU.h3MA$\f~g.", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000eBz\u001a7O1Fk2s", "", "2ta.g0H\\\u0002z\u0004h:", "5dc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=${1\u007fH|&\u001bQx\b:\u000125S\u000b >m\u0012<M", "u(9", "Adc\u0011h9:b\u001d\t\u0004G(\u0006\u0013=${1\u007fH|&\u001bQx\b:\u000125S\u000b >m\u0012<M", "uI\u0018#", "2ta.g0H\\\u0002z\u0004h:;\b/l\u007f*wO\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0007Av\u0018\u001c\\?Jk\n", "7mXA\\(ED\u0015\u0006\u000b^\b\u0006\r7a\u000f,\u0006I", "7mXA\\(ED\u0015\u0006\u000b^\u001a\f\u0005>e", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000e7m\u001c*JJ;ZA\u001a\u001eveH\u000bm5<\u0006#VL\r\u001a\\RxA\u001d\u00146\u0017R3\t\u0014]K-\\S3.\b\u0002", "5dc\u0016a0MW\u0015\u0006kZ3\r\t\u001dt{7{~| \u001bOk\u001d@\u0001./W\b-7g#.TC7y4", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001[\u0016.S?8r4\r\"djG\u000br0X\u007f\u0015VH],\u001b@r=\u001a\u0016c\u0010*4\u0011\rUP(xM%.\u0004;IW", "Adc\u0016a0MW\u0015\u0006kZ3\r\t\u001dt{7{~| \u001bOk\u001d@\u0001./W\b-7g#.TC7y4", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i%m\u00164I@Bk#+\u0011qo=\u0016g6Wd6C[NjJRrC\u0018\u001b\\iW/\u0015\u0001hE.w2F\u001b\u0017,\u001fE,", "7mc2e9N^(\u0003\u0005g\u001a\b\t-", "", "7r56a0LV\u0019}", "7r56a0LV\u0019}9Z5\u0001\u0011+t\u00042\u0005:~!$Gi\u001b<}%1g}", "u(I", "Adc\u0013\\5Ba\u001c~y\u001d(\u0006\r7a\u000f,\u0006Iz\u0015!To\bIv,5U\f ", "uY\u0018#", "7r56a0LV\u0019}9],\u0004\t1a\u000f(", "7rB2X2B\\\u001b", "5dc\u0019T)>Z", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "", "@db2g\u001aGO$ove<|", "5dc\u001fX:>b\u0007\bvi\u001dx\u0010?e>$\u0005D\t\u0013&Ky\u00176t/BYw-7t\u0016*[C", "u(5", "Adc\u001fX:>b\u0007\bvi\u001dx\u0010?e>$\u0005D\t\u0013&Ky\u00176t/BYw-7t\u0016*[C", "uE\u0018#", "@db2g\u001aGO$ove<|G.e\u0007(}<\u0010\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0001>w\u0012=;R7z4s", "B`a4X;/O \u000fz", "5dc!T9@S(ove<|", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc!T9@S(ove<|", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "B`a4X;/O \u000fz\u001d+|\u0010/g{7{", "5dc!l7>1#\b\f^9\f\t<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\(8??OI>'&hnH\u0007p\u0002", "CrT\u001ca3R7\"\u0003\nb(\u0004y+l\u0010(", "D`[BX", "5dc#T3NS", "Adc#T3NSWz\u0004b4x\u00183o\t\"yJ\u000e\u0017\u0011To\u0015<r35", "D`[BXj=S ~|Z;|", "Dd[<V0Mg\n~xm6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "1kT.e\u0010GW(\u0003ve\b\u0006\r7a\u000f,\u0006I", "", "1kT.e\u0010GW(\u0003ve\b\u0006\r7a\u000f,\u0006I?\u0013 Kw\nKz/>S{*Dm\u0010;MJ;gB\u001e", "=m?9T@-W!~Xa(\u0006\u000b/d", ">kPFG0FS\u0002z\u0004h:", "AbP9X\u001bH3\"}", "=m?9T@-W!~Xa(\u0006\u000b/d>$\u0005D\t\u0013&Ky\u00176t/BYw-7t\u0016*[C", "@db2g\bGW!z\nb6\u0006", "@db2g\bGW!z\nb6\u0006G+n\u00040wO\u0005! Am\u0018Iv\u001fBY\u0005 3{\u0016", "@db2g\bGW!z\nb6\u0006y+l\u0010(", "4qP0g0H\\", "@db2g\bGW!z\nb6\u0006y+l\u0010(:<\n\u001b\u001fC~\u0012F\u007f\u001f3c\u000b 1z\u00165M?Ik", "AdT8G6", "AdT8G6|O\"\u0003\u0003Z;\u0001\u00138_}2\t@z$\u0017No\nJv", "Adc\u0016a0MW\u0015\u0006kZ3\r\t\u000bn\u00040wO\u0005! ", "/mX:T;B]\"l\nZ;|", "Adc\u0016a0MW\u0015\u0006kZ3\r\t\u000bn\u00040wO\u0005! \u0006k\u0017@~!D]\b)1k ;M=Hk;\u001e\u0011va", "BnBAe0GU", "CoS.g,\u001a\\\u001d\u0007vm0\u0007\u0012", "7r8;g,K`)\n\n^+", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}p\u0004q", "CoS.g,\"\\\u001d\u000e~Z3X\u0012.T{5}@\u0010\b\u0013N\u007f\u000e", "CoS.g,\"\\\u001d\u000e~Z3X\u0012.T{5}@\u0010\b\u0013N\u007f\u000ezr.9ay/;w\u001f(KMHk.+\u0015oa5\u0015c", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|k\u0015IL:x>\"\u0014{+7\u0011k7X\u0005'\u0011HW0dN\u0002A\u001e\u001b$\fX8\rN:E-rS7z\u00110Q}Jl\u000b\u0015\u0004\u00195hF\u0006G", "CoS.g,\"\\\u001d\u000e~Z3m\u00056u\u007f", "CoS.g,\"\\\u001d\u000e~Z3m\u00056u\u007ffwI\u0005\u001f\u0013Vs\u0018Ep#?f}\u001aDm\u001d.IQ;", "CoS.g,-O&\u0001zm\u001dx\u0010?e", "CoS.g,-O&\u0001zm\u001dx\u0010?e>$\u0005D\t\u0013&Ky\u00176t/BYw-7t\u0016*[C", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_*VGCgC\"\u001fq+7\u0011p,\u0018W+PP],8[vE\u0010!^\u0018W\u0019\u0018\u0005W\u0017g_", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        private final MutableState animation$delegate;
        private final MutableState animationSpec$delegate;
        private final SpringSpec<T> defaultSpring;
        private final MutableLongState durationNanos$delegate;
        private TargetBasedAnimation<T, V> initialValueAnimation;
        private SeekableTransitionState.SeekingAnimationState initialValueState;
        private final FiniteAnimationSpec<T> interruptionSpec;
        private final MutableState isFinished$delegate;
        private boolean isSeeking;
        private final String label;
        private final MutableFloatState resetSnapValue$delegate;
        private final MutableState targetValue$delegate;
        private final TwoWayConverter<T, V> typeConverter;
        private boolean useOnlyInitialValue;
        private final MutableState value$delegate;
        private V velocityVector;

        public TransitionAnimationState(T t2, V v2, TwoWayConverter<T, V> twoWayConverter, String str) {
            T tInvoke;
            this.typeConverter = twoWayConverter;
            this.label = str;
            this.targetValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t2, null, 2, null);
            SpringSpec<T> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            this.defaultSpring = springSpecSpring$default;
            this.animationSpec$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(springSpecSpring$default, null, 2, null);
            this.animation$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TargetBasedAnimation(getAnimationSpec(), twoWayConverter, t2, getTargetValue(), v2), null, 2, null);
            this.isFinished$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
            this.resetSnapValue$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(-1.0f);
            this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t2, null, 2, null);
            this.velocityVector = v2;
            this.durationNanos$delegate = SnapshotLongStateKt.mutableLongStateOf(getAnimation().getDurationNanos());
            Float f2 = VisibilityThresholdsKt.getVisibilityThresholdMap().get(twoWayConverter);
            if (f2 != null) {
                float fFloatValue = f2.floatValue();
                V vInvoke = twoWayConverter.getConvertToVector().invoke(t2);
                int size$animation_core_release = vInvoke.getSize$animation_core_release();
                for (int i2 = 0; i2 < size$animation_core_release; i2++) {
                    vInvoke.set$animation_core_release(i2, fFloatValue);
                }
                tInvoke = this.typeConverter.getConvertFromVector().invoke(vInvoke);
            } else {
                tInvoke = null;
            }
            this.interruptionSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, tInvoke, 3, null);
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final String getLabel() {
            return this.label;
        }

        private final T getTargetValue() {
            return this.targetValue$delegate.getValue();
        }

        private final void setTargetValue(T t2) {
            this.targetValue$delegate.setValue(t2);
        }

        private final void setAnimationSpec(FiniteAnimationSpec<T> finiteAnimationSpec) {
            this.animationSpec$delegate.setValue(finiteAnimationSpec);
        }

        public final FiniteAnimationSpec<T> getAnimationSpec() {
            return (FiniteAnimationSpec) this.animationSpec$delegate.getValue();
        }

        private final void setAnimation(TargetBasedAnimation<T, V> targetBasedAnimation) {
            this.animation$delegate.setValue(targetBasedAnimation);
        }

        public final TargetBasedAnimation<T, V> getAnimation() {
            return (TargetBasedAnimation) this.animation$delegate.getValue();
        }

        public final SeekableTransitionState.SeekingAnimationState getInitialValueState$animation_core_release() {
            return this.initialValueState;
        }

        public final void setInitialValueState$animation_core_release(SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
            this.initialValueState = seekingAnimationState;
        }

        public final boolean isFinished$animation_core_release() {
            return ((Boolean) this.isFinished$delegate.getValue()).booleanValue();
        }

        public final void setFinished$animation_core_release(boolean z2) {
            this.isFinished$delegate.setValue(Boolean.valueOf(z2));
        }

        public final float getResetSnapValue$animation_core_release() {
            return this.resetSnapValue$delegate.getFloatValue();
        }

        public final void setResetSnapValue$animation_core_release(float f2) {
            this.resetSnapValue$delegate.setFloatValue(f2);
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.value$delegate.getValue();
        }

        public void setValue$animation_core_release(T t2) {
            this.value$delegate.setValue(t2);
        }

        public final long getDurationNanos$animation_core_release() {
            return this.durationNanos$delegate.getLongValue();
        }

        public final void setDurationNanos$animation_core_release(long j2) {
            this.durationNanos$delegate.setLongValue(j2);
        }

        public final void onPlayTimeChanged$animation_core_release(long j2, boolean z2) {
            if (z2) {
                j2 = getAnimation().getDurationNanos();
            }
            setValue$animation_core_release(getAnimation().getValueFromNanos(j2));
            this.velocityVector = (V) getAnimation().getVelocityVectorFromNanos(j2);
            if (getAnimation().isFinishedFromNanos(j2)) {
                setFinished$animation_core_release(true);
            }
        }

        public final void seekTo$animation_core_release(long j2) {
            if (getResetSnapValue$animation_core_release() == -1.0f) {
                this.isSeeking = true;
                if (Intrinsics.areEqual(getAnimation().getTargetValue(), getAnimation().getInitialValue())) {
                    setValue$animation_core_release(getAnimation().getTargetValue());
                } else {
                    setValue$animation_core_release(getAnimation().getValueFromNanos(j2));
                    this.velocityVector = (V) getAnimation().getVelocityVectorFromNanos(j2);
                }
            }
        }

        public final void updateInitialValue$animation_core_release() {
            TargetBasedAnimation<T, V> targetBasedAnimation;
            SeekableTransitionState.SeekingAnimationState seekingAnimationState = this.initialValueState;
            if (seekingAnimationState == null || (targetBasedAnimation = this.initialValueAnimation) == null) {
                return;
            }
            long jRoundToLong = MathKt.roundToLong(seekingAnimationState.getDurationNanos() * ((double) seekingAnimationState.getValue()));
            T valueFromNanos = targetBasedAnimation.getValueFromNanos(jRoundToLong);
            if (this.useOnlyInitialValue) {
                getAnimation().setMutableTargetValue$animation_core_release(valueFromNanos);
            }
            getAnimation().setMutableInitialValue$animation_core_release(valueFromNanos);
            setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
            if (getResetSnapValue$animation_core_release() == -2.0f || this.useOnlyInitialValue) {
                setValue$animation_core_release(valueFromNanos);
            } else {
                seekTo$animation_core_release(Transition.this.getPlayTimeNanos());
            }
            if (jRoundToLong >= seekingAnimationState.getDurationNanos()) {
                this.initialValueState = null;
                this.initialValueAnimation = null;
            } else {
                seekingAnimationState.setComplete(false);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ void updateAnimation$default(TransitionAnimationState transitionAnimationState, Object obj, boolean z2, int i2, Object obj2) {
            if ((1 & i2) != 0) {
                obj = transitionAnimationState.getValue();
            }
            if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
                z2 = false;
            }
            transitionAnimationState.updateAnimation(obj, z2);
        }

        private final void updateAnimation(T t2, boolean z2) {
            FiniteAnimationSpec<T> finiteAnimationSpecDelayed;
            TargetBasedAnimation<T, V> targetBasedAnimation = this.initialValueAnimation;
            if (Intrinsics.areEqual(targetBasedAnimation != null ? targetBasedAnimation.getTargetValue() : null, getTargetValue())) {
                setAnimation(new TargetBasedAnimation<>(this.interruptionSpec, this.typeConverter, t2, t2, AnimationVectorsKt.newInstance(this.velocityVector)));
                this.useOnlyInitialValue = true;
                setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
                return;
            }
            FiniteAnimationSpec<T> animationSpec = (!z2 || this.isSeeking || (getAnimationSpec() instanceof SpringSpec)) ? getAnimationSpec() : this.interruptionSpec;
            if (Transition.this.getPlayTimeNanos() <= 0) {
                finiteAnimationSpecDelayed = animationSpec;
            } else {
                finiteAnimationSpecDelayed = AnimationSpecKt.delayed(animationSpec, Transition.this.getPlayTimeNanos());
            }
            setAnimation(new TargetBasedAnimation<>(finiteAnimationSpecDelayed, this.typeConverter, t2, getTargetValue(), this.velocityVector));
            setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
            this.useOnlyInitialValue = false;
            Transition.this.onChildAnimationUpdated();
        }

        public final void resetAnimation$animation_core_release() {
            setResetSnapValue$animation_core_release(-2.0f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void resetAnimationValue$animation_core_release(float f2) {
            Object targetValue;
            if (f2 == -4.0f || f2 == -5.0f) {
                TargetBasedAnimation<T, V> targetBasedAnimation = this.initialValueAnimation;
                if (targetBasedAnimation != null) {
                    getAnimation().setMutableInitialValue$animation_core_release(targetBasedAnimation.getTargetValue());
                    this.initialValueState = null;
                    this.initialValueAnimation = null;
                }
                if (f2 == -4.0f) {
                    targetValue = getAnimation().getInitialValue();
                } else {
                    targetValue = getAnimation().getTargetValue();
                }
                getAnimation().setMutableInitialValue$animation_core_release(targetValue);
                getAnimation().setMutableTargetValue$animation_core_release(targetValue);
                setValue$animation_core_release(targetValue);
                setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
                return;
            }
            setResetSnapValue$animation_core_release(f2);
        }

        public final void setInitialValueAnimation$animation_core_release(SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
            if (!Intrinsics.areEqual(getAnimation().getTargetValue(), getAnimation().getInitialValue())) {
                this.initialValueAnimation = getAnimation();
                this.initialValueState = seekingAnimationState;
            }
            setAnimation(new TargetBasedAnimation<>(this.interruptionSpec, this.typeConverter, getValue(), getValue(), AnimationVectorsKt.newInstance(this.velocityVector)));
            setDurationNanos$animation_core_release(getAnimation().getDurationNanos());
            this.useOnlyInitialValue = true;
        }

        public final void clearInitialAnimation$animation_core_release() {
            this.initialValueAnimation = null;
            this.initialValueState = null;
            this.useOnlyInitialValue = false;
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + getTargetValue() + ", spec: " + getAnimationSpec();
        }

        public final void updateTargetValue$animation_core_release(T t2, FiniteAnimationSpec<T> finiteAnimationSpec) {
            if (this.useOnlyInitialValue) {
                TargetBasedAnimation<T, V> targetBasedAnimation = this.initialValueAnimation;
                if (Intrinsics.areEqual(t2, targetBasedAnimation != null ? targetBasedAnimation.getTargetValue() : null)) {
                    return;
                }
            }
            if (Intrinsics.areEqual(getTargetValue(), t2) && getResetSnapValue$animation_core_release() == -1.0f) {
                return;
            }
            setTargetValue(t2);
            setAnimationSpec(finiteAnimationSpec);
            updateAnimation(getResetSnapValue$animation_core_release() == -3.0f ? t2 : getValue(), !isFinished$animation_core_release());
            setFinished$animation_core_release(getResetSnapValue$animation_core_release() == -3.0f);
            if (getResetSnapValue$animation_core_release() >= 0.0f) {
                setValue$animation_core_release(getAnimation().getValueFromNanos((long) (getAnimation().getDurationNanos() * getResetSnapValue$animation_core_release())));
            } else if (getResetSnapValue$animation_core_release() == -3.0f) {
                setValue$animation_core_release(t2);
            }
            this.useOnlyInitialValue = false;
            setResetSnapValue$animation_core_release(-1.0f);
        }

        public final void updateInitialAndTargetValue$animation_core_release(T t2, T t3, FiniteAnimationSpec<T> finiteAnimationSpec) {
            setTargetValue(t3);
            setAnimationSpec(finiteAnimationSpec);
            if (Intrinsics.areEqual(getAnimation().getInitialValue(), t2) && Intrinsics.areEqual(getAnimation().getTargetValue(), t3)) {
                return;
            }
            updateAnimation$default(this, t2, false, 2, null);
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&˛\bDZc|\u0004G\f8\u000b<K\u0007Ӭ4\u0012\u0006јnʑA0RkP\u008cXS@ş\u0014}:#i#\"IKW*}h\b}N(z~Nh\f[\u000f<\u0015\tn:Kmx\u0014\u0011Ƥ6B}B{^}EQ`#?5&@,P{\u001b\u007fH5\u000fǌvCIY\u0018*0n}\u0001f]a\u0013\u001b*\u0006t\u001fWȽ^ʄR>Plk@G%\tmPSws>~e\r|S}˰xҐ\"3H7C\u001b=U\t\u000e``ϓ\u0007M"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\\u0003hcA\u0007l;2~2N\"", "!", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\\u0003hcA\u0007l;$", "7mXA\\(EA(z\n^", "B`a4X;,b\u0015\u000ez", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq>", "5dc\u0016a0MW\u0015\u0006hm(\f\t", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "\u001aiPCTuEO\"\u0001DH)\u0002\t-tU", "5dc!T9@S(l\nZ;|", "3pd._:", "", "=sW2e", "", "6`b566=S", "", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class SegmentImpl<S> implements Segment<S> {
        private final S initialState;
        private final S targetState;

        public SegmentImpl(S s2, S s3) {
            this.initialState = s2;
            this.targetState = s3;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getInitialState() {
            return this.initialState;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public S getTargetState() {
            return this.targetState;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Segment) {
                Segment segment = (Segment) obj;
                if (Intrinsics.areEqual(getInitialState(), segment.getInitialState()) && Intrinsics.areEqual(getTargetState(), segment.getTargetState())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            S initialState = getInitialState();
            int iHashCode = (initialState != null ? initialState.hashCode() : 0) * 31;
            S targetState = getTargetState();
            return iHashCode + (targetState != null ? targetState.hashCode() : 0);
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&˛\bDRш|\u0004G\n8\u000b<K\u0007\"2\u0012}k|ʑa2JdV-\u0003SX\u000f4\u0014B*s$ JcUP|R\r]R\u007fg%I!ŦEǇ\n\u0016\u0007r|Ycyu\u0012E1\u0019ŊAݯQsU;fvD\bpB0<\u0012\u00057\u0019\u0001С\u0012ͯ~Gc\u000e\u00185NsŦQ҈ˢ\u0005\u001e\u001a\bD?/\u001d֚kWɥLm"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\\u0003hcA\u0007l;$", "!", "", "7mXA\\(EA(z\n^", "5dc\u0016a0MW\u0015\u0006hm(\f\t", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "B`a4X;,b\u0015\u000ez", "5dc!T9@S(l\nZ;|", "7rC?T5LW(\u0003\u0005g0\u0006\u000b\u001eo", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kqB", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public interface Segment<S> {
        S getInitialState();

        S getTargetState();

        /* JADX INFO: compiled from: Transition.kt */
        @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public static final class DefaultImpls {
            @Deprecated
            public static <S> boolean isTransitioningTo(Segment<S> segment, S s2, S s3) {
                return Segment.super.isTransitioningTo(s2, s3);
            }
        }

        default boolean isTransitioningTo(S s2, S s3) {
            return Intrinsics.areEqual(s2, getInitialState()) && Intrinsics.areEqual(s3, getTargetState());
        }
    }

    /* JADX INFO: compiled from: Transition.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯV\u001d<K!&i\u0006DLc\u000b\u0004I\u0006>é6Ȑ\u0007\"B\u0012\u007fјnjG<LeN.ZS@\u000fs{J$c$wMCU0}*ޛWN}gvJp\u000bK\u000f\u001c\u0016\u0001jBI]ތe\u0012%2JoE4UoK9ht<\u0006&ݍ$Nц-\u0003 )V\u000f\u001f\u0001IK\u001a\u0012X@\u001f;\u0003\r{\u0007R\u0011*~A\u0007Ȧlw\\9`xm<?#9hRP7_f|{\u0011VX5\u0012\u000faL1Ë;5#,\u001cU\u0015hsE\u0013A\u0002=;gU>[j\u0002oNu\u0010\u001c%1_\u000fmr\\ؘ3kp\u001471_e[PD'&\u0016*&ʀ\b\u000e\fCxM;7~#\u001eD\u0005\u0002\nóг\u0006hH\u001e\u000bg<65\u000291_;vSq;OMe\u0015M\u0018,D\u0019nO}\u001bו\u05ce\u0019\u001bZ\u001b\"+_KUp^\fi=$\u0003\u0001d\u0012*:0]~]\u0005aD''G[o\"1m\u0012Hzg%ݓ1nckbHv̎\u001d gV\u0017\u0014rlt\u0007{P\u000bW<\u0013]\u001c\u000b\u0007\u0014\u0007A)-\u000eL#5\u0010\u0005NxkzM\u0014\nSÄ7=ip{\u000e\u000eު\r=k\u0010\"N8\u05edΧ\u0014͖@r\rZlRa\u001dr^..@U\u000b\u0012}\nR]\\\"@D\n\u001cb2֞\u001db\u001dǽ\u001b HS\u000b\u001c0uv\u0013\u0017`C&\u0013iZs\u0019\u0003`\\'o\u0016|ͅ0\u0003hõECWI';Ƈ&\u000e"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\shb9\u0014p,MR0KTJ;`\\{\u0013", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "", "Bx_266Gd\u0019\f\n^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fIw\b*a!EtE\u001e\"waF\\", ":`Q2_", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'jO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\u000ec\u0012V'\u001c\tcJmlND\u001fQ\u001b[\f-d\u0015i \u0017Fj}QV\u001d\u001d`\u001aqR%2MUh{\u0011/To.m\u000e5`M", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\shb9\u0014p,MR0KTJ;`\\{{r\u0012[\u000e[8\r\u00045J(v@F#\u00125(}JdV", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "2`c.", "5dc\u0011T;:\u0012\u0015\b~f(\f\r9ny&\u0006M\u0001\u0011$Gv\u000e8\u0005%", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\#*VQ?z8(\u001e'@9\bc9[v&#UR4XavG\u001dP9\u000eO+\u001a\u0012Y@\u007fwH?\u001b\u00170S\u000b\u001ad\u0010\bk", "Adc\u0011T;:\u0012\u0015\b~f(\f\r9ny&\u0006M\u0001\u0011$Gv\u000e8\u0005%", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'SGa:\u0007p9Nu\u0003PPV(kV|FRpZ\u000fN8\u001a\u0005X\u001d-rL3.\f6R`7w|aY~", "2`c.\u0017+>Z\u0019\u0001vm,", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "5dc\u0019T)>Z", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "5dc!l7>1#\b\f^9\f\t<", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\(8??OI>'&hnH\u0007p\u0002", "/mX:T;>", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "BqP;f0MW#\bhi,z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\\u0003hcA\u0007l;$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "B`a4X;/O \u000fz;@j\u0018+t\u007f", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "AsPAX", "AdcBc\u001a>S\u001f\u0003\u0004`", "", "AdcBc\u001a>S\u001f\u0003\u0004`jx\u00123m{7\u007fJ\n\u0011\u0015Q|\u000e6\u0004%<Yy.7", "\u0012dU2e9>Rt\b~f(\f\r9n^$\u000b<", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public final class DeferredAnimation<T, V extends AnimationVector> {
        private final MutableState data$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        private final String label;
        private final TwoWayConverter<T, V> typeConverter;

        public DeferredAnimation(TwoWayConverter<T, V> twoWayConverter, String str) {
            this.typeConverter = twoWayConverter;
            this.label = str;
        }

        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.typeConverter;
        }

        public final String getLabel() {
            return this.label;
        }

        public final Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> getData$animation_core_release() {
            return (DeferredAnimationData) this.data$delegate.getValue();
        }

        public final void setData$animation_core_release(Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> deferredAnimationData) {
            this.data$delegate.setValue(deferredAnimationData);
        }

        /* JADX INFO: compiled from: Transition.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я@\u001d<K!&i\u0006DLc\u000b\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007f\u0007|jAӄLe^.ZS@\u000fs{J$c$\bCC٥\"}8\tWNmtvJh\u000bK\u000f\f\u0016~̔._ǁ!_\u0018\u0010@A\u0018E9O}=a`#75&B$HyK\u007fH,\ty\u0007\u0015QN$(@B\u0001:\t\u000e]\u0007*\u0012<@N\u0005nbwPFH#җh43$wHfDo8\rS\u001dHd'CǸ\u0010&;HG;%'c\u0003=S\nH1FџA\u0005n17JW~oQh\u0011$$a˽ոa|,h\u0015Wf\u00197-Uiq^\u001e*\bz2\u000ej\u000b؝\n'V=u,t#&3#\u000f\u0004J^\u001fvH\u0010|q6Mӛ.;{^)iiwK\u001b^72\u0006\u001d 3\u0001%#\nX^f%\u001ddw\bĸ\u007fEףLT\u0012ԯUo\n\u0001p\u0013z7>R\u0018J\f\">&[ڛ٦=-'w\u0012NJt\u0007\u0007fnywbJP\"%\u0017e1_ȸfֈh\u0011s¬lZ2#[/t\t\u0004\u001c!5--J'=-^WxozOm\n[Ä\u0015?iv{\u0014g;n3kR\u0012\u0019\u0010Yλ\u0018?Bl[֡r͞W\u0018b٢@$8^x#\u0018}Je\u001a(\u0003Q\u007f4L,g\u001a\u0013i\u001fҨ նE\u0001!a`\u0002\u001e\u0019Շ7B"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\shb9\u0014p,MR0KTJ;`\\{{r\u0012[\u000e[8\r\u00045J(v@F#\u00125(}JdV", "\"", "$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt%\u001e\u0013wkF\\", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "/mX:T;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\\u0004u]B\u0015g;R\u00010#UR4XavG\u001d\u007fi\n]+b", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=s", "BqP;f0MW#\bhi,z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u000fDi\u001f<QR?u=\\\u0003hcA\u0007l;$", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG\u0001;v\u001a=M\u001fDo<\u001a$lkBtn,LL", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "B`a4X;/O \u000fz;@j\u0018+t\u007f", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "AsPAX", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fqwI\u0005\u001f\u0013Vs\u0018E@#?f}i&z\u00127[GJo>'SGa:\u0007p9Nu\u0003PPV(kV|FixV\u0017M8\u0017\tXTmlN?*\u0012:IK7q\u0005\u0014\u0012\u001d9ty\fT\u001aTy^dN%qT]n}QJ\u0004Q7`\u0015m!k>D-oz\u001d#d_2\u0014\u0005A nay=NM#\n?(G7`WM9VL}%.O\u0006\u0001 {9\u00054r<\b>3\u0002:kQq'Eb\u0002^1mIp'FE\u0011NOm~z\bnx(_\u0017\u0012l>|n)V", "5dc\u000ea0FO(\u0003\u0005g", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001\\#*VQ?z8(\u001e'PF\u0003l:R\u0006+QU*5`ZnL\u0018\u001cc{]'\u001c\u0005/", "5dc!T9@S(ove<|eCS\u000f$\u000b@", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc!T9@S(ove<|eCS\u000f$\u000b@", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "5dc!e(Ga\u001d\u000e~h5j\u0014/c", "Adc!e(Ga\u001d\u000e~h5j\u0014/c", "D`[BX", "5dc#T3NS", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "CoS.g,\u001a\\\u001d\u0007vm0\u0007\u0012\u001dt{7{N", "", "AdV:X5M", "/mX:T;B]\"Fxh9|\u0003<e\u0007(wN\u0001"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {
            private final Transition<S>.TransitionAnimationState<T, V> animation;
            private Function1<? super S, ? extends T> targetValueByState;
            private Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec;

            public DeferredAnimationData(Transition<S>.TransitionAnimationState<T, V> transitionAnimationState, Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> function1, Function1<? super S, ? extends T> function12) {
                this.animation = transitionAnimationState;
                this.transitionSpec = function1;
                this.targetValueByState = function12;
            }

            public final Transition<S>.TransitionAnimationState<T, V> getAnimation() {
                return this.animation;
            }

            public final Function1<Segment<S>, FiniteAnimationSpec<T>> getTransitionSpec() {
                return this.transitionSpec;
            }

            public final void setTransitionSpec(Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> function1) {
                this.transitionSpec = function1;
            }

            public final Function1<S, T> getTargetValueByState() {
                return this.targetValueByState;
            }

            public final void setTargetValueByState(Function1<? super S, ? extends T> function1) {
                this.targetValueByState = function1;
            }

            public final void updateAnimationStates(Segment<S> segment) {
                T tInvoke = this.targetValueByState.invoke(segment.getTargetState());
                if (Transition.this.isSeeking()) {
                    this.animation.updateInitialAndTargetValue$animation_core_release(this.targetValueByState.invoke(segment.getInitialState()), tInvoke, this.transitionSpec.invoke(segment));
                } else {
                    this.animation.updateTargetValue$animation_core_release(tInvoke, this.transitionSpec.invoke(segment));
                }
            }

            @Override // androidx.compose.runtime.State
            public T getValue() {
                updateAnimationStates(Transition.this.getSegment());
                return this.animation.getValue();
            }
        }

        public final State<T> animate(Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> function1, Function1<? super S, ? extends T> function12) {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core_release = getData$animation_core_release();
            if (data$animation_core_release == null) {
                Transition<S> transition = Transition.this;
                data$animation_core_release = new DeferredAnimationData<>(transition.new TransitionAnimationState(function12.invoke(transition.getCurrentState()), AnimationStateKt.createZeroVectorFrom(this.typeConverter, function12.invoke(Transition.this.getCurrentState())), this.typeConverter, this.label), function1, function12);
                Transition<S> transition2 = Transition.this;
                setData$animation_core_release(data$animation_core_release);
                transition2.addAnimation$animation_core_release(data$animation_core_release.getAnimation());
            }
            Transition<S> transition3 = Transition.this;
            data$animation_core_release.setTargetValueByState(function12);
            data$animation_core_release.setTransitionSpec(function1);
            data$animation_core_release.updateAnimationStates(transition3.getSegment());
            return data$animation_core_release;
        }

        public final void setupSeeking$animation_core_release() {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core_release = getData$animation_core_release();
            if (data$animation_core_release != null) {
                Transition<S> transition = Transition.this;
                data$animation_core_release.getAnimation().updateInitialAndTargetValue$animation_core_release(data$animation_core_release.getTargetValueByState().invoke(transition.getSegment().getInitialState()), data$animation_core_release.getTargetValueByState().invoke(transition.getSegment().getTargetState()), data$animation_core_release.getTransitionSpec().invoke(transition.getSegment()));
            }
        }
    }

    public final void removeAnimation$animation_core_release(Transition<S>.DeferredAnimation<?, ?> deferredAnimation) {
        Transition<S>.TransitionAnimationState<?, ?> animation;
        Transition<S>.DeferredAnimationData<?, ?>.DeferredAnimationData<?, V> data$animation_core_release = deferredAnimation.getData$animation_core_release();
        if (data$animation_core_release == 0 || (animation = data$animation_core_release.getAnimation()) == null) {
            return;
        }
        removeAnimation$animation_core_release(animation);
    }
}
