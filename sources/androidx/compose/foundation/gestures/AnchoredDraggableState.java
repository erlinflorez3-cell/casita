package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
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
    	at kotlin.metadata.internal.metadata.jvm.deserialization.JvmProtoBufUtil.readFunctionDataFrom(JvmProtoBufUtil.kt:53)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readKmLambda$kotlin_metadata_jvm(JvmReadUtils.kt:39)
    	at kotlin.metadata.jvm.KotlinClassMetadata$SyntheticClass.<init>(KotlinClassMetadata.kt:181)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:52)
    	... 5 more
    */
/* JADX INFO: compiled from: AnchoredDraggable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яy\u001d<K!&˛\bDRш|\u0004G\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007njG5Le^.ZS0\u0010s{J$cҕyCQU\"Ԃ*\teNogtJb\u000bQ\u0018\u000e\u0016~k4I[\u000be\u0012%2JoEUUoK9hҚ>\u000562*\u0600\u0002\u0005\u0017\u001a2H&v\u0003ŏS\f(0HpPR\u0015˟\r\u001a(\u0006F \u00072\u0005fd<M\u0003җX\u001eK\u0005oĩ\\&\u00100+MEECg˩ug3;DE6-%\nΈ\u0017\\iA\u001bE\u0002?\u0015h]ݐYL\u0004vD\\\u0018/%<_\u001c\fx͉`\u000fWg\u001c-1WsMV\u0014N\u0001\u000b}\u001d<2\u00144,X8;$~\u000e\u001e5\u0005r\u0002F~\rnL\u000e\u0007y<''\u00103Y?IsakI'f=\f\u0007\u001d\u001eQ\u0007\u001d0ku\u0014`#+l\u0013aBaOsʰݳ\u000ecCt\u0014vh\n:\u00066M&@\f\u0013>\u0017SI\n>؝%k\u0010[\u0005e\u0007\tniki\t̲PA|\u001aOE\u0019\u001djS\u0013\u000b\u07fbT^^3!S\"\\\u0017\u007f\u000e\u0019Fe\b>1%>T}myt[g\"+?hGY\u001dq<bIhAAii cbvBEjo\u0015btPk\u0012j^8\"`N\u0019\u001f\b\u001dJN\u001a#JZ\u0002-D;gǉÅ\u0019R\t%RG\u0003\u0011o\\n\u0016%eC&\u0013iR\u00077\u0006˩`p}{AA:Kx\"[\u0011\u00029'om\"\u001fؔ-)\r~\u0002P_gz\u0019|B$HmM&\u0015*;a/kg\u001f\u00169G\u0012/UL)ό\u007fPɟ+\u0005\u0003\u0001\u001fAn6w\npvR6z[_cMǱՑb|)\u000ft\u0006\u007fiV|MizTkFYx\u0013[LNfL3u.)\u0011q8{c-qzޗ\u001aw\u001a\u0007[˜\u001cɳs.\b;W\u0001\u00034\u001c,\u0012e hW]@\fPI\bPnb2?\u001b~Ni\b\nR\tbaC_Qy\u0001XHMAɀ,i¡0\u0017v]k@\u0019w\u000e64ePuS\u0006$dS'!M\u00027\u001cD[`\u001bL%\t9{_H݁ =&.\u001eŉGޘ\ns&\u0011\n^p`T\tZ҉\\@\u0016C[T\u0018\f@~\u000egw\u000fMϨrwI3&T'b\u001dHϖdEn~r\r\rmK\u001e';a\t{&l/\u00128If+i3j}\u0005\u0017)9$l9I.\u001f۞խI]I+JQ\u0012\u0005Am\u001au<<&_5BNÇiU\u001fC\u000f0\u0015Η\u001ci͒hv K\u001bR0\u000f\u0017z+\u0014\u0005\u001e\u001dq1O!u\u00131Z+\u00107q Gӆ\u0003ͫ\u000b\f\u000bK\u000f.;nM-k[\u001b\u00185EoSqջN Č+\u0004\u0003\u000b%x\u001cQ\"]I\nF{$N\u001a\u000f#R0\u0004d\u05fd#u:4\u000e6]nK\u0002Iȅ̲ow/.w?z\u001bZQxz\u001ac#̙\u001dkaӉhܕZ{v-^4Y\\[0+^j<!SVǅ?\u0003D\u001f47N\u000er+ O\u001a֬\u001fn\u0006 Kk\u0006ջ˚aʘ4b&\u007f%\u0017\u0004\"BV..Ipm@j$j\t\u0013\u0005\u001cn\u0003Ct\u0006\u001c8JΙ۫Lh\u0017\u001aDLx&t1=\u001fEl\u001dIp\u00072Ww+wܑT̫\u001f=:У\b*|0\u0011Z3\u001e\u000eKZ\t)υ\u00180;^l=Pś\u0010h,%Y\u0380ɣEђF\u00184\u0013\u00147=xP\"D~(?[S9e'6Q*F\u0014\b\r)7zQ\u0002+X\u0010Ϙ\u0005\u0013GƗIm@\u001bE\u001bs;\u001d\u00193W\u0015e{ˢgͺ+\f\nʆ\u001b,[\u000fn\u0011w+\u007fʿu$\bmX\u0002 \u001eZڎ<6a@\u001cʼ؉*ن`P^u]24HNpJOU\u0010\u0019u\u0010Yw=Dsi\u0011LA)&O\tĎ.1\u0005\tK|v*[m\u001bv,7=\fY7%\u0015(O Fa\u000e1\u000e\u0006۞ѽ<\u038bw\u0014B4gl\b~X[08;Etep\u001f{\u000709FJ%\r2}aVn\u0018x\u001dF-\u0002;\u0005v3ܕ\u009fAǶ\u000fP\u0017&diPC#\b\u001cgVJ\"\u007fP\u001b#H\u0004t\u0002E_-f\r1,?a\u074c\n/mqWE[yh??91vZZEe\u000b\u000b\u0004&\"\u07be-܅\u0004p3ɹ_XDV8xV-S\"`\u0010r~zmDӯߕ0ʒ\u0003jK_\u0007]-\u007fe\u0017k=@\"O]jQ9j(\u0018`\u0019;-/ߏ3\u0014O1+\u000bTҍova4cКĔ{ţ`Y]~s\u0010\u001e!yL's\u0014bOCQ2d\u000b\u0010.eK\u0017\u00120)4\u0006A*\u0011tѸm\u0014*Ω\u001bN<\u001e7\u0011\u001cr\u001f0ZjE߇+P\u0005ۆސUΤA\u0010\u0019d\"\u0001I\"X.4;\u0017j \u0003\n4}uvviMs1$$\u0015ѹsÔgUgռ\u0007Sb%LdГ*0"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w)L9n>+\u0015g@F\u0003e.Js.G:](kRH", "\"", "", "7mXA\\(ED\u0015\u0006\u000b^", "/mR5b9L", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0015\u0010a/X\u00045\u001d", ">nb6g0H\\\u0015\u0006ia9|\u00172o\u0007'", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "Bnc._\u000bBa(z\u0004\\,", "Dd[<V0Mg\b\u0002\b^:\u007f\u00136d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "AmP=45B[\u0015\u000e~h5j\u0014/c", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "2dR.l\bGW!z\nb6\u0006v:e}", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~7k\u0012B)L?s0-\u0019rj'\u0012c*$", "1n]3\\9FD\u0015\u0006\u000b^\n\u007f\u00058g\u007f", "<df#T3NS", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_/WSDj0-\u0019rj\u0003\tc:]\u00074GZ\u0018\u000biNt?\u0010\u000fa\u000e*4\u000b\bcN2D+=)\u00173M\u000b\u0005m\u0012\u0014_\u000fEsnQZ\u001aP\b^VQ2fU]i\u0003\u0013\u0017,h4s\u0013c&&?K,]r)$f_2\u0014\u0005aZSb\u0003evK#\u0004\u0003y%idERyY;\bp\u001dU\u0004\u0003\u001c@X>'}1\f09:n\u000e\u0015e\"K^Bp5`I#5:F\u001c-VcsB%\nq\u001en\u0012\u0012aHz\u0017omnR\u001d\u0007'\u0013d9i[\u0010;\\\u000f\bGy\"'\u0010]BYu)d\u0010(uaXG%]n%pBwF\u0017\r\u0012m\u001c%w\u001bNaXi:h5\\\u0017\u0013qFU\\iL\u0013\u007fL\u001av\u0017H\u001fH", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u00025|1VSR5&W\u0004E]\u0013j\u0017L:\u0011\u000fbOmOT@\u001d\u00170S\u000b\u0006>g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010Uh}O=Tf4mU]'i:\u0004\u007f\u001du!\u0017wT8\u0013i^\u0011p(`cpF&\u0005<#Q7YPMz_Jtp\u001bT\u007f\u007f\u000eA\\~4>+\u000eA*\u007fC\u0005Ic,\u001ag|\u001d(kE1/$G\u0013=!J{vM\u0015l(+\r\u001fj~2)ncrL\u0019\u0010k`<Ej]\u0010;\\\u000f\n\u001f3\u0006", "/mR5b9>Rw\fv`\u001az\u0013:e", "/mS?b0=fb|\u0005f7\u0007\u0017//\u00012\fI\u007f\u0013&Ky\u0017\u0006x%Ch\u000e-7{_\nVA>uA\u001e\u0014Gn5\te(K}'5[J;\\\u0011nF\u0012\u0015d\u001bN*k\u0012UC\u0012lNB\u001fFw", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w)L9n>+\u0015g@F\u0003e.Js.G:](kR19\u001d\u0010]\u0018[+\fcf=&\\BA*\bj\u0015W", "\nrTA \u0006\u0017", "5dc\u000ea*A]&\r", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~[}.F}#.[\r\u001ax0 \u0017d^@\u0007?5Ly1TZ$", "Adc\u000ea*A]&\r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u0017\"Hg6 \u0011eh9bl*Q\u00014U\"\u0012\u001d", "/mR5b9L\u0012\u0018~\u0002^.x\u0018/", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "5dc\u0010b5?W&\u0007kZ3\r\t\rh{1}@?\u0018!Wx\r8\u0006)?bw-7t\u0016*[C", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "1ta?X5MD\u0015\u0006\u000b^", "5dc\u0010h9KS\"\u000ekZ3\r\t", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "Adc\u0010h9KS\"\u000ekZ3\r\t", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "1ta?X5MD\u0015\u0006\u000b^j{\t6e\u0002$\u000b@", "5dc\u0011X*:gt\b~f(\f\r9nm3{>", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001L\u0016,IW\u0017t8&\u0011weC\u0010Q7Nt|", "2qP4@<MS,", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\rEhy/Az}>\\CNA", "2qP4G(KU\u0019\u000e", "5dc\u0011e(@B\u0015\f|^;", "Adc\u0011e(@B\u0015\f|^;", "2qP4G(KU\u0019\u000e9],\u0004\t1a\u000f(", "7r0;\\4:b\u001d\t\u0004K<\u0006\u00123n\u0002", "u(I", ":`bAI,E]\u0017\u0003\nr", "5dc\u0019T:MD\u0019\u0006\u0005\\0\f\u001d", "u(5", "Adc\u0019T:MD\u0019\u0006\u0005\\0\f\u001d", "uE\u0018#", ":`bAI,E]\u0017\u0003\nrj{\t6e\u0002$\u000b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0001>w\u0012=;R7z4s", "=eU@X;", "5dc\u001cY-LS(", "Adc\u001cY-LS(", "=eU@X;|R\u0019\u0006z`(\f\t", "5dc\u001db:Bb\u001d\t\u0004Z3k\f<e\u000e+\u0006G\u007fU\u0018Q\u007f\u0017;r49c\u0007\u001aDm\u001d.IQ;", ">q^4e,La", "5dc\u001de6@`\u0019\r\t\u001d(\u0006\u00129t{7\u007fJ\n%", "u(E", "5dc\u001de6@`\u0019\r\t", ">q^4e,LaW}ze,~\u0005>e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "AdcA_,=D\u0015\u0006\u000b^", "5dc X;MZ\u0019}kZ3\r\t", "Adc X;MZ\u0019}kZ3\r\t", "AdcA_,=D\u0015\u0006\u000b^j{\t6e\u0002$\u000b@", "5dc a(I/\"\u0003\u0003Z;\u0001\u00138S\u000b(y", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0003sa7\\", "B`a4X;/O \u000fz", "5dc!T9@S(ove<|", "B`a4X;/O \u000fz\u001d+|\u0010/g{7{", "5dc#X3HQ\u001d\u000e\u000fM/\n\t=h\n/z~\u0002!'Pn\nKz/>S\u000b >m\u0012<M", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "/mR5b9>Rw\fv`", "", "2qP4C9B]&\u0003\nr", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\rEhy/7X#2WP?zHs", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w)L9n>+\u0015g@F\u0003e\u001aL\u00012G\"", "/mR5b9", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_/WSDj0-\u0019rj\u0003ns;J\u0006'2YR6iV\u0002Qix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0016O{{K8oJb)wQNOr9h\u0015_+&\u0018D-#u\"+d_2\u0014\u0005)TYWuxc\u0011 vA&\bWXKEmd\u0012", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn\u001di\r\u001cFm\u0001;QMHoC2jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0005tn2S\u0011Bl\nU\u0014\u0018Bt\u0001QZ\u0019G\b^SK2wJbouVEOk\u007f(rd\u0019m6\u0004+\u0010z\u001bdRM3\nybf", "1n\\=h;>B\u0015\f|^;", "Dd[<V0Mg", "uE;7T=:\u001d z\u0004`uf\u00064e}7Q!D}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019", "2hb=T;<V\u0006z\r=,\u0004\u0018+", "2d[AT", "<df\u001cY-LS(_\u0005k\u000b|\u0010>a", "<df\u001cY-LS(_\u0005k\u000b|\u0010>a>)\u0006P\n\u0016\u0013Vs\u0018Ep25`}\u001cEm", "4q^:", "Bn", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bE|(\u0013\u0011v\nExn\u001fV\u0003 5|kq.", "@d`B\\9>=\u001a\u007f\t^;", "AdcA_,", "uE;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007uzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "Bqh a(IB#", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "CoS.g,\u001a\\\u0017\u0002\u0005k:", "<df\u000ea*A]&\r", "<df!T9@S(", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u0017\"Hg6 \u0011eh9bl*Q\u00014U\"51Xcn\u0007\u001b\u000ec\u0010\u0018\u0015\n\nY?3D\b(", "\u0011n\\=T5B]\"", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AnchoredDraggableState$anchoredDragScope$1<T> anchoredDragScope;
    private final MutableState anchors$delegate;
    private final Function1<T, Boolean> confirmValueChange;
    private final MutableState currentValue$delegate;
    private final DecayAnimationSpec<Float> decayAnimationSpec;
    private final MutatorMutex dragMutex;
    private final MutableState dragTarget$delegate;
    private final MutableFloatState lastVelocity$delegate;
    private final MutableFloatState offset$delegate;
    private final Function1<Float, Float> positionalThreshold;
    private final State progress$delegate;
    private final MutableState settledValue$delegate;
    private final AnimationSpec<Float> snapAnimationSpec;
    private final State targetValue$delegate;
    private final Function0<Float> velocityThreshold;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUi\u0018\u000e\u0014\u001c \u0014\u0014t$\u0014\u001b\u001c\u0017\u0019$\u001e\r/\u001d1#", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {0}, l = {880}, m = "0>4:BF::\u001bJ:A", n = {"c^kY"}, s = {"xQ^"})
    static final class AnonymousClass3 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AnchoredDraggableState<T> anchoredDraggableState, Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return this.this$0.anchoredDrag(null, null, null, this);
        }
    }

    @Deprecated(message = "\u0018Y\u0001t\u0006|\u001a\u0017hY7\u0002b\u001a?a\u001cR\u001e5\b|\u0015a\u0005\u0006\u0003y\u000e\u00069kze$VUa(IX-:L\u0017i_9$]\\RjCBQ ^#\u0004.\u00079\u0005{\u0012x< \u000b~\n`*\u0017\u000e[]", replaceWith = @ReplaceWith(expression = "progress(state.settledValue, state.targetValue)", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getProgress$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState(T t2, Function1<? super Float, Float> function1, Function0<Float> function0, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Function1<? super T, Boolean> function12) {
        this.positionalThreshold = function1;
        this.velocityThreshold = function0;
        this.snapAnimationSpec = animationSpec;
        this.decayAnimationSpec = decayAnimationSpec;
        this.confirmValueChange = function12;
        this.dragMutex = new MutatorMutex();
        this.currentValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t2, null, 2, null);
        this.settledValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t2, null, 2, null);
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new Function0<T>(this) { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$targetValue$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                T t3 = (T) this.this$0.getDragTarget();
                if (t3 == null) {
                    AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                    if (!Float.isNaN(anchoredDraggableState.getOffset())) {
                        T tClosestAnchor = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                        return tClosestAnchor == null ? anchoredDraggableState.getCurrentValue() : tClosestAnchor;
                    }
                    return anchoredDraggableState.getCurrentValue();
                }
                return t3;
            }
        });
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Float>(this) { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState.progress.2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C04412(final AnchoredDraggableState<T> this) {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                float fPositionOf = this.this$0.getAnchors().positionOf(this.this$0.getSettledValue());
                float fPositionOf2 = this.this$0.getAnchors().positionOf(this.this$0.getTargetValue()) - fPositionOf;
                float fAbs = Math.abs(fPositionOf2);
                float f2 = 1.0f;
                if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                    float fRequireOffset = (this.this$0.requireOffset() - fPositionOf) / fPositionOf2;
                    if (fRequireOffset < 1.0E-6f) {
                        f2 = 0.0f;
                    } else if (fRequireOffset <= 0.999999f) {
                        f2 = fRequireOffset;
                    }
                }
                return Float.valueOf(f2);
            }
        });
        this.lastVelocity$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragTarget$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnchoredDraggableKt.emptyDraggableAnchors(), null, 2, null);
        this.anchoredDragScope = new AnchoredDraggableState$anchoredDragScope$1(this);
    }

    public final Function1<Float, Float> getPositionalThreshold$foundation_release() {
        return this.positionalThreshold;
    }

    public final Function0<Float> getVelocityThreshold$foundation_release() {
        return this.velocityThreshold;
    }

    public final AnimationSpec<Float> getSnapAnimationSpec() {
        return this.snapAnimationSpec;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$1 */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJe\u0003İY\u0006^\nND\u0005Ӭ:\u0012(\u000btkQ0\u000be\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7s", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~6\b*>m\u00127#"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass1 extends Lambda implements Function1<T, Boolean> {
        public static final AnonymousClass1 INSTANCE = ;

        AnonymousClass1() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(T t2) {
            return true;
        }
    }

    public final DecayAnimationSpec<Float> getDecayAnimationSpec() {
        return this.decayAnimationSpec;
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, Function1 function1, Function0 function0, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, Function1 function12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function1, function0, animationSpec, decayAnimationSpec, (-1) - (((-1) - i2) | ((-1) - 32)) != 0 ? AnonymousClass1.INSTANCE : function12);
    }

    public final Function1<T, Boolean> getConfirmValueChange$foundation_release() {
        return this.confirmValueChange;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$2 */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJe\u0003İY\u0006^\nND\u0005Ӭ:\u0012(\u000btkQ0\u000be\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7s", "7me<^,", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'\u0006\u0013(C9\u00158\u007f'~6\b*>m\u00127#"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function1<T, Boolean> {
        public static final AnonymousClass2 INSTANCE = ;

        AnonymousClass2() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(T t2) {
            return true;
        }
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, Function1 function1, Function0 function0, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, Function1 function12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, draggableAnchors, function1, function0, animationSpec, decayAnimationSpec, (i2 + 64) - (i2 | 64) != 0 ? AnonymousClass2.INSTANCE : function12);
    }

    public AnchoredDraggableState(T t2, DraggableAnchors<T> draggableAnchors, Function1<? super Float, Float> function1, Function0<Float> function0, AnimationSpec<Float> animationSpec, DecayAnimationSpec<Float> decayAnimationSpec, Function1<? super T, Boolean> function12) {
        this(t2, function1, function0, animationSpec, decayAnimationSpec, function12);
        setAnchors(draggableAnchors);
        trySnapTo(t2);
    }

    public final void setCurrentValue(T t2) {
        this.currentValue$delegate.setValue(t2);
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final void setSettledValue(T t2) {
        this.settledValue$delegate.setValue(t2);
    }

    public final T getSettledValue() {
        return this.settledValue$delegate.getValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue$delegate.getValue();
    }

    public final void setOffset(float f2) {
        this.offset$delegate.setFloatValue(f2);
    }

    public final float getOffset() {
        return this.offset$delegate.getFloatValue();
    }

    public final float requireOffset() {
        if (Float.isNaN(getOffset())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
        }
        return getOffset();
    }

    public final boolean isAnimationRunning() {
        return getDragTarget() != null;
    }

    public final float progress(T t2, T t3) {
        float fPositionOf = getAnchors().positionOf(t2);
        float fPositionOf2 = getAnchors().positionOf(t3);
        float fCoerceIn = (RangesKt.coerceIn(getOffset(), Math.min(fPositionOf, fPositionOf2), Math.max(fPositionOf, fPositionOf2)) - fPositionOf) / (fPositionOf2 - fPositionOf);
        if (Float.isNaN(fCoerceIn)) {
            return 1.0f;
        }
        if (fCoerceIn < 1.0E-6f) {
            return 0.0f;
        }
        if (fCoerceIn > 0.999999f) {
            return 1.0f;
        }
        return Math.abs(fCoerceIn);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$progress$2 */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,n\bDJd\u0003İY\u0006^\nND\u0005Ӭ:\u0012>\u000f¡n;6EsJ"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7me<^,", "u(;7T=:\u001d z\u0004`u]\u00109a\u000f}"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C04412 extends Lambda implements Function0<Float> {
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04412(final AnchoredDraggableState<T> this) {
            super(0);
            this.this$0 = this;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            float fPositionOf = this.this$0.getAnchors().positionOf(this.this$0.getSettledValue());
            float fPositionOf2 = this.this$0.getAnchors().positionOf(this.this$0.getTargetValue()) - fPositionOf;
            float fAbs = Math.abs(fPositionOf2);
            float f2 = 1.0f;
            if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                float fRequireOffset = (this.this$0.requireOffset() - fPositionOf) / fPositionOf2;
                if (fRequireOffset < 1.0E-6f) {
                    f2 = 0.0f;
                } else if (fRequireOffset <= 0.999999f) {
                    f2 = fRequireOffset;
                }
            }
            return Float.valueOf(f2);
        }
    }

    public final float getProgress() {
        return ((Number) this.progress$delegate.getValue()).floatValue();
    }

    public final void setLastVelocity(float f2) {
        this.lastVelocity$delegate.setFloatValue(f2);
    }

    public final float getLastVelocity() {
        return this.lastVelocity$delegate.getFloatValue();
    }

    public final T getDragTarget() {
        return this.dragTarget$delegate.getValue();
    }

    public final void setDragTarget(T t2) {
        this.dragTarget$delegate.setValue(t2);
    }

    private final void setAnchors(DraggableAnchors<T> draggableAnchors) {
        this.anchors$delegate.setValue(draggableAnchors);
    }

    public final DraggableAnchors<T> getAnchors() {
        return (DraggableAnchors) this.anchors$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$default(AnchoredDraggableState anchoredDraggableState, DraggableAnchors draggableAnchors, Object obj, int i2, Object obj2) {
        if ((i2 + 2) - (i2 | 2) != 0 && (Float.isNaN(anchoredDraggableState.getOffset()) || (obj = draggableAnchors.closestAnchor(anchoredDraggableState.getOffset())) == null)) {
            obj = anchoredDraggableState.getTargetValue();
        }
        anchoredDraggableState.updateAnchors(draggableAnchors, obj);
    }

    public final void updateAnchors(DraggableAnchors<T> draggableAnchors, T t2) {
        if (Intrinsics.areEqual(getAnchors(), draggableAnchors)) {
            return;
        }
        setAnchors(draggableAnchors);
        if (trySnapTo(t2)) {
            return;
        }
        setDragTarget(t2);
    }

    public final Object settle(float f2, Continuation<? super Float> continuation) {
        T currentValue = getCurrentValue();
        T tComputeTarget = computeTarget(requireOffset(), currentValue, f2);
        if (this.confirmValueChange.invoke(tComputeTarget).booleanValue()) {
            return AnchoredDraggableKt.animateToWithDecay(this, tComputeTarget, f2, continuation);
        }
        return AnchoredDraggableKt.animateToWithDecay(this, currentValue, f2, continuation);
    }

    private final T computeTarget(float f2, T t2, float f3) {
        DraggableAnchors<T> anchors = getAnchors();
        float fPositionOf = anchors.positionOf(t2);
        float fFloatValue = this.velocityThreshold.invoke().floatValue();
        if (fPositionOf == f2 || Float.isNaN(fPositionOf)) {
            return t2;
        }
        if (Math.abs(f3) >= Math.abs(fFloatValue)) {
            T tClosestAnchor = anchors.closestAnchor(f2, Math.signum(f3) > 0.0f);
            Intrinsics.checkNotNull(tClosestAnchor);
            return tClosestAnchor;
        }
        T tClosestAnchor2 = anchors.closestAnchor(f2, f2 - fPositionOf > 0.0f);
        Intrinsics.checkNotNull(tClosestAnchor2);
        return Math.abs(fPositionOf - f2) <= Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(fPositionOf - anchors.positionOf(tClosestAnchor2)))).floatValue()) ? t2 : tClosestAnchor2;
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, Function3 function3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, function3, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2 */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005P\r4Ȑ\r\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\""}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUi\u0018\u000e\u0014\u001c \u0014\u0014t$\u0014\u001b\u001c\u0017\u0019$\u001e\r/\u001d1#b!/%+37++\f;+2o~", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {835}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C04402 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> $block;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C04402(AnchoredDraggableState<T> anchoredDraggableState, Function3<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C04402> continuation) {
            super(1, continuation);
            this.this$0 = anchoredDraggableState;
            this.$block = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C04402(this.this$0, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C04402) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$1 */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJc\u0003İY\f@\r>BE\"Z\u0011\u0018\tlʑG0\u000bm߬2RY+"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0015\u0010a/X\u00045\u001d", "\"", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends Lambda implements Function0<DraggableAnchors<T>> {
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState) {
                super(0);
                anchoredDraggableState = anchoredDraggableState;
            }

            @Override // kotlin.jvm.functions.Function0
            public final DraggableAnchors<T> invoke() {
                return anchoredDraggableState.getAnchors();
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2 */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bDJc|\u0004W\u0006>éFB-!L\u0014}јtji:Rf`4bU:\u000f2{b&\"Ҡ0"}, d2 = {"\n`]<a@F])\rS", "", "\"", ":`c2f;\u001a\\\u0017\u0002\u0005k:", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0015\u0010a/X\u00045\u001d"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUi\u0018\u000e\u0014\u001c \u0014\u0014t$\u0014\u001b\u001c\u0017\u0019$\u001e\r/\u001d1#b!/%+37++\f;+2o~q\u0001", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {836}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class C00202 extends SuspendLambda implements Function2<DraggableAnchors<T>, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00202(Function3<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> function3, AnchoredDraggableState<T> anchoredDraggableState, Continuation<? super C00202> continuation) {
                super(2, continuation);
                this.$block = function3;
                this.this$0 = anchoredDraggableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00202 c00202 = new C00202(this.$block, this.this$0, continuation);
                c00202.L$0 = obj;
                return c00202;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DraggableAnchors<T> draggableAnchors, Continuation<? super Unit> continuation) {
                return ((C00202) create(draggableAnchors, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    DraggableAnchors<T> draggableAnchors = (DraggableAnchors) this.L$0;
                    Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> function3 = this.$block;
                    AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (function3.invoke(anchoredDraggableState$anchoredDragScope$1, draggableAnchors, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (AnchoredDraggableKt.restartable(new Function0<DraggableAnchors<T>>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag.2.1
                    final /* synthetic */ AnchoredDraggableState<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState) {
                        super(0);
                        anchoredDraggableState = anchoredDraggableState;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final DraggableAnchors<T> invoke() {
                        return anchoredDraggableState.getAnchors();
                    }
                }, new C00202(this.$block, this.this$0, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            T tClosestAnchor = this.this$0.getAnchors().closestAnchor(this.this$0.getOffset());
            if (tClosestAnchor != null) {
                if (Math.abs(this.this$0.getOffset() - this.this$0.getAnchors().positionOf(tClosestAnchor)) < 0.5f && this.this$0.getConfirmValueChange$foundation_release().invoke(tClosestAnchor).booleanValue()) {
                    this.this$0.setSettledValue(tClosestAnchor);
                    this.this$0.setCurrentValue(tClosestAnchor);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final Object anchoredDrag(MutatePriority mutatePriority, Function3<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) {
        Object objMutate = this.dragMutex.mutate(mutatePriority, new C04402(this, function3, null), continuation);
        return objMutate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMutate : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object anchoredDrag(T r8, androidx.compose.foundation.MutatePriority r9, kotlin.jvm.functions.Function4<? super androidx.compose.foundation.gestures.AnchoredDragScope, ? super androidx.compose.foundation.gestures.DraggableAnchors<T>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.AnchoredDraggableState.AnonymousClass3
            if (r0 == 0) goto L26
            r6 = r11
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 r6 = (androidx.compose.foundation.gestures.AnchoredDraggableState.AnonymousClass3) r6
            int r0 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L26
            int r0 = r6.label
            int r0 = r0 - r1
            r6.label = r0
        L13:
            java.lang.Object r5 = r6.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L38
            if (r0 != r3) goto L30
            java.lang.Object r1 = r6.L$0
            androidx.compose.foundation.gestures.AnchoredDraggableState r1 = (androidx.compose.foundation.gestures.AnchoredDraggableState) r1
            goto L2c
        L26:
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 r6 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3
            r6.<init>(r7, r11)
            goto L13
        L2c:
            kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> L5c
            goto L77
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            kotlin.ResultKt.throwOnFailure(r5)
            androidx.compose.foundation.gestures.DraggableAnchors r0 = r7.getAnchors()
            boolean r0 = r0.hasAnchorFor(r8)
            if (r0 == 0) goto L61
            androidx.compose.foundation.MutatorMutex r1 = r7.dragMutex     // Catch: java.lang.Throwable -> L59
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4     // Catch: java.lang.Throwable -> L59
            r0.<init>(r7, r8, r10, r2)     // Catch: java.lang.Throwable -> L59
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0     // Catch: java.lang.Throwable -> L59
            r6.L$0 = r7     // Catch: java.lang.Throwable -> L59
            r6.label = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = r1.mutate(r9, r0, r6)     // Catch: java.lang.Throwable -> L59
            if (r0 != r4) goto L76
            return r4
        L59:
            r0 = move-exception
            r1 = r7
            goto L5d
        L5c:
            r0 = move-exception
        L5d:
            r1.setDragTarget(r2)
            throw r0
        L61:
            kotlin.jvm.functions.Function1<T, java.lang.Boolean> r0 = r7.confirmValueChange
            java.lang.Object r0 = r0.invoke(r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7a
            r7.setSettledValue(r8)
            r7.setCurrentValue(r8)
            goto L7a
        L76:
            r1 = r7
        L77:
            r1.setDragTarget(r2)
        L7a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag(java.lang.Object, androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, Function4 function4, Continuation continuation, int i2, Object obj2) {
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, function4, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4 */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005P\r4Ȑ\r\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\""}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUi\u0018\u000e\u0014\u001c \u0014\u0014t$\u0014\u001b\u001c\u0017\u0019$\u001e\r/\u001d1#b!/%+37++\f;+2o\u0001", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {882}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class AnonymousClass4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(AnchoredDraggableState<T> anchoredDraggableState, T t2, Function4<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function4, Continuation<? super AnonymousClass4> continuation) {
            super(1, continuation);
            this.this$0 = anchoredDraggableState;
            this.$targetValue = t2;
            this.$block = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, this.$targetValue, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.setDragTarget(this.$targetValue);
                this.label = 1;
                if (AnchoredDraggableKt.restartable(new Function0<Pair<? extends DraggableAnchors<T>, ? extends T>>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag.4.1
                    final /* synthetic */ AnchoredDraggableState<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState) {
                        super(0);
                        anchoredDraggableState = anchoredDraggableState;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Pair<DraggableAnchors<T>, T> invoke() {
                        return TuplesKt.to(anchoredDraggableState.getAnchors(), anchoredDraggableState.getTargetValue());
                    }
                }, new AnonymousClass2(this.$block, this.this$0, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (this.this$0.getConfirmValueChange$foundation_release().invoke(this.$targetValue).booleanValue()) {
                ((AnchoredDraggableState) this.this$0).anchoredDragScope.dragTo(this.this$0.getAnchors().positionOf(this.$targetValue), this.this$0.getLastVelocity());
                this.this$0.setSettledValue(this.$targetValue);
                this.this$0.setCurrentValue(this.$targetValue);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$1 */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        /* JADX INFO: loaded from: classes.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!4i\bDZc|\u0004G\u0006>éFT\u000f*<\u0018\b\tvj\u007f1reX0bSp\u0010\u001azT&aҕ\u007fD\u0002]۟\u0002\"\u000fQ"}, d2 = {"\n`]<a@F])\rS", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0015\u0010a/X\u00045\u001d", "\"", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        static final class AnonymousClass1 extends Lambda implements Function0<Pair<? extends DraggableAnchors<T>, ? extends T>> {
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState) {
                super(0);
                anchoredDraggableState = anchoredDraggableState;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Pair<DraggableAnchors<T>, T> invoke() {
                return TuplesKt.to(anchoredDraggableState.getAnchors(), anchoredDraggableState.getTargetValue());
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2 */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        /* JADX INFO: loaded from: classes.dex */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,i\bDJc|\u0004W\u00068\u000bDB\rӬD\u0012&\u0006\u0007l?ӄRexD`TB!{\u0004D*k&\u0002C\u0002UH\u00012\u000b_N.g\u001dL!Ś\u0002"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\nmP:Xf?]&9y^:\f\u0016?c\u000f8\tD\n\u0019QRk\u001b8~%DY\u000bZ\u0002F", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa\u0015\u0010a/X\u00045\u001d"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wAz\u0005\f\u0006|z\u000f\u0005\f\fL\u0007\u0006\u0015\u0017\u0019\u0017\u000b\u001aUi\u0018\u000e\u0014\u001c \u0014\u0014t$\u0014\u001b\u001c\u0017\u0019$\u001e\r/\u001d1#b!/%+37++\f;+2o\u0001q\u0001", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {885}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<Pair<? extends DraggableAnchors<T>, ? extends T>, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function4<AnchoredDragScope, DraggableAnchors<T>, T, Continuation<? super Unit>, Object> $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(Function4<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function4, AnchoredDraggableState<T> anchoredDraggableState, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$block = function4;
                this.this$0 = anchoredDraggableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Pair<? extends DraggableAnchors<T>, ? extends T> pair, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2 for r6v1 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r0 = r6.label
                    r4 = 1
                    if (r0 == 0) goto L11
                    if (r0 != r4) goto L33
                    kotlin.ResultKt.throwOnFailure(r7)
                Le:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L11:
                    kotlin.ResultKt.throwOnFailure(r7)
                    java.lang.Object r0 = r6.L$0
                    kotlin.Pair r0 = (kotlin.Pair) r0
                    java.lang.Object r3 = r0.component1()
                    androidx.compose.foundation.gestures.DraggableAnchors r3 = (androidx.compose.foundation.gestures.DraggableAnchors) r3
                    java.lang.Object r2 = r0.component2()
                    kotlin.jvm.functions.Function4<androidx.compose.foundation.gestures.AnchoredDragScope, androidx.compose.foundation.gestures.DraggableAnchors<T>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r6.$block
                    androidx.compose.foundation.gestures.AnchoredDraggableState<T> r0 = r6.this$0
                    androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDragScope$1 r0 = androidx.compose.foundation.gestures.AnchoredDraggableState.access$getAnchoredDragScope$p(r0)
                    r6.label = r4
                    java.lang.Object r0 = r1.invoke(r0, r3, r2, r6)
                    if (r0 != r5) goto Le
                    return r5
                L33:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableState.AnonymousClass4.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }
    }

    public final float newOffsetForDelta$foundation_release(float f2) {
        return RangesKt.coerceIn((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + f2, getAnchors().minAnchor(), getAnchors().maxAnchor());
    }

    public final float dispatchRawDelta(float f2) {
        float fNewOffsetForDelta$foundation_release = newOffsetForDelta$foundation_release(f2);
        float offset = Float.isNaN(getOffset()) ? 0.0f : getOffset();
        setOffset(fNewOffsetForDelta$foundation_release);
        return fNewOffsetForDelta$foundation_release - offset;
    }

    private final boolean trySnapTo(T t2) {
        MutatorMutex mutatorMutex = this.dragMutex;
        boolean zTryLock = mutatorMutex.tryLock();
        if (zTryLock) {
            try {
                AnchoredDraggableState$anchoredDragScope$1<T> anchoredDraggableState$anchoredDragScope$1 = this.anchoredDragScope;
                float fPositionOf = getAnchors().positionOf(t2);
                if (!Float.isNaN(fPositionOf)) {
                    AnchoredDragScope.dragTo$default(anchoredDraggableState$anchoredDragScope$1, fPositionOf, 0.0f, 2, null);
                    setDragTarget(null);
                }
                setCurrentValue(t2);
                setSettledValue(t2);
            } finally {
                mutatorMutex.unlock();
            }
        }
        return zTryLock;
    }

    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"ЯB\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\u0007njO0LeV3Zݷ2\u000f\u0002{<řc$\bCCU0}*\tUOog\u0005JbŏK\u000f\u0014\u001f\u0001̓2նV\u000fزB\u000f`A0D9MڱA9nt~Ӕ\u001f@#P\f\u0015\t*0X\u0012\u0007z\nO:\u0015@B\u0001:\u0019\u0011{\u0007:\u0018\f=.\u0005F\\\u0016MfRzbR53\u0005yB|.\u000e6-W\u001bNl-\u001dxq\u001eYGe>EDa\r\u001fmkP\u0013N Dݾl1-7Yy]Ch\u0002\u001a\u001bQ]\u001d_\u0003&\u000b\f\u007fk<19^{Q`\u00108w)\u0003;L4 \f'V?E&v\n\u001e3;vcB`\u0002\rT.\u0006(;ж)\u0013"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w)L9n>+\u0015g@F\u0003e.Js.G:](kR1\u001b\u001e\u001ae\nW/\u0017\u000e/", "", "u(E", "!`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w)L9n>+\u0015g@F\u0003e.Js.G:](kRH", "\"", "AmP=45B[\u0015\u000e~h5j\u0014/c", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "", "2dR.l\bGW!z\nb6\u0006v:e}", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG~7k\u0012B)L?s0-\u0019rj'\u0012c*$", ">nb6g0H\\\u0015\u0006ia9|\u00172o\u0007'", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "2hbAT5<S", "Dd[<V0Mg\b\u0002\b^:\u007f\u00136d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "1n]3\\9FD\u0015\u0006\u000b^\n\u007f\u00058g\u007f", "", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Saver Saver$default(Companion companion, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, Function1 function1, Function0 function0, Function1 function12, int i2, Object obj) {
            if ((i2 + 16) - (i2 | 16) != 0) {
                function12 = new Function1<T, Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(T t2) {
                        return true;
                    }
                };
            }
            return companion.Saver(animationSpec, decayAnimationSpec, function1, function0, function12);
        }

        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(final AnimationSpec<Float> animationSpec, final DecayAnimationSpec<Float> decayAnimationSpec, final Function1<? super Float, Float> function1, final Function0<Float> function0, final Function1<? super T, Boolean> function12) {
            return SaverKt.Saver(new Function2<SaverScope, AnchoredDraggableState<T>, T>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$2
                @Override // kotlin.jvm.functions.Function2
                public final T invoke(SaverScope saverScope, AnchoredDraggableState<T> anchoredDraggableState) {
                    return anchoredDraggableState.getCurrentValue();
                }
            }, new Function1<T, AnchoredDraggableState<T>>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final AnchoredDraggableState<T> invoke(T t2) {
                    return new AnchoredDraggableState<>(t2, function1, function0, animationSpec, decayAnimationSpec, function12);
                }
            });
        }
    }
}
