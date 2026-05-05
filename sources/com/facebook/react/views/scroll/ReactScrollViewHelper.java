package com.facebook.react.views.scroll;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
@Metadata(bv = {}, d1 = {"Я\u0001\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176B\u0005#4\u0012\u0006\u0010nʑA0RlP.XU2\u000fy\u0002<$a)yCQU\"}8\tWN}gvJ`\u000bK\u000f\u0014\u0016\u0001j2J]xs\u0012\u00172XoG3coE9fx>\u0005.7*8\u007f\u0007\t\u001a@H\u0018v\u0001HS\f(0HpPR\u0015M\u000b\u001a\u001a\u0006T \t\u001eboV6^le:5:\tފBdϋ\u00100+LEL)|cN:w\u0006\u001cw:\u001b%٨\u0007\u0007`[\b\u0011M\u000bU\u0005\u0017AW/W\u000fo6\u0007\u0017Z\u001asx\u001by\u000b&\u000b\u001fqr\u0012ʬ9l\fMf\rV\u0016#}#;2-.'vN]\u001et)&3;\u0010\u001aEг\u0006^P\"CoD:=\u007faEi\u001ftry;Gn}\u0001M0,G\u0019nOut\u001afٽ)q SGPn\\pN8ymq\u0012\u0012z\u0002p!vLĬ3{\u001fP_XE\u0001Q#O\u0006\"TJϙ\u0005\"\tjih\u0001gh\"\u001d6g.\u0017-rD+\"\u001cTb~D\u0011{C\u0005\u000b\f0+ \u000b\u001f\u0003&ٚ\u0014N]\u00122\u0016[\b\"%]\u0001Wet\u0088\u001cta`I4\u007f\u00038a\u0001\u0017DCJ\u0004\u001dX-_\u0004\u0010h\b@\"`t1\u0010ȑ\u007fD\\9[wM\u001c44ZK9h\u001bǽ\u0011;jC\u0013\b\u000ey\u0011\u0010-tc(\u0011\u000b<tO\u001e\u0001`~\u001b\u007fxwX-d0SYQc@VY0\u0011L|Q./y\u0006Guz_L\u001b\u001c<Uދ$\u0016(h\u001abK='~WL\"9Kɣ\u0001\u0003yO(&)\u001c\"\u000fi\t^k\u0016\f\t,'\bzSb=:v\r\u001aS\fr(\u0012at\"\u000ehӝ\u000f[Lr;6glf8+\u001f?*+˚}?%7CBU<>wBOEek\u000b\b.@\u007f?*\u0003\f\u001c,\u0012# f_\u0006J;fV \u0004й&$z4\u000bkx* B7N-?NШr\u000e~:c\n]\u001d\u000f\u0007Z-!Zi[+oDQtdͫwC\f6'l3DeS\u0016\b\u000e]b֥X,2\r\u00120\u001dFD?6U\u0006\u0018104\u0014H:O\\z\u0005\u0003&j9ʙ@\b\u0019e\u001dy\u0014F\u0013\u007ftl?\u001d@y\f=l\r\u00031#[\u0011Fn~x!X\u000e\u001f!9ͨ\u0007RY\u0007\u0004E\u0003M\f4\u0017RK=Cj}\u001f\u0017)9el9aE\t\u0005\u0019\u007fuCw\u000ff\bUd\u0006k\u001e\u0019h\u001c\u000bYZ\u0018IF\u0018\u0016چz0lH\u001et\\#\u000f\u0012\u0015_~(7>\u0013~$;8\u0011Q\u001e\u0018\u0003}#EL|\u0005gI(B/F?\u0006:~*Kcv\u0014wE=w.49\u0002ߺaX&\n6\u001fU\"\u001d#rV<\u001b2]IZFu$\u0004\u001a\tYmP\b<\u000f\rr8;8:]GK\u0002Ak\no\u0006gX'Yy6FY0\u0011\n\u0012y*sό\u000f\u0003ty\u001f'|vh\u001d7AmF\u0019̽hW9U6W?\u001e<\u0017<\u001ed<\u000b+&N\u0012\u001e\u0019k}{=/=\rBawMݟ\"}-\u001c>\u00128\u001f@\u0015ip}Br$tlpnTc3gr@$)B\u0017\u001f`dƷ!Qnt4c]UA!q\fu\u0015/\u0006[HTVYRm;g6\u0019\u0011@vW jf\u0003LBB7\u007f0k:z^Tk'm^ޡqd\u0011W\u0014tF\u0011 ,?(1G`߀.[\u0005\u001c2:\u007fQi\u001b'\u007fCl.q\u001d\u0018c ySSJ1\u0001\u000f.Wyw\t\u0001x٥v#=18Re5S%c\u007fl9\u0012\u058bsg'OyU=\u0016TKKDL/}@.*O(2'\u000e#FbaL8/t@\u0005\u0001\b\b4zNnr0ؼpx\u0002;t/&E|[\u0010Na\u0019\u001aԌR[R/\u0003\u0006sk\u0011{!C;d<9%\u0005Wg?~&N uSI!m_`k]+sJWbeD _@\bQ61 |{j\u0019\u0015\u0018dݳ<\u0012\u001b6LE?$x\u007f\u000f78EQĴTS\u0005zc@\u0011)h\u0011:]\\a4\r\u001c\u0015\\|?\u0004\u0014I\u000fJ;3u\u0014qK w\u0014!c.\f)\u0014K\u007fjuf\u0006ufeQ39\u0015z\\C8t\u0005\u0004'\u0012iƶ\u0019\u007fx~~Sd?2*\u0007\bdȑ7э\u0014D\u0001ؤxy>3HP-\\\u001aלS\u0097#=]ǝ6\u000b@fO[\u0013\u0013\u0002Ŏ*ּVU+يI\u000e\u0011\u0015Y\u0019A\u0011tҐ{ߊ's\u0015Г\u000f\b\u0016caU+u ʤU˔N!7Φ\u0010;OT\u0005V\u0014Aoْ\u0012ך\u0010 /ՁV\u001f2l\u007f\u0013\u0018\u0010xΰUԸ:V1گ\u001ce\u001fqZj=|Kޞ\u0001ۢ<U\u000e۳V\u001dp(M;\u000eM\u0003ȫ|ŇKOrɸzq}t\rY{R\u0002ܹk҅5q\u0019ˮ k\"}i\\\u0007KmϱxĮ\u0017\u0002\"ܮvm\nXA0Eb:ݞ=ԷX`\u0019מ\u0005w>u\u0012r\u0015q\u0015͛\u0011̈́Ll!ʠ \u0012)c\\j's\u0019JW\u000f\u0011nZ)\rŵl\u07fb\u0005\u0001Sڙg,EX\u000f/w;J(q$c]S^x\u001c<\u007f8߂\u0017ٛa3>ŧ@8\u000b-\u001d>\u0015xZȢ\u0011Վ4\u0004s͵ȳJ7"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\r7i\u0014=;AHu;%\u0006laKic3Yv4\u001d", "", "u(E", "\u000fTC\u001c", "", "\u0011N=!8\u0015-M\u0003_[L\fk\u0003\u0016E`\u0017", "\u0011N=!8\u0015-M\u0003_[L\fk\u0003\u001eOj", "\u0012D1\":&&=w^", "", "\u001bN<\u0012A\u001b.;\u0013]ZE\bp", "", "\u001dU4\u001fR\u001a\u001c@\u0003eaX\bcz\u000bYm", "\u001dU4\u001fR\u001a\u001c@\u0003eaX\u0015\\y\u000fR", "!BA\u001c?\u00138/\u000bZnX\u0017Xg\u000eIh\nu/j\u0002", "!L>\u001cG\u000f8AvkdE\u0013vg\u001fR[\u0017_*i", "", "!M0\u001dR\b%7zgb>\u0015k\u0003\rEh\u0017[-", "!M0\u001dR\b%7zgb>\u0015k\u0003\u000eIm\u0004X'`u", "!M0\u001dR\b%7zgb>\u0015k\u0003\u000fN^", "!M0\u001dR\b%7zgb>\u0015k\u0003\u001dT[\u0015j", "\"@6", "9nc9\\5\u0007X*\u0007CI3x\u00180o\r0jT\f\u0017", "Aba<_3%W'\u000ezg,\n\u0017", "\u001aiPCTuNb\u001d\u0006D\\6\u0006\u0007?r\r(\u0005OJt!R\u0004wEh29h}{Dz\u0012B4GIz\n", "\u001aiPCTuEO\"\u0001Dk,}R!e{.h@\u0002\u0017$Gx\f<L", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\r7i\u0014=;AHu;%\u0006laKic3Yv4\u0006:L9fYy$\u0018 i\u000eW+\u001aZ", "Al^<g/,Q&\t\u0002e\u000b\r\u0016+t\u00042\u0005$\n\u001b&Kk\u0015@\f%4", "/cS V9HZ e~l;|\u0012/r", "", ":hbAX5>`", "2hb=T;<V\u0001\t\u0003^5\f\u00197E\t'eI\\ \u001bOk\u001d@\u0001.\u0015b|", "\"", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\r7i\u0014=;AHu;%\u0006laKic3Yv4\u0006/J:=YvF\u0016mc\u0012V'\u001c\u000ff\u0017", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\r7i\u0014=;AHu;%\u0006laKic3Yv4\u0006/J:JP\u007fG\u001b\u0019:\u001fN4\u001cs\\N.}S>\u001f]", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "Aba<_3/W\u0019\u0011", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:]M\u000b'\"\u001d3~", "3lXA?(R])\u000eZo,\u0006\u0018", "3lXAF*K] \u0006W^.\u0001\u0012\u000er{*[Q\u0001 &", "3lXAF*K] \u0006Zg+[\u0016+g_9{I\u0010", "FUT9b*Bb-", "", "GUT9b*Bb-", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:]M\u000b'\"\u001dPn\u007fg", "3lXAF*K] \u0006Zo,\u0006\u0018", "Aba<_3\u001ed\u0019\b\nM@\b\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\u000e5z 5T#Lk=-\u0004|l9\\", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:]M\u000b'\"\u001dV\fF~n6U{ 4w 4\u0017P;g2-^ye9\u0019qu\\t4QSUuJP\u007fG\u001b\u0019:\u001fN4\u001csmL$D\b(", "3w_2e0FS\"\u000eve&\u0001\u0017\u001dy\t&~M\u000b !W}", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:]M\u000b'\"\u001dV\fF~n6U{ 4w 4\u0017P;g2-^ye9\u0019qu\\t4QSUuJP\u007fG\u001b\u0019:\u001fN4\u001csmL$D%\u0018\u0014K\u001d", "3lXAF*K] \u0006bh4|\u0012>u\b\u0005{B\u0005 vXo\u0017K", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:]M\u000b'\"\u001dSq\u007fg", "3lXAF*K] \u0006bh4|\u0012>u\b\b\u0005?`(\u0017P~", "4na0X\u001cIR\u0015\u000ezL;x\u0018/", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\r7i\u0014=;AHu;%\u0006laKic3Yv4\u0006/J:JP\u007fG\u001b\u0019H\u001dJ:\rZ", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\r7i\u0014=;AHu;%\u0006laKic3Yv4\u0006/J:JanL\u0014\u0004g\nY6\r\u0012/", "5dc\u0011X-:c \u000eh\\9\u0007\u00106A\t,\u0004<\u0010\u001b!PN\u001eIr49c\u0007", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "5dc\u001bX?M4 \u0003\u0004`\u001a\f\u0005<tp$\u0003P\u0001", "1ta?X5MD\u0015\u0006\u000b^", ">nbA45B[\u0015\u000e~h5m\u00056u\u007f", "Dd[<V0Mg", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:]M\u000b'\"\u001dSq :\t", ">`a@X\u0016OS&lxk6\u0004\u0010\u0017o~(", "8r>CX9,Q&\t\u0002e\u0014\u0007\b/", ">`a@X\u001aGO$m\u0005:3\u0001\u000b8m\u007f1\u000b", "/kX4a4>\\(", ">qT1\\*M4\u001d\bve\u001az\u00169l\u0007\u0013\u0006N\u0005&\u001bQx", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&l", "Dd[<V0Mg\f", "Dd[<V0Mg\r", ";`g6`<F=\u001a\u007f\t^;o", ";`g6`<F=\u001a\u007f\t^;p", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:]M\u000b'\"\u001dSq Zh\u001cU\u0007\u001fDw\u001a-\u0017EHg?!\u0019fo\u0003qm0W\u0006|", "@dV6f;>`y\u0006~g.X\u00123m{7\u0006M", "@d\\<i,,Q&\t\u0002e\u0013\u0001\u0017>e\t(\t", "Al^<g/,Q&\t\u0002e\u001b\u0007", "F", "G", "CoS.g,\u001fO\u0016\f~\\\u001az\u00169l\u0007\u0016\u000b<\u0010\u0017", "Aba<_31", "Aba<_32", "CoS.g,,b\u0015\u000ezH5j\u0007<o\u0007/YC| \u0019Gn", "3w_2e0FS\"\u000eve&\u000b\u001d8c\u00035\u0006I\u000b'%", "uKP;W9HW\u0018H\fb,\u000fR i\u007f:]M\u000b'\"\u001dPn1:\u0016", "\u0016`b\u0013_0GUt\b~f(\f\u0013<", "\u0016`b V9HZ ^\f^5\fw2r\n7\u000bG\u0001", "\u0016`b V9HZ l\nZ;|", "\u0016`b `6Hb\u001clxk6\u0004\u0010", "\u0016`b g(MS\u000b\fvi7|\u0016", "\u001duT?F*K] \u0006zk\u000b\r\u0016+t\u00042\u0005\"\u0001&&G|", " dP0g\u001a<`#\u0006\u0002O0|\u001b\u001dc\r2\u0003Gn&\u0013Vo", "!ba<_3%W'\u000ezg,\n", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
public final class ReactScrollViewHelper {
    public static final String AUTO = "auto";
    private static final String CONTENT_OFFSET_LEFT = "contentOffsetLeft";
    private static final String CONTENT_OFFSET_TOP = "contentOffsetTop";
    private static final boolean DEBUG_MODE = false;
    public static final long MOMENTUM_DELAY = 20;
    public static final String OVER_SCROLL_ALWAYS = "always";
    public static final String OVER_SCROLL_NEVER = "never";
    private static final String SCROLL_AWAY_PADDING_TOP = "scrollAwayPaddingTop";
    public static final int SNAP_ALIGNMENT_CENTER = 2;
    public static final int SNAP_ALIGNMENT_DISABLED = 0;
    public static final int SNAP_ALIGNMENT_END = 3;
    public static final int SNAP_ALIGNMENT_START = 1;
    private static boolean smoothScrollDurationInitialized = false;
    public static final ReactScrollViewHelper INSTANCE = new ReactScrollViewHelper();
    private static final String TAG = "ReactHorizontalScrollView";
    private static final CopyOnWriteArrayList<WeakReference<ScrollListener>> scrollListeners = new CopyOnWriteArrayList<>();
    private static int SMOOTH_SCROLL_DURATION = 250;

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\"\u001d<K!&i\u000eӵLш|\u0004W\u00068é6B\r(4\u0012}\u0007njG0LeN/X8@ş\u001c{b#$*\u007fCSUH~h-\u0018\\ui\u0007J\t\u000es\u0013\u0014\u001a\u0011jZL\u001c\u001d&(\u001d7Zom9}sK@xtd\bP60@\u0012\u0005/\u001dplȮuٙŒK\u0010\u001a2F\u0010hQұQ\u000e݆\u0016\u0005"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\r7i\u0014=;AHu;%\u0006laKic3Yv4\u0006/J:=YvF\u0016mc\u0012V'\u001c\u000ff\u0017", "", "5dc\u0013_0GUt\b~f(\f\u0013<", "\u001a`]1e6BRbz\u0004b4x\u00183o\tql<\b'\u0017#x\u0012Dr4?fS", "5dc\u0013_0GUx\u0012\nk(\b\u00136a\u000f(z\u001f\u0005%&Cx\f<", "", "Dd[<V0Mg", "AsP?g\rEW\"\u0001Vg0\u0005\u0005>o\r", "", "AsP?g", "3mS", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface HasFlingAnimator {
        ValueAnimator getFlingAnimator();

        int getFlingExtrapolatedDistance(int i2);

        void startFlingAnimator(int i2, int i3);
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001c\u001d<K!&i\u000eӵLш|\u0004O\r8\u000b4E\u0007\":\u0018\u007f\u0007lm?\u0015Z͜x.\u0001Rz%y{L$\n%HٸGڈ\u001e\b:\u000bUPuj\u000fL`\u000fQ\u0014V,\u0007pDI\u0004\u007f4ܯ\u001b̓FyW5SwKB\u0001v<\u000f.=ƫ7цڑ\u0001\u001e2J\u0016\u0016)BƠ\u0010\u001eٔDo"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\r7i\u0014=;AHu;%\u0006laKic3Yv4\u0006/J:JP\u007fG\u001b\u0019:\u001fN4\u001cs\\N.}S>\u001f]", "", ":`bAF*K] \u0006Yb:\b\u0005>c\u0003\u0017\u007fH\u0001", "", "5dc\u0019T:MA\u0017\f\u0005e3[\r=p{7yCo\u001b\u001fG", "u(9", "Adc\u0019T:MA\u0017\f\u0005e3[\r=p{7yCo\u001b\u001fG", "uI\u0018#", "Aba<_3\u001ed\u0019\b\nM/\n\u0013>t\u0007(", "", "5dc V9HZ ^\f^5\fw2r\n7\u000bG\u0001", "u(8", "Adc V9HZ ^\f^5\fw2r\n7\u000bG\u0001", "uH\u0018#", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface HasScrollEventThrottle {
        long getLastScrollDispatchTime();

        int getScrollEventThrottle();

        void setLastScrollDispatchTime(long j2);

        void setScrollEventThrottle(int i2);
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0005\u0007Bߚ(\u0007\u0015i\n@Re`.\u0001T\u0001Ɔmڷ8(s&wEIXܵ|̝ޞORoiti\t\nå\u0013\nȞ|i"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\r7i\u0014=;AHu;%\u0006laKic3Yv4\u0006/J:JP\u007fG\u001b\u0019H\u001dJ:\rZ", "", "@dP0g\u001a<`#\u0006\u0002O0|\u001b\u001dc\r2\u0003Gn&\u0013Vo", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\r7i\u0014=;AHu;%\u0006laKic3Yv4\u00069N(Za`;!\u001ca\u0015?/\r\u0017G?1xK>\r\u0017(X\u0002\u0011", "5dc\u001fX(<b\u0007|\bh3\u0004y3e\u0012\u0016yM\u000b\u001e\u001e5~\nKv", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ(\u001bG\u0002\u001c\u0006\u0005#Bc\u0005'\u0001Z\u0016*KR)iA(\u001coR=\u0007u\u000fN}2GY\r\u0019\\NpL\u0002\u0010g\u0018U2}\tYS\u0012lQA&\u000f\u001aX}JhV", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface HasScrollState {
        ReactScrollViewScrollState getReactScrollViewScrollState();
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001a\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\r(4\u0012}\blOOӄtev-\u001bi8\u000f\u0004{b%\f(\u007fESUH\u0001R\r]R\u007fg\u001dM!/\f%\u0014\u001b\u0011jZJ\u0006|k\u0014'2pro7[sU9\u000fw|)܌1Ĳ\u0603y\t\t\u001c0g>uڂGQĉ\u0016/"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\r7i\u0014=;AHu;%\u0006laKic3Yv4\u0006/J:JZ|G#\u0015H\f[5\u0014\f/", "", "@dP0g\u001aF]#\u000e}L*\n\u00136ln2", "", "F", "", "G", "Aba<_3-]\u0004\fzl,\n\u001a3n\u0002\u0010\u0006H\u0001 &Ww", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface HasSmoothScroll {
        void reactSmoothScrollTo(int i2, int i3);

        void scrollToPreservingMomentum(int i2, int i3);
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLш|\u0004W\u00068\u000b4C\u0005\u0007Bߚ(\u0007\u0015i\nBRe`0hRX\u0010Bڻ6ż_(\nEAW(\u0001Ζ\bѧȡgkvL`*q\u000eَ\u001a|͔0H"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\r7i\u0014=;AHu;%\u0006laKic3Yv4\u0006/J:JanL\u0014\u0004g\nY6\r\u0012/", "", "AsPAX\u001eKO$\nzk", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n#hy/7_#*XN;x\n", "5dc g(MS\u000b\fvi7|\u0016", "u(;0b4\bT\u0015|z[6\u0007\u000fxr\u007f$yOJ'\u001bOk\u00178x%B#k/3|\u0016 Z?Fv4+j", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface HasStateWrapper {
        StateWrapper getStateWrapper();
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я$\u001d<K!&i\u0016DLш|\u0004W\u00068\u000b4B\u0007\":\u0018\u007f\u0007llA0ReP.XW0\u000f\u0002ڔd$\n#2RA٥*\u00040\tgP}f\u001dKҼ\u000fC\u001d\b^'x4aU'fB\u0013@L\b?aQ AGk\r63$b&F\u0006\u001d\u0001H.x\u0014\u0005\b[K:\u0016`D~Hj\r{\t`&VJ.\u00046\\\u0016R\rԢxҺ>/+Ʌ:Q\\,w0+QC\u000bù+\u0011\u000fc$1N>߷\u00194"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\r7i\u0014=;AHu;%\u0006laKic3Yv4\u00066_,i@pJ\u001e\u0019a\u000e[\n\u001d\u0012UP(xM\u0019\u001f\u0017;I\u000f\u0011", "\u001a`]1e6BRb\u0011~].|\u0018xO\u0011(\t.~$!Nv\u000eIL", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "1ta?X5MA\u0017\f\u0005e3X\u00123m{7\u007fJ\nu'Tk\u001d@\u0001.", "", "Aba<_3\u001a\\\u001d\u0007vm0\u0007\u0012\u000eu\r$\u000bD\u000b ", "5dc V9HZ Z\u0004b4x\u00183o\t\u0007\fM|&\u001bQx", "u(8", "AsP?g\u001a<`#\u0006\u0002", "", "AsP?g\u001f", "AsP?g ", "2w", "2x", "2ta.g0H\\", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    private static final class OverScrollerDurationGetter extends OverScroller {
        private int currentScrollAnimationDuration;

        public OverScrollerDurationGetter(Context context) {
            super(context);
            this.currentScrollAnimationDuration = 250;
        }

        public final int getScrollAnimationDuration() {
            super.startScroll(0, 0, 0, 0);
            return this.currentScrollAnimationDuration;
        }

        @Override // android.widget.OverScroller
        public void startScroll(int i2, int i3, int i4, int i5, int i6) {
            this.currentScrollAnimationDuration = i6;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я,\u001d<K!&i\u000eӵLш|\u0004O\f8\u000b4B\u0007\":\u0017\u007f\u0007lmA0ZeP.XT2\u000fy\u0005<$a5\bّkUH|b\u0014_Rug\u0007J\t\fß\u0013\u0006$z3@Wp\u0011]@ƁbF}[KM\u001e>id\u0003S\u001d `#\u0001\u000e\u0013\u001f2*vƵ'~Qj$\u0012^A!>`-e\u0005H\u0013VV.\u00046\\\u0016R\rԦxҺ>;+Ʌ\u0002DT,m6\u001dO\u0013Mb/]\u0006o'C@e?չ)Y\u000bޗj]E\u000eM}\u000e\u001dv4?+w\u0002.̳dÿ\u0018!3˽%_x3j\u0014qb\u001279`4c^ @w)\ncɤ\u0010؝\n3P͓E\u001cl\u001a\u001cB\u0015tYS^\u0013/Q\u000e\u000fy6E/ő71Aӕ~SgP'Z\b\u000b\u0013\r6#/oĲ_Z\u0016֫-\u001dZ\u000e_H\"XK`f\n\b>DՕ|Ċ\u00066\f\u0382_\u00025\u0015\u001fE7'=uG%ݒo#"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\r7i\u0014=;AHu;%\u0006laKic3Yv4\u00069N(Za`;!\u001ca\u0015?/\r\u0017G?1xK>\r\u0017(X\u0002\u0011", "", ":`h<h;\u001dW&~xm0\u0007\u0012", "", "uH\u0018#", "2dR2_,KO(\u0003\u0005g\u0019x\u0018/", "", "5dc\u0011X*>Z\u0019\fvm0\u0007\u0012\u001ca\u000f(", "u(5", "Adc\u0011X*>Z\u0019\fvm0\u0007\u0012\u001ca\u000f(", "uE\u0018#", "4h]._\bGW!z\n^+g\u0013=i\u000f,\u0006In\u0015$Qv\u0015", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013\u0006D\n&l", "5dc\u0013\\5:Zt\b~f(\f\t.P\n6\u007fO\u0005! 5m\u001bF},", "u(;.a+K]\u001d}D`9x\u00142i}6E+\u000b\u001b VE", "7r2.a*>Z\u0019}", "", "u(I", "Adc\u0010T5<S ~y", "uY\u0018#", "7r56a0LV\u0019}", "Adc\u0013\\5Ba\u001c~y", ":`bAF;:b\u0019n\u0006](\f\t\u001dc\r2\u0003G", "5dc\u0019T:MA(z\n^\u001c\b\b+t\u007f\u0016yM\u000b\u001e\u001e", "5dc\u0019T@Hc(]~k,z\u00183o\t", "u(8", "Aba<_3\u001ae\u0015\u0013eZ+{\r8gn2\u0007", "5dc V9HZ Z\rZ@g\u0005.d\u00041}/\u000b\"", "Adc V9HZ Z\rZ@g\u0005.d\u00041}/\u000b\"", "Adc\u0013\\5:Zt\b~f(\f\t.P\n6\u007fO\u0005! 5m\u001bF},", "4h]._\bGW!z\n^+g\u0013=i\u000f,\u0006In\u0015$Qv\u0015/", "4h]._\bGW!z\n^+g\u0013=i\u000f,\u0006In\u0015$Qv\u00150", "Adc\u0019T:MA(z\n^\u001c\b\b+t\u007f\u0016yM\u000b\u001e\u001e", ":`bAF;:b\u0019n\u0006](\f\t\u001dc\r2\u0003Gs", ":`bAF;:b\u0019n\u0006](\f\t\u001dc\r2\u0003Gt", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class ReactScrollViewScrollState {
        private boolean isCanceled;
        private final int layoutDirection;
        private int scrollAwayPaddingTop;
        private final Point finalAnimatedPositionScroll = new Point();
        private final Point lastStateUpdateScroll = new Point(-1, -1);
        private boolean isFinished = true;
        private float decelerationRate = 0.985f;

        public ReactScrollViewScrollState(int i2) {
            this.layoutDirection = i2;
        }

        public final float getDecelerationRate() {
            return this.decelerationRate;
        }

        public final Point getFinalAnimatedPositionScroll() {
            return this.finalAnimatedPositionScroll;
        }

        public final Point getLastStateUpdateScroll() {
            return this.lastStateUpdateScroll;
        }

        public final int getLayoutDirection() {
            return this.layoutDirection;
        }

        public final int getScrollAwayPaddingTop() {
            return this.scrollAwayPaddingTop;
        }

        public final boolean isCanceled() {
            return this.isCanceled;
        }

        public final boolean isFinished() {
            return this.isFinished;
        }

        public final void setCanceled(boolean z2) {
            this.isCanceled = z2;
        }

        public final void setDecelerationRate(float f2) {
            this.decelerationRate = f2;
        }

        public final ReactScrollViewScrollState setFinalAnimatedPositionScroll(int i2, int i3) {
            this.finalAnimatedPositionScroll.set(i2, i3);
            return this;
        }

        public final void setFinished(boolean z2) {
            this.isFinished = z2;
        }

        public final ReactScrollViewScrollState setLastStateUpdateScroll(int i2, int i3) {
            this.lastStateUpdateScroll.set(i2, i3);
            return this;
        }

        public final void setScrollAwayPaddingTop(int i2) {
            this.scrollAwayPaddingTop = i2;
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я(\u001d<K!&i\u000eӵLш|\u0004O\u00068é6B\u0015\"4\u0012}\u0007njO0L͜P.`X2\u000fq{:\tqҕ\"CiTb\u000e0\tgN\u0016h\u001fPh\r[\u0011\u001c\u0015'mrm\u001e#k\u0016'2ppo9[qU;vsd\bP80=\u0012\u0007\u0017\u0019XN@z\tJc\f@8ptH[%M3\"X*ͽ\u001fҵȩ\\kV8N\f\f9ǫ'\rބFM"}, d2 = {"\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\r7i\u0014=;AHu;%\u0006laKic3Yv4\u0006:L9fYy$\u0018 i\u000eW+\u001aZ", "", "=m;.l6Nb", "", "Aba<_3/W\u0019\u0011", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "=mB0e6EZ", "Aba<_3\u001ed\u0019\b\nM@\b\t", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)U9\u001c:\u0004/<`G\u000e5z 5T#Lk=-\u0004|l9\\", "FUT9b*Bb-", "", "GUT9b*Bb-", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public interface ScrollListener {
        void onLayout(ViewGroup viewGroup);

        void onScroll(ViewGroup viewGroup, ScrollEventType scrollEventType, float f2, float f3);
    }

    /* JADX INFO: renamed from: com.facebook.react.views.scroll.ReactScrollViewHelper$dispatchMomentumEndOnAnimationEnd$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001b\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007\"2\u0014 \u0006߿pAFǏ\u0016H\\Q\u001c8\u001dk\u00144R\\TuQ=m\u001a,%Oc\u0017uurbZ9D?\n$z\u0003,wX?qZ\u001d@G\b?aN AGb\r63#x6\u0001\b\u0013\u00072*v\u0011'~QM$\u0012^C7NŎ\u0011T"}, d2 = {"1n\\{Y(<S\u0016\t\u0005du\n\t+c\u000fq\rD\u0001)%\u0011}\fI\u0001,<#j 3k%\u001cKPEr;\u000f\u0019hs\u001c\u0007j7N\u0004eFP\\7Xap@{\u001cb\u000eW:\u001d\r9J#XM\u0013(\f4E\u0011?r\nk\u001f\rs6", "\u001a`]1e6BRbz\u0004b4x\u00183o\tqWI\u0005\u001f\u0013Vy\u001bzR.9ay/Az|2[R;t4+j", "=m0;\\4:b\u001d\t\u0004<(\u0006\u0007/l", "", "/mX:T;H`", "\u001a`]1e6BRbz\u0004b4x\u00183o\tqWI\u0005\u001f\u0013Vy\u001b\u0012", "=m0;\\4:b\u001d\t\u0004>5{", "=m0;\\4:b\u001d\t\u0004K,\b\t+t", "=m0;\\4:b\u001d\t\u0004L;x\u0016>", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class AnonymousClass1 implements Animator.AnimatorListener {
        final /* synthetic */ ViewGroup $scrollView;

        AnonymousClass1(ViewGroup viewGroup) {
            viewGroup = viewGroup;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            ReactScrollViewHelper.emitScrollMomentumEndEvent(viewGroup);
            animator.removeListener(this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            ReactScrollViewHelper.emitScrollMomentumEndEvent(viewGroup);
            animator.removeListener(this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.views.scroll.ReactScrollViewHelper$registerFlingAnimator$1 */
    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u001b\u001d̉=!4i\bӵLc\u0003\u0004Iي8\u000bDB\u0007\"2\u0014 \u0006߿pAFǏ\u0016H\\Q\u001c8\u001dk\u00144R\\TuQ=m\u001a,%Oc\u0017uurbZ9D?\n$z\u0003,wX?qZ\u001d@G\b?aN AGb\r63#x6\u0001\b\u0013\u00072*v\u0011'~QM$\u0012^C7NŎ\u0011T"}, d2 = {"1n\\{Y(<S\u0016\t\u0005du\n\t+c\u000fq\rD\u0001)%\u0011}\fI\u0001,<#j 3k%\u001cKPEr;\u000f\u0019hs\u001c\u0007j7N\u0004eTLP0jarJt\u0019^\u0017P\u0007\u0016\ta=3xQuj", "\u001a`]1e6BRbz\u0004b4x\u00183o\tqWI\u0005\u001f\u0013Vy\u001bzR.9ay/Az|2[R;t4+j", "=m0;\\4:b\u001d\t\u0004<(\u0006\u0007/l", "", "/mX:T;H`", "\u001a`]1e6BRbz\u0004b4x\u00183o\tqWI\u0005\u001f\u0013Vy\u001b\u0012", "=m0;\\4:b\u001d\t\u0004>5{", "=m0;\\4:b\u001d\t\u0004K,\b\t+t", "=m0;\\4:b\u001d\t\u0004L;x\u0016>", " dP0g\bGR&\t~]&\n\t6e{6{"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class C11491 implements Animator.AnimatorListener {
        final /* synthetic */ ViewGroup $scrollView;

        C11491(ViewGroup viewGroup) {
            viewGroup = viewGroup;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            ((HasScrollState) viewGroup).getReactScrollViewScrollState().setCanceled(true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            ((HasScrollState) viewGroup).getReactScrollViewScrollState().setFinished(true);
            ReactScrollViewHelper.updateFabricScrollState(viewGroup);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Intrinsics.checkNotNullParameter(animator, "animator");
            ReactScrollViewScrollState reactScrollViewScrollState = ((HasScrollState) viewGroup).getReactScrollViewScrollState();
            reactScrollViewScrollState.setCanceled(false);
            reactScrollViewScrollState.setFinished(false);
        }
    }

    private ReactScrollViewHelper() {
    }

    @JvmStatic
    public static final void addScrollListener(ScrollListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        scrollListeners.add(new WeakReference<>(listener));
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollEventThrottle> void dispatchMomentumEndOnAnimationEnd(T t2) {
        t2.getFlingAnimator().addListener(new Animator.AnimatorListener() { // from class: com.facebook.react.views.scroll.ReactScrollViewHelper.dispatchMomentumEndOnAnimationEnd.1
            final /* synthetic */ ViewGroup $scrollView;

            AnonymousClass1(ViewGroup t22) {
                viewGroup = t22;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ReactScrollViewHelper.emitScrollMomentumEndEvent(viewGroup);
                animator.removeListener(this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ReactScrollViewHelper.emitScrollMomentumEndEvent(viewGroup);
                animator.removeListener(this);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }
        });
    }

    @JvmStatic
    public static final void emitLayoutEvent(ViewGroup scrollView) {
        Intrinsics.checkNotNullParameter(scrollView, "scrollView");
        Iterator<WeakReference<ScrollListener>> it = scrollListeners.iterator();
        while (it.hasNext()) {
            ScrollListener scrollListener = it.next().get();
            if (scrollListener != null) {
                scrollListener.onLayout(scrollView);
            }
        }
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollBeginDragEvent(T t2) {
        INSTANCE.emitScrollEvent(t2, ScrollEventType.BEGIN_DRAG);
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEndDragEvent(T t2, float f2, float f3) {
        emitScrollEvent$default(INSTANCE, t2, ScrollEventType.END_DRAG, f2, f3, false, 16, null);
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEvent(T t2, float f2, float f3) {
        emitScrollEvent$default(INSTANCE, t2, ScrollEventType.SCROLL, f2, f3, false, 16, null);
    }

    private final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEvent(T t2, ScrollEventType scrollEventType) {
        emitScrollEvent$default(this, t2, scrollEventType, 0.0f, 0.0f, false, 16, null);
    }

    private final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollEvent(T t2, ScrollEventType scrollEventType, float f2, float f3, boolean z2) {
        View childAt;
        long jCurrentTimeMillis = System.currentTimeMillis();
        T t3 = t2;
        if (t3.getScrollEventThrottle() < Math.max(17L, jCurrentTimeMillis - t3.getLastScrollDispatchTime()) && (childAt = t2.getChildAt(0)) != null) {
            Iterator<WeakReference<ScrollListener>> it = scrollListeners.iterator();
            while (it.hasNext()) {
                ScrollListener scrollListener = it.next().get();
                if (scrollListener != null) {
                    scrollListener.onScroll(t2, scrollEventType, f2, f3);
                }
            }
            Context context = t2.getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            ReactContext reactContext = (ReactContext) context;
            int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, t2.getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(ScrollEvent.Companion.obtain(surfaceId, t2.getId(), scrollEventType, t2.getScrollX(), t2.getScrollY(), f2, f3, childAt.getWidth(), childAt.getHeight(), t2.getWidth(), t2.getHeight(), z2));
                t3.setLastScrollDispatchTime(jCurrentTimeMillis);
            }
        }
    }

    static /* synthetic */ void emitScrollEvent$default(ReactScrollViewHelper reactScrollViewHelper, ViewGroup viewGroup, ScrollEventType scrollEventType, float f2, float f3, boolean z2, int i2, Object obj) {
        if ((-1) - (((-1) - i2) | ((-1) - 16)) != 0) {
            z2 = false;
        }
        reactScrollViewHelper.emitScrollEvent(viewGroup, scrollEventType, f2, f3, z2);
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollMomentumBeginEvent(T t2, int i2, int i3) {
        emitScrollEvent$default(INSTANCE, t2, ScrollEventType.MOMENTUM_BEGIN, i2, i3, false, 16, null);
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasScrollEventThrottle> void emitScrollMomentumEndEvent(T t2) {
        INSTANCE.emitScrollEvent(t2, ScrollEventType.MOMENTUM_END);
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasScrollState & HasStateWrapper> void forceUpdateState(T t2) {
        int i2;
        ReactScrollViewScrollState reactScrollViewScrollState = t2.getReactScrollViewScrollState();
        int scrollAwayPaddingTop = reactScrollViewScrollState.getScrollAwayPaddingTop();
        Point lastStateUpdateScroll = reactScrollViewScrollState.getLastStateUpdateScroll();
        int i3 = lastStateUpdateScroll.x;
        int i4 = lastStateUpdateScroll.y;
        if (reactScrollViewScrollState.getLayoutDirection() == 1) {
            View childAt = t2.getChildAt(0);
            i2 = -(((childAt != null ? childAt.getWidth() : 0) - i3) - t2.getWidth());
        } else {
            i2 = i3;
        }
        if (DEBUG_MODE) {
            FLog.i(TAG, "updateFabricScrollState[%d] scrollX %d scrollY %d fabricScrollX %d", Integer.valueOf(t2.getId()), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i2));
        }
        StateWrapper stateWrapper = t2.getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble(CONTENT_OFFSET_LEFT, PixelUtil.toDIPFromPixel(i3));
            writableNativeMap.putDouble(CONTENT_OFFSET_TOP, PixelUtil.toDIPFromPixel(i4));
            writableNativeMap.putDouble(SCROLL_AWAY_PADDING_TOP, PixelUtil.toDIPFromPixel(scrollAwayPaddingTop));
            stateWrapper.updateState(writableNativeMap);
        }
    }

    @JvmStatic
    public static final int getDefaultScrollAnimationDuration(Context context) {
        if (!smoothScrollDurationInitialized) {
            smoothScrollDurationInitialized = true;
            try {
                SMOOTH_SCROLL_DURATION = new OverScrollerDurationGetter(context).getScrollAnimationDuration();
            } catch (Throwable unused) {
            }
        }
        return SMOOTH_SCROLL_DURATION;
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState> int getNextFlingStartValue(T t2, int i2, int i3, int i4) {
        ReactScrollViewScrollState reactScrollViewScrollState = t2.getReactScrollViewScrollState();
        return (!reactScrollViewScrollState.isFinished() || (reactScrollViewScrollState.isCanceled() && ((i4 != 0 ? i4 / Math.abs(i4) : 0) * (i3 - i2) > 0))) ? i3 : i2;
    }

    @JvmStatic
    public static final int parseOverScrollMode(String str) {
        if (str == null) {
            return 1;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1414557169) {
            if (iHashCode != 3005871) {
                if (iHashCode == 104712844 && str.equals(OVER_SCROLL_NEVER)) {
                    return 2;
                }
            } else if (str.equals("auto")) {
                return 1;
            }
        } else if (str.equals(OVER_SCROLL_ALWAYS)) {
            return 0;
        }
        FLog.w(ReactConstants.TAG, "wrong overScrollMode: " + str);
        return 1;
    }

    @JvmStatic
    public static final int parseSnapToAlignment(String str) {
        if (str == null) {
            return 0;
        }
        if (StringsKt.equals(ViewProps.START, str, true)) {
            return 1;
        }
        if (StringsKt.equals("center", str, true)) {
            return 2;
        }
        if (Intrinsics.areEqual(ViewProps.END, str)) {
            return 3;
        }
        FLog.w(ReactConstants.TAG, "wrong snap alignment value: " + str);
        return 0;
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState> Point predictFinalScrollPosition(T t2, int i2, int i3, int i4, int i5) {
        ReactScrollViewScrollState reactScrollViewScrollState = t2.getReactScrollViewScrollState();
        OverScroller overScroller = new OverScroller(t2.getContext());
        overScroller.setFriction(1.0f - reactScrollViewScrollState.getDecelerationRate());
        int width = (t2.getWidth() - t2.getPaddingStart()) - t2.getPaddingEnd();
        int height = (t2.getHeight() - t2.getPaddingBottom()) - t2.getPaddingTop();
        Point finalAnimatedPositionScroll = reactScrollViewScrollState.getFinalAnimatedPositionScroll();
        overScroller.fling(getNextFlingStartValue(t2, t2.getScrollX(), finalAnimatedPositionScroll.x, i2), getNextFlingStartValue(t2, t2.getScrollY(), finalAnimatedPositionScroll.y, i3), i2, i3, 0, i4, 0, i5, width / 2, height / 2);
        return new Point(overScroller.getFinalX(), overScroller.getFinalY());
    }

    @JvmStatic
    public static final void removeScrollListener(ScrollListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        scrollListeners.remove(new WeakReference(listener));
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState & HasStateWrapper> void smoothScrollTo(T t2, int i2, int i3) {
        if (DEBUG_MODE) {
            FLog.i(TAG, "smoothScrollTo[%d] x %d y %d", Integer.valueOf(t2.getId()), Integer.valueOf(i2), Integer.valueOf(i3));
        }
        T t3 = t2;
        ValueAnimator flingAnimator = t3.getFlingAnimator();
        if (flingAnimator.getListeners() == null || flingAnimator.getListeners().size() == 0) {
            INSTANCE.registerFlingAnimator(t2);
        }
        t2.getReactScrollViewScrollState().setFinalAnimatedPositionScroll(i2, i3);
        int scrollX = t2.getScrollX();
        int scrollY = t2.getScrollY();
        if (scrollX != i2) {
            t3.startFlingAnimator(scrollX, i2);
        }
        if (scrollY != i3) {
            t3.startFlingAnimator(scrollY, i3);
        }
        if (ReactNativeFeatureFlags.fixIncorrectScrollViewStateUpdateOnAndroid()) {
            INSTANCE.updateFabricScrollState(t2, i2, i3);
        }
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollState & HasStateWrapper> void updateFabricScrollState(T t2) {
        INSTANCE.updateFabricScrollState(t2, t2.getScrollX(), t2.getScrollY());
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollEventThrottle & HasScrollState & HasStateWrapper> void updateStateOnScrollChanged(T t2, float f2, float f3) {
        updateStateOnScrollChanged(t2, f2, f3, false);
    }

    @JvmStatic
    public static final <T extends ViewGroup & HasFlingAnimator & HasScrollEventThrottle & HasScrollState & HasStateWrapper> void updateStateOnScrollChanged(T t2, float f2, float f3, boolean z2) {
        ReactScrollViewHelper reactScrollViewHelper = INSTANCE;
        reactScrollViewHelper.updateFabricScrollState(t2, t2.getScrollX(), t2.getScrollY());
        reactScrollViewHelper.emitScrollEvent(t2, ScrollEventType.SCROLL, f2, f3, z2);
    }

    public final <T extends ViewGroup & HasFlingAnimator & HasScrollState & HasStateWrapper> void registerFlingAnimator(T t2) {
        t2.getFlingAnimator().addListener(new Animator.AnimatorListener() { // from class: com.facebook.react.views.scroll.ReactScrollViewHelper.registerFlingAnimator.1
            final /* synthetic */ ViewGroup $scrollView;

            C11491(ViewGroup t22) {
                viewGroup = t22;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((HasScrollState) viewGroup).getReactScrollViewScrollState().setCanceled(true);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ((HasScrollState) viewGroup).getReactScrollViewScrollState().setFinished(true);
                ReactScrollViewHelper.updateFabricScrollState(viewGroup);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "animator");
                ReactScrollViewScrollState reactScrollViewScrollState = ((HasScrollState) viewGroup).getReactScrollViewScrollState();
                reactScrollViewScrollState.setCanceled(false);
                reactScrollViewScrollState.setFinished(false);
            }
        });
    }

    public final <T extends ViewGroup & HasScrollState & HasStateWrapper> void updateFabricScrollState(T t2, int i2, int i3) {
        if (DEBUG_MODE) {
            FLog.i(TAG, "updateFabricScrollState[%d] scrollX %d scrollY %d", Integer.valueOf(t2.getId()), Integer.valueOf(i2), Integer.valueOf(i3));
        }
        if (ViewUtil.getUIManagerType(t2.getId()) == 1) {
            return;
        }
        ReactScrollViewScrollState reactScrollViewScrollState = t2.getReactScrollViewScrollState();
        if (reactScrollViewScrollState.getLastStateUpdateScroll().equals(i2, i3)) {
            return;
        }
        reactScrollViewScrollState.setLastStateUpdateScroll(i2, i3);
        forceUpdateState(t2);
    }
}
