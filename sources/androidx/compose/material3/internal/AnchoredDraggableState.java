package androidx.compose.material3.internal;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import com.drew.metadata.iptc.IptcDirectory;
import kotlin.Metadata;
import kotlin.Pair;
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
@Metadata(bv = {}, d1 = {"Яv\u001d<K!&˛\bDRш|\u0004G\u00068\u000bDB\u0007Ӭ4\u0012\u000e\u0007njG5Le^.ZS0\u0010s{J$cҕyCQU\"}(\tWNupvJ`\fK\u000f\u001c\u0016\u0001j2]]xs\u0012\u00172HrG3coE9f\f>\u0005.2*\u0600\u0002\u0005\u0017\u001a2Ϻ\u0018v\u0011CS\f(0HpPR\u0015˟\r\u001a(\u0006F \u00071bfdȤfT\u0006<5݊\u0011hrNU_h{5MЁS-!\u0007e,,X7kՖ5]\u0011\tjaO\u0005Oqsݛ\u0017*7JWwoQh\u0011$$YUոa|,c\u0015Wf\u00147-UiqY\u001e*\bz*\u0013j\t\u001e\u00105RF3*h\u0018\u000eaz!^PZ\u0010jZ\u0006\u000bcF\u0017S\u0006a8I<lQoI1iG\r\u0015\u001cTŀъr+a[\u001ef\u001b#dyW7wOMJ^\n\bM\u001c\tͲf\u00028\u0015p7\u00103\n\u0012F\u0017[ڛkX1%\u0004\u001dXUw\u00063fĈWsXOP(t\u001eG,\u000f\u0012\u0001Mt\u0007{P\u0003^Z\u0016]&b\u0011\u0016\u000e#\"lwj'S\u001b^Yvu\u0003Sm\f5/\u0015=\b{{/]9lAMls!qa-ܝ͖@l\u000b_vHY\u0014j^.(XWz\u0012\b{r^:\u0018\u0558Cq*Ft)''-H1irE\u000bNwZ\u001fɭ/Z9$\u00116<t7N\u00012~>\u007fJO+\rb2-oeE06j2jD|YȔ-võKqRN\\r\u001c}e}&\u001c@;a@M\"EȯȞ6\f3L\\xkY]\u0014-\u0001#?\u001fCx4w\nzpZ,\u0019\u001b_X'$\r]!#64ѣ}aLL\u000eϑ\u0013ߏ_>WEK4J\u0019P|3jN+\u0007o0IM-qtMV\u0006bGQg\\yq>y\u0011#6\fu\u0019<e&o\u0019Г\f5֑<S_\u0006N(*t\u0013DNp\u001e\nR\u0011D\u0013CJQd\u001f\"f\u001e\u001b3\u000eh\u001d+;p\u0005/ǈ\u0017o\u0004\u0006tʅhϵG}\"3\fH\u001f#kg$ޮ{`\u0019\b'\n9\u0002ar AU \r̰\u0013\r>\\\f\u0018dG\u0002bƀ@\t2\ftW\u0016c[T в@~\u000e\u0004w\u000fE8rwI{&T/ִ\u001dHϖdEnzr\r\riK\u001e';a\t{\"l/\u00128If+e3j}\u0005\u0017)9 l9I.\u001f۞խI]I'J:\u0012&Am\u001auTL&\\5BFfiU\u001f6\u000f0\r\u0011\u001c̫\rЩz\u0012t3\u001757`\u0013|<L:\u0013\u0019^gr&ۮsLϸ{7Q|I8R\r\u001f\f+/v%;jM3MKz\u0014]س\u0006Vk\u0004\u000e .\r\u001ctWƸ߉\u0012f\u0018DkF$\u0005.b0\u001diЦ\"ɯ2J|ҚZc\u00168g\bC\u0004#^\u0010ŕ&$p19\u0002\u001eH[j\t\n\u001aؙ\u0012q\fOA'\bكӂn\u0094T-\u0011)SH!sr<\u0017i.o1\u0002\u001a-48\u0007\u001dp5(Usj\u0001k}a;8Խo0iɵHT$\u001a-\u0017F\u001d8r@\u0015qۮ\u0004|;Ӹϣlܣ[\u0018fl.\u0006\u0003.A\u0016\u0003\u001eV~a@BT\u000b9t@G(UʺǏKj\r\u000bUO,)ATE!]A\u001bq8v?\u0013hgKʕ,ш\rx\bלD/LwK>w\u00032\u0013|\u0003\\ɔu<P\u001dD\u0011Dıe\u001fv`\u0015ѕә\u001cՀUCI\u001b\u0017*#S\u001eq\r?C\u000bqU+Q\u000f%Q\u0019M$Ikh\u001f\u000e\u008b%˧\u0013o#ʰ7h3a}N=\u000b8ʆz\u0005[xn\u0011w+\u007fʿ{^8\u0016\u0017\u0097ʸ\u001f\u009d(\u0016}%\u0006t?cBabmd\u0014w\u0006,XD\u0017\u00155U\u001d\u0011s8]@ѣu\u008c_g<С\u0013\u0016\u001fvL]}{\u0015yeh(\u001bzQӘ\u0018;'\b/g%2`x\u007fvCI!S_`kQ+s2@h&t:\u001eʦü*ƭ1\"\\ep&{\u000ew\u0012>I\u001bE$y7\fn:1F&dcvt<\r|[Vz\u000bn\u0015Z#l\u0003bƌʞ\u0016ǽL'\n\u007fP!#OKIy\u007fUJv}'\\\u001f\u0016u33k\u0003bOf\u0002gk?ߵ\u000fwP_Ekb\re#QjQ\u001e\u0010l;.u\\l\u001f\u0001ӆ\bکIjPϡ\\zJi{T\u0001I^ArC\f\u0007Rd\u0014ռǢeܢ6l?]jU9YopX\u00191eI\u001b\u0011UY\u0019IǺT\u0018\u0010ޮׄsԿ5H\u0004\nb\u0011c\u001f\u0006K\u0016IojqG\u0014IGG[nfem\u001f\u0006JUǌ\"η(\f\u001bڡzi\u00192\u001ckϒ\u00075"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\nVA>uA\u001e\u0014Gn5\te(K}'5[J;\\(", "\"", "", "7mXA\\(ED\u0015\u0006\u000b^", "/mR5b9L", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\rZ?=m0\u001b\u001ch=B\u0005f6[\u0005|", ">nb6g0H\\\u0015\u0006ia9|\u00172o\u0007'", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "Bnc._\u000bBa(z\u0004\\,", "Dd[<V0Mg\b\u0002\b^:\u007f\u00136d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "1n]3\\9FD\u0015\u0006\u000b^\n\u007f\u00058g\u007f", "<df#T3NS", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_6IR;x8\u001a\u001c6+=\u0010r,[\u007f#N\u0016-9XTt9\u0011\u0019ZiW)\u0010\u000ffOyUJA.\u000f0RK@y\tU\u0017\u001e>h\u007fF`\u0019UCu\u0006J'wJchE\u001d(Kl9k\u0010hfaKBm\u0015\u0002\"\u0019wT8\u0013\n\u001dq\u0003[wvkQ\"E\u000e\u000b:vZSOsTO>%)S\u0007\u0002 2\"p4x5\u007fC.@mNIq%>(T\u001e0d=6*@E\u0001JKaKSD\u0018w&e\u0011WgF9bfulF\u001e\u000bg i~Bo\n5a\nHR;jj7", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u0010/\u00025|1VSR5&W\u0004E]\u0013j\u0017L:\u0011\u000fbOmOT@\u001d\u00170S\u000b\u0006>g\b\u001f\rBttAiYE\u0004\u001d\u0001K7h\u0010Uh}O=Tf4mU]'i:\u0004\u007f\u001du!\u0017wT8\u0013i^\u0011p(`mqV ~AmC~c\u0010F\u007f^:\u0004+)T\nArBar:x7\r\u007f\u007fyU", "/mR5b9>Rw\fv`\u001az\u0013:e", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\nVA>uA\u001e\u0014Gn5\tQ*X\u0002'\u001d", "\nrTA \u0006\u0017", "5dc\u000ea*A]&\r", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDn9b\r Dv\u00125\u0017\"Hg6 \u0011eh9bl*Q\u00014U\"", "Adc\u000ea*A]&\r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@)>h}-@i\u001dw,P7m6\u001a\u0012oa\u0015\u0010a/X\u00045\u001d\u0010?", "/mR5b9L\u0012\u0018~\u0002^.x\u0018/", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "5dc\u000ea0FO(\u0003\u0005g\u001a\b\t-", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(E<\n\u001b\u001fC~\u0012F\u007fn3c\u000b \u0001I\u001f2U?Jo>'\u0003sa7\\", "1k^@X:MD\u0015\u0006\u000b^", "5dc\u0010_6LS'\u000ekZ3\r\tmm{7{M\u0005\u0013\u001e\u0015i\u001b<}%1g}", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1k^@X:MD\u0015\u0006\u000b^j{\t6e\u0002$\u000b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "5dc\u0010b5?W&\u0007kZ3\r\t\rh{1}@?\u001f\u0013Vo\u001b@r,\u0003S\u000b >m\u0012<M", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "1ta?X5MD\u0015\u0006\u000b^", "5dc\u0010h9KS\"\u000ekZ3\r\t", "Adc\u0010h9KS\"\u000ekZ3\r\t", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?1", "1ta?X5MD\u0015\u0006\u000b^j{\t6e\u0002$\u000b@", "2qP4@<MS,", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\u0012VR;x=\u001a\u001cPqH\u0003r6[^7VLa\u0002", "2qP4G(KU\u0019\u000e", "5dc\u0011e(@B\u0015\f|^;", "Adc\u0011e(@B\u0015\f|^;", "2qP4G(KU\u0019\u000e9],\u0004\t1a\u000f(", "2qP4Z(;Z\u0019l\nZ;|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w,P7m6\u001a\u0012oa'\u0016_;NL", "5dc\u0011e(@U\u0015{\u0002^\u001a\f\u0005>e>0wO\u0001$\u001bCv[6\u0004%<Yy.7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~[}.F}#.[\r\u001ax0 \u0017d^@\u0007Q;J\u0006'\u001d", "7r0;\\4:b\u001d\t\u0004K<\u0006\u00123n\u0002", "u(I", ":`bAI,E]\u0017\u0003\nr", "5dc\u0019T:MD\u0019\u0006\u0005\\0\f\u001d", "u(5", "Adc\u0019T:MD\u0019\u0006\u0005\\0\f\u001d", "uE\u0018#", ":`bAI,E]\u0017\u0003\nrj{\t6e\u0002$\u000b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u0001>w\u0012=;R7z4s", "=eU@X;", "5dc\u001cY-LS(", "Adc\u001cY-LS(", "=eU@X;|R\u0019\u0006z`(\f\t", "5dc\u001db:Bb\u001d\t\u0004Z3k\f<e\u000e+\u0006G\u007fU\u001fC~\u000eIz!<'w-7t\u0016*[C", ">q^4e,La", "5dc\u001de6@`\u0019\r\t", ">q^4e,LaW}ze,~\u0005>e", "B`a4X;/O \u000fz", "5dc!T9@S(ove<|", "B`a4X;/O \u000fz\u001d+|\u0010/g{7{", "5dc#X3HQ\u001d\u000e\u000fM/\n\t=h\n/z~\t\u0013&G|\u00128}r/f}'7i$.", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", "/mR5b9>Rw\fv`", "", "2qP4C9B]&\u0003\nr", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\rEhy/7X#2WP?zHs", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_/WSDj0-\u0019rj\u0003ns;J\u0006'2YR6iV\u0002Qix`\u0018]2\u0011\u000e#F5v\u000e8/\u0011*X\u0006Eq\u000fUv\u001e>h\u007fF`\u0019\u0016O{{K8oJb)wQNOr9h\u0015_+&\u0018D-#u\"+d_2\u0014\u0005)TYWuxc\u0011 vA&\bWXKEmd\u0012", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn\u001di\r\u001cFm\u0001;QMHoC2jOgC\u0016j0W@,XT\u0018-l[pL\u0018\u001cc\u001c\u0018\f\u001d\u000eWP(xM\u0005tn2S\u0011Bl\nU\u0014\u0018Bt\u0001QZ\u0019G\b^SK2wJbouVEOk\u007f(rd\u0019m6\u0004+\u0010z\u001bdRM3\nybf", "1n\\=h;>B\u0015\f|^;", "Dd[<V0Mg", "uE;7T=:\u001d z\u0004`uf\u00064e}7Q!D}\u001cC\u0001\n\u0006}!>[G\n4r\u0016,\\\u0019", "1n\\=h;>B\u0015\f|^;n\r>h\n8\u000b/\u0004$\u0017Ur\u0018Cu3", "uE;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#", "2hb=T;<V\u0006z\r=,\u0004\u0018+", "2d[AT", "<df\u001cY-LS(_\u0005k\u000b|\u0010>a", "<df\u001cY-LS(_\u0005k\u000b|\u0010>a>0wO\u0001$\u001bCv[6\u0004%<Yy.7", "@d`B\\9>=\u001a\u007f\t^;", "AdcA_,", "uE;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^! Vs\u0017Lr49c\u0007uzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "Bqh a(IB#", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "CoS.g,\u001a\\\u0017\u0002\u0005k:", "<df\u000ea*A]&\r", "<df!T9@S(", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\u0004<\u0010\u0017$Kk\u0015\n@)>h}-@i\u001dw,P7m6\u001a\u0012oa\u0015\u0010a/X\u00045\u001d3S(mN<D\u0010\u001b\\W8(\u0012\u0005WPy25", "\u0011n\\=T5B]\"", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AnchoredDragScope anchoredDragScope;
    private final MutableState anchors$delegate;
    private final AnimationSpec<Float> animationSpec;
    private final State closestValue$delegate;
    private final Function1<T, Boolean> confirmValueChange;
    private final MutableState currentValue$delegate;
    private final InternalMutatorMutex dragMutex;
    private final MutableState dragTarget$delegate;
    private final DraggableState draggableState;
    private final MutableFloatState lastVelocity$delegate;
    private final MutableFloatState offset$delegate;
    private final Function1<Float, Float> positionalThreshold;
    private final State progress$delegate;
    private final State targetValue$delegate;
    private final Function0<Float> velocityThreshold;

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1 */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\b\u000e\u0015\u0007\u0015\u0012\u0006\u0012Th\u0017\r\u0013\u001b\u001f\u0013\u0013s#\u0013\u001a\u001b\u0016\u0018#\u001d\f.\u001c0\"", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {0}, l = {520}, m = "0>4:BF::\u001bJ:A", n = {"c^kY"}, s = {"xQ^"})
    static final class C07201 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07201(AnchoredDraggableState<T> anchoredDraggableState, Continuation<? super C07201> continuation) {
            super(continuation);
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            int i2 = this.label;
            this.label = (i2 - Integer.MIN_VALUE) - (i2 & Integer.MIN_VALUE);
            return this.this$0.anchoredDrag(null, null, this);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$3 */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\b\u000e\u0015\u0007\u0015\u0012\u0006\u0012Th\u0017\r\u0013\u001b\u001f\u0013\u0013s#\u0013\u001a\u001b\u0016\u0018#\u001d\f.\u001c0\"", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {0}, l = {IptcDirectory.TAG_DATE_CREATED}, m = "0>4:BF::\u001bJ:A", n = {"c^kY"}, s = {"xQ^"})
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
            this.label |= Integer.MIN_VALUE;
            return this.this$0.anchoredDrag(null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState(T t2, Function1<? super Float, Float> function1, Function0<Float> function0, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function12) {
        this.positionalThreshold = function1;
        this.velocityThreshold = function0;
        this.animationSpec = animationSpec;
        this.confirmValueChange = function12;
        this.dragMutex = new InternalMutatorMutex();
        this.draggableState = new AnchoredDraggableState$draggableState$1(this);
        this.currentValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t2, null, 2, null);
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new Function0<T>(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$targetValue$2
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
                    float offset = anchoredDraggableState.getOffset();
                    return !Float.isNaN(offset) ? (T) anchoredDraggableState.computeTarget(offset, anchoredDraggableState.getCurrentValue(), 0.0f) : anchoredDraggableState.getCurrentValue();
                }
                return t3;
            }
        });
        this.closestValue$delegate = SnapshotStateKt.derivedStateOf(new Function0<T>(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$closestValue$2
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
                    float offset = anchoredDraggableState.getOffset();
                    return !Float.isNaN(offset) ? (T) anchoredDraggableState.computeTargetWithoutThresholds(offset, anchoredDraggableState.getCurrentValue()) : anchoredDraggableState.getCurrentValue();
                }
                return t3;
            }
        });
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0<Float>(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$progress$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Float invoke() {
                float fPositionOf = this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue());
                float fPositionOf2 = this.this$0.getAnchors().positionOf(this.this$0.getClosestValue$material3_release()) - fPositionOf;
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
        this.anchoredDragScope = new AnchoredDragScope(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDragScope$1
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.compose.material3.internal.AnchoredDragScope
            public void dragTo(float f2, float f3) {
                this.this$0.setOffset(f2);
                this.this$0.setLastVelocity(f3);
            }
        };
    }

    public final Function1<Float, Float> getPositionalThreshold$material3_release() {
        return this.positionalThreshold;
    }

    public final Function0<Float> getVelocityThreshold$material3_release() {
        return this.velocityThreshold;
    }

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$1 */
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

    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function1, function0, animationSpec, (i2 + 16) - (i2 | 16) != 0 ? AnonymousClass1.INSTANCE : function12);
    }

    public final Function1<T, Boolean> getConfirmValueChange$material3_release() {
        return this.confirmValueChange;
    }

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$2 */
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

    public /* synthetic */ AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, draggableAnchors, function1, function0, animationSpec, (i2 & 32) != 0 ? AnonymousClass2.INSTANCE : function12);
    }

    public AnchoredDraggableState(T t2, DraggableAnchors<T> draggableAnchors, Function1<? super Float, Float> function1, Function0<Float> function0, AnimationSpec<Float> animationSpec, Function1<? super T, Boolean> function12) {
        this(t2, function1, function0, animationSpec, function12);
        setAnchors(draggableAnchors);
        trySnapTo(t2);
    }

    public final DraggableState getDraggableState$material3_release() {
        return this.draggableState;
    }

    public final void setCurrentValue(T t2) {
        this.currentValue$delegate.setValue(t2);
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue$delegate.getValue();
    }

    public final T getClosestValue$material3_release() {
        return (T) this.closestValue$delegate.getValue();
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
        if ((-1) - (((-1) - i2) | ((-1) - 2)) != 0 && (Float.isNaN(anchoredDraggableState.getOffset()) || (obj = draggableAnchors.closestAnchor(anchoredDraggableState.getOffset())) == null)) {
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

    public final Object settle(float f2, Continuation<? super Unit> continuation) {
        T currentValue = getCurrentValue();
        T tComputeTarget = computeTarget(requireOffset(), currentValue, f2);
        if (this.confirmValueChange.invoke(tComputeTarget).booleanValue()) {
            Object objAnimateTo = AnchoredDraggableKt.animateTo(this, tComputeTarget, f2, continuation);
            return objAnimateTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo : Unit.INSTANCE;
        }
        Object objAnimateTo2 = AnchoredDraggableKt.animateTo(this, currentValue, f2, continuation);
        return objAnimateTo2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo2 : Unit.INSTANCE;
    }

    public final T computeTarget(float f2, T t2, float f3) {
        T tClosestAnchor;
        DraggableAnchors<T> anchors = getAnchors();
        float fPositionOf = anchors.positionOf(t2);
        float fFloatValue = this.velocityThreshold.invoke().floatValue();
        if (fPositionOf != f2 && !Float.isNaN(fPositionOf)) {
            if (fPositionOf < f2) {
                if (f3 >= fFloatValue) {
                    T tClosestAnchor2 = anchors.closestAnchor(f2, true);
                    Intrinsics.checkNotNull(tClosestAnchor2);
                    return tClosestAnchor2;
                }
                tClosestAnchor = anchors.closestAnchor(f2, true);
                Intrinsics.checkNotNull(tClosestAnchor);
                if (f2 < Math.abs(fPositionOf + Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(anchors.positionOf(tClosestAnchor) - fPositionOf))).floatValue()))) {
                    return t2;
                }
            } else {
                if (f3 <= (-fFloatValue)) {
                    T tClosestAnchor3 = anchors.closestAnchor(f2, false);
                    Intrinsics.checkNotNull(tClosestAnchor3);
                    return tClosestAnchor3;
                }
                tClosestAnchor = anchors.closestAnchor(f2, false);
                Intrinsics.checkNotNull(tClosestAnchor);
                float fAbs = Math.abs(fPositionOf - Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(fPositionOf - anchors.positionOf(tClosestAnchor)))).floatValue()));
                if (f2 < 0.0f) {
                    if (Math.abs(f2) < fAbs) {
                        return t2;
                    }
                } else if (f2 > fAbs) {
                    return t2;
                }
            }
            return tClosestAnchor;
        }
        return t2;
    }

    public final T computeTargetWithoutThresholds(float f2, T t2) {
        T tClosestAnchor;
        DraggableAnchors<T> anchors = getAnchors();
        float fPositionOf = anchors.positionOf(t2);
        if (fPositionOf == f2 || Float.isNaN(fPositionOf)) {
            return t2;
        }
        if (fPositionOf < f2) {
            tClosestAnchor = anchors.closestAnchor(f2, true);
            if (tClosestAnchor == null) {
                return t2;
            }
        } else {
            tClosestAnchor = anchors.closestAnchor(f2, false);
            if (tClosestAnchor == null) {
                return t2;
            }
        }
        return tClosestAnchor;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object anchoredDrag(androidx.compose.foundation.MutatePriority r8, kotlin.jvm.functions.Function3<? super androidx.compose.material3.internal.AnchoredDragScope, ? super androidx.compose.material3.internal.DraggableAnchors<T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.internal.AnchoredDraggableState.C07201
            if (r0 == 0) goto L2d
            r6 = r10
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1 r6 = (androidx.compose.material3.internal.AnchoredDraggableState.C07201) r6
            int r0 = r6.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = (-1) - r0
            int r0 = (-1) - r2
            r1 = r1 | r0
            int r0 = (-1) - r1
            if (r0 == 0) goto L2d
            int r0 = r6.label
            int r0 = r0 - r2
            r6.label = r0
        L19:
            java.lang.Object r1 = r6.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.label
            r5 = 1056964608(0x3f000000, float:0.5)
            r3 = 1
            if (r0 == 0) goto L3f
            if (r0 != r3) goto L37
            java.lang.Object r3 = r6.L$0
            androidx.compose.material3.internal.AnchoredDraggableState r3 = (androidx.compose.material3.internal.AnchoredDraggableState) r3
            goto L33
        L2d:
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1 r6 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$1
            r6.<init>(r7, r10)
            goto L19
        L33:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Throwable -> L92
            goto L58
        L37:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3f:
            kotlin.ResultKt.throwOnFailure(r1)
            androidx.compose.material3.internal.InternalMutatorMutex r2 = r7.dragMutex     // Catch: java.lang.Throwable -> L8f
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2 r1 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2     // Catch: java.lang.Throwable -> L8f
            r0 = 0
            r1.<init>(r7, r9, r0)     // Catch: java.lang.Throwable -> L8f
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1     // Catch: java.lang.Throwable -> L8f
            r6.L$0 = r7     // Catch: java.lang.Throwable -> L8f
            r6.label = r3     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r0 = r2.mutate(r8, r1, r6)     // Catch: java.lang.Throwable -> L8f
            if (r0 != r4) goto L57
            return r4
        L57:
            r3 = r7
        L58:
            androidx.compose.material3.internal.DraggableAnchors r1 = r3.getAnchors()
            float r0 = r3.getOffset()
            java.lang.Object r2 = r1.closestAnchor(r0)
            if (r2 == 0) goto L8c
            float r1 = r3.getOffset()
            androidx.compose.material3.internal.DraggableAnchors r0 = r3.getAnchors()
            float r0 = r0.positionOf(r2)
            float r1 = r1 - r0
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto L8c
            kotlin.jvm.functions.Function1<T, java.lang.Boolean> r0 = r3.confirmValueChange
            java.lang.Object r0 = r0.invoke(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8c
            r3.setCurrentValue(r2)
        L8c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L8f:
            r4 = move-exception
            r3 = r7
            goto L93
        L92:
            r4 = move-exception
        L93:
            androidx.compose.material3.internal.DraggableAnchors r1 = r3.getAnchors()
            float r0 = r3.getOffset()
            java.lang.Object r2 = r1.closestAnchor(r0)
            if (r2 == 0) goto Lc7
            float r1 = r3.getOffset()
            androidx.compose.material3.internal.DraggableAnchors r0 = r3.getAnchors()
            float r0 = r0.positionOf(r2)
            float r1 = r1 - r0
            float r0 = java.lang.Math.abs(r1)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto Lc7
            kotlin.jvm.functions.Function1<T, java.lang.Boolean> r0 = r3.confirmValueChange
            java.lang.Object r0 = r0.invoke(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc7
            r3.setCurrentValue(r2)
        Lc7:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableState.anchoredDrag(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, Function3 function3, Continuation continuation, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, function3, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2 */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005P\r4Ȑ\r\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\""}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\b\u000e\u0015\u0007\u0015\u0012\u0006\u0012Th\u0017\r\u0013\u001b\u001f\u0013\u0013s#\u0013\u001a\u001b\u0016\u0018#\u001d\f.\u001c0\"a .$*26**\u000b:*1n}", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {521}, m = "8>GA>9(KJH>H?", n = {}, s = {})
    static final class C07212 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> $block;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C07212(AnchoredDraggableState<T> anchoredDraggableState, Function3<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super C07212> continuation) {
            super(1, continuation);
            this.this$0 = anchoredDraggableState;
            this.$block = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C07212(this.this$0, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C07212) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$1 */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!4i\bDJc\u0003İY\f@\r>BE\"Z\u0011\u0018\tlʑG0\u000bm߬2RY+"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\rZ?=m0\u001b\u001ch=B\u0005f6[\u0005|", "\"", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
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

        /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2 */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!,i\bDJc|\u0004W\u0006>éFB-!L\u0014}јtji:Rf`4bU:\u000f2{b&\"Ҡ0"}, d2 = {"\n`]<a@F])\rS", "", "\"", ":`c2f;\u001a\\\u0017\u0002\u0005k:", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\rZ?=m0\u001b\u001ch=B\u0005f6[\u0005|"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\b\u000e\u0015\u0007\u0015\u0012\u0006\u0012Th\u0017\r\u0013\u001b\u001f\u0013\u0013s#\u0013\u001a\u001b\u0016\u0018#\u001d\f.\u001c0\"a .$*26**\u000b:*1n}p\u007f", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {522}, m = "8>GA>9(KJH>H?", n = {}, s = {})
        static final class C01072 extends SuspendLambda implements Function2<DraggableAnchors<T>, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> $block;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C01072(Function3<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super Continuation<? super Unit>, ? extends Object> function3, AnchoredDraggableState<T> anchoredDraggableState, Continuation<? super C01072> continuation) {
                super(2, continuation);
                this.$block = function3;
                this.this$0 = anchoredDraggableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01072 c01072 = new C01072(this.$block, this.this$0, continuation);
                c01072.L$0 = obj;
                return c01072;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DraggableAnchors<T> draggableAnchors, Continuation<? super Unit> continuation) {
                return ((C01072) create(draggableAnchors, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    DraggableAnchors<T> draggableAnchors = (DraggableAnchors) this.L$0;
                    Function3<AnchoredDragScope, DraggableAnchors<T>, Continuation<? super Unit>, Object> function3 = this.$block;
                    AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                    this.label = 1;
                    if (function3.invoke(anchoredDragScope, draggableAnchors, this) == coroutine_suspended) {
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
                if (AnchoredDraggableKt.restartable(new Function0<DraggableAnchors<T>>() { // from class: androidx.compose.material3.internal.AnchoredDraggableState.anchoredDrag.2.1
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
                }, new C01072(this.$block, this.this$0, null), this) == coroutine_suspended) {
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

    /* JADX WARN: Removed duplicated region for block: B:57:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object anchoredDrag(T r8, androidx.compose.foundation.MutatePriority r9, kotlin.jvm.functions.Function4<? super androidx.compose.material3.internal.AnchoredDragScope, ? super androidx.compose.material3.internal.DraggableAnchors<T>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableState.anchoredDrag(java.lang.Object, androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, Function4 function4, Continuation continuation, int i2, Object obj2) {
        if ((i2 + 2) - (i2 | 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, function4, continuation);
    }

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4 */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005P\r4Ȑ\r\"rߥ6"}, d2 = {"\n`]<a@F])\rS", "", "\""}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\b\u000e\u0015\u0007\u0015\u0012\u0006\u0012Th\u0017\r\u0013\u001b\u001f\u0013\u0013s#\u0013\u001a\u001b\u0016\u0018#\u001d\f.\u001c0\"a .$*26**\u000b:*1n\u007f", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {569}, m = "8>GA>9(KJH>H?", n = {}, s = {})
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
                if (AnchoredDraggableKt.restartable(new Function0<Pair<? extends DraggableAnchors<T>, ? extends T>>() { // from class: androidx.compose.material3.internal.AnchoredDraggableState.anchoredDrag.4.1
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
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$1 */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!4i\bDZc|\u0004G\u0006>éFT\u000f*<\u0018\b\tvj\u007f1reX0bSp\u0010\u001azT&aҕ\u007fD\u0002]۟\u0002\"\u000fQ"}, d2 = {"\n`]<a@F])\rS", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\rZ?=m0\u001b\u001ch=B\u0005f6[\u0005|", "\"", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
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

        /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2 */
        /* JADX INFO: compiled from: AnchoredDraggable.kt */
        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я\u0014\u001d̉=!,i\bDJc|\u0004W\u00068\u000bDB\rӬD\u0012&\u0006\u0007l?ӄRexD`TB!{\u0004D*k&\u0002C\u0002UH\u00012\u000b_N.g\u001dL!Ś\u0002"}, d2 = {"\n`]<a@F])\rS", "", "\"", "\nmP:Xf?]&9y^:\f\u0016?c\u000f8\tD\n\u0019QRk\u001b8~%DY\u000bZ\u0002F", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\rZ?=m0\u001b\u001ch=B\u0005f6[\u0005|"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
        @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\u0002v\u000b|\u000b\u0003{\bOK\b\u000e\u0015\u0007\u0015\u0012\u0006\u0012Th\u0017\r\u0013\u001b\u001f\u0013\u0013s#\u0013\u001a\u001b\u0016\u0018#\u001d\f.\u001c0\"a .$*26**\u000b:*1n\u007fp\u007f", f = "\u000e:.28:,*\t6$)(!!*\"i&.", i = {}, l = {571}, m = "8>GA>9(KJH>H?", n = {}, s = {})
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
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2 for r6v1 'this'  java.lang.Object
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
                    androidx.compose.material3.internal.DraggableAnchors r3 = (androidx.compose.material3.internal.DraggableAnchors) r3
                    java.lang.Object r2 = r0.component2()
                    kotlin.jvm.functions.Function4<androidx.compose.material3.internal.AnchoredDragScope, androidx.compose.material3.internal.DraggableAnchors<T>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r6.$block
                    androidx.compose.material3.internal.AnchoredDraggableState<T> r0 = r6.this$0
                    androidx.compose.material3.internal.AnchoredDragScope r0 = androidx.compose.material3.internal.AnchoredDraggableState.access$getAnchoredDragScope$p(r0)
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
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableState.AnonymousClass4.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }
    }

    public final float newOffsetForDelta$material3_release(float f2) {
        return RangesKt.coerceIn((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + f2, getAnchors().minAnchor(), getAnchors().maxAnchor());
    }

    public final float dispatchRawDelta(float f2) {
        float fNewOffsetForDelta$material3_release = newOffsetForDelta$material3_release(f2);
        float offset = Float.isNaN(getOffset()) ? 0.0f : getOffset();
        setOffset(fNewOffsetForDelta$material3_release);
        return fNewOffsetForDelta$material3_release - offset;
    }

    /* JADX INFO: renamed from: androidx.compose.material3.internal.AnchoredDraggableState$trySnapTo$1 */
    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,i\bDJc\u0003İY\u0006^\nND\u0005Ӭ:\u0012>\u000f¡n96E"}, d2 = {"\n`]<a@F])\rS", "", "\"", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07221 extends Lambda implements Function0<Unit> {
        final /* synthetic */ T $targetValue;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07221(AnchoredDraggableState<T> anchoredDraggableState, T t2) {
            super(0);
            this.this$0 = anchoredDraggableState;
            t = t2;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
            AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
            T t2 = t;
            float fPositionOf = anchoredDraggableState.getAnchors().positionOf(t2);
            if (!Float.isNaN(fPositionOf)) {
                AnchoredDragScope.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
                anchoredDraggableState.setDragTarget(null);
            }
            anchoredDraggableState.setCurrentValue(t2);
        }
    }

    private final boolean trySnapTo(T t2) {
        return this.dragMutex.tryMutate(new Function0<Unit>(this) { // from class: androidx.compose.material3.internal.AnchoredDraggableState.trySnapTo.1
            final /* synthetic */ T $targetValue;
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C07221(AnchoredDraggableState<T> this, T t22) {
                super(0);
                this.this$0 = this;
                t = t22;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                AnchoredDragScope anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                T t22 = t;
                float fPositionOf = anchoredDraggableState.getAnchors().positionOf(t22);
                if (!Float.isNaN(fPositionOf)) {
                    AnchoredDragScope.dragTo$default(anchoredDragScope, fPositionOf, 0.0f, 2, null);
                    anchoredDraggableState.setDragTarget(null);
                }
                anchoredDraggableState.setCurrentValue(t22);
            }
        });
    }

    /* JADX INFO: compiled from: AnchoredDraggable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я<\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0015\"4\u0012}\u0007njO0LeV3Zݷ2\u000f\u0002{<$i-yّCU0}*\tUOog\u0005JbŏIƫ\u0007,ю\u001b,wT9b\u0018\u000f̓FoM3\u0016cK:x\u0007F\r082:\n\u0005G\u001eXK x\u000bC\u0012\u0010@2`v@Q\u001bQ-\u001a@\u0005n*\u000f#tm^8Xl\fA])3yPV?k@~]\r\rX7\u000f\u0007aL5n@e43^\u001b\"blO\u0012mxݘ\tr-3;OydFZ\u0006\u001a;9_\u000fmrTc3Z\u0011\u00165:gi[R\u001e(&\u0002*\u001dʆ\b\u001f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\nVA>uA\u001e\u0014Gn5\te(K}'5[J;\\\u0011PG\u001c\u001dV\u0017R5\u0016Z", "", "u(E", "!`e2e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001c8\b%1V\u0005 \u0001[\u0012?MP\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006z.DY\u000b)3t_\nVA>uA\u001e\u0014Gn5\te(K}'5[J;\\(", "\"", "/mX:T;B]\"l\u0006^*", "\u001a`]1e6BR,Hxh4\b\u0013=eI$\u0005D\t\u0013&Ky\u0017\u0006t/BYG{@q\u001e*\\GEt\")\u0015f7", "", "1n]3\\9FD\u0015\u0006\u000b^\n\u007f\u00058g\u007f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", ">nb6g0H\\\u0015\u0006ia9|\u00172o\u0007'", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "2hbAT5<S", "Dd[<V0Mg\b\u0002\b^:\u007f\u00136d", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(final AnimationSpec<Float> animationSpec, final Function1<? super T, Boolean> function1, final Function1<? super Float, Float> function12, final Function0<Float> function0) {
            return SaverKt.Saver(new Function2<SaverScope, AnchoredDraggableState<T>, T>() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$Companion$Saver$1
                @Override // kotlin.jvm.functions.Function2
                public final T invoke(SaverScope saverScope, AnchoredDraggableState<T> anchoredDraggableState) {
                    return anchoredDraggableState.getCurrentValue();
                }
            }, new Function1<T, AnchoredDraggableState<T>>() { // from class: androidx.compose.material3.internal.AnchoredDraggableState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final AnchoredDraggableState<T> invoke(T t2) {
                    return new AnchoredDraggableState<>(t2, function12, function0, animationSpec, function1);
                }
            });
        }
    }
}
