package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTransactionsKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidGraphicsContext_androidKt;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.input.pointer.ProcessResult;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.NestedVectorStack;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.scrollcapture.ScrollCapture;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.semantics.EmptySemanticsModifier;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.drew.metadata.iptc.IptcDirectory;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ULong;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CoroutineScope;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1626yg;
import yg.EO;
import yg.Ig;
import yg.InterfaceC1492Gx;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Xu;
import yg.ZN;

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
/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes4.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яĥ\u0019D57\u001eq\u007fZDkt\u001aA\u000e0!.J~8,\u001aw\u001dfrˎ8D{H6ɟ[*%k\u00044*[,qY;]ڼ\u0006\"\u001fOVʴon`Z\u0013¼\u0017\u0006,xr,O[\u0001](\u000f:ԏw?IMw=?d|6\u001b :\">z\r\u00010*P\u0010|{KK\"\u00128ϋx:h\rU\u0005 \u0013\u000e>6\u0001&ձoNLHt]P/+\u0003wBV'e3\u0005M#F\\'\u0013~i\u001e9F?5+%[\u0003\rWc?\u0011^y=\u001bh/ݐ3I\nW>X\u0006\u0015\u001d+e\reö.\\\u001bQh\f=+WҪSP$(\u007fz\u0002\rD\u0004$\u0006/H42\"f\u001e\u000e;txVHP\u0010gJȕ\u0003aL\u0017-Į;+O\u001bnQg;!NM{\r\r$$\tn7[\\\u000ef\u001a#T\u000eQ9QFBPN YEm\npj\u0002@\u00048Ϛ\b/\n\u00186\u0017+;c99!s\u0002^Dov\u000bepS\u007fRPؗ*n,72\u009e\u0014ZZd\rkVU`,'M$T\r~\u0010\u00136\\\u007f<'%\u0018NehqjS]\u0012%Ef?Ytl\u0016WO^;5Wd\u0018ahv\u001c?Bb\rX|B[\f`]0\"8Ir\u0010\u000e{LN\u0012\u0014:?\b\u001c<,7\u001ad\u0015^\u0003&BG|\u0011_ph\u0018~Z4,\u0003\u007f$|է\tPrpwΟ\u0001IB|h\"3BY5/&]Ȩp4\u0013#\u000f~y\u0006OgbGTl\u001cv]{6\u0016\"9W1E\u0013%~12\b.ML\teYM('\u0003|\u007f\u000fChDg\u0010jv-hj`O\\\u0017(vfr1\u001blр\u0002a\\zOϊ\\\u000bq>Qr\tZDNN|\r\u001f$&\to8|=-I,%\u0016\u000e\u00147\u0015gcqoDyj\u000f,vm\u0004Bc\u001e˱jQk>C8OZ\u0007>8$t\u0003HJrw\u001eB\u00114#3PAj\u007f^8c\u000b7}l\n4\r\u0007Vc:)o\u00064D_2sI}\u001c^Y%\u0019MYiuma\\\u0013J\u0015\r\u0013{Gn\u001a\u001cC\"^Wx\t8\u0006y$>AQb\rµ\u0011$J,D\b\u0011E\\i\u001c\u0010\u0003ĔN_%\u0017:By\\^\u000ejxdƇP\u0005vEh!0\u0001\u0007\u000fA2\u000157\u0005uFj/k2\u0017S%\t!mW~|%3DZ;#(n\u0001\u0013EcYQ\u0002L\u0004O)smw\fN\u0018\u0005܈J\u001819Y\u0011ew8^!UlNzv\u001afXY*)\u0015z\u0005\u000eB \u0017\u000b/Ozŷj-bN\u007f˿K\u001a\u0017\u0017L)\u001d\f\u0005cL\u001c5\u0006C,EƖr\u0014={_SQ}\u0010 .ٴ\ft'e\u007f\u000eҝ\tcͩPσ\u0010нd2\tAOP\u0004\\J%r8/86}\u0004c\u0002Aa\u0012mյ#͂)k\u007f\u0016FYl\u0011\n\u0012qsrc\u0011\u001bf_]Ӗr-^%Q@[ܰ\u0013pZhE\u0004&fԸ~,\u0016T̘68h7֛O{i\u001f֣N$19ԵkBa_d\u0003#\fρy\u000e\u0004X\u001aX\u001bI܋MVe7ϼlr]\u001c\u07fbj@e#ף)Z|G[lǘ\u0013LF!R\u00157Eف\u001fs\u0010]_5̗D\u0010:iP`̩\u001bO29$X~\u001fܽ:zw\u0016)p\u05fcq0o:\u0082Fl@0&\bޢm+\u0017ngSѐB ,?BA7hߢ V_0\u001biɛ2q\u001e\u001fܙ\u0015P\u0006\u001eL_I3yaИ*\u0019|/Ao\u0002?˫:\f:\t\"]ߩnK\\t֓%Mezl<\nsڧ~efl\u000e\u0010ϖI{Yf\u001fcˏ\u007f\"\u001fRX6}1ǩEIK@^\u000bɾU$\\\u0012ڵ*Nnrhwq\u0007ݬ\nDiF9+o*KO\u001c,\u0019rrZ:zسEep\n\u000eT\u000esƓ7=ґ)y+E\u0017]ƫ@CI!9u\\&J!ź\u0004R2\u0010j@à~Đ.\u0007;ÇT,xxұQw\u0010fFSŶBֶ5Snڨ`e65־v^7\u000bܚLqh\u0019ڪ\u000f<_\\̃\u000bQ\u001aß-Ѓǩ\u0006\u0002P§\u0015!іG<_U̻V\u0014\"KǚZU\f3ڔj_@\u0004ߚW\u0004MÊ\nǋՕ\\9kۙ\u0005cٯK-;#ʮjC.uBn\u001f8Ӽ\u0006&E\u0013\u000eVXAT6ӊ0H0~j\u000bHkԔ\u001c7=\u0004Z,\u0013zrEךd)+e\f\u001fWcǤ-\u0011\u00021\u000f\b\u0019[+,ӈ9J$\"\u05581n\u0001\u0016לIm|\u001c\u000fV\u0003̪I ɋ\u0005ܚĪEOrʝeMВW\be\u001aՌ'<\u0006As\u0013(!٬\u000e:\u001b\u0013aFiW۲Ká\u0015sH٬\u000f\u000b|\u0012̝\fHX\fC,Ìb,LKtV+\\Ä\tºSw\u0002ܕe\u007fnz˃MU.{\u001fdӀq!e__B#\u007fǃXn\"e۽@+\b*\u001f6a*|W\tG]qޡj\fWv\u0010\b܌kvxB\u0004tή>{>j|\u001d\u001ft²}3Rrъ\t'\u0003\u0011R\u001e٭lD'd4\u001b\u001f\u000fωKy\u0018BϰC=70DHʘa:S\f\u0011wP\u0014ÑjyxCٳ\\yJU\u0001:ͨ\u0015\u001d>\u0015^4r\u0013ջ0\u001cl]ɜF!Td>hûm\u0001\bXy<\u0003\u0013ًnkS\u007fϐ\u001f9xG*,\u05faAo9uUY\u0003aM\u0016ɤMpz\u001d\r\r+<«\u00067\u0013p݄53U<\rA\u07b6qg4\f\nY\u0004w˾ %l@̊b\u00117\u0018\u0003p˼]FM&;\nBgϺ\u0001\"#Wͼ\bE-\u0010ٜ4b3PԂ\u0001WI&ʱf\u0007{;\b\u0014و.%z\u001cکmVs\u0015#.4\nZcԖ~]0Ep6¨H\u001e\u00049ē\u000ea\u0016h\u0015|s\u0004٦=l\u0017`ЎnJ1X\u0005nޑB/z\u001eabƆ9,L\u0011\u0379jc.H /\u000ezČPy\u0013S\u0015;Қ\u0004n{7ˡ@=bvf.ţ\b!\"EڌE|\u000brVntzN ޫHpf<O2\nY،\u001a.9sd\u0007_]u\u0012§ci\"\u0016|\u001c.=ޚw.7K\u06004i\u0012\u0002щ^Mg\rt\u001c7VG|̘\b\n3HF\f҇ _a\u0016ςJ~M~ײAM\u0001ϜuƏ݆\u001bC\u001bϦ*Sܒ\u001d\fv'͖\u0005Nli\u0012\u0019Yrӯ\u001e\u0007\\\n\u074b0D\u001ai4Oݪ\u0016&%6ڂt\f:]А\u0001XIAî\u0019\n.І\u0013\u0004ÝK\u05cbĹ\u000eE7ٹS~Ȑ+@plʏ\u0005%%O\u0014;\u001e6\u0088l+pCݑ!\n\u0013?6{׳\u00104ISt]W\u0005Ų\u001aJ\u0011Nۑ\u000fo\u0010!҂^\u0010\u0001Oϳ/vsQTZ̊}Fj\u001e\u001f>rX`\u007fǸ]\u0017wdyX\u00164τ;,c\u000bĉ&\"(\r(\u001cۤ\u001fB$`@\u001f6)\u05cdh\u0016p%ȚaX`|\u007fCԨ@M+QlV\u0007\u000fܳ#u,BƓX\u001cF- t̝P[\u0012\r`no\u000bМ15\u00054۩dx\u001c\u0002Z\bՉkL@P\u0016\u0013\u001a2Ѫ\f%M~Ú\u0019|_\u00053G̫\u001b\f0-\u0003AFx¥\u0004GG?܆\b71zgmπ\u001fD_Wփj*5^ߋAeo]ق\u0016lL\u05ee6̝Ǌi&\"ʒgKҹ%]*-ϻ\f\r\u0003Ki\"bl˶?\u001a\u0007RݶAEJǂBۻՔy :٩t0Πj|UPސPB\u0016@\u001a~-eڠd+bbπ9} \u0010¼J\u001f\u000eTй,Q/ݧ\u0002ωŬU7r˺Hcб]U\u001f?\u07b2j_0z*+\u0003*ʼrXw!M2J\u000e\u0007&ѹEa1`6Rd\u0015\u000f\u000bܦJ*L9vB\u0018@Ĝ\u001f\u0018\u001b\u00056y9VϷ]Nl\f0o׆\u07b7j7sȟ\r\u0016Vd¶\u0007N\u001d\u000e\u001f/y\u0005Ǡf+@Eϖ\u0015C\u0013\u0005tsԈf>#XzFe{h\nԖT\u0003\u000fv\u0003xx|I\"М\f6*\u0003TQ\u000b\u0018wBѴ9dxt\u0003uf\u0013Ą#2bV@t\u00038dHׂ\u0002uIO:KіU\u0011?\u007fŀwo(~ɚ8\\\u001f:`Q֮`v![\u0014;\u0019XۖT+T0Ļ.\u0003AEݪZ Xtǃ\u0007^.S\u0096 \b\u000fHsON\u0001\u0015UюX&ًapUL\u00146ٍE8&@[=DKڦv,7UҒ\n\u001ed-\t\u0001ͼ\u001b-k~=}$\u000eNQͱasqiY\u000fP\u001a\u0091%>07֛).~n{#ߥe$Qg\u0012vE\u0019l\u0018סR\u0006\u0013\u0011{Jղ\u0017hYZf$ԡi99u\u001cy8Cڲ\u000fhP\u001eja]\u0003̌mzXBw3&Qԝy mncGŕX5t\u000fAm͢G1\u0010PaZq\u0006Ӂ(Q&\u0011׀\u007f^s8ߣ\u0017%;;kk͝\u0001\bgs\u001bwJ[ՙ!\u000eR)\b\nYzϝk\u0011Ts\u0002\u0015{PÚCdvNQ<Ut֕ RK(m\u001d-Sʇq=\\\u0011\u0010\u0015cY\"\u0002˳}<~\u000fqn#\u0002ϟ\u00073\u0014pœyP\u0006UrF͉uNE{\u000e\u0012&@پ;\rk/xK\u0018\u0012ɲ0,\\\n.C<>\u0007\u001a֯1<C\u001a-\u007f+/͢$\u0005\reڼ`Ay\u074b`ۍЎ\u000b\t,ŽH\u000fώt\u0011\u000b\u000fža\u0007Ve|W6\u0005ũ\u0007;\u000f\u0003\u0019BȪP]^\u0004ױ\u001e}82BYq\r\u000bZܑ\u0012?*[xLR\u0017ӉJk>G%:ԙ;M[_ڇ\u0005F\u0011\t\u0010`Ћ\u0001d6՜E˳шgxBʧC&\u0016\u0019ӡ7L\u0006=~\u0005x\u0012Ѝ{-M?ќ[\u0002y\u0013ѾDu\u001fUy+\f>Ã}\ter\u00192\u0015t˛r\\\u000e{s^\u0003\u0014\\/Ǩl\u001cu$\f\u0015\u001dPԀ\u00123\u0001oǛ10J6ƚg\u0007\tr\u0002$!L·V\u0005\u000f|\u0007|zfW ˾N|n<X;\u0016`Ϻ;7?x؏H\u0015]-\u001dzə]=L{)a7#ϼ\u0012[\"/\u0005\u00023@\u0005tՑv|z\f[C1\tߝ\u0010\u00136u˚\\\u0016)BӅ\u001e+NPȳ^BG\"Ѱ\u0016\u0016\b\u0018#X\u0019/ߠO`գD27:\u0010PҤDgn\u0007\u001d=2@|pԸF\u001f\u0007Tjx19Ȁ.)\r\u0014gAW\u0011huۍ\u001bC֛Iq$^'{\u07b8\u000eu\u0018uswXr߮8\u0018_\u00167X(pU=β\u001eei\u001eÔvN2=̬\u0017\u0016\u001e%7E,^\u009c\u0015JR-Bj8ɳ'\u0001݇D\u05f8ɥlg\u0002ܬ.^ڐ<Q\u0015\\ڱq\u001d1\u000e)6r.0`ؠBz\u0006-ux7'ŭQV !ؐCqezQQۻ\u001fG0WnOn\u0002:qۑ\u0006\u0011w\u0006SIh9Ȏ?yEr\u0002\tϪķ\u000e\u000b\u0016׆Y\u0001/IҴXpnA#/_W٨i\rH~\u000b 1VAA)1Q\u0004Q\\Թ'\t+ua_u+Ҭ\u000e'\u0019\u0004\u061c7iI+R1û=;yh=S\u001bZݕ}\"5p܄zY\u0001JتOxeqg*\\\u0004Ȳ\u0004N_\u0004(\u0003xbپ\"A3\u0019\u0002PVvɮ']n;RY۳\u0013e\u0007X\u000b\u0019ڂB\u0013e\u0012av\u000f\u0017ɾ9_\u0003{ܝM:\u001fK8Aж|#k\u001doYOoLAϣ\u001d\bWG>$̀ 26L]gʼ\u0003\u0002QAۇ*\\2 ؟O Rwڗ=6D̈YʬƆ\u001c\u001a<đsRƯ[= \fˣG\u0014J\u0014b\u001e\u0002Lƈ\u0005,.z˂:\u0004\u001d̕PБߛ\u00067\u0007ȮR\"γ ^.QЯ\u0006<`\u0018о;}xoŬv\u007fG[ʉ\u00151$Ļ?\u0013דIӷٗ\u0016A,ϟp\u0012\u0557y\"\u001b&ЕL-!2@q|P͚lE-]ںw\u0007?jӦXszC\u0018Q<~ާM.&>ǣ-\u00052\u0018\u0012`ב>W?}k\u0010S\u0013{\u001e۱29o;Fi}\u0015ĬDm\u0007\u001bʌB\u00049Pvxаx\u0007~\u000e_\u0006uMߚ\u0015\u0013KZaretBt$&QR\u0001N\u000bE[B\u0095EXL\u0003z%W:LDͬH\bG&|tzOʔ 3,iܽ\u007f\u0017k=ώ\u0006&,jդ&[/@ܑNZ:\u0004\u001cM/\u001e\u05c9aYk!m\u0004NK.ג\u0017b\u001eđB\u0012UĊ_ҝȟ)kYޟ\u0015:\u009f1V^^ӸtCnLہtC\rLñ:Rno\u0014vY\u000b\u001a3\u06dd'X(:\u000e(R0,\u001b\u074c7}кULG\u0019%iV%܊7\fШrۃa^\u001fԖ\u0007kĊ\u0004Ô\u0011dm͠\u0016K`\u0005ƚJIif\u0007\f\u0014lCNۃ}d1n\u0017\u000ep4ҹz#la~:ĹB|\u000e1@-K\u001aãP\u0017آ!҈^ʙӀ_b\u0003ׁt\u0011ڹU\u000b\u0006\u0005ʴ3bX&n=\u0012\u0012ф?\u0006ߊXȮ*̶ٞ\u00026{Ђe\u007fˠU+(4\u0004}y?\u000b\u0018W\u0017٪\u0016߱\u0013'\u001fƿqz\u001c\u0002!_N\u0017*O!̼dԢL5nԹJ|\u0016{6 +'\u000bÆIģqu;̀5@9ILM\u0006*\bCU\u001b1\u0004\u001a>c[1\u0013 -o\u0007^ϴڧ;δ\f]\u0011S}cQ\u0003\n]Bc\u001eD\"k\u0012D\u001f\rl*\flMA*\u000eyǯ:ѝ\u0006\u001bq՚:g @F1^+w͘\u0010ΨPTJݣ\u000b\u0017)Z2w+x\u001bW!yJEE>~ϲ\u0002ׇi|\b\u0004TjUy>\u001fg^[\u000b:R\u0004\u001c=\fU̍SߒBcxO\u0010\u0007W\rv@\u0015),5R\"QӉNۏ\u000e |ԗ6F\u001c\t\u001bL?_PS\u0007r5CUީkƷMN\u0011ҫY`\u0016h\u001bL[ GӉ\u0016Ę!\u0007)ߏsa\u0005BdQ\u000b~2(4)\u0001\u0019Q֭-ʢ\u0019gtԋ\u0013e_2t_^a${\"\u0019BS\u0005{j{L:nȃ9͐SO/ԏzrM/~9./\u001eb\r\u0014h\u001bR\u0004{e\u0015\u0003\u000eͱ,ŬV7Tʲ9C!0(#'\u0011\u001d\u00113DzoJ=eoy\u0001GL\r\u0005o#\f{=zYʂ{ΒL\u0016\u0016ֺSO-n8u<\u0012\u000f.B\u001fN\u0001>\u0019;\f\\\u0019\tޢ*̜\u0004V\u001f̔l|Q!ujQ\u0002<k|e-([sfgb!s͍ڨo˭@B_%\to\f\u0014 2_q'\u0007}\u0013\u000bnZm\u0003\u001a\u0010\u001f<3|j\f\u0010[)r\u000fbͫẂy\n>Ӫ|\u0005\n/<_@q<¹\nʃQ.,̰n=&M\u0005\"\u0002yH+_\u007fV\u000f\u001b\u0603HĿzD3ۅA$'Uvx.r@0Un`Ii{\u0001-CiC\u000b8ђ&ɫe_hقi\u000b\u0017<mD\u0007Y\u001f؇\u000f՞=7 و\u007foD S2Rf\u0002\u000f\u00196lPX8 \u00039`\u0017\u001f`\u000f\u001e!\u0005Ʈܿ%ߌF!1%X\t|%QL'^&eaPkIv))\u0001Sq\f\u000e\u001dJ\u0019Y(Ǥ]\u05ec/:DۤW)QXJ\u001egs5DE\u0011o5\u0003p\u0017\u0017K-\\Đ~ڬO\n\u001aœ\rz\u0015?!W-{`ޡ:ʝ\u0005\u0016Zҡ\u0015FPek2N\fV\u0590Eԩ#ǵŠz=¡H_6\n\u0001Jh;<!M\u0017QFU߲RگK\u0003=Ͻ}\u0005j\u0015- \"\fY&x}A~|ߍ\u0006̋m){МhQ\u0010\u00108I*WP\b<X\u0007c?\r\\ݣVʍF*;\u0018f!\u001a';z[Apy\u000b.MǹZ\u0382\u0014 \u0001ɛp]$egk\\ڄEcHIÓ\u001eʕbt7KXܩ)\u001bԖONV;\u07b75K6\u0005o*ŏm±e]\rښ+=Rˇ%\u0015\u001eW\u0001d\u00133ݕ\u001dûktXIiՑ\u0004lR\"n'Ɗ52rB!\u0019ݴ\u0018ŢN\\\tؘ\u001f`Sь\r^ryoIɬ\u001eט^hCݴk\u0014Pٰc\u0004gwѴf}șXݳW'kֽ\"FhճJg]6W\u001fŜ ؏=O{ߤ2-X¢Hm$Nй>:ڭ{φ1ɉʵ\u000e/Ӏq*:*I\u000e#8<͟\u001bZ8'яf\u000b֑TƉ-З+Ӌ^2qȰgRcߢis]g1xɱ\u001f7Č1W\u0019(Π\u001f\u0007ߨsy\u0013\u0007˄d]lTC\\bL=\u007fֽ\u0017k˪(˲,4\u0014ȋ$QCݙ*RL\u001eȒFu\u00153kp|9ɧcbL<7Cز֜bƎOc\u0015\u0013t܂w'\u0017||\u0003ʤ4\u007fѕWk\u00062ӐC~ИO\u0006WBҷs%\u001fMĲptǐ5۪Om\u001bʈT\u001a;ٴVqV(Ǥt=Ԝ*Ֆb\u00071ޚ[teǽ]\u0019Mdʘ[Vǚ\u001eܞlrH\u00847i\u0014ҬwH\b[ʰ8\u0013K)ٜgڴ1y\u0007\u0001,לge҅&^|'ތ$l\"#߷zcҺBҬ\tNYŊ}mSυhTߣva\u00069ڑ\u0007,<JڢjG҂,Ȓm\u0010<ą\u000fj\u0004̪\u0001O3Q\u0019MȍM܊d\u0007\u0012ÀBLYւ\u0010FE\u0006\f\u0001݃[UѸ\\Ʌ}ƺڞW\u001a̖\u000fr\u000fܽl\u00142\u0085\u0005\u0003M[*\t/.R\u001e\t(m~'r Wt\tŕ!ҝZ\u0001a܆(QOɩ+@DWΘ`$X\u0019ٸxӼ>\u001f\",VؔW\u0002ٕtRlmԣ\\\u0006\u0014\u0011١Gdˮxݹ\u0003\u0014DÎ%\\'ԿksѶ$;Z\u007fʈ2({Iۦ [ʦ\u007fψ;\u0014*ެ\u00037\\؋f*0\u0003VY5 G\"!M.GܩZƚ\u0012\\\u0018ׂcV\u001eɳ3\u0013~\u001d\u001cr٫\u0007\u0003ŀqȇ\u000b)hѿ\u0019\u0007>ݾ\u000bGX\u0017\u07b2\u0019\u000b̂0Ү\bBS٧'\u001bmޘP\u0001S\u0011|l9\u0003.3\u001e%ă\u0015ēK2\u0015ɵ&: \u00adwk\t%ì\u0017wӃ1Ѧg&\u0012J]\u009bg>eiȱ$Gj`̠,|ڥ\u001aƼ!ywΑ8P2ہ0dѴ>.\fcު\u001al\u0004{ޥ(9֞\rۇ\u0010~z˝e\u0017\u0015ҁA~˄2\u007f;3לR\u000fB\u000fڞ|\u0012ʖ0Ũ/XGč\u0001/\u0016Ե\u001e\b\u000b\b\u05cc`Dá*܁\u0014k\u007fЌr=Rʶ:0,k!*ӷyt܈Aʂ.\u00062ЈV!7ײ30B\r\u0005Kl)˻<ܿ\n\\>:\tӟ~\u001a15Y]Ԛ)\u000f`+Ο<>ƙiǾm/nٞux\u001c۹Pl2Kȃ`\u0019ȁ~ͷb5\u007fǯ-k\u0012Ն8b4x×u$ޘuҍ\u0011,(Ո\b%uٲ.L۵T%T`³R6\u001bVܸg\u0013݁Qđub\u0011۷Q'tɼQz0zӋ\bvɡ:ּ't\u000bж_l`ǍA\u0017ٔ\u000b}f\u000e\u038b8-z6UDȦ?ĳji7֠f0\u001aѦ\u001aC\u000fv(~ײ=d\u0019'%\u0012ЉPxʊp\u001cq{ɠ\u0011!\u0018&Ҹh#ę}ږ\u0017\u001a=ѐ\u0007P:\u009eoLՇ^FM\u0012Թ4=:+¶\u0003qުKޚy\u007fNƸ-\u0015;͵rIǐ\u000f\u001f\u0015)˳6[#2\u000b2ʥ[ʈMyh¾\u0001<\u0018ůBi))ߌ\u0005'̍KȺ6\u0016\u0002Ү;2Iɩ7(ΜUT(c߫=\u001cH\u0005m\u0018lV\u0082-xӆW\u000eޝ\u0003ަ\u0017܁ʷ\r[ɚ-b\u000eYsң'~npٔP),'ǵ{dʵ\u000bٞ\r0SҔB!mݓ\u0010Bɷt%Vkߕ`[\u00020Ţ6nԟ~ǋ%ڎ֏jSډB\u001dY7\u0007Η\u000fo0sԕ#tX?ը\u0017rÜ\tӧ8TIЁ\u001cm\u001bӭI\t\u000e Ʀ\u0004\u0006ü5̾\u00072\rؿ\u007f08Ϛ[T'Pʾ\u0004\u007f\u001c?ђ\nǿo\\\u0003UKՙ%}ޮ:{\"\u001dƲS\u0002\u0007\u001dݲ].ä\u0014ٗ\u0001a\u0012ģ!\u001e+ЅxMӠ$__`ƞj\nQt\fXči\u000f֮\u007fխ\u0011XDԕ\u0005KbϹ\u0013\u0007X ۗ?\u001aȹ{ՔhɼЧ\u0006Zۆ-(GLy\u0092uIf_ه\u0016OF\u000b\u001ce?hl4\u07b2݅\bۀIO\b\u0010v̀i\u001f҅]L*\f̹%\u0002\u001dT`sèp\u0003y\u0002\u0019Rˤ/ϮH;@Шwn5؋7\u0016#2ֹv7\u001fAӎLǦq+\u0013Z\u0005ݠ\u001f'ȬR\u0001R&Җ\u0002B65ϜE&ĭpŲQɽڷzbΎ\u0014@q1xy>\t7ءgeS\u0004ʙ\u0014Nݩuݶ\u0002خϺ{_Ƥ\u007fMlX\u0014ΰ@\u001b\u000f\u001e˱=i;(M:\u001fV\u001c+eTߊ2̢|$/~\u001fۃ\u0018pԸlڳ-\u0004k\u00155ٌ\u00055,\r\u0015r\u0005ѽjɲR"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laK\\", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%B/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2$w =.MHZ4,$>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X <QR?u={\u0011o_I\u000e_;X\u0004|", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E\u001f\u0001\u0018\u0013Wv\u001d#z&5W\u0012\u001e>m\u007f+[CH|4+j", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "1na<h;B\\\u0019\\\u0005g;|\u001c>", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\u000e!'Vs\u0017<T/>h}3FC", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEtB\u00014<]\u0007i5w#8]R?t4,^FkF\u0011s;R\u007f'%VW;\\e\u0002\u0013W\u0003", "-`]1e6BR\n\u0003zp:_\u00058d\u0007(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\u001fQCMy\u0017\u001a\u001egh9\u00149", "-`dAb-BZ ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0011b|-Aq\u0015\n]REl8%\u001c>", "-h]=h;&]\u0018~bZ5x\u000b/r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~W \u007f0Ehe*6m}*V?=kA\u0002\u001dsh\u000f", "\nrTA \u0006\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laKET0N\t\u0016TLN\u0016n[rJ\"g", "-uX2j\u001bKS\u0019h\rg,\n\u0017", "5dc,i0>e\b\fz^\u0016\u000f\u0012/r\u000e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#Y)6z 2L!Es?(#hR=\u0007uj?z'Y;[,\\<\u0005F\u0014\u001fhc", "Adc,i0>e\b\fz^\u0016\u000f\u0012/r\u000e", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\"\u001eC~\u000fF\u0004-~5\u0007\u001fDw\u001a-+MCv>,\u0015Ye9\u0019\"\u001dRv96YN,Fd{=! 0Q?", "-uX2j\u001bKS\u0019h\rg,\n\u0017md\u007f/{B|&\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9uL\u0006!2`}\u000eFi%.#", "-vX;W6P7\"\u007f\u0005", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n']\u0007\u001fA\u007fy7NM\u001fs?%j", "/bR2f:BP\u001d\u0006~m@d\u00058a\u0002(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\nKA;yB\"\u0012lh=\u0016w\u0014J\u007f#IL[\u0002", "5dc\u000eV*>a'\u0003wb3\u0001\u0018CM{1wB\u0001$", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#Y)6z 2L\u001f9i4,#l^=\u000eg;b^#PHP,i(", "/mS?b0=D\u001d~\rl\u000fx\u0012.l\u007f5", "5dc\u000ea+K]\u001d}kb,\u000f\u0017\u0012a\t'\u0003@\u000eU'Ki\u001b<}%1g}", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#Y)6z 2L4?kF,wdj8\u000ec9$", "/tc<Y0EZ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0011i\r*8q\u001d5#", "5dc\u000eh;HT\u001d\u0006\u0002", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0013W~\u0018=z,<#Y0Fw\u00172TJ\u0011", "/tc<Y0EZ\b\fz^", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n|'&Qp\u0012C}n\u0011i\r*8q\u001d5<P;k\n", "5dc\u000eh;HT\u001d\u0006\u0002M9|\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0013W~\u0018=z,<#Y0Fw\u00172TJ*x4\u001ej", "1`]CT:!] }zk", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{x8TB;x\n", "1kX=U6:`\u0018fvg(~\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fTGFh>\u001a\"gI5\u0010_.N\u0004|", "5dc\u0010_0IP#z\b]\u0014x\u0012+g\u007f5", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#Y)6z 2L!Bo?\u001b\u001fdn8n_5Jx'T\"", "1n\\=b:>/\u0017|zl:\u0001\u00063l\u00047\u0010\u001f\u0001\u001e\u0017Ik\u001d<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laKba*N\u00055KIR3`a\u0007\u001c\u0014\u0019Z\u0010J:\rbcI/jS\r", "1n]3\\.N`\u0015\u000e~h5Z\f+n\u0002(e=\u000f\u0017$Xo\u001b", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001381U", "\u001a`]1e6BRb|\u0005g;|\u0012>/\r(\n\n^! Hs\u0010L\u0004!D]\b)\r", "", "5dc\u0010b5?W\u001b\u000f\bZ;\u0001\u00138C\u0003$\u0005B\u0001\u0001\u0014Uo\u001bMv2", "u(;8b;EW\"H\u007fo4F\n?n}7\u007fJ\n%`(\u007f\u0017:\u0006)?bIu", "Adc\u0010b5?W\u001b\u000f\bZ;\u0001\u00138C\u0003$\u0005B\u0001\u0001\u0014Uo\u001bMv2", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>%Sc(", "1n]AX5M1\u0015\n\nn9|p+n{*{M", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n~! Vo\u0017Kt!@h\u000e-77q7LPEo3{\u001fqp9\u0010r\nJ\u00026WYN\u0014X[n?\u0014\u001f0", "5dc\u0010b5MS\"\u000eXZ7\f\u0019<eg$\u0005<\u0003\u0017$\u0006\u007f\u00126\u0004%<Yy.7", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0015Qx\u001d<\u007f43U\t/Gz\u0016w)L:x>\"\u0014FkB\u0016c5]T#R[^9\\:nF\u0010\u0014Z\u001b$", "Adc\u0010b5MS\"\u000eXZ7\f\u0019<eg$\u0005<\u0003\u0017$\u0006\u007f\u00126\u0004%<Yy.7", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0015!P~\u000eE\u0006#1d\r0Dm_\nVBHu8\u001drrjH\u0007l;,r2V\\[,DN{9\u0016\u0012gc\u0012\u001c", "D`[BX", "5dc\u0010b9Hc(\u0003\u0004^\n\u0007\u0012>e\u00137", "u(;8b;EW\"Hxh9\u0007\u0019>i\t(\n\n^!$Q\u007f\u001d@\u007f%\u0013c\u0007/7\u0001%\u0004", "Adc\u0010b9Hc(\u0003\u0004^\n\u0007\u0012>e\u00137", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u0003?b\r J|kq>", "1ta?X5M4#\b\nP,\u0001\u000b2t['\u0001P\u000f&\u001fGx\u001d", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9l<\u007f39h\u0012u", "2d]@\\;R", "5dc\u0011X5LW(\u0013", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006U%>g\u0002/KC", "Adc\u0011X5LW(\u0013", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W\u001bv.C]\r4\r1\u0007", "2d]@\\;R\u0012\u0018~\u0002^.x\u0018/", "2haAl\u0013:g\u0019\f\t", "", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%4@y47zk", "2qP445=2&\t\u0006F(\u0006\u00051e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Ik\u0017;u2?dG~Di\u0018\nVB\u001ax>)|dj5\tc9$", "5dc\u0011e(@/\"}Yk6\bp+n{*{M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0016Tk\u00108\u007f$4f\b+\u0001L#*O\u001fDj\u0013+\u001fsI5\u0010_.N\u0004|", "2qP445=2&\t\u0006F6{\r0i\u007f5eI_$\u0013IV\u0012J\u0006%>Y\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0014fy\"\u0013v\u0015\rZMFS>\u001d\u0019ie9\u0014M5-\u0004#I3R:kR{=!g", "3mS\u000ec7Egv\u0002vg.|\u0017\u0016i\u000e7{I\u0001$%", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9\fF},5W\r$Av_\u0016]R7h;\u001e\u0006h_H\u0011p\u0002", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "4nRBf\u0016P\\\u0019\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egg2@m#\u0004", "5dc\u0013b*Na\u0003\u0011\u0004^9", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0018Qm\u001eJ@\u0006?W\u000e.!\u007f\u001f.Z\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)FN\u00126QJO*!\u001e#rhJ\u0007p\u0002", "4n]A9(FW \u0013g^:\u0007\u0010@e\r", "5dc\u0013b5M4\u0015\u0007~e@i\t=o\u00079{M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%\u000fIK?rH\\\u0002hoC\u000et,[L", "Adc\u0013b5M4\u0015\u0007~e@i\t=o\u00079{M", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ&\u0017Z~W=\u0001.D#^*@|v*UGB\u007fr\u000b\u0015vk@\u0018c9$:\u0018", "4n]A9(FW \u0013g^:\u0007\u0010@e\rfz@\b\u0017\u0019C~\u000e", "4n]A?6:R\u0019\f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u000fF\u007f4~:\b)F,\u0003.[MKx2\u001e{r]8\u0007p\u0002", "5dc\u0013b5M:#zy^9;\u00058n\n7wO\u0005! U", "u(E", "5dc\u0013b5M:#zy^9", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006w/>hG\u0001Av%l:CIuD+\u0013hHC\u0003b,[L", "4na0X\u001cLS\u0001z\nk0\u0010f+c\u0003(", "", "5k^/T3%O-\t\u000bm\u0013\u0001\u0017>e\t(\t", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0017\t@\u0001\u0001\u0014Uo\u001bMv2sC\u0007\u0002>w\u0013*T*7\u007f>.$OeG\u0016c5N\u0004|", "5k^/T3)]'\u0003\nb6\u0006", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9qE\u0006\u000f6Z\f FC", "\u0018", "5qP=[0<av\t\u0004m,\u0010\u0018", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0017fy+:q\u0014<+MDz41$>", "5dc\u0014e(IV\u001d|\t<6\u0006\u0018/x\u000f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u0019Tk\u0019?z#C#_-3x\u00192KQ\u0019u=-\u0015{p\u000f", "6`_A\\*\u001fS\u0019}WZ*\u0003", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0004\u0013\"Vs\f=v%4Vy\u001e=7x*XR?i\u0015\u001e\u0015g^5\u0005i\u0002", "5dc\u0015T7MW\u0017_z^+Y\u0005-k", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001aCz\u001d@t&5Y|\u001d3k\u001cw0?Fz8\u001cuha8\u0004_*TL", "6`b\u001dX5=W\"\u0001b^(\u000b\u0019<ei5b<\u0015!'V", "5dc\u0015T:)S\"}~g.d\t+s\u00105{*\u000e}\u0013[y\u001eK", "u(I", "6ne2e\fQW(kz\\,\u0001\u001a/d", "7m_Bg\u0014HR\u0019fvg(~\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~W \u007f0Ehe*6m}*V?=kAs", "5dc\u0016a7Nb\u0001\ty^\u0014x\u0012+g\u007f5", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@\t>d\u000e/\u001fw\u0015.5?Dg6\u001e\">", "7r3?T>B\\\u001b\\\u0005g;|\u0012>", "7r;6Y,<g\u0017\u0006zB5i\t=u\b(z.\u0010\u0013&G", "7r?2a+B\\\u001bb\u0004m,\n\u0013:V\u0004(\u000e'|+!W~k?r.7Y\\$Ex\u0012=KF", "7rA2a+>`\u0002\ty^\n\u0007\u0011:a\u000f,xG\u0001", "9dh\u0016a7Nb\u0001\tyb-\u0001\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nh!\u0016Kp\u0012<\u0004z", "9dh/b(KR\u0001\tyb-\u0001\t<sl(\bP\u0005$\u00177z\r8\u0006%", ":`bA76P\\\u0004\t~g;|\u0016\u001ao\u000e,\u000bD\u000b ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\u001fZ~.7|k", ":`bA@(M`\u001d\u0012g^*x\u0010-u\u0007$\u000bD\u000b rPs\u00168\u0006)?bl$?m", "", "5dc\u0019T:M;\u0015\u000e\bb?i\t-a\u0007&\fG|&\u001bQxiEz-1h\u0002*@\\\u001a6M\u0002Ko.+\u0015oa5\u0015cjJ\u007f0Q[J;`\\{K", "5dc\u0019T:M;\u0015\u000e\bb?i\t-a\u0007&\fG|&\u001bQxiEz-1h\u0002*@\\\u001a6M\u0002Ko.+\u0015oa5\u0015c", "u(9", "Adc\u0019T:M;\u0015\u000e\bb?i\t-a\u0007&\fG|&\u001bQxiEz-1h\u0002*@\\\u001a6M\u0002Ko.+\u0015oa5\u0015c", "uI\u0018#", ":`h2e\n:Q\u001c~", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n'Yy&\u0015i\u00141M\u0019", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9t8\u000b/Eh\\$Dm\u0014=QMDA", ":`h<h;\u001dW&~xm0\u0007\u0012", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`'Ps\u001d\u0006]!Ic\u000e/\u0016q#.KR?u=s", "Adc\u0019T@Hc(]~k,z\u00183o\t", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ' K~W#r9?i\r~;z\u0016,\\GEt\na\u0006", ":`h<h;\u001dW&~xm0\u0007\u0012md\u007f/{B|&\u0017", ":dV.V@-S,\u000e^g7\r\u0018\u001de\r9\u007f>\u0001r F|\u0018@u", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|y7XSJY4+&l_9bl+[\u0001+F\"", ";`c?\\?-]\u000b\u0003\u0004]6\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0013U\u0005\u001eGt\u0012=M+7zA\"(Wk+\u000bl+X\t|", ";dP@h9>/\"}aZ@\u0007\u0019>D\u007f/{B|&\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9u<r3Ef}{@l|*aMKz\u0013\u001e\u001chc5\u0016c\u0002", ";dP@h9>7(~\bZ;\u0001\u00138", "5dc\u001aX(Lc&~^m,\n\u0005>i\n1", ";nS6Y0>`\u007f\txZ3d\u00058a\u0002(\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\t!\u0016Kp\u0012<\u0004n\u001dc|$8q\u0016;4M9g;\u0006\u0011q];\u0007p\u0002", "5dc\u001ab+BT\u001d~\bE6z\u00056M{1wB\u0001$", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001fQn\u0012=z%B#e*6q\u00172MP\"u2\u001a\u001cP]B\u0003e,[L", ";nc6b5\u001ed\u0019\b\n:+x\u0014>e\r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001U =QMDKE\u001e\u001ew=8\u0003n;N\u0004|", "=ab2e=:b\u001d\t\u0004<3|\u0005<R\u007f4\f@\u000f&\u0017F", "=m<2T:N`\u0019\\\u0005g:\f\u0016+i\t7\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0011 \u001bV9kF\u007f3Dfy$@|$\u0004", "=mE6X>-`\u0019~dp5|\u0016=A\u0011$\u007fG|\u0014\u001eG", ">kP0X4>\\(lxh7|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\b\u0013+Q\u007f\u001d\u0006a,1W}\u001c4t\u0016l8J7i4&\u0015qp'\u0005m7NL", "5dc\u001d_(<S!~\u0004m\u001az\u0013:e", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001eC\u0004\u0018L\u0006n `y\u001e7i\u00135M\u0002&r0\u001c\u0015paB\u0016Q*X\u0002'\u001d", ">nX;g,K7\u0017\t\u0004L,\n\u001a3c\u007f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018\u001c\u001fqO9\u0014t0Lv|", "5dc\u001db0Gb\u0019\f^\\6\u0006v/r\u0011,y@", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\u001bPz\u001eK@0?]\u0007/7z_\u0019WGDz4+xfkBtc9_z%G\"", ">nX;g,K7\"\n\u000bm\f\u000e\t8tj5\u0006>\u0001%%Q|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X 2VR;x\u0018' xp\u0019\u0018c5]a4QJN:j\\\u007f\u0013", ">nbAc6GS\u0018]~k;\u0011o+y\u007f5\n", ">qTC\\6Na\u0001\t\nb6\u0006h@e\t7", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "@d[.l6Nb\b\u0003\u0003^", "@db2a+&](\u0003\u0005g\f\u000e\t8ti1b<\u0015!'V", "@db2a+&](\u0003\u0005g\f\u000e\t8tl8\u0005I|\u0014\u001eG", "/mS?b0=fb|\u0005f7\u0007\u0017//\u0010,EK\b\u0013&Hy\u001bD@\u0001>X\u000b*;ls8UNEy4\u000f\u0019hsw\u0014c:N\u007f&/V]0f[RN\u0014\u001biz^4\u0016\u0001VH$-\u0010", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laKEp,\\v0F4X;`\\{\u001d%\u0012c\u001d;;\u0016\u000eU>+n\u0003\u0003t", "@n^A", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mk", "5dc\u001fb6M", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.#", "@n^A96KB\u0019\r\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9zF\u00014\u0016c\u000b\u000f7{%\u0004", "5dc\u001fb6M4#\fi^:\f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006c/?h^*D\\\u0016<\\\u0019", "@n^AF,FO\"\u000e~\\:e\u0013.e", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~9\u0006+F\u0002\u0004.U?Dz8\u001c#Pk8\u000bd0N\u0004|", "@nc.e@\"\\$\u000f\nF6{\r0i\u007f5", "Aba<_3\u001cO$\u000e\u000bk,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0015$Qv\u0015:r0Di\u000b \u0001[\u0014;WJBI0)$xn9\\", "Aba<_3\u001cO$\u000e\u000bk,`\u0012\u001ar\n*\t@\u000f%", "5dc V9HZ \\vi;\r\u0016/I\t\u0013\tJ\u0003$\u0017U}LLz\u001fBY\u0005 3{\u0016", "Aba<_3\u001cV\u0015\b|^+c\r=t\u007f1{M", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0017\t@\u0001\u0001\u0014Uo\u001bMv2sC\u0007\u000e5z 5T!>g= \u0015gH=\u0015r,Wv4\u001d", "Ad\\.a;BQ'f\u0005]0}\r/r", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~9\u0006+F\u0002\u0004.U?Dz8\u001c#Hh9\u000fc5]L", "Ad\\.a;BQ'h\rg,\n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u000f\u0017\u001fCx\u001d@t3~G}(3v%2KQ%}=\u001e\">", "5dc X4:\\(\u0003xl\u0016\u000f\u0012/r", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`%Gw\nE\u0006)3gG\u000e7u\u00127\\G9y\u001e0\u001ehn\u000f", "Ad]1;6OS&^\u000eb;\\\u001a/n\u000f", "\u001aiPCTuEO\"\u0001DK<\u0006\u0012+b\u0007(Q", "AgP?X+\u001d`\u0015\u0011h\\6\b\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9t8\u000b/Ehf*6mt;IU)i>)\u0015>", "5dc [(KS\u0018]\bZ>j\u00079p\u007f", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006]!Ic\u000e/ w\u0015.,P7}\"\u001c\u001fsa\u000f", "Ag^D?(R])\u000eWh<\u0006\b=", "5dc [6P:\u0015\u0013\u0005n;Y\u0013?n~6:<\n !Vk\u001d@\u0001.C", "5dc [6P:\u0015\u0013\u0005n;Y\u0013?n~6", "Adc [6P:\u0015\u0013\u0005n;Y\u0013?n~6", "uY\u0018#", "AmP=f/Hb\u0003{\t^9\u000e\t<", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%BG\u0007\u001cB{\u00198\\-8y4+&hn\u000f", "5dc a(Ia\u001c\t\nH)\u000b\t<v\u007f5", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005` Qn\u000e\u0006`7>Y\u000b\u000e@i!<PMJU1,\u0015ur9\u00149", "AnUAj(KS~~\u000f[6x\u0016.C\n1\u000bM\u000b\u001e\u001eG|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n#c~/Ii#.3COh>\u001a\"g?C\u0010r9X}.GY$", "5dc b-Me\u0015\fzD,\u0011\u00069a\r'YJ\n&$Qv\u0015<\u0004", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#k*8|(*ZC!kH\u001b\u001fdn8dm5]\u00041NSN92", "At_2e*EO'\r^g0\ff9m\u000b/{O\u0001", "BdgA<5Ic(lzk=\u0001\u0007/", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0010\u0017*V9\u0012E\u00025D#l J|y7XSJY4+&l_9\\", "5dc!X?M7\"\n\u000bm\u001a|\u0016@i}(", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`&G\u0003\u001d\u0006z.@i\ri&m)=1LF{C\f\u0015ur=\u0005c\u0002", "BdgA<5Ic(lzl:\u0001\u00138M\u00107{S", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\nn\u0017%Us\u0018E^5DY\u0011u", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\u0019T?Jl>+\u001dWaL\u0016G5Y\u000765L\\:`\\{\u0013", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJ\u0013&Qw\u0012:@\u0001Dc\u0006$5Z\u0016/MP;t2\u001ej", "BdgAG6HZ\u0016z\b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n$Y\u0011/&w 5J?HA", "5dc!X?MB#\t\u0002[(\n", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#l J|\u00058WJ8gAs", "Bl_\u001aT;KW,", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u001dU\r-;\u0001k", ")E", "Bl_\u001db:Bb\u001d\t\u0004:9\n\u0005C", "", "Bnd0[\u0014HR\u0019\\}Z5~\t\u0016i\u000e7{I\u0001$", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0017\t@\u0001\u0001\u0014Uo\u001bMv2sC\u0007\u000fA}\u001415M:k\u0012!\u0011qc9mg:]v0GY$", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5dc#\\,P", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "DhTD66GT\u001d\u0001\u000bk(\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n&]}2\u0015w\u001f/QEKx0-\u0019rj\u000f", "5dc#\\,P1#\b{b.\r\u0016+t\u00042\u0005", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#n$7\u007fs8VD?mD+\u0011weC\u00109", "DhTD?(RS&\rXh5\f\u00053n\u007f5", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0014fy2\u0015p\u001a5L!EtC\u001a\u0019qaF\\", "DhTDG60W\"}\u0005p\u0014x\u0018<i\u0013", "DhTDG9>S\u0003\u0011\u0004^9\u000b", "5dc#\\,PB&~zH>\u0006\t<s", "DhTDG9>S\u0003\u0011\u0004^9\u000bG.e\u0007(}<\u0010\u0017", "\u001a`]1e6BR,Hxh4\b\u0013=eI5\fI\u0010\u001b\u001fG9{Kr45/", "E`b\u001aX(Lc&~yP0\f\f\u0017u\u00077\u007fK\b\u0017tQx\u001cK\u0004!9b\r.", "Eh]1b>\"\\\u001a\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n']\u0007\u001fA\u007fy7NM\u0011", "5dc$\\5=]+b\u0004_6", "u(;.a+K]\u001d}\u000e(*\u0007\u0011:o\u000e(EP\u0005`\"Nk\u001d=\u00012=#o$@l @1L<u\n", "Eh]1b>)]'\u0003\nb6\u0006", "Eh]1b>-]\n\u0003zp\u0014x\u0018<i\u0013", "4n]AJ,BU\u001c\u000eV]1\r\u0017>m\u007f1\u000b\u001e\u000b\u001f\"C~", "5dc\u0013b5ME\u0019\u0003|a;X\b4u\u000e7\u0004@\n&tQw\u00198\u0006", "uKP;W9HW\u0018Hxh5\f\t8tI5{NJt!Pp\u0012>\u000721h\u0002*@CY\u0012", "/cS\u000ea+K]\u001d}kb,\u000f", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0012\u001b\u0017Ys\u0017Kv2?dG{@l#8QB,o40wrh8\u0007p\u0002", ":`h<h;']\u0018~", "/cS\u0012k;KOwz\nZ\u001b\u0007d-c\u007f6\nD}\u001b\u001eK~\"%\u0001$5=\u0007!AP\u00165XCH", "DhaAh(ED\u001d~\rB+", "7mU<", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROT>\u001d\u0015Lj:\u00119", "3wc?T\u000b:b\u0015dzr", "", "/cS#\\,P", "1gX9W", ">`a.`:", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"U.k\"F\u00074 U\u000b\u001c?{k", "7mS2k", "EhSA[", "6dX4[;", "D`[BX:", "\u001a`]1e6BRb\u000f\nb3Fv:a\r6{\u001c\u000e$\u0013[E", "\u001a`]1e6BRb\u0010~^>F\u0005?t\n)\u007fG\b`rW~\u0018=z,<Jy'Gmk", "/tc<Y0EZ\u0007\u000f\u0006i6\n\u0018/d", "0nd;W:.^\u0018z\n^:X\u0007-e\u000e6\u007f=\u0005\u001e\u001bV\u0004mMv.D@\b*B", "uKZ<g3B\\b|\u0005k6\r\u00183n\u007f6E\u001e\u000b &Kx\u001e8\u0006)?bSc\u001er\u0012?I\rBg= ^R^>\u0007a;$", "0nd;W:.^\u0018z\n^:Z\u00138t\u007f1\u000b\u001e|\"&W|\u000e\u001c\b%>hd*Ax", "1`[0h3:b\u0019e\u0005\\(\u0004s9s\u00047\u007fJ\n", ">nb6g0H\\|\blb5{\u0013A", "1`[0h3:b\u0019e\u0005\\(\u0004s9s\u00047\u007fJ\n^~-7pQJ\u0015", "uI\u0018\u0017", "1`[0h3:b\u0019i\u0005l0\f\r9nc1mD\n\u0016!Y", ":nR._\u0017Ha\u001d\u000e~h5", "1`[0h3:b\u0019i\u0005l0\f\r9nc1mD\n\u0016!Y7u\">\bJ-m", "1`] V9HZ a\u0005k0\u0012\u00138t{/\u0003T", "2ha2V;B]\"", "1`] V9HZ ozk;\u0001\u0007+l\u0007<", "1kT.e\nAW }^g=x\u00103di%\n@\u000e(\u0013Vs\u0018E\u0005", "DhTD:9Hc$", "1n]CX9M;\u0019z\tn9|v:e}", "\u001aj^A_0G\u001d\te\u0005g.R", ";dP@h9>A$~x", "1n]CX9M;\u0019z\tn9|v:e}o_\u0012m\u0001\u00112S", "uH\u0018\u0017", "1qT.g,%O-~\b", "2qPD53HQ\u001f", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001382U", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n\u0013U\u000713{k", "\u001aj^A_0G\u001d\u0004z\bZ4|\u0018/rh$\u0004@V", "<`\\2", "1`]CT:", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n<U\u0012 D7w;IN>o2,{du9\u00149", ">`a2a;%O-~\b", "7me._0=O(~eZ9|\u0012>L{<{M", "3w_9\\*Bb\u007fz\u000f^9", "2hb=T;<Vw\fvp", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0006wI\u0012\u0013%\u001d", "2hb=T;<Vz~\u0004^9\u0001\u0007\u0017o\u000f,\u0006I`(\u0017P~", ";nc6b5\u001ed\u0019\b\n", "2hb=T;<V{\t\f^9\\\u001a/n\u000f", "3uT;g", "2hb=T;<V~~\u000f>=|\u0012>", "\u001a`]1e6BRb\u0010~^>Fn/y_9{I\u0010l", "2hb=T;<V~~\u000f>=|\u0012>P\r(_H\u0001", "2hb=T;<V\u0004~\u0004]0\u0006\u000b\u0013n\u000f(\tJ\f}\u0013[y\u001eKT!<`z\u001c5s$", "2hb=T;<V\u0004\f\u0005o0{\t\u001dt\r8yO\u0011$\u0017", "AsaBV;N`\u0019", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0016\u000bM\u0011\u0015&W|\u000e\u0012", "2hb=T;<V\b\t\u000b\\/\\\u001a/n\u000f", "2qPD45=`#\u0003yO0|\u001b", "4h]1A,Qb\u0002\t\u0004</\u0001\u0010.V\u0004(\u000e", "4h]1I0>eu\u0013V\\*|\u0017=i|,\u0003D\u0010+zF\\\u0018F\u0006%45\r}Gz#.VR,o40", "/bR2f:BP\u001d\u0006~m@`\b", "1ta?X5MD\u001d~\r", "4h]1I0>eu\u0013V\\*|\u0017=i|,\u0003D\u0010+zF^\u001b8\b%Bgy'", "4nRBf\u001a>O&|}", "4nRBf,=", "4na0X\b<Q\u0019\r\tb)\u0001\u00103t\u0014\t\u0006Mo\u0017%Vs\u0017>", "3mP/_,", "4na0X\u0014>O'\u000f\b^\u001b\u007f\t\u001du|7\t@\u0001", "/eU2V;L:#\t\u0001Z/|\u0005.", "5dc\u0013b*Naw\u0003\b^*\f\r9n", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Eg\\$Dm\u0014=QMDA", "9dh\u0012i,Gb", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WBv9~?}4\u0017~\u00167\\\u0019", "5dc\u0013b*Naw\u0003\b^*\f\r9nG\u0013N\u001c\u0016yd+", "uKP;W9HW\u0018H\fb,\u000fR\u0015e\u0014\b\r@\n&l\u000bV\nEu2?]|3\u0001k 6XMIk}.\u00192bC\u0005s:\u0018W1E\\\\\u000b`_r;#\u0016d\u0017$", "5dc\u0013b*Na\u0019}g^*\f", "@dRA", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0015{>\u0010l", "6`]1_,&](\u0003\u0005g\f\u000e\t8t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0005 \"W~WG\u0001)>h}-\u0001X#8KCIy!\u001e#xhH\\", "6`]1_,&](\u0003\u0005g\f\u000e\t8tGz\u007f\u001c\u000f\b\u0006E", "uKP;W9HW\u0018H\fb,\u000fR\u0017o\u000f,\u0006I`(\u0017P~c\u007fZ", "6`]1_,+](z\br\f\u000e\t8t", "6`b\u0010[(GU\u0019}Y^=\u0001\u0007/s", ":`bA8=>\\(", "7me._0=O(~Y^:z\t8d{1\u000bN", "7me._0=O(~aZ@|\u0016=", "<nS2", "7me._0=O(~aZ@\u0007\u0019>N\n'{(\u0001\u0013%W|\u000eDv.D", "7r1.W\u0014Hb\u001d\t\u0004>=|\u0012>", "7r32i0<S\u0004\fzl:\\\u001a/n\u000f", "7r8;56N\\\u0018\r", "7r?<f0MW#\bXa(\u0006\u000b/d", ":nR._\u001bHA\u0017\fz^5", ":nR._\u001bHA\u0017\fz^5Dp\u0015-b=O0", ":nR._\u001bKO\"\r{h9\u0005", ":nR._\u001bHA\u0017\fz^5DX\u0002be%m>", "uZ5uI", ";dP@h9>/\"}aZ@\u0007\u0019>", "1n]@g9:W\"\u000e\t", ";dP@h9>/\"}aZ@\u0007\u0019>-J.bL]#)", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ !FoW#r9?i\r\tAl\u0016\u00042\u0007,", "Ad]1C6B\\(~\bN7{\u0005>e", ";dP@h9>/\"}aZ@\u0007\u0019>F\n5j@\u000f&", "<nc6Y@%O-~\bB:[\r<t\u0014", ":`h2e", "7r36e;R", "<nc6Y@%O-~\bB:[\r<t\u0014f\fDz$\u0017No\nJv", "=m0Ag(<V", "=m0Ag(<V\u0019}ih\u001e\u0001\u0012.o\u0012", "=m25X*D7'mzq;\\\b3t\n5", "=m29X(K4#|\u000bl\r\u0007\u0016\u0019w\t(\t", "=m2<a-BU)\fvm0\u0007\u0012\rh{1}@\u007f", "<df\u0010b5?W\u001b", "=m2?X(MS|\b\u0006n;Z\u00138n\u007f&\u000bD\u000b ", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9qE\u00025D7\b)@m\u0014=QMDA", "=tc\u000eg;Ka", "\u001a`]1e6BRb\u0010~^>F\r8p\u00107\u0004@\u0010\u001a!F9m;z4?fa)8wk", "=m2?X(MS\n\u0003\bm<x\u0010 i\u007f:jM| %Nk\u001d@\u0001.\"Y\n07{%<", "DhaAh(E7\u0018\r", "", "At_=b9MS\u0018_\u0005k4x\u0018=", "@d`BX:Mav\t\u0002e,z\u00189r", "\u001aiPCTuNb\u001d\u0006D_<\u0006\u0007>i\n1E\u001e\u000b %Ww\u000eIL", "\u001a`]1e6BRb\u0010~^>F\u0018<a\t6\u0003<\u0010\u001b!P9~@v7$fy)Et\u0012=QMDX4*%hoH\\", "=m32g(<V", "=m32g(<V\u0019}[k6\u0005z3n~2\u000e", "=m3?T>", "=m4;W\bI^ \u0013Xa(\u0006\u000b/s", "=m52g*A4#|\u000bl\u0019|\u0007>", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn\"Y{/\r", "=m5<V<L1\u001cz\u0004`,{", "5`X;96<c'", ">qTC\\6Na \u0013[h*\r\u0017/dl(yO", "=m8;g,K]$o~^>c\u0005Co\u00107YC| \u0019G", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0012\u001b\u0017Ys\u0017Kv2?dG\u0004@|\u0016;WN,o40j", "=m;.l6Nb", "1gP;Z,=", Global.COLON, "B", "@", AdkSettings.PLATFORM_TYPE_MOBILE, "=m;.l6Nbv\u0002vg.|", "=m<2T:N`\u0019", "EhSA[\u0014>O'\u000f\b^\u001a\b\t-", "6dX4[;&S\u0015\r\u000bk,j\u0014/c", "=m<<i,\u001f]\u0017\u000f\tB5Z\f3l~5{I", "4nRBf\u000bB`\u0019|\nb6\u0006", "=m<<i,\u001f]\u0017\u000f\tB5Z\f3l~5{IHdv5P\u0014&I", "uH\u0018'", "=m??b=BR\u0019Z\u000bm6}\r6lp,\tO\u0011\u0013\u001e5~\u001bLt4Ef}", "4kP4f", "=mA2d<>a(_\u0005\\<\u000bi9ri:\u0005@\u000e", "=mA2d<>a(_\u0005\\<\u000bi9ri:\u0005@\u000e^hQ@ZG\u007f/", "=mA2d<>a(fzZ:\r\u0016/", "4na0X\u0019>_)~\tm", "AbW2W<ES\u0001~vl<\n\t\u000bn~\u000fwT\u000b'&", "=mA2d<>a(kze(\u0011\u0013?t", "=mA2f<FS", "=v]2e", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "=mAA_\u0017K]$~\bm0|\u0017\rh{1}@\u007f", "=mB0e6EZvz\u0006m<\n\t\u001de{5yC", ":nR._\u001dBa\u001d{\u0002^\u0019|\u0007>", "Eh]1b>(T\u001a\rzm", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&l", "B`a4X;L", "\u001a`]1e6BRb\u0010~^>Fv-r\n/\u0003\u001e|\"&W|\u000e+r27Y\ru", "=mB2`(Gb\u001d|\t</x\u00121e", "=mE6e;NO o~^>k\u0016+n\u000e/wO\u0005! 4o\u001cG\u0001.CY\f", "@db=b5LS", "\u001a`]1e6BRb\u000f\nb3Fo9n\u0002\u0016\u0007<\u000e%\u0017#|\u001b8\u000bz", "\u001a`]1e6BRb\u0010~^>F\u0018<a\t6\u0003<\u0010\u001b!P9~@v7$fy)Et\u0012=QMDX4, rjG\u00079", "=mF6a+Hey\txn:Z\f+n\u0002(z", "6`b$\\5=]+_\u0005\\<\u000b", ">`R8", RemoteSettings.FORWARD_SLASH_STRING, ">`R8 !\"O~\r\r\\", "uH8u=", "@dR._*NZ\u0015\u000ezP0\u0006\b9wj2\nD\u0010\u001b!P", "@dR._*NZ\u0015\u000ezP0\u0006\b9wp,{Ro$\u0013P}\u000fF\u0004-C", "@dRFV3>", "@dRFV3>\u0012)\u0003tk,\u0004\t+s\u007f", "@dV6f;>`\u0003\bZg+X\u0014:l\u0014\u0006~<\n\u0019\u0017UV\u0012J\u0006%>Y\u000b", ":hbAX5>`", "@dV6f;>`\u0003\baZ@\u0007\u0019>C\n0\u0007G\u0001&\u0017FV\u0012J\u0006%>Y\u000b", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\n!\u0016G9wN\u007f%B\u0018g)\u001ei*8]R\u0019u<)\u001chp9\u0006J0\\\u0006'PL[\u0002", "@d\\<i,\u001a\\\u0018\f\u0005b+m\r/w", "@d`BX:M1 ~vk\u0010\u0006\u001a+l\u0004'e=\u000f\u0017$Xk\u001d@\u0001.C", "@d`BX:M4#|\u000bl", "@d`BX:M=\"i\u0005l0\f\r9n\u007f'Y<\b\u001e\u0014Cm\u0014", "<nS2G6+S!~vl<\n\t", "Aba2X5-]\u007f\txZ3", ">nb6g0H\\\u0003\bh\\9|\t8", "Aba2X5-]\u007f\txZ3Dp\u0015-b=O0", "Ad]1>,R3*~\u0004m", "Ad]1>,R3*~\u0004msq\u00119kk;\u0006", "uKP;W9HW\u0018H\fb,\u000fR\u0015e\u0014\b\r@\n&l\u000bd", "Ad]1@6MW#\bZo,\u0006\u0018", "Ad]1@6MW#\bZo,\u0006\u0018v8\u0004\u0004\n1o\u0015", "Ad]1F0Fc z\n^+\\\u001a/n\u000f", "/bc6b5", "3uT;g\u001bB[\u0019", "4na0X\u000fHd\u0019\f", "Adc\u000eV*>a'\u0003wb3\u0001\u0018CE\u0011(\u0005O]\u0013&ErqE\u0006%Bjy'\u001fq\u001d5QQ", "7mc2e=:Z\u0001\u0003\u0002e0\u000b", "Adc\u001ca\u001dBS+m\b^,f\u001b8e\r6WQ|\u001b\u001eCl\u0015<", "1`[9U(<Y", "Ag^B_+\u001dS z\u000f</\u0001\u0010.P\r(\nN\u0001\u0016\u0005Vk\u001d<", "AsP?g\u000bKO\u001b", "BqP;f->`wz\nZ", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u007f$\u0013Ik\u0017;u2?dG~Di\u0018\nVB\u001ax>)\u0004u]B\u0015d,[U#VH$", "2dR<e(MW#\bhbA|", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003\u0017!Oo\u001dI\u000bn#]\u0013 \r", "2qPD79:Uw~xh9x\u00183o\t", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0003$\u0013Rr\u0012:\u0005n4fy2Ek 9M\r\u001ax00\u0003fkD\u00079", "\u001aj^A_0G\u001dx\u0012\n^5\u000b\r9n`8\u0005>\u0010\u001b!P^\"Gvz", "AsP?g\u000bKO\u001bFF+\u001a]\\\u000eM", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0016$Cq\nEu$Bc\ti\u0016z\u00120)L:JA( Wn5\u0010q-N\u0004\u0006C[J\u0002A9xG#\u0019^\u0017\u00180\u001e\r#B4wBF#\u00125WK\u001cx\n\n%\u0012?s<\u0018\u001a\u0005", "BdgA<5Ic(lzl:\u0001\u00138", "", "Adb@\\6G", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n `y/8w#6<CNz\u0018' xp'\u0007q:R\u000105JX7\\(", "\u001aj^A_0G\u001d\u0017\t\bh<\f\r8e\u000eqYJ\n&\u001bP\u007f\nKz/>/", "", "uKZ<g3B\\b\u0004\ffu}\u00198c\u000f,\u0006I\u000f`wWx\fKz/>&S\u0007=w%5QL\u0005i>+\u001fxp=\u0010c:\u0018T1P[R5lN\u0002A\u001e\u001b0Q50\t\u0016U\u000b+jM9hq)N\u00029wV", "CoS.g,)]'\u0003\nb6\u0006f+c\u0003(WI\u007fu\u001bUz\nKt(", "1gX9W\u001aBh\u0019\\vg\b}\n/c\u000f\u0013wM\u0001 &5s#<", "1n\\=b5>\\(J", "1n\\=b5>\\(JBO\u0012qz?Lk", "uI\u0018\u0016", "1n\\=b5>\\(K", "1n\\=b5>\\(KBO\u0012qz?Lk", "\u0011n\\=T5B]\"", "$hTDG9>S\u0003\u0011\u0004^9\u000b", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
public final class AndroidComposeView extends ViewGroup implements Owner, ViewRootForTest, PositionCalculator, DefaultLifecycleObserver {
    private static Method getBooleanMethod = null;
    private static Class<?> systemPropertiesClass = null;
    private AndroidViewsHandler _androidViewsHandler;
    private final AndroidAutofill _autofill;
    private final InputModeManagerImpl _inputModeManager;
    private final MutableState _viewTreeOwners$delegate;
    private final WindowInfoImpl _windowInfo;
    private final AndroidAccessibilityManager accessibilityManager;
    private final AutofillTree autofillTree;
    private final CanvasHolder canvasHolder;
    private final AndroidClipboardManager clipboardManager;
    private final AndroidComposeViewAccessibilityDelegateCompat composeAccessibilityDelegate;
    private Function1<? super Configuration, Unit> configurationChangeObserver;
    private AndroidContentCaptureManager contentCaptureManager;
    private CoroutineContext coroutineContext;
    private int currentFontWeightAdjustment;
    private final MutableState density$delegate;
    private final List<OwnedLayer> dirtyLayers;
    private final DragAndDropManager dragAndDropManager;
    private final DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener;
    private final MutableVector<Function0<Unit>> endApplyChangesListeners;
    private final FocusOwner focusOwner;
    private final MutableState fontFamilyResolver$delegate;
    private final Font.ResourceLoader fontLoader;
    private boolean forceUseMatrixCache;
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private long globalPosition;
    private final GraphicsContext graphicsContext;
    private final HapticFeedback hapticFeedBack;
    private boolean hoverExitReceived;
    private boolean isDrawingContent;
    private boolean isPendingInteropViewLayoutChangeDispatch;
    private boolean isRenderNodeCompatible;
    private final Modifier keyInputModifier;
    private boolean keyboardModifiersRequireUpdate;
    private long lastDownPointerPosition;
    private long lastMatrixRecalculationAnimationTime;
    private final WeakCache<OwnedLayer> layerCache;
    private final MutableState layoutDirection$delegate;
    private final TextInputServiceAndroid legacyTextInputServiceAndroid;
    private final CalculateMatrixToWindow matrixToWindow;
    private final MeasureAndLayoutDelegate measureAndLayoutDelegate;
    private final ModifierLocalManager modifierLocalManager;
    private final MotionEventAdapter motionEventAdapter;
    private boolean observationClearRequested;
    private Constraints onMeasureConstraints;
    private Function1<? super ViewTreeOwners, Unit> onViewTreeOwnersAvailable;
    private final PointerIconService pointerIconService;
    private final PointerInputEventProcessor pointerInputEventProcessor;
    private List<OwnedLayer> postponedDirtyLayers;
    private MotionEvent previousMotionEvent;
    private long relayoutTime;
    private final Function0<Unit> resendMotionEventOnLayout;
    private final AndroidComposeView$resendMotionEventRunnable$1 resendMotionEventRunnable;
    private final LayoutNode root;
    private final RootForTest rootForTest;
    private final EmptySemanticsModifier rootSemanticsNode;
    private final Modifier rotaryInputModifier;
    private final ScrollCapture scrollCapture;
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    private final EmptySemanticsElement semanticsModifier;
    private final SemanticsOwner semanticsOwner;
    private final Runnable sendHoverExitEvent;
    private final LayoutNodeDrawScope sharedDrawScope;
    private boolean showLayoutBounds;
    private final OwnerSnapshotObserver snapshotObserver;
    private final SoftwareKeyboardController softwareKeyboardController;
    private boolean superclassInitComplete;
    private final TextInputService textInputService;
    private final AtomicReference<SessionMutex.Session<T>> textInputSessionMutex;
    private final TextToolbar textToolbar;
    private final float[] tmpMatrix;
    private final int[] tmpPositionArray;
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;
    private final ViewConfiguration viewConfiguration;
    private DrawChildContainer viewLayersContainer;
    private final float[] viewToWindowMatrix;
    private final State viewTreeOwners$delegate;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;
    private final float[] windowToViewMatrix;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 */
    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {}, d2 = {}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    @DebugMetadata(c = "drixvqm\u00039o|{\u007f\u007f\u0005wA\n~D\b\u0005z\u000f\u0002\f\u0010\fMa\u0010\u0007\u0016\u0014\u000f\u000bj\u0018\u0017\u001b\u001b \u0013\u0005\u0019\u0016)", f = "\u000e:/<81+\t41314%\u0015'\"3h\u001b'\u001c)%\u001e\u0018`\u001d%", i = {}, l = {IptcDirectory.TAG_BY_LINE}, m = "C5IF\u001cBEKK+>MNELL", n = {}, s = {})
    static final class C07721 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C07721(Continuation<? super C07721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidComposeView.this.textInputSession(null, this);
        }
    }

    private final boolean autofillSupported() {
        return true;
    }

    @Deprecated(message = ")U\nI]\u0004\u0016[]Yg\u0004cT0Sl^\u000e*\u0006|\u0011VB\u0006\u0004}S4*uv`JCZetR8#FI\u001elQ\f", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    @InterfaceC1492Gx
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @Override // androidx.compose.ui.node.Owner
    public void onAttach(LayoutNode layoutNode) {
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v109, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    public AndroidComposeView(Context context, CoroutineContext coroutineContext) throws Throwable {
        super(context);
        this.lastDownPointerPosition = Offset.Companion.m3952getUnspecifiedF1C5BW0();
        this.superclassInitComplete = true;
        this.sharedDrawScope = new LayoutNodeDrawScope(null, 1, null);
        this.density$delegate = SnapshotStateKt.mutableStateOf(AndroidDensity_androidKt.Density(context), SnapshotStateKt.referentialEqualityPolicy());
        EmptySemanticsModifier emptySemanticsModifier = new EmptySemanticsModifier();
        this.rootSemanticsNode = emptySemanticsModifier;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(emptySemanticsModifier);
        this.semanticsModifier = emptySemanticsElement;
        this.focusOwner = new FocusOwnerImpl(new AndroidComposeView$focusOwner$1(this), new AndroidComposeView$focusOwner$2(this), new AndroidComposeView$focusOwner$3(this), new AndroidComposeView$focusOwner$4(this), new AndroidComposeView$focusOwner$5(this), new MutablePropertyReference0Impl(this) { // from class: androidx.compose.ui.platform.AndroidComposeView$focusOwner$6
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((AndroidComposeView) this.receiver).getLayoutDirection();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((AndroidComposeView) this.receiver).setLayoutDirection((LayoutDirection) obj);
            }
        });
        DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener = new DragAndDropModifierOnDragListener(new AndroidComposeView$dragAndDropModifierOnDragListener$1(this));
        this.dragAndDropModifierOnDragListener = dragAndDropModifierOnDragListener;
        this.coroutineContext = coroutineContext;
        this.dragAndDropManager = dragAndDropModifierOnDragListener;
        this._windowInfo = new WindowInfoImpl();
        Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(Modifier.Companion, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m5842invokeZmokQxo(keyEvent.m5232unboximpl());
            }

            /* JADX INFO: renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m5842invokeZmokQxo(android.view.KeyEvent keyEvent) {
                final FocusDirection focusDirectionMo5804getFocusDirectionP8AzH3I = this.this$0.mo5804getFocusDirectionP8AzH3I(keyEvent);
                if (focusDirectionMo5804getFocusDirectionP8AzH3I != null && KeyEventType.m5236equalsimpl0(KeyEvent_androidKt.m5244getTypeZmokQxo(keyEvent), KeyEventType.Companion.m5240getKeyDownCS__XNY())) {
                    Rect rectOnFetchFocusRect = this.this$0.onFetchFocusRect();
                    Boolean boolMo3869focusSearchULY8qGw = this.this$0.getFocusOwner().mo3869focusSearchULY8qGw(focusDirectionMo5804getFocusDirectionP8AzH3I.m3852unboximpl(), rectOnFetchFocusRect, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1$focusWasMovedOrCancelled$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(FocusTargetNode focusTargetNode) {
                            Boolean boolM3888requestFocusMxy_nc0 = FocusTransactionsKt.m3888requestFocusMxy_nc0(focusTargetNode, focusDirectionMo5804getFocusDirectionP8AzH3I.m3852unboximpl());
                            return Boolean.valueOf(boolM3888requestFocusMxy_nc0 != null ? boolM3888requestFocusMxy_nc0.booleanValue() : true);
                        }
                    });
                    if (boolMo3869focusSearchULY8qGw != null ? boolMo3869focusSearchULY8qGw.booleanValue() : true) {
                        return true;
                    }
                    if (!FocusOwnerImplKt.m3875is1dFocusSearch3ESFkO8(focusDirectionMo5804getFocusDirectionP8AzH3I.m3852unboximpl())) {
                        return false;
                    }
                    Integer numM3863toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m3863toAndroidFocusDirection3ESFkO8(focusDirectionMo5804getFocusDirectionP8AzH3I.m3852unboximpl());
                    if (numM3863toAndroidFocusDirection3ESFkO8 == null) {
                        throw new IllegalStateException("Invalid focus direction".toString());
                    }
                    int iIntValue = numM3863toAndroidFocusDirection3ESFkO8.intValue();
                    android.graphics.Rect androidRect = rectOnFetchFocusRect != null ? RectHelper_androidKt.toAndroidRect(rectOnFetchFocusRect) : null;
                    if (androidRect != null) {
                        View viewFindNextNonChildView = this.this$0.findNextNonChildView(iIntValue);
                        if (Intrinsics.areEqual(viewFindNextNonChildView, this.this$0)) {
                            viewFindNextNonChildView = null;
                        }
                        if ((viewFindNextNonChildView == null || !FocusInteropUtils_androidKt.requestInteropFocus(viewFindNextNonChildView, Integer.valueOf(iIntValue), androidRect)) && this.this$0.getFocusOwner().mo3866clearFocusI7lrPNg(false, true, false, focusDirectionMo5804getFocusDirectionP8AzH3I.m3852unboximpl())) {
                            Boolean boolMo3869focusSearchULY8qGw2 = this.this$0.getFocusOwner().mo3869focusSearchULY8qGw(focusDirectionMo5804getFocusDirectionP8AzH3I.m3852unboximpl(), null, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1.1
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Boolean invoke(FocusTargetNode focusTargetNode) {
                                    Boolean boolM3888requestFocusMxy_nc0 = FocusTransactionsKt.m3888requestFocusMxy_nc0(focusTargetNode, focusDirectionMo5804getFocusDirectionP8AzH3I.m3852unboximpl());
                                    return Boolean.valueOf(boolM3888requestFocusMxy_nc0 != null ? boolM3888requestFocusMxy_nc0.booleanValue() : true);
                                }
                            });
                            return Boolean.valueOf(boolMo3869focusSearchULY8qGw2 != null ? boolMo3869focusSearchULY8qGw2.booleanValue() : true);
                        }
                        return true;
                    }
                    throw new IllegalStateException("Invalid rect".toString());
                }
                return false;
            }
        });
        this.keyInputModifier = modifierOnKeyEvent;
        Modifier modifierOnRotaryScrollEvent = RotaryInputModifierKt.onRotaryScrollEvent(Modifier.Companion, new Function1<RotaryScrollEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$rotaryInputModifier$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(RotaryScrollEvent rotaryScrollEvent) {
                return false;
            }
        });
        this.rotaryInputModifier = modifierOnRotaryScrollEvent;
        this.canvasHolder = new CanvasHolder();
        LayoutNode layoutNode = new LayoutNode(false, 0, 3, null);
        layoutNode.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode.setDensity(getDensity());
        layoutNode.setModifier(Modifier.Companion.then(emptySemanticsElement).then(modifierOnRotaryScrollEvent).then(modifierOnKeyEvent).then(getFocusOwner().getModifier()).then(dragAndDropModifierOnDragListener.getModifier()));
        this.root = layoutNode;
        this.rootForTest = this;
        this.semanticsOwner = new SemanticsOwner(getRoot(), emptySemanticsModifier);
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.composeAccessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.contentCaptureManager = new AndroidContentCaptureManager(this, new AndroidComposeView$contentCaptureManager$1(this));
        this.accessibilityManager = new AndroidAccessibilityManager(context);
        this.graphicsContext = AndroidGraphicsContext_androidKt.GraphicsContext(this);
        this.autofillTree = new AutofillTree();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new MotionEventAdapter();
        this.pointerInputEventProcessor = new PointerInputEventProcessor(getRoot());
        this.configurationChangeObserver = new Function1<Configuration, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$configurationChangeObserver$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Configuration configuration) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Configuration configuration) {
                invoke2(configuration);
                return Unit.INSTANCE;
            }
        };
        this._autofill = autofillSupported() ? new AndroidAutofill(this, getAutofillTree()) : null;
        this.clipboardManager = new AndroidClipboardManager(context);
        this.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.measureAndLayoutDelegate = new MeasureAndLayoutDelegate(getRoot());
        this.viewConfiguration = new AndroidViewConfiguration(android.view.ViewConfiguration.get(context));
        this.globalPosition = IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.tmpPositionArray = new int[]{0, 0};
        float[] fArrM4409constructorimpl$default = Matrix.m4409constructorimpl$default(null, 1, null);
        this.tmpMatrix = fArrM4409constructorimpl$default;
        this.viewToWindowMatrix = Matrix.m4409constructorimpl$default(null, 1, null);
        this.windowToViewMatrix = Matrix.m4409constructorimpl$default(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.windowPosition = Offset.Companion.m3951getInfiniteF1C5BW0();
        this.isRenderNodeCompatible = true;
        this._viewTreeOwners$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.viewTreeOwners$delegate = SnapshotStateKt.derivedStateOf(new Function0<ViewTreeOwners>() { // from class: androidx.compose.ui.platform.AndroidComposeView$viewTreeOwners$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final AndroidComposeView.ViewTreeOwners invoke() {
                return this.this$0.get_viewTreeOwners();
            }
        });
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f$0.updatePositionCacheAndDispatch();
            }
        };
        this.scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f$0.updatePositionCacheAndDispatch();
            }
        };
        this.touchModeChangeListener = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda2
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z2) {
                AndroidComposeView.touchModeChangeListener$lambda$6(this.f$0, z2);
            }
        };
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(getView(), this);
        this.legacyTextInputServiceAndroid = textInputServiceAndroid;
        this.textInputService = new TextInputService(AndroidComposeView_androidKt.getPlatformTextInputServiceInterceptor().invoke(textInputServiceAndroid));
        this.textInputSessionMutex = SessionMutex.m3786constructorimpl();
        this.softwareKeyboardController = new DelegatingSoftwareKeyboardController(getTextInputService());
        this.fontLoader = new AndroidFontResourceLoader(context);
        this.fontFamilyResolver$delegate = SnapshotStateKt.mutableStateOf(FontFamilyResolver_androidKt.createFontFamilyResolver(context), SnapshotStateKt.referentialEqualityPolicy());
        Object[] objArr = new Object[0];
        Method method = Class.forName(C1626yg.Ud("I:\u001e\fJPlCu2B-\u0004I6\u000eL\u007f&\u001b\u0006\u0014w", (short) (OY.Xd() ^ 796), (short) (OY.Xd() ^ 30729))).getMethod(Ig.wd("kB#X#T|\"P-5!", (short) (C1580rY.Xd() ^ (-1535))), new Class[0]);
        try {
            method.setAccessible(true);
            this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(((Resources) method.invoke(context, objArr)).getConfiguration());
            Object[] objArr2 = new Object[0];
            Method method2 = Class.forName(EO.Od("A cURq\u001d\u000ezfgK('A\u0014v\u0005[m\u0016l\u000f", (short) (C1580rY.Xd() ^ (-30293)))).getMethod(C1561oA.Qd("PM[8JWRWSCDQ", (short) (OY.Xd() ^ 19790)), new Class[0]);
            try {
                method2.setAccessible(true);
                LayoutDirection layoutDirection = FocusInteropUtils_androidKt.toLayoutDirection(((Resources) method2.invoke(context, objArr2)).getConfiguration().getLayoutDirection());
                this.layoutDirection$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(layoutDirection == null ? LayoutDirection.Ltr : layoutDirection, null, 2, null);
                AndroidComposeView androidComposeView = this;
                this.hapticFeedBack = new PlatformHapticFeedback(androidComposeView);
                this._inputModeManager = new InputModeManagerImpl(isInTouchMode() ? InputMode.Companion.m4926getTouchaOaMEAU() : InputMode.Companion.m4925getKeyboardaOaMEAU(), new Function1<InputMode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Boolean invoke(InputMode inputMode) {
                        return m5838invokeiuPiT84(inputMode.m4924unboximpl());
                    }

                    /* JADX INFO: renamed from: invoke-iuPiT84, reason: not valid java name */
                    public final Boolean m5838invokeiuPiT84(int i2) {
                        boolean zRequestFocusFromTouch;
                        if (InputMode.m4921equalsimpl0(i2, InputMode.Companion.m4926getTouchaOaMEAU())) {
                            zRequestFocusFromTouch = this.this$0.isInTouchMode();
                        } else {
                            zRequestFocusFromTouch = InputMode.m4921equalsimpl0(i2, InputMode.Companion.m4925getKeyboardaOaMEAU()) ? this.this$0.isInTouchMode() ? this.this$0.requestFocusFromTouch() : true : false;
                        }
                        return Boolean.valueOf(zRequestFocusFromTouch);
                    }
                }, null);
                AndroidComposeView androidComposeView2 = this;
                this.modifierLocalManager = new ModifierLocalManager(androidComposeView2);
                this.textToolbar = new AndroidTextToolbar(androidComposeView);
                this.layerCache = new WeakCache<>();
                this.endApplyChangesListeners = new MutableVector<>(new Function0[16], 0);
                this.resendMotionEventRunnable = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
                    @Override // java.lang.Runnable
                    public void run() {
                        this.this$0.removeCallbacks(this);
                        MotionEvent motionEvent = this.this$0.previousMotionEvent;
                        if (motionEvent != null) {
                            boolean z2 = motionEvent.getToolType(0) == 3;
                            int actionMasked = motionEvent.getActionMasked();
                            if (z2) {
                                if (actionMasked == 10 || actionMasked == 1) {
                                    return;
                                }
                            } else if (actionMasked == 1) {
                                return;
                            }
                            int i2 = 7;
                            if (actionMasked != 7 && actionMasked != 9) {
                                i2 = 2;
                            }
                            AndroidComposeView androidComposeView3 = this.this$0;
                            androidComposeView3.sendSimulatedEvent(motionEvent, i2, androidComposeView3.relayoutTime, false);
                        }
                    }
                };
                this.sendHoverExitEvent = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidComposeView.sendHoverExitEvent$lambda$8(this.f$0);
                    }
                };
                this.resendMotionEventOnLayout = new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
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
                        MotionEvent motionEvent = this.this$0.previousMotionEvent;
                        if (motionEvent != null) {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked == 7 || actionMasked == 9) {
                                this.this$0.relayoutTime = SystemClock.uptimeMillis();
                                AndroidComposeView androidComposeView3 = this.this$0;
                                androidComposeView3.post(androidComposeView3.resendMotionEventRunnable);
                            }
                        }
                    }
                };
                this.matrixToWindow = Build.VERSION.SDK_INT < 29 ? new CalculateMatrixToWindowApi21(fArrM4409constructorimpl$default, null) : new CalculateMatrixToWindowApi29();
                addOnAttachStateChangeListener(this.contentCaptureManager);
                setWillNotDraw(false);
                setFocusable(true);
                AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(androidComposeView, 1, false);
                setFocusableInTouchMode(true);
                setClipChildren(false);
                ViewCompat.setAccessibilityDelegate(androidComposeView, androidComposeViewAccessibilityDelegateCompat);
                Function1<ViewRootForTest, Unit> onViewCreatedCallback = ViewRootForTest.Companion.getOnViewCreatedCallback();
                if (onViewCreatedCallback != null) {
                    onViewCreatedCallback.invoke(this);
                }
                setOnDragListener(dragAndDropModifierOnDragListener);
                getRoot().attach$ui_release(androidComposeView2);
                if (Build.VERSION.SDK_INT >= 29) {
                    AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(androidComposeView);
                }
                this.scrollCapture = Build.VERSION.SDK_INT >= 31 ? new ScrollCapture() : null;
                this.pointerIconService = new PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1
                    private PointerIcon currentIcon = PointerIcon.Companion.getDefault();

                    @Override // androidx.compose.ui.input.pointer.PointerIconService
                    public PointerIcon getIcon() {
                        return this.currentIcon;
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerIconService
                    public void setIcon(PointerIcon pointerIcon) {
                        if (pointerIcon == null) {
                            pointerIcon = PointerIcon.Companion.getDefault();
                        }
                        this.currentIcon = pointerIcon;
                        AndroidComposeViewVerificationHelperMethodsN.INSTANCE.setPointerIcon(this.this$0, this.currentIcon);
                    }
                };
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        } catch (InvocationTargetException e3) {
            throw e3.getCause();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public View getView() {
        return this;
    }

    private void setDensity(Density density) {
        this.density$delegate.setValue(density);
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public Density getDensity() {
        return (Density) this.density$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public FocusOwner getFocusOwner() {
        return this.focusOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7 */
    public void setCoroutineContext(CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
        DelegatableNode head$ui_release = getRoot().getNodes$ui_release().getHead$ui_release();
        if (head$ui_release instanceof SuspendingPointerInputModifierNode) {
            ((SuspendingPointerInputModifierNode) head$ui_release).resetPointerInputHandler();
        }
        DelegatableNode delegatableNode = head$ui_release;
        int iM5749constructorimpl = NodeKind.m5749constructorimpl(16);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtree called on an unattached node");
        }
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        NestedVectorStack nestedVectorStack = new NestedVectorStack();
        while (layoutNodeRequireLayoutNode != null) {
            if (child$ui_release == null) {
                child$ui_release = layoutNodeRequireLayoutNode.getNodes$ui_release().getHead$ui_release();
            }
            if ((-1) - (((-1) - child$ui_release.getAggregateChildKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0) {
                while (child$ui_release != null) {
                    if ((-1) - (((-1) - child$ui_release.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0) {
                        Modifier.Node nodePop = child$ui_release;
                        MutableVector mutableVector = null;
                        while (nodePop != 0) {
                            if (nodePop instanceof PointerInputModifierNode) {
                                PointerInputModifierNode pointerInputModifierNode = (PointerInputModifierNode) nodePop;
                                if (pointerInputModifierNode instanceof SuspendingPointerInputModifierNode) {
                                    ((SuspendingPointerInputModifierNode) pointerInputModifierNode).resetPointerInputHandler();
                                }
                            } else if ((-1) - (((-1) - nodePop.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0 && (nodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = ((DelegatingNode) nodePop).getDelegate$ui_release();
                                int i2 = 0;
                                nodePop = nodePop;
                                while (delegate$ui_release != null) {
                                    if ((-1) - (((-1) - delegate$ui_release.getKindSet$ui_release()) | ((-1) - iM5749constructorimpl)) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != 0) {
                                                if (mutableVector != null) {
                                                    mutableVector.add(nodePop);
                                                }
                                                nodePop = 0;
                                            }
                                            if (mutableVector != null) {
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    nodePop = nodePop;
                                }
                                if (i2 == 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    child$ui_release = child$ui_release.getChild$ui_release();
                }
            }
            nestedVectorStack.push(layoutNodeRequireLayoutNode.get_children$ui_release());
            layoutNodeRequireLayoutNode = nestedVectorStack.isNotEmpty() ? (LayoutNode) nestedVectorStack.pop() : null;
            child$ui_release = null;
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public DragAndDropManager getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public WindowInfo getWindowInfo() {
        return this._windowInfo;
    }

    /* JADX INFO: renamed from: onMoveFocusInChildren-3ESFkO8 */
    public final boolean m5833onMoveFocusInChildren3ESFkO8(int i2) {
        View viewFindNextFocusFromRect;
        if (FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3856getEnterdhqQ8s()) || FocusDirection.m3849equalsimpl0(i2, FocusDirection.Companion.m3857getExitdhqQ8s())) {
            return false;
        }
        Integer numM3863toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m3863toAndroidFocusDirection3ESFkO8(i2);
        if (numM3863toAndroidFocusDirection3ESFkO8 == null) {
            throw new IllegalStateException("Invalid focus direction".toString());
        }
        int iIntValue = numM3863toAndroidFocusDirection3ESFkO8.intValue();
        Rect rectOnFetchFocusRect = onFetchFocusRect();
        android.graphics.Rect androidRect = rectOnFetchFocusRect != null ? RectHelper_androidKt.toAndroidRect(rectOnFetchFocusRect) : null;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (androidRect == null) {
            viewFindNextFocusFromRect = focusFinder.findNextFocus(this, findFocus(), iIntValue);
        } else {
            viewFindNextFocusFromRect = focusFinder.findNextFocusFromRect(this, androidRect, iIntValue);
        }
        if (viewFindNextFocusFromRect != null) {
            return FocusInteropUtils_androidKt.requestInteropFocus(viewFindNextFocusFromRect, Integer.valueOf(iIntValue), androidRect);
        }
        return false;
    }

    public final Rect onFetchFocusRect() {
        if (isFocused()) {
            return getFocusOwner().getFocusRect();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return FocusInteropUtils_androidKt.calculateBoundingRect(viewFindFocus);
        }
        return null;
    }

    public final View findNextNonChildView(int i2) {
        AndroidComposeView androidComposeView = this;
        View viewFindNextFocus = androidComposeView;
        while (viewFindNextFocus != null) {
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            Intrinsics.checkNotNull(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, i2);
            if (viewFindNextFocus != null && !AndroidComposeView_androidKt.containsDescendant(androidComposeView, viewFindNextFocus)) {
                return viewFindNextFocus;
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public LayoutNode getRoot() {
        return this.root;
    }

    @Override // androidx.compose.ui.node.Owner
    public RootForTest getRootForTest() {
        return this.rootForTest;
    }

    @Override // androidx.compose.ui.node.RootForTest
    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    public final AndroidContentCaptureManager getContentCaptureManager$ui_release() {
        return this.contentCaptureManager;
    }

    public final void setContentCaptureManager$ui_release(AndroidContentCaptureManager androidContentCaptureManager) {
        this.contentCaptureManager = androidContentCaptureManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // androidx.compose.ui.node.Owner
    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public final Function1<Configuration, Unit> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    public final void setConfigurationChangeObserver(Function1<? super Configuration, Unit> function1) {
        this.configurationChangeObserver = function1;
    }

    @Override // androidx.compose.ui.node.Owner
    public Autofill getAutofill() {
        return this._autofill;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z2) {
        this.showLayoutBounds = z2;
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        Intrinsics.checkNotNull(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // androidx.compose.ui.node.Owner
    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.getMeasureIteration();
    }

    @Override // androidx.compose.ui.node.Owner
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout();
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j2) {
        this.lastMatrixRecalculationAnimationTime = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ViewTreeOwners get_viewTreeOwners() {
        return (ViewTreeOwners) this._viewTreeOwners$delegate.getValue();
    }

    private final void set_viewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this._viewTreeOwners$delegate.setValue(viewTreeOwners);
    }

    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.viewTreeOwners$delegate.getValue();
    }

    public static final void touchModeChangeListener$lambda$6(AndroidComposeView androidComposeView, boolean z2) {
        androidComposeView._inputModeManager.m4929setInputModeiuPiT84(z2 ? InputMode.Companion.m4926getTouchaOaMEAU() : InputMode.Companion.m4925getKeyboardaOaMEAU());
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.node.Owner
    public SoftwareKeyboardController getSoftwareKeyboardController() {
        return this.softwareKeyboardController;
    }

    @Override // androidx.compose.ui.node.Owner
    public Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0028  */
    @Override // androidx.compose.ui.node.Owner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object textInputSession(kotlin.jvm.functions.Function2<? super androidx.compose.ui.platform.PlatformTextInputSessionScope, ? super kotlin.coroutines.Continuation<?>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.platform.AndroidComposeView.C07721
            if (r0 == 0) goto L28
            r4 = r7
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r4 = (androidx.compose.ui.platform.AndroidComposeView.C07721) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L28
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L13:
            java.lang.Object r1 = r4.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 == r2) goto L43
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L28:
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r4 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            r4.<init>(r7)
            goto L13
        L2e:
            kotlin.ResultKt.throwOnFailure(r1)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<T>> r1 = r5.textInputSessionMutex
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$2 r0 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$2
            r0.<init>()
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r4.label = r2
            java.lang.Object r0 = androidx.compose.ui.SessionMutex.m3793withSessionCancellingPreviousimpl(r1, r0, r6, r4)
            if (r0 != r3) goto L46
            return r3
        L43:
            kotlin.ResultKt.throwOnFailure(r1)
        L46:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.textInputSession(kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$textInputSession$2 */
    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0010\u001d̉=!4i\bӵLc\u000b\u0004Iي>éFB-!\\\u0016\u0006\u0007~jg1\u000bm߬2RY,"}, d2 = {"\n`]<a@F])\rS", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\u0019T?Jl>+\u001dWaL\u0016G5Y\u000765L\\:`\\{\u0013", "7s", "\u001aj^A_0Gfb|\u0005k6\r\u00183n\u007f6E\u001e\u000b$!W~\u0012Ev\u00133c\t \r", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class AnonymousClass2 extends Lambda implements Function1<CoroutineScope, AndroidPlatformTextInputSession> {
        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final AndroidPlatformTextInputSession invoke(CoroutineScope coroutineScope) {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            return new AndroidPlatformTextInputSession(androidComposeView, androidComposeView.getTextInputService(), coroutineScope);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public Font.ResourceLoader getFontLoader() {
        return this.fontLoader;
    }

    private void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.fontFamilyResolver$delegate.setValue(resolver);
    }

    @Override // androidx.compose.ui.node.Owner
    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) this.fontFamilyResolver$delegate.getValue();
    }

    private final int getFontWeightAdjustmentCompat(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    public void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection$delegate.setValue(layoutDirection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @Override // androidx.compose.ui.node.Owner
    public InputModeManager getInputModeManager() {
        return this._inputModeManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public static final void sendHoverExitEvent$lambda$8(AndroidComposeView androidComposeView) {
        androidComposeView.hoverExitReceived = false;
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        Intrinsics.checkNotNull(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
        }
        androidComposeView.m5836sendMotionEvent8iAsVTc(motionEvent);
    }

    @Override // android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        Unit unit;
        Rect rectOnFetchFocusRect = onFetchFocusRect();
        if (rectOnFetchFocusRect == null) {
            unit = null;
        } else {
            rect.left = Math.round(rectOnFetchFocusRect.getLeft());
            rect.top = Math.round(rectOnFetchFocusRect.getTop());
            rect.right = Math.round(rectOnFetchFocusRect.getRight());
            rect.bottom = Math.round(rectOnFetchFocusRect.getBottom());
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            AndroidComposeViewAssistHelperMethodsO.INSTANCE.setClassName(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.scrollCapture) == null) {
            return false;
        }
        return scrollCapture.getScrollCaptureInProgress();
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(android.graphics.Rect rect, Point point, Consumer<ScrollCaptureTarget> consumer) {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.scrollCapture) == null) {
            return;
        }
        scrollCapture.onScrollCaptureSearch(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner lifecycleOwner) {
        setShowLayoutBounds(Companion.getIsShowingLayoutBounds());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        if (view != null) {
            Rect rectCalculateBoundingRect = FocusInteropUtils_androidKt.calculateBoundingRect(view);
            FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i2);
            if (Intrinsics.areEqual((Object) getFocusOwner().mo3869focusSearchULY8qGw(focusDirection != null ? focusDirection.m3852unboximpl() : FocusDirection.Companion.m3855getDowndhqQ8s(), rectCalculateBoundingRect, C07691.INSTANCE), (Object) true)) {
                return this;
            }
        }
        return super.focusSearch(view, i2);
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$focusSearch$1 */
    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egl\u001cDo\u0016=6M:k\n", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\u000f3z\u0018.\\,Ej4sXOf5\u0018_uUr0I\u0016+6fYr9\u001dg"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07691 extends Lambda implements Function1<FocusTargetNode, Boolean> {
        public static final C07691 INSTANCE = ;

        C07691() {
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, android.graphics.Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().getRootState().getHasFocus()) {
            return super.requestFocus(i2, rect);
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i2);
        int iM3852unboximpl = focusDirection != null ? focusDirection.m3852unboximpl() : FocusDirection.Companion.m3856getEnterdhqQ8s();
        Boolean boolMo3869focusSearchULY8qGw = getFocusOwner().mo3869focusSearchULY8qGw(iM3852unboximpl, rect != null ? RectHelper_androidKt.toComposeRect(rect) : null, new Function1<FocusTargetNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView.requestFocus.1
            final /* synthetic */ int $focusDirection;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C07711(int iM3852unboximpl2) {
                super(1);
                i = iM3852unboximpl2;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                Boolean boolM3888requestFocusMxy_nc0 = FocusTransactionsKt.m3888requestFocusMxy_nc0(focusTargetNode, i);
                return Boolean.valueOf(boolM3888requestFocusMxy_nc0 != null ? boolM3888requestFocusMxy_nc0.booleanValue() : false);
            }
        });
        if (boolMo3869focusSearchULY8qGw != null) {
            return boolMo3869focusSearchULY8qGw.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$requestFocus$1 */
    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0012\u001d̉=!,r\bӵLc\u000b\u0004I\u00066\u000b<Ȑ\u0017\"Z\u0011(\u000btjQ0rf\u000f6ʂW,\u0015m\n7"}, d2 = {"\n`]<a@F])\rS", "", "7s", "\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\u0002!\u0015W}W\u001d\u0001#Egl\u001cDo\u0016=6M:k\n", "7me<^,", "uKP;W9HW\u0018\u0012D\\6\u0005\u00149s\u007fq\fDJ\u0018!E\u007f\u001c\u0006W/3i\f\u000f3z\u0018.\\,Ej4sXOf5\u0018_uUr0I\u0016+6fYr9\u001dg"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07711 extends Lambda implements Function1<FocusTargetNode, Boolean> {
        final /* synthetic */ int $focusDirection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07711(int iM3852unboximpl2) {
            super(1);
            i = iM3852unboximpl2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            Boolean boolM3888requestFocusMxy_nc0 = FocusTransactionsKt.m3888requestFocusMxy_nc0(focusTargetNode, i);
            return Boolean.valueOf(boolM3888requestFocusMxy_nc0 != null ? boolM3888requestFocusMxy_nc0.booleanValue() : false);
        }
    }

    /* JADX INFO: renamed from: onRequestFocusForOwner-7o62pno */
    public final boolean m5834onRequestFocusForOwner7o62pno(FocusDirection focusDirection, Rect rect) {
        Integer numM3863toAndroidFocusDirection3ESFkO8;
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus((focusDirection == null || (numM3863toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m3863toAndroidFocusDirection3ESFkO8(focusDirection.m3852unboximpl())) == null) ? 130 : numM3863toAndroidFocusDirection3ESFkO8.intValue(), rect != null ? RectHelper_androidKt.toAndroidRect(rect) : null);
    }

    public final void onClearFocusForOwner() {
        if (isFocused() || hasFocus()) {
            super.clearFocus();
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z2, int i2, android.graphics.Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (z2 || hasFocus()) {
            return;
        }
        getFocusOwner().releaseFocus();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        boolean isShowingLayoutBounds;
        this._windowInfo.setWindowFocused(z2);
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(z2);
        if (!z2 || getShowLayoutBounds() == (isShowingLayoutBounds = Companion.getIsShowingLayoutBounds())) {
            return;
        }
        setShowLayoutBounds(isShowingLayoutBounds);
        invalidateDescendants();
    }

    @Override // androidx.compose.ui.node.RootForTest
    /* JADX INFO: renamed from: sendKeyEvent-ZmokQxo */
    public boolean mo5806sendKeyEventZmokQxo(android.view.KeyEvent keyEvent) {
        return getFocusOwner().mo3867dispatchInterceptedSoftKeyboardEventZmokQxo(keyEvent) || FocusOwner.m3865dispatchKeyEventYhN2O0w$default(getFocusOwner(), keyEvent, null, 2, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (isFocused()) {
            this._windowInfo.m5915setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m5448constructorimpl(keyEvent.getMetaState()));
            return FocusOwner.m3865dispatchKeyEventYhN2O0w$default(getFocusOwner(), KeyEvent.m5227constructorimpl(keyEvent), null, 2, null) || super.dispatchKeyEvent(keyEvent);
        }
        return getFocusOwner().mo3868dispatchKeyEventYhN2O0w(KeyEvent.m5227constructorimpl(keyEvent), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeView.dispatchKeyEvent.1
            final /* synthetic */ android.view.KeyEvent $event;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C07681(android.view.KeyEvent keyEvent2) {
                super(0);
                keyEvent = keyEvent2;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(keyEvent));
            }
        });
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$dispatchKeyEvent$1 */
    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\f\u001d̉=!,r\bDJc\u0003İY\u0006^\ntJ֜&.\u0018w\u0015g"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,", "u(;7T=:\u001d z\u0004`uY\u00139l\u007f$\u0005\u0016"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07681 extends Lambda implements Function0<Boolean> {
        final /* synthetic */ android.view.KeyEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07681(android.view.KeyEvent keyEvent2) {
            super(0);
            keyEvent = keyEvent2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(keyEvent));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().mo3867dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent.m5227constructorimpl(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void forceAccessibilityForTesting(boolean z2) {
        this.composeAccessibilityDelegate.setAccessibilityForceEnabledForTesting$ui_release(z2);
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void setAccessibilityEventBatchIntervalMillis(long j2) {
        this.composeAccessibilityDelegate.setSendRecurringAccessibilityEventsIntervalMillis$ui_release(j2);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onDetach(LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.onNodeDetached(layoutNode);
        requestClearInvalidObservations();
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void onEndApplyChanges() {
        if (this.observationClearRequested) {
            getSnapshotObserver().clearInvalidObservations$ui_release();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
        while (this.endApplyChangesListeners.isNotEmpty()) {
            int size = this.endApplyChangesListeners.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                Function0<Unit> function0 = this.endApplyChangesListeners.getContent()[i2];
                this.endApplyChangesListeners.set(i2, null);
                if (function0 != null) {
                    function0.invoke();
                }
            }
            this.endApplyChangesListeners.removeRange(0, size);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnEndApplyChangesListener(Function0<Unit> function0) {
        if (this.endApplyChangesListeners.contains(function0)) {
            return;
        }
        this.endApplyChangesListeners.add(function0);
    }

    /* JADX INFO: renamed from: startDrag-12SF9DM */
    public final boolean m5837startDrag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j2, Function1<? super DrawScope, Unit> function1) throws Throwable {
        Context context = getContext();
        short sXd = (short) (Od.Xd() ^ (-1344));
        short sXd2 = (short) (Od.Xd() ^ (-1662));
        int[] iArr = new int["\n\u0018\u000f\u001e\u001c\u0017\u0013]\u0014!!(\u001a$+e{))0\"63".length()];
        QB qb = new QB("\n\u0018\u000f\u001e\u001c\u0017\u0013]\u0014!!(\u001a$+e{))0\"63");
        int i2 = 0;
        while (qb.YK()) {
            int iKK = qb.KK();
            Xu xuXd = Xu.Xd(iKK);
            iArr[i2] = xuXd.fK((xuXd.CK(iKK) - (sXd + i2)) - sXd2);
            i2++;
        }
        Object[] objArr = new Object[0];
        Method method = Class.forName(new String(iArr, 0, i2)).getMethod(C1561oA.od("<9G$6C>C?/0=", (short) (ZN.Xd() ^ 24679)), new Class[0]);
        try {
            method.setAccessible(true);
            Resources resources = (Resources) method.invoke(context, objArr);
            return AndroidComposeViewStartDragAndDropN.INSTANCE.startDragAndDrop(this, dragAndDropTransferData, new ComposeDragShadowBuilder(DensityKt.Density(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j2, function1, null));
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
        }
    }

    public final void addExtraDataToAccessibilityNodeInfoHelper(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int orDefault;
        if (Intrinsics.areEqual(str, this.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal$ui_release())) {
            int orDefault2 = this.composeAccessibilityDelegate.getIdToBeforeMap$ui_release().getOrDefault(i2, -1);
            if (orDefault2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, orDefault2);
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual(str, this.composeAccessibilityDelegate.getExtraDataTestTraversalAfterVal$ui_release()) || (orDefault = this.composeAccessibilityDelegate.getIdToAfterMap$ui_release().getOrDefault(i2, -1)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, orDefault);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        Intrinsics.checkNotNull(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i2, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i2;
        layoutParamsGenerateDefaultLayoutParams.height = i3;
        Unit unit = Unit.INSTANCE;
        addView(view, -1, layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i2, layoutParams, true);
    }

    public final void addAndroidView(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(androidViewHolder, layoutNode);
        AndroidViewHolder androidViewHolder2 = androidViewHolder;
        getAndroidViewsHandler$ui_release().addView(androidViewHolder2);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, androidViewHolder);
        androidViewHolder.setImportantForAccessibility(1);
        ViewCompat.setAccessibilityDelegate(androidViewHolder2, new AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView.addAndroidView.1
            final /* synthetic */ LayoutNode $layoutNode;
            final /* synthetic */ AndroidComposeView $thisView;

            AnonymousClass1(LayoutNode layoutNode2, AndroidComposeView this) {
                layoutNode = layoutNode2;
                androidComposeView = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:42:0x003e  */
            @Override // androidx.core.view.AccessibilityDelegateCompat
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onInitializeAccessibilityNodeInfo(android.view.View r6, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r7) {
                /*
                    Method dump skipped, instruction units count: 203
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.AnonymousClass1.onInitializeAccessibilityNodeInfo(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
            }
        });
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1 */
    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001f\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007Ӭ4\u0012\u000e\u0007nʑa/ǏkPDɟ\u0004*=jDJ2[<qq<\u0006\u001e\f$!O|j\u0018rX^#C=\u000b\\\r̼0O"}, d2 = {"/mS?b0=fb|\u0005f7\u0007\u0017//\u0010,EK\b\u0013&Hy\u001bD@\u0001>X\u000b*;ls8UNEy4\u000f\u0019hsw\u0003b+*\u007f&TVR+MVrOR]", "\u001a`]1e6BR,Hxh9|R@i\u007f:E\u001c~\u0015\u0017U}\u00129z,9h\u0012~7t\u00160IR;I>& dp\u000f", "=m8;\\;BO \u0003\u0010^\bz\u0007/s\u000e,xD\b\u001b&[X\u0018;v\t>Z\b", "", "6nbA", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "7mU<", "\u001a`]1e6BR,Hxh9|R@i\u007f:E<~\u0015\u0017U}\u00129z,9h\u0012i\u0013k\u0014.[Q?h8%\u0019wu\"\u0011b,2\u007f(Q*X4gN\u0002\u0013", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 extends AccessibilityDelegateCompat {
        final /* synthetic */ LayoutNode $layoutNode;
        final /* synthetic */ AndroidComposeView $thisView;

        AnonymousClass1(LayoutNode layoutNode2, AndroidComposeView this) {
            layoutNode = layoutNode2;
            androidComposeView = this;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x003e  */
        @Override // androidx.core.view.AccessibilityDelegateCompat
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onInitializeAccessibilityNodeInfo(android.view.View r6, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r7) {
            /*
                Method dump skipped, instruction units count: 203
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.AnonymousClass1.onInitializeAccessibilityNodeInfo(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.AndroidComposeView$removeAndroidView$1 */
    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\n\u001d̉=!,i\bӵRш\r\u0004o\u0005v\u0013ȁF~(,"}, d2 = {"\n`]<a@F])\rS", "", "7me<^,"}, k = 3, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    static final class C07701 extends Lambda implements Function0<Unit> {
        final /* synthetic */ AndroidViewHolder $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07701(AndroidViewHolder androidViewHolder) {
            super(0);
            androidViewHolder = androidViewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke */
        public final void invoke2() {
            AndroidComposeView.this.getAndroidViewsHandler$ui_release().removeViewInLayout(androidViewHolder);
            HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = AndroidComposeView.this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
            TypeIntrinsics.asMutableMap(layoutNodeToHolder).remove(AndroidComposeView.this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(androidViewHolder));
            androidViewHolder.setImportantForAccessibility(0);
        }
    }

    public final void removeAndroidView(AndroidViewHolder androidViewHolder) {
        registerOnEndApplyChangesListener(new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeView.removeAndroidView.1
            final /* synthetic */ AndroidViewHolder $view;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C07701(AndroidViewHolder androidViewHolder2) {
                super(0);
                androidViewHolder = androidViewHolder2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke */
            public final void invoke2() {
                AndroidComposeView.this.getAndroidViewsHandler$ui_release().removeViewInLayout(androidViewHolder);
                HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = AndroidComposeView.this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
                TypeIntrinsics.asMutableMap(layoutNodeToHolder).remove(AndroidComposeView.this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(androidViewHolder));
                androidViewHolder.setImportantForAccessibility(0);
            }
        });
    }

    public final void drawAndroidView(AndroidViewHolder androidViewHolder, Canvas canvas) {
        getAndroidViewsHandler$ui_release().drawView(androidViewHolder, canvas);
    }

    static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.scheduleMeasureAndLayout(layoutNode);
    }

    private final void scheduleMeasureAndLayout(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && childSizeCanAffectParentSize(layoutNode)) {
                layoutNode = layoutNode.getParent$ui_release();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    private final boolean childSizeCanAffectParentSize(LayoutNode layoutNode) {
        LayoutNode parent$ui_release;
        return this.wasMeasuredWithMultipleConstraints || !((parent$ui_release = layoutNode.getParent$ui_release()) == null || parent$ui_release.getHasFixedInnerContentConstraints$ui_release());
    }

    @Override // androidx.compose.ui.node.Owner
    public void measureAndLayout(boolean z2) {
        Function0<Unit> function0;
        if (this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout() || this.measureAndLayoutDelegate.getHasPendingOnPositionedCallbacks()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z2) {
                try {
                    function0 = this.resendMotionEventOnLayout;
                } finally {
                    Trace.endSection();
                }
            } else {
                function0 = null;
            }
            if (this.measureAndLayoutDelegate.measureAndLayout(function0)) {
                requestLayout();
            }
            MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
            dispatchPendingInteropLayoutCallbacks();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: measureAndLayout-0kLqBqw */
    public void mo5805measureAndLayout0kLqBqw(LayoutNode layoutNode, long j2) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.m5703measureAndLayout0kLqBqw(layoutNode, j2);
            if (!this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout()) {
                MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
                dispatchPendingInteropLayoutCallbacks();
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    private final void dispatchPendingInteropLayoutCallbacks() {
        if (this.isPendingInteropViewLayoutChangeDispatch) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.isPendingInteropViewLayoutChangeDispatch = false;
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z2) {
        this.measureAndLayoutDelegate.forceMeasureTheSubtree(layoutNode, z2);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestMeasure(LayoutNode layoutNode, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            if (this.measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z3) && z4) {
                scheduleMeasureAndLayout(layoutNode);
                return;
            }
            return;
        }
        if (!this.measureAndLayoutDelegate.requestRemeasure(layoutNode, z3) || !z4) {
            return;
        }
        scheduleMeasureAndLayout(layoutNode);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestRelayout(LayoutNode layoutNode, boolean z2, boolean z3) {
        if (z2) {
            if (this.measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z3)) {
                scheduleMeasureAndLayout$default(this, null, 1, null);
            }
        } else if (this.measureAndLayoutDelegate.requestRelayout(layoutNode, z3)) {
            scheduleMeasureAndLayout$default(this, null, 1, null);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void requestOnPositionedCallback(LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.requestOnPositionedCallback(layoutNode);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void measureAndLayoutForTest() {
        Owner.measureAndLayout$default(this, false, 1, null);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                invalidateLayoutNodeMeasurement(getRoot());
            }
            long jM5831convertMeasureSpecI7RO_PI = m5831convertMeasureSpecI7RO_PI(i2);
            int iM9154constructorimpl = (int) ULong.m9154constructorimpl(jM5831convertMeasureSpecI7RO_PI >>> 32);
            int iM9154constructorimpl2 = (int) ULong.m9154constructorimpl((jM5831convertMeasureSpecI7RO_PI + 4294967295L) - (jM5831convertMeasureSpecI7RO_PI | 4294967295L));
            long jM5831convertMeasureSpecI7RO_PI2 = m5831convertMeasureSpecI7RO_PI(i3);
            long jM6599fitPrioritizingHeightZbe2FdA = Constraints.Companion.m6599fitPrioritizingHeightZbe2FdA(iM9154constructorimpl, iM9154constructorimpl2, (int) ULong.m9154constructorimpl(jM5831convertMeasureSpecI7RO_PI2 >>> 32), (int) ULong.m9154constructorimpl((4294967295L + jM5831convertMeasureSpecI7RO_PI2) - (4294967295L | jM5831convertMeasureSpecI7RO_PI2)));
            Constraints constraints = this.onMeasureConstraints;
            if (constraints == null) {
                this.onMeasureConstraints = Constraints.m6579boximpl(jM6599fitPrioritizingHeightZbe2FdA);
                this.wasMeasuredWithMultipleConstraints = false;
            } else {
                if (!(constraints != null ? Constraints.m6584equalsimpl0(constraints.m6597unboximpl(), jM6599fitPrioritizingHeightZbe2FdA) : false)) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            }
            this.measureAndLayoutDelegate.m5704updateRootConstraintsBRTryo0(jM6599fitPrioritizingHeightZbe2FdA);
            this.measureAndLayoutDelegate.measureOnly();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this._androidViewsHandler != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: component1-VKZWuLQ */
    private final int m5829component1VKZWuLQ(long j2) {
        return (int) ULong.m9154constructorimpl(j2 >>> 32);
    }

    /* JADX INFO: renamed from: component2-VKZWuLQ */
    private final int m5830component2VKZWuLQ(long j2) {
        return (int) ULong.m9154constructorimpl((j2 + 4294967295L) - (j2 | 4294967295L));
    }

    /* JADX INFO: renamed from: pack-ZIaKswc */
    private final long m5835packZIaKswc(int i2, int i3) {
        return ULong.m9154constructorimpl(ULong.m9154constructorimpl(i3) | ULong.m9154constructorimpl(ULong.m9154constructorimpl(i2) << 32));
    }

    /* JADX INFO: renamed from: convertMeasureSpec-I7RO_PI */
    private final long m5831convertMeasureSpecI7RO_PI(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return m5835packZIaKswc(0, size);
        }
        if (mode == 0) {
            return m5835packZIaKswc(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return m5835packZIaKswc(size, size);
        }
        throw new IllegalStateException();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        this.measureAndLayoutDelegate.measureAndLayout(this.resendMotionEventOnLayout);
        this.onMeasureConstraints = null;
        updatePositionCacheAndDispatch();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    public final void updatePositionCacheAndDispatch() {
        getLocationOnScreen(this.tmpPositionArray);
        long j2 = this.globalPosition;
        int iM6766getXimpl = IntOffset.m6766getXimpl(j2);
        int iM6767getYimpl = IntOffset.m6767getYimpl(j2);
        int[] iArr = this.tmpPositionArray;
        boolean z2 = false;
        int i2 = iArr[0];
        if (iM6766getXimpl != i2 || iM6767getYimpl != iArr[1]) {
            this.globalPosition = IntOffsetKt.IntOffset(i2, iArr[1]);
            if (iM6766getXimpl != Integer.MAX_VALUE && iM6767getYimpl != Integer.MAX_VALUE) {
                getRoot().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                z2 = true;
            }
        }
        this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z2);
    }

    @Override // androidx.compose.ui.node.Owner
    public OwnedLayer createLayer(Function2<? super androidx.compose.ui.graphics.Canvas, ? super GraphicsLayer, Unit> function2, Function0<Unit> function0, GraphicsLayer graphicsLayer) {
        ViewLayerContainer viewLayerContainer;
        if (graphicsLayer != null) {
            return new GraphicsLayerOwnerLayer(graphicsLayer, null, this, function2, function0);
        }
        OwnedLayer ownedLayerPop = this.layerCache.pop();
        if (ownedLayerPop != null) {
            ownedLayerPop.reuseLayer(function2, function0);
            return ownedLayerPop;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT != 28) {
            return new GraphicsLayerOwnerLayer(getGraphicsContext().createGraphicsLayer(), getGraphicsContext(), this, function2, function0);
        }
        if (isHardwareAccelerated() && this.isRenderNodeCompatible) {
            try {
                return new RenderNodeLayer(this, function2, function0);
            } catch (Throwable unused) {
                this.isRenderNodeCompatible = false;
            }
        }
        if (this.viewLayersContainer == null) {
            if (!ViewLayer.Companion.getHasRetrievedMethod()) {
                ViewLayer.Companion.updateDisplayList(new View(getContext()));
            }
            if (ViewLayer.Companion.getShouldUseDispatchDraw()) {
                viewLayerContainer = new DrawChildContainer(getContext());
            } else {
                viewLayerContainer = new ViewLayerContainer(getContext());
            }
            this.viewLayersContainer = viewLayerContainer;
            addView(viewLayerContainer);
        }
        DrawChildContainer drawChildContainer = this.viewLayersContainer;
        Intrinsics.checkNotNull(drawChildContainer);
        return new ViewLayer(this, drawChildContainer, function2, function0);
    }

    public final boolean recycle$ui_release(OwnedLayer ownedLayer) {
        if (this.viewLayersContainer != null) {
            ViewLayer.Companion.getShouldUseDispatchDraw();
        }
        this.layerCache.push(ownedLayer);
        return true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void onSemanticsChange() throws Throwable {
        this.composeAccessibilityDelegate.onSemanticsChange$ui_release();
        this.contentCaptureManager.onSemanticsChange$ui_release();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutChange(LayoutNode layoutNode) {
        this.composeAccessibilityDelegate.onLayoutChange$ui_release(layoutNode);
        this.contentCaptureManager.onLayoutChange$ui_release(layoutNode);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onInteropViewLayoutChange(View view) {
        this.isPendingInteropViewLayoutChangeDispatch = true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        this.measureAndLayoutDelegate.registerOnLayoutCompletedListener(onLayoutCompletedListener);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: getFocusDirection-P8AzH3I */
    public FocusDirection mo5804getFocusDirectionP8AzH3I(android.view.KeyEvent keyEvent) {
        long jM5243getKeyZmokQxo = KeyEvent_androidKt.m5243getKeyZmokQxo(keyEvent);
        if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo, Key.Companion.m5171getTabEK5gGoQ())) {
            return FocusDirection.m3846boximpl(KeyEvent_androidKt.m5249isShiftPressedZmokQxo(keyEvent) ? FocusDirection.Companion.m3860getPreviousdhqQ8s() : FocusDirection.Companion.m3859getNextdhqQ8s());
        }
        if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo, Key.Companion.m5012getDirectionRightEK5gGoQ())) {
            return FocusDirection.m3846boximpl(FocusDirection.Companion.m3861getRightdhqQ8s());
        }
        if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo, Key.Companion.m5011getDirectionLeftEK5gGoQ())) {
            return FocusDirection.m3846boximpl(FocusDirection.Companion.m3858getLeftdhqQ8s());
        }
        if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo, Key.Companion.m5013getDirectionUpEK5gGoQ()) ? true : Key.m4935equalsimpl0(jM5243getKeyZmokQxo, Key.Companion.m5124getPageUpEK5gGoQ())) {
            return FocusDirection.m3846boximpl(FocusDirection.Companion.m3862getUpdhqQ8s());
        }
        if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo, Key.Companion.m5008getDirectionDownEK5gGoQ()) ? true : Key.m4935equalsimpl0(jM5243getKeyZmokQxo, Key.Companion.m5123getPageDownEK5gGoQ())) {
            return FocusDirection.m3846boximpl(FocusDirection.Companion.m3855getDowndhqQ8s());
        }
        if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo, Key.Companion.m5007getDirectionCenterEK5gGoQ()) ? true : Key.m4935equalsimpl0(jM5243getKeyZmokQxo, Key.Companion.m5021getEnterEK5gGoQ()) ? true : Key.m4935equalsimpl0(jM5243getKeyZmokQxo, Key.Companion.m5113getNumPadEnterEK5gGoQ())) {
            return FocusDirection.m3846boximpl(FocusDirection.Companion.m3856getEnterdhqQ8s());
        }
        if (Key.m4935equalsimpl0(jM5243getKeyZmokQxo, Key.Companion.m4950getBackEK5gGoQ()) ? true : Key.m4935equalsimpl0(jM5243getKeyZmokQxo, Key.Companion.m5024getEscapeEK5gGoQ())) {
            return FocusDirection.m3846boximpl(FocusDirection.Companion.m3857getExitdhqQ8s());
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        Owner.measureAndLayout$default(this, false, 1, null);
        Snapshot.Companion.sendApplyNotifications();
        this.isDrawingContent = true;
        CanvasHolder canvasHolder = this.canvasHolder;
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        getRoot().draw$ui_release(canvasHolder.getAndroidCanvas(), null);
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.dirtyLayers.get(i2).updateDisplayList();
            }
        }
        if (ViewLayer.Companion.getShouldUseDispatchDraw()) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List<OwnedLayer> list = this.postponedDirtyLayers;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            this.dirtyLayers.addAll(list);
            list.clear();
        }
    }

    public final void notifyLayerIsDirty$ui_release(OwnedLayer ownedLayer, boolean z2) {
        if (!z2) {
            if (!this.isDrawingContent) {
                this.dirtyLayers.remove(ownedLayer);
                List<OwnedLayer> list = this.postponedDirtyLayers;
                if (list != null) {
                    list.remove(ownedLayer);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.isDrawingContent) {
            this.dirtyLayers.add(ownedLayer);
            return;
        }
        ArrayList arrayList = this.postponedDirtyLayers;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.postponedDirtyLayers = arrayList;
        }
        arrayList.add(ownedLayer);
    }

    public final void setOnViewTreeOwnersAvailable(Function1<? super ViewTreeOwners, Unit> function1) {
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            function1.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.onViewTreeOwnersAvailable = function1;
    }

    public final Object boundsUpdatesContentCaptureEventLoop(Continuation<? super Unit> continuation) throws Throwable {
        Object objBoundsUpdatesEventLoop$ui_release = this.contentCaptureManager.boundsUpdatesEventLoop$ui_release(continuation);
        return objBoundsUpdatesEventLoop$ui_release == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objBoundsUpdatesEventLoop$ui_release : Unit.INSTANCE;
    }

    public final Object boundsUpdatesAccessibilityEventLoop(Continuation<? super Unit> continuation) {
        Object objBoundsUpdatesEventLoop$ui_release = this.composeAccessibilityDelegate.boundsUpdatesEventLoop$ui_release(continuation);
        return objBoundsUpdatesEventLoop$ui_release == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objBoundsUpdatesEventLoop$ui_release : Unit.INSTANCE;
    }

    private final void invalidateLayoutNodeMeasurement(LayoutNode layoutNode) {
        int i2 = 0;
        MeasureAndLayoutDelegate.requestRemeasure$default(this.measureAndLayoutDelegate, layoutNode, false, 2, null);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            do {
                invalidateLayoutNodeMeasurement(content[i2]);
                i2++;
            } while (i2 < size);
        }
    }

    private final void invalidateLayers(LayoutNode layoutNode) {
        layoutNode.invalidateLayers$ui_release();
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                invalidateLayers(content[i2]);
                i2++;
            } while (i2 < size);
        }
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner2;
        AndroidAutofill androidAutofill;
        super.onAttachedToWindow();
        this._windowInfo.setWindowFocused(hasWindowFocus());
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().startObserving$ui_release();
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.register(androidAutofill);
        }
        AndroidComposeView androidComposeView = this;
        LifecycleOwner lifecycleOwner3 = ViewTreeLifecycleOwner.get(androidComposeView);
        SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(androidComposeView);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        Lifecycle lifecycle2 = null;
        if (viewTreeOwners == null || (lifecycleOwner3 != null && savedStateRegistryOwner != null && (lifecycleOwner3 != viewTreeOwners.getLifecycleOwner() || savedStateRegistryOwner != viewTreeOwners.getLifecycleOwner()))) {
            if (lifecycleOwner3 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (savedStateRegistryOwner == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            lifecycleOwner3.getLifecycle().addObserver(this);
            ViewTreeOwners viewTreeOwners2 = new ViewTreeOwners(lifecycleOwner3, savedStateRegistryOwner);
            set_viewTreeOwners(viewTreeOwners2);
            Function1<? super ViewTreeOwners, Unit> function1 = this.onViewTreeOwnersAvailable;
            if (function1 != null) {
                function1.invoke(viewTreeOwners2);
            }
            this.onViewTreeOwnersAvailable = null;
        }
        this._inputModeManager.m4929setInputModeiuPiT84(isInTouchMode() ? InputMode.Companion.m4926getTouchaOaMEAU() : InputMode.Companion.m4925getKeyboardaOaMEAU());
        ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        if (viewTreeOwners3 != null && (lifecycleOwner2 = viewTreeOwners3.getLifecycleOwner()) != null) {
            lifecycle2 = lifecycleOwner2.getLifecycle();
        }
        if (lifecycle2 != null) {
            lifecycle2.addObserver(this);
            lifecycle2.addObserver(this.contentCaptureManager);
            getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
            getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
            getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
            if (Build.VERSION.SDK_INT >= 31) {
                AndroidComposeViewTranslationCallbackS.INSTANCE.setViewTranslationCallback(androidComposeView);
                return;
            }
            return;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("No lifecycle owner exists");
        throw new KotlinNothingValueException();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        AndroidAutofill androidAutofill;
        LifecycleOwner lifecycleOwner;
        super.onDetachedFromWindow();
        getSnapshotObserver().stopObserving$ui_release();
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        Lifecycle lifecycle = (viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null) ? null : lifecycleOwner.getLifecycle();
        if (lifecycle != null) {
            lifecycle.removeObserver(this.contentCaptureManager);
            lifecycle.removeObserver(this);
            if (autofillSupported() && (androidAutofill = this._autofill) != null) {
                AutofillCallback.INSTANCE.unregister(androidAutofill);
            }
            getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
            getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
            getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
            if (Build.VERSION.SDK_INT >= 31) {
                AndroidComposeViewTranslationCallbackS.INSTANCE.clearViewTranslationCallback(this);
                return;
            }
            return;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("No lifecycle owner exists");
        throw new KotlinNothingValueException();
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        AndroidAutofill androidAutofill;
        if (!autofillSupported() || viewStructure == null || (androidAutofill = this._autofill) == null) {
            return;
        }
        AndroidAutofill_androidKt.populateViewStructure(androidAutofill, viewStructure);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        AndroidAutofill androidAutofill;
        if (!autofillSupported() || (androidAutofill = this._autofill) == null) {
            return;
        }
        AndroidAutofill_androidKt.performAutofill(androidAutofill, sparseArray);
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        this.contentCaptureManager.onCreateVirtualViewTranslationRequests$ui_release(jArr, iArr, consumer);
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> longSparseArray) throws Throwable {
        AndroidContentCaptureManager androidContentCaptureManager = this.contentCaptureManager;
        androidContentCaptureManager.onVirtualViewTranslationResponses$ui_release(androidContentCaptureManager, longSparseArray);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            if (motionEvent.getActionMasked() == 8) {
                this.hoverExitReceived = false;
            } else {
                this.sendHoverExitEvent.run();
            }
        }
        if (motionEvent.getActionMasked() == 8) {
            if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
                return super.dispatchGenericMotionEvent(motionEvent);
            }
            return motionEvent.isFromSource(4194304) ? handleRotaryEvent(motionEvent) : ProcessResult.m5474getDispatchedToAPointerInputModifierimpl(m5832handleMotionEvent8iAsVTc(motionEvent));
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            Intrinsics.checkNotNull(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || hasChangedDevices(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !isPositionChanged(motionEvent)) {
            return false;
        }
        int iM5832handleMotionEvent8iAsVTc = m5832handleMotionEvent8iAsVTc(motionEvent);
        if (ProcessResult.m5473getAnyMovementConsumedimpl(iM5832handleMotionEvent8iAsVTc)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return ProcessResult.m5474getDispatchedToAPointerInputModifierimpl(iM5832handleMotionEvent8iAsVTc);
    }

    private final boolean handleRotaryEvent(MotionEvent motionEvent) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        float f2 = -motionEvent.getAxisValue(26);
        return getFocusOwner().dispatchRotaryEvent(new RotaryScrollEvent(f2 * ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, getContext()), f2 * ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()));
    }

    /* JADX INFO: renamed from: handleMotionEvent-8iAsVTc */
    private final int m5832handleMotionEvent8iAsVTc(MotionEvent motionEvent) {
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            recalculateWindowPosition(motionEvent);
            boolean z2 = true;
            this.forceUseMatrixCache = true;
            measureAndLayout(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.previousMotionEvent;
                if (motionEvent2 == null || motionEvent2.getToolType(0) != 3) {
                    z2 = false;
                }
                if (motionEvent2 != null && hasChangedDevices(motionEvent, motionEvent2)) {
                    if (isDevicePressEvent(motionEvent2)) {
                        this.pointerInputEventProcessor.processCancel();
                    } else if (motionEvent2.getActionMasked() != 10 && z2) {
                        sendSimulatedEvent$default(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                    }
                }
                boolean z3 = motionEvent.getToolType(0) == 3;
                if (!z2 && z3 && actionMasked != 3 && actionMasked != 9 && isInBounds(motionEvent)) {
                    sendSimulatedEvent$default(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.previousMotionEvent;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = this.previousMotionEvent;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    if (motionEvent.getAction() == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            this.motionEventAdapter.endStream(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.previousMotionEvent;
                        float x2 = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.previousMotionEvent;
                        boolean z4 = (x2 == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = this.previousMotionEvent;
                        boolean z5 = (motionEvent7 != null ? motionEvent7.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z4 || z5) {
                            if (pointerId >= 0) {
                                this.motionEventAdapter.endStream(pointerId);
                            }
                            this.pointerInputEventProcessor.clearPreviouslyHitModifierNodes();
                        }
                    }
                }
                this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                return m5836sendMotionEvent8iAsVTc(motionEvent);
            } finally {
                Trace.endSection();
            }
        } finally {
            this.forceUseMatrixCache = false;
        }
    }

    private final boolean hasChangedDevices(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private final boolean isDevicePressEvent(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    /* JADX INFO: renamed from: sendMotionEvent-8iAsVTc */
    private final int m5836sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventData;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            this._windowInfo.m5915setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m5448constructorimpl(motionEvent.getMetaState()));
        }
        AndroidComposeView androidComposeView = this;
        PointerInputEvent pointerInputEventConvertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(motionEvent, androidComposeView);
        if (pointerInputEventConvertToPointerInputEvent$ui_release != null) {
            List<PointerInputEventData> pointers = pointerInputEventConvertToPointerInputEvent$ui_release.getPointers();
            int size = pointers.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = size - 1;
                    pointerInputEventData = pointers.get(size);
                    if (pointerInputEventData.getDown()) {
                        break;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    size = i2;
                }
            } else {
                pointerInputEventData = null;
            }
            PointerInputEventData pointerInputEventData2 = pointerInputEventData;
            if (pointerInputEventData2 != null) {
                this.lastDownPointerPosition = pointerInputEventData2.m5402getPositionF1C5BW0();
            }
            int iM5407processBIzXfog = this.pointerInputEventProcessor.m5407processBIzXfog(pointerInputEventConvertToPointerInputEvent$ui_release, androidComposeView, isInBounds(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && !ProcessResult.m5474getDispatchedToAPointerInputModifierimpl(iM5407processBIzXfog)) {
                this.motionEventAdapter.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
                return iM5407processBIzXfog;
            }
            return iM5407processBIzXfog;
        }
        this.pointerInputEventProcessor.processCancel();
        return PointerInputEventProcessorKt.ProcessResult(false, false);
    }

    static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i2, long j2, boolean z2, int i3, Object obj) {
        if ((-1) - (((-1) - i3) | ((-1) - 8)) != 0) {
            z2 = true;
        }
        androidComposeView.sendSimulatedEvent(motionEvent, i2, j2, z2);
    }

    public final void sendSimulatedEvent(MotionEvent motionEvent, int i2, long j2, boolean z2) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i2 != 9 && i2 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((actionIndex < 0 || i5 < actionIndex) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            long jMo5467localToScreenMKHz9U = mo5467localToScreenMKHz9U(OffsetKt.Offset(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = Offset.m3937getXimpl(jMo5467localToScreenMKHz9U);
            pointerCoords.y = Offset.m3938getYimpl(jMo5467localToScreenMKHz9U);
            i5++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j2 : motionEvent.getDownTime(), j2, i2, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z2 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        AndroidComposeView androidComposeView = this;
        PointerInputEvent pointerInputEventConvertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(motionEventObtain, androidComposeView);
        Intrinsics.checkNotNull(pointerInputEventConvertToPointerInputEvent$ui_release);
        this.pointerInputEventProcessor.m5407processBIzXfog(pointerInputEventConvertToPointerInputEvent$ui_release, androidComposeView, true);
        motionEventObtain.recycle();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        return this.composeAccessibilityDelegate.m5847canScroll0AR0LA0$ui_release(false, i2, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
        return this.composeAccessibilityDelegate.m5847canScroll0AR0LA0$ui_release(true, i2, this.lastDownPointerPosition);
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        return 0.0f <= x2 && x2 <= ((float) getWidth()) && 0.0f <= y2 && y2 <= ((float) getHeight());
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* JADX INFO: renamed from: localToScreen-MK-Hz9U */
    public long mo5467localToScreenMKHz9U(long j2) {
        recalculateWindowPosition();
        long jM4415mapMKHz9U = Matrix.m4415mapMKHz9U(this.viewToWindowMatrix, j2);
        return OffsetKt.Offset(Offset.m3937getXimpl(jM4415mapMKHz9U) + Offset.m3937getXimpl(this.windowPosition), Offset.m3938getYimpl(jM4415mapMKHz9U) + Offset.m3938getYimpl(this.windowPosition));
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* JADX INFO: renamed from: localToScreen-58bKbWc */
    public void mo5466localToScreen58bKbWc(float[] fArr) {
        recalculateWindowPosition();
        Matrix.m4426timesAssign58bKbWc(fArr, this.viewToWindowMatrix);
        AndroidComposeView_androidKt.m5852preTranslatecG2Xzmc(fArr, Offset.m3937getXimpl(this.windowPosition), Offset.m3938getYimpl(this.windowPosition), this.tmpMatrix);
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
    public long mo5468screenToLocalMKHz9U(long j2) {
        recalculateWindowPosition();
        return Matrix.m4415mapMKHz9U(this.windowToViewMatrix, OffsetKt.Offset(Offset.m3937getXimpl(j2) - Offset.m3937getXimpl(this.windowPosition), Offset.m3938getYimpl(j2) - Offset.m3938getYimpl(this.windowPosition)));
    }

    private final void recalculateWindowPosition() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            recalculateWindowViewTransforms();
            ViewParent parent = getParent();
            AndroidComposeView androidComposeView = this;
            while (parent instanceof ViewGroup) {
                androidComposeView = (View) parent;
                parent = ((ViewGroup) androidComposeView).getParent();
            }
            androidComposeView.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f2 = iArr[0];
            float f3 = iArr[1];
            androidComposeView.getLocationInWindow(iArr);
            int[] iArr2 = this.tmpPositionArray;
            this.windowPosition = OffsetKt.Offset(f2 - iArr2[0], f3 - iArr2[1]);
        }
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        long jM4415mapMKHz9U = Matrix.m4415mapMKHz9U(this.viewToWindowMatrix, OffsetKt.Offset(motionEvent.getX(), motionEvent.getY()));
        this.windowPosition = OffsetKt.Offset(motionEvent.getRawX() - Offset.m3937getXimpl(jM4415mapMKHz9U), motionEvent.getRawY() - Offset.m3938getYimpl(jM4415mapMKHz9U));
    }

    private final void recalculateWindowViewTransforms() {
        this.matrixToWindow.mo5853calculateMatrixToWindowEL8BTi8(this, this.viewToWindowMatrix);
        InvertMatrixKt.m5879invertToJiSxe2E(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m3790getCurrentSessionimpl(this.textInputSessionMutex);
        if (androidPlatformTextInputSession == null) {
            return this.legacyTextInputServiceAndroid.isEditorFocused();
        }
        return androidPlatformTextInputSession.isReadyForConnection();
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m3790getCurrentSessionimpl(this.textInputSessionMutex);
        if (androidPlatformTextInputSession == null) {
            return this.legacyTextInputServiceAndroid.createInputConnection(editorInfo);
        }
        return androidPlatformTextInputSession.createInputConnection(editorInfo);
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: calculateLocalPosition-MK-Hz9U */
    public long mo5802calculateLocalPositionMKHz9U(long j2) {
        recalculateWindowPosition();
        return Matrix.m4415mapMKHz9U(this.windowToViewMatrix, j2);
    }

    @Override // androidx.compose.ui.node.Owner
    /* JADX INFO: renamed from: calculatePositionInWindow-MK-Hz9U */
    public long mo5803calculatePositionInWindowMKHz9U(long j2) {
        recalculateWindowPosition();
        return Matrix.m4415mapMKHz9U(this.viewToWindowMatrix, j2);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(AndroidDensity_androidKt.Density(getContext()));
        if (getFontWeightAdjustmentCompat(configuration) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(configuration);
            setFontFamilyResolver(FontFamilyResolver_androidKt.createFontFamilyResolver(getContext()));
        }
        this.configurationChangeObserver.invoke(configuration);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        if (this.superclassInitComplete) {
            LayoutDirection layoutDirection = FocusInteropUtils_androidKt.toLayoutDirection(i2);
            if (layoutDirection == null) {
                layoutDirection = LayoutDirection.Ltr;
            }
            setLayoutDirection(layoutDirection);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        this.composeAccessibilityDelegate.dispatchHoverEvent$ui_release(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && isInBounds(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.previousMotionEvent;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                this.hoverExitReceived = true;
                postDelayed(this.sendHoverExitEvent, 8L);
                return false;
            }
        } else if (!isPositionChanged(motionEvent)) {
            return false;
        }
        return ProcessResult.m5474getDispatchedToAPointerInputModifierimpl(m5832handleMotionEvent8iAsVTc(motionEvent));
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007d A[LOOP:0: B:63:0x004a->B:78:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0084 A[EDGE_INSN: B:82:0x0084->B:81:0x0084 BREAK  A[LOOP:0: B:63:0x004a->B:78:0x007d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean isBadMotionEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            float r1 = r7.getX()
            boolean r0 = java.lang.Float.isInfinite(r1)
            r5 = 0
            r4 = 1
            if (r0 != 0) goto L82
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L82
            float r1 = r7.getY()
            boolean r0 = java.lang.Float.isInfinite(r1)
            if (r0 != 0) goto L82
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L82
            float r1 = r7.getRawX()
            boolean r0 = java.lang.Float.isInfinite(r1)
            if (r0 != 0) goto L82
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L82
            float r1 = r7.getRawY()
            boolean r0 = java.lang.Float.isInfinite(r1)
            if (r0 != 0) goto L82
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L82
            r0 = r5
        L43:
            if (r0 != 0) goto L84
            int r3 = r7.getPointerCount()
            r2 = r4
        L4a:
            if (r2 >= r3) goto L84
            float r1 = r7.getX(r2)
            boolean r0 = java.lang.Float.isInfinite(r1)
            if (r0 != 0) goto L7a
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L7a
            float r1 = r7.getY(r2)
            boolean r0 = java.lang.Float.isInfinite(r1)
            if (r0 != 0) goto L7a
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L7a
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L80
            androidx.compose.ui.platform.MotionEventVerifierApi29 r0 = androidx.compose.ui.platform.MotionEventVerifierApi29.INSTANCE
            boolean r0 = r0.isValidMotionEvent(r7, r2)
            if (r0 != 0) goto L80
        L7a:
            r0 = r4
        L7b:
            if (r0 != 0) goto L84
            int r2 = r2 + 1
            goto L4a
        L80:
            r0 = r5
            goto L7b
        L82:
            r0 = r4
            goto L43
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.isBadMotionEvent(android.view.MotionEvent):boolean");
    }

    private final boolean isPositionChanged(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.previousMotionEvent) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int i2, View view) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = Class.forName(AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (Intrinsics.areEqual(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i2))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View viewFindViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i2, viewGroup.getChildAt(i3));
            if (viewFindViewByAccessibilityIdRootedAtCurrentView != null) {
                return viewFindViewByAccessibilityIdRootedAtCurrentView;
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public PointerIconService getPointerIconService() {
        return this.pointerIconService;
    }

    public final View findViewByAccessibilityIdTraversal(int i2) throws IllegalAccessException, InvocationTargetException {
        View viewFindViewByAccessibilityIdRootedAtCurrentView = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = Class.forName(AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i2));
                if (objInvoke instanceof View) {
                    viewFindViewByAccessibilityIdRootedAtCurrentView = (View) objInvoke;
                }
            } else {
                viewFindViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i2, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return viewFindViewByAccessibilityIdRootedAtCurrentView;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean isLifecycleInResumedState() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        return ((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == Lifecycle.State.RESUMED;
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я \u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6Ȑ\u0007\"B\u0012\u007fјnjG9L͜N\u0093Siճ?k*3d`*qٴ?U(}j\u000f]S\u007fg\u001dP!\u000b\u0014\u001d\u0014\u0017\u0011lBH\u0004z4܋\u001b̓FoG\u074c\u001e\u0002K<xzF\u0005&387(\tWɠ6Н\u0014v\u0003ŏƠ\u0010\u0019"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laKEA6V\u0002#PPX52", "", "u(E", "5dc\u000fb6ES\u0015\bb^;\u007f\u0013.", "\u001aiPCTuEO\"\u0001Dk,}\u0010/c\u000fqc@\u0010\u001a!FE", "AxbAX4)`#\nzk;\u0001\t=C\u0007$\nN", "\u001aiPCTuEO\"\u0001D<3x\u0017=;", "5dc\u0016f\u001aA]+\u0003\u0004`\u0013x\u001d9u\u000f\u0005\u0006P\n\u0016%", "", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean getIsShowingLayoutBounds() {
            try {
                if (AndroidComposeView.systemPropertiesClass == null) {
                    AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.systemPropertiesClass;
                    AndroidComposeView.getBooleanMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.getBooleanMethod;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", false) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: AndroidComposeView.android.kt */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\u0015\"4\u0012}\u000bloOӄtev-\u0013f:\u0013y{L$\n%\u0002GIW2}P\fҊRgur\u001bi\u0019C'\u0006Dy̶0O]ތu\u0014\u00157Pu\u0010B[qU9\u000fwȥ\t&:ĲP{\u000b\b(2У\u0014\u007f"}, d2 = {"\u001a`]1e6BR,Hxh4\b\u0013=eI8\u007f\n\f\u001e\u0013Vp\u0018I~n\u0011b|-Aq\u0015\fWKFuB\u001e\u0006laKET0N\t\u0016TLN\u0016n[rJ\"g", "", ":hU2V@<Z\u0019h\rg,\n", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000fGb}-\r", "A`e2W\u001aMO(~g^.\u0001\u0017>r\u0014\u0012\u000eI\u0001$", "\u001a`]1e6BR,H\tZ=|\b=t{7{\nn\u0013(Gn{Kr45F}\";{%;a-Mt4+j", "uKP;W9HW\u0018\u0012De0}\t-y}/{\ng\u001b\u0018Gm\":}%\u001fk\u0007 DC|*VBHu8\u001d(2o5\u0018c+\\\u0006#VL\u0018\u001aXcr<\u0002!V\u001dN\u0018\r\u0007]O3{X!1\u0011,VW~Y", "5dc\u0019\\->Q-|\u0002^\u0016\u000f\u0012/r", "u(;.a+K]\u001d}\u000e(3\u0001\n/c\u0014&\u0003@J}\u001bHo\fPt,5C\u0010)7zk", "5dc T=>R\u0007\u000evm,i\t1i\u000e7\tTj) G|", "u(;.a+K]\u001d}\u000e(:x\u001a/d\u000e7wO\u0001`\u0005C\u0001\u000e;d41h}\r7o\u001a<\\POUF'\u0015u7", "ChN?X3>O'~"}, k = 1, mv = {1, 8, 0}, pn = "", xi = 48, xs = "")
    public static final class ViewTreeOwners {
        public static final int $stable = 8;
        private final LifecycleOwner lifecycleOwner;
        private final SavedStateRegistryOwner savedStateRegistryOwner;

        public ViewTreeOwners(LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner) {
            this.lifecycleOwner = lifecycleOwner;
            this.savedStateRegistryOwner = savedStateRegistryOwner;
        }

        public final LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }
}
