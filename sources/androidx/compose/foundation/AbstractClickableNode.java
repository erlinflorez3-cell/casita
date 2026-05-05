package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import com.dynatrace.android.compose.SemanticsManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
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
/* JADX INFO: compiled from: Clickable.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яō\u0014D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aw\u001dfr9FDm߉6Ri*\u0017ӆ\u00044:[,ڎK;c#\u0006̝\u0011O\\soñRZ!C\u0017إ\u001ex\u0001,QU\u0007]\u001a\u000f8Bw?IMw=?`|6\u0013C:\"Ny\r\u00010*P\u0010||KK\"\u00128ϋx:h\rUĨ\"\u0012\u001c>(ҵ&\\}N>Hr_B/9\u0003qBT+g0\u000bձ\u0015FZ2\u0015vw\u001e3@=5\u001d%i\u0003\u000fRaA\u000b?\b=\rؒ/'AI{Ɏ>X\u0016\u0014\u001d+U\u0015er<\\\rQf\f/+ecSP\u0014(\u007fz\u0012\rD\u0004\u0014\t-fDƦ8F8\u000eas#SnP2^p\u0001+ad\u0019U\u007fa.i\u001b\u0015U\u001a:x\u000fx\f\u000b\u001b#;\u0003\u0005 \nZ\u001ef#\"lyg0\u007fHML\\\u0013q=\u001c\u000e\u0001h\u00105\u001c2]~]\b!4%2O]O\"Oy\u0012RRv\u000f\u000bpjci\u0001Yn2å\u001a78\u001bT`R\u0019\u001dk~^\u001f,YS*\n\u001f}6$f^@B/[(N}y0j\u0016c\u0018\\Gfej5kV]G\u0017K5\u007ftVa\u001bz\"xTb3i/FaFr\\V3zLxK\u0010{r_T\u001f@{\n\u001cb=a\u001djR`\u0003L\u0001\n\u0013\u0017\u001frh>\t\u000572C\u0002$#JˏOʔʼsi~\f:@)H;\u0006i5G7\u0006&vy\u0015#5E$\u0004U/dGz5FycE8\u0016H\u0004ؐ.ˋт\u0013\u0001/}\u0010y\u000eb\u00013iM@1+\u0001\bOSh\\)ǆiѱݽdlP\u001ebZj\u0004lB;\nz~(r\r|ĕgT\u0019,\u0007O\u0001Tq<|BC\u0005gj3S\b\"+F]I5\".y*.Cg\u000eo}5\u0012d%%#m40q\u001f\bb\u007fgbAFTq\u0001T!Rx3HVw\u0010\nX\bb\u001bcROs\t\\HO\u001b/,w5<SrĜZƥ݇s}:\u0002(4\u0002\u0018\u0016\u0014\rTM\u0011{).\u00026Sjab\u000f8\u001c$1\u001dgdM..ob7A.sF\u000f\bތ!ƀ@\t2\u000etY\u0016e[T\u0018\u00178z.\"\u0010\u0013%\u000fZsijT֏7حUޠϖdGf~8_O#A1\u00115_\u0019D۱`҈bѢޥR\u001c͢\u001flW~t:{\\bO34h\u0003\u001bE\f[Y\u0004F\u0004uB\u001c\u0003FȲ:±\u0001\u001dJȰkU_\u001awv^h;Yrh|v@p\u0011\u000fxě\u000bҶ\u0001\u0014D߽'\r\u001fj\u0001\f39Zk\u00107q8WӂFͫ\u000b\f\u0005ݭ\u0017';%M-kiA̢)ٖ[SCջX..H\u001cv7[\u00060=ōiΌ>\u0016yд3\u0010\u00176h\"\u001a-x\u0019I˙:ĝ:O\n֯R!l`\u0004y7?U3CݬNƑlx\u0012ɨ=q|Z#\u0005|0\u0005\u007fEߵ\\ɢ\r'Uܘcdh_)SNbg֪ ޞ*\u001f>ʊ3Q\u001e^{n\u0001m_[;<]{Zk?Jj$\u000e!\nu2;\u00038S{-\u05ebJŜ\rbt܀o\u0010d\u00116\fE\u001a7\u001f\u0015\u0001^]?\u001f\u000bЛ~۠h/?؟oi\u001box\t\u001aDwOwܓ^̫\u001f7:У@6\u0005;\u001b<xs.C\u0019տ~Ϩk,5õ%Q(4q&\u0004c14\"ԚDݻ\u0007ϴد\r\u0010˲^8(ڨ-,*fi3o#gۻWƬ\nu\u000fؒMlW\u007f3FQ\f\u000f:Wy_up8٥v'G\u0011uIe\u0003\f7C\u0015d':2<ڛ\u0001ߚg\\\u0017ʨDK;v,,&N\u000e=7&:\u0005$)Vӝ=؝._dǾѵs`\f)0߁\u000br\"Ol~\u0013Ԫ0J"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00012g\r-3k%\fTG9q0\u001b\u001chJC\u0006c\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r$@o~8LC\u0011", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9xFz.DY\u000b\u0004@x&=5M:o5\"\u0015uJC\u0006c\u0002", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\u001bv!>\\+Ej8\u001f\u0019hn\"\u0011b,$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Eg]17v%\u0016WB?l8\u001e\"Qk8\u00079", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9{<~!>h\u0002\u001eEU -QD?kA\u0007\u001fga\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9|Ir65f\f\u001c4t\u0016\u0017WB;A", "7mc2e(<b\u001d\t\u0004L6\r\u0016-e", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005SD-\u0011eh9jl;N\u0004#E[R6e@|M!\u0010Zc", "7mS6V(MW#\bch+|i+c\u000f2\tT", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\t>X\u0002\u001e3|\u001a8V,Ej4~\u0011fpC\u0014w\u0002", "3mP/_,=", "", "=m29\\*D:\u0015{ze", "", "@n[2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~F\b'7C", "=m29\\*D", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn9b\r Di\u0014=QMD5\u001c.$d^@\u0007G5]v4CJ]0f[`G$\u001fX\u000e$\u0012\t\u000eXN.rCJh\u00066Q\rEv\u0001U\u0017\u0018Eso>e\u0014Q\u0003^YJ(lDUn}QJ.l)dl[\u001bkDG8if\u007f da*S\u0003O\u001at\u001cgvtK\"|\u000e\u000b:vZSOsTO>%)S\u0007\u0002 2\"\u0005/>;\u0004<&?s\tIua+h\u007f\u0015\u0002CG15=@\u001c\tPt}6?\u001eq\u001dp\f\u0018kCzyunaW\u0013\u0011fa1\u001cgi\u0010>V\u000f\bN\u0001\u001dpJ\bQ[\u0007\u001e\u0005\u000emLeJ?+[\u0010wzM0n\u001e\u0013\u0001u\")\u0016\u0012J_\u000fu\u007f#(", "1d]AX9(T\u001a\rzm", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", "\u0018", "1ta?X5M9\u0019\u0013ek,\u000b\u0017\u0013n\u000f(\t<~&\u001bQx\u001c", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005VA\u001e#vEB\u0016c9Jt6KVWjG_rK\"g", "\nrTA \u0006\u0017", "5dc\u0012a(;Z\u0019}", "u(I", "4nRBf(;Z\u0019b\u0004G6\u0006w9u}+cJ\u007f\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0006?W\u000e.3j\u001d.1L$u=\r\u001fx_<nm+NL", "4nRBf(;Z\u0019g\u0005],", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u0006?W\u000e.3j\u001d.6M:k\n", "6ne2e\u0010Gb\u0019\fv\\;\u0001\u00138", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@)>h}-3k%2WL\u0005N>/\u0015uEB\u0016c9Jt6KVWj<[\u0002=!g", "7mS6V(MW#\bch+|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r\u001c4t\u0016\u0017WB;A", ":`i6_@\u001c`\u0019z\n^\u0010\u0006\b3c{7\u007fJ\n", "5dc\u001ca\nEW\u0017\u0005", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bHu", ">nX;g,K7\"\n\u000bm\u0015\u0007\b/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001[&<XCDj8'\u0017Sk=\u0010r,[Z0R\\]\u0014fQv>\u0018\u0012gvX*\rZ", ">qT@f\u0010Gb\u0019\fv\\;\u0001\u00138", "Ag^B_+\u001ac(\t^g=x\u00103d{7{", "5dc [6NZ\u0018Z\u000bm6`\u0012@a\u0007,z<\u0010\u0017", "Ag^B_+&S&\u0001z=,\u000b\u0007/n~$\u0005On\u0017\u001fCx\u001d@t3", "5dc [6NZ\u0018fzk.|g/s}(\u0005?| &5o\u00168\u007f49W\f", "BqPCX9LS~~\u000f", "", "5dc!e(OS&\rzD,\u0011", "u(;7T=:\u001d z\u0004`uf\u00064e}7Q", "CrT?C9Hd\u001d}z]\u0010\u0006\u0018/r{&\u000bD\u000b \u0005Q\u007f\u001b:v", "2d[.l\u0017KS'\r^g;|\u0016+c\u000f,\u0006I", "2hb=b:>7\"\u000ezk(z\u00183o\t6", "3lXA;6OS&^\u0004m,\n", "3lXA;6OS&^\u000eb;", "7mXA\\(EW.~^g+\u0001\u0007+t\u00042\u0005\u001c\n\u0016zP~\u000eIr#D]\b)%w&;KC\u001fl\u001d\u001e\u0015ga8", "=m0Ag(<V", "=m2.a*>Z\u0004\t~g;|\u0016\u0013n\u000b8\u000b", "=m32g(<V", "=m5<V<L3*~\u0004m", "4nRBf\u001aMO(~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egk/3|\u0016\u0004", "=m:2l\fOS\"\u000e", "3uT;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\u0017~\u00167\\\u0019", "=m:2l\fOS\"\u000eBS4\u0007\u000f\u001bx\n", "uKP;W9HW\u0018H\fb,\u000fR\u0015e\u0014\b\r@\n&l\u000bd", "=m?<\\5MS&^\f^5\f", ">nX;g,K3*~\u0004m", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp\u000f", ">`b@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0014/\u0015qp$\u0003q:$", "0nd;W:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u00139n}u", "=m?<\\5MS&^\f^5\fP\u00120\u000b\u0015\fJt", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA}&hjH\\J(Wu4QPM?&P|E\u001f\u001ch\u000e\u0018;\u0011N]J/~S\u0001*\u00120R\u0011;uJv \u0012>ypO6!G\u0003$`=7v\u001c>#j", "=m??X\u0012>gx\u0010zg;", "=m??X\u0012>gx\u0010zg;D}7o\u0006\u0014\u000fJ", "@db2g\u0017HW\"\u000ezk\u0010\u0006\u0014?tb$\u0005?\b\u0017$", "u(;8b;EW\"Hjg0\f^", "Ag^B_+%O.\u0003\u0002r\n\n\t+t\u007f\f\u0005?\u0005\u0015\u0013Vs\u0018E", "CoS.g,\u001c]!\u0007\u0005g", "CoS.g,\u001c]!\u0007\u0005gsh\u001e$P\u0001-\u0002", "/o_9l\b=R\u001d\u000e~h5x\u0010\u001de\b$\u0005O\u0005\u0015%", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ&x>)\u0015upMsc*Nz8GY$", "/o_9l\u001a>[\u0015\b\nb*\u000b", "1kX0^\u0017HW\"\u000ezk\u0010\u0006\u0014?t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp'\u0005m7NL", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u001b R\u007f\u001d\u0006\u0002/9b\r D7\u00018QLJkA\u0002\u001esqHta6Yv|.RX;cV{\u0007\u0012\u001cg\u0018^:\u0011\u000eYOmLN@.\f5Y}Jl\u000b\u0015kQ\u001colSRYNu\u001ew\u000b\u0013eKY]\t\u001d", "6`]1_,)`\u0019\r\tB5\f\t<a}7\u007fJ\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@'5g\r0Dm$w8P;yB\u007f\u0015vpI\u0014c\u001aL\u00012G\"", "=eU@X;", "6`]1_,)`\u0019\r\tB5\f\t<a}7\u007fJ\n^\u0016\u000f>\u000e:H\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq|J\u0011 \u0016C~\u0012F\u007fn7Y\f/Gz\u0016<\u0017.HkB,vhoH\u0017p,<t1RL$\u0011CX|L\u001b\u0016cWL5\u001a\u000fiP(wDEhe6R\u0011?q\u0011\b%\u0012?sF\u0006=\u0015C\u000b\u0011?H%qH#IvLACq\u007f", "\"qPCX9LS~~\u000f", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode, FocusEventModifierNode, SemanticsModifierNode, TraversableNode {
    private long centerOffset;
    private final Map<Key, PressInteraction.Press> currentKeyPressInteractions;
    private boolean enabled;
    private final FocusableInNonTouchMode focusableInNonTouchMode;
    private final FocusableNode focusableNode;
    private HoverInteraction.Enter hoverInteraction;
    private DelegatableNode indicationNode;
    private IndicationNodeFactory indicationNodeFactory;
    private MutableInteractionSource interactionSource;
    private boolean lazilyCreateIndication;
    private Function0<Unit> onClick;
    private String onClickLabel;
    private SuspendingPointerInputModifierNode pointerInputNode;
    private PressInteraction.Press pressInteraction;
    private Role role;
    private final boolean shouldAutoInvalidate;
    private final Object traverseKey;
    private MutableInteractionSource userProvidedInteractionSource;
    public static final TraverseKey TraverseKey = new TraverseKey(null);
    public static final int $stable = 8;

    public /* synthetic */ AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str, Role role, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableInteractionSource, indicationNodeFactory, z2, str, role, function0);
    }

    public void applyAdditionalSemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    public abstract Object clickPointerInput(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation);

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onPreKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo547onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        return false;
    }

    private AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str, Role role, Function0<Unit> function0) {
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.onClickLabel = str;
        this.role = role;
        this.enabled = z2;
        this.onClick = function0;
        this.focusableInNonTouchMode = new FocusableInNonTouchMode();
        this.focusableNode = new FocusableNode(this.interactionSource);
        this.currentKeyPressInteractions = new LinkedHashMap();
        this.centerOffset = Offset.Companion.m3953getZeroF1C5BW0();
        this.userProvidedInteractionSource = this.interactionSource;
        this.lazilyCreateIndication = shouldLazilyCreateIndication();
        this.traverseKey = TraverseKey;
    }

    protected final boolean getEnabled() {
        return this.enabled;
    }

    protected final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    private final boolean shouldLazilyCreateIndication() {
        return this.userProvidedInteractionSource == null && this.indicationNodeFactory != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX INFO: renamed from: updateCommon-QzZPfjk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void m548updateCommonQzZPfjk(androidx.compose.foundation.interaction.MutableInteractionSource r5, androidx.compose.foundation.IndicationNodeFactory r6, boolean r7, java.lang.String r8, androidx.compose.ui.semantics.Role r9, kotlin.jvm.functions.Function0<kotlin.Unit> r10) {
        /*
            r4 = this;
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = r4.userProvidedInteractionSource
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r5)
            r3 = 1
            if (r0 != 0) goto L9f
            r4.disposeInteractions()
            r4.userProvidedInteractionSource = r5
            r4.interactionSource = r5
            r2 = r3
        L11:
            androidx.compose.foundation.IndicationNodeFactory r0 = r4.indicationNodeFactory
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r0 != 0) goto L1c
            r4.indicationNodeFactory = r6
            r2 = r3
        L1c:
            boolean r0 = r4.enabled
            if (r0 == r7) goto L38
            if (r7 == 0) goto L8d
            androidx.compose.foundation.FocusableInNonTouchMode r0 = r4.focusableInNonTouchMode
            androidx.compose.ui.node.DelegatableNode r0 = (androidx.compose.ui.node.DelegatableNode) r0
            r4.delegate(r0)
            androidx.compose.foundation.FocusableNode r0 = r4.focusableNode
            androidx.compose.ui.node.DelegatableNode r0 = (androidx.compose.ui.node.DelegatableNode) r0
            r4.delegate(r0)
        L30:
            r0 = r4
            androidx.compose.ui.node.SemanticsModifierNode r0 = (androidx.compose.ui.node.SemanticsModifierNode) r0
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(r0)
            r4.enabled = r7
        L38:
            java.lang.String r0 = r4.onClickLabel
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r8)
            if (r0 != 0) goto L48
            r4.onClickLabel = r8
            r0 = r4
            androidx.compose.ui.node.SemanticsModifierNode r0 = (androidx.compose.ui.node.SemanticsModifierNode) r0
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(r0)
        L48:
            androidx.compose.ui.semantics.Role r0 = r4.role
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r9)
            if (r0 != 0) goto L58
            r4.role = r9
            r0 = r4
            androidx.compose.ui.node.SemanticsModifierNode r0 = (androidx.compose.ui.node.SemanticsModifierNode) r0
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(r0)
        L58:
            r4.onClick = r10
            boolean r1 = r4.lazilyCreateIndication
            boolean r0 = r4.shouldLazilyCreateIndication()
            if (r1 == r0) goto L8b
            boolean r0 = r4.shouldLazilyCreateIndication()
            r4.lazilyCreateIndication = r0
            if (r0 != 0) goto L8b
            androidx.compose.ui.node.DelegatableNode r0 = r4.indicationNode
            if (r0 != 0) goto L8b
        L6e:
            if (r3 == 0) goto L83
            androidx.compose.ui.node.DelegatableNode r1 = r4.indicationNode
            if (r1 != 0) goto L78
            boolean r0 = r4.lazilyCreateIndication
            if (r0 != 0) goto L83
        L78:
            if (r1 == 0) goto L7d
            r4.undelegate(r1)
        L7d:
            r0 = 0
            r4.indicationNode = r0
            r4.initializeIndicationAndInteractionSourceIfNeeded()
        L83:
            androidx.compose.foundation.FocusableNode r1 = r4.focusableNode
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = r4.interactionSource
            r1.update(r0)
            return
        L8b:
            r3 = r2
            goto L6e
        L8d:
            androidx.compose.foundation.FocusableInNonTouchMode r0 = r4.focusableInNonTouchMode
            androidx.compose.ui.node.DelegatableNode r0 = (androidx.compose.ui.node.DelegatableNode) r0
            r4.undelegate(r0)
            androidx.compose.foundation.FocusableNode r0 = r4.focusableNode
            androidx.compose.ui.node.DelegatableNode r0 = (androidx.compose.ui.node.DelegatableNode) r0
            r4.undelegate(r0)
            r4.disposeInteractions()
            goto L30
        L9f:
            r2 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.m548updateCommonQzZPfjk(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory, boolean, java.lang.String, androidx.compose.ui.semantics.Role, kotlin.jvm.functions.Function0):void");
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        if (!this.lazilyCreateIndication) {
            initializeIndicationAndInteractionSourceIfNeeded();
        }
        if (this.enabled) {
            delegate(this.focusableInNonTouchMode);
            delegate(this.focusableNode);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        disposeInteractions();
        if (this.userProvidedInteractionSource == null) {
            this.interactionSource = null;
        }
        DelegatableNode delegatableNode = this.indicationNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.indicationNode = null;
    }

    protected final void disposeInteractions() {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            PressInteraction.Press press = this.pressInteraction;
            if (press != null) {
                mutableInteractionSource.tryEmit(new PressInteraction.Cancel(press));
            }
            HoverInteraction.Enter enter = this.hoverInteraction;
            if (enter != null) {
                mutableInteractionSource.tryEmit(new HoverInteraction.Exit(enter));
            }
            Iterator<T> it = this.currentKeyPressInteractions.values().iterator();
            while (it.hasNext()) {
                mutableInteractionSource.tryEmit(new PressInteraction.Cancel((PressInteraction.Press) it.next()));
            }
        }
        this.pressInteraction = null;
        this.hoverInteraction = null;
        this.currentKeyPressInteractions.clear();
    }

    private final void initializeIndicationAndInteractionSourceIfNeeded() {
        IndicationNodeFactory indicationNodeFactory;
        if (this.indicationNode == null && (indicationNodeFactory = this.indicationNodeFactory) != null) {
            if (this.interactionSource == null) {
                this.interactionSource = InteractionSourceKt.MutableInteractionSource();
            }
            this.focusableNode.update(this.interactionSource);
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            Intrinsics.checkNotNull(mutableInteractionSource);
            DelegatableNode delegatableNodeCreate = indicationNodeFactory.create(mutableInteractionSource);
            delegate(delegatableNodeCreate);
            this.indicationNode = delegatableNodeCreate;
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public final void mo546onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        NodeCoordinator coordinator$ui_release;
        try {
            SemanticsManager.INSTANCE.setConfiguration(null);
            if (SemanticsManager.INSTANCE.isReleaseActionState(pointerEvent) && (coordinator$ui_release = getNode().getCoordinator$ui_release()) != null && coordinator$ui_release.getLayoutNode().getNodes$ui_release().m5710hasH91voCI$ui_release(NodeKind.m5749constructorimpl(8))) {
                SemanticsManager.INSTANCE.setConfiguration(SemanticsNodeKt.SemanticsNode(coordinator$ui_release.getLayoutNode(), true).getConfig());
            }
            long jM6814getCenterozmzZPI = IntSizeKt.m6814getCenterozmzZPI(j2);
            this.centerOffset = OffsetKt.Offset(IntOffset.m6766getXimpl(jM6814getCenterozmzZPI), IntOffset.m6767getYimpl(jM6814getCenterozmzZPI));
            initializeIndicationAndInteractionSourceIfNeeded();
            if (this.enabled && pointerEventPass == PointerEventPass.Main) {
                int iM5327getType7fucELk = pointerEvent.m5327getType7fucELk();
                if (PointerEventType.m5334equalsimpl0(iM5327getType7fucELk, PointerEventType.Companion.m5338getEnter7fucELk())) {
                    BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$1(this, null), 3, null);
                } else if (PointerEventType.m5334equalsimpl0(iM5327getType7fucELk, PointerEventType.Companion.m5339getExit7fucELk())) {
                    BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onPointerEvent$2(this, null), 3, null);
                }
            }
            if (this.pointerInputNode == null) {
                this.pointerInputNode = (SuspendingPointerInputModifierNode) delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new AbstractClickableNode$onPointerEvent$3(this, null)));
            }
            SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
            if (suspendingPointerInputModifierNode != null) {
                suspendingPointerInputModifierNode.mo546onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
            }
            if (SemanticsManager.INSTANCE.isFinalReleaseActionState(pointerEvent, pointerEventPass)) {
                SemanticsManager.INSTANCE.setConfiguration(null);
            }
        } catch (Throwable th) {
            if (SemanticsManager.INSTANCE.isFinalReleaseActionState(pointerEvent, pointerEventPass)) {
                SemanticsManager.INSTANCE.setConfiguration(null);
            }
            throw th;
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void onCancelPointerInput() {
        HoverInteraction.Enter enter;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null && (enter = this.hoverInteraction) != null) {
            mutableInteractionSource.tryEmit(new HoverInteraction.Exit(enter));
        }
        this.hoverInteraction = null;
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.onCancelPointerInput();
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* JADX INFO: renamed from: onKeyEvent-ZmokQxo, reason: not valid java name */
    public final boolean mo545onKeyEventZmokQxo(KeyEvent keyEvent) {
        initializeIndicationAndInteractionSourceIfNeeded();
        if (this.enabled && Clickable_androidKt.m620isPressZmokQxo(keyEvent)) {
            if (!this.currentKeyPressInteractions.containsKey(Key.m4932boximpl(KeyEvent_androidKt.m5243getKeyZmokQxo(keyEvent)))) {
                PressInteraction.Press press = new PressInteraction.Press(this.centerOffset, null);
                this.currentKeyPressInteractions.put(Key.m4932boximpl(KeyEvent_androidKt.m5243getKeyZmokQxo(keyEvent)), press);
                if (this.interactionSource == null) {
                    return true;
                }
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$1(this, press, null), 3, null);
                return true;
            }
        } else if (this.enabled && Clickable_androidKt.m618isClickZmokQxo(keyEvent)) {
            PressInteraction.Press pressRemove = this.currentKeyPressInteractions.remove(Key.m4932boximpl(KeyEvent_androidKt.m5243getKeyZmokQxo(keyEvent)));
            if (pressRemove != null && this.interactionSource != null) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$onKeyEvent$2$1(this, pressRemove, null), 3, null);
            }
            this.onClick.invoke();
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void onFocusEvent(FocusState focusState) {
        if (focusState.isFocused()) {
            initializeIndicationAndInteractionSourceIfNeeded();
        }
        if (this.enabled) {
            this.focusableNode.onFocusEvent(focusState);
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Role role = this.role;
        if (role != null) {
            Intrinsics.checkNotNull(role);
            SemanticsPropertiesKt.m5952setRolekuIjeqM(semanticsPropertyReceiver, role.m5932unboximpl());
        }
        SemanticsPropertiesKt.onClick(semanticsPropertyReceiver, this.onClickLabel, new Function0<Boolean>() { // from class: androidx.compose.foundation.AbstractClickableNode.applySemantics.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                AbstractClickableNode.this.getOnClick().invoke();
                return true;
            }
        });
        if (this.enabled) {
            this.focusableNode.applySemantics(semanticsPropertyReceiver);
        } else {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        applyAdditionalSemantics(semanticsPropertyReceiver);
    }

    protected final Unit resetPointerInputHandler() {
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.pointerInputNode;
        if (suspendingPointerInputModifierNode == null) {
            return null;
        }
        suspendingPointerInputModifierNode.resetPointerInputHandler();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: handlePressInteraction-d-4ec7I, reason: not valid java name */
    protected final Object m544handlePressInteractiond4ec7I(PressGestureScope pressGestureScope, long j2, Continuation<? super Unit> continuation) {
        Object objCoroutineScope;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        return (mutableInteractionSource == null || (objCoroutineScope = CoroutineScopeKt.coroutineScope(new AbstractClickableNode$handlePressInteraction$2$1(pressGestureScope, j2, mutableInteractionSource, this, null), continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : objCoroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean delayPressInteraction() {
        return ClickableKt.hasScrollableContainer(this) || Clickable_androidKt.isComposeRootInScrollableContainer(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitHoverEnter() {
        if (this.hoverInteraction == null) {
            HoverInteraction.Enter enter = new HoverInteraction.Enter();
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverEnter$1$1(mutableInteractionSource, enter, null), 3, null);
            }
            this.hoverInteraction = enter;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitHoverExit() {
        HoverInteraction.Enter enter = this.hoverInteraction;
        if (enter != null) {
            HoverInteraction.Exit exit = new HoverInteraction.Exit(enter);
            MutableInteractionSource mutableInteractionSource = this.interactionSource;
            if (mutableInteractionSource != null) {
                BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AbstractClickableNode$emitHoverExit$1$1$1(mutableInteractionSource, exit, null), 3, null);
            }
            this.hoverInteraction = null;
        }
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    /* JADX INFO: compiled from: Clickable.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u000e\u001d<K!&i\u000eӵLcz\u0004Gّ1!Ǟr~P+R|\rfʴ=0Re߲2S"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI)\u0006P\n\u0016\u0013Vs\u0018E@\u00012g\r-3k%\fTG9q0\u001b\u001chJC\u0006cj=\u0004#XL[:\\8rQi", "", "u(E", "4nd;W(MW#\btk,\u0004\t+s\u007f"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class TraverseKey {
        public /* synthetic */ TraverseKey(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TraverseKey() {
        }
    }
}
