package androidx.compose.runtime;

import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.changelist.FixupList;
import androidx.compose.runtime.collection.IntMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import com.dynatrace.android.agent.Global;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
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
/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯŸ\u0015D57\u001eq\u007fZDkŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198ǏmH<s[*%k\u0004é,[:qK;[\u001a\u0006\"\u001fOVgmpRZ!C\u0017\u0006\u001cyr,W^\u0001]\u0018\u0010:B}E;Mu>A`\u000b6\r 8$@y\u001b\u0001\"*N\u0017~zYK\u0014\u00126Cx:h\rU\u0005 \u001b\u000e>&\u0002&\\}N>HrcB/9\u0003qĩV'u0\u0005M\u0013M\\'#viӜ3@ET\u001d%i\u0003\u000fRaB\u000b?\u007fP\rؒ/'AI{W<Y\b\u0014++W\rcr.\\\u001bQh\f-,WcaP\u0016(}|\u0004\rR\u0004\u0016\u0006-K6-0f\u0010\u000e9uzSNА\n^H\u0007\u0003aL\u0017-\u007f9.A\u001btQi;\u001fR?{\u001b\r&#\u0017n)[Z\u0010h\u00151T\u007fQ7QH=VQ\u0012YKw\fpp\u00062\u0004>L\b/\n\u00186\u00173?c9)'s\u0002^Doϸ\r`~SqRNF*n,72\t\u0012sLd\u001bkXT^8\u0019M2T\u000f}\u000e\u0014(\\\u0006Z)%&NWh\u007fjU]\u0010U7fEevk\u0014\\A^I5Yc\u0016hZv*?Db\u000bXnBa\u001bb\\.JZG*\u0016Ǯ\u0012ͩ~\fA1wsˢ4Г1Y\"%P\u0011\u001eZE\r\te[\u0017\u0011\u000fXA&\u001biRw\u0019\u0005^`\to\u0016}Y6\u000bf:3QSE\u0019T]PoD\u00011\u0010\u0017s.QwPUW\u0005\u0016$_\f$$&QQ]Jт\u0013~7@J5Sɱq}R{ɋ&A|B\u0017Iì-\u007f\t\u0019Ҁ+'j\u0013\u001bbϰ!\u000f_!\u05cb\u0007\u0005\u0003\u007fӓTڻF\u0004W\u0011ZLχq3_JҒ7\u0015\u0006eǙ$1\u00110ı4E_7 &xZٿ\u0014q`yptӲa\u001f)\u0005f2ЉbḊaжa3AΆH \u0013й&%zïA\u0011q\u0006ٽA!4;6\u000fU-!dЯL#0D֘\u0006L\u0010v£iƸ\u0012 \u0003Bʸ^Bsq\u0014DkQѮ\u0010e[wp}L#ָI=ϴ\nBϊt݁ >.ݥV+\u001b>Ӎr06oQ\u0013\fJʓ#L.R\u00079@\u001b~N \tĲEw\u000fEHrxI٭\rlx\u000bl\u000f\u001a)VnԾ)\u0019~=IN~C̡\u0004\u0006G\u0003Юbx\u0016\u001c.\u0017ƣig~\u0015;[Jbڷ\u001a@Y/ժD$X\u0012\u0013D\u0081FAm\u001a\u0006<>&ԑ\u001cZ\u0019IʤPWt?AlεT|N\u0013\rBl`Ɲ!A\u007f)զ\r\u0003\u001fW\u001b'۸q\bb[b~|Eƥ\u0019\u0019\u0017rCM!EtTɯ,\u001e5[Syp\"ձzoTi֞\u0007f5o\u0015\u0003փ[o\u000e\u0015 \u000e!Hϗp.c0ƥ\u0012\u00175L@XƸq\".6L\u007f\tAČ\u0012v[\u0002vO=m@5\u0014PƔg\u0011\u000b\u0012بb5Ω̦\u0007g7٣x75^ɧ\b?N\\\u008cW!:Y[.Ǯ\u0010\u0018\u0015CӀ\u001e|\b+1\u001èb\u0001q\u001aϖZS?w*8Ո0HSLݨ\u001e*\b\u0012֊S@\"KX]>\u0013<lnRW<[\u0019ܗc%\u001f7ٛ{\u0017Vn\u0014#5tހ\u001d\u0013ԑ6ق#\\\u0013Ԁ_Mʗ٣M*'݀QM\u05fe6z5}Ļu)\u0003h|%\u00058ј\b\u000b\u007f\u0016F]Jb.2'\b>\u001ei\u0011έJ]8p\"\\\u0016\u001cŦ.r8NX#\u001ada_߸@1\u0012G͔7&r\rؒC֊P\u000428ʿ{\u0019\u0015O|Al\u0001ݼ6!݄.U\u0005\u0088[gIĝ4.T5ھ\u0001}K-߆b\u001d\u000f*LW˺D6z\u0004ʽ~*\"*ڎ\u0014Á\"0R?ض)wdPY\u0004XJڢ)d˰Ci[5\u007f\u0002Ծ+\u0002\u0018\"K\"a|Q\t©\u0018\\>X\u0014\u001d\fS\u07b3g\u0012\u000br'\f\u0014\u007f\u001d\u0014Ի2/}>ސp\u0007Դ߳vN5ܖ\\\u0005$\u0002͜9Jbd̥Fp^8ƨ,*T\u0012\u00011\u0003\u001ag\u001eٿ\u0011%\u000e2֢0\u0019tHh+Ƀ&cwtլ[?a\np\u0019ڽ\u000e<_\\̆\u000bQʏ\u00892I\u001dѿ|\u0013\u001e#κ2_toڶ\u0011\u0007\u000e/΄\u0010s2\u0016'wjuresh=g09ǸI\tJsے\u0004m1[g;\u0016.Ӽ*DF\u0005é\u0019\u008f\\\u0007\u0014ȹc\u000f\u0010ͭ|E6Ӄ/xJ^ۊY[^/\u0083\u001emZ#ך}Jbeu\u0015\u00169ƒV\u0007R\u0004=sxJ\u000b\u001eĥ\u0018+\fLҜ8x7<\u001e?Ŏz ]wʟ{\u001eN\u001eÿ`b!]\u001c\u0006/\nSzʪdW\u001a\u0006ð}R5o,\u0014ڬ#zhAغ\rh_KTD͒(`L\b̃e\t\u007fW\u0003\u0003ߩ-$9\u0004ΐ<L%+$CŲ^X-\\\u008c\b\u000ed3\u00048۬n~u\bǁDq\u000baF?߲\u0010{P\u000e\u058bm\u0018q!F%м%X\u00140¶\u001clvDR7ݹ\u0016mf\u0004i\"ٗ_Wn|s>ڮx\u000bg\u0013عb\u0005P\u0011r'˶N\u0016\u001c\u007fɑaQh~؊@(c\u001bԽ&|H3*\u000fϓJy\u0018BτC'(ú9:aPm$9\u0010R\u0014ÛiyxCه\\y6U\f:Ͳ\u0014\u001d?\u0015̠\u0003\u001d\n[݄\u0003\u0004/`\\\u000bG*߫Y?o~\u0007XwR|ME|פQivMɾc/(,\u0604@o9u;C\u0007'\u0010 2{nAn!d3Ջz\u001e @\u070fz{l\n{\nکV\nPb߆\u001do}2\u0004.P\u0004\u00122y\u0011ЯԞmc\u0017ӎ-\u0016\u0019\u0015Ǥ;qB0\u070e!Y.\u0016ƍ&\u001aMDJ8#QĲ\u000ef\u001fXׄm\u0011'\u001fd:,;\u000bV[{ԉr~^\u0016ҭ@mrk͉DEG\u0002\u001b[Z}\u0002;H<ˑ\u0015JT\\p\fZkց\u0015`϶n2Д\u000f:`$k%ݽ\u0007z5\u001aϟzw \"ՙJF2jy~}\u0007Sq\u0011kՒ\f$\nNv?\"nћ^\u000fޫ~i̧ocL\u001aUrрC)(\u000fLn\u0017\u001dȻW~\u000eI\u001cKK-Q$̈́D\u0011AyѓZ4uqÍ!\u007fQ{,?\f\u000e\u0015d\u001a.á8=x^ԡ4\u007f^7<S\u00155ԯN sF1uZ\u000b%=ٰ\u0007&J\u0015b\u0017\r\n$zϓu\u000frE<E\t8֎!5E{\u0018\u0016\u0002fsI͗gkf\u0011\u001d\u001dX\"<x\u0007\u0014Ľ\u0012Y!,\rR\u0005Fs$=]ж\u007fXJ)\u000bH@t\u0007\\0sח\u0004M\noKoX~ȕ*\u0010_\r\\5\u00123ԝ'#\u0018V{\u001d\u0018}ɭ':CA\u0011Kr\u0017ç\u001ba%7G\u0018vC'@ջ\u001fm\u0010m$YaƲ{\u0001'б/x\u0013\u0017݅K\u0006~\\Ŧn\u001b\u0005lƘN\nDm\u0002\b7s̽\u000fTͩ:Z\u07b5ǯH(aѳC_\u001e,Ӯ)<2:\t` jĝ|\bv\u0001|X`|\u0012CԬ?M+Q\u0017V\u0013\u000f\u070f\"u8$@iUt\u0018\u001fh\u0007Pq\u000f\rۊ=0έϯ5\u001e\nصJ. *ȉH\u0012\"2ϵ?B-hƽ2Ҝ\u000b=UV-(֑_T$O;I\u0001`\b\u001d\u0011NՒt\u001c1\\\u0010!\u0016!:8Imί\u001eD`?o\u001a\u0014_lXA[GG0'7HpG%[ePOUkMK;\u0014;\u001c\u0019Ȭs1ā4\"ilʌ>\u001a\u000e4\u0017R\u007f|ǉB\u0019Սtb4،x#pܵ4vJpŬ*.\u0013\u0014ě&\u001eq-\u001bo߀}RNHұ]\u0010\u0007U71ܔ\u000b3+1ϘC\u00028z˽Gmv\u000bXU1\u0006zUʹL\u000e{,؇1\"E\u0006۪a\u00046sf^)\rb?ſ\u0002$Qzǆ{`V ί\u000bZ\u001a#5P\u001f.זU\u0015ͻ3\u000f\n%Yz҃DA~<˶5\u001eC\u001a͞En.4PMdx͛s\u000fV\u0015-o\u001c Ǿ|\u0017<\u001c\u007fKen48؏\u007fk4\u0010ЌV\u0004o\u001d̓\u0017Jdb;Z3S'8Ż #\refbi~LAO\\ʩa\u001d08\u0019\u0011%SB9w^̨X\u0019^tْ:cs\u001dqGߔ`\u000fXUĎgg\u001b\u0019Ԕ2[L\u000exg-(\u0013!¡\u001dk\u0014\u0002ӜPsg\u0004?U̇\boG\u001bӽ-eE2'}ȏ8\u0007@yǯ\u0015m? \u007fiٟ*X\u00051΄\u0014\u000b5n$5ڥ>U\u001f%К5W\u000b\u0019تP|\u0003!ͺ\u001a[\u0001\u0019\u0011EɋEUD\u0004֩Z8PmyXÔ\u0011=']Ç\u0019Ylz̜s-n\u0013&\u0002?kˣ1hc8לQ4%C\n*կ\u0016:Y@[\\Ӿˤ%:MϒI{r\u0012݆Php-\u05cfW%p{̵W,218sA\u0007ۄjpf/z\u0007k\u0013L9\u0095.^\u001a>Ӕ-Zm\u0006ѧ)Q\"xg/r9Y´\u0015ўѺv;c͛\u007f}ƛE/OSںe8v\u0001җ\u001b i5 xޑT]=\u0013ϰA\\GZǀ\u001f$\f~\u0001~\u001f\u0003g\bޢl@FWȠ$\rgX˹P)\u0011\"t-+\rʷ=V\u001f\n55\u0018YB_\u0017\u0018Ê\rq9;О5uRgԥ Jah\u000f\u001c\bAέ\u0013\u001c\u0016E\u0013\u000bX/\u0012r}w¤,H%q̥@\u00169i'1ï\fOJ\u000f؊x\u0011k8Ͽ\u0006\u001d+'G\u0007K\"ΉnGU)\u0014dŤH?/%Ģ\u0006S\u001fzǯ\u0014\u0004^=b{e-jH\u0004\u0003\u0014\fҡbz܊\u0011m?І\u0011\u001dXؾM\u0012oIƕ&$\u0015iȲR\u0002v\u0012џ\r\u000b\u0011`\u00150%DԈFyvyvjB\t]2\u001c\\א4\u001e\u0010x͓q45\nԬK)C\u000bk;\u001a'Ukǵ'&{5ج\u001c-usٝ,\u001a\u0010\u0015:8YV]\u0016՜nc9O`\u001c\t\u0004ѶV|\u0017peX0H]\u0011ä\u007f])\u0019ϐm9I$ו\u001bV[\u0004\u0007?U)\u0601f6H(${a5\"l\u0013\u001e\u07b3gR lҟz\u000eb\u0012j\u001bپft&zĄsy:#П\u0013[#/ԅ:ew!\bO֭d\u0013]U)[\u007fiɍzMGz\u0010\u0016*Bҽ\u001d+O8R\f\u000f\u0001ôэ\u0019~\u0006ٟ \u0011+\u000fߗNJ&qҿ\"\"\u0010PѰBgpng%\u001b>a+ZS\u07b7\u0007>7vԜ*C2\u001fѤ\u0004z1\u0003\u0015\u001aK]\u000b-'vE?\u001d%җP%_.FmD\u0004k,ؓ\u007fwia\u0011B%r̈\u0016egvӷ*\u000f\u001f[ӧMF\u0003,ιq-'~>D6`o\u0015$f4n؟\u001a\u000eL+ۉc\u0014\r[Ϙ:k\u000e\u001c\u038bW\t\u0005_y%s\u0001V7R9[\u0013\r\rȊHI\u001bAPl\u001c#kR׳eJLY\u0011L,vރ@Q\tGܴc\u0004\u0006'˟V\u0018\u001eqɊsVas^bF\u0014\u001c\"\n>D\u001fգ\u001f\u0004|eÂn+o-\u008eHpm\u0003Ҝm!\u0010_B=\u0018^̒=S@|\u0019lpsa;ުo5*;Ƣ\u0017\u0006ZDҧ4zCQ[l(\bɑ\t;\u0015z5E\n|[+Μ\u0011\u0014<w5\u0011jQڕaXu\u001fifdcժR\fTO\to33O.ޅhL's۪$\u000421\u0087\u001e\u000b\u0012\u0010\nG>Ay,@Tۧ\tA:uָL$U\u0002\u05c9\u0002;5-z9h5;qXwη3.\u001d\u001eΓ0o|vٳjN\u0006UXL~0O[\"9ӛ,*\u001e|\"\u0002NfȌnHP\t\u0016&\u0018^>TДDK\\#ȼ|jZDRsƺm\u0014?yܿ\u0013sL\u001bBKڭ\u000fiV#Ͽ2G\u0015\u001a\"I\u0378\u0016%DQߥ#&ԓϲ?Nx\u008b7?\u0017Tļ\u0006.kjł?4TPӷ8ۺ<Vh}u+y\b^HQYƺ \u001c\u0014QyR\t3Ƈ+]ڛw\u001dِbҠ[\\\tӧRiJ~ޔL.%>DVTY\u0005BWzڋ>WO.c\u001aJ3&?ԟ!\b\u000f(8&\u0004\u007fC\u0004x\u001dJQԾ$ \\\u0019a>nOq9[|E.\u0016\u000b?xg\u0011l\u001dҁfܫ\u001aQ,Ԛpn\u000bTLYT@RU=_\u001aݟ\u000b֗-Mwϛ\u0010\u0013J\u0004Oeo-9L{~\u0015we\u001b[Օ-ـM)C\u00198'[Vw\u0006'RFo>v\u007f(g̊W݁!\u007fl\u0015g/_Y\u001cgty\u0012?S\u0002\nQjɼ1˓\u0012#hlyF{:D\u007f!}VbgX\u001eŒ\u0017ߤZz!ӇO2V'B\u0006FYv։x۳:Ooż\rN\u0017AkW%\u001e\rʱ\u0004ǧx]eЊ\u001c\u00183R]\u0002;p6Ͷ\u0016ݻ]|z\u0604Ik>rS5tIN\u000e\u0014L_ca:FѾ\u0019ǈ`p1g2LN\n^\u000f\t+bk|j'آ%вc}/Ī/!!\u001b\u001bZ\u0002\\\u001dzTXbX&CK%\">\u0016ޝKԀ\u00037{ػ\u000e4{[q\u001ceU`E4\u00176\n78\u0002MnT@\u0013eԆ\u0019Ǣ%p&x\u000f\fFGLUX\u0013zhvO\u001d\u0014Pق\n՝\"$\u0015\u001b:HU~>\nA5|\u0015A7b~&i0З'՛'x\u001a>S\u0011\u00118:\u0005?| \u000eYQ\u0001\\$ƜSՑQM{sas_:I\u0004oD>)H6,7l7Wz#-Nո\u0014ڣ\u001fuP\u05fem\u0014,h?k0#UJb\n\u001fPD1-#lc1הhƁ=\u000b\u0002\u001cIOP4ZAhe'2XȠMړ]m\u0013֖\u000eO\u0017gkU(\u001d\u000eɑ\u0016ڝ\u001e>gި\u001e\u0016q\u000e\u0001&\\\u001dZ̓Aܛ\u007fz}ʮ\u0002\u0016(:>\u001er08٣0؆WB2ЫC\u0016'EtiJ_\u0005Mӎ\rR ?\t\u0014;\fA\u0006\"\u00045\u0001OU\u0012\u001eUÖXޫ>v<z\"r`\u0001K&9`-g\u001b\u000f\u0019۬]Ѳ`SVڋd\b\u00022JQ#I\u0013ҵ*҈\u001cJ5̭ [5Zzpu~G\u07b7\u001aޔ\u001c7\u0007ޣ0\u0005J\u001aq6\u0007J=9.|#OZ49AI\u000bJj\u00156/SS\u001c`az\b$ۑWЎ\u001bT\u0007ȝg%cI\rP\u001bmu\u0005V\"^?I$?4:6,\u00107\u001fb3TŊ2Ԥ'\f6ŭ\u0003\",w\u0018\\'i,Sq4\fDyߺ\u000eĶrV\u001dЏ}I>n<PK\u000b_s3cJWQ\u0019a>SЄ<Ә-\u001fEͽ)\u0007*)0JX\u001e_\u0002El\u0017\u0012@1gkX\fSk\u00176`Ėn̹v\u0002f˲w\u0014&D\u0019 \u001bY6/NVi*QۏZèq:^ĿP6G$FH#ur\fGӿ\u0016ɯ\u0003^rЮ9>6'\u0005R_:uM\u0005ř\u001dѵ7aGĽ\u0013mmD\u0017\u0019'\u001f9ܮP҉\u0003H{оlE?|.g\u001cX\u001bٽa̔As8ڼ\u0007J\u0001*L\u0012\"$7ѕCҨ>_X͍$R3sZ\u0011W\n)ϐzǀ=J)кh\u0011O6}g\u0017\t/ƦGΈw\u000evɃ3S__s\fA-j_\u001eАWɠ@6Wǒ\u007foE\u001271\u0005\n\u000f\u00193@4V!\n\"̝\u0014Ŷ@n\u000f͕Ye\ry\".N\u001b/|)ҤPɷFv[\u07bfp0\u000eEQQ4x5{lnZ\\\\wIς$ٌ2/=ąs_\rChQu\u0013\fЀqƾh!'В\"\u0006Y x}AJ|\u07b9\u0006̋m#{М![\u0018\tBP\b_\u0019Ӟ0ڙ\\w\u0011ίV\"b\u0011Z&Q\t7Ǜ\u0018ٻnzUمp{b6\u0005ln5\u0016\u0016\u0007\u001fp\\$_glD\u0011t&*Gaս\u0005֞r#_T\u0010$\u001b\n!\u0013W)\n8I5\u0005\u0001\n\u001c8¥cӃ\t\u001er,Jt4ž\u001dy\"<Ŕ[K\u001bM}F͊RҽX\u0005fȧ\"n'Ƈ52rBO\u0019ݴ\u0018ŢN\\\tؘ\u001fnSщ\r^ry\u001a)Uh\u05cd\\ɺ?*+\tH٭cy\u0011a\\m֎*dE$3q\ni9\t0\"ϥ_ܹoHtɝ\tF]ԄNy\u0017x\u0017 Ȯ/֓??kڪ@\u007f@ɑ\u000b'1o߿'\tսGܾV\u000f6͒lOEӋ\u0016\u007fT\u0013,IÐ0ِ\nZ#ߙTr]Ǘ^\u0003g\fN[o\u0003 W$hwkǣWҝ|8\r-\u0005ΤjsˆdкAQj!s̀\u001eF\u0014̐*̪("}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\u001bu!5#", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\r", "/o_9\\,K", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iG\u0002,9Y\u000bu", ">`a2a;\u001c]\"\u000ezq;", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "Ak^AG(;Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014$Uz'7C", "/aP;W6GA\u0019\u000e", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<~%=V}-!j$.ZT;x\n", "1gP;Z,L", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\fP?Dm4\u0005\u0019vp\u000f", ":`c26/:\\\u001b~\t", "1n\\=b:Bb\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF\u007f4Bc\u0005'7ls8UNEy8-\u0019rj\u000f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u0018\u00020<]}-\rT\u00127LPEo31^fkA\u0012m:N@4WU]0dR<\u001b\u001e\u001ae\u0018\\/\u001c\tcJ\u0002xMF\u001f\u001b;\u001fh7q\u007f\u0019 \u00124}:@`\u0018R\u0004#u\u000b6xOhc\u0002G\u000b3i4sz[\u001ac:\u0010\u000b\u0019m*\u00172`=\u000e\u0003\u001d~raONcP\u0018\bB(=\u0001%DOw`F\u0003'hX\f\u0001!6`ttr0\u007f=,6k\tYva\u001cat\u001e.\\(+4E\u0012y;Tb\u0003vB\r{h_\u0012\u0016m??\u0019/rsQ\u001e\u000be\u0017%3d[\n9R\rBW~^\u0005IzK]y{\r\u00153CLEL\u001aa\u000b\u001eoWk]\u001b\u000b\u000ep&\u001cw#Mb\u001el2_\u0001+\u001d\u0012wE\u0016\u0003`C\u0014NR\u0018xU\u0001_fs.?NT:", "5dc\u000ec7EW\u0019\f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006R0@`\u0002 DC", "/o_9l\nH`#\u000f\nb5|f9n\u000f(\u000fO", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "5dc\u000ec7Egv\t\bh<\f\r8e]2\u0005O\u0001*&", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "/qT\u0010[0ER&~\u0004<6\u0005\u00149s\u00041}", "", "5dc\u000ee,\u001cV\u001d\u0006yk,\u0006f9m\u000b2\nD\n\u0019UT\u007f\u0017Kz-5S\u000b >m\u0012<M", "u(I", "1gP;Z,\u001c])\b\n", "", "5dc\u0010[(GU\u0019\\\u0005n5\fG<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "u(8", "1gP;Z,%W'\u000elk0\f\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\fWKFuB\u001e\"Fd5\u0010e,5z5V>[0kR\u007f\u0013", "1gX9W9>\\v\t\u0003i6\u000b\r8g", "5dc\u0010b4I]'\u0003\nb6\u0006", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/>h\u000b*>t\u0016-+MCv>,\u0019weC\u00109", "1n\\=b:Bb\u001d\t\u0004=(\f\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001dF\u0001,9b\u007fi\u0015w\u001e9WQ?z8(\u001eG]H\u00039", "5dc\u0010b4I]'\u0003\nb6\u0006g+t{", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006\u0006/?`\u0002)97s8UNEy8-\u0019rj\u0018\u0003r($", "1n\\=b:Bb\u001d\t\u0004M6\u0003\t8", "\nrTA \u0006\u0017", "1n\\=b<GR~~\u000fA(\u000b\f", "5dc\u0010b4I])\byD,\u0011k+s\u0003fwI\n!&C~\u0012F\u007f3", "u(E", "5dc\u0010b4I])\byD,\u0011k+s\u0003", "1ta?X5M1#\u0007\u0006h:\u0001\u00183o\t\u000f\u0006>|\u001e~Cz", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0015WA7r\u001c\u001a >", "5dc\u0010h9KS\"\u000eXh4\b\u0013=i\u000f,\u0006Ig!\u0015Cvu8\u0002", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.;|\u001a8V*Ei0%|dl\u000f", "1ta?X5M;\u0015\f\u0001^9", "5dc\u0010h9KS\"\u000ebZ9\u0003\t<", "1ta?X5M@\u0019|\u0005f7\u0007\u0017/S}2\u0007@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC\u001fs?%j", "5dc\u0010h9KS\"\u000eg^*\u0007\u0011:o\u000e(i>\u000b\"\u0017\u0006|\u001eE\u0006)=Yw-7t\u0016*[C", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006c%3c\u0006+A{\u0016\u001cKMFk\u0018& o7", "2dU.h3Ma|\b\fZ3\u0001\b", "5dc\u0011X-:c \u000e\tB5\u000e\u00056i~fwI\n!&C~\u0012F\u007f3", "5dc\u0011X-:c \u000e\tB5\u000e\u00056i~", "2dU2e9>Rv\u0002vg.|\u0017", "5dc\u0011X->`&~y</x\u00121e\u000ef\tP\n&\u001bOo\bIv,5U\f ", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006t(1b\u007f >q$=\u0017!>g= \u0015OeG\u00169", "Adc\u0011X->`&~y</x\u00121e\u000ef\tP\n&\u001bOo\bIv,5U\f ", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW:y!>[}';{%w+F7t6\u001e{loH\\'\u001d", "2da6i,=A(z\n^\u0016y\u0017/r\u0011(\t", "/mS?b0=fb|\u0005f7\u0007\u0017//\r8\u0005O\u0005\u001f\u0017\u0011M\u0018D\u0002/CY\u000b\u0004?x\u001dlLCHoE\u001e\u0014Vp5\u0016c\u0016K\u0005'T]N9\u001b\u001e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\u001bu!5\fB;x8/\u0015gOH\u0003r,8s5GY_,i\u0011>\u0013", "3mc2e:,b\u0015|\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9qE\u0006\u0013DU{&\r", "4na0X\u0019>Q#\u0007\u0006h:|v-o\u000b(\n", "4na0\\)Eg\u0006~xh4\b\u0013=e", "5q^Bc\u0015HR\u0019\\\u0005n5\f", "6`b\u0016a=:Z\u001d}vm0\u0007\u0012=", "5dc\u0015T:\"\\*z\u0002b+x\u00183o\t6", "6`b\u001dX5=W\"\u0001Xa(\u0006\u000b/s", "5dc\u0015T:)S\"}~g.Z\f+n\u0002(\n~\u000e' Vs\u0016<p25`}\u001cEm", "7mb2e;\u001a\\\u0017\u0002\u0005k", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9iEt(?fS", "7mb2e;\u001fW,\u000f\u0006l", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\f?r.7Y\u0005$E|_\u000fQVKv\u001b\"#w7", "7mb2e;-O\u0016\u0006z", "5dc\u0016a:>`(mv[3|G<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d,?hl\u001c4t\u0016\u0004", "Adc\u0016a:>`(mv[3|G<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW*}/DHy\u001d>mkq>", "7mb2e;B\\\u001b", "5dc\u0016a:>`(\u0003\u0004`jx\u00128o\u000f$\u000bD\u000b %", "5dc\u0016a:>`(\u0003\u0004`", "7me._0=O(~hm(z\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr#;/", "7me._0=O(\u0003\u0005g:", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9qE\b!<]|\u001cFq 7#", "7r2<`7Ha\u001d\b|", "7r2<`7Ha\u001d\b|\u001d9\r\u0012>i\b(uM\u0001\u001e\u0017C}\u000e", "7r36f7Ha\u0019}", "7r36f7Ha\u0019}9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "<nS266N\\(h\f^9\n\r.e\u000e", "", "<nS266N\\(o~k;\r\u00056O\u0011(\tM\u0005\u0016\u0017U", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<Z.D=\u0007/\u001fi!\u0004", "<nS28?IS\u0017\u000ez]", "<nS2<5=S,", ">`a2a;)`#\u0010~],\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9x<\u000439g\r @|s8UNEy8-\u0019rj \u0011a(U^#R\"", ">`a2a;,b\u0015\u000ezL;x\u00075", ">d]1\\5@", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9x<\u007f$9b\u007fu", ">d]1\\5@A(zxd", ">q^C\\+>`vzxa,", ">q^C\\+>`\t\nyZ;|\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0012VR#g?s", ">q^C\\+>`'b\u0004o(\u0004\r.", ">q^C\\+>`'b\u0004o(\u0004\r.S\u000f$yF", "@Fa<h7\"\\\u0018~\u000e", "@dP1X9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014\"Yy\u001f7zk", "5dc\u001fX(=S&=\bn5\f\r7ey5{G\u0001\u0013%G", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006d,?hj 3l\u0016;#", "Adc\u001fX(=S&=\bn5\f\r7ey5{G\u0001\u0013%G", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW*}/DF}\u001c6m#\u0004\u00114", "@dR<`7Ha\u0019lxh7|", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC\u0011", "5dc\u001fX*H[$\t\t^\u001az\u0013:e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006c%3c\u0006+A{\u0016\u001cKMFk\n", "@dR<`7Ha\u0019lxh7|l.e\t7\u007fO\u0015", "", "5dc\u001fX*H[$\t\t^\u001az\u0013:ec'{I\u0010\u001b&[", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "@dd@\\5@", "@dd@\\5@5&\t\u000bi", "AjX=c0GU", "5dc ^0I^\u001d\b|\u001d(\u0006\u00129t{7\u007fJ\n%", "5dc ^0I^\u001d\b|", "And?V,&O&\u0005zk:\\\u0012+b\u0007(z", "EqXAX9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{C\u00014'f\u0002/7zk", "EqXAX9!O'Zek6\u000e\r.e\r", "<nS2", "5dc\u001bb+>", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW*}/DF}\u001c6m#\u0004\u0011*@gE\u001a^o]B\t-\u0016K{'E[$", "/a^?g\u0019H](", "", "/cS\u001fX*H[$\t\t^\u001az\u0013:e", "/o_9l", "$", "\"", "D`[BX", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "uKY.i(\bZ\u0015\b|(\u0016y\u000e/c\u000f}bF\u000b&\u001eKxWA\b-~Z\u000e)5|\u001a8VQ\u0005LD'\u0013weC\u00100\u0002\u0012g", "0tX9W\nH\\(~\u000em", "1`R5X", "7me._0=", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "uY;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHuzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "1gP;Z,=", "", "", "", "", "", "", "1gP;Z,=7\"\r\nZ5z\t", "1gP;Z,L/$\n\u0002b,{", "1gP;Z,L/$\n\u0002b,{G<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "1kT.a\u001cI1#\u0007\u0006h:|", "1kT.e\u001cIR\u0015\u000ez]\u0015\u0007\b/C\n8\u0005O\u000f", "1n[9X*M>\u0015\fvf,\f\t<I\t)\u0006M\t\u0013&Ky\u0017", "1n\\=b:>1#\b\n^5\f", "7me._0=O(\u0003\u0005g:i\t;u\u007f6\u000b@\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u001cKMFk\u001c\u001a >", "1n]AX5M", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "1n\\=b:>1#\b\n^5\fG<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW:\u0001,<Y{/;w\u001fw;AEv4\u0006\u0011s7 \rm;Uz0\u0011Q_4&S\u0003F\u0012!^\u0018W9VeiJ\"}HA(T\u0002\rr", "1n\\=b<GR~~\u000fH-", "5q^Bc", "@dR<`7Ha\u0019`\bh<\b", "@dR<`7Ha\u0019dzr", "1n]@h4>", "9dh", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0015WA7r\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f$Fq 74M9g;sXOf5\u0018_uUr0I\u00168)aRpLi", "1qT.g,\u001f`\u0019\r}B5\u000b\t<tn$xG\u0001", "1qT.g,']\u0018~", "4`RAb9R", "1ta?X5M1#\u0007\u0006h:\u0001\u00183o\t\u000f\u0006>|\u001e\u0005Ey\u0019<", "2dP0g0OO(~", "2dP0g0OO(~9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "2dP0g0OO(~ih\f\u0006\b\u0011r\n8\u0007", "2hb.U3>@\u0019\u000f\tb5~", "2hb.U3>A#\u000f\b\\,`\u00120o\r0wO\u0005! ", "2hb=b:>", "2hb=b:>\u0012&\u000f\u0004m0\u0005\t)r\u007f/{<\u000f\u0017", "2n2<`7Ha\u0019", "2nA2V6KRw\t\rg:]\u0013<", "<dP?X:M1#\u0007\u0003h5i\u00139t", "3mP/_,+S)\r~g.", "3mS", "7r=<W,", "3mS\u0011X-:c \u000e\t", "3mS\u0014e6N^", "3mS\u001ab=:P ~\\k6\r\u0014", "3mS\u001bb+>", "3mS\u001de6OW\u0018~\b", "3mS\u001de6OW\u0018~\bl", "3mS\u001fX7EO\u0017~\\k6\r\u0014", "3mS\u001fX7EO\u0017~v[3|j<o\u00103", "3mS\u001fX:MO&\u000e\\k6\r\u0014", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{:\u000105I\t\u001f3|\u0016\u001cKMFk\n", "3mS\u001fX<LO\u0016\u0006z@9\u0007\u0019:", "3mS\u001fX<LSy\f\u0005f\u0019\u0007\u0013>", "3mS\u001fb6M", "3mS!b\u0014:`\u001f~\b", ";`a8X9", "3mbBe,0`\u001d\u000ezk", "3mc2e\u000eK])\n", "<df\u001dX5=W\"\u0001", "3wXA:9Hc$", "3w_2V;>R\u0002\ty^\n\u0007\u00198t", "4h]._0SSv\t\u0003i6\u000b\t", "4na0X\rKS'\u0002^g:|\u0016>T{%\u0003@", "4na0X\u0019>Q#\u0007\u0006h:|v-o\u000b(\n~\u000e' Vs\u0016<p25`}\u001cEm", "7mb2e;&]*zwe,Z\u00138t\u007f1\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR\u0011", ">`a.`,MS&", "7mb2e;&]*zwe,Z\u00138t\u007f1\u000b\"\u0011\u0013$Fo\r", "@dU2e,GQ\u0019\r", "", "\u001aj^A_0G\u001d\u0004z~k\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015Ua:\u0007p,Wt'\u001d", "7mb2e;&]*zwe,Z\u00138t\u007f1\u000b-\u0001\u0018\u0017To\u0017:v3", "7mb2e;>Rz\f\u0005n7m\r<t\u0010$\u0003$\n\u0016\u0017Z", "7mS2k", "7me<^,&]*zwe,Z\u00138t\u007f1\u000b'|\u001f\u0014Fk", ":nR._:", "4na0X", "8nX;>,R", ":dUA", "@hV5g", "<dgAF3Hb", "<dgAF3Hby\t\b<(z\f/", "<nS2<5=S,h{", "5q^Bc\u0013HQ\u0015\u000e~h5", "@dR<`7Ha\u0019b\u0004],\u0010", ">`a2a;$S-", ">`a2a;$S-=\bn5\f\r7ey5{G\u0001\u0013%G", ">qT=T9>1#\u0007\u0006h:|", ">qT=T9>1#\u0007\u0006h:|G<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "@Fa<h7\"\\\u0018~\u000eH-", "@dR<`7Ha\u0019", "@dR<`7Ha\u0019=\bn5\f\r7ey5{G\u0001\u0013%G", "@dR<`7Ha\u0019f\u0005o(y\u0010/C\n1\u000b@\n&", Global.BLANK, "4q^:", "Bn", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001.Df\b'>m\u0015\fWKFuB\"$lkB\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u00188\u001d\u000ehE,n\u000e\u0015)\u0011;V\fBo\u0001\u000bs\u0018=uzPZ\u001fK\u0004\u001eK(.dWU)\u0001CJG,\u000em\u001b_\u001f\\G\u0010\u000b\u0019m*\u00172`=\u000e\u0003\u001dwv`\t=NM#\n?(G7`WM9VL}%.O\u0006\u0001 {9\u00054r<\b>3\u0001:H2l\u0014OZB\u001c(eCp\u00103A\u0013=Z9", "@dR<`7Ha\u0019m\u0005@9\u0007\u0019:E\t'", "@dR<e+\u001dS ~\n^", "@dR<e+\"\\'~\bm", "/mR5b9", "@dR<e+)`#\u0010~],\nx:d{7{", ">q^C\\+>`'", "@dR<e+,W\u0018~Z_-|\u0007>", "3eU2V;", "@dR<e+.^'Z\u0004]\u000b\u0007\u001b8s", "=kS\u0014e6N^", "<df\u0014e6N^", "1n\\:b5+]#\u000e", "@dR<e+.a\u0019}", "Ab^=X", "@d\\2`)>`\u0003{\t^9\u000e\t<A\t&~J\u000e", "@d\\2`)>`\u0019}kZ3\r\t", "@d_<e;\u001aZ f\u0005o(y\u0010/C\n1\u000b@\n&", "@d_<e;\u001f`\u0019~bh=x\u00066e]2\u0005O\u0001 &", "5q^Bc\t>W\"\u0001g^4\u0007\u001a/d", "AjX=6<K`\u0019\b\n@9\u0007\u0019:", "AjX=:9Hc$", "AjX=E,:R\u0019\fih\u000e\n\u0013?p_1z", "AjX=G6 `#\u000f\u0006>5{", "And?V,\"\\\u001a\t\bf(\f\r9n", "", "And?V,\"\\\u001a\t\bf(\f\r9ng$\tF\u0001$vPn", "And?V,\"\\\u001a\t\bf(\f\r9ng$\tF\u0001$\u0005Vk\u001bK", "AsP0^:,W.~", "AsP0^:,W.~9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "AsP?g", "=aY2V;$S-", "9h]1", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9oI\u00015@?\u0002)6C", "2`c.", "AsP?gs\u001bO\u001daXB ", "uH;7T=:\u001d z\u0004`uf\u00064e}7Q$g\u001c\u0013XkWCr.7#g\u001d<m\u0014=#\u0007,", "AsP?g\u000b>T\u0015\u000f\u0002m:", "AsP?g\u000eK])\n", "2`c.>,R", "AsP?g\u0014Hd\u0015{\u0002^\u000e\n\u0013?p", "AsP?g\u0015HR\u0019", "AsP?g\u0017K]*\u0003y^9", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9xI\u000169X}\u001f(i\u001d>M\u0019", "AsP?g\u0017K]*\u0003y^9\u000b", "D`[BX:", "", "uZ;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006a2?j\u0002\u001f7l\u0007*TS;Aw\u000f", "AsP?g\u0019>O\u0018~\b@9\u0007\u0019:", "AsP?g\u0019>^ zx^\u000e\n\u0013?p", "AsP?g\u0019>^ zx^(y\u0010/G\r2\fK", "AsP?g\u0019>a(z\bm\u000e\n\u0013?p", "AsP?g\u0019>c'zwe,^\u00169u\u000b", "AsP?g\u0019>c'zwe,e\u0013.e", "AsP?g\u0019>c'~[k6\u0005u9o\u000f", "AsP?g\u0019H](", "Bqh\u0016`4B\\\u0019\b\nB5\u000e\u00056i~$\u000bD\u000b ", "7mbAT5<S", "Bqh\u0016`4B\\\u0019\b\nB5\u000e\u00056i~$\u000bD\u000b UT\u007f\u0017Kz-5S\u000b >m\u0012<M", "CoS.g,\u001cO\u0017\u0002z]\u001dx\u0010?e", "CoS.g,\u001c]!\n\u0005n5{n/yq+{Ir\u0017vP~\u000eIX2?i\t", "5q^Bc\u0012>g", "CoS.g,\u001c]!\n\u0005n5{n/yq+{Ir\u0017vP~\u000eIX2?i\t\u00067\u0002x*[F", "9dh\u0015T:A", "CoS.g,\u001c]!\n\u0005n5{n/yq+{Ir\u0017vZs\u001d\u001e\u0004/Ed", "CoS.g,\u001c]!\n\u0005n5{n/yq+{Ir\u0017vZs\u001d\u001e\u0004/Edc KP\u0012<P", "CoS.g,']\u0018~Xh<\u0006\u0018", "1nd;g", "CoS.g,']\u0018~Xh<\u0006\u0018\u0019v\u007f5\tD\u007f\u0017%", "<df\u0010b<Gb", "CoS.g,)`#\u0010~],\np+pa5\u0006P\f", ">`a2a;,Q#\nz", "1ta?X5M>&\t\fb+|\u0016=", "CoS.g,+S!~\u0003[,\n\t.V{/\f@", "CoS.g,,Z#\u000e", "CoS.g,/O \u000fz", "CoS.g,=<#}z<6\r\u0012>", "CrT\u001bb+>", "D`[6W(MS\u0002\ty^\f\u0010\u0014/c\u000f(z", "D`[6W(MS\u0002\ty^\u0015\u0007\u0018\u000fx\u000b(yO\u0001\u0016", "Dda6Y@\u001c]\"\r~l;|\u0012>", "Dda6Y@\u001c]\"\r~l;|\u0012>$\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "Ehc5E,:R\u0019\f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW*}/DF}\u001c6m#\u00044IEz;\"\u001e2fJ\u000f--^\u007f%VPX5j\u001cSM\u001d\u0010i\u0012X4WZ\u001d()jU3h\u000f(R\u0004\u0005R}\u0011\u0016\fD@", "5q^Bc\nH[$\t\u000bg+b\tCP{5\u000b", "<nS24;", "\u0011n\\=b:Bb\u001d\t\u0004<6\u0006\u0018/x\u000f\u000b\u0006G\u007f\u0017$", "\u0011n\\=b:Bb\u001d\t\u0004<6\u0006\u0018/x\u000f\f\u0004K\b", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class ComposerImpl implements Composer {
    public static final int $stable = 8;
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final ComposerChangeListWriter changeListWriter;
    private ChangeList changes;
    private int childrenComposing;
    private final ControlledComposition composition;
    private int compositionToken;
    private int compoundKeyHash;
    private ChangeList deferredChanges;
    private final ComposerImpl$derivedStateObserver$1 derivedStateObserver;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;
    private Anchor insertAnchor;
    private FixupList insertFixups;
    private SlotTable insertTable;
    private boolean inserting;
    private final Stack<RecomposeScopeImpl> invalidateStack;
    private boolean isComposing;
    private boolean isDisposed;
    private ChangeList lateChanges;
    private int[] nodeCountOverrides;
    private MutableIntIntMap nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;
    private final CompositionContext parentContext;
    private Pending pending;
    private PersistentCompositionLocalMap providerCache;
    private IntMap<PersistentCompositionLocalMap> providerUpdates;
    private boolean providersInvalid;
    private int rGroupIndex;
    private SlotReader reader;
    private boolean reusing;
    private final SlotTable slotTable;
    private boolean sourceMarkersEnabled;
    private SlotWriter writer;
    private boolean writerHasAProvider;
    private final Stack<Pending> pendingStack = new Stack<>();
    private final IntStack parentStateStack = new IntStack();
    private final List<Invalidation> invalidations = new ArrayList();
    private final IntStack entersStack = new IntStack();
    private PersistentCompositionLocalMap parentProvider = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
    private final IntStack providersInvalidStack = new IntStack();
    private int reusingGroup = -1;

    public static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    private final int insertedGroupVirtualIndex(int i2) {
        return (-2) - i2;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [androidx.compose.runtime.ComposerImpl$derivedStateObserver$1] */
    public ComposerImpl(Applier<?> applier, CompositionContext compositionContext, SlotTable slotTable, Set<RememberObserver> set, ChangeList changeList, ChangeList changeList2, ControlledComposition controlledComposition) {
        this.applier = applier;
        this.parentContext = compositionContext;
        this.slotTable = slotTable;
        this.abandonSet = set;
        this.changes = changeList;
        this.lateChanges = changeList2;
        this.composition = controlledComposition;
        this.sourceMarkersEnabled = compositionContext.getCollectingSourceInformation$runtime_release() || compositionContext.getCollectingCallByInformation$runtime_release();
        this.derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.ComposerImpl$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState<?> derivedState) {
                this.this$0.childrenComposing++;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState<?> derivedState) {
                ComposerImpl composerImpl = this.this$0;
                composerImpl.childrenComposing--;
            }
        };
        this.invalidateStack = new Stack<>();
        SlotReader slotReaderOpenReader = slotTable.openReader();
        slotReaderOpenReader.close();
        this.reader = slotReaderOpenReader;
        SlotTable slotTable2 = new SlotTable();
        if (compositionContext.getCollectingSourceInformation$runtime_release()) {
            slotTable2.collectSourceInformation();
        }
        if (compositionContext.getCollectingCallByInformation$runtime_release()) {
            slotTable2.collectCalledByInformation();
        }
        this.insertTable = slotTable2;
        SlotWriter slotWriterOpenWriter = slotTable2.openWriter();
        slotWriterOpenWriter.close(true);
        this.writer = slotWriterOpenWriter;
        this.changeListWriter = new ComposerChangeListWriter(this, this.changes);
        SlotReader slotReaderOpenReader2 = this.insertTable.openReader();
        try {
            Anchor anchor = slotReaderOpenReader2.anchor(0);
            slotReaderOpenReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new FixupList();
        } catch (Throwable th) {
            slotReaderOpenReader2.close();
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    public ControlledComposition getComposition() {
        return this.composition;
    }

    public final boolean isComposing$runtime_release() {
        return this.isComposing;
    }

    public final boolean isDisposed$runtime_release() {
        return this.isDisposed;
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        return this.childrenComposing > 0;
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return this.changes.isNotEmpty();
    }

    public final SlotReader getReader$runtime_release() {
        return this.reader;
    }

    public final void setReader$runtime_release(SlotReader slotReader) {
        this.reader = slotReader;
    }

    public final SlotTable getInsertTable$runtime_release() {
        return this.insertTable;
    }

    public final void setInsertTable$runtime_release(SlotTable slotTable) {
        this.insertTable = slotTable;
    }

    public final ChangeList getDeferredChanges$runtime_release() {
        return this.deferredChanges;
    }

    public final void setDeferredChanges$runtime_release(ChangeList changeList) {
        this.deferredChanges = changeList;
    }

    @Override // androidx.compose.runtime.Composer
    public CoroutineContext getApplyCoroutineContext() {
        return this.parentContext.getEffectCoroutineContext();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int i2) {
        m3638startBaiHCIY(i2, null, GroupKind.Companion.m3648getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceGroup(int i2) {
        if (this.pending != null) {
            m3638startBaiHCIY(i2, null, GroupKind.Companion.m3648getGroupULZAiWs(), null);
            return;
        }
        validateNodeNotExpected();
        this.compoundKeyHash = this.rGroupIndex ^ Integer.rotateLeft(Integer.rotateLeft(getCompoundKeyHash(), 3) ^ i2, 3);
        this.rGroupIndex++;
        SlotReader slotReader = this.reader;
        if (getInserting()) {
            slotReader.beginEmpty();
            this.writer.startGroup(i2, Composer.Companion.getEmpty());
            enterGroup(false, null);
            return;
        }
        if (slotReader.getGroupKey() == i2 && !slotReader.getHasObjectKey()) {
            slotReader.startGroup();
            enterGroup(false, null);
            return;
        }
        if (!slotReader.isGroupEnd()) {
            int i3 = this.nodeIndex;
            int currentGroup = slotReader.getCurrentGroup();
            recordDelete();
            this.changeListWriter.removeNode(i3, slotReader.skipGroup());
            ComposerKt.removeRange(this.invalidations, currentGroup, slotReader.getCurrentGroup());
        }
        slotReader.beginEmpty();
        this.inserting = true;
        this.providerCache = null;
        ensureWriter();
        SlotWriter slotWriter = this.writer;
        slotWriter.beginInsert();
        int currentGroup2 = slotWriter.getCurrentGroup();
        slotWriter.startGroup(i2, Composer.Companion.getEmpty());
        this.insertAnchor = slotWriter.anchor(currentGroup2);
        enterGroup(false, null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() {
        m3638startBaiHCIY(-127, null, GroupKind.Companion.m3648getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release == null || !currentRecomposeScope$runtime_release.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime_release.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        if (!getSkipping() || this.providersInvalid) {
            return true;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        return currentRecomposeScope$runtime_release != null && currentRecomposeScope$runtime_release.getDefaultsInvalid();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int i2, Object obj) {
        m3638startBaiHCIY(i2, obj, GroupKind.Companion.m3648getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endMovableGroup() {
        endGroup();
    }

    private final void startRoot() {
        this.rGroupIndex = 0;
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime_release();
        this.parentProvider = this.parentContext.getCompositionLocalScope$runtime_release();
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = changed(this.parentProvider);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation$runtime_release();
        }
        if (!this.sourceMarkersEnabled) {
            this.sourceMarkersEnabled = this.parentContext.getCollectingSourceInformation$runtime_release();
        }
        Set<CompositionData> set = (Set) CompositionLocalMapKt.read(this.parentProvider, InspectionTablesKt.getLocalInspectionTables());
        if (set != null) {
            set.add(this.slotTable);
            this.parentContext.recordInspectionTable$runtime_release(set);
        }
        startGroup(this.parentContext.getCompoundHashKey$runtime_release());
    }

    private final void endRoot() {
        endGroup();
        this.parentContext.doneComposing$runtime_release();
        endGroup();
        this.changeListWriter.endRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
        this.providersInvalid = ComposerKt.asBool(this.providersInvalidStack.pop());
    }

    private final void abortRoot() {
        cleanUpCompose();
        this.pendingStack.clear();
        this.parentStateStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates = null;
        this.insertFixups.clear();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
        if (!this.reader.getClosed()) {
            this.reader.close();
        }
        if (this.writer.getClosed()) {
            return;
        }
        forceFreshInsertTable();
    }

    public final void changesApplied$runtime_release() {
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        return (getInserting() || this.reusing || this.providersInvalid || (currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release()) == null || currentRecomposeScope$runtime_release.getRequiresRecompose() || this.forciblyRecompose) ? false : true;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.forceRecomposeScopes = true;
        this.sourceMarkersEnabled = true;
        this.slotTable.collectSourceInformation();
        this.insertTable.collectSourceInformation();
        this.writer.updateToTableMaps();
    }

    public final void dispose$runtime_release() {
        Object objBeginSection = Trace.INSTANCE.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime_release(this);
            deactivate$runtime_release();
            getApplier().clear();
            this.isDisposed = true;
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.INSTANCE.endSection(objBeginSection);
        }
    }

    public final void deactivate$runtime_release() {
        this.invalidateStack.clear();
        this.invalidations.clear();
        this.changes.clear();
        this.providerUpdates = null;
    }

    public final boolean forceRecomposeScopes$runtime_release() {
        if (this.forceRecomposeScopes) {
            return false;
        }
        this.forceRecomposeScopes = true;
        this.forciblyRecompose = true;
        return true;
    }

    private final void startGroup(int i2) {
        m3638startBaiHCIY(i2, null, GroupKind.Companion.m3648getGroupULZAiWs(), null);
    }

    private final void startGroup(int i2, Object obj) {
        m3638startBaiHCIY(i2, obj, GroupKind.Companion.m3648getGroupULZAiWs(), null);
    }

    private final void endGroup() {
        end(false);
    }

    private final void skipGroup() {
        this.groupNodeCount += this.reader.skipGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        m3638startBaiHCIY(125, null, GroupKind.Companion.m3649getNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        m3638startBaiHCIY(125, null, GroupKind.Companion.m3650getReusableNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(Function0<? extends T> function0) {
        validateNodeExpected();
        if (!getInserting()) {
            ComposerKt.composeImmediateRuntimeError("createNode() can only be called when inserting");
        }
        int iPeek = this.parentStateStack.peek();
        SlotWriter slotWriter = this.writer;
        Anchor anchor = slotWriter.anchor(slotWriter.getParent());
        this.groupNodeCount++;
        this.insertFixups.createAndInsertNode(function0, iPeek, anchor);
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        if (getInserting()) {
            ComposerKt.composeImmediateRuntimeError("useNode() called while inserting");
        }
        Object node = getNode(this.reader);
        this.changeListWriter.moveDown(node);
        if (this.reusing && (node instanceof ComposeNodeLifecycleCallback)) {
            this.changeListWriter.useNode(node);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int i2, Object obj) {
        if (!getInserting() && this.reader.getGroupKey() == i2 && !Intrinsics.areEqual(this.reader.getGroupAux(), obj) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrentGroup();
            this.reusing = true;
        }
        m3638startBaiHCIY(i2, null, GroupKind.Companion.m3648getGroupULZAiWs(), obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    public final void startReuseFromRoot() {
        this.reusingGroup = 100;
        this.reusing = true;
    }

    public final void endReuseFromRoot() {
        if (!(!this.isComposing && this.reusingGroup == 100)) {
            PreconditionsKt.throwIllegalArgumentException("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCurrentMarker() {
        return getInserting() ? -this.writer.getParent() : this.reader.getParent();
    }

    @Override // androidx.compose.runtime.Composer
    public void endToMarker(int i2) {
        if (i2 < 0) {
            int i3 = -i2;
            SlotWriter slotWriter = this.writer;
            while (true) {
                int parent = slotWriter.getParent();
                if (parent <= i3) {
                    return;
                } else {
                    end(slotWriter.isNode(parent));
                }
            }
        } else {
            if (getInserting()) {
                SlotWriter slotWriter2 = this.writer;
                while (getInserting()) {
                    end(slotWriter2.isNode(slotWriter2.getParent()));
                }
            }
            SlotReader slotReader = this.reader;
            while (true) {
                int parent2 = slotReader.getParent();
                if (parent2 <= i2) {
                    return;
                } else {
                    end(slotReader.isNode(parent2));
                }
            }
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(V v2, Function2<? super T, ? super V, Unit> function2) {
        if (getInserting()) {
            this.insertFixups.updateNode(v2, function2);
        } else {
            this.changeListWriter.updateNode(v2, function2);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public Object joinKey(Object obj, Object obj2) {
        Object key = ComposerKt.getKey(this.reader.getGroupObjectKey(), obj, obj2);
        return key == null ? new JoinedKey(obj, obj2) : key;
    }

    public final Object nextSlot() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.Companion.getEmpty();
        }
        Object next = this.reader.next();
        return (!this.reusing || (next instanceof ReusableRememberObserver)) ? next : Composer.Companion.getEmpty();
    }

    public final Object nextSlotForCache() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.Companion.getEmpty();
        }
        Object next = this.reader.next();
        return (!this.reusing || (next instanceof ReusableRememberObserver)) ? next instanceof RememberObserverHolder ? ((RememberObserverHolder) next).getWrapped() : next : Composer.Companion.getEmpty();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(Object obj) {
        if (Intrinsics.areEqual(nextSlot(), obj)) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changedInstance(Object obj) {
        if (nextSlot() == obj) {
            return false;
        }
        updateValue(obj);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char c2) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Character) && c2 == ((Character) objNextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(c2));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte b2) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Byte) && b2 == ((Number) objNextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(b2));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short s2) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Short) && s2 == ((Number) objNextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(s2));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean z2) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Boolean) && z2 == ((Boolean) objNextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(z2));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float f2) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Float) && f2 == ((Number) objNextSlot).floatValue()) {
            return false;
        }
        updateValue(Float.valueOf(f2));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long j2) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Long) && j2 == ((Number) objNextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(j2));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double d2) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Double) && d2 == ((Number) objNextSlot).doubleValue()) {
            return false;
        }
        updateValue(Double.valueOf(d2));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int i2) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Integer) && i2 == ((Number) objNextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(i2));
        return true;
    }

    @ComposeCompilerApi
    public final <T> T cache(boolean z2, Function0<? extends T> function0) {
        T t2 = (T) nextSlotForCache();
        if (t2 != Composer.Companion.getEmpty() && !z2) {
            return t2;
        }
        T tInvoke = function0.invoke();
        updateCachedValue(tInvoke);
        return tInvoke;
    }

    private final void updateSlot(Object obj) {
        nextSlot();
        updateValue(obj);
    }

    public final void updateValue(Object obj) {
        if (getInserting()) {
            this.writer.update(obj);
            return;
        }
        if (this.reader.getHadNext()) {
            int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
            if (this.changeListWriter.getPastParent()) {
                ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                SlotReader slotReader = this.reader;
                composerChangeListWriter.updateAnchoredValue(obj, slotReader.anchor(slotReader.getParent()), groupSlotIndex);
                return;
            }
            this.changeListWriter.updateValue(obj, groupSlotIndex);
            return;
        }
        ComposerChangeListWriter composerChangeListWriter2 = this.changeListWriter;
        SlotReader slotReader2 = this.reader;
        composerChangeListWriter2.appendValue(slotReader2.anchor(slotReader2.getParent()), obj);
    }

    public final void updateCachedValue(Object obj) {
        if (obj instanceof RememberObserver) {
            if (getInserting()) {
                this.changeListWriter.remember((RememberObserver) obj);
            }
            this.abandonSet.add(obj);
            obj = new RememberObserverHolder((RememberObserver) obj, rememberObserverAnchor());
        }
        updateValue(obj);
    }

    private final Anchor rememberObserverAnchor() {
        int i2;
        int i3;
        if (getInserting()) {
            if (!ComposerKt.isAfterFirstChild(this.writer)) {
                return null;
            }
            int currentGroup = this.writer.getCurrentGroup() - 1;
            int iParent = this.writer.parent(currentGroup);
            while (true) {
                i3 = currentGroup;
                currentGroup = iParent;
                if (currentGroup == this.writer.getParent() || currentGroup < 0) {
                    break;
                }
                iParent = this.writer.parent(currentGroup);
            }
            return this.writer.anchor(i3);
        }
        if (!ComposerKt.isAfterFirstChild(this.reader)) {
            return null;
        }
        int currentGroup2 = this.reader.getCurrentGroup() - 1;
        int iParent2 = this.reader.parent(currentGroup2);
        while (true) {
            i2 = currentGroup2;
            currentGroup2 = iParent2;
            if (currentGroup2 == this.reader.getParent() || currentGroup2 < 0) {
                break;
            }
            iParent2 = this.reader.parent(currentGroup2);
        }
        return this.reader.anchor(i2);
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionData getCompositionData() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(Function0<Unit> function0) {
        this.changeListWriter.sideEffect(function0);
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope() {
        PersistentCompositionLocalMap persistentCompositionLocalMap = this.providerCache;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : currentCompositionLocalScope(this.reader.getParent());
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionLocalMap getCurrentCompositionLocalMap() {
        return currentCompositionLocalScope();
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope(int i2) {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && Intrinsics.areEqual(this.writer.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object objGroupAux = this.writer.groupAux(parent);
                    Intrinsics.checkNotNull(objGroupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) objGroupAux;
                    this.providerCache = persistentCompositionLocalMap2;
                    return persistentCompositionLocalMap2;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.reader.getSize() > 0) {
            while (i2 > 0) {
                if (this.reader.groupKey(i2) == 202 && Intrinsics.areEqual(this.reader.groupObjectKey(i2), ComposerKt.getCompositionLocalMap())) {
                    IntMap<PersistentCompositionLocalMap> intMap = this.providerUpdates;
                    if (intMap == null || (persistentCompositionLocalMap = intMap.get(i2)) == null) {
                        Object objGroupAux2 = this.reader.groupAux(i2);
                        Intrinsics.checkNotNull(objGroupAux2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        persistentCompositionLocalMap = (PersistentCompositionLocalMap) objGroupAux2;
                    }
                    this.providerCache = persistentCompositionLocalMap;
                    return persistentCompositionLocalMap;
                }
                i2 = this.reader.parent(i2);
            }
        }
        PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.parentProvider;
        this.providerCache = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    @Override // androidx.compose.runtime.Composer
    public void startProvider(ProvidedValue<?> providedValue) {
        ValueHolder<?> valueHolder;
        PersistentCompositionLocalMap persistentCompositionLocalMapCurrentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, ComposerKt.getProvider());
        Object objRememberedValue = rememberedValue();
        if (Intrinsics.areEqual(objRememberedValue, Composer.Companion.getEmpty())) {
            valueHolder = null;
        } else {
            Intrinsics.checkNotNull(objRememberedValue, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            valueHolder = (ValueHolder) objRememberedValue;
        }
        CompositionLocal<?> compositionLocal = providedValue.getCompositionLocal();
        Intrinsics.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Intrinsics.checkNotNull(providedValue, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        ValueHolder<?> valueHolderUpdatedStateOf$runtime_release = compositionLocal.updatedStateOf$runtime_release(providedValue, valueHolder);
        boolean zAreEqual = Intrinsics.areEqual(valueHolderUpdatedStateOf$runtime_release, valueHolder);
        if (!zAreEqual) {
            updateRememberedValue(valueHolderUpdatedStateOf$runtime_release);
        }
        boolean z2 = true;
        boolean z3 = false;
        if (getInserting()) {
            if (providedValue.getCanOverride() || !CompositionLocalMapKt.contains(persistentCompositionLocalMapCurrentCompositionLocalScope, compositionLocal)) {
                persistentCompositionLocalMapCurrentCompositionLocalScope = persistentCompositionLocalMapCurrentCompositionLocalScope.putValue(compositionLocal, valueHolderUpdatedStateOf$runtime_release);
            }
            this.writerHasAProvider = true;
        } else {
            SlotReader slotReader = this.reader;
            Object objGroupAux = slotReader.groupAux(slotReader.getCurrentGroup());
            Intrinsics.checkNotNull(objGroupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) objGroupAux;
            if ((getSkipping() && zAreEqual) || (!providedValue.getCanOverride() && CompositionLocalMapKt.contains(persistentCompositionLocalMapCurrentCompositionLocalScope, compositionLocal))) {
                persistentCompositionLocalMapCurrentCompositionLocalScope = persistentCompositionLocalMap;
            } else {
                persistentCompositionLocalMapCurrentCompositionLocalScope = persistentCompositionLocalMapCurrentCompositionLocalScope.putValue(compositionLocal, valueHolderUpdatedStateOf$runtime_release);
            }
            if (!this.reusing && persistentCompositionLocalMap == persistentCompositionLocalMapCurrentCompositionLocalScope) {
                z2 = false;
            }
            z3 = z2;
        }
        if (z3 && !getInserting()) {
            recordProviderUpdate(persistentCompositionLocalMapCurrentCompositionLocalScope);
        }
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = z3;
        this.providerCache = persistentCompositionLocalMapCurrentCompositionLocalScope;
        m3638startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m3648getGroupULZAiWs(), persistentCompositionLocalMapCurrentCompositionLocalScope);
    }

    private final void recordProviderUpdate(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        IntMap<PersistentCompositionLocalMap> intMap = this.providerUpdates;
        if (intMap == null) {
            intMap = new IntMap<>(0, 1, null);
            this.providerUpdates = intMap;
        }
        intMap.set(this.reader.getCurrentGroup(), persistentCompositionLocalMap);
    }

    @Override // androidx.compose.runtime.Composer
    public void endProvider() {
        endGroup();
        endGroup();
        this.providersInvalid = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    public void startProviders(ProvidedValue<?>[] providedValueArr) {
        PersistentCompositionLocalMap persistentCompositionLocalMapUpdateProviderMapGroup;
        PersistentCompositionLocalMap persistentCompositionLocalMapCurrentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, ComposerKt.getProvider());
        boolean z2 = true;
        boolean z3 = false;
        if (getInserting()) {
            persistentCompositionLocalMapUpdateProviderMapGroup = updateProviderMapGroup(persistentCompositionLocalMapCurrentCompositionLocalScope, CompositionLocalMapKt.updateCompositionMap$default(providedValueArr, persistentCompositionLocalMapCurrentCompositionLocalScope, null, 4, null));
            this.writerHasAProvider = true;
        } else {
            Object objGroupGet = this.reader.groupGet(0);
            Intrinsics.checkNotNull(objGroupGet, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) objGroupGet;
            Object objGroupGet2 = this.reader.groupGet(1);
            Intrinsics.checkNotNull(objGroupGet2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) objGroupGet2;
            PersistentCompositionLocalMap persistentCompositionLocalMapUpdateCompositionMap = CompositionLocalMapKt.updateCompositionMap(providedValueArr, persistentCompositionLocalMapCurrentCompositionLocalScope, persistentCompositionLocalMap2);
            if (!getSkipping() || this.reusing || !Intrinsics.areEqual(persistentCompositionLocalMap2, persistentCompositionLocalMapUpdateCompositionMap)) {
                persistentCompositionLocalMapUpdateProviderMapGroup = updateProviderMapGroup(persistentCompositionLocalMapCurrentCompositionLocalScope, persistentCompositionLocalMapUpdateCompositionMap);
                if (!this.reusing && Intrinsics.areEqual(persistentCompositionLocalMapUpdateProviderMapGroup, persistentCompositionLocalMap)) {
                    z2 = false;
                }
                z3 = z2;
            } else {
                skipGroup();
                persistentCompositionLocalMapUpdateProviderMapGroup = persistentCompositionLocalMap;
            }
        }
        if (z3 && !getInserting()) {
            recordProviderUpdate(persistentCompositionLocalMapUpdateProviderMapGroup);
        }
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = z3;
        this.providerCache = persistentCompositionLocalMapUpdateProviderMapGroup;
        m3638startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m3648getGroupULZAiWs(), persistentCompositionLocalMapUpdateProviderMapGroup);
    }

    @Override // androidx.compose.runtime.Composer
    public void endProviders() {
        endGroup();
        endGroup();
        this.providersInvalid = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    public <T> T consume(CompositionLocal<T> compositionLocal) {
        return (T) CompositionLocalMapKt.read(currentCompositionLocalScope(), compositionLocal);
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionContext buildContext() {
        startGroup(206, ComposerKt.getReference());
        if (getInserting()) {
            SlotWriter.markGroup$default(this.writer, 0, 1, null);
        }
        Object objNextSlot = nextSlot();
        CompositionContextHolder compositionContextHolder = objNextSlot instanceof CompositionContextHolder ? (CompositionContextHolder) objNextSlot : null;
        if (compositionContextHolder == null) {
            int compoundKeyHash = getCompoundKeyHash();
            boolean z2 = this.forceRecomposeScopes;
            boolean z3 = this.sourceMarkersEnabled;
            ControlledComposition composition = getComposition();
            CompositionImpl compositionImpl = composition instanceof CompositionImpl ? (CompositionImpl) composition : null;
            compositionContextHolder = new CompositionContextHolder(new CompositionContextImpl(compoundKeyHash, z2, z3, compositionImpl != null ? compositionImpl.getObserverHolder$runtime_release() : null));
            updateValue(compositionContextHolder);
        }
        compositionContextHolder.getRef().updateCompositionLocalScope(currentCompositionLocalScope());
        endGroup();
        return compositionContextHolder.getRef();
    }

    public final int getChangeCount$runtime_release() {
        return this.changes.getSize();
    }

    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        Stack<RecomposeScopeImpl> stack = this.invalidateStack;
        if (this.childrenComposing == 0 && stack.isNotEmpty()) {
            return stack.peek();
        }
        return null;
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter slotWriterOpenWriter = this.insertTable.openWriter();
            this.writer = slotWriterOpenWriter;
            slotWriterOpenWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void createFreshInsertTable() {
        ComposerKt.runtimeCheck(this.writer.getClosed());
        forceFreshInsertTable();
    }

    private final void forceFreshInsertTable() {
        SlotTable slotTable = new SlotTable();
        if (this.sourceMarkersEnabled) {
            slotTable.collectSourceInformation();
        }
        if (this.parentContext.getCollectingCallByInformation$runtime_release()) {
            slotTable.collectCalledByInformation();
        }
        this.insertTable = slotTable;
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        slotWriterOpenWriter.close(true);
        this.writer = slotWriterOpenWriter;
    }

    private final void startReaderGroup(boolean z2, Object obj) {
        if (z2) {
            this.reader.startNode();
            return;
        }
        if (obj != null && this.reader.getGroupAux() != obj) {
            this.changeListWriter.updateAuxData(obj);
        }
        this.reader.startGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX INFO: renamed from: start-BaiHCIY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m3638startBaiHCIY(int r19, java.lang.Object r20, int r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.m3638startBaiHCIY(int, java.lang.Object, int, java.lang.Object):void");
    }

    private final void enterGroup(boolean z2, Pending pending) {
        this.pendingStack.push(this.pending);
        this.pending = pending;
        this.parentStateStack.push(this.groupNodeCount);
        this.parentStateStack.push(this.rGroupIndex);
        this.parentStateStack.push(this.nodeIndex);
        if (z2) {
            this.nodeIndex = 0;
        }
        this.groupNodeCount = 0;
        this.rGroupIndex = 0;
    }

    private final void exitGroup(int i2, boolean z2) {
        Pending pendingPop = this.pendingStack.pop();
        if (pendingPop != null && !z2) {
            pendingPop.setGroupIndex(pendingPop.getGroupIndex() + 1);
        }
        this.pending = pendingPop;
        this.nodeIndex = this.parentStateStack.pop() + i2;
        this.rGroupIndex = this.parentStateStack.pop();
        this.groupNodeCount = this.parentStateStack.pop() + i2;
    }

    private final void end(boolean z2) {
        int iHashCode;
        int iHashCode2;
        int iPeek2 = this.parentStateStack.peek2() - 1;
        if (getInserting()) {
            int parent = this.writer.getParent();
            int iGroupKey = this.writer.groupKey(parent);
            Object objGroupObjectKey = this.writer.groupObjectKey(parent);
            Object objGroupAux = this.writer.groupAux(parent);
            if (objGroupObjectKey != null) {
                iHashCode2 = Integer.hashCode(objGroupObjectKey instanceof Enum ? ((Enum) objGroupObjectKey).ordinal() : objGroupObjectKey.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3);
            } else if (objGroupAux == null || iGroupKey != 207 || Intrinsics.areEqual(objGroupAux, Composer.Companion.getEmpty())) {
                iHashCode2 = Integer.rotateRight(iPeek2 ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(iGroupKey);
            } else {
                this.compoundKeyHash = Integer.rotateRight(Integer.rotateRight(iPeek2 ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(objGroupAux.hashCode()), 3);
            }
            this.compoundKeyHash = Integer.rotateRight(iHashCode2, 3);
        } else {
            int parent2 = this.reader.getParent();
            int iGroupKey2 = this.reader.groupKey(parent2);
            Object objGroupObjectKey2 = this.reader.groupObjectKey(parent2);
            Object objGroupAux2 = this.reader.groupAux(parent2);
            if (objGroupObjectKey2 != null) {
                iHashCode = Integer.hashCode(objGroupObjectKey2 instanceof Enum ? ((Enum) objGroupObjectKey2).ordinal() : objGroupObjectKey2.hashCode()) ^ Integer.rotateRight(getCompoundKeyHash(), 3);
            } else if (objGroupAux2 == null || iGroupKey2 != 207 || Intrinsics.areEqual(objGroupAux2, Composer.Companion.getEmpty())) {
                iHashCode = Integer.rotateRight(iPeek2 ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(iGroupKey2);
            } else {
                this.compoundKeyHash = Integer.rotateRight(Integer.rotateRight(iPeek2 ^ getCompoundKeyHash(), 3) ^ Integer.hashCode(objGroupAux2.hashCode()), 3);
            }
            this.compoundKeyHash = Integer.rotateRight(iHashCode, 3);
        }
        int i2 = this.groupNodeCount;
        Pending pending = this.pending;
        if (pending != null && pending.getKeyInfos().size() > 0) {
            List<KeyInfo> keyInfos = pending.getKeyInfos();
            List<KeyInfo> used = pending.getUsed();
            Set setFastToSet = ListUtilsKt.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i3 = 0;
            int i4 = 0;
            int iUpdatedNodeCountOf = 0;
            while (i3 < size2) {
                KeyInfo keyInfo = keyInfos.get(i3);
                if (!setFastToSet.contains(keyInfo)) {
                    this.changeListWriter.removeNode(pending.nodePositionOf(keyInfo) + pending.getStartIndex(), keyInfo.getNodes());
                    pending.updateNodeCount(keyInfo.getLocation(), 0);
                    this.changeListWriter.moveReaderRelativeTo(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    ComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), keyInfo.getLocation() + this.reader.groupSize(keyInfo.getLocation()));
                } else if (!linkedHashSet.contains(keyInfo)) {
                    if (i4 < size) {
                        KeyInfo keyInfo2 = used.get(i4);
                        if (keyInfo2 != keyInfo) {
                            int iNodePositionOf = pending.nodePositionOf(keyInfo2);
                            linkedHashSet.add(keyInfo2);
                            if (iNodePositionOf != iUpdatedNodeCountOf) {
                                int iUpdatedNodeCountOf2 = pending.updatedNodeCountOf(keyInfo2);
                                this.changeListWriter.moveNode(pending.getStartIndex() + iNodePositionOf, pending.getStartIndex() + iUpdatedNodeCountOf, iUpdatedNodeCountOf2);
                                pending.registerMoveNode(iNodePositionOf, iUpdatedNodeCountOf, iUpdatedNodeCountOf2);
                            }
                        } else {
                            i3++;
                        }
                        i4++;
                        iUpdatedNodeCountOf += pending.updatedNodeCountOf(keyInfo2);
                    }
                }
                i3++;
            }
            this.changeListWriter.endNodeMovement();
            if (keyInfos.size() > 0) {
                this.changeListWriter.moveReaderRelativeTo(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        int i5 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int currentGroup = this.reader.getCurrentGroup();
            recordDelete();
            this.changeListWriter.removeNode(i5, this.reader.skipGroup());
            ComposerKt.removeRange(this.invalidations, currentGroup, this.reader.getCurrentGroup());
        }
        boolean inserting = getInserting();
        if (inserting) {
            if (z2) {
                this.insertFixups.endNodeInsert();
                i2 = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int iInsertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close(true);
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(iInsertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(iInsertedGroupVirtualIndex, i2);
                }
            }
        } else {
            if (z2) {
                this.changeListWriter.moveUp();
            }
            int remainingSlots = this.reader.getRemainingSlots();
            if (remainingSlots > 0) {
                this.changeListWriter.trimValues(remainingSlots);
            }
            this.changeListWriter.endCurrentGroup();
            int parent4 = this.reader.getParent();
            if (i2 != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i2);
            }
            if (z2) {
                i2 = 1;
            }
            this.reader.endGroup();
            this.changeListWriter.endNodeMovement();
        }
        exitGroup(i2, inserting);
    }

    private final void recomposeToGroupEnd() {
        boolean z2 = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int iGroupSize = this.reader.groupSize(parent) + parent;
        int i2 = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i3 = this.groupNodeCount;
        int i4 = this.rGroupIndex;
        Invalidation invalidationFirstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), iGroupSize);
        boolean z3 = false;
        int i5 = parent;
        while (invalidationFirstInRange != null) {
            int location = invalidationFirstInRange.getLocation();
            ComposerKt.removeLocation(this.invalidations, location);
            if (invalidationFirstInRange.isInvalid()) {
                this.reader.reposition(location);
                int currentGroup = this.reader.getCurrentGroup();
                recordUpsAndDowns(i5, currentGroup, parent);
                this.nodeIndex = nodeIndexOf(location, currentGroup, parent, i2);
                this.rGroupIndex = rGroupIndexOf(currentGroup);
                int iParent = this.reader.parent(currentGroup);
                this.compoundKeyHash = compoundKeyOf(iParent, rGroupIndexOf(iParent), parent, compoundKeyHash);
                this.providerCache = null;
                invalidationFirstInRange.getScope().compose(this);
                this.providerCache = null;
                this.reader.restoreParent(parent);
                i5 = currentGroup;
                z3 = true;
            } else {
                this.invalidateStack.push(invalidationFirstInRange.getScope());
                invalidationFirstInRange.getScope().rereadTrackedInstances();
                this.invalidateStack.pop();
            }
            invalidationFirstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrentGroup(), iGroupSize);
        }
        if (z3) {
            recordUpsAndDowns(i5, parent, parent);
            this.reader.skipToGroupEnd();
            int iUpdatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i2 + iUpdatedNodeCount;
            this.groupNodeCount = i3 + iUpdatedNodeCount;
            this.rGroupIndex = i4;
        } else {
            skipReaderToGroupEnd();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z2;
    }

    private final void updateNodeCountOverrides(int i2, int i3) {
        int iUpdatedNodeCount = updatedNodeCount(i2);
        if (iUpdatedNodeCount != i3) {
            int i4 = i3 - iUpdatedNodeCount;
            int size = this.pendingStack.getSize() - 1;
            while (i2 != -1) {
                int iUpdatedNodeCount2 = updatedNodeCount(i2) + i4;
                updateNodeCount(i2, iUpdatedNodeCount2);
                int i5 = size;
                while (true) {
                    if (-1 < i5) {
                        Pending pendingPeek = this.pendingStack.peek(i5);
                        if (pendingPeek != null && pendingPeek.updateNodeCount(i2, iUpdatedNodeCount2)) {
                            size = i5 - 1;
                            break;
                        }
                        i5--;
                    } else {
                        break;
                    }
                }
                if (i2 < 0) {
                    i2 = this.reader.getParent();
                } else if (!this.reader.isNode(i2)) {
                    i2 = this.reader.parent(i2);
                } else {
                    return;
                }
            }
        }
    }

    private final int nodeIndexOf(int i2, int i3, int i4, int i5) {
        int iParent = this.reader.parent(i3);
        while (iParent != i4 && !this.reader.isNode(iParent)) {
            iParent = this.reader.parent(iParent);
        }
        if (this.reader.isNode(iParent)) {
            i5 = 0;
        }
        if (iParent == i3) {
            return i5;
        }
        int iUpdatedNodeCount = (updatedNodeCount(iParent) - this.reader.nodeCount(i3)) + i5;
        loop1: while (i5 < iUpdatedNodeCount && iParent != i2) {
            iParent++;
            while (iParent < i2) {
                int iGroupSize = this.reader.groupSize(iParent) + iParent;
                if (i2 >= iGroupSize) {
                    i5 += this.reader.isNode(iParent) ? 1 : updatedNodeCount(iParent);
                    iParent = iGroupSize;
                }
            }
            break loop1;
        }
        return i5;
    }

    private final int rGroupIndexOf(int i2) {
        int iParent = this.reader.parent(i2) + 1;
        int i3 = 0;
        while (iParent < i2) {
            if (!this.reader.hasObjectKey(iParent)) {
                i3++;
            }
            iParent += this.reader.groupSize(iParent);
        }
        return i3;
    }

    private final int updatedNodeCount(int i2) {
        int i3;
        if (i2 < 0) {
            MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
            if (mutableIntIntMap == null || !mutableIntIntMap.contains(i2)) {
                return 0;
            }
            return mutableIntIntMap.get(i2);
        }
        int[] iArr = this.nodeCountOverrides;
        return (iArr == null || (i3 = iArr[i2]) < 0) ? this.reader.nodeCount(i2) : i3;
    }

    private final void updateNodeCount(int i2, int i3) {
        if (updatedNodeCount(i2) != i3) {
            if (i2 < 0) {
                MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
                if (mutableIntIntMap == null) {
                    mutableIntIntMap = new MutableIntIntMap(0, 1, null);
                    this.nodeCountVirtualOverrides = mutableIntIntMap;
                }
                mutableIntIntMap.set(i2, i3);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getSize()];
                ArraysKt.fill$default(iArr, -1, 0, 0, 6, (Object) null);
                this.nodeCountOverrides = iArr;
            }
            iArr[i2] = i3;
        }
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final void recordUpsAndDowns(int i2, int i3, int i4) {
        SlotReader slotReader = this.reader;
        int iNearestCommonRootOf = ComposerKt.nearestCommonRootOf(slotReader, i2, i3, i4);
        while (i2 > 0 && i2 != iNearestCommonRootOf) {
            if (slotReader.isNode(i2)) {
                this.changeListWriter.moveUp();
            }
            i2 = slotReader.parent(i2);
        }
        doRecordDownsFor(i3, iNearestCommonRootOf);
    }

    private final void doRecordDownsFor(int i2, int i3) {
        if (i2 <= 0 || i2 == i3) {
            return;
        }
        doRecordDownsFor(this.reader.parent(i2), i3);
        if (this.reader.isNode(i2)) {
            this.changeListWriter.moveDown(nodeAt(this.reader, i2));
        }
    }

    private final int groupCompoundKeyPart(SlotReader slotReader, int i2) {
        Object objGroupAux;
        if (slotReader.hasObjectKey(i2)) {
            Object objGroupObjectKey = slotReader.groupObjectKey(i2);
            if (objGroupObjectKey != null) {
                return objGroupObjectKey instanceof Enum ? ((Enum) objGroupObjectKey).ordinal() : objGroupObjectKey instanceof MovableContent ? MovableContentKt.movableContentKey : objGroupObjectKey.hashCode();
            }
            return 0;
        }
        int iGroupKey = slotReader.groupKey(i2);
        return (iGroupKey != 207 || (objGroupAux = slotReader.groupAux(i2)) == null || Intrinsics.areEqual(objGroupAux, Composer.Companion.getEmpty())) ? iGroupKey : objGroupAux.hashCode();
    }

    public final boolean tryImminentInvalidation$runtime_release(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.reader.getTable$runtime_release());
        if (!this.isComposing || indexFor < this.reader.getCurrentGroup()) {
            return false;
        }
        ComposerKt.insertIfMissing(this.invalidations, indexFor, recomposeScopeImpl, obj);
        return true;
    }

    public final int parentKey$runtime_release() {
        if (getInserting()) {
            SlotWriter slotWriter = this.writer;
            return slotWriter.groupKey(slotWriter.getParent());
        }
        SlotReader slotReader = this.reader;
        return slotReader.groupKey(slotReader.getParent());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    @Override // androidx.compose.runtime.Composer
    @androidx.compose.runtime.ComposeCompilerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void skipCurrentGroup() {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.skipCurrentGroup():void");
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipToGroupEnd() {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling skipAndEndGroup");
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            currentRecomposeScope$runtime_release.scopeSkipped();
        }
        if (this.invalidations.isEmpty()) {
            skipReaderToGroupEnd();
        } else {
            recomposeToGroupEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void deactivateToEndGroup(boolean z2) {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!z2) {
            skipReaderToGroupEnd();
            return;
        }
        int currentGroup = this.reader.getCurrentGroup();
        int currentEnd = this.reader.getCurrentEnd();
        this.changeListWriter.deactivateCurrentGroup();
        ComposerKt.removeRange(this.invalidations, currentGroup, currentEnd);
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public Composer startRestartGroup(int i2) {
        startReplaceGroup(i2);
        addRecomposeScope();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void addRecomposeScope() {
        /*
            r4 = this;
            boolean r0 = r4.getInserting()
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl"
            if (r0 == 0) goto L27
            androidx.compose.runtime.RecomposeScopeImpl r1 = new androidx.compose.runtime.RecomposeScopeImpl
            androidx.compose.runtime.ControlledComposition r0 = r4.getComposition()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r3)
            androidx.compose.runtime.CompositionImpl r0 = (androidx.compose.runtime.CompositionImpl) r0
            androidx.compose.runtime.RecomposeScopeOwner r0 = (androidx.compose.runtime.RecomposeScopeOwner) r0
            r1.<init>(r0)
            androidx.compose.runtime.Stack<androidx.compose.runtime.RecomposeScopeImpl> r0 = r4.invalidateStack
            r0.push(r1)
            r4.updateValue(r1)
            int r0 = r4.compositionToken
            r1.start(r0)
        L26:
            return
        L27:
            java.util.List<androidx.compose.runtime.Invalidation> r1 = r4.invalidations
            androidx.compose.runtime.SlotReader r0 = r4.reader
            int r0 = r0.getParent()
            androidx.compose.runtime.Invalidation r1 = androidx.compose.runtime.ComposerKt.access$removeLocation(r1, r0)
            androidx.compose.runtime.SlotReader r0 = r4.reader
            java.lang.Object r2 = r0.next()
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r0 = r0.getEmpty()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L75
            androidx.compose.runtime.RecomposeScopeImpl r2 = new androidx.compose.runtime.RecomposeScopeImpl
            androidx.compose.runtime.ControlledComposition r0 = r4.getComposition()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r3)
            androidx.compose.runtime.CompositionImpl r0 = (androidx.compose.runtime.CompositionImpl) r0
            androidx.compose.runtime.RecomposeScopeOwner r0 = (androidx.compose.runtime.RecomposeScopeOwner) r0
            r2.<init>(r0)
            r4.updateValue(r2)
        L58:
            if (r1 != 0) goto L66
            boolean r1 = r2.getForcedRecompose()
            r0 = 0
            if (r1 == 0) goto L64
            r2.setForcedRecompose(r0)
        L64:
            if (r1 == 0) goto L67
        L66:
            r0 = 1
        L67:
            r2.setRequiresRecompose(r0)
            androidx.compose.runtime.Stack<androidx.compose.runtime.RecomposeScopeImpl> r0 = r4.invalidateStack
            r0.push(r2)
            int r0 = r4.compositionToken
            r2.start(r0)
            goto L26
        L75:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r0)
            androidx.compose.runtime.RecomposeScopeImpl r2 = (androidx.compose.runtime.RecomposeScopeImpl) r2
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.addRecomposeScope():void");
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public ScopeUpdateScope endRestartGroup() {
        Anchor anchor;
        Function1<Composition, Unit> function1End;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl recomposeScopeImplPop = this.invalidateStack.isNotEmpty() ? this.invalidateStack.pop() : null;
        if (recomposeScopeImplPop != null) {
            recomposeScopeImplPop.setRequiresRecompose(false);
        }
        if (recomposeScopeImplPop != null && (function1End = recomposeScopeImplPop.end(this.compositionToken)) != null) {
            this.changeListWriter.endCompositionScope(function1End, getComposition());
        }
        if (recomposeScopeImplPop != null && !recomposeScopeImplPop.getSkipped$runtime_release() && (recomposeScopeImplPop.getUsed() || this.forceRecomposeScopes)) {
            if (recomposeScopeImplPop.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                recomposeScopeImplPop.setAnchor(anchor);
            }
            recomposeScopeImplPop.setDefaultsInvalid(false);
            recomposeScopeImpl = recomposeScopeImplPop;
        }
        end(false);
        return recomposeScopeImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public void insertMovableContent(MovableContent<?> movableContent, Object obj) {
        Intrinsics.checkNotNull(movableContent, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        invokeMovableContentLambda(movableContent, currentCompositionLocalScope(), obj, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invokeMovableContentLambda(final MovableContent<Object> movableContent, PersistentCompositionLocalMap persistentCompositionLocalMap, final Object obj, boolean z2) {
        startMovableGroup(MovableContentKt.movableContentKey, movableContent);
        updateSlot(obj);
        int compoundKeyHash = getCompoundKeyHash();
        try {
            this.compoundKeyHash = MovableContentKt.movableContentKey;
            boolean z3 = false;
            if (getInserting()) {
                SlotWriter.markGroup$default(this.writer, 0, 1, null);
            }
            if (!getInserting() && !Intrinsics.areEqual(this.reader.getGroupAux(), persistentCompositionLocalMap)) {
                z3 = true;
            }
            if (z3) {
                recordProviderUpdate(persistentCompositionLocalMap);
            }
            m3638startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.Companion.m3648getGroupULZAiWs(), persistentCompositionLocalMap);
            this.providerCache = null;
            if (getInserting() && !z2) {
                this.writerHasAProvider = true;
                SlotWriter slotWriter = this.writer;
                this.parentContext.insertMovableContent$runtime_release(new MovableContentStateReference(movableContent, obj, getComposition(), this.insertTable, slotWriter.anchor(slotWriter.parent(slotWriter.getParent())), CollectionsKt.emptyList(), currentCompositionLocalScope()));
            } else {
                boolean z4 = this.providersInvalid;
                this.providersInvalid = z3;
                ActualJvm_jvmKt.invokeComposable(this, ComposableLambdaKt.composableLambdaInstance(316014703, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i2) {
                        ComposerKt.sourceInformation(composer, "C3293@126183L18:Composer.kt#9igjgp");
                        if ((i2 + 3) - (3 | i2) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(316014703, i2, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3293)");
                        }
                        movableContent.getContent().invoke(obj, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                this.providersInvalid = z4;
            }
        } finally {
            endGroup();
            this.providerCache = null;
            this.compoundKeyHash = compoundKeyHash;
            endMovableGroup();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void insertMovableContentReferences(List<Pair<MovableContentStateReference, MovableContentStateReference>> list) {
        try {
            insertMovableContentGuarded(list);
            cleanUpCompose();
        } catch (Throwable th) {
            abortRoot();
            throw th;
        }
    }

    private final void insertMovableContentGuarded(List<Pair<MovableContentStateReference, MovableContentStateReference>> list) throws Throwable {
        SlotTable slotTable$runtime_release;
        Anchor anchor$runtime_release;
        SlotTable slotTable$runtime_release2;
        final ChangeList changeList;
        ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
        ChangeList changeList2 = this.lateChanges;
        ChangeList changeList3 = composerChangeListWriter.getChangeList();
        try {
            composerChangeListWriter.setChangeList(changeList2);
            this.changeListWriter.resetSlots();
            int size = list.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                try {
                    Pair<MovableContentStateReference, MovableContentStateReference> pair = list.get(i3);
                    final MovableContentStateReference movableContentStateReferenceComponent1 = pair.component1();
                    MovableContentStateReference movableContentStateReferenceComponent2 = pair.component2();
                    Anchor anchor$runtime_release2 = movableContentStateReferenceComponent1.getAnchor$runtime_release();
                    int iAnchorIndex = movableContentStateReferenceComponent1.getSlotTable$runtime_release().anchorIndex(anchor$runtime_release2);
                    IntRef intRef = new IntRef(i2, 1, null);
                    this.changeListWriter.determineMovableContentNodeIndex(intRef, anchor$runtime_release2);
                    if (movableContentStateReferenceComponent2 == null) {
                        if (Intrinsics.areEqual(movableContentStateReferenceComponent1.getSlotTable$runtime_release(), this.insertTable)) {
                            createFreshInsertTable();
                        }
                        final SlotReader slotReaderOpenReader = movableContentStateReferenceComponent1.getSlotTable$runtime_release().openReader();
                        try {
                            slotReaderOpenReader.reposition(iAnchorIndex);
                            this.changeListWriter.moveReaderToAbsolute(iAnchorIndex);
                            changeList = new ChangeList();
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            recomposeMovableContent$default(this, null, null, null, null, new Function0<Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    ComposerChangeListWriter composerChangeListWriter2 = this.this$0.changeListWriter;
                                    ChangeList changeList4 = changeList;
                                    ComposerImpl composerImpl = this.this$0;
                                    SlotReader slotReader = slotReaderOpenReader;
                                    MovableContentStateReference movableContentStateReference = movableContentStateReferenceComponent1;
                                    ChangeList changeList5 = composerChangeListWriter2.getChangeList();
                                    try {
                                        composerChangeListWriter2.setChangeList(changeList4);
                                        SlotReader reader$runtime_release = composerImpl.getReader$runtime_release();
                                        int[] iArr = composerImpl.nodeCountOverrides;
                                        IntMap intMap = composerImpl.providerUpdates;
                                        composerImpl.nodeCountOverrides = null;
                                        composerImpl.providerUpdates = null;
                                        try {
                                            composerImpl.setReader$runtime_release(slotReader);
                                            ComposerChangeListWriter composerChangeListWriter3 = composerImpl.changeListWriter;
                                            boolean implicitRootStart = composerChangeListWriter3.getImplicitRootStart();
                                            try {
                                                composerChangeListWriter3.setImplicitRootStart(false);
                                                composerImpl.invokeMovableContentLambda(movableContentStateReference.getContent$runtime_release(), movableContentStateReference.getLocals$runtime_release(), movableContentStateReference.getParameter$runtime_release(), true);
                                                composerChangeListWriter3.setImplicitRootStart(implicitRootStart);
                                                Unit unit = Unit.INSTANCE;
                                            } catch (Throwable th2) {
                                                composerChangeListWriter3.setImplicitRootStart(implicitRootStart);
                                                throw th2;
                                            }
                                        } finally {
                                            composerImpl.setReader$runtime_release(reader$runtime_release);
                                            composerImpl.nodeCountOverrides = iArr;
                                            composerImpl.providerUpdates = intMap;
                                        }
                                    } finally {
                                        composerChangeListWriter2.setChangeList(changeList5);
                                    }
                                }
                            }, 15, null);
                            this.changeListWriter.includeOperationsIn(changeList, intRef);
                            Unit unit = Unit.INSTANCE;
                            slotReaderOpenReader.close();
                        } catch (Throwable th2) {
                            th = th2;
                            slotReaderOpenReader.close();
                            throw th;
                        }
                    } else {
                        MovableContentState movableContentStateMovableContentStateResolve$runtime_release = this.parentContext.movableContentStateResolve$runtime_release(movableContentStateReferenceComponent2);
                        if (movableContentStateMovableContentStateResolve$runtime_release == null || (slotTable$runtime_release = movableContentStateMovableContentStateResolve$runtime_release.getSlotTable$runtime_release()) == null) {
                            slotTable$runtime_release = movableContentStateReferenceComponent2.getSlotTable$runtime_release();
                        }
                        if (movableContentStateMovableContentStateResolve$runtime_release == null || (slotTable$runtime_release2 = movableContentStateMovableContentStateResolve$runtime_release.getSlotTable$runtime_release()) == null || (anchor$runtime_release = slotTable$runtime_release2.anchor(0)) == null) {
                            anchor$runtime_release = movableContentStateReferenceComponent2.getAnchor$runtime_release();
                        }
                        List<? extends Object> listCollectNodesFrom = ComposerKt.collectNodesFrom(slotTable$runtime_release, anchor$runtime_release);
                        if (!listCollectNodesFrom.isEmpty()) {
                            this.changeListWriter.copyNodesToNewAnchorLocation(listCollectNodesFrom, intRef);
                            if (Intrinsics.areEqual(movableContentStateReferenceComponent1.getSlotTable$runtime_release(), this.slotTable)) {
                                int iAnchorIndex2 = this.slotTable.anchorIndex(anchor$runtime_release2);
                                updateNodeCount(iAnchorIndex2, updatedNodeCount(iAnchorIndex2) + listCollectNodesFrom.size());
                            }
                        }
                        this.changeListWriter.copySlotTableToAnchorLocation(movableContentStateMovableContentStateResolve$runtime_release, this.parentContext, movableContentStateReferenceComponent2, movableContentStateReferenceComponent1);
                        SlotReader slotReaderOpenReader2 = slotTable$runtime_release.openReader();
                        try {
                            SlotReader reader$runtime_release = getReader$runtime_release();
                            int[] iArr = this.nodeCountOverrides;
                            IntMap intMap = this.providerUpdates;
                            this.nodeCountOverrides = null;
                            this.providerUpdates = null;
                            try {
                                setReader$runtime_release(slotReaderOpenReader2);
                                int iAnchorIndex3 = slotTable$runtime_release.anchorIndex(anchor$runtime_release);
                                slotReaderOpenReader2.reposition(iAnchorIndex3);
                                this.changeListWriter.moveReaderToAbsolute(iAnchorIndex3);
                                ChangeList changeList4 = new ChangeList();
                                ComposerChangeListWriter composerChangeListWriter2 = this.changeListWriter;
                                ChangeList changeList5 = composerChangeListWriter2.getChangeList();
                                try {
                                    composerChangeListWriter2.setChangeList(changeList4);
                                    ComposerChangeListWriter composerChangeListWriter3 = this.changeListWriter;
                                    try {
                                        boolean implicitRootStart = composerChangeListWriter3.getImplicitRootStart();
                                        try {
                                            composerChangeListWriter3.setImplicitRootStart(false);
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                        try {
                                            recomposeMovableContent(movableContentStateReferenceComponent2.getComposition$runtime_release(), movableContentStateReferenceComponent1.getComposition$runtime_release(), Integer.valueOf(slotReaderOpenReader2.getCurrentGroup()), movableContentStateReferenceComponent2.getInvalidations$runtime_release(), new Function0<Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$1$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ Unit invoke() {
                                                    invoke2();
                                                    return Unit.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    this.this$0.invokeMovableContentLambda(movableContentStateReferenceComponent1.getContent$runtime_release(), movableContentStateReferenceComponent1.getLocals$runtime_release(), movableContentStateReferenceComponent1.getParameter$runtime_release(), true);
                                                }
                                            });
                                            try {
                                                composerChangeListWriter3.setImplicitRootStart(implicitRootStart);
                                                try {
                                                    composerChangeListWriter2.setChangeList(changeList5);
                                                    this.changeListWriter.includeOperationsIn(changeList4, intRef);
                                                    Unit unit2 = Unit.INSTANCE;
                                                    try {
                                                        setReader$runtime_release(reader$runtime_release);
                                                        this.nodeCountOverrides = iArr;
                                                        this.providerUpdates = intMap;
                                                        Unit unit3 = Unit.INSTANCE;
                                                        try {
                                                            slotReaderOpenReader2.close();
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            composerChangeListWriter.setChangeList(changeList3);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        slotReaderOpenReader2.close();
                                                        throw th;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    setReader$runtime_release(reader$runtime_release);
                                                    this.nodeCountOverrides = iArr;
                                                    this.providerUpdates = intMap;
                                                    throw th;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                try {
                                                    composerChangeListWriter2.setChangeList(changeList5);
                                                    throw th;
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    setReader$runtime_release(reader$runtime_release);
                                                    this.nodeCountOverrides = iArr;
                                                    this.providerUpdates = intMap;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            try {
                                                composerChangeListWriter3.setImplicitRootStart(implicitRootStart);
                                                throw th;
                                            } catch (Throwable th10) {
                                                th = th10;
                                                composerChangeListWriter2.setChangeList(changeList5);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                        }
                    }
                    this.changeListWriter.skipToEndOfCurrentGroup();
                    i3++;
                    i2 = 0;
                } catch (Throwable th15) {
                    th = th15;
                }
            }
            this.changeListWriter.endMovableContentPlacement();
            this.changeListWriter.moveReaderToAbsolute(0);
            composerChangeListWriter.setChangeList(changeList3);
        } catch (Throwable th16) {
            th = th16;
        }
    }

    private final <R> R withReader(SlotReader slotReader, Function0<? extends R> function0) {
        SlotReader reader$runtime_release = getReader$runtime_release();
        int[] iArr = this.nodeCountOverrides;
        IntMap intMap = this.providerUpdates;
        this.nodeCountOverrides = null;
        this.providerUpdates = null;
        try {
            setReader$runtime_release(slotReader);
            return function0.invoke();
        } finally {
            InlineMarker.finallyStart(1);
            setReader$runtime_release(reader$runtime_release);
            this.nodeCountOverrides = iArr;
            this.providerUpdates = intMap;
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object recomposeMovableContent$default(ComposerImpl composerImpl, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, Function0 function0, int i2, Object obj) {
        List listEmptyList = list;
        ControlledComposition controlledComposition3 = controlledComposition2;
        ControlledComposition controlledComposition4 = controlledComposition;
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            controlledComposition4 = null;
        }
        if ((i2 + 2) - (2 | i2) != 0) {
            controlledComposition3 = null;
        }
        Integer num2 = (i2 + 4) - (4 | i2) == 0 ? num : null;
        if ((-1) - (((-1) - i2) | ((-1) - 8)) != 0) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return composerImpl.recomposeMovableContent(controlledComposition4, controlledComposition3, num2, listEmptyList, function0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #0 {all -> 0x0047, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x0022, B:9:0x002a, B:8:0x0026, B:14:0x0034, B:15:0x0038, B:17:0x003e), top: B:23:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <R> R recomposeMovableContent(androidx.compose.runtime.ControlledComposition r7, androidx.compose.runtime.ControlledComposition r8, java.lang.Integer r9, java.util.List<? extends kotlin.Pair<androidx.compose.runtime.RecomposeScopeImpl, ? extends java.lang.Object>> r10, kotlin.jvm.functions.Function0<? extends R> r11) {
        /*
            r6 = this;
            boolean r4 = r6.isComposing
            int r3 = r6.nodeIndex
            r0 = 1
            r6.isComposing = r0     // Catch: java.lang.Throwable -> L47
            r5 = 0
            r6.nodeIndex = r5     // Catch: java.lang.Throwable -> L47
            int r2 = r10.size()     // Catch: java.lang.Throwable -> L47
        Le:
            if (r5 >= r2) goto L2d
            java.lang.Object r0 = r10.get(r5)     // Catch: java.lang.Throwable -> L47
            kotlin.Pair r0 = (kotlin.Pair) r0     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r0.component1()     // Catch: java.lang.Throwable -> L47
            androidx.compose.runtime.RecomposeScopeImpl r1 = (androidx.compose.runtime.RecomposeScopeImpl) r1     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r0.component2()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L26
            r6.tryImminentInvalidation$runtime_release(r1, r0)     // Catch: java.lang.Throwable -> L47
            goto L2a
        L26:
            r0 = 0
            r6.tryImminentInvalidation$runtime_release(r1, r0)     // Catch: java.lang.Throwable -> L47
        L2a:
            int r5 = r5 + 1
            goto Le
        L2d:
            if (r7 == 0) goto L3e
            if (r9 == 0) goto L32
            goto L34
        L32:
            r0 = -1
            goto L38
        L34:
            int r0 = r9.intValue()     // Catch: java.lang.Throwable -> L47
        L38:
            java.lang.Object r0 = r7.delegateInvalidations(r8, r0, r11)     // Catch: java.lang.Throwable -> L47
            if (r0 != 0) goto L42
        L3e:
            java.lang.Object r0 = r11.invoke()     // Catch: java.lang.Throwable -> L47
        L42:
            r6.isComposing = r4
            r6.nodeIndex = r3
            return r0
        L47:
            r0 = move-exception
            r6.isComposing = r4
            r6.nodeIndex = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.recomposeMovableContent(androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.ControlledComposition, java.lang.Integer, java.util.List, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(String str) {
        if (getInserting() && this.sourceMarkersEnabled) {
            this.writer.recordGroupSourceInformation(str);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int i2, String str) {
        if (getInserting() && this.sourceMarkersEnabled) {
            this.writer.recordGrouplessCallSourceInformationStart(i2, str);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        if (getInserting() && this.sourceMarkersEnabled) {
            this.writer.recordGrouplessCallSourceInformationEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void disableSourceInformation() {
        this.sourceMarkersEnabled = false;
    }

    public final void composeContent$runtime_release(ScopeMap<RecomposeScopeImpl, Object> scopeMap, Function2<? super Composer, ? super Integer, Unit> function2) {
        if (!this.changes.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        doCompose(scopeMap, function2);
    }

    public final void prepareCompose$runtime_release(Function0<Unit> function0) {
        if (this.isComposing) {
            ComposerKt.composeImmediateRuntimeError("Preparing a composition while composing is not supported");
        }
        this.isComposing = true;
        try {
            function0.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    public final boolean recompose$runtime_release(ScopeMap<RecomposeScopeImpl, Object> scopeMap) {
        if (!this.changes.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        if (scopeMap.getSize() <= 0 && this.invalidations.isEmpty() && !this.forciblyRecompose) {
            return false;
        }
        doCompose(scopeMap, null);
        return this.changes.isNotEmpty();
    }

    /* JADX WARN: Finally extract failed */
    private final void doCompose(ScopeMap<RecomposeScopeImpl, Object> scopeMap, Function2<? super Composer, ? super Integer, Unit> function2) {
        if (this.isComposing) {
            ComposerKt.composeImmediateRuntimeError("Reentrant composition is not supported");
        }
        Object objBeginSection = Trace.INSTANCE.beginSection("Compose:recompose");
        try {
            this.compositionToken = SnapshotKt.currentSnapshot().getId();
            this.providerUpdates = null;
            MutableScatterMap<Object, Object> map = scopeMap.getMap();
            Object[] objArr = map.keys;
            Object[] objArr2 = map.values;
            long[] jArr = map.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((-1) - (((-1) - (((~j2) << 7) & j2)) | ((-1) - (-9187201950435737472L))) != -9187201950435737472L) {
                        int i3 = 8;
                        int i4 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j2 & 255) < 128) {
                                int i6 = (i2 << 3) + i5;
                                Object obj = objArr[i6];
                                Object obj2 = objArr2[i6];
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                                Anchor anchor = ((RecomposeScopeImpl) obj).getAnchor();
                                if (anchor != null) {
                                    int location$runtime_release = anchor.getLocation$runtime_release();
                                    List<Invalidation> list = this.invalidations;
                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                                    if (obj2 == ScopeInvalidated.INSTANCE) {
                                        obj2 = null;
                                    }
                                    list.add(new Invalidation(recomposeScopeImpl, location$runtime_release, obj2));
                                }
                                i3 = 8;
                            }
                            j2 >>= i3;
                        }
                        if (i4 != i3) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            CollectionsKt.sortWith(this.invalidations, ComposerKt.InvalidationLocationAscending);
            this.nodeIndex = 0;
            this.isComposing = true;
            try {
                startRoot();
                Object objNextSlot = nextSlot();
                if (objNextSlot != function2 && function2 != null) {
                    updateValue(function2);
                }
                ComposerImpl$derivedStateObserver$1 composerImpl$derivedStateObserver$1 = this.derivedStateObserver;
                MutableVector<DerivedStateObserver> mutableVectorDerivedStateObservers = SnapshotStateKt.derivedStateObservers();
                try {
                    mutableVectorDerivedStateObservers.add(composerImpl$derivedStateObserver$1);
                    if (function2 != null) {
                        startGroup(200, ComposerKt.getInvocation());
                        ActualJvm_jvmKt.invokeComposable(this, function2);
                        endGroup();
                    } else if ((this.forciblyRecompose || this.providersInvalid) && objNextSlot != null && !Intrinsics.areEqual(objNextSlot, Composer.Companion.getEmpty())) {
                        startGroup(200, ComposerKt.getInvocation());
                        ActualJvm_jvmKt.invokeComposable(this, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(objNextSlot, 2));
                        endGroup();
                    } else {
                        skipCurrentGroup();
                    }
                    mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                    endRoot();
                    this.isComposing = false;
                    this.invalidations.clear();
                    createFreshInsertTable();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    mutableVectorDerivedStateObservers.removeAt(mutableVectorDerivedStateObservers.getSize() - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                this.isComposing = false;
                this.invalidations.clear();
                abortRoot();
                createFreshInsertTable();
                throw th2;
            }
        } finally {
            Trace.INSTANCE.endSection(objBeginSection);
        }
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    private final Object nodeAt(SlotReader slotReader, int i2) {
        return slotReader.node(i2);
    }

    private final void validateNodeExpected() {
        if (!this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
    }

    private final void validateNodeNotExpected() {
        if (this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final void recordInsert(Anchor anchor) {
        if (this.insertFixups.isEmpty()) {
            this.changeListWriter.insertSlots(anchor, this.insertTable);
        } else {
            this.changeListWriter.insertSlots(anchor, this.insertTable, this.insertFixups);
            this.insertFixups = new FixupList();
        }
    }

    private final void recordDelete() {
        reportFreeMovableContent(this.reader.getCurrentGroup());
        this.changeListWriter.removeCurrentGroup();
    }

    private static final int reportFreeMovableContent$reportGroup(ComposerImpl composerImpl, int i2, boolean z2, int i3) {
        SlotReader slotReader = composerImpl.reader;
        if (slotReader.hasMark(i2)) {
            int iGroupKey = slotReader.groupKey(i2);
            Object objGroupObjectKey = slotReader.groupObjectKey(i2);
            if (iGroupKey == 126665345 && (objGroupObjectKey instanceof MovableContent)) {
                MovableContent movableContent = (MovableContent) objGroupObjectKey;
                Object objGroupGet = slotReader.groupGet(i2, 0);
                Anchor anchor = slotReader.anchor(i2);
                List listFilterToRange = ComposerKt.filterToRange(composerImpl.invalidations, i2, slotReader.groupSize(i2) + i2);
                ArrayList arrayList = new ArrayList(listFilterToRange.size());
                int size = listFilterToRange.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Invalidation invalidation = (Invalidation) listFilterToRange.get(i4);
                    arrayList.add(TuplesKt.to(invalidation.getScope(), invalidation.getInstances()));
                }
                MovableContentStateReference movableContentStateReference = new MovableContentStateReference(movableContent, objGroupGet, composerImpl.getComposition(), composerImpl.slotTable, anchor, arrayList, composerImpl.currentCompositionLocalScope(i2));
                composerImpl.parentContext.deletedMovableContent$runtime_release(movableContentStateReference);
                composerImpl.changeListWriter.recordSlotEditing();
                composerImpl.changeListWriter.releaseMovableGroupAtCurrent(composerImpl.getComposition(), composerImpl.parentContext, movableContentStateReference);
                if (z2) {
                    composerImpl.changeListWriter.endNodeMovementAndDeleteNode(i3, i2);
                    return 0;
                }
                return slotReader.nodeCount(i2);
            }
            if (iGroupKey == 206 && Intrinsics.areEqual(objGroupObjectKey, ComposerKt.getReference())) {
                Object objGroupGet2 = slotReader.groupGet(i2, 0);
                CompositionContextHolder compositionContextHolder = objGroupGet2 instanceof CompositionContextHolder ? (CompositionContextHolder) objGroupGet2 : null;
                if (compositionContextHolder != null) {
                    for (ComposerImpl composerImpl2 : compositionContextHolder.getRef().getComposers()) {
                        composerImpl2.reportAllMovableContent();
                        composerImpl.parentContext.reportRemovedComposition$runtime_release(composerImpl2.getComposition());
                    }
                }
                return slotReader.nodeCount(i2);
            }
            if (slotReader.isNode(i2)) {
                return 1;
            }
            return slotReader.nodeCount(i2);
        }
        if (slotReader.containsMark(i2)) {
            int iGroupSize = slotReader.groupSize(i2) + i2;
            int iReportFreeMovableContent$reportGroup = 0;
            for (int iGroupSize2 = i2 + 1; iGroupSize2 < iGroupSize; iGroupSize2 += slotReader.groupSize(iGroupSize2)) {
                boolean zIsNode = slotReader.isNode(iGroupSize2);
                if (zIsNode) {
                    composerImpl.changeListWriter.endNodeMovement();
                    composerImpl.changeListWriter.moveDown(slotReader.node(iGroupSize2));
                }
                iReportFreeMovableContent$reportGroup += reportFreeMovableContent$reportGroup(composerImpl, iGroupSize2, zIsNode || z2, zIsNode ? 0 : i3 + iReportFreeMovableContent$reportGroup);
                if (zIsNode) {
                    composerImpl.changeListWriter.endNodeMovement();
                    composerImpl.changeListWriter.moveUp();
                }
            }
            if (slotReader.isNode(i2)) {
                return 1;
            }
            return iReportFreeMovableContent$reportGroup;
        }
        if (slotReader.isNode(i2)) {
            return 1;
        }
        return slotReader.nodeCount(i2);
    }

    private final void reportFreeMovableContent(int i2) {
        reportFreeMovableContent$reportGroup(this, i2, false, 0);
        this.changeListWriter.endNodeMovement();
    }

    private final void reportAllMovableContent() {
        if (this.slotTable.containsMark()) {
            ChangeList changeList = new ChangeList();
            this.deferredChanges = changeList;
            SlotReader slotReaderOpenReader = this.slotTable.openReader();
            try {
                this.reader = slotReaderOpenReader;
                ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                ChangeList changeList2 = composerChangeListWriter.getChangeList();
                try {
                    composerChangeListWriter.setChangeList(changeList);
                    reportFreeMovableContent(0);
                    this.changeListWriter.releaseMovableContent();
                    composerChangeListWriter.setChangeList(changeList2);
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    composerChangeListWriter.setChangeList(changeList2);
                    throw th;
                }
            } finally {
                slotReaderOpenReader.close();
            }
        }
    }

    private final void finalizeCompose() {
        this.changeListWriter.finalizeComposition();
        if (!this.pendingStack.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Start/end imbalance");
        }
        cleanUpCompose();
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.changeListWriter.resetTransientState();
        this.invalidateStack.clear();
        clearUpdatedNodeCounts();
    }

    public final void verifyConsistent$runtime_release() {
        this.insertTable.verifyWellFormed();
    }

    /* JADX INFO: compiled from: Composer.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u0016DLш|\u0004W\u00068\u000bDB\u0007\"2\u0014\u007f\u0007tjA0JfN.hݷZ\u000f\u001azt3k,\u007fCSYH~r\t}P˗knX]SI\u001d\f.x\u00193\u0010iAc \u0017JB\u001eFya8CGi\r63'x6\t\r\u0013\u00012.v\u0011GzqMë\u00166H\u0081RT\u0013Q\u0013\u001fŰ\nH"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\u001bu!5\f!Es?(#lp=\u0011l\nX\u007f6G_]\u000ffYq=!g", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<\u000731V\u0005 $m\u001e.U@;x\u001e\u001b#hnJ\u0007p\u0002", "@dU", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\u001bu!5\f!Es?(#lp=\u0011l\nX\u007f6G_]\u0010d]y\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\u001bu!5#", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DQ\u001e9T\u0002\u0019u<)\u001fveH\u000bm5,\u00010VLa;@Z}DiUK", "5dc\u001fX-", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.7zy6XJyI>& ro=\u0016g6WT1P[N?k6zH\u001bg", "=m0/T5=]\"~y", "", "=m5<e.Hb(~\u0004", "=mA2`,FP\u0019\fz]", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private static final class CompositionContextHolder implements ReusableRememberObserver {
        private final CompositionContextImpl ref;

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }

        public CompositionContextHolder(CompositionContextImpl compositionContextImpl) {
            this.ref = compositionContextImpl;
        }

        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }
    }

    /* JADX INFO: compiled from: Composer.kt */
    /* JADX INFO: loaded from: classes2.dex */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я~\u001d<K!&i\u0016DLш|\u0004O\f8é6B\r+4\u0012}\u0007njO0LeN3ZS80s{J$c$wDCU0}*\tUVog\u0005Jb\u000bI\u0010\u000e\u0016\u000fj4I[\u0001e\u0012\u001d2JģG3coEʠhtL\u0005(288\u0002\u0005\u0007\u001c2H&v\u0003CQ\u0015\u001a0VpBR\u0013N\r\u001a(\u0006F \u0007$dgd6PlcE5ݍ\u0005\u007fĩ~'\u000e/=r\u001dJb'%v\u0010\u001f;DE7-%\u0002\u0006\u0017ViC\u001b? @\u0015n5,CK\nVd^ÿ\u0018\u00159VU\u0006\u0001Rt\u0005\u007f\u000e<+9}{K~=X\u0007\t,%G\u0014\u0010\u0016'v[[KǴ\f\u000e9'9aĖT\u0004du\u000e/*I%Z\u00183YfKj_\u0018S\u0019|nB\u0013ڟ\"#\u0007'i_bGx\u0015I\u0002@\\?\fX=v{Pgǀq\u0004v\u001eJ5\u0012E_\u007f]\u000fW<ϲ)7auk4y?`D\u0016$5dv\n\u0002Rvwh|ގ;*\u000fJ#WrD\u0004P\u0003\u0006\\\u0015[Jl\u0007,7Y.Ϣ{<'eXa]*\u0002j{\u000b:)=)OY\u001d/Teߍb3;\u0016,+o\u0018\u000f\u0014mi\u0013\tf\u001dZS:\u0012\r,0x`j>?BR«\u0010\u00138\b:1BuI\u001br\u0014vJNFO3!_\t V\rՁ7$\t4l\u000e\u0017Lh\\\u001f\u001d\u0018\u0003Wx\u0015f2/QQc;Tchvط\u0001#\rL<\u0013U6dGz\u001aFycK8\u0016H\n\u0018=ˮ\u0017\u000f\u0005zz\u0015;\u0018dr\u0014~}\u00165)\u0015y=j/<Թ\fjv\u007f)}X$l\u0017P$\u000fv16|\u007f(\u0011\r\tĕgT\u00111\u0007T\u0001Yq<|eC\u0013ȷ\"%\u0007Gj\u0010C\u0006['KC(\u0018=dy]\u0018@t\bˏ\u0013&z?L?qp\bb\u007f\u000bb?Fwq~lQjzúFHpSPN\u0017\u0011%3vn\u0015tdze\u000b]\u00117\u0019:\u0015\tV\n=I>Tҿ0ʡ.w[\u007f\u001agQ/a_ai\u0006my_a\u0378\u0011ϻ\u000f\u00029ޫ*\u001eC+da3\u001b>\n\f\u0018dD\u0012ر\u0007Ø\r*<ɶT\n\u0011ObsV%\t\r^e\u001f\u0019BB\"J\u0005\u001c֭|b^ޠ\u001dbKp/;Q(\u001dG6xcD5qTfGc`\u0014\n]G[Aʭƺfު/T\\;!Af\u001b#GcXW\u0018V\u0006M@{\u0004@\u001eF\u0018\u0015\u001dp\u0019qʔSμc|8͜#Wjir\u0013bx`k:)-\u00193b\u0013\u0093\u0011Ո\u001dS\u000bqhLZnH]Q;\u0019%T1\u0017\u0012\reV\u001b[(c;SH\u0019\"}غcĺ?\n\u0010¶8)\n\u0018/mw\u0010l.k@\u000b*\u007f\u001bz\u0004\u001f\u0012~&Z̉Lƶv\u00106úNQ\bY\u0010:/qy 9@UI#T\u0019ſjǰ\u000em|et~\u0019-~3\\%|Mȉ!f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\u001bu!5\f!Es?(#lp=\u0011l\nX\u007f6G_]\u0010d]y\u0013", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\fWLJkG-j", "1n\\=b<GR{z\ta\u0012|\u001d", "", "1n[9X*MW\"\u0001eZ9x\u0011/t\u007f5_I\u0002!$Ok\u001d@\u0001.", "", "1n[9X*MW\"\u0001hh<\n\u0007/I\t)\u0006M\t\u0013&Ky\u0017", "=ab2e=>`{\t\u0002],\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g\u0002/;w\u001f\u0018JQ;xE\u001e\"Kk@\u0006c9$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001-@c\f DQ\u001e9T\u0019\u001f`)\u0005\u0011q`F\u0011g+a@%QTY6jR<J$\u001bi\u0012V+VbcI/xR;.\f6Rk8v\u0001\u0019'\u000eBMzIU\u0010TOXf", "1n[9X*MW\"\u0001XZ3\u0004eCI\t)\u0006M\t\u0013&Ky\u0017", "5dc\u0010b3ES\u0017\u000e~g.Z\u00056l\\<_I\u0002!$Ok\u001d@\u0001.sf\u000e)Fq\u001e.GP;r4\u001a#h", "u(I", "5dc\u0010b3ES\u0017\u000e~g.g\u0005<a\b(\u000b@\u000ez Hy\u001bDr49c\u0007^D}\u001f=QK;eA\u001e\u001ch]G\u0007", "5dc\u0010b3ES\u0017\u000e~g.j\u0013?r}(_I\u0002!$Ok\u001d@\u0001.sf\u000e)Fq\u001e.GP;r4\u001a#h", "1n\\=b:>`'", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\u001bu!5#", "5dc\u0010b4I]'~\bl", "u(;7T=:\u001d)\u000e~euj\t>;", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9x<\u000439g\r @|s8UNEy8-\u0019rj \u0011a(U^#R\"", "1n\\=b:Bb\u001d\t\u0004E6z\u00056S}2\u0007@", "5dc\u0010b4I]'\u0003\nb6\u0006o9c{/i>\u000b\"\u0017", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006a%Bg\u0002.Fm\u001f=+MCv>,\u0019weC\u0010J6Lr./HY\u0002", "Adc\u0010b4I]'\u0003\nb6\u0006o9c{/i>\u000b\"\u0017", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW'v2C]\f/7v%\fWKFuB\"$lkBmm*J}\u000fCW$oM", "1n\\=b:Bb\u001d\t\u0004E6z\u00056S}2\u0007@?\u0016\u0017No\u00108\u0006%", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "5dc\u0010b4I])\byA(\u000b\f\u0015e\u0014f\tP\n&\u001bOo\bIv,5U\f ", "u(8", "3eU2V;\u001c]&\t\u000bm0\u0006\t\ro\t7{S\u0010", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "5dc\u0012Y->Q(\\\u0005k6\r\u00183n\u007f\u0006\u0006I\u0010\u0017*V", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "7mb=X*MW#\biZ)\u0004\t=", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\u001dF\u0001,9b\u007fi\u0015w\u001e9WQ?z8(\u001eG]H\u00039", "5dc\u0016a:IS\u0017\u000e~h5k\u0005,l\u007f6", "Adc\u0016a:IS\u0017\u000e~h5k\u0005,l\u007f6", "uKY.i(\bc(\u0003\u0002(\u001a|\u0018\u0005)p", "5dc\u001cU:>`*~\bA6\u0004\b/r>5\fI\u0010\u001b\u001fGi\u001b<}%1g}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006T/=d\b.;|\u001a8V-8y4+&hn\u001c\u0011j+N\u0004|", "@dR<`7Ha\u0019\\\u0005k6\r\u00183n\u007f\u0006\u0006I\u0010\u0017*V", "5dc\u001fX*H[$\t\t^\n\u0007\u00169u\u000f,\u0005@^! Vo!K52Eb\r$?m\u0010;MJ;gB\u001eSdjB\u0011r(]z1PZ", "u(E", "5dc\u001fX*H[$\t\t^\n\u0007\u00169u\u000f,\u0005@^! Vo!K52Eb\r$?m\u0010;MJ;gB\u001e", "1n\\=b:>7\"\u0003\nb(\u0004", "", "1n\\=b:Bb\u001d\t\u0004", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF\u007f4Bc\u0005'7ls8UNEy8-\u0019rj\u000f", "1n]AX5M", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?gy\u001d>mk", "1n\\=b:>7\"\u0003\nb(\u0004G<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\tP\n&\u001bOoW\u001a\u0001.Df\b'>m\u0015\fWKFuB\"$lkB\\J2X\u0006.KU\u00181mZ<>$\u001bX\u001dR5\u0016\u0013#\"4wBF#\u00125\u0016W~Y", "2d[2g,=;#\u0010v[3|f9n\u000f(\u0005O", "@dU2e,GQ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015Ua:\u0007p,Wt'\u001d", "2d[2g,=;#\u0010v[3|f9n\u000f(\u0005O?$'P~\u0012Dv\u001fBY\u0005 3{\u0016", "2hb=b:>", "2n]266F^#\r~g.", "2n]266F^#\r~g.;\u0016?n\u000f,\u0004@z$\u0017No\nJv", "5dc\u0010b4I]'\u0003\nb6\u0006o9c{/i>\u000b\"\u0017\u0006|\u001eE\u0006)=Yw-7t\u0016*[C", "7mb2e;&]*zwe,Z\u00138t\u007f1\u000b", "7mb2e;&]*zwe,Z\u00138t\u007f1\u000b~\u000e' Vs\u0016<p25`}\u001cEm", "7me._0=O(~", "7me._0=O(~9k<\u0006\u00183m\u007f\"\t@\b\u0017\u0013Uo", "7me._0=O(~h\\6\b\t", "Ab^=X", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC\u001fs?%j", "7me._0=O(~h\\6\b\tmr\u00101\u000bD\t\u0017\u0011To\u0015<r35", ";ne.U3>1#\b\n^5\fv>a\u000f(h@\b\u0017\u0013Uo\r", "2`c.", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uF\b!2`}}Av%.VR)z0-\u0015>", ";ne.U3>1#\b\n^5\fv>a\u000f(h@\b\u0017\u0013Uo\rz\u00045>h\u0002(7g#.TC7y4", ";ne.U3>1#\b\n^5\fv>a\u000f(h@\u000f!\u001eXo", ";ne.U3>1#\b\n^5\fv>a\u000f(h@\u000f!\u001eXoLI\u0007.D]\u0006 1z\u00165M?Ik", "@dR<e+\"\\'\nz\\;\u0001\u00138T{%\u0003@", "B`Q9X", "@dR<e+\"\\'\nz\\;\u0001\u00138T{%\u0003@?$'P~\u0012Dv\u001fBY\u0005 3{\u0016", "@dV6f;>`v\t\u0003i6\u000b\t<", "1n\\=b:>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9kF~0?g}-\r", "@dV6f;>`v\t\u0003i6\u000b\t<$\r8\u0005O\u0005\u001f\u0017A|\u000eCv!CY", "@dV6f;>`v\t\u0003i6\u000b\r>i\n1", "@dV6f;>`v\t\u0003i6\u000b\r>i\n1:M\u0011 &Kw\u000e6\u0004%<Yy.7", "@d_<e;+S!\t\f^+Z\u00137p\n6\u007fO\u0005! ", "@d_<e;+S!\t\f^+Z\u00137p\n6\u007fO\u0005! \u0006|\u001eE\u0006)=Yw-7t\u0016*[C", "AsP?g\nH[$\t\tb5~", "AsP?g\nH[$\t\tb5~G<u\t7\u007fH\u0001\u0011$Gv\u000e8\u0005%", "Cma2Z0Lb\u0019\fXh4\b\u0013=e\r", "Cma2Z0Lb\u0019\fXh4\b\u0013=e\rf\tP\n&\u001bOo\bIv,5U\f ", "Cma2Z0Lb\u0019\fXh4\b\u0013=i\u000f,\u0006I", "Cma2Z0Lb\u0019\fXh4\b\u0013=i\u000f,\u0006I?$'P~\u0012Dv\u001fBY\u0005 3{\u0016", "CoS.g,\u001c]!\n\u0005l0\f\r9nf2y<\b\u0005\u0015Qz\u000e", "@t]A\\4>M&~\u0002^(\u000b\t"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    private final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        private final boolean collectingSourceInformation;
        private final Set<ComposerImpl> composers = new LinkedHashSet();
        private final MutableState compositionLocalScope$delegate = SnapshotStateKt.mutableStateOf(PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), SnapshotStateKt.referentialEqualityPolicy());
        private final int compoundHashKey;
        private Set<Set<CompositionData>> inspectionTables;
        private final CompositionObserverHolder observerHolder;

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime_release$annotations() {
        }

        public CompositionContextImpl(int i2, boolean z2, boolean z3, CompositionObserverHolder compositionObserverHolder) {
            this.compoundHashKey = i2;
            this.collectingParameterInformation = z2;
            this.collectingSourceInformation = z3;
            this.observerHolder = compositionObserverHolder;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public int getCompoundHashKey$runtime_release() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingParameterInformation$runtime_release() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingSourceInformation$runtime_release() {
            return this.collectingSourceInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CompositionObserverHolder getObserverHolder$runtime_release() {
            return this.observerHolder;
        }

        public final Set<Set<CompositionData>> getInspectionTables() {
            return this.inspectionTables;
        }

        public final void setInspectionTables(Set<Set<CompositionData>> set) {
            this.inspectionTables = set;
        }

        public final Set<ComposerImpl> getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingCallByInformation$runtime_release() {
            return ComposerImpl.this.parentContext.getCollectingCallByInformation$runtime_release();
        }

        public final void dispose() {
            if (this.composers.isEmpty()) {
                return;
            }
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                for (ComposerImpl composerImpl : this.composers) {
                    Iterator<Set<CompositionData>> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().remove(composerImpl.slotTable);
                    }
                }
            }
            this.composers.clear();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime_release(Composer composer) {
            Intrinsics.checkNotNull(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.registerComposer$runtime_release((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime_release(Composer composer) {
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    Set set2 = (Set) it.next();
                    Intrinsics.checkNotNull(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((ComposerImpl) composer).slotTable);
                }
            }
            TypeIntrinsics.asMutableCollection(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime_release(ControlledComposition controlledComposition) {
            ComposerImpl.this.parentContext.registerComposition$runtime_release(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime_release(ControlledComposition controlledComposition) {
            ComposerImpl.this.parentContext.unregisterComposition$runtime_release(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CoroutineContext getEffectCoroutineContext() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
            return CompositionKt.getRecomposeCoroutineContext(ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void composeInitial$runtime_release(ControlledComposition controlledComposition, Function2<? super Composer, ? super Integer, Unit> function2) {
            ComposerImpl.this.parentContext.composeInitial$runtime_release(controlledComposition, function2);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime_release(ControlledComposition controlledComposition) {
            ComposerImpl.this.parentContext.invalidate$runtime_release(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.invalidate$runtime_release(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime_release(RecomposeScopeImpl recomposeScopeImpl) {
            ComposerImpl.this.parentContext.invalidateScope$runtime_release(recomposeScopeImpl);
        }

        private final PersistentCompositionLocalMap getCompositionLocalScope() {
            return (PersistentCompositionLocalMap) this.compositionLocalScope$delegate.getValue();
        }

        private final void setCompositionLocalScope(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            this.compositionLocalScope$delegate.setValue(persistentCompositionLocalMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
            return getCompositionLocalScope();
        }

        public final void updateCompositionLocalScope(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            setCompositionLocalScope(persistentCompositionLocalMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime_release(Set<CompositionData> set) {
            HashSet hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(set);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime_release() {
            ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime_release() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime_release(MovableContentStateReference movableContentStateReference) {
            ComposerImpl.this.parentContext.insertMovableContent$runtime_release(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void deletedMovableContent$runtime_release(MovableContentStateReference movableContentStateReference) {
            ComposerImpl.this.parentContext.deletedMovableContent$runtime_release(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference movableContentStateReference) {
            return ComposerImpl.this.parentContext.movableContentStateResolve$runtime_release(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void movableContentStateReleased$runtime_release(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState) {
            ComposerImpl.this.parentContext.movableContentStateReleased$runtime_release(movableContentStateReference, movableContentState);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportRemovedComposition$runtime_release(ControlledComposition controlledComposition) {
            ComposerImpl.this.parentContext.reportRemovedComposition$runtime_release(controlledComposition);
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroup(int i2, int i3, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i2 == 207 && !Intrinsics.areEqual(obj2, Composer.Companion.getEmpty())) {
                this.compoundKeyHash = Integer.rotateLeft(obj2.hashCode() ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3) ^ i3;
                return;
            } else {
                this.compoundKeyHash = Integer.rotateLeft(i2 ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3) ^ i3;
                return;
            }
        }
        if (obj instanceof Enum) {
            this.compoundKeyHash = Integer.rotateLeft(((Enum) obj).ordinal() ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3);
        } else {
            this.compoundKeyHash = Integer.rotateLeft(obj.hashCode() ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3);
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int i2, int i3) {
        this.compoundKeyHash = Integer.rotateLeft(i2 ^ Integer.rotateLeft(getCompoundKeyHash(), 3), 3) ^ i3;
    }

    private final void updateCompoundKeyWhenWeExitGroup(int i2, int i3, Object obj, Object obj2) {
        if (obj != null) {
            if (obj instanceof Enum) {
                int iOrdinal = ((Enum) obj).ordinal();
                this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(iOrdinal) ^ Integer.rotateRight(getCompoundKeyHash(), 3), 3);
                return;
            } else {
                int iHashCode = obj.hashCode();
                this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(iHashCode) ^ Integer.rotateRight(getCompoundKeyHash(), 3), 3);
                return;
            }
        }
        if (obj2 == null || i2 != 207 || Intrinsics.areEqual(obj2, Composer.Companion.getEmpty())) {
            this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(i2) ^ Integer.rotateRight(i3 ^ getCompoundKeyHash(), 3), 3);
        } else {
            int iHashCode2 = obj2.hashCode();
            this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(iHashCode2) ^ Integer.rotateRight(i3 ^ getCompoundKeyHash(), 3), 3);
        }
    }

    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int i2, int i3) {
        this.compoundKeyHash = Integer.rotateRight(Integer.hashCode(i2) ^ Integer.rotateRight(i3 ^ getCompoundKeyHash(), 3), 3);
    }

    public final int stacksSize$runtime_release() {
        return this.entersStack.getSize() + this.invalidateStack.getSize() + this.providersInvalidStack.getSize() + this.pendingStack.getSize() + this.parentStateStack.getSize();
    }

    @Override // androidx.compose.runtime.Composer
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    @Override // androidx.compose.runtime.Composer
    public Object getRecomposeScopeIdentity() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            return currentRecomposeScope$runtime_release.getAnchor();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public Object rememberedValue() {
        return nextSlotForCache();
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(Object obj) {
        updateCachedValue(obj);
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(RecomposeScope recomposeScope) {
        RecomposeScopeImpl recomposeScopeImpl = recomposeScope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) recomposeScope : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.setUsed(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object] */
    private final PersistentCompositionLocalMap updateProviderMapGroup(PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentMap.Builder<CompositionLocal<Object>, ValueHolder<Object>> builderBuilder2 = persistentCompositionLocalMap.builder2();
        builderBuilder2.putAll(persistentCompositionLocalMap2);
        ?? Build2 = builderBuilder2.build2();
        startGroup(204, ComposerKt.getProviderMaps());
        updateSlot(Build2);
        updateSlot(persistentCompositionLocalMap2);
        endGroup();
        return Build2;
    }

    private final int compoundKeyOf(int i2, int i3, int i4, int i5) {
        if (i2 != i4) {
            int iGroupCompoundKeyPart = groupCompoundKeyPart(this.reader, i2);
            if (iGroupCompoundKeyPart == 126665345) {
                return iGroupCompoundKeyPart;
            }
            int iParent = this.reader.parent(i2);
            if (iParent != i4) {
                i5 = compoundKeyOf(iParent, rGroupIndexOf(iParent), i4, i5);
            }
            if (this.reader.hasObjectKey(i2)) {
                i3 = 0;
            }
            return Integer.rotateLeft(Integer.rotateLeft(i5, 3) ^ iGroupCompoundKeyPart, 3) ^ i3;
        }
        return i5;
    }
}
