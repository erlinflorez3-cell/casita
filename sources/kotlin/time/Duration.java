package kotlin.time;

import androidx.exifinterface.media.ExifInterface;
import com.braze.Constants;
import cz.msebera.android.httpclient.message.TokenParser;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.apache.commons.codec.language.Soundex;
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
/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яp\u001d<K!&i\u000eQLш|\u0004O\r8\u000b4E\u0007\":\u0018\u007f\u0007lmA0RiP.X~2\u000f\u0002{<$a9yCI^\"}0ޛWNm\u0001vJp\u000bK\u000f\u001c\u0016\u0001j2O]xs\u0012\u0017˰JoU3UڎE9vt>\u0005&9*8\b\u0011\t\u001a0X\u0018v\tCS\f(0HpPR\u0015M\u000b \u0018ç|6ҵ<֘f~<Xnm:]݊1hzNϲ^p\fSεVX5\r\u000faL,Ë;7\u001b'a\u0006Ori\u0002\u001b? ܵ5l5jCI\"Xf\\\u000eX-+}\u000e$rΟ[ӤŌd\u000e-p]*\u0014f\u001co\u0010z*\u0014l\b\u001cN?H\\Ʀ`Ǩ\bԧ7vx\u001dN\u001bJwPK\u0013adЍU\u0004AwQ\u001b\u0015^(ݩ\u0019ل6ަ˿\u0011 )N|o$m\u001c,-\u001b\u0003ȭ\u00025_\rUH|\u0011 Ƥmׇoç͆.\u00066\u0015\u000e~D'<b=7\nFS%yJ`D\u0016ϸK¢hרmTN\u00110@^O8[$Zr85q^\u001dp.'LJ)MĹ\t˙$^}\u0012/{X\\]@\u0002j{dPʯ.Ϭ;[tD\u001cb\u0002iA\u000fic>5؏z\u0016E\u0017p`!sP0$Z\u000b{h2ʮn\u0012}YR*T @\u001e\n\u001cb\u007fw\u0019Å\u0019J\t}P\u001dE\u0014m;\u0001\u0010-(տ(\u0005o\u0006\u0003dI[jS\bg'\u001dض\u0001b(\u0011O-}$4::hbPɠ\u000b\u0001yeUC\u0015]ZS.u\u0004ݨP\u001a(\u0002i/kПUȶ)ɨ\u0006/K4\u0001N\u001ac \u0011\u0013|(Ҹkl<0 j\u001fݚ'ʋJׅX\u0019(al[k!rk\u0012atکwgbWs>w\u007fIʢ<ӷ7وġ# +m}pEN;/?\u001dDߐD3#.ui\u001e5@ʳ\u000fקsЁנ0e\u001c\\p!&ф:F7q~\u0005\u0011Dn\tܩVY({PxL|CYQs\u001fWиQ\u00155ov\r2\u007f\u0001Xa@9c\u000eE>nXzʸ\u0002\u001ed55\u0017SFwosQ\u0003\u007fZ \u001a\u001a*8ߎ\u0016&C\u0012f]h{@\by\u001e\\7Ks\u0015K7+Ҭ0F\u000e|SZox |\u0006L\u0006\u0006'CR\u0003i]ոX\u0003bHX\u000bf8p#0\u0007%\u0007C \t5ws\u001c7\u001bЖiӛ\u007fR\u07fc\t#rU\u0005e5+RSW\u001aϜ\\\u0003\u0011>k=\u0012\u03825\u00125Am2^,:\u001eӽ+1HyGA):\u0007An\u001a\u0004e͒h\u0001\u0018XbT(\u001c\u000f|\u0003\u0014b~\u001f\u001c)^!vܑ1VTiGI s'F/\r2rsW+<4<ϦASp\u00067\u0002]FK\u007f\u000e&F\u001e\u0014\u00061k\u0006\u0015ҁ\u000eg!,&w\u001cU\u0012\u000b\u0019VF{>L\u0005rP\u001d61\u0016ו9ű\u0012]̒k\u007f)F-*|\u0006PJ\u0007wƠgnigc\u0007KX?D\u0012ns?=\u000b-Ӎ<\u0002\t$H\u0001keh\"\u0010#C'̢:\u0012h\u001b Ui[\u0001mUa3!?|:p_7ݟ\"\b%k\u0006\n0G8\u0017A\\s5t\u001al{p^еbt.V\u0005\u0012/\u0007\r\u0001Nd7\u000bDH\u0003\u001e+\u001ee\u0016eˁ\u0013Պ_\u0006ʚEQ.'7QO\u001bE1)nĬz\u0013\t3prH\tPv\u000b\u007f.\u001bMHZش(\u0016\nY{T\u001bW[VHQ6-י\u0012\u001b5LH&DO*\u001eAWY8)\"\u0011$f\r˲\u000b#;\\aY+\u001d\u0011~\u0007\u0013eqAmJs}aQ˅\u000e6߭]ș:$ˢeT/\u0012\bdZ~[bt\u000eˋ0L;>,\u009bT\t\u0017\u0018٭#<\u0006$00J?\u05fe)w\\n\u0012ؾ[\b,Ħ5|ޕ\"\u0010\u0004\u0007\u074c\tDiFz\u0015`oŮ@\u0013\u0014G\u007fĎ.1rؓD[ˑxSS\u001bҿ\u0013O\u00104Ԉ2ٽ\u0001\u0014Uƌ?9ߝq\u0016FjѼ;+s2;bfD̚FXYXAЯ\u0016XiÔi{˹^XG ԥ\f\u001cw_S'\u0005Ѧ!\u001b-֡uT9%\b[ڼa#@=%%3̚\u0010\u000e\f\u07fb-V\u001aJ\u000fX\u008b\u0014+4u؞@\u000e&\u0382\u007f%#ǤZ3͂$0\u000eUʹT\nYkم2;rXճ4}\\3\u0011QRj+#ʏiC.u]ð\u001e.^Ư\rSőGX`\u0007ؽ'\u00060^ߣ\u0001\u0004hְ\\\u0019\u001cMx\u001cǝؠ}ƮĲ;_jʉ*EǪm\u001bh1٥w\u001a\u0003>Ý_ҁ\u000bδRդߊ'v\u0013Я=\n\u000b%\u0013cߋla\u00111ˏII54ܹ.*LKɿdo\u001eeĂ}$ U+6\u00182\u008df+i<)\u0010\bZݜUAHy`AlPج\u000e\u0013u:ˣ\u000bhZ\u0014ܗ\u0005)bJ\t\u0002_ޱ02vŉF]Ȑzzw}j\rY{җa:\u05f5=Ѹ߄\u0015gga\u001as__)V%]>@A\tP[|Ɂ}ž-:'Wiux|lb\u0017cBv\u0001|\b~~dlpt\u0001\u001fԷ\u001b˃S\b+SJp\u0017i\tJG\u001fp||?DY\u0003\u0019/\u000e\u0002&m֗9ޑz-w5@4o+k_+ZX\u0016^\u0003o\f-{\f@lQFۖ~В\tHvt\n\u0002\u0013VH\u0006qE@V+X*Dr'\u001cu>nd۰~۶0xcTW\u000e-{|\u0001)7(Q(QU;+\u0003GI>v$ó|ѯ\\f50\u0002!-\u001bZ};\tO\u0004LKe\u000fg4\f+_B@ʸ\"ɋo\u001c\u0014ePA]rz\u0013cM[\bWqJyY\u00028/_h^Ɓ)݀L>Z4(D\u000f\u0018N\u001aP\t|\tu\u0018s/Gt$\u000fh2Ӈwjui:eKX.\u000eSRGq6L\u007f2Ƚ/K&K\u001c`]O>\u0005idl\u0016`\b&Hϐ\u0014wx]H?\u0006\u000b3Cyc\u0014G1\u0015!\u0010Ӽ\u001e^~pr!^d`L$8,\u0005lt_gկ)cxi\u0006g\u0017smF_r|\u000br\u0012^%ԑB\u0016'J^\u0015\u001c\u001eR\u0014Y\u00142\u0016gF/\u0005ѽ\u0019_\u001cii\u00020j\u0019\u00046`\"wD=S>\fܘ\u000f¡ThEid;c,&)t\u0003\u0016|\u0001JU\u0012r ]b>L!ڑNɄ\u0011K\u0017n4,\u0005{/A\u001b88Pr)Qe1g37CԠ_ՐWd\u0003ʉ?si^H}4(I\u007fuָ\u0010ȑ\f\n\u0005]:\b\u0004\nXJ\u0019E(N~\u001a\"?}L3p@\u0002\b،Uɷ\u001d/\u0010ad~\u0013Ju46I0(\u0010sIԡ\u0015~ɛEקz\u001f\u0006\u000b\u0016[W0Y?_7\u0013\u001a`\u0011V\u0016fк\fծfb\u0010\u0002'\u000b>3ǂ\bMւl}\\kЭj\u0001f\u0010U\u0011D`\u0005Ձfs'Վ*͵:"}, d2 = {"\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "", "@`f#T3NS", "", "1n]@g9NQ(\t\b&0\u0005\u00146", "uI\u0018\u0017", "/ab<_<MS\nz\u0002n,", "5dc\u000eU:HZ)\u000ezO(\u0004\u0019/-o:\u0010*S\"\u0015", "6nd?f\nH[$\t\u0004^5\f", "", "5dc\u0015b<Kav\t\u0003i6\u0006\t8t>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "u(E", "5dc\u0015b<Kav\t\u0003i6\u0006\t8tG,\u0004K\b", "uI\u0018\u0016", "7m3.l:", "", "5dc\u0016a\u000b:g'=vg5\u0007\u0018+t\u00042\u0005N", "5dc\u0016a\u000b:g'F~f7\u0004", "uI\u0018\u0011", "7m7<h9L", "5dc\u0016a\u000fHc&\r9Z5\u0006\u0013>a\u000f,\u0006I\u000f", "5dc\u0016a\u000fHc&\rBb4\b\u0010", "7m<6V9Ha\u0019|\u0005g+\u000b", "5dc\u0016a\u0014BQ&\t\t^*\u0007\u0012.s>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc\u0016a\u0014BQ&\t\t^*\u0007\u0012.sG,\u0004K\b", "7m<6_3Ba\u0019|\u0005g+\u000b", "5dc\u0016a\u0014BZ \u0003\t^*\u0007\u0012.s>$\u0005I\u000b&\u0013Vs\u0018E\u0005", "5dc\u0016a\u0014BZ \u0003\t^*\u0007\u0012.sG,\u0004K\b", "7m<6a<MS'", "5dc\u0016a\u0014B\\)\u000ezljx\u00128o\u000f$\u000bD\u000b %", "5dc\u0016a\u0014B\\)\u000ezls\u0001\u0011:l", "7m=.a6LS\u0017\t\u0004]:", "5dc\u0016a\u0015:\\#\rz\\6\u0006\b=${1\u0005J\u0010\u0013&Ky\u0017J", "5dc\u0016a\u0015:\\#\rz\\6\u0006\b=-\u00040\u0007G", "7mB2V6GR'", "5dc\u0016a\u001a>Q#\byljx\u00128o\u000f$\u000bD\u000b %", "5dc\u0016a\u001a>Q#\byls\u0001\u0011:l", "7mF5b3>2\u0015\u0013\t", "5dc\u0016a\u001eA] ~YZ@\u000bP3m\u000b/", "7mF5b3>6#\u000f\bl", "5dc\u0016a\u001eA] ~]h<\n\u0017vi\b3\u0003", "7mF5b3>;\u001d|\bh:|\u00079n~6", "5dc\u0016a\u001eA] ~bb*\n\u0013=e}2\u0005?\u000f^\u001bOz\u0015", "7mF5b3>;\u001d\u0006\u0002b:|\u00079n~6", "5dc\u0016a\u001eA] ~bb3\u0004\r=e}2\u0005?\u000f^\u001bOz\u0015", "7mF5b3>;\u001d\b\u000bm,\u000b", "5dc\u0016a\u001eA] ~bb5\r\u0018/sG,\u0004K\b", "7mF5b3><\u0015\b\u0005l,z\u00138d\u000e", "5dc\u0016a\u001eA] ~cZ5\u0007\u0017/c\n1zNH\u001b\u001fRv", "7mF5b3>A\u0019|\u0005g+\u000b", "5dc\u0016a\u001eA] ~h^*\u0007\u0012.sG,\u0004K\b", ";h]Bg,L1#\u0007\u0006h5|\u0012>", "5dc\u001a\\5Nb\u0019\rXh4\b\u00138e\t7:<\n !Vk\u001d@\u0001.C", "5dc\u001a\\5Nb\u0019\rXh4\b\u00138e\t7CD\t\"\u001e", "<`]<f,<]\"}\t<6\u0005\u00149n\u007f1\u000b", "5dc\u001bT5Ha\u0019|\u0005g+\u000bf9m\u000b2\u0005@\n&UCx\u0017F\u0006!D]\b)E", "5dc\u001bT5Ha\u0019|\u0005g+\u000bf9m\u000b2\u0005@\n&^Kw\u0019C", "AdR<a+L1#\u0007\u0006h5|\u0012>", "5dc X*H\\\u0018\rXh4\b\u00138e\t7:<\n !Vk\u001d@\u0001.C", "5dc X*H\\\u0018\rXh4\b\u00138e\t7CD\t\"\u001e", "As^?T.>C\"\u0003\n", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006Ip \u001bVE", "5dc g6KO\u001b~jg0\fP3m\u000b/", "uI\u0018\u0019^6MZ\u001d\bDm0\u0005\txD\u00105wO\u0005! 7x\u0012KL", "CmXA70LQ&\u0003\u0003b5x\u00189r", "5dc\"a0M2\u001d\rxk0\u0005\r8a\u000f2\t\b\u0005\u001f\"N", "D`[BX", "5dc#T3NS`\u0003\u0003i3", "/cS#T3NS'f~q,{u+n\u0002(\n", "BgX@@0EZ\u001d\r", "=sW2e\u0015:\\#\r", "/cS#T3NS'f~q,{u+n\u0002(\n\bp)+1B\u0019:", "uI9\u0017\u001c\u0011", "1n\\=T9>B#", "=sW2e", "1n\\=T9>B#FaK\u000b\u000br\u0014o", "uI9u<", "2he", "AbP9X", "2heyH>R=k\nx", "uI3u=", "uI8u=", "2hey?\u0019\u001da\u0003c\u0005", "uI9u7", "3pd._:", "", "", "3pd._:\u0006W!\n\u0002", "uI;7T=:\u001d z\u0004`uf\u00064e}7Q\u0004u", "6`b566=S", "6`b566=S`\u0003\u0003i3", "7r56a0MS", "7r56a0MS`\u0003\u0003i3", "uI\u0018'", "7r8;@0EZ\u001d\r", "7r8;@0EZ\u001d\rBb4\b\u0010", "7r8;A(G]'", "7r8;A(G]'F~f7\u0004", "7r8;Y0GW(~", "7r8;Y0GW(~Bb4\b\u0010", "7r=2Z(MW*~", "7r=2Z(MW*~Bb4\b\u0010", "7r?<f0MW*~", "7r?<f0MW*~Bb4\b\u0010", ";h]Bf", ";h]Bfs%@w\rdC6", "uI9u=", ">kd@", ">kd@ \u0013+2'h_h", "Bh\\2f", "Bh\\2fs.e-hMi*", "Bn2<`7H\\\u0019\b\nl", "\"", "/bc6b5", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001385U", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "2`h@", "6nd?f", ";h]Bg,L", "AdR<a+L", "<`]<f,<]\"}\t", "Bn2<`7H\\\u0019\b\nls\u0001\u0011:l", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bMuzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001384U", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bLuzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001383U", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bKuzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "uI;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bJuzT\u001b*^?\u0005r0'\u00172K6\fc*]L", "Bn3<h)ES", "CmXA", "Bn3<h)ES`\u0003\u0003i3", "uI;8b;EW\"H\nb4|R\u000eu\r$\u000bD\u000b \u0007Ps\u001d\u0012:\u0004", "Bn8;g", "Bn8;gsB[$\u0006", "uI;8b;EW\"H\nb4|R\u000eu\r$\u000bD\u000b \u0007Ps\u001d\u0012:\t", "Bn8@b\u001aM`\u001d\b|", "", "Bn8@b\u001aM`\u001d\b|&0\u0005\u00146", "uI\u0018\u0019](OOb\u0006vg.Fv>r\u00041}\u0016", "Bn;<a.", "Bn;<a.\u0006W!\n\u0002", "uI;8b;EW\"H\nb4|R\u000eu\r$\u000bD\u000b \u0007Ps\u001d\u0012:\n", "Bn;<a.&W \u0006~l,z\u00138d\u000e", "Bn;<a.&W \u0006~l,z\u00138d\u000eo\u007fH\f\u001e", "Bn;<a.'O\"\t\t^*\u0007\u0012.s", "Bn;<a.'O\"\t\t^*\u0007\u0012.sG,\u0004K\b", "BnBAe0GU", "BnBAe0GU`\u0003\u0003i3", "2dR6`(Ea", "uI;8b;EW\"H\nb4|R\u000eu\r$\u000bD\u000b \u0007Ps\u001d\u0012Zh\u001c^y137\u001d*VE\u0005YC+\u0019qc\u000f", "Bqd;V(MS\b\t", "Bqd;V(MS\b\tBN>\u0011r\u0002p}f\u0002J\u0010\u001e\u001bPi\u001cKu,9V", "CmP?l\u0014B\\)\r", "CmP?l\u0014B\\)\rBN>\u0011r\u0002p}", "/o_2a+\u001f`\u0015|\nb6\u0006\u00056", "", "\u001aiPCTuEO\"\u0001DL;\n\r8g\\8\u007fG\u007f\u0017$\u001d", "\u001aj^A_0G\u001d(~\u000emuj\u0018<i\t*XP\u0005\u001e\u0016G|c", "Eg^9X", "4qP0g0H\\\u0015\u0006", "4qP0g0H\\\u0015\u0006hbA|", "7r^'X9HS'", "/o_2a+\u001f`\u0015|\nb6\u0006\u00056-\u00040\u0007G", "uI;7T=:\u001d z\u0004`uj\u0018<i\t*XP\u0005\u001e\u0016G|c Z\t\u001c^y137\u001d*VE\u0005YC+\u0019qc\u000f{'\u001d", "\u0011n\\=T5B]\"", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@JvmInline
public final class Duration implements Comparable<Duration> {
    private final long rawValue;
    public static final Companion Companion = new Companion(null);
    private static final long ZERO = m10306constructorimpl(0);
    private static final long INFINITE = DurationKt.durationOfMillis(DurationKt.MAX_MILLIS);
    private static final long NEG_INFINITE = DurationKt.durationOfMillis(-4611686018427387903L);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я>\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005(4\u0012\u0006\u000bnj?2LeV4ZS0\u000fs{B+c$wXCU0}*\tUTog|Vb\u000bI\u0017\fǤy\u0001ߚyU'\\R\u00148BņC3[o\u0006Wn\u001dN\u0005N=R<\b.\u0019\u001aXS@z\tmc\f@[ptH~%M3EX\u000b\u00078\u000f(tg|8xpkcG#1t\tSф^ܞƊQ\u000fL\u00025\u001c?y,5X7c\u0017UW\u00110j[m\u0013\u0006vޮ\u0004ؒҊ+-O!eH!\u0018\"\u001fCO;_#*j.i`::qTԣJִˎ,y\u0001)\u001bQL&\u0014=`.[\u001c\u0017\f\u001c\\\rr\u0002K\u0017\u0007\u0081Aȕѐe8\u001dS\u000eBsQ)|iai\u001b~;\n.%\u001eQ\u00115&ǵSו\u05ce\u0019\u001dZ&_C\u001aXK^f\n\b?\u001e\b~\f\u001a*2C\u000e\u0005ôz߾ѧ\u001b'=\nG8i\u0004\u0010a\\g%\u0007\u0011la\u0013jHn-5\u001b\u05ec)\u009eɔ^Fj4y_\u001dp:*e\u001c\u0003\t.\f!Itwj1k\u0015̓NŖȬnOc93A/Og\b\u0004\u000e\u0006;\u000f7Cz{\u0010\u0010e=\u0019ά;ϵۖ\\hH\u0003\u001ao%@0N`j>y,H\\5+2m|b9в0ǉÅ\u0019J\tNPPE!mv\u0001\u0010-Vc(\u0011\u0013<t7\u0011\u0017a̒nΟ֑M.\u0003\u00110?\niC5>UPjd\u000110\u0017s.Z.QݺK˾טyW\u0002P$/\u0002i=\\+\u000f-+b\u0006;ndr\u0014\\\u0014\u0017ٶy۠ɍ\u0013=n_u\u00173\t:\u007f\u0003J}VG&\u0005\b\u000b#6tF~ՌEکĕgV\u0011\rL[;\u001bg[f8+\u0007O\"3*\b\"+HsHܨ\u001cȶ߳\u00181\u001b\u0013k~8F\b\u0005'&#g40q?\bb\u007fhx@ϨHʲ˽B$*\u001f\u0011Q\u0011\u0003\u0006*Z\tb\u000fcLO\u000e\tVf]Q4·e߿Ր\u0011r\\\u000eH%8\u0016BPw*\"E.\u0018ll=\u0011{f.r¦JŌ\u05c8N\u0011\u0010=\nF7(*p8V\u0006d94\u0014\u001d06ooڙ\u0004µʢ(62q\u0016A\fjw=(z.H\u0010\u0013%[Zsi\u000b\u05ceSۿחZJ\u000b\u0019S\u0017i@\u000f8'54wc35qT}Gc`5Ԯ\u001c̿ƨnO\u0005!mAR\u0010Q\u001d>W/\ruaQr\u001a62{՜l ƴ\u00108\u001e9eZ&@QQ?a'4l4md|o=\u0017ٟQƉĀ-\u0001\u0001:\u001cKR'\u0019>gr\u001ed]P\\!OCH\u0011]Iρ\u0006љƔgH!j\u0014GuUW\u0010,'*Y\u0004?\f18 U\u0017;&ȱVʪҁ\u000e_!w$\u0007fv\u0010\n+PN\u0006ͱIƓҽ\u000e6\u00106]\u0007K\u0004\u0019agoH8N-Cl4D\"ЖzǶbؙ̼r]\u0013\u0003t6n{t4^!Y;[6+X\t<ŇRݰǨ\u0015\b\u001c\u00154$N\nh2\u001eS4\t~ug[;-WkXlgďRtݡ!ߐtâցX2%=\\YLq!^rPe\u001d/\u000b6n\r\fW\u0016%~vnGԉ4\u001dݹ Ԅ.Юق#e\u001dIf\u0013\u0012Va('?`QkW@\u0015\b(%\u0013+:\u0011\b6̦B_ۊ\u0002ٕ+ߠĘXG*)_0{x\u001b(QSFWXL\u001f$)/\t:H>\u000b%RդQ\n\u0086\u001b\u05ff\u007f́Ƭ\ny\u0017\u001b;\u0002_`=,\u0007\u0015\u000f\u001c\u0010\u001a?\u0002RsetK/=\u007fQ˷f\u0012ì7؆Kھڧ\u0006oZ\u0001Szd y.OMS0JuN\u0016\"\u001fR&.uQ\u0013{̀H\u0001ث^ɷU؛ӵ\b0:8t[1[\u0005zy\":~h\u0014rty4o|<\u0019rI`̼l]ŽÓxޠް\u0011O$9\u0015 7@/~\u0016j\u007fO{i\u0001fG\\\f>;s2Jhފ6PáBŦ)ƊЯ\u0016^slp\b_p(:\u0018(\u001b\u0016HQ`y\u0018`K\u001aOK%Yl̮x$ڱd\u0089?ǃľb8R\u000e\u0011 $B`\u0019\b\u0019Xue3Ac\fAu\u0014~{O(Gي%\\ȿiëFʤ߂ubM;9({Wp7kz\u0013dqkrG-\u007f\u0019-VG\u0005NP³X\\ڎGƲGϡͭ|N8o6M>a\u0017\\I{\u000f.o]c1}~`d_[\u0013$aƒWEָWȣ,Ҽ߲\u0007\u001aQ\u001b\u0019(,gQ4)\u0012\u001bF\u000f\u001c\u0016{aU+oq\u00101l\u0001ŋ/\\ܢ1юJАʂiI)YE\u001f\u001a-?&\f42q83w-:_1N^VWX\u0002ą\u0011=ަlڶyǞ\u07be2\u0016HW\f]\u0014\"z\u001e;\\mR|N~(_O\u0019}Re\u001ey+˅M\u001cΖw\u05f5=Ѹ߄\u0015m_a\u001a\u000f_pp@\u001dx4Uc\"(?>a*JQ0E`\u001aޞjJ؋b٫Xۅɬ4n\ntl\bLpV>N\u0011'u \u001e)s\\b7b\u0019Ho \u0019ܱ,}̆JҜ\u0018ɮΞOk'\u0016=g\u00054\u007f5@Fo4$}3ib\u0006<l\nwC\u000f\u0014֬6cѭ.ΐ\u0014џâj|\u0014n\u000bp>\u0018\u000418jhUlMhL\u0006h6,6\f+\u0010bͻS)ދwڮqՌ֜'(*C]_U.+\u0005\u001fc\u0016A\u001ex\t\u0014p\\S0$\u0006M\"xܴ5C͒uۻ2ݞƖS>m /$w\t8\u000fq9\u0012u\u001bC]\u000fz\u0011\f0uw5lrִAX܇$̯#ǉƜ+\fX6PX07\u0019\u0011<?X{Óx'\u0011e\u0012NܛyL"}, d2 = {"\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006I?t!Oz\nEz/>/", "", "u(E", "\u0017M5\u0016A\u0010-3", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006IV", "5dc\u0016A\r\"<|mZ&\u001c\u000f\u001d\u00198\u000b&", "u(9", "\u0018", "\u001cD6,<\u0015\u001f7\u0002bi>", "5dc\u001b8\u000e87\u0002_^G\u0010khvU\u0012<e\u0013\f\u0015UMy\u001dCz./g\r\u001f>q\u0013", "(DA\u001c", "5dc'8\u0019(\u001b\t\u0011\u000fH~\b\u0007", "2`h@", "", "5dc\u0011T@L\u001b\t\u0011\u000fH~\b\u0007ma\t1\u0006O|&\u001bQx\u001c", "uC\u0018#", "5dc\u0011T@L\u001b\t\u0011\u000fH~\b\u0007", "uC\u0018\u0017", "", "uH\u0018#", "uH\u0018\u0017", "", "uI\u0018#", "uI\u0018\u0017", "6nd?f", "5dc\u0015b<Ka`n\rr\u0016O\u0014-${1\u0005J\u0010\u0013&Ky\u0017J", "5dc\u0015b<Ka`n\rr\u0016O\u0014-", ";hR?b:>Q#\byl", "5dc\u001a\\*K]'~xh5{\u0017vU\u0012<e\u0013\f\u0015UCx\u0017F\u0006!D]\b)E", "5dc\u001a\\*K]'~xh5{\u0017vU\u0012<e\u0013\f\u0015", ";h[9\\:>Q#\byl", "5dc\u001a\\3EW'~xh5{\u0017vU\u0012<e\u0013\f\u0015UCx\u0017F\u0006!D]\b)E", "5dc\u001a\\3EW'~xh5{\u0017vU\u0012<e\u0013\f\u0015", ";h]Bg,L", "5dc\u001a\\5Nb\u0019\rBN>\u0011r\u0002p}fwI\n!&C~\u0012F\u007f3", "5dc\u001a\\5Nb\u0019\rBN>\u0011r\u0002p}", "<`]<f,<]\"}\t", "5dc\u001bT5Ha\u0019|\u0005g+\u000bP\u001fw\u0014\u0012NK~U\u0013Px\u0018Kr49c\u0007.", "5dc\u001bT5Ha\u0019|\u0005g+\u000bP\u001fw\u0014\u0012NK~", "AdR<a+L", "5dc X*H\\\u0018\rBN>\u0011r\u0002p}fwI\n!&C~\u0012F\u007f3", "5dc X*H\\\u0018\rBN>\u0011r\u0002p}", "1n]CX9M", "D`[BX", "And?V,.\\\u001d\u000e", "\u001aj^A_0G\u001d(\u0003\u0003^u[\u0019<a\u000f,\u0006Ip \u001bVE", "B`a4X;.\\\u001d\u000e", "2`h@ \u001cPg\u0003Q\u0006\\", "6nd?fs.e-hMi*", ";hR?b:>Q#\bylsl\u001bCOR3y", ";h[9\\:>Q#\bylsl\u001bCOR3y", ";h]Bg,L\u001b\t\u0011\u000fH~\b\u0007", "<`]<f,<]\"}\t&\u001c\u000f\u001d\u00198\u000b&", ">`a@X", "", ">`a@Xs.e-hMi*", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?%", ">`a@X\u0010L]\u0007\u000e\bb5~", ">`a@X\u0010L]\u0007\u000e\bb5~P\u001fw\u0014\u0012NK~", ">`a@X\u0010L]\u0007\u000e\bb5~r<N\u0010/\u0003", ">`a@X\u0010L]\u0007\u000e\bb5~r<N\u0010/\u0003\ba\u0019\u001a7A_\u000b", ">`a@X\u0016K<)\u0006\u0002", ">`a@X\u0016K<)\u0006\u0002&\r~\f\u001f7Qv", "AdR<a+L\u001b\t\u0011\u000fH~\b\u0007", "9nc9\\5\u0006a(}\u0002b)"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m10362getDaysUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.DAYS);
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m10363getDaysUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.DAYS);
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m10364getDaysUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.DAYS);
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10365getDaysUwyO8pc$annotations(double d2) {
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10366getDaysUwyO8pc$annotations(int i2) {
        }

        /* JADX INFO: renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10367getDaysUwyO8pc$annotations(long j2) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m10368getHoursUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.HOURS);
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m10369getHoursUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.HOURS);
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m10370getHoursUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.HOURS);
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10371getHoursUwyO8pc$annotations(double d2) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10372getHoursUwyO8pc$annotations(int i2) {
        }

        /* JADX INFO: renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10373getHoursUwyO8pc$annotations(long j2) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m10374getMicrosecondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.MICROSECONDS);
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m10375getMicrosecondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.MICROSECONDS);
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m10376getMicrosecondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.MICROSECONDS);
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10377getMicrosecondsUwyO8pc$annotations(double d2) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10378getMicrosecondsUwyO8pc$annotations(int i2) {
        }

        /* JADX INFO: renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10379getMicrosecondsUwyO8pc$annotations(long j2) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m10380getMillisecondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m10381getMillisecondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m10382getMillisecondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.MILLISECONDS);
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10383getMillisecondsUwyO8pc$annotations(double d2) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10384getMillisecondsUwyO8pc$annotations(int i2) {
        }

        /* JADX INFO: renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10385getMillisecondsUwyO8pc$annotations(long j2) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m10386getMinutesUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.MINUTES);
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m10387getMinutesUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.MINUTES);
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m10388getMinutesUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.MINUTES);
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10389getMinutesUwyO8pc$annotations(double d2) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10390getMinutesUwyO8pc$annotations(int i2) {
        }

        /* JADX INFO: renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10391getMinutesUwyO8pc$annotations(long j2) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m10392getNanosecondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m10393getNanosecondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m10394getNanosecondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10395getNanosecondsUwyO8pc$annotations(double d2) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10396getNanosecondsUwyO8pc$annotations(int i2) {
        }

        /* JADX INFO: renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10397getNanosecondsUwyO8pc$annotations(long j2) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m10398getSecondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.SECONDS);
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m10399getSecondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.SECONDS);
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m10400getSecondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.SECONDS);
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10401getSecondsUwyO8pc$annotations(double d2) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10402getSecondsUwyO8pc$annotations(int i2) {
        }

        /* JADX INFO: renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m10403getSecondsUwyO8pc$annotations(long j2) {
        }

        public final double convert(double d2, DurationUnit sourceUnit, DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt.convertDurationUnit(d2, sourceUnit, targetUnit);
        }

        @Deprecated(message = "\u0018Y\u0001t8X$lZS-HT\u0016Ea#\f\u000e?\u0019m\u001ae\u007fU|*^\u00073vm^x[\rbzHS]\u0017O$W`\u00031f\u0016\u001etKD\u0013\u001aP#RZ\u007fB\u0015\u0007\u0011p;i", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10404daysUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.DAYS);
        }

        @Deprecated(message = "\u0018Y\u0001t8]#k&K)\u0014c[kSt`\u000e5\u0018q\u001b`6V\u0001y^y6z\u0002\fjT\\i(\u001d[04N\u001beZG\u0005gUKfL=!\u001a\u0007\u001dR.\u000b9\u0003vY", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10405daysUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.DAYS);
        }

        @Deprecated(message = "\u0018Y\u0001t8`$e_\u0015,{i(r\u000ead\u001d,\u0013{\u0015a\u0005\u0006~|]\u0005)x|e$H_kux*3E;&_[\bo;WHu?B\u001b\u001bUSM)\nH\u0007s\u0010=", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10406daysUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.DAYS);
        }

        /* JADX INFO: renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m10407getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* JADX INFO: renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m10408getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        /* JADX INFO: renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m10409getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        @Deprecated(message = "\u0018Y\u0001t8X$lZS-HX$A`o\u0013H,\u001d|\u0011`\nO}x\u000e\u00056uxQvVf\u001cnKU+r\u001e'hM\u000e+gV\tHMA\"\rU\u001dS)6=\u0010\u0006 t8 \u0019", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10410hoursUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.HOURS);
        }

        @Deprecated(message = "\u0018Y\u0001t8]#k&O7\u0010b(r\u000ead\u001d,\u0013{\u0015a\u0005\u0006~|]\u0005)x|e$H_kux*3E;&_[\bo;WHu?B\u001b\u001bUSM)\nH\u0007s\u0010=", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10411hoursUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.HOURS);
        }

        @Deprecated(message = "\u0018Y\u0001t8`$e_\u00150\ne'?\u0015\u001cQ!;\nv\u001f[\u0006T.z`\u00044kz`}\u0002SnwF\u0006\u0002HL\u0013jU\t0&+JrN5 \u0015V\"\u0004$\u0005G\u0016w\rs\u0005", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10412hoursUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.HOURS);
        }

        @Deprecated(message = "\u0018Y\u0001t8X$lZS-H]\u001e/`k_\u000e*\u0014v\u0010e=\u0006s\u0003by2yq[r\u0002]nwIK0GSQ\\^\t/\u0018,Pw?H\u001b\u001bUa'*\u0004D\u0003\u0001\u0015~E[T\f\u000fq'\t\u007f\u0016", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10413microsecondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.MICROSECONDS);
        }

        @Deprecated(message = "\u0018Y\u0001t8]#k&T1}b$?S_[\u0017+\u0018/KW\u000fZsxa}3t(\\vQ]azM_]9L!c\f]7jIOnMB_nV!T\u001c\u0005=\u0011\u0001KxE/_\u0003|ao", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10414microsecondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.MICROSECONDS);
        }

        @Deprecated(message = "\u0018Y\u0001t8`$e_\u00155\u0004S';aaO\u00185\t{R\u0012{^\u0003o\\\b-uv\ftT\\lmKZ7r@$eY9\u0006mZ<yGC Y*#Q+wB\u000b\u0002\u001a/@*^\u0012\u0001^&U", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10415microsecondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.MICROSECONDS);
        }

        @Deprecated(message = "\u0018Y\u0001t8X$lZS-H]\u001e8Ze_\u000e*\u0014v\u0010e=\u0006s\u0003by2yq[r\u0002]nwIK0GSQ\\^\t/\u0018,Pw?H\u001b\u001bUa'*\u0004D\u0003\u0001\u0015~E[T\f\u000fq'\t\u007f\u0016", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10416millisecondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.MILLISECONDS);
        }

        @Deprecated(message = "\u0018Y\u0001t8]#k&T1\u0007\\\u001e?S_[\u0017+\u0018/KW\u000fZsxa}3t(\\vQ]azM_]9L!c\f]7jIOnMB_nV!T\u001c\u0005=\u0011\u0001KxE/_\u0003|ao", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10417millisecondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.MILLISECONDS);
        }

        @Deprecated(message = "\u0018Y\u0001t8`$e_\u00155\u0004\\!5aaO\u00185\t{R\u0012{^\u0003o\\\b-uv\ftT\\lmKZ7r@$eY9\u0006mZ<yGC Y*#Q+wB\u000b\u0002\u001a/@*^\u0012\u0001^&U", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10418millisecondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.MILLISECONDS);
        }

        @Deprecated(message = "\u0018Y\u0001t8X$lZS-H]\u001e:cpQ\u001cmDm$f{T\u0002s]\u0003cvz[tG_p\u0002xL0BGQ:a\f#lQJs\f\u0017!\u0019W\u0015R$\u0006BA{\u001a\u0003K!L\u0002I", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10419minutesUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.MINUTES);
        }

        @Deprecated(message = "\u0018Y\u0001t8]#k&T1\te)1a#\f\u000e?\u0019m\u001ae\u007fU|*^\u00073vm^x[\rbzHS]\u0017O$W`\u00031f\u0016\u001etKD\u0013\u001aP#RZ\u007fB\u0015\u0007\u0011p;i", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10420minutesUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.MINUTES);
        }

        @Deprecated(message = "\u0018Y\u0001t8`$e_\u00155\u0004^*@So\u0013H,\u001d|\u0011`\nO}x\u000e\u00056uxQvVf\u001cnKU+r\u001e'hM\u000e+gV\tHMA\"\rU\u001dS)6=\u0010\u0006 t8 \u0019", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10421minutesUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.MINUTES);
        }

        @Deprecated(message = "\u0018Y\u0001t8X$lZS-H^\u0016:]oQ\f6\u0013l\u001f\u00196K\u0007~S\u00037owZ$R_kx>X2Ly\u0018h[\u0007a<]MfR=!\u001a\u0015vS(\u00075\u0010{\u001b}v%Y\u0011\u0010b#\fI", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10422nanosecondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.NANOSECONDS);
        }

        @Deprecated(message = "\u0018Y\u0001t8]#k&U)\t_(1QkZ\r:K(\u0011j\u000bK|}W\u00042&x^sRRn|R\u0006$EI\u001f\u00160\u000f4Y\\DtL\u0002t\u001bT$E)\u007fC\u00102\u0015}J0P~\u007f+", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10423nanosecondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.NANOSECONDS);
        }

        @Deprecated(message = "\u0018Y\u0001t8`$e_\u00156{^$?S_[\u0017+\u0018/KW\u000fZsxa}3t(\\vQ]azM_]9L!c\f]7jIOnMB_nV!T\u001c\u0005=\u0011\u0001KxE/_\u0003|ao", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10424nanosecondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.NANOSECONDS);
        }

        /* JADX INFO: renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m10425parseUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.parseDuration(value, false);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e2);
            }
        }

        /* JADX INFO: renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m10426parseIsoStringUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.parseDuration(value, true);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e2);
            }
        }

        /* JADX INFO: renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m10427parseIsoStringOrNullFghU774(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m10304boximpl(DurationKt.parseDuration(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m10428parseOrNullFghU774(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m10304boximpl(DurationKt.parseDuration(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Deprecated(message = "\u0018Y\u0001t8X$lZS-Hc\u001a/]jP\u001cmDm$f{T\u0002s]\u0003cvz[tG_p\u0002xL0BGQ:a\f#lQJs\f\u0017!\u0019W\u0015R$\u0006BA{\u001a\u0003K!L\u0002I", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10429secondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.SECONDS);
        }

        @Deprecated(message = "\u0018Y\u0001t8]#k&Z-}_#0a#\f\u000e?\u0019m\u001ae\u007fU|*^\u00073vm^x[\rbzHS]\u0017O$W`\u00031f\u0016\u001etKD\u0013\u001aP#RZ\u007fB\u0015\u0007\u0011p;i", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10430secondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.SECONDS);
        }

        @Deprecated(message = "\u0018Y\u0001t8`$e_\u0015;\u007fS$:Ro\u0013H,\u001d|\u0011`\nO}x\u000e\u00056uxQvVf\u001cnKU+r\u001e'hM\u000e+gV\tHMA\"\rU\u001dS)6=\u0010\u0006 t8 \u0019", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @InterfaceC1492Gx
        @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bcA")
        /* JADX INFO: renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m10431secondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.SECONDS);
        }
    }

    private /* synthetic */ Duration(long j2) {
        this.rawValue = j2;
    }

    /* JADX INFO: renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m10302addValuesMixedRangesUwyO8pc(long j2, long j3, long j4) {
        long jNanosToMillis = DurationKt.nanosToMillis(j4);
        long j5 = j3 + jNanosToMillis;
        if (!new LongRange(-4611686018426L, 4611686018426L).contains(j5)) {
            return DurationKt.durationOfMillis(RangesKt.coerceIn(j5, -4611686018427387903L, DurationKt.MAX_MILLIS));
        }
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(j5) + (j4 - DurationKt.millisToNanos(jNanosToMillis)));
    }

    /* JADX INFO: renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m10303appendFractionalimpl(long j2, StringBuilder sb, int i2, int i3, int i4, String str, boolean z2) {
        sb.append(i2);
        if (i3 != 0) {
            sb.append('.');
            String strPadStart = StringsKt.padStart(String.valueOf(i3), i4, '0');
            int i5 = -1;
            int length = strPadStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i6 = length - 1;
                    if (strPadStart.charAt(length) != '0') {
                        i5 = length;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (z2 || i7 >= 3) {
                Intrinsics.checkNotNullExpressionValue(sb.append((CharSequence) strPadStart, 0, ((i5 + 3) / 3) * 3), "append(...)");
            } else {
                Intrinsics.checkNotNullExpressionValue(sb.append((CharSequence) strPadStart, 0, i7), "append(...)");
            }
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m10304boximpl(long j2) {
        return new Duration(j2);
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m10305compareToLRDsOJo(long j2, long j3) {
        long j4 = j2 ^ j3;
        if (j4 < 0 || (-1) - (((-1) - ((int) j4)) | ((-1) - 1)) == 0) {
            return Intrinsics.compare(j2, j3);
        }
        int i2 = ((-1) - (((-1) - ((int) j2)) | ((-1) - 1))) - ((-1) - (((-1) - ((int) j3)) | ((-1) - 1)));
        return m10339isNegativeimpl(j2) ? -i2 : i2;
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m10306constructorimpl(long j2) {
        if (DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m10337isInNanosimpl(j2)) {
                if (!new LongRange(-4611686018426999999L, DurationKt.MAX_NANOS).contains(m10333getValueimpl(j2))) {
                    throw new AssertionError(m10333getValueimpl(j2) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS).contains(m10333getValueimpl(j2))) {
                    throw new AssertionError(m10333getValueimpl(j2) + " ms is out of milliseconds range");
                }
                if (new LongRange(-4611686018426L, 4611686018426L).contains(m10333getValueimpl(j2))) {
                    throw new AssertionError(m10333getValueimpl(j2) + " ms is denormalized");
                }
            }
        }
        return j2;
    }

    /* JADX INFO: renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m10307divLRDsOJo(long j2, long j3) {
        DurationUnit durationUnit = (DurationUnit) ComparisonsKt.maxOf(m10331getStorageUnitimpl(j2), m10331getStorageUnitimpl(j3));
        return m10349toDoubleimpl(j2, durationUnit) / m10349toDoubleimpl(j3, durationUnit);
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m10308divUwyO8pc(long j2, double d2) {
        int iRoundToInt = MathKt.roundToInt(d2);
        if (iRoundToInt == d2 && iRoundToInt != 0) {
            return m10309divUwyO8pc(j2, iRoundToInt);
        }
        DurationUnit durationUnitM10331getStorageUnitimpl = m10331getStorageUnitimpl(j2);
        return DurationKt.toDuration(m10349toDoubleimpl(j2, durationUnitM10331getStorageUnitimpl) / d2, durationUnitM10331getStorageUnitimpl);
    }

    /* JADX INFO: renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m10309divUwyO8pc(long j2, int i2) {
        if (i2 == 0) {
            if (m10340isPositiveimpl(j2)) {
                return INFINITE;
            }
            if (m10339isNegativeimpl(j2)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m10337isInNanosimpl(j2)) {
            return DurationKt.durationOfNanos(m10333getValueimpl(j2) / ((long) i2));
        }
        if (m10338isInfiniteimpl(j2)) {
            return m10344timesUwyO8pc(j2, MathKt.getSign(i2));
        }
        long j3 = i2;
        long jM10333getValueimpl = m10333getValueimpl(j2) / j3;
        if (!new LongRange(-4611686018426L, 4611686018426L).contains(jM10333getValueimpl)) {
            return DurationKt.durationOfMillis(jM10333getValueimpl);
        }
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(jM10333getValueimpl) + (DurationKt.millisToNanos(m10333getValueimpl(j2) - (jM10333getValueimpl * j3)) / j3));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m10310equalsimpl(long j2, Object obj) {
        return (obj instanceof Duration) && j2 == ((Duration) obj).m10361unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10311equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* JADX INFO: renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m10312getAbsoluteValueUwyO8pc(long j2) {
        return m10339isNegativeimpl(j2) ? m10359unaryMinusUwyO8pc(j2) : j2;
    }

    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    /* JADX INFO: renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m10313getHoursComponentimpl(long j2) {
        if (m10338isInfiniteimpl(j2)) {
            return 0;
        }
        return (int) (m10322getInWholeHoursimpl(j2) % ((long) 24));
    }

    @Deprecated(message = "\u0018Y\u0001tz\u0003\f_gS-^Q.?\u000el^\u00187\nz k6O|}by%j([v\u0002PkvOK0Gy&e0\t7ZT@-\"\u0015\u000b~\u0010SM!65Av\u001b\u00059(P=\u0012^.\u001d\u0001\b\u0019R:S39F\\\u0002@Wi", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getInDays$annotations() {
    }

    @Deprecated(message = "\u0018Y\u0001tz\u0003\f_gS-b_*>a\u001c\\\u001b6\u0015m\u001ef\u0010\u0006wxa\t)gl\fsT\r_wG\\#ENQj[]1mJGj\u0006\u001c\u0001\u00019\u0007\rZ\u007f:AsKsF1M\n\u0001\u001d8\t\b]\u0015~\u0004Tm:6d\u0005De!rI", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getInHours$annotations() {
    }

    @Deprecated(message = "\u0018Y\u0001tz\u0003\f_gS-gY\u0018>]oQ\f6\u0013l\u001f\u0012\u0007X}zS\u00078\u007f(UrUaai=\u0006-Ey\u0015eZ\u0010'j\\zyM\u0018!!I Ibc\u001dddzb\u001c~:k_PjG\u0005NO@:E==3_tzi\u001dz\u0011%5+WO8\u0004,*\u0014KW\u0016m", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getInMicroseconds$annotations() {
    }

    @Deprecated(message = "\u0018Y\u0001tz\u0003\f_gS-gY!8WoQ\f6\u0013l\u001f\u0012\u0007X}zS\u00078\u007f(UrUaai=\u0006-Ey\u0015eZ\u0010'j\\zyM\u0018!!I Ibc\u001dm^tb\u001c~:k_PjG\u0005NO@:E==3_tzi\u001dz\u0011%5+WO8\u0004,*\u0014KW\u0016m", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getInMilliseconds$annotations() {
    }

    @Deprecated(message = "\u0018Y\u0001tz\u0003\f_gS-gY#Aba_H7\u0017w\u001cW\tZ\b*W\u00037zmMh\u0002\\n(<U,I?$j\f\u000e1<WPgJ9Yx0\u00029\u000f['J2\u0015uv\u001d\u000b\u0002\u000br$\u0014\u0001\b&@\u0007V3g:f/MX-\u0004\u00052z&\u0012", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getInMinutes$annotations() {
    }

    @Deprecated(message = "\u0018Y\u0001tz\u0003\f_gS-hQ#;aaO\u00185\t{Kb\tU~o`\t=&qZwVR]lxU0r=!db~4l\bOt\"C'\u000eS\u0019\f\tW\"pepR&\n/pD\u001d+\u000e;IOC\nV046\u0013\u0006<_1s;)\taV\u00157\u0014$'\u0010= ", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getInNanoseconds$annotations() {
    }

    @Deprecated(message = "\u0018Y\u0001tz\u0003\f_gS-mU\u0018;\\`_H7\u0017w\u001cW\tZ\b*W\u00037zmMh\u0002\\n(<U,I?$j\f\u000e1<WPgJ9Y~,v3\tZ'J2\u0015uv\u001d\u000b\u0002\u000br$\u0014\u0001\b&@\u0007V3g:f/MX-\u0004\u00052z&\u0012", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @InterfaceC1492Gx
    @DeprecatedSinceKotlin(errorSince = "XpJ", hiddenSince = "\tq2", warningSince = "\u000bc@")
    public static /* synthetic */ void getInSeconds$annotations() {
    }

    /* JADX INFO: renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m10321getInWholeDaysimpl(long j2) {
        return m10352toLongimpl(j2, DurationUnit.DAYS);
    }

    /* JADX INFO: renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m10322getInWholeHoursimpl(long j2) {
        return m10352toLongimpl(j2, DurationUnit.HOURS);
    }

    /* JADX INFO: renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m10323getInWholeMicrosecondsimpl(long j2) {
        return m10352toLongimpl(j2, DurationUnit.MICROSECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m10324getInWholeMillisecondsimpl(long j2) {
        return (m10336isInMillisimpl(j2) && m10335isFiniteimpl(j2)) ? m10333getValueimpl(j2) : m10352toLongimpl(j2, DurationUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m10325getInWholeMinutesimpl(long j2) {
        return m10352toLongimpl(j2, DurationUnit.MINUTES);
    }

    /* JADX INFO: renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m10326getInWholeNanosecondsimpl(long j2) {
        long jM10333getValueimpl = m10333getValueimpl(j2);
        if (m10337isInNanosimpl(j2)) {
            return jM10333getValueimpl;
        }
        if (jM10333getValueimpl > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jM10333getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return DurationKt.millisToNanos(jM10333getValueimpl);
    }

    /* JADX INFO: renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m10327getInWholeSecondsimpl(long j2) {
        return m10352toLongimpl(j2, DurationUnit.SECONDS);
    }

    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    /* JADX INFO: renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m10328getMinutesComponentimpl(long j2) {
        if (m10338isInfiniteimpl(j2)) {
            return 0;
        }
        return (int) (m10325getInWholeMinutesimpl(j2) % ((long) 60));
    }

    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    /* JADX INFO: renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m10329getNanosecondsComponentimpl(long j2) {
        if (m10338isInfiniteimpl(j2)) {
            return 0;
        }
        return (int) (m10336isInMillisimpl(j2) ? DurationKt.millisToNanos(m10333getValueimpl(j2) % ((long) 1000)) : m10333getValueimpl(j2) % ((long) 1000000000));
    }

    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* JADX INFO: renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m10330getSecondsComponentimpl(long j2) {
        if (m10338isInfiniteimpl(j2)) {
            return 0;
        }
        return (int) (m10327getInWholeSecondsimpl(j2) % ((long) 60));
    }

    /* JADX INFO: renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m10331getStorageUnitimpl(long j2) {
        return m10337isInNanosimpl(j2) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* JADX INFO: renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m10332getUnitDiscriminatorimpl(long j2) {
        int i2 = (int) j2;
        return (i2 + 1) - (i2 | 1);
    }

    /* JADX INFO: renamed from: getValue-impl, reason: not valid java name */
    private static final long m10333getValueimpl(long j2) {
        return j2 >> 1;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m10334hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* JADX INFO: renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m10335isFiniteimpl(long j2) {
        return !m10338isInfiniteimpl(j2);
    }

    /* JADX INFO: renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m10336isInMillisimpl(long j2) {
        return (((int) j2) & 1) == 1;
    }

    /* JADX INFO: renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m10337isInNanosimpl(long j2) {
        return (((int) j2) & 1) == 0;
    }

    /* JADX INFO: renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m10338isInfiniteimpl(long j2) {
        return j2 == INFINITE || j2 == NEG_INFINITE;
    }

    /* JADX INFO: renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m10339isNegativeimpl(long j2) {
        return j2 < 0;
    }

    /* JADX INFO: renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m10340isPositiveimpl(long j2) {
        return j2 > 0;
    }

    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m10341minusLRDsOJo(long j2, long j3) {
        return m10342plusLRDsOJo(j2, m10359unaryMinusUwyO8pc(j3));
    }

    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m10342plusLRDsOJo(long j2, long j3) {
        if (m10338isInfiniteimpl(j2)) {
            if (m10335isFiniteimpl(j3) || (j3 ^ j2) >= 0) {
                return j2;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m10338isInfiniteimpl(j3)) {
            return j3;
        }
        if ((-1) - (((-1) - ((int) j2)) | ((-1) - 1)) != (((int) j3) & 1)) {
            return m10336isInMillisimpl(j2) ? m10302addValuesMixedRangesUwyO8pc(j2, m10333getValueimpl(j2), m10333getValueimpl(j3)) : m10302addValuesMixedRangesUwyO8pc(j2, m10333getValueimpl(j3), m10333getValueimpl(j2));
        }
        long jM10333getValueimpl = m10333getValueimpl(j2) + m10333getValueimpl(j3);
        return m10337isInNanosimpl(j2) ? DurationKt.durationOfNanosNormalized(jM10333getValueimpl) : DurationKt.durationOfMillisNormalized(jM10333getValueimpl);
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m10343timesUwyO8pc(long j2, double d2) {
        int iRoundToInt = MathKt.roundToInt(d2);
        if (iRoundToInt == d2) {
            return m10344timesUwyO8pc(j2, iRoundToInt);
        }
        DurationUnit durationUnitM10331getStorageUnitimpl = m10331getStorageUnitimpl(j2);
        return DurationKt.toDuration(m10349toDoubleimpl(j2, durationUnitM10331getStorageUnitimpl) * d2, durationUnitM10331getStorageUnitimpl);
    }

    /* JADX INFO: renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m10344timesUwyO8pc(long j2, int i2) {
        if (m10338isInfiniteimpl(j2)) {
            if (i2 != 0) {
                return i2 > 0 ? j2 : m10359unaryMinusUwyO8pc(j2);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i2 == 0) {
            return ZERO;
        }
        long jM10333getValueimpl = m10333getValueimpl(j2);
        long j3 = i2;
        long j4 = jM10333getValueimpl * j3;
        if (!m10337isInNanosimpl(j2)) {
            return j4 / j3 == jM10333getValueimpl ? DurationKt.durationOfMillis(RangesKt.coerceIn(j4, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS))) : MathKt.getSign(jM10333getValueimpl) * MathKt.getSign(i2) > 0 ? INFINITE : NEG_INFINITE;
        }
        if (new LongRange(-2147483647L, 2147483647L).contains(jM10333getValueimpl)) {
            return DurationKt.durationOfNanos(j4);
        }
        if (j4 / j3 == jM10333getValueimpl) {
            return DurationKt.durationOfNanosNormalized(j4);
        }
        long jNanosToMillis = DurationKt.nanosToMillis(jM10333getValueimpl);
        long j5 = jNanosToMillis * j3;
        long jNanosToMillis2 = DurationKt.nanosToMillis((jM10333getValueimpl - DurationKt.millisToNanos(jNanosToMillis)) * j3) + j5;
        return (j5 / j3 != jNanosToMillis || (jNanosToMillis2 ^ j5) < 0) ? MathKt.getSign(jM10333getValueimpl) * MathKt.getSign(i2) > 0 ? INFINITE : NEG_INFINITE : DurationKt.durationOfMillis(RangesKt.coerceIn(jNanosToMillis2, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m10345toComponentsimpl(long j2, Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m10327getInWholeSecondsimpl(j2)), Integer.valueOf(m10329getNanosecondsComponentimpl(j2)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m10346toComponentsimpl(long j2, Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m10325getInWholeMinutesimpl(j2)), Integer.valueOf(m10330getSecondsComponentimpl(j2)), Integer.valueOf(m10329getNanosecondsComponentimpl(j2)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m10347toComponentsimpl(long j2, Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m10322getInWholeHoursimpl(j2)), Integer.valueOf(m10328getMinutesComponentimpl(j2)), Integer.valueOf(m10330getSecondsComponentimpl(j2)), Integer.valueOf(m10329getNanosecondsComponentimpl(j2)));
    }

    /* JADX INFO: renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m10348toComponentsimpl(long j2, Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m10321getInWholeDaysimpl(j2)), Integer.valueOf(m10313getHoursComponentimpl(j2)), Integer.valueOf(m10328getMinutesComponentimpl(j2)), Integer.valueOf(m10330getSecondsComponentimpl(j2)), Integer.valueOf(m10329getNanosecondsComponentimpl(j2)));
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    public static final double m10349toDoubleimpl(long j2, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j2 == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j2 == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt.convertDurationUnit(m10333getValueimpl(j2), m10331getStorageUnitimpl(j2), unit);
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    public static final int m10350toIntimpl(long j2, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) RangesKt.coerceIn(m10352toLongimpl(j2, unit), -2147483648L, 2147483647L);
    }

    /* JADX INFO: renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m10351toIsoStringimpl(long j2) {
        StringBuilder sb = new StringBuilder();
        if (m10339isNegativeimpl(j2)) {
            sb.append(Soundex.SILENT_MARKER);
        }
        sb.append("PT");
        long jM10312getAbsoluteValueUwyO8pc = m10312getAbsoluteValueUwyO8pc(j2);
        long jM10322getInWholeHoursimpl = m10322getInWholeHoursimpl(jM10312getAbsoluteValueUwyO8pc);
        int iM10328getMinutesComponentimpl = m10328getMinutesComponentimpl(jM10312getAbsoluteValueUwyO8pc);
        int iM10330getSecondsComponentimpl = m10330getSecondsComponentimpl(jM10312getAbsoluteValueUwyO8pc);
        int iM10329getNanosecondsComponentimpl = m10329getNanosecondsComponentimpl(jM10312getAbsoluteValueUwyO8pc);
        if (m10338isInfiniteimpl(j2)) {
            jM10322getInWholeHoursimpl = 9999999999999L;
        }
        boolean z2 = true;
        boolean z3 = jM10322getInWholeHoursimpl != 0;
        boolean z4 = (iM10330getSecondsComponentimpl == 0 && iM10329getNanosecondsComponentimpl == 0) ? false : true;
        if (iM10328getMinutesComponentimpl == 0 && (!z4 || !z3)) {
            z2 = false;
        }
        if (z3) {
            sb.append(jM10322getInWholeHoursimpl).append('H');
        }
        if (z2) {
            sb.append(iM10328getMinutesComponentimpl).append('M');
        }
        if (z4 || (!z3 && !z2)) {
            m10303appendFractionalimpl(j2, sb, iM10330getSecondsComponentimpl, iM10329getNanosecondsComponentimpl, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    public static final long m10352toLongimpl(long j2, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j2 == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j2 == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt.convertDurationUnit(m10333getValueimpl(j2), m10331getStorageUnitimpl(j2), unit);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m10355toStringimpl(long j2) {
        if (j2 == 0) {
            return "0s";
        }
        if (j2 == INFINITE) {
            return "Infinity";
        }
        if (j2 == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean zM10339isNegativeimpl = m10339isNegativeimpl(j2);
        StringBuilder sb = new StringBuilder();
        if (zM10339isNegativeimpl) {
            sb.append(Soundex.SILENT_MARKER);
        }
        long jM10312getAbsoluteValueUwyO8pc = m10312getAbsoluteValueUwyO8pc(j2);
        long jM10321getInWholeDaysimpl = m10321getInWholeDaysimpl(jM10312getAbsoluteValueUwyO8pc);
        int iM10313getHoursComponentimpl = m10313getHoursComponentimpl(jM10312getAbsoluteValueUwyO8pc);
        int iM10328getMinutesComponentimpl = m10328getMinutesComponentimpl(jM10312getAbsoluteValueUwyO8pc);
        int iM10330getSecondsComponentimpl = m10330getSecondsComponentimpl(jM10312getAbsoluteValueUwyO8pc);
        int iM10329getNanosecondsComponentimpl = m10329getNanosecondsComponentimpl(jM10312getAbsoluteValueUwyO8pc);
        int i2 = 0;
        boolean z2 = jM10321getInWholeDaysimpl != 0;
        boolean z3 = iM10313getHoursComponentimpl != 0;
        boolean z4 = iM10328getMinutesComponentimpl != 0;
        boolean z5 = (iM10330getSecondsComponentimpl == 0 && iM10329getNanosecondsComponentimpl == 0) ? false : true;
        if (z2) {
            sb.append(jM10321getInWholeDaysimpl).append('d');
            i2 = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i3 = i2 + 1;
            if (i2 > 0) {
                sb.append(TokenParser.SP);
            }
            sb.append(iM10313getHoursComponentimpl).append('h');
            i2 = i3;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(TokenParser.SP);
            }
            sb.append(iM10328getMinutesComponentimpl).append('m');
            i2 = i4;
        }
        if (z5) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(TokenParser.SP);
            }
            if (iM10330getSecondsComponentimpl != 0 || z2 || z3 || z4) {
                m10303appendFractionalimpl(j2, sb, iM10330getSecondsComponentimpl, iM10329getNanosecondsComponentimpl, 9, Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, false);
            } else if (iM10329getNanosecondsComponentimpl >= 1000000) {
                m10303appendFractionalimpl(j2, sb, iM10329getNanosecondsComponentimpl / 1000000, iM10329getNanosecondsComponentimpl % 1000000, 6, "ms", false);
            } else if (iM10329getNanosecondsComponentimpl >= 1000) {
                m10303appendFractionalimpl(j2, sb, iM10329getNanosecondsComponentimpl / 1000, iM10329getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(iM10329getNanosecondsComponentimpl).append("ns");
            }
            i2 = i5;
        }
        if (zM10339isNegativeimpl && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static final String m10356toStringimpl(long j2, DurationUnit unit, int i2) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (i2 < 0) {
            throw new IllegalArgumentException(("decimals must be not negative, but was " + i2).toString());
        }
        double dM10349toDoubleimpl = m10349toDoubleimpl(j2, unit);
        return Double.isInfinite(dM10349toDoubleimpl) ? String.valueOf(dM10349toDoubleimpl) : DurationJvmKt.formatToExactDecimals(dM10349toDoubleimpl, RangesKt.coerceAtMost(i2, 12)) + DurationUnitKt.shortName(unit);
    }

    /* JADX INFO: renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m10357toStringimpl$default(long j2, DurationUnit durationUnit, int i2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 2)) != 0) {
            i2 = 0;
        }
        return m10356toStringimpl(j2, durationUnit, i2);
    }

    /* JADX INFO: renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m10358truncateToUwyO8pc$kotlin_stdlib(long j2, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit durationUnitM10331getStorageUnitimpl = m10331getStorageUnitimpl(j2);
        if (unit.compareTo(durationUnitM10331getStorageUnitimpl) <= 0 || m10338isInfiniteimpl(j2)) {
            return j2;
        }
        return DurationKt.toDuration(m10333getValueimpl(j2) - (m10333getValueimpl(j2) % DurationUnitKt.convertDurationUnit(1L, unit, durationUnitM10331getStorageUnitimpl)), durationUnitM10331getStorageUnitimpl);
    }

    /* JADX INFO: renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m10359unaryMinusUwyO8pc(long j2) {
        int i2 = (int) j2;
        return DurationKt.durationOf(-m10333getValueimpl(j2), (i2 + 1) - (i2 | 1));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m10360compareToLRDsOJo(duration.m10361unboximpl());
    }

    /* JADX INFO: renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m10360compareToLRDsOJo(long j2) {
        return m10305compareToLRDsOJo(this.rawValue, j2);
    }

    public boolean equals(Object obj) {
        return m10310equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m10334hashCodeimpl(this.rawValue);
    }

    public String toString() {
        return m10355toStringimpl(this.rawValue);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m10361unboximpl() {
        return this.rawValue;
    }
}
