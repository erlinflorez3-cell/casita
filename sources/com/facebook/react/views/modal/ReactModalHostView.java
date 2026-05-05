package com.facebook.react.views.modal;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.exifinterface.media.ExifInterface;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.facebook.common.logging.FLog;
import com.facebook.react.R;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.JSPointerDispatcher;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.common.ContextUtils;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.WindowUtilKt;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1492Gx
@Metadata(bv = {}, d1 = {"Яē\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*,\u0018w\u000ffxE8DkL6Ri*\u0017k\u00025,[2zKП]\u001a\u0014\"\u0011OTion`Z\u0013¼\u0017\u0006,xr,O]\u0001](\u000f:BuB;M\u0006=A`z9\r H\"@y\u000b\n\"*V\u0010~ٙKK\"\u00128@\u0007:Z\rS\u0006\"\u0012\u0014D(\u0001$]oNLHt]@/+\u0003\u007fBV'e1\u0005M#F\\'\u0013\u000bg#A¨U\u0017E%\u0002\u00027R\n?;@S h)27/Wto6\u0007\u0002Џ\u0019+]\u0010&\u00114\u0018\u001dQ\u000fHW?]!c`\u001e*\bz*\u0019jBv\f7J>-HrfMy\t;kN\u0011\u001a^p<+gDX=\u0002I*g'\u0017Uo}1Ne?K!f)\u000f39[\u0003J'\u0015cb\u0006\u0017IQnMxR\u0018 Um28)\u0016r\u0012>\u0010\u0018/*M^\u001b3\u0001s9Qk2\u0016\u0011TuB\u001db~R\u0018^xD01.7XLRn\rj\u00138hT\u0007oWad\\\u0015K \u00156[&\u000bg%XT]8\u0002j{\u001aP7wjE*\u0007k<\u0014\u0002dA\u0007ic>\u001e\u0019\u000b\\EJ5\u001dX\u0015~\u001a #b6uJH\u0019L>\u0010\r|\u001agJ? Xd0?nt\u0015v\u0013NFOS!_\t,@\u0003b\u000b<\u0003\u0018g%\r\u000f)tp\u001e+)M:Vx\"[\u0005\u0018Ga6c|\u00014+_7\u0005\u0002A_ibFzx\\\n\u001e\n.q29\u007fkm\u0017\u001dAA20p\f`;s_**')9*\u0013IFFg6.7@)nX.l\u0017P3'x1g|\u007f(\u001e\rz\u0010ibks>w/IY\rtF\u0003\u001d!4$/tR\u0003C1[)3\u0015&\u0019mY8ӧuܓ2\u0006jχ>vk\u000b:k6qhZk<\fJWd\u0017>P0#C\u0019טl͎\fF!6\u0013@VO5|dGe\u000b]\u000e=\u00818ޛtVcƥc\u0012\fGFa@rq\u0010DdQ6)Oif\u001c\u007f\u0002\"I\u000beϟ\u0017֭5t\u001aΒU\"\\kp\u001e\u0001\u0012\u0002.NAiy[¸\u000bӺ8,Dފ[ib\u0002\u001e\u0012\u0011~tx?\u001d@Z\f=l\r\u0003\u0012\u0013\u001b\u0007I7ѫlՃ.\u000b\u0017\u001198\u0007PQ\u0007sbbL4T\u000fq5\tIz\u007f\u0003t)CD\u0003IYl/ۥ\u0017\u0558aOQ\u0379N\u0006MH{\f\u0010\u000e>9\u000b?\u00132)\\i\u0013uu^\u0003a٤p͒h\u0003\u001aצjP(N\r!\u001d\u0010B1\u001d3ii\u0001\u0019z/bM&a\u001aו\rӢH5\u000fљ\u0015eLF;2U/CvxBw\"e\u0003S\u007f\u001e\u001fNW4z/\fo\u0010|\t\fKpZ0Z9ն\u0015\u07b3T*\u001c0P&\u0001<N\n<\u0003\u0010gR5l\u000f\u0004wOPW/z\nZK\u0017\tH(C̠zό\u000f\u000fn۲n{tc^=))Se!z+R\u001f\f8X?\u0010jނ2̢:\u0014jϪ(Qi\"~\fo]\u0013e=\u000e˴e\u0016"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0016Fu!<#j 3k%\u0016WB7r\u0017(#wR=\u0007u\u0002", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7E=\u000e\u001b\u0016IoW#z&5W\u0012\u001e>mu?MLJR8,$hj9\u00149", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~H\u0001 ?m\u0015\u001bM?9z\u0012(\u001ewaL\u00169o?", "D`[BX", "", "/mX:T;B]\"m\u000fi,", "5dc\u000ea0FO(\u0003\u0005g\u001b\u0011\u0014/", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000ea0FO(\u0003\u0005g\u001b\u0011\u0014/", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "1n]AX5MD\u001d~\r", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "5dc\u0010b5MS\"\u000ekb,\u000f", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e\u0016", "1qT.g,'S+]~Z3\u0007\u000b", "", "\nrTA \u0006\u0017", "\u001a`]1e6BRbz\u0006iu[\r+l\n*Q", "2hP9b.", "5dc\u0011\\(E]\u001b", "u(;.a+K]\u001d}DZ7\bR\u000ei{/\u0006BV", "2hP9b.+]#\u000ekb,\u000fj<o\u00103", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0016Fu!<#j 3k%\u0016WB7r\u0017(#wR=\u0007uj-z#NVP\u0019f\\\u0002.\u0018\u0012lo[5\u001d\u0010/", "3uT;g\u000bBa$z\n\\/|\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\u0013\"#s]H\u0005f,[L", "5dc\u0012i,Gbw\u0003\ti(\f\u00072e\r", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#}17v%<\u0017#Lk=-sloD\u0003r*Qv4\u001d", "Adc\u0012i,Gbw\u0003\ti(\f\u00072e\r", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~Y\u000f @|$w-T;tC|\u0019vl5\u0016a/N\u0004|\u000b=", "6`a1j(KSt|x^3|\u0016+t\u007f'", "5dc\u0015T9=e\u0015\fz:*z\t6e\r$\u000b@\u007f", "u(I", "Adc\u0015T9=e\u0015\fz:*z\t6e\r$\u000b@\u007f", "uY\u0018#", "=mA2d<>a(\\\u0002h:|o3s\u000f(\u0005@\u000e", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0016Fu!<#j 3k%\u0016WB7r\u0017(#wR=\u0007uj8\u007f\u0014GX^,jaPD\u001e ZtR9\u001c\u0005bA1D", "5dc\u001ca\u0019>_)~\tm\n\u0004\u0013=ef,\nO\u0001 \u0017T", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ(\u001bG\u0002\u001c\u0006~/4U\u0005i$m\u0012,\\+Ej0%wroHwg,`5\u0011P9N8lR\u0001Lq\u0019d\u001cN\u0012\u0011\u0013hA-nQ\r", "Adc\u001ca\u0019>_)~\tm\n\u0004\u0013=ef,\nO\u0001 \u0017T", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0012\u001b\u0017Y}WD\u0001$1`G\r7i\u0014=5M:g;\u0001\u001fvp*\u000bc>\r`04LZ<\\`\u0002\u001b\u001b\u001ch\u000e5/\u001b\u0014YJ${\u001az\u0010", "=mB5b>%W'\u000ezg,\n", "\u001a`]1e6BRb|\u0005g;|\u0012>/^,wG\u000b\u0019zP~\u000eIw!3Y<\n@[\u00198_*?yC\u001e\u001ehn\u000f", "5dc\u001ca\u001aA]+e~l;|\u0012/r", "u(;.a+K]\u001d}D\\6\u0006\u0018/n\u000fqZD|\u001e!IS\u0017Kv26U{ uW\u001f\u001cPMMR8,$hj9\u00149", "Adc\u001ca\u001aA]+e~l;|\u0012/r", "uKP;W9HW\u0018Hxh5\f\t8tI\u0007\u007f<\b!\u0019+x\u001d<\u0004&1W}^!v\u00041WU\"oB-\u0015qaF\\'\u001d", "AsPAX\u001eKO$\nzk", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n#hy/7_#*XN;x\n", "5dc g(MS\u000b\fvi7|\u0016", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#k/3|\u0016 Z?Fv4+j", "Adc g(MS\u000b\fvi7|\u0016", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~G\r\u001cFm\b;INFkAsXY", "AsPAh:\u001bO&m\bZ5\u000b\u0010?c\u007f1\u000b", "5dc g(Mc'[vk\u001b\n\u00058s\u00078y@\n&", "Adc g(Mc'[vk\u001b\n\u00058s\u00078y@\n&", "BqP;f7:`\u0019\b\n", "5dc!e(Ga$z\b^5\f", "Adc!e(Ga$z\b^5\f", "/cS\u0010[0ER&~\u0004?6\nd-c\u007f6\nD}\u001b\u001eK~\"", "", "=tc\u0010[0ER&~\u0004", "\u001aiPCTuNb\u001d\u0006D:9\n\u0005CL\u00046\u000b\u0016", "\u001aj^A_0G\u001d\u0017\t\u0002e,z\u00183o\t6E\u001c\u000e$\u0013[V\u0012J\u0006z", "/cS#\\,P", "1gX9W", "7mS2k", "", "2hb:\\:L", "2hb=T;<V\u0004\t\u0006n3x\u0018/A}&{N\u000f\u001b\u0014Kv\u0012K\u000b\u0005FY\u0007/", "3uT;g", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROKE\u001e\u001ew7", "2hb=T;<V\u0004\f\u0005o0{\t\u001dt\r8yO\u0011$\u0017", "AsaBV;N`\u0019", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\u0016\u000bM\u0011\u0015&W|\u000e\u0012", "5dc\u0010[0ERt\u000e", "5dc\u0010[0ERv\t\u000bg;", "5dc\u0010h9KS\"\u000eV\\;\u0001\u001a3t\u0014", "\u001a`]1e6BRbz\u0006iuX\u0007>i\u0011,\u000bTV", "=m32g(<V\u0019}[k6\u0005z3n~2\u000e", "=m3?b7\"\\'\u000evg*|", "=m7<f;\u001dS'\u000e\bh@", "=m7<f;)O)\rz", "=m7<f;+S'\u000f\u0003^", "=m;.l6Nb", "1gP;Z,=", Global.COLON, "B", "@", AdkSettings.PLATFORM_TYPE_MOBILE, "@d\\<i,/W\u0019\u0011", "@d\\<i,/W\u0019\u0011Vm", "Adc\u0016W", "7c", "Ag^DB9.^\u0018z\n^", "CoS.g,)`#\nzk;\u0001\t=", "CoS.g,,g'\u000ezf\b\b\u0014/a\r$\u0005>\u0001", "\u0011n\\=T5B]\"", "\u0012hP9b.+]#\u000ekb,\u000fj<o\u00103", "\u001dmA2d<>a(\\\u0002h:|o3s\u000f(\u0005@\u000e", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ReactModalHostView extends ViewGroup implements LifecycleEventListener {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "ReactModalHost";
    private String animationType;
    private boolean createNewDialog;
    private Dialog dialog;
    private final DialogRootViewGroup dialogRootViewGroup;
    private boolean hardwareAccelerated;
    private OnRequestCloseListener onRequestCloseListener;
    private DialogInterface.OnShowListener onShowListener;
    private boolean statusBarTranslucent;
    private boolean transparent;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӯ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٨lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0016Fu!<#j 3k%\u0016WB7r\u0017(#wR=\u0007uj,\u0001/RHW0f[H", "", "u(E", "\"@6", "", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яh\u001d<K!&i\u0016DLc\u000b\u0004Iي8\u000bDB\u0007\"2\u0012\u007f\u0007|jA0JhP.hS2şs{J$cҕyCQU\"}(\nWN}gvJ`\u000eK\u000f\u0014\u001c\u0001j2I]xk\u0012\u0017˰JoM4UoC9htL\u0005(݅*8\u0010\u0005\t\u001a0H\u0018v\tLS\f\u0018=V\u0081jR;L5\u001a@\u0006~/\u0007Ȧlm\\7`ns9]%ɨmB\\*(>\u000bh%F\u0003C=zo;C@eS[9\u001c\u0019\u0015qs?1[\"A\u0013\t?'Yj$[Dz\u0018\u0014CN\u0016!&\t4\u0001\u001dQ\u000f(W/]\u0004cP<I(~\n/T\u0004<)m\\v;(\f \u000ea\u001b#WNw\u001a^p#Au~%3(K+gA\u0017Uob1Ne\u001fK!f1\u000f\u00189[\u00034\u0011\u0019){\u0010Q_t\u0007Q\u0011t\u0018\u0004Um2\r\u0013\u00068/HG.H,\u0015<C=7\nRS%y/`D\u0016\u00105dv\u0002\u0002RvYh\u0001^E88$Zr\u000b5o^{p,?pbiO\f\u0016C8\\&XQ)\u001e\u007fgh\u0018\u0011\u0014qR;=\u0019OY\u001d\b>[G\u0012K5\u007f|@e`+,?j{K]7\\a\u0010r^>!`MAݙ\u0004ԞHZ\u0014ƎJAw\"B3Q\u001bb\u001dV\fnPO\u0007!apg>\n+՟0ғm$|էQ\\j|\bg'V\u0003ʌbĘ1AYځi8c0\u00014+2=?JÕIѨPKdn\u001c\u0006c\rp0(Ki1S\u0012=\u0012\u007fɆ\u000eβIXzόiO\u0018;\t\u0012\u001a\u0011A~<~Xv~Dxjxh+Ϣ.Ցbr+Ψ5\f\b{^zu|+ޯgƏMr\u000bʛ\u008aRm"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0016Fu!<#j 3k%\u0016WB7r\u0017(#wR=\u0007uj-z#NVP\u0019f\\\u0002.\u0018\u0012lo[5\u001d\u0010/", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001f@v7~F}\u001c5|\u00072MU\u001dx>. >", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\"c\b/(q\u0016@#", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "3uT;g\u000bBa$z\n\\/|\u0016", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n5j})F{_\u000e^CDz\u0013\"#s]H\u0005f,[L", "5dc\u0012i,Gbw\u0003\ti(\f\u00072e\rfh@|\u0015&#x\rI\u0001)4S\u000b >m\u0012<M", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#}17v%<\u0017#Lk=-sloD\u0003r*Qv4\u001d", "Adc\u0012i,Gbw\u0003\ti(\f\u00072e\rfh@|\u0015&#x\rI\u0001)4S\u000b >m\u0012<M", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~Y\u000f @|$w-T;tC|\u0019vl5\u0016a/N\u0004|\u000b=", "8R?<\\5MS&]~l7x\u0018-h\u007f5", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001aGh*;v%.Z\"?y?\u001a$fd9\u00149", "8RC<h*A2\u001d\r\u0006Z;z\f/r", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n\u001aGl*Gk\u0019\rQQFgC\u001c\u0018hn\u000f", "@dP0g\nH\\(~\u000em", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "5dc\u001fX(<bv\t\u0004m,\u0010\u0018", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#l#7u\u0016-:C7iC{\u001fqp9\u001ar\u0002", "AsPAX\u001eKO$\nzk", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n#hy/7_#*XN;x\n", "5dc g(MS\u000b\fvi7|\u0016mR\u007f$yO\\ \u0016Ty\u0012;p25`}\u001cEm", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#k/3|\u0016 Z?Fv4+j", "Adc g(MS\u000b\fvi7|\u0016mR\u007f$yO\\ \u0016Ty\u0012;p25`}\u001cEm", "uKR<`u?O\u0017~wh6\u0003R<e{&\u000b\n\u0011\u001b\u001fCx\n>v2~G\r\u001cFm\b;INFkAsXY", "DhTD;,BU\u001c\u000e", "", "DhTDJ0=b\u001c", "6`]1_,\u001ef\u0017~\u0006m0\u0007\u0012", "", "B", "", "=m25\\3=3\"}z]\u0015x\u00183v\u007f\n{N\u0010'$G", "1gX9W\u001dBS+", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "3u", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "=m25\\3=A(z\bm,{q+t\u00049{\"\u0001%&W|\u000e", "=m7<i,K3*~\u0004m", "", "3uT;g", "=m8;g,KQ\u0019\n\nA6\u000e\t<E\u0011(\u0005O", "=m8;g,KQ\u0019\n\nM6\r\u00072E\u0011(\u0005O", "=mB6m,\u001cV\u0015\b|^+", ExifInterface.LONGITUDE_EAST, "6", "=kSD", "=kS5", "=mC<h*A3*~\u0004m", "@d`BX:M2\u001d\rve3\u0007\u001b\u0013n\u000f(\t>\u0001\"&6y\u001e:y\u0005FY\u0007/", "2hb._3He|\b\n^9z\t:t", "CoS.g,,b\u0015\u000ez", "EhSA[", "6dX4[;", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class DialogRootViewGroup extends ReactViewGroup implements RootView {
        private EventDispatcher eventDispatcher;
        private JSPointerDispatcher jSPointerDispatcher;
        private final JSTouchDispatcher jSTouchDispatcher;
        private StateWrapper stateWrapper;
        private int viewHeight;
        private int viewWidth;

        public DialogRootViewGroup(Context context) {
            super(context);
            DialogRootViewGroup dialogRootViewGroup = this;
            this.jSTouchDispatcher = new JSTouchDispatcher(dialogRootViewGroup);
            if (ReactFeatureFlags.dispatchPointerEvents) {
                this.jSPointerDispatcher = new JSPointerDispatcher(dialogRootViewGroup);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ThemedReactContext getReactContext() {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
            return (ThemedReactContext) context;
        }

        public final EventDispatcher getEventDispatcher$ReactAndroid_release() {
            return this.eventDispatcher;
        }

        public final StateWrapper getStateWrapper$ReactAndroid_release() {
            return this.stateWrapper;
        }

        @Override // com.facebook.react.uimanager.RootView
        public void handleException(Throwable t2) {
            Intrinsics.checkNotNullParameter(t2, "t");
            getReactContext().getReactApplicationContext().handleException(new RuntimeException(t2));
        }

        @Override // com.facebook.react.uimanager.RootView
        public void onChildEndedNativeGesture(View childView, MotionEvent ev) {
            Intrinsics.checkNotNullParameter(childView, "childView");
            Intrinsics.checkNotNullParameter(ev, "ev");
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher != null) {
                this.jSTouchDispatcher.onChildEndedNativeGesture(ev, eventDispatcher);
            }
            JSPointerDispatcher jSPointerDispatcher = this.jSPointerDispatcher;
            if (jSPointerDispatcher != null) {
                jSPointerDispatcher.onChildEndedNativeGesture();
            }
        }

        @Override // com.facebook.react.uimanager.RootView
        public void onChildStartedNativeGesture(View childView, MotionEvent ev) {
            Intrinsics.checkNotNullParameter(childView, "childView");
            Intrinsics.checkNotNullParameter(ev, "ev");
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher != null) {
                this.jSTouchDispatcher.onChildStartedNativeGesture(ev, eventDispatcher);
                JSPointerDispatcher jSPointerDispatcher = this.jSPointerDispatcher;
                if (jSPointerDispatcher != null) {
                    jSPointerDispatcher.onChildStartedNativeGesture(childView, ev, eventDispatcher);
                }
            }
        }

        @Override // android.view.View
        public boolean onHoverEvent(MotionEvent event) {
            JSPointerDispatcher jSPointerDispatcher;
            Intrinsics.checkNotNullParameter(event, "event");
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher != null && (jSPointerDispatcher = this.jSPointerDispatcher) != null) {
                jSPointerDispatcher.handleMotionEvent(event, eventDispatcher, false);
            }
            return super.onHoverEvent(event);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptHoverEvent(MotionEvent event) {
            JSPointerDispatcher jSPointerDispatcher;
            Intrinsics.checkNotNullParameter(event, "event");
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher != null && (jSPointerDispatcher = this.jSPointerDispatcher) != null) {
                jSPointerDispatcher.handleMotionEvent(event, eventDispatcher, true);
            }
            return super.onHoverEvent(event);
        }

        @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher != null) {
                this.jSTouchDispatcher.handleTouchEvent(event, eventDispatcher, getReactContext());
                JSPointerDispatcher jSPointerDispatcher = this.jSPointerDispatcher;
                if (jSPointerDispatcher != null) {
                    jSPointerDispatcher.handleMotionEvent(event, eventDispatcher, true);
                }
            }
            return super.onInterceptTouchEvent(event);
        }

        @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
        protected void onSizeChanged(int i2, int i3, int i4, int i5) {
            super.onSizeChanged(i2, i3, i4, i5);
            this.viewWidth = i2;
            this.viewHeight = i3;
            updateState(i2, i3);
        }

        @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            EventDispatcher eventDispatcher = this.eventDispatcher;
            if (eventDispatcher != null) {
                this.jSTouchDispatcher.handleTouchEvent(event, eventDispatcher, getReactContext());
                JSPointerDispatcher jSPointerDispatcher = this.jSPointerDispatcher;
                if (jSPointerDispatcher != null) {
                    jSPointerDispatcher.handleMotionEvent(event, eventDispatcher, false);
                }
            }
            super.onTouchEvent(event);
            return true;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void requestDisallowInterceptTouchEvent(boolean z2) {
        }

        public final void setEventDispatcher$ReactAndroid_release(EventDispatcher eventDispatcher) {
            this.eventDispatcher = eventDispatcher;
        }

        public final void setStateWrapper$ReactAndroid_release(StateWrapper stateWrapper) {
            this.stateWrapper = stateWrapper;
        }

        public final void updateState(int i2, int i3) {
            Unit unit;
            float fPxToDp = PixelUtil.INSTANCE.pxToDp(i2);
            float fPxToDp2 = PixelUtil.INSTANCE.pxToDp(i3);
            StateWrapper stateWrapper = this.stateWrapper;
            if (stateWrapper != null) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("screenWidth", fPxToDp);
                writableNativeMap.putDouble("screenHeight", fPxToDp2);
                stateWrapper.updateState(writableNativeMap);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                ThemedReactContext reactContext = getReactContext();
                final ThemedReactContext reactContext2 = getReactContext();
                reactContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactContext2) { // from class: com.facebook.react.views.modal.ReactModalHostView$DialogRootViewGroup$updateState$2$1
                    {
                        super(reactContext2);
                    }

                    @Override // com.facebook.react.bridge.GuardedRunnable
                    public void runGuarded() {
                        UIManagerModule uIManagerModule = (UIManagerModule) this.$this_run.getReactContext().getReactApplicationContext().getNativeModule(UIManagerModule.class);
                        if (uIManagerModule != null) {
                            uIManagerModule.updateNodeSize(this.$this_run.getId(), this.$this_run.viewWidth, this.$this_run.viewHeight);
                        }
                    }
                });
            }
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0018\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4ߚ}ҿ\u0000iOӄtev-\u001bc8\u000f\u0004{b%\f*\u007fESW0|P\f\u0016r̭fñϽZ\u000fK\u0011\f5'i\u0082MYߍa\u0011"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u0016Fu!<#j 3k%\u0016WB7r\u0017(#wR=\u0007uj8\u007f\u0014GX^,jaPD\u001e ZtR9\u001c\u0005bA1D", "", "=mA2d<>a(\\\u0002h:|", "", "2hP9b.", "\u001a`]1e6BRb|\u0005g;|\u0012>/^,wG\u000b\u0019zP~\u000eIw!3YS", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface OnRequestCloseListener {
        void onRequestClose(DialogInterface dialogInterface);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReactModalHostView(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ThemedReactContext themedReactContext = context;
        super(themedReactContext);
        context.addLifecycleEventListener(this);
        this.dialogRootViewGroup = new DialogRootViewGroup(themedReactContext);
    }

    private final void dismiss() {
        Activity activity;
        UiThreadUtil.assertOnUiThread();
        Dialog dialog = this.dialog;
        if (dialog != null) {
            if (dialog.isShowing() && ((activity = (Activity) ContextUtils.findContextOfType(dialog.getContext(), Activity.class)) == null || !activity.isFinishing())) {
                dialog.dismiss();
            }
            this.dialog = null;
            this.createNewDialog = true;
            ViewParent parent = this.dialogRootViewGroup.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeViewAt(0);
            }
        }
    }

    private final View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.dialogRootViewGroup);
        if (!this.statusBarTranslucent) {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private final Activity getCurrentActivity() {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        return ((ThemedReactContext) context).getCurrentActivity();
    }

    private final void updateProperties() {
        Dialog dialog = this.dialog;
        if (dialog == null) {
            throw new IllegalStateException("dialog must exist when we call updateProperties".toString());
        }
        Window window = dialog.getWindow();
        if (window == null) {
            throw new IllegalStateException("dialog must have window when we call updateProperties".toString());
        }
        Intrinsics.checkNotNullExpressionValue(window, "checkNotNull(...)");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) {
            return;
        }
        try {
            Window window2 = currentActivity.getWindow();
            if (window2 != null) {
                if ((window2.getAttributes().flags & 1024) != 0) {
                    window.addFlags(1024);
                } else {
                    window.clearFlags(1024);
                }
            }
            WindowUtilKt.setStatusBarTranslucency(window, this.statusBarTranslucent);
            if (this.transparent) {
                window.clearFlags(2);
            } else {
                window.setDimAmount(0.5f);
                window.setFlags(2, 2);
            }
        } catch (IllegalArgumentException e2) {
            FLog.e(ReactConstants.TAG, "ReactModalHostView: error while setting window flags: ", e2.getMessage());
        }
    }

    private final void updateSystemAppearance() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        Dialog dialog = this.dialog;
        if (dialog == null) {
            throw new IllegalStateException("dialog must exist when we call updateProperties".toString());
        }
        Window window = dialog.getWindow();
        if (window == null) {
            throw new IllegalStateException("dialog must have window when we call updateProperties".toString());
        }
        Intrinsics.checkNotNullExpressionValue(window, "checkNotNull(...)");
        Window window2 = currentActivity.getWindow();
        if (Build.VERSION.SDK_INT <= 30) {
            window.getDecorView().setSystemUiVisibility(window2.getDecorView().getSystemUiVisibility());
            return;
        }
        WindowInsetsController insetsController = window2.getInsetsController();
        if (insetsController == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        int systemBarsAppearance = insetsController.getSystemBarsAppearance();
        int i2 = (systemBarsAppearance + 8) - (systemBarsAppearance | 8);
        WindowInsetsController insetsController2 = window.getInsetsController();
        if (insetsController2 != null) {
            insetsController2.setSystemBarsAppearance(i2, 8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList<View> outChildren) {
        Intrinsics.checkNotNullParameter(outChildren, "outChildren");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        UiThreadUtil.assertOnUiThread();
        this.dialogRootViewGroup.addView(view, i2);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure structure) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        this.dialogRootViewGroup.dispatchProvideStructure(structure);
    }

    public final String getAnimationType() {
        return this.animationType;
    }

    @Override // android.view.ViewGroup
    public View getChildAt(int i2) {
        return this.dialogRootViewGroup.getChildAt(i2);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.dialogRootViewGroup.getChildCount();
    }

    @VisibleForTesting
    public final Dialog getDialog() {
        return this.dialog;
    }

    public final EventDispatcher getEventDispatcher() {
        return this.dialogRootViewGroup.getEventDispatcher$ReactAndroid_release();
    }

    public final boolean getHardwareAccelerated() {
        return this.hardwareAccelerated;
    }

    public final OnRequestCloseListener getOnRequestCloseListener() {
        return this.onRequestCloseListener;
    }

    public final DialogInterface.OnShowListener getOnShowListener() {
        return this.onShowListener;
    }

    public final StateWrapper getStateWrapper() {
        return this.dialogRootViewGroup.getStateWrapper$ReactAndroid_release();
    }

    public final boolean getStatusBarTranslucent() {
        return this.statusBarTranslucent;
    }

    public final boolean getTransparent() {
        return this.transparent;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismiss();
    }

    public final void onDropInstance() {
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.uimanager.ThemedReactContext");
        ((ThemedReactContext) context).removeLifecycleEventListener(this);
        dismiss();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        onDropInstance();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        showOrUpdate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view != null) {
            this.dialogRootViewGroup.removeView(view);
        }
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i2) {
        UiThreadUtil.assertOnUiThread();
        this.dialogRootViewGroup.removeView(getChildAt(i2));
    }

    public final void setAnimationType(String str) {
        this.animationType = str;
        this.createNewDialog = true;
    }

    public final void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.dialogRootViewGroup.setEventDispatcher$ReactAndroid_release(eventDispatcher);
    }

    public final void setHardwareAccelerated(boolean z2) {
        this.hardwareAccelerated = z2;
        this.createNewDialog = true;
    }

    @Override // android.view.View
    public void setId(int i2) {
        super.setId(i2);
        this.dialogRootViewGroup.setId(i2);
    }

    public final void setOnRequestCloseListener(OnRequestCloseListener onRequestCloseListener) {
        this.onRequestCloseListener = onRequestCloseListener;
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.onShowListener = onShowListener;
    }

    public final void setStateWrapper(StateWrapper stateWrapper) {
        this.dialogRootViewGroup.setStateWrapper$ReactAndroid_release(stateWrapper);
    }

    public final void setStatusBarTranslucent(boolean z2) {
        this.statusBarTranslucent = z2;
        this.createNewDialog = true;
    }

    public final void setTransparent(boolean z2) {
        this.transparent = z2;
    }

    public final void showOrUpdate() {
        Window window;
        UiThreadUtil.assertOnUiThread();
        if (!this.createNewDialog) {
            updateProperties();
            return;
        }
        dismiss();
        this.createNewDialog = false;
        String str = this.animationType;
        int i2 = Intrinsics.areEqual(str, "fade") ? R.style.Theme_FullScreenDialogAnimatedFade : Intrinsics.areEqual(str, "slide") ? R.style.Theme_FullScreenDialogAnimatedSlide : R.style.Theme_FullScreenDialog;
        Activity currentActivity = getCurrentActivity();
        Dialog dialog = new Dialog(currentActivity != null ? currentActivity : getContext(), i2);
        this.dialog = dialog;
        ((Window) Objects.requireNonNull(dialog.getWindow())).setFlags(8, 8);
        dialog.setContentView(getContentView());
        updateProperties();
        dialog.setOnShowListener(this.onShowListener);
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.facebook.react.views.modal.ReactModalHostView.showOrUpdate.1
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialog2, int i3, KeyEvent event) {
                Intrinsics.checkNotNullParameter(dialog2, "dialog");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.getAction() != 1) {
                    return false;
                }
                if (i3 == 4 || i3 == 111) {
                    OnRequestCloseListener onRequestCloseListener = ReactModalHostView.this.getOnRequestCloseListener();
                    if (onRequestCloseListener == null) {
                        throw new IllegalStateException("onRequestClose callback must be set if back key is expected to close the modal".toString());
                    }
                    onRequestCloseListener.onRequestClose(dialog2);
                    return true;
                }
                Context context = ReactModalHostView.this.getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                Activity currentActivity2 = ((ReactContext) context).getCurrentActivity();
                if (currentActivity2 != null) {
                    return currentActivity2.onKeyUp(i3, event);
                }
                return false;
            }
        });
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        if (this.hardwareAccelerated && (window = dialog.getWindow()) != null) {
            window.addFlags(16777216);
        }
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        dialog.show();
        updateSystemAppearance();
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            window3.clearFlags(8);
        }
    }
}
