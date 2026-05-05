package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message contained an invalid tag (zero).
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidTag(InvalidProtocolBufferException.java:89)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.readTag(CodedInputStream.java:164)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipMessage(CodedInputStream.java:299)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.skipField(CodedInputStream.java:251)
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
/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"ЯŁ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013ǞJ~8,\u001aՄ\u000ff\u000198DkH6Ri*\u0017ӆ\u00044:[,qI@]\u001a\u0014\"\u0011OTkonXc\u0013C\u0015\u000b\u001ex\u0001,QU~^\u001a\u000fHBw?9Tw=O`|6\u000b&:\"Ny\r\u0001 .P\u0010\rzKK\"\u00128@v?Z\rc\u0005\"\u0012\u001c>(\u0001,\\oN<It]P/+\u0003oCV'u0\u0005M\u0013I\\'#vi\u001e1Z?5+%[\u0003\rXc?\u0019?y=\u000bh/'AI{Ɏ>X\u0016\u0014\u001dۀW\rsr.ؘ\rQv\f/+UdQִ$ߊ(z*\f|!\u001e\n5HF-Hg\u0018\u0012Av\u000bSnS\u0012dP\u0004\u0013cL\u0016S\u0005Ĵ/9)l\u001aeI\u0014f7*\u001eU\u00151|\u0007!\n\u001f>d#\u0010lw\u007f'\u0002DKEf\n\b3\u001e\t~`\u001a+2\u0383F04\n\u0000-/%eti)/Ȁ\u0001`E\u0016ϼ\u0004\u0011na֤Q`APÈ\u0015g:\u0017YrPt\u0007{P\u0003'<\u0013]\u001c\u0003Q,PC&jʃ;9&>ʢN\u0019oxܝ\\\"&]ϓ6\nryeo9\r\fΉPүߧeV|ܨ>JЁ\u0004)tPZ$\\r'P:\u001fН\u001cȑ\u007fDVۼcaM|44Z;I`#Q\u001b\u001epK3M\u001e\u001f?ɴцTו#Ѱɦ#s֊\u0005`druw\u0007ZD~f.;Nq7\u001f4c19]\u000b6\u001f~\"\u0012wkZPdlD\b\f@^Zpߠ֦/ˮ\u0017\u001f\u0007+8\u001a;Vdtke['G|\u0003\u0010\u001dR9Wu\"\u0003pZy\u001bN]]/\"%w)gF)VןӢFیKs\\\ra]W\u0004\u001b[BiF\u0019%!$B\u000f\u000er\fCM['K7߳\u00185\u001d˕ukuP\b\u0006_@\u0003\n\u001c.y\u0015\u001e\b(Ϩ>֑<Ua˚V$*\u0013\u0011ihl}0P2\u00056ArYd\u001fohQ\u00198\u0016f5EC5\u0015 \u0011ܫ̙}ӑ2o2uI*\"o['\u0017wa\u0004\u000eoQ\b\u0019h_&\u0019)In@5m$d`z\t^\u001f2X\rהGك\tB\u0011ӗL.B5\u0019_%u\u0014>\u0013\u007ft\u000feĢ4¡w;^Օ%\njZ`\u0007vD\u000f&Ǆ\u0005\u0005\u0017ɼ6z;a\u0013\u001f\u0017z=\u0017J\u0003i\u001c7#\u001bU\r\u0019=-ZSg#^\u001d?O\u001cؖO͕\u0006@\u001cI/\"y%,:\u001e3+yhAG\u000b)a\r/\rC\u0006j\\\u0017\u000f\u0014|Q|Z_C9Adں\u0016۪\u000f#gtu\u001d;\bny=\u007f(>gX7E$\u0005sJ+/\u001c4[uw*jՠ}\u009cW;\u0006ИpO5E\r!\u000b\u0018>j\u0018f3:D2L'@MiЪ\u070f\u0004ͱIƓԓ\t-ĝ:_\n5\bYlj\u0004y'\u00035n\r\bH\u0010v>Z~z+\u0007a\u001b\u0005v1\u0005C~/`\u001d7q{v \\`BÎk\"^\\\u000e`eA-\u0004 n9\u0012_c\u0017?{Qk\rYy\u001arՀ56Zʴ\u0016!\u007fE\u0012v%@#\fnYNf\u0019\\\u001b\u0011g\u0010njV/#T\u007fذ\t۫L^\u0019ӂ\u0005U\u0001o|/ek۵_\u0013O֜\u001f\u0006K\u001d4u\u0002aM\u001dO29rĬz\u0017\u000b̌zv\u0006\u007fP_C u\u0004EF\u0003\u0016pŢe߷lѦޗ%JԺ<P\u0010,\u001fi)1`\u0012.K|\u001c\"\u0016_B\u0012H\u001f]-84y7\u001dCsiSS47A?Q\u0016ƞ۶kĘrقā\".ތs+_hA\u0005Cvd)\u0012_sW\u001fOi5\u001dp|rC&6y\u0004Y0\u000e--<\u0006$<6\no\r\u0001تЖ@ҕwg\f(0\u001a|U;IrZ\u0002&Lk\u001eVry2]O_,\u0019rWZ1z\u0010]M\u0017\u0013A\tK\njɥʣ\u0006Ԡ7'\u0005\u0012UYN<atS\u0015jy\\\u0015yjHP2_\b0XYX\u001f]\u0016bl\u0003j\u001cj\u0016TvVcŶՌwٽVp\bb#\u00045\\\u000fH<F\u0007iad\u0011+\u001dB/WPx#\u0006DGx\u001b\u0010\u0007b`C,i\f2\u0006\u001ȅͮ{ؗ!!c'\f\u0015u{_A[_fYY5\u0011\\Xv\u0006}j\u0005m!ye\u0002۩\fԐ/:O݊V\u001c0I\u0014\u007fefN\u0003Rl\u0015B{%H2f}\t94Ӥ(؞Aa\u001d֧\u00174h.i\\1-=P|Lз#6\u0001\u0005\tߒ]G\u0012\u0013\u001eYXߐ'ў\f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001em\u0018*KW*kG-ula@\u0006Q;J\u0006'\u001d", "", "BdgA7,ES\u001bz\n^", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=,CBk6\u001a$h7", "@dR<`7Ha\u0019lxh7|", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9z<t/=d\b.7[\u00148XC\u0011", "9dh/b(KRv\t\u0004m9\u0007\u00106e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n#c~/Ii#.3COh>\u001a\"g?C\u0010r9X}.GY$", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001\\\u0016A\\\";r4 \u0011wa\u000fm_5M\u00041KKauZ\\zH\u001e ZW[;\u0016\u0014]I$817\u001d\u00124T\fIhn\n \u00195@W>_\u000fT\u0004\u0019tTrfPaj\u0004UA\u000fr..\u0017f\u0019k;D1\u001c;\u0007%i_@\u0006\tSvrfvqcT\u0018XB-MzeMLob\u00128\u0018", "-kPFb<M1#\t\b]0\u0006\u0005>e\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006]!Ic\u000e/\u0015w ;LGDgC\u001e#>", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "2d[2g0H\\\u0004\fzo0|\u001b\u0012i\u0002+\u0003D\u0003\u001a&4k\u0017>v", "5dc\u0011X3>b\u001d\t\u0004I9|\u001a3e\u0012\u000b\u007fB\u0004\u001e\u001bIr\u001d)r.7YE\u001f\u000bWa6-#", "u(9", "Adc\u0011X3>b\u001d\t\u0004I9|\u001a3e\u0012\u000b\u007fB\u0004\u001e\u001bIr\u001d)r.7YEoLk]=4\u0016", "uI\u0018#", "2d[2g0H\\\u0004\fzo0|\u001b\u0012i\u0002+\u0003D\u0003\u001a&4k\u0017>vc4Y\u0005 9i%.", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001ai\u001f-TC)z0-\u0015>", "6`]1_,,b\u0015\u000ez", "5dc\u0015T5=Z\u0019l\nZ;|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7x*VBBk\"-\u0011wa\u000f", "Adc\u0015T5=Z\u0019l\nZ;|", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001P\u00127LJ;YC\u001a$h7|w", "6`]1_,,b\u0015\u000ez\u001d+|\u0010/g{7{", "", "6`b\u0013b*Na", "5dc\u0015T:\u001f]\u0017\u000f\t", "u(I", "Adc\u0015T:\u001f]\u0017\u000f\t", "uY\u0018#", "6`b\u0013b*NaW}ze,~\u0005>e", "6hV5_0@V(ivb5\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n U\u0002)FC", "5dc\u0015\\.AZ\u001d\u0001}m\u0017x\r8t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#h\u001c;v%\u0004", "7m_Bg\u001a>a'\u0003\u0005g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|y7XSJY4,#lkB\\", "5dc\u0016a7Nb\u0007~\tl0\u0007\u0012", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri&m)=1LF{C\f\u0015vo=\u0011l\u0002", "Adc\u0016a7Nb\u0007~\tl0\u0007\u0012", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W@\u007f0EhG\u000f7\u0001%\u0012VNKz\"\u001e#veC\u00109o?", "7r8;G6NQ\u001cf\u0005],", "Adc\u0016a\u001bHc\u0017\u0002bh+|", "7r8;G6NQ\u001cf\u0005],;\b/l\u007f*wO\u0001", "7r;.l6Nb\u0006~\tn3\fv>a\u0007(", "9dh/b(KRt|\nb6\u0006u?n\t(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u0010\u001c$lkBss5Wv4\u001d", "5dc\u0018X@;]\u0015\fy<6\u0006\u0018<o\u0007/{M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#k*8|(*ZC!kH\u001b\u001fdn8dm5]\u00041NSN92", "D`[BX", ":`h<h;\u001c]#\fyb5x\u0018/s", "5dc\u0019T@Hc(\\\u0005h9{\r8a\u000f(\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n\u001cU\u0012*G|s8WP:o=\u001a$ho\u000f", "Adc\u0019T@Hc(\\\u0005h9{\r8a\u000f(\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001e\u0013[y\u001eK@\f1m\b0FK 8ZB?t0-\u0015v7|w", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=4?OuD-\u0002hoI\u000er\u0017[\u0001:[\"", ":`h<h;+S'\u000f\u0002m", "5dc\u0019T@Hc(kzl<\u0004\u0018", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u0005.`R\"gH(%wN9\u0015s3]a4Q_b\u0002", "Adc\u0019T@Hc(kzl<\u0004\u0018", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001\\\u0016A\\*7\u007f>.$UaG\u0017j;9\u00041Z`$oM", ":`h<h;+S'\u000f\u0002m\u001a\f\u0005>e", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9lGL", ";h]\u0015X0@V(_\u0005k\u001a\u0001\u00121l\u007f\u000f\u007fI\u0001w\u001bGv\r", "5dc\u001a\\5!S\u001d\u0001}m\r\u0007\u0016\u001di\t*\u0003@g\u001b GP\u0012<}$|8Q\u007f<=\u0017\u0016", "u(5", "Adc\u001a\\5!S\u001d\u0001}m\r\u0007\u0016\u001di\t*\u0003@g\u001b GP\u0012<}$|$Nr\u0002r\u0010|", "uE\u0018#", ";h]\u0015X0@V(_\u0005k\u001a\u0001\u00121l\u007f\u000f\u007fI\u0001w\u001bGv\rzu%<Y\u007f\u001cFm", "=m8:X\b<b\u001d\t\u0004I,\n\n9r\b(z", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#a(7I\u0014=QMDA", "", "5dc\u001ca\u0010FSt|\nb6\u0006s/r\u00012\tH\u0001\u0016", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "=mE._<>1\u001cz\u0004`,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "5dc\u001ca\u001d:Z)~Xa(\u0006\u000b/", "=mE._<>1\u001cz\u0004`,f\u00163g\u00041wG", ">q^0X:L]&", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#]\u001f;|\u0001;WA;yB(\">", "5dc\u001de6<S'\r\u0005k", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri\u0017l\u001a=8PEi4,#rn\u000f", "5dc\u001fX*H[$\t\t^\u001az\u0013:e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EM\u0011 &Kw\u000e\u0006c%3c\u0006+A{\u0016\u001cKMFk\n", "Ad[2V;B]\"[v\\2~\u00169u\t'YJ\b!$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013c\u0005*DC", "5dc X3>Q(\u0003\u0005g\tx\u00075g\r2\fI\u007ft!Ny\u001b\u0004A$\u0007Sc%'", "Adc X3>Q(\u0003\u0005g\tx\u00075g\r2\fI\u007ft!Ny\u001b\u0004I\u001f\b%\u0005'\u0013", "\u0018", "Ad[2V;B]\"i\b^=\u0001\tAH\u0004*~G\u0005\u0019\u001aV\\\nEx%", "5dc X3>Q(\u0003\u0005g\u0017\n\t@i\u007f:^D\u0003\u001a\u001eKq\u0011Kc!>[}g6A\u007fyU#\u001b", "Adc X3>Q(\u0003\u0005g\u0017\n\t@i\u007f:^D\u0003\u001a\u001eKq\u0011Kc!>[}g\u0007\u0003\u0014u\\*\u000e", "Ad[2V;B]\"i\b^=\u0001\tAH\u0004*~G\u0005\u0019\u001aV\\\nEx%sX}'7o\u0012=M", "Ag^D6<Ka#\f]Z5{\u0010/", "5dc [6P1)\f\th9_\u00058d\u0007(", "Adc [6P1)\f\th9_\u00058d\u0007(", "Ag^D6<Ka#\f]Z5{\u0010/$~(\u0003@\u0003\u0013&G", "Ag^D93HO(\u0003\u0004`\u001b\u0007\u00136b{5", "5dc [6P4 \tvm0\u0006\u000b\u001eo\n/x<\u000e", "Adc [6P4 \tvm0\u0006\u000b\u001eo\n/x<\u000e", "Ag^D93HO(\u0003\u0004`\u001b\u0007\u00136b{5:?\u0001\u001e\u0017Ik\u001d<", "Ag^DF,ES\u0017\u000e~h5_\u00058d\u0007([I\u007f", "5dc [6PA\u0019\u0006z\\;\u0001\u00138H{1zG\u0001v F", "Adc [6PA\u0019\u0006z\\;\u0001\u00138H{1zG\u0001v F", "Ag^DF,ES\u0017\u000e~h5_\u00058d\u0007([I\u007fU\u0016Gv\u000e>r45", "Ag^DF,ES\u0017\u000e~h5_\u00058d\u0007(iO|$&", "5dc [6PA\u0019\u0006z\\;\u0001\u00138H{1zG\u0001\u0005&C|\u001d", "Adc [6PA\u0019\u0006z\\;\u0001\u00138H{1zG\u0001\u0005&C|\u001d", "Ag^DF,ES\u0017\u000e~h5_\u00058d\u0007(iO|$&\u0006n\u000eCv'1h}", "5dc!X?M2\u0019\u0006z`(\f\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u0005.`R\u001ak;\u001e\u0017dp9\\", "Adc!X?M2\u0019\u0006z`(\f\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001\\\u0016A\\\";r4 \u0011wa\u000fJT", "Cmc?T5LT#\f\u0003^+k\tBt", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "5dc\"a;KO\"\r{h9\u0005\t.T\u007f;\u000b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006R.>c\r\u001cFm\u0015\u001c\\P?t6s", "Adc\"a;KO\"\r{h9\u0005\t.T\u007f;\u000b", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\na\u0006", "6`b\u0015\\.AZ\u001d\u0001}m", "CoS.g,", "DhbBT3-S,\u000e", "BdgAF;RZ\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4#h\u0012'7C", "AnUAJ9:^", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "9dh/b(KRt|\nb6\u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001dm*+W?Hj\u0010\u001c$lkB\u00159", "4nRBf\u0014:\\\u0015\u0001zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Ege\u001c@i\u0018.Z\u0019", "CoS.g,\u0006T\"\u0002K.\u001cz", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0005\u0011q`F\u0011g+a@%QTY6jR<M\u0018[i\u000ea:V`bJ.}@F\u001f\u0007\u001aX\u000f?q\u0003a|\n>i}LZ\u000fZC\u0013\u007fI4rTY)\nK\u000bTb=sUN\u001doI(3(x\u0019p]7*\u0013z`\u001bvQ\r1eQ!\u0006B2>7kJ\u000f\u007f^@\u0004p}K\u0005\u0006\u0016AlJ\u0012p6\u0003A4:c\u0018\u0015e\"Fi\u0003#,&Q+oE<&N\u0015d\u007fuMWI)j\u0017n^=5 y$PH\u001d\u0011d([B7F\u0007Aa\rBR9\u001a8NHCk\u0003\u0013\u0018\u000b.vs\u0013$+]~)tN++fi~o\u0017)8\u001a<lXf4gBW!\t29\u0016\fbB\u0011\u007fL\u001av\u0015\u0002[j~m\u001cx%F+/X;RPRs\u001a\u001fBVqz&rvL}5&n#GaCln/TwWk\u001aq6,-v\u0012\fPP|Fs0\u0011\u007f\u000euRy!/", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class LegacyTextFieldState {
    public static final int $stable = 8;
    private LayoutCoordinates _layoutCoordinates;
    private TextInputSession inputSession;
    private final KeyboardActionRunner keyboardActionRunner;
    private final SoftwareKeyboardController keyboardController;
    private final RecomposeScope recomposeScope;
    private TextDelegate textDelegate;
    private AnnotatedString untransformedText;
    private final EditProcessor processor = new EditProcessor();
    private final MutableState hasFocus$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState minHeightForSingleLineField$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m6636boximpl(Dp.m6638constructorimpl(0)), null, 2, null);
    private final MutableState<TextLayoutResultProxy> layoutResultState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState handleState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(HandleState.None, null, 2, null);
    private final MutableState showFloatingToolbar$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState showSelectionHandleStart$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState showSelectionHandleEnd$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableState showCursorHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private boolean isLayoutResultStale = true;
    private final MutableState isInTouchMode$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    private Function1<? super TextFieldValue, Unit> onValueChangeOriginal = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$onValueChangeOriginal$1
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TextFieldValue textFieldValue) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
            invoke2(textFieldValue);
            return Unit.INSTANCE;
        }
    };
    private final Function1<TextFieldValue, Unit> onValueChange = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$onValueChange$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
            invoke2(textFieldValue);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TextFieldValue textFieldValue) {
            String text = textFieldValue.getText();
            AnnotatedString untransformedText = this.this$0.getUntransformedText();
            if (!Intrinsics.areEqual(text, untransformedText != null ? untransformedText.getText() : null)) {
                this.this$0.setHandleState(HandleState.None);
            }
            this.this$0.m1358setSelectionPreviewHighlightRange5zctL8(TextRange.Companion.m6128getZerod9O1mEE());
            this.this$0.m1355setDeletionPreviewHighlightRange5zctL8(TextRange.Companion.m6128getZerod9O1mEE());
            this.this$0.onValueChangeOriginal.invoke(textFieldValue);
            this.this$0.getRecomposeScope().invalidate();
        }
    };
    private final Function1<ImeAction, Unit> onImeActionPerformed = new Function1<ImeAction, Unit>() { // from class: androidx.compose.foundation.text.LegacyTextFieldState$onImeActionPerformed$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
            m1360invokeKlQnJC8(imeAction.m6291unboximpl());
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
        public final void m1360invokeKlQnJC8(int i2) {
            this.this$0.keyboardActionRunner.m1336runActionKlQnJC8(i2);
        }
    };
    private final Paint highlightPaint = AndroidPaint_androidKt.Paint();
    private long selectionBackgroundColor = Color.Companion.m4214getUnspecified0d7_KjU();
    private final MutableState selectionPreviewHighlightRange$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextRange.m6111boximpl(TextRange.Companion.m6128getZerod9O1mEE()), null, 2, null);
    private final MutableState deletionPreviewHighlightRange$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TextRange.m6111boximpl(TextRange.Companion.m6128getZerod9O1mEE()), null, 2, null);

    public LegacyTextFieldState(TextDelegate textDelegate, RecomposeScope recomposeScope, SoftwareKeyboardController softwareKeyboardController) {
        this.textDelegate = textDelegate;
        this.recomposeScope = recomposeScope;
        this.keyboardController = softwareKeyboardController;
        this.keyboardActionRunner = new KeyboardActionRunner(softwareKeyboardController);
    }

    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public final void setTextDelegate(TextDelegate textDelegate) {
        this.textDelegate = textDelegate;
    }

    public final RecomposeScope getRecomposeScope() {
        return this.recomposeScope;
    }

    public final SoftwareKeyboardController getKeyboardController() {
        return this.keyboardController;
    }

    public final EditProcessor getProcessor() {
        return this.processor;
    }

    public final TextInputSession getInputSession() {
        return this.inputSession;
    }

    public final void setInputSession(TextInputSession textInputSession) {
        this.inputSession = textInputSession;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    public final void setHasFocus(boolean z2) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getMinHeightForSingleLineField-D9Ej5fM */
    public final float m1352getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((Dp) this.minHeightForSingleLineField$delegate.getValue()).m6652unboximpl();
    }

    /* JADX INFO: renamed from: setMinHeightForSingleLineField-0680j_4 */
    public final void m1356setMinHeightForSingleLineField0680j_4(float f2) {
        this.minHeightForSingleLineField$delegate.setValue(Dp.m6636boximpl(f2));
    }

    public final LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates layoutCoordinates = this._layoutCoordinates;
        if (layoutCoordinates == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        return layoutCoordinates;
    }

    public final void setLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this._layoutCoordinates = layoutCoordinates;
    }

    public final TextLayoutResultProxy getLayoutResult() {
        return this.layoutResultState.getValue();
    }

    public final void setLayoutResult(TextLayoutResultProxy textLayoutResultProxy) {
        this.layoutResultState.setValue(textLayoutResultProxy);
        this.isLayoutResultStale = false;
    }

    public final AnnotatedString getUntransformedText() {
        return this.untransformedText;
    }

    public final void setUntransformedText(AnnotatedString annotatedString) {
        this.untransformedText = annotatedString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HandleState getHandleState() {
        return (HandleState) this.handleState$delegate.getValue();
    }

    public final void setHandleState(HandleState handleState) {
        this.handleState$delegate.setValue(handleState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowFloatingToolbar() {
        return ((Boolean) this.showFloatingToolbar$delegate.getValue()).booleanValue();
    }

    public final void setShowFloatingToolbar(boolean z2) {
        this.showFloatingToolbar$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleStart() {
        return ((Boolean) this.showSelectionHandleStart$delegate.getValue()).booleanValue();
    }

    public final void setShowSelectionHandleStart(boolean z2) {
        this.showSelectionHandleStart$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowSelectionHandleEnd() {
        return ((Boolean) this.showSelectionHandleEnd$delegate.getValue()).booleanValue();
    }

    public final void setShowSelectionHandleEnd(boolean z2) {
        this.showSelectionHandleEnd$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCursorHandle() {
        return ((Boolean) this.showCursorHandle$delegate.getValue()).booleanValue();
    }

    public final void setShowCursorHandle(boolean z2) {
        this.showCursorHandle$delegate.setValue(Boolean.valueOf(z2));
    }

    public final boolean isLayoutResultStale() {
        return this.isLayoutResultStale;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInTouchMode() {
        return ((Boolean) this.isInTouchMode$delegate.getValue()).booleanValue();
    }

    public final void setInTouchMode(boolean z2) {
        this.isInTouchMode$delegate.setValue(Boolean.valueOf(z2));
    }

    public final Function1<TextFieldValue, Unit> getOnValueChange() {
        return this.onValueChange;
    }

    public final Function1<ImeAction, Unit> getOnImeActionPerformed() {
        return this.onImeActionPerformed;
    }

    public final Paint getHighlightPaint() {
        return this.highlightPaint;
    }

    /* JADX INFO: renamed from: getSelectionBackgroundColor-0d7_KjU */
    public final long m1353getSelectionBackgroundColor0d7_KjU() {
        return this.selectionBackgroundColor;
    }

    /* JADX INFO: renamed from: setSelectionBackgroundColor-8_81llA */
    public final void m1357setSelectionBackgroundColor8_81llA(long j2) {
        this.selectionBackgroundColor = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSelectionPreviewHighlightRange-d9O1mEE */
    public final long m1354getSelectionPreviewHighlightRanged9O1mEE() {
        return ((TextRange) this.selectionPreviewHighlightRange$delegate.getValue()).m6127unboximpl();
    }

    /* JADX INFO: renamed from: setSelectionPreviewHighlightRange-5zc-tL8 */
    public final void m1358setSelectionPreviewHighlightRange5zctL8(long j2) {
        this.selectionPreviewHighlightRange$delegate.setValue(TextRange.m6111boximpl(j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getDeletionPreviewHighlightRange-d9O1mEE */
    public final long m1351getDeletionPreviewHighlightRanged9O1mEE() {
        return ((TextRange) this.deletionPreviewHighlightRange$delegate.getValue()).m6127unboximpl();
    }

    /* JADX INFO: renamed from: setDeletionPreviewHighlightRange-5zc-tL8 */
    public final void m1355setDeletionPreviewHighlightRange5zctL8(long j2) {
        this.deletionPreviewHighlightRange$delegate.setValue(TextRange.m6111boximpl(j2));
    }

    public final boolean hasHighlight() {
        return (TextRange.m6117getCollapsedimpl(m1354getSelectionPreviewHighlightRanged9O1mEE()) && TextRange.m6117getCollapsedimpl(m1351getDeletionPreviewHighlightRanged9O1mEE())) ? false : true;
    }

    /* JADX INFO: renamed from: update-fnh65Uc */
    public final void m1359updatefnh65Uc(AnnotatedString annotatedString, AnnotatedString annotatedString2, TextStyle textStyle, boolean z2, Density density, FontFamily.Resolver resolver, Function1<? super TextFieldValue, Unit> function1, KeyboardActions keyboardActions, FocusManager focusManager, long j2) {
        this.onValueChangeOriginal = function1;
        this.selectionBackgroundColor = j2;
        KeyboardActionRunner keyboardActionRunner = this.keyboardActionRunner;
        keyboardActionRunner.setKeyboardActions(keyboardActions);
        keyboardActionRunner.setFocusManager(focusManager);
        this.untransformedText = annotatedString;
        TextDelegate textDelegateM1394updateTextDelegaterm0N8CA$default = TextDelegateKt.m1394updateTextDelegaterm0N8CA$default(this.textDelegate, annotatedString2, textStyle, density, resolver, z2, 0, 0, 0, CollectionsKt.emptyList(), 448, null);
        if (this.textDelegate != textDelegateM1394updateTextDelegaterm0N8CA$default) {
            this.isLayoutResultStale = true;
        }
        this.textDelegate = textDelegateM1394updateTextDelegaterm0N8CA$default;
    }
}
