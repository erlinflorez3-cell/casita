package com.rncamerakit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.AudioManager;
import android.media.MediaActionSound;
import android.net.Uri;
import android.util.Size;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.MeteringPointFactory;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.ZoomState;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.rncamerakit.barcode.BarcodeFrame;
import com.rncamerakit.events.CaptureButtonPressInEvent;
import com.rncamerakit.events.CaptureButtonPressOutEvent;
import com.rncamerakit.events.ErrorEvent;
import com.rncamerakit.events.OrientationChangeEvent;
import com.rncamerakit.events.PictureTakenEvent;
import com.rncamerakit.events.ReadCodeEvent;
import com.rncamerakit.events.ZoomEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import yg.C1561oA;
import yg.C1580rY;
import yg.C1593ug;
import yg.C1607wl;
import yg.C1633zX;
import yg.FB;
import yg.InterfaceC1492Gx;
import yg.Jg;
import yg.OY;
import yg.Od;
import yg.QB;
import yg.Qg;
import yg.Wg;
import yg.Xg;
import yg.Xu;
import yg.hg;

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
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яŭ\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*,\u0018w\u000ffxH8D{H6RY*\u0017k\n@,Ӌ,qY;]ڼ\u0006\"\u001fOVʴon`Z\u0013¼\u0017\u0006,xrߚQU\u000f]\u001a\u000f8Bw?IMwމA`\u0003<\rړ:\"Ny\rЏ\"*^\u0010~zIK\u0014\u0012>Dx:X\u000fU\u00050\u0012\u000e>&\u0001&\\uS>ԟt]P/+ɅqBd'gܞ\u0005M\u001bO\\܋\u0015vo%3@=6\u001d%i\u0003\u000fRaD\u000b?\u007f=\rh-'3I\u0002y>X\u000eϬ\u001dۀW\rsr.ؘ\rQn,/+UfSP$(\u007fz\u0002\u0011D\u0004$\u0006/H40\"f\u001e\u000e;txTHP\u0010|J\u007f\u0011a>\u0017+\f;+O\u001bnQgV\u001fSMަ#څ\u001dS\u0001\u001d \fT<`M\u001bơv\u0012<aDKIf\n\b?ъ\bpp\u0005r\u001a>~\u0018/*)^\u001b3os9Q9\u001c\u0006V}\u007fv3x/S2XVz:nDrp\tTzR!\u001dk~\u0010\t<\u001f\u000b4`\u0017\u007f\u0018\u0013Ne\b>1%>\u000e}'\u001an[\u001e\"%](\u007fe|.&]I`C5\u007f{>%\u0019v\\UJ'\u001dX\u0015Z\u0004\u0010h\"@\"``\u001b\u0014\u0006B\\N:+x?:,BsI\u0019\u000bBx\t,\u000bY~\u001f^\t2V\u0013\u001d92M\u0002$#DGP%\u0010}3\u0011IZ8\u0011(;\u000ei7/%\u0004I\u0019:\u000bp\u001f\u0001\n~u\u000f\u0013Gƥp\u0016\u0004$D&$iQQ]\u000eY\u000fGA@SEEz\u0012\u0016W[d?|\u0013x=J\u00192u<\u0003pZ\u007f1J\u0018Z%u\u000f^!PNdH\bo\u001b\u0013G\u0012\u0010;_L\u001f\u000b\u0003\b\u0013\u00158E\u000b-u=\u0001\u001e]CGuW5u.wBjEkkC\b4\nd\u001f&#A2\u0007*\u00168p_:J;f\u0005\n\u0003L\u007f<l1Z\u000fj@\u0016PgL\ra\u0004qh~4PM9GDfO2\u001bPn[hN6\u0010|<m\u000b\fC,O\u000fG3reS\u0016\u00064K%\u0019Xq\"\u000b*l\u001f\u0016*!8V\u0006kO0N\t&\u001bY;\u0011@l\u000f2\u001aD>\u001e\nqs0\u0006خ~\u007fTFW%@*\f;\u0005I\u0005|j)`\u0005\u000fT'!r\u000f\rwK\u001e'pa\u000b{0l1y1/>e\u0017)Vg~\u0015`[JZ9)\u0015p\u00019N&OWoN\u0004ud\u001eo}zP\u0018+*\u000b&))i\u0011\u000e2`d\u0011Ur?|v@o\u001b\\0\u001b\u0017z+Il\u0010\u001dw1Q\tn\u00116\u0015\\\u0006*[\u001a/Rt/\r\u000b\u000bW^\u001b[\u001e};K>\u0003\u0014U7\bYA|\u0016\u00148'2\rioe\u0004~\n\fVj\u001c\u007f\rz\u0004\u001f\u0012~?ɯ2J\u0003YR:\u0016.g\u0002a=Cbgd\u0010!n0sx\u0014<ch'E\u0014pqim\u000b1\u0014yb\bjEPKDWQ<\u0010pZh)\u001c,f\u000f\u0018\u0014CaO:\u0016]A\u0010}\u00111~yψZ%+]'Zf?ÊQ6}M\u0012>\u00118ė'-;\u0005\tnh\u0017W\u0005B\u0006;'y6˳s$)B8/Nl}+6\\qLmwK'ۗZ%G\u000fB4KW\u001d93h>IVכ\u000fo6]Y\u001aHōs\u0018*pD#\u0004u~EF\u0003LJ+gX\u0006d1E\u0012E\u0001Q\u0016ϻ\u0010&\u0011]\u0016h&LI2\u001eQPaJa\u0018\u000f͉7\u001eo5T{k\"i3.\u0019\u0005\u0011\u000fOy_qPrewyˇ\u001bΘ\u001fYn;3<6X5\u0014\u001aex\b$ޒbւe,Qʿ\u0016,\b_X\u0002 \u001eR/\\±/ǪI1P߫0jNb\fY\u001a%XCEޒ/ؼpx{ԁ|w&\u0002|]w3o\njԏPĎ.-t؋\u0016Yv\n#D;Vjɡ\u001bҋ-3\u001fτ`]\u007fRCK\tL]o4٭\u001fű\b::݃\u0007\u0006UTq*4/h˪eènmY̙`D \"%\u0004&G)ϕ\fѦ!\u0018/֏GRDs\u0011Mozaٽ\u001bľb.JԽ[\u0014$G`\u0019\u0018|xzk\u0378?˝wAÖ'\n/8)];\u0005S\u0004A\u07b2K߂uXEغ\u0004\u0017{gp5\u0014t[Ǽ-ʢh+\u001dɸ;7<en>HI/Ɯ\u001aȭhH\u0018͊IP6\u000eH0^hUߣO\u05fc\u0005\u001c'\u07b7&%s JdMZ\u00130\u0002ŎcּVW+-\u0007$S\u001eO<+\r4RgVyє\u0019жB{\u0010֟\u001ac\u000b\u0013a\u0012\u0019`x*\u0006ΩKĪEKtɟ6K'}W~:G}Մ\u0012ڃ(boѕ:\u001c0\b\u001bNLUWq\"Á\u001dߒFj\u0017߇E\u0018<6PU4h\\\u0089nɲ9;gގ|:~5_O\u0019)\u0001ڟ{ѸxYUҗ{\u0002'lIq?\u0013&ǳ ،U\\`ƃgc4p+\u0002H5|ɂ\bž-0\u001fƉ4yx%l`?\u0007\u000bɌ<ټ}rnͣ\u000foLn`lG\u001a&ʊ'эHb\u0011ȢAXODznB&dgAߛ\rΞOc\u001f\u0014EfG/uhR\"\u0010+*Ԩ1϶N\u0006\u0016Î2\u0004#2u3d4Fۑ\tВ\t>n̑āpЀL"}, d2 = {"\u001ab^:\"9GQ\u0015\u0007zk(\u0003\r>/]\u000eY<\t\u0017$CE", "\u001a`]1e6BRb\u0011~].|\u0018xF\r$\u0004@g\u0013+Q\u007f\u001d\u0012", "\u001a`]1e6BR,H\u0002b-|\u0007Cc\u0007(E'\u0005\u0018\u0017E\u0004\fCv\u000f2g}-Hm#\u0004", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~H\u0001 ?m\u0015\u001bM?9z\u0012(\u001ewaL\u00169o?", "/k[<j,=0\u0015\fxh+|wCp\u007f6", "", "\u001ab^:\"9GQ\u0015\u0007zk(\u0003\r>/]2z@a!$Ok\u001d\u0012", ")KR<`uK\\\u0017z\u0003^9x\u000f3tI\u0006\u0006?\u0001w!Tw\nKL", "/tc<96<c'", "", "0`a0b+>4&z\u0003^", "\u001ab^:\"9GQ\u0015\u0007zk(\u0003\r>/|$\t>\u000b\u0016\u0017\u0011L\nIt/4Y^-3u\u0016\u0004", "0`a0b+>4&z\u0003^\u001a\u0001\u001e/", "\u001a`]1e6BRb\u000f\nb3Fv3z\u007f}", "1`\\2e(", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jt\u0013Oo\u001b8L", "1`\\2e(\u001ef\u0019|\u000bm6\n", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJv*Gm\u001eK\u00012#Y\u000b1;k\u0016\u0004", "1`\\2e()`#\u0010~],\n", "\u001a`]1e6BR,HxZ4|\u0016+/\u0007,|@~+\u0015NoW'\u0004/3Y\f.\u0015i\u001e.Z?&x>/\u0019gaF\\", "1ta?X5M1#\b\n^?\f", "3eU2V;%O-~\b", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "4qP:X\nHZ#\f", "", "7lP4X\bGO \u0013\u0010^9", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jz\u001fCq\u000e\u0018\u007f!<m\f$EC", "7lP4X\n:^(\u000f\b^", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jz\u001fCq\u000e\u001ar0Di\u000b \r", ":`b2e\nHZ#\f", ":`bAB53]#\u0007", "", ":d]@G@IS", ";`g'b6F", "\u001aiPCTuEO\"\u0001D=6\r\u00066eU", "=qX2a;:b\u001d\t\u0004E0\u000b\u0018/n\u007f5", "\u001a`]1e6BRb\u0010~^>Fr<i\u007f1\u000b<\u0010\u001b!PO\u001f<\u007f4\u001c]\f/7v\u0016;#", "=tc=h;)O(\u0002", ">h]0[\u000e>a(\u000f\b^\u001a\f\u0005<t\u007f'WO", "", ">qTC\\,P", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@J\u0002$G\u0001\u0012<\tz", "@dRAB=>` z\u000f", "\u001ab^:\"9GQ\u0015\u0007zk(\u0003\r>/l(yOj(\u0017Tv\nPL", "AbP;5(KQ#}z", "", "AbP;G/K](\u000e\u0002^\u000b|\u0010+y", "", "AgdAg,K/\"\u0003\u0003Z;\u0001\u00138D\u00105wO\u0005! ", "AgdAg,K>\u001c\t\nh\u001a\u0007\u00198d", "DhTD90GR\u0019\f", "\u001a`]1e6BR,HxZ4|\u0016+/\u0011,{RJ\u0002$G\u0001\u0012<\t\u00169Y\u0010u", "Hn^:", "Hn^:@6=S", "Hn^:F;:`(~y:;", "/r_2V;+O(\u0003\u0005", "EhSA[", "6dX4[;", "0h]16(FS&zjl,Z\u0005=e\u000e", "", "1`_Ah9>", "=oc6b5L", "", "", ">q^:\\:>", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW'\u0004/=]\f \r", "1n]CX9M/ \u0006\u0005p,{e+r}2z@o+\"G}", "", "1n]CX9M2\u0019\u0010~\\,_\t3g\u00037jJn'\"Ry\u001bKv$\u0011g\t 5|\u0003*\\GE", "/bcBT30W\u0018\u000e}", "/bcBT3!S\u001d\u0001}m", "2hb=T;<V~~\u000f>=|\u0012>", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fn/y_9{I\u0010l", "4kP@[\u001dBS+_~g+|\u0016", "4nRBf\u0016G>#\u0003\u0004m", "F", "G", "uKY.i(\bZ\u0015\b|(\r\u0004\u0013+tU\u000f\u0001<\u0012\u0013`Nk\u0017>@\u0006<cy/\r1\u0007", "5dc\u000eV;Bd\u001d\u000e\u000f", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "5dc#T3BR\u000e\t\u0005f", "DhS2b\u000b>d\u001d|z", "6`b\u001dX9FW'\r~h5\u000b", "7mbAT3E6\u001d~\bZ9z\fCF\u00047\u000b@\u000e", "DhTD", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "=m0Ag(<V\u0019}ih\u001e\u0001\u0012.o\u0012", "=m1.e*HR\u0019kzZ+", "0`a0b+>a", "", "\u001ab^:\".H]\u001b\u0006z(4\u0004\u000f3tI9\u007fN\u0005! \u0011l\nIt/4YG\u001eAu\u001e8V\r\u0018gA\u001c\u001fga\u000f", "=m2.c;N`\u0019[\u000bm;\u0007\u0012\u001ar\u007f6\n$\n", "9dh\u0010b+>", "=m2.c;N`\u0019[\u000bm;\u0007\u0012\u001ar\u007f6\n*\u0011&", "=m32g(<V\u0019}[k6\u0005z3n~2\u000e", "=m>?\\,Gb\u0015\u000e~h5Z\f+n\u0002(", "=qX2a;:b\u001d\t\u0004", "=m?6V;N`\u0019mvd,\u0006", "CqX", "=mI<b4", "2db6e,=H#\t\u0003", "uKY.i(\bZ\u0015\b|(\u000b\u0007\u0019,l\u007f}?1", "@db2g!H]!", "Adc\u000e_3He\u0019}WZ9z\u0013.en<\u0007@\u000f", "Bx_2f", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW)v!4Uz'7I#;IW\u0011", "Adc\u000eh;H4#|\u000bl", ";nS2", "Adc\u000fT9<]\u0018~[k(\u0005\t\u001di\u0015(", "Ahi2", "Adc\u0010T4>`\u0015m\u000fi,", "Bx_2", "Adc\u0013_(LV\u0001\ty^", "Adc\u0013e(FSv\t\u0002h9", "1n[<e", "Adc\u0019T:>`v\t\u0002h9", "Adc\u001aT?3]#\u0007", "4`RAb9", "Adc\u001ch;Ic(ivm/", ">`c5", "Adc V(G0\u0015\fxh+|", "3mP/_,=", "Adc V(GB\u001c\f\u0005m;\u0004\t\u000ee\u0007$\u0010", "2d[.l\u0014L", "Adc [6P4&z\u0003^", "Adc [<Mb\u0019\fVg0\u0005\u0005>i\n1ZP\u000e\u0013&Ky\u0017", "2ta.g0H\\", "Adc [<Mb\u0019\fea6\f\u0013\u001do\u00101z", "Adc!b9<V\u0001\ty^", "Adc'b6F", "Adc'b6F4#\f", "Adc'b6F;#}z", "AdcBc\n:[\u0019\fv", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^sz\u00057e\r$CF\u0005&\u0011To\u0015<r35"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class CKCamera extends FrameLayout implements LifecycleObserver {
    public static final Companion Companion = new Companion(null);
    private static final double RATIO_16_9_VALUE = 1.7777777777777777d;
    private static final double RATIO_4_3_VALUE = 1.3333333333333333d;
    private static final String TAG = "CameraKit";
    private CodeFormat[] allowedBarcodeTypes;
    private String autoFocus;
    private BarcodeFrame barcodeFrame;
    private Size barcodeFrameSize;
    private Camera camera;
    private ExecutorService cameraExecutor;
    private ProcessCameraProvider cameraProvider;
    private final ThemedReactContext currentContext;
    private View effectLayer;
    private int frameColor;
    private ImageAnalysis imageAnalyzer;
    private ImageCapture imageCapture;
    private int laserColor;
    private double lastOnZoom;
    private int lensType;
    private Double maxZoom;
    private OrientationEventListener orientationListener;
    private String outputPath;
    private float pinchGestureStartedAt;
    private Preview preview;
    private RectOverlay rectOverlay;
    private boolean scanBarcode;
    private long scanThrottleDelay;
    private int shutterAnimationDuration;
    private boolean shutterPhotoSound;
    private PreviewView viewFinder;
    private Double zoom;
    private String zoomMode;
    private float zoomStartedAt;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u000f6B\u0005\"4\u0012\u0006\u0013nʑ?ӋE{߉^R\u0002)Op\u00024ż_$\u007fC\fa(~:\t}P>˪AН^\u000bKƤV\"\u0007mDI\u0004z4܋a̓FoG\u074c\u001e{K=xtd\nv݈tأ}\u0005\tɝݻL\u0016"}, d2 = {"\u001ab^:\"9GQ\u0015\u0007zk(\u0003\r>/]\u000eY<\t\u0017$C.kF~01b\u0002*@C", "", "u(E", " @C\u0016B&\n$\u0013RtO\bcx\u000f", "", " @C\u0016B&\rMfxk:\u0013lh", "\"@6", "", "@dP0gsGO(\u0003\f^sz\u00057e\r$CF\u0005&\u0011To\u0015<r35"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.rncamerakit.CKCamera$capture$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я!\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007|jAӄld߉4Ziճ?k*3li2q[;\u0004\u001b.&\u0017Qfg\u0016q\u0011nSQ\u001d\n.x\u0019-yY\u0007b*\u000f`H6SݵQv"}, d2 = {"1n\\{e5<O!~\bZ2\u0001\u0018xCe\u0006wH\u0001$\u0013\u0006m\nG\u00065BY<k", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jz\u001fCq\u000e\u001ar0Di\u000b uW\u001f\u0012U?=k\"\u001a&h`\u0017\u0003j3Kr%M\"", "=m4?e6K", "", "3w", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jz\u001fCq\u000e\u001ar0Di\u000b \u0017\u0001\u0014.XR?u=s", "=m8:T.>A\u0015\u0010z]", "=tc=h;", "\u001a`]1e6BR,HxZ4|\u0016+/}2\t@Jz\u001fCq\u000e\u001ar0Di\u000b uW&=XSJL8%\u0015UaG\u0017j;\\L", "@dP0gsGO(\u0003\f^sz\u00057e\r$CF\u0005&\u0011To\u0015<r35"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements ImageCapture.OnImageSavedCallback {
        final /* synthetic */ File $outputFile;
        final /* synthetic */ String $outputPath;
        final /* synthetic */ CKCamera this$0;

        AnonymousClass1(File file, String str, CKCamera cKCamera) {
            file = file;
            str = str;
            cKCamera = cKCamera;
        }

        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
        public void onError(ImageCaptureException ex) {
            Intrinsics.checkNotNullParameter(ex, "ex");
            String str = "CameraView: Photo capture failed: " + ex.getMessage();
            promise.reject("E_CAPTURE_FAILED", "takePicture failed: " + ex.getMessage());
        }

        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
        public void onImageSaved(ImageCapture.OutputFileResults output) {
            Intrinsics.checkNotNullParameter(output, "output");
            try {
                Uri savedUri = output.getSavedUri();
                if (savedUri == null) {
                    savedUri = Uri.fromFile(file);
                }
                String path = savedUri != null ? savedUri.getPath() : null;
                String lastPathSegment = savedUri != null ? savedUri.getLastPathSegment() : null;
                String path2 = savedUri != null ? savedUri.getPath() : null;
                Comparable savedUri2 = output.getSavedUri();
                if (savedUri2 == null) {
                    savedUri2 = str;
                }
                String string = savedUri2.toString();
                cKCamera.onPictureTaken(string);
                String str = "CameraView: Photo capture succeeded: " + string;
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("uri", savedUri.toString());
                writableMapCreateMap.putString("id", path);
                writableMapCreateMap.putString("name", lastPathSegment);
                writableMapCreateMap.putInt("width", cKCamera.getWidth());
                writableMapCreateMap.putInt("height", cKCamera.getHeight());
                writableMapCreateMap.putString("path", path2);
                writableMapCreateMap.putDouble(RRWebVideoEvent.JsonKeys.SIZE, new File(path2).length());
                promise.resolve(writableMapCreateMap);
            } catch (Exception e2) {
                String str2 = "Error while saving or decoding saved photo: " + e2.getMessage();
                promise.reject("E_ON_IMG_SAVED", "Error while reading saved photo: " + e2.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.rncamerakit.CKCamera$flashViewFinder$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0019\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007ӬT\u0011Մ\rn\u0001ˎ`D\u0014Gv`a*'k*5T_2s[;\u0004\u001dD6߄SR"}, d2 = {"1n\\{e5<O!~\bZ2\u0001\u0018xCe\u0006wH\u0001$\u0013\u0006p\u00158\u0005(&]}2\u0018q\u001f-MPy7", "\u001a`]1e6BRbz\u0004b4x\u00183o\tqWI\u0005\u001f\u0013Vy\u001b#z3DY\u0007 DI\u0015*XR;x\n", "=m0;\\4:b\u001d\t\u0004>5{", "", "/mX:T;B]\"", "\u001a`]1e6BRbz\u0004b4x\u00183o\tqWI\u0005\u001f\u0013Vy\u001b\u0012", "@dP0gsGO(\u0003\f^sz\u00057e\r$CF\u0005&\u0011To\u0015<r35"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class C11671 extends AnimatorListenerAdapter {
        C11671() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            CKCamera.this.effectLayer.animate().alpha(0.0f).setDuration(CKCamera.this.shutterAnimationDuration);
        }
    }

    /* JADX INFO: renamed from: com.rncamerakit.CKCamera$installHierarchyFitter$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001b\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007\"2\u0013 \u0006߿pAFǏ\u0016H\\Q\u001cD\u001dk\u00144R\\TwQ=m\u001c\u0014!7R~murb\\!B=\t\\\r3FWZ\u0011]@\u0010bH}AKO\u0006<gc%<\u0013$J$Nx3\u0004`>У\u0014|"}, d2 = {"1n\\{e5<O!~\bZ2\u0001\u0018xCe\u0006wH\u0001$\u0013\u0006s\u0017J\u0006!<``$7z\u0012;KFOL8-$hnwR", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"U1xp@v21f{#KK\u0019*VE;R8,$hj9\u00149", "=m25\\3=D\u001d~\r:+{\t.", "", ">`a2a;", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "1gX9W", "=m25\\3=D\u001d~\rK,\u0005\u0013@e~", "@dP0gsGO(\u0003\f^sz\u00057e\r$CF\u0005&\u0011To\u0015<r35"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class ViewGroupOnHierarchyChangeListenerC11681 implements ViewGroup.OnHierarchyChangeListener {
        ViewGroupOnHierarchyChangeListenerC11681() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view != null) {
                view.measure(View.MeasureSpec.makeMeasureSpec(CKCamera.this.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(CKCamera.this.getMeasuredHeight(), 1073741824));
            }
            if (view != null) {
                view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CKCamera(ThemedReactContext themedReactContext) throws Throwable {
        Intrinsics.checkNotNullParameter(themedReactContext, C1593ug.zd("\t\u0016\u0016\u001d\u000f# ", (short) (C1580rY.Xd() ^ (-30754)), (short) (C1580rY.Xd() ^ (-27153))));
        ThemedReactContext themedReactContext2 = themedReactContext;
        super(themedReactContext2);
        this.currentContext = themedReactContext;
        this.viewFinder = new PreviewView(themedReactContext2);
        this.rectOverlay = new RectOverlay(themedReactContext2);
        Object[] objArr = new Object[0];
        Method declaredMethod = Class.forName(C1561oA.od("}s\bq=\u0004\u0002uw8lwuizvugot-Cua^omgii", (short) (Od.Xd() ^ (-4587)))).getDeclaredMethod(C1561oA.Kd("$\u001c/\f#)#)#\u0013(3'$(\n>,+>>:>", (short) (C1633zX.Xd() ^ (-19280))), new Class[0]);
        try {
            declaredMethod.setAccessible(true);
            ExecutorService executorService = (ExecutorService) declaredMethod.invoke(null, objArr);
            Intrinsics.checkNotNullExpressionValue(executorService, Wg.Zd("C\u0007[\u0010hB|Zu1\u0018j1mGl\u0017K\u0010v<\bQ\\\u0005Q$g", (short) (C1607wl.Xd() ^ 20149), (short) (C1607wl.Xd() ^ 22040)));
            this.cameraExecutor = executorService;
            this.shutterAnimationDuration = 50;
            this.shutterPhotoSound = true;
            this.effectLayer = new View(themedReactContext2);
            this.lensType = 1;
            String strXd = C1561oA.Xd("==", (short) (C1633zX.Xd() ^ (-10099)));
            this.autoFocus = strXd;
            this.zoomMode = strXd;
            this.zoomStartedAt = 1.0f;
            this.scanThrottleDelay = 2000L;
            this.frameColor = -16711936;
            this.laserColor = SupportMenu.CATEGORY_MASK;
            this.viewFinder.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
            this.viewFinder.setFocusableInTouchMode(true);
            this.viewFinder.requestFocusFromTouch();
            installHierarchyFitter(this.viewFinder);
            addView(this.viewFinder);
            this.effectLayer.setAlpha(0.0f);
            this.effectLayer.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            addView(this.effectLayer);
            addView(this.rectOverlay);
        } catch (InvocationTargetException e2) {
            throw e2.getCause();
        }
    }

    private final int aspectRatio(int i2, int i3) {
        double dMax = ((double) Math.max(i2, i3)) / ((double) Math.min(i2, i3));
        return Math.abs(dMax - RATIO_4_3_VALUE) <= Math.abs(dMax - RATIO_16_9_VALUE) ? 0 : 1;
    }

    private final void bindCameraUseCases() {
        if (this.viewFinder.getDisplay() == null) {
            return;
        }
        int width = this.viewFinder.getWidth();
        int height = this.viewFinder.getHeight();
        String str = "Preview dimensions: " + width + " x " + height;
        int iAspectRatio = aspectRatio(width, height);
        String str2 = "Preview aspect ratio: " + iAspectRatio;
        int rotation = this.viewFinder.getDisplay().getRotation();
        ProcessCameraProvider processCameraProvider = this.cameraProvider;
        if (processCameraProvider == null) {
            throw new IllegalStateException("Camera initialization failed.");
        }
        CameraSelector cameraSelectorBuild = new CameraSelector.Builder().requireLensFacing(this.lensType).build();
        Intrinsics.checkNotNullExpressionValue(cameraSelectorBuild, "build(...)");
        this.preview = new Preview.Builder().setTargetAspectRatio(iAspectRatio).setTargetRotation(rotation).build();
        this.imageCapture = new ImageCapture.Builder().setCaptureMode(1).setTargetAspectRatio(iAspectRatio).setTargetRotation(rotation).build();
        this.imageAnalyzer = new ImageAnalysis.Builder().setBackpressureStrategy(0).setTargetAspectRatio(iAspectRatio).build();
        List listMutableListOf = CollectionsKt.mutableListOf(this.preview, this.imageCapture);
        if (this.scanBarcode) {
            QRCodeAnalyzer qRCodeAnalyzer = new QRCodeAnalyzer(new Function2<List<? extends Barcode>, Size, Unit>() { // from class: com.rncamerakit.CKCamera$bindCameraUseCases$analyzer$1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends Barcode> list, Size size) {
                    invoke2(list, size);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<? extends Barcode> barcodes, Size imageSize) {
                    boolean zContains;
                    Intrinsics.checkNotNullParameter(barcodes, "barcodes");
                    Intrinsics.checkNotNullParameter(imageSize, "imageSize");
                    if (barcodes.isEmpty()) {
                        return;
                    }
                    Set setConvertAllowedBarcodeTypes = this.this$0.convertAllowedBarcodeTypes();
                    if (!setConvertAllowedBarcodeTypes.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : barcodes) {
                            if (setConvertAllowedBarcodeTypes.contains(Integer.valueOf(((Barcode) obj).getFormat()))) {
                                arrayList.add(obj);
                            }
                        }
                        barcodes = arrayList;
                    }
                    if (barcodes.isEmpty()) {
                        return;
                    }
                    BarcodeFrame barcodeFrame = this.this$0.barcodeFrame;
                    PreviewView previewView = this.this$0.viewFinder;
                    if (barcodeFrame == null) {
                        this.this$0.onBarcodeRead(barcodes);
                        return;
                    }
                    Rect frameRect = barcodeFrame.getFrameRect();
                    float width2 = previewView.getWidth() / imageSize.getHeight();
                    float height2 = previewView.getHeight() / imageSize.getWidth();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : barcodes) {
                        Rect boundingBox = ((Barcode) obj2).getBoundingBox();
                        if (boundingBox == null) {
                            zContains = false;
                        } else {
                            Intrinsics.checkNotNull(boundingBox);
                            zContains = frameRect.contains(new Rect((int) (boundingBox.left * width2), (int) (boundingBox.top * height2), (int) (boundingBox.right * width2), (int) (boundingBox.bottom * height2)));
                        }
                        if (zContains) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = arrayList2;
                    if (arrayList3.isEmpty()) {
                        return;
                    }
                    this.this$0.onBarcodeRead(arrayList3);
                }
            }, this.scanThrottleDelay);
            ImageAnalysis imageAnalysis = this.imageAnalyzer;
            Intrinsics.checkNotNull(imageAnalysis);
            imageAnalysis.setAnalyzer(this.cameraExecutor, qRCodeAnalyzer);
            listMutableListOf.add(this.imageAnalyzer);
        }
        processCameraProvider.unbindAll();
        try {
            Activity activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            UseCase[] useCaseArr = (UseCase[]) listMutableListOf.toArray(new UseCase[0]);
            Camera cameraBindToLifecycle = processCameraProvider.bindToLifecycle((AppCompatActivity) activity, cameraSelectorBuild, (UseCase[]) Arrays.copyOf(useCaseArr, useCaseArr.length));
            this.camera = cameraBindToLifecycle;
            resetZoom(cameraBindToLifecycle);
            Preview preview = this.preview;
            if (preview != null) {
                preview.setSurfaceProvider(this.viewFinder.getSurfaceProvider());
            }
        } catch (Exception e2) {
            int surfaceId = UIManagerHelper.getSurfaceId(this.currentContext);
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.currentContext, getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new ErrorEvent(surfaceId, getId(), e2.getMessage()));
            }
        }
    }

    public final Set<Integer> convertAllowedBarcodeTypes() {
        CodeFormat[] codeFormatArr = this.allowedBarcodeTypes;
        if (codeFormatArr != null) {
            ArrayList arrayList = new ArrayList(codeFormatArr.length);
            for (CodeFormat codeFormat : codeFormatArr) {
                arrayList.add(Integer.valueOf(codeFormat.toBarcodeType()));
            }
            Set<Integer> set = CollectionsKt.toSet(arrayList);
            if (set != null) {
                return set;
            }
        }
        return SetsKt.emptySet();
    }

    private final int convertDeviceHeightToSupportedAspectRatio(int i2, int i3) {
        return (((float) (i3 / i2)) > 1.7777778f ? Float.valueOf(i2 * 1.7777778f) : Integer.valueOf(i3)).intValue();
    }

    private final void flashViewFinder() {
        if (this.shutterAnimationDuration == 0) {
            return;
        }
        this.effectLayer.animate().alpha(1.0f).setDuration(this.shutterAnimationDuration).setListener(new AnimatorListenerAdapter() { // from class: com.rncamerakit.CKCamera.flashViewFinder.1
            C11671() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                CKCamera.this.effectLayer.animate().alpha(0.0f).setDuration(CKCamera.this.shutterAnimationDuration);
            }
        }).start();
    }

    private final void focusOnPoint(Float f2, Float f3) {
        CameraControl cameraControl;
        CameraControl cameraControl2;
        if (f2 == null || f3 == null) {
            Camera camera = this.camera;
            if (camera == null || (cameraControl = camera.getCameraControl()) == null) {
                return;
            }
            cameraControl.cancelFocusAndMetering();
            return;
        }
        MeteringPointFactory meteringPointFactory = this.viewFinder.getMeteringPointFactory();
        Intrinsics.checkNotNullExpressionValue(meteringPointFactory, "getMeteringPointFactory(...)");
        FocusMeteringAction.Builder builder = new FocusMeteringAction.Builder(meteringPointFactory.createPoint(f2.floatValue(), f3.floatValue()));
        if (Intrinsics.areEqual(this.autoFocus, DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
            builder.disableAutoCancel();
        }
        Camera camera2 = this.camera;
        if (camera2 != null && (cameraControl2 = camera2.getCameraControl()) != null) {
            cameraControl2.startFocusAndMetering(builder.build());
        }
        float f4 = 75;
        this.rectOverlay.drawRectBounds(CollectionsKt.listOf(new RectF(f2.floatValue() - f4, f3.floatValue() - f4, f2.floatValue() + f4, f3.floatValue() + f4)));
    }

    private final Activity getActivity() {
        Activity currentActivity = this.currentContext.getCurrentActivity();
        Intrinsics.checkNotNull(currentActivity);
        return currentActivity;
    }

    public final double getValidZoom(Camera camera, double d2) {
        CameraInfo cameraInfo;
        LiveData<ZoomState> zoomState;
        ZoomState value;
        CameraInfo cameraInfo2;
        LiveData<ZoomState> zoomState2;
        ZoomState value2;
        Double dValueOf = null;
        Double dValueOf2 = (camera == null || (cameraInfo2 = camera.getCameraInfo()) == null || (zoomState2 = cameraInfo2.getZoomState()) == null || (value2 = zoomState2.getValue()) == null) ? null : Double.valueOf(value2.getMinZoomRatio());
        if (camera != null && (cameraInfo = camera.getCameraInfo()) != null && (zoomState = cameraInfo.getZoomState()) != null && (value = zoomState.getValue()) != null) {
            dValueOf = Double.valueOf(value.getMaxZoomRatio());
        }
        Double d3 = this.maxZoom;
        if (d3 != null && d3.doubleValue() > -1.0d) {
            dValueOf = Double.valueOf(Math.min(dValueOf != null ? dValueOf.doubleValue() : d3.doubleValue(), d3.doubleValue()));
        }
        if (dValueOf != null) {
            d2 = Math.min(d2, dValueOf.doubleValue());
        }
        return dValueOf2 != null ? Math.max(d2, dValueOf2.doubleValue()) : d2;
    }

    private final boolean hasPermissions() {
        String[] strArr = {"android.permission.CAMERA"};
        if (ContextCompat.checkSelfPermission(getContext(), "android.permission.CAMERA") == 0) {
            return true;
        }
        ActivityCompat.requestPermissions(getActivity(), strArr, 42);
        return false;
    }

    private final void installHierarchyFitter(ViewGroup viewGroup) {
        if (getContext() instanceof ThemedReactContext) {
            viewGroup.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.rncamerakit.CKCamera.installHierarchyFitter.1
                ViewGroupOnHierarchyChangeListenerC11681() {
                }

                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public void onChildViewAdded(View view, View view2) {
                    if (view != null) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(CKCamera.this.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(CKCamera.this.getMeasuredHeight(), 1073741824));
                    }
                    if (view != null) {
                        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    }
                }

                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public void onChildViewRemoved(View view, View view2) {
                }
            });
        }
    }

    public static final void onAttachedToWindow$lambda$0(CKCamera this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setupCamera();
    }

    public final void onBarcodeRead(List<? extends Barcode> list) {
        CodeFormat codeFormatFromBarcodeType = CodeFormat.Companion.fromBarcodeType(((Barcode) CollectionsKt.first((List) list)).getFormat());
        int surfaceId = UIManagerHelper.getSurfaceId(this.currentContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.currentContext, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new ReadCodeEvent(surfaceId, getId(), ((Barcode) CollectionsKt.first((List) list)).getRawValue(), codeFormatFromBarcodeType.getCode()));
        }
    }

    private final void onCaptureButtonPressIn(int i2) {
        int surfaceId = UIManagerHelper.getSurfaceId(this.currentContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.currentContext, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new CaptureButtonPressInEvent(surfaceId, getId(), i2));
        }
    }

    private final void onCaptureButtonPressOut(int i2) {
        int surfaceId = UIManagerHelper.getSurfaceId(this.currentContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.currentContext, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new CaptureButtonPressOutEvent(surfaceId, getId(), i2));
        }
    }

    public final void onOrientationChange(int i2) {
        int i3;
        if (i2 != 0) {
            i3 = 1;
            if (i2 != 1) {
                i3 = 2;
                if (i2 != 2) {
                    i3 = 3;
                    if (i2 != 3) {
                        String str = "CameraView: Unknown device orientation detected: " + i2;
                        return;
                    }
                }
            }
        } else {
            i3 = 0;
        }
        int surfaceId = UIManagerHelper.getSurfaceId(this.currentContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.currentContext, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new OrientationChangeEvent(surfaceId, getId(), i3));
        }
    }

    public final void onPictureTaken(String str) {
        int surfaceId = UIManagerHelper.getSurfaceId(this.currentContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.currentContext, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new PictureTakenEvent(surfaceId, getId(), str));
        }
    }

    public final void onZoom(Double d2) {
        CameraInfo cameraInfo;
        LiveData<ZoomState> zoomState;
        ZoomState value;
        Camera camera = this.camera;
        if (camera == null || (cameraInfo = camera.getCameraInfo()) == null || (zoomState = cameraInfo.getZoomState()) == null || (value = zoomState.getValue()) == null) {
            return;
        }
        double zoomRatio = value.getZoomRatio();
        if (d2 != null) {
            zoomRatio = d2.doubleValue();
        }
        if (d2 == null || zoomRatio != this.lastOnZoom) {
            this.lastOnZoom = zoomRatio;
            int surfaceId = UIManagerHelper.getSurfaceId(this.currentContext);
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.currentContext, getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new ZoomEvent(surfaceId, getId(), zoomRatio));
            }
        }
    }

    private final void resetZoom(Camera camera) {
        double validZoom = getValidZoom(camera, 1.0d);
        Double d2 = this.zoom;
        if (d2 != null) {
            validZoom = getValidZoom(camera, d2.doubleValue());
        }
        setZoomFor(camera, validZoom);
        onZoom(Double.valueOf(validZoom));
    }

    public static /* synthetic */ void setAutoFocus$default(CKCamera cKCamera, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "on";
        }
        cKCamera.setAutoFocus(str);
    }

    public static /* synthetic */ void setCameraType$default(CKCamera cKCamera, String str, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 1)) != 0) {
            str = "back";
        }
        cKCamera.setCameraType(str);
    }

    private final void setZoomFor(Camera camera, double d2) {
        camera.getCameraControl().setZoomRatio((float) d2);
    }

    private final void setupCamera() {
        final ListenableFuture<ProcessCameraProvider> companion = ProcessCameraProvider.Companion.getInstance(getActivity());
        companion.addListener(new Runnable() { // from class: com.rncamerakit.CKCamera$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                CKCamera.setupCamera$lambda$2(this.f$0, companion);
            }
        }, ContextCompat.getMainExecutor(getActivity()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupCamera$lambda$2(final CKCamera this$0, ListenableFuture cameraProviderFuture) {
        String message;
        Throwable cause;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(cameraProviderFuture, "$cameraProviderFuture");
        try {
            this$0.cameraProvider = (ProcessCameraProvider) cameraProviderFuture.get();
            final Context context = this$0.getContext();
            OrientationEventListener orientationEventListener = new OrientationEventListener(context) { // from class: com.rncamerakit.CKCamera$setupCamera$1$1
                @Override // android.view.OrientationEventListener
                public void onOrientationChanged(int i2) {
                    ImageCapture imageCapture = this.this$0.imageCapture;
                    if (imageCapture == null) {
                        return;
                    }
                    int targetRotation = imageCapture.getTargetRotation();
                    if (i2 >= 315 || i2 < 45) {
                        targetRotation = 0;
                    } else if (225 <= i2 && i2 < 315) {
                        targetRotation = 1;
                    } else if (135 <= i2 && i2 < 225) {
                        targetRotation = 2;
                    } else if (45 <= i2 && i2 < 135) {
                        targetRotation = 3;
                    }
                    if (targetRotation != imageCapture.getTargetRotation()) {
                        imageCapture.setTargetRotation(targetRotation);
                        this.this$0.onOrientationChange(targetRotation);
                    }
                }
            };
            this$0.orientationListener = orientationEventListener;
            Intrinsics.checkNotNull(orientationEventListener);
            orientationEventListener.enable();
            final ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(this$0.getContext(), new ScaleGestureDetector.SimpleOnScaleGestureListener() { // from class: com.rncamerakit.CKCamera$setupCamera$1$scaleDetector$1
                @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
                public boolean onScale(ScaleGestureDetector detector) {
                    Camera camera;
                    Intrinsics.checkNotNullParameter(detector, "detector");
                    if (Intrinsics.areEqual(this.this$0.zoomMode, DebugKt.DEBUG_PROPERTY_VALUE_OFF) || (camera = this.this$0.camera) == null) {
                        return true;
                    }
                    double validZoom = this.this$0.getValidZoom(camera, this.this$0.zoomStartedAt * (detector.getCurrentSpan() / this.this$0.pinchGestureStartedAt));
                    Double dValueOf = Double.valueOf(validZoom);
                    ZoomState value = camera.getCameraInfo().getZoomState().getValue();
                    if (!Intrinsics.areEqual(dValueOf, value != null ? Float.valueOf(value.getZoomRatio()) : -1)) {
                        if (this.this$0.zoom == null) {
                            camera.getCameraControl().setZoomRatio((float) validZoom);
                        }
                        this.this$0.onZoom(Double.valueOf(validZoom));
                    }
                    return true;
                }

                @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
                public boolean onScaleBegin(ScaleGestureDetector detector) {
                    CameraInfo cameraInfo;
                    LiveData<ZoomState> zoomState;
                    ZoomState value;
                    Intrinsics.checkNotNullParameter(detector, "detector");
                    Camera camera = this.this$0.camera;
                    if (camera == null || (cameraInfo = camera.getCameraInfo()) == null || (zoomState = cameraInfo.getZoomState()) == null || (value = zoomState.getValue()) == null) {
                        return false;
                    }
                    this.this$0.zoomStartedAt = value.getZoomRatio();
                    this.this$0.pinchGestureStartedAt = detector.getCurrentSpan();
                    return true;
                }
            });
            this$0.viewFinder.setOnTouchListener(new View.OnTouchListener() { // from class: com.rncamerakit.CKCamera$$ExternalSyntheticLambda1
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return CKCamera.setupCamera$lambda$2$lambda$1(scaleGestureDetector, this$0, view, motionEvent);
                }
            });
            this$0.bindCameraUseCases();
        } catch (Exception e2) {
            Throwable cause2 = e2.getCause();
            if (cause2 == null || (cause = cause2.getCause()) == null || (message = cause.getMessage()) == null) {
                Throwable cause3 = e2.getCause();
                message = cause3 != null ? cause3.getMessage() : null;
                if (message == null && (message = e2.getMessage()) == null) {
                    message = "Camera initialization failed";
                }
            }
            String str = "Camera initialization failed: " + message;
            int surfaceId = UIManagerHelper.getSurfaceId(this$0.currentContext);
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this$0.currentContext, this$0.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(new ErrorEvent(surfaceId, this$0.getId(), message));
            }
        }
    }

    public static final boolean setupCamera$lambda$2$lambda$1(ScaleGestureDetector scaleDetector, CKCamera this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(scaleDetector, "$scaleDetector");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (motionEvent.getAction() != 1) {
            return scaleDetector.onTouchEvent(motionEvent);
        }
        this$0.focusOnPoint(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
        return true;
    }

    public final void capture(Map<String, ? extends Object> map, Promise promise) throws Throwable {
        Intrinsics.checkNotNullParameter(map, Wg.vd("\u0017\u0019\u001e\u0014\u001b\u001b!", (short) (C1580rY.Xd() ^ (-31722))));
        Intrinsics.checkNotNullParameter(promise, Qg.kd("\u0014\u0015\u0011\u000e\t\u0012\u0003", (short) (FB.Xd() ^ 26828), (short) (FB.Xd() ^ 2645)));
        String canonicalPath = this.outputPath;
        if (canonicalPath != null) {
            Intrinsics.checkNotNull(canonicalPath);
        } else {
            Context context = getContext();
            Object[] objArr = new Object[0];
            Method method = Class.forName(hg.Vd("\u0013\u001f\u0014!\u001d\u0016\u0010X\r\u0018\u0016\u001b\u000b\u0013\u0018Pd\u0010\u000e\u0013\u0003\u0015\u0010", (short) (FB.Xd() ^ 30158), (short) (FB.Xd() ^ 24776))).getMethod(C1561oA.ud("sp~LijnjHlt", (short) (C1607wl.Xd() ^ 21045)), new Class[0]);
            try {
                method.setAccessible(true);
                File fileCreateTempFile = File.createTempFile(C1561oA.yd(",5.-=", (short) (C1607wl.Xd() ^ 8250)), C1561oA.Yd("R\u0010\u0017\u000f", (short) (Od.Xd() ^ (-28591))), (File) method.invoke(context, objArr));
                fileCreateTempFile.deleteOnExit();
                canonicalPath = fileCreateTempFile.getCanonicalPath();
                Intrinsics.checkNotNull(canonicalPath);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
        File file = new File(canonicalPath);
        ImageCapture.OutputFileOptions outputFileOptionsBuild = new ImageCapture.OutputFileOptions.Builder(file).build();
        Intrinsics.checkNotNullExpressionValue(outputFileOptionsBuild, Xg.qd("u\n~\u0003{@GHIE", (short) (Od.Xd() ^ (-2575)), (short) (Od.Xd() ^ (-10598))));
        flashViewFinder();
        if (this.shutterPhotoSound) {
            Object systemService = getActivity().getSystemService(Jg.Wd("RP\u0001q9", (short) (C1580rY.Xd() ^ (-9620)), (short) (C1580rY.Xd() ^ (-3093))));
            short sXd = (short) (OY.Xd() ^ 10167);
            short sXd2 = (short) (OY.Xd() ^ 13255);
            int[] iArr = new int["-!\u0019\u001c\fetw \u000b,\u0006w4mO\u001f\u0004\u0007x$\u0001W\rC1*9&FD\u0003X`$8\u001d\u001c\"IT\u000bG\u0018J0\u0006\u0007ro\u0018X\\[lKeEMG'!\u001c".length()];
            QB qb = new QB("-!\u0019\u001c\fetw \u000b,\u0006w4mO\u001f\u0004\u0007x$\u0001W\rC1*9&FD\u0003X`$8\u001d\u001c\"IT\u000bG\u0018J0\u0006\u0007ro\u0018X\\[lKeEMG'!\u001c");
            int i2 = 0;
            while (qb.YK()) {
                int iKK = qb.KK();
                Xu xuXd = Xu.Xd(iKK);
                iArr[i2] = xuXd.fK(xuXd.CK(iKK) - (C1561oA.Xd[i2 % C1561oA.Xd.length] ^ ((i2 * sXd2) + sXd)));
                i2++;
            }
            Intrinsics.checkNotNull(systemService, new String(iArr, 0, i2));
            if (((AudioManager) systemService).getRingerMode() == 2) {
                new MediaActionSound().play(0);
            }
        }
        ImageCapture imageCapture = this.imageCapture;
        if (imageCapture != null) {
            imageCapture.m172lambda$takePicture$2$androidxcameracoreImageCapture(outputFileOptionsBuild, ContextCompat.getMainExecutor(getActivity()), new ImageCapture.OnImageSavedCallback() { // from class: com.rncamerakit.CKCamera.capture.1
                final /* synthetic */ File $outputFile;
                final /* synthetic */ String $outputPath;
                final /* synthetic */ CKCamera this$0;

                AnonymousClass1(File file2, String canonicalPath2, CKCamera this) {
                    file = file2;
                    str = canonicalPath2;
                    cKCamera = this;
                }

                @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
                public void onError(ImageCaptureException ex) {
                    Intrinsics.checkNotNullParameter(ex, "ex");
                    String str = "CameraView: Photo capture failed: " + ex.getMessage();
                    promise.reject("E_CAPTURE_FAILED", "takePicture failed: " + ex.getMessage());
                }

                @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
                public void onImageSaved(ImageCapture.OutputFileResults output) {
                    Intrinsics.checkNotNullParameter(output, "output");
                    try {
                        Uri savedUri = output.getSavedUri();
                        if (savedUri == null) {
                            savedUri = Uri.fromFile(file);
                        }
                        String path = savedUri != null ? savedUri.getPath() : null;
                        String lastPathSegment = savedUri != null ? savedUri.getLastPathSegment() : null;
                        String path2 = savedUri != null ? savedUri.getPath() : null;
                        Comparable savedUri2 = output.getSavedUri();
                        if (savedUri2 == null) {
                            savedUri2 = str;
                        }
                        String string = savedUri2.toString();
                        cKCamera.onPictureTaken(string);
                        String str = "CameraView: Photo capture succeeded: " + string;
                        WritableMap writableMapCreateMap = Arguments.createMap();
                        writableMapCreateMap.putString("uri", savedUri.toString());
                        writableMapCreateMap.putString("id", path);
                        writableMapCreateMap.putString("name", lastPathSegment);
                        writableMapCreateMap.putInt("width", cKCamera.getWidth());
                        writableMapCreateMap.putInt("height", cKCamera.getHeight());
                        writableMapCreateMap.putString("path", path2);
                        writableMapCreateMap.putDouble(RRWebVideoEvent.JsonKeys.SIZE, new File(path2).length());
                        promise.resolve(writableMapCreateMap);
                    } catch (Exception e22) {
                        String str2 = "Error while saving or decoding saved photo: " + e22.getMessage();
                        promise.reject("E_ON_IMG_SAVED", "Error while reading saved photo: " + e22.getMessage());
                    }
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Integer numValueOf = keyEvent != null ? Integer.valueOf(keyEvent.getKeyCode()) : null;
        Integer numValueOf2 = keyEvent != null ? Integer.valueOf(keyEvent.getAction()) : null;
        if ((numValueOf != null && numValueOf.intValue() == 27) || ((numValueOf != null && numValueOf.intValue() == 25) || (numValueOf != null && numValueOf.intValue() == 24))) {
            if (numValueOf2 != null && numValueOf2.intValue() == 0) {
                onCaptureButtonPressIn(numValueOf.intValue());
                return true;
            }
            if (numValueOf2 != null && numValueOf2.intValue() == 1) {
                onCaptureButtonPressOut(numValueOf.intValue());
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (hasPermissions()) {
            this.viewFinder.post(new Runnable() { // from class: com.rncamerakit.CKCamera$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    CKCamera.onAttachedToWindow$lambda$0(this.f$0);
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.cameraExecutor.shutdown();
        OrientationEventListener orientationEventListener = this.orientationListener;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        ProcessCameraProvider processCameraProvider = this.cameraProvider;
        if (processCameraProvider != null) {
            processCameraProvider.unbindAll();
        }
    }

    public final void setAllowedBarcodeTypes(ReadableArray readableArray) {
        CodeFormat codeFormatFromName;
        if (readableArray == null || readableArray.size() == 0) {
            this.allowedBarcodeTypes = new CodeFormat[0];
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            String string = readableArray.getString(i2);
            if (string != null && (codeFormatFromName = CodeFormat.Companion.fromName(string)) != null) {
                arrayList.add(codeFormatFromName);
            }
        }
        this.allowedBarcodeTypes = (CodeFormat[]) arrayList.toArray(new CodeFormat[0]);
    }

    public final void setAutoFocus(String mode) {
        Camera camera;
        CameraControl cameraControl;
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.autoFocus = mode;
        if (!Intrinsics.areEqual(mode, "on") || (camera = this.camera) == null || (cameraControl = camera.getCameraControl()) == null) {
            return;
        }
        cameraControl.cancelFocusAndMetering();
    }

    public final void setBarcodeFrameSize(Size size) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.barcodeFrameSize = size;
        BarcodeFrame barcodeFrame = this.barcodeFrame;
        if (barcodeFrame != null) {
            Intrinsics.checkNotNull(barcodeFrame);
            barcodeFrame.setFrameSize(size);
        }
    }

    public final void setCameraType(String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i2 = !Intrinsics.areEqual(type, "front") ? 1 : 0;
        boolean z2 = this.lensType != i2;
        this.lensType = i2;
        if (z2) {
            bindCameraUseCases();
        }
    }

    public final void setFlashMode(String str) {
        Camera camera;
        ImageCapture imageCapture = this.imageCapture;
        if (imageCapture == null || (camera = this.camera) == null) {
            return;
        }
        if (Intrinsics.areEqual(str, "on")) {
            camera.getCameraControl().enableTorch(false);
            imageCapture.setFlashMode(1);
        } else if (Intrinsics.areEqual(str, DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
            camera.getCameraControl().enableTorch(false);
            imageCapture.setFlashMode(2);
        } else {
            imageCapture.setFlashMode(0);
            camera.getCameraControl().enableTorch(false);
        }
    }

    public final void setFrameColor(int i2) {
        this.frameColor = i2;
        BarcodeFrame barcodeFrame = this.barcodeFrame;
        if (barcodeFrame != null) {
            Intrinsics.checkNotNull(barcodeFrame);
            barcodeFrame.setFrameColor(i2);
        }
    }

    public final void setLaserColor(int i2) {
        this.laserColor = i2;
        BarcodeFrame barcodeFrame = this.barcodeFrame;
        if (barcodeFrame != null) {
            Intrinsics.checkNotNull(barcodeFrame);
            barcodeFrame.setLaserColor(this.laserColor);
        }
    }

    public final void setMaxZoom(Double d2) {
        this.maxZoom = d2;
        setZoom(this.zoom);
    }

    public final void setOutputPath(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.outputPath = path;
    }

    public final void setScanBarcode(boolean z2) {
        boolean z3 = z2 != this.scanBarcode;
        this.scanBarcode = z2;
        if (z3) {
            bindCameraUseCases();
        }
    }

    public final void setScanThrottleDelay(int i2) {
        long j2 = i2 < 0 ? 2000L : i2;
        boolean z2 = this.scanThrottleDelay != j2 && this.scanBarcode;
        this.scanThrottleDelay = j2;
        if (z2) {
            bindCameraUseCases();
        }
    }

    public final void setShowFrame(boolean z2) {
        if (!z2) {
            BarcodeFrame barcodeFrame = this.barcodeFrame;
            if (barcodeFrame != null) {
                removeView(barcodeFrame);
                this.barcodeFrame = null;
                return;
            }
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BarcodeFrame barcodeFrame2 = new BarcodeFrame(context);
        this.barcodeFrame = barcodeFrame2;
        Intrinsics.checkNotNull(barcodeFrame2);
        barcodeFrame2.setFrameSize(this.barcodeFrameSize);
        convertDeviceHeightToSupportedAspectRatio(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
        BarcodeFrame barcodeFrame3 = this.barcodeFrame;
        Intrinsics.checkNotNull(barcodeFrame3);
        barcodeFrame3.setFrameColor(this.frameColor);
        BarcodeFrame barcodeFrame4 = this.barcodeFrame;
        Intrinsics.checkNotNull(barcodeFrame4);
        barcodeFrame4.setLaserColor(this.laserColor);
        BarcodeFrame barcodeFrame5 = this.barcodeFrame;
        Intrinsics.checkNotNull(barcodeFrame5, "null cannot be cast to non-null type android.view.View");
        barcodeFrame5.layout(0, 0, this.effectLayer.getWidth(), this.effectLayer.getHeight());
        addView(this.barcodeFrame);
    }

    public final void setShutterAnimationDuration(int i2) {
        this.shutterAnimationDuration = i2;
    }

    public final void setShutterPhotoSound(boolean z2) {
        this.shutterPhotoSound = z2;
    }

    public final void setTorchMode(String str) {
        Camera camera = this.camera;
        if (camera == null) {
            return;
        }
        if (Intrinsics.areEqual(str, "on")) {
            camera.getCameraControl().enableTorch(true);
        } else if (Intrinsics.areEqual(str, DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
            camera.getCameraControl().enableTorch(false);
        } else {
            camera.getCameraControl().enableTorch(false);
        }
    }

    public final void setZoom(Double d2) {
        this.zoom = d2;
        if (d2 != null) {
            double dDoubleValue = d2.doubleValue();
            Camera camera = this.camera;
            if (camera == null) {
                return;
            }
            setZoomFor(camera, getValidZoom(camera, dDoubleValue));
        }
    }

    public final void setZoomMode(String str) {
        if (str == null) {
            str = DebugKt.DEBUG_PROPERTY_VALUE_OFF;
        }
        this.zoomMode = str;
    }
}
