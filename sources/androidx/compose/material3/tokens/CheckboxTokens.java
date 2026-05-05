package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
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
/* JADX INFO: compiled from: CheckboxTokens.kt */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я6\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005$4\u0012\u000e\u0007nj?5Le^.ZS0\u0012s{B)c$wrCU0}*\tUtm̨n`ҙ;C=\u0005V}p,֒Yxk\u0012_IPpW3{q\u00818śԓ5\u0004ڶ6*@y\u0013\u00062,N\u0013\u0005~\u0014Z\u001a\u0018H@\u001fAň\u0011S\r܅*\bD(\u000f'-~\\@`l\f<Ȼ\"Ʌ\u07bcAMϮc8\u0005M\u001bKl)\u0013\u0002o\"{WEA-%\u0002\u0005\u008fQ¹У\u0002>џA\rp'50au]Cf\u0004d$9]%]!5ػ\tWhϯ?-UsYa^7\u0006\r\u0014\rj\u0013؝\n-P͓E\u001cl\u001b\u001cDE~aTh\u0002\rWVд4ي\u001b%\bđ{P)|iai\u001bل6ަ͕\f\u001dţ\u0005v)[b\u0013x\u0017!k\u0006U\u0002`NU`N8hǀq\nxç\u001a,\nIU\u0011\u007f\u000b\u001fH/%ejޠ''sȵ`Fm\u0012\u0013q9bwn`@P}ގ;0\u0011ȱrFj\"ya%g:/e\u001c\u0003\u0016ą\f\u0019(ο\u0010>'D\u001e_ \u007fw\u000be]8'ĽeŽףmjް[Af3CV{\u0012gs\u0005\u0018\u0010Kp'pfpb۱^b0ίJJp3\u0006\r\u0015]\u001a7J? +ٜ07!¢-J\tCPRM m\u0001\u0001\u0010-Vו#Ѱɦ#s֊\u0005Xdp}l\u0011K2$n&}P_]1&\u00041מ8\u0003+Ȕ\u0017u\u0006pu]\u0018[z@\u000eU*/ک\u001e?YǽU\u0015\u0015*7CR<Sx\u000be\u007f\\ɟ+\u0001\u0005Ȫ'=n[u\u0019;\b:\u000f\u0003J}Vј!Ԯޞq\"ϋh\b\u0002aT\u007f_eZ:iB\u001a\u0002\u0011\nTNf\fġ#$-˚\b$\u0003f;Tw,$*,/Cpԃmu6Ӡz\u0011,(s\u0015|z$$zQ\f4ק7Ծ̫}=ѐ(t\u000bBVo\u0010\nH>B\u0011\u0004WO\u001b\tVf\\ߵ3\u0004n߿D\u000fv\u000eiKc~\flF_X\u0003ʸ\u0002\u001afƹ=\u0013S\ru~>bjEb\u000f8\r\u06030ޫޗ\u001b<֕Z_j\t>\u000b\f\u001a<|IfUK\u0017`L,j\u0017դGZqв(|\u0006\u0004m gIP2SV<Vݸ[Ƈ\u0098\u0004_҇d)2\u0001\r\u0014K ~t?\t>Ubo{2/b\u009b\r!rʪ\u0017h+lRe\n*6\u001b\u0019\u000bslƀM\b>ߤ_+s/}\u001d\t/\u000baZ\u0018I;ު\u0010٣ܴ/]κYlVd\u0005\u0017~TTg7\u0003K\f\u001c\u0003\"\u000f9`۽vuj\u03a2dP}\u007fQcQ.Rs\u001f\f+eͣ\u001aҎߛ4,ִMr\u001c'\n\\k=\u0004S.$w\u0010\u0003mtW<{`܈mƐ\u001aq\u001eȈR\u0018!\u001e8\u0004\\Yƶv\u00106úNQ\b\u0002\u0010$/pyG9@U-̓\u0005לǧgwƠgtknc\u0010\u001bh7'\br}_+Z?M\\\"͠^@\u0019֦8Z\u0017R\"&v6D[z)>QˣgҴךNZá/7s*o6HT$R-}F\u00138*@\u0015ie؉Bj\u0011Ϟ\u0005D]dl{x{\u0003cA\u0014+\u0001ƕ]ƷԻ3Eޔ\"l77'$s\u000fM9\u0015\b\u0016X4zIRm*σ6\u0011wĉ\u000f\u0013\t\u0015p\u0006P9Pd\u000b\u007f\u0016;\u0082JZEԣ?[*Jr\u0014vbS\u0016Z\bZ\u0013Ĺ\u0010ˏם7\u001fۋ`\"$;_8Y\u001b\u0017_#<V~\u0015xMj\u007fbК.\u0007\u0005ӕ%A\u007f\u0012yKDN\u0001\u0005G\u000f\u001e\u001d̩eծŝ4dͺ+\u0014\neX\u0004ee\\qo0\u001aDS\u0002\u0012Un\u000fˌ#*,Ԗ\u000e%\u0006*?Yzvj&ns\u0006\u0006܈)ޟ͍C\"ؼp\u0001{\n:n0ujBo8\u0012\n\"\u0001\\>X<ď\u000bKUˈ\u0012\rJuS%\b&\u0014\u0013K\u0017+\u0012ߺp˟֭Hq٬3de<!x\u001c<8LD}\u0018Og\u0016\u001e-@cŀnpu˩w\u0012>~\u001b\u001eT\u000f?@x\u007f\u000f\u001fɺ&֏ƭE5̊|UIb\u0019E'&d\u001dP\u0010ƈ\u0006\u001f6K\u001dѝ\u001ax_\u001d\u00139fؼE7"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001K\u0019.KI8uG\r\u001fnaB\u00159", "", "u(E", "\u0011n]AT0GS&azb.\u007f\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0010b5MO\u001d\bzk\u000f|\r1h\u000foZ\u0014`\u001cfHW", "u(5", "\u0014", "\u0011n]AT0GS&l}Z7|", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@38U\t \u0001Z >VB;j\u0012(\"qaFtf(Yv|", "5dc\u0010b5MO\u001d\bzk\u001a\u007f\u0005:e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~g\u0001\u001cBm_\u001bWSDj4\u001drrnB\u0007p\u001aQr2G\"", "\u0011n]AT0GS&p~];\u007f", "5dc\u0010b5MO\u001d\bzk\u001e\u0001\b>hG\u0007O \u0006f\u0018/", "\u0017b^;F0SS", "5dc\u0016V6GA\u001d\u0014z&\u000bPh45\u0001\u0010", "!d[2V;>Rv\t\u0004m(\u0001\u0012/r]2\u0003J\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001K 5WP)i7\u001e\u001dhG9\u001bR6Tv0U\"", "5dc X3>Q(~y<6\u0006\u0018+i\t(\t\u001e\u000b\u001e!T", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\fWJEx\"\u001c\u0018hi9lc@=\u0001-GU\\\u0002", "!d[2V;>Rw\u0003\tZ)\u0004\t.C\n1\u000b<\u0005 \u0017TM\u0018C\u00012", "5dc X3>Q(~y=0\u000b\u0005,l\u007f'YJ\n&\u0013Kx\u000eIT/<c\u000b", "!d[2V;>Rw\u0003\tZ)\u0004\t.C\n1\u000b<\u0005 \u0017TY\u00198t)Dm", "", "!d[2V;>Rw\u0003\tZ)\u0004\t.C\n1\u000b<\u0005 \u0017TY\u001eK})>Yo$6|\u0019", "5dc X3>Q(~y=0\u000b\u0005,l\u007f'YJ\n&\u0013Kx\u000eI`5D`\u0002)7_\u001a-\\F\u0003J\b}\u001a8b!", "!d[2V;>Rw\u0003\tZ)\u0004\t.I}2\u0005\u001e\u000b\u001e!T", "5dc X3>Q(~y=0\u000b\u0005,l\u007f'_>\u000b tQv\u0018I", "!d[2V;>Rx\f\bh9Z\u00138t{,\u0005@\u000et!Ny\u001b", "5dc X3>Q(~y>9\n\u0013<C\n1\u000b<\u0005 \u0017TM\u0018C\u00012", "!d[2V;>Rx\f\bh9]\u0013-u\u000e\u0006\u0006I\u0010\u0013\u001bPo\u001b\u001a\u0001,?f", "5dc X3>Q(~y>9\n\u0013<F\n&\fN^! Vk\u0012Ev2\u0013c\u0005*D", "!d[2V;>Rx\f\bh9]\u0013-u\u000e\fyJ\nt!Ny\u001b", "5dc X3>Q(~y>9\n\u0013<F\n&\fNd\u0015!PM\u0018C\u00012", "!d[2V;>Rx\f\bh9]\u0013-u\u000e\u0012\fO\b\u001b Ga\u0012;\u0006(", "5dc X3>Q(~y>9\n\u0013<F\n&\fNj'&Ns\u0017<h)4h\u0001g\u0016Au3\u001dD#", "!d[2V;>Rx\f\bh9_\u0013@e\r\u0006\u0006I\u0010\u0013\u001bPo\u001b\u001a\u0001,?f", "5dc X3>Q(~y>9\n\u0013<H\n9{M^! Vk\u0012Ev2\u0013c\u0005*D", "!d[2V;>Rx\f\bh9_\u0013@e\r\fyJ\nt!Ny\u001b", "5dc X3>Q(~y>9\n\u0013<H\n9{Md\u0015!PM\u0018C\u00012", "!d[2V;>Rx\f\bh9_\u0013@e\r\u0012\fO\b\u001b Ga\u0012;\u0006(", "5dc X3>Q(~y>9\n\u0013<H\n9{Mj'&Ns\u0017<h)4h\u0001g\u0016Au3\u001dD#", "!d[2V;>Rx\f\bh9`\u00079n]2\u0003J\u000e", "5dc X3>Q(~y>9\n\u0013<I}2\u0005\u001e\u000b\u001e!T", "!d[2V;>Rx\f\bh9g\u0016/s\u000e(z\u001e\u000b &Cs\u0017<\u0004\u0003?`\b-", "5dc X3>Q(~y>9\n\u0013<P\r(\nN\u0001\u0016tQx\u001d8z.5f[*>w#", "!d[2V;>Rx\f\bh9g\u0016/s\u000e(z$~! %y\u0015F\u0004", "5dc X3>Q(~y>9\n\u0013<P\r(\nN\u0001\u0016zEy\u0017\u001a\u0001,?f", "!d[2V;>Rx\f\bh9g\u0016/s\u000e(z*\u0011&\u001eKx\u000e.z$D\\", "5dc X3>Q(~y>9\n\u0013<P\r(\nN\u0001\u0016\u0001W~\u0015@\u007f%']|/:5t\u0002-H\u000bl\u001c", "!d[2V;>Ry\txn:Z\u00138t{,\u0005@\u000et!Ny\u001b", "5dc X3>Q(~y?6z\u0019=C\n1\u000b<\u0005 \u0017TM\u0018C\u00012", "!d[2V;>Ry\txn:`\u00079n]2\u0003J\u000e", "5dc X3>Q(~y?6z\u0019=I}2\u0005\u001e\u000b\u001e!T", "!d[2V;>Ry\txn:f\u0019>l\u00041{2\u0005\u0016&J", "5dc X3>Q(~y?6z\u0019=O\u00107\u0003D\n\u0017\tKn\u001d?>\u0004\t9\u0003o8U", "!d[2V;>R{\t\f^9Z\u00138t{,\u0005@\u000et!Ny\u001b", "5dc X3>Q(~yA6\u000e\t<C\n1\u000b<\u0005 \u0017TM\u0018C\u00012", "!d[2V;>R{\t\f^9`\u00079n]2\u0003J\u000e", "5dc X3>Q(~yA6\u000e\t<I}2\u0005\u001e\u000b\u001e!T", "!d[2V;>R{\t\f^9f\u0019>l\u00041{2\u0005\u0016&J", "5dc X3>Q(~yA6\u000e\t<O\u00107\u0003D\n\u0017\tKn\u001d?>\u0004\t9\u0003o8U", "!d[2V;>R||\u0005g\n\u0007\u00109r", "5dc X3>Q(~yB*\u0007\u0012\ro\u00072\t", "!d[2V;>R\u0003\u000f\ne0\u0006\t!i~7~", "5dc X3>Q(~yH<\f\u00103n\u007f\u001a\u007f?\u0010\u001a^&CmAF&\u001d", "!d[2V;>R\u0004\fzl:|\b\ro\t7wD\n\u0017$%y\u0015F\u0004", "5dc X3>Q(~yI9|\u0017=e~\u0006\u0006I\u0010\u0013\u001bPo\u001b\u001a\u0001,?f", "!d[2V;>R\u0004\fzl:|\b\u0013c\n1YJ\b!$", "5dc X3>Q(~yI9|\u0017=e~\fyJ\nt!Ny\u001b", "!d[2V;>R\u0004\fzl:|\b\u0019u\u000f/\u007fI\u0001\t\u001bF~\u0011", "5dc X3>Q(~yI9|\u0017=e~\u0012\fO\b\u001b Ga\u0012;\u0006(|8Q\u007f<=\u0017\u0016", "!sPAX\u0013:g\u0019\fha(\b\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001[\u0019*XC!kH\r\u001fnaB\u00159", "5dc g(MS\u007fz\u000f^9j\f+p\u007f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\u001cP?Fk\u001a\u001e)Wk?\u0007l:$", "!sPAX\u0013:g\u0019\fhbA|", "5dc g(MS\u007fz\u000f^9j\rDeG\u0007O \u0006f\u0018/", "#mb2_,<b\u0019}Yb:x\u00066e~\u0006\u0006I\u0010\u0013\u001bPo\u001b&\u0002!3]\r4", "#mb2_,<b\u0019}Yb:x\u00066e~\u0012\fO\b\u001b GM\u0018C\u00012", "5dc\"a:>Z\u0019|\n^+[\r=a|/{?j'&Ns\u0017<T/<c\u000b", "#mb2_,<b\u0019}Yb:x\u00066e~\u0012\fO\b\u001b Ga\u0012;\u0006(", "5dc\"a:>Z\u0019|\n^+[\r=a|/{?j'&Ns\u0017<h)4h\u0001g\u0016Au3\u001dD#", "#mb2_,<b\u0019}Zk9\u0007\u0016\u0010o}8\n*\u0011&\u001eKx\u000e\u001a\u0001,?f", "5dc\"a:>Z\u0019|\n^+\\\u0016<o\r\t\u0006>\u0011%\u0001W~\u0015@\u007f%\u0013c\u0005*D", "#mb2_,<b\u0019}Zk9\u0007\u0016\u0010o}8\n*\u0011&\u001eKx\u000e.z$D\\", "5dc\"a:>Z\u0019|\n^+\\\u0016<o\r\t\u0006>\u0011%\u0001W~\u0015@\u007f%']|/:5t\u0002-H\u000bl\u001c", "#mb2_,<b\u0019}Zk9\u0007\u0016\u0012o\u0011(\t*\u0011&\u001eKx\u000e\u001a\u0001,?f", "5dc\"a:>Z\u0019|\n^+\\\u0016<o\r\u000b\u0006Q\u0001$\u0001W~\u0015@\u007f%\u0013c\u0005*D", "#mb2_,<b\u0019}Zk9\u0007\u0016\u0012o\u0011(\t*\u0011&\u001eKx\u000e.z$D\\", "5dc\"a:>Z\u0019|\n^+\\\u0016<o\r\u000b\u0006Q\u0001$\u0001W~\u0015@\u007f%']|/:5t\u0002-H\u000bl\u001c", "#mb2_,<b\u0019}Zk9\u0007\u0016\u0019u\u000f/\u007fI\u0001t!Ny\u001b", "5dc\"a:>Z\u0019|\n^+\\\u0016<o\r\u0012\fO\b\u001b GM\u0018C\u00012", "#mb2_,<b\u0019}Zk9\u0007\u0016\u001ar\u007f6\n@\u007f\u0001'Vv\u0012Ev\u0003?`\b-", "5dc\"a:>Z\u0019|\n^+\\\u0016<o\r\u0013\t@\u000f%\u0017FY\u001eK})>Y[*>w#", "#mb2_,<b\u0019}Zk9\u0007\u0016\u001ar\u007f6\n@\u007f\u0001'Vv\u0012Ev\u00179X\r#", "5dc\"a:>Z\u0019|\n^+\\\u0016<o\r\u0013\t@\u000f%\u0017FY\u001eK})>Yo$6|\u0019u,\u0017\u001bp\u0004\u001f|", "#mb2_,<b\u0019}[h*\r\u0017\u0019u\u000f/\u007fI\u0001t!Ny\u001b", "5dc\"a:>Z\u0019|\n^+]\u0013-u\u000e\u0012\fO\b\u001b GM\u0018C\u00012", "#mb2_,<b\u0019}[h*\r\u0017\u0019u\u000f/\u007fI\u0001\t\u001bF~\u0011", "5dc\"a:>Z\u0019|\n^+]\u0013-u\u000e\u0012\fO\b\u001b Ga\u0012;\u0006(|8Q\u007f<=\u0017\u0016", "#mb2_,<b\u0019}]h=|\u0016\u0019u\u000f/\u007fI\u0001t!Ny\u001b", "5dc\"a:>Z\u0019|\n^+_\u0013@e\r\u0012\fO\b\u001b GM\u0018C\u00012", "#mb2_,<b\u0019}]h=|\u0016\u0019u\u000f/\u007fI\u0001\t\u001bF~\u0011", "5dc\"a:>Z\u0019|\n^+_\u0013@e\r\u0012\fO\b\u001b Ga\u0012;\u0006(|8Q\u007f<=\u0017\u0016", "#mb2_,<b\u0019}dn;\u0004\r8e]2\u0003J\u000e", "5dc\"a:>Z\u0019|\n^+f\u0019>l\u00041{\u001e\u000b\u001e!T", "#mb2_,<b\u0019}dn;\u0004\r8eq,zO\u0004", "5dc\"a:>Z\u0019|\n^+f\u0019>l\u00041{2\u0005\u0016&J7l\u0010V*\u0005Ze", "#mb2_,<b\u0019}ek,\u000b\u0017/di8\u000bG\u0005 \u0017%y\u0015F\u0004", "5dc\"a:>Z\u0019|\n^+g\u0016/s\u000e(z*\u0011&\u001eKx\u000e\u001a\u0001,?f", "#mb2_,<b\u0019}ek,\u000b\u0017/di8\u000bG\u0005 \u00179s\rKy", "5dc\"a:>Z\u0019|\n^+g\u0016/s\u000e(z*\u0011&\u001eKx\u000e.z$D\\E~\u000bM\u001b}N+", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class CheckboxTokens {
    public static final int $stable = 0;
    private static final float ContainerHeight;
    private static final RoundedCornerShape ContainerShape;
    private static final float ContainerWidth;
    private static final float IconSize;
    public static final float SelectedDisabledContainerOpacity = 0.38f;
    private static final float SelectedDisabledContainerOutlineWidth;
    private static final float SelectedErrorFocusOutlineWidth;
    private static final float SelectedErrorHoverOutlineWidth;
    private static final float SelectedErrorPressedOutlineWidth;
    private static final float SelectedFocusOutlineWidth;
    private static final float SelectedHoverOutlineWidth;
    private static final float SelectedOutlineWidth;
    private static final float SelectedPressedOutlineWidth;
    public static final float UnselectedDisabledContainerOpacity = 0.38f;
    private static final float UnselectedDisabledOutlineWidth;
    private static final float UnselectedErrorFocusOutlineWidth;
    private static final float UnselectedErrorHoverOutlineWidth;
    private static final float UnselectedErrorPressedOutlineWidth;
    private static final float UnselectedFocusOutlineWidth;
    private static final float UnselectedHoverOutlineWidth;
    private static final float UnselectedOutlineWidth;
    private static final float UnselectedPressedOutlineWidth;
    public static final CheckboxTokens INSTANCE = new CheckboxTokens();
    private static final ColorSchemeKeyTokens SelectedContainerColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens SelectedDisabledContainerColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens SelectedDisabledIconColor = ColorSchemeKeyTokens.Surface;
    private static final ColorSchemeKeyTokens SelectedErrorContainerColor = ColorSchemeKeyTokens.Error;
    private static final ColorSchemeKeyTokens SelectedErrorFocusContainerColor = ColorSchemeKeyTokens.Error;
    private static final ColorSchemeKeyTokens SelectedErrorFocusIconColor = ColorSchemeKeyTokens.OnError;
    private static final ColorSchemeKeyTokens SelectedErrorHoverContainerColor = ColorSchemeKeyTokens.Error;
    private static final ColorSchemeKeyTokens SelectedErrorHoverIconColor = ColorSchemeKeyTokens.OnError;
    private static final ColorSchemeKeyTokens SelectedErrorIconColor = ColorSchemeKeyTokens.OnError;
    private static final ColorSchemeKeyTokens SelectedErrorPressedContainerColor = ColorSchemeKeyTokens.Error;
    private static final ColorSchemeKeyTokens SelectedErrorPressedIconColor = ColorSchemeKeyTokens.OnError;
    private static final ColorSchemeKeyTokens SelectedFocusContainerColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens SelectedFocusIconColor = ColorSchemeKeyTokens.OnPrimary;
    private static final ColorSchemeKeyTokens SelectedHoverContainerColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens SelectedHoverIconColor = ColorSchemeKeyTokens.OnPrimary;
    private static final ColorSchemeKeyTokens SelectedIconColor = ColorSchemeKeyTokens.OnPrimary;
    private static final ColorSchemeKeyTokens SelectedPressedContainerColor = ColorSchemeKeyTokens.Primary;
    private static final ColorSchemeKeyTokens SelectedPressedIconColor = ColorSchemeKeyTokens.OnPrimary;
    private static final ShapeKeyTokens StateLayerShape = ShapeKeyTokens.CornerFull;
    private static final float StateLayerSize = Dp.m6638constructorimpl((float) 40.0d);
    private static final ColorSchemeKeyTokens UnselectedDisabledOutlineColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens UnselectedErrorFocusOutlineColor = ColorSchemeKeyTokens.Error;
    private static final ColorSchemeKeyTokens UnselectedErrorHoverOutlineColor = ColorSchemeKeyTokens.Error;
    private static final ColorSchemeKeyTokens UnselectedErrorOutlineColor = ColorSchemeKeyTokens.Error;
    private static final ColorSchemeKeyTokens UnselectedErrorPressedOutlineColor = ColorSchemeKeyTokens.Error;
    private static final ColorSchemeKeyTokens UnselectedFocusOutlineColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens UnselectedHoverOutlineColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens UnselectedOutlineColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens UnselectedPressedOutlineColor = ColorSchemeKeyTokens.OnSurface;

    private CheckboxTokens() {
    }

    /* JADX INFO: renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3036getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final RoundedCornerShape getContainerShape() {
        return ContainerShape;
    }

    /* JADX INFO: renamed from: getContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m3037getContainerWidthD9Ej5fM() {
        return ContainerWidth;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m3038getIconSizeD9Ej5fM() {
        return IconSize;
    }

    public final ColorSchemeKeyTokens getSelectedContainerColor() {
        return SelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedDisabledContainerColor() {
        return SelectedDisabledContainerColor;
    }

    /* JADX INFO: renamed from: getSelectedDisabledContainerOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3039getSelectedDisabledContainerOutlineWidthD9Ej5fM() {
        return SelectedDisabledContainerOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedDisabledIconColor() {
        return SelectedDisabledIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorContainerColor() {
        return SelectedErrorContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorFocusContainerColor() {
        return SelectedErrorFocusContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorFocusIconColor() {
        return SelectedErrorFocusIconColor;
    }

    /* JADX INFO: renamed from: getSelectedErrorFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3040getSelectedErrorFocusOutlineWidthD9Ej5fM() {
        return SelectedErrorFocusOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedErrorHoverContainerColor() {
        return SelectedErrorHoverContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorHoverIconColor() {
        return SelectedErrorHoverIconColor;
    }

    /* JADX INFO: renamed from: getSelectedErrorHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3041getSelectedErrorHoverOutlineWidthD9Ej5fM() {
        return SelectedErrorHoverOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedErrorIconColor() {
        return SelectedErrorIconColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorPressedContainerColor() {
        return SelectedErrorPressedContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedErrorPressedIconColor() {
        return SelectedErrorPressedIconColor;
    }

    /* JADX INFO: renamed from: getSelectedErrorPressedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3042getSelectedErrorPressedOutlineWidthD9Ej5fM() {
        return SelectedErrorPressedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedFocusContainerColor() {
        return SelectedFocusContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedFocusIconColor() {
        return SelectedFocusIconColor;
    }

    /* JADX INFO: renamed from: getSelectedFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3043getSelectedFocusOutlineWidthD9Ej5fM() {
        return SelectedFocusOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedHoverContainerColor() {
        return SelectedHoverContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedHoverIconColor() {
        return SelectedHoverIconColor;
    }

    /* JADX INFO: renamed from: getSelectedHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3044getSelectedHoverOutlineWidthD9Ej5fM() {
        return SelectedHoverOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedIconColor() {
        return SelectedIconColor;
    }

    /* JADX INFO: renamed from: getSelectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3045getSelectedOutlineWidthD9Ej5fM() {
        return SelectedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getSelectedPressedContainerColor() {
        return SelectedPressedContainerColor;
    }

    public final ColorSchemeKeyTokens getSelectedPressedIconColor() {
        return SelectedPressedIconColor;
    }

    /* JADX INFO: renamed from: getSelectedPressedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3046getSelectedPressedOutlineWidthD9Ej5fM() {
        return SelectedPressedOutlineWidth;
    }

    public final ShapeKeyTokens getStateLayerShape() {
        return StateLayerShape;
    }

    /* JADX INFO: renamed from: getStateLayerSize-D9Ej5fM, reason: not valid java name */
    public final float m3047getStateLayerSizeD9Ej5fM() {
        return StateLayerSize;
    }

    public final ColorSchemeKeyTokens getUnselectedDisabledOutlineColor() {
        return UnselectedDisabledOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedDisabledOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3048getUnselectedDisabledOutlineWidthD9Ej5fM() {
        return UnselectedDisabledOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedErrorFocusOutlineColor() {
        return UnselectedErrorFocusOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedErrorFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3049getUnselectedErrorFocusOutlineWidthD9Ej5fM() {
        return UnselectedErrorFocusOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedErrorHoverOutlineColor() {
        return UnselectedErrorHoverOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedErrorHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3050getUnselectedErrorHoverOutlineWidthD9Ej5fM() {
        return UnselectedErrorHoverOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedErrorOutlineColor() {
        return UnselectedErrorOutlineColor;
    }

    public final ColorSchemeKeyTokens getUnselectedErrorPressedOutlineColor() {
        return UnselectedErrorPressedOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedErrorPressedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3051getUnselectedErrorPressedOutlineWidthD9Ej5fM() {
        return UnselectedErrorPressedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedFocusOutlineColor() {
        return UnselectedFocusOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedFocusOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3052getUnselectedFocusOutlineWidthD9Ej5fM() {
        return UnselectedFocusOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedHoverOutlineColor() {
        return UnselectedHoverOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedHoverOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3053getUnselectedHoverOutlineWidthD9Ej5fM() {
        return UnselectedHoverOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedOutlineColor() {
        return UnselectedOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3054getUnselectedOutlineWidthD9Ej5fM() {
        return UnselectedOutlineWidth;
    }

    public final ColorSchemeKeyTokens getUnselectedPressedOutlineColor() {
        return UnselectedPressedOutlineColor;
    }

    /* JADX INFO: renamed from: getUnselectedPressedOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3055getUnselectedPressedOutlineWidthD9Ej5fM() {
        return UnselectedPressedOutlineWidth;
    }

    static {
        float f2 = (float) 18.0d;
        ContainerHeight = Dp.m6638constructorimpl(f2);
        float f3 = (float) 2.0d;
        ContainerShape = RoundedCornerShapeKt.m1301RoundedCornerShape0680j_4(Dp.m6638constructorimpl(f3));
        ContainerWidth = Dp.m6638constructorimpl(f2);
        IconSize = Dp.m6638constructorimpl(f2);
        float f4 = (float) 0.0d;
        SelectedDisabledContainerOutlineWidth = Dp.m6638constructorimpl(f4);
        SelectedErrorFocusOutlineWidth = Dp.m6638constructorimpl(f4);
        SelectedErrorHoverOutlineWidth = Dp.m6638constructorimpl(f4);
        SelectedErrorPressedOutlineWidth = Dp.m6638constructorimpl(f4);
        SelectedFocusOutlineWidth = Dp.m6638constructorimpl(f4);
        SelectedHoverOutlineWidth = Dp.m6638constructorimpl(f4);
        SelectedOutlineWidth = Dp.m6638constructorimpl(f4);
        SelectedPressedOutlineWidth = Dp.m6638constructorimpl(f4);
        UnselectedDisabledOutlineWidth = Dp.m6638constructorimpl(f3);
        UnselectedErrorFocusOutlineWidth = Dp.m6638constructorimpl(f3);
        UnselectedErrorHoverOutlineWidth = Dp.m6638constructorimpl(f3);
        UnselectedErrorPressedOutlineWidth = Dp.m6638constructorimpl(f3);
        UnselectedFocusOutlineWidth = Dp.m6638constructorimpl(f3);
        UnselectedHoverOutlineWidth = Dp.m6638constructorimpl(f3);
        UnselectedOutlineWidth = Dp.m6638constructorimpl(f3);
        UnselectedPressedOutlineWidth = Dp.m6638constructorimpl(f3);
    }
}
