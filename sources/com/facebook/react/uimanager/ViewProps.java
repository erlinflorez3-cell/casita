package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.Arrays;
import java.util.HashSet;
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
@Metadata(bv = {}, d1 = {"Я8\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005F4\u0012\u0006\u001anj?[Le^.ZS@\u000fs{:ec$\u007fLC٥\"}8\tWNmgtсZ!¼?\u0006Dw+1OUޯa\u0012\u001d2\u000b\u000bMݪL\b>gźsf\u000b.ݥ!Pz3а\u0019ZM\u001eͮy[K:\u0014vEAF`\u000ee\u0005H\u0014\\̋rӘ\"\\oޮ\u0007Tz`R/Q\u0005@İ!Ϯc0\u0005ձ]Rb+%v\u0010 \u0002¯\n߱\u0019%[ΈW^iD\u001b? ?[ؙyݳ/I{Ɏ\u0007d\u000e\u001a-+}\u000f4ýxػ\tQhϯw7]jcP<*N߅NɁ@\u0004\u0016ͺwT<52f6\u0010\nφEՂDP\nމ\u0013\f\tjN\u0017S\u0002\nچ\fӸjQiݢiZE\u0006\u001d\rL%W͠sƟX\u000ehٽk`\u0006\\IQn?\u001fݗ\\ՒAm\f͏3\u000e8\u0010HG.1R\u0084\u0001ϲ)7cݽs-y\u000f`D\u0016x[¢;רmRPؗrz$EB\t:\\\u001bߦW\u07fbTT`\u008caY*c\u001f}6\u0015vφJ˶%%\u0018ʚ twze]8'\u0006ϐ\n֍rk\u0016ã\njAFic>c)Οf͖@b\r֚7Na\u001er\\V$\tʒ=ݻ{{L\u0088\\\u001f@R\n\u001cb.\bǐ/ČL\u0003&Փ\u0012\t\u0017srh>\u0001+գvғm$|էQ\\j\u0006\bg'K\u0003ʐ3Ę1AYځi2c8\u00014+%]ѯFõKgT܁\u001dx$\rm{N\u0018pߠ$ȠA\u0013\u0017ȯy>\u0010E]L!g(ˮdؠ~|\u0002Ҹ\ft<\u0001 j\u001f.7ʋ\u001dׅX\u0017*Ԯ/~1\"|\u007f(c\u001dڰ\u001aϭX\u000bcŬ\u001a~\u0011tTNf~[țpݵ\u0005o*Ĝ\u00069QC5\u0016&\u0016\u0006֙4ԃmo6Ӡ3\u001b4\u0012}\u0004Zel˸5жa2Cͯ\u001ae\r\\:$\u001b\u0005\u0019ל=͎\fB\u0011ͩ]?V`|p\u0005:$ߙ\u0002̱j\u00074ݸAbiZ+o,6\u0005ʅ|ϵG}\u001c٫\u00141\u001fnkg\u001co\"œ]Ί\u0013\n\u0013֊\u0002z >U \u0005Y9ׅ\u0003Ӓw\u0018>\u05cd\fn\u0013_!$b.\u0013ޑ]ͲXi\u000e؋K\fT\u0004'\u0017`DJİ)ոXxdƇ\u0019\u0011njx!X\u0003U۷\u0006\u038b|59܊>RbU{2/Us͆m˥S~nއ{Pb`3(\u0007\u0003aԼ0ƀM\u0002>ߤ\u00187{\u0014\b\ffA3!\u0019ȸ\u001dʦU\u0011gڻ\u0001j\u0019\u007f|N\u0013xh\u05ed%Ƭ&)\u0007ғM\u001aJ5'\u000bGQIž5υPN\u007f˿\u0014&\u000fC\\)5\u000eSݴ\u0019ɴ1\u0006=σ\u000eUxA?{\u0006U\u0012ւZÙ$'\fȌqhe<~\n\f\u001d\u0011ϊDїf\u0002\u0011ސ!,\u0012]bt!\f\u0005ā\tс\u00063\nՂ/ey(9@U-Cݰ\u0015Ƒlx\u0012ɨ=o|\u0007#\u0003\u00153-ҺA\u0094T\u001d\u0011ް\u001e:!\u000br:?Uvǌc\u05ca\u0018\u0015.˿\u0007\u0014p\\(O\u0012jGը\"ܣ\u0011+7մzm?dj\u001e,!PǨVցX(\u001d͇'YL\u001a!\\\u001bD.Й1Ɉ,d|׃y \u000b5`^?\u0015\u000bПE۠h/?؟og\u001b~x\u00072G \u0095sܳV?#Π\u0003\u0017}`\u000f\u00111<9ߔR̂F\tzυ88;\u007fl=H)0ޅ@҉\u0007&Sԗ\tN\u0016f)\u000e?11߇rۋ`\u001a$ԝ\"?OT)\u0001C:\\˖Yص9jYƚu6\u000f9\u0019\rm{\bː\rތ;r+˄_{)\u0015~;S7<͞yڧ\u0006eRӭ\u001eodMy,w7\u001cɑLߝD\u007f\u0012٪t0\u00145;\u007fs3\u001f߲2ЪDV{ӒT28v\u0007DQICԴFԤ0i ĵ5gouYzB\u001b\u001bò|̘p\u0007Mހ9\u0006\u0019\u0007%EB9eѯ{ط\u001b|\u0018ށBL9\r\u000bM]^4ٱeű\b::݃\u0007\u0006U\u0005q*4/hˮ6ènmY̙`D R%\u0004&3)ϙRѦ!\u0018/֏GRD#\u0011Modaځaľb.JԽ[\u0012$u`\u00170\u007f!߾gΘ7G{ݝ\u0018\u001edD9\u001d?]{̼wڃnGGޟBdK\u0003K\u000b\u001cL/ˉ8ۇ\tU)ɿ57#J\u0003+\\I-Ôl\u008f\\\u0006\u0016Ȋ5T\u001e\u0010\u0011DVo\u0007ߗ\u0003ʒ\u0003ZKיQ(-\nm\u0015\u0014\u0001\tĖ\nׄh\u00113ŋ(z`#;-'\u0004Y\u07b7\u0014ë\u0017\u000b&ҍ\n>1B%1l}^֦\u001cʳ\u0001mQʝSmXpG\u0006m1\u0018٢?ʂi?!ً\u0010\u000b\u001ap?$4\u0015z߳:Ѹm\u000e*ΩSXD(AHy[g\u07b6\u0015ً\u0013z|ޛ~\u0018F(\u001e=4\u00139ɖ\bņc@4ȨA\u0015U#\u0003{XgFќGʡQE3ܲiJ?F)c}ajװ$Ƥ\\>\u001fϪvL!W2\u001dTcRŢ{݉\u001bUkݗ;\u0010b7)iDm@d(t\u0015<'iN>XlGh.VqЭFС\r`xֳ\u0012\u001cpFD'dJAߟSΞOa\u001f֏\bP\u0005}\u007f3h$8Ͱ&Ո)GRԑ^voS-{\f5\rŮB۱\u0001\u0015\r¿7~\u0012I\u001dM^\u0006Bͼ\u0005ծ^@$ޏ+3{F *<\u000eSۚ~͗WRY;o~r];\u001eHC.ټ\u001a̹\u0017\u0003!ڽX>[8\u0013n\u0007^{ӳNރ#\u0012Jۭ\u0006xOT\u00143\u0006s&̫0Г-}qʰp\u0019ys\u001ccx%&ى5ˆa.UǿWeJ<Y\u00028$\u007fͪZƜ+\u0002Pϵ\u001b>0\u0007\u0019\u000fd\u001a!էAޓ)\tm\u05c8\u007f\u0001\u0004rJmlu=ʢ:ӁE=]һOQ;\u0015\n\byKDȡ}Ú\u0012I\u001eΚ X{\\s=\u0003\u0018\tΕBʢ5\u0010{ԛ,N%_ bbm\u0011ߢ\u001aȂ\u0018jSәjftW\u0005v~cfĀhȌ\u0018\u0005Fثy/N\u000fw`\u0016\u0002\u0012ˇCǛ;QMژ[P\u001f\u0013x2l\u0014eǖ+я\u0012\u001b\nܕ\u001cp(\u0002QE'B\"ы.\u0090kcYڲ8Ty\u0015G\n&\u0018\rןR¡=\r{ϥ/AuL!UQ\u0010}Ӓ\"Ɏu0:ϭ.f.\u001es\b<L=Ǥ#֭E\u0007tͣG\u0003\u0001\u0007W\u00150,\u001cگoܞi\u0019oֲ\u0007xIN\u0001S\u0013|tɵ.Ь+0\u0006ւq\u001fO\u0011.\u000eR\nVݿ.ʴSu\tͿ\u0019\u001f\u001a\r[.6\u0016[߬\u001f\u05ee9\nI\u05cc\u0010_~\rCw\u000e`\u0019ѱ_ۚ%(\u0013ěxmz\b\b\u0015V$\u001a\u05cbI˗q\t\u0018\u008f\u001a1\u0017#iv)\u001c\tԊrڹ\u0014?\u0012Ջ3j\u0006v9I^2Jց ֒q}6ŗ@v\u0006V(O >4̺JĔI(\u0018ʟ#G\"[tDU]~ۗiӁ\"\u001f2ſ\u0003\u001a|*3\\\u0017'&z)\u05f7\u0014ī8n=ү\u0011A9\u001e\u0019&/\u0003_զ0̃\u0018>aɮ\u0017p\u001db\u000fPq\u00145ڤ\u0011ƒ\u0001\b9ڭT\u0012YbJ\u001cgKPӕ>ΘD\"2Ʃd0s\n%L~/p֗2Ԭ&9DҫD=\r£\u0010Xj#\u0006\u0006صcۮ\rp9٠\u001aljΥ+v)\u001fmPЀ#\u07baEMvȅj&4͒`O#y\u000fX \u001cӚ?Ҫ)\u0015\u0015\u07b9;\u0019\u0003֫\u001cMq\u000b`\u0001ؿTј(\u0014Jޘ\u0007}Q܀=\u000e\u001cb\u0016K߾5ݕ8.Jގ 7$ؙdf'\u0006s;ݯ4ߞ\u0002:UߔRkW܋\f>#[\rq۵UϬHQ;Ģ4Tcд[%\u000f_?@֧\u0003Ҽyz\u0006\u05f8\u0003~N͇qykdGVɼ{ܾM1:ݬ\\]Zǁ{HI@Na͔d܋6@&Ǖkctͪ3`u\u000b8CѾ\u0017ڂ\u0002\u000enə>K\u001a͝Dn.48sӿ=Ͱwv^ȈcL%Ρ\u0015\u0015~jo<Ԃ8ę'*Nƴ$@oЋVkj=Jmޚ7ɕF\u0014'ďn7bɕ\n#O\u00166tʫ\u001fҶJNMюU;0ɞa@\r\\rFµ\rד\u0005]Nك\f*\u0002Ⱥ_Qq\u000fx.Ļ#ɨ;\u0016\u0013Ӿ\u0003PZߜ]9-\u000e\ri\u0091oԼ\u0017S\nģ}_IߴFq\b\u0006HCӵ\u0001اIi'ʞUE|͵J\u0003\u0016UA.ؠ.٨.@\fяx\"Rݍ%*';@\u0014ضIЮ:'\rے(]rلqb\u001aCm'Ж\nɑI=K͒1h\u007fދ$vJ:\u0013{ܭ\u0002Û\u001e)oͺv\u0002#ߝc$Qg_\u0007ظ#š\u000eiYй`\b\u000b»3.\"\b\u0014\u0018\u074cmˤ%9Oβ\u001a@Cڨ\rhP\u001e\u0001\bеG˸qb`֊\u0003\u0010,˽9\u0011\b\u0019Z;ЃNӡrbNȉ0;Tґ\u000f:-XhNщ{߉$bpקF\u007fgߙ\u0015v'!94̼RܳkEn\u0096ϊQՓ\u001f"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\"z 9[\u0019", "", "u(E", "\u000fB2\u0012F\u001a\"0|e^M vd\rTc\u0012d.", "", "\u000fB2\u0012F\u001a\"0|e^M vf\u0019Lf\bY/d\u0001\u007f", "\u000fB2\u0012F\u001a\"0|e^M vf\u0019Lf\bY/d\u0001\u007fAS|\u001c^", "\u000fB2\u0012F\u001a\"0|e^M vk\u0013Nn", "\u000fB2\u0012F\u001a\"0|e^M vo\u000bB_\u000f", "\u000fB2\u0012F\u001a\"0|e^M vo\u000bB_\u000fb _\u0011s;", "\u000fB2\u0012F\u001a\"0|e^M vo\u0013V_\"h bz\u00010", "\u000fB2\u0012F\u001a\"0|e^M vu\u0019L_", "\u000fB2\u0012F\u001a\"0|e^M vv\u001eAn\b", "\u000fB2\u0012F\u001a\"0|e^M vy\u000bLo\b", "\u000fC9\"F\u001b,MyhcM&jl$Ey\u0017e:az\u0006", "\u000fK8\u0014A&\u001c=\u0002mZG\u001b", "\u000fK8\u0014A&\"Bxfh", "\u000fK8\u0014A&,3\u007f_", "\u000fK;\u001cJ&\u001f=\u0002mtL\nXo\u0013Na", "\u000fR?\u00126\u001b8@tm^H", "\u000fTC\u001c", "\u0010@2\u0018:\u0019(C\u0002]t<\u0016cr\u001c", "\u0010@2\u0018:\u0019(C\u0002]tB\u0014Xj\u000f", "\u0010NA\u00118\u001980\u007fhXD&Zr\u0016Ol", "\u0010NA\u00118\u001980\u007fhXD&\\q\u000e_]\u0012b*m", "\u0010NA\u00118\u001980\u007fhXD&jw\u000bRn\"Y*g\u0001\u0004", "\u0010NA\u00118\u001980\u0003miH\u0014vf\u0019Li\u0015", "\u0010NA\u00118\u001980\u0003miH\u0014vh\u0018Dy\u0015W\u001fd\u0007\u0005", "\u0010NA\u00118\u001980\u0003miH\u0014vo\u000fFn\"h\u001c_z\u00075", "\u0010NA\u00118\u001980\u0003miH\u0014vu\u0013Gb\u0017u-\\uz7]", "\u0010NA\u00118\u001980\u0003miH\u0014vv\u001eAl\u0017u-\\uz7]", "\u0010NA\u00118\u001980\u0003miH\u0014vz\u0013Dn\u000b", "\u0010NA\u00118\u001981\u0003edK", "\u0010NA\u00118\u001983\u0002]t<\u0016cr\u001c", "\u0010NA\u00118\u001983\u0002]t>\u0015[\u0003\u001cA^\fk.", "\u0010NA\u00118\u001983\u0002]tL\u001bXu\u001e_l\u0004Z$p\u0005", "\u0010NA\u00118\u001983\u0002]tP\u0010[w\u0012", "\u0010NA\u00118\u00198:x_iX\nfo\u0019R", "\u0010NA\u00118\u00198:x_iX\u001e`g\u001eH", "\u0010NA\u00118\u00198@t]^N\u001a", "\u0010NA\u00118\u00198@|`]M&Zr\u0016Ol", "\u0010NA\u00118\u00198@|`]M&nl\u000eTb", "\u0010NA\u00118\u00198A\u0004ZXB\u0015^\u0003\u001eYj\bi", "", "\u0010NA\u00118\u00198A\bZgM&Zr\u0016Ol", "\u0010NA\u00118\u00198A\bZgM&\\q\u000e_l\u0004Z$p\u0005", "\u0010NA\u00118\u00198A\bZgM&jw\u000bRn\"h\u001c_z\u00075", "\u0010NA\u00118\u00198A\bZgM&nl\u000eTb", "\u0010NA\u00118\u00198B\u0003it<\u0016cr\u001c", "\u0010NA\u00118\u00198B\u0003it>\u0015[\u0003\u001cA^\fk.", "\u0010NA\u00118\u00198B\u0003itE\f]w)R[\u0007_0n", "\u0010NA\u00118\u00198B\u0003itK\u0010^k\u001e_l\u0004Z$p\u0005", "\u0010NA\u00118\u00198B\u0003itL\u001bXu\u001e_l\u0004Z$p\u0005", "\u0010NA\u00118\u00198B\u0003itP\u0010[w\u0012", "\u0010NA\u00118\u00198E|]iA", "\u0010NC!B\u0014", "\u0010NG,A\u0016'3", "\u0010NG,F\u000f\u001a2\u0003p", "\u0011N;\u00194\u0017,/ueZ", "\u0011N;\u00194\u0017,/ueZX\n_l\u0016Dl\bd", "\u0011N;\u001cE", "\u0011N;\"@\u001585ti", "\u0012HB\u001d?\b2", "\u0013K4#4\u001b\"=\u0002", "\u0013K;\u0016C\u001a\"HxxbH\u000b\\", "\u0013M0\u000f?\f\u001d", "\u0013M3", "\u0014H;!8\u0019", "\u0014K4%", "\u0014K4%R\t\u001aA|l", "\u0014K4%R\u000b\"@x\\iB\u0016e", "\u0014K4%R\u000e+=\u000b", "\u0014K4%R\u001a!@|g`", "\u0014K4%R\u001e+/\u0004", "\u0014N=!R\r\u001a;|en", "\u0014N=!R\u001a\"Hx", "\u0014N=!R\u001a-G\u007f^", "\u0014N=!R\u001d\u001a@|ZcM", "\u0014N=!R\u001e\u001e7zai", "\u0014NA\u0012:\u0019(C\u0002]t<\u0016cr\u001c", "\u0015@?", "\u0016D8\u0014;\u001b", "\u0016H3\u00118\u0015", "\u0017L?\u001cE\u001b\u001a<\bx[H\u0019vd\rC_\u0016i$]z}+^\u0002", "\u0017M2\u0019H\u000b\u001eMyhcM&gd\u000eDc\u0011]", "\u0017RN\u000eG\u001b\u001a1{fZG\u001b", "\u0018TB!<\r2MvhcM\few", "\u001a@H\u001cH\u001b82|kZ<\u001b`r\u0018", "\u001a@H\u001cH\u001b8=\u0002enX\u0017ir\u001aS", "\u001aiPCTuNb\u001d\u0006DA(\u000b\f\u001de\u000f}", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E#|%\u001a5o\u001d\u0012", "\u001aD5!", "\u001aDC!8\u00198A\u0004ZXB\u0015^", "\u001aH=\u0012R\u000f\u001e7zai", "\u001b@A\u0014<\u0015", "\u001b@A\u0014<\u001580\u0003miH\u0014", "\u001b@A\u0014<\u001583\u0002]", "\u001b@A\u0014<\u001586\u0003k^S\u0016ew\u000bL", "\u001b@A\u0014<\u00158:x_i", "\u001b@A\u0014<\u00158@|`]M", "\u001b@A\u0014<\u00158A\bZgM", "\u001b@A\u0014<\u00158B\u0003i", "\u001b@A\u0014<\u00158DxkiB\nXo", "\u001b@G,9\u0016'B\u0013l^S\fvp\u001fLn\ff'dv\u0004", "\u001b@G,;\f\"5{m", "\u001b@G,J\u0010\u001dB{", "\u001bH=\u0016@\u001c&MyhcM&jf\u000bL_", "\u001bH=,;\f\"5{m", "\u001bH=,J\u0010\u001dB{", "\u001bHG,5\u0013\u001e<wxbH\u000b\\", "\u001c@C\u0016I\f87w", "\u001cD4\u0011F&(4ylXK\f\\q)Af\u0013^\u001czt\u0001/Zw*Z\u0014\u0019B_", "\u001cN=\u0012", "\u001cT<\u000f8\u00198=yxaB\u0015\\v", "\u001dM", "\u001dMN\u00194 (C\b", "\u001dO0\u0010<\u001b2", "\u001dU4\u001f9\u0013(E", "\u001e@3\u0011<\u0015 ", "\u001e@3\u0011<\u0015 MuhiM\u0016d", "\u001e@3\u0011<\u0015 MxgY", "\u001e@3\u0011<\u0015 M{hgB!fq\u001eAf", "\u001e@3\u0011<\u0015 M\u007f^[M", "\u001e@3\u0011<\u0015 M\u0001Zg@\u0010e\u0003\u001dP[\u0006_)b\u0011\u0006;Zm*", "\u001e@3\u0011<\u0015 M\u0006b\\A\u001b", "\u001e@3\u0011<\u0015 M\u0007mVK\u001b", "\u001e@3\u0011<\u0015 M\bhe", "\u001e@3\u0011<\u0015 M\n^gM\u0010Zd\u0016", "\u001eN8\u001bG\f+MxoZG\u001bj", "\u001eNB\u0016G\u0010(<", "\u001eNB\u0016G\u0010(<\u0013le:\n`q\u0011_n\u001cf n", " D=\u00118\u00198B\u0003x]:\u0019[z\u000bR_\"j s\u0006\u00074O", " DB\u0016M\f8;xm]H\u000b", " DB\u0016M\f8;\u0003]Z", " H6\u0015G", " N;\u0012", " NC\u000eG\u0010(<", " NF,:\b)", "!B0\u00198&1", "!B0\u00198&2", "!BA\u001c?\u0013", "!G0\u0011B\u001e81\u0003edK", "!S0\u001fG", "\"DB!R\u0010\u001d", "\"DG!R\b%7zg", "\"DG!R\b%7zgtO\fiw\u0013C[\u000f", "\"DG!R\t+3tdtL\u001bid\u001eEa\u001c", "\"DG!R\u000b\u001e1\u0003kVM\u0010fq)Lc\u0011[", "\"N?", "\"Q0\u001bF\r(@\u0001", "\"Q0\u001bF\r(@\u0001xdK\u0010^l\u0018", "\"Q0\u001bF\u0013\u001aBxxm", "\"Q0\u001bF\u0013\u001aBxxn", "$H4$R\n%/\u0007ltG\bdh", "$HB\u00165\u0013\u001e", "%H3!;", "(^8\u001b7\f1", "7r;.l6Nb\u0003\b\u0002r", "", ";`_", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7U\u00129#", ">q^=", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ViewProps {
    public static final String ACCESSIBILITY_ACTIONS = "accessibilityActions";
    public static final String ACCESSIBILITY_COLLECTION = "accessibilityCollection";
    public static final String ACCESSIBILITY_COLLECTION_ITEM = "accessibilityCollectionItem";
    public static final String ACCESSIBILITY_HINT = "accessibilityHint";
    public static final String ACCESSIBILITY_LABEL = "accessibilityLabel";
    public static final String ACCESSIBILITY_LABELLED_BY = "accessibilityLabelledBy";
    public static final String ACCESSIBILITY_LIVE_REGION = "accessibilityLiveRegion";
    public static final String ACCESSIBILITY_ROLE = "accessibilityRole";
    public static final String ACCESSIBILITY_STATE = "accessibilityState";
    public static final String ACCESSIBILITY_VALUE = "accessibilityValue";
    public static final String ADJUSTS_FONT_SIZE_TO_FIT = "adjustsFontSizeToFit";
    public static final String ALLOW_FONT_SCALING = "allowFontScaling";
    public static final String ASPECT_RATIO = "aspectRatio";
    public static final String AUTO = "auto";
    public static final String BACKGROUND_COLOR = "backgroundColor";
    public static final String BACKGROUND_IMAGE = "experimental_backgroundImage";
    public static final String BORDER_BLOCK_COLOR = "borderBlockColor";
    public static final String BORDER_BLOCK_END_COLOR = "borderBlockEndColor";
    public static final String BORDER_BLOCK_START_COLOR = "borderBlockStartColor";
    public static final String BORDER_BOTTOM_COLOR = "borderBottomColor";
    public static final String BORDER_BOTTOM_END_RADIUS = "borderBottomEndRadius";
    public static final String BORDER_BOTTOM_LEFT_RADIUS = "borderBottomLeftRadius";
    public static final String BORDER_BOTTOM_RIGHT_RADIUS = "borderBottomRightRadius";
    public static final String BORDER_BOTTOM_START_RADIUS = "borderBottomStartRadius";
    public static final String BORDER_BOTTOM_WIDTH = "borderBottomWidth";
    public static final String BORDER_COLOR = "borderColor";
    public static final String BORDER_END_COLOR = "borderEndColor";
    public static final String BORDER_END_END_RADIUS = "borderEndEndRadius";
    public static final String BORDER_END_START_RADIUS = "borderEndStartRadius";
    public static final String BORDER_END_WIDTH = "borderEndWidth";
    public static final String BORDER_LEFT_COLOR = "borderLeftColor";
    public static final String BORDER_LEFT_WIDTH = "borderLeftWidth";
    public static final String BORDER_RADIUS = "borderRadius";
    public static final String BORDER_RIGHT_COLOR = "borderRightColor";
    public static final String BORDER_RIGHT_WIDTH = "borderRightWidth";
    public static final String BORDER_START_COLOR = "borderStartColor";
    public static final String BORDER_START_END_RADIUS = "borderStartEndRadius";
    public static final String BORDER_START_START_RADIUS = "borderStartStartRadius";
    public static final String BORDER_START_WIDTH = "borderStartWidth";
    public static final String BORDER_TOP_COLOR = "borderTopColor";
    public static final String BORDER_TOP_END_RADIUS = "borderTopEndRadius";
    public static final String BORDER_TOP_LEFT_RADIUS = "borderTopLeftRadius";
    public static final String BORDER_TOP_RIGHT_RADIUS = "borderTopRightRadius";
    public static final String BORDER_TOP_START_RADIUS = "borderTopStartRadius";
    public static final String BORDER_TOP_WIDTH = "borderTopWidth";
    public static final String BORDER_WIDTH = "borderWidth";
    public static final String BOX_NONE = "box-none";
    public static final String BOX_SHADOW = "boxShadow";
    public static final String COLLAPSABLE_CHILDREN = "collapsableChildren";
    public static final String COLOR = "color";
    public static final String DISPLAY = "display";
    public static final String ELEVATION = "elevation";
    public static final String ELLIPSIZE_MODE = "ellipsizeMode";
    public static final String ENABLED = "enabled";
    public static final String FILTER = "filter";
    public static final String FONT_FAMILY = "fontFamily";
    public static final String FONT_SIZE = "fontSize";
    public static final String FONT_STYLE = "fontStyle";
    public static final String FONT_VARIANT = "fontVariant";
    public static final String FONT_WEIGHT = "fontWeight";
    public static final String FOREGROUND_COLOR = "foregroundColor";
    public static final String HEIGHT = "height";
    public static final String HIDDEN = "hidden";
    public static final String IMPORTANT_FOR_ACCESSIBILITY = "importantForAccessibility";
    public static final String INCLUDE_FONT_PADDING = "includeFontPadding";
    public static final String IS_ATTACHMENT = "isAttachment";
    public static final String LAYOUT_DIRECTION = "layoutDirection";
    public static final String LEFT = "left";
    public static final String LETTER_SPACING = "letterSpacing";
    public static final String LINE_HEIGHT = "lineHeight";
    public static final String MAX_FONT_SIZE_MULTIPLIER = "maxFontSizeMultiplier";
    public static final String MINIMUM_FONT_SCALE = "minimumFontScale";
    public static final String MIX_BLEND_MODE = "experimental_mixBlendMode";
    public static final String NATIVE_ID = "nativeID";
    public static final String NEEDS_OFFSCREEN_ALPHA_COMPOSITING = "needsOffscreenAlphaCompositing";
    public static final String NONE = "none";
    public static final String NUMBER_OF_LINES = "numberOfLines";
    public static final String ON = "on";
    public static final String ON_LAYOUT = "onLayout";
    public static final String OPACITY = "opacity";
    public static final String OVERFLOW = "overflow";
    public static final String POINTER_EVENTS = "pointerEvents";
    public static final String RENDER_TO_HARDWARE_TEXTURE = "renderToHardwareTextureAndroid";
    public static final String RESIZE_METHOD = "resizeMethod";
    public static final String RESIZE_MODE = "resizeMode";
    public static final String ROLE = "role";
    public static final String ROTATION = "rotation";
    public static final String SCALE_X = "scaleX";
    public static final String SCALE_Y = "scaleY";
    public static final String SCROLL = "scroll";
    public static final String SHADOW_COLOR = "shadowColor";
    public static final String TEST_ID = "testID";
    public static final String TEXT_ALIGN = "textAlign";
    public static final String TEXT_ALIGN_VERTICAL = "textAlignVertical";
    public static final String TEXT_BREAK_STRATEGY = "textBreakStrategy";
    public static final String TEXT_DECORATION_LINE = "textDecorationLine";
    public static final String TOP = "top";
    public static final String TRANSFORM = "transform";
    public static final String TRANSFORM_ORIGIN = "transformOrigin";
    public static final String TRANSLATE_X = "translateX";
    public static final String TRANSLATE_Y = "translateY";
    public static final String VIEW_CLASS_NAME = "RCTView";
    public static final String VISIBLE = "visible";
    public static final String WIDTH = "width";
    public static final String Z_INDEX = "zIndex";
    public static final ViewProps INSTANCE = new ViewProps();
    public static final int[] BORDER_SPACING_TYPES = {8, 4, 5, 1, 3, 0, 2};
    public static final int[] PADDING_MARGIN_SPACING_TYPES = {8, 7, 6, 4, 5, 1, 3, 0, 2};
    public static final int[] POSITION_SPACING_TYPES = {4, 5, 1, 3};
    public static final String ALIGN_SELF = "alignSelf";
    public static final String ALIGN_ITEMS = "alignItems";
    public static final String COLLAPSABLE = "collapsable";
    public static final String FLEX = "flex";
    public static final String FLEX_BASIS = "flexBasis";
    public static final String FLEX_DIRECTION = "flexDirection";
    public static final String FLEX_GROW = "flexGrow";
    public static final String ROW_GAP = "rowGap";
    public static final String COLUMN_GAP = "columnGap";
    public static final String GAP = "gap";
    public static final String FLEX_SHRINK = "flexShrink";
    public static final String FLEX_WRAP = "flexWrap";
    public static final String JUSTIFY_CONTENT = "justifyContent";
    public static final String ALIGN_CONTENT = "alignContent";
    public static final String POSITION = "position";
    public static final String RIGHT = "right";
    public static final String BOTTOM = "bottom";
    public static final String START = "start";
    public static final String END = "end";
    public static final String MIN_WIDTH = "minWidth";
    public static final String MAX_WIDTH = "maxWidth";
    public static final String MIN_HEIGHT = "minHeight";
    public static final String MAX_HEIGHT = "maxHeight";
    public static final String MARGIN = "margin";
    public static final String MARGIN_VERTICAL = "marginVertical";
    public static final String MARGIN_HORIZONTAL = "marginHorizontal";
    public static final String MARGIN_LEFT = "marginLeft";
    public static final String MARGIN_RIGHT = "marginRight";
    public static final String MARGIN_TOP = "marginTop";
    public static final String MARGIN_BOTTOM = "marginBottom";
    public static final String MARGIN_START = "marginStart";
    public static final String MARGIN_END = "marginEnd";
    public static final String PADDING = "padding";
    public static final String PADDING_VERTICAL = "paddingVertical";
    public static final String PADDING_HORIZONTAL = "paddingHorizontal";
    public static final String PADDING_LEFT = "paddingLeft";
    public static final String PADDING_RIGHT = "paddingRight";
    public static final String PADDING_TOP = "paddingTop";
    public static final String PADDING_BOTTOM = "paddingBottom";
    public static final String PADDING_START = "paddingStart";
    public static final String PADDING_END = "paddingEnd";
    private static final HashSet<String> LAYOUT_ONLY_PROPS = new HashSet<>(Arrays.asList(ALIGN_SELF, ALIGN_ITEMS, COLLAPSABLE, FLEX, FLEX_BASIS, FLEX_DIRECTION, FLEX_GROW, ROW_GAP, COLUMN_GAP, GAP, FLEX_SHRINK, FLEX_WRAP, JUSTIFY_CONTENT, ALIGN_CONTENT, "display", POSITION, RIGHT, "top", BOTTOM, "left", START, END, "width", "height", MIN_WIDTH, MAX_WIDTH, MIN_HEIGHT, MAX_HEIGHT, MARGIN, MARGIN_VERTICAL, MARGIN_HORIZONTAL, MARGIN_LEFT, MARGIN_RIGHT, MARGIN_TOP, MARGIN_BOTTOM, MARGIN_START, MARGIN_END, PADDING, PADDING_VERTICAL, PADDING_HORIZONTAL, PADDING_LEFT, PADDING_RIGHT, PADDING_TOP, PADDING_BOTTOM, PADDING_START, PADDING_END));

    private ViewProps() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JvmStatic
    public static final boolean isLayoutOnly(ReadableMap map, String prop) {
        ReadableType type;
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(prop, "prop");
        if (LAYOUT_ONLY_PROPS.contains(prop)) {
            return true;
        }
        if (Intrinsics.areEqual(POINTER_EVENTS, prop)) {
            String string = map.getString(prop);
            return Intrinsics.areEqual("auto", string) || Intrinsics.areEqual(BOX_NONE, string);
        }
        switch (prop.hashCode()) {
            case -1989576717:
                if (prop.equals(BORDER_RIGHT_COLOR) && map.getType(BORDER_RIGHT_COLOR) == ReadableType.Number && map.getInt(BORDER_RIGHT_COLOR) == 0) {
                }
                break;
            case -1971292586:
                if (!prop.equals(BORDER_RIGHT_WIDTH)) {
                    break;
                } else if (!map.isNull(BORDER_RIGHT_WIDTH) && map.getDouble(BORDER_RIGHT_WIDTH) != 0.0d) {
                    break;
                }
                break;
            case -1470826662:
                if (prop.equals(BORDER_TOP_COLOR) && map.getType(BORDER_TOP_COLOR) == ReadableType.Number && map.getInt(BORDER_TOP_COLOR) == 0) {
                }
                break;
            case -1452542531:
                if (!prop.equals(BORDER_TOP_WIDTH)) {
                    break;
                } else if (!map.isNull(BORDER_TOP_WIDTH) && map.getDouble(BORDER_TOP_WIDTH) != 0.0d) {
                    break;
                }
                break;
            case -1308858324:
                if (prop.equals(BORDER_BOTTOM_COLOR) && map.getType(BORDER_BOTTOM_COLOR) == ReadableType.Number && map.getInt(BORDER_BOTTOM_COLOR) == 0) {
                }
                break;
            case -1290574193:
                if (!prop.equals(BORDER_BOTTOM_WIDTH)) {
                    break;
                } else if (!map.isNull(BORDER_BOTTOM_WIDTH) && map.getDouble(BORDER_BOTTOM_WIDTH) != 0.0d) {
                    break;
                }
                break;
            case -1267206133:
                if (!prop.equals(OPACITY)) {
                    break;
                } else if (!map.isNull(OPACITY) && map.getDouble(OPACITY) != 1.0d) {
                    break;
                }
                break;
            case -242276144:
                if (prop.equals(BORDER_LEFT_COLOR) && map.getType(BORDER_LEFT_COLOR) == ReadableType.Number && map.getInt(BORDER_LEFT_COLOR) == 0) {
                }
                break;
            case -223992013:
                if (!prop.equals(BORDER_LEFT_WIDTH)) {
                    break;
                } else if (!map.isNull(BORDER_LEFT_WIDTH) && map.getDouble(BORDER_LEFT_WIDTH) != 0.0d) {
                    break;
                }
                break;
            case 306963138:
                if (prop.equals(BORDER_BLOCK_START_COLOR) && map.getType(BORDER_BLOCK_START_COLOR) == ReadableType.Number && map.getInt(BORDER_BLOCK_START_COLOR) == 0) {
                }
                break;
            case 529642498:
                if (!prop.equals(OVERFLOW)) {
                    break;
                } else if (!map.isNull(OVERFLOW) && !Intrinsics.areEqual(VISIBLE, map.getString(OVERFLOW))) {
                    break;
                }
                break;
            case 684610594:
                if (prop.equals(BORDER_BLOCK_COLOR) && map.getType(BORDER_BLOCK_COLOR) == ReadableType.Number && map.getInt(BORDER_BLOCK_COLOR) == 0) {
                }
                break;
            case 741115130:
                if (!prop.equals(BORDER_WIDTH)) {
                    break;
                } else if (!map.isNull(BORDER_WIDTH) && map.getDouble(BORDER_WIDTH) != 0.0d) {
                    break;
                }
                break;
            case 762983977:
                if (prop.equals(BORDER_BLOCK_END_COLOR) && map.getType(BORDER_BLOCK_END_COLOR) == ReadableType.Number && map.getInt(BORDER_BLOCK_END_COLOR) == 0) {
                }
                break;
            case 1349188574:
                if (!prop.equals("borderRadius")) {
                    break;
                } else if (!map.hasKey(BACKGROUND_COLOR) || (((type = map.getType(BACKGROUND_COLOR)) != ReadableType.Number || map.getInt(BACKGROUND_COLOR) == 0) && type == ReadableType.Null)) {
                    if (!map.hasKey(BORDER_WIDTH) || map.isNull(BORDER_WIDTH) || map.getDouble(BORDER_WIDTH) == 0.0d) {
                    }
                }
                break;
        }
        return true;
    }
}
