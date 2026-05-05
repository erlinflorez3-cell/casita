package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import yg.InterfaceC1492Gx;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    kotlin.metadata.InconsistentKotlinMetadataException: Exception occurred when reading Kotlin metadata
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:108)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:71)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:37)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:35)
    Caused by: kotlin.metadata.internal.protobuf.InvalidProtocolBufferException: Protocol message end-group tag did not match expected tag.
    	at kotlin.metadata.internal.protobuf.InvalidProtocolBufferException.invalidEndTag(InvalidProtocolBufferException.java:94)
    	at kotlin.metadata.internal.protobuf.CodedInputStream.checkLastTagWas(CodedInputStream.java:180)
    	at kotlin.metadata.internal.protobuf.AbstractParser.parsePartialFrom(AbstractParser.java:194)
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
/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŉ\u0014D57\u001eq\u007fR܀kŞ\fA\u001c0\u0013.H~*,(w\u000ffp<8D{H6RY0\u0017k\n:,[*sK;k\u001a\u0006\"\u000fSVguwRZ\u0011L\u0017\u0006,xr,OX\u0001](\u000f:BuB;M\u0006=A`z7\r H\"@y\u000b\u0004\"*^\u0010~ٙKK\"\u00128@~:Z\rS\t\"\u0012\u001c>(ҵ&\\}N>Hr`B/9\u0003qBT*g0\u0013M\u0015FZ(\u0015vw\u001e3@=>\u001d%i\u0003\u000fRaM\u000b?\b=\rh-33I\nW>X\u0006\u0014\u001d+e\rer,o\rQv\f/+UkSP$(\u007fz\u0002\u000fBǉ$ͺWH\\,Zu\u0018\u00169t\u0001SXR\u0018]p\u0001ѐe6%'H>9(3f\u007f&\u0002ϊ\u05ee;{\u000b|f9\u000f_9[\u0003R\u0011\u0019)F\u0010Q_[ή<ʰݳ\u000e[C`\u0012d+\u00178xHG.s,\u00174\u00173-s9Q@2ȵҩHg|{)\taajHnc\u001f\u001aE#!\f\t\"\u0015\tyJlXZ\f\u0014\u001cϺ\u0006âݔ\u0017\"bsJ\u001em\u001c\\M\u0001i\u0019'$܃ɻ3g=իm4\u001beެ]K5\u007f(VР؏z\u0015EֽaMtt̿R$Z\u000blR:Nj\u001ei\u0014Fd\u000bA<\u0006ڤ̂3ι֞\u001d]\u001bȂ\u0002fZOҗ\bwZ\u0017T/[9$\u0011Ǵ#\r\t/o#ʙ״kyO؛{)/;۔PM\u0019T\u001ahֻط\u0001$\rѲrHOuցFdmD\u07fbTB ^:G֤.U\u0013=\tY8\u0010ΝDds\u0014ˇLX\u05fdю{xԱ:Ü\u05cek\fpҁ+nʕI\u0018s%ȃuvrQ\u0012\u0015\u0005\bӦE\u0013G\u0012sQϵǥHqľXߢҡ<\u0001\u000bȨ\u001d3˯nj\u0013CԜB?\u001dDQD4#˨\\\u0002o\\\u0019)χ֑xf\nБb^|pЫ\\J;f\u000e ˚й&%rðA\u0011w\u0006پA!4;R\u000fШяtW>Ԣ\nw\u000bt\u009a+%p\u0005 \u0001ܤ̭\u000254ʛ)<P\fє][%?\u0012\u001a܊ƽqLbׄIW%\u0019֪0\u0007\u0012J\u0002P[eţ\bH\u0006\"\u0013|\u05cdߞaŝØ\r':ʘ;\u0016~\fewѕ\u000f\u0013\u007ft$?\u001d@¢rSW<֯w#V\u0011 nҊ_9*/C?8,\u05ce4I\u0005\u001cA\u001bЏӫ1ܬӘ!\f!˩N\rZm8RȜ83(\u0007EQԵزGJ\bԶ\u0003\u00109{Ên$8FAMG&ò8i\u0011\u000e\u0016v^S\u001fr͛c\u000f\u0012\u0015M~&7a\u0013|<}:\u0014\u0019ĬN\u000bo\u00117|S\u0006̭B2\u0001EcY\f\u001aƄb^\u001b[%e3Kǅi,(*©Rk\u0003\u0016ç\u001f?\u0004#@#ẈeŊܤ\u001f>\u001c\u07bc\u0015p֢\bcj.\u0007FL\u000bq82^ˇ[ױ7\u000e\u001bȅqm}&N-Kn\fIYpI=qw{pk\n1pa\\\bwER3\bUWdW\u0017\u001b\u0011Õֵ Ⱦ\u0010֧ɭ\u0014%̢:\u0018j+\u0016_qy\tmUg\u001b8Om0o??#.\f1\u0012w\u001a)\u0003;k͊b؉Bf\u0011\\zV(\"l\u007f@d#\u0016\u007fذ\t݁G՝Ȱ\u00123лv l/E/oo\u001b^x\u00072O \u0091-މQ̈ن61цs*~\u0011\u0011P3\"\u000eCZ\u000b\t~\u0016D]LbF2)o#\u001c|9j\n\u0006\u000f܉ݙ,י\u0012!7\\>>Lm2\u001eAkA\\9\u0013\u00071F#@0'U\u0003Q\u0002DZ\u0005\u000b\n%?(P\"~2{Iܓ˓\u000fΘ\u001fgn=+Zs]?\u000e\b\u0007X!me\\2oP\u001a^SD\u0012Un\u001f:#2-\u001euQ\u001f{u\u0007n6ЎȍVؾ[\u0014.,<\u0018R4_n~\u001b\u0018N\n\u001ay\ri\u0006\u0005[\t>1FT)[\u0018]żY˫}\u0017LԹ]\u0016=;\u0014VS\u0019\u0003>]!\u0011EW#e1r\\jDJ̣FߴeB\u0002ÙX[08;Etep\u001f{\u00070\"FH%\r2/\bװbڞd# ñcxLnj2\u001eYpEX\u000fR\u001a\u0005˸\u0018ƨ\n\"6Ѓ/\u0004\u0004\u0007nR35M2O\u0007bb\na5\u0011\nf\\Ⱥs\u0095K?]ߎ)aGu#yZZEe\u000bFe#[dYY..\u0002ɺSݭB&2Ӆ\u001e\u0010K*VVdzJo{x\u0001<^HrC\f\u0014r\u05feI֘\u0019e\u0007Ʈ3Ei/)-MV\u001d\u001e,ƭ9ӟ\u0006\u0003\u0018Ýi-\u0019jk;H\"\"Z\bĆ\bţ`U]ޮ\u0006K\u0016Qo\u001aA1\f\u0010=\u0013\u001c\u0007d8W\u001bm>-_vΛ0ˊ\u00170jӺ+k\u0014vmXl8\\\u007fV#*#t\u001b\u0003\u000f)Nb˙\u000eޮY\fEڽ)d\"\u0010I;\u0011@<M!Iei*\b\u001c.=ڏ[ǕI/\u000e\u001bD\u0010\u007fp4`m\u0014\u0007SrWl\u0018Ѝ*F\u001b˫2\u001f,B\n*yY%8{m\u00195\u0005d\u001fbLk^&01%#\u0015͕ަ<´p)nQ\u0004\u0003_Uz\u000bfTV&0dr\u00125\u001d\u0019\u0003'i\u0019K\u0010\u0001jζPՇ's;\u05fb:c(>k\u0011gL\fzxO߂\u0015\u0005e6<Ɖ\fZ{\u001d\u0005D\u0006̺\bɓ\u0004"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0004htHgg,Uu\u0015GSN*kV|F{\u000ec\nP+\u001aZ", "", "CmS<@(GO\u001b~\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri'v\u001585?Dg6\u001e\">", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001]\u001f-W+7t0 \u0015u7|w", "1kX=U6:`\u0018fvg(~\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0013`\u0002+4w\u0012;L+7t0 \u0015u7", "5dc\u0010_0IP#z\b]\u0014x\u0012+g\u007f5:A\u000b' Fk\u001d@\u0001./f}'7i$.", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#[';x\u00138IP:S0'\u0011jaF\\", "Adc\u0010_0IP#z\b]\u0014x\u0012+g\u007f5:A\u000b' Fk\u001d@\u0001./f}'7i$.", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~7\u0005$Bj *ZB#g=\u001a\u0017hn\u000fJT", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "1ta?X5M2&z|I6\u000b\r>i\n1", "5dc\u0010h9KS\"\u000eYk(~s9s\u00047\u007fJ\n^\u0011OA|\u0010>\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#g!8{\u0016=#", "Adc\u0010h9KS\"\u000eYk(~s9s\u00047\u007fJ\n^\u0011MOpJG\u0005", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0019\u0017Qw\u000eK\u00049~C~!Em%\u0004\u00114", "1ta?X5M2&z|I6\u000b\r>i\n1:?\u0001\u001e\u0017Ik\u001d<", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "2qP45,@W\"h{_:|\u0018\u0013nn(\u000fO", "", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "2qP45,@W\"i\u0005l0\f\r9n", "\u0018", "2qP4G6MO ]~l;x\u0012-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001ai\u001f-TC\u0011", "2qP4Z0GU{z\u0004]3|", "5dc\u0011e(@U\u001d\b|A(\u0006\b6e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7x*VBBk\n", "Adc\u0011e(@U\u001d\b|A(\u0006\b6e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001P\u00127LJ;Aw\u000f", "2qP4Z0GU{z\u0004]3|G.e\u0007(}<\u0010\u0017", "", "3cXAT)ES", "5dc\u0012W0MO\u0016\u0006z", "u(I", "Adc\u0012W0MO\u0016\u0006z", "uY\u0018#", "3cXAT)ESW}ze,~\u0005>e", "3mP/_,=", "5dc\u0012a(;Z\u0019}", "Adc\u0012a(;Z\u0019}", "3mP/_,=\u0012\u0018~\u0002^.x\u0018/", "4nRBf\u0019>_)~\tm,\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egj C}\u0016<\\CHA", "5dc\u0013b*Na\u0006~\u0007n,\u000b\u0018/r", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0018Qm\u001eJ@\u0006?W\u000e.$m\">MQJkAs", "Adc\u0013b*Na\u0006~\u0007n,\u000b\u0018/r", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\r7y&.[R;x\na\u0006", "6`_A\\*\u001fS\u0019}WZ*\u0003", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0004\u0013\"Vs\f=v%4Vy\u001e=7x*XR?i\u0015\u001e\u0015g^5\u0005i\u0002", "5dc\u0015T7MW\u0017_z^+Y\u0005-k", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001aCz\u001d@t&5Y|\u001d3k\u001cw0?Fz8\u001cuha8\u0004_*TL", "Adc\u0015T7MW\u0017_z^+Y\u0005-k", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001a\u0013R~\u0012:w%5Xz\u001c5s_\u0011INJo2~\u0015h`6\u0003a2$:\u0018", ";nd@X\u001a>Z\u0019|\nb6\u0006r,s\u007f5\r@\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g|rqG\u0007Q,Uv%VPX5FO\u0001=!#Z\u001b$", "5dc\u001ab<LS\u0007~\u0002^*\f\r9ni%\n@\u000e(\u0017T.\u000fF\u0007.4U\r$Av\u0010;MJ;gB\u001e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7$.TC9z8(\u001e2IC\u0017q,<v.GJ]0f[\\:\"\u0012g\u001fN8b", "=eU@X;&O$\n~g.", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#g!8{\u0016=5?Fv8'\u0017>", "5dc\u001cY-LS(fvi7\u0001\u00121$\u00012\fI\u007f\u0013&Ky\u00176\u0004%<Yy.7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri!n\u0017<MR#g?)\u0019qc\u000f", "Adc\u001cY-LS(fvi7\u0001\u00121$\u00012\fI\u007f\u0013&Ky\u00176\u0004%<Yy.7", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W@\u007f0EhG\n8n$.\\+7v?\"\u001ej7|w", "=kS#T3NS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|v2MJ:\\0%%h7", "=mE._<>1\u001cz\u0004`,", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "", "5dc\u001ca\u001d:Z)~Xa(\u0006\u000b/$\u00012\fI\u007f\u0013&Ky\u00176\u0004%<Yy.7", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u001ca\u001d:Z)~Xa(\u0006\u000b/$\u00012\fI\u007f\u0013&Ky\u00176\u0004%<Yy.7", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", ">qTC\\6Na\u0006z\r=9x\u000b\u0019f\u00016{O", ">qTC\\6Na\u0007~\u0002^*\f\r9nf$\u0010J\u0011&", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u000eC`X<k(", "AsPAX", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001em\u0018*KW*kG-ula@\u0006Q;J\u0006'\u001d", "5dc g(MSW\u007f\u0005n5{\u0005>i\n1uM\u0001\u001e\u0017C}\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7|.O?9\u007f#\u001e(wB=\u0007j+<\u0006#VL$", "Adc g(MSW\u007f\u0005n5{\u0005>i\n1uM\u0001\u001e\u0017C}\u000e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fnDY\u0011/\u0001T\u00160IAOZ41$Ie9\u000eb\u001a]r6G\"\u0012\u001d", "BdgAG6HZ\u0016z\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n$Y\u0011/&w 5J?HA", "5dc!X?MB#\t\u0002[(\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#l J|\u00058WJ8gAs", "Adc!X?MB#\t\u0002[(\n", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~H}3F\\ 8T@7x\na\u0006", "Bnd0[\u001a>Z\u0019|\nb6\u0006r,s\u007f5\r@\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri&m)=,P7m\u001e\u001b#hnJ\u0007p\u0002", "5dc!b<<V\u0007~\u0002^*\f\r9ni%\n@\u000e(\u0017T.\u000fF\u0007.4U\r$Av\u0010;MJ;gB\u001e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u0005.`R\u001ax0 ~eo9\u0014t,[L", "BqP;f-H`!~yM,\u0010\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9iE\u007f/DU\r 6[%;QL=A", "5dc!e(Ga\u001a\t\bf,{w/x\u000ff|J\u0011 \u0016C~\u0012F\u007f\u001fBY\u0005 3{\u0016", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006R.>c\r\u001cFm\u0015\u001c\\P?t6s", "5dc\"a+H;\u0015\bv`,\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EA\u000b' Fk\u001d@\u0001.~h}3F7\u00067LM#g=\u001a\u0017hn\u000f", "D`[BX", "5dc#T3NSW\u007f\u0005n5{\u0005>i\n1uM\u0001\u001e\u0017C}\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri&m)=.G;r3\u000f\u0011oq9\\", "Adc#T3NSW\u007f\u0005n5{\u0005>i\n1uM\u0001\u001e\u0017C}\u000e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W@\u007f0EhG\u000f7\u0001%\u000fQCBj%\u001a\u001cxa\u000fJT", "D`[BXj=S ~|Z;|", "DhbBT3-`\u0015\b\t_6\n\u0011+t\u00042\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#n$E}\u00125<P7tB\u001f\u001fui5\u0016g6WL", "5dc#\\:NO m\bZ5\u000b\n9r\b$\u000bD\u000b UHy\u001eEu!D]\b)1z\u00165M?Ik", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri(q$>IJ*x0'#ikF\u000f_;R\u00010\u001d", "Adc#\\:NO m\bZ5\u000b\n9r\b$\u000bD\u000b UHy\u001eEu!D]\b)1z\u00165M?Ik", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W@\u007f0EhG\u0011;{&*T2Hg=,\u0016rnA\u0003r0X\u007f|\u000b=", "1kT.e\u0017KS*\u0003zp\u000f\u0001\u000b2l\u0004*~O", "1kT.e\u0017KS*\u0003zp\u000f\u0001\u000b2l\u0004*~O?\u0018!Wx\r8\u0006)?bw-7t\u0016*[C", "1n]AX?M;\u0019\b\u000bH7|\u0012\u000bd\u00058\nO\t\u0017 V", ">nb6g0H\\", "1n]AX?M;\u0019\b\u000bH7|\u0012\u000bd\u00058\nO\t\u0017 V7\u0014\u0004E,!$e", "uI\u0018#", "1n_F", "1`]0X3,S ~xm0\u0007\u0012", "1n_F\u0017-Hc\"}vm0\u0007\u0012)r\u007f/{<\u000f\u0017", "1qT.g,-S,\u000e[b,\u0004\b a\u00078{", "/m]<g(MS\u0018l\nk0\u0006\u000b", "Ad[2V;B]\"", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9|<\n4\"U\u0007\"7C", "1qT.g,-S,\u000e[b,\u0004\b a\u00078{\bau$NnoF", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W\u0018\u007f.?hy/7l\u0004=ZGDm\n\u0003XO]B\u0006p6Ru:\u0011JX4g\\\u0001=]\"^W]+ \u0014#E-yTFhv,\\\u0011\u001cl\u0001\u0013\u0015~1q\u0001B,", "1ta@b9\u001d`\u0015\u0001d[:|\u0016@e\r", "1ta@b9\u001d`\u0015\u0001d[:|\u0016@e\rf|J\u0011 \u0016C~\u0012F\u007f\u001fBY\u0005 3{\u0016", "1tc", "1tcpY6N\\\u0018z\nb6\u0006\u0003<e\u0007(wN\u0001", "2db2_,<b", "2db2_,<b`x\u0001>\u000f\u000bY\u000f$\u00012\fI\u007f\u0013&Ky\u00176\u0004%<Yy.7", "3mc2e\u001a>Z\u0019|\nb6\u0006p9d\u007f", "Ag^D93HO(\u0003\u0004`\u001b\u0007\u00136b{5", "3mc2e\u001a>Z\u0019|\nb6\u0006p9d\u007ff|J\u0011 \u0016C~\u0012F\u007f\u001fBY\u0005 3{\u0016", "3wXAF,ES\u0017\u000e~h5d\u0013.e", "3wXAF,ES\u0017\u000e~h5d\u0013.e>)\u0006P\n\u0016\u0013Vs\u0018Ep25`}\u001cEm", "5dc\u0010b5MS\"\u000eg^*\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "5dc\u0010h9L]&i\u0005l0\f\r9n", "2d]@\\;R", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "5dc\u0010h9L]&i\u0005l0\f\r9nG7\f-p(\u001c3.\u000fF\u0007.4U\r$Av\u0010;MJ;gB\u001e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\r1z", "5dc\u0015T5=Z\u0019i\u0005l0\f\r9n", "7rBAT9M6\u0015\bye,", "5dc\u0015T5=Z\u0019i\u0005l0\f\r9nG7\f-p(\u001c3.\u000fF\u0007.4U\r$Av\u0010;MJ;gB\u001e", "uY\u0018\u0017", "6`]1_,\u001d`\u0015\u0001d[:|\u0016@e\r", "6`]1_,\u001d`\u0015\u0001d[:|\u0016@e\rf|J\u0011 \u0016C~\u0012F\u007f\u001fBY\u0005 3{\u0016", "6hS2F,ES\u0017\u000e~h5k\u00139l|$\t", "6hS2F,ES\u0017\u000e~h5k\u00139l|$\t~\u0002!'Pn\nKz/>S\u000b >m\u0012<M", "7rC2k;\u001cV\u0015\b|^+", "7rC2k;\u001cV\u0015\b|^+;\n9u\t'wO\u0005! A|\u000eCv!CY", ">`bAX", ">`bAXj?])\byZ;\u0001\u00138_\r(\u0003@|%\u0017", "Ad[2V;\u001aZ ", "Ad[2V;\u001aZ ={h<\u0006\b+t\u00042\u0005:\u000e\u0017\u001eGk\u001c<", "Adc\u0011X3>b\u001d\t\u0004I9|\u001a3e\u0012\u000b\u007fB\u0004\u001e\u001bIr\u001d", "@`]4X", "Adc\u0011X3>b\u001d\t\u0004I9|\u001a3e\u0012\u000b\u007fB\u0004\u001e\u001bIr\u001d\u0004F:3!\r\u0007\n,\u00178]L:gC\"\u001fq[F\u0007j,J\u0005'", "Adc\u0015T5=Z\u0019l\nZ;|", "6`]1_,,b\u0015\u000ez", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\ri\u001ai\u001f-TC)z0-\u0015>", "Adc X3>Q(\u0003\u0005g\u0017\n\t@i\u007f:^D\u0003\u001a\u001eKq\u0011K", "Adc X3>Q(\u0003\u0005g\u0017\n\t@i\u007f:^D\u0003\u001a\u001eKq\u0011K>tJWE/\u001e@T/WSDj0-\u0019rj3\u0014c3Nr5G", "Ag^DF,ES\u0017\u000e~h5k\u00139l|$\t", "Ag^DF,ES\u0017\u000e~h5k\u00139l|$\t~\u0002!'Pn\nKz/>S\u000b >m\u0012<M", "CoS.g,\u001fZ#z\nb5~w9o\u0007%wM", "Ag^D", "CoS.g,,S ~xm0\u0007\u0012", "1ta?X5M>#\r~m0\u0007\u0012", "7rBAT9M=\u001alze,z\u00183o\t", "/cYBf;FS\"\u000e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@45l\riEm\u001d.KR?u=g\u0003hh9\u0005r0X\u007f\u0003FQ^:kZrF#g", "7rC<h*A0\u0015\rz]\u001a|\u0010/c\u000f,\u0006I", "CoS.g,,S ~xm0\u0007\u0012v8o\bXA|i", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W@\u007f0EhG\u000f7\u0001%\u000fQCBj%\u001a\u001cxa\u000fkX!5r0FYX0[e<;\u001e\u001ae\u0018\\+V\u0006cQ-m@F#\u00125\u0013\u0011;{\u0010U$\u000e<jnQZ\u001aPC\u0003uH)fU]i\u0003#@Jr8s\u0014_&k\u0010/gx", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class TextFieldSelectionManager {
    public static final int $stable = 8;
    private ClipboardManager clipboardManager;
    private final MutableState currentDragPosition$delegate;
    private Integer dragBeginOffsetInText;
    private long dragBeginPosition;
    private long dragTotalDistance;
    private final MutableState draggingHandle$delegate;
    private final MutableState editable$delegate;
    private final MutableState enabled$delegate;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MouseSelectionObserver mouseSelectionObserver;
    private OffsetMapping offsetMapping;
    private TextFieldValue oldValue;
    private Function1<? super TextFieldValue, Unit> onValueChange;
    private int previousRawDragOffset;
    private SelectionLayout previousSelectionLayout;
    private LegacyTextFieldState state;
    private TextToolbar textToolbar;
    private final TextDragObserver touchSelectionObserver;
    private final UndoManager undoManager;
    private final MutableState value$delegate;
    private VisualTransformation visualTransformation;

    public TextFieldSelectionManager() {
        this(null, 1, null);
    }

    public TextFieldSelectionManager(UndoManager undoManager) {
        this.undoManager = undoManager;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$onValueChange$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldValue textFieldValue) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                invoke2(textFieldValue);
                return Unit.INSTANCE;
            }
        };
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null), null, 2, null);
        this.visualTransformation = VisualTransformation.Companion.getNone();
        this.editable$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.enabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        this.dragBeginPosition = Offset.Companion.m3953getZeroF1C5BW0();
        this.dragTotalDistance = Offset.Companion.m3953getZeroF1C5BW0();
        this.draggingHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.previousRawDragOffset = -1;
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDown-k-4lQ0M */
            public void mo1395onDownk4lQ0M(long j2) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onStart-k-4lQ0M */
            public void mo1397onStartk4lQ0M(long j2) {
                TextLayoutResultProxy layoutResult;
                TextLayoutResultProxy layoutResult2;
                if (this.this$0.getEnabled() && this.this$0.getDraggingHandle() == null) {
                    this.this$0.setDraggingHandle(Handle.SelectionEnd);
                    this.this$0.previousRawDragOffset = -1;
                    this.this$0.hideSelectionToolbar$foundation_release();
                    LegacyTextFieldState state$foundation_release = this.this$0.getState$foundation_release();
                    if (state$foundation_release == null || (layoutResult2 = state$foundation_release.getLayoutResult()) == null || !layoutResult2.m1429isPositionOnTextk4lQ0M(j2)) {
                        LegacyTextFieldState state$foundation_release2 = this.this$0.getState$foundation_release();
                        if (state$foundation_release2 != null && (layoutResult = state$foundation_release2.getLayoutResult()) != null) {
                            TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                            int iTransformedToOriginal = textFieldSelectionManager.getOffsetMapping$foundation_release().transformedToOriginal(TextLayoutResultProxy.m1427getOffsetForPosition3MmeM6k$default(layoutResult, j2, false, 2, null));
                            TextFieldValue textFieldValueM1732createTextFieldValueFDrldGo = textFieldSelectionManager.m1732createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal));
                            textFieldSelectionManager.enterSelectionMode$foundation_release(false);
                            HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                            if (hapticFeedBack != null) {
                                hapticFeedBack.mo4906performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m4915getTextHandleMove5zf0vsI());
                            }
                            textFieldSelectionManager.getOnValueChange$foundation_release().invoke(textFieldValueM1732createTextFieldValueFDrldGo);
                        }
                    } else {
                        if (this.this$0.getValue$foundation_release().getText().length() == 0) {
                            return;
                        }
                        this.this$0.enterSelectionMode$foundation_release(false);
                        TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                        this.this$0.dragBeginOffsetInText = Integer.valueOf(TextRange.m6123getStartimpl(textFieldSelectionManager2.m1735updateSelection8UEBfa8(TextFieldValue.m6365copy3r_uNRQ$default(textFieldSelectionManager2.getValue$foundation_release(), (AnnotatedString) null, TextRange.Companion.m6128getZerod9O1mEE(), (TextRange) null, 5, (Object) null), j2, true, false, SelectionAdjustment.Companion.getWord(), true)));
                    }
                    this.this$0.setHandleState(HandleState.None);
                    this.this$0.dragBeginPosition = j2;
                    TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
                    textFieldSelectionManager3.m1734setCurrentDragPosition_kEHs6E(Offset.m3926boximpl(textFieldSelectionManager3.dragBeginPosition));
                    this.this$0.dragTotalDistance = Offset.Companion.m3953getZeroF1C5BW0();
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDrag-k-4lQ0M */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void mo1396onDragk4lQ0M(long r14) {
                /*
                    Method dump skipped, instruction units count: 260
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1.mo1396onDragk4lQ0M(long):void");
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                onEnd();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                onEnd();
            }

            private final void onEnd() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m1734setCurrentDragPosition_kEHs6E(null);
                this.this$0.updateFloatingToolbar(true);
                this.this$0.dragBeginOffsetInText = null;
                boolean zM6117getCollapsedimpl = TextRange.m6117getCollapsedimpl(this.this$0.getValue$foundation_release().m6370getSelectiond9O1mEE());
                this.this$0.setHandleState(zM6117getCollapsedimpl ? HandleState.Cursor : HandleState.Selection);
                LegacyTextFieldState state$foundation_release = this.this$0.getState$foundation_release();
                if (state$foundation_release != null) {
                    state$foundation_release.setShowSelectionHandleStart(!zM6117getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.this$0, true));
                }
                LegacyTextFieldState state$foundation_release2 = this.this$0.getState$foundation_release();
                if (state$foundation_release2 != null) {
                    state$foundation_release2.setShowSelectionHandleEnd(!zM6117getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.this$0, false));
                }
                LegacyTextFieldState state$foundation_release3 = this.this$0.getState$foundation_release();
                if (state$foundation_release3 == null) {
                    return;
                }
                state$foundation_release3.setShowCursorHandle(zM6117getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.this$0, true));
            }
        };
        this.mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onExtend-k-4lQ0M */
            public boolean mo1611onExtendk4lQ0M(long j2) {
                LegacyTextFieldState state$foundation_release = this.this$0.getState$foundation_release();
                if (state$foundation_release == null || state$foundation_release.getLayoutResult() == null || !this.this$0.getEnabled()) {
                    return false;
                }
                this.this$0.previousRawDragOffset = -1;
                updateMouseSelection(this.this$0.getValue$foundation_release(), j2, false, SelectionAdjustment.Companion.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo1612onExtendDragk4lQ0M(long j2) {
                LegacyTextFieldState state$foundation_release;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = this.this$0.getState$foundation_release()) == null || state$foundation_release.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(this.this$0.getValue$foundation_release(), j2, false, SelectionAdjustment.Companion.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onStart-3MmeM6k */
            public boolean mo1613onStart3MmeM6k(long j2, SelectionAdjustment selectionAdjustment) {
                LegacyTextFieldState state$foundation_release;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = this.this$0.getState$foundation_release()) == null || state$foundation_release.getLayoutResult() == null) {
                    return false;
                }
                FocusRequester focusRequester = this.this$0.getFocusRequester();
                if (focusRequester != null) {
                    focusRequester.requestFocus();
                }
                this.this$0.dragBeginPosition = j2;
                this.this$0.previousRawDragOffset = -1;
                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(this.this$0, false, 1, null);
                updateMouseSelection(this.this$0.getValue$foundation_release(), this.this$0.dragBeginPosition, true, selectionAdjustment);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* JADX INFO: renamed from: onDrag-3MmeM6k */
            public boolean mo1610onDrag3MmeM6k(long j2, SelectionAdjustment selectionAdjustment) {
                LegacyTextFieldState state$foundation_release;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = this.this$0.getState$foundation_release()) == null || state$foundation_release.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(this.this$0.getValue$foundation_release(), j2, false, selectionAdjustment);
                return true;
            }

            public final void updateMouseSelection(TextFieldValue textFieldValue, long j2, boolean z2, SelectionAdjustment selectionAdjustment) {
                this.this$0.setHandleState(TextRange.m6117getCollapsedimpl(this.this$0.m1735updateSelection8UEBfa8(textFieldValue, j2, z2, false, selectionAdjustment, false)) ? HandleState.Cursor : HandleState.Selection);
            }
        };
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 + 1) - (i2 | 1) != 0 ? null : undoManager);
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    public final OffsetMapping getOffsetMapping$foundation_release() {
        return this.offsetMapping;
    }

    public final void setOffsetMapping$foundation_release(OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public final Function1<TextFieldValue, Unit> getOnValueChange$foundation_release() {
        return this.onValueChange;
    }

    public final void setOnValueChange$foundation_release(Function1<? super TextFieldValue, Unit> function1) {
        this.onValueChange = function1;
    }

    public final LegacyTextFieldState getState$foundation_release() {
        return this.state;
    }

    public final void setState$foundation_release(LegacyTextFieldState legacyTextFieldState) {
        this.state = legacyTextFieldState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue) this.value$delegate.getValue();
    }

    public final void setValue$foundation_release(TextFieldValue textFieldValue) {
        this.value$delegate.setValue(textFieldValue);
    }

    public final AnnotatedString getTransformedText$foundation_release() {
        TextDelegate textDelegate;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (textDelegate = legacyTextFieldState.getTextDelegate()) == null) {
            return null;
        }
        return textDelegate.getText();
    }

    public final VisualTransformation getVisualTransformation$foundation_release() {
        return this.visualTransformation;
    }

    public final void setVisualTransformation$foundation_release(VisualTransformation visualTransformation) {
        this.visualTransformation = visualTransformation;
    }

    public final ClipboardManager getClipboardManager$foundation_release() {
        return this.clipboardManager;
    }

    public final void setClipboardManager$foundation_release(ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEditable() {
        return ((Boolean) this.editable$delegate.getValue()).booleanValue();
    }

    public final void setEditable(boolean z2) {
        this.editable$delegate.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabled() {
        return ((Boolean) this.enabled$delegate.getValue()).booleanValue();
    }

    public final void setEnabled(boolean z2) {
        this.enabled$delegate.setValue(Boolean.valueOf(z2));
    }

    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    /* JADX INFO: renamed from: setCurrentDragPosition-_kEHs6E */
    public final void m1734setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getCurrentDragPosition-_m7T9-E */
    public final Offset m1738getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    public final TextDragObserver getTouchSelectionObserver$foundation_release() {
        return this.touchSelectionObserver;
    }

    public final MouseSelectionObserver getMouseSelectionObserver$foundation_release() {
        return this.mouseSelectionObserver;
    }

    public final TextDragObserver handleDragObserver$foundation_release(final boolean z2) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onStart-k-4lQ0M */
            public void mo1397onStartk4lQ0M(long j2) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDown-k-4lQ0M */
            public void mo1395onDownk4lQ0M(long j2) {
                TextLayoutResultProxy layoutResult;
                this.this$0.setDraggingHandle(z2 ? Handle.SelectionStart : Handle.SelectionEnd);
                long jM1681getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1681getAdjustedCoordinatesk4lQ0M(this.this$0.m1740getHandlePositiontuRUvjQ$foundation_release(z2));
                LegacyTextFieldState state$foundation_release = this.this$0.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
                    long jM1431translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m1431translateInnerToDecorationCoordinatesMKHz9U$foundation_release(jM1681getAdjustedCoordinatesk4lQ0M);
                    this.this$0.dragBeginPosition = jM1431translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                    this.this$0.m1734setCurrentDragPosition_kEHs6E(Offset.m3926boximpl(jM1431translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                    this.this$0.dragTotalDistance = Offset.Companion.m3953getZeroF1C5BW0();
                    this.this$0.previousRawDragOffset = -1;
                    LegacyTextFieldState state$foundation_release2 = this.this$0.getState$foundation_release();
                    if (state$foundation_release2 != null) {
                        state$foundation_release2.setInTouchMode(true);
                    }
                    this.this$0.updateFloatingToolbar(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m1734setCurrentDragPosition_kEHs6E(null);
                this.this$0.updateFloatingToolbar(true);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDrag-k-4lQ0M */
            public void mo1396onDragk4lQ0M(long j2) {
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m3942plusMKHz9U(textFieldSelectionManager.dragTotalDistance, j2);
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m1734setCurrentDragPosition_kEHs6E(Offset.m3926boximpl(Offset.m3942plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, this.this$0.dragTotalDistance)));
                TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
                TextFieldValue value$foundation_release = textFieldSelectionManager3.getValue$foundation_release();
                Offset offsetM1738getCurrentDragPosition_m7T9E = this.this$0.m1738getCurrentDragPosition_m7T9E();
                Intrinsics.checkNotNull(offsetM1738getCurrentDragPosition_m7T9E);
                textFieldSelectionManager3.m1735updateSelection8UEBfa8(value$foundation_release, offsetM1738getCurrentDragPosition_m7T9E.m3947unboximpl(), false, z2, SelectionAdjustment.Companion.getCharacterWithWordAccelerate(), true);
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m1734setCurrentDragPosition_kEHs6E(null);
                this.this$0.updateFloatingToolbar(true);
            }
        };
    }

    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDown-k-4lQ0M */
            public void mo1395onDownk4lQ0M(long j2) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m1734setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onStart-k-4lQ0M */
            public void mo1397onStartk4lQ0M(long j2) {
                TextLayoutResultProxy layoutResult;
                long jM1681getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1681getAdjustedCoordinatesk4lQ0M(this.this$0.m1740getHandlePositiontuRUvjQ$foundation_release(true));
                LegacyTextFieldState state$foundation_release = this.this$0.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
                    long jM1431translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m1431translateInnerToDecorationCoordinatesMKHz9U$foundation_release(jM1681getAdjustedCoordinatesk4lQ0M);
                    this.this$0.dragBeginPosition = jM1431translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                    this.this$0.m1734setCurrentDragPosition_kEHs6E(Offset.m3926boximpl(jM1431translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                    this.this$0.dragTotalDistance = Offset.Companion.m3953getZeroF1C5BW0();
                    this.this$0.setDraggingHandle(Handle.Cursor);
                    this.this$0.updateFloatingToolbar(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* JADX INFO: renamed from: onDrag-k-4lQ0M */
            public void mo1396onDragk4lQ0M(long j2) {
                TextLayoutResultProxy layoutResult;
                HapticFeedback hapticFeedBack;
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m3942plusMKHz9U(textFieldSelectionManager.dragTotalDistance, j2);
                LegacyTextFieldState state$foundation_release = this.this$0.getState$foundation_release();
                if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m1734setCurrentDragPosition_kEHs6E(Offset.m3926boximpl(Offset.m3942plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                OffsetMapping offsetMapping$foundation_release = textFieldSelectionManager2.getOffsetMapping$foundation_release();
                Offset offsetM1738getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m1738getCurrentDragPosition_m7T9E();
                Intrinsics.checkNotNull(offsetM1738getCurrentDragPosition_m7T9E);
                int iTransformedToOriginal = offsetMapping$foundation_release.transformedToOriginal(TextLayoutResultProxy.m1427getOffsetForPosition3MmeM6k$default(layoutResult, offsetM1738getCurrentDragPosition_m7T9E.m3947unboximpl(), false, 2, null));
                long jTextRange = TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal);
                if (TextRange.m6116equalsimpl0(jTextRange, textFieldSelectionManager2.getValue$foundation_release().m6370getSelectiond9O1mEE())) {
                    return;
                }
                LegacyTextFieldState state$foundation_release2 = textFieldSelectionManager2.getState$foundation_release();
                if ((state$foundation_release2 == null || state$foundation_release2.isInTouchMode()) && (hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack()) != null) {
                    hapticFeedBack.mo4906performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m4915getTextHandleMove5zf0vsI());
                }
                textFieldSelectionManager2.getOnValueChange$foundation_release().invoke(textFieldSelectionManager2.m1732createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation_release().getAnnotatedString(), jTextRange));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m1734setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    public static /* synthetic */ void enterSelectionMode$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z2, int i2, Object obj) {
        if ((i2 + 1) - (i2 | 1) != 0) {
            z2 = true;
        }
        textFieldSelectionManager.enterSelectionMode$foundation_release(z2);
    }

    public final void enterSelectionMode$foundation_release(boolean z2) {
        FocusRequester focusRequester;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null && !legacyTextFieldState.getHasFocus() && (focusRequester = this.focusRequester) != null) {
            focusRequester.requestFocus();
        }
        this.oldValue = getValue$foundation_release();
        updateFloatingToolbar(z2);
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        updateFloatingToolbar(false);
        setHandleState(HandleState.None);
    }

    /* JADX INFO: renamed from: deselect-_kEHs6E$foundation_release$default */
    public static /* synthetic */ void m1733deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m1737deselect_kEHs6E$foundation_release(offset);
    }

    /* JADX INFO: renamed from: deselect-_kEHs6E$foundation_release */
    public final void m1737deselect_kEHs6E$foundation_release(Offset offset) {
        int iM6120getMaximpl;
        if (!TextRange.m6117getCollapsedimpl(getValue$foundation_release().m6370getSelectiond9O1mEE())) {
            LegacyTextFieldState legacyTextFieldState = this.state;
            TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
            if (offset != null && layoutResult != null) {
                iM6120getMaximpl = this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m1427getOffsetForPosition3MmeM6k$default(layoutResult, offset.m3947unboximpl(), false, 2, null));
            } else {
                iM6120getMaximpl = TextRange.m6120getMaximpl(getValue$foundation_release().m6370getSelectiond9O1mEE());
            }
            this.onValueChange.invoke(TextFieldValue.m6365copy3r_uNRQ$default(getValue$foundation_release(), (AnnotatedString) null, TextRangeKt.TextRange(iM6120getMaximpl), (TextRange) null, 5, (Object) null));
        }
        setHandleState((offset == null || getValue$foundation_release().getText().length() <= 0) ? HandleState.None : HandleState.Cursor);
        updateFloatingToolbar(false);
    }

    /* JADX INFO: renamed from: setSelectionPreviewHighlight-5zc-tL8$foundation_release */
    public final void m1742setSelectionPreviewHighlight5zctL8$foundation_release(long j2) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m1358setSelectionPreviewHighlightRange5zctL8(j2);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m1355setDeletionPreviewHighlightRange5zctL8(TextRange.Companion.m6128getZerod9O1mEE());
        }
        if (TextRange.m6117getCollapsedimpl(j2)) {
            return;
        }
        exitSelectionMode$foundation_release();
    }

    /* JADX INFO: renamed from: setDeletionPreviewHighlight-5zc-tL8$foundation_release */
    public final void m1741setDeletionPreviewHighlight5zctL8$foundation_release(long j2) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m1355setDeletionPreviewHighlightRange5zctL8(j2);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m1358setSelectionPreviewHighlightRange5zctL8(TextRange.Companion.m6128getZerod9O1mEE());
        }
        if (TextRange.m6117getCollapsedimpl(j2)) {
            return;
        }
        exitSelectionMode$foundation_release();
    }

    public final void clearPreviewHighlight$foundation_release() {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m1355setDeletionPreviewHighlightRange5zctL8(TextRange.Companion.m6128getZerod9O1mEE());
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 == null) {
            return;
        }
        legacyTextFieldState2.m1358setSelectionPreviewHighlightRange5zctL8(TextRange.Companion.m6128getZerod9O1mEE());
    }

    public static /* synthetic */ void copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            z2 = true;
        }
        textFieldSelectionManager.copy$foundation_release(z2);
    }

    public final void copy$foundation_release(boolean z2) {
        if (TextRange.m6117getCollapsedimpl(getValue$foundation_release().m6370getSelectiond9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        if (z2) {
            int iM6120getMaximpl = TextRange.m6120getMaximpl(getValue$foundation_release().m6370getSelectiond9O1mEE());
            this.onValueChange.invoke(m1732createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(iM6120getMaximpl, iM6120getMaximpl)));
            setHandleState(HandleState.None);
        }
    }

    public final void paste$foundation_release() {
        AnnotatedString text;
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null && (text = clipboardManager.getText()) != null) {
            AnnotatedString annotatedStringPlus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(text).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
            int iM6121getMinimpl = TextRange.m6121getMinimpl(getValue$foundation_release().m6370getSelectiond9O1mEE()) + text.length();
            this.onValueChange.invoke(m1732createTextFieldValueFDrldGo(annotatedStringPlus, TextRangeKt.TextRange(iM6121getMinimpl, iM6121getMinimpl)));
            setHandleState(HandleState.None);
            UndoManager undoManager = this.undoManager;
            if (undoManager != null) {
                undoManager.forceNextSnapshot();
            }
        }
    }

    public final void cut$foundation_release() {
        if (TextRange.m6117getCollapsedimpl(getValue$foundation_release().m6370getSelectiond9O1mEE())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        AnnotatedString annotatedStringPlus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int iM6121getMinimpl = TextRange.m6121getMinimpl(getValue$foundation_release().m6370getSelectiond9O1mEE());
        this.onValueChange.invoke(m1732createTextFieldValueFDrldGo(annotatedStringPlus, TextRangeKt.TextRange(iM6121getMinimpl, iM6121getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    public final void selectAll$foundation_release() {
        TextFieldValue textFieldValueM1732createTextFieldValueFDrldGo = m1732createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(textFieldValueM1732createTextFieldValueFDrldGo);
        this.oldValue = TextFieldValue.m6365copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, textFieldValueM1732createTextFieldValueFDrldGo.m6370getSelectiond9O1mEE(), (TextRange) null, 5, (Object) null);
        enterSelectionMode$foundation_release(true);
    }

    /* JADX INFO: renamed from: getHandlePosition-tuRUvjQ$foundation_release */
    public final long m1740getHandlePositiontuRUvjQ$foundation_release(boolean z2) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return Offset.Companion.m3952getUnspecifiedF1C5BW0();
        }
        AnnotatedString transformedText$foundation_release = getTransformedText$foundation_release();
        if (transformedText$foundation_release == null) {
            return Offset.Companion.m3952getUnspecifiedF1C5BW0();
        }
        if (!Intrinsics.areEqual(transformedText$foundation_release.getText(), value.getLayoutInput().getText().getText())) {
            return Offset.Companion.m3952getUnspecifiedF1C5BW0();
        }
        long jM6370getSelectiond9O1mEE = getValue$foundation_release().m6370getSelectiond9O1mEE();
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(value, this.offsetMapping.originalToTransformed(z2 ? TextRange.m6123getStartimpl(jM6370getSelectiond9O1mEE) : TextRange.m6118getEndimpl(jM6370getSelectiond9O1mEE)), z2, TextRange.m6122getReversedimpl(getValue$foundation_release().m6370getSelectiond9O1mEE()));
    }

    /* JADX INFO: renamed from: getCursorPosition-tuRUvjQ$foundation_release */
    public final long m1739getCursorPositiontuRUvjQ$foundation_release(Density density) {
        int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m6123getStartimpl(getValue$foundation_release().m6370getSelectiond9O1mEE()));
        LegacyTextFieldState legacyTextFieldState = this.state;
        TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
        Intrinsics.checkNotNull(layoutResult);
        TextLayoutResult value = layoutResult.getValue();
        Rect cursorRect = value.getCursorRect(RangesKt.coerceIn(iOriginalToTransformed, 0, value.getLayoutInput().getText().length()));
        return OffsetKt.Offset(cursorRect.getLeft() + (density.mo710toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness()) / 2), cursorRect.getBottom());
    }

    public final void updateFloatingToolbar(boolean z2) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.setShowFloatingToolbar(z2);
        }
        if (z2) {
            showSelectionToolbar$foundation_release();
        } else {
            hideSelectionToolbar$foundation_release();
        }
    }

    public final void showSelectionToolbar$foundation_release() {
        ClipboardManager clipboardManager;
        if (getEnabled()) {
            LegacyTextFieldState legacyTextFieldState = this.state;
            if (legacyTextFieldState == null || legacyTextFieldState.isInTouchMode()) {
                boolean z2 = this.visualTransformation instanceof PasswordVisualTransformation;
                Function0<Unit> function0 = (TextRange.m6117getCollapsedimpl(getValue$foundation_release().m6370getSelectiond9O1mEE()) || z2) ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1
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
                        TextFieldSelectionManager.copy$foundation_release$default(this.this$0, false, 1, null);
                        this.this$0.hideSelectionToolbar$foundation_release();
                    }
                };
                Function0<Unit> function02 = (TextRange.m6117getCollapsedimpl(getValue$foundation_release().m6370getSelectiond9O1mEE()) || !getEditable() || z2) ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1
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
                        this.this$0.cut$foundation_release();
                        this.this$0.hideSelectionToolbar$foundation_release();
                    }
                };
                Function0<Unit> function03 = (getEditable() && (clipboardManager = this.clipboardManager) != null && clipboardManager.hasText()) ? new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1
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
                        this.this$0.paste$foundation_release();
                        this.this$0.hideSelectionToolbar$foundation_release();
                    }
                } : null;
                Function0<Unit> function04 = TextRange.m6119getLengthimpl(getValue$foundation_release().m6370getSelectiond9O1mEE()) != getValue$foundation_release().getText().length() ? new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1
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
                        this.this$0.selectAll$foundation_release();
                    }
                } : null;
                TextToolbar textToolbar = this.textToolbar;
                if (textToolbar != null) {
                    textToolbar.showMenu(getContentRect(), function0, function03, function02, function04);
                }
            }
        }
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    /* JADX INFO: renamed from: contextMenuOpenAdjustment-k-4lQ0M */
    public final void m1736contextMenuOpenAdjustmentk4lQ0M(long j2) {
        TextLayoutResultProxy layoutResult;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null) {
            return;
        }
        if (TextRange.m6114containsimpl(getValue$foundation_release().m6370getSelectiond9O1mEE(), TextLayoutResultProxy.m1427getOffsetForPosition3MmeM6k$default(layoutResult, j2, false, 2, null))) {
            return;
        }
        this.previousRawDragOffset = -1;
        m1735updateSelection8UEBfa8(getValue$foundation_release(), j2, true, false, SelectionAdjustment.Companion.getWord(), false);
    }

    public final boolean isTextChanged$foundation_release() {
        return !Intrinsics.areEqual(this.oldValue.getText(), getValue$foundation_release().getText());
    }

    private final Rect getContentRect() {
        float fM3938getYimpl;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResult value;
        Rect cursorRect;
        LayoutCoordinates layoutCoordinates2;
        TextLayoutResult value2;
        Rect cursorRect2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.isLayoutResultStale()) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m6123getStartimpl(getValue$foundation_release().m6370getSelectiond9O1mEE()));
                int iOriginalToTransformed2 = this.offsetMapping.originalToTransformed(TextRange.m6118getEndimpl(getValue$foundation_release().m6370getSelectiond9O1mEE()));
                LegacyTextFieldState legacyTextFieldState2 = this.state;
                long jM3953getZeroF1C5BW0 = (legacyTextFieldState2 == null || (layoutCoordinates4 = legacyTextFieldState2.getLayoutCoordinates()) == null) ? Offset.Companion.m3953getZeroF1C5BW0() : layoutCoordinates4.mo5525localToRootMKHz9U(m1740getHandlePositiontuRUvjQ$foundation_release(true));
                LegacyTextFieldState legacyTextFieldState3 = this.state;
                long jM3953getZeroF1C5BW02 = (legacyTextFieldState3 == null || (layoutCoordinates3 = legacyTextFieldState3.getLayoutCoordinates()) == null) ? Offset.Companion.m3953getZeroF1C5BW0() : layoutCoordinates3.mo5525localToRootMKHz9U(m1740getHandlePositiontuRUvjQ$foundation_release(false));
                LegacyTextFieldState legacyTextFieldState4 = this.state;
                float fM3938getYimpl2 = 0.0f;
                if (legacyTextFieldState4 != null && (layoutCoordinates2 = legacyTextFieldState4.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                    fM3938getYimpl = Offset.m3938getYimpl(layoutCoordinates2.mo5525localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult == null || (value2 = layoutResult.getValue()) == null || (cursorRect2 = value2.getCursorRect(iOriginalToTransformed)) == null) ? 0.0f : cursorRect2.getTop())));
                } else {
                    fM3938getYimpl = 0.0f;
                }
                LegacyTextFieldState legacyTextFieldState5 = this.state;
                if (legacyTextFieldState5 != null && (layoutCoordinates = legacyTextFieldState5.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult2 = legacyTextFieldState.getLayoutResult();
                    fM3938getYimpl2 = Offset.m3938getYimpl(layoutCoordinates.mo5525localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult2 == null || (value = layoutResult2.getValue()) == null || (cursorRect = value.getCursorRect(iOriginalToTransformed2)) == null) ? 0.0f : cursorRect.getTop())));
                }
                return new Rect(Math.min(Offset.m3937getXimpl(jM3953getZeroF1C5BW0), Offset.m3937getXimpl(jM3953getZeroF1C5BW02)), Math.min(fM3938getYimpl, fM3938getYimpl2), Math.max(Offset.m3937getXimpl(jM3953getZeroF1C5BW0), Offset.m3937getXimpl(jM3953getZeroF1C5BW02)), Math.max(Offset.m3938getYimpl(jM3953getZeroF1C5BW0), Offset.m3938getYimpl(jM3953getZeroF1C5BW02)) + (Dp.m6638constructorimpl(25) * legacyTextFieldState.getTextDelegate().getDensity().getDensity()));
            }
        }
        return Rect.Companion.getZero();
    }

    /* JADX INFO: renamed from: updateSelection-8UEBfa8 */
    public final long m1735updateSelection8UEBfa8(TextFieldValue textFieldValue, long j2, boolean z2, boolean z3, SelectionAdjustment selectionAdjustment, boolean z4) {
        TextLayoutResultProxy layoutResult;
        HapticFeedback hapticFeedback;
        int i2;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null) {
            return TextRange.Companion.m6128getZerod9O1mEE();
        }
        long jTextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m6123getStartimpl(textFieldValue.m6370getSelectiond9O1mEE())), this.offsetMapping.originalToTransformed(TextRange.m6118getEndimpl(textFieldValue.m6370getSelectiond9O1mEE())));
        boolean z5 = false;
        int iM1428getOffsetForPosition3MmeM6k = layoutResult.m1428getOffsetForPosition3MmeM6k(j2, false);
        int iM6123getStartimpl = (z3 || z2) ? iM1428getOffsetForPosition3MmeM6k : TextRange.m6123getStartimpl(jTextRange);
        int iM6118getEndimpl = (!z3 || z2) ? iM1428getOffsetForPosition3MmeM6k : TextRange.m6118getEndimpl(jTextRange);
        SelectionLayout selectionLayout = this.previousSelectionLayout;
        int i3 = -1;
        if (!z2 && selectionLayout != null && (i2 = this.previousRawDragOffset) != -1) {
            i3 = i2;
        }
        SelectionLayout selectionLayoutM1684getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m1684getTextFieldSelectionLayoutRcvTLA(layoutResult.getValue(), iM6123getStartimpl, iM6118getEndimpl, i3, jTextRange, z2, z3);
        if (!selectionLayoutM1684getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(selectionLayout)) {
            return textFieldValue.m6370getSelectiond9O1mEE();
        }
        this.previousSelectionLayout = selectionLayoutM1684getTextFieldSelectionLayoutRcvTLA;
        this.previousRawDragOffset = iM1428getOffsetForPosition3MmeM6k;
        Selection selectionAdjust = selectionAdjustment.adjust(selectionLayoutM1684getTextFieldSelectionLayoutRcvTLA);
        long jTextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(selectionAdjust.getStart().getOffset()), this.offsetMapping.transformedToOriginal(selectionAdjust.getEnd().getOffset()));
        if (TextRange.m6116equalsimpl0(jTextRange2, textFieldValue.m6370getSelectiond9O1mEE())) {
            return textFieldValue.m6370getSelectiond9O1mEE();
        }
        boolean z6 = TextRange.m6122getReversedimpl(jTextRange2) != TextRange.m6122getReversedimpl(textFieldValue.m6370getSelectiond9O1mEE()) && TextRange.m6116equalsimpl0(TextRangeKt.TextRange(TextRange.m6118getEndimpl(jTextRange2), TextRange.m6123getStartimpl(jTextRange2)), textFieldValue.m6370getSelectiond9O1mEE());
        boolean z7 = TextRange.m6117getCollapsedimpl(jTextRange2) && TextRange.m6117getCollapsedimpl(textFieldValue.m6370getSelectiond9O1mEE());
        if (z4 && textFieldValue.getText().length() > 0 && !z6 && !z7 && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo4906performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m4915getTextHandleMove5zf0vsI());
        }
        this.onValueChange.invoke(m1732createTextFieldValueFDrldGo(textFieldValue.getAnnotatedString(), jTextRange2));
        if (!z4) {
            updateFloatingToolbar(!TextRange.m6117getCollapsedimpl(jTextRange2));
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.setInTouchMode(z4);
        }
        LegacyTextFieldState legacyTextFieldState3 = this.state;
        if (legacyTextFieldState3 != null) {
            legacyTextFieldState3.setShowSelectionHandleStart(!TextRange.m6117getCollapsedimpl(jTextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
        }
        LegacyTextFieldState legacyTextFieldState4 = this.state;
        if (legacyTextFieldState4 != null) {
            legacyTextFieldState4.setShowSelectionHandleEnd(!TextRange.m6117getCollapsedimpl(jTextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
        }
        LegacyTextFieldState legacyTextFieldState5 = this.state;
        if (legacyTextFieldState5 != null) {
            if (TextRange.m6117getCollapsedimpl(jTextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true)) {
                z5 = true;
            }
            legacyTextFieldState5.setShowCursorHandle(z5);
        }
        return jTextRange2;
    }

    public final void setHandleState(HandleState handleState) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.getHandleState() == handleState) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                legacyTextFieldState.setHandleState(handleState);
            }
        }
    }

    /* JADX INFO: renamed from: createTextFieldValue-FDrldGo */
    public final TextFieldValue m1732createTextFieldValueFDrldGo(AnnotatedString annotatedString, long j2) {
        return new TextFieldValue(annotatedString, j2, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }
}
