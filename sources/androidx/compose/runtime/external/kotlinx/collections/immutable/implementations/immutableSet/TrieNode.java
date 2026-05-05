package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
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
/* JADX INFO: compiled from: TrieNode.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я<\u001d<K!&˛\bDRш|İI\u0006>\u00116Ȑ\u0007\":!\u007f\u0007ljA0ZeP.Xk2\u000fy\u0005<$aAyCQU\"}(\nWN}gvJ`!IƤ\u001cǝ\u0017HTK[ތk\u0011?2pow2+0Z?t\u0005:\u0013!J\"f{\u0015\r(-`\u0018\u0007~SM\"\u0011^@\u001f>ň\u0011M\u0013\u001fR+N$\u000f\u001ftg|8Xxk=G+\u0013mRP=^^|{\u0011VZ5\u0013\u000fc4*n>߱\u0019%a\u000bOyiU\u001bE\u0002?\u0015h]ݐYɞ$[Do\u0018\u0014C-\u007f\u0011k\u000b>\\;ĩ\u0011\u00105DgcyRˎ,w\t\u0016U]\u0012)\u001e-X0=\u001a\u001dڜ<ޗ%va\\h\u0002\rD0~oN/%6đq9ӸjQoXaTE\u001a\u001d\rL%Gnitb-x\u001b+V\bQg҅n׀xR\u0018qUm:͏)\u0002ò\b0U w\u000f\u001fO/%e}i'/\u0004\u001aHzϙ=\u0005¾lSwu\u0011Y0\u0013.=:\u000b\u001cZzߟ3ߘ\u0001XfD)MR\u0381M}ݔ\u0017 j\u0018\u0005535fUxkzM\u0014܃SÄ\u0017;g\u0015\u0004\u000e\u0006;%3}rq7yR%6o@p\u001cpfpU<^j@:2~К@{\n]f\fA4Ɛu\u001cBTy3j>`\u0003Ldq\u0007\u0017\nrn \u0001d3ZѰ\u0018˅%\r\u000fitp\u001eiA\\:(x\"cۋ\u00029'Rm\"\u00176C#ȷ\u0003s\u000et0`Uz\u0005\u0016$w,*$DQW??#\u000f5ǻ`ĈsE\u0015\u0001s\u0001e\u0012U\u001d-}\u001dW\u0001.\u0016\n1ptsxzgTE$'b\u0001? d.{(¿یKcZ<$\u0002W%\u001b_LPH|;ȔLݒ1s00M-q)M\u001a\u0006HG\u0015\u0018Ӡ\u001as</z\u000fTv\u0016\b:\u001a.o\u0019Г\u000e6IQaY-@R*z:ZJ\u0001v6IO4٢7HO\u001d9\u0012F\u0007#5\u000eh\u0017,Cߞ\u0005ܪj\u0017}8L.\u000e,$G\fOvCS\u0013}Wu*\u0006K\u0013֥z\u0013\u0018$\u00141\u001d\u0014LC.\u000eod\u001f/4z^6װ?b\u0013yQUBjT\u000e\u001bEdi<؋)Ĕvc\u001dQJB\"=\u0007\u0012b4tVv\u0007\u0011In]B\u00015۰c\"\u0007NI\u0005\u001cH\u001b/ҕ6\u0001a\\QNx\u0010\u0017l5-TToЉV߰1\u000fSt[I084K7\u0006\u0004oBՄH\u0001+[0\u001bgSAg\u0005qv\u000fedTe%T؉VN0lG/\u000bRT\u0010\u001f\r)O)ŷ\u0011\u03a2|X\u0006a[ \u0011\u0019T)=љ+ݭv\u001f;\u001fM-kK\u001b\u00185AoSiD8(.h\u001cx1\\]\u000f\u0015L&DH]\n\u001cr\u0004\u0019\u0013\u0007܀2˸zx\u0001&F\bdQ27\u0010+vY\"լQD5b\u0005\u0006pR/xƠglq7\u001e0\u00110I\\\np=PSԔUӍ^\u0017frR\u0011\nݰ\t\u0019\u000eU-*/6\u000ecWR\u0016c\u05cftk]&UU=7BgA2b\u001e4Υ(ǡ44bR-AfONd?Ϟ\u001b܀\b\u0012l0@d#RY\u0018\u000b6`^?\u001azF;Cr{O\u001f/]\u001dG\u0017Ԃ2ـy*/Ij?QΠb\u0013}i\u000f\u0015\u0013:hu.l\t\tۥ\u0004g:w\u000fzKg?[:l\u0013\u0003VUSbZ\u000e<\u0013\u001e\u0011eդfԌn`(aSQa\bI\u0015\u000fLP\u0006\u001e\u000e_53masB\u0007\r\u0003\u001d?0ۧ\u001a\u009f$;\u0001IG\u000f\u001e\u001d\bjI\\Mez.R\u0002.p\r\u001d{X%`ZIeO,$mF\u0010\f/$ZԖ$߿0I?\u000eB_\u000b\u0007\u0007we;>*du\u000b#\u0010&\u0007D\"2y\u001a\u0004d\u0012ȥbС+\u0018'~V*[n7I[$\u0012\u000br\u000fu\u0018EK\u001e)iٚ-\u0014]\u000bX+wt}3j\u0015T\u0013\"\u000b\u00012ݦ:yU}\"]\u0014~*Zslzm\b̙>ؾB\u0011\u001b\u001b\u00101\u0001b0d+0?K-˯f`\u0007fYb9B?,loZ\u0010\u001b\u0006\u001c/vYў\u0002JnX[cUFYI(U*!M\u001biO\u001e+wlW?\fߎ\u0007\u05edi7\u0019\u0007bXcg\r\tcfcdY[0r9o_ZN\u001a0Y4P\u000e\tVc\\~T*}0fߣ~ڄ\u000bGkU4\u001fkWEi\rNz7\nfA/E\u000f\u0007R\u0004*sxJ3\u001e\u00171\u0015!\u001d\u00029b-\u00027ID\f\nlI\fޮ\u001c۞@\u0007oc9/4A_EY2nem_\bG\rM8+4\u0006\u0019%\u0011*[\u0014\u001cxw\t\\8f)~Á\b˴\u0017Fxf\u0013t:0<Bc^U\f!d,5qܪnٺ^t\u0017~gj*1,o/\tg']1\u0006\u001bN1(±\u0012ٔ\u0010\u0018|}tXl\u0019\u001e&\t:\u0010t5,q}X)fļ\u0004ۀ\u001en\u0002kx\u0011\b6\u001c4r\u0012\u000bf\u001bت\u0014BJa\u0005\u0019\u0015Qʪ\u001fQR|Q|~$Y\u0016rn<'lŲ\u0019ߘ1\u0005Y6/\u0014eF''uOR\"\u0010$\u001a]miXb&pqy%{\u0014եdŧ 0\u000bl\u001d>\u0015t4v\u0013&H\n{1BF\u0011ݰJޏ!'>\u0001\u0016+&\f+\u0007\u0003̻_\u0092U\u0002'ɯ|\u0001)'(Kw;M,!\u000fi^\u00165e`\u000brh^;-*\u0006M\u0016\u0019۴AιE\u0002\u00043e\u0003g6c+7\f\ny&\u001cy\"T}X)gkx\u0010\f5$Ȇ\u0013ƥ@eIӈ\"$/6\u0016(G\u0004NHXG؝'_"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp0V\u001f\u0011h\"yA\u0012rEY5", "\u0013", "", "0hc:T7", "", "0tU3X9", "", "uHJ\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016D\b", "=v]2W\tR", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012W:\r\u0012b=+8,G.\u0004)M\t?w\u0015u(\u00175w~EZ\u001b\u001d", "uHJ\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016g\u0013 F|\u0018@u8~W\b(Bw$.\u0017PKtC\"\u001dh+9\u001ar,[\u007f#N\u0016T6kYvF'[X\u0018U2\r\u0003hE.wR\u0001#\u00104Y\u00117e\b\f_\u0012>ypO_\fNC|\u0006P%eJ`c\t[+Wk*q\u001ab!g\u0010}\u0015", "5dc\u000f\\;FO$", "u(8", "Adc\u000f\\;FO$", "uH\u0018#", "5dc\u000fh-?S&", "u(J\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "Adc\u000fh-?S&", "uZ;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004q", ")KY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}", "5dc\u001cj5>Ru\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006v8DY\u000b)3t_4WRBo=1^fk@\u000ec*]z1PZ\u00180dZ\u0003L\u0010\u000fa\u000e\u0018/\u0016\u0014YN-jK\u0001\u0007\u0018;E~?o\u0005\u001b*wGspOd\u0013K\u0005j", "Adc\u001cj5>Ru\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW<\n45f\u0007\u001c>7\u001c8\\J?tGg\u0013rh@\u0007a;R\u00010U\u0016R4db\u00029\u0011\u0019ZWR4\u001c\u0005fJ u\u000e\u001f/\u0017(F\u0006Bl\u0010 \u007f >j}PY\u0014ROXf", "/cS", "3kT:X5M6\u0015\r}", "3kT:X5M", "AgX3g", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q$D}\u0013Pn\u001bFz$H#{*?x <M\rH{=-\u0019pa\u0003\u0007v;N\u00040CS\u00182fayA\u001d%$\fX2\u0014\u0005WP(xMEh\f4Q\u0012Jd}\u0013\u0016W9r{IV\u0018G\u0003$qP-rOg)}OIUq&a\u0013_\u000b\\I\u0004\u0013!u\u0019\u0004rO._", "/cS\u0012_,FS\"\u000eVm", ">nb6g0H\\\u0001z\td", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004g\u0013 F|\u0018@u8~W\b(Bw$.\u0017PKtC\"\u001dh+9\u001ar,[\u007f#N\u0016T6kYvF'[X\u0018U2\r\u0003hE.wR\u0001#\u00104Y\u00117e\b\f_\u0012=uwB^\u0010P\t\u0011\u0005E3qT#c\u0002OQT^'k\fM\u001dk\u0004)1\u0018q\u0002%gP\u0004", "1`[0h3:b\u0019l~s,", "1n[9\\:B]\"Zy]", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wZSDz8&\u00152aL\u0016c9Wr.\u0011RX;cV{P]\u0010d\u0015U+\u000b\u0014]K-|\u000e;'\u0010<X}8o\u0001U\u001a\u0016@qpJV\u0019Vu$yK2v\u0010]g\u0002WPA_1dy_,&)G(\u0014Z#\u001ah&", "1n[9\\:B]\"\\\u0005g;x\r8s_/{H\u0001 &", "", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}?5", "1n[9\\:B]\"kzf6\u000e\t", "1n[9\\:B]\"kzf6\u000e\t\u000fl\u007f0{I\u0010r&+x\r<\n", "7", "1n]AT0Ga", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q$D\f", "1n]AT0Gat\u0006\u0002", "=sW2e\u0015HR\u0019", "3kT:X5M/(b\u0004],\u0010", "7mS2k", "uH\u0018\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016", "3kT:X5Ma|}zg;\u0001\u0018CE\f8wG\u000f", "6`b\u001bb\n>Z Z\n", "7mS2k\u0016?1\u0019\u0006\u0002:;", "7mS2k\u0016?1\u0019\u0006\u0002:;;\u0016?n\u000f,\u0004@z$\u0017No\nJv", ";`Z2A6=S", "3kT:X5M6\u0015\r}*", "3kT:X5M\u001f", "3kT:X5M6\u0015\r}+", "3kT:X5M ", "=v]2e", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q$g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#'\"g=\u001d\"re8\u001a-*X~2QZNuib{L\u0018\u001aZWN>\u001c\u0005fJ u\u000e=)\u00173M\u000bN2~\u0016\u001d\u00155h\u007fF`\u0019UC\u0019}I9wBVfy\u0011ENq*q\u0015[$&\"J3\u0010n\u001d\"l_Bs\u000e\\\u0011\u007f`|kr\u001d\\a4-=zeJD\u0003\u001f:~/*U\nw[?h}:x5\u0004}*Is\u0005Xp\u0014E(~\u001f;cE09\u007f:\u001dFRcs{B\u0018q-+\f\u0016jE@\u0015blc\u0012\u0013\u000fh\u001e[=ah\u00103a\nHR}^+N\u0007Rju\u0012\u0010\u0007\u0012mt\u00132(X\u0001\u0003zC\"5", ";`Z2A6=St\u000e^g+|\u001c", "3kT:X5M7\"}zq", "<df\u0012_,FS\"\u000e]Z:\u007f", "<df\u0012_,FS\"\u000e", "uH8\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016d}\u0013Pn\u001bFz$H#{*?x <M\rH{=-\u0019pa\u0003\u0007v;N\u00040CS\u00182fayA\u001d%$\fX2\u0014\u0005WP(xMEh\f4Q\u0012Jd}\u0013\u0016W9s\u007fBc\u0019C\u0001^]Q8dC]f}VU/t3d\u0019m `E\u0010gzm\"\u001auZ2\t\u000f\u001d\u000f|Z\u0005quGb\bH-MqcF\u000fohKt4(G\u0003A\u0018<g{/}@M24=k\u0005Iv\u001cHg\u0007^0dI7529\u001a?\u0015g}wE\u000ep\u001fj\u0017\nq9;\"s/gP\u0017\u0017l\u0013X<aM\u0001F\u001ctKMo}1E~\u0018", ";ne283>[\u0019\b\nM6e\u0013.e", "uH8\u0019](OOb\u0006vg.Fr,j\u007f&\u000b\u0016dZ}Cx\rI\u0001)4lG\u001eAu!8[C\u0005xD'$li9Pc?]v4PHUub\\\u0002D\u0018\u001bmWL5\u0014\fY?3rN@-Q0Q\nKw|\t\u001d\u000e~nxM]\u0010Oy\u001e\u0005=8lPbmCKIMr9`\tf\u001dJ:Im\u0003~\u001d\u001bQZ-\nQ", ";tc.U3>/\u0018}", ";tc.g6K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp0V\u001f\u0011d\u0015\u0003O-vUYh\t*=Se\u0018d\u001b<-`A9$!G", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q$g\u0013 F|\u0018@u8~W\b(Bw$.\u0017PKtC\"\u001dh+9\u001ar,[\u007f#N\u0016T6kYvF'[X\u0018U2\r\u0003hE.wR\u0001#\u00104Y\u00117e\b\f_\u0012=uwB^\u0010P\t\u0011\u0005E3qT#c\u0002OQT^'k\fM\u001dk\u0004%$!\u007f\u001d)wP7\u0019^O\u001fu@yvDW\u001d\u00027$KC\u001f-AxTI~+\u001e^Eu\u001c:c~9tv\u0011D3Eh\rK1\u0018Qmx\"5XHp,@K\u001aCTv?jH\u0015o\u001f_\u0017\u0012l>?bimkX\u001e\u0003Z\u001e[~eg\f>R\u000e>R~\u00116J\tKiC\u0019\u0011\u000f4|aFJ\u001bB\u0001):3/c\u0011k\re\u0018q", ";tc.U3>/\u0018}Ve3", "7mc2e:>Q(\u0003\u0005g\u001a\u0001\u001e/R\u007f)", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012W:\r\u0012b=+8#7&\u0017('\fKq\u0010\f#c", ";tc.U3>/\u0018}Ze,\u0005\t8t[7", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q'| \u0016Ty\u0012;\nn3c\u0006+A{\u0016wZSDz8&\u00152aL\u0016c9Wr.\u0011RX;cV{P]\u0010d\u0015U+\u000b\u0014]K-|\u000e;'\u0010<X}8o\u0001U\u001a\u0017Dj}KR\u0017\u0011a%\u0005=&lM]n\u000e1SNb7r\u000fc(2}! \u001dp&%lOASy]\u0019}\\\bg1T)\u0004G(Fm%FX~UI}#&\u0015\u0002\u0002!9\\}>>+\u000e;16b\u0014Oq!L(|\u001d4lP##=<\\CSn|lF\u000eq.]\u0017\u0012l>?bimkX\u001e\u0003Z\u001e[#anJ&_\n>2y\u0014'\u001c", ";tc.U3>1#\u0006\u0002b:\u0001\u00138A~'", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}b<\n\u0016$Qs\rO@#?a\t*Em_;]LJo<\u001e^htH\u0007p5J}pMV]3`[\u0006\u0007\u0012\u001ca\u0015N)\u001c\tcJ28H?'\u0018;E~BhJ\u0010\u001e\u0019<jxB_\u001fC\t\u0019\u007fJ72Jag\nV=Bi*R\fnfG:G2\u0018\u007f(\u001bq_\u0011\u0006\nV~raVwkN\u0018zEy\u0002TWOD|_@s:hI\u0006\u007f\u001d<ftt\u0002=\rC.>dNKz'>k\u0002\u00113&G15=@\u001cR\u0015a\u007fsE\u000ef.e\u0012\u0017p~5!murD\f\u000e]`_=lf\u0001?R\u000fME~\u00191O\r\f_\u0002\u001d\u0019\u0016 jlI1\u001bcJ\t}H\"H\u001b\u0002\u0003<", ";tc.U3>1#\u0006\u0002b:\u0001\u00138A~'WG\b", ";tc.U3>1#\u0006\u0002b:\u0001\u00138R\u007f0\u0006Q\u0001", ";tc.U3>1#\u0006\u0002b:\u0001\u00138R\u007f0\u0006Q\u0001r\u001eN", ";tc.U3>1#\u0006\u0002b:\u0001\u00138R\u007f0\u0006Q\u0001v\u001eGw\u000eE\u0006\u0001D=\u0007\u001f7\u0001", ";tc.U3>1#\u0006\u0002b:\u0001\u00138R\u007f7wD\nr\u001eN", ";tc.U3>;#\u0010z>3|\u0011/n\u000f\u0017\u0006)\u000b\u0016\u0017", ";tc.U3>@\u0019\u0007\u0005o,", ";tc.U3>@\u0019\u0007\u0005o,X\u00106", ";tc.U3>@\u0019\u0007\u0005o,Z\t6l[7_I\u007f\u0017*", "1d[9<5=S,", ";tc.U3>@\u0019\u000evb5X\u00106", ";tc.U3>C$}vm,e\u0013.e[7_I\u007f\u0017*", "<nS2<5=S,", "<df\u001bb+>", "<nS24;\"\\\u0018~\u000e", "@d\\<i,", "@d\\<i,\u001cS \u0006Vm\u0010\u0006\b/x", "CoS.g,']\u0018~Vm\u0010\u0006\b/x", "\u0011n\\=T5B]\"", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TrieNode<E> {
    private int bitmap;
    private Object[] buffer;
    private MutabilityOwnership ownedBy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final TrieNode EMPTY = new TrieNode(0, new Object[0]);

    public TrieNode(int i2, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.bitmap = i2;
        this.buffer = objArr;
        this.ownedBy = mutabilityOwnership;
    }

    public final int getBitmap() {
        return this.bitmap;
    }

    public final void setBitmap(int i2) {
        this.bitmap = i2;
    }

    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final void setBuffer(Object[] objArr) {
        this.buffer = objArr;
    }

    public final MutabilityOwnership getOwnedBy() {
        return this.ownedBy;
    }

    public final void setOwnedBy(MutabilityOwnership mutabilityOwnership) {
        this.ownedBy = mutabilityOwnership;
    }

    public TrieNode(int i2, Object[] objArr) {
        this(i2, objArr, null);
    }

    private final boolean hasNoCellAt(int i2) {
        return (-1) - (((-1) - i2) | ((-1) - this.bitmap)) == 0;
    }

    public final int indexOfCellAt$runtime_release(int i2) {
        int i3 = this.bitmap;
        int i4 = i2 - 1;
        return Integer.bitCount((i4 + i3) - (i4 | i3));
    }

    private final E elementAtIndex(int i2) {
        return (E) this.buffer[i2];
    }

    private final TrieNode<E> nodeAtIndex(int i2) {
        Object obj = this.buffer[i2];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (TrieNode) obj;
    }

    private final TrieNode<E> addElementAt(int i2, E e2) {
        return new TrieNode<>((-1) - (((-1) - i2) & ((-1) - this.bitmap)), TrieNodeKt.addElementAtIndex(this.buffer, indexOfCellAt$runtime_release(i2), e2));
    }

    private final TrieNode<E> mutableAddElementAt(int i2, E e2, MutabilityOwnership mutabilityOwnership) {
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(i2);
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.addElementAtIndex(this.buffer, iIndexOfCellAt$runtime_release, e2);
            this.bitmap = i2 | this.bitmap;
            return this;
        }
        Object[] objArrAddElementAtIndex = TrieNodeKt.addElementAtIndex(this.buffer, iIndexOfCellAt$runtime_release, e2);
        int i3 = this.bitmap;
        return new TrieNode<>((i2 + i3) - (i2 & i3), objArrAddElementAtIndex, mutabilityOwnership);
    }

    private final TrieNode<E> updateNodeAtIndex(int i2, TrieNode<E> trieNode) {
        Object[] objArr = trieNode.buffer;
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (!(obj instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode = (TrieNode<E>) obj;
            }
        }
        Object[] objArr2 = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i2] = trieNode;
        return new TrieNode<>(this.bitmap, objArrCopyOf);
    }

    private final TrieNode<E> mutableUpdateNodeAtIndex(int i2, TrieNode<E> trieNode, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr = trieNode.buffer;
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (!(obj instanceof TrieNode)) {
                if (this.buffer.length == 1) {
                    trieNode.bitmap = this.bitmap;
                    return trieNode;
                }
                trieNode = (TrieNode<E>) obj;
            }
        }
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer[i2] = trieNode;
            return this;
        }
        Object[] objArr2 = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i2] = trieNode;
        return new TrieNode<>(this.bitmap, objArrCopyOf, mutabilityOwnership);
    }

    private final TrieNode<E> makeNodeAtIndex(int i2, int i3, E e2, int i4, MutabilityOwnership mutabilityOwnership) {
        E eElementAtIndex = elementAtIndex(i2);
        return makeNode(eElementAtIndex != null ? eElementAtIndex.hashCode() : 0, eElementAtIndex, i3, e2, i4 + 5, mutabilityOwnership);
    }

    private final TrieNode<E> moveElementToNode(int i2, int i3, E e2, int i4) {
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i2] = makeNodeAtIndex(i2, i3, e2, i4, null);
        return new TrieNode<>(this.bitmap, objArrCopyOf);
    }

    private final TrieNode<E> mutableMoveElementToNode(int i2, int i3, E e2, int i4, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer[i2] = makeNodeAtIndex(i2, i3, e2, i4, mutabilityOwnership);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i2] = makeNodeAtIndex(i2, i3, e2, i4, mutabilityOwnership);
        return new TrieNode<>(this.bitmap, objArrCopyOf, mutabilityOwnership);
    }

    private final TrieNode<E> makeNode(int i2, E e2, int i3, E e3, int i4, MutabilityOwnership mutabilityOwnership) {
        Object[] objArr;
        if (i4 > 30) {
            return new TrieNode<>(0, new Object[]{e2, e3}, mutabilityOwnership);
        }
        int iIndexSegment = TrieNodeKt.indexSegment(i2, i4);
        int iIndexSegment2 = TrieNodeKt.indexSegment(i3, i4);
        if (iIndexSegment != iIndexSegment2) {
            if (iIndexSegment < iIndexSegment2) {
                objArr = new Object[]{e2, e3};
            } else {
                objArr = new Object[]{e3, e2};
            }
            return new TrieNode<>((-1) - (((-1) - (1 << iIndexSegment)) & ((-1) - (1 << iIndexSegment2))), objArr, mutabilityOwnership);
        }
        return new TrieNode<>(1 << iIndexSegment, new Object[]{makeNode(i2, e2, i3, e3, i4 + 5, mutabilityOwnership)}, mutabilityOwnership);
    }

    private final TrieNode<E> removeCellAtIndex(int i2, int i3) {
        return new TrieNode<>(i3 ^ this.bitmap, TrieNodeKt.removeCellAtIndex(this.buffer, i2));
    }

    private final TrieNode<E> mutableRemoveCellAtIndex(int i2, int i3, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.removeCellAtIndex(this.buffer, i2);
            this.bitmap ^= i3;
            return this;
        }
        return new TrieNode<>(i3 ^ this.bitmap, TrieNodeKt.removeCellAtIndex(this.buffer, i2), mutabilityOwnership);
    }

    private final TrieNode<E> collisionRemoveElementAtIndex(int i2) {
        return new TrieNode<>(0, TrieNodeKt.removeCellAtIndex(this.buffer, i2));
    }

    private final TrieNode<E> mutableCollisionRemoveElementAtIndex(int i2, MutabilityOwnership mutabilityOwnership) {
        if (this.ownedBy == mutabilityOwnership) {
            this.buffer = TrieNodeKt.removeCellAtIndex(this.buffer, i2);
            return this;
        }
        return new TrieNode<>(0, TrieNodeKt.removeCellAtIndex(this.buffer, i2), mutabilityOwnership);
    }

    private final boolean collisionContainsElement(E e2) {
        return ArraysKt.contains((E[]) this.buffer, e2);
    }

    private final TrieNode<E> collisionAdd(E e2) {
        return collisionContainsElement(e2) ? this : new TrieNode<>(0, TrieNodeKt.addElementAtIndex(this.buffer, 0, e2));
    }

    private final TrieNode<E> mutableCollisionAdd(E e2, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        if (collisionContainsElement(e2)) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
        if (this.ownedBy == persistentHashSetBuilder.getOwnership$runtime_release()) {
            this.buffer = TrieNodeKt.addElementAtIndex(this.buffer, 0, e2);
            return this;
        }
        return new TrieNode<>(0, TrieNodeKt.addElementAtIndex(this.buffer, 0, e2), persistentHashSetBuilder.getOwnership$runtime_release());
    }

    private final TrieNode<E> collisionRemove(E e2) {
        int iIndexOf = ArraysKt.indexOf((E[]) this.buffer, e2);
        return iIndexOf != -1 ? collisionRemoveElementAtIndex(iIndexOf) : this;
    }

    private final TrieNode<E> mutableCollisionRemove(E e2, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        int iIndexOf = ArraysKt.indexOf((E[]) this.buffer, e2);
        if (iIndexOf == -1) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
        return mutableCollisionRemoveElementAtIndex(iIndexOf, persistentHashSetBuilder.getOwnership$runtime_release());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<E> mutableCollisionAddAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + trieNode.buffer.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        Object[] objArr2 = trieNode.buffer;
        int length = this.buffer.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr2.length) {
            CommonFunctionsKt.m3763assert(i3 <= i2);
            if (!collisionContainsElement(objArr2[i2])) {
                objArrCopyOf[length + i3] = objArr2[i2];
                i3++;
                CommonFunctionsKt.m3763assert(length + i3 <= objArrCopyOf.length);
            }
            i2++;
        }
        int length2 = i3 + this.buffer.length;
        deltaCounter.plusAssign(objArrCopyOf.length - length2);
        if (length2 == this.buffer.length) {
            return this;
        }
        if (length2 == trieNode.buffer.length) {
            return trieNode;
        }
        if (length2 != objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        }
        if (!Intrinsics.areEqual(this.ownedBy, mutabilityOwnership)) {
            return new TrieNode<>(0, objArrCopyOf, mutabilityOwnership);
        }
        this.buffer = objArrCopyOf;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRetainAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return this;
        }
        Object[] objArr = Intrinsics.areEqual(mutabilityOwnership, this.ownedBy) ? this.buffer : new Object[Math.min(this.buffer.length, trieNode.buffer.length)];
        Object[] objArr2 = this.buffer;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.m3763assert(i3 <= i2);
            if (trieNode.collisionContainsElement(objArr2[i2])) {
                objArr[i3] = objArr2[i2];
                i3++;
                CommonFunctionsKt.m3763assert(i3 <= objArr.length);
            }
            i2++;
        }
        deltaCounter.plusAssign(i3);
        if (i3 == 0) {
            return EMPTY;
        }
        if (i3 == 1) {
            return objArr[0];
        }
        if (i3 == this.buffer.length) {
            return this;
        }
        if (i3 != trieNode.buffer.length) {
            if (i3 == objArr.length) {
                return new TrieNode(0, objArr, mutabilityOwnership);
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i3);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            return new TrieNode(0, objArrCopyOf, mutabilityOwnership);
        }
        return trieNode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object mutableCollisionRemoveAll(TrieNode<E> trieNode, DeltaCounter deltaCounter, MutabilityOwnership mutabilityOwnership) {
        if (this == trieNode) {
            deltaCounter.plusAssign(this.buffer.length);
            return EMPTY;
        }
        Object[] objArr = Intrinsics.areEqual(mutabilityOwnership, this.ownedBy) ? this.buffer : new Object[this.buffer.length];
        Object[] objArr2 = this.buffer;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= objArr2.length) {
                break;
            }
            CommonFunctionsKt.m3763assert(i3 <= i2);
            if (!trieNode.collisionContainsElement(objArr2[i2])) {
                objArr[i3] = objArr2[i2];
                i3++;
                CommonFunctionsKt.m3763assert(i3 <= objArr.length);
            }
            i2++;
        }
        deltaCounter.plusAssign(this.buffer.length - i3);
        if (i3 == 0) {
            return EMPTY;
        }
        if (i3 == 1) {
            return objArr[0];
        }
        if (i3 == this.buffer.length) {
            return this;
        }
        if (i3 == objArr.length) {
            return new TrieNode(0, objArr, mutabilityOwnership);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i3);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        return new TrieNode(0, objArrCopyOf, mutabilityOwnership);
    }

    private final int calculateSize() {
        if (this.bitmap == 0) {
            return this.buffer.length;
        }
        int iCalculateSize = 0;
        for (Object obj : this.buffer) {
            iCalculateSize += obj instanceof TrieNode ? ((TrieNode) obj).calculateSize() : 1;
        }
        return iCalculateSize;
    }

    private final boolean elementsIdentityEquals(TrieNode<E> trieNode) {
        if (this == trieNode) {
            return true;
        }
        if (this.bitmap != trieNode.bitmap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.buffer[i2] != trieNode.buffer[i2]) {
                return false;
            }
        }
        return true;
    }

    public final boolean contains(int i2, E e2, int i3) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasNoCellAt(iIndexSegment)) {
            return false;
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
            if (i3 == 30) {
                return trieNodeNodeAtIndex.collisionContainsElement(e2);
            }
            return trieNodeNodeAtIndex.contains(i2, e2, i3 + 5);
        }
        return Intrinsics.areEqual(e2, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TrieNode<E> mutableAddAll(TrieNode<E> trieNode, int i2, DeltaCounter deltaCounter, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        Object objMakeNode;
        if (this == trieNode) {
            deltaCounter.setCount(deltaCounter.getCount() + calculateSize());
            return this;
        }
        if (i2 > 30) {
            return mutableCollisionAddAll(trieNode, deltaCounter, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int i3 = this.bitmap;
        int i4 = (-1) - (((-1) - trieNode.bitmap) & ((-1) - i3));
        TrieNode<E> trieNode2 = (i4 == i3 && Intrinsics.areEqual(this.ownedBy, persistentHashSetBuilder.getOwnership$runtime_release())) ? this : new TrieNode<>(i4, new Object[Integer.bitCount(i4)], persistentHashSetBuilder.getOwnership$runtime_release());
        int i5 = 0;
        while (i4 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i4);
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iLowestOneBit);
            int iIndexOfCellAt$runtime_release2 = trieNode.indexOfCellAt$runtime_release(iLowestOneBit);
            Object[] objArr = trieNode2.buffer;
            if (hasNoCellAt(iLowestOneBit)) {
                objMakeNode = trieNode.buffer[iIndexOfCellAt$runtime_release2];
            } else if (trieNode.hasNoCellAt(iLowestOneBit)) {
                objMakeNode = this.buffer[iIndexOfCellAt$runtime_release];
            } else {
                objMakeNode = this.buffer[iIndexOfCellAt$runtime_release];
                Object obj = trieNode.buffer[iIndexOfCellAt$runtime_release2];
                boolean z2 = objMakeNode instanceof TrieNode;
                boolean z3 = obj instanceof TrieNode;
                if (z2 && z3) {
                    Intrinsics.checkNotNull(objMakeNode, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    objMakeNode = ((TrieNode) objMakeNode).mutableAddAll((TrieNode) obj, i2 + 5, deltaCounter, persistentHashSetBuilder);
                } else if (z2) {
                    Intrinsics.checkNotNull(objMakeNode, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    TrieNode trieNode3 = (TrieNode) objMakeNode;
                    int size = persistentHashSetBuilder.size();
                    objMakeNode = trieNode3.mutableAdd(obj != null ? obj.hashCode() : 0, obj, i2 + 5, persistentHashSetBuilder);
                    if (persistentHashSetBuilder.size() == size) {
                        deltaCounter.setCount(deltaCounter.getCount() + 1);
                    }
                    Unit unit = Unit.INSTANCE;
                } else if (z3) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    TrieNode trieNode4 = (TrieNode) obj;
                    int size2 = persistentHashSetBuilder.size();
                    objMakeNode = trieNode4.mutableAdd(objMakeNode != null ? objMakeNode.hashCode() : 0, objMakeNode, i2 + 5, persistentHashSetBuilder);
                    if (persistentHashSetBuilder.size() == size2) {
                        deltaCounter.setCount(deltaCounter.getCount() + 1);
                    }
                    Unit unit2 = Unit.INSTANCE;
                } else if (Intrinsics.areEqual(objMakeNode, obj)) {
                    deltaCounter.setCount(deltaCounter.getCount() + 1);
                    Unit unit3 = Unit.INSTANCE;
                } else {
                    objMakeNode = makeNode(objMakeNode != null ? objMakeNode.hashCode() : 0, objMakeNode, obj != null ? obj.hashCode() : 0, obj, i2 + 5, persistentHashSetBuilder.getOwnership$runtime_release());
                }
            }
            objArr[i5] = objMakeNode;
            i5++;
            i4 ^= iLowestOneBit;
        }
        return elementsIdentityEquals(trieNode2) ? this : trieNode.elementsIdentityEquals(trieNode2) ? trieNode : trieNode2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object mutableRetainAll(TrieNode<E> trieNode, int i2, DeltaCounter deltaCounter, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        TrieNode trieNode2;
        if (this == trieNode) {
            deltaCounter.plusAssign(calculateSize());
            return this;
        }
        if (i2 > 30) {
            return mutableCollisionRetainAll(trieNode, deltaCounter, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int i3 = (-1) - (((-1) - this.bitmap) | ((-1) - trieNode.bitmap));
        if (i3 == 0) {
            return EMPTY;
        }
        TrieNode<E> trieNode3 = (Intrinsics.areEqual(this.ownedBy, persistentHashSetBuilder.getOwnership$runtime_release()) && i3 == this.bitmap) ? this : new TrieNode<>(i3, new Object[Integer.bitCount(i3)], persistentHashSetBuilder.getOwnership$runtime_release());
        int i4 = i3;
        int i5 = 0;
        int i6 = 0;
        while (i4 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i4);
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iLowestOneBit);
            int iIndexOfCellAt$runtime_release2 = trieNode.indexOfCellAt$runtime_release(iLowestOneBit);
            Object objMutableRetainAll = this.buffer[iIndexOfCellAt$runtime_release];
            Object obj = trieNode.buffer[iIndexOfCellAt$runtime_release2];
            boolean z2 = objMutableRetainAll instanceof TrieNode;
            boolean z3 = obj instanceof TrieNode;
            if (z2 && z3) {
                Intrinsics.checkNotNull(objMutableRetainAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                objMutableRetainAll = ((TrieNode) objMutableRetainAll).mutableRetainAll((TrieNode) obj, i2 + 5, deltaCounter, persistentHashSetBuilder);
            } else if (z2) {
                Intrinsics.checkNotNull(objMutableRetainAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                if (((TrieNode) objMutableRetainAll).contains(obj != null ? obj.hashCode() : 0, obj, i2 + 5)) {
                    deltaCounter.plusAssign(1);
                    objMutableRetainAll = obj;
                } else {
                    objMutableRetainAll = EMPTY;
                }
            } else if (z3) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                if (((TrieNode) obj).contains(objMutableRetainAll != null ? objMutableRetainAll.hashCode() : 0, objMutableRetainAll, i2 + 5)) {
                    deltaCounter.plusAssign(1);
                } else {
                    objMutableRetainAll = EMPTY;
                }
            } else if (Intrinsics.areEqual(objMutableRetainAll, obj)) {
                deltaCounter.plusAssign(1);
            } else {
                objMutableRetainAll = EMPTY;
            }
            if (objMutableRetainAll != EMPTY) {
                i5 |= iLowestOneBit;
            }
            trieNode3.buffer[i6] = objMutableRetainAll;
            i6++;
            i4 ^= iLowestOneBit;
        }
        int iBitCount = Integer.bitCount(i5);
        if (i5 == 0) {
            return EMPTY;
        }
        if (i5 == i3) {
            return trieNode3.elementsIdentityEquals(this) ? this : trieNode3.elementsIdentityEquals(trieNode) ? trieNode : trieNode3;
        }
        if (iBitCount == 1 && i2 != 0) {
            Object obj2 = trieNode3.buffer[trieNode3.indexOfCellAt$runtime_release(i5)];
            if (!(obj2 instanceof TrieNode)) {
                return obj2;
            }
            trieNode2 = new TrieNode(i5, new Object[]{obj2}, persistentHashSetBuilder.getOwnership$runtime_release());
        } else {
            Object[] objArr = new Object[iBitCount];
            Object[] objArr2 = trieNode3.buffer;
            int i7 = 0;
            int i8 = 0;
            while (i7 < objArr2.length) {
                CommonFunctionsKt.m3763assert(i8 <= i7);
                if (objArr2[i7] != Companion.getEMPTY$runtime_release()) {
                    objArr[i8] = objArr2[i7];
                    i8++;
                    CommonFunctionsKt.m3763assert(i8 <= iBitCount);
                }
                i7++;
            }
            trieNode2 = new TrieNode(i5, objArr, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        return trieNode2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mutableRemoveAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> r17, int r18, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter r19, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<?> r20) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode, int, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean containsAll(TrieNode<E> trieNode, int i2) {
        if (this == trieNode) {
            return true;
        }
        if (i2 > 30) {
            for (Object obj : trieNode.buffer) {
                if (!ArraysKt.contains(this.buffer, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i3 = this.bitmap;
        int i4 = trieNode.bitmap;
        int i5 = (i3 + i4) - (i3 | i4);
        if (i5 != i4) {
            return false;
        }
        while (i5 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i5);
            int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iLowestOneBit);
            int iIndexOfCellAt$runtime_release2 = trieNode.indexOfCellAt$runtime_release(iLowestOneBit);
            Object obj2 = this.buffer[iIndexOfCellAt$runtime_release];
            Object obj3 = trieNode.buffer[iIndexOfCellAt$runtime_release2];
            boolean z2 = obj2 instanceof TrieNode;
            boolean z3 = obj3 instanceof TrieNode;
            if (z2 && z3) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((TrieNode) obj2).containsAll((TrieNode) obj3, i2 + 5)) {
                    return false;
                }
            } else if (z2) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((TrieNode) obj2).contains(obj3 != null ? obj3.hashCode() : 0, obj3, i2 + 5)) {
                    return false;
                }
            } else if (z3 || !Intrinsics.areEqual(obj2, obj3)) {
                return false;
            }
            i5 ^= iLowestOneBit;
        }
        return true;
    }

    public final TrieNode<E> add(int i2, E e2, int i3) {
        TrieNode<E> trieNodeAdd;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasNoCellAt(iIndexSegment)) {
            return addElementAt(iIndexSegment, e2);
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime_release];
        if (!(obj instanceof TrieNode)) {
            return Intrinsics.areEqual(e2, obj) ? this : moveElementToNode(iIndexOfCellAt$runtime_release, i2, e2, i3);
        }
        TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
        if (i3 == 30) {
            trieNodeAdd = trieNodeNodeAtIndex.collisionAdd(e2);
        } else {
            trieNodeAdd = trieNodeNodeAtIndex.add(i2, e2, i3 + 5);
        }
        return trieNodeNodeAtIndex == trieNodeAdd ? this : updateNodeAtIndex(iIndexOfCellAt$runtime_release, trieNodeAdd);
    }

    public final TrieNode<E> mutableAdd(int i2, E e2, int i3, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        TrieNode<E> trieNodeMutableAdd;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasNoCellAt(iIndexSegment)) {
            persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
            return mutableAddElementAt(iIndexSegment, e2, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
            if (i3 == 30) {
                trieNodeMutableAdd = trieNodeNodeAtIndex.mutableCollisionAdd(e2, persistentHashSetBuilder);
            } else {
                trieNodeMutableAdd = trieNodeNodeAtIndex.mutableAdd(i2, e2, i3 + 5, persistentHashSetBuilder);
            }
            return trieNodeNodeAtIndex == trieNodeMutableAdd ? this : mutableUpdateNodeAtIndex(iIndexOfCellAt$runtime_release, trieNodeMutableAdd, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        if (Intrinsics.areEqual(e2, obj)) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() + 1);
        return mutableMoveElementToNode(iIndexOfCellAt$runtime_release, i2, e2, i3, persistentHashSetBuilder.getOwnership$runtime_release());
    }

    public final TrieNode<E> remove(int i2, E e2, int i3) {
        TrieNode<E> trieNodeRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasNoCellAt(iIndexSegment)) {
            return this;
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime_release];
        if (!(obj instanceof TrieNode)) {
            return Intrinsics.areEqual(e2, obj) ? removeCellAtIndex(iIndexOfCellAt$runtime_release, iIndexSegment) : this;
        }
        TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
        if (i3 == 30) {
            trieNodeRemove = trieNodeNodeAtIndex.collisionRemove(e2);
        } else {
            trieNodeRemove = trieNodeNodeAtIndex.remove(i2, e2, i3 + 5);
        }
        return trieNodeNodeAtIndex == trieNodeRemove ? this : updateNodeAtIndex(iIndexOfCellAt$runtime_release, trieNodeRemove);
    }

    public final TrieNode<E> mutableRemove(int i2, E e2, int i3, PersistentHashSetBuilder<?> persistentHashSetBuilder) {
        TrieNode<E> trieNodeMutableRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(i2, i3);
        if (hasNoCellAt(iIndexSegment)) {
            return this;
        }
        int iIndexOfCellAt$runtime_release = indexOfCellAt$runtime_release(iIndexSegment);
        Object obj = this.buffer[iIndexOfCellAt$runtime_release];
        if (obj instanceof TrieNode) {
            TrieNode<E> trieNodeNodeAtIndex = nodeAtIndex(iIndexOfCellAt$runtime_release);
            if (i3 == 30) {
                trieNodeMutableRemove = trieNodeNodeAtIndex.mutableCollisionRemove(e2, persistentHashSetBuilder);
            } else {
                trieNodeMutableRemove = trieNodeNodeAtIndex.mutableRemove(i2, e2, i3 + 5, persistentHashSetBuilder);
            }
            if (this.ownedBy != persistentHashSetBuilder.getOwnership$runtime_release() && trieNodeNodeAtIndex == trieNodeMutableRemove) {
                return this;
            }
            return mutableUpdateNodeAtIndex(iIndexOfCellAt$runtime_release, trieNodeMutableRemove, persistentHashSetBuilder.getOwnership$runtime_release());
        }
        if (!Intrinsics.areEqual(e2, obj)) {
            return this;
        }
        persistentHashSetBuilder.setSize(persistentHashSetBuilder.size() - 1);
        return mutableRemoveCellAtIndex(iIndexOfCellAt$runtime_release, iIndexSegment, persistentHashSetBuilder.getOwnership$runtime_release());
    }

    /* JADX INFO: compiled from: TrieNode.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\r!4\u0012}\blʒ:FǏ\u0016H\\Q\u0014/\u0015kڷ8$i$B[IV2\u00042\u000b_N\u0016j\u001dL1ŐEǇ\n\u001c\u0001̓DK[|k\u0017ƪ6H"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp0V\u001f\u0011h\"yA\u0012rEY\u001eWQIP^3h\u0016hr", "", "u(E", "\u0013L?!L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u000eO\u0006%Bby'\u0001s =TGD~}\u001c\u001foh9\u0005r0X\u007f5\u0011PV4lan:\u001b\u0012$\u0012V6\u0014\u0005aA-}@F#\u00125WK?p\t\u001c%\n2qp0V\u001f\u0011h\"yA\u0012rEY5", "", "5dc\u0012@\u0017-GW\f\u000bg;\u0001\u0011/_\r(\u0003@|%\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006v8DY\u000b)3t_4WRBo=1^fk@\u000ec*]z1PZ\u00180dZ\u0003L\u0010\u000fa\u000e\u0018/\u0015\u0010`A,nMF\u001b\u00170S\u000bI2\u0005\u0014\u001e\u001eDfmIV}G\t^dN-h/c^y\u001d", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.EMPTY;
        }
    }
}
