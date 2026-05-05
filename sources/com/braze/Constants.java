package com.braze;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u000564\u0012\u0006\rnj?yLeV5ZS0\u0014s{B-c$wDAڭ\u001a\u0014̝9O|f(sPZŲG\u000f\u0014\u0016Iv:Jmx\f\u0014e˷\u0015ņC3Uڎ\u000eEnwN\u0005N4x؇Lڱ\u0005\u001a2Ϻ`\u0003\tGc\f@2\u0017\u0088\rň\u0011M\r܅b\u0012L%\u0019\u001e\u000bi%ȫ\u001bǰa:7݊SuPT?_^~$μ\u0019ù+\r~ѭn7N>M\u0015SUYޞ%ÜC\u0003Gм\u000e\u0011v/?+wu.̳+ÿ\u0018\u00153˽]i\u0001/t\u0005\u007fbbʳ}յgKXʫx\u0004\t\u0006%<2\u0010\\ΰ\u001bͶ1\u001anڜ^?\u0003}k@~\u00045۔Rѐe6\u001fӛP?9E3f\u007fc\u0012ϑ!Ѽ\u007f\u0005\u0015̔s\r|.sT<bkØ'ɐU1Y̵\u000eT\\\u0018q=\u001c\u0006GîTò\b0Oĉ\u007f\b\u001f=/%e]\u0010\u0601sȠ\u0006HLϙG\u0011nxki\u0001J\u0017̕Aގ;*\u0011ȱ+Pr\u0016\u0004P\u0003Z\u0003ґ ɟX\u0007\u0006ܱc,j\nT!S\u0012%п;ȬnMe܃u;tJqn\u001a\u0010.ޱ1ۋ9Qk߄2^\u0005(W<\u0011\u0007/ٯ\u0015ΐ\u0010Zd̥r>V\u007f(w*F%܃e\u0558Cq$ع|='r-H1 \u0019ˍOȤcZpɭO`A;\u001biRv_ɝ#ʷtooծ\u001a8\u000bx:-oj\fӮxƁ&h<ês\u0013\r\u000e\u0018G\u0016e\u001eƉ?טyU\u0004\u008df&GlG=A(UȂ\u0005ī1ETǩ6][.?z+\u0013e\u0097;\u05cek\brѱ|lxggTE$MܬEן\fd\bט2R\te{T9]\u0015λEè]<V˻M\u0011-==\u0001\u001e$Sލ\u007fϡ+\u001d\u001eߐd;#\u0002ui\u001e0Pʳa֑xe\fϺ4\"}\u0004i]`=\u000fՅ,˽B\",ЗSNV\r\u0010\bp\u000b\u000bن\u0006ȈEdxމ\tY\u0019R\u0016f5.cߥ)ݍ>\u0013wϘ\u0005:mN\fC,\u00165ǀwݱQSoƚ>Wj0b\u000f8\rRωA݁ =(݈(n\u0017V\u001esF8\u0018ݬ5ƀ@\t,҉|H\u00162[T\u0018\bfĆRʮc\u000f\u001fϨ\u0013\u007fI~&T'^-ާWޝI`)ơQ\u000b\u001d\\6xc3[֎\u0019ߟ3c:ܬ$)\u0017E\u0003O-h{ń\u0017ȗ=\u001b0߰Q\u0017S\t[I08Zڢ{Թoo\u0014Մh\t+n0\u001bgSg٪Iҍb\u000b]̤\u001fp\u0005?~R|$\u007fͭMէ\u0012<\u0012ۇ[%]!\bb[N%ߞ\nƴ\u001e\u0001\u001f\u05edy\u0013\u001a,{FI/\\ם\u007fִMj\u001c՝Lcak\u0016\bN\"}\u05fbGֈ`W\u0016ўZi)k.qDdXƈeц$\u00046\u05fdE~\u0018` 6}\u0004\nÿeȨ]k\u007f˺\u001139 \u001eByjOƄ6ؼgn]̃Sr?\u000b\u0012n[RsԛyӰ2\u0013`Ŕ\u000b%aUp\u0011.\u0016K*uߖZԖ-\u0016Wɪxrq\u0006i\r{Cyay1^TT\u0002uݟHą.Z0ֽKXSvr\t-\u0001P\u0011&^\u0019*\u001bxbÑfμ\u0003NfƷ#6L-,d\u007fC'Zs\rub]ʞ\u0018õ*!9Ĝ\u0010'En#oVxgܢ\rŪx\u007f2ХY~\u000e%D-tV\u0014Ԫyڵ(mlܞvWSvZ\bZ\u0013dĸ\u0002և< Fюj(I\u0011KAG\u0013W͈\u000b۰s\u0007!ƺ;]aeB\u0001+\u0003c\u05cbL܊o:{قC/=P\b\u001b\u0006h\u0012ë\bְP'\u0014\u058b6V\r\u0010{V=c\u0003ހ\b¹\"y]ʮP\u0016-g<\u0006$%Vӡ\u0004؝._dǾ'\u007feH>*dp\u001bó\u001aـ|s\u0012\u07bf:$\u0002*sabCQߴkܵB*5ìWQ[/\u0012\u000br\u000f\u001cŰ\nʷ\n);ٚM\u001c]9X+wt$Ҕ/ґ@\u0013{̜\u000b>o~\u0012Gn[\u0001Ƒ\u007f½Xcrݗ>]mYP\u0012;\u000fZ֚\u0004ؒd\u007fh߷h3YA^6\u000bz$ڰ5\u07b4D\u000f,ۋ~N\u001aV\u001e\u0016\\JmтPߢd\u0015\u001bФ\u0018\u007fO\u0014*V*#sǕ.\u074c\n%o߳\u0018Kc?p=g5aǒ\u001d֒9edհ&-Y3C\u0015.l\u0002ʀ\u001aݭB\u001a2ӅV\u001aS4`\u0010rz\u001bٱ@Ԋ40Xڄ+OkQ4\u001fkWk֮QǑf7c۩a7E)\u0007R\u0004%\u0004ӃTК\u0014A!Ѻ[*a\fJ#\"\u000f\bČNţ`I]ޮ>U\u001eVyJO1\\ܡ\u0002ϸOl^̮\u0010%e\u0014\u0017\fN)zʮeۄfg\u001bث^.mXd6\u0005+\u001fÈ,̗jBrؽK\u0001\u001a\u0005$8\u0004\b\u0014ۄc߭ 5Cܪ\u00118<H!G}lRۘ8ݸjtaƲ\u00167\u0004qV1 \u0013:ٛ2֟rQdЙ\u000f#e\u007fX\u00130\u001csü4ҨL)8ļ&o{E\fT\u000f\u00130ی>ơhyzڐ5Jq\u001aTH\u001b\u001b=ߴPݑUDjĻ1|V\u001e(b\u001b.}̅\u001bц\u001d\u0001\tɘ2#\"\u0015\\vQi\n\u0602tۆ&SeՋ\u0018V\u0014l\u0003a&\u0017R֥\u0006Ύ\u0011o4̗e\u0011LF\u000b\u0004\u001b\u0007$܁Vβ32Nۛ\u0011(;;?m\u0017\n\u0001Ċ^Ё\t,vև#]\u0004\u0001\u000bd-%t֭\u0014±=G)ˊS%JjJM\u0007|Eː/ï2{\u000eƨbN\n\u0019\u0005A\"}\nݥDٝ8]&àNu\u0006\u0005%k@i:ˏuԞmb\u0019ѭ~Y\u0006mq<\bZX܆t˙(\b\u001dֲRTB2J\"Q\u0003eբjɺjn\u0001ΕYq\u001a\u0018\ru<\u0018DҫFՑag<ߦ\u000eakh]-]\u000b^ް\u001cԧ\u0003+O؆\u001a\"H:dm$]\u0014ԟhߵ\u000bo\fέ`\u007fnGZ\u0017&m9Ԝ>ϳ\u007fG\u000b̝;e<\u0007rf\u001dZ-T8Э?Ԍ\u0011 \rق\u0004+)/3_xi\u0006(\u0017`ǡ;B"}, d2 = {"\u001ab^:\")KO.~D<6\u0006\u0017>a\t7\n\u0016", "", "u(E", "\u0010Q0'8", "", "\u0010Q0'8&\u001a1\bbdG&Zo\u0013Ce\bZ:\\t\u0006+Yv", "\u0010Q0'8&\u001a1\bbdG&`g)K_\u001c", "\u0010Q0'8&\u001a1\bbdG&`q\u000eEr\"a t", "\u0010Q0'8&\u001a1\bbdG&ih\rEc\u0019[-zxv1Pm%T\u0005/Ih~\u0013\\u(1,*K\u001d\r\u000fD?(jM\u0015", "\u0010Q0'8&\u001a1\bbdG&ih\rEc\u0019[-z\u0005z0Qt\u001cp\f\u001f7Y\u000f\u001bW~(=.\u001aG#}\u000fLJ(fL\u001bHR\u0005608\u0015", "\u0010Q0'8&\u001a1\bbdG&k|\u001aEy\u000e[4", "\u0010Q0'8&\u001a1\bbdG&lu\u0013_e\bo", "\u0010Q0'8&\u001a1\bbdG&lv\u000f_q\bX1dv\tAUm0", "\u0010Q0'8&\u001c/\u0001iVB\u000ee\u0003\u0013D", "\u0010Q0'8&\u001c/\u0002\\ZE&er\u001eI`\fY\u001coz\u00010ii\u001ae\t\u001fB", "\u0010Q0'8&\u001c=\u0002oZK\u001aXw\u0013Oh\u0004b:k\u0007\u0005*iu\u001cd\u0013\u0011;]\u001a\"M\u0003\u001c7,5O\u0013\u0018\u0004HI$m?\u001b.", "\u0010Q0'8&\u001c=\u0002oZK\u001aXw\u0013Oh\u0004b:k\u0007\u0005*iu\u001cd\u0013\u0011;]\u001a&M\t\u001dG2\u001bS\u001f\u0005pWA", "\u0010Q0'8&\u001c=\u0002oZK\u001aXw\u0013Oh\u0004b:k\u0007\u0005*iu\u001cd\u0013\u0011;]\u001a&Q}\u000e;2\u0017S\u001f\u0018\u0004HI$m?\u001b.", "\u0010Q0'8&\u001c=\u0002oZK\u001aXw\u0013Oh\u0004b:k\u0007\u0005*ix\u001cc\u0013\u001fBw\u0004\u0016g\u0005\u000e5.\"G#}", "\u0010Q0'8&\u001c=\u0002oZK\u001aXw\u0013Oh\u0004b:k\u0007\u0005*ix\u001cc\u0013\u001fBw\u0004%gr\u0018<=*K\u001c\t{DP\u0019", "\u0010Q0'8&\u001c=\u0002oZK\u001aXw\u0013Oh\u0004b:k\u0007\u0005*ix\u001cc\u0013\u001fBw\u0004%gy\u00168-(Z\u0010\u0007\u0004bP\u0019nN\u0013*e\u0007", "\u0010Q0'8&\u001c=\u0002oZK\u001aXw\u0013Oh\u0004b:k\u0007\u0005*ix\u001cc\u0013\u001fBw\t\u0013Uu(<##V\u001by\u0004H", "\u0010Q0'8&\u001c=\u0002oZK\u001aXw\u0013Oh\u0004b:k\u0007\u0005*ix\u001cc\u0013\u001fBw\u0010$Q\u0010\u001d-+&R\u0010\rt", "\u0010Q0'8&\u001c=\u0002oZK\u001aXw\u0013Oh\u0004b:k\u0007\u0005*iz\u001ca\f)Sh\u007f$[\u007f\u0017G'\u001ae\u001a}\t", "\u0010Q0'8&\u001c=\u0002oZK\u001aXw\u0013Oh\u0004b:k\u0007\u0005*i{\u001f`\u0012$7m\u000f1Qt(3#/", "\u0010Q0'8&\u001c=\u0002oZK\u001aXw\u0013Oh\u0004b:k\u0007\u0005*i{+j\f\u0015Sc\u007f+", "\u0010Q0'8&\u001d3yZjE\u001bvq\u0019Tc\t_\u001e\\\u0006z1X\b U", "", "\u0010Q0'8& 3\u0003_ZG\n\\\u0003\u0017Ar\"d0h\u0011\u00061iz\u001cX\t#H]\r1Lu\u000f)3\"Z", "\u0010Q0'8&&/\fxeN\u0019Zk\u000bS_\"g0\\\u007f\u0006+^\u0002", "\u0010Q0'8&&7\u0002bbN\u0014vq\u0019Tc\t_\u001e\\\u0006z1X\b\u001bf\u0012\u0011Ha\n g}\u00124*\u001fY", "\u0010Q0'8&)C\u0007at:\nZh\u0018Ty\u000e[4", "\u0010Q0'8&)C\u0007at:\nkl\u0019Ny\fZ:fv\u000bA^m$a\f\u0011H]", "\u0010Q0'8&)C\u0007at:\nkl\u0019Ny\u0017[3o\u0011|'c\b+V\r @Y\u000f\u0017", "\u0010Q0'8&)C\u0007at:\nkl\u0019Ny\u0017o+`\u0011|'c\b+V\r @Y\u000f\u0017", "\u0010Q0'8&)C\u0007at:\nkl\u0019Ny\u0017o+`\u0011\u007f1Xm", "\u0010Q0'8&)C\u0007at:\nkl\u0019Ny\u0017o+`\u0011\u00012Ov", "\u0010Q0'8&)C\u0007at:\nkl\u0019Ny\u0017o+`\u0011\u00074S", "\u0010Q0'8&)C\u0007at:\nkl\u0019Ny\u0018h$z|v;i|\u001c^\u0010\u001c5l\u007f", "\u0010Q0'8&)C\u0007at:\nkl\u0019Ny\u0018i z\tv$`q\u001ch\u001f\u001b9q\u001a&M}\u00194\u001f*K", "\u0010Q0'8&)C\u0007at;\u0010^\u0003\u0013M[\n[:p\u0004}AUm0", "\u0010Q0'8&)C\u0007at;\u0010^\u0003\u0013M[\n[:p\u0004}A^w'p\f\u0015J]\u00071Su\"", "\u0010Q0'8&)C\u0007at;\u0010^\u0003\u001dUg\u0010W-t\u0011\u0006'b|6\\\u0005)", "\u0010Q0'8&)C\u0007at;\u0010^\u0003\u001eIn\u000f[:ov\n6is\u001cj", "\u0010Q0'8&)C\u0007at;\u0019X}\u000f_e\bo", "\u0010Q0'8&)C\u0007at<\bds\u000bIa\u0011u$_\u0011|'c", "\u0010Q0'8&)C\u0007at<\bkh\u0011Ol\u001cu&`\u000b", "\u0010Q0'8&)C\u0007at<\u0013`f\u0015E^\"W\u001eoz\u00010", "\u0010Q0'8&)C\u0007at<\u0016ew\u000fNn\"Y\u001cmu\u00115cv\u001ap\u0004\u0011HY\u001a\u001dM\n", "\u0010Q0'8&)C\u0007at<\u0016ew\u000fNn\"Y\u001cmu\u00115cv\u001ap\u0015#9j\u001a\u001bL\u0010\u0014-7", "\u0010Q0'8&)C\u0007at<\u0016ew\u000fNn\"a t", "\u0010Q0'8&)C\u0007at<\u001cjw\u0019My\u0011e/dwz%K| `\u000e/=\\", "\u0010Q0'8&)C\u0007at=\f\\s)Lc\u0011a:fv\u000b", "\u0010Q0'8&)C\u0007at=\f]d\u001fLn\"d*ozw+Mi+Z\u000f\u001eS[\u0003\u0013V~\u000e4=\u001fJ", "\u0010Q0'8&)C\u0007at=\fch\u001eE^\"W\u001eoz\u00010", "\u0010Q0'8&)C\u0007at=\fcl El\u001cu irs.Ol6\\\u0005)", "5dc\u000fE\b33\u0013ijL\u000fvg\u000fLc\u0019[-t\u0011v0Kj#V\u0004/?]\u0014ui\u001f7WR7z8(\u001ev", "\u0010Q0'8&)C\u0007at=\fcl El\u001cu!g\u0007\u0005*iu\u0018i\u001f\u001b9q", "5dc\u000fE\b33\u0013ijL\u000fvg\u000fLc\u0019[-t\u0011w._{\u001fp\r\u0011Lw\u0006\u0017aT*VLEz0-\u0019rjG", "\u0010Q0'8&)C\u0007at=\fcl El\u001cu!g\u0007\u0005*iu _\u001f\u001b9q", "5dc\u000fE\b33\u0013ijL\u000fvg\u000fLc\u0019[-t\u0011w._{\u001fp\r\u0019Bw\u0006\u0017aT*VLEz0-\u0019rjG", "\u0010Q0'8&)C\u0007at>\u001fku\u000bSy\u000e[4", "\u0010Q0'8&)C\u0007at?\fkf\u0012_n\bi/z\u0006\u0004+Qo\u001cc\u0013/?]\u0014", "\u0010Q0'8&)C\u0007atB\u0015cl\u0018Ey\fc\u001cbv\u00115^\u0002#V\u001f\u001b9q", "\u0010Q0'8&)C\u0007atB\u0015kh\u0018Ty\u0011e/dwz%K| `\u000e/8]\u0007\u0017\\u\r", "\u0010Q0'8&)C\u0007atB\u0015kh\u0018Ty\u0011e/dwz%K| `\u000e/Ch\u007f Mt", "\u0010Q0'8&)C\u0007atB\u0015kh\u0018Ty\u0011e/dwz%K| `\u000e/F]}\u0017Q\u0007\u000e,", "\u0010Q0'8&)C\u0007atE\bij\u000f_c\u0006e)z|v;", "\u0010Q0'8&)C\u0007atG\u0016kl\u0010I]\u0004j$j\u007f\u0011$Kl\u001eV\u001f\u0013Cm\t&g{\u000eA", "\u0010Q0'8&)C\u0007atG\u0016kl\u0010I]\u0004j$j\u007f\u0011%Ri%_\u0005\u001cSa~1Su\"", "\u0010Q0'8&)C\u0007atG\u0016kl\u0010I]\u0004j$j\u007f\u0011&_z\u0018e\t\u001fBw\u0006\u0017a", "\u0010Q0'8&)C\u0007atG\u0016kl\u0010I]\u0004j$j\u007f\u0011+N", "\u0010Q0'8&)C\u0007atG\u0016kl\u0010I]\u0004j$j\u007f\u00115Y}%U\u001f\u00149^{'T\u0005(>\u001f\"[\u0014", "\u0010Q0'8&)C\u0007atG\u0016kl\u0010I]\u0004j$j\u007f\u00115Y}%U\u001f\u001b9q", "\u0010Q0'8&)C\u0007atG\u0016kl\u0010I]\u0004j$j\u007f\u00116Ko", "\u0010Q0'8&)C\u0007atH\u0017\\q)Ul\fu$i\u0011\t'L~ V\u0017/?]\u0014", "\u0010Q0'8&)C\u0007atI\u0019`r\u001cIn\u001cu&`\u000b", "\u0010Q0'8&)C\u0007atI\u001cYo\u0013Cy\u0011e/dwz%K| `\u000e/?]\u0014", "\u0010Q0'8&)C\u0007atK\fZh\u0013V_\u0007u/d~v5^i$a\u001f\u001d=d\u0007\u001b[", "\u0010Q0'8&)C\u0007atK\f]u\u000fSb\"\\ \\\u0006\u00074O\b\u001d]\u0001\u0017G", "\u0010Q0'8&)C\u0007atL\u001bfu#_^\b[+z}z0U\b\"V\u0019/H]\b\"Tq\u001d-", "\u0010Q0'8&)C\u0007atL\u001bfu#_c\u0007u&`\u000b\u00116Ou']\u0001$9", "\u0010Q0'8&)C\u0007atL\u001bfu#_c\u0010W\"`\u0011|'c\b+V\r @Y\u000f\u0017", "\u0010Q0'8&)C\u0007atL\u001bfu#_c\u0016u)`\t};iz\u001cT\u0005\u0019J]~", "\u0010Q0'8&)C\u0007atL\u001bfu#_e\bo", "\u0010Q0'8&)C\u0007atL\u001bfu#_m\u0018X/d\u0006}'ir,d\u0014\u0019:a}\u0013\\y\u00186=!K(\u0018\u0004HI$m?\u001b.", "\u0010Q0'8&)C\u0007atL\u001bfu#_m\u0018X/d\u0006}'is\u001cj\u001f$9e\u000b\u001eI\u0005\u000e", "\u0010Q0'8&)C\u0007atL\u001bfu#_n\fj'`\u0011{7]| W\t\u00135l\u0004!V\u0010\u0014-75Z\u0014\u0006\u007fO=(f", "\u0010Q0'8&)C\u0007atL\u001bfu#_n\fj'`\u0011|'c\b+V\r @Y\u000f\u0017", "\u0010Q0'8&)C\u0007atL\u001bfu#_o\u0016[:rvs8Sm.p\u000b\u0015Mw\u000f\u0017U\u0001\u0015)2\u001b", "\u0010Q0'8&)C\u0007atL\u001cdp\u000bRs\"j s\u0006\u0011-O\u0002", "\u0010Q0'8&)C\u0007atL ef)G_\u0012\\ itv5is\u001cj", "\u0010Q0'8&)C\u0007atM\u0010ko\u000f_e\bo", "\u0010Q0'8&)C\u0007atN\u0015`q\u001dT[\u000fb:o\u0004r%Uq%X\u001f\u001b9q", "\u0010Q0'8&)C\u0007atN\u0015`t\u001fEy\fZ", "\u0010Q0'8&)C\u0007atO\u0010jl\fIf\fj4z|v;", "\u0010Q0'8&,2~xk>\u0019jl\u0019N", "\u0010Q0'8&,B\u0003knX\ncl\rK_\u0007u\u001c^\u0006z1X", "\u0010Q0'8&,B\u0003knX\u0010eg\u000fXy\u000e[4", "\u0010Q0'8&,B\u0003knX\u0017Xj\u000f_c\u0007", "\u0010Q0'8&,B\u0003knX\u001bid El\u0016[:^}z%Um\u001bp\u0001\u0013Ha\n ", "\u0010Q0'8&03uo^>\u001evx\u001cLy\bn/mr", "\u0013U4\u001bG&)@\u0003iZK\u001b`h\u001d_g\u0004n:nz\f'ij0e\u0005#", "", "\u0018R>\u001bR\u001b(M\u0007mgB\u0015^\u0003\u0013N^\bd/z\u0005\u0002#Mm*", "\u001aN6,G\b M\u0004kZ?\u0010o", "\u001b@G,6\u0016'BxgiX\nXu\u000eSy\u0017j'z\u0005v%Yv\u001bd", "\"Q0\u00139\u0010\u001cM\u0007mVM\u001avw\u0012R_\u0004Z:orx", "\"Q8\u0014:\f+A\u0013ZhL\fkv)Fi\u000fZ m", "#R4\u001fR\u0010\u001dM\u0001ZmX\u0013\\q\u0011Tb\"X4ov\u0005", "7r0:TAH\\w~\fb*|", "", "7r0:TAH\\w~\fb*|G+n\t2\u000b<\u0010\u001b!P}", "u(I", "/mS?b0=\u001b'}\u0001&)x\u0017/_\r(\u0003@|%\u0017"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class Constants {
    public static final String BRAZE = "Appboy";
    public static final String BRAZE_ACTION_CLICKED_ACTION = "com.braze.action.BRAZE_ACTION_CLICKED";
    public static final String BRAZE_ACTION_ID_KEY = "braze_action_id";
    public static final String BRAZE_ACTION_INDEX_KEY = "braze_action_index";
    public static final String BRAZE_ACTION_RECEIVER_GEOFENCE_UPDATE_INTENT_ACTION = "com.braze.action.receiver.BRAZE_GEOFENCE_UPDATE";
    public static final String BRAZE_ACTION_RECEIVER_SINGLE_LOCATION_UPDATE_INTENT_ACTION = "com.braze.action.receiver.SINGLE_LOCATION_UPDATE";
    public static final String BRAZE_ACTION_TYPE_KEY = "braze_action_type";
    public static final String BRAZE_ACTION_URI_KEY = "braze_action_uri";
    public static final String BRAZE_ACTION_USE_WEBVIEW_KEY = "braze_action_use_webview";
    public static final String BRAZE_CAMPAIGN_ID = "braze_campaign_id";
    public static final String BRAZE_CANCEL_NOTIFICATION_ACTION = "com.braze.action.CANCEL_NOTIFICATION";
    public static final String BRAZE_CONVERSATIONAL_PUSH_MESSAGE_PERSON_ID_TEMPLATE = "ab_c_mp*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TEXT_TEMPLATE = "ab_c_mt*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_MESSAGE_TIMESTAMP_TEMPLATE = "ab_c_mw*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_PERSON_ID_TEMPLATE = "ab_c_pi*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_PERSON_IS_BOT_TEMPLATE = "ab_c_pb*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_PERSON_IS_IMPORTANT_TEMPLATE = "ab_c_pt*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_PERSON_NAME_TEMPLATE = "ab_c_pn*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_PERSON_URI_TEMPLATE = "ab_c_pu*";
    public static final String BRAZE_CONVERSATIONAL_PUSH_REPLY_PERSON_ID_KEY = "ab_c_rpi";
    public static final String BRAZE_CONVERSATIONAL_PUSH_SHORTCUT_ID_KEY = "ab_c_si";
    public static final String BRAZE_CONVERSATIONAL_PUSH_STYLE_KEY = "ab_cp";
    public static final int BRAZE_DEFAULT_NOTIFICATION_ID = -1;
    public static final int BRAZE_GEOFENCE_MAX_NUM_TO_REGISTER_DEFAULT = 20;
    public static final int BRAZE_MAX_PURCHASE_QUANTITY = 100;
    public static final int BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS = 1000;
    public static final String BRAZE_PUSH_ACCENT_KEY = "ac";
    public static final String BRAZE_PUSH_ACTION_ID_KEY_TEMPLATE = "ab_a*_id";
    public static final String BRAZE_PUSH_ACTION_TEXT_KEY_TEMPLATE = "ab_a*_t";
    public static final String BRAZE_PUSH_ACTION_TYPE_KEY_TEMPLATE = "ab_a*_a";
    public static final String BRAZE_PUSH_ACTION_TYPE_NONE = "ab_none";
    public static final String BRAZE_PUSH_ACTION_TYPE_OPEN = "ab_open";
    public static final String BRAZE_PUSH_ACTION_TYPE_URI = "ab_uri";
    public static final String BRAZE_PUSH_ACTION_URI_KEY_TEMPLATE = "ab_a*_uri";
    public static final String BRAZE_PUSH_ACTION_USE_WEBVIEW_KEY_TEMPLATE = "ab_a*_use_webview";
    public static final String BRAZE_PUSH_BIG_IMAGE_URL_KEY = "appboy_image_url";
    public static final String BRAZE_PUSH_BIG_IMAGE_URL_TOP_LEVEL_KEY = "ab_iu";
    public static final String BRAZE_PUSH_BIG_SUMMARY_TEXT_KEY = "ab_bs";
    public static final String BRAZE_PUSH_BIG_TITLE_TEXT_KEY = "ab_bt";
    public static final String BRAZE_PUSH_BRAZE_KEY = "_ab";
    public static final String BRAZE_PUSH_CAMPAIGN_ID_KEY = "cid";
    public static final String BRAZE_PUSH_CATEGORY_KEY = "ab_ct";
    public static final String BRAZE_PUSH_CLICKED_ACTION = "com.braze.action.BRAZE_PUSH_CLICKED";
    public static final String BRAZE_PUSH_CONTENT_CARD_SYNC_DATA_KEY = "ab_cd";
    public static final String BRAZE_PUSH_CONTENT_CARD_SYNC_USER_ID_KEY = "ab_cd_uid";
    public static final String BRAZE_PUSH_CONTENT_KEY = "a";
    public static final String BRAZE_PUSH_CUSTOM_NOTIFICATION_ID = "n";
    public static final String BRAZE_PUSH_DEEP_LINK_KEY = "uri";
    public static final String BRAZE_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID = "com_appboy_default_notification_channel";
    public static final String BRAZE_PUSH_DELETED_ACTION = "com.braze.action.BRAZE_PUSH_DELETED";
    public static final String BRAZE_PUSH_DELIVERY_ENABLED_KEY = "bz_p_e";
    public static final String BRAZE_PUSH_DELIVERY_FLUSH_MAX_KEY = "bz_p_fx";
    public static final String BRAZE_PUSH_DELIVERY_FLUSH_MIN_KEY = "bz_p_fn";
    public static final String BRAZE_PUSH_EXTRAS_KEY = "extra";
    public static final String BRAZE_PUSH_FETCH_TEST_TRIGGERS_KEY = "ab_push_fetch_test_triggers_key";
    public static final String BRAZE_PUSH_INLINE_IMAGE_STYLE_KEY = "ab_iip";
    public static final String BRAZE_PUSH_INTENT_NOTIFICATION_DELETED = "com.braze.push.intent.NOTIFICATION_DELETED";
    public static final String BRAZE_PUSH_INTENT_NOTIFICATION_OPENED = "com.braze.push.intent.NOTIFICATION_OPENED";
    public static final String BRAZE_PUSH_INTENT_NOTIFICATION_RECEIVED = "com.braze.push.intent.NOTIFICATION_RECEIVED";
    public static final String BRAZE_PUSH_LARGE_ICON_KEY = "ab_li";
    public static final String BRAZE_PUSH_NOTIFICATION_BADGE_COUNT_KEY = "ab_bc";
    public static final String BRAZE_PUSH_NOTIFICATION_CHANNEL_ID_KEY = "ab_nc";
    public static final String BRAZE_PUSH_NOTIFICATION_DURATION_KEY = "nd";
    public static final String BRAZE_PUSH_NOTIFICATION_ID = "nid";
    public static final String BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE = "d";
    public static final String BRAZE_PUSH_NOTIFICATION_SOUND_KEY = "sd";
    public static final String BRAZE_PUSH_NOTIFICATION_TAG = "appboy_notification";
    public static final String BRAZE_PUSH_OPEN_URI_IN_WEBVIEW_KEY = "ab_use_webview";
    public static final String BRAZE_PUSH_PRIORITY_KEY = "p";
    public static final String BRAZE_PUSH_PUBLIC_NOTIFICATION_KEY = "ab_pn";
    public static final String BRAZE_PUSH_RECEIVED_TIMESTAMP_MILLIS = "braze_push_received_timestamp";
    public static final String BRAZE_PUSH_REFRESH_FEATURE_FLAGS = "br_ffr";
    public static final String BRAZE_PUSH_STORY_DEEP_LINK_KEY_TEMPLATE = "ab_c*_uri";
    public static final String BRAZE_PUSH_STORY_ID_KEY_TEMPLATE = "ab_c*_id";
    public static final String BRAZE_PUSH_STORY_IMAGE_KEY_TEMPLATE = "ab_c*_i";
    public static final String BRAZE_PUSH_STORY_IS_NEWLY_RECEIVED = "braze_story_newly_received";
    public static final String BRAZE_PUSH_STORY_KEY = "ab_c";
    public static final String BRAZE_PUSH_STORY_SUBTITLE_JUSTIFICATION_KEY_TEMPLATE = "ab_c*_st_j";
    public static final String BRAZE_PUSH_STORY_SUBTITLE_KEY_TEMPLATE = "ab_c*_st";
    public static final String BRAZE_PUSH_STORY_TITLE_JUSTIFICATION_KEY_TEMPLATE = "ab_c*_t_j";
    public static final String BRAZE_PUSH_STORY_TITLE_KEY_TEMPLATE = "ab_c*_t";
    public static final String BRAZE_PUSH_STORY_USE_WEBVIEW_KEY_TEMPLATE = "ab_c*_use_webview";
    public static final String BRAZE_PUSH_SUMMARY_TEXT_KEY = "s";
    public static final String BRAZE_PUSH_SYNC_GEOFENCES_KEY = "ab_sync_geos";
    public static final String BRAZE_PUSH_TITLE_KEY = "t";
    public static final String BRAZE_PUSH_UNINSTALL_TRACKING_KEY = "appboy_uninstall_tracking";
    public static final String BRAZE_PUSH_UNIQUE_ID = "br_p_id";
    public static final String BRAZE_PUSH_VISIBILITY_KEY = "ab_vs";
    public static final String BRAZE_SDK_VERSION = "32.1.0";
    public static final String BRAZE_STORY_CLICKED_ACTION = "com.braze.action.BRAZE_STORY_CLICKED";
    public static final String BRAZE_STORY_INDEX_KEY = "braze_story_index";
    public static final String BRAZE_STORY_PAGE_ID = "braze_story_page_id";
    public static final String BRAZE_STORY_TRAVERSE_CLICKED_ACTION = "com.braze.action.STORY_TRAVERSE";
    public static final String BRAZE_WEBVIEW_URL_EXTRA = "url";
    public static final long EVENT_PROPERTIES_MAX_SIZE_BYTES = 51200;
    public static final int JSON_TO_STRING_INDENT_SPACES = 2;
    public static final String LOG_TAG_PREFIX = "Braze v32.1.0 .";
    public static final long MAX_CONTENT_CARDS_TTL_SECONDS = 60;
    public static final int TRAFFIC_STATS_THREAD_TAG = 1337;
    public static final String TRIGGERS_ASSETS_FOLDER = "ab_triggers";
    public static final long USER_ID_MAX_LENGTH_BYTES = 997;
    public static final Constants INSTANCE = new Constants();
    private static final boolean isAmazonDevice = Intrinsics.areEqual("Amazon", Build.MANUFACTURER);

    private Constants() {
    }

    public static /* synthetic */ void getBRAZE_PUSH_DELIVERY_ENABLED_KEY$annotations() {
    }

    public static /* synthetic */ void getBRAZE_PUSH_DELIVERY_FLUSH_MAX_KEY$annotations() {
    }

    public static /* synthetic */ void getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEY$annotations() {
    }

    public static final boolean isAmazonDevice() {
        return isAmazonDevice;
    }

    @JvmStatic
    public static /* synthetic */ void isAmazonDevice$annotations() {
    }
}
