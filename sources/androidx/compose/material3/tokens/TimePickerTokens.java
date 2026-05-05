package androidx.compose.material3.tokens;

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
/* JADX INFO: compiled from: TimePickerTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Я.\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005#4\u0012\u000e\u0007nj?2Le^.ZS0\u0014s{J$c$w#Aڦ\u001a\u0014̝9O|f(sPZŲG\u000f\u0014\u0016Iy:Jmx\f\u0014Ƥ6HwЀKOu@GdEM\u0013%J\"f\u007f܇\u007fɝߋG\u000fͯ~KS\f 9Xr@Y\u001bUU) \u0010V /)֔kT>ԟ\u0005_@;1\u0010:Q\\5w0+OϘJZ/˙\u000fc$:N;\u0006$3c\u001b\u0007\u0001]ύ\u0007Eyܵ\u001dj-89MDfDj\u0018\u0014C>̠\u0011cz̦t\u0007Wt\u001a<{fqah\u000eV}¶zȞ˖\u0003\rΝ+P6-(o \u00109\f\u0001[\u0011_\u0010vZ\u007f)cي\u001b+\bđC;!\u007f_e\f(\\Q\u0014\u0005;1ţ\u0005t)żl\u0010f0)iHh?mX=vT͜XƝҠ\u0003oĊ\u00062\f0U\tG}\u0017K%-\bjGA9k0Jזk|\r\u009b\u0001UoqVDr\u0006$WB\t:`מcʍÐOSг0\u0019U\u001cb\u0010\u0016\n\u0019Aj\u007f\r032fO\u0017|ҷQc\u0012ɘGh=||\u0001^fG\u0003K5\u007feߧeX~ܝW>h*fj\u0013b\u001a\u0001t(P4ʮn\u0016\u007fӻ\\P\u0012:@CB3BTI\u0019\u000b\u001bɶ\u0002ٜ\u05cc@{Ȥcbp\u0010\r]K&\t\u00132|Y\u0010^\u0007\to\u0016\fͅ0\u0003hõECW`';&1v`\u0015#5\u0001\u0381\u0004Moն_NrC\u0004YL/$HQQ]Hт\u0013\u00051Ʌ\u001a/K{\u0001r\"\\ W\u0013|(\"³l4oō\u0003r2\u0012x_ k%T\u000f^!)Сcрّ`EیKk\\\u000biGat\t\rJV\t\u0014\u0013S6%/uޫ{ކտB&ޗ\u001a\u007f\u001c/#jukuc\bj_5\u0003\u001c\u001c,\u0012!̔fWeЦS:O\u0011\rKr3z;ZH\u0019yڇF\u000f<ؿKJG\u001e~Z\td\u0019i\u0016f52߱o£ޣ9\u0012̭\u0002<6_8|[\u007f\u001a\u001aQ-a\\a$\u0006my^\u05c8N\u0015\u0012Κ\u00143tO*Apee!!04u͛:GCؠ\u001d>\u000fcB0\r\u0017\u0019\u0004li4\u0012Ģ\u0004Lgʕ/4H5IZ^c\u0007\u001fnH3b҇d'2܀\u0017\u00119a\u00079\u0002\u0014{\u000bl/\u00124ݏW#\u0011ƅ\u0003Q\u0005,3/\u0015cGa@X/\r\u0558aIQ\u0379N\u0006Mp{o@\u001bF`\u0015\u001dp\u001aê=W\u0019٣\u000f2dTch\u001fs\u0005\\~R|$Ĺ\u0003\u0001\u0005ɚT\f\u0015V'SC~pydN&9ƴ\u001e\u0007\u001f\u05edA\t\u0012JqJkD\u0014\u0004E=wpΘ&سòR:֞\f(('\u0012}9^]]t\u0012.2Hf\n\u0016\u0011\bǺ\u0012Уݹ\u0003-ؠxz\u0012.\u0016?g\u00049S!f*\u0003\u0006sX'YrߢAŮҎw\tʋpkvU\u0019\f~3\\M|5!4\u0017{e.A^Ǎ9Î؟\u001fWӜ\u0004\u001c\u001d&-? d/e]k9\u007fy&s\rYB֗.g9Èj \u0004v\b\u000bTAb\u0001-;\u0005SͷcӷїkAŃ\u0012fr(r}$+\u001aV\rP/ !\u000f^rLoԘ;\u001f'ʺ%Ifb\u0012R\u001a5/\u000ej?I9כ\u000fu0ϓ)\u0005@@\u0003\u0004zQ\u0017Q\u0018gZ/ĘXC\"śq&sD\u0011*\u001cTF# ,?\u0010Ŕ3`@ԌV^ }IU\u0004P's\u0019\u0015f\b˲\u000b\u001f=շiU+\u000e\u000f\u0001Q\u001cM^Ikhu٥v)7ݩ\b\u001d]LI)\u0006tZ\u000e$\u0002\u0014LԐQi^՟y.O\u001dS\"JdNh\"\u001fR/Թy)\bӚIJ0IjM'\u0003en>*dp\u07b2'Mtԭ\f\f2U&w5jo!YzB\u001bܵB05ì\u001fGSV\b\u000f\u0015\u001cS\u0003O\u000f4+ط\u001b\u0003\u0018ށ\nB19\u0001Q\u007fkk-+s2<ߴe<\u0002ÙX[0w;\u0016%rx]\u0006Q\u000e\u0012١\u0016\u0013\u0015Խ\u00103XT\u000edߺ\u00180SyLտx'LIb\u0011_Ǭ(S"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001\\\u001a6M.?i:\u001e\"Wk?\u0007l:$", "", "u(E", "\u0011k^0^\u000bBO \\\u0005e6\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001K 5WP)i7\u001e\u001dhG9\u001bR6Tv0U\"", "5dc\u0010_6<Yw\u0003ve\n\u0007\u00109r", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\fWJEx\"\u001c\u0018hi9lc@=\u0001-GU\\\u0002", "\u0011k^0^\u000bBO \\\u0005g;x\r8e\r\u0016\u007fU\u0001", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", "5dc\u0010_6<Yw\u0003ve\n\u0007\u0012>a\u00041{Mn\u001b,G7l\u0010V*\u0005Ze", "u(5", "\u0014", "\u0011k^0^\u000bBO ev[,\u0004w/x\u000f\t\u0006I\u0010", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001\\*9WEHg?!)NaMum2N\u007f5\u001d", "5dc\u0010_6<Yw\u0003ve\u0013x\u0006/ln(\u000fOa! V", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\u001daNEmA\u001a ku\u001f\u0007w\u001bX|'PZ$", "\u0011k^0^\u000bBO lze,z\u0018/df$x@\b\u0006\u0017Z~kF}/B", "5dc\u0010_6<Yw\u0003ve\u001a|\u0010/c\u000f(z'|\u0014\u0017N^\u000eO\u0006\u0003?`\b-", "\u0011k^0^\u000bBO lze,z\u00189r](\u0005O\u0001$tQx\u001d8z.5f[*>w#", "5dc\u0010_6<Yw\u0003ve\u001a|\u0010/c\u000f2\t\u001e\u0001 &G|kF\u007f41]\u0007 DK 5WP", "\u0011k^0^\u000bBO lze,z\u00189r](\u0005O\u0001$tQx\u001d8z.5fk#3x\u0016", "\u001a`]1e6BR,Hxh4\b\u0013=eI0wO\u0001$\u001bCv[\u0006\u0006/;Y\u0007.\u0001[\u0019*XC!kH\r\u001fnaB\u00159", "5dc\u0010_6<Yw\u0003ve\u001a|\u0010/c\u000f2\t\u001e\u0001 &G|kF\u007f41]\u0007 D[\u0019*XC", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EH|&\u0017Ts\nCDnDc\u0004 @{_\u001cP?Fk\u001a\u001e)Wk?\u0007l:$", "\u0011k^0^\u000bBO lze,z\u00189r](\u0005O\u0001$tQx\u001d8z.5fk$Lm", "5dc\u0010_6<Yw\u0003ve\u001a|\u0010/c\u000f2\t\u001e\u0001 &G|kF\u007f41]\u0007 D[\u001aCM\u000b\u001a?\u0014#diI", "\u0011k^0^\u000bBO lze,z\u00189rb$\u0005?\b\u0017tQx\u001d8z.5f[*>w#", "5dc\u0010_6<Yw\u0003ve\u001a|\u0010/c\u000f2\t#| \u0016NokF\u007f41]\u0007 DK 5WP", "\u0011k^0^\u000bBO lze,z\u00189rb$\u0005?\b\u0017tQx\u001d8z.5fk#3x\u0016", "5dc\u0010_6<Yw\u0003ve\u001a|\u0010/c\u000f2\t#| \u0016NokF\u007f41]\u0007 D[\u0019*XC", "\u0011k^0^\u000bBO lze,z\u00189rb$\u0005?\b\u0017tQx\u001d8z.5fk$Lm", "5dc\u0010_6<Yw\u0003ve\u001a|\u0010/c\u000f2\t#| \u0016NokF\u007f41]\u0007 D[\u001aCM\u000b\u001a?\u0014#diI", "\u0011k^0^\u000bBO lze,z\u00189rn5w>\u0007t!P~\n@\u007f%B7\b'Az", "5dc\u0010_6<Yw\u0003ve\u001a|\u0010/c\u000f2\t/\u000e\u0013\u0015MM\u0018E\u0006!9b}-\u0015w\u001d8Z", "\u0011k^0^\u000bBO lze,z\u00189rn5w>\u0007t!P~\n@\u007f%BK\u0002\u001fFp", "5dc\u0010_6<Yw\u0003ve\u001a|\u0010/c\u000f2\t/\u000e\u0013\u0015MM\u0018E\u0006!9b}-)q\u0015=P\u000b\u001a?\u0014#diI", "\u0011k^0^\u000bBO l}Z7|", "5dc\u0010_6<Yw\u0003ve\u001a\u007f\u0005:e", "\u0011k^0^\u000bBO n\u0004l,\u0004\t-t\u007f'b<}\u0017\u001e6o!KT/<c\u000b", "5dc\u0010_6<Yw\u0003ve\u001c\u0006\u0017/l\u007f&\u000b@\u007f}\u0013Do\u0015+v8D7\b'Az", "\u0011n]AT0GS&\\\u0005e6\n", "5dc\u0010b5MO\u001d\bzk\n\u0007\u00109r", "\u0011n]AT0GS&^\u0002^=x\u00183o\t", "5dc\u0010b5MO\u001d\bzk\f\u0004\t@a\u000f,\u0006IHuj't]=^", "\u0011n]AT0GS&l}Z7|", "5dc\u0010b5MO\u001d\bzk\u001a\u007f\u0005:e", "\u0016dP1_0GSv\t\u0002h9", "5dc\u0015X(=Z\u001d\bz<6\u0004\u0013<", "\u0016dP1_0GSy\t\u0004m", "5dc\u0015X(=Z\u001d\bz?6\u0006\u0018", "\u001eda6b+,S ~xm6\nf9n\u000f$\u007fI\u0001$\u0005Jk\u0019<", "5dc\u001dX9B]\u0018lze,z\u00189r]2\u0005O|\u001b G|{?r05", "\u001eda6b+,S ~xm6\nk9r\u0004=\u0006I\u0010\u0013\u001e%y\u0017Kr)>Y\u000b\u00037q\u00181\\", "5dc\u001dX9B]\u0018lze,z\u00189rb2\tD\u0016! Vk\u0015\u001a\u0001.DU\u0002)7zx.QE>z{|hHf\t\bK", "\u001eda6b+,S ~xm6\nk9r\u0004=\u0006I\u0010\u0013\u001e%y\u0017Kr)>Y\u000b\u0012;l%1", "5dc\u001dX9B]\u0018lze,z\u00189rb2\tD\u0016! Vk\u0015\u001a\u0001.DU\u0002)7z\b2LR>3\u0013qtm1:n", "\u001eda6b+,S ~xm6\no+b\u007f/j@\u0014&wQx\u001d", "5dc\u001dX9B]\u0018lze,z\u00189rf$x@\b\u0006\u0017Z~nF\u007f4", "\u001eda6b+,S ~xm6\nr?t\u0007,\u0005@^!\u001eQ|", "5dc\u001dX9B]\u0018lze,z\u00189ri8\u000bG\u0005 \u0017%y\u0015F\u0004", "\u001eda6b+,S ~xm6\nr?t\u0007,\u0005@r\u001b\u0016Vr", "5dc\u001dX9B]\u0018lze,z\u00189ri8\u000bG\u0005 \u00179s\rKyl\u0014-]%\u0007n}", "\u001eda6b+,S ~xm6\nv/l\u007f&\u000b@\u007ft!P~\n@\u007f%B7\b'Az", "5dc\u001dX9B]\u0018lze,z\u00189rm(\u0003@~&\u0017FM\u0018E\u0006!9b}-\u0015w\u001d8Z", "\u001eda6b+,S ~xm6\nv/l\u007f&\u000b@\u007fw!E\u007f\u001c#r\"5`l J|s8TMH", "5dc\u001dX9B]\u0018lze,z\u00189rm(\u0003@~&\u0017FP\u0018:\u00073\u001cUz >\\\u0016A\\!Er>+", "\u001eda6b+,S ~xm6\nv/l\u007f&\u000b@\u007fy!Xo\u001b#r\"5`l J|s8TMH", "5dc\u001dX9B]\u0018lze,z\u00189rm(\u0003@~&\u0017FR\u0018Mv2\u001cUz >\\\u0016A\\!Er>+", "\u001eda6b+,S ~xm6\nv/l\u007f&\u000b@\u007f}\u0013Do\u0015+v8D7\b'Az", "5dc\u001dX9B]\u0018lze,z\u00189rm(\u0003@~&\u0017FV\n9v,$Y\u0011/\u0015w\u001d8Z", "\u001eda6b+,S ~xm6\nv/l\u007f&\u000b@\u007f\u0002$G}\u001c<u\f1V}'&m)=+MBuA", "5dc\u001dX9B]\u0018lze,z\u00189rm(\u0003@~&\u0017FZ\u001b<\u000535Xd\u001c4m\u001d\u001dMVJI>%\u001fu", "\u001eda6b+,S ~xm6\nx8s\u007f/{>\u0010\u0017\u0016(y\fL\u0005\f1V}'&m)=+MBuA", "5dc\u001dX9B]\u0018lze,z\u00189ro1\n@\b\u0017\u0015Vo\r\u001d\u0001#Egd\u001c4m\u001d\u001dMVJI>%\u001fu", "\u001eda6b+,S ~xm6\nx8s\u007f/{>\u0010\u0017\u0016*y\u001f<\u0004\f1V}'&m)=+MBuA", "5dc\u001dX9B]\u0018lze,z\u00189ro1\n@\b\u0017\u0015Vo\r\u001f\u000165fd\u001c4m\u001d\u001dMVJI>%\u001fu", "\u001eda6b+,S ~xm6\nx8s\u007f/{>\u0010\u0017\u0016.k\u000b<}\u00145l\r}At ;", "5dc\u001dX9B]\u0018lze,z\u00189ro1\n@\b\u0017\u0015Vo\r#r\"5`l J|s8TMH", "\u001eda6b+,S ~xm6\nx8s\u007f/{>\u0010\u0017\u00162|\u000eJ\u0005%4@y\u001d7t\u0005.`R\u0019u;(\"", "5dc\u001dX9B]\u0018lze,z\u00189ro1\n@\b\u0017\u0015Vo\r'\u0004%Cg}\u001f\u001ei\u0013.T2;~C{\u001fokF", "\u001eda6b+,S ~xm6\ny/r\u000f,y<\bt!P~\n@\u007f%B<}$9p%", "5dc\u001dX9B]\u0018lze,z\u00189rp(\tO\u0005\u0015\u0013NM\u0018E\u0006!9b}-\u001am\u001a0PR\u0003J\b}\u001a8b!", "\u001eda6b+,S ~xm6\ny/r\u000f,y<\bt!P~\n@\u007f%BK\u0002\u001fFp", "5dc\u001dX9B]\u0018lze,z\u00189rp(\tO\u0005\u0015\u0013NM\u0018E\u0006!9b}-)q\u0015=P\u000b\u001a?\u0014#diI", "\"h\\2F,ES\u0017\u000e\u0005kxKk e\r7\u007f>|\u001etQx\u001d8z.5fo$6|\u0019", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016{4b\u0019{M\u0010\u001b\u0015CvkF\u007f41]\u0007 D_\u001a-\\F\u0003J\b}\u001a8b!", "\"h\\2F,ES\u0017\u000e\u0005k\n\u0007\u0012>a\u00041{Mc\u0017\u001bIr\u001d", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\ro\t7wD\n\u0017$*o\u0012>y4|8Q\u007f<=\u0017\u0016", "\"h\\2F,ES\u0017\u000e\u0005k\n\u0007\u0012>a\u00041{Mn\u001a\u0013Ro", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\ro\t7wD\n\u0017$5r\nGv", "\"h\\2F,ES\u0017\u000e\u0005k\n\u0007\u0012>a\u00041{Mr\u001b\u0016Vr", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\ro\t7wD\n\u0017$9s\rKyl\u0014-]%\u0007n}", "\"h\\2F,ES\u0017\u000e\u0005k\u0013x\u0006/ln(\u000fOa! V", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\u0016a|(\u0003/\u0001*&(y\u0017K", "\"h\\2F,ES\u0017\u000e\u0005k\u001a|\u0010/c\u000f(z\u001e\u000b &Cs\u0017<\u0004\u0003?`\b-", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\u001de\u0007(yO\u0001\u0016tQx\u001d8z.5f[*>w#", "\"h\\2F,ES\u0017\u000e\u0005k\u001a|\u0010/c\u000f(z!\u000b\u0015'UV\n9v,$Y\u0011/\u0015w\u001d8Z", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\u001de\u0007(yO\u0001\u0016wQm\u001eJ]!2Y\u0005\u000f7\u0001%\fWJEx", "\"h\\2F,ES\u0017\u000e\u0005k\u001a|\u0010/c\u000f(z#\u000b(\u0017TV\n9v,$Y\u0011/\u0015w\u001d8Z", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\u001de\u0007(yO\u0001\u0016yQ\u0001\u000eI]!2Y\u0005\u000f7\u0001%\fWJEx", "\"h\\2F,ES\u0017\u000e\u0005k\u001a|\u0010/c\u000f(z'|\u0014\u0017N^\u000eO\u0006\u0003?`\b-", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\u001de\u0007(yO\u0001\u0016}Cl\u000eCe%Hh[*>w#", "\"h\\2F,ES\u0017\u000e\u0005k\u001a|\u0010/c\u000f(z+\u000e\u0017%Uo\r#r\"5`l J|s8TMH", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\u001de\u0007(yO\u0001\u0016\u0002To\u001cJv$\u001cUz >\\\u0016A\\!Er>+", "\"h\\2F,ES\u0017\u000e\u0005k\u001a|\u0014+r{7\u0006M^!\u001eQ|", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\u001de\u000b$\t<\u0010!$%y\u0015F\u0004", "\"h\\2F,ES\u0017\u000e\u0005k\u001a|\u0014+r{7\u0006Ma! V", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\u001de\u000b$\t<\u0010!$(y\u0017K", "\"h\\2F,ES\u0017\u000e\u0005k\u001c\u0006\u0017/l\u007f&\u000b@\u007ft!P~\n@\u007f%B7\b'Az", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\u001fn\u000e(\u0003@~&\u0017FM\u0018E\u0006!9b}-\u0015w\u001d8Z", "\"h\\2F,ES\u0017\u000e\u0005k\u001c\u0006\u0017/l\u007f&\u000b@\u007fw!E\u007f\u001c#r\"5`l J|s8TMH", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\u001fn\u000e(\u0003@~&\u0017FP\u0018:\u00073\u001cUz >\\\u0016A\\!Er>+", "\"h\\2F,ES\u0017\u000e\u0005k\u001c\u0006\u0017/l\u007f&\u000b@\u007fy!Xo\u001b#r\"5`l J|s8TMH", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\u001fn\u000e(\u0003@~&\u0017FR\u0018Mv2\u001cUz >\\\u0016A\\!Er>+", "\"h\\2F,ES\u0017\u000e\u0005k\u001c\u0006\u0017/l\u007f&\u000b@\u007f}\u0013Do\u0015+v8D7\b'Az", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\u001fn\u000e(\u0003@~&\u0017FV\n9v,$Y\u0011/\u0015w\u001d8Z", "\"h\\2F,ES\u0017\u000e\u0005k\u001c\u0006\u0017/l\u007f&\u000b@\u007f\u0002$G}\u001c<u\f1V}'&m)=+MBuA", "5dc!\\4>A\u0019\u0006z\\;\u0007\u0016\u001fn\u000e(\u0003@~&\u0017FZ\u001b<\u000535Xd\u001c4m\u001d\u001dMVJI>%\u001fu", ";`c2e0:Zfx\b^3|\u0005=e"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TimePickerTokens {
    public static final int $stable = 0;
    private static final float PeriodSelectorVerticalContainerHeight;
    private static final float TimeSelectorContainerHeight;
    public static final TimePickerTokens INSTANCE = new TimePickerTokens();
    private static final ColorSchemeKeyTokens ClockDialColor = ColorSchemeKeyTokens.SurfaceContainerHighest;
    private static final float ClockDialContainerSize = Dp.m6638constructorimpl((float) 256.0d);
    private static final TypographyKeyTokens ClockDialLabelTextFont = TypographyKeyTokens.BodyLarge;
    private static final ColorSchemeKeyTokens ClockDialSelectedLabelTextColor = ColorSchemeKeyTokens.OnPrimary;
    private static final ColorSchemeKeyTokens ClockDialSelectorCenterContainerColor = ColorSchemeKeyTokens.Primary;
    private static final ShapeKeyTokens ClockDialSelectorCenterContainerShape = ShapeKeyTokens.CornerFull;
    private static final float ClockDialSelectorCenterContainerSize = Dp.m6638constructorimpl((float) 8.0d);
    private static final ColorSchemeKeyTokens ClockDialSelectorHandleContainerColor = ColorSchemeKeyTokens.Primary;
    private static final ShapeKeyTokens ClockDialSelectorHandleContainerShape = ShapeKeyTokens.CornerFull;
    private static final float ClockDialSelectorHandleContainerSize = Dp.m6638constructorimpl((float) 48.0d);
    private static final ColorSchemeKeyTokens ClockDialSelectorTrackContainerColor = ColorSchemeKeyTokens.Primary;
    private static final float ClockDialSelectorTrackContainerWidth = Dp.m6638constructorimpl((float) 2.0d);
    private static final ShapeKeyTokens ClockDialShape = ShapeKeyTokens.CornerFull;
    private static final ColorSchemeKeyTokens ClockDialUnselectedLabelTextColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.SurfaceContainerHigh;
    private static final float ContainerElevation = ElevationTokens.INSTANCE.m3194getLevel3D9Ej5fM();
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerExtraLarge;
    private static final ColorSchemeKeyTokens HeadlineColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final TypographyKeyTokens HeadlineFont = TypographyKeyTokens.LabelMedium;
    private static final ShapeKeyTokens PeriodSelectorContainerShape = ShapeKeyTokens.CornerSmall;
    private static final float PeriodSelectorHorizontalContainerHeight = Dp.m6638constructorimpl((float) 38.0d);
    private static final float PeriodSelectorHorizontalContainerWidth = Dp.m6638constructorimpl((float) 216.0d);
    private static final TypographyKeyTokens PeriodSelectorLabelTextFont = TypographyKeyTokens.TitleMedium;
    private static final ColorSchemeKeyTokens PeriodSelectorOutlineColor = ColorSchemeKeyTokens.Outline;
    private static final float PeriodSelectorOutlineWidth = Dp.m6638constructorimpl((float) 1.0d);
    private static final ColorSchemeKeyTokens PeriodSelectorSelectedContainerColor = ColorSchemeKeyTokens.TertiaryContainer;
    private static final ColorSchemeKeyTokens PeriodSelectorSelectedFocusLabelTextColor = ColorSchemeKeyTokens.OnTertiaryContainer;
    private static final ColorSchemeKeyTokens PeriodSelectorSelectedHoverLabelTextColor = ColorSchemeKeyTokens.OnTertiaryContainer;
    private static final ColorSchemeKeyTokens PeriodSelectorSelectedLabelTextColor = ColorSchemeKeyTokens.OnTertiaryContainer;
    private static final ColorSchemeKeyTokens PeriodSelectorSelectedPressedLabelTextColor = ColorSchemeKeyTokens.OnTertiaryContainer;
    private static final ColorSchemeKeyTokens PeriodSelectorUnselectedFocusLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens PeriodSelectorUnselectedHoverLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens PeriodSelectorUnselectedLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final ColorSchemeKeyTokens PeriodSelectorUnselectedPressedLabelTextColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final float PeriodSelectorVerticalContainerWidth = Dp.m6638constructorimpl((float) 52.0d);
    private static final float TimeSelector24HVerticalContainerWidth = Dp.m6638constructorimpl((float) 114.0d);
    private static final ShapeKeyTokens TimeSelectorContainerShape = ShapeKeyTokens.CornerSmall;
    private static final float TimeSelectorContainerWidth = Dp.m6638constructorimpl((float) 96.0d);
    private static final TypographyKeyTokens TimeSelectorLabelTextFont = TypographyKeyTokens.DisplayLarge;
    private static final ColorSchemeKeyTokens TimeSelectorSelectedContainerColor = ColorSchemeKeyTokens.PrimaryContainer;
    private static final ColorSchemeKeyTokens TimeSelectorSelectedFocusLabelTextColor = ColorSchemeKeyTokens.OnPrimaryContainer;
    private static final ColorSchemeKeyTokens TimeSelectorSelectedHoverLabelTextColor = ColorSchemeKeyTokens.OnPrimaryContainer;
    private static final ColorSchemeKeyTokens TimeSelectorSelectedLabelTextColor = ColorSchemeKeyTokens.OnPrimaryContainer;
    private static final ColorSchemeKeyTokens TimeSelectorSelectedPressedLabelTextColor = ColorSchemeKeyTokens.OnPrimaryContainer;
    private static final ColorSchemeKeyTokens TimeSelectorSeparatorColor = ColorSchemeKeyTokens.OnSurface;
    private static final TypographyKeyTokens TimeSelectorSeparatorFont = TypographyKeyTokens.DisplayLarge;
    private static final ColorSchemeKeyTokens TimeSelectorUnselectedContainerColor = ColorSchemeKeyTokens.SurfaceContainerHighest;
    private static final ColorSchemeKeyTokens TimeSelectorUnselectedFocusLabelTextColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens TimeSelectorUnselectedHoverLabelTextColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens TimeSelectorUnselectedLabelTextColor = ColorSchemeKeyTokens.OnSurface;
    private static final ColorSchemeKeyTokens TimeSelectorUnselectedPressedLabelTextColor = ColorSchemeKeyTokens.OnSurface;

    private TimePickerTokens() {
    }

    static {
        float f2 = (float) 80.0d;
        PeriodSelectorVerticalContainerHeight = Dp.m6638constructorimpl(f2);
        TimeSelectorContainerHeight = Dp.m6638constructorimpl(f2);
    }

    public final ColorSchemeKeyTokens getClockDialColor() {
        return ClockDialColor;
    }

    /* JADX INFO: renamed from: getClockDialContainerSize-D9Ej5fM, reason: not valid java name */
    public final float m3557getClockDialContainerSizeD9Ej5fM() {
        return ClockDialContainerSize;
    }

    public final TypographyKeyTokens getClockDialLabelTextFont() {
        return ClockDialLabelTextFont;
    }

    public final ColorSchemeKeyTokens getClockDialSelectedLabelTextColor() {
        return ClockDialSelectedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getClockDialSelectorCenterContainerColor() {
        return ClockDialSelectorCenterContainerColor;
    }

    public final ShapeKeyTokens getClockDialSelectorCenterContainerShape() {
        return ClockDialSelectorCenterContainerShape;
    }

    /* JADX INFO: renamed from: getClockDialSelectorCenterContainerSize-D9Ej5fM, reason: not valid java name */
    public final float m3558getClockDialSelectorCenterContainerSizeD9Ej5fM() {
        return ClockDialSelectorCenterContainerSize;
    }

    public final ColorSchemeKeyTokens getClockDialSelectorHandleContainerColor() {
        return ClockDialSelectorHandleContainerColor;
    }

    public final ShapeKeyTokens getClockDialSelectorHandleContainerShape() {
        return ClockDialSelectorHandleContainerShape;
    }

    /* JADX INFO: renamed from: getClockDialSelectorHandleContainerSize-D9Ej5fM, reason: not valid java name */
    public final float m3559getClockDialSelectorHandleContainerSizeD9Ej5fM() {
        return ClockDialSelectorHandleContainerSize;
    }

    public final ColorSchemeKeyTokens getClockDialSelectorTrackContainerColor() {
        return ClockDialSelectorTrackContainerColor;
    }

    /* JADX INFO: renamed from: getClockDialSelectorTrackContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m3560getClockDialSelectorTrackContainerWidthD9Ej5fM() {
        return ClockDialSelectorTrackContainerWidth;
    }

    public final ShapeKeyTokens getClockDialShape() {
        return ClockDialShape;
    }

    public final ColorSchemeKeyTokens getClockDialUnselectedLabelTextColor() {
        return ClockDialUnselectedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* JADX INFO: renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m3561getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    public final ColorSchemeKeyTokens getHeadlineColor() {
        return HeadlineColor;
    }

    public final TypographyKeyTokens getHeadlineFont() {
        return HeadlineFont;
    }

    public final ShapeKeyTokens getPeriodSelectorContainerShape() {
        return PeriodSelectorContainerShape;
    }

    /* JADX INFO: renamed from: getPeriodSelectorHorizontalContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3562getPeriodSelectorHorizontalContainerHeightD9Ej5fM() {
        return PeriodSelectorHorizontalContainerHeight;
    }

    /* JADX INFO: renamed from: getPeriodSelectorHorizontalContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m3563getPeriodSelectorHorizontalContainerWidthD9Ej5fM() {
        return PeriodSelectorHorizontalContainerWidth;
    }

    public final TypographyKeyTokens getPeriodSelectorLabelTextFont() {
        return PeriodSelectorLabelTextFont;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorOutlineColor() {
        return PeriodSelectorOutlineColor;
    }

    /* JADX INFO: renamed from: getPeriodSelectorOutlineWidth-D9Ej5fM, reason: not valid java name */
    public final float m3564getPeriodSelectorOutlineWidthD9Ej5fM() {
        return PeriodSelectorOutlineWidth;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorSelectedContainerColor() {
        return PeriodSelectorSelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorSelectedFocusLabelTextColor() {
        return PeriodSelectorSelectedFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorSelectedHoverLabelTextColor() {
        return PeriodSelectorSelectedHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorSelectedLabelTextColor() {
        return PeriodSelectorSelectedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorSelectedPressedLabelTextColor() {
        return PeriodSelectorSelectedPressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedFocusLabelTextColor() {
        return PeriodSelectorUnselectedFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedHoverLabelTextColor() {
        return PeriodSelectorUnselectedHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedLabelTextColor() {
        return PeriodSelectorUnselectedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getPeriodSelectorUnselectedPressedLabelTextColor() {
        return PeriodSelectorUnselectedPressedLabelTextColor;
    }

    /* JADX INFO: renamed from: getPeriodSelectorVerticalContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3565getPeriodSelectorVerticalContainerHeightD9Ej5fM() {
        return PeriodSelectorVerticalContainerHeight;
    }

    /* JADX INFO: renamed from: getPeriodSelectorVerticalContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m3566getPeriodSelectorVerticalContainerWidthD9Ej5fM() {
        return PeriodSelectorVerticalContainerWidth;
    }

    /* JADX INFO: renamed from: getTimeSelector24HVerticalContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m3567getTimeSelector24HVerticalContainerWidthD9Ej5fM() {
        return TimeSelector24HVerticalContainerWidth;
    }

    /* JADX INFO: renamed from: getTimeSelectorContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m3568getTimeSelectorContainerHeightD9Ej5fM() {
        return TimeSelectorContainerHeight;
    }

    public final ShapeKeyTokens getTimeSelectorContainerShape() {
        return TimeSelectorContainerShape;
    }

    /* JADX INFO: renamed from: getTimeSelectorContainerWidth-D9Ej5fM, reason: not valid java name */
    public final float m3569getTimeSelectorContainerWidthD9Ej5fM() {
        return TimeSelectorContainerWidth;
    }

    public final TypographyKeyTokens getTimeSelectorLabelTextFont() {
        return TimeSelectorLabelTextFont;
    }

    public final ColorSchemeKeyTokens getTimeSelectorSelectedContainerColor() {
        return TimeSelectorSelectedContainerColor;
    }

    public final ColorSchemeKeyTokens getTimeSelectorSelectedFocusLabelTextColor() {
        return TimeSelectorSelectedFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getTimeSelectorSelectedHoverLabelTextColor() {
        return TimeSelectorSelectedHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getTimeSelectorSelectedLabelTextColor() {
        return TimeSelectorSelectedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getTimeSelectorSelectedPressedLabelTextColor() {
        return TimeSelectorSelectedPressedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getTimeSelectorSeparatorColor() {
        return TimeSelectorSeparatorColor;
    }

    public final TypographyKeyTokens getTimeSelectorSeparatorFont() {
        return TimeSelectorSeparatorFont;
    }

    public final ColorSchemeKeyTokens getTimeSelectorUnselectedContainerColor() {
        return TimeSelectorUnselectedContainerColor;
    }

    public final ColorSchemeKeyTokens getTimeSelectorUnselectedFocusLabelTextColor() {
        return TimeSelectorUnselectedFocusLabelTextColor;
    }

    public final ColorSchemeKeyTokens getTimeSelectorUnselectedHoverLabelTextColor() {
        return TimeSelectorUnselectedHoverLabelTextColor;
    }

    public final ColorSchemeKeyTokens getTimeSelectorUnselectedLabelTextColor() {
        return TimeSelectorUnselectedLabelTextColor;
    }

    public final ColorSchemeKeyTokens getTimeSelectorUnselectedPressedLabelTextColor() {
        return TimeSelectorUnselectedPressedLabelTextColor;
    }
}
