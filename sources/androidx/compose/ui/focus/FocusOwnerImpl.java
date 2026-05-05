package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.MutableLongSet;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
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
/* JADX INFO: compiled from: FocusOwnerImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яħ\u0014D57\u001eq\u007fZDkŞ\fA\u001c0\u0013.X~*, w\u000f߿r9FDmHDR[*%k\u00044*[,qY;]ڼ\u0006\"\u0017XVgmpRZ!C\u0017\u0006\u001cxr,_U\u0001ز\u001a\u000fHBw?9Nw=O`|Ȃ\r H\"@y\u000b\u0002\"*^\u0010~zIN\u0014\u0012F@x:X\u0015U\u00050\u0012\u000e>&\u0007&\\}N>HrjB/9\u0003qBd'g0\u0003Q\u0015Fj'\u0015vw\u001e3@=5\u001d%aΈ\u000fѸc?\u0019?y=\u000bo-ݐAɞ$WdW@З\u0014;e\u001b]\u000b8l\raf\u001c);O\u0012N~\u00108y\u000b{;?2\u000f\u0016_V2ENv\u001b\u001eD\u000bq\u0002Fг\u0006hH\u0007\u000bg<\u001f5\u000291_$vdqL/Me\u0006˿\u0011()\b~'a\\\u001eb\u001b!z\u0003a3a@kT|\u000fi\\{\u0011\t}\u0012;\u0014?u\u0006\u009e\u007f\u001b4\u001e5=aA3#q\bnMwx\u0015`\u0017_\u0018SXJ0|.=:\u000b\u001cZrg3m``f;)U,X\u0017\u007f\u001e\u0012Nf&>1/\u001e^gnyl]]86]hƠ]ny  Gl\\MQ\u0012\u0013\u0012V\u0005>W<\u0011\u0011\u001fz\u000b\u0004\u001a\u0004t(P>xn\u001e\"\u0014D|\u0018C6M\u001d44Z=I`#t\u001b\u001epM-\rmc\u0001\u0010-Zy8өh˅ڲ\r\u0003V\n~\u001e0\u0011W[\u0015`P9qUCI>UP\u001az\u0011ʶ\u0006Ѩ\u0381\u0004Im~U\u007f5<\u0004\n\u0014 D&iU=m+\u000f-Zb\f;zdxuS]\u0012U\u0007+{UOŕ-ԖŰnr2\u0017x\u0002\u0018b%Z\u000f^!/8h\u000e3yF)\u0002*hS\u0014L\u0005\u000b\u0005o;|D-\t-'=\u0001\u001e(-;;\u007f?\u001f,vB9Eqk'\b:\nd\u001f&#\u0006\u0014.s\u0016\u001en\u007f^xOϨHʲ˽B$*+\u0011\u0002\u0011r\u0006HZ\u000bJ\faR\bx9\\F\u000f#/,iM,U\td\u001eR\u0013\u001e\nd2m3\fC,\u001a%WӒ\u0010\u07bdϬkos\u000fjO\u0013\u0015\u0018P\u00141\u001d\u0015bQhxe)!04\u007fH<ODz\u0007R\bR:\\B\u0016\u0016[V\u007f\u0005>\u0005FZޣ\u000eğЋFsA\u001eVb\u0007%nH3cud/s\u0019~=}d\r}?\u00136^T]fb\u0005af!\u001b\u0019\u001bEzm9R\u001dQ\u001bV[1\u000fS'[I0VJ[q\u0010y<$8F\tMF&$QQ?e'6l\u0016mfdc%\u001c-fȂ!ĖΉ~~\u0014\n\u0018]S1]B\bb[X~{Es2\u0001Euo\u0007Ӓ{ݭ̍\u001f/\f\u0006;p\u0012v\"x\u0014Yi:,ZH UW;!%\t\u001c;\"_19\\G6j\bƁ!&6\u0003VJ#I2.6\n\u007f\fAY+dim\b!\u0007|YELןQҎwŽʋpet/\u0019]/\u0017dU\u0007-~ )/Sܘ!.p99SN,9\u007fBhV)D_z/ Qsh7A}4=;=HBmA2b\u001eDt\nw\u0014*\u0003+C<\u0007WLB!b|Dg\u000e\rmVf%\u001c7r\u0015\u000bX`!\u0013z\u001c\u0003 t/e\u001cM\\SӔfջ\u0003ـõ*#72M{\b>\u0019\u0003@v?\u0017\u0011Ŋvʷ.B\u0011ۂPy:B^Tk0}ک&މh\t.ɔ]:H\u001f:)^\u001f=sP\"T[H6\u0012Ǟ?¡\u001d\u0011\t́\t\u0018}\"15\u0019m*Ў,ʫ\u0001\u0007\u0015ׄ\u00123qW\u0002UC5=\u001d\b!ghK%chz)b֎gڧ\u0003MkǾ_u:XMM.}eB\u0016\tM.R\bL\u0081\u0002ӽ5H2أ-Rd\u0004o\n6,Fnr4unO݈\fߢm\u0018{ߪ,\tBN\u0013/)UN9[rخIWn\u0001\u001bJ\u0013M$9\u0015\fO<'~ O LYJIٌ1ۺa<\u001bŎTz@eN.WSi;\u001c,@ZŀntsXo\u0016>\u001a\u001d\u000f\n}W[p\u0013p..&y\u0001̒:f~TQh\u0011H\u001f&d4h\u0017\u001b\b&.v#0\u0003!ߺ\u0017Θ7G{ݝ\u0018*d\u001b9\u001d?{{̶1ڃnSGޟ\nZCZA-\u000eL^Xs\u0001Ug/p|+C&!\u007f\u0005ܯXð\u001e.p\b\u0014lrpϤD}L+sԉL^Oڭ^%"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egg2@m#\u0012UNBA", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egg2@m#\u0004", "=mA2d<>a(Z\u0006i3\u0011f2a\t*{Ng\u001b%Vo\u0017<\u0004", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "", "=mA2d<>a(_\u0005\\<\u000bi9ri:\u0005@\u000e", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Eg\\$Dm\u0014=QMDA", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "4nRBf\u000bB`\u0019|\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", ">qTC\\6Na \u0013[h*\r\u0017/dl(yO", "", "=m<<i,\u001f]\u0017\u000f\tB5\f\t<o\u000b", "=m29X(K4#|\u000bl\r\u0007\u0016\u0019w\t(\t", "=m5<V<L@\u0019|\nB5\f\t<o\u000b", "=m;.l6Nbw\u0003\b^*\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%S\u0007=w%5QL\u0005pE&^iqB\u0005r0X\u007f5\u0011-^5ZavG\u001d^0tT5\u001c\f]JmsU?h\t<R\u007fJl\u000b\u0015$W\u0016zy@e\u0014Q\u0003`K(/rU`c\u0003\u0011FVjse\u001ch\u001bk>D-\";y+qN=\u000e\u0006\\[H9\u007fqvN\u001d\u0004\u0002)Ou%GUxSKx1(YEX\";V\u0004/~6N\n\u0011<n\u0014Rk!\bc\n\u001du]Q0$E@\u001dHY-V|G\fw#k\u0011X8x\"", "4nRBf\u0010Gd\u0015\u0006~](\f\r9ng$\u0005<\u0003\u0017$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Ega)Hi\u001d2L?Jo>'|dj5\tc9$", "4nRBf\u001bKO\"\rv\\;\u0001\u00138M{1wB\u0001$", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egl-3v$*KR?u=\u0006\u0011q];\u0007p\u0002", "5dc\u0013b*Na\b\fvg:x\u0007>i\n1c<\n\u0013\u0019G|", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0018Qm\u001eJ@\u0006?W\u000e.&z\u00127[?9z8(\u001eP]B\u0003e,[L", "9dh@6<K`\u0019\b\ne@[\u0013An", "\u001a`]1e6BR,Hxh3\u0004\t-t\u00042\u0005\nh'&Cl\u0015<]/>[k FC", ";nS6Y0>`", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "5dc\u001ab+BT\u001d~\b", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`~Qn\u0012=z%B/", "@n^A96<c'g\u0005],", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egl\u001cDo\u0016=6M:k\n", "5dc\u001fb6M4#|\u000bl\u0015\u0007\b/$\u0010,uM\u0001\u001e\u0017C}\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0018Qm\u001eJ@\u0006?W\u000e.&i#0MR$u3\u001ej", "Adc\u001fb6M4#|\u000bl\u0015\u0007\b/$\u0010,uM\u0001\u001e\u0017C}\u000e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\u000f3z\u0018.\\,Ej4sXY", "@n^AF;:b\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egk/3|\u0016\u0004", "5dc\u001fb6MA(z\n^", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0018Qm\u001eJ@\u0006?W\u000e.%|\u0012=M\u0019", "1kT.e\rHQ)\r", "4na0X", "@dU?X:A4#|\u000bl\f\u000e\t8t\u000e", "1kT.e\u0016P\\\u0019\f[h*\r\u0017", "1kT.e\rHQ)\rBB}\u0004\u0016\u001aN\u0002", "uYI'<o3", "2hb=T;<V|\b\n^9z\t:t\u007f'iJ\u0002&|G\u0004\u000bFr249\u000f @|", "9dh\u0012i,Gb", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\u0017~\u00167\\\u0019", "2hb=T;<V|\b\n^9z\t:t\u007f'iJ\u0002&|G\u0004\u000bFr249\u000f @|]#UMAWG(", "uKP;W9HW\u0018H\fb,\u000fR\u0015e\u0014\b\r@\n&l\u000bd", "2hb=T;<V~~\u000f>=|\u0012>", "=m5<V<LS\u0018b\n^4", "2hb=T;<V~~\u000f>=|\u0012>-s+d\rja)", "uKP;W9HW\u0018H\fb,\u000fR\u0015e\u0014\b\r@\n&l.u\u0018K})>#\u00031?7\u0017>VAJo>'#2BI\u0010a;R\u00010\u0012\"\u0012!", "2hb=T;<V\u0006\t\nZ9\u0011h@e\t7", "3uT;g", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WI\u000141f\u0012i$w%*ZW)iA(\u001coAJ\u0007l;$", "4nRBf\u001a>O&|}", "4nRBf,=@\u0019|\n", "=m5<h5=", "4nRBf\u001a>O&|}&\u001cc|\u0002qa:", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#j 5|k\u0015SMJr8'^mrAPd<Wt6KVW:&3\u0003F\u0012!^\u0018WvbH@F \u007f@\u0001&\u00045KK\u0018r\u000b\u0013\u0016\n>@", "5dc\u0013b*Na\u0006~xm", "7me._0=O(~dp5|\u0016\u0010o}8\n.\u0010\u0013&G", ";ne296<c'", ";ne296<c'FH>\u001a]\u000f\u00198", "uH\u0018'", "@d[2T:>4#|\u000bl", "@d`BX:M4#|\u000bl\r\u0007\u0016\u0019w\t(\t", "@d`BX:M4#|\u000bl\r\u0007\u0016\u0019w\t(\t\bR!g\u0014z\u0017F", "AbW2W<ES|\b\fZ3\u0001\b+t\u00042\u0005", "<nS2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Eg]17v%\u0016WB?l8\u001e\"Qk8\u00079", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egh-Ax\u0016;\\G;y\u001c(\u0014lb=\u0007p\u0015Xu'\u001d", "B`Z296<c'", "B`Z296<c'FvM6`\u00106A", "uH;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Gy\u0016<\u00062I#j 5|kqB", "D`[6W(MS~~\u000f>=|\u0012>", "D`[6W(MS~~\u000f>=|\u0012>-t0\u0006Fl*!", ":`bA?6<O dzr\u0010\u0006\u0014?th2z@", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004c\u001ec| \r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9l<}%7U\r\u001c4t\u0016\u0017WB;A", "<dP?X:M/\"|zl;\u0007\u0016\u0013n}/\f?\u0005 \u00195o\u0015=", "\"", "", "Bx_2", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9vFu%\u001b]\u0007\u001f\r", "<dP?X:M/\"|zl;\u0007\u0016\u0013n}/\f?\u0005 \u00195o\u0015=>u\u00048e\u001c6w", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW\u001bv,5[y/3j\u001d.6M:k\n\u0002XOf5\u0018_uUr0I\u00168)aRpLi", "BqPCX9LSt\bx^:\f\u0013<sc1yG\u0011\u0016\u001bPq{<}&", "=m??X\u001dBa\u001d\u000e", "=mE6f0M", "=m?<f;/W'\u0003\n", "BqPCX9LSt\bx^:\f\u0013<sc1yG\u0011\u0016\u001bPq{<}&|E^#\u001brg4", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW\u001bv,5[y/3j\u001d.6M:k\n\u0002{nkH\u000eg5\u0018{8O\u0016O<eP\u0002A\u001e\u001bhW/;\u0016\u0003hE.w\u0010\r\u0006\u000e6X\t?qJ\u0011'\u0016~k\u0001KT\u001fK\u0004\u001e\u0004\u000b\nxOWn}QJ\u00108\u0011j\u0016n$`C\u0004)%yb\u001cxY,\u0019\u007f]\u001a\u0001\u001cZwpE(~B-\nC\u001f7", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class FocusOwnerImpl implements FocusOwner {
    public static final int $stable = 8;
    private final FocusInvalidationManager focusInvalidationManager;
    private MutableLongSet keysCurrentlyDown;
    private final Function0<Unit> onClearFocusForOwner;
    private final Function0<Rect> onFocusRectInterop;
    private final Function0<LayoutDirection> onLayoutDirection;
    private final Function1<FocusDirection, Boolean> onMoveFocusInterop;
    private final Function2<FocusDirection, Rect, Boolean> onRequestFocusForOwner;
    private FocusTargetNode rootFocusNode = new FocusTargetNode();
    private final FocusTransactionManager focusTransactionManager = new FocusTransactionManager();
    private final Modifier modifier = FocusPropertiesKt.focusProperties(Modifier.Companion, new Function1<FocusProperties, Unit>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FocusProperties focusProperties) {
            invoke2(focusProperties);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FocusProperties focusProperties) {
            focusProperties.setCanFocus(false);
        }
    }).then(new ModifierNodeElement<FocusTargetNode>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$2
        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object obj) {
            return obj == this;
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(FocusTargetNode focusTargetNode) {
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public FocusTargetNode create() {
            return this.this$0.getRootFocusNode$ui_release();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("RootFocusTarget");
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return this.this$0.getRootFocusNode$ui_release().hashCode();
        }
    });

    /* JADX INFO: compiled from: FocusOwnerImpl.kt */
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CustomDestinationResult.values().length];
            try {
                iArr[CustomDestinationResult.Redirected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomDestinationResult.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomDestinationResult.RedirectCancelled.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomDestinationResult.None.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusOwnerImpl(Function1<? super Function0<Unit>, Unit> function1, Function2<? super FocusDirection, ? super Rect, Boolean> function2, Function1<? super FocusDirection, Boolean> function12, Function0<Unit> function0, Function0<Rect> function02, Function0<? extends LayoutDirection> function03) {
        this.onRequestFocusForOwner = function2;
        this.onMoveFocusInterop = function12;
        this.onClearFocusForOwner = function0;
        this.onFocusRectInterop = function02;
        this.onLayoutDirection = function03;
        this.focusInvalidationManager = new FocusInvalidationManager(function1, new FocusOwnerImpl$focusInvalidationManager$1(this));
    }

    public final FocusTargetNode getRootFocusNode$ui_release() {
        return this.rootFocusNode;
    }

    public final void setRootFocusNode$ui_release(FocusTargetNode focusTargetNode) {
        this.rootFocusNode = focusTargetNode;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public FocusTransactionManager getFocusTransactionManager() {
        return this.focusTransactionManager;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: requestFocusForOwner-7o62pno */
    public boolean mo3870requestFocusForOwner7o62pno(FocusDirection focusDirection, Rect rect) {
        return this.onRequestFocusForOwner.invoke(focusDirection, rect).booleanValue();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: takeFocus-aToIllA */
    public boolean mo3871takeFocusaToIllA(final int i2, Rect rect) {
        Boolean boolMo3869focusSearchULY8qGw = mo3869focusSearchULY8qGw(i2, rect, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$takeFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                Boolean boolM3888requestFocusMxy_nc0 = FocusTransactionsKt.m3888requestFocusMxy_nc0(focusTargetNode, i2);
                return Boolean.valueOf(boolM3888requestFocusMxy_nc0 != null ? boolM3888requestFocusMxy_nc0.booleanValue() : false);
            }
        });
        if (boolMo3869focusSearchULY8qGw != null) {
            return boolMo3869focusSearchULY8qGw.booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void releaseFocus() {
        FocusTransactionManager focusTransactionManager = getFocusTransactionManager();
        if (!focusTransactionManager.ongoingTransaction) {
            try {
                focusTransactionManager.beginTransaction();
                FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
                return;
            } finally {
                focusTransactionManager.commitTransaction();
            }
        }
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
    }

    @Override // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean z2) {
        mo3866clearFocusI7lrPNg(z2, true, true, FocusDirection.Companion.m3857getExitdhqQ8s());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[Catch: all -> 0x004b, TryCatch #0 {all -> 0x004b, blocks: (B:3:0x0008, B:5:0x000e, B:6:0x0011, B:8:0x0016, B:10:0x001f, B:16:0x0036), top: B:26:0x0008 }] */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: clearFocus-I7lrPNg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo3866clearFocusI7lrPNg(boolean r4, boolean r5, boolean r6, int r7) {
        /*
            r3 = this;
            androidx.compose.ui.focus.FocusTransactionManager r2 = r3.getFocusTransactionManager()
            androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 r1 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1
                static {
                    /*
                        androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1 r0 = new androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1) androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1.INSTANCE androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 0
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1.<init>():void");
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1.invoke2():void");
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    /*
                        r1 = this;
                        r1.invoke2()
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1.invoke():java.lang.Object");
                }
            }
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            boolean r0 = androidx.compose.ui.focus.FocusTransactionManager.access$getOngoingTransaction$p(r2)     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L11
            androidx.compose.ui.focus.FocusTransactionManager.access$cancelTransaction(r2)     // Catch: java.lang.Throwable -> L4b
        L11:
            androidx.compose.ui.focus.FocusTransactionManager.access$beginTransaction(r2)     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L1d
            androidx.compose.runtime.collection.MutableVector r0 = androidx.compose.ui.focus.FocusTransactionManager.access$getCancellationListener$p(r2)     // Catch: java.lang.Throwable -> L4b
            r0.add(r1)     // Catch: java.lang.Throwable -> L4b
        L1d:
            if (r4 != 0) goto L36
            androidx.compose.ui.focus.FocusTargetNode r0 = r3.rootFocusNode     // Catch: java.lang.Throwable -> L4b
            androidx.compose.ui.focus.CustomDestinationResult r0 = androidx.compose.ui.focus.FocusTransactionsKt.m3884performCustomClearFocusMxy_nc0(r0, r7)     // Catch: java.lang.Throwable -> L4b
            int[] r1 = androidx.compose.ui.focus.FocusOwnerImpl.WhenMappings.$EnumSwitchMapping$0     // Catch: java.lang.Throwable -> L4b
            int r0 = r0.ordinal()     // Catch: java.lang.Throwable -> L4b
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L4b
            r0 = 1
            if (r1 == r0) goto L3d
            r0 = 2
            if (r1 == r0) goto L3d
            r0 = 3
            if (r1 == r0) goto L3d
        L36:
            androidx.compose.ui.focus.FocusTargetNode r0 = r3.rootFocusNode     // Catch: java.lang.Throwable -> L4b
            boolean r1 = androidx.compose.ui.focus.FocusTransactionsKt.clearFocus(r0, r4, r5)     // Catch: java.lang.Throwable -> L4b
            goto L3e
        L3d:
            r1 = 0
        L3e:
            androidx.compose.ui.focus.FocusTransactionManager.access$commitTransaction(r2)
            if (r1 == 0) goto L4a
            if (r6 == 0) goto L4a
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r3.onClearFocusForOwner
            r0.invoke()
        L4a:
            return r1
        L4b:
            r0 = move-exception
            androidx.compose.ui.focus.FocusTransactionManager.access$commitTransaction(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.mo3866clearFocusI7lrPNg(boolean, boolean, boolean, int):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Boolean] */
    @Override // androidx.compose.ui.focus.FocusManager
    /* JADX INFO: renamed from: moveFocus-3ESFkO8 */
    public boolean mo3864moveFocus3ESFkO8(final int i2) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = false;
        Boolean boolMo3869focusSearchULY8qGw = mo3869focusSearchULY8qGw(i2, this.onFocusRectInterop.invoke(), new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$focusSearchSuccess$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Boolean] */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                objectRef.element = FocusTransactionsKt.m3888requestFocusMxy_nc0(focusTargetNode, i2);
                Boolean bool = objectRef.element;
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            }
        });
        if (boolMo3869focusSearchULY8qGw == null || objectRef.element == 0) {
            return false;
        }
        if (Intrinsics.areEqual((Object) boolMo3869focusSearchULY8qGw, (Object) true) && Intrinsics.areEqual((Object) objectRef.element, (Object) true)) {
            return true;
        }
        if (FocusOwnerImplKt.m3875is1dFocusSearch3ESFkO8(i2)) {
            return mo3866clearFocusI7lrPNg(false, true, false, i2) && mo3871takeFocusaToIllA(i2, null);
        }
        return this.onMoveFocusInterop.invoke(FocusDirection.m3846boximpl(i2)).booleanValue();
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: focusSearch-ULY8qGw */
    public Boolean mo3869focusSearchULY8qGw(int i2, Rect rect, final Function1<? super FocusTargetNode, Boolean> function1) {
        final FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            FocusRequester focusRequesterM3889customFocusSearchOMvw8 = FocusTraversalKt.m3889customFocusSearchOMvw8(focusTargetNodeFindActiveFocusNode, i2, this.onLayoutDirection.invoke());
            if (Intrinsics.areEqual(focusRequesterM3889customFocusSearchOMvw8, FocusRequester.Companion.getCancel())) {
                return null;
            }
            if (!Intrinsics.areEqual(focusRequesterM3889customFocusSearchOMvw8, FocusRequester.Companion.getDefault())) {
                return Boolean.valueOf(focusRequesterM3889customFocusSearchOMvw8.findFocusTargetNode$ui_release(function1));
            }
        } else {
            focusTargetNodeFindActiveFocusNode = null;
        }
        return FocusTraversalKt.m3890focusSearch0X8WOeE(this.rootFocusNode, i2, this.onLayoutDirection.invoke(), rect, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$focusSearch$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                boolean zBooleanValue;
                if (Intrinsics.areEqual(focusTargetNode, focusTargetNodeFindActiveFocusNode)) {
                    zBooleanValue = false;
                } else {
                    if (Intrinsics.areEqual(focusTargetNode, this.getRootFocusNode$ui_release())) {
                        throw new IllegalStateException("Focus search landed at the root.".toString());
                    }
                    zBooleanValue = function1.invoke(focusTargetNode).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ba  */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v18, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: dispatchKeyEvent-YhN2O0w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo3868dispatchKeyEventYhN2O0w(android.view.KeyEvent r18, kotlin.jvm.functions.Function0<java.lang.Boolean> r19) {
        /*
            Method dump skipped, instruction units count: 949
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusOwnerImpl.mo3868dispatchKeyEventYhN2O0w(android.view.KeyEvent, kotlin.jvm.functions.Function0):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // androidx.compose.ui.focus.FocusOwner
    /* JADX INFO: renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo */
    public boolean mo3867dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent) {
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode;
        int size;
        NodeChain nodes$ui_release;
        ?? Pop;
        NodeChain nodes$ui_release2;
        if (this.focusInvalidationManager.hasPendingInvalidation()) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            return false;
        }
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            FocusTargetNode focusTargetNode = focusTargetNodeFindActiveFocusNode;
            int iM5749constructorimpl = NodeKind.m5749constructorimpl(131072);
            if (!focusTargetNode.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node node = focusTargetNode.getNode();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    Pop = 0;
                    break;
                }
                if ((-1) - (((-1) - layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0) {
                    while (node != null) {
                        if ((-1) - (((-1) - node.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0) {
                            MutableVector mutableVector = null;
                            Pop = node;
                            while (Pop != 0) {
                                if (Pop instanceof SoftKeyboardInterceptionModifierNode) {
                                    break loop0;
                                }
                                if ((Pop.getKindSet$ui_release() & iM5749constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = ((DelegatingNode) Pop).getDelegate$ui_release();
                                    int i2 = 0;
                                    Pop = Pop;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                Pop = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (Pop != 0) {
                                                    if (mutableVector != null) {
                                                        mutableVector.add(Pop);
                                                    }
                                                    Pop = 0;
                                                }
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegate$ui_release);
                                                }
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        Pop = Pop;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                Pop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        node = node.getParent$ui_release();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                node = (layoutNodeRequireLayoutNode == null || (nodes$ui_release2 = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release2.getTail$ui_release();
            }
            softKeyboardInterceptionModifierNode = (SoftKeyboardInterceptionModifierNode) Pop;
        } else {
            softKeyboardInterceptionModifierNode = null;
        }
        if (softKeyboardInterceptionModifierNode != null) {
            SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode2 = softKeyboardInterceptionModifierNode;
            int iM5749constructorimpl2 = NodeKind.m5749constructorimpl(131072);
            if (!softKeyboardInterceptionModifierNode2.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent$ui_release = softKeyboardInterceptionModifierNode2.getNode().getParent$ui_release();
            LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(softKeyboardInterceptionModifierNode2);
            ArrayList arrayList = null;
            while (layoutNodeRequireLayoutNode2 != null) {
                if ((-1) - (((-1) - layoutNodeRequireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release()) | ((-1) - iM5749constructorimpl2)) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & iM5749constructorimpl2) != 0) {
                            Modifier.Node nodePop = parent$ui_release;
                            MutableVector mutableVector2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof SoftKeyboardInterceptionModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodePop);
                                } else if ((-1) - (((-1) - nodePop.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl2)) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                        if ((-1) - (((-1) - delegate$ui_release2.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl2)) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                nodePop = delegate$ui_release2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    if (mutableVector2 != null) {
                                                        mutableVector2.add(nodePop);
                                                    }
                                                    nodePop = null;
                                                }
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(delegate$ui_release2);
                                                }
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
                parent$ui_release = (layoutNodeRequireLayoutNode2 == null || (nodes$ui_release = layoutNodeRequireLayoutNode2.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i4 = size - 1;
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(size)).mo4931onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
            }
            ?? node2 = softKeyboardInterceptionModifierNode2.getNode();
            MutableVector mutableVector3 = null;
            while (node2 != 0) {
                if (!(node2 instanceof SoftKeyboardInterceptionModifierNode)) {
                    int kindSet$ui_release = node2.getKindSet$ui_release();
                    if ((kindSet$ui_release + iM5749constructorimpl2) - (kindSet$ui_release | iM5749constructorimpl2) != 0 && (node2 instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release3 = ((DelegatingNode) node2).getDelegate$ui_release();
                        int i5 = 0;
                        node2 = node2;
                        while (delegate$ui_release3 != null) {
                            if ((-1) - (((-1) - delegate$ui_release3.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl2)) != 0) {
                                i5++;
                                if (i5 == 1) {
                                    node2 = delegate$ui_release3;
                                } else {
                                    if (mutableVector3 == null) {
                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node2 != 0) {
                                        if (mutableVector3 != null) {
                                            mutableVector3.add(node2);
                                        }
                                        node2 = 0;
                                    }
                                    if (mutableVector3 != null) {
                                        mutableVector3.add(delegate$ui_release3);
                                    }
                                }
                            }
                            delegate$ui_release3 = delegate$ui_release3.getChild$ui_release();
                            node2 = node2;
                        }
                        if (i5 == 1) {
                        }
                    }
                } else if (((SoftKeyboardInterceptionModifierNode) node2).mo4931onPreInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                    return true;
                }
                node2 = DelegatableNodeKt.pop(mutableVector3);
            }
            ?? node3 = softKeyboardInterceptionModifierNode2.getNode();
            MutableVector mutableVector4 = null;
            while (node3 != 0) {
                if (!(node3 instanceof SoftKeyboardInterceptionModifierNode)) {
                    int kindSet$ui_release2 = node3.getKindSet$ui_release();
                    if ((kindSet$ui_release2 + iM5749constructorimpl2) - (kindSet$ui_release2 | iM5749constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release4 = ((DelegatingNode) node3).getDelegate$ui_release();
                        int i6 = 0;
                        node3 = node3;
                        while (delegate$ui_release4 != null) {
                            if ((delegate$ui_release4.getKindSet$ui_release() & iM5749constructorimpl2) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    node3 = delegate$ui_release4;
                                } else {
                                    if (mutableVector4 == null) {
                                        mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node3 != 0) {
                                        if (mutableVector4 != null) {
                                            mutableVector4.add(node3);
                                        }
                                        node3 = 0;
                                    }
                                    if (mutableVector4 != null) {
                                        mutableVector4.add(delegate$ui_release4);
                                    }
                                }
                            }
                            delegate$ui_release4 = delegate$ui_release4.getChild$ui_release();
                            node3 = node3;
                        }
                        if (i6 == 1) {
                        }
                    }
                } else if (((SoftKeyboardInterceptionModifierNode) node3).mo4930onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                    return true;
                }
                node3 = DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    if (((SoftKeyboardInterceptionModifierNode) arrayList.get(i7)).mo4930onInterceptKeyBeforeSoftKeyboardZmokQxo(keyEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v4, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.Object] */
    @Override // androidx.compose.ui.focus.FocusOwner
    public boolean dispatchRotaryEvent(RotaryScrollEvent rotaryScrollEvent) {
        RotaryInputModifierNode rotaryInputModifierNode;
        int size;
        NodeChain nodes$ui_release;
        ?? Pop;
        NodeChain nodes$ui_release2;
        if (this.focusInvalidationManager.hasPendingInvalidation()) {
            throw new IllegalStateException("Dispatching rotary event while focus system is invalidated.".toString());
        }
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            FocusTargetNode focusTargetNode = focusTargetNodeFindActiveFocusNode;
            int iM5749constructorimpl = NodeKind.m5749constructorimpl(16384);
            if (!focusTargetNode.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node node = focusTargetNode.getNode();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
            loop0: while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    Pop = 0;
                    break;
                }
                int aggregateChildKindSet$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release();
                if ((aggregateChildKindSet$ui_release + iM5749constructorimpl) - (aggregateChildKindSet$ui_release | iM5749constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui_release() & iM5749constructorimpl) != 0) {
                            MutableVector mutableVector = null;
                            Pop = node;
                            while (Pop != 0) {
                                if (Pop instanceof RotaryInputModifierNode) {
                                    break loop0;
                                }
                                if ((Pop.getKindSet$ui_release() & iM5749constructorimpl) != 0 && (Pop instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = ((DelegatingNode) Pop).getDelegate$ui_release();
                                    int i2 = 0;
                                    Pop = Pop;
                                    while (delegate$ui_release != null) {
                                        if ((-1) - (((-1) - delegate$ui_release.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                Pop = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (Pop != 0) {
                                                    if (mutableVector != null) {
                                                        mutableVector.add(Pop);
                                                    }
                                                    Pop = 0;
                                                }
                                                if (mutableVector != null) {
                                                    mutableVector.add(delegate$ui_release);
                                                }
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        Pop = Pop;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                Pop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        node = node.getParent$ui_release();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
                node = (layoutNodeRequireLayoutNode == null || (nodes$ui_release2 = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release2.getTail$ui_release();
            }
            rotaryInputModifierNode = (RotaryInputModifierNode) Pop;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            RotaryInputModifierNode rotaryInputModifierNode2 = rotaryInputModifierNode;
            int iM5749constructorimpl2 = NodeKind.m5749constructorimpl(16384);
            if (!rotaryInputModifierNode2.getNode().isAttached()) {
                throw new IllegalStateException("visitAncestors called on an unattached node".toString());
            }
            Modifier.Node parent$ui_release = rotaryInputModifierNode2.getNode().getParent$ui_release();
            LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(rotaryInputModifierNode2);
            ArrayList arrayList = null;
            while (layoutNodeRequireLayoutNode2 != null) {
                int aggregateChildKindSet$ui_release2 = layoutNodeRequireLayoutNode2.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release();
                if ((aggregateChildKindSet$ui_release2 + iM5749constructorimpl2) - (aggregateChildKindSet$ui_release2 | iM5749constructorimpl2) != 0) {
                    while (parent$ui_release != null) {
                        int kindSet$ui_release = parent$ui_release.getKindSet$ui_release();
                        if ((kindSet$ui_release + iM5749constructorimpl2) - (kindSet$ui_release | iM5749constructorimpl2) != 0) {
                            Modifier.Node nodePop = parent$ui_release;
                            MutableVector mutableVector2 = null;
                            while (nodePop != null) {
                                if (nodePop instanceof RotaryInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodePop);
                                } else if ((nodePop.getKindSet$ui_release() & iM5749constructorimpl2) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                        if ((delegate$ui_release2.getKindSet$ui_release() & iM5749constructorimpl2) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                nodePop = delegate$ui_release2;
                                            } else {
                                                if (mutableVector2 == null) {
                                                    mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    if (mutableVector2 != null) {
                                                        mutableVector2.add(nodePop);
                                                    }
                                                    nodePop = null;
                                                }
                                                if (mutableVector2 != null) {
                                                    mutableVector2.add(delegate$ui_release2);
                                                }
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(mutableVector2);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui_release();
                parent$ui_release = (layoutNodeRequireLayoutNode2 == null || (nodes$ui_release = layoutNodeRequireLayoutNode2.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i4 = size - 1;
                    if (((RotaryInputModifierNode) arrayList.get(size)).onPreRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                    if (i4 < 0) {
                        break;
                    }
                    size = i4;
                }
            }
            ?? node2 = rotaryInputModifierNode2.getNode();
            MutableVector mutableVector3 = null;
            while (node2 != 0) {
                if (node2 instanceof RotaryInputModifierNode) {
                    if (((RotaryInputModifierNode) node2).onPreRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                } else if ((-1) - (((-1) - node2.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl2)) != 0 && (node2 instanceof DelegatingNode)) {
                    Modifier.Node delegate$ui_release3 = ((DelegatingNode) node2).getDelegate$ui_release();
                    int i5 = 0;
                    node2 = node2;
                    while (delegate$ui_release3 != null) {
                        if ((-1) - (((-1) - delegate$ui_release3.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl2)) != 0) {
                            i5++;
                            if (i5 == 1) {
                                node2 = delegate$ui_release3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node2 != 0) {
                                    if (mutableVector3 != null) {
                                        mutableVector3.add(node2);
                                    }
                                    node2 = 0;
                                }
                                if (mutableVector3 != null) {
                                    mutableVector3.add(delegate$ui_release3);
                                }
                            }
                        }
                        delegate$ui_release3 = delegate$ui_release3.getChild$ui_release();
                        node2 = node2;
                    }
                    if (i5 == 1) {
                    }
                }
                node2 = DelegatableNodeKt.pop(mutableVector3);
            }
            ?? node3 = rotaryInputModifierNode2.getNode();
            MutableVector mutableVector4 = null;
            while (node3 != 0) {
                if (!(node3 instanceof RotaryInputModifierNode)) {
                    int kindSet$ui_release2 = node3.getKindSet$ui_release();
                    if ((kindSet$ui_release2 + iM5749constructorimpl2) - (kindSet$ui_release2 | iM5749constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release4 = ((DelegatingNode) node3).getDelegate$ui_release();
                        int i6 = 0;
                        node3 = node3;
                        while (delegate$ui_release4 != null) {
                            int kindSet$ui_release3 = delegate$ui_release4.getKindSet$ui_release();
                            if ((kindSet$ui_release3 + iM5749constructorimpl2) - (kindSet$ui_release3 | iM5749constructorimpl2) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    node3 = delegate$ui_release4;
                                } else {
                                    if (mutableVector4 == null) {
                                        mutableVector4 = new MutableVector(new Modifier.Node[16], 0);
                                    }
                                    if (node3 != 0) {
                                        if (mutableVector4 != null) {
                                            mutableVector4.add(node3);
                                        }
                                        node3 = 0;
                                    }
                                    if (mutableVector4 != null) {
                                        mutableVector4.add(delegate$ui_release4);
                                    }
                                }
                            }
                            delegate$ui_release4 = delegate$ui_release4.getChild$ui_release();
                            node3 = node3;
                        }
                        if (i6 == 1) {
                        }
                    }
                } else if (((RotaryInputModifierNode) node3).onRotaryScrollEvent(rotaryScrollEvent)) {
                    return true;
                }
                node3 = DelegatableNodeKt.pop(mutableVector4);
            }
            if (arrayList != null) {
                int size2 = arrayList.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    if (((RotaryInputModifierNode) arrayList.get(i7)).onRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusTargetNode focusTargetNode) {
        this.focusInvalidationManager.scheduleInvalidation(focusTargetNode);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode) {
        this.focusInvalidationManager.scheduleInvalidation(focusEventModifierNode);
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public void scheduleInvalidation(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        this.focusInvalidationManager.scheduleInvalidation(focusPropertiesModifierNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOwnerFocusState() {
        if (this.rootFocusNode.getFocusState() == FocusStateImpl.Inactive) {
            this.onClearFocusForOwner.invoke();
        }
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public Rect getFocusRect() {
        FocusTargetNode focusTargetNodeFindActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (focusTargetNodeFindActiveFocusNode != null) {
            return FocusTraversalKt.focusRect(focusTargetNodeFindActiveFocusNode);
        }
        return null;
    }

    @Override // androidx.compose.ui.focus.FocusOwner
    public FocusState getRootState() {
        return this.rootFocusNode.getFocusState();
    }

    /* JADX INFO: renamed from: validateKeyEvent-ZmokQxo, reason: not valid java name */
    private final boolean m3874validateKeyEventZmokQxo(KeyEvent keyEvent) {
        long jM5243getKeyZmokQxo = KeyEvent_androidKt.m5243getKeyZmokQxo(keyEvent);
        int iM5244getTypeZmokQxo = KeyEvent_androidKt.m5244getTypeZmokQxo(keyEvent);
        if (KeyEventType.m5236equalsimpl0(iM5244getTypeZmokQxo, KeyEventType.Companion.m5240getKeyDownCS__XNY())) {
            MutableLongSet mutableLongSet = this.keysCurrentlyDown;
            if (mutableLongSet == null) {
                mutableLongSet = new MutableLongSet(3);
                this.keysCurrentlyDown = mutableLongSet;
            }
            mutableLongSet.plusAssign(jM5243getKeyZmokQxo);
        } else if (KeyEventType.m5236equalsimpl0(iM5244getTypeZmokQxo, KeyEventType.Companion.m5241getKeyUpCS__XNY())) {
            MutableLongSet mutableLongSet2 = this.keysCurrentlyDown;
            if (mutableLongSet2 == null || !mutableLongSet2.contains(jM5243getKeyZmokQxo)) {
                return false;
            }
            MutableLongSet mutableLongSet3 = this.keysCurrentlyDown;
            if (mutableLongSet3 != null) {
                mutableLongSet3.remove(jM5243getKeyZmokQxo);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: traverseAncestorsIncludingSelf-QFhIj7k, reason: not valid java name */
    private final /* synthetic */ <T extends DelegatableNode> void m3873traverseAncestorsIncludingSelfQFhIj7k(DelegatableNode delegatableNode, int i2, Function1<? super T, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        int i3;
        int size;
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        ArrayList arrayList = null;
        while (true) {
            if (layoutNodeRequireLayoutNode == null) {
                break;
            }
            if ((layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i2) != 0) {
                while (parent$ui_release != null) {
                    int kindSet$ui_release = parent$ui_release.getKindSet$ui_release();
                    if ((kindSet$ui_release + i2) - (kindSet$ui_release | i2) != 0) {
                        Modifier.Node nodePop = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (nodePop instanceof Object) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(nodePop);
                            } else if ((nodePop.getKindSet$ui_release() & i2) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i4 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    int kindSet$ui_release2 = delegate$ui_release.getKindSet$ui_release();
                                    if ((kindSet$ui_release2 + i2) - (kindSet$ui_release2 | i2) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(nodePop);
                                                }
                                                nodePop = null;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        if (arrayList != null && arrayList.size() - 1 >= 0) {
            while (true) {
                int i5 = size - 1;
                function1.invoke((Object) arrayList.get(size));
                if (i5 < 0) {
                    break;
                } else {
                    size = i5;
                }
            }
        }
        Modifier.Node node = delegatableNode.getNode();
        MutableVector mutableVector2 = null;
        while (node != null) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (node instanceof Object) {
                function1.invoke(node);
            } else if ((-1) - (((-1) - node.getKindSet$ui_release()) | ((-1) - i2)) != 0 && (node instanceof DelegatingNode)) {
                int i6 = 0;
                for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                    if ((delegate$ui_release2.getKindSet$ui_release() & i2) != 0) {
                        i6++;
                        if (i6 == 1) {
                            node = delegate$ui_release2;
                        } else {
                            if (mutableVector2 == null) {
                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                if (mutableVector2 != null) {
                                    mutableVector2.add(node);
                                }
                                node = null;
                            }
                            if (mutableVector2 != null) {
                                mutableVector2.add(delegate$ui_release2);
                            }
                        }
                    }
                }
                if (i6 == 1) {
                }
            }
            node = DelegatableNodeKt.pop(mutableVector2);
        }
        function0.invoke();
        Modifier.Node node2 = delegatableNode.getNode();
        MutableVector mutableVector3 = null;
        while (node2 != null) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (node2 instanceof Object) {
                function12.invoke(node2);
            } else {
                int kindSet$ui_release3 = node2.getKindSet$ui_release();
                if ((kindSet$ui_release3 + i2) - (kindSet$ui_release3 | i2) != 0 && (node2 instanceof DelegatingNode)) {
                    int i7 = 0;
                    for (Modifier.Node delegate$ui_release3 = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release3 != null; delegate$ui_release3 = delegate$ui_release3.getChild$ui_release()) {
                        if ((-1) - (((-1) - delegate$ui_release3.getKindSet$ui_release()) | ((-1) - i2)) != 0) {
                            i7++;
                            if (i7 == 1) {
                                node2 = delegate$ui_release3;
                            } else {
                                if (mutableVector3 == null) {
                                    mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                }
                                if (node2 != null) {
                                    if (mutableVector3 != null) {
                                        mutableVector3.add(node2);
                                    }
                                    node2 = null;
                                }
                                if (mutableVector3 != null) {
                                    mutableVector3.add(delegate$ui_release3);
                                }
                            }
                        }
                    }
                    if (i7 == 1) {
                    }
                }
            }
            node2 = DelegatableNodeKt.pop(mutableVector3);
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            for (i3 = 0; i3 < size2; i3++) {
                function12.invoke((Object) arrayList.get(i3));
            }
        }
    }

    /* JADX INFO: renamed from: nearestAncestorIncludingSelf-64DMado, reason: not valid java name */
    private final /* synthetic */ <T> T m3872nearestAncestorIncludingSelf64DMado(DelegatableNode delegatableNode, int i2) {
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node".toString());
        }
        Modifier.Node node = delegatableNode.getNode();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            int aggregateChildKindSet$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release();
            if ((aggregateChildKindSet$ui_release + i2) - (aggregateChildKindSet$ui_release | i2) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui_release() & i2) != 0) {
                        Object obj = (T) node;
                        MutableVector mutableVector = null;
                        while (obj != null) {
                            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (obj instanceof Object) {
                                return (T) obj;
                            }
                            if ((-1) - (((-1) - ((Modifier.Node) obj).getKindSet$ui_release()) | ((-1) - i2)) != 0 && (obj instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate$ui_release = obj.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & i2) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            obj = (T) delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (obj != null) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(obj);
                                                }
                                                obj = (T) null;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            obj = (T) DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    node = node.getParent$ui_release();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui_release();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return null;
    }

    private final Modifier.Node lastLocalKeyInputNode(DelegatableNode delegatableNode) {
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(1024);
        int iM5749constructorimpl2 = NodeKind.m5749constructorimpl(8192);
        int i2 = (iM5749constructorimpl + iM5749constructorimpl2) - (iM5749constructorimpl & iM5749constructorimpl2);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        Modifier.Node node2 = null;
        if ((node.getAggregateChildKindSet$ui_release() & i2) != 0) {
            for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & i2) != 0) {
                    int iM5749constructorimpl3 = NodeKind.m5749constructorimpl(1024);
                    int kindSet$ui_release = child$ui_release.getKindSet$ui_release();
                    if ((iM5749constructorimpl3 + kindSet$ui_release) - (iM5749constructorimpl3 | kindSet$ui_release) != 0) {
                        return node2;
                    }
                    node2 = child$ui_release;
                }
            }
        }
        return node2;
    }
}
