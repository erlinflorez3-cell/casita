package com.swmansion.gesturehandler.react;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerDelegate;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface;
import com.swmansion.gesturehandler.core.GestureHandler;
import com.swmansion.gesturehandler.core.NativeViewGestureHandler;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import yg.C1561oA;
import yg.C1607wl;
import yg.InterfaceC1492Gx;
import yg.ZN;
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
@Metadata(bv = {}, d1 = {"ЯL\u001d<K!&i\u0016DLc\u000b\u0004I\u0006F\u000b6B\u0005\"4\u0012\u000e\u0007nj?0Le^.ZS0\u000fs{B0cҕyCIU\"}(\nWNumvJ`\u000bK\u000f\u0014\u001b\u0001j2X]xk\u001b\u00172H|E8cڎ[l\u0011zF\u000702P8(\u00041 :J v)Cy\rJ0r$zUҫQ\u0005(\u0014NL.\u00066\\\u0016NfLzcR/Q\n0V\u00175m8\u0015U\u001dHd';vw\u001dYD}G]+a\f\u001fR\nIIS:K\u0013s?'YU$[De\u0018\u0014C+\u0016\u001f&\t4j\u001dQ\u000f\u0018W/]pcP<((~\n\u001cT\u0004<\u0016m]vC(w \u000ea\u0001#WN]\u001a^p\u007f+eD)=\u007fa>\u007f0/goO1Ne\b5\u0011,0\u0019nO[\u0005\u0012n*3T&dwf\tZVd\"Yky4tp\u000fB\u0004^G05\n(F\u0019;6\nIi6Ƞ\u0006HR\u007f?\u001bn\u0002ki\u0001Tp&|#O*7\f\u000bHr\u001f\u0004P\u0003kr&\u00164b\"\u0016\bA,\r{J.=\u0010|O\u0019oxiu\f;.\u0015A \u00044$eVv3c]\u0014\u0014o_\u000f\u0014m<\u0013\tf\u0005ZS:m#=jHV\n(w*P~\u0010!?WqJ4\\5'|-H11\tVE\u001fm{\u0001\u0010-`c(\u0011v<t7\u0001\u0001`~\u0012\u007fxw?CujCOtM\u0019TaRlB\n;\u0007-s0Kup_L\u001b;<jD6$@QQ]IC\u0013\r6J\u0002[E|vsxe\u0012U C\u000fWQvV\u007f\b\u0019|\\dxWgTE\"'b\u0001L d.\u001f([C]q~#[lU#\u0007gIf8+\u0005O\"3,\b\"+ZsXo:$$,/Cm\u000em};\u0012b=&%k\u0012Y{\u0018\u0006a\u007fmxPΒMY\rVj:z1ZH\u0019\u00048F\u0017A%3vA\u0015tdge\u000b]\u000e-\u001ct#~\u0007s:A{.8<lBsq}DbQV)M\u0002\r4\u0003\u001cn\u0019M'\u0010\u001b}An@\u001ck$-̳dס4\u0006{̸ݦEo"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[S7V[X5MVrO{\u000ec\nP+\u001aZ", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u0019z >X+7t0 \u0015u7", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[S7V[X5MVrO{\u000ec\nP+\u001aC6Q3}N@\u0010\f,[cHr\u0011\u0017k", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EQ\u0005\u0017)Ok\u00178x%BgG\r O\u0016<\\SHk\u0017\u001a\u001egh9\u0014@<]\u00061P4J5XTrJw\u001bi\u000e[,\t\u0003Y\u0017", "u(E", ";CT9X.:b\u0019", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n&]}2\u001fi\u001f*OCHJ4%\u0015j]H\u00079", "1qT.g,/W\u0019\u0011^g:\f\u00058c\u007f", "1n]AX?M", "\u001ab^:\"-:Q\u0019{\u0005h2F\u0016/a}7EP\u0005\u001f\u0013Pk\u0010<\u0004n$\\}(7l\u0003.IAJI>'$htH\\", "5dc\u0011X3>U\u0015\u000ez", "5dc\u001bT4>", "", "=m03g,KC$}vm,k\u0016+n\u000e$yO\u0005! ", "", "DhTD", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r", "0`R8Z9Hc\"}Xh3\u0007\u0016", "", "Adc\u000fb9=S&[\u0005m;\u0007\u0011\u0016e\u00017h<\u007f\u001b'U", "0na1X9\u001b](\u000e\u0005f\u0013|\n>R{'\u007fP\u000f", "", "Adc\u000fb9=S&[\u0005m;\u0007\u0011\u001ci\u0002+\u000b-|\u0016\u001bW}", "0na1X9\u001b](\u000e\u0005f\u0019\u0001\u000b2tl$zD\u0011%", "Adc\u000fb9=S&\\\u0005e6\n", "0na1X9\u001c] \t\b", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~f}\u001c5|_\u001b6%;yC.\"hD5\u0010b3N\u0004\u0004W[]6eCv=&yV\u0017J-\r\u0012\u0018\u001e4}SA(x0I\u0014\u001du\u000b\u001c!c\u001colSRYNu\u001ew\u000b\rqUYayT\u0017\tS", "Adc\u000fb9=S&kv]0\r\u0017", "0na1X9+O\u0018\u0003\u000bl", "Adc\u000fb9=S&l\nr3|", "0na1X9,b-\u0006z", "Adc\u000fb9=S&m\u0005i\u0013|\n>R{'\u007fP\u000f", "0na1X9-]$ez_;i\u0005.i\u00106", "Adc\u000fb9=S&m\u0005i\u0019\u0001\u000b2tl$zD\u0011%", "0na1X9-]$k~`/\fu+d\u00048\n", "Adc\u000fb9=S&p~];\u007f", "0na1X90W\u0018\u000e}", "Adc\u000fb9=S&\u0006zl:", "CrT\u000fb9=S&\u0006zl:[\u0016+w{%\u0003@", "", "Adc\u0012a(;Z\u0019}", "3mP/_,=", "Adc\u0012k*Ec'\u0003\f^", "3wR9h:Bd\u0019", "Adc\u0013b9>U&\t\u000bg+", "CrT\u0011e(PO\u0016\u0006zH5]\u0013<e\u00025\u0006P\n\u0016", "Adc\u001f\\7IZ\u0019\\\u0005e6\n", "@h_=_,\u001c] \t\b", "Adc\u001f\\7IZ\u0019kv]0\r\u0017", "@h_=_,+O\u0018\u0003\u000bl", "Adc!b<<V\u0007\t\u000bg+[\r=a|/{?", "Bnd0[\u001aHc\"}Yb:x\u00066e~", "\u0010tcAb5/W\u0019\u0011\\k6\r\u0014", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
@ReactModule(name = "\u0012\r\u0005\"///+\u001d~\u0017#\u0018\u001f\u0017#q$\"!\u001b\u0019")
public final class RNGestureHandlerButtonViewManager extends ViewGroupManager<ButtonViewGroup> implements RNGestureHandlerButtonManagerInterface<ButtonViewGroup> {
    public static final Companion Companion = new Companion(null);
    public static final String REACT_CLASS = "RNGestureHandlerButton";
    private final ViewManagerDelegate<ButtonViewGroup> mDelegate = new RNGestureHandlerButtonManagerDelegate(this);

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Яđ\u0014D57\u001eq\u007fZDkt\u001aA\u000eֶ\u0013.X~*,\u0018w\u000ffx?8ǏmH<W[*\u0015|\u000442g,qII]\u001a\f+\u0011OToonXa\u0013C\u0015\u0014\u001exx,Qǁ\u0001](\u000f:ԏw?A_wމA`\u000b6\r 8\"@y\u001b\u0001\"*N\u0014~zYK\u0014\u00126@x:h\rU\u00050\u0012\u000e>&\u0001&\\}N>Hr_B/9\u0003qBT9g0\u0013M\u0015FZ'#Ǹ\u007f\u0019[@e4E%\u0002\u0003?QV\u007f\u0010OwK\u0006\u0001)=*wuɱ:X\u000e\u0017]9]TurT%5UnU?+}.\u0012dV.\u0006F\u0014\rjPT\u0006oP<z2h\u001e\raC9S\t^\u0010.Z\u007f)\u000ef\u001b3IK+ge-e*A'\u001fO{3^d#Iv/.l\u0010v\u0014I&>QygN\u0011`N8\"mq\u0012Ez\u0002X\u000b`K\u000e\u0005\u0014\u0011\\\u001ekK$O1w\u0004\u0002v\r\u0018z\u00135\u0001S\u0018YxD0D.7X\u0010Rn\rl\u0013ChVn+?&bTO\u0014\u0016l8\\&hQ1\u0016N]C\u0002p]_\u001a%]Ce55kVeG<K5\u007f,@e`U,?jBKl/Palr\\VNbLxq\u0010{r\u0019R'zW\u007f~L,_E\r\u0019Vf6Bo\u00029eh2(\u0001j2Rg08=7\u000f6tp\u001e0)M:cx\"[m\u00029'\u000em\"\u00179-'\u0015g\f\u007ful|KZV.u\u0004\u0001P\u001a($i/k\u0018U\u0011q@\u0010\u0019]L!\u0012\u0002Q p\u0013|(Y\u0002}vm\u0016W\t,\u000f\u0017\u0011c\u001d%0dvrQP\u0015\u0004\bq^zuh\u001b\u001f$LWa\u001bYj\u0017h\u0001\u0013\u000f6%/\u001ch\u0011}3Q\u00185\u0016&\\u\u0015*cwaFy\u0011;lt.\b:V.o\u0011\u001a&RI,aY-\u0007R(zwZH\u0019|8F\u0017*%3v\u0013\u0015vd/e\rE|\u0015Xr\r9ki2+o,|^i8l[\u0004$`S%?\u0016\u0002a4ޱQ-\u0017X\u0013\"\u000b*6Eܡ(ݞ$V_łYR\u0014{06oB\u0013\tJ\u000f<4ZCFO\u001aҔuѕ\u0014\u0007\bʋw\u0011\u001d;P}[X\u0014_\u0007h'j\u0013m]`O11\u0003\u001d96xc8C2\u001d߃;ҕ6\r[߹!\u001dp]\rpE-JcG'x\u0001\u000f\u001c]_YH0;4M7}\u0004q\"7F\u0002[\u0007nÎEݔ\u0015m~0l!mfTv\u0005%\u0007TT67\u0014K\u001f\u001cS\"\u000f9 \u007fv}hEL|~u\bp\u074c#ؐ-\u0013\u0014ű{H!E\u0014?M?O\u0004\"3L}aW\u0016\n6\u001fU\u001f%'jq&h \\IUT6lȏ\u000eƤ\u0017\\(ɌFLz\u0010\u0018L(8U!A\"c\u0001g\r\u0010!n.[p\u0014Hch'\u0011\"1:ߢa̦\u0007r9ؼ\u0012p3r+\u0013GO46ff\u000b3aDp\u0011.\u001bE*-< bW\u0017\u000e(?һwϪ_\u00193Ԛ\u0004,gV>\\>\u007f% \u0004\u0010zv6=SV{E\u0015\rj\u0014ZW<e)l;Í\u0018ì\u0018\t\u0007Ĝv\u0013\u0019]T|>f5a'+,%U\f\u001f\u0004su|Ϻ=ĿC'?ָ#q.$\u001f1Zdz/8rY\u0005\u000e\u0019D-t\u0001sZ}ڕ&މh\u0007>MKjP6|)\u001cDGZfL\u0015ѕ&̄?];߿1\u0013\u0007HF4\u0010\t\u001fix\u0002$186\u0015\u0001;DP۪wÂw7z܌\u007f\u001b}Qofi\\\f\u0590Xۡ\u0010\u0002mڄOYq\u000f'aZu\f\u0099*¼Y@\bʩo02?\u000e#.q\b\u05fd6ن`@^؛(,4dNpZ\"uq)y\u0018<\u0002\u001a\nc\nfr\u0006Qߴ%ܵB85l\u0015[ej\u007fFR e\u0016=K\u0014>\u0004?\u000bMgsV*ww}5jcT\u0015\n\u0003h7 zPàLĐ.\u00145\u0012by\u0003ls\u0010m#X\u0014\u0013L\u0012\r\u0002jn@x\u001dFS\"ĻRր`\u0005Uکz\rFP2\rND\u0012M\u0014F~j%F\u0016J\u000fAC7U7YG@\u0003:esǕg\u074c\n1o߳_A[7fkY5\u00114X\t˫iX"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[S7V[X5MVrO{\u000ec\nP+\u001aC6Q3}N@\u0010\f,[cHr\u0011\u0017k", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012\n\tJ\u0011\"l", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004n3c\u000b \u0001V\u0012=QT;\\8\u001e'JaG\u0016s9NY#PKU,i\u0011[9#\u0016k\u000e?/\r\u0017;A2}TD\u001fj(R\u0001Bh\u000en \u0018;@", "1n]AX?M", "\u001a`]1e6BRb|\u0005g;|\u0012>/]2\u0005O\u0001*&\u001d", "uKP;W9HW\u0018Hxh5\f\t8tI\u0006\u0006I\u0010\u0017*VEQ-", "-aP0^.K])\by<6\u0004\u0013<", "", "@`S6h:", "", "0na1X9\u001b](\u000e\u0005f\u0013|\n>R{'\u007fP\u000f", "5dc\u000fb9=S&[\u0005m;\u0007\u0011\u0016e\u00017h<\u007f\u001b'U", "u(5", "Adc\u000fb9=S&[\u0005m;\u0007\u0011\u0016e\u00017h<\u007f\u001b'U", "uE\u0018#", "0na1X9\u001b](\u000e\u0005f\u0019\u0001\u000b2tl$zD\u0011%", "5dc\u000fb9=S&[\u0005m;\u0007\u0011\u001ci\u0002+\u000b-|\u0016\u001bW}", "Adc\u000fb9=S&[\u0005m;\u0007\u0011\u001ci\u0002+\u000b-|\u0016\u001bW}", "1n[<e", "0na1X9\u001c] \t\b", "5dc\u000fb9=S&\\\u0005e6\n", "u(;7T=:\u001d z\u0004`u`\u0012>e\u0002(\t\u0016", "Adc\u000fb9=S&\\\u0005e6\n", "uKY.i(\bZ\u0015\b|(\u0010\u0006\u0018/g\u007f5Q\u0004q", "\u001aiPCTuEO\"\u0001DB5\f\t1e\r}", "0na1X9+O\u0018\u0003\u000bl", "5dc\u000fb9=S&kv]0\r\u0017", "Adc\u000fb9=S&kv]0\r\u0017", "Ash9X", "", "0na1X9,b-\u0006z", "5dc\u000fb9=S&l\nr3|", "u(;7T=:\u001d z\u0004`uj\u0018<i\t*Q", "Adc\u000fb9=S&l\nr3|", "uKY.i(\bZ\u0015\b|(\u001a\f\u00163n\u0002}?1", "0na1X9-]$ez_;i\u0005.i\u00106", "5dc\u000fb9=S&m\u0005i\u0013|\n>R{'\u007fP\u000f", "Adc\u000fb9=S&m\u0005i\u0013|\n>R{'\u007fP\u000f", "0na1X9-]$k~`/\fu+d\u00048\n", "5dc\u000fb9=S&m\u0005i\u0019\u0001\u000b2tl$zD\u0011%", "Adc\u000fb9=S&m\u0005i\u0019\u0001\u000b2tl$zD\u0011%", "EhSA[", "0na1X90W\u0018\u000e}", "5dc\u000fb9=S&p~];\u007f", "Adc\u000fb9=S&p~];\u007f", "3wR9h:Bd\u0019", "", "5dc\u0012k*Ec'\u0003\f^", "u(I", "Adc\u0012k*Ec'\u0003\f^", "uY\u0018#", "6`b\u000fb9=S&kv]0\u0001", "5dc\u0015T:\u001b]&}zk\u0019x\b3i", "7rC<h*AS\u0018", "Adc!b<<V\u0019}", ":`bA4*MW#\b", ":`bA8=>\\(m~f,", "", "<dT15(<Y\u001b\f\u0005n5{x:d{7{", "@dR2\\=>R~~\u000f>=|\u0012>", "@h_=_,\u001c] \t\b", "5dc\u001f\\7IZ\u0019\\\u0005e6\n", "Adc\u001f\\7IZ\u0019\\\u0005e6\n", "@h_=_,+O\u0018\u0003\u000bl", "5dc\u001f\\7IZ\u0019kv]0\r\u0017", "Adc\u001f\\7IZ\u0019kv]0\r\u0017", "CrT\u000fb9=S&\u0006zl:[\u0016+w{%\u0003@", "5dc\"f,\u001b]&}zk3|\u0017=D\r$\u000e<}\u001e\u0017", "Adc\"f,\u001b]&}zk3|\u0017=D\r$\u000e<}\u001e\u0017", "CrT\u0013b9>U&\t\u000bg+", "CrT\u0011e(PO\u0016\u0006zH5]\u0013<e\u00025\u0006P\n\u0016", "5dc\"f,\u001d`\u0015\u0011v[3|r8F\n5{B\u000e!'Pn", "Adc\"f,\u001d`\u0015\u0011v[3|r8F\n5{B\u000e!'Pn", "/ec2e\u000e>a(\u000f\b^\f\u0006\b", "", "3uT;g", "\u001a`]1e6BRb\u0010~^>Fp9t\u00042\u0005 \u0012\u0017 VE", "0tX9W\tH`\u0018~\bK({\r3", "", "0tX9W\tH`\u0018~\bL;\u0011\u0010/", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI\u0013wO\u0004v\u0018Ho\fKL", "1`]\u000fX.B\\", "1qT.g,\u001b]&}zk\u000b\n\u0005Aa|/{", "\u001a`]1e6BRb\u0001\bZ7\u007f\r-sI'\t<\u0013\u0013\u0014NoW\u001b\u0004!GUz'7C", "1qT.g,,S ~xm(y\u0010/D\r$\u000e<}\u001e\u0017", "2hb=T;<Vw\fvp(y\u0010/H\n7\nK\u000b&tJk\u0017>v$", "F", "G", "2qPDT)ES{\t\nl7\u0007\u0018\rh{1}@\u007f", "4h]1:,Lb)\fzA(\u0006\b6e\r\u0015\u0006J\u0010\b\u001bG\u0002", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[c1Q[?0\\dH", "7r25\\3=B#\u000fxa,{", "1gX9W9>\\", "\u001aj^A_0G\u001d'~\u0007n,\u0006\u0007/sI\u0016{L\u0011\u0017 Eoc", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012}", "=m8;\\;BO \u0003\u0010^\bz\u0007/s\u000e,xD\b\u001b&[X\u0018;v\t>Z\b", "7mU<", "\u001a`]1e6BRb\u0010~^>F\u0005-c\u007f6\nD}\u001b\u001eK~\"\u0006R#3Y\f.;j\u001a5QROT>\u001d\u0015Lj:\u00119", "=m8;g,KQ\u0019\n\nM6\r\u00072E\u0011(\u0005O", "3u", "=m:2l\u001cI", "9dh\u0010b+>", "\u001a`]1e6BRb\u0010~^>Fn/y_9{I\u0010l", "=m;.l6Nb", "1gP;Z,=", Global.COLON, "B", "@", AdkSettings.PLATFORM_TYPE_MOBILE, "=mC<h*A3*~\u0004m", ">da3b9F1 \u0003xd", "Adc\u000fT*DU&\t\u000bg+Z\u00136o\r", "Adc\u001de,La\u0019}", ">qT@f,=", "Bqh\u0013e,>W\"\u0001g^:\b\u00138d\u007f5", "Bqh\u0014e(;P\u001d\b|K,\u000b\u00149n~(\t", "CoS.g,\u001bO\u0017\u0005|k6\r\u0012.", "CoS.g,\u001bO\u0017\u0005|k6\r\u0012.C\n/\u0006M", "0`R8Z9Hc\"}Xh3\u0007\u0016", "0na1X9\u001d`\u0015\u0011v[3|", "Ad[2V;:P ~", "Ehc55(<Y\u001b\f\u0005n5{x:d{7{", "0k^0^", "\u001aj^A_0G\u001dy\u000f\u0004\\;\u0001\u001380U", "\u0011n\\=T5B]\"", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class ButtonViewGroup extends ViewGroup implements NativeViewGestureHandler.NativeViewGestureHandlerHook {
        private static ButtonViewGroup soundResponder = null;
        private static ButtonViewGroup touchResponder = null;
        private int _backgroundColor;
        private float borderBottomLeftRadius;
        private float borderBottomRightRadius;
        private Integer borderColor;
        private float borderRadius;
        private String borderStyle;
        private float borderTopLeftRadius;
        private float borderTopRightRadius;
        private float borderWidth;
        private boolean exclusive;
        private boolean isTouched;
        private int lastAction;
        private long lastEventTime;
        private boolean needBackgroundUpdate;
        private boolean receivedKeyEvent;
        private Integer rippleColor;
        private Integer rippleRadius;
        private boolean useBorderlessDrawable;
        private boolean useDrawableOnForeground;
        public static final Companion Companion = new Companion(null);
        private static TypedValue resolveOutValue = new TypedValue();
        private static View.OnClickListener dummyClickListener = new View.OnClickListener() { // from class: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$ButtonViewGroup$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RNGestureHandlerButtonViewManager.ButtonViewGroup.m8742instrumented$0$static$V(view);
            }
        };

        @InterfaceC1492Gx
        @Metadata(bv = {}, d1 = {"Я&\u001d<K!&i\u000eӵLcz\u0004I\u0006F\u000b6B\u0005%4\u0012\u000e\u0007nj?3Le^.ZS0\u0015qڛ5:ӋTqq:\u0016\u001f\u0004\"\u07beSNug?bh\f[\u000f4\u0018O̚8֒Y\u0005e܈'4HrM7mqC>nz\u0007\u001d.9:8(\rWɤ6Н\u0014\u0003\u0003ŏc\u000e\u00189NzZT\u0013X\u0013&b L-\u0019 rf|D\u001fǔiƠ3/\u000b݃ZP-n>\rm\u000fLe5\u001fG{,>X9K\u0014SaYޞ^ÜC\u000fGмU\u0007n;5;iu]Kf\u0012Е\u0019A"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[S7V[X5MVrO{\u000ec\nP+\u001aC6Q3}N@\u0010\f,[cHr\u0011\u0017Tk?r{>_\u0014Q\u0003j", "", "u(E", "2t\\:l\nEW\u0017\u0005ab:\f\t8e\r", "\u001a`]1e6BRb\u0010~^>Fy3e\u0012feI^\u001e\u001bEut@\u000545b}-\r", "5dc\u0011h4Fgv\u0006~\\2c\r=t\u007f1{M", "u(;.a+K]\u001d}Do0|\u001bxV\u0004(\u000e~j tNs\fB])Ch})7zk", "Adc\u0011h4Fgv\u0006~\\2c\r=t\u007f1{M", "uKP;W9HW\u0018H\fb,\u000fR i\u007f::*\nt\u001eKm\u0014#z3DY\u0007 DCY\u001f", "@db<_=>=)\u000ekZ3\r\t", "\u001a`]1e6BRb\u000f\nb3FwCp\u007f'l<\b'\u0017\u001d", "5dc\u001fX:HZ*~dn;m\u00056u\u007f", "u(;.a+K]\u001d}Dn;\u0001\u0010xT\u00143{?q\u0013\u001eWoc", "Adc\u001fX:HZ*~dn;m\u00056u\u007f", "uKP;W9HW\u0018H\u000bm0\u0004R\u001ey\u000b(z1|\u001e'GEQ-", "And;W\u0019>a$\t\u0004],\n", "\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[S7V[X5MVrO{\u000ec\nP+\u001aC6Q3}N@\u0010\f,[cHr\u0011\u0017k", "5dc b<GR\u0006~\ti6\u0006\b/r", "u(;0b4\ba+\u0007vg:\u0001\u00138/\u0002(\nO\u0011$\u0017Jk\u0017;}%B#\u000b 3k%w:,\u001dkB-%ua\u001c\u0003l+Uv4$\\];f[cA\u0014$B\nW'\u000f\u0005f\u007f\u0001~SF)\u0011\u001dM\u0002MJ\u000e\u0016&\u0019\u000b", "Adc b<GR\u0006~\ti6\u0006\b/r", "uKR<`uLe!z\u0004l0\u0007\u0012xg\u007f6\u000bP\u000e\u0017\u001aCx\rCv2~f}\u001c5|_\u001b6%;yC.\"hD5\u0010b3N\u0004\u0004W[]6eCv=&yV\u0017J-\r\u0012\u0018\u001e4}SA(x0I\u0014\u001du\u000b\u001c!cx[", "Bnd0[\u0019>a$\t\u0004],\n", "5dc!b<<V\u0006~\ti6\u0006\b/r", "Adc!b<<V\u0006~\ti6\u0006\b/r", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final View.OnClickListener getDummyClickListener() {
                return ButtonViewGroup.dummyClickListener;
            }

            public final TypedValue getResolveOutValue() {
                return ButtonViewGroup.resolveOutValue;
            }

            public final ButtonViewGroup getSoundResponder() {
                return ButtonViewGroup.soundResponder;
            }

            public final ButtonViewGroup getTouchResponder() {
                return ButtonViewGroup.touchResponder;
            }

            public final void setDummyClickListener(View.OnClickListener onClickListener) {
                Intrinsics.checkNotNullParameter(onClickListener, "<set-?>");
                ButtonViewGroup.dummyClickListener = onClickListener;
            }

            public final void setResolveOutValue(TypedValue typedValue) {
                Intrinsics.checkNotNullParameter(typedValue, "<set-?>");
                ButtonViewGroup.resolveOutValue = typedValue;
            }

            public final void setSoundResponder(ButtonViewGroup buttonViewGroup) {
                ButtonViewGroup.soundResponder = buttonViewGroup;
            }

            public final void setTouchResponder(ButtonViewGroup buttonViewGroup) {
                ButtonViewGroup.touchResponder = buttonViewGroup;
            }
        }

        public ButtonViewGroup(Context context) {
            super(context);
            this.borderStyle = "solid";
            this.exclusive = true;
            this.lastEventTime = -1L;
            this.lastAction = -1;
            setOnClickListener(dummyClickListener);
            setClickable(true);
            setFocusable(true);
            this.needBackgroundUpdate = true;
            setClipChildren(false);
        }

        private final float[] buildBorderRadii() {
            float f2 = this.borderTopLeftRadius;
            float f3 = this.borderTopRightRadius;
            float f4 = this.borderBottomRightRadius;
            float f5 = this.borderBottomLeftRadius;
            float[] fArr = {f2, f2, f3, f3, f4, f4, f5, f5};
            ArrayList arrayList = new ArrayList(8);
            for (int i2 = 0; i2 < 8; i2++) {
                float f6 = fArr[i2];
                if (f6 == 0.0f) {
                    f6 = this.borderRadius;
                }
                arrayList.add(Float.valueOf(f6));
            }
            return CollectionsKt.toFloatArray(arrayList);
        }

        private final PathEffect buildBorderStyle() {
            String str = this.borderStyle;
            if (Intrinsics.areEqual(str, "dotted")) {
                float f2 = this.borderWidth;
                return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
            }
            if (!Intrinsics.areEqual(str, "dashed")) {
                return null;
            }
            float f3 = this.borderWidth;
            float f4 = 3;
            return new DashPathEffect(new float[]{f3 * f4, f3 * f4, f3 * f4, f3 * f4}, 0.0f);
        }

        private final Drawable createBorderDrawable() {
            PaintDrawable paintDrawable = new PaintDrawable(0);
            if (getHasBorderRadii()) {
                paintDrawable.setCornerRadii(buildBorderRadii());
            }
            if (this.borderWidth > 0.0f) {
                Paint paint = paintDrawable.getPaint();
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.borderWidth);
                Integer num = this.borderColor;
                paint.setColor(num != null ? num.intValue() : ViewCompat.MEASURED_STATE_MASK);
                paint.setPathEffect(buildBorderStyle());
            }
            return paintDrawable;
        }

        private final Drawable createSelectableDrawable() throws Throwable {
            ColorStateList colorStateList;
            Integer num = this.rippleColor;
            if (num != null && num.intValue() == 0) {
                return null;
            }
            int[][] iArr = {new int[]{R.attr.state_enabled}};
            Integer num2 = this.rippleRadius;
            Integer num3 = this.rippleColor;
            if (num3 != null) {
                Intrinsics.checkNotNull(num3);
                colorStateList = new ColorStateList(iArr, new int[]{num3.intValue()});
            } else {
                Context context = getContext();
                Object[] objArr = new Object[0];
                Method method = Class.forName(hg.Vd("2>3@<5/w,75:*27o\u0004/-2\"4/", (short) (C1607wl.Xd() ^ 6828), (short) (C1607wl.Xd() ^ 10215))).getMethod(C1561oA.ud(">;I(;7>5", (short) (ZN.Xd() ^ 14182)), new Class[0]);
                try {
                    method.setAccessible(true);
                    ((Resources.Theme) method.invoke(context, objArr)).resolveAttribute(R.attr.colorControlHighlight, resolveOutValue, true);
                    colorStateList = new ColorStateList(iArr, new int[]{resolveOutValue.data});
                } catch (InvocationTargetException e2) {
                    throw e2.getCause();
                }
            }
            RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, null, this.useBorderlessDrawable ? null : new ShapeDrawable(new RectShape()));
            if (num2 != null) {
                rippleDrawable.setRadius((int) PixelUtil.toPixelFromDIP(num2.intValue()));
            }
            return rippleDrawable;
        }

        private static final void dummyClickListener$lambda$14(View view) {
        }

        private final RNGestureHandlerRootView findGestureHandlerRootView() {
            RNGestureHandlerRootView rNGestureHandlerRootView = null;
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof RNGestureHandlerRootView) {
                    rNGestureHandlerRootView = (RNGestureHandlerRootView) parent;
                }
            }
            return rNGestureHandlerRootView;
        }

        private final boolean getHasBorderRadii() {
            return (this.borderRadius == 0.0f && this.borderTopLeftRadius == 0.0f && this.borderTopRightRadius == 0.0f && this.borderBottomLeftRadius == 0.0f && this.borderBottomRightRadius == 0.0f) ? false : true;
        }

        /* JADX INFO: renamed from: instrumented$0$static$--V */
        public static /* synthetic */ void m8742instrumented$0$static$V(View view) {
            Callback.onClick_enter(view);
            try {
                dummyClickListener$lambda$14(view);
            } finally {
                Callback.onClick_exit();
            }
        }

        private final boolean isChildTouched(Sequence<? extends View> sequence) {
            for (View view : sequence) {
                if (view instanceof ButtonViewGroup) {
                    ButtonViewGroup buttonViewGroup = (ButtonViewGroup) view;
                    if (buttonViewGroup.isTouched || buttonViewGroup.isPressed()) {
                        return true;
                    }
                }
                if ((view instanceof ViewGroup) && isChildTouched(ViewGroupKt.getChildren((ViewGroup) view))) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        static /* synthetic */ boolean isChildTouched$default(ButtonViewGroup buttonViewGroup, Sequence sequence, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                sequence = ViewGroupKt.getChildren(buttonViewGroup);
            }
            return buttonViewGroup.isChildTouched(sequence);
        }

        private final void tryFreeingResponder() {
            if (touchResponder == this) {
                touchResponder = null;
                soundResponder = this;
            }
        }

        private final boolean tryGrabbingResponder() {
            if (isChildTouched$default(this, null, 1, null)) {
                return false;
            }
            ButtonViewGroup buttonViewGroup = touchResponder;
            if (buttonViewGroup == null) {
                touchResponder = this;
                return true;
            }
            if (!this.exclusive) {
                if (!(buttonViewGroup != null ? buttonViewGroup.exclusive : false)) {
                    return true;
                }
            } else if (buttonViewGroup == this) {
                return true;
            }
            return false;
        }

        private final void updateBackgroundColor(int i2, Drawable drawable, Drawable drawable2) {
            PaintDrawable paintDrawable = new PaintDrawable(i2);
            if (getHasBorderRadii()) {
                paintDrawable.setCornerRadii(buildBorderRadii());
            }
            setBackground(new LayerDrawable(drawable2 != null ? new Drawable[]{paintDrawable, drawable2, drawable} : new Drawable[]{paintDrawable, drawable}));
        }

        private final void withBackgroundUpdate(Function0<Unit> function0) {
            function0.invoke();
            this.needBackgroundUpdate = true;
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public void afterGestureEnd(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            tryFreeingResponder();
            this.isTouched = false;
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean canActivate(View view) {
            return NativeViewGestureHandler.NativeViewGestureHandlerHook.DefaultImpls.canActivate(this, view);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean canBegin(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (event.getAction() == 3 || event.getAction() == 1 || event.getActionMasked() == 6) {
                return false;
            }
            boolean zTryGrabbingResponder = tryGrabbingResponder();
            if (zTryGrabbingResponder) {
                this.isTouched = true;
            }
            return zTryGrabbingResponder;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDrawableHotspotChanged(float f2, float f3) {
        }

        @Override // android.view.View
        public void drawableHotspotChanged(float f2, float f3) {
            ButtonViewGroup buttonViewGroup = touchResponder;
            if (buttonViewGroup == null || buttonViewGroup == this) {
                super.drawableHotspotChanged(f2, f3);
            }
        }

        public final float getBorderBottomLeftRadius() {
            return this.borderBottomLeftRadius;
        }

        public final float getBorderBottomRightRadius() {
            return this.borderBottomRightRadius;
        }

        public final Integer getBorderColor() {
            return this.borderColor;
        }

        public final float getBorderRadius() {
            return this.borderRadius;
        }

        public final String getBorderStyle() {
            return this.borderStyle;
        }

        public final float getBorderTopLeftRadius() {
            return this.borderTopLeftRadius;
        }

        public final float getBorderTopRightRadius() {
            return this.borderTopRightRadius;
        }

        public final float getBorderWidth() {
            return this.borderWidth;
        }

        public final boolean getExclusive() {
            return this.exclusive;
        }

        public final Integer getRippleColor() {
            return this.rippleColor;
        }

        public final Integer getRippleRadius() {
            return this.rippleRadius;
        }

        public final boolean getUseBorderlessDrawable() {
            return this.useBorderlessDrawable;
        }

        public final boolean getUseDrawableOnForeground() {
            return this.useDrawableOnForeground;
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public void handleEventBeforeActivation(MotionEvent motionEvent) {
            NativeViewGestureHandler.NativeViewGestureHandlerHook.DefaultImpls.handleEventBeforeActivation(this, motionEvent);
        }

        public final boolean isTouched() {
            return this.isTouched;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            super.onInitializeAccessibilityNodeInfo(info);
            Object tag = super.getTag(com.facebook.react.R.id.react_test_id);
            if (tag instanceof String) {
                info.setViewIdResourceName((String) tag);
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent ev) {
            Intrinsics.checkNotNullParameter(ev, "ev");
            if (super.onInterceptTouchEvent(ev)) {
                return true;
            }
            onTouchEvent(ev);
            return isPressed();
        }

        @Override // android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyUp(int i2, KeyEvent keyEvent) {
            this.receivedKeyEvent = true;
            return super.onKeyUp(i2, keyEvent);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            long eventTime = event.getEventTime();
            int action = event.getAction();
            ButtonViewGroup buttonViewGroup = touchResponder;
            if (buttonViewGroup != null && buttonViewGroup != this) {
                Intrinsics.checkNotNull(buttonViewGroup);
                if (buttonViewGroup.exclusive) {
                    if (isPressed()) {
                        setPressed(false);
                    }
                    this.lastEventTime = eventTime;
                    this.lastAction = action;
                    return false;
                }
            }
            if (event.getAction() == 3) {
                tryFreeingResponder();
            }
            if (this.lastEventTime == eventTime && this.lastAction == action && action != 3) {
                return false;
            }
            this.lastEventTime = eventTime;
            this.lastAction = action;
            return super.onTouchEvent(event);
        }

        @Override // android.view.View
        public boolean performClick() {
            if (isChildTouched$default(this, null, 1, null)) {
                return false;
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (ExtensionsKt.isScreenReaderOn(context)) {
                RNGestureHandlerRootView rNGestureHandlerRootViewFindGestureHandlerRootView = findGestureHandlerRootView();
                if (rNGestureHandlerRootViewFindGestureHandlerRootView != null) {
                    rNGestureHandlerRootViewFindGestureHandlerRootView.activateNativeHandlers(this);
                }
            } else if (this.receivedKeyEvent) {
                RNGestureHandlerRootView rNGestureHandlerRootViewFindGestureHandlerRootView2 = findGestureHandlerRootView();
                if (rNGestureHandlerRootViewFindGestureHandlerRootView2 != null) {
                    rNGestureHandlerRootViewFindGestureHandlerRootView2.activateNativeHandlers(this);
                }
                this.receivedKeyEvent = false;
            }
            if (soundResponder != this) {
                return false;
            }
            tryFreeingResponder();
            soundResponder = null;
            return super.performClick();
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public Boolean sendTouchEvent(View view, MotionEvent motionEvent) {
            return NativeViewGestureHandler.NativeViewGestureHandlerHook.DefaultImpls.sendTouchEvent(this, view, motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundColor(int i2) {
            this._backgroundColor = i2;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderBottomLeftRadius(float f2) {
            this.borderBottomLeftRadius = f2 * getResources().getDisplayMetrics().density;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderBottomRightRadius(float f2) {
            this.borderBottomRightRadius = f2 * getResources().getDisplayMetrics().density;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderColor(Integer num) {
            this.borderColor = num;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderRadius(float f2) {
            this.borderRadius = f2 * getResources().getDisplayMetrics().density;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderStyle(String str) {
            this.borderStyle = str;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderTopLeftRadius(float f2) {
            this.borderTopLeftRadius = f2 * getResources().getDisplayMetrics().density;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderTopRightRadius(float f2) {
            this.borderTopRightRadius = f2 * getResources().getDisplayMetrics().density;
            this.needBackgroundUpdate = true;
        }

        public final void setBorderWidth(float f2) {
            this.borderWidth = f2 * getResources().getDisplayMetrics().density;
            this.needBackgroundUpdate = true;
        }

        public final void setExclusive(boolean z2) {
            this.exclusive = z2;
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0018  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void setPressed(boolean r4) {
            /*
                r3 = this;
                if (r4 == 0) goto La
                boolean r0 = r3.tryGrabbingResponder()
                if (r0 == 0) goto La
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.ButtonViewGroup.soundResponder = r3
            La:
                boolean r0 = r3.exclusive
                r2 = 0
                if (r0 != 0) goto L18
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$ButtonViewGroup r0 = com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.ButtonViewGroup.touchResponder
                r1 = 1
                if (r0 == 0) goto L2f
                boolean r0 = r0.exclusive
                if (r0 != r1) goto L2f
            L18:
                r1 = r2
            L19:
                if (r4 == 0) goto L21
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$ButtonViewGroup r0 = com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.ButtonViewGroup.touchResponder
                if (r0 == r3) goto L21
                if (r1 == 0) goto L26
            L21:
                r3.isTouched = r4
                super.setPressed(r4)
            L26:
                if (r4 != 0) goto L2e
                com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$ButtonViewGroup r0 = com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.ButtonViewGroup.touchResponder
                if (r0 != r3) goto L2e
                r3.isTouched = r2
            L2e:
                return
            L2f:
                r0 = 0
                boolean r0 = isChildTouched$default(r3, r0, r1, r0)
                if (r0 != 0) goto L18
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager.ButtonViewGroup.setPressed(boolean):void");
        }

        public final void setRippleColor(Integer num) {
            this.rippleColor = num;
            this.needBackgroundUpdate = true;
        }

        public final void setRippleRadius(Integer num) {
            this.rippleRadius = num;
            this.needBackgroundUpdate = true;
        }

        public final void setTouched(boolean z2) {
            this.isTouched = z2;
        }

        public final void setUseBorderlessDrawable(boolean z2) {
            this.useBorderlessDrawable = z2;
        }

        public final void setUseDrawableOnForeground(boolean z2) {
            this.useDrawableOnForeground = z2;
            this.needBackgroundUpdate = true;
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean shouldCancelRootViewGestureHandlerIfNecessary() {
            return NativeViewGestureHandler.NativeViewGestureHandlerHook.DefaultImpls.shouldCancelRootViewGestureHandlerIfNecessary(this);
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public Boolean shouldRecognizeSimultaneously(GestureHandler<?> gestureHandler) {
            return NativeViewGestureHandler.NativeViewGestureHandlerHook.DefaultImpls.shouldRecognizeSimultaneously(this, gestureHandler);
        }

        public final void updateBackground() throws Throwable {
            if (this.needBackgroundUpdate) {
                this.needBackgroundUpdate = false;
                if (this._backgroundColor == 0) {
                    setBackground(null);
                }
                setForeground(null);
                Drawable drawableCreateSelectableDrawable = createSelectableDrawable();
                Drawable drawableCreateBorderDrawable = createBorderDrawable();
                if (getHasBorderRadii() && (drawableCreateSelectableDrawable instanceof RippleDrawable)) {
                    PaintDrawable paintDrawable = new PaintDrawable(-1);
                    paintDrawable.setCornerRadii(buildBorderRadii());
                    ((RippleDrawable) drawableCreateSelectableDrawable).setDrawableByLayerId(R.id.mask, paintDrawable);
                }
                if (this.useDrawableOnForeground) {
                    setForeground(drawableCreateSelectableDrawable);
                    int i2 = this._backgroundColor;
                    if (i2 != 0) {
                        updateBackgroundColor(i2, drawableCreateBorderDrawable, null);
                        return;
                    }
                    return;
                }
                int i3 = this._backgroundColor;
                if (i3 == 0 && this.rippleColor == null) {
                    setBackground(new LayerDrawable(new Drawable[]{drawableCreateSelectableDrawable, drawableCreateBorderDrawable}));
                } else {
                    updateBackgroundColor(i3, drawableCreateBorderDrawable, drawableCreateSelectableDrawable);
                }
            }
        }

        @Override // com.swmansion.gesturehandler.core.NativeViewGestureHandler.NativeViewGestureHandlerHook
        public boolean wantsToHandleEventBeforeActivation() {
            return NativeViewGestureHandler.NativeViewGestureHandlerHook.DefaultImpls.wantsToHandleEventBeforeActivation(this);
        }
    }

    @InterfaceC1492Gx
    @Metadata(bv = {}, d1 = {"Я\u0014\u001d<K!&i\u000eӵLcz\u0004I\u0006>\u00176Ȑ\u0005ӳ-(Մ7f\u00198pIkH¯VS8\u000f<\bB%s$ E\u0012٬lԥ&\tWȞ˝kq"}, d2 = {"\u001ab^:\":P[\u0015\b\tb6\u0006R1e\u000e7\fM\u0001\u001a\u0013Pn\u0015<\u0004nBYy\u001eF7\u0003\u0017/CIzD+\u0015K]B\u0006j,[S7V[X5MVrO{\u000ec\nP+\u001aC7K,y@@#\u00125\u001f", "", "u(E", " D0\u0010G&\u001c:tlh", "", "@dP0gsGO(\u0003\f^s~\t=t\u00105{\b\u0004\u0013 Fv\u000eIp25`}\u001cEm"}, k = 1, mv = {1, 9, 0}, pn = "", xi = 48, xs = "")
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ButtonViewGroup createViewInstance(ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ButtonViewGroup(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<ButtonViewGroup> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ButtonViewGroup view) throws Throwable {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        view.updateBackground();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003Pb\u0005\u0003:\u001d\u000ed:\u0013%mnm")
    public void setBackgroundColor(ButtonViewGroup view, int i2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackgroundColor(i2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003^q}\u0001:o\bjJ?#MdaQ|\u0006P\u0011\\.")
    public void setBorderBottomLeftRadius(ButtonViewGroup view, float f2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderBottomLeftRadius(f2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003^q}\u0001:o\bjJ?#ShbE\u001fvM\fP0\u001c")
    public void setBorderBottomRightRadius(ButtonViewGroup view, float f2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderBottomRightRadius(f2);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003^q}\u0001:p\bbEB")
    public void setBorderColor(ButtonViewGroup view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderColor(num);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003^q}\u0001:\u007fyZ?E)")
    public void setBorderRadius(ButtonViewGroup view, float f2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderRadius(f2);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003^q}\u0001:\u0001\roB5")
    public void setBorderStyle(ButtonViewGroup view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderStyle(str);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003^q}\u0001:\u0002\bf\"5\u001cuQ\\A\u0014\u001a_")
    public void setBorderTopLeftRadius(ButtonViewGroup view, float f2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderTopLeftRadius(f2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003^q}\u0001:\u0002\bf(9\u001disM>\u000f\u000ea\u001b")
    public void setBorderTopRightRadius(ButtonViewGroup view, float f2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderTopRightRadius(f2);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003^q}\u0001:\u0005\u0002ZJ8")
    public void setBorderWidth(ButtonViewGroup view, float f2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBorderWidth(f2);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0003^q}\u0001:\u001a}iI")
    public void setBorderless(ButtonViewGroup view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setUseBorderlessDrawable(z2);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0006]`{\b-\u0012")
    public void setEnabled(ButtonViewGroup view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setEnabled(z2);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0006gb\u0006\u0011;\u0017\u000f[")
    public void setExclusive(ButtonViewGroup view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setExclusive(z2);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0007^q~\u0003:\u001d\u000ed:")
    public void setForeground(ButtonViewGroup view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setUseDrawableOnForeground(z2);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Xo\n\b-p\bbEB")
    public void setRippleColor(ButtonViewGroup view, Integer num) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRippleColor(num);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0013Xo\n\b-\u007fyZ?E)")
    public void setRippleRadius(ButtonViewGroup view, int i2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRippleRadius(Integer.valueOf(i2));
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @InterfaceC1492Gx
    @ReactProp(customType = ">pgAIg_>{\u0006\u0019Dh_e\u000b", name = "\u0015^t|\u0004\u001b\u001d\u000ed:\u0014\u001ft`]I\u0010\t")
    public void setTouchSoundDisabled(ButtonViewGroup view, boolean z2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setSoundEffectsEnabled(!z2);
    }
}
