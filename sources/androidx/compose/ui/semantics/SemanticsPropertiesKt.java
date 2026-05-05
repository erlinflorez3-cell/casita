package androidx.compose.ui.semantics;

import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
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
/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯŻ\u0014D߬)\u001e\u007f\u007fL܀kt\u001aA\u000e0\u00112J~8,\u001aw\rjr9FDmH4W[*\u001dw\u00044*^,qY;]\u001a\u0004&\u0011O\\\u0006on`Z\u0013C\u0015\n\u001ex\u0001,QU~a\u001a\u000f@Kw?9Qw=O`|6\u000b$:\"Ny\r\u0001 ;P\u0010\rzKK\u0012\u00148@~@Z\rS\u000b\"\u0012\u001c>(\u0001$`oNLHt]@@+\u0003\u007fBV'e8\u0005M#F\\'\u0013zi\u001e9E?5\u001b.[\u0003\u001dRc?\t@y=\u001bh/ݐ3I\nW>X\u0016\u0014\u001d+U\u000eer4\\\rQf\f/+ecSP\u00141\u007fz\u0012\rD\u0004\u001c%/HD-\"f\u000e\u000f;t\u0001ԟHP\boJ\u007f\u0011a>\u0017+\u0001;+O\u001bnϟi;/N?{\u000b\u0010&#\u0017n)[Z\u0011x4)ƶvi9aCMI\u0015̃Xkц\u0003\u0011e\bÏ\u0012\u03a2F04\n\u009e-/%er\u007f\u05fa9.\u0010ҤC\u007f~\u0015cxT0ʍGṋm6:0\u009e\u001aʎC\u0015\nyÍSp,?dLs\u0015Ą\u0007+:l|L$;\u000f\u0015јgym]^Pɸ.v<iq\u0002\r\u001eߊ]a̳P*߄y\u0005\u0005݁>Tq\u0015bvJc\u000fj]nϏ1vп\u000f&ԚCn\u001a\u0019ԵMۄ\u001b\\3A\u001bl\u0015v6Lչ@-\u000em˔g(~\u0003Jjѳo<\n\u0017ɽOtq6οwi/\u0003ʠ0Ϊ@\u00185Ԋ*V0ף3\u0015L\u0015ґr\u0018H\u0016֠FtlDv\u0006\u0005&\u0016(\u0083PG?)\u000e-@b\u0010;֒K\u000bnaO\"')0\u0010\u000eiĉ-\u007f1xҟ+xkx\u05ccS?\"%_#,\u000ed\u000e\u0603`^|]b\u0003\"\fLWΫ\u0002qE^:\r\u0005MQ;\u007f\u001eݟ{MVQ۞\u001c.xBږ\u0014\n]\u0018p^\u0003h\u000f4ܔd\u001c.y\u0015\u001ey\u0002k@֚7ab\u000f@2$\u001b6XG\u0019͘\u0007Z2Bٯ2`B\u0013ޏU`M90.o\r,\u001b\u0088Us<)n,K^m8ϾB\u0016\u001dnE5\u0011{\u0007}l\u001cѣ[#T\u001dЉ\n\u00142\u001d݈\u001be \u0005Xz\u0013>ӡr07oޏa-<7%LUJ\u07bd\n[U\u0018ќ\u000f#\u007ft`? 8B\u0002ŔU&V\u000f[\u0005_5nSȣ B\n\u000f\u0011C\u001e'hG\u0004\u001cܛSGv@ݠR5\nIˬN'fS,tYGо'p\u00019\\ulWί5\u001cHWՀj\u0018\ff\u0019-&H\u0018)ʮP)a\r/\r\"\u0006r\\вu*obP2)-.\u0013\rj©\u000e#C]ϊnz.zϿv_CH\u0002GM/\u0007\u001aƜb^\u001dC\u0005cDmXx͋&\u0014ac@\u000e\u000b6\u001fU؇sOǥV&\u001e\u0018ܹ\u001aR\u0017 ўa*\tAQP\r4J\u0003Ӆ\tF\nLN0J2/l̻j\u00108P1;t\u0016E[i'Ƹb\u001b͓me\r\u0013f_\n\u0010m[ș\u001c!1[ݔ\u0012p[høRHX?\u0001,64̼5 cW֫N\fh\u001fl\u007fn\u001bŉ.\u00048q4@SLޘ\u001e\nw\u0014*\u0003\u0003C\u0380UemrԷ[\u0005C\u0006м]\u0013(\u0013u<2\u001a|\rŇ])\u0015JE!5\u0015CEً\u001es\u001cWb\u0017\u0004su6#ARmNM19Ù'\u000f\u001b\u0011͍a\r\u0001Xя\b\u001b\u007f\u0016-Ewbٶ\u0019?ZRސc+&yFhK\u000e,\u001fë\u0010G\\N\u001flsJ0Iȇ2Y(!\u0003%84\u001c\u0017\u001bEj\u007f\u0007;)/Ϯ\u007fSׄ\u0012ZyârOsQˮ\u000e\u0018\u001b\u0006gk.;eZ۩\u000b\u001ag`}{z\u0007\u001doϞHMN.{e@.=5#RՃt;>S˽GB`\u000bȨU\u001cW2'Z;|ߔ\"_l'5:5o\u0018\u0002\u0094Zy6WyB0tL8̡k\u001fN]j\n\u000br@[\u0013eˁ\u0005ն2ٚϧ\u0014Sw̥*WأLG\u0006kڲ\u0012\f\u0005h\u07fb`^yuA\n3\f- ̒b\u0003l\u0004P\u000e'h \u001bƛ\u0003\u0010:bb\u0010`KK=J%̜5t\"[۲a#A=Ņ]VB:\f6\u001f4H%Ѧ|bb+\u0012a^$OU̴U\u0014*-\u0013k%4X}iuˑT\n\u0002Kڄ2#nx֙4\u000e\\3VQTj+#ʣiC0]Ul1Zf\u0014ڲD|Q F\tDV!F/^ʜ}rlkԨ\u001b7>\u0004ȇd'2\u00118\fm\u0017+EȅmjW9,'\u00193\u001eOô\u0012#'c;B#\"@G=*ŭ[a~\u000b̓H(\u0004\u0010Ř W\u0006m0qTrVsȕ\u0018oA\u0015\u000bN>T\u0014!ۍa\u007f\u001cy\u00102_1\u007fLUWۜJq\u001bt߫i'{#߅-48\u0004\u0007U/\u001f\u0097\u001bM<\u000e\u07b8+Vp7H\u007fs\u0002*sހe\r[cDY\rIL?ߍ\u0010{Xo\u0016~Q\u000b\fT\u0016\u0006ۡ?+-(ݽ%y|v\u05cc/?U\u0012n\u001b|Z`\u001f؉3\u00042zx!}\u0015Lq߃;`u)h_}I\u0005Za7ɏo\u000fF(lzվ&NI\u0019\u0081\u007f)K\u0010\u0018,`Rյ\"\u007f4hɳ`JS\f&wS\f\u000ex˯v-}s2d$ :\u000bЛ\u0004Vo\u0003\u0006|\u0005{c\u001aj]ȷEr\u001c*ߡY?n\u0017ȃ)6\f+\u0006\\wYR_Ω\u001e\u000bf\u0015\"L1q\u0018Gݯ +>)Q\u0018E{þyѯ\\i+Կz\u0016'\u0018ܡzEoGy\"ڝV\u0002dDpLó|¶{-\u0013ݑ\u0011\u0014kPѐNye\u0017cTؒv\u0017[LYo5 !WΆ\u0007-s\u0010٬3b3PӠ\u007f76FK\u0017'\u0007ρ\b}?5s\u0006#B\u0001lՑeʾkAGɂTm\u0007KԽ.\u0002\u000bQO\u0014ɲ*W\u0018Y\u001eJR\\n$٠<\u0003ƙ1\u0017t\u00144&r\u000fݲAEܶ\u0007ӆ8lH´F\u001bAx؝-2[\u0015أk\u001fP\u0010\u0011m\u001f\u0013\u0014\u0013٭rA%V$\u000ew\u0018\u0012Iˬo5DaGt\u000brk8bB>@Bvۏe&%\u0010ݱJ|\u001bD́D!@y\u0016s4uѤP:hv̐'W\n&\u0017f&\u00065Gνrh`Kf\r \u00068\u001c\u07bamg\u0018\u00023BH\fд\u001f?]\u0018\u000ex\u001abO;ص\u0006\u0005 \u0005ǭq/@CΧ)m\"KD\u0016\"m\u0005Dɾ:ujic)5\u001f2i܊/\u0016W1'Q1Dhȑ\f\rz݂3_}\u0007ΠG#\u000f ITϭ\u0013\u0015y\\\u0017cdҁ5LYʧ\u0018;\u007feȧA\u0015\u0010+'NՄ\u00178u|%\u001eHܹ&P\u0019ٝ\u001a}\u0011\u0016°H5\f3W\u001dƄ\u0019B\u00120U>r \u0012\u0011Ǯv\u0018OW.Ht7۵K\u0016}\\k s}^\u001eյpT_\u0015vd\\X$4\u0379:,qlF7[Vp'\u0010.\u001fXWH\u000b\u001dд\u001at\u0018\fÐujc@Ĳ3\u00175\u0007Ae4)\u00014ޓ\u007f!%s*BU\niTŮ\u000e~\u0006`E\"^#jy~\u00181K7\u001cJ\u0014ۯ\u001bQx\bԱjLAPƌa<$\u0014\r=UV-(ֻ^T$O;I\u000b`\u0013%ؾ?\u0003\u0004\u00141V\u0011!<\u00013BI\u000e\u00105+\rطo\f'=PjA{mW\u001aE'heE̝ceP\u001b{,{\u000e{ޖ\u058b\u001fΡ\u0010\u0005\u001b\u001f;ujcJA\b\f2\u001bj\u0001<rQm^#*=,tPj\u00124\\C\u0013S8ͻ*e|/\u000e6#W8߂\u038d:Π\u001e\u0012vK\r\u00184/M\r!7\u0011ZlS9vqJu$j\u001d'1kxo0zv+\u0002*ʶ\n@&\u0002\u0018*t\u0004VɶҁDǽ5B\u001a\u000eV^}\u0010PK\u0018`\u0019W:\u00158Q,\u0003;|taLH$s^l\fEY\u0002\u001c|Nml#\u0004\n\u0015r\\ғ)ԛn\t\fx\\\u007f!Y7\u0014\u001c\u0018\rX\u000e\u0013\u0013\u0004>#Xc(Sab,[aל'HEO\u001br\u0001RuĐ͜*ƌ$\u001b#QmT,YlzLpS\u0005-0(9p+-g~\u0016h@h\u0003mFg`K\u0018|`gr\u0011\u0001eĴhnG\u0018\u001bq`hz\u0004\u0015ek$aԍ\u0099\u001dԼ\u0017c\u001aS3zI`g[\u000e\u0002T\u001800%lw\"\u00102F\u001cWK\u0019BO?\u0006x\fd8Ӛ\u001c\u0003VAzddV}ڑϳ=ْz$N)\u000b:e\u0001\u0005\u0004x{(G\u0014R\u000fe H]pc\u0015sqiX\u0007J:\u0012U*=¸2)\u0016 \\9S3;ΣΤ9ȗ4Ahd\u0010 _%0|\u0003TBOJ[\u0018v$\u001e\tNG\u0003\u007fIao,\u000e~Q \u0003?Ю\rk\u001c\u001d\u000fXpGt˩ԇxۅnh|\u001b\u0002\u0016|!f-emTY8$3ftzp\\Gbzh/7\u001bY\u0014\u0017\u000f+\u0001Əu~.1\u001e\u000b%\r\u001cښԿ ֲV\u0011,[Z0\u001d/\u0011VK\u0003r\nb.H\u0014\u000554\u000eV,F\"Z~\bp\u0005(s\\\u0019%\u000bczR_\u0600)s\t0ZC\u001f\u0002\u0015Ƿٽ6\u07b2\u001f)R\u0019\u0001S\u007fQq:\u0013=D|m[gl@\u001bbvqKA\u001e31\"{,\\\n\u001c%*$j<0>ʝ[ko\u0003[eOgC\u0590\u009eIϵ~\nxc0\u0010\u0015<F\u0019MOX-pp\u0007\u000enqvdVvFv!:K\f\u001b\u001bDo^Ħqu\u0015P\u001c|BAiΒ҂bҍ\u0011!?,3\\*\u0002)OO%IjN\u000e\u001a\f+Vq\u001f\u0012\u0001&r?e'\u007fL7&JoХ{wjxx\"(O%֣ۚ\u0006תNd\u000b\u00066N#\u00041Eb&\u0003>\u0007Fcr5\u0011\u001b4>s\u0015p\u0014\u001aU\u0002>gPuRőe\bFD\u0002}_&Bӿֻuǈh'ZM\u0018s\u000eT#4\u0006\u001f6\u007f\u0010p\u000f\u001c$v<ki1\u0005\u000f|u^fLGB)[Ԟ\u0007\u000eReF\u0017&~uŞҟ{ؼRY|\u000frDj8lOz\u0010@*'\u0015I~\u000fB[L\u00068~A${#]U\u0014[~iȼ\u00135uc\u0013*ax7ӓǪMƝWm*<\u001aQ#\u0018 \n&+&\u001dUP8\u0006QnC\u001f\u0017'\tC}R\u0001h%\u001f(fpӯ]\u00075\nl\r`oiɵծ\u0003̉fAl|o.]\u00025)N\u0014\u001d\u007f?oVrk\u001bglU?|\u001eej\bgy\u0013D,:̅(\u001d{S&n5b\u0004ӟ˫\u0016Ԝ\"\u0007\n\u0017->2'RT\u0005k2MB*\b\u0001S\u001f=\u0016qk$-~nc\t<O\bt\u0013ʕwt\u001e&\u001cc\u0011O\u0018βȱ~ȃLA1-W0-*\u0005F1X@\u0004k\u0014$ >,Z6|-<c\u001a\u001c!w\u0006hIg9ȅVas[h\u0007Do`͗ס*ȧ<)Sd]N|-\u000f\u0001Z@N\u0005\u001dDt}\u001e4H:!H\u0003=iWv~Tq[K;ݣ\b\u001dW$E\\\u0014\u001a\rѻ\u008ebЛ'QT%\u007f4\u0017=5N!y\u0018Pj\u001f\u0001\n\n?itna[3\u0010l\u001ep17\u0010YJh\fTON_w)\u0001v݀tɬ*O\u0004'Y(1C?t\u0016w\u0019Ka0sȭ,^\n7ɥ8o\u0002{t~x\u0019ę;4Eå\n\"3ym\u001cڄ\u03783Χ \u0005l5EĒg/ܮ5$C_ɢ\u0001w͆\u0012:.2̢\u0011,Q(\u0003Wړ=\b0~\u0007$_F\u0017fJ\u0001ޡK[#/4h\u0005@!ľŸm݈B^\u001d\u00173έQHm)\u0012WМs\u0010e)\u0018WƄ:-\u0019-x1ߣ#wjrבL\u001baew\u0018K;Ɏ.kRÎ?J\u0016\t\u001f\u0001ځҬ&Λs\u0019+}_\u0097\u0017Rǋ\u0014A\b\u0012ۼuP̞kU/5ڍwd=|:eмy-SOȮoHLD&@/<ŲC\u0013@ѣks\u0004}\u0014VϵХJӱ\u0014FI%u˒\u0011G܈\u0006wG[ǔkS͓<M\u000bbڄF\u0006q\u001f\u00119ܚcW\u001eB5gJ\u000ec\u0016J@ȴ:\u0016\u007f^\u0003d\u0017A+Ϡ\u07b5DăPg'aIݤ\bDggrMۄ\u0010R5iX%܋*Ifحfj7H\u000bՠGjHס/ݎ1"}, d2 = {"\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~7\b'>m\u0014=QMDO=\u001f\u001f>", "1n[9X*MW#\b^g-\u0007", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "5dc\u0010b3ES\u0017\u000e~h5`\u00120o>'{G\u0001\u0019\u0013Vo", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002 9w9%\u000e$\u0015J4\u000fNC>)nBFt", "5dc\u0010b3ES\u0017\u000e~h5`\u00120o", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002 9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u00180\u0013\u0010;p|\u0015%\u00123x: `\u0017Ny\u0013\u0005E3q*b`\u0004\u001d", "Adc\u0010b3ES\u0017\u000e~h5`\u00120o", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fuW\u0002Cd\n\u001b\u001a\fC4NL]\u0017Gw$yK2LOZiO\u000b2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~7\b'>m\u0014=QMDOC\u001e\u001dLj:\u00119", "1n[9X*MW#\b^m,\u0005l8f\n", "5dc\u0010b3ES\u0017\u000e~h5`\u0018/mc1|J?\u0016\u0017No\u00108\u0006%", "5dc\u0010b3ES\u0017\u000e~h5`\u0018/mc1|J", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002 9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u00180\u0013\u0010;p|\u0015%\u00123x: `\u0017Ny\u0013\u0005E3q*h_\u0002+JFl\u007f", "Adc\u0010b3ES\u0017\u000e~h5`\u0018/mc1|J", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fuW\u0002Cd\n\u001b\u001a\fC4NL]\u0017Gw$yK2LUYg]PBO8mU", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0013c\u0007/7v%\rIR7ZH)\u0015>", "1n]AX5M2\u0015\u000evM@\b\t", "5dc\u0010b5MS\"\u000eYZ;xwCp\u007ffz@\b\u0017\u0019C~\u000e", "5dc\u0010b5MS\"\u000eYZ;xwCp\u007f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002 6", "Adc\u0010b5MS\"\u000eYZ;xwCp\u007fod/g\u0011&Ku", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002@\u0016c", "D`[BX", "", "1n]AX5M2\u0019\rxk0\b\u00183o\t", "5dc\u0010b5MS\"\u000eY^:z\u00163p\u000f,\u0006I", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002 9w9%\u000e$\u0015J4\u000fNGP1rM9t", "Adc\u0010b5MS\"\u000eY^:z\u00163p\u000f,\u0006I", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002CWnN\u0010[a\nW-VrhN(wF\rbx", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0013c\u0007/7v%\u001daN;A", "1n]AX5MB-\nz", "5dc\u0010b5MS\"\u000eir7|G.e\u0007(}<\u0010\u0017", "5dc\u0010b5MS\"\u000eir7|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002 9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u00180\u0013}Kw\u000b\r\u001a\u0015<4NL_\u001fG\u0003$dU4h\u001c", "Adc\u0010b5MS\"\u000eir7|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fuE\u0012Jr\u0002\u0010\u001d\u0015~HzKe\u0010P\t\u0004\nL)>\nJ", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~7\u000e.Fw\u001e\nKA;yB\"\u0012lh=\u0016w\bL\u0006+QU$", "1tbAb4\u001aQ(\u0003\u0005g:", "5dc\u0010h:M]!Zxm0\u0007\u0012=$~(\u0003@\u0003\u0013&G", "5dc\u0010h:M]!Zxm0\u0007\u0012=", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002 9w9%\u000e$\u001e]/\u0014N@E2}\u001a", "Adc\u0010h:M]!Zxm0\u0007\u0012=", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002CWnN\u0010[j\u001dR2Vk]O3D\b(", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "3cXAT)ES\b~\u000em", "5dc\u0012W0MO\u0016\u0006zM,\u0010\u0018md\u007f/{B|&\u0017", "5dc\u0012W0MO\u0016\u0006zM,\u0010\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002 9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u00180\u0013\u0011;{\u0010Uq\u0017>t\u007f>e\u0010Fg$\u0003E2j\u001c", "Adc\u0012W0MO\u0016\u0006zM,\u0010\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fuX\u0002NwJg\u001f\u0017?ylQV\u000f5\t\"yJ+>\nJ", "", "4nRBf,=", "5dc\u0013b*Na\u0019}9],\u0004\t1a\u000f(", "5dc\u0013b*Na\u0019}", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002 G", "Adc\u0013b*Na\u0019}", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002Q\u0016c", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G{-At\u001d\n`GIX0'\u0017h7", "6na6m6Gb\u0015\u0006h\\9\u0007\u00106A\u0013,\n-| \u0019G", "5dc\u0015b9Bh#\b\nZ3j\u0007<o\u0007/WS\u0005%\u0004Cx\u0010<5$5`}\"3|\u0016", "5dc\u0015b9Bh#\b\nZ3j\u0007<o\u0007/WS\u0005%\u0004Cx\u0010<", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002 9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u00180\u0013\u0010;p|\u0015%\u00123x:0T\u001dQ\u0001\u001cQT-v3Uh{G\u0017", "Adc\u0015b9Bh#\b\nZ3j\u0007<o\u0007/WS\u0005%\u0004Cx\u0010<", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fuW\u0002Cd\n\u001b\u001a\fC4^@c\u001aN\u0001p\tE7UBbay\u001d\u00056", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMDA", "7lT\u000eV;B]\"", "5dc\u0016`,\u001aQ(\u0003\u0005gjx\u00128o\u000f$\u000bD\u000b %", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002 C", "5dc\u0016`,\u001aQ(\u0003\u0005gj{\t6e\u0002$\u000b@", "5dc\u0016`,\u001aQ(\u0003\u0005g", "Adc\u0016`,\u001aQ(\u0003\u0005gsKo\u0001n\u000b3k", "7r2<a;:W\"~\b", "7r2<a;:W\"~\b\u001d(\u0006\u00129t{7\u007fJ\n%", "7r2<a;:W\"~\b\u001d+|\u0010/g{7{", "Adc\u0010b5MO\u001d\bzk", "7r41\\;:P ~", "7r41\\;:P ~9],\u0004\t1a\u000f(", "Adc\u0012W0MO\u0016\u0006z", "7rB5b>B\\\u001bmzq;j\u0019,s\u000f,\u000bP\u0010\u001b!P", "7rB5b>B\\\u001bmzq;j\u0019,s\u000f,\u000bP\u0010\u001b!P.\r<}%7U\r ", "Adc [6PW\"\u0001i^?\fv?b\u000e7\u007fO\u0011&\u001bQx", "7rC?T=>`'z\u0002@9\u0007\u0019:", "7rC?T=>`'z\u0002@9\u0007\u0019:$~(\u0003@\u0003\u0013&G", "Adc!e(OS&\rve\u000e\n\u0013?p", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~@\u000217Z\u00160QMDS>\u001d\u0015>", ":he2E,@W#\b", "5dc\u0019\\=>@\u0019\u0001~h5;\b/l\u007f*wO\u0001", "5dc\u0019\\=>@\u0019\u0001~h5", "Adc\u0019\\=>@\u0019\u0001~h5D\f\u001c3\u0012\u0015]>", "", ";`g!X?M:\u0019\b|m/", "5dc\u001aT?-S,\u000ea^5~\u00182$~(\u0003@\u0003\u0013&G", "5dc\u001aT?-S,\u000ea^5~\u00182", "Adc\u001aT?-S,\u000ea^5~\u00182", ">`]2G0MZ\u0019", "5dc\u001dT5>B\u001d\u000e\u0002^j{\t6e\u0002$\u000b@", "5dc\u001dT5>B\u001d\u000e\u0002^", "Adc\u001dT5>B\u001d\u000e\u0002^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~D\u000b*9z\u0016<[ 7x!\u001a\u001eja\u001d\u0010d6$", ">q^4e,Lauz\bK(\u0006\u000b/I\t)\u0006", "5dc\u001de6@`\u0019\r\t;(\nu+n\u0002(_I\u0002!UFo\u0015<x!DY", "5dc\u001de6@`\u0019\r\t;(\nu+n\u0002(_I\u0002!", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002 9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u00180\u0013\u0010;p|\u0015%\u00123x:-c\u001aI\u0007\u0015\u0004O\u0006dSF[\u0003IA)k+na", "Adc\u001de6@`\u0019\r\t;(\nu+n\u0002(_I\u0002!", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fuW\u0002Cd\n\u001b\u001a\fC4[O`\u0012Ty#\u0004\u001e%u3Uh{G%Nc4:OP", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~F\b'7C", "@n[2", "5dc\u001fb3>\u0012\u0018~\u0002^.x\u0018/", "5dc\u001fb3>", "Adc\u001fb3>\u001b\u001f\u000f^c,\tp", "Ad[2V;>R", "5dc X3>Q(~y\u001d+|\u0010/g{7{", "5dc X3>Q(~y", "Adc X3>Q(~y", "AsPAX\u000b>a\u0017\f~i;\u0001\u00138", "5dc g(MSw~\t\\9\u0001\u0014>i\n1:?\u0001\u001e\u0017Ik\u001d<", "5dc g(MSw~\t\\9\u0001\u0014>i\n1", "Adc g(MSw~\t\\9\u0001\u0014>i\n1", "BdbAG(@", "5dc!X:MB\u0015\u00019],\u0004\t1a\u000f(", "5dc!X:MB\u0015\u0001", "Adc!X:MB\u0015\u0001", "BdgA", "5dc!X?M", "Adc!X?M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "BdgAF,ES\u0017\u000e~h5i\u00058g\u007f", "5dc!X?MA\u0019\u0006z\\;\u0001\u00138R{1}@?\u0016\u0017No\u00108\u0006%", "5dc!X?MA\u0019\u0006z\\;\u0001\u00138R{1}@", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002 7", "Adc!X?MA\u0019\u0006z\\;\u0001\u00138R{1}@HwuTv\r\u001e\u0001", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002A\u0016c", "BdgAF<;a(\u0003\nn;\u0001\u00138", "5dc!X?MA){\tm0\f\u0019>i\n1:?\u0001\u001e\u0017Ik\u001d<", "5dc!X?MA){\tm0\f\u0019>i\n1", "Adc!X?MA){\tm0\f\u0019>i\n1", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f&\u0013VoW+\u0001'7`}\u001c4t\u0016\u001c\\?Jk\n", "BnV4_,:P ~hm(\f\t", "5dc!b.@Z\u0019zwe,j\u0018+t\u007ffz@\b\u0017\u0019C~\u000e", "5dc!b.@Z\u0019zwe,j\u0018+t\u007f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002 9nF\u0013\u001fd\u0012M>V\u0003cI/xR7h\u00180\u0013\u0010Jd\u0010\f_|?lrIV\fD\u0001\u0015cP%wF/", "Adc!b.@Z\u0019zwe,j\u0018+t\u007f", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002CN{<!\u001c^\rat\u000b\u000faL.|D\u0001/\fuW\u00117w\u0001U\u0005\u00187lwBR\rNy\u0003\u0005=8h\u001c\u001dP", "", "BqPCX9LO b\u0004],\u0010", "5dc!e(OS&\rve\u0010\u0006\b/x>'{G\u0001\u0019\u0013Vo", "5dc!e(OS&\rve\u0010\u0006\b/x", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002 3", "Adc!e(OS&\rve\u0010\u0006\b/x", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002=\u0016c", "DdaA\\*:Z\u0007|\bh3\u0004dBi\u000e\u0015wI\u0003\u0017", "5dc#X9MW\u0017z\u0002L*\n\u00136l[;\u007fNm\u0013 IoL;v,5[y/7", "5dc#X9MW\u0017z\u0002L*\n\u00136l[;\u007fNm\u0013 Io", "Adc#X9MW\u0017z\u0002L*\n\u00136l[;\u007fNm\u0013 Io", "\u000fbR2f:BP\u001d\u0006~m@b\tC", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMlc@$", "\"", "<`\\2", ";da4X\u0017HZ\u001d|\u000f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u000fbc6b5)`#\nzk;\u0011n/y", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~5{\u001e7{$2JGBoC2pfp=\u0011l\u0002", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u00138;", "Bga<j\u001a>[\u0015\b\nb*\u000bj/th2\u000b.\u0011\"\"Q|\u001d<u", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "1kT.e\u001b>f(l\u000b[:\f\r>u\u000f,\u0006I", "", ":`Q2_", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "1n[9T7LS", "1n_FG,Qb", "1tc!X?M", "2hP9b.", "2hb.U3>R", "2hb:\\:L", "3qa<e", "2db0e0Ib\u001d\t\u0004", "3w_.a+", "5dc V9HZ o~^>\b\u0013<tf(\u0005B\u0010\u001a", "5dc!X?M:\u0015\u0013\u0005n;i\t=u\u00077", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\u001cU\u0012*G|\u0003.[SBz\n", "6dP1\\5@", "7mS2k\rH`~~\u000f", ";`_=\\5@", "", "7mb2e;-S,\u000eVm\n\r\u0016=o\r", "7me6f0;Z\u0019m\u0005N:|\u0016", "=m0Bg6?W \u0006i^?\f", "=m29\\*D", "=m8:X\b<b\u001d\t\u0004", "7lT\u000eV;B]\"m\u000fi,", "=m8:X\b<b\u001d\t\u0004&\u007fl\r\u001eY\u000b\u001c", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002@9w9%\u000e$\u0015J4\u000fNGP1rM9tn2S\u0011Bl\nU\u001b\u001f=4qR_\u000eV}\u001f~OrIVb]\tKKN-\u007f(|", "=m;<a.\u001cZ\u001d|\u0001", ">`V276P\\", ">`V2?,?b", ">`V2E0@V(", ">`V2H7", ">`b@j6KR", ">`bAX\u001b>f(", ">da3b9F7!~V\\;\u0001\u00138", ">n_Bc", "@d`BX:M4#|\u000bl", "Aba<_3\u001bg", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "F", "G", "Aba<_3\u001bg\u0003\u007f{l,\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "=eU@X;", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ%\u0017Ok\u0017Kz#C#k ?i\u001f=QAIVA( hnH\u001bP,Lv+XL[\u0002CX|L\u001b\u0016cWS<\u0015NZQ-lS;)\u0011:\u0013bKq~\u001b\u001a\u0018>7F\u0006G", "Aba<_3-]|\by^?", "Ad[2V;:P ~\\k6\r\u0014", "Adc\u001de6@`\u0019\r\t", "Adc X3>Q(\u0003\u0005g", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "AsP?g\u0010GR\u0019\u0012", "3mS\u0016a+>f", "@d[.g0OS\b\tdk0~\r8a\u0007\u0017{S\u0010", "Ag^DG,Qb\u0007\u000fwl;\u0001\u0018?t\u00042\u0005", "ChN?X3>O'~"}, k = 2, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class SemanticsPropertiesKt {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, ViewProps.ROLE, "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};

    @Deprecated(message = "\u0013G\u000fH1\t\u001d\\\u001805\u007f1\u0018@WkZH;\u0014(\u001b`_SsKQ\t-uv\fmP`pm:Jk")
    @InterfaceC1492Gx
    public static /* synthetic */ void getImeAction$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    @Deprecated(message = "\u0018Y\u0001tq}(KjH>\u007fb(-ZC^\u0018<\u0015hK[\u0005Y\u0003oOxq", replaceWith = @ReplaceWith(expression = "isTraversalGroup", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void isContainer$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    public static final <T> T throwSemanticsGetNotSupported() {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    public static final <T> SemanticsPropertyKey<T> AccessibilityKey(String str) {
        return new SemanticsPropertyKey<>(str, true);
    }

    public static final <T> SemanticsPropertyKey<T> AccessibilityKey(String str, Function2<? super T, ? super T, ? extends T> function2) {
        return new SemanticsPropertyKey<>(str, true, function2);
    }

    private static final <T extends Function<? extends Boolean>> SemanticsPropertyKey<AccessibilityAction<T>> ActionPropertyKey(String str) {
        return AccessibilityKey(str, AnonymousClass1.INSTANCE);
    }

    /* JADX INFO: renamed from: androidx.compose.ui.semantics.SemanticsPropertiesKt$ActionPropertyKey$1 */
    /* JADX INFO: compiled from: SemanticsProperties.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!4i\bӵLc\u000b\u0004I\u0006>\u00146B\u0005#:ߚ\u0010\u000fvlI0\u000be^-\u0001RJ\u001bqڔB$\u0004*\u0002EKUH\u007fP\n\u007fZuj\u0007Rj\rS\u000fL\u0016\u000fiZH\u0006\u0003k\u0016'8RqO3\u0014ok8'|ȥ\t 8'"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~5{\u001e7{$2JGBoC2pfp=\u0011l\u0002", "\"", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u00138;", "", ">`a2a;/O \u000fz", "1gX9W\u001d:Z)~", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1<T> extends Lambda implements Function2<AccessibilityAction<T>, AccessibilityAction<T>, AccessibilityAction<T>> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final AccessibilityAction<T> invoke(AccessibilityAction<T> accessibilityAction, AccessibilityAction<T> accessibilityAction2) {
            String label;
            Function action;
            if (accessibilityAction == null || (label = accessibilityAction.getLabel()) == null) {
                label = accessibilityAction2.getLabel();
            }
            if (accessibilityAction == null || (action = accessibilityAction.getAction()) == null) {
                action = accessibilityAction2.getAction();
            }
            return new AccessibilityAction<>(label, action);
        }
    }

    public static final String getContentDescription(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return (String) throwSemanticsGetNotSupported();
    }

    public static final void setContentDescription(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getContentDescription(), CollectionsKt.listOf(str));
    }

    static {
        SemanticsProperties.INSTANCE.getStateDescription();
        SemanticsProperties.INSTANCE.getProgressBarRangeInfo();
        SemanticsProperties.INSTANCE.getPaneTitle();
        SemanticsProperties.INSTANCE.getLiveRegion();
        SemanticsProperties.INSTANCE.getFocused();
        SemanticsProperties.INSTANCE.getIsTraversalGroup();
        SemanticsProperties.INSTANCE.getIsTraversalGroup();
        SemanticsProperties.INSTANCE.getContentType$ui_release();
        SemanticsProperties.INSTANCE.getContentDataType$ui_release();
        SemanticsProperties.INSTANCE.getTraversalIndex();
        SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
        SemanticsProperties.INSTANCE.getRole();
        SemanticsProperties.INSTANCE.getTestTag();
        SemanticsProperties.INSTANCE.getTextSubstitution();
        SemanticsProperties.INSTANCE.getIsShowingTextSubstitution();
        SemanticsProperties.INSTANCE.getEditableText();
        SemanticsProperties.INSTANCE.getTextSelectionRange();
        SemanticsProperties.INSTANCE.getImeAction();
        SemanticsProperties.INSTANCE.getSelected();
        SemanticsProperties.INSTANCE.getCollectionInfo();
        SemanticsProperties.INSTANCE.getCollectionItemInfo();
        SemanticsProperties.INSTANCE.getToggleableState();
        SemanticsProperties.INSTANCE.getIsEditable();
        SemanticsProperties.INSTANCE.getMaxTextLength();
        SemanticsActions.INSTANCE.getCustomActions();
    }

    public static final String getStateDescription(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getStateDescription().getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    public static final void setStateDescription(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsProperties.INSTANCE.getStateDescription().setValue(semanticsPropertyReceiver, $$delegatedProperties[0], str);
    }

    public static final ProgressBarRangeInfo getProgressBarRangeInfo(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getProgressBarRangeInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[1]);
    }

    public static final void setProgressBarRangeInfo(SemanticsPropertyReceiver semanticsPropertyReceiver, ProgressBarRangeInfo progressBarRangeInfo) {
        SemanticsProperties.INSTANCE.getProgressBarRangeInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[1], progressBarRangeInfo);
    }

    public static final void heading(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getHeading(), Unit.INSTANCE);
    }

    public static final String getPaneTitle(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getPaneTitle().getValue(semanticsPropertyReceiver, $$delegatedProperties[2]);
    }

    public static final void setPaneTitle(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsProperties.INSTANCE.getPaneTitle().setValue(semanticsPropertyReceiver, $$delegatedProperties[2], str);
    }

    public static final void disabled(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getDisabled(), Unit.INSTANCE);
    }

    public static final int getLiveRegion(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getLiveRegion().getValue(semanticsPropertyReceiver, $$delegatedProperties[3]).m5923unboximpl();
    }

    /* JADX INFO: renamed from: setLiveRegion-hR3wRGc */
    public static final void m5951setLiveRegionhR3wRGc(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2) {
        SemanticsProperties.INSTANCE.getLiveRegion().setValue(semanticsPropertyReceiver, $$delegatedProperties[3], LiveRegionMode.m5917boximpl(i2));
    }

    public static final boolean getFocused(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getFocused().getValue(semanticsPropertyReceiver, $$delegatedProperties[4]).booleanValue();
    }

    public static final void setFocused(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsProperties.INSTANCE.getFocused().setValue(semanticsPropertyReceiver, $$delegatedProperties[4], Boolean.valueOf(z2));
    }

    public static final boolean isContainer(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsTraversalGroup().getValue(semanticsPropertyReceiver, $$delegatedProperties[5]).booleanValue();
    }

    public static final void setContainer(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsProperties.INSTANCE.getIsTraversalGroup().setValue(semanticsPropertyReceiver, $$delegatedProperties[5], Boolean.valueOf(z2));
    }

    public static final boolean isTraversalGroup(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsTraversalGroup().getValue(semanticsPropertyReceiver, $$delegatedProperties[6]).booleanValue();
    }

    public static final void setTraversalGroup(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsProperties.INSTANCE.getIsTraversalGroup().setValue(semanticsPropertyReceiver, $$delegatedProperties[6], Boolean.valueOf(z2));
    }

    public static final void invisibleToUser(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getInvisibleToUser(), Unit.INSTANCE);
    }

    public static final ContentType getContentType(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getContentType$ui_release().getValue(semanticsPropertyReceiver, $$delegatedProperties[7]);
    }

    public static final void setContentType(SemanticsPropertyReceiver semanticsPropertyReceiver, ContentType contentType) {
        SemanticsProperties.INSTANCE.getContentType$ui_release().setValue(semanticsPropertyReceiver, $$delegatedProperties[7], contentType);
    }

    public static final int getContentDataType(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getContentDataType$ui_release().getValue(semanticsPropertyReceiver, $$delegatedProperties[8]).m3801unboximpl();
    }

    /* JADX INFO: renamed from: setContentDataType-NTL_tik */
    public static final void m5949setContentDataTypeNTL_tik(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2) {
        SemanticsProperties.INSTANCE.getContentDataType$ui_release().setValue(semanticsPropertyReceiver, $$delegatedProperties[8], ContentDataType.m3795boximpl(i2));
    }

    public static final float getTraversalIndex(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTraversalIndex().getValue(semanticsPropertyReceiver, $$delegatedProperties[9]).floatValue();
    }

    public static final void setTraversalIndex(SemanticsPropertyReceiver semanticsPropertyReceiver, float f2) {
        SemanticsProperties.INSTANCE.getTraversalIndex().setValue(semanticsPropertyReceiver, $$delegatedProperties[9], Float.valueOf(f2));
    }

    public static final ScrollAxisRange getHorizontalScrollAxisRange(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[10]);
    }

    public static final void setHorizontalScrollAxisRange(SemanticsPropertyReceiver semanticsPropertyReceiver, ScrollAxisRange scrollAxisRange) {
        SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[10], scrollAxisRange);
    }

    public static final ScrollAxisRange getVerticalScrollAxisRange(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[11]);
    }

    public static final void setVerticalScrollAxisRange(SemanticsPropertyReceiver semanticsPropertyReceiver, ScrollAxisRange scrollAxisRange) {
        SemanticsProperties.INSTANCE.getVerticalScrollAxisRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[11], scrollAxisRange);
    }

    public static final void popup(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIsPopup(), Unit.INSTANCE);
    }

    public static final void dialog(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIsDialog(), Unit.INSTANCE);
    }

    public static final int getRole(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getRole().getValue(semanticsPropertyReceiver, $$delegatedProperties[12]).m5932unboximpl();
    }

    /* JADX INFO: renamed from: setRole-kuIjeqM */
    public static final void m5952setRolekuIjeqM(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2) {
        SemanticsProperties.INSTANCE.getRole().setValue(semanticsPropertyReceiver, $$delegatedProperties[12], Role.m5926boximpl(i2));
    }

    public static final String getTestTag(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTestTag().getValue(semanticsPropertyReceiver, $$delegatedProperties[13]);
    }

    public static final void setTestTag(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsProperties.INSTANCE.getTestTag().setValue(semanticsPropertyReceiver, $$delegatedProperties[13], str);
    }

    public static final AnnotatedString getText(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return (AnnotatedString) throwSemanticsGetNotSupported();
    }

    public static final void setText(SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getText(), CollectionsKt.listOf(annotatedString));
    }

    public static final AnnotatedString getTextSubstitution(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTextSubstitution().getValue(semanticsPropertyReceiver, $$delegatedProperties[14]);
    }

    public static final void setTextSubstitution(SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        SemanticsProperties.INSTANCE.getTextSubstitution().setValue(semanticsPropertyReceiver, $$delegatedProperties[14], annotatedString);
    }

    public static final boolean isShowingTextSubstitution(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsShowingTextSubstitution().getValue(semanticsPropertyReceiver, $$delegatedProperties[15]).booleanValue();
    }

    public static final void setShowingTextSubstitution(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsProperties.INSTANCE.getIsShowingTextSubstitution().setValue(semanticsPropertyReceiver, $$delegatedProperties[15], Boolean.valueOf(z2));
    }

    public static final AnnotatedString getEditableText(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getEditableText().getValue(semanticsPropertyReceiver, $$delegatedProperties[16]);
    }

    public static final void setEditableText(SemanticsPropertyReceiver semanticsPropertyReceiver, AnnotatedString annotatedString) {
        SemanticsProperties.INSTANCE.getEditableText().setValue(semanticsPropertyReceiver, $$delegatedProperties[16], annotatedString);
    }

    public static final long getTextSelectionRange(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getTextSelectionRange().getValue(semanticsPropertyReceiver, $$delegatedProperties[17]).m6127unboximpl();
    }

    /* JADX INFO: renamed from: setTextSelectionRange-FDrldGo */
    public static final void m5953setTextSelectionRangeFDrldGo(SemanticsPropertyReceiver semanticsPropertyReceiver, long j2) {
        SemanticsProperties.INSTANCE.getTextSelectionRange().setValue(semanticsPropertyReceiver, $$delegatedProperties[17], TextRange.m6111boximpl(j2));
    }

    @Deprecated(message = "\u0013G\u000fH1\t\u001d\\\u001805\u007f1\u0018@WkZH;\u0014(\u001b`_SsKQ\t-uv\fmP`pm:Jk")
    @InterfaceC1492Gx
    public static final int getImeAction(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getImeAction().getValue(semanticsPropertyReceiver, $$delegatedProperties[18]).m6291unboximpl();
    }

    @Deprecated(message = "\u0013G\u000fH1\t\u001d\\\u001805\u007f1\u0018@WkZH;\u0014(\u001b`_SsKQ\t-uv\fmP`pm:Jk")
    @InterfaceC1492Gx
    /* JADX INFO: renamed from: setImeAction-4L7nppU */
    public static final void m5950setImeAction4L7nppU(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2) {
        SemanticsProperties.INSTANCE.getImeAction().setValue(semanticsPropertyReceiver, $$delegatedProperties[18], ImeAction.m6285boximpl(i2));
    }

    public static final boolean getSelected(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getSelected().getValue(semanticsPropertyReceiver, $$delegatedProperties[19]).booleanValue();
    }

    public static final void setSelected(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsProperties.INSTANCE.getSelected().setValue(semanticsPropertyReceiver, $$delegatedProperties[19], Boolean.valueOf(z2));
    }

    public static final CollectionInfo getCollectionInfo(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getCollectionInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[20]);
    }

    public static final void setCollectionInfo(SemanticsPropertyReceiver semanticsPropertyReceiver, CollectionInfo collectionInfo) {
        SemanticsProperties.INSTANCE.getCollectionInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[20], collectionInfo);
    }

    public static final CollectionItemInfo getCollectionItemInfo(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getCollectionItemInfo().getValue(semanticsPropertyReceiver, $$delegatedProperties[21]);
    }

    public static final void setCollectionItemInfo(SemanticsPropertyReceiver semanticsPropertyReceiver, CollectionItemInfo collectionItemInfo) {
        SemanticsProperties.INSTANCE.getCollectionItemInfo().setValue(semanticsPropertyReceiver, $$delegatedProperties[21], collectionItemInfo);
    }

    public static final ToggleableState getToggleableState(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getToggleableState().getValue(semanticsPropertyReceiver, $$delegatedProperties[22]);
    }

    public static final void setToggleableState(SemanticsPropertyReceiver semanticsPropertyReceiver, ToggleableState toggleableState) {
        SemanticsProperties.INSTANCE.getToggleableState().setValue(semanticsPropertyReceiver, $$delegatedProperties[22], toggleableState);
    }

    public static final boolean isEditable(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getIsEditable().getValue(semanticsPropertyReceiver, $$delegatedProperties[23]).booleanValue();
    }

    public static final void setEditable(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z2) {
        SemanticsProperties.INSTANCE.getIsEditable().setValue(semanticsPropertyReceiver, $$delegatedProperties[23], Boolean.valueOf(z2));
    }

    public static final void password(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getPassword(), Unit.INSTANCE);
    }

    public static final void error(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getError(), str);
    }

    public static final void indexForKey(SemanticsPropertyReceiver semanticsPropertyReceiver, Function1<Object, Integer> function1) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getIndexForKey(), function1);
    }

    public static final int getMaxTextLength(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsProperties.INSTANCE.getMaxTextLength().getValue(semanticsPropertyReceiver, $$delegatedProperties[24]).intValue();
    }

    public static final void setMaxTextLength(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2) {
        SemanticsProperties.INSTANCE.getMaxTextLength().setValue(semanticsPropertyReceiver, $$delegatedProperties[24], Integer.valueOf(i2));
    }

    public static final void selectableGroup(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getSelectableGroup(), Unit.INSTANCE);
    }

    public static final List<CustomAccessibilityAction> getCustomActions(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return SemanticsActions.INSTANCE.getCustomActions().getValue(semanticsPropertyReceiver, $$delegatedProperties[25]);
    }

    public static final void setCustomActions(SemanticsPropertyReceiver semanticsPropertyReceiver, List<CustomAccessibilityAction> list) {
        SemanticsActions.INSTANCE.getCustomActions().setValue(semanticsPropertyReceiver, $$delegatedProperties[25], list);
    }

    public static /* synthetic */ void getTextLayoutResult$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = null;
        }
        getTextLayoutResult(semanticsPropertyReceiver, str, function1);
    }

    public static final void getTextLayoutResult(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1<? super List<TextLayoutResult>, Boolean> function1) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getGetTextLayoutResult(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void onClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = null;
        }
        onClick(semanticsPropertyReceiver, str, function0);
    }

    public static final void onClick(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0<Boolean> function0) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnClick(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void onLongClick$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            str = null;
        }
        onLongClick(semanticsPropertyReceiver, str, function0);
    }

    public static final void onLongClick(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0<Boolean> function0) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnLongClick(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void scrollBy$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function2 function2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            str = null;
        }
        scrollBy(semanticsPropertyReceiver, str, function2);
    }

    public static final void scrollBy(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function2<? super Float, ? super Float, Boolean> function2) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollBy(), new AccessibilityAction(str, function2));
    }

    public static final void scrollByOffset(SemanticsPropertyReceiver semanticsPropertyReceiver, Function2<? super Offset, ? super Continuation<? super Offset>, ? extends Object> function2) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollByOffset(), function2);
    }

    public static /* synthetic */ void scrollToIndex$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = null;
        }
        scrollToIndex(semanticsPropertyReceiver, str, function1);
    }

    public static final void scrollToIndex(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1<? super Integer, Boolean> function1) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getScrollToIndex(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void onAutofillText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = null;
        }
        onAutofillText(semanticsPropertyReceiver, str, function1);
    }

    public static final void onAutofillText(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1<? super AnnotatedString, Boolean> function1) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnAutofillText$ui_release(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void setProgress$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = null;
        }
        setProgress(semanticsPropertyReceiver, str, function1);
    }

    public static final void setProgress(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1<? super Float, Boolean> function1) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetProgress(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void setText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        setText(semanticsPropertyReceiver, str, function1);
    }

    public static final void setText(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1<? super AnnotatedString, Boolean> function1) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetText(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void setTextSubstitution$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = null;
        }
        setTextSubstitution(semanticsPropertyReceiver, str, function1);
    }

    public static final void setTextSubstitution(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1<? super AnnotatedString, Boolean> function1) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetTextSubstitution(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void showTextSubstitution$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            str = null;
        }
        showTextSubstitution(semanticsPropertyReceiver, str, function1);
    }

    public static final void showTextSubstitution(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1<? super Boolean, Boolean> function1) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getShowTextSubstitution(), new AccessibilityAction(str, function1));
    }

    public static /* synthetic */ void clearTextSubstitution$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            str = null;
        }
        clearTextSubstitution(semanticsPropertyReceiver, str, function0);
    }

    public static final void clearTextSubstitution(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0<Boolean> function0) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getClearTextSubstitution(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void insertTextAtCursor$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1 function1, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = null;
        }
        insertTextAtCursor(semanticsPropertyReceiver, str, function1);
    }

    public static final void insertTextAtCursor(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function1<? super AnnotatedString, Boolean> function1) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getInsertTextAtCursor(), new AccessibilityAction(str, function1));
    }

    /* JADX INFO: renamed from: onImeAction-9UiTYpY$default */
    public static /* synthetic */ void m5948onImeAction9UiTYpY$default(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2, String str, Function0 function0, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        m5947onImeAction9UiTYpY(semanticsPropertyReceiver, i2, str, function0);
    }

    /* JADX INFO: renamed from: onImeAction-9UiTYpY */
    public static final void m5947onImeAction9UiTYpY(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2, String str, Function0<Boolean> function0) {
        semanticsPropertyReceiver.set(SemanticsProperties.INSTANCE.getImeAction(), ImeAction.m6285boximpl(i2));
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnImeAction(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void performImeAction$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            str = null;
        }
        performImeAction(semanticsPropertyReceiver, str, function0);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "\u0018Y\u0001tqg\u001adYU<\u0004S(\u001c`k\\\u000e9\u0019\u0002}WyKw\u0001S\u0007quv5qG._|BU,3y\u001bd_\u000e'YL\t", replaceWith = @ReplaceWith(expression = "onImeAction(imeActionType = ImeAction.Default, label = label, action = action)", imports = {"androidx.compose.ui.semantics.onImeAction", "androidx.compose.ui.text.input.ImeAction"}))
    @InterfaceC1492Gx
    public static final void performImeAction(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0<Boolean> function0) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getOnImeAction(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void setSelection$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function3 function3, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = null;
        }
        setSelection(semanticsPropertyReceiver, str, function3);
    }

    public static final void setSelection(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function3<? super Integer, ? super Integer, ? super Boolean, Boolean> function3) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getSetSelection(), new AccessibilityAction(str, function3));
    }

    public static /* synthetic */ void copyText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            str = null;
        }
        copyText(semanticsPropertyReceiver, str, function0);
    }

    public static final void copyText(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0<Boolean> function0) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCopyText(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void cutText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        cutText(semanticsPropertyReceiver, str, function0);
    }

    public static final void cutText(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0<Boolean> function0) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCutText(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pasteText$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            str = null;
        }
        pasteText(semanticsPropertyReceiver, str, function0);
    }

    public static final void pasteText(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0<Boolean> function0) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPasteText(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void expand$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        expand(semanticsPropertyReceiver, str, function0);
    }

    public static final void expand(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0<Boolean> function0) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getExpand(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void collapse$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            str = null;
        }
        collapse(semanticsPropertyReceiver, str, function0);
    }

    public static final void collapse(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0<Boolean> function0) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getCollapse(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void dismiss$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            str = null;
        }
        dismiss(semanticsPropertyReceiver, str, function0);
    }

    public static final void dismiss(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0<Boolean> function0) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getDismiss(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void requestFocus$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = null;
        }
        requestFocus(semanticsPropertyReceiver, str, function0);
    }

    public static final void requestFocus(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0<Boolean> function0) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getRequestFocus(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageUp$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        pageUp(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageUp(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0<Boolean> function0) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageUp(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageDown$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = null;
        }
        pageDown(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageDown(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0<Boolean> function0) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageDown(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageLeft$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = null;
        }
        pageLeft(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageLeft(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0<Boolean> function0) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageLeft(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void pageRight$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            str = null;
        }
        pageRight(semanticsPropertyReceiver, str, function0);
    }

    public static final void pageRight(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0<Boolean> function0) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getPageRight(), new AccessibilityAction(str, function0));
    }

    public static /* synthetic */ void getScrollViewportLength$default(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            str = null;
        }
        getScrollViewportLength(semanticsPropertyReceiver, str, function0);
    }

    /* JADX INFO: renamed from: androidx.compose.ui.semantics.SemanticsPropertiesKt$getScrollViewportLength$1 */
    /* JADX INFO: compiled from: SemanticsProperties.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0016\u001d̉=!,r\bӵLc\u0003#I\u0006>\u00106B\u0005\":ߚ\u0010\u0007\u0015ii:Re`4bU:\u000f\u001a}b%\",ڱG=[\u001d\f&"}, d2 = {"\n`]<a@F])\rS", "", "7s", "", "", "7me<^,", "uKY.i(\bc(\u0003\u0002(\u0013\u0001\u0017>;C\u000f\u0001<\u0012\u0013`Nk\u0017>@\u0002?c\u0005 3vk"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07781 extends Lambda implements Function1<List<Float>, Boolean> {
        final /* synthetic */ Function0<Float> $action;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07781(Function0<Float> function0) {
            super(1);
            function0 = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(List<Float> list) {
            boolean z2;
            Float fInvoke = function0.invoke();
            if (fInvoke == null) {
                z2 = false;
            } else {
                list.add(fInvoke);
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }
    }

    public static final void getScrollViewportLength(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0<Float> function0) {
        semanticsPropertyReceiver.set(SemanticsActions.INSTANCE.getGetScrollViewportLength(), new AccessibilityAction(str, new Function1<List<Float>, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt.getScrollViewportLength.1
            final /* synthetic */ Function0<Float> $action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C07781(Function0<Float> function02) {
                super(1);
                function0 = function02;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(List<Float> list) {
                boolean z2;
                Float fInvoke = function0.invoke();
                if (fInvoke == null) {
                    z2 = false;
                } else {
                    list.add(fInvoke);
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            }
        }));
    }
}
